package org.apache.http.client.utils;

import java.lang.reflect.InvocationTargetException;
import org.apache.http.annotation.Immutable;
@Immutable
/* loaded from: classes7.dex */
public class CloneUtilsHC4 {
    private CloneUtilsHC4() {
    }

    public static Object clone(Object obj) throws CloneNotSupportedException {
        return cloneObject(obj);
    }

    public static <T> T cloneObject(T t4) throws CloneNotSupportedException {
        if (t4 == null) {
            return null;
        }
        if (t4 instanceof Cloneable) {
            try {
                try {
                    return (T) t4.getClass().getMethod("clone", null).invoke(t4, null);
                } catch (IllegalAccessException e5) {
                    throw new IllegalAccessError(e5.getMessage());
                } catch (InvocationTargetException e6) {
                    Throwable cause = e6.getCause();
                    if (cause instanceof CloneNotSupportedException) {
                        throw ((CloneNotSupportedException) cause);
                    }
                    throw new Error("Unexpected exception", cause);
                }
            } catch (NoSuchMethodException e7) {
                throw new NoSuchMethodError(e7.getMessage());
            }
        }
        throw new CloneNotSupportedException();
    }
}
