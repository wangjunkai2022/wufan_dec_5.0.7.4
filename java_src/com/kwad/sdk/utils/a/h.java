package com.kwad.sdk.utils.a;

import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import sun.misc.Unsafe;
/* loaded from: classes5.dex */
final class h {

    /* loaded from: classes5.dex */
    static class a {
        static final SecureRandom aTo = new SecureRandom();
        static final char[] aTp = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String OB() {
        byte[] bArr = new byte[16];
        a.aTo.nextBytes(bArr);
        char[] cArr = new char[32];
        for (int i4 = 0; i4 < 16; i4++) {
            byte b5 = bArr[i4];
            int i5 = i4 << 1;
            char[] cArr2 = a.aTp;
            cArr[i5] = cArr2[(b5 >> 4) & 15];
            cArr[i5 + 1] = cArr2[b5 & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int OC() {
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = Unsafe.class.getDeclaredMethod("pageSize", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(declaredField.get(null), new Object[0])).intValue();
        } catch (Throwable unused) {
            return 4096;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(File file, byte[] bArr, int i4) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, net.lingala.zip4j.util.e.f71861e0);
        int i5 = 0;
        while (i5 < i4) {
            try {
                int read = randomAccessFile.read(bArr, i5, i4 - i5);
                if (read < 0) {
                    break;
                }
                i5 += read;
            } finally {
                closeQuietly(randomAccessFile);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean ae(File file) {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] af(File file) {
        if (file.isFile()) {
            long length = file.length();
            if ((length >> 32) == 0) {
                int i4 = (int) length;
                byte[] bArr = new byte[i4];
                a(file, bArr, i4);
                return bArr;
            }
            throw new IllegalArgumentException("file too large, path:" + file.getPath());
        }
        return null;
    }

    private static void ag(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                ag(file2);
            }
        }
        file.delete();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int binarySearch(int[] iArr, int i4) {
        int length = (iArr.length >> 1) - 1;
        int i5 = 0;
        while (i5 <= length) {
            int i6 = (i5 + length) >>> 1;
            int i7 = iArr[i6 << 1];
            if (i7 < i4) {
                i5 = i6 + 1;
            } else if (i7 <= i4) {
                return i6;
            } else {
                length = i6 - 1;
            }
        }
        return length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(File file) {
        try {
            if (file.exists()) {
                ag(file);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(File file, byte[] bArr) {
        File file2;
        try {
            String parent = file.getParent();
            file2 = new File(parent, file.getName() + ".tmp");
        } catch (Exception unused) {
        }
        if (ae(file2)) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, net.lingala.zip4j.util.e.f71861e0);
            randomAccessFile.setLength(bArr.length);
            randomAccessFile.write(bArr);
            closeQuietly(randomAccessFile);
            if (!file.exists() || file.delete()) {
                return file2.renameTo(file);
            }
            return false;
        }
        return false;
    }
}
