package com.facebook.common.memory;

import com.facebook.common.internal.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: PooledByteStreams.java */
/* loaded from: classes2.dex */
public class j {

    /* renamed from: c  reason: collision with root package name */
    private static final int f10885c = 16384;

    /* renamed from: a  reason: collision with root package name */
    private final int f10886a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10887b;

    public j(a aVar) {
        this(aVar, 16384);
    }

    public long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = this.f10887b.get(this.f10886a);
        long j4 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.f10886a);
                if (read == -1) {
                    return j4;
                }
                outputStream.write(bArr, 0, read);
                j4 += read;
            } finally {
                this.f10887b.release(bArr);
            }
        }
    }

    public long b(InputStream inputStream, OutputStream outputStream, long j4) throws IOException {
        long j5 = 0;
        com.facebook.common.internal.h.o(j4 > 0);
        byte[] bArr = this.f10887b.get(this.f10886a);
        while (j5 < j4) {
            try {
                int read = inputStream.read(bArr, 0, (int) Math.min(this.f10886a, j4 - j5));
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
                j5 += read;
            } finally {
                this.f10887b.release(bArr);
            }
        }
        return j5;
    }

    @VisibleForTesting
    public j(a aVar, int i4) {
        com.facebook.common.internal.h.d(i4 > 0);
        this.f10886a = i4;
        this.f10887b = aVar;
    }
}
