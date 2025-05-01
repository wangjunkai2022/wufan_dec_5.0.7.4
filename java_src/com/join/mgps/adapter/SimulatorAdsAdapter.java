package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.dto.RecommendAd;
import java.util.List;
/* loaded from: classes4.dex */
public class SimulatorAdsAdapter extends RecyclerView.Adapter<a> {

    /* renamed from: a  reason: collision with root package name */
    private Context f44066a;

    /* renamed from: b  reason: collision with root package name */
    private List<RecommendAd> f44067b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f44068a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f44069b;

        public a(@NonNull View view) {
            super(view);
            this.f44068a = (SimpleDraweeView) view.findViewById(R.id.ivAd);
            this.f44069b = (TextView) view.findViewById(R.id.tvAd);
        }
    }

    public SimulatorAdsAdapter(Context context, List<RecommendAd> list) {
        this.f44066a = context;
        this.f44067b = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(RecommendAd recommendAd, View view) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(recommendAd.getLink_type());
        intentDateBean.setJump_type(recommendAd.getJump_type());
        intentDateBean.setLink_type_val(recommendAd.getLink_type_val());
        intentDateBean.setCrc_link_type_val(recommendAd.getCrc_link_type_val());
        intentDateBean.setTpl_type(recommendAd.getTpl_type() + "");
        IntentUtil.getInstance().intentActivity(view.getContext(), intentDateBean);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c */
    public void onBindViewHolder(@NonNull a aVar, int i4) {
        List<RecommendAd> list = this.f44067b;
        final RecommendAd recommendAd = list.get(i4 % list.size());
        aVar.f44069b.setText(recommendAd.getSub_title());
        MyImageLoader.h(aVar.f44068a, recommendAd.getPic_remote());
        aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.n5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimulatorAdsAdapter.b(RecommendAd.this, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* renamed from: d */
    public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
        return new a(LayoutInflater.from(this.f44066a).inflate(R.layout.item_simulator_recom_ad, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}
