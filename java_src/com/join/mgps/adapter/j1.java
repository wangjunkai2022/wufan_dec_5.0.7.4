package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.DynamicEntranceBean;
import java.util.List;
/* compiled from: GameMainNewDynamicEntranceAdapter.java */
/* loaded from: classes4.dex */
public class j1 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f44454b;

    /* renamed from: c  reason: collision with root package name */
    private List<DynamicEntranceBean> f44455c;

    /* renamed from: d  reason: collision with root package name */
    private a f44456d;

    /* compiled from: GameMainNewDynamicEntranceAdapter.java */
    /* loaded from: classes4.dex */
    public interface a {
        void J(DynamicEntranceBean dynamicEntranceBean);
    }

    /* compiled from: GameMainNewDynamicEntranceAdapter.java */
    /* loaded from: classes4.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private View f44457a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f44458b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f44459c;

        public b() {
        }
    }

    public j1(Context context, List<DynamicEntranceBean> list, a aVar) {
        this.f44454b = context;
        this.f44455c = list;
        this.f44456d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i4, View view) {
        this.f44456d.J(this.f44455c.get(i4));
    }

    public void b() {
        this.f44455c.clear();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public DynamicEntranceBean getItem(int i4) {
        return this.f44455c.get(i4);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44455c.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(final int i4, View view, ViewGroup viewGroup) {
        b bVar;
        if (view == null) {
            view = LayoutInflater.from(this.f44454b).inflate(R.layout.item_game_main_new_view, (ViewGroup) null);
            bVar = new b();
            bVar.f44457a = view.findViewById(R.id.itemGameMainNewRootRl);
            bVar.f44458b = (TextView) view.findViewById(R.id.itemGameMainNameTx);
            bVar.f44459c = (TextView) view.findViewById(R.id.itemGameMainTipTv);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        bVar.f44458b.setText(this.f44455c.get(i4).getName());
        String tips = this.f44455c.get(i4).getTips();
        if (com.join.mgps.Util.g2.h(tips) || "0".equals(tips)) {
            bVar.f44459c.setVisibility(8);
        } else {
            bVar.f44459c.setVisibility(0);
            bVar.f44459c.setText(tips);
        }
        bVar.f44457a.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                j1.this.d(i4, view2);
            }
        });
        return view;
    }
}
