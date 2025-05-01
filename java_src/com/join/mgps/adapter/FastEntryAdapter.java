package com.join.mgps.adapter;

import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.PAPAHomeBeanV7;
import java.util.List;
/* loaded from: classes4.dex */
public class FastEntryAdapter extends BaseQuickAdapter<PAPAHomeBeanV7.HomeBeanDTO, BaseViewHolder> {
    public FastEntryAdapter(@Nullable List<PAPAHomeBeanV7.HomeBeanDTO> list) {
        super(R.layout.papamain_fastitem_layout_v2, list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: a */
    public void convert(BaseViewHolder baseViewHolder, PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.icon), homeBeanDTO.getBig_pic());
        ((TextView) baseViewHolder.getView(R.id.name)).setText(homeBeanDTO.getTitle());
    }
}
