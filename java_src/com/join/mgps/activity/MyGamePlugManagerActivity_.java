package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MyGamePlugManagerActivity_ extends MyGamePlugManagerActivity implements y3.a, a4.a, a4.b {

    /* renamed from: j  reason: collision with root package name */
    private final a4.c f36029j = new a4.c();

    /* renamed from: k  reason: collision with root package name */
    private final Map<Class<?>, Object> f36030k = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePlugManagerActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePlugManagerActivity_.super.j0();
        }
    }

    /* loaded from: classes4.dex */
    class c extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36033b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f36033b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyGamePlugManagerActivity_.super.k0(this.f36033b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36035b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f36035b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyGamePlugManagerActivity_.super.i0(this.f36035b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36037b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f36037b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyGamePlugManagerActivity_.super.h0(this.f36037b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class f extends org.androidannotations.api.builder.a<f> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f36039a;

        public f(Context context) {
            super(context, MyGamePlugManagerActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f36039a;
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

        public f(Fragment fragment) {
            super(fragment.getActivity(), MyGamePlugManagerActivity_.class);
            this.f36039a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        this.f36023e = new PrefDef_(this);
        a4.c.b(this);
    }

    public static f p0(Context context) {
        return new f(context);
    }

    public static f q0(Fragment fragment) {
        return new f(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f36030k.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePlugManagerActivity
    public void h0(String str) {
        org.androidannotations.api.a.l(new e("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePlugManagerActivity
    public void i0(String str) {
        org.androidannotations.api.a.l(new d("", 0L, "", str));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePlugManagerActivity
    public void j0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePlugManagerActivity
    public void k0(String str) {
        org.androidannotations.api.a.l(new c("", 0L, "", str));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36029j);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_plug_manager);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36020b = (TextView) aVar.internalFindViewById(R.id.forum_title_center);
        this.f36021c = (XListView2) aVar.internalFindViewById(R.id.listView);
        this.f36022d = aVar.internalFindViewById(R.id.root);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f36030k.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f36029j.a(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f36029j.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f36029j.a(this);
    }
}
