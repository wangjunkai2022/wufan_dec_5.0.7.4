package com.join.mgps.adapter;

import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.business.CollectionBeanSubBusiness;
import java.util.List;
/* loaded from: classes4.dex */
public class ModGameRecomendShrinkAdapter extends BaseQuickAdapter<CollectionBeanSubBusiness, BaseViewHolder> {
    public ModGameRecomendShrinkAdapter(@Nullable List<CollectionBeanSubBusiness> list) {
        super(R.layout.item_mod_game_recommend_shrink, list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: a */
    public void convert(BaseViewHolder baseViewHolder, CollectionBeanSubBusiness collectionBeanSubBusiness) {
        MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.ivGameIcon), collectionBeanSubBusiness.getIco_remote());
        ((TextView) baseViewHolder.getView(R.id.tvGameName)).setText(collectionBeanSubBusiness.getGame_name());
    }
}
