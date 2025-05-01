package com.join.mgps.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.GameDetailActivity_;
import com.join.mgps.dto.GameFromPopoWinBean;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.List;
/* compiled from: DetialFavoritesAdapter.java */
/* loaded from: classes4.dex */
public class i extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    List<GameFromPopoWinBean.DataBean> f44428b;

    /* renamed from: c  reason: collision with root package name */
    Context f44429c;

    /* renamed from: d  reason: collision with root package name */
    int f44430d;

    /* compiled from: DetialFavoritesAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameFromPopoWinBean.DataBean f44431b;

        a(GameFromPopoWinBean.DataBean dataBean) {
            this.f44431b = dataBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), GameDetailActivity_.class);
            intent.putExtra("fromid", this.f44431b.getId());
            intent.putExtra("groupuid", this.f44431b.getUid());
            intent.putExtra("_from", 11103);
            intent.putExtra("gameid", "0");
            intent.putExtra("company_id", "0");
            view.getContext().startActivity(intent);
            Ext ext = new Ext();
            ext.setPosition("fromGameDetailP1");
            ext.setArticleId(this.f44431b.getId());
            com.papa.sim.statistic.p.l(i.this.f44429c).O1(Event.enterUserGameList, ext);
        }
    }

    public i(Context context, List<GameFromPopoWinBean.DataBean> list, int i4) {
        this.f44428b = list;
        this.f44429c = context;
        this.f44430d = i4;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44428b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f44429c).inflate(R.layout.gamedetial_favorties_item_layoutv2, (ViewGroup) null);
        }
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.main);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.iconLayout);
        GameFromPopoWinBean.DataBean dataBean = this.f44428b.get(i4);
        relativeLayout.setOnClickListener(new a(dataBean));
        ((TextView) view.findViewById(R.id.title)).setText(dataBean.getTitle());
        ((TextView) view.findViewById(R.id.name)).setText(dataBean.getNick_name());
        ((TextView) view.findViewById(R.id.follow)).setText(dataBean.getBook_count() + "订阅");
        ((TextView) view.findViewById(R.id.number)).setText(dataBean.getGame_count() + "款");
        linearLayout.removeAllViews();
        for (GameFromPopoWinBean.DataBean.GameListBean gameListBean : dataBean.getGame_list()) {
            View inflate = LayoutInflater.from(this.f44429c).inflate(R.layout.gamelist_listitem_gameicon_layout, (ViewGroup) null);
            MyImageLoader.d((SimpleDraweeView) inflate.findViewById(R.id.icon), R.drawable.main_normal_icon, gameListBean.getGame_ico());
            linearLayout.addView(inflate);
        }
        int i5 = i4 % 5;
        if (i5 == 0) {
            relativeLayout.setBackgroundResource(R.drawable.gamelist_itemback_1);
        } else if (i5 == 1) {
            relativeLayout.setBackgroundResource(R.drawable.gamelist_itemback_2);
        } else if (i5 == 2) {
            relativeLayout.setBackgroundResource(R.drawable.gamelist_itemback_3);
        } else if (i5 == 3) {
            relativeLayout.setBackgroundResource(R.drawable.gamelist_itemback_4);
        } else if (i5 == 4) {
            relativeLayout.setBackgroundResource(R.drawable.gamelist_itemback_5);
        }
        return view;
    }
}
