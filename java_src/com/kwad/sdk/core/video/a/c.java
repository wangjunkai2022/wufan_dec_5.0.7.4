package com.kwad.sdk.core.video.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.TimedText;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.util.Map;
/* loaded from: classes5.dex */
public interface c {

    /* loaded from: classes5.dex */
    public interface a {
        void av(int i4);
    }

    /* loaded from: classes5.dex */
    public interface b {
        void py();
    }

    /* renamed from: com.kwad.sdk.core.video.a.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0528c {
        boolean l(int i4, int i5);
    }

    /* loaded from: classes5.dex */
    public interface d {
        boolean m(int i4, int i5);
    }

    /* loaded from: classes5.dex */
    public interface e {
        void a(c cVar);
    }

    /* loaded from: classes5.dex */
    public interface f {
        void sc();
    }

    /* loaded from: classes5.dex */
    public interface g {
        void pz();
    }

    /* loaded from: classes5.dex */
    public interface h {
        void a(TimedText timedText);
    }

    /* loaded from: classes5.dex */
    public interface i {
        void k(int i4, int i5);
    }

    boolean GJ();

    void a(@NonNull com.kwad.sdk.contentalliance.a.a.b bVar);

    void a(a aVar);

    void a(b bVar);

    void a(InterfaceC0528c interfaceC0528c);

    void a(f fVar);

    void a(g gVar);

    void a(h hVar);

    void a(i iVar);

    void b(e eVar);

    void c(d dVar);

    int getAudioSessionId();

    String getCurrentPlayingUrl();

    long getCurrentPosition();

    String getDataSource();

    long getDuration();

    int getMediaPlayerType();

    int getVideoHeight();

    int getVideoWidth();

    boolean isLooping();

    boolean isPlaying();

    void pause();

    boolean prepareAsync();

    void release();

    void reset();

    void seekTo(long j4);

    void setAudioStreamType(int i4);

    void setDataSource(Context context, Uri uri);

    @TargetApi(14)
    void setDataSource(Context context, Uri uri, Map<String, String> map);

    void setDataSource(FileDescriptor fileDescriptor);

    void setDataSource(String str);

    void setDisplay(SurfaceHolder surfaceHolder);

    void setLooping(boolean z4);

    void setScreenOnWhilePlaying(boolean z4);

    void setSpeed(float f5);

    void setSurface(Surface surface);

    void setVolume(float f5, float f6);

    void start();

    void stop();
}
