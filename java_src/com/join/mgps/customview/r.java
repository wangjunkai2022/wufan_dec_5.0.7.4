package com.join.mgps.customview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: MyGameDeleteGameSoucePopupWindow.java */
/* loaded from: classes4.dex */
public class r extends p implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    TextView f48654b;

    /* renamed from: c  reason: collision with root package name */
    TextView f48655c;

    /* renamed from: d  reason: collision with root package name */
    TextView f48656d;

    /* renamed from: e  reason: collision with root package name */
    private String f48657e;

    /* renamed from: f  reason: collision with root package name */
    a f48658f;

    /* compiled from: MyGameDeleteGameSoucePopupWindow.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);
    }

    public r(Context context) {
        super(context);
        init();
    }

    public a a() {
        return this.f48658f;
    }

    public void b(a aVar) {
        this.f48658f = aVar;
    }

    public void c(View view, String str) {
        showAtLocation(view, 80, 0, 0);
        TextView textView = this.f48654b;
        textView.setText("是否保留“" + str + "”的游戏存档？");
    }

    void init() {
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.pop_my_game_deletesouce_game, (ViewGroup) null);
        this.parentView = inflate;
        setContentView(inflate);
        setWidth(-1);
        setHeight(-2);
        this.f48654b = (TextView) this.parentView.findViewById(R.id.name);
        this.f48655c = (TextView) this.parentView.findViewById(R.id.delete);
        this.f48656d = (TextView) this.parentView.findViewById(R.id.cancel);
        this.f48655c.setText("删除");
        this.f48656d.setText("保留");
        this.f48655c.setOnClickListener(this);
        this.f48656d.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.delete) {
            if (id == R.id.cancel) {
                dismiss();
                return;
            }
            return;
        }
        a aVar = this.f48658f;
        if (aVar != null) {
            aVar.a(this.f48657e);
        }
        dismiss();
    }
}
