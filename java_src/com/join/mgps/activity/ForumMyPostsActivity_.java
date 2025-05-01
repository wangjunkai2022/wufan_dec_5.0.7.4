package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
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
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class ForumMyPostsActivity_ extends ForumMyPostsActivity implements y3.a, a4.a, a4.b {
    private final a4.c H = new a4.c();
    private final Map<Class<?>, Object> I = new HashMap();
    private final IntentFilter J = new IntentFilter();
    private final BroadcastReceiver K = new g();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumMyPostsActivity_.super.D0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30545b;

        b(String str) {
            this.f30545b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumMyPostsActivity_.super.showMessage(this.f30545b);
        }
    }

    /* loaded from: classes4.dex */
    class c extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30547b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f30547b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumMyPostsActivity_.super.n0(this.f30547b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d extends a.c {
        d(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumMyPostsActivity_.super.s0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30550b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f30550b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumMyPostsActivity_.super.o0(this.f30550b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30552b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f30552b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumMyPostsActivity_.super.y0(this.f30552b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f30554b = "gameData";

        g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ForumMyPostsActivity_.this.x0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumMyPostsActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailResultBean f30557b;

        i(DetailResultBean detailResultBean) {
            this.f30557b = detailResultBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumMyPostsActivity_.super.startDown(this.f30557b);
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f30559b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f30560c;

        j(List list, int i4) {
            this.f30559b = list;
            this.f30560c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumMyPostsActivity_.super.G0(this.f30559b, this.f30560c);
        }
    }

    /* loaded from: classes4.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30562b;

        k(int i4) {
            this.f30562b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumMyPostsActivity_.super.k0(this.f30562b);
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumMyPostsActivity_.super.F0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30565b;

        m(String str) {
            this.f30565b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumMyPostsActivity_.super.showToast(this.f30565b);
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumMyPostsActivity_.super.u0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumMyPostsActivity_.super.E0();
        }
    }

    /* loaded from: classes4.dex */
    public static class p extends org.androidannotations.api.builder.a<p> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f30569a;

        public p(Context context) {
            super(context, ForumMyPostsActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f30569a;
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

        public p(Fragment fragment) {
            super(fragment.getActivity(), ForumMyPostsActivity_.class);
            this.f30569a = fragment;
        }
    }

    public static p V0(Context context) {
        return new p(context);
    }

    public static p W0(Fragment fragment) {
        return new p(fragment);
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        a4.c.b(this);
        this.f30515i = resources.getString(R.string.net_excption);
        this.f30516j = resources.getString(R.string.connect_server_excption);
        this.J.addAction(o1.a.I);
        this.J.addAction(o1.a.G);
        registerReceiver(this.K, this.J);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumMyPostsActivity
    public void D0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumMyPostsActivity
    public void E0() {
        org.androidannotations.api.b.e("", new o(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumMyPostsActivity
    public void F0() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumMyPostsActivity
    public void G0(List<ForumBean.ForumPostsBean> list, int i4) {
        org.androidannotations.api.b.e("", new j(list, i4), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.I.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumMyPostsActivity
    public void k0(int i4) {
        org.androidannotations.api.b.e("", new k(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumMyPostsActivity
    public void n0(String str) {
        org.androidannotations.api.a.l(new c("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumMyPostsActivity
    public void o0(int i4) {
        org.androidannotations.api.a.l(new e("", 0L, "", i4));
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.H);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_forum_my_post);
    }

    @Override // com.join.mgps.activity.ForumMyPostsActivity, com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.K);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f30508b = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f30509c = (TextView) aVar.internalFindViewById(R.id.layout_title);
        this.f30510d = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        this.f30511e = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f30512f = (XListView2) aVar.internalFindViewById(R.id.mg_forum_profile_comment_list);
        ImageView imageView = this.f30508b;
        if (imageView != null) {
            imageView.setOnClickListener(new h());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.I.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumMyPostsActivity
    public void s0() {
        org.androidannotations.api.a.l(new d("", 0L, ""));
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.H.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumMyPostsActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new b(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumMyPostsActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new m(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumMyPostsActivity
    public void startDown(DetailResultBean detailResultBean) {
        org.androidannotations.api.b.e("", new i(detailResultBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumMyPostsActivity
    public void u0() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumMyPostsActivity
    public void y0(int i4) {
        org.androidannotations.api.a.l(new f("", 0L, "", i4));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.H.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.H.a(this);
    }
}
