package com.join.mgps.adapter;

import android.content.Context;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.RecommendInfomationBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GamdetialInformationStrategyAdapter.java */
/* loaded from: classes4.dex */
public class m0 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f44827b;

    /* renamed from: c  reason: collision with root package name */
    private List<RecommendInfomationBean> f44828c;

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout.LayoutParams f44829d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GamdetialInformationStrategyAdapter.java */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f44830b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String[] f44831c;

        a(int i4, String[] strArr) {
            this.f44830b = i4;
            this.f44831c = strArr;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.Util.j0.G0(view.getContext(), this.f44830b, this.f44831c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GamdetialInformationStrategyAdapter.java */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f44833b;

        b(int i4) {
            this.f44833b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(this.f44833b);
            com.join.mgps.Util.j0.v0(m0.this.f44827b, forumPostsBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GamdetialInformationStrategyAdapter.java */
    /* loaded from: classes4.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public TextView f44835a;

        /* renamed from: b  reason: collision with root package name */
        public RelativeLayout f44836b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f44837c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f44838d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f44839e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f44840f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f44841g;

        /* renamed from: h  reason: collision with root package name */
        public TextView f44842h;

        public c(View view) {
            this.f44836b = (RelativeLayout) view.findViewById(R.id.forum_post_media_container);
            this.f44835a = (TextView) view.findViewById(R.id.images_count);
            view.setTag(this);
        }
    }

    /* compiled from: GamdetialInformationStrategyAdapter.java */
    /* loaded from: classes4.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public TextView f44844a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f44845b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f44846c;

        /* renamed from: d  reason: collision with root package name */
        public LinearLayout f44847d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f44848e;

        /* renamed from: f  reason: collision with root package name */
        public SimpleDraweeView f44849f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f44850g;

        public d() {
        }
    }

    public m0(Context context) {
        this.f44827b = context;
    }

    private View b(int i4, View view, ViewGroup viewGroup) {
        View view2;
        d dVar;
        if (view == null) {
            dVar = new d();
            view2 = LayoutInflater.from(this.f44827b).inflate(R.layout.mg_gamedetailmore_infomation_item_top, (ViewGroup) null);
            View findViewById = view2.findViewById(R.id.layoutInformation);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 0);
            findViewById.setLayoutParams(layoutParams);
            dVar.f44849f = (SimpleDraweeView) view2.findViewById(R.id.informationImage);
            dVar.f44847d = (LinearLayout) view2.findViewById(R.id.layoutInformation);
            dVar.f44844a = (TextView) view2.findViewById(R.id.pubtime);
            dVar.f44850g = (TextView) view2.findViewById(R.id.messageType);
            dVar.f44848e = (TextView) view2.findViewById(R.id.informationTv);
            dVar.f44845b = (TextView) view2.findViewById(R.id.pv);
            dVar.f44846c = (TextView) view2.findViewById(R.id.uv);
            view2.setTag(dVar);
        } else {
            view2 = view;
            dVar = (d) view.getTag();
        }
        RecommendInfomationBean recommendInfomationBean = this.f44828c.get(i4);
        if (recommendInfomationBean.getPic_list().length > 0) {
            MyImageLoader.h(dVar.f44849f, recommendInfomationBean.getPic_list()[0]);
            dVar.f44849f.setVisibility(0);
        } else {
            dVar.f44849f.setVisibility(8);
        }
        TextView textView = dVar.f44845b;
        textView.setText(recommendInfomationBean.getCommit() + "");
        TextView textView2 = dVar.f44846c;
        textView2.setText(recommendInfomationBean.getView() + "");
        dVar.f44844a.setText(com.join.android.app.common.utils.g.b(recommendInfomationBean.getTimes()));
        dVar.f44848e.setText(recommendInfomationBean.getTitle());
        dVar.f44850g.setText(recommendInfomationBean.getType());
        if (com.join.mgps.Util.g2.h(recommendInfomationBean.getType_color())) {
            recommendInfomationBean.setType_color("#8dbbec");
        }
        if (com.join.mgps.Util.g2.i(recommendInfomationBean.getType())) {
            dVar.f44850g.setVisibility(0);
            TextView textView3 = dVar.f44850g;
            textView3.setTextColor(Color.parseColor(recommendInfomationBean.getType_color() + ""));
            TextView textView4 = dVar.f44850g;
            Context context = this.f44827b;
            textView4.setBackgroundDrawable(com.join.mgps.Util.k2.a(context, recommendInfomationBean.getType_color() + ""));
        } else {
            dVar.f44850g.setVisibility(8);
        }
        return view2;
    }

    private View d(int i4, View view, ViewGroup viewGroup) {
        c cVar;
        RecommendInfomationBean recommendInfomationBean = this.f44828c.get(i4);
        if (view == null) {
            view = LayoutInflater.from(this.f44827b).inflate(R.layout.detial_more_information_item_image_layout, (ViewGroup) null);
            cVar = new c(view);
            cVar.f44840f = (TextView) view.findViewById(R.id.informationTv);
            cVar.f44841g = (TextView) view.findViewById(R.id.images_count);
            cVar.f44842h = (TextView) view.findViewById(R.id.messageType);
            cVar.f44837c = (TextView) view.findViewById(R.id.pubtime);
            cVar.f44838d = (TextView) view.findViewById(R.id.pv);
            cVar.f44839e = (TextView) view.findViewById(R.id.uv);
            view.setTag(cVar);
        } else {
            cVar = (c) view.getTag();
        }
        if (recommendInfomationBean == null) {
            return view;
        }
        try {
            if (com.join.mgps.Util.g2.h(recommendInfomationBean.getType_color())) {
                recommendInfomationBean.setType_color("#8dbbec");
            }
            cVar.f44842h.setText(recommendInfomationBean.getType());
            if (com.join.mgps.Util.g2.i(recommendInfomationBean.getType())) {
                cVar.f44842h.setVisibility(0);
                TextView textView = cVar.f44842h;
                textView.setTextColor(Color.parseColor(recommendInfomationBean.getType_color() + ""));
                TextView textView2 = cVar.f44842h;
                Context context = this.f44827b;
                textView2.setBackgroundDrawable(com.join.mgps.Util.k2.a(context, recommendInfomationBean.getType_color() + ""));
            } else {
                cVar.f44842h.setVisibility(8);
            }
            cVar.f44841g.setVisibility(8);
            TextView textView3 = cVar.f44838d;
            textView3.setText(recommendInfomationBean.getCommit() + "");
            TextView textView4 = cVar.f44839e;
            textView4.setText(recommendInfomationBean.getView() + "");
            cVar.f44837c.setText(com.join.android.app.common.utils.g.b(recommendInfomationBean.getTimes()));
            cVar.f44840f.setText(recommendInfomationBean.getTitle());
            f(cVar.f44836b, recommendInfomationBean);
            h(view, recommendInfomationBean.getPost_id());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return view;
    }

    private void f(RelativeLayout relativeLayout, RecommendInfomationBean recommendInfomationBean) {
        recommendInfomationBean.getPic_list();
        if (this.f44829d == null) {
            this.f44829d = e();
        }
        String[] pic_list = recommendInfomationBean.getPic_list();
        int[] iArr = {R.id.img_m_1, R.id.img_m_2, R.id.img_m_3};
        for (int i4 = 0; i4 < 3; i4++) {
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) relativeLayout.findViewById(iArr[i4]);
            if (i4 >= recommendInfomationBean.getPic_list().length) {
                simpleDraweeView.setVisibility(8);
            } else {
                g(simpleDraweeView, i4, recommendInfomationBean.getPic_list()[i4], i4 + 0, pic_list);
            }
        }
    }

    public List<RecommendInfomationBean> c() {
        if (this.f44828c == null) {
            this.f44828c = new ArrayList();
        }
        return this.f44828c;
    }

    LinearLayout.LayoutParams e() {
        DisplayMetrics displayMetrics = this.f44827b.getResources().getDisplayMetrics();
        int dimensionPixelSize = (int) (((displayMetrics.widthPixels - (this.f44827b.getResources().getDimensionPixelSize(R.dimen.dp24) * 2)) - ((displayMetrics.density * 6.0f) * 2.0f)) / 3.0f);
        return new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
    }

    void g(SimpleDraweeView simpleDraweeView, int i4, String str, int i5, String[] strArr) {
        if (this.f44829d == null) {
            this.f44829d = e();
        }
        int i6 = (int) (this.f44827b.getResources().getDisplayMetrics().density * 6.0f);
        LinearLayout.LayoutParams layoutParams = this.f44829d;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
        if (i4 > 0) {
            layoutParams2.setMargins(i6, 0, 0, 0);
        } else {
            layoutParams2.setMargins(0, 0, 0, 0);
        }
        if (!com.join.mgps.Util.g2.h(str)) {
            simpleDraweeView.setVisibility(0);
            simpleDraweeView.setLayoutParams(layoutParams2);
            simpleDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            MyImageLoader.i(simpleDraweeView, str, r.c.f11300g);
            simpleDraweeView.setOnClickListener(new a(i5, strArr));
            return;
        }
        simpleDraweeView.setVisibility(8);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44828c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        return this.f44828c.get(i4).getPic_list().length >= 3 ? 1 : 2;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i4);
        RecommendInfomationBean recommendInfomationBean = this.f44828c.get(i4);
        if (itemViewType == 1) {
            com.join.mgps.Util.v0.d("Strategy", "111" + recommendInfomationBean.getPic_list().length);
            return d(i4, view, viewGroup);
        } else if (itemViewType != 2) {
            return view;
        } else {
            com.join.mgps.Util.v0.d("Strategy", "222" + recommendInfomationBean.getPic_list().length);
            return b(i4, view, viewGroup);
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }

    public void h(View view, int i4) {
        view.setOnClickListener(new b(i4));
    }

    public m0() {
    }
}
