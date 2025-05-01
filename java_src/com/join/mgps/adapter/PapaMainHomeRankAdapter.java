package com.join.mgps.adapter;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.adapter.PapaMainV4Adapter;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.CommonGameInfoBean;
import com.papa.sim.statistic.ExtFrom;
import java.util.List;
/* loaded from: classes4.dex */
public class PapaMainHomeRankAdapter extends BaseQuickAdapter<List<CommonGameInfoBean>, BaseViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    private PapaMainV4Adapter.e f43879a;

    public PapaMainHomeRankAdapter(@Nullable List<List<CommonGameInfoBean>> list, PapaMainV4Adapter.e eVar) {
        super(R.layout.layout_papa_main_home_rank_rv, list);
        this.f43879a = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(List list, BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        IntentUtil.getInstance().intentActivity(this.mContext, ((CommonGameInfoBean) list.get(i4)).getIntentDataBean());
        f(((CommonGameInfoBean) list.get(i4)).getExp_position());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(List list, BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        PapaMainV4Adapter.e eVar = this.f43879a;
        if (eVar != null) {
            eVar.B((CommonGameInfoBean) list.get(i4));
        }
    }

    private void f(String str) {
        com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(this.mContext);
        String name = ExtFrom.home.name();
        l4.t(name, "22-" + str, AccountUtil_.getInstance_(this.mContext).getUid());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.BaseQuickAdapter
    /* renamed from: c */
    public void convert(@NonNull BaseViewHolder baseViewHolder, final List<CommonGameInfoBean> list) {
        RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        RankingItemV4Adapter rankingItemV4Adapter = new RankingItemV4Adapter(list);
        rankingItemV4Adapter.setOnItemClickListener(new BaseQuickAdapter.j() { // from class: com.join.mgps.adapter.q3
            @Override // com.join.mgps.base.BaseQuickAdapter.j
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                PapaMainHomeRankAdapter.this.d(list, baseQuickAdapter, view, i4);
            }
        });
        rankingItemV4Adapter.setOnItemChildClickListener(new BaseQuickAdapter.h() { // from class: com.join.mgps.adapter.p3
            @Override // com.join.mgps.base.BaseQuickAdapter.h
            public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                PapaMainHomeRankAdapter.this.e(list, baseQuickAdapter, view, i4);
            }
        });
        recyclerView.setAdapter(rankingItemV4Adapter);
    }
}
