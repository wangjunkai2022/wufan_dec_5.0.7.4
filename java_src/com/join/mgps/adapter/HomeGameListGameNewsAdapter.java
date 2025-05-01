package com.join.mgps.adapter;

import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.PAPAHomeBeanV7;
import java.util.Date;
import java.util.List;
/* loaded from: classes4.dex */
public class HomeGameListGameNewsAdapter extends BaseQuickAdapter<PAPAHomeBeanV7.NgSelectionDTO, BaseViewHolder> {
    public HomeGameListGameNewsAdapter(@Nullable List<PAPAHomeBeanV7.NgSelectionDTO> list) {
        super(R.layout.mgpapa_home_game_news_layout, list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: a */
    public void convert(BaseViewHolder baseViewHolder, PAPAHomeBeanV7.NgSelectionDTO ngSelectionDTO) {
        try {
            long parseLong = Long.parseLong(ngSelectionDTO.getDate()) * 1000;
            ((TextView) baseViewHolder.getView(R.id.tvDate)).setText(com.join.mgps.Util.y.u(parseLong) ? "今天" : com.join.mgps.Util.y.e(new Date(parseLong), "MM.dd"));
        } catch (Exception unused) {
            ((TextView) baseViewHolder.getView(R.id.tvDate)).setText(ngSelectionDTO.getDate());
        }
        ((TextView) baseViewHolder.getView(R.id.tvDesc)).setText(ngSelectionDTO.getTitle());
        ((TextView) baseViewHolder.getView(R.id.tvGameName)).setText(ngSelectionDTO.getName());
        MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.ivGameIcon), ngSelectionDTO.getIco());
    }
}
