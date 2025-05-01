package com.kwad.sdk.pngencrypt;
/* loaded from: classes5.dex */
public enum ErrorBehaviour {
    STRICT(0),
    LENIENT1_CRC(1),
    LENIENT2_ANCILLARY(3),
    SUPER_LENIENT(5);
    

    /* renamed from: c  reason: collision with root package name */
    final int f55906c;

    ErrorBehaviour(int i4) {
        this.f55906c = i4;
    }
}
