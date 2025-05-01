package com.join.mgps.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.MApplication;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.activity.DocumentManageActivity;
import com.join.mgps.customview.ClouldItemView2;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.CloudDownRecoderTable;
import com.join.mgps.dialog.w;
import com.join.mgps.dto.ArchiveBuyArgs;
import com.join.mgps.dto.ArchiveDownDataBean;
import com.join.mgps.dto.ArchiveEvaluteDataBean;
import com.join.mgps.dto.ArchiveResponseMain;
import com.join.mgps.dto.ArchiveResponseMessage;
import com.join.mgps.dto.ArchiveShopDataBean;
import com.join.mgps.dto.ArchiveevaluateArgs;
import com.join.mgps.dto.ArchiveshopArgs;
import com.join.mgps.dto.CloudListDataBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.arc.ext.ToastManager;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.item_recommed_fragment)
/* loaded from: classes.dex */
public class RecommedFragment extends Fragment implements com.join.mgps.listener.c {
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f52739c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    XListView2 f52740d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    PtrClassicFrameLayout f52741e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f52742f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f52743g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f52744h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    RelativeLayout f52745i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f52746j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    LinearLayout f52747k;

    /* renamed from: l  reason: collision with root package name */
    IntentFilter f52748l;
    @Pref

    /* renamed from: m  reason: collision with root package name */
    PrefDef_ f52749m;

    /* renamed from: n  reason: collision with root package name */
    private com.wufan.user.service.protobuf.n0 f52750n;

    /* renamed from: o  reason: collision with root package name */
    int f52751o;

    /* renamed from: p  reason: collision with root package name */
    int f52752p;

    /* renamed from: q  reason: collision with root package name */
    String f52753q;

    /* renamed from: s  reason: collision with root package name */
    int f52755s;

    /* renamed from: t  reason: collision with root package name */
    com.join.mgps.rpc.d f52756t;

    /* renamed from: u  reason: collision with root package name */
    List<CloudListDataBean> f52757u;

    /* renamed from: v  reason: collision with root package name */
    i f52758v;

    /* renamed from: w  reason: collision with root package name */
    private com.join.mgps.dialog.x f52759w;

    /* renamed from: x  reason: collision with root package name */
    DocumentManageActivity f52760x;

    /* renamed from: y  reason: collision with root package name */
    LocalBroadcastManager f52761y;

    /* renamed from: b  reason: collision with root package name */
    boolean f52738b = false;

    /* renamed from: r  reason: collision with root package name */
    int f52754r = 1;

    /* renamed from: z  reason: collision with root package name */
    boolean f52762z = false;
    boolean A = true;
    private boolean B = true;
    int C = 0;
    List<String> D = new ArrayList(0);
    List<CloudListDataBean> E = new ArrayList(0);

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecommedFragment.this.s0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements com.join.mgps.customview.f {
        b() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            RecommedFragment recommedFragment = RecommedFragment.this;
            recommedFragment.l0(recommedFragment.f52754r);
            RecommedFragment.this.W();
        }
    }

    /* loaded from: classes3.dex */
    class c implements com.join.mgps.customview.g {
        c() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            RecommedFragment recommedFragment = RecommedFragment.this;
            recommedFragment.f52754r = 1;
            recommedFragment.W();
            RecommedFragment recommedFragment2 = RecommedFragment.this;
            recommedFragment2.l0(recommedFragment2.f52754r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(MApplication.P);
            com.join.mgps.Util.j0.w0(RecommedFragment.this.getActivity(), forumPostsBean, null);
        }
    }

    /* loaded from: classes3.dex */
    class e implements w.e {
        e() {
        }

        @Override // com.join.mgps.dialog.w.e
        public void a(com.join.mgps.dialog.w wVar) {
        }
    }

    /* loaded from: classes3.dex */
    class f implements CompoundButton.OnCheckedChangeListener {
        f() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            if (z4) {
                RecommedFragment.this.B = false;
            } else {
                RecommedFragment.this.B = true;
            }
        }
    }

    /* loaded from: classes3.dex */
    class g implements w.e {
        g() {
        }

        @Override // com.join.mgps.dialog.w.e
        public void a(com.join.mgps.dialog.w wVar) {
            IntentUtil intentUtil = IntentUtil.getInstance();
            Context context = RecommedFragment.this.getContext();
            intentUtil.goShareWebActivity(context, "http://anv3btapi.5fun.com/user/activity/cloud_archive?gameId=" + RecommedFragment.this.f52753q);
            if (!RecommedFragment.this.B) {
                RecommedFragment.this.f52749m.DownloadRecoderNoticeMarcket().g(Boolean.FALSE);
            }
            wVar.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    class h implements w.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f52770a;

        h(CloudListDataBean cloudListDataBean) {
            this.f52770a = cloudListDataBean;
        }

        @Override // com.join.mgps.dialog.w.e
        public void a(com.join.mgps.dialog.w wVar) {
            RecommedFragment.this.j0(this.f52770a);
            if (!RecommedFragment.this.B) {
                RecommedFragment.this.f52749m.DownloadRecoderNoticeMarcket().g(Boolean.FALSE);
            }
            wVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class i extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        Context f52772b;

        /* loaded from: classes3.dex */
        class a {

            /* renamed from: a  reason: collision with root package name */
            ClouldItemView2 f52774a;

            /* renamed from: b  reason: collision with root package name */
            LinearLayout f52775b;

            /* renamed from: c  reason: collision with root package name */
            TextView f52776c;

            /* renamed from: d  reason: collision with root package name */
            TextView f52777d;

            a() {
            }
        }

        public i(Context context) {
            this.f52772b = context;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return RecommedFragment.this.f52757u.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return RecommedFragment.this.f52757u.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            a aVar;
            try {
                if (view == null) {
                    aVar = new a();
                    view = LayoutInflater.from(this.f52772b).inflate(R.layout.archiveshopfragmet_item, (ViewGroup) null);
                    aVar.f52774a = (ClouldItemView2) view.findViewById(R.id.coulditem);
                    aVar.f52775b = (LinearLayout) view.findViewById(R.id.ll_show);
                    aVar.f52776c = (TextView) view.findViewById(R.id.tv_today_id);
                    aVar.f52777d = (TextView) view.findViewById(R.id.tv_zong_id);
                    view.setTag(aVar);
                } else {
                    aVar = (a) view.getTag();
                }
                aVar.f52774a.setCloudItemListener(RecommedFragment.this);
                if (RecommedFragment.this.f52757u.size() - 1 == i4) {
                    ClouldItemView2 clouldItemView2 = aVar.f52774a;
                    RecommedFragment recommedFragment = RecommedFragment.this;
                    RecommedFragment recommedFragment2 = RecommedFragment.this;
                    clouldItemView2.setData(recommedFragment.f52753q, recommedFragment.f52757u.get(i4), recommedFragment2.f52752p, recommedFragment2.f52751o, false, true, recommedFragment2);
                } else {
                    ClouldItemView2 clouldItemView22 = aVar.f52774a;
                    RecommedFragment recommedFragment3 = RecommedFragment.this;
                    RecommedFragment recommedFragment4 = RecommedFragment.this;
                    clouldItemView22.setData(recommedFragment3.f52753q, recommedFragment3.f52757u.get(i4), recommedFragment4.f52752p, recommedFragment4.f52751o, false, false, recommedFragment4);
                }
                aVar.f52774a.setGBAType(RecommedFragment.this.f52760x.O);
                ClouldItemView2 clouldItemView23 = aVar.f52774a;
                DocumentManageActivity documentManageActivity = RecommedFragment.this.f52760x;
                clouldItemView23.setPGN(documentManageActivity.Q, documentManageActivity.R);
                if (RecommedFragment.this.f52751o == 4) {
                    aVar.f52775b.setVisibility(0);
                    TextView textView = aVar.f52776c;
                    textView.setText(RecommedFragment.this.f52757u.get(i4).getTodayCoin() + "");
                    TextView textView2 = aVar.f52777d;
                    textView2.setText(RecommedFragment.this.f52757u.get(i4).getTotalCoin() + "");
                } else {
                    aVar.f52775b.setVisibility(8);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return view;
        }
    }

    private void f0(CloudListDataBean cloudListDataBean, boolean z4) {
        if (z4) {
            cloudListDataBean.setArchiveFilePath(com.join.mgps.Util.v.f28109i + File.separator + cloudListDataBean.getArchiveFileName());
        } else {
            cloudListDataBean.setArchiveFilePath(com.join.mgps.Util.v.f28108h + File.separator + cloudListDataBean.getArchiveFileName());
        }
        if (cloudListDataBean.getIsVip() == 1) {
            com.papa.sim.statistic.p.l(getContext()).O1(Event.VipArchive_download_emulator, new Ext().setGameId(this.f52753q));
        }
        Intent intent = new Intent(o1.a.f72003h0);
        intent.putExtra("downCloud", cloudListDataBean);
        getActivity().sendBroadcast(intent);
    }

    private ArchiveBuyArgs g0() {
        if (this.f52750n == null) {
            return null;
        }
        RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(getActivity());
        String str = this.f52750n.getUid() + "";
        String token = this.f52750n.getToken();
        String str2 = this.f52753q;
        int i4 = this.f52754r;
        this.f52754r = i4 + 1;
        return requestBeanUtil.getArchiveBuy(str, token, str2, i4);
    }

    private ArchiveevaluateArgs h0(CloudListDataBean cloudListDataBean, int i4) {
        String archiveId;
        if (this.f52750n == null) {
            return null;
        }
        if (this.f52752p == 3) {
            archiveId = cloudListDataBean.getId();
        } else {
            archiveId = cloudListDataBean.getArchiveId();
        }
        RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(getActivity());
        return requestBeanUtil.getArchiveEvaluate(this.f52750n.getUid() + "", this.f52750n.getToken(), archiveId, i4);
    }

    private ArchiveshopArgs i0() {
        if (this.f52750n == null) {
            RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(getActivity());
            String str = this.f52753q;
            int i4 = this.f52755s;
            int i5 = this.f52754r;
            this.f52754r = i5 + 1;
            return requestBeanUtil.getArchiveshop("", "", str, i4, i5);
        }
        RequestBeanUtil requestBeanUtil2 = RequestBeanUtil.getInstance(getActivity());
        String str2 = this.f52750n.getUid() + "";
        String token = this.f52750n.getToken();
        String str3 = this.f52753q;
        int i6 = this.f52755s;
        int i7 = this.f52754r;
        this.f52754r = i7 + 1;
        return requestBeanUtil2.getArchiveshop(str2, token, str3, i6, i7);
    }

    private void k0() {
        this.D.clear();
        showLoding();
        l0(this.f52754r);
    }

    private boolean m0() {
        if (AccountUtil_.getInstance_(getContext()).isTourist()) {
            IntentUtil.getInstance().goMyAccountLoginActivity(getContext());
            return false;
        } else if (AccountUtil_.getInstance_(getContext()).getAccountData().getUid() == 0) {
            IntentUtil.getInstance().goMyAccountLoginActivity(getContext());
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A0(CloudListDataBean cloudListDataBean) {
        Iterator<CloudListDataBean> it2 = this.f52757u.iterator();
        while (it2.hasNext()) {
            if (it2.next().getArchiveDesc().equals(cloudListDataBean.getArchiveDesc())) {
                it2.remove();
                C0();
                if (this.f52757u.size() == 0) {
                    x0();
                } else {
                    s0();
                }
                org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.i(cloudListDataBean.getArchiveDesc()));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void B0() {
        XListView2 xListView2 = this.f52740d;
        if (xListView2 != null) {
            try {
                xListView2.u();
                this.f52740d.v();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C0() {
        if (this.f52738b) {
            return;
        }
        this.f52758v.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D0() {
        try {
            if (this.f52738b) {
                return;
            }
            this.f52758v.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.listener.c
    public void G(CloudListDataBean cloudListDataBean) {
    }

    @Override // com.join.mgps.listener.c
    public void N(CloudListDataBean cloudListDataBean, int i4) {
        if (m0()) {
            X(cloudListDataBean, i4);
        }
    }

    void V(ArchiveShopDataBean archiveShopDataBean) {
        try {
            n0();
            if (archiveShopDataBean != null && archiveShopDataBean.getCode() == 600) {
                List<CloudListDataBean> marketList = archiveShopDataBean.getData_info().getMarketList();
                if (archiveShopDataBean.getData_info().getMarketList().size() == 0) {
                    w0();
                    return;
                } else {
                    e0(marketList);
                    return;
                }
            }
            this.A = true;
            x0();
        } catch (Exception e5) {
            showLodingFailed();
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void W() {
        try {
            XListView2 xListView2 = this.f52740d;
            if (xListView2 != null) {
                xListView2.l();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void X(CloudListDataBean cloudListDataBean, int i4) {
        try {
            if (i4 != 4) {
                ArchiveEvaluteDataBean a5 = this.f52756t.a(h0(cloudListDataBean, i4).getArgs());
                if (a5.getCode() == 600) {
                    showMessage(a5.getData_info().getMsg());
                    s0();
                    return;
                } else if (a5.getCode() == -1) {
                    if ("701".equals(a5.getMsg())) {
                        u0();
                        showMessage("你的登陆已失效，请重新登陆。");
                        return;
                    }
                    showMessage(a5.getMsg());
                    return;
                } else {
                    return;
                }
            }
            HashMap hashMap = new HashMap();
            if (g2.h(cloudListDataBean.getArchiveId())) {
                hashMap.put("id", cloudListDataBean.getId());
            } else {
                hashMap.put("id", cloudListDataBean.getArchiveId());
            }
            hashMap.put("uid", this.f52750n.getUid() + "");
            hashMap.put("token", this.f52750n.getToken());
            ArchiveResponseMain<ArchiveResponseMessage> e5 = this.f52756t.e(hashMap);
            if (e5 == null || e5.getCode() != 600) {
                if (e5 != null) {
                    if ("701".equals(e5.getMsg())) {
                        u0();
                        showMessage("你的登陆已失效，请重新登陆。");
                        return;
                    }
                    showMessage(e5.getMsg());
                    return;
                }
                return;
            }
            if (cloudListDataBean.getArchiveFilePath() != null && new File(cloudListDataBean.getArchiveFilePath()).exists()) {
                UtilsMy.delete(new File(cloudListDataBean.getArchiveFilePath()));
            }
            for (CloudDownRecoderTable cloudDownRecoderTable : b2.i.o().n(this.f52753q)) {
                if (cloudDownRecoderTable.getMd5().equals(cloudListDataBean.getFileMd5())) {
                    b2.i.o().delete((b2.i) cloudDownRecoderTable);
                }
            }
            z0(cloudListDataBean);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z() {
        if (MApplication.N) {
            RelativeLayout relativeLayout = this.f52745i;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
                this.f52746j.setText(MApplication.O);
            }
            LinearLayout linearLayout = this.f52747k;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new d());
                return;
            }
            return;
        }
        RelativeLayout relativeLayout2 = this.f52745i;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    @RequiresApi(api = 16)
    public void afterView() {
        this.f52751o = getArguments().getInt("type", 9);
        this.f52752p = getArguments().getInt("typeIndex");
        this.f52753q = getArguments().getString("gameid");
        this.f52760x = (DocumentManageActivity) getActivity();
        this.f52750n = AccountUtil_.getInstance_(getActivity()).getAccountData();
        this.f52761y = LocalBroadcastManager.getInstance(getActivity());
        this.f52756t = com.join.mgps.rpc.impl.c.k();
        this.f52757u = new ArrayList();
        org.greenrobot.eventbus.c.f().t(this);
        i iVar = new i(getActivity());
        this.f52758v = iVar;
        this.f52740d.setAdapter((ListAdapter) iVar);
        int i4 = this.f52751o;
        if (i4 == 1) {
            this.f52755s = 0;
            k0();
        } else if (i4 == 2) {
            this.f52755s = 2;
            k0();
        } else if (i4 == 3) {
            this.f52755s = 1;
            k0();
        } else {
            this.f52755s = 3;
            k0();
        }
        this.f52739c.setOnClickListener(new a());
        this.f52740d.setPullLoadEnable(new b());
        Z();
        this.f52740d.setPullRefreshEnable(new c());
        this.f52740d.setPreLoadCount(3);
        this.f52740d.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void c0(CloudListDataBean cloudListDataBean) {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("id", cloudListDataBean.getId() == null ? cloudListDataBean.getArchiveId() : cloudListDataBean.getId());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        hashMap.put("uid", accountData.getUid() + "");
        hashMap.put("token", accountData.getToken());
        ArchiveResponseMain<ArchiveResponseMessage> b5 = this.f52756t.b(hashMap);
        if (b5.getCode() == 600) {
            A0(cloudListDataBean);
        } else if ("701".equals(b5.getMsg())) {
            u0();
            showMessage("你的登陆已失效，请重新登陆。");
        } else {
            showMessage(b5.getMsg());
        }
    }

    boolean d0() {
        if (this.D.size() > 0) {
            this.D.clear();
            this.E.clear();
            this.C = this.f52754r - 1;
            showLoding();
            y0(1);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e0(List<CloudListDataBean> list) {
        try {
            if (this.f52754r == 2) {
                this.f52757u.clear();
            }
            D0();
            for (int i4 = 0; i4 < list.size(); i4++) {
                this.f52757u.add(list.get(i4));
            }
            this.A = true;
            if (list.size() < 10) {
                v0();
            }
            for (CloudListDataBean cloudListDataBean : this.f52757u) {
                cloudListDataBean.setStatus(6);
            }
            p0();
            D0();
        } catch (Exception e5) {
            showLodingFailed();
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j0(CloudListDataBean cloudListDataBean) {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
            HashMap hashMap = new HashMap();
            if (this.f52752p == 4) {
                hashMap.put("id", cloudListDataBean.getArchiveId());
            } else {
                hashMap.put("id", cloudListDataBean.getId());
            }
            hashMap.put("uid", accountData.getUid() + "");
            hashMap.put("token", accountData.getToken());
            ArchiveDownDataBean d5 = this.f52756t.d(hashMap);
            if (d5 != null && d5.getCode() == 600) {
                cloudListDataBean.setArchiveFile(d5.getData_info().getDownloadUrl());
                cloudListDataBean.setArchiveFileName(System.currentTimeMillis() + d5.getData_info().getArchiveFileName());
                f0(cloudListDataBean, true);
            } else if (d5 != null) {
                if ("701".equals(d5.getMsg())) {
                    u0();
                    showMessage("你的登陆已失效，请重新登陆。");
                    return;
                }
                showMessage(d5.getMsg());
            } else {
                showMessage("购买失败");
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void l0(int i4) {
        try {
            if (this.A) {
                this.A = false;
                if (this.f52752p == 3) {
                    ArchiveShopDataBean g4 = this.f52756t.g(i0().getArgs());
                    B0();
                    if ((g4 == null || g4.getData_info() == null || g4.getData_info().getMarketList() == null || g4.getData_info().getMarketList().size() == 0) && this.f52754r == 2) {
                        x0();
                        return;
                    } else {
                        V(g4);
                        return;
                    }
                }
                ArchiveBuyArgs g02 = g0();
                if (!AccountUtil_.getInstance_(getActivity()).getToken().equals("") && this.f52750n.getUid() != 0 && !AccountUtil_.getInstance_(getActivity()).isTourist()) {
                    ArchiveShopDataBean i5 = this.f52756t.i(g02.getArgs());
                    B0();
                    if (i5.getCode() == -1 && i5.getMsg().equals("701") && !AccountUtil_.getInstance_(getActivity()).isTourist()) {
                        this.A = true;
                        AccountUtil_.getInstance_(getActivity()).accountLoginOut(getActivity());
                        u0();
                        return;
                    } else if (i5.getData_info().getMarketList().size() == 0 && this.f52754r == 2) {
                        x0();
                        return;
                    } else {
                        V(i5);
                        return;
                    }
                }
                x0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            showLodingFailed();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        LinearLayout linearLayout = this.f52743g;
        if (linearLayout == null || this.f52744h == null) {
            return;
        }
        try {
            linearLayout.setVisibility(8);
            this.f52744h.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.listener.c
    public void o(CloudListDataBean cloudListDataBean) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f52741e;
        if (ptrClassicFrameLayout == null || this.f52739c == null) {
            return;
        }
        try {
            ptrClassicFrameLayout.setVisibility(8);
            this.f52739c.setVisibility(0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f52738b = true;
        com.join.mgps.Util.d0.a().e(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMain(com.join.mgps.event.i iVar) {
        if (this.f52751o != 4) {
            this.f52762z = true;
            String a5 = iVar.a();
            if (this.f52752p == 3 && g2.i(a5)) {
                for (CloudListDataBean cloudListDataBean : this.f52757u) {
                    String archiveDesc = cloudListDataBean.getArchiveDesc();
                    if (g2.i(archiveDesc) && archiveDesc.equals(a5)) {
                        this.D.add(iVar.a());
                    }
                }
                List<CloudListDataBean> list = this.f52757u;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (int i4 = 0; i4 < this.f52757u.size(); i4++) {
                    if (this.f52757u.get(i4).getArchiveDesc().equals(a5)) {
                        this.f52757u.remove(i4);
                        D0();
                    }
                }
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.f fVar) {
        i.a aVar;
        ClouldItemView2 clouldItemView2;
        List<CloudListDataBean> list = this.f52757u;
        if (list != null && list.size() != 0) {
            int i4 = 0;
            while (i4 < this.f52757u.size()) {
                CloudListDataBean cloudListDataBean = this.f52757u.get(i4);
                if (fVar.a().getFileMd5().equals(cloudListDataBean.getFileMd5())) {
                    cloudListDataBean.setStatus(fVar.e());
                    int firstVisiblePosition = this.f52740d.getFirstVisiblePosition();
                    int lastVisiblePosition = this.f52740d.getLastVisiblePosition();
                    if (i4 >= firstVisiblePosition && i4 <= lastVisiblePosition && (aVar = (i.a) this.f52740d.getChildAt(i4 - firstVisiblePosition).getTag()) != null && (clouldItemView2 = aVar.f52774a) != null) {
                        clouldItemView2.setData(this.f52753q, cloudListDataBean, this.f52752p, this.f52751o, false, this.f52757u.size() - 1 == i4, this);
                    }
                }
                i4++;
            }
        } else if (this.f52751o == 4) {
            x0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (z4) {
            return;
        }
        d0();
        if (this.f52752p == 3) {
            r0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f52750n = AccountUtil_.getInstance_(getActivity()).getAccountData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f52741e;
        if (ptrClassicFrameLayout == null || this.f52739c == null) {
            return;
        }
        try {
            ptrClassicFrameLayout.setVisibility(0);
            this.f52739c.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        LinearLayout linearLayout = this.f52739c;
        if (linearLayout == null || this.f52741e == null) {
            return;
        }
        try {
            linearLayout.setVisibility(8);
            this.f52741e.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.listener.c
    public void r(CloudListDataBean cloudListDataBean) {
        if (cloudListDataBean.getIsVip() == 1) {
            com.papa.sim.statistic.p.l(getContext()).O1(Event.VipArchive_startover_emulator, new Ext().setGameId(this.f52753q));
        }
        if (getActivity() instanceof DocumentManageActivity) {
            DocumentManageActivity documentManageActivity = (DocumentManageActivity) getActivity();
            if (documentManageActivity.s0()) {
                documentManageActivity.finish();
            }
        }
    }

    public void r0() {
        LinearLayout linearLayout = this.f52739c;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        s0();
    }

    public void s0() {
        showLoding();
        List<CloudListDataBean> list = this.f52757u;
        if (list != null && list.size() > 0) {
            this.f52757u.clear();
            D0();
            this.f52754r = 1;
            W();
            q0();
            l0(this.f52754r);
            return;
        }
        this.f52754r = 1;
        W();
        q0();
        l0(this.f52754r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            LinearLayout linearLayout = this.f52743g;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.f52744h;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f52744h;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f52743g;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        ToastManager.show(str);
    }

    @Override // com.join.mgps.listener.c
    public String t() {
        return this.f52749m.cloudVipLink().d();
    }

    public void t0() {
        Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0() {
        AccountUtil_.getInstance_(getContext()).accountLoginOut(getContext());
        IntentUtil.getInstance().goMyAccountLoginActivity(getContext());
    }

    @Override // com.join.mgps.listener.c
    public void v(CloudListDataBean cloudListDataBean, boolean z4) {
        if (m0()) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
            if (AccountUtil_.getInstance_(getContext()).isTourist()) {
                IntentUtil.getInstance().goMyAccountLoginActivity(getContext());
            }
            if (com.join.mgps.Util.b.piv(accountData)) {
                j0(cloudListDataBean);
            } else if (cloudListDataBean.getArchiveCoin() != null && accountData.O1() < Integer.parseInt(cloudListDataBean.getArchiveCoin())) {
                ToastManager.show("剩余铜板不足，去签到领取更多铜板吧");
            } else if (this.f52749m.DownloadRecoderNoticeMarcket().d().booleanValue() && cloudListDataBean.getArchiveCoin() != null && Integer.parseInt(cloudListDataBean.getArchiveCoin()) != 0) {
                com.join.mgps.dialog.w g4 = new com.join.mgps.dialog.w(getActivity(), R.style.MyDialog).g("获取须知");
                com.join.mgps.dialog.w d5 = g4.d("悟饭平台会员可免费下载该存档。如果你不想成为会员，可以选择扣除" + cloudListDataBean.getArchiveCoin() + "铜板的方式进行下载，铜板将返还至存档作者。");
                d5.f("下载(扣除" + cloudListDataBean.getArchiveCoin() + ")").b("会员免费下载").e(new h(cloudListDataBean)).a(new g()).c(new f()).h(true).i(new e()).show();
            } else {
                j0(cloudListDataBean);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v0() {
        XListView2 xListView2 = this.f52740d;
        if (xListView2 != null) {
            try {
                xListView2.u();
                this.f52740d.v();
                this.f52740d.setNoMore();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // com.join.mgps.listener.c
    public void w(CloudListDataBean cloudListDataBean, int i4) {
        c0(cloudListDataBean);
        Intent intent = new Intent(o1.a.f72007j0);
        intent.putExtra("cloud", cloudListDataBean);
        getActivity().sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0() {
        LinearLayout linearLayout = this.f52739c;
        if (linearLayout == null || this.f52741e == null || this.f52740d == null) {
            return;
        }
        try {
            this.A = true;
            if (this.f52754r == 2) {
                linearLayout.setVisibility(0);
                if (this.f52752p == 3) {
                    this.f52742f.setText("从本地挑一个分享吧");
                } else {
                    this.f52742f.setText("去推荐下载一个吧");
                }
                this.f52741e.setVisibility(8);
                return;
            }
            linearLayout.setVisibility(8);
            this.f52741e.setVisibility(0);
            this.f52740d.u();
            this.f52740d.v();
            this.f52740d.setNoMore();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x0() {
        if (this.f52739c == null || this.f52741e == null) {
            return;
        }
        try {
            n0();
            this.A = true;
            this.f52739c.setVisibility(0);
            if (this.f52752p == 3) {
                this.f52742f.setText("从本地挑一个分享吧");
            } else {
                this.f52742f.setText("去推荐下载一个吧");
            }
            this.f52741e.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void y0(int i4) {
        try {
            ArchiveshopArgs i02 = i0();
            i02.setPn(i4);
            ArchiveShopDataBean.DataInfoBean data_info = this.f52756t.g(i02.getArgs()).getData_info();
            if (i4 == 1 && (data_info == null || data_info.getMarketList().size() == 0)) {
                x0();
                return;
            }
            int i5 = i4 + 1;
            if (data_info != null) {
                List<CloudListDataBean> marketList = data_info.getMarketList();
                if (marketList != null && marketList.size() > 0) {
                    this.E.addAll(marketList);
                    if (i5 <= this.C) {
                        y0(i5);
                        return;
                    }
                    this.f52757u.clear();
                    this.f52757u.addAll(this.E);
                    D0();
                    n0();
                    return;
                }
                n0();
                return;
            }
            n0();
            x0();
        } catch (Exception unused) {
            n0();
            showLodingFailed();
            this.E.clear();
            this.D.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z0(CloudListDataBean cloudListDataBean) {
        cloudListDataBean.setStatus(6);
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.f(cloudListDataBean, cloudListDataBean.getStatus()));
        Iterator<CloudListDataBean> it2 = this.f52757u.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (it2.next().getArchiveDesc().equals(cloudListDataBean.getArchiveDesc())) {
                it2.remove();
                break;
            }
        }
        this.f52758v.notifyDataSetChanged();
        if (this.f52757u.size() == 0) {
            x0();
        } else {
            s0();
        }
    }
}
