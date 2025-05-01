package com.join.mgps.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.DocumentManageActivity;
import com.join.mgps.activity.GameMainActivity4;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.customview.ClouldItemView3;
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
@EFragment(R.layout.fragment_cloud_list_v2)
/* loaded from: classes.dex */
public class CloudListFragmentV2 extends Fragment implements com.join.mgps.listener.c {
    ArchiveNumDataBean A;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f50137c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    XRecyclerView f50138d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f50139e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f50140f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f50141g;

    /* renamed from: h  reason: collision with root package name */
    IntentFilter f50142h;
    @Pref

    /* renamed from: i  reason: collision with root package name */
    PrefDef_ f50143i;

    /* renamed from: j  reason: collision with root package name */
    private com.wufan.user.service.protobuf.n0 f50144j;

    /* renamed from: k  reason: collision with root package name */
    int f50145k;

    /* renamed from: l  reason: collision with root package name */
    int f50146l;

    /* renamed from: m  reason: collision with root package name */
    String f50147m;

    /* renamed from: o  reason: collision with root package name */
    int f50149o;

    /* renamed from: p  reason: collision with root package name */
    com.join.mgps.rpc.d f50150p;

    /* renamed from: q  reason: collision with root package name */
    List<CloudListDataBean> f50151q;

    /* renamed from: r  reason: collision with root package name */
    j f50152r;

    /* renamed from: s  reason: collision with root package name */
    LocalBroadcastManager f50153s;

    /* renamed from: t  reason: collision with root package name */
    GameMainActivity4 f50154t;

    /* renamed from: b  reason: collision with root package name */
    boolean f50136b = false;

    /* renamed from: n  reason: collision with root package name */
    int f50148n = 1;

    /* renamed from: u  reason: collision with root package name */
    boolean f50155u = false;

    /* renamed from: v  reason: collision with root package name */
    boolean f50156v = true;

    /* renamed from: w  reason: collision with root package name */
    private boolean f50157w = true;

    /* renamed from: x  reason: collision with root package name */
    public boolean f50158x = false;

    /* renamed from: y  reason: collision with root package name */
    public boolean f50159y = true;

    /* renamed from: z  reason: collision with root package name */
    public boolean f50160z = true;
    int B = 0;
    List<String> C = new ArrayList(0);
    List<CloudListDataBean> D = new ArrayList(0);

    /* loaded from: classes3.dex */
    class a extends UniversalItemDecoration {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UniversalItemDecoration.a f50161a;

        a(UniversalItemDecoration.a aVar) {
            this.f50161a = aVar;
        }

        @Override // com.join.mgps.base.decoration.UniversalItemDecoration
        public UniversalItemDecoration.b getItemOffsets(int i4) {
            return this.f50161a;
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CloudListFragmentV2.this.v0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements XRecyclerView.f {
        c() {
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onLoadMore() {
            CloudListFragmentV2 cloudListFragmentV2 = CloudListFragmentV2.this;
            cloudListFragmentV2.m0(cloudListFragmentV2.f50148n);
            CloudListFragmentV2.this.W();
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onRefresh() {
            CloudListFragmentV2 cloudListFragmentV2 = CloudListFragmentV2.this;
            cloudListFragmentV2.f50148n = 1;
            cloudListFragmentV2.W();
            CloudListFragmentV2 cloudListFragmentV22 = CloudListFragmentV2.this;
            cloudListFragmentV22.m0(cloudListFragmentV22.f50148n);
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
                CloudListFragmentV2.this.f50157w = false;
            } else {
                CloudListFragmentV2.this.f50157w = true;
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
            Context context = CloudListFragmentV2.this.getContext();
            intentUtil.goShareWebActivity(context, "http://anv3btapi.5fun.com/user/activity/cloud_archive?gameId=" + CloudListFragmentV2.this.f50147m);
            if (!CloudListFragmentV2.this.f50157w) {
                CloudListFragmentV2.this.f50143i.DownloadRecoderNoticeMarcket().g(Boolean.FALSE);
            }
            wVar.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    class g implements w.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f50168a;

        g(CloudListDataBean cloudListDataBean) {
            this.f50168a = cloudListDataBean;
        }

        @Override // com.join.mgps.dialog.w.e
        public void a(com.join.mgps.dialog.w wVar) {
            CloudListFragmentV2.this.k0(this.f50168a);
            if (!CloudListFragmentV2.this.f50157w) {
                CloudListFragmentV2.this.f50143i.DownloadRecoderNoticeMarcket().g(Boolean.FALSE);
            }
            wVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        ClouldItemView3 f50170a;

        /* renamed from: b  reason: collision with root package name */
        LinearLayout f50171b;

        /* renamed from: c  reason: collision with root package name */
        TextView f50172c;

        /* renamed from: d  reason: collision with root package name */
        TextView f50173d;

        public h(@NonNull View view) {
            super(view);
            this.f50170a = (ClouldItemView3) view.findViewById(R.id.coulditem);
            this.f50171b = (LinearLayout) view.findViewById(R.id.ll_show);
            this.f50172c = (TextView) view.findViewById(R.id.tv_today_id);
            this.f50173d = (TextView) view.findViewById(R.id.tv_zong_id);
        }
    }

    /* loaded from: classes3.dex */
    class i extends BaseQuickAdapter<CloudListDataBean, BaseViewHolder> {
        public i() {
            super(R.layout.item_cloud_list_item, CloudListFragmentV2.this.f50151q);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, CloudListDataBean cloudListDataBean) {
            ClouldItemView3 clouldItemView3 = (ClouldItemView3) baseViewHolder.getView(R.id.coulditem);
            int layoutPosition = baseViewHolder.getLayoutPosition();
            clouldItemView3.setCloudItemListener(CloudListFragmentV2.this);
            if (CloudListFragmentV2.this.f50151q.size() - 1 == layoutPosition) {
                CloudListFragmentV2 cloudListFragmentV2 = CloudListFragmentV2.this;
                CloudListFragmentV2 cloudListFragmentV22 = CloudListFragmentV2.this;
                clouldItemView3.setData(cloudListFragmentV2.f50147m, cloudListFragmentV2.f50151q.get(layoutPosition), cloudListFragmentV22.f50146l, cloudListFragmentV22.f50145k, false, true, cloudListFragmentV22);
            } else {
                CloudListFragmentV2 cloudListFragmentV23 = CloudListFragmentV2.this;
                CloudListFragmentV2 cloudListFragmentV24 = CloudListFragmentV2.this;
                clouldItemView3.setData(cloudListFragmentV23.f50147m, cloudListFragmentV23.f50151q.get(layoutPosition), cloudListFragmentV24.f50146l, cloudListFragmentV24.f50145k, false, false, cloudListFragmentV24);
            }
            clouldItemView3.setGBAType(CloudListFragmentV2.this.f50154t.f32496z2);
            GameMainActivity4 gameMainActivity4 = CloudListFragmentV2.this.f50154t;
            clouldItemView3.setPGN(gameMainActivity4.B2, gameMainActivity4.C2);
            if (CloudListFragmentV2.this.f50145k == 4) {
                BaseViewHolder visible = baseViewHolder.setVisible(R.id.ll_show, true);
                BaseViewHolder text = visible.setText(R.id.tv_today_id, CloudListFragmentV2.this.f50151q.get(layoutPosition).getTodayCoin() + "");
                text.setText(R.id.tv_zong_id, CloudListFragmentV2.this.f50151q.get(layoutPosition).getTotalCoin() + "");
                return;
            }
            baseViewHolder.setGone(R.id.ll_show, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class j extends RecyclerView.Adapter<h> {
        j() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: a */
        public void onBindViewHolder(@NonNull h hVar, int i4) {
            hVar.f50170a.setCloudItemListener(CloudListFragmentV2.this);
            if (CloudListFragmentV2.this.f50151q.size() - 1 == i4) {
                ClouldItemView3 clouldItemView3 = hVar.f50170a;
                CloudListFragmentV2 cloudListFragmentV2 = CloudListFragmentV2.this;
                CloudListFragmentV2 cloudListFragmentV22 = CloudListFragmentV2.this;
                clouldItemView3.setData(cloudListFragmentV2.f50147m, cloudListFragmentV2.f50151q.get(i4), cloudListFragmentV22.f50146l, cloudListFragmentV22.f50145k, false, true, cloudListFragmentV22);
            } else {
                ClouldItemView3 clouldItemView32 = hVar.f50170a;
                CloudListFragmentV2 cloudListFragmentV23 = CloudListFragmentV2.this;
                String str = cloudListFragmentV23.f50147m;
                CloudListDataBean cloudListDataBean = cloudListFragmentV23.f50151q.get(i4);
                CloudListFragmentV2 cloudListFragmentV24 = CloudListFragmentV2.this;
                clouldItemView32.setData(str, cloudListDataBean, cloudListFragmentV24.f50146l, cloudListFragmentV24.f50145k, false, false, cloudListFragmentV24);
            }
            hVar.f50170a.setGBAType(CloudListFragmentV2.this.f50154t.f32496z2);
            ClouldItemView3 clouldItemView33 = hVar.f50170a;
            GameMainActivity4 gameMainActivity4 = CloudListFragmentV2.this.f50154t;
            clouldItemView33.setPGN(gameMainActivity4.B2, gameMainActivity4.C2);
            if (CloudListFragmentV2.this.f50145k == 4) {
                hVar.f50171b.setVisibility(0);
                TextView textView = hVar.f50172c;
                textView.setText(CloudListFragmentV2.this.f50151q.get(i4).getTodayCoin() + "");
                TextView textView2 = hVar.f50173d;
                textView2.setText(CloudListFragmentV2.this.f50151q.get(i4).getTotalCoin() + "");
                return;
            }
            hVar.f50171b.setVisibility(8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: d */
        public h onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
            CloudListFragmentV2 cloudListFragmentV2 = CloudListFragmentV2.this;
            return new h(LayoutInflater.from(cloudListFragmentV2.getContext()).inflate(R.layout.item_cloud_list_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return CloudListFragmentV2.this.f50151q.size();
        }
    }

    private void f0(CloudListDataBean cloudListDataBean, boolean z4) {
        if (z4) {
            cloudListDataBean.setArchiveFilePath(com.join.mgps.Util.v.f28109i + File.separator + cloudListDataBean.getArchiveFileName());
        } else {
            cloudListDataBean.setArchiveFilePath(com.join.mgps.Util.v.f28108h + File.separator + cloudListDataBean.getArchiveFileName());
        }
        if (cloudListDataBean.getIsVip() == 1) {
            com.papa.sim.statistic.p.l(getContext()).O1(Event.VipArchive_download_page, new Ext().setGameId(this.f50147m));
        }
        Intent intent = new Intent(o1.a.f72005i0);
        intent.putExtra("downCloud", cloudListDataBean);
        getActivity().sendBroadcast(intent);
    }

    private ArchiveBuyArgs g0() {
        if (this.f50144j == null) {
            return null;
        }
        RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(getActivity());
        String str = this.f50144j.getUid() + "";
        String token = this.f50144j.getToken();
        String str2 = this.f50147m;
        int i4 = this.f50148n;
        this.f50148n = i4 + 1;
        return requestBeanUtil.getArchiveBuy(str, token, str2, i4);
    }

    private ArchiveColudArgs h0() {
        if (this.f50144j == null) {
            return RequestBeanUtil.getInstance(getContext()).getArchiveNum("", "", this.f50147m);
        }
        RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(getContext());
        return requestBeanUtil.getArchiveNum(this.f50144j.getUid() + "", this.f50144j.getToken(), this.f50147m);
    }

    private ArchiveevaluateArgs i0(CloudListDataBean cloudListDataBean, int i4) {
        String archiveId;
        if (this.f50144j == null) {
            return null;
        }
        if (this.f50146l == 3) {
            archiveId = cloudListDataBean.getId();
        } else {
            archiveId = cloudListDataBean.getArchiveId();
        }
        RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(getActivity());
        return requestBeanUtil.getArchiveEvaluate(this.f50144j.getUid() + "", this.f50144j.getToken(), archiveId, i4);
    }

    private ArchiveshopArgs j0() {
        if (this.f50144j == null) {
            RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(getActivity());
            String str = this.f50147m;
            int i4 = this.f50149o;
            int i5 = this.f50148n;
            this.f50148n = i5 + 1;
            return requestBeanUtil.getArchiveshop("", "", str, i4, i5);
        }
        RequestBeanUtil requestBeanUtil2 = RequestBeanUtil.getInstance(getActivity());
        String str2 = this.f50144j.getUid() + "";
        String token = this.f50144j.getToken();
        String str3 = this.f50147m;
        int i6 = this.f50149o;
        int i7 = this.f50148n;
        this.f50148n = i7 + 1;
        return requestBeanUtil2.getArchiveshop(str2, token, str3, i6, i7);
    }

    private void l0() {
        this.C.clear();
        showLoding();
        m0(this.f50148n);
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
        if (this.f50137c == null || this.f50138d == null) {
            return;
        }
        try {
            o0();
            this.f50156v = true;
            this.f50137c.setVisibility(0);
            if (this.f50146l == 3) {
                this.f50139e.setText("从本地挑一个分享吧");
            } else {
                this.f50139e.setText("去推荐下载一个吧");
            }
            this.f50138d.setVisibility(8);
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
            ArchiveShopDataBean.DataInfoBean data_info = this.f50150p.g(j02.getArgs()).getData_info();
            if (i4 == 1 && (data_info == null || data_info.getMarketList().size() == 0)) {
                A0();
                return;
            }
            int i5 = i4 + 1;
            if (data_info != null) {
                List<CloudListDataBean> marketList = data_info.getMarketList();
                if (marketList != null && marketList.size() > 0) {
                    this.D.addAll(marketList);
                    if (i5 <= this.B) {
                        B0(i5);
                        return;
                    }
                    this.f50151q.clear();
                    this.f50151q.addAll(this.D);
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
            this.D.clear();
            this.C.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C0(CloudListDataBean cloudListDataBean) {
        cloudListDataBean.setStatus(6);
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.f(cloudListDataBean, cloudListDataBean.getStatus()));
        Iterator<CloudListDataBean> it2 = this.f50151q.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (it2.next().getArchiveDesc().equals(cloudListDataBean.getArchiveDesc())) {
                it2.remove();
                break;
            }
        }
        this.f50152r.notifyDataSetChanged();
        if (this.f50151q.size() == 0) {
            A0();
        } else {
            v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D0(CloudListDataBean cloudListDataBean) {
        Iterator<CloudListDataBean> it2 = this.f50151q.iterator();
        while (it2.hasNext()) {
            if (it2.next().getArchiveDesc().equals(cloudListDataBean.getArchiveDesc())) {
                it2.remove();
                F0();
                if (this.f50151q.size() == 0) {
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
        XRecyclerView xRecyclerView = this.f50138d;
        if (xRecyclerView != null) {
            try {
                xRecyclerView.stopLoadMore();
                this.f50138d.stopRefresh();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void F0() {
        if (this.f50136b) {
            return;
        }
        this.f50152r.notifyDataSetChanged();
    }

    @Override // com.join.mgps.listener.c
    public void G(CloudListDataBean cloudListDataBean) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G0() {
        try {
            if (this.f50136b) {
                return;
            }
            this.f50152r.notifyDataSetChanged();
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
            this.f50156v = true;
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
            XRecyclerView xRecyclerView = this.f50138d;
            if (xRecyclerView != null) {
                xRecyclerView.reset();
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
                ArchiveEvaluteDataBean a5 = this.f50150p.a(i0(cloudListDataBean, i4).getArgs());
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
            hashMap.put("uid", this.f50144j.getUid() + "");
            hashMap.put("token", this.f50144j.getToken());
            ArchiveResponseMain<ArchiveResponseMessage> e5 = this.f50150p.e(hashMap);
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
            for (CloudDownRecoderTable cloudDownRecoderTable : b2.i.o().n(this.f50147m)) {
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
        this.f50145k = getArguments().getInt("type", 9);
        this.f50146l = getArguments().getInt("typeIndex");
        this.f50147m = getArguments().getString("gameid");
        this.f50144j = AccountUtil_.getInstance_(getActivity()).getAccountData();
        this.f50153s = LocalBroadcastManager.getInstance(getActivity());
        this.f50150p = com.join.mgps.rpc.impl.c.k();
        this.f50151q = new ArrayList();
        org.greenrobot.eventbus.c.f().t(this);
        this.f50152r = new j();
        this.f50154t = (GameMainActivity4) getActivity();
        this.f50138d.setLayoutManager(new LinearLayoutManager(getContext()));
        UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
        aVar.f46233f = 0;
        aVar.f46237d = (int) getResources().getDimension(R.dimen.wdp16);
        this.f50138d.addItemDecoration(new a(aVar));
        this.f50138d.setAdapter(this.f50152r);
        int i4 = this.f50145k;
        if (i4 == 1) {
            this.f50149o = 0;
            l0();
        } else if (i4 == 2) {
            this.f50149o = 2;
            l0();
        } else if (i4 == 3) {
            this.f50149o = 1;
            l0();
        } else {
            this.f50149o = 3;
            l0();
        }
        this.f50137c.setOnClickListener(new b());
        this.f50138d.setLoadingListener(new c());
        this.f50138d.setPreLoadCount(3);
        this.f50138d.reset();
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
        ArchiveResponseMain<ArchiveResponseMessage> b5 = this.f50150p.b(hashMap);
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
        if (this.C.size() > 0) {
            this.C.clear();
            this.D.clear();
            this.B = this.f50148n - 1;
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
            if (this.f50148n == 2) {
                this.f50151q.clear();
            }
            G0();
            for (int i4 = 0; i4 < list.size(); i4++) {
                this.f50151q.add(list.get(i4));
            }
            this.f50156v = true;
            if (list.size() < 10) {
                y0();
            }
            for (CloudListDataBean cloudListDataBean : this.f50151q) {
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
            if (this.f50146l == 4) {
                hashMap.put("id", cloudListDataBean.getArchiveId());
            } else {
                hashMap.put("id", cloudListDataBean.getId());
            }
            hashMap.put("uid", accountData.getUid() + "");
            hashMap.put("token", accountData.getToken());
            ArchiveDownDataBean d5 = this.f50150p.d(hashMap);
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
            if (this.f50156v) {
                this.f50156v = false;
                if (this.f50146l == 3) {
                    ArchiveShopDataBean g4 = this.f50150p.g(j0().getArgs());
                    E0();
                    if ((g4 == null || g4.getData_info() == null || g4.getData_info().getMarketList() == null || g4.getData_info().getMarketList().size() == 0) && this.f50148n == 2) {
                        A0();
                        return;
                    } else {
                        V(g4);
                        return;
                    }
                }
                ArchiveBuyArgs g02 = g0();
                if (!AccountUtil_.getInstance_(getActivity()).getToken().equals("") && this.f50144j.getUid() != 0 && !AccountUtil_.getInstance_(getActivity()).isTourist()) {
                    ArchiveShopDataBean i5 = this.f50150p.i(g02.getArgs());
                    E0();
                    if (i5.getCode() == -1 && i5.getMsg().equals("701") && !AccountUtil_.getInstance_(getActivity()).isTourist()) {
                        this.f50156v = true;
                        AccountUtil_.getInstance_(getActivity()).accountLoginOut(getActivity());
                        x0();
                        return;
                    } else if (i5.getData_info().getMarketList().size() == 0 && this.f50148n == 2) {
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
        LinearLayout linearLayout = this.f50140f;
        if (linearLayout == null || this.f50141g == null) {
            return;
        }
        try {
            linearLayout.setVisibility(8);
            this.f50141g.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f50136b = true;
        com.join.mgps.Util.d0.a().e(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMain(com.join.mgps.event.i iVar) {
        if (this.f50145k != 4) {
            this.f50155u = true;
            String a5 = iVar.a();
            if (this.f50146l == 3 && g2.i(a5)) {
                for (CloudListDataBean cloudListDataBean : this.f50151q) {
                    String archiveDesc = cloudListDataBean.getArchiveDesc();
                    if (g2.i(archiveDesc) && archiveDesc.equals(a5)) {
                        this.C.add(iVar.a());
                    }
                }
                List<CloudListDataBean> list = this.f50151q;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (int i4 = 0; i4 < this.f50151q.size(); i4++) {
                    if (this.f50151q.get(i4).getArchiveDesc().equals(a5)) {
                        this.f50151q.remove(i4);
                        G0();
                    }
                }
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.f fVar) {
        List<CloudListDataBean> list = this.f50151q;
        if (list != null && list.size() != 0) {
            int i4 = 0;
            while (i4 < this.f50151q.size()) {
                CloudListDataBean cloudListDataBean = this.f50151q.get(i4);
                if (fVar.a().getFileMd5().equals(cloudListDataBean.getFileMd5())) {
                    cloudListDataBean.setStatus(fVar.e());
                    int firstVisiblePosition = this.f50138d.getFirstVisiblePosition();
                    int lastVisiblePosition = this.f50138d.getLastVisiblePosition();
                    if (i4 >= firstVisiblePosition && i4 <= lastVisiblePosition) {
                        BaseViewHolder baseViewHolder = (BaseViewHolder) this.f50138d.getChildViewHolder(this.f50138d.getChildAt(i4 - firstVisiblePosition));
                        if (baseViewHolder != null && baseViewHolder.getView(R.id.coulditem) != null) {
                            ((ClouldItemView3) baseViewHolder.getView(R.id.coulditem)).setData(this.f50147m, cloudListDataBean, this.f50146l, this.f50145k, false, this.f50151q.size() - 1 == i4, this);
                        }
                    }
                }
                i4++;
            }
        } else if (this.f50145k == 4) {
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
        if (this.f50146l == 3) {
            u0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f50144j = AccountUtil_.getInstance_(getActivity()).getAccountData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        XRecyclerView xRecyclerView = this.f50138d;
        if (xRecyclerView == null || this.f50137c == null) {
            return;
        }
        try {
            xRecyclerView.setVisibility(8);
            this.f50137c.setVisibility(0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        XRecyclerView xRecyclerView = this.f50138d;
        if (xRecyclerView == null || this.f50137c == null) {
            return;
        }
        try {
            xRecyclerView.setVisibility(0);
            this.f50137c.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.listener.c
    public void r(CloudListDataBean cloudListDataBean) {
        if (cloudListDataBean.getIsVip() == 1) {
            com.papa.sim.statistic.p.l(getContext()).O1(Event.VipArchive_startover_page, new Ext().setGameId(this.f50147m));
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
        LinearLayout linearLayout = this.f50137c;
        if (linearLayout == null || this.f50138d == null) {
            return;
        }
        try {
            linearLayout.setVisibility(8);
            this.f50138d.setVisibility(8);
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
            LinearLayout linearLayout = this.f50140f;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.f50141g;
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
        LinearLayout linearLayout = this.f50141g;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f50140f;
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
        return this.f50143i.cloudVipLink().d();
    }

    public void t0(boolean z4) {
        this.f50158x = z4;
    }

    public void u0() {
        LinearLayout linearLayout = this.f50137c;
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
            if (accountData.M() <= 0 && cloudListDataBean.getIsVip() != 1) {
                if (cloudListDataBean.getArchiveCoin() != null && accountData.O1() < Integer.parseInt(cloudListDataBean.getArchiveCoin())) {
                    l2.a(getContext()).b("剩余铜板不足，去签到领取更多铜板吧");
                    return;
                } else if (this.f50143i.DownloadRecoderNoticeMarcket().d().booleanValue() && cloudListDataBean.getArchiveCoin() != null && Integer.parseInt(cloudListDataBean.getArchiveCoin()) != 0) {
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
        List<CloudListDataBean> list = this.f50151q;
        if (list != null && list.size() > 0) {
            this.f50151q.clear();
            G0();
            this.f50148n = 1;
            W();
            r0();
            m0(this.f50148n);
            return;
        }
        this.f50148n = 1;
        W();
        r0();
        m0(this.f50148n);
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
        XRecyclerView xRecyclerView = this.f50138d;
        if (xRecyclerView != null) {
            try {
                xRecyclerView.stopLoadMore();
                this.f50138d.stopRefresh();
                this.f50138d.setNoMore();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z0() {
        XRecyclerView xRecyclerView;
        LinearLayout linearLayout = this.f50137c;
        if (linearLayout == null || (xRecyclerView = this.f50138d) == null || xRecyclerView == null) {
            return;
        }
        try {
            this.f50156v = true;
            if (this.f50148n == 2) {
                linearLayout.setVisibility(0);
                if (this.f50146l == 3) {
                    this.f50139e.setText("从本地挑一个分享吧");
                } else {
                    this.f50139e.setText("去推荐下载一个吧");
                }
                this.f50138d.setVisibility(8);
                return;
            }
            linearLayout.setVisibility(8);
            this.f50138d.setVisibility(0);
            this.f50138d.stopLoadMore();
            this.f50138d.stopRefresh();
            this.f50138d.setNoMore();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
