package tv.danmaku.ijk.media.player.misc;

import java.io.IOException;
/* loaded from: classes7.dex */
public interface IMediaDataSource {
    void close() throws IOException;

    long getSize() throws IOException;

    int readAt(long j4, byte[] bArr, int i4, int i5) throws IOException;
}
