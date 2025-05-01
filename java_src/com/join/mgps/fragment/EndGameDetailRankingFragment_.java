package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.EndGameDetailBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class EndGameDetailRankingFragment_ extends EndGameDetailRankingFragment implements y3.a, a4.a, a4.b {

    /* renamed from: s  reason: collision with root package name */
    public static final String f51081s = "detailBean";

    /* renamed from: q  reason: collision with root package name */
    private View f51083q;

    /* renamed from: p  reason: collision with root package name */
    private final a4.c f51082p = new a4.c();

    /* renamed from: r  reason: collision with root package name */
    private final Map<Class<?>, Object> f51084r = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f51085b;

        a(List list) {
            this.f51085b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameDetailRankingFragment_.super.updateUi(this.f51085b);
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51087b;

        b(String str) {
            this.f51087b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameDetailRankingFragment_.super.showTost(this.f51087b);
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51089b;

        c(String str) {
            this.f51089b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameDetailRankingFragment_.super.i0(this.f51089b);
        }
    }

    /* loaded from: classes3.dex */
    class d extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51091b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f51091b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                EndGameDetailRankingFragment_.super.d0(this.f51091b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class e extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EndGameDetailBean.RankingListBean f51093b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, long j4, String str2, EndGameDetailBean.RankingListBean rankingListBean) {
            super(str, j4, str2);
            this.f51093b = rankingListBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                EndGameDetailRankingFragment_.super.e0(this.f51093b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class f extends org.androidannotations.api.builder.d<f, EndGameDetailRankingFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public EndGameDetailRankingFragment build() {
            EndGameDetailRankingFragment_ endGameDetailRankingFragment_ = new EndGameDetailRankingFragment_();
            endGameDetailRankingFragment_.setArguments(this.args);
            return endGameDetailRankingFragment_;
        }

        public f b(EndGameDetailBean endGameDetailBean) {
            this.args.putSerializable(EndGameDetailRankingFragment_.f51081s, endGameDetailBean);
            return this;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        p0();
    }

    public static f o0() {
        return new f();
    }

    private void p0() {
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey(f51081s)) {
            return;
        }
        this.f51073k = (EndGameDetailBean) arguments.getSerializable(f51081s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameDetailRankingFragment
    public void d0(int i4) {
        org.androidannotations.api.a.l(new d("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameDetailRankingFragment
    public void e0(EndGameDetailBean.RankingListBean rankingListBean) {
        org.androidannotations.api.a.l(new e("", 0L, "", rankingListBean));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f51084r.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameDetailRankingFragment
    public void i0(String str) {
        org.androidannotations.api.b.e("", new c(str), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f51083q;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f51082p);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f51083q = onCreateView;
        if (onCreateView == null) {
            this.f51083q = layoutInflater.inflate(R.layout.fragment_end_game_detail_ranking, viewGroup, false);
        }
        return this.f51083q;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f51083q = null;
        this.f51064b = null;
        this.f51065c = null;
        this.f51066d = null;
        this.f51067e = null;
        this.f51068f = null;
        this.f51069g = null;
        this.f51070h = null;
        this.f51071i = null;
        this.f51072j = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51064b = (TextView) aVar.internalFindViewById(R.id.tvRank);
        this.f51065c = (SimpleDraweeView) aVar.internalFindViewById(R.id.ivAvatar);
        this.f51066d = (TextView) aVar.internalFindViewById(R.id.tvUsername);
        this.f51067e = (TextView) aVar.internalFindViewById(R.id.tvScoreTime);
        this.f51068f = (TextView) aVar.internalFindViewById(R.id.tvRankChange);
        this.f51069g = (ImageView) aVar.internalFindViewById(R.id.ivRankChange);
        this.f51070h = (RecyclerView) aVar.internalFindViewById(R.id.rvRank);
        this.f51071i = (RelativeLayout) aVar.internalFindViewById(R.id.rankRoot);
        this.f51072j = (ImageView) aVar.internalFindViewById(R.id.ivPlayVideo);
        b0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51082p.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f51084r.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameDetailRankingFragment
    public void showTost(String str) {
        org.androidannotations.api.b.e("", new b(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameDetailRankingFragment
    public void updateUi(List<EndGameDetailBean.RankingListBean> list) {
        org.androidannotations.api.b.e("", new a(list), 0L);
    }
}
