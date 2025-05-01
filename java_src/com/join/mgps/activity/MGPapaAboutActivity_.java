package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MGPapaAboutActivity_ extends MGPapaAboutActivity implements y3.a, a4.a, a4.b {

    /* renamed from: o  reason: collision with root package name */
    private final a4.c f34902o = new a4.c();

    /* renamed from: p  reason: collision with root package name */
    private final Map<Class<?>, Object> f34903p = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGPapaAboutActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f34905b;

        b(List list) {
            this.f34905b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGPapaAboutActivity_.super.p0(this.f34905b);
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGPapaAboutActivity_.super.o0();
        }
    }

    /* loaded from: classes4.dex */
    class d extends a.c {
        d(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGPapaAboutActivity_.super.j0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class e extends org.androidannotations.api.builder.a<e> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f34909a;

        public e(Context context) {
            super(context, MGPapaAboutActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f34909a;
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
            super(fragment.getActivity(), MGPapaAboutActivity_.class);
            this.f34909a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        this.f34893k = new PrefDef_(this);
        a4.c.b(this);
    }

    public static e t0(Context context) {
        return new e(context);
    }

    public static e u0(Fragment fragment) {
        return new e(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f34903p.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGPapaAboutActivity
    public void j0() {
        org.androidannotations.api.a.l(new d("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGPapaAboutActivity
    public void o0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f34902o);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.about_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f34888f = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f34889g = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f34890h = (TextView) aVar.internalFindViewById(R.id.tv_version);
        this.f34891i = (RecyclerView) aVar.internalFindViewById(R.id.rv_menu_list);
        this.f34892j = (RecyclerView) aVar.internalFindViewById(R.id.rv_sub_menu_list);
        ImageView imageView = this.f34889g;
        if (imageView != null) {
            imageView.setOnClickListener(new a());
        }
        h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGPapaAboutActivity
    public void p0(List<CommonGameInfoBean> list) {
        org.androidannotations.api.b.e("", new b(list), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f34903p.put(cls, t4);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f34902o.a(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f34902o.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f34902o.a(this);
    }
}
