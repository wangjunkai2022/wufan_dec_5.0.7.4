package org.jboss.netty.channel.socket.nio;

import java.net.Socket;
import java.util.Map;
import java.util.Objects;
import org.jboss.netty.channel.ChannelException;
import org.jboss.netty.channel.j0;
import org.jboss.netty.channel.k0;
/* compiled from: DefaultNioSocketChannelConfig.java */
/* loaded from: classes7.dex */
class i extends d4.c implements s {

    /* renamed from: i  reason: collision with root package name */
    private static final k0 f72611i = new org.jboss.netty.channel.d();

    /* renamed from: d  reason: collision with root package name */
    private volatile int f72612d;

    /* renamed from: e  reason: collision with root package name */
    private volatile int f72613e;

    /* renamed from: f  reason: collision with root package name */
    private volatile j0 f72614f;

    /* renamed from: g  reason: collision with root package name */
    private volatile k0 f72615g;

    /* renamed from: h  reason: collision with root package name */
    private volatile int f72616h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Socket socket) {
        super(socket);
        this.f72612d = 65536;
        this.f72613e = 32768;
        this.f72615g = f72611i;
        this.f72616h = 16;
    }

    private void j(int i4) {
        if (i4 >= 0) {
            this.f72612d = i4;
            return;
        }
        throw new IllegalArgumentException("writeBufferHighWaterMark: " + i4);
    }

    private void k(int i4) {
        if (i4 >= 0) {
            this.f72613e = i4;
            return;
        }
        throw new IllegalArgumentException("writeBufferLowWaterMark: " + i4);
    }

    @Override // org.jboss.netty.channel.socket.nio.s
    public void a(k0 k0Var) {
        Objects.requireNonNull(k0Var, "predictorFactory");
        this.f72615g = k0Var;
    }

    @Override // d4.c, org.jboss.netty.channel.v, org.jboss.netty.channel.f
    public boolean c(String str, Object obj) {
        if (super.c(str, obj)) {
            return true;
        }
        if ("writeBufferHighWaterMark".equals(str)) {
            j(org.jboss.netty.util.internal.b.b(obj));
        } else if ("writeBufferLowWaterMark".equals(str)) {
            k(org.jboss.netty.util.internal.b.b(obj));
        } else if ("writeSpinCount".equals(str)) {
            setWriteSpinCount(org.jboss.netty.util.internal.b.b(obj));
        } else if ("receiveBufferSizePredictorFactory".equals(str)) {
            a((k0) obj);
        } else if (!"receiveBufferSizePredictor".equals(str)) {
            return false;
        } else {
            i((j0) obj);
        }
        return true;
    }

    @Override // org.jboss.netty.channel.socket.nio.s
    public k0 e() {
        return this.f72615g;
    }

    @Override // org.jboss.netty.channel.socket.nio.s
    public j0 f() {
        j0 j0Var = this.f72614f;
        if (j0Var == null) {
            try {
                j0 a5 = e().a();
                this.f72614f = a5;
                return a5;
            } catch (Exception e5) {
                throw new ChannelException("Failed to create a new " + j0.class.getSimpleName() + external.org.apache.commons.lang3.d.f68897a, e5);
            }
        }
        return j0Var;
    }

    @Override // org.jboss.netty.channel.socket.nio.j
    public int getWriteBufferHighWaterMark() {
        return this.f72612d;
    }

    @Override // org.jboss.netty.channel.socket.nio.j
    public int getWriteBufferLowWaterMark() {
        return this.f72613e;
    }

    @Override // org.jboss.netty.channel.socket.nio.j
    public int getWriteSpinCount() {
        return this.f72616h;
    }

    @Override // org.jboss.netty.channel.socket.nio.s
    public void i(j0 j0Var) {
        Objects.requireNonNull(j0Var, "predictor");
        this.f72614f = j0Var;
    }

    @Override // org.jboss.netty.channel.v, org.jboss.netty.channel.f
    public void setOptions(Map<String, Object> map) {
        super.setOptions(map);
        if (getWriteBufferHighWaterMark() < getWriteBufferLowWaterMark()) {
            k(getWriteBufferHighWaterMark() >>> 1);
        }
    }

    @Override // org.jboss.netty.channel.socket.nio.j
    public void setWriteBufferHighWaterMark(int i4) {
        if (i4 >= getWriteBufferLowWaterMark()) {
            j(i4);
            return;
        }
        throw new IllegalArgumentException("writeBufferHighWaterMark cannot be less than writeBufferLowWaterMark (" + getWriteBufferLowWaterMark() + "): " + i4);
    }

    @Override // org.jboss.netty.channel.socket.nio.j
    public void setWriteBufferLowWaterMark(int i4) {
        if (i4 <= getWriteBufferHighWaterMark()) {
            k(i4);
            return;
        }
        throw new IllegalArgumentException("writeBufferLowWaterMark cannot be greater than writeBufferHighWaterMark (" + getWriteBufferHighWaterMark() + "): " + i4);
    }

    @Override // org.jboss.netty.channel.socket.nio.j
    public void setWriteSpinCount(int i4) {
        if (i4 > 0) {
            this.f72616h = i4;
            return;
        }
        throw new IllegalArgumentException("writeSpinCount must be a positive integer.");
    }
}
