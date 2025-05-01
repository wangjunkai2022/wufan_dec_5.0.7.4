package com.kwad.sdk.utils.a;
/* loaded from: classes5.dex */
final class a {

    /* renamed from: com.kwad.sdk.utils.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C0543a extends j {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C0543a(int i4, int i5, Object obj, int i6, boolean z4) {
            super(i4, i5, obj, i6, z4);
        }

        @Override // com.kwad.sdk.utils.a.a.b
        final byte Oe() {
            return (byte) 7;
        }
    }

    /* loaded from: classes5.dex */
    static abstract class b {
        int offset;

        b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract byte Oe();
    }

    /* loaded from: classes5.dex */
    static class c extends b {
        boolean value;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(int i4, boolean z4) {
            this.offset = i4;
            this.value = z4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.kwad.sdk.utils.a.a.b
        public final byte Oe() {
            return (byte) 1;
        }
    }

    /* loaded from: classes5.dex */
    static class d extends b {
        double value;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(int i4, double d5) {
            this.offset = i4;
            this.value = d5;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.kwad.sdk.utils.a.a.b
        public final byte Oe() {
            return (byte) 5;
        }
    }

    /* loaded from: classes5.dex */
    static class e extends b {
        float value;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(int i4, float f5) {
            this.offset = i4;
            this.value = f5;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.kwad.sdk.utils.a.a.b
        public final byte Oe() {
            return (byte) 3;
        }
    }

    /* loaded from: classes5.dex */
    static class f extends b {
        int value;

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(int i4, int i5) {
            this.offset = i4;
            this.value = i5;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.kwad.sdk.utils.a.a.b
        public final byte Oe() {
            return (byte) 2;
        }
    }

    /* loaded from: classes5.dex */
    static class g extends b {
        long value;

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(int i4, long j4) {
            this.offset = i4;
            this.value = j4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.kwad.sdk.utils.a.a.b
        public final byte Oe() {
            return (byte) 4;
        }
    }

    /* loaded from: classes5.dex */
    static class h extends j {
        /* JADX INFO: Access modifiers changed from: package-private */
        public h(int i4, int i5, Object obj, int i6, boolean z4) {
            super(i4, i5, obj, i6, z4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.kwad.sdk.utils.a.a.b
        public final byte Oe() {
            return (byte) 8;
        }
    }

    /* loaded from: classes5.dex */
    static class i extends j {
        /* JADX INFO: Access modifiers changed from: package-private */
        public i(int i4, int i5, String str, int i6, boolean z4) {
            super(i4, i5, str, i6, z4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.kwad.sdk.utils.a.a.b
        public final byte Oe() {
            return (byte) 6;
        }
    }

    /* loaded from: classes5.dex */
    static abstract class j extends b {
        int aSs;
        boolean aSt;
        int start;
        Object value;

        j(int i4, int i5, Object obj, int i6, boolean z4) {
            this.start = i4;
            this.offset = i5;
            this.value = obj;
            this.aSs = i6;
            this.aSt = z4;
        }
    }
}
