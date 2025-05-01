package com.kwad.sdk.core.videocache.c;

import android.content.Context;
import com.kwad.sdk.core.videocache.f;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* loaded from: classes5.dex */
public final class a {
    private static f aDP;

    public static f b(Context context, int i4, int i5) {
        f fVar = aDP;
        if (fVar == null) {
            f c5 = c(context, i4, i5);
            aDP = c5;
            return c5;
        }
        return fVar;
    }

    public static f by(Context context) {
        return b(context, 0, 0);
    }

    private static f c(Context context, int i4, int i5) {
        return new f.a(context).az(IjkMediaMeta.AV_CH_STEREO_LEFT).ds(i4).dt(i5).Hb();
    }
}
