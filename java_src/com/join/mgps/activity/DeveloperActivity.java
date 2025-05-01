package com.join.mgps.activity;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import com.BaseActivity;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.quark.SourceShareActivity;
import com.join.kotlin.ui.modleregin.BtReginActivity;
import com.join.kotlin.ui.modleregin.MustPalyReginActivity;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.hideapp.HideAppHomeActivity_;
import com.join.mgps.receiver.NotifcationReceiver;
import com.papa91.arc.ext.ToastManager;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_developer)
/* loaded from: classes4.dex */
public class DeveloperActivity extends BaseActivity {

    /* renamed from: h  reason: collision with root package name */
    public static final String f29818h = "DeveloperActivity";
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    EditText f29819b;

    /* renamed from: c  reason: collision with root package name */
    String f29820c = "/sdcard/testom1.apk";

    /* renamed from: d  reason: collision with root package name */
    boolean f29821d = false;

    /* renamed from: e  reason: collision with root package name */
    com.join.mgps.ad.z f29822e;

    /* renamed from: f  reason: collision with root package name */
    com.join.mgps.ad.x f29823f;

    /* renamed from: g  reason: collision with root package name */
    com.join.mgps.ad.l f29824g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends com.join.mgps.ad.z {

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ boolean f29825s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, String str, String str2, boolean z4) {
            super(context, str, str2);
            this.f29825s = z4;
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void a(String str, int i4, int i5) {
            super.a(str, i4, i5);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void b(boolean z4) {
            super.b(z4);
            DeveloperActivity developerActivity = DeveloperActivity.this;
            com.join.mgps.ad.z zVar = developerActivity.f29822e;
            com.join.mgps.ad.d.i(developerActivity, 9);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(this.f29825s);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoCached() {
            super.onVideoCached();
            DeveloperActivity developerActivity = DeveloperActivity.this;
            com.join.mgps.ad.z zVar = developerActivity.f29822e;
            com.join.mgps.ad.d.i(developerActivity, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends com.join.mgps.ad.x {
        b(Context context, String str, String str2) {
            super(context, str, str2);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void a(String str, int i4, int i5) {
            super.a(str, i4, i5);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void b(boolean z4) {
            super.b(z4);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClick() {
            super.onADClick();
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(false);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoCached() {
            super.onVideoCached();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends com.join.mgps.ad.l {
        c(Context context, String str, String str2) {
            super(context, str, str2);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void a(String str, int i4, int i5) {
            super.a(str, i4, i5);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClick() {
            super.onADClick();
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(true);
        }
    }

    private String o0(String str) {
        PackageInfo packageArchiveInfo;
        if (str == null || (packageArchiveInfo = getPackageManager().getPackageArchiveInfo(str, 1)) == null) {
            return null;
        }
        String str2 = packageArchiveInfo.applicationInfo.packageName;
        StringBuilder sb = new StringBuilder();
        sb.append("call method getPackageName, packageName = ");
        sb.append(str2);
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.btnRewardLoad})
    public void A0() {
        initTTAd("5311400", "949129415", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.btnRewardShow})
    public void B0() {
        com.join.mgps.ad.z zVar = this.f29822e;
        if (zVar != null) {
            zVar.q(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.start_app})
    public void C0() {
        com.join.android.app.common.utils.e.l0(this);
        APKUtils.a0(this, "com.rockstar.gta3");
        PackageManager packageManager = getPackageManager();
        try {
            getPackageManager().getApplicationInfo("com.rockstargames.gtavc", 8192);
        } catch (PackageManager.NameNotFoundException e5) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.rockstargames.gtavc", 1);
                if (packageInfo != null) {
                    int length = packageInfo.activities.length;
                }
            } catch (PackageManager.NameNotFoundException e6) {
                e6.printStackTrace();
            }
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.btnTestHtml})
    public void D0() {
        TestHtmlActivity_.j0(this).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        ToastManager.init(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.btRegin})
    public void g0() {
        startActivity(new Intent(this, BtReginActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        q0(this, "5019681", "102999037");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        startActivity(new Intent(this, SourceShareActivity.class));
    }

    public void initTTAd(String str, String str2, boolean z4) {
        if (this.f29822e == null && com.join.mgps.Util.g2.i(str)) {
            a aVar = new a(this, str, str2, z4);
            this.f29822e = aVar;
            aVar.e();
            return;
        }
        com.join.mgps.ad.z zVar = this.f29822e;
        if (zVar != null) {
            zVar.h(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.btnTTTools})
    public void j0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k0() {
        Bundle bundle = new Bundle();
        bundle.putString("packageName", "com.lmq.sx.pt.ff");
        bundle.putInt("userId", 0);
        Bundle a5 = com.xinzhu.overmind.shared.h.a(com.xinzhu.overmind.shared.g.f68290e, "miniGameInfo", null, bundle);
        StringBuilder sb = new StringBuilder();
        sb.append("btnVideo: ");
        sb.append(a5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.btn_delete_file})
    public void l0() {
        UtilsMy.delete(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/testabc/test2"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.btn_notify})
    public void m0() {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.icon);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setSmallIcon(R.drawable.icon).setContentTitle("正在下载").setLargeIcon(decodeResource).setContentIntent(PendingIntent.getBroadcast(this, (int) SystemClock.uptimeMillis(), new Intent(o1.a.f72023r0, null, this, NotifcationReceiver.class), 134217728)).setAutoCancel(true).setOnlyAlertOnce(true).setChannelId("channel_1").setPriority(4);
        ((NotificationManager) getSystemService("notification")).notify(1, builder.build());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.btn_download_finish})
    public void n0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, @Nullable Intent intent) {
        super.onActivityResult(i4, i5, intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void p0() {
        HideAppHomeActivity_.l0(this).start();
    }

    public void q0(Context context, String str, String str2) {
        if (this.f29824g == null && com.join.mgps.Util.g2.i(str)) {
            c cVar = new c(context, str, str2);
            this.f29824g = cVar;
            cVar.e();
            return;
        }
        this.f29824g.h(true);
    }

    public void r0(Context context, String str, String str2) {
        if (this.f29823f == null && com.join.mgps.Util.g2.i(str)) {
            this.f29823f = new b(context, str, str2);
        } else {
            this.f29823f.h(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.install})
    public void s0() {
        if (!this.f29821d) {
            this.f29820c = "/sdcard/testom1.apk";
            this.f29821d = true;
        } else {
            this.f29820c = "/sdcard/testom2.apk";
            this.f29821d = false;
        }
        if (com.join.mgps.Util.g2.h(this.f29819b.getText().toString())) {
            ToastManager.show("输入安装包路径");
        } else if (!new File(this.f29819b.getText().toString()).exists()) {
            ToastManager.show("安装包不存在");
        } else {
            this.f29820c = this.f29819b.getText().toString();
            com.join.mgps.va.overmind.d.o().B(this.f29820c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.btn_install_a})
    public void t0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.btn_install_b})
    public void u0() {
        com.join.mgps.Util.b0.f0(this).Z(this, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.launch})
    public void v0() {
        String o02 = o0(this.f29820c);
        if (TextUtils.isEmpty(o02)) {
            return;
        }
        com.join.mgps.va.overmind.d.o().X(this, o02);
    }

    public void w0(TextView textView, String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Matcher matcher = Pattern.compile(str2, 2).matcher(str);
        while (matcher.find()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((int) SupportMenu.CATEGORY_MASK), matcher.start(0), matcher.end(0), 33);
        }
        textView.setText(spannableStringBuilder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.mustpaly})
    public void x0() {
        startActivity(new Intent(this, MustPalyReginActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.btnFCLoad})
    public void y0() {
        r0(this, "5311400", "949085233");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.btnFCShow})
    public void z0() {
        com.join.mgps.ad.x xVar = this.f29823f;
        if (xVar != null) {
            xVar.q(this);
        }
    }
}
