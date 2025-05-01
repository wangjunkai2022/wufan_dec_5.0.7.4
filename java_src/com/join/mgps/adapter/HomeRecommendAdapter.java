package com.join.mgps.adapter;

import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.PAPAHomeBeanV7;
import com.join.mgps.enums.ConstantIntEnum;
import java.util.List;
/* loaded from: classes4.dex */
public class HomeRecommendAdapter extends BaseQuickAdapter<PAPAHomeBeanV7.HomeBeanDTO, BaseViewHolder> {
    public HomeRecommendAdapter(@Nullable List<PAPAHomeBeanV7.HomeBeanDTO> list) {
        super(R.layout.mgpapa_home_recommend_item, list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: a */
    public void convert(BaseViewHolder baseViewHolder, PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        PAPAHomeBeanV7.GInfoDTO g_info = homeBeanDTO.getG_info();
        TextView textView = (TextView) baseViewHolder.getView(R.id.tvGameName);
        if (g_info != null) {
            MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.ivGameIcon), g_info.getIco());
            textView.setText(g_info.getName());
        }
        baseViewHolder.addOnClickListener(R.id.flBtn);
        baseViewHolder.setVisible(R.id.tvBtn, true);
        baseViewHolder.setVisible(R.id.loading_progress, false);
        TextView textView2 = (TextView) baseViewHolder.getView(R.id.tvBtn);
        textView2.setText("获取");
        DownloadTask downloadTask = homeBeanDTO.getDownloadTask();
        CollectionBeanSub gameBean = homeBeanDTO.getGameBean();
        if (downloadTask != null) {
            downloadTask.getSize();
        }
        if (homeBeanDTO.getJp_info() != null && homeBeanDTO.getJp_info().getLink_type().intValue() != 1) {
            textView2.setText("打开");
            textView.setText(homeBeanDTO.getTitle());
            return;
        }
        if (gameBean != null) {
            if ((ConstantIntEnum.H5.value() + "").equals(gameBean.getPlugin_num())) {
                textView2.setText("开始");
                return;
            }
        }
        if (downloadTask == null) {
            if (gameBean == null) {
                return;
            }
            if (UtilsMy.o0(gameBean.getTag_info())) {
                if (com.join.android.app.common.utils.e.l0(this.mContext).d(this.mContext, gameBean.getPackageName()) && UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id()) == 0) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.mContext).l(this.mContext, gameBean.getPackageName());
                    if (com.join.mgps.Util.g2.i(gameBean.getVer()) && l4.d() < Integer.parseInt(gameBean.getVer())) {
                        textView2.setText("更新");
                        return;
                    } else {
                        textView2.setText("启动");
                        return;
                    }
                }
                UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id());
                UtilsMy.f3(textView2, textView2, gameBean);
                return;
            }
            UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id());
            UtilsMy.f3(textView2, textView2, gameBean);
            return;
        }
        int status = downloadTask.getStatus();
        if (gameBean != null && UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (status != 0) {
            if (status == 27) {
                textView2.setText("暂停中");
                return;
            } else if (status == 48) {
                textView2.setText("安装中");
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
                                                textView2.setText("更新");
                                                return;
                                            case 10:
                                                textView2.setText("等待");
                                                return;
                                            case 11:
                                                textView2.setText("安装");
                                                return;
                                            case 12:
                                                textView2.setText("解压中");
                                                return;
                                            case 13:
                                                textView2.setText("解压");
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    textView2.setText("启动");
                    return;
                }
                textView2.setText("继续");
                return;
            } else {
                UtilsMy.x4(downloadTask);
                textView2.setText(downloadTask.getProgress() + "%");
                return;
            }
        }
        textView2.setText("获取");
    }
}
