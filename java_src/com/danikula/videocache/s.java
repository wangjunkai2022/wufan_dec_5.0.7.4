package com.danikula.videocache;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import java.io.File;
/* compiled from: StorageUtils.java */
/* loaded from: classes2.dex */
final class s {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10142a = "video-cache";

    s() {
    }

    private static File a(Context context, boolean z4) {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (NullPointerException unused) {
            str = "";
        }
        File b5 = (z4 && "mounted".equals(str) && Build.VERSION.SDK_INT <= 28) ? b(context) : null;
        if (b5 == null) {
            b5 = context.getCacheDir();
        }
        if (b5 == null) {
            String str2 = "/data/data/" + context.getPackageName() + "/cache/";
            h.j("Can't define system cache directory! '" + str2 + "%s' will be used.");
            return new File(str2);
        }
        return b5;
    }

    private static File b(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), "cache");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        h.j("Unable to create external cache directory");
        return null;
    }

    public static File c(Context context) {
        return new File(a(context, true), f10142a);
    }
}
