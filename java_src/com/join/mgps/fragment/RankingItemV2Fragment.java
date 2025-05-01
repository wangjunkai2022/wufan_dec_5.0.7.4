package com.join.mgps.fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.findgame.data.IntentClassfyEvent;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.MGMainActivity;
import com.join.mgps.adapter.w4;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.PAPAHomeBeanV7;
import com.join.mgps.dto.RecomDatabean;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.fragment_rank_item)
/* loaded from: classes.dex */
public class RankingItemV2Fragment extends BaseFragment implements AbsListView.OnScrollListener {
    private RecomDatabean B;
    private int C;
    View F;
    SimpleDraweeView G;

    /* renamed from: b  reason: collision with root package name */
    private Context f52689b;

    /* renamed from: d  reason: collision with root package name */
    private w4 f52691d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    RelativeLayout f52692e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    XListView2 f52693f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    PtrClassicFrameLayout f52694g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f52695h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f52696i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f52697j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ImageView f52698k;

    /* renamed from: l  reason: collision with root package name */
    com.join.mgps.rpc.e f52699l;

    /* renamed from: n  reason: collision with root package name */
    List<DownloadTask> f52701n;

    /* renamed from: w  reason: collision with root package name */
    private boolean f52710w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f52711x;

    /* renamed from: y  reason: collision with root package name */
    List<PAPAHomeBeanV7.HomeBeanDTO> f52712y;

    /* renamed from: c  reason: collision with root package name */
    private List<PAPAHomeBeanV7.HomeBeanDTO> f52690c = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private int f52700m = 1;

    /* renamed from: o  reason: collision with root package name */
    private int f52702o = 0;

    /* renamed from: p  reason: collision with root package name */
    private int f52703p = 0;

    /* renamed from: q  reason: collision with root package name */
    private Map<String, DownloadTask> f52704q = new ConcurrentHashMap();

    /* renamed from: r  reason: collision with root package name */
    private int f52705r = 1;

    /* renamed from: s  reason: collision with root package name */
    private String f52706s = "";

    /* renamed from: t  reason: collision with root package name */
    private int f52707t = 0;

    /* renamed from: u  reason: collision with root package name */
    private String f52708u = "";

    /* renamed from: v  reason: collision with root package name */
    private boolean f52709v = false;

    /* renamed from: z  reason: collision with root package name */
    String f52713z = "";
    String A = "";
    final AtomicInteger D = new AtomicInteger(0);
    List<String> E = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements w4.a {
        a() {
        }

        @Override // com.join.mgps.adapter.w4.a
        public void a(int i4, PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
            RankingItemV2Fragment.this.b0(homeBeanDTO.getG_info().getId(), homeBeanDTO);
            if (RankingItemV2Fragment.this.f52689b instanceof MGMainActivity) {
                ((MGMainActivity) RankingItemV2Fragment.this.f52689b).setPapaMainFragmentLastPosition(homeBeanDTO.getPosition());
            }
        }
    }

    private void Z(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        DownloadTask downloadTask = homeBeanDTO.getDownloadTask();
        CollectionBeanSub gameBean = homeBeanDTO.getGameBean();
        String plugin_num = gameBean.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(4);
            intentDateBean.setLink_type_val(gameBean.getDown_url_remote());
            if (downloadTask == null) {
                downloadTask = gameBean.getDownloadtaskDown();
            }
            UtilsMy.T2(downloadTask, this.f52689b);
            IntentUtil.getInstance().intentActivity(this.f52689b, intentDateBean);
        } else if (downloadTask == null) {
            if (UtilsMy.o0(gameBean.getTag_info())) {
                if (gameBean.getMod_info() == null) {
                    if (com.join.android.app.common.utils.e.l0(this.f52689b).d(this.f52689b, gameBean.getPackageName())) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f52689b).l(this.f52689b, gameBean.getPackageName());
                        if (!g2.i(gameBean.getVer()) || l4.d() >= Integer.parseInt(gameBean.getVer())) {
                            com.join.android.app.common.utils.e.l0(this.f52689b);
                            APKUtils.a0(this.f52689b, gameBean.getPackageName());
                            return;
                        }
                    }
                } else {
                    boolean d5 = com.join.android.app.common.utils.e.l0(this.f52689b).d(this.f52689b, gameBean.getPackageName());
                    boolean F = com.join.mgps.va.overmind.d.o().F(gameBean.getPackageName());
                    if (d5 || F) {
                        com.join.android.app.common.utils.e.l0(this.f52689b);
                        APKUtils.V(this.f52689b, gameBean.getMod_info());
                        return;
                    }
                }
            }
            if (UtilsMy.y0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id()) > 0) {
                UtilsMy.d4(this.f52689b, gameBean.getCrc_sign_id());
            } else {
                UtilsMy.Y0(this.f52689b, gameBean);
            }
        } else {
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            if (UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status != 13) {
                    if (status != 2) {
                        if (status != 3) {
                            if (status == 5) {
                                UtilsMy.T3(this.f52689b, downloadTask);
                                return;
                            } else if (status != 6) {
                                if (status != 7) {
                                    if (status == 42) {
                                        if (!com.join.android.app.common.utils.j.j(this.f52689b)) {
                                            l2.a(this.f52689b).b("无网络连接");
                                            return;
                                        } else {
                                            UtilsMy.r4(this.f52689b, downloadTask);
                                            return;
                                        }
                                    } else if (status != 43) {
                                        switch (status) {
                                            case 9:
                                                if (!com.join.android.app.common.utils.j.j(this.f52689b)) {
                                                    l2.a(this.f52689b).b("无网络连接");
                                                    return;
                                                } else {
                                                    UtilsMy.I2(this.f52689b, downloadTask);
                                                    return;
                                                }
                                            case 10:
                                                break;
                                            case 11:
                                                UtilsMy.a4(downloadTask, this.f52689b);
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                        }
                        com.php25.PDownload.d.c(downloadTask, this.f52689b);
                        return;
                    }
                    com.php25.PDownload.d.i(downloadTask);
                    return;
                }
                com.php25.PDownload.d.l(this.f52689b, downloadTask);
                return;
            }
            if (UtilsMy.y0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id()) > 0) {
                UtilsMy.d4(this.f52689b, gameBean.getCrc_sign_id());
                return;
            }
            UtilsMy.y1(downloadTask, gameBean);
            if (UtilsMy.o1(this.f52689b, downloadTask)) {
                return;
            }
            if (gameBean.getDown_status() == 5) {
                UtilsMy.l1(this.f52689b, downloadTask);
            } else {
                UtilsMy.R0(this.f52689b, downloadTask, gameBean.getTp_down_url(), gameBean.getOther_down_switch(), gameBean.getCdn_down_switch());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0(AdapterView adapterView, View view, int i4, long j4) {
        PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO = this.f52690c.get(i4);
        if (homeBeanDTO != null) {
            IntentUtil.getInstance().intentActivity(this.f52689b, homeBeanDTO.getIntentDataBean());
        }
    }

    public static Fragment h0(String str, String str2) {
        RankingItemV2Fragment_ rankingItemV2Fragment_ = new RankingItemV2Fragment_();
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        bundle.putString("title", str2);
        rankingItemV2Fragment_.setArguments(bundle);
        return rankingItemV2Fragment_;
    }

    public static Fragment i0(boolean z4, String str, String str2, List<PAPAHomeBeanV7.HomeBeanDTO> list) {
        RankingItemV2Fragment_ rankingItemV2Fragment_ = new RankingItemV2Fragment_();
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        bundle.putBoolean("fromHome", z4);
        bundle.putString("title", str2);
        bundle.putSerializable("datas", (Serializable) list);
        rankingItemV2Fragment_.setArguments(bundle);
        return rankingItemV2Fragment_;
    }

    public static Fragment j0(boolean z4, String str, List<PAPAHomeBeanV7.HomeBeanDTO> list, int i4) {
        RankingItemV2Fragment_ rankingItemV2Fragment_ = new RankingItemV2Fragment_();
        Bundle bundle = new Bundle();
        bundle.putBoolean("fromHome", z4);
        bundle.putString("title", str);
        bundle.putSerializable("datas", (Serializable) list);
        bundle.putInt("from", i4);
        rankingItemV2Fragment_.setArguments(bundle);
        return rankingItemV2Fragment_;
    }

    private void m0(DownloadTask downloadTask) {
        for (PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO : this.f52690c) {
            if (homeBeanDTO.getG_info() != null && (TextUtils.equals(homeBeanDTO.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(homeBeanDTO.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                homeBeanDTO.setDownloadTask(null);
            }
        }
        this.f52691d.notifyDataSetChanged();
    }

    private void n0(DownloadTask downloadTask) {
        for (PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO : this.f52690c) {
            if (homeBeanDTO.getG_info() != null && (TextUtils.equals(homeBeanDTO.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(homeBeanDTO.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                homeBeanDTO.setDownloadTask(downloadTask);
            }
        }
        this.f52691d.notifyDataSetChanged();
    }

    private void o0(DownloadTask downloadTask) {
        for (PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO : this.f52690c) {
            if (homeBeanDTO.getG_info() != null && (TextUtils.equals(homeBeanDTO.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(homeBeanDTO.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                homeBeanDTO.setDownloadTask(downloadTask);
            }
        }
        this.f52691d.notifyDataSetChanged();
    }

    private void p0(DownloadTask downloadTask) {
        for (PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO : this.f52690c) {
            if (homeBeanDTO.getG_info() != null && (TextUtils.equals(homeBeanDTO.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(homeBeanDTO.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                homeBeanDTO.setDownloadTask(downloadTask);
            }
        }
        this.f52691d.notifyDataSetChanged();
    }

    private void u0(List<CollectionBeanSubBusiness> list) {
        List<DownloadTask> list2;
        if (list == null || list.size() == 0 || (list2 = this.f52701n) == null || list2.size() == 0) {
            return;
        }
        for (CollectionBeanSubBusiness collectionBeanSubBusiness : list) {
            Iterator<DownloadTask> it2 = this.f52701n.iterator();
            while (true) {
                if (it2.hasNext()) {
                    DownloadTask next = it2.next();
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                        DownloadTask downloadTask = this.f52704q.get(mod_info.getMain_game_id());
                        boolean z4 = true;
                        boolean z5 = downloadTask != null && downloadTask.getStatus() == 5;
                        DownloadTask downloadTask2 = this.f52704q.get(mod_info.getMod_game_id());
                        z4 = (downloadTask2 == null || downloadTask2.getStatus() != 5) ? false : false;
                        if (z4 && z5) {
                            if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                                collectionBeanSubBusiness.setDownloadTask(next);
                            }
                        } else if (z4) {
                            if (collectionBeanSubBusiness.getMod_info() != null && next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getMod_info().getMod_game_id())) {
                                collectionBeanSubBusiness.setDownloadTask(next);
                            }
                        } else if (z5) {
                            if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                                collectionBeanSubBusiness.setDownloadTask(next);
                            }
                        } else {
                            DownloadTask F = collectionBeanSubBusiness.getMod_info() != null ? p1.f.K().F(collectionBeanSubBusiness.getMod_info().getMod_game_id()) : null;
                            if (F == null) {
                                F = p1.f.K().F(collectionBeanSubBusiness.getCrc_sign_id());
                            }
                            if (F != null && next.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                                collectionBeanSubBusiness.setDownloadTask(next);
                            }
                        }
                    } else if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getGame_id())) {
                        collectionBeanSubBusiness.setDownloadTask(next);
                        break;
                    }
                }
            }
        }
    }

    private void v0() {
        if (this.f52703p < 0 || this.f52702o >= this.f52693f.getCount()) {
            return;
        }
        for (int i4 = this.f52703p; i4 <= this.f52693f.getCount() - 1; i4++) {
            PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO = (PAPAHomeBeanV7.HomeBeanDTO) this.f52693f.getItemAtPosition(i4);
            if (homeBeanDTO != null) {
                x0();
                DownloadTask downloadTask = homeBeanDTO.getDownloadTask();
                if (downloadTask != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                    View childAt = this.f52693f.getChildAt(i4 - this.f52703p);
                    if (childAt.getTag() instanceof w4.b) {
                        w4.b bVar = (w4.b) childAt.getTag();
                        try {
                            DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                            if (f5 == null) {
                                return;
                            }
                            long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                            if (downloadTask.getSize() == 0) {
                                TextView textView = bVar.f45977f;
                                textView.setText(UtilsMy.g(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(parseDouble));
                            } else {
                                TextView textView2 = bVar.f45977f;
                                textView2.setText(UtilsMy.g(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(parseDouble));
                            }
                            if (downloadTask.getStatus() == 12) {
                                bVar.f45979h.setProgress((int) f5.getProgress());
                            } else {
                                bVar.f45980i.setProgress((int) f5.getProgress());
                            }
                            if (downloadTask.getStatus() == 2) {
                                TextView textView3 = bVar.f45978g;
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
    }

    private void x0() {
        List<PAPAHomeBeanV7.HomeBeanDTO> list = this.f52712y;
        if (list == null || list.size() <= 0) {
            return;
        }
        List<DownloadTask> d5 = p1.f.K().d();
        for (PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO : this.f52712y) {
            Iterator<DownloadTask> it2 = d5.iterator();
            while (true) {
                if (it2.hasNext()) {
                    DownloadTask next = it2.next();
                    if (TextUtils.equals(next.getCrc_link_type_val(), homeBeanDTO.getG_info().getMod_id())) {
                        homeBeanDTO.setDownloadTask(next);
                        break;
                    } else if (TextUtils.equals(next.getCrc_link_type_val(), homeBeanDTO.getG_info().getId())) {
                        homeBeanDTO.setDownloadTask(next);
                    }
                }
            }
        }
        this.f52691d.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 400)
    public void X() {
        if (this.f52710w || !isVisible()) {
            return;
        }
        c0(this.f52706s, this.f52708u);
        X();
        this.f52710w = true;
    }

    public CommonRequestBean a0(String str, String str2, String str3) {
        return RequestBeanUtil.getInstance(this.f52689b).getGameListRequestBean(this.f52700m, 10, str, str2, this.f52705r, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        d0();
        com.join.mgps.Util.d0.a().d(this);
        this.f52695h.setBackgroundResource(R.color.activity_default_background);
        this.f52689b = getActivity();
        w4 w4Var = new w4(this.f52689b, this.f52713z);
        this.f52691d = w4Var;
        if (this.f52711x) {
            w4Var.d();
        }
        this.f52691d.e(new a());
        this.f52690c = this.f52691d.b();
        this.f52693f.setAdapter((ListAdapter) this.f52691d);
        showLoding();
        if (this.f52712y != null) {
            showMain(new ArrayList(this.f52712y));
        }
        this.f52693f.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.join.mgps.fragment.d1
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
                RankingItemV2Fragment.this.f0(adapterView, view, i4, j4);
            }
        });
        List<DownloadTask> d5 = p1.f.K().d();
        for (PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO : this.f52712y) {
            Iterator<DownloadTask> it2 = d5.iterator();
            while (true) {
                if (it2.hasNext()) {
                    DownloadTask next = it2.next();
                    if (TextUtils.equals(next.getCrc_link_type_val(), homeBeanDTO.getG_info().getMod_id())) {
                        homeBeanDTO.setDownloadTask(next);
                        break;
                    } else if (TextUtils.equals(next.getCrc_link_type_val(), homeBeanDTO.getG_info().getId())) {
                        homeBeanDTO.setDownloadTask(next);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void b0(String str, PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        CollectionBeanSub data;
        if (homeBeanDTO.getGameBean() != null) {
            Z(homeBeanDTO);
            return;
        }
        if (com.join.android.app.common.utils.j.j(this.f52689b)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f52689b).getAccountData();
                if (accountData == null) {
                    accountData = com.wufan.user.service.protobuf.n0.b5();
                }
                RequestModel requestModel = new RequestModel();
                requestModel.setDefault(this.f52689b);
                requestModel.setArgs(new RequestGameIdArgs(str, 1, accountData.getUid()));
                ResponseModel<CollectionBeanSub> body = com.join.mgps.rpc.impl.i.D0().B0().v1(requestModel.makeSign()).execute().body();
                if (body != null && body.getCode() == 200 && (data = body.getData()) != null) {
                    data.set_from(homeBeanDTO.get_from());
                    data.set_from_type(homeBeanDTO.get_from_type());
                    homeBeanDTO.setGameBean(data);
                    Z(homeBeanDTO);
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                showToast("获取下载信息失败");
            }
        } else {
            showToast("当前网络不可用");
        }
        q0(homeBeanDTO);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void c0(String str, String str2) {
    }

    void d0() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.f52713z = arguments.getString("type");
        this.f52711x = arguments.getBoolean("fromHome");
        this.A = arguments.getString("title");
        this.f52712y = (List) arguments.getSerializable("datas");
        this.C = arguments.getInt("from");
        this.f52706s = this.f52713z;
    }

    void e0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        this.f52700m = 1;
        c0(this.f52706s, this.f52708u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k0() {
        if (this.f52705r != 1001) {
            getActivity().finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void l0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        w4 w4Var = this.f52691d;
        if (w4Var != null) {
            w4Var.notifyDataSetChanged();
        }
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
        X();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            w0(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    w0(a5, 6);
                    return;
                } else if (c5 == 7) {
                    w0(a5, 3);
                    return;
                } else if (c5 == 8) {
                    v0();
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            w0(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            w0(a5, 8);
                            return;
                        case 13:
                            w0(a5, 9);
                            return;
                        default:
                            return;
                    }
                }
            }
            w0(a5, 5);
        } else {
            w0(a5, 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        w4 w4Var;
        super.onHiddenChanged(z4);
        if (z4 || (w4Var = this.f52691d) == null) {
            return;
        }
        w4Var.notifyDataSetChanged();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f52702o = (i5 + i4) - 1;
        this.f52703p = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.fragment.BaseFragment
    public void onVisible() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        homeBeanDTO.setRequesting(false);
        this.f52691d.notifyDataSetChanged();
    }

    public void r0(List<PAPAHomeBeanV7.HomeBeanDTO> list) {
        if (list == null) {
            return;
        }
        this.f52712y = list;
        showMain(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f52700m = 1;
        showLoding();
        c0(this.f52706s, this.f52708u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void s0() {
        com.join.mgps.Util.d0.a().c(new IntentClassfyEvent(0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f52689b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        LinearLayout linearLayout = this.f52695h;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f52696i;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f52694g;
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f52697j;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain(List<PAPAHomeBeanV7.HomeBeanDTO> list) {
        try {
            LinearLayout linearLayout = this.f52696i;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.f52695h;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            PtrClassicFrameLayout ptrClassicFrameLayout = this.f52694g;
            if (ptrClassicFrameLayout != null) {
                ptrClassicFrameLayout.setVisibility(0);
            }
            LinearLayout linearLayout3 = this.f52697j;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            XListView2 xListView2 = this.f52693f;
            if (xListView2 != null) {
                xListView2.u();
                this.f52693f.v();
            }
            if (this.f52700m == 1) {
                this.f52690c.clear();
            }
            this.f52690c.addAll(list);
            if (this.f52693f != null) {
                this.f52691d.notifyDataSetChanged();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        if (g2.i(str)) {
            l2.a(this.f52689b).b(str);
        } else {
            l2.a(this.f52689b).b("数据异常，请重试");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0(boolean z4) {
        XListView2 xListView2 = this.f52693f;
        if (xListView2 != null) {
            xListView2.u();
            this.f52693f.v();
        }
        if (!z4) {
            if (this.f52700m == 1 && this.f52690c.size() == 0) {
                LinearLayout linearLayout = this.f52696i;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                LinearLayout linearLayout2 = this.f52695h;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                PtrClassicFrameLayout ptrClassicFrameLayout = this.f52694g;
                if (ptrClassicFrameLayout != null) {
                    ptrClassicFrameLayout.setVisibility(8);
                }
                LinearLayout linearLayout3 = this.f52697j;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                    return;
                }
                return;
            }
            try {
                l2.a(this.f52689b).b(getString(R.string.net_connect_failed));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } else if (z4 && this.f52700m == 1 && this.f52690c.size() == 0) {
            LinearLayout linearLayout4 = this.f52696i;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
            LinearLayout linearLayout5 = this.f52695h;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
            }
            PtrClassicFrameLayout ptrClassicFrameLayout2 = this.f52694g;
            if (ptrClassicFrameLayout2 != null) {
                ptrClassicFrameLayout2.setVisibility(8);
            }
            LinearLayout linearLayout6 = this.f52697j;
            if (linearLayout6 != null) {
                linearLayout6.setVisibility(0);
            }
        }
    }

    void w0(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
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
                default:
                    return;
                case 5:
                    p0(downloadTask);
                    return;
                case 6:
                    n0(downloadTask);
                    return;
            }
        }
    }
}
