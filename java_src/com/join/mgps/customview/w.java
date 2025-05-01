package com.join.mgps.customview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: MyGamePlugPopupWindow.java */
/* loaded from: classes4.dex */
public class w extends p implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    View f48820b;

    /* renamed from: c  reason: collision with root package name */
    View f48821c;

    /* renamed from: d  reason: collision with root package name */
    View f48822d;

    /* renamed from: e  reason: collision with root package name */
    private String f48823e;

    /* renamed from: f  reason: collision with root package name */
    a f48824f;

    /* compiled from: MyGamePlugPopupWindow.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);

        void b(String str);
    }

    public w(Context context) {
        super(context);
        init();
    }

    public a a() {
        return this.f48824f;
    }

    public void b(a aVar) {
        this.f48824f = aVar;
    }

    public void c(View view, String str) {
        d(view, str, false);
    }

    public void d(View view, String str, boolean z4) {
        this.f48823e = str;
        showAtLocation(view, 80, 0, 0);
        if (z4) {
            this.f48820b.setVisibility(8);
            this.f48822d.setVisibility(8);
            return;
        }
        this.f48820b.setVisibility(0);
        this.f48822d.setVisibility(0);
    }

    void init() {
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.pop_my_game_plug, (ViewGroup) null);
        this.parentView = inflate;
        setContentView(inflate);
        setWidth(-1);
        setHeight(-2);
        this.f48820b = this.parentView.findViewById(R.id.detail);
        this.f48821c = this.parentView.findViewById(R.id.delete);
        this.f48822d = this.parentView.findViewById(R.id.line);
        this.f48820b.setOnClickListener(this);
        this.f48821c.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.detail) {
            dismiss();
            a aVar = this.f48824f;
            if (aVar != null) {
                aVar.b(this.f48823e);
            }
        } else if (id != R.id.delete) {
            if (id == R.id.cancel) {
                dismiss();
            }
        } else {
            dismiss();
            a aVar2 = this.f48824f;
            if (aVar2 != null) {
                aVar2.a(this.f48823e);
            }
        }
    }
}
