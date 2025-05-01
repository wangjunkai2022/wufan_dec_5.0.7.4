package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.ModGameArchiveTagBean;
import java.util.List;
/* loaded from: classes4.dex */
public class CloudArchiveTagAdapter extends RecyclerView.Adapter<ArchiveTagViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    private List<ModGameArchiveTagBean> f39888a;

    /* renamed from: b  reason: collision with root package name */
    private Context f39889b;

    /* renamed from: c  reason: collision with root package name */
    private int f39890c;

    /* renamed from: d  reason: collision with root package name */
    private a f39891d;

    /* loaded from: classes4.dex */
    public class ArchiveTagViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private TextView f39892a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f39893b;

        public ArchiveTagViewHolder(@NonNull View view) {
            super(view);
            this.f39892a = (TextView) view.findViewById(R.id.tvType);
            this.f39893b = (TextView) view.findViewById(R.id.tvCountNew);
        }
    }

    /* loaded from: classes4.dex */
    public interface a {
        void onSelected(int i4);
    }

    public CloudArchiveTagAdapter(Context context, List<ModGameArchiveTagBean> list) {
        this(context, 0, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(int i4, View view) {
        a aVar = this.f39891d;
        if (aVar != null) {
            aVar.onSelected(i4);
            this.f39888a.get(i4).setCount(0);
            int i5 = 0;
            while (i5 < this.f39888a.size()) {
                this.f39888a.get(i5).setSelected(i4 == i5);
                i5++;
            }
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c */
    public void onBindViewHolder(@NonNull ArchiveTagViewHolder archiveTagViewHolder, final int i4) {
        ModGameArchiveTagBean modGameArchiveTagBean = this.f39888a.get(i4);
        archiveTagViewHolder.f39892a.setText(modGameArchiveTagBean.getName());
        archiveTagViewHolder.f39892a.setSelected(modGameArchiveTagBean.isSelected());
        archiveTagViewHolder.f39893b.setVisibility(modGameArchiveTagBean.getCount() > 0 ? 0 : 8);
        archiveTagViewHolder.f39893b.setText(String.valueOf(modGameArchiveTagBean.getCount()));
        archiveTagViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CloudArchiveTagAdapter.this.b(i4, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* renamed from: d */
    public ArchiveTagViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
        if (this.f39890c == 1) {
            return new ArchiveTagViewHolder(LayoutInflater.from(this.f39889b).inflate(R.layout.item_game_detail_cloud_archive_type, viewGroup, false));
        }
        return new ArchiveTagViewHolder(LayoutInflater.from(this.f39889b).inflate(R.layout.item_cloud_archive_type, viewGroup, false));
    }

    public void e(a aVar) {
        this.f39891d = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f39888a.size();
    }

    public CloudArchiveTagAdapter(Context context, int i4, List<ModGameArchiveTagBean> list) {
        this.f39891d = null;
        this.f39889b = context;
        this.f39888a = list;
        this.f39890c = i4;
    }
}
