package org.jboss.netty.channel.socket.nio;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.WritableByteChannel;
import org.jboss.netty.channel.a0;
import org.jboss.netty.channel.g0;
/* compiled from: SocketSendBufferPool.java */
/* loaded from: classes7.dex */
final class x implements org.jboss.netty.util.b {

    /* renamed from: c  reason: collision with root package name */
    private static final g f72651c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static final int f72652d = 65536;

    /* renamed from: e  reason: collision with root package name */
    private static final int f72653e = 4;

    /* renamed from: f  reason: collision with root package name */
    private static final int f72654f = 15;

    /* renamed from: a  reason: collision with root package name */
    private f f72655a;

    /* renamed from: b  reason: collision with root package name */
    private e f72656b = new e(65536);

    /* compiled from: SocketSendBufferPool.java */
    /* loaded from: classes7.dex */
    static final class a implements g {
        a() {
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public boolean a() {
            return true;
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public long b() {
            return 0L;
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public long c(WritableByteChannel writableByteChannel) {
            return 0L;
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public long d(DatagramChannel datagramChannel, SocketAddress socketAddress) {
            return 0L;
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public long e() {
            return 0L;
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public void release() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SocketSendBufferPool.java */
    /* loaded from: classes7.dex */
    public final class b implements g {

        /* renamed from: a  reason: collision with root package name */
        private final g0 f72657a;

        /* renamed from: b  reason: collision with root package name */
        private long f72658b;

        b(g0 g0Var) {
            this.f72657a = g0Var;
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public boolean a() {
            return this.f72658b >= this.f72657a.getCount();
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public long b() {
            return this.f72657a.getCount();
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public long c(WritableByteChannel writableByteChannel) throws IOException {
            long transferTo = this.f72657a.transferTo(writableByteChannel, this.f72658b);
            this.f72658b += transferTo;
            return transferTo;
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public long d(DatagramChannel datagramChannel, SocketAddress socketAddress) {
            throw new UnsupportedOperationException();
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public long e() {
            return this.f72658b;
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public void release() {
            g0 g0Var = this.f72657a;
            if ((g0Var instanceof a0) && ((a0) g0Var).c()) {
                this.f72657a.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SocketSendBufferPool.java */
    /* loaded from: classes7.dex */
    public static class c implements g {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer[] f72660a;

        /* renamed from: b  reason: collision with root package name */
        private final int f72661b;

        /* renamed from: c  reason: collision with root package name */
        private long f72662c;

        /* renamed from: d  reason: collision with root package name */
        private final int f72663d;

        c(ByteBuffer[] byteBufferArr) {
            this.f72660a = byteBufferArr;
            this.f72661b = byteBufferArr.length - 1;
            int i4 = 0;
            for (ByteBuffer byteBuffer : byteBufferArr) {
                i4 += byteBuffer.remaining();
            }
            this.f72663d = i4;
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public boolean a() {
            return !this.f72660a[this.f72661b].hasRemaining();
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public long b() {
            return this.f72663d;
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public long c(WritableByteChannel writableByteChannel) throws IOException {
            ByteBuffer[] byteBufferArr;
            if (writableByteChannel instanceof GatheringByteChannel) {
                long write = ((GatheringByteChannel) writableByteChannel).write(this.f72660a);
                this.f72662c += write;
                return write;
            }
            int i4 = 0;
            for (ByteBuffer byteBuffer : this.f72660a) {
                if (byteBuffer.hasRemaining()) {
                    int write2 = writableByteChannel.write(byteBuffer);
                    if (write2 == 0) {
                        break;
                    }
                    i4 += write2;
                }
            }
            long j4 = i4;
            this.f72662c += j4;
            return j4;
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public long d(DatagramChannel datagramChannel, SocketAddress socketAddress) throws IOException {
            ByteBuffer[] byteBufferArr;
            int i4 = 0;
            for (ByteBuffer byteBuffer : this.f72660a) {
                if (byteBuffer.hasRemaining()) {
                    int send = datagramChannel.send(byteBuffer, socketAddress);
                    if (send == 0) {
                        break;
                    }
                    i4 += send;
                }
            }
            long j4 = i4;
            this.f72662c += j4;
            return j4;
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public long e() {
            return this.f72662c;
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public void release() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SocketSendBufferPool.java */
    /* loaded from: classes7.dex */
    public final class d extends h {

        /* renamed from: c  reason: collision with root package name */
        private final e f72664c;

        d(e eVar, ByteBuffer byteBuffer) {
            super(byteBuffer);
            this.f72664c = eVar;
        }

        @Override // org.jboss.netty.channel.socket.nio.x.h, org.jboss.netty.channel.socket.nio.x.g
        public void release() {
            e eVar = this.f72664c;
            int i4 = eVar.f72667b - 1;
            eVar.f72667b = i4;
            if (i4 == 0) {
                eVar.f72666a.clear();
                if (eVar != x.this.f72656b) {
                    x xVar = x.this;
                    x xVar2 = x.this;
                    xVar.f72655a = new f(eVar, xVar2.f72655a);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SocketSendBufferPool.java */
    /* loaded from: classes7.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        final ByteBuffer f72666a;

        /* renamed from: b  reason: collision with root package name */
        int f72667b;

        e(int i4) {
            this.f72666a = ByteBuffer.allocateDirect(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SocketSendBufferPool.java */
    /* loaded from: classes7.dex */
    public final class f extends SoftReference<e> {

        /* renamed from: a  reason: collision with root package name */
        final f f72668a;

        f(e eVar, f fVar) {
            super(eVar);
            this.f72668a = fVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SocketSendBufferPool.java */
    /* loaded from: classes7.dex */
    public interface g {
        boolean a();

        long b();

        long c(WritableByteChannel writableByteChannel) throws IOException;

        long d(DatagramChannel datagramChannel, SocketAddress socketAddress) throws IOException;

        long e();

        void release();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SocketSendBufferPool.java */
    /* loaded from: classes7.dex */
    public static class h implements g {

        /* renamed from: a  reason: collision with root package name */
        final ByteBuffer f72670a;

        /* renamed from: b  reason: collision with root package name */
        final int f72671b;

        h(ByteBuffer byteBuffer) {
            this.f72670a = byteBuffer;
            this.f72671b = byteBuffer.position();
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public final boolean a() {
            return !this.f72670a.hasRemaining();
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public final long b() {
            return this.f72670a.limit() - this.f72671b;
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public final long c(WritableByteChannel writableByteChannel) throws IOException {
            return writableByteChannel.write(this.f72670a);
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public final long d(DatagramChannel datagramChannel, SocketAddress socketAddress) throws IOException {
            return datagramChannel.send(this.f72670a, socketAddress);
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public final long e() {
            return this.f72670a.position() - this.f72671b;
        }

        @Override // org.jboss.netty.channel.socket.nio.x.g
        public void release() {
        }
    }

    private g g(org.jboss.netty.buffer.e eVar) {
        d dVar;
        int readableBytes = eVar.readableBytes();
        if (readableBytes == 0) {
            return f72651c;
        }
        if ((eVar instanceof org.jboss.netty.buffer.i) && ((org.jboss.netty.buffer.i) eVar).W()) {
            return new c(eVar.E0());
        }
        if (eVar.isDirect()) {
            return new h(eVar.d0());
        }
        if (eVar.readableBytes() > 65536) {
            return new h(eVar.d0());
        }
        e eVar2 = this.f72656b;
        ByteBuffer byteBuffer = eVar2.f72666a;
        int remaining = byteBuffer.remaining();
        if (readableBytes < remaining) {
            int position = byteBuffer.position() + readableBytes;
            ByteBuffer duplicate = byteBuffer.duplicate();
            byteBuffer.position(i(position));
            duplicate.limit(position);
            eVar2.f72667b++;
            dVar = new d(eVar2, duplicate);
        } else if (readableBytes > remaining) {
            e j4 = j();
            this.f72656b = j4;
            ByteBuffer byteBuffer2 = j4.f72666a;
            ByteBuffer duplicate2 = byteBuffer2.duplicate();
            byteBuffer2.position(i(readableBytes));
            duplicate2.limit(readableBytes);
            j4.f72667b++;
            dVar = new d(j4, duplicate2);
        } else {
            eVar2.f72667b++;
            this.f72656b = k();
            dVar = new d(eVar2, eVar2.f72666a);
        }
        ByteBuffer byteBuffer3 = dVar.f72670a;
        byteBuffer3.mark();
        eVar.v0(eVar.readerIndex(), byteBuffer3);
        byteBuffer3.reset();
        return dVar;
    }

    private g h(g0 g0Var) {
        if (g0Var.getCount() == 0) {
            return f72651c;
        }
        return new b(g0Var);
    }

    private static int i(int i4) {
        int i5 = i4 >>> 4;
        if ((i4 & 15) != 0) {
            i5++;
        }
        return i5 << 4;
    }

    private e j() {
        e eVar = this.f72656b;
        if (eVar.f72667b == 0) {
            eVar.f72666a.clear();
            return eVar;
        }
        return k();
    }

    private e k() {
        f fVar = this.f72655a;
        if (fVar != null) {
            do {
                e eVar = fVar.get();
                fVar = fVar.f72668a;
                if (eVar != null) {
                    this.f72655a = fVar;
                    return eVar;
                }
            } while (fVar != null);
            this.f72655a = fVar;
        }
        return new e(65536);
    }

    @Override // org.jboss.netty.util.b
    public void b() {
        ByteBuffer byteBuffer = this.f72656b.f72666a;
        if (byteBuffer != null) {
            org.jboss.netty.util.internal.a.a(byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g f(Object obj) {
        if (obj instanceof org.jboss.netty.buffer.e) {
            return g((org.jboss.netty.buffer.e) obj);
        }
        if (obj instanceof g0) {
            return h((g0) obj);
        }
        throw new IllegalArgumentException("unsupported message type: " + obj.getClass());
    }
}
