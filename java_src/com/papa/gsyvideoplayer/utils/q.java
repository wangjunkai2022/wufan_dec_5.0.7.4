package com.papa.gsyvideoplayer.utils;

import android.content.Context;
import android.os.Environment;
import java.io.File;
/* compiled from: StorageUtils.java */
/* loaded from: classes5.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private static final String f58604a = "video-cache";

    private static File a(Context context, boolean z4) {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (NullPointerException unused) {
            str = "";
        }
        File b5 = (z4 && "mounted".equals(str)) ? b(context) : null;
        if (b5 == null) {
            b5 = context.getCacheDir();
        }
        if (b5 == null) {
            return new File("/data/data/" + context.getPackageName() + "/cache/");
        }
        return b5;
    }

    private static File b(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), "cache");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static File c(Context context) {
        return new File(a(context, true), f58604a);
    }
}
