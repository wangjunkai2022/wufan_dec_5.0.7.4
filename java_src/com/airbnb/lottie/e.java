package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.os.TraceCompat;
import java.io.File;
/* compiled from: L.java */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f3834a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final String f3835b = "LOTTIE";

    /* renamed from: c  reason: collision with root package name */
    private static final int f3836c = 20;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f3837d;

    /* renamed from: e  reason: collision with root package name */
    private static String[] f3838e;

    /* renamed from: f  reason: collision with root package name */
    private static long[] f3839f;

    /* renamed from: g  reason: collision with root package name */
    private static int f3840g;

    /* renamed from: h  reason: collision with root package name */
    private static int f3841h;

    /* renamed from: i  reason: collision with root package name */
    private static com.airbnb.lottie.network.e f3842i;

    /* renamed from: j  reason: collision with root package name */
    private static com.airbnb.lottie.network.d f3843j;

    /* renamed from: k  reason: collision with root package name */
    private static volatile com.airbnb.lottie.network.g f3844k;

    /* renamed from: l  reason: collision with root package name */
    private static volatile com.airbnb.lottie.network.f f3845l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: L.java */
    /* loaded from: classes2.dex */
    public class a implements com.airbnb.lottie.network.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f3846a;

        a(Context context) {
            this.f3846a = context;
        }

        @Override // com.airbnb.lottie.network.d
        @NonNull
        public File a() {
            return new File(this.f3846a.getCacheDir(), "lottie_network_cache");
        }
    }

    private e() {
    }

    public static void a(String str) {
        if (f3837d) {
            int i4 = f3840g;
            if (i4 == 20) {
                f3841h++;
                return;
            }
            f3838e[i4] = str;
            f3839f[i4] = System.nanoTime();
            TraceCompat.beginSection(str);
            f3840g++;
        }
    }

    public static float b(String str) {
        int i4 = f3841h;
        if (i4 > 0) {
            f3841h = i4 - 1;
            return 0.0f;
        } else if (f3837d) {
            int i5 = f3840g - 1;
            f3840g = i5;
            if (i5 != -1) {
                if (str.equals(f3838e[i5])) {
                    TraceCompat.endSection();
                    return ((float) (System.nanoTime() - f3839f[f3840g])) / 1000000.0f;
                }
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f3838e[f3840g] + com.join.mgps.Util.h0.f27805a);
            }
            throw new IllegalStateException("Can't end trace section. There are none.");
        } else {
            return 0.0f;
        }
    }

    @NonNull
    public static com.airbnb.lottie.network.f c(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        com.airbnb.lottie.network.f fVar = f3845l;
        if (fVar == null) {
            synchronized (com.airbnb.lottie.network.f.class) {
                fVar = f3845l;
                if (fVar == null) {
                    com.airbnb.lottie.network.d dVar = f3843j;
                    if (dVar == null) {
                        dVar = new a(applicationContext);
                    }
                    fVar = new com.airbnb.lottie.network.f(dVar);
                    f3845l = fVar;
                }
            }
        }
        return fVar;
    }

    @NonNull
    public static com.airbnb.lottie.network.g d(@NonNull Context context) {
        com.airbnb.lottie.network.g gVar = f3844k;
        if (gVar == null) {
            synchronized (com.airbnb.lottie.network.g.class) {
                gVar = f3844k;
                if (gVar == null) {
                    com.airbnb.lottie.network.f c5 = c(context);
                    com.airbnb.lottie.network.e eVar = f3842i;
                    if (eVar == null) {
                        eVar = new com.airbnb.lottie.network.b();
                    }
                    gVar = new com.airbnb.lottie.network.g(c5, eVar);
                    f3844k = gVar;
                }
            }
        }
        return gVar;
    }

    public static void e(com.airbnb.lottie.network.d dVar) {
        f3843j = dVar;
    }

    public static void f(com.airbnb.lottie.network.e eVar) {
        f3842i = eVar;
    }

    public static void g(boolean z4) {
        if (f3837d == z4) {
            return;
        }
        f3837d = z4;
        if (z4) {
            f3838e = new String[20];
            f3839f = new long[20];
        }
    }
}
