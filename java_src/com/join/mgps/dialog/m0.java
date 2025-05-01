package com.join.mgps.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import m.framework.ui.widget.asyncview.AsyncImageView;
/* compiled from: EndGameDetailMenuDialog.java */
/* loaded from: classes4.dex */
public class m0 extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    private a f49501a;

    /* compiled from: EndGameDetailMenuDialog.java */
    /* loaded from: classes4.dex */
    public interface a {
        void report();
    }

    public m0(Context context) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.pop_moment_type_choose_endgame, (ViewGroup) null);
        setContentView(inflate);
        setBackgroundDrawable(context.getResources().getDrawable(AsyncImageView.DEFAULT_TRANSPARENT));
        setWidth((int) context.getResources().getDimension(R.dimen.wdp136));
        setHeight((int) context.getResources().getDimension(R.dimen.wdp85));
        setOutsideTouchable(true);
        ((TextView) inflate.findViewById(R.id.tvReport)).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.dialog.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m0.this.b(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        a aVar = this.f49501a;
        if (aVar != null) {
            aVar.report();
        }
        dismiss();
    }

    public void c(a aVar) {
        this.f49501a = aVar;
    }
}
