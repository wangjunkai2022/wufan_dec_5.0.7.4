package com.join.mgps.activity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.collection.SimpleArrayMap;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.MApplication;
import com.beizi.fusion.widget.TwistView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.album.lib.ImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.a0;
import com.join.mgps.activity.MyGamePapaFragmentV2;
import com.join.mgps.activity.mygame.data.DataGameListBean;
import com.join.mgps.activity.mygame.dialog.WufunGameDownFirstNotPermissDialog_;
import com.join.mgps.activity.recomend.GamedownRecomendItemBean;
import com.join.mgps.adapter.o2;
import com.join.mgps.basefragment.BaseLoadingFragment;
import com.join.mgps.broadcast.NetBroadcastReceiver;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.LoadingLayout;
import com.join.mgps.customview.WrapContentGridView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.customview.m;
import com.join.mgps.customview.q;
import com.join.mgps.customview.u;
import com.join.mgps.customview.v;
import com.join.mgps.customview.x;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.GInfoBean;
import com.join.mgps.dto.GameSortBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.OnlineCouponConfigBean;
import com.join.mgps.dto.PayTagInfo;
import com.join.mgps.dto.QueryDownloadInfoRequestArgs;
import com.join.mgps.dto.RecommendGameAdInfo;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.SNKGameInfoBean;
import com.join.mgps.dto.TipBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.receiver.ShortcutReceiver;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
@EFragment(R.layout.fragment_my_game)
/* loaded from: classes.dex */
public class MyGamePapaFragmentV2 extends BaseLoadingFragment implements o2.e, AbsListView.OnScrollListener {
    public static final String A1 = "单机";
    public static final String B1 = "对战";
    public static final String C1 = "全部游戏";

    /* renamed from: v1  reason: collision with root package name */
    public static final String f35828v1 = "网游";
    private OnlineCouponConfigBean I;
    long J;
    com.join.mgps.rpc.e K;
    @Pref
    PrefDef_ L;
    private RecommendGameAdInfo M;
    private DownloadTask N;
    private j R;
    String S;
    com.join.mgps.customview.u T;
    DataGameListBean X;

    /* renamed from: c  reason: collision with root package name */
    private Context f35829c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    View f35830d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    XListView2 f35831e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    View f35832f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f35833g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f35834h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    View f35835i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    View f35836j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f35837k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f35838l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f35839m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    View f35840n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    View f35841o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    View f35842p;

    /* renamed from: p1  reason: collision with root package name */
    private NetBroadcastReceiver f35844p1;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    View f35845q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    View f35846r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    WrapContentGridView f35847s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    LinearLayout f35848t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    TextView f35849u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    ImageView f35850v;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    ViewPager2 f35851w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    TabLayout f35852x;

    /* renamed from: y  reason: collision with root package name */
    k f35853y;

    /* renamed from: z  reason: collision with root package name */
    com.join.mgps.adapter.o2 f35854z;
    List<String> A = new ArrayList();
    List<String> B = new ArrayList();
    HashMap<String, Boolean> C = new HashMap<>();
    HashMap<String, Boolean> D = new HashMap<>();
    private List<DownloadTask> E = new ArrayList();
    private int F = 0;
    com.join.mgps.pref.f G = null;
    private boolean H = false;
    private boolean O = false;
    private boolean P = true;
    private int Q = 0;
    private List<String> U = new ArrayList();
    private int V = 0;
    private int W = 0;
    private List<CollectionBeanSubBusiness> Y = new ArrayList();
    private List<CollectionBeanSubBusiness> Z = new ArrayList();

    /* renamed from: p0  reason: collision with root package name */
    long f35843p0 = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements a0.n0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OnlineCouponConfigBean f35856a;

        a(OnlineCouponConfigBean onlineCouponConfigBean) {
            this.f35856a = onlineCouponConfigBean;
        }

        @Override // com.join.mgps.Util.a0.n0
        public boolean a(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
            return false;
        }

        @Override // com.join.mgps.Util.a0.n0
        public void onCancel() {
        }

        @Override // com.join.mgps.Util.a0.n0
        public void onDismiss() {
            if (!this.f35856a.isTabSwitch() || MyGamePapaFragmentV2.this.H) {
                return;
            }
            MyGamePapaFragmentV2.this.f35849u.setText(this.f35856a.getTabHint());
            MyGamePapaFragmentV2.this.f35848t.setVisibility(0);
            com.papa.sim.statistic.p.l(MyGamePapaFragmentV2.this.f35829c).Q1(Event.tabStartViewSuccessTips, AccountUtil_.getInstance_(MyGamePapaFragmentV2.this.f35829c).getAccountData().getUid());
        }
    }

    /* loaded from: classes4.dex */
    class b implements TabLayout.OnTabSelectedListener {
        b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab == null || tab.getCustomView() == null) {
                return;
            }
            View customView = tab.getCustomView();
            TextView textView = (TextView) customView.findViewById(R.id.name);
            textView.setTextSize(0, MyGamePapaFragmentV2.this.f35829c.getResources().getDimensionPixelSize(R.dimen.wdp28));
            textView.setTextColor(Color.parseColor("#262626"));
            textView.setTypeface(textView.getTypeface(), 1);
            ((TextView) customView.findViewById(R.id.count)).setVisibility(8);
            if (tab.getPosition() > 0) {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(MyGamePapaFragmentV2.this.f35829c).getAccountData();
                if (AccountUtil_.getInstance_(MyGamePapaFragmentV2.this.f35829c).isTourist() || accountData == null || TextUtils.isEmpty(accountData.getToken())) {
                    IntentUtil.getInstance().goLogin(MyGamePapaFragmentV2.this.f35829c);
                    TabLayout tabLayout = MyGamePapaFragmentV2.this.f35852x;
                    tabLayout.selectTab(tabLayout.getTabAt(0));
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            if (tab == null || tab.getCustomView() == null) {
                return;
            }
            View customView = tab.getCustomView();
            TextView textView = (TextView) customView.findViewById(R.id.name);
            textView.setTextSize(0, MyGamePapaFragmentV2.this.f35829c.getResources().getDimensionPixelSize(R.dimen.wdp24));
            textView.setTextColor(Color.parseColor("#989898"));
            textView.setTypeface(null, 0);
            ((TextView) customView.findViewById(R.id.count)).setVisibility(8);
        }
    }

    /* loaded from: classes4.dex */
    class c extends ViewPager2.OnPageChangeCallback {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i4) {
            MyGamePapaFavVpFragment_ myGamePapaFavVpFragment_;
            super.onPageSelected(i4);
            if (i4 == 1) {
                if (MyGamePapaFragmentV2.this.R != null && MyGamePapaFragmentV2.this.R.b(i4) != null && (MyGamePapaFragmentV2.this.R.b(i4) instanceof MyGamePapaFavVpFragment_) && (myGamePapaFavVpFragment_ = (MyGamePapaFavVpFragment_) MyGamePapaFragmentV2.this.R.b(i4)) != null) {
                    myGamePapaFavVpFragment_.f0(true);
                }
                com.papa.sim.statistic.p.l(MyGamePapaFragmentV2.this.f35829c).O1(Event.clickFavoritesBtn, new Ext());
            }
        }
    }

    /* loaded from: classes4.dex */
    class d implements TabLayoutMediator.TabConfigurationStrategy {
        d() {
        }

        @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
        public void onConfigureTab(@NonNull TabLayout.Tab tab, int i4) {
            if (i4 == 0) {
                tab.setCustomView(LayoutInflater.from(MyGamePapaFragmentV2.this.f35829c).inflate(R.layout.papa_game_fav_tab1, (ViewGroup) null));
            } else if (i4 == 1) {
                tab.setCustomView(LayoutInflater.from(MyGamePapaFragmentV2.this.f35829c).inflate(R.layout.papa_game_fav_tab2, (ViewGroup) null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements Comparator<DownloadTask> {
        e() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(DownloadTask downloadTask, DownloadTask downloadTask2) {
            if (b(downloadTask.getStatus())) {
                return (!b(downloadTask2.getStatus()) || downloadTask2.getStartTime() <= downloadTask.getStartTime()) ? -1 : 1;
            } else if (b(downloadTask2.getStatus())) {
                return 1;
            } else {
                if (c(downloadTask.getStatus()) && !d(downloadTask)) {
                    return (!c(downloadTask2.getStatus()) || d(downloadTask2) || downloadTask2.getFinishTime() <= downloadTask.getFinishTime()) ? -1 : 1;
                } else if (!c(downloadTask2.getStatus()) || d(downloadTask2)) {
                    return c(downloadTask.getStatus()) ? (!c(downloadTask2.getStatus()) || downloadTask2.getOpenTime() < downloadTask.getOpenTime()) ? -1 : 1 : c(downloadTask2.getStatus()) ? 1 : 0;
                } else {
                    return 1;
                }
            }
        }

        boolean b(int i4) {
            return i4 == 2 || i4 == 3 || i4 == 12 || i4 == 13 || i4 == 36 || i4 == 11 || i4 == 6 || i4 == 10 || i4 == 48;
        }

        boolean c(int i4) {
            return i4 == 5 || e(i4);
        }

        boolean d(DownloadTask downloadTask) {
            return downloadTask.isOpen();
        }

        boolean e(int i4) {
            return i4 == 9;
        }
    }

    /* loaded from: classes4.dex */
    class f implements x.a {
        f() {
        }

        @Override // com.join.mgps.customview.x.a
        public void a() {
            IntentUtil.getInstance().goDownloadSettingActivity(MyGamePapaFragmentV2.this.getContext());
        }

        @Override // com.join.mgps.customview.x.a
        public void b() {
            MyGamePapaFragmentV2.this.u1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements v.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f35863a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f35864b;

        g(String str, DownloadTask downloadTask) {
            this.f35863a = str;
            this.f35864b = downloadTask;
        }

        @Override // com.join.mgps.customview.v.a
        public void a(String str) {
            DownloadTask F = p1.f.K().F(this.f35863a);
            boolean z4 = false;
            if (F == null) {
                IntentUtil.getInstance().goGameDetialActivity(MyGamePapaFragmentV2.this.f35829c, this.f35863a, 0);
                return;
            }
            if (com.join.mgps.Util.g2.i(F.getMod_info())) {
                ModInfoBean modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(F.getMod_info(), ModInfoBean.class);
                DownloadTask F2 = modInfoBean != null ? p1.f.K().F(modInfoBean.getMain_game_id()) : null;
                if (F2 == null) {
                    F.setCrc_link_type_val(modInfoBean.getMain_game_id());
                } else {
                    F = F2;
                }
            }
            F.set_from_type(127);
            if (F.getSp_tag_info() != null && F.getSp_tag_info().getOut_game() != null) {
                z4 = true;
            }
            if ((TextUtils.isEmpty(F.getFileType()) || !F.getFileType().equals(Dtype.chajian.name())) && !z4) {
                IntentUtil.getInstance().goGameDetialActivityBYDownloadTAsk(MyGamePapaFragmentV2.this.getContext(), F);
            }
        }

        @Override // com.join.mgps.customview.v.a
        public void b(String str) {
            MyGamePapaFragmentV2.this.z1(p1.f.K().F(str));
        }

        @Override // com.join.mgps.customview.v.a
        public void c(String str) {
            if (p1.f.K().F(this.f35863a) == null) {
                MyGamePapaFragmentV2.this.b1(this.f35864b);
            } else {
                MyGamePapaFragmentV2.this.d1(str);
            }
        }

        @Override // com.join.mgps.customview.v.a
        public void d(String str) {
            new com.join.mgps.customview.n(MyGamePapaFragmentV2.this.getContext()).a(MyGamePapaFragmentV2.this.f35840n, str);
        }

        @Override // com.join.mgps.customview.v.a
        public void e(String str) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements Callback<ResponseModel<DataGameListBean>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f35866b;

        h(boolean z4) {
            this.f35866b = z4;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResponseModel<DataGameListBean>> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResponseModel<DataGameListBean>> call, Response<ResponseModel<DataGameListBean>> response) {
            if (response != null) {
                try {
                    ResponseModel<DataGameListBean> body = response.body();
                    if (body != null && body.getData() != null && this.f35866b) {
                        MyGamePapaFragmentV2.this.X = body.getData();
                        MyGamePapaFragmentV2.this.Z.clear();
                        List<GamedownRecomendItemBean> recommendList = body.getData().getRecommendList();
                        if (recommendList != null) {
                            for (int i4 = 0; i4 < recommendList.size() && i4 < 6; i4++) {
                                CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(recommendList.get(i4));
                                collectionBeanSubBusiness.setDownloadTask(p1.f.K().F(collectionBeanSubBusiness.getGame_id()));
                                MyGamePapaFragmentV2.this.Z.add(collectionBeanSubBusiness);
                            }
                            if (MyGamePapaFragmentV2.this.E == null || MyGamePapaFragmentV2.this.E.size() == 0) {
                                MyGamePapaFragmentV2.this.Y0();
                            }
                        }
                        List<GamedownRecomendItemBean> gameList = body.getData().getGameList();
                        if (gameList != null && gameList.size() > 0) {
                            MyGamePapaFragmentV2.this.B1(gameList);
                        }
                    }
                    RecommendGameAdInfo recAd = body.getData().getRecAd();
                    if (recAd != null) {
                        MyGamePapaFragmentV2.this.M = recAd;
                        MyGamePapaFragmentV2.this.Y0();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements NetBroadcastReceiver.a {
        i() {
        }

        @Override // com.join.mgps.broadcast.NetBroadcastReceiver.a
        public void a(int i4) {
            if (MyGamePapaFragmentV2.this.Y == null || MyGamePapaFragmentV2.this.Y.size() == 0 || !(MyGamePapaFragmentV2.this.E == null || MyGamePapaFragmentV2.this.F == MyGamePapaFragmentV2.this.E.size())) {
                if (MyGamePapaFragmentV2.this.E != null) {
                    MyGamePapaFragmentV2 myGamePapaFragmentV2 = MyGamePapaFragmentV2.this;
                    myGamePapaFragmentV2.F = myGamePapaFragmentV2.E.size();
                }
                MyGamePapaFragmentV2.this.F0(true);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j extends FragmentStateAdapter {

        /* renamed from: a  reason: collision with root package name */
        private List<String> f35869a;

        public j(@NonNull Fragment fragment, List<String> list) {
            super(fragment);
            this.f35869a = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Fragment b(int i4) {
            FragmentManager childFragmentManager = MyGamePapaFragmentV2.this.getChildFragmentManager();
            Fragment findFragmentByTag = childFragmentManager.findFragmentByTag(com.xinzhu.overmind.utils.helpers.f.f68332a + getItemId(i4));
            if (findFragmentByTag != null) {
                return findFragmentByTag;
            }
            return null;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public boolean containsItem(long j4) {
            long j5 = j4 - 1000;
            return j5 >= 0 && j5 < ((long) getItemCount());
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NonNull
        public Fragment createFragment(int i4) {
            MyGamePapaLocalFragment build = MyGamePapaLocalFragment_.v1().build();
            if (TextUtils.equals(this.f35869a.get(i4), "本机游戏")) {
                return MyGamePapaLocalFragment_.v1().build();
            }
            return TextUtils.equals(this.f35869a.get(i4), "我的收藏") ? MyGamePapaFavVpFragment_.m0().build() : build;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f35869a.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i4) {
            return i4 + 1000;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k extends BaseAdapter {

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            CollectionBeanSubBusiness f35872b;

            public a(CollectionBeanSubBusiness collectionBeanSubBusiness) {
                this.f35872b = collectionBeanSubBusiness;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Context context = view.getContext();
                DownloadTask downloadTask = this.f35872b.getDownloadTask();
                if (downloadTask == null) {
                    if (UtilsMy.o0(this.f35872b.getTag_info())) {
                        if (this.f35872b.getMod_info() == null) {
                            if (com.join.android.app.common.utils.e.l0(context).d(context, this.f35872b.getPackage_name())) {
                                APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, this.f35872b.getPackage_name());
                                if (!com.join.mgps.Util.g2.i(this.f35872b.getVer()) || l4.d() >= Integer.parseInt(this.f35872b.getVer())) {
                                    com.join.android.app.common.utils.e.l0(context);
                                    APKUtils.a0(context, this.f35872b.getPackage_name());
                                    return;
                                }
                            }
                        } else {
                            boolean d5 = com.join.android.app.common.utils.e.l0(context).d(context, this.f35872b.getPackage_name());
                            boolean F = com.join.mgps.va.overmind.d.o().F(this.f35872b.getPackage_name());
                            if (d5 || F) {
                                com.join.android.app.common.utils.e.l0(context);
                                APKUtils.V(context, this.f35872b.getMod_info());
                                return;
                            }
                        }
                    }
                    UtilsMy.Y0(context, this.f35872b);
                    return;
                }
                if (com.join.mgps.Util.g2.i(this.f35872b.getPlugin_num())) {
                    String plugin_num = this.f35872b.getPlugin_num();
                    if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                        IntentDateBean intentDateBean = new IntentDateBean();
                        intentDateBean.setLink_type(4);
                        intentDateBean.setLink_type_val(this.f35872b.getDown_url_remote());
                        UtilsMy.T2(downloadTask, context);
                        IntentUtil.getInstance().intentActivity(context, intentDateBean);
                        return;
                    }
                }
                int status = downloadTask != null ? downloadTask.getStatus() : 0;
                if (UtilsMy.w0(this.f35872b.getPay_tag_info(), this.f35872b.getCrc_sign_id()) > 0) {
                    status = 43;
                }
                if (status != 0) {
                    if (status != 13) {
                        if (status != 2) {
                            if (status != 3) {
                                if (status == 5) {
                                    UtilsMy.T3(context, downloadTask);
                                    return;
                                } else if (status != 6) {
                                    if (status != 7) {
                                        if (status == 42) {
                                            if (!com.join.android.app.common.utils.j.j(context)) {
                                                com.join.mgps.Util.l2.a(context).b("无网络连接");
                                                return;
                                            } else {
                                                UtilsMy.r4(context, downloadTask);
                                                return;
                                            }
                                        } else if (status != 43) {
                                            switch (status) {
                                                case 9:
                                                    if (!com.join.android.app.common.utils.j.j(context)) {
                                                        com.join.mgps.Util.l2.a(context).b("无网络连接");
                                                        return;
                                                    } else {
                                                        UtilsMy.I2(context, downloadTask);
                                                        return;
                                                    }
                                                case 10:
                                                    break;
                                                case 11:
                                                    UtilsMy.a4(downloadTask, context);
                                                    return;
                                                default:
                                                    return;
                                            }
                                        }
                                    }
                                }
                            }
                            com.php25.PDownload.d.c(downloadTask, context);
                            return;
                        }
                        com.php25.PDownload.d.i(downloadTask);
                        return;
                    }
                    com.php25.PDownload.d.l(context, downloadTask);
                    return;
                }
                UtilsMy.Y0(context, this.f35872b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class b {

            /* renamed from: a  reason: collision with root package name */
            public SimpleDraweeView f35874a;

            /* renamed from: b  reason: collision with root package name */
            public TextView f35875b;

            /* renamed from: c  reason: collision with root package name */
            public TextView f35876c;

            /* renamed from: d  reason: collision with root package name */
            public TextView f35877d;

            b() {
            }
        }

        k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b(CollectionBeanSubBusiness collectionBeanSubBusiness, View view) {
            IntentUtil.getInstance().goGameDetialActivity(view.getContext(), collectionBeanSubBusiness.getGame_id(), collectionBeanSubBusiness.getGame_info_tpl_type(), collectionBeanSubBusiness.getSp_tpl_two_position(), 0);
        }

        void c(TextView textView, View view, int i4, PayTagInfo payTagInfo, String str) {
            view.setEnabled(true);
            textView.setTextColor(-12802819);
            boolean z4 = UtilsMy.w0(payTagInfo, str) > 0;
            if (i4 == 3 && !z4) {
                textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
                textView.setTextSize(2, 12.0f);
                textView.setTextColor(-12802819);
                textView.setBackgroundResource(R.drawable.recom_blue_butn);
            } else if (i4 == 2 && !z4) {
                textView.setText("即将开放");
                textView.setTextSize(0, textView.getContext().getResources().getDimensionPixelSize(R.dimen.wdp22));
                textView.setTextColor(-7763575);
                view.setEnabled(false);
                textView.setBackgroundResource(R.drawable.recom_grey_butn);
            } else {
                if (payTagInfo == null || payTagInfo.getAmount_check() <= 0) {
                    textView.setText(textView.getResources().getString(R.string.download_status_download));
                } else {
                    textView.setText(textView.getResources().getString(R.string.pay_game_amount, payTagInfo.getPayGameAmount()));
                }
                textView.setTextSize(2, 13.0f);
                textView.setTextColor(-12802819);
                textView.setBackgroundResource(R.drawable.recom_blue_butn);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0060 A[Catch: Exception -> 0x03de, TRY_LEAVE, TryCatch #0 {Exception -> 0x03de, blocks: (B:3:0x0006, B:4:0x0019, B:6:0x0023, B:11:0x0039, B:13:0x0060, B:17:0x008e, B:19:0x0098, B:21:0x00a6, B:23:0x00b4, B:25:0x00ca, B:27:0x00d8, B:28:0x00f1, B:29:0x0112, B:30:0x0129, B:31:0x0140, B:55:0x017c, B:56:0x01b9, B:57:0x01f9, B:58:0x0214, B:59:0x0255, B:60:0x026e, B:61:0x0298, B:68:0x0309, B:69:0x030e, B:71:0x0337, B:72:0x035c, B:73:0x0380, B:74:0x039d, B:75:0x03a5, B:86:0x03d6, B:9:0x0034, B:62:0x02b4, B:64:0x02be, B:65:0x02e3), top: B:91:0x0006, inners: #1, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void d(com.join.mgps.activity.MyGamePapaFragmentV2.k.b r17, com.join.mgps.business.CollectionBeanSubBusiness r18) {
            /*
                Method dump skipped, instructions count: 1010
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MyGamePapaFragmentV2.k.d(com.join.mgps.activity.MyGamePapaFragmentV2$k$b, com.join.mgps.business.CollectionBeanSubBusiness):void");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (MyGamePapaFragmentV2.this.Z == null) {
                return 0;
            }
            return Math.min(9, MyGamePapaFragmentV2.this.Z.size());
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            if (MyGamePapaFragmentV2.this.Z == null) {
                return null;
            }
            return MyGamePapaFragmentV2.this.Z.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            b bVar;
            if (view != null) {
                bVar = (b) view.getTag();
            } else {
                b bVar2 = new b();
                View inflate = LayoutInflater.from(MyGamePapaFragmentV2.this.getContext()).inflate(R.layout.fragment_my_game_no_game_item, viewGroup, false);
                bVar2.f35874a = (SimpleDraweeView) inflate.findViewById(R.id.icon);
                bVar2.f35875b = (TextView) inflate.findViewById(R.id.name);
                bVar2.f35876c = (TextView) inflate.findViewById(R.id.size);
                bVar2.f35877d = (TextView) inflate.findViewById(R.id.install);
                inflate.setTag(bVar2);
                bVar = bVar2;
                view = inflate;
            }
            if (getItem(i4) == null) {
                return view;
            }
            final CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) getItem(i4);
            MyImageLoader.h(bVar.f35874a, collectionBeanSubBusiness.getIco_remote());
            bVar.f35875b.setText(collectionBeanSubBusiness.getGame_name());
            bVar.f35876c.setText(UtilsMy.a(TextUtils.isEmpty(collectionBeanSubBusiness.getSize()) ? 0L : (long) (Double.parseDouble(collectionBeanSubBusiness.getSize()) * 1024.0d * 1024.0d)));
            view.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.i2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MyGamePapaFragmentV2.k.b(CollectionBeanSubBusiness.this, view2);
                }
            });
            UtilsMy.d3(bVar.f35877d, collectionBeanSubBusiness);
            bVar.f35877d.setOnClickListener(new a(new CollectionBeanSubBusiness(collectionBeanSubBusiness)));
            d(bVar, collectionBeanSubBusiness);
            return view;
        }
    }

    private void B0(CommonGameInfoBean commonGameInfoBean) {
        XListView2 xListView2;
        if (this.O || (xListView2 = this.f35831e) == null || xListView2.getVisibility() != 0) {
            return;
        }
        this.O = true;
        Ext ext = new Ext();
        ext.setPage("tab");
        ext.setFrom("207");
        ext.setGameId(commonGameInfoBean.getG_info().getId());
        com.papa.sim.statistic.p.l(getContext()).k0(Event.expGameAdPage, ext, null);
    }

    private List<DownloadTask> D0() {
        if (TextUtils.isEmpty(this.S)) {
            return new ArrayList();
        }
        String str = this.S;
        if (com.join.mgps.Util.g2.i(str) && str.equals("全部游戏")) {
            TextView textView = this.f35838l;
            if (textView != null) {
                textView.setText("全部游戏");
            }
            return this.E;
        }
        ArrayList arrayList = new ArrayList();
        List<DownloadTask> list = this.E;
        if (list != null) {
            for (DownloadTask downloadTask : list) {
                if (V0(str, downloadTask)) {
                    arrayList.add(downloadTask);
                }
            }
        }
        return arrayList;
    }

    private void D1(OnlineCouponConfigBean onlineCouponConfigBean, int i4) {
        com.join.mgps.Util.b0.f0(this.f35829c).W(this.f35829c, onlineCouponConfigBean, i4, new a(onlineCouponConfigBean));
        com.papa.sim.statistic.p.l(this.f35829c).Q1(Event.tabStartSuccessUpRedBag, AccountUtil_.getInstance_(this.f35829c).getAccountData().getUid());
    }

    private void G0() {
        Bundle bundle = new Bundle();
        bundle.putInt("localType", 2);
        com.join.mgps.pref.f fVar = this.G;
        if (fVar != null) {
            fVar.callOnlineCoupon(bundle);
        }
        this.f35848t.setVisibility(8);
    }

    private void H1() {
    }

    private void I1() {
        DownloadTask downloadTask;
        View childAt;
        if (this.W < 0 || this.V >= this.f35831e.getCount()) {
            return;
        }
        for (int i4 = this.W; i4 <= this.V; i4++) {
            if (this.f35831e.getAdapter().getItemViewType(i4) == 2 && this.f35831e.getItemAtPosition(i4) != null && (this.f35831e.getItemAtPosition(i4) instanceof DownloadTask) && (downloadTask = (DownloadTask) this.f35831e.getItemAtPosition(i4)) != null && ((downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12) && (childAt = this.f35831e.getChildAt(i4 - this.W)) != null && childAt.getTag() != null && (childAt.getTag() instanceof o2.h))) {
                o2.h hVar = (o2.h) childAt.getTag();
                try {
                    DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                    if (f5 == null) {
                        return;
                    }
                    String str = "";
                    if (!TextUtils.isEmpty(f5.getShowSize())) {
                        long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                        str = downloadTask.getSize() == 0 ? UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble) : UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble);
                    }
                    if (downloadTask.getStatus() == 12) {
                        hVar.f45059b.setProgress((int) f5.getProgress());
                    } else {
                        hVar.f45059b.setProgress((int) f5.getProgress());
                    }
                    if (downloadTask.getStatus() == 2) {
                        hVar.f45060c.setText(str + " · " + f5.getSpeed() + "/S");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    private boolean K0(List<CommonGameInfoBean> list, CollectionBeanSubBusiness collectionBeanSubBusiness) {
        if (list != null && collectionBeanSubBusiness != null) {
            for (CommonGameInfoBean commonGameInfoBean : list) {
                if (commonGameInfoBean != null && commonGameInfoBean.getG_info() != null && TextUtils.equals(commonGameInfoBean.getG_info().getId(), collectionBeanSubBusiness.getGame_id())) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean L0(List<o2.f> list) {
        if (list != null && this.N != null) {
            for (o2.f fVar : list) {
                if ((fVar.a() instanceof DownloadTask) && TextUtils.equals(((DownloadTask) fVar.a()).getCrc_link_type_val(), this.N.getCrc_link_type_val())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0() {
        this.G.callbackHome(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0(String str) {
        this.S = str;
        this.f35838l.setText(str);
        Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0() {
        this.f35837k.setRotation(0.0f);
        G1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(boolean z4, String str, boolean z5, String str2) {
        if (z4) {
            A0(str);
        }
        if (z5) {
            z0(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T0(DownloadTask downloadTask, String str) {
        if (APKUtils.L(downloadTask) && com.join.mgps.va.overmind.d.o().F(downloadTask.getPackageName())) {
            A0(str);
        } else {
            z0(str);
        }
    }

    private void X0(CommonGameInfoBean commonGameInfoBean) {
        WrapContentGridView wrapContentGridView = this.f35847s;
        if (wrapContentGridView == null || wrapContentGridView.getVisibility() != 0) {
            return;
        }
        Ext ext = new Ext();
        ext.setPage("tab");
        ext.setFrom("208");
        ext.setGameId(commonGameInfoBean.getG_info().getId());
        com.papa.sim.statistic.p.l(getContext()).k0(Event.expGameAdPage, ext, null);
    }

    private void g1(DownloadTask downloadTask) {
        DownloadTask downloadTask2;
        List<CollectionBeanSubBusiness> list;
        loadData();
        Iterator<DownloadTask> it2 = this.E.iterator();
        while (true) {
            if (!it2.hasNext()) {
                downloadTask2 = null;
                break;
            }
            downloadTask2 = it2.next();
            if (!TextUtils.isEmpty(downloadTask2.getCrc_link_type_val()) && downloadTask2.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                downloadTask2.setStatus(0);
                it2.remove();
                break;
            }
        }
        if (downloadTask != null && (list = this.Z) != null && list.size() > 0) {
            Iterator<CollectionBeanSubBusiness> it3 = this.Z.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                CollectionBeanSubBusiness next = it3.next();
                if (next.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                    next.setDownloadTask(null);
                    break;
                }
            }
        }
        this.f35853y.notifyDataSetChanged();
        J1(downloadTask2);
        k1();
        Y0();
    }

    private void h1(DownloadTask downloadTask) {
        List<DownloadTask> list = this.E;
        if (list == null || downloadTask == null) {
            return;
        }
        DownloadTask downloadTask2 = null;
        try {
            Iterator<DownloadTask> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                DownloadTask next = it2.next();
                if (!TextUtils.isEmpty(next.getCrc_link_type_val()) && next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    UtilsMy.x4(next);
                    downloadTask2 = next;
                    break;
                }
            }
            J1(downloadTask2);
            Y0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        k1();
        Y0();
    }

    private void i1(DownloadTask downloadTask) {
        boolean z4;
        ModInfoBean modInfoBean;
        if (downloadTask == null) {
            return;
        }
        boolean z5 = true;
        if (!TextUtils.isEmpty(downloadTask.getFileType()) && downloadTask.getFileType().equals(Dtype.chajian.name())) {
            Y0();
            return;
        }
        UtilsMy.A4(this.E);
        Iterator<DownloadTask> it2 = this.E.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z5 = false;
                break;
            }
            DownloadTask next = it2.next();
            if (!com.join.mgps.Util.g2.i(next.getMod_info()) ? !(TextUtils.isEmpty(next.getCrc_link_type_val()) || !next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) : !((modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(next.getMod_info(), ModInfoBean.class)) == null || TextUtils.isEmpty(next.getCrc_link_type_val()) || !(next.getCrc_link_type_val().equals(modInfoBean.getMod_game_id()) || next.getCrc_link_type_val().equals(modInfoBean.getMain_game_id())))) {
                z4 = false;
                continue;
            } else {
                z4 = true;
                continue;
            }
            if (z4) {
                break;
            }
        }
        if (!z5) {
            this.E.add(0, downloadTask);
        }
        loadData();
        k1();
        Y0();
    }

    private void j1(DownloadTask downloadTask) {
        if (this.E == null || downloadTask == null) {
            return;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.E.size()) {
                downloadTask = null;
                break;
            }
            DownloadTask downloadTask2 = this.E.get(i4);
            if (!TextUtils.isEmpty(downloadTask2.getCrc_link_type_val()) && downloadTask2.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.E.set(i4, downloadTask);
                break;
            }
            i4++;
        }
        J1(downloadTask);
        loadData();
        k1();
        Y0();
        m1();
    }

    private void q1() {
    }

    private void t0(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("s:");
        sb.append(str);
        DownloadTask F = p1.f.K().F(str);
        if (F != null) {
            Bitmap m4 = ImageLoader.q().m(F.getPortraitURL());
            if (m4 == null) {
                m4 = t1(F.getPortraitURL());
            }
            com.join.mgps.Util.w1.c(getActivity(), F.getShowName(), str, m4);
        }
    }

    private Bitmap t1(String str) {
        if (com.join.mgps.Util.g2.h(str)) {
            return null;
        }
        try {
            return BitmapFactory.decodeFile(((e0.c) Fresco.getImagePipelineFactory().l().c(new com.facebook.cache.common.i(Uri.parse(str).toString()))).c().getPath());
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private CollectionBeanSubBusiness x0(CommonGameInfoBean commonGameInfoBean) {
        if (commonGameInfoBean == null || commonGameInfoBean.getG_info() == null) {
            return null;
        }
        GInfoBean g_info = commonGameInfoBean.getG_info();
        CollectionBeanSub collectionBeanSub = new CollectionBeanSub();
        collectionBeanSub.setGame_name(g_info.getName());
        collectionBeanSub.setIco_remote(TextUtils.isEmpty(g_info.getGif_ico()) ? g_info.getIco() : g_info.getGif_ico());
        collectionBeanSub.setSize(g_info.getApp_size());
        collectionBeanSub.setGame_id(g_info.getId());
        collectionBeanSub.setGame_info_tpl_type(g_info.getGame_info_tpl_type());
        collectionBeanSub.setSp_tpl_two_position(g_info.getSp_tpl_two_position());
        collectionBeanSub.set_from(commonGameInfoBean.get_from());
        collectionBeanSub.set_from_type(commonGameInfoBean.get_from_type());
        return new CollectionBeanSubBusiness(collectionBeanSub);
    }

    void A0(String str) {
        DownloadTask F = p1.f.K().F(str);
        if (F.getStatus() == 48) {
            com.join.mgps.Util.l2.a(getContext()).b("游戏安装中无法删除");
            return;
        }
        UtilsMy.O0(getContext(), F);
        y0(F);
        List<DownloadTask> D0 = D0();
        if (D0 == null || D0.size() == 0) {
            this.S = "全部游戏";
            this.f35838l.setText("全部游戏");
        }
        Y0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void A1(String str) {
        new com.join.android.app.common.dialog.d(this.f35829c, str).show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void B1(List<GamedownRecomendItemBean> list) {
        if (list == null) {
            return;
        }
        this.Y.clear();
        for (int i4 = 0; i4 < list.size() && i4 < 6; i4++) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(list.get(i4));
            collectionBeanSubBusiness.setDownloadTask(p1.f.K().F(collectionBeanSubBusiness.getGame_id()));
            this.Y.add(collectionBeanSubBusiness);
        }
        try {
            com.join.mgps.pref.h.n(getContext()).u0(JsonMapper.toJsonString(this.Y));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.join.mgps.adapter.o2 o2Var = this.f35854z;
        if (o2Var != null) {
            o2Var.L(true);
        }
        com.join.mgps.adapter.o2 o2Var2 = this.f35854z;
        if (o2Var2 != null) {
            o2Var2.K(true);
        }
        Y0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void C0() {
        if (this.T == null) {
            com.join.mgps.customview.u uVar = new com.join.mgps.customview.u(getContext());
            this.T = uVar;
            uVar.k(new u.d() { // from class: com.join.mgps.activity.h2
                @Override // com.join.mgps.customview.u.d
                public final void a(String str) {
                    MyGamePapaFragmentV2.this.Q0(str);
                }
            });
            this.T.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.join.mgps.activity.d2
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    MyGamePapaFragmentV2.this.R0();
                }
            });
            this.T.setWidth(-1);
        }
        this.f35832f.setVisibility(8);
        this.T.m(this.f35830d, this.B, this.S);
        this.f35837k.setRotation(180.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C1() {
        a0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void E0() {
        List<GameSortBean> data;
        try {
            ResultMainBean<List<GameSortBean>> B0 = this.K.B0(RequestBeanUtil.getInstance(this.f35829c).getGameSortRequestBean(com.join.android.app.common.utils.n.n(this.f35829c.getApplicationContext()).z(), ""));
            if (B0 != null && B0.getFlag() == 1 && B0.getMessages() != null && (data = B0.getMessages().getData()) != null && data.size() > 0) {
                this.A.clear();
                for (GameSortBean gameSortBean : data) {
                    if (gameSortBean.getName().contains("单机")) {
                        this.A.add("单机");
                    } else {
                        this.A.add(gameSortBean.getName());
                    }
                }
            }
            this.L.myGameAllTabSort().g(JsonMapper.getInstance().toJson(this.A));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E1() {
        try {
            a0();
            this.S = this.B.get(0);
            Y0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void F0(boolean z4) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!z4 || currentTimeMillis - this.f35843p0 >= com.join.mgps.data.c.f49010a) {
            this.f35843p0 = currentTimeMillis;
            try {
                if (com.join.android.app.common.utils.j.j(getContext())) {
                    String uid = AccountUtil_.getInstance_(this.f35829c).getUid();
                    String token = AccountUtil_.getInstance_(this.f35829c).getToken();
                    if (TextUtils.isEmpty(uid)) {
                        uid = "";
                    }
                    if (TextUtils.isEmpty(token)) {
                        token = "";
                    }
                    RequestModel<QueryDownloadInfoRequestArgs> requestModel = new RequestModel<>();
                    requestModel.setDefault(this.f35829c);
                    QueryDownloadInfoRequestArgs queryDownloadInfoRequestArgs = new QueryDownloadInfoRequestArgs();
                    queryDownloadInfoRequestArgs.setGameId("0");
                    queryDownloadInfoRequestArgs.setDataType("1");
                    queryDownloadInfoRequestArgs.setUid(uid);
                    queryDownloadInfoRequestArgs.setToken(token);
                    requestModel.setArgs(queryDownloadInfoRequestArgs);
                    com.join.mgps.rpc.impl.i.D0().B0().i1(requestModel).enqueue(new h(z4));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    void F1() {
        if (this.f35844p1 != null) {
            getContext().unregisterReceiver(this.f35844p1);
        }
    }

    void G1() {
        com.join.mgps.customview.u uVar = this.T;
        if (uVar != null && uVar.isShowing()) {
            this.f35832f.setVisibility(8);
            return;
        }
        List<DownloadTask> O = p1.f.K().O();
        if (O != null && O.size() > 0) {
            this.f35832f.setVisibility(0);
            DownloadTask downloadTask = O.get(0);
            TextView textView = this.f35833g;
            textView.setText(H0(downloadTask) + "插件正在下载中");
            TextView textView2 = this.f35834h;
            textView2.setText(downloadTask.getProgress() + "%");
            return;
        }
        this.f35832f.setVisibility(8);
    }

    String H0(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return "";
        }
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
        StringBuilder sb = new StringBuilder();
        ConstantIntEnum constantIntEnum = ConstantIntEnum.FBA;
        sb.append(constantIntEnum.value());
        sb.append("");
        simpleArrayMap.put(sb.toString(), constantIntEnum.nickName());
        StringBuilder sb2 = new StringBuilder();
        ConstantIntEnum constantIntEnum2 = ConstantIntEnum.FC;
        sb2.append(constantIntEnum2.value());
        sb2.append("");
        simpleArrayMap.put(sb2.toString(), constantIntEnum2.nickName());
        StringBuilder sb3 = new StringBuilder();
        ConstantIntEnum constantIntEnum3 = ConstantIntEnum.GBA;
        sb3.append(constantIntEnum3.value());
        sb3.append("");
        simpleArrayMap.put(sb3.toString(), constantIntEnum3.nickName());
        StringBuilder sb4 = new StringBuilder();
        ConstantIntEnum constantIntEnum4 = ConstantIntEnum.PSP;
        sb4.append(constantIntEnum4.value());
        sb4.append("");
        simpleArrayMap.put(sb4.toString(), constantIntEnum4.nickName());
        StringBuilder sb5 = new StringBuilder();
        ConstantIntEnum constantIntEnum5 = ConstantIntEnum.NDS;
        sb5.append(constantIntEnum5.value());
        sb5.append("");
        simpleArrayMap.put(sb5.toString(), constantIntEnum5.nickName());
        StringBuilder sb6 = new StringBuilder();
        ConstantIntEnum constantIntEnum6 = ConstantIntEnum.PS2;
        sb6.append(constantIntEnum6.value());
        sb6.append("");
        simpleArrayMap.put(sb6.toString(), constantIntEnum6.nickName());
        StringBuilder sb7 = new StringBuilder();
        ConstantIntEnum constantIntEnum7 = ConstantIntEnum.N3DS;
        sb7.append(constantIntEnum7.value());
        sb7.append("");
        simpleArrayMap.put(sb7.toString(), constantIntEnum7.nickName());
        StringBuilder sb8 = new StringBuilder();
        ConstantIntEnum constantIntEnum8 = ConstantIntEnum.GBC;
        sb8.append(constantIntEnum8.value());
        sb8.append("");
        simpleArrayMap.put(sb8.toString(), constantIntEnum8.nickName());
        StringBuilder sb9 = new StringBuilder();
        ConstantIntEnum constantIntEnum9 = ConstantIntEnum.MD;
        sb9.append(constantIntEnum9.value());
        sb9.append("");
        simpleArrayMap.put(sb9.toString(), constantIntEnum9.nickName());
        simpleArrayMap.put(constantIntEnum9.value() + "", constantIntEnum9.nickName());
        StringBuilder sb10 = new StringBuilder();
        ConstantIntEnum constantIntEnum10 = ConstantIntEnum.PS;
        sb10.append(constantIntEnum10.value());
        sb10.append("");
        simpleArrayMap.put(sb10.toString(), constantIntEnum10.nickName());
        StringBuilder sb11 = new StringBuilder();
        ConstantIntEnum constantIntEnum11 = ConstantIntEnum.SFC;
        sb11.append(constantIntEnum11.value());
        sb11.append("");
        simpleArrayMap.put(sb11.toString(), constantIntEnum11.nickName());
        StringBuilder sb12 = new StringBuilder();
        ConstantIntEnum constantIntEnum12 = ConstantIntEnum.WSC;
        sb12.append(constantIntEnum12.value());
        sb12.append("");
        simpleArrayMap.put(sb12.toString(), constantIntEnum12.nickName());
        StringBuilder sb13 = new StringBuilder();
        ConstantIntEnum constantIntEnum13 = ConstantIntEnum.N64;
        sb13.append(constantIntEnum13.value());
        sb13.append("");
        simpleArrayMap.put(sb13.toString(), constantIntEnum13.nickName());
        StringBuilder sb14 = new StringBuilder();
        ConstantIntEnum constantIntEnum14 = ConstantIntEnum.ONS;
        sb14.append(constantIntEnum14.value());
        sb14.append("");
        simpleArrayMap.put(sb14.toString(), constantIntEnum14.nickName());
        StringBuilder sb15 = new StringBuilder();
        ConstantIntEnum constantIntEnum15 = ConstantIntEnum.DC;
        sb15.append(constantIntEnum15.value());
        sb15.append("");
        simpleArrayMap.put(sb15.toString(), constantIntEnum15.nickName());
        StringBuilder sb16 = new StringBuilder();
        ConstantIntEnum constantIntEnum16 = ConstantIntEnum.H5;
        sb16.append(constantIntEnum16.value());
        sb16.append("");
        simpleArrayMap.put(sb16.toString(), constantIntEnum16.nickName());
        String romType = downloadTask.getRomType();
        if (TextUtils.isEmpty(romType)) {
            downloadTask.setRomType(downloadTask.getPlugin_num());
        }
        return simpleArrayMap.containsKey(romType) ? (String) simpleArrayMap.get(romType) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void I0() {
        if (com.join.android.app.common.utils.j.j(getActivity())) {
            try {
                ResultMainBean<SNKGameInfoBean> V = this.K.V(RequestBeanUtil.getInstance(getActivity()).getPreloadingADRequestBean());
                if (V == null || V.getCode() != 600) {
                    return;
                }
                x1(V.getMessages().getData());
            } catch (Exception e5) {
                StringBuilder sb = new StringBuilder();
                sb.append("e:");
                sb.append(e5.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void J0() {
        List<CollectionBeanSubBusiness> list;
        WrapContentGridView wrapContentGridView;
        if (this.f35853y != null) {
            RecommendGameAdInfo recommendGameAdInfo = this.M;
            if (recommendGameAdInfo != null && recommendGameAdInfo.getList() != null && this.M.getList().size() > 0 && (list = this.Z) != null && list.size() > 0 && (wrapContentGridView = this.f35847s) != null && wrapContentGridView.getVisibility() == 0) {
                List<CommonGameInfoBean> list2 = this.M.getList();
                CommonGameInfoBean commonGameInfoBean = list2.get(this.Q % list2.size());
                commonGameInfoBean.set_from(153);
                commonGameInfoBean.set_from_type(153);
                CollectionBeanSubBusiness x02 = x0(commonGameInfoBean);
                if (!K0(list2, this.Z.get(0))) {
                    this.Z.add(0, x02);
                    X0(commonGameInfoBean);
                } else if (!TextUtils.equals(commonGameInfoBean.getG_info().getId(), this.Z.get(0).getGame_id())) {
                    this.Z.set(0, x02);
                    X0(commonGameInfoBean);
                }
            }
            this.f35853y.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void J1(DownloadTask downloadTask) {
        List<CollectionBeanSubBusiness> list;
        if (downloadTask == null || (list = this.Z) == null || list.size() <= 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            if (i4 < this.Z.size()) {
                if (com.join.mgps.Util.g2.i(this.Z.get(i4).getGame_id()) && this.Z.get(i4).getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                    this.Z.get(i4).setDownloadTask(downloadTask);
                    break;
                }
                i4++;
            } else {
                break;
            }
        }
        J0();
    }

    void K1(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    i1(downloadTask);
                    G1();
                    return;
                case 3:
                    g1(downloadTask);
                    G1();
                    return;
                case 4:
                default:
                    return;
                case 5:
                    j1(downloadTask);
                    G1();
                    return;
                case 6:
                    h1(downloadTask);
                    G1();
                    return;
            }
        }
    }

    boolean M0(Context context, String str) {
        boolean z4 = false;
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.D.containsKey(str) && this.D.get(str) != null) {
            if (this.D.get(str) != null) {
                return this.D.get(str).booleanValue();
            }
            return false;
        }
        try {
            z4 = com.join.mgps.Util.g.e(context, str);
            this.D.put(str, Boolean.valueOf(z4));
            return z4;
        } catch (Exception e5) {
            e5.printStackTrace();
            return z4;
        }
    }

    boolean N0(DownloadTask downloadTask) {
        Iterator<TipBean> it2 = downloadTask.getTipBeans().iterator();
        while (it2.hasNext()) {
            TipBean next = it2.next();
            if (UtilsMy.v0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) <= 0 && next.getName().contains("单机")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void O0() {
        this.H = true;
        this.f35848t.setVisibility(8);
    }

    @Override // com.join.mgps.adapter.o2.e
    public void S(DownloadTask downloadTask) {
        z1(downloadTask);
        if (downloadTask == null || TextUtils.isEmpty(downloadTask.getCrc_link_type_val())) {
            return;
        }
        this.C.put(downloadTask.getCrc_link_type_val(), Boolean.TRUE);
    }

    @Override // com.join.mgps.adapter.o2.e
    public void T(String str, DownloadTask downloadTask) {
        Y(str, downloadTask);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void U0() {
        if (this.I != null) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(4);
            intentDateBean.setLink_type_val(this.I.getTabJumpUrl());
            ShareWebActivity_.t2(this.f35829c).b(intentDateBean).start();
            com.papa.sim.statistic.p.l(this.f35829c).Q1(Event.clickTabGameTipsUpRedBag, AccountUtil_.getInstance_(this.f35829c).getAccountData().getUid());
        }
    }

    boolean V0(String str, DownloadTask downloadTask) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (downloadTask.isFightFun() && "对战".equals(str)) {
            return true;
        }
        String H0 = H0(downloadTask);
        if (TextUtils.isEmpty(H0) || !H0.equals(str)) {
            Iterator<TipBean> it2 = downloadTask.getTipBeans().iterator();
            while (it2.hasNext()) {
                TipBean next = it2.next();
                if (UtilsMy.v0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) <= 0) {
                    if (next.getName().contains("网游") && str.equals(next.getName())) {
                        return true;
                    }
                    if (next.getName().contains("单机") && str.equals(next.getName())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected int W() {
        return R.layout.fragment_my_game;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void W0() {
        MyGameUpdateManagerActivity_.J0(getContext()).start();
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected int X() {
        return R.id.fragment_my_game;
    }

    @Override // com.join.mgps.adapter.o2.e
    public void Y(String str, DownloadTask downloadTask) {
        com.join.mgps.customview.v vVar = new com.join.mgps.customview.v(getContext());
        vVar.b(new g(str, downloadTask));
        vVar.c(this.f35840n, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0186, code lost:
        r5 = r11.M.getList().get(r4);
        r6 = r5.getG_info();
        r8 = new com.github.snowdream.android.app.downloader.DownloadTask();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a3, code lost:
        if (android.text.TextUtils.isEmpty(r6.getGif_ico()) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a5, code lost:
        r10 = r6.getIco();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01aa, code lost:
        r10 = r6.getGif_ico();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ae, code lost:
        r8.setPortraitURL(r10);
        r8.setShowName(r6.getName());
        r8.setStatus(0);
        r8.setCrc_link_type_val(r6.getId());
        r8.setTipBeans(new java.util.ArrayList<>(r6.getTag_info()));
        r6 = r11.f35854z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01d0, code lost:
        if (r6 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d2, code lost:
        r6.I(r5);
        r11.f35854z.M(r11.M.getCorner_mark_pic());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e0, code lost:
        r11.N = r8;
        r11.P = false;
        B0(r5);
        r5 = r11.L.myGameTabAdShowIndex();
        r5.g(r7 + "_" + r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c A[Catch: Exception -> 0x0207, LOOP:1: B:64:0x013c->B:85:0x0203, LOOP_LABEL: LOOP:1: B:64:0x013c->B:85:0x0203, LOOP_START, PHI: r4 
      PHI: (r4v13 int) = (r4v12 int), (r4v14 int) binds: [B:63:0x013a, B:85:0x0203] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x0207, blocks: (B:45:0x00dd, B:47:0x00e1, B:49:0x00e7, B:51:0x00f3, B:53:0x00f7, B:56:0x0117, B:58:0x011e, B:60:0x012a, B:62:0x0136, B:64:0x013c, B:66:0x0142, B:68:0x0150, B:70:0x015c, B:71:0x016e, B:73:0x0174, B:76:0x0186, B:78:0x01a5, B:80:0x01ae, B:82:0x01d2, B:83:0x01e0, B:79:0x01aa), top: B:107:0x00dd }] */
    @org.androidannotations.annotations.UiThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Y0() {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MyGamePapaFragmentV2.Y0():void");
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected int Z() {
        return com.join.mgps.Util.c0.a(getContext(), 48.0f);
    }

    public void Z0(String str) {
        this.C.put(str, Boolean.FALSE);
        Y0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void a1(HashMap<String, Boolean> hashMap) {
        DownloadTask downloadTask;
        com.join.mgps.adapter.o2 o2Var = this.f35854z;
        if (o2Var == null || o2Var.o() == null || this.f35854z.o().size() == 0) {
            return;
        }
        for (o2.f fVar : this.f35854z.o()) {
            if (fVar.b() == 2 && fVar.a() != null && (downloadTask = (DownloadTask) fVar.a()) != null && !TextUtils.isEmpty(downloadTask.getCrc_link_type_val()) && hashMap.containsKey(downloadTask.getCrc_link_type_val())) {
                fVar.d(hashMap.get(downloadTask.getCrc_link_type_val()).booleanValue());
            }
        }
        this.f35854z.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        r1();
        this.f35829c = getContext();
        com.join.mgps.Util.d0.a().d(this);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 28 && this.L.needShowPermissdialog().d().booleanValue() && !UtilsMy.m0(this.f35829c)) {
            ((WufunGameDownFirstNotPermissDialog_.IntentBuilder_) WufunGameDownFirstNotPermissDialog_.intent(this.f35829c).from(2).flags(268435456)).start();
        }
        this.K = com.join.mgps.rpc.impl.d.P1();
        if (this.f35840n == null) {
            this.f35840n = ((Activity) getContext()).getWindow().getDecorView().findViewById(R.id.root);
        }
        if (getContext() instanceof MyGameManagerActivity) {
            this.f35842p.setVisibility(8);
            this.f35845q.setVisibility(0);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f35852x.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = (int) getResources().getDimension(R.dimen.wdp90);
            this.f35852x.setLayoutParams(layoutParams);
        }
        if (getActivity() instanceof MGMainActivity) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f35846r.getLayoutParams();
            if (i4 >= 21) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = com.join.android.app.common.utils.n.v(getContext());
            }
            this.f35846r.setLayoutParams(layoutParams2);
        } else {
            this.f35846r.setBackgroundColor(-1);
        }
        this.f46258b.setNoDataCallBackListener(new LoadingLayout.a() { // from class: com.join.mgps.activity.e2
            @Override // com.join.mgps.customview.LoadingLayout.a
            public final void noDataCallBack() {
                MyGamePapaFragmentV2.this.P0();
            }
        });
        com.join.mgps.adapter.o2 o2Var = new com.join.mgps.adapter.o2(getContext());
        this.f35854z = o2Var;
        o2Var.S(this);
        this.f35852x.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new b());
        j jVar = new j(this, new ArrayList<String>() { // from class: com.join.mgps.activity.MyGamePapaFragmentV2.2
            {
                add("本机游戏");
                add("我的收藏");
            }
        });
        this.R = jVar;
        this.f35851w.setAdapter(jVar);
        this.f35851w.registerOnPageChangeCallback(new c());
        new TabLayoutMediator(this.f35852x, this.f35851w, new d()).attach();
        s1();
        k kVar = new k();
        this.f35853y = kVar;
        this.f35847s.setAdapter((ListAdapter) kVar);
    }

    public void b1(DownloadTask downloadTask) {
        try {
            com.join.mgps.adapter.o2 o2Var = this.f35854z;
            if (o2Var != null) {
                o2Var.n(downloadTask);
                String d5 = this.L.myGameTabAdShowIndex().d();
                if (!TextUtils.isEmpty(d5) && d5.split("_").length == 2) {
                    String[] split = d5.split("_");
                    org.androidannotations.api.sharedpreferences.p myGameTabAdShowIndex = this.L.myGameTabAdShowIndex();
                    myGameTabAdShowIndex.g(split[0] + "_" + (Integer.parseInt(split[1]) + 1));
                }
                this.M = null;
                this.N = null;
                Ext ext = new Ext();
                ext.setGameId(downloadTask.getCrc_link_type_val());
                com.papa.sim.statistic.p.l(getContext()).O1(Event.clickRightClosedAd, ext);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72008k})
    public void c1(@Receiver.Extra String str) {
        boolean z4;
        List<DownloadTask> list = this.E;
        if (list == null || list.size() < 1) {
            return;
        }
        loop0: while (true) {
            z4 = false;
            for (DownloadTask downloadTask : this.E) {
                try {
                    if (!TextUtils.isEmpty(downloadTask.getCrc_link_type_val()) && downloadTask.getCrc_link_type_val().equals(str)) {
                        DownloadTask F = p1.f.K().F(downloadTask.getCrc_link_type_val());
                        downloadTask.setOpen(true);
                        if (F != null) {
                            downloadTask.setOpenTime(F.getOpenTime());
                        }
                        String O1 = UtilsMy.O1(downloadTask);
                        if (!TextUtils.isEmpty(O1)) {
                            if ((ConstantIntEnum.CHOICENESS.value() + "").equals(O1) && this.B.contains("全部游戏")) {
                                O1 = "全部游戏";
                            }
                            if (O1 == null) {
                                O1 = "全部游戏";
                            }
                            if (this.S == null) {
                                this.S = "全部游戏";
                            }
                            if (this.B.contains(O1) && (O1.equals(this.S) || this.S.equals("全部游戏"))) {
                                z4 = true;
                            }
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            break loop0;
        }
        if (z4) {
            Y0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = TwistView.DELAY_TIME_TWIST)
    public void d1(String str) {
        i(str);
    }

    void e1() {
        List<DownloadTask> list;
        int c02 = p1.f.K().c0();
        if (c02 > 0) {
            this.f35841o.setVisibility(0);
            TextView textView = this.f35839m;
            textView.setText(c02 + "款游戏需更新");
        } else {
            this.f35841o.setVisibility(8);
        }
        List<CollectionBeanSubBusiness> list2 = this.Y;
        if (list2 == null || list2.size() == 0 || !((list = this.E) == null || this.F == list.size())) {
            List<DownloadTask> list3 = this.E;
            if (list3 != null) {
                this.F = list3.size();
            }
            F0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void f1() {
        MyGamePlugManagerActivity_.p0(getContext()).start();
    }

    @Override // com.join.mgps.adapter.o2.e
    public void g(String str) {
    }

    @Override // com.join.mgps.adapter.o2.e
    public void i(String str) {
        UninstallWufunGameActivity_.R0(this.f35829c).a(str).start();
        final DownloadTask F = p1.f.K().F(str);
        if (F == null) {
            return;
        }
        if (com.join.mgps.Util.g2.i(F.getMod_info())) {
            com.join.mgps.customview.m mVar = new com.join.mgps.customview.m(getContext());
            mVar.b(new m.a() { // from class: com.join.mgps.activity.f2
                @Override // com.join.mgps.customview.m.a
                public final void a(boolean z4, String str2, boolean z5, String str3) {
                    MyGamePapaFragmentV2.this.S0(z4, str2, z5, str3);
                }
            });
            mVar.c(this.f35840n, F);
            return;
        }
        com.join.mgps.customview.q qVar = new com.join.mgps.customview.q(getContext());
        qVar.b(new q.a() { // from class: com.join.mgps.activity.g2
            @Override // com.join.mgps.customview.q.a
            public final void a(String str2) {
                MyGamePapaFragmentV2.this.T0(F, str2);
            }
        });
        qVar.c(this.f35840n, str);
    }

    void k1() {
        this.B.clear();
        this.B.add("全部游戏");
        List<DownloadTask> list = this.E;
        if (list == null || list.size() == 0) {
            return;
        }
        for (DownloadTask downloadTask : this.E) {
            if (downloadTask.isIs_fight() == 1 && !this.B.contains("对战")) {
                this.B.add("对战");
            }
            String H0 = H0(downloadTask);
            if (!TextUtils.isEmpty(H0)) {
                if (!this.B.contains(H0)) {
                    this.B.add(H0);
                }
            } else {
                Iterator<TipBean> it2 = downloadTask.getTipBeans().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        TipBean next = it2.next();
                        if (UtilsMy.v0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) <= 0) {
                            if (next.getName().contains("网游")) {
                                if (!this.B.contains("网游")) {
                                    this.B.add("网游");
                                }
                            } else if (next.getName().contains("单机")) {
                                if (!this.B.contains("单机")) {
                                    this.B.add("单机");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.I})
    public void l1() {
        loadData();
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment, com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected void loadData() {
        ArrayList arrayList = new ArrayList();
        this.A = arrayList;
        arrayList.addAll(Arrays.asList(getContext().getResources().getStringArray(R.array.my_game_list)));
        ArrayList arrayList2 = new ArrayList();
        String d5 = this.L.myGameAllTabSort().d();
        if (!TextUtils.isEmpty(d5)) {
            List list = null;
            try {
                list = (List) JsonMapper.getInstance().fromJson(d5, List.class);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (list != null && list.size() > 0) {
                arrayList2.addAll(list);
            } else {
                arrayList2.addAll(this.A);
            }
        } else {
            arrayList2.addAll(this.A);
        }
        try {
            try {
                List<DownloadTask> Y = p1.f.K().Y();
                List<DownloadTask> list2 = this.E;
                if (list2 != null) {
                    list2.clear();
                }
                if (Y != null) {
                    for (DownloadTask downloadTask : Y) {
                        if (com.join.mgps.Util.g2.i(downloadTask.getMod_info())) {
                            ModInfoBean modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(downloadTask.getMod_info(), ModInfoBean.class);
                            if (modInfoBean != null) {
                                DownloadTask F = p1.f.K().F(modInfoBean.getMod_game_id());
                                DownloadTask F2 = p1.f.K().F(modInfoBean.getMain_game_id());
                                boolean z4 = true;
                                boolean z5 = false;
                                boolean z6 = F != null && F.getStatus() == 5;
                                if (F2 != null) {
                                    if (F2.getStatus() != 5) {
                                        z4 = false;
                                    }
                                    z5 = z4;
                                }
                                if (z6 && z5) {
                                    if (!this.E.contains(F2)) {
                                        this.E.add(F2);
                                    }
                                } else if (z6) {
                                    if (!this.E.contains(F)) {
                                        this.E.add(F);
                                    }
                                } else if (z5) {
                                    if (!this.E.contains(F2)) {
                                        this.E.add(F2);
                                    }
                                } else {
                                    this.E.add(downloadTask);
                                }
                            }
                        } else {
                            this.E.add(downloadTask);
                        }
                    }
                }
                List<DownloadTask> list3 = this.E;
                if (list3 != null) {
                    this.F = list3.size();
                }
                if (this.E.size() > 0) {
                    k1();
                    E1();
                } else {
                    C1();
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                C1();
            }
            a0();
            q1();
        } catch (Throwable th) {
            a0();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = 1000)
    public void m1() {
        F0(true);
    }

    public void n1() {
        com.join.mgps.adapter.o2 o2Var = this.f35854z;
        if (o2Var != null) {
            o2Var.K(true);
            Y0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o1() {
        try {
            HashMap<String, Boolean> d5 = com.join.mgps.Util.g.d(getContext());
            this.D.clear();
            if (d5 != null && d5.size() != 0) {
                this.D.putAll(d5);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (getActivity() instanceof MGMainActivity) {
            this.G = (MGMainActivity) getActivity();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        org.greenrobot.eventbus.c.f().y(this);
        F1();
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDownloadSpeed(com.join.mgps.event.m mVar) {
        if (mVar == null || TextUtils.isEmpty(mVar.a())) {
            return;
        }
        Y0();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            K1(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    K1(a5, 6);
                    return;
                } else if (c5 == 7) {
                    K1(a5, 3);
                    return;
                } else if (c5 == 8) {
                    G1();
                    List<DownloadTask> list = this.E;
                    if (list == null || list.size() <= 0) {
                        return;
                    }
                    I1();
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            K1(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            K1(a5, 8);
                            return;
                        case 13:
                            K1(a5, 9);
                            return;
                        default:
                            return;
                    }
                }
            }
            K1(a5, 5);
        } else {
            K1(a5, 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (!z4) {
            G0();
            F0(false);
            this.O = false;
            this.Q++;
        }
        ViewPager2 viewPager2 = this.f35851w;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(0);
        }
        this.P = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (MApplication.Y) {
            MApplication.Y = false;
            String d5 = this.L.addedShortcutGames().d();
            if (!com.join.mgps.Util.g2.h(d5)) {
                if (d5.contains(",")) {
                    for (String str : d5.split(",")) {
                        t0(str);
                    }
                } else {
                    t0(d5);
                }
            }
        }
        e1();
        o1();
        com.join.mgps.adapter.o2 o2Var = this.f35854z;
        if (o2Var != null) {
            o2Var.K(true);
            Y0();
        }
        if (isHidden()) {
            return;
        }
        G0();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.V = (i5 + i4) - 1;
        this.W = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.fragment.BaseFragment
    public void onVisible() {
        List<DownloadTask> list;
        super.onVisible();
        List<CollectionBeanSubBusiness> list2 = this.Y;
        if (list2 == null || list2.size() == 0 || ((list = this.E) != null && this.F != list.size())) {
            List<DownloadTask> list3 = this.E;
            if (list3 != null) {
                this.F = list3.size();
            }
            F0(true);
        }
        com.join.mgps.adapter.o2 o2Var = this.f35854z;
        if (o2Var != null) {
            o2Var.K(true);
            Y0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void p1(List<DownloadTask> list) {
        if (list != null) {
            try {
                if (list.size() == 0) {
                    return;
                }
                HashMap<String, Boolean> hashMap = new HashMap<>();
                for (int i4 = 0; i4 < list.size(); i4++) {
                    DownloadTask downloadTask = list.get(i4);
                    hashMap.put(downloadTask.getCrc_link_type_val(), Boolean.valueOf(w0(getContext(), downloadTask)));
                    this.C.put(downloadTask.getCrc_link_type_val(), Boolean.valueOf(w0(getContext(), downloadTask)));
                }
                a1(hashMap);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    void r1() {
        NetBroadcastReceiver netBroadcastReceiver = new NetBroadcastReceiver();
        this.f35844p1 = netBroadcastReceiver;
        netBroadcastReceiver.a(new i());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        getContext().registerReceiver(this.f35844p1, intentFilter);
    }

    void s1() {
        if (getActivity() == null || !(getActivity() instanceof MGMainActivity)) {
            return;
        }
        List<String> snkGameList = ((MGMainActivity) getActivity()).getSnkGameList();
        if (snkGameList == null || snkGameList.size() == 0) {
            I0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        this.G.callbackHome(null);
    }

    void u0(Context context, String str, String str2, Bitmap bitmap) {
        if (bitmap == null) {
            bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.icon);
        }
        if (bitmap == null) {
            com.join.mgps.Util.l2.a(context).b("创建失败！");
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService("shortcut");
            if (shortcutManager.isRequestPinShortcutSupported()) {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.setClass(context, MGMainActivity_.class);
                intent.putExtra("shortcutGameId", str2);
                intent.addFlags(TTAdConstant.KEY_CLICK_AREA);
                shortcutManager.requestPinShortcut(new ShortcutInfo.Builder(context, str).setIcon(Icon.createWithBitmap(bitmap)).setShortLabel(str).setIntent(intent).build(), PendingIntent.getBroadcast(context, 0, new Intent(context, ShortcutReceiver.class), 134217728).getIntentSender());
                com.join.mgps.Util.w1.e(context, str2);
            }
        } else {
            Intent intent2 = new Intent(com.join.mgps.Util.w1.f28140a);
            intent2.putExtra("duplicate", false);
            intent2.putExtra("android.intent.extra.shortcut.NAME", str);
            intent2.putExtra("android.intent.extra.shortcut.ICON", Bitmap.createScaledBitmap(bitmap, 142, 142, true));
            Intent intent3 = new Intent("android.intent.action.MAIN");
            intent3.setClass(context, MGMainActivity_.class);
            intent3.putExtra("shortcutGameId", str2);
            intent3.addFlags(TTAdConstant.KEY_CLICK_AREA);
            intent3.addCategory("android.intent.category.LAUNCHER");
            intent2.putExtra("android.intent.extra.shortcut.INTENT", intent3);
            context.sendBroadcast(intent2);
            com.join.mgps.Util.w1.e(context, str2);
        }
        this.C.put(str2, Boolean.FALSE);
        Y0();
        A1(str2);
    }

    void u1() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.J <= 300) {
            return;
        }
        this.J = currentTimeMillis;
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.t(0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void v0() {
        if (getContext() instanceof Activity) {
            ((Activity) getContext()).finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void v1() {
        IntentUtil.getInstance().goSearchHintActivity(getContext());
    }

    boolean w0(Context context, DownloadTask downloadTask) {
        if (downloadTask != null && downloadTask.getStatus() == 5 && (!N0(downloadTask) || !com.join.mgps.Util.w1.d(context, downloadTask.getCrc_link_type_val()))) {
            boolean z4 = !TextUtils.isEmpty(downloadTask.getFileType()) && downloadTask.getFileType().equals(Dtype.apk.name());
            if (com.join.mgps.Util.g2.i(downloadTask.getRomType()) && (downloadTask.getUrl().endsWith(".apk") || downloadTask.getRomType().equals("androidobb") || downloadTask.getRomType().equals("46"))) {
                String packageName = downloadTask.getPackageName();
                if (!com.join.mgps.Util.g2.h(packageName) && M0(context, packageName) && !downloadTask.getTips().contains("网游") && !com.join.mgps.Util.w1.d(context, downloadTask.getCrc_link_type_val())) {
                    return true;
                }
                if (APKUtils.G(downloadTask) && !com.join.mgps.Util.w1.d(context, downloadTask.getRef_crc_sign_id())) {
                    return true;
                }
                if (APKUtils.L(downloadTask) && !com.join.mgps.Util.w1.d(context, downloadTask.getCrc_link_type_val())) {
                    return true;
                }
            } else if (z4 && !com.join.mgps.Util.w1.d(context, downloadTask.getCrc_link_type_val())) {
                return true;
            } else {
                if (APKUtils.G(downloadTask) && !com.join.mgps.Util.w1.d(context, downloadTask.getRef_crc_sign_id())) {
                    return true;
                }
                if (APKUtils.L(downloadTask) && !com.join.mgps.Util.w1.d(context, downloadTask.getCrc_link_type_val())) {
                    return true;
                }
            }
        }
        return false;
    }

    @UiThread
    public void w1(OnlineCouponConfigBean onlineCouponConfigBean) {
        this.I = onlineCouponConfigBean;
        boolean isGameStartUpSwitch = onlineCouponConfigBean.isGameStartUpSwitch();
        boolean isTabSwitch = onlineCouponConfigBean.isTabSwitch();
        boolean isReceived = onlineCouponConfigBean.isReceived();
        int n22 = AccountUtil_.getInstance_(this.f35829c).getAccountData().n2();
        PrefDef_ prefDef_ = this.L;
        Long d5 = (n22 == 1 ? prefDef_.lastGameShowOnlineCouponTime() : prefDef_.lastGameShowOnlineCouponTimeGuest()).d();
        PrefDef_ prefDef_2 = this.L;
        String d6 = (n22 == 1 ? prefDef_2.lastGameTimePeriod() : prefDef_2.lastGameTimePeriodGuest()).d();
        if (!com.join.mgps.Util.y.u(d5.longValue()) && isGameStartUpSwitch && !isReceived && !TextUtils.equals(onlineCouponConfigBean.getTimePeriodMark(), d6)) {
            D1(onlineCouponConfigBean, 2);
            if (n22 == 1) {
                this.L.lastGameShowOnlineCouponTime().g(Long.valueOf(System.currentTimeMillis()));
                this.L.lastGameTimePeriod().g(onlineCouponConfigBean.getTimePeriodMark());
                return;
            }
            this.L.lastGameShowOnlineCouponTimeGuest().g(Long.valueOf(System.currentTimeMillis()));
            this.L.lastGameTimePeriodGuest().g(onlineCouponConfigBean.getTimePeriodMark());
        } else if (!isTabSwitch || this.H || isReceived) {
        } else {
            TextView textView = this.f35849u;
            if (textView != null) {
                textView.setText(onlineCouponConfigBean.getTabHint());
            }
            LinearLayout linearLayout = this.f35848t;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            com.papa.sim.statistic.p.l(this.f35829c).Q1(Event.tabStartViewSuccessTips, AccountUtil_.getInstance_(this.f35829c).getAccountData().getUid());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x1(SNKGameInfoBean sNKGameInfoBean) {
        List<String> scanning_md5 = sNKGameInfoBean.getScanning_md5();
        this.U = scanning_md5;
        if (scanning_md5 == null || scanning_md5.size() <= 0 || getActivity() == null || !(getActivity() instanceof MGMainActivity)) {
            return;
        }
        ((MGMainActivity) getActivity()).setSnkGameList(this.U);
    }

    void y0(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.E.iterator();
        while (it2.hasNext()) {
            DownloadTask next = it2.next();
            if (!TextUtils.isEmpty(next.getCrc_link_type_val()) && next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                it2.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void y1() {
        com.join.mgps.customview.x xVar = new com.join.mgps.customview.x(getContext());
        xVar.b(new f());
        xVar.c(this.f35840n);
    }

    void z0(String str) {
        DownloadTask F = p1.f.K().F(str);
        Context context = getContext();
        if (F == null) {
            return;
        }
        boolean z4 = false;
        String fileType = F.getFileType();
        if (!TextUtils.isEmpty(fileType) && fileType.equals(Dtype.android.name())) {
            z4 = true;
        }
        if (z4) {
            if (com.join.android.app.common.utils.e.l0(context).d(context, F.getPackageName())) {
                if (F.getStatus() != 5 && F.getStatus() != 9) {
                    UtilsMy.J0(F);
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, F.getPackageName());
                    if (l4 != null) {
                        F.setVer(l4.d() + "");
                    }
                    UtilsMy.S2(F, 5);
                    Y0();
                } else {
                    com.join.android.app.common.utils.e.l0(context).f0(context, F.getPackageName());
                }
            } else {
                UtilsMy.M0(F);
                y0(F);
                UtilsMy.x4(F);
                Y0();
            }
        } else {
            UtilsMy.M0(F);
            y0(F);
            UtilsMy.x4(F);
            Y0();
        }
        List<DownloadTask> D0 = D0();
        if (D0 == null || D0.size() == 0) {
            this.S = "全部游戏";
            this.f35838l.setText("全部游戏");
            Y0();
        }
    }

    void z1(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        Bitmap m4 = ImageLoader.q().m(downloadTask.getPortraitURL());
        if (m4 == null) {
            m4 = t1(downloadTask.getPortraitURL());
        }
        u0(getContext(), downloadTask.getShowName(), downloadTask.getCrc_link_type_val(), m4);
    }
}
