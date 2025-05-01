package com.join.mgps.activity;

import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.BaseActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.EverydayNewGameAdapter;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.business.RecomDatabeanBusiness;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView4NewGame;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.EverydayNewGameResponse;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GameBeanCollection;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.RecomDatabean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Where;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activity_everyday_new_game)
/* loaded from: classes.dex */
public class PapaEverydayNewGameActivity extends BaseActivity {

    /* renamed from: v  reason: collision with root package name */
    private static final String f36389v = "PapaEverydayNewGameActivity";
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f36390b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f36391c;
    @ViewById(R.id.title_textview)

    /* renamed from: d  reason: collision with root package name */
    TextView f36392d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ForumLoadingView f36393e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    XListView4NewGame f36394f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    PtrClassicFrameLayout f36395g;
    @ViewById(R.id.title_normal_search_img)

    /* renamed from: h  reason: collision with root package name */
    ImageView f36396h;
    @ViewById(R.id.title_normal_download_cdv)

    /* renamed from: i  reason: collision with root package name */
    CustomerDownloadView f36397i;

    /* renamed from: k  reason: collision with root package name */
    com.join.mgps.customview.g f36399k;

    /* renamed from: l  reason: collision with root package name */
    EverydayNewGameAdapter f36400l;

    /* renamed from: m  reason: collision with root package name */
    com.join.mgps.rpc.e f36401m;

    /* renamed from: n  reason: collision with root package name */
    int f36402n;

    /* renamed from: o  reason: collision with root package name */
    int f36403o;
    @Extra

    /* renamed from: p  reason: collision with root package name */
    ExtBean f36404p;

    /* renamed from: q  reason: collision with root package name */
    volatile EverydayNewGameResponse f36405q;

    /* renamed from: u  reason: collision with root package name */
    private List<DownloadTask> f36409u;

    /* renamed from: j  reason: collision with root package name */
    Handler f36398j = new Handler();

    /* renamed from: r  reason: collision with root package name */
    private Map<String, DownloadTask> f36406r = new ConcurrentHashMap();

    /* renamed from: s  reason: collision with root package name */
    Map<String, DownloadTask> f36407s = new HashMap();

    /* renamed from: t  reason: collision with root package name */
    Map<String, DownloadTask> f36408t = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.join.mgps.customview.f {
        a() {
        }

        private void a() {
            PapaEverydayNewGameActivity papaEverydayNewGameActivity = PapaEverydayNewGameActivity.this;
            papaEverydayNewGameActivity.o0(papaEverydayNewGameActivity.f36402n + 1);
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (PapaEverydayNewGameActivity.this.l0()) {
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements com.join.mgps.customview.g {
        b() {
        }

        private void a() {
            PapaEverydayNewGameActivity papaEverydayNewGameActivity = PapaEverydayNewGameActivity.this;
            papaEverydayNewGameActivity.f36403o = 0;
            papaEverydayNewGameActivity.o0(1);
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (PapaEverydayNewGameActivity.this.l0()) {
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements EverydayNewGameAdapter.i {
        c() {
        }

        @Override // com.join.mgps.adapter.EverydayNewGameAdapter.i
        public void a(String str) {
            PapaEverydayNewGameActivity.this.u0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaEverydayNewGameActivity.this.f36394f.v();
            PapaEverydayNewGameActivity.this.f36394f.u();
            PapaEverydayNewGameActivity papaEverydayNewGameActivity = PapaEverydayNewGameActivity.this;
            if (papaEverydayNewGameActivity.f36403o == -1) {
                papaEverydayNewGameActivity.f36394f.setNoMore();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
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
            PapaEverydayNewGameActivity.this.q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
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
            PapaEverydayNewGameActivity.this.q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends ForumLoadingView.e {
        g(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            PapaEverydayNewGameActivity.this.q0();
        }
    }

    private String j0(String str) {
        ConstantIntEnum[] values = ConstantIntEnum.values();
        HashMap hashMap = new HashMap();
        for (int i4 = 0; i4 < values.length; i4++) {
            hashMap.put(values[i4].value() + "", values[i4].nickName());
        }
        if (hashMap.containsKey(str) && com.join.mgps.Util.g2.i((String) hashMap.get(str))) {
            String str2 = (String) hashMap.get(str);
            if (com.join.mgps.Util.g2.h(str2)) {
                return "最新";
            }
            return "最新" + str2;
        }
        return "";
    }

    private void k0() {
        this.f36395g.j(true);
        getDownloadTaskInfo();
        this.f36396h.setVisibility(0);
        this.f36397i.setVisibility(0);
        this.f36392d.setText("每日上新");
        com.join.mgps.Util.d0.a().d(this);
        List<DownloadTask> d5 = p1.f.K().d();
        this.f36409u = d5;
        if (d5 != null && d5.size() > 0) {
            for (DownloadTask downloadTask : this.f36409u) {
                this.f36406r.put(downloadTask.getCrc_link_type_val(), downloadTask);
                com.join.mgps.Util.v0.d("infoo", this.f36409u.size() + " tasksiz     mapsize  " + downloadTask.getStatus());
                com.join.mgps.Util.v0.d("infoo", downloadTask.toString());
            }
        }
        this.f36394f.setPreLoadCount(com.join.mgps.Util.j0.f27865e);
        this.f36394f.setPullLoadEnable(new a());
        b bVar = new b();
        this.f36399k = bVar;
        this.f36394f.setPullRefreshEnable(bVar);
        EverydayNewGameAdapter everydayNewGameAdapter = new EverydayNewGameAdapter(this);
        this.f36400l = everydayNewGameAdapter;
        everydayNewGameAdapter.p(new c());
        this.f36394f.setAdapter((ListAdapter) this.f36400l);
    }

    private void p0() {
        o0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0() {
        i0(1);
        if (com.join.android.app.common.utils.j.j(this)) {
            p0();
            return;
        }
        i0(9);
        showToast(getString(R.string.net_connect_failed));
    }

    private void receiveDelete(DownloadTask downloadTask) {
        try {
            Iterator<DownloadTask> it2 = this.f36409u.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                DownloadTask next = it2.next();
                if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    this.f36406r.remove(next.getCrc_link_type_val());
                    it2.remove();
                    break;
                }
            }
            t0(downloadTask, 2);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveError(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f36406r;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            t0(downloadTask, 3);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        UtilsMy.B4(this.f36409u, downloadTask);
        if (!this.f36406r.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f36409u.add(downloadTask);
            this.f36406r.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        t0(downloadTask, 0);
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f36406r;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f36409u.add(downloadTask);
            this.f36406r.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        DownloadTask downloadTask2 = this.f36406r.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        downloadTask2.setGameZipPath(downloadTask.getGameZipPath());
        t0(downloadTask, 1);
    }

    private void s0() {
        ArrayList arrayList = new ArrayList();
        try {
            if (this.f36405q == null) {
                return;
            }
            if (this.f36405q.getHead_ad() != null && this.f36405q.getHead_ad().size() > 0) {
                RecomDatabean recomDatabean = this.f36405q.getHead_ad().get(0);
                if (recomDatabean.getMain().getAd_switch() == 1) {
                    arrayList.add(new EverydayNewGameAdapter.j(EverydayNewGameAdapter.ViewType.VIEW_AD, new EverydayNewGameAdapter.j.a(recomDatabean)));
                }
            }
            if (this.f36405q.getThe_explosion() != null && this.f36405q.getThe_explosion().size() > 0) {
                RecomDatabean recomDatabean2 = this.f36405q.getThe_explosion().get(0);
                if (recomDatabean2.getMain() != null && recomDatabean2.getMain().getAd_switch() == 1) {
                    RecomDatabeanBusiness recomDatabeanBusiness = new RecomDatabeanBusiness(recomDatabean2);
                    for (DownloadTask downloadTask : this.f36409u) {
                        try {
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                        if (downloadTask.getCrc_link_type_val().equals(recomDatabeanBusiness.getSub().get(0).getGame_info().getCrc_sign_id())) {
                            recomDatabeanBusiness.d(downloadTask);
                            break;
                        }
                        continue;
                    }
                    arrayList.add(new EverydayNewGameAdapter.j(EverydayNewGameAdapter.ViewType.VIEW_EXPLOSION, new EverydayNewGameAdapter.j.b(recomDatabeanBusiness)));
                }
            }
            if (this.f36405q.getGame_list() != null && this.f36405q.getGame_list().size() > 0) {
                for (int i4 = 0; i4 < this.f36405q.getGame_list().size(); i4++) {
                    GameBeanCollection gameBeanCollection = this.f36405q.getGame_list().get(i4);
                    String str = gameBeanCollection.getType() + "";
                    String j02 = j0(str);
                    if (n0(str)) {
                        arrayList.add(new EverydayNewGameAdapter.j(EverydayNewGameAdapter.ViewType.VIEW_SECTION_TITLE, new EverydayNewGameAdapter.j.d(j02)));
                        ArrayList arrayList2 = new ArrayList();
                        for (int i5 = 0; i5 < gameBeanCollection.getList().size(); i5++) {
                            arrayList2.add(new CollectionBeanSubBusiness(gameBeanCollection.getList().get(i5)));
                        }
                        B0(arrayList2, this.f36409u);
                        arrayList.add(new EverydayNewGameAdapter.j(EverydayNewGameAdapter.ViewType.VIEW_GAME_LIST, new EverydayNewGameAdapter.j.c(gameBeanCollection.getType() + "", arrayList2)));
                    }
                }
            }
            r0(arrayList);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(String str) {
        if (this.f36405q == null || this.f36405q.getThe_explosion() == null || this.f36405q.getThe_explosion().size() <= 0) {
            return;
        }
        RecomDatabean recomDatabean = this.f36405q.getThe_explosion().get(0);
        if (recomDatabean.getSub() == null || recomDatabean.getSub().size() == 0 || recomDatabean.getSub().get(0).getGame_info() == null) {
            return;
        }
        recomDatabean.getSub().get(0).getGame_info().setResidual_time(str);
    }

    private void v0(int i4, EverydayNewGameResponse everydayNewGameResponse) {
        try {
            x0(everydayNewGameResponse.getHead_ad(), 129, 129);
            x0(everydayNewGameResponse.getThe_explosion(), 129, 129);
            if (everydayNewGameResponse.getGame_list() != null) {
                for (GameBeanCollection gameBeanCollection : everydayNewGameResponse.getGame_list()) {
                    for (CollectionBeanSub collectionBeanSub : gameBeanCollection.getList()) {
                        collectionBeanSub.set_from(129);
                        collectionBeanSub.set_from_type(129);
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (i4 == 1) {
            this.f36405q = everydayNewGameResponse;
        } else {
            List<GameBeanCollection> game_list = this.f36405q.getGame_list();
            if (game_list != null) {
                game_list.addAll(everydayNewGameResponse.getGame_list());
            }
        }
        s0();
    }

    private void x0(List<RecomDatabean> list, int i4, int i5) {
        AppBean game_info;
        if (list != null) {
            for (RecomDatabean recomDatabean : list) {
                if (recomDatabean.getSub() != null && recomDatabean.getSub().size() > 0 && (game_info = recomDatabean.getSub().get(0).getGame_info()) != null) {
                    game_info.set_from(i4);
                    game_info.set_from_type(i5);
                }
            }
        }
    }

    private void y0() {
        this.f36398j.postDelayed(new d(), 800L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void A0() {
        SearchHintActivity_.G1(this).start();
        com.papa.sim.statistic.p.l(this).u2(Where.everdayNew, AccountUtil_.getInstance_(this).getUid());
    }

    public void B0(List<CollectionBeanSubBusiness> list, List<DownloadTask> list2) {
        if (list2 == null) {
            return;
        }
        for (CollectionBeanSubBusiness collectionBeanSubBusiness : list) {
            Iterator<DownloadTask> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    DownloadTask next = it2.next();
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                        DownloadTask downloadTask = this.f36406r.get(mod_info.getMain_game_id());
                        boolean z4 = false;
                        boolean d5 = (downloadTask == null || downloadTask.getStatus() != 5) ? false : com.join.android.app.common.utils.e.l0(this).d(this, downloadTask.getPackageName());
                        DownloadTask downloadTask2 = this.f36406r.get(mod_info.getMod_game_id());
                        if (downloadTask2 != null && downloadTask2.getStatus() == 5) {
                            z4 = com.join.mgps.va.overmind.d.o().F(downloadTask2.getPackageName());
                        }
                        if (!z4 || !d5) {
                            if (z4) {
                                if (collectionBeanSubBusiness.getMod_info() != null && next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getMod_info().getMod_game_id())) {
                                    collectionBeanSubBusiness.setDownloadTask(next);
                                    break;
                                }
                            } else if (d5) {
                                if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                                    collectionBeanSubBusiness.setDownloadTask(next);
                                    break;
                                }
                            } else {
                                DownloadTask F = collectionBeanSubBusiness.getMod_info() != null ? p1.f.K().F(collectionBeanSubBusiness.getMod_info().getMod_game_id()) : null;
                                if (F == null) {
                                    F = p1.f.K().F(collectionBeanSubBusiness.getCrc_sign_id());
                                }
                                if (F != null && next.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                                    collectionBeanSubBusiness.setDownloadTask(next);
                                    break;
                                }
                            }
                        } else if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(next);
                            break;
                        }
                    } else if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                        collectionBeanSubBusiness.setDownloadTask(next);
                        break;
                    }
                }
            }
        }
    }

    boolean C0(int i4) {
        int i5 = this.f36403o;
        if (i5 != -1 && i4 != i5) {
            this.f36403o = i4;
            return true;
        }
        y0();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        try {
            this.f36401m = com.join.mgps.rpc.impl.d.P1();
            k0();
            q0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001c, code lost:
        if (r4 != 11) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask r3, int r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r3.getCrc_link_type_val()
            r1 = 2
            if (r4 == r1) goto L8d
            r1 = 3
            if (r4 == r1) goto L7f
            r1 = 5
            if (r4 == r1) goto L64
            r1 = 6
            if (r4 == r1) goto L56
            r1 = 7
            if (r4 == r1) goto L3b
            r1 = 10
            if (r4 == r1) goto L20
            r3 = 11
            if (r4 == r3) goto L71
            goto La7
        L20:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36407s
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36407s
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36408t
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36408t
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36407s
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36407s
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36408t
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36408t
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36408t
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36408t
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36407s
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36407s
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36408t
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36408t
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36408t
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36408t
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36407s
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36407s
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36408t
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36408t
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.PapaEverydayNewGameActivity.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.f36407s.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.f36408t.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0(int i4) {
        if (i4 == 1) {
            this.f36393e.m();
            this.f36393e.j(1);
        } else if (i4 == 2) {
            this.f36393e.j(2);
        } else if (i4 == 4) {
            this.f36393e.j(4);
        } else if (i4 == 16) {
            this.f36393e.setFailedMsg("加载失败，再试试吧~");
            ForumLoadingView forumLoadingView = this.f36393e;
            forumLoadingView.setListener(new g(forumLoadingView));
            this.f36393e.j(16);
        } else if (i4 == 9) {
            ForumLoadingView forumLoadingView2 = this.f36393e;
            forumLoadingView2.setListener(new e(forumLoadingView2));
            this.f36393e.j(9);
        } else if (i4 != 10) {
        } else {
            this.f36393e.setFailedMsg("没有更多更新哦~");
            ForumLoadingView forumLoadingView3 = this.f36393e;
            forumLoadingView3.setListener(new f(forumLoadingView3));
            this.f36393e.setReloadingVisibility(0);
            this.f36393e.j(10);
        }
    }

    boolean l0() {
        if (com.join.android.app.common.utils.j.j(getBaseContext())) {
            return true;
        }
        showToast(getString(R.string.net_connect_failed));
        i0(9);
        y0();
        return false;
    }

    boolean m0(List<GameBeanCollection> list) {
        boolean z4 = list == null || list.size() == 0;
        if (z4) {
            y0();
        }
        return z4;
    }

    boolean n0(String str) {
        ConstantIntEnum[] values = ConstantIntEnum.values();
        HashMap hashMap = new HashMap();
        for (int i4 = 0; i4 < values.length; i4++) {
            hashMap.put(values[i4].value() + "", values[i4].nickName());
        }
        return hashMap.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
        if (r5.f36403o != (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
        if (r5.f36403o == (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008a, code lost:
        r5.f36403o = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008c, code lost:
        y0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0(int r6) {
        /*
            r5 = this;
            boolean r0 = com.join.android.app.common.utils.j.j(r5)
            if (r0 == 0) goto L9a
            r0 = 0
            r1 = -1
            boolean r2 = r5.C0(r6)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            if (r2 != 0) goto L21
            boolean r6 = com.join.android.app.common.utils.j.j(r5)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            if (r6 != 0) goto L17
            r5.y0()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
        L17:
            int r6 = r5.f36403o
            if (r6 == r1) goto L1d
            r5.f36403o = r0
        L1d:
            r5.y0()
            return
        L21:
            com.join.mgps.Util.RequestBeanUtil r2 = com.join.mgps.Util.RequestBeanUtil.getInstance(r5)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            int r3 = com.join.mgps.Util.j0.f27864d     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            r4 = 0
            com.join.mgps.dto.CommonRequestBean r2 = r2.getEverdayNewGame(r6, r3, r4)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            com.join.mgps.rpc.e r3 = r5.f36401m     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            com.join.mgps.dto.ResultMainBean r2 = r3.x(r2)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            if (r2 == 0) goto L72
            int r3 = r2.getCode()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            r4 = 600(0x258, float:8.41E-43)
            if (r3 != r4) goto L72
            com.join.mgps.dto.ResultMessageBean r2 = r2.getMessages()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            java.lang.Object r2 = r2.getData()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            com.join.mgps.dto.EverydayNewGameResponse r2 = (com.join.mgps.dto.EverydayNewGameResponse) r2     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            r5.v0(r6, r2)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            if (r2 == 0) goto L63
            java.util.List r3 = r2.getGame_list()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            if (r3 == 0) goto L63
            java.util.List r2 = r2.getGame_list()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            boolean r2 = r5.m0(r2)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            if (r2 == 0) goto L5c
            goto L63
        L5c:
            r5.f36402n = r6     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            r6 = 2
            r5.i0(r6)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            goto L76
        L63:
            r5.f36403o = r1     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            r5.y0()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            int r6 = r5.f36403o
            if (r6 == r1) goto L6e
            r5.f36403o = r0
        L6e:
            r5.y0()
            return
        L72:
            r6 = 4
            r5.i0(r6)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
        L76:
            int r6 = r5.f36403o
            if (r6 == r1) goto L8c
            goto L8a
        L7b:
            r6 = move-exception
            goto L90
        L7d:
            r6 = move-exception
            r2 = 16
            r5.i0(r2)     // Catch: java.lang.Throwable -> L7b
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L7b
            int r6 = r5.f36403o
            if (r6 == r1) goto L8c
        L8a:
            r5.f36403o = r0
        L8c:
            r5.y0()
            goto Lac
        L90:
            int r2 = r5.f36403o
            if (r2 == r1) goto L96
            r5.f36403o = r0
        L96:
            r5.y0()
            throw r6
        L9a:
            r6 = 2131755673(0x7f100299, float:1.9142232E38)
            java.lang.String r6 = r5.getString(r6)
            r5.showToast(r6)
            r6 = 9
            r5.i0(r6)
            r5.y0()
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.PapaEverydayNewGameActivity.o0(int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.Util.d0.a().e(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        changeDownloadTaskNumber(a5, nVar.c());
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
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0(List<EverydayNewGameAdapter.j> list) {
        this.f36400l.o(list);
        this.f36400l.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    void t0(DownloadTask downloadTask, int i4) {
        EverydayNewGameAdapter everydayNewGameAdapter = this.f36400l;
        if (everydayNewGameAdapter != null) {
            everydayNewGameAdapter.l(downloadTask, this.f36406r, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        int size = this.f36407s.size();
        int size2 = this.f36408t.size();
        this.f36397i.setDownloadGameNum(size);
        StringBuilder sb = new StringBuilder();
        sb.append("updateDownloadView: ");
        sb.append(size2);
        sb.append("::::已经进入下载队列中的数量:::");
        sb.append(size);
        if (size2 > 0) {
            this.f36397i.d();
        } else {
            this.f36397i.g();
        }
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void w0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        EverydayNewGameAdapter everydayNewGameAdapter = this.f36400l;
        if (everydayNewGameAdapter != null) {
            everydayNewGameAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void z0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
    }
}
