package com.kwad.components.core.webview.tachikoma.b;

import android.text.TextUtils;
import com.ksad.json.annotation.KsJson;
@KsJson
/* loaded from: classes5.dex */
public class x extends com.kwad.sdk.core.response.a.a {
    public String abi;
    public int errorCode;
    public String errorReason;
    public int nF;

    public final boolean isFailed() {
        return TextUtils.equals(com.alipay.sdk.util.f.f4952h, this.abi);
    }

    public final boolean tv() {
        return TextUtils.equals("start", this.abi);
    }

    public final boolean tw() {
        return TextUtils.equals("end", this.abi);
    }

    public final boolean tx() {
        return TextUtils.equals("progress", this.abi);
    }

    public final int ty() {
        try {
            return (int) Long.parseLong(this.errorReason);
        } catch (NumberFormatException e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
            return 0;
        }
    }
}
