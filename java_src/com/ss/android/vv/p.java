package com.ss.android.vv;

import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.Objects;
/* loaded from: classes5.dex */
public class p {
    private static final char[] vv = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class vv {

        /* renamed from: i  reason: collision with root package name */
        private long f61487i;

        /* renamed from: m  reason: collision with root package name */
        private int f61488m;

        /* renamed from: o  reason: collision with root package name */
        private String f61489o;

        /* renamed from: p  reason: collision with root package name */
        private int f61490p;
        private int vv;

        private vv() {
        }
    }

    private static String m(File file, int i4, long j4) throws Exception {
        return vv(new com.ss.android.vv.vv(file), i4, j4);
    }

    public static String vv(File file) {
        return vv(file, 9, 8192L);
    }

    private static long m(String str) throws RuntimeException {
        return (Long.parseLong(str, 16) - 31) >> 4;
    }

    public static String vv(File file, int i4, long j4) {
        if (file != null) {
            try {
                if (file.exists()) {
                    return m(file, i4, j4);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return "";
    }

    public static int vv(String str, File file) {
        return vv(str, file, (m) null);
    }

    public static int vv(String str, File file, m mVar) {
        String m4;
        if (str == null || str.length() == 0) {
            return 2;
        }
        try {
            if (mVar != null) {
                if (mVar.vv() <= 0) {
                    try {
                        mVar.m();
                    } catch (Throwable unused) {
                    }
                    return 5;
                }
            } else if (file == null || !file.exists()) {
                return 5;
            }
            int i4 = -1;
            long j4 = -1;
            try {
                vv vv2 = vv(str);
                if (vv2 != null) {
                    if (vv2.vv > 1) {
                        return 3;
                    }
                    i4 = vv2.f61490p;
                    j4 = vv2.f61487i;
                }
                vv vvVar = null;
                if (mVar != null) {
                    m4 = vv(mVar, i4, j4);
                } else {
                    m4 = m(file, i4, j4);
                }
                if (m4 != null && m4.length() != 0) {
                    if (vv2 != null && (vv2.vv != 1 || vv2.f61488m != 1)) {
                        if (vv2.f61489o != null) {
                            try {
                                vvVar = vv(m4);
                            } catch (Throwable unused2) {
                            }
                            if (vvVar != null && vv2.f61490p == vvVar.f61490p && vv2.f61487i == vvVar.f61487i && vv2.f61489o.equals(vvVar.f61489o)) {
                                return 0;
                            }
                        }
                    }
                    return m4.equals(str) ? 0 : 1;
                }
                return 6;
            } catch (Throwable unused3) {
                return 4;
            }
        } catch (Throwable unused4) {
            return 99;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:5|6|(6:13|14|(3:16|(1:18)|19)|(1:21)|22|(4:31|32|33|34)(3:26|27|28))|38|14|(0)|(0)|22|(1:24)|31|32|33|34) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[Catch: all -> 0x009f, TryCatch #3 {all -> 0x009f, blocks: (B:6:0x000d, B:10:0x001a, B:15:0x002e, B:17:0x0041, B:19:0x004e, B:21:0x0066, B:22:0x0071, B:28:0x0083), top: B:45:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066 A[Catch: all -> 0x009f, TryCatch #3 {all -> 0x009f, blocks: (B:6:0x000d, B:10:0x001a, B:15:0x002e, B:17:0x0041, B:19:0x004e, B:21:0x0066, B:22:0x0071, B:28:0x0083), top: B:45:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String vv(com.ss.android.vv.m r21, int r22, long r23) throws java.lang.Exception {
        /*
            r0 = r22
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)
            if (r1 != 0) goto Ld
            java.lang.String r0 = ""
            return r0
        Ld:
            long r9 = r21.vv()     // Catch: java.lang.Throwable -> L9f
            r11 = 0
            r13 = 1
            if (r0 <= 0) goto L2c
            int r2 = (r23 > r11 ? 1 : (r23 == r11 ? 0 : -1))
            if (r2 <= 0) goto L2c
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L9f
            long r2 = r2 * r23
            r4 = 8
            long r4 = r4 * r9
            r6 = 10
            long r4 = r4 / r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L29
            goto L2c
        L29:
            r14 = r23
            goto L2e
        L2c:
            r14 = r9
            r0 = 1
        L2e:
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r7 = new byte[r2]     // Catch: java.lang.Throwable -> L9f
            r5 = 0
            r2 = r21
            r3 = r1
            r4 = r7
            r16 = r7
            r7 = r14
            vv(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L9f
            r2 = 2
            if (r0 <= r2) goto L64
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L9f
            long r2 = r2 * r14
            long r2 = r9 - r2
            int r7 = r0 + (-1)
            long r4 = (long) r7     // Catch: java.lang.Throwable -> L9f
            long r17 = r2 / r4
            r8 = 1
        L4c:
            if (r8 >= r7) goto L64
            long r2 = r14 + r17
            long r11 = r11 + r2
            r2 = r21
            r3 = r1
            r4 = r16
            r5 = r11
            r19 = r7
            r20 = r8
            r7 = r14
            vv(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L9f
            int r8 = r20 + 1
            r7 = r19
            goto L4c
        L64:
            if (r0 <= r13) goto L71
            long r5 = r9 - r14
            r2 = r21
            r3 = r1
            r4 = r16
            r7 = r14
            vv(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L9f
        L71:
            byte[] r1 = r1.digest()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = vv(r1)     // Catch: java.lang.Throwable -> L9f
            if (r0 != r13) goto L83
            int r2 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r2 != 0) goto L83
            r21.m()     // Catch: java.lang.Throwable -> L82
        L82:
            return r1
        L83:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9f
            r2.<init>()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = vv(r0, r14)     // Catch: java.lang.Throwable -> L9f
            r2.append(r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = ";"
            r2.append(r0)     // Catch: java.lang.Throwable -> L9f
            r2.append(r1)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L9f
            r21.m()     // Catch: java.lang.Throwable -> L9e
        L9e:
            return r0
        L9f:
            r0 = move-exception
            r21.m()     // Catch: java.lang.Throwable -> La3
        La3:
            goto La5
        La4:
            throw r0
        La5:
            goto La4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vv.p.vv(com.ss.android.vv.m, int, long):java.lang.String");
    }

    private static void vv(m mVar, MessageDigest messageDigest, byte[] bArr, long j4, long j5) throws IOException {
        mVar.vv(j4, j5);
        long j6 = 0;
        while (j6 < j5) {
            int vv2 = mVar.vv(bArr, 0, (int) Math.min(j5 - j6, bArr.length));
            if (vv2 > 0) {
                messageDigest.update(bArr, 0, vv2);
                j6 += vv2;
            } else {
                throw new IOException("updateSample unexpected readCount <= 0, readCount = " + vv2 + ", readTotalCount = " + j6 + ", sampleSize = " + j5);
            }
        }
    }

    private static String vv(byte[] bArr) {
        Objects.requireNonNull(bArr, "bytes is null");
        int length = bArr.length;
        int i4 = length * 2;
        char[] cArr = new char[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = bArr[i6 + 0] & 255;
            int i8 = i5 + 1;
            char[] cArr2 = vv;
            cArr[i5] = cArr2[i7 >> 4];
            i5 = i8 + 1;
            cArr[i8] = cArr2[i7 & 15];
        }
        return new String(cArr, 0, i4);
    }

    private static String vv(int i4, long j4) {
        return "ttmd5:1:1:" + vv(i4) + "g" + vv(j4);
    }

    private static vv vv(String str) throws Exception {
        if (str.startsWith("ttmd5:")) {
            String[] split = str.split(";");
            String[] split2 = split[0].split(":");
            vv vvVar = new vv();
            vvVar.vv = Integer.parseInt(split2[1]);
            if (vvVar.vv > 1) {
                return vvVar;
            }
            vvVar.f61488m = Integer.parseInt(split2[2]);
            String[] split3 = split2[3].split("g");
            vvVar.f61490p = (int) m(split3[0]);
            vvVar.f61487i = m(split3[1]);
            vvVar.f61489o = split[1];
            return vvVar;
        }
        return null;
    }

    private static String vv(long j4) {
        return Long.toHexString((j4 << 4) + 31);
    }
}
