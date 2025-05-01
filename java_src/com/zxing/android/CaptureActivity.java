package com.zxing.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.Toast;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.join.android.app.mgsim.wufun.R;
import com.zxing.android.decoding.CaptureActivityHandler;
import com.zxing.android.decoding.h;
import com.zxing.android.view.ViewfinderView;
import java.io.IOException;
import java.util.Vector;
/* loaded from: classes6.dex */
public class CaptureActivity extends Activity implements SurfaceHolder.Callback {

    /* renamed from: n  reason: collision with root package name */
    public static final String f68660n = "RESULT";

    /* renamed from: o  reason: collision with root package name */
    private static final long f68661o = 200;

    /* renamed from: b  reason: collision with root package name */
    private CaptureActivityHandler f68662b;

    /* renamed from: c  reason: collision with root package name */
    private ViewfinderView f68663c;

    /* renamed from: d  reason: collision with root package name */
    private SurfaceView f68664d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f68665e;

    /* renamed from: f  reason: collision with root package name */
    private Vector<BarcodeFormat> f68666f;

    /* renamed from: g  reason: collision with root package name */
    private String f68667g;

    /* renamed from: h  reason: collision with root package name */
    private h f68668h;

    /* renamed from: i  reason: collision with root package name */
    private MediaPlayer f68669i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f68670j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f68671k;

    /* renamed from: l  reason: collision with root package name */
    com.zxing.android.camera.c f68672l;

    /* renamed from: m  reason: collision with root package name */
    private final MediaPlayer.OnCompletionListener f68673m = new c();

    /* loaded from: classes6.dex */
    class a implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Result f68674b;

        a(Result result) {
            this.f68674b = result;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            dialogInterface.dismiss();
            Intent intent = new Intent();
            intent.putExtra("result", this.f68674b.getText());
            CaptureActivity.this.setResult(-1, intent);
            CaptureActivity.this.finish();
        }
    }

    /* loaded from: classes6.dex */
    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            dialogInterface.dismiss();
            CaptureActivity.this.i(0L);
        }
    }

    /* loaded from: classes6.dex */
    class c implements MediaPlayer.OnCompletionListener {
        c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.seekTo(0);
        }
    }

    private void f() {
        if (this.f68670j && this.f68669i == null) {
            setVolumeControlStream(3);
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f68669i = mediaPlayer;
            mediaPlayer.setAudioStreamType(3);
            this.f68669i.setOnCompletionListener(this.f68673m);
            try {
                AssetFileDescriptor openFd = getAssets().openFd("qrbeep.ogg");
                this.f68669i.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                this.f68669i.setVolume(0.1f, 0.1f);
                this.f68669i.prepare();
            } catch (IOException unused) {
                this.f68669i = null;
            }
        }
    }

    private void g(SurfaceHolder surfaceHolder) {
        try {
            this.f68672l.f(surfaceHolder);
            if (this.f68662b == null) {
                this.f68662b = new CaptureActivityHandler(this, this.f68666f, this.f68667g);
            }
        } catch (IOException | RuntimeException unused) {
        }
    }

    private void h() {
        MediaPlayer mediaPlayer;
        if (this.f68670j && (mediaPlayer = this.f68669i) != null) {
            mediaPlayer.start();
        }
        if (this.f68671k) {
            ((Vibrator) getSystemService("vibrator")).vibrate(200L);
        }
    }

    private void j(Result result, Bitmap bitmap) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(new BitmapDrawable(bitmap));
        builder.setTitle("类型:" + result.getBarcodeFormat() + "\n 结果：" + result.getText());
        builder.setPositiveButton("确定", new a(result));
        builder.setNegativeButton("重新扫描", new b());
        builder.setCancelable(false);
        builder.show();
    }

    public void a() {
        this.f68663c.c();
    }

    public com.zxing.android.camera.c b() {
        return this.f68672l;
    }

    public Handler c() {
        return this.f68662b;
    }

    public ViewfinderView d() {
        return this.f68663c;
    }

    public void e(Result result, Bitmap bitmap) {
        this.f68668h.b();
        h();
        String text = result.getText();
        if (text.equals("")) {
            Toast.makeText(this, "Scan failed!", 0).show();
        } else {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("result", text);
            intent.putExtras(bundle);
            setResult(-1, intent);
        }
        finish();
    }

    public void i(long j4) {
        CaptureActivityHandler captureActivityHandler = this.f68662b;
        if (captureActivityHandler != null) {
            captureActivityHandler.sendEmptyMessageDelayed(8, j4);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.activity_capture);
        this.f68664d = (SurfaceView) findViewById(R.id.surfaceview);
        this.f68663c = (ViewfinderView) findViewById(R.id.viewfinderview);
        getWindow().addFlags(128);
        this.f68665e = false;
        this.f68668h = new h(this);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.f68668h.c();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            setResult(0);
            finish();
            return true;
        } else if (i4 == 80 || i4 == 27) {
            return true;
        } else {
            return super.onKeyDown(i4, keyEvent);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        CaptureActivityHandler captureActivityHandler = this.f68662b;
        if (captureActivityHandler != null) {
            captureActivityHandler.a();
            this.f68662b = null;
        }
        this.f68672l.b();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (getRequestedOrientation() != 1) {
            setRequestedOrientation(1);
        }
        com.zxing.android.camera.c cVar = new com.zxing.android.camera.c(getApplication());
        this.f68672l = cVar;
        this.f68663c.setCameraManager(cVar);
        SurfaceHolder holder = this.f68664d.getHolder();
        if (this.f68665e) {
            g(holder);
        } else {
            holder.addCallback(this);
            holder.setType(3);
        }
        this.f68666f = null;
        this.f68667g = null;
        this.f68670j = true;
        if (((AudioManager) getSystemService("audio")).getRingerMode() != 2) {
            this.f68670j = false;
        }
        f();
        this.f68671k = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f68665e) {
            return;
        }
        this.f68665e = true;
        g(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f68665e = false;
    }
}
