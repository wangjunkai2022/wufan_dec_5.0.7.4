package cn.sharesdk.framework.utils;
/* compiled from: PercentEscaper.java */
/* loaded from: classes2.dex */
public class d extends l {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f1055a = {'+'};

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f1056b = net.lingala.zip4j.crypto.PBKDF2.a.f71726a.toCharArray();

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1057c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean[] f1058d;

    public d(String str, boolean z4) {
        if (!str.matches(".*[0-9A-Za-z].*")) {
            if (z4 && str.contains(" ")) {
                throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
            }
            if (!str.contains("%")) {
                this.f1057c = z4;
                this.f1058d = a(str);
                return;
            }
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        }
        throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
    }

    private static boolean[] a(String str) {
        char[] charArray = str.toCharArray();
        int i4 = 122;
        for (char c5 : charArray) {
            i4 = Math.max((int) c5, i4);
        }
        boolean[] zArr = new boolean[i4 + 1];
        for (int i5 = 48; i5 <= 57; i5++) {
            zArr[i5] = true;
        }
        for (int i6 = 65; i6 <= 90; i6++) {
            zArr[i6] = true;
        }
        for (int i7 = 97; i7 <= 122; i7++) {
            zArr[i7] = true;
        }
        for (char c6 : charArray) {
            zArr[c6] = true;
        }
        return zArr;
    }

    @Override // cn.sharesdk.framework.utils.l, cn.sharesdk.framework.utils.Escaper
    public String escape(String str) {
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            boolean[] zArr = this.f1058d;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return a(str, i4);
            }
        }
        return str;
    }

    @Override // cn.sharesdk.framework.utils.l
    protected int a(CharSequence charSequence, int i4, int i5) {
        while (i4 < i5) {
            char charAt = charSequence.charAt(i4);
            boolean[] zArr = this.f1058d;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i4++;
        }
        return i4;
    }

    @Override // cn.sharesdk.framework.utils.l
    protected char[] a(int i4) {
        boolean[] zArr = this.f1058d;
        if (i4 >= zArr.length || !zArr[i4]) {
            if (i4 == 32 && this.f1057c) {
                return f1055a;
            }
            if (i4 <= 127) {
                char[] cArr = f1056b;
                return new char[]{'%', cArr[i4 >>> 4], cArr[i4 & 15]};
            } else if (i4 <= 2047) {
                char[] cArr2 = f1056b;
                char[] cArr3 = {'%', cArr2[(r14 >>> 4) | 12], cArr2[r14 & 15], '%', cArr2[(r14 & 3) | 8], cArr2[i4 & 15]};
                int i5 = i4 >>> 4;
                int i6 = i5 >>> 2;
                return cArr3;
            } else if (i4 <= 65535) {
                char[] cArr4 = f1056b;
                char[] cArr5 = {'%', 'E', cArr4[r14 >>> 2], '%', cArr4[(r14 & 3) | 8], cArr4[r14 & 15], '%', cArr4[(r14 & 3) | 8], cArr4[i4 & 15]};
                int i7 = i4 >>> 4;
                int i8 = i7 >>> 2;
                int i9 = i8 >>> 4;
                return cArr5;
            } else if (i4 <= 1114111) {
                char[] cArr6 = f1056b;
                char[] cArr7 = {'%', 'F', cArr6[(r14 >>> 2) & 7], '%', cArr6[(r14 & 3) | 8], cArr6[r14 & 15], '%', cArr6[(r14 & 3) | 8], cArr6[r14 & 15], '%', cArr6[(r14 & 3) | 8], cArr6[i4 & 15]};
                int i10 = i4 >>> 4;
                int i11 = i10 >>> 2;
                int i12 = i11 >>> 4;
                int i13 = i12 >>> 2;
                int i14 = i13 >>> 4;
                return cArr7;
            } else {
                throw new IllegalArgumentException("Invalid unicode character value " + i4);
            }
        }
        return null;
    }
}
