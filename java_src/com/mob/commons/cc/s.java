package com.mob.commons.cc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
/* loaded from: classes5.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private u f56276a;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, Object> f56278c;

    /* renamed from: e  reason: collision with root package name */
    private s f56280e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f56281f;

    /* renamed from: b  reason: collision with root package name */
    private LinkedList<Object> f56277b = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, Class<?>> f56279d = new HashMap<>();

    public s(HashMap<String, Object> hashMap, u uVar) {
        this.f56276a = uVar;
        this.f56278c = new HashMap<>(hashMap);
    }

    public void a(Object obj) {
        this.f56277b.push(obj);
    }

    public void b(String str, Object obj) {
        if (this.f56278c.containsKey(str)) {
            this.f56278c.put(str, obj);
            return;
        }
        s sVar = this.f56280e;
        if (sVar != null) {
            sVar.b(str, obj);
            return;
        }
        throw new RuntimeException(m.a.f71493g + str + "\" has not defined");
    }

    public s c() {
        return this.f56280e;
    }

    public int d() {
        return this.f56277b.size();
    }

    public void e() {
        this.f56281f = true;
    }

    public boolean f() {
        return this.f56281f;
    }

    public u g() {
        return this.f56276a;
    }

    public Object a() {
        return this.f56277b.pop();
    }

    public void a(String str, Object obj) {
        if (!this.f56278c.containsKey(str)) {
            this.f56278c.put(str, obj);
            return;
        }
        throw new RuntimeException(m.a.f71493g + str + "\" has defined");
    }

    public Object a(String str) {
        for (s sVar = this; sVar != null; sVar = sVar.f56280e) {
            if (sVar.f56278c.containsKey(str)) {
                return sVar.f56278c.get(str);
            }
        }
        throw new RuntimeException("Can not find \"" + str + m.a.f71493g);
    }

    public Class<?> b(String str) {
        for (s sVar = this; sVar != null; sVar = sVar.f56280e) {
            if (sVar.f56279d.containsKey(str)) {
                return sVar.f56279d.get(str);
            }
        }
        throw new RuntimeException("Can not find class " + str);
    }

    public void a(String str, Class<?> cls) {
        this.f56279d.put(str, cls);
    }

    public s b() {
        s sVar = new s(new HashMap(), this.f56276a);
        sVar.f56280e = this;
        return sVar;
    }

    public Object a(final Object obj, final boolean z4, Class<?>... clsArr) {
        return Proxy.newProxyInstance(getClass().getClassLoader(), clsArr, new InvocationHandler() { // from class: com.mob.commons.cc.s.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) throws Throwable {
                Throwable th;
                z zVar;
                LinkedList<Object> b5;
                try {
                    Object obj3 = obj;
                    if (obj3 == null) {
                        zVar = null;
                    } else if (obj3 instanceof z) {
                        zVar = (z) obj3;
                    } else {
                        zVar = (z) ((Map) obj3).get(method.getName());
                    }
                    if (zVar != null) {
                        if (objArr == null) {
                            objArr = new Object[0];
                        }
                        if (z4) {
                            b5 = zVar.b(objArr);
                        } else {
                            try {
                                b5 = zVar.b(objArr);
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        if (b5.isEmpty()) {
                            return null;
                        }
                        return b5.get(0);
                    }
                } catch (Throwable unused2) {
                }
                th = null;
                if (th == null) {
                    return null;
                }
                throw th;
            }
        });
    }

    public void a(Method method, int i4) throws Throwable {
        Object[] objArr = new Object[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = a();
        }
        a(method, objArr);
    }

    public void a(Method method, Object[] objArr) throws Throwable {
        Object obj;
        if (Modifier.isStatic(method.getModifiers())) {
            obj = null;
        } else if (objArr.length > 0) {
            obj = objArr[0];
            int length = objArr.length - 1;
            Object[] objArr2 = new Object[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = i4 + 1;
                objArr2[i4] = objArr[i5];
                i4 = i5;
            }
            objArr = objArr2;
        } else {
            throw new RuntimeException("receiver not found");
        }
        method.setAccessible(true);
        for (int i6 = 0; i6 < objArr.length; i6++) {
            if (method.getParameterTypes()[i6].isInterface() && (objArr[i6] instanceof z)) {
                objArr[i6] = a(objArr[i6], true, method.getParameterTypes()[i6]);
            }
        }
        if (method.getReturnType() == Void.TYPE) {
            method.invoke(obj, objArr);
        } else {
            a(method.invoke(obj, objArr));
        }
    }
}
