package com.airbnb.lottie.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
/* compiled from: DefaultLottieFetchResult.java */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class a implements c {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final HttpURLConnection f4116b;

    public a(@NonNull HttpURLConnection httpURLConnection) {
        this.f4116b = httpURLConnection;
    }

    private String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4116b.disconnect();
    }

    @Override // com.airbnb.lottie.network.c
    @Nullable
    public String contentType() {
        return this.f4116b.getContentType();
    }

    @Override // com.airbnb.lottie.network.c
    @Nullable
    public String error() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f4116b.getURL() + ". Failed with " + this.f4116b.getResponseCode() + "\n" + a(this.f4116b);
        } catch (IOException e5) {
            com.airbnb.lottie.utils.d.f("get error failed ", e5);
            return e5.getMessage();
        }
    }

    @Override // com.airbnb.lottie.network.c
    public boolean isSuccessful() {
        try {
            return this.f4116b.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.airbnb.lottie.network.c
    @NonNull
    public InputStream w() throws IOException {
        return this.f4116b.getInputStream();
    }
}
