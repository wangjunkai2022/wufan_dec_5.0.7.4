package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class MyShopFragment_ extends MyShopFragment implements y3.a, a4.a, a4.b {

    /* renamed from: t  reason: collision with root package name */
    private View f52385t;

    /* renamed from: s  reason: collision with root package name */
    private final a4.c f52384s = new a4.c();

    /* renamed from: u  reason: collision with root package name */
    private final Map<Class<?>, Object> f52386u = new HashMap();

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyShopFragment_.this.c0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyShopFragment_.this.g0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyShopFragment_.this.Z();
        }
    }

    /* loaded from: classes3.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyShopFragment_.this.d0();
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyShopFragment_.this.b0();
        }
    }

    /* loaded from: classes3.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyShopFragment_.this.f0();
        }
    }

    /* loaded from: classes3.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyShopFragment_.this.a0();
        }
    }

    /* loaded from: classes3.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyShopFragment_.this.e0();
        }
    }

    /* loaded from: classes3.dex */
    public static class i extends org.androidannotations.api.builder.d<i, MyShopFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public MyShopFragment build() {
            MyShopFragment_ myShopFragment_ = new MyShopFragment_();
            myShopFragment_.setArguments(this.args);
            return myShopFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static i j0() {
        return new i();
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f52386u.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f52385t;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f52384s);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f52385t = onCreateView;
        if (onCreateView == null) {
            this.f52385t = layoutInflater.inflate(R.layout.item_shop_fragment, viewGroup, false);
        }
        return this.f52385t;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f52385t = null;
        this.f52359b = null;
        this.f52360c = null;
        this.f52361d = null;
        this.f52362e = null;
        this.f52363f = null;
        this.f52364g = null;
        this.f52365h = null;
        this.f52366i = null;
        this.f52367j = null;
        this.f52368k = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52359b = (RadioButton) aVar.internalFindViewById(R.id.rb_zong);
        this.f52360c = (RadioButton) aVar.internalFindViewById(R.id.rb_good);
        this.f52361d = (RadioButton) aVar.internalFindViewById(R.id.rb_new);
        this.f52362e = (RadioButton) aVar.internalFindViewById(R.id.rb_my);
        this.f52363f = (LinearLayout) aVar.internalFindViewById(R.id.ll_zong);
        this.f52364g = (LinearLayout) aVar.internalFindViewById(R.id.ll_good);
        this.f52365h = (LinearLayout) aVar.internalFindViewById(R.id.ll_new);
        this.f52366i = (LinearLayout) aVar.internalFindViewById(R.id.ll_my);
        this.f52367j = (FrameLayout) aVar.internalFindViewById(R.id.frag_shop);
        this.f52368k = (RelativeLayout) aVar.internalFindViewById(R.id.rl_titleshopbar);
        LinearLayout linearLayout = this.f52363f;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new a());
        }
        RadioButton radioButton = this.f52359b;
        if (radioButton != null) {
            radioButton.setOnClickListener(new b());
        }
        LinearLayout linearLayout2 = this.f52364g;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new c());
        }
        RadioButton radioButton2 = this.f52360c;
        if (radioButton2 != null) {
            radioButton2.setOnClickListener(new d());
        }
        LinearLayout linearLayout3 = this.f52365h;
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new e());
        }
        RadioButton radioButton3 = this.f52361d;
        if (radioButton3 != null) {
            radioButton3.setOnClickListener(new f());
        }
        LinearLayout linearLayout4 = this.f52366i;
        if (linearLayout4 != null) {
            linearLayout4.setOnClickListener(new g());
        }
        RadioButton radioButton4 = this.f52362e;
        if (radioButton4 != null) {
            radioButton4.setOnClickListener(new h());
        }
        afterView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f52384s.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f52386u.put(cls, t4);
    }
}
