package com.vuaukou.vco.hykiiuy;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import dalvik.system.PathClassLoader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final String f64863a = "lib";

    /* renamed from: b  reason: collision with root package name */
    private static final int f64864b = 5;

    /* renamed from: c  reason: collision with root package name */
    private static final int f64865c = 4096;

    private o() {
    }

    private static File a(Context context) {
        return context.getDir(a.auu.a.c("IgwW"), 0);
    }

    private static Object a(Object obj) {
        Field declaredField = Class.forName(a.auu.a.c("KgQYEwgYSz0cBxEEHksMBAcAJRYdDQkVFhI/Ci8BERc=")).getDeclaredField(a.auu.a.c("PgQADS0aFjo="));
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    private static Object a(Object obj, Class cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    private static void a(Context context, File file) {
        boolean z4 = false;
        if (b()) {
            try {
                Field declaredField = Class.forName(a.auu.a.c("KgQYEwgYSz0cBxEEHksMBAcAJRYdDQkVFhI/Ci8BERc=")).getDeclaredField(a.auu.a.c("PgQADS0aFjo="));
                declaredField.setAccessible(true);
                Object obj = declaredField.get((PathClassLoader) context.getClassLoader());
                Field declaredField2 = obj.getClass().getDeclaredField(a.auu.a.c("IAQADBcWKScHBgQTCiEnFxEGFRwXJwAH"));
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(obj);
                if (!(obj2 instanceof Object[])) {
                    if (obj2 instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj2;
                        if (arrayList.indexOf(file) == -1) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                it2.next();
                            }
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(file);
                            arrayList2.addAll(arrayList);
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                it3.next();
                            }
                            declaredField2.set(obj, arrayList2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                File[] fileArr = (File[]) obj2;
                for (Object obj3 : fileArr) {
                    if (obj3 == file || (file != null && file.equals(obj3))) {
                        z4 = true;
                        break;
                    }
                }
                if (z4) {
                    return;
                }
                int length = fileArr.length + 1;
                Object newInstance = Array.newInstance(File.class, length);
                Array.set(newInstance, 0, file);
                for (int i4 = 1; i4 < length; i4++) {
                    Array.set(newInstance, i4, fileArr[i4 - 1]);
                }
                declaredField2.set(obj, newInstance);
            } catch (Exception e5) {
            }
        }
    }

    public static void a(Context context, String str) {
        if (context == null) {
            throw new IllegalArgumentException(a.auu.a.c("CQwCAA9TBiELAAAZB0UnFlQLFB8J"));
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(a.auu.a.c("CQwCAA9TCScHBgQTCkUnFlQACAcNKxdUCxQfCW4KBkUEHhU6HA=="));
        }
        try {
            System.loadLibrary(str);
            new StringBuilder(a.auu.a.c("HRwHEQQeSyIKFQEtGgc8BAYcQQ==")).append(str).append(a.auu.a.c("bhYBBgIWFj0="));
        } catch (UnsatisfiedLinkError e5) {
            new StringBuilder(a.auu.a.c("IgoVAS0aBzwEBhxBFQQnCREBWw==")).append(e5.toString());
            new StringBuilder(a.auu.a.c("HRwHEQQeSyIKFQEtGgc8BAYcQQ==")).append(str).append(a.auu.a.c("bgMVDA0WAQ=="));
            File b5 = b(context, str);
            if (!b5.exists()) {
                c(context, str);
            }
            try {
                System.load(b5.getAbsolutePath());
                new StringBuilder(a.auu.a.c("PAAYDA8YRSIKFQFB")).append(str).append(a.auu.a.c("bhYBBgIWFj0="));
            } catch (UnsatisfiedLinkError e6) {
                new StringBuilder(a.auu.a.c("PAAYDA8YRSIKFQFB")).append(str).append(a.auu.a.c("bgMVDA0WAXQ=")).append(e6.toString());
                try {
                    File file = new File(b5.getParent());
                    if (b()) {
                        try {
                            b(context, file);
                        } catch (Exception e7) {
                        }
                    }
                    System.loadLibrary(str);
                    new StringBuilder(a.auu.a.c("LwIVDA9TCSEEECkIERcvFw1F")).append(str).append(a.auu.a.c("bhYBBgIWFj0="));
                } catch (UnsatisfiedLinkError e8) {
                    new StringBuilder(a.auu.a.c("LwIVDA9TCSEEECkIERcvFw1F")).append(str).append(a.auu.a.c("bgMVDA0WAXQ=")).append(e8.toString());
                }
            }
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e5) {
            }
        }
    }

    private static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    private static boolean a(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (obj2 == obj || (obj != null && obj.equals(obj2))) {
                return true;
            }
        }
        return false;
    }

    private static String[] a() {
        return (Build.VERSION.SDK_INT < 21 || Build.SUPPORTED_ABIS.length <= 0) ? !TextUtils.isEmpty(Build.CPU_ABI2) ? new String[]{Build.CPU_ABI, Build.CPU_ABI2} : new String[]{Build.CPU_ABI} : Build.SUPPORTED_ABIS;
    }

    private static File b(Context context, String str) {
        return new File(context.getDir(a.auu.a.c("IgwW"), 0), System.mapLibraryName(str));
    }

    private static void b(Context context, File file) {
        boolean z4;
        Field declaredField = Class.forName(a.auu.a.c("KgQYEwgYSz0cBxEEHksMBAcAJRYdDQkVFhI/Ci8BERc=")).getDeclaredField(a.auu.a.c("PgQADS0aFjo="));
        declaredField.setAccessible(true);
        Object obj = declaredField.get((PathClassLoader) context.getClassLoader());
        Field declaredField2 = obj.getClass().getDeclaredField(a.auu.a.c("IAQADBcWKScHBgQTCiEnFxEGFRwXJwAH"));
        declaredField2.setAccessible(true);
        Object obj2 = declaredField2.get(obj);
        if (!(obj2 instanceof Object[])) {
            if (obj2 instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj2;
                if (arrayList.indexOf(file) == -1) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(file);
                    arrayList2.addAll(arrayList);
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        it3.next();
                    }
                    declaredField2.set(obj, arrayList2);
                    return;
                }
                return;
            }
            return;
        }
        File[] fileArr = (File[]) obj2;
        for (Object obj3 : fileArr) {
            if (obj3 == file || file.equals(obj3)) {
                z4 = true;
                break;
            }
        }
        z4 = false;
        if (z4) {
            return;
        }
        int length = fileArr.length + 1;
        Object newInstance = Array.newInstance(File.class, length);
        Array.set(newInstance, 0, file);
        for (int i4 = 1; i4 < length; i4++) {
            Array.set(newInstance, i4, fileArr[i4 - 1]);
        }
        declaredField2.set(obj, newInstance);
    }

    private static boolean b() {
        try {
            Class.forName(a.auu.a.c("KgQYEwgYSz0cBxEEHksMBAcAJRYdDQkVFhI/Ci8BERc="));
            return true;
        } catch (ClassNotFoundException e5) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0123, code lost:
        if (r3 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0125, code lost:
        r3.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105 A[Catch: all -> 0x00ce, TryCatch #4 {all -> 0x00ce, blocks: (B:17:0x002a, B:19:0x0030, B:21:0x0035, B:22:0x0038, B:24:0x003e, B:26:0x006d, B:33:0x0095, B:35:0x00c8, B:36:0x00cd, B:42:0x00d6, B:43:0x00db, B:44:0x00dc, B:45:0x00e3, B:53:0x00fc, B:55:0x0105, B:57:0x010b, B:59:0x0115, B:73:0x0145, B:74:0x014b, B:70:0x013b, B:67:0x0130, B:27:0x0070, B:29:0x0078, B:30:0x0087), top: B:97:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(android.content.Context r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vuaukou.vco.hykiiuy.o.c(android.content.Context, java.lang.String):void");
    }
}
