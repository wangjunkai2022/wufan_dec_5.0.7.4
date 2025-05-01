package com.papa.gsyvideoplayer.player;

import android.content.Context;
import android.media.PlaybackParams;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.view.Surface;
import java.util.List;
import tv.danmaku.ijk.media.player.AndroidMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer;
/* compiled from: SystemPlayerManager.java */
/* loaded from: classes5.dex */
public class f extends a {

    /* renamed from: b  reason: collision with root package name */
    private Context f58273b;

    /* renamed from: c  reason: collision with root package name */
    private AndroidMediaPlayer f58274c;

    /* renamed from: d  reason: collision with root package name */
    private Surface f58275d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f58276e;

    /* renamed from: f  reason: collision with root package name */
    private long f58277f = 0;

    /* renamed from: g  reason: collision with root package name */
    private long f58278g = 0;

    /* renamed from: h  reason: collision with root package name */
    private boolean f58279h = false;

    private long m(Context context) {
        if (context == null) {
            return 0L;
        }
        long totalRxBytes = TrafficStats.getUidRxBytes(context.getApplicationInfo().uid) == -1 ? 0L : TrafficStats.getTotalRxBytes() / 1024;
        long currentTimeMillis = System.currentTimeMillis();
        long j4 = currentTimeMillis - this.f58278g;
        if (j4 == 0) {
            return j4;
        }
        long j5 = ((totalRxBytes - this.f58277f) * 1000) / j4;
        this.f58278g = currentTimeMillis;
        this.f58277f = totalRxBytes;
        return j5;
    }

    private void n(float f5) {
        AndroidMediaPlayer androidMediaPlayer;
        if (this.f58276e || (androidMediaPlayer = this.f58274c) == null || androidMediaPlayer.getInternalMediaPlayer() == null || !this.f58274c.isPlayable()) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                PlaybackParams playbackParams = new PlaybackParams();
                playbackParams.setSpeed(f5);
                this.f58274c.getInternalMediaPlayer().setPlaybackParams(playbackParams);
            } else {
                com.papa.gsyvideoplayer.utils.c.e(" not support setSpeed");
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public int b() {
        return -1;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void c(float f5, boolean z4) {
        n(f5);
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public boolean d() {
        return false;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void f(float f5, boolean z4) {
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public long getCurrentPosition() {
        AndroidMediaPlayer androidMediaPlayer = this.f58274c;
        if (androidMediaPlayer != null) {
            return androidMediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public long getDuration() {
        AndroidMediaPlayer androidMediaPlayer = this.f58274c;
        if (androidMediaPlayer != null) {
            return androidMediaPlayer.getDuration();
        }
        return 0L;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public IMediaPlayer getMediaPlayer() {
        return this.f58274c;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public int getVideoHeight() {
        AndroidMediaPlayer androidMediaPlayer = this.f58274c;
        if (androidMediaPlayer != null) {
            return androidMediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public int getVideoSarDen() {
        AndroidMediaPlayer androidMediaPlayer = this.f58274c;
        if (androidMediaPlayer != null) {
            return androidMediaPlayer.getVideoSarDen();
        }
        return 1;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public int getVideoSarNum() {
        AndroidMediaPlayer androidMediaPlayer = this.f58274c;
        if (androidMediaPlayer != null) {
            return androidMediaPlayer.getVideoSarNum();
        }
        return 1;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public int getVideoWidth() {
        AndroidMediaPlayer androidMediaPlayer = this.f58274c;
        if (androidMediaPlayer != null) {
            return androidMediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public long h() {
        if (this.f58274c != null) {
            return m(this.f58273b);
        }
        return 0L;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void i(Context context, Message message, List<com.papa.gsyvideoplayer.model.c> list, com.papa.gsyvideoplayer.cache.b bVar) {
        this.f58273b = context.getApplicationContext();
        AndroidMediaPlayer androidMediaPlayer = new AndroidMediaPlayer();
        this.f58274c = androidMediaPlayer;
        androidMediaPlayer.setAudioStreamType(3);
        this.f58276e = false;
        com.papa.gsyvideoplayer.model.a aVar = (com.papa.gsyvideoplayer.model.a) message.obj;
        try {
            if (aVar.f() && bVar != null) {
                bVar.h(context, this.f58274c, aVar.e(), aVar.b(), aVar.a());
            } else {
                this.f58274c.setDataSource(context, Uri.parse(aVar.e()), aVar.b());
            }
            this.f58274c.setLooping(aVar.g());
            if (aVar.d() != 1.0f && aVar.d() > 0.0f) {
                n(aVar.d());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        e(aVar);
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public boolean isPlaying() {
        AndroidMediaPlayer androidMediaPlayer = this.f58274c;
        if (androidMediaPlayer != null) {
            return androidMediaPlayer.isPlaying();
        }
        return false;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void j(boolean z4) {
        try {
            AndroidMediaPlayer androidMediaPlayer = this.f58274c;
            if (androidMediaPlayer != null && !this.f58276e) {
                if (z4) {
                    androidMediaPlayer.setVolume(0.0f, 0.0f);
                } else {
                    androidMediaPlayer.setVolume(1.0f, 1.0f);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void k(Message message) {
        AndroidMediaPlayer androidMediaPlayer;
        Object obj = message.obj;
        if (obj == null && (androidMediaPlayer = this.f58274c) != null && !this.f58276e) {
            androidMediaPlayer.setSurface(null);
        } else if (obj != null) {
            Surface surface = (Surface) obj;
            this.f58275d = surface;
            if (this.f58274c != null && surface.isValid() && !this.f58276e) {
                this.f58274c.setSurface(surface);
            }
            if (this.f58279h) {
                return;
            }
            pause();
        }
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void l() {
        if (this.f58275d != null) {
            this.f58275d = null;
        }
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void pause() {
        AndroidMediaPlayer androidMediaPlayer = this.f58274c;
        if (androidMediaPlayer != null) {
            androidMediaPlayer.pause();
            this.f58279h = false;
        }
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void release() {
        AndroidMediaPlayer androidMediaPlayer = this.f58274c;
        if (androidMediaPlayer != null) {
            this.f58276e = true;
            androidMediaPlayer.release();
        }
        this.f58277f = 0L;
        this.f58278g = 0L;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void seekTo(long j4) {
        AndroidMediaPlayer androidMediaPlayer = this.f58274c;
        if (androidMediaPlayer != null) {
            androidMediaPlayer.seekTo(j4);
        }
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void start() {
        AndroidMediaPlayer androidMediaPlayer = this.f58274c;
        if (androidMediaPlayer != null) {
            androidMediaPlayer.start();
            this.f58279h = true;
        }
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void stop() {
        AndroidMediaPlayer androidMediaPlayer = this.f58274c;
        if (androidMediaPlayer != null) {
            androidMediaPlayer.stop();
            this.f58279h = false;
        }
    }
}
