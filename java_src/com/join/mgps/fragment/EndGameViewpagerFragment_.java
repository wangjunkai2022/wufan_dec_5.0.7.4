package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.GameMainV4DataBean;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class EndGameViewpagerFragment_ extends EndGameViewpagerFragment implements y3.a, a4.a, a4.b {

    /* renamed from: k  reason: collision with root package name */
    public static final String f51209k = "gameId";

    /* renamed from: l  reason: collision with root package name */
    public static final String f51210l = "configBean";

    /* renamed from: i  reason: collision with root package name */
    private View f51212i;

    /* renamed from: h  reason: collision with root package name */
    private final a4.c f51211h = new a4.c();

    /* renamed from: j  reason: collision with root package name */
    private final Map<Class<?>, Object> f51213j = new HashMap();

    /* loaded from: classes3.dex */
    public static class a extends org.androidannotations.api.builder.d<a, EndGameViewpagerFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public EndGameViewpagerFragment build() {
            EndGameViewpagerFragment_ endGameViewpagerFragment_ = new EndGameViewpagerFragment_();
            endGameViewpagerFragment_.setArguments(this.args);
            return endGameViewpagerFragment_;
        }

        public a b(GameMainV4DataBean.EndGameConfigBean endGameConfigBean) {
            this.args.putSerializable("configBean", endGameConfigBean);
            return this;
        }

        public a c(String str) {
            this.args.putString("gameId", str);
            return this;
        }
    }

    public static a Z() {
        return new a();
    }

    private void a0() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("gameId")) {
                this.f51204d = arguments.getString("gameId");
            }
            if (arguments.containsKey("configBean")) {
                this.f51205e = (GameMainV4DataBean.EndGameConfigBean) arguments.getSerializable("configBean");
            }
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        a0();
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f51213j.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f51212i;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f51211h);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f51212i = onCreateView;
        if (onCreateView == null) {
            this.f51212i = layoutInflater.inflate(R.layout.fragment_end_game_viewpager, viewGroup, false);
        }
        return this.f51212i;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f51212i = null;
        this.f51202b = null;
        this.f51203c = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51202b = (SlidingTabLayout) aVar.internalFindViewById(R.id.tablayout);
        this.f51203c = (ViewPager) aVar.internalFindViewById(R.id.viewpager);
        W();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51211h.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f51213j.put(cls, t4);
    }
}
