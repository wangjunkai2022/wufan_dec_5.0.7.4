package com.kuaishou.weapon.p0;

import java.io.UnsupportedEncodingException;
import java.util.regex.Pattern;
/* loaded from: classes5.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f55368a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f55369b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f55370c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f55371d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static final int f55372e = 8;

    /* renamed from: f  reason: collision with root package name */
    public static final int f55373f = 16;

    /* renamed from: g  reason: collision with root package name */
    static final /* synthetic */ boolean f55374g = true;

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f55375h = Pattern.compile("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f55376a;

        /* renamed from: b  reason: collision with root package name */
        public int f55377b;

        a() {
        }

        public abstract int a(int i4);

        public abstract boolean a(byte[] bArr, int i4, int i5, boolean z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class b extends a {

        /* renamed from: c  reason: collision with root package name */
        private static final int[] f55378c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: d  reason: collision with root package name */
        private static final int[] f55379d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: e  reason: collision with root package name */
        private static final int f55380e = -1;

        /* renamed from: f  reason: collision with root package name */
        private static final int f55381f = -2;

        /* renamed from: g  reason: collision with root package name */
        private int f55382g;

        /* renamed from: h  reason: collision with root package name */
        private int f55383h;

        /* renamed from: i  reason: collision with root package name */
        private final int[] f55384i;

        public b(int i4, byte[] bArr) {
            this.f55376a = bArr;
            this.f55384i = (i4 & 8) == 0 ? f55378c : f55379d;
            this.f55382g = 0;
            this.f55383h = 0;
        }

        @Override // com.kuaishou.weapon.p0.c.a
        public int a(int i4) {
            return ((i4 * 3) / 4) + 10;
        }

        @Override // com.kuaishou.weapon.p0.c.a
        public boolean a(byte[] bArr, int i4, int i5, boolean z4) {
            int i6 = this.f55382g;
            if (i6 == 6) {
                return false;
            }
            int i7 = i5 + i4;
            int i8 = this.f55383h;
            byte[] bArr2 = this.f55376a;
            int[] iArr = this.f55384i;
            int i9 = i8;
            int i10 = 0;
            int i11 = i6;
            int i12 = i4;
            while (i12 < i7) {
                if (i11 == 0) {
                    while (true) {
                        int i13 = i12 + 4;
                        if (i13 > i7) {
                            break;
                        }
                        i9 = iArr[bArr[i12 + 3] & 255] | (iArr[bArr[i12 + 1] & 255] << 12) | (iArr[bArr[i12] & 255] << 18) | (iArr[bArr[i12 + 2] & 255] << 6);
                        if (i9 < 0) {
                            break;
                        }
                        bArr2[i10 + 2] = (byte) i9;
                        bArr2[i10 + 1] = (byte) (i9 >> 8);
                        bArr2[i10] = (byte) (i9 >> 16);
                        i10 += 3;
                        i12 = i13;
                    }
                    if (i12 >= i7) {
                        break;
                    }
                }
                int i14 = i12 + 1;
                int i15 = iArr[bArr[i12] & 255];
                if (i11 != 0) {
                    if (i11 == 1) {
                        if (i15 < 0) {
                            if (i15 != -1) {
                                this.f55382g = 6;
                                return false;
                            }
                        }
                        i9 = (i9 << 6) | i15;
                        i11++;
                    } else if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                if (i15 != -2) {
                                    if (i15 != -1) {
                                        this.f55382g = 6;
                                        return false;
                                    }
                                }
                                i11++;
                            } else if (i11 == 5 && i15 != -1) {
                                this.f55382g = 6;
                                return false;
                            }
                        } else if (i15 >= 0) {
                            i9 = (i9 << 6) | i15;
                            bArr2[i10 + 2] = (byte) i9;
                            bArr2[i10 + 1] = (byte) (i9 >> 8);
                            bArr2[i10] = (byte) (i9 >> 16);
                            i10 += 3;
                            i12 = i14;
                            i11 = 0;
                        } else if (i15 == -2) {
                            bArr2[i10 + 1] = (byte) (i9 >> 2);
                            bArr2[i10] = (byte) (i9 >> 10);
                            i10 += 2;
                            i12 = i14;
                            i11 = 5;
                        } else if (i15 != -1) {
                            this.f55382g = 6;
                            return false;
                        }
                    } else if (i15 >= 0) {
                        i9 = (i9 << 6) | i15;
                        i11++;
                    } else if (i15 == -2) {
                        bArr2[i10] = (byte) (i9 >> 4);
                        i10++;
                        i12 = i14;
                        i11 = 4;
                    } else if (i15 != -1) {
                        this.f55382g = 6;
                        return false;
                    }
                } else if (i15 >= 0) {
                    i11++;
                    i9 = i15;
                } else if (i15 != -1) {
                    this.f55382g = 6;
                    return false;
                }
                i12 = i14;
            }
            if (!z4) {
                this.f55382g = i11;
                this.f55383h = i9;
                this.f55377b = i10;
                return true;
            } else if (i11 != 1) {
                if (i11 == 2) {
                    bArr2[i10] = (byte) (i9 >> 4);
                    i10++;
                } else if (i11 == 3) {
                    int i16 = i10 + 1;
                    bArr2[i10] = (byte) (i9 >> 10);
                    i10 = i16 + 1;
                    bArr2[i16] = (byte) (i9 >> 2);
                } else if (i11 == 4) {
                    this.f55382g = 6;
                    return false;
                }
                this.f55382g = i11;
                this.f55377b = i10;
                return true;
            } else {
                this.f55382g = 6;
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kuaishou.weapon.p0.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0393c extends a {

        /* renamed from: c  reason: collision with root package name */
        public static final int f55385c = 19;

        /* renamed from: h  reason: collision with root package name */
        static final /* synthetic */ boolean f55386h = true;

        /* renamed from: i  reason: collision with root package name */
        private static final byte[] f55387i = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: j  reason: collision with root package name */
        private static final byte[] f55388j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: d  reason: collision with root package name */
        int f55389d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f55390e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f55391f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f55392g;

        /* renamed from: k  reason: collision with root package name */
        private final byte[] f55393k;

        /* renamed from: l  reason: collision with root package name */
        private int f55394l;

        /* renamed from: m  reason: collision with root package name */
        private final byte[] f55395m;

        public C0393c(int i4, byte[] bArr) {
            this.f55376a = bArr;
            this.f55390e = (i4 & 1) == 0;
            boolean z4 = (i4 & 2) == 0;
            this.f55391f = z4;
            this.f55392g = (i4 & 4) != 0;
            this.f55395m = (i4 & 8) == 0 ? f55387i : f55388j;
            this.f55393k = new byte[2];
            this.f55389d = 0;
            this.f55394l = z4 ? 19 : -1;
        }

        @Override // com.kuaishou.weapon.p0.c.a
        public int a(int i4) {
            return ((i4 * 8) / 5) + 10;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x00e6 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00dd -> B:22:0x008a). Please submit an issue!!! */
        @Override // com.kuaishou.weapon.p0.c.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 512
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.c.C0393c.a(byte[], int, int, boolean):boolean");
        }
    }

    private c() {
    }

    public static byte[] a(String str, int i4) {
        return a(str.getBytes(), i4);
    }

    public static String b(String str, int i4) {
        try {
            return new String(a(str.getBytes(), i4));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static byte[] c(byte[] bArr, int i4) {
        try {
            return c(bArr, 0, bArr.length, i4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] a(byte[] bArr) {
        return a(bArr, 0, bArr.length, 0);
    }

    public static String b(byte[] bArr, int i4) {
        try {
            return new String(c(bArr, i4), com.alipay.security.mobile.module.commonutils.crypto.a.f4994b);
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }

    public static byte[] c(byte[] bArr, int i4, int i5, int i6) {
        C0393c c0393c = new C0393c(i6, null);
        int i7 = (i5 / 3) * 4;
        if (c0393c.f55390e) {
            if (i5 % 3 > 0) {
                i7 += 4;
            }
        } else {
            int i8 = i5 % 3;
            if (i8 == 1) {
                i7 += 2;
            } else if (i8 == 2) {
                i7 += 3;
            }
        }
        if (c0393c.f55391f && i5 > 0) {
            i7 += (((i5 - 1) / 57) + 1) * (c0393c.f55392g ? 2 : 1);
        }
        c0393c.f55376a = new byte[i7];
        c0393c.a(bArr, i4, i5, true);
        if (f55374g || c0393c.f55377b == i7) {
            return c0393c.f55376a;
        }
        throw new AssertionError();
    }

    public static byte[] a(byte[] bArr, int i4) {
        return a(bArr, 0, bArr.length, i4);
    }

    public static byte[] a(byte[] bArr, int i4, int i5, int i6) {
        b bVar = new b(i6, new byte[(i5 * 3) / 4]);
        if (bVar.a(bArr, i4, i5, true)) {
            int i7 = bVar.f55377b;
            byte[] bArr2 = bVar.f55376a;
            if (i7 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i7];
            System.arraycopy(bArr2, 0, bArr3, 0, i7);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static String b(byte[] bArr, int i4, int i5, int i6) {
        try {
            return new String(c(bArr, i4, i5, i6), com.alipay.security.mobile.module.commonutils.crypto.a.f4994b);
        } catch (Throwable th) {
            throw new AssertionError(th);
        }
    }

    public static String a(byte[] bArr, String str) {
        try {
            return new String(c(bArr, 0), str);
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }

    public static boolean a(String str) {
        if (str != null) {
            try {
                if (!str.equals("")) {
                    return f55375h.matcher(str).matches();
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
