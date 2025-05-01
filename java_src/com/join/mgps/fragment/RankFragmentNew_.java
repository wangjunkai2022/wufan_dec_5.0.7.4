package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.SlidingTabLayout1;
import com.join.mgps.customview.ViewPagerCompat;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class RankFragmentNew_ extends RankFragmentNew implements y3.a, a4.a, a4.b {

    /* renamed from: i  reason: collision with root package name */
    private View f52628i;

    /* renamed from: h  reason: collision with root package name */
    private final a4.c f52627h = new a4.c();

    /* renamed from: j  reason: collision with root package name */
    private final Map<Class<?>, Object> f52629j = new HashMap();

    /* loaded from: classes3.dex */
    public static class a extends org.androidannotations.api.builder.d<a, RankFragmentNew> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public RankFragmentNew build() {
            RankFragmentNew_ rankFragmentNew_ = new RankFragmentNew_();
            rankFragmentNew_.setArguments(this.args);
            return rankFragmentNew_;
        }
    }

    public static a b0() {
        return new a();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f52629j.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f52628i;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f52627h);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f52628i = onCreateView;
        if (onCreateView == null) {
            this.f52628i = layoutInflater.inflate(R.layout.fragment_rank_new, viewGroup, false);
        }
        return this.f52628i;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f52628i = null;
        this.f52620b = null;
        this.f52621c = null;
        this.f52622d = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52620b = (SlidingTabLayout1) aVar.internalFindViewById(R.id.tabs);
        this.f52621c = (RelativeLayout) aVar.internalFindViewById(R.id.title);
        this.f52622d = (ViewPagerCompat) aVar.internalFindViewById(R.id.view_pager);
        V();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f52627h.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f52629j.put(cls, t4);
    }
}
