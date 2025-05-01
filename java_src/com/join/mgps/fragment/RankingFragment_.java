package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.findgame.data.TagData;
import com.join.mgps.customview.SlidingTabLayout1;
import com.join.mgps.customview.ViewPagerCompat;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class RankingFragment_ extends RankingFragment implements y3.a, a4.a, a4.b {

    /* renamed from: l  reason: collision with root package name */
    private View f52641l;

    /* renamed from: k  reason: collision with root package name */
    private final a4.c f52640k = new a4.c();

    /* renamed from: m  reason: collision with root package name */
    private final Map<Class<?>, Object> f52642m = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52643b;

        a(List list) {
            this.f52643b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            RankingFragment_.super.a0(this.f52643b);
        }
    }

    /* loaded from: classes3.dex */
    class b extends a.c {
        b(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                RankingFragment_.super.X();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends org.androidannotations.api.builder.d<c, RankingFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public RankingFragment build() {
            RankingFragment_ rankingFragment_ = new RankingFragment_();
            rankingFragment_.setArguments(this.args);
            return rankingFragment_;
        }
    }

    public static c d0() {
        return new c();
    }

    private void init_(Bundle bundle) {
        this.f52630b = new PrefDef_(getActivity());
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RankingFragment
    public void X() {
        org.androidannotations.api.a.l(new b("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RankingFragment
    public void a0(List<TagData> list) {
        org.androidannotations.api.b.e("", new a(list), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f52642m.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f52641l;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f52640k);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f52641l = onCreateView;
        if (onCreateView == null) {
            this.f52641l = layoutInflater.inflate(R.layout.fragment_rank, viewGroup, false);
        }
        return this.f52641l;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f52641l = null;
        this.f52631c = null;
        this.f52632d = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52631c = (SlidingTabLayout1) aVar.internalFindViewById(R.id.tabs);
        this.f52632d = (ViewPagerCompat) aVar.internalFindViewById(R.id.viewPager);
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f52640k.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f52642m.put(cls, t4);
    }
}
