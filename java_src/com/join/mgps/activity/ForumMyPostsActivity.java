package com.join.mgps.activity;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.BaseAppCompatActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.ForumBaseAdapter;
import com.join.mgps.customview.ForumLoadingView;
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
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activity_forum_my_post)
/* loaded from: classes.dex */
public class ForumMyPostsActivity extends BaseAppCompatActivity implements AbsListView.OnScrollListener {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    ImageView f30508b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f30509c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ForumLoadingView f30510d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    PtrClassicFrameLayout f30511e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    XListView2 f30512f;

    /* renamed from: g  reason: collision with root package name */
    private List<ForumBean.ForumPostsBean> f30513g;

    /* renamed from: h  reason: collision with root package name */
    private ForumBaseAdapter f30514h;
    @StringRes(resName = "net_excption")

    /* renamed from: i  reason: collision with root package name */
    String f30515i;
    @StringRes(resName = "connect_server_excption")

    /* renamed from: j  reason: collision with root package name */
    String f30516j;

    /* renamed from: l  reason: collision with root package name */
    com.join.android.app.component.video.c f30518l;

    /* renamed from: m  reason: collision with root package name */
    com.join.mgps.rpc.i f30519m;

    /* renamed from: y  reason: collision with root package name */
    private com.join.mgps.rpc.e f30531y;

    /* renamed from: k  reason: collision with root package name */
    String f30517k = "ForumMyPostsActivity";

    /* renamed from: n  reason: collision with root package name */
    private int f30520n = 0;

    /* renamed from: o  reason: collision with root package name */
    private int f30521o = 0;

    /* renamed from: p  reason: collision with root package name */
    private final int f30522p = 0;

    /* renamed from: q  reason: collision with root package name */
    private final int f30523q = 16;

    /* renamed from: r  reason: collision with root package name */
    private final int f30524r = 32;

    /* renamed from: s  reason: collision with root package name */
    private final int f30525s = 17;

    /* renamed from: t  reason: collision with root package name */
    private final int f30526t = 18;

    /* renamed from: u  reason: collision with root package name */
    private final int f30527u = 20;

    /* renamed from: v  reason: collision with root package name */
    private final int f30528v = 24;

    /* renamed from: w  reason: collision with root package name */
    private int f30529w = 0;

    /* renamed from: x  reason: collision with root package name */
    Handler f30530x = new a();

    /* renamed from: z  reason: collision with root package name */
    private Map<String, DownloadTask> f30532z = new ConcurrentHashMap();
    Map<String, DownloadTask> A = new HashMap();
    Map<String, DownloadTask> B = new HashMap();
    private List<DownloadTask> C = new ArrayList();
    int D = 0;
    boolean E = false;
    List<ForumBaseAdapter.r1> F = new ArrayList();
    com.join.mgps.customview.o G = null;

    /* loaded from: classes4.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            ForumMyPostsActivity.this.f30512f.v();
            ForumMyPostsActivity.this.f30512f.u();
            if (ForumMyPostsActivity.this.f30521o == -1) {
                ForumMyPostsActivity.this.f30512f.setNoMore();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements com.join.mgps.customview.f {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f30534b;

        b(Context context) {
            this.f30534b = context;
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (!com.join.android.app.common.utils.j.j(this.f30534b)) {
                ForumMyPostsActivity forumMyPostsActivity = ForumMyPostsActivity.this;
                forumMyPostsActivity.showToast(forumMyPostsActivity.getString(R.string.net_connect_failed));
                ForumMyPostsActivity.this.F0();
                return;
            }
            ForumMyPostsActivity forumMyPostsActivity2 = ForumMyPostsActivity.this;
            forumMyPostsActivity2.o0(forumMyPostsActivity2.f30520n + 1);
            if (ForumMyPostsActivity.this.f30521o == -1) {
                ForumMyPostsActivity.this.F0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements com.join.mgps.customview.g {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f30536b;

        c(Context context) {
            this.f30536b = context;
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (com.join.android.app.common.utils.j.j(this.f30536b)) {
                ForumMyPostsActivity.this.f30521o = 0;
                ForumMyPostsActivity.this.o0(1);
                return;
            }
            ForumMyPostsActivity forumMyPostsActivity = ForumMyPostsActivity.this;
            forumMyPostsActivity.showToast(forumMyPostsActivity.getString(R.string.net_connect_failed));
            ForumMyPostsActivity.this.F0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends ForumBaseAdapter.b1 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f30538a;

        d(Context context) {
            this.f30538a = context;
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void a(int i4) {
            if (!ForumMyPostsActivity.this.isLogined(this.f30538a)) {
                ForumMyPostsActivity.this.showMessage(this.f30538a.getString(R.string.forum_user_not_login));
            } else if (!ForumMyPostsActivity.this.H0()) {
                ForumMyPostsActivity.this.D0();
            } else {
                ForumMyPostsActivity.this.B0(i4);
                ForumMyPostsActivity.this.y0(i4);
            }
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void d(int i4) {
            super.d(i4);
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(i4);
            com.join.mgps.Util.j0.v0(this.f30538a, forumPostsBean);
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void e(String str) {
            ForumMyPostsActivity forumMyPostsActivity = ForumMyPostsActivity.this;
            forumMyPostsActivity.E = true;
            forumMyPostsActivity.n0(str);
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
            ForumMyPostsActivity.this.t0();
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
            super.a(view);
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
            ForumMyPostsActivity.this.t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h extends ForumLoadingView.e {
        h(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            super.a(view);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            ForumMyPostsActivity.this.t0();
        }
    }

    private void A0() {
        int i4 = 0;
        while (true) {
            List<DownloadTask> list = this.C;
            if (list == null || i4 >= list.size()) {
                return;
            }
            w0(p1.f.K().F(this.C.get(i4).getCrc_link_type_val()), 4);
            i4++;
        }
    }

    private void C0(ForumBean.ForumPostsBean forumPostsBean, boolean z4) {
        boolean z5;
        boolean z6;
        String message;
        if (com.join.mgps.Util.g2.h(forumPostsBean.getSubject()) || com.join.mgps.Util.g2.h(forumPostsBean.getSubject().trim())) {
            z5 = z4;
            z6 = false;
        } else {
            ForumBaseAdapter.ViewType viewType = ForumBaseAdapter.ViewType.P_SUBJECT;
            boolean z7 = forumPostsBean.getBest() > 0;
            boolean z8 = forumPostsBean.getFirst() > 0;
            String subject = forumPostsBean.getSubject();
            int pid = forumPostsBean.getPid();
            int fid = forumPostsBean.getFid();
            boolean z9 = forumPostsBean.getHelp() > 0;
            this.F.add(new ForumBaseAdapter.r1(viewType, new ForumBaseAdapter.r1.p(true, z7, z8, subject, pid, fid, z9, forumPostsBean.getHelp_money() + "", forumPostsBean.getTag_info(), forumPostsBean.getTags(), forumPostsBean.getFname(), forumPostsBean.getSolve_flg())));
            z6 = true;
            z5 = true;
        }
        if (!z6) {
            ForumBaseAdapter.ViewType viewType2 = ForumBaseAdapter.ViewType.P_SUBJECT;
            boolean z10 = forumPostsBean.getBest() > 0;
            boolean z11 = forumPostsBean.getFirst() > 0;
            String message2 = forumPostsBean.getMessage();
            int pid2 = forumPostsBean.getPid();
            int fid2 = forumPostsBean.getFid();
            boolean z12 = forumPostsBean.getHelp() > 0;
            this.F.add(new ForumBaseAdapter.r1(viewType2, new ForumBaseAdapter.r1.p(true, z10, z11, message2, pid2, fid2, z12, forumPostsBean.getHelp_money() + "", forumPostsBean.getTag_info(), forumPostsBean.getTags(), forumPostsBean.getFname(), forumPostsBean.getSolve_flg())));
        } else {
            boolean z13 = forumPostsBean.getSubject() == null || com.join.mgps.Util.g2.h(forumPostsBean.getSubject().trim());
            if (!com.join.mgps.Util.g2.h(forumPostsBean.getMessage()) && !com.join.mgps.Util.g2.h(forumPostsBean.getMessage().trim())) {
                ArrayList arrayList = new ArrayList();
                if (forumPostsBean.getBest() > 0) {
                    ForumBean.ForumPostsBean.TagInfo tagInfo = new ForumBean.ForumPostsBean.TagInfo();
                    tagInfo.setName("精");
                    tagInfo.setColor("#00FFFFFF");
                    tagInfo.setFont_color("#FF8378FF");
                    tagInfo.setBorder_color("#FF8378FF");
                    arrayList.add(0, tagInfo);
                }
                if (forumPostsBean.getFirst() > 0) {
                    ForumBean.ForumPostsBean.TagInfo tagInfo2 = new ForumBean.ForumPostsBean.TagInfo();
                    tagInfo2.setName("顶");
                    tagInfo2.setColor("#00FFFFFF");
                    tagInfo2.setFont_color("#FFFF6464");
                    tagInfo2.setBorder_color("#FFFF6464");
                    arrayList.add(0, tagInfo2);
                }
                if (forumPostsBean.getTag_info() != null) {
                    arrayList.addAll(forumPostsBean.getTag_info());
                }
                String message3 = forumPostsBean.getMessage();
                boolean z14 = forumPostsBean.getHelp() > 0;
                SpannableStringBuilder m02 = com.join.mgps.Util.j0.m0(this, message3, z13, z14, forumPostsBean.getHelp_money() + "", arrayList);
                boolean z15 = z5 ^ true;
                boolean z16 = z13 && forumPostsBean.getBest() > 0;
                boolean z17 = z13 && forumPostsBean.getFirst() > 0;
                String message4 = forumPostsBean.getMessage();
                int pid3 = forumPostsBean.getPid();
                int fid3 = forumPostsBean.getFid();
                boolean z18 = z13 && forumPostsBean.getHelp() > 0;
                ForumBaseAdapter.r1.o oVar = new ForumBaseAdapter.r1.o(z15, z16, z17, message4, pid3, fid3, z18, forumPostsBean.getHelp_money() + "", z13 ? forumPostsBean.getTag_info() : null, z13, m02);
                this.F.add(new ForumBaseAdapter.r1(ForumBaseAdapter.ViewType.P_MESSAGE, oVar));
                this.f30514h.y().e(oVar);
            }
        }
        boolean z19 = (forumPostsBean.getRelation_game() == null || TextUtils.isEmpty(forumPostsBean.getRelation_game().getGame_id())) ? false : true;
        if (!z19) {
            List<ForumBean.ForumPostsBean.ResBean> rs_list = forumPostsBean.getRs_list();
            ArrayList arrayList2 = new ArrayList();
            boolean isAttach_video = forumPostsBean.isAttach_video();
            String str = "";
            String str2 = str;
            for (int i4 = 0; rs_list != null && i4 < rs_list.size(); i4++) {
                ForumBean.ForumPostsBean.ResBean resBean = rs_list.get(i4);
                if (resBean.getType().equals("pic")) {
                    arrayList2.add(resBean.getRaw());
                } else if (resBean.getType().equals("video") && com.join.mgps.Util.g2.h(str2)) {
                    str = resBean.getThumb();
                    str2 = resBean.getRaw();
                }
            }
            if (com.join.mgps.Util.g2.i(forumPostsBean.getSubject())) {
                message = forumPostsBean.getSubject();
            } else {
                message = com.join.mgps.Util.g2.i(forumPostsBean.getMessage()) ? forumPostsBean.getMessage() : "";
            }
            if (isAttach_video) {
                this.F.add(new ForumBaseAdapter.r1(ForumBaseAdapter.ViewType.P_VIDEO, new ForumBaseAdapter.r1.q(str, str2, message)));
            } else if (rs_list != null && rs_list.size() != 0) {
                this.F.add(new ForumBaseAdapter.r1(ForumBaseAdapter.ViewType.P_IMGS, new ForumBaseAdapter.r1.n(rs_list, arrayList2, forumPostsBean.getPid())));
            }
        }
        if (z19) {
            z0(forumPostsBean.getRelation_game());
            ForumBaseAdapter.ViewType viewType3 = ForumBaseAdapter.ViewType.POST_GAME;
            if (!TextUtils.isEmpty(forumPostsBean.getResource_url())) {
                viewType3 = ForumBaseAdapter.ViewType.POST_GAME_RES_LINK;
            }
            this.F.add(new ForumBaseAdapter.r1(viewType3, new ForumBaseAdapter.r1.w(true, forumPostsBean.getPid() + "", forumPostsBean.getRelation_game(), forumPostsBean.getResource_url())));
        }
        this.F.add(new ForumBaseAdapter.r1(ForumBaseAdapter.ViewType.P_FOOTER, new ForumBaseAdapter.r1.m(1, forumPostsBean.getAvatar_src(), forumPostsBean.getLast_comment_time(), forumPostsBean.getNickname(), forumPostsBean.getPraise(), forumPostsBean.getCommit(), forumPostsBean.getPid(), forumPostsBean.getView(), forumPostsBean.is_praise(), forumPostsBean.getUid())));
    }

    private com.wufan.user.service.protobuf.n0 accountBean(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 accountBean = accountBean(this);
        return accountBean != null && com.join.mgps.Util.g2.i(accountBean.getToken());
    }

    private void m0() {
        com.join.mgps.customview.o oVar = this.G;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.G.dismiss();
    }

    private void q0() {
        this.f30509c.setText("我的帖子");
        this.f30512f.setPreLoadCount(com.join.mgps.Util.j0.f27865e);
        this.f30512f.setPullLoadEnable(new b(this));
        this.f30512f.setPullRefreshEnable(new c(this));
        this.f30513g = new ArrayList();
        ForumBaseAdapter forumBaseAdapter = new ForumBaseAdapter(this, this.f30518l);
        this.f30514h = forumBaseAdapter;
        forumBaseAdapter.C0(this.f30517k);
        this.f30514h.I0(new d(this));
        this.f30512f.setAdapter((ListAdapter) this.f30514h);
        this.f30512f.setOnScrollListener(this);
    }

    private void r0() {
        k0(18);
    }

    private void receiveDelete(DownloadTask downloadTask) {
        try {
            Iterator<DownloadTask> it2 = this.C.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                DownloadTask next = it2.next();
                if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    this.f30532z.remove(next.getCrc_link_type_val());
                    it2.remove();
                    break;
                }
            }
            w0(downloadTask, 2);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveError(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f30532z;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            w0(downloadTask, 3);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        UtilsMy.B4(this.C, downloadTask);
        if (!this.f30532z.containsKey(downloadTask.getCrc_link_type_val())) {
            this.C.add(downloadTask);
            this.f30532z.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        w0(downloadTask, 0);
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f30532z;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.C.add(downloadTask);
            this.f30532z.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        DownloadTask downloadTask2 = this.f30532z.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        downloadTask2.setGameZipPath(downloadTask.getGameZipPath());
        w0(downloadTask, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        k0(0);
        r0();
        if (com.join.android.app.common.utils.j.j(this)) {
            s0();
            return;
        }
        showToast(getString(R.string.net_connect_failed));
        k0(17);
    }

    void B0(int i4) {
        ForumBean.ForumPostsBean next;
        List<ForumBean.ForumPostsBean> list = this.f30513g;
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<ForumBean.ForumPostsBean> it2 = this.f30513g.iterator();
        while (it2.hasNext() && (next = it2.next()) != null) {
            if (next.getPid() == i4) {
                next.setPraise(next.is_praise() ? next.getPraise() - 1 : next.getPraise() + 1);
                next.setIs_praise(!next.is_praise());
                v0();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D0() {
        com.join.mgps.Util.b0.f0(this).m(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void F0() {
        if (this.f30512f.j()) {
            this.f30530x.sendEmptyMessageDelayed(0, 100L);
        } else {
            this.f30530x.sendEmptyMessage(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G0(List<ForumBean.ForumPostsBean> list, int i4) {
        if (i4 == 1) {
            this.f30513g.clear();
            this.f30520n = 1;
            F0();
        }
        if (list != null && list.size() != 0) {
            this.f30513g.addAll(list);
        }
        F0();
        v0();
    }

    boolean H0() {
        if (accountBean(this) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(this).isTourist();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f30519m = com.join.mgps.rpc.impl.g.A0();
        this.f30518l = new com.join.android.app.component.video.c(this, this.f30517k);
        p0();
        q0();
        t0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    void changeDownloadTaskNumber(DownloadTask downloadTask, int i4) {
        if (downloadTask == null) {
            return;
        }
        String crc_link_type_val = downloadTask.getCrc_link_type_val();
        if (i4 == 2) {
            if (!this.A.containsKey(crc_link_type_val)) {
                this.A.put(crc_link_type_val, downloadTask);
            }
            if (this.B.containsKey(crc_link_type_val)) {
                return;
            }
            this.B.put(crc_link_type_val, downloadTask);
        } else if (i4 != 3) {
            if (i4 != 5) {
                if (i4 == 6) {
                    if (this.B.containsKey(crc_link_type_val)) {
                        this.B.remove(crc_link_type_val);
                        return;
                    }
                    return;
                } else if (i4 == 7) {
                    if (this.A.containsKey(crc_link_type_val)) {
                        this.A.remove(crc_link_type_val);
                    }
                    if (this.B.containsKey(crc_link_type_val)) {
                        this.B.remove(crc_link_type_val);
                        return;
                    }
                    return;
                } else if (i4 == 10) {
                    if (!this.A.containsKey(crc_link_type_val)) {
                        this.A.put(crc_link_type_val, downloadTask);
                    }
                    if (this.B.containsKey(crc_link_type_val)) {
                        return;
                    }
                    this.B.put(crc_link_type_val, downloadTask);
                    return;
                } else if (i4 != 11) {
                    return;
                }
            } else if (this.A.containsKey(crc_link_type_val)) {
                this.A.remove(crc_link_type_val);
            }
            if (this.B.containsKey(crc_link_type_val)) {
                this.B.remove(crc_link_type_val);
            }
        } else if (this.B.containsKey(crc_link_type_val)) {
            this.B.remove(crc_link_type_val);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0(int i4) {
        int i5 = this.f30529w;
        if (i5 == 32) {
            return;
        }
        if (i4 == 32) {
            this.f30529w = 32;
            this.f30510d.j(2);
        } else if (i4 == 0) {
            this.f30529w = 0;
            this.f30510d.m();
            this.f30510d.j(1);
        } else {
            this.f30529w = i4 | i5;
            if (l0(-11)) {
                this.f30529w = 16;
                ForumLoadingView forumLoadingView = this.f30510d;
                forumLoadingView.setListener(new e(forumLoadingView));
                this.f30510d.j(9);
            } else if (l0(22)) {
                this.f30529w = 16;
                this.f30510d.setFailedMsg("还没有发布帖子~");
                ForumLoadingView forumLoadingView2 = this.f30510d;
                forumLoadingView2.setListener(new f(forumLoadingView2));
                this.f30510d.j(10);
                this.f30510d.setReloadingVisibility(0);
                this.f30510d.setFailedReloadingRes(R.drawable.papa_loading_null);
            } else if (!l0(31) && !l0(26)) {
                if (l0(17)) {
                    this.f30529w = 16;
                    ForumLoadingView forumLoadingView3 = this.f30510d;
                    forumLoadingView3.setListener(new h(forumLoadingView3));
                    this.f30510d.j(9);
                }
            } else {
                this.f30529w = 16;
                this.f30510d.setFailedMsg("加载失败，再试试吧~");
                ForumLoadingView forumLoadingView4 = this.f30510d;
                forumLoadingView4.setListener(new g(forumLoadingView4));
                this.f30510d.j(16);
            }
        }
    }

    boolean l0(int i4) {
        return (this.f30529w & i4) == i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0(String str) {
        if (com.join.android.app.common.utils.j.j(this)) {
            if (this.D == 1) {
                return;
            }
            try {
                try {
                    com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                    ResultMainBean<List<DetailResultBean>> R = this.f30531y.R(RequestBeanUtil.getInstance(this).getAppDetialBean(str, accountData != null ? accountData.getUid() : 0, null));
                    if (R != null && R.getFlag() != 0) {
                        List<DetailResultBean> data = R.getMessages().getData();
                        if (data.size() != 0) {
                            DetailResultBean detailResultBean = data.get(0);
                            if (this.E) {
                                startDown(detailResultBean);
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
                this.D = 0;
                this.E = false;
            }
        }
        showToast("获取游戏信息失败");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (r11.f30521o != (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009f, code lost:
        if (r11.f30521o == (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a1, code lost:
        r11.f30521o = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        F0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0(int r12) {
        /*
            r11 = this;
            int r0 = r11.f30521o
            if (r12 != r0) goto L5
            return
        L5:
            r1 = -1
            if (r0 != r1) goto Lb
            r11.F0()
        Lb:
            r11.f30521o = r12
            boolean r0 = com.join.android.app.common.utils.j.j(r11)
            if (r0 == 0) goto Lb1
            r0 = 1
            r2 = 0
            if (r12 <= r0) goto L1a
            r11.E0()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
        L1a:
            com.wufan.user.service.protobuf.n0 r3 = com.join.mgps.Util.j0.T(r11)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            boolean r4 = com.join.mgps.Util.j0.Y0(r11)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            if (r4 == 0) goto L88
            com.join.mgps.rpc.i r5 = r11.f30519m     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            int r6 = r3.getUid()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            java.lang.String r7 = r3.getToken()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            int r9 = com.join.mgps.Util.j0.f27864d     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            java.lang.String r10 = ""
            r8 = r12
            com.join.mgps.dto.ForumResponse r3 = r5.k(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            r4 = 20
            if (r3 == 0) goto L77
            java.lang.Object r3 = r3.getData()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            com.join.mgps.dto.ForumData$ForumProfilePostsData r3 = (com.join.mgps.dto.ForumData.ForumProfilePostsData) r3     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            if (r3 == 0) goto L66
            java.util.List r5 = r3.getPosts_list()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            if (r5 == 0) goto L66
            java.util.List r5 = r3.getPosts_list()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            if (r5 == 0) goto L66
            r11.f30520n = r12     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            java.util.List r0 = r3.getPosts_list()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            r11.G0(r0, r12)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            r12 = 32
            r11.k0(r12)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            int r12 = r11.f30521o
            if (r12 == r1) goto La3
            goto La1
        L66:
            r11.f30521o = r1     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            if (r12 != r0) goto L6d
            r11.k0(r4)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
        L6d:
            int r12 = r11.f30521o
            if (r12 == r1) goto L73
            r11.f30521o = r2
        L73:
            r11.F0()
            return
        L77:
            r11.f30521o = r2     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            if (r12 != r0) goto L7e
            r11.k0(r4)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
        L7e:
            int r12 = r11.f30521o
            if (r12 == r1) goto L84
            r11.f30521o = r2
        L84:
            r11.F0()
            return
        L88:
            int r12 = r11.f30521o
            if (r12 == r1) goto L8e
            r11.f30521o = r2
        L8e:
            r11.F0()
            return
        L92:
            r12 = move-exception
            goto La7
        L94:
            r12 = move-exception
            r0 = 24
            r11.k0(r0)     // Catch: java.lang.Throwable -> L92
            r12.printStackTrace()     // Catch: java.lang.Throwable -> L92
            int r12 = r11.f30521o
            if (r12 == r1) goto La3
        La1:
            r11.f30521o = r2
        La3:
            r11.F0()
            goto Lc0
        La7:
            int r0 = r11.f30521o
            if (r0 == r1) goto Lad
            r11.f30521o = r2
        Lad:
            r11.F0()
            throw r12
        Lb1:
            r12 = 2131755673(0x7f100299, float:1.9142232E38)
            java.lang.String r12 = r11.getString(r12)
            r11.showToast(r12)
            r12 = 17
            r11.k0(r12)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ForumMyPostsActivity.o0(int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.Util.d0.a().e(this);
        com.join.android.app.component.video.c cVar = this.f30518l;
        if (cVar != null) {
            cVar.G();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        changeDownloadTaskNumber(a5, nVar.c());
        StringBuilder sb = new StringBuilder();
        sb.append("zip DownloadStatus =");
        sb.append(nVar.c());
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
                    updateUI(a5, 4);
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
        com.join.android.app.component.video.c cVar = this.f30518l;
        if (cVar != null) {
            cVar.H();
        }
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.join.android.app.component.video.c cVar = this.f30518l;
        if (cVar != null) {
            cVar.I();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f30518l.f(absListView, i4, i5, i6);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        this.f30518l.j(absListView, i4);
    }

    public void p0() {
        this.f30531y = com.join.mgps.rpc.impl.d.P1();
        com.join.mgps.Util.d0.a().d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void s0() {
        o0(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void startDown(DetailResultBean detailResultBean) {
        DownloadTask downloadtaskDown;
        if (detailResultBean == null || (downloadtaskDown = detailResultBean.getDownloadtaskDown()) == null) {
            return;
        }
        boolean z4 = false;
        for (int i4 = 0; i4 < this.f30513g.size(); i4++) {
            ForumBean.ForumPostsBean forumPostsBean = this.f30513g.get(i4);
            if (forumPostsBean != null && forumPostsBean.getRelation_game() != null && !TextUtils.isEmpty(forumPostsBean.getRelation_game().getGame_id()) && forumPostsBean.getRelation_game().getGame_id().equals(downloadtaskDown.getCrc_link_type_val())) {
                forumPostsBean.getRelation_game().setDownloadTask(downloadtaskDown);
                z4 |= true;
            }
        }
        if (z4) {
            v0();
        }
        if (UtilsMy.x0(downloadtaskDown.getPay_game_amount(), downloadtaskDown.getCrc_link_type_val()) > 0) {
            UtilsMy.d4(this, downloadtaskDown.getCrc_link_type_val());
            return;
        }
        UtilsMy.z1(downloadtaskDown, detailResultBean);
        if (UtilsMy.o1(this, downloadtaskDown)) {
            return;
        }
        if (detailResultBean.getDown_status() == 5) {
            UtilsMy.l1(this, downloadtaskDown);
        } else {
            UtilsMy.R0(this, downloadtaskDown, downloadtaskDown.getTp_down_url(), downloadtaskDown.getOther_down_switch(), downloadtaskDown.getCdn_down_switch());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0() {
        ForumBaseAdapter forumBaseAdapter = this.f30514h;
        if (forumBaseAdapter != null) {
            forumBaseAdapter.notifyDataSetChanged();
        }
    }

    void updateUI(DownloadTask downloadTask, int i4) {
        if (downloadTask == null) {
            if (i4 != 4) {
                return;
            }
            A0();
            return;
        }
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
                A0();
                return;
            case 5:
                receiveSuccess(downloadTask);
                return;
            case 6:
                receiveError(downloadTask);
                return;
            default:
                return;
        }
    }

    synchronized void v0() {
        if (this.f30513g == null) {
            this.f30513g = new ArrayList();
        }
        this.F.clear();
        int i4 = 0;
        while (i4 < this.f30513g.size()) {
            C0(this.f30513g.get(i4), i4 == 0);
            i4++;
        }
        ForumBaseAdapter forumBaseAdapter = this.f30514h;
        if (forumBaseAdapter != null && forumBaseAdapter.x() != null) {
            this.f30514h.x().clear();
        }
        this.f30514h.g(this.F);
        u0();
    }

    void w0(DownloadTask downloadTask, int i4) {
        boolean z4 = false;
        for (int i5 = 0; i5 < this.f30513g.size(); i5++) {
            try {
                ForumBean.ForumPostsBean forumPostsBean = this.f30513g.get(i5);
                if (forumPostsBean != null && forumPostsBean.getRelation_game() != null && !TextUtils.isEmpty(forumPostsBean.getRelation_game().getGame_id()) && forumPostsBean.getRelation_game().getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                    forumPostsBean.getRelation_game().setDownloadTask(downloadTask);
                    z4 |= true;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        if (z4) {
            v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void x0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        ForumBaseAdapter forumBaseAdapter = this.f30514h;
        if (forumBaseAdapter != null) {
            forumBaseAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void y0(int i4) {
        try {
            if (!com.join.mgps.Util.j0.Y0(this)) {
                com.join.mgps.Util.j0.L0(this);
                com.join.mgps.Util.l2.a(this).b("尚未登录，请先登录！");
                return;
            }
            ForumRequestBean.ForumPostsPraiseRequestBean e02 = com.join.mgps.Util.j0.e0(this, i4);
            e02.setDevice_id("");
            ForumResponse<ForumData.ForumPostsPraiseData> o4 = this.f30519m.o(e02.getParams());
            if (o4 == null) {
                return;
            }
            if (o4.getError() == 706) {
                B0(i4);
                D0();
                return;
            }
            ForumData.ForumPostsPraiseData data = o4.getData();
            data.isResult();
            com.join.mgps.Util.j0.m1(e02, data);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void z0(ForumBean.GameInfo gameInfo) {
        if (gameInfo != null) {
            try {
                DownloadTask F = p1.f.K().F(gameInfo.getGame_id());
                gameInfo.setDownloadTask(F);
                Map<String, DownloadTask> map = this.f30532z;
                if (map == null || F == null || map.containsKey(F.getCrc_link_type_val())) {
                    return;
                }
                this.C.add(F);
                this.f30532z.put(F.getCrc_link_type_val(), F);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }
}
