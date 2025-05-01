package com.join.mgps.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.MApplication;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.activity.DownloadCenterActivity;
import com.join.mgps.activity.DownloadSettingActivity_;
import com.join.mgps.activity.MGMainActivity_;
import com.join.mgps.adapter.m;
import com.join.mgps.adapter.n;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.db.tables.DownloadHistoryTable;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.DownloadCenterBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.RecomDatabean;
import com.join.mgps.dto.ResponseDownloadCenterAd;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import java.util.ArrayList;
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
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.fragment_download_center)
/* loaded from: classes.dex */
public class DownloadCenterFragment extends BaseFragment implements AbsListView.OnScrollListener {

    /* renamed from: c  reason: collision with root package name */
    private Context f50986c;

    /* renamed from: d  reason: collision with root package name */
    DownloadCenterBean f50987d;
    @Pref

    /* renamed from: e  reason: collision with root package name */
    PrefDef_ f50988e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ListView f50989f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f50990g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f50991h;

    /* renamed from: i  reason: collision with root package name */
    com.join.mgps.adapter.n f50992i;

    /* renamed from: j  reason: collision with root package name */
    private List<DownloadTask> f50993j;

    /* renamed from: k  reason: collision with root package name */
    private List<DownloadTask> f50994k;

    /* renamed from: l  reason: collision with root package name */
    private List<DownloadTask> f50995l;

    /* renamed from: m  reason: collision with root package name */
    private List<DownloadTask> f50996m;

    /* renamed from: n  reason: collision with root package name */
    com.join.mgps.rpc.e f50997n;

    /* renamed from: o  reason: collision with root package name */
    private String f50998o;

    /* renamed from: p  reason: collision with root package name */
    private int f50999p;

    /* renamed from: q  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f51000q;

    /* renamed from: r  reason: collision with root package name */
    private int f51001r;

    /* renamed from: t  reason: collision with root package name */
    IntentDateBean f51003t;

    /* renamed from: y  reason: collision with root package name */
    List<DownloadTask> f51008y;

    /* renamed from: b  reason: collision with root package name */
    private final String f50985b = "DownloadCenterActivity";

    /* renamed from: s  reason: collision with root package name */
    boolean f51002s = false;

    /* renamed from: u  reason: collision with root package name */
    private int f51004u = 0;

    /* renamed from: v  reason: collision with root package name */
    private int f51005v = 0;

    /* renamed from: w  reason: collision with root package name */
    List<com.join.mgps.event.n> f51006w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    boolean f51007x = true;

    /* renamed from: z  reason: collision with root package name */
    private Map<String, DownloadTask> f51009z = new ConcurrentHashMap();

    private void A0(List<CollectionBeanSubBusiness> list) {
        List<DownloadTask> list2;
        if (list == null || list.size() == 0 || (list2 = this.f51008y) == null || list2.size() == 0) {
            return;
        }
        for (CollectionBeanSubBusiness collectionBeanSubBusiness : list) {
            Iterator<DownloadTask> it2 = this.f51008y.iterator();
            while (true) {
                if (it2.hasNext()) {
                    DownloadTask next = it2.next();
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                        DownloadTask downloadTask = this.f51009z.get(mod_info.getMain_game_id());
                        boolean z4 = true;
                        boolean z5 = downloadTask != null && downloadTask.getStatus() == 5;
                        DownloadTask downloadTask2 = this.f51009z.get(mod_info.getMod_game_id());
                        z4 = (downloadTask2 == null || downloadTask2.getStatus() != 5) ? false : false;
                        if (z4 && z5) {
                            if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                                collectionBeanSubBusiness.setDownloadTask(next);
                            }
                        } else if (!z4) {
                            if (z5) {
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
                                    break;
                                }
                            }
                        } else if (collectionBeanSubBusiness.getMod_info() != null && next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getMod_info().getMod_game_id())) {
                            collectionBeanSubBusiness.setDownloadTask(next);
                        }
                    } else if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                        collectionBeanSubBusiness.setDownloadTask(next);
                        break;
                    }
                }
            }
        }
        com.join.mgps.adapter.n nVar = this.f50992i;
        if (nVar != null) {
            nVar.notifyDataSetChanged();
        }
    }

    private void Z(DownloadTask downloadTask) {
        if (this.f50992i == null || TextUtils.isEmpty(downloadTask.getFileType()) || !downloadTask.getFileType().equals(Dtype.chajian.name())) {
            return;
        }
        this.f50992i.h(downloadTask.getPlugin_num());
    }

    public static DownloadCenterFragment i0(int i4, String str) {
        DownloadCenterFragment_ downloadCenterFragment_ = new DownloadCenterFragment_();
        Bundle bundle = new Bundle();
        bundle.putInt("index", i4);
        bundle.putString("title", str);
        downloadCenterFragment_.setArguments(bundle);
        return downloadCenterFragment_;
    }

    private void p0(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.f51008y.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.f51009z.remove(next.getCrc_link_type_val());
                it2.remove();
                for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f51000q) {
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        DownloadTask downloadTask2 = this.f51009z.get(collectionBeanSubBusiness.getMod_info().getMod_game_id());
                        DownloadTask downloadTask3 = this.f51009z.get(collectionBeanSubBusiness.getGame_id());
                        if (downloadTask2 == null && downloadTask3 == null) {
                            collectionBeanSubBusiness.setDownloadTask(null);
                        } else if (downloadTask2 != null) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask2);
                        } else if (downloadTask3 != null) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask3);
                        } else if (collectionBeanSubBusiness.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                            collectionBeanSubBusiness.setDownloadTask(null);
                        }
                    } else if (collectionBeanSubBusiness.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                        collectionBeanSubBusiness.setDownloadTask(null);
                    }
                }
            }
        }
        this.f50992i.notifyDataSetChanged();
    }

    private void q0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f51009z;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            this.f50992i.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void r0(DownloadTask downloadTask) {
        UtilsMy.A4(this.f51008y);
        if (!this.f51009z.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f51008y.add(downloadTask);
            this.f51009z.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        z0(downloadTask);
        this.f50992i.notifyDataSetChanged();
    }

    private void s0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f51009z;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f51008y.add(downloadTask);
            this.f51009z.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        z0(downloadTask);
        DownloadTask downloadTask2 = this.f51009z.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        this.f50992i.notifyDataSetChanged();
    }

    private void z0(DownloadTask downloadTask) {
        try {
            for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f51000q) {
                if (collectionBeanSubBusiness.getMod_info() != null) {
                    ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                    DownloadTask downloadTask2 = this.f51009z.get(mod_info.getMain_game_id());
                    boolean z4 = true;
                    boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                    DownloadTask downloadTask3 = this.f51009z.get(mod_info.getMod_game_id());
                    if (downloadTask3 == null || downloadTask3.getStatus() != 5) {
                        z4 = false;
                    }
                    if (z4 && z5) {
                        if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    } else if (z4) {
                        if (collectionBeanSubBusiness.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getMod_info().getMod_game_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    } else if (z5) {
                        if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    } else {
                        DownloadTask F = collectionBeanSubBusiness.getMod_info() != null ? p1.f.K().F(collectionBeanSubBusiness.getMod_info().getMod_game_id()) : null;
                        if (F == null) {
                            F = p1.f.K().F(collectionBeanSubBusiness.getCrc_sign_id());
                        }
                        if (F != null && downloadTask.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    }
                } else if (collectionBeanSubBusiness.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                    collectionBeanSubBusiness.setDownloadTask(downloadTask);
                    return;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void B0(Context context, String str) {
        p1.f.K().i0(str, true);
    }

    void C0(Object obj, CollectionBeanSubBusiness collectionBeanSubBusiness) {
        DownloadTask downloadTask;
        if (obj == null || collectionBeanSubBusiness == null || (downloadTask = collectionBeanSubBusiness.getDownloadTask()) == null || !(obj instanceof n.d)) {
            return;
        }
        n.d dVar = (n.d) obj;
        try {
            DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
            if (f5 == null) {
                return;
            }
            long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
            if (downloadTask.getSize() == 0) {
                TextView textView = dVar.f44911h;
                textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
            } else {
                TextView textView2 = dVar.f44911h;
                textView2.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
            }
            if (downloadTask.getStatus() == 12) {
                dVar.f44915l.setProgress((int) f5.getProgress());
            } else {
                dVar.f44914k.setProgress((int) f5.getProgress());
            }
            if (downloadTask.getStatus() == 2) {
                TextView textView3 = dVar.f44912i;
                textView3.setText(f5.getSpeed() + "/S");
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D0() {
        try {
            m0();
            for (int i4 = this.f51004u; i4 <= this.f51005v && i4 < this.f50989f.getAdapter().getCount(); i4++) {
                if (i4 != 0 && i4 <= this.f50993j.size()) {
                    DownloadTask downloadTask = (DownloadTask) this.f50989f.getItemAtPosition(i4);
                    if (downloadTask != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                        View childAt = this.f50989f.getChildAt(i4 - this.f51004u);
                        if (childAt.getTag() instanceof m.o0) {
                            m.o0 o0Var = (m.o0) childAt.getTag();
                            try {
                                DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                                if (f5 == null) {
                                    return;
                                }
                                long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                                if (downloadTask.getSize() == 0) {
                                    TextView textView = o0Var.f44770d;
                                    textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                } else {
                                    TextView textView2 = o0Var.f44770d;
                                    textView2.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                }
                                if (downloadTask.getStatus() == 12) {
                                    o0Var.f44777k.setProgress((int) f5.getProgress());
                                } else {
                                    o0Var.f44776j.setProgress((int) f5.getProgress());
                                }
                                if (downloadTask.getStatus() == 2) {
                                    TextView textView3 = o0Var.f44771e;
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
                if (this.f50989f.getItemAtPosition(i4) instanceof CollectionBeanSubBusiness) {
                    C0(this.f50989f.getChildAt(i4 - this.f51004u).getTag(), (CollectionBeanSubBusiness) this.f50989f.getItemAtPosition(i4));
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void F0(DownloadTask downloadTask, int i4) {
        boolean z4;
        boolean z5;
        G0(downloadTask, i4);
        n0();
        if (i4 == 4) {
            D0();
            return;
        }
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        UtilsMy.A4(this.f50993j);
        boolean z6 = true;
        if (status == 2 || status == 10 || status == 0) {
            Iterator<DownloadTask> it2 = this.f50993j.iterator();
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
            k0();
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
                    this.f50993j.add(0, F);
                } else if (this.f50993j.size() == 0) {
                    this.f50993j.add(F);
                } else if (this.f50993j.get(0).getFileType().equals(dtype.name())) {
                    this.f50993j.add(1, F);
                } else {
                    this.f50993j.add(0, F);
                }
                k0();
                V();
                return;
            }
            k0();
        } else if (status == 3 || status == 6) {
            Iterator<DownloadTask> it3 = this.f50993j.iterator();
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
                    this.f50993j.add(0, F2);
                } else if (this.f50993j.size() == 0) {
                    this.f50993j.add(F2);
                } else if (this.f50993j.get(0).getFileType().equals(dtype2.name())) {
                    this.f50993j.add(1, F2);
                } else {
                    this.f50993j.add(0, F2);
                }
            }
            k0();
        } else if (status == 12 || status == 13) {
            Iterator<DownloadTask> it4 = this.f50993j.iterator();
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
            k0();
        } else if (status == 11) {
            Iterator<DownloadTask> it5 = this.f50993j.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                DownloadTask next4 = it5.next();
                if (next4.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    next4.setStatus(status);
                    if (next4.getFileType().equals(Dtype.chajian.name()) && next4.getDown_type() == 2) {
                        onResume();
                        return;
                    }
                }
            }
            k0();
        } else if (status == 7) {
            com.join.mgps.Util.v0.c("收到删除消息");
            Iterator<DownloadTask> it6 = this.f50993j.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                } else if (it6.next().getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    it6.remove();
                    com.join.mgps.Util.v0.c("移除数据");
                    break;
                }
            }
            com.join.mgps.Util.v0.c("开始刷新数据 downloadingTasks。size=" + this.f50993j.size());
            k0();
            V();
        } else if (status == 5) {
            Iterator<DownloadTask> it7 = this.f50993j.iterator();
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
            Iterator<DownloadTask> it8 = this.f50995l.iterator();
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
            Iterator<DownloadTask> it9 = this.f50994k.iterator();
            while (it9.hasNext()) {
                if (it9.next().getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val()) && downloadTask.getStatus() != 11) {
                    it9.remove();
                }
            }
            if (this.f50999p == 2 && !z6 && (downloadTask.getFileType() == null || !downloadTask.getFileType().equals(Dtype.chajian.name()))) {
                this.f50995l.add(0, downloadTask);
            }
            k0();
            V();
            Z(downloadTask);
        } else {
            Iterator<DownloadTask> it10 = this.f50994k.iterator();
            while (it10.hasNext()) {
                if (it10.next().getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val()) && downloadTask.getStatus() != 11) {
                    it10.remove();
                }
            }
            Iterator<DownloadTask> it11 = this.f50992i.f().getDownloadFiles().iterator();
            while (true) {
                if (!it11.hasNext()) {
                    break;
                }
                DownloadTask next7 = it11.next();
                if (downloadTask != null) {
                    if (downloadTask.getCrc_link_type_val().equals(next7.getCrc_link_type_val())) {
                        next7.setStatus(downloadTask.getStatus());
                        k0();
                        break;
                    }
                } else {
                    return;
                }
            }
            V();
        }
    }

    void G0(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    r0(downloadTask);
                    return;
                case 3:
                    p0(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    s0(downloadTask);
                    return;
                case 6:
                    q0(downloadTask);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void V() {
        int i4 = (((this.f50993j.size() + this.f50994k.size()) + this.f50995l.size()) + this.f50996m.size()) + this.f51000q.size() == 0 ? 0 : 8;
        LinearLayout linearLayout = this.f50990g;
        if (linearLayout != null) {
            linearLayout.setVisibility(i4);
        }
        if (this.f50993j.size() > 0) {
            for (DownloadTask downloadTask : this.f50993j) {
                if (!UtilsMy.s0(this.f50986c, downloadTask)) {
                    return;
                }
            }
        }
    }

    void W() {
        int i4;
        Iterator<com.join.mgps.event.n> it2 = this.f51006w.iterator();
        while (it2.hasNext() && (i4 = this.f51001r) != 2 && i4 != 1) {
            onEventMainThread(it2.next());
            it2.remove();
        }
    }

    boolean X(com.join.mgps.event.n nVar) {
        int i4 = this.f51001r;
        if (i4 == 2 || i4 == 1) {
            this.f51006w.add(nVar);
            return false;
        }
        return false;
    }

    public int a0() {
        List<DownloadTask> list;
        int i4 = this.f50999p;
        if (i4 == 0) {
            List<DownloadTask> list2 = this.f50993j;
            int size = list2 != null ? 0 + list2.size() : 0;
            List<DownloadTask> list3 = this.f50994k;
            return list3 != null ? size + list3.size() : size;
        }
        if (i4 == 1) {
            List<DownloadTask> list4 = this.f50996m;
            if (list4 != null) {
                return list4.size();
            }
        } else if (i4 == 2 && (list = this.f50995l) != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f50997n = com.join.mgps.rpc.impl.d.P1();
        this.f50986c = getContext();
        com.join.mgps.adapter.n nVar = new com.join.mgps.adapter.n(getActivity());
        this.f50992i = nVar;
        this.f50989f.setAdapter((ListAdapter) nVar);
        this.f50992i.i(this.f50989f);
        this.f50987d = this.f50992i.f();
        this.f51000q = this.f50992i.o();
        this.f50993j = this.f50987d.getDownloadFiles();
        this.f50994k = this.f50987d.getStayInstalledDownloadTasks();
        this.f50995l = this.f50987d.getHistoryDownloadFiles();
        this.f50996m = this.f50987d.getDownloadUpdateFiles();
        this.f50989f.setOnScrollListener(this);
        IntentDateBean intentDateBean = new IntentDateBean();
        this.f51003t = intentDateBean;
        intentDateBean.setLink_type(4);
        IntentDateBean intentDateBean2 = this.f51003t;
        intentDateBean2.setLink_type_val(com.join.mgps.rpc.h.f54056j + "/member/vip_view/welcome?go=vip");
        f0();
        com.join.mgps.Util.d0.a().d(this);
        b0();
        List<DownloadTask> d5 = p1.f.K().d();
        this.f51008y = d5;
        if (d5 != null && d5.size() > 0) {
            for (DownloadTask downloadTask : this.f51008y) {
                this.f51009z.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        this.f51002s = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void b0() {
        try {
            ResultMainBean<List<RecomDatabean>> y12 = this.f50997n.y1(RequestBeanUtil.getInstance(this.f50986c).getSimulatorRequest("", "", 0));
            if (y12 == null || y12.getMessages() == null || y12.getMessages().getData() == null || y12.getMessages().getData().size() <= 0) {
                return;
            }
            RecomDatabean recomDatabean = y12.getMessages().getData().get(0);
            this.f51003t = recomDatabean.getSub().get(0).getIntentDataBean();
            E0(recomDatabean.getMain().getTitle());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void c0() {
        ResponseDownloadCenterAd U = com.join.mgps.Util.j0.U();
        this.f51000q.clear();
        if (U == null) {
            l0();
            return;
        }
        if (U.getLists() != null) {
            this.f51000q.addAll(U.getLists());
        }
        com.join.mgps.adapter.n nVar = this.f50992i;
        if (nVar != null) {
            nVar.r(U.getTitle());
        }
        for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f51000q) {
            collectionBeanSubBusiness.set_from(104);
            collectionBeanSubBusiness.set_from_type(128);
            DownloadTask downloadTask = this.f51009z.get(collectionBeanSubBusiness.getCrc_sign_id());
            if (downloadTask == null) {
                downloadTask = p1.f.K().F(collectionBeanSubBusiness.getCrc_sign_id());
                collectionBeanSubBusiness.setDownloadTask(downloadTask);
                UtilsMy.x4(collectionBeanSubBusiness.getDownloadTask());
            } else {
                downloadTask.set_from(104);
                downloadTask.set_from_type(128);
            }
            if (downloadTask != null && collectionBeanSubBusiness.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                collectionBeanSubBusiness.setDownloadTask(downloadTask);
                downloadTask.set_from(104);
                downloadTask.set_from_type(128);
            }
        }
        k0();
        n0();
    }

    public int d0() {
        return this.f50999p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void e0() {
        IntentUtil.getInstance().intentActivity(this.f50986c, this.f51003t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f0() {
    }

    void g0() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        List<DownloadTask> T = p1.f.K().T();
        arrayList.clear();
        for (int i4 = 0; i4 < T.size(); i4++) {
            if (!h0(T.get(i4))) {
                arrayList.add(0, T.get(i4));
            }
        }
        List<DownloadTask> N = p1.f.K().N(true);
        for (int i5 = 0; i5 < N.size(); i5++) {
            arrayList.add(0, N.get(i5));
        }
        List<DownloadTask> v2 = p1.f.K().v();
        List<DownloadTask> N2 = p1.f.K().N(false);
        new ArrayList();
        N2.iterator();
        arrayList2.clear();
        for (int i6 = 0; i6 < N2.size(); i6++) {
            if (N2.get(i6).getStatus() == 11) {
                arrayList2.add(N2.get(i6));
            }
        }
        for (int i7 = 0; i7 < v2.size(); i7++) {
            if (!h0(v2.get(i7))) {
                arrayList2.add(0, v2.get(i7));
            }
        }
        arrayList3.clear();
        List<DownloadHistoryTable> o4 = b2.k.n().o();
        if (o4 != null) {
            for (DownloadHistoryTable downloadHistoryTable : o4) {
                DownloadTask F = p1.f.K().F(downloadHistoryTable.getCrc_link_type_val());
                if (F != null && (F.getStatus() == 5 || F.getStatus() == 42)) {
                    if (!h0(F)) {
                        arrayList3.add(F);
                    }
                }
            }
        }
        List<DownloadTask> x4 = p1.f.K().x();
        arrayList4.clear();
        if (x4 != null) {
            for (int i8 = 0; i8 < x4.size(); i8++) {
                if (!h0(x4.get(i8))) {
                    arrayList4.add(0, x4.get(i8));
                }
            }
        }
        j0(arrayList, arrayList2, arrayList4, arrayList3);
        V();
        this.f51007x = false;
    }

    public String getType() {
        return this.f50998o;
    }

    boolean h0(DownloadTask downloadTask) {
        return downloadTask != null && !TextUtils.isEmpty(downloadTask.getFileType()) && downloadTask.getFileType().equals(Dtype.android.name()) && UtilsMy.v0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0(List<DownloadTask> list, List<DownloadTask> list2, List<DownloadTask> list3, List<DownloadTask> list4) {
        this.f50996m.clear();
        this.f50995l.clear();
        this.f50993j.clear();
        this.f50994k.clear();
        int i4 = this.f50999p;
        if (i4 == 0) {
            this.f50993j.addAll(list);
            this.f50994k.addAll(list2);
        } else if (i4 == 1) {
            this.f50996m.addAll(list3);
        } else if (i4 == 2) {
            this.f50995l.addAll(list4);
        }
        k0();
    }

    void k0() {
        int i4 = this.f50999p;
        if (i4 == 0) {
            this.f50996m.clear();
            this.f50995l.clear();
        } else if (i4 == 1) {
            this.f50993j.clear();
            this.f50994k.clear();
            this.f50995l.clear();
        } else if (i4 == 2) {
            this.f50993j.clear();
            this.f50994k.clear();
            this.f50996m.clear();
        }
        com.join.mgps.adapter.n nVar = this.f50992i;
        if (nVar != null) {
            nVar.notifyDataSetChanged();
        }
        if (getActivity() instanceof DownloadCenterActivity) {
            ((DownloadCenterActivity) getActivity()).m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        k0();
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    void m0() {
        try {
            for (DownloadTask downloadTask : this.f50993j) {
                DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                if (f5 != null) {
                    String speed = f5.getSpeed();
                    if (speed.endsWith("M")) {
                        Long.parseLong(speed.replace("M", ""));
                    } else if (speed.endsWith("KB")) {
                        Long.parseLong(speed.replace("KB", ""));
                    } else {
                        Long.parseLong(speed.replace("B", ""));
                    }
                }
            }
            for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f51000q) {
                if (collectionBeanSubBusiness.getDownloadTask() != null) {
                    UtilsMy.x4(collectionBeanSubBusiness.getDownloadTask());
                }
            }
            com.join.mgps.adapter.n nVar = this.f50992i;
            if (nVar != null) {
                nVar.notifyDataSetChanged();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        A0(this.f51000q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void o0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        try {
            g0();
            if (this.f50992i != null) {
                k0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f50998o = arguments.getString("title");
            this.f50999p = arguments.getInt("index");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        V();
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            F0(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    F0(a5, 6);
                    return;
                } else if (c5 == 7) {
                    a5.setStatus(7);
                    F0(a5, 3);
                    return;
                } else if (c5 == 8) {
                    F0(a5, 4);
                    return;
                } else if (c5 != 27) {
                    switch (c5) {
                        case 10:
                            if (a5 == null) {
                                return;
                            }
                            F0(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            F0(a5, 8);
                            return;
                        case 13:
                            F0(a5, 9);
                            return;
                        default:
                            return;
                    }
                } else {
                    F0(a5, 10);
                    return;
                }
            }
            F0(a5, 5);
        } else {
            F0(a5, 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        try {
            y0();
            g0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f51005v = (i5 + i4) - 1;
        this.f51004u = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        this.f51001r = i4;
        if (i4 == 0) {
            W();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.fragment.BaseFragment
    public void onVisible() {
        super.onVisible();
        if (this.f51000q == null) {
            return;
        }
        n0();
        k0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        getActivity().finish();
        Intent intent = new Intent();
        intent.setClass(this.f50986c, MGMainActivity_.class);
        intent.setFlags(TTAdConstant.KEY_CLICK_AREA);
        intent.addFlags(536870912);
        Bundle bundle = new Bundle();
        bundle.putInt("MainPos", 3);
        intent.putExtras(bundle);
        startActivity(intent);
        MApplication.f1496w = false;
    }

    public void t0() {
        V();
    }

    public void u0(int i4) {
        this.f50999p = i4;
    }

    public void v0(String str) {
        this.f50998o = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void w0() {
        DownloadSettingActivity_.B0(this.f50986c).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void x0() {
        this.f50991h.setVisibility(8);
        this.f50988e.FirstShowMYgameTopTip().g(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void y0() {
        APKUtils.a l4;
        try {
            for (DownloadTask downloadTask : p1.f.K().v()) {
                if (com.join.android.app.common.utils.e.l0(this.f50986c).d(this.f50986c, downloadTask.getPackageName()) && (l4 = com.join.android.app.common.utils.e.l0(this.f50986c).l(this.f50986c, downloadTask.getPackageName())) != null && g2.i(downloadTask.getVer()) && l4.d() == Integer.parseInt(downloadTask.getVer())) {
                    UtilsMy.S2(downloadTask, 5);
                }
            }
            l0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
