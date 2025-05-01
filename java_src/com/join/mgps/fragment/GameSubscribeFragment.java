package com.join.mgps.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.GameDetailActivity_;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.GameFromPopoWinBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.springframework.util.LinkedMultiValueMap;
@EFragment(R.layout.game_build)
/* loaded from: classes3.dex */
public class GameSubscribeFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f51980b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    PtrClassicFrameLayout f51981c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    XListView2 f51982d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f51983e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f51984f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    Button f51985g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    ImageView f51986h;

    /* renamed from: i  reason: collision with root package name */
    Context f51987i;

    /* renamed from: j  reason: collision with root package name */
    c f51988j;

    /* renamed from: l  reason: collision with root package name */
    String f51990l;

    /* renamed from: m  reason: collision with root package name */
    String f51991m;

    /* renamed from: n  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f51992n;

    /* renamed from: o  reason: collision with root package name */
    com.join.mgps.rpc.b f51993o;

    /* renamed from: p  reason: collision with root package name */
    List<GameFromPopoWinBean.DataBean> f51994p;

    /* renamed from: k  reason: collision with root package name */
    int f51989k = 1;

    /* renamed from: q  reason: collision with root package name */
    int f51995q = 0;

    /* loaded from: classes3.dex */
    class a implements com.join.mgps.customview.g {
        a() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            GameSubscribeFragment gameSubscribeFragment = GameSubscribeFragment.this;
            gameSubscribeFragment.f51989k = 1;
            gameSubscribeFragment.X();
            GameSubscribeFragment.this.b0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements com.join.mgps.customview.f {
        b() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            GameSubscribeFragment.this.X();
            GameSubscribeFragment.this.b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends BaseAdapter {

        /* loaded from: classes3.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f51999b;

            a(int i4) {
                this.f51999b = i4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(GameSubscribeFragment.this.getActivity(), GameDetailActivity_.class);
                intent.putExtra("fromid", GameSubscribeFragment.this.f51994p.get(this.f51999b).getId());
                intent.putExtra("groupuid", GameSubscribeFragment.this.f51994p.get(this.f51999b).getUid());
                intent.putExtra("_from", 11104);
                intent.putExtra("gameid", "0");
                intent.putExtra("company_id", "0");
                GameSubscribeFragment.this.startActivity(intent);
            }
        }

        c() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return GameSubscribeFragment.this.f51994p.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return GameSubscribeFragment.this.f51994p.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            d dVar;
            if (view == null) {
                view = LayoutInflater.from(GameSubscribeFragment.this.f51987i).inflate(R.layout.game_build_item, (ViewGroup) null);
                dVar = new d();
                dVar.f52001a = (SimpleDraweeView) view.findViewById(R.id.smv_icon);
                dVar.f52003c = (TextView) view.findViewById(R.id.tv_size);
                dVar.f52002b = (TextView) view.findViewById(R.id.tv_title);
                dVar.f52004d = (RelativeLayout) view.findViewById(R.id.rl_content);
                view.setTag(dVar);
            } else {
                dVar = (d) view.getTag();
            }
            if (GameSubscribeFragment.this.f51994p.get(i4).getGame_list().size() != 0) {
                dVar.f52001a.setImageURI(GameSubscribeFragment.this.f51994p.get(i4).getGame_list().get(0).getGame_ico());
            } else {
                dVar.f52001a.setImageResource(R.drawable.main_normal_icon);
            }
            dVar.f52002b.setText(GameSubscribeFragment.this.f51994p.get(i4).getTitle());
            TextView textView = dVar.f52003c;
            textView.setText(GameSubscribeFragment.this.f51994p.get(i4).getGame_count() + "款");
            dVar.f52004d.setOnClickListener(new a(i4));
            return view;
        }
    }

    /* loaded from: classes3.dex */
    class d {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f52001a;

        /* renamed from: b  reason: collision with root package name */
        TextView f52002b;

        /* renamed from: c  reason: collision with root package name */
        TextView f52003c;

        /* renamed from: d  reason: collision with root package name */
        RelativeLayout f52004d;

        d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void V() {
        this.f51987i = getActivity();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f51995q = arguments.getInt("uid", 0);
        }
        this.f51993o = com.join.mgps.rpc.impl.a.c0();
        this.f51994p = new ArrayList();
        this.f51992n = AccountUtil_.getInstance_(this.f51987i).getAccountData();
        this.f51990l = "";
        RequestBeanUtil.getInstance(this.f51987i);
        this.f51991m = RequestBeanUtil.getVersionAndVersionName();
        this.f51982d.setPreLoadCount(1);
        b0();
        this.f51982d.setPullRefreshEnable(new a());
        this.f51982d.setPullLoadEnable(new b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void W(List<GameFromPopoWinBean.DataBean> list) {
        this.f51994p.addAll(list);
        if (list.size() < 10) {
            e0();
        }
        c cVar = this.f51988j;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        } else if (this.f51982d != null) {
            c cVar2 = new c();
            this.f51988j = cVar2;
            this.f51982d.setAdapter((ListAdapter) cVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void X() {
        try {
            if (this.f51982d != null) {
                this.f51980b.setVisibility(8);
            }
            this.f51982d.l();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z() {
        c cVar = this.f51988j;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void a0() {
        if (this.f51994p.size() > 0) {
            this.f51994p.clear();
            c cVar = this.f51988j;
            if (cVar != null) {
                cVar.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void b0() {
        try {
            if (com.join.android.app.common.utils.j.j(this.f51987i)) {
                if (this.f51989k == 1) {
                    showLoding();
                }
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                int i4 = this.f51995q;
                if (i4 == 0) {
                    i4 = this.f51992n.getUid();
                }
                linkedMultiValueMap.add("uid", Integer.valueOf(i4));
                int i5 = this.f51989k;
                this.f51989k = i5 + 1;
                linkedMultiValueMap.add("page", Integer.valueOf(i5));
                linkedMultiValueMap.add("type", 2);
                linkedMultiValueMap.add("device_id", this.f51990l);
                linkedMultiValueMap.add("version", this.f51991m);
                GameFromPopoWinBean r4 = this.f51993o.r(linkedMultiValueMap);
                if (r4.getError() == 0 && r4.getData() != null && r4.getData().size() != 0) {
                    f0();
                    c0();
                    if (this.f51989k == 2) {
                        a0();
                    }
                    W(r4.getData());
                    return;
                }
                c0();
                if (this.f51989k == 2) {
                    d0();
                } else {
                    e0();
                }
            } else if (this.f51989k == 1) {
                showLodingFailed();
            } else {
                e0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void c0() {
        LinearLayout linearLayout = this.f51983e;
        if (linearLayout == null || this.f51984f == null) {
            return;
        }
        try {
            linearLayout.setVisibility(8);
            this.f51984f.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void d0() {
        LinearLayout linearLayout = this.f51980b;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        XListView2 xListView2 = this.f51982d;
        if (xListView2 != null) {
            xListView2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e0() {
        XListView2 xListView2 = this.f51982d;
        if (xListView2 != null) {
            try {
                xListView2.u();
                this.f51982d.v();
                this.f51982d.setNoMore();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f0() {
        XListView2 xListView2 = this.f51982d;
        if (xListView2 != null) {
            try {
                xListView2.u();
                this.f51982d.v();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f51989k = 1;
        XListView2 xListView2 = this.f51982d;
        if (xListView2 != null) {
            xListView2.setVisibility(0);
        }
        X();
        b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f51987i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            LinearLayout linearLayout = this.f51983e;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.f51984f;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f51984f;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f51983e;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XListView2 xListView2 = this.f51982d;
        if (xListView2 != null) {
            xListView2.setVisibility(8);
        }
    }
}
