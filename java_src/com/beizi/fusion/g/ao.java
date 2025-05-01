package com.beizi.fusion.g;

import java.io.File;
/* compiled from: SDCardHelper.java */
/* loaded from: classes2.dex */
public class ao {

    /* renamed from: a  reason: collision with root package name */
    private static String f6901a = "extra";

    public static void a(File file) {
        try {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    for (File file2 : listFiles) {
                        a(file2);
                    }
                }
                file.delete();
            } else if (file.exists()) {
                file.delete();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
