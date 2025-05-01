package com.join.mgps.adapter;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.EverdayNewGameActivity;
import com.join.kotlin.ui.findgame.data.IntentClassfyEvent;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.base.BaseMultiItemQuickAdapter;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.CommonMultiItemBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GInfoBean;
import com.join.mgps.dto.GameFromPopoWinBeanV2;
import com.join.mgps.dto.HomeRankingListBean;
import com.join.mgps.dto.HomeTopChannelBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.papa.sim.statistic.ExtFrom;
import com.papa91.arc.view.GlideImageLoader;
import com.youth.banner.Banner;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* loaded from: classes4.dex */
public class PapaMainV4Adapter extends BaseMultiItemQuickAdapter<CommonMultiItemBean, BaseViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    public static final int f43992f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f43993g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f43994h = 3;

    /* renamed from: i  reason: collision with root package name */
    public static final int f43995i = 4;

    /* renamed from: j  reason: collision with root package name */
    public static final int f43996j = 5;

    /* renamed from: k  reason: collision with root package name */
    public static final int f43997k = 6;

    /* renamed from: l  reason: collision with root package name */
    public static final int f43998l = 7;

    /* renamed from: m  reason: collision with root package name */
    public static final int f43999m = 8;

    /* renamed from: n  reason: collision with root package name */
    public static final int f44000n = 9;

    /* renamed from: o  reason: collision with root package name */
    public static final int f44001o = 10;

    /* renamed from: p  reason: collision with root package name */
    public static final int f44002p = 11;

    /* renamed from: q  reason: collision with root package name */
    public static final int f44003q = 12;

    /* renamed from: d  reason: collision with root package name */
    private Context f44004d;

    /* renamed from: e  reason: collision with root package name */
    private e f44005e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ViewPager.OnPageChangeListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f44006b;

        a(List list) {
            this.f44006b = list;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            if (PapaMainV4Adapter.this.f44005e != null) {
                PapaMainV4Adapter.this.f44005e.s((CommonGameInfoBean) this.f44006b.get(i4));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TabLayout f44008a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HomeRankingListBean f44009b;

        b(TabLayout tabLayout, HomeRankingListBean homeRankingListBean) {
            this.f44008a = tabLayout;
            this.f44009b = homeRankingListBean;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i4, float f5, int i5) {
            this.f44008a.setScrollPosition(i4, f5, true, false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i4) {
            super.onPageSelected(i4);
            if (this.f44008a.getTabAt(i4) != null) {
                this.f44008a.getTabAt(i4).select();
            }
            if (PapaMainV4Adapter.this.f44005e != null) {
                PapaMainV4Adapter.this.f44005e.y(this.f44009b.getList().get(i4));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements TabLayout.OnTabSelectedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewPager2 f44011a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TabLayout f44012b;

        c(ViewPager2 viewPager2, TabLayout tabLayout) {
            this.f44011a = viewPager2;
            this.f44012b = tabLayout;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            this.f44011a.setCurrentItem(tab.getPosition());
            for (int i4 = 0; i4 < this.f44012b.getTabCount(); i4++) {
                TabLayout.Tab tabAt = this.f44012b.getTabAt(i4);
                if (tabAt != null && tabAt.getCustomView() != null) {
                    TextView textView = (TextView) tabAt.getCustomView().findViewById(R.id.tabText);
                    textView.setTextSize(0, PapaMainV4Adapter.this.f44004d.getResources().getDimension(tabAt.isSelected() ? R.dimen.wdp32 : R.dimen.wdp28));
                    textView.setTypeface(null, tabAt.isSelected() ? 1 : 0);
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            this.f44011a.setCurrentItem(tab.getPosition());
            for (int i4 = 0; i4 < this.f44012b.getTabCount(); i4++) {
                TabLayout.Tab tabAt = this.f44012b.getTabAt(i4);
                if (tabAt != null && tabAt.getCustomView() != null) {
                    TextView textView = (TextView) tabAt.getCustomView().findViewById(R.id.tabText);
                    textView.setTextSize(0, PapaMainV4Adapter.this.f44004d.getResources().getDimension(tabAt.isSelected() ? R.dimen.wdp32 : R.dimen.wdp28));
                    textView.setTypeface(null, tabAt.isSelected() ? 1 : 0);
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView f44014a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f44015b;

        d(RecyclerView recyclerView, List list) {
            this.f44014a = recyclerView;
            this.f44015b = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f44014a.getLayoutManager();
            if (linearLayoutManager != null) {
                int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                if (PapaMainV4Adapter.this.f44005e != null) {
                    PapaMainV4Adapter.this.f44005e.z(this.f44015b, findLastCompletelyVisibleItemPosition);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface e {
        void B(CommonGameInfoBean commonGameInfoBean);

        void D(CommonGameInfoBean commonGameInfoBean);

        void p(List<CommonGameInfoBean> list, int i4);

        void s(CommonGameInfoBean commonGameInfoBean);

        void y(List<CommonGameInfoBean> list);

        void z(List<GameFromPopoWinBeanV2.DataBean> list, int i4);
    }

    public PapaMainV4Adapter(Context context, e eVar) {
        super(null);
        this.f44004d = context;
        this.f44005e = eVar;
        a(1, R.layout.layout_papa_main_home_v4_banner);
        a(2, R.layout.layout_papa_main_home_v4_fast_entry);
        a(3, R.layout.layout_papa_main_home_v4_discovery);
        a(4, R.layout.layout_papa_main_home_v4_title);
        a(5, R.layout.layout_papa_main_home_v4_game_list);
        a(6, R.layout.layout_papa_main_home_v4_wufun_column);
        a(7, R.layout.papamain_video_banner_layout);
        a(8, R.layout.layout_papa_main_home_v4_horizontal_game);
        a(9, R.layout.layout_papa_main_home_v4_rank);
        a(10, R.layout.choice_gamelist_layout);
        a(11, R.layout.layout_papa_main_home_v4_guess_like_recommend);
        a(12, R.layout.papamain_item_spacing_layout);
    }

    private void A(BaseViewHolder baseViewHolder, CommonMultiItemBean commonMultiItemBean) {
        try {
        } catch (Exception e5) {
            e5.printStackTrace();
            return;
        }
        if (commonMultiItemBean.getData() instanceof CommonGameInfoBean) {
            final CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) commonMultiItemBean.getData();
            GInfoBean g_info = commonGameInfoBean.getG_info();
            MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.mgListviewItemIcon), g_info == null ? commonGameInfoBean.getBig_pic() : TextUtils.isEmpty(g_info.getGif_ico()) ? g_info.getIco() : g_info.getGif_ico());
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.l4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PapaMainV4Adapter.this.M(commonGameInfoBean, view);
                }
            });
            baseViewHolder.getView(R.id.mgListviewItemInstall).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.p4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PapaMainV4Adapter.this.N(commonGameInfoBean, view);
                }
            });
            baseViewHolder.setText(R.id.mgListviewItemAppname, g_info == null ? commonGameInfoBean.getTitle() : g_info.getName()).setText(R.id.mgListviewItemDescribe, commonGameInfoBean.getG_info().getInfo());
            if (g_info != null) {
                UtilsMy.O(String.valueOf(g_info.getScore()), g_info.getDown_count(), g_info.getApp_size(), g_info.getSp_tag_info(), g_info.getTag_info(), (LinearLayout) baseViewHolder.getView(R.id.tipsLayout), this.f44004d, false);
            }
            if (commonGameInfoBean.getJp_info() != null && commonGameInfoBean.getJp_info().getLink_type().intValue() != 1) {
                baseViewHolder.setText(R.id.mgListviewItemInstall, "打开").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color)).setText(R.id.mgListviewItemAppname, commonGameInfoBean.getTitle()).setText(R.id.mgListviewItemDescribe, commonGameInfoBean.getSub_title());
                Y(baseViewHolder, true, false);
                return;
            }
            if (g_info != null) {
                if ((ConstantIntEnum.H5.value() + "").equals(g_info.getPlugin_num())) {
                    baseViewHolder.setText(R.id.mgListviewItemInstall, "开始").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color)).setText(R.id.mgListviewItemAppname, commonGameInfoBean.getTitle()).setText(R.id.mgListviewItemDescribe, commonGameInfoBean.getSub_title());
                    Y(baseViewHolder, true, false);
                    return;
                }
            }
            DownloadTask downloadTask = commonGameInfoBean.getDownloadTask();
            if (downloadTask == null) {
                Y(baseViewHolder, true, false);
                baseViewHolder.setText(R.id.mgListviewItemInstall, "获取").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color));
                if (g_info == null) {
                    return;
                }
                if (UtilsMy.o0(g_info.getTag_info())) {
                    if (com.join.android.app.common.utils.e.l0(this.f44004d).d(this.f44004d, g_info.getPackage_name()) && UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) == 0) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f44004d).l(this.f44004d, g_info.getPackage_name());
                        if (com.join.mgps.Util.g2.i(g_info.getVer()) && l4.d() < Integer.parseInt(g_info.getVer())) {
                            baseViewHolder.setText(R.id.mgListviewItemInstall, "更新").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_green_butn).setTextColor(R.id.mgListviewItemInstall, this.f44004d.getResources().getColor(R.color.app_green_color));
                            return;
                        } else {
                            baseViewHolder.setText(R.id.mgListviewItemInstall, "启动").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_maincolor_butn).setTextColor(R.id.mgListviewItemInstall, this.f44004d.getResources().getColor(R.color.app_main_color));
                            return;
                        }
                    }
                    UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                    UtilsMy.g3((TextView) baseViewHolder.getView(R.id.mgListviewItemInstall), baseViewHolder.getView(R.id.rLayoutRight), g_info);
                    return;
                }
                UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                UtilsMy.g3((TextView) baseViewHolder.getView(R.id.mgListviewItemInstall), baseViewHolder.getView(R.id.rLayoutRight), g_info);
                return;
            }
            int status = (g_info == null || UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) <= 0) ? downloadTask.getStatus() : 43;
            if (status != 0) {
                if (status == 27) {
                    baseViewHolder.setText(R.id.mgListviewItemInstall, "暂停").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color));
                    return;
                } else if (status == 48) {
                    baseViewHolder.setText(R.id.mgListviewItemInstall, "安装中").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color));
                    Y(baseViewHolder, true, false);
                    return;
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
                                                        baseViewHolder.setText(R.id.mgListviewItemInstall, "更新").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_green_butn).setTextColor(R.id.mgListviewItemInstall, this.f44004d.getResources().getColor(R.color.app_green_color));
                                                        Y(baseViewHolder, true, false);
                                                        return;
                                                    case 10:
                                                        Y(baseViewHolder, false, false);
                                                        BaseViewHolder text = baseViewHolder.setText(R.id.mgListviewItemInstall, "等待");
                                                        text.setText(R.id.appSize, UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask.getSize())).setProgress(R.id.progressBar, (int) downloadTask.getProgress()).setText(R.id.loding_info, "等待中").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color));
                                                        return;
                                                    case 11:
                                                        baseViewHolder.setText(R.id.mgListviewItemInstall, "安装").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_green_butn).setTextColor(R.id.mgListviewItemInstall, this.f44004d.getResources().getColor(R.color.app_green_color));
                                                        Y(baseViewHolder, true, false);
                                                        return;
                                                    case 12:
                                                        Y(baseViewHolder, false, true);
                                                        baseViewHolder.setText(R.id.appSize, UtilsMy.g(downloadTask.getSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask.getSize())).setText(R.id.loding_info, "解压中..").setProgress(R.id.progressBarZip, (int) downloadTask.getProgress()).setText(R.id.mgListviewItemInstall, "解压中").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.extract).setTextColor(R.id.mgListviewItemInstall, this.f44004d.getResources().getColor(R.color.app_grey_color));
                                                        return;
                                                    case 13:
                                                        Y(baseViewHolder, false, true);
                                                        baseViewHolder.setText(R.id.appSize, UtilsMy.g(downloadTask.getSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask.getSize())).setText(R.id.loding_info, "点击重新解压").setProgress(R.id.progressBarZip, (int) downloadTask.getProgress()).setText(R.id.mgListviewItemInstall, "解压").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.reextract).setTextColor(R.id.mgListviewItemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color));
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            baseViewHolder.setText(R.id.mgListviewItemInstall, "启动").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_maincolor_butn).setTextColor(R.id.mgListviewItemInstall, this.f44004d.getResources().getColor(R.color.app_main_color));
                            Y(baseViewHolder, true, false);
                            return;
                        }
                        Y(baseViewHolder, false, false);
                        try {
                            BaseViewHolder text2 = baseViewHolder.setText(R.id.mgListviewItemInstall, "继续");
                            text2.setText(R.id.appSize, UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask.getSize())).setProgress(R.id.progressBar, (int) downloadTask.getProgress()).setText(R.id.loding_info, "暂停中").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color));
                            return;
                        } catch (Exception e6) {
                            e6.printStackTrace();
                            return;
                        }
                    }
                    UtilsMy.x4(downloadTask);
                    Y(baseViewHolder, false, false);
                    try {
                        BaseViewHolder text3 = baseViewHolder.setText(R.id.mgListviewItemInstall, "暂停");
                        BaseViewHolder progress = text3.setText(R.id.appSize, UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask.getSize())).setProgress(R.id.progressBar, (int) downloadTask.getProgress());
                        StringBuilder sb = new StringBuilder();
                        sb.append(downloadTask.getSpeed());
                        sb.append("/S");
                        progress.setText(R.id.loding_info, sb.toString()).setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color));
                        return;
                    } catch (Exception e7) {
                        e7.printStackTrace();
                        return;
                    }
                    e5.printStackTrace();
                    return;
                }
            }
            baseViewHolder.setText(R.id.mgListviewItemInstall, "获取").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color));
            if (g_info != null) {
                UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                UtilsMy.g3((TextView) baseViewHolder.getView(R.id.mgListviewItemInstall), baseViewHolder.getView(R.id.rLayoutRight), g_info);
            }
            Y(baseViewHolder, true, false);
        }
    }

    private void B(BaseViewHolder baseViewHolder, CommonMultiItemBean commonMultiItemBean) {
        try {
            if (commonMultiItemBean.getData() instanceof List) {
                List list = (List) commonMultiItemBean.getData();
                RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R.id.recycleView);
                HomeGameListAdapter homeGameListAdapter = new HomeGameListAdapter(this.f44004d, list);
                recyclerView.setLayoutManager(new LinearLayoutManager(this.f44004d, 0, false));
                recyclerView.setAdapter(homeGameListAdapter);
                recyclerView.addOnScrollListener(new d(recyclerView, list));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void C(BaseViewHolder baseViewHolder, CommonMultiItemBean commonMultiItemBean) {
        try {
            if (commonMultiItemBean.getData() instanceof HomeRankingListBean) {
                HomeRankingListBean homeRankingListBean = (HomeRankingListBean) commonMultiItemBean.getData();
                ViewPager2 viewPager2 = (ViewPager2) baseViewHolder.getView(R.id.viewpager);
                TabLayout tabLayout = (TabLayout) baseViewHolder.getView(R.id.tablayout);
                String txt = homeRankingListBean.getTxt();
                if (TextUtils.isEmpty(txt)) {
                    return;
                }
                String[] split = txt.split(",");
                viewPager2.setAdapter(new PapaMainHomeRankAdapter(homeRankingListBean.getList(), this.f44005e));
                tabLayout.removeAllTabs();
                for (String str : split) {
                    TabLayout.Tab customView = tabLayout.newTab().setCustomView(R.layout.layout_custom_tab_main_game);
                    if (customView.getCustomView() != null) {
                        ((TextView) customView.getCustomView().findViewById(R.id.tabText)).setText(str);
                        tabLayout.addTab(customView);
                    }
                }
                viewPager2.registerOnPageChangeCallback(new b(tabLayout, homeRankingListBean));
                tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new c(viewPager2, tabLayout));
                baseViewHolder.getView(R.id.rank_more).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.g4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PapaMainV4Adapter.O(view);
                    }
                });
                tabLayout.selectTab(tabLayout.getTabAt(0));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void D(BaseViewHolder baseViewHolder, CommonMultiItemBean commonMultiItemBean) {
        if (commonMultiItemBean.getData() instanceof CommonGameInfoBean) {
            final CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) commonMultiItemBean.getData();
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.o4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PapaMainV4Adapter.this.P(commonGameInfoBean, view);
                }
            });
            baseViewHolder.getView(R.id.downloadapp).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.n4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PapaMainV4Adapter.this.Q(commonGameInfoBean, view);
                }
            });
            MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.appimage), commonGameInfoBean.getBig_pic());
            baseViewHolder.setText(R.id.appname, commonGameInfoBean.getG_info() == null ? commonGameInfoBean.getTitle() : commonGameInfoBean.getG_info().getName());
            GInfoBean g_info = commonGameInfoBean.getG_info();
            if (commonGameInfoBean.getJp_info() != null && commonGameInfoBean.getJp_info().getLink_type().intValue() != 1) {
                baseViewHolder.setText(R.id.downloadapp, "打开").setBackgroundRes(R.id.downloadapp, R.drawable.recom_blue_butn).setTextColor(R.id.downloadapp, this.f44004d.getResources().getColor(R.color.app_blue_color));
                return;
            }
            if (g_info != null) {
                if ((ConstantIntEnum.H5.value() + "").equals(g_info.getPlugin_num())) {
                    baseViewHolder.setText(R.id.downloadapp, "开始").setBackgroundRes(R.id.downloadapp, R.drawable.recom_blue_butn).setTextColor(R.id.downloadapp, this.f44004d.getResources().getColor(R.color.app_blue_color));
                    return;
                }
            }
            DownloadTask downloadTask = commonGameInfoBean.getDownloadTask();
            if (downloadTask == null) {
                baseViewHolder.setText(R.id.downloadapp, "获取").setBackgroundRes(R.id.downloadapp, R.drawable.recom_blue_butn).setTextColor(R.id.downloadapp, this.f44004d.getResources().getColor(R.color.app_blue_color));
                if (g_info == null) {
                    return;
                }
                if (UtilsMy.o0(g_info.getTag_info())) {
                    if (com.join.android.app.common.utils.e.l0(this.f44004d).d(this.f44004d, g_info.getPackage_name()) && UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) == 0) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f44004d).l(this.f44004d, g_info.getPackage_name());
                        if (com.join.mgps.Util.g2.i(g_info.getVer()) && l4.d() < Integer.parseInt(g_info.getVer())) {
                            baseViewHolder.setText(R.id.downloadapp, "更新").setBackgroundRes(R.id.downloadapp, R.drawable.recom_green_butn).setTextColor(R.id.downloadapp, this.f44004d.getResources().getColor(R.color.app_green_color));
                            return;
                        } else {
                            baseViewHolder.setText(R.id.downloadapp, "启动").setBackgroundRes(R.id.downloadapp, R.drawable.recom_maincolor_butn).setTextColor(R.id.downloadapp, this.f44004d.getResources().getColor(R.color.app_main_color));
                            return;
                        }
                    }
                    UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                    return;
                }
                UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                return;
            }
            int status = downloadTask.getStatus();
            if (g_info != null && UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 27) {
                    baseViewHolder.setText(R.id.downloadapp, "暂停").setBackgroundRes(R.id.downloadapp, R.drawable.recom_blue_butn).setTextColor(R.id.downloadapp, this.f44004d.getResources().getColor(R.color.app_blue_color));
                    return;
                } else if (status == 48) {
                    baseViewHolder.setText(R.id.downloadapp, "安装中").setBackgroundRes(R.id.downloadapp, R.drawable.recom_blue_butn).setTextColor(R.id.downloadapp, this.f44004d.getResources().getColor(R.color.app_blue_color));
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
                                                    baseViewHolder.setText(R.id.downloadapp, "更新").setBackgroundRes(R.id.downloadapp, R.drawable.recom_green_butn).setTextColor(R.id.downloadapp, this.f44004d.getResources().getColor(R.color.app_green_color));
                                                    return;
                                                case 10:
                                                    baseViewHolder.setText(R.id.downloadapp, "等待").setBackgroundRes(R.id.downloadapp, R.drawable.recom_blue_butn).setTextColor(R.id.downloadapp, this.f44004d.getResources().getColor(R.color.app_blue_color));
                                                    return;
                                                case 11:
                                                    baseViewHolder.setText(R.id.downloadapp, "安装").setBackgroundRes(R.id.downloadapp, R.drawable.recom_green_butn).setTextColor(R.id.downloadapp, this.f44004d.getResources().getColor(R.color.app_green_color));
                                                    return;
                                                case 12:
                                                    baseViewHolder.setText(R.id.downloadapp, "解压中").setBackgroundRes(R.id.downloadapp, R.drawable.extract).setTextColor(R.id.downloadapp, this.f44004d.getResources().getColor(R.color.app_grey_color));
                                                    return;
                                                case 13:
                                                    baseViewHolder.setText(R.id.downloadapp, "解压").setBackgroundRes(R.id.downloadapp, R.drawable.reextract).setTextColor(R.id.downloadapp, this.f44004d.getResources().getColor(R.color.app_blue_color));
                                                    return;
                                                default:
                                                    return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        baseViewHolder.setText(R.id.downloadapp, "启动").setBackgroundRes(R.id.downloadapp, R.drawable.recom_maincolor_butn).setTextColor(R.id.downloadapp, this.f44004d.getResources().getColor(R.color.app_main_color));
                        return;
                    }
                    try {
                        baseViewHolder.setText(R.id.downloadapp, "继续").setBackgroundRes(R.id.downloadapp, R.drawable.recom_blue_butn).setTextColor(R.id.downloadapp, this.f44004d.getResources().getColor(R.color.app_blue_color));
                        return;
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        return;
                    }
                } else {
                    UtilsMy.x4(downloadTask);
                    try {
                        baseViewHolder.setText(R.id.downloadapp, "暂停").setBackgroundRes(R.id.downloadapp, R.drawable.recom_blue_butn).setTextColor(R.id.downloadapp, this.f44004d.getResources().getColor(R.color.app_blue_color));
                        return;
                    } catch (Exception e6) {
                        e6.printStackTrace();
                        return;
                    }
                }
            }
            baseViewHolder.setText(R.id.downloadapp, "获取").setBackgroundRes(R.id.downloadapp, R.drawable.recom_blue_butn).setTextColor(R.id.downloadapp, this.f44004d.getResources().getColor(R.color.app_blue_color));
            if (g_info != null) {
                UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                UtilsMy.g3((TextView) baseViewHolder.getView(R.id.downloadapp), baseViewHolder.getView(R.id.rLayoutRight), g_info);
            }
        }
    }

    private void E(BaseViewHolder baseViewHolder, CommonMultiItemBean commonMultiItemBean) {
        float floatValue = ((Float) commonMultiItemBean.getData()).floatValue();
        View view = baseViewHolder.getView(R.id.spacingView);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) floatValue;
        view.setLayoutParams(layoutParams);
    }

    private void F(BaseViewHolder baseViewHolder, CommonMultiItemBean commonMultiItemBean) {
        try {
            if (commonMultiItemBean.getData() instanceof String) {
                baseViewHolder.setText(R.id.title, (String) commonMultiItemBean.getData());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void G(BaseViewHolder baseViewHolder, CommonMultiItemBean commonMultiItemBean) {
        try {
        } catch (Exception e5) {
            e5.printStackTrace();
            return;
        }
        if (commonMultiItemBean.getData() instanceof CommonGameInfoBean) {
            final CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) commonMultiItemBean.getData();
            GInfoBean g_info = commonGameInfoBean.getG_info();
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.j4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PapaMainV4Adapter.this.S(commonGameInfoBean, view);
                }
            });
            baseViewHolder.getView(R.id.itemInstall).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.q4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PapaMainV4Adapter.this.R(commonGameInfoBean, view);
                }
            });
            MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.bannerView), commonGameInfoBean.getBig_pic());
            MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.gameIcon), g_info == null ? commonGameInfoBean.getBig_pic() : TextUtils.isEmpty(g_info.getGif_ico()) ? g_info.getIco() : g_info.getGif_ico());
            baseViewHolder.setText(R.id.appname, g_info == null ? commonGameInfoBean.getTitle() : g_info.getName());
            if (g_info != null) {
                UtilsMy.O(String.valueOf(g_info.getScore()), g_info.getDown_count(), g_info.getApp_size(), g_info.getSp_tag_info(), g_info.getTag_info(), (LinearLayout) baseViewHolder.getView(R.id.tipsLayout), this.f44004d, false);
            }
            if (commonGameInfoBean.getJp_info() != null && commonGameInfoBean.getJp_info().getLink_type().intValue() != 1) {
                baseViewHolder.setText(R.id.itemInstall, "打开").setBackgroundRes(R.id.itemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.itemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color)).setText(R.id.appname, commonGameInfoBean.getTitle());
                return;
            }
            if (g_info != null) {
                if ((ConstantIntEnum.H5.value() + "").equals(g_info.getPlugin_num())) {
                    baseViewHolder.setText(R.id.itemInstall, "开始").setBackgroundRes(R.id.itemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.itemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color)).setText(R.id.appname, commonGameInfoBean.getTitle()).setText(R.id.mgListviewItemDescribe, commonGameInfoBean.getSub_title());
                    return;
                }
            }
            DownloadTask downloadTask = commonGameInfoBean.getDownloadTask();
            if (downloadTask == null) {
                baseViewHolder.setText(R.id.itemInstall, "获取").setBackgroundRes(R.id.itemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.itemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color));
                if (g_info == null) {
                    return;
                }
                if (UtilsMy.o0(g_info.getTag_info())) {
                    if (com.join.android.app.common.utils.e.l0(this.f44004d).d(this.f44004d, g_info.getPackage_name()) && UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) == 0) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f44004d).l(this.f44004d, g_info.getPackage_name());
                        if (com.join.mgps.Util.g2.i(g_info.getVer()) && l4.d() < Integer.parseInt(g_info.getVer())) {
                            baseViewHolder.setText(R.id.itemInstall, "更新").setBackgroundRes(R.id.itemInstall, R.drawable.recom_green_butn).setTextColor(R.id.itemInstall, this.f44004d.getResources().getColor(R.color.app_green_color));
                            return;
                        } else {
                            baseViewHolder.setText(R.id.itemInstall, "启动").setBackgroundRes(R.id.itemInstall, R.drawable.recom_maincolor_butn).setTextColor(R.id.itemInstall, this.f44004d.getResources().getColor(R.color.app_main_color));
                            return;
                        }
                    }
                    UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                    UtilsMy.g3((TextView) baseViewHolder.getView(R.id.itemInstall), baseViewHolder.getView(R.id.rLayoutRight), g_info);
                    return;
                }
                UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                UtilsMy.g3((TextView) baseViewHolder.getView(R.id.itemInstall), baseViewHolder.getView(R.id.rLayoutRight), g_info);
                return;
            }
            int status = downloadTask.getStatus();
            if (g_info != null && UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 27) {
                    baseViewHolder.setText(R.id.itemInstall, "暂停").setBackgroundRes(R.id.itemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.itemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color));
                    return;
                } else if (status == 48) {
                    baseViewHolder.setText(R.id.itemInstall, "安装中").setBackgroundRes(R.id.itemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.itemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color));
                    return;
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
                                                        baseViewHolder.setText(R.id.itemInstall, "更新").setBackgroundRes(R.id.itemInstall, R.drawable.recom_green_butn).setTextColor(R.id.itemInstall, this.f44004d.getResources().getColor(R.color.app_green_color));
                                                        return;
                                                    case 10:
                                                        BaseViewHolder text = baseViewHolder.setText(R.id.itemInstall, "等待");
                                                        text.setText(R.id.appSize, UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask.getSize())).setText(R.id.loding_info, "等待中").setBackgroundRes(R.id.itemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.itemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color));
                                                        return;
                                                    case 11:
                                                        baseViewHolder.setText(R.id.itemInstall, "安装").setBackgroundRes(R.id.itemInstall, R.drawable.recom_green_butn).setTextColor(R.id.itemInstall, this.f44004d.getResources().getColor(R.color.app_green_color));
                                                        return;
                                                    case 12:
                                                        baseViewHolder.setText(R.id.appSize, UtilsMy.g(downloadTask.getSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask.getSize())).setText(R.id.loding_info, "解压中..").setText(R.id.itemInstall, "解压中").setBackgroundRes(R.id.itemInstall, R.drawable.extract).setTextColor(R.id.itemInstall, this.f44004d.getResources().getColor(R.color.app_grey_color));
                                                        return;
                                                    case 13:
                                                        baseViewHolder.setText(R.id.appSize, UtilsMy.g(downloadTask.getSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask.getSize())).setText(R.id.loding_info, "点击重新解压").setText(R.id.itemInstall, "解压").setBackgroundRes(R.id.itemInstall, R.drawable.reextract).setTextColor(R.id.itemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color));
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            baseViewHolder.setText(R.id.itemInstall, "启动").setBackgroundRes(R.id.itemInstall, R.drawable.recom_maincolor_butn).setTextColor(R.id.itemInstall, this.f44004d.getResources().getColor(R.color.app_main_color));
                            return;
                        }
                        try {
                            BaseViewHolder text2 = baseViewHolder.setText(R.id.itemInstall, "继续");
                            text2.setText(R.id.appSize, UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask.getSize())).setText(R.id.loding_info, "暂停中").setBackgroundRes(R.id.itemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.itemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color));
                            return;
                        } catch (Exception e6) {
                            e6.printStackTrace();
                            return;
                        }
                    }
                    UtilsMy.x4(downloadTask);
                    try {
                        BaseViewHolder text3 = baseViewHolder.setText(R.id.itemInstall, "暂停");
                        BaseViewHolder text4 = text3.setText(R.id.appSize, UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask.getSize()));
                        StringBuilder sb = new StringBuilder();
                        sb.append(downloadTask.getSpeed());
                        sb.append("/S");
                        text4.setText(R.id.loding_info, sb.toString()).setBackgroundRes(R.id.itemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.itemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color));
                        return;
                    } catch (Exception e7) {
                        e7.printStackTrace();
                        return;
                    }
                    e5.printStackTrace();
                    return;
                }
            }
            baseViewHolder.setText(R.id.itemInstall, "获取").setBackgroundRes(R.id.itemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.itemInstall, this.f44004d.getResources().getColor(R.color.app_blue_color));
            if (g_info != null) {
                UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                UtilsMy.g3((TextView) baseViewHolder.getView(R.id.itemInstall), baseViewHolder.getView(R.id.rLayoutRight), g_info);
            }
        }
    }

    private void H(BaseViewHolder baseViewHolder, CommonMultiItemBean commonMultiItemBean) {
        if (commonMultiItemBean.getData() instanceof HomeTopChannelBean) {
            final HomeTopChannelBean homeTopChannelBean = (HomeTopChannelBean) commonMultiItemBean.getData();
            if (homeTopChannelBean.getTheNew() != null) {
                baseViewHolder.setText(R.id.tv_new_count, homeTopChannelBean.getTheNew().getCount() + "款");
                baseViewHolder.getView(R.id.img_new).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.e4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PapaMainV4Adapter.this.T(view);
                    }
                });
                RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R.id.rv_new);
                recyclerView.setLayoutManager(new LinearLayoutManager(this.f44004d, 0, false));
                PapaMainDailyNewAdapter papaMainDailyNewAdapter = new PapaMainDailyNewAdapter(homeTopChannelBean.getTheNew().getList());
                papaMainDailyNewAdapter.setOnItemClickListener(new BaseQuickAdapter.j() { // from class: com.join.mgps.adapter.h4
                    @Override // com.join.mgps.base.BaseQuickAdapter.j
                    public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                        PapaMainV4Adapter.this.U(baseQuickAdapter, view, i4);
                    }
                });
                recyclerView.setAdapter(papaMainDailyNewAdapter);
            }
            if (homeTopChannelBean.getAd_info() != null) {
                MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.img_ad), homeTopChannelBean.getAd_info().getBig_pic());
                baseViewHolder.getView(R.id.img_ad).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.r4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PapaMainV4Adapter.this.V(homeTopChannelBean, view);
                    }
                });
            }
            if (homeTopChannelBean.getBroadcast() != null) {
                baseViewHolder.setText(R.id.dzg_sub_title, homeTopChannelBean.getBroadcast().getSub_title());
                MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.dzg_img), homeTopChannelBean.getBroadcast().getBig_pic());
                baseViewHolder.getView(R.id.card_dzg).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.f4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PapaMainV4Adapter.this.W(homeTopChannelBean, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(List list, int i4) {
        IntentUtil.getInstance().intentActivity(this.f44004d, ((CommonGameInfoBean) list.get(i4)).getIntentDataBean());
        X("1-" + (i4 + 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(CommonGameInfoBean commonGameInfoBean, View view) {
        IntentUtil.getInstance().intentActivity(this.f44004d, commonGameInfoBean.getIntentDataBean());
        X("3-1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(CommonGameInfoBean commonGameInfoBean, View view) {
        IntentUtil.getInstance().intentActivity(this.f44004d, commonGameInfoBean.getIntentDataBean());
        X("2-" + (commonGameInfoBean.getPosition() + 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(CommonGameInfoBean commonGameInfoBean, View view) {
        IntentUtil.getInstance().intentActivity(this.f44004d, commonGameInfoBean.getIntentDataBean());
        X(commonGameInfoBean.getExp_position());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(CommonGameInfoBean commonGameInfoBean, View view) {
        e eVar = this.f44005e;
        if (eVar != null) {
            eVar.B(commonGameInfoBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O(View view) {
        com.join.mgps.Util.d0.a().c(new IntentClassfyEvent(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(CommonGameInfoBean commonGameInfoBean, View view) {
        IntentUtil.getInstance().intentActivity(this.f44004d, commonGameInfoBean.getIntentDataBean());
        X(commonGameInfoBean.getExp_position());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(CommonGameInfoBean commonGameInfoBean, View view) {
        e eVar = this.f44005e;
        if (eVar != null) {
            eVar.B(commonGameInfoBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(CommonGameInfoBean commonGameInfoBean, View view) {
        e eVar = this.f44005e;
        if (eVar != null) {
            eVar.B(commonGameInfoBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(CommonGameInfoBean commonGameInfoBean, View view) {
        IntentUtil.getInstance().intentActivity(this.f44004d, commonGameInfoBean.getIntentDataBean());
        X(commonGameInfoBean.getExp_position());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(View view) {
        this.f44004d.startActivity(new Intent(this.f44004d, EverdayNewGameActivity.class));
        X("3-3");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        this.f44004d.startActivity(new Intent(this.f44004d, EverdayNewGameActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(HomeTopChannelBean homeTopChannelBean, View view) {
        IntentDateBean intentDataBean = homeTopChannelBean.getAd_info().getIntentDataBean();
        ExtBean extBean = new ExtBean();
        extBean.setFrom("20004");
        extBean.set_from_type(IjkMediaPlayer.FFP_PROP_INT64_AUDIO_DECODER);
        intentDataBean.setExtBean(extBean);
        IntentUtil.getInstance().intentActivity(this.f44004d, intentDataBean);
        X("3-4");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(HomeTopChannelBean homeTopChannelBean, View view) {
        IntentUtil.getInstance().intentActivity(this.f44004d, homeTopChannelBean.getBroadcast().getIntentDataBean());
        X("3-2");
    }

    private void X(String str) {
        com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(this.f44004d);
        String name = ExtFrom.home.name();
        l4.t(name, "22-" + str, AccountUtil_.getInstance_(this.f44004d).getUid());
    }

    private void Y(BaseViewHolder baseViewHolder, boolean z4, boolean z5) {
        boolean z6 = false;
        BaseViewHolder gone = baseViewHolder.setGone(R.id.mgListviewItemDescribe, z4).setGone(R.id.tipsLayout, z4).setGone(R.id.linearLayout2, !z4).setGone(R.id.progressBarZip, !z4 && z5);
        if (!z4 && !z5) {
            z6 = true;
        }
        gone.setGone(R.id.progressBar, z6);
    }

    private void x(BaseViewHolder baseViewHolder, CommonMultiItemBean commonMultiItemBean) {
        try {
            if (commonMultiItemBean.getData() instanceof List) {
                final List<CommonGameInfoBean> list = (List) commonMultiItemBean.getData();
                Banner banner = (Banner) baseViewHolder.getView(R.id.banner);
                ArrayList arrayList = new ArrayList();
                for (CommonGameInfoBean commonGameInfoBean : list) {
                    arrayList.add(commonGameInfoBean.getBig_pic());
                }
                String str = BaseQuickAdapter.TAG;
                if (TextUtils.equals((CharSequence) banner.getTag(), str)) {
                    return;
                }
                banner.z(arrayList).y(new GlideImageLoader()).D(new m3.b() { // from class: com.join.mgps.adapter.i4
                    @Override // m3.b
                    public final void OnBannerClick(int i4) {
                        PapaMainV4Adapter.this.J(list, i4);
                    }
                }).setOnPageChangeListener(new a(list));
                banner.setTag(str);
                banner.I();
                e eVar = this.f44005e;
                if (eVar != null) {
                    eVar.s((CommonGameInfoBean) list.get(0));
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void y(BaseViewHolder baseViewHolder, CommonMultiItemBean commonMultiItemBean) {
        try {
            if (commonMultiItemBean.getData() instanceof CommonGameInfoBean) {
                final CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) commonMultiItemBean.getData();
                if (commonGameInfoBean.getG_info() != null && commonGameInfoBean.getG_info().getIcon() != null) {
                    MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.img_discovery), commonGameInfoBean.getG_info().getIcon());
                } else {
                    MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.img_discovery), commonGameInfoBean.getBig_pic());
                }
                baseViewHolder.setText(R.id.tv_discovery, commonGameInfoBean.getLabel());
                baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.m4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PapaMainV4Adapter.this.K(commonGameInfoBean, view);
                    }
                });
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void z(BaseViewHolder baseViewHolder, CommonMultiItemBean commonMultiItemBean) {
        try {
            if (commonMultiItemBean.getData() instanceof CommonGameInfoBean) {
                final CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) commonMultiItemBean.getData();
                baseViewHolder.setText(R.id.name, commonGameInfoBean.getTitle());
                MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.icon), commonGameInfoBean.getBig_pic());
                baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.k4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PapaMainV4Adapter.this.L(commonGameInfoBean, view);
                    }
                });
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: I */
    public void convert(@NonNull BaseViewHolder baseViewHolder, CommonMultiItemBean commonMultiItemBean) {
        switch (commonMultiItemBean.getItemType()) {
            case 1:
                x(baseViewHolder, commonMultiItemBean);
                return;
            case 2:
                z(baseViewHolder, commonMultiItemBean);
                return;
            case 3:
                y(baseViewHolder, commonMultiItemBean);
                return;
            case 4:
                F(baseViewHolder, commonMultiItemBean);
                return;
            case 5:
                A(baseViewHolder, commonMultiItemBean);
                return;
            case 6:
                H(baseViewHolder, commonMultiItemBean);
                return;
            case 7:
                G(baseViewHolder, commonMultiItemBean);
                return;
            case 8:
            default:
                return;
            case 9:
                C(baseViewHolder, commonMultiItemBean);
                return;
            case 10:
                B(baseViewHolder, commonMultiItemBean);
                return;
            case 11:
                D(baseViewHolder, commonMultiItemBean);
                return;
            case 12:
                E(baseViewHolder, commonMultiItemBean);
                return;
        }
    }
}
