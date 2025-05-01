package com.join.mgps.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class CheckLocalGameFragment_ extends CheckLocalGameFragment implements y3.a, a4.a, a4.b {

    /* renamed from: h  reason: collision with root package name */
    private View f28583h;

    /* renamed from: g  reason: collision with root package name */
    private final a4.c f28582g = new a4.c();

    /* renamed from: i  reason: collision with root package name */
    private final Map<Class<?>, Object> f28584i = new HashMap();

    /* loaded from: classes4.dex */
    public static class a extends org.androidannotations.api.builder.d<a, CheckLocalGameFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public CheckLocalGameFragment build() {
            CheckLocalGameFragment_ checkLocalGameFragment_ = new CheckLocalGameFragment_();
            checkLocalGameFragment_.setArguments(this.args);
            return checkLocalGameFragment_;
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
        return (T) this.f28584i.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f28583h;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f28582g);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f28583h = onCreateView;
        if (onCreateView == null) {
            this.f28583h = layoutInflater.inflate(R.layout.fragment_check_local_game, viewGroup, false);
        }
        return this.f28583h;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28583h = null;
        this.f28577b = null;
        this.f28578c = null;
        this.f28579d = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f28577b = (TextView) aVar.internalFindViewById(R.id.beforNameTx);
        this.f28578c = (TextView) aVar.internalFindViewById(R.id.afterNameTx);
        this.f28579d = (SimpleDraweeView) aVar.internalFindViewById(R.id.appIcon);
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f28582g.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f28584i.put(cls, t4);
    }
}
