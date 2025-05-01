package com.swift.sandhook.xposedcompat.methodgen;

import com.swift.sandhook.SandHook;
import com.swift.sandhook.xposedcompat.XposedCompat;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class ErrorCatch {
    public static Object callOriginError(Member member, Method method, Object obj, Object[] objArr) throws Throwable {
        if (XposedCompat.retryWhenCallOriginError) {
            StringBuilder sb = new StringBuilder();
            sb.append("method <");
            sb.append(member.toString());
            sb.append("> use invoke to call origin!");
            return SandHook.callOriginMethod(member, method, obj, objArr);
        }
        return null;
    }
}
