package cn.sharesdk.framework.utils;

import java.io.IOException;
/* compiled from: UnicodeEscaper.java */
/* loaded from: classes2.dex */
public abstract class l implements Escaper {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UnicodeEscaper.java */
    /* loaded from: classes2.dex */
    public static final class a extends ThreadLocal<char[]> {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public char[] initialValue() {
            return new char[1024];
        }
    }

    protected static final int b(CharSequence charSequence, int i4, int i5) {
        if (i4 < i5) {
            char charAt = charSequence.charAt(i4);
            int i6 = i4 + 1;
            if (charAt < 55296 || charAt > 57343) {
                return charAt;
            }
            if (charAt > 56319) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected low surrogate character '");
                sb.append(charAt);
                sb.append("' with value ");
                sb.append((int) charAt);
                sb.append(" at index ");
                sb.append(i6 - 1);
                throw new IllegalArgumentException(sb.toString());
            } else if (i6 == i5) {
                return -charAt;
            } else {
                char charAt2 = charSequence.charAt(i6);
                if (Character.isLowSurrogate(charAt2)) {
                    return Character.toCodePoint(charAt, charAt2);
                }
                throw new IllegalArgumentException("Expected low surrogate but got char '" + charAt2 + "' with value " + ((int) charAt2) + " at index " + i6);
            }
        }
        throw new IndexOutOfBoundsException("Index exceeds specified range");
    }

    protected int a(CharSequence charSequence, int i4, int i5) {
        while (i4 < i5) {
            int b5 = b(charSequence, i4, i5);
            if (b5 < 0 || a(b5) != null) {
                break;
            }
            i4 += Character.isSupplementaryCodePoint(b5) ? 2 : 1;
        }
        return i4;
    }

    protected abstract char[] a(int i4);

    @Override // cn.sharesdk.framework.utils.Escaper
    public String escape(String str) {
        int length = str.length();
        int a5 = a(str, 0, length);
        return a5 == length ? str : a(str, a5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(String str, int i4) {
        int length = str.length();
        char[] cArr = new a().get();
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int b5 = b(str, i4, length);
            if (b5 >= 0) {
                char[] a5 = a(b5);
                if (a5 != null) {
                    int i7 = i4 - i5;
                    int i8 = i6 + i7;
                    int length2 = a5.length + i8;
                    if (cArr.length < length2) {
                        cArr = a(cArr, i6, length2 + (length - i4) + 32);
                    }
                    if (i7 > 0) {
                        str.getChars(i5, i4, cArr, i6);
                        i6 = i8;
                    }
                    if (a5.length > 0) {
                        System.arraycopy(a5, 0, cArr, i6, a5.length);
                        i6 += a5.length;
                    }
                }
                i5 = (Character.isSupplementaryCodePoint(b5) ? 2 : 1) + i4;
                i4 = a(str, i5, length);
            } else {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
        }
        int i9 = length - i5;
        if (i9 > 0) {
            int i10 = i9 + i6;
            if (cArr.length < i10) {
                cArr = a(cArr, i6, i10);
            }
            str.getChars(i5, length, cArr, i6);
            i6 = i10;
        }
        return new String(cArr, 0, i6);
    }

    @Override // cn.sharesdk.framework.utils.Escaper
    public Appendable escape(final Appendable appendable) {
        e.a(appendable);
        return new Appendable() { // from class: cn.sharesdk.framework.utils.l.1

            /* renamed from: a  reason: collision with root package name */
            int f1072a = -1;

            /* renamed from: b  reason: collision with root package name */
            char[] f1073b = new char[2];

            private void a(char[] cArr, int i4) throws IOException {
                for (int i5 = 0; i5 < i4; i5++) {
                    appendable.append(cArr[i5]);
                }
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence charSequence) throws IOException {
                return append(charSequence, 0, charSequence.length());
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence charSequence, int i4, int i5) throws IOException {
                int i6;
                if (i4 < i5) {
                    if (this.f1072a != -1) {
                        char charAt = charSequence.charAt(i4);
                        int i7 = i4 + 1;
                        if (Character.isLowSurrogate(charAt)) {
                            char[] a5 = l.this.a(Character.toCodePoint((char) this.f1072a, charAt));
                            if (a5 != null) {
                                a(a5, a5.length);
                                i4 = i7;
                            } else {
                                appendable.append((char) this.f1072a);
                            }
                            this.f1072a = -1;
                            i6 = i4;
                            i4 = i7;
                        } else {
                            throw new IllegalArgumentException("Expected low surrogate character but got " + charAt);
                        }
                    } else {
                        i6 = i4;
                    }
                    while (true) {
                        int a6 = l.this.a(charSequence, i4, i5);
                        if (a6 > i6) {
                            appendable.append(charSequence, i6, a6);
                        }
                        if (a6 == i5) {
                            break;
                        }
                        int b5 = l.b(charSequence, a6, i5);
                        if (b5 < 0) {
                            this.f1072a = -b5;
                            break;
                        }
                        char[] a7 = l.this.a(b5);
                        if (a7 != null) {
                            a(a7, a7.length);
                        } else {
                            a(this.f1073b, Character.toChars(b5, this.f1073b, 0));
                        }
                        i6 = (Character.isSupplementaryCodePoint(b5) ? 2 : 1) + a6;
                        i4 = i6;
                    }
                }
                return this;
            }

            @Override // java.lang.Appendable
            public Appendable append(char c5) throws IOException {
                if (this.f1072a != -1) {
                    if (Character.isLowSurrogate(c5)) {
                        char[] a5 = l.this.a(Character.toCodePoint((char) this.f1072a, c5));
                        if (a5 != null) {
                            a(a5, a5.length);
                        } else {
                            appendable.append((char) this.f1072a);
                            appendable.append(c5);
                        }
                        this.f1072a = -1;
                    } else {
                        throw new IllegalArgumentException("Expected low surrogate character but got '" + c5 + "' with value " + ((int) c5));
                    }
                } else if (Character.isHighSurrogate(c5)) {
                    this.f1072a = c5;
                } else if (!Character.isLowSurrogate(c5)) {
                    char[] a6 = l.this.a(c5);
                    if (a6 != null) {
                        a(a6, a6.length);
                    } else {
                        appendable.append(c5);
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected low surrogate character '" + c5 + "' with value " + ((int) c5));
                }
                return this;
            }
        };
    }

    private static final char[] a(char[] cArr, int i4, int i5) {
        char[] cArr2 = new char[i5];
        if (i4 > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i4);
        }
        return cArr2;
    }
}
