package com.join.kotlin.base.widget.loadCallBack;

import android.content.Context;
import android.view.View;
import com.join.android.app.mgsim.wufun.R;
import com.kingja.loadsir.callback.Callback;
import org.jetbrains.annotations.Nullable;
/* compiled from: LoadingCallback.kt */
/* loaded from: classes.dex */
public final class LoadingCallback extends Callback {
    @Override // com.kingja.loadsir.callback.Callback
    protected int onCreateView() {
        return R.layout.layout_loading;
    }

    @Override // com.kingja.loadsir.callback.Callback
    protected boolean onReloadEvent(@Nullable Context context, @Nullable View view) {
        return true;
    }
}
