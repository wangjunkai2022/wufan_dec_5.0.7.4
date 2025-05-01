package org.jboss.netty.util.internal;
/* compiled from: ThreadLocalBoolean.java */
/* loaded from: classes7.dex */
public class k extends ThreadLocal<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f72837a;

    public k() {
        this(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a */
    public Boolean initialValue() {
        return this.f72837a ? Boolean.TRUE : Boolean.FALSE;
    }

    public k(boolean z4) {
        this.f72837a = z4;
    }
}
