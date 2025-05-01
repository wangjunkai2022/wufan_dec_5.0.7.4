package com.join.android.app.component.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.BaseAppCompatActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.StandardVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.v0;
import com.join.mgps.activity.EndGameDetailActivity_;
import com.join.mgps.activity.MGMainActivity;
import com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity;
import com.join.mgps.dto.ExtBean;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.ExtFrom;
import com.papa.sim.statistic.p;
import com.psk.eventmodule.Event;
import com.psk.eventmodule.StatFactory;
import it.sephiroth.android.library.widget.AbsHListView;
import java.util.HashMap;
import java.util.Map;
/* compiled from: MyListViewVideoHelper.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: v  reason: collision with root package name */
    public static final int f15351v = 1;

    /* renamed from: w  reason: collision with root package name */
    public static final int f15352w = 2;

    /* renamed from: a  reason: collision with root package name */
    private Context f15353a;

    /* renamed from: d  reason: collision with root package name */
    StandardVideoView f15356d;

    /* renamed from: k  reason: collision with root package name */
    public AbsListView f15363k;

    /* renamed from: l  reason: collision with root package name */
    public AbsHListView f15364l;

    /* renamed from: m  reason: collision with root package name */
    public RecyclerView f15365m;

    /* renamed from: n  reason: collision with root package name */
    public com.join.mgps.recycler.a f15366n;

    /* renamed from: t  reason: collision with root package name */
    AlphaAnimation f15372t;

    /* renamed from: b  reason: collision with root package name */
    private int f15354b = -1;

    /* renamed from: c  reason: collision with root package name */
    String f15355c = "";

    /* renamed from: e  reason: collision with root package name */
    boolean f15357e = false;

    /* renamed from: f  reason: collision with root package name */
    Map<Integer, l> f15358f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    int f15359g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f15360h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f15361i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f15362j = 0;

    /* renamed from: o  reason: collision with root package name */
    int f15367o = 0;

    /* renamed from: p  reason: collision with root package name */
    long f15368p = 0;

    /* renamed from: q  reason: collision with root package name */
    SimpleDraweeView f15369q = null;

    /* renamed from: r  reason: collision with root package name */
    SimpleDraweeView f15370r = null;

    /* renamed from: s  reason: collision with root package name */
    FrameLayout f15371s = null;

    /* renamed from: u  reason: collision with root package name */
    private int f15373u = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyListViewVideoHelper.java */
    /* loaded from: classes3.dex */
    public class a implements StandardVideoView.i {
        a() {
        }

        @Override // com.join.android.app.component.video.StandardVideoView.i
        public void a(int i4) {
            if (i4 == 0) {
                v0.d("MyListViewVideoHelper", "099999 ");
                MyImageLoader.m(c.this.f15370r, Uri.parse("res:///2131234668"));
                c.this.f15370r.setVisibility(0);
                return;
            }
            c.this.f15370r.setVisibility(4);
            v0.d("MyListViewVideoHelper", "aaaaaaaaaaa ");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyListViewVideoHelper.java */
    /* loaded from: classes3.dex */
    public class b implements Animation.AnimationListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f15375b;

        b(View view) {
            this.f15375b = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            try {
                int intValue = ((Integer) this.f15375b.getTag()).intValue();
                StringBuilder sb = new StringBuilder();
                sb.append("onAnimationEnd ");
                sb.append(intValue == c.this.A());
                sb.append(" tag= ");
                sb.append(intValue);
                sb.append(" getPlayPosition()=");
                sb.append(c.this.A());
                sb.append(" ");
                sb.append(c.this.f15356d.getCurrentState());
                v0.d("MyListViewVideoHelper", sb.toString());
                if (intValue == c.this.A()) {
                    if (c.this.f15356d.getCurrentState() == 2) {
                        this.f15375b.setVisibility(4);
                        c.this.f15369q.setVisibility(4);
                    } else {
                        this.f15375b.setVisibility(0);
                    }
                } else {
                    this.f15375b.setVisibility(0);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyListViewVideoHelper.java */
    /* renamed from: com.join.android.app.component.video.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0320c implements StandardVideoView.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f15377a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f15378b;

        C0320c(Context context, String str) {
            this.f15377a = context;
            this.f15378b = str;
        }

        @Override // com.join.android.app.component.video.StandardVideoView.j
        public void a(StandardVideoView standardVideoView) {
            try {
                c cVar = c.this;
                IntentDateBean intentDateBean = cVar.f15358f.get(Integer.valueOf(cVar.A())).f15392d;
                if (intentDateBean == null) {
                    return;
                }
                if (standardVideoView.isInPlayingState()) {
                    com.join.android.app.component.video.i.f(standardVideoView);
                    c.this.f15357e = true;
                    standardVideoView.getGSYVideoManager().A(standardVideoView);
                    GamedetailVideoMainActivity.startTActivity((BaseAppCompatActivity) this.f15377a, standardVideoView, intentDateBean.getCrc_link_type_val(), false, intentDateBean.getExtBean());
                } else {
                    IntentUtil.getInstance().intentActivity(this.f15377a, intentDateBean);
                }
                ExtBean extBean = intentDateBean.getExtBean();
                if (extBean != null && g2.i(extBean.getRecPosition()) && g2.i(extBean.getVolcanoOther()) && extBean.getRecPosition().startsWith("home")) {
                    c.this.L(standardVideoView.getContext(), Event.click, extBean.getRecPosition(), intentDateBean.getCrc_link_type_val(), (StatFactory.VolcanoOther) JsonMapper.getInstance().fromJson(extBean.getVolcanoOther(), StatFactory.VolcanoOther.class), extBean.isOnlineGame());
                }
                if ((this.f15377a instanceof MGMainActivity) && TextUtils.equals("PapaMainAdapter", this.f15378b)) {
                    c cVar2 = c.this;
                    ((MGMainActivity) this.f15377a).setPapaMainFragmentLastPosition(cVar2.f15358f.get(Integer.valueOf(cVar2.A())).f());
                    c cVar3 = c.this;
                    cVar3.K(cVar3.f15358f.get(Integer.valueOf(cVar3.A())).f());
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyListViewVideoHelper.java */
    /* loaded from: classes3.dex */
    public class d implements StandardVideoView.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f15380a;

        d(Context context) {
            this.f15380a = context;
        }

        @Override // com.join.android.app.component.video.StandardVideoView.j
        public void a(StandardVideoView standardVideoView) {
            try {
                c cVar = c.this;
                l lVar = cVar.f15358f.get(Integer.valueOf(cVar.A()));
                if (lVar == null) {
                    return;
                }
                if (standardVideoView.isInPlayingState()) {
                    c.this.f15357e = true;
                    com.join.android.app.component.video.i.f(standardVideoView);
                    standardVideoView.getGSYVideoManager().A(standardVideoView);
                    EndGameDetailActivity_.C0(this.f15380a).b(lVar.c()).a(lVar.b()).d(lVar.g()).c(true).start();
                } else {
                    EndGameDetailActivity_.C0(this.f15380a).b(lVar.c()).a(lVar.b()).d(lVar.g()).start();
                }
                Ext ext = new Ext();
                ext.setEndId(lVar.b());
                Data data = new Data();
                data.setGameId(Long.parseLong(lVar.c()));
                p.l(c.this.f15353a).i0(com.papa.sim.statistic.Event.clickEndGameDetail, ext, data);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyListViewVideoHelper.java */
    /* loaded from: classes3.dex */
    public class e implements StandardVideoView.i {
        e() {
        }

        @Override // com.join.android.app.component.video.StandardVideoView.i
        public void a(int i4) {
            v0.d("MyListViewVideoHelper", "onCoverShowChange " + i4 + "  " + c.this.f15356d.getCurrentState());
            if (i4 == 0) {
                if (c.this.f15356d.getCurrentState() != 2) {
                    v0.d("MyListViewVideoHelper", "onCoverShowChange " + i4 + "  " + c.this.f15356d.getCurrentState());
                    c.this.f15369q.setVisibility(0);
                }
                try {
                    Animation animation = c.this.f15369q.getAnimation();
                    if (animation != null) {
                        animation.setAnimationListener(null);
                    }
                    c.this.f15369q.clearAnimation();
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return;
                }
            }
            c cVar = c.this;
            cVar.O(cVar.f15369q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyListViewVideoHelper.java */
    /* loaded from: classes3.dex */
    public class f implements StandardVideoView.i {
        f() {
        }

        @Override // com.join.android.app.component.video.StandardVideoView.i
        public void a(int i4) {
            if (i4 == 0) {
                v0.d("MyListViewVideoHelper", "099999 ");
                MyImageLoader.m(c.this.f15370r, Uri.parse("res:///2131234668"));
                c.this.f15370r.setVisibility(0);
                return;
            }
            c.this.f15370r.setVisibility(4);
            v0.d("MyListViewVideoHelper", "aaaaaaaaaaa ");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyListViewVideoHelper.java */
    /* loaded from: classes3.dex */
    public class g implements StandardVideoView.i {
        g() {
        }

        @Override // com.join.android.app.component.video.StandardVideoView.i
        public void a(int i4) {
            v0.d("MyListViewVideoHelper", "onCoverShowChange " + i4 + "  " + c.this.f15356d.getCurrentState());
            if (i4 == 0) {
                if (c.this.f15356d.getCurrentState() != 2) {
                    v0.d("MyListViewVideoHelper", "onCoverShowChange " + i4 + "  " + c.this.f15356d.getCurrentState());
                    c.this.f15369q.setVisibility(0);
                }
                try {
                    Animation animation = c.this.f15369q.getAnimation();
                    if (animation != null) {
                        animation.setAnimationListener(null);
                    }
                    c.this.f15369q.clearAnimation();
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return;
                }
            }
            c cVar = c.this;
            cVar.O(cVar.f15369q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyListViewVideoHelper.java */
    /* loaded from: classes3.dex */
    public class h implements StandardVideoView.i {
        h() {
        }

        @Override // com.join.android.app.component.video.StandardVideoView.i
        public void a(int i4) {
            if (i4 == 0) {
                v0.d("MyListViewVideoHelper", "099999 ");
                MyImageLoader.m(c.this.f15370r, Uri.parse("res:///2131234668"));
                c.this.f15370r.setVisibility(0);
                return;
            }
            c.this.f15370r.setVisibility(4);
            v0.d("MyListViewVideoHelper" + c.this.f15355c, "aaaaaaaaaaa ");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyListViewVideoHelper.java */
    /* loaded from: classes3.dex */
    public class i implements StandardVideoView.i {
        i() {
        }

        @Override // com.join.android.app.component.video.StandardVideoView.i
        public void a(int i4) {
            v0.d("MyListViewVideoHelper", "onCoverShowChange " + i4 + "  " + c.this.f15356d.getCurrentState());
            if (i4 == 0) {
                if (c.this.f15356d.getCurrentState() != 2) {
                    v0.d("MyListViewVideoHelper", "onCoverShowChange " + i4 + "  " + c.this.f15356d.getCurrentState());
                    c.this.f15369q.setVisibility(0);
                }
                try {
                    Animation animation = c.this.f15369q.getAnimation();
                    if (animation != null) {
                        animation.setAnimationListener(null);
                    }
                    c.this.f15369q.clearAnimation();
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return;
                }
            }
            c cVar = c.this;
            cVar.O(cVar.f15369q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyListViewVideoHelper.java */
    /* loaded from: classes3.dex */
    public class j implements StandardVideoView.i {
        j() {
        }

        @Override // com.join.android.app.component.video.StandardVideoView.i
        public void a(int i4) {
            if (i4 == 0) {
                v0.d("MyListViewVideoHelper", "099999 ");
                MyImageLoader.m(c.this.f15370r, Uri.parse("res:///2131234668"));
                c.this.f15370r.setVisibility(0);
                return;
            }
            c.this.f15370r.setVisibility(4);
            v0.d("MyListViewVideoHelper", "aaaaaaaaaaa ");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyListViewVideoHelper.java */
    /* loaded from: classes3.dex */
    public class k implements StandardVideoView.i {
        k() {
        }

        @Override // com.join.android.app.component.video.StandardVideoView.i
        public void a(int i4) {
            v0.d("MyListViewVideoHelper", "onCoverShowChange " + i4 + "  " + c.this.f15356d.getCurrentState());
            if (i4 == 0) {
                if (c.this.f15356d.getCurrentState() != 2) {
                    v0.d("MyListViewVideoHelper", "onCoverShowChange " + i4 + "  " + c.this.f15356d.getCurrentState());
                    c.this.f15369q.setVisibility(0);
                }
                try {
                    Animation animation = c.this.f15369q.getAnimation();
                    if (animation != null) {
                        animation.setAnimationListener(null);
                    }
                    c.this.f15369q.clearAnimation();
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return;
                }
            }
            c cVar = c.this;
            cVar.O(cVar.f15369q);
        }
    }

    public c(Context context) {
        this.f15353a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(String str) {
        p.l(this.f15353a).t(ExtFrom.home.name(), str, AccountUtil_.getInstance_(this.f15353a).getUid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(Context context, Event event, String str, String str2, StatFactory.VolcanoOther volcanoOther, boolean z4) {
        String str3;
        String str4;
        String str5;
        String[] split = str.split("-");
        str3 = "0";
        if (split.length <= 0 || split.length <= 0) {
            str4 = "";
            str5 = str4;
        } else {
            String str6 = split[0];
            String str7 = split.length > 1 ? split[1] : "";
            str3 = split.length > 2 ? split[2] : "0";
            str4 = str6;
            str5 = str7;
        }
        String str8 = str3;
        v0.d("volcannoEvent", str5 + "  " + str8);
        StatFactory.Companion.getInstance(context).sendEvent(new StatFactory.VolcanoEvent(event, str2, new StatFactory.SpmData("wufun", str4, str5, str8, false), volcanoOther, z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(View view) {
        try {
            v0.d("MyListViewVideoHelper", "startAnim ");
            if (this.f15372t == null) {
                this.f15372t = new AlphaAnimation(1.0f, 0.1f);
            }
            this.f15372t.setDuration(600L);
            this.f15372t.setInterpolator(new AccelerateInterpolator());
            this.f15372t.setAnimationListener(new b(view));
            view.startAnimation(this.f15372t);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private static int u(int[] iArr) {
        int i4 = iArr[0];
        for (int i5 : iArr) {
            if (i5 > i4) {
                i4 = i5;
            }
        }
        return i4;
    }

    private static int v(int[] iArr) {
        int i4 = iArr[0];
        for (int i5 : iArr) {
            if (i5 < i4) {
                i4 = i5;
            }
        }
        return i4;
    }

    public static int w(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return 0;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(iArr);
            return v(iArr);
        }
        return ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
    }

    public static int x(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return 0;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
            return v(iArr);
        }
        return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
    }

    public static int y(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return 0;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(iArr);
            return u(iArr);
        }
        return ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
    }

    public static int z(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return 0;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findLastVisibleItemPositions(iArr);
            return u(iArr);
        }
        return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
    }

    public int A() {
        return this.f15354b;
    }

    public String B() {
        return this.f15355c;
    }

    public Map<Integer, l> C() {
        return this.f15358f;
    }

    public int D() {
        StandardVideoView standardVideoView = this.f15356d;
        if (standardVideoView != null) {
            return standardVideoView.getCurrentState();
        }
        return 0;
    }

    public void E(Context context, String str, boolean z4) {
        this.f15353a = context;
        this.f15355c = str;
        StandardVideoView standardVideoView = new StandardVideoView(this.f15353a);
        this.f15356d = standardVideoView;
        standardVideoView.setPlayTag(str);
        if (!str.equals("PapaMainAdapter") && !z4) {
            if (str.contains("EndGameListFragmentVideoHelper") || str.contains("EndGameDiscoveryFragment")) {
                this.f15356d.setAutoPlayConfig(true);
                this.f15356d.setOnclickVideoListener(new d(context));
                return;
            }
            return;
        }
        this.f15356d.setAutoPlayConfig(z4);
        this.f15356d.setOnclickVideoListener(new C0320c(context, str));
    }

    public void F(int i4) {
        try {
            if (i4 == A()) {
                return;
            }
            try {
                if (!this.f15355c.contains("EndGameListFragmentVideoHelper") && !this.f15355c.contains("EndGameDiscoveryFragment")) {
                    IntentUtil.getInstance().intentActivity(this.f15353a, this.f15358f.get(Integer.valueOf(i4)).f15392d);
                    if ((this.f15353a instanceof MGMainActivity) && TextUtils.equals("PapaMainAdapter", this.f15355c)) {
                        ((MGMainActivity) this.f15353a).setPapaMainFragmentLastPosition(this.f15358f.get(Integer.valueOf(A())).f());
                        K(this.f15358f.get(Integer.valueOf(A())).f());
                    }
                }
                l lVar = this.f15358f.get(Integer.valueOf(i4));
                if (lVar == null) {
                    return;
                }
                EndGameDetailActivity_.C0(this.f15353a).b(lVar.c()).a(lVar.b()).d(lVar.g()).start();
                Ext ext = new Ext();
                ext.setEndId(lVar.b());
                Data data = new Data();
                data.setGameId(Long.parseLong(lVar.c()));
                p.l(this.f15353a).i0(com.papa.sim.statistic.Event.clickEndGameDetail, ext, data);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public void G() {
        try {
            this.f15356d.release();
            com.join.android.app.component.video.a.n0(this.f15355c);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void H() {
        try {
            if (this.f15357e) {
                return;
            }
            M(2);
            this.f15356d.onVideoPause();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void I() {
        try {
            v0.d("MyListViewVideoHelper", "onResume ");
            if (this.f15357e) {
                Bitmap b5 = com.join.android.app.component.video.h.b();
                this.f15356d.setThumbVisibleM();
                this.f15356d.g(b5);
            } else {
                M(1);
                AbsListView absListView = this.f15363k;
                if (absListView != null) {
                    n(absListView);
                } else {
                    RecyclerView recyclerView = this.f15365m;
                    if (recyclerView != null) {
                        o(recyclerView);
                    } else {
                        AbsHListView absHListView = this.f15364l;
                        if (absHListView != null) {
                            p(absHListView);
                        } else {
                            this.f15356d.onVideoResume();
                        }
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void J(boolean z4) {
        try {
            v0.d("MyListViewVideoHelper", "onResumeDelayForMain " + this.f15356d.getCurrentState());
            if (this.f15357e) {
                com.join.android.app.component.video.h.c(this.f15356d, "", true, "");
                com.join.android.app.component.video.h.a(this.f15356d);
                v0.d("MyListViewVideoHelper", "onResumeDelayForMain2 " + this.f15356d.getCurrentState());
                this.f15356d.setSurfaceToPlay();
                this.f15356d.setMute(true);
                if (z4) {
                    this.f15356d.onVideoResume();
                } else {
                    this.f15356d.onVideoPause();
                }
                com.join.android.app.component.video.h.d();
                this.f15357e = false;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void M(int i4) {
        this.f15373u = i4;
    }

    public void N(int i4) {
        this.f15354b = i4;
    }

    public void P() {
    }

    public void Q(RecyclerView recyclerView) {
        if (this.f15371s != null) {
            this.f15356d.releaseVideos();
            this.f15371s.removeAllViews();
            this.f15354b = -1;
            k(recyclerView, 0);
        }
    }

    public void R(int i4, FrameLayout frameLayout) {
        if (this.f15356d.getCurrentState() == 2 && i4 == A()) {
            ViewGroup viewGroup = (ViewGroup) this.f15356d.getParent();
            if (viewGroup != null) {
                if (viewGroup == frameLayout) {
                    return;
                }
                viewGroup.removeAllViews();
            }
            this.f15371s = frameLayout;
            this.f15369q.setVisibility(4);
            this.f15371s.removeAllViews();
            this.f15371s.addView(this.f15356d);
        }
    }

    public void S(int i4, SimpleDraweeView simpleDraweeView) {
        if (this.f15356d.getCurrentState() == 2 && i4 == A()) {
            this.f15369q = simpleDraweeView;
            simpleDraweeView.setVisibility(0);
            O(this.f15369q);
        }
    }

    public void e(int i4, l lVar, boolean... zArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("addVideoData: ");
        sb.append(i4);
        sb.append("  ");
        sb.append(lVar.f());
        sb.append("   ");
        sb.append(lVar.h());
        if (zArr.length > 0) {
            this.f15356d.setShowCoverWhenPause(zArr[0]);
        }
        this.f15358f.put(Integer.valueOf(i4), lVar);
    }

    public void f(AbsListView absListView, int i4, int i5, int i6) {
        this.f15360h = i4;
        this.f15361i = i5;
        this.f15362j = i6;
        if (i5 == 0 || i4 != 0) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f15368p > 3000) {
                    this.f15368p = currentTimeMillis;
                    this.f15367o = this.f15360h;
                    StandardVideoView standardVideoView = this.f15356d;
                    if (standardVideoView != null && standardVideoView.getCurrentState() != 2 && this.f15356d.getCurrentState() != 6 && !this.f15356d.isIfCurrentIsFullscreen()) {
                        n(absListView);
                    }
                }
                int A = A();
                if (A != -22 && A <= i6 && this.f15359g != A) {
                    if (A < i4 || A > this.f15361i + i4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("autoPlayScroll  -->onPauseAll ");
                        sb.append(this.f15360h);
                        sb.append("  ");
                        sb.append(this.f15361i);
                        sb.append("  ");
                        sb.append(A);
                        this.f15359g = A;
                        StandardVideoView standardVideoView2 = this.f15356d;
                        if (standardVideoView2 == null || standardVideoView2.isIfCurrentIsFullscreen()) {
                            return;
                        }
                        this.f15356d.onVideoPause();
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public void g(RecyclerView recyclerView, int i4, int i5, int i6) {
        int i7;
        try {
            if (this.f15360h == i4 && (i7 = this.f15361i) != 0 && i4 == 0 && i7 == i5) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f15368p > 3000) {
                this.f15368p = currentTimeMillis;
                this.f15367o = this.f15360h;
                StandardVideoView standardVideoView = this.f15356d;
                if (standardVideoView != null && standardVideoView.getCurrentState() != 2 && this.f15356d.getCurrentState() != 6 && !this.f15356d.isIfCurrentIsFullscreen()) {
                    o(recyclerView);
                }
            }
            this.f15360h = i4;
            this.f15361i = i5;
            this.f15362j = i6;
            int A = A();
            if (A != -22 && A <= i6 && this.f15359g != A) {
                if (A < i4 || A > this.f15361i + i4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("autoPlayScroll  -->onPauseAll ");
                    sb.append(this.f15360h);
                    sb.append("  ");
                    sb.append(this.f15361i);
                    sb.append("  ");
                    sb.append(A);
                    this.f15359g = A;
                    StandardVideoView standardVideoView2 = this.f15356d;
                    if (standardVideoView2 == null || standardVideoView2.isIfCurrentIsFullscreen()) {
                        return;
                    }
                    this.f15356d.onVideoPause();
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void h(AbsHListView absHListView, int i4, int i5, int i6) {
        this.f15360h = i4;
        this.f15361i = i5;
        this.f15362j = i6;
        if (i5 != 0 && i4 == 0) {
            try {
                StandardVideoView standardVideoView = this.f15356d;
                if (standardVideoView != null && standardVideoView.getCurrentState() != 2) {
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f15368p > 3000) {
            this.f15368p = currentTimeMillis;
            this.f15367o = this.f15360h;
            StandardVideoView standardVideoView2 = this.f15356d;
            if (standardVideoView2 != null && standardVideoView2.getCurrentState() != 2 && this.f15356d.getCurrentState() != 6 && !this.f15356d.isIfCurrentIsFullscreen()) {
                p(absHListView);
            }
        }
        int A = A();
        if (A != -22 && A <= i6 && this.f15359g != A) {
            if (A < i4 || A > this.f15361i + i4) {
                StringBuilder sb = new StringBuilder();
                sb.append("autoPlayScroll  -->onPauseAll ");
                sb.append(this.f15360h);
                sb.append("  ");
                sb.append(this.f15361i);
                sb.append("  ");
                sb.append(A);
                this.f15359g = A;
                StandardVideoView standardVideoView3 = this.f15356d;
                if (standardVideoView3 == null || standardVideoView3.isIfCurrentIsFullscreen()) {
                    return;
                }
                this.f15356d.onVideoPause();
            }
        }
    }

    public void i(RecyclerView recyclerView, int i4, int i5, int i6) {
        this.f15360h = i4;
        this.f15361i = i5;
        this.f15362j = i6;
        if (i5 == 0 || i4 != 0) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f15368p > 3000) {
                    this.f15368p = currentTimeMillis;
                    this.f15367o = this.f15360h;
                    StandardVideoView standardVideoView = this.f15356d;
                    if (standardVideoView != null && standardVideoView.getCurrentState() != 2 && this.f15356d.getCurrentState() != 6 && !this.f15356d.isIfCurrentIsFullscreen()) {
                        o(recyclerView);
                    }
                }
                int A = A();
                if (A != -22 && A <= i6 && this.f15359g != A) {
                    if (A < i4 || A > this.f15361i + i4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("autoPlayScroll  -->onPauseAll ");
                        sb.append(this.f15360h);
                        sb.append("  ");
                        sb.append(this.f15361i);
                        sb.append("  ");
                        sb.append(A);
                        this.f15359g = A;
                        StandardVideoView standardVideoView2 = this.f15356d;
                        if (standardVideoView2 == null || standardVideoView2.isIfCurrentIsFullscreen()) {
                            return;
                        }
                        this.f15356d.onVideoPause();
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public void j(AbsListView absListView, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("autoPlayScrollStateChanged= ");
        sb.append(i4);
        if (this.f15373u != 2 && Build.VERSION.SDK_INT >= 21 && i4 == 0) {
            this.f15359g = -1;
            n(absListView);
        }
    }

    public void k(RecyclerView recyclerView, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("autoPlayScrollStateChanged= ");
        sb.append(i4);
        if (this.f15373u != 2 && Build.VERSION.SDK_INT >= 21 && i4 == 0) {
            this.f15359g = -1;
            o(recyclerView);
        }
    }

    public void l(AbsHListView absHListView, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("autoPlayScrollStateChanged= ");
        sb.append(i4);
        if (this.f15373u != 2 && Build.VERSION.SDK_INT >= 21 && i4 == 0) {
            this.f15359g = -1;
            p(absHListView);
        }
    }

    public void m(RecyclerView recyclerView, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("autoPlayScrollStateChanged= ");
        sb.append(i4);
        if (this.f15373u != 2 && Build.VERSION.SDK_INT >= 21 && i4 == 0) {
            this.f15359g = -1;
            q(recyclerView);
        }
    }

    public synchronized void n(AbsListView absListView) {
        this.f15363k = absListView;
        SimpleDraweeView simpleDraweeView = null;
        SimpleDraweeView simpleDraweeView2 = null;
        boolean z4 = false;
        for (int i4 = 0; i4 < this.f15361i; i4++) {
            try {
                if (absListView != null && absListView.getChildAt(i4) != null && absListView.getChildAt(i4).findViewById(R.id.videoContner) != null) {
                    this.f15371s = (FrameLayout) absListView.getChildAt(i4).findViewById(R.id.videoContner);
                    if (absListView.getChildAt(i4) != null && absListView.getChildAt(i4).findViewById(R.id.bannerView) != null) {
                        simpleDraweeView = (SimpleDraweeView) absListView.getChildAt(i4).findViewById(R.id.bannerView);
                    }
                    if (absListView.getChildAt(i4) != null && absListView.getChildAt(i4).findViewById(R.id.loading) != null) {
                        simpleDraweeView2 = (SimpleDraweeView) absListView.getChildAt(i4).findViewById(R.id.loading);
                    }
                    Rect rect = new Rect();
                    this.f15371s.getLocalVisibleRect(rect);
                    int height = this.f15371s.getHeight();
                    if (simpleDraweeView != null && simpleDraweeView.getTag() != null) {
                        if (rect.top == 0 && rect.bottom == height && !z4) {
                            v0.d("MyListViewVideoHelper", "2222222 ");
                            if (((Integer) simpleDraweeView.getTag()).intValue() == A() && this.f15356d.getCurrentState() != 6) {
                                v0.d("MyListViewVideoHelper", "333333 ");
                                if (this.f15356d.getCurrentState() == 5) {
                                    this.f15371s.removeAllViews();
                                    this.f15371s.addView(this.f15356d);
                                    this.f15356d.onVideoResume(false);
                                    v0.d("MyListViewVideoHelper", "444444 ");
                                } else if (this.f15371s.getChildAt(0) == null) {
                                    this.f15371s.removeAllViews();
                                    v0.d("MyListViewVideoHelper", "55555555 ");
                                    this.f15371s.addView(this.f15356d);
                                }
                            } else {
                                v0.d("MyListViewVideoHelper", "66666666 ");
                                l lVar = this.f15358f.get(simpleDraweeView.getTag());
                                ViewGroup viewGroup = (ViewGroup) this.f15356d.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeAllViews();
                                    SimpleDraweeView simpleDraweeView3 = this.f15369q;
                                    if (simpleDraweeView3 != null) {
                                        simpleDraweeView3.setVisibility(0);
                                    }
                                    v0.d("MyListViewVideoHelper", "7777777 ");
                                }
                                this.f15356d.setPlayTag(this.f15355c);
                                this.f15356d.setPlayPosition(((Integer) simpleDraweeView.getTag()).intValue());
                                this.f15356d.setSwitchUrl(lVar.h());
                                this.f15356d.setUp(lVar.h(), StandardVideoView.D, "", lVar.a());
                                this.f15371s.addView(this.f15356d);
                                N(((Integer) simpleDraweeView.getTag()).intValue());
                                SimpleDraweeView simpleDraweeView4 = this.f15369q;
                                if (simpleDraweeView4 != null) {
                                    Animation animation = simpleDraweeView4.getAnimation();
                                    if (animation != null) {
                                        animation.setAnimationListener(null);
                                    }
                                    v0.d("MyListViewVideoHelper", "lastBannerView tag =" + this.f15369q.getTag());
                                    this.f15369q.clearAnimation();
                                }
                                this.f15369q = simpleDraweeView;
                                v0.d("MyListViewVideoHelper", "lastBannerViewNew tag =" + this.f15369q.getTag());
                                this.f15370r = simpleDraweeView2;
                                this.f15356d.setChangeCoverShowListener(new e());
                                this.f15356d.setChangeCoverShowLoadingListener(new f());
                                if (this.f15356d.d()) {
                                    v0.d("MyListViewVideoHelper", "888888888 " + simpleDraweeView.getTag());
                                    this.f15356d.startPlayLogic();
                                }
                                v0.d("MyListViewVideoHelper", "startplaylogic ");
                            }
                            z4 = true;
                        } else {
                            v0.d("MyListViewVideoHelper", "out to play Are   standardVideoView status  " + this.f15356d.getCurrentState() + "  " + simpleDraweeView.getTag());
                            if (((Integer) simpleDraweeView.getTag()).intValue() == A() && (this.f15356d.getCurrentState() == 2 || this.f15356d.getCurrentState() == 1)) {
                                this.f15356d.onVideoPause();
                                v0.d("MyListViewVideoHelper", "out to play Are   onVideoPause  ");
                            }
                            this.f15371s.removeAllViews();
                            simpleDraweeView.setVisibility(0);
                            v0.d("MyListViewVideoHelper", "out to play Are ");
                        }
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public synchronized void o(RecyclerView recyclerView) {
        this.f15365m = recyclerView;
        try {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            this.f15361i = (linearLayoutManager.findLastVisibleItemPosition() - linearLayoutManager.findFirstVisibleItemPosition()) + 1;
            SimpleDraweeView simpleDraweeView = null;
            SimpleDraweeView simpleDraweeView2 = null;
            boolean z4 = false;
            for (int i4 = 0; i4 < this.f15361i; i4++) {
                if (linearLayoutManager.getChildAt(i4) != null && linearLayoutManager.getChildAt(i4).findViewById(R.id.videoContner) != null) {
                    this.f15371s = (FrameLayout) linearLayoutManager.getChildAt(i4).findViewById(R.id.videoContner);
                    if (linearLayoutManager.getChildAt(i4) != null && linearLayoutManager.getChildAt(i4).findViewById(R.id.bannerView) != null) {
                        simpleDraweeView = (SimpleDraweeView) linearLayoutManager.getChildAt(i4).findViewById(R.id.bannerView);
                    }
                    if (linearLayoutManager.getChildAt(i4) != null && linearLayoutManager.getChildAt(i4).findViewById(R.id.loading) != null) {
                        simpleDraweeView2 = (SimpleDraweeView) linearLayoutManager.getChildAt(i4).findViewById(R.id.loading);
                    }
                    Rect rect = new Rect();
                    this.f15371s.getLocalVisibleRect(rect);
                    int height = this.f15371s.getHeight();
                    if (rect.top == 0 && rect.bottom == height && !z4) {
                        v0.d("MyListViewVideoHelper", "2222222 ");
                        if (((Integer) simpleDraweeView.getTag()).intValue() == A() && this.f15356d.getCurrentState() != 6) {
                            v0.d("MyListViewVideoHelper", "333333 ");
                            if (this.f15356d.getCurrentState() == 5) {
                                this.f15371s.removeAllViews();
                                this.f15371s.addView(this.f15356d);
                                this.f15356d.onVideoResume(false);
                                v0.d("MyListViewVideoHelper", "444444 ");
                            } else if (this.f15371s.getChildAt(0) == null) {
                                this.f15371s.removeAllViews();
                                v0.d("MyListViewVideoHelper", "55555555 ");
                                this.f15371s.addView(this.f15356d);
                            }
                        } else {
                            v0.d("MyListViewVideoHelper", "66666666 ");
                            l lVar = this.f15358f.get(simpleDraweeView.getTag());
                            if (lVar != null && lVar.h() != null) {
                                ViewGroup viewGroup = (ViewGroup) this.f15356d.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeAllViews();
                                    SimpleDraweeView simpleDraweeView3 = this.f15369q;
                                    if (simpleDraweeView3 != null) {
                                        simpleDraweeView3.setVisibility(0);
                                    }
                                    v0.d("MyListViewVideoHelper", "7777777 ");
                                }
                                this.f15356d.setPlayTag(this.f15355c);
                                this.f15356d.setPlayPosition(((Integer) simpleDraweeView.getTag()).intValue());
                                this.f15356d.setSwitchUrl(lVar.h());
                                this.f15356d.setUp(lVar.h(), StandardVideoView.D, "", lVar.a());
                                this.f15371s.addView(this.f15356d);
                                N(((Integer) simpleDraweeView.getTag()).intValue());
                                SimpleDraweeView simpleDraweeView4 = this.f15369q;
                                if (simpleDraweeView4 != null) {
                                    Animation animation = simpleDraweeView4.getAnimation();
                                    if (animation != null) {
                                        animation.setAnimationListener(null);
                                    }
                                    v0.d("MyListViewVideoHelper", "lastBannerView tag =" + this.f15369q.getTag());
                                    this.f15369q.clearAnimation();
                                }
                                this.f15369q = simpleDraweeView;
                                v0.d("MyListViewVideoHelper", "lastBannerViewNew tag =" + this.f15369q.getTag());
                                this.f15370r = simpleDraweeView2;
                                this.f15356d.setChangeCoverShowListener(new i());
                                this.f15356d.setChangeCoverShowLoadingListener(new j());
                                if (this.f15356d.d()) {
                                    v0.d("MyListViewVideoHelper", "888888888 " + simpleDraweeView.getTag());
                                    this.f15356d.startPlayLogic();
                                }
                                v0.d("MyListViewVideoHelper", "startplaylogic ");
                            }
                        }
                        z4 = true;
                    } else {
                        v0.d("MyListViewVideoHelper", "out to play Are   standardVideoView status  " + this.f15356d.getCurrentState() + "  " + simpleDraweeView.getTag());
                        if (((Integer) simpleDraweeView.getTag()).intValue() == A() && (this.f15356d.getCurrentState() == 2 || this.f15356d.getCurrentState() == 1)) {
                            this.f15356d.onVideoPause();
                            v0.d("MyListViewVideoHelper", "out to play Are   onVideoPause  ");
                        }
                        this.f15371s.removeAllViews();
                        simpleDraweeView.setVisibility(0);
                        v0.d("MyListViewVideoHelper", "out to play Are ");
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public synchronized void p(AbsHListView absHListView) {
        this.f15364l = absHListView;
        try {
            SimpleDraweeView simpleDraweeView = null;
            SimpleDraweeView simpleDraweeView2 = null;
            boolean z4 = false;
            for (int i4 = this.f15360h; i4 < this.f15361i; i4++) {
                if (absHListView != null && absHListView.getChildAt(i4) != null && absHListView.getChildAt(i4).findViewById(R.id.videoContner) != null) {
                    this.f15371s = (FrameLayout) absHListView.getChildAt(i4).findViewById(R.id.videoContner);
                    if (absHListView.getChildAt(i4) != null && absHListView.getChildAt(i4).findViewById(R.id.bannerView) != null) {
                        simpleDraweeView = (SimpleDraweeView) absHListView.getChildAt(i4).findViewById(R.id.bannerView);
                    }
                    if (absHListView.getChildAt(i4) != null && absHListView.getChildAt(i4).findViewById(R.id.loading) != null) {
                        simpleDraweeView2 = (SimpleDraweeView) absHListView.getChildAt(i4).findViewById(R.id.loading);
                    }
                    Rect rect = new Rect();
                    this.f15371s.getLocalVisibleRect(rect);
                    int width = this.f15371s.getWidth();
                    this.f15369q = simpleDraweeView;
                    v0.d("MyListViewVideoHelper", "lastBannerViewNew tag =" + this.f15369q.getTag());
                    this.f15370r = simpleDraweeView2;
                    StandardVideoView standardVideoView = this.f15356d;
                    if (standardVideoView != null) {
                        standardVideoView.setChangeCoverShowListener(new g());
                        this.f15356d.setChangeCoverShowLoadingListener(new h());
                    }
                    v0.d("MyListViewVideoHelper" + this.f15355c, "1111111111111    " + simpleDraweeView.getTag() + "rect.left:" + rect.left + "rect.right:" + rect.right + "videoHeight:" + width);
                    if (rect.left == 0 && rect.right == width && !z4) {
                        v0.d("MyListViewVideoHelper" + this.f15355c, "2222222 ");
                        if (simpleDraweeView.getTag() != null && ((Integer) simpleDraweeView.getTag()).intValue() == A() && this.f15356d.getCurrentState() != 6) {
                            v0.d("MyListViewVideoHelper" + this.f15355c, "333333 ");
                            if (this.f15356d.getCurrentState() == 5) {
                                ViewParent parent = this.f15356d.getParent();
                                if (parent != null && (parent instanceof ViewGroup)) {
                                    ((ViewGroup) this.f15356d.getParent()).removeView(this.f15356d);
                                }
                                this.f15371s.removeAllViews();
                                this.f15371s.addView(this.f15356d);
                                this.f15356d.onVideoResume(false);
                                v0.d("MyListViewVideoHelper" + this.f15355c, "444444 ");
                            } else if (this.f15371s.getChildAt(0) == null) {
                                this.f15371s.removeAllViews();
                                v0.d("MyListViewVideoHelper" + this.f15355c, "55555555 ");
                                ViewGroup viewGroup = (ViewGroup) this.f15356d.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(this.f15356d);
                                }
                                this.f15371s.addView(this.f15356d);
                            }
                        } else {
                            v0.d("MyListViewVideoHelper" + this.f15355c, "66666666 ");
                            l lVar = this.f15358f.get(simpleDraweeView.getTag());
                            if (lVar == null) {
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) this.f15356d.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeAllViews();
                                SimpleDraweeView simpleDraweeView3 = this.f15369q;
                                if (simpleDraweeView3 != null) {
                                    simpleDraweeView3.setVisibility(0);
                                }
                                v0.d("MyListViewVideoHelper" + this.f15355c, "7777777 ");
                            }
                            this.f15356d.setPlayTag(this.f15355c);
                            this.f15356d.setPlayPosition(((Integer) simpleDraweeView.getTag()).intValue());
                            this.f15356d.setSwitchUrl(lVar.h());
                            this.f15356d.setUp(lVar.h(), StandardVideoView.D, "", lVar.a());
                            ViewParent parent2 = this.f15356d.getParent();
                            if (parent2 != null && (parent2 instanceof ViewGroup)) {
                                ((ViewGroup) this.f15356d.getParent()).removeView(this.f15356d);
                            }
                            this.f15371s.addView(this.f15356d);
                            N(((Integer) simpleDraweeView.getTag()).intValue());
                            SimpleDraweeView simpleDraweeView4 = this.f15369q;
                            if (simpleDraweeView4 != null) {
                                Animation animation = simpleDraweeView4.getAnimation();
                                if (animation != null) {
                                    animation.setAnimationListener(null);
                                }
                                v0.d("MyListViewVideoHelper" + this.f15355c, "lastBannerView tag =" + this.f15369q.getTag());
                                this.f15369q.clearAnimation();
                            }
                            if (this.f15356d.d()) {
                                v0.d("MyListViewVideoHelper" + this.f15355c, "888888888 " + simpleDraweeView.getTag());
                                this.f15356d.startPlayLogic();
                            }
                            v0.d("MyListViewVideoHelper" + this.f15355c, "startplaylogic ");
                        }
                        z4 = true;
                    } else {
                        v0.d("MyListViewVideoHelper" + this.f15355c, "out to play Are   standardVideoView status  " + this.f15356d.getCurrentState() + "  " + simpleDraweeView.getTag());
                        if (simpleDraweeView.getTag() != null && ((Integer) simpleDraweeView.getTag()).intValue() == A() && (this.f15356d.getCurrentState() == 2 || this.f15356d.getCurrentState() == 1)) {
                            this.f15356d.onVideoPause();
                            v0.d("MyListViewVideoHelper" + this.f15355c, "out to play Are   onVideoPause  ");
                        }
                        this.f15371s.removeAllViews();
                        simpleDraweeView.setVisibility(0);
                        v0.d("MyListViewVideoHelper" + this.f15355c, "out to play Are ");
                        z4 = false;
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public synchronized void q(RecyclerView recyclerView) {
        this.f15365m = recyclerView;
        try {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            this.f15361i = linearLayoutManager.findLastVisibleItemPosition() - linearLayoutManager.findFirstVisibleItemPosition();
            SimpleDraweeView simpleDraweeView = null;
            SimpleDraweeView simpleDraweeView2 = null;
            boolean z4 = false;
            for (int i4 = this.f15360h; i4 < this.f15361i; i4++) {
                if (linearLayoutManager.getChildAt(i4) != null && linearLayoutManager.getChildAt(i4).findViewById(R.id.videoContner) != null) {
                    this.f15371s = (FrameLayout) linearLayoutManager.getChildAt(i4).findViewById(R.id.videoContner);
                    if (linearLayoutManager.getChildAt(i4) != null && linearLayoutManager.getChildAt(i4).findViewById(R.id.bannerView) != null) {
                        simpleDraweeView = (SimpleDraweeView) linearLayoutManager.getChildAt(i4).findViewById(R.id.bannerView);
                    }
                    if (linearLayoutManager.getChildAt(i4) != null && linearLayoutManager.getChildAt(i4).findViewById(R.id.loading) != null) {
                        simpleDraweeView2 = (SimpleDraweeView) linearLayoutManager.getChildAt(i4).findViewById(R.id.loading);
                    }
                    Rect rect = new Rect();
                    this.f15371s.getLocalVisibleRect(rect);
                    int height = this.f15371s.getHeight();
                    this.f15369q = simpleDraweeView;
                    this.f15370r = simpleDraweeView2;
                    StandardVideoView standardVideoView = this.f15356d;
                    if (standardVideoView != null) {
                        standardVideoView.setChangeCoverShowListener(new k());
                        this.f15356d.setChangeCoverShowLoadingListener(new a());
                    }
                    v0.d("MyListViewVideoHelper", "1111111111111    " + simpleDraweeView.getTag());
                    if (rect.top == 0 && rect.bottom == height && !z4) {
                        v0.d("MyListViewVideoHelper", "2222222 ");
                        if (((Integer) simpleDraweeView.getTag()).intValue() == A() && this.f15356d.getCurrentState() != 6) {
                            v0.d("MyListViewVideoHelper", "333333 ");
                            if (this.f15356d.getCurrentState() == 5) {
                                this.f15371s.removeAllViews();
                                ViewParent parent = this.f15356d.getParent();
                                if (parent != null && (parent instanceof ViewGroup)) {
                                    ((ViewGroup) this.f15356d.getParent()).removeView(this.f15356d);
                                }
                                this.f15371s.addView(this.f15356d);
                                this.f15356d.onVideoResume(false);
                                v0.d("MyListViewVideoHelper", "444444 ");
                            } else if (this.f15371s.getChildAt(0) == null) {
                                this.f15371s.removeAllViews();
                                v0.d("MyListViewVideoHelper", "55555555 ");
                                ViewParent parent2 = this.f15356d.getParent();
                                if (parent2 != null && (parent2 instanceof ViewGroup)) {
                                    ((ViewGroup) this.f15356d.getParent()).removeView(this.f15356d);
                                }
                                this.f15371s.addView(this.f15356d);
                            }
                        } else {
                            v0.d("MyListViewVideoHelper", "66666666 ");
                            l lVar = this.f15358f.get(simpleDraweeView.getTag());
                            if (lVar != null && lVar.h() != null) {
                                ViewGroup viewGroup = (ViewGroup) this.f15356d.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeAllViews();
                                    SimpleDraweeView simpleDraweeView3 = this.f15369q;
                                    if (simpleDraweeView3 != null) {
                                        simpleDraweeView3.setVisibility(0);
                                    }
                                    v0.d("MyListViewVideoHelper", "7777777 ");
                                }
                                this.f15356d.setPlayTag(this.f15355c);
                                this.f15356d.setPlayPosition(((Integer) simpleDraweeView.getTag()).intValue());
                                this.f15356d.setSwitchUrl(lVar.h());
                                this.f15356d.setUp(lVar.h(), StandardVideoView.D, "", lVar.a());
                                this.f15371s.addView(this.f15356d);
                                N(((Integer) simpleDraweeView.getTag()).intValue());
                                SimpleDraweeView simpleDraweeView4 = this.f15369q;
                                if (simpleDraweeView4 != null) {
                                    Animation animation = simpleDraweeView4.getAnimation();
                                    if (animation != null) {
                                        animation.setAnimationListener(null);
                                    }
                                    v0.d("MyListViewVideoHelper", "lastBannerView tag =" + this.f15369q.getTag());
                                    this.f15369q.clearAnimation();
                                }
                                if (this.f15356d.d()) {
                                    v0.d("MyListViewVideoHelper", "888888888 " + simpleDraweeView.getTag());
                                    this.f15356d.startPlayLogic();
                                }
                                v0.d("MyListViewVideoHelper", "startplaylogic ");
                            }
                        }
                        z4 = true;
                    } else {
                        v0.d("MyListViewVideoHelper", "out to play Are   standardVideoView status  " + this.f15356d.getCurrentState() + "  " + simpleDraweeView.getTag());
                        if (((Integer) simpleDraweeView.getTag()).intValue() == A() && (this.f15356d.getCurrentState() == 2 || this.f15356d.getCurrentState() == 1)) {
                            this.f15356d.onVideoPause();
                            v0.d("MyListViewVideoHelper", "out to play Are   onVideoPause  ");
                        }
                        this.f15371s.removeAllViews();
                        ViewParent parent3 = this.f15356d.getParent();
                        if (parent3 != null && (parent3 instanceof ViewGroup)) {
                            ((ViewGroup) this.f15356d.getParent()).removeView(this.f15356d);
                        }
                        simpleDraweeView.setVisibility(0);
                        v0.d("MyListViewVideoHelper", "out to play Are ");
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public boolean r() {
        return this.f15357e;
    }

    public void s() {
        this.f15358f.clear();
    }

    public void t() {
        StandardVideoView standardVideoView = this.f15356d;
        if (standardVideoView != null) {
            if (!standardVideoView.d() && this.f15356d.getCurrentState() == 0) {
                this.f15356d.startPlayLogic();
            } else {
                this.f15356d.startWindowFullscreen(this.f15353a, false, true);
            }
        }
    }

    /* compiled from: MyListViewVideoHelper.java */
    /* loaded from: classes3.dex */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        int f15389a;

        /* renamed from: b  reason: collision with root package name */
        String f15390b;

        /* renamed from: c  reason: collision with root package name */
        String f15391c;

        /* renamed from: d  reason: collision with root package name */
        IntentDateBean f15392d;

        /* renamed from: e  reason: collision with root package name */
        String f15393e;

        /* renamed from: f  reason: collision with root package name */
        String f15394f;

        /* renamed from: g  reason: collision with root package name */
        String f15395g;

        /* renamed from: h  reason: collision with root package name */
        String f15396h;

        public l(int i4, String str, String str2, IntentDateBean intentDateBean) {
            this.f15389a = i4;
            this.f15390b = str;
            this.f15391c = str2;
            this.f15392d = intentDateBean;
        }

        public String a() {
            return this.f15391c;
        }

        public String b() {
            return this.f15395g;
        }

        public String c() {
            return this.f15394f;
        }

        public IntentDateBean d() {
            return this.f15392d;
        }

        public int e() {
            return this.f15389a;
        }

        public String f() {
            return this.f15393e;
        }

        public String g() {
            return this.f15396h;
        }

        public String h() {
            return this.f15390b;
        }

        public void i(String str) {
            this.f15391c = str;
        }

        public void j(String str) {
            this.f15395g = str;
        }

        public void k(String str) {
            this.f15394f = str;
        }

        public void l(IntentDateBean intentDateBean) {
            this.f15392d = intentDateBean;
        }

        public void m(int i4) {
            this.f15389a = i4;
        }

        public void n(String str) {
            this.f15393e = str;
        }

        public void o(String str) {
            this.f15396h = str;
        }

        public void p(String str) {
            this.f15390b = str;
        }

        public l(int i4, String str, String str2) {
            this.f15389a = i4;
            this.f15390b = str;
            this.f15391c = str2;
        }

        public l(int i4, String str, String str2, String str3, String str4, String str5) {
            this.f15389a = i4;
            this.f15390b = str;
            this.f15391c = str2;
            this.f15394f = str3;
            this.f15395g = str4;
            this.f15396h = str5;
        }
    }

    public c(Context context, String str) {
        E(context, str, false);
    }

    public c(Context context, String str, boolean z4) {
        E(context, str, z4);
    }
}
