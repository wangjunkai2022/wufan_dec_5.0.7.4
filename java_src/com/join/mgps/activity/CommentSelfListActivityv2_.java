package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class CommentSelfListActivityv2_ extends CommentSelfListActivityv2 implements y3.a, a4.a, a4.b {

    /* renamed from: r  reason: collision with root package name */
    private final a4.c f29632r = new a4.c();

    /* renamed from: s  reason: collision with root package name */
    private final Map<Class<?>, Object> f29633s = new HashMap();

    /* loaded from: classes4.dex */
    class a extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29634b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f29635c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f29636d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, long j4, String str2, int i4, String str3, int i5) {
            super(str, j4, str2);
            this.f29634b = i4;
            this.f29635c = str3;
            this.f29636d = i5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentSelfListActivityv2_.super.i0(this.f29634b, this.f29635c, this.f29636d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivityv2_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29639b;

        c(String str) {
            this.f29639b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentSelfListActivityv2_.super.f0(this.f29639b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentSelfListActivityv2_.super.o0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentSelfListActivityv2_.super.w0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29643b;

        f(int i4) {
            this.f29643b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentSelfListActivityv2_.super.h0(this.f29643b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentSelfListActivityv2_.super.u0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29646b;

        h(String str) {
            this.f29646b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentSelfListActivityv2_.super.showMessage(this.f29646b);
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29648b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f29648b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentSelfListActivityv2_.super.k0(this.f29648b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29650b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f29651c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f29652d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, long j4, String str2, int i4, String str3, int i5) {
            super(str, j4, str2);
            this.f29650b = i4;
            this.f29651c = str3;
            this.f29652d = i5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentSelfListActivityv2_.super.p0(this.f29650b, this.f29651c, this.f29652d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class k extends org.androidannotations.api.builder.a<k> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f29654a;

        public k(Context context) {
            super(context, CommentSelfListActivityv2_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f29654a;
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

        public k(Fragment fragment) {
            super(fragment.getActivity(), CommentSelfListActivityv2_.class);
            this.f29654a = fragment;
        }
    }

    public static k H0(Context context) {
        return new k(context);
    }

    public static k I0(Fragment fragment) {
        return new k(fragment);
    }

    private void init_(Bundle bundle) {
        this.f29616j = new PrefDef_(this);
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivityv2
    public void f0(String str) {
        org.androidannotations.api.b.e("", new c(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f29633s.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivityv2
    public void h0(int i4) {
        org.androidannotations.api.b.e("", new f(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivityv2
    public void i0(int i4, String str, int i5) {
        org.androidannotations.api.a.l(new a("", 0L, "", i4, str, i5));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivityv2
    public void k0(int i4) {
        org.androidannotations.api.a.l(new i("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivityv2
    public void o0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f29632r);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_comment_self_list_v2);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f29608b = (RelativeLayout) aVar.internalFindViewById(R.id.actionbarLayout);
        this.f29609c = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f29610d = (TextView) aVar.internalFindViewById(R.id.forum_title_center);
        this.f29611e = (TextView) aVar.internalFindViewById(R.id.layout_title);
        this.f29612f = (XListView2) aVar.internalFindViewById(R.id.listview);
        this.f29613g = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        this.f29614h = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        ImageView imageView = this.f29609c;
        if (imageView != null) {
            imageView.setOnClickListener(new b());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivityv2
    public void p0(int i4, String str, int i5) {
        org.androidannotations.api.a.l(new j("", 0L, "", i4, str, i5));
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f29633s.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f29632r.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivityv2
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new h(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivityv2
    public void u0() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivityv2
    public void w0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f29632r.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f29632r.a(this);
    }
}
