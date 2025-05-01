package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.MustPlayAd;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MustPlayActivity_ extends MustPlayActivity implements y3.a, a4.a, a4.b {
    private final a4.c B = new a4.c();
    private final Map<Class<?>, Object> C = new HashMap();
    private final IntentFilter D = new IntentFilter();
    private final BroadcastReceiver E = new j();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MustPlayActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MustPlayActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f35310b;

        c(List list) {
            this.f35310b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            MustPlayActivity_.super.l0(this.f35310b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f35312b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f35313c;

        d(List list, int i4) {
            this.f35312b = list;
            this.f35313c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MustPlayActivity_.super.m0(this.f35312b, this.f35313c);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MustPlayActivity_.super.n0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MustPlayActivity_.super.j0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MustPlayActivity_.super.updateDownloadView();
        }
    }

    /* loaded from: classes4.dex */
    class h extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f35318b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f35318b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MustPlayActivity_.super.loadData(this.f35318b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
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
                MustPlayActivity_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f35321b = "gameData";

        j() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MustPlayActivity_.this.k0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MustPlayActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MustPlayActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MustPlayActivity_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MustPlayActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MustPlayActivity_.this.onClick(view);
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MustPlayActivity_.this.onClick(view);
        }
    }

    /* loaded from: classes4.dex */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MustPlayActivity_.this.onClick(view);
        }
    }

    /* loaded from: classes4.dex */
    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MustPlayActivity_.this.onClick(view);
        }
    }

    /* loaded from: classes4.dex */
    public static class s extends org.androidannotations.api.builder.a<s> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f35331a;

        public s(Context context) {
            super(context, MustPlayActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f35331a;
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

        public s(Fragment fragment) {
            super(fragment.getActivity(), MustPlayActivity_.class);
            this.f35331a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.D.addAction(o1.a.I);
        this.D.addAction(o1.a.G);
        registerReceiver(this.E, this.D);
    }

    public static s x0(Context context) {
        return new s(context);
    }

    public static s y0(Fragment fragment) {
        return new s(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.C.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MustPlayActivity
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MustPlayActivity
    public void j0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MustPlayActivity
    public void l0(List<MustPlayAd> list) {
        org.androidannotations.api.b.e("", new c(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MustPlayActivity
    public void loadData(int i4) {
        org.androidannotations.api.a.l(new h("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MustPlayActivity
    public void m0(List<v1.c> list, int i4) {
        org.androidannotations.api.b.e("", new d(list, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MustPlayActivity
    public void n0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.B);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.must_play_layout);
    }

    @Override // com.join.mgps.activity.MustPlayActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.E);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f35282c = (XListView2) aVar.internalFindViewById(R.id.listview);
        this.f35283d = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f35284e = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f35285f = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f35286g = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f35287h = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f35288i = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        this.f35289j = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img);
        this.f35290k = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        View internalFindViewById = aVar.internalFindViewById(R.id.mg_loading);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.playLeft);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.playRight);
        ImageView imageView = this.f35288i;
        if (imageView != null) {
            imageView.setOnClickListener(new k());
        }
        ImageView imageView2 = this.f35284e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new l());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new m());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new n());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new o());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new p());
        }
        ImageView imageView3 = this.f35289j;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new q());
        }
        CustomerDownloadView customerDownloadView = this.f35290k;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new r());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.C.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.B.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MustPlayActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MustPlayActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MustPlayActivity
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.B.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.B.a(this);
    }
}
