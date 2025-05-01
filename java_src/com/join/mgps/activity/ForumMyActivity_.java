package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.ForumMyHeaderView;
import com.join.mgps.customview.XExpandableListView;
import com.join.mgps.dto.ForumData;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
import ru.noties.scrollable.ScrollableLayout;
/* loaded from: classes4.dex */
public final class ForumMyActivity_ extends ForumMyActivity implements y3.a, a4.a, a4.b {

    /* renamed from: u  reason: collision with root package name */
    private final a4.c f30493u = new a4.c();

    /* renamed from: v  reason: collision with root package name */
    private final Map<Class<?>, Object> f30494v = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumMyActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumMyActivity_.super.m0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumData.MyForumMain f30497b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f30498c;

        c(ForumData.MyForumMain myForumMain, int i4) {
            this.f30497b = myForumMain;
            this.f30498c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumMyActivity_.super.l0(this.f30497b, this.f30498c);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30500b;

        d(String str) {
            this.f30500b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumMyActivity_.super.showMessage(this.f30500b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30502b;

        e(int i4) {
            this.f30502b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumMyActivity_.super.f0(this.f30502b);
        }
    }

    /* loaded from: classes4.dex */
    class f extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30504b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f30504b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumMyActivity_.super.i0(this.f30504b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
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
                ForumMyActivity_.super.n0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class h extends org.androidannotations.api.builder.a<h> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f30507a;

        public h(Context context) {
            super(context, ForumMyActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f30507a;
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
            super(fragment.getActivity(), ForumMyActivity_.class);
            this.f30507a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static h u0(Context context) {
        return new h(context);
    }

    public static h v0(Fragment fragment) {
        return new h(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumMyActivity
    public void f0(int i4) {
        org.androidannotations.api.b.e("", new e(i4), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f30494v.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumMyActivity
    public void i0(int i4) {
        org.androidannotations.api.a.l(new f("", 0L, "", i4));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumMyActivity
    public void l0(ForumData.MyForumMain myForumMain, int i4) {
        org.androidannotations.api.b.e("", new c(myForumMain, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumMyActivity
    public void m0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumMyActivity
    public void n0() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f30493u);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_forum_my);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f30437b = (TextView) aVar.internalFindViewById(R.id.forum_title_center);
        this.f30438c = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        this.f30439d = (ScrollableLayout) aVar.internalFindViewById(R.id.scrollableLayout);
        this.f30440e = (ForumMyHeaderView) aVar.internalFindViewById(R.id.headerView);
        this.f30441f = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f30442g = (XExpandableListView) aVar.internalFindViewById(R.id.expandableListView);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f30494v.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f30493u.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumMyActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new d(str), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f30493u.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f30493u.a(this);
    }
}
