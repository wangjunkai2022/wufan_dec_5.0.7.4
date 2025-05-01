package cn.sharesdk.framework.utils;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import android.view.View;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.framework.utils.k;
import com.mob.MobSDK;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.ReflectHelper;
/* compiled from: ShareSDKUtils.java */
/* loaded from: classes2.dex */
public class i {
    public static void a() {
        k.a(new k.a() { // from class: cn.sharesdk.framework.utils.i.1
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() {
                try {
                    DH.SyncMtd.getBrand();
                } catch (Throwable unused) {
                    SSDKLog.b().a("DH F", new Object[0]);
                }
            }
        });
    }

    private static int b() {
        try {
            return ((Integer) ReflectHelper.invokeStaticMethod(ReflectHelper.importClass("android.os.UserHandle"), "getUserId", new Object[]{Integer.valueOf(Process.myUid())}, new Class[]{Integer.TYPE})).intValue();
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            return 0;
        }
    }

    public static String a(String str) {
        if (str != null) {
            str = str.replace(' ', '+');
        }
        try {
            return Data.AES128Decode(ShareSDK.SDK_TAG, Base64.decode(str, 2)).trim();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static PackageInfo a(String str, int i4) {
        try {
            if (b() > 0) {
                SSDKLog.b().b("checkUidPinfo");
                return MobSDK.getContext().getPackageManager().getPackageInfo(str, i4);
            }
            return null;
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            return null;
        }
    }

    public static void a(View view) {
        try {
            if (Build.VERSION.SDK_INT >= 35) {
                view.setFitsSystemWindows(true);
            }
        } catch (Throwable th) {
            SSDKLog.b().a(th);
        }
    }
}
