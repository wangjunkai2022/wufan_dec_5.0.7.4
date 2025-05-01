package com.beizi.ad.internal.video;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.AssetFileDescriptor;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.beizi.ad.R;
import com.beizi.ad.c.e;
import com.beizi.ad.internal.activity.b;
import com.beizi.ad.internal.b.f;
import com.beizi.ad.internal.g;
import com.beizi.ad.internal.network.ServerResponse;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.StringUtil;
import com.beizi.ad.internal.utilities.UserEnvInfoUtil;
import com.beizi.ad.internal.utilities.ViewUtil;
import com.beizi.ad.internal.video.a;
import com.beizi.ad.internal.view.AdViewImpl;
import com.beizi.ad.internal.view.AdWebView;
import com.beizi.ad.internal.view.InterstitialAdViewImpl;
import com.beizi.ad.internal.view.c;
import java.io.FileDescriptor;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AdVideoView extends TextureView implements MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener, c {

    /* renamed from: a  reason: collision with root package name */
    protected MediaPlayer f6109a;

    /* renamed from: b  reason: collision with root package name */
    protected a.b f6110b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6111c;

    /* renamed from: d  reason: collision with root package name */
    private int f6112d;

    /* renamed from: e  reason: collision with root package name */
    private int f6113e;

    /* renamed from: f  reason: collision with root package name */
    private int f6114f;

    /* renamed from: g  reason: collision with root package name */
    private int f6115g;

    /* renamed from: h  reason: collision with root package name */
    private int f6116h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6117i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f6118j;

    /* renamed from: k  reason: collision with root package name */
    private a f6119k;

    /* renamed from: l  reason: collision with root package name */
    private Pair<String, Integer> f6120l;

    /* renamed from: m  reason: collision with root package name */
    private int f6121m;
    public AdWebView mAdWebView;

    /* renamed from: n  reason: collision with root package name */
    private long f6122n;

    /* renamed from: o  reason: collision with root package name */
    private float f6123o;

    /* renamed from: p  reason: collision with root package name */
    private float f6124p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6125q;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum a {
        NRF_NONE,
        NRF_START,
        NRF_PAUSE
    }

    public AdVideoView(AdWebView adWebView) {
        super(new MutableContextWrapper(adWebView.getContextFromMutableContext()));
        this.f6111c = false;
        this.f6117i = false;
        this.f6118j = false;
        this.f6119k = a.NRF_NONE;
        this.f6120l = null;
        this.f6110b = a.b.FIT_CENTER;
        this.f6121m = -1;
        this.mAdWebView = adWebView;
    }

    private void setDataSource(@NonNull AssetFileDescriptor assetFileDescriptor) throws IOException {
        setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        assetFileDescriptor.close();
    }

    @Override // com.beizi.ad.internal.view.c
    public void destroy() {
        stop();
        ViewUtil.removeChildFromParent(this);
    }

    @Override // com.beizi.ad.internal.view.c
    public boolean failed() {
        return this.f6111c;
    }

    public AdWebView getAdWebView() {
        return this.mAdWebView;
    }

    @Override // com.beizi.ad.internal.view.c
    public int getCreativeHeight() {
        return this.f6115g;
    }

    public int getCreativeLeft() {
        return this.f6112d;
    }

    public int getCreativeTop() {
        return this.f6113e;
    }

    @Override // com.beizi.ad.internal.view.c
    public int getCreativeWidth() {
        return this.f6114f;
    }

    public int getCurrentPosition() {
        return this.f6109a.getCurrentPosition();
    }

    public int getDuration() {
        return this.f6109a.getDuration();
    }

    @Override // com.beizi.ad.internal.view.c
    public int getRefreshInterval() {
        return this.f6116h;
    }

    public int getVideoHeight() {
        return this.f6109a.getVideoHeight();
    }

    public int getVideoWidth() {
        return this.f6109a.getVideoWidth();
    }

    @Override // com.beizi.ad.internal.view.c
    public View getView() {
        return this;
    }

    public boolean isLooping() {
        return this.f6109a.isLooping();
    }

    public boolean isPlaying() {
        return this.f6109a.isPlaying();
    }

    @Override // com.beizi.ad.internal.view.c
    public void onDestroy() {
        destroy();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f6109a == null) {
            return;
        }
        if (isPlaying()) {
            stop();
        }
        release();
    }

    @Override // com.beizi.ad.internal.view.c
    public void onPause() {
        if (this.f6119k == a.NRF_START) {
            pause();
            this.f6119k = a.NRF_PAUSE;
        }
    }

    @Override // com.beizi.ad.internal.view.c
    public void onResume() {
        if (this.f6119k == a.NRF_PAUSE) {
            start(1);
            this.f6119k = a.NRF_START;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i5) {
        Surface surface = new Surface(surfaceTexture);
        MediaPlayer mediaPlayer = this.f6109a;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i5) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        AdWebView adWebView;
        AdViewImpl adViewImpl;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && this.f6125q && a(this.f6123o, this.f6124p, motionEvent.getX(), motionEvent.getY()) > 15.0f) {
                    this.f6125q = false;
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis() - this.f6122n;
                StringBuilder sb = new StringBuilder();
                sb.append("ACTION_UP:");
                sb.append(currentTimeMillis);
                if (currentTimeMillis < 1000 && this.f6125q && (adWebView = this.mAdWebView) != null && (adViewImpl = adWebView.adViewImpl) != null && adViewImpl.getAdDispatcher() != null) {
                    AdViewImpl adViewImpl2 = this.mAdWebView.adViewImpl;
                    adViewImpl2.clickCount++;
                    adViewImpl2.getAdDispatcher().d();
                    AdWebView adWebView2 = this.mAdWebView;
                    adWebView2.ad.setOpenInNativeBrowser(adWebView2.adViewImpl.getOpensNativeBrowser());
                }
            }
            z4 = false;
        } else {
            this.f6122n = System.currentTimeMillis();
            this.f6123o = motionEvent.getX();
            this.f6124p = motionEvent.getY();
            this.f6125q = true;
            z4 = true;
        }
        return super.onTouchEvent(motionEvent) || z4;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i4, int i5) {
    }

    @Override // android.view.TextureView, android.view.View
    public void onVisibilityChanged(View view, int i4) {
        super.onVisibilityChanged(view, i4);
        b(getWindowVisibility(), i4);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        b(i4, getVisibility());
    }

    public void pause() {
        MediaPlayer mediaPlayer = this.f6109a;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
            this.mAdWebView.ad.handleOnPause(this);
        }
    }

    public void prepare(@Nullable MediaPlayer.OnPreparedListener onPreparedListener) throws IOException, IllegalStateException {
        this.f6109a.setOnPreparedListener(onPreparedListener);
        this.f6109a.prepare();
    }

    public void prepareAsync(@Nullable MediaPlayer.OnPreparedListener onPreparedListener) throws IllegalStateException {
        this.f6109a.setOnPreparedListener(onPreparedListener);
        this.f6109a.prepareAsync();
    }

    public void release() {
        reset();
        this.f6109a.release();
        this.f6109a = null;
    }

    public void reset() {
        this.f6109a.reset();
    }

    public void seekTo(int i4) {
        MediaPlayer mediaPlayer = this.f6109a;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(i4);
        }
    }

    public void setAssetData(@NonNull String str) throws IOException {
        setDataSource(getContext().getAssets().openFd(str));
    }

    public void setCreativeLeft(int i4) {
        this.f6112d = i4;
    }

    public void setCreativeTop(int i4) {
        this.f6113e = i4;
    }

    public void setLooping(boolean z4) {
        MediaPlayer mediaPlayer = this.f6109a;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z4);
        }
    }

    public void setOnCompletionListener(@Nullable MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f6109a.setOnCompletionListener(onCompletionListener);
    }

    public void setOnErrorListener(@Nullable MediaPlayer.OnErrorListener onErrorListener) {
        this.f6109a.setOnErrorListener(onErrorListener);
    }

    public void setOnInfoListener(@Nullable MediaPlayer.OnInfoListener onInfoListener) {
        this.f6109a.setOnInfoListener(onInfoListener);
    }

    public void setRawData(@RawRes int i4) throws IOException {
        setDataSource(getResources().openRawResourceFd(i4));
    }

    public void setRefreshInterval(int i4) {
        this.f6116h = i4;
    }

    public void setScalableType(a.b bVar) {
        this.f6110b = bVar;
        a(getVideoWidth(), getVideoHeight());
    }

    public void setVolume(float f5, float f6) {
        MediaPlayer mediaPlayer = this.f6109a;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f5, f6);
        }
    }

    public void start(int i4) {
        MediaPlayer mediaPlayer = this.f6109a;
        if (mediaPlayer != null) {
            mediaPlayer.start();
            this.mAdWebView.ad.handleOnStart(this, i4);
        }
    }

    public void stop() {
        MediaPlayer mediaPlayer = this.f6109a;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    public boolean toggleMute() {
        boolean z4 = !this.f6118j;
        this.f6118j = z4;
        if (z4) {
            setVolume(0.0f, 0.0f);
        } else {
            setVolume(1.0f, 1.0f);
        }
        return this.f6118j;
    }

    public void transferAd(final AdWebView adWebView, String str) {
        int i4;
        if (StringUtil.isEmpty(str)) {
            return;
        }
        this.f6115g = adWebView.getCreativeHeight();
        this.f6114f = adWebView.getCreativeWidth();
        this.f6113e = adWebView.getCreativeTop();
        this.f6112d = adWebView.getCreativeLeft();
        this.f6116h = adWebView.getRefreshInterval();
        try {
            new URI(str);
            this.f6110b = a.b.FIT_CENTER;
            HaoboLog.v(HaoboLog.videoLogTag, HaoboLog.getString(R.string.videoview_loading, str));
            a(adWebView.getAdExtras());
            try {
                f b5 = g.a().b();
                if (!UserEnvInfoUtil.isUsingWifi(g.a().e()) && this.mAdWebView.IsVideoWifiOnly() && !b5.b(str)) {
                    HaoboLog.e(HaoboLog.videoLogTag, HaoboLog.getString(R.string.wifi_video_load, str));
                    failed();
                    return;
                }
                setDataSource(b5.a(str));
                boolean isMuted = adWebView.isMuted();
                this.f6118j = isMuted;
                if (isMuted) {
                    setVolume(0.0f, 0.0f);
                } else {
                    setVolume(1.0f, 1.0f);
                }
                float h4 = g.a().h();
                float i5 = g.a().i();
                int i6 = -1;
                if (getCreativeWidth() == 1 && getCreativeHeight() == 1) {
                    i4 = -1;
                } else {
                    int creativeWidth = (int) ((getCreativeWidth() * h4) + 0.5f);
                    i6 = (int) ((getCreativeHeight() * i5) + 0.5f);
                    i4 = creativeWidth;
                }
                if (getCreativeLeft() == 0 && getCreativeTop() == 0) {
                    setLayoutParams(new FrameLayout.LayoutParams(i4, i6, 17));
                } else {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i6, 8388659);
                    layoutParams.setMargins((int) ((getCreativeLeft() * h4) + 0.5f), (int) ((getCreativeTop() * i5) + 0.5f), 0, 0);
                    setLayoutParams(layoutParams);
                    setScalableType(a.b.FIT_START);
                }
                setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.beizi.ad.internal.video.AdVideoView.1
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        AdVideoView.this.mAdWebView.ad.handleOnCompletion();
                        if (AdVideoView.this.f6120l != null) {
                            AdVideoView.this.mAdWebView.adViewImpl.getAdDispatcher().a((String) AdVideoView.this.f6120l.first, ((Integer) AdVideoView.this.f6120l.second).intValue());
                        }
                        if (AdVideoView.this.mAdWebView.loadAdBy(1)) {
                            AdViewImpl adViewImpl = adWebView.adViewImpl;
                            if (!(adViewImpl instanceof InterstitialAdViewImpl) || ((InterstitialAdViewImpl) adViewImpl).getAdImplementation() == null) {
                                return;
                            }
                            ((b) ((InterstitialAdViewImpl) adWebView.adViewImpl).getAdImplementation()).g();
                        }
                    }
                });
                setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.beizi.ad.internal.video.AdVideoView.2
                    @Override // android.media.MediaPlayer.OnInfoListener
                    public boolean onInfo(MediaPlayer mediaPlayer, int i7, int i8) {
                        AdWebView adWebView2;
                        AdViewImpl adViewImpl;
                        if (i7 != 3 || (adWebView2 = AdVideoView.this.mAdWebView) == null || (adViewImpl = adWebView2.adViewImpl) == null || adViewImpl.getAdDispatcher() == null) {
                            return false;
                        }
                        AdVideoView.this.mAdWebView.adViewImpl.getAdDispatcher().f();
                        return false;
                    }
                });
                prepareAsync(new MediaPlayer.OnPreparedListener() { // from class: com.beizi.ad.internal.video.AdVideoView.3
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        AdVideoView.this.f6121m = mediaPlayer.getDuration() / 1000;
                        StringBuilder sb = new StringBuilder();
                        sb.append("mPlayTime:");
                        sb.append(AdVideoView.this.f6121m);
                        if (AdVideoView.this.f6117i) {
                            HaoboLog.e(HaoboLog.baseLogTag, "Video start called!");
                            AdVideoView.this.start(0);
                            AdVideoView.this.f6119k = a.NRF_START;
                            return;
                        }
                        AdVideoView.this.f6119k = a.NRF_PAUSE;
                    }
                });
            } catch (IOException | NullPointerException e5) {
                HaoboLog.e(HaoboLog.videoLogTag, HaoboLog.getString(R.string.failed_video_load, str, e5.getMessage()));
                failed();
            }
        } catch (NullPointerException | URISyntaxException unused) {
            HaoboLog.e(HaoboLog.videoLogTag, HaoboLog.getString(R.string.invalid_video_url, str));
            failed();
        }
    }

    @Override // com.beizi.ad.internal.view.c
    public void visible() {
        this.mAdWebView.setVisibility(0);
        this.mAdWebView.adViewImpl.showAdLogo(this);
        AdWebView adWebView = this.mAdWebView;
        if (adWebView == null || !adWebView.shouldDisplayButton()) {
            return;
        }
        AdWebView adWebView2 = this.mAdWebView;
        if (adWebView2.adViewImpl != null) {
            int autoCloseTime = adWebView2.getAutoCloseTime();
            int i4 = this.f6121m;
            if (autoCloseTime > i4) {
                AdWebView adWebView3 = this.mAdWebView;
                adWebView3.adViewImpl.addCloseButton(i4, adWebView3.getShowCloseBtnTime(), this.f6121m, this, this.mAdWebView.ad.getAdType() == e.a.ADP_IVIDEO);
            } else {
                AdWebView adWebView4 = this.mAdWebView;
                adWebView4.adViewImpl.addCloseButton(i4, adWebView4.getShowCloseBtnTime(), this.mAdWebView.getAutoCloseTime(), this, this.mAdWebView.ad.getAdType() == e.a.ADP_IVIDEO);
                this.mAdWebView.adViewImpl.addMuteButton(this, this.f6118j);
            }
        }
        AdViewImpl adViewImpl = this.mAdWebView.adViewImpl;
        if (adViewImpl == null || adViewImpl.getAdDispatcher() == null) {
            return;
        }
        this.mAdWebView.adViewImpl.getAdDispatcher().a();
        AdWebView adWebView5 = this.mAdWebView;
        adWebView5.ad.handleView(this, adWebView5.adViewImpl.getAdParameters().a());
    }

    private void b(int i4, int i5) {
        if (i4 == 0 && i5 == 0) {
            onResume();
            this.f6117i = true;
            return;
        }
        onPause();
        this.f6117i = false;
    }

    public void prepare() throws IOException, IllegalStateException {
        prepare(null);
    }

    public void prepareAsync() throws IllegalStateException {
        prepareAsync(null);
    }

    public void setDataSource(@NonNull String str) throws IOException {
        a();
        this.f6109a.setDataSource(str);
    }

    private void a(int i4, int i5) {
        Matrix a5;
        if (i4 == 0 || i5 == 0 || (a5 = new com.beizi.ad.internal.video.a(new a.c(getWidth(), getHeight()), new a.c(i4, i5)).a(this.f6110b)) == null) {
            return;
        }
        setTransform(a5);
    }

    public void setDataSource(@NonNull Context context, @NonNull Uri uri, @Nullable Map<String, String> map) throws IOException {
        a();
        this.f6109a.setDataSource(context, uri, map);
    }

    public void setDataSource(@NonNull Context context, @NonNull Uri uri) throws IOException {
        a();
        this.f6109a.setDataSource(context, uri);
    }

    private void a() {
        if (this.f6109a == null) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f6109a = mediaPlayer;
            mediaPlayer.setOnVideoSizeChangedListener(this);
            setSurfaceTextureListener(this);
            return;
        }
        reset();
    }

    public void setDataSource(@NonNull FileDescriptor fileDescriptor, long j4, long j5) throws IOException {
        a();
        this.f6109a.setDataSource(fileDescriptor, j4, j5);
    }

    public void setDataSource(@NonNull FileDescriptor fileDescriptor) throws IOException {
        a();
        this.f6109a.setDataSource(fileDescriptor);
    }

    private void a(HashMap hashMap) {
        if (hashMap.isEmpty()) {
            return;
        }
        if (hashMap.containsKey(ServerResponse.EXTRAS_KEY_SCALE)) {
            String str = (String) hashMap.get(ServerResponse.EXTRAS_KEY_SCALE);
            str.hashCode();
            char c5 = 65535;
            switch (str.hashCode()) {
                case -2092301763:
                    if (str.equals("RIGHT_TOP_CROP")) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -1943089714:
                    if (str.equals("RIGHT_BOTTOM")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case -1923874824:
                    if (str.equals("RIGHT_CENTER")) {
                        c5 = 2;
                        break;
                    }
                    break;
                case -1792626435:
                    if (str.equals("LEFT_TOP")) {
                        c5 = 3;
                        break;
                    }
                    break;
                case -1629510025:
                    if (str.equals("RIGHT_CENTER_CROP")) {
                        c5 = 4;
                        break;
                    }
                    break;
                case -1130639214:
                    if (str.equals("LEFT_TOP_CROP")) {
                        c5 = 5;
                        break;
                    }
                    break;
                case -1092027392:
                    if (str.equals("END_INSIDE")) {
                        c5 = 6;
                        break;
                    }
                    break;
                case -1025888925:
                    if (str.equals("LEFT_BOTTOM")) {
                        c5 = 7;
                        break;
                    }
                    break;
                case -1006674035:
                    if (str.equals("LEFT_CENTER")) {
                        c5 = '\b';
                        break;
                    }
                    break;
                case -440887238:
                    if (str.equals("CENTER_CROP")) {
                        c5 = '\t';
                        break;
                    }
                    break;
                case -438941894:
                    if (str.equals("CENTER_BOTTOM_CROP")) {
                        c5 = '\n';
                        break;
                    }
                    break;
                case -188276732:
                    if (str.equals("CENTER_TOP_CROP")) {
                        c5 = 11;
                        break;
                    }
                    break;
                case -172377086:
                    if (str.equals("LEFT_CENTER_CROP")) {
                        c5 = '\f';
                        break;
                    }
                    break;
                case -128849043:
                    if (str.equals("FIT_END")) {
                        c5 = '\r';
                        break;
                    }
                    break;
                case 378209945:
                    if (str.equals("START_INSIDE")) {
                        c5 = 14;
                        break;
                    }
                    break;
                case 384437857:
                    if (str.equals("RIGHT_BOTTOM_CROP")) {
                        c5 = 15;
                        break;
                    }
                    break;
                case 743229044:
                    if (str.equals("FIT_START")) {
                        c5 = 16;
                        break;
                    }
                    break;
                case 1093733475:
                    if (str.equals("FIT_CENTER")) {
                        c5 = 17;
                        break;
                    }
                    break;
                case 1218764914:
                    if (str.equals("RIGHT_TOP")) {
                        c5 = 18;
                        break;
                    }
                    break;
                case 1477882197:
                    if (str.equals("CENTER_BOTTOM")) {
                        c5 = 19;
                        break;
                    }
                    break;
                case 1648362059:
                    if (str.equals("CENTER_TOP")) {
                        c5 = 20;
                        break;
                    }
                    break;
                case 1677322022:
                    if (str.equals("CENTER_INSIDE")) {
                        c5 = 21;
                        break;
                    }
                    break;
                case 1841570796:
                    if (str.equals("LEFT_BOTTOM_CROP")) {
                        c5 = 22;
                        break;
                    }
                    break;
                case 1984282709:
                    if (str.equals("CENTER")) {
                        c5 = 23;
                        break;
                    }
                    break;
                case 2074054159:
                    if (str.equals("FIT_XY")) {
                        c5 = 24;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    this.f6110b = a.b.RIGHT_TOP_CROP;
                    break;
                case 1:
                    this.f6110b = a.b.RIGHT_BOTTOM;
                    break;
                case 2:
                    this.f6110b = a.b.RIGHT_CENTER;
                    break;
                case 3:
                    this.f6110b = a.b.LEFT_TOP;
                    break;
                case 4:
                    this.f6110b = a.b.RIGHT_CENTER_CROP;
                    break;
                case 5:
                    this.f6110b = a.b.LEFT_TOP_CROP;
                    break;
                case 6:
                    this.f6110b = a.b.END_INSIDE;
                    break;
                case 7:
                    this.f6110b = a.b.LEFT_BOTTOM;
                    break;
                case '\b':
                    this.f6110b = a.b.LEFT_CENTER;
                    break;
                case '\t':
                    this.f6110b = a.b.CENTER_CROP;
                    break;
                case '\n':
                    this.f6110b = a.b.CENTER_BOTTOM_CROP;
                    break;
                case 11:
                    this.f6110b = a.b.CENTER_TOP_CROP;
                    break;
                case '\f':
                    this.f6110b = a.b.LEFT_CENTER_CROP;
                    break;
                case '\r':
                    this.f6110b = a.b.FIT_END;
                    break;
                case 14:
                    this.f6110b = a.b.START_INSIDE;
                    break;
                case 15:
                    this.f6110b = a.b.RIGHT_BOTTOM_CROP;
                    break;
                case 16:
                    this.f6110b = a.b.FIT_START;
                    break;
                case 17:
                    this.f6110b = a.b.FIT_CENTER;
                    break;
                case 18:
                    this.f6110b = a.b.RIGHT_TOP;
                    break;
                case 19:
                    this.f6110b = a.b.CENTER_BOTTOM;
                    break;
                case 20:
                    this.f6110b = a.b.CENTER_TOP;
                    break;
                case 21:
                    this.f6110b = a.b.CENTER_INSIDE;
                    break;
                case 22:
                    this.f6110b = a.b.LEFT_BOTTOM_CROP;
                    break;
                case 23:
                    this.f6110b = a.b.CENTER;
                    break;
                case 24:
                    this.f6110b = a.b.FIT_XY;
                    break;
                default:
                    this.f6110b = a.b.FIT_CENTER;
                    break;
            }
        }
        if (hashMap.containsKey(ServerResponse.EXTRAS_KEY_REWARD_ITEM)) {
            String str2 = (String) hashMap.get(ServerResponse.EXTRAS_KEY_REWARD_ITEM);
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String optString = jSONObject.optString("type");
                Integer valueOf = Integer.valueOf(jSONObject.optInt("amount"));
                if (!TextUtils.isEmpty(optString)) {
                    this.f6120l = Pair.create(optString, valueOf);
                } else {
                    this.f6120l = Pair.create("coin", 10);
                }
            } catch (JSONException unused) {
                String str3 = HaoboLog.jsonLogTag;
                HaoboLog.e(str3, "Error parse rewarded item: " + str2);
                this.f6120l = Pair.create("coin", 10);
            }
        }
    }

    private static float a(float f5, float f6, float f7, float f8) {
        float f9 = f5 - f7;
        float f10 = f6 - f8;
        return a((float) Math.sqrt((f9 * f9) + (f10 * f10)));
    }

    private static float a(float f5) {
        return f5 / g.a().k().density;
    }
}
