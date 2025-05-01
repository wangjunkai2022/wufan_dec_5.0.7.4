package com.join.mgps.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.papa91.arc.bean.PaiWeiDataBean;
import java.util.List;
/* loaded from: classes4.dex */
public class GamePaiWeiAdapter extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f43095b;

    /* renamed from: c  reason: collision with root package name */
    private List<d> f43096c;

    /* renamed from: d  reason: collision with root package name */
    private b f43097d;

    /* renamed from: e  reason: collision with root package name */
    private String f43098e;

    /* renamed from: f  reason: collision with root package name */
    private int f43099f;

    /* renamed from: g  reason: collision with root package name */
    private int f43100g;

    /* loaded from: classes4.dex */
    public enum ViewType {
        RANK
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43101b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PaiWeiDataBean.RankListBean f43102c;

        a(int i4, PaiWeiDataBean.RankListBean rankListBean) {
            this.f43101b = i4;
            this.f43102c = rankListBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamePaiWeiAdapter.this.f43097d.a(this.f43101b, this.f43102c.getVideo());
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(int i4, String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends e {

        /* renamed from: b  reason: collision with root package name */
        private RelativeLayout f43104b;

        /* renamed from: c  reason: collision with root package name */
        private ImageView f43105c;

        /* renamed from: d  reason: collision with root package name */
        private ImageView f43106d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f43107e;

        /* renamed from: f  reason: collision with root package name */
        private ImageView f43108f;

        /* renamed from: g  reason: collision with root package name */
        private SimpleDraweeView f43109g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f43110h;

        /* renamed from: i  reason: collision with root package name */
        private TextView f43111i;

        /* renamed from: j  reason: collision with root package name */
        private TextView f43112j;

        /* renamed from: k  reason: collision with root package name */
        private TextView f43113k;

        /* renamed from: l  reason: collision with root package name */
        private TextView f43114l;

        /* renamed from: m  reason: collision with root package name */
        private ImageButton f43115m;

        c() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        ViewType f43117a;

        /* renamed from: b  reason: collision with root package name */
        Object f43118b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public PaiWeiDataBean.RankListBean f43119a;

            public a(PaiWeiDataBean.RankListBean rankListBean) {
                this.f43119a = rankListBean;
            }
        }

        public d() {
        }

        public Object a() {
            return this.f43118b;
        }

        public ViewType b() {
            return this.f43117a;
        }

        public void c(Object obj) {
            this.f43118b = obj;
        }

        public void d(ViewType viewType) {
            this.f43117a = viewType;
        }

        public d(ViewType viewType, Object obj) {
            this.f43117a = viewType;
            this.f43118b = obj;
        }
    }

    /* loaded from: classes4.dex */
    class e {
        e() {
        }
    }

    public GamePaiWeiAdapter(Context context, List<d> list, b bVar) {
        this.f43095b = context;
        this.f43096c = list;
        this.f43097d = bVar;
        int width = ((Activity) context).getWindowManager().getDefaultDisplay().getWidth();
        this.f43099f = width;
        int i4 = (width * 42) / 100;
        this.f43099f = i4;
        int a5 = i4 - com.join.mgps.Util.c0.a(context, 20.0f);
        this.f43099f = a5;
        this.f43100g = (a5 * 625) / 2490;
    }

    private View b(int i4, View view, ViewGroup viewGroup) {
        View view2;
        c cVar;
        d.a aVar = (d.a) getItem(i4);
        if (view == null) {
            cVar = new c();
            view2 = LayoutInflater.from(this.f43095b).inflate(R.layout.item_paiwei_view, (ViewGroup) null);
            cVar.f43104b = (RelativeLayout) view2.findViewById(R.id.item_root_rl);
            cVar.f43105c = (ImageView) view2.findViewById(R.id.item_rank_bg_iv);
            cVar.f43106d = (ImageView) view2.findViewById(R.id.item_rank_iv);
            cVar.f43107e = (TextView) view2.findViewById(R.id.item_rank_tv);
            cVar.f43114l = (TextView) view2.findViewById(R.id.item_rank_cion_tv);
            cVar.f43108f = (ImageView) view2.findViewById(R.id.item_hander_bg_iv);
            cVar.f43109g = (SimpleDraweeView) view2.findViewById(R.id.item_hander_iv);
            cVar.f43110h = (TextView) view2.findViewById(R.id.item_rank_name_tv);
            cVar.f43111i = (TextView) view2.findViewById(R.id.item_rank_bf_tv);
            cVar.f43112j = (TextView) view2.findViewById(R.id.item_rank_role_tv);
            cVar.f43113k = (TextView) view2.findViewById(R.id.item_rank_time_tv);
            cVar.f43115m = (ImageButton) view2.findViewById(R.id.item_rank_play_ib);
            view2.setTag(cVar);
        } else {
            view2 = view;
            cVar = (c) view.getTag();
        }
        PaiWeiDataBean.RankListBean rankListBean = aVar.f43119a;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f43099f, this.f43100g);
        layoutParams.topMargin = com.join.mgps.Util.c0.a(this.f43095b, 5.0f);
        layoutParams.leftMargin = com.join.mgps.Util.c0.a(this.f43095b, 10.0f);
        layoutParams.rightMargin = com.join.mgps.Util.c0.a(this.f43095b, 10.0f);
        cVar.f43104b.setLayoutParams(layoutParams);
        if (i4 == 0) {
            cVar.f43106d.setVisibility(0);
            cVar.f43107e.setVisibility(8);
            cVar.f43106d.setImageResource(R.drawable.paiwei_list_one);
            cVar.f43105c.setImageResource(R.drawable.paiwei_list_top_bg);
            cVar.f43108f.setImageResource(R.drawable.paiwei_list_top_header_bg);
            cVar.f43113k.setTextColor(Color.parseColor("#AB8E55"));
        } else if (i4 == 1) {
            cVar.f43106d.setVisibility(0);
            cVar.f43107e.setVisibility(8);
            cVar.f43106d.setImageResource(R.drawable.paiwei_list_two);
            cVar.f43105c.setImageResource(R.drawable.paiwei_list_other_bg);
            cVar.f43108f.setImageResource(R.drawable.paiwei_list_header_bg);
            cVar.f43113k.setTextColor(Color.parseColor("#339CBB"));
        } else if (i4 == 2) {
            cVar.f43106d.setVisibility(0);
            cVar.f43107e.setVisibility(8);
            cVar.f43106d.setImageResource(R.drawable.paiwei_list_three);
            cVar.f43105c.setImageResource(R.drawable.paiwei_list_other_bg);
            cVar.f43108f.setImageResource(R.drawable.paiwei_list_header_bg);
            cVar.f43113k.setTextColor(Color.parseColor("#339CBB"));
        } else {
            cVar.f43106d.setVisibility(8);
            cVar.f43107e.setVisibility(0);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            int i5 = i4 + 1;
            sb.append(i5);
            if (sb.toString().length() <= 2) {
                cVar.f43107e.setTextSize(2, 25.0f);
            } else {
                cVar.f43107e.setTextSize(2, 16.0f);
            }
            TextView textView = cVar.f43107e;
            textView.setText("" + i5);
            cVar.f43105c.setImageResource(R.drawable.paiwei_list_other_bg);
            cVar.f43108f.setImageResource(R.drawable.paiwei_list_header_bg);
            cVar.f43113k.setTextColor(Color.parseColor("#339CBB"));
        }
        cVar.f43110h.setText(rankListBean.getNickname());
        cVar.f43113k.setText(rankListBean.getUse_time());
        cVar.f43112j.setText(rankListBean.getRole());
        if (rankListBean.getRole_rank() == null || rankListBean.getRole_rank().isEmpty()) {
            cVar.f43111i.setVisibility(8);
        } else {
            cVar.f43111i.setVisibility(0);
            TextView textView2 = cVar.f43111i;
            textView2.setText("第" + com.join.mgps.Util.j1.a(Integer.valueOf(rankListBean.getRole_rank()).intValue()));
        }
        if (com.join.mgps.Util.g2.i(rankListBean.getAvatar())) {
            UtilsMy.v3(this.f43095b, rankListBean.getAvatar(), cVar.f43109g);
        }
        if (rankListBean.getCost_coin() != null && !rankListBean.getCost_coin().isEmpty()) {
            TextView textView3 = cVar.f43114l;
            textView3.setText(rankListBean.getCost_coin() + this.f43098e);
        }
        cVar.f43115m.setOnClickListener(new a(i4, rankListBean));
        return view2;
    }

    public void c(List<d> list) {
        this.f43096c = list;
        notifyDataSetChanged();
    }

    public void d(String str) {
        this.f43098e = str;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<d> list = this.f43096c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<d> list = this.f43096c;
        if (list != null) {
            return list.get(i4).a();
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        List<d> list = this.f43096c;
        if (list != null) {
            return list.get(i4).b().ordinal();
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        return getItemViewType(i4) == ViewType.RANK.ordinal() ? b(i4, view, viewGroup) : view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return ViewType.values().length;
    }
}
