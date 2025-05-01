package com.join.mgps.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.BaseActivity;
import com.MApplication;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.PictureHProgress;
import com.join.mgps.service.CommonService_;
import com.papa91.arc.ext.ToastManager;
import com.uc.crashsdk.export.LogType;
import com.xinzhu.overmind.Overmind;
import java.util.Random;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activity_quark_loading)
/* loaded from: classes.dex */
public class QuarkLoadingActivity extends BaseActivity {

    /* renamed from: q  reason: collision with root package name */
    public static int f36997q = 0;

    /* renamed from: r  reason: collision with root package name */
    public static final int f36998r = 2;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    View f36999b;
    @Extra

    /* renamed from: c  reason: collision with root package name */
    String f37000c;
    @Extra

    /* renamed from: d  reason: collision with root package name */
    String f37001d;
    @Extra

    /* renamed from: e  reason: collision with root package name */
    String f37002e;
    @Extra

    /* renamed from: f  reason: collision with root package name */
    String f37003f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    SimpleDraweeView f37004g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f37005h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f37006i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    PictureHProgress f37007j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    LinearLayout f37008k;

    /* renamed from: l  reason: collision with root package name */
    DownloadTask f37009l;

    /* renamed from: m  reason: collision with root package name */
    boolean f37010m = false;

    /* renamed from: n  reason: collision with root package name */
    b f37011n = null;
    @Extra

    /* renamed from: o  reason: collision with root package name */
    boolean f37012o = false;

    /* renamed from: p  reason: collision with root package name */
    boolean f37013p = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f37014b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37015c;

        a(Intent intent, int i4) {
            this.f37014b = intent;
            this.f37015c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            Overmind.get().startActivity(this.f37014b, this.f37015c);
            QuarkLoadingActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends Thread {

        /* renamed from: b  reason: collision with root package name */
        private boolean f37017b = true;

        /* renamed from: c  reason: collision with root package name */
        Random f37018c;

        /* renamed from: d  reason: collision with root package name */
        int f37019d;

        /* renamed from: e  reason: collision with root package name */
        int f37020e;

        /* renamed from: f  reason: collision with root package name */
        int f37021f;

        /* renamed from: g  reason: collision with root package name */
        int f37022g;

        /* renamed from: h  reason: collision with root package name */
        int f37023h;

        public b() {
            Random random = new Random();
            this.f37018c = random;
            this.f37019d = random.nextInt(10) + 70;
            this.f37020e = this.f37018c.nextInt(10) + 80;
            this.f37021f = 0;
            this.f37022g = 0;
            this.f37023h = 0;
        }

        public void a(boolean z4) {
            this.f37017b = z4;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i4;
            super.run();
            while (this.f37017b && (i4 = this.f37022g) < 100) {
                try {
                    int i5 = this.f37021f;
                    if (i5 < 3) {
                        int i6 = this.f37019d / 3;
                        this.f37023h = i6;
                        this.f37022g = i4 + i6;
                    } else if (i5 >= 3 && i5 < 15) {
                        int i7 = (this.f37020e - this.f37019d) / 12;
                        this.f37023h = i7;
                        this.f37022g = i4 + i7;
                    }
                    QuarkLoadingActivity.this.r0(this.f37022g);
                    Thread.sleep(1000L);
                    this.f37021f++;
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                    return;
                }
            }
            QuarkLoadingActivity.this.r0(100);
        }
    }

    private void i0() {
        org.greenrobot.eventbus.c.f().y(this);
        this.f37010m = false;
        b bVar = this.f37011n;
        if (bVar != null) {
            bVar.a(false);
            this.f37011n = null;
        }
    }

    private void j0() {
        if (getIntent() != null) {
            this.f37012o = getIntent().getBooleanExtra("isLaunchApp", false);
        }
        this.f37009l = p1.f.K().F(com.join.mgps.Util.q1.f27992c);
        MyImageLoader.n(this.f37004g, this.f37003f);
        this.f37005h.setText(this.f37002e);
        if (this.f37012o) {
            m0();
            q0();
            o0(false);
        } else {
            ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(this).extra("action", "downloadQuark")).extra("isOm", true)).a();
            n0(true);
            o0(true);
        }
        p0(this.f37012o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    private void m0() {
        if (com.join.mgps.Util.g2.i(this.f37000c)) {
            DownloadTask F = p1.f.K().F(this.f37000c);
            if (F == null) {
                F = p1.f.K().F(com.join.mgps.Util.q1.f27993d);
            }
            if (F != null && com.join.mgps.va.overmind.d.o().F(F.getPackageName())) {
                if (F.getOpenTime() <= 0) {
                    F.setOpenTime(System.currentTimeMillis());
                    p1.f.K().m(F);
                }
                l0(F.getPackageName(), Overmind.getHostUserId(), this.f37001d);
            }
        }
        b bVar = this.f37011n;
        if (bVar != null) {
            bVar.a(false);
            this.f37011n = null;
        }
    }

    private void n0(boolean z4) {
        this.f37007j.setVisibility(z4 ? 0 : 4);
    }

    private void o0(boolean z4) {
    }

    private void p0(boolean z4) {
        if (z4) {
            this.f37008k.setVisibility(4);
        } else {
            this.f37008k.setVisibility(0);
        }
    }

    private void receiveDelete(DownloadTask downloadTask) {
        if (downloadTask != null && this.f37000c.equals(downloadTask.getCrc_link_type_val())) {
            ToastManager.show("下载文件已删除");
            finish();
        }
    }

    private void receiveError(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(downloadTask.getCrc_link_type_val()) || !downloadTask.getCrc_link_type_val().equals(this.f37000c)) {
                return;
            }
            UtilsMy.x4(downloadTask);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        if (downloadTask != null && this.f37000c.equals(downloadTask.getCrc_link_type_val())) {
            this.f37009l = downloadTask;
        }
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        if (downloadTask != null && this.f37000c.equals(downloadTask.getCrc_link_type_val())) {
            this.f37007j.setProgress(100);
        }
    }

    private void setStatusBar() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            Window window = getWindow();
            window.clearFlags(TTAdConstant.KEY_CLICK_AREA);
            window.getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } else if (i4 >= 19) {
            getWindow().addFlags(TTAdConstant.KEY_CLICK_AREA);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f36999b.getLayoutParams();
        if (i4 >= 21) {
            layoutParams.height = com.join.android.app.common.utils.n.v(this);
        }
        this.f36999b.setLayoutParams(layoutParams);
    }

    private void updateProgressPartly() {
        DownloadTask downloadTask = this.f37009l;
        if (downloadTask != null) {
            if (downloadTask.getStatus() != 2 && this.f37009l.getStatus() != 12) {
                if (this.f37009l.getStatus() == 5 && !this.f37012o && this.f37000c.equals(this.f37009l.getCrc_link_type_val())) {
                    this.f37007j.setProgress(100);
                    return;
                }
                return;
            }
            try {
                if (this.f37000c.equals(this.f37009l.getCrc_link_type_val())) {
                    DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(this.f37009l.getCrc_link_type_val());
                    this.f37007j.setProgress((int) f5.getProgress());
                    TextView textView = this.f37006i;
                    textView.setText("正在部署极速下载通道 " + f5.getProgress() + "%");
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        com.join.mgps.Util.d0.a().d(this);
        setStatusBar();
        if (com.join.mgps.Util.g2.h(this.f37000c)) {
            ToastManager.show("游戏信息获取失败，请重试");
            finish();
            return;
        }
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.ll_back})
    public void back() {
        finish();
        i0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.tv_cancel})
    public void h0() {
        DownloadTask downloadTask = this.f37009l;
        if (downloadTask != null) {
            com.php25.PDownload.d.i(downloadTask);
        }
        finish();
    }

    public boolean l0(String str, int i4, String str2) {
        if (!Overmind.getMindPackageManager().k(str).k() || com.xinzhu.overmind.plugin.b.i()) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str2));
            intent.setPackage(com.join.mgps.Util.q1.f27991b);
            intent.setFlags(268435456);
            MApplication.f1497x.l().has_launch_quark().g(Boolean.TRUE);
            MApplication.f1497x.l().isQuarkSilentDownload().g(Boolean.FALSE);
            new Thread(new a(intent, i4)).start();
            return true;
        }
        return false;
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        i0();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            updateUI(a5, 1);
        } else if (c5 == 3) {
            updateUI(a5, 2);
        } else if (c5 == 5) {
            updateUI(a5, 5);
            if (a5 == null || !this.f37000c.equals(a5.getCrc_link_type_val())) {
                return;
            }
            this.f37013p = true;
            m0();
        } else if (c5 == 6) {
            updateUI(a5, 6);
        } else if (c5 == 7) {
            updateUI(a5, 3);
        } else if (c5 != 8) {
            if (c5 != 48) {
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
            updateUI(a5, 5);
            if (a5 == null || !this.f37000c.equals(a5.getCrc_link_type_val())) {
                return;
            }
            this.f37006i.setText("正在部署极速下载通道");
            this.f37007j.setVisibility(4);
        } else {
            if (this.f37009l == null && a5 != null && com.join.mgps.Util.q1.f27992c.equals(a5.getCrc_link_type_val())) {
                this.f37009l = a5;
            }
            updateProgressPartly();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        j0();
    }

    void q0() {
        if (!this.f37012o || this.f37013p) {
            return;
        }
        n0(true);
        b bVar = this.f37011n;
        if (bVar != null) {
            bVar.a(false);
            this.f37011n = null;
        }
        b bVar2 = new b();
        this.f37011n = bVar2;
        bVar2.a(true);
        this.f37011n.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0(int i4) {
        this.f37007j.setProgress(i4);
        TextView textView = this.f37006i;
        textView.setText("正在启动极速下载通道 " + this.f37007j.getProgress() + "%");
    }

    void showToast(final String str) {
        runOnUiThread(new Runnable() { // from class: com.join.mgps.activity.r2
            @Override // java.lang.Runnable
            public final void run() {
                QuarkLoadingActivity.this.k0(str);
            }
        });
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
