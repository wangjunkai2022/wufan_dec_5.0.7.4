package com.airbnb.lottie.network;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.k;
import com.airbnb.lottie.t0;
import com.airbnb.lottie.x;
import io.netty.handler.codec.http.HttpHeaders;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
/* compiled from: NetworkFetcher.java */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class g {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    private final f f4118a;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final e f4119b;

    public g(@NonNull f fVar, @NonNull e eVar) {
        this.f4118a = fVar;
        this.f4119b = eVar;
    }

    @Nullable
    @WorkerThread
    private k a(@NonNull String str, @Nullable String str2) {
        Pair<FileExtension, InputStream> b5;
        t0<k> u4;
        if (str2 == null || (b5 = this.f4118a.b(str)) == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) b5.first;
        InputStream inputStream = (InputStream) b5.second;
        if (fileExtension == FileExtension.ZIP) {
            u4 = x.L(new ZipInputStream(inputStream), str);
        } else {
            u4 = x.u(inputStream, str);
        }
        if (u4.b() != null) {
            return u4.b();
        }
        return null;
    }

    @NonNull
    @WorkerThread
    private t0<k> b(@NonNull String str, @Nullable String str2) {
        com.airbnb.lottie.utils.d.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                c a5 = this.f4119b.a(str);
                if (a5.isSuccessful()) {
                    t0<k> d5 = d(str, a5.w(), a5.contentType(), str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Completed fetch from network. Success: ");
                    sb.append(d5.b() != null);
                    com.airbnb.lottie.utils.d.a(sb.toString());
                    try {
                        a5.close();
                    } catch (IOException e5) {
                        com.airbnb.lottie.utils.d.f("LottieFetchResult close failed ", e5);
                    }
                    return d5;
                }
                t0<k> t0Var = new t0<>(new IllegalArgumentException(a5.error()));
                try {
                    a5.close();
                } catch (IOException e6) {
                    com.airbnb.lottie.utils.d.f("LottieFetchResult close failed ", e6);
                }
                return t0Var;
            } catch (Exception e7) {
                t0<k> t0Var2 = new t0<>(e7);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e8) {
                        com.airbnb.lottie.utils.d.f("LottieFetchResult close failed ", e8);
                    }
                }
                return t0Var2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e9) {
                    com.airbnb.lottie.utils.d.f("LottieFetchResult close failed ", e9);
                }
            }
            throw th;
        }
    }

    @NonNull
    private t0<k> d(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2, @Nullable String str3) throws IOException {
        FileExtension fileExtension;
        t0<k> f5;
        if (str2 == null) {
            str2 = HttpHeaders.Values.APPLICATION_JSON;
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            com.airbnb.lottie.utils.d.a("Received json response.");
            fileExtension = FileExtension.JSON;
            f5 = e(str, inputStream, str3);
        } else {
            com.airbnb.lottie.utils.d.a("Handling zip response.");
            fileExtension = FileExtension.ZIP;
            f5 = f(str, inputStream, str3);
        }
        if (str3 != null && f5.b() != null) {
            this.f4118a.f(str, fileExtension);
        }
        return f5;
    }

    @NonNull
    private t0<k> e(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) throws IOException {
        if (str2 == null) {
            return x.u(inputStream, null);
        }
        return x.u(new FileInputStream(this.f4118a.g(str, inputStream, FileExtension.JSON).getAbsolutePath()), str);
    }

    @NonNull
    private t0<k> f(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) throws IOException {
        if (str2 == null) {
            return x.L(new ZipInputStream(inputStream), null);
        }
        return x.L(new ZipInputStream(new FileInputStream(this.f4118a.g(str, inputStream, FileExtension.ZIP))), str);
    }

    @NonNull
    @WorkerThread
    public t0<k> c(@NonNull String str, @Nullable String str2) {
        k a5 = a(str, str2);
        if (a5 != null) {
            return new t0<>(a5);
        }
        com.airbnb.lottie.utils.d.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(str, str2);
    }
}
