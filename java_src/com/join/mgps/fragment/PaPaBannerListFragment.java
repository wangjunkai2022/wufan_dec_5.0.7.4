package com.join.mgps.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.adapter.PaPaListItemDownloadAdapter;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CollectionInfo;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.GameFactoryListBean;
import com.join.mgps.dto.GameHeadAd;
import com.join.mgps.dto.GameListAndCollectionInfo;
import com.join.mgps.dto.GameListAndHeadAdAndCollectionInfoBean;
import com.join.mgps.dto.GameListAndHeadAdBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.PaPaBean;
import com.join.mgps.dto.RequestGoogleRankArgs;
import com.join.mgps.dto.RequestPnAndPcArgs;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.enums.ConstantIntEnum;
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
@EFragment(R.layout.fragment_papa_banner_list)
/* loaded from: classes.dex */
public class PaPaBannerListFragment extends Fragment implements AbsListView.OnScrollListener {
    public static final int A = 11;
    public static final int B = 12;
    public static final int C = 13;
    public static final int D = 14;
    public static final int E = 15;
    public static final int F = 16;
    public static final int G = 17;
    public static final int H = 18;
    public static final int I = 19;

    /* renamed from: x  reason: collision with root package name */
    private static final int f52506x = 20;

    /* renamed from: y  reason: collision with root package name */
    private static final int f52507y = 3;

    /* renamed from: z  reason: collision with root package name */
    public static final int f52508z = 1;

    /* renamed from: e  reason: collision with root package name */
    com.join.mgps.rpc.e f52512e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    XListView2 f52513f;

    /* renamed from: g  reason: collision with root package name */
    PaPaListItemDownloadAdapter f52514g;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f52516i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f52517j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    PtrClassicFrameLayout f52518k;

    /* renamed from: l  reason: collision with root package name */
    private Activity f52519l;

    /* renamed from: n  reason: collision with root package name */
    String f52521n;

    /* renamed from: o  reason: collision with root package name */
    String f52522o;

    /* renamed from: p  reason: collision with root package name */
    String f52523p;

    /* renamed from: s  reason: collision with root package name */
    private int f52526s;

    /* renamed from: t  reason: collision with root package name */
    private int f52527t;

    /* renamed from: b  reason: collision with root package name */
    int f52509b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f52510c = 1;

    /* renamed from: d  reason: collision with root package name */
    private boolean f52511d = false;

    /* renamed from: h  reason: collision with root package name */
    List<PaPaBean> f52515h = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    int f52520m = 0;

    /* renamed from: q  reason: collision with root package name */
    private List<DownloadTask> f52524q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    private Map<String, DownloadTask> f52525r = new ConcurrentHashMap();

    /* renamed from: u  reason: collision with root package name */
    private boolean f52528u = false;

    /* renamed from: v  reason: collision with root package name */
    private final View.OnClickListener f52529v = new d();

    /* renamed from: w  reason: collision with root package name */
    private View.OnClickListener f52530w = new e();

    /* loaded from: classes3.dex */
    class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (!PaPaBannerListFragment.this.isActivityFinish() && PaPaBannerListFragment.this.f52511d) {
                if (!com.join.android.app.common.utils.j.j(PaPaBannerListFragment.this.f52519l)) {
                    PaPaBannerListFragment.this.f52513f.u();
                    PaPaBannerListFragment paPaBannerListFragment = PaPaBannerListFragment.this;
                    paPaBannerListFragment.showToast(paPaBannerListFragment.getString(R.string.net_connect_failed));
                    return;
                }
                PaPaBannerListFragment.this.Z();
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (PaPaBannerListFragment.this.isActivityFinish()) {
                return;
            }
            if (com.join.android.app.common.utils.j.j(PaPaBannerListFragment.this.f52519l)) {
                PaPaBannerListFragment.this.f52510c = 1;
                PaPaBannerListFragment.this.Z();
                return;
            }
            PaPaBannerListFragment.this.f52513f.v();
            PaPaBannerListFragment paPaBannerListFragment = PaPaBannerListFragment.this;
            paPaBannerListFragment.showToast(paPaBannerListFragment.getString(R.string.net_connect_failed));
        }
    }

    /* loaded from: classes3.dex */
    class c implements AdapterView.OnItemClickListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            List<PaPaBean> list = PaPaBannerListFragment.this.f52515h;
            if (list == null || list.size() <= 0 || i4 >= PaPaBannerListFragment.this.f52515h.size() || PaPaBannerListFragment.this.f52515h.get(i4).getType() != PaPaBean.PaPaBeanTypes.TYPE_CONTENT_GAMEINFO.value()) {
                return;
            }
            PaPaBannerListFragment.this.f0((AppBean) PaPaBannerListFragment.this.f52515h.get(i4).getTypeValue());
        }
    }

    /* loaded from: classes3.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getTag() instanceof AppBean) {
                PaPaBannerListFragment.this.f0((AppBean) view.getTag());
            } else if (view.getTag() instanceof CollectionInfo) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(2);
                intentDateBean.setTpl_type("4");
                intentDateBean.setCrc_link_type_val(((CollectionInfo) view.getTag()).getCollection_id());
                IntentUtil.getInstance().intentActivity(PaPaBannerListFragment.this.f52519l, intentDateBean);
            } else if (view.getTag() instanceof GameHeadAd.SubInfo) {
                IntentUtil.getInstance().intentActivity(PaPaBannerListFragment.this.f52519l, ((GameHeadAd.SubInfo) view.getTag()).getIntentDataBean());
            }
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AppBean appBean = (AppBean) view.getTag();
            if (appBean == null) {
                return;
            }
            DownloadTask downloadTask = appBean.getDownloadTask();
            String plugin_num = appBean.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(appBean.getDown_url_remote());
                if (downloadTask == null) {
                    downloadTask = appBean.getDownloadtaskDown();
                }
                UtilsMy.T2(downloadTask, PaPaBannerListFragment.this.f52519l);
                IntentUtil.getInstance().intentActivity(PaPaBannerListFragment.this.f52519l, intentDateBean);
            } else if (downloadTask == null) {
                if (UtilsMy.o0(appBean.getTag_info()) && com.join.android.app.common.utils.e.l0(PaPaBannerListFragment.this.f52519l).d(PaPaBannerListFragment.this.f52519l, appBean.getPackageName())) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(PaPaBannerListFragment.this.f52519l).l(PaPaBannerListFragment.this.f52519l, appBean.getPackageName());
                    if (!g2.i(appBean.getVer()) || l4.d() >= Integer.parseInt(appBean.getVer())) {
                        com.join.android.app.common.utils.e.l0(PaPaBannerListFragment.this.f52519l);
                        APKUtils.a0(PaPaBannerListFragment.this.f52519l, appBean.getPackageName());
                        return;
                    }
                }
                if (UtilsMy.y0(appBean.getPay_tag_info(), appBean.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(PaPaBannerListFragment.this.f52519l, appBean.getCrc_sign_id());
                } else {
                    UtilsMy.W0(PaPaBannerListFragment.this.f52519l, appBean);
                }
            } else {
                int status = downloadTask != null ? downloadTask.getStatus() : 0;
                if (UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id()) > 0) {
                    status = 43;
                }
                if (status != 0) {
                    if (status == 13) {
                        com.php25.PDownload.d.l(PaPaBannerListFragment.this.f52519l, downloadTask);
                        return;
                    }
                    if (status != 2) {
                        if (status != 3) {
                            if (status == 5) {
                                UtilsMy.T3(PaPaBannerListFragment.this.f52519l, downloadTask);
                                return;
                            } else if (status != 6) {
                                if (status != 7) {
                                    if (status == 42) {
                                        if (!com.join.android.app.common.utils.j.j(PaPaBannerListFragment.this.f52519l)) {
                                            PaPaBannerListFragment.this.showToast("无网络连接");
                                            return;
                                        } else {
                                            UtilsMy.r4(PaPaBannerListFragment.this.getContext(), downloadTask);
                                            return;
                                        }
                                    } else if (status != 43) {
                                        switch (status) {
                                            case 9:
                                                if (com.join.android.app.common.utils.j.j(PaPaBannerListFragment.this.f52519l)) {
                                                    UtilsMy.I2(PaPaBannerListFragment.this.f52519l, downloadTask);
                                                    return;
                                                } else {
                                                    PaPaBannerListFragment.this.showToast("无网络连接");
                                                    return;
                                                }
                                            case 10:
                                                break;
                                            case 11:
                                                UtilsMy.a4(downloadTask, PaPaBannerListFragment.this.f52519l);
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                        }
                        com.php25.PDownload.d.c(downloadTask, PaPaBannerListFragment.this.f52519l);
                        return;
                    }
                    com.php25.PDownload.d.i(downloadTask);
                    return;
                }
                if (UtilsMy.y0(appBean.getPay_tag_info(), appBean.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(PaPaBannerListFragment.this.f52519l, appBean.getCrc_sign_id());
                    return;
                }
                UtilsMy.x1(downloadTask, appBean);
                if (UtilsMy.o1(PaPaBannerListFragment.this.f52519l, downloadTask)) {
                    return;
                }
                if (appBean.getDown_status() == 5) {
                    UtilsMy.l1(PaPaBannerListFragment.this.f52519l, downloadTask);
                } else {
                    UtilsMy.R0(PaPaBannerListFragment.this.f52519l, downloadTask, appBean.getTp_down_url(), appBean.getOther_down_switch(), appBean.getCdn_down_switch());
                }
            }
        }
    }

    private void b0() {
        if (com.join.android.app.common.utils.j.j(this.f52519l)) {
            u0();
            Z();
            return;
        }
        s0();
    }

    private CommonRequestBean<RequestPnAndPcArgs> d0() {
        if (this.f52509b == 11) {
            return RequestBeanUtil.getInstance(this.f52519l).getRequestPnAndPc(this.f52510c, 3);
        }
        return RequestBeanUtil.getInstance(this.f52519l).getRequestPnAndPc(this.f52510c, 20);
    }

    private CommonRequestBean<RequestGoogleRankArgs> e0() {
        return RequestBeanUtil.getInstance(this.f52519l).getRequestPnAndPcByAreaAndRank(this.f52510c, 20, a0(), c0());
    }

    public static PaPaBannerListFragment l0(int i4) {
        PaPaBannerListFragment_ paPaBannerListFragment_ = new PaPaBannerListFragment_();
        Bundle bundle = new Bundle();
        bundle.putInt("type", i4);
        paPaBannerListFragment_.setArguments(bundle);
        return paPaBannerListFragment_;
    }

    public static PaPaBannerListFragment m0(int i4, HashMap<String, String> hashMap) {
        PaPaBannerListFragment_ paPaBannerListFragment_ = new PaPaBannerListFragment_();
        Bundle bundle = new Bundle();
        bundle.putInt("type", i4);
        for (String str : hashMap.keySet()) {
            bundle.putString(str, hashMap.get(str));
        }
        paPaBannerListFragment_.setArguments(bundle);
        return paPaBannerListFragment_;
    }

    private void o0(DownloadTask downloadTask) {
        try {
            Iterator<DownloadTask> it2 = this.f52524q.iterator();
            while (it2.hasNext()) {
                DownloadTask next = it2.next();
                if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    this.f52525r.remove(next.getCrc_link_type_val());
                    it2.remove();
                    Iterator<PaPaBean> it3 = this.f52515h.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            PaPaBean next2 = it3.next();
                            if (next2.getType() == PaPaBean.PaPaBeanTypes.TYPE_CONTENT_COLLECTION.value()) {
                                Iterator it4 = ((List) next2.getTypeValue()).iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        AppBean appBean = (AppBean) it4.next();
                                        if (appBean.getMod_info() != null) {
                                            DownloadTask downloadTask2 = this.f52525r.get(appBean.getMod_info().getMod_game_id());
                                            DownloadTask downloadTask3 = this.f52525r.get(appBean.getGame_id());
                                            if (downloadTask2 == null && downloadTask3 == null) {
                                                appBean.setDownloadTask(null);
                                            } else if (downloadTask2 != null) {
                                                appBean.setDownloadTask(downloadTask2);
                                            } else if (downloadTask3 != null) {
                                                appBean.setDownloadTask(downloadTask3);
                                            } else {
                                                appBean.setDownloadTask(null);
                                            }
                                        } else if (appBean.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                                            appBean.setDownloadTask(null);
                                            break;
                                        }
                                    }
                                }
                            } else if (next2.getType() == PaPaBean.PaPaBeanTypes.TYPE_CONTENT_GAMEINFO.value()) {
                                AppBean appBean2 = (AppBean) next2.getTypeValue();
                                if (appBean2.getMod_info() != null) {
                                    DownloadTask F2 = p1.f.K().F(appBean2.getMod_info().getMod_game_id());
                                    DownloadTask F3 = p1.f.K().F(appBean2.getGame_id());
                                    if (F2 == null && F3 == null) {
                                        appBean2.setDownloadTask(null);
                                    } else if (F2 != null) {
                                        appBean2.setDownloadTask(F2);
                                    } else if (F3 != null) {
                                        appBean2.setDownloadTask(F3);
                                    } else {
                                        appBean2.setDownloadTask(null);
                                    }
                                } else if (appBean2.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                                    appBean2.setDownloadTask(null);
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.f52514g.notifyDataSetChanged();
    }

    private void p0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f52525r;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            this.f52514g.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void q0(DownloadTask downloadTask) {
        UtilsMy.B4(this.f52524q, downloadTask);
        if (!this.f52525r.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f52524q.add(downloadTask);
            this.f52525r.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        w0(downloadTask);
        this.f52514g.notifyDataSetChanged();
    }

    private void r0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f52525r;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f52524q.add(downloadTask);
            this.f52525r.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        DownloadTask downloadTask2 = this.f52525r.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        w0(downloadTask);
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        downloadTask2.setGameZipPath(downloadTask.getGameZipPath());
        this.f52514g.notifyDataSetChanged();
    }

    private void w0(DownloadTask downloadTask) {
        try {
            for (PaPaBean paPaBean : this.f52515h) {
                boolean z4 = false;
                if (paPaBean.getType() == PaPaBean.PaPaBeanTypes.TYPE_CONTENT_COLLECTION.value()) {
                    Iterator it2 = ((List) paPaBean.getTypeValue()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            AppBean appBean = (AppBean) it2.next();
                            if (appBean.getMod_info() != null) {
                                ModInfoBean mod_info = appBean.getMod_info();
                                DownloadTask downloadTask2 = this.f52525r.get(mod_info.getMain_game_id());
                                boolean z5 = true;
                                boolean z6 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                                DownloadTask downloadTask3 = this.f52525r.get(mod_info.getMod_game_id());
                                if (downloadTask3 == null || downloadTask3.getStatus() != 5) {
                                    z5 = false;
                                }
                                if (!z5 || !z6) {
                                    if (z5) {
                                        if (appBean.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(appBean.getMod_info().getMod_game_id())) {
                                            appBean.setDownloadTask(downloadTask);
                                            break;
                                        }
                                    } else if (z6) {
                                        if (downloadTask.getCrc_link_type_val().equals(appBean.getCrc_sign_id())) {
                                            appBean.setDownloadTask(downloadTask);
                                            break;
                                        }
                                    } else {
                                        DownloadTask F2 = appBean.getMod_info() != null ? p1.f.K().F(appBean.getMod_info().getMod_game_id()) : null;
                                        if (F2 == null) {
                                            F2 = p1.f.K().F(appBean.getCrc_sign_id());
                                        }
                                        if (F2 != null && downloadTask.getCrc_link_type_val().equals(F2.getCrc_link_type_val())) {
                                            appBean.setDownloadTask(downloadTask);
                                            break;
                                        }
                                    }
                                } else if (downloadTask.getCrc_link_type_val().equals(appBean.getCrc_sign_id())) {
                                    appBean.setDownloadTask(downloadTask);
                                    break;
                                }
                            } else if (appBean.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                                appBean.setDownloadTask(downloadTask);
                                break;
                            }
                        }
                    }
                } else if (paPaBean.getType() == PaPaBean.PaPaBeanTypes.TYPE_CONTENT_GAMEINFO.value()) {
                    AppBean appBean2 = (AppBean) paPaBean.getTypeValue();
                    if (appBean2.getMod_info() != null) {
                        ModInfoBean mod_info2 = appBean2.getMod_info();
                        DownloadTask downloadTask4 = this.f52525r.get(mod_info2.getMain_game_id());
                        boolean d5 = (downloadTask4 == null || downloadTask4.getStatus() != 5) ? false : com.join.android.app.common.utils.e.l0(getContext()).d(getContext(), downloadTask4.getPackageName());
                        DownloadTask downloadTask5 = this.f52525r.get(mod_info2.getMod_game_id());
                        if (downloadTask5 != null && downloadTask5.getStatus() == 5) {
                            z4 = com.join.mgps.va.overmind.d.o().F(downloadTask5.getPackageName());
                        }
                        if (z4 && d5) {
                            if (downloadTask.getCrc_link_type_val().equals(appBean2.getCrc_sign_id())) {
                                appBean2.setDownloadTask(downloadTask);
                                return;
                            }
                        } else if (z4) {
                            if (appBean2.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(appBean2.getMod_info().getMod_game_id())) {
                                appBean2.setDownloadTask(downloadTask);
                                return;
                            }
                        } else if (d5) {
                            if (downloadTask.getCrc_link_type_val().equals(appBean2.getCrc_sign_id())) {
                                appBean2.setDownloadTask(downloadTask);
                                return;
                            }
                        } else {
                            DownloadTask F3 = appBean2.getMod_info() != null ? p1.f.K().F(appBean2.getMod_info().getMod_game_id()) : null;
                            if (F3 == null) {
                                F3 = p1.f.K().F(appBean2.getCrc_sign_id());
                            }
                            if (F3 != null && downloadTask.getCrc_link_type_val().equals(F3.getCrc_link_type_val())) {
                                appBean2.setDownloadTask(downloadTask);
                                return;
                            }
                        }
                    } else if (appBean2.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                        appBean2.setDownloadTask(downloadTask);
                        return;
                    }
                } else {
                    continue;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void x0(List<PaPaBean> list) {
        List<DownloadTask> list2;
        if (list == null || list.size() == 0 || (list2 = this.f52524q) == null || list2.size() == 0) {
            return;
        }
        for (DownloadTask downloadTask : this.f52524q) {
            Iterator<PaPaBean> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    PaPaBean next = it2.next();
                    boolean z4 = false;
                    if (next.getType() == PaPaBean.PaPaBeanTypes.TYPE_CONTENT_COLLECTION.value()) {
                        Iterator it3 = ((List) next.getTypeValue()).iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                AppBean appBean = (AppBean) it3.next();
                                if (appBean.getMod_info() != null) {
                                    ModInfoBean mod_info = appBean.getMod_info();
                                    DownloadTask downloadTask2 = this.f52525r.get(mod_info.getMain_game_id());
                                    boolean z5 = true;
                                    boolean z6 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                                    DownloadTask downloadTask3 = this.f52525r.get(mod_info.getMod_game_id());
                                    z5 = (downloadTask3 == null || downloadTask3.getStatus() != 5) ? false : false;
                                    if (!z5 || !z6) {
                                        if (z5) {
                                            if (appBean.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(appBean.getMod_info().getMod_game_id())) {
                                                appBean.setDownloadTask(downloadTask);
                                                break;
                                            }
                                        } else if (z6) {
                                            if (appBean.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                                                appBean.setDownloadTask(downloadTask);
                                                break;
                                            }
                                        } else {
                                            DownloadTask F2 = appBean.getMod_info() != null ? p1.f.K().F(appBean.getMod_info().getMod_game_id()) : null;
                                            if (F2 == null) {
                                                F2 = p1.f.K().F(appBean.getCrc_sign_id());
                                            }
                                            if (F2 != null && downloadTask.getCrc_link_type_val().equals(F2.getCrc_link_type_val())) {
                                                appBean.setDownloadTask(downloadTask);
                                                break;
                                            }
                                        }
                                    } else if (appBean.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                                        appBean.setDownloadTask(downloadTask);
                                        break;
                                    }
                                } else if (appBean.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                                    appBean.setDownloadTask(downloadTask);
                                    break;
                                }
                            }
                        }
                    } else if (next.getType() == PaPaBean.PaPaBeanTypes.TYPE_CONTENT_GAMEINFO.value()) {
                        AppBean appBean2 = (AppBean) next.getTypeValue();
                        if (appBean2.getMod_info() != null) {
                            ModInfoBean mod_info2 = appBean2.getMod_info();
                            DownloadTask downloadTask4 = this.f52525r.get(mod_info2.getMain_game_id());
                            boolean d5 = (downloadTask4 == null || downloadTask4.getStatus() != 5) ? false : com.join.android.app.common.utils.e.l0(getContext()).d(getContext(), downloadTask4.getPackageName());
                            DownloadTask downloadTask5 = this.f52525r.get(mod_info2.getMod_game_id());
                            if (downloadTask5 != null && downloadTask5.getStatus() == 5) {
                                z4 = com.join.mgps.va.overmind.d.o().F(downloadTask5.getPackageName());
                            }
                            if (!z4 || !d5) {
                                if (!z4) {
                                    if (d5) {
                                        if (appBean2.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                                            appBean2.setDownloadTask(downloadTask);
                                            break;
                                        }
                                    } else {
                                        DownloadTask F3 = appBean2.getMod_info() != null ? p1.f.K().F(appBean2.getMod_info().getMod_game_id()) : null;
                                        if (F3 == null) {
                                            F3 = p1.f.K().F(appBean2.getCrc_sign_id());
                                        }
                                        if (F3 != null && downloadTask.getCrc_link_type_val().equals(F3.getCrc_link_type_val())) {
                                            appBean2.setDownloadTask(downloadTask);
                                            break;
                                        }
                                    }
                                } else {
                                    if (appBean2.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(appBean2.getMod_info().getMod_game_id())) {
                                        appBean2.setDownloadTask(downloadTask);
                                        break;
                                    }
                                }
                            } else {
                                if (appBean2.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                                    appBean2.setDownloadTask(downloadTask);
                                    break;
                                }
                            }
                        } else if (appBean2.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                            appBean2.setDownloadTask(downloadTask);
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    private void y0() {
        DownloadTask downloadTask;
        for (int i4 = this.f52527t; i4 <= this.f52526s; i4++) {
            PaPaBean paPaBean = (PaPaBean) this.f52513f.getItemAtPosition(i4);
            if (paPaBean != null && paPaBean.getType() == PaPaBean.PaPaBeanTypes.TYPE_CONTENT_GAMEINFO.value() && (downloadTask = ((AppBean) paPaBean.getTypeValue()).getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                View childAt = this.f52513f.getChildAt(i4 - this.f52527t);
                if (childAt.getTag() instanceof PaPaListItemDownloadAdapter.b) {
                    PaPaListItemDownloadAdapter.b bVar = (PaPaListItemDownloadAdapter.b) childAt.getTag();
                    try {
                        DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                        if (f5 == null) {
                            return;
                        }
                        long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                        if (downloadTask.getSize() == 0) {
                            TextView textView = bVar.f43809j;
                            textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        } else {
                            TextView textView2 = bVar.f43809j;
                            textView2.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        }
                        if (downloadTask.getStatus() == 12) {
                            bVar.f43803d.setProgress((int) f5.getProgress());
                        } else {
                            bVar.f43804e.setProgress((int) f5.getProgress());
                        }
                        if (downloadTask.getStatus() == 2) {
                            TextView textView3 = bVar.f43810k;
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
    @UiThread
    public void A0(List<PaPaBean> list) {
        if (this.f52510c <= 1) {
            this.f52515h.clear();
        }
        x0(list);
        if (this.f52511d) {
            this.f52510c++;
        }
        if (list != null && list.size() > 0) {
            this.f52515h.addAll(list);
        }
        this.f52513f.u();
        this.f52513f.v();
        if (!this.f52511d) {
            this.f52513f.setNoMore();
            if (this.f52515h.size() <= 0) {
                return;
            }
        }
        this.f52514g.notifyDataSetChanged();
    }

    List<PaPaBean> B0(List<GameHeadAd> list, List<GameListAndCollectionInfo> list2) {
        ArrayList arrayList = new ArrayList();
        if (this.f52510c <= 1 && list != null && list.size() >= 1) {
            PaPaBean paPaBean = new PaPaBean();
            paPaBean.setType(PaPaBean.PaPaBeanTypes.TYPE_IMAGE_HEADER.value());
            paPaBean.setTypeValue(list);
            arrayList.add(paPaBean);
        }
        int i4 = 0;
        for (GameListAndCollectionInfo gameListAndCollectionInfo : list2) {
            if (i4 >= 8) {
                break;
            }
            PaPaBean paPaBean2 = new PaPaBean();
            CollectionInfo collection_info = gameListAndCollectionInfo.getCollection_info();
            paPaBean2.setType(PaPaBean.PaPaBeanTypes.TYPE_TITLE_COLLECTION.value());
            paPaBean2.setTypeValue(collection_info);
            arrayList.add(paPaBean2);
            PaPaBean paPaBean3 = new PaPaBean();
            List<AppBean> game_list = gameListAndCollectionInfo.getGame_list();
            paPaBean3.setType(PaPaBean.PaPaBeanTypes.TYPE_CONTENT_COLLECTION.value());
            paPaBean3.setTypeValue(game_list);
            arrayList.add(paPaBean3);
            i4++;
        }
        return arrayList;
    }

    List<PaPaBean> C0(GameFactoryListBean gameFactoryListBean) {
        ArrayList arrayList = new ArrayList();
        String head_ad_pic = gameFactoryListBean.getHead_ad_pic();
        if (!TextUtils.isEmpty(head_ad_pic) && this.f52510c == 1) {
            ArrayList arrayList2 = new ArrayList();
            GameHeadAd gameHeadAd = new GameHeadAd();
            GameHeadAd.GameMain gameMain = new GameHeadAd.GameMain();
            gameMain.setAd_switch(1);
            gameMain.setPic_remote(head_ad_pic);
            gameHeadAd.setMain(gameMain);
            arrayList2.add(gameHeadAd);
            PaPaBean paPaBean = new PaPaBean();
            paPaBean.setType(PaPaBean.PaPaBeanTypes.TYPE_IMAGE_HEADER.value());
            paPaBean.setTypeValue(arrayList2);
            HashMap hashMap = new HashMap();
            hashMap.put(PaPaBean.KEY_IMAGE_HEADER_HEIGHT, 127);
            paPaBean.setImageHeaderParams(hashMap);
            arrayList.add(paPaBean);
        }
        if (gameFactoryListBean.getLogo_info() != null && !TextUtils.isEmpty(gameFactoryListBean.getLogo_info().getIntroduce()) && this.f52510c == 1) {
            PaPaBean paPaBean2 = new PaPaBean();
            paPaBean2.setType(PaPaBean.PaPaBeanTypes.TYPE_GAMEFACTORY_LIST.value());
            GameFactoryListBean.LogoInfo logo_info = gameFactoryListBean.getLogo_info();
            logo_info.setTitle(this.f52522o);
            paPaBean2.setTypeValue(logo_info);
            arrayList.add(paPaBean2);
        }
        if (gameFactoryListBean.getGame_list() != null && gameFactoryListBean.getGame_list().size() > 0) {
            for (AppBean appBean : gameFactoryListBean.getGame_list()) {
                if (this.f52520m == 121) {
                    appBean.set_from(111);
                    appBean.set_from_type(121);
                }
                PaPaBean paPaBean3 = new PaPaBean();
                paPaBean3.setType(PaPaBean.PaPaBeanTypes.TYPE_CONTENT_GAMEINFO.value());
                paPaBean3.setTypeValue(appBean);
                arrayList.add(paPaBean3);
            }
        }
        return arrayList;
    }

    List<PaPaBean> D0(GameListAndHeadAdBean gameListAndHeadAdBean) {
        ArrayList arrayList = new ArrayList();
        if (this.f52510c <= 1) {
            PaPaBean paPaBean = new PaPaBean();
            paPaBean.setType(PaPaBean.PaPaBeanTypes.TYPE_IMAGE_HEADER.value());
            paPaBean.setTypeValue(gameListAndHeadAdBean.getHead_ad());
            arrayList.add(paPaBean);
        }
        for (AppBean appBean : gameListAndHeadAdBean.getGame_list()) {
            PaPaBean paPaBean2 = new PaPaBean();
            paPaBean2.setType(PaPaBean.PaPaBeanTypes.TYPE_CONTENT_GAMEINFO.value());
            paPaBean2.setTypeValue(appBean);
            arrayList.add(paPaBean2);
        }
        return arrayList;
    }

    List<PaPaBean> E0(List<AppBean> list) {
        ArrayList arrayList = new ArrayList();
        for (AppBean appBean : list) {
            PaPaBean paPaBean = new PaPaBean();
            paPaBean.setType(PaPaBean.PaPaBeanTypes.TYPE_CONTENT_GAMEINFO.value());
            paPaBean.setTypeValue(appBean);
            arrayList.add(paPaBean);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Z() {
        try {
            int i4 = this.f52509b;
            if (i4 != 1) {
                switch (i4) {
                    case 11:
                        i0(this.f52512e.N(d0()));
                        break;
                    case 12:
                        j0(this.f52512e.S(d0()));
                        break;
                    case 13:
                        j0(this.f52512e.g(d0()));
                        break;
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        h0(this.f52512e.w0(e0()));
                        break;
                }
            } else if ("1".equals(this.f52523p)) {
                g0(this.f52512e.M(RequestBeanUtil.getInstance(this.f52519l).getRequestGameFactoryList(Integer.parseInt(this.f52521n), this.f52510c)));
            } else {
                g0(this.f52512e.H(RequestBeanUtil.getInstance(this.f52519l).getRequestGameFactoryList(Integer.parseInt(this.f52521n), this.f52510c)));
            }
        } catch (Exception e5) {
            com.join.mgps.Util.v0.b("PaPaList", "fetchData exception:" + e5.getMessage());
            t0();
        }
    }

    int a0() {
        int i4 = this.f52509b;
        if (i4 == 14 || i4 == 15) {
            return 3;
        }
        if (i4 == 16 || i4 == 17) {
            return 1;
        }
        return (i4 == 18 || i4 == 19) ? 2 : 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f52512e = com.join.mgps.rpc.impl.d.P1();
        k0();
        PaPaListItemDownloadAdapter paPaListItemDownloadAdapter = new PaPaListItemDownloadAdapter(this.f52519l, this.f52515h, this.f52530w);
        this.f52514g = paPaListItemDownloadAdapter;
        paPaListItemDownloadAdapter.c(this.f52529v);
        this.f52518k.j(true);
        this.f52513f.setPreLoadCount(10);
        this.f52513f.setAdapter((ListAdapter) this.f52514g);
        this.f52513f.setPullLoadEnable(new a());
        this.f52513f.setPullRefreshEnable(new b());
        this.f52513f.setOnItemClickListener(new c());
        this.f52513f.setOnScrollListener(this);
        b0();
    }

    int c0() {
        int i4 = this.f52509b;
        return (i4 == 14 || i4 == 16 || i4 == 18) ? 1 : 2;
    }

    void f0(AppBean appBean) {
        IntentUtil.getInstance().intentActivity(this.f52519l, appBean.getIntentDataBean());
    }

    void g0(ResultMainBean<GameFactoryListBean> resultMainBean) {
        if (isActivityFinish()) {
            return;
        }
        if (resultMainBean != null && resultMainBean.getMessages() != null && resultMainBean.getMessages().getData() != null) {
            if (resultMainBean.getFlag() == 0) {
                v0();
                return;
            }
            GameFactoryListBean data = resultMainBean.getMessages().getData();
            if (data.getGame_list() != null && data.getGame_list().size() >= 20) {
                this.f52511d = true;
            } else {
                this.f52511d = false;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C0(data));
            A0(arrayList);
            hideLoading();
            return;
        }
        t0();
    }

    void h0(ResultMainBean<List<AppBean>> resultMainBean) {
        if (isActivityFinish()) {
            return;
        }
        if (resultMainBean != null && resultMainBean.getMessages() != null && resultMainBean.getMessages().getData() != null) {
            if (resultMainBean.getFlag() == 0) {
                v0();
                return;
            }
            List<AppBean> data = resultMainBean.getMessages().getData();
            ArrayList arrayList = new ArrayList();
            boolean z4 = data != null && data.size() > 0;
            if (z4) {
                this.f52511d = data.size() >= 20;
            } else {
                this.f52511d = false;
            }
            if (z4) {
                arrayList.addAll(E0(data));
            }
            A0(arrayList);
            if (this.f52510c <= 1) {
                hideLoading();
                return;
            }
            return;
        }
        t0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void hideLoading() {
        this.f52518k.setVisibility(0);
        this.f52517j.setVisibility(8);
        this.f52516i.setVisibility(8);
    }

    void i0(ResultMainBean<GameListAndHeadAdAndCollectionInfoBean> resultMainBean) {
        if (isActivityFinish()) {
            return;
        }
        if (resultMainBean != null && resultMainBean.getMessages() != null && resultMainBean.getMessages().getData() != null) {
            if (resultMainBean.getFlag() == 0) {
                v0();
                return;
            }
            GameListAndHeadAdAndCollectionInfoBean data = resultMainBean.getMessages().getData();
            List<GameHeadAd> head_ad = data.getHead_ad();
            List<GameListAndCollectionInfo> list = data.getList();
            ArrayList arrayList = new ArrayList();
            boolean z4 = list != null && list.size() > 0;
            if (z4) {
                this.f52511d = list.size() >= 3;
            } else {
                this.f52511d = false;
            }
            if (z4) {
                arrayList.addAll(B0(head_ad, list));
            }
            A0(arrayList);
            if (this.f52510c <= 1) {
                hideLoading();
                return;
            }
            return;
        }
        t0();
    }

    boolean isActivityFinish() {
        Activity activity = this.f52519l;
        if (activity == null || activity.isFinishing()) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 17 && this.f52519l.isDestroyed();
    }

    void j0(ResultMainBean<GameListAndHeadAdBean> resultMainBean) {
        if (isActivityFinish()) {
            return;
        }
        if (resultMainBean != null && resultMainBean.getMessages() != null && resultMainBean.getMessages().getData() != null) {
            if (resultMainBean.getFlag() == 0) {
                v0();
                return;
            }
            GameListAndHeadAdBean data = resultMainBean.getMessages().getData();
            List<AppBean> game_list = data.getGame_list();
            ArrayList arrayList = new ArrayList();
            boolean z4 = game_list != null && game_list.size() > 0;
            if (z4) {
                this.f52511d = game_list.size() >= 20;
            } else {
                this.f52511d = false;
            }
            if (z4) {
                arrayList.addAll(D0(data));
            }
            A0(arrayList);
            if (this.f52510c <= 1) {
                hideLoading();
                return;
            }
            return;
        }
        t0();
    }

    void k0() {
        List<DownloadTask> d5 = p1.f.K().d();
        this.f52524q = d5;
        if (d5 == null || d5.size() <= 0) {
            return;
        }
        for (DownloadTask downloadTask : this.f52524q) {
            this.f52525r.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void n0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        PaPaListItemDownloadAdapter paPaListItemDownloadAdapter = this.f52514g;
        if (paPaListItemDownloadAdapter != null) {
            paPaListItemDownloadAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f52519l = (Activity) context;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.join.mgps.Util.d0.a().d(this);
        Bundle arguments = getArguments();
        int i4 = arguments.getInt("type");
        this.f52509b = i4;
        if (i4 == 1) {
            this.f52522o = arguments.getString("title");
            this.f52523p = arguments.getString("isSingle");
            this.f52521n = arguments.getString("factory_id");
            String string = arguments.getString("_from");
            if (g2.i(string)) {
                this.f52520m = Integer.parseInt(string);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f52519l = null;
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        Map<String, DownloadTask> map;
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            z0(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    z0(a5, 6);
                    return;
                } else if (c5 == 7) {
                    z0(a5, 3);
                    return;
                } else if (c5 == 8) {
                    if (isHidden() || (map = this.f52525r) == null || map.isEmpty() || this.f52528u) {
                        return;
                    }
                    y0();
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            z0(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            z0(a5, 8);
                            return;
                        case 13:
                            z0(a5, 9);
                            return;
                        default:
                            return;
                    }
                }
            }
            z0(a5, 5);
        } else {
            z0(a5, 2);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f52526s = (i5 + i4) - 1;
        this.f52527t = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        this.f52528u = i4 != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s0() {
        this.f52513f.u();
        this.f52513f.v();
        this.f52518k.setVisibility(8);
        this.f52517j.setVisibility(8);
        this.f52516i.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f52519l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        if (isActivityFinish()) {
            return;
        }
        l2.a(this.f52519l).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0() {
        if (this.f52510c <= 1) {
            s0();
        }
        XListView2 xListView2 = this.f52513f;
        if (xListView2 != null) {
            xListView2.u();
            this.f52513f.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0() {
        this.f52518k.setVisibility(8);
        this.f52517j.setVisibility(0);
        this.f52516i.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v0() {
        this.f52511d = false;
        if (this.f52510c <= 1) {
            this.f52518k.setVisibility(8);
            this.f52517j.setVisibility(8);
            this.f52516i.setVisibility(8);
        }
        this.f52513f.v();
        this.f52513f.setNoMore();
    }

    void z0(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    q0(downloadTask);
                    return;
                case 3:
                    o0(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    r0(downloadTask);
                    return;
                case 6:
                    p0(downloadTask);
                    return;
            }
        }
    }
}
