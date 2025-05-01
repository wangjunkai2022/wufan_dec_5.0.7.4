package com.kwad.framework.filedownloader.f;

import android.annotation.SuppressLint;
import android.content.Context;
import com.kwad.framework.filedownloader.exception.PathConflictException;
import com.kwad.framework.filedownloader.y;
import java.io.File;
/* loaded from: classes5.dex */
public final class c {
    @SuppressLint({"StaticFieldLeak"})
    private static Context aja;

    /* loaded from: classes5.dex */
    public interface a {
        int O(long j4);
    }

    /* loaded from: classes5.dex */
    public interface b {
        com.kwad.framework.filedownloader.a.b bh(String str);
    }

    /* renamed from: com.kwad.framework.filedownloader.f.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0498c {
        com.kwad.framework.filedownloader.b.a xq();
    }

    /* loaded from: classes5.dex */
    public interface d {
        int f(String str, String str2, boolean z4);

        int g(String str, String str2, boolean z4);
    }

    /* loaded from: classes5.dex */
    public interface e {
        com.kwad.framework.filedownloader.e.a c(File file);
    }

    public static boolean a(int i4, String str, boolean z4, boolean z5) {
        if (!z4 && str != null) {
            File file = new File(str);
            if (file.exists()) {
                com.kwad.framework.filedownloader.message.e.wJ().s(com.kwad.framework.filedownloader.message.f.a(i4, file, z5));
                return true;
            }
        }
        return false;
    }

    public static void ax(Context context) {
        aja = context;
    }

    public static Context xp() {
        return aja;
    }

    public static boolean a(int i4, com.kwad.framework.filedownloader.d.c cVar, y yVar, boolean z4) {
        if (yVar.a(cVar)) {
            com.kwad.framework.filedownloader.message.e.wJ().s(com.kwad.framework.filedownloader.message.f.a(i4, cVar.wP(), cVar.getTotal(), z4));
            return true;
        }
        return false;
    }

    public static boolean a(int i4, long j4, String str, String str2, y yVar) {
        int o4;
        if (str2 == null || str == null || (o4 = yVar.o(str, i4)) == 0) {
            return false;
        }
        com.kwad.framework.filedownloader.message.e.wJ().s(com.kwad.framework.filedownloader.message.f.a(i4, j4, new PathConflictException(o4, str, str2)));
        return true;
    }
}
