package com.join.mgps.adapter;

import android.content.Context;
import android.view.ViewGroup;
import com.join.mgps.adapter.RecyclerViewBaseAdapter;
import com.join.mgps.customview.GameTransferHistoryListItem;
import com.join.mgps.customview.GameTransferHistoryListItem_;
import com.join.mgps.dto.GameTransferBean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
@EBean
/* loaded from: classes4.dex */
public class GameTransferHistoryAdapter extends RecyclerViewBaseAdapter<GameTransferBean, GameTransferHistoryListItem> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f43191e = "GameTransferHistoryAdapter";
    @RootContext

    /* renamed from: d  reason: collision with root package name */
    Context f43192d;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: j */
    public void onBindViewHolder(RecyclerViewBaseAdapter.a<GameTransferHistoryListItem> aVar, int i4) {
        if (aVar instanceof RecyclerViewBaseAdapter.a) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBindViewHolder: position");
            sb.append(i4);
            aVar.a().b((GameTransferBean) this.f44018a.valueAt(i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.adapter.RecyclerViewBaseAdapter
    /* renamed from: k */
    public GameTransferHistoryListItem d(ViewGroup viewGroup, int i4) {
        return GameTransferHistoryListItem_.e(this.f43192d);
    }
}
