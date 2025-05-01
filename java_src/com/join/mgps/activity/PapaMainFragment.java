package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Html;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.MApplication;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.j256.ormlite.dao.CloseableWrappedIterable;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.PapamainFastitemLayoutBinding;
import com.join.kotlin.presenter.HomeViewModle;
import com.join.kotlin.ui.findgame.data.IntentClassfyEvent;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.ImageHandler;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.BannerImageAdapter2;
import com.join.mgps.adapter.o3;
import com.join.mgps.business.RecomDatabeanBusiness;
import com.join.mgps.customview.LoopViewPager;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.AppBeanMainTable;
import com.join.mgps.db.tables.AppBeanTable;
import com.join.mgps.db.tables.AppMoreBeanTable;
import com.join.mgps.db.tables.BannerAndTablesTable;
import com.join.mgps.db.tables.DownloadUrlTable;
import com.join.mgps.db.tables.ModleBeanTable;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.db.tables.RecomDatabeanTable;
import com.join.mgps.db.tables.TipBeanTable;
import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.AppBeanMain;
import com.join.mgps.dto.AppMoreBean;
import com.join.mgps.dto.BannerBean;
import com.join.mgps.dto.BannerImage;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.DownloadUrlBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GameDiscoverChannelBean;
import com.join.mgps.dto.GameinterestingBean;
import com.join.mgps.dto.HomeFloatData;
import com.join.mgps.dto.MgpapaMainItemBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.ModleBean;
import com.join.mgps.dto.PAPAHomeBeanV6;
import com.join.mgps.dto.RecomDatabean;
import com.join.mgps.dto.RequestdetialFolowAndBeSpeak;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.TipBean;
import com.join.mgps.dto.VipPopData;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.kuaishou.weapon.p0.bi;
import com.papa.sim.statistic.ExtFrom;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.mgpapa_mainfragment_new_layout)
/* loaded from: classes.dex */
public class PapaMainFragment extends ImageHandler.AdFragment implements View.OnClickListener, AbsListView.OnScrollListener {
    private static final String Q1 = "MGPapaMainFragmentNew";
    private ViewGroup A;
    com.join.mgps.customview.o A1;
    private int D1;
    @Pref
    PrefDef_ E;
    private int E1;
    private LinearLayout F;
    private RecomDatabean F1;
    private LinearLayout G;
    private RecomDatabean G1;
    private o3 H;
    private List<MgpapaMainItemBean> I;
    private int J;
    private int K;
    private long L;
    private FrameLayout N;
    @ViewById
    PtrClassicFrameLayout P;
    @ViewById
    View Q;
    com.join.android.app.component.video.c W;
    MGMainActivity X;
    HomeViewModle Y;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    XListView2 f36480d;
    @StringRes(resName = "net_excption")

    /* renamed from: e  reason: collision with root package name */
    String f36481e;
    @StringRes(resName = "connect_server_excption")

    /* renamed from: f  reason: collision with root package name */
    String f36482f;

    /* renamed from: g  reason: collision with root package name */
    com.join.mgps.rpc.e f36483g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f36484h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f36485i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f36486j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ImageView f36487k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    View f36488l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    SimpleDraweeView f36489m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    ImageView f36490n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    View f36491o;

    /* renamed from: p  reason: collision with root package name */
    ViewFlipper f36492p;

    /* renamed from: q  reason: collision with root package name */
    private Context f36495q;

    /* renamed from: r  reason: collision with root package name */
    private BannerImageAdapter2 f36496r;

    /* renamed from: s  reason: collision with root package name */
    private List<BannerBean> f36497s;

    /* renamed from: t  reason: collision with root package name */
    private LinearLayout f36498t;

    /* renamed from: u  reason: collision with root package name */
    private LinearLayout f36499u;

    /* renamed from: v  reason: collision with root package name */
    private LinearLayout f36500v;

    /* renamed from: w  reason: collision with root package name */
    private LinearLayout f36502w;

    /* renamed from: x  reason: collision with root package name */
    private List<DownloadTask> f36503x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f36504y;

    /* renamed from: z  reason: collision with root package name */
    private ArrayList<BannerImage> f36505z;
    private ImageView[] B = null;
    List<RecomDatabeanBusiness> C = null;
    private Map<String, DownloadTask> D = new ConcurrentHashMap();
    private boolean M = false;
    com.join.mgps.pref.f O = null;
    private boolean R = false;
    private boolean S = false;
    private String T = "m1";
    private int U = 1;
    private int V = 0;
    int Z = 0;

    /* renamed from: p0  reason: collision with root package name */
    boolean f36493p0 = true;

    /* renamed from: p1  reason: collision with root package name */
    Handler f36494p1 = new e();

    /* renamed from: v1  reason: collision with root package name */
    private String f36501v1 = "28";
    private int B1 = 0;
    private int C1 = 0;
    private String H1 = "";
    long I1 = 0;
    long J1 = 0;
    Handler K1 = new Handler();
    Runnable L1 = new Runnable() { // from class: com.join.mgps.activity.m2
        @Override // java.lang.Runnable
        public final void run() {
            PapaMainFragment.this.E0();
        }
    };
    boolean M1 = true;
    private boolean N1 = true;
    private SparseArray O1 = new SparseArray(0);
    GestureDetector P1 = new GestureDetector(new b());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f36506b;

        a(List list) {
            this.f36506b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int currentItem = ((ImageHandler.AdFragment) PapaMainFragment.this).f27420c.getCurrentItem() % this.f36506b.size();
            if (this.f36506b.size() < currentItem) {
                currentItem = 110;
            }
            PapaMainFragment.this.r1(this.f36506b, currentItem);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VipPopData f36509b;

        c(VipPopData vipPopData) {
            this.f36509b = vipPopData;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentDateBean intentDataBean = this.f36509b.getIntentDataBean();
            if (intentDataBean.getLink_type() == 777) {
                IntentUtil.getInstance().goShareWebActivity(PapaMainFragment.this.f36495q, "http://www.baidu.com");
            } else if (intentDataBean.getLink_type() == 888) {
                IntentUtil.getInstance().goShareWebActivity(PapaMainFragment.this.f36495q, "http://www.baidu.com");
            } else if (intentDataBean.getLink_type() == 999) {
                IntentUtil.getInstance().goVip(PapaMainFragment.this.f36495q);
            } else if (intentDataBean.getLink_type() == 0) {
            } else {
                IntentUtil.getInstance().intentActivity(PapaMainFragment.this.f36495q, intentDataBean);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f36511b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VipPopData f36512c;

        d(View view, VipPopData vipPopData) {
            this.f36511b = view;
            this.f36512c = vipPopData;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainFragment.this.f36492p.removeView(this.f36511b);
            PapaMainFragment papaMainFragment = PapaMainFragment.this;
            int i4 = papaMainFragment.Z - 1;
            papaMainFragment.Z = i4;
            if (i4 == 1) {
                papaMainFragment.f36492p.stopFlipping();
            } else if (i4 == 0) {
                papaMainFragment.f36492p.setVisibility(8);
            }
            PapaMainFragment.this.B0(this.f36512c.getId(), this.f36512c.getType());
        }
    }

    /* loaded from: classes4.dex */
    class e extends Handler {
        e() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                PapaMainFragment papaMainFragment = PapaMainFragment.this;
                com.join.android.app.component.video.c cVar = papaMainFragment.W;
                if (cVar != null) {
                    cVar.J(papaMainFragment.f36493p0);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
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
            if (i4 == 1 || IntentUtil.getInstance().goLoginNetGame(PapaMainFragment.this.f36495q)) {
                return;
            }
            PapaMainFragment.this.r0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements com.join.mgps.customview.g {
        h() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (PapaMainFragment.this.M) {
                return;
            }
            PapaMainFragment.this.T = "m1";
            PapaMainFragment.this.U = 1;
            PapaMainFragment.this.V = 0;
            PapaMainFragment papaMainFragment = PapaMainFragment.this;
            papaMainFragment.I0(papaMainFragment.T, PapaMainFragment.this.U);
            PapaMainFragment.this.y0();
            PapaMainFragment.this.t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements com.join.mgps.customview.f {
        i() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            PapaMainFragment papaMainFragment = PapaMainFragment.this;
            papaMainFragment.I0(papaMainFragment.T, PapaMainFragment.this.U);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements View.OnTouchListener {
        j() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PapaMainFragment.this.P1.onTouchEvent(motionEvent);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements ViewPager.OnPageChangeListener {
        k() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
            if (i4 == 0) {
                ((ImageHandler.AdFragment) PapaMainFragment.this).f27419b.sendEmptyMessageDelayed(1, 5000L);
            } else if (i4 != 1) {
            } else {
                ((ImageHandler.AdFragment) PapaMainFragment.this).f27419b.sendEmptyMessage(2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            try {
                ((ImageHandler.AdFragment) PapaMainFragment.this).f27419b.sendMessage(Message.obtain(((ImageHandler.AdFragment) PapaMainFragment.this).f27419b, 4, i4, 0));
                int size = i4 % PapaMainFragment.this.f36505z.size();
                for (int i5 = 0; i5 < PapaMainFragment.this.f36505z.size(); i5++) {
                    PapaMainFragment.this.B[size].setBackgroundResource(R.drawable.pointselected);
                    if (size != i5) {
                        PapaMainFragment.this.B[i5].setBackgroundResource(R.drawable.pointnormal);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l {

        /* renamed from: a  reason: collision with root package name */
        int f36521a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f36522b = 0;

        l() {
        }
    }

    /* loaded from: classes4.dex */
    class m {

        /* renamed from: a  reason: collision with root package name */
        private ImageView f36524a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f36525b;

        /* renamed from: c  reason: collision with root package name */
        private ImageView f36526c;

        m() {
        }
    }

    private void C0() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 11) {
            this.f36487k.setVisibility(8);
        }
        HomeViewModle homeViewModle = (HomeViewModle) new ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(MApplication.f1497x)).get(HomeViewModle.class);
        this.Y = homeViewModle;
        homeViewModle.initStat(this.f36495q);
        this.Y.getLists().clear();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f36491o.getLayoutParams();
        if (i4 >= 21) {
            layoutParams.height = com.join.android.app.common.utils.n.v(getContext());
        }
        this.f36491o.setLayoutParams(layoutParams);
        this.C = new ArrayList();
        this.I = new ArrayList();
        this.H = new o3(this.f36495q, this, this.I, this.W, new g());
        View inflate = LayoutInflater.from(this.f36495q).inflate(R.layout.mg_papa_title_include, (ViewGroup) null, false);
        this.f36480d.setPullRefreshEnable(new h());
        this.f36480d.setPreLoadCount(10);
        this.f36480d.setPullLoadEnable(new i());
        this.f36480d.addHeaderView(inflate);
        this.f36480d.setAdapter((ListAdapter) this.H);
        this.f36480d.setOnScrollListener(this);
        this.f36480d.setOnTouchListener(new j());
        this.f27419b = new ImageHandler(new WeakReference(this));
        this.f36505z = new ArrayList<>();
        this.P.j(true);
        this.f27420c = (LoopViewPager) inflate.findViewById(R.id.top_ad_viewpager);
        this.A = (ViewGroup) inflate.findViewById(R.id.point_group);
        this.G = (LinearLayout) inflate.findViewById(R.id.table2);
        this.F = (LinearLayout) inflate.findViewById(R.id.table1);
        this.f36492p = (ViewFlipper) inflate.findViewById(R.id.topLineView);
        this.N = (FrameLayout) inflate.findViewById(R.id.onlyOne);
        this.f27420c.setOnPageChangeListener(new k());
        this.f27419b.sendEmptyMessageDelayed(3, 5000L);
        this.f36497s = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(int i4, BannerBean bannerBean, View view) {
        int i5;
        d1("2-" + i4);
        IntentDateBean intentDataBean = bannerBean.getIntentDataBean();
        try {
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (com.join.mgps.Util.g2.i(intentDataBean.getLink_type_val())) {
            i5 = Integer.parseInt(intentDataBean.getLink_type_val());
            if (intentDataBean.getLink_type() != 3 && intentDataBean.getJump_type() == 31) {
                com.join.mgps.Util.d0.a().c(new IntentClassfyEvent(1));
                return;
            } else if (intentDataBean.getLink_type() != 3 && intentDataBean.getJump_type() == 2 && i5 == 1) {
                com.join.mgps.Util.d0.a().c(new IntentClassfyEvent(2));
                return;
            } else {
                intentDataBean.setExt1(bannerBean.getSub_title());
                IntentUtil.getInstance().intentActivity(this.f36495q, intentDataBean);
            }
        }
        i5 = 1;
        if (intentDataBean.getLink_type() != 3) {
        }
        if (intentDataBean.getLink_type() != 3) {
        }
        intentDataBean.setExt1(bannerBean.getSub_title());
        IntentUtil.getInstance().intentActivity(this.f36495q, intentDataBean);
    }

    private RecomDatabeanBusiness R0(RecomDatabean recomDatabean) {
        if (recomDatabean != null) {
            return new RecomDatabeanBusiness(recomDatabean);
        }
        return null;
    }

    private List<RecomDatabeanBusiness> S0(List<RecomDatabean> list, List<RecomDatabeanBusiness> list2) {
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

    private List<RecomDatabean> T0(int i4) {
        ArrayList arrayList = new ArrayList();
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("dataFrom", Integer.valueOf(i4));
            List<RecomDatabeanTable> h4 = b2.f0.p().h(hashMap);
            for (int i5 = 0; i5 < h4.size(); i5++) {
                RecomDatabeanTable recomDatabeanTable = h4.get(i5);
                RecomDatabean recomDatabean = new RecomDatabean();
                recomDatabean.setDataFrom(recomDatabeanTable.getDataFrom());
                ModleBeanTable main = recomDatabeanTable.getMain();
                recomDatabean.setMain(main != null ? main.getModleBean() : null);
                CloseableWrappedIterable<AppMoreBeanTable> wrappedIterable = recomDatabeanTable.getMore().getWrappedIterable();
                ArrayList arrayList2 = new ArrayList();
                for (AppMoreBeanTable appMoreBeanTable : wrappedIterable) {
                    arrayList2.add(appMoreBeanTable.getAppMoreBean());
                    recomDatabean.setMore(arrayList2);
                }
                CloseableWrappedIterable<AppBeanMainTable> wrappedIterable2 = recomDatabeanTable.getSub().getWrappedIterable();
                ArrayList arrayList3 = new ArrayList();
                for (AppBeanMainTable appBeanMainTable : wrappedIterable2) {
                    AppBeanMain appbeanMain = appBeanMainTable.getAppbeanMain();
                    arrayList3.add(appbeanMain);
                    AppBeanTable game_info = appBeanMainTable.getGame_info();
                    if (game_info != null) {
                        AppBean appBean = game_info.getAppBean();
                        if (game_info.getTag_info() != null) {
                            ArrayList arrayList4 = new ArrayList();
                            for (TipBeanTable tipBeanTable : game_info.getTag_info().getWrappedIterable()) {
                                arrayList4.add(tipBeanTable.getTipBean());
                            }
                            appBean.setTag_info(arrayList4);
                        }
                        if (game_info.getTp_down_url() != null) {
                            ArrayList arrayList5 = new ArrayList();
                            for (DownloadUrlTable downloadUrlTable : game_info.getTp_down_url().getWrappedIterable()) {
                                arrayList5.add(downloadUrlTable.getDownUrlBean());
                            }
                            appBean.setTp_down_url(arrayList5);
                        }
                        appbeanMain.setGame_info(appBean);
                    }
                }
                recomDatabean.setSub(arrayList3);
                arrayList.add(recomDatabean);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
        r2 = r7.C.get(r1).getSub().get(0).getGame_info();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
        if (r2 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        if (r2.getMod_info() == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
        r3 = r7.D.get(r2.getMod_info().getMod_game_id());
        r5 = r7.D.get(r2.getCrc_sign_id());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
        if (r3 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
        if (r5 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
        r7.C.get(r1).d(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
        r7.C.get(r1).d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
        if (r5 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
        r7.C.get(r1).d(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
        if (r2.getCrc_sign_id().equals(r8.getCrc_link_type_val()) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
        r7.C.get(r1).d(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
        if (r2.getCrc_sign_id().equals(r8.getCrc_link_type_val()) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c7, code lost:
        r7.C.get(r1).d(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        r7.D.remove(r1.getCrc_link_type_val());
        r0.remove();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r1 >= r7.C.size()) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void U0(com.github.snowdream.android.app.downloader.DownloadTask r8) {
        /*
            r7 = this;
            java.util.List<com.github.snowdream.android.app.downloader.DownloadTask> r0 = r7.f36503x     // Catch: java.lang.Exception -> Ld6
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Ld6
        L6:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> Ld6
            if (r1 == 0) goto Lda
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> Ld6
            com.github.snowdream.android.app.downloader.DownloadTask r1 = (com.github.snowdream.android.app.downloader.DownloadTask) r1     // Catch: java.lang.Exception -> Ld6
            java.lang.String r2 = r1.getCrc_link_type_val()     // Catch: java.lang.Exception -> Ld6
            java.lang.String r3 = r8.getCrc_link_type_val()     // Catch: java.lang.Exception -> Ld6
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Ld6
            if (r2 == 0) goto L6
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r2 = r7.D     // Catch: java.lang.Exception -> Ld6
            java.lang.String r1 = r1.getCrc_link_type_val()     // Catch: java.lang.Exception -> Ld6
            r2.remove(r1)     // Catch: java.lang.Exception -> Ld6
            r0.remove()     // Catch: java.lang.Exception -> Ld6
            r0 = 0
            r1 = 0
        L2e:
            java.util.List<com.join.mgps.business.RecomDatabeanBusiness> r2 = r7.C     // Catch: java.lang.Exception -> Ld6
            int r2 = r2.size()     // Catch: java.lang.Exception -> Ld6
            if (r1 >= r2) goto Lda
            java.util.List<com.join.mgps.business.RecomDatabeanBusiness> r2 = r7.C     // Catch: java.lang.Exception -> Ld6
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> Ld6
            com.join.mgps.business.RecomDatabeanBusiness r2 = (com.join.mgps.business.RecomDatabeanBusiness) r2     // Catch: java.lang.Exception -> Ld6
            java.util.List r2 = r2.getSub()     // Catch: java.lang.Exception -> Ld6
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Exception -> Ld6
            com.join.mgps.dto.AppBeanMain r2 = (com.join.mgps.dto.AppBeanMain) r2     // Catch: java.lang.Exception -> Ld6
            com.join.mgps.dto.AppBean r2 = r2.getGame_info()     // Catch: java.lang.Exception -> Ld6
            if (r2 != 0) goto L50
            goto Ld2
        L50:
            com.join.mgps.dto.ModInfoBean r3 = r2.getMod_info()     // Catch: java.lang.Exception -> Ld6
            r4 = 0
            if (r3 == 0) goto Lb9
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r7.D     // Catch: java.lang.Exception -> Ld6
            com.join.mgps.dto.ModInfoBean r5 = r2.getMod_info()     // Catch: java.lang.Exception -> Ld6
            java.lang.String r5 = r5.getMod_game_id()     // Catch: java.lang.Exception -> Ld6
            java.lang.Object r3 = r3.get(r5)     // Catch: java.lang.Exception -> Ld6
            com.github.snowdream.android.app.downloader.DownloadTask r3 = (com.github.snowdream.android.app.downloader.DownloadTask) r3     // Catch: java.lang.Exception -> Ld6
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r5 = r7.D     // Catch: java.lang.Exception -> Ld6
            java.lang.String r6 = r2.getCrc_sign_id()     // Catch: java.lang.Exception -> Ld6
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Exception -> Ld6
            com.github.snowdream.android.app.downloader.DownloadTask r5 = (com.github.snowdream.android.app.downloader.DownloadTask) r5     // Catch: java.lang.Exception -> Ld6
            if (r3 != 0) goto L83
            if (r5 != 0) goto L83
            java.util.List<com.join.mgps.business.RecomDatabeanBusiness> r2 = r7.C     // Catch: java.lang.Exception -> Ld6
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> Ld6
            com.join.mgps.business.RecomDatabeanBusiness r2 = (com.join.mgps.business.RecomDatabeanBusiness) r2     // Catch: java.lang.Exception -> Ld6
            r2.d(r4)     // Catch: java.lang.Exception -> Ld6
            goto Ld2
        L83:
            if (r3 == 0) goto L91
            java.util.List<com.join.mgps.business.RecomDatabeanBusiness> r2 = r7.C     // Catch: java.lang.Exception -> Ld6
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> Ld6
            com.join.mgps.business.RecomDatabeanBusiness r2 = (com.join.mgps.business.RecomDatabeanBusiness) r2     // Catch: java.lang.Exception -> Ld6
            r2.d(r3)     // Catch: java.lang.Exception -> Ld6
            goto Ld2
        L91:
            if (r5 == 0) goto L9f
            java.util.List<com.join.mgps.business.RecomDatabeanBusiness> r2 = r7.C     // Catch: java.lang.Exception -> Ld6
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> Ld6
            com.join.mgps.business.RecomDatabeanBusiness r2 = (com.join.mgps.business.RecomDatabeanBusiness) r2     // Catch: java.lang.Exception -> Ld6
            r2.d(r5)     // Catch: java.lang.Exception -> Ld6
            goto Ld2
        L9f:
            java.lang.String r2 = r2.getCrc_sign_id()     // Catch: java.lang.Exception -> Ld6
            java.lang.String r3 = r8.getCrc_link_type_val()     // Catch: java.lang.Exception -> Ld6
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Ld6
            if (r2 == 0) goto Ld2
            java.util.List<com.join.mgps.business.RecomDatabeanBusiness> r2 = r7.C     // Catch: java.lang.Exception -> Ld6
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> Ld6
            com.join.mgps.business.RecomDatabeanBusiness r2 = (com.join.mgps.business.RecomDatabeanBusiness) r2     // Catch: java.lang.Exception -> Ld6
            r2.d(r4)     // Catch: java.lang.Exception -> Ld6
            goto Ld2
        Lb9:
            java.lang.String r2 = r2.getCrc_sign_id()     // Catch: java.lang.Exception -> Ld6
            java.lang.String r3 = r8.getCrc_link_type_val()     // Catch: java.lang.Exception -> Ld6
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Ld6
            if (r2 == 0) goto Ld2
            java.util.List<com.join.mgps.business.RecomDatabeanBusiness> r2 = r7.C     // Catch: java.lang.Exception -> Ld6
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> Ld6
            com.join.mgps.business.RecomDatabeanBusiness r2 = (com.join.mgps.business.RecomDatabeanBusiness) r2     // Catch: java.lang.Exception -> Ld6
            r2.d(r4)     // Catch: java.lang.Exception -> Ld6
        Ld2:
            int r1 = r1 + 1
            goto L2e
        Ld6:
            r8 = move-exception
            r8.printStackTrace()
        Lda:
            r7.O0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.PapaMainFragment.U0(com.github.snowdream.android.app.downloader.DownloadTask):void");
    }

    private void V0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.D;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            DownloadTask downloadTask2 = map.get(downloadTask.getCrc_link_type_val());
            if (downloadTask2 != null) {
                downloadTask2.setStatus(downloadTask.getStatus());
                O0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void W0(DownloadTask downloadTask) {
        try {
            if (this.D.containsKey(downloadTask.getCrc_link_type_val())) {
                UtilsMy.x4(this.D.get(downloadTask.getCrc_link_type_val()));
                this.D.get(downloadTask.getCrc_link_type_val()).setStatus(downloadTask.getStatus());
            } else {
                if (this.f36503x == null) {
                    this.f36503x = new ArrayList();
                }
                if (this.D == null) {
                    this.D = new HashMap();
                }
                this.f36503x.add(downloadTask);
                this.D.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
            w1(downloadTask);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        O0();
    }

    private void X0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.D;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            UtilsMy.x4(this.D.get(downloadTask.getCrc_link_type_val()));
            if (this.f36503x == null) {
                this.f36503x = new ArrayList();
            }
            this.f36503x.add(downloadTask);
            this.D.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        w1(downloadTask);
        DownloadTask downloadTask2 = this.D.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        O0();
    }

    private void b1(List<RecomDatabean> list, int i4) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            try {
                RecomDatabean recomDatabean = list.get(i5);
                RecomDatabeanTable recomDatabeanTable = new RecomDatabeanTable();
                recomDatabeanTable.setDataFrom(i4);
                ModleBean main = recomDatabean.getMain();
                if (main != null) {
                    ModleBeanTable modleBeanTable = new ModleBeanTable(main);
                    try {
                        b2.c0.n().m(modleBeanTable);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    recomDatabeanTable.setMain(modleBeanTable);
                }
                try {
                    b2.f0.p().m(recomDatabeanTable);
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                List<AppBeanMain> sub = recomDatabean.getSub();
                if (sub != null) {
                    for (int i6 = 0; i6 < sub.size(); i6++) {
                        AppBeanMain appBeanMain = sub.get(i6);
                        AppBeanMainTable appBeanMainTable = new AppBeanMainTable(appBeanMain);
                        appBeanMainTable.setRecomDatabeanTable(recomDatabeanTable);
                        AppBean game_info = appBeanMain.getGame_info();
                        if (game_info != null) {
                            AppBeanTable appBeanTable = new AppBeanTable(game_info);
                            b2.b.n().m(appBeanTable);
                            ArrayList<TipBean> tag_info = game_info.getTag_info();
                            if (tag_info == null) {
                                tag_info = new ArrayList<>();
                            }
                            for (int i7 = 0; i7 < tag_info.size(); i7++) {
                                TipBeanTable tipBeanTable = new TipBeanTable(tag_info.get(i7));
                                tipBeanTable.setAppBeanTable(appBeanTable);
                                b2.k0.n().m(tipBeanTable);
                            }
                            List<DownloadUrlBean> tp_down_url = game_info.getTp_down_url();
                            if (tp_down_url == null) {
                                tp_down_url = new ArrayList<>();
                            }
                            for (int i8 = 0; i8 < tp_down_url.size(); i8++) {
                                DownloadUrlTable downloadUrlTable = new DownloadUrlTable(tp_down_url.get(i8));
                                downloadUrlTable.setAppBeanTable(appBeanTable);
                                b2.l.n().m(downloadUrlTable);
                            }
                            appBeanMainTable.setGame_info(appBeanTable);
                        }
                        b2.a.n().m(appBeanMainTable);
                    }
                }
                List<AppMoreBean> more = recomDatabean.getMore();
                if (more != null && more.size() > 0) {
                    AppMoreBeanTable appMoreBeanTable = new AppMoreBeanTable(more.get(0));
                    appMoreBeanTable.setRecomDatabeanTable(recomDatabeanTable);
                    b2.c.n().k(appMoreBeanTable);
                }
            } catch (Exception e7) {
                e7.printStackTrace();
                return;
            }
        }
    }

    private void d1(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("22-");
        sb.append(str);
        com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(this.f36495q);
        String name = ExtFrom.home.name();
        l4.t(name, "22-" + str, AccountUtil_.getInstance_(this.f36495q).getUid());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e1(java.lang.String r12, java.lang.String r13, com.psk.eventmodule.StatFactory.VolcanoOther r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.PapaMainFragment.e1(java.lang.String, java.lang.String, com.psk.eventmodule.StatFactory$VolcanoOther, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f1 */
    public void E0() {
        MgpapaMainItemBean mgpapaMainItemBean;
        int showtype;
        List<AppBeanMain> sub;
        XListView2 xListView2;
        if (this.K == 0 && this.J == 1 && (xListView2 = this.f36480d) != null) {
            this.J = xListView2.getLastVisiblePosition();
            this.K = this.f36480d.getFirstVisiblePosition();
        }
        int i4 = this.K;
        if (i4 == 0 && this.J == 0) {
            return;
        }
        if (i4 == 0 && this.J == 1) {
            return;
        }
        this.M1 = false;
        for (int i5 = 0; i5 < this.I.size(); i5++) {
            if (i5 <= this.J && i5 >= this.K && (((showtype = (mgpapaMainItemBean = this.I.get(i5)).getShowtype()) == 3 || showtype == 13) && (sub = mgpapaMainItemBean.getRecomDatabeanLeft().getSub()) != null && sub.size() > 0)) {
                AppBean game_info = sub.get(0).getGame_info();
                e1(mgpapaMainItemBean.getMoreType2(), game_info.getGame_id(), game_info.getPosition_path(), UtilsMy.k2(game_info.getTag_info()));
            }
        }
    }

    private void h1(List<RecomDatabean> list, int i4, int i5) {
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

    private void i1(MgpapaMainItemBean mgpapaMainItemBean) {
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

    private void k1(List<RecomDatabean> list, List<RecomDatabean> list2, String str) {
        List<RecomDatabeanBusiness> S0 = S0(list, null);
        this.C.addAll(S0);
        if (S0 == null || S0.size() == 0) {
            return;
        }
        for (int i4 = 0; i4 < S0.size(); i4++) {
            MgpapaMainItemBean mgpapaMainItemBean = new MgpapaMainItemBean();
            if (i4 != 0) {
                mgpapaMainItemBean.setMoreType2(str + (i4 + 1) + "-");
                mgpapaMainItemBean.setShowtype(3);
            } else if (list2 != null) {
                RecomDatabean recomDatabean = list2.get(0);
                mgpapaMainItemBean.setShowtype(13);
                S0.get(i4).getMain().setPic_remote(recomDatabean.getMain().getPic_remote());
                S0.get(i4).getMain().setVedio_url(recomDatabean.getMain().getVedio_url());
                mgpapaMainItemBean.setMoreType2(str + "x");
            }
            mgpapaMainItemBean.setMoreType(i4);
            mgpapaMainItemBean.setRecomDatabeanLeft(S0.get(i4));
            i1(mgpapaMainItemBean);
            this.I.add(mgpapaMainItemBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r1(List<BannerBean> list, int i4) {
        if (list == null || list.size() == 0) {
            return;
        }
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setJump_type(list.get(i4).getJump_type());
        intentDateBean.setLink_type(list.get(i4).getLink_type());
        intentDateBean.setLink_type_val(list.get(i4).getLink_type_val());
        if (list.get(i4).getLink_type() == 1) {
            intentDateBean.setTpl_type(list.get(i4).getGame_info_tpl_type());
            intentDateBean.setExtBean(new ExtBean(105));
        } else {
            intentDateBean.setTpl_type(list.get(i4).getTpl_type());
        }
        intentDateBean.setCrc_link_type_val(list.get(i4).getCrc_link_type_val());
        intentDateBean.setObject(list.get(i4).getTitle());
        d1("1-" + (i4 + 1) + "");
        IntentUtil.getInstance().intentActivity(this.f36495q, intentDateBean);
    }

    private List<BannerBean> s0() {
        ArrayList arrayList = new ArrayList();
        for (BannerAndTablesTable bannerAndTablesTable : b2.d.n().d()) {
            arrayList.add(bannerAndTablesTable.getBannerBean());
        }
        return arrayList;
    }

    private void v0() {
        Bundle bundle = new Bundle();
        bundle.putInt("localType", 1);
        com.join.mgps.pref.f fVar = this.O;
        if (fVar != null) {
            fVar.callOnlineCoupon(bundle);
        }
    }

    private void w1(DownloadTask downloadTask) {
        try {
            List<RecomDatabeanBusiness> list = this.C;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (int i4 = 0; i4 < this.C.size(); i4++) {
                AppBean game_info = this.C.get(i4).getSub().get(0).getGame_info();
                if (game_info != null) {
                    if (game_info.getMod_info() != null) {
                        ModInfoBean mod_info = game_info.getMod_info();
                        DownloadTask downloadTask2 = this.D.get(mod_info.getMain_game_id());
                        boolean z4 = true;
                        boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                        DownloadTask downloadTask3 = this.D.get(mod_info.getMod_game_id());
                        if (downloadTask3 == null || downloadTask3.getStatus() != 5) {
                            z4 = false;
                        }
                        if (z4 && z5) {
                            if (downloadTask.getCrc_link_type_val().equals(game_info.getCrc_sign_id())) {
                                this.C.get(i4).d(downloadTask);
                            }
                        } else if (z4) {
                            if (game_info.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(game_info.getMod_info().getMod_game_id())) {
                                this.C.get(i4).d(downloadTask);
                            }
                        } else if (z5) {
                            if (downloadTask.getCrc_link_type_val().equals(game_info.getCrc_sign_id())) {
                                this.C.get(i4).d(downloadTask);
                            }
                        } else {
                            DownloadTask downloadTask4 = game_info.getMod_info() != null ? this.D.get(game_info.getMod_info().getMod_game_id()) : null;
                            if (downloadTask4 == null) {
                                downloadTask4 = this.D.get(game_info.getCrc_sign_id());
                            }
                            if (downloadTask4 != null && downloadTask.getCrc_link_type_val().equals(downloadTask4.getCrc_link_type_val())) {
                                this.C.get(i4).d(downloadTask);
                            }
                        }
                    } else if (game_info.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                        this.C.get(i4).d(downloadTask);
                        this.D.put(downloadTask.getCrc_link_type_val(), downloadTask);
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private int x0() {
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i4 = this.K;
            if (i5 >= i4) {
                break;
            }
            l lVar = (l) this.O1.get(i5);
            if (lVar != null) {
                i6 += lVar.f36521a;
            }
            i5++;
        }
        l lVar2 = (l) this.O1.get(i4);
        if (lVar2 == null) {
            lVar2 = new l();
        }
        return i6 - lVar2.f36522b;
    }

    private void z1() {
        RecomDatabeanBusiness recomDatabeanLeft;
        if (this.K < 0 || this.J >= this.f36480d.getCount()) {
            return;
        }
        for (int i4 = this.K; i4 <= this.J; i4++) {
            MgpapaMainItemBean mgpapaMainItemBean = (MgpapaMainItemBean) this.f36480d.getItemAtPosition(i4);
            if (mgpapaMainItemBean != null && mgpapaMainItemBean.getShowtype() == 3 && (recomDatabeanLeft = mgpapaMainItemBean.getRecomDatabeanLeft()) != null) {
                List<AppBeanMain> sub = recomDatabeanLeft.getSub();
                if (sub == null || sub.size() == 0) {
                    return;
                }
                AppBeanMain appBeanMain = recomDatabeanLeft.getSub().get(0);
                if (appBeanMain == null) {
                    continue;
                } else {
                    appBeanMain.getGame_info();
                    DownloadTask a5 = recomDatabeanLeft.a();
                    if (a5 != null && (a5.getStatus() == 2 || a5.getStatus() == 12)) {
                        View childAt = this.f36480d.getChildAt(i4 - this.K);
                        if (childAt.getTag() instanceof o3.h2) {
                            o3.h2 h2Var = (o3.h2) childAt.getTag();
                            try {
                                DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(a5.getCrc_link_type_val());
                                if (f5 == null) {
                                    return;
                                }
                                long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                                if (a5.getSize() == 0) {
                                    TextView textView = h2Var.f45228h;
                                    textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                } else {
                                    TextView textView2 = h2Var.f45228h;
                                    textView2.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                }
                                if (a5.getStatus() == 12) {
                                    h2Var.f45232l.setProgress((int) f5.getProgress());
                                } else {
                                    h2Var.f45231k.setProgress((int) f5.getProgress());
                                }
                                if (a5.getStatus() == 2) {
                                    TextView textView3 = h2Var.f45229i;
                                    textView3.setText(f5.getSpeed() + "/S");
                                }
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 2000)
    public void A0() {
        TextView textView = this.f36484h;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    void A1(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    W0(downloadTask);
                    return;
                case 3:
                    U0(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    X0(downloadTask);
                    return;
                case 6:
                    V0(downloadTask);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void B0(int i4, String str) {
        try {
            this.f36483g.e0(RequestBeanUtil.getInstance(this.f36495q).getIgnoreMessageRequest(AccountUtil_.getInstance_(this.f36495q).getAccountData().getUid(), i4, str));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void B1() {
        this.f36492p.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void D0() {
        try {
            if (com.join.mgps.Util.g2.i(this.F1.getMain().getPic_remote())) {
                IntentUtil.getInstance().intentActivity(this.f36495q, this.F1.getSub().get(0).getIntentDataBean());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void G0() {
        String d5 = this.E.homeAllData().d();
        PAPAHomeBeanV6 pAPAHomeBeanV6 = com.join.mgps.Util.g2.i(d5) ? (PAPAHomeBeanV6) JsonMapper.getInstance().fromJson(d5, PAPAHomeBeanV6.class) : null;
        if (pAPAHomeBeanV6 != null && pAPAHomeBeanV6.getBanner() != null && pAPAHomeBeanV6.getBanner().size() > 0) {
            v1(pAPAHomeBeanV6, "m1", 1, false);
            com.join.mgps.Util.v0.c("显示主界面   " + System.currentTimeMillis());
            showMain();
            this.f36504y = false;
        } else {
            com.join.mgps.Util.v0.c("数据库没有数据不显示主界面   " + System.currentTimeMillis());
            this.f36504y = true;
        }
        J0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 3000)
    public void H0() {
        XListView2 xListView2 = this.f36480d;
        if (xListView2 != null) {
            xListView2.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5 A[Catch: Exception -> 0x00bd, all -> 0x00f7, TryCatch #0 {Exception -> 0x00bd, blocks: (B:16:0x0098, B:18:0x009e, B:22:0x00ab, B:25:0x00b5, B:26:0x00b8, B:23:0x00af), top: B:62:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I0(java.lang.String r9, int r10) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.PapaMainFragment.I0(java.lang.String, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void J0() {
        I0("m1", 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void K0() {
        this.f36480d.smoothScrollToPositionFromTop(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void L0() {
        com.join.android.app.common.manager.a.h().j(this.f36495q, this.f36481e, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void M0() {
        XListView2 xListView2 = this.f36480d;
        if (xListView2 != null) {
            xListView2.setNoMore();
        }
    }

    void N0() {
        o3 o3Var = this.H;
        if (o3Var != null) {
            o3Var.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void O0() {
        o3 o3Var = this.H;
        if (o3Var != null) {
            o3Var.notifyDataSetChanged();
        }
    }

    public void P0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void Q0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        o3 o3Var = this.H;
        if (o3Var != null) {
            o3Var.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.B})
    public void X() {
        if (!this.M) {
            this.T = "m1";
            this.U = 1;
            this.f36480d.l();
            I0(this.T, this.U);
            y0();
        }
        this.Y.initStat(this.f36495q);
        if (isVisible()) {
            v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.broadcast.bespeak.sussess"})
    public void Y0(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("gameid");
            if (com.join.mgps.Util.g2.i(stringExtra)) {
                u1(stringExtra);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Z0(List<BannerBean> list) {
        if (list == null && list.size() == 0) {
            return;
        }
        for (BannerBean bannerBean : list) {
            try {
                b2.d.n().k(new BannerAndTablesTable(bannerBean));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void a1(PAPAHomeBeanV6 pAPAHomeBeanV6) {
        this.E.homeAllData().g(JsonMapper.toJsonString(pAPAHomeBeanV6));
        com.join.mgps.Util.v0.c("保存数据完成   " + System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        com.join.mgps.Util.v0.c("MGPapaMainFragmentNew afterview   " + System.currentTimeMillis());
        this.f36483g = com.join.mgps.rpc.impl.d.P1();
        com.join.mgps.Util.d0.a().d(this);
        this.f36495q = getActivity();
        this.L = System.currentTimeMillis();
        this.W = new com.join.android.app.component.video.c(this.f36495q, "PapaMainAdapter");
        this.X = (MGMainActivity) getActivity();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.Q.getLayoutParams();
        if (Build.VERSION.SDK_INT >= 21) {
            layoutParams.topMargin = com.join.android.app.common.utils.n.v(this.f36495q);
        }
        this.Q.setLayoutParams(layoutParams);
        C0();
        showLoding();
        G0();
        y0();
        u0();
        t0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void c1() {
        IntentUtil.getInstance().goSearchHintActivity(this.f36495q, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g1() {
        com.join.android.app.common.manager.a.h().j(this.f36495q, this.f36482f, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j1(List<BannerBean> list, boolean z4) {
        try {
            this.F.removeAllViews();
            this.G.removeAllViews();
            if (list != null) {
                int i4 = 0;
                while (i4 < list.size()) {
                    final int i5 = i4 + 1;
                    final BannerBean bannerBean = list.get(i4);
                    PapamainFastitemLayoutBinding inflate = PapamainFastitemLayoutBinding.inflate(LayoutInflater.from(this.f36495q));
                    if (i4 < 5) {
                        this.F.addView(inflate.getRoot());
                        inflate.getRoot().setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                    } else {
                        this.G.addView(inflate.getRoot());
                        inflate.getRoot().setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                    }
                    MyImageLoader.h(inflate.f25711c, bannerBean.getPic_remote());
                    inflate.f25712d.setText(bannerBean.getSub_title());
                    inflate.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.l2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PapaMainFragment.this.F0(i5, bannerBean, view);
                        }
                    });
                    i4 = i5;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l1() {
        com.join.mgps.Util.s.i(this.f36495q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m1() {
        if (getUserVisibleHint()) {
            com.join.mgps.Util.b0.f0(this.f36495q).O(this.f36495q, 1, new f()).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n1(HomeFloatData homeFloatData) {
        try {
            List<RecomDatabean> pendant = homeFloatData.getPendant();
            List<RecomDatabean> coin_entrance = homeFloatData.getCoin_entrance();
            if (this.f36489m != null) {
                if (pendant != null && pendant.size() > 0) {
                    RecomDatabean recomDatabean = pendant.get(0);
                    this.F1 = recomDatabean;
                    if (recomDatabean != null && recomDatabean.getMain().getAd_switch() == 1) {
                        this.f36489m.setVisibility(0);
                        if (com.join.mgps.Util.g2.i(this.F1.getMain().getPic_remote())) {
                            if (!this.H1.equals(this.F1.getMain().getPic_remote())) {
                                this.H1 = this.F1.getMain().getPic_remote();
                                MyImageLoader.d(this.f36489m, R.drawable.translate_drawable, this.F1.getMain().getPic_remote());
                            }
                        } else {
                            this.f36489m.setVisibility(8);
                        }
                    } else {
                        this.f36489m.setVisibility(8);
                    }
                } else {
                    this.f36489m.setVisibility(8);
                }
            }
            if (coin_entrance == null || coin_entrance.size() <= 0) {
                return;
            }
            this.G1 = coin_entrance.get(0);
            Intent intent = new Intent(o1.a.F);
            intent.putExtra("coinFloatData", this.G1);
            this.f36495q.sendBroadcast(intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void o0() {
        com.join.android.app.component.video.c cVar;
        if (this.f36480d == null || (cVar = this.W) == null) {
            return;
        }
        cVar.M(1);
        this.W.n(this.f36480d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o1() {
        t0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (getActivity() instanceof MGMainActivity) {
            this.O = (MGMainActivity) getActivity();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.join.android.app.component.video.c cVar;
        com.join.mgps.Util.d0.a().e(this);
        ImageHandler imageHandler = this.f27419b;
        if (imageHandler != null) {
            imageHandler.sendEmptyMessage(2);
        }
        this.S = true;
        MGMainActivity mGMainActivity = this.X;
        if (mGMainActivity != null && mGMainActivity.getPositionNum() == 3 && (cVar = this.W) != null) {
            cVar.G();
        }
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            A1(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    A1(a5, 6);
                    return;
                } else if (c5 == 7) {
                    A1(a5, 3);
                    return;
                } else if (c5 == 8) {
                    Map<String, DownloadTask> map = this.D;
                    if (map == null || map.isEmpty()) {
                        return;
                    }
                    z1();
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            A1(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            A1(a5, 8);
                            return;
                        case 13:
                            A1(a5, 9);
                            return;
                        default:
                            return;
                    }
                }
            }
            A1(a5, 5);
        } else {
            A1(a5, 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (z4) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.join.mgps.Util.v0.d("notify time", com.join.mgps.Util.y.x(currentTimeMillis));
        long j4 = this.L;
        if (currentTimeMillis - j4 > bi.f55326s && j4 != 0) {
            long currentTimeMillis2 = System.currentTimeMillis();
            this.L = currentTimeMillis2;
            com.join.mgps.Util.v0.d("notify time lastUpdateTime", com.join.mgps.Util.y.x(currentTimeMillis2));
            this.R = true;
            I0(this.T, this.U);
        } else if (j4 == 0) {
            this.L = System.currentTimeMillis();
            com.join.mgps.Util.v0.d("notify time lastUpdateTime2", com.join.mgps.Util.y.x(currentTimeMillis));
        }
        v0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        com.join.android.app.component.video.c cVar;
        super.onPause();
        this.f36493p0 = false;
        if (this.X.getPositionNum() != 3 || (cVar = this.W) == null) {
            return;
        }
        cVar.H();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        List<MgpapaMainItemBean> list;
        super.onResume();
        this.f36493p0 = true;
        setUserVisibleHint(true);
        List<DownloadTask> d5 = p1.f.K().d();
        this.f36503x = d5;
        if (d5 != null && d5.size() > 0) {
            for (DownloadTask downloadTask : this.f36503x) {
                this.D.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        } else {
            this.f36503x = new ArrayList();
        }
        x1(this.C);
        ImageHandler imageHandler = this.f27419b;
        if (imageHandler != null) {
            imageHandler.sendEmptyMessageDelayed(1, 5000L);
        }
        if (this.X.getPositionNum() == 3) {
            com.join.android.app.component.video.c cVar = this.W;
            if (cVar != null) {
                cVar.I();
            }
            this.f36494p1.sendEmptyMessageDelayed(1, 700L);
        }
        if (!this.M1 || (list = this.I) == null || list.size() <= 0) {
            return;
        }
        onScrollStateChanged(null, 0);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.J = (i4 + i5) - 1;
        this.K = i4;
        com.join.android.app.component.video.c cVar = this.W;
        if (cVar != null) {
            cVar.f(absListView, i4, i5, i6);
        }
        if (i4 != 0) {
            this.f36491o.setVisibility(0);
            this.f36488l.setVisibility(0);
            this.Q.setVisibility(8);
        } else {
            View childAt = absListView.getChildAt(0);
            if (childAt != null) {
                l lVar = (l) this.O1.get(i4);
                if (lVar == null) {
                    lVar = new l();
                }
                lVar.f36521a = childAt.getHeight();
                lVar.f36522b = childAt.getTop();
                this.O1.append(i4, lVar);
                if (x0() <= getResources().getDimensionPixelOffset(R.dimen.wdp20)) {
                    this.f36491o.setVisibility(8);
                    this.f36488l.setVisibility(8);
                    this.Q.setVisibility(0);
                } else {
                    this.Q.setVisibility(8);
                    this.f36491o.setVisibility(0);
                    this.f36488l.setVisibility(0);
                }
            }
        }
        MGMainActivity mGMainActivity = (MGMainActivity) getActivity();
        int i7 = this.K;
        int i8 = this.V;
        if (i7 >= i8 && i8 != 0) {
            if (this.N1) {
                mGMainActivity.setHomeTabImage(false);
            }
            this.N1 = false;
        } else if (this.J + 1 < i8) {
            if (!this.N1) {
                mGMainActivity.setHomeTabImage(true);
            }
            this.N1 = true;
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        if (i4 == 0) {
            if (Fresco.getImagePipeline().H()) {
                Fresco.getImagePipeline().N();
            }
            this.K1.removeCallbacks(this.L1);
            this.K1.postDelayed(this.L1, 500L);
        }
        com.join.android.app.component.video.c cVar = this.W;
        if (cVar != null) {
            cVar.j(absListView, i4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.D1 = getResources().getDimensionPixelOffset(R.dimen.round_pointmagin_l_r_size);
        this.E1 = getResources().getDimensionPixelOffset(R.dimen.round_point_size);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        setUserVisibleHint(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void p0(String str) {
        String str2;
        if (com.join.android.app.common.utils.j.j(this.f36495q)) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f36495q).getAccountData();
            int uid = accountData != null ? accountData.getUid() : 0;
            try {
                PackageInfo packageInfo = this.f36495q.getPackageManager().getPackageInfo(this.f36495q.getPackageName(), 0);
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
            ResultMainBean d02 = this.f36483g.d0(RequestBeanUtil.getInstance(this.f36495q).getDetialFollowAnd(requestdetialFolowAndBeSpeak));
            if (d02 == null || d02.getFlag() != 1) {
                return;
            }
            u1(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p1(List<VipPopData> list) {
        this.f36492p.setInAnimation(AnimationUtils.loadAnimation(this.f36495q, R.anim.slide_in_topline));
        this.f36492p.setOutAnimation(AnimationUtils.loadAnimation(this.f36495q, R.anim.slide_out_topline));
        this.f36492p.setFlipInterval(5000);
        if (list != null && list.size() > 0) {
            this.Z = list.size();
            this.f36492p.setVisibility(0);
            LayoutInflater from = LayoutInflater.from(this.f36495q);
            this.f36492p.removeAllViews();
            for (int i4 = 0; i4 < list.size(); i4++) {
                VipPopData vipPopData = list.get(i4);
                View inflate = from.inflate(R.layout.vip_pop_layout_item, (ViewGroup) null);
                TextView textView = (TextView) com.join.mgps.Util.s2.a(inflate, R.id.message);
                MyImageLoader.d((SimpleDraweeView) com.join.mgps.Util.s2.a(inflate, R.id.image), R.drawable.laba, vipPopData.getPic_remote());
                textView.setOnClickListener(new c(vipPopData));
                ((TextView) com.join.mgps.Util.s2.a(inflate, R.id.closeNotice)).setOnClickListener(new d(inflate, vipPopData));
                textView.setText(Html.fromHtml("<u>" + vipPopData.getTitle() + "</u>"));
                IntentDateBean intentDataBean = vipPopData.getIntentDataBean();
                if (intentDataBean.getLink_type() != 777 && intentDataBean.getLink_type() != 888 && intentDataBean.getLink_type() != 999 && intentDataBean.getLink_type() == 0) {
                    textView.setText(vipPopData.getTitle());
                }
                this.f36492p.addView(inflate);
            }
        }
        this.f36492p.startFlipping();
    }

    void q0(String str) {
        p0(str);
    }

    public void q1() {
        com.join.android.app.component.video.c cVar = this.W;
        if (cVar != null) {
            cVar.H();
        }
    }

    void r0(String str) {
        q0(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        this.T = "m1";
        this.U = 1;
        I0("m1", 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void s1() {
        IntentUtil.getInstance().goSearchHintActivity(this.f36495q);
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
        LinearLayout linearLayout = this.f36485i;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f36486j;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XListView2 xListView2 = this.f36480d;
        if (xListView2 != null) {
            xListView2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f36486j;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f36485i;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XListView2 xListView2 = this.f36480d;
        if (xListView2 != null) {
            xListView2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain() {
        com.join.mgps.Util.v0.c("显示主界面main");
        LinearLayout linearLayout = this.f36486j;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f36485i;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XListView2 xListView2 = this.f36480d;
        if (xListView2 != null) {
            xListView2.setVisibility(0);
        }
        if (this.R) {
            this.R = false;
            TextView textView = this.f36484h;
            if (textView != null) {
                textView.setVisibility(0);
            }
            A0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this.f36495q).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void t0() {
        if (com.join.android.app.common.utils.j.j(this.f36495q)) {
            try {
                HomeFloatData data = this.f36483g.K0(w0()).getMessages().getData();
                if (data != null) {
                    n1(data);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t1(List<BannerBean> list) {
        if (list != null) {
            try {
                if (list.size() == 0) {
                    return;
                }
                this.f36497s.clear();
                this.f36505z.clear();
                BannerImageAdapter2 bannerImageAdapter2 = this.f36496r;
                if (bannerImageAdapter2 != null) {
                    bannerImageAdapter2.notifyDataSetChanged();
                }
                this.f36497s.addAll(list);
                StringBuilder sb = new StringBuilder();
                sb.append("updateBanner: wdp62 = ");
                sb.append((int) this.f36495q.getResources().getDimension(R.dimen.wdp62));
                for (int i4 = 0; i4 < this.f36497s.size(); i4++) {
                    BannerImage bannerImage = new BannerImage();
                    SimpleDraweeView simpleDraweeView = new SimpleDraweeView(this.f36495q);
                    simpleDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    bannerImage.setImageView(simpleDraweeView);
                    bannerImage.setUrl(this.f36497s.get(i4).getPic_remote());
                    this.f36505z.add(bannerImage);
                    simpleDraweeView.setOnClickListener(new a(list));
                }
                this.A.removeAllViews();
                this.B = new ImageView[this.f36497s.size()];
                int i5 = 0;
                while (true) {
                    ImageView[] imageViewArr = this.B;
                    if (i5 >= imageViewArr.length) {
                        break;
                    }
                    if (i5 <= 8) {
                        imageViewArr[i5] = new ImageView(this.f36495q);
                        getResources().getDimensionPixelSize(R.dimen.wdp8);
                        isAdded();
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 81;
                        int i6 = this.D1;
                        layoutParams.setMargins(i6, 0, i6, 0);
                        this.B[i5].setLayoutParams(layoutParams);
                        if (i5 == 0) {
                            this.B[i5].setBackgroundResource(R.drawable.pointselected);
                        } else {
                            this.B[i5].setBackgroundResource(R.drawable.pointnormal);
                        }
                        this.A.addView(this.B[i5]);
                    }
                    i5++;
                }
                ArrayList<BannerImage> arrayList = this.f36505z;
                if (arrayList == null || arrayList.size() == 0) {
                    return;
                }
                this.N.setVisibility(4);
                this.f27420c.setVisibility(0);
                if (this.f36505z.size() == 1) {
                    SimpleDraweeView imageView = this.f36505z.get(0).getImageView();
                    MyImageLoader.h(imageView, this.f36505z.get(0).getUrl());
                    this.N.addView(imageView);
                    this.N.setVisibility(0);
                    this.f27420c.setVisibility(4);
                } else if (this.f36496r == null) {
                    BannerImageAdapter2 bannerImageAdapter22 = new BannerImageAdapter2(this.f36495q, this.f36505z);
                    this.f36496r = bannerImageAdapter22;
                    this.f27420c.setAdapter(bannerImageAdapter22);
                    this.f27420c.getAdapter().notifyDataSetChanged();
                    this.f27420c.setCurrentItem(0);
                } else {
                    this.f27420c.removeAllViews();
                    BannerImageAdapter2 bannerImageAdapter23 = new BannerImageAdapter2(this.f36495q, this.f36505z);
                    this.f36496r = bannerImageAdapter23;
                    this.f27420c.setAdapter(bannerImageAdapter23);
                    this.f36496r.b(this.f36505z);
                    this.f27420c.getAdapter().notifyDataSetChanged();
                    this.f27420c.setCurrentItem(0);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void u0() {
        List<RecomDatabean> data;
        try {
            ResultMainBean<List<RecomDatabean>> l12 = this.f36483g.l1(RequestBeanUtil.getInstance(this.f36495q).getRequestPnAndPc(1, 1));
            if (l12 == null || l12.getFlag() != 1 || (data = l12.getMessages().getData()) == null || data.size() <= 0) {
                return;
            }
            this.f36501v1 = data.get(0).getSub().get(0).getLink_type_val();
        } catch (Exception unused) {
        }
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
        N0();
        m1();
     */
    @org.androidannotations.annotations.UiThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u1(java.lang.String r8) {
        /*
            r7 = this;
            java.util.List<com.join.mgps.dto.MgpapaMainItemBean> r0 = r7.I
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
            r7.N0()
            r7.m1()
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
            r7.N0()
            r7.m1()
            goto L6
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.PapaMainFragment.u1(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v1(PAPAHomeBeanV6 pAPAHomeBeanV6, String str, int i4, boolean z4) {
        List<RecomDatabean> list;
        List<RecomDatabean> list2;
        List<RecomDatabean> list3;
        try {
            MGMainActivity mGMainActivity = (MGMainActivity) getActivity();
            if (mGMainActivity != null) {
                mGMainActivity.setHomeTabImage(true);
            }
            new MgpapaMainItemBean();
            int i5 = 3;
            List<RecomDatabeanBusiness> list4 = null;
            if (i4 == 1) {
                this.Y.getLists().clear();
                this.I.clear();
                List<BannerBean> banner = pAPAHomeBeanV6.getBanner();
                GameDiscoverChannelBean discover_channel = pAPAHomeBeanV6.getDiscover_channel();
                List<RecomDatabean> all_in_play = pAPAHomeBeanV6.getAll_in_play();
                if (discover_channel != null) {
                    list = discover_channel.getD_discover();
                    list2 = discover_channel.getS_channel();
                    list3 = discover_channel.getBroadcast();
                } else {
                    list = null;
                    list2 = null;
                    list3 = null;
                }
                t1(banner);
                j1(pAPAHomeBeanV6.fast_entry, true);
                MgpapaMainItemBean mgpapaMainItemBean = new MgpapaMainItemBean();
                mgpapaMainItemBean.setShowtype(1);
                mgpapaMainItemBean.setRecomDatabeans(S0(list, null));
                mgpapaMainItemBean.setRecomDatabeans2(S0(list3, null));
                mgpapaMainItemBean.setRecomDatabeans3(S0(list2, null));
                if (discover_channel != null) {
                    mgpapaMainItemBean.setObject(discover_channel.getThe_new());
                }
                this.I.add(mgpapaMainItemBean);
                if (all_in_play != null && all_in_play.size() > 0) {
                    MgpapaMainItemBean mgpapaMainItemBean2 = new MgpapaMainItemBean();
                    mgpapaMainItemBean2.setShowtype(2);
                    mgpapaMainItemBean2.setRecomDatabeanLeft(R0(all_in_play.get(0)));
                    mgpapaMainItemBean2.setMoreType(0);
                    h1(all_in_play, 11701, 11701);
                    List<RecomDatabeanBusiness> S0 = S0(all_in_play, null);
                    this.C.addAll(S0);
                    this.I.add(mgpapaMainItemBean2);
                    int i6 = 0;
                    while (i6 < all_in_play.size()) {
                        MgpapaMainItemBean mgpapaMainItemBean3 = new MgpapaMainItemBean();
                        mgpapaMainItemBean3.setShowtype(3);
                        mgpapaMainItemBean3.setMoreType(i6);
                        StringBuilder sb = new StringBuilder();
                        sb.append("4-");
                        int i7 = i6 + 1;
                        sb.append(i7);
                        sb.append("-");
                        mgpapaMainItemBean3.setMoreType2(sb.toString());
                        mgpapaMainItemBean3.setRecomDatabeanLeft(S0.get(i6));
                        i1(mgpapaMainItemBean3);
                        this.I.add(mgpapaMainItemBean3);
                        i6 = i7;
                    }
                    if (!z4) {
                        return;
                    }
                }
                GameinterestingBean simulator_channel = pAPAHomeBeanV6.getSimulator_channel();
                if (simulator_channel != null && simulator_channel.getMiddle() != null && simulator_channel.getMiddle().size() > 0) {
                    MgpapaMainItemBean mgpapaMainItemBean4 = new MgpapaMainItemBean();
                    mgpapaMainItemBean4.setShowtype(2);
                    List<RecomDatabeanBusiness> S02 = S0(simulator_channel.getTop(), null);
                    if (S02 != null && S02.size() > 0) {
                        mgpapaMainItemBean4.setRecomDatabeanLeft(S02.get(0));
                    }
                    mgpapaMainItemBean4.setRecomDatabeans2(S0(simulator_channel.getMore(), null));
                    mgpapaMainItemBean4.setMoreType(6);
                    this.I.add(mgpapaMainItemBean4);
                    h1(simulator_channel.getMiddle(), 11702, 11702);
                    h1(simulator_channel.getTop(), 11702, 11702);
                    k1(simulator_channel.getMiddle(), simulator_channel.getTop(), "7-");
                }
                new MgpapaMainItemBean();
                GameinterestingBean new_online_game = pAPAHomeBeanV6.getNew_online_game();
                if (new_online_game != null && new_online_game.getMiddle() != null && new_online_game.getMiddle().size() > 0) {
                    MgpapaMainItemBean mgpapaMainItemBean5 = new MgpapaMainItemBean();
                    mgpapaMainItemBean5.setShowtype(2);
                    List<RecomDatabeanBusiness> S03 = S0(new_online_game.getTop(), null);
                    if (S03 != null && S03.size() > 0) {
                        mgpapaMainItemBean5.setRecomDatabeanLeft(S03.get(0));
                    }
                    mgpapaMainItemBean5.setRecomDatabeans2(S0(new_online_game.getMore(), null));
                    mgpapaMainItemBean5.setMoreType(4);
                    mgpapaMainItemBean5.setMoreType2("5-0-0");
                    this.I.add(mgpapaMainItemBean5);
                    h1(new_online_game.getMiddle(), 11703, 11703);
                    h1(new_online_game.getTop(), 11703, 11703);
                    k1(new_online_game.getMiddle(), new_online_game.getTop(), "5-");
                }
                if (pAPAHomeBeanV6.getGame_ranking() != null && pAPAHomeBeanV6.getGame_ranking().getRanking_title() != null) {
                    MgpapaMainItemBean mgpapaMainItemBean6 = new MgpapaMainItemBean();
                    mgpapaMainItemBean6.setShowtype(24);
                    mgpapaMainItemBean6.setObject(pAPAHomeBeanV6.getGame_ranking());
                    this.I.add(mgpapaMainItemBean6);
                }
                if (pAPAHomeBeanV6.getHot_game_fav() != null) {
                    MgpapaMainItemBean mgpapaMainItemBean7 = new MgpapaMainItemBean();
                    mgpapaMainItemBean7.setShowtype(2);
                    mgpapaMainItemBean7.setMoreType(10);
                    this.I.add(mgpapaMainItemBean7);
                    MgpapaMainItemBean mgpapaMainItemBean8 = new MgpapaMainItemBean();
                    mgpapaMainItemBean8.setShowtype(25);
                    mgpapaMainItemBean8.setObject(pAPAHomeBeanV6.getHot_game_fav());
                    this.I.add(mgpapaMainItemBean8);
                }
            }
            if (this.f36501v1.equals("26")) {
                this.V = this.I.size();
            }
            pAPAHomeBeanV6.getGame_broadcast();
            List<GameinterestingBean> dynamic_module = pAPAHomeBeanV6.getDynamic_module();
            if (i4 == 1) {
                if (this.f36501v1.equals("27") || this.V == 0) {
                    this.V = this.I.size();
                }
                this.B1 = 0;
            }
            if (dynamic_module != null) {
                for (GameinterestingBean gameinterestingBean : dynamic_module) {
                    this.B1++;
                    new MgpapaMainItemBean();
                    List<RecomDatabean> top = gameinterestingBean.getTop();
                    List<RecomDatabean> middle = gameinterestingBean.getMiddle();
                    h1(top, 11700, 11700);
                    h1(middle, 11700, 11700);
                    List<RecomDatabeanBusiness> S04 = S0(middle, list4);
                    this.C.addAll(S04);
                    switch (gameinterestingBean.getDynamic_module_tpl_type()) {
                        case 1:
                        case 8:
                            MgpapaMainItemBean mgpapaMainItemBean9 = new MgpapaMainItemBean();
                            mgpapaMainItemBean9.setShowtype(19);
                            mgpapaMainItemBean9.setMoreType(1);
                            if (top != null) {
                                try {
                                    if (top.size() > 0 && top.get(0).getSub() != null && top.get(0).getSub().size() > 0) {
                                        mgpapaMainItemBean9.setMoreType(2);
                                        mgpapaMainItemBean9.setRecomDatabeanLeft(R0(top.get(0)));
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            this.I.add(mgpapaMainItemBean9);
                            if (middle != null) {
                                for (int i8 = 0; i8 < middle.size(); i8++) {
                                    MgpapaMainItemBean mgpapaMainItemBean10 = new MgpapaMainItemBean();
                                    if (gameinterestingBean.getDynamic_module_tpl_type() == 1) {
                                        mgpapaMainItemBean10.setReMarks(this.B1 + "-" + (i8 + 1));
                                    }
                                    if (i8 == 0) {
                                        mgpapaMainItemBean10.setShowtype(13);
                                        mgpapaMainItemBean10.setRecomDatabeanLeft(S04.get(0));
                                        mgpapaMainItemBean10.setMoreType2("0-" + this.B1 + "-1-x");
                                        i1(mgpapaMainItemBean10);
                                        this.I.add(mgpapaMainItemBean10);
                                    } else {
                                        mgpapaMainItemBean10.setShowtype(3);
                                        mgpapaMainItemBean10.setRecomDatabeanLeft(S04.get(i8));
                                        mgpapaMainItemBean10.setMoreType2("0-" + this.B1 + "-1-" + (i8 + 1) + "-");
                                        i1(mgpapaMainItemBean10);
                                        this.I.add(mgpapaMainItemBean10);
                                    }
                                }
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 2:
                        case 9:
                            MgpapaMainItemBean mgpapaMainItemBean11 = new MgpapaMainItemBean();
                            mgpapaMainItemBean11.setShowtype(19);
                            mgpapaMainItemBean11.setMoreType(1);
                            mgpapaMainItemBean11.setRecomDatabeanLeft(R0(top.get(0)));
                            this.I.add(mgpapaMainItemBean11);
                            for (int i9 = 0; i9 < middle.size(); i9++) {
                                MgpapaMainItemBean mgpapaMainItemBean12 = new MgpapaMainItemBean();
                                if (gameinterestingBean.getDynamic_module_tpl_type() == 2) {
                                    mgpapaMainItemBean12.setReMarks(this.B1 + "-" + (i9 + 1));
                                }
                                if (i9 == 0) {
                                    mgpapaMainItemBean12.setShowtype(13);
                                    mgpapaMainItemBean12.setRecomDatabeanLeft(S04.get(0));
                                    mgpapaMainItemBean12.setMoreType2("0-" + this.B1 + "-2-x");
                                    i1(mgpapaMainItemBean12);
                                    this.I.add(mgpapaMainItemBean12);
                                }
                            }
                            break;
                        case 3:
                        case 10:
                            MgpapaMainItemBean mgpapaMainItemBean13 = new MgpapaMainItemBean();
                            mgpapaMainItemBean13.setShowtype(19);
                            mgpapaMainItemBean13.setMoreType(1);
                            mgpapaMainItemBean13.setRecomDatabeanLeft(R0(top.get(0)));
                            this.I.add(mgpapaMainItemBean13);
                            ArrayList arrayList = new ArrayList();
                            for (int i10 = 0; i10 < middle.size(); i10++) {
                                if (i10 == 0) {
                                    MgpapaMainItemBean mgpapaMainItemBean14 = new MgpapaMainItemBean();
                                    mgpapaMainItemBean14.setShowtype(13);
                                    mgpapaMainItemBean14.setRecomDatabeanLeft(S04.get(0));
                                    mgpapaMainItemBean14.setMoreType2("0-" + this.B1 + "-3-x");
                                    i1(mgpapaMainItemBean14);
                                    this.I.add(mgpapaMainItemBean14);
                                } else {
                                    S04.get(i10).e("0-" + this.B1 + "-3-" + (i10 + 1) + "-");
                                    arrayList.add(S04.get(i10));
                                }
                            }
                            MgpapaMainItemBean mgpapaMainItemBean15 = new MgpapaMainItemBean();
                            mgpapaMainItemBean15.setShowtype(5);
                            mgpapaMainItemBean15.setRecomDatabeans(arrayList);
                            this.I.add(mgpapaMainItemBean15);
                            break;
                        case 4:
                        case 11:
                            MgpapaMainItemBean mgpapaMainItemBean16 = new MgpapaMainItemBean();
                            mgpapaMainItemBean16.setShowtype(19);
                            mgpapaMainItemBean16.setMoreType(1);
                            mgpapaMainItemBean16.setRecomDatabeanLeft(R0(top.get(0)));
                            this.I.add(mgpapaMainItemBean16);
                            int i11 = 0;
                            while (i11 < middle.size()) {
                                MgpapaMainItemBean mgpapaMainItemBean17 = new MgpapaMainItemBean();
                                mgpapaMainItemBean17.setShowtype(i5);
                                mgpapaMainItemBean17.setRecomDatabeanLeft(S04.get(i11));
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("0-");
                                sb2.append(this.B1);
                                sb2.append("-4-");
                                i11++;
                                sb2.append(i11);
                                sb2.append("-");
                                mgpapaMainItemBean17.setMoreType2(sb2.toString());
                                this.I.add(mgpapaMainItemBean17);
                            }
                            break;
                        case 5:
                        case 12:
                            MgpapaMainItemBean mgpapaMainItemBean18 = new MgpapaMainItemBean();
                            mgpapaMainItemBean18.setShowtype(19);
                            mgpapaMainItemBean18.setMoreType(1);
                            mgpapaMainItemBean18.setRecomDatabeanLeft(R0(top.get(0)));
                            this.I.add(mgpapaMainItemBean18);
                            for (int i12 = 0; i12 < middle.size(); i12++) {
                                if (i12 == 0) {
                                    MgpapaMainItemBean mgpapaMainItemBean19 = new MgpapaMainItemBean();
                                    mgpapaMainItemBean19.setShowtype(16);
                                    mgpapaMainItemBean19.setRecomDatabeanLeft(S04.get(0));
                                    mgpapaMainItemBean19.setMoreType2("0-" + this.B1 + "-5-1-");
                                    this.I.add(mgpapaMainItemBean19);
                                }
                            }
                            break;
                        case 6:
                        case 13:
                            MgpapaMainItemBean mgpapaMainItemBean20 = new MgpapaMainItemBean();
                            mgpapaMainItemBean20.setShowtype(19);
                            mgpapaMainItemBean20.setMoreType(1);
                            mgpapaMainItemBean20.setRecomDatabeanLeft(R0(top.get(0)));
                            this.I.add(mgpapaMainItemBean20);
                            MgpapaMainItemBean mgpapaMainItemBean21 = new MgpapaMainItemBean();
                            mgpapaMainItemBean21.setShowtype(18);
                            mgpapaMainItemBean21.setRecomDatabeans(S04);
                            mgpapaMainItemBean21.setMoreType2("0-" + this.B1 + "-6-");
                            this.I.add(mgpapaMainItemBean21);
                            break;
                        case 7:
                        case 14:
                            MgpapaMainItemBean mgpapaMainItemBean22 = new MgpapaMainItemBean();
                            mgpapaMainItemBean22.setShowtype(21);
                            this.I.add(mgpapaMainItemBean22);
                            for (int i13 = 0; i13 < middle.size(); i13++) {
                                if (i13 == 0) {
                                    MgpapaMainItemBean mgpapaMainItemBean23 = new MgpapaMainItemBean();
                                    mgpapaMainItemBean23.setShowtype(7);
                                    mgpapaMainItemBean23.setRecomDatabeanLeft(S04.get(i13));
                                    mgpapaMainItemBean23.setMoreType2("0-" + this.B1 + "-7-1");
                                    this.I.add(mgpapaMainItemBean23);
                                }
                            }
                            break;
                    }
                    i5 = 3;
                    list4 = null;
                }
            }
            if (this.f36501v1.equals("28")) {
                N0();
                H0();
            }
            MgpapaMainItemBean mgpapaMainItemBean24 = new MgpapaMainItemBean();
            if (i4 == 3) {
                if (!this.f36501v1.equals("28")) {
                    if (this.V == 0) {
                    }
                    mgpapaMainItemBean24.setShowtype(2);
                    mgpapaMainItemBean24.setMoreType(8);
                    this.I.add(mgpapaMainItemBean24);
                    this.C1 = 0;
                }
                this.V = this.I.size();
                mgpapaMainItemBean24.setShowtype(2);
                mgpapaMainItemBean24.setMoreType(8);
                this.I.add(mgpapaMainItemBean24);
                this.C1 = 0;
            }
            h1(pAPAHomeBeanV6.getGuess_you_like(), 11705, 11705);
            List<RecomDatabeanBusiness> S05 = S0(pAPAHomeBeanV6.getGuess_you_like(), null);
            this.C.addAll(S05);
            if (S05 != null) {
                for (int i14 = 0; i14 < S05.size(); i14++) {
                    if (i14 != 0 && i14 % 2 != 0) {
                        mgpapaMainItemBean24.setRecomDatabeanRight(S05.get(i14));
                        mgpapaMainItemBean24.setShowtype(9);
                        int i15 = this.C1 + 1;
                        this.C1 = i15;
                        mgpapaMainItemBean24.setMoreType(i15);
                        this.I.add(mgpapaMainItemBean24);
                    }
                    mgpapaMainItemBean24 = new MgpapaMainItemBean();
                    mgpapaMainItemBean24.setRecomDatabeanLeft(S05.get(i14));
                }
            }
            if (S05 != null && S05.size() != 0 && S05.size() % 2 == 1) {
                MgpapaMainItemBean mgpapaMainItemBean25 = new MgpapaMainItemBean();
                mgpapaMainItemBean25.setRecomDatabeanLeft(S05.get(S05.size() - 1));
                mgpapaMainItemBean25.setShowtype(9);
                int i16 = this.C1 + 1;
                this.C1 = i16;
                mgpapaMainItemBean25.setMoreType(i16);
                this.I.add(mgpapaMainItemBean25);
            }
            x1(this.C);
            this.H.Z(this.I);
            if (i4 == 1) {
                onScrollStateChanged(null, 0);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public CommonRequestBean w0() {
        return RequestBeanUtil.getInstance(this.f36495q).getFloatadRequestBean();
    }

    void x1(List<RecomDatabeanBusiness> list) {
        try {
            if (this.D == null || list == null || list.size() <= 0) {
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
                            DownloadTask downloadTask = this.D.get(mod_info.getMain_game_id());
                            boolean z5 = downloadTask != null && downloadTask.getStatus() == 5;
                            DownloadTask downloadTask2 = this.D.get(mod_info.getMod_game_id());
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
                                DownloadTask downloadTask3 = this.D.get(mod_info.getMod_game_id());
                                if (downloadTask3 == null) {
                                    downloadTask3 = this.D.get(game_info.getCrc_sign_id());
                                }
                                if (downloadTask3 != null && (downloadTask3.getCrc_link_type_val().equals(game_info.getCrc_sign_id()) || downloadTask3.getRef_crc_sign_id().equals(game_info.getCrc_sign_id()))) {
                                    recomDatabeanBusiness.d(downloadTask3);
                                }
                            }
                        } else {
                            DownloadTask downloadTask4 = this.D.get(game_info.getCrc_sign_id());
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
    @Background
    public void y0() {
        if (com.join.android.app.common.utils.j.j(this.f36495q)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f36495q).getAccountData();
                if (accountData == null) {
                    return;
                }
                ResultMainBean<List<VipPopData>> R0 = this.f36483g.R0(RequestBeanUtil.getInstance(this.f36495q).vipMessage(accountData.getUid()));
                if (R0 != null && R0.getFlag() == 1) {
                    List<VipPopData> data = R0.getMessages().getData();
                    if (data != null && data.size() > 0) {
                        p1(data);
                    } else {
                        B1();
                    }
                } else {
                    B1();
                }
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                B1();
                return;
            }
        }
        B1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void y1() {
        XListView2 xListView2 = this.f36480d;
        if (xListView2 != null) {
            xListView2.v();
            this.f36480d.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.papa.maintab.clicked"})
    public void z0(Intent intent) {
        if (this.N1) {
            this.f36480d.setSelection(this.V + 1);
        } else {
            this.f36480d.setSelection(0);
        }
    }
}
