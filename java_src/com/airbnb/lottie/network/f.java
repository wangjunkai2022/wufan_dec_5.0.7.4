package com.airbnb.lottie.network;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.join.mgps.Util.h0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: NetworkCache.java */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class f {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    private final d f4117a;

    public f(@NonNull d dVar) {
        this.f4117a = dVar;
    }

    private static String c(String str, FileExtension fileExtension, boolean z4) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z4 ? fileExtension.tempExtension() : fileExtension.extension);
        return sb.toString();
    }

    @Nullable
    private File d(String str) throws FileNotFoundException {
        File file = new File(e(), c(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(e(), c(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private File e() {
        File a5 = this.f4117a.a();
        if (a5.isFile()) {
            a5.delete();
        }
        if (!a5.exists()) {
            a5.mkdirs();
        }
        return a5;
    }

    public void a() {
        File e5 = e();
        if (e5.exists()) {
            File[] listFiles = e5.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file : e5.listFiles()) {
                    file.delete();
                }
            }
            e5.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    @WorkerThread
    public Pair<FileExtension, InputStream> b(String str) {
        FileExtension fileExtension;
        try {
            File d5 = d(str);
            if (d5 == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(d5);
            if (d5.getAbsolutePath().endsWith(".zip")) {
                fileExtension = FileExtension.ZIP;
            } else {
                fileExtension = FileExtension.JSON;
            }
            com.airbnb.lottie.utils.d.a("Cache hit for " + str + " at " + d5.getAbsolutePath());
            return new Pair<>(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(String str, FileExtension fileExtension) {
        File file = new File(e(), c(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        com.airbnb.lottie.utils.d.a("Copying temp file to real file (" + file2 + ")");
        if (renameTo) {
            return;
        }
        com.airbnb.lottie.utils.d.e("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + h0.f27805a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File g(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(e(), c(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }
}
