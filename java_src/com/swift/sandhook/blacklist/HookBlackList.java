package com.swift.sandhook.blacklist;

import com.join.mgps.Util.h0;
import com.swift.sandhook.SandHookConfig;
import java.lang.reflect.Member;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class HookBlackList {
    public static Set<String> methodBlackList = new HashSet();
    public static Set<Class> classBlackList = new HashSet();
    public static Set<String> methodUseInHookBridge = new HashSet();
    public static Set<String> methodUseInHookStub = new HashSet();

    static {
        methodBlackList.add("java.lang.reflect.Method.invoke");
        methodBlackList.add("java.lang.reflect.AccessibleObject.setAccessible");
        methodUseInHookBridge.add("java.lang.Class.getDeclaredField");
        methodUseInHookBridge.add("java.lang.reflect.InvocationTargetException.getCause");
        methodUseInHookStub.add("java.lang.Object.equals");
        methodUseInHookStub.add("java.lang.Class.isPrimitive");
    }

    public static final boolean canNotHook(Member member) {
        if (classBlackList.contains(member.getDeclaringClass())) {
            return true;
        }
        return methodBlackList.contains(member.getDeclaringClass().getName() + h0.f27805a + member.getName());
    }

    public static final boolean canNotHookByBridge(Member member) {
        return methodUseInHookBridge.contains(member.getDeclaringClass().getName() + h0.f27805a + member.getName());
    }

    public static final boolean canNotHookByStub(Member member) {
        if (SandHookConfig.SDK_INT < 29 || !Thread.class.equals(member.getDeclaringClass())) {
            return methodUseInHookStub.contains(member.getDeclaringClass().getName() + h0.f27805a + member.getName());
        }
        return true;
    }
}
