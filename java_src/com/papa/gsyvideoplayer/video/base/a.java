package com.papa.gsyvideoplayer.video.base;

import android.content.Context;
import android.view.Surface;
import com.papa.gsyvideoplayer.player.c;
import java.io.File;
import java.util.Map;
/* compiled from: GSYVideoViewBridge.java */
/* loaded from: classes5.dex */
public interface a {
    void A(s2.a aVar);

    void B(int i4);

    void a(Context context, File file, String str);

    int b();

    void c(float f5, boolean z4);

    boolean d();

    boolean e(Context context, File file, String str);

    void f(float f5, boolean z4);

    long getCurrentPosition();

    int getCurrentVideoHeight();

    int getCurrentVideoWidth();

    long getDuration();

    int getVideoHeight();

    int getVideoSarDen();

    int getVideoSarNum();

    int getVideoWidth();

    long h();

    void i(Surface surface);

    boolean isPlaying();

    void j(String str);

    int k();

    void l(String str, Map<String, String> map, boolean z4, float f5, boolean z5, File file, String str2);

    void m(int i4);

    int n();

    String o();

    s2.a p();

    void pause();

    void q(Surface surface);

    int r();

    void s(int i4);

    void seekTo(long j4);

    void start();

    void stop();

    c t();

    void u(String str, Map<String, String> map, boolean z4, float f5, boolean z5, File file);

    void v(int i4);

    s2.a w();

    void x();

    boolean y();

    void z(s2.a aVar);
}
