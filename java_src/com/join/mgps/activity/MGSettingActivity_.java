package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
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
public final class MGSettingActivity_ extends MGSettingActivity implements y3.a, a4.a, a4.b {

    /* renamed from: q  reason: collision with root package name */
    private final a4.c f34925q = new a4.c();

    /* renamed from: r  reason: collision with root package name */
    private final Map<Class<?>, Object> f34926r = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGSettingActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGSettingActivity_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGSettingActivity_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGSettingActivity_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGSettingActivity_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGSettingActivity_.super.l0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34933b;

        g(String str) {
            this.f34933b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGSettingActivity_.super.error(this.f34933b);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VersionDto f34935b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f34936c;

        h(VersionDto versionDto, boolean z4) {
            this.f34935b = versionDto;
            this.f34936c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGSettingActivity_.super.showVersionDownLoadHint(this.f34935b, this.f34936c);
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
                MGSettingActivity_.super.h0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class j extends org.androidannotations.api.builder.a<j> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f34939a;

        public j(Context context) {
            super(context, MGSettingActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f34939a;
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
            super(fragment.getActivity(), MGSettingActivity_.class);
            this.f34939a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        this.f34921m = new PrefDef_(this);
        a4.c.b(this);
    }

    public static j q0(Context context) {
        return new j(context);
    }

    public static j r0(Fragment fragment) {
        return new j(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGSettingActivity
    public void error(String str) {
        org.androidannotations.api.b.e("", new g(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f34926r.get(cls);
    }

    @Override // com.join.mgps.activity.MGSettingActivity
    public void h0() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGSettingActivity
    public void l0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f34925q);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.setting_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f34914f = (RelativeLayout) aVar.internalFindViewById(R.id.checkVerLayout);
        this.f34915g = (RelativeLayout) aVar.internalFindViewById(R.id.responsibility);
        this.f34916h = (RelativeLayout) aVar.internalFindViewById(R.id.papaAboutLayout);
        this.f34917i = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f34918j = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f34919k = (TextView) aVar.internalFindViewById(R.id.papaVer);
        this.f34920l = (TextView) aVar.internalFindViewById(R.id.about);
        View internalFindViewById = aVar.internalFindViewById(R.id.shareToFrendsLayout);
        ImageView imageView = this.f34918j;
        if (imageView != null) {
            imageView.setOnClickListener(new a());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new b());
        }
        RelativeLayout relativeLayout = this.f34914f;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new c());
        }
        RelativeLayout relativeLayout2 = this.f34916h;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new d());
        }
        RelativeLayout relativeLayout3 = this.f34915g;
        if (relativeLayout3 != null) {
            relativeLayout3.setOnClickListener(new e());
        }
        f0();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f34926r.put(cls, t4);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f34925q.a(this);
    }

    @Override // com.join.mgps.activity.MGSettingActivity
    public void showVersionDownLoadHint(VersionDto versionDto, boolean z4) {
        org.androidannotations.api.b.e("", new h(versionDto, z4), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f34925q.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f34925q.a(this);
    }
}
