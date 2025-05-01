package com.xinzhu.overmind.client.hook.proxies.libcore;

import com.xinzhu.overmind.Overmind;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: OsStub.java */
/* loaded from: classes.dex */
public class a extends com.xinzhu.overmind.client.hook.b {

    /* renamed from: c  reason: collision with root package name */
    public static final String f67684c = "OsStub";

    /* renamed from: b  reason: collision with root package name */
    private Object f67685b = com.xinzhu.haunted.libcore.io.a.b();

    /* compiled from: OsStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.libcore.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0734a extends com.xinzhu.overmind.client.hook.e {
        C0734a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "chown";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                a.d(objArr, 1);
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e5) {
                if (e5.getCause() == null) {
                    return null;
                }
                throw e5.getCause();
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: OsStub.java */
    /* loaded from: classes.dex */
    static class b extends com.xinzhu.overmind.client.hook.e {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "fchown";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                a.d(objArr, 1);
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e5) {
                if (e5.getCause() == null) {
                    return null;
                }
                throw e5.getCause();
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: OsStub.java */
    /* loaded from: classes.dex */
    static class c extends com.xinzhu.overmind.client.hook.e {
        c() {
        }

        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "fstat";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                Object invoke = method.invoke(obj, objArr);
                Field declaredField = invoke.getClass().getDeclaredField("st_uid");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(invoke)).intValue() == Overmind.getHostUid()) {
                    declaredField.set(invoke, Integer.valueOf(com.xinzhu.overmind.client.e.getVUid()));
                }
                return invoke;
            } catch (InvocationTargetException e5) {
                if (e5.getCause() == null) {
                    return null;
                }
                throw e5.getCause();
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: OsStub.java */
    /* loaded from: classes.dex */
    static class d extends com.xinzhu.overmind.client.hook.e {
        d() {
        }

        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getpwnam";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                Object invoke = method.invoke(obj, objArr);
                Field declaredField = invoke.getClass().getDeclaredField("pw_uid");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(invoke)).intValue() == Overmind.getHostUid()) {
                    declaredField.set(invoke, Integer.valueOf(com.xinzhu.overmind.client.e.getVUid()));
                }
                return invoke;
            } catch (InvocationTargetException e5) {
                if (e5.getCause() == null) {
                    return null;
                }
                throw e5.getCause();
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: OsStub.java */
    /* loaded from: classes.dex */
    static class e extends com.xinzhu.overmind.client.hook.e {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getpwuid";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                a.d(objArr, 0);
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e5) {
                if (e5.getCause() == null) {
                    return null;
                }
                throw e5.getCause();
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: OsStub.java */
    /* loaded from: classes.dex */
    static class f extends com.xinzhu.overmind.client.hook.e {
        f() {
        }

        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getsockoptUcred";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                Object invoke = method.invoke(obj, objArr);
                Field declaredField = invoke.getClass().getDeclaredField("uid");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(invoke)).intValue() == Overmind.getHostUid()) {
                    declaredField.set(invoke, Integer.valueOf(com.xinzhu.overmind.client.e.getVUid()));
                }
                return invoke;
            } catch (InvocationTargetException e5) {
                if (e5.getCause() == null) {
                    return null;
                }
                throw e5.getCause();
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: OsStub.java */
    /* loaded from: classes.dex */
    static class g extends com.xinzhu.overmind.client.hook.e {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getuid";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                int intValue = ((Integer) method.invoke(obj, objArr)).intValue();
                if (com.xinzhu.overmind.client.e.getClientConfig() == null) {
                    return Integer.valueOf(intValue);
                }
                return Integer.valueOf(com.xinzhu.overmind.client.e.getVUid());
            } catch (InvocationTargetException e5) {
                if (e5.getCause() == null) {
                    return null;
                }
                throw e5.getCause();
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: OsStub.java */
    /* loaded from: classes.dex */
    static class h extends com.xinzhu.overmind.client.hook.e {
        h() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "lchown";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                a.d(objArr, 1);
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e5) {
                if (e5.getCause() == null) {
                    return null;
                }
                throw e5.getCause();
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: OsStub.java */
    /* loaded from: classes.dex */
    static class i extends com.xinzhu.overmind.client.hook.e {
        i() {
        }

        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "lstat";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                Object invoke = method.invoke(obj, objArr);
                Field declaredField = invoke.getClass().getDeclaredField("st_uid");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(invoke)).intValue() == Overmind.getHostUid()) {
                    declaredField.set(invoke, Integer.valueOf(com.xinzhu.overmind.client.e.getVUid()));
                }
                return invoke;
            } catch (InvocationTargetException e5) {
                if (e5.getCause() == null) {
                    return null;
                }
                throw e5.getCause();
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: OsStub.java */
    /* loaded from: classes.dex */
    static class j extends com.xinzhu.overmind.client.hook.e {
        j() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "setuid";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                a.d(objArr, 0);
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e5) {
                if (e5.getCause() == null) {
                    return null;
                }
                throw e5.getCause();
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: OsStub.java */
    /* loaded from: classes.dex */
    static class k extends com.xinzhu.overmind.client.hook.e {
        k() {
        }

        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "stat";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                Object invoke = method.invoke(obj, objArr);
                Field declaredField = invoke.getClass().getDeclaredField("st_uid");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(invoke)).intValue() == Overmind.getHostUid()) {
                    declaredField.set(invoke, Integer.valueOf(com.xinzhu.overmind.client.e.getVUid()));
                }
                return invoke;
            } catch (InvocationTargetException e5) {
                if (e5.getCause() == null) {
                    return null;
                }
                throw e5.getCause();
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object[] objArr, int i4) {
        if (objArr != null && (objArr[i4] instanceof Integer)) {
            if (((Integer) objArr[i4]).intValue() == com.xinzhu.overmind.client.e.getVUid() || ((Integer) objArr[i4]).intValue() == com.xinzhu.overmind.client.e.getBaseVUid()) {
                objArr[i4] = Integer.valueOf(Overmind.getHostUid());
            }
        }
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return com.xinzhu.haunted.libcore.io.a.b() != getProxyInvocation();
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return this.f67685b;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        com.xinzhu.haunted.libcore.io.a.c(obj2);
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void onBindMethod() {
        addMethodHook(new k());
        addMethodHook(new c());
        addMethodHook(new i());
        addMethodHook(new d());
        addMethodHook(new f());
        addMethodHook(new g());
        addMethodHook(new C0734a());
        addMethodHook(new b());
        addMethodHook(new h());
        addMethodHook(new e());
        addMethodHook(new j());
    }
}
