package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.BaseFragmentActivity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.InformationListDataBean;
import com.join.mgps.dto.InformationMainBean;
import com.join.mgps.dto.InformationMessageBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Where;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.information_layout)
/* loaded from: classes.dex */
public class MGInformationActivity extends BaseFragmentActivity implements AbsListView.OnScrollListener {

    /* renamed from: b  reason: collision with root package name */
    private Context f34508b;

    /* renamed from: c  reason: collision with root package name */
    private int f34509c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    PtrClassicFrameLayout f34510d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    XListView2 f34511e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f34512f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f34513g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f34514h;

    /* renamed from: i  reason: collision with root package name */
    com.join.mgps.rpc.e f34515i;
    @ViewById(R.id.title_normal_search_img)

    /* renamed from: j  reason: collision with root package name */
    ImageView f34516j;
    @ViewById(R.id.title_normal_download_cdv)

    /* renamed from: k  reason: collision with root package name */
    CustomerDownloadView f34517k;
    @Extra

    /* renamed from: l  reason: collision with root package name */
    ExtBean f34518l;

    /* renamed from: o  reason: collision with root package name */
    private com.join.mgps.adapter.y1 f34521o;

    /* renamed from: m  reason: collision with root package name */
    private List<InformationListDataBean> f34519m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    private boolean f34520n = false;

    /* renamed from: p  reason: collision with root package name */
    Map<String, DownloadTask> f34522p = new HashMap();

    /* renamed from: q  reason: collision with root package name */
    Map<String, DownloadTask> f34523q = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (MGInformationActivity.this.f34520n) {
                return;
            }
            MGInformationActivity.this.j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (MGInformationActivity.this.f34520n) {
                return;
            }
            MGInformationActivity.this.f34509c = 1;
            MGInformationActivity.this.j0();
        }
    }

    private void i0() {
        Activity splashActivity = IntentUtil.getInstance().getSplashActivity();
        if (splashActivity != null) {
            splashActivity.finish();
            IntentUtil.getInstance().setSplashActivity(null);
            Intent intent = new Intent();
            intent.setClass(splashActivity, MGMainActivity_.class);
            intent.setFlags(TTAdConstant.KEY_CLICK_AREA);
            intent.addFlags(536870912);
            startActivity(intent);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        i0();
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f34522p
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f34522p
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f34523q
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f34523q
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34522p
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34522p
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34523q
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34523q
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34523q
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34523q
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34522p
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34522p
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34523q
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34523q
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34523q
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34523q
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f34522p
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f34522p
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f34523q
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f34523q
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MGInformationActivity.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void f0() {
        try {
            this.f34515i = com.join.mgps.rpc.impl.d.P1();
            getDownloadTaskInfo();
            org.greenrobot.eventbus.c.f().t(this);
            this.f34516j.setVisibility(0);
            this.f34517k.setVisibility(0);
            this.f34508b = this;
            this.f34511e.setPreLoadCount(10);
            this.f34511e.setPullLoadEnable(new a());
            this.f34511e.setPullRefreshEnable(new b());
            showLoading();
            com.join.mgps.adapter.y1 y1Var = new com.join.mgps.adapter.y1(this.f34508b, this.f34519m, this.f34518l);
            this.f34521o = y1Var;
            this.f34511e.setAdapter((ListAdapter) y1Var);
            this.f34509c = 1;
            j0();
            this.f34511e.setOnScrollListener(this);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.f34522p.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.f34523q.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j0() {
        if (com.join.android.app.common.utils.j.j(this.f34508b)) {
            this.f34520n = true;
            try {
                try {
                    InformationMainBean v2 = this.f34515i.v(k0(this.f34509c, this.f34518l));
                    if (v2 != null) {
                        InformationMessageBean messages = v2.getMessages();
                        if (messages != null) {
                            List<InformationListDataBean> data = messages.getData();
                            if (data != null) {
                                m0(data);
                            } else {
                                l0();
                            }
                        } else {
                            l0();
                        }
                    } else {
                        l0();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    l0();
                }
                return;
            } finally {
                this.f34520n = false;
            }
        }
        l0();
    }

    public CommonRequestBean k0(int i4, ExtBean extBean) {
        return RequestBeanUtil.getInstance(this.f34508b).getInformationIndexRequestBean(i4, extBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        List<InformationListDataBean> list = this.f34519m;
        if (list == null || list.size() <= 0) {
            this.f34512f.setVisibility(8);
            this.f34513g.setVisibility(0);
            this.f34510d.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0(List<InformationListDataBean> list) {
        this.f34512f.setVisibility(8);
        this.f34513g.setVisibility(8);
        this.f34510d.setVisibility(0);
        this.f34511e.u();
        this.f34511e.v();
        if (this.f34509c == 1) {
            this.f34519m.clear();
        }
        if (list.size() > 0) {
            this.f34519m.addAll(list);
            this.f34509c++;
        } else {
            this.f34511e.setNoMore();
        }
        this.f34521o.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o0() {
        SearchHintActivity_.G1(this).start();
        com.papa.sim.statistic.p.l(this.f34508b).u2(Where.information, AccountUtil_.getInstance_(this.f34508b).getUid());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        i0();
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.f().y(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        changeDownloadTaskNumber(nVar.a(), nVar.c());
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoading();
        this.f34509c = 1;
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f34508b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoading() {
        this.f34514h.setText("大总管播报");
        this.f34512f.setVisibility(0);
        this.f34513g.setVisibility(8);
        this.f34510d.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        int size = this.f34522p.size();
        int size2 = this.f34523q.size();
        this.f34517k.setDownloadGameNum(size);
        if (size2 > 0) {
            this.f34517k.d();
        } else {
            this.f34517k.g();
        }
    }
}
