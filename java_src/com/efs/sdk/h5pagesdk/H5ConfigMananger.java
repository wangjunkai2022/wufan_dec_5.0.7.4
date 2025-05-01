package com.efs.sdk.h5pagesdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class H5ConfigMananger {

    /* renamed from: b  reason: collision with root package name */
    private EfsReporter f10456b;
    private Context mContext;
    private final String TAG = "H5ConfigMananger";

    /* renamed from: a  reason: collision with root package name */
    private final int f10455a = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f10457c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10458d = false;

    public H5ConfigMananger(Context context, EfsReporter efsReporter) {
        this.mContext = context;
        this.f10456b = efsReporter;
        efsReporter.getAllSdkConfig(new String[]{"apm_native_h5perf_sampling_rate"}, new IConfigCallback() { // from class: com.efs.sdk.h5pagesdk.H5ConfigMananger.1
            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                try {
                    Object obj = map.get("apm_native_h5perf_sampling_rate");
                    if (obj != null) {
                        H5ConfigMananger.this.f10457c = Integer.parseInt(obj.toString());
                        H5ConfigMananger h5ConfigMananger = H5ConfigMananger.this;
                        h5ConfigMananger.f10458d = H5ConfigMananger.a(h5ConfigMananger.f10457c);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    public String generateLaunchOptions() {
        if (!this.f10458d && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
            if (H5Manager.isDebug) {
                Log.e("H5ConfigMananger", "采样未命中，并且不处于集成测试模式");
                return "";
            }
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sample", this.f10457c);
            if (this.f10458d) {
                jSONObject.put("sampleResult", "Y");
            } else {
                jSONObject.put("sampleResult", "N");
            }
            Context context = this.mContext;
            if (context != null) {
                jSONObject.put(TTDownloadField.TT_APP_NAME, context.getApplicationInfo().packageName);
            }
            jSONObject.put("bridgeVersion", 1);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject.toString();
    }

    public boolean isH5TracerEnable() {
        return this.f10458d;
    }

    public void sendData(final String str) {
        if (this.f10458d || IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
            a.execute(new Runnable() { // from class: com.efs.sdk.h5pagesdk.H5ConfigMananger.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (H5ConfigMananger.this.f10456b == null) {
                        return;
                    }
                    EfsJSONLog efsJSONLog = new EfsJSONLog("nativeh5perf");
                    efsJSONLog.put("wk_native_h5log", str);
                    H5ConfigMananger.this.f10456b.send(efsJSONLog);
                }
            });
        }
    }

    static /* synthetic */ boolean a(int i4) {
        if (SamplingWhiteListUtil.isHitWL()) {
            return true;
        }
        if (i4 != 0) {
            return i4 == 100 || new Random().nextInt(100) <= i4;
        }
        return false;
    }
}
