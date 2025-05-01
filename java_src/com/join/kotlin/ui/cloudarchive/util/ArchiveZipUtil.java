package com.join.kotlin.ui.cloudarchive.util;

import com.join.mgps.va.overmind.f;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
/* compiled from: ArchiveZipUtil.kt */
/* loaded from: classes3.dex */
public final class ArchiveZipUtil {
    public final void unArchiveZip(@NotNull File zipFile) {
        Intrinsics.checkNotNullParameter(zipFile, "zipFile");
        if (!zipFile.exists()) {
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(zipFile);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[10240];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                fileInputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                new ByteArrayInputStream(byteArray);
                return;
            }
        }
    }

    public void unZipActiveFilesKotlin(@NotNull String file, @NotNull File fileZip) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(fileZip, "fileZip");
        StringBuilder sb = new StringBuilder();
        sb.append("unZipActiveFilesKotlin");
        sb.append(file);
        ZipUtilExtKt.unZipTo(fileZip, file);
    }

    public final void zipActiveFiles(@NotNull File file, @NotNull List<String> files) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(files, "files");
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
            byte[] bArr = new byte[10240];
            for (String str : files) {
                zipFile(zipOutputStream, new File(str), bArr);
            }
            zipOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(byteArray);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    public void zipActiveFilesKotlin(@NotNull File file, @NotNull List<? extends File> files) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(files, "files");
        if (!file.exists() && !file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        ZipUtilExtKt.zipFrom(ZipUtilExtKt.zipOutputStream(file), files);
    }

    public final void zipFile(@NotNull ZipOutputStream zipOutputStream, @NotNull File file, @NotNull byte[] byteArray) {
        boolean startsWith$default;
        Intrinsics.checkNotNullParameter(zipOutputStream, "zipOutputStream");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        if (!file.exists()) {
            return;
        }
        boolean z4 = true;
        if (file.isDirectory()) {
            File[] fileList = file.listFiles();
            if (fileList != null) {
                if (!(fileList.length == 0)) {
                    z4 = false;
                }
            }
            if (z4) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(fileList, "fileList");
            for (File f5 : fileList) {
                Intrinsics.checkNotNullExpressionValue(f5, "f");
                zipFile(zipOutputStream, f5, byteArray);
            }
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        String path = file.getAbsolutePath();
        String a02 = f.f54952a.a0();
        Intrinsics.checkNotNullExpressionValue(path, "path");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(path, a02, false, 2, null);
        if (startsWith$default) {
            Intrinsics.checkNotNullExpressionValue(path, "path");
            path = StringsKt__StringsJVMKt.replace$default(path, a02 + '/', "", false, 4, (Object) null);
        }
        zipOutputStream.putNextEntry(new ZipEntry(path));
        BufferedInputStream bufferedInputStream = fileInputStream instanceof BufferedInputStream ? (BufferedInputStream) fileInputStream : new BufferedInputStream(fileInputStream, 8192);
        BufferedOutputStream bufferedOutputStream = zipOutputStream instanceof BufferedOutputStream ? (BufferedOutputStream) zipOutputStream : new BufferedOutputStream(zipOutputStream, 8192);
        while (true) {
            int read = bufferedInputStream.read(byteArray);
            if (read != -1) {
                bufferedOutputStream.write(byteArray, 0, read);
            } else {
                bufferedOutputStream.flush();
                fileInputStream.close();
                return;
            }
        }
    }
}
