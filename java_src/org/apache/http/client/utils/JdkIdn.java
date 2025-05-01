package org.apache.http.client.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.http.annotation.Immutable;
@Immutable
/* loaded from: classes7.dex */
public class JdkIdn implements Idn {
    private final Method toUnicode;

    public JdkIdn() throws ClassNotFoundException {
        try {
            this.toUnicode = Class.forName("java.net.IDN").getMethod("toUnicode", String.class);
        } catch (NoSuchMethodException e5) {
            throw new IllegalStateException(e5.getMessage(), e5);
        } catch (SecurityException e6) {
            throw new IllegalStateException(e6.getMessage(), e6);
        }
    }

    @Override // org.apache.http.client.utils.Idn
    public String toUnicode(String str) {
        try {
            return (String) this.toUnicode.invoke(null, str);
        } catch (IllegalAccessException e5) {
            throw new IllegalStateException(e5.getMessage(), e5);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            throw new RuntimeException(cause.getMessage(), cause);
        }
    }
}
