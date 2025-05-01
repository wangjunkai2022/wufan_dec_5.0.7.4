package com.join.mgps.adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.dto.GamedetialModleFourBean;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class SimulatorExitPlayAdapter extends RecyclerView.Adapter {

    /* renamed from: a  reason: collision with root package name */
    Context f44071a;

    /* renamed from: b  reason: collision with root package name */
    private List<GamedetialModleFourBean> f44072b = new ArrayList();

    /* loaded from: classes4.dex */
    class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f44073a;

        /* renamed from: b  reason: collision with root package name */
        TextView f44074b;

        /* renamed from: c  reason: collision with root package name */
        TextView f44075c;

        /* renamed from: d  reason: collision with root package name */
        TextView f44076d;

        /* renamed from: e  reason: collision with root package name */
        TextView f44077e;

        /* renamed from: f  reason: collision with root package name */
        View f44078f;

        /* renamed from: g  reason: collision with root package name */
        View f44079g;

        /* renamed from: h  reason: collision with root package name */
        View f44080h;

        /* renamed from: i  reason: collision with root package name */
        View f44081i;

        /* renamed from: j  reason: collision with root package name */
        LinearLayout f44082j;

        public a(@NonNull View view) {
            super(view);
            this.f44073a = (SimpleDraweeView) view.findViewById(R.id.img);
            this.f44074b = (TextView) view.findViewById(R.id.count);
            this.f44075c = (TextView) view.findViewById(R.id.name);
            this.f44076d = (TextView) view.findViewById(R.id.desc);
            this.f44078f = view.findViewById(R.id.ml);
            this.f44079g = view.findViewById(R.id.mr);
            this.f44080h = view.findViewById(R.id.divider);
            this.f44081i = view.findViewById(R.id.rect);
            this.f44077e = (TextView) view.findViewById(R.id.score);
            this.f44082j = (LinearLayout) view.findViewById(R.id.tagLayout);
        }
    }

    public SimulatorExitPlayAdapter(Context context) {
        this.f44071a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(GamedetialModleFourBean gamedetialModleFourBean, View view) {
        IntentUtil.getInstance().goGameDetialActivity(view.getContext(), gamedetialModleFourBean.getCrc_sign_id(), gamedetialModleFourBean.getGame_info_tpl_type(), gamedetialModleFourBean.getSp_tpl_two_position(), 13101);
    }

    public List<GamedetialModleFourBean> b() {
        return this.f44072b;
    }

    public void d(List<GamedetialModleFourBean> list) {
        this.f44072b = list;
    }

    View e(String str) {
        TextView textView = new TextView(this.f44071a);
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextColor(Color.parseColor("#FFA8A8A8"));
        textView.setTextSize(0, this.f44071a.getResources().getDimensionPixelSize(R.dimen.wdp20));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, this.f44071a.getResources().getDimensionPixelOffset(R.dimen.wdp10), 0);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f44072b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i4) {
        if (viewHolder instanceof a) {
            a aVar = (a) viewHolder;
            final GamedetialModleFourBean gamedetialModleFourBean = this.f44072b.get(i4);
            if (!TextUtils.isEmpty(gamedetialModleFourBean.getRecommend_game_big_gif()) && i4 == 0) {
                MyImageLoader.n(aVar.f44073a, gamedetialModleFourBean.getRecommend_game_big_gif());
            } else if (!TextUtils.isEmpty(gamedetialModleFourBean.getRecommend_game_big_pic()) && (i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3)) {
                MyImageLoader.e(aVar.f44073a, R.drawable.main_normal_icon, gamedetialModleFourBean.getRecommend_game_big_pic(), r.c.f11300g);
            } else if (gamedetialModleFourBean.getPic_info() != null && gamedetialModleFourBean.getPic_info().size() > 0 && gamedetialModleFourBean.getPic_info().get(0).getRemote() != null) {
                MyImageLoader.e(aVar.f44073a, R.drawable.main_normal_icon, gamedetialModleFourBean.getPic_info().get(0).getRemote().getPath(), r.c.f11300g);
            }
            aVar.f44075c.setText(gamedetialModleFourBean.getGame_name());
            aVar.f44077e.setText(gamedetialModleFourBean.getScore());
            aVar.f44081i.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.p5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SimulatorExitPlayAdapter.c(GamedetialModleFourBean.this, view);
                }
            });
            aVar.f44082j.removeAllViews();
            if (gamedetialModleFourBean.getTag_info() != null) {
                for (int i5 = 0; i5 < gamedetialModleFourBean.getTag_info().size() && i5 <= 2; i5++) {
                    aVar.f44082j.addView(e(gamedetialModleFourBean.getTag_info().get(i5).getName()));
                }
            }
            if (i4 == 0) {
                aVar.f44078f.setVisibility(0);
                aVar.f44080h.setVisibility(8);
                aVar.f44079g.setVisibility(8);
            } else if (i4 == getItemCount() - 1) {
                aVar.f44078f.setVisibility(8);
                aVar.f44080h.setVisibility(0);
                aVar.f44079g.setVisibility(0);
            } else {
                aVar.f44078f.setVisibility(8);
                aVar.f44080h.setVisibility(0);
                aVar.f44079g.setVisibility(8);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
        return new a(LayoutInflater.from(this.f44071a).inflate(R.layout.simulator_exit_item, viewGroup, false));
    }
}
