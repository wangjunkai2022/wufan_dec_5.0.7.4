package com.join.kotlin.base.ext;

import android.view.View;
import com.kingja.loadsir.callback.Callback;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Callback.OnReloadListener, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function0 f27246b;

    public /* synthetic */ a(Function0 function0) {
        this.f27246b = function0;
    }

    @Override // com.kingja.loadsir.callback.Callback.OnReloadListener
    public final void X0(View view) {
        CustomViewExtKt.b(this.f27246b, view);
    }
}
