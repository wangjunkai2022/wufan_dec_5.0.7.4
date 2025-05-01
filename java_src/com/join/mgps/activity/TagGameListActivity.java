package com.join.mgps.activity;

import android.content.Context;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.BaseFragmentActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.e;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.helper.MGFightUtils;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
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
import org.androidannotations.annotations.res.StringRes;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.category_collection_rank)
/* loaded from: classes.dex */
public class TagGameListActivity extends BaseFragmentActivity implements AbsListView.OnScrollListener {
    @ViewById
    RelativeLayout G;
    @ViewById
    ImageView H;
    @ViewById
    TextView I;

    /* renamed from: b  reason: collision with root package name */
    private Context f37997b;

    /* renamed from: c  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f37998c;

    /* renamed from: d  reason: collision with root package name */
    private com.join.mgps.adapter.e f37999d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    PtrClassicFrameLayout f38000e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f38001f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    XListView2 f38002g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f38003h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f38004i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ImageView f38005j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ImageView f38006k;
    @ViewById(R.id.title_normal_search_img)

    /* renamed from: l  reason: collision with root package name */
    ImageView f38007l;
    @ViewById(R.id.title_normal_download_cdv)

    /* renamed from: m  reason: collision with root package name */
    CustomerDownloadView f38008m;

    /* renamed from: n  reason: collision with root package name */
    com.join.mgps.rpc.e f38009n;

    /* renamed from: o  reason: collision with root package name */
    com.join.mgps.rpc.k f38010o;
    @StringRes(resName = "net_excption")

    /* renamed from: p  reason: collision with root package name */
    String f38011p;
    @StringRes(resName = "connect_server_excption")

    /* renamed from: q  reason: collision with root package name */
    String f38012q;
    @Extra

    /* renamed from: s  reason: collision with root package name */
    int f38014s;
    @Extra

    /* renamed from: t  reason: collision with root package name */
    int f38015t;
    @Extra

    /* renamed from: u  reason: collision with root package name */
    String f38016u;
    @Extra

    /* renamed from: v  reason: collision with root package name */
    String f38017v;
    @Extra

    /* renamed from: w  reason: collision with root package name */
    String f38018w;
    @Extra

    /* renamed from: x  reason: collision with root package name */
    boolean f38019x;

    /* renamed from: y  reason: collision with root package name */
    List<DownloadTask> f38020y;

    /* renamed from: r  reason: collision with root package name */
    private int f38013r = 1;

    /* renamed from: z  reason: collision with root package name */
    private int f38021z = 0;
    private Map<String, DownloadTask> A = new ConcurrentHashMap();
    Map<String, DownloadTask> B = new HashMap();
    Map<String, DownloadTask> C = new HashMap();
    private String D = "";
    private int E = 0;
    private boolean F = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (TagGameListActivity.this.F) {
                return;
            }
            TagGameListActivity.this.k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (TagGameListActivity.this.F) {
                return;
            }
            TagGameListActivity.this.f38013r = 1;
            TagGameListActivity.this.k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements AdapterView.OnItemClickListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (i4 > TagGameListActivity.this.f37998c.size() || i4 < 0) {
                return;
            }
            CollectionBeanSub collectionBeanSub = (CollectionBeanSub) TagGameListActivity.this.f37998c.get(i4);
            if (collectionBeanSub.getGame_id() != null) {
                IntentUtil.getInstance().intentActivity(TagGameListActivity.this.f37997b, collectionBeanSub.getIntentDataBean());
            }
        }
    }

    private void receiveDelete(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.f38020y.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.A.remove(next.getCrc_link_type_val());
                it2.remove();
                for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f37998c) {
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        DownloadTask downloadTask2 = this.A.get(collectionBeanSubBusiness.getMod_info().getMod_game_id());
                        DownloadTask downloadTask3 = this.A.get(collectionBeanSubBusiness.getGame_id());
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
        this.f38002g.requestLayout();
        this.f37999d.notifyDataSetChanged();
    }

    private void receiveError(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.A;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            this.f37999d.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        UtilsMy.B4(this.f38020y, downloadTask);
        Map<String, DownloadTask> map = this.A;
        if (map != null) {
            if (map.containsKey(downloadTask.getCrc_link_type_val())) {
                this.A.get(downloadTask.getCrc_link_type_val()).setStatus(downloadTask.getStatus());
            } else {
                this.f38020y.add(downloadTask);
                this.A.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        updateDowStateList(downloadTask);
        this.f37999d.notifyDataSetChanged();
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.A;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f38020y.add(downloadTask);
            this.A.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        updateDowStateList(downloadTask);
        DownloadTask downloadTask2 = this.A.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        this.f38002g.requestLayout();
        this.f37999d.notifyDataSetChanged();
    }

    private void t0(List<CollectionBeanSubBusiness> list) {
        if (this.f38020y == null) {
            return;
        }
        for (CollectionBeanSubBusiness collectionBeanSubBusiness : list) {
            for (DownloadTask downloadTask : this.f38020y) {
                if (collectionBeanSubBusiness.getMod_info() != null) {
                    ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                    DownloadTask downloadTask2 = this.A.get(mod_info.getMain_game_id());
                    boolean z4 = true;
                    boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                    DownloadTask downloadTask3 = this.A.get(mod_info.getMod_game_id());
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

    private void updateDowStateList(DownloadTask downloadTask) {
        try {
            for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f37998c) {
                if (collectionBeanSubBusiness.getMod_info() != null) {
                    ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                    DownloadTask downloadTask2 = this.A.get(mod_info.getMain_game_id());
                    boolean z4 = true;
                    boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                    DownloadTask downloadTask3 = this.A.get(mod_info.getMod_game_id());
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
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void updateProgressPartly() {
        DownloadTask downloadTask;
        for (int i4 = this.E; i4 <= this.f38021z; i4++) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) this.f38002g.getItemAtPosition(i4);
            if (collectionBeanSubBusiness != null && (downloadTask = collectionBeanSubBusiness.getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                View childAt = this.f38002g.getChildAt(i4 - this.E);
                if (childAt.getTag() instanceof e.b) {
                    e.b bVar = (e.b) childAt.getTag();
                    try {
                        DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                        if (f5 == null) {
                            return;
                        }
                        long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                        if (downloadTask.getSize() == 0) {
                            TextView textView = bVar.f44338j;
                            textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        } else {
                            TextView textView2 = bVar.f44338j;
                            textView2.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        }
                        if (downloadTask.getStatus() == 12) {
                            bVar.f44341m.setProgress((int) f5.getProgress());
                        } else {
                            bVar.f44340l.setProgress((int) f5.getProgress());
                        }
                        if (downloadTask.getStatus() == 2) {
                            TextView textView3 = bVar.f44339k;
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
    @AfterViews
    public void afterViews() {
        this.f38009n = com.join.mgps.rpc.impl.d.P1();
        this.f38010o = com.join.mgps.rpc.impl.i.D0();
        try {
            com.join.mgps.Util.d0.a().d(this);
            this.f37997b = this;
            this.f38020y = p1.f.K().d();
            getDownloadTaskInfo();
            this.f38007l.setVisibility(0);
            this.f38008m.setVisibility(0);
            List<DownloadTask> list = this.f38020y;
            if (list != null && list.size() > 0) {
                for (DownloadTask downloadTask : this.f38020y) {
                    this.A.put(downloadTask.getCrc_link_type_val(), downloadTask);
                }
            }
            this.f37999d = new com.join.mgps.adapter.e(this.f37997b);
            this.f37998c = new ArrayList();
            this.f37998c = this.f37999d.c();
            showLoding();
            k0();
            this.f38002g.setPreLoadCount(10);
            this.f38002g.setPullLoadEnable(new a());
            this.f38002g.setPullRefreshEnable(new b());
            this.f38002g.setOnItemClickListener(new c());
            this.f38002g.setOnScrollListener(this);
            this.f38002g.setAdapter((ListAdapter) this.f37999d);
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.B
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.B
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.C
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.C
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.B
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.B
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.C
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.C
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.C
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.C
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.B
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.B
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.C
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.C
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.C
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.C
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.B
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.B
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.C
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.C
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.TagGameListActivity.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.B.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.C.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    public ResponseModel<List<CollectionBeanSub>> j0() {
        RequestModel requestModel = new RequestModel(this.f37997b);
        int i4 = this.f38013r;
        requestModel.setArgs(new RequestGameIdArgs(i4, this.f38015t + "", this.f38016u, this.f38017v));
        return this.f38010o.h(requestModel.makeSign());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0() {
        List<CollectionBeanSub> data;
        ArrayList<CollectionBeanSub> arrayList = new ArrayList();
        if (com.join.android.app.common.utils.j.j(this.f37997b)) {
            this.F = true;
            try {
                try {
                    if (this.f38014s == 2) {
                        com.papa.sim.statistic.p.l(this.f37997b).O1(Event.goGameListPage, new Ext().setFrom("2"));
                        data = j0().getData();
                    } else {
                        data = l0().getMessages().getData();
                    }
                    if (data != null) {
                        for (CollectionBeanSub collectionBeanSub : data) {
                            arrayList.add(new CollectionBeanSubBusiness(collectionBeanSub));
                        }
                    }
                    if (arrayList.size() > 0) {
                        this.f38013r++;
                    } else {
                        n0();
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (CollectionBeanSub collectionBeanSub2 : arrayList) {
                        collectionBeanSub2.set_from(111);
                        collectionBeanSub2.set_from_type(121);
                        arrayList2.add(new CollectionBeanSubBusiness(collectionBeanSub2));
                    }
                    p0(arrayList2);
                    u0();
                } catch (Exception e5) {
                    e5.printStackTrace();
                    u0();
                    showLodingFailed();
                }
                return;
            } finally {
                this.F = false;
            }
        }
        u0();
        showLodingFailed();
    }

    public ResultMainBean<List<CollectionBeanSub>> l0() {
        int i4 = this.f38014s;
        if (i4 == 0) {
            if (this.f38019x) {
                return this.f38009n.q1(RequestBeanUtil.getInstance(this.f37997b).getTagGameListData(this.f38013r, this.f38015t));
            }
            return this.f38009n.p(RequestBeanUtil.getInstance(this.f37997b).getTagGameListData(this.f38013r, this.f38015t));
        } else if (i4 == 1) {
            return this.f38009n.z(RequestBeanUtil.getInstance(this.f37997b).getCompanyGameListData(this.f38013r, this.f38018w));
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m0() {
        this.f38013r = 1;
        k0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        XListView2 xListView2 = this.f38002g;
        if (xListView2 == null) {
            return;
        }
        xListView2.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void o0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        com.join.mgps.adapter.e eVar = this.f37999d;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
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
                } else if (c5 == 8) {
                    Map<String, DownloadTask> map = this.A;
                    if (map == null || map.isEmpty()) {
                        return;
                    }
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

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f38021z = (i5 + i4) - 1;
        this.E = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0(List<CollectionBeanSubBusiness> list) {
        String str;
        if (list != null) {
            try {
                if (list.size() == 0) {
                    return;
                }
                this.f38004i.setVisibility(8);
                this.f38003h.setVisibility(8);
                this.f38000e.setVisibility(0);
                if (this.f38013r == 2) {
                    this.f37998c.clear();
                }
                MGFightUtils.updateStatus(this, list, this.f38020y, this.A);
                this.f37998c.addAll(list);
                if (this.f38013r == 2) {
                    int i4 = this.f38014s;
                    if (i4 == 0) {
                        String str2 = this.f38016u;
                        if (str2 != null) {
                            this.f38001f.setText(str2);
                        }
                    } else if (i4 == 1) {
                        String str3 = this.f38018w;
                        if (str3 != null) {
                            this.f38001f.setText(str3);
                        }
                    } else if (i4 == 2 && (str = this.f38016u) != null) {
                        this.f38001f.setText(str);
                    }
                    this.f37998c.size();
                    this.f37999d.notifyDataSetChanged();
                    return;
                }
                this.f37999d.notifyDataSetChanged();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0(int i4, int i5) {
        if (i4 == 1) {
            this.G.setVisibility(0);
            this.H.setVisibility(0);
            if (i5 > 0) {
                this.I.setVisibility(0);
            }
            TextView textView = this.I;
            textView.setText(i5 + "");
            return;
        }
        this.G.setVisibility(8);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void r0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f38013r = 1;
        showLoding();
        k0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void s0() {
        SearchHintActivity_.G1(this.f37997b).start();
        com.papa.sim.statistic.p.l(this.f37997b).u2(Where.modufour, AccountUtil_.getInstance_(this.f37997b).getUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f37997b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            this.f38003h.setVisibility(0);
            this.f38004i.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        try {
            List<CollectionBeanSubBusiness> list = this.f37998c;
            if (list == null || list.size() == 0) {
                this.f38004i.setVisibility(0);
                this.f38003h.setVisibility(8);
                this.f38000e.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0() {
        XListView2 xListView2 = this.f38002g;
        if (xListView2 == null) {
            return;
        }
        xListView2.v();
        this.f38002g.u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        Map<String, DownloadTask> map;
        if (this.f38008m == null || (map = this.B) == null) {
            return;
        }
        int size = map.size();
        int size2 = this.C.size();
        this.f38008m.setDownloadGameNum(size);
        if (size2 > 0) {
            this.f38008m.d();
        } else {
            this.f38008m.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateUI(DownloadTask downloadTask, int i4) {
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
}
