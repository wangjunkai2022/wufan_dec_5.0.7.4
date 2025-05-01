package com.kwad.sdk.pngencrypt.chunk;

import com.kwad.sdk.pngencrypt.PngjException;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* loaded from: classes5.dex */
public final class l extends p {
    private long aNE;
    private long aNF;
    private int aNG;

    public l(com.kwad.sdk.pngencrypt.k kVar) {
        super("oFFs", kVar);
    }

    @Override // com.kwad.sdk.pngencrypt.chunk.PngChunk
    public final void a(d dVar) {
        if (dVar.len == 9) {
            long g4 = com.kwad.sdk.pngencrypt.n.g(dVar.data, 0);
            this.aNE = g4;
            if (g4 < 0) {
                this.aNE = g4 + IjkMediaMeta.AV_CH_WIDE_RIGHT;
            }
            long g5 = com.kwad.sdk.pngencrypt.n.g(dVar.data, 4);
            this.aNF = g5;
            if (g5 < 0) {
                this.aNF = g5 + IjkMediaMeta.AV_CH_WIDE_RIGHT;
            }
            this.aNG = com.kwad.sdk.pngencrypt.n.e(dVar.data, 8);
            return;
        }
        throw new PngjException("bad chunk length " + dVar);
    }
}
