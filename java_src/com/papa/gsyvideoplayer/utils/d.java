package com.papa.gsyvideoplayer.utils;

import android.graphics.Bitmap;
import android.os.Environment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
/* compiled from: FileUtils.java */
/* loaded from: classes5.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f58404a = Environment.getExternalStorageDirectory().getPath();

    /* renamed from: b  reason: collision with root package name */
    public static final String f58405b = "GSYVideo";

    /* renamed from: c  reason: collision with root package name */
    public static final String f58406c = "GSYVideoTest";

    public static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (!file2.isDirectory() && file2.exists()) {
                    try {
                        file2.delete();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }
        }
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f58404a);
        String str2 = File.separator;
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String c() {
        String b5 = b(f58405b);
        File file = new File(b5);
        if (!file.exists()) {
            file.mkdirs();
        }
        return b5;
    }

    public static String d() {
        String b5 = b(f58406c);
        File file = new File(b5);
        if (!file.exists()) {
            file.mkdirs();
        }
        return b5;
    }

    public static void e(Bitmap bitmap, File file) {
        if (bitmap != null) {
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(file));
                bitmap.recycle();
            } catch (FileNotFoundException e5) {
                e5.printStackTrace();
            }
        }
    }
}
