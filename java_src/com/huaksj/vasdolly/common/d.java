package com.huaksj.vasdolly.common;

import com.huaksj.vasdolly.common.apk.SignatureNotFoundException;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: V2SchemeUtil.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int f14493a = 1896449818;

    public static boolean a(File file) {
        try {
            return e(g(file)).containsKey(1896449818);
        } catch (SignatureNotFoundException unused) {
            PrintStream printStream = System.out;
            printStream.println("APK : " + file.getAbsolutePath() + " not have apk v2 signature block");
            return false;
        } catch (IOException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static c<ByteBuffer, Long> b(RandomAccessFile randomAccessFile, long j4, int i4) throws IOException {
        return c.a(h(randomAccessFile, j4, i4), Long.valueOf(j4));
    }

    public static c<ByteBuffer, Long> c(RandomAccessFile randomAccessFile, int i4) throws IOException {
        return c.a(h(randomAccessFile, 0L, i4), 0L);
    }

    public static ByteBuffer d(Map<Integer, ByteBuffer> map) {
        Iterator<Map.Entry<Integer, ByteBuffer>> it2;
        if (map != null && !map.isEmpty()) {
            long j4 = 24;
            while (map.entrySet().iterator().hasNext()) {
                j4 += it2.next().getValue().remaining() + 12;
            }
            boolean containsKey = map.containsKey(Integer.valueOf((int) com.huaksj.vasdolly.common.apk.a.f14470c));
            System.out.println("generateApkSigningBlock , needPadding = " + containsKey);
            if (containsKey) {
                j4 -= map.get(Integer.valueOf((int) com.huaksj.vasdolly.common.apk.a.f14470c)).remaining() + 12;
                map.remove(Integer.valueOf((int) com.huaksj.vasdolly.common.apk.a.f14470c));
                int i4 = (int) ((j4 + 8) % 4096);
                if (i4 != 0) {
                    int i5 = 4096 - i4;
                    if (i5 < 12) {
                        i5 += 4096;
                    }
                    j4 += i5;
                    int i6 = (i5 - 8) - 4;
                    map.put(Integer.valueOf((int) com.huaksj.vasdolly.common.apk.a.f14470c), ByteBuffer.allocate(i6).order(ByteOrder.LITTLE_ENDIAN));
                    System.out.println("generateApkSigningBlock , final length = " + j4 + " padding = " + i5 + " bufferSize = " + i6);
                }
            }
            ByteBuffer allocate = ByteBuffer.allocate((int) (8 + j4));
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putLong(j4);
            for (Map.Entry<Integer, ByteBuffer> entry : map.entrySet()) {
                ByteBuffer value = entry.getValue();
                allocate.putLong(value.remaining() + 4);
                allocate.putInt(entry.getKey().intValue());
                allocate.put(value.array(), value.arrayOffset() + value.position(), value.remaining());
            }
            allocate.putLong(j4);
            allocate.putLong(2334950737559900225L);
            allocate.putLong(3617552046287187010L);
            if (allocate.remaining() <= 0) {
                allocate.flip();
                return allocate;
            }
            throw new RuntimeException("generateNewApkV2SchemeBlock error");
        }
        throw new RuntimeException("getNewApkV2SchemeBlock , id value pair is empty");
    }

    public static Map<Integer, ByteBuffer> e(ByteBuffer byteBuffer) throws SignatureNotFoundException {
        com.huaksj.vasdolly.common.apk.a.a(byteBuffer);
        ByteBuffer h4 = com.huaksj.vasdolly.common.apk.a.h(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i4 = 0;
        while (h4.hasRemaining()) {
            i4++;
            if (h4.remaining() >= 8) {
                long j4 = h4.getLong();
                if (j4 >= 4 && j4 <= 2147483647L) {
                    int i5 = (int) j4;
                    int position = h4.position() + i5;
                    if (i5 <= h4.remaining()) {
                        linkedHashMap.put(Integer.valueOf(h4.getInt()), com.huaksj.vasdolly.common.apk.a.e(h4, i5 - 4));
                        h4.position(position);
                    } else {
                        throw new SignatureNotFoundException("APK Signing Block entry #" + i4 + " size out of range: " + i5 + ", available: " + h4.remaining());
                    }
                } else {
                    throw new SignatureNotFoundException("APK Signing Block entry #" + i4 + " size out of range: " + j4);
                }
            } else {
                throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i4);
            }
        }
        if (linkedHashMap.isEmpty()) {
            throw new SignatureNotFoundException("not have Id-Value Pair in APK Signing Block entry #" + i4);
        }
        return linkedHashMap;
    }

    public static a f(File file, boolean z4) throws IOException, SignatureNotFoundException {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                c<ByteBuffer, Long> g4 = com.huaksj.vasdolly.common.apk.a.g(randomAccessFile2);
                ByteBuffer b5 = g4.b();
                long longValue = g4.c().longValue();
                if (!com.huaksj.vasdolly.common.apk.c.i(randomAccessFile2, longValue)) {
                    long f5 = com.huaksj.vasdolly.common.apk.a.f(b5, longValue);
                    c<ByteBuffer, Long> c5 = com.huaksj.vasdolly.common.apk.a.c(randomAccessFile2, f5);
                    c<ByteBuffer, Long> b6 = b(randomAccessFile2, f5, (int) (longValue - f5));
                    a aVar = new a();
                    aVar.f14463b = file.length();
                    aVar.e(z4);
                    if (aVar.f14463b > a.f14461g) {
                        aVar.e(true);
                    }
                    if (!aVar.c()) {
                        aVar.f14464c = c(randomAccessFile2, (int) c5.c().longValue());
                    }
                    aVar.f14465d = c5;
                    aVar.f14466e = b6;
                    aVar.f14467f = g4;
                    aVar.b();
                    PrintStream printStream = System.out;
                    printStream.println("baseApk : " + file.getAbsolutePath() + "\nApkSectionInfo = " + aVar);
                    randomAccessFile2.close();
                    return aVar;
                }
                throw new SignatureNotFoundException("ZIP64 APK not supported");
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static ByteBuffer g(File file) throws SignatureNotFoundException, IOException {
        RandomAccessFile randomAccessFile = null;
        if (file == null || !file.exists() || !file.isFile()) {
            return null;
        }
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                c<ByteBuffer, Long> g4 = com.huaksj.vasdolly.common.apk.a.g(randomAccessFile2);
                ByteBuffer b5 = g4.b();
                long longValue = g4.c().longValue();
                if (!com.huaksj.vasdolly.common.apk.c.i(randomAccessFile2, longValue)) {
                    ByteBuffer b6 = com.huaksj.vasdolly.common.apk.a.c(randomAccessFile2, com.huaksj.vasdolly.common.apk.a.f(b5, longValue)).b();
                    randomAccessFile2.close();
                    return b6;
                }
                throw new SignatureNotFoundException("ZIP64 APK not supported");
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static ByteBuffer h(RandomAccessFile randomAccessFile, long j4, int i4) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(i4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        randomAccessFile.seek(j4);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        return allocate;
    }
}
