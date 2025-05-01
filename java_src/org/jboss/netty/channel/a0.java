package org.jboss.netty.channel;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
/* compiled from: DefaultFileRegion.java */
/* loaded from: classes7.dex */
public class a0 implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final FileChannel f72512a;

    /* renamed from: b  reason: collision with root package name */
    private final long f72513b;

    /* renamed from: c  reason: collision with root package name */
    private final long f72514c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f72515d;

    public a0(FileChannel fileChannel, long j4, long j5) {
        this(fileChannel, j4, j5, false);
    }

    @Override // org.jboss.netty.util.b
    public void b() {
        try {
            this.f72512a.close();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    public boolean c() {
        return this.f72515d;
    }

    @Override // org.jboss.netty.channel.g0
    public long getCount() {
        return this.f72514c;
    }

    @Override // org.jboss.netty.channel.g0
    public long getPosition() {
        return this.f72513b;
    }

    @Override // org.jboss.netty.channel.g0
    public long transferTo(WritableByteChannel writableByteChannel, long j4) throws IOException {
        long j5 = this.f72514c - j4;
        if (j5 >= 0 && j4 >= 0) {
            if (j5 == 0) {
                return 0L;
            }
            return this.f72512a.transferTo(this.f72513b + j4, j5, writableByteChannel);
        }
        throw new IllegalArgumentException("position out of range: " + j4 + " (expected: 0 - " + (this.f72514c - 1) + ')');
    }

    public a0(FileChannel fileChannel, long j4, long j5, boolean z4) {
        this.f72512a = fileChannel;
        this.f72513b = j4;
        this.f72514c = j5;
        this.f72515d = z4;
    }
}
