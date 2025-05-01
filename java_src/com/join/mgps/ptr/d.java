package com.join.mgps.ptr;
/* compiled from: PtrUIHandlerHolder.java */
/* loaded from: classes4.dex */
class d implements c {

    /* renamed from: b  reason: collision with root package name */
    private c f53705b;

    /* renamed from: c  reason: collision with root package name */
    private d f53706c;

    private d() {
    }

    public static void f(d dVar, c cVar) {
        if (cVar == null || dVar == null) {
            return;
        }
        if (dVar.f53705b == null) {
            dVar.f53705b = cVar;
            return;
        }
        while (!dVar.g(cVar)) {
            d dVar2 = dVar.f53706c;
            if (dVar2 == null) {
                d dVar3 = new d();
                dVar3.f53705b = cVar;
                dVar.f53706c = dVar3;
                return;
            }
            dVar = dVar2;
        }
    }

    private boolean g(c cVar) {
        c cVar2 = this.f53705b;
        return cVar2 != null && cVar2 == cVar;
    }

    public static d h() {
        return new d();
    }

    private c i() {
        return this.f53705b;
    }

    public static d k(d dVar, c cVar) {
        if (dVar == null || cVar == null || dVar.f53705b == null) {
            return dVar;
        }
        d dVar2 = dVar;
        d dVar3 = null;
        do {
            if (!dVar.g(cVar)) {
                dVar3 = dVar;
                dVar = dVar.f53706c;
                continue;
            } else if (dVar3 == null) {
                dVar2 = dVar.f53706c;
                dVar.f53706c = null;
                dVar = dVar2;
                continue;
            } else {
                dVar3.f53706c = dVar.f53706c;
                dVar.f53706c = null;
                dVar = dVar3.f53706c;
                continue;
            }
        } while (dVar != null);
        return dVar2 == null ? new d() : dVar2;
    }

    @Override // com.join.mgps.ptr.c
    public void a(PtrFrameLayout ptrFrameLayout) {
        d dVar = this;
        do {
            c i4 = dVar.i();
            if (i4 != null) {
                i4.a(ptrFrameLayout);
            }
            dVar = dVar.f53706c;
        } while (dVar != null);
    }

    @Override // com.join.mgps.ptr.c
    public void b(PtrFrameLayout ptrFrameLayout, boolean z4, byte b5, com.join.mgps.ptr.indicator.a aVar) {
        d dVar = this;
        do {
            c i4 = dVar.i();
            if (i4 != null) {
                i4.b(ptrFrameLayout, z4, b5, aVar);
            }
            dVar = dVar.f53706c;
        } while (dVar != null);
    }

    @Override // com.join.mgps.ptr.c
    public void c(PtrFrameLayout ptrFrameLayout) {
        d dVar = this;
        do {
            c i4 = dVar.i();
            if (i4 != null) {
                i4.c(ptrFrameLayout);
            }
            dVar = dVar.f53706c;
        } while (dVar != null);
    }

    @Override // com.join.mgps.ptr.c
    public void d(PtrFrameLayout ptrFrameLayout) {
        if (j()) {
            d dVar = this;
            do {
                c i4 = dVar.i();
                if (i4 != null) {
                    i4.d(ptrFrameLayout);
                }
                dVar = dVar.f53706c;
            } while (dVar != null);
        }
    }

    @Override // com.join.mgps.ptr.c
    public void e(PtrFrameLayout ptrFrameLayout) {
        d dVar = this;
        do {
            c i4 = dVar.i();
            if (i4 != null) {
                i4.e(ptrFrameLayout);
            }
            dVar = dVar.f53706c;
        } while (dVar != null);
    }

    public boolean j() {
        return this.f53705b != null;
    }
}
