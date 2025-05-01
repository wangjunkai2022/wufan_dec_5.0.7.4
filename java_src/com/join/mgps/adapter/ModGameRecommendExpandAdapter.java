package com.join.mgps.adapter;

import android.graphics.Color;
import android.text.TextUtils;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.TipBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes4.dex */
public class ModGameRecommendExpandAdapter extends BaseQuickAdapter<CollectionBeanSubBusiness, BaseViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f43754a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f43755b;

    /* renamed from: c  reason: collision with root package name */
    private String[] f43756c;

    public ModGameRecommendExpandAdapter(@Nullable List<CollectionBeanSubBusiness> list) {
        super(R.layout.item_mod_game_recommend_expand, list);
        this.f43755b = new int[]{R.drawable.shape_bg_mod_game_recommend_tag1, R.drawable.shape_bg_mod_game_recommend_tag2, R.drawable.shape_bg_mod_game_recommend_tag3};
        this.f43756c = new String[]{"#EACBC3", "#E8E351", "#D1AFF4"};
        this.f43754a = list;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: a */
    public void convert(BaseViewHolder baseViewHolder, CollectionBeanSubBusiness collectionBeanSubBusiness) {
        DownloadTask F;
        Iterator<TipBean> it2;
        ((TextView) baseViewHolder.getView(R.id.tvGameName)).setText(collectionBeanSubBusiness.getGame_name());
        baseViewHolder.getView(R.id.root).setBackgroundResource(collectionBeanSubBusiness.a() ? R.drawable.shape_bg_recom_selected : 0);
        int i4 = 0;
        for (CollectionBeanSubBusiness collectionBeanSubBusiness2 : this.f43754a) {
            if (TextUtils.equals(collectionBeanSubBusiness2.getGame_id(), collectionBeanSubBusiness.getGame_id())) {
                break;
            } else if (!TextUtils.isEmpty(collectionBeanSubBusiness2.getGame_dimension())) {
                i4++;
            }
        }
        int i5 = i4 % 3;
        baseViewHolder.getView(R.id.llTag).setBackgroundResource(this.f43755b[i5]);
        ((TextView) baseViewHolder.getView(R.id.tvTag)).setTextColor(Color.parseColor(this.f43756c[i5]));
        baseViewHolder.setVisible(R.id.llTag, !TextUtils.isEmpty(collectionBeanSubBusiness.getGame_dimension()));
        ((TextView) baseViewHolder.getView(R.id.tvTag)).setText(collectionBeanSubBusiness.getGame_dimension());
        ArrayList<TipBean> tag_info = collectionBeanSubBusiness.getTag_info();
        String str = "";
        if (tag_info != null) {
            while (tag_info.iterator().hasNext()) {
                str = str + it2.next().getName() + " ";
            }
        }
        ((TextView) baseViewHolder.getView(R.id.tvTags)).setText(str);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) baseViewHolder.getView(R.id.ivGameIcon);
        if (simpleDraweeView.getTag() == null || !TextUtils.equals(simpleDraweeView.getTag().toString(), collectionBeanSubBusiness.getIco_remote())) {
            MyImageLoader.h(simpleDraweeView, collectionBeanSubBusiness.getIco_remote());
            simpleDraweeView.setTag(collectionBeanSubBusiness.getIco_remote());
        }
        if (collectionBeanSubBusiness.getPic_info() != null && collectionBeanSubBusiness.getPic_info().size() > 0 && collectionBeanSubBusiness.getPic_info().get(0).getRemote() != null) {
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) baseViewHolder.getView(R.id.ivGamePoster);
            if (simpleDraweeView2.getTag() == null || !TextUtils.equals(simpleDraweeView2.getTag().toString(), collectionBeanSubBusiness.getPic_info().get(0).getRemote().getPath())) {
                MyImageLoader.h(simpleDraweeView2, collectionBeanSubBusiness.getPic_info().get(0).getRemote().getPath());
                simpleDraweeView2.getHierarchy().x(r.c.f11300g);
                simpleDraweeView2.setTag(collectionBeanSubBusiness.getPic_info().get(0).getRemote().getPath());
            }
        }
        ProgressBar progressBar = (ProgressBar) baseViewHolder.getView(R.id.progress);
        if (collectionBeanSubBusiness.getMod_info() != null) {
            F = p1.f.K().F(collectionBeanSubBusiness.getDownloadtaskDown().getRef_crc_sign_id());
        } else {
            F = p1.f.K().F(collectionBeanSubBusiness.getDownloadtaskDown().getCrc_link_type_val());
        }
        String str2 = "暂停";
        if (F != null) {
            int status = F.getStatus();
            if (status != 0) {
                if (status == 27) {
                    progressBar.setVisibility(0);
                    progressBar.setProgress((int) F.getProgress());
                } else if (status == 48) {
                    progressBar.setVisibility(8);
                    str2 = "安装中";
                } else if (status != 2) {
                    if (status != 3) {
                        if (status != 5) {
                            if (status != 6) {
                                if (status != 7) {
                                    if (status != 42) {
                                        if (status != 43) {
                                            switch (status) {
                                                case 10:
                                                    progressBar.setVisibility(8);
                                                    str2 = "等待";
                                                    break;
                                                case 11:
                                                    progressBar.setVisibility(8);
                                                    str2 = "安装";
                                                    break;
                                                case 12:
                                                    progressBar.setVisibility(8);
                                                    str2 = "解压中";
                                                    break;
                                                case 13:
                                                    progressBar.setVisibility(8);
                                                    str2 = "解压";
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        progressBar.setVisibility(8);
                        str2 = "启动";
                    }
                    progressBar.setVisibility(0);
                    progressBar.setProgress((int) F.getProgress());
                    str2 = "继续";
                } else {
                    progressBar.setVisibility(0);
                    progressBar.setProgress((int) F.getProgress());
                }
                ((TextView) baseViewHolder.getView(R.id.tvOption)).setText(str2);
                baseViewHolder.addOnClickListener(R.id.tvOption);
            }
            progressBar.setVisibility(8);
        }
        str2 = "获取";
        ((TextView) baseViewHolder.getView(R.id.tvOption)).setText(str2);
        baseViewHolder.addOnClickListener(R.id.tvOption);
    }

    @Override // com.join.mgps.base.BaseQuickAdapter
    public void setNewData(@Nullable List<CollectionBeanSubBusiness> list) {
        super.setNewData(list);
        this.f43754a = list;
    }
}
