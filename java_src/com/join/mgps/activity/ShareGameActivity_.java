package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.dto.GameShareData;
import com.zhy.view.flowlayout.TagFlowLayout;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class ShareGameActivity_ extends ShareGameActivity implements y3.a, a4.a, a4.b {
    public static final String X = "downloadTask";
    private final a4.c T = new a4.c();
    private final Map<Class<?>, Object> U = new HashMap();
    private final IntentFilter V = new IntentFilter();
    private final BroadcastReceiver W = new f();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareGameActivity_.super.n0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameShareData f37429b;

        b(GameShareData gameShareData) {
            this.f37429b = gameShareData;
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareGameActivity_.super.x0(this.f37429b);
        }
    }

    /* loaded from: classes4.dex */
    class c extends a.c {
        c(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ShareGameActivity_.super.loadData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37432b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f37432b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ShareGameActivity_.super.p0(this.f37432b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37434b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f37434b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ShareGameActivity_.super.o0(this.f37434b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f extends BroadcastReceiver {
        f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ShareGameActivity_.this.e0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ShareGameActivity_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ShareGameActivity_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ShareGameActivity_.this.back();
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ShareGameActivity_.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ShareGameActivity_.this.y0();
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ShareGameActivity_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ShareGameActivity_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ShareGameActivity_.this.w0();
        }
    }

    /* loaded from: classes4.dex */
    public static class o extends org.androidannotations.api.builder.a<o> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f37445a;

        public o(Context context) {
            super(context, ShareGameActivity_.class);
        }

        public o a(DownloadTask downloadTask) {
            return (o) super.extra("downloadTask", downloadTask);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f37445a;
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

        public o(Fragment fragment) {
            super(fragment.getActivity(), ShareGameActivity_.class);
            this.f37445a = fragment;
        }
    }

    public static o E0(Context context) {
        return new o(context);
    }

    public static o F0(Fragment fragment) {
        return new o(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
        this.V.addAction(o1.a.B);
        registerReceiver(this.W, this.V);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("downloadTask")) {
            return;
        }
        this.L = (DownloadTask) extras.getSerializable("downloadTask");
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.U.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareGameActivity
    public void loadData() {
        org.androidannotations.api.a.l(new c("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareGameActivity
    public void n0() {
        org.androidannotations.api.b.e("", new a(), 2000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareGameActivity
    public void o0(String str) {
        org.androidannotations.api.a.l(new e("", 0L, "", str));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.T);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_share_game);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.W);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f37393b = (SimpleDraweeView) aVar.internalFindViewById(R.id.titleImg);
        this.f37394c = (SimpleDraweeView) aVar.internalFindViewById(R.id.backImg);
        this.f37395d = (TextView) aVar.internalFindViewById(R.id.msg);
        this.f37396e = (TextView) aVar.internalFindViewById(R.id.msgEnd);
        this.f37397f = (TextView) aVar.internalFindViewById(R.id.appName);
        this.f37398g = (TextView) aVar.internalFindViewById(R.id.startGame);
        this.f37399h = (SimpleDraweeView) aVar.internalFindViewById(R.id.icon);
        this.f37400i = (SimpleDraweeView) aVar.internalFindViewById(R.id.userIcon);
        this.f37401j = (LinearLayout) aVar.internalFindViewById(R.id.sharMainlayout);
        this.f37402k = (LinearLayout) aVar.internalFindViewById(R.id.starLayout);
        this.f37403l = (LinearLayout) aVar.internalFindViewById(R.id.tipsLayout);
        this.f37404m = (LinearLayout) aVar.internalFindViewById(R.id.commitLayout);
        this.f37405n = (LinearLayout) aVar.internalFindViewById(R.id.startGameLayout);
        this.f37406o = (LinearLayout) aVar.internalFindViewById(R.id.sharEndlayout);
        this.f37407p = (LinearLayout) aVar.internalFindViewById(R.id.shareLayout);
        this.f37408q = (MStarBar) aVar.internalFindViewById(R.id.selecteStar);
        this.f37409r = (MStarBar) aVar.internalFindViewById(R.id.selecteStar2);
        this.f37410s = (MStarBar) aVar.internalFindViewById(R.id.selecteStar3);
        this.f37411t = (MStarBar) aVar.internalFindViewById(R.id.selecteStarEnd);
        this.f37412u = (SimpleDraweeView) aVar.internalFindViewById(R.id.userIcon2);
        this.f37413v = (SimpleDraweeView) aVar.internalFindViewById(R.id.userIcon3);
        this.f37414w = (SimpleDraweeView) aVar.internalFindViewById(R.id.titleImgEnd);
        this.f37415x = (SimpleDraweeView) aVar.internalFindViewById(R.id.iconEnd);
        this.f37416y = (SimpleDraweeView) aVar.internalFindViewById(R.id.userIconEnd);
        this.f37417z = (TextView) aVar.internalFindViewById(R.id.userName);
        this.A = (TextView) aVar.internalFindViewById(R.id.userName3);
        this.B = (TextView) aVar.internalFindViewById(R.id.commit);
        this.C = (TextView) aVar.internalFindViewById(R.id.appNameEnd);
        this.D = (TextView) aVar.internalFindViewById(R.id.userNameEnd);
        this.E = (TextView) aVar.internalFindViewById(R.id.selectedMessage);
        this.F = (TagFlowLayout) aVar.internalFindViewById(R.id.tips);
        this.G = (ImageView) aVar.internalFindViewById(R.id.zxing);
        this.H = (ImageView) aVar.internalFindViewById(R.id.back);
        this.I = (ImageView) aVar.internalFindViewById(R.id.notShow);
        this.J = (EditText) aVar.internalFindViewById(R.id.editText);
        this.K = (ImageView) aVar.internalFindViewById(R.id.closeImg);
        View internalFindViewById = aVar.internalFindViewById(R.id.qqLayout);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.weichartLayout);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.friendLayout);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.qZoneLayout);
        ImageView imageView = this.K;
        if (imageView != null) {
            imageView.setOnClickListener(new g());
        }
        ImageView imageView2 = this.I;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new h());
        }
        ImageView imageView3 = this.H;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new i());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new j());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new k());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new l());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new m());
        }
        TextView textView = this.f37398g;
        if (textView != null) {
            textView.setOnClickListener(new n());
        }
        afterView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareGameActivity
    public void p0(String str) {
        org.androidannotations.api.a.l(new d("", 0L, "", str));
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.U.put(cls, t4);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.T.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareGameActivity
    public void x0(GameShareData gameShareData) {
        org.androidannotations.api.b.e("", new b(gameShareData), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.T.a(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.T.a(this);
    }
}
