package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.LoadMoreRecyclerView;
import com.join.mgps.dto.CommentAllListBean;
import com.join.mgps.dto.CommentBaseBean;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class CommentAllListFragment_ extends CommentAllListFragment implements y3.a, a4.a, a4.b {
    private View H;
    private final a4.c G = new a4.c();
    private final Map<Class<?>, Object> I = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f50437b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f50438c;

        a(int i4, int i5) {
            this.f50437b = i4;
            this.f50438c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentAllListFragment_.super.W(this.f50437b, this.f50438c);
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f50440b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f50441c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f50442d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f50443e;

        b(String str, boolean z4, int i4, int i5) {
            this.f50440b = str;
            this.f50441c = z4;
            this.f50442d = i4;
            this.f50443e = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentAllListFragment_.super.d0(this.f50440b, this.f50441c, this.f50442d, this.f50443e);
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentResponse f50445b;

        c(CommentResponse commentResponse) {
            this.f50445b = commentResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentAllListFragment_.super.e0(this.f50445b);
        }
    }

    /* loaded from: classes3.dex */
    class d extends a.c {
        d(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentAllListFragment_.super.X();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class e extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f50448b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f50449c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f50450d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, long j4, String str2, CommentBaseBean commentBaseBean, int i4, int i5) {
            super(str, j4, str2);
            this.f50448b = commentBaseBean;
            this.f50449c = i4;
            this.f50450d = i5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentAllListFragment_.super.b(this.f50448b, this.f50449c, this.f50450d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class f extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f50452b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f50453c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f50454d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, long j4, String str2, CommentBaseBean commentBaseBean, int i4, int i5) {
            super(str, j4, str2);
            this.f50452b = commentBaseBean;
            this.f50453c = i4;
            this.f50454d = i5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentAllListFragment_.super.c(this.f50452b, this.f50453c, this.f50454d);
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
                CommentAllListFragment_.super.b0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentAllListFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentAllListFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentAllListFragment_.this.h0();
        }
    }

    /* loaded from: classes3.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentAllListFragment_.this.goComment();
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentAllListFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f50462b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CommentAllListBean.ScoringDetailsBean f50463c;

        m(List list, CommentAllListBean.ScoringDetailsBean scoringDetailsBean) {
            this.f50462b = list;
            this.f50463c = scoringDetailsBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentAllListFragment_.super.g0(this.f50462b, this.f50463c);
        }
    }

    /* loaded from: classes3.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentAllListFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentAllListFragment_.super.i0();
        }
    }

    /* loaded from: classes3.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f50467b;

        p(String str) {
            this.f50467b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentAllListFragment_.super.showMessage(this.f50467b);
        }
    }

    /* loaded from: classes3.dex */
    public static class q extends org.androidannotations.api.builder.d<q, CommentAllListFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public CommentAllListFragment build() {
            CommentAllListFragment_ commentAllListFragment_ = new CommentAllListFragment_();
            commentAllListFragment_.setArguments(this.args);
            return commentAllListFragment_;
        }
    }

    private void init_(Bundle bundle) {
        this.f50420k = new PrefDef_(getActivity());
        a4.c.b(this);
    }

    public static q v0() {
        return new q();
    }

    @Override // com.join.mgps.fragment.CommentAllListFragment
    public void W(int i4, int i5) {
        org.androidannotations.api.b.e("", new a(i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommentAllListFragment
    public void X() {
        org.androidannotations.api.a.l(new d("", 0L, ""));
    }

    @Override // com.join.mgps.fragment.CommentAllListFragment, com.join.mgps.adapter.CommentAllListFragmentAdapter.h
    public void b(CommentBaseBean commentBaseBean, int i4, int i5) {
        org.androidannotations.api.a.l(new e("", 0L, "", commentBaseBean, i4, i5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommentAllListFragment
    public void b0() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    @Override // com.join.mgps.fragment.CommentAllListFragment, com.join.mgps.adapter.CommentAllListFragmentAdapter.h
    public void c(CommentBaseBean commentBaseBean, int i4, int i5) {
        org.androidannotations.api.a.l(new f("", 0L, "", commentBaseBean, i4, i5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommentAllListFragment
    public void d0(String str, boolean z4, int i4, int i5) {
        org.androidannotations.api.b.e("", new b(str, z4, i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommentAllListFragment
    public void e0(CommentResponse commentResponse) {
        org.androidannotations.api.b.e("", new c(commentResponse), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommentAllListFragment
    public void g0(List<CommentBaseBean> list, CommentAllListBean.ScoringDetailsBean scoringDetailsBean) {
        org.androidannotations.api.b.e("", new m(list, scoringDetailsBean), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.I.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommentAllListFragment
    public void i0() {
        org.androidannotations.api.b.e("", new o(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.H;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.G);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.H = onCreateView;
        if (onCreateView == null) {
            this.H = layoutInflater.inflate(R.layout.comment_all_list_fragment, viewGroup, false);
        }
        return this.H;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.H = null;
        this.f50412c = null;
        this.f50413d = null;
        this.f50414e = null;
        this.f50415f = null;
        this.f50416g = null;
        this.f50417h = null;
        this.f50418i = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f50412c = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f50413d = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f50414e = (TextView) aVar.internalFindViewById(R.id.textTopRight);
        this.f50415f = (LoadMoreRecyclerView) aVar.internalFindViewById(R.id.comment_all_list);
        this.f50416g = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f50417h = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f50418i = (NestedScrollView) aVar.internalFindViewById(R.id.noCommentLl);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.goCommit);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new h());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new i());
        }
        TextView textView = this.f50414e;
        if (textView != null) {
            textView.setOnClickListener(new j());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new k());
        }
        afterView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.G.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.I.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommentAllListFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommentAllListFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommentAllListFragment
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new p(str), 0L);
    }
}
