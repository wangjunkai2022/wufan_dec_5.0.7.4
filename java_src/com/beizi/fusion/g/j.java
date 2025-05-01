package com.beizi.fusion.g;

import android.content.Context;
import android.os.Build;
import java.io.File;
/* compiled from: BeiZiStorageUtils.java */
/* loaded from: classes2.dex */
public class j {
    public static File a(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                return context.getFilesDir();
            }
            return context.getFilesDir();
        } catch (Exception unused) {
            return context.getFilesDir();
        }
    }

    public static File b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                return context.getCacheDir();
            }
            return context.getCacheDir();
        } catch (Exception unused) {
            return context.getCacheDir();
        }
    }
}
