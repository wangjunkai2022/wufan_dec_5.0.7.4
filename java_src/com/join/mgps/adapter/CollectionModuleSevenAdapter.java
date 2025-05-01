package com.join.mgps.adapter;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.MultiStandVideo;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.base.BaseMultiItemQuickAdapter;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.CollectionSevenListBean;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GInfoBean;
import com.join.mgps.dto.TipBean;
import com.join.mgps.enums.ConstantIntEnum;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class CollectionModuleSevenAdapter extends BaseMultiItemQuickAdapter<CollectionSevenListBean, BaseViewHolder> {

    /* renamed from: e  reason: collision with root package name */
    public static final int f39895e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f39896f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f39897g = 3;

    /* renamed from: h  reason: collision with root package name */
    public static final int f39898h = 4;

    /* renamed from: i  reason: collision with root package name */
    public static final int f39899i = 5;

    /* renamed from: d  reason: collision with root package name */
    private com.join.android.app.component.video.g f39900d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements BaseQuickAdapter.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f39901a;

        a(ArrayList arrayList) {
            this.f39901a = arrayList;
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.j
        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
            IntentUtil.getInstance().intentActivity(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext, ((CommonGameInfoBean) this.f39901a.get(i4)).getIntentDataBean());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends w1.p {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommonGameInfoBean f39903b;

        b(CommonGameInfoBean commonGameInfoBean) {
            this.f39903b = commonGameInfoBean;
        }

        @Override // w1.p, s2.h
        public void onClickBlank(String str, Object... objArr) {
            super.onClickBlank(str, objArr);
            IntentUtil.getInstance().intentActivity(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext, this.f39903b.getIntentDataBean());
        }

        @Override // w1.p, w1.q
        public void onClickCover() {
            super.onClickCover();
            IntentUtil.getInstance().intentActivity(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext, this.f39903b.getIntentDataBean());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements BaseQuickAdapter.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f39905a;

        c(ArrayList arrayList) {
            this.f39905a = arrayList;
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.j
        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
            IntentUtil.getInstance().intentActivity(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext, ((CommonGameInfoBean) this.f39905a.get(i4)).getIntentDataBean());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements BaseQuickAdapter.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f39907a;

        d(ArrayList arrayList) {
            this.f39907a = arrayList;
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.h
        public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
            CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) this.f39907a.get(i4);
            if (commonGameInfoBean.getJp_info() != null && commonGameInfoBean.getJp_info().getLink_type().intValue() != 1) {
                IntentUtil.getInstance().intentActivity(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext, commonGameInfoBean.getIntentDataBean());
            } else if (commonGameInfoBean.getG_info() == null) {
            } else {
                DownloadTask downloadTask = commonGameInfoBean.getDownloadTask();
                GInfoBean g_info = commonGameInfoBean.getG_info();
                String plugin_num = g_info.getPlugin_num();
                if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                    IntentDateBean intentDataBean = commonGameInfoBean.getIntentDataBean();
                    UtilsMy.T2(downloadTask, ((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext);
                    IntentUtil.getInstance().intentActivity(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext, intentDataBean);
                } else if (downloadTask == null) {
                    if (UtilsMy.o0(g_info.getTag_info()) && com.join.android.app.common.utils.e.l0(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext).d(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext, g_info.getPackage_name())) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext).l(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext, g_info.getPackage_name());
                        if (!com.join.mgps.Util.g2.i(g_info.getVer()) || l4.d() >= Integer.parseInt(g_info.getVer())) {
                            com.join.android.app.common.utils.e.l0(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext);
                            APKUtils.a0(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext, g_info.getPackage_name());
                            return;
                        }
                    }
                    if (UtilsMy.y0(g_info.getPay_tag_info(), g_info.getId()) > 0) {
                        UtilsMy.d4(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext, g_info.getId());
                    } else {
                        UtilsMy.F2(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext, commonGameInfoBean);
                    }
                } else {
                    int status = downloadTask != null ? downloadTask.getStatus() : 0;
                    downloadTask.set_from(commonGameInfoBean.get_from());
                    downloadTask.set_from_type(commonGameInfoBean.get_from_type());
                    if (UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) > 0) {
                        status = 43;
                    }
                    if (status != 0) {
                        if (status == 13) {
                            com.php25.PDownload.d.l(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext, downloadTask);
                            return;
                        }
                        if (status != 2) {
                            if (status != 3) {
                                if (status == 5) {
                                    UtilsMy.T3(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext, downloadTask);
                                    return;
                                } else if (status != 6) {
                                    if (status != 7) {
                                        if (status == 42) {
                                            UtilsMy.r4(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext, downloadTask);
                                            return;
                                        } else if (status != 43) {
                                            switch (status) {
                                                case 9:
                                                    if (!com.join.android.app.common.utils.j.j(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext)) {
                                                        com.join.mgps.Util.l2.a(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext).b("无网络连接");
                                                        return;
                                                    } else {
                                                        UtilsMy.I2(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext, downloadTask);
                                                        return;
                                                    }
                                                case 10:
                                                    break;
                                                case 11:
                                                    UtilsMy.a4(downloadTask, ((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext);
                                                    return;
                                                default:
                                                    return;
                                            }
                                        }
                                    }
                                }
                            }
                            com.php25.PDownload.d.c(downloadTask, ((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext);
                            return;
                        }
                        com.php25.PDownload.d.i(downloadTask);
                        return;
                    }
                    CollectionModuleSevenAdapter.this.G(commonGameInfoBean);
                    UtilsMy.F2(((BaseQuickAdapter) CollectionModuleSevenAdapter.this).mContext, commonGameInfoBean);
                }
            }
        }
    }

    public CollectionModuleSevenAdapter(List<CollectionSevenListBean> list, com.join.android.app.component.video.g gVar) {
        super(list);
        this.f39900d = gVar;
        a(1, R.layout.item_collection_seven_title);
        a(2, R.layout.item_collection_seven_video_game);
        a(3, R.layout.item_collection_seven_game_list);
        a(4, R.layout.item_collection_seven_horizontal_game);
        a(5, R.layout.item_collection_seven_ad_list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(CollectionSevenListBean collectionSevenListBean, View view) {
        IntentUtil.getInstance().goColloctionList(this.mContext, collectionSevenListBean.getTpl_type(), collectionSevenListBean.getCollection_id());
    }

    private void J(BaseViewHolder baseViewHolder, CollectionSevenListBean collectionSevenListBean) {
        try {
            if (collectionSevenListBean.getItem() != null && (collectionSevenListBean.getItem() instanceof ArrayList)) {
                ArrayList arrayList = (ArrayList) collectionSevenListBean.getItem();
                RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R.id.recyclerView);
                recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
                CollectionModuleSevenAdAdapter collectionModuleSevenAdAdapter = new CollectionModuleSevenAdAdapter(arrayList);
                collectionModuleSevenAdAdapter.setOnItemClickListener(new a(arrayList));
                recyclerView.setAdapter(collectionModuleSevenAdAdapter);
            } else {
                baseViewHolder.itemView.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            baseViewHolder.itemView.setVisibility(8);
        }
    }

    private void K(BaseViewHolder baseViewHolder, CollectionSevenListBean collectionSevenListBean) {
        if (collectionSevenListBean.getItem() != null && (collectionSevenListBean.getItem() instanceof CommonGameInfoBean)) {
            CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) collectionSevenListBean.getItem();
            baseViewHolder.itemView.setVisibility(0);
            if (commonGameInfoBean.getG_info() != null) {
                DownloadTask downloadTask = commonGameInfoBean.getDownloadTask();
                GInfoBean g_info = commonGameInfoBean.getG_info();
                MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.icon), TextUtils.isEmpty(g_info.getGif_ico()) ? g_info.getIco() : g_info.getGif_ico());
                baseViewHolder.setText(R.id.gameName, g_info.getName());
                baseViewHolder.addOnClickListener(R.id.downloadView);
                String str = "";
                int i4 = 0;
                for (TipBean tipBean : g_info.getTag_info()) {
                    if (i4 >= 2) {
                        break;
                    } else if (!TextUtils.isEmpty(tipBean.getId()) && !tipBean.getId().equals("44") && !tipBean.getId().equals("45") && !tipBean.getId().equals("47") && !tipBean.getId().equals("48") && !tipBean.getId().equals("25") && !tipBean.getId().equals("154") && !tipBean.getId().equals("7") && (g_info.getSp_tag_info() == null || g_info.getSp_tag_info().getModel() == null || !TextUtils.equals(tipBean.getId(), g_info.getSp_tag_info().getModel().getId()))) {
                        str = str + tipBean.getName() + " · ";
                        i4++;
                    }
                }
                baseViewHolder.setText(R.id.tvTag, str.substring(0, Math.max(0, str.length() - 2)) + "| " + UtilsMy.J2((long) (Double.parseDouble(g_info.getApp_size()) * 1024.0d * 1024.0d)));
                baseViewHolder.setText(R.id.gameMessage, g_info.getInfo());
                if (downloadTask == null) {
                    if (UtilsMy.o0(g_info.getTag_info())) {
                        if (com.join.android.app.common.utils.e.l0(this.mContext).d(this.mContext, g_info.getPackage_name()) && UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) == 0) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.mContext).l(this.mContext, g_info.getPackage_name());
                            if (com.join.mgps.Util.g2.i(g_info.getVer()) && l4.d() < Integer.parseInt(g_info.getVer())) {
                                baseViewHolder.setText(R.id.tvBtn, "更新").setBackgroundRes(R.id.downloadView, R.drawable.recom_green_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_green_color));
                            } else {
                                baseViewHolder.setText(R.id.tvBtn, "启动").setBackgroundRes(R.id.downloadView, R.drawable.recom_maincolor_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_main_color));
                            }
                        } else {
                            UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                            UtilsMy.g3((TextView) baseViewHolder.getView(R.id.tvBtn), baseViewHolder.getView(R.id.downloadView), g_info);
                            baseViewHolder.setBackgroundRes(R.id.downloadView, R.drawable.recom_blue_butn).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_blue_color));
                        }
                    } else {
                        UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                        UtilsMy.g3((TextView) baseViewHolder.getView(R.id.tvBtn), baseViewHolder.getView(R.id.downloadView), g_info);
                        baseViewHolder.setBackgroundRes(R.id.downloadView, R.drawable.recom_blue_butn).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_blue_color));
                    }
                } else {
                    int status = downloadTask.getStatus();
                    if (status != 0) {
                        if (status != 42) {
                            if (status == 48) {
                                baseViewHolder.setText(R.id.tvBtn, "安装中").setBackgroundRes(R.id.downloadView, R.drawable.recom_blue_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_blue_color));
                            } else if (status != 2) {
                                if (status != 3) {
                                    if (status != 5) {
                                        if (status != 6) {
                                            if (status != 7) {
                                                switch (status) {
                                                    case 9:
                                                        baseViewHolder.setText(R.id.tvBtn, "更新").setBackgroundRes(R.id.downloadView, R.drawable.recom_green_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_green_color));
                                                        break;
                                                    case 10:
                                                        baseViewHolder.setText(R.id.tvBtn, "等待");
                                                        break;
                                                    case 11:
                                                        baseViewHolder.setText(R.id.tvBtn, "安装").setBackgroundRes(R.id.downloadView, R.drawable.recom_green_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_green_color));
                                                        break;
                                                    case 12:
                                                        baseViewHolder.setText(R.id.tvBtn, "解压中");
                                                        break;
                                                    case 13:
                                                        baseViewHolder.setText(R.id.tvBtn, "解压");
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                                baseViewHolder.setText(R.id.tvBtn, "继续").setBackgroundRes(R.id.downloadView, R.drawable.recom_blue_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_blue_color));
                            } else {
                                baseViewHolder.setText(R.id.tvBtn, "暂停").setBackgroundRes(R.id.downloadView, R.drawable.recom_blue_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_blue_color));
                            }
                        }
                        baseViewHolder.setText(R.id.tvBtn, "启动").setBackgroundRes(R.id.downloadView, R.drawable.recom_maincolor_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_main_color));
                    }
                    baseViewHolder.setText(R.id.tvBtn, "获取").setBackgroundRes(R.id.downloadView, R.drawable.recom_blue_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_blue_color));
                }
                MultiStandVideo multiStandVideo = (MultiStandVideo) baseViewHolder.getView(R.id.wf_video);
                if (multiStandVideo != null) {
                    if (TextUtils.equals(commonGameInfoBean.getV_url(), multiStandVideo.getUrl()) && (commonGameInfoBean.getJp_info() == null || commonGameInfoBean.getJp_info().getLink_type().intValue() == 1)) {
                        return;
                    }
                    multiStandVideo.g(commonGameInfoBean.getBig_pic());
                    multiStandVideo.setName(commonGameInfoBean.getTitle());
                    multiStandVideo.setPlayTag(this.f39900d.p());
                    multiStandVideo.setPlayPosition(commonGameInfoBean.hashCode());
                    multiStandVideo.setUpLazy(commonGameInfoBean.getV_url(), false, null, null, "");
                    multiStandVideo.setRotateViewAuto(false);
                    multiStandVideo.setLockLand(true);
                    multiStandVideo.setReleaseWhenLossAudio(false);
                    multiStandVideo.setShowFullAnimation(false);
                    multiStandVideo.setIsTouchWiget(false);
                    multiStandVideo.setNeedLockFull(false);
                    multiStandVideo.setBottomProgressBarDrawable(null);
                    multiStandVideo.setVideoAllCallBack(new b(commonGameInfoBean));
                    return;
                }
                return;
            }
            return;
        }
        baseViewHolder.itemView.setVisibility(8);
    }

    private void L(BaseViewHolder baseViewHolder, CollectionSevenListBean collectionSevenListBean) {
        if (collectionSevenListBean.getItem() != null && (collectionSevenListBean.getItem() instanceof CommonGameInfoBean)) {
            CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) collectionSevenListBean.getItem();
            int i4 = 0;
            baseViewHolder.itemView.setVisibility(0);
            if (commonGameInfoBean.getG_info() != null) {
                DownloadTask downloadTask = commonGameInfoBean.getDownloadTask();
                GInfoBean g_info = commonGameInfoBean.getG_info();
                MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.gameIcon), TextUtils.isEmpty(g_info.getGif_ico()) ? g_info.getIco() : g_info.getGif_ico());
                baseViewHolder.setText(R.id.tvGameName, g_info.getName());
                baseViewHolder.addOnClickListener(R.id.downloadView);
                String str = "";
                String str2 = "";
                int i5 = 0;
                for (TipBean tipBean : g_info.getTag_info()) {
                    if (i5 >= 2) {
                        break;
                    } else if (!TextUtils.isEmpty(tipBean.getId()) && !tipBean.getId().equals("44") && !tipBean.getId().equals("45") && !tipBean.getId().equals("47") && !tipBean.getId().equals("48") && !tipBean.getId().equals("25") && !tipBean.getId().equals("154") && !tipBean.getId().equals("7") && (g_info.getSp_tag_info() == null || g_info.getSp_tag_info().getModel() == null || !TextUtils.equals(tipBean.getId(), g_info.getSp_tag_info().getModel().getId()))) {
                        str2 = str2 + tipBean.getName() + " · ";
                        i5++;
                    }
                }
                String substring = str2.substring(0, Math.max(0, str2.length() - 2));
                long parseDouble = (long) (Double.parseDouble(g_info.getApp_size()) * 1024.0d * 1024.0d);
                baseViewHolder.setText(R.id.tvTag, substring + "| " + UtilsMy.J2(parseDouble));
                baseViewHolder.setText(R.id.gameMessage, g_info.getInfo());
                if (String.valueOf(ConstantIntEnum.H5.value()).equals(g_info.getPlugin_num())) {
                    baseViewHolder.setGone(R.id.tvTag, false).setGone(R.id.gameMessage, true).setGone(R.id.linearLayout2, false).setGone(R.id.progressBarZip, false).setGone(R.id.progressBar, false);
                    return;
                } else if (downloadTask == null) {
                    baseViewHolder.setGone(R.id.tvTag, true).setGone(R.id.gameMessage, true).setGone(R.id.linearLayout2, false).setGone(R.id.progressBarZip, false).setGone(R.id.progressBar, false);
                    if (UtilsMy.o0(g_info.getTag_info())) {
                        if (com.join.android.app.common.utils.e.l0(this.mContext).d(this.mContext, g_info.getPackage_name()) && UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) == 0) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.mContext).l(this.mContext, g_info.getPackage_name());
                            if (com.join.mgps.Util.g2.i(g_info.getVer()) && l4.d() < Integer.parseInt(g_info.getVer())) {
                                baseViewHolder.setText(R.id.tvBtn, "更新").setBackgroundRes(R.id.downloadView, R.drawable.recom_blue_butn).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_green_color));
                                return;
                            } else {
                                baseViewHolder.setText(R.id.tvBtn, "启动").setBackgroundRes(R.id.downloadView, R.drawable.recom_maincolor_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_main_color));
                                return;
                            }
                        }
                        UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                        UtilsMy.g3((TextView) baseViewHolder.getView(R.id.tvBtn), baseViewHolder.getView(R.id.downloadView), g_info);
                        baseViewHolder.setBackgroundRes(R.id.downloadView, R.drawable.recom_blue_butn).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_blue_color));
                        return;
                    }
                    UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                    UtilsMy.g3((TextView) baseViewHolder.getView(R.id.tvBtn), baseViewHolder.getView(R.id.downloadView), g_info);
                    baseViewHolder.setBackgroundRes(R.id.downloadView, R.drawable.recom_blue_butn).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_blue_color));
                    return;
                } else {
                    int status = downloadTask.getStatus();
                    if (status != 0) {
                        if (status != 42) {
                            if (status == 48) {
                                baseViewHolder.setGone(R.id.tvTag, true).setGone(R.id.gameMessage, true).setGone(R.id.linearLayout2, false).setGone(R.id.progressBarZip, false).setGone(R.id.progressBar, false).setBackgroundRes(R.id.downloadView, R.drawable.recom_blue_butn).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_blue_color)).setText(R.id.tvBtn, "安装中");
                                return;
                            } else if (status != 2) {
                                if (status != 3) {
                                    if (status != 5) {
                                        if (status != 6) {
                                            if (status != 7) {
                                                switch (status) {
                                                    case 9:
                                                        baseViewHolder.setGone(R.id.tvTag, true).setGone(R.id.gameMessage, true).setGone(R.id.linearLayout2, false).setGone(R.id.progressBarZip, false).setGone(R.id.progressBar, false).setBackgroundRes(R.id.downloadView, R.drawable.recom_green_butn).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_green_color)).setText(R.id.tvBtn, "更新");
                                                        return;
                                                    case 10:
                                                        baseViewHolder.setGone(R.id.tvTag, false).setGone(R.id.gameMessage, false).setGone(R.id.linearLayout2, true).setGone(R.id.progressBarZip, false).setGone(R.id.progressBar, true);
                                                        baseViewHolder.setText(R.id.appSize, UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble)).setText(R.id.loding_info, "等待中").setProgress(R.id.progressBar, (int) downloadTask.getProgress()).setText(R.id.tvBtn, "等待");
                                                        return;
                                                    case 11:
                                                        baseViewHolder.setGone(R.id.tvTag, true).setGone(R.id.gameMessage, true).setGone(R.id.linearLayout2, false).setGone(R.id.progressBarZip, false).setGone(R.id.progressBar, false).setBackgroundRes(R.id.downloadView, R.drawable.recom_green_butn).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_green_color)).setText(R.id.tvBtn, "安装");
                                                        return;
                                                    case 12:
                                                        baseViewHolder.setGone(R.id.tvTag, false).setGone(R.id.gameMessage, false).setGone(R.id.linearLayout2, true).setGone(R.id.progressBarZip, true).setGone(R.id.progressBar, false);
                                                        baseViewHolder.setText(R.id.appSize, UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble)).setText(R.id.loding_info, "解压中").setProgress(R.id.progressBarZip, (int) downloadTask.getProgress()).setText(R.id.tvBtn, "解压中");
                                                        return;
                                                    case 13:
                                                        baseViewHolder.setGone(R.id.tvTag, false).setGone(R.id.gameMessage, false).setGone(R.id.linearLayout2, true).setGone(R.id.progressBarZip, true).setGone(R.id.progressBar, false);
                                                        baseViewHolder.setText(R.id.appSize, UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble)).setText(R.id.loding_info, "点击重新解压").setProgress(R.id.progressBarZip, (int) downloadTask.getProgress()).setText(R.id.tvBtn, "解压");
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                        }
                                    }
                                }
                                baseViewHolder.setGone(R.id.tvTag, false).setGone(R.id.gameMessage, false).setGone(R.id.linearLayout2, true).setGone(R.id.progressBarZip, false).setGone(R.id.progressBar, true).setBackgroundRes(R.id.downloadView, R.drawable.recom_blue_butn).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_blue_color)).setText(R.id.tvBtn, "继续");
                                try {
                                    str = downloadTask.getSize() == 0 ? UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble) : UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble);
                                    i4 = (int) downloadTask.getProgress();
                                } catch (Exception e5) {
                                    e5.printStackTrace();
                                }
                                baseViewHolder.setText(R.id.appSize, str).setText(R.id.loding_info, "暂停中").setBackgroundRes(R.id.downloadView, R.drawable.recom_blue_butn).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_blue_color)).setProgress(R.id.progressBar, i4);
                                return;
                            } else {
                                baseViewHolder.setGone(R.id.tvTag, false).setGone(R.id.gameMessage, false).setGone(R.id.linearLayout2, true).setGone(R.id.progressBarZip, false).setGone(R.id.progressBar, true);
                                BaseViewHolder text = baseViewHolder.setText(R.id.appSize, UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                StringBuilder sb = new StringBuilder();
                                sb.append(downloadTask.getSpeed());
                                sb.append("/S");
                                text.setText(R.id.loding_info, sb.toString()).setProgress(R.id.progressBar, (int) downloadTask.getProgress()).setBackgroundRes(R.id.downloadView, R.drawable.recom_blue_butn).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_blue_color)).setText(R.id.tvBtn, "暂停");
                                return;
                            }
                        }
                        baseViewHolder.setGone(R.id.tvTag, true).setGone(R.id.gameMessage, true).setGone(R.id.linearLayout2, false).setGone(R.id.progressBarZip, false).setGone(R.id.progressBar, false).setBackgroundRes(R.id.downloadView, R.drawable.recom_maincolor_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_main_color)).setText(R.id.tvBtn, "启动");
                        return;
                    }
                    baseViewHolder.setGone(R.id.tvTag, true).setGone(R.id.gameMessage, true).setGone(R.id.linearLayout2, false).setGone(R.id.progressBarZip, false).setGone(R.id.progressBar, false).setBackgroundRes(R.id.downloadView, R.drawable.recom_blue_butn).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_blue_color)).setText(R.id.tvBtn, "获取");
                    return;
                }
            }
            return;
        }
        baseViewHolder.itemView.setVisibility(8);
    }

    private void M(BaseViewHolder baseViewHolder, CollectionSevenListBean collectionSevenListBean) {
        if (collectionSevenListBean.getItem() != null && (collectionSevenListBean.getItem() instanceof ArrayList)) {
            ArrayList arrayList = (ArrayList) collectionSevenListBean.getItem();
            RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R.id.recyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
            CollectionModuleSevenHorizontalAdapter collectionModuleSevenHorizontalAdapter = new CollectionModuleSevenHorizontalAdapter(arrayList);
            recyclerView.setAdapter(collectionModuleSevenHorizontalAdapter);
            collectionModuleSevenHorizontalAdapter.setOnItemClickListener(new c(arrayList));
            collectionModuleSevenHorizontalAdapter.setOnItemChildClickListener(new d(arrayList));
            return;
        }
        baseViewHolder.itemView.setVisibility(8);
    }

    private void N(BaseViewHolder baseViewHolder, final CollectionSevenListBean collectionSevenListBean) {
        if (collectionSevenListBean.getTitle() != null) {
            baseViewHolder.itemView.setVisibility(0);
            baseViewHolder.setText(R.id.title, collectionSevenListBean.getTitle());
            baseViewHolder.setVisible(R.id.more, !TextUtils.isEmpty(collectionSevenListBean.getCollection_id()));
            baseViewHolder.setText(R.id.subTitle, collectionSevenListBean.getSubTitle());
            baseViewHolder.setGone(R.id.subTitle, !TextUtils.isEmpty(collectionSevenListBean.getSubTitle()));
            baseViewHolder.getView(R.id.more).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CollectionModuleSevenAdapter.this.I(collectionSevenListBean, view);
                }
            });
            return;
        }
        baseViewHolder.itemView.setVisibility(8);
    }

    void G(CommonGameInfoBean commonGameInfoBean) {
        ExtBean extBean;
        commonGameInfoBean.set_from(150);
        commonGameInfoBean.set_from_type(150);
        if (com.join.mgps.Util.g2.h(commonGameInfoBean.getExt())) {
            extBean = new ExtBean();
        } else {
            extBean = (ExtBean) JsonMapper.getInstance().fromJson(commonGameInfoBean.getExt(), ExtBean.class);
        }
        extBean.setFrom("150");
        commonGameInfoBean.setExt(JsonMapper.toJsonString(extBean));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: H */
    public void convert(@NonNull BaseViewHolder baseViewHolder, CollectionSevenListBean collectionSevenListBean) {
        int type = collectionSevenListBean.getType();
        if (type == 1) {
            N(baseViewHolder, collectionSevenListBean);
        } else if (type == 2) {
            K(baseViewHolder, collectionSevenListBean);
        } else if (type == 3) {
            L(baseViewHolder, collectionSevenListBean);
        } else if (type == 4) {
            M(baseViewHolder, collectionSevenListBean);
        } else if (type != 5) {
        } else {
            J(baseViewHolder, collectionSevenListBean);
        }
    }
}
