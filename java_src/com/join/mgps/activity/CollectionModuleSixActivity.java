package com.join.mgps.activity;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.BaseAppCompatActivity;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.g;
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
@EActivity(R.layout.activity_collection_module_six)
/* loaded from: classes.dex */
public class CollectionModuleSixActivity extends BaseAppCompatActivity implements AbsListView.OnScrollListener {
    private static final String X = "CollectionModuleSixActivity";
    @StringRes(resName = "net_excption")
    String A;
    @StringRes(resName = "connect_server_excption")
    String B;
    @Extra
    String E;
    @Extra
    ExtBean F;
    private SimpleDraweeView G;
    private LinearLayout H;
    private TextView I;
    private BreakBeanMain J;
    List<DownloadTask> O;
    com.join.android.app.component.video.c S;
    @ViewById
    ImageView U;
    @ViewById
    ImageView V;
    private Animation W;

    /* renamed from: b  reason: collision with root package name */
    private Context f29165b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    PtrClassicFrameLayout f29166c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    XListView2 f29167d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f29168e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f29169f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f29170g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    ImageView f29171h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    ImageView f29172i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ImageView f29173j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    RelativeLayout f29174k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    RelativeLayout f29175l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    RelativeLayout f29176m;
    @ViewById(R.id.title_normal_search_img)

    /* renamed from: n  reason: collision with root package name */
    ImageView f29177n;
    @ViewById(R.id.title_normal_search_img_rl)

    /* renamed from: o  reason: collision with root package name */
    ImageView f29178o;
    @ViewById(R.id.title_normal_download_cdv)

    /* renamed from: p  reason: collision with root package name */
    CustomerDownloadView f29179p;
    @ViewById(R.id.downLayout)

    /* renamed from: q  reason: collision with root package name */
    RelativeLayout f29180q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    TextView f29181r;

    /* renamed from: s  reason: collision with root package name */
    private CollectionBean f29182s;

    /* renamed from: t  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f29183t;

    /* renamed from: u  reason: collision with root package name */
    private com.join.mgps.adapter.g f29184u;

    /* renamed from: v  reason: collision with root package name */
    private CollectionDataBean f29185v;

    /* renamed from: w  reason: collision with root package name */
    private String f29186w;

    /* renamed from: x  reason: collision with root package name */
    private String f29187x;

    /* renamed from: y  reason: collision with root package name */
    private String f29188y;

    /* renamed from: z  reason: collision with root package name */
    com.join.mgps.rpc.e f29189z;
    private int C = 1;
    private int D = 10;
    private int K = 0;
    private Map<String, DownloadTask> L = new ConcurrentHashMap();
    Map<String, DownloadTask> M = new HashMap();
    Map<String, DownloadTask> N = new HashMap();
    private int P = 0;
    private boolean Q = false;
    private int R = 0;
    int T = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (CollectionModuleSixActivity.this.Q) {
                return;
            }
            CollectionModuleSixActivity.this.m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (CollectionModuleSixActivity.this.Q) {
                return;
            }
            CollectionModuleSixActivity.this.C = 1;
            CollectionModuleSixActivity.this.m0();
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
            if (i5 >= CollectionModuleSixActivity.this.f29183t.size() || i5 < 0) {
                return;
            }
            CollectionBeanSub collectionBeanSub = (CollectionBeanSub) CollectionModuleSixActivity.this.f29183t.get(i5);
            if (collectionBeanSub.getGame_id() != null) {
                IntentUtil.getInstance().intentActivity(CollectionModuleSixActivity.this.f29165b, collectionBeanSub.getIntentDataBean());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements Animation.AnimationListener {
        d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    private void receiveDelete(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.O.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.L.remove(next.getCrc_link_type_val());
                it2.remove();
                for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f29183t) {
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        DownloadTask downloadTask2 = this.L.get(collectionBeanSubBusiness.getMod_info().getMod_game_id());
                        DownloadTask downloadTask3 = this.L.get(collectionBeanSubBusiness.getGame_id());
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
        this.f29167d.requestLayout();
        this.f29184u.notifyDataSetChanged();
    }

    private void receiveError(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.L;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            this.f29184u.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        UtilsMy.A4(this.O);
        if (!this.L.containsKey(downloadTask.getCrc_link_type_val())) {
            this.O.add(downloadTask);
            this.L.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        updateDowStateList(downloadTask);
        this.f29184u.notifyDataSetChanged();
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.L;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.O.add(downloadTask);
            this.L.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        updateDowStateList(downloadTask);
        DownloadTask downloadTask2 = this.L.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        this.f29167d.requestLayout();
        this.f29184u.notifyDataSetChanged();
    }

    private void updateDowStateList(DownloadTask downloadTask) {
        try {
            for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f29183t) {
                if (collectionBeanSubBusiness.getMod_info() != null) {
                    ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                    DownloadTask downloadTask2 = this.L.get(mod_info.getMain_game_id());
                    boolean z4 = true;
                    boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                    DownloadTask downloadTask3 = this.L.get(mod_info.getMod_game_id());
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
        for (int i4 = this.T; i4 <= this.K; i4++) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) this.f29167d.getItemAtPosition(i4);
            if (collectionBeanSubBusiness != null && (downloadTask = collectionBeanSubBusiness.getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                View childAt = this.f29167d.getChildAt(i4 - this.T);
                if (childAt.getTag() instanceof g.b) {
                    g.b bVar = (g.b) childAt.getTag();
                    try {
                        DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                        if (f5 == null) {
                            return;
                        }
                        long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                        if (downloadTask.getSize() == 0) {
                            TextView textView = bVar.f44384m;
                            textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        } else {
                            TextView textView2 = bVar.f44384m;
                            textView2.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        }
                        if (downloadTask.getStatus() == 12) {
                            bVar.f44387p.setProgress((int) f5.getProgress());
                        } else {
                            bVar.f44386o.setProgress((int) f5.getProgress());
                        }
                        if (downloadTask.getStatus() == 2) {
                            TextView textView3 = bVar.f44385n;
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

    private List<CollectionBeanSubBusiness> x0(List<CollectionBeanSubBusiness> list) {
        for (CollectionBeanSubBusiness collectionBeanSubBusiness : list) {
            for (DownloadTask downloadTask : this.O) {
                if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getGame_id())) {
                    collectionBeanSubBusiness.setDownloadTask(downloadTask);
                }
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f29189z = com.join.mgps.rpc.impl.d.P1();
        try {
            this.f29165b = this;
            this.S = new com.join.android.app.component.video.c(this, X);
            com.join.mgps.Util.d0.a().d(this);
            List<DownloadTask> d5 = p1.f.K().d();
            this.O = d5;
            if (d5 != null && d5.size() > 0) {
                for (DownloadTask downloadTask : this.O) {
                    this.L.put(downloadTask.getCrc_link_type_val(), downloadTask);
                }
            }
            getDownloadTaskInfo();
            this.f29177n.setVisibility(0);
            this.f29178o.setVisibility(0);
            this.f29179p.setVisibility(0);
            this.f29180q.setVisibility(0);
            showLoding();
            this.f29176m.setVisibility(8);
            this.f29176m.setAlpha(0.0f);
            this.f29174k.setBackgroundColor(Color.parseColor("#212F3C"));
            View inflate = LayoutInflater.from(this.f29165b).inflate(R.layout.collection_six_new_header, (ViewGroup) null);
            this.G = (SimpleDraweeView) inflate.findViewById(R.id.imgBreak);
            int width = getWindowManager().getDefaultDisplay().getWidth();
            this.R = (width * 526) / 720;
            this.G.setLayoutParams(new RelativeLayout.LayoutParams(width, this.R));
            this.I = (TextView) inflate.findViewById(R.id.textViewBreak);
            this.H = (LinearLayout) inflate.findViewById(R.id.headerViewLl);
            this.f29167d.addHeaderView(inflate);
            com.join.mgps.adapter.g gVar = new com.join.mgps.adapter.g(this.f29165b, this.S);
            this.f29184u = gVar;
            this.f29183t = gVar.d();
            this.f29167d.setAdapter((ListAdapter) this.f29184u);
            this.f29167d.setPreLoadCount(10);
            m0();
            this.f29167d.setPullLoadEnable(new a());
            this.f29167d.setPullRefreshEnable(new b());
            this.f29167d.setOnItemClickListener(new c());
            this.f29167d.setOnScrollListener(this);
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.M
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.M
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.N
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.N
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.M
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.M
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.M
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.M
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.M
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.M
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.N
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.N
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.CollectionModuleSixActivity.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.M.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.N.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k0() {
        IntentUtil.getInstance().goCollectionCommentActivity(this, this.E);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void m0() {
        if (com.join.android.app.common.utils.j.j(this.f29165b)) {
            this.Q = true;
            try {
                try {
                    CollectionBean G1 = this.f29189z.G1(n0(this.E, this.C));
                    this.f29182s = G1;
                    if (G1 != null) {
                        if (G1.getMessages().getData() != null && this.f29182s.getMessages().getData().size() > 0) {
                            CollectionDataBean collectionDataBean = this.f29182s.getMessages().getData().get(0);
                            this.f29185v = collectionDataBean;
                            if (collectionDataBean.getInfo().size() > 0) {
                                List<CollectionBeanSub> sub = this.f29185v.getInfo().get(0).getSub();
                                BreakBeanMain main = this.f29185v.getInfo().get(0).getMain();
                                this.J = main;
                                if (main != null) {
                                    this.f29186w = main.getCollection_title();
                                    this.f29187x = this.J.getTpl_pic();
                                    this.f29188y = this.J.getInfo();
                                }
                                this.C++;
                                ArrayList arrayList = new ArrayList();
                                for (CollectionBeanSub collectionBeanSub : sub) {
                                    ExtBean extBean = this.F;
                                    if (extBean != null && extBean.isKeepOrginFrom() && !TextUtils.isEmpty(this.F.getOrginFrom())) {
                                        try {
                                            collectionBeanSub.set_from(Integer.parseInt(this.F.getOrginFrom()));
                                            collectionBeanSub.set_from_type(Integer.parseInt(this.F.getOrginFrom()));
                                        } catch (Exception unused) {
                                        }
                                    } else {
                                        ExtBean extBean2 = this.F;
                                        if (extBean2 != null && extBean2.get_from_type() == 134) {
                                            collectionBeanSub.set_from(13401);
                                            collectionBeanSub.set_from_type(13401);
                                        } else {
                                            collectionBeanSub.set_from(111);
                                            collectionBeanSub.set_from_type(121);
                                        }
                                    }
                                    arrayList.add(new CollectionBeanSubBusiness(collectionBeanSub));
                                }
                                s0(x0(arrayList));
                            } else if (this.C == 1) {
                                showLodingFailed();
                                y0();
                            } else {
                                q0();
                                y0();
                            }
                        } else {
                            showLodingFailed();
                            y0();
                        }
                    } else {
                        showLodingFailed();
                        y0();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    y0();
                    showLodingFailed();
                }
                return;
            } finally {
                this.Q = false;
            }
        }
        y0();
        showLodingFailed();
    }

    public CommonRequestBean n0(String str, int i4) {
        return RequestBeanUtil.getInstance(this.f29165b).getCollectionRequestBean(str, i4, this.D, "", "", this.F);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o0() {
        showLoding();
        this.C = 1;
        m0();
    }

    @Override // com.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (com.join.android.app.component.video.a.c0(this, X)) {
            return;
        }
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.android.app.component.video.c cVar = this.S;
        if (cVar != null) {
            cVar.G();
        }
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
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        com.join.android.app.component.video.c cVar = this.S;
        if (cVar != null) {
            cVar.H();
        }
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.join.android.app.component.video.c cVar = this.S;
        if (cVar != null) {
            cVar.I();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.S.f(absListView, i4, i5, i6);
        this.K = (i5 + i4) - 1;
        this.T = i4;
        View childAt = this.f29167d.getChildAt(0);
        if (childAt != null) {
            int firstVisiblePosition = (-childAt.getTop()) + (this.f29167d.getFirstVisiblePosition() * childAt.getHeight());
            int height = this.R - this.H.getHeight();
            if (firstVisiblePosition == 0) {
                this.f29175l.setVisibility(0);
                this.f29176m.setVisibility(8);
                this.f29176m.setAlpha(0.0f);
            } else if (firstVisiblePosition >= height) {
                this.f29175l.setVisibility(8);
                this.f29176m.setVisibility(0);
                this.f29176m.setAlpha(1.0f);
            } else {
                this.f29175l.setVisibility(0);
                this.f29176m.setVisibility(0);
                this.f29176m.setAlpha(firstVisiblePosition / height);
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        if (i4 == 0 && Fresco.getImagePipeline().H()) {
            Fresco.getImagePipeline().N();
        }
        this.S.j(absListView, i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.join.mgps.Util.v0.c("onstop");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        com.join.android.app.common.manager.a.h().j(this.f29165b, this.A, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        this.f29167d.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void r0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        com.join.mgps.adapter.g gVar = this.f29184u;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.C = 1;
        showLoding();
        m0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s0(List<CollectionBeanSubBusiness> list) {
        if (list != null) {
            try {
                if (list.size() == 0) {
                    return;
                }
                this.f29170g.setVisibility(8);
                this.f29169f.setVisibility(8);
                this.f29166c.setVisibility(0);
                if (this.C == 2) {
                    this.f29183t.clear();
                }
                this.F = null;
                this.f29183t.addAll(list);
                if (this.C == 2) {
                    String str = this.f29186w;
                    if (str != null) {
                        this.f29168e.setText(str);
                    }
                    String str2 = this.f29188y;
                    if (str2 != null) {
                        this.I.setText(str2);
                    }
                    String str3 = this.f29187x;
                    if (str3 != null) {
                        MyImageLoader.d(this.G, R.drawable.banner_normal_icon, str3.trim());
                    }
                    if (list.size() < 10) {
                        q0();
                    }
                }
                this.f29184u.notifyDataSetChanged();
                y0();
                this.S.M(1);
                this.S.n(this.f29167d);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void serverConnectionException() {
        com.join.android.app.common.manager.a.h().j(this.f29165b, this.B, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f29165b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            this.f29169f.setVisibility(0);
            this.f29170g.setVisibility(8);
            this.f29166c.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        try {
            List<CollectionBeanSubBusiness> list = this.f29183t;
            if (list != null || list.size() == 0) {
                this.f29170g.setVisibility(0);
                this.f29169f.setVisibility(8);
                this.f29166c.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void startLineAnimation() {
        this.V.setImageResource(R.drawable.line_blue_bg);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f29165b, R.anim.img_translate);
        this.W = loadAnimation;
        loadAnimation.setFillAfter(true);
        this.U.setVisibility(0);
        this.U.startAnimation(this.W);
        this.W.setAnimationListener(new d());
    }

    void stopLineAnimation() {
        this.U.clearAnimation();
        this.U.setVisibility(8);
        this.V.setImageResource(R.drawable.line_white_bg);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0(int i4, int i5) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void u0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        int i4;
        try {
            Map<String, DownloadTask> map = this.M;
            int i5 = 0;
            if (map != null) {
                i5 = map.size();
                i4 = this.N.size();
            } else {
                i4 = 0;
            }
            this.f29179p.setDownloadGameNum(i5);
            if (i4 > 0) {
                startLineAnimation();
                this.f29179p.d();
            } else {
                stopLineAnimation();
                this.f29179p.g();
            }
            updateDownloadingPoint(i5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadingPoint(int i4) {
        if (i4 == 0) {
            this.f29181r.setVisibility(4);
            this.f29181r.setText("");
            return;
        }
        if (i4 < 100) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f29181r.getLayoutParams();
            layoutParams.width = getResources().getDimensionPixelOffset(R.dimen.wdp24);
            layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.wdp24);
            this.f29181r.setLayoutParams(layoutParams);
            this.f29181r.setCompoundDrawables(null, null, null, null);
            this.f29181r.setBackgroundResource(R.drawable.mygame_big_round);
            this.f29181r.setPadding(1, 0, 0, 1);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f29181r.getLayoutParams();
            layoutParams2.width = getResources().getDimensionPixelOffset(R.dimen.dp70);
            layoutParams2.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            layoutParams2.setMargins(4, (int) TypedValue.applyDimension(1, 7.0f, getResources().getDisplayMetrics()), 0, 0);
            this.f29181r.setGravity(17);
            this.f29181r.setLayoutParams(layoutParams2);
            this.f29181r.setCompoundDrawables(null, null, null, null);
            this.f29181r.setBackgroundResource(R.drawable.message_round);
            this.f29181r.setPadding(1, 0, 2, 1);
        }
        this.f29181r.setVisibility(0);
        TextView textView = this.f29181r;
        textView.setText(i4 + "");
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
        this.f29167d.requestLayout();
        this.f29184u.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void v0() {
        SearchHintActivity_.G1(this.f29165b).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void w0() {
        SearchHintActivity_.G1(this.f29165b).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void y0() {
        this.f29167d.u();
        this.f29167d.v();
    }
}
