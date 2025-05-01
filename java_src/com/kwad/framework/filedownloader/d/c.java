package com.kwad.framework.filedownloader.d;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.kwad.framework.filedownloader.f.f;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes5.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.kwad.framework.filedownloader.d.c.1
        private static c[] bE(int i4) {
            return new c[i4];
        }

        private static c c(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ c createFromParcel(Parcel parcel) {
            return c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ c[] newArray(int i4) {
            return bE(i4);
        }
    };
    private String Wx;
    private int aiA;
    private boolean aih;
    private boolean aiu;
    private final AtomicInteger aiv;
    private final AtomicLong aiw;
    private long aix;
    private String aiy;
    private String aiz;
    private String filename;
    private int id;
    private String url;

    public c() {
        this.aiw = new AtomicLong();
        this.aiv = new AtomicInteger();
    }

    private String wR() {
        return this.aiy;
    }

    public final void S(long j4) {
        this.aiw.set(j4);
    }

    public final void T(long j4) {
        this.aiw.addAndGet(j4);
    }

    public final void U(long j4) {
        this.aih = j4 > 2147483647L;
        this.aix = j4;
    }

    public final void bD(int i4) {
        this.aiA = i4;
    }

    public final void bq(String str) {
        this.aiz = str;
    }

    public final void br(String str) {
        this.aiy = str;
    }

    public final void bs(String str) {
        this.filename = str;
    }

    public final void d(String str, boolean z4) {
        this.Wx = str;
        this.aiu = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final int getId() {
        return this.id;
    }

    public final String getPath() {
        return this.Wx;
    }

    public final String getTargetFilePath() {
        return f.a(getPath(), uv(), getFilename());
    }

    public final long getTotal() {
        return this.aix;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isChunked() {
        return this.aix == -1;
    }

    public final void setId(int i4) {
        this.id = i4;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final String toString() {
        return f.b("id[%d], url[%s], path[%s], status[%d], sofar[%s], total[%d], etag[%s], %s", Integer.valueOf(this.id), this.url, this.Wx, Integer.valueOf(this.aiv.get()), this.aiw, Long.valueOf(this.aix), this.aiz, super.toString());
    }

    public final boolean uF() {
        return this.aih;
    }

    public final boolean uv() {
        return this.aiu;
    }

    public final byte uz() {
        return (byte) this.aiv.get();
    }

    public final ContentValues wN() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(getId()));
        contentValues.put("url", getUrl());
        contentValues.put("path", getPath());
        contentValues.put("status", Byte.valueOf(uz()));
        contentValues.put("sofar", Long.valueOf(wP()));
        contentValues.put("total", Long.valueOf(getTotal()));
        contentValues.put("errMsg", wR());
        contentValues.put("etag", wQ());
        contentValues.put("connectionCount", Integer.valueOf(wS()));
        contentValues.put("pathAsDirectory", Boolean.valueOf(uv()));
        if (uv() && getFilename() != null) {
            contentValues.put("filename", getFilename());
        }
        return contentValues;
    }

    public final long wP() {
        return this.aiw.get();
    }

    public final String wQ() {
        return this.aiz;
    }

    public final int wS() {
        return this.aiA;
    }

    public final void wT() {
        this.aiA = 1;
    }

    public final String wh() {
        if (getTargetFilePath() == null) {
            return null;
        }
        return f.bw(getTargetFilePath());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.id);
        parcel.writeString(this.url);
        parcel.writeString(this.Wx);
        parcel.writeByte(this.aiu ? (byte) 1 : (byte) 0);
        parcel.writeString(this.filename);
        parcel.writeByte((byte) this.aiv.get());
        parcel.writeLong(this.aiw.get());
        parcel.writeLong(this.aix);
        parcel.writeString(this.aiy);
        parcel.writeString(this.aiz);
        parcel.writeInt(this.aiA);
        parcel.writeByte(this.aih ? (byte) 1 : (byte) 0);
    }

    public final void d(byte b5) {
        this.aiv.set(b5);
    }

    protected c(Parcel parcel) {
        this.id = parcel.readInt();
        this.url = parcel.readString();
        this.Wx = parcel.readString();
        this.aiu = parcel.readByte() != 0;
        this.filename = parcel.readString();
        this.aiv = new AtomicInteger(parcel.readByte());
        this.aiw = new AtomicLong(parcel.readLong());
        this.aix = parcel.readLong();
        this.aiy = parcel.readString();
        this.aiz = parcel.readString();
        this.aiA = parcel.readInt();
        this.aih = parcel.readByte() != 0;
    }
}
