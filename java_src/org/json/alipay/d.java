package org.json.alipay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private int f72842a;

    /* renamed from: b  reason: collision with root package name */
    private Reader f72843b;

    /* renamed from: c  reason: collision with root package name */
    private char f72844c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f72845d;

    private d(Reader reader) {
        this.f72843b = reader.markSupported() ? reader : new BufferedReader(reader);
        this.f72845d = false;
        this.f72842a = 0;
    }

    public d(String str) {
        this(new StringReader(str));
    }

    private String a(int i4) {
        if (i4 == 0) {
            return "";
        }
        char[] cArr = new char[i4];
        int i5 = 0;
        if (this.f72845d) {
            this.f72845d = false;
            cArr[0] = this.f72844c;
            i5 = 1;
        }
        while (i5 < i4) {
            try {
                int read = this.f72843b.read(cArr, i5, i4 - i5);
                if (read == -1) {
                    break;
                }
                i5 += read;
            } catch (IOException e5) {
                throw new a(e5);
            }
        }
        this.f72842a += i5;
        if (i5 >= i4) {
            this.f72844c = cArr[i4 - 1];
            return new String(cArr);
        }
        throw a("Substring bounds error");
    }

    public final a a(String str) {
        return new a(str + toString());
    }

    public final void a() {
        int i4;
        if (this.f72845d || (i4 = this.f72842a) <= 0) {
            throw new a("Stepping back two steps is not supported");
        }
        this.f72842a = i4 - 1;
        this.f72845d = true;
    }

    public final char b() {
        if (this.f72845d) {
            this.f72845d = false;
            char c5 = this.f72844c;
            if (c5 != 0) {
                this.f72842a++;
            }
            return c5;
        }
        try {
            int read = this.f72843b.read();
            if (read <= 0) {
                this.f72844c = (char) 0;
                return (char) 0;
            }
            this.f72842a++;
            char c6 = (char) read;
            this.f72844c = c6;
            return c6;
        } catch (IOException e5) {
            throw new a(e5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final char c() {
        /*
            r5 = this;
        L0:
            char r0 = r5.b()
            r1 = 13
            r2 = 10
            r3 = 47
            if (r0 != r3) goto L3e
            char r0 = r5.b()
            r4 = 42
            if (r0 == r4) goto L25
            if (r0 == r3) goto L1a
            r5.a()
            return r3
        L1a:
            char r0 = r5.b()
            if (r0 == r2) goto L0
            if (r0 == r1) goto L0
            if (r0 != 0) goto L1a
            goto L0
        L25:
            char r0 = r5.b()
            if (r0 == 0) goto L37
            if (r0 != r4) goto L25
            char r0 = r5.b()
            if (r0 == r3) goto L0
            r5.a()
            goto L25
        L37:
            java.lang.String r0 = "Unclosed comment"
            org.json.alipay.a r0 = r5.a(r0)
            throw r0
        L3e:
            r3 = 35
            if (r0 != r3) goto L4d
        L42:
            char r0 = r5.b()
            if (r0 == r2) goto L0
            if (r0 == r1) goto L0
            if (r0 != 0) goto L42
            goto L0
        L4d:
            if (r0 == 0) goto L53
            r1 = 32
            if (r0 <= r1) goto L0
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.alipay.d.c():char");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0147, code lost:
        throw a("Unterminated string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d() {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.alipay.d.d():java.lang.Object");
    }

    public final String toString() {
        return " at character " + this.f72842a;
    }
}
