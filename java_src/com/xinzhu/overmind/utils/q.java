package com.xinzhu.overmind.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: NativeUtils.java */
/* loaded from: classes6.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public static final String f68405a = "VirtualM";

    public static void a(File file, File file2, boolean z4) throws Exception {
        long currentTimeMillis = System.currentTimeMillis();
        if (!file2.exists()) {
            file2.mkdirs();
        }
        try {
            ZipFile zipFile = new ZipFile(file.getAbsolutePath());
            if (z4) {
                c(zipFile, com.xinzhu.overmind.a.f67443k, file2);
            } else if (c(zipFile, com.xinzhu.overmind.a.f67441i, file2)) {
                zipFile.close();
                return;
            } else {
                c(zipFile, com.xinzhu.overmind.a.f67442j, file2);
            }
            zipFile.close();
        } finally {
            StringBuilder sb = new StringBuilder();
            sb.append("Done! +");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append("ms");
        }
    }

    private static void b(byte[] bArr, InputStream inputStream, OutputStream outputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read > 0) {
                bufferedOutputStream.write(bArr, 0, read);
            } else {
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                outputStream.close();
                bufferedInputStream.close();
                inputStream.close();
                return;
            }
        }
    }

    private static boolean c(ZipFile zipFile, String str, File file) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("Try to copy plugin's cup arch: ");
        sb.append(str);
        String str2 = "lib/" + str + net.lingala.zip4j.util.e.F0;
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        boolean z4 = false;
        byte[] bArr = null;
        boolean z5 = false;
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            String name = nextElement.getName();
            if (z4 || name.startsWith("lib/")) {
                if (name.endsWith(".so") && name.startsWith(str2)) {
                    if (bArr == null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Found plugin's cup arch dir: ");
                        sb2.append(str);
                        bArr = new byte[8192];
                        z5 = true;
                    }
                    String substring = name.substring(name.lastIndexOf(47) + 1);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("verify so ");
                    sb3.append(substring);
                    File file2 = new File(file, substring);
                    if (file2.exists() && file2.length() == nextElement.getSize()) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(substring);
                        sb4.append(" skip copy");
                    } else {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("copy so ");
                        sb5.append(nextElement.getName());
                        sb5.append(" of ");
                        sb5.append(str);
                        b(bArr, zipFile.getInputStream(nextElement), fileOutputStream);
                    }
                }
                z4 = true;
            }
        }
        if (z4) {
            return z5;
        }
        return true;
    }
}
