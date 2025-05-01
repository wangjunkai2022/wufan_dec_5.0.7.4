package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.flyco.tablayout.SlidingTabLayout;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class EndGameViewpagerListFragment_ extends EndGameViewpagerListFragment implements y3.a, a4.a, a4.b {

    /* renamed from: k  reason: collision with root package name */
    public static final String f51221k = "gameId";

    /* renamed from: l  reason: collision with root package name */
    public static final String f51222l = "ext";

    /* renamed from: i  reason: collision with root package name */
    private View f51224i;

    /* renamed from: h  reason: collision with root package name */
    private final a4.c f51223h = new a4.c();

    /* renamed from: j  reason: collision with root package name */
    private final Map<Class<?>, Object> f51225j = new HashMap();

    /* loaded from: classes3.dex */
    public static class a extends org.androidannotations.api.builder.d<a, EndGameViewpagerListFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public EndGameViewpagerListFragment build() {
            EndGameViewpagerListFragment_ endGameViewpagerListFragment_ = new EndGameViewpagerListFragment_();
            endGameViewpagerListFragment_.setArguments(this.args);
            return endGameViewpagerListFragment_;
        }

        public a b(String str) {
            this.args.putString("ext", str);
            return this;
        }

        public a c(String str) {
            this.args.putString("gameId", str);
            return this;
        }
    }

    public static a c0() {
        return new a();
    }

    private void d0() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("gameId")) {
                this.f51217e = arguments.getString("gameId");
            }
            if (arguments.containsKey("ext")) {
                this.f51218f = arguments.getString("ext");
            }
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        d0();
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f51225j.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f51224i;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f51223h);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f51224i = onCreateView;
        if (onCreateView == null) {
            this.f51224i = layoutInflater.inflate(R.layout.fragment_end_game_viewpager_list, viewGroup, false);
        }
        return this.f51224i;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f51224i = null;
        this.f51214b = null;
        this.f51215c = null;
        this.f51216d = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51214b = (ViewPager) aVar.internalFindViewById(R.id.viewpager);
        this.f51215c = (SlidingTabLayout) aVar.internalFindViewById(R.id.tablayout);
        this.f51216d = (SimpleDraweeView) aVar.internalFindViewById(R.id.iconAd);
        X();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51223h.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f51225j.put(cls, t4);
    }
}
