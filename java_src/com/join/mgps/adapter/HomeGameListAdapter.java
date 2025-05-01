package com.join.mgps.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.activity.GameDetailActivity_;
import com.join.mgps.dto.GameFromPopoWinBeanV2;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.ExtFrom;
import java.util.List;
/* loaded from: classes4.dex */
public class HomeGameListAdapter extends RecyclerView.Adapter<b> {

    /* renamed from: a  reason: collision with root package name */
    List<GameFromPopoWinBeanV2.DataBean> f43220a;

    /* renamed from: b  reason: collision with root package name */
    Context f43221b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameFromPopoWinBeanV2.DataBean f43222b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43223c;

        a(GameFromPopoWinBeanV2.DataBean dataBean, int i4) {
            this.f43222b = dataBean;
            this.f43223c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HomeGameListAdapter homeGameListAdapter = HomeGameListAdapter.this;
            homeGameListAdapter.a(this.f43222b.getId() + "", this.f43222b.getUid());
            Ext ext = new Ext();
            ext.setPosition("fromGameDetailP2");
            ext.setArticleId(this.f43222b.getId() + "");
            com.papa.sim.statistic.p.l(HomeGameListAdapter.this.f43221b).O1(Event.enterUserGameList, ext);
            HomeGameListAdapter homeGameListAdapter2 = HomeGameListAdapter.this;
            homeGameListAdapter2.f("22-21-" + (this.f43223c + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        View f43225a;

        /* renamed from: b  reason: collision with root package name */
        TextView f43226b;

        /* renamed from: c  reason: collision with root package name */
        LinearLayout f43227c;

        /* renamed from: d  reason: collision with root package name */
        LinearLayout f43228d;

        /* renamed from: e  reason: collision with root package name */
        TextView f43229e;

        /* renamed from: f  reason: collision with root package name */
        TextView f43230f;

        /* renamed from: g  reason: collision with root package name */
        TextView f43231g;

        public b(@NonNull View view) {
            super(view);
            this.f43225a = view.findViewById(R.id.main);
            this.f43226b = (TextView) view.findViewById(R.id.title);
            this.f43227c = (LinearLayout) view.findViewById(R.id.iconLayout);
            this.f43228d = (LinearLayout) view.findViewById(R.id.iconLayout2);
            this.f43229e = (TextView) view.findViewById(R.id.name);
            this.f43230f = (TextView) view.findViewById(R.id.number);
            this.f43231g = (TextView) view.findViewById(R.id.follow);
        }
    }

    public HomeGameListAdapter(Context context, List<GameFromPopoWinBeanV2.DataBean> list) {
        this.f43220a = list;
        this.f43221b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i4) {
        Intent intent = new Intent(this.f43221b, GameDetailActivity_.class);
        intent.putExtra("fromid", str);
        intent.putExtra("_from", 11105);
        intent.putExtra("groupuid", i4);
        this.f43221b.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(String str) {
        com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(this.f43221b);
        String name = ExtFrom.home.name();
        l4.t(name, "22-" + str, AccountUtil_.getInstance_(this.f43221b).getUid());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d */
    public void onBindViewHolder(@NonNull b bVar, int i4) {
        getItemViewType(i4);
        GameFromPopoWinBeanV2.DataBean dataBean = this.f43220a.get(i4);
        bVar.f43225a.setOnClickListener(new a(dataBean, i4));
        bVar.f43226b.setText(dataBean.getTitle());
        TextView textView = bVar.f43229e;
        textView.setText("by  " + dataBean.getNick_name());
        bVar.f43227c.removeAllViews();
        for (int i5 = 0; i5 < dataBean.getGame_list().size(); i5++) {
            String game_ico = dataBean.getGame_list().get(i5).getGame_ico();
            View inflate = LayoutInflater.from(this.f43221b).inflate(R.layout.gamelist_listitembig_gameicon_layout, (ViewGroup) null);
            MyImageLoader.d((SimpleDraweeView) inflate.findViewById(R.id.icon), R.drawable.main_normal_icon, game_ico);
            if (i5 < 2) {
                bVar.f43227c.addView(inflate);
            } else if (i5 < 4) {
                bVar.f43228d.addView(inflate);
            }
        }
        int i6 = i4 % 5;
        if (i6 == 0) {
            bVar.f43225a.setBackgroundResource(R.drawable.gamelist_itemback_1);
        } else if (i6 == 1) {
            bVar.f43225a.setBackgroundResource(R.drawable.gamelist_itemback_2);
        } else if (i6 == 2) {
            bVar.f43225a.setBackgroundResource(R.drawable.gamelist_itemback_3);
        } else if (i6 == 3) {
            bVar.f43225a.setBackgroundResource(R.drawable.gamelist_itemback_4);
        } else if (i6 == 4) {
            bVar.f43225a.setBackgroundResource(R.drawable.gamelist_itemback_5);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* renamed from: e */
    public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
        return new b(LayoutInflater.from(this.f43221b).inflate(R.layout.gamelist_list_itemhome, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f43220a.size();
    }
}
