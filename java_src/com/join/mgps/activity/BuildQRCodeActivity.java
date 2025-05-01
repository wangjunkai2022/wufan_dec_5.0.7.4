package com.join.mgps.activity;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.baseactivity.BaseLoadingActivity;
import com.join.mgps.helper.ApWifiManager;
import com.join.mgps.receiver.WifiAPBroadcastReceiver;
import com.join.mgps.service.SocketServerService;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activity_build_qr_code)
/* loaded from: classes.dex */
public class BuildQRCodeActivity extends BaseLoadingActivity {
    private static final String A = "BuildQRCodeActivity";
    private static final int B = 2;
    @ViewById(R.id.title_textview)

    /* renamed from: e  reason: collision with root package name */
    TextView f28497e;
    @ViewById(R.id.build_qr_code_title)

    /* renamed from: f  reason: collision with root package name */
    RelativeLayout f28498f;
    @StringRes(R.string.title_build_qr_code)

    /* renamed from: g  reason: collision with root package name */
    String f28499g;
    @ViewById(R.id.qr_code_vstub)

    /* renamed from: h  reason: collision with root package name */
    ViewStub f28500h;

    /* renamed from: i  reason: collision with root package name */
    ImageView f28501i;

    /* renamed from: j  reason: collision with root package name */
    TextView f28502j;

    /* renamed from: k  reason: collision with root package name */
    Context f28503k;

    /* renamed from: l  reason: collision with root package name */
    ApWifiManager f28504l;

    /* renamed from: m  reason: collision with root package name */
    com.join.mgps.Util.f f28505m;
    @StringRes(R.string.hint_msg_creating_ap_wifi)

    /* renamed from: t  reason: collision with root package name */
    String f28512t;
    @StringRes(R.string.hint_msg_create_ap_wifi_failed)

    /* renamed from: u  reason: collision with root package name */
    String f28513u;

    /* renamed from: v  reason: collision with root package name */
    b f28514v;
    @Extra(BuildQRCodeActivity_.E)

    /* renamed from: x  reason: collision with root package name */
    String f28516x;

    /* renamed from: n  reason: collision with root package name */
    ExecutorService f28506n = null;

    /* renamed from: o  reason: collision with root package name */
    Future<?> f28507o = null;

    /* renamed from: p  reason: collision with root package name */
    com.join.mgps.task.a f28508p = null;

    /* renamed from: q  reason: collision with root package name */
    private String f28509q = null;

    /* renamed from: r  reason: collision with root package name */
    String f28510r = "";

    /* renamed from: s  reason: collision with root package name */
    boolean f28511s = false;

    /* renamed from: w  reason: collision with root package name */
    boolean f28515w = false;

    /* renamed from: y  reason: collision with root package name */
    SocketServerService.a f28517y = null;

    /* renamed from: z  reason: collision with root package name */
    ServiceConnection f28518z = new a();

    /* loaded from: classes4.dex */
    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.join.mgps.Util.w0.e(BuildQRCodeActivity.A, "----onServiceConnected---");
            BuildQRCodeActivity buildQRCodeActivity = BuildQRCodeActivity.this;
            buildQRCodeActivity.f28515w = true;
            if (iBinder instanceof SocketServerService.a) {
                SocketServerService.a aVar = (SocketServerService.a) iBinder;
                buildQRCodeActivity.f28517y = aVar;
                aVar.newServerSocket();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            com.join.mgps.Util.w0.a(BuildQRCodeActivity.A, "----onServiceDisconnected---");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (WifiAPBroadcastReceiver.f53999b.equals(intent.getAction()) && intent.getIntExtra("wifi_state", 0) == 11) {
                Toast.makeText(BuildQRCodeActivity.this.f28503k, "热点已关闭", 0).show();
                BuildQRCodeActivity.this.finish();
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void crateApWifiStatus(com.join.mgps.event.d dVar) {
        if (dVar == null) {
            return;
        }
        int i4 = dVar.f49881a;
        if (i4 == 0) {
            com.join.mgps.Util.w0.e(A, "onFailed: 热点创建失败");
            setmLoadingHintMsgLoading(this.f28513u);
        } else if (i4 != 1) {
        } else {
            String str = A;
            com.join.mgps.Util.w0.e(str, "onSuccess: 热点创建成功");
            AccountUtil_.getInstance_(this).getUid();
            com.join.mgps.Util.w0.e(str, "crateApWifiStatus: " + this.f28507o.isDone() + ":::是否取消:::" + this.f28507o.isCancelled());
            g0();
            if (!this.f28511s) {
                m0();
                Future<?> future = this.f28507o;
                if (future != null && !future.isCancelled()) {
                    this.f28507o.cancel(true);
                }
            }
            this.f28511s = true;
        }
    }

    @Override // com.join.mgps.baseactivity.BaseLoadingActivity
    public int getLoadingLayoutResID() {
        return R.id.build_qr_code_rl;
    }

    @Override // com.join.mgps.baseactivity.BaseLoadingActivity
    public int getLoadingMarginTop() {
        String str = Build.MODEL;
        if (!TextUtils.isEmpty(str) && str.equals("HM 1SLTETD")) {
            double loadingMarginTop = super.getLoadingMarginTop();
            Double.isNaN(loadingMarginTop);
            return (int) (loadingMarginTop * 1.5d);
        }
        return super.getLoadingMarginTop();
    }

    void init() {
        this.f28503k = getApplicationContext();
        this.f28506n = Executors.newFixedThreadPool(2);
        this.f28504l = new ApWifiManager(this.f28503k);
        this.f28505m = com.join.mgps.Util.f.i(this.f28503k);
        org.greenrobot.eventbus.c.f().t(this);
    }

    void initView() {
        this.f28497e.setText(this.f28499g);
        l0();
    }

    void l0() {
        i0();
        s0();
        t0();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f28509q = this.f28516x;
            this.f28510r = com.join.mgps.data.c.f49026q;
            com.join.mgps.event.d dVar = new com.join.mgps.event.d();
            dVar.f49881a = 1;
            dVar.f49882b = this.f28509q;
            dVar.f49883c = this.f28510r;
            org.greenrobot.eventbus.c.f().o(dVar);
        } else {
            this.f28504l.createApWifi(this.f28509q, this.f28510r);
        }
        com.join.mgps.task.a aVar = new com.join.mgps.task.a(this.f28503k);
        this.f28508p = aVar;
        this.f28507o = this.f28506n.submit(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        View inflate = this.f28500h.inflate();
        this.f28501i = (ImageView) inflate.findViewById(R.id.qr_code_img);
        TextView textView = (TextView) inflate.findViewById(R.id.ssidTxt);
        this.f28502j = textView;
        textView.setText("请将热点名称设置为\n" + this.f28509q);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f28502j.setVisibility(0);
        }
        this.f28501i.setImageBitmap(i2.a.b("SSID:" + this.f28509q + ":Pwd:" + this.f28510r, this.f28503k));
        o0();
        w0();
        com.papa.sim.statistic.p.l(this).m0(AccountUtil_.getInstance_(this).getUid());
    }

    void n0() {
        this.f28504l.closeWifiAp();
        stopService();
    }

    void o0() {
        Intent intent = new Intent(this, SocketServerService.class);
        bindService(intent, this.f28518z, 1);
        startService(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.baseactivity.BaseLoadingActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.f().y(this);
        p0();
        b bVar = this.f28514v;
        if (bVar != null) {
            unregisterReceiver(bVar);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            n0();
            finish();
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSocketStatusEvent(com.join.mgps.socket.entity.f fVar) {
        String str = A;
        com.join.mgps.Util.w0.e(str, "onSocketStatusEvent: 0000");
        if (fVar == null) {
            return;
        }
        int i4 = fVar.f54710a;
        if (i4 == 1) {
            com.join.mgps.Util.w0.e(str, "onSocketStatusEvent: 创建成功");
            v0();
        } else if (i4 != 2) {
        } else {
            stopService();
            n0();
            finish();
        }
    }

    void p0() {
        com.join.mgps.task.a aVar = this.f28508p;
        if (aVar != null) {
            aVar.c();
        }
        Future<?> future = this.f28507o;
        if (future != null && !future.isCancelled()) {
            this.f28507o.cancel(true);
        }
        ExecutorService executorService = this.f28506n;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        this.f28506n.shutdownNow();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterInject
    public void q0() {
        setLoadingHintMsg(this.f28512t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void r0() {
        init();
        initView();
        this.f28498f.setVisibility(0);
    }

    public void s0() {
        String str;
        Random random = new Random();
        do {
            str = this.f28510r + Character.toString((char) ((Math.abs(random.nextInt()) % 10) + 48));
            this.f28510r = str;
        } while (str.length() < 8);
        com.join.mgps.Util.w0.e(A, "getRandomPwd: 随机的6位密码是" + this.f28510r);
    }

    void stopService() {
        if (this.f28515w) {
            this.f28515w = false;
            this.f28517y.setMonitor(false);
            unbindService(this.f28518z);
            stopService(new Intent(this, SocketServerService.class));
        }
    }

    void t0() {
        this.f28509q = com.join.mgps.Util.h.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.back_image})
    public void u0() {
        n0();
        finish();
    }

    void v0() {
        GameTransferActivity_.w1(this).a(2).start();
        finish();
    }

    void w0() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(WifiAPBroadcastReceiver.f53999b);
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        b bVar = new b();
        this.f28514v = bVar;
        registerReceiver(bVar, intentFilter);
    }
}
