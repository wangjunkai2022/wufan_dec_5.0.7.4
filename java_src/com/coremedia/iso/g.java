package com.coremedia.iso;

import androidx.core.view.MotionEventCompat;
import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: IsoTypeReader.java */
/* loaded from: classes2.dex */
public final class g {
    public static int a(byte b5) {
        return b5 < 0 ? b5 + 256 : b5;
    }

    public static String b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static double c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d5 = 0 | ((bArr[0] << BinaryMemcacheOpcodes.FLUSHQ) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (bArr[3] & 255);
        Double.isNaN(d5);
        return d5 / 1.073741824E9d;
    }

    public static double d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d5 = 0 | ((bArr[0] << BinaryMemcacheOpcodes.FLUSHQ) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (bArr[3] & 255);
        Double.isNaN(d5);
        return d5 / 65536.0d;
    }

    public static float e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        return ((short) (((short) (0 | ((bArr[0] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK))) | (bArr[1] & 255))) / 256.0f;
    }

    public static String f(ByteBuffer byteBuffer) {
        int i4 = i(byteBuffer);
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < 3; i5++) {
            sb.append((char) (((i4 >> ((2 - i5) * 5)) & 31) + 96));
        }
        return sb.toString();
    }

    public static String g(ByteBuffer byteBuffer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            byte b5 = byteBuffer.get();
            if (b5 == 0) {
                return l.a(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(b5);
        }
    }

    public static String h(ByteBuffer byteBuffer, int i4) {
        byte[] bArr = new byte[i4];
        byteBuffer.get(bArr);
        return l.a(bArr);
    }

    public static int i(ByteBuffer byteBuffer) {
        return (a(byteBuffer.get()) << 8) + 0 + a(byteBuffer.get());
    }

    public static int j(ByteBuffer byteBuffer) {
        return a(byteBuffer.get()) + 0 + (a(byteBuffer.get()) << 8);
    }

    public static int k(ByteBuffer byteBuffer) {
        return (i(byteBuffer) << 8) + 0 + a(byteBuffer.get());
    }

    public static long l(ByteBuffer byteBuffer) {
        long j4 = byteBuffer.getInt();
        return j4 < 0 ? j4 + IjkMediaMeta.AV_CH_WIDE_RIGHT : j4;
    }

    public static long m(ByteBuffer byteBuffer) {
        return (p(byteBuffer) << 24) + (p(byteBuffer) << 16) + (p(byteBuffer) << 8) + (p(byteBuffer) << 0);
    }

    public static long n(ByteBuffer byteBuffer) {
        long i4 = i(byteBuffer) << 32;
        if (i4 >= 0) {
            return i4 + l(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static long o(ByteBuffer byteBuffer) {
        long l4 = (l(byteBuffer) << 32) + 0;
        if (l4 >= 0) {
            return l4 + l(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static int p(ByteBuffer byteBuffer) {
        return a(byteBuffer.get());
    }
}
