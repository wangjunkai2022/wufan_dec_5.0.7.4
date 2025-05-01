package com.join.mgps.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MyGamePapaFavVpFragment_ extends MyGamePapaFavVpFragment implements y3.a, a4.a, a4.b {

    /* renamed from: s  reason: collision with root package name */
    private View f35775s;

    /* renamed from: r  reason: collision with root package name */
    private final a4.c f35774r = new a4.c();

    /* renamed from: t  reason: collision with root package name */
    private final Map<Class<?>, Object> f35776t = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFavVpFragment_.super.h0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f35778b;

        b(boolean z4) {
            this.f35778b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFavVpFragment_.super.c0(this.f35778b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35780b;

        c(String str) {
            this.f35780b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFavVpFragment_.super.e0(this.f35780b);
        }
    }

    /* loaded from: classes4.dex */
    class d extends a.c {
        d(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyGamePapaFavVpFragment_.super.a0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class e extends org.androidannotations.api.builder.d<e, MyGamePapaFavVpFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public MyGamePapaFavVpFragment build() {
            MyGamePapaFavVpFragment_ myGamePapaFavVpFragment_ = new MyGamePapaFavVpFragment_();
            myGamePapaFavVpFragment_.setArguments(this.args);
            return myGamePapaFavVpFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static e m0() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFavVpFragment
    public void a0() {
        org.androidannotations.api.a.l(new d("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFavVpFragment
    public void c0(boolean z4) {
        org.androidannotations.api.b.e("", new b(z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFavVpFragment
    public void e0(String str) {
        org.androidannotations.api.b.e("", new c(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f35776t.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFavVpFragment
    public void h0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f35775s;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f35774r);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f35775s = onCreateView;
        if (onCreateView == null) {
            this.f35775s = layoutInflater.inflate(R.layout.fragment_my_game_papa_fav_vp, viewGroup, false);
        }
        return this.f35775s;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f35775s = null;
        this.f35751b = null;
        this.f35752c = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f35751b = (RecyclerView) aVar.internalFindViewById(R.id.rvTags);
        this.f35752c = (ViewPager2) aVar.internalFindViewById(R.id.vp);
        X();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f35774r.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f35776t.put(cls, t4);
    }
}
