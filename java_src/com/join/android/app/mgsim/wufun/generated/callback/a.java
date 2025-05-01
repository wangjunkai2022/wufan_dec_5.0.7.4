package com.join.android.app.mgsim.wufun.generated.callback;

import android.view.View;
/* compiled from: OnClickListener.java */
/* loaded from: classes3.dex */
public final class a implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    final InterfaceC0321a f27235b;

    /* renamed from: c  reason: collision with root package name */
    final int f27236c;

    /* compiled from: OnClickListener.java */
    /* renamed from: com.join.android.app.mgsim.wufun.generated.callback.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0321a {
        void a(int i4, View view);
    }

    public a(InterfaceC0321a interfaceC0321a, int i4) {
        this.f27235b = interfaceC0321a;
        this.f27236c = i4;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f27235b.a(this.f27236c, view);
    }
}
