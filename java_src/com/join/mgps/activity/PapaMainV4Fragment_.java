package com.join.mgps.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class PapaMainV4Fragment_ extends PapaMainV4Fragment implements y3.a, a4.a, a4.b {

    /* renamed from: k  reason: collision with root package name */
    private View f36742k;

    /* renamed from: j  reason: collision with root package name */
    private final a4.c f36741j = new a4.c();

    /* renamed from: l  reason: collision with root package name */
    private final Map<Class<?>, Object> f36743l = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainV4Fragment_.this.c0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainV4Fragment_.this.a0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainV4Fragment_.this.b0();
        }
    }

    /* loaded from: classes4.dex */
    public static class d extends org.androidannotations.api.builder.d<d, PapaMainV4Fragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public PapaMainV4Fragment build() {
            PapaMainV4Fragment_ papaMainV4Fragment_ = new PapaMainV4Fragment_();
            papaMainV4Fragment_.setArguments(this.args);
            return papaMainV4Fragment_;
        }
    }

    public static d d0() {
        return new d();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f36743l.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f36742k;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36741j);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f36742k = onCreateView;
        if (onCreateView == null) {
            this.f36742k = layoutInflater.inflate(R.layout.mgpapa_mainfragment_new_layout_v4, viewGroup, false);
        }
        return this.f36742k;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f36742k = null;
        this.f36726b = null;
        this.f36727c = null;
        this.f36728d = null;
        this.f36729e = null;
        this.f36730f = null;
        this.f36731g = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36726b = aVar.internalFindViewById(R.id.statubar);
        this.f36727c = (ViewFlipper) aVar.internalFindViewById(R.id.tvSearchHint);
        this.f36728d = (TextView) aVar.internalFindViewById(R.id.tv_message_count);
        this.f36729e = (TextView) aVar.internalFindViewById(R.id.tv_download_count);
        this.f36730f = (TabLayout) aVar.internalFindViewById(R.id.tablayout);
        this.f36731g = (ViewPager2) aVar.internalFindViewById(R.id.viewpager);
        View internalFindViewById = aVar.internalFindViewById(R.id.v_search);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.v_download);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.v_message);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new b());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new c());
        }
        V();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f36741j.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f36743l.put(cls, t4);
    }
}
