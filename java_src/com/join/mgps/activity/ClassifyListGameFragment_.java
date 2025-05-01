package com.join.mgps.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.CollectionBeanSub;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class ClassifyListGameFragment_ extends ClassifyListGameFragment implements y3.a, a4.a, a4.b {

    /* renamed from: z  reason: collision with root package name */
    private View f28768z;

    /* renamed from: y  reason: collision with root package name */
    private final a4.c f28767y = new a4.c();
    private final Map<Class<?>, Object> A = new HashMap();
    private final IntentFilter B = new IntentFilter();
    private final BroadcastReceiver C = new c();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ClassifyListGameFragment_.super.h0();
        }
    }

    /* loaded from: classes4.dex */
    class b extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28770b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f28771c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j4, String str2, String str3, String str4) {
            super(str, j4, str2);
            this.f28770b = str3;
            this.f28771c = str4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ClassifyListGameFragment_.super.c0(this.f28770b, this.f28771c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f28773b = "gameData";

        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ClassifyListGameFragment_.this.j0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyListGameFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyListGameFragment_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyListGameFragment_.this.d0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyListGameFragment_.this.o0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyListGameFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ClassifyListGameFragment_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f28781b;

        j(boolean z4) {
            this.f28781b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ClassifyListGameFragment_.super.t0(this.f28781b);
        }
    }

    /* loaded from: classes4.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f28783b;

        k(List list) {
            this.f28783b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            ClassifyListGameFragment_.super.showMain(this.f28783b);
        }
    }

    /* loaded from: classes4.dex */
    public static class l extends org.androidannotations.api.builder.d<l, ClassifyListGameFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public ClassifyListGameFragment build() {
            ClassifyListGameFragment_ classifyListGameFragment_ = new ClassifyListGameFragment_();
            classifyListGameFragment_.setArguments(this.args);
            return classifyListGameFragment_;
        }
    }

    public static l E0() {
        return new l();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.B.addAction(o1.a.I);
        this.B.addAction(o1.a.G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ClassifyListGameFragment
    public void c0(String str, String str2) {
        org.androidannotations.api.a.l(new b("", 0L, "", str, str2));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.A.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ClassifyListGameFragment
    public void h0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f28768z;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f28767y);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.C, this.B);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f28768z = onCreateView;
        if (onCreateView == null) {
            this.f28768z = layoutInflater.inflate(R.layout.classify_list_recy_layout, viewGroup, false);
        }
        return this.f28768z;
    }

    @Override // com.join.mgps.activity.ClassifyListGameFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.C);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28768z = null;
        this.f28746e = null;
        this.f28747f = null;
        this.f28748g = null;
        this.f28749h = null;
        this.f28750i = null;
        this.f28751j = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f28746e = (XRecyclerView) aVar.internalFindViewById(R.id.classifyListView);
        this.f28747f = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f28748g = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f28749h = (LinearLayout) aVar.internalFindViewById(R.id.loading_none);
        this.f28750i = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        this.f28751j = (ImageView) aVar.internalFindViewById(R.id.noneReloadImage);
        View internalFindViewById = aVar.internalFindViewById(R.id.mg_loading);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setAll);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.setNetwork);
        ImageView imageView = this.f28750i;
        if (imageView != null) {
            imageView.setOnClickListener(new d());
        }
        ImageView imageView2 = this.f28751j;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new e());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new f());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new g());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new h());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f28767y.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.A.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ClassifyListGameFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ClassifyListGameFragment
    public void showMain(List<CollectionBeanSubBusiness> list) {
        org.androidannotations.api.b.e("", new k(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ClassifyListGameFragment
    public void t0(boolean z4) {
        org.androidannotations.api.b.e("", new j(z4), 0L);
    }
}
