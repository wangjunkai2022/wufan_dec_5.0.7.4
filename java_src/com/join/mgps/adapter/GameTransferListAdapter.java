package com.join.mgps.adapter;

import android.content.Context;
import android.view.ViewGroup;
import com.join.mgps.adapter.RecyclerViewBaseAdapter;
import com.join.mgps.customview.GameTransferListItem;
import com.join.mgps.customview.GameTransferListItem_;
import com.join.mgps.dto.GameTransferBean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
@EBean
/* loaded from: classes4.dex */
public class GameTransferListAdapter extends RecyclerViewBaseAdapter<GameTransferBean, GameTransferListItem> {

    /* renamed from: f  reason: collision with root package name */
    private static final String f43205f = "GameTransferListAdapter";
    @RootContext

    /* renamed from: d  reason: collision with root package name */
    Context f43206d;

    /* renamed from: e  reason: collision with root package name */
    boolean f43207e = false;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: j */
    public void onBindViewHolder(RecyclerViewBaseAdapter.a<GameTransferListItem> aVar, int i4) {
        if (aVar instanceof RecyclerViewBaseAdapter.a) {
            aVar.a().b(i4, this.f44018a, this.f43207e);
            StringBuilder sb = new StringBuilder();
            sb.append("onBindViewHolder: ");
            sb.append(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.adapter.RecyclerViewBaseAdapter
    /* renamed from: k */
    public GameTransferListItem d(ViewGroup viewGroup, int i4) {
        return GameTransferListItem_.d(this.f43206d);
    }

    public void l(boolean z4) {
        this.f43207e = z4;
    }
}
