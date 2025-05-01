package com.kwad.framework.filedownloader.message;

import android.os.Parcel;
import com.kwad.framework.filedownloader.message.MessageSnapshot;
/* loaded from: classes5.dex */
public abstract class d extends MessageSnapshot {

    /* loaded from: classes5.dex */
    public static class a extends b implements com.kwad.framework.filedownloader.message.b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i4, boolean z4, long j4) {
            super(i4, true, j4);
        }
    }

    /* loaded from: classes5.dex */
    public static class e extends f {
        /* JADX INFO: Access modifiers changed from: package-private */
        public e(int i4, long j4, long j5) {
            super(i4, j4, j5);
        }

        @Override // com.kwad.framework.filedownloader.message.d.f, com.kwad.framework.filedownloader.message.c
        public final byte uz() {
            return (byte) -2;
        }
    }

    /* loaded from: classes5.dex */
    public static class f extends d {
        private final long aif;
        private final long totalBytes;

        f(f fVar) {
            this(fVar.getId(), fVar.wG(), fVar.wE());
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public byte uz() {
            return (byte) 1;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final long wE() {
            return this.totalBytes;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final long wG() {
            return this.aif;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeLong(this.aif);
            parcel.writeLong(this.totalBytes);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(int i4, long j4, long j5) {
            super(i4);
            this.aif = j4;
            this.totalBytes = j5;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(Parcel parcel) {
            super(parcel);
            this.aif = parcel.readLong();
            this.totalBytes = parcel.readLong();
        }
    }

    /* loaded from: classes5.dex */
    public static class i extends j implements com.kwad.framework.filedownloader.message.b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public i(int i4, long j4, long j5) {
            super(i4, j4, j5);
        }
    }

    /* loaded from: classes5.dex */
    public static class j extends f implements MessageSnapshot.a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public j(int i4, long j4, long j5) {
            super(i4, j4, j5);
        }

        @Override // com.kwad.framework.filedownloader.message.d.f, com.kwad.framework.filedownloader.message.c
        public final byte uz() {
            return (byte) -4;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot.a
        public final MessageSnapshot wI() {
            return new f(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public j(Parcel parcel) {
            super(parcel);
        }
    }

    d(int i4) {
        super(i4);
        this.aih = true;
    }

    @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
    public final int wC() {
        if (wG() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) wG();
    }

    @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
    public final int wD() {
        if (wE() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) wE();
    }

    /* loaded from: classes5.dex */
    public static class g extends d {
        private final long aif;

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(int i4, long j4) {
            super(i4);
            this.aif = j4;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.kwad.framework.filedownloader.message.c
        public final byte uz() {
            return (byte) 3;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final long wG() {
            return this.aif;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeLong(this.aif);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(Parcel parcel) {
            super(parcel);
            this.aif = parcel.readLong();
        }
    }

    /* loaded from: classes5.dex */
    public static class h extends C0500d {
        private final int ahK;

        /* JADX INFO: Access modifiers changed from: package-private */
        public h(int i4, long j4, Throwable th, int i5) {
            super(i4, j4, th);
            this.ahK = i5;
        }

        @Override // com.kwad.framework.filedownloader.message.d.C0500d, com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int uD() {
            return this.ahK;
        }

        @Override // com.kwad.framework.filedownloader.message.d.C0500d, com.kwad.framework.filedownloader.message.c
        public final byte uz() {
            return (byte) 5;
        }

        @Override // com.kwad.framework.filedownloader.message.d.C0500d, com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.ahK);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public h(Parcel parcel) {
            super(parcel);
            this.ahK = parcel.readInt();
        }
    }

    /* loaded from: classes5.dex */
    public static class b extends d {
        private final boolean aic;
        private final long totalBytes;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(int i4, boolean z4, long j4) {
            super(i4);
            this.aic = z4;
            this.totalBytes = j4;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.kwad.framework.filedownloader.message.c
        public final byte uz() {
            return (byte) -3;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final long wE() {
            return this.totalBytes;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final boolean wF() {
            return this.aic;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeByte(this.aic ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.totalBytes);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Parcel parcel) {
            super(parcel);
            this.aic = parcel.readByte() != 0;
            this.totalBytes = parcel.readLong();
        }
    }

    /* renamed from: com.kwad.framework.filedownloader.message.d$d  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0500d extends d {
        private final long aif;
        private final Throwable aig;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0500d(int i4, long j4, Throwable th) {
            super(i4);
            this.aif = j4;
            this.aig = th;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.kwad.framework.filedownloader.message.c
        public byte uz() {
            return (byte) -1;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final long wG() {
            return this.aif;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final Throwable wH() {
            return this.aig;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeLong(this.aif);
            parcel.writeSerializable(this.aig);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0500d(Parcel parcel) {
            super(parcel);
            this.aif = parcel.readLong();
            this.aig = (Throwable) parcel.readSerializable();
        }
    }

    d(Parcel parcel) {
        super(parcel);
    }

    /* loaded from: classes5.dex */
    public static class c extends d {
        private final String agz;
        private final boolean aid;
        private final String aie;
        private final long totalBytes;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(int i4, boolean z4, long j4, String str, String str2) {
            super(i4);
            this.aid = z4;
            this.totalBytes = j4;
            this.agz = str;
            this.aie = str2;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final String getEtag() {
            return this.agz;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final String getFileName() {
            return this.aie;
        }

        @Override // com.kwad.framework.filedownloader.message.c
        public final byte uz() {
            return (byte) 2;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final long wE() {
            return this.totalBytes;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeByte(this.aid ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.totalBytes);
            parcel.writeString(this.agz);
            parcel.writeString(this.aie);
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final boolean wu() {
            return this.aid;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(Parcel parcel) {
            super(parcel);
            this.aid = parcel.readByte() != 0;
            this.totalBytes = parcel.readLong();
            this.agz = parcel.readString();
            this.aie = parcel.readString();
        }
    }
}
