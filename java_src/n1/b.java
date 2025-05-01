package n1;

import com.huaksj.vasdolly.common.apk.SignatureNotFoundException;
import com.huaksj.vasdolly.common.apk.c;
import com.huaksj.vasdolly.common.d;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.lingala.zip4j.util.e;
/* compiled from: IdValueWriter.java */
/* loaded from: classes3.dex */
public class b {
    public static void a(com.huaksj.vasdolly.common.a aVar, File file, int i4, ByteBuffer byteBuffer) throws IOException, SignatureNotFoundException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Integer.valueOf(i4), byteBuffer);
        d(aVar, file, linkedHashMap);
    }

    public static void b(File file, int i4, byte[] bArr, boolean z4) throws IOException, SignatureNotFoundException {
        c(file, file, i4, bArr, z4);
    }

    public static void c(File file, File file2, int i4, byte[] bArr, boolean z4) throws IOException, SignatureNotFoundException {
        com.huaksj.vasdolly.common.a g4 = g(file, z4);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        a(g4, file2, i4, wrap);
    }

    public static void d(com.huaksj.vasdolly.common.a aVar, File file, Map<Integer, ByteBuffer> map) throws IOException, SignatureNotFoundException {
        if (map != null && !map.isEmpty()) {
            Map<Integer, ByteBuffer> e5 = d.e(aVar.f14465d.b());
            e5.putAll(map);
            ByteBuffer d5 = d.d(e5);
            PrintStream printStream = System.out;
            printStream.println("addIdValueByteBufferMap , oldApkSigningBlock size = " + aVar.f14465d.b().remaining() + " , newApkSigningBlock size = " + d5.remaining());
            ByteBuffer b5 = aVar.f14466e.b();
            ByteBuffer b6 = aVar.f14467f.b();
            long longValue = aVar.f14466e.c().longValue();
            long remaining = (long) (d5.remaining() - aVar.f14465d.b().remaining());
            c.k(b6, longValue + remaining);
            long j4 = aVar.f14463b + remaining;
            RandomAccessFile randomAccessFile = null;
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, e.f71861e0);
                try {
                    if (aVar.c()) {
                        long longValue2 = aVar.f14465d.c().longValue();
                        PrintStream printStream2 = System.out;
                        printStream2.println("seek to apk signing block pos:" + longValue2 + ",dest apk file len:" + randomAccessFile2.length());
                        randomAccessFile2.seek(longValue2);
                    } else {
                        ByteBuffer b7 = aVar.f14464c.b();
                        randomAccessFile2.seek(aVar.f14464c.c().longValue());
                        randomAccessFile2.write(b7.array(), b7.arrayOffset() + b7.position(), b7.remaining());
                    }
                    randomAccessFile2.write(d5.array(), d5.arrayOffset() + d5.position(), d5.remaining());
                    randomAccessFile2.write(b5.array(), b5.arrayOffset() + b5.position(), b5.remaining());
                    randomAccessFile2.write(b6.array(), b6.arrayOffset() + b6.position(), b6.remaining());
                    if (randomAccessFile2.getFilePointer() == j4) {
                        randomAccessFile2.setLength(j4);
                        PrintStream printStream3 = System.out;
                        printStream3.println("addIdValueByteBufferMap , after add channel , new apk is " + file.getAbsolutePath() + " , length = " + file.length());
                        c.k(b6, longValue);
                        randomAccessFile2.close();
                        return;
                    }
                    throw new RuntimeException("after addIdValueByteBufferMap , file size wrong , FilePointer : " + randomAccessFile2.getFilePointer() + ", apkLength : " + j4);
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    c.k(b6, longValue);
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new RuntimeException("addIdValueByteBufferMap , id value pair is empty");
        }
    }

    public static void e(File file, File file2, Map<Integer, byte[]> map, boolean z4) throws IOException, SignatureNotFoundException {
        if (map != null && !map.isEmpty()) {
            com.huaksj.vasdolly.common.a g4 = g(file, z4);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Integer num : map.keySet()) {
                ByteBuffer wrap = ByteBuffer.wrap(map.get(num));
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                linkedHashMap.put(num, wrap);
            }
            d(g4, file2, linkedHashMap);
            return;
        }
        throw new RuntimeException("addIdValueByteMap , idValueByteMap is empty");
    }

    public static void f(File file, Map<Integer, byte[]> map, boolean z4) throws IOException, SignatureNotFoundException {
        e(file, file, map, z4);
    }

    public static com.huaksj.vasdolly.common.a g(File file, boolean z4) throws IOException, SignatureNotFoundException {
        if (file != null && file.exists() && file.isFile()) {
            return d.f(file, z4);
        }
        return null;
    }

    public static void h(com.huaksj.vasdolly.common.a aVar, File file, List<Integer> list) throws SignatureNotFoundException, IOException {
        if (aVar == null || file == null || !file.isFile() || !file.exists() || list == null || list.isEmpty()) {
            return;
        }
        Map<Integer, ByteBuffer> e5 = d.e(aVar.f14465d.b());
        int size = e5.size();
        PrintStream printStream = System.out;
        printStream.println("removeIdValue , existed IdValueMap = " + e5);
        for (Integer num : list) {
            e5.remove(num);
        }
        if (size == e5.size()) {
            System.out.println("removeIdValue , No idValue was deleted");
            return;
        }
        PrintStream printStream2 = System.out;
        printStream2.println("removeIdValue , final IdValueMap = " + e5);
        ByteBuffer d5 = d.d(e5);
        PrintStream printStream3 = System.out;
        printStream3.println("removeIdValue , oldApkSigningBlock size = " + aVar.f14465d.b().remaining() + " , newApkSigningBlock size = " + d5.remaining());
        ByteBuffer b5 = aVar.f14466e.b();
        ByteBuffer b6 = aVar.f14467f.b();
        long longValue = aVar.f14466e.c().longValue();
        long remaining = (long) (d5.remaining() - aVar.f14465d.b().remaining());
        c.k(b6, longValue + remaining);
        long j4 = aVar.f14463b + remaining;
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, e.f71861e0);
            try {
                if (aVar.c()) {
                    long longValue2 = aVar.f14465d.c().longValue();
                    PrintStream printStream4 = System.out;
                    printStream4.println("seek to apk signing block pos:" + longValue2);
                    randomAccessFile2.seek(longValue2);
                } else {
                    ByteBuffer b7 = aVar.f14464c.b();
                    randomAccessFile2.seek(aVar.f14464c.c().longValue());
                    randomAccessFile2.write(b7.array(), b7.arrayOffset() + b7.position(), b7.remaining());
                }
                randomAccessFile2.write(d5.array(), d5.arrayOffset() + d5.position(), d5.remaining());
                randomAccessFile2.write(b5.array(), b5.arrayOffset() + b5.position(), b5.remaining());
                randomAccessFile2.write(b6.array(), b6.arrayOffset() + b6.position(), b6.remaining());
                if (randomAccessFile2.getFilePointer() == j4) {
                    randomAccessFile2.setLength(j4);
                    PrintStream printStream5 = System.out;
                    printStream5.println("removeIdValue , after remove channel , apk is " + file.getAbsolutePath() + " , length = " + file.length());
                    c.k(b6, longValue);
                    randomAccessFile2.close();
                    return;
                }
                throw new RuntimeException("after removeIdValue , file size wrong , FilePointer : " + randomAccessFile2.getFilePointer() + ", apkLength : " + j4);
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                c.k(b6, longValue);
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void i(File file, int i4) {
    }
}
