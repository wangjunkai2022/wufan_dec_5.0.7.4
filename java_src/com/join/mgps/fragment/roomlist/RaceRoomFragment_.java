package com.join.mgps.fragment.roomlist;

import a4.b;
import a4.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.builder.d;
/* loaded from: classes3.dex */
public final class RaceRoomFragment_ extends RaceRoomFragment implements y3.a, a4.a, b {

    /* renamed from: d  reason: collision with root package name */
    private View f53308d;

    /* renamed from: c  reason: collision with root package name */
    private final c f53307c = new c();

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, Object> f53309e = new HashMap();

    /* loaded from: classes3.dex */
    public static class a extends d<a, RaceRoomFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public RaceRoomFragment build() {
            RaceRoomFragment_ raceRoomFragment_ = new RaceRoomFragment_();
            raceRoomFragment_.setArguments(this.args);
            return raceRoomFragment_;
        }
    }

    public static a V() {
        return new a();
    }

    private void init_(Bundle bundle) {
        c.b(this);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f53309e.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f53308d;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        c c5 = c.c(this.f53307c);
        init_(bundle);
        super.onCreate(bundle);
        c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f53308d = onCreateView;
        if (onCreateView == null) {
            this.f53308d = layoutInflater.inflate(R.layout.fragment_raceroom, viewGroup, false);
        }
        return this.f53308d;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f53308d = null;
        this.f53306b = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f53306b = (WebView) aVar.internalFindViewById(R.id.mWebView);
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f53307c.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f53309e.put(cls, t4);
    }
}
