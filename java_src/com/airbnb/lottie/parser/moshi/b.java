package com.airbnb.lottie.parser.moshi;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.tencent.bugly.Bugly;
import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.apache.http.message.BasicHeaderValueFormatterHC4;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JsonUtf8Reader.java */
/* loaded from: classes2.dex */
public final class b extends JsonReader {
    private static final int A = 6;
    private static final int B = 7;
    private static final int C = 8;
    private static final int D = 9;
    private static final int E = 10;
    private static final int F = 11;
    private static final int G = 12;
    private static final int H = 13;
    private static final int I = 14;
    private static final int J = 15;
    private static final int K = 16;
    private static final int L = 17;
    private static final int M = 18;
    private static final int N = 0;
    private static final int O = 1;
    private static final int P = 2;
    private static final int Q = 3;
    private static final int R = 4;
    private static final int S = 5;
    private static final int T = 6;
    private static final int U = 7;

    /* renamed from: o  reason: collision with root package name */
    private static final long f4223o = -922337203685477580L;

    /* renamed from: p  reason: collision with root package name */
    private static final ByteString f4224p = ByteString.encodeUtf8("'\\");

    /* renamed from: q  reason: collision with root package name */
    private static final ByteString f4225q = ByteString.encodeUtf8(BasicHeaderValueFormatterHC4.UNSAFE_CHARS);

    /* renamed from: r  reason: collision with root package name */
    private static final ByteString f4226r = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: s  reason: collision with root package name */
    private static final ByteString f4227s = ByteString.encodeUtf8("\n\r");

    /* renamed from: t  reason: collision with root package name */
    private static final ByteString f4228t = ByteString.encodeUtf8("*/");

    /* renamed from: u  reason: collision with root package name */
    private static final int f4229u = 0;

    /* renamed from: v  reason: collision with root package name */
    private static final int f4230v = 1;

    /* renamed from: w  reason: collision with root package name */
    private static final int f4231w = 2;

    /* renamed from: x  reason: collision with root package name */
    private static final int f4232x = 3;

    /* renamed from: y  reason: collision with root package name */
    private static final int f4233y = 4;

    /* renamed from: z  reason: collision with root package name */
    private static final int f4234z = 5;

    /* renamed from: i  reason: collision with root package name */
    private final BufferedSource f4235i;

    /* renamed from: j  reason: collision with root package name */
    private final Buffer f4236j;

    /* renamed from: k  reason: collision with root package name */
    private int f4237k = 0;

    /* renamed from: l  reason: collision with root package name */
    private long f4238l;

    /* renamed from: m  reason: collision with root package name */
    private int f4239m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private String f4240n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(BufferedSource bufferedSource) {
        Objects.requireNonNull(bufferedSource, "source == null");
        this.f4235i = bufferedSource;
        this.f4236j = bufferedSource.buffer();
        z(6);
    }

    private void J() throws IOException {
        if (!this.f4179f) {
            throw E("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int K() throws IOException {
        int[] iArr = this.f4176c;
        int i4 = this.f4175b;
        int i5 = iArr[i4 - 1];
        if (i5 == 1) {
            iArr[i4 - 1] = 2;
        } else if (i5 == 2) {
            int S2 = S(true);
            this.f4236j.readByte();
            if (S2 != 44) {
                if (S2 != 59) {
                    if (S2 == 93) {
                        this.f4237k = 4;
                        return 4;
                    }
                    throw E("Unterminated array");
                }
                J();
            }
        } else if (i5 == 3 || i5 == 5) {
            iArr[i4 - 1] = 4;
            if (i5 == 5) {
                int S3 = S(true);
                this.f4236j.readByte();
                if (S3 != 44) {
                    if (S3 != 59) {
                        if (S3 == 125) {
                            this.f4237k = 2;
                            return 2;
                        }
                        throw E("Unterminated object");
                    }
                    J();
                }
            }
            int S4 = S(true);
            if (S4 == 34) {
                this.f4236j.readByte();
                this.f4237k = 13;
                return 13;
            } else if (S4 == 39) {
                this.f4236j.readByte();
                J();
                this.f4237k = 12;
                return 12;
            } else if (S4 != 125) {
                J();
                if (P((char) S4)) {
                    this.f4237k = 14;
                    return 14;
                }
                throw E("Expected name");
            } else if (i5 != 5) {
                this.f4236j.readByte();
                this.f4237k = 2;
                return 2;
            } else {
                throw E("Expected name");
            }
        } else if (i5 == 4) {
            iArr[i4 - 1] = 5;
            int S5 = S(true);
            this.f4236j.readByte();
            if (S5 != 58) {
                if (S5 == 61) {
                    J();
                    if (this.f4235i.request(1L) && this.f4236j.getByte(0L) == 62) {
                        this.f4236j.readByte();
                    }
                } else {
                    throw E("Expected ':'");
                }
            }
        } else if (i5 == 6) {
            iArr[i4 - 1] = 7;
        } else if (i5 == 7) {
            if (S(false) == -1) {
                this.f4237k = 18;
                return 18;
            }
            J();
        } else if (i5 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int S6 = S(true);
        if (S6 == 34) {
            this.f4236j.readByte();
            this.f4237k = 9;
            return 9;
        } else if (S6 == 39) {
            J();
            this.f4236j.readByte();
            this.f4237k = 8;
            return 8;
        } else {
            if (S6 != 44 && S6 != 59) {
                if (S6 == 91) {
                    this.f4236j.readByte();
                    this.f4237k = 3;
                    return 3;
                } else if (S6 != 93) {
                    if (S6 != 123) {
                        int W = W();
                        if (W != 0) {
                            return W;
                        }
                        int X = X();
                        if (X != 0) {
                            return X;
                        }
                        if (P(this.f4236j.getByte(0L))) {
                            J();
                            this.f4237k = 10;
                            return 10;
                        }
                        throw E("Expected value");
                    }
                    this.f4236j.readByte();
                    this.f4237k = 1;
                    return 1;
                } else if (i5 == 1) {
                    this.f4236j.readByte();
                    this.f4237k = 4;
                    return 4;
                }
            }
            if (i5 != 1 && i5 != 2) {
                throw E("Unexpected value");
            }
            J();
            this.f4237k = 7;
            return 7;
        }
    }

    private int N(String str, JsonReader.a aVar) {
        int length = aVar.f4181a.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.equals(aVar.f4181a[i4])) {
                this.f4237k = 0;
                this.f4177d[this.f4175b - 1] = str;
                return i4;
            }
        }
        return -1;
    }

    private boolean P(int i4) throws IOException {
        if (i4 == 9 || i4 == 10 || i4 == 12 || i4 == 13 || i4 == 32) {
            return false;
        }
        if (i4 != 35) {
            if (i4 == 44) {
                return false;
            }
            if (i4 != 47 && i4 != 61) {
                if (i4 == 123 || i4 == 125 || i4 == 58) {
                    return false;
                }
                if (i4 != 59) {
                    switch (i4) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        J();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        r6.f4236j.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 != 47) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r6.f4235i.request(2) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        J();
        r3 = r6.f4236j.getByte(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r3 == 42) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r3 == 47) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        r6.f4236j.readByte();
        r6.f4236j.readByte();
        b0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        r6.f4236j.readByte();
        r6.f4236j.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (a0() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
        throw E("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r1 != 35) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
        J();
        b0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int S(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            okio.BufferedSource r2 = r6.f4235i
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L82
            okio.Buffer r2 = r6.f4236j
            long r4 = (long) r1
            byte r1 = r2.getByte(r4)
            r2 = 10
            if (r1 == r2) goto L80
            r2 = 32
            if (r1 == r2) goto L80
            r2 = 13
            if (r1 == r2) goto L80
            r2 = 9
            if (r1 != r2) goto L25
            goto L80
        L25:
            okio.Buffer r2 = r6.f4236j
            int r3 = r3 + (-1)
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L74
            okio.BufferedSource r3 = r6.f4235i
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3c
            return r1
        L3c:
            r6.J()
            okio.Buffer r3 = r6.f4236j
            r4 = 1
            byte r3 = r3.getByte(r4)
            r4 = 42
            if (r3 == r4) goto L5c
            if (r3 == r2) goto L4e
            return r1
        L4e:
            okio.Buffer r1 = r6.f4236j
            r1.readByte()
            okio.Buffer r1 = r6.f4236j
            r1.readByte()
            r6.b0()
            goto L1
        L5c:
            okio.Buffer r1 = r6.f4236j
            r1.readByte()
            okio.Buffer r1 = r6.f4236j
            r1.readByte()
            boolean r1 = r6.a0()
            if (r1 == 0) goto L6d
            goto L1
        L6d:
            java.lang.String r7 = "Unterminated comment"
            com.airbnb.lottie.parser.moshi.JsonEncodingException r7 = r6.E(r7)
            throw r7
        L74:
            r2 = 35
            if (r1 != r2) goto L7f
            r6.J()
            r6.b0()
            goto L1
        L7f:
            return r1
        L80:
            r1 = r3
            goto L2
        L82:
            if (r7 != 0) goto L86
            r7 = -1
            return r7
        L86:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            goto L8f
        L8e:
            throw r7
        L8f:
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.b.S(boolean):int");
    }

    private String T(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long indexOfElement = this.f4235i.indexOfElement(byteString);
            if (indexOfElement != -1) {
                if (this.f4236j.getByte(indexOfElement) != 92) {
                    if (sb == null) {
                        String readUtf8 = this.f4236j.readUtf8(indexOfElement);
                        this.f4236j.readByte();
                        return readUtf8;
                    }
                    sb.append(this.f4236j.readUtf8(indexOfElement));
                    this.f4236j.readByte();
                    return sb.toString();
                }
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f4236j.readUtf8(indexOfElement));
                this.f4236j.readByte();
                sb.append(Y());
            } else {
                throw E("Unterminated string");
            }
        }
    }

    private String V() throws IOException {
        long indexOfElement = this.f4235i.indexOfElement(f4226r);
        return indexOfElement != -1 ? this.f4236j.readUtf8(indexOfElement) : this.f4236j.readUtf8();
    }

    private int W() throws IOException {
        int i4;
        String str;
        String str2;
        byte b5 = this.f4236j.getByte(0L);
        if (b5 == 116 || b5 == 84) {
            i4 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (b5 == 102 || b5 == 70) {
            i4 = 6;
            str = Bugly.SDK_IS_DEV;
            str2 = "FALSE";
        } else if (b5 != 110 && b5 != 78) {
            return 0;
        } else {
            i4 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        int i5 = 1;
        while (i5 < length) {
            int i6 = i5 + 1;
            if (!this.f4235i.request(i6)) {
                return 0;
            }
            byte b6 = this.f4236j.getByte(i5);
            if (b6 != str.charAt(i5) && b6 != str2.charAt(i5)) {
                return 0;
            }
            i5 = i6;
        }
        if (this.f4235i.request(length + 1) && P(this.f4236j.getByte(length))) {
            return 0;
        }
        this.f4236j.skip(length);
        this.f4237k = i4;
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0089, code lost:
        if (P(r11) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
        if (r6 != 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
        if (r7 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0093, code lost:
        if (r8 != Long.MIN_VALUE) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0095, code lost:
        if (r10 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0099, code lost:
        if (r8 != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r10 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
        if (r10 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a0, code lost:
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a1, code lost:
        r16.f4238l = r8;
        r16.f4236j.skip(r5);
        r16.f4237k = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ad, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ae, code lost:
        if (r6 == 2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b1, code lost:
        if (r6 == 4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b4, code lost:
        if (r6 != 7) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b9, code lost:
        r16.f4239m = r5;
        r16.f4237k = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bf, code lost:
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c0, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int X() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.b.X():int");
    }

    private char Y() throws IOException {
        int i4;
        int i5;
        if (this.f4235i.request(1L)) {
            byte readByte = this.f4236j.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte != 98) {
                if (readByte != 102) {
                    if (readByte != 110) {
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    if (this.f4179f) {
                                        return (char) readByte;
                                    }
                                    throw E("Invalid escape sequence: \\" + ((char) readByte));
                                } else if (this.f4235i.request(4L)) {
                                    char c5 = 0;
                                    for (int i6 = 0; i6 < 4; i6++) {
                                        byte b5 = this.f4236j.getByte(i6);
                                        char c6 = (char) (c5 << 4);
                                        if (b5 < 48 || b5 > 57) {
                                            if (b5 >= 97 && b5 <= 102) {
                                                i4 = b5 - 97;
                                            } else if (b5 < 65 || b5 > 70) {
                                                throw E("\\u" + this.f4236j.readUtf8(4L));
                                            } else {
                                                i4 = b5 + ByteSourceJsonBootstrapper.UTF8_BOM_3;
                                            }
                                            i5 = i4 + 10;
                                        } else {
                                            i5 = b5 - 48;
                                        }
                                        c5 = (char) (c6 + i5);
                                    }
                                    this.f4236j.skip(4L);
                                    return c5;
                                } else {
                                    throw new EOFException("Unterminated escape sequence at path " + j());
                                }
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\n';
                }
                return '\f';
            }
            return '\b';
        }
        throw E("Unterminated escape sequence");
    }

    private void Z(ByteString byteString) throws IOException {
        while (true) {
            long indexOfElement = this.f4235i.indexOfElement(byteString);
            if (indexOfElement != -1) {
                if (this.f4236j.getByte(indexOfElement) == 92) {
                    this.f4236j.skip(indexOfElement + 1);
                    Y();
                } else {
                    this.f4236j.skip(indexOfElement + 1);
                    return;
                }
            } else {
                throw E("Unterminated string");
            }
        }
    }

    private boolean a0() throws IOException {
        BufferedSource bufferedSource = this.f4235i;
        ByteString byteString = f4228t;
        long indexOf = bufferedSource.indexOf(byteString);
        boolean z4 = indexOf != -1;
        Buffer buffer = this.f4236j;
        buffer.skip(z4 ? indexOf + byteString.size() : buffer.size());
        return z4;
    }

    private void b0() throws IOException {
        long indexOfElement = this.f4235i.indexOfElement(f4227s);
        Buffer buffer = this.f4236j;
        buffer.skip(indexOfElement != -1 ? indexOfElement + 1 : buffer.size());
    }

    private void c0() throws IOException {
        long indexOfElement = this.f4235i.indexOfElement(f4226r);
        Buffer buffer = this.f4236j;
        if (indexOfElement == -1) {
            indexOfElement = buffer.size();
        }
        buffer.skip(indexOfElement);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int A(JsonReader.a aVar) throws IOException {
        int i4 = this.f4237k;
        if (i4 == 0) {
            i4 = K();
        }
        if (i4 < 12 || i4 > 15) {
            return -1;
        }
        if (i4 == 15) {
            return N(this.f4240n, aVar);
        }
        int select = this.f4235i.select(aVar.f4182b);
        if (select != -1) {
            this.f4237k = 0;
            this.f4177d[this.f4175b - 1] = aVar.f4181a[select];
            return select;
        }
        String str = this.f4177d[this.f4175b - 1];
        String t4 = t();
        int N2 = N(t4, aVar);
        if (N2 == -1) {
            this.f4237k = 15;
            this.f4240n = t4;
            this.f4177d[this.f4175b - 1] = str;
        }
        return N2;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void B() throws IOException {
        if (!this.f4180g) {
            int i4 = this.f4237k;
            if (i4 == 0) {
                i4 = K();
            }
            if (i4 == 14) {
                c0();
            } else if (i4 == 13) {
                Z(f4225q);
            } else if (i4 == 12) {
                Z(f4224p);
            } else if (i4 != 15) {
                throw new JsonDataException("Expected a name but was " + y() + " at path " + j());
            }
            this.f4237k = 0;
            this.f4177d[this.f4175b - 1] = "null";
            return;
        }
        throw new JsonDataException("Cannot skip unexpected " + y() + " at " + j());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void C() throws IOException {
        if (!this.f4180g) {
            int i4 = 0;
            do {
                int i5 = this.f4237k;
                if (i5 == 0) {
                    i5 = K();
                }
                if (i5 == 3) {
                    z(1);
                } else if (i5 == 1) {
                    z(3);
                } else {
                    if (i5 == 4) {
                        i4--;
                        if (i4 >= 0) {
                            this.f4175b--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + y() + " at path " + j());
                        }
                    } else if (i5 == 2) {
                        i4--;
                        if (i4 >= 0) {
                            this.f4175b--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + y() + " at path " + j());
                        }
                    } else if (i5 == 14 || i5 == 10) {
                        c0();
                    } else if (i5 == 9 || i5 == 13) {
                        Z(f4225q);
                    } else if (i5 == 8 || i5 == 12) {
                        Z(f4224p);
                    } else if (i5 == 17) {
                        this.f4236j.skip(this.f4239m);
                    } else if (i5 == 18) {
                        throw new JsonDataException("Expected a value but was " + y() + " at path " + j());
                    }
                    this.f4237k = 0;
                }
                i4++;
                this.f4237k = 0;
            } while (i4 != 0);
            int[] iArr = this.f4178e;
            int i6 = this.f4175b;
            int i7 = i6 - 1;
            iArr[i7] = iArr[i7] + 1;
            this.f4177d[i6 - 1] = "null";
            return;
        }
        throw new JsonDataException("Cannot skip unexpected " + y() + " at " + j());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void b() throws IOException {
        int i4 = this.f4237k;
        if (i4 == 0) {
            i4 = K();
        }
        if (i4 == 3) {
            z(1);
            this.f4178e[this.f4175b - 1] = 0;
            this.f4237k = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + y() + " at path " + j());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4237k = 0;
        this.f4176c[0] = 8;
        this.f4175b = 1;
        this.f4236j.clear();
        this.f4235i.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void d() throws IOException {
        int i4 = this.f4237k;
        if (i4 == 0) {
            i4 = K();
        }
        if (i4 == 1) {
            z(3);
            this.f4237k = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + y() + " at path " + j());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void g() throws IOException {
        int i4 = this.f4237k;
        if (i4 == 0) {
            i4 = K();
        }
        if (i4 == 4) {
            int i5 = this.f4175b - 1;
            this.f4175b = i5;
            int[] iArr = this.f4178e;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
            this.f4237k = 0;
            return;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + y() + " at path " + j());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void h() throws IOException {
        int i4 = this.f4237k;
        if (i4 == 0) {
            i4 = K();
        }
        if (i4 == 2) {
            int i5 = this.f4175b - 1;
            this.f4175b = i5;
            this.f4177d[i5] = null;
            int[] iArr = this.f4178e;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
            this.f4237k = 0;
            return;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + y() + " at path " + j());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean k() throws IOException {
        int i4 = this.f4237k;
        if (i4 == 0) {
            i4 = K();
        }
        return (i4 == 2 || i4 == 4 || i4 == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean l() throws IOException {
        int i4 = this.f4237k;
        if (i4 == 0) {
            i4 = K();
        }
        if (i4 == 5) {
            this.f4237k = 0;
            int[] iArr = this.f4178e;
            int i5 = this.f4175b - 1;
            iArr[i5] = iArr[i5] + 1;
            return true;
        } else if (i4 == 6) {
            this.f4237k = 0;
            int[] iArr2 = this.f4178e;
            int i6 = this.f4175b - 1;
            iArr2[i6] = iArr2[i6] + 1;
            return false;
        } else {
            throw new JsonDataException("Expected a boolean but was " + y() + " at path " + j());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double p() throws IOException {
        int i4 = this.f4237k;
        if (i4 == 0) {
            i4 = K();
        }
        if (i4 == 16) {
            this.f4237k = 0;
            int[] iArr = this.f4178e;
            int i5 = this.f4175b - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.f4238l;
        }
        if (i4 == 17) {
            this.f4240n = this.f4236j.readUtf8(this.f4239m);
        } else if (i4 == 9) {
            this.f4240n = T(f4225q);
        } else if (i4 == 8) {
            this.f4240n = T(f4224p);
        } else if (i4 == 10) {
            this.f4240n = V();
        } else if (i4 != 11) {
            throw new JsonDataException("Expected a double but was " + y() + " at path " + j());
        }
        this.f4237k = 11;
        try {
            double parseDouble = Double.parseDouble(this.f4240n);
            if (!this.f4179f && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + j());
            }
            this.f4240n = null;
            this.f4237k = 0;
            int[] iArr2 = this.f4178e;
            int i6 = this.f4175b - 1;
            iArr2[i6] = iArr2[i6] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f4240n + " at path " + j());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int r() throws IOException {
        String T2;
        int i4 = this.f4237k;
        if (i4 == 0) {
            i4 = K();
        }
        if (i4 == 16) {
            long j4 = this.f4238l;
            int i5 = (int) j4;
            if (j4 == i5) {
                this.f4237k = 0;
                int[] iArr = this.f4178e;
                int i6 = this.f4175b - 1;
                iArr[i6] = iArr[i6] + 1;
                return i5;
            }
            throw new JsonDataException("Expected an int but was " + this.f4238l + " at path " + j());
        }
        if (i4 == 17) {
            this.f4240n = this.f4236j.readUtf8(this.f4239m);
        } else if (i4 == 9 || i4 == 8) {
            if (i4 == 9) {
                T2 = T(f4225q);
            } else {
                T2 = T(f4224p);
            }
            this.f4240n = T2;
            try {
                int parseInt = Integer.parseInt(T2);
                this.f4237k = 0;
                int[] iArr2 = this.f4178e;
                int i7 = this.f4175b - 1;
                iArr2[i7] = iArr2[i7] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i4 != 11) {
            throw new JsonDataException("Expected an int but was " + y() + " at path " + j());
        }
        this.f4237k = 11;
        try {
            double parseDouble = Double.parseDouble(this.f4240n);
            int i8 = (int) parseDouble;
            if (i8 == parseDouble) {
                this.f4240n = null;
                this.f4237k = 0;
                int[] iArr3 = this.f4178e;
                int i9 = this.f4175b - 1;
                iArr3[i9] = iArr3[i9] + 1;
                return i8;
            }
            throw new JsonDataException("Expected an int but was " + this.f4240n + " at path " + j());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f4240n + " at path " + j());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String t() throws IOException {
        String str;
        int i4 = this.f4237k;
        if (i4 == 0) {
            i4 = K();
        }
        if (i4 == 14) {
            str = V();
        } else if (i4 == 13) {
            str = T(f4225q);
        } else if (i4 == 12) {
            str = T(f4224p);
        } else if (i4 == 15) {
            str = this.f4240n;
        } else {
            throw new JsonDataException("Expected a name but was " + y() + " at path " + j());
        }
        this.f4237k = 0;
        this.f4177d[this.f4175b - 1] = str;
        return str;
    }

    public String toString() {
        return "JsonReader(" + this.f4235i + ")";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String u() throws IOException {
        String readUtf8;
        int i4 = this.f4237k;
        if (i4 == 0) {
            i4 = K();
        }
        if (i4 == 10) {
            readUtf8 = V();
        } else if (i4 == 9) {
            readUtf8 = T(f4225q);
        } else if (i4 == 8) {
            readUtf8 = T(f4224p);
        } else if (i4 == 11) {
            readUtf8 = this.f4240n;
            this.f4240n = null;
        } else if (i4 == 16) {
            readUtf8 = Long.toString(this.f4238l);
        } else if (i4 == 17) {
            readUtf8 = this.f4236j.readUtf8(this.f4239m);
        } else {
            throw new JsonDataException("Expected a string but was " + y() + " at path " + j());
        }
        this.f4237k = 0;
        int[] iArr = this.f4178e;
        int i5 = this.f4175b - 1;
        iArr[i5] = iArr[i5] + 1;
        return readUtf8;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token y() throws IOException {
        int i4 = this.f4237k;
        if (i4 == 0) {
            i4 = K();
        }
        switch (i4) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }
}
