package com.join.mgps.zxing;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.BaseActivity;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.zxing.camera.c;
import com.join.mgps.zxing.decoding.CaptureActivityHandler;
import com.join.mgps.zxing.decoding.g;
import com.join.mgps.zxing.view.ViewfinderView;
import java.io.IOException;
import java.util.Vector;
/* loaded from: classes5.dex */
public class CaptureActivity extends BaseActivity implements SurfaceHolder.Callback {

    /* renamed from: m  reason: collision with root package name */
    private static final float f55011m = 0.1f;

    /* renamed from: n  reason: collision with root package name */
    private static final long f55012n = 200;

    /* renamed from: b  reason: collision with root package name */
    private CaptureActivityHandler f55013b;

    /* renamed from: c  reason: collision with root package name */
    private ViewfinderView f55014c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f55015d;

    /* renamed from: e  reason: collision with root package name */
    private Vector<BarcodeFormat> f55016e;

    /* renamed from: f  reason: collision with root package name */
    private String f55017f;

    /* renamed from: g  reason: collision with root package name */
    private g f55018g;

    /* renamed from: h  reason: collision with root package name */
    private MediaPlayer f55019h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f55020i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f55021j;

    /* renamed from: k  reason: collision with root package name */
    private Button f55022k;

    /* renamed from: l  reason: collision with root package name */
    private final MediaPlayer.OnCompletionListener f55023l = new b();

    /* loaded from: classes5.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CaptureActivity.this.finish();
        }
    }

    /* loaded from: classes5.dex */
    class b implements MediaPlayer.OnCompletionListener {
        b() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.seekTo(0);
        }
    }

    private void k0() {
        if (this.f55020i && this.f55019h == null) {
            setVolumeControlStream(3);
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f55019h = mediaPlayer;
            mediaPlayer.setAudioStreamType(3);
            this.f55019h.setOnCompletionListener(this.f55023l);
            try {
                AssetFileDescriptor openRawResourceFd = getResources().openRawResourceFd(R.raw.jiejitoubi);
                this.f55019h.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                openRawResourceFd.close();
                this.f55019h.setVolume(0.1f, 0.1f);
                this.f55019h.prepare();
            } catch (Exception unused) {
                this.f55019h = null;
            }
        }
    }

    private void l0(SurfaceHolder surfaceHolder) {
        try {
            c.c().h(surfaceHolder);
            if (this.f55013b == null) {
                this.f55013b = new CaptureActivityHandler(this, this.f55016e, this.f55017f);
            }
        } catch (IOException | RuntimeException unused) {
        }
    }

    private void m0() {
        MediaPlayer mediaPlayer;
        if (this.f55020i && (mediaPlayer = this.f55019h) != null) {
            mediaPlayer.start();
        }
        if (this.f55021j) {
            ((Vibrator) getSystemService("vibrator")).vibrate(200L);
        }
    }

    public void g0() {
        this.f55014c.c();
    }

    public Handler h0() {
        return this.f55013b;
    }

    public ViewfinderView i0() {
        return this.f55014c;
    }

    public void j0(Result result, Bitmap bitmap) {
        this.f55018g.b();
        m0();
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

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.zxing_camera);
        c.g(getApplication());
        this.f55014c = (ViewfinderView) findViewById(R.id.viewfinder_view);
        this.f55022k = (Button) findViewById(R.id.btn_cancel_scan);
        this.f55015d = false;
        this.f55018g = new g(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.f55018g.c();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        CaptureActivityHandler captureActivityHandler = this.f55013b;
        if (captureActivityHandler != null) {
            captureActivityHandler.a();
            this.f55013b = null;
        }
        c.c().b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        SurfaceHolder holder = ((SurfaceView) findViewById(R.id.preview_view)).getHolder();
        if (this.f55015d) {
            l0(holder);
        } else {
            holder.addCallback(this);
            holder.setType(3);
        }
        this.f55016e = null;
        this.f55017f = null;
        this.f55020i = true;
        if (((AudioManager) getSystemService("audio")).getRingerMode() != 2) {
            this.f55020i = false;
        }
        k0();
        this.f55021j = true;
        this.f55022k.setOnClickListener(new a());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f55015d) {
            return;
        }
        this.f55015d = true;
        l0(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f55015d = false;
    }
}
