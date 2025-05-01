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
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.GameDetailActivity_;
import com.join.mgps.activity.vipzone.bean.LuckHistoryrequest;
import com.join.mgps.dto.GameFromPopoWinBeanV2;
import com.join.mgps.dto.GamelistRankingmainbean;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.springframework.util.LinkedMultiValueMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
@EFragment(R.layout.fragment_gamefrom)
/* loaded from: classes3.dex */
public class GameFormFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    XRecyclerView f51648b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f51649c;

    /* renamed from: d  reason: collision with root package name */
    GameListAdapter f51650d;

    /* renamed from: e  reason: collision with root package name */
    Context f51651e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    Button f51652f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f51653g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f51654h;

    /* renamed from: i  reason: collision with root package name */
    com.join.mgps.rpc.b f51655i;

    /* renamed from: k  reason: collision with root package name */
    String f51657k;

    /* renamed from: l  reason: collision with root package name */
    String f51658l;

    /* renamed from: m  reason: collision with root package name */
    List<f> f51659m;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    ImageView f51661o;

    /* renamed from: r  reason: collision with root package name */
    private List<GameFromPopoWinBeanV2.FamousBean> f51664r;

    /* renamed from: j  reason: collision with root package name */
    int f51656j = 1;

    /* renamed from: n  reason: collision with root package name */
    boolean f51660n = false;

    /* renamed from: p  reason: collision with root package name */
    int f51662p = 1;

    /* renamed from: q  reason: collision with root package name */
    boolean f51663q = false;

    /* renamed from: s  reason: collision with root package name */
    boolean f51665s = false;

    /* loaded from: classes3.dex */
    public class GameListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* loaded from: classes3.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GameFromPopoWinBeanV2.DataBean f51667b;

            a(GameFromPopoWinBeanV2.DataBean dataBean) {
                this.f51667b = dataBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GameFormFragment.this.W(this.f51667b.getId(), this.f51667b.getUid());
                Ext ext = new Ext();
                ext.setPosition("fromGameDetailP2");
                ext.setArticleId(this.f51667b.getId());
                com.papa.sim.statistic.p.l(GameFormFragment.this.f51651e).O1(Event.enterUserGameList, ext);
            }
        }

        public GameListAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return GameFormFragment.this.f51659m.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i4) {
            List<f> list = GameFormFragment.this.f51659m;
            if (list != null) {
                return list.get(i4).f51686b;
            }
            return -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i4) {
            int itemViewType = getItemViewType(i4);
            if (itemViewType != 1 && itemViewType != 3) {
                if (itemViewType == 2) {
                    ((e) viewHolder).f51682a.setAdapter((ListAdapter) new d());
                    return;
                }
                return;
            }
            GameFromPopoWinBeanV2.DataBean dataBean = (GameFromPopoWinBeanV2.DataBean) GameFormFragment.this.f51659m.get(i4).f51685a;
            c cVar = (c) viewHolder;
            cVar.f51671a.setOnClickListener(new a(dataBean));
            cVar.f51672b.setText(dataBean.getTitle());
            cVar.f51675e.setText(dataBean.getNick_name());
            TextView textView = cVar.f51677g;
            textView.setText(dataBean.getBook_count() + "订阅");
            TextView textView2 = cVar.f51676f;
            textView2.setText(dataBean.getGame_count() + "款");
            cVar.f51673c.removeAllViews();
            if (itemViewType == 3) {
                int i5 = 0;
                while (i4 < dataBean.getGame_list().size()) {
                    View inflate = LayoutInflater.from(GameFormFragment.this.f51651e).inflate(R.layout.gamelist_listitem_gameicon_layout, (ViewGroup) null);
                    MyImageLoader.d((SimpleDraweeView) inflate.findViewById(R.id.icon), R.drawable.main_normal_icon, dataBean.getGame_list().get(i5).getGame_ico());
                    if (i5 < 2) {
                        cVar.f51673c.addView(inflate);
                    } else {
                        cVar.f51674d.addView(inflate);
                    }
                    i5++;
                }
            } else {
                for (GameFromPopoWinBeanV2.DataBean.GameListBean gameListBean : dataBean.getGame_list()) {
                    View inflate2 = LayoutInflater.from(GameFormFragment.this.f51651e).inflate(R.layout.gamelist_listitem_gameicon_layout, (ViewGroup) null);
                    MyImageLoader.d((SimpleDraweeView) inflate2.findViewById(R.id.icon), R.drawable.main_normal_icon, gameListBean.getGame_ico());
                    cVar.f51673c.addView(inflate2);
                }
            }
            int i6 = i4 % 5;
            if (i6 == 0) {
                cVar.f51671a.setBackgroundResource(R.drawable.gamelist_itemback_1);
            } else if (i6 == 1) {
                cVar.f51671a.setBackgroundResource(R.drawable.gamelist_itemback_2);
            } else if (i6 == 2) {
                cVar.f51671a.setBackgroundResource(R.drawable.gamelist_itemback_3);
            } else if (i6 == 3) {
                cVar.f51671a.setBackgroundResource(R.drawable.gamelist_itemback_4);
            } else if (i6 == 4) {
                cVar.f51671a.setBackgroundResource(R.drawable.gamelist_itemback_5);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
            if (i4 == 1) {
                return new c(LayoutInflater.from(GameFormFragment.this.f51651e).inflate(R.layout.gamelist_list_item, viewGroup, false));
            } else if (i4 == 3) {
                return new c(LayoutInflater.from(GameFormFragment.this.f51651e).inflate(R.layout.gamelist_list_itemhome, viewGroup, false));
            } else if (i4 == 2) {
                return new e(LayoutInflater.from(GameFormFragment.this.f51651e).inflate(R.layout.gamelist_list_item_hongren, viewGroup, false));
            } else {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements XRecyclerView.f {
        a() {
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onLoadMore() {
            GameFormFragment gameFormFragment = GameFormFragment.this;
            if (gameFormFragment.f51663q) {
                gameFormFragment.f0(gameFormFragment.f51662p, gameFormFragment.f51656j);
            } else {
                gameFormFragment.d0();
            }
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onRefresh() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Callback<ResponseModel<GamelistRankingmainbean>> {
        b() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResponseModel<GamelistRankingmainbean>> call, Throwable th) {
            GameFormFragment.this.showLodingFailed();
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResponseModel<GamelistRankingmainbean>> call, Response<ResponseModel<GamelistRankingmainbean>> response) {
            if (response != null && response.body() != null) {
                if (response.body().getCode() == 200) {
                    GamelistRankingmainbean data = response.body().getData();
                    ArrayList arrayList = new ArrayList();
                    if (data != null) {
                        List<GameFromPopoWinBeanV2.DataBean> fav_list = data.getFav_list();
                        if (fav_list.size() < 10) {
                            GameFormFragment.this.f51665s = true;
                        }
                        for (int i4 = 0; i4 < fav_list.size(); i4++) {
                            GameFromPopoWinBeanV2.DataBean dataBean = fav_list.get(i4);
                            arrayList.add(new f(dataBean, 1, dataBean.getId(), dataBean.getUid()));
                            if (i4 == 0 && GameFormFragment.this.f51664r != null && GameFormFragment.this.f51664r.size() > 0) {
                                GameFormFragment gameFormFragment = GameFormFragment.this;
                                if (gameFormFragment.f51656j == 2) {
                                    arrayList.add(new f(gameFormFragment.f51664r, 2, dataBean.getId(), dataBean.getUid()));
                                }
                            }
                        }
                        GameFormFragment.this.j0(arrayList);
                        return;
                    }
                    GameFormFragment gameFormFragment2 = GameFormFragment.this;
                    if (gameFormFragment2.f51656j == 2) {
                        gameFormFragment2.X();
                        return;
                    } else {
                        gameFormFragment2.i0();
                        return;
                    }
                }
                GameFormFragment gameFormFragment3 = GameFormFragment.this;
                if (gameFormFragment3.f51656j == 2) {
                    gameFormFragment3.X();
                    return;
                } else {
                    gameFormFragment3.i0();
                    return;
                }
            }
            GameFormFragment.this.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        View f51671a;

        /* renamed from: b  reason: collision with root package name */
        TextView f51672b;

        /* renamed from: c  reason: collision with root package name */
        LinearLayout f51673c;

        /* renamed from: d  reason: collision with root package name */
        LinearLayout f51674d;

        /* renamed from: e  reason: collision with root package name */
        TextView f51675e;

        /* renamed from: f  reason: collision with root package name */
        TextView f51676f;

        /* renamed from: g  reason: collision with root package name */
        TextView f51677g;

        public c(@NonNull View view) {
            super(view);
            this.f51671a = view.findViewById(R.id.main);
            this.f51672b = (TextView) view.findViewById(R.id.title);
            this.f51673c = (LinearLayout) view.findViewById(R.id.iconLayout);
            this.f51674d = (LinearLayout) view.findViewById(R.id.iconLayout2);
            this.f51675e = (TextView) view.findViewById(R.id.name);
            this.f51676f = (TextView) view.findViewById(R.id.number);
            this.f51677g = (TextView) view.findViewById(R.id.follow);
        }
    }

    /* loaded from: classes3.dex */
    class d extends BaseAdapter {

        /* loaded from: classes3.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GameFromPopoWinBeanV2.FamousBean f51680b;

            a(GameFromPopoWinBeanV2.FamousBean famousBean) {
                this.f51680b = famousBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GameFormFragment.this.W(this.f51680b.getId(), this.f51680b.getUid());
                Ext ext = new Ext();
                ext.setPosition("fromGameDetailP3");
                ext.setArticleId(this.f51680b.getId());
                com.papa.sim.statistic.p.l(GameFormFragment.this.f51651e).O1(Event.enterUserGameList, ext);
            }
        }

        d() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (GameFormFragment.this.f51664r != null) {
                return GameFormFragment.this.f51664r.size();
            }
            return 0;
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
            if (view == null) {
                view = LayoutInflater.from(GameFormFragment.this.f51651e).inflate(R.layout.gamelist_hongrentuijian_layout, (ViewGroup) null);
            }
            GameFromPopoWinBeanV2.FamousBean famousBean = (GameFromPopoWinBeanV2.FamousBean) GameFormFragment.this.f51664r.get(i4);
            View findViewById = view.findViewById(R.id.main);
            MyImageLoader.u((SimpleDraweeView) view.findViewById(R.id.userIcon), R.drawable.papa_user_icon, famousBean.getPic());
            ((TextView) view.findViewById(R.id.folloNum)).setText("收藏 " + famousBean.getCount() + "");
            ((TextView) view.findViewById(R.id.userName)).setText(famousBean.getName());
            ((TextView) view.findViewById(R.id.userTag)).setText(famousBean.getTitle());
            findViewById.setOnClickListener(new a(famousBean));
            return view;
        }
    }

    /* loaded from: classes3.dex */
    class e extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        HListView f51682a;

        /* renamed from: b  reason: collision with root package name */
        TextView f51683b;

        public e(@NonNull View view) {
            super(view);
            this.f51682a = (HListView) view.findViewById(R.id.hongrenlist);
            this.f51683b = (TextView) view.findViewById(R.id.title);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        Object f51685a;

        /* renamed from: b  reason: collision with root package name */
        int f51686b;

        /* renamed from: c  reason: collision with root package name */
        String f51687c;

        /* renamed from: d  reason: collision with root package name */
        int f51688d;

        public f(Object obj, int i4, String str, int i5) {
            this.f51685a = obj;
            this.f51686b = i4;
            this.f51687c = str;
            this.f51688d = i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(String str, int i4) {
        Intent intent = new Intent(getActivity(), GameDetailActivity_.class);
        intent.putExtra("fromid", str);
        intent.putExtra("_from", 11103);
        intent.putExtra("groupuid", i4);
        intent.putExtra("gameid", this.f51658l);
        intent.putExtra("company_id", this.f51657k);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(int i4, int i5) {
        RequestModel requestModel = new RequestModel();
        requestModel.setDefault(getActivity());
        LuckHistoryrequest luckHistoryrequest = new LuckHistoryrequest();
        luckHistoryrequest.setUid(AccountUtil_.getInstance_(this.f51651e).getAccountData().getUid());
        luckHistoryrequest.setPage(i5);
        luckHistoryrequest.setType(i4);
        requestModel.setArgs(luckHistoryrequest);
        com.join.mgps.rpc.impl.i.D0().B0().S0(requestModel.makeSign()).enqueue(new b());
    }

    public static GameFormFragment g0(int i4) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isRanking", true);
        bundle.putInt("rankingType", i4);
        GameFormFragment_ gameFormFragment_ = new GameFormFragment_();
        gameFormFragment_.setArguments(bundle);
        return gameFormFragment_;
    }

    public static GameFormFragment h0(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("company_id", str);
        bundle.putString("gameid", str2);
        GameFormFragment_ gameFormFragment_ = new GameFormFragment_();
        gameFormFragment_.setArguments(bundle);
        return gameFormFragment_;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void V() {
        this.f51651e = getActivity();
        this.f51659m = new ArrayList();
        this.f51655i = com.join.mgps.rpc.impl.a.c0();
        Bundle arguments = getArguments();
        this.f51650d = new GameListAdapter();
        this.f51648b.setLayoutManager(new LinearLayoutManager(this.f51651e));
        this.f51648b.setAdapter(this.f51650d);
        this.f51648b.setVerticalScrollBarEnabled(false);
        this.f51657k = arguments.getString("company_id");
        String string = arguments.getString("gameid");
        this.f51658l = string;
        if (string == null) {
            this.f51658l = "";
        }
        if (this.f51657k == null) {
            this.f51657k = "";
        }
        this.f51648b.setLoadingMoreEnabled(true);
        this.f51648b.setPreLoadCount(10);
        this.f51648b.setLoadingListener(new a());
        boolean z4 = getArguments().getBoolean("isRanking");
        this.f51663q = z4;
        if (z4) {
            int i4 = getArguments().getInt("rankingType");
            this.f51662p = i4;
            f0(i4, this.f51656j);
            return;
        }
        d0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void X() {
        LinearLayout linearLayout = this.f51649c;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        e0();
        XRecyclerView xRecyclerView = this.f51648b;
        if (xRecyclerView != null) {
            xRecyclerView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void c0() {
        List<f> list = this.f51659m;
        if (list != null) {
            list.clear();
        }
        GameListAdapter gameListAdapter = this.f51650d;
        if (gameListAdapter != null) {
            gameListAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void d0() {
        List<GameFromPopoWinBeanV2.FamousBean> list;
        try {
            if (com.join.android.app.common.utils.j.j(this.f51651e)) {
                if (this.f51656j == 1) {
                    showLoding();
                }
                RequestBeanUtil.getInstance(this.f51651e);
                String versionAndVersionName = RequestBeanUtil.getVersionAndVersionName();
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                int i4 = this.f51656j;
                this.f51656j = i4 + 1;
                linkedMultiValueMap.add("page", Integer.valueOf(i4));
                linkedMultiValueMap.add("company_id", this.f51657k);
                linkedMultiValueMap.add("game_id", this.f51658l);
                linkedMultiValueMap.add("device_id", "");
                linkedMultiValueMap.add("version", versionAndVersionName);
                ArrayList arrayList = new ArrayList();
                GameFromPopoWinBeanV2 J = this.f51655i.J(linkedMultiValueMap);
                if (J != null && J.getError() == 0 && J.getData() != null && J.getData().getFav_list() != null && J.getData().getFav_list().size() > 0) {
                    e0();
                    k0();
                    List<GameFromPopoWinBeanV2.DataBean> fav_list = J.getData().getFav_list();
                    if (this.f51656j == 2) {
                        this.f51664r = J.getData().getFamous_list();
                    }
                    if (fav_list.size() < 10) {
                        this.f51665s = true;
                    }
                    for (int i5 = 0; i5 < fav_list.size(); i5++) {
                        GameFromPopoWinBeanV2.DataBean dataBean = fav_list.get(i5);
                        arrayList.add(new f(dataBean, 1, dataBean.getId(), dataBean.getUid()));
                        if (i5 == 0 && (list = this.f51664r) != null && list.size() > 0 && this.f51656j == 2) {
                            arrayList.add(new f(this.f51664r, 2, dataBean.getId(), dataBean.getUid()));
                        }
                    }
                    j0(arrayList);
                    return;
                } else if (this.f51656j == 2) {
                    X();
                    return;
                } else {
                    i0();
                    return;
                }
            }
            showLodingFailed();
        } catch (Exception e5) {
            showLodingFailed();
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e0() {
        LinearLayout linearLayout = this.f51653g;
        if (linearLayout == null || this.f51654h == null) {
            return;
        }
        try {
            linearLayout.setVisibility(8);
            this.f51654h.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0() {
        XRecyclerView xRecyclerView = this.f51648b;
        if (xRecyclerView != null) {
            xRecyclerView.setNoMore();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0(List<f> list) {
        if (this.f51659m != null) {
            e0();
            k0();
            this.f51656j++;
            this.f51659m.addAll(list);
        }
        XRecyclerView xRecyclerView = this.f51648b;
        if (xRecyclerView != null) {
            xRecyclerView.loadMoreComplete();
        }
        GameListAdapter gameListAdapter = this.f51650d;
        if (gameListAdapter != null) {
            gameListAdapter.notifyDataSetChanged();
        }
        if (this.f51665s) {
            i0();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(System.identityHashCode(this.f51659m));
        sb.append("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0() {
        XRecyclerView xRecyclerView = this.f51648b;
        if (xRecyclerView != null) {
            xRecyclerView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f51656j = 1;
        if (this.f51663q) {
            showLoding();
            int i4 = getArguments().getInt("rankingType");
            this.f51662p = i4;
            f0(i4, this.f51656j);
            return;
        }
        d0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f51651e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            LinearLayout linearLayout = this.f51653g;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.f51654h;
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
        XRecyclerView xRecyclerView = this.f51648b;
        if (xRecyclerView != null) {
            xRecyclerView.setVisibility(8);
        }
        LinearLayout linearLayout = this.f51654h;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f51653g;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }
}
