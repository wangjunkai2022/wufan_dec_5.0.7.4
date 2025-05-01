package com.join.mgps.activity.message;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.message.NoticeFragment;
import com.join.mgps.customview.XListView2;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class NoticeFragment_ extends NoticeFragment implements y3.a, a4.a, a4.b {

    /* renamed from: q  reason: collision with root package name */
    private View f39435q;

    /* renamed from: p  reason: collision with root package name */
    private final a4.c f39434p = new a4.c();

    /* renamed from: r  reason: collision with root package name */
    private final Map<Class<?>, Object> f39436r = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NoticeFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NoticeFragment_.super.e0();
        }
    }

    /* loaded from: classes4.dex */
    class c extends a.c {
        c(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                NoticeFragment_.super.a0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NoticeFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NoticeFragment_.super.g0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f39442b;

        f(List list) {
            this.f39442b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            NoticeFragment_.super.X(this.f39442b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f39444b;

        g(List list) {
            this.f39444b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            NoticeFragment_.super.W(this.f39444b);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NoticeFragment_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NoticeFragment_.super.V();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NoticeFragment_.super.c0();
        }
    }

    /* loaded from: classes4.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f39449b;

        k(int i4) {
            this.f39449b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            NoticeFragment_.super.f0(this.f39449b);
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NoticeFragment_.super.d0();
        }
    }

    /* loaded from: classes4.dex */
    public static class m extends org.androidannotations.api.builder.d<m, NoticeFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public NoticeFragment build() {
            NoticeFragment_ noticeFragment_ = new NoticeFragment_();
            noticeFragment_.setArguments(this.args);
            return noticeFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static m s0() {
        return new m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.NoticeFragment
    public void V() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.NoticeFragment
    public void W(List<NoticeFragment.c> list) {
        org.androidannotations.api.b.e("", new g(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.NoticeFragment
    public void X(List<NoticeFragment.c> list) {
        org.androidannotations.api.b.e("", new f(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.NoticeFragment
    public void a0() {
        org.androidannotations.api.a.l(new c("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.NoticeFragment
    public void c0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.NoticeFragment
    public void d0() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.NoticeFragment
    public void e0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.NoticeFragment
    public void f0(int i4) {
        org.androidannotations.api.b.e("", new k(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.NoticeFragment
    public void g0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f39436r.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f39435q;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f39434p);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f39435q = onCreateView;
        if (onCreateView == null) {
            this.f39435q = layoutInflater.inflate(R.layout.fragment_message_notice, viewGroup, false);
        }
        return this.f39435q;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f39435q = null;
        this.f39405b = null;
        this.f39406c = null;
        this.f39407d = null;
        this.f39408e = null;
        this.f39409f = null;
        this.f39415l = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f39405b = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.myswip);
        this.f39406c = (XListView2) aVar.internalFindViewById(R.id.listview);
        this.f39407d = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f39408e = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f39409f = (LinearLayout) aVar.internalFindViewById(R.id.iv_nome);
        Button button = (Button) aVar.internalFindViewById(R.id.setNetwork);
        this.f39415l = button;
        if (button != null) {
            button.setOnClickListener(new d());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f39434p.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f39436r.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.NoticeFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.NoticeFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }
}
