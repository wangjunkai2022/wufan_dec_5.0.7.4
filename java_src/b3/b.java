package b3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
/* compiled from: ProtoUtils.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f247a = "1OoQD6f6G6KQ6xSW70qKhkI1CncmjOVT";

    public static String a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            int i4 = packageInfo.versionCode;
            String str = packageInfo.versionName;
            return i4 + "_" + str;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return "1_1.0";
        }
    }
}
