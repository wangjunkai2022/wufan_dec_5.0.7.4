package com.kwad.sdk.core.adlog.c;

import com.kwad.sdk.core.adlog.a;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.track.AdTrackLog;
import com.kwad.sdk.utils.ac;
/* loaded from: classes5.dex */
public final class b {
    private final a arx = new a();

    public final a Ca() {
        return this.arx;
    }

    public final b ao(long j4) {
        this.arx.vA = j4;
        return this;
    }

    public final b b(a.C0514a c0514a) {
        this.arx.Li = c0514a;
        return this;
    }

    public final b cK(int i4) {
        this.arx.kl = i4;
        return this;
    }

    public final b cL(int i4) {
        this.arx.aqQ = i4;
        return this;
    }

    public final b cM(int i4) {
        this.arx.aqR = i4;
        return this;
    }

    public final b cN(int i4) {
        this.arx.downloadSource = i4;
        return this;
    }

    public final b cO(int i4) {
        this.arx.are = i4;
        return this;
    }

    public final b cP(int i4) {
        this.arx.arh = i4;
        return this;
    }

    public final b cQ(int i4) {
        this.arx.ari = i4;
        return this;
    }

    public final b cR(int i4) {
        this.arx.aqW = i4;
        return this;
    }

    public final b cS(int i4) {
        this.arx.aro = i4;
        return this;
    }

    public final b cT(int i4) {
        this.arx.ars = i4;
        return this;
    }

    public final b cU(int i4) {
        this.arx.cD(i4);
        return this;
    }

    public final b cV(int i4) {
        this.arx.aru = i4;
        return this;
    }

    public final b cW(int i4) {
        this.arx.Lk = i4;
        return this;
    }

    public final b cX(int i4) {
        this.arx.arv = i4;
        return this;
    }

    public final b cY(int i4) {
        this.arx.Lj = i4;
        return this;
    }

    public final b dm(String str) {
        this.arx.Lh = str;
        return this;
    }

    public final b dn(String str) {
        this.arx.arf = str;
        return this;
    }

    /* renamed from: do  reason: not valid java name */
    public final b m18do(String str) {
        this.arx.arg = str;
        return this;
    }

    public final b dp(String str) {
        this.arx.arq = str;
        return this;
    }

    public final b f(ac.a aVar) {
        this.arx.kn = aVar;
        return this;
    }

    public final b l(double d5) {
        this.arx.ko = d5;
        return this;
    }

    public final b v(int i4, int i5) {
        a aVar = this.arx;
        aVar.aqS = i4 + "," + i5;
        return this;
    }

    public final b b(AdTemplate adTemplate, String str, String str2, com.kwad.sdk.f.a<AdTrackLog> aVar) {
        a aVar2 = this.arx;
        if (aVar2.Li == null) {
            aVar2.Li = new a.C0514a();
        }
        this.arx.Li.a(adTemplate, str, str2, aVar);
        return this;
    }
}
