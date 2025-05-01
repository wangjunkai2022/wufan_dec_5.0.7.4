package com.join.mgps.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.HomeDailyNewListBean;
import java.util.List;
/* loaded from: classes4.dex */
public class PapaMainDailyNewAdapter extends BaseQuickAdapter<HomeDailyNewListBean, BaseViewHolder> {
    public PapaMainDailyNewAdapter(@Nullable List<HomeDailyNewListBean> list) {
        super(R.layout.item_papa_main_home_v4_daily_new_list, list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: a */
    public void convert(@NonNull BaseViewHolder baseViewHolder, HomeDailyNewListBean homeDailyNewListBean) {
        MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.icon), homeDailyNewListBean.getIco());
    }
}
