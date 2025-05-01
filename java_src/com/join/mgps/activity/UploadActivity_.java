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
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.UpLoadGameConfig;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class UploadActivity_ extends UploadActivity implements y3.a, a4.a, a4.b {
    private final a4.c P = new a4.c();
    private final Map<Class<?>, Object> Q = new HashMap();
    private final IntentFilter R = new IntentFilter();
    private final BroadcastReceiver S = new k();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UploadActivity_.this.B0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UploadActivity_.this.y0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UploadActivity_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UploadActivity_.this.z0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UploadActivity_.super.D0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UploadActivity_.super.A0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UploadActivity_.super.I0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UploadActivity_.super.H0();
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
                UploadActivity_.super.J0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f38358b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UpLoadGameConfig f38359c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ File f38360d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, long j4, String str2, Context context, UpLoadGameConfig upLoadGameConfig, File file) {
            super(str, j4, str2);
            this.f38358b = context;
            this.f38359c = upLoadGameConfig;
            this.f38360d = file;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                UploadActivity_.super.C0(this.f38358b, this.f38359c, this.f38360d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f38362b = "upload_result";

        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            UploadActivity_.this.E0((intent.getExtras() != null ? intent.getExtras() : new Bundle()).getInt("upload_result"));
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UploadActivity_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UploadActivity_.this.w0();
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UploadActivity_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UploadActivity_.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UploadActivity_.this.r0();
        }
    }

    /* loaded from: classes4.dex */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UploadActivity_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UploadActivity_.this.G0();
        }
    }

    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UploadActivity_.this.F0();
        }
    }

    /* loaded from: classes4.dex */
    public static class t extends org.androidannotations.api.builder.a<t> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f38372a;

        public t(Context context) {
            super(context, UploadActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f38372a;
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

        public t(Fragment fragment) {
            super(fragment.getActivity(), UploadActivity_.class);
            this.f38372a = fragment;
        }
    }

    public static t Q0(Context context) {
        return new t(context);
    }

    public static t R0(Fragment fragment) {
        return new t(fragment);
    }

    private void init_(Bundle bundle) {
        UploadActivity.J = new PrefDef_(this);
        a4.c.b(this);
        this.R.addAction(UploadActivity.N);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UploadActivity
    public void A0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    @Override // com.join.mgps.activity.UploadActivity
    public void C0(Context context, UpLoadGameConfig upLoadGameConfig, File file) {
        org.androidannotations.api.a.l(new j("", 0L, "", context, upLoadGameConfig, file));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UploadActivity
    public void D0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UploadActivity
    public void H0() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UploadActivity
    public void I0() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UploadActivity
    public void J0() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.Q.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.P);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.upload_layout);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        unregisterReceiver(this.S);
        super.onPause();
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        registerReceiver(this.S, this.R);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f38314i = (TextView) aVar.internalFindViewById(R.id.gameType);
        this.f38315j = (TextView) aVar.internalFindViewById(R.id.platformType);
        this.f38321p = (TextView) aVar.internalFindViewById(R.id.fileName);
        this.f38322q = (TextView) aVar.internalFindViewById(R.id.gameIcon);
        this.f38323r = (SimpleDraweeView) aVar.internalFindViewById(R.id.img_1);
        this.f38324s = (SimpleDraweeView) aVar.internalFindViewById(R.id.img_2);
        this.f38325t = (SimpleDraweeView) aVar.internalFindViewById(R.id.img_3);
        this.f38329x = (EditText) aVar.internalFindViewById(R.id.gameName);
        this.f38330y = (EditText) aVar.internalFindViewById(R.id.gameDsc);
        this.A = (ScrollView) aVar.internalFindViewById(R.id.lay_1);
        this.B = (LinearLayout) aVar.internalFindViewById(R.id.lay_2);
        this.C = (LinearLayout) aVar.internalFindViewById(R.id.lay_3);
        this.D = (LinearLayout) aVar.internalFindViewById(R.id.lay_4);
        this.E = (TextView) aVar.internalFindViewById(R.id.dscIngTxt);
        this.F = (TextView) aVar.internalFindViewById(R.id.dscFaildTxt);
        this.G = (TextView) aVar.internalFindViewById(R.id.dscSuccessTxt);
        View internalFindViewById = aVar.internalFindViewById(R.id.gameType_lay);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.platformType_lay);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.file_lay);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.gameIcon_lay);
        View internalFindViewById5 = aVar.internalFindViewById(R.id.img_lay);
        View internalFindViewById6 = aVar.internalFindViewById(R.id.backImage);
        View internalFindViewById7 = aVar.internalFindViewById(R.id.uploadDsc);
        View internalFindViewById8 = aVar.internalFindViewById(R.id.uploadBtn);
        View internalFindViewById9 = aVar.internalFindViewById(R.id.stopupload);
        View internalFindViewById10 = aVar.internalFindViewById(R.id.re_continue_upload);
        View internalFindViewById11 = aVar.internalFindViewById(R.id.continue_upload);
        View internalFindViewById12 = aVar.internalFindViewById(R.id.reupload);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new l());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new m());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new n());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new o());
        }
        if (internalFindViewById5 != null) {
            internalFindViewById5.setOnClickListener(new p());
        }
        if (internalFindViewById6 != null) {
            internalFindViewById6.setOnClickListener(new q());
        }
        if (internalFindViewById7 != null) {
            internalFindViewById7.setOnClickListener(new r());
        }
        if (internalFindViewById8 != null) {
            internalFindViewById8.setOnClickListener(new s());
        }
        if (internalFindViewById9 != null) {
            internalFindViewById9.setOnClickListener(new a());
        }
        if (internalFindViewById10 != null) {
            internalFindViewById10.setOnClickListener(new b());
        }
        if (internalFindViewById11 != null) {
            internalFindViewById11.setOnClickListener(new c());
        }
        if (internalFindViewById12 != null) {
            internalFindViewById12.setOnClickListener(new d());
        }
        afterView();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.Q.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.P.a(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.P.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.P.a(this);
    }
}
