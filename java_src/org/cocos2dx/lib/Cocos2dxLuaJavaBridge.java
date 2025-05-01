package org.cocos2dx.lib;
/* loaded from: classes7.dex */
public class Cocos2dxLuaJavaBridge {
    public static native int callLuaFunctionWithString(int i4, String str);

    public static native int callLuaGlobalFunctionWithString(String str, String str2);

    public static native int releaseLuaFunction(int i4);

    public static native int retainLuaFunction(int i4);
}
