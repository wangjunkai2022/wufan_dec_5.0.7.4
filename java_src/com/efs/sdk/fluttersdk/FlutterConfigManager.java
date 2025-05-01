package com.efs.sdk.fluttersdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.config.GlobalInfoManager;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.join.mgps.activity.SimulatorExitPlayActivity_;
import com.umeng.analytics.pro.bm;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
/* loaded from: classes2.dex */
public class FlutterConfigManager {

    /* renamed from: c  reason: collision with root package name */
    private EfsReporter f10443c;

    /* renamed from: i  reason: collision with root package name */
    private Context f10449i;

    /* renamed from: a  reason: collision with root package name */
    private final String f10441a = "FlutterConfigManager";

    /* renamed from: b  reason: collision with root package name */
    private final int f10442b = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f10444d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f10445e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f10446f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f10447g = 0;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10448h = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f10450j = false;

    public FlutterConfigManager(Context context, EfsReporter efsReporter) {
        this.f10449i = context;
        this.f10443c = efsReporter;
        efsReporter.getAllSdkConfig(new String[]{"flutter_pv_sampling_rate", "flutter_pv_max_count", "flutter_dart_exception_state", "flutter_dart_exception_max_count"}, new IConfigCallback() { // from class: com.efs.sdk.fluttersdk.FlutterConfigManager.1
            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                try {
                    Object obj = map.get("flutter_pv_sampling_rate");
                    if (obj != null) {
                        FlutterConfigManager.this.f10444d = Integer.parseInt(obj.toString());
                        FlutterConfigManager flutterConfigManager = FlutterConfigManager.this;
                        flutterConfigManager.f10448h = FlutterConfigManager.a(flutterConfigManager.f10444d);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                try {
                    Object obj2 = map.get("flutter_pv_max_count");
                    if (obj2 != null) {
                        FlutterConfigManager.this.f10445e = Integer.parseInt(obj2.toString());
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                try {
                    Object obj3 = map.get("flutter_dart_exception_state");
                    if (obj3 != null) {
                        FlutterConfigManager.this.f10446f = Integer.parseInt(obj3.toString());
                    }
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
                try {
                    Object obj4 = map.get("flutter_dart_exception_max_count");
                    if (obj4 != null) {
                        FlutterConfigManager.this.f10447g = Integer.parseInt(obj4.toString());
                    }
                } catch (Throwable th4) {
                    th4.printStackTrace();
                }
                FlutterConfigManager.b(FlutterConfigManager.this);
            }
        });
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

    static /* synthetic */ boolean b(FlutterConfigManager flutterConfigManager) {
        flutterConfigManager.f10450j = true;
        return true;
    }

    public Map<String, Object> getCloudConfig() {
        if (this.f10450j) {
            HashMap hashMap = new HashMap();
            hashMap.put("flutter_pv_max_count", Integer.valueOf(this.f10445e));
            hashMap.put("flutter_dart_exception_state", Integer.valueOf(this.f10446f));
            hashMap.put("flutter_dart_exception_max_count", Integer.valueOf(this.f10447g));
            hashMap.put("flutter_pv_sampling_hit", Boolean.valueOf(this.f10448h));
            return hashMap;
        }
        return null;
    }

    public Map<String, Object> getNativeParams() {
        long blockSize;
        long blockCount;
        long availableBlocks;
        HashMap hashMap = null;
        if (!this.f10450j) {
            return null;
        }
        try {
            HashMap hashMap2 = new HashMap();
            try {
                Intent registerReceiver = this.f10449i.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                hashMap2.put(bm.Z, Integer.valueOf(registerReceiver.getIntExtra(SimulatorExitPlayActivity_.O, 0)));
                hashMap2.put("temperature", Integer.valueOf(registerReceiver.getIntExtra("temperature", 0)));
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                if (Build.VERSION.SDK_INT >= 18) {
                    blockSize = statFs.getBlockSizeLong();
                    blockCount = statFs.getBlockCountLong() * blockSize;
                    availableBlocks = statFs.getAvailableBlocksLong();
                } else {
                    blockSize = statFs.getBlockSize();
                    blockCount = statFs.getBlockCount() * blockSize;
                    availableBlocks = statFs.getAvailableBlocks();
                }
                long j4 = availableBlocks * blockSize;
                Locale locale = Locale.getDefault();
                Object[] objArr = new Object[1];
                double d5 = j4;
                double d6 = blockCount;
                Double.isNaN(d5);
                Double.isNaN(d6);
                objArr[0] = Double.valueOf((d5 / d6) * 100.0d);
                hashMap2.put("disk_ratio", String.format(locale, "%.2f", objArr));
                hashMap2.putAll(GlobalInfoManager.getInstance().getGlobalInfo().getGlobalInfoMap());
                hashMap2.putAll(ControllerCenter.getGlobalEnvStruct().getPublicParamMap());
                return hashMap2;
            } catch (Throwable unused) {
                hashMap = hashMap2;
                return hashMap;
            }
        } catch (Throwable unused2) {
        }
    }

    public boolean isFlutterEnable() {
        return this.f10448h;
    }
}
