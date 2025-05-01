package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.FlowLayout;
import com.join.mgps.dto.GameTagsBean;
import com.join.mgps.dto.ListUserCustomGameTagBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class TagAddActivity_ extends TagAddActivity implements y3.a, a4.a, a4.b {
    public static final String D = "title";
    public static final String E = "gameId";

    /* renamed from: z  reason: collision with root package name */
    private final a4.c f37970z = new a4.c();
    private final Map<Class<?>, Object> A = new HashMap();
    private final IntentFilter B = new IntentFilter();
    private final BroadcastReceiver C = new k();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ListUserCustomGameTagBean f37971b;

        a(ListUserCustomGameTagBean listUserCustomGameTagBean) {
            this.f37971b = listUserCustomGameTagBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            TagAddActivity_.super.v0(this.f37971b);
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TagAddActivity_.super.i0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TagAddActivity_.super.u0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TagAddActivity_.super.m0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f37976b;

        e(List list) {
            this.f37976b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            TagAddActivity_.super.x0(this.f37976b);
        }
    }

    /* loaded from: classes4.dex */
    class f extends a.c {
        f(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                TagAddActivity_.super.o0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameTagsBean f37979b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, long j4, String str2, GameTagsBean gameTagsBean) {
            super(str, j4, str2);
            this.f37979b = gameTagsBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                TagAddActivity_.super.k0(this.f37979b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class h extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameTagsBean f37981b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, long j4, String str2, GameTagsBean gameTagsBean) {
            super(str, j4, str2);
            this.f37981b = gameTagsBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                TagAddActivity_.super.l0(this.f37981b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37983b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f37983b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                TagAddActivity_.super.h0(this.f37983b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37985b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f37985b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                TagAddActivity_.super.n0(this.f37985b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            TagAddActivity_.this.accountChange(intent);
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagAddActivity_.this.w0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagAddActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagAddActivity_.this.r0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagAddActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagAddActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TagAddActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TagAddActivity_.super.q0();
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TagAddActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    public static class t extends org.androidannotations.api.builder.a<t> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f37996a;

        public t(Context context) {
            super(context, TagAddActivity_.class);
        }

        public t a(String str) {
            return (t) super.extra("gameId", str);
        }

        public t b(String str) {
            return (t) super.extra("title", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f37996a;
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
            super(fragment.getActivity(), TagAddActivity_.class);
            this.f37996a = fragment;
        }
    }

    public static t L0(Context context) {
        return new t(context);
    }

    public static t M0(Fragment fragment) {
        return new t(fragment);
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        a4.c.b(this);
        this.f37942n = resources.getString(R.string.net_excption);
        this.f37943o = resources.getString(R.string.connect_server_excption);
        injectExtras_();
        this.B.addAction(o1.a.B);
        registerReceiver(this.C, this.B);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("title")) {
                this.f37934f = extras.getString("title");
            }
            if (extras.containsKey("gameId")) {
                this.f37935g = extras.getString("gameId");
            }
        }
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.A.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagAddActivity
    public void h0(String str) {
        org.androidannotations.api.a.l(new i("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagAddActivity
    public void i0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagAddActivity
    public void k0(GameTagsBean gameTagsBean) {
        org.androidannotations.api.a.l(new g("", 0L, "", gameTagsBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagAddActivity
    public void l0(GameTagsBean gameTagsBean) {
        org.androidannotations.api.a.l(new h("", 0L, "", gameTagsBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagAddActivity
    public void m0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagAddActivity
    public void n0(String str) {
        org.androidannotations.api.a.l(new j("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagAddActivity
    public void o0() {
        org.androidannotations.api.a.l(new f("", 0L, ""));
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f37970z);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_tag_add);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.C);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f37930b = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f37931c = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f37932d = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f37933e = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f37936h = (FlowLayout) aVar.internalFindViewById(R.id.fl_tag_all);
        this.f37937i = (FlowLayout) aVar.internalFindViewById(R.id.fl_tag_my);
        this.f37938j = (TextView) aVar.internalFindViewById(R.id.tv_tag_add);
        this.f37939k = (NestedScrollView) aVar.internalFindViewById(R.id.nsv_view);
        this.f37940l = (EditText) aVar.internalFindViewById(R.id.et_tag);
        this.f37941m = (ListView) aVar.internalFindViewById(R.id.lv_auto_search);
        View internalFindViewById = aVar.internalFindViewById(R.id.tv_report);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.ll_add_tag);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new l());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new m());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new n());
        }
        ImageView imageView = this.f37930b;
        if (imageView != null) {
            imageView.setOnClickListener(new o());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new p());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.A.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagAddActivity
    public void q0() {
        org.androidannotations.api.b.e("", new r(), 0L);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f37970z.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagAddActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new q(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagAddActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new s(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagAddActivity
    public void u0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagAddActivity
    public void v0(ListUserCustomGameTagBean listUserCustomGameTagBean) {
        org.androidannotations.api.b.e("", new a(listUserCustomGameTagBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagAddActivity
    public void x0(List<String> list) {
        org.androidannotations.api.b.e("", new e(list), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f37970z.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f37970z.a(this);
    }
}
