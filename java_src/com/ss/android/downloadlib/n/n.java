package com.ss.android.downloadlib.n;

import java.io.File;
/* loaded from: classes5.dex */
public class n {
    public static long vv(File file) {
        if (file == null || !file.exists()) {
            return 0L;
        }
        return vv(file, file.lastModified(), 0);
    }

    private static long vv(File file, long j4, int i4) {
        File[] listFiles;
        if (file != null && file.exists()) {
            j4 = Math.max(j4, file.lastModified());
            int i5 = i4 + 1;
            if (i5 >= 50) {
                return j4;
            }
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    j4 = Math.max(j4, vv(file2, j4, i5));
                }
            }
        }
        return j4;
    }
}
