package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.LabelBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class SearchLabelActivity_ extends SearchLabelActivity implements y3.a, a4.a, a4.b {

    /* renamed from: r  reason: collision with root package name */
    public static final String f37301r = "fromType";

    /* renamed from: p  reason: collision with root package name */
    private final a4.c f37302p = new a4.c();

    /* renamed from: q  reason: collision with root package name */
    private final Map<Class<?>, Object> f37303q = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchLabelActivity_.this.g();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchLabelActivity_.this.h();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchLabelActivity_.this.b();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f37307b;

        d(List list) {
            this.f37307b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchLabelActivity_.super.l(this.f37307b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchLabelActivity_.super.j();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchLabelActivity_.super.i();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchLabelActivity_.super.e();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37312b;

        h(String str) {
            this.f37312b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchLabelActivity_.super.k(this.f37312b);
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37314b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f37314b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SearchLabelActivity_.super.c(this.f37314b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class j extends org.androidannotations.api.builder.a<j> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f37316a;

        public j(Context context) {
            super(context, SearchLabelActivity_.class);
        }

        public j a(int i4) {
            return (j) super.extra("fromType", i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f37316a;
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
            super(fragment.getActivity(), SearchLabelActivity_.class);
            this.f37316a = fragment;
        }
    }

    private void s(Bundle bundle) {
        a4.c.b(this);
        this.f37289m = AccountUtil_.getInstance_(this);
        t();
    }

    private void t() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("fromType")) {
            return;
        }
        this.f37278b = extras.getInt("fromType");
    }

    public static j u(Context context) {
        return new j(context);
    }

    public static j v(Fragment fragment) {
        return new j(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchLabelActivity
    public void c(String str) {
        org.androidannotations.api.a.l(new i("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchLabelActivity
    public void e() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f37303q.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchLabelActivity
    public void i() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchLabelActivity
    public void j() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchLabelActivity
    public void k(String str) {
        org.androidannotations.api.b.e("", new h(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchLabelActivity
    public void l(List<LabelBean> list) {
        org.androidannotations.api.b.e("", new d(list), 0L);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f37302p);
        s(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_search_label);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f37279c = (ListView) aVar.internalFindViewById(R.id.mListView);
        this.f37280d = (ImageView) aVar.internalFindViewById(R.id.ic_clear);
        this.f37281e = (EditText) aVar.internalFindViewById(R.id.et_search);
        this.f37282f = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f37283g = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f37287k = (TextView) aVar.internalFindViewById(R.id.tv_nodata);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.back_image);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new b());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new c());
        }
        a();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f37303q.put(cls, t4);
    }

    @Override // android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f37302p.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        t();
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f37302p.a(this);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f37302p.a(this);
    }
}
