package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class NewArenaMainActivty_ extends NewArenaMainActivty implements y3.a, a4.a, a4.b {

    /* renamed from: v1  reason: collision with root package name */
    private final a4.c f36126v1 = new a4.c();
    private final Map<Class<?>, Object> A1 = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewArenaMainActivty_.this.Z0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewArenaMainActivty_.this.a1();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f36129b;

        c(int i4) {
            this.f36129b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainActivty_.super.updateDownloadingPoint(this.f36129b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainActivty_.super.updateNoOpenPoint();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainActivty_.super.updateHidePoint();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f36133b;

        f(int i4) {
            this.f36133b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainActivty_.super.updateLine(this.f36133b);
        }
    }

    /* loaded from: classes4.dex */
    class g extends a.c {
        g(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                NewArenaMainActivty_.super.checkDownlodingNumber();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class h extends org.androidannotations.api.builder.a<h> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f36136a;

        public h(Context context) {
            super(context, NewArenaMainActivty_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f36136a;
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

        public h(Fragment fragment) {
            super(fragment.getActivity(), NewArenaMainActivty_.class);
            this.f36136a = fragment;
        }
    }

    public static h g1(Context context) {
        return new h(context);
    }

    public static h h1(Fragment fragment) {
        return new h(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.NewArenaMainActivty
    public void checkDownlodingNumber() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.A1.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.join.mgps.activity.NewArenaMainActivty, com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36126v1);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activty_new_arena);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.O = (RelativeLayout) aVar.internalFindViewById(R.id.layout_others);
        this.P = (FrameLayout) aVar.internalFindViewById(R.id.mg_mian_fragmentlayout);
        View internalFindViewById = aVar.internalFindViewById(R.id.layoutBack);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        RelativeLayout relativeLayout = this.O;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new b());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.A1.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f36126v1.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.NewArenaMainActivty
    public void updateDownloadingPoint(int i4) {
        org.androidannotations.api.b.e("", new c(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.NewArenaMainActivty
    public void updateHidePoint() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.NewArenaMainActivty
    public void updateLine(int i4) {
        org.androidannotations.api.b.e("", new f(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.NewArenaMainActivty
    public void updateNoOpenPoint() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f36126v1.a(this);
    }

    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f36126v1.a(this);
    }
}
