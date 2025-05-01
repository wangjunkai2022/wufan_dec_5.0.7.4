package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class GameTopicFragment_ extends GameTopicFragment implements y3.a, a4.a, a4.b {

    /* renamed from: m  reason: collision with root package name */
    private View f52036m;

    /* renamed from: l  reason: collision with root package name */
    private final a4.c f52035l = new a4.c();

    /* renamed from: n  reason: collision with root package name */
    private final Map<Class<?>, Object> f52037n = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameTopicFragment_.super.p0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameTopicFragment_.super.i0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52040b;

        c(String str) {
            this.f52040b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameTopicFragment_.super.showToast(this.f52040b);
        }
    }

    /* loaded from: classes3.dex */
    class d extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f52042b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f52042b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameTopicFragment_.super.loadData(this.f52042b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends org.androidannotations.api.builder.d<e, GameTopicFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public GameTopicFragment build() {
            GameTopicFragment_ gameTopicFragment_ = new GameTopicFragment_();
            gameTopicFragment_.setArguments(this.args);
            return gameTopicFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static e u0() {
        return new e();
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f52037n.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameTopicFragment
    public void i0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f52036m;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.fragment.GameTopicFragment
    public void loadData(int i4) {
        org.androidannotations.api.a.l(new d("", 0L, "", i4));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f52035l);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f52036m = onCreateView;
        if (onCreateView == null) {
            this.f52036m = layoutInflater.inflate(R.layout.fragment_game_topic, viewGroup, false);
        }
        return this.f52036m;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f52036m = null;
        this.f52025e = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52025e = (XListView2) aVar.internalFindViewById(R.id.listView);
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f52035l.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameTopicFragment
    public void p0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f52037n.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameTopicFragment
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new c(str), 0L);
    }
}
