package com.kwad.framework.filedownloader.download;
/* loaded from: classes5.dex */
public final class a {
    final long agE;
    final long agF;
    final long agG;
    final long contentLength;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(long j4, long j5, long j6, long j7) {
        this.agE = j4;
        this.agF = j5;
        this.agG = j6;
        this.contentLength = j7;
    }

    public final String toString() {
        return com.kwad.framework.filedownloader.f.f.b("range[%d, %d) current offset[%d]", Long.valueOf(this.agE), Long.valueOf(this.agG), Long.valueOf(this.agF));
    }
}
