package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.VersionDto;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class DownloadSettingActivity_ extends DownloadSettingActivity implements y3.a, a4.a, a4.b {

    /* renamed from: z  reason: collision with root package name */
    private final a4.c f30043z = new a4.c();
    private final Map<Class<?>, Object> A = new HashMap();
    private final IntentFilter B = new IntentFilter();
    private final BroadcastReceiver C = new j();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadSettingActivity_.this.o0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadSettingActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadSettingActivity_.this.q0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadSettingActivity_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30048b;

        e(String str) {
            this.f30048b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadSettingActivity_.super.showToast(this.f30048b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30050b;

        f(String str) {
            this.f30050b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadSettingActivity_.super.error(this.f30050b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VersionDto f30052b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f30053c;

        g(VersionDto versionDto, boolean z4) {
            this.f30052b = versionDto;
            this.f30053c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadSettingActivity_.super.showVersionDownLoadHint(this.f30052b, this.f30053c);
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
                DownloadSettingActivity_.super.t0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {
        i(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DownloadSettingActivity_.super.l0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j extends BroadcastReceiver {
        j() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DownloadSettingActivity_.this.s0(intent);
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadSettingActivity_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadSettingActivity_.this.v0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadSettingActivity_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadSettingActivity_.this.u0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadSettingActivity_.this.p0();
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadSettingActivity_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadSettingActivity_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadSettingActivity_.this.r0();
        }
    }

    /* loaded from: classes4.dex */
    public static class s extends org.androidannotations.api.builder.a<s> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f30066a;

        public s(Context context) {
            super(context, DownloadSettingActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f30066a;
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

        public s(Fragment fragment) {
            super(fragment.getActivity(), DownloadSettingActivity_.class);
            this.f30066a = fragment;
        }
    }

    public static s B0(Context context) {
        return new s(context);
    }

    public static s C0(Fragment fragment) {
        return new s(fragment);
    }

    private void init_(Bundle bundle) {
        this.f30030q = new PrefDef_(this);
        a4.c.b(this);
        this.B.addAction(o1.a.f72022r);
        registerReceiver(this.C, this.B);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.DownloadSettingActivity
    public void error(String str) {
        org.androidannotations.api.b.e("", new f(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.A.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.join.mgps.activity.DownloadSettingActivity
    public void l0() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f30043z);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.download_setting_activity);
    }

    @Override // com.join.mgps.activity.DownloadSettingActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.C);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f30015b = (RelativeLayout) aVar.internalFindViewById(R.id.gprsNotice);
        this.f30016c = (RelativeLayout) aVar.internalFindViewById(R.id.downloadPath);
        this.f30017d = (ImageView) aVar.internalFindViewById(R.id.imageGprsNote);
        this.f30018e = (ImageView) aVar.internalFindViewById(R.id.imageViewWifi);
        this.f30019f = (ImageView) aVar.internalFindViewById(R.id.autoDownImageViewWifi);
        this.f30020g = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f30021h = (TextView) aVar.internalFindViewById(R.id.textWifi);
        this.f30022i = (TextView) aVar.internalFindViewById(R.id.nowPathInfo);
        this.f30023j = (TextView) aVar.internalFindViewById(R.id.textGprs);
        this.f30024k = (TextView) aVar.internalFindViewById(R.id.papaVer);
        this.f30025l = aVar.internalFindViewById(R.id.exitLogin);
        this.f30026m = aVar.internalFindViewById(R.id.accountManager);
        this.f30027n = (ImageView) aVar.internalFindViewById(R.id.autoPlayVideoWifi);
        this.f30028o = (RelativeLayout) aVar.internalFindViewById(R.id.rl_developer);
        View internalFindViewById = aVar.internalFindViewById(R.id.videoPlaySetting);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.pushLayout);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.autoDownLayoutWifi);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.back_image);
        View internalFindViewById5 = aVar.internalFindViewById(R.id.checkVerLayout);
        View view = this.f30026m;
        if (view != null) {
            view.setOnClickListener(new k());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new l());
        }
        ImageView imageView = this.f30027n;
        if (imageView != null) {
            imageView.setOnClickListener(new m());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new n());
        }
        View view2 = this.f30025l;
        if (view2 != null) {
            view2.setOnClickListener(new o());
        }
        ImageView imageView2 = this.f30019f;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new p());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new q());
        }
        RelativeLayout relativeLayout = this.f30015b;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new r());
        }
        RelativeLayout relativeLayout2 = this.f30016c;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new a());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new b());
        }
        RelativeLayout relativeLayout3 = this.f30028o;
        if (relativeLayout3 != null) {
            relativeLayout3.setOnClickListener(new c());
        }
        if (internalFindViewById5 != null) {
            internalFindViewById5.setOnClickListener(new d());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.A.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f30043z.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.DownloadSettingActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new e(str), 0L);
    }

    @Override // com.join.mgps.activity.DownloadSettingActivity
    public void showVersionDownLoadHint(VersionDto versionDto, boolean z4) {
        org.androidannotations.api.b.e("", new g(versionDto, z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.DownloadSettingActivity
    public void t0() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f30043z.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f30043z.a(this);
    }
}
