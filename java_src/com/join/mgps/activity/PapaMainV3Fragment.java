package com.join.mgps.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.MApplication;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.google.android.material.appbar.AppBarLayout;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.xrecyclerview.XRecyclerView2;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.presenter.HomeViewModle;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.ImageHandler;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.HomeRecommendAdapter;
import com.join.mgps.adapter.PapaMainV2Adapter;
import com.join.mgps.business.RecomDatabeanBusiness;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.AppBeanMain;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.HomeFloatData;
import com.join.mgps.dto.MgpapaMainItemBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.PAPAHomeBeanV7;
import com.join.mgps.dto.PAPAItemTitle2;
import com.join.mgps.dto.PapaHomeCheckNewDataBean;
import com.join.mgps.dto.RecomDatabean;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestOnlineCouponArgs;
import com.join.mgps.dto.RequestdetialFolowAndBeSpeak;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.SScrollingTxtBeanV2;
import com.join.mgps.dto.SScrollingTxtDTOV2;
import com.join.mgps.dto.VipPopData;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.kuaishou.weapon.p0.bi;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.ExtFrom;
import com.psk.eventmodule.Event;
import com.psk.eventmodule.StatFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
@EFragment(R.layout.mgpapa_mainfragment_new_layout_v3)
/* loaded from: classes.dex */
public class PapaMainV3Fragment extends ImageHandler.AdFragment implements View.OnClickListener {

    /* renamed from: c2  reason: collision with root package name */
    private static final String f36590c2 = "MGPapaMainFragmentNewV2";
    private LinearLayout A;
    private boolean A1;
    private LinearLayout B;
    private boolean B1;
    private PapaMainV2Adapter C;
    private long C1;
    private List<MgpapaMainItemBean> D;
    private boolean D1;
    private int E;
    private boolean E1;
    private int F;
    private long G;
    com.join.mgps.customview.o I1;
    @ViewById
    PtrClassicFrameLayout J;
    @ViewById
    View K;
    private int L1;
    private int M1;
    private RecomDatabean N1;
    private RecomDatabean O1;
    com.join.android.app.component.video.g Q;
    MGMainActivity R;
    HomeViewModle S;
    private String T;
    private Handler V;
    private long W1;
    private int X1;
    private String Y;
    private ArrayList<SScrollingTxtBeanV2> Z;
    private String Z1;

    /* renamed from: a2  reason: collision with root package name */
    private boolean f36591a2;

    /* renamed from: b2  reason: collision with root package name */
    private boolean f36592b2;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    XRecyclerView2 f36593d;
    @StringRes(resName = "net_excption")

    /* renamed from: e  reason: collision with root package name */
    String f36594e;
    @StringRes(resName = "connect_server_excption")

    /* renamed from: f  reason: collision with root package name */
    String f36595f;

    /* renamed from: g  reason: collision with root package name */
    com.join.mgps.rpc.e f36596g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f36597h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f36598i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f36599j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ImageView f36600k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    View f36601l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    SimpleDraweeView f36602m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    ImageView f36603n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    View f36604o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    FrameLayout f36605p;

    /* renamed from: p0  reason: collision with root package name */
    private int f36606p0;

    /* renamed from: p1  reason: collision with root package name */
    private boolean f36607p1;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    ViewFlipper f36608q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    ImageView f36609r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    AppBarLayout f36610s;
    @FragmentArg

    /* renamed from: t  reason: collision with root package name */
    String f36611t;

    /* renamed from: u  reason: collision with root package name */
    private Context f36612u;

    /* renamed from: v  reason: collision with root package name */
    private List<DownloadTask> f36613v;

    /* renamed from: v1  reason: collision with root package name */
    private int f36614v1;

    /* renamed from: w  reason: collision with root package name */
    private boolean f36615w;
    @Pref

    /* renamed from: z  reason: collision with root package name */
    PrefDef_ f36618z;

    /* renamed from: x  reason: collision with root package name */
    List<RecomDatabeanBusiness> f36616x = null;

    /* renamed from: y  reason: collision with root package name */
    private Map<String, DownloadTask> f36617y = new ConcurrentHashMap();
    private boolean H = false;
    com.join.mgps.pref.f I = null;
    private boolean L = false;
    private boolean M = false;
    private String N = "m1";
    private int O = 1;
    private int P = 0;
    private List<PAPAHomeBeanV7.HomeBeanDTO> U = null;
    private boolean W = true;
    private List<Integer> X = new ArrayList();
    int F1 = 0;
    boolean G1 = true;
    private String H1 = "28";
    private int J1 = 0;
    private int K1 = 0;
    private String P1 = "";
    long Q1 = 0;
    long R1 = 0;
    boolean S1 = true;
    private boolean T1 = true;
    private SparseArray U1 = new SparseArray(0);
    GestureDetector V1 = new GestureDetector(new b());
    Runnable Y1 = new c();

    /* loaded from: classes4.dex */
    class a extends LinearSmoothScroller {
        a(Context context) {
            super(context);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return super.calculateSpeedPerPixel(displayMetrics);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        protected int getVerticalSnapPreference() {
            return -1;
        }
    }

    /* loaded from: classes4.dex */
    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
            Fresco.getImagePipeline().I();
            return super.onFling(motionEvent, motionEvent2, f5, f6);
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment papaMainV3Fragment = PapaMainV3Fragment.this;
            papaMainV3Fragment.S1 = false;
            if (papaMainV3Fragment.f36607p1) {
                if (PapaMainV3Fragment.this.f36618z.isFirstCommendVersion().d().booleanValue() && PapaMainV3Fragment.this.f36618z.isFirst35().d().booleanValue()) {
                    return;
                }
                PapaMainV3Fragment papaMainV3Fragment2 = PapaMainV3Fragment.this;
                XRecyclerView2 xRecyclerView2 = papaMainV3Fragment2.f36593d;
                if (xRecyclerView2 != null) {
                    papaMainV3Fragment2.E = xRecyclerView2.getLastCompletelyVisiblePosition();
                }
                for (int i4 = 0; i4 < PapaMainV3Fragment.this.D.size(); i4++) {
                    if (i4 <= PapaMainV3Fragment.this.E) {
                        MgpapaMainItemBean mgpapaMainItemBean = (MgpapaMainItemBean) PapaMainV3Fragment.this.D.get(i4);
                        if (!mgpapaMainItemBean.isHasExposure()) {
                            switch (mgpapaMainItemBean.getShowtype()) {
                                case 29:
                                case 40:
                                    PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO = (PAPAHomeBeanV7.HomeBeanDTO) mgpapaMainItemBean.getObject();
                                    if (homeBeanDTO != null) {
                                        if (TextUtils.equals(homeBeanDTO.getPosition(), "22-11-1")) {
                                            PapaMainV3Fragment.this.K1("20201", homeBeanDTO);
                                            break;
                                        } else if (TextUtils.equals(homeBeanDTO.getPosition(), "22-12-1")) {
                                            PapaMainV3Fragment.this.K1("20202", homeBeanDTO);
                                            break;
                                        }
                                    }
                                    break;
                                case 30:
                                    List list = (List) mgpapaMainItemBean.getObject();
                                    if (list != null && list.size() > 0) {
                                        for (int i5 = 0; i5 < list.size() && i5 < 4; i5++) {
                                            PAPAHomeBeanV7.NgSelectionDTO ngSelectionDTO = (PAPAHomeBeanV7.NgSelectionDTO) list.get(i5);
                                            if (ngSelectionDTO != null) {
                                                PapaMainV3Fragment.this.L1("204", ngSelectionDTO.getPosition(), ngSelectionDTO.getId());
                                                ngSelectionDTO.setHasExposure(true);
                                                list.set(i5, ngSelectionDTO);
                                            }
                                        }
                                        mgpapaMainItemBean.setObject(list);
                                        PapaMainV3Fragment.this.D.set(i4, mgpapaMainItemBean);
                                        break;
                                    }
                                    break;
                                case 32:
                                    PAPAHomeBeanV7.RankingListDTO rankingListDTO = (PAPAHomeBeanV7.RankingListDTO) mgpapaMainItemBean.getObject();
                                    if (rankingListDTO != null && rankingListDTO.getList() != null && rankingListDTO.getList().size() > 0) {
                                        PapaMainV3Fragment.this.L0(0, rankingListDTO.getList(), "20501");
                                        break;
                                    }
                                    break;
                                case 34:
                                    PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO2 = (PAPAHomeBeanV7.HomeBeanDTO) mgpapaMainItemBean.getObject();
                                    if (homeBeanDTO2 != null) {
                                        PapaMainV3Fragment.this.K1("206", homeBeanDTO2);
                                        break;
                                    }
                                    break;
                                case 35:
                                    List list2 = (List) mgpapaMainItemBean.getObject();
                                    if (list2 != null && list2.size() > 0) {
                                        for (int i6 = 0; i6 < list2.size() && i6 < 4; i6++) {
                                            PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO3 = (PAPAHomeBeanV7.HomeBeanDTO) list2.get(i6);
                                            if (homeBeanDTO3 != null) {
                                                PapaMainV3Fragment.this.K1("206", homeBeanDTO3);
                                                homeBeanDTO3.setHasExposure(true);
                                                list2.set(i6, homeBeanDTO3);
                                            }
                                        }
                                        mgpapaMainItemBean.setObject(list2);
                                        PapaMainV3Fragment.this.D.set(i4, mgpapaMainItemBean);
                                        break;
                                    }
                                    break;
                                case 36:
                                    PapaMainV3Fragment.this.K1("206", (PAPAHomeBeanV7.HomeBeanDTO) mgpapaMainItemBean.getObject());
                                    break;
                                case 37:
                                    PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO4 = (PAPAHomeBeanV7.HomeBeanDTO) mgpapaMainItemBean.getObject();
                                    if (homeBeanDTO4 != null) {
                                        PapaMainV3Fragment.this.K1("201", homeBeanDTO4);
                                        PapaMainV3Fragment.this.P1(Event.exposure, homeBeanDTO4);
                                        break;
                                    }
                                    break;
                                case 38:
                                    PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO5 = (PAPAHomeBeanV7.HomeBeanDTO) mgpapaMainItemBean.getObject();
                                    if (homeBeanDTO5 != null) {
                                        PapaMainV3Fragment.this.K1("203", homeBeanDTO5);
                                        PapaMainV3Fragment.this.P1(Event.exposure, homeBeanDTO5);
                                        break;
                                    }
                                    break;
                                case 39:
                                    PapaMainV3Fragment.p0(PapaMainV3Fragment.this);
                                    PapaMainV3Fragment papaMainV3Fragment3 = PapaMainV3Fragment.this;
                                    papaMainV3Fragment3.J1(papaMainV3Fragment3.X1);
                                    break;
                            }
                            mgpapaMainItemBean.setHasExposure(true);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            PapaMainV3Fragment.this.f36591a2 = false;
            PapaMainV3Fragment.this.f36592b2 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            PapaMainV3Fragment.this.f36591a2 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            PapaMainV3Fragment.this.f36591a2 = false;
            PapaMainV3Fragment.this.f36592b2 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            PapaMainV3Fragment.this.f36591a2 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements w1.c {
        f() {
        }

        @Override // w1.c
        public void onClickCancle() {
        }

        @Override // w1.c
        public void onClickOk() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements c2.f {
        g() {
        }

        @Override // c2.f
        public void a(String str, int i4) {
            if (i4 == 1 || IntentUtil.getInstance().goLoginNetGame(PapaMainV3Fragment.this.f36612u)) {
                return;
            }
            PapaMainV3Fragment.this.O0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements XRecyclerView2.g {
        h() {
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView2.g
        public void onLoadMore() {
            StringBuilder sb = new StringBuilder();
            sb.append("onLoadMore: ");
            sb.append(PapaMainV3Fragment.this.O);
            sb.append("  ");
            sb.append(PapaMainV3Fragment.this.W);
            if (!PapaMainV3Fragment.this.W || PapaMainV3Fragment.this.E1) {
                return;
            }
            PapaMainV3Fragment papaMainV3Fragment = PapaMainV3Fragment.this;
            papaMainV3Fragment.l1(papaMainV3Fragment.N, PapaMainV3Fragment.this.O);
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView2.g
        public void onRefresh() {
            PapaMainV3Fragment.this.E1();
            PapaMainV3Fragment.this.D1 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements PapaMainV2Adapter.h {
        i() {
        }

        @Override // com.join.mgps.adapter.PapaMainV2Adapter.h
        public void a(int i4, PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
            if (homeBeanDTO.getG_info() == null) {
                return;
            }
            PapaMainV3Fragment.this.P0(homeBeanDTO.getG_info().getId(), homeBeanDTO);
        }

        @Override // com.join.mgps.adapter.PapaMainV2Adapter.h
        public void b(int i4, List<List<PAPAHomeBeanV7.HomeBeanDTO>> list) {
            PapaMainV3Fragment.this.L0(i4, list, i4 != 0 ? i4 != 1 ? i4 != 2 ? "" : "20503" : "20502" : "20501");
        }

        @Override // com.join.mgps.adapter.PapaMainV2Adapter.h
        public void c(int i4, PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j extends GridLayoutManager.SpanSizeLookup {
        j() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i4) {
            if (PapaMainV3Fragment.this.D.size() <= i4 || PapaMainV3Fragment.this.D.get(i4) == null) {
                return 2;
            }
            int showtype = ((MgpapaMainItemBean) PapaMainV3Fragment.this.D.get(i4)).getShowtype();
            return (showtype == 28 || showtype == 34 || showtype == 37 || showtype == 38) ? 1 : 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k extends RecyclerView.OnScrollListener {
        k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            PapaMainV3Fragment.this.w1(recyclerView, i4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i4, int i5) {
            super.onScrolled(recyclerView, i4, i5);
            PapaMainV3Fragment papaMainV3Fragment = PapaMainV3Fragment.this;
            papaMainV3Fragment.E = papaMainV3Fragment.f36593d.getLastVisiblePosition();
            PapaMainV3Fragment papaMainV3Fragment2 = PapaMainV3Fragment.this;
            papaMainV3Fragment2.F = papaMainV3Fragment2.f36593d.getFirstVisiblePosition();
            MGMainActivity mGMainActivity = (MGMainActivity) PapaMainV3Fragment.this.getActivity();
            if (PapaMainV3Fragment.this.F < PapaMainV3Fragment.this.P || PapaMainV3Fragment.this.P == 0) {
                if (PapaMainV3Fragment.this.E + 1 < PapaMainV3Fragment.this.P) {
                    if (!PapaMainV3Fragment.this.T1) {
                        mGMainActivity.setHomeTabImage(true);
                    }
                    PapaMainV3Fragment.this.T1 = true;
                }
            } else {
                if (PapaMainV3Fragment.this.T1) {
                    mGMainActivity.setHomeTabImage(false);
                }
                PapaMainV3Fragment.this.T1 = false;
            }
            if (PapaMainV3Fragment.this.D1 && PapaMainV3Fragment.this.C.v(PapaMainV3Fragment.this.f36593d.getFirstCompletelyVisiblePosition()).getPage() == 2) {
                PapaMainV3Fragment.this.T1();
                Bundle bundle = new Bundle();
                bundle.putBoolean("homeHasNewData", false);
                PapaMainV3Fragment.this.I.callHomePageNewData(bundle);
                PapaMainV3Fragment.this.D1 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements View.OnTouchListener {
        l() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PapaMainV3Fragment.this.V1.onTouchEvent(motionEvent);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.join.android.app.component.video.g gVar = PapaMainV3Fragment.this.Q;
            if (gVar != null) {
                gVar.e();
            }
        }
    }

    /* loaded from: classes4.dex */
    class n {

        /* renamed from: a  reason: collision with root package name */
        int f36634a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f36635b = 0;

        n() {
        }
    }

    /* loaded from: classes4.dex */
    class o {

        /* renamed from: a  reason: collision with root package name */
        private ImageView f36637a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f36638b;

        /* renamed from: c  reason: collision with root package name */
        private ImageView f36639c;

        o() {
        }
    }

    private void A1(DownloadTask downloadTask) {
        for (PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO : this.U) {
            if (homeBeanDTO.getG_info() != null && (TextUtils.equals(homeBeanDTO.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(homeBeanDTO.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                homeBeanDTO.setDownloadTask(downloadTask);
            }
        }
        s1();
        e2(downloadTask);
    }

    private void B1(DownloadTask downloadTask) {
        for (PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO : this.U) {
            if (homeBeanDTO.getG_info() != null && (TextUtils.equals(homeBeanDTO.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(homeBeanDTO.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                homeBeanDTO.setDownloadTask(downloadTask);
            }
        }
        s1();
        e2(downloadTask);
    }

    private void C1(DownloadTask downloadTask) {
        for (PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO : this.U) {
            if (homeBeanDTO.getG_info() != null && (TextUtils.equals(homeBeanDTO.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(homeBeanDTO.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                homeBeanDTO.setDownloadTask(downloadTask);
            }
        }
        s1();
        e2(downloadTask);
    }

    private void D0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E1() {
        if (this.H) {
            return;
        }
        if (this.f36593d.getFirstVisiblePosition() > 1) {
            o1();
        }
        this.N = "m1";
        this.O = 1;
        this.P = 0;
        this.f36593d.setNoMoreView(false);
        this.W = true;
        l1("refresh", this.O);
        W0();
    }

    private void G0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J1(int i4) {
        Ext ext = new Ext();
        ext.setPage("home");
        ext.setReMarks(String.valueOf(i4));
        StringBuilder sb = new StringBuilder();
        sb.append("sendExposurePoint: ");
        sb.append(i4);
        com.papa.sim.statistic.p.l(this.f36612u).k0(com.papa.sim.statistic.Event.pullDownModelExp, ext, null);
    }

    private void K0() {
        if (this.V == null) {
            this.V = new Handler();
        }
        this.V.post(this.Y1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K1(String str, PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        boolean c12 = c1(homeBeanDTO);
        String T0 = T0(homeBeanDTO);
        if (T0 != null || c12) {
            Ext ext = new Ext();
            ext.setPage("home");
            ext.setFrom(str);
            if (c12) {
                if (homeBeanDTO.getJp_info() != null) {
                    ext.setReMarks(homeBeanDTO.getJp_info().getLink_type_val());
                }
            } else {
                ext.setGameId(T0);
            }
            ext.setPosition(homeBeanDTO.getPosition());
            Data data = new Data();
            data.setWhere(homeBeanDTO.getIntentDataBean().getLink_type_val());
            if (!TextUtils.isEmpty(T0)) {
                try {
                    data.setGameId(Long.parseLong(T0));
                } catch (Exception unused) {
                }
            }
            com.papa.sim.statistic.p.l(this.f36612u).T1(c12 ? com.papa.sim.statistic.Event.expH5AndCollGameAdPicPage : com.papa.sim.statistic.Event.expGameAdPage, ext, data);
            if (homeBeanDTO.isMiniGame()) {
                N1(homeBeanDTO);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(int i4, List<List<PAPAHomeBeanV7.HomeBeanDTO>> list, String str) {
        List<Integer> list2 = this.X;
        if (list2 == null || list2.contains(Integer.valueOf(i4)) || list == null || i4 > list.size() - 1) {
            return;
        }
        for (PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO : list.get(i4)) {
            K1(str, homeBeanDTO);
        }
        this.X.add(Integer.valueOf(i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L1(String str, String str2, String str3) {
        Ext ext = new Ext();
        ext.setPage("home");
        ext.setFrom(str);
        ext.setGameId(str3);
        ext.setPosition(str2);
        com.papa.sim.statistic.p.l(this.f36612u).k0(com.papa.sim.statistic.Event.expGameAdPage, ext, str3);
    }

    private void M1(boolean z4) {
        Ext ext = new Ext();
        ext.setPage(ExtFrom.home.name());
        ext.setPosition(z4 ? this.Z1 : null);
        com.papa.sim.statistic.p.l(this.f36612u).m1(com.papa.sim.statistic.Event.appPageVisit, ext);
    }

    private void N1(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        Ext ext = new Ext();
        ext.setPage("home");
        ext.setFrom("106");
        ext.setGameId(T0(homeBeanDTO));
        ext.setPosition(homeBeanDTO.getPosition());
        com.papa.sim.statistic.p.l(this.f36612u).k0(com.papa.sim.statistic.Event.expSmallGameAdPage, ext, this.f36611t);
    }

    private void O1(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("22-");
        sb.append(str);
        com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(this.f36612u);
        String name = ExtFrom.home.name();
        l4.t(name, "22-" + str, AccountUtil_.getInstance_(this.f36612u).getUid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P1(Event event, PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        String str;
        if (homeBeanDTO == null || homeBeanDTO.getG_info() == null || homeBeanDTO.getPosition() == null || homeBeanDTO.getG_info().getPosition_path() == null) {
            return;
        }
        String[] split = homeBeanDTO.getPosition().split("-");
        String str2 = "";
        if (split.length <= 2) {
            str = "0";
        } else if (!"22".equals(split[0])) {
            return;
        } else {
            if ("4".equals(split[1])) {
                str2 = "大家都在玩";
            } else if ("13".equals(split[1])) {
                str2 = "最新网游";
            }
            str = split[2];
        }
        String str3 = str;
        String str4 = str2;
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        String str5 = str4 + str3;
        if (TextUtils.equals(event.name(), Event.exposure.name()) && this.S.getLists().contains(str5)) {
            com.join.mgps.Util.v0.d("volcannoEvent", "hasSend= " + str4 + "  " + str3);
            return;
        }
        this.S.getLists().add(str5);
        StatFactory.Companion.getInstance(this.f36612u).sendEvent(new StatFactory.VolcanoEvent(event, homeBeanDTO.getG_info().getId(), new StatFactory.SpmData("wufun", "home", str4, str3, false), homeBeanDTO.getG_info().getPosition_path(), UtilsMy.l2(homeBeanDTO.getG_info().getTag_id())));
    }

    private void R1(List<RecomDatabean> list, int i4, int i5) {
        AppBean game_info;
        if (list != null) {
            for (RecomDatabean recomDatabean : list) {
                if (recomDatabean.getSub() != null && recomDatabean.getSub().size() > 0 && (game_info = recomDatabean.getSub().get(0).getGame_info()) != null) {
                    game_info.set_from(i4);
                    game_info.set_from_type(i5);
                }
            }
        }
    }

    private void S0() {
        Bundle bundle = new Bundle();
        bundle.putInt("localType", 1);
        com.join.mgps.pref.f fVar = this.I;
        if (fVar != null) {
            fVar.callOnlineCoupon(bundle);
        }
    }

    private String T0(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        if (homeBeanDTO == null || homeBeanDTO.getG_info() == null) {
            return null;
        }
        if (!TextUtils.isEmpty(homeBeanDTO.getG_info().getId()) && !TextUtils.equals(homeBeanDTO.getG_info().getId(), "0")) {
            return homeBeanDTO.getG_info().getId();
        }
        return homeBeanDTO.getG_info().getMod_id();
    }

    private void U1(MgpapaMainItemBean mgpapaMainItemBean) {
        List<AppBeanMain> sub;
        String str;
        int showtype = mgpapaMainItemBean.getShowtype();
        if ((showtype == 3 || showtype == 13) && (sub = mgpapaMainItemBean.getRecomDatabeanLeft().getSub()) != null && sub.size() > 0) {
            AppBean game_info = sub.get(0).getGame_info();
            String[] split = mgpapaMainItemBean.getMoreType2().split("-");
            str = "0";
            String str2 = "模块";
            if (split.length <= 0) {
                str2 = "";
            } else if (split[0].equals("4")) {
                str = split.length > 1 ? split[1] : "0";
                str2 = "大家都在玩";
            } else if (split[0].equals("7")) {
                str = split.length > 1 ? split[1] : "0";
                str2 = "网游推荐";
            } else if (split[0].equals("5")) {
                str = split.length > 1 ? split[1] : "0";
                str2 = "最新网游";
            } else {
                str = split.length > 2 ? split[2] : "0";
                if (split.length > 3) {
                    str2 = "模块" + split[1];
                    str = split[3];
                }
            }
            game_info.setRecPosition("home-" + str2 + "-" + str);
        }
    }

    private int V0() {
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i4 = this.F;
            if (i5 >= i4) {
                break;
            }
            n nVar = (n) this.U1.get(i5);
            if (nVar != null) {
                i6 += nVar.f36634a;
            }
            i5++;
        }
        n nVar2 = (n) this.U1.get(i4);
        if (nVar2 == null) {
            nVar2 = new n();
        }
        return i6 - nVar2.f36635b;
    }

    private void V1(List<RecomDatabean> list, List<RecomDatabean> list2, String str) {
        List<RecomDatabeanBusiness> y12 = y1(list, null);
        this.f36616x.addAll(y12);
        if (y12 == null || y12.size() == 0) {
            return;
        }
        for (int i4 = 0; i4 < y12.size(); i4++) {
            MgpapaMainItemBean mgpapaMainItemBean = new MgpapaMainItemBean();
            if (i4 != 0) {
                mgpapaMainItemBean.setMoreType2(str + (i4 + 1) + "-");
                mgpapaMainItemBean.setShowtype(3);
            } else if (list2 != null) {
                RecomDatabean recomDatabean = list2.get(0);
                mgpapaMainItemBean.setShowtype(13);
                y12.get(i4).getMain().setPic_remote(recomDatabean.getMain().getPic_remote());
                y12.get(i4).getMain().setVedio_url(recomDatabean.getMain().getVedio_url());
                mgpapaMainItemBean.setMoreType2(str + "x");
            }
            mgpapaMainItemBean.setMoreType(i4);
            mgpapaMainItemBean.setRecomDatabeanLeft(y12.get(i4));
            U1(mgpapaMainItemBean);
            this.D.add(mgpapaMainItemBean);
        }
    }

    private void a1() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 11) {
            this.f36600k.setVisibility(8);
        }
        this.A1 = com.join.android.app.common.utils.j.j(this.f36612u);
        HomeViewModle homeViewModle = (HomeViewModle) new ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(MApplication.f1497x)).get(HomeViewModle.class);
        this.S = homeViewModle;
        homeViewModle.initStat(this.f36612u);
        this.S.getLists().clear();
        if (i4 >= 21) {
            int v2 = com.join.android.app.common.utils.n.v(getContext());
            if (v2 > this.f36612u.getResources().getDimension(R.dimen.wdp62)) {
                this.f36605p.setPadding(0, v2, 0, 0);
            }
        }
        this.f36616x = new ArrayList();
        this.U = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.D = arrayList;
        PapaMainV2Adapter papaMainV2Adapter = new PapaMainV2Adapter(this.f36612u, this, arrayList, this.Q, new g());
        this.C = papaMainV2Adapter;
        papaMainV2Adapter.setHasStableIds(true);
        LayoutInflater.from(this.f36612u).inflate(R.layout.mg_papa_title_include_v2, (ViewGroup) null, false);
        this.f36593d.setLoadingListener(new h());
        this.f36593d.setPtrFrameLayout(this.J);
        this.f36593d.setPreLoadCount(10);
        this.C.T(new i());
        this.f36593d.setAdapter(this.C);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f36612u, 2);
        gridLayoutManager.setSpanSizeLookup(new j());
        this.f36593d.setLayoutManager(gridLayoutManager);
        this.f36593d.addOnScrollListener(new k());
        this.f36593d.setOnTouchListener(new l());
        this.J.j(true);
        this.f36610s.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: com.join.mgps.activity.n2
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i5) {
                PapaMainV3Fragment.this.i1(appBarLayout, i5);
            }
        });
    }

    private void b1(SScrollingTxtDTOV2 sScrollingTxtDTOV2) {
        if (sScrollingTxtDTOV2 == null) {
            return;
        }
        ArrayList<SScrollingTxtBeanV2> arrayList = new ArrayList<>(sScrollingTxtDTOV2.getText());
        this.Z = arrayList;
        if (arrayList.size() <= 0) {
            this.Z = new ArrayList<>();
        }
        this.f36608q.stopFlipping();
        this.f36608q.removeAllViews();
        Iterator<SScrollingTxtBeanV2> it2 = this.Z.iterator();
        while (it2.hasNext()) {
            TextView textView = (TextView) LayoutInflater.from(this.f36612u).inflate(R.layout.item_search_hint_viewflipper, (ViewGroup) null);
            textView.setText(it2.next().getWord());
            this.f36608q.addView(textView);
        }
        int interval = sScrollingTxtDTOV2.getInterval();
        this.f36606p0 = interval;
        if (interval < 1) {
            this.f36606p0 = 1;
        }
        this.f36608q.setFlipInterval(this.f36606p0 * 1000);
        this.f36608q.startFlipping();
        MApplication.G1 = this.Z;
        MApplication.H1 = this.f36606p0;
    }

    private boolean c1(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        return (homeBeanDTO == null || homeBeanDTO.getJp_info() == null || homeBeanDTO.getJp_info().getLink_type().intValue() == 1) ? false : true;
    }

    private void e2(DownloadTask downloadTask) {
        RecyclerView recyclerView;
        HomeRecommendAdapter homeRecommendAdapter;
        int i4 = this.F;
        if (i4 >= 0) {
            for (int i5 = i4; i5 <= Math.min(this.E + 1, this.C.getItemCount() - 1); i5++) {
                MgpapaMainItemBean v2 = this.C.v(i5);
                if (v2 != null) {
                    int showtype = v2.getShowtype();
                    if (showtype != 28) {
                        if (showtype != 29) {
                            switch (showtype) {
                                case 35:
                                    try {
                                        List<PAPAHomeBeanV7.HomeBeanDTO> list = (List) v2.getObject();
                                        RecyclerView.ViewHolder childViewHolder = this.f36593d.getChildViewHolder(this.f36593d.getChildAt(i5 - this.F));
                                        if (childViewHolder instanceof PapaMainV2Adapter.ViewHolderRecommendStyle2) {
                                            PapaMainV2Adapter.ViewHolderRecommendStyle2 viewHolderRecommendStyle2 = (PapaMainV2Adapter.ViewHolderRecommendStyle2) childViewHolder;
                                            if (list != null && (recyclerView = viewHolderRecommendStyle2.f43944a) != null && (homeRecommendAdapter = (HomeRecommendAdapter) recyclerView.getAdapter()) != null && homeRecommendAdapter.getData() != null) {
                                                for (PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO : list) {
                                                    if (homeBeanDTO != null && homeBeanDTO.getDownloadTask() != null && TextUtils.equals(downloadTask.getCrc_link_type_val(), homeBeanDTO.getDownloadTask().getCrc_link_type_val())) {
                                                        DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(homeBeanDTO.getDownloadTask().getCrc_link_type_val());
                                                        if (f5 != null) {
                                                            homeBeanDTO.setDownloadTask(f5);
                                                        }
                                                    }
                                                }
                                                homeRecommendAdapter.setNewData(list);
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } catch (Exception e5) {
                                        e5.printStackTrace();
                                        break;
                                    }
                                    break;
                            }
                        }
                        try {
                            PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO2 = (PAPAHomeBeanV7.HomeBeanDTO) v2.getObject();
                            RecyclerView.ViewHolder childViewHolder2 = this.f36593d.getChildViewHolder(this.f36593d.getChildAt(i5 - this.F));
                            if (childViewHolder2 instanceof PapaMainV2Adapter.ViewHolderBigPicVideo) {
                                PapaMainV2Adapter.ViewHolderBigPicVideo viewHolderBigPicVideo = (PapaMainV2Adapter.ViewHolderBigPicVideo) childViewHolder2;
                                if (homeBeanDTO2 != null && homeBeanDTO2.getG_info() != null) {
                                    homeBeanDTO2.setRequesting(false);
                                    if (TextUtils.equals(homeBeanDTO2.getG_info().getId(), downloadTask.getCrc_link_type_val()) || (homeBeanDTO2.getDownloadTask() != null && TextUtils.equals(downloadTask.getCrc_link_type_val(), homeBeanDTO2.getDownloadTask().getCrc_link_type_val()))) {
                                        update(homeBeanDTO2, viewHolderBigPicVideo.f43910c, viewHolderBigPicVideo.f43916i, viewHolderBigPicVideo.f43917j, viewHolderBigPicVideo.f43918k, viewHolderBigPicVideo.f43911d, viewHolderBigPicVideo.f43912e, viewHolderBigPicVideo.f43913f, viewHolderBigPicVideo.f43914g, viewHolderBigPicVideo.f43915h, viewHolderBigPicVideo.f43921n);
                                    }
                                }
                            }
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                    }
                    try {
                        PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO3 = (PAPAHomeBeanV7.HomeBeanDTO) v2.getObject();
                        homeBeanDTO3.setRequesting(false);
                        View childAt = this.f36593d.getChildAt(i5 - this.F);
                        if (childAt != null) {
                            RecyclerView.ViewHolder childViewHolder3 = this.f36593d.getChildViewHolder(childAt);
                            if (childViewHolder3 instanceof PapaMainV2Adapter.ViewHolderGameListGrid) {
                                PapaMainV2Adapter.ViewHolderGameListGrid viewHolderGameListGrid = (PapaMainV2Adapter.ViewHolderGameListGrid) childViewHolder3;
                                if (homeBeanDTO3.getG_info() != null) {
                                    if (TextUtils.equals(downloadTask.getCrc_link_type_val(), homeBeanDTO3.getG_info().getId()) || (homeBeanDTO3.getDownloadTask() != null && TextUtils.equals(downloadTask.getCrc_link_type_val(), homeBeanDTO3.getDownloadTask().getCrc_link_type_val()))) {
                                        update(homeBeanDTO3, viewHolderGameListGrid.f43932c, viewHolderGameListGrid.f43938i, viewHolderGameListGrid.f43939j, viewHolderGameListGrid.f43940k, viewHolderGameListGrid.f43933d, viewHolderGameListGrid.f43934e, viewHolderGameListGrid.f43935f, viewHolderGameListGrid.f43936g, viewHolderGameListGrid.f43937h, viewHolderGameListGrid.f43941l);
                                    }
                                }
                            }
                        }
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                }
            }
        }
    }

    private void g2(DownloadTask downloadTask) {
        try {
            List<RecomDatabeanBusiness> list = this.f36616x;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (int i4 = 0; i4 < this.f36616x.size(); i4++) {
                AppBean game_info = this.f36616x.get(i4).getSub().get(0).getGame_info();
                if (game_info != null) {
                    if (game_info.getMod_info() != null) {
                        ModInfoBean mod_info = game_info.getMod_info();
                        DownloadTask downloadTask2 = this.f36617y.get(mod_info.getMain_game_id());
                        boolean z4 = true;
                        boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                        DownloadTask downloadTask3 = this.f36617y.get(mod_info.getMod_game_id());
                        if (downloadTask3 == null || downloadTask3.getStatus() != 5) {
                            z4 = false;
                        }
                        if (z4 && z5) {
                            if (downloadTask.getCrc_link_type_val().equals(game_info.getCrc_sign_id())) {
                                this.f36616x.get(i4).d(downloadTask);
                            }
                        } else if (z4) {
                            if (game_info.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(game_info.getMod_info().getMod_game_id())) {
                                this.f36616x.get(i4).d(downloadTask);
                            }
                        } else if (z5) {
                            if (downloadTask.getCrc_link_type_val().equals(game_info.getCrc_sign_id())) {
                                this.f36616x.get(i4).d(downloadTask);
                            }
                        } else {
                            DownloadTask downloadTask4 = game_info.getMod_info() != null ? this.f36617y.get(game_info.getMod_info().getMod_game_id()) : null;
                            if (downloadTask4 == null) {
                                downloadTask4 = this.f36617y.get(game_info.getCrc_sign_id());
                            }
                            if (downloadTask4 != null && downloadTask.getCrc_link_type_val().equals(downloadTask4.getCrc_link_type_val())) {
                                this.f36616x.get(i4).d(downloadTask);
                            }
                        }
                    } else if (game_info.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                        this.f36616x.get(i4).d(downloadTask);
                        this.f36617y.put(downloadTask.getCrc_link_type_val(), downloadTask);
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h1() {
        this.E1 = false;
        this.W = true;
        XRecyclerView2 xRecyclerView2 = this.f36593d;
        if (xRecyclerView2 != null) {
            xRecyclerView2.setNoMoreView(false);
        }
        this.O = 2;
        l1(this.N, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i1(AppBarLayout appBarLayout, int i4) {
        this.J.setEnabled(i4 >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j1() {
        SimpleDraweeView simpleDraweeView = this.f36602m;
        if (simpleDraweeView == null || this.f36591a2 || !this.f36592b2 || simpleDraweeView.getVisibility() != 0) {
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f36602m, "translationX", this.f36612u.getResources().getDimension(R.dimen.wdp113), 0.0f).setDuration(150L);
        duration.addListener(new e());
        duration.start();
    }

    private void j2(TextView textView, LinearLayout linearLayout, ProgressBar progressBar, ProgressBar progressBar2, boolean z4, boolean z5) {
        if (z4) {
            textView.setVisibility(0);
            linearLayout.setVisibility(8);
            progressBar.setVisibility(8);
            progressBar2.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        textView.setVisibility(8);
        if (z5) {
            progressBar2.setVisibility(0);
            progressBar.setVisibility(8);
            return;
        }
        progressBar.setVisibility(0);
        progressBar2.setVisibility(8);
    }

    private void k2() {
        RecyclerView recyclerView;
        HomeRecommendAdapter homeRecommendAdapter;
        int i4 = this.F;
        if (i4 >= 0) {
            while (i4 <= Math.min(this.E + 1, this.C.getItemCount() - 1)) {
                MgpapaMainItemBean v2 = this.C.v(i4);
                if (v2 != null) {
                    int showtype = v2.getShowtype();
                    if (showtype != 28) {
                        if (showtype != 29) {
                            switch (showtype) {
                                case 35:
                                    try {
                                        List<PAPAHomeBeanV7.HomeBeanDTO> list = (List) v2.getObject();
                                        RecyclerView.ViewHolder childViewHolder = this.f36593d.getChildViewHolder(this.f36593d.getChildAt(i4 - this.F));
                                        if (childViewHolder instanceof PapaMainV2Adapter.ViewHolderRecommendStyle2) {
                                            PapaMainV2Adapter.ViewHolderRecommendStyle2 viewHolderRecommendStyle2 = (PapaMainV2Adapter.ViewHolderRecommendStyle2) childViewHolder;
                                            if (list != null && (recyclerView = viewHolderRecommendStyle2.f43944a) != null && (homeRecommendAdapter = (HomeRecommendAdapter) recyclerView.getAdapter()) != null && homeRecommendAdapter.getData() != null) {
                                                for (PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO : list) {
                                                    if (homeBeanDTO != null && homeBeanDTO.getDownloadTask() != null) {
                                                        DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(homeBeanDTO.getDownloadTask().getCrc_link_type_val());
                                                        if (f5 != null) {
                                                            homeBeanDTO.setDownloadTask(f5);
                                                        }
                                                    }
                                                }
                                                homeRecommendAdapter.setNewData(list);
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } catch (Exception e5) {
                                        e5.printStackTrace();
                                        break;
                                    }
                                    break;
                            }
                        }
                        try {
                            PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO2 = (PAPAHomeBeanV7.HomeBeanDTO) v2.getObject();
                            RecyclerView.ViewHolder childViewHolder2 = this.f36593d.getChildViewHolder(this.f36593d.getChildAt(i4 - this.F));
                            if (childViewHolder2 instanceof PapaMainV2Adapter.ViewHolderBigPicVideo) {
                                PapaMainV2Adapter.ViewHolderBigPicVideo viewHolderBigPicVideo = (PapaMainV2Adapter.ViewHolderBigPicVideo) childViewHolder2;
                                if (homeBeanDTO2 != null && homeBeanDTO2.getDownloadTask() != null) {
                                    DownloadTask downloadTask = homeBeanDTO2.getDownloadTask();
                                    DownloadTask f6 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                                    if (f6 != null) {
                                        long parseDouble = (long) (Double.parseDouble(f6.getShowSize()) * 1024.0d * 1024.0d);
                                        if (downloadTask.getSize() == 0) {
                                            TextView textView = viewHolderBigPicVideo.f43912e;
                                            textView.setText(UtilsMy.g(f6.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(parseDouble));
                                        } else {
                                            TextView textView2 = viewHolderBigPicVideo.f43912e;
                                            textView2.setText(UtilsMy.g(f6.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(parseDouble));
                                        }
                                        if (downloadTask.getStatus() == 12) {
                                            viewHolderBigPicVideo.f43914g.setProgress((int) f6.getProgress());
                                        } else {
                                            viewHolderBigPicVideo.f43915h.setProgress((int) f6.getProgress());
                                        }
                                        if (downloadTask.getStatus() == 2) {
                                            TextView textView3 = viewHolderBigPicVideo.f43913f;
                                            textView3.setText(f6.getSpeed() + "/S");
                                        }
                                    }
                                }
                            }
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                    }
                    try {
                        PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO3 = (PAPAHomeBeanV7.HomeBeanDTO) v2.getObject();
                        RecyclerView.ViewHolder childViewHolder3 = this.f36593d.getChildViewHolder(this.f36593d.getChildAt(i4 - this.F));
                        if (childViewHolder3 instanceof PapaMainV2Adapter.ViewHolderGameListGrid) {
                            PapaMainV2Adapter.ViewHolderGameListGrid viewHolderGameListGrid = (PapaMainV2Adapter.ViewHolderGameListGrid) childViewHolder3;
                            if (homeBeanDTO3 != null && homeBeanDTO3.getDownloadTask() != null) {
                                DownloadTask downloadTask2 = homeBeanDTO3.getDownloadTask();
                                DownloadTask f7 = com.join.android.app.common.servcie.i.e().f(downloadTask2.getCrc_link_type_val());
                                if (f7 != null) {
                                    long parseDouble2 = (long) (Double.parseDouble(f7.getShowSize()) * 1024.0d * 1024.0d);
                                    if (downloadTask2.getSize() == 0) {
                                        TextView textView4 = viewHolderGameListGrid.f43934e;
                                        textView4.setText(UtilsMy.g(f7.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(parseDouble2));
                                    } else {
                                        TextView textView5 = viewHolderGameListGrid.f43934e;
                                        textView5.setText(UtilsMy.g(f7.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(parseDouble2));
                                    }
                                    if (downloadTask2.getStatus() == 12) {
                                        viewHolderGameListGrid.f43936g.setProgress((int) f7.getProgress());
                                    } else {
                                        viewHolderGameListGrid.f43937h.setProgress((int) f7.getProgress());
                                    }
                                    if (downloadTask2.getStatus() == 2) {
                                        TextView textView6 = viewHolderGameListGrid.f43935f;
                                        textView6.setText(f7.getSpeed() + "/S");
                                    }
                                }
                            }
                        }
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                }
                i4++;
            }
        }
    }

    private PAPAHomeBeanV7.HomeBeanDTO n2(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, int i4, int i5) {
        List<PAPAHomeBeanV7.HomeBeanDTO> o22 = o2(new ArrayList<PAPAHomeBeanV7.HomeBeanDTO>(homeBeanDTO) { // from class: com.join.mgps.activity.PapaMainV3Fragment.9

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PAPAHomeBeanV7.HomeBeanDTO f36619b;

            {
                this.f36619b = homeBeanDTO;
                add(homeBeanDTO);
            }
        }, i4, i5);
        return (o22 == null || o22.size() <= 0) ? homeBeanDTO : o22.get(0);
    }

    private List<PAPAHomeBeanV7.HomeBeanDTO> o2(List<PAPAHomeBeanV7.HomeBeanDTO> list, int i4, int i5) {
        if (list != null && list.size() > 0) {
            List<DownloadTask> d5 = p1.f.K().d();
            for (PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO : list) {
                Iterator<DownloadTask> it2 = d5.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        DownloadTask next = it2.next();
                        if (homeBeanDTO.getG_info() != null && TextUtils.equals(next.getCrc_link_type_val(), homeBeanDTO.getG_info().getMod_id())) {
                            homeBeanDTO.setDownloadTask(next);
                            break;
                        } else if (homeBeanDTO.getG_info() != null && TextUtils.equals(next.getCrc_link_type_val(), homeBeanDTO.getG_info().getId())) {
                            homeBeanDTO.setDownloadTask(next);
                        }
                    }
                }
                homeBeanDTO.set_from(i4);
                homeBeanDTO.set_from_type(i5);
            }
        }
        return list;
    }

    static /* synthetic */ int p0(PapaMainV3Fragment papaMainV3Fragment) {
        int i4 = papaMainV3Fragment.X1;
        papaMainV3Fragment.X1 = i4 + 1;
        return i4;
    }

    private List<PAPAHomeBeanV7.HomeBeanDTO> p2(List<PAPAHomeBeanV7.HomeBeanDTO> list, String str) {
        if (list != null && list.size() > 0) {
            int i4 = 0;
            while (i4 < list.size()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                i4++;
                sb.append(i4);
                list.get(i4).setPosition(sb.toString());
            }
        }
        return list;
    }

    private List<PAPAHomeBeanV7.HomeBeanDTO> q2(List<PAPAHomeBeanV7.HomeBeanDTO> list) {
        if (list != null && list.size() > 0) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).setPosition("22-18-" + (this.f36614v1 + 1));
                this.f36614v1 = this.f36614v1 + 1;
            }
        }
        return list;
    }

    private List<PAPAHomeBeanV7.NgSelectionDTO> r2(List<PAPAHomeBeanV7.NgSelectionDTO> list, int i4) {
        if (list != null && list.size() > 0) {
            int i5 = 0;
            while (i5 < list.size()) {
                StringBuilder sb = new StringBuilder();
                sb.append("22-14-");
                int i6 = i5 + 1;
                sb.append(i6);
                list.get(i5).setPosition(sb.toString());
                list.get(i5).set_from(i4);
                list.get(i5).set_from_type(i4);
                i5 = i6;
            }
        }
        return list;
    }

    private void update(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, TextView textView, TextView textView2, FrameLayout frameLayout, TextView textView3, LinearLayout linearLayout, TextView textView4, TextView textView5, ProgressBar progressBar, ProgressBar progressBar2, ProgressBar progressBar3) {
        DownloadTask downloadTask = homeBeanDTO.getDownloadTask();
        CollectionBeanSub gameBean = homeBeanDTO.getGameBean();
        long size = downloadTask != null ? downloadTask.getSize() : 0L;
        textView3.setVisibility(0);
        progressBar3.setVisibility(4);
        if (gameBean != null) {
            if ((ConstantIntEnum.H5.value() + "").equals(gameBean.getPlugin_num())) {
                textView3.setText("开始");
                textView.setVisibility(8);
                return;
            }
        }
        if (downloadTask == null) {
            j2(textView2, linearLayout, progressBar2, progressBar, true, false);
            textView3.setText("获取");
            if (gameBean == null) {
                return;
            }
            if (UtilsMy.o0(gameBean.getTag_info())) {
                if (com.join.android.app.common.utils.e.l0(this.f36612u).d(this.f36612u, gameBean.getPackageName()) && UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id()) == 0) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f36612u).l(this.f36612u, gameBean.getPackageName());
                    if (com.join.mgps.Util.g2.i(gameBean.getVer()) && l4.d() < Integer.parseInt(gameBean.getVer())) {
                        textView3.setText("更新");
                        return;
                    } else {
                        textView3.setText("启动");
                        return;
                    }
                }
                UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id());
                UtilsMy.f3(textView3, frameLayout, gameBean);
                return;
            }
            UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id());
            UtilsMy.f3(textView3, frameLayout, gameBean);
            return;
        }
        int status = downloadTask.getStatus();
        if (gameBean != null && UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (status != 0) {
            if (status == 27) {
                textView3.setText("暂停");
                return;
            } else if (status == 48) {
                textView3.setText("安装中");
                j2(textView2, linearLayout, progressBar2, progressBar, true, false);
                return;
            } else if (status != 2) {
                if (status != 3) {
                    if (status != 5) {
                        if (status != 6) {
                            if (status != 7) {
                                if (status != 42) {
                                    if (status != 43) {
                                        switch (status) {
                                            case 9:
                                                textView3.setText("更新");
                                                j2(textView2, linearLayout, progressBar2, progressBar, true, false);
                                                return;
                                            case 10:
                                                textView3.setText("等待");
                                                j2(textView2, linearLayout, progressBar2, progressBar, false, false);
                                                textView4.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                                                try {
                                                    progressBar2.setProgress((int) downloadTask.getProgress());
                                                } catch (Exception e5) {
                                                    e5.printStackTrace();
                                                }
                                                textView5.setText("等待中");
                                                return;
                                            case 11:
                                                textView3.setText("安装");
                                                j2(textView2, linearLayout, progressBar2, progressBar, true, false);
                                                return;
                                            case 12:
                                                j2(textView2, linearLayout, progressBar2, progressBar, false, true);
                                                textView4.setText(UtilsMy.g(size) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                                                textView5.setText("解压中..");
                                                progressBar.setProgress((int) downloadTask.getProgress());
                                                textView3.setText("解压中");
                                                return;
                                            case 13:
                                                j2(textView2, linearLayout, progressBar2, progressBar, false, true);
                                                textView4.setText(UtilsMy.g(size) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                                                textView5.setText("点击重新解压");
                                                progressBar.setProgress((int) downloadTask.getProgress());
                                                textView3.setText("解压");
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    textView3.setText("启动");
                    j2(textView2, linearLayout, progressBar2, progressBar, true, true);
                    return;
                }
                textView3.setText("继续");
                j2(textView2, linearLayout, progressBar2, progressBar, false, false);
                try {
                    if (downloadTask.getSize() == 0) {
                        textView4.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                    } else {
                        textView4.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                    }
                    progressBar2.setProgress((int) downloadTask.getProgress());
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                textView5.setText("暂停中");
                return;
            } else {
                UtilsMy.x4(downloadTask);
                textView3.setText("暂停");
                j2(textView2, linearLayout, progressBar2, progressBar, false, false);
                if (downloadTask.getSize() == 0) {
                    textView4.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                } else {
                    textView4.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                }
                progressBar2.setProgress((int) downloadTask.getProgress());
                String speed = downloadTask.getSpeed();
                textView5.setText(speed + "/S");
                return;
            }
        }
        textView3.setText("获取");
        UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id());
        UtilsMy.f3(textView3, frameLayout, gameBean);
        j2(textView2, linearLayout, progressBar2, progressBar, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w1(RecyclerView recyclerView, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("onScrollStateChange: ");
        sb.append(i4);
        sb.append("  ");
        sb.append(this.f36593d.getLastCompletelyVisiblePosition());
        sb.append("  ");
        sb.append(this.C.getData().size() - 1);
        if (i4 == 0) {
            if (Fresco.getImagePipeline().H()) {
                Fresco.getImagePipeline().N();
            }
            d1();
            K0();
            com.join.android.app.component.video.g gVar = this.Q;
            if (gVar != null) {
                gVar.e();
            }
        } else if (this.f36593d.getLastCompletelyVisiblePosition() < this.C.getData().size() || this.W) {
            e1();
        }
        if (System.currentTimeMillis() - this.C1 > com.join.mgps.data.c.f49010a) {
            I0();
        }
    }

    private RecomDatabeanBusiness x1(RecomDatabean recomDatabean) {
        if (recomDatabean != null) {
            return new RecomDatabeanBusiness(recomDatabean);
        }
        return null;
    }

    private List<RecomDatabeanBusiness> y1(List<RecomDatabean> list, List<RecomDatabeanBusiness> list2) {
        if (list2 == null) {
            list2 = new ArrayList<>();
        } else {
            list2.clear();
        }
        if (list != null) {
            for (RecomDatabean recomDatabean : list) {
                list2.add(new RecomDatabeanBusiness(recomDatabean));
            }
        }
        return list2;
    }

    private void z1(DownloadTask downloadTask) {
        for (PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO : this.U) {
            if (homeBeanDTO.getG_info() != null && (TextUtils.equals(homeBeanDTO.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(homeBeanDTO.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                homeBeanDTO.setDownloadTask(null);
            }
        }
        s1();
        e2(downloadTask);
    }

    public void C0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.broadcast.bespeak.sussess"})
    public void D1(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("gameid");
            if (com.join.mgps.Util.g2.i(stringExtra)) {
                d2(stringExtra);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void F0(String str) {
        String str2;
        if (com.join.android.app.common.utils.j.j(this.f36612u)) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f36612u).getAccountData();
            int uid = accountData != null ? accountData.getUid() : 0;
            try {
                PackageInfo packageInfo = this.f36612u.getPackageManager().getPackageInfo(this.f36612u.getPackageName(), 0);
                str2 = packageInfo.versionCode + "_" + packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
                str2 = "";
            }
            RequestdetialFolowAndBeSpeak requestdetialFolowAndBeSpeak = new RequestdetialFolowAndBeSpeak();
            requestdetialFolowAndBeSpeak.setApp_ver(str2);
            requestdetialFolowAndBeSpeak.setGame_id(str);
            requestdetialFolowAndBeSpeak.setUid(uid);
            requestdetialFolowAndBeSpeak.setMobile(accountData.z());
            ResultMainBean d02 = this.f36596g.d0(RequestBeanUtil.getInstance(this.f36612u).getDetialFollowAnd(requestdetialFolowAndBeSpeak));
            if (d02 == null || d02.getFlag() != 1) {
                return;
            }
            d2(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void F1(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        homeBeanDTO.setRequesting(false);
        this.C.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G1() {
        int measuredHeight;
        FrameLayout frameLayout = this.f36605p;
        if (frameLayout != null && (measuredHeight = frameLayout.getMeasuredHeight()) > 0) {
            double d5 = measuredHeight;
            Double.isNaN(d5);
            double dimension = measuredHeight + this.f36612u.getResources().getDimension(R.dimen.wdp300);
            Double.isNaN(dimension);
            String Q1 = UtilsMy.Q1(this.T);
            this.T = Q1;
            this.Y = UtilsMy.Z(Q1, "#F7F8F9", (d5 * 1.0d) / dimension);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable.setColors(new int[]{Color.parseColor(this.T), Color.parseColor(this.Y)});
            gradientDrawable.setGradientType(0);
            this.f36605p.setBackground(gradientDrawable);
        }
    }

    void H0() {
        T1();
        this.X1 = 0;
        this.f36614v1 = 0;
        this.E1 = true;
        int i4 = 0;
        for (MgpapaMainItemBean mgpapaMainItemBean : this.D) {
            if (mgpapaMainItemBean.getPage() == 1) {
                i4++;
                if (mgpapaMainItemBean.getShowtype() == 39) {
                    this.X1++;
                } else if (mgpapaMainItemBean.getShowtype() == 34 && mgpapaMainItemBean.getShowtype() == 35 && mgpapaMainItemBean.getShowtype() == 36) {
                    this.f36614v1++;
                }
            }
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f36593d.getLayoutManager();
        if (linearLayoutManager != null) {
            a aVar = new a(this.f36612u);
            aVar.setTargetPosition(i4);
            linearLayoutManager.startSmoothScroll(aVar);
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) this.f36610s.getLayoutParams()).getBehavior();
        if (behavior instanceof AppBarLayout.Behavior) {
            AppBarLayout.Behavior behavior2 = (AppBarLayout.Behavior) behavior;
            if (behavior2.getTopAndBottomOffset() != 0) {
                behavior2.setTopAndBottomOffset(0);
            }
        }
        if (this.V == null) {
            this.V = new Handler();
        }
        this.B1 = true;
        this.V.postDelayed(new Runnable() { // from class: com.join.mgps.activity.o2
            @Override // java.lang.Runnable
            public final void run() {
                PapaMainV3Fragment.this.h1();
            }
        }, Math.max(1000, this.f36593d.getLastVisiblePosition() * 10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void H1(PAPAHomeBeanV7 pAPAHomeBeanV7) {
        this.f36618z.homeAllDataV3().g(JsonMapper.toJsonString(pAPAHomeBeanV7));
        com.join.mgps.Util.v0.c("保存数据完成   " + System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void I0() {
        PapaHomeCheckNewDataBean data;
        try {
            this.C1 = System.currentTimeMillis();
            RequestModel requestModel = new RequestModel();
            requestModel.setDefault(this.f36612u);
            requestModel.setArgs(new RequestOnlineCouponArgs());
            ResponseModel<PapaHomeCheckNewDataBean> body = com.join.mgps.rpc.impl.i.D0().B0().m1(requestModel.makeSign()).execute().body();
            if (body == null || body.getCode() != 200 || (data = body.getData()) == null || data.getState() != 1) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("homeHasNewData", true);
            this.I.callHomePageNewData(bundle);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void I1() {
        IntentUtil.getInstance().goSearchHintActivity(this.f36612u, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void J0(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        DownloadTask downloadTask = homeBeanDTO.getDownloadTask();
        CollectionBeanSub gameBean = homeBeanDTO.getGameBean();
        String plugin_num = gameBean.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(4);
            intentDateBean.setLink_type_val(gameBean.getDown_url_remote());
            if (downloadTask == null) {
                downloadTask = gameBean.getDownloadtaskDown();
            }
            UtilsMy.T2(downloadTask, this.f36612u);
            IntentUtil.getInstance().intentActivity(this.f36612u, intentDateBean);
        } else if (downloadTask == null) {
            if (UtilsMy.o0(gameBean.getTag_info())) {
                if (gameBean.getMod_info() == null) {
                    if (com.join.android.app.common.utils.e.l0(this.f36612u).d(this.f36612u, gameBean.getPackageName())) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f36612u).l(this.f36612u, gameBean.getPackageName());
                        if (!com.join.mgps.Util.g2.i(gameBean.getVer()) || l4.d() >= Integer.parseInt(gameBean.getVer())) {
                            com.join.android.app.common.utils.e.l0(this.f36612u);
                            APKUtils.a0(this.f36612u, gameBean.getPackageName());
                            return;
                        }
                    }
                } else {
                    boolean d5 = com.join.android.app.common.utils.e.l0(this.f36612u).d(this.f36612u, gameBean.getPackageName());
                    boolean F = com.join.mgps.va.overmind.d.o().F(gameBean.getPackageName());
                    if (d5 || F) {
                        com.join.android.app.common.utils.e.l0(this.f36612u);
                        APKUtils.V(this.f36612u, gameBean.getMod_info());
                        return;
                    }
                }
            }
            if (UtilsMy.y0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id()) > 0) {
                UtilsMy.d4(this.f36612u, gameBean.getCrc_sign_id());
            } else {
                UtilsMy.Y0(this.f36612u, gameBean);
            }
            P1(Event.check, homeBeanDTO);
        } else {
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            downloadTask.set_from(homeBeanDTO.get_from());
            downloadTask.set_from_type(homeBeanDTO.get_from_type());
            if (UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status != 13) {
                    if (status != 2) {
                        if (status != 3) {
                            if (status == 5) {
                                UtilsMy.T3(this.f36612u, downloadTask);
                                return;
                            } else if (status != 6) {
                                if (status != 7) {
                                    if (status == 42) {
                                        UtilsMy.r4(this.f36612u, downloadTask);
                                        return;
                                    } else if (status != 43) {
                                        switch (status) {
                                            case 9:
                                                if (!com.join.android.app.common.utils.j.j(this.f36612u)) {
                                                    com.join.mgps.Util.l2.a(this.f36612u).b("无网络连接");
                                                    return;
                                                } else {
                                                    UtilsMy.I2(this.f36612u, downloadTask);
                                                    return;
                                                }
                                            case 10:
                                                break;
                                            case 11:
                                                UtilsMy.a4(downloadTask, this.f36612u);
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                        }
                        com.php25.PDownload.d.c(downloadTask, this.f36612u);
                        return;
                    }
                    com.php25.PDownload.d.i(downloadTask);
                    return;
                }
                com.php25.PDownload.d.l(this.f36612u, downloadTask);
                return;
            }
            if (UtilsMy.y0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id()) > 0) {
                UtilsMy.d4(this.f36612u, gameBean.getCrc_sign_id());
                return;
            }
            UtilsMy.y1(downloadTask, gameBean);
            if (UtilsMy.o1(this.f36612u, downloadTask)) {
                return;
            }
            if (gameBean.getDown_status() == 5) {
                UtilsMy.l1(this.f36612u, downloadTask);
            } else {
                UtilsMy.R0(this.f36612u, downloadTask, gameBean.getTp_down_url(), gameBean.getOther_down_switch(), gameBean.getCdn_down_switch());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void M0() {
        ArrayList<SScrollingTxtBeanV2> arrayList = this.Z;
        if (arrayList != null && arrayList.size() > 0) {
            ViewFlipper viewFlipper = this.f36608q;
            if (viewFlipper != null && viewFlipper.getCurrentView() != null && !TextUtils.isEmpty(((TextView) this.f36608q.getCurrentView()).getText())) {
                String charSequence = ((TextView) this.f36608q.getCurrentView()).getText().toString();
                int i4 = 0;
                while (true) {
                    if (i4 >= this.Z.size()) {
                        i4 = 0;
                        break;
                    } else if (TextUtils.equals(charSequence, this.Z.get(i4).getWord())) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 >= 0) {
                    ArrayList<SScrollingTxtBeanV2> arrayList2 = this.Z;
                    List<SScrollingTxtBeanV2> subList = arrayList2.subList(i4, arrayList2.size());
                    List<SScrollingTxtBeanV2> subList2 = this.Z.subList(0, i4);
                    ArrayList<SScrollingTxtBeanV2> arrayList3 = new ArrayList<>();
                    arrayList3.addAll(subList);
                    arrayList3.addAll(subList2);
                    this.Z = arrayList3;
                }
            }
            IntentUtil.getInstance().goSearchHintActivity(this.f36612u, this.Z, this.f36606p0);
        } else {
            IntentUtil.getInstance().goSearchHintActivity(this.f36612u);
        }
        this.Z1 = null;
    }

    void N0(String str) {
        F0(str);
    }

    void O0(String str) {
        N0(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void P0(String str, PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        CollectionBeanSub data;
        if (homeBeanDTO.getGameBean() != null) {
            J0(homeBeanDTO);
            return;
        }
        if (com.join.android.app.common.utils.j.j(this.f36612u)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f36612u).getAccountData();
                if (accountData == null) {
                    accountData = com.wufan.user.service.protobuf.n0.b5();
                }
                RequestModel requestModel = new RequestModel();
                requestModel.setDefault(this.f36612u);
                requestModel.setArgs(new RequestGameIdArgs(str, 1, accountData.getUid()));
                ResponseModel<CollectionBeanSub> body = com.join.mgps.rpc.impl.i.D0().B0().v1(requestModel.makeSign()).execute().body();
                if (body != null && body.getCode() == 200 && (data = body.getData()) != null) {
                    data.set_from(homeBeanDTO.get_from());
                    data.set_from_type(homeBeanDTO.get_from_type());
                    data.setPosition_path(homeBeanDTO.getG_info() == null ? null : homeBeanDTO.getG_info().getPosition_path());
                    data.setRecPosition(homeBeanDTO.getPosition());
                    homeBeanDTO.setGameBean(data);
                    J0(homeBeanDTO);
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                showMessage("获取下载信息失败");
            }
        } else {
            showMessage("当前网络不可用");
        }
        F1(homeBeanDTO);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Q0() {
        if (com.join.android.app.common.utils.j.j(this.f36612u)) {
            try {
                HomeFloatData data = this.f36596g.K0(U0()).getMessages().getData();
                if (data != null) {
                    Y1(data);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Q1() {
        com.join.android.app.common.manager.a.h().j(this.f36612u, this.f36595f, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void R0() {
        List<RecomDatabean> data;
        try {
            ResultMainBean<List<RecomDatabean>> l12 = this.f36596g.l1(RequestBeanUtil.getInstance(this.f36612u).getRequestPnAndPc(1, 1));
            if (l12 == null || l12.getFlag() != 1 || (data = l12.getMessages().getData()) == null || data.size() <= 0) {
                return;
            }
            this.H1 = data.get(0).getSub().get(0).getLink_type_val();
        } catch (Exception unused) {
        }
    }

    public void S1(String str) {
        this.Z1 = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void T1() {
        try {
            RequestModel requestModel = new RequestModel();
            requestModel.setDefault(this.f36612u);
            requestModel.setArgs(new RequestOnlineCouponArgs());
            com.join.mgps.rpc.impl.i.D0().B0().R0(requestModel.makeSign()).execute().body();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public CommonRequestBean U0() {
        return RequestBeanUtil.getInstance(this.f36612u).getFloatadRequestBean();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void W0() {
        if (com.join.android.app.common.utils.j.j(this.f36612u)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f36612u).getAccountData();
                if (accountData == null) {
                    return;
                }
                ResultMainBean<List<VipPopData>> R0 = this.f36596g.R0(RequestBeanUtil.getInstance(this.f36612u).vipMessage(accountData.getUid()));
                if (R0 != null && R0.getFlag() == 1) {
                    List<VipPopData> data = R0.getMessages().getData();
                    if (data != null && data.size() > 0) {
                        a2(data);
                    } else {
                        m2();
                    }
                } else {
                    m2();
                }
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                m2();
                return;
            }
        }
        m2();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void W1() {
        com.join.mgps.Util.s.i(this.f36612u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.papa.maintab.clicked"})
    public void X0(Intent intent) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void X1() {
        if (getUserVisibleHint()) {
            com.join.mgps.Util.b0.f0(this.f36612u).O(this.f36612u, 1, new f()).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 2000)
    public void Y0() {
        TextView textView = this.f36597h;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Y1(HomeFloatData homeFloatData) {
        try {
            List<RecomDatabean> pendant = homeFloatData.getPendant();
            List<RecomDatabean> coin_entrance = homeFloatData.getCoin_entrance();
            if (this.f36602m != null) {
                if (pendant != null && pendant.size() > 0) {
                    RecomDatabean recomDatabean = pendant.get(0);
                    this.N1 = recomDatabean;
                    if (recomDatabean != null && recomDatabean.getMain().getAd_switch() == 1) {
                        this.f36602m.setVisibility(0);
                        if (com.join.mgps.Util.g2.i(this.N1.getMain().getPic_remote())) {
                            if (!this.P1.equals(this.N1.getMain().getPic_remote())) {
                                this.P1 = this.N1.getMain().getPic_remote();
                                MyImageLoader.d(this.f36602m, R.drawable.translate_drawable, this.N1.getMain().getPic_remote());
                            }
                        } else {
                            this.f36602m.setVisibility(8);
                        }
                    } else {
                        this.f36602m.setVisibility(8);
                    }
                } else {
                    this.f36602m.setVisibility(8);
                }
            }
            if (coin_entrance == null || coin_entrance.size() <= 0) {
                return;
            }
            this.O1 = coin_entrance.get(0);
            Intent intent = new Intent(o1.a.F);
            intent.putExtra("coinFloatData", this.O1);
            this.f36612u.sendBroadcast(intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.B})
    public void Z() {
        if (!this.H) {
            this.N = "m1";
            this.O = 1;
            this.W = true;
            this.f36593d.reset();
            l1(this.N, this.O);
            W0();
        }
        this.S.initStat(this.f36612u);
        if (isVisible()) {
            S0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Z0(int i4, String str) {
        try {
            this.f36596g.e0(RequestBeanUtil.getInstance(this.f36612u).getIgnoreMessageRequest(AccountUtil_.getInstance_(this.f36612u).getAccountData().getUid(), i4, str));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z1() {
        Q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void a2(List<VipPopData> list) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        com.join.mgps.Util.v0.c("MGPapaMainFragmentNew afterview   " + System.currentTimeMillis());
        this.f36596g = com.join.mgps.rpc.impl.d.P1();
        com.join.mgps.Util.d0.a().d(this);
        this.f36612u = getActivity();
        this.G = System.currentTimeMillis();
        this.Q = new com.join.android.app.component.video.g(this.f36593d, "PapaMainV3Fragment");
        this.R = (MGMainActivity) getActivity();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.K.getLayoutParams();
        if (Build.VERSION.SDK_INT >= 21) {
            layoutParams.topMargin = com.join.android.app.common.utils.n.v(this.f36612u);
        }
        this.K.setLayoutParams(layoutParams);
        a1();
        k1();
        W0();
        R0();
        Q0();
    }

    public void b2() {
        com.join.android.app.component.video.g gVar = this.Q;
        if (gVar != null) {
            gVar.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void c2() {
        IntentUtil.getInstance().goSearchHintActivity(this.f36612u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void d1() {
        if (this.V == null) {
            this.V = new Handler();
        }
        this.V.postDelayed(new Runnable() { // from class: com.join.mgps.activity.p2
            @Override // java.lang.Runnable
            public final void run() {
                PapaMainV3Fragment.this.j1();
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
        if (r1.getSub() == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008f, code lost:
        if (r1.getSub().get(0).getCrc_link_type_val().equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
        r1 = r1.getSub().get(0).getGame_info();
        r1.setIs_bespeak(1);
        r1.setBespeak_count((java.lang.Integer.parseInt(r1.getBespeak_count()) + 1) + "");
        r1();
        X1();
     */
    @org.androidannotations.annotations.UiThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d2(java.lang.String r8) {
        /*
            r7 = this;
            java.util.List<com.join.mgps.dto.MgpapaMainItemBean> r0 = r7.D
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc5
            java.lang.Object r1 = r0.next()
            com.join.mgps.dto.MgpapaMainItemBean r1 = (com.join.mgps.dto.MgpapaMainItemBean) r1
            int r2 = r1.getShowtype()
            r3 = 11
            if (r2 != r3) goto L6
            com.join.mgps.business.RecomDatabeanBusiness r2 = r1.getRecomDatabeanLeft()
            com.join.mgps.business.RecomDatabeanBusiness r1 = r1.getRecomDatabeanRight()
            java.lang.String r3 = ""
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L75
            java.util.List r6 = r2.getSub()
            if (r6 == 0) goto L75
            java.util.List r6 = r2.getSub()
            java.lang.Object r6 = r6.get(r5)
            com.join.mgps.dto.AppBeanMain r6 = (com.join.mgps.dto.AppBeanMain) r6
            java.lang.String r6 = r6.getCrc_link_type_val()
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L75
            java.util.List r1 = r2.getSub()
            java.lang.Object r1 = r1.get(r5)
            com.join.mgps.dto.AppBeanMain r1 = (com.join.mgps.dto.AppBeanMain) r1
            com.join.mgps.dto.AppBean r1 = r1.getGame_info()
            r1.setIs_bespeak(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = r1.getBespeak_count()
            int r5 = java.lang.Integer.parseInt(r5)
            int r5 = r5 + r4
            r2.append(r5)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setBespeak_count(r2)
            r7.r1()
            r7.X1()
            goto L6
        L75:
            if (r1 == 0) goto L6
            java.util.List r2 = r1.getSub()
            if (r2 == 0) goto L6
            java.util.List r2 = r1.getSub()
            java.lang.Object r2 = r2.get(r5)
            com.join.mgps.dto.AppBeanMain r2 = (com.join.mgps.dto.AppBeanMain) r2
            java.lang.String r2 = r2.getCrc_link_type_val()
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L6
            java.util.List r1 = r1.getSub()
            java.lang.Object r1 = r1.get(r5)
            com.join.mgps.dto.AppBeanMain r1 = (com.join.mgps.dto.AppBeanMain) r1
            com.join.mgps.dto.AppBean r1 = r1.getGame_info()
            r1.setIs_bespeak(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = r1.getBespeak_count()
            int r5 = java.lang.Integer.parseInt(r5)
            int r5 = r5 + r4
            r2.append(r5)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setBespeak_count(r2)
            r7.r1()
            r7.X1()
            goto L6
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.PapaMainV3Fragment.d2(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e1() {
        SimpleDraweeView simpleDraweeView = this.f36602m;
        if (simpleDraweeView == null || this.f36591a2 || this.f36592b2 || simpleDraweeView.getVisibility() != 0) {
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f36602m, "translationX", 0.0f, this.f36612u.getResources().getDimension(R.dimen.wdp113)).setDuration(250L);
        duration.addListener(new d());
        duration.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void f1() {
        try {
            if (com.join.mgps.Util.g2.i(this.N1.getMain().getPic_remote())) {
                IntentUtil.getInstance().intentActivity(this.f36612u, this.N1.getSub().get(0).getIntentDataBean());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f2(PAPAHomeBeanV7 pAPAHomeBeanV7, String str, int i4, boolean z4) {
        try {
            MGMainActivity mGMainActivity = (MGMainActivity) getActivity();
            if (mGMainActivity != null) {
                mGMainActivity.setHomeTabImage(true);
            }
            b1(pAPAHomeBeanV7.getS_scrolling_txt_v2());
            if (this.B1) {
                Iterator<MgpapaMainItemBean> it2 = this.D.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getPage() != 1) {
                        it2.remove();
                    }
                }
                this.B1 = false;
            }
            new MgpapaMainItemBean();
            int i5 = 31;
            if (i4 == 1) {
                this.f36607p1 = z4;
                this.X1 = 0;
                this.f36614v1 = 0;
                this.S.getLists().clear();
                this.D.clear();
                MgpapaMainItemBean mgpapaMainItemBean = new MgpapaMainItemBean();
                mgpapaMainItemBean.setShowtype(33);
                mgpapaMainItemBean.setObject(Float.valueOf(1.0f));
                mgpapaMainItemBean.setPage(i4);
                mgpapaMainItemBean.setMoreType2(this.Y);
                this.D.add(mgpapaMainItemBean);
                MgpapaMainItemBean mgpapaMainItemBean2 = new MgpapaMainItemBean();
                mgpapaMainItemBean2.setShowtype(26);
                if (pAPAHomeBeanV7.getTop_channel() != null) {
                    if (this.Y != null) {
                        pAPAHomeBeanV7.getTop_channel().setBg_color(this.Y);
                    }
                    mgpapaMainItemBean2.setObject(pAPAHomeBeanV7.getTop_channel());
                }
                mgpapaMainItemBean2.setPage(i4);
                this.D.add(mgpapaMainItemBean2);
                if (pAPAHomeBeanV7.getFast_entry() != null && pAPAHomeBeanV7.getFast_entry().size() > 0) {
                    MgpapaMainItemBean mgpapaMainItemBean3 = new MgpapaMainItemBean();
                    mgpapaMainItemBean3.setShowtype(27);
                    mgpapaMainItemBean3.setObject(pAPAHomeBeanV7.getFast_entry());
                    mgpapaMainItemBean3.setPage(i4);
                    this.D.add(mgpapaMainItemBean3);
                }
                MgpapaMainItemBean mgpapaMainItemBean4 = new MgpapaMainItemBean();
                mgpapaMainItemBean4.setShowtype(33);
                mgpapaMainItemBean4.setObject(Float.valueOf(this.f36612u.getResources().getDimension(R.dimen.wdp8)));
                mgpapaMainItemBean4.setPage(i4);
                this.D.add(mgpapaMainItemBean4);
                List<PAPAHomeBeanV7.HomeBeanDTO> eo_playing = pAPAHomeBeanV7.getEo_playing();
                if (eo_playing != null && eo_playing.size() > 0) {
                    List<PAPAHomeBeanV7.HomeBeanDTO> p22 = p2(eo_playing, "22-4-");
                    MgpapaMainItemBean mgpapaMainItemBean5 = new MgpapaMainItemBean();
                    mgpapaMainItemBean5.setPage(i4);
                    mgpapaMainItemBean5.setShowtype(31);
                    mgpapaMainItemBean5.setObject(new PAPAItemTitle2("大家都在玩"));
                    this.D.add(mgpapaMainItemBean5);
                    MgpapaMainItemBean mgpapaMainItemBean6 = new MgpapaMainItemBean();
                    mgpapaMainItemBean6.setShowtype(33);
                    mgpapaMainItemBean6.setObject(Float.valueOf(this.f36612u.getResources().getDimension(R.dimen.wdp12)));
                    mgpapaMainItemBean6.setPage(i4);
                    this.D.add(mgpapaMainItemBean6);
                    for (int i6 = 0; i6 < p22.size(); i6++) {
                        PAPAHomeBeanV7.HomeBeanDTO n22 = n2(p22.get(i6), 201, 201);
                        MgpapaMainItemBean mgpapaMainItemBean7 = new MgpapaMainItemBean();
                        mgpapaMainItemBean7.setShowtype(37);
                        mgpapaMainItemBean7.setObject(n22);
                        mgpapaMainItemBean7.setPage(i4);
                        mgpapaMainItemBean7.setMoreType2(String.valueOf(i6 % 2));
                        this.D.add(mgpapaMainItemBean7);
                        this.U.add(n22);
                    }
                    MgpapaMainItemBean mgpapaMainItemBean8 = new MgpapaMainItemBean();
                    mgpapaMainItemBean8.setShowtype(39);
                    mgpapaMainItemBean8.setPage(i4);
                    this.D.add(mgpapaMainItemBean8);
                    MgpapaMainItemBean mgpapaMainItemBean9 = new MgpapaMainItemBean();
                    mgpapaMainItemBean9.setShowtype(33);
                    mgpapaMainItemBean9.setObject(Float.valueOf(this.f36612u.getResources().getDimension(R.dimen.wdp26)));
                    mgpapaMainItemBean9.setPage(i4);
                    this.D.add(mgpapaMainItemBean9);
                }
                if (pAPAHomeBeanV7.getF_video_ad() != null) {
                    PAPAHomeBeanV7.HomeBeanDTO n23 = n2(pAPAHomeBeanV7.getF_video_ad(), IjkMediaPlayer.FFP_PROP_INT64_ASYNC_STATISTIC_BUF_BACKWARDS, IjkMediaPlayer.FFP_PROP_INT64_ASYNC_STATISTIC_BUF_BACKWARDS);
                    n23.setPosition("22-11-1");
                    MgpapaMainItemBean mgpapaMainItemBean10 = new MgpapaMainItemBean();
                    mgpapaMainItemBean10.setShowtype(c1(n23) ? 40 : 29);
                    mgpapaMainItemBean10.setObject(n23);
                    mgpapaMainItemBean10.setPage(i4);
                    this.D.add(mgpapaMainItemBean10);
                    this.U.add(n23);
                    MgpapaMainItemBean mgpapaMainItemBean11 = new MgpapaMainItemBean();
                    mgpapaMainItemBean11.setShowtype(39);
                    mgpapaMainItemBean11.setPage(i4);
                    this.D.add(mgpapaMainItemBean11);
                    MgpapaMainItemBean mgpapaMainItemBean12 = new MgpapaMainItemBean();
                    mgpapaMainItemBean12.setShowtype(33);
                    mgpapaMainItemBean12.setObject(Float.valueOf(this.f36612u.getResources().getDimension(R.dimen.wdp42)));
                    mgpapaMainItemBean12.setPage(i4);
                    this.D.add(mgpapaMainItemBean12);
                }
                List<PAPAHomeBeanV7.HomeBeanDTO> jys_like = pAPAHomeBeanV7.getJys_like();
                if (jys_like != null && jys_like.size() > 0) {
                    List<PAPAHomeBeanV7.HomeBeanDTO> p23 = p2(jys_like, "22-13-");
                    MgpapaMainItemBean mgpapaMainItemBean13 = new MgpapaMainItemBean();
                    mgpapaMainItemBean13.setShowtype(31);
                    mgpapaMainItemBean13.setObject(new PAPAItemTitle2("像你一样的玩家都喜欢"));
                    mgpapaMainItemBean13.setPage(i4);
                    this.D.add(mgpapaMainItemBean13);
                    MgpapaMainItemBean mgpapaMainItemBean14 = new MgpapaMainItemBean();
                    mgpapaMainItemBean14.setShowtype(33);
                    mgpapaMainItemBean14.setPage(i4);
                    mgpapaMainItemBean14.setObject(Float.valueOf(this.f36612u.getResources().getDimension(R.dimen.wdp12)));
                    this.D.add(mgpapaMainItemBean14);
                    for (int i7 = 0; i7 < p23.size(); i7++) {
                        PAPAHomeBeanV7.HomeBeanDTO n24 = n2(p23.get(i7), 203, 203);
                        MgpapaMainItemBean mgpapaMainItemBean15 = new MgpapaMainItemBean();
                        mgpapaMainItemBean15.setShowtype(38);
                        mgpapaMainItemBean15.setObject(n24);
                        mgpapaMainItemBean15.setPage(i4);
                        mgpapaMainItemBean15.setMoreType2(String.valueOf(i7 % 2));
                        this.D.add(mgpapaMainItemBean15);
                        this.U.add(n24);
                    }
                    MgpapaMainItemBean mgpapaMainItemBean16 = new MgpapaMainItemBean();
                    mgpapaMainItemBean16.setShowtype(39);
                    mgpapaMainItemBean16.setPage(i4);
                    this.D.add(mgpapaMainItemBean16);
                    MgpapaMainItemBean mgpapaMainItemBean17 = new MgpapaMainItemBean();
                    mgpapaMainItemBean17.setShowtype(33);
                    mgpapaMainItemBean17.setPage(i4);
                    mgpapaMainItemBean17.setObject(Float.valueOf(this.f36612u.getResources().getDimension(R.dimen.wdp26)));
                    this.D.add(mgpapaMainItemBean17);
                }
                List<PAPAHomeBeanV7.NgSelectionDTO> r22 = r2(pAPAHomeBeanV7.getNg_selection(), 204);
                if (r22 != null && r22.size() > 0) {
                    MgpapaMainItemBean mgpapaMainItemBean18 = new MgpapaMainItemBean();
                    mgpapaMainItemBean18.setShowtype(31);
                    mgpapaMainItemBean18.setObject(new PAPAItemTitle2("新游精选"));
                    mgpapaMainItemBean18.setPage(i4);
                    this.D.add(mgpapaMainItemBean18);
                    MgpapaMainItemBean mgpapaMainItemBean19 = new MgpapaMainItemBean();
                    mgpapaMainItemBean19.setShowtype(33);
                    mgpapaMainItemBean19.setPage(i4);
                    mgpapaMainItemBean19.setObject(Float.valueOf(this.f36612u.getResources().getDimension(R.dimen.wdp24)));
                    this.D.add(mgpapaMainItemBean19);
                    MgpapaMainItemBean mgpapaMainItemBean20 = new MgpapaMainItemBean();
                    mgpapaMainItemBean20.setShowtype(30);
                    mgpapaMainItemBean20.setPage(i4);
                    mgpapaMainItemBean20.setObject(r22);
                    this.D.add(mgpapaMainItemBean20);
                    MgpapaMainItemBean mgpapaMainItemBean21 = new MgpapaMainItemBean();
                    mgpapaMainItemBean21.setShowtype(39);
                    mgpapaMainItemBean21.setPage(i4);
                    this.D.add(mgpapaMainItemBean21);
                    MgpapaMainItemBean mgpapaMainItemBean22 = new MgpapaMainItemBean();
                    mgpapaMainItemBean22.setShowtype(33);
                    mgpapaMainItemBean22.setPage(i4);
                    mgpapaMainItemBean22.setObject(Float.valueOf(this.f36612u.getResources().getDimension(R.dimen.wdp42)));
                    this.D.add(mgpapaMainItemBean22);
                }
                if (pAPAHomeBeanV7.getS_video_ad() != null) {
                    PAPAHomeBeanV7.HomeBeanDTO n25 = n2(pAPAHomeBeanV7.getS_video_ad(), IjkMediaPlayer.FFP_PROP_INT64_ASYNC_STATISTIC_BUF_FORWARDS, IjkMediaPlayer.FFP_PROP_INT64_ASYNC_STATISTIC_BUF_FORWARDS);
                    n25.setPosition("22-12-1");
                    MgpapaMainItemBean mgpapaMainItemBean23 = new MgpapaMainItemBean();
                    mgpapaMainItemBean23.setShowtype(c1(n25) ? 40 : 29);
                    mgpapaMainItemBean23.setObject(n25);
                    mgpapaMainItemBean23.setPage(i4);
                    this.D.add(mgpapaMainItemBean23);
                    this.U.add(n25);
                    MgpapaMainItemBean mgpapaMainItemBean24 = new MgpapaMainItemBean();
                    mgpapaMainItemBean24.setShowtype(39);
                    mgpapaMainItemBean24.setPage(i4);
                    this.D.add(mgpapaMainItemBean24);
                    MgpapaMainItemBean mgpapaMainItemBean25 = new MgpapaMainItemBean();
                    mgpapaMainItemBean25.setShowtype(33);
                    mgpapaMainItemBean25.setPage(i4);
                    mgpapaMainItemBean25.setObject(Float.valueOf(this.f36612u.getResources().getDimension(R.dimen.wdp42)));
                    this.D.add(mgpapaMainItemBean25);
                }
                if (pAPAHomeBeanV7.getRanking_list() != null && !TextUtils.isEmpty(pAPAHomeBeanV7.getRanking_list().getTxt()) && pAPAHomeBeanV7.getRanking_list().getList() != null) {
                    List<List<PAPAHomeBeanV7.HomeBeanDTO>> list = pAPAHomeBeanV7.getRanking_list().getList();
                    for (int i8 = 0; i8 < list.size(); i8++) {
                        List<PAPAHomeBeanV7.HomeBeanDTO> list2 = list.get(i8);
                        if (i8 == 0) {
                            list.set(0, o2(p2(list2, "22-15-"), 20501, 20501));
                        } else if (i8 == 1) {
                            list.set(1, o2(p2(list2, "22-16-"), 20502, 20502));
                        } else if (i8 == 2) {
                            list.set(2, o2(p2(list2, "22-17-"), 20503, 20503));
                        }
                    }
                    pAPAHomeBeanV7.getRanking_list().setList(list);
                    MgpapaMainItemBean mgpapaMainItemBean26 = new MgpapaMainItemBean();
                    mgpapaMainItemBean26.setShowtype(32);
                    mgpapaMainItemBean26.setObject(pAPAHomeBeanV7.getRanking_list());
                    mgpapaMainItemBean26.setPage(i4);
                    this.D.add(mgpapaMainItemBean26);
                    MgpapaMainItemBean mgpapaMainItemBean27 = new MgpapaMainItemBean();
                    mgpapaMainItemBean27.setShowtype(39);
                    mgpapaMainItemBean27.setPage(i4);
                    this.D.add(mgpapaMainItemBean27);
                    MgpapaMainItemBean mgpapaMainItemBean28 = new MgpapaMainItemBean();
                    mgpapaMainItemBean28.setShowtype(33);
                    mgpapaMainItemBean28.setPage(i4);
                    mgpapaMainItemBean28.setObject(Float.valueOf(this.f36612u.getResources().getDimension(R.dimen.wdp32)));
                    this.D.add(mgpapaMainItemBean28);
                }
            }
            List<PAPAHomeBeanV7.RecommendListDTO> recommend_list = pAPAHomeBeanV7.getRecommend_list();
            if (recommend_list != null && recommend_list.size() > 0) {
                for (PAPAHomeBeanV7.RecommendListDTO recommendListDTO : recommend_list) {
                    if (recommendListDTO.getList() != null && recommendListDTO.getList().size() > 0) {
                        MgpapaMainItemBean mgpapaMainItemBean29 = new MgpapaMainItemBean();
                        mgpapaMainItemBean29.setShowtype(i5);
                        mgpapaMainItemBean29.setObject(new PAPAItemTitle2(recommendListDTO.getTitle(), recommendListDTO.getSub_title()));
                        mgpapaMainItemBean29.setPage(i4);
                        this.D.add(mgpapaMainItemBean29);
                        List<PAPAHomeBeanV7.HomeBeanDTO> o22 = o2(recommendListDTO.getList(), 206, 206);
                        if (recommendListDTO.getTpl_type().intValue() == 0) {
                            MgpapaMainItemBean mgpapaMainItemBean30 = new MgpapaMainItemBean();
                            mgpapaMainItemBean30.setShowtype(33);
                            mgpapaMainItemBean30.setPage(i4);
                            mgpapaMainItemBean30.setObject(Float.valueOf(this.f36612u.getResources().getDimension(R.dimen.wdp12)));
                            this.D.add(mgpapaMainItemBean30);
                            List<PAPAHomeBeanV7.HomeBeanDTO> q22 = q2(o22);
                            for (int i9 = 0; i9 < q22.size(); i9++) {
                                PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO = q22.get(i9);
                                MgpapaMainItemBean mgpapaMainItemBean31 = new MgpapaMainItemBean();
                                mgpapaMainItemBean31.setShowtype(34);
                                mgpapaMainItemBean31.setObject(homeBeanDTO);
                                mgpapaMainItemBean31.setPage(i4);
                                mgpapaMainItemBean31.setMoreType2(String.valueOf(i9 % 2));
                                this.D.add(mgpapaMainItemBean31);
                                this.U.add(homeBeanDTO);
                            }
                            MgpapaMainItemBean mgpapaMainItemBean32 = new MgpapaMainItemBean();
                            mgpapaMainItemBean32.setShowtype(39);
                            mgpapaMainItemBean32.setPage(i4);
                            this.D.add(mgpapaMainItemBean32);
                            MgpapaMainItemBean mgpapaMainItemBean33 = new MgpapaMainItemBean();
                            mgpapaMainItemBean33.setShowtype(33);
                            mgpapaMainItemBean33.setObject(Float.valueOf(this.f36612u.getResources().getDimension(R.dimen.wdp26)));
                            mgpapaMainItemBean33.setPage(i4);
                            this.D.add(mgpapaMainItemBean33);
                        } else if (recommendListDTO.getTpl_type().intValue() == 1) {
                            MgpapaMainItemBean mgpapaMainItemBean34 = new MgpapaMainItemBean();
                            mgpapaMainItemBean34.setShowtype(33);
                            mgpapaMainItemBean34.setObject(Float.valueOf(this.f36612u.getResources().getDimension(R.dimen.wdp24)));
                            mgpapaMainItemBean34.setPage(i4);
                            this.D.add(mgpapaMainItemBean34);
                            List<PAPAHomeBeanV7.HomeBeanDTO> q23 = q2(o22);
                            MgpapaMainItemBean mgpapaMainItemBean35 = new MgpapaMainItemBean();
                            mgpapaMainItemBean35.setShowtype(35);
                            mgpapaMainItemBean35.setObject(q23);
                            mgpapaMainItemBean35.setPage(i4);
                            this.D.add(mgpapaMainItemBean35);
                            this.U.addAll(q23);
                            MgpapaMainItemBean mgpapaMainItemBean36 = new MgpapaMainItemBean();
                            mgpapaMainItemBean36.setShowtype(39);
                            mgpapaMainItemBean36.setPage(i4);
                            this.D.add(mgpapaMainItemBean36);
                            MgpapaMainItemBean mgpapaMainItemBean37 = new MgpapaMainItemBean();
                            mgpapaMainItemBean37.setShowtype(33);
                            mgpapaMainItemBean37.setPage(i4);
                            mgpapaMainItemBean37.setObject(Float.valueOf(this.f36612u.getResources().getDimension(R.dimen.wdp42)));
                            this.D.add(mgpapaMainItemBean37);
                        } else {
                            if (recommendListDTO.getTpl_type().intValue() == 2) {
                                MgpapaMainItemBean mgpapaMainItemBean38 = new MgpapaMainItemBean();
                                mgpapaMainItemBean38.setShowtype(33);
                                mgpapaMainItemBean38.setPage(i4);
                                mgpapaMainItemBean38.setObject(Float.valueOf(this.f36612u.getResources().getDimension(R.dimen.wdp24)));
                                this.D.add(mgpapaMainItemBean38);
                                List<PAPAHomeBeanV7.HomeBeanDTO> q24 = q2(o22);
                                MgpapaMainItemBean mgpapaMainItemBean39 = new MgpapaMainItemBean();
                                mgpapaMainItemBean39.setShowtype(36);
                                mgpapaMainItemBean39.setPage(i4);
                                mgpapaMainItemBean39.setObject(q24.get(0));
                                this.D.add(mgpapaMainItemBean39);
                                this.U.add(q24.get(0));
                                MgpapaMainItemBean mgpapaMainItemBean40 = new MgpapaMainItemBean();
                                mgpapaMainItemBean40.setShowtype(39);
                                mgpapaMainItemBean40.setPage(i4);
                                this.D.add(mgpapaMainItemBean40);
                                MgpapaMainItemBean mgpapaMainItemBean41 = new MgpapaMainItemBean();
                                mgpapaMainItemBean41.setShowtype(33);
                                mgpapaMainItemBean41.setPage(i4);
                                mgpapaMainItemBean41.setObject(Float.valueOf(this.f36612u.getResources().getDimension(R.dimen.wdp42)));
                                this.D.add(mgpapaMainItemBean41);
                            }
                            i5 = 31;
                        }
                        i5 = 31;
                    }
                }
            }
            this.C.R(this.D);
            if (i4 == 1) {
                w1(null, 0);
                return;
            }
            ImageHandler imageHandler = this.f27419b;
            if (imageHandler != null) {
                imageHandler.postDelayed(new m(), 200L);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g1() {
        TextView textView = (TextView) this.f36608q.getCurrentView();
        if (textView != null && !TextUtils.isEmpty(textView.getText().toString())) {
            SearchListActivity1_.d1(this.f36612u).e(textView.getText().toString()).d(false).a(0).start();
            com.papa.sim.statistic.p.l(this.f36612u).l1(com.papa.sim.statistic.Event.clickSearchButton, textView.getText().toString(), ExtFrom.home.name());
        } else {
            IntentUtil.getInstance().goSearchHintActivity(this.f36612u);
        }
        this.Z1 = null;
    }

    void h2(List<RecomDatabeanBusiness> list) {
        try {
            if (this.f36617y == null || list == null || list.size() <= 0) {
                return;
            }
            for (RecomDatabeanBusiness recomDatabeanBusiness : list) {
                List<AppBeanMain> sub = recomDatabeanBusiness.getSub();
                if (sub != null && sub.size() != 0) {
                    boolean z4 = false;
                    AppBean game_info = sub.get(0).getGame_info();
                    if (game_info != null) {
                        if (game_info.getMod_info() != null) {
                            ModInfoBean mod_info = game_info.getMod_info();
                            DownloadTask downloadTask = this.f36617y.get(mod_info.getMain_game_id());
                            boolean z5 = downloadTask != null && downloadTask.getStatus() == 5;
                            DownloadTask downloadTask2 = this.f36617y.get(mod_info.getMod_game_id());
                            if (downloadTask2 != null && downloadTask2.getStatus() == 5) {
                                z4 = true;
                            }
                            if (z4 && z5) {
                                if (downloadTask.getCrc_link_type_val().equals(game_info.getCrc_sign_id())) {
                                    recomDatabeanBusiness.d(downloadTask);
                                }
                            } else if (z4) {
                                if (game_info.getMod_info() != null && downloadTask2.getRef_crc_sign_id().equals(game_info.getCrc_sign_id())) {
                                    recomDatabeanBusiness.d(downloadTask2);
                                }
                            } else if (z5) {
                                if (downloadTask.getCrc_link_type_val().equals(game_info.getCrc_sign_id())) {
                                    recomDatabeanBusiness.d(downloadTask);
                                }
                            } else {
                                DownloadTask downloadTask3 = this.f36617y.get(mod_info.getMod_game_id());
                                if (downloadTask3 == null) {
                                    downloadTask3 = this.f36617y.get(game_info.getCrc_sign_id());
                                }
                                if (downloadTask3 != null && (downloadTask3.getCrc_link_type_val().equals(game_info.getCrc_sign_id()) || downloadTask3.getRef_crc_sign_id().equals(game_info.getCrc_sign_id()))) {
                                    recomDatabeanBusiness.d(downloadTask3);
                                }
                            }
                        } else {
                            DownloadTask downloadTask4 = this.f36617y.get(game_info.getCrc_sign_id());
                            if (downloadTask4 != null && downloadTask4.getCrc_link_type_val().equals(game_info.getCrc_sign_id())) {
                                recomDatabeanBusiness.d(downloadTask4);
                            }
                        }
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i2() {
        XRecyclerView2 xRecyclerView2 = this.f36593d;
        if (xRecyclerView2 != null) {
            xRecyclerView2.stopRefresh();
            this.f36593d.stopLoadMore();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k1() {
        String d5 = this.f36618z.homeAllDataV3().d();
        PAPAHomeBeanV7 pAPAHomeBeanV7 = com.join.mgps.Util.g2.i(d5) ? (PAPAHomeBeanV7) JsonMapper.getInstance().fromJson(d5, PAPAHomeBeanV7.class) : null;
        if (pAPAHomeBeanV7 != null) {
            f2(pAPAHomeBeanV7, "m1", 1, false);
            com.join.mgps.Util.v0.c("显示主界面   " + System.currentTimeMillis());
            showMain();
            this.f36615w = false;
            if (pAPAHomeBeanV7.getTop_channel() != null) {
                this.T = pAPAHomeBeanV7.getTop_channel().getBg_color();
            } else {
                this.T = "";
            }
            G1();
        } else {
            com.join.mgps.Util.v0.c("数据库没有数据不显示主界面   " + System.currentTimeMillis());
            this.f36615w = true;
        }
        m1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0157  */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l1(java.lang.String r9, int r10) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.PapaMainV3Fragment.l1(java.lang.String, int):void");
    }

    void l2(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    B1(downloadTask);
                    return;
                case 3:
                    z1(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    C1(downloadTask);
                    return;
                case 6:
                    A1(downloadTask);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m1() {
        l1("m1", 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m2() {
    }

    public void n1() {
        E1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o1() {
        this.f36593d.smoothScrollToPosition(0);
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) this.f36610s.getLayoutParams()).getBehavior();
        if (behavior instanceof AppBarLayout.Behavior) {
            AppBarLayout.Behavior behavior2 = (AppBarLayout.Behavior) behavior;
            if (behavior2.getTopAndBottomOffset() != 0) {
                behavior2.setTopAndBottomOffset(0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (getActivity() instanceof MGMainActivity) {
            this.I = (MGMainActivity) getActivity();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.join.android.app.component.video.g gVar;
        com.join.mgps.Util.d0.a().e(this);
        this.M = true;
        MGMainActivity mGMainActivity = this.R;
        if (mGMainActivity != null && mGMainActivity.getPositionNum() == 3 && (gVar = this.Q) != null) {
            gVar.t();
        }
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            l2(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    l2(a5, 6);
                } else if (c5 == 7) {
                    l2(a5, 3);
                } else if (c5 == 8) {
                    Map<String, DownloadTask> map = this.f36617y;
                    if (map != null && !map.isEmpty()) {
                        k2();
                    }
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            l2(a5, 7);
                            break;
                        case 12:
                            l2(a5, 8);
                            break;
                        case 13:
                            l2(a5, 9);
                            break;
                    }
                }
            }
            l2(a5, 5);
        } else {
            l2(a5, 2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("receiveStart: ");
        sb.append(nVar.c());
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (!z4) {
            long currentTimeMillis = System.currentTimeMillis();
            com.join.mgps.Util.v0.d("notify time", com.join.mgps.Util.y.x(currentTimeMillis));
            long j4 = this.G;
            if (currentTimeMillis - j4 > bi.f55326s && j4 != 0) {
                long currentTimeMillis2 = System.currentTimeMillis();
                this.G = currentTimeMillis2;
                com.join.mgps.Util.v0.d("notify time lastUpdateTime", com.join.mgps.Util.y.x(currentTimeMillis2));
                this.L = true;
                l1(this.N, this.O);
            } else if (j4 == 0) {
                this.G = System.currentTimeMillis();
                com.join.mgps.Util.v0.d("notify time lastUpdateTime2", com.join.mgps.Util.y.x(currentTimeMillis));
            }
            S0();
            M1(false);
            I0();
            com.join.android.app.component.video.g gVar = this.Q;
            if (gVar != null) {
                gVar.z();
                return;
            }
            return;
        }
        com.join.android.app.component.video.g gVar2 = this.Q;
        if (gVar2 != null) {
            gVar2.u();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        com.join.android.app.component.video.g gVar;
        super.onPause();
        this.G1 = false;
        MGMainActivity mGMainActivity = this.R;
        if (mGMainActivity == null || mGMainActivity.getPositionNum() != 3 || (gVar = this.Q) == null) {
            return;
        }
        gVar.u();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        List<MgpapaMainItemBean> list;
        com.join.android.app.component.video.g gVar;
        super.onResume();
        this.G1 = true;
        setUserVisibleHint(true);
        List<DownloadTask> d5 = p1.f.K().d();
        this.f36613v = d5;
        if (d5 != null && d5.size() > 0) {
            for (DownloadTask downloadTask : this.f36613v) {
                this.f36617y.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        } else {
            this.f36613v = new ArrayList();
        }
        h2(this.f36616x);
        MGMainActivity mGMainActivity = this.R;
        if (mGMainActivity != null && mGMainActivity.getPositionNum() == 3 && (gVar = this.Q) != null) {
            gVar.z();
        }
        if (this.S1 && (list = this.D) != null && list.size() > 0) {
            w1(null, 0);
        }
        M1(true);
        I0();
        w1(null, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.L1 = getResources().getDimensionPixelOffset(R.dimen.round_pointmagin_l_r_size);
        this.M1 = getResources().getDimensionPixelOffset(R.dimen.round_point_size);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        setUserVisibleHint(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p1() {
        com.join.android.app.common.manager.a.h().j(this.f36612u, this.f36594e, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q1() {
        XRecyclerView2 xRecyclerView2 = this.f36593d;
        if (xRecyclerView2 != null) {
            xRecyclerView2.setNoMore();
        }
        d1();
    }

    void r1() {
        PapaMainV2Adapter papaMainV2Adapter = this.C;
        if (papaMainV2Adapter != null) {
            papaMainV2Adapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        this.N = "m1";
        this.O = 1;
        this.W = true;
        l1("m1", 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        com.join.mgps.Util.v0.c("显示加载中");
        LinearLayout linearLayout = this.f36598i;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f36599j;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XRecyclerView2 xRecyclerView2 = this.f36593d;
        if (xRecyclerView2 != null) {
            xRecyclerView2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        com.join.mgps.Util.v0.c("显示加载失败");
        LinearLayout linearLayout = this.f36599j;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f36598i;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XRecyclerView2 xRecyclerView2 = this.f36593d;
        if (xRecyclerView2 != null) {
            xRecyclerView2.setVisibility(8);
        }
        FrameLayout frameLayout = this.f36605p;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain() {
        com.join.mgps.Util.v0.c("显示主界面main");
        LinearLayout linearLayout = this.f36599j;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f36598i;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XRecyclerView2 xRecyclerView2 = this.f36593d;
        if (xRecyclerView2 != null) {
            xRecyclerView2.setVisibility(0);
        }
        FrameLayout frameLayout = this.f36605p;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        if (this.L) {
            this.L = false;
            TextView textView = this.f36597h;
            if (textView != null) {
                textView.setVisibility(0);
            }
            Y0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this.f36612u).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    @Receiver(actions = {"android.net.wifi.WIFI_STATE_CHANGED", "android.net.wifi.STATE_CHANGE", "android.net.conn.CONNECTIVITY_CHANGE", "android.net.wifi.SCAN_RESULTS"})
    public void t1(Intent intent) {
        if (this.f36593d != null && !this.A1 && com.join.android.app.common.utils.j.j(this.f36612u)) {
            this.W = true;
            this.f36593d.setNoMoreView(false);
        }
        this.A1 = com.join.android.app.common.utils.j.j(this.f36612u);
    }

    public void u1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void v1(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        if (this.C == null || this.f36593d.isComputingLayout()) {
            return;
        }
        this.C.notifyDataSetChanged();
    }
}
