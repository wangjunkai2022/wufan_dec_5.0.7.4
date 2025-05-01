package org.jboss.netty.channel;

import java.net.SocketAddress;
import java.util.Random;
import java.util.concurrent.ConcurrentMap;
import org.jboss.netty.util.internal.ConcurrentHashMap;
/* compiled from: AbstractChannel.java */
/* loaded from: classes7.dex */
public abstract class a implements e {

    /* renamed from: l  reason: collision with root package name */
    static final ConcurrentMap<Integer, e> f72498l = new ConcurrentHashMap();

    /* renamed from: m  reason: collision with root package name */
    private static final Random f72499m = new Random();

    /* renamed from: n  reason: collision with root package name */
    static final /* synthetic */ boolean f72500n = false;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f72501b;

    /* renamed from: c  reason: collision with root package name */
    private final e f72502c;

    /* renamed from: d  reason: collision with root package name */
    private final i f72503d;

    /* renamed from: e  reason: collision with root package name */
    private final n f72504e;

    /* renamed from: f  reason: collision with root package name */
    private final j f72505f;

    /* renamed from: g  reason: collision with root package name */
    private final C0799a f72506g;

    /* renamed from: h  reason: collision with root package name */
    private volatile int f72507h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f72508i;

    /* renamed from: j  reason: collision with root package name */
    private String f72509j;

    /* renamed from: k  reason: collision with root package name */
    private volatile Object f72510k;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractChannel.java */
    /* renamed from: org.jboss.netty.channel.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public final class C0799a extends w {
        public C0799a() {
            super(a.this, false);
        }

        boolean n() {
            return super.setSuccess();
        }

        @Override // org.jboss.netty.channel.w, org.jboss.netty.channel.j
        public boolean setFailure(Throwable th) {
            return false;
        }

        @Override // org.jboss.netty.channel.w, org.jboss.netty.channel.j
        public boolean setSuccess() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(e eVar, i iVar, n nVar, p pVar) {
        this.f72505f = new n0(this);
        this.f72506g = new C0799a();
        this.f72507h = 1;
        this.f72502c = eVar;
        this.f72503d = iVar;
        this.f72504e = nVar;
        this.f72501b = d(this);
        nVar.i(this, pVar);
    }

    private static Integer d(e eVar) {
        Integer valueOf = Integer.valueOf(f72499m.nextInt());
        while (f72498l.putIfAbsent(valueOf, eVar) != null) {
            valueOf = Integer.valueOf(valueOf.intValue() + 1);
        }
        return valueOf;
    }

    private String f() {
        String hexString = Integer.toHexString(this.f72501b.intValue());
        switch (hexString.length()) {
            case 0:
                return "00000000";
            case 1:
                return "0000000" + hexString;
            case 2:
                return "000000" + hexString;
            case 3:
                return "00000" + hexString;
            case 4:
                return "0000" + hexString;
            case 5:
                return "000" + hexString;
            case 6:
                return "00" + hexString;
            case 7:
                return '0' + hexString;
            default:
                return hexString;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean E() {
        f72498l.remove(this.f72501b);
        return this.f72506g.n();
    }

    @Override // org.jboss.netty.channel.e
    public int O() {
        return this.f72507h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void P(int i4) {
        this.f72507h = i4;
    }

    @Override // org.jboss.netty.channel.e
    public void b(Object obj) {
        this.f72510k = obj;
    }

    @Override // org.jboss.netty.channel.e
    public j bind(SocketAddress socketAddress) {
        return s.a(this, socketAddress);
    }

    @Override // org.jboss.netty.channel.e
    public j close() {
        s.c(this);
        return this.f72506g;
    }

    @Override // org.jboss.netty.channel.e
    public j connect(SocketAddress socketAddress) {
        return s.e(this, socketAddress);
    }

    @Override // org.jboss.netty.channel.e
    public j disconnect() {
        return s.g(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public final int compareTo(e eVar) {
        return getId().compareTo(eVar.getId());
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // org.jboss.netty.channel.e
    public j g() {
        return s.X(this);
    }

    @Override // org.jboss.netty.channel.e
    public final Integer getId() {
        return this.f72501b;
    }

    @Override // org.jboss.netty.channel.e
    public e getParent() {
        return this.f72502c;
    }

    @Override // org.jboss.netty.channel.e
    public n getPipeline() {
        return this.f72504e;
    }

    @Override // org.jboss.netty.channel.e
    public j h(int i4) {
        return s.U(this, i4);
    }

    public final int hashCode() {
        return this.f72501b.intValue();
    }

    @Override // org.jboss.netty.channel.e
    public Object i() {
        return this.f72510k;
    }

    @Override // org.jboss.netty.channel.e
    public boolean isOpen() {
        return !this.f72506g.isDone();
    }

    @Override // org.jboss.netty.channel.e
    public boolean isReadable() {
        return (O() & 1) != 0;
    }

    @Override // org.jboss.netty.channel.e
    public boolean isWritable() {
        return (O() & 4) == 0;
    }

    @Override // org.jboss.netty.channel.e
    public j j(boolean z4) {
        if (z4) {
            return h(O() | 1);
        }
        return h(O() & (-2));
    }

    @Override // org.jboss.netty.channel.e
    public j k(Object obj, SocketAddress socketAddress) {
        return s.b0(this, obj, socketAddress);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j m() {
        return this.f72505f;
    }

    @Override // org.jboss.netty.channel.e
    public j t0() {
        return this.f72506g;
    }

    public String toString() {
        String str;
        boolean isConnected = isConnected();
        if (this.f72508i != isConnected || (str = this.f72509j) == null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("[id: 0x");
            sb.append(f());
            SocketAddress localAddress = getLocalAddress();
            SocketAddress remoteAddress = getRemoteAddress();
            if (remoteAddress != null) {
                sb.append(", ");
                if (getParent() == null) {
                    sb.append(localAddress);
                    sb.append(isConnected ? " => " : " :> ");
                    sb.append(remoteAddress);
                } else {
                    sb.append(remoteAddress);
                    sb.append(isConnected ? " => " : " :> ");
                    sb.append(localAddress);
                }
            } else if (localAddress != null) {
                sb.append(", ");
                sb.append(localAddress);
            }
            sb.append(']');
            String sb2 = sb.toString();
            this.f72509j = sb2;
            this.f72508i = isConnected;
            return sb2;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j u() {
        return new f0(this, new UnsupportedOperationException());
    }

    @Override // org.jboss.netty.channel.e
    public i v() {
        return this.f72503d;
    }

    @Override // org.jboss.netty.channel.e
    public j write(Object obj) {
        return s.a0(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Integer num, e eVar, i iVar, n nVar, p pVar) {
        this.f72505f = new n0(this);
        this.f72506g = new C0799a();
        this.f72507h = 1;
        this.f72501b = num;
        this.f72502c = eVar;
        this.f72503d = iVar;
        this.f72504e = nVar;
        nVar.i(this, pVar);
    }
}
