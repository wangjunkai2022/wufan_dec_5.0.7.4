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
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GameSearchFavoriteActivity_ extends GameSearchFavoriteActivity implements y3.a, a4.a, a4.b {

    /* renamed from: y  reason: collision with root package name */
    public static final String f32782y = "type";

    /* renamed from: w  reason: collision with root package name */
    private final a4.c f32783w = new a4.c();

    /* renamed from: x  reason: collision with root package name */
    private final Map<Class<?>, Object> f32784x = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameSearchFavoriteActivity_.this.d();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameSearchFavoriteActivity_.this.j();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameSearchFavoriteActivity_.this.k();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f32788b;

        d(List list) {
            this.f32788b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSearchFavoriteActivity_.super.o(this.f32788b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSearchFavoriteActivity_.super.m();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSearchFavoriteActivity_.super.l();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSearchFavoriteActivity_.super.h();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32793b;

        h(String str) {
            this.f32793b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSearchFavoriteActivity_.super.n(this.f32793b);
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
                GameSearchFavoriteActivity_.super.e();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class j extends org.androidannotations.api.builder.a<j> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f32796a;

        public j(Context context) {
            super(context, GameSearchFavoriteActivity_.class);
        }

        public j a(int i4) {
            return (j) super.extra("type", i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f32796a;
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
            super(fragment.getActivity(), GameSearchFavoriteActivity_.class);
            this.f32796a = fragment;
        }
    }

    private void v(Bundle bundle) {
        a4.c.b(this);
        this.f32770m = AccountUtil_.getInstance_(this);
        w();
    }

    private void w() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("type")) {
            return;
        }
        this.f32759b = extras.getInt("type");
    }

    public static j x(Context context) {
        return new j(context);
    }

    public static j y(Fragment fragment) {
        return new j(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameSearchFavoriteActivity
    public void e() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f32784x.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameSearchFavoriteActivity
    public void h() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameSearchFavoriteActivity
    public void l() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameSearchFavoriteActivity
    public void m() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameSearchFavoriteActivity
    public void n(String str) {
        org.androidannotations.api.b.e("", new h(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameSearchFavoriteActivity
    public void o(List<CollectionBeanSub> list) {
        org.androidannotations.api.b.e("", new d(list), 0L);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f32783w);
        v(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_game_search_favorite);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f32760c = (EditText) aVar.internalFindViewById(R.id.et_search);
        this.f32761d = (RelativeLayout) aVar.internalFindViewById(R.id.rl_normal);
        this.f32762e = (RelativeLayout) aVar.internalFindViewById(R.id.rl_search);
        this.f32763f = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f32764g = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f32765h = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f32766i = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f32767j = (XListView2) aVar.internalFindViewById(R.id.mListView);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        ImageView imageView = this.f32763f;
        if (imageView != null) {
            imageView.setOnClickListener(new a());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new b());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new c());
        }
        c();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f32784x.put(cls, t4);
    }

    @Override // android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f32783w.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        w();
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f32783w.a(this);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f32783w.a(this);
    }
}
