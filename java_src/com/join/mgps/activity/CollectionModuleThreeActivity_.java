package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MViewpagerV4;
import com.join.mgps.dto.CollectionDataBeanInfo;
import com.join.mgps.dto.ExtBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class CollectionModuleThreeActivity_ extends CollectionModuleThreeActivity implements y3.a, a4.a, a4.b {

    /* renamed from: w  reason: collision with root package name */
    public static final String f29246w = "collection_id";

    /* renamed from: x  reason: collision with root package name */
    public static final String f29247x = "extBean";

    /* renamed from: u  reason: collision with root package name */
    private final a4.c f29248u = new a4.c();

    /* renamed from: v  reason: collision with root package name */
    private final Map<Class<?>, Object> f29249v = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleThreeActivity_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleThreeActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleThreeActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleThreeActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleThreeActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f29255b;

        f(List list) {
            this.f29255b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleThreeActivity_.super.k0(this.f29255b);
        }
    }

    /* loaded from: classes4.dex */
    class g extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29257b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f29257b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CollectionModuleThreeActivity_.super.h0(this.f29257b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class h extends org.androidannotations.api.builder.a<h> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f29259a;

        public h(Context context) {
            super(context, CollectionModuleThreeActivity_.class);
        }

        public h a(String str) {
            return (h) super.extra("collection_id", str);
        }

        public h b(ExtBean extBean) {
            return (h) super.extra("extBean", extBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f29259a;
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
            super(fragment.getActivity(), CollectionModuleThreeActivity_.class);
            this.f29259a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("collection_id")) {
                this.f29242r = extras.getString("collection_id");
            }
            if (extras.containsKey("extBean")) {
                this.f29243s = (ExtBean) extras.getSerializable("extBean");
            }
        }
    }

    public static h p0(Context context) {
        return new h(context);
    }

    public static h q0(Fragment fragment) {
        return new h(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f29249v.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleThreeActivity
    public void h0(String str) {
        org.androidannotations.api.a.l(new g("", 0L, "", str));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleThreeActivity
    public void k0(List<CollectionDataBeanInfo> list) {
        org.androidannotations.api.b.e("", new f(list), 0L);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f29248u);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.collection_three_fragment_layout);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f29230f = (MViewpagerV4) aVar.internalFindViewById(R.id.mBottomVIewPager);
        this.f29231g = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f29232h = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f29233i = (RelativeLayout) aVar.internalFindViewById(R.id.relateLayoutRight);
        this.f29234j = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        this.f29235k = (ImageView) aVar.internalFindViewById(R.id.img_iconback);
        this.f29236l = (TextView) aVar.internalFindViewById(R.id.textViewTitle);
        this.f29237m = (TextView) aVar.internalFindViewById(R.id.textViewPosition);
        this.f29238n = (TextView) aVar.internalFindViewById(R.id.textViewTime);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        ImageView imageView = this.f29235k;
        if (imageView != null) {
            imageView.setOnClickListener(new a());
        }
        ImageView imageView2 = this.f29234j;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new b());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new c());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f29249v.put(cls, t4);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f29248u.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleThreeActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleThreeActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f29248u.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f29248u.a(this);
    }
}
