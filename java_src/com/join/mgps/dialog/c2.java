package com.join.mgps.dialog;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import m.framework.ui.widget.asyncview.AsyncImageView;
/* compiled from: SimulatorMomentChooseDialog.java */
/* loaded from: classes4.dex */
public class c2 extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    private a f49297a;

    /* compiled from: SimulatorMomentChooseDialog.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i4);
    }

    public c2(Context context, int i4) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.pop_moment_type_choose, (ViewGroup) null);
        setContentView(inflate);
        setBackgroundDrawable(context.getResources().getDrawable(AsyncImageView.DEFAULT_TRANSPARENT));
        setWidth((int) context.getResources().getDimension(R.dimen.wdp136));
        setHeight((int) context.getResources().getDimension(R.dimen.wdp155));
        setOutsideTouchable(true);
        final TextView textView = (TextView) inflate.findViewById(R.id.tvSelf);
        final TextView textView2 = (TextView) inflate.findViewById(R.id.tvAll);
        textView.setTextColor(i4 == 1 ? Color.parseColor("#4197F8") : Color.parseColor("#232A36"));
        textView2.setTextColor(i4 == 2 ? Color.parseColor("#4197F8") : Color.parseColor("#232A36"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.dialog.b2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c2.this.c(textView, textView2, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.dialog.a2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c2.this.d(textView2, textView, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(TextView textView, TextView textView2, View view) {
        textView.setTextColor(Color.parseColor("#4197F8"));
        textView2.setTextColor(Color.parseColor("#232A36"));
        a aVar = this.f49297a;
        if (aVar != null) {
            aVar.a(1);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(TextView textView, TextView textView2, View view) {
        textView.setTextColor(Color.parseColor("#4197F8"));
        textView2.setTextColor(Color.parseColor("#232A36"));
        a aVar = this.f49297a;
        if (aVar != null) {
            aVar.a(2);
        }
        dismiss();
    }

    public void e(a aVar) {
        this.f49297a = aVar;
    }
}
