package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import kotlin.UShort;
/* loaded from: classes2.dex */
public final class MinElf {

    /* renamed from: a  reason: collision with root package name */
    public static final int f12662a = 1179403647;

    /* renamed from: b  reason: collision with root package name */
    public static final int f12663b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f12664c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f12665d = 5;

    /* renamed from: e  reason: collision with root package name */
    public static final int f12666e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f12667f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f12668g = 65535;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class ElfError extends RuntimeException {
        ElfError(String str) {
            super(str);
        }
    }

    public static String[] a(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return b(fileInputStream.getChannel());
        } finally {
            fileInputStream.close();
        }
    }

    public static String[] b(FileChannel fileChannel) throws IOException {
        long c5;
        long e5;
        int e6;
        long j4;
        boolean z4;
        long c6;
        long j5;
        long c7;
        long j6;
        long c8;
        long c9;
        long f5;
        long j7;
        long c10;
        long c11;
        long c12;
        long f6;
        long c13;
        long f7;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (f(fileChannel, allocate, 0L) == 1179403647) {
            boolean z5 = g(fileChannel, allocate, 4L) == 1;
            if (g(fileChannel, allocate, 5L) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z5) {
                c5 = f(fileChannel, allocate, 28L);
            } else {
                c5 = c(fileChannel, allocate, 32L);
            }
            if (z5) {
                e5 = e(fileChannel, allocate, 44L);
            } else {
                e5 = e(fileChannel, allocate, 56L);
            }
            if (z5) {
                e6 = e(fileChannel, allocate, 42L);
            } else {
                e6 = e(fileChannel, allocate, 54L);
            }
            if (e5 == 65535) {
                if (z5) {
                    c13 = f(fileChannel, allocate, 32L);
                } else {
                    c13 = c(fileChannel, allocate, 40L);
                }
                if (z5) {
                    f7 = f(fileChannel, allocate, c13 + 28);
                } else {
                    f7 = f(fileChannel, allocate, c13 + 44);
                }
                e5 = f7;
            }
            long j8 = c5;
            long j9 = 0;
            while (true) {
                if (j9 >= e5) {
                    j4 = 0;
                    break;
                }
                if (z5) {
                    f6 = f(fileChannel, allocate, j8 + 0);
                } else {
                    f6 = f(fileChannel, allocate, j8 + 0);
                }
                if (f6 != 2) {
                    j8 += e6;
                    j9++;
                } else if (z5) {
                    j4 = f(fileChannel, allocate, j8 + 4);
                } else {
                    j4 = c(fileChannel, allocate, j8 + 8);
                }
            }
            long j10 = 0;
            if (j4 == 0) {
                throw new ElfError("ELF file does not contain dynamic linking information");
            }
            long j11 = j4;
            long j12 = 0;
            int i4 = 0;
            while (true) {
                if (z5) {
                    z4 = z5;
                    c6 = f(fileChannel, allocate, j11 + j10);
                } else {
                    z4 = z5;
                    c6 = c(fileChannel, allocate, j11 + j10);
                }
                if (c6 == 1) {
                    j5 = j4;
                    if (i4 == Integer.MAX_VALUE) {
                        throw new ElfError("malformed DT_NEEDED section");
                    }
                    i4++;
                } else {
                    j5 = j4;
                    if (c6 == 5) {
                        if (z4) {
                            c7 = f(fileChannel, allocate, j11 + 4);
                        } else {
                            c7 = c(fileChannel, allocate, j11 + 8);
                        }
                        j12 = c7;
                    }
                }
                long j13 = 16;
                j11 += z4 ? 8L : 16L;
                j10 = 0;
                if (c6 != 0) {
                    z5 = z4;
                    j4 = j5;
                } else if (j12 == 0) {
                    throw new ElfError("Dynamic section string-table not found");
                } else {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= e5) {
                            j6 = 0;
                            break;
                        }
                        if (z4) {
                            f5 = f(fileChannel, allocate, c5 + j10);
                        } else {
                            f5 = f(fileChannel, allocate, c5 + j10);
                        }
                        if (f5 == 1) {
                            if (z4) {
                                c10 = f(fileChannel, allocate, c5 + 8);
                            } else {
                                c10 = c(fileChannel, allocate, c5 + j13);
                            }
                            if (z4) {
                                j7 = e5;
                                c11 = f(fileChannel, allocate, c5 + 20);
                            } else {
                                j7 = e5;
                                c11 = c(fileChannel, allocate, c5 + 40);
                            }
                            if (c10 <= j12 && j12 < c11 + c10) {
                                if (z4) {
                                    c12 = f(fileChannel, allocate, c5 + 4);
                                } else {
                                    c12 = c(fileChannel, allocate, c5 + 8);
                                }
                                j6 = c12 + (j12 - c10);
                            }
                        } else {
                            j7 = e5;
                        }
                        c5 += e6;
                        i5++;
                        e5 = j7;
                        j13 = 16;
                        j10 = 0;
                    }
                    long j14 = 0;
                    if (j6 != 0) {
                        String[] strArr = new String[i4];
                        int i6 = 0;
                        while (true) {
                            if (z4) {
                                c8 = f(fileChannel, allocate, j5 + j14);
                            } else {
                                c8 = c(fileChannel, allocate, j5 + j14);
                            }
                            if (c8 == 1) {
                                if (z4) {
                                    c9 = f(fileChannel, allocate, j5 + 4);
                                } else {
                                    c9 = c(fileChannel, allocate, j5 + 8);
                                }
                                strArr[i6] = d(fileChannel, allocate, c9 + j6);
                                if (i6 == Integer.MAX_VALUE) {
                                    throw new ElfError("malformed DT_NEEDED section");
                                }
                                i6++;
                            }
                            j5 += z4 ? 8L : 16L;
                            if (c8 == 0) {
                                if (i6 == i4) {
                                    return strArr;
                                }
                                throw new ElfError("malformed DT_NEEDED section");
                            }
                            j14 = 0;
                        }
                    } else {
                        throw new ElfError("did not find file offset of DT_STRTAB table");
                    }
                }
            }
        } else {
            throw new ElfError("file is not ELF");
        }
    }

    private static long c(FileChannel fileChannel, ByteBuffer byteBuffer, long j4) throws IOException {
        h(fileChannel, byteBuffer, 8, j4);
        return byteBuffer.getLong();
    }

    private static String d(FileChannel fileChannel, ByteBuffer byteBuffer, long j4) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j5 = 1 + j4;
            short g4 = g(fileChannel, byteBuffer, j4);
            if (g4 != 0) {
                sb.append((char) g4);
                j4 = j5;
            } else {
                return sb.toString();
            }
        }
    }

    private static int e(FileChannel fileChannel, ByteBuffer byteBuffer, long j4) throws IOException {
        h(fileChannel, byteBuffer, 2, j4);
        return byteBuffer.getShort() & UShort.MAX_VALUE;
    }

    private static long f(FileChannel fileChannel, ByteBuffer byteBuffer, long j4) throws IOException {
        h(fileChannel, byteBuffer, 4, j4);
        return byteBuffer.getInt() & 4294967295L;
    }

    private static short g(FileChannel fileChannel, ByteBuffer byteBuffer, long j4) throws IOException {
        h(fileChannel, byteBuffer, 1, j4);
        return (short) (byteBuffer.get() & 255);
    }

    private static void h(FileChannel fileChannel, ByteBuffer byteBuffer, int i4, long j4) throws IOException {
        int read;
        byteBuffer.position(0);
        byteBuffer.limit(i4);
        while (byteBuffer.remaining() > 0 && (read = fileChannel.read(byteBuffer, j4)) != -1) {
            j4 += read;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new ElfError("ELF file truncated");
    }
}
