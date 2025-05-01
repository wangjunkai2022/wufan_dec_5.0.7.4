package com.kwad.sdk.utils.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.kwad.sdk.utils.a.a;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* loaded from: classes5.dex */
public final class c {
    private static final int PAGE_SIZE;
    private static final int aSA;
    private static final int[] aSw = {0, 1, 4, 4, 8, 8};
    private static final byte[] aSx = new byte[0];
    private static final int aSy;
    private static final int aSz;
    private final String Wx;
    private final Map<String, b> aSB;
    private FileChannel aSD;
    private FileChannel aSE;
    private RandomAccessFile aSF;
    private RandomAccessFile aSG;
    private MappedByteBuffer aSH;
    private MappedByteBuffer aSI;
    private com.kwad.sdk.utils.a.b aSJ;
    private int aSK;
    private long aSL;
    private int aSO;
    private int aSP;
    private int aSQ;
    private boolean aSR;
    private String aSS;
    private int aST;
    private int aSV;
    private final String name;
    private final d aSC = com.kwad.sdk.utils.a.d.aTg;
    private final Map<String, a.b> aSM = new HashMap();
    private boolean aSN = false;
    private final ArrayList<e> aSU = new ArrayList<>();
    private boolean aSW = true;
    private final Executor aSX = new f();

    /* loaded from: classes5.dex */
    public static class a {
        static int aSZ = 11;
        static final C0544c aTa = new C0544c(11);
        private final String Wx;
        private int aSV = 0;
        private b[] aTb;
        private final String name;

        public a(String str, String str2) {
            if (str != null && !str.isEmpty()) {
                if (str2 != null && !str2.isEmpty()) {
                    if (!str.endsWith(net.lingala.zip4j.util.e.F0)) {
                        str = str + '/';
                    }
                    this.Wx = str;
                    this.name = str2;
                    return;
                }
                throw new IllegalArgumentException("name is empty");
            }
            throw new IllegalArgumentException("path is empty");
        }

        public final c Oy() {
            String str = this.Wx + this.name;
            c hs = C0544c.hs(str);
            if (hs == null) {
                synchronized (a.class) {
                    hs = C0544c.hs(str);
                    if (hs == null) {
                        hs = new c(this.Wx, this.name, this.aTb, this.aSV);
                        C0544c.b(str, hs);
                    }
                }
            }
            Integer num = C0544c.aTf.get(str);
            if (num != null) {
                C0544c.aTf.put(str, Integer.valueOf(num.intValue() + 1));
            } else {
                C0544c.aTf.put(str, 1);
            }
            return hs;
        }
    }

    /* loaded from: classes5.dex */
    public interface b<T> {
        String Oz();

        T g(byte[] bArr, int i4, int i5);

        byte[] m(T t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.sdk.utils.a.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0544c {
        private static Map<String, c> aTc;
        private static List<String> aTd;
        private static int aTe;
        public static Map<String, Integer> aTf;

        public C0544c(int i4) {
            int size = getSize(i4);
            aTc = new ConcurrentHashMap(size);
            aTf = new HashMap(size);
            aTd = new CopyOnWriteArrayList();
            aTe = i4;
        }

        public static void b(String str, c cVar) {
            if (aTc == null) {
                aTc = new ConcurrentHashMap(getSize(aTe));
            }
            if (aTd == null) {
                aTd = new CopyOnWriteArrayList();
            }
            if (aTc.containsKey(str)) {
                aTd.remove(str);
                aTd.add(str);
            } else {
                aTd.add(str);
            }
            aTc.put(str, cVar);
            if (aTc.size() > aTe) {
                Integer num = aTf.get(aTd.get(0));
                if (num != null && num.intValue() != 2) {
                    et(aTe + 1);
                    return;
                }
                c cVar2 = aTc.get(aTd.get(0));
                if (cVar2 != null) {
                    cVar2.release();
                }
                aTc.remove(aTd.get(0));
                aTd.remove(0);
            }
        }

        private static void et(int i4) {
            d dVar = com.kwad.sdk.utils.a.d.aTg;
            dVar.i("Ks_UnionKv", "reSize:" + i4);
            aTe = i4;
        }

        private static int getSize(int i4) {
            return (int) ((i4 / 0.75f) + 1.0f);
        }

        public static c hs(String str) {
            if (aTc == null) {
                aTc = new ConcurrentHashMap(getSize(aTe));
            }
            if (aTd == null) {
                aTd = new CopyOnWriteArrayList();
            }
            c cVar = aTc.get(str);
            if (cVar != null) {
                aTd.remove(str);
                aTd.add(str);
                return cVar;
            }
            return null;
        }

        public static void remove(String str) {
            List<String> list = aTd;
            if (list != null) {
                list.remove(str);
            }
            Map<String, c> map = aTc;
            if (map != null) {
                map.remove(str);
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface d {
        void a(String str, Exception exc);

        void e(String str, Throwable th);

        void i(String str, String str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class e implements Comparable<e> {
        int end;
        int start;

        e(int i4, int i5) {
            this.start = i4;
            this.end = i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(e eVar) {
            return this.start - eVar.start;
        }
    }

    static {
        int OC = h.OC();
        PAGE_SIZE = OC;
        aSy = OC - 192;
        int max = Math.max(OC << 1, 16384);
        aSz = max;
        aSA = max << 1;
    }

    c(String str, String str2, b[] bVarArr, int i4) {
        this.Wx = str;
        this.name = str2;
        this.aSV = i4;
        HashMap hashMap = new HashMap();
        g gVar = g.aTn;
        hashMap.put(gVar.Oz(), gVar);
        if (bVarArr != null && bVarArr.length > 0) {
            for (b bVar : bVarArr) {
                String Oz = bVar.Oz();
                if (hashMap.containsKey(Oz)) {
                    hr("duplicate encoder tag:" + Oz);
                } else {
                    hashMap.put(Oz, bVar);
                }
            }
        }
        this.aSB = hashMap;
        synchronized (this.aSM) {
            com.kwad.sdk.utils.a.d.getExecutor().execute(new Runnable() { // from class: com.kwad.sdk.utils.a.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.Og();
                }
            });
            while (!this.aSN) {
                try {
                    this.aSM.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    private int E(int i4, int i5) {
        if (i5 > 536870912) {
            IllegalStateException illegalStateException = new IllegalStateException("data size out of limit");
            if (!com.kwad.library.a.a.md.booleanValue()) {
                u(illegalStateException);
            } else {
                throw illegalStateException;
            }
        }
        int i6 = PAGE_SIZE;
        if (i5 <= i6) {
            return i6;
        }
        while (i4 < i5) {
            int i7 = aSz;
            i4 = i4 <= i7 ? i4 << 1 : i4 + i7;
        }
        return i4;
    }

    private void F(int i4, int i5) {
        this.aST += i5 - i4;
        ArrayList<e> arrayList = this.aSU;
        if (arrayList != null) {
            arrayList.add(new e(i4, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void Og() {
        synchronized (this.aSM) {
            this.aSN = true;
            this.aSM.notify();
        }
        long nanoTime = System.nanoTime();
        if (!Oj() && this.aSV == 0) {
            Oh();
        }
        if (this.aSJ == null) {
            this.aSJ = new com.kwad.sdk.utils.a.b(PAGE_SIZE);
        }
        if (this.aSC != null) {
            info("loading finish, data len:" + this.aSK + ", get keys:" + this.aSM.size() + ", use time:" + ((System.nanoTime() - nanoTime) / 1000000) + " ms");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a4 A[Catch: all -> 0x01c6, TryCatch #0 {all -> 0x01c6, blocks: (B:3:0x0038, B:5:0x003e, B:8:0x0046, B:9:0x0070, B:13:0x0081, B:17:0x009e, B:18:0x00a9, B:22:0x00c0, B:23:0x00c4, B:25:0x00e1, B:27:0x00e8, B:29:0x010a, B:31:0x0110, B:37:0x011d, B:39:0x0123, B:41:0x013a, B:43:0x0142, B:45:0x015b, B:46:0x0168, B:48:0x0184, B:50:0x018a, B:53:0x01a4, B:16:0x0099, B:12:0x007e, B:56:0x01ae, B:58:0x01b8), top: B:63:0x0038, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Oh() {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.utils.a.c.Oh():void");
    }

    private boolean Oi() {
        com.kwad.sdk.utils.a.b bVar = new com.kwad.sdk.utils.a.b(this.aSK);
        MappedByteBuffer mappedByteBuffer = this.aSI;
        if (mappedByteBuffer != null) {
            mappedByteBuffer.rewind();
            this.aSI.get(bVar.aSv, 0, this.aSK);
        }
        com.kwad.sdk.utils.a.b bVar2 = this.aSJ;
        if (bVar2 != null) {
            byte[] bArr = bVar2.aSv;
            byte[] bArr2 = bVar.aSv;
            for (int i4 = 0; i4 < this.aSK; i4++) {
                if (bArr[i4] != bArr2[i4]) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    private boolean Oj() {
        String str = this.Wx;
        File file = new File(str, this.name + ".kvc");
        String str2 = this.Wx;
        File file2 = new File(str2, this.name + ".tmp");
        boolean z4 = true;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (ad(file)) {
                    if (this.aSV == 0) {
                        if (a(this.aSJ)) {
                            info("recover from c file");
                            try {
                                Oo();
                                return true;
                            } catch (Exception e5) {
                                e = e5;
                                u(e);
                                return z4;
                            }
                        }
                        this.aSV = 1;
                    }
                } else {
                    Or();
                    Oo();
                }
            } else if (this.aSV != 0) {
                String str3 = this.Wx;
                File file3 = new File(str3, this.name + ".kva");
                String str4 = this.Wx;
                File file4 = new File(str4, this.name + ".kvb");
                if (file3.exists() && file4.exists()) {
                    h(file3, file4);
                }
            }
            return false;
        } catch (Exception e6) {
            e = e6;
            z4 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x016f, code lost:
        throw new java.lang.Exception("parse dara failed");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int Ok() {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.utils.a.c.Ok():int");
    }

    private void Ol() {
        if (this.aSV == 0 || !this.aSW) {
            return;
        }
        Om();
    }

    private boolean Om() {
        int i4 = this.aSV;
        if (i4 == 1) {
            Executor executor = this.aSX;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: com.kwad.sdk.utils.a.c.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.On();
                    }
                });
            }
        } else if (i4 == 2) {
            return On();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean On() {
        try {
            String str = this.Wx;
            File file = new File(str, this.name + ".tmp");
            if (h.ae(file)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, net.lingala.zip4j.util.e.f71861e0);
                randomAccessFile.setLength(this.aSK);
                randomAccessFile.write(this.aSJ.aSv, 0, this.aSK);
                randomAccessFile.close();
                String str2 = this.Wx;
                File file2 = new File(str2, this.name + ".kvc");
                if (!file2.exists() || file2.delete()) {
                    if (file.renameTo(file2)) {
                        return true;
                    }
                    g(new Exception("rename failed"));
                }
            }
        } catch (Exception e5) {
            u(e5);
        }
        return false;
    }

    private void Oo() {
        try {
            String str = this.Wx;
            h.h(new File(str, this.name + ".kvc"));
            String str2 = this.Wx;
            h.h(new File(str2, this.name + ".tmp"));
        } catch (Exception e5) {
            u(e5);
        }
    }

    private void Op() {
        this.aSV = 1;
        h.closeQuietly(this.aSD);
        h.closeQuietly(this.aSE);
        this.aSD = null;
        this.aSE = null;
        this.aSH = null;
        this.aSI = null;
    }

    private void Oq() {
        if (this.aSV == 0) {
            try {
                a(this.aSH);
                a(this.aSI);
            } catch (Throwable unused) {
                Op();
            }
        }
        Or();
        h.h(new File(this.Wx + this.name));
    }

    private void Or() {
        this.aSK = 12;
        this.aSL = 0L;
        Ox();
        this.aSM.clear();
        com.kwad.sdk.utils.a.b bVar = this.aSJ;
        if (bVar != null && bVar.aSv.length == PAGE_SIZE) {
            bVar.B(0, 0);
            this.aSJ.f(4, 0L);
            return;
        }
        this.aSJ = new com.kwad.sdk.utils.a.b(PAGE_SIZE);
    }

    private void Os() {
        com.kwad.sdk.utils.a.b bVar;
        com.kwad.sdk.utils.a.b bVar2 = this.aSJ;
        if (bVar2 != null) {
            this.aSL ^= bVar2.D(this.aSO, this.aSP);
        }
        if (this.aSV == 0) {
            MappedByteBuffer mappedByteBuffer = this.aSH;
            if (mappedByteBuffer != null) {
                mappedByteBuffer.putInt(0, -1);
                b(this.aSH);
                this.aSH.putInt(0, this.aSK - 12);
            }
            MappedByteBuffer mappedByteBuffer2 = this.aSI;
            if (mappedByteBuffer2 != null) {
                b(mappedByteBuffer2);
            }
        } else {
            if (this.aSR && (bVar = this.aSJ) != null) {
                bVar.B(0, this.aSK - 12);
            }
            com.kwad.sdk.utils.a.b bVar3 = this.aSJ;
            if (bVar3 != null) {
                bVar3.f(4, this.aSL);
            }
        }
        this.aSR = false;
        this.aSQ = 0;
        this.aSP = 0;
    }

    private int Ot() {
        int i4 = this.aSK;
        if (i4 <= 16384) {
            return 4096;
        }
        return i4 <= 65536 ? 8192 : 16384;
    }

    private void Ou() {
        eq(this.aSP);
        int i4 = this.aSK;
        this.aSO = i4;
        this.aSK = this.aSP + i4;
        com.kwad.sdk.utils.a.b bVar = this.aSJ;
        if (bVar != null) {
            bVar.position = i4;
        }
        this.aSR = true;
    }

    private void Ov() {
        if (this.aST < (Ot() << 1)) {
            if (this.aSU.size() < (this.aSK < 16384 ? 80 : 160)) {
                return;
            }
        }
        er(0);
    }

    private void Ow() {
        ArrayList<e> arrayList = this.aSU;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size() - 1;
        e eVar = this.aSU.get(size);
        while (size > 0) {
            size--;
            e eVar2 = this.aSU.get(size);
            if (eVar.start == eVar2.end) {
                eVar2.end = eVar.end;
                this.aSU.remove(size + 1);
            }
            eVar = eVar2;
        }
    }

    private void Ox() {
        this.aST = 0;
        ArrayList<e> arrayList = this.aSU;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    private boolean ad(File file) {
        long length = file.length();
        if (length != 0 && length <= IjkMediaMeta.AV_CH_STEREO_LEFT) {
            int i4 = (int) length;
            int E = E(PAGE_SIZE, i4);
            com.kwad.sdk.utils.a.b bVar = this.aSJ;
            if (bVar != null && bVar.aSv.length == E) {
                bVar.position = 0;
            } else {
                bVar = new com.kwad.sdk.utils.a.b(new byte[E]);
                this.aSJ = bVar;
            }
            h.a(file, bVar.aSv, i4);
            int i5 = bVar.getInt();
            long j4 = bVar.getLong();
            this.aSK = i5 + 12;
            if (i5 >= 0 && i5 <= i4 - 12 && j4 == bVar.D(12, i5) && Ok() == 0) {
                this.aSL = j4;
                return true;
            }
        }
        return false;
    }

    private static long e(long j4, int i4) {
        int i5 = (i4 & 7) << 3;
        return (j4 >>> (64 - i5)) | (j4 << i5);
    }

    private static void e(int i4, boolean z4) {
        if (z4) {
            if (i4 != 32) {
                throw new IllegalStateException("name size not match");
            }
        } else if (i4 < 0 || i4 >= 2048) {
            throw new IllegalStateException("value size out of bound");
        }
    }

    private static void ep(int i4) {
        if (i4 > 255) {
            throw new IllegalArgumentException("key's length must less than 256");
        }
    }

    private void eq(int i4) {
        if (this.aSJ == null) {
            this.aSJ = new com.kwad.sdk.utils.a.b(PAGE_SIZE);
        }
        int length = this.aSJ.aSv.length;
        int i5 = this.aSK + i4;
        if (i5 >= length) {
            int i6 = this.aST;
            if (i6 > i4 && i6 > Ot()) {
                er(i4);
                return;
            }
            int E = E(length, i5);
            byte[] bArr = new byte[E];
            System.arraycopy(this.aSJ.aSv, 0, bArr, 0, this.aSK);
            this.aSJ.aSv = bArr;
            if (this.aSV == 0) {
                try {
                    long j4 = E;
                    MappedByteBuffer map = this.aSD.map(FileChannel.MapMode.READ_WRITE, 0L, j4);
                    this.aSH = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = this.aSE.map(FileChannel.MapMode.READ_WRITE, 0L, j4);
                    this.aSI = map2;
                    map2.order(byteOrder);
                } catch (Throwable th) {
                    u(new Exception("map failed", th));
                    this.aSJ.B(0, this.aSK - 12);
                    this.aSJ.f(4, this.aSL);
                    Op();
                }
            }
        }
    }

    private void er(int i4) {
        int i5;
        ArrayList<e> arrayList = this.aSU;
        if (arrayList == null || this.aSJ == null) {
            return;
        }
        Collections.sort(arrayList);
        Ow();
        e eVar = this.aSU.get(0);
        int i6 = eVar.start;
        int i7 = this.aSK;
        int i8 = i7 - this.aST;
        int i9 = i8 - 12;
        int i10 = i8 - i6;
        int i11 = i7 - i6;
        boolean z4 = i9 < i11 + i10;
        if (!z4) {
            this.aSL ^= this.aSJ.D(i6, i11);
        }
        int size = this.aSU.size();
        int i12 = size - 1;
        int i13 = this.aSK - this.aSU.get(i12).end;
        int[] iArr = new int[(i13 > 0 ? size : i12) << 1];
        int i14 = eVar.start;
        int i15 = eVar.end;
        for (int i16 = 1; i16 < size; i16++) {
            e eVar2 = this.aSU.get(i16);
            int i17 = eVar2.start - i15;
            byte[] bArr = this.aSJ.aSv;
            System.arraycopy(bArr, i15, bArr, i14, i17);
            int i18 = (i16 - 1) << 1;
            iArr[i18] = i15;
            iArr[i18 + 1] = i15 - i14;
            i14 += i17;
            i15 = eVar2.end;
        }
        if (i13 > 0) {
            byte[] bArr2 = this.aSJ.aSv;
            System.arraycopy(bArr2, i15, bArr2, i14, i13);
            int i19 = i12 << 1;
            iArr[i19] = i15;
            iArr[i19 + 1] = i15 - i14;
        }
        Ox();
        if (z4) {
            this.aSL = this.aSJ.D(12, i9);
        } else {
            this.aSL ^= this.aSJ.D(i6, i10);
        }
        this.aSK = i8;
        if (this.aSV == 0) {
            MappedByteBuffer mappedByteBuffer = this.aSH;
            if (mappedByteBuffer != null) {
                i5 = 0;
                mappedByteBuffer.putInt(0, -1);
                this.aSH.putLong(4, this.aSL);
                this.aSH.position(i6);
                this.aSH.put(this.aSJ.aSv, i6, i10);
                this.aSH.putInt(0, i9);
            } else {
                i5 = 0;
            }
            MappedByteBuffer mappedByteBuffer2 = this.aSI;
            if (mappedByteBuffer2 != null) {
                mappedByteBuffer2.putInt(i5, i9);
                this.aSI.putLong(4, this.aSL);
                this.aSI.position(i6);
                this.aSI.put(this.aSJ.aSv, i6, i10);
            }
        } else {
            this.aSJ.B(0, i9);
            this.aSJ.f(4, this.aSL);
        }
        a(i6, iArr);
        int i20 = i8 + i4;
        if (this.aSJ.aSv.length - i20 > aSA) {
            es(i20);
        }
        info("gc finish");
    }

    private void es(int i4) {
        int i5 = PAGE_SIZE;
        int E = E(i5, i4 + i5);
        com.kwad.sdk.utils.a.b bVar = this.aSJ;
        if (bVar != null) {
            byte[] bArr = bVar.aSv;
            if (E >= bArr.length) {
                return;
            }
            byte[] bArr2 = new byte[E];
            System.arraycopy(bArr, 0, bArr2, 0, this.aSK);
            this.aSJ.aSv = bArr2;
        }
        if (this.aSV == 0) {
            try {
                long j4 = E;
                this.aSD.truncate(j4);
                MappedByteBuffer map = this.aSD.map(FileChannel.MapMode.READ_WRITE, 0L, j4);
                this.aSH = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                this.aSE.truncate(j4);
                MappedByteBuffer map2 = this.aSE.map(FileChannel.MapMode.READ_WRITE, 0L, j4);
                this.aSI = map2;
                map2.order(byteOrder);
            } catch (Throwable th) {
                u(new Exception("map failed", th));
                Op();
            }
        }
        info("truncate finish");
    }

    private void g(Exception exc) {
        d dVar = this.aSC;
        if (dVar != null) {
            dVar.a(this.name, exc);
        }
    }

    private void h(File file, File file2) {
        try {
            if (ad(file)) {
                return;
            }
        } catch (IOException e5) {
            g(e5);
        }
        Or();
        try {
            if (ad(file2)) {
                return;
            }
        } catch (Exception e6) {
            g(e6);
        }
        Or();
    }

    private static void hq(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("key is empty");
        }
    }

    private void hr(String str) {
        d dVar = this.aSC;
        if (dVar != null) {
            dVar.e(this.name, new Exception(str));
        }
    }

    private void info(String str) {
        d dVar = this.aSC;
        if (dVar != null) {
            dVar.i(this.name, str);
        }
    }

    private synchronized void putDouble(String str, double d5) {
        hq(str);
        a.d dVar = (a.d) this.aSM.get(str);
        if (dVar == null) {
            a(str, (byte) 5);
            com.kwad.sdk.utils.a.b bVar = this.aSJ;
            if (bVar != null) {
                int i4 = bVar.position;
                bVar.aO(Double.doubleToRawLongBits(d5));
                Os();
                Map<String, a.b> map = this.aSM;
                if (map != null) {
                    map.put(str, new a.d(i4, d5));
                }
            }
            Ol();
            return;
        }
        if (dVar.value != d5) {
            long doubleToRawLongBits = Double.doubleToRawLongBits(d5);
            dVar.value = d5;
            b(doubleToRawLongBits, Double.doubleToRawLongBits(dVar.value) ^ doubleToRawLongBits, dVar.offset);
            Ol();
        }
    }

    private synchronized void putFloat(String str, float f5) {
        hq(str);
        a.e eVar = (a.e) this.aSM.get(str);
        if (eVar == null) {
            a(str, (byte) 3);
            com.kwad.sdk.utils.a.b bVar = this.aSJ;
            if (bVar != null) {
                int i4 = bVar.position;
                bVar.ei(Float.floatToRawIntBits(f5));
                Os();
                Map<String, a.b> map = this.aSM;
                if (map != null) {
                    map.put(str, new a.e(i4, f5));
                }
            }
            Ol();
            return;
        }
        if (eVar.value != f5) {
            int floatToRawIntBits = Float.floatToRawIntBits(f5);
            eVar.value = f5;
            a(floatToRawIntBits, (Float.floatToRawIntBits(eVar.value) ^ floatToRawIntBits) & 4294967295L, eVar.offset);
            Ol();
        }
    }

    private synchronized void putStringSet(String str, Set<String> set) {
        if (set == null) {
            remove(str);
        } else {
            a(str, (String) set, (b<String>) g.aTn);
        }
    }

    private void t(String str, int i4) {
        com.kwad.sdk.utils.a.b bVar = this.aSJ;
        if (bVar == null) {
            return;
        }
        bVar.e((byte) i4);
        if (i4 == str.length()) {
            com.kwad.sdk.utils.a.b bVar2 = this.aSJ;
            a(str, 0, i4, bVar2.aSv, bVar2.position);
            this.aSJ.position += i4;
            return;
        }
        this.aSJ.hm(str);
    }

    private void u(String str, int i4) {
        com.kwad.sdk.utils.a.b bVar = this.aSJ;
        if (bVar == null) {
            return;
        }
        bVar.a((short) i4);
        if (i4 == str.length()) {
            com.kwad.sdk.utils.a.b bVar2 = this.aSJ;
            a(str, 0, i4, bVar2.aSv, bVar2.position);
            return;
        }
        this.aSJ.hm(str);
    }

    private void updateBytes(int i4, byte[] bArr) {
        int length = bArr.length;
        com.kwad.sdk.utils.a.b bVar = this.aSJ;
        if (bVar != null) {
            this.aSL ^= bVar.D(i4, length);
            com.kwad.sdk.utils.a.b bVar2 = this.aSJ;
            bVar2.position = i4;
            bVar2.n(bArr);
            this.aSL ^= this.aSJ.D(i4, length);
        }
        if (this.aSV == 0) {
            MappedByteBuffer mappedByteBuffer = this.aSH;
            if (mappedByteBuffer != null) {
                mappedByteBuffer.putInt(0, -1);
                this.aSH.putLong(4, this.aSL);
                this.aSH.position(i4);
                this.aSH.put(bArr);
                this.aSH.putInt(0, this.aSK - 12);
            }
            MappedByteBuffer mappedByteBuffer2 = this.aSI;
            if (mappedByteBuffer2 != null) {
                mappedByteBuffer2.putLong(4, this.aSL);
                this.aSI.position(i4);
                this.aSI.put(bArr);
                return;
            }
            return;
        }
        com.kwad.sdk.utils.a.b bVar3 = this.aSJ;
        if (bVar3 != null) {
            bVar3.f(4, this.aSL);
        }
    }

    public final synchronized boolean contains(String str) {
        return this.aSM.containsKey(str);
    }

    public final synchronized Map<String, Object> getAll() {
        Object valueOf;
        int size = this.aSM.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry<String, a.b> entry : this.aSM.entrySet()) {
            String key = entry.getKey();
            a.b value = entry.getValue();
            Object obj = null;
            switch (value.Oe()) {
                case 1:
                    valueOf = Boolean.valueOf(((a.c) value).value);
                    break;
                case 2:
                    valueOf = Integer.valueOf(((a.f) value).value);
                    break;
                case 3:
                    valueOf = Float.valueOf(((a.e) value).value);
                    break;
                case 4:
                    valueOf = Long.valueOf(((a.g) value).value);
                    break;
                case 5:
                    valueOf = Double.valueOf(((a.d) value).value);
                    break;
                case 6:
                    a.i iVar = (a.i) value;
                    if (iVar.aSt) {
                        valueOf = a(iVar);
                        break;
                    } else {
                        valueOf = iVar.value;
                        break;
                    }
                case 7:
                    a.C0543a c0543a = (a.C0543a) value;
                    if (c0543a.aSt) {
                        valueOf = a(c0543a);
                        break;
                    } else {
                        valueOf = c0543a.value;
                        break;
                    }
                case 8:
                    a.h hVar = (a.h) value;
                    if (hVar.aSt) {
                        valueOf = a(hVar);
                        break;
                    } else {
                        valueOf = ((a.h) value).value;
                        break;
                    }
                default:
                    continue;
                    hashMap.put(key, obj);
            }
            obj = valueOf;
            hashMap.put(key, obj);
        }
        return hashMap;
    }

    public final synchronized boolean getBoolean(String str, boolean z4) {
        a.c cVar = (a.c) this.aSM.get(str);
        if (cVar == null) {
            return z4;
        }
        return cVar.value;
    }

    public final synchronized int getInt(String str, int i4) {
        a.f fVar = (a.f) this.aSM.get(str);
        if (fVar == null) {
            return i4;
        }
        return fVar.value;
    }

    public final synchronized long getLong(String str, long j4) {
        a.g gVar = (a.g) this.aSM.get(str);
        if (gVar == null) {
            return j4;
        }
        return gVar.value;
    }

    public final synchronized String getString(String str, String str2) {
        a.i iVar = (a.i) this.aSM.get(str);
        if (iVar != null) {
            if (iVar.aSt) {
                return a(iVar);
            }
            return (String) iVar.value;
        }
        return str2;
    }

    public final void putAll(Map<String, Object> map) {
        a(map, (Map<Class, b>) null);
    }

    public final synchronized void putBoolean(String str, boolean z4) {
        hq(str);
        a.c cVar = (a.c) this.aSM.get(str);
        if (cVar == null) {
            a(str, (byte) 1);
            com.kwad.sdk.utils.a.b bVar = this.aSJ;
            if (bVar != null) {
                int i4 = bVar.position;
                bVar.e((byte) (z4 ? 1 : 0));
                Os();
                Map<String, a.b> map = this.aSM;
                if (map != null) {
                    map.put(str, new a.c(i4, z4));
                }
            }
            Ol();
            return;
        }
        if (cVar.value != z4) {
            cVar.value = z4;
            a((byte) (z4 ? 1 : 0), cVar.offset);
            Ol();
        }
    }

    public final synchronized void putInt(String str, int i4) {
        hq(str);
        a.f fVar = (a.f) this.aSM.get(str);
        if (fVar == null) {
            a(str, (byte) 2);
            com.kwad.sdk.utils.a.b bVar = this.aSJ;
            if (bVar != null) {
                int i5 = bVar.position;
                bVar.ei(i4);
                Os();
                Map<String, a.b> map = this.aSM;
                if (map != null) {
                    map.put(str, new a.f(i5, i4));
                }
            }
            Ol();
            return;
        }
        int i6 = fVar.value;
        if (i6 != i4) {
            fVar.value = i4;
            a(i4, (i6 ^ i4) & 4294967295L, fVar.offset);
            Ol();
        }
    }

    public final synchronized void putLong(String str, long j4) {
        hq(str);
        a.g gVar = (a.g) this.aSM.get(str);
        if (gVar == null) {
            a(str, (byte) 4);
            com.kwad.sdk.utils.a.b bVar = this.aSJ;
            if (bVar != null) {
                int i4 = bVar.position;
                bVar.aO(j4);
                Os();
                Map<String, a.b> map = this.aSM;
                if (map != null) {
                    map.put(str, new a.g(i4, j4));
                }
            }
            Ol();
            return;
        }
        long j5 = gVar.value;
        if (j5 != j4) {
            gVar.value = j4;
            b(j4, j4 ^ j5, gVar.offset);
            Ol();
        }
    }

    public final synchronized void putString(String str, String str2) {
        byte[] hp;
        byte[] bArr;
        byte[] bArr2;
        hq(str);
        if (str2 == null) {
            remove(str);
            return;
        }
        a.i iVar = (a.i) this.aSM.get(str);
        if (str2.length() * 3 < 2048) {
            a(str, str2, iVar);
            return;
        }
        if (str2.isEmpty()) {
            hp = aSx;
        } else {
            if (iVar == null && str2.length() < 2048) {
                int hn = com.kwad.sdk.utils.a.b.hn(str2);
                bArr = new byte[hn];
                if (hn == str2.length()) {
                    a(str2, 0, hn, bArr, 0);
                    bArr2 = bArr;
                } else {
                    hp = com.kwad.sdk.utils.a.b.hp(str2);
                }
            } else if (iVar != null && !iVar.aSt) {
                int hn2 = com.kwad.sdk.utils.a.b.hn(str2);
                bArr = new byte[hn2];
                if (hn2 == str2.length()) {
                    a(str2, 0, hn2, bArr, 0);
                    bArr2 = bArr;
                } else {
                    hp = com.kwad.sdk.utils.a.b.hp(str2);
                }
            } else {
                hp = com.kwad.sdk.utils.a.b.hp(str2);
            }
            a(str, str2, bArr2, iVar, (byte) 6);
        }
        bArr2 = hp;
        a(str, str2, bArr2, iVar, (byte) 6);
    }

    public final void release() {
        h.closeQuietly(this.aSF);
        h.closeQuietly(this.aSG);
        h.closeQuietly(this.aSD);
        h.closeQuietly(this.aSE);
        this.aSD = null;
        this.aSE = null;
        this.aSH = null;
        this.aSI = null;
        C0544c c0544c = a.aTa;
        C0544c.remove(this.Wx + this.name);
    }

    public final synchronized void remove(String str) {
        a.b bVar = this.aSM.get(str);
        if (bVar != null) {
            this.aSM.remove(str);
            byte Oe = bVar.Oe();
            String str2 = null;
            if (Oe <= 5) {
                int hn = com.kwad.sdk.utils.a.b.hn(str);
                int i4 = bVar.offset;
                a(Oe, i4 - (hn + 2), i4 + aSw[Oe]);
            } else {
                a.j jVar = (a.j) bVar;
                a(Oe, jVar.start, jVar.offset + jVar.aSs);
                if (jVar.aSt) {
                    str2 = (String) jVar.value;
                }
            }
            byte b5 = (byte) (Oe | Byte.MIN_VALUE);
            if (this.aSV == 0) {
                MappedByteBuffer mappedByteBuffer = this.aSH;
                if (mappedByteBuffer != null) {
                    mappedByteBuffer.putLong(4, this.aSL);
                    this.aSH.put(this.aSQ, b5);
                }
                MappedByteBuffer mappedByteBuffer2 = this.aSI;
                if (mappedByteBuffer2 != null) {
                    mappedByteBuffer2.putLong(4, this.aSL);
                    this.aSI.put(this.aSQ, b5);
                }
            } else {
                com.kwad.sdk.utils.a.b bVar2 = this.aSJ;
                if (bVar2 != null) {
                    bVar2.f(4, this.aSL);
                }
            }
            this.aSQ = 0;
            if (str2 != null) {
                h.h(new File(this.Wx + this.name, str2));
            }
            Ov();
            Ol();
        }
    }

    public final synchronized String toString() {
        return "FastKV: path:" + this.Wx + " name:" + this.name;
    }

    private boolean a(com.kwad.sdk.utils.a.b bVar) {
        int length = bVar.aSv.length;
        File file = new File(this.Wx, this.name + ".kva");
        File file2 = new File(this.Wx, this.name + ".kvb");
        try {
            if (h.ae(file) && h.ae(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, net.lingala.zip4j.util.e.f71861e0);
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, net.lingala.zip4j.util.e.f71861e0);
                long j4 = length;
                randomAccessFile.setLength(j4);
                randomAccessFile2.setLength(j4);
                this.aSD = randomAccessFile.getChannel();
                this.aSE = randomAccessFile2.getChannel();
                MappedByteBuffer map = this.aSD.map(FileChannel.MapMode.READ_WRITE, 0L, j4);
                this.aSH = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                MappedByteBuffer map2 = this.aSE.map(FileChannel.MapMode.READ_WRITE, 0L, j4);
                this.aSI = map2;
                map2.order(byteOrder);
                this.aSH.put(bVar.aSv, 0, this.aSK);
                this.aSI.put(bVar.aSv, 0, this.aSK);
                return true;
            }
            throw new Exception("open file failed");
        } catch (Exception e5) {
            u(e5);
            return false;
        }
    }

    private synchronized void b(String str, byte[] bArr) {
        hq(str);
        if (bArr == null) {
            remove(str);
        } else {
            a(str, bArr, bArr, (a.C0543a) this.aSM.get(str), (byte) 7);
        }
    }

    private void u(Throwable th) {
        d dVar = this.aSC;
        if (dVar != null) {
            dVar.e(this.name, th);
        }
    }

    private void b(MappedByteBuffer mappedByteBuffer) {
        if (mappedByteBuffer == null) {
            return;
        }
        if (this.aSR && mappedByteBuffer != this.aSH) {
            mappedByteBuffer.putInt(0, this.aSK - 12);
        }
        mappedByteBuffer.putLong(4, this.aSL);
        int i4 = this.aSQ;
        if (i4 != 0) {
            mappedByteBuffer.put(i4, this.aSJ.aSv[i4]);
        }
        if (this.aSP != 0) {
            mappedByteBuffer.position(this.aSO);
            mappedByteBuffer.put(this.aSJ.aSv, this.aSO, this.aSP);
        }
    }

    private void b(long j4, long j5, int i4) {
        long e5 = e(j5, i4) ^ this.aSL;
        this.aSL = e5;
        if (this.aSV == 0) {
            MappedByteBuffer mappedByteBuffer = this.aSH;
            if (mappedByteBuffer != null) {
                mappedByteBuffer.putLong(4, e5);
                this.aSH.putLong(i4, j4);
            }
            MappedByteBuffer mappedByteBuffer2 = this.aSI;
            if (mappedByteBuffer2 != null) {
                mappedByteBuffer2.putLong(4, this.aSL);
                this.aSI.putLong(i4, j4);
            }
        } else {
            com.kwad.sdk.utils.a.b bVar = this.aSJ;
            if (bVar != null) {
                bVar.f(4, e5);
            }
        }
        com.kwad.sdk.utils.a.b bVar2 = this.aSJ;
        if (bVar2 != null) {
            bVar2.f(i4, j4);
        }
    }

    private void a(MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i4) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            try {
                MappedByteBuffer map = (mappedByteBuffer2 == this.aSI ? this.aSE : this.aSD).map(FileChannel.MapMode.READ_WRITE, 0L, mappedByteBuffer.capacity());
                map.order(ByteOrder.LITTLE_ENDIAN);
                if (mappedByteBuffer2 == this.aSI) {
                    this.aSI = map;
                } else {
                    this.aSH = map;
                }
                mappedByteBuffer2 = map;
            } catch (Exception e5) {
                u(e5);
                Op();
                return;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i4);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    private int b(String str, byte[] bArr, byte b5) {
        a(str, b5, bArr.length + 2);
        com.kwad.sdk.utils.a.b bVar = this.aSJ;
        if (bVar != null) {
            bVar.a((short) bArr.length);
            com.kwad.sdk.utils.a.b bVar2 = this.aSJ;
            int i4 = bVar2.position;
            bVar2.n(bArr);
            return i4;
        }
        return 0;
    }

    private String a(a.i iVar) {
        byte[] bytes;
        try {
            byte[] af = h.af(new File(this.Wx + this.name, (String) iVar.value));
            String str = new String(af);
            return (af == null || TextUtils.isEmpty(str) || (bytes = com.kwad.sdk.utils.a.b.j(af, com.kwad.sdk.utils.a.b.hn(str)).getBytes()) == null || bytes.length == 0) ? "" : new String(bytes, com.kwad.sdk.utils.a.b.UTF_8);
        } catch (Exception e5) {
            u(e5);
        }
        return "";
    }

    private byte[] a(a.C0543a c0543a) {
        try {
            byte[] af = h.af(new File(this.Wx + this.name, (String) c0543a.value));
            return af != null ? af : aSx;
        } catch (Exception e5) {
            u(e5);
            return aSx;
        }
    }

    private Object a(a.h hVar) {
        try {
            byte[] af = h.af(new File(this.Wx + this.name, (String) hVar.value));
            if (af != null) {
                int i4 = af[0] & 255;
                String str = new String(af, 1, i4, com.kwad.sdk.utils.a.b.UTF_8);
                b bVar = this.aSB.get(str);
                if (bVar != null) {
                    int i5 = i4 + 1;
                    return bVar.g(af, i5, af.length - i5);
                }
                g(new Exception("No encoder for tag:" + str));
                return null;
            }
            g(new Exception("Read object data failed"));
            return null;
        } catch (Exception e5) {
            u(e5);
            return null;
        }
    }

    private synchronized <T> void a(String str, T t4, b<T> bVar) {
        hq(str);
        if (bVar == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Encoder is null");
            if (!com.kwad.library.a.a.md.booleanValue()) {
                u(illegalArgumentException);
                return;
            }
            throw illegalArgumentException;
        }
        String Oz = bVar.Oz();
        if (!Oz.isEmpty() && Oz.length() <= 50) {
            if (!this.aSB.containsKey(Oz)) {
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Encoder hasn't been registered");
                if (!com.kwad.library.a.a.md.booleanValue()) {
                    u(illegalArgumentException2);
                    return;
                }
                throw illegalArgumentException2;
            } else if (t4 == null) {
                remove(str);
                return;
            } else {
                byte[] bArr = null;
                try {
                    bArr = bVar.m(t4);
                } catch (Exception e5) {
                    u(e5);
                }
                if (bArr == null) {
                    remove(str);
                    return;
                }
                int hn = com.kwad.sdk.utils.a.b.hn(Oz);
                com.kwad.sdk.utils.a.b bVar2 = new com.kwad.sdk.utils.a.b(hn + 1 + bArr.length);
                bVar2.e((byte) hn);
                bVar2.hm(Oz);
                bVar2.n(bArr);
                a(str, t4, bVar2.aSv, (a.h) this.aSM.get(str), (byte) 8);
                return;
            }
        }
        IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Invalid encoder tag:" + Oz);
        if (!com.kwad.library.a.a.md.booleanValue()) {
            u(illegalArgumentException3);
            return;
        }
        throw illegalArgumentException3;
    }

    private synchronized void a(Map<String, Object> map, Map<Class, b> map2) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && !key.isEmpty()) {
                if (value instanceof String) {
                    putString(key, (String) value);
                } else if (value instanceof Boolean) {
                    putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    putInt(key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    putLong(key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    putFloat(key, ((Float) value).floatValue());
                } else if (value instanceof Double) {
                    putDouble(key, ((Double) value).doubleValue());
                } else if (value instanceof Set) {
                    Set set = (Set) value;
                    if (!set.isEmpty() && (set.iterator().next() instanceof String)) {
                        putStringSet(key, (Set) value);
                    }
                } else if (value instanceof byte[]) {
                    b(key, (byte[]) value);
                } else {
                    g(new Exception("missing encoders"));
                }
            }
        }
    }

    private void a(MappedByteBuffer mappedByteBuffer) {
        if (mappedByteBuffer == null) {
            return;
        }
        int capacity = mappedByteBuffer.capacity();
        int i4 = PAGE_SIZE;
        if (capacity != i4) {
            FileChannel fileChannel = mappedByteBuffer == this.aSH ? this.aSD : this.aSE;
            if (fileChannel == null) {
                return;
            }
            fileChannel.truncate(i4);
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, i4);
            map.order(ByteOrder.LITTLE_ENDIAN);
            if (mappedByteBuffer == this.aSH) {
                this.aSH = map;
            } else {
                this.aSI = map;
            }
            mappedByteBuffer = map;
        }
        mappedByteBuffer.putInt(0, 0);
        mappedByteBuffer.putLong(4, 0L);
    }

    private void a(String str, byte b5) {
        a(str, b5, aSw[b5]);
    }

    private void a(String str, byte b5, int i4) {
        int hn = com.kwad.sdk.utils.a.b.hn(str);
        ep(hn);
        this.aSP = hn + 2 + i4;
        Ou();
        com.kwad.sdk.utils.a.b bVar = this.aSJ;
        if (bVar != null) {
            bVar.e(b5);
        }
        t(str, hn);
    }

    private void a(byte b5, int i4) {
        long e5 = this.aSL ^ e(1L, i4);
        this.aSL = e5;
        if (this.aSV == 0) {
            MappedByteBuffer mappedByteBuffer = this.aSH;
            if (mappedByteBuffer != null) {
                mappedByteBuffer.putLong(4, e5);
                this.aSH.put(i4, b5);
            }
            MappedByteBuffer mappedByteBuffer2 = this.aSI;
            if (mappedByteBuffer2 != null) {
                mappedByteBuffer2.putLong(4, this.aSL);
                this.aSI.put(i4, b5);
            }
        } else {
            com.kwad.sdk.utils.a.b bVar = this.aSJ;
            if (bVar != null) {
                bVar.f(4, e5);
            }
        }
        com.kwad.sdk.utils.a.b bVar2 = this.aSJ;
        if (bVar2 != null) {
            bVar2.aSv[i4] = b5;
        }
    }

    private void a(int i4, long j4, int i5) {
        long e5 = e(j4, i5) ^ this.aSL;
        this.aSL = e5;
        if (this.aSV == 0) {
            MappedByteBuffer mappedByteBuffer = this.aSH;
            if (mappedByteBuffer != null) {
                mappedByteBuffer.putLong(4, e5);
                this.aSH.putInt(i5, i4);
            }
            MappedByteBuffer mappedByteBuffer2 = this.aSI;
            if (mappedByteBuffer2 != null) {
                mappedByteBuffer2.putLong(4, this.aSL);
                this.aSI.putInt(i5, i4);
            }
        } else {
            com.kwad.sdk.utils.a.b bVar = this.aSJ;
            if (bVar != null) {
                bVar.f(4, e5);
            }
        }
        com.kwad.sdk.utils.a.b bVar2 = this.aSJ;
        if (bVar2 != null) {
            bVar2.B(i5, i4);
        }
    }

    private static void a(String str, int i4, int i5, byte[] bArr, int i6) {
        int i7;
        if (i5 <= str.length() && i5 >= 0) {
            int i8 = 0;
            while (i8 < i5) {
                int i9 = i8 + 1;
                char charAt = str.charAt(i8);
                if (charAt < 128) {
                    i7 = i6 + 1;
                    bArr[i6] = (byte) (((byte) charAt) ^ 1);
                } else {
                    i7 = i6 + 1;
                    bArr[i6] = (byte) charAt;
                }
                i8 = i9;
                i6 = i7;
            }
        }
    }

    private void a(String str, String str2, a.i iVar) {
        int hn = com.kwad.sdk.utils.a.b.hn(str2);
        if (iVar == null) {
            int hn2 = com.kwad.sdk.utils.a.b.hn(str);
            ep(hn2);
            int i4 = hn2 + 4;
            this.aSP = i4 + hn;
            Ou();
            com.kwad.sdk.utils.a.b bVar = this.aSJ;
            if (bVar != null) {
                bVar.e((byte) 6);
            }
            t(str, hn2);
            u(str2, hn);
            Map<String, a.b> map = this.aSM;
            int i5 = this.aSO;
            map.put(str, new a.i(i5, i5 + i4, str2, hn, false));
            Os();
        } else {
            int i6 = iVar.offset;
            int i7 = i6 - iVar.start;
            int i8 = iVar.aSs;
            boolean z4 = true;
            if (i8 == hn) {
                this.aSL = this.aSJ.D(i6, i8) ^ this.aSL;
                if (hn == str2.length()) {
                    a(str2, 0, hn, this.aSJ.aSv, iVar.offset);
                } else {
                    com.kwad.sdk.utils.a.b bVar2 = this.aSJ;
                    if (bVar2 != null) {
                        bVar2.position = iVar.offset;
                        bVar2.hm(str2);
                    }
                }
                this.aSO = iVar.offset;
                this.aSP = hn;
                z4 = false;
            } else {
                this.aSP = i7 + hn;
                Ou();
                com.kwad.sdk.utils.a.b bVar3 = this.aSJ;
                if (bVar3 != null) {
                    bVar3.e((byte) 6);
                }
                int i9 = i7 - 3;
                com.kwad.sdk.utils.a.b bVar4 = this.aSJ;
                if (bVar4 != null) {
                    byte[] bArr = bVar4.aSv;
                    System.arraycopy(bArr, iVar.start + 1, bArr, bVar4.position, i9);
                }
                com.kwad.sdk.utils.a.b bVar5 = this.aSJ;
                if (bVar5 != null) {
                    bVar5.position += i9;
                }
                u(str2, hn);
                a((byte) 6, iVar.start, iVar.offset + iVar.aSs);
                r10 = iVar.aSt ? (String) iVar.value : null;
                iVar.aSt = false;
                int i10 = this.aSO;
                iVar.start = i10;
                iVar.offset = i10 + i7;
                iVar.aSs = hn;
            }
            iVar.value = str2;
            Os();
            if (z4) {
                Ov();
            }
            if (r10 != null) {
                h.h(new File(this.Wx + this.name, r10));
            }
        }
        Ol();
    }

    private void a(String str, Object obj, byte[] bArr, a.j jVar, byte b5) {
        if (jVar == null) {
            a(str, obj, bArr, b5);
        } else if (!jVar.aSt && jVar.aSs == bArr.length) {
            updateBytes(jVar.offset, bArr);
            jVar.value = obj;
        } else {
            a(str, obj, bArr, jVar);
        }
        Ol();
    }

    private void a(String str, Object obj, byte[] bArr, byte b5) {
        String str2;
        int length;
        a.b hVar;
        int a5 = a(str, bArr, b5);
        if (a5 != 0) {
            String str3 = this.aSS;
            boolean z4 = str3 != null;
            if (z4) {
                this.aSS = null;
                str2 = str3;
                length = 32;
            } else {
                str2 = obj;
                length = bArr.length;
            }
            if (b5 == 6) {
                hVar = new a.i(this.aSO, a5, (String) str2, length, z4);
            } else if (b5 == 7) {
                hVar = new a.C0543a(this.aSO, a5, str2, length, z4);
            } else {
                hVar = new a.h(this.aSO, a5, str2, length, z4);
            }
            this.aSM.put(str, hVar);
            Os();
        }
    }

    private void a(String str, Object obj, byte[] bArr, @NonNull a.j jVar) {
        int a5 = a(str, bArr, jVar.Oe());
        if (a5 != 0) {
            String str2 = jVar.aSt ? (String) jVar.value : null;
            a(jVar.Oe(), jVar.start, jVar.offset + jVar.aSs);
            String str3 = this.aSS;
            boolean z4 = str3 != null;
            jVar.start = this.aSO;
            jVar.offset = a5;
            jVar.aSt = z4;
            if (z4) {
                jVar.value = str3;
                jVar.aSs = 32;
                this.aSS = null;
            } else {
                jVar.value = obj;
                jVar.aSs = bArr.length;
            }
            Os();
            Ov();
            if (str2 != null) {
                h.h(new File(this.Wx + this.name, str2));
            }
        }
    }

    private int a(String str, byte[] bArr, byte b5) {
        this.aSS = null;
        if (bArr.length < 2048) {
            return b(str, bArr, b5);
        }
        info("large value, key: " + str + ", size: " + bArr.length);
        String OB = h.OB();
        if (h.a(new File(this.Wx + this.name, OB), bArr)) {
            this.aSS = OB;
            byte[] bArr2 = new byte[32];
            OB.getBytes(0, 32, bArr2, 0);
            return b(str, bArr2, (byte) (b5 | 64));
        }
        hr("save large value failed");
        return 0;
    }

    private void a(byte b5, int i4, int i5) {
        byte[] bArr;
        F(i4, i5);
        byte b6 = (byte) (b5 | Byte.MIN_VALUE);
        com.kwad.sdk.utils.a.b bVar = this.aSJ;
        if (bVar != null && (bArr = bVar.aSv) != null) {
            this.aSL = (((bArr[i4] ^ b6) & 255) << ((i4 & 7) << 3)) ^ this.aSL;
            bArr[i4] = b6;
        }
        this.aSQ = i4;
    }

    private void a(int i4, int[] iArr) {
        Map<String, a.b> map = this.aSM;
        if (map == null) {
            return;
        }
        for (a.b bVar : map.values()) {
            int i5 = bVar.offset;
            if (i5 > i4) {
                int i6 = iArr[(h.binarySearch(iArr, i5) << 1) + 1];
                bVar.offset -= i6;
                if (bVar.Oe() >= 6) {
                    ((a.j) bVar).start -= i6;
                }
            }
        }
    }
}
