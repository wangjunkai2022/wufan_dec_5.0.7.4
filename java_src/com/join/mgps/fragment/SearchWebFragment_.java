package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.LJWebView;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class SearchWebFragment_ extends SearchWebFragment implements y3.a, a4.a, a4.b {

    /* renamed from: g  reason: collision with root package name */
    public static final String f52930g = "url";

    /* renamed from: e  reason: collision with root package name */
    private View f52932e;

    /* renamed from: d  reason: collision with root package name */
    private final a4.c f52931d = new a4.c();

    /* renamed from: f  reason: collision with root package name */
    private final Map<Class<?>, Object> f52933f = new HashMap();

    /* loaded from: classes3.dex */
    public static class a extends org.androidannotations.api.builder.d<a, SearchWebFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public SearchWebFragment build() {
            SearchWebFragment_ searchWebFragment_ = new SearchWebFragment_();
            searchWebFragment_.setArguments(this.args);
            return searchWebFragment_;
        }

        public a b(String str) {
            this.args.putString("url", str);
            return this;
        }
    }

    public static a W() {
        return new a();
    }

    private void X() {
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("url")) {
            return;
        }
        this.f52928c = arguments.getString("url");
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        X();
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f52933f.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f52932e;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f52931d);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f52932e = onCreateView;
        if (onCreateView == null) {
            this.f52932e = layoutInflater.inflate(R.layout.fragment_search_web, viewGroup, false);
        }
        return this.f52932e;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f52932e = null;
        this.f52927b = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52927b = (LJWebView) aVar.internalFindViewById(R.id.web);
        V();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f52931d.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f52933f.put(cls, t4);
    }
}
