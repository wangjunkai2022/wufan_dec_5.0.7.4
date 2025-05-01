package com.bytedance.pangle.util.a;

import com.bytedance.pangle.util.f;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static String f8598a = "";

    public static String[] a(File file) {
        String str;
        ByteBuffer b5;
        boolean z4;
        String str2 = "";
        try {
            b5 = b(file);
        } catch (Exception unused) {
            str = "";
        }
        if (b5.order() == ByteOrder.LITTLE_ENDIAN) {
            ByteBuffer a5 = a(b5, b5.capacity() - 24);
            int i4 = 0;
            while (a5.hasRemaining()) {
                i4++;
                if (a5.remaining() >= 8) {
                    long j4 = a5.getLong();
                    if (j4 >= 4 && j4 <= 2147483647L) {
                        int i5 = (int) j4;
                        int position = a5.position() + i5;
                        if (i5 <= a5.remaining()) {
                            int i6 = a5.getInt();
                            if (i6 == -262969152) {
                                f8598a = "V3";
                            } else if (i6 == 1896449818) {
                                f8598a = "V2";
                            } else {
                                a5.position(position);
                            }
                            z4 = true;
                            break;
                        }
                        throw new Exception("APK Signing Block entry #" + i4 + " size out of range: " + i5 + ", available: " + a5.remaining());
                    }
                    throw new Exception("APK Signing Block entry #" + i4 + " size out of range: " + j4);
                }
                throw new Exception("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i4)));
            }
            z4 = false;
            if (z4) {
                str2 = f.a(b5.array());
                str = "";
            } else {
                str = "without v2 & v3 signature.";
            }
            return new String[]{str2, f8598a, str};
        }
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[Catch: all -> 0x018c, TryCatch #0 {all -> 0x018c, blocks: (B:4:0x0008, B:12:0x0024, B:14:0x003a, B:19:0x004b, B:21:0x005d, B:25:0x0075, B:27:0x00a8, B:29:0x00b5, B:33:0x00c9, B:35:0x00d3, B:37:0x00f4, B:40:0x0104, B:41:0x011f, B:42:0x0120, B:43:0x012f, B:44:0x0130, B:45:0x013f, B:46:0x0140, B:47:0x0147, B:48:0x0148, B:49:0x0157, B:50:0x0158, B:51:0x015f, B:52:0x0160, B:53:0x017b, B:54:0x017c, B:55:0x0183, B:56:0x0184, B:57:0x018b, B:7:0x0014, B:10:0x001b), top: B:64:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017c A[Catch: all -> 0x018c, TryCatch #0 {all -> 0x018c, blocks: (B:4:0x0008, B:12:0x0024, B:14:0x003a, B:19:0x004b, B:21:0x005d, B:25:0x0075, B:27:0x00a8, B:29:0x00b5, B:33:0x00c9, B:35:0x00d3, B:37:0x00f4, B:40:0x0104, B:41:0x011f, B:42:0x0120, B:43:0x012f, B:44:0x0130, B:45:0x013f, B:46:0x0140, B:47:0x0147, B:48:0x0148, B:49:0x0157, B:50:0x0158, B:51:0x015f, B:52:0x0160, B:53:0x017b, B:54:0x017c, B:55:0x0183, B:56:0x0184, B:57:0x018b, B:7:0x0014, B:10:0x001b), top: B:64:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.nio.ByteBuffer b(java.io.File r13) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.util.a.b.b(java.io.File):java.nio.ByteBuffer");
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i4) {
        if (i4 >= 8) {
            int capacity = byteBuffer.capacity();
            if (i4 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i4);
                    byteBuffer.position(8);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    return slice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                }
            }
            throw new IllegalArgumentException("end > capacity: " + i4 + " > " + capacity);
        }
        throw new IllegalArgumentException("end < start: " + i4 + " < 8");
    }
}
