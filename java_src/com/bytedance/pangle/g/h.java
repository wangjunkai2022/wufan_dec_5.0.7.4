package com.bytedance.pangle.g;

import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
final class h implements k {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f8411a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(ByteBuffer byteBuffer) {
        this.f8411a = byteBuffer.slice();
    }

    @Override // com.bytedance.pangle.g.k
    public final long a() {
        return this.f8411a.capacity();
    }

    @Override // com.bytedance.pangle.g.k
    public final void a(j jVar, long j4, int i4) {
        ByteBuffer slice;
        synchronized (this.f8411a) {
            this.f8411a.position(0);
            int i5 = (int) j4;
            this.f8411a.limit(i4 + i5);
            this.f8411a.position(i5);
            slice = this.f8411a.slice();
        }
        jVar.a(slice);
    }
}
