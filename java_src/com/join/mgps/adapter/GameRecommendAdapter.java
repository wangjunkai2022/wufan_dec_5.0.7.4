package com.join.mgps.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.dto.GameMainV3DataBean;
import com.papa.sim.statistic.Event;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public class GameRecommendAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: b  reason: collision with root package name */
    private Context f43122b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f43123c;

    /* renamed from: d  reason: collision with root package name */
    private Map<Integer, Integer> f43124d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private List<GameMainV3DataBean.GameRecommendInfoBean> f43121a = new ArrayList();

    /* loaded from: classes4.dex */
    public class ItemHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f43125a;

        /* renamed from: b  reason: collision with root package name */
        TextView f43126b;

        /* renamed from: c  reason: collision with root package name */
        LinearLayout f43127c;

        public ItemHolder(View view) {
            super(view);
            this.f43125a = (SimpleDraweeView) view.findViewById(R.id.itemGameRecommendIv);
            this.f43126b = (TextView) view.findViewById(R.id.itemGameRecommendTx);
            this.f43127c = (LinearLayout) view.findViewById(R.id.itemGameRecommendRootLl);
        }
    }

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f43129b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43130c;

        a(String str, int i4) {
            this.f43129b = str;
            this.f43130c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(GameRecommendAdapter.this.f43122b);
            Event event = Event.clickIndexAdEvent;
            String uid = AccountUtil_.getInstance_(GameRecommendAdapter.this.f43122b).getUid();
            String str = this.f43129b;
            l4.Z0(event, uid, str, "1-" + (this.f43130c + 1), 0);
            IntentUtil.getInstance().goGameDetialActivity(GameRecommendAdapter.this.f43122b, this.f43129b, "0", 1, 122);
        }
    }

    public GameRecommendAdapter(Context context) {
        this.f43122b = context;
        this.f43123c = LayoutInflater.from(this.f43122b);
    }

    public void b(List<GameMainV3DataBean.GameRecommendInfoBean> list) {
        this.f43121a = list;
        notifyDataSetChanged();
    }

    public void c() {
        this.f43124d.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f43121a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
        try {
            GameMainV3DataBean.GameRecommendInfoBean gameRecommendInfoBean = this.f43121a.get(i4);
            if (!(viewHolder instanceof ItemHolder) || gameRecommendInfoBean == null) {
                return;
            }
            String valueOf = String.valueOf(gameRecommendInfoBean.getGame_id());
            if (!this.f43124d.containsKey(Integer.valueOf(i4))) {
                this.f43124d.put(Integer.valueOf(i4), Integer.valueOf(i4));
                StringBuilder sb = new StringBuilder();
                sb.append("dot:");
                sb.append(i4);
                com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(this.f43122b);
                Event event = Event.visitIndexAdEvent;
                String uid = AccountUtil_.getInstance_(this.f43122b).getUid();
                l4.Z0(event, uid, valueOf, "1-" + (i4 + 1), 0);
            }
            ItemHolder itemHolder = (ItemHolder) viewHolder;
            String game_pic = gameRecommendInfoBean.getGame_pic();
            if (!com.join.mgps.Util.g2.h(game_pic)) {
                itemHolder.f43125a.setController(Fresco.newDraweeControllerBuilder().a(Uri.parse(game_pic)).E(true).build());
            }
            itemHolder.f43126b.setText(gameRecommendInfoBean.getGame_title());
            itemHolder.f43127c.setOnClickListener(new a(valueOf, i4));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
        return new ItemHolder(this.f43123c.inflate(R.layout.item_game_recommend_view, viewGroup, false));
    }
}
