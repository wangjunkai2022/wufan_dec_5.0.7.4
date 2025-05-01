package com.bytedance.sdk.openadsdk.api.plugin.m;

import javax.security.auth.x500.X500Principal;
/* loaded from: classes2.dex */
final class m {

    /* renamed from: i  reason: collision with root package name */
    private int f8707i;

    /* renamed from: m  reason: collision with root package name */
    private final int f8708m;

    /* renamed from: n  reason: collision with root package name */
    private char[] f8709n;

    /* renamed from: o  reason: collision with root package name */
    private int f8710o;

    /* renamed from: p  reason: collision with root package name */
    private int f8711p;

    /* renamed from: u  reason: collision with root package name */
    private int f8712u;
    private final String vv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.vv = name;
        this.f8708m = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
        return new java.lang.String(r1, r2, r8.f8712u - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String i() {
        /*
            r8 = this;
            int r0 = r8.f8711p
            r8.f8707i = r0
            r8.f8710o = r0
        L6:
            int r0 = r8.f8711p
            int r1 = r8.f8708m
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f8709n
            int r2 = r8.f8707i
            int r3 = r8.f8710o
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.f8709n
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5e
            if (r2 == r5) goto L53
            r5 = 92
            if (r2 == r5) goto L40
            if (r2 == r4) goto L53
            if (r2 == r3) goto L53
            int r2 = r8.f8710o
            int r3 = r2 + 1
            r8.f8710o = r3
            char r3 = r1[r0]
            r1[r2] = r3
            int r0 = r0 + 1
            r8.f8711p = r0
            goto L6
        L40:
            int r0 = r8.f8710o
            int r2 = r0 + 1
            r8.f8710o = r2
            char r2 = r8.o()
            r1[r0] = r2
            int r0 = r8.f8711p
            int r0 = r0 + 1
            r8.f8711p = r0
            goto L6
        L53:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f8707i
            int r3 = r8.f8710o
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5e:
            int r2 = r8.f8710o
            r8.f8712u = r2
            int r0 = r0 + 1
            r8.f8711p = r0
            int r0 = r2 + 1
            r8.f8710o = r0
            r1[r2] = r6
        L6c:
            int r0 = r8.f8711p
            int r1 = r8.f8708m
            if (r0 >= r1) goto L85
            char[] r2 = r8.f8709n
            char r7 = r2[r0]
            if (r7 != r6) goto L85
            int r1 = r8.f8710o
            int r7 = r1 + 1
            r8.f8710o = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f8711p = r0
            goto L6c
        L85:
            if (r0 == r1) goto L95
            char[] r1 = r8.f8709n
            char r2 = r1[r0]
            if (r2 == r3) goto L95
            char r2 = r1[r0]
            if (r2 == r4) goto L95
            char r0 = r1[r0]
            if (r0 != r5) goto L6
        L95:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f8709n
            int r2 = r8.f8707i
            int r3 = r8.f8712u
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.api.plugin.m.m.i():java.lang.String");
    }

    private String m() {
        int i4 = this.f8711p + 1;
        this.f8711p = i4;
        this.f8707i = i4;
        this.f8710o = i4;
        while (true) {
            int i5 = this.f8711p;
            if (i5 != this.f8708m) {
                char[] cArr = this.f8709n;
                if (cArr[i5] == '\"') {
                    this.f8711p = i5 + 1;
                    while (true) {
                        int i6 = this.f8711p;
                        if (i6 >= this.f8708m || this.f8709n[i6] != ' ') {
                            break;
                        }
                        this.f8711p = i6 + 1;
                    }
                    char[] cArr2 = this.f8709n;
                    int i7 = this.f8707i;
                    return new String(cArr2, i7, this.f8710o - i7);
                }
                if (cArr[i5] == '\\') {
                    cArr[this.f8710o] = o();
                } else {
                    cArr[this.f8710o] = cArr[i5];
                }
                this.f8711p++;
                this.f8710o++;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.vv);
            }
        }
    }

    private char o() {
        int i4 = this.f8711p + 1;
        this.f8711p = i4;
        if (i4 != this.f8708m) {
            char[] cArr = this.f8709n;
            char c5 = cArr[i4];
            if (c5 != ' ' && c5 != '%' && c5 != '\\' && c5 != '_' && c5 != '\"' && c5 != '#') {
                switch (c5) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c5) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                return u();
                        }
                }
            }
            return cArr[i4];
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.vv);
    }

    private String p() {
        int i4;
        int i5 = this.f8711p;
        if (i5 + 4 < this.f8708m) {
            this.f8707i = i5;
            this.f8711p = i5 + 1;
            while (true) {
                i4 = this.f8711p;
                if (i4 == this.f8708m) {
                    break;
                }
                char[] cArr = this.f8709n;
                if (cArr[i4] == '+' || cArr[i4] == ',' || cArr[i4] == ';') {
                    break;
                } else if (cArr[i4] == ' ') {
                    this.f8710o = i4;
                    this.f8711p = i4 + 1;
                    while (true) {
                        int i6 = this.f8711p;
                        if (i6 >= this.f8708m || this.f8709n[i6] != ' ') {
                            break;
                        }
                        this.f8711p = i6 + 1;
                    }
                } else {
                    if (cArr[i4] >= 'A' && cArr[i4] <= 'F') {
                        cArr[i4] = (char) (cArr[i4] + ' ');
                    }
                    this.f8711p = i4 + 1;
                }
            }
            this.f8710o = i4;
            int i7 = this.f8710o;
            int i8 = this.f8707i;
            int i9 = i7 - i8;
            if (i9 >= 5 && (i9 & 1) != 0) {
                int i10 = i9 / 2;
                byte[] bArr = new byte[i10];
                int i11 = i8 + 1;
                for (int i12 = 0; i12 < i10; i12++) {
                    bArr[i12] = (byte) vv(i11);
                    i11 += 2;
                }
                return new String(this.f8709n, this.f8707i, i9);
            }
            throw new IllegalStateException("Unexpected end of DN: " + this.vv);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.vv);
    }

    private char u() {
        int i4;
        int i5;
        int vv = vv(this.f8711p);
        this.f8711p++;
        if (vv < 128) {
            return (char) vv;
        }
        if (vv < 192 || vv > 247) {
            return '?';
        }
        if (vv <= 223) {
            i5 = vv & 31;
            i4 = 1;
        } else if (vv <= 239) {
            i4 = 2;
            i5 = vv & 15;
        } else {
            i4 = 3;
            i5 = vv & 7;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = this.f8711p + 1;
            this.f8711p = i7;
            if (i7 == this.f8708m || this.f8709n[i7] != '\\') {
                return '?';
            }
            int i8 = i7 + 1;
            this.f8711p = i8;
            int vv2 = vv(i8);
            this.f8711p++;
            if ((vv2 & 192) != 128) {
                return '?';
            }
            i5 = (i5 << 6) + (vv2 & 63);
        }
        return (char) i5;
    }

    private String vv() {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        while (true) {
            i4 = this.f8711p;
            i5 = this.f8708m;
            if (i4 >= i5 || this.f8709n[i4] != ' ') {
                break;
            }
            this.f8711p = i4 + 1;
        }
        if (i4 == i5) {
            return null;
        }
        this.f8707i = i4;
        this.f8711p = i4 + 1;
        while (true) {
            i6 = this.f8711p;
            i7 = this.f8708m;
            if (i6 >= i7) {
                break;
            }
            char[] cArr = this.f8709n;
            if (cArr[i6] == '=' || cArr[i6] == ' ') {
                break;
            }
            this.f8711p = i6 + 1;
        }
        if (i6 < i7) {
            this.f8710o = i6;
            if (this.f8709n[i6] == ' ') {
                while (true) {
                    i9 = this.f8711p;
                    i10 = this.f8708m;
                    if (i9 >= i10) {
                        break;
                    }
                    char[] cArr2 = this.f8709n;
                    if (cArr2[i9] == '=' || cArr2[i9] != ' ') {
                        break;
                    }
                    this.f8711p = i9 + 1;
                }
                if (this.f8709n[i9] != '=' || i9 == i10) {
                    throw new IllegalStateException("Unexpected end of DN: " + this.vv);
                }
            }
            do {
                i8 = this.f8711p + 1;
                this.f8711p = i8;
                if (i8 >= this.f8708m) {
                    break;
                }
            } while (this.f8709n[i8] == ' ');
            int i11 = this.f8710o;
            int i12 = this.f8707i;
            if (i11 - i12 > 4) {
                char[] cArr3 = this.f8709n;
                if (cArr3[i12 + 3] == '.' && ((cArr3[i12] == 'O' || cArr3[i12] == 'o') && ((cArr3[i12 + 1] == 'I' || cArr3[i12 + 1] == 'i') && (cArr3[i12 + 2] == 'D' || cArr3[i12 + 2] == 'd')))) {
                    this.f8707i = i12 + 4;
                }
            }
            char[] cArr4 = this.f8709n;
            int i13 = this.f8707i;
            return new String(cArr4, i13, i11 - i13);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.vv);
    }

    private int vv(int i4) {
        int i5;
        int i6;
        int i7 = i4 + 1;
        if (i7 < this.f8708m) {
            char[] cArr = this.f8709n;
            char c5 = cArr[i4];
            if (c5 >= '0' && c5 <= '9') {
                i5 = c5 - '0';
            } else if (c5 >= 'a' && c5 <= 'f') {
                i5 = c5 - 'W';
            } else if (c5 < 'A' || c5 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.vv);
            } else {
                i5 = c5 - '7';
            }
            char c6 = cArr[i7];
            if (c6 >= '0' && c6 <= '9') {
                i6 = c6 - '0';
            } else if (c6 >= 'a' && c6 <= 'f') {
                i6 = c6 - 'W';
            } else if (c6 < 'A' || c6 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.vv);
            } else {
                i6 = c6 - '7';
            }
            return (i5 << 4) + i6;
        }
        throw new IllegalStateException("Malformed DN: " + this.vv);
    }

    public String vv(String str) {
        String m4;
        this.f8711p = 0;
        this.f8707i = 0;
        this.f8710o = 0;
        this.f8712u = 0;
        this.f8709n = this.vv.toCharArray();
        String vv = vv();
        if (vv == null) {
            return null;
        }
        do {
            int i4 = this.f8711p;
            if (i4 == this.f8708m) {
                return null;
            }
            char c5 = this.f8709n[i4];
            if (c5 == '\"') {
                m4 = m();
            } else if (c5 != '#') {
                m4 = (c5 == '+' || c5 == ',' || c5 == ';') ? "" : i();
            } else {
                m4 = p();
            }
            if (str.equalsIgnoreCase(vv)) {
                return m4;
            }
            int i5 = this.f8711p;
            if (i5 >= this.f8708m) {
                return null;
            }
            char[] cArr = this.f8709n;
            if (cArr[i5] != ',' && cArr[i5] != ';' && cArr[i5] != '+') {
                throw new IllegalStateException("Malformed DN: " + this.vv);
            }
            this.f8711p = i5 + 1;
            vv = vv();
        } while (vv != null);
        throw new IllegalStateException("Malformed DN: " + this.vv);
    }
}
