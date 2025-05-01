package org.jboss.netty.channel.socket.nio;

import com.papa91.arc.ext.Log;
import java.nio.ByteBuffer;
/* compiled from: SocketReceiveBufferAllocator.java */
/* loaded from: classes7.dex */
final class w implements org.jboss.netty.util.b {

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f72647a;

    /* renamed from: b  reason: collision with root package name */
    private int f72648b;

    /* renamed from: c  reason: collision with root package name */
    private final int f72649c;

    /* renamed from: d  reason: collision with root package name */
    private final int f72650d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w() {
        this(16, 80);
    }

    private ByteBuffer d(int i4) {
        ByteBuffer byteBuffer = this.f72647a;
        if (byteBuffer != null) {
            this.f72648b = 0;
            org.jboss.netty.util.internal.a.a(byteBuffer);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(e(i4));
        this.f72647a = allocateDirect;
        return allocateDirect;
    }

    private static int e(int i4) {
        int i5 = i4 >>> 10;
        if ((i4 & Log.LogWrapper.MAX_MSG_LEN) != 0) {
            i5++;
        }
        return i5 << 10;
    }

    @Override // org.jboss.netty.util.b
    public void b() {
        ByteBuffer byteBuffer = this.f72647a;
        if (byteBuffer != null) {
            org.jboss.netty.util.internal.a.a(byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteBuffer c(int i4) {
        ByteBuffer byteBuffer = this.f72647a;
        if (byteBuffer == null) {
            return d(i4);
        }
        if (byteBuffer.capacity() < i4) {
            return d(i4);
        }
        if ((this.f72647a.capacity() * this.f72650d) / 100 > i4) {
            int i5 = this.f72648b + 1;
            this.f72648b = i5;
            if (i5 == this.f72649c) {
                return d(i4);
            }
            this.f72647a.clear();
        } else {
            this.f72648b = 0;
            this.f72647a.clear();
        }
        return this.f72647a;
    }

    w(int i4, int i5) {
        this.f72649c = i4;
        this.f72650d = i5;
    }
}
