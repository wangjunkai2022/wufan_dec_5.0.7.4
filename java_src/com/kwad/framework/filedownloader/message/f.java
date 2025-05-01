package com.kwad.framework.filedownloader.message;

import com.kwad.framework.filedownloader.download.d;
import com.kwad.framework.filedownloader.message.MessageSnapshot;
import com.kwad.framework.filedownloader.message.a;
import com.kwad.framework.filedownloader.message.d;
import com.kwad.framework.filedownloader.message.h;
import java.io.File;
/* loaded from: classes5.dex */
public class f {
    public static MessageSnapshot a(int i4, File file, boolean z4) {
        long length = file.length();
        if (length > 2147483647L) {
            if (z4) {
                return new d.a(i4, true, length);
            }
            return new d.b(i4, true, length);
        } else if (z4) {
            return new h.a(i4, true, (int) length);
        } else {
            return new h.b(i4, true, (int) length);
        }
    }

    public static MessageSnapshot e(com.kwad.framework.filedownloader.a aVar) {
        if (aVar.uF()) {
            return new d.e(aVar.getId(), aVar.ux(), aVar.uy());
        }
        return new h.e(aVar.getId(), aVar.getSmallFileSoFarBytes(), aVar.getSmallFileTotalBytes());
    }

    public static MessageSnapshot t(MessageSnapshot messageSnapshot) {
        if (messageSnapshot.uz() == -3) {
            return new a.C0499a(messageSnapshot);
        }
        throw new IllegalStateException(com.kwad.framework.filedownloader.f.f.b("take block completed snapshot, must has already be completed. %d %d", Integer.valueOf(messageSnapshot.getId()), Byte.valueOf(messageSnapshot.uz())));
    }

    public static MessageSnapshot a(int i4, long j4, long j5, boolean z4) {
        if (j5 > 2147483647L) {
            if (z4) {
                return new d.i(i4, j4, j5);
            }
            return new d.j(i4, j4, j5);
        } else if (z4) {
            return new h.i(i4, (int) j4, (int) j5);
        } else {
            return new h.j(i4, (int) j4, (int) j5);
        }
    }

    public static MessageSnapshot a(int i4, long j4, Throwable th) {
        if (j4 > 2147483647L) {
            return new d.C0500d(i4, j4, th);
        }
        return new h.d(i4, (int) j4, th);
    }

    public static MessageSnapshot a(byte b5, com.kwad.framework.filedownloader.d.c cVar, d.a aVar) {
        MessageSnapshot dVar;
        IllegalStateException illegalStateException;
        int id = cVar.getId();
        if (b5 != -4) {
            if (b5 == -3) {
                if (cVar.uF()) {
                    return new d.b(id, false, cVar.getTotal());
                }
                return new h.b(id, false, (int) cVar.getTotal());
            }
            if (b5 != -1) {
                if (b5 == 1) {
                    if (cVar.uF()) {
                        return new d.f(id, cVar.wP(), cVar.getTotal());
                    }
                    return new h.f(id, (int) cVar.wP(), (int) cVar.getTotal());
                } else if (b5 == 2) {
                    String filename = cVar.uv() ? cVar.getFilename() : null;
                    if (cVar.uF()) {
                        return new d.c(id, aVar.wu(), cVar.getTotal(), cVar.wQ(), filename);
                    }
                    return new h.c(id, aVar.wu(), (int) cVar.getTotal(), cVar.wQ(), filename);
                } else if (b5 == 3) {
                    if (cVar.uF()) {
                        return new d.g(id, cVar.wP());
                    }
                    return new h.g(id, (int) cVar.wP());
                } else if (b5 != 5) {
                    if (b5 != 6) {
                        String b6 = com.kwad.framework.filedownloader.f.f.b("it can't takes a snapshot for the task(%s) when its status is %d,", cVar, Byte.valueOf(b5));
                        com.kwad.framework.filedownloader.f.d.d(f.class, "it can't takes a snapshot for the task(%s) when its status is %d,", cVar, Byte.valueOf(b5));
                        if (aVar.getException() != null) {
                            illegalStateException = new IllegalStateException(b6, aVar.getException());
                        } else {
                            illegalStateException = new IllegalStateException(b6);
                        }
                        if (cVar.uF()) {
                            return new d.C0500d(id, cVar.wP(), illegalStateException);
                        }
                        return new h.d(id, (int) cVar.wP(), illegalStateException);
                    }
                    return new MessageSnapshot.b(id);
                } else if (cVar.uF()) {
                    dVar = new d.h(id, cVar.wP(), aVar.getException(), aVar.uD());
                } else {
                    dVar = new h.C0501h(id, (int) cVar.wP(), aVar.getException(), aVar.uD());
                }
            } else if (cVar.uF()) {
                dVar = new d.C0500d(id, cVar.wP(), aVar.getException());
            } else {
                dVar = new h.d(id, (int) cVar.wP(), aVar.getException());
            }
            return dVar;
        }
        throw new IllegalStateException(com.kwad.framework.filedownloader.f.f.b("please use #catchWarn instead %d", Integer.valueOf(id)));
    }
}
