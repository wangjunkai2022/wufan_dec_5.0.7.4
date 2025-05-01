package com.efs.sdk.net.a.a;

import java.io.InputStream;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes2.dex */
public interface f {

    /* loaded from: classes2.dex */
    public interface a {
        String a(int i4);

        String b(int i4);

        int e();
    }

    /* loaded from: classes2.dex */
    public interface b extends c {
        String b();

        String c();

        @Nullable
        byte[] d();
    }

    /* loaded from: classes2.dex */
    public interface c extends a {
        String a();
    }

    /* loaded from: classes2.dex */
    public interface d extends e {
    }

    /* loaded from: classes2.dex */
    public interface e extends a {
        String a();

        int b();
    }

    @Nullable
    InputStream a(String str, @Nullable String str2, @Nullable String str3, @Nullable InputStream inputStream);

    void a();

    void a(b bVar);

    void a(d dVar);

    String b();
}
