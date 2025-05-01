package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CloudUploadInfo;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class CloudActivity_ extends CloudActivity implements y3.a, a4.a, a4.b {

    /* renamed from: t  reason: collision with root package name */
    private final a4.c f28896t = new a4.c();

    /* renamed from: u  reason: collision with root package name */
    private final Map<Class<?>, Object> f28897u = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CloudActivity_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CloudActivity_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f28900b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f28901c;

        c(int i4, int i5) {
            this.f28900b = i4;
            this.f28901c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudActivity_.super.k0(this.f28900b, this.f28901c);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f28903b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f28904c;

        d(int i4, int i5) {
            this.f28903b = i4;
            this.f28904c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudActivity_.super.l0(this.f28903b, this.f28904c);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudActivity_.super.m0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudActivity_.super.q0();
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
                CloudActivity_.super.r0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class h extends a.c {
        h(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CloudActivity_.super.uploadSuccess();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f28910b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CloudUploadInfo f28911c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ File f28912d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, long j4, String str2, Context context, CloudUploadInfo cloudUploadInfo, File file) {
            super(str, j4, str2);
            this.f28910b = context;
            this.f28911c = cloudUploadInfo;
            this.f28912d = file;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CloudActivity_.super.o0(this.f28910b, this.f28911c, this.f28912d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class j extends org.androidannotations.api.builder.a<j> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f28914a;

        public j(Context context) {
            super(context, CloudActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f28914a;
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
            super(fragment.getActivity(), CloudActivity_.class);
            this.f28914a = fragment;
        }
    }

    public static j A0(Fragment fragment) {
        return new j(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static j z0(Context context) {
        return new j(context);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f28897u.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CloudActivity
    public void k0(int i4, int i5) {
        org.androidannotations.api.b.e("", new c(i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CloudActivity
    public void l0(int i4, int i5) {
        org.androidannotations.api.b.e("", new d(i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CloudActivity
    public void m0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    @Override // com.join.mgps.activity.CloudActivity
    public void o0(Context context, CloudUploadInfo cloudUploadInfo, File file) {
        org.androidannotations.api.a.l(new i("", 0L, "", context, cloudUploadInfo, file));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f28896t);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.cloud);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f28861b = (ListView) aVar.internalFindViewById(R.id.listview);
        this.f28866g = (Button) aVar.internalFindViewById(R.id.sub);
        TextView textView = (TextView) aVar.internalFindViewById(R.id.select_txt);
        this.f28867h = textView;
        if (textView != null) {
            textView.setOnClickListener(new a());
        }
        Button button = this.f28866g;
        if (button != null) {
            button.setOnClickListener(new b());
        }
        afterView();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f28897u.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CloudActivity
    public void q0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CloudActivity
    public void r0() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f28896t.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CloudActivity
    public void uploadSuccess() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f28896t.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f28896t.a(this);
    }
}
