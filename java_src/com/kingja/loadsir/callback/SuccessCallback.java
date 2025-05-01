package com.kingja.loadsir.callback;

import android.content.Context;
import android.view.View;
import com.kingja.loadsir.callback.Callback;
/* loaded from: classes.dex */
public class SuccessCallback extends Callback {
    public SuccessCallback(View view, Context context, Callback.OnReloadListener onReloadListener) {
        super(view, context, onReloadListener);
    }

    public void a() {
        obtainRootView().setVisibility(4);
    }

    public void b() {
        obtainRootView().setVisibility(0);
    }

    public void c(boolean z4) {
        obtainRootView().setVisibility(z4 ? 0 : 4);
    }

    @Override // com.kingja.loadsir.callback.Callback
    protected int onCreateView() {
        return 0;
    }
}
