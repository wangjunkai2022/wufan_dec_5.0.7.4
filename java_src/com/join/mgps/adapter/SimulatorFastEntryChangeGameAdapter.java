package com.join.mgps.adapter;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.SimulatorFastEntryBean;
import java.util.List;
/* loaded from: classes4.dex */
public class SimulatorFastEntryChangeGameAdapter extends BaseQuickAdapter<SimulatorFastEntryBean.ChangeGame, BaseViewHolder> {
    public SimulatorFastEntryChangeGameAdapter(@Nullable List<SimulatorFastEntryBean.ChangeGame> list) {
        super(R.layout.layout_simulator_change_game_item, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(SimulatorFastEntryBean.ChangeGame changeGame, View view) {
        IntentDateBean intentDataBean = changeGame.getIntentDataBean();
        ExtBean extBean = new ExtBean();
        extBean.setFrom("207");
        extBean.set_from_type(207);
        intentDataBean.setExtBean(extBean);
        IntentUtil.getInstance().intentActivity(this.mContext, intentDataBean);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: b */
    public void convert(BaseViewHolder baseViewHolder, final SimulatorFastEntryBean.ChangeGame changeGame) {
        MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.ivGamePic), changeGame.getBig_pic());
        baseViewHolder.setText(R.id.tvGameName, changeGame.getTitle());
        baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.v5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimulatorFastEntryChangeGameAdapter.this.c(changeGame, view);
            }
        });
    }
}
