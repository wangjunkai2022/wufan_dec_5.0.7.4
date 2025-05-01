package com.join.mgps.activity;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.BaseAppCompatActivity;
import com.MApplication;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.search.SearchAutoAdData;
import com.join.mgps.activity.search.SearchAutoData;
import com.join.mgps.activity.search.SearchHotAdInfo;
import com.join.mgps.activity.search.SearchIndexData;
import com.join.mgps.activity.search.SearchRankingFragment;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.FlowLayout;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.WrapContentGridView;
import com.join.mgps.db.tables.SearchRecordTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.FavoriteBean;
import com.join.mgps.dto.GameInfoBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.RequestKeywordArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestUidtagidTagdes;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.SScrollingTxtBeanV2;
import com.join.mgps.dto.SearchAutoDataBean;
import com.join.mgps.dto.SearchGameZoneBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.service.CommonService_;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.arc.view.GlideImageLoader;
import com.psk.eventmodule.StatFactory;
import com.uc.crashsdk.export.LogType;
import com.youth.banner.Banner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.EditorAction;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.search_hint_activity)
/* loaded from: classes.dex */
public class SearchHintActivity extends BaseAppCompatActivity implements AbsListView.OnScrollListener {
    public static boolean K1 = false;
    public static final String L1 = "key";
    @ViewById
    FlowLayout A;
    @ViewById
    FlowLayout B;
    @ViewById
    View C;
    SearchIndexData C1;
    @ViewById
    View D;
    @ViewById
    RelativeLayout E;
    @ViewById
    TextView F;
    @ViewById
    ListView G;
    @ViewById
    View H;
    private List<Object> I;
    List<DownloadTask> I1;
    private List<SearchAutoDataBean> J;
    private r K;
    private ResponseModel<SearchAutoData> L;
    private ArrayList<String> O;
    com.join.mgps.rpc.e P;
    @StringRes(resName = "net_excption")
    String Q;
    @StringRes(resName = "connect_server_excption")
    String R;
    private String T;
    private q W;
    private p X;
    private ResponseModel<SearchIndexData> Y;
    @Extra

    /* renamed from: b  reason: collision with root package name */
    String f37145b;
    @Extra

    /* renamed from: c  reason: collision with root package name */
    int f37146c;
    @Extra

    /* renamed from: e  reason: collision with root package name */
    int f37148e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ForumLoadingView f37149f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    View f37150g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    ViewPager2 f37151h;

    /* renamed from: i  reason: collision with root package name */
    private Context f37152i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    EditText f37153j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ImageView f37154k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    ImageView f37155l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    ImageView f37156m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    LinearLayout f37157n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    View f37158o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    WrapContentGridView f37159p;

    /* renamed from: p0  reason: collision with root package name */
    private boolean f37160p0;
    @Pref

    /* renamed from: p1  reason: collision with root package name */
    PrefDef_ f37161p1;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    WrapContentGridView f37162q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    FlowLayout f37163r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    View f37164s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    View f37165t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    View f37166u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    View f37167v;

    /* renamed from: v1  reason: collision with root package name */
    FragmentPagerAdapter f37168v1;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    SimpleDraweeView f37169w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    Banner f37170x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    ViewPager f37171y;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    TabLayout f37172z;
    @Extra

    /* renamed from: d  reason: collision with root package name */
    ArrayList<SScrollingTxtBeanV2> f37147d = new ArrayList<>();
    private int M = 1;
    private int N = 50;
    private int S = 0;
    int U = 0;
    boolean V = false;
    private String Z = "搜索游戏、厂商、帖子";
    private String[] A1 = {"热搜榜", "网游榜", "模拟器榜", "单机榜"};
    String B1 = "";
    List<FragmentPagerAdapter.a> D1 = new ArrayList();
    List<CollectionBeanSubBusiness> E1 = new ArrayList();
    private boolean F1 = false;
    private int G1 = 0;
    private int H1 = 0;
    private Map<String, DownloadTask> J1 = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameInfoBean f37173b;

        a(GameInfoBean gameInfoBean) {
            this.f37173b = gameInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i4;
            SearchHintActivity.this.C0(this.f37173b.getGame_name(), this.f37173b.getGame_id());
            if (this.f37173b.isThe_hot()) {
                i4 = 1;
            } else {
                i4 = this.f37173b.isThe_score() ? 2 : 0;
            }
            com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(SearchHintActivity.this.f37152i);
            Event event = Event.clickSearchRecommend;
            Ext ext = new Ext();
            l4.O1(event, ext.setFrom(i4 + ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchGameZoneBean f37175b;

        b(SearchGameZoneBean searchGameZoneBean) {
            this.f37175b = searchGameZoneBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TextUtils.isEmpty(this.f37175b.getZone_id())) {
                SearchHintActivity.this.C0(this.f37175b.getZone_name(), null);
            } else {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(33);
                intentDateBean.setLink_type_val(this.f37175b.getZone_id());
                IntentUtil.getInstance().intentActivity(SearchHintActivity.this.f37152i, intentDateBean);
            }
            com.papa.sim.statistic.p.l(SearchHintActivity.this.f37152i).O1(Event.clickSearchRecommend, new Ext().setFrom("0"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends ForumLoadingView.e {
        c(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            super.a(view);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            SearchHintActivity.this.K0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends ForumLoadingView.e {
        d(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            super.b();
            SearchHintActivity.this.K0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e extends ForumLoadingView.e {
        e(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            SearchHintActivity.this.K0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnFocusChangeListener {
        f() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z4) {
            com.join.mgps.Util.w0.e("onFocusChange", "hasFocus=" + z4);
            SearchHintActivity.this.l1();
            SearchHintActivity searchHintActivity = SearchHintActivity.this;
            if (searchHintActivity.f37151h != null) {
                if (z4) {
                    searchHintActivity.f37170x.q(false);
                    int currentItem = SearchHintActivity.this.f37151h.getCurrentItem();
                    ArrayList<SScrollingTxtBeanV2> arrayList = SearchHintActivity.this.f37147d;
                    if (arrayList == null || arrayList.size() <= 0) {
                        return;
                    }
                    ArrayList<SScrollingTxtBeanV2> arrayList2 = SearchHintActivity.this.f37147d;
                    SScrollingTxtBeanV2 sScrollingTxtBeanV2 = arrayList2.get(currentItem % arrayList2.size());
                    SearchHintActivity.this.f37151h.setVisibility(8);
                    if (sScrollingTxtBeanV2 != null) {
                        SearchHintActivity.this.f37153j.setHint(sScrollingTxtBeanV2.getWord());
                        o2.a.c(SearchHintActivity.this.f37153j);
                        return;
                    }
                    return;
                }
                searchHintActivity.f37170x.q(true);
                SearchHintActivity.this.f37151h.setVisibility(0);
                SearchHintActivity.this.f37153j.setHint("");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
            ArrayList<SScrollingTxtBeanV2> arrayList;
            if (i4 == 66 && keyEvent.getAction() == 0) {
                SearchHintActivity.this.E0();
                String replaceAll = SearchHintActivity.this.f37153j.getText().toString().replaceAll(" ", "");
                SearchHintActivity.this.f37153j.clearFocus();
                SearchHintActivity.this.f37156m.clearFocus();
                com.join.mgps.Util.w0.e("setOnKeyListener", "keyword=" + replaceAll);
                if (replaceAll.length() > 0) {
                    SearchHintActivity.this.C0(replaceAll, "");
                } else {
                    SearchHintActivity searchHintActivity = SearchHintActivity.this;
                    if (searchHintActivity.f37151h != null && (arrayList = searchHintActivity.f37147d) != null && arrayList.size() > 0) {
                        int currentItem = SearchHintActivity.this.f37151h.getCurrentItem();
                        ArrayList<SScrollingTxtBeanV2> arrayList2 = SearchHintActivity.this.f37147d;
                        SearchHintActivity.this.C0(arrayList2.get(currentItem % arrayList2.size()).getWord(), "");
                    } else if (SearchHintActivity.this.B1.length() > 0) {
                        SearchHintActivity searchHintActivity2 = SearchHintActivity.this;
                        searchHintActivity2.C0(searchHintActivity2.B1, "");
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements TextWatcher {
        h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            com.join.mgps.Util.w0.e("afterTextChanged", "keyword=" + SearchHintActivity.this.f37153j.getText().toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            com.join.mgps.Util.w0.e("beforeTextChanged", "keyword=" + SearchHintActivity.this.f37153j.getText().toString());
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            com.join.mgps.Util.w0.e("onTextChanged", "keyword=" + SearchHintActivity.this.f37153j.getText().toString());
            SearchHintActivity.this.l1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            CommonGameInfoBean commonGameInfoBean;
            Object obj = SearchHintActivity.this.I.get(i4);
            if (obj instanceof SearchAutoDataBean) {
                SearchAutoDataBean searchAutoDataBean = (SearchAutoDataBean) obj;
                String str = searchAutoDataBean.getGame_name().toString();
                SearchHintActivity.this.D0(str, searchAutoDataBean.getCrc_sign_id(), 2);
                String crc_sign_id = searchAutoDataBean.getCrc_sign_id();
                SearchHintActivity.this.T0(str, crc_sign_id);
                SearchHintActivity.this.Y0(crc_sign_id);
            } else if (obj instanceof CollectionBeanSub) {
                CollectionBeanSub collectionBeanSub = (CollectionBeanSub) obj;
                IntentUtil.getInstance().intentActivity(SearchHintActivity.this.f37152i, SearchHintActivity.this.s0(collectionBeanSub.getIntentDataBean()));
                Ext ext = new Ext();
                ext.setPosition("searchSuggest");
                ext.setGameId(collectionBeanSub.getGame_id());
                com.papa.sim.statistic.p.l(SearchHintActivity.this.f37152i).O1(Event.clickDetailFromSearchResult, ext);
            } else if (!(obj instanceof CommonGameInfoBean) || (commonGameInfoBean = (CommonGameInfoBean) obj) == null) {
            } else {
                if (commonGameInfoBean.isAdInfo()) {
                    IntentUtil.getInstance().intentActivity(SearchHintActivity.this.f37152i, commonGameInfoBean.getIntentDataBean());
                    SearchHintActivity.this.W0(Event.searchThinkAdWordClick, "2", commonGameInfoBean.getIntentDataBean().getLink_type_val(), commonGameInfoBean.getTitle());
                    return;
                }
                String obj2 = SearchHintActivity.this.f37153j.getText().toString();
                SearchHintActivity.this.D0(obj2, "", 2);
                SearchHintActivity.this.T0(obj2, "");
                SearchHintActivity.this.Y0("");
                SearchHintActivity.this.W0(Event.searchThinkAdWordClick, "1", commonGameInfoBean.getIntentDataBean().getLink_type_val(), commonGameInfoBean.getTitle());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements ViewPager.OnPageChangeListener {
        j() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(SearchHintActivity.this.f37152i);
            Event event = Event.switchRankingList;
            Ext ext = new Ext();
            l4.O1(event, ext.setFrom((i4 + 1) + ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements TabLayout.OnTabSelectedListener {
        k() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            SearchHintActivity.this.setStatus(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            SearchHintActivity.this.setStatus(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements ViewPager.OnPageChangeListener {
        l() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            ArrayList<SScrollingTxtBeanV2> arrayList;
            ViewPager2 viewPager2 = SearchHintActivity.this.f37151h;
            if (viewPager2 != null) {
                viewPager2.setCurrentItem(i4);
                if (SearchHintActivity.this.f37151h.getVisibility() != 0 && (arrayList = SearchHintActivity.this.f37147d) != null && arrayList.size() > 0) {
                    SearchHintActivity searchHintActivity = SearchHintActivity.this;
                    searchHintActivity.f37153j.setHint(searchHintActivity.f37147d.get(i4).getWord());
                }
            }
            SearchHintActivity.this.X0(Event.searchReturnExpGamePic, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements m3.b {
        m() {
        }

        @Override // m3.b
        public void OnBannerClick(int i4) {
            ArrayList<SScrollingTxtBeanV2> arrayList = SearchHintActivity.this.f37147d;
            if (arrayList == null || arrayList.get(i4) == null || SearchHintActivity.this.f37147d.get(i4).getJumpModelDto() == null) {
                return;
            }
            CommonGameInfoBean jumpModelDto = SearchHintActivity.this.f37147d.get(i4).getJumpModelDto();
            jumpModelDto.set_from(164);
            jumpModelDto.set_from_type(164);
            IntentUtil.getInstance().intentActivity(SearchHintActivity.this.f37152i, jumpModelDto.getIntentDataBean());
            SearchHintActivity.this.X0(Event.searchReturnClickGamePic, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchAutoDataBean f37188b;

        n(SearchAutoDataBean searchAutoDataBean) {
            this.f37188b = searchAutoDataBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchHintActivity.this.C0(this.f37188b.getGame_name(), this.f37188b.getGame_id());
        }
    }

    /* loaded from: classes4.dex */
    public static class o implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        CollectionBeanSubBusiness f37190b;

        /* renamed from: c  reason: collision with root package name */
        Context f37191c;

        /* renamed from: d  reason: collision with root package name */
        String f37192d;

        public o(CollectionBeanSubBusiness collectionBeanSubBusiness, Context context, String str) {
            this.f37190b = collectionBeanSubBusiness;
            this.f37191c = context;
            this.f37192d = str;
        }

        void a(DownloadTask downloadTask) {
            if (downloadTask == null) {
                return;
            }
            ExtBean extBean = new ExtBean();
            extBean.setFrom("103");
            extBean.setLocation(this.f37192d);
            downloadTask.setExt(JsonMapper.toJsonString(extBean));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String game_id;
            DownloadTask downloadTask = this.f37190b.getDownloadTask();
            if (downloadTask == null) {
                if (this.f37190b.isCpsGame() && com.join.mgps.Util.s0.c() && com.join.mgps.Util.s0.a(this.f37190b.getTag_info())) {
                    com.join.mgps.Util.s0.b();
                    return;
                }
                if (this.f37190b.getMod_info() == null && UtilsMy.o0(this.f37190b.getTag_info())) {
                    if (this.f37190b.getMod_info() == null) {
                        if (com.join.android.app.common.utils.e.l0(this.f37191c).d(this.f37191c, this.f37190b.getPackage_name())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f37191c).l(this.f37191c, this.f37190b.getPackage_name());
                            if (!com.join.mgps.Util.g2.i(this.f37190b.getVer()) || l4.d() >= Integer.parseInt(this.f37190b.getVer())) {
                                com.join.android.app.common.utils.e.l0(this.f37191c);
                                APKUtils.a0(this.f37191c, this.f37190b.getPackage_name());
                                return;
                            }
                        }
                    } else {
                        boolean d5 = com.join.android.app.common.utils.e.l0(this.f37191c).d(this.f37191c, this.f37190b.getPackage_name());
                        boolean F = com.join.mgps.va.overmind.d.o().F(this.f37190b.getPackage_name());
                        if (d5 || F) {
                            com.join.android.app.common.utils.e.l0(this.f37191c);
                            APKUtils.V(this.f37191c, this.f37190b.getMod_info());
                            return;
                        }
                        return;
                    }
                }
                if (this.f37190b.getBespeak_switch() == 1 && this.f37190b.getDown_status() == 6) {
                    if (this.f37190b.getMod_info() != null) {
                        game_id = this.f37190b.getMod_info().getMod_game_id();
                    } else {
                        game_id = this.f37190b.getGame_id();
                    }
                    if (this.f37190b.getGame_book() == 0) {
                        ((CommonService_.h2) CommonService_.S2(this.f37191c).extra("onClickGamebeSpeakGameId", game_id)).a();
                        return;
                    } else if (this.f37190b.getGame_book() == 1) {
                        ((CommonService_.h2) CommonService_.S2(this.f37191c).extra("onClickUnGamebeSpeakGameId", game_id)).a();
                        return;
                    }
                }
                this.f37190b.setWhere(this.f37192d);
                ExtBean extBean = new ExtBean();
                extBean.setReMarks(this.f37190b.getReMarks());
                extBean.set_from_type(112);
                extBean.setFrom("103");
                extBean.setWhere(this.f37192d);
                extBean.setKeyword(this.f37192d);
                this.f37190b.setExt(new Gson().toJson(extBean));
                UtilsMy.Y0(this.f37191c, this.f37190b);
                return;
            }
            if (downloadTask != null) {
                downloadTask.setKeyword(this.f37192d);
                downloadTask.set_from(1);
                a(downloadTask);
            }
            String plugin_num = this.f37190b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f37190b.getDown_url_remote());
                UtilsMy.T2(downloadTask, this.f37191c);
                IntentUtil.getInstance().intentActivity(this.f37191c, intentDateBean);
                return;
            }
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            if (UtilsMy.w0(this.f37190b.getPay_tag_info(), this.f37190b.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status != 13) {
                    if (status != 2) {
                        if (status != 3) {
                            if (status == 5) {
                                UtilsMy.T3(this.f37191c, downloadTask);
                                return;
                            } else if (status != 6) {
                                if (status != 7) {
                                    if (status == 42) {
                                        if (!com.join.android.app.common.utils.j.j(this.f37191c)) {
                                            com.join.mgps.Util.l2.a(this.f37191c).b("无网络连接");
                                            return;
                                        } else {
                                            UtilsMy.I2(this.f37191c, downloadTask);
                                            return;
                                        }
                                    } else if (status != 43) {
                                        switch (status) {
                                            case 9:
                                                if (!com.join.android.app.common.utils.j.j(this.f37191c)) {
                                                    com.join.mgps.Util.l2.a(this.f37191c).b("无网络连接");
                                                    return;
                                                } else {
                                                    UtilsMy.r4(this.f37191c, downloadTask);
                                                    return;
                                                }
                                            case 10:
                                                break;
                                            case 11:
                                                UtilsMy.a4(downloadTask, this.f37191c);
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                        }
                        com.php25.PDownload.d.c(downloadTask, this.f37191c);
                        return;
                    }
                    com.php25.PDownload.d.i(downloadTask);
                    return;
                }
                com.php25.PDownload.d.l(this.f37191c, downloadTask);
                return;
            }
            if (this.f37190b != null) {
                Ext ext = new Ext();
                ext.setPosition("searchSuggest");
                ext.setGameId(this.f37190b.getGame_id());
                com.papa.sim.statistic.p.l(this.f37191c).O1(Event.downloadFromSearchResult, ext);
                if (UtilsMy.y0(this.f37190b.getPay_tag_info(), this.f37190b.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(this.f37191c, downloadTask.getCrc_link_type_val());
                    return;
                }
                UtilsMy.y1(downloadTask, this.f37190b);
                if (UtilsMy.o1(this.f37191c, downloadTask)) {
                    return;
                }
                if (this.f37190b.getDown_status() == 5) {
                    UtilsMy.l1(this.f37191c, downloadTask);
                } else {
                    UtilsMy.R0(this.f37191c, downloadTask, this.f37190b.getTp_down_url(), this.f37190b.getOther_down_switch(), this.f37190b.getCdn_down_switch());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        List<FavoriteBean> f37193b = new ArrayList();

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ FavoriteBean f37195b;

            a(FavoriteBean favoriteBean) {
                this.f37195b = favoriteBean;
            }

            void a(Context context, String str, String str2, String str3, String str4) {
                if (context == null) {
                    return;
                }
                Intent intent = new Intent(context, GameDetailActivity_.class);
                intent.putExtra("fromid", str);
                intent.putExtra("groupuid", TextUtils.isEmpty(str2) ? 0 : Integer.parseInt(str2));
                intent.putExtra("gameid", str3);
                intent.putExtra("company_id", str4);
                context.startActivity(intent);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Context context = view.getContext();
                a(context, this.f37195b.getId() + "", this.f37195b.getUid(), "0", "0");
                com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(view.getContext());
                l4.j0("fromSearchP1", this.f37195b.getId() + "", this.f37195b.getUid());
            }
        }

        /* loaded from: classes4.dex */
        class b {

            /* renamed from: a  reason: collision with root package name */
            public SimpleDraweeView f37197a;

            /* renamed from: b  reason: collision with root package name */
            public TextView f37198b;

            b() {
            }
        }

        public p() {
        }

        public List<FavoriteBean> a(FavoriteBean favoriteBean) {
            if (favoriteBean == null) {
                return this.f37193b;
            }
            if (this.f37193b == null) {
                this.f37193b = new ArrayList();
            }
            this.f37193b.add(favoriteBean);
            return this.f37193b;
        }

        public List<FavoriteBean> b(List<FavoriteBean> list) {
            if (list == null) {
                return this.f37193b;
            }
            if (this.f37193b == null) {
                this.f37193b = new ArrayList();
            }
            this.f37193b.addAll(list);
            return this.f37193b;
        }

        public List<FavoriteBean> c() {
            return this.f37193b;
        }

        public void d(List<FavoriteBean> list) {
            this.f37193b = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<FavoriteBean> list = this.f37193b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            List<FavoriteBean> list = this.f37193b;
            if (list != null) {
                return list.get(i4);
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            return super.getItemViewType(i4);
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            b bVar;
            if (view != null) {
                bVar = (b) view.getTag();
            } else {
                bVar = new b();
                view = LayoutInflater.from(SearchHintActivity.this).inflate(R.layout.search_hint_game_item, (ViewGroup) null);
                bVar.f37197a = (SimpleDraweeView) view.findViewById(R.id.icon);
                bVar.f37198b = (TextView) view.findViewById(R.id.name);
                view.setTag(bVar);
            }
            FavoriteBean favoriteBean = (FavoriteBean) getItem(i4);
            MyImageLoader.h(bVar.f37197a, favoriteBean.getPic());
            bVar.f37198b.setText(favoriteBean.getTitle());
            view.setOnClickListener(new a(favoriteBean));
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return super.getViewTypeCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        List<GameInfoBean> f37200b = new ArrayList();

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GameInfoBean f37202b;

            a(GameInfoBean gameInfoBean) {
                this.f37202b = gameInfoBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SearchHintActivity.this.C0(this.f37202b.getGame_name(), this.f37202b.getGame_id());
            }
        }

        /* loaded from: classes4.dex */
        class b {

            /* renamed from: a  reason: collision with root package name */
            public TextView f37204a;

            /* renamed from: b  reason: collision with root package name */
            public TextView f37205b;

            /* renamed from: c  reason: collision with root package name */
            public TextView f37206c;

            b() {
            }
        }

        public q() {
        }

        public List<GameInfoBean> a(GameInfoBean gameInfoBean) {
            if (gameInfoBean == null) {
                return this.f37200b;
            }
            if (this.f37200b == null) {
                this.f37200b = new ArrayList();
            }
            this.f37200b.add(gameInfoBean);
            return this.f37200b;
        }

        public List<GameInfoBean> b(List<GameInfoBean> list) {
            if (list == null) {
                return this.f37200b;
            }
            if (this.f37200b == null) {
                this.f37200b = new ArrayList();
            }
            this.f37200b.addAll(list);
            return this.f37200b;
        }

        public List<GameInfoBean> c() {
            return this.f37200b;
        }

        public void d(List<GameInfoBean> list) {
            this.f37200b = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<GameInfoBean> list = this.f37200b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            List<GameInfoBean> list = this.f37200b;
            if (list != null) {
                return list.get(i4);
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            return super.getItemViewType(i4);
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            b bVar;
            if (view != null) {
                bVar = (b) view.getTag();
            } else {
                bVar = new b();
                view = LayoutInflater.from(SearchHintActivity.this).inflate(R.layout.search_hint_hot_item, (ViewGroup) null);
                bVar.f37204a = (TextView) view.findViewById(R.id.icon);
                bVar.f37205b = (TextView) view.findViewById(R.id.rank);
                bVar.f37206c = (TextView) view.findViewById(R.id.name);
                view.setTag(bVar);
            }
            GameInfoBean gameInfoBean = (GameInfoBean) getItem(i4);
            int[] iArr = {R.drawable.search_rank_1, R.drawable.search_rank_2, R.drawable.search_rank_3};
            if (i4 < 3) {
                bVar.f37204a.setVisibility(0);
                bVar.f37205b.setVisibility(8);
                bVar.f37204a.setBackgroundResource(iArr[i4]);
            } else {
                bVar.f37204a.setVisibility(8);
                bVar.f37205b.setVisibility(0);
                TextView textView = bVar.f37205b;
                textView.setText("" + (i4 + 1));
            }
            bVar.f37206c.setText(gameInfoBean.getGame_name());
            view.setOnClickListener(new a(gameInfoBean));
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return super.getViewTypeCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s extends BaseQuickAdapter<String, BaseViewHolder> {
        public s(@Nullable List<String> list) {
            super(R.layout.item_search_hint_viewflipper_v2, list);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, String str) {
            baseViewHolder.setText(R.id.tvHint, str);
        }
    }

    /* loaded from: classes4.dex */
    public static class t {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f37223a;

        /* renamed from: b  reason: collision with root package name */
        public ImageView f37224b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f37225c;

        /* renamed from: d  reason: collision with root package name */
        public RelativeLayout f37226d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f37227e;

        /* renamed from: f  reason: collision with root package name */
        public View f37228f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f37229g;

        /* renamed from: h  reason: collision with root package name */
        public LinearLayout f37230h;

        /* renamed from: i  reason: collision with root package name */
        public LinearLayout f37231i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f37232j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f37233k;

        /* renamed from: l  reason: collision with root package name */
        public TextView f37234l;

        /* renamed from: m  reason: collision with root package name */
        public ProgressBar f37235m;

        /* renamed from: n  reason: collision with root package name */
        public ProgressBar f37236n;
    }

    private void B0() {
        if (this.f37172z.getTabCount() == 0) {
            return;
        }
        for (int i4 = 0; i4 < this.f37172z.getTabCount(); i4++) {
            View inflate = LayoutInflater.from(this).inflate(R.layout.search_tab_item_layout, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.f15618tv)).setText(this.A1[i4]);
            this.f37172z.getTabAt(i4).setCustomView(inflate);
        }
        TextView textView = (TextView) this.f37172z.getTabAt(0).getCustomView().findViewById(R.id.f15618tv);
        textView.setTextColor(-16777216);
        textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp32));
        textView.setTypeface(textView.getTypeface(), 1);
        this.f37172z.getTabAt(0).getCustomView().findViewById(R.id.iv).setVisibility(0);
    }

    private void H0() {
        ArrayList<SScrollingTxtBeanV2> arrayList = this.f37147d;
        if (arrayList == null || arrayList.size() <= 0) {
            this.f37147d = MApplication.G1;
        }
        ArrayList<SScrollingTxtBeanV2> arrayList2 = this.f37147d;
        if (arrayList2 == null || arrayList2.size() <= 0 || this.f37170x == null) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String str = null;
        Iterator<SScrollingTxtBeanV2> it2 = this.f37147d.iterator();
        while (it2.hasNext()) {
            SScrollingTxtBeanV2 next = it2.next();
            if (next != null && next.getJumpModelDto() != null && next.getJumpModelDto().getBig_pic() != null) {
                str = next.getJumpModelDto().getBig_pic();
            }
            arrayList3.add(str);
            if (next != null) {
                arrayList4.add(next.getWord());
            } else {
                arrayList4.add("");
            }
        }
        for (int i4 = 0; i4 < arrayList3.size(); i4++) {
            if (arrayList3.get(i4) == null) {
                arrayList3.set(i4, str == null ? Integer.valueOf((int) R.drawable.main_normal_icon) : str);
            }
        }
        this.f37151h.setOrientation(1);
        this.f37151h.setAdapter(new s(arrayList4));
        this.f37151h.setUserInputEnabled(false);
        this.f37170x.z(arrayList3).x(this.f37148e * 1000).y(new GlideImageLoader()).D(new m()).I().setOnPageChangeListener(new l());
        X0(Event.searchReturnExpGamePic, 0);
    }

    private void I0() {
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
        int v2 = com.join.android.app.common.utils.n.v(this);
        View view = this.H;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = v2;
            this.H.setLayoutParams(layoutParams);
        }
        int dimension = (int) getResources().getDimension(R.dimen.wdp97);
        View view2 = this.D;
        if (view2 != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view2.getLayoutParams();
            layoutParams2.topMargin = v2;
            this.D.setLayoutParams(layoutParams2);
        }
        LinearLayout linearLayout = this.f37157n;
        if (linearLayout != null) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams3.topMargin = dimension;
            this.f37157n.setLayoutParams(layoutParams3);
        }
        ListView listView = this.G;
        if (listView != null) {
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) listView.getLayoutParams();
            layoutParams4.topMargin = dimension;
            this.G.setLayoutParams(layoutParams4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(CommonGameInfoBean commonGameInfoBean, View view) {
        IntentDateBean intentDataBean = commonGameInfoBean.getIntentDataBean();
        ExtBean extBean = intentDataBean.getExtBean();
        extBean.setRecPosition("22-99-1");
        extBean.setFrom("113");
        intentDataBean.setExtBean(extBean);
        IntentUtil.getInstance().intentActivity(this, intentDataBean);
        StatFactory.Companion.getInstance(this.f37152i).sendEvent(new StatFactory.VolcanoEvent(com.psk.eventmodule.Event.click, commonGameInfoBean.getG_info().getId(), new StatFactory.SpmData("wufun", "home", "搜索页", "1", false), commonGameInfoBean.getG_info().getPosition_path(), UtilsMy.l2(commonGameInfoBean.getG_info().getTag_id())));
    }

    private View M0(Context context, GameInfoBean gameInfoBean) {
        View inflate;
        View view = null;
        try {
            inflate = View.inflate(context, R.layout.forum_group_tag_item, null);
        } catch (Exception e5) {
            e = e5;
        }
        try {
            inflate.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            TextView textView = (TextView) inflate.findViewById(R.id.tagTv);
            if (textView == null) {
                return null;
            }
            textView.setBackgroundResource(R.drawable.search_history_tag_back);
            textView.setTextColor(Color.parseColor("#777777"));
            textView.setText(gameInfoBean.getGame_name());
            textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.wdp26));
            if (gameInfoBean.isThe_hot()) {
                Drawable drawable = getResources().getDrawable(R.drawable.icon_hot);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                textView.setCompoundDrawables(drawable, null, null, null);
                textView.setCompoundDrawablePadding(getResources().getDimensionPixelOffset(R.dimen.wdp8));
            } else if (gameInfoBean.isThe_score()) {
                Drawable drawable2 = getResources().getDrawable(R.drawable.icon_prise);
                drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
                textView.setCompoundDrawables(drawable2, null, null, null);
                textView.setCompoundDrawablePadding(getResources().getDimensionPixelOffset(R.dimen.wdp8));
            }
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.wdp14);
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.wdp16);
            textView.setPadding(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
            textView.setOnClickListener(new a(gameInfoBean));
            return inflate;
        } catch (Exception e6) {
            e = e6;
            view = inflate;
            e.printStackTrace();
            return view;
        }
    }

    private View N0(Context context, SearchAutoDataBean searchAutoDataBean) {
        View inflate;
        View view = null;
        try {
            inflate = View.inflate(context, R.layout.forum_group_tag_item, null);
        } catch (Exception e5) {
            e = e5;
        }
        try {
            inflate.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            TextView textView = (TextView) inflate.findViewById(R.id.tagTv);
            if (textView == null) {
                return null;
            }
            textView.setBackgroundResource(R.drawable.search_history_tag_back);
            textView.setTextColor(Color.parseColor("#777777"));
            textView.setText(searchAutoDataBean.getGame_name());
            textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.wdp26));
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.wdp14);
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.wdp24);
            textView.setPadding(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
            textView.setOnClickListener(new n(searchAutoDataBean));
            return inflate;
        } catch (Exception e6) {
            e = e6;
            view = inflate;
            e.printStackTrace();
            return view;
        }
    }

    private View O0(Context context, SearchGameZoneBean searchGameZoneBean) {
        View inflate;
        View view = null;
        try {
            inflate = View.inflate(context, R.layout.forum_group_tag_item, null);
        } catch (Exception e5) {
            e = e5;
        }
        try {
            inflate.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            TextView textView = (TextView) inflate.findViewById(R.id.tagTv);
            if (textView == null) {
                return null;
            }
            textView.setBackgroundResource(R.drawable.search_history_tag_back);
            textView.setTextColor(Color.parseColor("#777777"));
            textView.setText(searchGameZoneBean.getZone_name());
            textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.wdp26));
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.wdp14);
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.wdp16);
            textView.setPadding(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
            textView.setOnClickListener(new b(searchGameZoneBean));
            return inflate;
        } catch (Exception e6) {
            e = e6;
            view = inflate;
            e.printStackTrace();
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0(String str, String str2) {
        if (str != null) {
            try {
                if (TextUtils.isEmpty(str.trim())) {
                    return;
                }
                List<SearchRecordTable> d5 = b2.h0.n().d();
                if (d5 != null && d5.size() != 0) {
                    if (d5.size() > 100) {
                        b2.h0.n().delete((Collection) b2.h0.n().i(10L, d5.size(), "create_time", false));
                        return;
                    }
                    for (SearchRecordTable searchRecordTable : d5) {
                        if (searchRecordTable.getName().equals(str)) {
                            b2.h0.n().delete((b2.h0) searchRecordTable);
                        }
                    }
                    SearchRecordTable searchRecordTable2 = new SearchRecordTable();
                    searchRecordTable2.setName(str);
                    searchRecordTable2.setCreate_time(System.currentTimeMillis());
                    b2.h0.n().m(searchRecordTable2);
                    return;
                }
                SearchRecordTable searchRecordTable3 = new SearchRecordTable();
                searchRecordTable3.setName(str);
                searchRecordTable3.setCreate_time(System.currentTimeMillis());
                b2.h0.n().m(searchRecordTable3);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0(Event event, String str, String str2, String str3) {
        Ext ext = new Ext();
        ext.setIsJoin(str);
        ext.setReMarks(str3);
        Data data = new Data();
        data.setWhere(str2);
        com.papa.sim.statistic.p.l(this.f37152i).T1(event, ext, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(Event event, int i4) {
        SScrollingTxtBeanV2 sScrollingTxtBeanV2;
        ArrayList<SScrollingTxtBeanV2> arrayList = this.f37147d;
        if (arrayList == null || i4 >= arrayList.size() || (sScrollingTxtBeanV2 = this.f37147d.get(i4)) == null) {
            return;
        }
        if (Event.searchReturnExpGamePic.name().equals(event.name()) && sScrollingTxtBeanV2.isHasExposure()) {
            return;
        }
        sScrollingTxtBeanV2.setHasExposure(true);
        String str = null;
        if (sScrollingTxtBeanV2.getJumpModelDto() != null && sScrollingTxtBeanV2.getJumpModelDto().getG_info() != null) {
            str = sScrollingTxtBeanV2.getJumpModelDto().getG_info().getId();
        }
        Ext ext = new Ext();
        ext.setGameId(str);
        Data data = new Data();
        if (sScrollingTxtBeanV2.getJumpModelDto() != null) {
            data.setWhere(sScrollingTxtBeanV2.getJumpModelDto().getIntentDataBean().getLink_type_val());
        }
        com.papa.sim.statistic.p.l(this.f37152i).T1(event, ext, data);
    }

    private void Z0(SearchIndexData searchIndexData) {
        this.C1 = searchIndexData;
        this.D1.clear();
        this.D1.add(new FragmentPagerAdapter.a(this.A1[0], SearchRankingFragment.getInstance(1)));
        this.D1.add(new FragmentPagerAdapter.a(this.A1[1], SearchRankingFragment.getInstance(2)));
        this.D1.add(new FragmentPagerAdapter.a(this.A1[2], SearchRankingFragment.getInstance(3)));
        this.D1.add(new FragmentPagerAdapter.a(this.A1[3], SearchRankingFragment.getInstance(4)));
        this.f37168v1.notifyDataSetChanged();
        B0();
    }

    private List<CollectionBeanSubBusiness> h1(List<CollectionBeanSubBusiness> list) {
        for (CollectionBeanSubBusiness collectionBeanSubBusiness : list) {
            for (DownloadTask downloadTask : this.I1) {
                if (collectionBeanSubBusiness.getMod_info() != null) {
                    ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                    DownloadTask downloadTask2 = this.J1.get(mod_info.getMain_game_id());
                    boolean z4 = true;
                    boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                    DownloadTask downloadTask3 = this.J1.get(mod_info.getMod_game_id());
                    z4 = (downloadTask3 == null || downloadTask3.getStatus() != 5) ? false : false;
                    if (z4 && z5) {
                        if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                        }
                    } else if (z4) {
                        if (collectionBeanSubBusiness.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getMod_info().getMod_game_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                        }
                    } else if (z5) {
                        if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                        }
                    } else {
                        DownloadTask F = collectionBeanSubBusiness.getMod_info() != null ? p1.f.K().F(collectionBeanSubBusiness.getMod_info().getMod_game_id()) : null;
                        if (F == null) {
                            F = p1.f.K().F(collectionBeanSubBusiness.getCrc_sign_id());
                        }
                        if (F != null && downloadTask.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                        }
                    }
                } else if (collectionBeanSubBusiness.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                    collectionBeanSubBusiness.setDownloadTask(downloadTask);
                }
            }
        }
        return list;
    }

    private void receiveDelete(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.I1.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.J1.remove(next.getCrc_link_type_val());
                it2.remove();
                for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.E1) {
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        DownloadTask downloadTask2 = this.J1.get(collectionBeanSubBusiness.getMod_info().getMod_game_id());
                        DownloadTask downloadTask3 = this.J1.get(collectionBeanSubBusiness.getGame_id());
                        if (downloadTask2 == null && downloadTask3 == null) {
                            collectionBeanSubBusiness.setDownloadTask(null);
                        } else if (downloadTask2 != null) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask2);
                        } else if (downloadTask3 != null) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask3);
                        } else if (collectionBeanSubBusiness.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                            collectionBeanSubBusiness.setDownloadTask(null);
                        }
                    } else if (collectionBeanSubBusiness.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                        collectionBeanSubBusiness.setDownloadTask(null);
                    }
                }
            }
        }
        this.K.notifyDataSetChanged();
    }

    private void receiveError(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.J1;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            this.K.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        UtilsMy.B4(this.I1, downloadTask);
        if (!this.J1.containsKey(downloadTask.getCrc_link_type_val())) {
            this.I1.add(downloadTask);
            this.J1.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        updateDowStateList(downloadTask);
        this.K.notifyDataSetChanged();
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.J1;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.I1.add(downloadTask);
            Iterator<CollectionBeanSubBusiness> it2 = this.E1.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                CollectionBeanSubBusiness next = it2.next();
                if (next.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                    next.setDownloadTask(downloadTask);
                    break;
                }
            }
            this.J1.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        DownloadTask downloadTask2 = this.J1.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        this.K.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(TabLayout.Tab tab) {
        if (this.f37172z.getTabCount() == 0) {
            return;
        }
        for (int i4 = 0; i4 < this.f37172z.getTabCount(); i4++) {
            View customView = this.f37172z.getTabAt(i4).getCustomView();
            if (customView != null) {
                if (i4 == tab.getPosition()) {
                    customView.findViewById(R.id.iv).setVisibility(0);
                    TextView textView = (TextView) customView.findViewById(R.id.f15618tv);
                    textView.setTextColor(-16777216);
                    textView.setTypeface(null, 1);
                    textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp32));
                } else {
                    customView.findViewById(R.id.iv).setVisibility(4);
                    TextView textView2 = (TextView) customView.findViewById(R.id.f15618tv);
                    textView2.setTextColor(Color.parseColor("#535353"));
                    textView2.setTypeface(null, 0);
                    textView2.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp28));
                }
            }
        }
    }

    private void updateDowStateList(DownloadTask downloadTask) {
        try {
            for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.E1) {
                if (collectionBeanSubBusiness.getMod_info() != null) {
                    ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                    DownloadTask downloadTask2 = this.J1.get(mod_info.getMain_game_id());
                    boolean z4 = true;
                    boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                    DownloadTask downloadTask3 = this.J1.get(mod_info.getMod_game_id());
                    if (downloadTask3 == null || downloadTask3.getStatus() != 5) {
                        z4 = false;
                    }
                    if (z4 && z5) {
                        if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    } else if (z4) {
                        if (collectionBeanSubBusiness.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getMod_info().getMod_game_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    } else if (z5) {
                        if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    } else {
                        DownloadTask F = collectionBeanSubBusiness.getMod_info() != null ? p1.f.K().F(collectionBeanSubBusiness.getMod_info().getMod_game_id()) : null;
                        if (F == null) {
                            F = p1.f.K().F(collectionBeanSubBusiness.getCrc_sign_id());
                        }
                        if (F != null && downloadTask.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    }
                } else if (collectionBeanSubBusiness.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                    collectionBeanSubBusiness.setDownloadTask(downloadTask);
                    return;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void updateProgressPartly() {
        DownloadTask downloadTask;
        for (int i4 = this.H1; i4 <= this.G1 && !(this.G.getItemAtPosition(i4) instanceof SearchAutoDataBean); i4++) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) this.G.getItemAtPosition(i4);
            if (collectionBeanSubBusiness != null && (downloadTask = collectionBeanSubBusiness.getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                View childAt = this.G.getChildAt(i4 - this.H1);
                if (childAt.getTag() instanceof t) {
                    t tVar = (t) childAt.getTag();
                    try {
                        DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                        if (f5 == null) {
                            return;
                        }
                        long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                        if (downloadTask.getSize() == 0) {
                            TextView textView = tVar.f37232j;
                            textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        } else {
                            TextView textView2 = tVar.f37232j;
                            textView2.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        }
                        if (downloadTask.getStatus() == 12) {
                            tVar.f37236n.setProgress((int) f5.getProgress());
                        } else {
                            tVar.f37235m.setProgress((int) f5.getProgress());
                        }
                        if (downloadTask.getStatus() == 2) {
                            TextView textView3 = tVar.f37234l;
                            textView3.setText(f5.getSpeed() + "/S");
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void A0(String str, int i4) {
        if (i4 == 0) {
            t0(str);
        } else if (i4 != 1) {
        } else {
            w0();
        }
    }

    public void C0(String str, String str2) {
        D0(str, str2, 1);
    }

    public void D0(String str, String str2, int i4) {
        T0(str, "");
        this.f37153j.setText("");
        o0();
        if (com.join.mgps.Util.g2.i(str2)) {
            SearchListActivity1_.d1(this.f37152i).e(str).d(this.V).a(0).c(str2).b(i4).start();
        } else if (this.f37146c == 1) {
            SearchListActivity1_.d1(this.f37152i).e(str).d(this.V).a(2).b(i4).start();
        } else {
            SearchListActivity1_.d1(this.f37152i).e(str).d(this.V).b(i4).start();
        }
        if (!TextUtils.isEmpty(str)) {
            com.papa.sim.statistic.p.l(this.f37152i).l1(Event.clickSearchButton, str, null);
        }
        a1();
    }

    void E0() {
        o2.a.b(this.f37153j);
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void F0() {
        try {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
            finish();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void G0() {
        ArrayList<SScrollingTxtBeanV2> arrayList;
        if (this.f37153j.getText().length() > 0) {
            C0(this.f37153j.getText().toString(), "");
        } else if (!TextUtils.isEmpty(this.f37145b)) {
            C0(this.f37145b, "");
        } else if (this.f37151h == null || (arrayList = this.f37147d) == null || arrayList.size() <= 0) {
        } else {
            int currentItem = this.f37151h.getCurrentItem();
            ArrayList<SScrollingTxtBeanV2> arrayList2 = this.f37147d;
            C0(arrayList2.get(currentItem % arrayList2.size()).getWord(), "");
        }
    }

    void K0() {
        m0(1);
        u0();
        l1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void L0() {
        SearchIndexData searchIndexData;
        String d5 = this.f37161p1.searchHintCache().d();
        if (TextUtils.isEmpty(d5) || (searchIndexData = (SearchIndexData) com.papa.sim.statistic.JsonMapper.e().fromJson(d5, SearchIndexData.class)) == null) {
            return;
        }
        if (searchIndexData.getHot_search_ranking() == null && searchIndexData.getSearch_key() == null) {
            return;
        }
        i1(searchIndexData, false);
        l1();
        m0(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void P0() {
        com.join.android.app.common.manager.a.h().j(this.f37152i, this.Q, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Q0() {
        this.K.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.broadcast.bespeak.sussess"})
    public void R0(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("gameid");
            int intExtra = intent.getIntExtra("game_book", 0);
            String stringExtra2 = intent.getStringExtra("message");
            DomainInfoBean domainInfoBean = (DomainInfoBean) intent.getSerializableExtra("pd_info");
            g1(stringExtra, intExtra);
            if (intExtra == 1) {
                if (domainInfoBean != null) {
                    UtilsMy.h4(this.f37152i, domainInfoBean.getInfo(), "game_search_subscribe");
                }
                com.join.mgps.Util.b0.f0(this.f37152i).J(this.f37152i, domainInfoBean, stringExtra2);
            }
        }
    }

    void S0() {
        this.f37153j.requestFocus();
        this.f37153j.requestFocusFromTouch();
        o2.a.c(this.f37153j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void U0() {
        this.f37153j.setText("");
        l1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @EditorAction
    public boolean V0(TextView textView, int i4, KeyEvent keyEvent) {
        if (i4 == 6) {
            t0(this.f37153j.getText().toString());
            T0(this.f37153j.getText().toString(), "");
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Y0(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void a1() {
        com.join.mgps.Util.w0.e("showHint", "keyword=" + this.f37153j.getText().toString());
        if (K1) {
            return;
        }
        String obj = this.f37153j.getText().toString();
        if (TextUtils.isEmpty(obj) && TextUtils.isEmpty(obj.trim())) {
            this.f37158o.setVisibility(0);
            this.G.setVisibility(8);
            this.f37157n.setVisibility(8);
            n0(0);
            return;
        }
        this.f37158o.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    @TargetApi(12)
    public void afterViews() {
        ArrayList<SScrollingTxtBeanV2> arrayList;
        this.P = com.join.mgps.rpc.impl.d.P1();
        com.join.mgps.Util.d0.a().d(this);
        I0();
        ArrayList<SScrollingTxtBeanV2> arrayList2 = this.f37147d;
        if ((arrayList2 == null || arrayList2.size() <= 0) && (arrayList = MApplication.G1) != null && arrayList.size() > 0) {
            this.f37147d = MApplication.G1;
        }
        if (this.f37146c == 4) {
            K1 = true;
        }
        if (this.f37148e <= 0) {
            this.f37148e = MApplication.H1;
        }
        if (this.f37148e < 1) {
            this.f37148e = 1;
        }
        List<DownloadTask> d5 = p1.f.K().d();
        this.I1 = d5;
        if (d5 != null && d5.size() > 0) {
            for (DownloadTask downloadTask : this.I1) {
                this.J1.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        try {
            this.f37152i = this;
            this.f37153j.setOnFocusChangeListener(new f());
            this.f37153j.setOnKeyListener(new g());
            this.f37153j.addTextChangedListener(new h());
            if (this.W == null) {
                this.W = new q();
            }
            this.f37159p.setAdapter((ListAdapter) this.W);
            if (this.X == null) {
                this.X = new p();
            }
            this.f37162q.setAdapter((ListAdapter) this.X);
            this.I = new ArrayList();
            r rVar = new r(this.f37152i, this.I);
            this.K = rVar;
            this.G.setAdapter((ListAdapter) rVar);
            this.G.setOnScrollListener(this);
            this.G.setOnItemClickListener(new i());
            this.O = new ArrayList<>();
            this.J = new ArrayList();
            ArrayList<SScrollingTxtBeanV2> arrayList3 = this.f37147d;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                if (!TextUtils.isEmpty(this.f37145b)) {
                    this.Z = this.f37145b;
                }
                EditText editText = this.f37153j;
                editText.setHint(" " + this.Z);
            }
            U0();
            FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager(), this.D1);
            this.f37168v1 = fragmentPagerAdapter;
            this.f37171y.setAdapter(fragmentPagerAdapter);
            this.f37172z.setupWithViewPager(this.f37171y);
            this.f37171y.addOnPageChangeListener(new j());
            B0();
            this.f37172z.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new k());
            L0();
            K0();
            if (K1) {
                b1();
                c1();
            } else {
                o0();
            }
            H0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.papa.sim.statistic.p.l(this.f37152i).O1(Event.visitTopSearchPage, new Ext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void b1() {
        com.join.mgps.Util.w0.e("showHistory", "keyword=" + this.f37153j.getText().toString());
        this.f37158o.setVisibility(8);
        this.G.setVisibility(8);
        ArrayList<String> arrayList = this.O;
        if (arrayList != null && arrayList.size() > 0) {
            this.f37157n.setVisibility(0);
        } else {
            this.f37157n.setVisibility(8);
        }
        if (this.f37153j.hasFocus()) {
            this.f37153j.setHint("");
        }
        n0(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 300)
    public void c1() {
        this.f37153j.setText("");
        this.f37155l.setVisibility(8);
        S0();
        K1 = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void d1() {
        com.join.mgps.Util.w0.e("showRecommend", "keyword=" + this.f37153j.getText().toString());
        this.f37158o.setVisibility(8);
        this.G.setVisibility(0);
        this.f37157n.setVisibility(8);
        n0(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void e1() {
        ArrayList<SScrollingTxtBeanV2> arrayList;
        if (this.f37153j.getText().length() > 0) {
            C0(this.f37153j.getText().toString(), "");
        } else if (!TextUtils.isEmpty(this.f37145b)) {
            C0(this.f37145b, "");
        } else if (this.f37151h == null || (arrayList = this.f37147d) == null || arrayList.size() <= 0) {
        } else {
            int currentItem = this.f37151h.getCurrentItem();
            ArrayList<SScrollingTxtBeanV2> arrayList2 = this.f37147d;
            C0(arrayList2.get(currentItem % arrayList2.size()).getWord(), "");
        }
    }

    void f1(List<SearchAutoDataBean> list, int i4) {
        ResponseModel<SearchAutoData> responseModel;
        this.I.clear();
        boolean z4 = false;
        if (i4 == 0 && (responseModel = this.L) != null && responseModel.getData() != null && this.L.getData().getGame_list() != null) {
            this.E1.clear();
            for (CollectionBeanSub collectionBeanSub : this.L.getData().getGame_list()) {
                collectionBeanSub.set_from(103);
                collectionBeanSub.set_from_type(112);
                collectionBeanSub.setReMarks("0");
                CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(collectionBeanSub);
                this.I.add(collectionBeanSubBusiness);
                this.E1.add(collectionBeanSubBusiness);
            }
            SearchAutoAdData ad_info = this.L.getData().getAd_info();
            if (ad_info != null) {
                if (ad_info.getFirstAd() != null) {
                    CommonGameInfoBean firstAd = ad_info.getFirstAd();
                    firstAd.setAdInfo(false);
                    this.I.add(firstAd);
                    W0(Event.searchThinkAdWordExp, "1", firstAd.getIntentDataBean().getLink_type_val(), firstAd.getTitle());
                }
                if (ad_info.getSecondAd() != null) {
                    CommonGameInfoBean secondAd = ad_info.getSecondAd();
                    secondAd.setAdInfo(true);
                    this.I.add(secondAd);
                    W0(Event.searchThinkAdWordExp, "2", secondAd.getIntentDataBean().getLink_type_val(), secondAd.getTitle());
                }
            }
            h1(this.E1);
        }
        if (list != null && list.size() > 0) {
            this.I.addAll(list);
        }
        List<Object> list2 = this.I;
        this.V = (list2 == null || list2.size() <= 0) ? true : true;
        this.K.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g1(String str, int i4) {
        if (com.join.mgps.Util.g2.h(str)) {
            return;
        }
        Iterator<Object> it2 = this.I.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof CollectionBeanSubBusiness) {
                CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) next;
                if (str.equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                    collectionBeanSubBusiness.setGame_book(i4);
                    break;
                }
            }
        }
        r rVar = this.K;
        if (rVar != null) {
            rVar.notifyDataSetChanged();
        }
    }

    public CommonRequestBean getRequestBean(int i4) {
        return RequestBeanUtil.getInstance(this.f37152i).getSearchRecommendBean(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i1(SearchIndexData searchIndexData, boolean z4) {
        SearchIndexData searchIndexData2;
        View O0;
        if (searchIndexData == null) {
            return;
        }
        this.f37161p1.searchHintCache().g(com.papa.sim.statistic.JsonMapper.e().toJson(searchIndexData));
        if (com.join.mgps.Util.g2.i(searchIndexData.getSearch_key())) {
            this.B1 = searchIndexData.getSearch_key();
            EditText editText = this.f37153j;
            editText.setHint(" " + this.B1);
        }
        a1();
        if (searchIndexData.getAd_info_v2() != null && searchIndexData.getAd_info_v2().getAd_switch().intValue() == 1) {
            this.f37167v.setVisibility(0);
            final CommonGameInfoBean ad_info_v2 = searchIndexData.getAd_info_v2();
            MyImageLoader.p(this.f37169w, ad_info_v2.getBig_pic(), r.c.f11300g);
            this.f37169w.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.s2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchHintActivity.this.J0(ad_info_v2, view);
                }
            });
            if (z4) {
                StatFactory.Companion.getInstance(this.f37152i).sendEvent(new StatFactory.VolcanoEvent(com.psk.eventmodule.Event.exposure, ad_info_v2.getG_info().getId(), new StatFactory.SpmData("wufun", "home", "搜索页", "1", false), ad_info_v2.getG_info().getPosition_path(), UtilsMy.l2(ad_info_v2.getG_info().getTag_id())));
            }
        }
        List<SearchGameZoneBean> arrayList = new ArrayList<>();
        List<GameInfoBean> arrayList2 = new ArrayList<>();
        if ((searchIndexData.getGuess_you_like_info() != null && searchIndexData.getGuess_you_like_info().size() > 0) || (searchIndexData.getGame_zone_entry() != null && searchIndexData.getGame_zone_entry().size() > 0)) {
            arrayList = searchIndexData.getGame_zone_entry();
            arrayList2 = searchIndexData.getGuess_you_like_info();
            this.f37161p1.searchguesslikeData().g(com.papa.sim.statistic.JsonMapper.e().toJson(searchIndexData));
        } else {
            String d5 = this.f37161p1.searchguesslikeData().d();
            if (com.join.mgps.Util.g2.i(d5) && (searchIndexData2 = (SearchIndexData) com.papa.sim.statistic.JsonMapper.e().fromJson(d5, SearchIndexData.class)) != null) {
                arrayList = searchIndexData2.getGame_zone_entry();
                arrayList2 = searchIndexData2.getGuess_you_like_info();
            }
        }
        if ((arrayList != null && arrayList.size() > 0) || (arrayList2 != null && arrayList2.size() > 0)) {
            this.C.setVisibility(0);
            this.B.removeAllViews();
            if (arrayList != null && arrayList.size() > 0 && (O0 = O0(this, arrayList.get(0))) != null) {
                this.B.addView(O0);
            }
            if (arrayList2 != null) {
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    View M0 = M0(this, arrayList2.get(i4));
                    if (M0 != null) {
                        this.B.addView(M0);
                    }
                }
            }
            if (arrayList != null && arrayList.size() > 1) {
                for (int i5 = 1; i5 < arrayList.size(); i5++) {
                    View O02 = O0(this, arrayList.get(i5));
                    if (O02 != null) {
                        this.B.addView(O02);
                    }
                }
            }
            this.B.setHorizontalDivider(getResources().getDimensionPixelOffset(R.dimen.wdp30));
            this.B.setVerticalDivider(getResources().getDimensionPixelOffset(R.dimen.wdp18));
        } else {
            this.B.removeAllViews();
            this.C.setVisibility(8);
        }
        Z0(searchIndexData);
    }

    void j1(List<SearchAutoDataBean> list) {
        this.J.clear();
        this.E1.clear();
        if (list != null) {
            this.J.addAll(list);
        }
        this.A.removeAllViews();
        try {
            FlowLayout flowLayout = this.A;
            flowLayout.setHorizontalDivider(flowLayout.getResources().getDimensionPixelOffset(R.dimen.wdp30));
            FlowLayout flowLayout2 = this.A;
            flowLayout2.setVerticalDivider(flowLayout2.getResources().getDimensionPixelOffset(R.dimen.wdp18));
            this.A.setNumberRows(3);
            for (int i4 = 0; i4 < this.J.size(); i4++) {
                View N0 = N0(this, this.J.get(i4));
                if (N0 != null) {
                    this.A.addView(N0);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k1(List<SearchAutoDataBean> list, int i4) {
        if (i4 == 0) {
            this.F1 = false;
            f1(list, 0);
        } else if (i4 != 1) {
        } else {
            this.F1 = true;
            j1(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l1() {
        String obj = this.f37153j.getText().toString();
        if (obj.length() > 0) {
            d1();
            t0(obj);
            this.f37155l.setVisibility(0);
        } else if (this.G.getVisibility() == 0 && this.F1) {
        } else {
            if (com.join.mgps.Util.g2.i(this.B1)) {
                this.f37153j.setHint("");
                a1();
                EditText editText = this.f37153j;
                editText.setHint(" " + this.B1);
            }
            if (this.f37153j.hasFocus()) {
                w0();
            } else {
                this.f37155l.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0(int i4) {
        ForumLoadingView forumLoadingView = this.f37149f;
        if (forumLoadingView == null) {
            return;
        }
        if (i4 == 1) {
            forumLoadingView.j(1);
        } else if (i4 == 2) {
            forumLoadingView.j(2);
            l1();
        } else if (i4 == 4) {
            forumLoadingView.j(4);
        } else if (i4 == 16) {
            forumLoadingView.setFailedMsg("加载失败，再试试吧~");
            ForumLoadingView forumLoadingView2 = this.f37149f;
            forumLoadingView2.setListener(new e(forumLoadingView2));
            this.f37149f.j(16);
        } else if (i4 == 9) {
            forumLoadingView.setListener(new c(forumLoadingView));
            this.f37149f.j(9);
        } else if (i4 != 10) {
        } else {
            forumLoadingView.setFailedMsg("没有更多内容哦~");
            ForumLoadingView forumLoadingView3 = this.f37149f;
            forumLoadingView3.setListener(new d(forumLoadingView3));
            this.f37149f.setReloadingVisibility(0);
            this.f37149f.j(10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0(int i4) {
        this.f37156m.setImageResource(i4 == 0 ? R.drawable.ic_introduction_back_white : R.drawable.back_icon);
        this.D.setBackgroundResource(i4 == 0 ? 0 : R.drawable.papa_title_back);
        this.E.setBackgroundResource(i4 == 0 ? R.drawable.search_context_bg_v2 : R.drawable.search_context_bg);
        this.f37153j.setTextColor(i4 == 0 ? -1 : Color.parseColor("#8A8A8A"));
        this.f37153j.setHintTextColor(i4 == 0 ? -1 : Color.parseColor("#8A8A8A"));
        this.F.setTextColor(i4 != 0 ? Color.parseColor("#AAAAAA") : -1);
    }

    void o0() {
        this.f37153j.clearFocus();
        this.f37150g.setFocusable(true);
        this.f37150g.setFocusableInTouchMode(true);
        this.f37150g.requestFocus();
        this.f37150g.requestFocusFromTouch();
        E0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.Util.d0.a().e(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            updateUI(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    updateUI(a5, 6);
                    return;
                } else if (c5 == 7) {
                    updateUI(a5, 3);
                    return;
                } else if (c5 == 8) {
                    updateProgressPartly();
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            updateUI(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            updateUI(a5, 8);
                            return;
                        case 13:
                            updateUI(a5, 9);
                            return;
                        default:
                            return;
                    }
                }
            }
            updateUI(a5, 5);
        } else {
            updateUI(a5, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Banner banner = this.f37170x;
        if (banner != null) {
            banner.q(false);
        }
        o2.a.b(this.f37153j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        EditText editText;
        super.onResume();
        if (this.f37170x != null && (editText = this.f37153j) != null && editText.hasFocus()) {
            this.f37170x.q(true);
        }
        UtilsMy.q4(this);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.G1 = (i5 + i4) - 1;
        this.H1 = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void p0() {
        b2.h0.n().a();
        l1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void q0() {
        ArrayList<String> arrayList = this.O;
        if (arrayList != null) {
            arrayList.clear();
        }
        p0();
        a1();
    }

    void r0(String str) {
        try {
            List<SearchRecordTable> d5 = b2.h0.n().d();
            if (d5 == null && d5.size() == 0) {
                return;
            }
            for (SearchRecordTable searchRecordTable : d5) {
                if (searchRecordTable.getName().equals(str)) {
                    b2.h0.n().delete((b2.h0) searchRecordTable);
                    return;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    IntentDateBean s0(IntentDateBean intentDateBean) {
        ExtBean extBean = intentDateBean.getExtBean();
        if (extBean == null) {
            extBean = new ExtBean();
        }
        extBean.setFrom("112");
        EditText editText = this.f37153j;
        if (editText != null) {
            extBean.setLocation(editText.getText().toString());
            extBean.setWhere(this.f37153j.getText().toString());
        }
        intentDateBean.setExtBean(extBean);
        return intentDateBean;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void serverConnectionException() {
        com.join.android.app.common.manager.a.h().j(this.f37152i, this.R, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void t0(String str) {
        if (com.join.android.app.common.utils.j.j(this.f37152i)) {
            ArrayList arrayList = new ArrayList();
            try {
                try {
                    RequestModel<RequestKeywordArgs> requestModel = new RequestModel<>();
                    requestModel.setDefault(this.f37152i);
                    requestModel.setArgs(new RequestKeywordArgs(str, this.M, this.N, 0, 0));
                    ResponseModel<SearchAutoData> body = com.join.mgps.rpc.impl.i.E0().B0().u1(requestModel).execute().body();
                    this.L = body;
                    k1(body.getData().getSearch_list(), 0);
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    serverConnectionException();
                    k1(arrayList, 0);
                    return;
                }
            } catch (Throwable th) {
                k1(arrayList, 0);
                throw th;
            }
        }
        P0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void u0() {
        if (com.join.android.app.common.utils.j.j(this.f37152i)) {
            try {
                RequestModel<RequestUidtagidTagdes> requestModel = new RequestModel<>();
                requestModel.setDefault(this.f37152i);
                RequestUidtagidTagdes requestUidtagidTagdes = new RequestUidtagidTagdes();
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f37152i).getAccountData();
                requestUidtagidTagdes.setUid(accountData.getUid());
                requestUidtagidTagdes.setToken(accountData.getToken());
                requestModel.setArgs(requestUidtagidTagdes);
                ResponseModel<SearchIndexData> body = com.join.mgps.rpc.impl.i.E0().B0().t1(requestModel).execute().body();
                this.Y = body;
                SearchIndexData data = body.getData();
                if (data != null && (data.getHot_search_ranking() != null || data.getSearch_key() != null)) {
                    i1(data, true);
                    l1();
                    m0(2);
                    return;
                }
                m0(4);
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                serverConnectionException();
                m0(4);
                return;
            }
        }
        P0();
        m0(9);
    }

    void updateUI(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    receiveStart(downloadTask);
                    break;
                case 3:
                    receiveDelete(downloadTask);
                    break;
                case 5:
                    receiveSuccess(downloadTask);
                    break;
                case 6:
                    receiveError(downloadTask);
                    break;
            }
        }
        this.K.notifyDataSetChanged();
    }

    public CommonRequestBean v0() {
        String uid = AccountUtil_.getInstance_(this.f37152i).getUid();
        return RequestBeanUtil.getInstance(this.f37152i).getSearchPageRequestBean(Integer.parseInt(uid), AccountUtil_.getInstance_(this.f37152i).getToken());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void w0() {
        try {
            ArrayList arrayList = new ArrayList();
            List<SearchRecordTable> i4 = b2.h0.n().i(0L, 20, "create_time", false);
            if (this.O == null) {
                this.O = new ArrayList<>();
            }
            this.O.clear();
            for (SearchRecordTable searchRecordTable : i4) {
                this.O.add(searchRecordTable.getName());
            }
            Q0();
            if (this.O.size() > 0) {
                for (int i5 = 0; i5 < this.O.size(); i5++) {
                    SearchAutoDataBean searchAutoDataBean = new SearchAutoDataBean();
                    if (i5 >= this.O.size()) {
                        break;
                    }
                    searchAutoDataBean.setGame_name(this.O.get(i5));
                    searchAutoDataBean.setCrc_sign_id("");
                    searchAutoDataBean.setIsHistory(true);
                    arrayList.add(searchAutoDataBean);
                }
                b1();
                k1(arrayList, 1);
                return;
            }
            a1();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public SearchHotAdInfo x0(int i4) {
        SearchIndexData searchIndexData = this.C1;
        if (searchIndexData == null || i4 != 1) {
            return null;
        }
        return searchIndexData.getHot_search_ad_info();
    }

    public List<GameInfoBean> y0(int i4) {
        SearchIndexData searchIndexData = this.C1;
        if (searchIndexData != null) {
            if (i4 == 1) {
                return searchIndexData.getHot_search_ranking();
            }
            if (i4 == 2) {
                return searchIndexData.getNet_search_ranking();
            }
            if (i4 == 3) {
                return searchIndexData.getSimulator_search_ranking();
            }
            if (i4 == 4) {
                return searchIndexData.getStandalone_search_ranking();
            }
        }
        return new ArrayList();
    }

    public CommonRequestBean z0(String str) {
        return RequestBeanUtil.getInstance(this.f37152i).getSearchAutoRequestBean("searchAuto", str, this.M, this.N, 0, 0);
    }

    /* loaded from: classes4.dex */
    public class r extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private Context f37208b;

        /* renamed from: c  reason: collision with root package name */
        private LayoutInflater f37209c;

        /* renamed from: d  reason: collision with root package name */
        private List<Object> f37210d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37212b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ SearchAutoDataBean f37213c;

            a(String str, SearchAutoDataBean searchAutoDataBean) {
                this.f37212b = str;
                this.f37213c = searchAutoDataBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SearchHintActivity.this.r0(this.f37212b);
                r.this.f37210d.remove(this.f37213c);
                r.this.notifyDataSetChanged();
            }
        }

        /* loaded from: classes4.dex */
        public class b {

            /* renamed from: a  reason: collision with root package name */
            public TextView f37215a;

            public b() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes4.dex */
        public class c {

            /* renamed from: a  reason: collision with root package name */
            public ImageView f37217a;

            /* renamed from: b  reason: collision with root package name */
            public ImageView f37218b;

            /* renamed from: c  reason: collision with root package name */
            public View f37219c;

            /* renamed from: d  reason: collision with root package name */
            public TextView f37220d;

            private c() {
            }

            /* synthetic */ c(r rVar, f fVar) {
                this();
            }
        }

        public r(Context context) {
            this.f37208b = context;
        }

        public View b(int i4, View view, ViewGroup viewGroup) {
            b bVar;
            if (view == null) {
                view = this.f37209c.inflate(R.layout.simple_listview_item2, (ViewGroup) null);
                bVar = new b();
                bVar.f37215a = (TextView) view.findViewById(R.id.lv_tv_title);
                view.setTag(bVar);
            } else {
                bVar = (b) view.getTag();
            }
            bVar.f37215a.setText(((CommonGameInfoBean) this.f37210d.get(i4)).getTitle());
            return view;
        }

        public View c(int i4, View view, ViewGroup viewGroup) {
            c cVar;
            if (view == null) {
                view = this.f37209c.inflate(R.layout.simple_listview_item1, (ViewGroup) null);
                cVar = new c(this, null);
                cVar.f37220d = (TextView) view.findViewById(R.id.lv_tv_title);
                cVar.f37218b = (ImageView) view.findViewById(R.id.dotHistory);
                cVar.f37219c = view.findViewById(R.id.rlClearHistory);
                view.setTag(cVar);
            } else {
                cVar = (c) view.getTag();
            }
            SearchAutoDataBean searchAutoDataBean = (SearchAutoDataBean) this.f37210d.get(i4);
            String game_name = searchAutoDataBean.getGame_name();
            String obj = SearchHintActivity.this.f37153j.getText().toString();
            TextView textView = cVar.f37220d;
            textView.setText(Html.fromHtml(game_name.replace(obj, "<font color=#f47500>" + obj + "</font>")), TextView.BufferType.SPANNABLE);
            if (searchAutoDataBean.getIsHistory()) {
                if (cVar.f37218b.getVisibility() != 0) {
                    cVar.f37218b.setVisibility(0);
                }
                if (cVar.f37219c.getVisibility() != 0) {
                    cVar.f37219c.setVisibility(0);
                }
                cVar.f37219c.setOnClickListener(new a(game_name, searchAutoDataBean));
            } else if (cVar.f37219c.getVisibility() != 8) {
                cVar.f37219c.setVisibility(8);
            }
            return view;
        }

        public View d(int i4, View view, ViewGroup viewGroup) {
            t tVar;
            View view2;
            if (view == null) {
                View inflate = this.f37209c.inflate(R.layout.searchauto_app_listview_item, (ViewGroup) null);
                t tVar2 = new t();
                tVar2.f37223a = (SimpleDraweeView) inflate.findViewById(R.id.mgListviewItemIcon);
                tVar2.f37224b = (ImageView) inflate.findViewById(R.id.giftPackageSwich);
                tVar2.f37225c = (TextView) inflate.findViewById(R.id.mgListviewItemAppname);
                tVar2.f37226d = (RelativeLayout) inflate.findViewById(R.id.rLayoutRight);
                tVar2.f37227e = (TextView) inflate.findViewById(R.id.mgListviewItemInstall);
                tVar2.f37229g = (TextView) inflate.findViewById(R.id.mgListviewItemDescribe);
                tVar2.f37230h = (LinearLayout) inflate.findViewById(R.id.linearLayout2);
                tVar2.f37231i = (LinearLayout) inflate.findViewById(R.id.tipsLayout);
                tVar2.f37233k = (TextView) inflate.findViewById(R.id.tipSText);
                tVar2.f37232j = (TextView) inflate.findViewById(R.id.appSize);
                tVar2.f37234l = (TextView) inflate.findViewById(R.id.loding_info);
                tVar2.f37235m = (ProgressBar) inflate.findViewById(R.id.progressBar);
                tVar2.f37236n = (ProgressBar) inflate.findViewById(R.id.progressBarZip);
                tVar2.f37228f = inflate.findViewById(R.id.line);
                inflate.setTag(tVar2);
                tVar = tVar2;
                view2 = inflate;
            } else {
                tVar = (t) view.getTag();
                view2 = view;
            }
            CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) this.f37210d.get(i4);
            DownloadTask downloadTask = collectionBeanSubBusiness.getDownloadTask();
            if (collectionBeanSubBusiness.getGift_package_switch() != 1) {
                tVar.f37224b.setVisibility(8);
            }
            tVar.f37225c.setText(collectionBeanSubBusiness.getGame_name());
            tVar.f37229g.setText(collectionBeanSubBusiness.getInfo());
            long parseDouble = (long) (Double.parseDouble(collectionBeanSubBusiness.getSize()) * 1024.0d * 1024.0d);
            MyImageLoader.h(tVar.f37223a, collectionBeanSubBusiness.getIco_remote().trim());
            collectionBeanSubBusiness.getTag_info();
            TextView textView = tVar.f37233k;
            textView.setText(collectionBeanSubBusiness.getSp_tag_info().getModel().getName() + " · " + UtilsMy.J2(parseDouble));
            if (collectionBeanSubBusiness.isCpsGame() && com.join.mgps.Util.s0.c() && com.join.mgps.Util.s0.a(collectionBeanSubBusiness.getTag_info())) {
                tVar.f37227e.setBackgroundResource(R.drawable.recom_maincolor_butn);
                tVar.f37227e.setText(this.f37208b.getResources().getString(R.string.download_status_finished));
                tVar.f37227e.setTextColor(this.f37208b.getResources().getColor(R.color.app_main_color));
            } else {
                String plugin_num = collectionBeanSubBusiness.getPlugin_num();
                if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                    tVar.f37227e.setBackgroundResource(R.drawable.recom_blue_butn);
                    tVar.f37227e.setText("开始");
                    tVar.f37227e.setTextColor(this.f37208b.getResources().getColor(R.color.app_blue_color));
                    tVar.f37231i.setVisibility(8);
                    tVar.f37224b.setVisibility(8);
                } else if (downloadTask == null) {
                    e(tVar, Boolean.TRUE, Boolean.FALSE);
                    if (UtilsMy.o0(collectionBeanSubBusiness.getTag_info())) {
                        boolean d5 = com.join.android.app.common.utils.e.l0(this.f37208b).d(this.f37208b, collectionBeanSubBusiness.getPackage_name());
                        if (UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id()) > 0) {
                            d5 = false;
                        }
                        if (d5) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f37208b).l(this.f37208b, collectionBeanSubBusiness.getPackage_name());
                            if (com.join.mgps.Util.g2.i(collectionBeanSubBusiness.getVer()) && l4.d() < Integer.parseInt(collectionBeanSubBusiness.getVer())) {
                                tVar.f37227e.setBackgroundResource(R.drawable.recom_green_butn);
                                tVar.f37227e.setText("更新");
                                tVar.f37227e.setTextColor(-9263087);
                            } else {
                                tVar.f37227e.setBackgroundResource(R.drawable.recom_maincolor_butn);
                                tVar.f37227e.setText(this.f37208b.getResources().getString(R.string.download_status_finished));
                                tVar.f37227e.setTextColor(-688602);
                            }
                        } else {
                            tVar.f37227e.setBackgroundResource(R.drawable.recom_green_butn);
                            UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
                            UtilsMy.Z2(tVar.f37227e, tVar.f37226d, collectionBeanSubBusiness);
                        }
                    } else {
                        tVar.f37227e.setBackgroundResource(R.drawable.recom_green_butn);
                        UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
                        UtilsMy.Z2(tVar.f37227e, tVar.f37226d, collectionBeanSubBusiness);
                    }
                } else {
                    int status = downloadTask.getStatus();
                    if (UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id()) > 0) {
                        status = 43;
                    }
                    if (status != 0) {
                        if (status == 27) {
                            tVar.f37227e.setText("暂停中");
                        } else if (status == 48) {
                            tVar.f37227e.setBackgroundResource(R.drawable.recom_blue_butn);
                            tVar.f37227e.setText("安装中");
                            tVar.f37227e.setTextColor(this.f37208b.getResources().getColor(R.color.app_blue_color));
                            e(tVar, Boolean.TRUE, Boolean.FALSE);
                        } else if (status != 2) {
                            if (status != 3) {
                                if (status != 5) {
                                    if (status != 6) {
                                        if (status != 7) {
                                            if (status != 42) {
                                                if (status != 43) {
                                                    switch (status) {
                                                        case 9:
                                                            tVar.f37227e.setBackgroundResource(R.drawable.recom_green_butn);
                                                            tVar.f37227e.setText("更新");
                                                            tVar.f37227e.setTextColor(this.f37208b.getResources().getColor(R.color.app_green_color));
                                                            e(tVar, Boolean.TRUE, Boolean.FALSE);
                                                            break;
                                                        case 10:
                                                            tVar.f37227e.setBackgroundResource(R.drawable.recom_blue_butn);
                                                            tVar.f37227e.setText("等待");
                                                            tVar.f37227e.setTextColor(this.f37208b.getResources().getColor(R.color.app_blue_color));
                                                            Boolean bool = Boolean.FALSE;
                                                            e(tVar, bool, bool);
                                                            TextView textView2 = tVar.f37232j;
                                                            textView2.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                            try {
                                                                tVar.f37235m.setProgress((int) downloadTask.getProgress());
                                                            } catch (Exception e5) {
                                                                e5.printStackTrace();
                                                            }
                                                            tVar.f37234l.setText("等待中");
                                                            break;
                                                        case 11:
                                                            tVar.f37227e.setBackgroundResource(R.drawable.recom_green_butn);
                                                            tVar.f37227e.setText("安装");
                                                            tVar.f37227e.setTextColor(this.f37208b.getResources().getColor(R.color.app_green_color));
                                                            e(tVar, Boolean.TRUE, Boolean.FALSE);
                                                            break;
                                                        case 12:
                                                            e(tVar, Boolean.FALSE, Boolean.TRUE);
                                                            TextView textView3 = tVar.f37232j;
                                                            textView3.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                            tVar.f37234l.setText("解压中..");
                                                            tVar.f37236n.setProgress((int) downloadTask.getProgress());
                                                            tVar.f37227e.setBackgroundResource(R.drawable.extract);
                                                            tVar.f37227e.setText("解压中");
                                                            tVar.f37227e.setTextColor(-4868683);
                                                            break;
                                                        case 13:
                                                            e(tVar, Boolean.FALSE, Boolean.TRUE);
                                                            TextView textView4 = tVar.f37232j;
                                                            textView4.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                            tVar.f37234l.setText("点击重新解压");
                                                            tVar.f37236n.setProgress((int) downloadTask.getProgress());
                                                            tVar.f37227e.setBackgroundResource(R.drawable.reextract);
                                                            tVar.f37227e.setText("解压");
                                                            tVar.f37227e.setTextColor(this.f37208b.getResources().getColor(R.color.app_grey_color));
                                                            break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                tVar.f37227e.setBackgroundResource(R.drawable.recom_maincolor_butn);
                                tVar.f37227e.setText(this.f37208b.getResources().getString(R.string.download_status_finished));
                                tVar.f37227e.setTextColor(this.f37208b.getResources().getColor(R.color.app_main_color));
                                Boolean bool2 = Boolean.TRUE;
                                e(tVar, bool2, bool2);
                            }
                            tVar.f37227e.setBackgroundResource(R.drawable.recom_blue_butn);
                            tVar.f37227e.setText("继续");
                            tVar.f37227e.setTextColor(this.f37208b.getResources().getColor(R.color.app_blue_color));
                            Boolean bool3 = Boolean.FALSE;
                            e(tVar, bool3, bool3);
                            try {
                                if (downloadTask.getSize() == 0) {
                                    TextView textView5 = tVar.f37232j;
                                    textView5.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                } else {
                                    TextView textView6 = tVar.f37232j;
                                    textView6.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                }
                                tVar.f37235m.setProgress((int) downloadTask.getProgress());
                            } catch (Exception e6) {
                                e6.printStackTrace();
                            }
                            tVar.f37234l.setText("暂停中");
                        } else {
                            UtilsMy.x4(downloadTask);
                            tVar.f37227e.setBackgroundResource(R.drawable.recom_blue_butn);
                            tVar.f37227e.setText("暂停");
                            tVar.f37227e.setTextColor(this.f37208b.getResources().getColor(R.color.app_blue_color));
                            Boolean bool4 = Boolean.FALSE;
                            e(tVar, bool4, bool4);
                            if (downloadTask.getSize() == 0) {
                                TextView textView7 = tVar.f37232j;
                                textView7.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            } else {
                                TextView textView8 = tVar.f37232j;
                                textView8.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            }
                            tVar.f37235m.setProgress((int) downloadTask.getProgress());
                            String speed = downloadTask.getSpeed();
                            TextView textView9 = tVar.f37234l;
                            textView9.setText(speed + "/S");
                        }
                    }
                    tVar.f37227e.setBackgroundResource(R.drawable.recom_blue_butn);
                    UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
                    UtilsMy.Z2(tVar.f37227e, tVar.f37226d, collectionBeanSubBusiness);
                    tVar.f37227e.setTextColor(this.f37208b.getResources().getColor(R.color.app_blue_color));
                    e(tVar, Boolean.TRUE, Boolean.FALSE);
                }
            }
            EditText editText = SearchHintActivity.this.f37153j;
            tVar.f37226d.setOnClickListener(new o(collectionBeanSubBusiness, this.f37208b, editText != null ? editText.getText().toString() : ""));
            return view2;
        }

        void e(t tVar, Boolean bool, Boolean bool2) {
            if (bool.booleanValue()) {
                tVar.f37230h.setVisibility(8);
                tVar.f37235m.setVisibility(8);
                tVar.f37236n.setVisibility(8);
                tVar.f37231i.setVisibility(0);
                return;
            }
            tVar.f37230h.setVisibility(0);
            if (bool2.booleanValue()) {
                tVar.f37235m.setVisibility(8);
                tVar.f37236n.setVisibility(0);
            } else {
                tVar.f37236n.setVisibility(8);
                tVar.f37235m.setVisibility(0);
            }
            tVar.f37231i.setVisibility(8);
            tVar.f37229g.setVisibility(8);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f37210d.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return this.f37210d.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            if (this.f37210d.get(i4) instanceof SearchAutoDataBean) {
                return 1;
            }
            return this.f37210d.get(i4) instanceof CollectionBeanSubBusiness ? 2 : 3;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (getItemViewType(i4) == 1) {
                return c(i4, view, viewGroup);
            }
            if (getItemViewType(i4) == 2) {
                return d(i4, view, viewGroup);
            }
            return b(i4, view, viewGroup);
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 4;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
        }

        public r(Context context, List<Object> list) {
            this.f37208b = context;
            this.f37210d = list;
            this.f37209c = LayoutInflater.from(context);
        }
    }
}
