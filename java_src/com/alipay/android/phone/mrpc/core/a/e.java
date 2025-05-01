package com.alipay.android.phone.mrpc.core.a;

import java.util.ArrayList;
import java.util.Objects;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
/* loaded from: classes2.dex */
public final class e extends b {

    /* renamed from: c  reason: collision with root package name */
    private int f4530c;

    /* renamed from: d  reason: collision with root package name */
    private Object f4531d;

    public e(int i4, String str, Object obj) {
        super(str, obj);
        this.f4530c = i4;
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public final void a(Object obj) {
        this.f4531d = obj;
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public final byte[] a() {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f4531d != null) {
                arrayList.add(new BasicNameValuePair("extParam", com.alipay.a.a.f.a(this.f4531d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.f4528a));
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4530c);
            arrayList.add(new BasicNameValuePair("id", sb.toString()));
            Objects.toString(this.f4529b);
            Object obj = this.f4529b;
            arrayList.add(new BasicNameValuePair("requestData", obj == null ? "[]" : com.alipay.a.a.f.a(obj)));
            return URLEncodedUtils.format(arrayList, "utf-8").getBytes();
        } catch (Exception e5) {
            StringBuilder sb2 = new StringBuilder("request  =");
            sb2.append(this.f4529b);
            sb2.append(":");
            sb2.append(e5);
            throw new com.alipay.android.phone.mrpc.core.c(9, sb2.toString() == null ? "" : e5.getMessage(), e5);
        }
    }
}
