package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class SimulatorIntroductionListFragment_ extends SimulatorIntroductionListFragment implements y3.a, a4.a {

    /* renamed from: c  reason: collision with root package name */
    private View f52983c;

    /* renamed from: b  reason: collision with root package name */
    private final a4.c f52982b = new a4.c();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, Object> f52984d = new HashMap();

    /* loaded from: classes3.dex */
    public static class a extends org.androidannotations.api.builder.d<a, SimulatorIntroductionListFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public SimulatorIntroductionListFragment build() {
            SimulatorIntroductionListFragment_ simulatorIntroductionListFragment_ = new SimulatorIntroductionListFragment_();
            simulatorIntroductionListFragment_.setArguments(this.args);
            return simulatorIntroductionListFragment_;
        }
    }

    public static a V() {
        return new a();
    }

    private void init_(Bundle bundle) {
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f52984d.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f52983c;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f52982b);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f52983c = onCreateView;
        if (onCreateView == null) {
            this.f52983c = layoutInflater.inflate(R.layout.fragment_simulator_introduction_list, viewGroup, false);
        }
        return this.f52983c;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f52983c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f52982b.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f52984d.put(cls, t4);
    }
}
