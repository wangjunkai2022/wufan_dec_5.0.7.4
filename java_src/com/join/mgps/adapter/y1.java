package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.activity.GameInformationActivityV2_;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.InformationListDataBean;
import com.papa.sim.statistic.ExtFrom;
import java.util.List;
/* compiled from: MGInformationAdapter.java */
/* loaded from: classes4.dex */
public class y1 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    ExtBean f46035b;

    /* renamed from: c  reason: collision with root package name */
    private Context f46036c;

    /* renamed from: d  reason: collision with root package name */
    private List<InformationListDataBean> f46037d;

    /* compiled from: MGInformationAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationListDataBean f46038b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f46039c;

        a(InformationListDataBean informationListDataBean, int i4) {
            this.f46038b = informationListDataBean;
            this.f46039c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationActivityV2_.n1(y1.this.f46036c).c(this.f46038b.getTag_id()).d(this.f46038b.getTitle()).start();
            y1.this.f46035b = new ExtBean();
            y1.this.f46035b.setFrom(ExtFrom.home.name());
            com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(y1.this.f46036c);
            String from = y1.this.f46035b.getFrom();
            String position = y1.this.f46035b.getPosition();
            l4.L2(from, position, "page" + (this.f46039c + 1), "article", AccountUtil_.getInstance_(y1.this.f46036c).getUid());
        }
    }

    /* compiled from: MGInformationAdapter.java */
    /* loaded from: classes4.dex */
    class b {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f46041a;

        /* renamed from: b  reason: collision with root package name */
        TextView f46042b;

        /* renamed from: c  reason: collision with root package name */
        TextView f46043c;

        b() {
        }
    }

    public y1(Context context) {
        this.f46036c = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f46037d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        View view2;
        b bVar;
        if (view == null) {
            bVar = new b();
            view2 = LayoutInflater.from(this.f46036c).inflate(R.layout.information_content_item, (ViewGroup) null);
            bVar.f46041a = (SimpleDraweeView) view2.findViewById(R.id.imageAd);
            bVar.f46042b = (TextView) view2.findViewById(R.id.tvTitle);
            bVar.f46043c = (TextView) view2.findViewById(R.id.tvPraise);
            view2.setTag(bVar);
        } else {
            view2 = view;
            bVar = (b) view.getTag();
        }
        InformationListDataBean informationListDataBean = this.f46037d.get(i4);
        bVar.f46041a.setImageDrawable(this.f46036c.getResources().getDrawable(R.drawable.banner_normal_icon));
        MyImageLoader.f(bVar.f46041a, R.drawable.banner_normal_icon, informationListDataBean.getMaterial(), MyImageLoader.D(this.f46036c));
        bVar.f46042b.setText(informationListDataBean.getTitle());
        bVar.f46043c.setText(informationListDataBean.getPraise());
        bVar.f46041a.setOnClickListener(new a(informationListDataBean, i4));
        return view2;
    }

    public y1(Context context, List<InformationListDataBean> list, ExtBean extBean) {
        this.f46036c = context;
        this.f46037d = list;
        this.f46035b = extBean;
    }
}
