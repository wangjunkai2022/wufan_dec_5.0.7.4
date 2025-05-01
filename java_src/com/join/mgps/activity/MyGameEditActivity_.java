package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MyGameEditActivity_ extends MyGameEditActivity implements y3.a, a4.a, a4.b {

    /* renamed from: t  reason: collision with root package name */
    private final a4.c f35677t = new a4.c();

    /* renamed from: u  reason: collision with root package name */
    private final Map<Class<?>, Object> f35678u = new HashMap();

    /* loaded from: classes4.dex */
    class a extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f35679b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f35679b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyGameEditActivity_.super.r0(this.f35679b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGameEditActivity_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGameEditActivity_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGameEditActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGameEditActivity_.this.o0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGameEditActivity_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35686b;

        g(String str) {
            this.f35686b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGameEditActivity_.super.u0(this.f35686b);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGameEditActivity_.super.n0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGameEditActivity_.super.y0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGameEditActivity_.super.q0();
        }
    }

    /* loaded from: classes4.dex */
    public static class k extends org.androidannotations.api.builder.a<k> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f35691a;

        public k(Context context) {
            super(context, MyGameEditActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f35691a;
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

        public k(Fragment fragment) {
            super(fragment.getActivity(), MyGameEditActivity_.class);
            this.f35691a = fragment;
        }
    }

    public static k F0(Context context) {
        return new k(context);
    }

    public static k G0(Fragment fragment) {
        return new k(fragment);
    }

    private void init_(Bundle bundle) {
        this.f35654h = new PrefDef_(this);
        a4.c.b(this);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f35678u.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGameEditActivity
    public void n0() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f35677t);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_mygame_edit);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f35649c = (ImageView) aVar.internalFindViewById(R.id.isSelector);
        this.f35650d = (ListView) aVar.internalFindViewById(R.id.listView);
        this.f35651e = (Button) aVar.internalFindViewById(R.id.editGameNumber);
        this.f35652f = (LinearLayout) aVar.internalFindViewById(R.id.noneLayout);
        View internalFindViewById = aVar.internalFindViewById(R.id.editAll);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.editCancel);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new b());
        }
        Button button = this.f35651e;
        if (button != null) {
            button.setOnClickListener(new c());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new d());
        }
        ImageView imageView = this.f35649c;
        if (imageView != null) {
            imageView.setOnClickListener(new e());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new f());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f35678u.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGameEditActivity
    public void q0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGameEditActivity
    public void r0(int i4) {
        org.androidannotations.api.a.l(new a("", 0L, "", i4));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f35677t.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGameEditActivity
    public void u0(String str) {
        org.androidannotations.api.b.e("", new g(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGameEditActivity
    public void y0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f35677t.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f35677t.a(this);
    }
}
