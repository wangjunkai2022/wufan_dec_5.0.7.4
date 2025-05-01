package com.mob.tools.network;

import android.os.Build;
import com.mob.commons.s;
import com.mob.tools.utils.ReflectHelper;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Deprecated
/* loaded from: classes5.dex */
public class HttpConnectionImpl implements HttpConnection {

    /* renamed from: a  reason: collision with root package name */
    private Object f56800a;

    static {
        ReflectHelper.importClassNoThrow("org.apache.http.HttpResponse", null);
        ReflectHelper.importClassNoThrow("org.apache.http.Header", null);
    }

    public HttpConnectionImpl(Object obj) {
        this.f56800a = obj;
    }

    @Override // com.mob.tools.network.HttpConnection
    public InputStream getErrorStream() throws IOException {
        return getInputStream();
    }

    @Override // com.mob.tools.network.HttpConnection
    public Map<String, List<String>> getHeaderFields() throws IOException {
        try {
            HashMap hashMap = new HashMap();
            Object invokeInstanceMethod = ReflectHelper.invokeInstanceMethod(this.f56800a, "getAllHeaders", new Object[0]);
            if (invokeInstanceMethod != null) {
                int intValue = ((Integer) ReflectHelper.getInstanceField(invokeInstanceMethod, s.a("006gfeYej%ih"))).intValue();
                Object[] objArr = new Object[intValue];
                System.arraycopy(invokeInstanceMethod, 0, objArr, 0, intValue);
                for (int i4 = 0; i4 < intValue; i4++) {
                    Object obj = objArr[i4];
                    String str = (String) ReflectHelper.invokeInstanceMethod(obj, s.a("007Tej5fi%egQdKdf(f"), new Object[0]);
                    String str2 = (String) ReflectHelper.invokeInstanceMethod(obj, "getValue", new Object[0]);
                    if (str2 == null) {
                        str2 = "";
                    }
                    hashMap.put(str, Arrays.asList(str2.split(",")));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT < 9) {
                throw new IOException(th.getMessage());
            }
            throw new IOException(th);
        }
    }

    @Override // com.mob.tools.network.HttpConnection
    public InputStream getInputStream() throws IOException {
        try {
            return (InputStream) ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeInstanceMethod(this.f56800a, "getEntity", new Object[0]), "getContent", new Object[0]);
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT < 9) {
                throw new IOException(th.getMessage());
            }
            throw new IOException(th);
        }
    }

    @Override // com.mob.tools.network.HttpConnection
    public int getResponseCode() throws IOException {
        try {
            return ((Integer) ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeInstanceMethod(this.f56800a, "getStatusLine", new Object[0]), "getStatusCode", new Object[0])).intValue();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT < 9) {
                throw new IOException(th.getMessage());
            }
            throw new IOException(th);
        }
    }
}
