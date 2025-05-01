package com.join.mgps.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.b2;
import com.join.mgps.adapter.e;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CollectionDataBean;
import com.join.mgps.dto.CollectionMessageBean;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.helper.MGFightUtils;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
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
import org.androidannotations.annotations.res.StringRes;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.collection_rank)
/* loaded from: classes.dex */
public class CollectionModuleFourFragment extends Fragment implements AbsListView.OnScrollListener {

    /* renamed from: x  reason: collision with root package name */
    private static final String f50298x = "CollectionModuleFourFragment";
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    PtrClassicFrameLayout f50299b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    XListView2 f50300c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f50301d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f50302e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ImageView f50303f;

    /* renamed from: g  reason: collision with root package name */
    private Context f50304g;

    /* renamed from: h  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f50305h;

    /* renamed from: i  reason: collision with root package name */
    private com.join.mgps.adapter.e f50306i;

    /* renamed from: j  reason: collision with root package name */
    List<DownloadTask> f50307j;

    /* renamed from: l  reason: collision with root package name */
    com.join.mgps.rpc.e f50309l;
    @StringRes(resName = "net_excption")

    /* renamed from: m  reason: collision with root package name */
    String f50310m;
    @StringRes(resName = "connect_server_excption")

    /* renamed from: n  reason: collision with root package name */
    String f50311n;

    /* renamed from: p  reason: collision with root package name */
    private String f50313p;

    /* renamed from: q  reason: collision with root package name */
    private String f50314q;

    /* renamed from: r  reason: collision with root package name */
    private String f50315r;

    /* renamed from: s  reason: collision with root package name */
    private int f50316s;

    /* renamed from: k  reason: collision with root package name */
    private Map<String, DownloadTask> f50308k = new ConcurrentHashMap();

    /* renamed from: o  reason: collision with root package name */
    private int f50312o = 1;

    /* renamed from: t  reason: collision with root package name */
    private int f50317t = 0;

    /* renamed from: u  reason: collision with root package name */
    private CollectionDataBean f50318u = null;

    /* renamed from: v  reason: collision with root package name */
    private boolean f50319v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f50320w = false;

    /* loaded from: classes3.dex */
    class a implements com.join.mgps.customview.g {
        a() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (CollectionModuleFourFragment.this.f50320w) {
                return;
            }
            CollectionModuleFourFragment.this.f50312o = 1;
            CollectionModuleFourFragment.this.b0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements com.join.mgps.customview.f {
        b() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (CollectionModuleFourFragment.this.f50320w) {
                return;
            }
            CollectionModuleFourFragment.this.b0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements AdapterView.OnItemClickListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (i4 > CollectionModuleFourFragment.this.f50305h.size() || i4 < 0 || ((CollectionBeanSubBusiness) CollectionModuleFourFragment.this.f50305h.get(i4)).getGame_id() == null) {
                return;
            }
            IntentUtil.getInstance().intentActivity(CollectionModuleFourFragment.this.f50304g, ((CollectionBeanSub) CollectionModuleFourFragment.this.f50305h.get(i4)).getIntentDataBean());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        r1 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (r1.getMod_info() == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        r2 = r6.f50308k.get(r1.getMod_info().getMod_game_id());
        r4 = r6.f50308k.get(r1.getGame_id());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
        if (r2 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
        if (r4 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
        r1.setDownloadTask(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
        r1.setDownloadTask(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r4 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
        r1.setDownloadTask(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
        if (r1.getGame_id().equals(r7.getCrc_link_type_val()) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
        r1.setDownloadTask(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
        if (r1.getCrc_sign_id().equals(r7.getCrc_link_type_val()) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
        r1.setDownloadTask(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        r6.f50308k.remove(r1.getCrc_link_type_val());
        r0.remove();
        r0 = r6.f50305h.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r0.hasNext() == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g0(com.github.snowdream.android.app.downloader.DownloadTask r7) {
        /*
            r6 = this;
            java.util.List<com.github.snowdream.android.app.downloader.DownloadTask> r0 = r6.f50307j     // Catch: java.lang.Exception -> L99
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L99
        L6:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L99
            if (r1 == 0) goto L9d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L99
            com.github.snowdream.android.app.downloader.DownloadTask r1 = (com.github.snowdream.android.app.downloader.DownloadTask) r1     // Catch: java.lang.Exception -> L99
            java.lang.String r2 = r1.getCrc_link_type_val()     // Catch: java.lang.Exception -> L99
            java.lang.String r3 = r7.getCrc_link_type_val()     // Catch: java.lang.Exception -> L99
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L99
            if (r2 == 0) goto L6
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r2 = r6.f50308k     // Catch: java.lang.Exception -> L99
            java.lang.String r1 = r1.getCrc_link_type_val()     // Catch: java.lang.Exception -> L99
            r2.remove(r1)     // Catch: java.lang.Exception -> L99
            r0.remove()     // Catch: java.lang.Exception -> L99
            java.util.List<com.join.mgps.business.CollectionBeanSubBusiness> r0 = r6.f50305h     // Catch: java.lang.Exception -> L99
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L99
        L32:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L99
            if (r1 == 0) goto L9d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L99
            com.join.mgps.business.CollectionBeanSubBusiness r1 = (com.join.mgps.business.CollectionBeanSubBusiness) r1     // Catch: java.lang.Exception -> L99
            com.join.mgps.dto.ModInfoBean r2 = r1.getMod_info()     // Catch: java.lang.Exception -> L99
            r3 = 0
            if (r2 == 0) goto L87
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r2 = r6.f50308k     // Catch: java.lang.Exception -> L99
            com.join.mgps.dto.ModInfoBean r4 = r1.getMod_info()     // Catch: java.lang.Exception -> L99
            java.lang.String r4 = r4.getMod_game_id()     // Catch: java.lang.Exception -> L99
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Exception -> L99
            com.github.snowdream.android.app.downloader.DownloadTask r2 = (com.github.snowdream.android.app.downloader.DownloadTask) r2     // Catch: java.lang.Exception -> L99
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r6.f50308k     // Catch: java.lang.Exception -> L99
            java.lang.String r5 = r1.getGame_id()     // Catch: java.lang.Exception -> L99
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Exception -> L99
            com.github.snowdream.android.app.downloader.DownloadTask r4 = (com.github.snowdream.android.app.downloader.DownloadTask) r4     // Catch: java.lang.Exception -> L99
            if (r2 != 0) goto L69
            if (r4 != 0) goto L69
            r1.setDownloadTask(r3)     // Catch: java.lang.Exception -> L99
            goto L32
        L69:
            if (r2 == 0) goto L6f
            r1.setDownloadTask(r2)     // Catch: java.lang.Exception -> L99
            goto L32
        L6f:
            if (r4 == 0) goto L75
            r1.setDownloadTask(r4)     // Catch: java.lang.Exception -> L99
            goto L32
        L75:
            java.lang.String r2 = r1.getGame_id()     // Catch: java.lang.Exception -> L99
            java.lang.String r4 = r7.getCrc_link_type_val()     // Catch: java.lang.Exception -> L99
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Exception -> L99
            if (r2 == 0) goto L32
            r1.setDownloadTask(r3)     // Catch: java.lang.Exception -> L99
            goto L32
        L87:
            java.lang.String r2 = r1.getCrc_sign_id()     // Catch: java.lang.Exception -> L99
            java.lang.String r4 = r7.getCrc_link_type_val()     // Catch: java.lang.Exception -> L99
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Exception -> L99
            if (r2 == 0) goto L32
            r1.setDownloadTask(r3)     // Catch: java.lang.Exception -> L99
            goto L32
        L99:
            r7 = move-exception
            r7.printStackTrace()
        L9d:
            com.join.mgps.adapter.e r7 = r6.f50306i
            r7.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.CollectionModuleFourFragment.g0(com.github.snowdream.android.app.downloader.DownloadTask):void");
    }

    private void h0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f50308k;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            this.f50306i.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void i0(DownloadTask downloadTask) {
        UtilsMy.B4(this.f50307j, downloadTask);
        if (!this.f50308k.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f50307j.add(downloadTask);
            this.f50308k.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        m0(downloadTask);
        this.f50306i.notifyDataSetChanged();
    }

    private void j0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f50308k;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f50307j.add(downloadTask);
            this.f50308k.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        m0(downloadTask);
        DownloadTask downloadTask2 = this.f50308k.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        downloadTask2.setGameZipPath(downloadTask.getGameZipPath());
        this.f50306i.notifyDataSetChanged();
    }

    private void m0(DownloadTask downloadTask) {
        try {
            for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f50305h) {
                if (collectionBeanSubBusiness.getMod_info() != null) {
                    ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                    DownloadTask downloadTask2 = this.f50308k.get(mod_info.getMain_game_id());
                    boolean z4 = true;
                    boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                    DownloadTask downloadTask3 = this.f50308k.get(mod_info.getMod_game_id());
                    if (downloadTask3 == null || downloadTask3.getStatus() != 5) {
                        z4 = false;
                    }
                    if (z4 && z5) {
                        if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                        }
                    } else if (z4) {
                        if (collectionBeanSubBusiness.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getMod_info().getMod_game_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                        }
                    } else if (z5) {
                        if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                        }
                    } else {
                        DownloadTask F = collectionBeanSubBusiness.getMod_info() != null ? p1.f.K().F(collectionBeanSubBusiness.getMod_info().getMod_game_id()) : null;
                        if (F == null) {
                            F = p1.f.K().F(collectionBeanSubBusiness.getCrc_sign_id());
                        }
                        if (F != null && downloadTask.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                        }
                    }
                } else if (collectionBeanSubBusiness.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                    collectionBeanSubBusiness.setDownloadTask(downloadTask);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void o0() {
        DownloadTask downloadTask;
        for (int i4 = this.f50317t; i4 <= this.f50316s; i4++) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) this.f50300c.getItemAtPosition(i4);
            if (collectionBeanSubBusiness != null && (downloadTask = collectionBeanSubBusiness.getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                View childAt = this.f50300c.getChildAt(i4 - this.f50317t);
                if (childAt.getTag() instanceof e.b) {
                    e.b bVar = (e.b) childAt.getTag();
                    try {
                        DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                        if (f5 == null) {
                            return;
                        }
                        long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                        if (downloadTask.getSize() == 0) {
                            TextView textView = bVar.f44338j;
                            textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        } else {
                            TextView textView2 = bVar.f44338j;
                            textView2.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        }
                        if (downloadTask.getStatus() == 12) {
                            bVar.f44341m.setProgress((int) f5.getProgress());
                        } else {
                            bVar.f44340l.setProgress((int) f5.getProgress());
                        }
                        if (downloadTask.getStatus() == 2) {
                            TextView textView3 = bVar.f44339k;
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
    @Background
    public void a0(CollectionDataBean collectionDataBean) {
        if (collectionDataBean != null) {
            this.f50312o++;
            if (collectionDataBean.getInfo() != null && collectionDataBean.getInfo().size() > 0) {
                collectionDataBean.getInfo().get(0).getSub();
            } else {
                showLodingFailed();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f50309l = com.join.mgps.rpc.impl.d.P1();
        this.f50304g = getActivity();
        com.join.mgps.Util.d0.a().d(this);
        List<DownloadTask> d5 = p1.f.K().d();
        this.f50307j = d5;
        if (d5 != null && d5.size() > 0) {
            for (DownloadTask downloadTask : this.f50307j) {
                this.f50308k.put(downloadTask.getCrc_link_type_val(), downloadTask);
                com.join.mgps.Util.v0.d("infoo", this.f50307j.size() + " tasksiz     mapsize  " + downloadTask.getStatus());
                com.join.mgps.Util.v0.d("infoo", downloadTask.toString());
            }
        }
        Bundle arguments = getArguments();
        this.f50313p = arguments.getString("collection_id");
        this.f50314q = arguments.getString(b2.f27711k2);
        this.f50315r = arguments.getString(b2.f27715l2);
        com.join.mgps.adapter.e eVar = new com.join.mgps.adapter.e(this.f50304g);
        this.f50306i = eVar;
        this.f50305h = eVar.c();
        showLoding();
        CollectionDataBean collectionDataBean = this.f50318u;
        if (collectionDataBean == null) {
            this.f50312o = 1;
            b0();
        } else {
            a0(collectionDataBean);
        }
        this.f50300c.setPreLoadCount(10);
        this.f50300c.setPullRefreshEnable(new a());
        this.f50300c.setPullLoadEnable(new b());
        this.f50300c.setOnItemClickListener(new c());
        this.f50300c.setOnScrollListener(this);
        this.f50300c.setAdapter((ListAdapter) this.f50306i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void b0() {
        List<CollectionBeanSub> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        if (com.join.android.app.common.utils.j.j(this.f50304g)) {
            this.f50320w = true;
            try {
                try {
                    CollectionMessageBean messages = this.f50309l.G1(c0(this.f50313p, this.f50312o)).getMessages();
                    if (messages != null) {
                        if (messages.getData().size() > 0) {
                            CollectionDataBean collectionDataBean = messages.getData().get(0);
                            if (collectionDataBean.getInfo() != null && collectionDataBean.getInfo().size() > 0) {
                                collectionDataBean.getInfo();
                                arrayList = collectionDataBean.getInfo().get(0).getSub();
                            }
                            if (arrayList != null && arrayList.size() != 0) {
                                this.f50312o++;
                                for (CollectionBeanSub collectionBeanSub : arrayList) {
                                    collectionBeanSub.set_from(111);
                                    collectionBeanSub.set_from_type(121);
                                    arrayList2.add(new CollectionBeanSubBusiness(collectionBeanSub));
                                }
                                showMain(arrayList2);
                                n0();
                            }
                            if (this.f50312o == 1) {
                                showLodingFailed();
                            } else {
                                e0();
                            }
                            showMain(arrayList2);
                            n0();
                        } else {
                            e0();
                        }
                    } else {
                        n0();
                        showLodingFailed();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    n0();
                    showLodingFailed();
                }
                return;
            } finally {
                this.f50320w = false;
            }
        }
        n0();
        showLodingFailed();
    }

    public CommonRequestBean c0(String str, int i4) {
        return RequestBeanUtil.getInstance(this.f50304g).getCollectionRequestBean(str, i4, 10, this.f50314q, this.f50315r, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void d0() {
        this.f50312o = 1;
        b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e0() {
        this.f50300c.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void f0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        com.join.mgps.adapter.e eVar = this.f50306i;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    public void k0(CollectionDataBean collectionDataBean) {
        this.f50318u = collectionDataBean;
    }

    public void l0(String str, String str2) {
        this.f50315r = str;
        this.f50314q = str2;
        this.f50312o = 1;
        b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        this.f50300c.u();
        this.f50300c.v();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        try {
            Field declaredField = Fragment.class.getDeclaredField("mChildFragmentManager");
            declaredField.setAccessible(true);
            declaredField.set(this, null);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (NoSuchFieldException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        Map<String, DownloadTask> map;
        DownloadTask a5 = nVar.a();
        switch (nVar.c()) {
            case 2:
                p0(a5, 1);
                return;
            case 3:
                p0(a5, 2);
                return;
            case 4:
            case 9:
            default:
                return;
            case 5:
            case 11:
                p0(a5, 5);
                return;
            case 6:
                p0(a5, 6);
                return;
            case 7:
                p0(a5, 3);
                return;
            case 8:
                if (isHidden() || (map = this.f50308k) == null || map.isEmpty() || this.f50319v) {
                    return;
                }
                o0();
                return;
            case 10:
                p0(a5, 7);
                return;
            case 12:
                p0(a5, 8);
                return;
            case 13:
                p0(a5, 9);
                return;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f50316s = (i5 + i4) - 1;
        this.f50317t = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        this.f50319v = i4 != 0;
    }

    void p0(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    i0(downloadTask);
                    return;
                case 3:
                    g0(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    j0(downloadTask);
                    return;
                case 6:
                    h0(downloadTask);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f50312o = 1;
        showLoding();
        b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f50301d.setVisibility(0);
        this.f50302e.setVisibility(8);
        this.f50299b.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        List<CollectionBeanSubBusiness> list = this.f50305h;
        if (list == null || list.size() == 0) {
            this.f50302e.setVisibility(0);
            this.f50301d.setVisibility(8);
            this.f50299b.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain(List<CollectionBeanSubBusiness> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.f50302e.setVisibility(8);
        this.f50301d.setVisibility(8);
        this.f50299b.setVisibility(0);
        if (this.f50312o == 2) {
            this.f50305h.clear();
        }
        MGFightUtils.updateStatus(getContext(), list, this.f50307j, this.f50308k);
        this.f50305h.addAll(list);
        if (this.f50312o == 2) {
            this.f50305h.size();
        }
        com.join.mgps.Util.v0.d("infoo", this.f50305h.size() + "   showMain");
        this.f50306i.notifyDataSetChanged();
    }
}
