package com.facebook.imagepipeline.decoder;

import com.facebook.common.internal.h;
import com.facebook.common.internal.m;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProgressiveJpegParser.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: i  reason: collision with root package name */
    private static final int f11893i = 0;

    /* renamed from: j  reason: collision with root package name */
    private static final int f11894j = 1;

    /* renamed from: k  reason: collision with root package name */
    private static final int f11895k = 2;

    /* renamed from: l  reason: collision with root package name */
    private static final int f11896l = 3;

    /* renamed from: m  reason: collision with root package name */
    private static final int f11897m = 4;

    /* renamed from: n  reason: collision with root package name */
    private static final int f11898n = 5;

    /* renamed from: o  reason: collision with root package name */
    private static final int f11899o = 6;

    /* renamed from: p  reason: collision with root package name */
    private static final int f11900p = 16384;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11907g;

    /* renamed from: h  reason: collision with root package name */
    private final com.facebook.common.memory.a f11908h;

    /* renamed from: c  reason: collision with root package name */
    private int f11903c = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f11902b = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f11904d = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f11906f = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f11905e = 0;

    /* renamed from: a  reason: collision with root package name */
    private int f11901a = 0;

    public e(com.facebook.common.memory.a aVar) {
        this.f11908h = (com.facebook.common.memory.a) h.i(aVar);
    }

    private boolean a(InputStream inputStream) {
        int read;
        int i4 = this.f11905e;
        while (this.f11901a != 6 && (read = inputStream.read()) != -1) {
            try {
                int i5 = this.f11903c + 1;
                this.f11903c = i5;
                if (this.f11907g) {
                    this.f11901a = 6;
                    this.f11907g = false;
                    return false;
                }
                int i6 = this.f11901a;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (i6 == 4) {
                                    this.f11901a = 5;
                                } else if (i6 != 5) {
                                    h.o(false);
                                } else {
                                    int i7 = ((this.f11902b << 8) + read) - 2;
                                    com.facebook.common.util.e.c(inputStream, i7);
                                    this.f11903c += i7;
                                    this.f11901a = 2;
                                }
                            } else if (read == 255) {
                                this.f11901a = 3;
                            } else if (read == 0) {
                                this.f11901a = 2;
                            } else if (read == 217) {
                                this.f11907g = true;
                                g(i5 - 2);
                                this.f11901a = 2;
                            } else {
                                if (read == 218) {
                                    g(i5 - 2);
                                }
                                if (b(read)) {
                                    this.f11901a = 4;
                                } else {
                                    this.f11901a = 2;
                                }
                            }
                        } else if (read == 255) {
                            this.f11901a = 3;
                        }
                    } else if (read == 216) {
                        this.f11901a = 2;
                    } else {
                        this.f11901a = 6;
                    }
                } else if (read == 255) {
                    this.f11901a = 1;
                } else {
                    this.f11901a = 6;
                }
                this.f11902b = read;
            } catch (IOException e5) {
                m.d(e5);
            }
        }
        return (this.f11901a == 6 || this.f11905e == i4) ? false : true;
    }

    private static boolean b(int i4) {
        if (i4 == 1) {
            return false;
        }
        return ((i4 >= 208 && i4 <= 215) || i4 == 217 || i4 == 216) ? false : true;
    }

    private void g(int i4) {
        int i5 = this.f11904d;
        if (i5 > 0) {
            this.f11906f = i4;
        }
        this.f11904d = i5 + 1;
        this.f11905e = i5;
    }

    public int c() {
        return this.f11906f;
    }

    public int d() {
        return this.f11905e;
    }

    public boolean e() {
        return this.f11907g;
    }

    public boolean f() {
        return this.f11903c > 1 && this.f11901a != 6;
    }

    public boolean h(com.facebook.imagepipeline.image.e eVar) {
        if (this.f11901a != 6 && eVar.z() > this.f11903c) {
            com.facebook.common.memory.f fVar = new com.facebook.common.memory.f(eVar.u(), this.f11908h.get(16384), this.f11908h);
            try {
                com.facebook.common.util.e.c(fVar, this.f11903c);
                return a(fVar);
            } catch (IOException e5) {
                m.d(e5);
                return false;
            } finally {
                com.facebook.common.internal.c.b(fVar);
            }
        }
        return false;
    }
}
