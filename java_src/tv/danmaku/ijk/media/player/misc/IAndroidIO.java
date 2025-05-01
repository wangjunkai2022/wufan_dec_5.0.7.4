package tv.danmaku.ijk.media.player.misc;

import java.io.IOException;
/* loaded from: classes7.dex */
public interface IAndroidIO {
    int close() throws IOException;

    int open(String str) throws IOException;

    int read(byte[] bArr, int i4) throws IOException;

    long seek(long j4, int i4) throws IOException;
}
