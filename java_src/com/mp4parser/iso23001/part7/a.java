package com.mp4parser.iso23001.part7;

import java.math.BigInteger;
import java.util.Arrays;
/* compiled from: CencSampleAuxiliaryDataFormat.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f57254a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    public k[] f57255b = null;

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    /* loaded from: classes5.dex */
    private abstract class b implements k {
        private b() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            k kVar = (k) obj;
            return clear() == kVar.clear() && a() == kVar.a();
        }

        public String toString() {
            return "P(" + clear() + "|" + a() + ")";
        }

        /* synthetic */ b(a aVar, b bVar) {
            this();
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    /* loaded from: classes5.dex */
    private class c extends b {

        /* renamed from: b  reason: collision with root package name */
        private byte f57257b;

        /* renamed from: c  reason: collision with root package name */
        private byte f57258c;

        public c(int i4, long j4) {
            super(a.this, null);
            this.f57257b = (byte) i4;
            this.f57258c = (byte) j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f57258c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f57257b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    /* loaded from: classes5.dex */
    private class d extends b {

        /* renamed from: b  reason: collision with root package name */
        private byte f57260b;

        /* renamed from: c  reason: collision with root package name */
        private int f57261c;

        public d(int i4, long j4) {
            super(a.this, null);
            this.f57260b = (byte) i4;
            this.f57261c = (int) j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f57261c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f57260b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    /* loaded from: classes5.dex */
    private class e extends b {

        /* renamed from: b  reason: collision with root package name */
        private byte f57263b;

        /* renamed from: c  reason: collision with root package name */
        private long f57264c;

        public e(int i4, long j4) {
            super(a.this, null);
            this.f57263b = (byte) i4;
            this.f57264c = j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f57264c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f57263b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    /* loaded from: classes5.dex */
    private class f extends b {

        /* renamed from: b  reason: collision with root package name */
        private byte f57266b;

        /* renamed from: c  reason: collision with root package name */
        private short f57267c;

        public f(int i4, long j4) {
            super(a.this, null);
            this.f57266b = (byte) i4;
            this.f57267c = (short) j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f57267c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f57266b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    /* loaded from: classes5.dex */
    private class g extends b {

        /* renamed from: b  reason: collision with root package name */
        private int f57269b;

        /* renamed from: c  reason: collision with root package name */
        private byte f57270c;

        public g(int i4, long j4) {
            super(a.this, null);
            this.f57269b = i4;
            this.f57270c = (byte) j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f57270c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f57269b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    /* loaded from: classes5.dex */
    private class h extends b {

        /* renamed from: b  reason: collision with root package name */
        private int f57272b;

        /* renamed from: c  reason: collision with root package name */
        private int f57273c;

        public h(int i4, long j4) {
            super(a.this, null);
            this.f57272b = i4;
            this.f57273c = (int) j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f57273c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f57272b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    /* loaded from: classes5.dex */
    private class i extends b {

        /* renamed from: b  reason: collision with root package name */
        private int f57275b;

        /* renamed from: c  reason: collision with root package name */
        private long f57276c;

        public i(int i4, long j4) {
            super(a.this, null);
            this.f57275b = i4;
            this.f57276c = j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f57276c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f57275b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    /* loaded from: classes5.dex */
    private class j extends b {

        /* renamed from: b  reason: collision with root package name */
        private int f57278b;

        /* renamed from: c  reason: collision with root package name */
        private short f57279c;

        public j(int i4, long j4) {
            super(a.this, null);
            this.f57278b = i4;
            this.f57279c = (short) j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f57279c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f57278b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    /* loaded from: classes5.dex */
    public interface k {
        long a();

        int clear();
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    /* loaded from: classes5.dex */
    private class l extends b {

        /* renamed from: b  reason: collision with root package name */
        private short f57281b;

        /* renamed from: c  reason: collision with root package name */
        private byte f57282c;

        public l(int i4, long j4) {
            super(a.this, null);
            this.f57281b = (short) i4;
            this.f57282c = (byte) j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f57282c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f57281b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    /* loaded from: classes5.dex */
    private class m extends b {

        /* renamed from: b  reason: collision with root package name */
        private short f57284b;

        /* renamed from: c  reason: collision with root package name */
        private int f57285c;

        public m(int i4, long j4) {
            super(a.this, null);
            this.f57284b = (short) i4;
            this.f57285c = (int) j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f57285c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f57284b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    /* loaded from: classes5.dex */
    private class n extends b {

        /* renamed from: b  reason: collision with root package name */
        private short f57287b;

        /* renamed from: c  reason: collision with root package name */
        private long f57288c;

        public n(int i4, long j4) {
            super(a.this, null);
            this.f57287b = (short) i4;
            this.f57288c = j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f57288c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f57287b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    /* loaded from: classes5.dex */
    private class o extends b {

        /* renamed from: b  reason: collision with root package name */
        private short f57290b;

        /* renamed from: c  reason: collision with root package name */
        private short f57291c;

        public o(int i4, long j4) {
            super(a.this, null);
            this.f57290b = (short) i4;
            this.f57291c = (short) j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f57291c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f57290b;
        }
    }

    public k a(int i4, long j4) {
        if (i4 <= 127) {
            if (j4 <= 127) {
                return new c(i4, j4);
            }
            if (j4 <= 32767) {
                return new f(i4, j4);
            }
            if (j4 <= 2147483647L) {
                return new d(i4, j4);
            }
            return new e(i4, j4);
        } else if (i4 <= 32767) {
            if (j4 <= 127) {
                return new l(i4, j4);
            }
            if (j4 <= 32767) {
                return new o(i4, j4);
            }
            if (j4 <= 2147483647L) {
                return new m(i4, j4);
            }
            return new n(i4, j4);
        } else if (j4 <= 127) {
            return new g(i4, j4);
        } else {
            if (j4 <= 32767) {
                return new j(i4, j4);
            }
            if (j4 <= 2147483647L) {
                return new h(i4, j4);
            }
            return new i(i4, j4);
        }
    }

    public int b() {
        int length = this.f57254a.length;
        k[] kVarArr = this.f57255b;
        return (kVarArr == null || kVarArr.length <= 0) ? length : length + 2 + (kVarArr.length * 6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (new BigInteger(this.f57254a).equals(new BigInteger(aVar.f57254a))) {
            k[] kVarArr = this.f57255b;
            k[] kVarArr2 = aVar.f57255b;
            return kVarArr == null ? kVarArr2 == null : Arrays.equals(kVarArr, kVarArr2);
        }
        return false;
    }

    public int hashCode() {
        byte[] bArr = this.f57254a;
        int hashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        k[] kVarArr = this.f57255b;
        return hashCode + (kVarArr != null ? Arrays.hashCode(kVarArr) : 0);
    }

    public String toString() {
        return "Entry{iv=" + com.coremedia.iso.e.b(this.f57254a) + ", pairs=" + Arrays.toString(this.f57255b) + '}';
    }
}
