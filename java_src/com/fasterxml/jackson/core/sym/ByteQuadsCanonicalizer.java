package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes3.dex */
public final class ByteQuadsCanonicalizer {
    private static final int DEFAULT_T_SIZE = 64;
    static final int MAX_ENTRIES_FOR_REUSE = 6000;
    private static final int MAX_T_SIZE = 65536;
    private static final int MIN_HASH_SIZE = 16;
    private static final int MULT = 33;
    private static final int MULT2 = 65599;
    private static final int MULT3 = 31;
    protected int _count;
    protected final boolean _failOnDoS;
    protected int[] _hashArea;
    protected boolean _hashShared;
    protected int _hashSize;
    protected boolean _intern;
    protected int _longNameOffset;
    protected String[] _names;
    protected final ByteQuadsCanonicalizer _parent;
    protected int _secondaryStart;
    protected final int _seed;
    protected int _spilloverEnd;
    protected final AtomicReference<TableInfo> _tableInfo;
    protected int _tertiaryShift;
    protected int _tertiaryStart;

    private ByteQuadsCanonicalizer(int i4, boolean z4, int i5, boolean z5) {
        this._parent = null;
        this._seed = i5;
        this._intern = z4;
        this._failOnDoS = z5;
        int i6 = 16;
        if (i4 < 16) {
            i4 = 16;
        } else if (((i4 - 1) & i4) != 0) {
            while (i6 < i4) {
                i6 += i6;
            }
            i4 = i6;
        }
        this._tableInfo = new AtomicReference<>(TableInfo.createInitial(i4));
    }

    private int _appendLongName(int[] iArr, int i4) {
        int i5 = this._longNameOffset;
        int i6 = i5 + i4;
        int[] iArr2 = this._hashArea;
        if (i6 > iArr2.length) {
            this._hashArea = Arrays.copyOf(this._hashArea, this._hashArea.length + Math.max(i6 - iArr2.length, Math.min(4096, this._hashSize)));
        }
        System.arraycopy(iArr, 0, this._hashArea, i5, i4);
        this._longNameOffset += i4;
        return i5;
    }

    private final int _calcOffset(int i4) {
        return (i4 & (this._hashSize - 1)) << 2;
    }

    static int _calcTertiaryShift(int i4) {
        int i5 = i4 >> 2;
        if (i5 < 64) {
            return 4;
        }
        if (i5 <= 256) {
            return 5;
        }
        return i5 <= 1024 ? 6 : 7;
    }

    private boolean _checkNeedForRehash() {
        if (this._count > (this._hashSize >> 1)) {
            int _spilloverStart = (this._spilloverEnd - _spilloverStart()) >> 2;
            int i4 = this._count;
            if (_spilloverStart <= ((i4 + 1) >> 7)) {
                double d5 = this._hashSize;
                Double.isNaN(d5);
                if (i4 <= d5 * 0.8d) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private int _findOffsetForAdd(int i4) {
        int _calcOffset = _calcOffset(i4);
        int[] iArr = this._hashArea;
        if (iArr[_calcOffset + 3] == 0) {
            return _calcOffset;
        }
        if (_checkNeedForRehash()) {
            return _resizeAndFindOffsetForAdd(i4);
        }
        int i5 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        if (iArr[i5 + 3] == 0) {
            return i5;
        }
        int i6 = this._tertiaryStart;
        int i7 = this._tertiaryShift;
        int i8 = i6 + ((_calcOffset >> (i7 + 2)) << i7);
        int i9 = (1 << i7) + i8;
        while (i8 < i9) {
            if (iArr[i8 + 3] == 0) {
                return i8;
            }
            i8 += 4;
        }
        int i10 = this._spilloverEnd;
        int i11 = i10 + 4;
        this._spilloverEnd = i11;
        if (i11 >= (this._hashSize << 3)) {
            if (this._failOnDoS) {
                _reportTooManyCollisions();
            }
            return _resizeAndFindOffsetForAdd(i4);
        }
        return i10;
    }

    private String _findSecondary(int i4, int i5) {
        int i6 = this._tertiaryStart;
        int i7 = this._tertiaryShift;
        int i8 = i6 + ((i4 >> (i7 + 2)) << i7);
        int[] iArr = this._hashArea;
        int i9 = (1 << i7) + i8;
        while (i8 < i9) {
            int i10 = iArr[i8 + 3];
            if (i5 == iArr[i8] && 1 == i10) {
                return this._names[i8 >> 2];
            }
            if (i10 == 0) {
                return null;
            }
            i8 += 4;
        }
        for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
            if (i5 == iArr[_spilloverStart] && 1 == iArr[_spilloverStart + 3]) {
                return this._names[_spilloverStart >> 2];
            }
        }
        return null;
    }

    private int _resizeAndFindOffsetForAdd(int i4) {
        rehash();
        int _calcOffset = _calcOffset(i4);
        int[] iArr = this._hashArea;
        if (iArr[_calcOffset + 3] == 0) {
            return _calcOffset;
        }
        int i5 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        if (iArr[i5 + 3] == 0) {
            return i5;
        }
        int i6 = this._tertiaryStart;
        int i7 = this._tertiaryShift;
        int i8 = i6 + ((_calcOffset >> (i7 + 2)) << i7);
        int i9 = (1 << i7) + i8;
        while (i8 < i9) {
            if (iArr[i8 + 3] == 0) {
                return i8;
            }
            i8 += 4;
        }
        int i10 = this._spilloverEnd;
        this._spilloverEnd = i10 + 4;
        return i10;
    }

    private final int _spilloverStart() {
        int i4 = this._hashSize;
        return (i4 << 3) - i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean _verifyLongName(int[] r6, int r7, int r8) {
        /*
            r5 = this;
            int[] r0 = r5._hashArea
            r1 = 0
            r2 = 1
            switch(r7) {
                case 4: goto L42;
                case 5: goto L34;
                case 6: goto L26;
                case 7: goto L18;
                case 8: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r6 = r5._verifyLongName2(r6, r7, r8)
            return r6
        Lc:
            r7 = r6[r1]
            int r3 = r8 + 1
            r8 = r0[r8]
            if (r7 == r8) goto L15
            return r1
        L15:
            r8 = r3
            r7 = 1
            goto L19
        L18:
            r7 = 0
        L19:
            int r3 = r7 + 1
            r7 = r6[r7]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r7 == r8) goto L24
            return r1
        L24:
            r8 = r4
            goto L27
        L26:
            r3 = 0
        L27:
            int r7 = r3 + 1
            r3 = r6[r3]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r3 == r8) goto L32
            return r1
        L32:
            r8 = r4
            goto L35
        L34:
            r7 = 0
        L35:
            int r3 = r7 + 1
            r7 = r6[r7]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r7 == r8) goto L40
            return r1
        L40:
            r8 = r4
            goto L43
        L42:
            r3 = 0
        L43:
            int r7 = r3 + 1
            r3 = r6[r3]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r3 == r8) goto L4e
            return r1
        L4e:
            int r8 = r7 + 1
            r7 = r6[r7]
            int r3 = r4 + 1
            r4 = r0[r4]
            if (r7 == r4) goto L59
            return r1
        L59:
            int r7 = r8 + 1
            r8 = r6[r8]
            int r4 = r3 + 1
            r3 = r0[r3]
            if (r8 == r3) goto L64
            return r1
        L64:
            r6 = r6[r7]
            r7 = r0[r4]
            if (r6 == r7) goto L6b
            return r1
        L6b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._verifyLongName(int[], int, int):boolean");
    }

    private boolean _verifyLongName2(int[] iArr, int i4, int i5) {
        int i6 = 0;
        while (true) {
            int i7 = i6 + 1;
            int i8 = i5 + 1;
            if (iArr[i6] != this._hashArea[i5]) {
                return false;
            }
            if (i7 >= i4) {
                return true;
            }
            i6 = i7;
            i5 = i8;
        }
    }

    private void _verifySharing() {
        if (this._hashShared) {
            int[] iArr = this._hashArea;
            this._hashArea = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this._names;
            this._names = (String[]) Arrays.copyOf(strArr, strArr.length);
            this._hashShared = false;
        }
    }

    public static ByteQuadsCanonicalizer createRoot() {
        long currentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    private void mergeChild(TableInfo tableInfo) {
        int i4 = tableInfo.count;
        TableInfo tableInfo2 = this._tableInfo.get();
        if (i4 == tableInfo2.count) {
            return;
        }
        if (i4 > 6000) {
            tableInfo = TableInfo.createInitial(64);
        }
        this._tableInfo.compareAndSet(tableInfo2, tableInfo);
    }

    private void nukeSymbols(boolean z4) {
        this._count = 0;
        this._spilloverEnd = _spilloverStart();
        this._longNameOffset = this._hashSize << 3;
        if (z4) {
            Arrays.fill(this._hashArea, 0);
            Arrays.fill(this._names, (Object) null);
        }
    }

    private void rehash() {
        this._hashShared = false;
        int[] iArr = this._hashArea;
        String[] strArr = this._names;
        int i4 = this._hashSize;
        int i5 = this._count;
        int i6 = i4 + i4;
        int i7 = this._spilloverEnd;
        if (i6 > 65536) {
            nukeSymbols(true);
            return;
        }
        this._hashArea = new int[iArr.length + (i4 << 3)];
        this._hashSize = i6;
        int i8 = i6 << 2;
        this._secondaryStart = i8;
        this._tertiaryStart = i8 + (i8 >> 1);
        this._tertiaryShift = _calcTertiaryShift(i6);
        this._names = new String[strArr.length << 1];
        nukeSymbols(false);
        int[] iArr2 = new int[16];
        int i9 = 0;
        for (int i10 = 0; i10 < i7; i10 += 4) {
            int i11 = iArr[i10 + 3];
            if (i11 != 0) {
                i9++;
                String str = strArr[i10 >> 2];
                if (i11 == 1) {
                    iArr2[0] = iArr[i10];
                    addName(str, iArr2, 1);
                } else if (i11 == 2) {
                    iArr2[0] = iArr[i10];
                    iArr2[1] = iArr[i10 + 1];
                    addName(str, iArr2, 2);
                } else if (i11 != 3) {
                    if (i11 > iArr2.length) {
                        iArr2 = new int[i11];
                    }
                    System.arraycopy(iArr, iArr[i10 + 1], iArr2, 0, i11);
                    addName(str, iArr2, i11);
                } else {
                    iArr2[0] = iArr[i10];
                    iArr2[1] = iArr[i10 + 1];
                    iArr2[2] = iArr[i10 + 2];
                    addName(str, iArr2, 3);
                }
            }
        }
        if (i9 == i5) {
            return;
        }
        throw new IllegalStateException("Failed rehash(): old count=" + i5 + ", copyCount=" + i9);
    }

    protected void _reportTooManyCollisions() {
        if (this._hashSize <= 1024) {
            return;
        }
        throw new IllegalStateException("Spill-over slots in symbol table with " + this._count + " entries, hash area of " + this._hashSize + " slots is now full (all " + (this._hashSize >> 3) + " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
    }

    public String addName(String str, int i4) {
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        int _findOffsetForAdd = _findOffsetForAdd(calcHash(i4));
        int[] iArr = this._hashArea;
        iArr[_findOffsetForAdd] = i4;
        iArr[_findOffsetForAdd + 3] = 1;
        this._names[_findOffsetForAdd >> 2] = str;
        this._count++;
        return str;
    }

    public int bucketCount() {
        return this._hashSize;
    }

    public int calcHash(int i4) {
        int i5 = i4 ^ this._seed;
        int i6 = i5 + (i5 >>> 16);
        int i7 = i6 ^ (i6 << 3);
        return i7 + (i7 >>> 12);
    }

    public String findName(int i4) {
        int _calcOffset = _calcOffset(calcHash(i4));
        int[] iArr = this._hashArea;
        int i5 = iArr[_calcOffset + 3];
        if (i5 == 1) {
            if (iArr[_calcOffset] == i4) {
                return this._names[_calcOffset >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        int i7 = iArr[i6 + 3];
        if (i7 == 1) {
            if (iArr[i6] == i4) {
                return this._names[i6 >> 2];
            }
        } else if (i7 == 0) {
            return null;
        }
        return _findSecondary(_calcOffset, i4);
    }

    public int hashSeed() {
        return this._seed;
    }

    public ByteQuadsCanonicalizer makeChild(int i4) {
        return new ByteQuadsCanonicalizer(this, JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i4), this._seed, JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i4), this._tableInfo.get());
    }

    public boolean maybeDirty() {
        return !this._hashShared;
    }

    public int primaryCount() {
        int i4 = this._secondaryStart;
        int i5 = 0;
        for (int i6 = 3; i6 < i4; i6 += 4) {
            if (this._hashArea[i6] != 0) {
                i5++;
            }
        }
        return i5;
    }

    public void release() {
        if (this._parent == null || !maybeDirty()) {
            return;
        }
        this._parent.mergeChild(new TableInfo(this));
        this._hashShared = true;
    }

    public int secondaryCount() {
        int i4 = this._tertiaryStart;
        int i5 = 0;
        for (int i6 = this._secondaryStart + 3; i6 < i4; i6 += 4) {
            if (this._hashArea[i6] != 0) {
                i5++;
            }
        }
        return i5;
    }

    public int size() {
        AtomicReference<TableInfo> atomicReference = this._tableInfo;
        if (atomicReference != null) {
            return atomicReference.get().count;
        }
        return this._count;
    }

    public int spilloverCount() {
        return (this._spilloverEnd - _spilloverStart()) >> 2;
    }

    public int tertiaryCount() {
        int i4 = this._tertiaryStart + 3;
        int i5 = this._hashSize + i4;
        int i6 = 0;
        while (i4 < i5) {
            if (this._hashArea[i4] != 0) {
                i6++;
            }
            i4 += 4;
        }
        return i6;
    }

    public String toString() {
        int primaryCount = primaryCount();
        int secondaryCount = secondaryCount();
        int tertiaryCount = tertiaryCount();
        int spilloverCount = spilloverCount();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", ByteQuadsCanonicalizer.class.getName(), Integer.valueOf(this._count), Integer.valueOf(this._hashSize), Integer.valueOf(primaryCount), Integer.valueOf(secondaryCount), Integer.valueOf(tertiaryCount), Integer.valueOf(spilloverCount), Integer.valueOf(primaryCount + secondaryCount + tertiaryCount + spilloverCount), Integer.valueOf(totalCount()));
    }

    public int totalCount() {
        int i4 = this._hashSize << 3;
        int i5 = 0;
        for (int i6 = 3; i6 < i4; i6 += 4) {
            if (this._hashArea[i6] != 0) {
                i5++;
            }
        }
        return i5;
    }

    public int calcHash(int i4, int i5) {
        int i6 = i4 + (i4 >>> 15);
        int i7 = ((i6 ^ (i6 >>> 9)) + (i5 * 33)) ^ this._seed;
        int i8 = i7 + (i7 >>> 16);
        int i9 = i8 ^ (i8 >>> 4);
        return i9 + (i9 << 3);
    }

    protected static ByteQuadsCanonicalizer createRoot(int i4) {
        return new ByteQuadsCanonicalizer(64, true, i4, true);
    }

    public int calcHash(int i4, int i5, int i6) {
        int i7 = i4 ^ this._seed;
        int i8 = (((i7 + (i7 >>> 9)) * 31) + i5) * 33;
        int i9 = (i8 + (i8 >>> 15)) ^ i6;
        int i10 = i9 + (i9 >>> 4);
        int i11 = i10 + (i10 >>> 15);
        return i11 ^ (i11 << 9);
    }

    public int calcHash(int[] iArr, int i4) {
        if (i4 >= 4) {
            int i5 = iArr[0] ^ this._seed;
            int i6 = i5 + (i5 >>> 9) + iArr[1];
            int i7 = ((i6 + (i6 >>> 15)) * 33) ^ iArr[2];
            int i8 = i7 + (i7 >>> 4);
            for (int i9 = 3; i9 < i4; i9++) {
                int i10 = iArr[i9];
                i8 += i10 ^ (i10 >> 21);
            }
            int i11 = i8 * MULT2;
            int i12 = i11 + (i11 >>> 19);
            return (i12 << 5) ^ i12;
        }
        throw new IllegalArgumentException();
    }

    private ByteQuadsCanonicalizer(ByteQuadsCanonicalizer byteQuadsCanonicalizer, boolean z4, int i4, boolean z5, TableInfo tableInfo) {
        this._parent = byteQuadsCanonicalizer;
        this._seed = i4;
        this._intern = z4;
        this._failOnDoS = z5;
        this._tableInfo = null;
        this._count = tableInfo.count;
        int i5 = tableInfo.size;
        this._hashSize = i5;
        int i6 = i5 << 2;
        this._secondaryStart = i6;
        this._tertiaryStart = i6 + (i6 >> 1);
        this._tertiaryShift = tableInfo.tertiaryShift;
        this._hashArea = tableInfo.mainHash;
        this._names = tableInfo.names;
        this._spilloverEnd = tableInfo.spilloverEnd;
        this._longNameOffset = tableInfo.longNameOffset;
        this._hashShared = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class TableInfo {
        public final int count;
        public final int longNameOffset;
        public final int[] mainHash;
        public final String[] names;
        public final int size;
        public final int spilloverEnd;
        public final int tertiaryShift;

        public TableInfo(int i4, int i5, int i6, int[] iArr, String[] strArr, int i7, int i8) {
            this.size = i4;
            this.count = i5;
            this.tertiaryShift = i6;
            this.mainHash = iArr;
            this.names = strArr;
            this.spilloverEnd = i7;
            this.longNameOffset = i8;
        }

        public static TableInfo createInitial(int i4) {
            int i5 = i4 << 3;
            return new TableInfo(i4, 0, ByteQuadsCanonicalizer._calcTertiaryShift(i4), new int[i5], new String[i4 << 1], i5 - i4, i5);
        }

        public TableInfo(ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
            this.size = byteQuadsCanonicalizer._hashSize;
            this.count = byteQuadsCanonicalizer._count;
            this.tertiaryShift = byteQuadsCanonicalizer._tertiaryShift;
            this.mainHash = byteQuadsCanonicalizer._hashArea;
            this.names = byteQuadsCanonicalizer._names;
            this.spilloverEnd = byteQuadsCanonicalizer._spilloverEnd;
            this.longNameOffset = byteQuadsCanonicalizer._longNameOffset;
        }
    }

    private String _findSecondary(int i4, int i5, int i6) {
        int i7 = this._tertiaryStart;
        int i8 = this._tertiaryShift;
        int i9 = i7 + ((i4 >> (i8 + 2)) << i8);
        int[] iArr = this._hashArea;
        int i10 = (1 << i8) + i9;
        while (i9 < i10) {
            int i11 = iArr[i9 + 3];
            if (i5 == iArr[i9] && i6 == iArr[i9 + 1] && 2 == i11) {
                return this._names[i9 >> 2];
            }
            if (i11 == 0) {
                return null;
            }
            i9 += 4;
        }
        for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
            if (i5 == iArr[_spilloverStart] && i6 == iArr[_spilloverStart + 1] && 2 == iArr[_spilloverStart + 3]) {
                return this._names[_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String addName(String str, int i4, int i5) {
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        int _findOffsetForAdd = _findOffsetForAdd(i5 == 0 ? calcHash(i4) : calcHash(i4, i5));
        int[] iArr = this._hashArea;
        iArr[_findOffsetForAdd] = i4;
        iArr[_findOffsetForAdd + 1] = i5;
        iArr[_findOffsetForAdd + 3] = 2;
        this._names[_findOffsetForAdd >> 2] = str;
        this._count++;
        return str;
    }

    public String findName(int i4, int i5) {
        int _calcOffset = _calcOffset(calcHash(i4, i5));
        int[] iArr = this._hashArea;
        int i6 = iArr[_calcOffset + 3];
        if (i6 == 2) {
            if (i4 == iArr[_calcOffset] && i5 == iArr[_calcOffset + 1]) {
                return this._names[_calcOffset >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        int i7 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        int i8 = iArr[i7 + 3];
        if (i8 == 2) {
            if (i4 == iArr[i7] && i5 == iArr[i7 + 1]) {
                return this._names[i7 >> 2];
            }
        } else if (i8 == 0) {
            return null;
        }
        return _findSecondary(_calcOffset, i4, i5);
    }

    private String _findSecondary(int i4, int i5, int i6, int i7) {
        int i8 = this._tertiaryStart;
        int i9 = this._tertiaryShift;
        int i10 = i8 + ((i4 >> (i9 + 2)) << i9);
        int[] iArr = this._hashArea;
        int i11 = (1 << i9) + i10;
        while (i10 < i11) {
            int i12 = iArr[i10 + 3];
            if (i5 == iArr[i10] && i6 == iArr[i10 + 1] && i7 == iArr[i10 + 2] && 3 == i12) {
                return this._names[i10 >> 2];
            }
            if (i12 == 0) {
                return null;
            }
            i10 += 4;
        }
        for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
            if (i5 == iArr[_spilloverStart] && i6 == iArr[_spilloverStart + 1] && i7 == iArr[_spilloverStart + 2] && 3 == iArr[_spilloverStart + 3]) {
                return this._names[_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String addName(String str, int i4, int i5, int i6) {
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        int _findOffsetForAdd = _findOffsetForAdd(calcHash(i4, i5, i6));
        int[] iArr = this._hashArea;
        iArr[_findOffsetForAdd] = i4;
        iArr[_findOffsetForAdd + 1] = i5;
        iArr[_findOffsetForAdd + 2] = i6;
        iArr[_findOffsetForAdd + 3] = 3;
        this._names[_findOffsetForAdd >> 2] = str;
        this._count++;
        return str;
    }

    public String findName(int i4, int i5, int i6) {
        int _calcOffset = _calcOffset(calcHash(i4, i5, i6));
        int[] iArr = this._hashArea;
        int i7 = iArr[_calcOffset + 3];
        if (i7 == 3) {
            if (i4 == iArr[_calcOffset] && iArr[_calcOffset + 1] == i5 && iArr[_calcOffset + 2] == i6) {
                return this._names[_calcOffset >> 2];
            }
        } else if (i7 == 0) {
            return null;
        }
        int i8 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        int i9 = iArr[i8 + 3];
        if (i9 == 3) {
            if (i4 == iArr[i8] && iArr[i8 + 1] == i5 && iArr[i8 + 2] == i6) {
                return this._names[i8 >> 2];
            }
        } else if (i9 == 0) {
            return null;
        }
        return _findSecondary(_calcOffset, i4, i5, i6);
    }

    private String _findSecondary(int i4, int i5, int[] iArr, int i6) {
        int i7 = this._tertiaryStart;
        int i8 = this._tertiaryShift;
        int i9 = i7 + ((i4 >> (i8 + 2)) << i8);
        int[] iArr2 = this._hashArea;
        int i10 = (1 << i8) + i9;
        while (i9 < i10) {
            int i11 = iArr2[i9 + 3];
            if (i5 == iArr2[i9] && i6 == i11 && _verifyLongName(iArr, i6, iArr2[i9 + 1])) {
                return this._names[i9 >> 2];
            }
            if (i11 == 0) {
                return null;
            }
            i9 += 4;
        }
        for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
            if (i5 == iArr2[_spilloverStart] && i6 == iArr2[_spilloverStart + 3] && _verifyLongName(iArr, i6, iArr2[_spilloverStart + 1])) {
                return this._names[_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String addName(String str, int[] iArr, int i4) {
        int _findOffsetForAdd;
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        if (i4 == 1) {
            _findOffsetForAdd = _findOffsetForAdd(calcHash(iArr[0]));
            int[] iArr2 = this._hashArea;
            iArr2[_findOffsetForAdd] = iArr[0];
            iArr2[_findOffsetForAdd + 3] = 1;
        } else if (i4 == 2) {
            _findOffsetForAdd = _findOffsetForAdd(calcHash(iArr[0], iArr[1]));
            int[] iArr3 = this._hashArea;
            iArr3[_findOffsetForAdd] = iArr[0];
            iArr3[_findOffsetForAdd + 1] = iArr[1];
            iArr3[_findOffsetForAdd + 3] = 2;
        } else if (i4 != 3) {
            int calcHash = calcHash(iArr, i4);
            _findOffsetForAdd = _findOffsetForAdd(calcHash);
            this._hashArea[_findOffsetForAdd] = calcHash;
            int _appendLongName = _appendLongName(iArr, i4);
            int[] iArr4 = this._hashArea;
            iArr4[_findOffsetForAdd + 1] = _appendLongName;
            iArr4[_findOffsetForAdd + 3] = i4;
        } else {
            int _findOffsetForAdd2 = _findOffsetForAdd(calcHash(iArr[0], iArr[1], iArr[2]));
            int[] iArr5 = this._hashArea;
            iArr5[_findOffsetForAdd2] = iArr[0];
            iArr5[_findOffsetForAdd2 + 1] = iArr[1];
            iArr5[_findOffsetForAdd2 + 2] = iArr[2];
            iArr5[_findOffsetForAdd2 + 3] = 3;
            _findOffsetForAdd = _findOffsetForAdd2;
        }
        this._names[_findOffsetForAdd >> 2] = str;
        this._count++;
        return str;
    }

    public String findName(int[] iArr, int i4) {
        if (i4 < 4) {
            if (i4 != 1) {
                if (i4 != 2) {
                    return i4 != 3 ? "" : findName(iArr[0], iArr[1], iArr[2]);
                }
                return findName(iArr[0], iArr[1]);
            }
            return findName(iArr[0]);
        }
        int calcHash = calcHash(iArr, i4);
        int _calcOffset = _calcOffset(calcHash);
        int[] iArr2 = this._hashArea;
        int i5 = iArr2[_calcOffset + 3];
        if (calcHash == iArr2[_calcOffset] && i5 == i4 && _verifyLongName(iArr, i4, iArr2[_calcOffset + 1])) {
            return this._names[_calcOffset >> 2];
        }
        if (i5 == 0) {
            return null;
        }
        int i6 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        int i7 = iArr2[i6 + 3];
        if (calcHash == iArr2[i6] && i7 == i4 && _verifyLongName(iArr, i4, iArr2[i6 + 1])) {
            return this._names[i6 >> 2];
        }
        return _findSecondary(_calcOffset, calcHash, iArr, i4);
    }
}
