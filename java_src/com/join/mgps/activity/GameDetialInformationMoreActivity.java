package com.join.mgps.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.BaseFragmentActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.DetialIntentBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.GameDetialStrategyTag;
import com.join.mgps.dto.RecommendInfomationBean;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ResultMessageBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Where;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
@EActivity(R.layout.detial_more_imformation_layout)
/* loaded from: classes4.dex */
public class GameDetialInformationMoreActivity extends BaseFragmentActivity implements AbsListView.OnScrollListener {
    com.join.mgps.dialog.d1 C;
    List<GameDetialStrategyTag> D;

    /* renamed from: b  reason: collision with root package name */
    private Context f31738b;

    /* renamed from: c  reason: collision with root package name */
    private List<RecommendInfomationBean> f31739c;

    /* renamed from: d  reason: collision with root package name */
    private com.join.mgps.adapter.m0 f31740d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    PtrClassicFrameLayout f31741e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f31742f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    XListView2 f31743g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f31744h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f31745i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ImageView f31746j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ImageView f31747k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    LinearLayout f31748l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    LinearLayout f31749m;
    @ViewById(R.id.title_normal_search_img)

    /* renamed from: n  reason: collision with root package name */
    ImageView f31750n;
    @ViewById(R.id.title_normal_download_cdv)

    /* renamed from: o  reason: collision with root package name */
    CustomerDownloadView f31751o;

    /* renamed from: p  reason: collision with root package name */
    com.join.mgps.rpc.e f31752p;
    @StringRes(resName = "net_excption")

    /* renamed from: q  reason: collision with root package name */
    String f31753q;
    @StringRes(resName = "connect_server_excption")

    /* renamed from: r  reason: collision with root package name */
    String f31754r;
    @Extra

    /* renamed from: t  reason: collision with root package name */
    DetialIntentBean f31756t;

    /* renamed from: s  reason: collision with root package name */
    private int f31755s = 1;

    /* renamed from: u  reason: collision with root package name */
    private int f31757u = 0;

    /* renamed from: v  reason: collision with root package name */
    private Map<String, DownloadTask> f31758v = new ConcurrentHashMap();

    /* renamed from: w  reason: collision with root package name */
    Map<String, DownloadTask> f31759w = new HashMap();

    /* renamed from: x  reason: collision with root package name */
    Map<String, DownloadTask> f31760x = new HashMap();

    /* renamed from: y  reason: collision with root package name */
    private String f31761y = "";

    /* renamed from: z  reason: collision with root package name */
    private int f31762z = 0;
    private boolean A = false;
    private int B = 0;

    /* loaded from: classes4.dex */
    class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (GameDetialInformationMoreActivity.this.A) {
                return;
            }
            GameDetialInformationMoreActivity.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (GameDetialInformationMoreActivity.this.A) {
                return;
            }
            GameDetialInformationMoreActivity.this.f31755s = 1;
            GameDetialInformationMoreActivity.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements AdapterView.OnItemClickListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            try {
                if (i4 <= GameDetialInformationMoreActivity.this.f31739c.size() && i4 >= 0) {
                    ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
                    forumPostsBean.setPid(((RecommendInfomationBean) GameDetialInformationMoreActivity.this.f31739c.get(i4)).getPost_id());
                    com.join.mgps.Util.j0.v0(GameDetialInformationMoreActivity.this.f31738b, forumPostsBean);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameDetialStrategyTag f31766b;

        d(GameDetialStrategyTag gameDetialStrategyTag) {
            this.f31766b = gameDetialStrategyTag;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialInformationMoreActivity.this.B = this.f31766b.getTag_id();
            GameDetialInformationMoreActivity.this.f31755s = 1;
            GameDetialInformationMoreActivity.this.C.b();
            GameDetialInformationMoreActivity.this.l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f31752p = com.join.mgps.rpc.impl.d.P1();
        this.f31738b = this;
        this.C = com.join.mgps.Util.b0.f0(this).x(this.f31738b);
        this.B = this.f31756t.getStartegyTab();
        if (this.f31756t.getIntentType() != 1 && this.f31756t.getIntentType() != 5) {
            this.f31748l.setVisibility(8);
            this.f31742f.setText("最新资讯");
        } else {
            this.f31748l.setVisibility(0);
            List<GameDetialStrategyTag> strategyTags = this.f31756t.getStrategyTags();
            this.D = strategyTags;
            p0(this.f31749m, strategyTags);
            this.f31742f.setText(GameMainActivity4.H2);
        }
        com.join.mgps.adapter.m0 m0Var = new com.join.mgps.adapter.m0(this.f31738b);
        this.f31740d = m0Var;
        this.f31739c = m0Var.c();
        showLoding();
        l0();
        this.f31743g.setPreLoadCount(10);
        this.f31743g.setPullLoadEnable(new a());
        this.f31743g.setPullRefreshEnable(new b());
        this.f31743g.setOnItemClickListener(new c());
        this.f31743g.setOnScrollListener(this);
        this.f31743g.setAdapter((ListAdapter) this.f31740d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0() {
        com.join.mgps.dialog.d1 d1Var = this.C;
        if (d1Var == null || !d1Var.isShowing()) {
            return;
        }
        this.C.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void l0() {
        ResultMainBean<List<RecommendInfomationBean>> j02;
        new ArrayList();
        if (com.join.android.app.common.utils.j.j(this.f31738b)) {
            this.A = true;
            try {
                try {
                    CommonRequestBean<RequestGameIdArgs> m02 = m0(this.f31756t.getGameId(), this.f31755s, this.B);
                    if (this.f31756t.getIntentType() == 2) {
                        j02 = this.f31752p.F(m02);
                    } else {
                        j02 = this.f31752p.j0(m02);
                    }
                    ResultMessageBean<List<RecommendInfomationBean>> messages = j02.getMessages();
                    if (messages != null) {
                        List<RecommendInfomationBean> data = messages.getData();
                        if (data != null && data.size() > 0) {
                            if (data.size() == 0) {
                                o0();
                            } else {
                                this.f31755s++;
                            }
                            q0(data);
                            t0();
                        } else {
                            o0();
                        }
                    } else {
                        t0();
                        showLodingFailed();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    t0();
                    showLodingFailed();
                }
                return;
            } finally {
                this.A = false;
                k0();
            }
        }
        t0();
        showLodingFailed();
        k0();
    }

    public CommonRequestBean m0(String str, int i4, int i5) {
        return RequestBeanUtil.getInstance(this.f31738b).getDetialImfMore(str, i4, i5, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        this.f31755s = 1;
        l0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        this.f31743g.setNoMore();
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f31757u = (i5 + i4) - 1;
        this.f31762z = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    public void p0(ViewGroup viewGroup, List<GameDetialStrategyTag> list) {
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (list == null || list.size() == 0) {
            return;
        }
        TextView[] textViewArr = null;
        for (int i4 = 0; i4 < list.size(); i4++) {
            GameDetialStrategyTag gameDetialStrategyTag = list.get(i4);
            int i5 = i4 % 4;
            if (i5 == 0) {
                View inflate = LayoutInflater.from(this.f31738b).inflate(R.layout.forum_theme_category_item, (ViewGroup) null);
                TextView[] textViewArr2 = {(TextView) inflate.findViewById(R.id.tv1), (TextView) inflate.findViewById(R.id.tv2), (TextView) inflate.findViewById(R.id.tv3), (TextView) inflate.findViewById(R.id.tv4)};
                viewGroup.addView(inflate);
                textViewArr = textViewArr2;
            }
            String tag_name = gameDetialStrategyTag.getTag_name();
            int color = this.f31738b.getResources().getColor(R.color.game_detail_tab_text_color);
            TextView textView = textViewArr[i5];
            textView.setVisibility(0);
            textView.setText(tag_name);
            textView.setTextColor(color);
            if (this.B == gameDetialStrategyTag.getTag_id()) {
                textView.setSelected(true);
            } else {
                textView.setSelected(false);
            }
            textView.setOnClickListener(new d(gameDetialStrategyTag));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0(List<RecommendInfomationBean> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        p0(this.f31749m, this.D);
        this.f31745i.setVisibility(8);
        this.f31744h.setVisibility(8);
        this.f31741e.setVisibility(0);
        if (this.f31755s <= 2) {
            this.f31739c.clear();
        }
        this.f31739c.addAll(list);
        if (this.f31755s == 2) {
            this.f31739c.size();
            this.f31740d.notifyDataSetChanged();
            return;
        }
        this.f31740d.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void r0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f31755s = 1;
        showLoding();
        l0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void s0() {
        SearchHintActivity_.G1(this.f31738b).start();
        com.papa.sim.statistic.p.l(this.f31738b).u2(Where.modufour, AccountUtil_.getInstance_(this.f31738b).getUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f31738b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f31744h.setVisibility(0);
        this.f31745i.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        List<RecommendInfomationBean> list = this.f31739c;
        if (list == null || list.size() == 0) {
            this.f31745i.setVisibility(0);
            this.f31744h.setVisibility(8);
            this.f31741e.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0() {
        this.f31743g.v();
        this.f31743g.u();
    }
}
