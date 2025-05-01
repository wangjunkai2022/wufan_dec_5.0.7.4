package com.join.mgps.activity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.WifiUtils;
import com.join.mgps.activity.BuildQRCodeActivity_;
import com.join.mgps.service.SocketClientService;
import com.join.mgps.service.SocketServerService;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.Random;
import m.framework.ui.widget.asyncview.AsyncImageView;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.face_transfer_homepage_activity)
/* loaded from: classes.dex */
public class FaceTransferHomePageActivity extends BaseActivity {

    /* renamed from: v  reason: collision with root package name */
    private static final String f30244v = "FaceTransferHomePageActivity";
    @ViewById(R.id.title_textview)

    /* renamed from: b  reason: collision with root package name */
    TextView f30245b;
    @StringRes(R.string.title_face_transfer_homepage)

    /* renamed from: c  reason: collision with root package name */
    String f30246c;

    /* renamed from: d  reason: collision with root package name */
    Context f30247d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f30248e;

    /* renamed from: g  reason: collision with root package name */
    int f30250g;

    /* renamed from: i  reason: collision with root package name */
    private WifiUtils f30252i;

    /* renamed from: m  reason: collision with root package name */
    private ru.alexbykov.nopermission.b f30256m;

    /* renamed from: p  reason: collision with root package name */
    boolean f30259p;

    /* renamed from: s  reason: collision with root package name */
    boolean f30262s;

    /* renamed from: f  reason: collision with root package name */
    private String f30249f = "AndroidShare_";

    /* renamed from: h  reason: collision with root package name */
    private boolean f30251h = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f30253j = false;

    /* renamed from: k  reason: collision with root package name */
    String f30254k = "";

    /* renamed from: l  reason: collision with root package name */
    boolean f30255l = false;

    /* renamed from: n  reason: collision with root package name */
    boolean f30257n = false;

    /* renamed from: o  reason: collision with root package name */
    boolean f30258o = false;

    /* renamed from: q  reason: collision with root package name */
    SocketServerService.a f30260q = null;

    /* renamed from: r  reason: collision with root package name */
    ServiceConnection f30261r = new c();

    /* renamed from: t  reason: collision with root package name */
    SocketClientService.a f30263t = null;

    /* renamed from: u  reason: collision with root package name */
    ServiceConnection f30264u = new d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends ClickableSpan {
        a() {
        }

        private void a(View view) {
            if (view instanceof TextView) {
                ((TextView) view).setHighlightColor(FaceTransferHomePageActivity.this.getResources().getColor(AsyncImageView.DEFAULT_TRANSPARENT));
            }
        }

        private void b(Context context) {
            try {
                File file = new File(FaceTransferHomePageActivity.this.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("application/zip");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                FaceTransferHomePageActivity.this.startActivity(Intent.createChooser(intent, "发送悟饭（蓝牙发送免流量）"));
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
            }
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Context context = view.getContext();
            a(view);
            b(context);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(Color.parseColor("#3CA4FD"));
            textPaint.clearShadowLayer();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Consumer<com.tbruyelle.rxpermissions2.b> {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(com.tbruyelle.rxpermissions2.b bVar) throws Exception {
            if (bVar.f62140b) {
                if (FaceTransferHomePageActivity.this.checkPermiss("android.permission.CAMERA") && FaceTransferHomePageActivity.this.checkPermiss(com.kuaishou.weapon.p0.g.f55590j)) {
                    FaceTransferHomePageActivity.this.startActivity(new Intent(FaceTransferHomePageActivity.this, FaceTransferScanQrCodeActivity.class));
                }
            } else if (bVar.f62141c) {
            } else {
                com.join.mgps.Util.b0.f0(FaceTransferHomePageActivity.this).X(FaceTransferHomePageActivity.this, bVar);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.join.mgps.Util.w0.e(FaceTransferHomePageActivity.f30244v, "----onServiceConnected---");
            if (iBinder instanceof SocketServerService.a) {
                FaceTransferHomePageActivity faceTransferHomePageActivity = FaceTransferHomePageActivity.this;
                faceTransferHomePageActivity.f30259p = true;
                SocketServerService.a aVar = (SocketServerService.a) iBinder;
                faceTransferHomePageActivity.f30260q = aVar;
                aVar.newServerSocket();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            com.join.mgps.Util.w0.a(FaceTransferHomePageActivity.f30244v, "----onServiceDisconnected---");
        }
    }

    /* loaded from: classes4.dex */
    class d implements ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder instanceof SocketClientService.a) {
                FaceTransferHomePageActivity faceTransferHomePageActivity = FaceTransferHomePageActivity.this;
                faceTransferHomePageActivity.f30262s = true;
                SocketClientService.a aVar = (SocketClientService.a) iBinder;
                faceTransferHomePageActivity.f30263t = aVar;
                aVar.newSocket();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30269b;

        e(String str) {
            this.f30269b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Build.VERSION.SDK_INT >= 11) {
                ((ClipboardManager) FaceTransferHomePageActivity.this.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, this.f30269b));
            } else {
                ((ClipboardManager) FaceTransferHomePageActivity.this.getSystemService("clipboard")).setText(this.f30269b);
            }
            com.join.android.app.common.manager.a.h().j(view.getContext(), "复制成功！", 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.l f30271b;

        f(com.join.mgps.customview.l lVar) {
            this.f30271b = lVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f30271b.dismiss();
            FaceTransferHomePageActivity.this.f30251h = true;
            Intent intent = new Intent(net.lingala.zip4j.util.e.F0);
            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.TetherSettings"));
            intent.setAction("android.intent.action.VIEW");
            FaceTransferHomePageActivity.this.startActivityForResult(intent, 88);
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.l f30273b;

        g(com.join.mgps.customview.l lVar) {
            this.f30273b = lVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f30273b.dismiss();
            FaceTransferHomePageActivity.this.startActivityForResult(new Intent("android.settings.WIFI_SETTINGS"), 89);
        }
    }

    private void getDeviceInfo() {
        this.f30256m.d(com.kuaishou.weapon.p0.g.f55587g, com.kuaishou.weapon.p0.g.f55588h, com.kuaishou.weapon.p0.g.f55583c, "android.permission.READ_SMS", "android.permission.READ_PHONE_NUMBERS").r(new Runnable() { // from class: com.join.mgps.activity.o
            @Override // java.lang.Runnable
            public final void run() {
                FaceTransferHomePageActivity.this.onSuccess();
            }
        }).n(new Runnable() { // from class: com.join.mgps.activity.n
            @Override // java.lang.Runnable
            public final void run() {
                FaceTransferHomePageActivity.this.onDenied();
            }
        }).p(new Runnable() { // from class: com.join.mgps.activity.m
            @Override // java.lang.Runnable
            public final void run() {
                FaceTransferHomePageActivity.this.onNeverAskAgain();
            }
        }).s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDenied() {
        com.join.mgps.Util.l2.a(this).b("你已拒绝权限申请，无法对战！");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNeverAskAgain() {
        com.join.mgps.Util.l2.a(this).b("你已拒绝权限申请，无法对战！");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSuccess() {
        this.f30255l = true;
        this.f30254k = this.f30252i.getApSSIDAll(this);
    }

    private void q0() {
        String string = getString(R.string.no_papa_tip, new Object[]{"免流量发送给好友"});
        SpannableString spannableString = new SpannableString(string);
        a aVar = new a();
        int indexOf = string.indexOf("免流量发送给好友");
        spannableString.setSpan(aVar, indexOf, indexOf + 8, 17);
    }

    void init() {
        this.f30247d = getApplicationContext();
    }

    void initView() {
        this.f30245b.setText(this.f30246c);
        this.f30245b.setGravity(17);
        q0();
    }

    void l0() {
        if (this.f30258o) {
            s0();
            this.f30258o = false;
        }
        if (this.f30257n) {
            Toast.makeText(this, "正在等待连接...", 0).show();
            return;
        }
        Toast.makeText(this, "正在等待连接...", 0).show();
        Intent intent = new Intent(this, SocketServerService.class);
        try {
            bindService(intent, this.f30261r, 1);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        startService(intent);
        this.f30257n = true;
    }

    void m0() {
        if (this.f30257n) {
            stopService();
            this.f30257n = false;
        }
        if (this.f30258o) {
            Toast.makeText(this, "正在连接中...", 0).show();
            return;
        }
        Toast.makeText(this, "正在连接中...", 0).show();
        Intent intent = new Intent(this, SocketClientService.class);
        String localIPAddress = this.f30252i.getLocalIPAddress();
        int lastIndexOf = localIPAddress.lastIndexOf(com.join.mgps.Util.h0.f27805a);
        String str = localIPAddress.substring(0, lastIndexOf) + ".1";
        StringBuilder sb = new StringBuilder();
        sb.append("connected2Service: host");
        sb.append(str);
        sb.append(":::本地地址:::");
        sb.append(localIPAddress);
        intent.putExtra(com.alipay.sdk.cons.c.f4843f, str);
        bindService(intent, this.f30264u, 1);
        startService(intent);
        this.f30258o = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void n0() {
        this.f30256m = new ru.alexbykov.nopermission.b(this);
        this.f30252i = WifiUtils.getInstance(getApplicationContext());
        this.f30250g = new Random().nextInt(900) + 100;
        org.greenrobot.eventbus.c.f().t(this);
        init();
        initView();
    }

    void o0() {
        String apSSID = this.f30252i.getApSSID(this);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            if (!this.f30255l) {
                getDeviceInfo();
                return;
            }
            apSSID = this.f30252i.getApSSIDAll(this);
            this.f30254k = apSSID;
            if ("unknown id".equals(apSSID) || com.join.mgps.Util.g2.h(apSSID)) {
                com.join.mgps.Util.l2.a(this).b("你已拒绝权限申请，无法对战！");
                return;
            }
        }
        if (i4 >= 26 && (!com.join.android.app.common.utils.j.k(this) || com.join.mgps.Util.g2.h(apSSID))) {
            com.join.mgps.customview.l lVar = new com.join.mgps.customview.l(this);
            lVar.show();
            lVar.c(this.f30249f + this.f30250g);
            lVar.e("去连接", new g(lVar));
            return;
        }
        m0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.face_transfer_rel_create_hotspot, R.id.face_transfer_rel_join_hotspot, R.id.back_image})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_image /* 2131296582 */:
                finish();
                return;
            case R.id.face_transfer_rel_create_hotspot /* 2131297608 */:
                if (p0()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    int checkSelfPermission = checkSelfPermission(com.kuaishou.weapon.p0.g.f55587g);
                    StringBuilder sb = new StringBuilder();
                    sb.append("location permission: ");
                    sb.append(checkSelfPermission);
                    if (checkSelfPermission != 0) {
                        ActivityCompat.requestPermissions(this, new String[]{com.kuaishou.weapon.p0.g.f55587g}, 1);
                        return;
                    }
                }
                com.papa.sim.statistic.p.l(this).o0(AccountUtil_.getInstance_(this).getUid());
                IntentUtil.getInstance().goBuildQRCodeActivity(this);
                return;
            case R.id.face_transfer_rel_join_hotspot /* 2131297609 */:
                try {
                    if (Build.VERSION.SDK_INT >= 26 && com.join.mgps.Util.e.f(this)) {
                        Toast.makeText(this, "请确保本机热点处于关闭状态", 0).show();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                com.papa.sim.statistic.p.l(this).p0(AccountUtil_.getInstance_(this).getUid());
                new com.tbruyelle.rxpermissions2.c(this).r("android.permission.CAMERA", com.kuaishou.weapon.p0.g.f55590j).subscribe(new b());
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.f().y(this);
        stopService();
        s0();
        this.f30258o = false;
        this.f30257n = false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i4, strArr, iArr);
        if (i4 == 1 && ContextCompat.checkSelfPermission(this, com.kuaishou.weapon.p0.g.f55587g) == 0) {
            com.papa.sim.statistic.p.l(this).o0(AccountUtil_.getInstance_(this).getUid());
            IntentUtil.getInstance().goBuildQRCodeActivity(this);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSocketStatusEvent(com.join.mgps.socket.entity.f fVar) {
        String str = f30244v;
        com.join.mgps.Util.w0.e(str, "onSocketStatusEvent: 0000");
        if (fVar == null) {
            return;
        }
        int i4 = fVar.f54710a;
        if (i4 != 1) {
            if (i4 != 2) {
                return;
            }
            s0();
            stopService();
            this.f30258o = false;
            this.f30257n = false;
            return;
        }
        com.join.mgps.Util.w0.e(str, "onSocketStatusEvent: 成功");
        com.papa.sim.statistic.p.l(this).l0(AccountUtil_.getInstance_(this).getUid());
        if (this.f30258o) {
            GameTransferActivity_.w1(this).a(1).start();
        } else if (this.f30257n) {
            GameTransferActivity_.w1(this).a(2).start();
        }
        this.f30258o = false;
        this.f30257n = false;
    }

    boolean p0() {
        if (Build.VERSION.SDK_INT >= 26) {
            String str = this.f30249f + this.f30250g;
            if (this.f30252i.getWifiApStateInt() != 11 && this.f30251h) {
                if (this.f30252i.getWifiApStateInt() == 13 || this.f30252i.getWifiApStateInt() == 3) {
                    ((BuildQRCodeActivity_.c) BuildQRCodeActivity_.y0(this).extra(BuildQRCodeActivity_.E, this.f30249f + this.f30250g)).start();
                    return true;
                }
                return true;
            }
            this.f30253j = false;
            com.join.mgps.customview.l lVar = new com.join.mgps.customview.l(this);
            lVar.show();
            lVar.b(str);
            lVar.a(new e(str));
            lVar.d(new f(lVar));
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void r0() {
        IntentUtil.getInstance().goFormDetial(this, "3269874");
    }

    void s0() {
        if (this.f30262s) {
            unbindService(this.f30264u);
            stopService(new Intent(this, SocketClientService.class));
        }
    }

    void stopService() {
        if (this.f30259p) {
            unbindService(this.f30261r);
            stopService(new Intent(this, SocketServerService.class));
        }
    }
}
