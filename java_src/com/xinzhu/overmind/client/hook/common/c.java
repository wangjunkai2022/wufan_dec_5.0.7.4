package com.xinzhu.overmind.client.hook.common;

import java.lang.reflect.Method;
/* compiled from: FixedResultMethodHookStub.java */
/* loaded from: classes.dex */
public class c extends com.xinzhu.overmind.client.hook.e {

    /* renamed from: a  reason: collision with root package name */
    Object f67574a;

    /* renamed from: b  reason: collision with root package name */
    String f67575b;

    public c(String str, Object obj) {
        this.f67574a = obj;
        this.f67575b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.e
    public String c() {
        return this.f67575b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.e
    public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
        return this.f67574a;
    }
}
