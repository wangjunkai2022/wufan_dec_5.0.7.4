package com.join.mgps.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.HtmlDocUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.label.MainLabelActivity;
import com.join.mgps.adapter.ForumBaseAdapter;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumRequestBean;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.ResultMainBean;
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
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.fragment_lable)
/* loaded from: classes.dex */
public class LabelFragment extends FragmentPagerFragment implements AbsListView.OnScrollListener {
    private static final int E = 10;

    /* renamed from: c  reason: collision with root package name */
    int f52151c;

    /* renamed from: d  reason: collision with root package name */
    int f52152d;

    /* renamed from: e  reason: collision with root package name */
    int f52153e;

    /* renamed from: f  reason: collision with root package name */
    String f52154f;

    /* renamed from: g  reason: collision with root package name */
    com.join.mgps.rpc.i f52155g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f52156h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f52157i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    XListView2 f52158j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    PtrClassicFrameLayout f52159k;

    /* renamed from: l  reason: collision with root package name */
    Activity f52160l;

    /* renamed from: m  reason: collision with root package name */
    private ForumBaseAdapter f52161m;

    /* renamed from: o  reason: collision with root package name */
    public int f52163o;

    /* renamed from: p  reason: collision with root package name */
    public int f52164p;

    /* renamed from: r  reason: collision with root package name */
    com.join.mgps.customview.g f52166r;

    /* renamed from: t  reason: collision with root package name */
    com.join.android.app.component.video.c f52168t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    ImageView f52169u;

    /* renamed from: v  reason: collision with root package name */
    private com.join.mgps.rpc.e f52170v;

    /* renamed from: b  reason: collision with root package name */
    String f52150b = "hot";

    /* renamed from: n  reason: collision with root package name */
    boolean f52162n = true;

    /* renamed from: q  reason: collision with root package name */
    private List<ForumBean.ForumPostsBean> f52165q = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    String f52167s = "LabelFragment";

    /* renamed from: w  reason: collision with root package name */
    private Map<String, DownloadTask> f52171w = new ConcurrentHashMap();

    /* renamed from: x  reason: collision with root package name */
    Map<String, DownloadTask> f52172x = new HashMap();

    /* renamed from: y  reason: collision with root package name */
    Map<String, DownloadTask> f52173y = new HashMap();

    /* renamed from: z  reason: collision with root package name */
    private List<DownloadTask> f52174z = new ArrayList();
    int A = 0;
    boolean B = false;
    boolean C = true;
    com.join.mgps.customview.o D = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            XListView2 xListView2 = LabelFragment.this.f52158j;
            if (xListView2 == null) {
                return;
            }
            xListView2.v();
            LabelFragment.this.f52158j.u();
            LabelFragment labelFragment = LabelFragment.this;
            if (labelFragment.f52164p == -1) {
                labelFragment.f52158j.setNoMore();
                LabelFragment labelFragment2 = LabelFragment.this;
                if (labelFragment2.f52163o == 0) {
                    labelFragment2.B0();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements com.join.mgps.customview.f {
        b() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (!com.join.android.app.common.utils.j.j(LabelFragment.this.f52160l)) {
                LabelFragment.this.E0();
                LabelFragment.this.C0();
                return;
            }
            LabelFragment.this.d0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements com.join.mgps.listener.f {
        c() {
        }

        @Override // com.join.mgps.listener.f
        public void a(int i4) {
            XListView2 xListView2 = LabelFragment.this.f52158j;
            xListView2.smoothScrollToPositionFromTop(i4, xListView2.getResources().getDimensionPixelOffset(R.dimen.wdp100));
        }
    }

    /* loaded from: classes3.dex */
    class d extends ForumBaseAdapter.b1 {
        d() {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void a(int i4) {
            LabelFragment labelFragment = LabelFragment.this;
            if (!labelFragment.isLogined(labelFragment.f52160l)) {
                LabelFragment labelFragment2 = LabelFragment.this;
                labelFragment2.showMessage(labelFragment2.f52160l.getString(R.string.forum_user_not_login));
            } else if (!LabelFragment.this.I0()) {
                LabelFragment.this.y0();
            } else {
                LabelFragment.this.t0(i4);
                LabelFragment.this.k0(i4);
            }
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void d(int i4) {
            super.d(i4);
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(i4);
            com.join.mgps.Util.j0.v0(LabelFragment.this.f52160l, forumPostsBean);
        }
    }

    /* loaded from: classes3.dex */
    class e implements com.join.mgps.customview.g {
        e() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (!com.join.android.app.common.utils.j.j(LabelFragment.this.f52160l)) {
                LabelFragment.this.E0();
                LabelFragment.this.C0();
                return;
            }
            LabelFragment labelFragment = LabelFragment.this;
            labelFragment.f52164p = 0;
            labelFragment.f52163o = 0;
            labelFragment.d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f52180a;

        static {
            int[] iArr = new int[HtmlDocUtil.PostDetail.Type.values().length];
            f52180a = iArr;
            try {
                iArr[HtmlDocUtil.PostDetail.Type.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52180a[HtmlDocUtil.PostDetail.Type.Image.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52180a[HtmlDocUtil.PostDetail.Type.Video.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52180a[HtmlDocUtil.PostDetail.Type.RickText.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private com.wufan.user.service.protobuf.n0 W(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private void Z() {
        com.join.mgps.customview.o oVar = this.D;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.D.dismiss();
    }

    private void c0() {
        if (com.join.android.app.common.utils.j.j(this.f52160l)) {
            A0();
            d0();
            return;
        }
        z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 W = W(context);
        return W != null && g2.i(W.getToken());
    }

    private void m0(DownloadTask downloadTask) {
        try {
            Iterator<DownloadTask> it2 = this.f52174z.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                DownloadTask next = it2.next();
                if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    this.f52171w.remove(next.getCrc_link_type_val());
                    it2.remove();
                    break;
                }
            }
            i0(downloadTask, 2);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void n0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f52171w;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            i0(downloadTask, 3);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void o0(DownloadTask downloadTask) {
        UtilsMy.B4(this.f52174z, downloadTask);
        if (!this.f52171w.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f52174z.add(downloadTask);
            this.f52171w.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        i0(downloadTask, 0);
    }

    private void p0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f52171w;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f52174z.add(downloadTask);
            this.f52171w.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        DownloadTask downloadTask2 = this.f52171w.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        downloadTask2.setGameZipPath(downloadTask.getGameZipPath());
        i0(downloadTask, 1);
    }

    private void q0() {
        int i4 = 0;
        while (true) {
            List<DownloadTask> list = this.f52174z;
            if (list == null || i4 >= list.size()) {
                return;
            }
            i0(p1.f.K().F(this.f52174z.get(i4).getCrc_link_type_val()), 4);
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x03b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void w0(com.join.mgps.dto.ForumBean.ForumPostsBean r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.LabelFragment.w0(com.join.mgps.dto.ForumBean$ForumPostsBean, int, int):void");
    }

    private void x0(int i4) {
        for (int i5 = 0; i5 < this.f52165q.size(); i5++) {
            w0(this.f52165q.get(i5), i4, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A0() {
        this.f52159k.setVisibility(8);
        this.f52157i.setVisibility(0);
        this.f52156h.setVisibility(8);
        this.f52169u.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void B0() {
        this.f52159k.setVisibility(8);
        this.f52157i.setVisibility(8);
        this.f52156h.setVisibility(8);
        this.f52169u.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C0() {
        Activity activity = this.f52160l;
        if (activity != null) {
            l2.a(activity).b(getString(R.string.net_connect_failed));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D0(DetailResultBean detailResultBean) {
        DownloadTask downloadtaskDown;
        if (detailResultBean == null || (downloadtaskDown = detailResultBean.getDownloadtaskDown()) == null) {
            return;
        }
        boolean z4 = false;
        for (int i4 = 0; i4 < this.f52165q.size(); i4++) {
            ForumBean.ForumPostsBean forumPostsBean = this.f52165q.get(i4);
            if (forumPostsBean != null && forumPostsBean.getRelation_game() != null && !TextUtils.isEmpty(forumPostsBean.getRelation_game().getGame_id()) && forumPostsBean.getRelation_game().getGame_id().equals(downloadtaskDown.getCrc_link_type_val())) {
                forumPostsBean.getRelation_game().setDownloadTask(downloadtaskDown);
                z4 |= true;
            }
        }
        if (z4) {
            G0(this.f52165q);
        }
        if (UtilsMy.x0(downloadtaskDown.getPay_game_amount(), downloadtaskDown.getCrc_link_type_val()) > 0) {
            UtilsMy.d4(getContext(), downloadtaskDown.getCrc_link_type_val());
            return;
        }
        UtilsMy.z1(downloadtaskDown, detailResultBean);
        if (UtilsMy.o1(getContext(), downloadtaskDown)) {
            return;
        }
        if (detailResultBean.getDown_status() == 5) {
            UtilsMy.l1(getContext(), downloadtaskDown);
        } else {
            UtilsMy.R0(getContext(), downloadtaskDown, downloadtaskDown.getTp_down_url(), downloadtaskDown.getOther_down_switch(), downloadtaskDown.getCdn_down_switch());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0() {
        this.mHandler.postDelayed(new a(), 100L);
    }

    @Override // ru.noties.scrollable.j
    public void F(int i4, long j4) {
        XListView2 xListView2 = this.f52158j;
        if (xListView2 != null) {
            xListView2.smoothScrollBy(i4, (int) j4);
        }
    }

    void F0(DownloadTask downloadTask, int i4) {
        if (downloadTask == null) {
            if (i4 != 4) {
                return;
            }
            q0();
            return;
        }
        switch (i4) {
            case 1:
            case 2:
            case 7:
            case 8:
            case 9:
                o0(downloadTask);
                return;
            case 3:
                m0(downloadTask);
                return;
            case 4:
                q0();
                return;
            case 5:
                p0(downloadTask);
                return;
            case 6:
                n0(downloadTask);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G0(List<ForumBean.ForumPostsBean> list) {
        h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void H0(List<ForumBean.ForumPostsBean> list, int i4) {
        if (i4 <= 1) {
            if (list.size() <= 0) {
                B0();
                return;
            }
            this.f52165q.clear();
            u0();
            ForumBaseAdapter forumBaseAdapter = this.f52161m;
            if (forumBaseAdapter != null && forumBaseAdapter.x() != null) {
                this.f52161m.x().clear();
            }
        }
        if (list == null || list.size() < 0) {
            return;
        }
        this.f52165q.addAll(list);
        for (int i5 = 0; i5 < list.size(); i5++) {
            w0(list.get(i5), i4, i5);
        }
        this.f52161m.notifyDataSetChanged();
    }

    boolean I0() {
        if (W(this.f52160l) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(this.f52160l).isTourist();
    }

    public void X() {
        try {
            com.join.android.app.component.video.c cVar = this.f52168t;
            if (cVar != null) {
                cVar.M(1);
                this.f52168t.n(this.f52158j);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void a0(String str) {
        Context context = getContext();
        if (com.join.android.app.common.utils.j.j(context)) {
            if (this.A == 1) {
                return;
            }
            try {
                try {
                    com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(context).getAccountData();
                    ResultMainBean<List<DetailResultBean>> R = this.f52170v.R(RequestBeanUtil.getInstance(context).getAppDetialBean(str, accountData != null ? accountData.getUid() : 0, null));
                    if (R != null && R.getFlag() != 0) {
                        List<DetailResultBean> data = R.getMessages().getData();
                        if (data.size() != 0) {
                            DetailResultBean detailResultBean = data.get(0);
                            if (this.B) {
                                D0(detailResultBean);
                            }
                        }
                    } else if (R != null && R.getFlag() != 0) {
                        showToast("获取游戏信息失败");
                    } else {
                        showToast("获取游戏信息失败");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    showToast("获取游戏信息失败");
                }
                return;
            } finally {
                this.A = 0;
                this.B = false;
            }
        }
        showToast("获取游戏信息失败");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f52155g = com.join.mgps.rpc.impl.g.A0();
        Context context = getContext();
        this.f52168t = new com.join.android.app.component.video.c(context, this.f52167s + this.f52152d);
        ForumBaseAdapter forumBaseAdapter = new ForumBaseAdapter(this.f52160l, this.f52168t);
        this.f52161m = forumBaseAdapter;
        forumBaseAdapter.b1(false);
        this.f52161m.f1(new c());
        ForumBaseAdapter forumBaseAdapter2 = this.f52161m;
        forumBaseAdapter2.C0(this.f52167s + this.f52152d);
        this.f52161m.I0(new d());
        this.f52158j.setAdapter((ListAdapter) this.f52161m);
        this.f52158j.setPreLoadCount(10);
        e eVar = new e();
        this.f52166r = eVar;
        this.f52158j.setPullRefreshEnable(eVar);
        u0();
        this.f52158j.setOnScrollListener(this);
        d0();
    }

    String b0(String str, String str2) {
        if (g2.h(str2)) {
            return null;
        }
        if (str2.startsWith(com.facebook.common.util.f.f10923a) || str2.startsWith(str)) {
            return str2;
        }
        return str + str2;
    }

    void changeDownloadTaskNumber(DownloadTask downloadTask, int i4) {
        if (downloadTask == null) {
            return;
        }
        String crc_link_type_val = downloadTask.getCrc_link_type_val();
        if (i4 == 2) {
            if (!this.f52172x.containsKey(crc_link_type_val)) {
                this.f52172x.put(crc_link_type_val, downloadTask);
            }
            if (this.f52173y.containsKey(crc_link_type_val)) {
                return;
            }
            this.f52173y.put(crc_link_type_val, downloadTask);
        } else if (i4 != 3) {
            if (i4 != 5) {
                if (i4 == 6) {
                    if (this.f52173y.containsKey(crc_link_type_val)) {
                        this.f52173y.remove(crc_link_type_val);
                        return;
                    }
                    return;
                } else if (i4 == 7) {
                    if (this.f52172x.containsKey(crc_link_type_val)) {
                        this.f52172x.remove(crc_link_type_val);
                    }
                    if (this.f52173y.containsKey(crc_link_type_val)) {
                        this.f52173y.remove(crc_link_type_val);
                        return;
                    }
                    return;
                } else if (i4 == 10) {
                    if (!this.f52172x.containsKey(crc_link_type_val)) {
                        this.f52172x.put(crc_link_type_val, downloadTask);
                    }
                    if (this.f52173y.containsKey(crc_link_type_val)) {
                        return;
                    }
                    this.f52173y.put(crc_link_type_val, downloadTask);
                    return;
                } else if (i4 != 11) {
                    return;
                }
            } else if (this.f52172x.containsKey(crc_link_type_val)) {
                this.f52172x.remove(crc_link_type_val);
            }
            if (this.f52173y.containsKey(crc_link_type_val)) {
                this.f52173y.remove(crc_link_type_val);
            }
        } else if (this.f52173y.containsKey(crc_link_type_val)) {
            this.f52173y.remove(crc_link_type_val);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
        z0();
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d0() {
        /*
            r12 = this;
            int r0 = r12.f52163o
            r1 = 1
            int r0 = r0 + r1
            android.app.Activity r2 = r12.f52160l
            boolean r2 = com.join.android.app.common.utils.j.j(r2)
            if (r2 == 0) goto Lb8
            int r2 = r12.f52164p     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            r11 = -1
            if (r2 != r11) goto L15
            r12.E0()
            return
        L15:
            if (r2 != r0) goto L1b
            r12.E0()
            return
        L1b:
            r12.f52164p = r0     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            android.app.Activity r2 = r12.f52160l     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            com.join.mgps.Util.AccountUtil_ r2 = com.join.mgps.Util.AccountUtil_.getInstance_(r2)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.lang.String r3 = r2.getUid()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            android.app.Activity r2 = r12.f52160l     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            com.join.mgps.Util.AccountUtil_ r2 = com.join.mgps.Util.AccountUtil_.getInstance_(r2)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.lang.String r9 = r2.getToken()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            com.join.mgps.rpc.i r2 = r12.f52155g     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            int r4 = r12.f52151c     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            r6 = 10
            int r7 = r12.f52153e     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.lang.String r8 = r12.f52150b     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.lang.String r10 = r12.f52154f     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            r5 = r0
            com.join.mgps.dto.ResultResMainBean r2 = r2.X(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            android.app.Activity r3 = r12.f52160l     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            if (r3 == 0) goto L8a
            boolean r3 = r3.isFinishing()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            if (r3 != 0) goto L8a
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            r4 = 17
            if (r3 < r4) goto L5b
            android.app.Activity r3 = r12.f52160l     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            boolean r3 = r3.isDestroyed()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            if (r3 == 0) goto L5b
            goto L8a
        L5b:
            if (r2 == 0) goto L84
            java.lang.Object r3 = r2.getData()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            if (r3 != 0) goto L64
            goto L84
        L64:
            java.lang.Object r2 = r2.getData()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            if (r2 == 0) goto L7e
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            if (r3 != 0) goto L73
            goto L7e
        L73:
            r12.f52163o = r0     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            r12.H0(r2, r0)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            if (r0 > r1) goto Lb0
            r12.hideLoading()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            goto Lb0
        L7e:
            r12.f52164p = r11     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            r12.E0()
            return
        L84:
            if (r0 > r1) goto Lb0
            r12.z0()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            goto Lb0
        L8a:
            r12.E0()
            return
        L8e:
            r0 = move-exception
            goto Lb4
        L90:
            r2 = move-exception
            java.lang.String r3 = "Label"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r4.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = "getListData Exception:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L8e
            r4.append(r2)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L8e
            com.join.mgps.Util.v0.b(r3, r2)     // Catch: java.lang.Throwable -> L8e
            if (r0 > r1) goto Lb0
            r12.z0()     // Catch: java.lang.Throwable -> L8e
        Lb0:
            r12.E0()
            goto Lc0
        Lb4:
            r12.E0()
            throw r0
        Lb8:
            if (r0 > r1) goto Lbd
            r12.z0()
        Lbd:
            r12.C0()
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.LabelFragment.d0():void");
    }

    public void e0() {
        this.f52170v = com.join.mgps.rpc.impl.d.P1();
        com.join.mgps.Util.d0.a().d(this);
    }

    public boolean f0() {
        return this.f52162n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void g0() {
        this.f52168t.M(1);
        this.f52168t.n(this.f52158j);
    }

    synchronized void h0() {
        ForumBaseAdapter forumBaseAdapter = this.f52161m;
        if (forumBaseAdapter != null && forumBaseAdapter.x() != null) {
            this.f52161m.x().clear();
        }
        x0(this.f52163o);
        this.f52161m.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void hideLoading() {
        this.f52159k.setVisibility(0);
        this.f52157i.setVisibility(8);
        this.f52156h.setVisibility(8);
        this.f52169u.setVisibility(8);
    }

    void i0(DownloadTask downloadTask, int i4) {
        boolean z4 = false;
        for (int i5 = 0; i5 < this.f52165q.size(); i5++) {
            ForumBean.ForumPostsBean forumPostsBean = this.f52165q.get(i5);
            if (forumPostsBean != null && forumPostsBean.getRelation_game() != null && !TextUtils.isEmpty(forumPostsBean.getRelation_game().getGame_id()) && forumPostsBean.getRelation_game().getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                forumPostsBean.getRelation_game().setDownloadTask(downloadTask);
                z4 |= true;
            }
        }
        if (z4) {
            G0(this.f52165q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void j0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        ForumBaseAdapter forumBaseAdapter = this.f52161m;
        if (forumBaseAdapter != null) {
            forumBaseAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0(int i4) {
        try {
            if (!com.join.mgps.Util.j0.Y0(this.f52160l)) {
                com.join.mgps.Util.j0.L0(this.f52160l);
                l2.a(this.f52160l).b("尚未登录，请先登录！");
                return;
            }
            ForumRequestBean.ForumPostsPraiseRequestBean e02 = com.join.mgps.Util.j0.e0(this.f52160l, i4);
            e02.setDevice_id("");
            ForumResponse<ForumData.ForumPostsPraiseData> o4 = this.f52155g.o(e02.getParams());
            if (o4 == null) {
                return;
            }
            if (o4.getError() == 706) {
                t0(i4);
                y0();
                return;
            }
            ForumData.ForumPostsPraiseData data = o4.getData();
            data.isResult();
            com.join.mgps.Util.j0.m1(e02, data);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void l0(ForumBean.GameInfo gameInfo) {
        if (gameInfo != null) {
            try {
                DownloadTask F = p1.f.K().F(gameInfo.getGame_id());
                gameInfo.setDownloadTask(F);
                Map<String, DownloadTask> map = this.f52171w;
                if (map == null || F == null || map.containsKey(F.getCrc_link_type_val())) {
                    return;
                }
                this.f52174z.add(F);
                this.f52171w.put(F.getCrc_link_type_val(), F);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f52160l = (Activity) context;
    }

    public boolean onBackPressedMy() {
        Context context = getContext();
        return com.join.android.app.component.video.a.c0(context, this.f52167s + this.f52152d);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f52151c = arguments.getInt("tag_id");
        this.f52153e = arguments.getInt("type");
        this.f52152d = arguments.getInt("position");
        this.f52154f = arguments.getString("fid");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.join.android.app.component.video.c cVar = this.f52168t;
        if (cVar != null) {
            cVar.G();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f52160l = null;
        this.f52165q.clear();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        changeDownloadTaskNumber(a5, nVar.c());
        StringBuilder sb = new StringBuilder();
        sb.append("zip DownloadStatus =");
        sb.append(nVar.c());
        switch (nVar.c()) {
            case 2:
                F0(a5, 1);
                return;
            case 3:
                F0(a5, 2);
                return;
            case 4:
            case 9:
            default:
                return;
            case 5:
            case 11:
                F0(a5, 5);
                return;
            case 6:
                F0(a5, 6);
                return;
            case 7:
                F0(a5, 3);
                return;
            case 8:
                F0(a5, 4);
                return;
            case 10:
                F0(a5, 7);
                return;
            case 12:
                F0(a5, 8);
                return;
            case 13:
                F0(a5, 9);
                return;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        com.join.android.app.component.video.c cVar = this.f52168t;
        if (cVar != null) {
            cVar.H();
        }
        super.onPause();
        this.C = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity instanceof MainLabelActivity) {
            if (((MainLabelActivity) activity).n0() == this.f52152d) {
                this.C = true;
                if (this.f52158j != null) {
                    g0();
                    return;
                }
                return;
            }
            this.C = false;
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        if (getActivity() == null || !this.C) {
            return;
        }
        this.f52168t.f(absListView, i4, i5, i6);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        if (this.C && i4 == 0) {
            if (Fresco.getImagePipeline().H()) {
                Fresco.getImagePipeline().N();
            }
            if (getActivity() != null) {
                this.f52168t.j(absListView, i4);
            }
        }
    }

    @Override // ru.noties.scrollable.b
    public boolean q(int i4) {
        XListView2 xListView2 = this.f52158j;
        return xListView2 != null && xListView2.canScrollVertically(i4);
    }

    public void r0(String str) {
        this.f52154f = str;
        if (com.join.android.app.common.utils.j.j(this.f52160l)) {
            A0();
            com.join.mgps.customview.g gVar = this.f52166r;
            if (gVar != null) {
                gVar.onRefresh();
                return;
            }
            return;
        }
        C0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        c0();
    }

    public void s0(String str, boolean z4) {
        if (!TextUtils.equals(this.f52150b, str) || z4) {
            this.f52150b = str;
            if (com.join.android.app.common.utils.j.j(this.f52160l)) {
                u0();
                A0();
                com.join.mgps.customview.g gVar = this.f52166r;
                if (gVar != null) {
                    gVar.onRefresh();
                    return;
                }
                return;
            }
            C0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f52160l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        l2.a(this.f52160l).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        l2.a(getContext()).b(str);
    }

    void t0(int i4) {
        ForumBean.ForumPostsBean next;
        List<ForumBean.ForumPostsBean> list = this.f52165q;
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<ForumBean.ForumPostsBean> it2 = this.f52165q.iterator();
        while (it2.hasNext() && (next = it2.next()) != null) {
            if (next.getPid() == i4) {
                next.setPraise(next.is_praise() ? next.getPraise() - 1 : next.getPraise() + 1);
                next.setIs_praise(!next.is_praise());
                h0();
                return;
            }
        }
    }

    void u0() {
        this.f52158j.setPullLoadEnable(new b());
    }

    public void v0(boolean z4) {
        this.f52162n = z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void y0() {
        com.join.mgps.Util.b0.f0(this.f52160l).m(this.f52160l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z0() {
        this.f52159k.setVisibility(8);
        this.f52157i.setVisibility(8);
        this.f52156h.setVisibility(0);
        this.f52169u.setVisibility(8);
    }
}
