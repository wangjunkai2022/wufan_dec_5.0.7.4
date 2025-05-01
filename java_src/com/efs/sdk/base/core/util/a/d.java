package com.efs.sdk.base.core.util.a;

import androidx.annotation.NonNull;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpEnv;
import com.efs.sdk.base.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public b f10431a;

    /* renamed from: b  reason: collision with root package name */
    private List<com.efs.sdk.base.core.util.concurrent.b<HttpResponse>> f10432b;

    public d(@NonNull String str) {
        b bVar = new b();
        this.f10431a = bVar;
        bVar.f10423a = str;
    }

    public final d a(@NonNull Map<String, String> map) {
        this.f10431a.f10424b = map;
        return this;
    }

    public final d a(String str, String str2) {
        b bVar = this.f10431a;
        if (bVar.f10428f == null) {
            bVar.f10428f = new HashMap(5);
        }
        this.f10431a.f10428f.put(str, str2);
        return this;
    }

    public final d a(@NonNull AbsHttpListener absHttpListener) {
        if (this.f10432b == null) {
            this.f10432b = new ArrayList(5);
        }
        this.f10432b.add(absHttpListener);
        return this;
    }

    public final c a() {
        c cVar = new c(this.f10431a);
        List<com.efs.sdk.base.core.util.concurrent.b<HttpResponse>> list = this.f10432b;
        if (list != null && list.size() > 0) {
            cVar.a(this.f10432b);
        }
        List<com.efs.sdk.base.core.util.concurrent.b<HttpResponse>> httpListenerList = HttpEnv.getInstance().getHttpListenerList();
        if (httpListenerList != null && httpListenerList.size() > 0) {
            cVar.a(httpListenerList);
        }
        return cVar;
    }
}
