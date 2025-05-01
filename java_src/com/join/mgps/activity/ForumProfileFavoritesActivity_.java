package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
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
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.component.video.MyVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class ForumProfileFavoritesActivity_ extends ForumProfileFavoritesActivity implements y3.a, a4.a, a4.b {
    public static final String K1 = "extBean";
    private final a4.c G1 = new a4.c();
    private final Map<Class<?>, Object> H1 = new HashMap();
    private final IntentFilter I1 = new IntentFilter();
    private final BroadcastReceiver J1 = new k();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31015b;

        a(String str) {
            this.f31015b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileFavoritesActivity_.super.showToast(this.f31015b);
        }
    }

    /* loaded from: classes4.dex */
    public static class a0 extends org.androidannotations.api.builder.a<a0> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f31017a;

        public a0(Context context) {
            super(context, ForumProfileFavoritesActivity_.class);
        }

        public a0 a(ExtBean extBean) {
            return (a0) super.extra("extBean", extBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f31017a;
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

        public a0(Fragment fragment) {
            super(fragment.getActivity(), ForumProfileFavoritesActivity_.class);
            this.f31017a = fragment;
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileFavoritesActivity_.super.j1();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AbsListView f31019b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31020c;

        c(AbsListView absListView, int i4) {
            this.f31019b = absListView;
            this.f31020c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileFavoritesActivity_.super.w1(this.f31019b, this.f31020c);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AbsListView f31022b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31023c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31024d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f31025e;

        d(AbsListView absListView, int i4, int i5, int i6) {
            this.f31022b = absListView;
            this.f31023c = i4;
            this.f31024d = i5;
            this.f31025e = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileFavoritesActivity_.super.v1(this.f31022b, this.f31023c, this.f31024d, this.f31025e);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileFavoritesActivity_.super.i1();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31028b;

        f(String str) {
            this.f31028b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileFavoritesActivity_.super.showMessage(this.f31028b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f31030b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31031c;

        g(DownloadTask downloadTask, int i4) {
            this.f31030b = downloadTask;
            this.f31031c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileFavoritesActivity_.super.updateUI(this.f31030b, this.f31031c);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileFavoritesActivity_.super.updateDownloadView();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailResultBean f31034b;

        i(DetailResultBean detailResultBean) {
            this.f31034b = detailResultBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileFavoritesActivity_.super.startDown(this.f31034b);
        }
    }

    /* loaded from: classes4.dex */
    class j extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31036b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f31037c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, long j4, String str2, int i4, String str3) {
            super(str, j4, str2);
            this.f31036b = i4;
            this.f31037c = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumProfileFavoritesActivity_.super.l0(this.f31036b, this.f31037c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f31039b = "gameData";

        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ForumProfileFavoritesActivity_.this.M0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class l extends a.c {
        l(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumProfileFavoritesActivity_.super.B0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m extends a.c {
        m(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumProfileFavoritesActivity_.super.C0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31043b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f31043b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumProfileFavoritesActivity_.super.D0(this.f31043b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class o extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31045b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f31045b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumProfileFavoritesActivity_.super.R0(this.f31045b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f31047b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31048c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, long j4, String str2, Context context, int i4) {
            super(str, j4, str2);
            this.f31047b = context;
            this.f31048c = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumProfileFavoritesActivity_.super.p0(this.f31047b, this.f31048c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class q extends a.c {
        q(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumProfileFavoritesActivity_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class r extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31051b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f31051b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumProfileFavoritesActivity_.super.r0(this.f31051b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumProfileFavoritesActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ResultMainBean f31054b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31055c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f31056d;

        t(ResultMainBean resultMainBean, int i4, String str) {
            this.f31054b = resultMainBean;
            this.f31055c = i4;
            this.f31056d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileFavoritesActivity_.super.s1(this.f31054b, this.f31055c, this.f31056d);
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f31058b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31059c;

        u(List list, int i4) {
            this.f31058b = list;
            this.f31059c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileFavoritesActivity_.super.T0(this.f31058b, this.f31059c);
        }
    }

    /* loaded from: classes4.dex */
    class v implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31061b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f31062c;

        v(int i4, boolean z4) {
            this.f31061b = i4;
            this.f31062c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileFavoritesActivity_.super.I0(this.f31061b, this.f31062c);
        }
    }

    /* loaded from: classes4.dex */
    class w implements Runnable {
        w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileFavoritesActivity_.super.o1();
        }
    }

    /* loaded from: classes4.dex */
    class x implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31065b;

        x(int i4) {
            this.f31065b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileFavoritesActivity_.super.m0(this.f31065b);
        }
    }

    /* loaded from: classes4.dex */
    class y implements Runnable {
        y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileFavoritesActivity_.super.G0();
        }
    }

    /* loaded from: classes4.dex */
    class z implements Runnable {
        z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileFavoritesActivity_.super.g1();
        }
    }

    public static a0 V1(Context context) {
        return new a0(context);
    }

    public static a0 W1(Fragment fragment) {
        return new a0(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
        this.I1.addAction(o1.a.I);
        this.I1.addAction(o1.a.G);
        registerReceiver(this.J1, this.I1);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("extBean")) {
            return;
        }
        this.f30973m = (ExtBean) extras.getSerializable("extBean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void B0() {
        org.androidannotations.api.a.l(new l("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void C0() {
        org.androidannotations.api.a.l(new m("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void D0(int i4) {
        org.androidannotations.api.a.l(new n("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void G0() {
        org.androidannotations.api.b.e("", new y(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void I0(int i4, boolean z4) {
        org.androidannotations.api.b.e("", new v(i4, z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void R0(int i4) {
        org.androidannotations.api.a.l(new o("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void T0(List<ForumData.ForumUserFavoritesData> list, int i4) {
        org.androidannotations.api.b.e("", new u(list, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void g1() {
        org.androidannotations.api.b.e("", new z(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.H1.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new q("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void i1() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void j1() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void l0(int i4, String str) {
        org.androidannotations.api.a.l(new j("", 0L, "", i4, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void m0(int i4) {
        org.androidannotations.api.b.e("", new x(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void o1() {
        org.androidannotations.api.b.e("", new w(), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.G1);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.mg_forum_profile_favorites_activity);
    }

    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity, com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.J1);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f30962b = (RelativeLayout) aVar.internalFindViewById(R.id.actionbarLayout);
        this.f30963c = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f30964d = (TextView) aVar.internalFindViewById(R.id.layout_title);
        this.f30965e = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        this.f30969i = (XListView2) aVar.internalFindViewById(R.id.forum_posts_list);
        this.f30970j = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.G = (FrameLayout) aVar.internalFindViewById(R.id.videoContainer);
        this.H = (RelativeLayout) aVar.internalFindViewById(R.id.videoLayout);
        this.I = (MyVideoView) aVar.internalFindViewById(R.id.video);
        this.J = (SimpleDraweeView) aVar.internalFindViewById(R.id.cover);
        this.K = (ImageView) aVar.internalFindViewById(R.id.play);
        this.L = (LinearLayout) aVar.internalFindViewById(R.id.loadingLayout);
        ImageView imageView = this.f30963c;
        if (imageView != null) {
            imageView.setOnClickListener(new s());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void p0(Context context, int i4) {
        org.androidannotations.api.a.l(new p("", 0L, "", context, i4));
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.H1.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void r0(String str) {
        org.androidannotations.api.a.l(new r("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void s1(ResultMainBean resultMainBean, int i4, String str) {
        org.androidannotations.api.b.e("", new t(resultMainBean, i4, str), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.G1.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new f(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new a(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void startDown(DetailResultBean detailResultBean) {
        org.androidannotations.api.b.e("", new i(detailResultBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void updateUI(DownloadTask downloadTask, int i4) {
        org.androidannotations.api.b.e("", new g(downloadTask, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void v1(AbsListView absListView, int i4, int i5, int i6) {
        org.androidannotations.api.b.e("", new d(absListView, i4, i5, i6), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileFavoritesActivity
    public void w1(AbsListView absListView, int i4) {
        org.androidannotations.api.b.e("", new c(absListView, i4), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.G1.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.G1.a(this);
    }
}
