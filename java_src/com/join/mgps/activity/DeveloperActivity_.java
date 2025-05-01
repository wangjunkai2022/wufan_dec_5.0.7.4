package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class DeveloperActivity_ extends DeveloperActivity implements y3.a, a4.a, a4.b {

    /* renamed from: i  reason: collision with root package name */
    private final a4.c f29829i = new a4.c();

    /* renamed from: j  reason: collision with root package name */
    private final Map<Class<?>, Object> f29830j = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.A0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.B0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.y0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.z0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.t0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.u0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.D0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.p0();
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.s0();
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.x0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.v0();
        }
    }

    /* loaded from: classes4.dex */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeveloperActivity_.this.C0();
        }
    }

    /* loaded from: classes4.dex */
    public static class u extends org.androidannotations.api.builder.a<u> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f29851a;

        public u(Context context) {
            super(context, DeveloperActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f29851a;
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

        public u(Fragment fragment) {
            super(fragment.getActivity(), DeveloperActivity_.class);
            this.f29851a = fragment;
        }
    }

    public static u E0(Context context) {
        return new u(context);
    }

    public static u F0(Fragment fragment) {
        return new u(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f29830j.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f29829i);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_developer);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f29819b = (EditText) aVar.internalFindViewById(R.id.et_apk_path);
        View internalFindViewById = aVar.internalFindViewById(R.id.hideApp);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.install);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.mustpaly);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.btRegin);
        View internalFindViewById5 = aVar.internalFindViewById(R.id.launch);
        View internalFindViewById6 = aVar.internalFindViewById(R.id.btn_notify);
        View internalFindViewById7 = aVar.internalFindViewById(R.id.btn_download_finish);
        View internalFindViewById8 = aVar.internalFindViewById(R.id.btn_delete_file);
        View internalFindViewById9 = aVar.internalFindViewById(R.id.start_app);
        View internalFindViewById10 = aVar.internalFindViewById(R.id.btnRewardLoad);
        View internalFindViewById11 = aVar.internalFindViewById(R.id.btnRewardShow);
        View internalFindViewById12 = aVar.internalFindViewById(R.id.btnFCLoad);
        View internalFindViewById13 = aVar.internalFindViewById(R.id.btnFCShow);
        View internalFindViewById14 = aVar.internalFindViewById(R.id.btnTTTools);
        View internalFindViewById15 = aVar.internalFindViewById(R.id.btnVideo);
        View internalFindViewById16 = aVar.internalFindViewById(R.id.btn_install_a);
        View internalFindViewById17 = aVar.internalFindViewById(R.id.btn_install_b);
        View internalFindViewById18 = aVar.internalFindViewById(R.id.btnTestHtml);
        View internalFindViewById19 = aVar.internalFindViewById(R.id.btnQuarkShare);
        View internalFindViewById20 = aVar.internalFindViewById(R.id.btnCollectionSeven);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new k());
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
            internalFindViewById9.setOnClickListener(new t());
        }
        if (internalFindViewById10 != null) {
            internalFindViewById10.setOnClickListener(new a());
        }
        if (internalFindViewById11 != null) {
            internalFindViewById11.setOnClickListener(new b());
        }
        if (internalFindViewById12 != null) {
            internalFindViewById12.setOnClickListener(new c());
        }
        if (internalFindViewById13 != null) {
            internalFindViewById13.setOnClickListener(new d());
        }
        if (internalFindViewById14 != null) {
            internalFindViewById14.setOnClickListener(new e());
        }
        if (internalFindViewById15 != null) {
            internalFindViewById15.setOnClickListener(new f());
        }
        if (internalFindViewById16 != null) {
            internalFindViewById16.setOnClickListener(new g());
        }
        if (internalFindViewById17 != null) {
            internalFindViewById17.setOnClickListener(new h());
        }
        if (internalFindViewById18 != null) {
            internalFindViewById18.setOnClickListener(new i());
        }
        if (internalFindViewById19 != null) {
            internalFindViewById19.setOnClickListener(new j());
        }
        if (internalFindViewById20 != null) {
            internalFindViewById20.setOnClickListener(new l());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f29830j.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f29829i.a(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f29829i.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f29829i.a(this);
    }
}
