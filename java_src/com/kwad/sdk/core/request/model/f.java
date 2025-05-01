package com.kwad.sdk.core.request.model;

import com.ksad.json.annotation.KsJson;
@KsJson
/* loaded from: classes5.dex */
public class f extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
    public long aBc;
    public int adStyle;
    public int count;
    public int taskType;

    public f() {
    }

    public final void ay(long j4) {
        this.aBc = j4;
    }

    public f(int i4, int i5, int i6, long j4) {
        this.adStyle = i4;
        this.taskType = i5;
        this.count = 1;
        this.aBc = j4;
    }
}
