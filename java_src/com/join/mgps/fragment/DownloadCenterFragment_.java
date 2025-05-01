package com.join.mgps.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class DownloadCenterFragment_ extends DownloadCenterFragment implements y3.a, a4.a, a4.b {
    private View B;
    private final a4.c A = new a4.c();
    private final Map<Class<?>, Object> C = new HashMap();
    private final IntentFilter D = new IntentFilter();
    private final BroadcastReceiver E = new h();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadCenterFragment_.super.V();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadCenterFragment_.super.D0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadCenterFragment_.super.n0();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f51013b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f51014c;

        d(DownloadTask downloadTask, int i4) {
            this.f51013b = downloadTask;
            this.f51014c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadCenterFragment_.super.F0(this.f51013b, this.f51014c);
        }
    }

    /* loaded from: classes3.dex */
    class e extends a.c {
        e(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DownloadCenterFragment_.super.b0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class f extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f51017b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f51018c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, long j4, String str2, Context context, String str3) {
            super(str, j4, str2);
            this.f51017b = context;
            this.f51018c = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DownloadCenterFragment_.super.B0(this.f51017b, this.f51018c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class g extends a.c {
        g(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DownloadCenterFragment_.super.y0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class h extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f51021b = "gameData";

        h() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DownloadCenterFragment_.this.o0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes3.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadCenterFragment_.this.e0();
        }
    }

    /* loaded from: classes3.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadCenterFragment_.this.w0();
        }
    }

    /* loaded from: classes3.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadCenterFragment_.this.x0();
        }
    }

    /* loaded from: classes3.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadCenterFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadCenterFragment_.super.f0();
        }
    }

    /* loaded from: classes3.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51028b;

        n(String str) {
            this.f51028b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadCenterFragment_.super.E0(this.f51028b);
        }
    }

    /* loaded from: classes3.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f51030b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f51031c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f51032d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f51033e;

        o(List list, List list2, List list3, List list4) {
            this.f51030b = list;
            this.f51031c = list2;
            this.f51032d = list3;
            this.f51033e = list4;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadCenterFragment_.super.j0(this.f51030b, this.f51031c, this.f51032d, this.f51033e);
        }
    }

    /* loaded from: classes3.dex */
    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadCenterFragment_.super.l0();
        }
    }

    /* loaded from: classes3.dex */
    public static class q extends org.androidannotations.api.builder.d<q, DownloadCenterFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public DownloadCenterFragment build() {
            DownloadCenterFragment_ downloadCenterFragment_ = new DownloadCenterFragment_();
            downloadCenterFragment_.setArguments(this.args);
            return downloadCenterFragment_;
        }
    }

    public static q S0() {
        return new q();
    }

    private void init_(Bundle bundle) {
        this.f50988e = new PrefDef_(getActivity());
        a4.c.b(this);
        this.D.addAction(o1.a.I);
        this.D.addAction(o1.a.G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DownloadCenterFragment
    public void B0(Context context, String str) {
        org.androidannotations.api.a.l(new f("", 0L, "", context, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DownloadCenterFragment
    public void D0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DownloadCenterFragment
    public void E0(String str) {
        org.androidannotations.api.b.e("", new n(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DownloadCenterFragment
    public void F0(DownloadTask downloadTask, int i4) {
        org.androidannotations.api.b.e("", new d(downloadTask, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DownloadCenterFragment
    public void V() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DownloadCenterFragment
    public void b0() {
        org.androidannotations.api.a.l(new e("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DownloadCenterFragment
    public void f0() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.C.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.B;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DownloadCenterFragment
    public void j0(List<DownloadTask> list, List<DownloadTask> list2, List<DownloadTask> list3, List<DownloadTask> list4) {
        org.androidannotations.api.b.e("", new o(list, list2, list3, list4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DownloadCenterFragment
    public void l0() {
        org.androidannotations.api.b.e("", new p(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DownloadCenterFragment
    public void n0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // com.join.mgps.fragment.DownloadCenterFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.A);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.E, this.D);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.B = onCreateView;
        if (onCreateView == null) {
            this.B = layoutInflater.inflate(R.layout.fragment_download_center, viewGroup, false);
        }
        return this.B;
    }

    @Override // com.join.mgps.fragment.DownloadCenterFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.E);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.B = null;
        this.f50989f = null;
        this.f50990g = null;
        this.f50991h = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f50989f = (ListView) aVar.internalFindViewById(R.id.downloadListView);
        this.f50990g = (LinearLayout) aVar.internalFindViewById(R.id.noneLayout);
        this.f50991h = (LinearLayout) aVar.internalFindViewById(R.id.topTip);
        View internalFindViewById = aVar.internalFindViewById(R.id.goVip);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setting);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.topTipClose);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new i());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new j());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new k());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new l());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.C.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DownloadCenterFragment
    public void y0() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }
}
