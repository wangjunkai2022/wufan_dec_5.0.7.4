package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.dto.GameVerByBg;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class LinkProxyActivity_ extends LinkProxyActivity implements y3.a, a4.a, a4.b {

    /* renamed from: d  reason: collision with root package name */
    private final a4.c f34206d = new a4.c();

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, Object> f34207e = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f34208b;

        a(boolean z4) {
            this.f34208b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinkProxyActivity_.super.l0(this.f34208b);
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LinkProxyActivity_.super.h0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameVerByBg f34211b;

        c(GameVerByBg gameVerByBg) {
            this.f34211b = gameVerByBg;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinkProxyActivity_.super.g0(this.f34211b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34213b;

        d(String str) {
            this.f34213b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinkProxyActivity_.super.showMessage(this.f34213b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34215b;

        e(int i4) {
            this.f34215b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinkProxyActivity_.super.f0(this.f34215b);
        }
    }

    /* loaded from: classes4.dex */
    class f extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34217b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f34218c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f34219d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, long j4, String str2, String str3, int i4, String str4) {
            super(str, j4, str2);
            this.f34217b = str3;
            this.f34218c = i4;
            this.f34219d = str4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                LinkProxyActivity_.super.k0(this.f34217b, this.f34218c, this.f34219d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class g extends org.androidannotations.api.builder.a<g> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f34221a;

        public g(Context context) {
            super(context, LinkProxyActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f34221a;
            if (fragment != null) {
                fragment.startActivityForResult(this.intent, i4);
            } else {
                Context context = this.context;
                if (context instanceof Activity) {
                    ActivityCompat.startActivityForResult((Activity) context, this.intent, i4, this.lastOptions);
                } else {
                    context.startActivity(this.intent);
                }
            }
            return new org.androidannotations.api.builder.f(this.context);
        }

        public g(Fragment fragment) {
            super(fragment.getActivity(), LinkProxyActivity_.class);
            this.f34221a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static g s0(Context context) {
        return new g(context);
    }

    public static g t0(Fragment fragment) {
        return new g(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.LinkProxyActivity
    public void f0(int i4) {
        org.androidannotations.api.b.e("", new e(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.LinkProxyActivity
    public void g0(GameVerByBg gameVerByBg) {
        org.androidannotations.api.b.e("", new c(gameVerByBg), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f34207e.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.LinkProxyActivity
    public void h0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.LinkProxyActivity
    public void k0(String str, int i4, String str2) {
        org.androidannotations.api.a.l(new f("", 0L, "", str, i4, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.LinkProxyActivity
    public void l0(boolean z4) {
        org.androidannotations.api.b.e("", new a(z4), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f34206d);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_link_proxy);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f34201b = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f34207e.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f34206d.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.LinkProxyActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new d(str), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f34206d.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f34206d.a(this);
    }
}
