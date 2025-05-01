package com.join.mgps.customview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.vipzone.bean.ScreeningConditionBean;
import com.join.mgps.activity.vipzone.bean.SpecialTag;
import com.zhy.view.flowlayout.TagFlowSpecialLayout;
import java.util.List;
/* compiled from: SpecialFilterBottomPopupWindow.java */
/* loaded from: classes4.dex */
public class f0 extends p implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    TagFlowSpecialLayout f48472b;

    /* renamed from: c  reason: collision with root package name */
    TagFlowSpecialLayout f48473c;

    /* renamed from: d  reason: collision with root package name */
    TagFlowSpecialLayout f48474d;

    /* renamed from: e  reason: collision with root package name */
    TextView f48475e;

    /* renamed from: f  reason: collision with root package name */
    TextView f48476f;

    /* renamed from: g  reason: collision with root package name */
    private String f48477g;

    /* renamed from: h  reason: collision with root package name */
    f f48478h;

    /* renamed from: i  reason: collision with root package name */
    SpecialTag f48479i;

    /* renamed from: j  reason: collision with root package name */
    SpecialTag f48480j;

    /* renamed from: k  reason: collision with root package name */
    SpecialTag f48481k;

    /* renamed from: l  reason: collision with root package name */
    ScreeningConditionBean f48482l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialFilterBottomPopupWindow.java */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                f0 f0Var = f0.this;
                f0Var.f48479i = f0Var.f48482l.getSort_type().get(0);
                f0 f0Var2 = f0.this;
                f0Var2.f48480j = f0Var2.f48482l.getGame_type().get(0);
                f0 f0Var3 = f0.this;
                f0Var3.f48481k = f0Var3.f48482l.getGame_class().get(0);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            f0 f0Var4 = f0.this;
            f0Var4.c(f0Var4.f48482l.getSort_type());
            f0 f0Var5 = f0.this;
            f0Var5.c(f0Var5.f48482l.getGame_type());
            f0 f0Var6 = f0.this;
            f0Var6.c(f0Var6.f48482l.getGame_class());
            f0.this.f48472b.b();
            f0.this.f48473c.b();
            f0.this.f48474d.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialFilterBottomPopupWindow.java */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f0 f0Var = f0.this;
            f0Var.f48478h.onfinifilter(f0Var.f48472b.getSelectedItem(), f0.this.f48473c.getSelectedItem(), f0.this.f48474d.getSelectedItem());
            f0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialFilterBottomPopupWindow.java */
    /* loaded from: classes4.dex */
    public class c implements TagFlowSpecialLayout.b {
        c() {
        }

        @Override // com.zhy.view.flowlayout.TagFlowSpecialLayout.b
        public void a(View view, SpecialTag specialTag, ViewGroup viewGroup) {
            f0.this.f48479i = specialTag;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialFilterBottomPopupWindow.java */
    /* loaded from: classes4.dex */
    public class d implements TagFlowSpecialLayout.b {
        d() {
        }

        @Override // com.zhy.view.flowlayout.TagFlowSpecialLayout.b
        public void a(View view, SpecialTag specialTag, ViewGroup viewGroup) {
            f0.this.f48480j = specialTag;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialFilterBottomPopupWindow.java */
    /* loaded from: classes4.dex */
    public class e implements TagFlowSpecialLayout.b {
        e() {
        }

        @Override // com.zhy.view.flowlayout.TagFlowSpecialLayout.b
        public void a(View view, SpecialTag specialTag, ViewGroup viewGroup) {
            f0.this.f48481k = specialTag;
        }
    }

    /* compiled from: SpecialFilterBottomPopupWindow.java */
    /* loaded from: classes4.dex */
    public interface f {
        void onfinifilter(SpecialTag specialTag, SpecialTag specialTag2, SpecialTag specialTag3);
    }

    public f0(Context context) {
        super(context);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<SpecialTag> list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            SpecialTag specialTag = list.get(i4);
            if (i4 == 0) {
                specialTag.setIsselected(true);
            } else {
                specialTag.setIsselected(false);
            }
        }
    }

    public f b() {
        return this.f48478h;
    }

    public void d(ScreeningConditionBean screeningConditionBean) {
        c(screeningConditionBean.getSort_type());
        c(screeningConditionBean.getGame_type());
        c(screeningConditionBean.getGame_class());
    }

    public void e(f fVar) {
        this.f48478h = fVar;
    }

    public void f(View view, ScreeningConditionBean screeningConditionBean) {
        this.f48482l = screeningConditionBean;
        showAtLocation(view, 80, 0, 0);
        try {
            this.f48479i = screeningConditionBean.getSort_type().get(0);
            this.f48480j = screeningConditionBean.getGame_type().get(0);
            this.f48481k = screeningConditionBean.getGame_class().get(0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.f48472b.setData(screeningConditionBean.getSort_type());
        this.f48473c.setData(screeningConditionBean.getGame_type());
        this.f48474d.setData(screeningConditionBean.getGame_class());
    }

    void init() {
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.pop_special_filter_bottom_operate, (ViewGroup) null);
        this.parentView = inflate;
        setContentView(inflate);
        setWidth(-1);
        setHeight(-2);
        this.f48472b = (TagFlowSpecialLayout) this.parentView.findViewById(R.id.filter1);
        this.f48473c = (TagFlowSpecialLayout) this.parentView.findViewById(R.id.filter2);
        this.f48474d = (TagFlowSpecialLayout) this.parentView.findViewById(R.id.filter3);
        this.f48475e = (TextView) this.parentView.findViewById(R.id.resetButn);
        this.f48476f = (TextView) this.parentView.findViewById(R.id.setting);
        this.f48475e.setOnClickListener(new a());
        this.f48476f.setOnClickListener(new b());
        this.f48472b.setListener(new c());
        this.f48473c.setListener(new d());
        this.f48474d.setListener(new e());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getId();
    }
}
