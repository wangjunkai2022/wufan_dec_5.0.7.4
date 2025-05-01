package com.kwad.sdk.commercial.d;

import com.ksad.json.annotation.KsJson;
@KsJson
/* loaded from: classes5.dex */
public class b extends com.kwad.sdk.commercial.c.a {
    public int adNum;
    public String adSource;
    public boolean apA;
    public boolean apB;
    public String apC;
    public String apz;

    public static b Bu() {
        return new b();
    }

    public final b bk(boolean z4) {
        this.apA = z4;
        return this;
    }

    public final b cD(String str) {
        this.apz = str;
        return this;
    }

    public final b cE(String str) {
        this.apC = str;
        return this;
    }

    public final b cF(String str) {
        this.adSource = str;
        return this;
    }

    public final b ci(int i4) {
        this.adNum = i4;
        return this;
    }
}
