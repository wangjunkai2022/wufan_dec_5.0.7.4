package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.EndGameListBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class EndGameSelectFragment_ extends EndGameSelectFragment implements y3.a, a4.a, a4.b {

    /* renamed from: m  reason: collision with root package name */
    public static final String f51187m = "modelType";

    /* renamed from: k  reason: collision with root package name */
    private View f51189k;

    /* renamed from: j  reason: collision with root package name */
    private final a4.c f51188j = new a4.c();

    /* renamed from: l  reason: collision with root package name */
    private final Map<Class<?>, Object> f51190l = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameSelectFragment_.super.c0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EndGameListBean f51192b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f51193c;

        b(EndGameListBean endGameListBean, int i4) {
            this.f51192b = endGameListBean;
            this.f51193c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameSelectFragment_.super.e0(this.f51192b, this.f51193c);
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameSelectFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameSelectFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameSelectFragment_.super.showMain();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51198b;

        f(String str) {
            this.f51198b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameSelectFragment_.super.showTost(this.f51198b);
        }
    }

    /* loaded from: classes3.dex */
    class g extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51200b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f51200b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                EndGameSelectFragment_.super.b0(this.f51200b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class h extends org.androidannotations.api.builder.d<h, EndGameSelectFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public EndGameSelectFragment build() {
            EndGameSelectFragment_ endGameSelectFragment_ = new EndGameSelectFragment_();
            endGameSelectFragment_.setArguments(this.args);
            return endGameSelectFragment_;
        }

        public h b(int i4) {
            this.args.putInt("modelType", i4);
            return this;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        n0();
    }

    public static h m0() {
        return new h();
    }

    private void n0() {
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("modelType")) {
            return;
        }
        this.f51179e = arguments.getInt("modelType");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameSelectFragment
    public void b0(int i4) {
        org.androidannotations.api.a.l(new g("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameSelectFragment
    public void c0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameSelectFragment
    public void e0(EndGameListBean endGameListBean, int i4) {
        org.androidannotations.api.b.e("", new b(endGameListBean, i4), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f51190l.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f51189k;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f51188j);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f51189k = onCreateView;
        if (onCreateView == null) {
            this.f51189k = layoutInflater.inflate(R.layout.fragment_end_game_select, viewGroup, false);
        }
        return this.f51189k;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f51189k = null;
        this.f51176b = null;
        this.f51177c = null;
        this.f51178d = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51176b = (RecyclerView) aVar.internalFindViewById(R.id.rvList);
        this.f51177c = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f51178d = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        a0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51188j.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f51190l.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameSelectFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameSelectFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameSelectFragment
    public void showMain() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameSelectFragment
    public void showTost(String str) {
        org.androidannotations.api.b.e("", new f(str), 0L);
    }
}
