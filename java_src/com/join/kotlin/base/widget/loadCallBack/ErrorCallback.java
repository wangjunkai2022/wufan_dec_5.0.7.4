package com.join.kotlin.base.widget.loadCallBack;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.kingja.loadsir.callback.Callback;
import org.jetbrains.annotations.Nullable;
/* compiled from: ErrorCallback.kt */
/* loaded from: classes.dex */
public final class ErrorCallback extends Callback {
    @Override // com.kingja.loadsir.callback.Callback
    protected int onCreateView() {
        return R.layout.layout_error;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kingja.loadsir.callback.Callback
    public void onViewCreate(@Nullable final Context context, @Nullable View view) {
        Button button;
        super.onViewCreate(context, view);
        if (view == null || (button = (Button) view.findViewById(R.id.setNetwork)) == null) {
            return;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.base.widget.loadCallBack.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UtilsMy.w3(context);
            }
        });
    }
}
