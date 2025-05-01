package com.join.mgps.fragment;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.l2;
import com.join.mgps.adapter.ChoiceAdapter;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.db.tables.ForumTable;
import com.join.mgps.dto.BannerBean;
import com.join.mgps.dto.FirstIntentData;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.HomeGameCarefullyBean;
import com.join.mgps.dto.TodayWufunBroadcast;
import com.join.mgps.dto.TodayWufunEmuClassify;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Where;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EFragment(R.layout.choice_fragment)
/* loaded from: classes3.dex */
public class ChoiceFragment extends BaseFragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f50019b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f50020c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ForumLoadingView f50021d;

    /* renamed from: e  reason: collision with root package name */
    com.join.mgps.rpc.e f50022e;

    /* renamed from: f  reason: collision with root package name */
    Context f50023f;
    @Pref

    /* renamed from: g  reason: collision with root package name */
    PrefDef_ f50024g;

    /* renamed from: h  reason: collision with root package name */
    String f50025h;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    XRecyclerView f50031n;

    /* renamed from: o  reason: collision with root package name */
    private ChoiceAdapter f50032o;

    /* renamed from: p  reason: collision with root package name */
    private LinearLayoutManager f50033p;

    /* renamed from: r  reason: collision with root package name */
    XRecyclerView.f f50035r;

    /* renamed from: i  reason: collision with root package name */
    private boolean f50026i = false;

    /* renamed from: j  reason: collision with root package name */
    private int f50027j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f50028k = 0;

    /* renamed from: l  reason: collision with root package name */
    private int f50029l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f50030m = 0;

    /* renamed from: q  reason: collision with root package name */
    private List<ChoiceAdapter.p> f50034q = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements XRecyclerView.f {
        a() {
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onLoadMore() {
            if (!com.join.android.app.common.utils.j.j(ChoiceFragment.this.f50023f)) {
                ChoiceFragment.this.showMessage("当前网络不可用!");
                ChoiceFragment.this.f50031n.stopRefresh();
                return;
            }
            ChoiceFragment choiceFragment = ChoiceFragment.this;
            choiceFragment.f0(choiceFragment.f50029l + 1);
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onRefresh() {
            if (!com.join.android.app.common.utils.j.j(ChoiceFragment.this.f50023f)) {
                ChoiceFragment.this.showMessage("当前网络不可用!");
                ChoiceFragment.this.m0();
                return;
            }
            ChoiceFragment.this.f50031n.setLoadingMoreEnabled(true);
            ChoiceFragment.this.e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            XRecyclerView xRecyclerView = ChoiceFragment.this.f50031n;
            if (xRecyclerView == null) {
                return;
            }
            xRecyclerView.stopRefresh();
            ChoiceFragment.this.f50031n.stopLoadMore();
            if (ChoiceFragment.this.f50030m == -1) {
                ChoiceFragment.this.f50031n.setNoMore();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            XRecyclerView xRecyclerView = ChoiceFragment.this.f50031n;
            if (xRecyclerView == null) {
                return;
            }
            xRecyclerView.stopRefresh();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
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
            ChoiceFragment.this.Z(1);
            ChoiceFragment.this.e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e extends ForumLoadingView.e {
        e(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            super.a(view);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            ChoiceFragment.this.Z(1);
            ChoiceFragment.this.e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f extends ForumLoadingView.e {
        f(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            super.b();
            ChoiceFragment.this.Z(1);
            ChoiceFragment.this.e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g extends ForumLoadingView.e {
        g(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            ChoiceFragment.this.Z(1);
            ChoiceFragment.this.e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() {
        this.f50030m = 0;
        this.f50029l = 0;
        ChoiceAdapter choiceAdapter = this.f50032o;
        if (choiceAdapter != null) {
            choiceAdapter.C(0);
        }
        f0(1);
    }

    void R() {
        d0();
        e0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z(int i4) {
        ForumLoadingView forumLoadingView = this.f50021d;
        if (forumLoadingView == null) {
            return;
        }
        if (i4 == 1) {
            forumLoadingView.m();
            this.f50021d.j(1);
        } else if (i4 == 2) {
            forumLoadingView.m();
            this.f50021d.j(2);
            l0();
        } else if (i4 == 4) {
            forumLoadingView.j(4);
            ForumLoadingView forumLoadingView2 = this.f50021d;
            forumLoadingView2.setListener(new d(forumLoadingView2));
            l0();
        } else if (i4 == 16) {
            forumLoadingView.setFailedMsg("加载失败~");
            ForumLoadingView forumLoadingView3 = this.f50021d;
            forumLoadingView3.setListener(new g(forumLoadingView3));
            this.f50021d.j(16);
        } else if (i4 == 9) {
            forumLoadingView.j(9);
            ForumLoadingView forumLoadingView4 = this.f50021d;
            forumLoadingView4.setListener(new e(forumLoadingView4));
            this.f50021d.j(9);
        } else if (i4 != 10) {
        } else {
            forumLoadingView.setFailedMsg("没有更多精选哦~");
            ForumLoadingView forumLoadingView5 = this.f50021d;
            forumLoadingView5.setListener(new f(forumLoadingView5));
            this.f50021d.setReloadingVisibility(0);
            this.f50021d.j(10);
            this.f50021d.setFailedImgVisibility(8);
            this.f50021d.setReloadingVisibility(0);
            this.f50021d.setFailedReloadingRes(R.drawable.papa_loading_null);
        }
    }

    public int a0() {
        ChoiceAdapter choiceAdapter = this.f50032o;
        if (choiceAdapter == null) {
            return 0;
        }
        return choiceAdapter.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f50023f = getActivity();
        this.f50022e = com.join.mgps.rpc.impl.d.P1();
        FirstIntentData a5 = com.join.mgps.Util.d1.a(this.f50023f);
        if (a5 != null && this.f50024g.isShowEditorRecoomand().d().booleanValue() && a5.isIntent() && a5.isCustomApk()) {
            IntentDateBean intentDateBean = a5.getIntentDateBean();
            if (a5.isAutoDownload()) {
                intentDateBean.setObject(Boolean.TRUE);
            }
            this.f50025h = intentDateBean.getCrc_link_type_val();
            this.f50026i = true;
        }
        c0();
        Z(1);
        if (System.currentTimeMillis() - this.f50024g.isFirstRunGameCarefullyLong().e(0L).longValue() > TimeUnit.DAYS.toMillis(1L) || this.f50026i) {
            this.f50027j = 1;
        }
        R();
    }

    HomeGameCarefullyBean b0() {
        try {
            String args2 = b2.t.p().o(ForumBean.ForumEvent.HomeGameCarefully).getArgs2();
            if (TextUtils.isEmpty(args2)) {
                return null;
            }
            return (HomeGameCarefullyBean) JsonMapper.getInstance().fromJson(args2, JsonMapper.getInstance().createCollectionType(HomeGameCarefullyBean.class, new Class[0]));
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    void c0() {
        this.f50032o = new ChoiceAdapter(this.f50023f, this.f50034q);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f50023f);
        this.f50033p = linearLayoutManager;
        this.f50031n.setLayoutManager(linearLayoutManager);
        this.f50031n.setAdapter(this.f50032o);
        this.f50031n.setPreLoadCount(10);
        this.f50031n.setPullRefreshEnabled(true);
        this.f50031n.setLoadingMoreEnabled(true);
        a aVar = new a();
        this.f50035r = aVar;
        this.f50031n.setLoadingListener(aVar);
    }

    void d0() {
        HomeGameCarefullyBean b02 = b0();
        k0(b02, 1, 1);
        if (b02 != null) {
            Z(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b5, code lost:
        if (r7.f50030m != (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d0, code lost:
        if (r7.f50030m == (-1)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d2, code lost:
        r7.f50030m = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d4, code lost:
        m0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
        return;
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f0(int r8) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.ChoiceFragment.f0(int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void g0(HomeGameCarefullyBean homeGameCarefullyBean) {
        try {
            String json = JsonMapper.nonDefaultMapper().toJson(homeGameCarefullyBean);
            ForumTable forumTable = new ForumTable();
            forumTable.setType(ForumBean.ForumEvent.HomeGameCarefully.name());
            forumTable.setArgs1("");
            forumTable.setArgs2(json);
            forumTable.setTime(String.valueOf(System.currentTimeMillis() / 1000));
            b2.t.p().u(forumTable);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        com.papa.sim.statistic.p.l(getContext()).u2(Where.index, AccountUtil_.getInstance_(getActivity()).getUid());
        String charSequence = this.f50020c.getText().toString();
        IntentUtil.getInstance().goSearchHintActivity(getContext(), (TextUtils.isEmpty(charSequence) || charSequence.equals(getString(R.string.search_content_default))) ? "" : "");
    }

    public void i0(int i4) {
        ChoiceAdapter choiceAdapter = this.f50032o;
        if (choiceAdapter == null) {
            return;
        }
        choiceAdapter.C(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0(HomeGameCarefullyBean homeGameCarefullyBean, int i4) {
        if (i4 == 1) {
            if (this.f50027j == 1) {
                this.f50027j = 0;
            }
            this.f50024g.isFirstRunGameCarefullyLong().g(Long.valueOf(System.currentTimeMillis()));
        }
        k0(homeGameCarefullyBean, i4, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0(HomeGameCarefullyBean homeGameCarefullyBean, int i4, int i5) {
        TodayWufunBroadcast editor_recommend_game;
        int i6;
        int i7;
        if (homeGameCarefullyBean == null) {
            return;
        }
        if (this.f50034q == null) {
            this.f50034q = new ArrayList();
        }
        if (i4 == 1) {
            try {
                this.f50034q.clear();
                if (this.f50024g.isShowEditorRecoomand().d().booleanValue() && homeGameCarefullyBean.getVisitor_recommend_game() != null && !TextUtils.isEmpty(homeGameCarefullyBean.getVisitor_recommend_game().getGame_id())) {
                    editor_recommend_game = homeGameCarefullyBean.getVisitor_recommend_game();
                    this.f50024g.isShowEditorRecoomand().g(Boolean.FALSE);
                    i6 = 1;
                } else {
                    editor_recommend_game = homeGameCarefullyBean.getEditor_recommend_game();
                    i6 = 0;
                }
                if (editor_recommend_game != null && !TextUtils.isEmpty(editor_recommend_game.getGame_id())) {
                    editor_recommend_game.set_from_type(101);
                    this.f50034q.add(new ChoiceAdapter.p(1, editor_recommend_game).k(i6));
                    this.f50034q.add(new ChoiceAdapter.p(2, editor_recommend_game));
                    if (i5 != 1) {
                        com.papa.sim.statistic.p.l(this.f50023f).k2(AccountUtil_.getInstance_(this.f50023f).getUid(), editor_recommend_game.getGame_id(), "eidtButton", "", "编辑推荐");
                    }
                }
                if (homeGameCarefullyBean.getBuy_advert_recommend() != null) {
                    TodayWufunBroadcast buy_advert_recommend = homeGameCarefullyBean.getBuy_advert_recommend();
                    buy_advert_recommend.set_from_type(102);
                    this.f50034q.add(new ChoiceAdapter.p(1, buy_advert_recommend).k(2));
                    this.f50034q.add(new ChoiceAdapter.p(3, buy_advert_recommend));
                    this.f50034q.add(new ChoiceAdapter.p(4, buy_advert_recommend));
                    if (i5 != 1) {
                        com.papa.sim.statistic.p.l(this.f50023f).k2(AccountUtil_.getInstance_(this.f50023f).getUid(), buy_advert_recommend.getGame_id(), "adButton", "", "广告赞助");
                    }
                }
                if (homeGameCarefullyBean.getGame_prefecture() != null && homeGameCarefullyBean.getGame_prefecture().size() > 0) {
                    TodayWufunEmuClassify todayWufunEmuClassify = new TodayWufunEmuClassify();
                    int a02 = a0();
                    for (int i8 = 0; i8 < homeGameCarefullyBean.getGame_prefecture().size(); i8++) {
                        if (a02 == 0 && i8 == 0) {
                            int id = homeGameCarefullyBean.getGame_prefecture().get(i8).getId();
                            i0(id);
                            todayWufunEmuClassify = homeGameCarefullyBean.getGame_prefecture().get(i8);
                            a02 = id;
                        } else if (a02 == homeGameCarefullyBean.getGame_prefecture().get(i8).getId()) {
                            todayWufunEmuClassify = homeGameCarefullyBean.getGame_prefecture().get(i8);
                        }
                        TodayWufunEmuClassify todayWufunEmuClassify2 = homeGameCarefullyBean.getGame_prefecture().get(i8);
                        if (todayWufunEmuClassify2.getGame_list() != null) {
                            for (TodayWufunBroadcast todayWufunBroadcast : todayWufunEmuClassify2.getGame_list()) {
                                todayWufunBroadcast.set_from_type(103);
                            }
                        }
                    }
                    this.f50034q.add(new ChoiceAdapter.p(0, null));
                    this.f50034q.add(new ChoiceAdapter.p(16, homeGameCarefullyBean.getGame_prefecture()));
                    this.f50034q.add(new ChoiceAdapter.p(17, todayWufunEmuClassify));
                }
                if (homeGameCarefullyBean.getToday_refresh() == null || (homeGameCarefullyBean.getToday_refresh().getGame_discover() == null && homeGameCarefullyBean.getToday_refresh().getGame_information() == null)) {
                    i7 = 0;
                } else {
                    HomeGameCarefullyBean.DayRecommand today_refresh = homeGameCarefullyBean.getToday_refresh();
                    this.f50034q.add(new ChoiceAdapter.p(5, Long.valueOf(today_refresh.getAddTimes())));
                    if (today_refresh.getGame_discover() != null) {
                        today_refresh.getGame_discover().set_from_type(104);
                        String str = "1-1";
                        this.f50034q.add(new ChoiceAdapter.p(6, today_refresh.getGame_discover()).l(str));
                        this.f50034q.add(new ChoiceAdapter.p(7, today_refresh.getGame_discover()).l(str));
                        if (i5 != 1) {
                            com.papa.sim.statistic.p.l(this.f50023f).k2(AccountUtil_.getInstance_(this.f50023f).getUid(), today_refresh.getGame_discover() != null ? today_refresh.getGame_discover().getGame_id() : "", "todayButton", str, "今日悟饭");
                        }
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    if (today_refresh.getGame_information() != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("1-");
                        i7++;
                        sb.append(i7);
                        String sb2 = sb.toString();
                        this.f50034q.add(new ChoiceAdapter.p(13, today_refresh.getGame_information()).i(2).l(sb2));
                        this.f50034q.add(new ChoiceAdapter.p(14, today_refresh.getGame_information()).i(2).l(sb2));
                        if (i5 != 1) {
                            com.papa.sim.statistic.p.l(this.f50023f).k2(AccountUtil_.getInstance_(this.f50023f).getUid(), today_refresh.getGame_discover() != null ? today_refresh.getGame_discover().getGame_id() : "", "todayButton", sb2, "今日悟饭");
                        }
                    }
                }
                if (homeGameCarefullyBean.getCarefully_special() != null && homeGameCarefullyBean.getCarefully_special().size() > 0) {
                    this.f50034q.add(new ChoiceAdapter.p(8, null));
                    for (int i9 = 0; i9 < homeGameCarefullyBean.getCarefully_special().size(); i9++) {
                        BannerBean bannerBean = homeGameCarefullyBean.getCarefully_special().get(i9);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("1-");
                        i7++;
                        sb3.append(i7);
                        String sb4 = sb3.toString();
                        this.f50034q.add(new ChoiceAdapter.p(9, bannerBean).j(i9).l(sb4));
                        com.papa.sim.statistic.p.l(this.f50023f).k2(AccountUtil_.getInstance_(this.f50023f).getUid(), bannerBean.getCrc_link_type_val(), "todayButton", sb4, "精选专题");
                    }
                    this.f50034q.add(new ChoiceAdapter.p(12, null));
                }
                if (homeGameCarefullyBean.getGame_bespeak_recommend() != null && homeGameCarefullyBean.getGame_bespeak_recommend().size() > 0) {
                    this.f50034q.add(new ChoiceAdapter.p(10, homeGameCarefullyBean.getBespeak_list_url()));
                    for (int i10 = 0; i10 < homeGameCarefullyBean.getGame_bespeak_recommend().size(); i10++) {
                        TodayWufunBroadcast todayWufunBroadcast2 = homeGameCarefullyBean.getGame_bespeak_recommend().get(i10);
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("1-");
                        i7++;
                        sb5.append(i7);
                        String sb6 = sb5.toString();
                        this.f50034q.add(new ChoiceAdapter.p(11, todayWufunBroadcast2).j(i10).l(sb6));
                        com.papa.sim.statistic.p.l(this.f50023f).k2(AccountUtil_.getInstance_(this.f50023f).getUid(), todayWufunBroadcast2 != null ? todayWufunBroadcast2.getGame_id() : "", "todayButton", sb6, "新游预约");
                    }
                    this.f50034q.add(new ChoiceAdapter.p(12, null));
                }
                this.f50028k = 1;
            } catch (Exception e5) {
                e5.printStackTrace();
                e5.getMessage();
            }
        }
        if (homeGameCarefullyBean.getBefore_refresh() != null) {
            for (int i11 = 0; i11 < homeGameCarefullyBean.getBefore_refresh().size(); i11++) {
                this.f50028k++;
                HomeGameCarefullyBean.DayRecommand dayRecommand = homeGameCarefullyBean.getBefore_refresh().get(i11);
                this.f50034q.add(new ChoiceAdapter.p(5, Long.valueOf(dayRecommand.getAddTimes())));
                if (dayRecommand.getGame_discover() != null) {
                    dayRecommand.getGame_discover().set_from_type(104);
                    String str2 = this.f50028k + "-1";
                    this.f50034q.add(new ChoiceAdapter.p(6, dayRecommand.getGame_discover()).l(str2).m(this.f50028k));
                    this.f50034q.add(new ChoiceAdapter.p(7, dayRecommand.getGame_discover()).l(str2).m(this.f50028k));
                    if (this.f50028k <= 7) {
                        com.papa.sim.statistic.p.l(this.f50023f).k2(AccountUtil_.getInstance_(this.f50023f).getUid(), dayRecommand.getGame_discover() != null ? dayRecommand.getGame_discover().getGame_id() : "", "todayButton", str2, "今日悟饭");
                    }
                }
                if (dayRecommand.getGame_information() != null) {
                    String str3 = this.f50028k + "-2";
                    this.f50034q.add(new ChoiceAdapter.p(13, dayRecommand.getGame_information()).i(2).l(str3).m(this.f50028k));
                    this.f50034q.add(new ChoiceAdapter.p(14, dayRecommand.getGame_information()).i(2).l(str3).m(this.f50028k));
                    if (this.f50028k <= 7) {
                        com.papa.sim.statistic.p.l(this.f50023f).k2(AccountUtil_.getInstance_(this.f50023f).getUid(), dayRecommand.getGame_discover() != null ? dayRecommand.getGame_discover().getGame_id() : "", "todayButton", str3, "今日悟饭");
                    }
                }
            }
        }
        this.f50032o.D(this.f50034q);
        this.f50032o.notifyDataSetChanged();
    }

    void l0() {
        XRecyclerView xRecyclerView = this.f50031n;
        if (xRecyclerView != null) {
            xRecyclerView.postDelayed(new c(), 800L);
        }
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        XRecyclerView xRecyclerView = this.f50031n;
        if (xRecyclerView != null) {
            xRecyclerView.postDelayed(new b(), 800L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        l2.a(this.f50023f).b(str);
    }
}
