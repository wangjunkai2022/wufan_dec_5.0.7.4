package com.join.mgps.adapter;

import android.content.Intent;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.findgame.CategoryDetailListActivity;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.SimulatorFastEntryBean;
import java.util.List;
/* loaded from: classes4.dex */
public class SimulatorFastEntryAdapter extends BaseQuickAdapter<SimulatorFastEntryBean.FastEntryBean, BaseViewHolder> {
    public SimulatorFastEntryAdapter(@Nullable List<SimulatorFastEntryBean.FastEntryBean> list) {
        super(R.layout.layout_simulator_fast_entry_item, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(SimulatorFastEntryBean.FastEntryBean fastEntryBean, View view) {
        Intent intent = new Intent(this.mContext, CategoryDetailListActivity.class);
        intent.putExtra("typeId", 1);
        intent.putExtra("tagId", fastEntryBean.getId());
        intent.putExtra("tagName", fastEntryBean.getTitle());
        intent.putExtra("from", 207);
        this.mContext.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: b */
    public void convert(BaseViewHolder baseViewHolder, final SimulatorFastEntryBean.FastEntryBean fastEntryBean) {
        MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.icon), fastEntryBean.getPic());
        baseViewHolder.setText(R.id.name, fastEntryBean.getTitle());
        baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.u5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimulatorFastEntryAdapter.this.c(fastEntryBean, view);
            }
        });
    }
}
