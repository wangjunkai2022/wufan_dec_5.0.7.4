package com.join.mgps.adapter;

import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.GInfoBean;
import com.join.mgps.enums.ConstantIntEnum;
import java.util.List;
/* loaded from: classes4.dex */
public class RankingItemV4Adapter extends BaseQuickAdapter<CommonGameInfoBean, BaseViewHolder> {
    public RankingItemV4Adapter(@Nullable List<CommonGameInfoBean> list) {
        super(R.layout.ranking_listview_item, list);
    }

    private void b(BaseViewHolder baseViewHolder, boolean z4, boolean z5) {
        boolean z6 = false;
        BaseViewHolder gone = baseViewHolder.setGone(R.id.mgListviewItemDescribe, z4).setGone(R.id.tipsLayout, z4).setGone(R.id.linearLayout2, !z4).setGone(R.id.progressBarZip, !z4 && z5);
        if (!z4 && !z5) {
            z6 = true;
        }
        gone.setGone(R.id.progressBar, z6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: a */
    public void convert(@NonNull BaseViewHolder baseViewHolder, CommonGameInfoBean commonGameInfoBean) {
        GInfoBean g_info;
        String ico;
        try {
            TextView textView = (TextView) baseViewHolder.getView(R.id.tvNumber);
            textView.setTextSize(12.0f);
            textView.getPaint().setFakeBoldText(false);
            baseViewHolder.setText(R.id.tvNumber, String.valueOf(baseViewHolder.getLayoutPosition() + 1)).setGone(R.id.tvNumber, true).setGone(R.id.ivNumber, false).setTextColor(R.id.tvNumber, -16777216).addOnClickListener(R.id.mgListviewItemInstall);
            g_info = commonGameInfoBean.getG_info();
            if (g_info == null) {
                ico = commonGameInfoBean.getBig_pic();
            } else {
                ico = TextUtils.isEmpty(g_info.getGif_ico()) ? g_info.getIco() : g_info.getGif_ico();
            }
            if (baseViewHolder.itemView.getTag() == null || !TextUtils.equals(baseViewHolder.itemView.getTag().toString(), ico)) {
                MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.mgListviewItemIcon), ico);
                baseViewHolder.itemView.setTag(ico);
            }
            baseViewHolder.setText(R.id.mgListviewItemAppname, g_info == null ? commonGameInfoBean.getTitle() : g_info.getName()).setText(R.id.mgListviewItemDescribe, commonGameInfoBean.getG_info().getInfo());
            if (g_info != null) {
                UtilsMy.O(String.valueOf(g_info.getScore()), g_info.getDown_count(), g_info.getApp_size(), g_info.getSp_tag_info(), g_info.getTag_info(), (LinearLayout) baseViewHolder.getView(R.id.tipsLayout), this.mContext, false);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            return;
        }
        if (commonGameInfoBean.getJp_info() != null && commonGameInfoBean.getJp_info().getLink_type().intValue() != 1) {
            baseViewHolder.setText(R.id.mgListviewItemInstall, "打开").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.mContext.getResources().getColor(R.color.app_blue_color)).setText(R.id.mgListviewItemAppname, commonGameInfoBean.getTitle()).setText(R.id.mgListviewItemDescribe, commonGameInfoBean.getSub_title());
            b(baseViewHolder, true, false);
            return;
        }
        if (g_info != null) {
            if ((ConstantIntEnum.H5.value() + "").equals(g_info.getPlugin_num())) {
                baseViewHolder.setText(R.id.mgListviewItemInstall, "开始").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.mContext.getResources().getColor(R.color.app_blue_color)).setText(R.id.mgListviewItemAppname, commonGameInfoBean.getTitle()).setText(R.id.mgListviewItemDescribe, commonGameInfoBean.getSub_title());
                b(baseViewHolder, true, false);
                return;
            }
        }
        DownloadTask downloadTask = commonGameInfoBean.getDownloadTask();
        if (downloadTask == null) {
            b(baseViewHolder, true, false);
            baseViewHolder.setText(R.id.mgListviewItemInstall, "获取").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.mContext.getResources().getColor(R.color.app_blue_color));
            if (g_info == null) {
                return;
            }
            if (UtilsMy.o0(g_info.getTag_info())) {
                if (com.join.android.app.common.utils.e.l0(this.mContext).d(this.mContext, g_info.getPackage_name()) && UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) == 0) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.mContext).l(this.mContext, g_info.getPackage_name());
                    if (com.join.mgps.Util.g2.i(g_info.getVer()) && l4.d() < Integer.parseInt(g_info.getVer())) {
                        baseViewHolder.setText(R.id.mgListviewItemInstall, "更新").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_green_butn).setTextColor(R.id.mgListviewItemInstall, this.mContext.getResources().getColor(R.color.app_green_color));
                        return;
                    } else {
                        baseViewHolder.setText(R.id.mgListviewItemInstall, "启动").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_maincolor_butn).setTextColor(R.id.mgListviewItemInstall, this.mContext.getResources().getColor(R.color.app_main_color));
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
                baseViewHolder.setText(R.id.mgListviewItemInstall, "暂停").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.mContext.getResources().getColor(R.color.app_blue_color));
                return;
            } else if (status == 48) {
                baseViewHolder.setText(R.id.mgListviewItemInstall, "安装中").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.mContext.getResources().getColor(R.color.app_blue_color));
                b(baseViewHolder, true, false);
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
                                                    baseViewHolder.setText(R.id.mgListviewItemInstall, "更新").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_green_butn).setTextColor(R.id.mgListviewItemInstall, this.mContext.getResources().getColor(R.color.app_green_color));
                                                    b(baseViewHolder, true, false);
                                                    return;
                                                case 10:
                                                    b(baseViewHolder, false, false);
                                                    BaseViewHolder text = baseViewHolder.setText(R.id.mgListviewItemInstall, "等待");
                                                    text.setText(R.id.appSize, UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask.getSize())).setProgress(R.id.progressBar, (int) downloadTask.getProgress()).setText(R.id.loding_info, "等待中").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.mContext.getResources().getColor(R.color.app_blue_color));
                                                    return;
                                                case 11:
                                                    baseViewHolder.setText(R.id.mgListviewItemInstall, "安装").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_green_butn).setTextColor(R.id.mgListviewItemInstall, this.mContext.getResources().getColor(R.color.app_green_color));
                                                    b(baseViewHolder, true, false);
                                                    return;
                                                case 12:
                                                    b(baseViewHolder, false, true);
                                                    baseViewHolder.setText(R.id.appSize, UtilsMy.g(downloadTask.getSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask.getSize())).setText(R.id.loding_info, "解压中..").setProgress(R.id.progressBarZip, (int) downloadTask.getProgress()).setText(R.id.mgListviewItemInstall, "解压中").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.extract).setTextColor(R.id.mgListviewItemInstall, this.mContext.getResources().getColor(R.color.app_grey_color));
                                                    return;
                                                case 13:
                                                    b(baseViewHolder, false, true);
                                                    baseViewHolder.setText(R.id.appSize, UtilsMy.g(downloadTask.getSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask.getSize())).setText(R.id.loding_info, "点击重新解压").setProgress(R.id.progressBarZip, (int) downloadTask.getProgress()).setText(R.id.mgListviewItemInstall, "解压").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.reextract).setTextColor(R.id.mgListviewItemInstall, this.mContext.getResources().getColor(R.color.app_blue_color));
                                                    return;
                                                default:
                                                    return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        baseViewHolder.setText(R.id.mgListviewItemInstall, "启动").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_maincolor_butn).setTextColor(R.id.mgListviewItemInstall, this.mContext.getResources().getColor(R.color.app_main_color));
                        b(baseViewHolder, true, false);
                        return;
                    }
                    b(baseViewHolder, false, false);
                    try {
                        BaseViewHolder text2 = baseViewHolder.setText(R.id.mgListviewItemInstall, "继续");
                        text2.setText(R.id.appSize, UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask.getSize())).setProgress(R.id.progressBar, (int) downloadTask.getProgress()).setText(R.id.loding_info, "暂停中").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.mContext.getResources().getColor(R.color.app_blue_color));
                        return;
                    } catch (Exception e6) {
                        e6.printStackTrace();
                        return;
                    }
                }
                UtilsMy.x4(downloadTask);
                b(baseViewHolder, false, false);
                try {
                    BaseViewHolder text3 = baseViewHolder.setText(R.id.mgListviewItemInstall, "暂停");
                    BaseViewHolder progress = text3.setText(R.id.appSize, UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(downloadTask.getSize())).setProgress(R.id.progressBar, (int) downloadTask.getProgress());
                    StringBuilder sb = new StringBuilder();
                    sb.append(downloadTask.getSpeed());
                    sb.append("/S");
                    progress.setText(R.id.loding_info, sb.toString()).setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.mContext.getResources().getColor(R.color.app_blue_color));
                    return;
                } catch (Exception e7) {
                    e7.printStackTrace();
                    return;
                }
                e5.printStackTrace();
                return;
            }
        }
        baseViewHolder.setText(R.id.mgListviewItemInstall, "获取").setBackgroundRes(R.id.mgListviewItemInstall, R.drawable.recom_blue_butn).setTextColor(R.id.mgListviewItemInstall, this.mContext.getResources().getColor(R.color.app_blue_color));
        if (g_info != null) {
            UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
            UtilsMy.g3((TextView) baseViewHolder.getView(R.id.mgListviewItemInstall), baseViewHolder.getView(R.id.rLayoutRight), g_info);
        }
        b(baseViewHolder, true, false);
    }
}
