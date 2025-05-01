package com.join.mgps.activity;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.BaseActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.o2;
import com.join.mgps.customview.XListView2;
import com.join.mgps.customview.w;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activity_plug_manager)
/* loaded from: classes.dex */
public class MyGamePlugManagerActivity extends BaseActivity implements o2.e, AbsListView.OnScrollListener {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f36020b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    XListView2 f36021c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    View f36022d;
    @Pref

    /* renamed from: e  reason: collision with root package name */
    PrefDef_ f36023e;

    /* renamed from: f  reason: collision with root package name */
    com.join.mgps.adapter.o2 f36024f;

    /* renamed from: g  reason: collision with root package name */
    List<DownloadTask> f36025g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private int f36026h = 0;

    /* renamed from: i  reason: collision with root package name */
    private int f36027i = 0;

    /* loaded from: classes4.dex */
    class a implements w.a {
        a() {
        }

        @Override // com.join.mgps.customview.w.a
        public void a(String str) {
            MyGamePlugManagerActivity.this.h0(str);
        }

        @Override // com.join.mgps.customview.w.a
        public void b(String str) {
            MyGamePlugManagerActivity.this.k0(str);
        }
    }

    private void receiveDelete(DownloadTask downloadTask) {
        loadData();
    }

    private void receiveError(DownloadTask downloadTask) {
        List<DownloadTask> list = this.f36025g;
        if (list == null || downloadTask == null) {
            return;
        }
        try {
            Iterator<DownloadTask> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                DownloadTask next = it2.next();
                if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    UtilsMy.x4(next);
                    break;
                }
            }
            j0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        UtilsMy.A4(this.f36025g);
        int i4 = 0;
        while (true) {
            if (i4 >= this.f36025g.size()) {
                break;
            } else if (this.f36025g.get(i4).getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.f36025g.set(i4, downloadTask);
                break;
            } else {
                i4++;
            }
        }
        j0();
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        if (this.f36025g == null || downloadTask == null) {
            return;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.f36025g.size()) {
                break;
            }
            DownloadTask downloadTask2 = this.f36025g.get(i4);
            if (downloadTask2.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.f36025g.set(i4, downloadTask);
                UtilsMy.x4(downloadTask2);
                break;
            }
            i4++;
        }
        j0();
    }

    private void updateProgressPartly() {
        DownloadTask downloadTask;
        View childAt;
        if (this.f36027i < 0 || this.f36026h >= this.f36021c.getCount()) {
            return;
        }
        for (int i4 = this.f36027i; i4 <= this.f36026h; i4++) {
            if (this.f36021c.getAdapter().getItemViewType(i4) == 4 && this.f36021c.getItemAtPosition(i4) != null && (this.f36021c.getItemAtPosition(i4) instanceof DownloadTask) && (downloadTask = (DownloadTask) this.f36021c.getItemAtPosition(i4)) != null && ((downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12) && (childAt = this.f36021c.getChildAt(i4 - this.f36027i)) != null && childAt.getTag() != null && (childAt.getTag() instanceof o2.h))) {
                o2.h hVar = (o2.h) childAt.getTag();
                try {
                    DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                    if (f5 == null) {
                        return;
                    }
                    String str = "";
                    if (!TextUtils.isEmpty(f5.getShowSize())) {
                        long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                        str = downloadTask.getSize() == 0 ? UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble) : UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble);
                    }
                    if (downloadTask.getStatus() == 12) {
                        hVar.f45059b.setProgress((int) f5.getProgress());
                    } else {
                        hVar.f45059b.setProgress((int) f5.getProgress());
                    }
                    if (downloadTask.getStatus() == 2) {
                        hVar.f45060c.setText(str + " · " + f5.getSpeed() + "/S");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    @Override // com.join.mgps.adapter.o2.e
    public void S(DownloadTask downloadTask) {
    }

    @Override // com.join.mgps.adapter.o2.e
    public void T(String str, DownloadTask downloadTask) {
        DownloadTask F = p1.f.K().F(str);
        if (F == null || F.getStatus() == 0) {
            return;
        }
        com.join.mgps.customview.w wVar = new com.join.mgps.customview.w(this);
        wVar.b(new a());
        wVar.d(this.f36022d, str, F.getDown_type() != 2);
    }

    @Override // com.join.mgps.adapter.o2.e
    public void Y(String str, DownloadTask downloadTask) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        com.join.mgps.Util.d0.a().d(this);
        this.f36020b.setVisibility(0);
        this.f36020b.setText("插件管理");
        com.join.mgps.Util.c2.o(this, Color.parseColor("#ffffff"), true);
        com.join.mgps.Util.v0.d("AppZipFailed2DialogAcitivity", "MyGamePlugManagerActivity");
        com.join.mgps.adapter.o2 o2Var = new com.join.mgps.adapter.o2(this);
        this.f36024f = o2Var;
        o2Var.S(this);
        this.f36021c.setAdapter((ListAdapter) this.f36024f);
        this.f36021c.setOnScrollListener(this);
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    @Override // com.join.mgps.adapter.o2.e
    public void g(String str) {
    }

    public void g0(DownloadTask downloadTask) {
        com.php25.PDownload.d.a(downloadTask);
        try {
            if (downloadTask.getRomType().equals(Dtype.androidobb.name()) || downloadTask.getRomType().equals(Dtype.androiddata.name()) || downloadTask.getRomType().equals(Dtype.androidobbdata.name())) {
                UtilsMy.delete(new File(com.join.mgps.Util.v.f28116p, downloadTask.getPackageName()));
                UtilsMy.delete(new File(com.join.mgps.Util.v.f28117q, downloadTask.getPackageName()));
                UtilsMy.delete(new File(downloadTask.getGameZipPath()));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.php25.PDownload.d.a(downloadTask);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void h0(String str) {
        EMUApkTable n4;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            n4 = b2.p.o().n(str);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (n4 == null) {
            return;
        }
        DownloadTask Z = p1.f.K().Z(Integer.parseInt(str));
        if (Z != null) {
            if (Z.getDown_type() != 2) {
                if (com.join.android.app.common.utils.e.l0(this).d(this, Z.getPackageName())) {
                    com.join.android.app.common.utils.e.l0(this).f0(this, Z.getPackageName());
                } else {
                    g0(Z);
                }
            } else {
                com.join.mgps.Util.h0.h(Z.getGameZipPath(), true);
                g0(Z);
                if (com.join.android.app.common.utils.l.i(n4)) {
                    com.join.android.app.common.utils.l.delete(str);
                }
                com.join.mgps.Util.h0.h(n4.getApkPath(), true);
                n4.setApkPath("");
                b2.p.o().m(n4);
            }
        }
        j0();
    }

    @Override // com.join.mgps.adapter.o2.e
    public void i(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void i0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            EMUApkTable n4 = b2.p.o().n(str);
            if (n4 == null) {
                return;
            }
            UtilsMy.q1(n4, this);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0() {
        this.f36024f.o().clear();
        ArrayList arrayList = new ArrayList();
        for (DownloadTask downloadTask : this.f36025g) {
            arrayList.add(new o2.f(4, downloadTask));
        }
        this.f36024f.R(arrayList);
        this.f36024f.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0(String str) {
        EMUApkTable n4;
        try {
            n4 = b2.p.o().n(str);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (n4 == null) {
            return;
        }
        DownloadTask Z = p1.f.K().Z(Integer.parseInt(str));
        if (Z != null) {
            if (Z.getDown_type() != 2) {
                g0(Z);
            } else {
                com.join.mgps.Util.h0.h(Z.getGameZipPath(), true);
                g0(Z);
                if (com.join.android.app.common.utils.l.i(n4)) {
                    com.join.android.app.common.utils.l.delete(str);
                }
                com.join.mgps.Util.h0.h(n4.getApkPath(), true);
                n4.setApkPath("");
                b2.p.o().m(n4);
            }
        }
        j0();
        i0(str);
    }

    protected void loadData() {
        int[] iArr = new int[16];
        iArr[0] = ConstantIntEnum.FBA.value();
        iArr[1] = ConstantIntEnum.FC.value();
        iArr[2] = ConstantIntEnum.GBA.value();
        iArr[3] = ConstantIntEnum.PSP.value();
        iArr[4] = ConstantIntEnum.NDS.value();
        iArr[5] = ConstantIntEnum.SFC.value();
        iArr[6] = ConstantIntEnum.MD.value();
        iArr[7] = ConstantIntEnum.PS.value();
        iArr[8] = ConstantIntEnum.WSC.value();
        iArr[9] = ConstantIntEnum.GBC.value();
        iArr[10] = ConstantIntEnum.N64.value();
        iArr[11] = ConstantIntEnum.ONS.value();
        iArr[12] = ConstantIntEnum.DC.value();
        iArr[13] = ConstantIntEnum.PS2.value();
        iArr[14] = ConstantIntEnum.N3DS.value();
        iArr[15] = (!com.join.mgps.va.overmind.d.f54937g.g() ? ConstantIntEnum.VA64 : ConstantIntEnum.VA32).value();
        this.f36025g.clear();
        for (int i4 = 0; i4 < 16; i4++) {
            String str = iArr[i4] + "";
            DownloadTask F = p1.f.K().F(str);
            if (F != null) {
                this.f36025g.add(F);
            } else {
                EMUApkTable n4 = TextUtils.isEmpty(str) ? null : b2.p.o().n(str);
                if (n4 != null) {
                    DownloadTask downloadTask = new DownloadTask();
                    downloadTask.setStatus(0);
                    downloadTask.setShowName(n4.getApk_name());
                    downloadTask.setShowSize(n4.getSize());
                    downloadTask.setPortraitURL(n4.getLogo());
                    downloadTask.setPlugin_num(iArr[i4] + "");
                    downloadTask.setCrc_link_type_val(iArr[i4] + "");
                    downloadTask.setDown_type(n4.getDown_type());
                    downloadTask.setFileType(Dtype.chajian.name());
                    this.f36025g.add(downloadTask);
                }
            }
        }
        j0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.Util.d0.a().e(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    void onDownloadSpeed(com.join.mgps.event.m mVar) {
        if (mVar == null || TextUtils.isEmpty(mVar.a())) {
            return;
        }
        j0();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        switch (nVar.c()) {
            case 2:
                updateUI(a5, 1);
                return;
            case 3:
                updateUI(a5, 2);
                return;
            case 4:
            case 9:
            default:
                return;
            case 5:
            case 11:
                updateUI(a5, 5);
                return;
            case 6:
                updateUI(a5, 6);
                return;
            case 7:
                updateUI(a5, 3);
                return;
            case 8:
                List<DownloadTask> list = this.f36025g;
                if (list == null || list.size() <= 0) {
                    return;
                }
                updateProgressPartly();
                return;
            case 10:
                updateUI(a5, 7);
                return;
            case 12:
                updateUI(a5, 8);
                return;
            case 13:
                updateUI(a5, 9);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UtilsMy.q4(this);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f36026h = (i5 + i4) - 1;
        this.f36027i = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    void updateUI(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
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
                default:
                    return;
                case 5:
                    receiveSuccess(downloadTask);
                    return;
                case 6:
                    receiveError(downloadTask);
                    return;
            }
        }
    }
}
