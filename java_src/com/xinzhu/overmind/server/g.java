package com.xinzhu.overmind.server;

import android.os.Environment;
import android.util.ArrayMap;
import androidx.annotation.VisibleForTesting;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.xinzhu.overmind.utils.v;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: MindSystemConfig.java */
/* loaded from: classes6.dex */
public class g {

    /* renamed from: b  reason: collision with root package name */
    static final String f67978b = "MindSystemConfig";

    /* renamed from: c  reason: collision with root package name */
    static g f67979c = null;

    /* renamed from: d  reason: collision with root package name */
    private static final int f67980d = 2;

    /* renamed from: e  reason: collision with root package name */
    private static final int f67981e = -1;

    /* renamed from: a  reason: collision with root package name */
    final ArrayMap<String, b> f67982a = new ArrayMap<>();

    /* compiled from: MindSystemConfig.java */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f67983a;

        /* renamed from: b  reason: collision with root package name */
        public int[] f67984b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f67985c;

        a(String str, boolean z4) {
            this.f67983a = str;
            this.f67985c = z4;
        }
    }

    /* compiled from: MindSystemConfig.java */
    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f67986a;

        /* renamed from: b  reason: collision with root package name */
        public final String f67987b;

        /* renamed from: c  reason: collision with root package name */
        public final String[] f67988c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f67989d;

        b(String str, String str2, String[] strArr) {
            this(str, str2, strArr, false);
        }

        b(String str, String str2, String[] strArr, boolean z4) {
            this.f67986a = str;
            this.f67987b = str2;
            this.f67988c = strArr;
            this.f67989d = z4;
        }
    }

    g() {
        d();
        h();
    }

    public static g a() {
        g gVar;
        synchronized (g.class) {
            if (f67979c == null) {
                f67979c = new g();
            }
            gVar = f67979c;
        }
        return gVar;
    }

    private void c(String str, File file, XmlPullParser xmlPullParser) {
        v.j(f67978b, SimpleComparison.LESS_THAN_OPERATION + str + "> not allowed in partition of " + file + " at " + xmlPullParser.getPositionDescription());
    }

    private void d() {
        e(com.xinzhu.overmind.a.a(Environment.getRootDirectory(), "etc", "permissions"), -1);
        e(com.xinzhu.overmind.a.a(new File("/vendor"), "etc", "permissions"), -1);
        e(com.xinzhu.overmind.a.a(new File("/odm"), "etc", "permissions"), -1);
        e(com.xinzhu.overmind.a.a(new File("/oem"), "etc", "permissions"), -1);
        e(com.xinzhu.overmind.a.a(new File("/product"), "etc", "permissions"), -1);
        e(com.xinzhu.overmind.a.a(new File("/system_ext"), "etc", "permissions"), -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
        com.xinzhu.overmind.utils.w.c(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f(java.io.File r13, int r14) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xinzhu.overmind.server.g.f(java.io.File, int):void");
    }

    private void g(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (!readLine.isEmpty() && !readLine.startsWith("#")) {
                        String str = readLine.trim().split(" ")[0];
                        b bVar = new b(str, str, new String[0], true);
                        this.f67982a.put(bVar.f67986a, bVar);
                    }
                } else {
                    bufferedReader.close();
                    return;
                }
            }
        } catch (IOException e5) {
            v.k(f67978b, "Failed to read public libraries file " + file, e5);
        }
    }

    private void h() {
        g(new File("/vendor/etc/public.libraries.txt"));
        String[] strArr = {"/system/etc", "/system_ext/etc", "/product/etc"};
        for (int i4 = 0; i4 < 3; i4++) {
            String str = strArr[i4];
            File[] listFiles = new File(str).listFiles();
            if (listFiles == null) {
                v.j(f67978b, "Public libraries file folder missing: " + str);
            } else {
                for (File file : listFiles) {
                    String name = file.getName();
                    if (name.startsWith("public.libraries-") && name.endsWith(".txt")) {
                        g(file);
                    }
                }
            }
        }
    }

    public ArrayMap<String, b> b() {
        return this.f67982a;
    }

    @VisibleForTesting
    public void e(File file, int i4) {
        File[] listFiles;
        if (!file.exists() || !file.isDirectory()) {
            if (i4 == -1) {
                v.j(f67978b, "No directory " + file + ", skipping");
            }
        } else if (file.canRead()) {
            File file2 = null;
            for (File file3 : file.listFiles()) {
                if (file3.isFile()) {
                    if (file3.getPath().endsWith("etc/permissions/platform.xml")) {
                        file2 = file3;
                    } else if (!file3.getPath().endsWith(".xml")) {
                        v.e(f67978b, "Non-xml file " + file3 + " in " + file + " directory, ignoring");
                    } else if (file3.canRead()) {
                        f(file3, i4);
                    } else {
                        v.j(f67978b, "Permissions library file " + file3 + " cannot be read");
                    }
                }
            }
            if (file2 != null) {
                f(file2, i4);
            }
        } else {
            v.j(f67978b, "Directory " + file + " cannot be read");
        }
    }
}
