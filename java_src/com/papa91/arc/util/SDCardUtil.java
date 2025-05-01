package com.papa91.arc.util;

import android.content.Context;
import android.os.Environment;
/* loaded from: classes5.dex */
public class SDCardUtil {
    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory() + "";
    }

    public static String getExternalStorageDirectory(Context context) {
        if (context == null) {
            return getExternalStorageDirectory();
        }
        if (context.getExternalFilesDir("") == null) {
            return getExternalStorageDirectory();
        }
        if (context.getExternalFilesDir("") != null) {
            return context.getExternalFilesDir("").getAbsolutePath();
        }
        return getExternalStorageDirectory();
    }
}
