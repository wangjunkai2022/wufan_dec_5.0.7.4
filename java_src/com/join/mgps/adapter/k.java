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
/* compiled from: DiscoveryBottomAdapter.java */
/* loaded from: classes4.dex */
public class k extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f44469b;

    /* renamed from: c  reason: collision with root package name */
    private List<DiscoveryMainDataBean.ForumListBean> f44470c;

    /* renamed from: d  reason: collision with root package name */
    private RoundingParams f44471d;

    /* compiled from: DiscoveryBottomAdapter.java */
    /* loaded from: classes4.dex */
    class a {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f44472a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f44473b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f44474c;

        /* renamed from: d  reason: collision with root package name */
        private ImageView f44475d;

        a() {
        }
    }

    public k(Context context, List<DiscoveryMainDataBean.ForumListBean> list) {
        this.f44469b = context;
        this.f44470c = list;
        this.f44471d = MyImageLoader.E(context, context.getResources().getDimension(R.dimen.recom_item_magintop));
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public DiscoveryMainDataBean.ForumListBean getItem(int i4) {
        return this.f44470c.get(i4);
    }

    public void b(List<DiscoveryMainDataBean.ForumListBean> list) {
        this.f44470c = list;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44470c.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        View view2;
        a aVar;
        DiscoveryMainDataBean.ForumListBean forumListBean = this.f44470c.get(i4);
        if (view == null) {
            aVar = new a();
            view2 = LayoutInflater.from(this.f44469b).inflate(R.layout.item_discovery_bottom_view, (ViewGroup) null);
            aVar.f44472a = (SimpleDraweeView) view2.findViewById(R.id.ItemIcon);
            aVar.f44473b = (TextView) view2.findViewById(R.id.ItemName);
            aVar.f44474c = (TextView) view2.findViewById(R.id.ItemNum);
            aVar.f44475d = (ImageView) view2.findViewById(R.id.ItemMy);
            view2.setTag(aVar);
        } else {
            view2 = view;
            aVar = (a) view.getTag();
        }
        MyImageLoader.j(aVar.f44472a, forumListBean.getIcon_src(), this.f44471d);
        aVar.f44473b.setText(forumListBean.getName());
        TextView textView = aVar.f44474c;
        textView.setText("今日:" + forumListBean.getToday_posts());
        if (forumListBean.isIs_follow()) {
            aVar.f44475d.setVisibility(0);
        } else {
            aVar.f44475d.setVisibility(8);
        }
        return view2;
    }
}
