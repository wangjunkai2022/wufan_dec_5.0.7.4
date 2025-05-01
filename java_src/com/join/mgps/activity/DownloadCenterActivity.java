package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.BaseActivity;
import com.MApplication;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.NavigationAdapter;
import com.join.mgps.customview.SlidingTabLayoutDownloadCenter;
import com.join.mgps.db.tables.DownloadHistoryTable;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.DownloadCenterBean;
import com.join.mgps.dto.RecomDatabean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.enums.Dtype;
import com.join.mgps.fragment.DownloadCenterFragment;
import com.join.mgps.pref.PrefDef_;
import com.umeng.analytics.MobclickAgent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.download_center_layout)
/* loaded from: classes.dex */
public class DownloadCenterActivity extends BaseActivity implements AbsListView.OnScrollListener {
    IntentDateBean A;

    /* renamed from: c  reason: collision with root package name */
    private Context f29971c;

    /* renamed from: d  reason: collision with root package name */
    DownloadCenterBean f29972d;
    @Pref

    /* renamed from: e  reason: collision with root package name */
    PrefDef_ f29973e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f29974f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ImageView f29975g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f29976h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f29977i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f29978j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f29979k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f29980l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f29981m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    ViewPager f29982n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    SlidingTabLayoutDownloadCenter f29983o;

    /* renamed from: p  reason: collision with root package name */
    private NavigationAdapter f29984p;

    /* renamed from: s  reason: collision with root package name */
    com.join.mgps.adapter.m f29987s;

    /* renamed from: t  reason: collision with root package name */
    public List<DownloadTask> f29988t;

    /* renamed from: u  reason: collision with root package name */
    public List<DownloadTask> f29989u;

    /* renamed from: v  reason: collision with root package name */
    public List<DownloadTask> f29990v;

    /* renamed from: w  reason: collision with root package name */
    public List<DownloadTask> f29991w;

    /* renamed from: y  reason: collision with root package name */
    com.join.mgps.rpc.e f29993y;

    /* renamed from: b  reason: collision with root package name */
    private final String f29970b = "DownloadCenterActivity";

    /* renamed from: q  reason: collision with root package name */
    private ArrayList<Fragment> f29985q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    private List<String> f29986r = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    public boolean f29992x = false;

    /* renamed from: z  reason: collision with root package name */
    String[] f29994z = {"进行中", "需更新", "下载记录"};
    private int B = 0;
    private int C = 0;

    private void h0(DownloadTask downloadTask) {
        if (this.f29987s == null || TextUtils.isEmpty(downloadTask.getFileType()) || !downloadTask.getFileType().equals(Dtype.chajian.name())) {
            return;
        }
        this.f29987s.h(downloadTask.getPlugin_num());
    }

    private void resume() {
        try {
            k0();
            updateAndroidApp();
            o0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void updateProgressPartly() {
        long parseLong;
        long j4;
        long parseLong2;
        long j5 = 0;
        try {
            for (DownloadTask downloadTask : this.f29988t) {
                DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                if (f5 != null) {
                    String speed = f5.getSpeed();
                    if (speed.endsWith("M")) {
                        j4 = 1048576;
                        parseLong2 = Long.parseLong(speed.replace("M", ""));
                        Long.signum(parseLong2);
                    } else if (speed.endsWith("KB")) {
                        j4 = 1024;
                        parseLong2 = Long.parseLong(speed.replace("KB", ""));
                    } else {
                        parseLong = Long.parseLong(speed.replace("B", ""));
                        j5 += parseLong;
                    }
                    parseLong = parseLong2 * j4;
                    j5 += parseLong;
                }
            }
            TextView textView = this.f29981m;
            textView.setText(UtilsMy.c(j5) + "/S");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f29977i.setVisibility(8);
        this.f29976h.setVisibility(8);
        this.f29993y = com.join.mgps.rpc.impl.d.P1();
        this.f29971c = this;
        com.join.mgps.adapter.m mVar = new com.join.mgps.adapter.m(this);
        this.f29987s = mVar;
        DownloadCenterBean f5 = mVar.f();
        this.f29972d = f5;
        this.f29988t = f5.getDownloadFiles();
        this.f29989u = this.f29972d.getStayInstalledDownloadTasks();
        this.f29990v = this.f29972d.getHistoryDownloadFiles();
        this.f29991w = this.f29972d.getDownloadUpdateFiles();
        IntentDateBean intentDateBean = new IntentDateBean();
        this.A = intentDateBean;
        intentDateBean.setLink_type(4);
        IntentDateBean intentDateBean2 = this.A;
        intentDateBean2.setLink_type_val(com.join.mgps.rpc.h.f54056j + "/member/vip_view/welcome?go=vip");
        j0();
        getData();
        com.join.mgps.Util.d0.a().d(this);
        MobclickAgent.onEvent(this, "enterdc4.2.0.6");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0() {
        boolean z4;
        if ((((this.f29988t.size() + this.f29989u.size()) + this.f29990v.size()) + this.f29991w.size() == 0 ? (char) 0 : '\b') == 0) {
            this.f29977i.setVisibility(8);
            this.f29976h.setVisibility(8);
        }
        if (this.f29988t.size() > 0) {
            Iterator<DownloadTask> it2 = this.f29988t.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z4 = false;
                    break;
                }
                if (!UtilsMy.s0(this.f29971c, it2.next())) {
                    z4 = true;
                    break;
                }
            }
            if (z4) {
                if (UtilsMy.r0(this.f29971c, null)) {
                    this.f29977i.setVisibility(0);
                    this.f29976h.setVisibility(8);
                    if (com.join.mgps.Util.b.piv(AccountUtil_.getInstance_(this.f29971c).getAccountData())) {
                        return;
                    }
                    this.f29977i.setVisibility(8);
                    return;
                }
                this.f29977i.setVisibility(8);
                return;
            } else if (UtilsMy.r0(this.f29971c, null)) {
                this.f29977i.setVisibility(0);
                this.f29976h.setVisibility(8);
                if (com.join.mgps.Util.b.piv(AccountUtil_.getInstance_(this.f29971c).getAccountData())) {
                    return;
                }
                this.f29977i.setVisibility(8);
                return;
            } else {
                this.f29977i.setVisibility(8);
                this.f29976h.setVisibility(8);
                return;
            }
        }
        this.f29977i.setVisibility(8);
        this.f29976h.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getData() {
        try {
            ResultMainBean<List<RecomDatabean>> y12 = this.f29993y.y1(RequestBeanUtil.getInstance(this.f29971c).getSimulatorRequest("", "", 0));
            if (y12 == null || y12.getMessages() == null || y12.getMessages().getData() == null || y12.getMessages().getData().size() <= 0) {
                return;
            }
            RecomDatabean recomDatabean = y12.getMessages().getData().get(0);
            this.A = recomDatabean.getSub().get(0).getIntentDataBean();
            v0(recomDatabean.getMain().getTitle());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        IntentUtil.getInstance().intentActivity(this.f29971c, this.A);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0() {
        this.f29974f.setText("下载管理");
        this.f29975g.setImageResource(R.drawable.setting_butn);
        this.f29975g.setVisibility(0);
        NavigationAdapter navigationAdapter = new NavigationAdapter(getSupportFragmentManager(), this.f29985q, this.f29986r);
        this.f29984p = navigationAdapter;
        this.f29982n.setAdapter(navigationAdapter);
        this.f29983o.setViewPager(this.f29982n);
        this.f29985q.add(DownloadCenterFragment.i0(0, this.f29994z[0]));
        this.f29986r.add(this.f29994z[0]);
        this.f29985q.add(DownloadCenterFragment.i0(1, this.f29994z[1]));
        this.f29986r.add(this.f29994z[1]);
        this.f29985q.add(DownloadCenterFragment.i0(2, this.f29994z[2]));
        this.f29986r.add(this.f29994z[2]);
        this.f29982n.setOffscreenPageLimit(3);
        this.f29984p.d(this.f29985q, this.f29986r);
        this.f29984p.notifyDataSetChanged();
        this.f29983o.e();
        m0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0() {
        List<PurchasedListTable> d5 = b2.e0.o().d();
        HashMap hashMap = new HashMap();
        for (PurchasedListTable purchasedListTable : d5) {
            hashMap.put(purchasedListTable.getGame_id(), purchasedListTable);
        }
        List<DownloadTask> T = p1.f.K().T();
        this.f29988t.clear();
        for (int i4 = 0; i4 < T.size(); i4++) {
            if (!l0(T.get(i4))) {
                this.f29988t.add(0, T.get(i4));
            }
        }
        List<DownloadTask> N = p1.f.K().N(true);
        for (int i5 = 0; i5 < N.size(); i5++) {
            this.f29988t.add(0, N.get(i5));
        }
        List<DownloadTask> v2 = p1.f.K().v();
        List<DownloadTask> N2 = p1.f.K().N(false);
        new ArrayList();
        N2.iterator();
        this.f29989u.clear();
        for (int i6 = 0; i6 < N2.size(); i6++) {
            if (N2.get(i6).getStatus() == 11) {
                this.f29989u.add(N2.get(i6));
            }
        }
        for (int i7 = 0; i7 < v2.size(); i7++) {
            if (!l0(v2.get(i7))) {
                this.f29989u.add(0, v2.get(i7));
            }
        }
        this.f29990v.clear();
        List<DownloadHistoryTable> o4 = b2.k.n().o();
        if (o4 != null) {
            for (DownloadHistoryTable downloadHistoryTable : o4) {
                DownloadTask F = p1.f.K().F(downloadHistoryTable.getCrc_link_type_val());
                if (F != null && (F.getStatus() == 5 || F.getStatus() == 42)) {
                    if (!l0(F)) {
                        this.f29990v.add(F);
                    }
                }
            }
        }
        List<DownloadTask> x4 = p1.f.K().x();
        this.f29991w.clear();
        if (x4 != null) {
            for (int i8 = 0; i8 < x4.size(); i8++) {
                if (!l0(x4.get(i8))) {
                    this.f29991w.add(0, x4.get(i8));
                }
            }
        }
        o0();
        g0();
        this.f29992x = true;
    }

    boolean l0(DownloadTask downloadTask) {
        return downloadTask != null && !TextUtils.isEmpty(downloadTask.getFileType()) && downloadTask.getFileType().equals(Dtype.android.name()) && UtilsMy.v0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) > 0;
    }

    public void m0() {
        n0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        List<DownloadTask> list = this.f29988t;
        int size = list != null ? list.size() + 0 : 0;
        List<DownloadTask> list2 = this.f29989u;
        if (list2 != null) {
            size += list2.size();
        }
        q0();
        List<DownloadTask> list3 = this.f29991w;
        int size2 = list3 != null ? list3.size() + 0 : 0;
        List<DownloadTask> list4 = this.f29990v;
        int size3 = list4 != null ? 0 + list4.size() : 0;
        if (size3 > 0) {
            String[] strArr = this.f29994z;
            strArr[2] = "下载记录(" + size3 + ")";
        } else {
            this.f29994z[2] = "下载记录";
        }
        this.f29984p.e(Arrays.asList(this.f29994z));
        this.f29983o.setBadgeSize(size, size2, size3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        com.join.mgps.adapter.m mVar = this.f29987s;
        if (mVar != null) {
            mVar.notifyDataSetChanged();
        }
        m0();
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        g0();
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            updateUI(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    updateUI(a5, 6);
                    return;
                } else if (c5 == 7) {
                    a5.setStatus(7);
                    updateUI(a5, 3);
                    return;
                } else if (c5 == 8) {
                    updateUI(a5, 4);
                    return;
                } else if (c5 == 27) {
                    updateUI(a5, 10);
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            if (a5 == null) {
                                return;
                            }
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

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4 && keyEvent.getRepeatCount() == 0) {
            finish();
            this.f29973e.isNewFinishedGame().g(Boolean.FALSE);
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        resume();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.C = (i5 + i4) - 1;
        this.B = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void p0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        try {
            k0();
            o0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void q0() {
        List<DownloadTask> x4 = p1.f.K().x();
        this.f29991w.clear();
        if (x4 != null) {
            for (int i4 = 0; i4 < x4.size(); i4++) {
                if (!l0(x4.get(i4))) {
                    this.f29991w.add(0, x4.get(i4));
                }
            }
        }
    }

    public void r0() {
        g0();
        updateHistory();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void s0() {
        DownloadSettingActivity_.B0(this.f29971c).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        finish();
        Intent intent = new Intent();
        intent.setClass(this.f29971c, MGMainActivity_.class);
        intent.setFlags(TTAdConstant.KEY_CLICK_AREA);
        intent.addFlags(536870912);
        Bundle bundle = new Bundle();
        bundle.putInt("MainPos", 3);
        intent.putExtras(bundle);
        startActivity(intent);
        MApplication.f1496w = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void t0() {
        this.f29973e.FirstShowMYgameTopTip().g(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void u0(Context context, String str) {
        p1.f.K().i0(str, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void updateAndroidApp() {
        APKUtils.a m4;
        try {
            for (DownloadTask downloadTask : p1.f.K().v()) {
                com.join.android.app.common.utils.e l02 = com.join.android.app.common.utils.e.l0(this);
                String packageName = downloadTask.getPackageName();
                APKUtils.DEVICE_TYPE device_type = APKUtils.DEVICE_TYPE.ALL;
                if (l02.e(this, packageName, device_type) && (m4 = com.join.android.app.common.utils.e.l0(this).m(this, downloadTask.getPackageName(), device_type)) != null && com.join.mgps.Util.g2.i(downloadTask.getVer()) && m4.d() == Integer.parseInt(downloadTask.getVer())) {
                    UtilsMy.S2(downloadTask, 5);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void updateHistory() {
        this.f29990v.clear();
        List<DownloadHistoryTable> o4 = b2.k.n().o();
        if (o4 != null) {
            for (DownloadHistoryTable downloadHistoryTable : o4) {
                DownloadTask F = p1.f.K().F(downloadHistoryTable.getCrc_link_type_val());
                if (F != null && (F.getStatus() == 5 || F.getStatus() == 42)) {
                    if (!l0(F)) {
                        this.f29990v.add(F);
                    }
                }
            }
        }
        m0();
    }

    void updateUI(DownloadTask downloadTask, int i4) {
        boolean z4;
        boolean z5;
        if (i4 == 4) {
            updateProgressPartly();
            return;
        }
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        UtilsMy.A4(this.f29988t);
        boolean z6 = true;
        if (status == 2 || status == 10 || status == 0) {
            Iterator<DownloadTask> it2 = this.f29988t.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z4 = false;
                    break;
                }
                DownloadTask next = it2.next();
                if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    next.setPath(downloadTask.getPath());
                    next.setStatus(2);
                    if (i4 == 7) {
                        next.setStatus(10);
                    }
                    z4 = true;
                }
            }
            if (!z4) {
                DownloadTask F = p1.f.K().F(downloadTask.getCrc_link_type_val());
                if (F == null) {
                    return;
                }
                F.setStatus(2);
                if (i4 == 7) {
                    F.setStatus(10);
                }
                String fileType = downloadTask.getFileType();
                Dtype dtype = Dtype.chajian;
                if (fileType.equals(dtype.name())) {
                    this.f29988t.add(0, F);
                } else if (this.f29988t.size() == 0) {
                    this.f29988t.add(F);
                } else if (this.f29988t.get(0).getFileType().equals(dtype.name())) {
                    this.f29988t.add(1, F);
                } else {
                    this.f29988t.add(0, F);
                }
                o0();
                g0();
                return;
            }
            o0();
        } else if (status == 3 || status == 6) {
            Iterator<DownloadTask> it3 = this.f29988t.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z5 = false;
                    break;
                }
                DownloadTask next2 = it3.next();
                if (next2.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    next2.setPath(downloadTask.getPath());
                    UtilsMy.x4(next2);
                    next2.setStatus(status);
                    z5 = true;
                    break;
                }
            }
            if (!z5) {
                DownloadTask F2 = p1.f.K().F(downloadTask.getCrc_link_type_val());
                if (F2 == null) {
                    return;
                }
                String fileType2 = downloadTask.getFileType();
                Dtype dtype2 = Dtype.chajian;
                if (fileType2.equals(dtype2.name())) {
                    this.f29988t.add(0, F2);
                } else if (this.f29988t.size() == 0) {
                    this.f29988t.add(F2);
                } else if (this.f29988t.get(0).getFileType().equals(dtype2.name())) {
                    this.f29988t.add(1, F2);
                } else {
                    this.f29988t.add(0, F2);
                }
            }
            o0();
        } else if (status == 12 || status == 13) {
            Iterator<DownloadTask> it4 = this.f29988t.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                DownloadTask next3 = it4.next();
                if (next3.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    UtilsMy.x4(next3);
                    next3.setStatus(status);
                    break;
                }
            }
            o0();
        } else if (status == 11) {
            Iterator<DownloadTask> it5 = this.f29988t.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                DownloadTask next4 = it5.next();
                if (next4.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    next4.setStatus(status);
                    if (next4.getFileType().equals(Dtype.chajian.name()) && next4.getDown_type() == 2) {
                        resume();
                        return;
                    }
                }
            }
            o0();
        } else if (status == 7) {
            com.join.mgps.Util.v0.c("收到删除消息");
            Iterator<DownloadTask> it6 = this.f29988t.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                } else if (it6.next().getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    it6.remove();
                    com.join.mgps.Util.v0.c("移除数据");
                    break;
                }
            }
            com.join.mgps.Util.v0.c("开始刷新数据 downloadTasks。size=" + this.f29988t.size());
            o0();
            g0();
        } else if (status == 5) {
            Iterator<DownloadTask> it7 = this.f29988t.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                DownloadTask next5 = it7.next();
                if (next5.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    next5.setGameZipPath(downloadTask.getGameZipPath());
                    next5.setStatus(5);
                    it7.remove();
                    break;
                }
            }
            Iterator<DownloadTask> it8 = this.f29990v.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    z6 = false;
                    break;
                }
                DownloadTask next6 = it8.next();
                if (next6.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    next6.setGameZipPath(downloadTask.getGameZipPath());
                    next6.setStatus(5);
                    break;
                }
            }
            if (!z6 && (downloadTask.getFileType() == null || !downloadTask.getFileType().equals(Dtype.chajian.name()))) {
                this.f29990v.add(0, downloadTask);
            }
            o0();
            g0();
            h0(downloadTask);
        } else {
            Iterator<DownloadTask> it9 = this.f29987s.f().getDownloadFiles().iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                DownloadTask next7 = it9.next();
                if (downloadTask != null) {
                    if (downloadTask.getCrc_link_type_val().equals(next7.getCrc_link_type_val())) {
                        next7.setStatus(downloadTask.getStatus());
                        o0();
                        break;
                    }
                } else {
                    return;
                }
            }
            g0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v0(String str) {
        this.f29978j.setText(str);
    }
}
