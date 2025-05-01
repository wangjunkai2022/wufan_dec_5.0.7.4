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
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class DownloadMYGameFragment_ extends DownloadMYGameFragment implements y3.a, a4.a, a4.b {

    /* renamed from: n  reason: collision with root package name */
    private View f51048n;

    /* renamed from: m  reason: collision with root package name */
    private final a4.c f51047m = new a4.c();

    /* renamed from: o  reason: collision with root package name */
    private final Map<Class<?>, Object> f51049o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    private final IntentFilter f51050p = new IntentFilter();

    /* renamed from: q  reason: collision with root package name */
    private final BroadcastReceiver f51051q = new a();

    /* renamed from: r  reason: collision with root package name */
    private final IntentFilter f51052r = new IntentFilter();

    /* renamed from: s  reason: collision with root package name */
    private final BroadcastReceiver f51053s = new b();

    /* loaded from: classes3.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DownloadMYGameFragment_.this.V(intent);
        }
    }

    /* loaded from: classes3.dex */
    class b extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f51055b = "gameId";

        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DownloadMYGameFragment_.this.a0((intent.getExtras() != null ? intent.getExtras() : new Bundle()).getString("gameId"));
        }
    }

    /* loaded from: classes3.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadMYGameFragment_.this.Z();
        }
    }

    /* loaded from: classes3.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadMYGameFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadMYGameFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadMYGameFragment_.super.W();
        }
    }

    /* loaded from: classes3.dex */
    class g extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f51061b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f51062c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, long j4, String str2, Context context, String str3) {
            super(str, j4, str2);
            this.f51061b = context;
            this.f51062c = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DownloadMYGameFragment_.super.b0(this.f51061b, this.f51062c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class h extends org.androidannotations.api.builder.d<h, DownloadMYGameFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public DownloadMYGameFragment build() {
            DownloadMYGameFragment_ downloadMYGameFragment_ = new DownloadMYGameFragment_();
            downloadMYGameFragment_.setArguments(this.args);
            return downloadMYGameFragment_;
        }
    }

    public static h f0() {
        return new h();
    }

    private void init_(Bundle bundle) {
        this.f51039e = new PrefDef_(getActivity());
        a4.c.b(this);
        this.f51050p.addAction(o1.a.f72036y);
        this.f51052r.addAction(o1.a.f72008k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DownloadMYGameFragment
    public void W() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DownloadMYGameFragment
    public void b0(Context context, String str) {
        org.androidannotations.api.a.l(new g("", 0L, "", context, str));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f51049o.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f51048n;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f51047m);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.f51051q, this.f51050p);
        getActivity().registerReceiver(this.f51053s, this.f51052r);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f51048n = onCreateView;
        if (onCreateView == null) {
            this.f51048n = layoutInflater.inflate(R.layout.download_mygame_fragment, viewGroup, false);
        }
        return this.f51048n;
    }

    @Override // com.join.mgps.fragment.DownloadMYGameFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.f51051q);
        getActivity().unregisterReceiver(this.f51053s);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f51048n = null;
        this.f51040f = null;
        this.f51041g = null;
        this.f51042h = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51040f = (ListView) aVar.internalFindViewById(R.id.downloadListView);
        this.f51041g = (LinearLayout) aVar.internalFindViewById(R.id.noneLayout);
        this.f51042h = (LinearLayout) aVar.internalFindViewById(R.id.topTip);
        View internalFindViewById = aVar.internalFindViewById(R.id.topTipClose);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new c());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new d());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new e());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51047m.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f51049o.put(cls, t4);
    }
}
