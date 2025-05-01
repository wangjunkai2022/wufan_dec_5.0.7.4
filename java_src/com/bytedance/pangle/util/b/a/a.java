package com.bytedance.pangle.util.b.a;

import com.bytedance.pangle.util.b.b.d;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.ArrayList;
import net.lingala.zip4j.util.e;
/* loaded from: classes2.dex */
public final class a {
    public static d a(String str) {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
            try {
                if (randomAccessFile2.length() >= 22) {
                    d dVar = new d(str);
                    long length = randomAccessFile2.length();
                    if (length >= 22) {
                        long j4 = length - 22;
                        randomAccessFile2.seek(j4);
                        if (dVar.f8619c.a(randomAccessFile2) != e.f71858d) {
                            j4 = b(randomAccessFile2, dVar);
                        }
                        randomAccessFile2.seek(j4 + 4);
                        com.bytedance.pangle.util.b.b.b bVar = new com.bytedance.pangle.util.b.b.b();
                        randomAccessFile2.skipBytes(6);
                        bVar.f8605a = dVar.f8619c.b(randomAccessFile2);
                        randomAccessFile2.skipBytes(4);
                        bVar.f8606b = dVar.f8619c.a(randomAccessFile2);
                        dVar.f8618b = bVar;
                        if (bVar.f8605a == 0) {
                            try {
                                randomAccessFile2.close();
                            } catch (IOException unused) {
                            }
                            return dVar;
                        }
                        a(randomAccessFile2, dVar);
                        try {
                            randomAccessFile2.close();
                        } catch (IOException unused2) {
                        }
                        return dVar;
                    }
                    throw new IOException("Zip file size less than size of zip headers. Probably not a zip file.");
                }
                throw new IOException("Zip file size less than minimum expected zip file size. Probably not a zip file or a corrupted zip file");
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static long b(RandomAccessFile randomAccessFile, d dVar) {
        long length = randomAccessFile.length() - 22;
        for (long length2 = randomAccessFile.length() < 65536 ? randomAccessFile.length() : 65536L; length2 > 0 && length > 0; length2--) {
            length--;
            randomAccessFile.seek(length);
            if (dVar.f8619c.a(randomAccessFile) == e.f71858d) {
                return length;
            }
        }
        throw new IOException("Zip headers not found. Probably not a zip file");
    }

    private static void a(RandomAccessFile randomAccessFile, d dVar) {
        com.bytedance.pangle.util.b.b.a aVar = new com.bytedance.pangle.util.b.b.a();
        ArrayList arrayList = new ArrayList();
        com.bytedance.pangle.util.b.b.b bVar = dVar.f8618b;
        long j4 = bVar.f8606b;
        long j5 = bVar.f8605a;
        randomAccessFile.seek(j4);
        for (int i4 = 0; i4 < j5; i4++) {
            com.bytedance.pangle.util.b.b.c cVar = new com.bytedance.pangle.util.b.b.c();
            if (dVar.f8619c.a(randomAccessFile) == e.f71856c) {
                randomAccessFile.skipBytes(6);
                cVar.f8607a = dVar.f8619c.b(randomAccessFile);
                randomAccessFile.skipBytes(4);
                cVar.f8608b = dVar.f8619c.a(randomAccessFile);
                cVar.f8609c = dVar.f8619c.a(randomAccessFile);
                cVar.f8610d = dVar.f8619c.a(randomAccessFile);
                int b5 = dVar.f8619c.b(randomAccessFile);
                cVar.f8611e = b5;
                cVar.f8612f = dVar.f8619c.b(randomAccessFile);
                int b6 = dVar.f8619c.b(randomAccessFile);
                randomAccessFile.skipBytes(8);
                cVar.f8615i = dVar.f8619c.a(randomAccessFile);
                if (b5 > 0) {
                    byte[] bArr = new byte[b5];
                    randomAccessFile.readFully(bArr);
                    cVar.f8614h = new String(bArr, Charset.forName("UTF-8"));
                    randomAccessFile.skipBytes(cVar.f8612f);
                    if (b6 > 0) {
                        randomAccessFile.skipBytes(b6);
                    }
                    long filePointer = randomAccessFile.getFilePointer();
                    randomAccessFile.seek(cVar.f8615i + 28);
                    cVar.f8613g = dVar.f8619c.b(randomAccessFile);
                    randomAccessFile.seek(filePointer);
                    arrayList.add(cVar);
                } else {
                    throw new IOException("Invalid entry name in file header");
                }
            } else {
                throw new IOException("Expected central directory entry not found (#" + (i4 + 1) + ")");
            }
        }
        aVar.f8604a = arrayList;
        dVar.f8617a = aVar;
    }
}
