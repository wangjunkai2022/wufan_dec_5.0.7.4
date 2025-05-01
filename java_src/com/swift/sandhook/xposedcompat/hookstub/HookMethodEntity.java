package com.swift.sandhook.xposedcompat.hookstub;

import com.swift.sandhook.SandHook;
import com.swift.sandhook.utils.ParamWrapper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* loaded from: classes.dex */
public class HookMethodEntity {
    public Method backup;
    public Method hook;
    public boolean isStatic;
    public Member origin;
    public Class[] parType;
    public Class retType;

    public HookMethodEntity(Member member, Method method, Method method2) {
        this.origin = member;
        this.hook = method;
        this.backup = method2;
        this.isStatic = Modifier.isStatic(member.getModifiers());
    }

    public Object getArg(int i4, long j4) {
        return ParamWrapper.addressToObject(this.parType[i4], j4);
    }

    public Object[] getArgs(long... jArr) {
        if (jArr == null || jArr.length == 0) {
            return new Object[0];
        }
        Class[] clsArr = this.parType;
        if (clsArr == null || clsArr.length == 0) {
            return new Object[0];
        }
        int i4 = !this.isStatic ? 1 : 0;
        Object[] objArr = new Object[clsArr.length];
        for (int i5 = i4; i5 < this.parType.length + i4; i5++) {
            int i6 = i5 - i4;
            objArr[i6] = getArg(i6, jArr[i5]);
        }
        return objArr;
    }

    public long[] getArgsAddress(long[] jArr, Object... objArr) {
        long[] jArr2;
        int i4 = 0;
        if (jArr == null || jArr.length == 0) {
            return new long[0];
        }
        int i5 = 1;
        if (!this.isStatic) {
            jArr2 = new long[jArr.length + 1];
            jArr2[0] = jArr[0];
        } else {
            jArr2 = new long[jArr.length];
            i5 = 0;
        }
        while (true) {
            Class[] clsArr = this.parType;
            if (i4 >= clsArr.length) {
                return jArr2;
            }
            jArr2[i4 + i5] = ParamWrapper.objectToAddress(clsArr[i4], objArr[i4]);
            i4++;
        }
    }

    public Object getResult(long j4) {
        if (isVoid()) {
            return null;
        }
        return ParamWrapper.addressToObject(this.retType, j4);
    }

    public long getResultAddress(Object obj) {
        if (isVoid()) {
            return 0L;
        }
        return ParamWrapper.objectToAddress(this.retType, obj);
    }

    public Object getThis(long j4) {
        if (this.isStatic) {
            return null;
        }
        return SandHook.getObject(j4);
    }

    public boolean isConstructor() {
        return this.origin instanceof Constructor;
    }

    public boolean isVoid() {
        Class cls = this.retType;
        return cls == null || Void.TYPE.equals(cls);
    }
}
