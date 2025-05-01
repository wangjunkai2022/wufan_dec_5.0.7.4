package cn.sharesdk.framework.utils;

import android.text.TextUtils;
import com.mob.tools.utils.DH;
/* compiled from: ShareSDKDH.java */
/* loaded from: classes2.dex */
public class h {
    public static String a() {
        try {
            String oSLanguage = DH.SyncMtd.getOSLanguage();
            if (TextUtils.isEmpty(oSLanguage)) {
                SSDKLog.b().a("osl null", new Object[0]);
                return "";
            }
            return oSLanguage;
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            return "";
        }
    }

    public static String b() {
        try {
            String oSCountry = DH.SyncMtd.getOSCountry();
            if (TextUtils.isEmpty(oSCountry)) {
                SSDKLog.b().a("osc null", new Object[0]);
                return "";
            }
            return oSCountry;
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            return "";
        }
    }
}
