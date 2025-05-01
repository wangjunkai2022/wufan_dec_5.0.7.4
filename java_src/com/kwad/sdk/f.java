package com.kwad.sdk;
/* loaded from: classes5.dex */
public final class f {
    private volatile boolean alv = false;
    private com.kwad.sdk.f.a alw;

    private f(com.kwad.sdk.f.a aVar) {
        this.alw = aVar;
    }

    public static f W(final long j4) {
        return d(new com.kwad.sdk.f.a() { // from class: com.kwad.sdk.f.1
            @Override // com.kwad.sdk.f.a
            public final void accept(Object obj) {
                m.ac(j4);
            }
        });
    }

    public static f X(final long j4) {
        return d(new com.kwad.sdk.f.a() { // from class: com.kwad.sdk.f.2
            @Override // com.kwad.sdk.f.a
            public final void accept(Object obj) {
                m.ad(j4);
            }
        });
    }

    public static f Y(final long j4) {
        return d(new com.kwad.sdk.f.a() { // from class: com.kwad.sdk.f.3
            @Override // com.kwad.sdk.f.a
            public final void accept(Object obj) {
                m.af(j4);
            }
        });
    }

    public static f Z(final long j4) {
        return d(new com.kwad.sdk.f.a() { // from class: com.kwad.sdk.f.4
            @Override // com.kwad.sdk.f.a
            public final void accept(Object obj) {
                m.ag(j4);
            }
        });
    }

    private static f d(com.kwad.sdk.f.a aVar) {
        return new f(aVar);
    }

    public final synchronized void report() {
        if (this.alw != null && !this.alv) {
            this.alw.accept(null);
            this.alv = true;
        }
    }
}
