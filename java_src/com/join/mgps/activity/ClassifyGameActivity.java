package com.join.mgps.activity;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.BaseAppCompatActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.google.android.material.appbar.AppBarLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.FlowLayout;
import com.join.mgps.customview.LoadingLayout;
import com.join.mgps.customview.SlidingTabLayoutNoViewPager;
import com.join.mgps.customview.swiperefresh.SwipeRefresh;
import com.join.mgps.dialog.u;
import com.join.mgps.dto.ClassfyTypeBean;
import com.join.mgps.dto.ClassifyGameTagBean;
import com.join.mgps.dto.ResultMainBean;
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
@EActivity(R.layout.activity_classify_game)
/* loaded from: classes.dex */
public class ClassifyGameActivity extends BaseAppCompatActivity implements View.OnClickListener, u.a {
    private static final String M = ClassifyGameActivity.class.getSimpleName();
    ClassifyListGameFragment D;
    ClassifyGameTagBean E;
    private com.join.mgps.dialog.u F;
    private FlowLayout G;
    private FlowLayout H;
    private Button I;
    private LinearLayout J;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f28649b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    SwipeRefresh f28650c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    AppBarLayout f28651d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    Toolbar f28652e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    SlidingTabLayoutNoViewPager f28653f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    SlidingTabLayoutNoViewPager f28654g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    SlidingTabLayoutNoViewPager f28655h;
    @ViewById(R.id.title_normal_download_cdv)

    /* renamed from: i  reason: collision with root package name */
    CustomerDownloadView f28656i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ImageView f28657j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    FrameLayout f28658k;

    /* renamed from: l  reason: collision with root package name */
    List<ClassifyGameTagBean> f28659l;

    /* renamed from: r  reason: collision with root package name */
    private Context f28665r;

    /* renamed from: s  reason: collision with root package name */
    com.join.mgps.rpc.e f28666s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    TextView f28667t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    TextView f28668u;
    @Extra

    /* renamed from: v  reason: collision with root package name */
    int f28669v;
    @Extra

    /* renamed from: w  reason: collision with root package name */
    int f28670w;
    @Extra

    /* renamed from: x  reason: collision with root package name */
    String f28671x;
    @Extra

    /* renamed from: y  reason: collision with root package name */
    String f28672y;

    /* renamed from: z  reason: collision with root package name */
    protected LoadingLayout f28673z;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<Fragment> f28660m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    private List<String> f28661n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    private List<String> f28662o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    Map<String, DownloadTask> f28663p = new HashMap();

    /* renamed from: q  reason: collision with root package name */
    Map<String, DownloadTask> f28664q = new HashMap();
    private int A = 0;
    List<ClassifyGameTagBean> B = new ArrayList();
    List<ClassifyGameTagBean> C = new ArrayList();
    private int K = 0;
    private String L = "default";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements SwipeRefresh.j {
        a() {
        }

        @Override // com.join.mgps.customview.swiperefresh.SwipeRefresh.j
        public void onRefresh() {
            ClassifyListGameFragment classifyListGameFragment = ClassifyGameActivity.this.D;
            if (classifyListGameFragment != null) {
                classifyListGameFragment.q0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements a1.b {
        b() {
        }

        @Override // a1.b
        public void onTabReselect(int i4) {
        }

        @Override // a1.b
        public void onTabSelect(int i4) {
            if (i4 == 1) {
                ClassifyGameActivity.this.L = "time";
            } else if (i4 == 2) {
                ClassifyGameActivity.this.L = "score";
            } else {
                ClassifyGameActivity.this.L = "default";
            }
            ClassifyGameActivity.this.p0(null);
            ClassifyGameActivity.this.t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements AppBarLayout.OnOffsetChangedListener {
        c() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i4) {
            ClassifyGameActivity.this.f28652e.setAlpha(Math.abs(i4 * 1.0f) / appBarLayout.getTotalScrollRange());
            if (Math.abs(i4) > ClassifyGameActivity.this.getResources().getDimensionPixelOffset(R.dimen.wdp75)) {
                ClassifyGameActivity.this.f28652e.setVisibility(0);
            } else {
                ClassifyGameActivity.this.f28652e.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements a1.b {
        d() {
        }

        @Override // a1.b
        public void onTabReselect(int i4) {
        }

        @Override // a1.b
        public void onTabSelect(int i4) {
            ClassifyGameActivity.this.t0();
            if (ClassifyGameActivity.this.B.size() >= i4) {
                ClassifyGameActivity classifyGameActivity = ClassifyGameActivity.this;
                classifyGameActivity.f28670w = classifyGameActivity.B.get(i4).getId();
            }
            ClassifyGameActivity.this.p0(null);
            ClassifyGameActivity classifyGameActivity2 = ClassifyGameActivity.this;
            classifyGameActivity2.f28667t.setText((CharSequence) classifyGameActivity2.f28661n.get(i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements a1.b {
        e() {
        }

        @Override // a1.b
        public void onTabReselect(int i4) {
        }

        @Override // a1.b
        public void onTabSelect(int i4) {
            ClassifyGameActivity.this.t0();
            if (ClassifyGameActivity.this.C.size() >= i4) {
                ClassifyGameActivity classifyGameActivity = ClassifyGameActivity.this;
                classifyGameActivity.f28669v = classifyGameActivity.C.get(i4).getId();
            }
            ClassifyGameActivity.this.p0(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingLayout loadingLayout = ClassifyGameActivity.this.f28673z;
            if (loadingLayout != null) {
                loadingLayout.g();
            }
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingLayout loadingLayout = ClassifyGameActivity.this.f28673z;
            if (loadingLayout != null) {
                loadingLayout.h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingLayout loadingLayout = ClassifyGameActivity.this.f28673z;
            if (loadingLayout != null) {
                loadingLayout.d();
            }
        }
    }

    private void k0() {
        this.F.dismiss();
    }

    @Override // com.join.mgps.dialog.u.a
    public void N() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f28666s = com.join.mgps.rpc.impl.d.P1();
        this.f28665r = this;
        this.f28673z = (LoadingLayout) findViewById(R.id.mLoadingLayout);
        getDownloadTaskInfo();
        org.greenrobot.eventbus.c.f().t(this);
        this.f28656i.setVisibility(0);
        this.f28657j.setVisibility(0);
        this.f28667t.setText(this.f28671x);
        this.A = ((WindowManager) this.f28665r.getSystemService("window")).getDefaultDisplay().getWidth();
        loadData();
        this.f28650c.setOnRefreshListener(new a());
        ArrayList arrayList = new ArrayList();
        List<ClassifyGameTagBean> list = this.f28659l;
        if (list != null) {
            for (ClassifyGameTagBean classifyGameTagBean : list) {
                arrayList.add(classifyGameTagBean.getName());
            }
        } else {
            this.f28659l = new ArrayList();
        }
        this.f28653f.setmTitles(new String[]{"综合", "最新", "评分"});
        this.f28653f.setOnTabSelectListener(new b());
        this.f28651d.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new c());
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f28663p
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f28663p
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f28664q
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f28664q
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f28663p
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f28663p
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f28664q
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f28664q
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f28664q
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f28664q
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f28663p
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f28663p
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f28664q
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f28664q
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f28664q
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f28664q
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f28663p
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f28663p
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f28664q
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f28664q
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ClassifyGameActivity.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.f28663p.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.f28664q.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0() {
        String str = this.f28672y;
        if (str == null || str.isEmpty()) {
            return;
        }
        for (int i4 = 0; i4 < this.f28661n.size() && !this.f28672y.equals(this.f28661n.get(i4)); i4++) {
        }
    }

    public String i0() {
        return this.L;
    }

    protected void j0() {
        new Handler(Looper.getMainLooper()).post(new h());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        this.f28649b.setVisibility(8);
        this.f28658k.setVisibility(0);
        j0();
    }

    @Background
    public void loadData() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                com.join.mgps.rpc.e eVar = this.f28666s;
                RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(this);
                int i4 = this.f28669v;
                int i5 = i4 == 0 ? 1 : 2;
                int i6 = this.f28670w;
                if (i6 != 0) {
                    i4 = i6;
                }
                ResultMainBean<ClassfyTypeBean> M0 = eVar.M0(requestBeanUtil.getClassifyGameBean(i5, i4));
                if (M0 != null && M0.getFlag() == 1 && M0.getMessages() != null) {
                    ClassfyTypeBean data = M0.getMessages().getData();
                    if (data != null) {
                        ClassifyGameTagBean classifyGameTagBean = new ClassifyGameTagBean();
                        classifyGameTagBean.setId(0);
                        classifyGameTagBean.setTitle(LocalGameActivity.f34225s);
                        this.B.addAll(data.getGame_type());
                        this.C.add(classifyGameTagBean);
                        this.C.addAll(data.getSimulator_type());
                        for (ClassifyGameTagBean classifyGameTagBean2 : this.B) {
                            this.f28661n.add(classifyGameTagBean2.getTitle());
                        }
                        for (ClassifyGameTagBean classifyGameTagBean3 : this.C) {
                            this.f28662o.add(classifyGameTagBean3.getTitle());
                        }
                        if (this.f28661n.size() > 0) {
                            p0(null);
                            l0();
                            h0();
                            return;
                        }
                        s0();
                        return;
                    }
                    q0();
                    return;
                }
                q0();
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                q0();
                return;
            }
        }
        q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m0() {
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) this.f28651d.getLayoutParams()).getBehavior();
        if (behavior instanceof AppBarLayout.Behavior) {
            AppBarLayout.Behavior behavior2 = (AppBarLayout.Behavior) behavior;
            if (behavior2.getTopAndBottomOffset() == (-this.f28651d.getTotalScrollRange())) {
                behavior2.setTopAndBottomOffset(0);
                this.f28652e.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        finish();
    }

    public void o0(boolean z4) {
        if (!z4) {
            this.f28650c.setRefreshing(false);
        } else {
            this.f28650c.setRefreshing(true);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getId();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.mgps.dialog.u uVar = this.F;
        if (uVar != null) {
            uVar.dismiss();
        }
        super.onDestroy();
        org.greenrobot.eventbus.c.f().y(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        changeDownloadTaskNumber(nVar.a(), nVar.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0(ClassifyGameTagBean classifyGameTagBean) {
        try {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            this.E = classifyGameTagBean;
            ClassifyListGameFragment classifyListGameFragment = this.D;
            String str = "10001";
            if (classifyListGameFragment == null) {
                if (classifyGameTagBean == null) {
                    SlidingTabLayoutNoViewPager slidingTabLayoutNoViewPager = this.f28654g;
                    List<String> list = this.f28661n;
                    slidingTabLayoutNoViewPager.setmTitles((String[]) list.toArray(new String[list.size()]));
                    for (int i4 = 0; i4 < this.B.size(); i4++) {
                        if (this.B.get(i4).getId() == this.f28670w) {
                            w0(this.f28654g, i4);
                        }
                    }
                    this.f28654g.setOnTabSelectListener(new d());
                    SlidingTabLayoutNoViewPager slidingTabLayoutNoViewPager2 = this.f28655h;
                    List<String> list2 = this.f28662o;
                    slidingTabLayoutNoViewPager2.setmTitles((String[]) list2.toArray(new String[list2.size()]));
                    for (int i5 = 0; i5 < this.C.size(); i5++) {
                        if (this.C.get(i5).getId() == this.f28669v) {
                            w0(this.f28655h, i5);
                        }
                    }
                    this.f28655h.setOnTabSelectListener(new e());
                    String str2 = this.f28669v == 0 ? "" : this.f28669v + "";
                    if (this.f28670w != 0) {
                        str = this.f28670w + "";
                    }
                    this.D = ClassifyListGameFragment.f0(str2, str);
                } else {
                    String str3 = this.f28669v == 0 ? "" : this.f28669v + "";
                    if (this.f28670w != 0) {
                        str = this.f28670w + "";
                    }
                    this.D = ClassifyListGameFragment.f0(str3, str);
                }
                beginTransaction.add(R.id.mViewpagerV4, this.D);
                beginTransaction.commit();
            } else if (classifyGameTagBean == null) {
                String str4 = this.f28669v == 0 ? "" : this.f28669v + "";
                if (this.f28670w != 0) {
                    str = this.f28670w + "";
                }
                classifyListGameFragment.w0(str4, str);
            } else {
                String str5 = this.f28669v == 0 ? "" : this.f28669v + "";
                if (this.f28670w != 0) {
                    str = this.f28670w + "";
                }
                classifyListGameFragment.w0(str5, str);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        t0();
    }

    protected void q0() {
        new Handler(Looper.getMainLooper()).post(new f());
    }

    protected void r0() {
        new Handler(Looper.getMainLooper()).post(new g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s0() {
        this.f28649b.setVisibility(0);
        this.f28658k.setVisibility(8);
        j0();
    }

    public void t0() {
        TextView textView = this.f28668u;
        textView.setText(this.f28653f.getSelectTabName() + " · " + this.f28654g.getSelectTabName() + " · " + this.f28655h.getSelectTabName());
        TextView textView2 = this.f28667t;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28654g.getSelectTabName());
        sb.append(com.join.mgps.Util.h0.f27805a);
        sb.append(this.f28655h.getSelectTabName());
        textView2.setText(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void u0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        int size = this.f28663p.size();
        int size2 = this.f28664q.size();
        this.f28656i.setDownloadGameNum(size);
        StringBuilder sb = new StringBuilder();
        sb.append("updateDownloadView: ");
        sb.append(size2);
        sb.append("::::已经进入下载队列中的数量:::");
        sb.append(size);
        if (size2 > 0) {
            this.f28656i.d();
        } else {
            this.f28656i.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void v0() {
        SearchHintActivity_.G1(this.f28665r).start();
        com.papa.sim.statistic.p.l(this.f28665r).u2(Where.classGame, AccountUtil_.getInstance_(this.f28665r).getUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void w0(SlidingTabLayoutNoViewPager slidingTabLayoutNoViewPager, int i4) {
        slidingTabLayoutNoViewPager.setItemSelected(i4);
    }
}
