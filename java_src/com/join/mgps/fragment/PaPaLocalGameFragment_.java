package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public final class PaPaLocalGameFragment_ extends PaPaLocalGameFragment implements y3.a, a4.a, a4.b {

    /* renamed from: f  reason: collision with root package name */
    private View f52555f;

    /* renamed from: e  reason: collision with root package name */
    private final a4.c f52554e = new a4.c();

    /* renamed from: g  reason: collision with root package name */
    private final Map<Class<?>, Object> f52556g = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52557b;

        a(List list) {
            this.f52557b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            PaPaLocalGameFragment_.super.X(this.f52557b);
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PaPaLocalGameFragment_.super.W();
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends org.androidannotations.api.builder.d<c, PaPaLocalGameFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public PaPaLocalGameFragment build() {
            PaPaLocalGameFragment_ paPaLocalGameFragment_ = new PaPaLocalGameFragment_();
            paPaLocalGameFragment_.setArguments(this.args);
            return paPaLocalGameFragment_;
        }
    }

    public static c c0() {
        return new c();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    @Override // com.join.mgps.fragment.PaPaLocalGameFragment
    public void W() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    @Override // com.join.mgps.fragment.PaPaLocalGameFragment
    public void X(List<DownloadTask> list) {
        org.androidannotations.api.b.e("", new a(list), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f52556g.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f52555f;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f52554e);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f52555f = onCreateView;
        if (onCreateView == null) {
            this.f52555f = layoutInflater.inflate(R.layout.fragment_papa_game_local, viewGroup, false);
        }
        return this.f52555f;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f52555f = null;
        this.f52550b = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52550b = (XListView2) aVar.internalFindViewById(R.id.mListView);
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f52554e.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f52556g.put(cls, t4);
    }
}
