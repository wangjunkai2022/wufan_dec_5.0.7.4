package com.kwad.components.core.video;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.response.model.VideoPlayerStatus;
import com.kwad.sdk.core.video.a.c;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.bo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes5.dex */
public final class b {
    private static boolean Uw;
    private static final AtomicInteger Ux = new AtomicInteger(0);
    private final String TAG;
    private int UA;
    private long UB;
    private Runnable UC;
    private com.kwad.sdk.contentalliance.a.a.b UD;
    private int UE;
    private List<c.d> UF;
    private final AtomicBoolean UG;
    private boolean UH;
    private final int UI;
    private volatile List<k> UJ;
    private volatile List<com.kwad.components.core.video.a.c> UK;
    private volatile List<c.e> UL;
    private final c.f UM;
    private c.e UN;
    private c.i UO;
    private c.b UP;
    private c.InterfaceC0528c UQ;
    private c.d UR;
    private c.a US;
    private int Ug;
    private int Uh;
    private volatile int Uy;
    private com.kwad.sdk.core.video.a.c Uz;
    private Handler fS;
    private AdTemplate mAdTemplate;
    private Context mContext;
    private DetailVideoView mDetailVideoView;
    private long mStartTime;

    /* loaded from: classes5.dex */
    public interface a {
        @WorkerThread
        void onReleaseSuccess();
    }

    public b(@Nullable DetailVideoView detailVideoView) {
        this(detailVideoView, 0);
    }

    private void aM(int i4) {
        for (com.kwad.components.core.video.a.c cVar : this.UK) {
            if (i4 == 0) {
                cVar.onStart();
            } else if (i4 == 1) {
                cVar.onReset();
            } else if (i4 == 2) {
                try {
                    cVar.onRelease();
                } catch (Exception e5) {
                    com.kwad.sdk.core.e.c.printStackTrace(e5);
                }
            }
        }
    }

    private void aP(final boolean z4) {
        if (this.Uz == null) {
            return;
        }
        com.kwad.sdk.core.e.c.i(this.TAG, "start prepareAsync");
        if (this.UH) {
            if (this.UG.compareAndSet(false, true)) {
                com.kwad.sdk.utils.g.execute(new az() { // from class: com.kwad.components.core.video.b.10
                    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[Catch: all -> 0x007c, TRY_ENTER, TryCatch #5 {Exception -> 0x007f, blocks: (B:17:0x006a, B:18:0x0070, B:19:0x0071, B:20:0x007a), top: B:34:0x006a }] */
                    @Override // com.kwad.sdk.utils.az
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void doTask() {
                        /*
                            r5 = this;
                            com.kwad.components.core.video.b r0 = com.kwad.components.core.video.b.this
                            java.lang.String r0 = com.kwad.components.core.video.b.c(r0)
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            java.lang.String r2 = "prepareAsync now:"
                            r1.<init>(r2)
                            com.kwad.components.core.video.b r2 = com.kwad.components.core.video.b.this
                            int r2 = com.kwad.components.core.video.b.b(r2)
                            java.lang.String r2 = com.kwad.components.core.video.b.getStateString(r2)
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            com.kwad.sdk.core.e.c.i(r0, r1)
                            com.kwad.components.core.video.b r0 = com.kwad.components.core.video.b.this
                            com.kwad.sdk.core.video.a.c r0 = com.kwad.components.core.video.b.e(r0)
                            if (r0 != 0) goto L2a
                            return
                        L2a:
                            r0 = 0
                            com.kwad.components.core.video.b r1 = com.kwad.components.core.video.b.this     // Catch: java.lang.Throwable -> L47
                            com.kwad.sdk.core.video.a.c r1 = com.kwad.components.core.video.b.e(r1)     // Catch: java.lang.Throwable -> L47
                            monitor-enter(r1)     // Catch: java.lang.Throwable -> L47
                            com.kwad.components.core.video.b r2 = com.kwad.components.core.video.b.this     // Catch: java.lang.Throwable -> L44
                            boolean r3 = r2     // Catch: java.lang.Throwable -> L44
                            com.kwad.components.core.video.b.a(r2, r3)     // Catch: java.lang.Throwable -> L44
                            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
                        L3a:
                            com.kwad.components.core.video.b r1 = com.kwad.components.core.video.b.this
                            java.util.concurrent.atomic.AtomicBoolean r1 = com.kwad.components.core.video.b.h(r1)
                            r1.set(r0)
                            goto L6a
                        L44:
                            r2 = move-exception
                            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
                            throw r2     // Catch: java.lang.Throwable -> L47
                        L47:
                            r1 = move-exception
                            com.kwad.components.core.video.b r2 = com.kwad.components.core.video.b.this     // Catch: java.lang.Throwable -> L84
                            java.lang.String r2 = com.kwad.components.core.video.b.c(r2)     // Catch: java.lang.Throwable -> L84
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
                            java.lang.String r4 = "prepareAsync Exception:"
                            r3.<init>(r4)     // Catch: java.lang.Throwable -> L84
                            com.kwad.components.core.video.b r4 = com.kwad.components.core.video.b.this     // Catch: java.lang.Throwable -> L84
                            int r4 = com.kwad.components.core.video.b.b(r4)     // Catch: java.lang.Throwable -> L84
                            java.lang.String r4 = com.kwad.components.core.video.b.getStateString(r4)     // Catch: java.lang.Throwable -> L84
                            r3.append(r4)     // Catch: java.lang.Throwable -> L84
                            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L84
                            com.kwad.sdk.core.e.c.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L84
                            goto L3a
                        L6a:
                            com.kwad.components.core.video.b r0 = com.kwad.components.core.video.b.this     // Catch: java.lang.Exception -> L7f
                            java.util.concurrent.atomic.AtomicBoolean r0 = com.kwad.components.core.video.b.h(r0)     // Catch: java.lang.Exception -> L7f
                            monitor-enter(r0)     // Catch: java.lang.Exception -> L7f
                            com.kwad.components.core.video.b r1 = com.kwad.components.core.video.b.this     // Catch: java.lang.Throwable -> L7c
                            java.util.concurrent.atomic.AtomicBoolean r1 = com.kwad.components.core.video.b.h(r1)     // Catch: java.lang.Throwable -> L7c
                            r1.notifyAll()     // Catch: java.lang.Throwable -> L7c
                            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7c
                            goto L83
                        L7c:
                            r1 = move-exception
                            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7c
                            throw r1     // Catch: java.lang.Exception -> L7f
                        L7f:
                            r0 = move-exception
                            com.kwad.sdk.core.e.c.printStackTrace(r0)
                        L83:
                            return
                        L84:
                            r1 = move-exception
                            com.kwad.components.core.video.b r2 = com.kwad.components.core.video.b.this
                            java.util.concurrent.atomic.AtomicBoolean r2 = com.kwad.components.core.video.b.h(r2)
                            r2.set(r0)
                            goto L90
                        L8f:
                            throw r1
                        L90:
                            goto L8f
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.core.video.b.AnonymousClass10.doTask():void");
                    }
                });
                return;
            }
            return;
        }
        try {
            aQ(z4);
        } catch (Throwable th) {
            if (getMediaPlayerType() != 2) {
                int i4 = this.UE;
                this.UE = i4 + 1;
                if (i4 <= 4) {
                    rZ();
                }
            }
            String str = this.TAG;
            com.kwad.sdk.core.e.c.i(str, "prepareAsync Exception:" + getStateString(this.Uy));
            com.kwad.sdk.core.e.c.printStackTrace(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aQ(boolean z4) {
        boolean prepareAsync;
        a(this.UD);
        if (z4) {
            prepareAsync = this.Uz.GJ();
        } else {
            prepareAsync = this.Uz.prepareAsync();
        }
        String str = this.TAG;
        com.kwad.sdk.core.e.c.i(str, "prepareAsync forcePrepare: " + z4 + ", result: " + prepareAsync);
    }

    public static String getStateString(int i4) {
        switch (i4) {
            case -1:
                return "STATE_ERROR";
            case 0:
                return "STATE_IDLE";
            case 1:
                return "STATE_PREPARING";
            case 2:
                return "STATE_PREPARED";
            case 3:
                return "STATE_STARTED";
            case 4:
                return "STATE_PLAYING";
            case 5:
                return "STATE_PAUSED";
            case 6:
                return "STATE_BUFFERING_PLAYING";
            case 7:
                return "STATE_BUFFERING_PAUSED";
            case 8:
                return "PLAYER_STATE_STOPPED";
            case 9:
                return "STATE_COMPLETED";
            default:
                return "STATE_UNKNOWN";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rU() {
        long currentPosition = getCurrentPosition();
        long duration = getDuration();
        if (this.UJ != null) {
            for (k kVar : this.UJ) {
                kVar.onMediaPlayProgress(duration, currentPosition);
            }
        }
    }

    private void rX() {
        this.Uz.a(this.UM);
        this.Uz.b(this.UN);
        this.Uz.a(this.UO);
        this.Uz.a(this.UP);
        this.Uz.a(this.UQ);
        this.Uz.c(this.UR);
        this.Uz.a(this.US);
    }

    private void rY() {
        com.kwad.sdk.core.video.a.c cVar = this.Uz;
        if (cVar == null) {
            return;
        }
        cVar.a((c.InterfaceC0528c) null);
        this.Uz.a((c.b) null);
        this.Uz.b(null);
        this.Uz.a((c.i) null);
        this.Uz.c(null);
        this.Uz.a((c.g) null);
        this.Uz.a((c.a) null);
    }

    private void reset() {
        String str = this.TAG;
        com.kwad.sdk.core.e.c.i(str, "reset:" + getStateString(this.Uy) + "->STATE_IDLE");
        aM(1);
        this.Uz.reset();
        this.Uy = 0;
    }

    private void sa() {
        sb();
        if (this.UC == null) {
            this.UC = new az() { // from class: com.kwad.components.core.video.b.3
                @Override // com.kwad.sdk.utils.az
                public final void doTask() {
                    b.this.rU();
                    if (b.this.UC != null) {
                        b.this.fS.postDelayed(b.this.UC, 500L);
                    }
                }
            };
        }
        this.fS.post(this.UC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sb() {
        Runnable runnable = this.UC;
        if (runnable != null) {
            this.fS.removeCallbacks(runnable);
            this.UC = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeepScreenOn(boolean z4) {
        DetailVideoView detailVideoView = this.mDetailVideoView;
        if (detailVideoView != null) {
            detailVideoView.setKeepScreenOn(z4);
        }
    }

    private void setPlayType(int i4) {
        VideoPlayerStatus videoPlayerStatus;
        com.kwad.sdk.contentalliance.a.a.b bVar = this.UD;
        if (bVar == null || (videoPlayerStatus = bVar.videoPlayerStatus) == null) {
            return;
        }
        videoPlayerStatus.mVideoPlayerType = i4;
    }

    public final void clear() {
        this.UJ.clear();
        this.UK.clear();
    }

    public final int getBufferPercentage() {
        return this.UA;
    }

    public final String getCurrentPlayingUrl() {
        com.kwad.sdk.core.video.a.c cVar = this.Uz;
        return cVar == null ? "" : cVar.getCurrentPlayingUrl();
    }

    public final long getCurrentPosition() {
        com.kwad.sdk.core.video.a.c cVar = this.Uz;
        if (cVar != null) {
            return cVar.getCurrentPosition();
        }
        return 0L;
    }

    public final long getDuration() {
        com.kwad.sdk.core.video.a.c cVar = this.Uz;
        if (cVar != null) {
            return cVar.getDuration();
        }
        return 0L;
    }

    public final int getMediaPlayerType() {
        com.kwad.sdk.core.video.a.c cVar = this.Uz;
        if (cVar != null) {
            return cVar.getMediaPlayerType();
        }
        return 0;
    }

    public final long getPlayDuration() {
        com.kwad.sdk.core.video.a.c cVar = this.Uz;
        if (cVar != null) {
            return cVar.getCurrentPosition();
        }
        return 0L;
    }

    public final int getVideoHeight() {
        com.kwad.sdk.core.video.a.c cVar = this.Uz;
        if (cVar != null) {
            return cVar.getVideoHeight();
        }
        return 0;
    }

    public final int getVideoWidth() {
        com.kwad.sdk.core.video.a.c cVar = this.Uz;
        if (cVar != null) {
            return cVar.getVideoWidth();
        }
        return 0;
    }

    public final boolean isPlaying() {
        com.kwad.sdk.core.video.a.c cVar = this.Uz;
        if (cVar != null) {
            return cVar.isPlaying();
        }
        return false;
    }

    @Deprecated
    public final boolean isPrepared() {
        return this.Uy == 2 || this.Uy == 3 || this.Uy == 5 || this.Uy == 8 || this.Uy == 9;
    }

    @Deprecated
    public final boolean isPreparing() {
        return this.Uy == 1;
    }

    public final void onPlayStateChanged(final int i4) {
        if (this.UJ == null) {
            return;
        }
        bo.runOnUiThread(new az() { // from class: com.kwad.components.core.video.b.2
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                for (k kVar : b.this.UJ) {
                    switch (i4) {
                        case -1:
                            b.this.setKeepScreenOn(false);
                            b.this.sb();
                            kVar.onMediaPlayError(b.this.Ug, b.this.Uh);
                            break;
                        case 1:
                            kVar.onMediaPreparing();
                            break;
                        case 2:
                            kVar.onMediaPrepared();
                            break;
                        case 3:
                            b.this.setKeepScreenOn(true);
                            kVar.onMediaPlayStart();
                            break;
                        case 4:
                            b.this.setKeepScreenOn(true);
                            kVar.onMediaPlaying();
                            break;
                        case 5:
                            b.this.setKeepScreenOn(false);
                            kVar.onMediaPlayPaused();
                            break;
                        case 6:
                            kVar.onVideoPlayBufferingPlaying();
                            break;
                        case 7:
                            kVar.onVideoPlayBufferingPaused();
                            break;
                        case 9:
                            if (b.this.Uz != null && !b.this.Uz.isLooping()) {
                                b.this.setKeepScreenOn(false);
                                b.this.sb();
                            }
                            kVar.onMediaPlayCompleted();
                            break;
                    }
                }
            }
        });
    }

    public final boolean pause() {
        boolean z4;
        String str = this.TAG;
        com.kwad.sdk.core.e.c.i(str, "pause mCurrentState: " + getStateString(this.Uy));
        if (this.Uy == 4) {
            this.Uz.pause();
            com.kwad.sdk.core.e.c.i(this.TAG, "pause STATE_PLAYING->STATE_PAUSED");
            this.Uy = 5;
            onPlayStateChanged(this.Uy);
            com.kwad.sdk.core.video.a.a.a.eF("videoPausePlay");
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.Uy == 6) {
            this.Uz.pause();
            com.kwad.sdk.core.e.c.i(this.TAG, "pause STATE_BUFFERING_PLAYING->STATE_PAUSED");
            this.Uy = 7;
            onPlayStateChanged(this.Uy);
            z4 = true;
        }
        if (this.Uy == 3) {
            this.Uz.pause();
            com.kwad.sdk.core.e.c.i(this.TAG, "pause STATE_STARTED->STATE_PAUSED");
            this.Uy = 5;
            onPlayStateChanged(this.Uy);
            com.kwad.sdk.core.video.a.a.a.eF("videoPausePlay");
            z4 = true;
        }
        if (this.Uy == 9 && this.Uz.isLooping()) {
            this.Uz.pause();
            String str2 = this.TAG;
            com.kwad.sdk.core.e.c.i(str2, "pause " + getStateString(this.Uy) + "->STATE_PAUSED");
            this.Uy = 5;
            onPlayStateChanged(this.Uy);
            return true;
        }
        return z4;
    }

    public final void prepareAsync() {
        aP(false);
    }

    public final com.kwad.sdk.core.video.a.c rW() {
        return this.Uz;
    }

    public final void rZ() {
        if (this.Uz == null) {
            com.kwad.sdk.core.e.c.w("resetAndPlay", "mMediaPlayer is null");
        } else if (this.Uy != 2 && this.Uy != 3 && this.Uy != 4 && this.Uy != 5) {
            reset();
            rY();
            rX();
            prepareAsync();
        } else {
            com.kwad.sdk.core.e.c.w("resetAndPlay", "can not resetAndPlay in state:");
        }
    }

    public final void release() {
        a((a) null);
    }

    public final void releaseAsync() {
        a((a) null, true);
    }

    public final void restart() {
        if (this.Uz != null && this.Uy == 9) {
            start();
        }
        setPlayType(3);
    }

    public final void resume() {
        try {
            if (this.Uz == null) {
                com.kwad.sdk.core.e.c.e(this.TAG, "resume but mMediaPlayer is null");
                return;
            }
            String str = this.TAG;
            com.kwad.sdk.core.e.c.i(str, "resume state: " + getStateString(this.Uy));
            if (this.Uy != 2 && this.Uy != 3 && this.Uy != 0) {
                if (this.Uy == 5) {
                    this.Uz.start();
                    String str2 = this.TAG;
                    com.kwad.sdk.core.e.c.i(str2, "resume:" + getStateString(this.Uy) + "->STATE_PLAYING");
                    this.Uy = 4;
                    onPlayStateChanged(this.Uy);
                    setPlayType(2);
                    com.kwad.sdk.core.video.a.a.a.eF("videoResumePlay");
                    return;
                } else if (this.Uy == 7) {
                    this.Uz.start();
                    String str3 = this.TAG;
                    com.kwad.sdk.core.e.c.i(str3, "resume:" + getStateString(this.Uy) + "->STATE_BUFFERING_PLAYING");
                    this.Uy = 6;
                    onPlayStateChanged(this.Uy);
                    return;
                } else if (this.Uy != 1) {
                    String str4 = this.TAG;
                    com.kwad.sdk.core.e.c.w(str4, "resume: " + getStateString(this.Uy) + " 此时不能调用resume()方法.");
                    return;
                } else {
                    return;
                }
            }
            String str5 = this.TAG;
            com.kwad.sdk.core.e.c.i(str5, "resume:" + getStateString(this.Uy) + "->start()");
            start();
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public final void seekTo(long j4) {
        com.kwad.sdk.core.video.a.c cVar = this.Uz;
        if (cVar != null) {
            cVar.seekTo(j4);
        }
    }

    public final void setAudioEnabled(boolean z4) {
        if (z4) {
            setVolume(1.0f, 1.0f);
        } else {
            setVolume(0.0f, 0.0f);
        }
    }

    public final void setRadius(float f5, float f6, float f7, float f8) {
        this.mDetailVideoView.setRadius(f5, f6, f7, f8);
    }

    public final void setSpeed(float f5) {
        com.kwad.sdk.core.video.a.c cVar = this.Uz;
        if (cVar == null) {
            return;
        }
        cVar.setSpeed(f5);
    }

    public final void setSurface(Surface surface) {
        com.kwad.sdk.core.video.a.c cVar = this.Uz;
        if (cVar != null) {
            cVar.setSurface(surface);
        }
    }

    public final void setVolume(float f5, float f6) {
        com.kwad.sdk.core.video.a.c cVar = this.Uz;
        if (cVar == null) {
            return;
        }
        try {
            cVar.setVolume(f5, f6);
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
    }

    public final void start() {
        try {
            if (this.Uz == null) {
                return;
            }
            String str = this.TAG;
            com.kwad.sdk.core.e.c.i(str, "start state: " + getStateString(this.Uy));
            aM(0);
            if (this.Uy == 0) {
                com.kwad.sdk.core.e.c.i(this.TAG, "start still not prepared well forcePrepare");
                aP(true);
                return;
            }
            if (this.Uy != 2 && this.Uy != 9) {
                if (this.Uy == 3) {
                    this.Uz.start();
                    return;
                }
                return;
            }
            this.mStartTime = System.currentTimeMillis();
            this.Uz.start();
            com.kwad.sdk.core.video.a.a.a.eF("videoStartPlay");
            long j4 = this.UB;
            if (j4 != 0) {
                this.Uz.seekTo((int) j4);
            }
            String str2 = this.TAG;
            com.kwad.sdk.core.e.c.i(str2, "start:" + getStateString(this.Uy) + "->STATE_STARTED");
            com.kwad.sdk.contentalliance.a.a.b bVar = this.UD;
            if (bVar != null && bVar.videoPlayerStatus != null) {
                if (this.Uy == 2) {
                    if (this.UD.videoPlayerStatus.mVideoPlayerType == 0) {
                        setPlayType(1);
                    } else {
                        setPlayType(3);
                    }
                } else if (this.Uy == 9) {
                    setPlayType(3);
                }
            }
            this.Uy = 3;
            onPlayStateChanged(this.Uy);
            sa();
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public final void stopAndPrepareAsync() {
        String str = this.TAG;
        com.kwad.sdk.core.e.c.i(str, "stopAndPrepareAsync state: " + getStateString(this.Uy));
        if (this.Uy == 1 || this.Uy == 2) {
            return;
        }
        if (this.Uy == 3 || this.Uy == 4 || this.Uy == 5 || this.Uy == 6 || this.Uy == 7 || this.Uy == 8 || this.Uy == 9) {
            try {
                this.Uz.stop();
                this.Uy = 8;
                onPlayStateChanged(this.Uy);
                prepareAsync();
                return;
            } catch (Exception unused) {
            }
        }
        release();
    }

    private b(@Nullable DetailVideoView detailVideoView, int i4) {
        this.Uy = 0;
        this.fS = new Handler(Looper.getMainLooper());
        this.mStartTime = 0L;
        this.UE = 0;
        this.UF = new CopyOnWriteArrayList();
        this.UG = new AtomicBoolean(false);
        this.UH = false;
        this.UJ = new CopyOnWriteArrayList();
        this.UK = new CopyOnWriteArrayList();
        this.UL = new CopyOnWriteArrayList();
        this.UM = new c.f() { // from class: com.kwad.components.core.video.b.1
            @Override // com.kwad.sdk.core.video.a.c.f
            public final void sc() {
                b.this.Uy = 1;
                b bVar = b.this;
                bVar.onPlayStateChanged(bVar.Uy);
            }
        };
        this.UN = new c.e() { // from class: com.kwad.components.core.video.b.4
            @Override // com.kwad.sdk.core.video.a.c.e
            public final void a(com.kwad.sdk.core.video.a.c cVar) {
                try {
                    String str = b.this.TAG;
                    com.kwad.sdk.core.e.c.i(str, "onPrepared:" + b.getStateString(b.this.Uy) + "->STATE_PREPARED");
                    b.this.Uy = 2;
                    b bVar = b.this;
                    bVar.onPlayStateChanged(bVar.Uy);
                    for (c.e eVar : b.this.UL) {
                        eVar.a(b.this.Uz);
                    }
                } catch (Throwable th) {
                    ServiceProvider.reportSdkCaughtException(th);
                }
            }
        };
        this.UO = new c.i() { // from class: com.kwad.components.core.video.b.5
            @Override // com.kwad.sdk.core.video.a.c.i
            public final void k(int i5, int i6) {
                if (b.this.mDetailVideoView != null) {
                    b.this.mDetailVideoView.adaptVideoSize(i5, i6);
                }
                String str = b.this.TAG;
                com.kwad.sdk.core.e.c.i(str, "onVideoSizeChanged ——> width：" + i5 + "， height：" + i6);
            }
        };
        this.UP = new c.b() { // from class: com.kwad.components.core.video.b.6
            @Override // com.kwad.sdk.core.video.a.c.b
            public final void py() {
                b.this.Uy = 9;
                b bVar = b.this;
                bVar.onPlayStateChanged(bVar.Uy);
                com.kwad.sdk.core.video.a.a.a.eF("videoFinishPlay");
            }
        };
        this.UQ = new c.InterfaceC0528c() { // from class: com.kwad.components.core.video.b.7
            @Override // com.kwad.sdk.core.video.a.c.InterfaceC0528c
            public final boolean l(int i5, int i6) {
                if (i5 != -38) {
                    b.this.Uy = -1;
                    b.this.Ug = i5;
                    b.this.Uh = i6;
                    b bVar = b.this;
                    bVar.onPlayStateChanged(bVar.Uy);
                    String str = b.this.TAG;
                    com.kwad.sdk.core.e.c.i(str, "onError ——> STATE_ERROR ———— what：" + i5 + ", extra: " + i6);
                    return true;
                }
                return true;
            }
        };
        this.UR = new c.d() { // from class: com.kwad.components.core.video.b.8
            @Override // com.kwad.sdk.core.video.a.c.d
            public final boolean m(int i5, int i6) {
                if (i5 == 3) {
                    b.this.Uy = 4;
                    b bVar = b.this;
                    bVar.onPlayStateChanged(bVar.Uy);
                    String str = b.this.TAG;
                    com.kwad.sdk.core.e.c.i(str, "onInfo:" + b.getStateString(b.this.Uy) + "->STATE_PLAYING, time: " + (System.currentTimeMillis() - b.this.mStartTime));
                } else if (i5 == 701) {
                    if (b.this.Uy == 5 || b.this.Uy == 7) {
                        b.this.Uy = 7;
                        com.kwad.sdk.core.e.c.i(b.this.TAG, "onInfo ——> MEDIA_INFO_BUFFERING_START：STATE_BUFFERING_PAUSED");
                    } else {
                        b.this.Uy = 6;
                        com.kwad.sdk.core.e.c.i(b.this.TAG, "onInfo ——> MEDIA_INFO_BUFFERING_START：STATE_BUFFERING_PLAYING");
                    }
                    b bVar2 = b.this;
                    bVar2.onPlayStateChanged(bVar2.Uy);
                } else if (i5 == 702) {
                    if (b.this.Uy == 6) {
                        b.this.Uy = 4;
                        b bVar3 = b.this;
                        bVar3.onPlayStateChanged(bVar3.Uy);
                        com.kwad.sdk.core.e.c.i(b.this.TAG, "onInfo ——> MEDIA_INFO_BUFFERING_END： STATE_PLAYING");
                    }
                    if (b.this.Uy == 7) {
                        b.this.Uy = 5;
                        b bVar4 = b.this;
                        bVar4.onPlayStateChanged(bVar4.Uy);
                        com.kwad.sdk.core.e.c.i(b.this.TAG, "onInfo ——> MEDIA_INFO_BUFFERING_END： STATE_PAUSED");
                    }
                } else if (i5 != 10001) {
                    if (i5 == 801) {
                        com.kwad.sdk.core.e.c.i(b.this.TAG, "视频不能seekTo，为直播视频");
                    } else {
                        String str2 = b.this.TAG;
                        com.kwad.sdk.core.e.c.i(str2, "onInfo ——> what：" + i5);
                    }
                }
                b bVar5 = b.this;
                bVar5.a(bVar5.Uz, i5, i6);
                return true;
            }
        };
        this.US = new c.a() { // from class: com.kwad.components.core.video.b.9
            @Override // com.kwad.sdk.core.video.a.c.a
            public final void av(int i5) {
                b.this.UA = i5;
            }
        };
        this.mDetailVideoView = detailVideoView;
        if (detailVideoView != null) {
            this.mContext = detailVideoView.getContext().getApplicationContext();
        }
        this.UI = 0;
        String str = "DetailMediaPlayerImpl[0]";
        this.TAG = str;
        com.kwad.sdk.core.e.c.i(str, "create DetailMediaPlayerImpl");
    }

    public final void c(k kVar) {
        this.UJ.add(kVar);
    }

    public final void d(k kVar) {
        this.UJ.remove(kVar);
    }

    public final void a(@NonNull com.kwad.sdk.contentalliance.a.a.b bVar, @NonNull DetailVideoView detailVideoView) {
        a(bVar, true, false, detailVideoView);
    }

    public final void b(c.d dVar) {
        if (dVar == null) {
            return;
        }
        this.UF.remove(dVar);
    }

    public final void a(@NonNull com.kwad.sdk.contentalliance.a.a.b bVar, boolean z4, boolean z5, @NonNull DetailVideoView detailVideoView) {
        String str = this.TAG;
        com.kwad.sdk.core.e.c.i(str, "initMediaPlayer enablePreLoad:" + z4);
        if (bVar == null || detailVideoView == null) {
            return;
        }
        com.kwad.sdk.core.video.a.c a5 = com.kwad.sdk.core.video.a.e.a(this.mContext, z4, com.kwad.sdk.core.config.d.yT(), com.kwad.sdk.core.config.d.yU(), this.UI);
        a5.setLooping(false);
        a(bVar, z5, detailVideoView, a5);
    }

    private void a(@NonNull com.kwad.sdk.contentalliance.a.a.b bVar, boolean z4, @NonNull DetailVideoView detailVideoView, @NonNull com.kwad.sdk.core.video.a.c cVar) {
        String str = this.TAG;
        com.kwad.sdk.core.e.c.i(str, "initMediaPlayer " + this.Uz);
        if (bVar == null || detailVideoView == null || cVar == null) {
            return;
        }
        if (this.mContext == null) {
            this.mContext = detailVideoView.getContext().getApplicationContext();
        }
        this.UH = z4;
        this.UD = bVar;
        com.kwad.components.core.video.a.a a5 = com.kwad.components.core.video.a.d.a(bVar.adTemplate, this.mAdTemplate, bVar.videoUrl);
        c(a5);
        a(a5);
        DetailVideoView detailVideoView2 = this.mDetailVideoView;
        if (detailVideoView2 != detailVideoView) {
            com.kwad.sdk.core.e.c.i(this.TAG, "initMediaPlayer videoView changed");
            if (detailVideoView2 != null) {
                detailVideoView2.setMediaPlayer(null);
                detailVideoView.setKeepScreenOn(detailVideoView2.getKeepScreenOn());
                detailVideoView2.setKeepScreenOn(false);
            }
            this.mDetailVideoView = detailVideoView;
        }
        detailVideoView.setMediaPlayer(this);
        if (this.Uz != cVar) {
            com.kwad.sdk.core.e.c.i(this.TAG, "initMediaPlayer mediaPlayer changed");
            com.kwad.sdk.core.video.a.c cVar2 = this.Uz;
            if (cVar2 != null) {
                cVar.setLooping(cVar2.isLooping());
                rY();
                this.Uz.release();
            }
            this.Uz = cVar;
            reset();
            rX();
            cVar.setAudioStreamType(3);
        } else {
            com.kwad.sdk.core.e.c.i(this.TAG, "initMediaPlayer mediaPlayer not changed");
            reset();
            rY();
            rX();
        }
        this.Uz.setSurface(detailVideoView.Vb);
    }

    public b(@Nullable DetailVideoView detailVideoView, @NonNull AdTemplate adTemplate) {
        this(detailVideoView);
        this.mAdTemplate = adTemplate;
    }

    public final void start(long j4) {
        this.UB = j4;
        start();
    }

    public final void a(c.e eVar) {
        this.UL.add(eVar);
    }

    public final void a(c.d dVar) {
        if (dVar == null) {
            return;
        }
        this.UF.add(dVar);
    }

    public final void a(com.kwad.sdk.core.video.a.c cVar, int i4, int i5) {
        Iterator<c.d> it2 = this.UF.iterator();
        while (it2.hasNext()) {
            c.d next = it2.next();
            if (next == null) {
                it2.remove();
            } else {
                next.m(i4, i5);
            }
        }
    }

    public final void a(@NonNull com.kwad.sdk.contentalliance.a.a.b bVar) {
        try {
            if (!TextUtils.isEmpty(bVar.videoUrl)) {
                String str = this.TAG;
                com.kwad.sdk.core.e.c.d(str, "videoUrl=" + bVar.videoUrl);
                this.Uz.a(bVar);
                return;
            }
            com.kwad.sdk.core.e.c.e(this.TAG, "videoUrl is null");
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
        }
    }

    public final void a(final a aVar, boolean z4) {
        if (this.Uz == null) {
            return;
        }
        String str = this.TAG;
        com.kwad.sdk.core.e.c.i(str, "release:" + getStateString(this.Uy) + "->STATE_IDLE");
        setKeepScreenOn(false);
        this.fS.removeCallbacksAndMessages(null);
        sb();
        rY();
        this.mDetailVideoView = null;
        final com.kwad.sdk.core.video.a.c cVar = this.Uz;
        if (cVar != null) {
            if (z4) {
                com.kwad.sdk.utils.g.execute(new az() { // from class: com.kwad.components.core.video.b.11
                    @Override // com.kwad.sdk.utils.az
                    public final void doTask() {
                        b.this.a(cVar, aVar);
                    }
                });
            } else {
                a(cVar, aVar);
            }
            this.Uz = null;
        }
        this.Uy = 0;
        this.UE = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.kwad.sdk.core.video.a.c cVar, a aVar) {
        if (cVar == null) {
            return;
        }
        String str = this.TAG;
        com.kwad.sdk.core.e.c.i(str, "releaseMediaPlayer:" + getStateString(this.Uy) + "->STATE_IDLE");
        try {
            aM(2);
            cVar.release();
            if (aVar != null) {
                aVar.onReleaseSuccess();
            }
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTrace(th);
        }
    }

    public final void a(a aVar) {
        a(aVar, true);
    }

    private void a(com.kwad.components.core.video.a.c cVar) {
        this.UK.add(cVar);
    }

    public final void a(com.kwad.sdk.contentalliance.a.a.a aVar) {
        com.kwad.sdk.core.video.a.c cVar = this.Uz;
        if (cVar instanceof com.kwad.sdk.core.video.a.d) {
            ((com.kwad.sdk.core.video.a.d) cVar).a(aVar);
        }
    }
}
