package com.join.kotlin.ui.cloudarchive.util;

import android.os.Build;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import kotlin.collections.CollectionsKt__IteratorsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
/* compiled from: ZipUtilExt.kt */
@SourceDebugExtension({"SMAP\nZipUtilExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipUtilExt.kt\ncom/join/kotlin/ui/cloudarchive/util/ZipUtilExtKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n11335#2:154\n11670#2,3:155\n13579#2,2:162\n1855#3,2:158\n1855#3,2:160\n*S KotlinDebug\n*F\n+ 1 ZipUtilExt.kt\ncom/join/kotlin/ui/cloudarchive/util/ZipUtilExtKt\n*L\n60#1:154\n60#1:155,3\n92#1:162,2\n62#1:158,2\n76#1:160,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ZipUtilExtKt {
    private static final void checkUnzipFolder(String str) {
        File file = new File(str);
        if (!file.isFile()) {
            if (!file.exists() && !file.mkdirs()) {
                throw new RuntimeException("创建文件夹失败");
            }
            return;
        }
        throw new RuntimeException("路径不能是文件");
    }

    private static final void createEmptyFolder(ZipOutputStream zipOutputStream, String str) {
        zipOutputStream.putNextEntry(new ZipEntry(str));
        zipOutputStream.closeEntry();
    }

    public static final boolean smartCreateNewFile(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        if (file.exists()) {
            return true;
        }
        return file.getParentFile().exists() ? file.createNewFile() : file.getParentFile().mkdirs() && file.createNewFile();
    }

    public static final void unZipTo(@NotNull File file, @NotNull String path) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        checkUnzipFolder(path);
        Charset forName = Charset.forName("GBK");
        if (Build.VERSION.SDK_INT >= 24) {
            unZipTo(new ZipFile(file, forName), path);
        } else {
            unZipTo(new ZipFile(file), path);
        }
    }

    public static final void writeTo(@NotNull InputStream inputStream, @NotNull OutputStream outputStream, int i4, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        byte[] bArr = new byte[i4];
        BufferedInputStream bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192);
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (!(read != -1)) {
                break;
            }
            bufferedOutputStream.write(bArr, 0, read);
        }
        bufferedOutputStream.flush();
        if (z4) {
            inputStream.close();
        }
        if (z5) {
            outputStream.close();
        }
    }

    public static /* synthetic */ void writeTo$default(InputStream inputStream, OutputStream outputStream, int i4, boolean z4, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 2048;
        }
        if ((i5 & 4) != 0) {
            z4 = true;
        }
        if ((i5 & 8) != 0) {
            z5 = true;
        }
        writeTo(inputStream, outputStream, i4, z4, z5);
    }

    private static final void zip(ZipOutputStream zipOutputStream, File[] fileArr, String str) {
        String str2 = str == null ? "" : str + '/';
        if (fileArr.length == 0) {
            createEmptyFolder(zipOutputStream, str2);
        }
        for (File file : fileArr) {
            if (file.isFile()) {
                ZipEntry zipEntry = new ZipEntry(str2 + file.getName());
                FileInputStream fileInputStream = new FileInputStream(file);
                BufferedInputStream bufferedInputStream = fileInputStream instanceof BufferedInputStream ? (BufferedInputStream) fileInputStream : new BufferedInputStream(fileInputStream, 8192);
                zipOutputStream.putNextEntry(zipEntry);
                writeTo$default(bufferedInputStream, zipOutputStream, 8192, false, false, 4, null);
                zipOutputStream.closeEntry();
            } else {
                File[] listFiles = file.listFiles();
                Intrinsics.checkNotNullExpressionValue(listFiles, "it.listFiles()");
                zip(zipOutputStream, listFiles, str2 + file.getName());
            }
        }
    }

    public static final void zipFrom(@NotNull ZipOutputStream zipOutputStream, @NotNull String... srcs) {
        Intrinsics.checkNotNullParameter(zipOutputStream, "<this>");
        Intrinsics.checkNotNullParameter(srcs, "srcs");
        ArrayList<File> arrayList = new ArrayList(srcs.length);
        for (String str : srcs) {
            arrayList.add(new File(str));
        }
        for (File file : arrayList) {
            if (file.isFile()) {
                zip(zipOutputStream, new File[]{file}, null);
            } else if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                Intrinsics.checkNotNullExpressionValue(listFiles, "it.listFiles()");
                zip(zipOutputStream, listFiles, file.getName());
            }
        }
        zipOutputStream.close();
    }

    @NotNull
    public static final ZipInputStream zipInputStream(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new ZipInputStream(new FileInputStream(file));
    }

    @NotNull
    public static final ZipOutputStream zipOutputStream(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new ZipOutputStream(new FileOutputStream(file));
    }

    @NotNull
    public static final ZipInputStream zipInputStream(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new ZipInputStream(inputStream);
    }

    @NotNull
    public static final ZipOutputStream zipOutputStream(@NotNull OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new ZipOutputStream(outputStream);
    }

    public static final void unZipTo(@NotNull ZipFile zipFile, @NotNull String path) {
        Iterator it2;
        Intrinsics.checkNotNullParameter(zipFile, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        checkUnzipFolder(path);
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        Intrinsics.checkNotNullExpressionValue(entries, "entries()");
        it2 = CollectionsKt__IteratorsJVMKt.iterator(entries);
        while (it2.hasNext()) {
            ZipEntry zipEntry = (ZipEntry) it2.next();
            if (zipEntry.isDirectory()) {
                new File(path + '/' + zipEntry.getName()).mkdirs();
            } else {
                InputStream input = zipFile.getInputStream(zipEntry);
                File file = new File(path + '/' + zipEntry.getName());
                if (!file.exists()) {
                    smartCreateNewFile(file);
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                Intrinsics.checkNotNullExpressionValue(input, "input");
                writeTo$default(input, fileOutputStream, 8192, false, false, 12, null);
            }
        }
    }

    public static final void zipFrom(@NotNull ZipOutputStream zipOutputStream, @NotNull List<? extends File> files) {
        Intrinsics.checkNotNullParameter(zipOutputStream, "<this>");
        Intrinsics.checkNotNullParameter(files, "files");
        for (File file : files) {
            if (file.isFile()) {
                zip(zipOutputStream, new File[]{file}, null);
            } else if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                Intrinsics.checkNotNullExpressionValue(listFiles, "it.listFiles()");
                zip(zipOutputStream, listFiles, file.getName());
            }
        }
        zipOutputStream.close();
    }
}
