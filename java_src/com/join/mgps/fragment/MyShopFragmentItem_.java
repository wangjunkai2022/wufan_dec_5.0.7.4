package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class MyShopFragmentItem_ extends MyShopFragmentItem implements y3.a, a4.a, a4.b {

    /* renamed from: e  reason: collision with root package name */
    private View f52382e;

    /* renamed from: d  reason: collision with root package name */
    private final a4.c f52381d = new a4.c();

    /* renamed from: f  reason: collision with root package name */
    private final Map<Class<?>, Object> f52383f = new HashMap();

    /* loaded from: classes3.dex */
    public static class a extends org.androidannotations.api.builder.d<a, MyShopFragmentItem> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public MyShopFragmentItem build() {
            MyShopFragmentItem_ myShopFragmentItem_ = new MyShopFragmentItem_();
            myShopFragmentItem_.setArguments(this.args);
            return myShopFragmentItem_;
        }
    }

    public static a b() {
        return new a();
    }

    private void c(Bundle bundle) {
        a4.c.b(this);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f52383f.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f52382e;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f52381d);
        c(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f52382e = onCreateView;
        if (onCreateView == null) {
            this.f52382e = layoutInflater.inflate(R.layout.shopfragmet_item, viewGroup, false);
        }
        return this.f52382e;
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f52382e = null;
        this.f52376b = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52376b = (RecyclerView) aVar.internalFindViewById(R.id.rcy);
        a();
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f52381d.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f52383f.put(cls, t4);
    }
}
