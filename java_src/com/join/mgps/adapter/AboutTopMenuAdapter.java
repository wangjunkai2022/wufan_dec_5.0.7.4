package com.join.mgps.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.QuickViewHolder;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CommonGameInfoBean;
/* loaded from: classes4.dex */
public class AboutTopMenuAdapter extends BaseQuickAdapter<CommonGameInfoBean, QuickViewHolder> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: e */
    public void onBindViewHolder(@NonNull QuickViewHolder quickViewHolder, int i4, @Nullable CommonGameInfoBean commonGameInfoBean) {
        quickViewHolder.n(R.id.tv_label, commonGameInfoBean.getTitle());
        quickViewHolder.h(R.id.tv_sub_title, com.join.mgps.Util.g2.h(commonGameInfoBean.getDescription()));
        quickViewHolder.n(R.id.tv_sub_title, commonGameInfoBean.getDescription());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NonNull
    /* renamed from: f */
    public QuickViewHolder onCreateViewHolder(@NonNull Context context, @NonNull ViewGroup viewGroup, int i4) {
        return new QuickViewHolder(R.layout.item_about_top_menu, viewGroup);
    }
}
