package com.join.mgps.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ObservableWebView;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class MGDetailSimpleInfoFragment_ extends MGDetailSimpleInfoFragment implements y3.a, a4.a, a4.b {

    /* renamed from: k  reason: collision with root package name */
    private View f34294k;

    /* renamed from: j  reason: collision with root package name */
    private final a4.c f34293j = new a4.c();

    /* renamed from: l  reason: collision with root package name */
    private final Map<Class<?>, Object> f34295l = new HashMap();

    /* loaded from: classes4.dex */
    public static class a extends org.androidannotations.api.builder.d<a, MGDetailSimpleInfoFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public MGDetailSimpleInfoFragment build() {
            MGDetailSimpleInfoFragment_ mGDetailSimpleInfoFragment_ = new MGDetailSimpleInfoFragment_();
            mGDetailSimpleInfoFragment_.setArguments(this.args);
            return mGDetailSimpleInfoFragment_;
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
        return (T) this.f34295l.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f34294k;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f34293j);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f34294k = onCreateView;
        if (onCreateView == null) {
            this.f34294k = layoutInflater.inflate(R.layout.detail_simple_info_layout, viewGroup, false);
        }
        return this.f34294k;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f34294k = null;
        this.f34286c = null;
        this.f34287d = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f34286c = (LinearLayout) aVar.internalFindViewById(R.id.tipsLayout);
        this.f34287d = (ObservableWebView) aVar.internalFindViewById(R.id.webView);
        afterView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f34293j.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f34295l.put(cls, t4);
    }
}
