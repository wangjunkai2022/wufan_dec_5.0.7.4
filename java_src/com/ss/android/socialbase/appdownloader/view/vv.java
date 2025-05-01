package com.ss.android.socialbase.appdownloader.view;

import android.app.Fragment;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.socialbase.appdownloader.o.i;
import com.ss.android.socialbase.downloader.constants.o;
import com.ss.android.socialbase.downloader.downloader.p;
/* loaded from: classes5.dex */
public class vv extends Fragment {
    public static Intent i() {
        return new Intent("android.settings.APPLICATION_SETTINGS");
    }

    private Context o() {
        Context ky = p.ky();
        return (ky != null || getActivity() == null || getActivity().isFinishing()) ? ky : getActivity().getApplicationContext();
    }

    private Intent u() {
        Context o4 = o();
        if (o4 == null) {
            return null;
        }
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        String packageName = o4.getPackageName();
        intent.putExtra("package", packageName);
        intent.putExtra("android.provider.extra.APP_PACKAGE", packageName);
        intent.putExtra("app_package", packageName);
        int i4 = o4.getApplicationInfo().uid;
        intent.putExtra("uid", i4);
        intent.putExtra("app_uid", i4);
        return intent;
    }

    public Intent m() {
        Context o4 = o();
        if (o4 == null) {
            return null;
        }
        String packageName = o4.getPackageName();
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.contains(o.f60949p)) {
                Intent intent = new Intent();
                intent.putExtra("packageName", packageName);
                intent.setComponent(new ComponentName("com.color.safecenter", "com.color.safecenter.permission.PermissionManagerActivity"));
                return intent;
            } else if (lowerCase.contains("vivo")) {
                Intent intent2 = new Intent();
                intent2.putExtra("packagename", packageName);
                if (Build.VERSION.SDK_INT >= 25) {
                    intent2.setComponent(new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"));
                } else {
                    intent2.setComponent(new ComponentName("com.iqoo.secure", "com.iqoo.secure.safeguard.SoftPermissionDetailActivity"));
                }
                return intent2;
            } else if (lowerCase.contains("meizu") && Build.VERSION.SDK_INT < 25) {
                Intent intent3 = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                intent3.putExtra("packageName", packageName);
                intent3.setComponent(new ComponentName("com.meizu.safe", "com.meizu.safe.security.AppSecActivity"));
                return intent3;
            }
        }
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + o4.getPackageName()));
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i.vv()) {
            i.vv(true);
        } else {
            i.vv(false);
        }
    }

    public Intent p() {
        Context o4 = o();
        if (o4 == null) {
            return null;
        }
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + o4.getPackageName()));
    }

    public void vv() {
        try {
            try {
                try {
                    startActivityForResult(u(), 1000);
                } catch (Throwable unused) {
                    startActivityForResult(p(), 1000);
                }
            } catch (Throwable unused2) {
                startActivityForResult(i(), 1000);
            }
        } catch (Throwable unused3) {
            startActivityForResult(m(), 1000);
        }
    }
}
