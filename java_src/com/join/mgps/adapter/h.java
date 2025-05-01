package com.join.mgps.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.GameDetailCheckPoint;
import java.util.List;
/* compiled from: DetailCheckPointAdapter.java */
/* loaded from: classes4.dex */
public class h extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    List<GameDetailCheckPoint> f44406b;

    /* renamed from: c  reason: collision with root package name */
    Context f44407c;

    /* renamed from: d  reason: collision with root package name */
    int f44408d;

    /* compiled from: DetailCheckPointAdapter.java */
    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f44409a;

        /* renamed from: b  reason: collision with root package name */
        TextView f44410b;

        public a() {
        }
    }

    public h(Context context, List<GameDetailCheckPoint> list, int i4) {
        this.f44406b = list;
        this.f44407c = context;
        this.f44408d = i4;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44406b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f44406b.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = LayoutInflater.from(this.f44407c).inflate(R.layout.gamedetial_check_point_item_layoutv2, viewGroup, false);
            aVar = new a();
            aVar.f44409a = (SimpleDraweeView) view.findViewById(R.id.icon);
            aVar.f44410b = (TextView) view.findViewById(R.id.name);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        try {
            GameDetailCheckPoint gameDetailCheckPoint = (GameDetailCheckPoint) getItem(i4);
            MyImageLoader.h(aVar.f44409a, gameDetailCheckPoint.getPic());
            RoundingParams o4 = aVar.f44409a.getHierarchy().o();
            if (o4 == null) {
                o4 = new RoundingParams();
            }
            float dimensionPixelOffset = this.f44407c.getResources().getDimensionPixelOffset(R.dimen.wdp6);
            o4.q(dimensionPixelOffset, dimensionPixelOffset, 0.0f, 0.0f);
            aVar.f44409a.getHierarchy().V(o4);
            aVar.f44410b.setText(gameDetailCheckPoint.getName());
        } catch (Resources.NotFoundException e5) {
            e5.printStackTrace();
        }
        return view;
    }
}
