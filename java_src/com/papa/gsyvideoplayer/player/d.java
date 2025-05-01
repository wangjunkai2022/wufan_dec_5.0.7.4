package com.papa.gsyvideoplayer.player;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import com.papa.gsyvideoplayer.utils.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkLibLoader;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: IjkPlayerManager.java */
/* loaded from: classes.dex */
public class d extends com.papa.gsyvideoplayer.player.a {

    /* renamed from: e  reason: collision with root package name */
    private static int f58266e = 1;

    /* renamed from: f  reason: collision with root package name */
    private static IjkLibLoader f58267f;

    /* renamed from: b  reason: collision with root package name */
    private IjkMediaPlayer f58268b;

    /* renamed from: c  reason: collision with root package name */
    private List<com.papa.gsyvideoplayer.model.c> f58269c;

    /* renamed from: d  reason: collision with root package name */
    private Surface f58270d;

    /* compiled from: IjkPlayerManager.java */
    /* loaded from: classes5.dex */
    class a implements IjkMediaPlayer.OnNativeInvokeListener {
        a() {
        }

        @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener
        public boolean onNativeInvoke(int i4, Bundle bundle) {
            return true;
        }
    }

    public static IjkLibLoader m() {
        return f58267f;
    }

    public static int n() {
        return f58266e;
    }

    private void p(IjkMediaPlayer ijkMediaPlayer, List<com.papa.gsyvideoplayer.model.c> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (com.papa.gsyvideoplayer.model.c cVar : list) {
            if (cVar.e() == 0) {
                ijkMediaPlayer.setOption(cVar.a(), cVar.b(), cVar.c());
            } else {
                ijkMediaPlayer.setOption(cVar.a(), cVar.b(), cVar.d());
            }
        }
    }

    public static void q(IjkLibLoader ijkLibLoader) {
        f58267f = ijkLibLoader;
    }

    public static void r(int i4) {
        f58266e = i4;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public int b() {
        return -1;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void c(float f5, boolean z4) {
        if (f5 > 0.0f) {
            try {
                IjkMediaPlayer ijkMediaPlayer = this.f58268b;
                if (ijkMediaPlayer != null) {
                    ijkMediaPlayer.setSpeed(f5);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (z4) {
                com.papa.gsyvideoplayer.model.c cVar = new com.papa.gsyvideoplayer.model.c(4, "soundtouch", 1);
                List<com.papa.gsyvideoplayer.model.c> o4 = o();
                if (o4 != null) {
                    o4.add(cVar);
                } else {
                    o4 = new ArrayList<>();
                    o4.add(cVar);
                }
                s(o4);
            }
        }
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public boolean d() {
        return true;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void f(float f5, boolean z4) {
        IjkMediaPlayer ijkMediaPlayer = this.f58268b;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.setSpeed(f5);
            this.f58268b.setOption(4, "soundtouch", z4 ? 1L : 0L);
        }
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public long getCurrentPosition() {
        IjkMediaPlayer ijkMediaPlayer = this.f58268b;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public long getDuration() {
        IjkMediaPlayer ijkMediaPlayer = this.f58268b;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getDuration();
        }
        return 0L;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public IMediaPlayer getMediaPlayer() {
        return this.f58268b;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public int getVideoHeight() {
        IjkMediaPlayer ijkMediaPlayer = this.f58268b;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public int getVideoSarDen() {
        IjkMediaPlayer ijkMediaPlayer = this.f58268b;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getVideoSarDen();
        }
        return 1;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public int getVideoSarNum() {
        IjkMediaPlayer ijkMediaPlayer = this.f58268b;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getVideoSarNum();
        }
        return 1;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public int getVideoWidth() {
        IjkMediaPlayer ijkMediaPlayer = this.f58268b;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public long h() {
        IjkMediaPlayer ijkMediaPlayer = this.f58268b;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getTcpSpeed();
        }
        return 0L;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void i(Context context, Message message, List<com.papa.gsyvideoplayer.model.c> list, com.papa.gsyvideoplayer.cache.b bVar) {
        IjkMediaPlayer ijkMediaPlayer = f58267f == null ? new IjkMediaPlayer() : new IjkMediaPlayer(f58267f);
        this.f58268b = ijkMediaPlayer;
        ijkMediaPlayer.setAudioStreamType(3);
        this.f58268b.setOnNativeInvokeListener(new a());
        com.papa.gsyvideoplayer.model.a aVar = (com.papa.gsyvideoplayer.model.a) message.obj;
        String e5 = aVar.e();
        try {
            if (com.papa.gsyvideoplayer.utils.f.h()) {
                com.papa.gsyvideoplayer.utils.c.h("enable mediaCodec");
                this.f58268b.setOption(4, "mediacodec", 1L);
                this.f58268b.setOption(4, "mediacodec-auto-rotate", 1L);
                this.f58268b.setOption(4, "mediacodec-handle-resolution-change", 1L);
            }
            if (aVar.f() && bVar != null) {
                bVar.h(context, this.f58268b, e5, aVar.b(), aVar.a());
            } else if (!TextUtils.isEmpty(e5)) {
                Uri parse = Uri.parse(e5);
                if (parse.getScheme().equals(com.facebook.common.util.f.f10930h)) {
                    this.f58268b.setDataSource(p.a(context, parse));
                } else if (parse.getScheme().equals("content")) {
                    try {
                        this.f58268b.setDataSource(context.getContentResolver().openFileDescriptor(parse, "r").getFileDescriptor());
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                } else {
                    this.f58268b.setDataSource(e5, aVar.b());
                }
            } else {
                this.f58268b.setDataSource(e5, aVar.b());
            }
            this.f58268b.setLooping(aVar.g());
            if (aVar.d() != 1.0f && aVar.d() > 0.0f) {
                this.f58268b.setSpeed(aVar.d());
            }
            IjkMediaPlayer.native_setLogLevel(f58266e);
            p(this.f58268b, list);
        } catch (IOException e7) {
            e7.printStackTrace();
        }
        e(aVar);
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public boolean isPlaying() {
        IjkMediaPlayer ijkMediaPlayer = this.f58268b;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.isPlaying();
        }
        return false;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void j(boolean z4) {
        IjkMediaPlayer ijkMediaPlayer = this.f58268b;
        if (ijkMediaPlayer != null) {
            if (z4) {
                ijkMediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                ijkMediaPlayer.setVolume(1.0f, 1.0f);
            }
        }
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void k(Message message) {
        IjkMediaPlayer ijkMediaPlayer;
        Object obj = message.obj;
        if (obj == null && (ijkMediaPlayer = this.f58268b) != null) {
            ijkMediaPlayer.setSurface(null);
            return;
        }
        Surface surface = (Surface) obj;
        this.f58270d = surface;
        if (this.f58268b == null || !surface.isValid()) {
            return;
        }
        this.f58268b.setSurface(surface);
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void l() {
        if (this.f58270d != null) {
            this.f58270d = null;
        }
    }

    public List<com.papa.gsyvideoplayer.model.c> o() {
        return this.f58269c;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void pause() {
        IjkMediaPlayer ijkMediaPlayer = this.f58268b;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.pause();
        }
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void release() {
        IjkMediaPlayer ijkMediaPlayer = this.f58268b;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.release();
        }
    }

    public void s(List<com.papa.gsyvideoplayer.model.c> list) {
        this.f58269c = list;
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void seekTo(long j4) {
        IjkMediaPlayer ijkMediaPlayer = this.f58268b;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.seekTo(j4);
        }
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void start() {
        IjkMediaPlayer ijkMediaPlayer = this.f58268b;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.start();
        }
    }

    @Override // com.papa.gsyvideoplayer.player.c
    public void stop() {
        IjkMediaPlayer ijkMediaPlayer = this.f58268b;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.stop();
        }
    }
}
