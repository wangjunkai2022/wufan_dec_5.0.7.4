package com.switfpass.pay.thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class m implements a {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ l f61826a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(l lVar) {
        this.f61826a = lVar;
    }

    @Override // com.switfpass.pay.thread.a
    public final void a(int i4) {
        this.f61826a.publishProgress(Integer.valueOf(i4));
    }
}
