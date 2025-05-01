package com.efs.sdk.base.core.util.a;

import androidx.annotation.Nullable;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpEnv;
import com.efs.sdk.base.http.HttpResponse;
import java.io.File;
import java.util.Map;
/* loaded from: classes2.dex */
public final class b implements com.efs.sdk.base.core.util.concurrent.c<HttpResponse> {

    /* renamed from: a  reason: collision with root package name */
    String f10423a;

    /* renamed from: b  reason: collision with root package name */
    Map<String, String> f10424b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f10425c;

    /* renamed from: d  reason: collision with root package name */
    public File f10426d;

    /* renamed from: e  reason: collision with root package name */
    public String f10427e;

    /* renamed from: f  reason: collision with root package name */
    public Map<String, String> f10428f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10429g = false;

    @Override // com.efs.sdk.base.core.util.concurrent.c
    @Nullable
    public final /* synthetic */ HttpResponse a() {
        String str = this.f10427e;
        str.hashCode();
        if (str.equals("get")) {
            return HttpEnv.getInstance().getHttpUtil().get(this.f10423a, this.f10424b);
        }
        if (!str.equals("post")) {
            Log.e("efs.util.http", "request not support method '" + this.f10427e + "'");
            return null;
        }
        byte[] bArr = this.f10425c;
        if (bArr != null && bArr.length > 0) {
            if (this.f10429g) {
                return HttpEnv.getInstance().getHttpUtil().postAsFile(this.f10423a, this.f10424b, this.f10425c);
            }
            return HttpEnv.getInstance().getHttpUtil().post(this.f10423a, this.f10424b, this.f10425c);
        }
        return HttpEnv.getInstance().getHttpUtil().post(this.f10423a, this.f10424b, this.f10426d);
    }
}
