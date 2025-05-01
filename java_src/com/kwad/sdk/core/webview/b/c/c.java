package com.kwad.sdk.core.webview.b.c;

import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.multipart.HttpPostBodyUtil;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public final class c {
    private static final List<String> aFP;

    static {
        ArrayList arrayList = new ArrayList();
        aFP = arrayList;
        arrayList.add("application/x-javascript");
        arrayList.add("image/jpeg");
        arrayList.add("image/tiff");
        arrayList.add("text/css");
        arrayList.add("text/html");
        arrayList.add("image/gif");
        arrayList.add("image/png");
        arrayList.add("application/javascript");
        arrayList.add("video/mp4");
        arrayList.add("audio/mpeg");
        arrayList.add(HttpHeaders.Values.APPLICATION_JSON);
        arrayList.add("image/webp");
        arrayList.add("image/apng");
        arrayList.add("image/svg+xml");
        arrayList.add(HttpPostBodyUtil.DEFAULT_BINARY_CONTENT_TYPE);
    }

    public static boolean fh(String str) {
        return aFP.contains(str);
    }
}
