package com.switfpass.pay.utils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class a2 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ d0 f61830a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a2(d0 d0Var) {
        this.f61830a = d0Var;
    }

    @Override // com.switfpass.pay.utils.f0
    public final void a() {
        g0 g0Var;
        d0 d0Var = this.f61830a;
        g0Var = d0Var.f61849l;
        d0Var.u("交易进行中，确认是否中断交易？", g0Var);
    }
}
