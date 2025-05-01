package com.join.mgps.activity.message;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.JPushJoinDeviceResult;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MessageSettingActivity_ extends MessageSettingActivity implements y3.a, a4.a, a4.b {

    /* renamed from: g  reason: collision with root package name */
    private final a4.c f39389g = new a4.c();

    /* renamed from: h  reason: collision with root package name */
    private final Map<Class<?>, Object> f39390h = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MessageSettingActivity_.this.back();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MessageSettingActivity_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MessageSettingActivity_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MessageSettingActivity_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccountResultMainBean f39395b;

        e(AccountResultMainBean accountResultMainBean) {
            this.f39395b = accountResultMainBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MessageSettingActivity_.super.g0(this.f39395b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MessageSettingActivity_.super.f0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccountResultMainBean f39398b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f39399c;

        g(AccountResultMainBean accountResultMainBean, int i4) {
            this.f39398b = accountResultMainBean;
            this.f39399c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MessageSettingActivity_.super.m0(this.f39398b, this.f39399c);
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
                MessageSettingActivity_.super.h0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f39402b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f39402b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MessageSettingActivity_.super.l0(this.f39402b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class j extends org.androidannotations.api.builder.a<j> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f39404a;

        public j(Context context) {
            super(context, MessageSettingActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f39404a;
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
            super(fragment.getActivity(), MessageSettingActivity_.class);
            this.f39404a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static j s0(Context context) {
        return new j(context);
    }

    public static j t0(Fragment fragment) {
        return new j(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessageSettingActivity
    public void f0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessageSettingActivity
    public void g0(AccountResultMainBean<JPushJoinDeviceResult> accountResultMainBean) {
        org.androidannotations.api.b.e("", new e(accountResultMainBean), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f39390h.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessageSettingActivity
    public void h0() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessageSettingActivity
    public void l0(int i4) {
        org.androidannotations.api.a.l(new i("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessageSettingActivity
    public void m0(AccountResultMainBean<JPushJoinDeviceResult> accountResultMainBean, int i4) {
        org.androidannotations.api.b.e("", new g(accountResultMainBean, i4), 0L);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f39389g);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_message_setting);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f39384b = (ImageView) aVar.internalFindViewById(R.id.isGetMessageIv);
        this.f39385c = (ImageView) aVar.internalFindViewById(R.id.isGetReplayIv);
        this.f39386d = (ImageView) aVar.internalFindViewById(R.id.isGetLikeIv);
        View internalFindViewById = aVar.internalFindViewById(R.id.back);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        ImageView imageView = this.f39384b;
        if (imageView != null) {
            imageView.setOnClickListener(new b());
        }
        ImageView imageView2 = this.f39385c;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new c());
        }
        ImageView imageView3 = this.f39386d;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new d());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f39390h.put(cls, t4);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f39389g.a(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f39389g.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f39389g.a(this);
    }
}
