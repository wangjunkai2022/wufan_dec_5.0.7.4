package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.photoviewer.MultiTouchViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CustomCircleProgressBar;
import com.join.mgps.dto.EverdayLogin;
import java.util.HashMap;
import java.util.Map;
import me.relex.circleindicator.CircleIndicator;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class HomePopupAdQWActivity_ extends HomePopupAdQWActivity implements y3.a, a4.a, a4.b {
    public static final String C = "adJson";
    public static final String D = "everdayLogin";
    public static final String E = "isFromAccountCenter";

    /* renamed from: w  reason: collision with root package name */
    private final a4.c f34025w = new a4.c();

    /* renamed from: x  reason: collision with root package name */
    private final Map<Class<?>, Object> f34026x = new HashMap();

    /* renamed from: y  reason: collision with root package name */
    private final IntentFilter f34027y = new IntentFilter();

    /* renamed from: z  reason: collision with root package name */
    private final BroadcastReceiver f34028z = new a();
    private final IntentFilter A = new IntentFilter();
    private final BroadcastReceiver B = new b();

    /* loaded from: classes4.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            HomePopupAdQWActivity_.this.f(intent);
        }
    }

    /* loaded from: classes4.dex */
    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            HomePopupAdQWActivity_.this.d();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HomePopupAdQWActivity_.this.l();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34032b;

        d(String str) {
            this.f34032b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            HomePopupAdQWActivity_.super.m(this.f34032b);
        }
    }

    /* loaded from: classes4.dex */
    class e extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34034b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f34035c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, long j4, String str2, String str3, String str4) {
            super(str, j4, str2);
            this.f34034b = str3;
            this.f34035c = str4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                HomePopupAdQWActivity_.super.g(this.f34034b, this.f34035c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class f extends org.androidannotations.api.builder.a<f> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f34037a;

        public f(Context context) {
            super(context, HomePopupAdQWActivity_.class);
        }

        public f a(String str) {
            return (f) super.extra("adJson", str);
        }

        public f b(EverdayLogin everdayLogin) {
            return (f) super.extra("everdayLogin", everdayLogin);
        }

        public f c(boolean z4) {
            return (f) super.extra("isFromAccountCenter", z4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f34037a;
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

        public f(Fragment fragment) {
            super(fragment.getActivity(), HomePopupAdQWActivity_.class);
            this.f34037a = fragment;
        }
    }

    private void p(Bundle bundle) {
        a4.c.b(this);
        q();
        this.f34027y.addAction(o1.a.f72016o);
        this.A.addAction(o1.a.A);
        registerReceiver(this.f34028z, this.f34027y);
        registerReceiver(this.B, this.A);
    }

    private void q() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("adJson")) {
                this.f33991i = extras.getString("adJson");
            }
            if (extras.containsKey("everdayLogin")) {
                this.f33992j = (EverdayLogin) extras.getSerializable("everdayLogin");
            }
            if (extras.containsKey("isFromAccountCenter")) {
                this.f33993k = extras.getBoolean("isFromAccountCenter");
            }
        }
    }

    public static f r(Context context) {
        return new f(context);
    }

    public static f s(Fragment fragment) {
        return new f(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.HomePopupAdQWActivity
    public void g(String str, String str2) {
        org.androidannotations.api.a.l(new e("", 0L, "", str, str2));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f34026x.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.HomePopupAdQWActivity
    public void m(String str) {
        org.androidannotations.api.b.e("", new d(str), 0L);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f34025w);
        p(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.home_popup_adqw_activity);
    }

    @Override // com.join.mgps.activity.HomePopupAdQWActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.f34028z);
        unregisterReceiver(this.B);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f33984b = (SimpleDraweeView) aVar.internalFindViewById(R.id.more);
        this.f33985c = (MultiTouchViewPager) aVar.internalFindViewById(R.id.viewPager);
        this.f33986d = (CircleIndicator) aVar.internalFindViewById(R.id.indicator);
        this.f33987e = (CustomCircleProgressBar) aVar.internalFindViewById(R.id.progressBar);
        this.f33988f = (TextView) aVar.internalFindViewById(R.id.downFileName);
        this.f33989g = (TextView) aVar.internalFindViewById(R.id.install);
        this.f33990h = (RelativeLayout) aVar.internalFindViewById(R.id.downLoadlayout);
        View internalFindViewById = aVar.internalFindViewById(R.id.parentLayout);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new c());
        }
        e();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f34026x.put(cls, t4);
    }

    @Override // android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f34025w.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        q();
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f34025w.a(this);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f34025w.a(this);
    }
}
