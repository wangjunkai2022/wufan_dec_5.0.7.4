package com.join.mgps.fragment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.customview.swiperefresh.SwipeRefresh;
import com.join.mgps.dto.DiscoverListData;
import com.join.mgps.dto.DiscoverListItemBean;
import com.join.mgps.dto.DiscoverListWeiboItemBean;
import com.join.mgps.dto.ForumResponse;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.discovery_tab_fragment_layout)
/* loaded from: classes3.dex */
public class DIscoveryTabFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    XRecyclerView f50658b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    SwipeRefresh f50659c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f50660d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f50661e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f50662f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ImageView f50663g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f50664h;

    /* renamed from: i  reason: collision with root package name */
    int f50665i = 0;

    /* renamed from: j  reason: collision with root package name */
    int f50666j = 0;

    /* renamed from: k  reason: collision with root package name */
    Context f50667k;

    /* renamed from: l  reason: collision with root package name */
    com.join.mgps.rpc.i f50668l;

    /* renamed from: m  reason: collision with root package name */
    int f50669m;

    /* renamed from: n  reason: collision with root package name */
    List<DiscoverListItemBean> f50670n;

    /* renamed from: o  reason: collision with root package name */
    List<DiscoverListWeiboItemBean> f50671o;

    /* renamed from: p  reason: collision with root package name */
    e f50672p;

    /* loaded from: classes3.dex */
    class a implements SwipeRefresh.j {
        a() {
        }

        @Override // com.join.mgps.customview.swiperefresh.SwipeRefresh.j
        public void onRefresh() {
            DIscoveryTabFragment dIscoveryTabFragment = DIscoveryTabFragment.this;
            dIscoveryTabFragment.f50669m = 1;
            dIscoveryTabFragment.f50658b.reset();
            DIscoveryTabFragment dIscoveryTabFragment2 = DIscoveryTabFragment.this;
            if (dIscoveryTabFragment2.f50665i == 2) {
                dIscoveryTabFragment2.X(dIscoveryTabFragment2.f50669m);
            } else {
                dIscoveryTabFragment2.loadData(dIscoveryTabFragment2.f50669m);
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements XRecyclerView.f {
        b() {
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onLoadMore() {
            DIscoveryTabFragment dIscoveryTabFragment = DIscoveryTabFragment.this;
            if (dIscoveryTabFragment.f50665i == 2) {
                dIscoveryTabFragment.X(dIscoveryTabFragment.f50669m);
            } else {
                dIscoveryTabFragment.loadData(dIscoveryTabFragment.f50669m);
            }
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onRefresh() {
            DIscoveryTabFragment dIscoveryTabFragment = DIscoveryTabFragment.this;
            dIscoveryTabFragment.f50669m = 1;
            dIscoveryTabFragment.f50658b.reset();
            DIscoveryTabFragment dIscoveryTabFragment2 = DIscoveryTabFragment.this;
            if (dIscoveryTabFragment2.f50665i == 2) {
                dIscoveryTabFragment2.X(dIscoveryTabFragment2.f50669m);
            } else {
                dIscoveryTabFragment2.loadData(dIscoveryTabFragment2.f50669m);
            }
        }
    }

    /* loaded from: classes3.dex */
    class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TextView f50675a;

        /* renamed from: b  reason: collision with root package name */
        TextView f50676b;

        /* renamed from: c  reason: collision with root package name */
        TextView f50677c;

        /* renamed from: d  reason: collision with root package name */
        TextView f50678d;

        /* renamed from: e  reason: collision with root package name */
        LinearLayout f50679e;

        /* renamed from: f  reason: collision with root package name */
        SimpleDraweeView f50680f;

        public c(@NonNull View view) {
            super(view);
            this.f50675a = (TextView) view.findViewById(R.id.content);
            this.f50676b = (TextView) view.findViewById(R.id.gameType);
            this.f50677c = (TextView) view.findViewById(R.id.seeNumber);
            this.f50678d = (TextView) view.findViewById(R.id.commentNumber);
            this.f50680f = (SimpleDraweeView) view.findViewById(R.id.image);
            this.f50679e = (LinearLayout) view.findViewById(R.id.main);
        }
    }

    /* loaded from: classes3.dex */
    class d extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TextView f50682a;

        /* renamed from: b  reason: collision with root package name */
        TextView f50683b;

        /* renamed from: c  reason: collision with root package name */
        TextView f50684c;

        /* renamed from: d  reason: collision with root package name */
        TextView f50685d;

        /* renamed from: e  reason: collision with root package name */
        TextView f50686e;

        /* renamed from: f  reason: collision with root package name */
        LinearLayout f50687f;

        /* renamed from: g  reason: collision with root package name */
        SimpleDraweeView f50688g;

        public d(@NonNull View view) {
            super(view);
            this.f50682a = (TextView) view.findViewById(R.id.content);
            this.f50683b = (TextView) view.findViewById(R.id.userName);
            this.f50684c = (TextView) view.findViewById(R.id.time);
            this.f50685d = (TextView) view.findViewById(R.id.vidioTip);
            this.f50686e = (TextView) view.findViewById(R.id.imagTip);
            this.f50688g = (SimpleDraweeView) view.findViewById(R.id.userImg);
            this.f50687f = (LinearLayout) view.findViewById(R.id.main);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e extends RecyclerView.Adapter {

        /* loaded from: classes3.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ DiscoverListWeiboItemBean f50691b;

            a(DiscoverListWeiboItemBean discoverListWeiboItemBean) {
                this.f50691b = discoverListWeiboItemBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IntentUtil.getInstance().goShareWebActivity(DIscoveryTabFragment.this.f50667k, this.f50691b.getLink_url());
            }
        }

        /* loaded from: classes3.dex */
        class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ DiscoverListItemBean f50693b;

            b(DiscoverListItemBean discoverListItemBean) {
                this.f50693b = discoverListItemBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IntentUtil intentUtil = IntentUtil.getInstance();
                Context context = DIscoveryTabFragment.this.f50667k;
                intentUtil.goFormDetial(context, this.f50693b.getPid() + "");
            }
        }

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            DIscoveryTabFragment dIscoveryTabFragment = DIscoveryTabFragment.this;
            if (dIscoveryTabFragment.f50665i == 2) {
                return dIscoveryTabFragment.f50671o.size();
            }
            return dIscoveryTabFragment.f50670n.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i4) {
            return DIscoveryTabFragment.this.f50665i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i4) {
            DIscoveryTabFragment dIscoveryTabFragment = DIscoveryTabFragment.this;
            if (dIscoveryTabFragment.f50665i == 2) {
                d dVar = (d) viewHolder;
                DiscoverListWeiboItemBean discoverListWeiboItemBean = dIscoveryTabFragment.f50671o.get(i4);
                dVar.f50682a.setText(discoverListWeiboItemBean.getContent());
                dVar.f50683b.setText(discoverListWeiboItemBean.getNickname());
                dVar.f50684c.setText(discoverListWeiboItemBean.getSend_time());
                MyImageLoader.h(dVar.f50688g, discoverListWeiboItemBean.getAvatar_src());
                if (g2.i(discoverListWeiboItemBean.getVideo_url()) && !"{}".equals(discoverListWeiboItemBean.getVideo_url())) {
                    dVar.f50685d.setVisibility(0);
                } else {
                    dVar.f50685d.setVisibility(8);
                }
                if (g2.i(discoverListWeiboItemBean.getImage_url()) && !"{}".equals(discoverListWeiboItemBean.getImage_url())) {
                    dVar.f50686e.setVisibility(0);
                } else {
                    dVar.f50686e.setVisibility(8);
                }
                dVar.f50687f.setOnClickListener(new a(discoverListWeiboItemBean));
                return;
            }
            c cVar = (c) viewHolder;
            DiscoverListItemBean discoverListItemBean = dIscoveryTabFragment.f50670n.get(i4);
            cVar.f50675a.setText(discoverListItemBean.getSubject());
            TextView textView = cVar.f50678d;
            textView.setText(discoverListItemBean.getCommit() + "");
            TextView textView2 = cVar.f50677c;
            textView2.setText(g2.e(discoverListItemBean.getView()) + "");
            cVar.f50676b.setText(discoverListItemBean.getNickname());
            MyImageLoader.d(cVar.f50680f, R.drawable.rect_normal_icon, discoverListItemBean.getBig_pic());
            cVar.f50679e.setOnClickListener(new b(discoverListItemBean));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
            if (getItemViewType(i4) == 2) {
                return new d(LayoutInflater.from(DIscoveryTabFragment.this.f50667k).inflate(R.layout.discover_weibo_list_item, viewGroup, false));
            }
            return new c(LayoutInflater.from(DIscoveryTabFragment.this.f50667k).inflate(R.layout.discover_list_item, viewGroup, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void V() {
        this.f50667k = getActivity();
        this.f50668l = com.join.mgps.rpc.impl.g.A0();
        this.f50670n = new ArrayList();
        this.f50671o = new ArrayList();
        this.f50658b.setLayoutManager(new LinearLayoutManager(this.f50667k));
        e eVar = new e();
        this.f50672p = eVar;
        this.f50658b.setAdapter(eVar);
        this.f50669m = 1;
        this.f50664h.setText("没有找到相关数据");
        this.f50659c.setOnRefreshListener(new a());
        this.f50658b.setLoadingListener(new b());
        int i4 = getArguments().getInt(com.alipay.sdk.cons.b.f4830c);
        this.f50666j = i4;
        if (i4 == 2) {
            this.f50665i = 2;
        }
        if (this.f50665i == 2) {
            X(this.f50669m);
        } else {
            loadData(this.f50669m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.join.update.position2"})
    public void W(Intent intent) {
        try {
            if (this.f50671o.size() > 0 || this.f50670n.size() > 0) {
                this.f50658b.smoothScrollToPosition(0);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void X(int i4) {
        if (this.f50671o.size() == 0) {
            showLoding();
        }
        try {
            ForumResponse<DiscoverListData<DiscoverListWeiboItemBean>> b5 = this.f50668l.b(AccountUtil_.getInstance_(this.f50667k).getAccountData().getUid(), i4, this.f50666j);
            if (b5 != null && b5.getData() != null) {
                List<DiscoverListWeiboItemBean> news_list = b5.getData().getNews_list();
                if (i4 == 1 && news_list != null && news_list.size() == 0) {
                    c0();
                } else {
                    e0(news_list, i4);
                }
            } else {
                b0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z() {
        try {
            this.f50660d.setVisibility(8);
            this.f50662f.setVisibility(0);
            this.f50659c.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void a0() {
        try {
            this.f50660d.setVisibility(8);
            this.f50662f.setVisibility(8);
            this.f50659c.setVisibility(0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void b0() {
        XRecyclerView xRecyclerView = this.f50658b;
        if (xRecyclerView != null) {
            xRecyclerView.loadMoreComplete();
            this.f50658b.refreshComplete();
        }
        this.f50659c.setRefreshing(false);
        if (this.f50670n.size() == 0 && this.f50671o.size() == 0) {
            Z();
        } else {
            a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void c0() {
        try {
            this.f50660d.setVisibility(8);
            this.f50662f.setVisibility(8);
            this.f50659c.setVisibility(8);
            this.f50661e.setVisibility(0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void d0(List<DiscoverListItemBean> list, int i4) {
        int i5 = this.f50669m;
        if (i5 == i4) {
            if (i5 == 1) {
                this.f50670n.clear();
            }
            if (list.size() > 0) {
                this.f50669m++;
            }
            this.f50670n.addAll(list);
        }
        if (this.f50670n.size() > 0 && list.size() == 0) {
            this.f50658b.setNoMore();
        } else {
            b0();
        }
        this.f50672p.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e0(List<DiscoverListWeiboItemBean> list, int i4) {
        int i5 = this.f50669m;
        if (i5 == i4) {
            if (i5 == 1) {
                this.f50671o.clear();
            }
            if (list.size() > 0) {
                this.f50669m++;
            }
            this.f50671o.addAll(list);
        }
        if (this.f50671o.size() > 0 && list.size() == 0) {
            this.f50658b.setNoMore();
        } else {
            b0();
        }
        this.f50672p.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void loadData(int i4) {
        if (this.f50670n.size() == 0) {
            showLoding();
        }
        try {
            ForumResponse<DiscoverListData<DiscoverListItemBean>> C = this.f50668l.C(AccountUtil_.getInstance_(this.f50667k).getAccountData().getUid(), i4, this.f50666j);
            if (C != null && C.getData() != null) {
                List<DiscoverListItemBean> news_list = C.getData().getNews_list();
                if (i4 == 1 && news_list != null && news_list.size() == 0) {
                    c0();
                } else {
                    d0(news_list, i4);
                }
            } else {
                b0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f50669m = 1;
        if (this.f50665i == 2) {
            X(1);
        } else {
            loadData(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f50667k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f50660d.setVisibility(0);
        this.f50662f.setVisibility(8);
        this.f50659c.setVisibility(8);
    }
}
