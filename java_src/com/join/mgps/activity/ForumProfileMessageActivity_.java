package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.ForumBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class ForumProfileMessageActivity_ extends ForumProfileMessageActivity implements y3.a, a4.a, a4.b {

    /* renamed from: x  reason: collision with root package name */
    private final a4.c f31099x = new a4.c();

    /* renamed from: y  reason: collision with root package name */
    private final Map<Class<?>, Object> f31100y = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumProfileMessageActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f31102b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31103c;

        b(List list, int i4) {
            this.f31102b = list;
            this.f31103c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageActivity_.super.x0(this.f31102b, this.f31103c);
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31105b;

        c(int i4) {
            this.f31105b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageActivity_.super.k0(this.f31105b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageActivity_.super.w0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageActivity_.super.s0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31109b;

        f(String str) {
            this.f31109b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageActivity_.super.showToast(this.f31109b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageActivity_.super.v0();
        }
    }

    /* loaded from: classes4.dex */
    class h extends a.c {
        h(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumProfileMessageActivity_.super.q0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31113b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f31113b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumProfileMessageActivity_.super.n0(this.f31113b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class j extends org.androidannotations.api.builder.a<j> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f31115a;

        public j(Context context) {
            super(context, ForumProfileMessageActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f31115a;
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

        public j(Fragment fragment) {
            super(fragment.getActivity(), ForumProfileMessageActivity_.class);
            this.f31115a = fragment;
        }
    }

    public static j G0(Context context) {
        return new j(context);
    }

    public static j H0(Fragment fragment) {
        return new j(fragment);
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        a4.c.b(this);
        this.f31076i = resources.getString(R.string.net_excption);
        this.f31077j = resources.getString(R.string.connect_server_excption);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f31100y.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageActivity
    public void k0(int i4) {
        org.androidannotations.api.b.e("", new c(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageActivity
    public void n0(int i4) {
        org.androidannotations.api.a.l(new i("", 0L, "", i4));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f31099x);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.mg_forum_profile_message_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f31069b = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f31070c = (TextView) aVar.internalFindViewById(R.id.layout_title);
        this.f31071d = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        this.f31072e = (XListView2) aVar.internalFindViewById(R.id.mg_forum_profile_message_list);
        ImageView imageView = this.f31069b;
        if (imageView != null) {
            imageView.setOnClickListener(new a());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f31100y.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageActivity
    public void q0() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageActivity
    public void s0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f31099x.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new f(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageActivity
    public void v0() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageActivity
    public void w0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageActivity
    public void x0(List<ForumBean.ForumProfileMessageBean> list, int i4) {
        org.androidannotations.api.b.e("", new b(list, i4), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f31099x.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f31099x.a(this);
    }
}
