package com.join.mgps.activity;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.BaseActivity;
import com.beizi.fusion.widget.TwistView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.component.album.lib.ImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.o2;
import com.join.mgps.customview.XListView2;
import com.join.mgps.customview.v;
import com.join.mgps.customview.w;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dto.TipBean;
import com.join.mgps.enums.Dtype;
import com.join.mgps.receiver.ShortcutReceiver;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activity_plug_manager)
/* loaded from: classes.dex */
public class MyGameUpdateManagerActivity extends BaseActivity implements o2.e, AbsListView.OnScrollListener {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f36040b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    XListView2 f36041c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    View f36042d;

    /* renamed from: e  reason: collision with root package name */
    com.join.mgps.adapter.o2 f36043e;

    /* renamed from: f  reason: collision with root package name */
    List<DownloadTask> f36044f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    HashMap<String, Boolean> f36045g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    HashMap<String, Boolean> f36046h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private int f36047i = 0;

    /* renamed from: j  reason: collision with root package name */
    private int f36048j = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements v.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f36049a;

        a(String str) {
            this.f36049a = str;
        }

        @Override // com.join.mgps.customview.v.a
        public void a(String str) {
            DownloadTask F = p1.f.K().F(this.f36049a);
            if (F.getFileType() == null || !F.getFileType().equals(Dtype.chajian.name())) {
                IntentUtil.getInstance().goGameDetialActivityBYDownloadTAsk(MyGameUpdateManagerActivity.this.getContext(), F);
            }
        }

        @Override // com.join.mgps.customview.v.a
        public void b(String str) {
            MyGameUpdateManagerActivity.this.y0(p1.f.K().F(str));
        }

        @Override // com.join.mgps.customview.v.a
        public void c(String str) {
            MyGameUpdateManagerActivity.this.t0(this.f36049a);
        }

        @Override // com.join.mgps.customview.v.a
        public void d(String str) {
        }

        @Override // com.join.mgps.customview.v.a
        public void e(String str) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements w.a {
        b() {
        }

        @Override // com.join.mgps.customview.w.a
        public void a(String str) {
            MyGameUpdateManagerActivity.this.m0(str);
        }

        @Override // com.join.mgps.customview.w.a
        public void b(String str) {
            MyGameUpdateManagerActivity.this.w0(str);
        }
    }

    private void g0(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("s:");
        sb.append(str);
        DownloadTask F = p1.f.K().F(str);
        if (F != null) {
            Bitmap m4 = ImageLoader.q().m(F.getPortraitURL());
            if (m4 == null) {
                m4 = x0(F.getPortraitURL());
            }
            com.join.mgps.Util.w1.c(this, F.getShowName(), str, m4);
        }
    }

    private void receiveDelete(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.f36044f.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (it2.next().getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                it2.remove();
                break;
            }
        }
        q0();
    }

    private void receiveError(DownloadTask downloadTask) {
        List<DownloadTask> list = this.f36044f;
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
            q0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        boolean z4;
        if (downloadTask == null) {
            return;
        }
        UtilsMy.A4(this.f36044f);
        Iterator<DownloadTask> it2 = this.f36044f.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z4 = false;
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                next.setStatus(downloadTask.getStatus());
                z4 = true;
                break;
            }
        }
        if (!z4) {
            this.f36044f.add(0, downloadTask);
        }
        q0();
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        if (this.f36044f == null || downloadTask == null) {
            return;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.f36044f.size()) {
                break;
            } else if (this.f36044f.get(i4).getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.f36044f.set(i4, downloadTask);
                break;
            } else {
                i4++;
            }
        }
        q0();
    }

    private void updateProgressPartly() {
        DownloadTask downloadTask;
        View childAt;
        if (this.f36048j < 0 || this.f36047i >= this.f36041c.getCount()) {
            return;
        }
        for (int i4 = this.f36048j; i4 <= this.f36047i; i4++) {
            this.f36041c.getAdapter().getItemViewType(i4);
            if (this.f36041c.getItemAtPosition(i4) != null && (this.f36041c.getItemAtPosition(i4) instanceof DownloadTask) && (downloadTask = (DownloadTask) this.f36041c.getItemAtPosition(i4)) != null && ((downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12) && (childAt = this.f36041c.getChildAt(i4 - this.f36048j)) != null && childAt.getTag() != null && (childAt.getTag() instanceof o2.h))) {
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

    private Bitmap x0(String str) {
        if (com.join.mgps.Util.g2.h(str)) {
            return null;
        }
        try {
            return BitmapFactory.decodeFile(((e0.c) Fresco.getImagePipelineFactory().l().c(new com.facebook.cache.common.i(Uri.parse(str).toString()))).c().getPath());
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.adapter.o2.e
    public void S(DownloadTask downloadTask) {
        y0(downloadTask);
        if (downloadTask == null || TextUtils.isEmpty(downloadTask.getCrc_link_type_val())) {
            return;
        }
        this.f36045g.put(downloadTask.getCrc_link_type_val(), Boolean.TRUE);
    }

    @Override // com.join.mgps.adapter.o2.e
    public void T(String str, DownloadTask downloadTask) {
        DownloadTask F = p1.f.K().F(str);
        if (F != null && !TextUtils.isEmpty(F.getFileType()) && F.getFileType().equals(Dtype.chajian.name())) {
            s0(str);
        } else {
            Y(str, downloadTask);
        }
    }

    @Override // com.join.mgps.adapter.o2.e
    public void Y(String str, DownloadTask downloadTask) {
        com.join.mgps.customview.v vVar = new com.join.mgps.customview.v(getContext());
        vVar.b(new a(str));
        vVar.c(this.f36042d, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        com.join.mgps.Util.d0.a().d(this);
        this.f36040b.setVisibility(0);
        this.f36040b.setText("更新管理");
        com.join.mgps.Util.c2.o(this, Color.parseColor("#ffffff"), true);
        com.join.mgps.adapter.o2 o2Var = new com.join.mgps.adapter.o2(this);
        this.f36043e = o2Var;
        o2Var.S(this);
        this.f36041c.setAdapter((ListAdapter) this.f36043e);
        this.f36041c.setOnScrollListener(this);
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

    Context getContext() {
        return this;
    }

    void h0(Context context, String str, String str2, Bitmap bitmap) {
        if (bitmap == null) {
            bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.icon);
        }
        if (bitmap == null) {
            com.join.mgps.Util.l2.a(context).b("创建失败！");
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService("shortcut");
            if (shortcutManager.isRequestPinShortcutSupported()) {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.setClass(context, MGMainActivity_.class);
                intent.putExtra("shortcutGameId", str2);
                intent.addFlags(TTAdConstant.KEY_CLICK_AREA);
                shortcutManager.requestPinShortcut(new ShortcutInfo.Builder(context, str).setIcon(Icon.createWithBitmap(bitmap)).setShortLabel(str).setIntent(intent).build(), PendingIntent.getBroadcast(context, 0, new Intent(context, ShortcutReceiver.class), 134217728).getIntentSender());
                com.join.mgps.Util.w1.e(context, str2);
            }
        } else {
            Intent intent2 = new Intent(com.join.mgps.Util.w1.f28140a);
            intent2.putExtra("duplicate", false);
            intent2.putExtra("android.intent.extra.shortcut.NAME", str);
            intent2.putExtra("android.intent.extra.shortcut.ICON", Bitmap.createScaledBitmap(bitmap, 142, 142, true));
            Intent intent3 = new Intent("android.intent.action.MAIN");
            intent3.setClass(context, MGMainActivity_.class);
            intent3.putExtra("shortcutGameId", str2);
            intent3.addFlags(TTAdConstant.KEY_CLICK_AREA);
            intent3.addCategory("android.intent.category.LAUNCHER");
            intent2.putExtra("android.intent.extra.shortcut.INTENT", intent3);
            context.sendBroadcast(intent2);
            com.join.mgps.Util.w1.e(context, str2);
        }
        q0();
        z0(str2);
    }

    @Override // com.join.mgps.adapter.o2.e
    public void i(String str) {
        UninstallWufunGameActivity_.R0(this).a(str).start();
    }

    boolean i0(Context context, DownloadTask downloadTask) {
        if (downloadTask != null && downloadTask.getStatus() == 5 && (!p0(downloadTask) || !com.join.mgps.Util.w1.d(context, downloadTask.getCrc_link_type_val()))) {
            boolean z4 = !TextUtils.isEmpty(downloadTask.getFileType()) && downloadTask.getFileType().equals(Dtype.apk.name());
            if (!downloadTask.getUrl().endsWith(".apk") && !downloadTask.getRomType().equals("androidobb") && !downloadTask.getRomType().equals("46")) {
                if (z4 && !com.join.mgps.Util.w1.d(context, downloadTask.getCrc_link_type_val())) {
                    return true;
                }
            } else {
                String packageName = downloadTask.getPackageName();
                if (!com.join.mgps.Util.g2.h(packageName) && o0(context, packageName) && com.join.mgps.Util.g2.i(downloadTask.getTips()) && !downloadTask.getTips().contains("网游")) {
                    return true;
                }
            }
        }
        return false;
    }

    void j0(DownloadTask downloadTask) {
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
        Iterator<DownloadTask> it2 = this.f36044f.iterator();
        while (it2.hasNext()) {
            if (it2.next().getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                it2.remove();
            }
        }
        q0();
    }

    public void k0(DownloadTask downloadTask) {
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

    void l0(String str) {
        DownloadTask F = p1.f.K().F(str);
        Context context = getContext();
        String fileType = F.getFileType();
        if (fileType != null && fileType.equals(Dtype.android.name())) {
            if (com.join.android.app.common.utils.e.l0(context).d(context, F.getPackageName())) {
                com.join.android.app.common.utils.e.l0(context).f0(context, F.getPackageName());
                return;
            }
            j0(F);
            UtilsMy.x4(F);
            q0();
            return;
        }
        j0(F);
        UtilsMy.x4(F);
        q0();
    }

    protected void loadData() {
        this.f36044f.clear();
        List<DownloadTask> x4 = p1.f.K().x();
        if (x4 != null && x4.size() > 0) {
            this.f36044f.addAll(x4);
        }
        q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void m0(String str) {
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
                if (com.join.android.app.common.utils.e.l0(this).d(this, Z.getPackageName())) {
                    com.join.android.app.common.utils.e.l0(this).f0(this, Z.getPackageName());
                } else {
                    k0(Z);
                }
            } else {
                com.join.mgps.Util.h0.h(Z.getGameZipPath(), true);
                k0(Z);
                if (com.join.android.app.common.utils.l.i(n4)) {
                    com.join.android.app.common.utils.l.delete(str);
                }
                com.join.mgps.Util.h0.h(n4.getApkPath(), true);
                n4.setApkPath("");
                b2.p.o().m(n4);
            }
        }
        q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = me.relex.photodraweeview.d.f71604s1)
    public void n0(String str) {
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

    boolean o0(Context context, String str) {
        boolean z4 = false;
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f36046h.containsKey(str)) {
            return this.f36046h.get(str).booleanValue();
        }
        try {
            z4 = com.join.mgps.Util.g.e(context, str);
            this.f36046h.put(str, Boolean.valueOf(z4));
            return z4;
        } catch (Exception e5) {
            e5.printStackTrace();
            return z4;
        }
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
        q0();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
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
                    updateUI(a5, 3);
                    return;
                } else if (c5 == 8) {
                    List<DownloadTask> list = this.f36044f;
                    if (list == null || list.size() <= 0) {
                        return;
                    }
                    updateProgressPartly();
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
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        u0();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f36047i = (i5 + i4) - 1;
        this.f36048j = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    boolean p0(DownloadTask downloadTask) {
        Iterator<TipBean> it2 = downloadTask.getTipBeans().iterator();
        while (it2.hasNext()) {
            TipBean next = it2.next();
            if (UtilsMy.v0(downloadTask.getPay_game_amount(), downloadTask.getCrc_link_type_val()) <= 0 && next.getName().contains("单机")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        this.f36043e.o().clear();
        ArrayList arrayList = new ArrayList();
        List<DownloadTask> list = this.f36044f;
        if (list != null && list.size() > 0) {
            for (DownloadTask downloadTask : this.f36044f) {
                if (downloadTask.getStatus() != 5) {
                    if (!TextUtils.isEmpty(downloadTask.getFileType()) && downloadTask.getFileType().equals(Dtype.chajian.name())) {
                        arrayList.add(new o2.f(4, downloadTask));
                    } else {
                        arrayList.add(new o2.f(2, downloadTask, this.f36045g.containsKey(downloadTask.getCrc_link_type_val()) ? this.f36045g.get(downloadTask.getCrc_link_type_val()).booleanValue() : false));
                    }
                }
            }
        }
        this.f36043e.R(arrayList);
        this.f36043e.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0(HashMap<String, Boolean> hashMap) {
        DownloadTask downloadTask;
        com.join.mgps.adapter.o2 o2Var = this.f36043e;
        if (o2Var == null || o2Var.o() == null || this.f36043e.o().size() == 0) {
            return;
        }
        for (o2.f fVar : this.f36043e.o()) {
            if (fVar.b() == 2 && fVar.a() != null && (downloadTask = (DownloadTask) fVar.a()) != null && !TextUtils.isEmpty(downloadTask.getCrc_link_type_val()) && hashMap.containsKey(downloadTask.getCrc_link_type_val())) {
                fVar.d(hashMap.get(downloadTask.getCrc_link_type_val()).booleanValue());
            }
        }
        this.f36043e.notifyDataSetChanged();
    }

    public void s0(String str) {
        DownloadTask F = p1.f.K().F(str);
        if (F == null || F.getStatus() == 0) {
            return;
        }
        com.join.mgps.customview.w wVar = new com.join.mgps.customview.w(this);
        wVar.b(new b());
        wVar.d(this.f36042d, str, F.getDown_type() != 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = TwistView.DELAY_TIME_TWIST)
    public void t0(String str) {
        i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void u0() {
        try {
            HashMap<String, Boolean> d5 = com.join.mgps.Util.g.d(getContext());
            this.f36046h.clear();
            if (d5 != null && d5.size() != 0) {
                this.f36046h.putAll(d5);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void v0(List<DownloadTask> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        HashMap<String, Boolean> hashMap = new HashMap<>();
        for (DownloadTask downloadTask : list) {
            hashMap.put(downloadTask.getCrc_link_type_val(), Boolean.valueOf(i0(getContext(), downloadTask)));
            this.f36045g.put(downloadTask.getCrc_link_type_val(), Boolean.valueOf(i0(getContext(), downloadTask)));
        }
        r0(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void w0(String str) {
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
                j0(Z);
            } else {
                com.join.mgps.Util.h0.h(Z.getGameZipPath(), true);
                j0(Z);
                if (com.join.android.app.common.utils.l.i(n4)) {
                    com.join.android.app.common.utils.l.delete(str);
                }
                com.join.mgps.Util.h0.h(n4.getApkPath(), true);
                n4.setApkPath("");
                b2.p.o().m(n4);
            }
        }
        q0();
        n0(str);
    }

    void y0(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        Bitmap m4 = ImageLoader.q().m(downloadTask.getPortraitURL());
        if (m4 == null) {
            m4 = x0(downloadTask.getPortraitURL());
        }
        h0(getContext(), downloadTask.getShowName(), downloadTask.getCrc_link_type_val(), m4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void z0(String str) {
        new com.join.android.app.common.dialog.d(this, str).show();
    }
}
