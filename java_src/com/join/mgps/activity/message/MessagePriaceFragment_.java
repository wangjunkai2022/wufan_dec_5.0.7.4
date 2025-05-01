package com.join.mgps.activity.message;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.message.MessagePriaceFragment;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CommentCreateBean;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.dto.GameReplyMessageListBean;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MessagePriaceFragment_ extends MessagePriaceFragment implements y3.a, a4.a, a4.b {
    private View B;
    private final a4.c A = new a4.c();
    private final Map<Class<?>, Object> C = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MessagePriaceFragment_.super.m0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MessagePriaceFragment_.super.c0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MessagePriaceFragment_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MessagePriaceFragment_.super.b0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MessagePriaceFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f39357b;

        f(String str) {
            this.f39357b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MessagePriaceFragment_.super.showToast(this.f39357b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameReplyMessageListBean.MessagesBean.DataBean f39359b;

        g(GameReplyMessageListBean.MessagesBean.DataBean dataBean) {
            this.f39359b = dataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MessagePriaceFragment_.super.k0(this.f39359b);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentResponse f39361b;

        h(CommentResponse commentResponse) {
            this.f39361b = commentResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            MessagePriaceFragment_.super.e0(this.f39361b);
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f39363b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CommentCreateBean.InfoBean f39364c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f39365d;

        i(String str, CommentCreateBean.InfoBean infoBean, boolean z4) {
            this.f39363b = str;
            this.f39364c = infoBean;
            this.f39365d = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MessagePriaceFragment_.super.f0(this.f39363b, this.f39364c, this.f39365d);
        }
    }

    /* loaded from: classes4.dex */
    class j extends a.c {
        j(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MessagePriaceFragment_.super.a0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MessagePriaceFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class l extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f39369b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ GameReplyMessageListBean.MessagesBean.DataBean f39370c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, long j4, String str2, String str3, GameReplyMessageListBean.MessagesBean.DataBean dataBean) {
            super(str, j4, str2);
            this.f39369b = str3;
            this.f39370c = dataBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MessagePriaceFragment_.super.h0(this.f39369b, this.f39370c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m extends a.c {
        m(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MessagePriaceFragment_.super.Z();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MessagePriaceFragment_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MessagePriaceFragment_.super.V();
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f39375b;

        p(int i4) {
            this.f39375b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MessagePriaceFragment_.super.i0(this.f39375b);
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MessagePriaceFragment_.super.o0();
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f39378b;

        r(List list) {
            this.f39378b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            MessagePriaceFragment_.super.W(this.f39378b);
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MessagePriaceFragment_.super.l0();
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MessagePriaceFragment_.super.g0();
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f39382b;

        u(List list) {
            this.f39382b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            MessagePriaceFragment_.super.d0(this.f39382b);
        }
    }

    /* loaded from: classes4.dex */
    public static class v extends org.androidannotations.api.builder.d<v, MessagePriaceFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public MessagePriaceFragment build() {
            MessagePriaceFragment_ messagePriaceFragment_ = new MessagePriaceFragment_();
            messagePriaceFragment_.setArguments(this.args);
            return messagePriaceFragment_;
        }
    }

    public static v I0() {
        return new v();
    }

    private void init_(Bundle bundle) {
        this.f39302n = new PrefDef_(getActivity());
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessagePriaceFragment
    public void V() {
        org.androidannotations.api.b.e("", new o(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessagePriaceFragment
    public void W(List<MessagePriaceFragment.g> list) {
        org.androidannotations.api.b.e("", new r(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessagePriaceFragment
    public void Z() {
        org.androidannotations.api.a.l(new m("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessagePriaceFragment
    public void a0() {
        org.androidannotations.api.a.l(new j("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessagePriaceFragment
    public void b0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessagePriaceFragment
    public void c0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessagePriaceFragment
    public void d0(List<MessagePriaceFragment.g> list) {
        org.androidannotations.api.b.e("", new u(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessagePriaceFragment
    public void e0(CommentResponse commentResponse) {
        org.androidannotations.api.b.e("", new h(commentResponse), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessagePriaceFragment
    public void f0(String str, CommentCreateBean.InfoBean infoBean, boolean z4) {
        org.androidannotations.api.b.e("", new i(str, infoBean, z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessagePriaceFragment
    public void g0() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.C.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessagePriaceFragment
    public void h0(String str, GameReplyMessageListBean.MessagesBean.DataBean dataBean) {
        org.androidannotations.api.a.l(new l("", 0L, "", str, dataBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessagePriaceFragment
    public void i0(int i4) {
        org.androidannotations.api.b.e("", new p(i4), 0L);
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
    @Override // com.join.mgps.activity.message.MessagePriaceFragment
    public void k0(GameReplyMessageListBean.MessagesBean.DataBean dataBean) {
        org.androidannotations.api.b.e("", new g(dataBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessagePriaceFragment
    public void l0() {
        org.androidannotations.api.b.e("", new s(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessagePriaceFragment
    public void m0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessagePriaceFragment
    public void o0() {
        org.androidannotations.api.b.e("", new q(), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.A);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.B = onCreateView;
        if (onCreateView == null) {
            this.B = layoutInflater.inflate(R.layout.fragment_communtity, viewGroup, false);
        }
        return this.B;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.B = null;
        this.f39290b = null;
        this.f39291c = null;
        this.f39292d = null;
        this.f39294f = null;
        this.f39295g = null;
        this.f39296h = null;
        this.f39297i = null;
        this.f39303o = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f39290b = (LinearLayout) aVar.internalFindViewById(R.id.thumbslayout);
        this.f39291c = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.myswip);
        this.f39292d = (XListView2) aVar.internalFindViewById(R.id.listview);
        this.f39294f = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f39295g = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f39296h = (LinearLayout) aVar.internalFindViewById(R.id.iv_nome);
        this.f39297i = (TextView) aVar.internalFindViewById(R.id.redTips);
        Button button = (Button) aVar.internalFindViewById(R.id.setNetwork);
        this.f39303o = button;
        if (button != null) {
            button.setOnClickListener(new k());
        }
        LinearLayout linearLayout = this.f39290b;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new n());
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
    @Override // com.join.mgps.activity.message.MessagePriaceFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessagePriaceFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.MessagePriaceFragment
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new f(str), 0L);
    }
}
