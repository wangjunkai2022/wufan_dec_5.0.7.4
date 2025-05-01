package com.facebook.common.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
/* compiled from: Closeables.java */
/* loaded from: classes.dex */
public final class c {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    static final Logger f10848a = Logger.getLogger(c.class.getName());

    private c() {
    }

    public static void a(@Nullable Closeable closeable, boolean z4) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e5) {
            if (z4) {
                f10848a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e5);
                return;
            }
            throw e5;
        }
    }

    public static void b(@Nullable InputStream inputStream) {
        try {
            a(inputStream, true);
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }

    public static void c(@Nullable Reader reader) {
        try {
            a(reader, true);
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }
}
