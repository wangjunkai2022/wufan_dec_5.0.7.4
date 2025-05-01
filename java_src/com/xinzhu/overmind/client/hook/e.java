package com.xinzhu.overmind.client.hook;

import com.xinzhu.overmind.Overmind;
import java.lang.reflect.Method;
/* compiled from: MethodHook.java */
/* loaded from: classes.dex */
public abstract class e {
    /* JADX INFO: Access modifiers changed from: protected */
    public Object a(Object obj) throws Throwable {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object b(Object obj, Method method, Object[] objArr) throws Throwable {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String c();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object d(Object obj, Method method, Object[] objArr) throws Throwable;

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(Object[] objArr, int i4) {
        objArr[i4] = Integer.valueOf(Overmind.getHostUserId());
    }
}
