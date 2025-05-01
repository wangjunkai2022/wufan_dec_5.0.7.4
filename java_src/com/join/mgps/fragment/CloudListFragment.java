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
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.DocumentManageActivity;
import com.join.mgps.activity.GameMainActivity3;
import com.join.mgps.customview.ClouldItemView3;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.CloudDownRecoderTable;
import com.join.mgps.dialog.w;
import com.join.mgps.dto.ArchiveBuyArgs;
import com.join.mgps.dto.ArchiveColudArgs;
import com.join.mgps.dto.ArchiveDownDataBean;
import com.join.mgps.dto.ArchiveEvaluteDataBean;
import com.join.mgps.dto.ArchiveNumDataBean;
import com.join.mgps.dto.ArchiveResponseMain;
import com.join.mgps.dto.ArchiveResponseMessage;
import com.join.mgps.dto.ArchiveShopDataBean;
import com.join.mgps.dto.ArchiveevaluateArgs;
import com.join.mgps.dto.ArchiveshopArgs;
import com.join.mgps.dto.CloudListDataBean;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.fragment_cloud_list)
/* loaded from: classes.dex */
public class CloudListFragment extends Fragment implements com.join.mgps.listener.c {
    ArchiveNumDataBean E;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f50097c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    XListView2 f50098d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    PtrClassicFrameLayout f50099e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f50100f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f50101g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f50102h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    RelativeLayout f50103i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f50104j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    LinearLayout f50105k;

    /* renamed from: l  reason: collision with root package name */
    IntentFilter f50106l;
    @Pref

    /* renamed from: m  reason: collision with root package name */
    PrefDef_ f50107m;

    /* renamed from: n  reason: collision with root package name */
    private com.wufan.user.service.protobuf.n0 f50108n;

    /* renamed from: o  reason: collision with root package name */
    int f50109o;

    /* renamed from: p  reason: collision with root package name */
    int f50110p;

    /* renamed from: q  reason: collision with root package name */
    String f50111q;

    /* renamed from: s  reason: collision with root package name */
    int f50113s;

    /* renamed from: t  reason: collision with root package name */
    com.join.mgps.rpc.d f50114t;

    /* renamed from: u  reason: collision with root package name */
    List<CloudListDataBean> f50115u;

    /* renamed from: v  reason: collision with root package name */
    h f50116v;

    /* renamed from: w  reason: collision with root package name */
    LocalBroadcastManager f50117w;

    /* renamed from: x  reason: collision with root package name */
    GameMainActivity3 f50118x;

    /* renamed from: b  reason: collision with root package name */
    boolean f50096b = false;

    /* renamed from: r  reason: collision with root package name */
    int f50112r = 1;

    /* renamed from: y  reason: collision with root package name */
    boolean f50119y = false;

    /* renamed from: z  reason: collision with root package name */
    boolean f50120z = true;
    private boolean A = true;
    public boolean B = false;
    public boolean C = true;
    public boolean D = true;
    int F = 0;
    List<String> G = new ArrayList(0);
    List<CloudListDataBean> H = new ArrayList(0);

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CloudListFragment.this.v0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements com.join.mgps.customview.f {
        b() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            CloudListFragment cloudListFragment = CloudListFragment.this;
            cloudListFragment.m0(cloudListFragment.f50112r);
            CloudListFragment.this.W();
        }
    }

    /* loaded from: classes3.dex */
    class c implements com.join.mgps.customview.g {
        c() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            CloudListFragment cloudListFragment = CloudListFragment.this;
            cloudListFragment.f50112r = 1;
            cloudListFragment.W();
            CloudListFragment cloudListFragment2 = CloudListFragment.this;
            cloudListFragment2.m0(cloudListFragment2.f50112r);
        }
    }

    /* loaded from: classes3.dex */
    class d implements w.e {
        d() {
        }

        @Override // com.join.mgps.dialog.w.e
        public void a(com.join.mgps.dialog.w wVar) {
        }
    }

    /* loaded from: classes3.dex */
    class e implements CompoundButton.OnCheckedChangeListener {
        e() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            if (z4) {
                CloudListFragment.this.A = false;
            } else {
                CloudListFragment.this.A = true;
            }
        }
    }

    /* loaded from: classes3.dex */
    class f implements w.e {
        f() {
        }

        @Override // com.join.mgps.dialog.w.e
        public void a(com.join.mgps.dialog.w wVar) {
            IntentUtil intentUtil = IntentUtil.getInstance();
            Context context = CloudListFragment.this.getContext();
            intentUtil.goShareWebActivity(context, "http://anv3btapi.5fun.com/user/activity/cloud_archive?gameId=" + CloudListFragment.this.f50111q);
            if (!CloudListFragment.this.A) {
                CloudListFragment.this.f50107m.DownloadRecoderNoticeMarcket().g(Boolean.FALSE);
            }
            wVar.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    class g implements w.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f50127a;

        g(CloudListDataBean cloudListDataBean) {
            this.f50127a = cloudListDataBean;
        }

        @Override // com.join.mgps.dialog.w.e
        public void a(com.join.mgps.dialog.w wVar) {
            CloudListFragment.this.k0(this.f50127a);
            if (!CloudListFragment.this.A) {
                CloudListFragment.this.f50107m.DownloadRecoderNoticeMarcket().g(Boolean.FALSE);
            }
            wVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        Context f50129b;

        /* loaded from: classes3.dex */
        class a {

            /* renamed from: a  reason: collision with root package name */
            ClouldItemView3 f50131a;

            /* renamed from: b  reason: collision with root package name */
            LinearLayout f50132b;

            /* renamed from: c  reason: collision with root package name */
            TextView f50133c;

            /* renamed from: d  reason: collision with root package name */
            TextView f50134d;

            a() {
            }
        }

        public h(Context context) {
            this.f50129b = context;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return CloudListFragment.this.f50115u.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return CloudListFragment.this.f50115u.get(i4);
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
                    view = LayoutInflater.from(this.f50129b).inflate(R.layout.item_cloud_list_item, (ViewGroup) null);
                    aVar.f50131a = (ClouldItemView3) view.findViewById(R.id.coulditem);
                    aVar.f50132b = (LinearLayout) view.findViewById(R.id.ll_show);
                    aVar.f50133c = (TextView) view.findViewById(R.id.tv_today_id);
                    aVar.f50134d = (TextView) view.findViewById(R.id.tv_zong_id);
                    view.setTag(aVar);
                } else {
                    aVar = (a) view.getTag();
                }
                aVar.f50131a.setCloudItemListener(CloudListFragment.this);
                if (CloudListFragment.this.f50115u.size() - 1 == i4) {
                    ClouldItemView3 clouldItemView3 = aVar.f50131a;
                    CloudListFragment cloudListFragment = CloudListFragment.this;
                    CloudListFragment cloudListFragment2 = CloudListFragment.this;
                    clouldItemView3.setData(cloudListFragment.f50111q, cloudListFragment.f50115u.get(i4), cloudListFragment2.f50110p, cloudListFragment2.f50109o, false, true, cloudListFragment2);
                } else {
                    ClouldItemView3 clouldItemView32 = aVar.f50131a;
                    CloudListFragment cloudListFragment3 = CloudListFragment.this;
                    CloudListFragment cloudListFragment4 = CloudListFragment.this;
                    clouldItemView32.setData(cloudListFragment3.f50111q, cloudListFragment3.f50115u.get(i4), cloudListFragment4.f50110p, cloudListFragment4.f50109o, false, false, cloudListFragment4);
                }
                aVar.f50131a.setGBAType(CloudListFragment.this.f50118x.f32379i2);
                ClouldItemView3 clouldItemView33 = aVar.f50131a;
                GameMainActivity3 gameMainActivity3 = CloudListFragment.this.f50118x;
                clouldItemView33.setPGN(gameMainActivity3.f32381k2, gameMainActivity3.f32382l2);
                if (CloudListFragment.this.f50109o == 4) {
                    aVar.f50132b.setVisibility(0);
                    TextView textView = aVar.f50133c;
                    textView.setText(CloudListFragment.this.f50115u.get(i4).getTodayCoin() + "");
                    TextView textView2 = aVar.f50134d;
                    textView2.setText(CloudListFragment.this.f50115u.get(i4).getTotalCoin() + "");
                } else {
                    aVar.f50132b.setVisibility(8);
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
            com.papa.sim.statistic.p.l(getContext()).O1(Event.VipArchive_download_page, new Ext().setGameId(this.f50111q));
        }
        Intent intent = new Intent(o1.a.f72005i0);
        intent.putExtra("downCloud", cloudListDataBean);
        getActivity().sendBroadcast(intent);
    }

    private ArchiveBuyArgs g0() {
        if (this.f50108n == null) {
            return null;
        }
        RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(getActivity());
        String str = this.f50108n.getUid() + "";
        String token = this.f50108n.getToken();
        String str2 = this.f50111q;
        int i4 = this.f50112r;
        this.f50112r = i4 + 1;
        return requestBeanUtil.getArchiveBuy(str, token, str2, i4);
    }

    private ArchiveColudArgs h0() {
        if (this.f50108n == null) {
            return RequestBeanUtil.getInstance(getContext()).getArchiveNum("", "", this.f50111q);
        }
        RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(getContext());
        return requestBeanUtil.getArchiveNum(this.f50108n.getUid() + "", this.f50108n.getToken(), this.f50111q);
    }

    private ArchiveevaluateArgs i0(CloudListDataBean cloudListDataBean, int i4) {
        String archiveId;
        if (this.f50108n == null) {
            return null;
        }
        if (this.f50110p == 3) {
            archiveId = cloudListDataBean.getId();
        } else {
            archiveId = cloudListDataBean.getArchiveId();
        }
        RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(getActivity());
        return requestBeanUtil.getArchiveEvaluate(this.f50108n.getUid() + "", this.f50108n.getToken(), archiveId, i4);
    }

    private ArchiveshopArgs j0() {
        if (this.f50108n == null) {
            RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(getActivity());
            String str = this.f50111q;
            int i4 = this.f50113s;
            int i5 = this.f50112r;
            this.f50112r = i5 + 1;
            return requestBeanUtil.getArchiveshop("", "", str, i4, i5);
        }
        RequestBeanUtil requestBeanUtil2 = RequestBeanUtil.getInstance(getActivity());
        String str2 = this.f50108n.getUid() + "";
        String token = this.f50108n.getToken();
        String str3 = this.f50111q;
        int i6 = this.f50113s;
        int i7 = this.f50112r;
        this.f50112r = i7 + 1;
        return requestBeanUtil2.getArchiveshop(str2, token, str3, i6, i7);
    }

    private void l0() {
        this.G.clear();
        showLoding();
        m0(this.f50112r);
    }

    private boolean n0() {
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
    public void A0() {
        if (this.f50097c == null || this.f50099e == null) {
            return;
        }
        try {
            o0();
            this.f50120z = true;
            this.f50097c.setVisibility(0);
            if (this.f50110p == 3) {
                this.f50100f.setText("从本地挑一个分享吧");
            } else {
                this.f50100f.setText("去推荐下载一个吧");
            }
            this.f50099e.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void B0(int i4) {
        try {
            ArchiveshopArgs j02 = j0();
            j02.setPn(i4);
            ArchiveShopDataBean.DataInfoBean data_info = this.f50114t.g(j02.getArgs()).getData_info();
            if (i4 == 1 && (data_info == null || data_info.getMarketList().size() == 0)) {
                A0();
                return;
            }
            int i5 = i4 + 1;
            if (data_info != null) {
                List<CloudListDataBean> marketList = data_info.getMarketList();
                if (marketList != null && marketList.size() > 0) {
                    this.H.addAll(marketList);
                    if (i5 <= this.F) {
                        B0(i5);
                        return;
                    }
                    this.f50115u.clear();
                    this.f50115u.addAll(this.H);
                    G0();
                    o0();
                    return;
                }
                o0();
                return;
            }
            o0();
            A0();
        } catch (Exception unused) {
            o0();
            showLodingFailed();
            this.H.clear();
            this.G.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C0(CloudListDataBean cloudListDataBean) {
        cloudListDataBean.setStatus(6);
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.f(cloudListDataBean, cloudListDataBean.getStatus()));
        Iterator<CloudListDataBean> it2 = this.f50115u.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (it2.next().getArchiveDesc().equals(cloudListDataBean.getArchiveDesc())) {
                it2.remove();
                break;
            }
        }
        this.f50116v.notifyDataSetChanged();
        if (this.f50115u.size() == 0) {
            A0();
        } else {
            v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D0(CloudListDataBean cloudListDataBean) {
        Iterator<CloudListDataBean> it2 = this.f50115u.iterator();
        while (it2.hasNext()) {
            if (it2.next().getArchiveDesc().equals(cloudListDataBean.getArchiveDesc())) {
                it2.remove();
                F0();
                if (this.f50115u.size() == 0) {
                    A0();
                } else {
                    v0();
                }
                org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.i(cloudListDataBean.getArchiveDesc()));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0() {
        XListView2 xListView2 = this.f50098d;
        if (xListView2 != null) {
            try {
                xListView2.u();
                this.f50098d.v();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void F0() {
        if (this.f50096b) {
            return;
        }
        this.f50116v.notifyDataSetChanged();
    }

    @Override // com.join.mgps.listener.c
    public void G(CloudListDataBean cloudListDataBean) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G0() {
        try {
            if (this.f50096b) {
                return;
            }
            this.f50116v.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.listener.c
    public void N(CloudListDataBean cloudListDataBean, int i4) {
        if (n0()) {
            X(cloudListDataBean, i4);
        }
    }

    void V(ArchiveShopDataBean archiveShopDataBean) {
        try {
            o0();
            if (archiveShopDataBean != null && archiveShopDataBean.getCode() == 600) {
                List<CloudListDataBean> marketList = archiveShopDataBean.getData_info().getMarketList();
                if (archiveShopDataBean.getData_info().getMarketList().size() == 0) {
                    z0();
                    return;
                } else {
                    e0(marketList);
                    return;
                }
            }
            this.f50120z = true;
            A0();
        } catch (Exception e5) {
            showLodingFailed();
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void W() {
        try {
            XListView2 xListView2 = this.f50098d;
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
                ArchiveEvaluteDataBean a5 = this.f50114t.a(i0(cloudListDataBean, i4).getArgs());
                if (a5.getCode() == 600) {
                    showMessage(a5.getData_info().getMsg());
                    v0();
                    return;
                } else if (a5.getCode() == -1) {
                    if ("701".equals(a5.getMsg())) {
                        x0();
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
            hashMap.put("uid", this.f50108n.getUid() + "");
            hashMap.put("token", this.f50108n.getToken());
            ArchiveResponseMain<ArchiveResponseMessage> e5 = this.f50114t.e(hashMap);
            if (e5 == null || e5.getCode() != 600) {
                if (e5 != null) {
                    if ("701".equals(e5.getMsg())) {
                        x0();
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
            for (CloudDownRecoderTable cloudDownRecoderTable : b2.i.o().n(this.f50111q)) {
                if (cloudDownRecoderTable.getMd5().equals(cloudListDataBean.getFileMd5())) {
                    b2.i.o().delete((b2.i) cloudDownRecoderTable);
                }
            }
            C0(cloudListDataBean);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    @RequiresApi(api = 16)
    public void afterView() {
        this.f50109o = getArguments().getInt("type", 9);
        this.f50110p = getArguments().getInt("typeIndex");
        this.f50111q = getArguments().getString("gameid");
        this.f50108n = AccountUtil_.getInstance_(getActivity()).getAccountData();
        this.f50117w = LocalBroadcastManager.getInstance(getActivity());
        this.f50114t = com.join.mgps.rpc.impl.c.k();
        this.f50115u = new ArrayList();
        org.greenrobot.eventbus.c.f().t(this);
        this.f50116v = new h(getActivity());
        this.f50118x = (GameMainActivity3) getActivity();
        this.f50098d.setAdapter((ListAdapter) this.f50116v);
        int i4 = this.f50109o;
        if (i4 == 1) {
            this.f50113s = 0;
            l0();
        } else if (i4 == 2) {
            this.f50113s = 2;
            l0();
        } else if (i4 == 3) {
            this.f50113s = 1;
            l0();
        } else {
            this.f50113s = 3;
            l0();
        }
        this.f50097c.setOnClickListener(new a());
        this.f50098d.setPullLoadEnable(new b());
        Z();
        this.f50098d.setPullRefreshEnable(new c());
        this.f50098d.setPreLoadCount(3);
        this.f50098d.l();
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
        ArchiveResponseMain<ArchiveResponseMessage> b5 = this.f50114t.b(hashMap);
        if (b5.getCode() == 600) {
            D0(cloudListDataBean);
        } else if ("701".equals(b5.getMsg())) {
            x0();
            showMessage("你的登陆已失效，请重新登陆。");
        } else {
            showMessage(b5.getMsg());
        }
    }

    boolean d0() {
        if (this.G.size() > 0) {
            this.G.clear();
            this.H.clear();
            this.F = this.f50112r - 1;
            showLoding();
            B0(1);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e0(List<CloudListDataBean> list) {
        try {
            if (this.f50112r == 2) {
                this.f50115u.clear();
            }
            G0();
            for (int i4 = 0; i4 < list.size(); i4++) {
                this.f50115u.add(list.get(i4));
            }
            this.f50120z = true;
            if (list.size() < 10) {
                y0();
            }
            for (CloudListDataBean cloudListDataBean : this.f50115u) {
                cloudListDataBean.setStatus(6);
            }
            q0();
            G0();
        } catch (Exception e5) {
            showLodingFailed();
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0(CloudListDataBean cloudListDataBean) {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
            HashMap hashMap = new HashMap();
            if (this.f50110p == 4) {
                hashMap.put("id", cloudListDataBean.getArchiveId());
            } else {
                hashMap.put("id", cloudListDataBean.getId());
            }
            hashMap.put("uid", accountData.getUid() + "");
            hashMap.put("token", accountData.getToken());
            ArchiveDownDataBean d5 = this.f50114t.d(hashMap);
            if (d5 != null && d5.getCode() == 600) {
                cloudListDataBean.setArchiveFile(d5.getData_info().getDownloadUrl());
                cloudListDataBean.setArchiveFileName(System.currentTimeMillis() + d5.getData_info().getArchiveFileName());
                f0(cloudListDataBean, true);
            } else if (d5 != null) {
                if ("701".equals(d5.getMsg())) {
                    x0();
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
    public void m0(int i4) {
        try {
            if (this.f50120z) {
                this.f50120z = false;
                if (this.f50110p == 3) {
                    ArchiveShopDataBean g4 = this.f50114t.g(j0().getArgs());
                    E0();
                    if ((g4 == null || g4.getData_info() == null || g4.getData_info().getMarketList() == null || g4.getData_info().getMarketList().size() == 0) && this.f50112r == 2) {
                        A0();
                        return;
                    } else {
                        V(g4);
                        return;
                    }
                }
                ArchiveBuyArgs g02 = g0();
                if (!AccountUtil_.getInstance_(getActivity()).getToken().equals("") && this.f50108n.getUid() != 0 && !AccountUtil_.getInstance_(getActivity()).isTourist()) {
                    ArchiveShopDataBean i5 = this.f50114t.i(g02.getArgs());
                    E0();
                    if (i5.getCode() == -1 && i5.getMsg().equals("701") && !AccountUtil_.getInstance_(getActivity()).isTourist()) {
                        this.f50120z = true;
                        AccountUtil_.getInstance_(getActivity()).accountLoginOut(getActivity());
                        x0();
                        return;
                    } else if (i5.getData_info().getMarketList().size() == 0 && this.f50112r == 2) {
                        A0();
                        return;
                    } else {
                        V(i5);
                        return;
                    }
                }
                A0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            showLodingFailed();
        }
    }

    @Override // com.join.mgps.listener.c
    public void o(CloudListDataBean cloudListDataBean) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        LinearLayout linearLayout = this.f50101g;
        if (linearLayout == null || this.f50102h == null) {
            return;
        }
        try {
            linearLayout.setVisibility(8);
            this.f50102h.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f50096b = true;
        com.join.mgps.Util.d0.a().e(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMain(com.join.mgps.event.i iVar) {
        if (this.f50109o != 4) {
            this.f50119y = true;
            String a5 = iVar.a();
            if (this.f50110p == 3 && g2.i(a5)) {
                for (CloudListDataBean cloudListDataBean : this.f50115u) {
                    String archiveDesc = cloudListDataBean.getArchiveDesc();
                    if (g2.i(archiveDesc) && archiveDesc.equals(a5)) {
                        this.G.add(iVar.a());
                    }
                }
                List<CloudListDataBean> list = this.f50115u;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (int i4 = 0; i4 < this.f50115u.size(); i4++) {
                    if (this.f50115u.get(i4).getArchiveDesc().equals(a5)) {
                        this.f50115u.remove(i4);
                        G0();
                    }
                }
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.f fVar) {
        h.a aVar;
        ClouldItemView3 clouldItemView3;
        List<CloudListDataBean> list = this.f50115u;
        if (list != null && list.size() != 0) {
            this.f50116v.notifyDataSetChanged();
            int i4 = 0;
            while (i4 < this.f50115u.size()) {
                CloudListDataBean cloudListDataBean = this.f50115u.get(i4);
                if (fVar.a().getFileMd5().equals(cloudListDataBean.getFileMd5())) {
                    cloudListDataBean.setStatus(fVar.e());
                    int firstVisiblePosition = this.f50098d.getFirstVisiblePosition();
                    int lastVisiblePosition = this.f50098d.getLastVisiblePosition();
                    if (i4 >= firstVisiblePosition && i4 <= lastVisiblePosition && (aVar = (h.a) this.f50098d.getChildAt(i4 - firstVisiblePosition).getTag()) != null && (clouldItemView3 = aVar.f50131a) != null) {
                        clouldItemView3.setData(this.f50111q, cloudListDataBean, this.f50110p, this.f50109o, false, this.f50115u.size() - 1 == i4, this);
                    }
                }
                i4++;
            }
        } else if (this.f50109o == 4) {
            A0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (z4) {
            return;
        }
        d0();
        if (this.f50110p == 3) {
            u0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f50108n = AccountUtil_.getInstance_(getActivity()).getAccountData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f50099e;
        if (ptrClassicFrameLayout == null || this.f50097c == null) {
            return;
        }
        try {
            ptrClassicFrameLayout.setVisibility(8);
            this.f50097c.setVisibility(0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f50099e;
        if (ptrClassicFrameLayout == null || this.f50097c == null) {
            return;
        }
        try {
            ptrClassicFrameLayout.setVisibility(0);
            this.f50097c.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.listener.c
    public void r(CloudListDataBean cloudListDataBean) {
        if (cloudListDataBean.getIsVip() == 1) {
            com.papa.sim.statistic.p.l(getContext()).O1(Event.VipArchive_startover_page, new Ext().setGameId(this.f50111q));
        }
        if (getActivity() instanceof DocumentManageActivity) {
            DocumentManageActivity documentManageActivity = (DocumentManageActivity) getActivity();
            if (documentManageActivity.s0()) {
                documentManageActivity.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0() {
        LinearLayout linearLayout = this.f50097c;
        if (linearLayout == null || this.f50099e == null) {
            return;
        }
        try {
            linearLayout.setVisibility(8);
            this.f50099e.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72007j0})
    public void s0(Intent intent) {
        CloudListDataBean cloudListDataBean = (CloudListDataBean) intent.getSerializableExtra("cloud");
        if (cloudListDataBean != null) {
            c0(cloudListDataBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            LinearLayout linearLayout = this.f50101g;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.f50102h;
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
        LinearLayout linearLayout = this.f50102h;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f50101g;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        l2.a(getContext()).b(str);
    }

    @Override // com.join.mgps.listener.c
    public String t() {
        return this.f50107m.cloudVipLink().d();
    }

    public void t0(boolean z4) {
        this.B = z4;
    }

    public void u0() {
        LinearLayout linearLayout = this.f50097c;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        v0();
    }

    @Override // com.join.mgps.listener.c
    public void v(CloudListDataBean cloudListDataBean, boolean z4) {
        if (n0()) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
            if (AccountUtil_.getInstance_(getContext()).isTourist()) {
                IntentUtil.getInstance().goMyAccountLoginActivity(getContext());
            }
            if (!com.join.mgps.Util.b.piv(accountData) && cloudListDataBean.getIsVip() != 1) {
                if (cloudListDataBean.getArchiveCoin() != null && accountData.O1() < Integer.parseInt(cloudListDataBean.getArchiveCoin())) {
                    l2.a(getContext()).b("剩余铜板不足，去签到领取更多铜板吧");
                    return;
                } else if (this.f50107m.DownloadRecoderNoticeMarcket().d().booleanValue() && cloudListDataBean.getArchiveCoin() != null && Integer.parseInt(cloudListDataBean.getArchiveCoin()) != 0) {
                    com.join.mgps.dialog.w g4 = new com.join.mgps.dialog.w(getActivity(), R.style.MyDialog).g("获取须知");
                    com.join.mgps.dialog.w d5 = g4.d("悟饭平台会员可免费下载该存档。如果你不想成为会员，可以选择扣除" + cloudListDataBean.getArchiveCoin() + "铜板的方式进行下载，铜板将返还至存档作者。");
                    d5.f("下载(扣除" + cloudListDataBean.getArchiveCoin() + ")").b("会员免费下载").e(new g(cloudListDataBean)).a(new f()).c(new e()).h(true).i(new d()).show();
                    return;
                } else {
                    k0(cloudListDataBean);
                    return;
                }
            }
            k0(cloudListDataBean);
        }
    }

    public void v0() {
        showLoding();
        List<CloudListDataBean> list = this.f50115u;
        if (list != null && list.size() > 0) {
            this.f50115u.clear();
            G0();
            this.f50112r = 1;
            W();
            r0();
            m0(this.f50112r);
            return;
        }
        this.f50112r = 1;
        W();
        r0();
        m0(this.f50112r);
    }

    @Override // com.join.mgps.listener.c
    public void w(CloudListDataBean cloudListDataBean, int i4) {
        c0(cloudListDataBean);
    }

    public void w0() {
        Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x0() {
        AccountUtil_.getInstance_(getContext()).accountLoginOut(getContext());
        IntentUtil.getInstance().goMyAccountLoginActivity(getContext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void y0() {
        XListView2 xListView2 = this.f50098d;
        if (xListView2 != null) {
            try {
                xListView2.u();
                this.f50098d.v();
                this.f50098d.setNoMore();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z0() {
        LinearLayout linearLayout = this.f50097c;
        if (linearLayout == null || this.f50099e == null || this.f50098d == null) {
            return;
        }
        try {
            this.f50120z = true;
            if (this.f50112r == 2) {
                linearLayout.setVisibility(0);
                if (this.f50110p == 3) {
                    this.f50100f.setText("从本地挑一个分享吧");
                } else {
                    this.f50100f.setText("去推荐下载一个吧");
                }
                this.f50099e.setVisibility(8);
                return;
            }
            linearLayout.setVisibility(8);
            this.f50099e.setVisibility(0);
            this.f50098d.u();
            this.f50098d.v();
            this.f50098d.setNoMore();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
