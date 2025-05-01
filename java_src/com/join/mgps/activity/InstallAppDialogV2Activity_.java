package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class InstallAppDialogV2Activity_ extends InstallAppDialogV2Activity implements y3.a, a4.a, a4.b {

    /* renamed from: k  reason: collision with root package name */
    public static final String f34086k = "gameId";

    /* renamed from: l  reason: collision with root package name */
    public static final String f34087l = "title";

    /* renamed from: m  reason: collision with root package name */
    public static final String f34088m = "cover";

    /* renamed from: i  reason: collision with root package name */
    private final a4.c f34089i = new a4.c();

    /* renamed from: j  reason: collision with root package name */
    private final Map<Class<?>, Object> f34090j = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InstallAppDialogV2Activity_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InstallAppDialogV2Activity_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InstallAppDialogV2Activity_.super.i0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34094b;

        d(String str) {
            this.f34094b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            InstallAppDialogV2Activity_.super.showToast(this.f34094b);
        }
    }

    /* loaded from: classes4.dex */
    public static class e extends org.androidannotations.api.builder.a<e> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f34096a;

        public e(Context context) {
            super(context, InstallAppDialogV2Activity_.class);
        }

        public e a(String str) {
            return (e) super.extra(InstallAppDialogV2Activity_.f34088m, str);
        }

        public e b(String str) {
            return (e) super.extra("gameId", str);
        }

        public e c(String str) {
            return (e) super.extra("title", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f34096a;
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

        public e(Fragment fragment) {
            super(fragment.getActivity(), InstallAppDialogV2Activity_.class);
            this.f34096a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("gameId")) {
                this.f34082e = extras.getString("gameId");
            }
            if (extras.containsKey("title")) {
                this.f34083f = extras.getString("title");
            }
            if (extras.containsKey(f34088m)) {
                this.f34084g = extras.getString(f34088m);
            }
        }
    }

    public static e l0(Context context) {
        return new e(context);
    }

    public static e m0(Fragment fragment) {
        return new e(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f34090j.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.InstallAppDialogV2Activity
    public void i0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f34089i);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_install_app_dialog_v2);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f34079b = (SimpleDraweeView) aVar.internalFindViewById(R.id.gameImg);
        this.f34080c = (TextView) aVar.internalFindViewById(R.id.tvGameName);
        this.f34081d = (TextView) aVar.internalFindViewById(R.id.tvDesc);
        View internalFindViewById = aVar.internalFindViewById(R.id.tvInstall);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.ivClose);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new b());
        }
        afterviews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f34090j.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f34089i.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.InstallAppDialogV2Activity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new d(str), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f34089i.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f34089i.a(this);
    }
}
