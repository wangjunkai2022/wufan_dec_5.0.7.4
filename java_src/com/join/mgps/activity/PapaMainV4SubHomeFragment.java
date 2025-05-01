package com.join.mgps.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.PapaMainHomeRankAdapter;
import com.join.mgps.adapter.PapaMainV4Adapter;
import com.join.mgps.adapter.RankingItemV4Adapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.CommonMultiItemBean;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.GInfoBean;
import com.join.mgps.dto.GameFromPopoWinBeanV2;
import com.join.mgps.dto.HomeDynamicListBean;
import com.join.mgps.dto.HomeFloatData;
import com.join.mgps.dto.HomeRankingListBean;
import com.join.mgps.dto.PapaHomeBeanV9;
import com.join.mgps.dto.RecomDatabean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.ArrayList;
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
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
@EFragment(R.layout.mgpapa_mainfragment_new_layout_v4_sub_home)
/* loaded from: classes.dex */
public class PapaMainV4SubHomeFragment extends Fragment implements PapaMainV4Adapter.e {
    private boolean A;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    XQuickRecyclerView f36747b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    PtrClassicFrameLayout f36748c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f36749d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f36750e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    SimpleDraweeView f36751f;
    @Pref

    /* renamed from: g  reason: collision with root package name */
    PrefDef_ f36752g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f36753h;

    /* renamed from: i  reason: collision with root package name */
    private Context f36754i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f36755j;

    /* renamed from: n  reason: collision with root package name */
    private boolean f36759n;

    /* renamed from: p  reason: collision with root package name */
    private PapaMainV4Adapter f36761p;

    /* renamed from: q  reason: collision with root package name */
    private String f36762q;

    /* renamed from: r  reason: collision with root package name */
    private int f36763r;

    /* renamed from: s  reason: collision with root package name */
    private int f36764s;

    /* renamed from: v  reason: collision with root package name */
    private Handler f36767v;

    /* renamed from: y  reason: collision with root package name */
    private RecomDatabean f36770y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f36771z;

    /* renamed from: k  reason: collision with root package name */
    private boolean f36756k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f36757l = true;

    /* renamed from: m  reason: collision with root package name */
    private int f36758m = 1;

    /* renamed from: o  reason: collision with root package name */
    private List<CommonMultiItemBean> f36760o = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    private List<CommonGameInfoBean> f36765t = null;

    /* renamed from: u  reason: collision with root package name */
    private int f36766u = 0;

    /* renamed from: w  reason: collision with root package name */
    Runnable f36768w = new d();

    /* renamed from: x  reason: collision with root package name */
    private String f36769x = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends GridLayoutManager.SpanSizeLookup {
        a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i4) {
            if (PapaMainV4SubHomeFragment.this.f36761p.getItem(i4) != 0) {
                int itemType = ((CommonMultiItemBean) PapaMainV4SubHomeFragment.this.f36761p.getItem(i4)).getItemType();
                if (itemType != 2) {
                    return itemType != 11 ? 10 : 5;
                }
                return 2;
            }
            return 10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements XQuickRecyclerView.LoadingListener {
        b() {
        }

        @Override // com.join.kotlin.base.widget.recycleview.XQuickRecyclerView.LoadingListener
        public void onLoadMore() {
            PapaMainV4SubHomeFragment papaMainV4SubHomeFragment = PapaMainV4SubHomeFragment.this;
            papaMainV4SubHomeFragment.w0(papaMainV4SubHomeFragment.f36758m);
        }

        @Override // com.join.kotlin.base.widget.recycleview.XQuickRecyclerView.LoadingListener
        public void onRefresh() {
            PapaMainV4SubHomeFragment.this.f36758m = 1;
            PapaMainV4SubHomeFragment.this.f36747b.reset();
            PapaMainV4SubHomeFragment papaMainV4SubHomeFragment = PapaMainV4SubHomeFragment.this;
            papaMainV4SubHomeFragment.w0(papaMainV4SubHomeFragment.f36758m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends RecyclerView.OnScrollListener {
        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            if (i4 == 0) {
                PapaMainV4SubHomeFragment.this.r0();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i4, int i5) {
            super.onScrolled(recyclerView, i4, i5);
            PapaMainV4SubHomeFragment papaMainV4SubHomeFragment = PapaMainV4SubHomeFragment.this;
            papaMainV4SubHomeFragment.f36763r = papaMainV4SubHomeFragment.f36747b.getLastVisiblePosition();
            PapaMainV4SubHomeFragment papaMainV4SubHomeFragment2 = PapaMainV4SubHomeFragment.this;
            papaMainV4SubHomeFragment2.f36764s = papaMainV4SubHomeFragment2.f36747b.getFirstVisiblePosition();
            PapaMainV4SubHomeFragment.this.m0();
            if (Math.abs(i5) > 0) {
                if (PapaMainV4SubHomeFragment.this.f36747b.getLastCompletelyVisiblePosition() < PapaMainV4SubHomeFragment.this.f36761p.getData().size() || PapaMainV4SubHomeFragment.this.f36757l) {
                    PapaMainV4SubHomeFragment.this.s0();
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HomeRankingListBean homeRankingListBean;
            List list;
            LinearLayoutManager linearLayoutManager;
            if (PapaMainV4SubHomeFragment.this.f36759n) {
                if (PapaMainV4SubHomeFragment.this.f36752g.isFirstCommendVersion().d().booleanValue() && PapaMainV4SubHomeFragment.this.f36752g.isFirst35().d().booleanValue()) {
                    return;
                }
                PapaMainV4SubHomeFragment papaMainV4SubHomeFragment = PapaMainV4SubHomeFragment.this;
                XQuickRecyclerView xQuickRecyclerView = papaMainV4SubHomeFragment.f36747b;
                if (xQuickRecyclerView != null) {
                    papaMainV4SubHomeFragment.f36763r = xQuickRecyclerView.getLastCompletelyVisiblePosition();
                }
                for (int i4 = 0; i4 < PapaMainV4SubHomeFragment.this.f36760o.size(); i4++) {
                    if (i4 <= PapaMainV4SubHomeFragment.this.f36763r) {
                        CommonMultiItemBean commonMultiItemBean = (CommonMultiItemBean) PapaMainV4SubHomeFragment.this.f36760o.get(i4);
                        if (!commonMultiItemBean.isExposure()) {
                            int itemType = commonMultiItemBean.getItemType();
                            if (itemType != 5 && itemType != 7) {
                                switch (itemType) {
                                    case 9:
                                        if ((commonMultiItemBean.getData() instanceof HomeRankingListBean) && (homeRankingListBean = (HomeRankingListBean) commonMultiItemBean.getData()) != null && homeRankingListBean.getList() != null) {
                                            RecyclerView.ViewHolder findViewHolderForAdapterPosition = PapaMainV4SubHomeFragment.this.f36747b.findViewHolderForAdapterPosition(i4);
                                            if (findViewHolderForAdapterPosition instanceof BaseViewHolder) {
                                                for (CommonGameInfoBean commonGameInfoBean : homeRankingListBean.getList().get(((ViewPager2) ((BaseViewHolder) findViewHolderForAdapterPosition).getView(R.id.viewpager)).getCurrentItem())) {
                                                    PapaMainV4SubHomeFragment.this.E0(commonGameInfoBean);
                                                }
                                                break;
                                            }
                                        }
                                        break;
                                    case 10:
                                        if ((commonMultiItemBean.getData() instanceof List) && (list = (List) commonMultiItemBean.getData()) != null && list.size() > 0) {
                                            RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = PapaMainV4SubHomeFragment.this.f36747b.findViewHolderForAdapterPosition(i4);
                                            if ((findViewHolderForAdapterPosition2 instanceof BaseViewHolder) && (linearLayoutManager = (LinearLayoutManager) ((RecyclerView) ((BaseViewHolder) findViewHolderForAdapterPosition2).getView(R.id.recycleView)).getLayoutManager()) != null) {
                                                int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                                                for (int i5 = 0; i5 <= findLastCompletelyVisibleItemPosition; i5++) {
                                                    PapaMainV4SubHomeFragment.this.F0((GameFromPopoWinBeanV2.DataBean) list.get(i5), i5);
                                                }
                                                break;
                                            }
                                        }
                                        break;
                                }
                                commonMultiItemBean.setExposure(true);
                            }
                            if (commonMultiItemBean.getData() instanceof CommonGameInfoBean) {
                                PapaMainV4SubHomeFragment.this.E0((CommonGameInfoBean) commonMultiItemBean.getData());
                            }
                            commonMultiItemBean.setExposure(true);
                        }
                    }
                }
            }
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
            PapaMainV4SubHomeFragment.this.f36771z = false;
            PapaMainV4SubHomeFragment.this.A = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            PapaMainV4SubHomeFragment.this.f36771z = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            PapaMainV4SubHomeFragment.this.f36771z = false;
            PapaMainV4SubHomeFragment.this.A = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            PapaMainV4SubHomeFragment.this.f36771z = true;
        }
    }

    private void A0(DownloadTask downloadTask) {
        for (CommonGameInfoBean commonGameInfoBean : this.f36765t) {
            if (commonGameInfoBean.getG_info() != null && (TextUtils.equals(commonGameInfoBean.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(commonGameInfoBean.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                commonGameInfoBean.setDownloadTask(downloadTask);
            }
        }
        H0(downloadTask);
    }

    private void B0(DownloadTask downloadTask) {
        for (CommonGameInfoBean commonGameInfoBean : this.f36765t) {
            if (commonGameInfoBean.getG_info() != null && (TextUtils.equals(commonGameInfoBean.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(commonGameInfoBean.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                commonGameInfoBean.setDownloadTask(downloadTask);
            }
        }
        H0(downloadTask);
    }

    private void D0(PapaHomeBeanV9 papaHomeBeanV9) {
        for (Fragment fragment : getParentFragmentManager().getFragments()) {
            if (fragment instanceof PapaMainV4Fragment_) {
                ((PapaMainV4Fragment_) fragment).Z(papaHomeBeanV9);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(CommonGameInfoBean commonGameInfoBean) {
        String o02 = o0(commonGameInfoBean);
        Ext ext = new Ext();
        ext.setPage("home");
        ext.setFrom(commonGameInfoBean.get_from() + "");
        ext.setPosition(commonGameInfoBean.getExp_position());
        Data data = new Data();
        data.setWhere(commonGameInfoBean.getIntentDataBean().getLink_type_val());
        if (!TextUtils.isEmpty(o02)) {
            try {
                data.setGameId(Long.parseLong(o02));
            } catch (Exception unused) {
            }
        }
        com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(this.f36754i);
        Event event = Event.expGameAdPage;
        l4.T1(event, ext, data);
        if (UtilsMy.g2(commonGameInfoBean)) {
            try {
                Ext ext2 = new Ext();
                ext2.setResultCode("discount_game");
                ext2.setScenesCode(getClass().getSimpleName());
                Data data2 = new Data();
                data2.setGameId(Long.parseLong(o02));
                com.papa.sim.statistic.p.l(this.f36754i).Y(event, ext2, data2);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0(GameFromPopoWinBeanV2.DataBean dataBean, int i4) {
    }

    private void H0(DownloadTask downloadTask) {
        int i4;
        CommonGameInfoBean commonGameInfoBean;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        CommonGameInfoBean commonGameInfoBean2;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition2;
        HomeRankingListBean homeRankingListBean;
        int i5;
        int i6;
        View findViewByPosition;
        ViewPager2 viewPager2;
        RecyclerView recyclerView;
        PapaMainHomeRankAdapter papaMainHomeRankAdapter;
        View findViewByPosition2;
        RecyclerView recyclerView2;
        CommonGameInfoBean commonGameInfoBean3;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition3;
        if (downloadTask != null && (i4 = this.f36764s) >= 0) {
            for (i4 = this.f36764s; i4 <= Math.min(this.f36763r + 1, this.f36761p.getItemCount() - 1); i4++) {
                CommonMultiItemBean commonMultiItemBean = (CommonMultiItemBean) this.f36761p.getItem(i4);
                if (commonMultiItemBean != null) {
                    int itemType = commonMultiItemBean.getItemType();
                    if (itemType == 5) {
                        try {
                            commonGameInfoBean = (CommonGameInfoBean) commonMultiItemBean.getData();
                            findViewHolderForAdapterPosition = this.f36747b.findViewHolderForAdapterPosition(i4);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                        if (findViewHolderForAdapterPosition instanceof BaseViewHolder) {
                            BaseViewHolder baseViewHolder = (BaseViewHolder) findViewHolderForAdapterPosition;
                            if (commonGameInfoBean != null && commonGameInfoBean.getG_info() != null) {
                                GInfoBean g_info = commonGameInfoBean.getG_info();
                                if (TextUtils.equals(downloadTask.getCrc_link_type_val(), g_info.getId()) || (commonGameInfoBean.getDownloadTask() != null && TextUtils.equals(downloadTask.getCrc_link_type_val(), commonGameInfoBean.getDownloadTask().getCrc_link_type_val()))) {
                                    DownloadTask downloadTask2 = commonGameInfoBean.getDownloadTask();
                                    if (downloadTask2 == null) {
                                        K0(baseViewHolder, true, false);
                                        baseViewHolder.setText(R.id.mgListviewItemInstall, "获取").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                        if (UtilsMy.o0(g_info.getTag_info())) {
                                            if (com.join.android.app.common.utils.e.l0(this.f36754i).d(this.f36754i, g_info.getPackage_name()) && UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) == 0) {
                                                APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f36754i).l(this.f36754i, g_info.getPackage_name());
                                                if (com.join.mgps.Util.g2.i(g_info.getVer()) && l4.d() < Integer.parseInt(g_info.getVer())) {
                                                    baseViewHolder.setText(R.id.mgListviewItemInstall, "更新").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_green_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_green_color));
                                                } else {
                                                    baseViewHolder.setText(R.id.mgListviewItemInstall, "启动").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_maincolor_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_main_color));
                                                }
                                            } else {
                                                UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                                                UtilsMy.g3((TextView) baseViewHolder.getView(R.id.mgListviewItemInstall), baseViewHolder.getView(R.id.rLayoutRight), g_info);
                                            }
                                        } else {
                                            UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                                            UtilsMy.g3((TextView) baseViewHolder.getView(R.id.mgListviewItemInstall), baseViewHolder.getView(R.id.rLayoutRight), g_info);
                                        }
                                    } else {
                                        int status = downloadTask2.getStatus();
                                        if (UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) > 0) {
                                            status = 43;
                                        }
                                        if (status != 0) {
                                            if (status == 27) {
                                                baseViewHolder.setText(R.id.mgListviewItemInstall, "暂停").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                            } else if (status == 48) {
                                                baseViewHolder.setText(R.id.mgListviewItemInstall, "安装中").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                K0(baseViewHolder, true, false);
                                            } else {
                                                if (status != 2) {
                                                    if (status != 3) {
                                                        if (status != 5) {
                                                            if (status != 6) {
                                                                if (status != 7) {
                                                                    if (status != 42) {
                                                                        if (status != 43) {
                                                                            switch (status) {
                                                                                case 9:
                                                                                    baseViewHolder.setText(R.id.mgListviewItemInstall, "更新").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_green_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_green_color));
                                                                                    K0(baseViewHolder, true, false);
                                                                                    continue;
                                                                                case 10:
                                                                                    K0(baseViewHolder, false, false);
                                                                                    BaseViewHolder text = baseViewHolder.setText(R.id.mgListviewItemInstall, "等待");
                                                                                    text.setText(R.id.appSize, UtilsMy.g(downloadTask2.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask2.getSize())).setProgress(R.id.progressBar, (int) downloadTask2.getProgress()).setText(R.id.loding_info, "等待中").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                                                    continue;
                                                                                case 11:
                                                                                    baseViewHolder.setText(R.id.mgListviewItemInstall, "安装").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_green_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_green_color));
                                                                                    K0(baseViewHolder, true, false);
                                                                                    continue;
                                                                                case 12:
                                                                                    K0(baseViewHolder, false, true);
                                                                                    baseViewHolder.setText(R.id.appSize, UtilsMy.g(downloadTask2.getSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask2.getSize())).setText(R.id.loding_info, "解压中..").setProgress(R.id.progressBarZip, (int) downloadTask2.getProgress()).setText(R.id.mgListviewItemInstall, "解压中").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.extract).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_grey_color));
                                                                                    continue;
                                                                                case 13:
                                                                                    K0(baseViewHolder, false, true);
                                                                                    baseViewHolder.setText(R.id.appSize, UtilsMy.g(downloadTask2.getSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask2.getSize())).setText(R.id.loding_info, "点击重新解压").setProgress(R.id.progressBarZip, (int) downloadTask2.getProgress()).setText(R.id.mgListviewItemInstall, "解压").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.reextract).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                                                    continue;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        baseViewHolder.setText(R.id.mgListviewItemInstall, "启动").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_maincolor_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_main_color));
                                                        K0(baseViewHolder, true, false);
                                                    }
                                                    K0(baseViewHolder, false, false);
                                                    try {
                                                        BaseViewHolder text2 = baseViewHolder.setText(R.id.mgListviewItemInstall, "继续");
                                                        text2.setText(R.id.appSize, UtilsMy.g(downloadTask2.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask2.getSize())).setProgress(R.id.progressBar, (int) downloadTask2.getProgress()).setText(R.id.loding_info, "暂停中").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                    } catch (Exception e6) {
                                                        e6.printStackTrace();
                                                    }
                                                } else {
                                                    UtilsMy.x4(downloadTask2);
                                                    K0(baseViewHolder, false, false);
                                                    try {
                                                        BaseViewHolder text3 = baseViewHolder.setText(R.id.mgListviewItemInstall, "暂停");
                                                        BaseViewHolder progress = text3.setText(R.id.appSize, UtilsMy.g(downloadTask2.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask2.getSize())).setProgress(R.id.progressBar, (int) downloadTask2.getProgress());
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append(downloadTask2.getSpeed());
                                                        sb.append("/S");
                                                        progress.setText(R.id.loding_info, sb.toString()).setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                    } catch (Exception e7) {
                                                        e7.printStackTrace();
                                                    }
                                                }
                                                e5.printStackTrace();
                                            }
                                        }
                                        baseViewHolder.setText(R.id.mgListviewItemInstall, "获取").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                        UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                                        UtilsMy.g3((TextView) baseViewHolder.getView(R.id.mgListviewItemInstall), baseViewHolder.getView(R.id.rLayoutRight), g_info);
                                        K0(baseViewHolder, true, false);
                                    }
                                }
                            }
                        }
                    } else if (itemType == 7) {
                        try {
                            commonGameInfoBean2 = (CommonGameInfoBean) commonMultiItemBean.getData();
                            findViewHolderForAdapterPosition2 = this.f36747b.findViewHolderForAdapterPosition(i4);
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        if (findViewHolderForAdapterPosition2 instanceof BaseViewHolder) {
                            BaseViewHolder baseViewHolder2 = (BaseViewHolder) findViewHolderForAdapterPosition2;
                            if (commonGameInfoBean2 != null && commonGameInfoBean2.getG_info() != null) {
                                GInfoBean g_info2 = commonGameInfoBean2.getG_info();
                                if (TextUtils.equals(downloadTask.getCrc_link_type_val(), g_info2.getId()) || (commonGameInfoBean2.getDownloadTask() != null && TextUtils.equals(downloadTask.getCrc_link_type_val(), commonGameInfoBean2.getDownloadTask().getCrc_link_type_val()))) {
                                    DownloadTask downloadTask3 = commonGameInfoBean2.getDownloadTask();
                                    if (downloadTask3 == null) {
                                        baseViewHolder2.setText(R.id.itemInstall, "获取").setBackgroundRes(R.id.itemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.itemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                        if (UtilsMy.o0(g_info2.getTag_info())) {
                                            if (com.join.android.app.common.utils.e.l0(this.f36754i).d(this.f36754i, g_info2.getPackage_name()) && UtilsMy.w0(g_info2.getPay_tag_info(), g_info2.getId()) == 0) {
                                                APKUtils.a l5 = com.join.android.app.common.utils.e.l0(this.f36754i).l(this.f36754i, g_info2.getPackage_name());
                                                if (com.join.mgps.Util.g2.i(g_info2.getVer()) && l5.d() < Integer.parseInt(g_info2.getVer())) {
                                                    baseViewHolder2.setText(R.id.itemInstall, "更新").setBackgroundRes(R.id.itemInstall, R.drawable.recom_green_butn).setTextColor(R.id.itemInstall, this.f36754i.getResources().getColor(R.color.app_green_color));
                                                } else {
                                                    baseViewHolder2.setText(R.id.itemInstall, "启动").setBackgroundRes(R.id.itemInstall, R.drawable.recom_maincolor_butn).setTextColor(R.id.itemInstall, this.f36754i.getResources().getColor(R.color.app_main_color));
                                                }
                                            } else {
                                                UtilsMy.w0(g_info2.getPay_tag_info(), g_info2.getId());
                                                UtilsMy.g3((TextView) baseViewHolder2.getView(R.id.itemInstall), baseViewHolder2.getView(R.id.rLayoutRight), g_info2);
                                            }
                                        } else {
                                            UtilsMy.w0(g_info2.getPay_tag_info(), g_info2.getId());
                                            UtilsMy.g3((TextView) baseViewHolder2.getView(R.id.itemInstall), baseViewHolder2.getView(R.id.rLayoutRight), g_info2);
                                        }
                                    } else {
                                        int status2 = downloadTask3.getStatus();
                                        if (UtilsMy.w0(g_info2.getPay_tag_info(), g_info2.getId()) > 0) {
                                            status2 = 43;
                                        }
                                        if (status2 != 0) {
                                            if (status2 == 27) {
                                                baseViewHolder2.setText(R.id.itemInstall, "暂停").setBackgroundRes(R.id.itemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.itemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                            } else if (status2 == 48) {
                                                baseViewHolder2.setText(R.id.itemInstall, "安装中").setBackgroundRes(R.id.itemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.itemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                            } else {
                                                if (status2 != 2) {
                                                    if (status2 != 3) {
                                                        if (status2 != 5) {
                                                            if (status2 != 6) {
                                                                if (status2 != 7) {
                                                                    if (status2 != 42) {
                                                                        if (status2 != 43) {
                                                                            switch (status2) {
                                                                                case 9:
                                                                                    baseViewHolder2.setText(R.id.itemInstall, "更新").setBackgroundRes(R.id.itemInstall, R.drawable.recom_green_butn).setTextColor(R.id.itemInstall, this.f36754i.getResources().getColor(R.color.app_green_color));
                                                                                    continue;
                                                                                case 10:
                                                                                    BaseViewHolder text4 = baseViewHolder2.setText(R.id.itemInstall, "等待");
                                                                                    text4.setText(R.id.appSize, UtilsMy.g(downloadTask3.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask3.getSize())).setProgress(R.id.progressBar, (int) downloadTask3.getProgress()).setText(R.id.loding_info, "等待中").setBackgroundRes(R.id.itemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.itemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                                                    continue;
                                                                                case 11:
                                                                                    baseViewHolder2.setText(R.id.itemInstall, "安装").setBackgroundRes(R.id.itemInstall, R.drawable.recom_green_butn).setTextColor(R.id.itemInstall, this.f36754i.getResources().getColor(R.color.app_green_color));
                                                                                    continue;
                                                                                case 12:
                                                                                    baseViewHolder2.setText(R.id.appSize, UtilsMy.g(downloadTask3.getSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask3.getSize())).setText(R.id.loding_info, "解压中..").setProgress(R.id.progressBarZip, (int) downloadTask3.getProgress()).setText(R.id.itemInstall, "解压中").setBackgroundRes(R.id.itemInstall, R.drawable.extract).setTextColor(R.id.itemInstall, this.f36754i.getResources().getColor(R.color.app_grey_color));
                                                                                    continue;
                                                                                case 13:
                                                                                    baseViewHolder2.setText(R.id.appSize, UtilsMy.g(downloadTask3.getSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask3.getSize())).setText(R.id.loding_info, "点击重新解压").setProgress(R.id.progressBarZip, (int) downloadTask3.getProgress()).setText(R.id.itemInstall, "解压").setBackgroundRes(R.id.itemInstall, R.drawable.reextract).setTextColor(R.id.itemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                                                    continue;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        baseViewHolder2.setText(R.id.itemInstall, "启动").setBackgroundRes(R.id.itemInstall, R.drawable.recom_maincolor_butn).setTextColor(R.id.itemInstall, this.f36754i.getResources().getColor(R.color.app_main_color));
                                                    }
                                                    try {
                                                        BaseViewHolder text5 = baseViewHolder2.setText(R.id.itemInstall, "继续");
                                                        text5.setText(R.id.appSize, UtilsMy.g(downloadTask3.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask3.getSize())).setProgress(R.id.progressBar, (int) downloadTask3.getProgress()).setText(R.id.loding_info, "暂停中").setBackgroundRes(R.id.itemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.itemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                    } catch (Exception e9) {
                                                        e9.printStackTrace();
                                                    }
                                                } else {
                                                    UtilsMy.x4(downloadTask3);
                                                    try {
                                                        BaseViewHolder text6 = baseViewHolder2.setText(R.id.itemInstall, "暂停");
                                                        BaseViewHolder progress2 = text6.setText(R.id.appSize, UtilsMy.g(downloadTask3.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask3.getSize())).setProgress(R.id.progressBar, (int) downloadTask3.getProgress());
                                                        StringBuilder sb2 = new StringBuilder();
                                                        sb2.append(downloadTask3.getSpeed());
                                                        sb2.append("/S");
                                                        progress2.setText(R.id.loding_info, sb2.toString()).setBackgroundRes(R.id.itemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.itemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                    } catch (Exception e10) {
                                                        e10.printStackTrace();
                                                    }
                                                }
                                                e8.printStackTrace();
                                            }
                                        }
                                        baseViewHolder2.setText(R.id.itemInstall, "获取").setBackgroundRes(R.id.itemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.itemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                        UtilsMy.w0(g_info2.getPay_tag_info(), g_info2.getId());
                                        UtilsMy.g3((TextView) baseViewHolder2.getView(R.id.itemInstall), baseViewHolder2.getView(R.id.rLayoutRight), g_info2);
                                    }
                                }
                            }
                        }
                    } else if (itemType == 9) {
                        try {
                            homeRankingListBean = (HomeRankingListBean) commonMultiItemBean.getData();
                            i5 = -1;
                            i6 = -1;
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        if (homeRankingListBean != null && homeRankingListBean.getList() != null) {
                            for (int i7 = 0; i7 < homeRankingListBean.getList().size(); i7++) {
                                List<CommonGameInfoBean> list = homeRankingListBean.getList().get(i7);
                                if (list != null) {
                                    for (int i8 = 0; i8 < list.size(); i8++) {
                                        if (list.get(i8) != null && list.get(i8).getG_info() != null) {
                                            if (TextUtils.equals(downloadTask.getCrc_link_type_val(), list.get(i8).getG_info().getId()) || (list.get(i8).getDownloadTask() != null && TextUtils.equals(downloadTask.getCrc_link_type_val(), list.get(i8).getDownloadTask().getCrc_link_type_val()))) {
                                                i6 = i8;
                                                i5 = i7;
                                            }
                                        }
                                    }
                                }
                            }
                            if (i5 >= 0 && i6 >= 0 && this.f36747b.getLayoutManager() != null && (findViewByPosition = this.f36747b.getLayoutManager().findViewByPosition(i4)) != null && (viewPager2 = (ViewPager2) findViewByPosition.findViewById(R.id.viewpager)) != null && (recyclerView = (RecyclerView) viewPager2.getChildAt(0)) != null && recyclerView.getLayoutManager() != null && (papaMainHomeRankAdapter = (PapaMainHomeRankAdapter) recyclerView.getAdapter()) != null && i5 < papaMainHomeRankAdapter.getItemCount() && (findViewByPosition2 = recyclerView.getLayoutManager().findViewByPosition(i5)) != null && (recyclerView2 = (RecyclerView) findViewByPosition2.findViewById(R.id.recyclerView)) != null && recyclerView2.getLayoutManager() != null && ((RankingItemV4Adapter) recyclerView2.getAdapter()) != null && i6 < papaMainHomeRankAdapter.getItemCount()) {
                                RecyclerView.ViewHolder findViewHolderForAdapterPosition4 = recyclerView2.findViewHolderForAdapterPosition(i6);
                                if (findViewHolderForAdapterPosition4 instanceof BaseViewHolder) {
                                    CommonGameInfoBean commonGameInfoBean4 = homeRankingListBean.getList().get(i5).get(i6);
                                    BaseViewHolder baseViewHolder3 = (BaseViewHolder) findViewHolderForAdapterPosition4;
                                    if (commonGameInfoBean4 != null && commonGameInfoBean4.getG_info() != null) {
                                        GInfoBean g_info3 = commonGameInfoBean4.getG_info();
                                        if (TextUtils.equals(downloadTask.getCrc_link_type_val(), g_info3.getId()) || (commonGameInfoBean4.getDownloadTask() != null && TextUtils.equals(downloadTask.getCrc_link_type_val(), commonGameInfoBean4.getDownloadTask().getCrc_link_type_val()))) {
                                            DownloadTask downloadTask4 = commonGameInfoBean4.getDownloadTask();
                                            if (downloadTask4 == null) {
                                                K0(baseViewHolder3, true, false);
                                                baseViewHolder3.setText(R.id.mgListviewItemInstall, "获取").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                if (UtilsMy.o0(g_info3.getTag_info())) {
                                                    if (com.join.android.app.common.utils.e.l0(this.f36754i).d(this.f36754i, g_info3.getPackage_name()) && UtilsMy.w0(g_info3.getPay_tag_info(), g_info3.getId()) == 0) {
                                                        APKUtils.a l6 = com.join.android.app.common.utils.e.l0(this.f36754i).l(this.f36754i, g_info3.getPackage_name());
                                                        if (com.join.mgps.Util.g2.i(g_info3.getVer()) && l6.d() < Integer.parseInt(g_info3.getVer())) {
                                                            baseViewHolder3.setText(R.id.mgListviewItemInstall, "更新").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_green_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_green_color));
                                                        } else {
                                                            baseViewHolder3.setText(R.id.mgListviewItemInstall, "启动").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_maincolor_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_main_color));
                                                        }
                                                    } else {
                                                        UtilsMy.w0(g_info3.getPay_tag_info(), g_info3.getId());
                                                        UtilsMy.g3((TextView) baseViewHolder3.getView(R.id.mgListviewItemInstall), baseViewHolder3.getView(R.id.rLayoutRight), g_info3);
                                                    }
                                                } else {
                                                    UtilsMy.w0(g_info3.getPay_tag_info(), g_info3.getId());
                                                    UtilsMy.g3((TextView) baseViewHolder3.getView(R.id.mgListviewItemInstall), baseViewHolder3.getView(R.id.rLayoutRight), g_info3);
                                                }
                                            } else {
                                                int status3 = downloadTask4.getStatus();
                                                if (UtilsMy.w0(g_info3.getPay_tag_info(), g_info3.getId()) > 0) {
                                                    status3 = 43;
                                                }
                                                if (status3 != 0) {
                                                    if (status3 == 27) {
                                                        baseViewHolder3.setText(R.id.mgListviewItemInstall, "暂停").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                    } else if (status3 == 48) {
                                                        baseViewHolder3.setText(R.id.mgListviewItemInstall, "安装中").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                        K0(baseViewHolder3, true, false);
                                                    } else {
                                                        if (status3 != 2) {
                                                            if (status3 != 3) {
                                                                if (status3 != 5) {
                                                                    if (status3 != 6) {
                                                                        if (status3 != 7) {
                                                                            if (status3 != 42) {
                                                                                if (status3 != 43) {
                                                                                    switch (status3) {
                                                                                        case 9:
                                                                                            baseViewHolder3.setText(R.id.mgListviewItemInstall, "更新").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_green_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_green_color));
                                                                                            K0(baseViewHolder3, true, false);
                                                                                            continue;
                                                                                        case 10:
                                                                                            K0(baseViewHolder3, false, false);
                                                                                            BaseViewHolder text7 = baseViewHolder3.setText(R.id.mgListviewItemInstall, "等待");
                                                                                            text7.setText(R.id.appSize, UtilsMy.g(downloadTask4.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask4.getSize())).setProgress(R.id.progressBar, (int) downloadTask4.getProgress()).setText(R.id.loding_info, "等待中").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                                                            continue;
                                                                                        case 11:
                                                                                            baseViewHolder3.setText(R.id.mgListviewItemInstall, "安装").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_green_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_green_color));
                                                                                            K0(baseViewHolder3, true, false);
                                                                                            continue;
                                                                                        case 12:
                                                                                            K0(baseViewHolder3, false, true);
                                                                                            baseViewHolder3.setText(R.id.appSize, UtilsMy.g(downloadTask4.getSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask4.getSize())).setText(R.id.loding_info, "解压中..").setProgress(R.id.progressBarZip, (int) downloadTask4.getProgress()).setText(R.id.mgListviewItemInstall, "解压中").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.extract).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_grey_color));
                                                                                            continue;
                                                                                        case 13:
                                                                                            K0(baseViewHolder3, false, true);
                                                                                            baseViewHolder3.setText(R.id.appSize, UtilsMy.g(downloadTask4.getSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask4.getSize())).setText(R.id.loding_info, "点击重新解压").setProgress(R.id.progressBarZip, (int) downloadTask4.getProgress()).setText(R.id.mgListviewItemInstall, "解压").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.reextract).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                                                            continue;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                baseViewHolder3.setText(R.id.mgListviewItemInstall, "启动").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_maincolor_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_main_color));
                                                                K0(baseViewHolder3, true, false);
                                                            }
                                                            K0(baseViewHolder3, false, false);
                                                            try {
                                                                BaseViewHolder text8 = baseViewHolder3.setText(R.id.mgListviewItemInstall, "继续");
                                                                text8.setText(R.id.appSize, UtilsMy.g(downloadTask4.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask4.getSize())).setProgress(R.id.progressBar, (int) downloadTask4.getProgress()).setText(R.id.loding_info, "暂停中").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                            } catch (Exception e12) {
                                                                e12.printStackTrace();
                                                            }
                                                        } else {
                                                            UtilsMy.x4(downloadTask4);
                                                            K0(baseViewHolder3, false, false);
                                                            try {
                                                                BaseViewHolder text9 = baseViewHolder3.setText(R.id.mgListviewItemInstall, "暂停");
                                                                BaseViewHolder progress3 = text9.setText(R.id.appSize, UtilsMy.g(downloadTask4.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask4.getSize())).setProgress(R.id.progressBar, (int) downloadTask4.getProgress());
                                                                StringBuilder sb3 = new StringBuilder();
                                                                sb3.append(downloadTask4.getSpeed());
                                                                sb3.append("/S");
                                                                progress3.setText(R.id.loding_info, sb3.toString()).setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                            } catch (Exception e13) {
                                                                e13.printStackTrace();
                                                            }
                                                        }
                                                        e11.printStackTrace();
                                                    }
                                                }
                                                baseViewHolder3.setText(R.id.mgListviewItemInstall, "获取").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                UtilsMy.w0(g_info3.getPay_tag_info(), g_info3.getId());
                                                UtilsMy.g3((TextView) baseViewHolder3.getView(R.id.mgListviewItemInstall), baseViewHolder3.getView(R.id.rLayoutRight), g_info3);
                                                K0(baseViewHolder3, true, false);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (itemType == 11) {
                        try {
                            commonGameInfoBean3 = (CommonGameInfoBean) commonMultiItemBean.getData();
                            findViewHolderForAdapterPosition3 = this.f36747b.findViewHolderForAdapterPosition(i4);
                        } catch (Exception e14) {
                            e14.printStackTrace();
                        }
                        if (findViewHolderForAdapterPosition3 instanceof BaseViewHolder) {
                            BaseViewHolder baseViewHolder4 = (BaseViewHolder) findViewHolderForAdapterPosition3;
                            if (commonGameInfoBean3 != null && commonGameInfoBean3.getG_info() != null) {
                                GInfoBean g_info4 = commonGameInfoBean3.getG_info();
                                if (TextUtils.equals(downloadTask.getCrc_link_type_val(), g_info4.getId()) || (commonGameInfoBean3.getDownloadTask() != null && TextUtils.equals(downloadTask.getCrc_link_type_val(), commonGameInfoBean3.getDownloadTask().getCrc_link_type_val()))) {
                                    DownloadTask downloadTask5 = commonGameInfoBean3.getDownloadTask();
                                    if (downloadTask5 == null) {
                                        baseViewHolder4.setText(R.id.downloadapp, "获取").setBackgroundRes(R.id.downloadapp, R.drawable.recom_blue_butn).setTextColor(R.id.downloadapp, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                        if (UtilsMy.o0(g_info4.getTag_info())) {
                                            if (com.join.android.app.common.utils.e.l0(this.f36754i).d(this.f36754i, g_info4.getPackage_name()) && UtilsMy.w0(g_info4.getPay_tag_info(), g_info4.getId()) == 0) {
                                                APKUtils.a l7 = com.join.android.app.common.utils.e.l0(this.f36754i).l(this.f36754i, g_info4.getPackage_name());
                                                if (com.join.mgps.Util.g2.i(g_info4.getVer()) && l7.d() < Integer.parseInt(g_info4.getVer())) {
                                                    baseViewHolder4.setText(R.id.downloadapp, "更新").setBackgroundRes(R.id.downloadapp, R.drawable.recom_green_butn).setTextColor(R.id.downloadapp, this.f36754i.getResources().getColor(R.color.app_green_color));
                                                } else {
                                                    baseViewHolder4.setText(R.id.downloadapp, "启动").setBackgroundRes(R.id.downloadapp, R.drawable.recom_maincolor_butn).setTextColor(R.id.downloadapp, this.f36754i.getResources().getColor(R.color.app_main_color));
                                                }
                                            } else {
                                                UtilsMy.w0(g_info4.getPay_tag_info(), g_info4.getId());
                                            }
                                        } else {
                                            UtilsMy.w0(g_info4.getPay_tag_info(), g_info4.getId());
                                        }
                                    } else {
                                        int status4 = downloadTask5.getStatus();
                                        if (UtilsMy.w0(g_info4.getPay_tag_info(), g_info4.getId()) > 0) {
                                            status4 = 43;
                                        }
                                        if (status4 != 0) {
                                            if (status4 == 27) {
                                                baseViewHolder4.setText(R.id.downloadapp, "暂停").setBackgroundRes(R.id.downloadapp, R.drawable.recom_blue_butn).setTextColor(R.id.downloadapp, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                            } else if (status4 == 48) {
                                                baseViewHolder4.setText(R.id.downloadapp, "安装中").setBackgroundRes(R.id.downloadapp, R.drawable.recom_blue_butn).setTextColor(R.id.downloadapp, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                            } else {
                                                if (status4 != 2) {
                                                    if (status4 != 3) {
                                                        if (status4 != 5) {
                                                            if (status4 != 6) {
                                                                if (status4 != 7) {
                                                                    if (status4 != 42) {
                                                                        if (status4 != 43) {
                                                                            switch (status4) {
                                                                                case 9:
                                                                                    baseViewHolder4.setText(R.id.downloadapp, "更新").setBackgroundRes(R.id.downloadapp, R.drawable.recom_green_butn).setTextColor(R.id.downloadapp, this.f36754i.getResources().getColor(R.color.app_green_color));
                                                                                    continue;
                                                                                case 10:
                                                                                    baseViewHolder4.setText(R.id.downloadapp, "等待").setBackgroundRes(R.id.downloadapp, R.drawable.recom_blue_butn).setTextColor(R.id.downloadapp, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                                                    continue;
                                                                                case 11:
                                                                                    baseViewHolder4.setText(R.id.downloadapp, "安装").setBackgroundRes(R.id.downloadapp, R.drawable.recom_green_butn).setTextColor(R.id.downloadapp, this.f36754i.getResources().getColor(R.color.app_green_color));
                                                                                    continue;
                                                                                case 12:
                                                                                    baseViewHolder4.setText(R.id.downloadapp, "解压中").setBackgroundRes(R.id.downloadapp, R.drawable.extract).setTextColor(R.id.downloadapp, this.f36754i.getResources().getColor(R.color.app_grey_color));
                                                                                    continue;
                                                                                case 13:
                                                                                    baseViewHolder4.setText(R.id.downloadapp, "解压").setBackgroundRes(R.id.downloadapp, R.drawable.reextract).setTextColor(R.id.downloadapp, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                                                    continue;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        baseViewHolder4.setText(R.id.downloadapp, "启动").setBackgroundRes(R.id.downloadapp, R.drawable.recom_maincolor_butn).setTextColor(R.id.downloadapp, this.f36754i.getResources().getColor(R.color.app_main_color));
                                                    }
                                                    try {
                                                        baseViewHolder4.setText(R.id.downloadapp, "继续").setBackgroundRes(R.id.downloadapp, R.drawable.recom_blue_butn).setTextColor(R.id.downloadapp, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                    } catch (Exception e15) {
                                                        e15.printStackTrace();
                                                    }
                                                } else {
                                                    UtilsMy.x4(downloadTask5);
                                                    try {
                                                        baseViewHolder4.setText(R.id.downloadapp, "暂停").setBackgroundRes(R.id.downloadapp, R.drawable.recom_blue_butn).setTextColor(R.id.downloadapp, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                                    } catch (Exception e16) {
                                                        e16.printStackTrace();
                                                    }
                                                }
                                                e14.printStackTrace();
                                            }
                                        }
                                        baseViewHolder4.setText(R.id.downloadapp, "获取").setBackgroundRes(R.id.downloadapp, R.drawable.recom_blue_butn).setTextColor(R.id.downloadapp, this.f36754i.getResources().getColor(R.color.app_blue_color));
                                        UtilsMy.w0(g_info4.getPay_tag_info(), g_info4.getId());
                                        UtilsMy.g3((TextView) baseViewHolder4.getView(R.id.downloadapp), baseViewHolder4.getView(R.id.rLayoutRight), g_info4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void K0(BaseViewHolder baseViewHolder, boolean z4, boolean z5) {
        boolean z6 = false;
        BaseViewHolder gone = baseViewHolder.setGone(R.id.mgListviewItemDescribe, z4).setGone(R.id.tipsLayout, z4).setGone(R.id.linearLayout2, !z4).setGone(R.id.progressBarZip, !z4 && z5);
        if (!z4 && !z5) {
            z6 = true;
        }
        gone.setGone(R.id.progressBar, z6);
    }

    private void L0() {
        View findViewByPosition;
        RecyclerView recyclerView;
        PapaMainHomeRankAdapter papaMainHomeRankAdapter;
        RecyclerView recyclerView2;
        HomeRankingListBean homeRankingListBean;
        RecyclerView recyclerView3;
        int i4;
        RecyclerView recyclerView4;
        int i5 = this.f36764s;
        if (i5 >= 0) {
            for (int i6 = i5; i6 <= Math.min(this.f36763r + 1, this.f36761p.getItemCount() - 1); i6++) {
                CommonMultiItemBean commonMultiItemBean = (CommonMultiItemBean) this.f36761p.getItem(i6);
                if (commonMultiItemBean != null) {
                    int itemType = commonMultiItemBean.getItemType();
                    if (itemType == 5) {
                        try {
                            CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) commonMultiItemBean.getData();
                            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.f36747b.findViewHolderForAdapterPosition(i6);
                            if (findViewHolderForAdapterPosition instanceof BaseViewHolder) {
                                BaseViewHolder baseViewHolder = (BaseViewHolder) findViewHolderForAdapterPosition;
                                if (commonGameInfoBean != null && commonGameInfoBean.getDownloadTask() != null) {
                                    DownloadTask downloadTask = commonGameInfoBean.getDownloadTask();
                                    DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                                    if (f5 != null) {
                                        baseViewHolder.setText(R.id.appSize, UtilsMy.g(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g((long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d)));
                                        if (downloadTask.getStatus() == 12) {
                                            baseViewHolder.setProgress(R.id.progressBarZip, (int) f5.getProgress());
                                        } else {
                                            baseViewHolder.setProgress(R.id.progressBar, (int) f5.getProgress());
                                        }
                                        if (downloadTask.getStatus() == 2) {
                                            baseViewHolder.setText(R.id.loding_info, f5.getSpeed() + "/S");
                                        }
                                    }
                                }
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    } else if (itemType == 7) {
                        try {
                            CommonGameInfoBean commonGameInfoBean2 = (CommonGameInfoBean) commonMultiItemBean.getData();
                            RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = this.f36747b.findViewHolderForAdapterPosition(i6);
                            if (findViewHolderForAdapterPosition2 instanceof BaseViewHolder) {
                                BaseViewHolder baseViewHolder2 = (BaseViewHolder) findViewHolderForAdapterPosition2;
                                if (commonGameInfoBean2 != null && commonGameInfoBean2.getDownloadTask() != null) {
                                    DownloadTask f6 = com.join.android.app.common.servcie.i.e().f(commonGameInfoBean2.getDownloadTask().getCrc_link_type_val());
                                    if (f6 != null) {
                                        baseViewHolder2.setText(R.id.appSize, UtilsMy.g(f6.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g((long) (Double.parseDouble(f6.getShowSize()) * 1024.0d * 1024.0d)));
                                    }
                                }
                            }
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                    } else if (itemType == 9) {
                        try {
                            HomeRankingListBean homeRankingListBean2 = (HomeRankingListBean) commonMultiItemBean.getData();
                            RecyclerView.LayoutManager layoutManager = this.f36747b.getLayoutManager();
                            if (layoutManager != null && (findViewByPosition = layoutManager.findViewByPosition(i6)) != null && (recyclerView = (RecyclerView) ((ViewPager2) findViewByPosition.findViewById(R.id.viewpager)).getChildAt(0)) != null && recyclerView.getLayoutManager() != null && (papaMainHomeRankAdapter = (PapaMainHomeRankAdapter) recyclerView.getAdapter()) != null) {
                                int itemCount = papaMainHomeRankAdapter.getItemCount();
                                int i7 = 0;
                                while (i7 < itemCount) {
                                    View findViewByPosition2 = recyclerView.getLayoutManager().findViewByPosition(i7);
                                    if (findViewByPosition2 != null && (recyclerView2 = (RecyclerView) findViewByPosition2.findViewById(R.id.recyclerView)) != null && recyclerView2.getLayoutManager() != null && ((RankingItemV4Adapter) recyclerView2.getAdapter()) != null) {
                                        int itemCount2 = papaMainHomeRankAdapter.getItemCount();
                                        int i8 = 0;
                                        while (i8 < itemCount2) {
                                            RecyclerView.ViewHolder findViewHolderForAdapterPosition3 = recyclerView2.findViewHolderForAdapterPosition(i8);
                                            if (findViewHolderForAdapterPosition3 instanceof BaseViewHolder) {
                                                CommonGameInfoBean commonGameInfoBean3 = homeRankingListBean2.getList().get(i7).get(i8);
                                                BaseViewHolder baseViewHolder3 = (BaseViewHolder) findViewHolderForAdapterPosition3;
                                                if (commonGameInfoBean3 != null && commonGameInfoBean3.getDownloadTask() != null) {
                                                    DownloadTask downloadTask2 = commonGameInfoBean3.getDownloadTask();
                                                    DownloadTask f7 = com.join.android.app.common.servcie.i.e().f(downloadTask2.getCrc_link_type_val());
                                                    if (f7 != null) {
                                                        recyclerView3 = recyclerView;
                                                        i4 = itemCount;
                                                        homeRankingListBean = homeRankingListBean2;
                                                        StringBuilder sb = new StringBuilder();
                                                        recyclerView4 = recyclerView2;
                                                        sb.append(UtilsMy.g(f7.getCurrentSize()));
                                                        sb.append(net.lingala.zip4j.util.e.F0);
                                                        sb.append(UtilsMy.g((long) (Double.parseDouble(f7.getShowSize()) * 1024.0d * 1024.0d)));
                                                        baseViewHolder3.setText(R.id.appSize, sb.toString());
                                                        if (downloadTask2.getStatus() == 12) {
                                                            baseViewHolder3.setProgress(R.id.progressBarZip, (int) f7.getProgress());
                                                        } else {
                                                            baseViewHolder3.setProgress(R.id.progressBar, (int) f7.getProgress());
                                                        }
                                                        if (downloadTask2.getStatus() == 2) {
                                                            baseViewHolder3.setText(R.id.loding_info, f7.getSpeed() + "/S");
                                                        }
                                                        i8++;
                                                        recyclerView = recyclerView3;
                                                        homeRankingListBean2 = homeRankingListBean;
                                                        recyclerView2 = recyclerView4;
                                                        itemCount = i4;
                                                    }
                                                }
                                            }
                                            homeRankingListBean = homeRankingListBean2;
                                            recyclerView3 = recyclerView;
                                            i4 = itemCount;
                                            recyclerView4 = recyclerView2;
                                            i8++;
                                            recyclerView = recyclerView3;
                                            homeRankingListBean2 = homeRankingListBean;
                                            recyclerView2 = recyclerView4;
                                            itemCount = i4;
                                        }
                                    }
                                    i7++;
                                    recyclerView = recyclerView;
                                    homeRankingListBean2 = homeRankingListBean2;
                                    itemCount = itemCount;
                                }
                            }
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    private CommonGameInfoBean N0(CommonGameInfoBean commonGameInfoBean) {
        if (commonGameInfoBean != null && commonGameInfoBean.getG_info() != null) {
            GInfoBean g_info = commonGameInfoBean.getG_info();
            Iterator<DownloadTask> it2 = p1.f.K().d().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                DownloadTask next = it2.next();
                if (TextUtils.equals(g_info.getMod_id(), next.getCrc_link_type_val())) {
                    commonGameInfoBean.setDownloadTask(next);
                    break;
                } else if (TextUtils.equals(g_info.getId(), next.getCrc_link_type_val())) {
                    commonGameInfoBean.setDownloadTask(next);
                }
            }
        }
        return commonGameInfoBean;
    }

    private HomeRankingListBean O0(HomeRankingListBean homeRankingListBean) {
        if (homeRankingListBean != null && homeRankingListBean.getList() != null && homeRankingListBean.getList().size() > 0) {
            for (DownloadTask downloadTask : p1.f.K().d()) {
                for (int i4 = 0; i4 < homeRankingListBean.getList().size(); i4++) {
                    List<CommonGameInfoBean> list = homeRankingListBean.getList().get(i4);
                    if (list != null) {
                        int i5 = 0;
                        while (true) {
                            if (i5 < list.size()) {
                                CommonGameInfoBean commonGameInfoBean = list.get(i5);
                                if (i4 == 0) {
                                    commonGameInfoBean.set_from(20501);
                                    commonGameInfoBean.set_from_type(20501);
                                    commonGameInfoBean.setExp_position("22-15-" + (i5 + 1));
                                } else if (i4 == 1) {
                                    commonGameInfoBean.set_from(20502);
                                    commonGameInfoBean.set_from_type(20502);
                                    commonGameInfoBean.setExp_position("22-16-" + (i5 + 1));
                                } else if (i4 == 2) {
                                    commonGameInfoBean.set_from(20503);
                                    commonGameInfoBean.set_from_type(20503);
                                    commonGameInfoBean.setExp_position("22-17-" + (i5 + 1));
                                }
                                if (commonGameInfoBean != null && commonGameInfoBean.getG_info() != null) {
                                    GInfoBean g_info = commonGameInfoBean.getG_info();
                                    if (TextUtils.equals(g_info.getMod_id(), downloadTask.getCrc_link_type_val())) {
                                        commonGameInfoBean.setDownloadTask(downloadTask);
                                        break;
                                    } else if (TextUtils.equals(g_info.getId(), downloadTask.getCrc_link_type_val())) {
                                        commonGameInfoBean.setDownloadTask(downloadTask);
                                    }
                                }
                                i5++;
                            }
                        }
                    }
                }
            }
        }
        return homeRankingListBean;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        if (this.f36767v == null) {
            this.f36767v = new Handler();
        }
        this.f36767v.post(this.f36768w);
    }

    private String o0(CommonGameInfoBean commonGameInfoBean) {
        if (commonGameInfoBean == null || commonGameInfoBean.getG_info() == null) {
            return null;
        }
        if (!TextUtils.isEmpty(commonGameInfoBean.getG_info().getId()) && !TextUtils.equals(commonGameInfoBean.getG_info().getId(), "0")) {
            return commonGameInfoBean.getG_info().getId();
        }
        return commonGameInfoBean.getG_info().getMod_id();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0() {
        SimpleDraweeView simpleDraweeView = this.f36751f;
        if (simpleDraweeView == null || this.f36771z || !this.A || simpleDraweeView.getVisibility() != 0) {
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f36751f, "translationX", this.f36754i.getResources().getDimension(R.dimen.wdp113), 0.0f).setDuration(150L);
        duration.addListener(new f());
        duration.start();
    }

    private void y0(DownloadTask downloadTask) {
        for (CommonGameInfoBean commonGameInfoBean : this.f36765t) {
            if (commonGameInfoBean.getG_info() != null && (TextUtils.equals(commonGameInfoBean.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(commonGameInfoBean.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                commonGameInfoBean.setDownloadTask(null);
            }
        }
        H0(downloadTask);
    }

    private void z0(DownloadTask downloadTask) {
        for (CommonGameInfoBean commonGameInfoBean : this.f36765t) {
            if (commonGameInfoBean.getG_info() != null && (TextUtils.equals(commonGameInfoBean.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(commonGameInfoBean.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                commonGameInfoBean.setDownloadTask(downloadTask);
            }
        }
        H0(downloadTask);
    }

    @Override // com.join.mgps.adapter.PapaMainV4Adapter.e
    public void B(CommonGameInfoBean commonGameInfoBean) {
        if (commonGameInfoBean == null) {
            return;
        }
        GInfoBean g_info = commonGameInfoBean.getG_info();
        DownloadTask downloadTask = commonGameInfoBean.getDownloadTask();
        if (g_info != null) {
            String plugin_num = g_info.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentUtil.getInstance().intentActivity(this.f36754i, commonGameInfoBean.getIntentDataBean());
                return;
            }
        }
        if (downloadTask == null) {
            if (g_info != null && UtilsMy.o0(g_info.getTag_info())) {
                if (commonGameInfoBean.isModGameVm()) {
                    if (com.join.android.app.common.utils.e.l0(this.f36754i).d(this.f36754i, g_info.getPackage_name())) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f36754i).l(this.f36754i, g_info.getPackage_name());
                        if (!com.join.mgps.Util.g2.i(g_info.getVer()) || l4.d() >= Integer.parseInt(g_info.getVer())) {
                            com.join.android.app.common.utils.e.l0(this.f36754i);
                            APKUtils.a0(this.f36754i, g_info.getPackage_name());
                            return;
                        }
                    }
                } else {
                    boolean d5 = com.join.android.app.common.utils.e.l0(this.f36754i).d(this.f36754i, g_info.getPackage_name());
                    boolean F = com.join.mgps.va.overmind.d.o().F(g_info.getPackage_name());
                    if (d5 || F) {
                        com.join.android.app.common.utils.e.l0(this.f36754i);
                        APKUtils.Y(this.f36754i, g_info.getId(), g_info.getMod_id());
                        return;
                    }
                }
            }
            if (UtilsMy.y0(g_info.getPay_tag_info(), g_info.getId()) > 0) {
                UtilsMy.d4(this.f36754i, g_info.getId());
                return;
            } else {
                UtilsMy.F2(this.f36754i, commonGameInfoBean);
                return;
            }
        }
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        downloadTask.set_from(commonGameInfoBean.get_from());
        downloadTask.set_from_type(commonGameInfoBean.get_from_type());
        if (g_info != null && UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) > 0) {
            status = 43;
        }
        if (status != 0) {
            if (status != 13) {
                if (status != 2) {
                    if (status != 3) {
                        if (status == 5) {
                            UtilsMy.T3(this.f36754i, downloadTask);
                            return;
                        } else if (status != 6) {
                            if (status != 7) {
                                if (status == 42) {
                                    UtilsMy.r4(this.f36754i, downloadTask);
                                    return;
                                } else if (status != 43) {
                                    switch (status) {
                                        case 9:
                                            if (!com.join.android.app.common.utils.j.j(this.f36754i)) {
                                                com.join.mgps.Util.l2.a(this.f36754i).b("无网络连接");
                                                return;
                                            } else {
                                                UtilsMy.I2(this.f36754i, downloadTask);
                                                return;
                                            }
                                        case 10:
                                            break;
                                        case 11:
                                            UtilsMy.a4(downloadTask, this.f36754i);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                            }
                        }
                    }
                    com.php25.PDownload.d.c(downloadTask, this.f36754i);
                    return;
                }
                com.php25.PDownload.d.i(downloadTask);
                return;
            }
            com.php25.PDownload.d.l(this.f36754i, downloadTask);
            return;
        }
        if (g_info != null) {
            if (UtilsMy.y0(g_info.getPay_tag_info(), g_info.getId()) > 0) {
                UtilsMy.d4(this.f36754i, g_info.getId());
            } else if (UtilsMy.o1(this.f36754i, downloadTask)) {
            } else {
                if (g_info.getDown_state().intValue() == 5) {
                    UtilsMy.l1(this.f36754i, downloadTask);
                } else {
                    UtilsMy.R0(this.f36754i, downloadTask, downloadTask.getTp_down_url(), downloadTask.getOther_down_switch(), downloadTask.getCdn_down_switch());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void C0(PapaHomeBeanV9 papaHomeBeanV9) {
        this.f36752g.homeAllDataV3().g(JsonMapper.toJsonString(papaHomeBeanV9));
    }

    @Override // com.join.mgps.adapter.PapaMainV4Adapter.e
    public void D(CommonGameInfoBean commonGameInfoBean) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G0(HomeFloatData homeFloatData) {
        try {
            List<RecomDatabean> pendant = homeFloatData.getPendant();
            if (this.f36751f != null) {
                if (pendant != null && pendant.size() > 0) {
                    RecomDatabean recomDatabean = pendant.get(0);
                    this.f36770y = recomDatabean;
                    if (recomDatabean != null && recomDatabean.getMain().getAd_switch() == 1) {
                        this.f36751f.setVisibility(0);
                        if (com.join.mgps.Util.g2.i(this.f36770y.getMain().getPic_remote())) {
                            if (!this.f36769x.equals(this.f36770y.getMain().getPic_remote())) {
                                this.f36769x = this.f36770y.getMain().getPic_remote();
                                MyImageLoader.d(this.f36751f, R.drawable.translate_drawable, this.f36770y.getMain().getPic_remote());
                            }
                        } else {
                            this.f36751f.setVisibility(8);
                        }
                    } else {
                        this.f36751f.setVisibility(8);
                    }
                } else {
                    this.f36751f.setVisibility(8);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void I0(PapaHomeBeanV9 papaHomeBeanV9, int i4, boolean z4) {
        if (papaHomeBeanV9 != null) {
            int i5 = R.dimen.wdp38;
            int i6 = 4;
            int i7 = 0;
            if (i4 == 1) {
                try {
                    this.f36760o.clear();
                    this.f36759n = z4;
                    D0(papaHomeBeanV9);
                    if (papaHomeBeanV9.getBanner() != null && papaHomeBeanV9.getBanner().size() > 0) {
                        int i8 = 0;
                        while (i8 < papaHomeBeanV9.getBanner().size()) {
                            CommonGameInfoBean commonGameInfoBean = papaHomeBeanV9.getBanner().get(i8);
                            commonGameInfoBean.setPosition(i8);
                            commonGameInfoBean.set_from(IjkMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM);
                            commonGameInfoBean.set_from_type(IjkMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM);
                            StringBuilder sb = new StringBuilder();
                            sb.append("22-19-");
                            i8++;
                            sb.append(i8);
                            commonGameInfoBean.setExp_position(sb.toString());
                        }
                        this.f36760o.add(new CommonMultiItemBean(1, papaHomeBeanV9.getBanner()));
                    }
                    if (papaHomeBeanV9.getFast_entry() != null && papaHomeBeanV9.getFast_entry().size() > 0) {
                        for (int i9 = 0; i9 < papaHomeBeanV9.getFast_entry().size(); i9++) {
                            CommonGameInfoBean commonGameInfoBean2 = papaHomeBeanV9.getFast_entry().get(i9);
                            commonGameInfoBean2.setPosition(i9);
                            this.f36760o.add(new CommonMultiItemBean(2, commonGameInfoBean2));
                        }
                    }
                    if (papaHomeBeanV9.getTop_channel() != null && papaHomeBeanV9.getTop_channel().getDiscover() != null) {
                        this.f36760o.add(new CommonMultiItemBean(3, papaHomeBeanV9.getTop_channel().getDiscover()));
                    }
                    if (papaHomeBeanV9.getEo_playing() != null && papaHomeBeanV9.getEo_playing().size() > 0) {
                        this.f36760o.add(new CommonMultiItemBean(12, Float.valueOf(getResources().getDimension(R.dimen.wdp32))));
                        this.f36760o.add(new CommonMultiItemBean(4, "大家都在玩"));
                        int i10 = 0;
                        while (i10 < papaHomeBeanV9.getEo_playing().size()) {
                            CommonGameInfoBean N0 = N0(papaHomeBeanV9.getEo_playing().get(i10));
                            N0.set_from(201);
                            N0.set_from_type(201);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("22-4-");
                            i10++;
                            sb2.append(i10);
                            N0.setExp_position(sb2.toString());
                            CommonMultiItemBean commonMultiItemBean = new CommonMultiItemBean(5, N0);
                            this.f36765t.add(N0);
                            this.f36760o.add(commonMultiItemBean);
                        }
                    }
                    if (papaHomeBeanV9.getTop_channel() != null) {
                        this.f36760o.add(new CommonMultiItemBean(12, Float.valueOf(getResources().getDimension(R.dimen.wdp38))));
                        this.f36760o.add(new CommonMultiItemBean(4, "悟饭专栏"));
                        this.f36760o.add(new CommonMultiItemBean(12, Float.valueOf(getResources().getDimension(R.dimen.wdp24))));
                        this.f36760o.add(new CommonMultiItemBean(6, papaHomeBeanV9.getTop_channel()));
                    }
                    if (papaHomeBeanV9.getNew_online_game() != null && papaHomeBeanV9.getNew_online_game().getMiddle() != null && papaHomeBeanV9.getNew_online_game().getMiddle().size() > 0) {
                        this.f36760o.add(new CommonMultiItemBean(12, Float.valueOf(getResources().getDimension(R.dimen.wdp38))));
                        if (papaHomeBeanV9.getNew_online_game().getTop() != null && papaHomeBeanV9.getNew_online_game().getTop().get(0) != null && !TextUtils.isEmpty(papaHomeBeanV9.getNew_online_game().getTop().get(0).getMain_title())) {
                            this.f36760o.add(new CommonMultiItemBean(4, papaHomeBeanV9.getNew_online_game().getTop().get(0).getMain_title()));
                        } else {
                            this.f36760o.add(new CommonMultiItemBean(4, "热门游戏推荐"));
                        }
                        if (papaHomeBeanV9.getNew_online_game().getMiddle() != null) {
                            List<CommonGameInfoBean> middle = papaHomeBeanV9.getNew_online_game().getMiddle();
                            int i11 = 0;
                            while (i11 < middle.size()) {
                                CommonGameInfoBean N02 = N0(middle.get(i11));
                                N02.set_from(IjkMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM);
                                N02.set_from_type(IjkMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("22-20-");
                                int i12 = i11 + 1;
                                sb3.append(i12);
                                N02.setExp_position(sb3.toString());
                                if (i11 == 0) {
                                    this.f36760o.add(new CommonMultiItemBean(12, Float.valueOf(getResources().getDimension(R.dimen.wdp24))));
                                    this.f36760o.add(new CommonMultiItemBean(7, N02));
                                    this.f36765t.add(N02);
                                } else {
                                    this.f36760o.add(new CommonMultiItemBean(5, N02));
                                    this.f36765t.add(N02);
                                }
                                i11 = i12;
                            }
                        }
                    }
                    if (papaHomeBeanV9.getRanking_list() != null) {
                        HomeRankingListBean O0 = O0(papaHomeBeanV9.getRanking_list());
                        this.f36760o.add(new CommonMultiItemBean(12, Float.valueOf(getResources().getDimension(R.dimen.wdp38))));
                        this.f36760o.add(new CommonMultiItemBean(9, O0));
                        if (O0.getList() != null) {
                            for (List<CommonGameInfoBean> list : papaHomeBeanV9.getRanking_list().getList()) {
                                if (list != null) {
                                    this.f36765t.addAll(list);
                                }
                            }
                        }
                    }
                    if (papaHomeBeanV9.getHot_game_fav() != null && papaHomeBeanV9.getHot_game_fav().size() > 0) {
                        this.f36760o.add(new CommonMultiItemBean(12, Float.valueOf(getResources().getDimension(R.dimen.wdp38))));
                        this.f36760o.add(new CommonMultiItemBean(4, "热门游戏单"));
                        this.f36760o.add(new CommonMultiItemBean(12, Float.valueOf(getResources().getDimension(R.dimen.wdp24))));
                        this.f36760o.add(new CommonMultiItemBean(10, papaHomeBeanV9.getHot_game_fav()));
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return;
                }
            }
            if (papaHomeBeanV9.getDynamic_module() != null && papaHomeBeanV9.getDynamic_module().size() > 0) {
                for (HomeDynamicListBean homeDynamicListBean : papaHomeBeanV9.getDynamic_module()) {
                    if (homeDynamicListBean.getTop() != null && homeDynamicListBean.getTop().get(i7) != null && !TextUtils.isEmpty(homeDynamicListBean.getTop().get(i7).getMain_title())) {
                        this.f36760o.add(new CommonMultiItemBean(12, Float.valueOf(getResources().getDimension(i5))));
                        this.f36760o.add(new CommonMultiItemBean(i6, homeDynamicListBean.getTop().get(i7).getMain_title()));
                    } else if (homeDynamicListBean.getMiddle() != null && homeDynamicListBean.getMiddle().size() > 0) {
                        Iterator<CommonGameInfoBean> it2 = homeDynamicListBean.getMiddle().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            CommonGameInfoBean next = it2.next();
                            if (TextUtils.isEmpty(next.getMain_title())) {
                                this.f36760o.add(new CommonMultiItemBean(12, Float.valueOf(getResources().getDimension(i5))));
                                this.f36760o.add(new CommonMultiItemBean(i6, next.getMain_title()));
                                break;
                            }
                        }
                    }
                    if (homeDynamicListBean.getMiddle() != null) {
                        List<CommonGameInfoBean> middle2 = homeDynamicListBean.getMiddle();
                        int dynamic_module_tpl_type = homeDynamicListBean.getDynamic_module_tpl_type();
                        if (dynamic_module_tpl_type == 1) {
                            for (int i13 = 0; i13 < middle2.size(); i13++) {
                                CommonGameInfoBean N03 = N0(middle2.get(i13));
                                N03.set_from(206);
                                N03.set_from_type(206);
                                this.f36766u++;
                                N03.setExp_position("22-18-" + this.f36766u);
                                if (i13 == 0) {
                                    this.f36760o.add(new CommonMultiItemBean(12, Float.valueOf(getResources().getDimension(R.dimen.wdp24))));
                                    this.f36760o.add(new CommonMultiItemBean(7, N03));
                                    this.f36765t.add(N03);
                                } else {
                                    this.f36760o.add(new CommonMultiItemBean(5, N03));
                                    this.f36765t.add(N03);
                                }
                            }
                        } else if (dynamic_module_tpl_type == 2) {
                            this.f36760o.add(new CommonMultiItemBean(12, Float.valueOf(getResources().getDimension(R.dimen.wdp24))));
                            for (CommonGameInfoBean commonGameInfoBean3 : middle2) {
                                CommonGameInfoBean N04 = N0(commonGameInfoBean3);
                                N04.set_from(206);
                                N04.set_from_type(206);
                                this.f36766u++;
                                N04.setExp_position("22-18-" + this.f36766u);
                            }
                            this.f36760o.add(new CommonMultiItemBean(8, middle2));
                        }
                    }
                    i5 = R.dimen.wdp38;
                    i6 = 4;
                    i7 = 0;
                }
            }
            if (papaHomeBeanV9.getGuess_you_like() != null && papaHomeBeanV9.getGuess_you_like().size() > 0) {
                for (CommonGameInfoBean commonGameInfoBean4 : papaHomeBeanV9.getGuess_you_like()) {
                    CommonGameInfoBean N05 = N0(commonGameInfoBean4);
                    N05.set_from(206);
                    N05.set_from_type(206);
                    this.f36766u++;
                    N05.setExp_position("22-18-" + this.f36766u);
                    this.f36760o.add(new CommonMultiItemBean(11, N05));
                    this.f36765t.add(N05);
                }
            }
            this.f36761p.setNewData(this.f36760o);
            if (i4 == 1) {
                m0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void J0() {
        XQuickRecyclerView xQuickRecyclerView = this.f36747b;
        if (xQuickRecyclerView != null) {
            xQuickRecyclerView.stopRefresh();
            this.f36747b.stopLoadMore();
        }
    }

    void M0(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    A0(downloadTask);
                    return;
                case 3:
                    y0(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    B0(downloadTask);
                    return;
                case 6:
                    z0(downloadTask);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.B})
    public void W() {
        if (this.f36756k) {
            return;
        }
        this.f36758m = 1;
        this.f36757l = true;
        this.f36747b.reset();
        w0(this.f36758m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f36754i = getContext();
        com.join.mgps.Util.d0.a().d(this);
        PapaMainV4Adapter papaMainV4Adapter = new PapaMainV4Adapter(this.f36754i, this);
        this.f36761p = papaMainV4Adapter;
        this.f36747b.setAdapter(papaMainV4Adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f36754i, 10);
        gridLayoutManager.setSpanSizeLookup(new a());
        this.f36747b.setLayoutManager(gridLayoutManager);
        this.f36747b.setPtrFrameLayout(this.f36748c);
        this.f36747b.setLoadingListener(new b());
        this.f36747b.setPreLoadCount(10);
        this.f36747b.addOnScrollListener(new c());
        this.f36765t = new ArrayList();
        v0();
        n0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0() {
        if (com.join.android.app.common.utils.j.j(this.f36754i)) {
            try {
                HomeFloatData data = com.join.mgps.rpc.impl.d.P1().K0(p0()).getMessages().getData();
                if (data != null) {
                    G0(data);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.Util.d0.a().e(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            M0(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    M0(a5, 6);
                    return;
                } else if (c5 == 7) {
                    M0(a5, 3);
                    return;
                } else if (c5 == 8) {
                    L0();
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            M0(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            M0(a5, 8);
                            return;
                        case 13:
                            M0(a5, 9);
                            return;
                        default:
                            return;
                    }
                }
            }
            M0(a5, 5);
        } else {
            M0(a5, 2);
        }
    }

    @Override // com.join.mgps.adapter.PapaMainV4Adapter.e
    public void p(List<CommonGameInfoBean> list, int i4) {
    }

    public CommonRequestBean p0() {
        return RequestBeanUtil.getInstance(this.f36754i).getFloatadRequestBean();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String q0() {
        return this.f36762q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0() {
        if (this.f36767v == null) {
            this.f36767v = new Handler();
        }
        this.f36767v.postDelayed(new Runnable() { // from class: com.join.mgps.activity.q2
            @Override // java.lang.Runnable
            public final void run() {
                PapaMainV4SubHomeFragment.this.u0();
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        this.f36758m = 1;
        this.f36757l = true;
        this.f36747b.reset();
        w0(this.f36758m);
    }

    @Override // com.join.mgps.adapter.PapaMainV4Adapter.e
    public void s(CommonGameInfoBean commonGameInfoBean) {
        if (commonGameInfoBean.isHasExposure()) {
            return;
        }
        E0(commonGameInfoBean);
        commonGameInfoBean.setHasExposure(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s0() {
        SimpleDraweeView simpleDraweeView = this.f36751f;
        if (simpleDraweeView == null || this.f36771z || this.A || simpleDraweeView.getVisibility() != 0) {
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f36751f, "translationX", 0.0f, this.f36754i.getResources().getDimension(R.dimen.wdp113)).setDuration(250L);
        duration.addListener(new e());
        duration.start();
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
        LinearLayout linearLayout = this.f36749d;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f36750e;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XQuickRecyclerView xQuickRecyclerView = this.f36747b;
        if (xQuickRecyclerView != null) {
            xQuickRecyclerView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f36750e;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f36749d;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XQuickRecyclerView xQuickRecyclerView = this.f36747b;
        if (xQuickRecyclerView != null) {
            xQuickRecyclerView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain() {
        com.join.mgps.Util.v0.c("显示主界面main");
        LinearLayout linearLayout = this.f36750e;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f36749d;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XQuickRecyclerView xQuickRecyclerView = this.f36747b;
        if (xQuickRecyclerView != null) {
            xQuickRecyclerView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void t0() {
        try {
            if (com.join.mgps.Util.g2.i(this.f36770y.getMain().getPic_remote())) {
                IntentUtil.getInstance().intentActivity(this.f36754i, this.f36770y.getSub().get(0).getIntentDataBean());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void v0() {
        String d5 = this.f36752g.homeAllDataV4().d();
        PapaHomeBeanV9 papaHomeBeanV9 = com.join.mgps.Util.g2.i(d5) ? (PapaHomeBeanV9) JsonMapper.getInstance().fromJson(d5, PapaHomeBeanV9.class) : null;
        if (papaHomeBeanV9 != null) {
            I0(papaHomeBeanV9, 1, false);
            showMain();
            this.f36753h = false;
        } else {
            this.f36753h = true;
        }
        w0(this.f36758m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w0(int r9) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.PapaMainV4SubHomeFragment.w0(int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x0() {
        XQuickRecyclerView xQuickRecyclerView = this.f36747b;
        if (xQuickRecyclerView != null) {
            xQuickRecyclerView.setNoMore();
        }
        r0();
    }

    @Override // com.join.mgps.adapter.PapaMainV4Adapter.e
    public void y(List<CommonGameInfoBean> list) {
        for (CommonGameInfoBean commonGameInfoBean : list) {
            if (!commonGameInfoBean.isHasExposure()) {
                E0(commonGameInfoBean);
                commonGameInfoBean.setHasExposure(true);
            }
        }
    }

    @Override // com.join.mgps.adapter.PapaMainV4Adapter.e
    public void z(List<GameFromPopoWinBeanV2.DataBean> list, int i4) {
        for (int i5 = 0; i5 <= i4; i5++) {
            GameFromPopoWinBeanV2.DataBean dataBean = list.get(i5);
            if (!dataBean.isHasExposure()) {
                F0(dataBean, i5);
            }
        }
    }
}
