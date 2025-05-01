package com.beizi.fusion.sm.a.a;

import io.netty.handler.codec.rtsp.RtspHeaders;
/* compiled from: DefaultImpl.java */
/* loaded from: classes2.dex */
class d implements com.beizi.fusion.sm.a.d {
    @Override // com.beizi.fusion.sm.a.d
    public void a(com.beizi.fusion.sm.a.c cVar) {
        if (cVar == null) {
            return;
        }
        cVar.a(new com.beizi.fusion.sm.a.e(RtspHeaders.Names.UNSUPPORTED));
    }

    @Override // com.beizi.fusion.sm.a.d
    public boolean a() {
        return false;
    }
}
