package com.papa91.arc.util;

import android.os.Build;
import com.join.mgps.Util.h0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import net.lingala.zip4j.util.e;
/* loaded from: classes5.dex */
public class XZip {
    private static final int BUFF_SIZE = 10240;

    public static String getDPKRomPath(File file, String str) throws IOException {
        ZipFile zipFile;
        try {
            Charset forName = Charset.forName("GBK");
            if (Build.VERSION.SDK_INT >= 24) {
                zipFile = new ZipFile(file, forName);
            } else {
                zipFile = new ZipFile(file);
            }
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                if (!nextElement.isDirectory()) {
                    String str2 = new String((str + File.separator + nextElement.getName()).getBytes("8859_1"), "UTF-8");
                    if (str2.endsWith(".apk") || str2.endsWith(".APK")) {
                        return str2;
                    }
                }
            }
            return "";
        } catch (IOException e5) {
            e5.printStackTrace();
            throw new IOException(e5);
        }
    }

    public static String getRomPath(File file, String str, String str2) throws IOException {
        ZipFile zipFile;
        try {
            Charset forName = Charset.forName("GBK");
            if (Build.VERSION.SDK_INT >= 24) {
                zipFile = new ZipFile(file, forName);
            } else {
                zipFile = new ZipFile(file);
            }
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                if (!nextElement.isDirectory()) {
                    String str3 = new String((str + File.separator + nextElement.getName()).getBytes("8859_1"), "UTF-8");
                    if (!str3.endsWith(str2 + ".zip")) {
                        if (!str3.endsWith(str2 + ".iso")) {
                            if (!str3.endsWith(str2 + ".ISO")) {
                                if (!str3.endsWith(str2 + ".bin")) {
                                    if (!str3.endsWith(str2 + ".cue")) {
                                        if (!str3.endsWith(str2 + ".pbp")) {
                                            if (!str3.endsWith(str2 + ".img")) {
                                                if (!str3.endsWith(str2 + ".mdf")) {
                                                    if (!str3.endsWith(str2 + ".wsc")) {
                                                        if (!str3.endsWith(str2 + ".ws")) {
                                                            if (!str3.endsWith(str2 + ".nds")) {
                                                                if (!str3.endsWith(str2 + ".z64")) {
                                                                    if (!str3.endsWith(str2 + ".n64")) {
                                                                        if (!str3.endsWith(str2 + ".cdi")) {
                                                                            if (!str3.endsWith(str2 + ".CDI")) {
                                                                                if (!str3.endsWith(str2 + ".gdi")) {
                                                                                    if (!str3.endsWith(str2 + ".chd")) {
                                                                                        if (!str3.endsWith(str2 + ".mds")) {
                                                                                            if (!str3.endsWith(str2 + ".cci")) {
                                                                                                if (!str3.endsWith(str2 + ".cia")) {
                                                                                                    if (str3.endsWith(str2 + ".3ds")) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    zipFile.close();
                    return str3;
                }
            }
            zipFile.close();
            return "";
        } catch (IOException e5) {
            e5.printStackTrace();
            throw new IOException(e5);
        }
    }

    public static void main(String[] strArr) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0035 -> B:65:0x0038). Please submit an issue!!! */
    public static boolean upZipFile(File file, String str) throws IOException {
        if (file == null || !file.exists()) {
            return false;
        }
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        ZipFile zipFile = null;
        try {
            Charset forName = Charset.forName("GBK");
            if (Build.VERSION.SDK_INT >= 24) {
                zipFile = new ZipFile(file, forName);
            } else {
                zipFile = new ZipFile(file);
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        try {
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    if (nextElement.isDirectory()) {
                        new File(new String((str + File.separator + nextElement.getName()).getBytes("8859_1"), "UTF-8")).mkdirs();
                    } else {
                        InputStream inputStream = zipFile.getInputStream(nextElement);
                        File file3 = new File(new String((str + File.separator + nextElement.getName()).getBytes("8859_1"), "UTF-8"));
                        if (file3.exists()) {
                            File file4 = new File(file3.getParent() + e.F0 + System.currentTimeMillis());
                            file3.renameTo(file4);
                            file4.delete();
                        }
                        if (!file3.exists()) {
                            File parentFile = file3.getParentFile();
                            if (!parentFile.exists()) {
                                parentFile.mkdirs();
                            }
                            file3.createNewFile();
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                        try {
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = inputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                    fileOutputStream.flush();
                                }
                                inputStream.close();
                                fileOutputStream.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                                throw new IOException(e6);
                            }
                        } finally {
                        }
                    }
                }
                zipFile.close();
                return true;
            } catch (IOException e7) {
                e7.printStackTrace();
                throw new IOException(e7);
            }
        } catch (Throwable th) {
            if (zipFile != null) {
                zipFile.close();
            }
            throw th;
        }
    }

    public static String upZipFileSource(File file, String str) throws IOException {
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        ZipFile zipFile = null;
        try {
            Charset forName = Charset.forName("GBK");
            if (Build.VERSION.SDK_INT >= 24) {
                zipFile = new ZipFile(file, forName);
            } else {
                zipFile = new ZipFile(file);
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        String str2 = "";
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            if (nextElement.isDirectory()) {
                new File(new String((str + File.separator + nextElement.getName()).getBytes("8859_1"), "UTF-8")).mkdirs();
            } else {
                InputStream inputStream = zipFile.getInputStream(nextElement);
                File file3 = new File(new String((str + File.separator + nextElement.getName()).getBytes("8859_1"), "UTF-8"));
                if (file3.exists()) {
                    File file4 = new File(file3.getParent() + e.F0 + System.currentTimeMillis());
                    file3.renameTo(file4);
                    file4.delete();
                }
                if (!file3.exists()) {
                    File parentFile = file3.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    file3.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                try {
                    try {
                        byte[] bArr = new byte[BUFF_SIZE];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                            fileOutputStream.flush();
                        }
                        inputStream.close();
                        fileOutputStream.close();
                        str2 = file3.getParent();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                        throw new IOException(e6);
                    }
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    fileOutputStream.close();
                    throw th;
                }
            }
        }
        zipFile.close();
        return str2;
    }

    public static void zipDirectoryFile(File file, File file2) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file2), 1024000));
        zipFile(file, zipOutputStream, "");
        zipOutputStream.close();
    }

    private static void zipFile(File file, ZipOutputStream zipOutputStream, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.trim().length() == 0 ? "" : File.separator);
        sb.append(file.getName());
        String str2 = new String(sb.toString().getBytes("8859_1"), "utf-8");
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                zipFile(file2, zipOutputStream, str2);
            }
            return;
        }
        byte[] bArr = new byte[BUFF_SIZE];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 1024000);
        zipOutputStream.putNextEntry(new ZipEntry(str2));
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read != -1) {
                zipOutputStream.write(bArr, 0, read);
            } else {
                bufferedInputStream.close();
                zipOutputStream.flush();
                zipOutputStream.closeEntry();
                return;
            }
        }
    }

    public static void zipFiles(Collection<File> collection, File file) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file), 1024000));
        for (File file2 : collection) {
            zipFile(file2, zipOutputStream, "");
        }
        zipOutputStream.close();
    }

    public static void zipFilesNew(Collection<File> collection, File file, String str) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file), 1024000));
        for (File file2 : collection) {
            zipFile(file2, zipOutputStream, "");
        }
        zipOutputStream.setComment(str);
        zipOutputStream.close();
    }

    public static void zipFiles(Collection<File> collection, File file, String str) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file), 1024000));
        for (File file2 : collection) {
            String name = file2.getName();
            boolean z4 = false;
            for (int i4 = 0; i4 <= 10; i4++) {
                if (!name.endsWith(h0.f27805a + i4)) {
                    if (!name.endsWith(h0.f27805a + i4 + ".png")) {
                    }
                }
                z4 = true;
            }
            if (!z4) {
                zipFile(file2, zipOutputStream, "");
            }
        }
        zipOutputStream.setComment(str);
        zipOutputStream.close();
    }
}
