package com.kwad.sdk.core.video.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaDataSource;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.annotation.NonNull;
import com.kwad.sdk.n.l;
import com.kwad.sdk.service.ServiceProvider;
import com.kwai.video.ksvodplayerkit.IKSVodPlayer;
import com.kwai.video.ksvodplayerkit.KSVodConstants;
import com.kwai.video.ksvodplayerkit.KSVodPlayerWrapper;
import com.kwai.video.ksvodplayerkit.KSVodVideoContext;
import com.kwai.video.player.IKwaiMediaPlayer;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* loaded from: classes5.dex */
public final class d extends com.kwad.sdk.core.video.a.a {
    private static final Queue<d> aCA = new ConcurrentLinkedQueue();
    private static volatile boolean aCz;
    private final String TAG;
    private com.kwad.sdk.contentalliance.a.a.b UD;
    private boolean aCB;
    private String aCq;
    private MediaDataSource aCr;
    private final Object aCs;
    private boolean aCt;
    private final KSVodPlayerWrapper aCv;
    private final a aCw;
    private boolean aCx;
    private boolean aCy;
    private int mSarDen;
    private int mSarNum;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a implements IKSVodPlayer.OnBufferingUpdateListener, IKSVodPlayer.OnErrorListener, IKSVodPlayer.OnEventListener, IKSVodPlayer.OnPreparedListener, IKSVodPlayer.OnVideoSizeChangedListener, IKSVodPlayer.OnVodPlayerReleaseListener {
        final String TAG;
        final WeakReference<d> mWeakMediaPlayer;

        a(d dVar, String str) {
            this.mWeakMediaPlayer = new WeakReference<>(dVar);
            this.TAG = str;
        }

        private d GO() {
            return this.mWeakMediaPlayer.get();
        }

        public final void onBufferingUpdate(int i4) {
            d GO = GO();
            if (GO != null) {
                GO.notifyOnBufferingUpdate(i4);
            }
        }

        public final void onError(int i4, int i5) {
            d GO = GO();
            if (GO != null) {
                d.a(GO, false);
                GO.notifyOnError(i4, i5);
            }
        }

        public final void onEvent(@KSVodConstants.KSVodPlayerEventType int i4, int i5) {
            String str = this.TAG;
            com.kwad.sdk.core.e.c.i(str, "onEvent, what: " + i4);
            try {
                d GO = GO();
                if (GO != null) {
                    if (i4 == 10100) {
                        GO.notifyOnSeekComplete();
                    } else if (i4 == 10101) {
                        GO.notifyOnCompletion();
                    } else {
                        if (i4 == 10209) {
                            GO.GN();
                        }
                        GO.notifyOnInfo(i4, i5);
                    }
                }
            } catch (Throwable th) {
                ServiceProvider.reportSdkCaughtException(th);
            }
        }

        public final void onPlayerRelease() {
            com.kwad.sdk.core.e.c.i(this.TAG, "onPlayerRelease");
        }

        public final void onPrepared() {
            com.kwad.sdk.core.e.c.i(this.TAG, "onPrepared");
            d GO = GO();
            if (GO != null) {
                GO.notifyOnPrepared();
            }
        }

        public final void onVideoSizeChanged(int i4, int i5, int i6, int i7) {
            String str = this.TAG;
            com.kwad.sdk.core.e.c.i(str, "onVideoSizeChanged width: " + i4 + ", height: " + i5 + ", sarNum:" + i6 + ", sarDen:" + i7);
            d GO = GO();
            if (GO != null) {
                GO.w(i4, i5);
                GO.mSarNum = i6;
                GO.mSarDen = i7;
            }
        }
    }

    public d(int i4) {
        Object obj = new Object();
        this.aCs = obj;
        this.aCy = false;
        this.aCB = true;
        synchronized (obj) {
            this.aCv = new KSVodPlayerWrapper(l.ON());
        }
        String str = "KSMediaPlayer[" + i4 + "]";
        this.TAG = str;
        this.aCw = new a(this, str);
        GK();
        setLooping(false);
        com.kwad.sdk.core.e.c.i(str, "create KwaiMediaPlayer");
    }

    private void GI() {
        MediaDataSource mediaDataSource = this.aCr;
        if (mediaDataSource != null) {
            try {
                mediaDataSource.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            this.aCr = null;
        }
    }

    private void GK() {
        this.aCv.setOnPreparedListener(this.aCw);
        this.aCv.setBufferingUpdateListener(this.aCw);
        this.aCv.setOnEventListener(this.aCw);
        this.aCv.setVideoSizeChangedListener(this.aCw);
        this.aCv.setOnErrorListener(this.aCw);
    }

    private void GL() {
        this.aCv.setOnPreparedListener((IKSVodPlayer.OnPreparedListener) null);
        this.aCv.setBufferingUpdateListener((IKSVodPlayer.OnBufferingUpdateListener) null);
        this.aCv.setOnEventListener((IKSVodPlayer.OnEventListener) null);
        this.aCv.setVideoSizeChangedListener((IKSVodPlayer.OnVideoSizeChangedListener) null);
        this.aCv.setOnErrorListener((IKSVodPlayer.OnErrorListener) null);
    }

    private void GM() {
        String str = this.TAG;
        com.kwad.sdk.core.e.c.i(str, "realPrepare hasCallPrepare: " + this.aCy);
        if (this.aCy) {
            return;
        }
        try {
            this.aCy = true;
            int prepareAsync = this.aCv.prepareAsync();
            GH();
            String str2 = this.TAG;
            com.kwad.sdk.core.e.c.i(str2, "realPrepare result: " + prepareAsync);
        } catch (IllegalStateException e5) {
            com.kwad.sdk.core.e.c.e(this.TAG, "realPrepare failed ", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void GN() {
        Iterator<d> it2 = aCA.iterator();
        int i4 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i4 = 0;
                break;
            } else if (it2.next() == this) {
                break;
            } else {
                i4++;
            }
        }
        String str = this.TAG;
        com.kwad.sdk.core.e.c.i(str, "preloadNextPlayer next player index: " + i4);
        int i5 = i4 + 1;
        if (i5 < aCA.size()) {
            com.kwad.sdk.core.e.c.i(this.TAG, "----------------preloadNextPlayer prepare next player----------------");
            for (int i6 = 0; i6 < i5; i6++) {
                aCA.poll();
            }
            Queue<d> queue = aCA;
            d poll = queue.poll();
            queue.clear();
            if (poll != null) {
                poll.prepareAsync();
            } else {
                com.kwad.sdk.core.e.c.i(this.TAG, "----------------preloadNextPlayer prepareAsync next player is null----------------");
            }
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final boolean GJ() {
        com.kwad.sdk.core.e.c.i(this.TAG, "forcePrepareAsync");
        GM();
        return true;
    }

    public final void bn(boolean z4) {
        this.aCB = z4;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final int getAudioSessionId() {
        return this.aCv.getKwaiMediaPlayer().getAudioSessionId();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final String getCurrentPlayingUrl() {
        KSVodPlayerWrapper kSVodPlayerWrapper = this.aCv;
        return kSVodPlayerWrapper == null ? "" : kSVodPlayerWrapper.getCurrentPlayUrl();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final long getCurrentPosition() {
        try {
            return this.aCv.getCurrentPosition();
        } catch (IllegalStateException unused) {
            return 0L;
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final String getDataSource() {
        return this.aCq;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final long getDuration() {
        try {
            return this.aCv.getDuration();
        } catch (IllegalStateException unused) {
            return 0L;
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final int getMediaPlayerType() {
        return 2;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final int getVideoHeight() {
        return this.aCv.getKwaiMediaPlayer().getVideoHeight();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final int getVideoWidth() {
        return this.aCv.getKwaiMediaPlayer().getVideoWidth();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final boolean isLooping() {
        return this.aCx;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final boolean isPlaying() {
        try {
            return this.aCv.isPlaying();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void pause() {
        this.aCv.pause();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final boolean prepareAsync() {
        if (this.aCB) {
            Queue<d> queue = aCA;
            if (!queue.contains(this)) {
                queue.offer(this);
            }
            int size = queue.size();
            if (size == 1) {
                com.kwad.sdk.core.e.c.i(this.TAG, "prepareAsync first");
                GM();
                return true;
            }
            String str = this.TAG;
            com.kwad.sdk.core.e.c.i(str, "prepareAsync pending size: " + size);
            return false;
        }
        GM();
        return true;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void release() {
        Queue<d> queue = aCA;
        boolean remove = queue.remove(this);
        String str = this.TAG;
        com.kwad.sdk.core.e.c.i(str, "release remote player ret: " + remove + ", player list size: " + queue.size());
        this.aCt = true;
        this.aCv.releaseAsync(new IKSVodPlayer.OnVodPlayerReleaseListener() { // from class: com.kwad.sdk.core.video.a.d.1
            public final void onPlayerRelease() {
                com.kwad.sdk.core.e.c.i(d.this.TAG, "onPlayerRelease");
            }
        });
        try {
            GI();
            resetListeners();
            GL();
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void reset() {
        this.aCy = false;
        try {
            IKwaiMediaPlayer kwaiMediaPlayer = this.aCv.getKwaiMediaPlayer();
            if (kwaiMediaPlayer != null) {
                kwaiMediaPlayer.reset();
            }
        } catch (IllegalStateException unused) {
        }
        GI();
        resetListeners();
        GK();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void seekTo(long j4) {
        this.aCv.seekTo((int) j4);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setAudioStreamType(int i4) {
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDataSource(Context context, Uri uri) {
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDataSource(Context context, Uri uri, Map<String, String> map) {
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDataSource(FileDescriptor fileDescriptor) {
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDataSource(String str) {
        setDataSource(str, (Map<String, String>) null);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDisplay(SurfaceHolder surfaceHolder) {
        synchronized (this.aCs) {
            if (!this.aCt) {
                this.aCv.setDisplay(surfaceHolder);
            }
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setLooping(boolean z4) {
        this.aCx = z4;
        this.aCv.setLooping(z4);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setScreenOnWhilePlaying(boolean z4) {
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setSpeed(float f5) {
        this.aCv.setSpeed(f5);
    }

    @Override // com.kwad.sdk.core.video.a.c
    @TargetApi(14)
    public final void setSurface(Surface surface) {
        this.aCv.setSurface(surface);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setVolume(float f5, float f6) {
        this.aCv.setVolume(f5, f6);
        com.kwad.sdk.core.video.a.a.h(f5);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void start() {
        com.kwad.sdk.core.e.c.i(this.TAG, "start");
        this.aCv.start();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void stop() {
        this.aCv.stop();
    }

    private void setDataSource(String str, Map<String, String> map) {
        this.aCq = str;
        this.aCv.setDataSource(str, (Map) null);
    }

    static /* synthetic */ boolean a(d dVar, boolean z4) {
        dVar.aCy = false;
        return false;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void a(@NonNull com.kwad.sdk.contentalliance.a.a.b bVar) {
        this.UD = bVar;
        a(bVar.apW);
        f fVar = (f) ServiceProvider.get(f.class);
        if (!TextUtils.isEmpty(bVar.manifest) && fVar != null && fVar.uf()) {
            setDataSource(bVar.manifest, (Map<String, String>) null);
        } else {
            setDataSource(bVar.videoUrl, (Map<String, String>) null);
        }
    }

    public final void a(com.kwad.sdk.contentalliance.a.a.a aVar) {
        if (this.aCv == null || aVar == null) {
            return;
        }
        KSVodVideoContext kSVodVideoContext = new KSVodVideoContext();
        kSVodVideoContext.mVideoId = String.valueOf(aVar.photoId);
        kSVodVideoContext.mClickTime = aVar.clickTime;
        kSVodVideoContext.mExtra = aVar.BI();
        this.aCv.updateVideoContext(kSVodVideoContext);
    }
}
