package com.switfpass.pay.thread;
/* loaded from: classes5.dex */
final class k implements a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ e f61823a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(e eVar) {
        this.f61823a = eVar;
    }

    @Override // com.switfpass.pay.thread.a
    public final void a(int i4) {
        e eVar = this.f61823a;
        if (eVar != null) {
            eVar.onProgress(i4);
        }
    }
}
