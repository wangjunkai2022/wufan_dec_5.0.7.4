package org.jboss.netty.channel;
/* compiled from: AdaptiveReceiveBufferSizePredictorFactory.java */
/* loaded from: classes7.dex */
public class d implements k0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f72534a;

    /* renamed from: b  reason: collision with root package name */
    private final int f72535b;

    /* renamed from: c  reason: collision with root package name */
    private final int f72536c;

    public d() {
        this(64, 1024, 65536);
    }

    @Override // org.jboss.netty.channel.k0
    public j0 a() throws Exception {
        return new c(this.f72534a, this.f72535b, this.f72536c);
    }

    public d(int i4, int i5, int i6) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("minimum: " + i4);
        } else if (i5 < i4) {
            throw new IllegalArgumentException("initial: " + i5);
        } else if (i6 >= i5) {
            this.f72534a = i4;
            this.f72535b = i5;
            this.f72536c = i6;
        } else {
            throw new IllegalArgumentException("maximum: " + i6);
        }
    }
}
