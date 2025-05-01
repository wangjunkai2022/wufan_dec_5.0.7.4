package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.BbsTagListBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class SimulatorIntroductionFragment_ extends SimulatorIntroductionFragment implements y3.a, a4.a, a4.b {

    /* renamed from: v  reason: collision with root package name */
    private View f52969v;

    /* renamed from: u  reason: collision with root package name */
    private final a4.c f52968u = new a4.c();

    /* renamed from: w  reason: collision with root package name */
    private final Map<Class<?>, Object> f52970w = new HashMap();

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimulatorIntroductionFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimulatorIntroductionFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimulatorIntroductionFragment_.this.b0();
        }
    }

    /* loaded from: classes3.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimulatorIntroductionFragment_.this.onDraftClick();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52975b;

        e(List list) {
            this.f52975b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorIntroductionFragment_.super.showMain(this.f52975b);
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52977b;

        f(String str) {
            this.f52977b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorIntroductionFragment_.super.showLoadFailed(this.f52977b);
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorIntroductionFragment_.super.hideLoading();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorIntroductionFragment_.super.showLoadingView();
        }
    }

    /* loaded from: classes3.dex */
    class i extends a.c {
        i(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SimulatorIntroductionFragment_.super.loadData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class j extends org.androidannotations.api.builder.d<j, SimulatorIntroductionFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public SimulatorIntroductionFragment build() {
            SimulatorIntroductionFragment_ simulatorIntroductionFragment_ = new SimulatorIntroductionFragment_();
            simulatorIntroductionFragment_.setArguments(this.args);
            return simulatorIntroductionFragment_;
        }
    }

    public static j i0() {
        return new j();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f52970w.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorIntroductionFragment
    public void hideLoading() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f52969v;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorIntroductionFragment
    public void loadData() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f52968u);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f52969v = onCreateView;
        if (onCreateView == null) {
            this.f52969v = layoutInflater.inflate(R.layout.fragment_simulator_introduction, viewGroup, false);
        }
        return this.f52969v;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f52969v = null;
        this.f52945b = null;
        this.f52946c = null;
        this.f52947d = null;
        this.f52948e = null;
        this.f52949f = null;
        this.f52950g = null;
        this.f52951h = null;
        this.f52952i = null;
        this.f52955l = null;
        this.f52956m = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52945b = (RecyclerView) aVar.internalFindViewById(R.id.rv_list_type);
        this.f52946c = (ViewPager) aVar.internalFindViewById(R.id.view_pager);
        this.f52947d = (ImageView) aVar.internalFindViewById(R.id.ivExpand);
        this.f52948e = (TextView) aVar.internalFindViewById(R.id.tv_draft);
        this.f52949f = (ImageView) aVar.internalFindViewById(R.id.btnShrinkIntroduction);
        this.f52950g = (ImageView) aVar.internalFindViewById(R.id.bgExpand);
        this.f52951h = (RelativeLayout) aVar.internalFindViewById(R.id.rlContent);
        this.f52952i = aVar.internalFindViewById(R.id.divider);
        this.f52955l = aVar.internalFindViewById(R.id.loding_layout);
        this.f52956m = aVar.internalFindViewById(R.id.loding_faile);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.relodingimag);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new b());
        }
        ImageView imageView = this.f52947d;
        if (imageView != null) {
            imageView.setOnClickListener(new c());
        }
        TextView textView = this.f52948e;
        if (textView != null) {
            textView.setOnClickListener(new d());
        }
        aftervidew();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f52968u.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f52970w.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorIntroductionFragment
    public void showLoadFailed(String str) {
        org.androidannotations.api.b.e("", new f(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorIntroductionFragment
    public void showLoadingView() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorIntroductionFragment
    public void showMain(List<BbsTagListBean> list) {
        org.androidannotations.api.b.e("", new e(list), 0L);
    }
}
