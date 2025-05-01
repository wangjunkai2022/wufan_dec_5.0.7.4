package com.bytedance.pangle.g;

import android.system.Os;
import android.system.OsConstants;
import java.io.FileDescriptor;
/* loaded from: classes2.dex */
final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    private static final long f8412a = Os.sysconf(OsConstants._SC_PAGESIZE);

    /* renamed from: b  reason: collision with root package name */
    private final FileDescriptor f8413b;

    /* renamed from: c  reason: collision with root package name */
    private final long f8414c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8415d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(FileDescriptor fileDescriptor, long j4, long j5) {
        this.f8413b = fileDescriptor;
        this.f8414c = j4;
        this.f8415d = j5;
    }

    @Override // com.bytedance.pangle.g.k
    public final long a() {
        return this.f8415d;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.pangle.g.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.bytedance.pangle.g.j r20, long r21, int r23) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.g.l.a(com.bytedance.pangle.g.j, long, int):void");
    }
}
