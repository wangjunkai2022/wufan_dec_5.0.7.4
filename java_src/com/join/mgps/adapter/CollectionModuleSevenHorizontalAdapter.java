package com.join.mgps.adapter;

import android.text.TextUtils;
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
import java.util.List;
/* loaded from: classes4.dex */
public class CollectionModuleSevenHorizontalAdapter extends BaseQuickAdapter<CommonGameInfoBean, BaseViewHolder> {
    public CollectionModuleSevenHorizontalAdapter(@Nullable List<CommonGameInfoBean> list) {
        super(R.layout.item_collection_seven_horizontal_item, list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: a */
    public void convert(@NonNull BaseViewHolder baseViewHolder, CommonGameInfoBean commonGameInfoBean) {
        baseViewHolder.itemView.setVisibility(0);
        if (commonGameInfoBean.getG_info() != null) {
            DownloadTask downloadTask = commonGameInfoBean.getDownloadTask();
            GInfoBean g_info = commonGameInfoBean.getG_info();
            MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.image1), TextUtils.isEmpty(g_info.getGif_ico()) ? g_info.getIco() : g_info.getGif_ico());
            baseViewHolder.setText(R.id.appname1, g_info.getName());
            baseViewHolder.addOnClickListener(R.id.downloadView);
            if (downloadTask == null) {
                if (UtilsMy.o0(g_info.getTag_info())) {
                    if (com.join.android.app.common.utils.e.l0(this.mContext).d(this.mContext, g_info.getPackage_name()) && UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) == 0) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.mContext).l(this.mContext, g_info.getPackage_name());
                        if (com.join.mgps.Util.g2.i(g_info.getVer()) && l4.d() < Integer.parseInt(g_info.getVer())) {
                            baseViewHolder.setText(R.id.tvBtn, "更新").setBackgroundRes(R.id.downloadView, R.drawable.recom_green_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_green_color));
                            return;
                        } else {
                            baseViewHolder.setText(R.id.tvBtn, "启动").setBackgroundRes(R.id.downloadView, R.drawable.recom_maincolor_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_main_color));
                            return;
                        }
                    }
                    UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                    UtilsMy.g3((TextView) baseViewHolder.getView(R.id.tvBtn), baseViewHolder.getView(R.id.downloadView), g_info);
                    return;
                }
                UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId());
                UtilsMy.g3((TextView) baseViewHolder.getView(R.id.tvBtn), baseViewHolder.getView(R.id.downloadView), g_info);
                return;
            }
            int status = downloadTask.getStatus();
            if (status != 0) {
                if (status != 42) {
                    if (status == 48) {
                        baseViewHolder.setText(R.id.tvBtn, "安装中").setBackgroundRes(R.id.downloadView, R.drawable.recom_blue_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_blue_color));
                        return;
                    } else if (status != 2) {
                        if (status != 3) {
                            if (status != 5) {
                                if (status != 6) {
                                    if (status != 7) {
                                        switch (status) {
                                            case 9:
                                                baseViewHolder.setText(R.id.tvBtn, "更新").setBackgroundRes(R.id.downloadView, R.drawable.recom_green_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_green_color));
                                                return;
                                            case 10:
                                                baseViewHolder.setText(R.id.tvBtn, "等待");
                                                return;
                                            case 11:
                                                baseViewHolder.setText(R.id.tvBtn, "安装").setBackgroundRes(R.id.downloadView, R.drawable.recom_green_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_green_color));
                                                return;
                                            case 12:
                                            case 13:
                                                baseViewHolder.setText(R.id.tvBtn, "解压");
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                        }
                        baseViewHolder.setText(R.id.tvBtn, "继续").setBackgroundRes(R.id.downloadView, R.drawable.recom_blue_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_blue_color));
                        return;
                    } else {
                        baseViewHolder.setText(R.id.tvBtn, "暂停").setBackgroundRes(R.id.downloadView, R.drawable.recom_blue_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_blue_color));
                        return;
                    }
                }
                baseViewHolder.setText(R.id.tvBtn, "启动").setBackgroundRes(R.id.downloadView, R.drawable.recom_maincolor_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_main_color));
                return;
            }
            baseViewHolder.setText(R.id.tvBtn, "获取").setBackgroundRes(R.id.downloadView, R.drawable.recom_blue_normal).setTextColor(R.id.tvBtn, this.mContext.getResources().getColor(R.color.app_blue_color));
        }
    }
}
