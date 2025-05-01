package com.join.mgps.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.CommonGameInfoBean;
import java.util.List;
/* loaded from: classes4.dex */
public class CollectionModuleSevenAdAdapter extends BaseQuickAdapter<CommonGameInfoBean, BaseViewHolder> {
    public CollectionModuleSevenAdAdapter(@Nullable List<CommonGameInfoBean> list) {
        super(R.layout.item_collection_seven_ad, list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: a */
    public void convert(@NonNull BaseViewHolder baseViewHolder, CommonGameInfoBean commonGameInfoBean) {
        MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.adPic), commonGameInfoBean.getBig_pic());
    }
}
