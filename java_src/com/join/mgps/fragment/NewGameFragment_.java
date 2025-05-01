package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class NewGameFragment_ extends NewGameFragment implements y3.a, a4.a, a4.b {

    /* renamed from: k  reason: collision with root package name */
    private View f52504k;

    /* renamed from: j  reason: collision with root package name */
    private final a4.c f52503j = new a4.c();

    /* renamed from: l  reason: collision with root package name */
    private final Map<Class<?>, Object> f52505l = new HashMap();

    /* loaded from: classes3.dex */
    public static class a extends org.androidannotations.api.builder.d<a, NewGameFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public NewGameFragment build() {
            NewGameFragment_ newGameFragment_ = new NewGameFragment_();
            newGameFragment_.setArguments(this.args);
            return newGameFragment_;
        }
    }

    public static a V() {
        return new a();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f52505l.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f52504k;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f52503j);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // com.join.mgps.fragment.NewGameFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f52504k = onCreateView;
        if (onCreateView == null) {
            this.f52504k = layoutInflater.inflate(R.layout.newgame_fragment_layout, viewGroup, false);
        }
        return this.f52504k;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f52504k = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f52503j.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f52505l.put(cls, t4);
    }
}
