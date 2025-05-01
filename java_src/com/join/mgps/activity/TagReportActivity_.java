package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.FlowLayout;
import com.join.mgps.dto.ListUserCustomGameTagBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class TagReportActivity_ extends TagReportActivity implements y3.a, a4.a, a4.b {

    /* renamed from: r  reason: collision with root package name */
    public static final String f38067r = "gameId";

    /* renamed from: s  reason: collision with root package name */
    public static final String f38068s = "reportTags";

    /* renamed from: p  reason: collision with root package name */
    private final a4.c f38069p = new a4.c();

    /* renamed from: q  reason: collision with root package name */
    private final Map<Class<?>, Object> f38070q = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TagReportActivity_.super.h0();
        }
    }

    /* loaded from: classes4.dex */
    class b extends a.c {
        b(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                TagReportActivity_.super.i0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38073b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f38074c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, long j4, String str2, String str3, int i4) {
            super(str, j4, str2);
            this.f38073b = str3;
            this.f38074c = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                TagReportActivity_.super.k0(this.f38073b, this.f38074c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagReportActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagReportActivity_.this.onCommit();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagReportActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagReportActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TagReportActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ListUserCustomGameTagBean f38081b;

        i(ListUserCustomGameTagBean listUserCustomGameTagBean) {
            this.f38081b = listUserCustomGameTagBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            TagReportActivity_.super.m0(this.f38081b);
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TagReportActivity_.super.j0();
        }
    }

    /* loaded from: classes4.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TagReportActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TagReportActivity_.super.l0();
        }
    }

    /* loaded from: classes4.dex */
    public static class m extends org.androidannotations.api.builder.a<m> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f38086a;

        public m(Context context) {
            super(context, TagReportActivity_.class);
        }

        public m a(String str) {
            return (m) super.extra("gameId", str);
        }

        public m b(ListUserCustomGameTagBean listUserCustomGameTagBean) {
            return (m) super.extra(TagReportActivity_.f38068s, listUserCustomGameTagBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f38086a;
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

        public m(Fragment fragment) {
            super(fragment.getActivity(), TagReportActivity_.class);
            this.f38086a = fragment;
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
                this.f38050c = extras.getString("gameId");
            }
            if (extras.containsKey(f38068s)) {
                this.f38057j = (ListUserCustomGameTagBean) extras.getSerializable(f38068s);
            }
        }
    }

    public static m v0(Context context) {
        return new m(context);
    }

    public static m w0(Fragment fragment) {
        return new m(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f38070q.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagReportActivity
    public void h0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagReportActivity
    public void i0() {
        org.androidannotations.api.a.l(new b("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagReportActivity
    public void j0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagReportActivity
    public void k0(String str, int i4) {
        org.androidannotations.api.a.l(new c("", 0L, "", str, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagReportActivity
    public void l0() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagReportActivity
    public void m0(ListUserCustomGameTagBean listUserCustomGameTagBean) {
        org.androidannotations.api.b.e("", new i(listUserCustomGameTagBean), 0L);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f38069p);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_tag_report);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f38051d = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f38052e = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f38053f = (FlowLayout) aVar.internalFindViewById(R.id.fl_tag_all);
        this.f38054g = (ListView) aVar.internalFindViewById(R.id.lv_reasons);
        this.f38055h = (EditText) aVar.internalFindViewById(R.id.et_reason_text);
        this.f38056i = (Button) aVar.internalFindViewById(R.id.btn_commit);
        this.f38058k = (TextView) aVar.internalFindViewById(R.id.title_textview);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.back_image);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new d());
        }
        Button button = this.f38056i;
        if (button != null) {
            button.setOnClickListener(new e());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new f());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new g());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f38070q.put(cls, t4);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f38069p.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagReportActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagReportActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new k(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f38069p.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f38069p.a(this);
    }
}
