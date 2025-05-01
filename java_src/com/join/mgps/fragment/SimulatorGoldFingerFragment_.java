package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class SimulatorGoldFingerFragment_ extends SimulatorGoldFingerFragment implements y3.a, a4.a, a4.b {

    /* renamed from: g  reason: collision with root package name */
    private View f52943g;

    /* renamed from: f  reason: collision with root package name */
    private final a4.c f52942f = new a4.c();

    /* renamed from: h  reason: collision with root package name */
    private final Map<Class<?>, Object> f52944h = new HashMap();

    /* loaded from: classes3.dex */
    public static class a extends org.androidannotations.api.builder.d<a, SimulatorGoldFingerFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public SimulatorGoldFingerFragment build() {
            SimulatorGoldFingerFragment_ simulatorGoldFingerFragment_ = new SimulatorGoldFingerFragment_();
            simulatorGoldFingerFragment_.setArguments(this.args);
            return simulatorGoldFingerFragment_;
        }
    }

    public static a W() {
        return new a();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f52944h.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f52943g;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f52942f);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f52943g = onCreateView;
        if (onCreateView == null) {
            this.f52943g = layoutInflater.inflate(R.layout.fragment_simulator_gold_finger, viewGroup, false);
        }
        return this.f52943g;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f52943g = null;
        this.f52934b = null;
        this.f52935c = null;
        this.f52936d = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52934b = (RecyclerView) aVar.internalFindViewById(R.id.recyclerView);
        this.f52935c = (LinearLayout) aVar.internalFindViewById(R.id.ll_empty);
        this.f52936d = (NestedScrollView) aVar.internalFindViewById(R.id.nes);
        V();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f52942f.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f52944h.put(cls, t4);
    }
}
