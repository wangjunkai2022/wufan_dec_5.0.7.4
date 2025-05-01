package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import java.util.List;
/* loaded from: classes4.dex */
public class SimulatorGoldFingerFunAdapter extends RecyclerView.Adapter<a> {

    /* renamed from: a  reason: collision with root package name */
    private Context f44133a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f44134b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private TextView f44135a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f44136b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f44137c;

        public a(@NonNull View view) {
            super(view);
            this.f44135a = (TextView) view.findViewById(R.id.tvFunc);
            this.f44136b = (SimpleDraweeView) view.findViewById(R.id.ivAvatar);
            this.f44137c = (TextView) view.findViewById(R.id.tvDesc);
        }
    }

    public SimulatorGoldFingerFunAdapter(Context context, List<String> list) {
        this.f44133a = context;
        this.f44134b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public void onBindViewHolder(@NonNull a aVar, int i4) {
        aVar.f44135a.setVisibility(0);
        aVar.f44136b.setVisibility(8);
        aVar.f44137c.setVisibility(8);
        TextView textView = aVar.f44135a;
        List<String> list = this.f44134b;
        textView.setText(list.get(i4 % list.size()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* renamed from: d */
    public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
        return new a(LayoutInflater.from(this.f44133a).inflate(R.layout.item_gold_finger_func, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}
