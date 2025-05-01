package m;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.data.c;
import com.xinzhu.overmind.utils.u;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static b f71503b;

    /* renamed from: a  reason: collision with root package name */
    public Context f71504a;

    private b() {
    }

    private static String a(String[] strArr) {
        Process process;
        String str = "";
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(strArr);
            processBuilder.redirectErrorStream(false);
            process = processBuilder.start();
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(process.getOutputStream());
                str = new DataInputStream(process.getInputStream()).readLine();
                dataOutputStream.writeBytes(u.f68415c);
                dataOutputStream.flush();
                process.waitFor();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            process = null;
        }
        try {
            process.destroy();
        } catch (Exception unused3) {
            return str;
        }
    }

    public static b b() {
        if (f71503b == null) {
            f71503b = new b();
        }
        return f71503b;
    }

    public static boolean d() {
        String[] strArr = {"/system/xbin/", "/system/bin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        for (int i4 = 0; i4 < 5; i4++) {
            try {
                String str = strArr[i4] + "su";
                if (new File(str).exists()) {
                    String a5 = a(new String[]{"ls", "-l", str});
                    if (!TextUtils.isEmpty(a5)) {
                        if (a5.indexOf("root") != a5.lastIndexOf("root")) {
                            return true;
                        }
                    }
                    return false;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private Context f() {
        return this.f71504a;
    }

    private static c g() {
        return c.a();
    }

    public final void c(Context context) {
        this.f71504a = context.getApplicationContext();
    }

    public final String e() {
        try {
            return com.ta.utdid2.device.c.a(this.f71504a);
        } catch (Throwable unused) {
            return "";
        }
    }
}
