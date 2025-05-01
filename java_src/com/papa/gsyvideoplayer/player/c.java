package com.papa.gsyvideoplayer.player;

import android.content.Context;
import android.os.Message;
import java.util.List;
import tv.danmaku.ijk.media.player.IMediaPlayer;
/* compiled from: IPlayerManager.java */
/* loaded from: classes.dex */
public interface c {
    int b();

    void c(float f5, boolean z4);

    boolean d();

    void f(float f5, boolean z4);

    long getCurrentPosition();

    long getDuration();

    IMediaPlayer getMediaPlayer();

    int getVideoHeight();

    int getVideoSarDen();

    int getVideoSarNum();

    int getVideoWidth();

    long h();

    void i(Context context, Message message, List<com.papa.gsyvideoplayer.model.c> list, com.papa.gsyvideoplayer.cache.b bVar);

    boolean isPlaying();

    void j(boolean z4);

    void k(Message message);

    void l();

    void pause();

    void release();

    void seekTo(long j4);

    void start();

    void stop();
}
