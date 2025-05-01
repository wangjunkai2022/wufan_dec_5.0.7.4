package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.SlidingTabLayout1;
import com.join.mgps.customview.ViewPagerCompat;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class MarketFragment_ extends MarketFragment implements y3.a, a4.a, a4.b {

    /* renamed from: k  reason: collision with root package name */
    private View f52237k;

    /* renamed from: j  reason: collision with root package name */
    private final a4.c f52236j = new a4.c();

    /* renamed from: l  reason: collision with root package name */
    private final Map<Class<?>, Object> f52238l = new HashMap();

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MarketFragment_.this.Z();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MarketFragment_.super.X();
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends org.androidannotations.api.builder.d<c, MarketFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public MarketFragment build() {
            MarketFragment_ marketFragment_ = new MarketFragment_();
            marketFragment_.setArguments(this.args);
            return marketFragment_;
        }
    }

    public static c d0() {
        return new c();
    }

    private void init_(Bundle bundle) {
        this.f52230e = new PrefDef_(getActivity());
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MarketFragment
    public void X() {
        org.androidannotations.api.b.e("", new b(), 400L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f52238l.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f52237k;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f52236j);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f52237k = onCreateView;
        if (onCreateView == null) {
            this.f52237k = layoutInflater.inflate(R.layout.fragment_market_new, viewGroup, false);
        }
        return this.f52237k;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f52237k = null;
        this.f52227b = null;
        this.f52228c = null;
        this.f52229d = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52227b = (SlidingTabLayout1) aVar.internalFindViewById(R.id.tabs);
        this.f52228c = (ViewPagerCompat) aVar.internalFindViewById(R.id.view_pager);
        this.f52229d = (TextView) aVar.internalFindViewById(R.id.searchContent);
        View internalFindViewById = aVar.internalFindViewById(R.id.searchImage);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        V();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f52236j.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f52238l.put(cls, t4);
    }
}
