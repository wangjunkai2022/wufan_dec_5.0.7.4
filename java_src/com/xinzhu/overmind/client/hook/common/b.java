package com.xinzhu.overmind.client.hook.common;

import com.xinzhu.overmind.utils.helpers.f;
import java.lang.reflect.Method;
/* compiled from: DefaultNegativeResultMethodHookStub.java */
/* loaded from: classes.dex */
public class b extends com.xinzhu.overmind.client.hook.e {

    /* renamed from: a  reason: collision with root package name */
    String f67573a;

    public b(String str) {
        this.f67573a = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.e
    public String c() {
        return this.f67573a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.e
    public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
        return f.a(method.getReturnType());
    }
}
