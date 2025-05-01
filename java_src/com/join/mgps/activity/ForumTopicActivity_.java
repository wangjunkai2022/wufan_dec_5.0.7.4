package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.video.MyVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView;
import com.join.mgps.dto.ExtBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class ForumTopicActivity_ extends ForumTopicActivity implements y3.a, a4.a, a4.b {
    public static final String R = "extBean";
    private final a4.c P = new a4.c();
    private final Map<Class<?>, Object> Q = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31344b;

        a(String str) {
            this.f31344b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumTopicActivity_.super.showMessage(this.f31344b);
        }
    }

    /* loaded from: classes4.dex */
    class b extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31346b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f31346b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumTopicActivity_.super.w0(this.f31346b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31348b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f31348b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumTopicActivity_.super.H0(this.f31348b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumTopicActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31351b;

        e(String str) {
            this.f31351b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumTopicActivity_.super.showToast(this.f31351b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumTopicActivity_.super.Z0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31354b;

        g(int i4) {
            this.f31354b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumTopicActivity_.super.h0(this.f31354b);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumTopicActivity_.super.O0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumTopicActivity_.super.z0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AbsListView f31358b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31359c;

        j(AbsListView absListView, int i4) {
            this.f31358b = absListView;
            this.f31359c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumTopicActivity_.super.f1(this.f31358b, this.f31359c);
        }
    }

    /* loaded from: classes4.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AbsListView f31361b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31362c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31363d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f31364e;

        k(AbsListView absListView, int i4, int i5, int i6) {
            this.f31361b = absListView;
            this.f31362c = i4;
            this.f31363d = i5;
            this.f31364e = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumTopicActivity_.super.e1(this.f31361b, this.f31362c, this.f31363d, this.f31364e);
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumTopicActivity_.super.V0();
        }
    }

    /* loaded from: classes4.dex */
    public static class m extends org.androidannotations.api.builder.a<m> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f31367a;

        public m(Context context) {
            super(context, ForumTopicActivity_.class);
        }

        public m a(ExtBean extBean) {
            return (m) super.extra("extBean", extBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f31367a;
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

        public m(Fragment fragment) {
            super(fragment.getActivity(), ForumTopicActivity_.class);
            this.f31367a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("extBean")) {
            return;
        }
        this.f31313k = (ExtBean) extras.getSerializable("extBean");
    }

    public static m r1(Context context) {
        return new m(context);
    }

    public static m s1(Fragment fragment) {
        return new m(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumTopicActivity
    public void H0(int i4) {
        org.androidannotations.api.a.l(new c("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumTopicActivity
    public void O0() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumTopicActivity
    public void V0() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumTopicActivity
    public void Z0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumTopicActivity
    public void e1(AbsListView absListView, int i4, int i5, int i6) {
        org.androidannotations.api.b.e("", new k(absListView, i4, i5, i6), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumTopicActivity
    public void f1(AbsListView absListView, int i4) {
        org.androidannotations.api.b.e("", new j(absListView, i4), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.Q.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumTopicActivity
    public void h0(int i4) {
        org.androidannotations.api.b.e("", new g(i4), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.P);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.mg_forum_forum_topic_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f31305c = (RelativeLayout) aVar.internalFindViewById(R.id.actionbarLayout);
        this.f31306d = (TextView) aVar.internalFindViewById(R.id.layout_title);
        this.f31307e = aVar.internalFindViewById(R.id.bottom);
        this.f31308f = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        this.f31309g = (XListView) aVar.internalFindViewById(R.id.listView);
        this.f31324v = (FrameLayout) aVar.internalFindViewById(R.id.videoContainer);
        this.f31325w = (RelativeLayout) aVar.internalFindViewById(R.id.videoLayout);
        this.f31326x = (MyVideoView) aVar.internalFindViewById(R.id.video);
        this.f31327y = (SimpleDraweeView) aVar.internalFindViewById(R.id.cover);
        this.f31328z = (ImageView) aVar.internalFindViewById(R.id.play);
        this.A = (LinearLayout) aVar.internalFindViewById(R.id.loadingLayout);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new d());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.Q.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.P.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumTopicActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new a(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumTopicActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new e(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumTopicActivity
    public void w0(int i4) {
        org.androidannotations.api.a.l(new b("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumTopicActivity
    public void z0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.P.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.P.a(this);
    }
}
