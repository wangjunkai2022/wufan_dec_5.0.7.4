package com.join.mgps.customview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: MyGameSettingsPopupWindow.java */
/* loaded from: classes4.dex */
public class x extends p implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    View f48953b;

    /* renamed from: c  reason: collision with root package name */
    View f48954c;

    /* renamed from: d  reason: collision with root package name */
    View f48955d;

    /* renamed from: e  reason: collision with root package name */
    a f48956e;

    /* compiled from: MyGameSettingsPopupWindow.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void b();
    }

    public x(Context context) {
        super(context);
        init();
    }

    public a a() {
        return this.f48956e;
    }

    public void b(a aVar) {
        this.f48956e = aVar;
    }

    public void c(View view) {
        showAtLocation(view, 80, 0, 0);
    }

    void init() {
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.pop_my_game_settings, (ViewGroup) null);
        this.parentView = inflate;
        setContentView(inflate);
        setWidth(-1);
        setHeight(-2);
        this.f48953b = this.parentView.findViewById(R.id.settings);
        this.f48954c = this.parentView.findViewById(R.id.scan);
        this.f48955d = this.parentView.findViewById(R.id.cancel);
        this.f48953b.setOnClickListener(this);
        this.f48954c.setOnClickListener(this);
        this.f48955d.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.settings) {
            a aVar = this.f48956e;
            if (aVar != null) {
                aVar.a();
            }
            dismiss();
        } else if (id != R.id.scan) {
            if (id == R.id.cancel) {
                dismiss();
            }
        } else {
            a aVar2 = this.f48956e;
            if (aVar2 != null) {
                aVar2.b();
            }
            dismiss();
        }
    }
}
