package com.kwad.library.solder.lib;

import com.kwad.library.solder.lib.a.a;
import com.kwad.library.solder.lib.a.e;
import com.kwad.library.solder.lib.ext.PluginError;
/* loaded from: classes5.dex */
public class b<P extends com.kwad.library.solder.lib.a.a, R extends com.kwad.library.solder.lib.a.e<P>> implements com.kwad.library.solder.lib.ext.b<P, R> {
    com.kwad.library.solder.lib.ext.b<P, R> ajJ;
    com.kwad.library.solder.lib.ext.b<P, R> ajK;

    public b(com.kwad.library.solder.lib.ext.b<P, R> bVar, com.kwad.library.solder.lib.ext.b<P, R> bVar2) {
        this.ajJ = bVar;
        this.ajK = bVar2;
    }

    @Override // com.kwad.library.solder.lib.ext.b
    public final void a(R r4, P p4) {
        com.kwad.library.solder.lib.ext.b<P, R> bVar = this.ajJ;
        if (bVar != null) {
            bVar.a((com.kwad.library.solder.lib.ext.b<P, R>) r4, (R) p4);
        }
    }

    @Override // com.kwad.library.solder.lib.ext.b
    public final void b(R r4) {
        com.kwad.library.solder.lib.ext.b<P, R> bVar = this.ajJ;
        if (bVar != null) {
            bVar.b(r4);
        }
    }

    @Override // com.kwad.library.solder.lib.ext.b
    public final void c(R r4) {
        com.kwad.library.solder.lib.ext.b<P, R> bVar = this.ajJ;
        if (bVar != null) {
            bVar.c(r4);
        }
    }

    @Override // com.kwad.library.solder.lib.ext.b
    public final void d(R r4) {
        com.kwad.library.solder.lib.ext.b<P, R> bVar = this.ajJ;
        if (bVar != null) {
            bVar.d(r4);
        }
    }

    @Override // com.kwad.library.solder.lib.ext.b
    public final void e(R r4) {
        com.kwad.library.solder.lib.ext.b<P, R> bVar = this.ajJ;
        if (bVar != null) {
            bVar.e(r4);
        }
    }

    @Override // com.kwad.library.solder.lib.ext.b
    public final void f(R r4) {
        com.kwad.library.solder.lib.ext.b<P, R> bVar = this.ajJ;
        if (bVar != null) {
            bVar.f(r4);
        }
    }

    @Override // com.kwad.library.solder.lib.ext.b
    public void a(R r4, PluginError pluginError) {
        com.kwad.library.solder.lib.ext.b<P, R> bVar = this.ajJ;
        if (bVar != null) {
            bVar.a((com.kwad.library.solder.lib.ext.b<P, R>) r4, pluginError);
        }
        com.kwad.library.solder.lib.ext.b<P, R> bVar2 = this.ajK;
        if (bVar2 != null) {
            bVar2.a((com.kwad.library.solder.lib.ext.b<P, R>) r4, pluginError);
        }
    }

    @Override // com.kwad.library.solder.lib.ext.b
    public final void a(R r4) {
        com.kwad.library.solder.lib.ext.b<P, R> bVar = this.ajJ;
        if (bVar != null) {
            bVar.a(r4);
        }
    }
}
