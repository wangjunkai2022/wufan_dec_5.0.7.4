package com.switfpass.pay.utils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class j0 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ d0 f61891a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(d0 d0Var) {
        this.f61891a = d0Var;
    }

    @Override // com.switfpass.pay.utils.f0
    public final void a() {
        g0 g0Var;
        d0 d0Var = this.f61891a;
        g0Var = d0Var.f61849l;
        d0Var.u("交易进行中，确认是否中断交易？", g0Var);
    }
}
