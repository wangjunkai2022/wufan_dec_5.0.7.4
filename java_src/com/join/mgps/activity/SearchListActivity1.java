package com.join.mgps.activity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
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
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.BaseAppCompatActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.SearchHintActivity;
import com.join.mgps.activity.search.SearchAutoAdData;
import com.join.mgps.activity.search.SearchAutoData;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.NavigationAdapter;
import com.join.mgps.db.tables.SearchRecordTable;
import com.join.mgps.dto.ClassfyTypeBean;
import com.join.mgps.dto.ClassifyGameTagBean;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.RequestKeywordArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestSearchGameArgs;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.SearchAutoDataBean;
import com.join.mgps.dto.SearchGameListBean;
import com.join.mgps.dto.SearchGameListSpecialZoneBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.fragment.CommonWebviewFragment_;
import com.join.mgps.fragment.SearchGameListFragment_;
import com.join.mgps.fragment.SearchListFragment_;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.zhy.view.flowlayout.TagFlowLayout3;
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
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.search_list_activity1)
/* loaded from: classes.dex */
public class SearchListActivity1 extends BaseAppCompatActivity {
    private SearchGameListSpecialZoneBean C;
    j G;
    private ResponseModel<SearchAutoData> L;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    View f37317b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    View f37318c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TagFlowLayout3 f37319d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TagFlowLayout3 f37320e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    EditText f37321f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TabLayout f37322g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    ViewPager f37323h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    ListView f37324i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ImageView f37325j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    LinearLayout f37326k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    ImageView f37327l;

    /* renamed from: m  reason: collision with root package name */
    com.join.mgps.rpc.e f37328m;

    /* renamed from: n  reason: collision with root package name */
    com.join.mgps.rpc.k f37329n;

    /* renamed from: o  reason: collision with root package name */
    NavigationAdapter f37330o;
    @Extra

    /* renamed from: p  reason: collision with root package name */
    int f37331p;
    @Extra

    /* renamed from: q  reason: collision with root package name */
    String f37332q;
    @Extra

    /* renamed from: s  reason: collision with root package name */
    boolean f37334s;
    @Extra

    /* renamed from: t  reason: collision with root package name */
    int f37335t;

    /* renamed from: w  reason: collision with root package name */
    int f37338w;

    /* renamed from: x  reason: collision with root package name */
    int f37339x;

    /* renamed from: y  reason: collision with root package name */
    private Context f37340y;
    @Extra

    /* renamed from: r  reason: collision with root package name */
    String f37333r = "";

    /* renamed from: u  reason: collision with root package name */
    List<ClassifyGameTagBean> f37336u = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    List<String> f37337v = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    private ArrayList<Fragment> f37341z = new ArrayList<>();
    private List<String> A = new ArrayList();
    private String[] B = {LocalGameActivity.f34225s, "游戏", "游戏单", "帖子", ""};
    private int D = 1;
    private int E = 50;
    boolean F = true;
    List<DownloadTask> H = new ArrayList();
    Map<String, DownloadTask> I = new ConcurrentHashMap();
    private int J = 0;
    private int K = 0;
    List<CollectionBeanSubBusiness> M = new ArrayList();
    private List<Object> N = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnKeyListener {
        a() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
            if (i4 == 66) {
                SearchListActivity1.this.search();
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    class b implements TextWatcher {
        b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            if (charSequence.length() > 0) {
                SearchListActivity1 searchListActivity1 = SearchListActivity1.this;
                if (searchListActivity1.F) {
                    searchListActivity1.r0(searchListActivity1.f37321f.getText().toString());
                } else {
                    searchListActivity1.F = true;
                }
                SearchListActivity1.this.f37317b.setVisibility(0);
                return;
            }
            SearchListActivity1.this.f37317b.setVisibility(8);
            SearchListActivity1.this.f37324i.setVisibility(8);
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchListActivity1.this.u0(false);
        }
    }

    /* loaded from: classes4.dex */
    class d implements AdapterView.OnItemClickListener {
        d() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            CommonGameInfoBean commonGameInfoBean;
            Object obj = SearchListActivity1.this.N.get(i4);
            SearchListActivity1.this.f37324i.setVisibility(8);
            if (obj instanceof SearchAutoDataBean) {
                SearchListActivity1.this.F = false;
                SearchAutoDataBean searchAutoDataBean = (SearchAutoDataBean) obj;
                String str = searchAutoDataBean.getGame_name().toString();
                SearchListActivity1.this.f37332q = searchAutoDataBean.getCrc_sign_id();
                SearchListActivity1.this.I0(str);
                SearchListActivity1.this.f37321f.setText(str);
                SearchListActivity1.this.f37321f.setSelection(str.length());
                SearchListActivity1.this.B0();
                o2.a.b(SearchListActivity1.this.f37321f);
            } else if (obj instanceof CollectionBeanSub) {
                CollectionBeanSub collectionBeanSub = (CollectionBeanSub) obj;
                IntentUtil.getInstance().intentActivity(SearchListActivity1.this.f37340y, collectionBeanSub.getIntentDataBean());
                Ext ext = new Ext();
                ext.setPosition("searchSuggest");
                ext.setGameId(collectionBeanSub.getGame_id());
                com.papa.sim.statistic.p.l(SearchListActivity1.this.f37340y).O1(Event.clickDetailFromSearchResult, ext);
            } else if (!(obj instanceof CommonGameInfoBean) || (commonGameInfoBean = (CommonGameInfoBean) obj) == null) {
            } else {
                if (commonGameInfoBean.isAdInfo()) {
                    IntentUtil.getInstance().intentActivity(SearchListActivity1.this.f37340y, commonGameInfoBean.getIntentDataBean());
                    SearchListActivity1.this.J0(Event.searchThinkAdWordClick, "2", commonGameInfoBean.getIntentDataBean().getLink_type_val(), commonGameInfoBean.getTitle());
                    return;
                }
                String obj2 = SearchListActivity1.this.f37321f.getText().toString();
                if (commonGameInfoBean.getG_info() != null) {
                    SearchListActivity1.this.f37332q = commonGameInfoBean.getG_info().getId();
                }
                SearchListActivity1.this.I0(obj2);
                SearchListActivity1.this.B0();
                o2.a.b(SearchListActivity1.this.f37321f);
                SearchListActivity1.this.J0(Event.searchThinkAdWordClick, "1", commonGameInfoBean.getIntentDataBean().getLink_type_val(), commonGameInfoBean.getTitle());
            }
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnFocusChangeListener {
        e() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements TabLayout.OnTabSelectedListener {
        f() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            SearchListActivity1.this.setStatus(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if ("游戏".equals(SearchListActivity1.this.A.get(tab.getPosition()))) {
                SearchListActivity1.this.f37325j.setVisibility(0);
                if (tab.getPosition() > 0) {
                    Ext ext = new Ext();
                    Data data = new Data();
                    data.setWhere(SearchListActivity1.this.f37333r);
                    com.papa.sim.statistic.p.l(SearchListActivity1.this.f37340y).T1(Event.clickChangeH5TabGame, ext, data);
                }
            } else {
                SearchListActivity1.this.f37325j.setVisibility(8);
                if (SearchListActivity1.this.f37326k.getVisibility() == 0) {
                    SearchListActivity1.this.u0(false);
                }
            }
            SearchListActivity1.this.setStatus(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchListActivity1.this.O0(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements Animator.AnimatorListener {
        h() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SearchListActivity1.this.f37318c.setVisibility(0);
            SearchListActivity1.this.f37326k.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements Animator.AnimatorListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f37350b;

        i(boolean z4) {
            this.f37350b = z4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SearchListActivity1.this.f37318c.setVisibility(8);
            SearchListActivity1.this.f37326k.setVisibility(8);
            if (this.f37350b) {
                int selectedPosition = SearchListActivity1.this.f37320e.getSelectedPosition();
                int id = selectedPosition < SearchListActivity1.this.f37336u.size() ? SearchListActivity1.this.f37336u.get(selectedPosition).getId() : 0;
                int i4 = SearchListActivity1.this.f37319d.getSelectedPosition() != 0 ? 1 : 0;
                SearchListActivity1 searchListActivity1 = SearchListActivity1.this;
                if (id == searchListActivity1.f37338w && i4 == searchListActivity1.f37339x) {
                    return;
                }
                searchListActivity1.C0();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A0(View view, int i4, ViewGroup viewGroup) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0(String str) {
        List<SearchRecordTable> d5 = b2.h0.n().d();
        if (d5 == null && d5.size() == 0) {
            SearchRecordTable searchRecordTable = new SearchRecordTable();
            searchRecordTable.setName(str);
            searchRecordTable.setCreate_time(System.currentTimeMillis());
            b2.h0.n().m(searchRecordTable);
        } else if (d5.size() > 100) {
            b2.h0.n().delete((Collection) b2.h0.n().i(10L, d5.size(), "create_time", false));
        } else {
            for (SearchRecordTable searchRecordTable2 : d5) {
                if (searchRecordTable2.getName().equals(str)) {
                    b2.h0.n().delete((b2.h0) searchRecordTable2);
                }
            }
            SearchRecordTable searchRecordTable3 = new SearchRecordTable();
            searchRecordTable3.setName(str);
            searchRecordTable3.setCreate_time(System.currentTimeMillis());
            b2.h0.n().m(searchRecordTable3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0(Event event, String str, String str2, String str3) {
        Ext ext = new Ext();
        ext.setIsJoin(str);
        ext.setReMarks(str3);
        Data data = new Data();
        data.setWhere(str2);
        com.papa.sim.statistic.p.l(this.f37340y).T1(event, ext, data);
    }

    private void P0(List<CollectionBeanSubBusiness> list) {
        if (this.H == null) {
            return;
        }
        for (CollectionBeanSubBusiness collectionBeanSubBusiness : list) {
            for (DownloadTask downloadTask : this.H) {
                if (collectionBeanSubBusiness.getMod_info() != null) {
                    ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                    DownloadTask downloadTask2 = this.I.get(mod_info.getMain_game_id());
                    boolean z4 = true;
                    boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                    DownloadTask downloadTask3 = this.I.get(mod_info.getMod_game_id());
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
                } else if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                    collectionBeanSubBusiness.setDownloadTask(downloadTask);
                }
            }
        }
    }

    private void receiveDelete(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.H.iterator();
        while (it2.hasNext()) {
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.I.remove(next.getCrc_link_type_val());
                it2.remove();
                for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.M) {
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        DownloadTask downloadTask2 = this.I.get(collectionBeanSubBusiness.getMod_info().getMod_game_id());
                        DownloadTask downloadTask3 = this.I.get(collectionBeanSubBusiness.getGame_id());
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
    }

    private void receiveError(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.I;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            this.G.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        UtilsMy.A4(this.H);
        if (!this.I.containsKey(downloadTask.getCrc_link_type_val())) {
            this.H.add(downloadTask);
            this.I.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        updateDowStateList(downloadTask);
        this.G.notifyDataSetChanged();
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.I;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.H.add(downloadTask);
            this.I.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        updateDowStateList(downloadTask);
        DownloadTask downloadTask2 = this.I.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        this.G.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(TabLayout.Tab tab) {
        if (this.f37322g.getTabCount() == 0) {
            return;
        }
        for (int i4 = 0; i4 < this.f37322g.getTabCount(); i4++) {
            View customView = this.f37322g.getTabAt(i4).getCustomView();
            if (customView != null) {
                if (i4 == tab.getPosition()) {
                    customView.findViewById(R.id.redTags).setVisibility(4);
                    customView.findViewById(R.id.iv).setVisibility(0);
                    TextView textView = (TextView) customView.findViewById(R.id.f15618tv);
                    textView.setTextColor(-16777216);
                    textView.setTypeface(null, 1);
                    textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp32));
                } else {
                    customView.findViewById(R.id.iv).setVisibility(4);
                    TextView textView2 = (TextView) customView.findViewById(R.id.f15618tv);
                    textView2.setTextColor(-16777216);
                    textView2.setTypeface(null, 0);
                    textView2.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp28));
                }
            }
        }
    }

    private void t0() {
        if (this.f37322g.getTabCount() == 0) {
            return;
        }
        int i4 = 0;
        while (i4 < this.f37322g.getTabCount()) {
            View inflate = LayoutInflater.from(this).inflate(R.layout.search_tab_item_layout_v2, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.f15618tv)).setText(this.A.get(i4));
            inflate.findViewById(R.id.redTags).setVisibility((i4 == 0 || !"游戏".equals(this.A.get(i4))) ? 4 : 0);
            this.f37322g.getTabAt(i4).setCustomView(inflate);
            i4++;
        }
        TextView textView = (TextView) this.f37322g.getTabAt(0).getCustomView().findViewById(R.id.f15618tv);
        textView.setTextColor(-16777216);
        textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp32));
        textView.setTypeface(textView.getTypeface(), 1);
        this.f37322g.getTabAt(0).getCustomView().findViewById(R.id.iv).setVisibility(0);
    }

    private void updateDowStateList(DownloadTask downloadTask) {
        try {
            for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.M) {
                if (collectionBeanSubBusiness.getMod_info() != null) {
                    ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                    DownloadTask downloadTask2 = this.I.get(mod_info.getMain_game_id());
                    boolean z4 = true;
                    boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                    DownloadTask downloadTask3 = this.I.get(mod_info.getMod_game_id());
                    if (downloadTask3 == null || downloadTask3.getStatus() != 5) {
                        z4 = false;
                    }
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
            this.G.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void updateProgressPartly() {
        DownloadTask downloadTask;
        for (int i4 = 0; i4 <= 2 && !(this.f37324i.getItemAtPosition(i4) instanceof SearchAutoDataBean); i4++) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) this.f37324i.getItemAtPosition(i4);
            if (collectionBeanSubBusiness != null && (downloadTask = collectionBeanSubBusiness.getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                View childAt = this.f37324i.getChildAt(i4 - this.K);
                if (childAt.getTag() instanceof SearchHintActivity.t) {
                    SearchHintActivity.t tVar = (SearchHintActivity.t) childAt.getTag();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z0(View view, int i4, ViewGroup viewGroup) {
    }

    void B0() {
        this.f37333r = y0();
        s0(1, false);
    }

    void C0() {
        this.f37333r = y0();
        NavigationAdapter navigationAdapter = this.f37330o;
        if (navigationAdapter == null || !(navigationAdapter.getItem(this.f37323h.getCurrentItem()) instanceof w1.l)) {
            return;
        }
        ((w1.l) this.f37330o.getItem(this.f37323h.getCurrentItem())).R();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void D0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ResultMainBean<ClassfyTypeBean> M0 = this.f37328m.M0(RequestBeanUtil.getInstance(this).getClassifyGameBean(1, 1));
                if (M0 == null || M0.getFlag() != 1 || M0.getMessages() == null) {
                    return;
                }
                K0(M0.getMessages().getData());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.iv_filter})
    public void E0() {
        if (this.f37326k.getVisibility() == 0) {
            u0(true);
        } else {
            this.f37326k.postDelayed(new g(), 200L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.tv_filter_close})
    public void F0() {
        u0(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.tv_filter_confirm})
    public void G0() {
        u0(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void H0() {
        List<DownloadTask> d5 = p1.f.K().d();
        this.H = d5;
        if (d5 == null || d5.size() <= 0) {
            return;
        }
        for (DownloadTask downloadTask : this.H) {
            if (downloadTask.getCrc_link_type_val() != null) {
                this.I.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void K0(ClassfyTypeBean classfyTypeBean) {
        if (classfyTypeBean == null) {
            return;
        }
        this.f37336u.clear();
        this.f37337v.clear();
        ClassifyGameTagBean classifyGameTagBean = new ClassifyGameTagBean();
        classifyGameTagBean.setId(0);
        classifyGameTagBean.setTitle(LocalGameActivity.f34225s);
        this.f37336u.add(0, classifyGameTagBean);
        this.f37336u.addAll(classfyTypeBean.getGame_type());
        for (ClassifyGameTagBean classifyGameTagBean2 : this.f37336u) {
            this.f37337v.add(classifyGameTagBean2.getTitle());
        }
        this.f37320e.setData(this.f37337v);
    }

    public void L0(int i4) {
        ViewPager viewPager = this.f37323h;
        if (viewPager != null) {
            viewPager.setCurrentItem(i4);
        }
    }

    public void M0(int i4) {
        this.f37331p = i4;
        if (i4 == 0) {
            if (this.f37318c.getVisibility() == 0) {
                u0(true);
            }
            this.f37325j.setVisibility(0);
            return;
        }
        if (this.f37318c.getVisibility() == 0) {
            u0(true);
        }
        this.f37325j.setVisibility(8);
    }

    public void N0() {
        ListView listView = this.f37324i;
        if (listView != null) {
            listView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void O0(int i4) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f37326k, "scaleY", 0.0f, 1.0f);
        this.f37326k.setPivotY(0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f37326k, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f37318c, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.addListener(new h());
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Q0(SearchGameListBean searchGameListBean) {
        if (searchGameListBean.getSpecial_zone_info() != null) {
            SearchGameListSpecialZoneBean special_zone_info = searchGameListBean.getSpecial_zone_info();
            this.C = special_zone_info;
            this.B[4] = special_zone_info.getName();
            return;
        }
        this.C = null;
        this.B[4] = "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void R0(List<SearchAutoDataBean> list, String str) {
        this.N.clear();
        ResponseModel<SearchAutoData> responseModel = this.L;
        boolean z4 = true;
        if (responseModel != null && responseModel.getData() != null && this.L.getData().getGame_list() != null) {
            this.M.clear();
            for (CollectionBeanSub collectionBeanSub : this.L.getData().getGame_list()) {
                collectionBeanSub.set_from(103);
                collectionBeanSub.set_from_type(112);
                collectionBeanSub.setReMarks("0");
                CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(collectionBeanSub);
                this.N.add(collectionBeanSubBusiness);
                this.M.add(collectionBeanSubBusiness);
            }
            P0(this.M);
            SearchAutoAdData ad_info = this.L.getData().getAd_info();
            if (ad_info != null) {
                if (ad_info.getFirstAd() != null) {
                    CommonGameInfoBean firstAd = ad_info.getFirstAd();
                    firstAd.setAdInfo(false);
                    this.N.add(firstAd);
                    J0(Event.searchThinkAdWordExp, "1", firstAd.getIntentDataBean().getLink_type_val(), firstAd.getTitle());
                }
                if (ad_info.getSecondAd() != null) {
                    CommonGameInfoBean secondAd = ad_info.getSecondAd();
                    secondAd.setAdInfo(true);
                    this.N.add(secondAd);
                    J0(Event.searchThinkAdWordExp, "2", secondAd.getIntentDataBean().getLink_type_val(), secondAd.getTitle());
                }
            }
        }
        if (list != null && list.size() > 0) {
            this.N.addAll(list);
        }
        List<Object> list2 = this.N;
        if (list2 != null && list2.size() > 0) {
            z4 = false;
        }
        this.f37334s = z4;
        this.f37324i.setVisibility(0);
        this.G.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f37340y = this;
        this.f37328m = com.join.mgps.rpc.impl.d.P1();
        this.f37329n = com.join.mgps.rpc.impl.i.D0();
        com.join.mgps.Util.d0.a().d(this);
        v0();
        s0(1, false);
        H0();
        this.f37321f.setText(this.f37333r);
        if (!TextUtils.isEmpty(this.f37333r)) {
            this.f37321f.setSelection(this.f37333r.length());
        }
        this.f37321f.setOnKeyListener(new a());
        this.f37321f.addTextChangedListener(new b());
        this.f37318c.setOnClickListener(new c());
        j jVar = new j(this.f37340y, this.N);
        this.G = jVar;
        this.f37324i.setAdapter((ListAdapter) jVar);
        this.f37324i.setOnItemClickListener(new d());
        this.f37327l.setOnFocusChangeListener(new e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void clear() {
        this.f37321f.setText("");
    }

    public String getGameId() {
        return this.f37332q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    public CommonRequestBean o0(String str) {
        return RequestBeanUtil.getInstance(this.f37340y).getSearchAutoRequestBean("searchAuto", str, 1, 20, 0, 0);
    }

    @Override // com.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f37326k.getVisibility() == 0) {
            u0(true);
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setSoftInputMode(2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
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
                    a5.setStatus(7);
                    updateUI(a5, 3);
                    return;
                } else if (c5 == 8) {
                    Map<String, DownloadTask> map = this.I;
                    if (map == null || map.isEmpty()) {
                        return;
                    }
                    updateProgressPartly();
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            if (a5 == null) {
                                return;
                            }
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
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString("keyword");
            if (com.join.mgps.Util.g2.i(string)) {
                this.F = false;
                this.f37321f.setText(string);
                B0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UtilsMy.q4(this);
    }

    public int p0() {
        if (this.f37331p != 0) {
            return 0;
        }
        if (this.f37319d.getSelectedPosition() == 0) {
            this.f37339x = 0;
        } else {
            this.f37339x = 1;
        }
        return this.f37339x;
    }

    public int q0() {
        if (this.f37331p != 0) {
            return 0;
        }
        int selectedPosition = this.f37320e.getSelectedPosition();
        if (selectedPosition < this.f37336u.size()) {
            this.f37338w = this.f37336u.get(selectedPosition).getId();
        }
        return this.f37338w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void r0(String str) {
        List<SearchAutoDataBean> arrayList = new ArrayList<>();
        if (com.join.android.app.common.utils.j.j(this.f37340y)) {
            try {
                try {
                    RequestModel<RequestKeywordArgs> requestModel = new RequestModel<>();
                    requestModel.setDefault(this.f37340y);
                    requestModel.setArgs(new RequestKeywordArgs(y0(), this.D, this.E, 0, 0));
                    ResponseModel<SearchAutoData> body = com.join.mgps.rpc.impl.i.E0().B0().u1(requestModel).execute().body();
                    this.L = body;
                    if (body != null && body.getData() != null) {
                        arrayList = this.L.getData().getSearch_list();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            } finally {
                R0(arrayList, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void s0(int i4, boolean z4) {
        if (com.join.android.app.common.utils.j.j(this.f37340y)) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f37340y).getAccountData();
            try {
                try {
                    RequestSearchGameArgs requestSearchGameArgs = new RequestSearchGameArgs();
                    requestSearchGameArgs.setGameId(this.f37332q);
                    requestSearchGameArgs.setLangId(Integer.valueOf(this.f37339x));
                    requestSearchGameArgs.setPc(20);
                    requestSearchGameArgs.setPn(Integer.valueOf(i4));
                    requestSearchGameArgs.setKeyword(y0());
                    if (accountData != null) {
                        requestSearchGameArgs.setUid(Integer.valueOf(accountData.getUid()));
                    } else {
                        requestSearchGameArgs.setUid(0);
                    }
                    requestSearchGameArgs.setPluginNum(Integer.valueOf(this.f37338w));
                    if (z4) {
                        requestSearchGameArgs.setRec_pn(1);
                    } else {
                        requestSearchGameArgs.setRec_pn(0);
                    }
                    requestSearchGameArgs.setIsRecommend(Integer.valueOf(z4 ? 1 : 0));
                    RequestModel requestModel = new RequestModel(this.f37340y);
                    requestModel.setArgs(requestSearchGameArgs);
                    requestModel.makeSign();
                    try {
                        ResponseModel<SearchGameListBean> J = com.join.mgps.rpc.impl.i.E0().J(requestModel.makeSign());
                        if (J != null && J.getData() != null) {
                            Q0(J.getData());
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                return;
            } finally {
                w0();
            }
        }
        w0();
        Context context = this.f37340y;
        if (context != null) {
            h0(context.getResources().getString(R.string.net_connect_failed));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void search() {
        this.f37324i.setVisibility(8);
        this.f37332q = "";
        try {
            if (this.f37321f.getText().toString().length() > 0) {
                I0(this.f37321f.getText().toString());
                B0();
            }
            this.f37321f.clearFocus();
            o2.a.b(this.f37321f);
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0(boolean z4) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f37326k, "scaleY", 1.0f, 0.0f);
        this.f37326k.setPivotY(0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f37326k, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f37318c, "alpha", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.addListener(new i(z4));
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.start();
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
                    return;
                case 3:
                    receiveDelete(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    receiveSuccess(downloadTask);
                    return;
                case 6:
                    receiveError(downloadTask);
                    return;
            }
        }
    }

    void v0() {
        this.f37320e.setListener(new TagFlowLayout3.b() { // from class: com.join.mgps.activity.t2
            @Override // com.zhy.view.flowlayout.TagFlowLayout3.b
            public final void a(View view, int i4, ViewGroup viewGroup) {
                SearchListActivity1.z0(view, i4, viewGroup);
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(LocalGameActivity.f34225s);
        arrayList.add("中文");
        this.f37319d.setData(arrayList);
        this.f37319d.setListener(new TagFlowLayout3.b() { // from class: com.join.mgps.activity.u2
            @Override // com.zhy.view.flowlayout.TagFlowLayout3.b
            public final void a(View view, int i4, ViewGroup viewGroup) {
                SearchListActivity1.A0(view, i4, viewGroup);
            }
        });
        D0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0() {
        SearchGameListSpecialZoneBean searchGameListSpecialZoneBean;
        String str;
        this.f37341z = new ArrayList<>();
        this.A = new ArrayList();
        this.f37330o = new NavigationAdapter(getSupportFragmentManager(), this.f37341z, this.A);
        this.f37323h.setOffscreenPageLimit(4);
        this.f37323h.setAdapter(this.f37330o);
        String[] strArr = this.B;
        if (strArr.length >= 5 && !TextUtils.isEmpty(strArr[4]) && (searchGameListSpecialZoneBean = this.C) != null && searchGameListSpecialZoneBean.getUrl() != null) {
            CommonWebviewFragment_ commonWebviewFragment_ = new CommonWebviewFragment_();
            Bundle bundle = new Bundle();
            String url = this.C.getUrl();
            if (!url.contains("?")) {
                str = url + "?";
            } else {
                str = url + m.a.f71490d;
            }
            bundle.putString("url", str + "where=" + this.f37333r + "&from=" + this.f37335t);
            commonWebviewFragment_.setArguments(bundle);
            this.f37341z.add(commonWebviewFragment_);
            this.A.add(this.B[4]);
        }
        this.f37341z.add(SearchGameListFragment_.O0().b(1).c(this.f37332q).d(this.f37333r).build());
        this.A.add(this.B[1]);
        this.f37341z.add(SearchListFragment_.K0().b(2).c(this.f37332q).d(this.f37333r).build());
        this.A.add(this.B[2]);
        this.f37341z.add(SearchListFragment_.K0().b(3).c(this.f37332q).d(this.f37333r).build());
        this.A.add(this.B[3]);
        this.f37330o.d(this.f37341z, this.A);
        this.f37330o.notifyDataSetChanged();
        this.f37322g.setupWithViewPager(this.f37323h);
        t0();
        this.f37322g.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new f());
        TabLayout tabLayout = this.f37322g;
        tabLayout.selectTab(tabLayout.getTabAt(0));
        if (!"游戏".equals(this.A.get(this.f37331p))) {
            this.f37325j.setVisibility(8);
        }
        L0(this.f37331p);
    }

    public boolean x0(String str) {
        String str2 = this.f37333r;
        return (str2 == null || str == null || str2.equals(str)) ? false : true;
    }

    public String y0() {
        EditText editText = this.f37321f;
        if (editText != null) {
            this.f37333r = editText.getText().toString();
        }
        return this.f37333r;
    }

    /* loaded from: classes4.dex */
    public class j extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private Context f37352b;

        /* renamed from: c  reason: collision with root package name */
        private LayoutInflater f37353c;

        /* renamed from: d  reason: collision with root package name */
        private List<Object> f37354d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SearchAutoDataBean f37356b;

            a(SearchAutoDataBean searchAutoDataBean) {
                this.f37356b = searchAutoDataBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                j.this.f37354d.remove(this.f37356b);
                j.this.notifyDataSetChanged();
            }
        }

        /* loaded from: classes4.dex */
        public class b {

            /* renamed from: a  reason: collision with root package name */
            public TextView f37358a;

            public b() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes4.dex */
        public class c {

            /* renamed from: a  reason: collision with root package name */
            public ImageView f37360a;

            /* renamed from: b  reason: collision with root package name */
            public ImageView f37361b;

            /* renamed from: c  reason: collision with root package name */
            public View f37362c;

            /* renamed from: d  reason: collision with root package name */
            public TextView f37363d;

            private c() {
            }

            /* synthetic */ c(j jVar, a aVar) {
                this();
            }
        }

        public j(Context context) {
            this.f37352b = context;
        }

        public View b(int i4, View view, ViewGroup viewGroup) {
            b bVar;
            if (view == null) {
                view = this.f37353c.inflate(R.layout.simple_listview_item2, (ViewGroup) null);
                bVar = new b();
                bVar.f37358a = (TextView) view.findViewById(R.id.lv_tv_title);
                view.setTag(bVar);
            } else {
                bVar = (b) view.getTag();
            }
            bVar.f37358a.setText(((CommonGameInfoBean) this.f37354d.get(i4)).getTitle());
            return view;
        }

        public View c(int i4, View view, ViewGroup viewGroup) {
            c cVar;
            if (view == null) {
                view = this.f37353c.inflate(R.layout.simple_listview_item1, (ViewGroup) null);
                cVar = new c(this, null);
                cVar.f37363d = (TextView) view.findViewById(R.id.lv_tv_title);
                cVar.f37361b = (ImageView) view.findViewById(R.id.dotHistory);
                cVar.f37362c = view.findViewById(R.id.rlClearHistory);
                view.setTag(cVar);
            } else {
                cVar = (c) view.getTag();
            }
            SearchAutoDataBean searchAutoDataBean = (SearchAutoDataBean) this.f37354d.get(i4);
            cVar.f37363d.setText(searchAutoDataBean.getGame_name());
            if (searchAutoDataBean.getIsHistory()) {
                if (cVar.f37361b.getVisibility() != 0) {
                    cVar.f37361b.setVisibility(0);
                }
                if (cVar.f37362c.getVisibility() != 0) {
                    cVar.f37362c.setVisibility(0);
                }
                cVar.f37362c.setOnClickListener(new a(searchAutoDataBean));
            } else {
                if (cVar.f37361b.getVisibility() != 8) {
                    cVar.f37361b.setVisibility(8);
                }
                if (cVar.f37362c.getVisibility() != 8) {
                    cVar.f37362c.setVisibility(8);
                }
            }
            return view;
        }

        public View d(int i4, View view, ViewGroup viewGroup) {
            SearchHintActivity.t tVar;
            View view2;
            if (view == null) {
                View inflate = this.f37353c.inflate(R.layout.searchauto_app_listview_item, (ViewGroup) null);
                SearchHintActivity.t tVar2 = new SearchHintActivity.t();
                tVar2.f37223a = (SimpleDraweeView) inflate.findViewById(R.id.mgListviewItemIcon);
                tVar2.f37224b = (ImageView) inflate.findViewById(R.id.giftPackageSwich);
                tVar2.f37225c = (TextView) inflate.findViewById(R.id.mgListviewItemAppname);
                tVar2.f37226d = (RelativeLayout) inflate.findViewById(R.id.rLayoutRight);
                tVar2.f37227e = (TextView) inflate.findViewById(R.id.mgListviewItemInstall);
                tVar2.f37229g = (TextView) inflate.findViewById(R.id.mgListviewItemDescribe);
                tVar2.f37230h = (LinearLayout) inflate.findViewById(R.id.linearLayout2);
                tVar2.f37231i = (LinearLayout) inflate.findViewById(R.id.tipsLayout);
                tVar2.f37232j = (TextView) inflate.findViewById(R.id.appSize);
                tVar2.f37234l = (TextView) inflate.findViewById(R.id.loding_info);
                tVar2.f37235m = (ProgressBar) inflate.findViewById(R.id.progressBar);
                tVar2.f37236n = (ProgressBar) inflate.findViewById(R.id.progressBarZip);
                tVar2.f37228f = inflate.findViewById(R.id.line);
                tVar2.f37233k = (TextView) inflate.findViewById(R.id.tipSText);
                inflate.setTag(tVar2);
                tVar = tVar2;
                view2 = inflate;
            } else {
                tVar = (SearchHintActivity.t) view.getTag();
                view2 = view;
            }
            tVar.f37228f.setVisibility(0);
            CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) this.f37354d.get(i4);
            DownloadTask downloadTask = collectionBeanSubBusiness.getDownloadTask();
            if (collectionBeanSubBusiness.getGift_package_switch() == 1) {
                tVar.f37224b.setVisibility(8);
            } else {
                tVar.f37224b.setVisibility(8);
            }
            tVar.f37225c.setText(collectionBeanSubBusiness.getGame_name());
            tVar.f37229g.setText(collectionBeanSubBusiness.getInfo());
            long parseDouble = (long) (Double.parseDouble(collectionBeanSubBusiness.getSize()) * 1024.0d * 1024.0d);
            MyImageLoader.h(tVar.f37223a, collectionBeanSubBusiness.getIco_remote().trim());
            collectionBeanSubBusiness.getTag_info();
            TextView textView = tVar.f37233k;
            textView.setText(collectionBeanSubBusiness.getSp_tag_info().getModel().getName() + "  " + UtilsMy.J2(parseDouble));
            if (collectionBeanSubBusiness.isCpsGame() && com.join.mgps.Util.s0.c() && com.join.mgps.Util.s0.a(collectionBeanSubBusiness.getTag_info())) {
                tVar.f37227e.setBackgroundResource(R.drawable.recom_maincolor_butn);
                tVar.f37227e.setText(this.f37352b.getResources().getString(R.string.download_status_finished));
                tVar.f37227e.setTextColor(this.f37352b.getResources().getColor(R.color.app_main_color));
            } else {
                String plugin_num = collectionBeanSubBusiness.getPlugin_num();
                if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                    tVar.f37227e.setBackgroundResource(R.drawable.recom_blue_butn);
                    tVar.f37227e.setText("开始");
                    tVar.f37227e.setTextColor(this.f37352b.getResources().getColor(R.color.app_blue_color));
                    tVar.f37231i.setVisibility(8);
                    tVar.f37224b.setVisibility(8);
                } else if (downloadTask == null) {
                    e(tVar, Boolean.TRUE, Boolean.FALSE);
                    if (UtilsMy.o0(collectionBeanSubBusiness.getTag_info())) {
                        if (UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id()) <= 0 ? com.join.android.app.common.utils.e.l0(this.f37352b).d(this.f37352b, collectionBeanSubBusiness.getPackage_name()) : false) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f37352b).l(this.f37352b, collectionBeanSubBusiness.getPackage_name());
                            if (com.join.mgps.Util.g2.i(collectionBeanSubBusiness.getVer()) && l4.d() < Integer.parseInt(collectionBeanSubBusiness.getVer())) {
                                tVar.f37227e.setBackgroundResource(R.drawable.recom_green_butn);
                                tVar.f37227e.setText("更新");
                                tVar.f37227e.setTextColor(-9263087);
                            } else {
                                tVar.f37227e.setBackgroundResource(R.drawable.recom_maincolor_butn);
                                tVar.f37227e.setText(this.f37352b.getResources().getString(R.string.download_status_finished));
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
                            tVar.f37227e.setTextColor(this.f37352b.getResources().getColor(R.color.app_blue_color));
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
                                                            tVar.f37227e.setTextColor(this.f37352b.getResources().getColor(R.color.app_green_color));
                                                            e(tVar, Boolean.TRUE, Boolean.FALSE);
                                                            break;
                                                        case 10:
                                                            tVar.f37227e.setBackgroundResource(R.drawable.recom_blue_butn);
                                                            tVar.f37227e.setText("等待");
                                                            tVar.f37227e.setTextColor(this.f37352b.getResources().getColor(R.color.app_blue_color));
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
                                                            tVar.f37227e.setTextColor(this.f37352b.getResources().getColor(R.color.app_green_color));
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
                                                            tVar.f37227e.setTextColor(this.f37352b.getResources().getColor(R.color.app_grey_color));
                                                            break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                tVar.f37227e.setBackgroundResource(R.drawable.recom_maincolor_butn);
                                tVar.f37227e.setText(this.f37352b.getResources().getString(R.string.download_status_finished));
                                tVar.f37227e.setTextColor(this.f37352b.getResources().getColor(R.color.app_main_color));
                                Boolean bool2 = Boolean.TRUE;
                                e(tVar, bool2, bool2);
                            }
                            tVar.f37227e.setBackgroundResource(R.drawable.recom_blue_butn);
                            tVar.f37227e.setText("继续");
                            tVar.f37227e.setTextColor(this.f37352b.getResources().getColor(R.color.app_blue_color));
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
                            tVar.f37227e.setTextColor(this.f37352b.getResources().getColor(R.color.app_blue_color));
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
                    tVar.f37227e.setTextColor(this.f37352b.getResources().getColor(R.color.app_blue_color));
                    e(tVar, Boolean.TRUE, Boolean.FALSE);
                }
            }
            tVar.f37226d.setOnClickListener(new SearchHintActivity.o(collectionBeanSubBusiness, this.f37352b, SearchListActivity1.this.f37333r));
            return view2;
        }

        void e(SearchHintActivity.t tVar, Boolean bool, Boolean bool2) {
            if (bool.booleanValue()) {
                tVar.f37230h.setVisibility(8);
                tVar.f37235m.setVisibility(8);
                tVar.f37236n.setVisibility(8);
                tVar.f37231i.setVisibility(0);
                tVar.f37229g.setVisibility(8);
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
            List<Object> list = this.f37354d;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            List<Object> list = this.f37354d;
            if (list == null || list.size() <= i4) {
                return null;
            }
            return this.f37354d.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            List<Object> list = this.f37354d;
            if (list == null || list.size() <= i4) {
                return 0;
            }
            if (this.f37354d.get(i4) instanceof SearchAutoDataBean) {
                return 1;
            }
            return this.f37354d.get(i4) instanceof CollectionBeanSubBusiness ? 2 : 3;
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

        public j(Context context, List<Object> list) {
            this.f37352b = context;
            this.f37354d = list;
            this.f37353c = LayoutInflater.from(context);
        }
    }
}
