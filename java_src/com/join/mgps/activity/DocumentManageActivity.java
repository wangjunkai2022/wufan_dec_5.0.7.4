package com.join.mgps.activity;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.core.internal.view.SupportMenu;
import androidx.fragment.app.FragmentTransaction;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.BaseFragmentActivity;
import com.MApplication;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.github.snowdream.android.app.downloader.b;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.db.tables.CloudDownRecoderTable;
import com.join.mgps.dialog.x;
import com.join.mgps.dto.ArchiveColudArgs;
import com.join.mgps.dto.ArchiveNumDataBean;
import com.join.mgps.dto.CloudListDataBean;
import com.join.mgps.dto.RomArchived;
import com.join.mgps.fragment.MyArchiveFragment;
import com.join.mgps.fragment.MyArchiveFragment_;
import com.join.mgps.fragment.MyShopFragment;
import com.join.mgps.fragment.MyShopFragment_;
import com.join.mgps.pref.PrefDef_;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import q.rorbin.badgeview.QBadgeView;
@EActivity(R.layout.activity_document_manage)
/* loaded from: classes.dex */
public class DocumentManageActivity extends BaseFragmentActivity {
    @Extra

    /* renamed from: v1  reason: collision with root package name */
    public static int f29893v1 = 1;
    ArchiveNumDataBean A;
    MyArchiveFragment B;
    MyArchiveFragment C;
    MyShopFragment D;
    MyShopFragment E;
    private com.wufan.user.service.protobuf.n0 F;
    com.join.mgps.rpc.d G;
    LocalBroadcastManager J;
    e K;
    IntentFilter L;
    private b.InterfaceC0290b M;
    List<RomArchived> P;
    private q.rorbin.badgeview.a S;
    private TextView U;
    PopupWindow X;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f29894b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    RelativeLayout f29895c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f29896d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ImageView f29897e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    RadioGroup f29898f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    RadioButton f29899g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    RadioButton f29900h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    RelativeLayout f29901i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f29902j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ImageView f29903k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    RadioGroup f29904l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    RadioButton f29905m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    RadioButton f29906n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    LinearLayout f29907o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    TextView f29908p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    FrameLayout f29911q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    RelativeLayout f29912r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    SimpleDraweeView f29913s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    TextView f29914t;
    @Pref

    /* renamed from: v  reason: collision with root package name */
    PrefDef_ f29916v;

    /* renamed from: w  reason: collision with root package name */
    com.github.snowdream.android.app.downloader.b f29917w;

    /* renamed from: x  reason: collision with root package name */
    Context f29918x;

    /* renamed from: y  reason: collision with root package name */
    com.join.mgps.dialog.x f29919y;
    @Extra

    /* renamed from: z  reason: collision with root package name */
    String f29920z;

    /* renamed from: u  reason: collision with root package name */
    Fragment f29915u = null;
    int H = 1;
    int I = 0;
    int N = 1;
    public boolean O = false;
    public boolean Q = true;
    public boolean R = true;
    boolean T = true;
    int V = 5;
    @SuppressLint({"HandlerLeak"})
    Handler W = new c();
    boolean Y = false;
    boolean Z = false;

    /* renamed from: p0  reason: collision with root package name */
    boolean f29909p0 = false;

    /* renamed from: p1  reason: collision with root package name */
    Map<String, CloudListDataBean> f29910p1 = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements x.c {
        a() {
        }

        @Override // com.join.mgps.dialog.x.c
        public void a(com.join.mgps.dialog.x xVar) {
            xVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements x.c {
        b() {
        }

        @Override // com.join.mgps.dialog.x.c
        public void a(com.join.mgps.dialog.x xVar) {
            DocumentManageActivity.this.f29917w.i();
            xVar.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    class c extends Handler {
        c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i4 = message.what;
            if (i4 != 3) {
                if (i4 != 4) {
                    return;
                }
                DocumentManageActivity.this.W.removeMessages(3);
                return;
            }
            TextView textView = DocumentManageActivity.this.U;
            textView.setText(DocumentManageActivity.this.V + "s");
            DocumentManageActivity documentManageActivity = DocumentManageActivity.this;
            int i5 = documentManageActivity.V + (-1);
            documentManageActivity.V = i5;
            if (i5 < 0) {
                documentManageActivity.X.dismiss();
                return;
            }
            Message message2 = new Message();
            message2.what = 3;
            DocumentManageActivity.this.W.sendMessageDelayed(message2, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements b.InterfaceC0290b {
        d() {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onError(String str) {
            DocumentManageActivity documentManageActivity = DocumentManageActivity.this;
            int i4 = documentManageActivity.I + 1;
            documentManageActivity.I = i4;
            if (documentManageActivity.H == i4) {
                documentManageActivity.f29919y.dismiss();
            }
            DocumentManageActivity.this.f29917w.l(str);
            CloudListDataBean cloudListDataBean = DocumentManageActivity.this.f29910p1.get(str);
            if (cloudListDataBean == null) {
                return;
            }
            com.join.mgps.event.f fVar = new com.join.mgps.event.f();
            cloudListDataBean.setStatus(6);
            fVar.f(cloudListDataBean);
            fVar.j(6);
            org.greenrobot.eventbus.c.f().o(fVar);
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onFinish(String str) {
            DocumentManageActivity documentManageActivity = DocumentManageActivity.this;
            if (documentManageActivity.H == documentManageActivity.I) {
                documentManageActivity.f29919y.dismiss();
            }
            DocumentManageActivity documentManageActivity2 = DocumentManageActivity.this;
            int i4 = documentManageActivity2.H;
            if (i4 == documentManageActivity2.I && i4 > 1) {
                DocumentManageActivity.this.J.sendBroadcast(new Intent("com.join.mgps.activity.quitManage"));
            }
            DocumentManageActivity documentManageActivity3 = DocumentManageActivity.this;
            documentManageActivity3.I++;
            documentManageActivity3.f29917w.l(str);
            CloudListDataBean cloudListDataBean = DocumentManageActivity.this.f29910p1.get(str);
            if (cloudListDataBean == null) {
                return;
            }
            if (cloudListDataBean.getArchiveFilePath().contains(com.join.mgps.Util.v.f28108h)) {
                DocumentManageActivity.this.k0(cloudListDataBean);
                return;
            }
            CloudDownRecoderTable cloudDownRecoderTable = new CloudDownRecoderTable();
            cloudDownRecoderTable.setGameId(DocumentManageActivity.this.f29920z);
            cloudDownRecoderTable.setFilePath(cloudListDataBean.getArchiveFilePath());
            cloudDownRecoderTable.setFileName(cloudListDataBean.getArchiveFileName());
            cloudDownRecoderTable.setMd5(cloudListDataBean.getFileMd5());
            b2.i.o().k(cloudDownRecoderTable);
            com.join.mgps.event.f fVar = new com.join.mgps.event.f();
            cloudListDataBean.setStatus(0);
            fVar.f(cloudListDataBean);
            fVar.j(0);
            org.greenrobot.eventbus.c.f().o(fVar);
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onProgress(String str, int i4, String str2) {
            CloudListDataBean cloudListDataBean = DocumentManageActivity.this.f29910p1.get(str);
            if (cloudListDataBean == null) {
                return;
            }
            com.join.mgps.event.f fVar = new com.join.mgps.event.f();
            cloudListDataBean.setStatus(3);
            fVar.f(cloudListDataBean);
            fVar.j(3);
            fVar.g(str2);
            fVar.i(i4);
            fVar.h(UtilsMy.d((cloudListDataBean.getFileSize() * i4) / 100) + net.lingala.zip4j.util.e.F0 + UtilsMy.d(cloudListDataBean.getFileSize()) + "K");
            org.greenrobot.eventbus.c.f().o(fVar);
            DocumentManageActivity documentManageActivity = DocumentManageActivity.this;
            int i5 = documentManageActivity.H;
            if (i5 > 1) {
                if (i5 != 0) {
                    documentManageActivity.f29919y.c(DocumentManageActivity.this.I + net.lingala.zip4j.util.e.F0 + DocumentManageActivity.this.H, fVar.b(), fVar.d());
                    return;
                }
                return;
            }
            com.join.mgps.dialog.x xVar = documentManageActivity.f29919y;
            if (xVar != null) {
                xVar.c(fVar.c(), fVar.b() + "/S", fVar.d());
            }
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onStart(String str) {
            DocumentManageActivity documentManageActivity = DocumentManageActivity.this;
            int i4 = documentManageActivity.H;
            if (i4 == 1 || i4 == 0) {
                return;
            }
            com.join.mgps.dialog.x xVar = documentManageActivity.f29919y;
            xVar.c(DocumentManageActivity.this.I + net.lingala.zip4j.util.e.F0 + DocumentManageActivity.this.H, "0K", 100 / DocumentManageActivity.this.H);
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onStop(String str) {
            DocumentManageActivity documentManageActivity = DocumentManageActivity.this;
            int i4 = documentManageActivity.I + 1;
            documentManageActivity.I = i4;
            if (documentManageActivity.H == i4) {
                documentManageActivity.f29919y.dismiss();
            }
            DocumentManageActivity.this.f29917w.l(str);
            CloudListDataBean cloudListDataBean = DocumentManageActivity.this.f29910p1.get(str);
            if (cloudListDataBean == null) {
                return;
            }
            com.join.mgps.event.f fVar = new com.join.mgps.event.f();
            cloudListDataBean.setStatus(6);
            fVar.f(cloudListDataBean);
            fVar.j(6);
            org.greenrobot.eventbus.c.f().o(fVar);
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onWait(String str) {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void updateSize(String str, long j4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DocumentManageActivity.this.f29909p0 = false;
        }
    }

    private void D0(int i4) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        p0(beginTransaction);
        Bundle bundle = new Bundle();
        bundle.putString("gameid", this.f29920z);
        bundle.putInt("type", i4);
        if (i4 == 1) {
            MyArchiveFragment myArchiveFragment = this.B;
            if (myArchiveFragment == null) {
                MyArchiveFragment_ myArchiveFragment_ = new MyArchiveFragment_();
                this.B = myArchiveFragment_;
                myArchiveFragment_.setArguments(bundle);
                beginTransaction.add(R.id.frag, this.B);
            } else {
                beginTransaction.show(myArchiveFragment);
            }
        } else if (i4 == 2) {
            MyArchiveFragment myArchiveFragment2 = this.C;
            if (myArchiveFragment2 == null) {
                MyArchiveFragment_ myArchiveFragment_2 = new MyArchiveFragment_();
                this.C = myArchiveFragment_2;
                myArchiveFragment_2.setArguments(bundle);
                beginTransaction.add(R.id.frag, this.C);
            } else {
                beginTransaction.show(myArchiveFragment2);
            }
        } else if (i4 == 3) {
            MyShopFragment myShopFragment = this.D;
            if (myShopFragment == null) {
                MyShopFragment_ myShopFragment_ = new MyShopFragment_();
                this.D = myShopFragment_;
                myShopFragment_.setArguments(bundle);
                beginTransaction.add(R.id.frag, this.D);
            } else {
                beginTransaction.show(myShopFragment);
            }
        } else {
            MyShopFragment myShopFragment2 = this.E;
            if (myShopFragment2 == null) {
                MyShopFragment_ myShopFragment_2 = new MyShopFragment_();
                this.E = myShopFragment_2;
                myShopFragment_2.setArguments(bundle);
                beginTransaction.add(R.id.frag, this.E);
            } else {
                beginTransaction.show(myShopFragment2);
            }
        }
        beginTransaction.commitAllowingStateLoss();
    }

    public static boolean checkDeviceHasNavigationBar(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", q.a.f73126a);
        boolean z4 = false;
        boolean z5 = identifier > 0 ? resources.getBoolean(identifier) : false;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
            if (!"1".equals(str)) {
                z4 = "0".equals(str) ? true : z5;
            }
            return z4;
        } catch (Exception unused) {
            return z5;
        }
    }

    public static long i0(String str, String str2) {
        try {
            return new SimpleDateFormat(str2).parse(str).getTime();
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0L;
        }
    }

    private ArchiveColudArgs m0() {
        if (this.F == null) {
            return RequestBeanUtil.getInstance(this.f29918x).getArchiveNum("", "", this.f29920z);
        }
        RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(this.f29918x);
        return requestBeanUtil.getArchiveNum(this.F.getUid() + "", this.F.getToken(), this.f29920z);
    }

    private void q0() {
        this.f29917w = com.github.snowdream.android.app.downloader.b.e();
        d dVar = new d();
        this.M = dVar;
        this.f29917w.m(dVar);
        this.f29917w.i();
    }

    private boolean r0() {
        return getWindow().getDecorView().getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void A0() {
        if (this.f29909p0) {
            return;
        }
        if (!this.Y) {
            this.f29897e.setBackgroundResource(R.drawable.archive_up);
            this.f29899g.setVisibility(8);
            this.f29900h.setVisibility(8);
            this.Y = true;
            return;
        }
        f0();
        j0();
        F0(2);
        this.f29907o.setVisibility(0);
        this.f29899g.setBackgroundResource(R.drawable.archive_bg_left);
        this.f29899g.setTextColor(getResources().getColor(R.color.white));
        D0(2);
        this.f29897e.setBackgroundResource(R.drawable.archive_down);
        this.f29899g.setVisibility(0);
        this.f29900h.setVisibility(0);
        this.Y = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void B0() {
        if (this.f29909p0) {
            return;
        }
        if (!com.join.android.app.common.utils.j.j(this.f29918x)) {
            com.join.mgps.Util.l2.a(this.f29918x).b("无网络链接");
        } else if (!this.Z) {
            this.f29903k.setBackgroundResource(R.drawable.archive_up);
            this.f29904l.setVisibility(8);
            this.Z = true;
            hideRedPoint();
        } else {
            f0();
            this.f29904l.setVisibility(0);
            this.f29907o.setVisibility(8);
            j0();
            F0(3);
            this.f29903k.setBackgroundResource(R.drawable.archive_down);
            this.f29905m.setBackgroundResource(R.drawable.archive_bg_left);
            this.f29905m.setTextColor(getResources().getColor(R.color.white));
            D0(3);
            ArchiveNumDataBean archiveNumDataBean = this.A;
            if (archiveNumDataBean != null && archiveNumDataBean.getData_info() != null && this.A.getData_info().getHasNoComment() == 1) {
                showRedPoint();
            }
            this.f29903k.setBackgroundResource(R.drawable.archive_down);
            this.f29904l.setVisibility(0);
            this.Z = false;
        }
    }

    public void C0(boolean z4) {
        this.O = z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.wufun.cloud.showDownDialog"})
    public void E0() {
        if (this.f29917w.g() > 0) {
            this.f29919y.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void F0(int i4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G0(ArchiveNumDataBean archiveNumDataBean) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void H0(int i4) {
        try {
            this.f29913s.setImageURI(this.A.getData_info().getBgImg());
            TextView textView = this.f29896d;
            textView.setText(i4 + "个");
            TextView textView2 = this.f29902j;
            textView2.setText(this.A.getData_info().getMarketNum() + "个");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void I0(CloudListDataBean cloudListDataBean) {
        com.join.mgps.event.f fVar = new com.join.mgps.event.f();
        cloudListDataBean.setStatus(0);
        fVar.f(cloudListDataBean);
        fVar.j(0);
        org.greenrobot.eventbus.c.f().o(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f29918x = this;
        this.f29895c.setVisibility(0);
        this.f29901i.setVisibility(0);
        this.F = AccountUtil_.getInstance_(this).getAccountData();
        this.f29904l.setVisibility(8);
        this.K = new e();
        IntentFilter intentFilter = new IntentFilter();
        this.L = intentFilter;
        intentFilter.addAction("com.join.mgps.activity.quitManage");
        this.J = LocalBroadcastManager.getInstance(this.f29918x);
        this.G = com.join.mgps.rpc.impl.c.k();
        this.f29897e.setBackgroundResource(R.drawable.archive_down);
        this.J.registerReceiver(this.K, this.L);
        int dimension = (int) getResources().getDimension(R.dimen.wdp27);
        getResources().getDimension(R.dimen.wdp343);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((((int) getResources().getDimension(R.dimen.wdp916)) * (getResources().getDisplayMetrics().heightPixels - (dimension * 2))) / ((int) getResources().getDimension(R.dimen.wdp667)), -1);
        layoutParams.leftMargin = dimension;
        layoutParams.topMargin = dimension;
        layoutParams.bottomMargin = dimension;
        this.f29912r.setLayoutParams(layoutParams);
        f0();
        this.f29899g.setBackgroundResource(R.drawable.archive_bg_left);
        f0();
        this.f29904l.setVisibility(0);
        this.f29907o.setVisibility(8);
        this.f29903k.setBackgroundResource(R.drawable.archive_down);
        this.f29905m.setBackgroundResource(R.drawable.archive_bg_left);
        this.f29905m.setTextColor(getResources().getColor(R.color.white));
        D0(3);
        n0();
        q0();
        this.f29919y = new com.join.mgps.dialog.x(this, R.style.HKDialogLoading).f("存档下载中").e("取消下载").b("后台运行").d(new b()).a(new a());
    }

    public void f0() {
        this.f29899g.setTextColor(getResources().getColor(R.color.archive_txt));
        this.f29900h.setTextColor(getResources().getColor(R.color.archive_txt));
        this.f29905m.setTextColor(getResources().getColor(R.color.archive_txt));
        this.f29906n.setTextColor(getResources().getColor(R.color.archive_txt));
        this.f29899g.setBackgroundResource(R.drawable.archive_local);
        this.f29900h.setBackgroundResource(R.drawable.archive_local);
        this.f29905m.setBackgroundResource(R.drawable.archive_local);
        this.f29906n.setBackgroundResource(R.drawable.archive_local);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        if (!this.f29909p0) {
            finish();
        }
        if (s0()) {
            com.join.mgps.va.overmind.d.o().e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void hideRedPoint() {
        q.rorbin.badgeview.a aVar = this.S;
        if (aVar != null) {
            aVar.hide(false);
        }
    }

    void j0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0(CloudListDataBean cloudListDataBean) {
        DownloadTask F = p1.f.K().F(this.f29920z);
        String p4 = UtilsMy.p4(F.getGameZipPath());
        String X1 = UtilsMy.X1(Integer.parseInt(F.getPlugin_num()));
        File file = new File(com.join.mgps.Util.v.f28104d);
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("papa91");
        sb.append(str);
        sb.append(X1);
        sb.append(str);
        String sb2 = sb.toString();
        String substring = p4.substring(p4.lastIndexOf(47) + 1, p4.length());
        File file2 = new File(sb2 + substring);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        String str2 = new String(sb2 + substring + str + cloudListDataBean.getArchiveFileName());
        if (new File(cloudListDataBean.getArchiveFilePath()).exists()) {
            boolean c5 = com.join.mgps.Util.h0.c(cloudListDataBean.getArchiveFilePath(), str2);
            l0(cloudListDataBean.getArchiveCover(), file2.getAbsolutePath() + str, cloudListDataBean.getArchiveFileName() + ".png");
            if (c5) {
                UtilsMy.delete(new File(cloudListDataBean.getArchiveFilePath()));
                cloudListDataBean.setArchiveFilePath(str2);
            }
            I0(cloudListDataBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void l0(String str, String str2, String str3) {
        File file;
        File file2 = null;
        try {
            File file3 = new File(str2);
            if (!file3.exists()) {
                file3.mkdirs();
            }
            file = new File(str2 + str3);
        } catch (Exception e5) {
            e = e5;
        }
        try {
            if (file.exists()) {
                UtilsMy.delete(file);
            }
            file.createNewFile();
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            if (httpURLConnection.getResponseCode() == 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        inputStream.close();
                        fileOutputStream.close();
                        return;
                    }
                }
            } else if (file.exists()) {
                UtilsMy.delete(file);
            }
        } catch (Exception e6) {
            e = e6;
            file2 = file;
            try {
                e.printStackTrace();
                if (file2 == null || !file2.exists()) {
                    return;
                }
                UtilsMy.delete(file2);
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0() {
        try {
            ArchiveNumDataBean f5 = this.G.f(m0().getArgs());
            this.A = f5;
            if (f5 == null || f5.getCode() != 600) {
                return;
            }
            if (this.A.getData_info().getTitle() != null) {
                MApplication.N = true;
                MApplication.O = this.A.getData_info().getTitle();
                MApplication.P = this.A.getData_info().getPid();
                o0();
            }
            if (this.A.getData_info().getHasNoComment() == 1) {
                showRedPoint();
            }
            this.f29916v.getArchiveCoinPref().g(Integer.valueOf(this.A.getData_info().getArchiveCoin()));
            this.f29916v.cloudVipLink().g(this.A.getData_info().getVipLink());
            DownloadTask F = p1.f.K().F(this.f29920z);
            if (F != null) {
                this.P = com.join.mgps.Util.g0.m(F.getPlugin_num(), F.getGameZipPath());
                if (F.getPlugin_num().equals("31")) {
                    boolean z4 = false;
                    boolean z5 = false;
                    for (RomArchived romArchived : this.P) {
                        if (romArchived.getFileName().contains("_v2")) {
                            z4 = true;
                        } else {
                            z5 = true;
                        }
                    }
                    Iterator<RomArchived> it2 = this.P.iterator();
                    while (it2.hasNext()) {
                        RomArchived next = it2.next();
                        if (z5 && !z4) {
                            this.Q = false;
                            if (!com.join.mgps.Util.l1.a(F.getPackageName())) {
                                it2.remove();
                            }
                        } else if (z5 && z4) {
                            if (com.join.mgps.Util.l1.a(F.getPackageName())) {
                                this.R = false;
                                if (next.getFileName().contains("_v2")) {
                                    it2.remove();
                                }
                            } else if (!next.getFileName().contains("_v2")) {
                                it2.remove();
                            }
                        }
                    }
                }
                if (F.getPlugin_num().equals("33")) {
                    RomArchived romArchived2 = null;
                    long j4 = 0;
                    for (RomArchived romArchived3 : this.P) {
                        long i02 = i0(romArchived3.getArchivedTime(), "MM月dd日 HH:mm");
                        if (j4 == 0) {
                            romArchived2 = romArchived3;
                            j4 = i02;
                        }
                        if (j4 > i02) {
                            romArchived2 = romArchived3;
                            j4 = i02;
                        }
                    }
                    if (romArchived2 != null && romArchived2.getFileName().contains("vba")) {
                        C0(true);
                    }
                }
                List<RomArchived> list = this.P;
                if (list != null) {
                    H0(list.size());
                    return;
                } else {
                    H0(0);
                    return;
                }
            }
            H0(0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void o0() {
        MyShopFragment myShopFragment = this.D;
        if (myShopFragment != null) {
            myShopFragment.V();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        b.InterfaceC0290b interfaceC0290b;
        super.onDestroy();
        j0();
        com.github.snowdream.android.app.downloader.b bVar = this.f29917w;
        if (bVar != null && (interfaceC0290b = this.M) != null) {
            bVar.j(interfaceC0290b);
        }
        this.J.unregisterReceiver(this.K);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.f fVar) {
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            if (s0()) {
                com.join.mgps.va.overmind.d.o().e();
            }
            if (this.f29909p0) {
                return true;
            }
            finish();
        }
        return super.onKeyDown(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        q0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        if (z4 && this.N == 2 && this.T) {
            this.T = false;
            F0(2);
        }
    }

    public void p0(FragmentTransaction fragmentTransaction) {
        MyArchiveFragment myArchiveFragment = this.B;
        if (myArchiveFragment != null) {
            fragmentTransaction.hide(myArchiveFragment);
        }
        MyArchiveFragment myArchiveFragment2 = this.C;
        if (myArchiveFragment2 != null) {
            fragmentTransaction.hide(myArchiveFragment2);
        }
        MyShopFragment myShopFragment = this.D;
        if (myShopFragment != null) {
            fragmentTransaction.hide(myShopFragment);
        }
        MyShopFragment myShopFragment2 = this.E;
        if (myShopFragment2 != null) {
            fragmentTransaction.hide(myShopFragment2);
        }
    }

    public boolean s0() {
        return f29893v1 == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showRedPoint() {
        this.S = new QBadgeView(this.f29918x).c(this.f29914t).q(-1).u(4.0f, true).g(SupportMenu.CATEGORY_MASK).v(getResources().getDimensionPixelSize(R.dimen.wdp20), false).o(8388693).l(-1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void t0() {
        if (this.f29909p0) {
            return;
        }
        this.f29909p0 = true;
        this.f29908p.setText("批量模式");
        this.J.sendBroadcast(new Intent("com.join.mgps.activity.joinManage"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void u0() {
        if (this.f29909p0) {
            return;
        }
        if (!com.join.android.app.common.utils.j.j(this.f29918x)) {
            com.join.mgps.Util.l2.a(this.f29918x).b("无网络链接");
            return;
        }
        com.wufan.user.service.protobuf.n0 n0Var = this.F;
        if (n0Var != null && n0Var.getUid() != 0 && !AccountUtil_.getInstance_(this.f29918x).isTourist()) {
            f0();
            j0();
            F0(4);
            this.f29907o.setVisibility(8);
            this.f29906n.setBackgroundResource(R.drawable.archive_bg_left);
            this.f29906n.setTextColor(getResources().getColor(R.color.white));
            D0(4);
            hideRedPoint();
            ArchiveNumDataBean archiveNumDataBean = this.A;
            if (archiveNumDataBean == null || archiveNumDataBean.getData_info() == null || this.A.getData_info().getHasNoComment() != 1) {
                return;
            }
            this.A.getData_info().setHasNoComment(0);
            return;
        }
        IntentUtil.getInstance().goLogin(this.f29918x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void v0() {
        if (this.f29909p0) {
            return;
        }
        if (!com.join.android.app.common.utils.j.j(this.f29918x)) {
            com.join.mgps.Util.l2.a(this.f29918x).b("无网络链接");
            return;
        }
        com.wufan.user.service.protobuf.n0 n0Var = this.F;
        if (n0Var != null && n0Var.getUid() != 0 && !AccountUtil_.getInstance_(this.f29918x).isTourist()) {
            j0();
            F0(1);
            f0();
            this.f29907o.setVisibility(0);
            this.f29900h.setBackgroundResource(R.drawable.archive_bg_left);
            this.f29900h.setTextColor(getResources().getColor(R.color.white));
            D0(1);
            return;
        }
        IntentUtil.getInstance().goLogin(this.f29918x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void w0() {
        if (this.f29909p0) {
            return;
        }
        j0();
        F0(2);
        f0();
        this.f29907o.setVisibility(0);
        this.f29899g.setBackgroundResource(R.drawable.archive_bg_left);
        this.f29899g.setTextColor(getResources().getColor(R.color.white));
        D0(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    @RequiresApi(api = 21)
    public void x0() {
        if (this.f29909p0) {
            return;
        }
        if (!com.join.android.app.common.utils.j.j(this.f29918x)) {
            com.join.mgps.Util.l2.a(this.f29918x).b("无网络链接");
            return;
        }
        j0();
        F0(3);
        f0();
        this.f29907o.setVisibility(8);
        this.f29905m.setBackgroundResource(R.drawable.archive_bg_left);
        this.f29905m.setTextColor(getResources().getColor(R.color.white));
        D0(3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72003h0})
    public void y0(Intent intent) {
        if (r0()) {
            this.H = 1;
            this.I = 1;
            CloudListDataBean cloudListDataBean = (CloudListDataBean) intent.getSerializableExtra("downCloud");
            this.f29910p1.put(cloudListDataBean.getArchiveFile(), cloudListDataBean);
            cloudListDataBean.setStatus(3);
            this.f29917w.b(new com.github.snowdream.android.app.downloader.c(cloudListDataBean.getArchiveFile(), cloudListDataBean.getArchiveFileName(), new File(cloudListDataBean.getArchiveFilePath()).getParent() + File.separator, cloudListDataBean.getFileSize()));
            org.greenrobot.eventbus.c.f().o(cloudListDataBean);
            this.f29919y.show();
            this.f29919y.c("1/" + UtilsMy.d(cloudListDataBean.getFileSize()) + "K", "0", 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.cloud.downCloud.all"})
    public void z0(Intent intent) {
        if (r0()) {
            List<CloudListDataBean> list = (List) intent.getSerializableExtra("downClouds");
            this.H = list.size();
            this.f29919y.show();
            this.f29919y.c("1/" + list.size(), "0K", 1);
            this.I = 1;
            if (this.H != 0) {
                this.f29919y.c("1/" + list.size(), "0K", 100 / this.H);
            }
            for (CloudListDataBean cloudListDataBean : list) {
                this.f29910p1.put(cloudListDataBean.getArchiveFile(), cloudListDataBean);
                String archiveFileName = cloudListDataBean.getArchiveFileName();
                StringBuilder sb = new StringBuilder();
                sb.append(com.join.mgps.Util.v.f28108h);
                String str = File.separator;
                sb.append(str);
                sb.append(cloudListDataBean.getArchiveFileName());
                cloudListDataBean.setArchiveFilePath(sb.toString());
                cloudListDataBean.setStatus(3);
                this.f29917w.b(new com.github.snowdream.android.app.downloader.c(cloudListDataBean.getArchiveFile(), archiveFileName, new File(cloudListDataBean.getArchiveFilePath()).getParent() + str, cloudListDataBean.getFileSize()));
                org.greenrobot.eventbus.c.f().o(cloudListDataBean);
            }
        }
    }
}
