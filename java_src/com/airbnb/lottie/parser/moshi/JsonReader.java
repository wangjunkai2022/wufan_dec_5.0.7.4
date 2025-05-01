package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
/* loaded from: classes2.dex */
public abstract class JsonReader implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f4174h = new String[128];

    /* renamed from: b  reason: collision with root package name */
    int f4175b;

    /* renamed from: c  reason: collision with root package name */
    int[] f4176c = new int[32];

    /* renamed from: d  reason: collision with root package name */
    String[] f4177d = new String[32];

    /* renamed from: e  reason: collision with root package name */
    int[] f4178e = new int[32];

    /* renamed from: f  reason: collision with root package name */
    boolean f4179f;

    /* renamed from: g  reason: collision with root package name */
    boolean f4180g;

    /* loaded from: classes2.dex */
    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final String[] f4181a;

        /* renamed from: b  reason: collision with root package name */
        final Options f4182b;

        private a(String[] strArr, Options options) {
            this.f4181a = strArr;
            this.f4182b = options;
        }

        public static a a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    JsonReader.D(buffer, strArr[i4]);
                    buffer.readByte();
                    byteStringArr[i4] = buffer.readByteString();
                }
                return new a((String[]) strArr.clone(), Options.of(byteStringArr));
            } catch (IOException e5) {
                throw new AssertionError(e5);
            }
        }
    }

    static {
        for (int i4 = 0; i4 <= 31; i4++) {
            f4174h[i4] = String.format("\\u%04x", Integer.valueOf(i4));
        }
        String[] strArr = f4174h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void D(okio.BufferedSink r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = com.airbnb.lottie.parser.moshi.JsonReader.f4174h
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = 0
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.writeUtf8(r8, r4, r3)
        L2e:
            r7.writeUtf8(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.writeUtf8(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonReader.D(okio.BufferedSink, java.lang.String):void");
    }

    public static JsonReader v(BufferedSource bufferedSource) {
        return new b(bufferedSource);
    }

    public abstract int A(a aVar) throws IOException;

    public abstract void B() throws IOException;

    public abstract void C() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JsonEncodingException E(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + j());
    }

    public abstract void b() throws IOException;

    public abstract void d() throws IOException;

    public abstract void g() throws IOException;

    public abstract void h() throws IOException;

    public final String j() {
        return com.airbnb.lottie.parser.moshi.a.a(this.f4175b, this.f4176c, this.f4177d, this.f4178e);
    }

    public abstract boolean k() throws IOException;

    public abstract boolean l() throws IOException;

    public abstract double p() throws IOException;

    public abstract int r() throws IOException;

    public abstract String t() throws IOException;

    public abstract String u() throws IOException;

    public abstract Token y() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z(int i4) {
        int i5 = this.f4175b;
        int[] iArr = this.f4176c;
        if (i5 == iArr.length) {
            if (i5 != 256) {
                this.f4176c = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f4177d;
                this.f4177d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f4178e;
                this.f4178e = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new JsonDataException("Nesting too deep at " + j());
            }
        }
        int[] iArr3 = this.f4176c;
        int i6 = this.f4175b;
        this.f4175b = i6 + 1;
        iArr3[i6] = i4;
    }
}
