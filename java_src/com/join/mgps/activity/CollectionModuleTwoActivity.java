package com.join.mgps.activity;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.BaseFragmentActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
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
import com.join.mgps.dto.BreakBeanMain;
import com.join.mgps.dto.CollectionBean;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CollectionDataBean;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Data;
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
@EActivity(R.layout.category_collection_break)
/* loaded from: classes.dex */
public class CollectionModuleTwoActivity extends BaseFragmentActivity implements AbsListView.OnScrollListener {
    private static final String N = "CollectionModuleTwoActivity";
    private TextView A;
    private BreakBeanMain B;
    List<DownloadTask> G;
    @ViewById
    RelativeLayout K;
    @ViewById
    ImageView L;
    @ViewById
    TextView M;

    /* renamed from: b  reason: collision with root package name */
    private Context f29260b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    PtrClassicFrameLayout f29261c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    XListView2 f29262d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f29263e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f29264f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f29265g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    ImageView f29266h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    ImageView f29267i;
    @ViewById(R.id.title_normal_search_img)

    /* renamed from: j  reason: collision with root package name */
    ImageView f29268j;
    @ViewById(R.id.title_normal_download_cdv)

    /* renamed from: k  reason: collision with root package name */
    CustomerDownloadView f29269k;

    /* renamed from: l  reason: collision with root package name */
    private CollectionBean f29270l;

    /* renamed from: m  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f29271m;

    /* renamed from: n  reason: collision with root package name */
    private com.join.mgps.adapter.e f29272n;

    /* renamed from: o  reason: collision with root package name */
    private CollectionDataBean f29273o;

    /* renamed from: p  reason: collision with root package name */
    private String f29274p;

    /* renamed from: q  reason: collision with root package name */
    private String f29275q;

    /* renamed from: r  reason: collision with root package name */
    private String f29276r;

    /* renamed from: s  reason: collision with root package name */
    com.join.mgps.rpc.e f29277s;
    @StringRes(resName = "net_excption")

    /* renamed from: t  reason: collision with root package name */
    String f29278t;
    @StringRes(resName = "connect_server_excption")

    /* renamed from: u  reason: collision with root package name */
    String f29279u;
    @Extra

    /* renamed from: x  reason: collision with root package name */
    String f29282x;
    @Extra

    /* renamed from: y  reason: collision with root package name */
    ExtBean f29283y;

    /* renamed from: z  reason: collision with root package name */
    private SimpleDraweeView f29284z;

    /* renamed from: v  reason: collision with root package name */
    private int f29280v = 1;

    /* renamed from: w  reason: collision with root package name */
    private int f29281w = 10;
    private int C = 0;
    private Map<String, DownloadTask> D = new ConcurrentHashMap();
    Map<String, DownloadTask> E = new HashMap();
    Map<String, DownloadTask> F = new HashMap();
    private int H = 0;
    private boolean I = false;
    private boolean J = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (CollectionModuleTwoActivity.this.I) {
                return;
            }
            CollectionModuleTwoActivity.this.l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (CollectionModuleTwoActivity.this.I) {
                return;
            }
            CollectionModuleTwoActivity.this.f29280v = 1;
            CollectionModuleTwoActivity.this.l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements AdapterView.OnItemClickListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            int i5 = i4 - 1;
            if (i5 >= CollectionModuleTwoActivity.this.f29271m.size() || i5 < 0) {
                return;
            }
            CollectionBeanSub collectionBeanSub = (CollectionBeanSub) CollectionModuleTwoActivity.this.f29271m.get(i5);
            if (collectionBeanSub.getGame_id() != null) {
                IntentUtil.getInstance().intentActivity(CollectionModuleTwoActivity.this.f29260b, collectionBeanSub.getIntentDataBean());
            }
        }
    }

    private void k0() {
        try {
            try {
                if (!this.J) {
                    this.J = true;
                    int lastVisiblePosition = this.f29262d.getLastVisiblePosition();
                    for (int i4 = 0; i4 <= lastVisiblePosition; i4++) {
                        CollectionBeanSubBusiness collectionBeanSubBusiness = this.f29271m.get(i4);
                        if (!collectionBeanSubBusiness.isHasExposure()) {
                            collectionBeanSubBusiness.setHasExposure(true);
                            if (UtilsMy.f2(collectionBeanSubBusiness)) {
                                try {
                                    Ext ext = new Ext();
                                    ext.setResultCode("discount_game");
                                    ext.setScenesCode(getClass().getSimpleName());
                                    Data data = new Data();
                                    data.setGameId(Long.parseLong(collectionBeanSubBusiness.getGame_id()));
                                    com.papa.sim.statistic.p.l(this.f29260b).Y(Event.expGameAdPage, ext, data);
                                } catch (Exception e5) {
                                    e5.printStackTrace();
                                }
                            }
                        }
                    }
                }
            } finally {
                this.J = false;
            }
        } catch (Exception unused) {
        }
    }

    private void receiveDelete(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.G.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.D.remove(next.getCrc_link_type_val());
                it2.remove();
                for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f29271m) {
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        DownloadTask downloadTask2 = this.D.get(collectionBeanSubBusiness.getMod_info().getMod_game_id());
                        DownloadTask downloadTask3 = this.D.get(collectionBeanSubBusiness.getGame_id());
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
        this.f29262d.requestLayout();
        this.f29272n.notifyDataSetChanged();
    }

    private void receiveError(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.D;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            this.f29272n.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        UtilsMy.A4(this.G);
        if (!this.D.containsKey(downloadTask.getCrc_link_type_val())) {
            this.G.add(downloadTask);
            this.D.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        updateDowStateList(downloadTask);
        this.f29272n.notifyDataSetChanged();
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.D;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.G.add(downloadTask);
            this.D.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        updateDowStateList(downloadTask);
        DownloadTask downloadTask2 = this.D.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        this.f29262d.requestLayout();
        this.f29272n.notifyDataSetChanged();
    }

    private List<CollectionBeanSubBusiness> u0(List<CollectionBeanSubBusiness> list) {
        if (this.G == null) {
            return list;
        }
        for (CollectionBeanSubBusiness collectionBeanSubBusiness : list) {
            Iterator<DownloadTask> it2 = this.G.iterator();
            while (true) {
                if (it2.hasNext()) {
                    DownloadTask next = it2.next();
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                        DownloadTask downloadTask = this.D.get(mod_info.getMain_game_id());
                        boolean z4 = false;
                        boolean d5 = (downloadTask == null || downloadTask.getStatus() != 5) ? false : com.join.android.app.common.utils.e.l0(this).d(this, downloadTask.getPackageName());
                        DownloadTask downloadTask2 = this.D.get(mod_info.getMod_game_id());
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
        return list;
    }

    private void updateDowStateList(DownloadTask downloadTask) {
        try {
            for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f29271m) {
                if (collectionBeanSubBusiness.getMod_info() != null) {
                    ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                    DownloadTask downloadTask2 = this.D.get(mod_info.getMain_game_id());
                    boolean z4 = true;
                    boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                    DownloadTask downloadTask3 = this.D.get(mod_info.getMod_game_id());
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
        for (int i4 = this.H; i4 <= this.C; i4++) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) this.f29262d.getItemAtPosition(i4);
            if (collectionBeanSubBusiness != null && (downloadTask = collectionBeanSubBusiness.getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                View childAt = this.f29262d.getChildAt(i4 - this.H);
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
        ExtBean extBean;
        this.f29277s = com.join.mgps.rpc.impl.d.P1();
        try {
            this.f29260b = this;
            com.join.mgps.Util.d0.a().d(this);
            List<DownloadTask> d5 = p1.f.K().d();
            this.G = d5;
            if (d5 != null && d5.size() > 0) {
                for (DownloadTask downloadTask : this.G) {
                    this.D.put(downloadTask.getCrc_link_type_val(), downloadTask);
                }
            }
            if (TextUtils.equals(this.f29282x, "1635244880") && (extBean = this.f29283y) != null) {
                extBean.setFrom("166");
                this.f29283y.set_from_type(166);
            }
            getDownloadTaskInfo();
            this.f29268j.setVisibility(0);
            this.f29269k.setVisibility(0);
            showLoding();
            View inflate = LayoutInflater.from(this.f29260b).inflate(R.layout.collection_two_header, (ViewGroup) null);
            this.f29284z = (SimpleDraweeView) inflate.findViewById(R.id.imgBreak);
            this.A = (TextView) inflate.findViewById(R.id.textViewBreak);
            this.f29262d.addHeaderView(inflate);
            com.join.mgps.adapter.e eVar = new com.join.mgps.adapter.e(this.f29260b);
            this.f29272n = eVar;
            this.f29271m = eVar.c();
            this.f29262d.setAdapter((ListAdapter) this.f29272n);
            this.f29262d.setPreLoadCount(10);
            l0();
            this.f29262d.setPullLoadEnable(new a());
            this.f29262d.setPullRefreshEnable(new b());
            this.f29262d.setOnItemClickListener(new c());
            this.f29262d.setOnScrollListener(this);
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.E
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.E
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.F
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.F
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.E
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.E
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.F
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.F
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.F
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.F
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.E
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.E
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.F
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.F
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.F
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.F
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.E
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.E
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.F
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.F
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.CollectionModuleTwoActivity.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.E.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.F.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        IntentUtil.getInstance().goCollectionCommentActivity(this, this.f29282x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void l0() {
        if (com.join.android.app.common.utils.j.j(this.f29260b)) {
            this.I = true;
            try {
                try {
                    CollectionBean G1 = this.f29277s.G1(m0(this.f29282x, this.f29280v));
                    this.f29270l = G1;
                    if (G1 != null) {
                        if (G1.getMessages().getData() != null && this.f29270l.getMessages().getData().size() > 0) {
                            CollectionDataBean collectionDataBean = this.f29270l.getMessages().getData().get(0);
                            this.f29273o = collectionDataBean;
                            try {
                                r0(collectionDataBean.getComment_switch(), this.f29273o.getComment_count());
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                            if (this.f29273o.getInfo().size() > 0) {
                                List<CollectionBeanSub> sub = this.f29273o.getInfo().get(0).getSub();
                                BreakBeanMain main = this.f29273o.getInfo().get(0).getMain();
                                this.B = main;
                                if (main != null) {
                                    this.f29274p = main.getCollection_title();
                                    this.f29275q = this.B.getTpl_pic();
                                    this.f29276r = this.B.getInfo();
                                }
                                this.f29280v++;
                                ArrayList arrayList = new ArrayList();
                                for (CollectionBeanSub collectionBeanSub : sub) {
                                    ExtBean extBean = this.f29283y;
                                    if (extBean != null && extBean.isKeepOrginFrom() && !TextUtils.isEmpty(this.f29283y.getOrginFrom())) {
                                        try {
                                            collectionBeanSub.set_from(Integer.parseInt(this.f29283y.getOrginFrom()));
                                            collectionBeanSub.set_from_type(Integer.parseInt(this.f29283y.getOrginFrom()));
                                        } catch (Exception unused) {
                                        }
                                    } else {
                                        ExtBean extBean2 = this.f29283y;
                                        if (extBean2 != null && extBean2.get_from_type() == 166) {
                                            collectionBeanSub.set_from(166);
                                            collectionBeanSub.set_from_type(166);
                                        } else {
                                            ExtBean extBean3 = this.f29283y;
                                            if (extBean3 != null && extBean3.get_from_type() == 134) {
                                                collectionBeanSub.set_from(13401);
                                                collectionBeanSub.set_from_type(13401);
                                            } else {
                                                collectionBeanSub.set_from(111);
                                                collectionBeanSub.set_from_type(121);
                                            }
                                        }
                                    }
                                    arrayList.add(new CollectionBeanSubBusiness(collectionBeanSub));
                                }
                                q0(u0(arrayList));
                            } else if (this.f29280v == 1) {
                                showLodingFailed();
                                v0();
                            } else {
                                o0();
                                v0();
                            }
                        } else {
                            showLodingFailed();
                            v0();
                        }
                    } else {
                        showLodingFailed();
                        v0();
                    }
                } finally {
                    this.I = false;
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                v0();
                showLodingFailed();
            }
            return;
        }
        v0();
        showLodingFailed();
    }

    public CommonRequestBean m0(String str, int i4) {
        return RequestBeanUtil.getInstance(this.f29260b).getCollectionRequestBean(str, i4, this.f29281w, "", "", this.f29283y);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        com.join.android.app.common.manager.a.h().j(this.f29260b, this.f29278t, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        this.f29262d.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
    public void onPause() {
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UtilsMy.q4(this);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.C = (i5 + i4) - 1;
        this.H = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        if (i4 == 0) {
            k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.join.mgps.Util.v0.c("onstop");
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
        com.join.mgps.adapter.e eVar = this.f29272n;
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
                this.f29265g.setVisibility(8);
                this.f29264f.setVisibility(8);
                this.f29261c.setVisibility(0);
                if (this.f29280v == 2) {
                    this.f29271m.clear();
                }
                this.f29283y = null;
                this.f29271m.addAll(list);
                if (this.f29280v == 2) {
                    String str = this.f29274p;
                    if (str != null) {
                        this.f29263e.setText(str);
                    }
                    String str2 = this.f29276r;
                    if (str2 != null) {
                        this.A.setText(str2);
                    }
                    String str3 = this.f29275q;
                    if (str3 != null) {
                        MyImageLoader.d(this.f29284z, R.drawable.banner_normal_icon, str3.trim());
                    }
                    if (list.size() < 10) {
                        o0();
                    }
                }
                this.f29272n.notifyDataSetChanged();
                v0();
                k0();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0(int i4, int i5) {
        if (i4 == 1) {
            this.K.setVisibility(0);
            this.L.setVisibility(0);
            if (i5 > 0) {
                this.M.setVisibility(0);
            }
            TextView textView = this.M;
            textView.setText(i5 + "");
            return;
        }
        this.K.setVisibility(8);
        this.L.setVisibility(8);
        this.M.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f29280v = 1;
        showLoding();
        l0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void s0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void serverConnectionException() {
        com.join.android.app.common.manager.a.h().j(this.f29260b, this.f29279u, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f29260b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            this.f29264f.setVisibility(0);
            this.f29265g.setVisibility(8);
            this.f29261c.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        try {
            List<CollectionBeanSubBusiness> list = this.f29271m;
            if (list != null || list.size() == 0) {
                this.f29265g.setVisibility(0);
                this.f29264f.setVisibility(8);
                this.f29261c.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void t0() {
        SearchHintActivity_.G1(this.f29260b).start();
        com.papa.sim.statistic.p.l(this.f29260b).u2(Where.modetwo, AccountUtil_.getInstance_(this.f29260b).getUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        int i4;
        try {
            Map<String, DownloadTask> map = this.E;
            int i5 = 0;
            if (map != null) {
                i5 = map.size();
                i4 = this.F.size();
            } else {
                i4 = 0;
            }
            this.f29269k.setDownloadGameNum(i5);
            if (i4 > 0) {
                this.f29269k.d();
            } else {
                this.f29269k.g();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
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
        this.f29262d.requestLayout();
        this.f29272n.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v0() {
        this.f29262d.u();
        this.f29262d.v();
    }
}
