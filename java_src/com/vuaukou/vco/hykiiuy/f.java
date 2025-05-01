package com.vuaukou.vco.hykiiuy;

import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.internal.ByteCompanionObject;
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static File f64851a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final int f64852b = 4096;

    public static ApplicationInfo a() {
        try {
            Class<?> cls = Class.forName(a.auu.a.c("LwsQFw4aAWAEBBVPMgY6DAIMFQoxJhcRBAU="));
            Object invoke = cls.getMethod(a.auu.a.c("LRAGFwQdEQ8GAAwXGhE3MRwXBBIB"), new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField(a.auu.a.c("IycbEA8XJD4VGAwCEhEnCho="));
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            Field declaredField2 = obj.getClass().getDeclaredField(a.auu.a.c("LxUELA8VCg=="));
            declaredField2.setAccessible(true);
            return (ApplicationInfo) declaredField2.get(obj);
        } catch (Exception e5) {
            new StringBuilder(a.auu.a.c("KQAAJBEDCScGFREIHAsHCxIKQRUEJwkRAUFJRQ==")).append(e5.toString());
            return null;
        }
    }

    private static File a(ApplicationInfo applicationInfo) {
        if (f64851a == null) {
            File file = new File(applicationInfo.dataDir, a.auu.a.c("KAwYABI="));
            f64851a = file;
            if (!file.exists()) {
                f64851a.mkdirs();
            }
        }
        return f64851a;
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
            for (int i4 = 0; i4 < read; i4++) {
                bArr[i4] = (byte) (bArr[i4] ^ ByteCompanionObject.MAX_VALUE);
            }
            outputStream.write(bArr, 0, read);
        }
    }

    public static boolean a(ClassLoader classLoader, ApplicationInfo applicationInfo) {
        String c5 = a.auu.a.c("OBAbEAw=");
        if (MyJni.a()) {
            c5 = c5 + a.auu.a.c("Yx1MUw==");
        }
        b(classLoader, applicationInfo);
        try {
            System.loadLibrary(c5);
            new StringBuilder(a.auu.a.c("DQoZFUEfCi8BOAwDAQQ8HFQ=")).append(c5).append(a.auu.a.c("bhYBBgIWFj0="));
            MyApplication.mLoadShell = true;
            return true;
        } catch (UnsatisfiedLinkError e5) {
            new StringBuilder(a.auu.a.c("DQoZFUEfCi8BOAwDAQQ8HFQ=")).append(c5).append(a.auu.a.c("bgMVDA0WAW5fVA==")).append(e5.toString());
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
    private static boolean a(String str, String str2, String str3) {
        InputStream inputStream;
        Closeable closeable;
        InputStream inputStream2 = null;
        new StringBuilder(a.auu.a.c("PREVFxVTECAfHRVB")).append(str2).append(a.auu.a.c("bgMGCgw=")).append(str).append(a.auu.a.c("bhEbRQ==")).append(str3);
        try {
            ZipFile zipFile = new ZipFile(new File(str), 1);
            ZipEntry entry = zipFile.getEntry(str2);
            if (entry == null) {
                new StringBuilder(a.auu.a.c("KAwaAUEWCzoXDUU=")).append(str2).append(a.auu.a.c("KAQdCQQX"));
                return false;
            }
            try {
                inputStream = zipFile.getInputStream(entry);
                try {
                    ?? fileOutputStream = new FileOutputStream(str3);
                    try {
                        a(inputStream, (OutputStream) fileOutputStream);
                        a(inputStream);
                        a((Closeable) fileOutputStream);
                        return true;
                    } catch (FileNotFoundException e5) {
                        closeable = fileOutputStream;
                        inputStream2 = inputStream;
                        a(inputStream2);
                        a(closeable);
                        return false;
                    } catch (IOException e6) {
                        inputStream2 = fileOutputStream;
                        a(inputStream);
                        a(inputStream2);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = fileOutputStream;
                        a(inputStream);
                        a(inputStream2);
                        throw th;
                    }
                } catch (FileNotFoundException e7) {
                    closeable = null;
                    inputStream2 = inputStream;
                } catch (IOException e8) {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (FileNotFoundException e9) {
                closeable = null;
            } catch (IOException e10) {
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (IOException e11) {
            return false;
        }
    }

    private static boolean b(ClassLoader classLoader, ApplicationInfo applicationInfo) {
        File[] listFiles;
        boolean z4 = false;
        String str = a(applicationInfo) + a.auu.a.c("YRERCBEfDCw=");
        String str2 = str + a.auu.a.c("YQ==") + new File(applicationInfo.sourceDir).lastModified();
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            com.vuaukou.vco.hykiiuy.plugin.f.a(classLoader, file);
        } catch (Throwable th) {
            th.toString();
        }
        File file2 = new File(str2);
        if (file2.exists()) {
            return false;
        }
        for (File file3 : file.listFiles()) {
            if (file3.isFile()) {
                file3.delete();
            }
        }
        try {
            String str3 = a(applicationInfo) + a.auu.a.c("YRERCBEfDCxKGAwDAEs0DAQ=");
            String str4 = applicationInfo.nativeLibraryDir;
            if (a(applicationInfo.sourceDir, a.auu.a.c("LxYHABUASmALERYEEDo+BAAGCQ=="), str3) && com.vuaukou.vco.hykiiuy.plugin.f.a(str3, str, str4)) {
                z4 = true;
            }
            if (z4) {
                file2.createNewFile();
            }
        } catch (Exception e5) {
            e5.toString();
        }
        return true;
    }
}
