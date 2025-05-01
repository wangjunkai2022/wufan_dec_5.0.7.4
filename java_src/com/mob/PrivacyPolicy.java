package com.mob;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.mob.commons.m;
import com.mob.commons.u;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.ClassKeeper;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.UIHandler;
import java.io.Serializable;
import java.util.Locale;
import org.json.JSONObject;
@Deprecated
/* loaded from: classes5.dex */
public class PrivacyPolicy implements ClassKeeper, PublicMemberKeeper, Serializable {
    public static final int POLICY_TYPE_TXT = 2;
    public static final int POLICY_TYPE_URL = 1;

    /* renamed from: a  reason: collision with root package name */
    private String f56011a;

    /* renamed from: b  reason: collision with root package name */
    private String f56012b;

    /* renamed from: c  reason: collision with root package name */
    private int f56013c;

    /* renamed from: d  reason: collision with root package name */
    private long f56014d;

    /* loaded from: classes5.dex */
    public interface OnPolicyListener extends ClassKeeper, PublicMemberKeeper {
        void onComplete(PrivacyPolicy privacyPolicy);

        void onFailure(Throwable th);
    }

    public PrivacyPolicy() {
    }

    private String a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String a5 = u.a();
            return new String(Data.AES128Decode(Data.rawMD5(a5 + ":" + DH.SyncMtd.getPackageName() + ":" + getTimestamp()), Base64.decode(str, 0)), "UTF-8");
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return null;
        }
    }

    public static PrivacyPolicy getPrivacyPolicy(int i4, Locale locale) throws Throwable {
        return null;
    }

    @Deprecated
    public static void getPrivacyPolicyAsync(int i4, OnPolicyListener onPolicyListener) {
        getPrivacyPolicyAsync(i4, null, onPolicyListener);
    }

    public String getContent() {
        return this.f56012b;
    }

    public int getPpVersion() {
        return this.f56013c;
    }

    public long getTimestamp() {
        return this.f56014d;
    }

    public String getTitle() {
        return this.f56011a;
    }

    public void setContent(String str) {
        this.f56012b = str;
    }

    public void setPpVersion(int i4) {
        this.f56013c = i4;
    }

    public void setTimestamp(long j4) {
        this.f56014d = j4;
    }

    public void setTitle(String str) {
        this.f56011a = str;
    }

    public PrivacyPolicy(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            setTimestamp(jSONObject.optLong(m.a("009g]bgbdQd)dg0gb$bdEh")));
            setTitle(a(jSONObject.optString("title")));
            setContent(a(jSONObject.optString(m.a("007a(bi]cgdcg"))));
            String a5 = a(jSONObject.optString("ppVersion"));
            if (TextUtils.isEmpty(a5)) {
                return;
            }
            setPpVersion(Integer.parseInt(a5.trim()));
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }

    @Deprecated
    public static void getPrivacyPolicyAsync(int i4, Locale locale, final OnPolicyListener onPolicyListener) {
        if (onPolicyListener != null) {
            final Throwable th = new Throwable("This api is Deprecated, please do not call it");
            UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.PrivacyPolicy.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    OnPolicyListener.this.onFailure(th);
                    return false;
                }
            });
        }
    }
}
