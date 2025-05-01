package com.join.mgps.activity;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.BaseAppCompatActivity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.google.gson.JsonObject;
import com.join.android.app.common.http.d;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.Constant;
import com.join.mgps.dto.DiscoveryPaiweiGameIndexBean;
import com.join.mgps.dto.DiscoveryPaiweiGameListBean;
import com.join.mgps.fragment.DiscoveryPaiweiDetailFragment_;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.arc.util.SignUtils;
import com.uc.crashsdk.export.LogType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import okhttp3.Request;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.json.JSONException;
import org.json.JSONObject;
@EActivity(R.layout.activity_discovery_paiwei)
/* loaded from: classes4.dex */
public class DiscoveryPaiweiActivity extends BaseAppCompatActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    View f29852b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ViewPager2 f29853c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    RecyclerView f29854d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    Group f29855e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f29856f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f29857g;
    @Extra

    /* renamed from: h  reason: collision with root package name */
    String f29858h;

    /* renamed from: i  reason: collision with root package name */
    private Context f29859i;

    /* renamed from: l  reason: collision with root package name */
    private f f29862l;

    /* renamed from: o  reason: collision with root package name */
    private AccountUtil_ f29865o;

    /* renamed from: r  reason: collision with root package name */
    private g f29868r;

    /* renamed from: j  reason: collision with root package name */
    private List<String> f29860j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private List<DiscoveryPaiweiGameIndexBean> f29861k = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private int f29863m = 1;

    /* renamed from: n  reason: collision with root package name */
    private final String f29864n = com.join.mgps.rpc.h.f54065m + "/game/discover/index";

    /* renamed from: p  reason: collision with root package name */
    private boolean f29866p = true;

    /* renamed from: q  reason: collision with root package name */
    private boolean f29867q = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends d.p<String> {
        a() {
        }

        @Override // com.join.android.app.common.http.d.p
        public void d(Request request, Exception exc) {
            exc.printStackTrace();
            DiscoveryPaiweiActivity.this.showLodingFailed();
            DiscoveryPaiweiActivity.this.f29867q = false;
        }

        @Override // com.join.android.app.common.http.d.p
        /* renamed from: f */
        public void e(String str) {
            DiscoveryPaiweiActivity.this.o0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Comparator<DiscoveryPaiweiGameIndexBean> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(DiscoveryPaiweiGameIndexBean discoveryPaiweiGameIndexBean, DiscoveryPaiweiGameIndexBean discoveryPaiweiGameIndexBean2) {
            DownloadTask F = p1.f.K().F(discoveryPaiweiGameIndexBean.getGame_id());
            DownloadTask F2 = p1.f.K().F(discoveryPaiweiGameIndexBean2.getGame_id());
            if (F == null && F2 == null) {
                return 0;
            }
            if (F == null) {
                return 1;
            }
            if (F2 == null) {
                return -1;
            }
            long openTime = F.getOpenTime();
            long openTime2 = F2.getOpenTime();
            if (openTime2 == openTime) {
                return 0;
            }
            return openTime2 - openTime > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends ViewPager2.OnPageChangeCallback {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i4) {
            super.onPageSelected(i4);
            RecyclerView recyclerView = DiscoveryPaiweiActivity.this.f29854d;
            if (recyclerView != null) {
                recyclerView.smoothScrollToPosition(i4);
            }
            if (DiscoveryPaiweiActivity.this.f29862l != null) {
                DiscoveryPaiweiActivity.this.f29862l.c(i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements BaseQuickAdapter.j {
        d() {
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.j
        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
            DiscoveryPaiweiActivity.this.f29862l.c(i4);
            DiscoveryPaiweiActivity.this.f29853c.setCurrentItem(i4, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e extends RecyclerView.OnScrollListener {
        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            if (i4 != 0 || !DiscoveryPaiweiActivity.this.f29866p || DiscoveryPaiweiActivity.this.f29867q || ((LinearLayoutManager) DiscoveryPaiweiActivity.this.f29854d.getLayoutManager()).findLastCompletelyVisibleItemPosition() < DiscoveryPaiweiActivity.this.f29861k.size() - 3) {
                return;
            }
            DiscoveryPaiweiActivity.k0(DiscoveryPaiweiActivity.this);
            DiscoveryPaiweiActivity.this.l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f extends BaseQuickAdapter<DiscoveryPaiweiGameIndexBean, BaseViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        private int f29874a;

        public f() {
            super(R.layout.item_discovery_paiwei_game, DiscoveryPaiweiActivity.this.f29861k);
            this.f29874a = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(int i4) {
            this.f29874a = i4;
            notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: b */
        public void convert(@NonNull BaseViewHolder baseViewHolder, DiscoveryPaiweiGameIndexBean discoveryPaiweiGameIndexBean) {
            MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.iconGameBig), discoveryPaiweiGameIndexBean.getIcon());
            MyImageLoader.n((SimpleDraweeView) baseViewHolder.getView(R.id.iconGameSmall), discoveryPaiweiGameIndexBean.getIcon());
            baseViewHolder.setVisible(R.id.iconGameBig, baseViewHolder.getLayoutPosition() == this.f29874a).setVisible(R.id.flIconGameSmall, baseViewHolder.getLayoutPosition() != this.f29874a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends FragmentStateAdapter {

        /* renamed from: a  reason: collision with root package name */
        private List<DiscoveryPaiweiGameIndexBean> f29876a;

        public g(@NonNull FragmentActivity fragmentActivity, List<DiscoveryPaiweiGameIndexBean> list) {
            super(fragmentActivity);
            this.f29876a = list;
        }

        private DiscoveryPaiweiDetailFragment_ b(int i4) {
            FragmentManager supportFragmentManager = DiscoveryPaiweiActivity.this.getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(com.xinzhu.overmind.utils.helpers.f.f68332a + getItemId(i4));
            if (findFragmentByTag == null || !(findFragmentByTag instanceof DiscoveryPaiweiDetailFragment_)) {
                return null;
            }
            return (DiscoveryPaiweiDetailFragment_) findFragmentByTag;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(List<DiscoveryPaiweiGameIndexBean> list) {
            this.f29876a = list;
            DiscoveryPaiweiActivity.this.f29853c.setOffscreenPageLimit(list.size() - 1);
            notifyDataSetChanged();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public boolean containsItem(long j4) {
            return j4 >= 0 && j4 < ((long) getItemCount());
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NonNull
        public Fragment createFragment(int i4) {
            return DiscoveryPaiweiDetailFragment_.j0().b(this.f29876a.get(i4).getGame_id()).c(this.f29876a.get(i4).getMax_battle_count()).build();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f29876a.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i4) {
            return i4;
        }
    }

    private void initView() {
        g gVar = new g(this, this.f29861k);
        this.f29868r = gVar;
        this.f29853c.setAdapter(gVar);
        this.f29853c.setOffscreenPageLimit(2);
        this.f29853c.registerOnPageChangeCallback(new c());
        f fVar = new f();
        this.f29862l = fVar;
        fVar.setOnItemClickListener(new d());
        this.f29854d.setAdapter(this.f29862l);
        this.f29854d.addOnScrollListener(new e());
    }

    static /* synthetic */ int k0(DiscoveryPaiweiActivity discoveryPaiweiActivity) {
        int i4 = discoveryPaiweiActivity.f29863m;
        discoveryPaiweiActivity.f29863m = i4 + 1;
        return i4;
    }

    private void m0(boolean z4) {
        View decorView = getWindow().getDecorView();
        if (decorView != null) {
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z4 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.f29859i = this;
        this.f29865o = AccountUtil_.getInstance_(this);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            Window window = getWindow();
            window.clearFlags(TTAdConstant.KEY_CLICK_AREA);
            window.getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } else if (i4 >= 19) {
            getWindow().addFlags(TTAdConstant.KEY_CLICK_AREA);
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f29852b.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).height = com.join.android.app.common.utils.n.v(this.f29859i);
        this.f29852b.setLayoutParams(layoutParams);
        m0(true);
        initView();
        l0();
        com.papa.sim.statistic.p.l(this.f29859i).O1(Event.clickVSZoneList, new Ext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void l0() {
        this.f29867q = true;
        if (this.f29863m == 1) {
            showLoding();
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("downloadGameList", TextUtils.join(",", (Long[]) p1.f.K().B().toArray(new Long[0])));
        String str = this.f29858h;
        if (str != null) {
            jsonObject.addProperty("gameId", str);
        }
        jsonObject.addProperty("page", Integer.valueOf(this.f29863m));
        jsonObject.addProperty("token", this.f29865o.getToken());
        jsonObject.addProperty("uid ", this.f29865o.getUid());
        jsonObject.addProperty(Constant.MD5, SignUtils.buildRequestSign(jsonObject));
        com.join.android.app.common.http.d.G().H().v(this.f29864n, jsonObject, new a(), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        com.join.mgps.Util.v0.c("显示主界面main");
        LinearLayout linearLayout = this.f29857g;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f29856f;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        Group group = this.f29855e;
        if (group != null) {
            group.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("code") == 200) {
                DiscoveryPaiweiGameListBean discoveryPaiweiGameListBean = (DiscoveryPaiweiGameListBean) JsonMapper.getInstance().fromJson(jSONObject.optString("data"), DiscoveryPaiweiGameListBean.class);
                if (discoveryPaiweiGameListBean != null && discoveryPaiweiGameListBean.getGame_list() != null && discoveryPaiweiGameListBean.getGame_list().size() > 0) {
                    if (this.f29863m == 1) {
                        this.f29861k.clear();
                    }
                    List<DiscoveryPaiweiGameIndexBean> game_list = discoveryPaiweiGameListBean.getGame_list();
                    Collections.sort(game_list, new b());
                    DiscoveryPaiweiGameIndexBean discoveryPaiweiGameIndexBean = null;
                    Iterator<DiscoveryPaiweiGameIndexBean> it2 = game_list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        DiscoveryPaiweiGameIndexBean next = it2.next();
                        if (next.getGame_id().equals(this.f29858h)) {
                            discoveryPaiweiGameIndexBean = next;
                            break;
                        }
                    }
                    if (discoveryPaiweiGameIndexBean != null) {
                        game_list.remove(discoveryPaiweiGameIndexBean);
                        game_list.add(0, discoveryPaiweiGameIndexBean);
                    }
                    this.f29861k.addAll(game_list);
                    this.f29862l.replaceData(this.f29861k);
                    this.f29868r.c(this.f29861k);
                    n0();
                } else {
                    if (this.f29863m == 1) {
                        showLodingFailed();
                    }
                    this.f29866p = false;
                }
            } else {
                String optString = jSONObject.optString("message");
                if (!TextUtils.isEmpty(optString)) {
                    showMessage(optString);
                }
                showLodingFailed();
                this.f29866p = false;
            }
            this.f29867q = false;
        } catch (JSONException e5) {
            e5.printStackTrace();
            showLodingFailed();
            this.f29866p = false;
            this.f29867q = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f29865o = AccountUtil_.getInstance_(this.f29859i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        if (this.f29861k == null) {
            this.f29861k = new ArrayList();
        }
        this.f29861k.clear();
        this.f29867q = false;
        this.f29866p = true;
        l0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f29859i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        com.join.mgps.Util.v0.c("显示加载中");
        LinearLayout linearLayout = this.f29856f;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f29857g;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        Group group = this.f29855e;
        if (group != null) {
            group.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f29857g;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f29856f;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        Group group = this.f29855e;
        if (group != null) {
            group.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this.f29859i).b(str);
    }
}
