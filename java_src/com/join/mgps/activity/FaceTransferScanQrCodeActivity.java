package com.join.mgps.activity;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.WifiUtils;
import com.join.mgps.baseactivity.BaseLoadingActivity;
import com.join.mgps.helper.ApWifiManager;
import com.join.mgps.service.SocketClientService;
import com.zxing.android.decoding.CaptureActivityHandlerForFace;
import com.zxing.android.view.ViewfinderView;
import java.io.IOException;
import java.util.Vector;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class FaceTransferScanQrCodeActivity extends BaseLoadingActivity implements SurfaceHolder.Callback {
    private static final String H = FaceTransferScanQrCodeActivity.class.getSimpleName();
    private static final float I = 0.1f;
    public static final int J = 123;
    private static final long K = 200;
    com.zxing.android.camera.c A;
    private boolean B;

    /* renamed from: e  reason: collision with root package name */
    private CaptureActivityHandlerForFace f30282e;

    /* renamed from: f  reason: collision with root package name */
    private ViewfinderView f30283f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f30284g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f30285h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f30286i;

    /* renamed from: j  reason: collision with root package name */
    private Vector<BarcodeFormat> f30287j;

    /* renamed from: k  reason: collision with root package name */
    private String f30288k;

    /* renamed from: l  reason: collision with root package name */
    private com.join.mgps.zxing.decoding.g f30289l;

    /* renamed from: m  reason: collision with root package name */
    private MediaPlayer f30290m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f30291n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f30292o;

    /* renamed from: p  reason: collision with root package name */
    Context f30293p;

    /* renamed from: q  reason: collision with root package name */
    ApWifiManager f30294q;

    /* renamed from: t  reason: collision with root package name */
    SurfaceView f30297t;

    /* renamed from: r  reason: collision with root package name */
    WifiUtils f30295r = null;

    /* renamed from: s  reason: collision with root package name */
    com.join.mgps.Util.f f30296s = null;

    /* renamed from: u  reason: collision with root package name */
    String f30298u = null;

    /* renamed from: v  reason: collision with root package name */
    String f30299v = null;

    /* renamed from: w  reason: collision with root package name */
    e f30300w = null;

    /* renamed from: x  reason: collision with root package name */
    boolean f30301x = false;

    /* renamed from: y  reason: collision with root package name */
    boolean f30302y = false;

    /* renamed from: z  reason: collision with root package name */
    boolean f30303z = false;
    Runnable C = new Runnable() { // from class: com.join.mgps.activity.q
        @Override // java.lang.Runnable
        public final void run() {
            FaceTransferScanQrCodeActivity.this.y0();
        }
    };
    Runnable D = new Runnable() { // from class: com.join.mgps.activity.p
        @Override // java.lang.Runnable
        public final void run() {
            FaceTransferScanQrCodeActivity.this.z0();
        }
    };
    SocketClientService.a E = null;
    ServiceConnection F = new b();
    private final MediaPlayer.OnCompletionListener G = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FaceTransferScanQrCodeActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder instanceof SocketClientService.a) {
                SocketClientService.a aVar = (SocketClientService.a) iBinder;
                FaceTransferScanQrCodeActivity.this.E = aVar;
                aVar.newSocket();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* loaded from: classes4.dex */
    class c implements MediaPlayer.OnCompletionListener {
        c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.seekTo(0);
        }
    }

    /* loaded from: classes4.dex */
    static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30307a;

        static {
            int[] iArr = new int[NetworkInfo.State.values().length];
            f30307a = iArr;
            try {
                iArr[NetworkInfo.State.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30307a[NetworkInfo.State.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30307a[NetworkInfo.State.CONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30307a[NetworkInfo.State.DISCONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30307a[NetworkInfo.State.DISCONNECTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30307a[NetworkInfo.State.SUSPENDED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Parcelable parcelableExtra;
            String action = intent.getAction();
            if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action)) {
                int intExtra = intent.getIntExtra("wifi_state", 0);
                if (intExtra == 1) {
                    String unused = FaceTransferScanQrCodeActivity.H;
                } else if (intExtra == 3) {
                    String unused2 = FaceTransferScanQrCodeActivity.H;
                    FaceTransferScanQrCodeActivity faceTransferScanQrCodeActivity = FaceTransferScanQrCodeActivity.this;
                    if (faceTransferScanQrCodeActivity.f30301x) {
                        faceTransferScanQrCodeActivity.n0();
                    }
                }
            }
            if (!"android.net.wifi.STATE_CHANGE".equals(action) || (parcelableExtra = intent.getParcelableExtra("networkInfo")) == null) {
                return;
            }
            int i4 = d.f30307a[((NetworkInfo) parcelableExtra).getState().ordinal()];
            if (i4 != 1) {
                if (i4 != 4) {
                    return;
                }
                String unused3 = FaceTransferScanQrCodeActivity.H;
                return;
            }
            String ssid = WifiUtils.getInstance(FaceTransferScanQrCodeActivity.this.f30293p).getSSID(FaceTransferScanQrCodeActivity.this.f30293p);
            String unused4 = FaceTransferScanQrCodeActivity.H;
            StringBuilder sb = new StringBuilder();
            sb.append("onReceive: wifi 连接上的名称");
            sb.append(ssid);
            if (ssid == null || !ssid.equals(FaceTransferScanQrCodeActivity.this.f30298u)) {
                return;
            }
            FaceTransferScanQrCodeActivity faceTransferScanQrCodeActivity2 = FaceTransferScanQrCodeActivity.this;
            if (faceTransferScanQrCodeActivity2.f30302y) {
                return;
            }
            faceTransferScanQrCodeActivity2.o0();
            FaceTransferScanQrCodeActivity.this.f30302y = true;
        }
    }

    private void A0() {
        MediaPlayer mediaPlayer;
        if (this.f30291n && (mediaPlayer = this.f30290m) != null) {
            mediaPlayer.start();
        }
        if (this.f30292o) {
            ((Vibrator) getSystemService("vibrator")).vibrate(200L);
        }
    }

    private void D0() {
        SurfaceView surfaceView = (SurfaceView) findViewById(R.id.preview_view);
        this.f30297t = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        if (this.f30286i) {
            x0(holder);
        } else {
            holder.addCallback(this);
            holder.setType(3);
        }
        this.f30287j = null;
        this.f30288k = null;
        this.f30291n = true;
        if (((AudioManager) getSystemService("audio")).getRingerMode() != 2) {
            this.f30291n = false;
        }
        w0();
        this.f30292o = true;
    }

    private void s0() {
        if (ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") != 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.CAMERA"}, 123);
        } else {
            D0();
        }
    }

    private void w0() {
        if (this.f30291n && this.f30290m == null) {
            setVolumeControlStream(3);
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f30290m = mediaPlayer;
            mediaPlayer.setAudioStreamType(3);
            this.f30290m.setOnCompletionListener(this.G);
            AssetFileDescriptor openRawResourceFd = getResources().openRawResourceFd(R.raw.jiejitoubi);
            try {
                this.f30290m.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                openRawResourceFd.close();
                this.f30290m.setVolume(0.1f, 0.1f);
                this.f30290m.prepare();
            } catch (IOException unused) {
                this.f30290m = null;
            }
        }
    }

    private void x0(SurfaceHolder surfaceHolder) {
        try {
            this.A.f(surfaceHolder);
            if (this.f30282e == null) {
                this.f30282e = new CaptureActivityHandlerForFace(this, this.f30287j, this.f30288k);
            }
        } catch (IOException | RuntimeException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0() {
        try {
            if (this.B) {
                return;
            }
            Toast.makeText(this, "连接失败，请手动连接网络:" + this.f30298u, 0).show();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0() {
        try {
            if (this.B) {
                return;
            }
            com.join.mgps.Util.v2.h(this).a(com.join.mgps.Util.v2.c(this.f30298u, this.f30299v, 1));
            this.f46252d.postDelayed(this.C, 7000L);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void B0() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        e eVar = new e();
        this.f30300w = eVar;
        registerReceiver(eVar, intentFilter);
    }

    void C0() {
        Handler handler = this.f46252d;
        if (handler == null) {
            return;
        }
        try {
            handler.removeCallbacks(this.D);
            this.f46252d.removeCallbacks(this.C);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void E0() {
        e eVar = this.f30300w;
        if (eVar != null) {
            unregisterReceiver(eVar);
        }
    }

    @Override // com.join.mgps.baseactivity.BaseLoadingActivity
    public int getLoadingLayoutResID() {
        return R.id.scan_qr_code_fl;
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

    void initView() {
        this.f30283f = (ViewfinderView) findViewById(R.id.viewfinder_view);
        this.f30284g = (TextView) findViewById(R.id.title_textview);
        ImageView imageView = (ImageView) findViewById(R.id.back_image);
        this.f30285h = imageView;
        imageView.setOnClickListener(new a());
        this.f30284g.setText(R.string.title_scan_qr_code);
        this.f30286i = false;
        this.f30289l = new com.join.mgps.zxing.decoding.g(this);
    }

    void n0() {
        i0();
        this.f30294q.connectApWifi(this.f30298u, this.f30299v);
        try {
            Handler handler = this.f46252d;
            if (handler != null) {
                handler.postDelayed(this.C, 12000L);
            }
        } catch (Resources.NotFoundException e5) {
            e5.printStackTrace();
        }
    }

    void o0() {
        Intent intent = new Intent(this, SocketClientService.class);
        String localIPAddress = this.f30295r.getLocalIPAddress();
        int lastIndexOf = localIPAddress.lastIndexOf(com.join.mgps.Util.h0.f27805a);
        String str = localIPAddress.substring(0, lastIndexOf) + ".1";
        StringBuilder sb = new StringBuilder();
        sb.append("connected2Service: host");
        sb.append(str);
        sb.append(":::本地地址:::");
        sb.append(localIPAddress);
        intent.putExtra(com.alipay.sdk.cons.c.f4843f, str);
        bindService(intent, this.F, 1);
        startService(intent);
        this.f30303z = true;
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A = new com.zxing.android.camera.c(this);
        setLoadingHintMsg(getResources().getString(R.string.success_scan_qr_code_loading_hint));
        setContentView(R.layout.face_transfer_scan_qr_code_activity);
        this.f30293p = getApplicationContext();
        this.f30294q = new ApWifiManager(this.f30293p);
        this.f30295r = WifiUtils.getInstance(this.f30293p);
        this.f30296s = com.join.mgps.Util.f.i(this.f30293p);
        g0();
        initView();
        s0();
        org.greenrobot.eventbus.c.f().t(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.baseactivity.BaseLoadingActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f30289l.c();
        E0();
        C0();
        org.greenrobot.eventbus.c.f().y(this);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            stopService();
            finish();
        }
        return super.onKeyDown(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        CaptureActivityHandlerForFace captureActivityHandlerForFace = this.f30282e;
        if (captureActivityHandlerForFace != null) {
            captureActivityHandlerForFace.a();
            this.f30282e = null;
        }
        this.A.b();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        if (i4 != 123) {
            super.onRequestPermissionsResult(i4, strArr, iArr);
        } else if (iArr[0] == 0) {
            D0();
        } else if (!ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.CAMERA")) {
            Toast.makeText(this, "扫描二维码需要相机权限,请授权相机权限", 0).show();
        } else {
            Toast.makeText(this, "没有获取到权限,请授权相机权限", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (getRequestedOrientation() != 1) {
            setRequestedOrientation(1);
        }
        com.zxing.android.camera.c cVar = new com.zxing.android.camera.c(getApplication());
        this.A = cVar;
        this.f30283f.setCameraManager(cVar);
        SurfaceHolder holder = this.f30297t.getHolder();
        if (this.f30286i) {
            x0(holder);
        } else {
            holder.addCallback(this);
            holder.setType(3);
        }
        this.f30287j = null;
        this.f30288k = null;
        this.f30291n = true;
        if (((AudioManager) getSystemService("audio")).getRingerMode() != 2) {
            this.f30291n = false;
        }
        w0();
        this.f30292o = true;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSocketStatusEvent(com.join.mgps.socket.entity.f fVar) {
        String str = H;
        com.join.mgps.Util.w0.e(str, "onSocketStatusEvent: 0000");
        if (fVar == null) {
            return;
        }
        int i4 = fVar.f54710a;
        if (i4 != 1) {
            if (i4 != 2) {
                return;
            }
            stopService();
            finish();
            return;
        }
        com.join.mgps.Util.w0.e(str, "onSocketStatusEvent: 成功");
        this.B = true;
        com.papa.sim.statistic.p.l(this).l0(AccountUtil_.getInstance_(this).getUid());
        u0();
    }

    public void p0() {
        this.f30283f.c();
    }

    public com.zxing.android.camera.c q0() {
        return this.A;
    }

    public Handler r0() {
        return this.f30282e;
    }

    void stopService() {
        if (this.f30303z) {
            unbindService(this.F);
            stopService(new Intent(this, SocketClientService.class));
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f30286i) {
            return;
        }
        this.f30286i = true;
        x0(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f30286i = false;
    }

    public ViewfinderView t0() {
        return this.f30283f;
    }

    void u0() {
        Intent intent = new Intent(this, GameTransferActivity_.class);
        Bundle bundle = new Bundle();
        bundle.putInt(GameTransferActivity_.E1, 1);
        intent.putExtras(bundle);
        startActivity(intent);
        finish();
    }

    public void v0(Result result, Bitmap bitmap) {
        this.f30289l.b();
        A0();
        String text = result.getText();
        StringBuilder sb = new StringBuilder();
        sb.append("handleDecode: 扫描结果");
        sb.append(text);
        if (text.equals("")) {
            Toast.makeText(this, "Scan failed!", 0).show();
            return;
        }
        String[] split = text.split(":");
        int length = split.length;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("handleDecode: 扫描结果::::");
        sb2.append(split.toString());
        sb2.append(":::::size::::");
        sb2.append(length);
        if (length == 4) {
            this.f30298u = split[1];
            this.f30299v = split[3];
            if (!this.f30295r.isWifiEnable()) {
                this.f30301x = true;
                this.f30296s.f();
                this.f30295r.openWifi(this.f30293p);
            } else {
                n0();
            }
            this.f30297t.setVisibility(8);
            this.f30283f.setVisibility(8);
            B0();
            return;
        }
        Toast.makeText(this, (int) R.string.erro_scan_qr_code, 0).show();
    }
}
