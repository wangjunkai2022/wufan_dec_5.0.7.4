package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.dto.HomeGameCarefullyBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class ChoiceFragment_ extends ChoiceFragment implements y3.a, a4.a, a4.b {

    /* renamed from: t  reason: collision with root package name */
    private View f50044t;

    /* renamed from: s  reason: collision with root package name */
    private final a4.c f50043s = new a4.c();

    /* renamed from: u  reason: collision with root package name */
    private final Map<Class<?>, Object> f50045u = new HashMap();

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChoiceFragment_.this.h0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f50047b;

        b(String str) {
            this.f50047b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ChoiceFragment_.super.showMessage(this.f50047b);
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ChoiceFragment_.super.m0();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HomeGameCarefullyBean f50050b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f50051c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f50052d;

        d(HomeGameCarefullyBean homeGameCarefullyBean, int i4, int i5) {
            this.f50050b = homeGameCarefullyBean;
            this.f50051c = i4;
            this.f50052d = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            ChoiceFragment_.super.k0(this.f50050b, this.f50051c, this.f50052d);
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HomeGameCarefullyBean f50054b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f50055c;

        e(HomeGameCarefullyBean homeGameCarefullyBean, int i4) {
            this.f50054b = homeGameCarefullyBean;
            this.f50055c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ChoiceFragment_.super.j0(this.f50054b, this.f50055c);
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f50057b;

        f(int i4) {
            this.f50057b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ChoiceFragment_.super.Z(this.f50057b);
        }
    }

    /* loaded from: classes3.dex */
    class g extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f50059b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f50059b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ChoiceFragment_.super.f0(this.f50059b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class h extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HomeGameCarefullyBean f50061b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, long j4, String str2, HomeGameCarefullyBean homeGameCarefullyBean) {
            super(str, j4, str2);
            this.f50061b = homeGameCarefullyBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ChoiceFragment_.super.g0(this.f50061b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class i extends org.androidannotations.api.builder.d<i, ChoiceFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public ChoiceFragment build() {
            ChoiceFragment_ choiceFragment_ = new ChoiceFragment_();
            choiceFragment_.setArguments(this.args);
            return choiceFragment_;
        }
    }

    private void init_(Bundle bundle) {
        this.f50024g = new PrefDef_(getActivity());
        a4.c.b(this);
    }

    public static i u0() {
        return new i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ChoiceFragment
    public void Z(int i4) {
        org.androidannotations.api.b.e("", new f(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ChoiceFragment
    public void f0(int i4) {
        org.androidannotations.api.a.l(new g("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ChoiceFragment
    public void g0(HomeGameCarefullyBean homeGameCarefullyBean) {
        org.androidannotations.api.a.l(new h("", 0L, "", homeGameCarefullyBean));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f50045u.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f50044t;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ChoiceFragment
    public void j0(HomeGameCarefullyBean homeGameCarefullyBean, int i4) {
        org.androidannotations.api.b.e("", new e(homeGameCarefullyBean, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ChoiceFragment
    public void k0(HomeGameCarefullyBean homeGameCarefullyBean, int i4, int i5) {
        org.androidannotations.api.b.e("", new d(homeGameCarefullyBean, i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ChoiceFragment
    public void m0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f50043s);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f50044t = onCreateView;
        if (onCreateView == null) {
            this.f50044t = layoutInflater.inflate(R.layout.choice_fragment, viewGroup, false);
        }
        return this.f50044t;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f50044t = null;
        this.f50019b = null;
        this.f50020c = null;
        this.f50021d = null;
        this.f50031n = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f50019b = (TextView) aVar.internalFindViewById(R.id.searchBack);
        this.f50020c = (TextView) aVar.internalFindViewById(R.id.searchContent);
        this.f50021d = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        this.f50031n = (XRecyclerView) aVar.internalFindViewById(R.id.recyclerView);
        TextView textView = this.f50019b;
        if (textView != null) {
            textView.setOnClickListener(new a());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f50043s.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f50045u.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ChoiceFragment
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new b(str), 0L);
    }
}
