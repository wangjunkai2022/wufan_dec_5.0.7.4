package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import it.sephiroth.android.library.widget.HListView;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class SharePostsActivity_ extends SharePostsActivity implements y3.a, a4.a, a4.b {
    private final a4.c F = new a4.c();
    private final Map<Class<?>, Object> G = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharePostsActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharePostsActivity_.this.x0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37497b;

        c(String str) {
            this.f37497b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SharePostsActivity_.super.showToast(this.f37497b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37499b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37500c;

        d(int i4, int i5) {
            this.f37499b = i4;
            this.f37500c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            SharePostsActivity_.super.B0(this.f37499b, this.f37500c);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37502b;

        e(int i4) {
            this.f37502b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SharePostsActivity_.super.C0(this.f37502b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37504b;

        f(String str) {
            this.f37504b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SharePostsActivity_.super.showMessage(this.f37504b);
        }
    }

    /* loaded from: classes4.dex */
    class g extends a.c {
        g(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SharePostsActivity_.super.p0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class h extends org.androidannotations.api.builder.a<h> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f37507a;

        public h(Context context) {
            super(context, SharePostsActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f37507a;
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
            super(fragment.getActivity(), SharePostsActivity_.class);
            this.f37507a = fragment;
        }
    }

    public static h I0(Context context) {
        return new h(context);
    }

    public static h J0(Fragment fragment) {
        return new h(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SharePostsActivity
    public void B0(int i4, int i5) {
        org.androidannotations.api.b.e("", new d(i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SharePostsActivity
    public void C0(int i4) {
        org.androidannotations.api.b.e("", new e(i4), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.G.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.F);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.share_posts_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f37447c = (TextView) aVar.internalFindViewById(R.id.layout_title);
        this.f37448d = (Button) aVar.internalFindViewById(R.id.release);
        this.f37449e = (TextView) aVar.internalFindViewById(R.id.posts_title);
        this.f37450f = (TextView) aVar.internalFindViewById(R.id.posts_content);
        this.f37451g = (HListView) aVar.internalFindViewById(R.id.posts_pic_hlist);
        this.f37452h = (TextView) aVar.internalFindViewById(R.id.footer_tip);
        this.f37465u = (LinearLayout) aVar.internalFindViewById(R.id.helpContainer);
        this.f37466v = (GridView) aVar.internalFindViewById(R.id.helpGrid);
        this.f37467w = (TextView) aVar.internalFindViewById(R.id.myRemainHelpMoney);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        Button button = this.f37448d;
        if (button != null) {
            button.setOnClickListener(new b());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SharePostsActivity
    public void p0() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.G.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.F.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SharePostsActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new f(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SharePostsActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new c(str), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.F.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.F.a(this);
    }
}
