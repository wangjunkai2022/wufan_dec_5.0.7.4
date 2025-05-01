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
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.helper.MGFightUtils;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.Where;
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
public class CollectionModuleFourActivity extends BaseFragmentActivity implements AbsListView.OnScrollListener {
    @ViewById
    RelativeLayout C;
    @ViewById
    ImageView D;
    @ViewById
    TextView E;

    /* renamed from: b  reason: collision with root package name */
    private Context f29049b;

    /* renamed from: c  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f29050c;

    /* renamed from: d  reason: collision with root package name */
    private com.join.mgps.adapter.e f29051d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    PtrClassicFrameLayout f29052e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f29053f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    XListView2 f29054g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f29055h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f29056i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ImageView f29057j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ImageView f29058k;
    @ViewById(R.id.title_normal_search_img)

    /* renamed from: l  reason: collision with root package name */
    ImageView f29059l;
    @ViewById(R.id.title_normal_download_cdv)

    /* renamed from: m  reason: collision with root package name */
    CustomerDownloadView f29060m;

    /* renamed from: n  reason: collision with root package name */
    com.join.mgps.rpc.e f29061n;
    @StringRes(resName = "net_excption")

    /* renamed from: o  reason: collision with root package name */
    String f29062o;
    @StringRes(resName = "connect_server_excption")

    /* renamed from: p  reason: collision with root package name */
    String f29063p;
    @Extra

    /* renamed from: r  reason: collision with root package name */
    String f29065r;
    @Extra

    /* renamed from: s  reason: collision with root package name */
    ExtBean f29066s;

    /* renamed from: t  reason: collision with root package name */
    List<DownloadTask> f29067t;

    /* renamed from: q  reason: collision with root package name */
    private int f29064q = 1;

    /* renamed from: u  reason: collision with root package name */
    private int f29068u = 0;

    /* renamed from: v  reason: collision with root package name */
    private Map<String, DownloadTask> f29069v = new ConcurrentHashMap();

    /* renamed from: w  reason: collision with root package name */
    Map<String, DownloadTask> f29070w = new HashMap();

    /* renamed from: x  reason: collision with root package name */
    Map<String, DownloadTask> f29071x = new HashMap();

    /* renamed from: y  reason: collision with root package name */
    private String f29072y = "";

    /* renamed from: z  reason: collision with root package name */
    private int f29073z = 0;
    private boolean A = false;
    private boolean B = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (CollectionModuleFourActivity.this.A) {
                return;
            }
            CollectionModuleFourActivity.this.l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (CollectionModuleFourActivity.this.A) {
                return;
            }
            CollectionModuleFourActivity.this.f29064q = 1;
            CollectionModuleFourActivity.this.l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements AdapterView.OnItemClickListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (i4 > CollectionModuleFourActivity.this.f29050c.size() || i4 < 0) {
                return;
            }
            CollectionBeanSub collectionBeanSub = (CollectionBeanSub) CollectionModuleFourActivity.this.f29050c.get(i4);
            if (collectionBeanSub.getGame_id() != null) {
                IntentUtil.getInstance().intentActivity(CollectionModuleFourActivity.this.f29049b, collectionBeanSub.getIntentDataBean());
            }
        }
    }

    private void k0() {
        try {
            try {
                if (!this.B) {
                    this.B = true;
                    int lastVisiblePosition = this.f29054g.getLastVisiblePosition();
                    for (int i4 = 0; i4 <= lastVisiblePosition; i4++) {
                        CollectionBeanSubBusiness collectionBeanSubBusiness = this.f29050c.get(i4);
                        if (!collectionBeanSubBusiness.isHasExposure()) {
                            collectionBeanSubBusiness.setHasExposure(true);
                            if (UtilsMy.f2(collectionBeanSubBusiness)) {
                                try {
                                    Ext ext = new Ext();
                                    ext.setResultCode("discount_game");
                                    ext.setScenesCode(getClass().getSimpleName());
                                    Data data = new Data();
                                    data.setGameId(Long.parseLong(collectionBeanSubBusiness.getGame_id()));
                                    com.papa.sim.statistic.p.l(this.f29049b).Y(Event.expGameAdPage, ext, data);
                                } catch (Exception e5) {
                                    e5.printStackTrace();
                                }
                            }
                        }
                    }
                }
            } finally {
                this.B = false;
            }
        } catch (Exception unused) {
        }
    }

    private void receiveDelete(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.f29067t.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.f29069v.remove(next.getCrc_link_type_val());
                it2.remove();
                for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f29050c) {
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        DownloadTask downloadTask2 = this.f29069v.get(collectionBeanSubBusiness.getMod_info().getMod_game_id());
                        DownloadTask downloadTask3 = this.f29069v.get(collectionBeanSubBusiness.getGame_id());
                        if (downloadTask2 == null && downloadTask3 == null) {
                            collectionBeanSubBusiness.setDownloadTask(null);
                        } else if (downloadTask2 != null) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask2);
                        } else if (downloadTask3 != null) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask3);
                        } else if (collectionBeanSubBusiness.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                            collectionBeanSubBusiness.setDownloadTask(null);
                        }
                    } else if (collectionBeanSubBusiness.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                        collectionBeanSubBusiness.setDownloadTask(null);
                    }
                }
            }
        }
        this.f29054g.requestLayout();
        this.f29051d.notifyDataSetChanged();
    }

    private void receiveError(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f29069v;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            this.f29051d.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        UtilsMy.B4(this.f29067t, downloadTask);
        Map<String, DownloadTask> map = this.f29069v;
        if (map != null) {
            if (map.containsKey(downloadTask.getCrc_link_type_val())) {
                this.f29069v.get(downloadTask.getCrc_link_type_val()).setStatus(downloadTask.getStatus());
            } else {
                this.f29067t.add(downloadTask);
                this.f29069v.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        updateDowStateList(downloadTask);
        this.f29051d.notifyDataSetChanged();
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f29069v;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f29067t.add(downloadTask);
            this.f29069v.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        updateDowStateList(downloadTask);
        DownloadTask downloadTask2 = this.f29069v.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        this.f29054g.requestLayout();
        this.f29051d.notifyDataSetChanged();
    }

    private void updateDowStateList(DownloadTask downloadTask) {
        try {
            for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f29050c) {
                if (collectionBeanSubBusiness.getMod_info() != null) {
                    ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                    DownloadTask downloadTask2 = this.f29069v.get(mod_info.getMain_game_id());
                    boolean z4 = true;
                    boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                    DownloadTask downloadTask3 = this.f29069v.get(mod_info.getMod_game_id());
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
        for (int i4 = this.f29073z; i4 <= this.f29068u; i4++) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) this.f29054g.getItemAtPosition(i4);
            if (collectionBeanSubBusiness != null && (downloadTask = collectionBeanSubBusiness.getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                View childAt = this.f29054g.getChildAt(i4 - this.f29073z);
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
        this.f29061n = com.join.mgps.rpc.impl.d.P1();
        try {
            com.join.mgps.Util.d0.a().d(this);
            this.f29049b = this;
            this.f29067t = p1.f.K().d();
            getDownloadTaskInfo();
            this.f29059l.setVisibility(0);
            this.f29060m.setVisibility(0);
            List<DownloadTask> list = this.f29067t;
            if (list != null && list.size() > 0) {
                for (DownloadTask downloadTask : this.f29067t) {
                    this.f29069v.put(downloadTask.getCrc_link_type_val(), downloadTask);
                }
            }
            com.join.mgps.adapter.e eVar = new com.join.mgps.adapter.e(this.f29049b);
            this.f29051d = eVar;
            this.f29050c = eVar.c();
            showLoding();
            l0();
            this.f29054g.setPreLoadCount(10);
            this.f29054g.setPullLoadEnable(new a());
            this.f29054g.setPullRefreshEnable(new b());
            this.f29054g.setOnItemClickListener(new c());
            this.f29054g.setOnScrollListener(this);
            this.f29054g.setAdapter((ListAdapter) this.f29051d);
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f29070w
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f29070w
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f29071x
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f29071x
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f29070w
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f29070w
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f29071x
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f29071x
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f29071x
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f29071x
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f29070w
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f29070w
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f29071x
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f29071x
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f29071x
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f29071x
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f29070w
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f29070w
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f29071x
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f29071x
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.CollectionModuleFourActivity.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.f29070w.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.f29071x.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        IntentUtil.getInstance().goCollectionCommentActivity(this, this.f29065r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[Catch: all -> 0x0142, Exception -> 0x0144, TryCatch #3 {Exception -> 0x0144, blocks: (B:5:0x0011, B:7:0x0025, B:9:0x002f, B:14:0x0049, B:16:0x0053, B:18:0x007a, B:21:0x0081, B:23:0x008a, B:24:0x0093, B:26:0x0099, B:28:0x00a3, B:30:0x00a9, B:47:0x0126, B:34:0x00d0, B:36:0x00d4, B:38:0x00dc, B:39:0x00e5, B:41:0x00e9, B:43:0x00f3, B:45:0x0101, B:46:0x011c, B:48:0x0130, B:22:0x0087, B:13:0x0046, B:49:0x0137, B:50:0x013b), top: B:62:0x0011, outer: #0 }] */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l0() {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.CollectionModuleFourActivity.l0():void");
    }

    public CommonRequestBean m0(String str, int i4) {
        return RequestBeanUtil.getInstance(this.f29049b).getCollectionRequestBean(str, i4, 10, "", "", this.f29066s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        this.f29064q = 1;
        l0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        XListView2 xListView2 = this.f29054g;
        if (xListView2 == null) {
            return;
        }
        xListView2.setNoMore();
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
                    Map<String, DownloadTask> map = this.f29069v;
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UtilsMy.q4(this);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f29068u = (i5 + i4) - 1;
        this.f29073z = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        if (i4 == 0) {
            k0();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void p0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        com.join.mgps.adapter.e eVar = this.f29051d;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0(List<CollectionBeanSubBusiness> list) {
        if (list != null) {
            try {
                if (list.size() == 0) {
                    return;
                }
                this.f29056i.setVisibility(8);
                this.f29055h.setVisibility(8);
                this.f29052e.setVisibility(0);
                if (this.f29064q == 2) {
                    this.f29050c.clear();
                }
                MGFightUtils.updateStatus(this, list, this.f29067t, this.f29069v);
                this.f29066s = null;
                this.f29050c.addAll(list);
                if (this.f29064q == 2) {
                    String str = this.f29072y;
                    if (str != null) {
                        this.f29053f.setText(str);
                    }
                    this.f29050c.size();
                    this.f29051d.notifyDataSetChanged();
                    k0();
                    return;
                }
                this.f29051d.notifyDataSetChanged();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0(int i4, int i5) {
        if (i4 == 1) {
            this.C.setVisibility(0);
            this.D.setVisibility(0);
            if (i5 > 0) {
                this.E.setVisibility(0);
            }
            TextView textView = this.E;
            textView.setText(i5 + "");
            return;
        }
        this.C.setVisibility(8);
        this.D.setVisibility(8);
        this.E.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f29064q = 1;
        showLoding();
        l0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void s0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f29049b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            this.f29055h.setVisibility(0);
            this.f29056i.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        try {
            List<CollectionBeanSubBusiness> list = this.f29050c;
            if (list == null || list.size() == 0) {
                this.f29056i.setVisibility(0);
                this.f29055h.setVisibility(8);
                this.f29052e.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void t0() {
        SearchHintActivity_.G1(this.f29049b).start();
        com.papa.sim.statistic.p.l(this.f29049b).u2(Where.modufour, AccountUtil_.getInstance_(this.f29049b).getUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0() {
        XListView2 xListView2 = this.f29054g;
        if (xListView2 == null) {
            return;
        }
        xListView2.v();
        this.f29054g.u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        Map<String, DownloadTask> map;
        if (this.f29060m == null || (map = this.f29070w) == null) {
            return;
        }
        int size = map.size();
        int size2 = this.f29071x.size();
        this.f29060m.setDownloadGameNum(size);
        if (size2 > 0) {
            this.f29060m.d();
        } else {
            this.f29060m.g();
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
