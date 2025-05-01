package com.bytedance.pangle.util.b;

import com.bytedance.pangle.util.b.b.d;
import com.bytedance.pangle.util.g;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.ZipException;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    final d f8600a;

    /* renamed from: b  reason: collision with root package name */
    final com.bytedance.pangle.util.b.a.b f8601b = new com.bytedance.pangle.util.b.a.b();

    public a(d dVar) {
        this.f8600a = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(File file) {
        if (file.exists() && !file.delete()) {
            throw new ZipException("Could not delete temporary file");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2, long j4, long j5, String str) {
        g.a(randomAccessFile, randomAccessFile2, j4, j4 + j5, str);
    }
}
