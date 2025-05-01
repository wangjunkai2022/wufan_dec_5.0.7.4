package q2;

import android.text.TextUtils;
/* compiled from: SystemPropertiesCompat.java */
/* loaded from: classes5.dex */
public class a {
    public static String a(String str) {
        try {
            return (String) com.overmind.virtual.oem.utils.a.x("android.os.SystemProperties").call("get", str).o();
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static String b(String str, String str2) {
        try {
            return (String) com.overmind.virtual.oem.utils.a.x("android.os.SystemProperties").call("get", str, str2).o();
        } catch (Exception e5) {
            e5.printStackTrace();
            return str2;
        }
    }

    public static int c(String str, int i4) {
        try {
            return ((Integer) com.overmind.virtual.oem.utils.a.x("android.os.SystemProperties").call("getInt", str, Integer.valueOf(i4)).o()).intValue();
        } catch (Exception e5) {
            e5.printStackTrace();
            return i4;
        }
    }

    public static boolean d(String str) {
        return !TextUtils.isEmpty(a(str));
    }
}
