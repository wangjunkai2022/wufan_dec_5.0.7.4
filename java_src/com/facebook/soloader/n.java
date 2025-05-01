package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import javax.annotation.Nullable;
/* compiled from: FileLocker.java */
/* loaded from: classes.dex */
public final class n implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    private final FileOutputStream f12787b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private final FileLock f12788c;

    private n(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f12787b = fileOutputStream;
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            if (lock == null) {
                fileOutputStream.close();
            }
            this.f12788c = lock;
        } catch (Throwable th) {
            this.f12787b.close();
            throw th;
        }
    }

    public static n a(File file) throws IOException {
        return new n(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            FileLock fileLock = this.f12788c;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f12787b.close();
        }
    }
}
