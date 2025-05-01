package com.kwad.sdk.api.loader;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class i {
    private static File anG;
    private static final String anH;

    static {
        anH = yn() ? "dynamic_apk" : "dynamic.apk";
    }

    private static File aP(Context context) {
        if (anG == null) {
            anG = i(new File(context.getApplicationInfo().dataDir, "ksad_dynamic"));
        }
        return anG;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(File file) {
        if (file == null) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                h(file2);
            }
        }
        file.delete();
    }

    private static File i(File file) {
        if (file.exists() && file.isFile()) {
            file.delete();
        }
        if (file.exists() && file.isDirectory()) {
            return file;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!(file.exists() && file.isDirectory()) && com.kwad.sdk.api.a.md.booleanValue()) {
            throw new RuntimeException("Can not ensureDir:" + file);
        }
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(File file) {
        try {
            h(file);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File r(Context context, String str) {
        File aP = aP(context);
        return new File(aP, "dynamic-" + System.currentTimeMillis() + "-" + str + ".apk");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String s(Context context, String str) {
        File aP = aP(context);
        return i(new File(aP, "apk-" + str)).getPath();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File t(Context context, String str) {
        File aP = aP(context);
        return i(new File(aP, "apk-" + str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String u(Context context, String str) {
        return new File(s(context, str), anH).getPath();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String v(Context context, String str) {
        return i(new File(s(context, str), "dex")).getPath();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String w(Context context, String str) {
        return i(new File(s(context, str), "libs")).getPath();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void x(final Context context, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.kwad.sdk.api.a.a.a(new com.kwad.sdk.api.a.b() { // from class: com.kwad.sdk.api.loader.i.1
            @Override // com.kwad.sdk.api.a.b
            public final void doTask() {
                try {
                    File[] listFiles = i.t(context, str).getParentFile().listFiles();
                    if (listFiles == null || listFiles.length <= 0) {
                        return;
                    }
                    for (File file : listFiles) {
                        if (h.K(str, file.getName().substring(file.getName().indexOf("-") + 1))) {
                            i.h(file);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    private static boolean yn() {
        int i4 = Build.VERSION.SDK_INT;
        return i4 == 30 || i4 == 31 || i4 == 32;
    }
}
