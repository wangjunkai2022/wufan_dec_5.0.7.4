package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.dto.GameMainV3DataBean;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class MemberFunAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    private List<GameMainV3DataBean.MemberFunBean> f43744a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private Context f43745b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f43746c;

    /* renamed from: d  reason: collision with root package name */
    private String f43747d;

    /* loaded from: classes4.dex */
    public class ItemHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f43748a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f43749b;

        /* renamed from: c  reason: collision with root package name */
        TextView f43750c;

        public ItemHolder(View view) {
            super(view);
            this.f43748a = (LinearLayout) view.findViewById(R.id.itemMemberFunRootLl);
            this.f43749b = (SimpleDraweeView) view.findViewById(R.id.itemMemberFunIv);
            this.f43750c = (TextView) view.findViewById(R.id.itemMemberFunTx);
        }
    }

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameMainV3DataBean.MemberFunBean f43752b;

        a(GameMainV3DataBean.MemberFunBean memberFunBean) {
            this.f43752b = memberFunBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            if (com.join.mgps.Util.g2.h(this.f43752b.getUrl())) {
                return;
            }
            String url = this.f43752b.getUrl();
            if (url.contains("?")) {
                str = url + "&game_id=" + MemberFunAdapter.this.f43747d;
            } else {
                str = url + "?game_id=" + MemberFunAdapter.this.f43747d;
            }
            IntentUtil.getInstance().goShareWebActivity(MemberFunAdapter.this.f43745b, str);
        }
    }

    public MemberFunAdapter(Context context, String str) {
        this.f43747d = str;
        this.f43745b = context;
        this.f43746c = LayoutInflater.from(this.f43745b);
    }

    public void c(List<GameMainV3DataBean.MemberFunBean> list) {
        this.f43744a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f43744a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
        GameMainV3DataBean.MemberFunBean memberFunBean = this.f43744a.get(i4);
        if (viewHolder instanceof ItemHolder) {
            ItemHolder itemHolder = (ItemHolder) viewHolder;
            String pic = memberFunBean.getPic();
            if (!com.join.mgps.Util.g2.h(pic)) {
                itemHolder.f43749b.setImageURI(pic);
            }
            itemHolder.f43750c.setText(memberFunBean.getTitle());
            itemHolder.f43748a.setOnClickListener(new a(memberFunBean));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
        return new ItemHolder(this.f43746c.inflate(R.layout.item_member_fun_view, viewGroup, false));
    }
}
