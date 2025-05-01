package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.DiscoveryMainDataBean;
import java.util.List;
/* compiled from: DiscoveryTopAdapter.java */
/* loaded from: classes4.dex */
public class l extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f44525b;

    /* renamed from: c  reason: collision with root package name */
    private List<DiscoveryMainDataBean.BattleGameBean> f44526c;

    /* renamed from: d  reason: collision with root package name */
    private RoundingParams f44527d;

    /* renamed from: e  reason: collision with root package name */
    private String f44528e;

    /* compiled from: DiscoveryTopAdapter.java */
    /* loaded from: classes4.dex */
    class a {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f44529a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f44530b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f44531c;

        /* renamed from: d  reason: collision with root package name */
        private ImageView f44532d;

        a() {
        }
    }

    public l(Context context, List<DiscoveryMainDataBean.BattleGameBean> list, String str) {
        this.f44525b = context;
        this.f44526c = list;
        this.f44528e = str;
        this.f44527d = MyImageLoader.E(context, context.getResources().getDimension(R.dimen.live_item_radius));
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public DiscoveryMainDataBean.BattleGameBean getItem(int i4) {
        return this.f44526c.get(i4);
    }

    public void b(String str) {
        this.f44528e = str;
        for (int i4 = 0; i4 < this.f44526c.size(); i4++) {
            if (this.f44528e.contains(this.f44526c.get(i4).getGame_id())) {
                this.f44526c.get(i4).setIs_local_battle(true);
            } else {
                this.f44526c.get(i4).setIs_local_battle(false);
            }
        }
        notifyDataSetChanged();
    }

    public void c(List<DiscoveryMainDataBean.BattleGameBean> list) {
        this.f44526c = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f44526c.size() >= 4) {
            return 4;
        }
        return this.f44526c.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        View view2;
        a aVar;
        DiscoveryMainDataBean.BattleGameBean battleGameBean = this.f44526c.get(i4);
        if (view == null) {
            aVar = new a();
            view2 = LayoutInflater.from(this.f44525b).inflate(R.layout.item_discovery_top_view, (ViewGroup) null);
            aVar.f44529a = (SimpleDraweeView) view2.findViewById(R.id.ItemIcon);
            aVar.f44530b = (TextView) view2.findViewById(R.id.ItemName);
            aVar.f44531c = (TextView) view2.findViewById(R.id.ItemNum);
            aVar.f44532d = (ImageView) view2.findViewById(R.id.ItemMy);
            view2.setTag(aVar);
        } else {
            view2 = view;
            aVar = (a) view.getTag();
        }
        MyImageLoader.j(aVar.f44529a, battleGameBean.getGame_ico(), this.f44527d);
        aVar.f44530b.setText(battleGameBean.getGame_name());
        TextView textView = aVar.f44531c;
        textView.setText(battleGameBean.getRoom_count() + "");
        if (battleGameBean.isIs_local_battle()) {
            aVar.f44532d.setVisibility(0);
        } else {
            aVar.f44532d.setVisibility(8);
        }
        return view2;
    }
}
