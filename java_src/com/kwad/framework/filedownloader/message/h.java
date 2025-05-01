package com.kwad.framework.filedownloader.message;

import android.os.Parcel;
import com.kwad.framework.filedownloader.message.MessageSnapshot;
/* loaded from: classes5.dex */
public abstract class h extends MessageSnapshot {

    /* loaded from: classes5.dex */
    public static class a extends b implements com.kwad.framework.filedownloader.message.b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i4, boolean z4, int i5) {
            super(i4, true, i5);
        }
    }

    /* loaded from: classes5.dex */
    public static class e extends f {
        /* JADX INFO: Access modifiers changed from: package-private */
        public e(int i4, int i5, int i6) {
            super(i4, i5, i6);
        }

        @Override // com.kwad.framework.filedownloader.message.h.f, com.kwad.framework.filedownloader.message.c
        public final byte uz() {
            return (byte) -2;
        }
    }

    /* loaded from: classes5.dex */
    public static class f extends h {
        private final int air;
        private final int ais;

        f(f fVar) {
            this(fVar.getId(), fVar.wC(), fVar.wD());
        }

        public byte uz() {
            return (byte) 1;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int wC() {
            return this.ais;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int wD() {
            return this.air;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.ais);
            parcel.writeInt(this.air);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(int i4, int i5, int i6) {
            super(i4);
            this.ais = i5;
            this.air = i6;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(Parcel parcel) {
            super(parcel);
            this.ais = parcel.readInt();
            this.air = parcel.readInt();
        }
    }

    /* loaded from: classes5.dex */
    public static class i extends j implements com.kwad.framework.filedownloader.message.b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public i(int i4, int i5, int i6) {
            super(i4, i5, i6);
        }
    }

    /* loaded from: classes5.dex */
    public static class j extends f implements MessageSnapshot.a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public j(int i4, int i5, int i6) {
            super(i4, i5, i6);
        }

        @Override // com.kwad.framework.filedownloader.message.h.f, com.kwad.framework.filedownloader.message.c
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

    h(int i4) {
        super(i4);
        this.aih = false;
    }

    @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
    public final long wE() {
        return wD();
    }

    @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
    public final long wG() {
        return wC();
    }

    /* loaded from: classes5.dex */
    public static class g extends h {
        private final int ais;

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(int i4, int i5) {
            super(i4);
            this.ais = i5;
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
        public final int wC() {
            return this.ais;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.ais);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(Parcel parcel) {
            super(parcel);
            this.ais = parcel.readInt();
        }
    }

    /* renamed from: com.kwad.framework.filedownloader.message.h$h  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0501h extends d {
        private final int ahK;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0501h(int i4, int i5, Throwable th, int i6) {
            super(i4, i5, th);
            this.ahK = i6;
        }

        @Override // com.kwad.framework.filedownloader.message.h.d, com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final int uD() {
            return this.ahK;
        }

        @Override // com.kwad.framework.filedownloader.message.h.d, com.kwad.framework.filedownloader.message.c
        public final byte uz() {
            return (byte) 5;
        }

        @Override // com.kwad.framework.filedownloader.message.h.d, com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.ahK);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0501h(Parcel parcel) {
            super(parcel);
            this.ahK = parcel.readInt();
        }
    }

    /* loaded from: classes5.dex */
    public static class b extends h {
        private final boolean aic;
        private final int air;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(int i4, boolean z4, int i5) {
            super(i4);
            this.aic = z4;
            this.air = i5;
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
        public final int wD() {
            return this.air;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final boolean wF() {
            return this.aic;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeByte(this.aic ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.air);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Parcel parcel) {
            super(parcel);
            this.aic = parcel.readByte() != 0;
            this.air = parcel.readInt();
        }
    }

    /* loaded from: classes5.dex */
    public static class d extends h {
        private final Throwable aig;
        private final int ais;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(int i4, int i5, Throwable th) {
            super(i4);
            this.ais = i5;
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
        public final int wC() {
            return this.ais;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot
        public final Throwable wH() {
            return this.aig;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.ais);
            parcel.writeSerializable(this.aig);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(Parcel parcel) {
            super(parcel);
            this.ais = parcel.readInt();
            this.aig = (Throwable) parcel.readSerializable();
        }
    }

    h(Parcel parcel) {
        super(parcel);
    }

    /* loaded from: classes5.dex */
    public static class c extends h {
        private final String agz;
        private final boolean aid;
        private final String aie;
        private final int air;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(int i4, boolean z4, int i5, String str, String str2) {
            super(i4);
            this.aid = z4;
            this.air = i5;
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
        public final int wD() {
            return this.air;
        }

        @Override // com.kwad.framework.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeByte(this.aid ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.air);
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
            this.air = parcel.readInt();
            this.agz = parcel.readString();
            this.aie = parcel.readString();
        }
    }
}
