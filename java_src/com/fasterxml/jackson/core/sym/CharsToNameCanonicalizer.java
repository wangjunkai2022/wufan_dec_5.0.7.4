package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes3.dex */
public final class CharsToNameCanonicalizer {
    private static final int DEFAULT_T_SIZE = 64;
    public static final int HASH_MULT = 33;
    static final int MAX_COLL_CHAIN_LENGTH = 100;
    static final int MAX_ENTRIES_FOR_REUSE = 12000;
    private static final int MAX_T_SIZE = 65536;
    protected Bucket[] _buckets;
    protected boolean _canonicalize;
    protected final int _flags;
    protected boolean _hashShared;
    protected int _indexMask;
    protected int _longestCollisionList;
    protected BitSet _overflows;
    protected final CharsToNameCanonicalizer _parent;
    protected final int _seed;
    protected int _size;
    protected int _sizeThreshold;
    protected String[] _symbols;
    protected final AtomicReference<TableInfo> _tableInfo;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class Bucket {
        public final int length;
        public final Bucket next;
        public final String symbol;

        public Bucket(String str, Bucket bucket) {
            this.symbol = str;
            this.next = bucket;
            this.length = bucket != null ? 1 + bucket.length : 1;
        }

        public String has(char[] cArr, int i4, int i5) {
            if (this.symbol.length() != i5) {
                return null;
            }
            int i6 = 0;
            while (this.symbol.charAt(i6) == cArr[i4 + i6]) {
                i6++;
                if (i6 >= i5) {
                    return this.symbol;
                }
            }
            return null;
        }
    }

    private CharsToNameCanonicalizer(int i4) {
        this._parent = null;
        this._seed = i4;
        this._canonicalize = true;
        this._flags = -1;
        this._hashShared = false;
        this._longestCollisionList = 0;
        this._tableInfo = new AtomicReference<>(TableInfo.createInitial(64));
    }

    private String _addSymbol(char[] cArr, int i4, int i5, int i6, int i7) {
        if (this._hashShared) {
            copyArrays();
            this._hashShared = false;
        } else if (this._size >= this._sizeThreshold) {
            rehash();
            i7 = _hashToIndex(calcHash(cArr, i4, i5));
        }
        String str = new String(cArr, i4, i5);
        if (JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(this._flags)) {
            str = InternCache.instance.intern(str);
        }
        this._size++;
        String[] strArr = this._symbols;
        if (strArr[i7] == null) {
            strArr[i7] = str;
        } else {
            int i8 = i7 >> 1;
            Bucket bucket = new Bucket(str, this._buckets[i8]);
            int i9 = bucket.length;
            if (i9 > 100) {
                _handleSpillOverflow(i8, bucket, i7);
            } else {
                this._buckets[i8] = bucket;
                this._longestCollisionList = Math.max(i9, this._longestCollisionList);
            }
        }
        return str;
    }

    private String _findSymbol2(char[] cArr, int i4, int i5, Bucket bucket) {
        while (bucket != null) {
            String has = bucket.has(cArr, i4, i5);
            if (has != null) {
                return has;
            }
            bucket = bucket.next;
        }
        return null;
    }

    private void _handleSpillOverflow(int i4, Bucket bucket, int i5) {
        BitSet bitSet = this._overflows;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this._overflows = bitSet2;
            bitSet2.set(i4);
        } else if (bitSet.get(i4)) {
            if (JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this._flags)) {
                reportTooManyCollisions(100);
            }
            this._canonicalize = false;
        } else {
            this._overflows.set(i4);
        }
        this._symbols[i5] = bucket.symbol;
        this._buckets[i4] = null;
        this._size -= bucket.length;
        this._longestCollisionList = -1;
    }

    private static int _thresholdSize(int i4) {
        return i4 - (i4 >> 2);
    }

    private void copyArrays() {
        String[] strArr = this._symbols;
        this._symbols = (String[]) Arrays.copyOf(strArr, strArr.length);
        Bucket[] bucketArr = this._buckets;
        this._buckets = (Bucket[]) Arrays.copyOf(bucketArr, bucketArr.length);
    }

    public static CharsToNameCanonicalizer createRoot() {
        long currentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    private void mergeChild(TableInfo tableInfo) {
        int i4 = tableInfo.size;
        TableInfo tableInfo2 = this._tableInfo.get();
        if (i4 == tableInfo2.size) {
            return;
        }
        if (i4 > MAX_ENTRIES_FOR_REUSE) {
            tableInfo = TableInfo.createInitial(64);
        }
        this._tableInfo.compareAndSet(tableInfo2, tableInfo);
    }

    private void rehash() {
        String[] strArr = this._symbols;
        int length = strArr.length;
        int i4 = length + length;
        if (i4 > 65536) {
            this._size = 0;
            this._canonicalize = false;
            this._symbols = new String[64];
            this._buckets = new Bucket[32];
            this._indexMask = 63;
            this._hashShared = false;
            return;
        }
        Bucket[] bucketArr = this._buckets;
        this._symbols = new String[i4];
        this._buckets = new Bucket[i4 >> 1];
        this._indexMask = i4 - 1;
        this._sizeThreshold = _thresholdSize(i4);
        int i5 = 0;
        int i6 = 0;
        for (String str : strArr) {
            if (str != null) {
                i5++;
                int _hashToIndex = _hashToIndex(calcHash(str));
                String[] strArr2 = this._symbols;
                if (strArr2[_hashToIndex] == null) {
                    strArr2[_hashToIndex] = str;
                } else {
                    int i7 = _hashToIndex >> 1;
                    Bucket bucket = new Bucket(str, this._buckets[i7]);
                    this._buckets[i7] = bucket;
                    i6 = Math.max(i6, bucket.length);
                }
            }
        }
        int i8 = length >> 1;
        for (int i9 = 0; i9 < i8; i9++) {
            for (Bucket bucket2 = bucketArr[i9]; bucket2 != null; bucket2 = bucket2.next) {
                i5++;
                String str2 = bucket2.symbol;
                int _hashToIndex2 = _hashToIndex(calcHash(str2));
                String[] strArr3 = this._symbols;
                if (strArr3[_hashToIndex2] == null) {
                    strArr3[_hashToIndex2] = str2;
                } else {
                    int i10 = _hashToIndex2 >> 1;
                    Bucket bucket3 = new Bucket(str2, this._buckets[i10]);
                    this._buckets[i10] = bucket3;
                    i6 = Math.max(i6, bucket3.length);
                }
            }
        }
        this._longestCollisionList = i6;
        this._overflows = null;
        if (i5 != this._size) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(this._size), Integer.valueOf(i5)));
        }
    }

    public int _hashToIndex(int i4) {
        int i5 = i4 + (i4 >>> 15);
        int i6 = i5 ^ (i5 << 7);
        return (i6 + (i6 >>> 3)) & this._indexMask;
    }

    public int bucketCount() {
        return this._symbols.length;
    }

    public int calcHash(char[] cArr, int i4, int i5) {
        int i6 = this._seed;
        int i7 = i5 + i4;
        while (i4 < i7) {
            i6 = (i6 * 33) + cArr[i4];
            i4++;
        }
        if (i6 == 0) {
            return 1;
        }
        return i6;
    }

    public int collisionCount() {
        Bucket[] bucketArr;
        int i4 = 0;
        for (Bucket bucket : this._buckets) {
            if (bucket != null) {
                i4 += bucket.length;
            }
        }
        return i4;
    }

    public String findSymbol(char[] cArr, int i4, int i5, int i6) {
        if (i5 < 1) {
            return "";
        }
        if (!this._canonicalize) {
            return new String(cArr, i4, i5);
        }
        int _hashToIndex = _hashToIndex(i6);
        String str = this._symbols[_hashToIndex];
        if (str != null) {
            if (str.length() == i5) {
                int i7 = 0;
                while (str.charAt(i7) == cArr[i4 + i7]) {
                    i7++;
                    if (i7 == i5) {
                        return str;
                    }
                }
            }
            Bucket bucket = this._buckets[_hashToIndex >> 1];
            if (bucket != null) {
                String has = bucket.has(cArr, i4, i5);
                if (has != null) {
                    return has;
                }
                String _findSymbol2 = _findSymbol2(cArr, i4, i5, bucket.next);
                if (_findSymbol2 != null) {
                    return _findSymbol2;
                }
            }
        }
        return _addSymbol(cArr, i4, i5, i6, _hashToIndex);
    }

    public int hashSeed() {
        return this._seed;
    }

    public CharsToNameCanonicalizer makeChild(int i4) {
        return new CharsToNameCanonicalizer(this, i4, this._seed, this._tableInfo.get());
    }

    public int maxCollisionLength() {
        return this._longestCollisionList;
    }

    public boolean maybeDirty() {
        return !this._hashShared;
    }

    public void release() {
        CharsToNameCanonicalizer charsToNameCanonicalizer;
        if (maybeDirty() && (charsToNameCanonicalizer = this._parent) != null && this._canonicalize) {
            charsToNameCanonicalizer.mergeChild(new TableInfo(this));
            this._hashShared = true;
        }
    }

    protected void reportTooManyCollisions(int i4) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this._size + ") now exceeds maximum, " + i4 + " -- suspect a DoS attack based on hash collisions");
    }

    public int size() {
        AtomicReference<TableInfo> atomicReference = this._tableInfo;
        if (atomicReference != null) {
            return atomicReference.get().size;
        }
        return this._size;
    }

    protected void verifyInternalConsistency() {
        int length = this._symbols.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (this._symbols[i5] != null) {
                i4++;
            }
        }
        int i6 = length >> 1;
        for (int i7 = 0; i7 < i6; i7++) {
            for (Bucket bucket = this._buckets[i7]; bucket != null; bucket = bucket.next) {
                i4++;
            }
        }
        if (i4 != this._size) {
            throw new IllegalStateException(String.format("Internal error: expected internal size %d vs calculated count %d", Integer.valueOf(this._size), Integer.valueOf(i4)));
        }
    }

    protected static CharsToNameCanonicalizer createRoot(int i4) {
        return new CharsToNameCanonicalizer(i4);
    }

    public int calcHash(String str) {
        int length = str.length();
        int i4 = this._seed;
        for (int i5 = 0; i5 < length; i5++) {
            i4 = (i4 * 33) + str.charAt(i5);
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class TableInfo {
        final Bucket[] buckets;
        final int longestCollisionList;
        final int size;
        final String[] symbols;

        public TableInfo(int i4, int i5, String[] strArr, Bucket[] bucketArr) {
            this.size = i4;
            this.longestCollisionList = i5;
            this.symbols = strArr;
            this.buckets = bucketArr;
        }

        public static TableInfo createInitial(int i4) {
            return new TableInfo(0, 0, new String[i4], new Bucket[i4 >> 1]);
        }

        public TableInfo(CharsToNameCanonicalizer charsToNameCanonicalizer) {
            this.size = charsToNameCanonicalizer._size;
            this.longestCollisionList = charsToNameCanonicalizer._longestCollisionList;
            this.symbols = charsToNameCanonicalizer._symbols;
            this.buckets = charsToNameCanonicalizer._buckets;
        }
    }

    private CharsToNameCanonicalizer(CharsToNameCanonicalizer charsToNameCanonicalizer, int i4, int i5, TableInfo tableInfo) {
        this._parent = charsToNameCanonicalizer;
        this._seed = i5;
        this._tableInfo = null;
        this._flags = i4;
        this._canonicalize = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i4);
        String[] strArr = tableInfo.symbols;
        this._symbols = strArr;
        this._buckets = tableInfo.buckets;
        this._size = tableInfo.size;
        this._longestCollisionList = tableInfo.longestCollisionList;
        int length = strArr.length;
        this._sizeThreshold = _thresholdSize(length);
        this._indexMask = length - 1;
        this._hashShared = true;
    }
}
