package com.airbnb.lottie.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: LottieFetchResult.java */
/* loaded from: classes2.dex */
public interface c extends Closeable {
    @Nullable
    String contentType();

    @Nullable
    String error();

    boolean isSuccessful();

    @NonNull
    InputStream w() throws IOException;
}
