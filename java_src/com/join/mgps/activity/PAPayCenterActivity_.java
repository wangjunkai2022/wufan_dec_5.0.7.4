package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView;
import com.join.mgps.dto.PapayResultData;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class PAPayCenterActivity_ extends PAPayCenterActivity implements y3.a, a4.a, a4.b {
    public static final String A = "intentFrom";

    /* renamed from: y  reason: collision with root package name */
    private final a4.c f36321y = new a4.c();

    /* renamed from: z  reason: collision with root package name */
    private final Map<Class<?>, Object> f36322z = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PAPayCenterActivity_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PAPayCenterActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PAPayCenterActivity_.super.o0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PAPayCenterActivity_.super.l0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PAPayCenterActivity_.super.j0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PapayResultData f36328b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f36329c;

        f(PapayResultData papayResultData, int i4) {
            this.f36328b = papayResultData;
            this.f36329c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            PAPayCenterActivity_.super.n0(this.f36328b, this.f36329c);
        }
    }

    /* loaded from: classes4.dex */
    class g extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.wufan.user.service.protobuf.n0 f36331b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f36332c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, long j4, String str2, com.wufan.user.service.protobuf.n0 n0Var, int i4) {
            super(str, j4, str2);
            this.f36331b = n0Var;
            this.f36332c = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PAPayCenterActivity_.super.k0(this.f36331b, this.f36332c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class h extends org.androidannotations.api.builder.a<h> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f36334a;

        public h(Context context) {
            super(context, PAPayCenterActivity_.class);
        }

        public h a(int i4) {
            return (h) super.extra("intentFrom", i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f36334a;
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

        public h(Fragment fragment) {
            super(fragment.getActivity(), PAPayCenterActivity_.class);
            this.f36334a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("intentFrom")) {
            return;
        }
        this.f36308p = extras.getInt("intentFrom");
    }

    public static h u0(Context context) {
        return new h(context);
    }

    public static h v0(Fragment fragment) {
        return new h(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f36322z.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PAPayCenterActivity
    public void j0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PAPayCenterActivity
    public void k0(com.wufan.user.service.protobuf.n0 n0Var, int i4) {
        org.androidannotations.api.a.l(new g("", 0L, "", n0Var, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PAPayCenterActivity
    public void l0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PAPayCenterActivity
    public void n0(PapayResultData papayResultData, int i4) {
        org.androidannotations.api.b.e("", new f(papayResultData, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PAPayCenterActivity
    public void o0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36321y);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.papapay_center_layout);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36294b = (XListView) aVar.internalFindViewById(R.id.xListView);
        this.f36295c = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f36305m = (TextView) aVar.internalFindViewById(R.id.aboutPabi);
        this.f36306n = (LinearLayout) aVar.internalFindViewById(R.id.nodata);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        TextView textView = this.f36305m;
        if (textView != null) {
            textView.setOnClickListener(new a());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new b());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f36322z.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f36321y.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f36321y.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f36321y.a(this);
    }
}
