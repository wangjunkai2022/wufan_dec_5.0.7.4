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
import com.join.mgps.dto.GameMainV4DataBean;
import java.util.List;
/* loaded from: classes4.dex */
public class SimulatorVipBuyRecordAdapter extends RecyclerView.Adapter<a> {

    /* renamed from: a  reason: collision with root package name */
    private Context f44140a;

    /* renamed from: b  reason: collision with root package name */
    private List<GameMainV4DataBean.UserInfoBean> f44141b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private TextView f44142a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f44143b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f44144c;

        public a(@NonNull View view) {
            super(view);
            this.f44142a = (TextView) view.findViewById(R.id.tvFunc);
            this.f44143b = (SimpleDraweeView) view.findViewById(R.id.ivAvatar);
            this.f44144c = (TextView) view.findViewById(R.id.tvDesc);
        }
    }

    public SimulatorVipBuyRecordAdapter(Context context, List<GameMainV4DataBean.UserInfoBean> list) {
        this.f44140a = context;
        this.f44141b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public void onBindViewHolder(@NonNull a aVar, int i4) {
        List<GameMainV4DataBean.UserInfoBean> list = this.f44141b;
        aVar.f44142a.setVisibility(8);
        aVar.f44143b.setVisibility(0);
        aVar.f44144c.setVisibility(0);
        MyImageLoader.h(aVar.f44143b, list.get(i4 % list.size()).getAvatar());
        aVar.f44144c.setText("已开通VIP");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* renamed from: d */
    public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
        return new a(LayoutInflater.from(this.f44140a).inflate(R.layout.item_gold_finger_func, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}
