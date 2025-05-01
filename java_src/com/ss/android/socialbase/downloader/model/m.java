package com.ss.android.socialbase.downloader.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes5.dex */
public class m implements Parcelable {

    /* renamed from: b  reason: collision with root package name */
    private m f61209b;

    /* renamed from: i  reason: collision with root package name */
    private AtomicLong f61210i;
    private int jh;

    /* renamed from: k  reason: collision with root package name */
    private List<m> f61211k;

    /* renamed from: m  reason: collision with root package name */
    private int f61212m;

    /* renamed from: n  reason: collision with root package name */
    private int f61213n;

    /* renamed from: o  reason: collision with root package name */
    private long f61214o;

    /* renamed from: p  reason: collision with root package name */
    private long f61215p;

    /* renamed from: q  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.qv.m f61216q;
    private AtomicInteger qv;

    /* renamed from: r  reason: collision with root package name */
    private boolean f61217r;

    /* renamed from: t  reason: collision with root package name */
    private AtomicBoolean f61218t;

    /* renamed from: u  reason: collision with root package name */
    private long f61219u;
    private long wv;
    private static final String vv = m.class.getSimpleName();
    public static final Parcelable.Creator<m> CREATOR = new Parcelable.Creator<m>() { // from class: com.ss.android.socialbase.downloader.model.m.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: vv */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: vv */
        public m[] newArray(int i4) {
            return new m[i4];
        }
    };

    /* loaded from: classes5.dex */
    public static class vv {

        /* renamed from: i  reason: collision with root package name */
        private long f61220i;

        /* renamed from: m  reason: collision with root package name */
        private long f61221m;

        /* renamed from: n  reason: collision with root package name */
        private long f61222n;

        /* renamed from: o  reason: collision with root package name */
        private long f61223o;

        /* renamed from: p  reason: collision with root package name */
        private long f61224p;
        private m qv;

        /* renamed from: u  reason: collision with root package name */
        private int f61225u;
        private int vv;

        public vv(int i4) {
            this.vv = i4;
        }

        public vv i(long j4) {
            this.f61223o = j4;
            return this;
        }

        public vv m(long j4) {
            this.f61224p = j4;
            return this;
        }

        public vv o(long j4) {
            this.f61222n = j4;
            return this;
        }

        public vv p(long j4) {
            this.f61220i = j4;
            return this;
        }

        public vv vv(long j4) {
            this.f61221m = j4;
            return this;
        }

        public vv vv(int i4) {
            this.f61225u = i4;
            return this;
        }

        public vv vv(m mVar) {
            this.qv = mVar;
            return this;
        }

        public m vv() {
            return new m(this);
        }
    }

    public int b() {
        return this.f61212m;
    }

    public long d() {
        return this.f61219u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void g() {
        this.wv = t();
    }

    public boolean i() {
        return m() == -1;
    }

    public long j() {
        return this.f61214o;
    }

    public long jh() {
        return this.f61215p;
    }

    public long k() {
        m mVar = this.f61209b;
        if (mVar != null && mVar.n() != null) {
            int indexOf = this.f61209b.n().indexOf(this);
            boolean z4 = false;
            for (int i4 = 0; i4 < this.f61209b.n().size(); i4++) {
                m mVar2 = this.f61209b.n().get(i4);
                if (mVar2 != null) {
                    if (z4) {
                        return mVar2.t();
                    }
                    if (indexOf == i4) {
                        z4 = true;
                    }
                }
            }
        }
        return -1L;
    }

    public int la() {
        return this.f61213n;
    }

    public int m() {
        AtomicInteger atomicInteger = this.qv;
        if (atomicInteger == null) {
            return -1;
        }
        return atomicInteger.get();
    }

    public List<m> n() {
        return this.f61211k;
    }

    public m o() {
        m mVar = !i() ? this.f61209b : this;
        if (mVar == null || !mVar.u()) {
            return null;
        }
        return mVar.n().get(0);
    }

    public boolean p() {
        AtomicBoolean atomicBoolean = this.f61218t;
        if (atomicBoolean == null) {
            return false;
        }
        return atomicBoolean.get();
    }

    public long q() {
        long t4 = t() - this.f61215p;
        if (u()) {
            t4 = 0;
            for (int i4 = 0; i4 < this.f61211k.size(); i4++) {
                m mVar = this.f61211k.get(i4);
                if (mVar != null) {
                    t4 += mVar.t() - mVar.jh();
                }
            }
        }
        return t4;
    }

    public boolean qv() {
        m mVar = this.f61209b;
        if (mVar == null) {
            return true;
        }
        if (mVar.u()) {
            for (int i4 = 0; i4 < this.f61209b.n().size(); i4++) {
                m mVar2 = this.f61209b.n().get(i4);
                if (mVar2 != null) {
                    int indexOf = this.f61209b.n().indexOf(this);
                    if (indexOf > i4 && !mVar2.wv()) {
                        return false;
                    }
                    if (indexOf == i4) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public long r() {
        AtomicLong atomicLong = this.f61210i;
        if (atomicLong != null) {
            return atomicLong.get();
        }
        return 0L;
    }

    public long t() {
        if (i() && u()) {
            long j4 = 0;
            for (int i4 = 0; i4 < this.f61211k.size(); i4++) {
                m mVar = this.f61211k.get(i4);
                if (mVar != null) {
                    if (!mVar.wv()) {
                        return mVar.r();
                    }
                    if (j4 < mVar.r()) {
                        j4 = mVar.r();
                    }
                }
            }
            return j4;
        }
        return r();
    }

    public boolean u() {
        List<m> list = this.f61211k;
        return list != null && list.size() > 0;
    }

    public ContentValues vv() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(this.f61212m));
        contentValues.put("chunkIndex", Integer.valueOf(this.f61213n));
        contentValues.put("startOffset", Long.valueOf(this.f61215p));
        contentValues.put("curOffset", Long.valueOf(t()));
        contentValues.put("endOffset", Long.valueOf(this.f61214o));
        contentValues.put("chunkContentLen", Long.valueOf(this.f61219u));
        contentValues.put("hostChunkIndex", Integer.valueOf(m()));
        return contentValues;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f61212m);
        parcel.writeLong(this.f61215p);
        AtomicLong atomicLong = this.f61210i;
        parcel.writeLong(atomicLong != null ? atomicLong.get() : 0L);
        parcel.writeLong(this.f61214o);
        parcel.writeLong(this.f61219u);
        parcel.writeInt(this.f61213n);
        AtomicInteger atomicInteger = this.qv;
        parcel.writeInt(atomicInteger != null ? atomicInteger.get() : -1);
    }

    public boolean wv() {
        long j4 = this.f61215p;
        if (i()) {
            long j5 = this.wv;
            if (j5 > this.f61215p) {
                j4 = j5;
            }
        }
        return t() - j4 >= this.f61219u;
    }

    private m(vv vvVar) {
        if (vvVar == null) {
            return;
        }
        this.f61212m = vvVar.vv;
        this.f61215p = vvVar.f61221m;
        this.f61210i = new AtomicLong(vvVar.f61224p);
        this.f61214o = vvVar.f61220i;
        this.f61219u = vvVar.f61223o;
        this.f61213n = vvVar.f61225u;
        this.wv = vvVar.f61222n;
        this.qv = new AtomicInteger(-1);
        vv(vvVar.qv);
        this.f61218t = new AtomicBoolean(false);
    }

    public void m(boolean z4) {
        this.f61217r = z4;
    }

    public void p(int i4) {
        this.f61213n = i4;
    }

    public void m(int i4) {
        this.f61212m = i4;
    }

    public long p(boolean z4) {
        long t4 = t();
        long j4 = this.f61219u;
        long j5 = this.wv;
        long j6 = j4 - (t4 - j5);
        if (!z4 && t4 == j5) {
            j6 = j4 - (t4 - this.f61215p);
        }
        com.ss.android.socialbase.downloader.p.vv.m("DownloadChunk", "contentLength:" + this.f61219u + " curOffset:" + t() + " oldOffset:" + this.wv + " retainLen:" + j6);
        if (j6 < 0) {
            return 0L;
        }
        return j6;
    }

    public void m(long j4) {
        AtomicLong atomicLong = this.f61210i;
        if (atomicLong != null) {
            atomicLong.set(j4);
        } else {
            this.f61210i = new AtomicLong(j4);
        }
    }

    public void vv(SQLiteStatement sQLiteStatement) {
        if (sQLiteStatement == null) {
            return;
        }
        this.jh = 0;
        sQLiteStatement.clearBindings();
        int i4 = this.jh + 1;
        this.jh = i4;
        sQLiteStatement.bindLong(i4, this.f61212m);
        int i5 = this.jh + 1;
        this.jh = i5;
        sQLiteStatement.bindLong(i5, this.f61213n);
        int i6 = this.jh + 1;
        this.jh = i6;
        sQLiteStatement.bindLong(i6, this.f61215p);
        int i7 = this.jh + 1;
        this.jh = i7;
        sQLiteStatement.bindLong(i7, t());
        int i8 = this.jh + 1;
        this.jh = i8;
        sQLiteStatement.bindLong(i8, this.f61214o);
        int i9 = this.jh + 1;
        this.jh = i9;
        sQLiteStatement.bindLong(i9, this.f61219u);
        int i10 = this.jh + 1;
        this.jh = i10;
        sQLiteStatement.bindLong(i10, m());
    }

    public m(Cursor cursor) {
        if (cursor == null) {
            return;
        }
        this.f61212m = cursor.getInt(cursor.getColumnIndex("_id"));
        this.f61213n = cursor.getInt(cursor.getColumnIndex("chunkIndex"));
        this.f61215p = cursor.getLong(cursor.getColumnIndex("startOffset"));
        int columnIndex = cursor.getColumnIndex("curOffset");
        if (columnIndex != -1) {
            this.f61210i = new AtomicLong(cursor.getLong(columnIndex));
        } else {
            this.f61210i = new AtomicLong(0L);
        }
        this.f61214o = cursor.getLong(cursor.getColumnIndex("endOffset"));
        int columnIndex2 = cursor.getColumnIndex("hostChunkIndex");
        if (columnIndex2 != -1) {
            this.qv = new AtomicInteger(cursor.getInt(columnIndex2));
        } else {
            this.qv = new AtomicInteger(-1);
        }
        int columnIndex3 = cursor.getColumnIndex("chunkContentLen");
        if (columnIndex3 != -1) {
            this.f61219u = cursor.getLong(columnIndex3);
        }
        this.f61218t = new AtomicBoolean(false);
    }

    public void vv(int i4) {
        AtomicInteger atomicInteger = this.qv;
        if (atomicInteger == null) {
            this.qv = new AtomicInteger(i4);
        } else {
            atomicInteger.set(i4);
        }
    }

    public void vv(com.ss.android.socialbase.downloader.qv.m mVar) {
        this.f61216q = mVar;
        g();
    }

    public void vv(boolean z4) {
        AtomicBoolean atomicBoolean = this.f61218t;
        if (atomicBoolean == null) {
            this.f61218t = new AtomicBoolean(z4);
        } else {
            atomicBoolean.set(z4);
        }
        this.f61216q = null;
    }

    protected m(Parcel parcel) {
        this.f61212m = parcel.readInt();
        this.f61215p = parcel.readLong();
        this.f61210i = new AtomicLong(parcel.readLong());
        this.f61214o = parcel.readLong();
        this.f61219u = parcel.readLong();
        this.f61213n = parcel.readInt();
        this.qv = new AtomicInteger(parcel.readInt());
    }

    public void vv(m mVar) {
        this.f61209b = mVar;
        if (mVar != null) {
            vv(mVar.la());
        }
    }

    public void vv(List<m> list) {
        this.f61211k = list;
    }

    public void vv(long j4) {
        this.f61219u = j4;
    }

    public List<m> vv(int i4, long j4) {
        m mVar;
        long j5;
        long j6;
        long j7;
        long j8;
        m mVar2 = this;
        int i5 = i4;
        if (!i() || u()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long r4 = r();
        long p4 = mVar2.p(true);
        long j9 = p4 / i5;
        com.ss.android.socialbase.downloader.p.vv.m(vv, "retainLen:" + p4 + " divideChunkForReuse chunkSize:" + j9 + " current host downloadChunk index:" + mVar2.f61213n);
        int i6 = 0;
        while (i6 < i5) {
            if (i6 == 0) {
                j6 = jh();
            } else {
                int i7 = i5 - 1;
                if (i6 == i7) {
                    long j10 = j();
                    j7 = j10;
                    j8 = j10 > r4 ? (j10 - r4) + 1 : p4 - (i7 * j9);
                    j6 = r4;
                    long j11 = p4;
                    long j12 = j8;
                    m vv2 = new vv(mVar2.f61212m).vv((-i6) - 1).vv(j6).m(r4).o(r4).p(j7).i(j12).vv(mVar2).vv();
                    com.ss.android.socialbase.downloader.p.vv.m(vv, "divide sub chunk : " + i6 + " startOffset:" + j6 + " curOffset:" + r4 + " endOffset:" + j7 + " contentLen:" + j12);
                    arrayList.add(vv2);
                    r4 += j9;
                    i6++;
                    mVar2 = this;
                    i5 = i4;
                    p4 = j11;
                } else {
                    j6 = r4;
                }
            }
            j7 = (r4 + j9) - 1;
            j8 = j9;
            long j112 = p4;
            long j122 = j8;
            m vv22 = new vv(mVar2.f61212m).vv((-i6) - 1).vv(j6).m(r4).o(r4).p(j7).i(j122).vv(mVar2).vv();
            com.ss.android.socialbase.downloader.p.vv.m(vv, "divide sub chunk : " + i6 + " startOffset:" + j6 + " curOffset:" + r4 + " endOffset:" + j7 + " contentLen:" + j122);
            arrayList.add(vv22);
            r4 += j9;
            i6++;
            mVar2 = this;
            i5 = i4;
            p4 = j112;
        }
        long j13 = 0;
        for (int size = arrayList.size() - 1; size > 0; size--) {
            m mVar3 = arrayList.get(size);
            if (mVar3 != null) {
                j13 += mVar3.d();
            }
        }
        com.ss.android.socialbase.downloader.p.vv.m(vv, "reuseChunkContentLen:".concat(String.valueOf(j13)));
        m mVar4 = arrayList.get(0);
        if (mVar4 != null) {
            if (j() == 0) {
                j5 = j4 - jh();
            } else {
                j5 = (j() - jh()) + 1;
            }
            mVar4.vv(j5 - j13);
            mVar = this;
            mVar4.p(mVar.f61213n);
            com.ss.android.socialbase.downloader.qv.m mVar5 = mVar.f61216q;
            if (mVar5 != null) {
                mVar5.vv(mVar4.j(), d() - j13);
            }
        } else {
            mVar = this;
        }
        mVar.vv(arrayList);
        return arrayList;
    }
}
