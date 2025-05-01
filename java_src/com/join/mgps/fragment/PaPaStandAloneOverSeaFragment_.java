package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.InterceptEventViewPager;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class PaPaStandAloneOverSeaFragment_ extends PaPaStandAloneOverSeaFragment implements y3.a, a4.a, a4.b {

    /* renamed from: l  reason: collision with root package name */
    private View f52574l;

    /* renamed from: k  reason: collision with root package name */
    private final a4.c f52573k = new a4.c();

    /* renamed from: m  reason: collision with root package name */
    private final Map<Class<?>, Object> f52575m = new HashMap();

    /* loaded from: classes3.dex */
    public static class a extends org.androidannotations.api.builder.d<a, PaPaStandAloneOverSeaFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public PaPaStandAloneOverSeaFragment build() {
            PaPaStandAloneOverSeaFragment_ paPaStandAloneOverSeaFragment_ = new PaPaStandAloneOverSeaFragment_();
            paPaStandAloneOverSeaFragment_.setArguments(this.args);
            return paPaStandAloneOverSeaFragment_;
        }
    }

    public static a a0() {
        return new a();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f52575m.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f52574l;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // com.join.mgps.fragment.PaPaStandAloneOverSeaFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f52573k);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f52574l = onCreateView;
        if (onCreateView == null) {
            this.f52574l = layoutInflater.inflate(R.layout.fragment_papa_standalone_oversea, viewGroup, false);
        }
        return this.f52574l;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f52574l = null;
        this.f52564c = null;
        this.f52565d = null;
        this.f52566e = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52564c = (TextView) aVar.internalFindViewById(R.id.tv_free);
        this.f52565d = (TextView) aVar.internalFindViewById(R.id.tv_new);
        this.f52566e = (InterceptEventViewPager) aVar.internalFindViewById(R.id.mViewPager);
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f52573k.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f52575m.put(cls, t4);
    }
}
