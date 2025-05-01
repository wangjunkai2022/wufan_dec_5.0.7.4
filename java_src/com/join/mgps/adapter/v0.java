package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.dto.RecommendGameBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GameDetailRecomAdapter.java */
/* loaded from: classes4.dex */
public class v0 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f45914b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f45915c;

    /* renamed from: d  reason: collision with root package name */
    private List<RecommendGameBean> f45916d;

    /* renamed from: e  reason: collision with root package name */
    private int f45917e;

    /* compiled from: GameDetailRecomAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f45918b;

        a(int i4) {
            this.f45918b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecommendGameBean recommendGameBean = (RecommendGameBean) v0.this.f45916d.get(this.f45918b);
            IntentUtil.getInstance().goGameDetialActivity(v0.this.f45914b, recommendGameBean.getId(), recommendGameBean.getTpl_type(), recommendGameBean.getSp_tpl_two_position(), v0.this.f45917e);
        }
    }

    /* compiled from: GameDetailRecomAdapter.java */
    /* loaded from: classes4.dex */
    private class b {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f45920a;

        /* renamed from: b  reason: collision with root package name */
        TextView f45921b;

        private b() {
        }

        /* synthetic */ b(v0 v0Var, a aVar) {
            this();
        }
    }

    public v0(Context context) {
        this.f45916d = new ArrayList();
        this.f45914b = context;
        this.f45915c = LayoutInflater.from(context);
    }

    public List<RecommendGameBean> d() {
        return null;
    }

    public int e() {
        return this.f45917e;
    }

    public void f(int i4) {
        this.f45917e = i4;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45916d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return Integer.valueOf(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        b bVar;
        if (view == null) {
            view = this.f45915c.inflate(R.layout.gamedetail_recom_item, (ViewGroup) null);
            bVar = new b(this, null);
            bVar.f45920a = (SimpleDraweeView) view.findViewById(R.id.recomGameImage);
            bVar.f45921b = (TextView) view.findViewById(R.id.recomGameTv);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        bVar.f45920a.setImageURI(this.f45916d.get(i4).getIco_remote());
        bVar.f45921b.setText(this.f45916d.get(i4).getTitle());
        bVar.f45920a.getHeight();
        bVar.f45920a.setOnClickListener(new a(i4));
        return view;
    }

    public v0(Context context, List<RecommendGameBean> list) {
        this.f45916d = new ArrayList();
        this.f45914b = context;
        this.f45915c = LayoutInflater.from(context);
        this.f45916d = list;
    }
}
