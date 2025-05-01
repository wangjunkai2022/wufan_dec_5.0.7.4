package com.kwad.sdk.core.diskcache.b;

import androidx.annotation.NonNull;
import com.kwad.sdk.core.diskcache.a.a;
import com.kwad.sdk.core.network.a.a;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.g;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes5.dex */
public final class b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@NonNull final com.kwad.sdk.core.diskcache.a.a aVar, @NonNull final String str, @NonNull final String str2) {
        g.execute(new az() { // from class: com.kwad.sdk.core.diskcache.b.b.1
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                OutputStream outputStream = null;
                try {
                    a.C0517a dz = com.kwad.sdk.core.diskcache.a.a.this.dz(str2);
                    if (dz != null) {
                        outputStream = dz.cZ(0);
                        if (b.a(str, outputStream, new a.C0525a())) {
                            dz.commit();
                        } else {
                            dz.abort();
                        }
                        com.kwad.sdk.core.diskcache.a.a.this.flush();
                    }
                } catch (IOException unused) {
                } finally {
                    com.kwad.sdk.crash.utils.b.closeQuietly(outputStream);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File a(@NonNull com.kwad.sdk.core.diskcache.a.a aVar, @NonNull String str) {
        a.c cVar;
        a.c cVar2 = null;
        try {
            cVar = aVar.dy(str);
            if (cVar != null) {
                try {
                    File dc = cVar.dc(0);
                    com.kwad.sdk.crash.utils.b.closeQuietly(cVar);
                    return dc;
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th = th;
                    cVar2 = cVar;
                    com.kwad.sdk.crash.utils.b.closeQuietly(cVar2);
                    throw th;
                }
            }
        } catch (IOException unused2) {
            cVar = null;
        } catch (Throwable th2) {
            th = th2;
        }
        com.kwad.sdk.crash.utils.b.closeQuietly(cVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(@NonNull com.kwad.sdk.core.diskcache.a.a aVar, @NonNull String str, @NonNull String str2, a.C0525a c0525a) {
        boolean z4 = false;
        OutputStream outputStream = null;
        try {
            try {
                a.C0517a dz = aVar.dz(str2);
                if (dz != null) {
                    outputStream = dz.cZ(0);
                    if (a(str, outputStream, c0525a)) {
                        dz.commit();
                        z4 = true;
                    } else {
                        dz.abort();
                    }
                    aVar.flush();
                }
            } catch (IOException e5) {
                c0525a.msg = e5.getMessage();
            }
            return z4;
        } finally {
            com.kwad.sdk.crash.utils.b.closeQuietly(outputStream);
        }
    }

    public static boolean a(String str, OutputStream outputStream, a.C0525a c0525a) {
        return com.kwad.sdk.core.network.a.a.a(str, outputStream, c0525a, -1L, null);
    }
}
