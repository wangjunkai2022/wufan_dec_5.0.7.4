package m1;

import com.huaksj.vasdolly.common.V1SchemeUtil;
import com.huaksj.vasdolly.common.d;
import com.huaksj.vasdolly.common.e;
import java.io.File;
import java.io.PrintStream;
/* compiled from: ChannelReader.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f71513a = "wf_channel";

    public static boolean a(File file) {
        if (file != null && file.exists() && file.isFile()) {
            return V1SchemeUtil.b(file);
        }
        return false;
    }

    public static boolean b(File file) {
        if (file != null && file.exists() && file.isFile()) {
            return d.a(file);
        }
        return false;
    }

    public static boolean c(File file) {
        if (file != null && file.exists() && file.isFile()) {
            return e.a(file);
        }
        return false;
    }

    public static String d(File file) {
        try {
            return V1SchemeUtil.f(file);
        } catch (Exception unused) {
            PrintStream printStream = System.out;
            printStream.println("APK : " + file.getAbsolutePath() + " not have channel info from Zip Comment");
            return "";
        }
    }

    public static String e(File file) {
        PrintStream printStream = System.out;
        printStream.println("try to read channel info from apk : " + file.getAbsolutePath());
        return b.d(file, com.huaksj.vasdolly.common.b.f14487a);
    }

    public static boolean f(File file, String str) {
        if (str != null) {
            return str.equals(d(file));
        }
        return false;
    }

    public static boolean g(File file, String str) {
        if (str != null) {
            return str.equals(e(file));
        }
        return false;
    }
}
