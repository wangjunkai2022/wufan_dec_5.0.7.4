package j1;

import java.io.File;
import java.util.Map;
/* compiled from: ChannelUtil.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f69562a = 2;

    /* renamed from: b  reason: collision with root package name */
    public static final String f69563b = "1.2";

    public static k1.a a(File file) {
        try {
            return l1.a.d(file);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static void b(File file) {
        try {
            l1.b.l(file);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void c(File file, String str, Map<String, String> map) {
        try {
            l1.b.m(file, str, map);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
