package com.xinzhu.overmind.client.hook.proxies.os.storage;

import android.content.res.ObbInfo;
import android.os.IInterface;
import android.os.Process;
import android.os.storage.StorageManager;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.haunted.android.os.storage.a;
import com.xinzhu.haunted.android.os.storage.b;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.IOManager;
import java.io.File;
import java.lang.reflect.Method;
/* compiled from: StorageManagerStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {

    /* compiled from: StorageManagerStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.os.storage.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0737a extends com.xinzhu.overmind.client.hook.e {
        C0737a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "fixupAppDir";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            if (objArr != null && objArr.length == 1) {
                String str = (String) objArr[0];
                objArr[0] = Overmind.getContext().getExternalCacheDir().getAbsolutePath();
                return method.invoke(obj, objArr);
            }
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: StorageManagerStub.java */
    /* loaded from: classes.dex */
    static class b extends com.xinzhu.overmind.client.hook.e {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getMountedObbPath";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            String str = (String) objArr[0];
            if (str != null) {
                objArr[0] = IOManager.get().redirectPath(str);
            }
            String str2 = (String) method.invoke(obj, objArr);
            com.xinzhu.overmind.b.a("testobb", "getMountedObbPath: " + objArr[0] + " result: " + str2);
            return str2;
        }
    }

    /* compiled from: StorageManagerStub.java */
    /* loaded from: classes6.dex */
    static class c extends com.xinzhu.overmind.client.hook.e {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getVolumeList";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            if (objArr == null) {
                return Overmind.getMindStorageManager().d(Process.myUid(), null, 0, com.xinzhu.overmind.client.e.getUserId());
            }
            int intValue = ((Integer) objArr[2]).intValue();
            return Overmind.getMindStorageManager().d(((Integer) objArr[0]).intValue(), (String) objArr[1], intValue, com.xinzhu.overmind.client.e.getUserId());
        }
    }

    /* compiled from: StorageManagerStub.java */
    /* loaded from: classes.dex */
    static class d extends com.xinzhu.overmind.client.hook.e {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "isObbMounted";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            String str = (String) objArr[0];
            if (str != null) {
                objArr[0] = IOManager.get().redirectPath(str);
            }
            boolean booleanValue = ((Boolean) method.invoke(obj, objArr)).booleanValue();
            com.xinzhu.overmind.b.a("testobb", "isObbMounted: " + objArr[0] + " result: " + booleanValue);
            return Boolean.valueOf(booleanValue);
        }
    }

    /* compiled from: StorageManagerStub.java */
    /* loaded from: classes.dex */
    static class e extends com.xinzhu.overmind.client.hook.e {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "mkdirs";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            File file = new File((String) objArr[objArr.length == 1 ? (char) 0 : (char) 1]);
            if (file.exists()) {
                return 0;
            }
            return Integer.valueOf(file.mkdirs() ? 0 : -1);
        }
    }

    /* compiled from: StorageManagerStub.java */
    /* loaded from: classes.dex */
    static class f extends com.xinzhu.overmind.client.hook.e {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "mountObb";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            String str = (String) objArr[0];
            if (str != null) {
                objArr[0] = IOManager.get().redirectPath(str);
            }
            String str2 = (String) objArr[1];
            if (str2 != null) {
                objArr[1] = IOManager.get().redirectPath(str2);
            }
            int a5 = com.xinzhu.overmind.utils.helpers.c.a(objArr, ObbInfo.class);
            if (a5 >= 0) {
                ObbInfo obbInfo = (ObbInfo) objArr[a5];
                obbInfo.packageName = Overmind.getHostPkg();
                obbInfo.filename = IOManager.get().redirectPath(obbInfo.filename);
            }
            com.xinzhu.overmind.b.a("testobb", "mountObb here " + objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: StorageManagerStub.java */
    /* loaded from: classes.dex */
    static class g extends com.xinzhu.overmind.client.hook.e {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "unmountObb";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            String str = (String) objArr[0];
            if (str != null) {
                objArr[0] = IOManager.get().redirectPath(str);
            }
            com.xinzhu.overmind.b.a("testobb", "unmountObb: " + str);
            return method.invoke(obj, objArr);
        }
    }

    public a() {
        super(s.i("mount"));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return s.i("mount") != this;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        if (com.xinzhu.overmind.utils.e.w()) {
            return b.a.a(s.i("mount"));
        }
        return a.C0702a.a(s.i("mount"));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService("mount");
        try {
            com.xinzhu.haunted.android.os.storage.c cVar = new com.xinzhu.haunted.android.os.storage.c((StorageManager) Overmind.getContext().getSystemService("storage"));
            if (cVar.a()) {
                cVar.k((IInterface) obj2);
            }
            if (com.xinzhu.haunted.android.os.storage.c.b()) {
                com.xinzhu.haunted.android.os.storage.c.l((IInterface) obj2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.client.hook.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        com.xinzhu.overmind.utils.helpers.c.c(objArr);
        return super.invoke(obj, method, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        if (com.xinzhu.overmind.utils.e.j()) {
            addMethodHook(new com.xinzhu.overmind.client.hook.common.d("getVolumeList", 1, 0));
        } else {
            addMethodHook(new com.xinzhu.overmind.client.hook.common.e("getVolumeList", 0));
        }
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("createUserKey", com.xinzhu.overmind.client.hook.common.d.f67576e, 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("destroyUserKey", com.xinzhu.overmind.client.hook.common.d.f67576e, 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("unlockUserKey", com.xinzhu.overmind.client.hook.common.d.f67576e, 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("lockUserKey", com.xinzhu.overmind.client.hook.common.d.f67576e, 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("isUserKeyUnlocked", com.xinzhu.overmind.client.hook.common.d.f67576e, 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("prepareUserStorage", com.xinzhu.overmind.client.hook.common.d.f67576e, 1));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("destroyUserStorage", com.xinzhu.overmind.client.hook.common.d.f67576e, 1));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("addUserKeyAuth", com.xinzhu.overmind.client.hook.common.d.f67576e, 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("fixateNewestUserKeyAuth", com.xinzhu.overmind.client.hook.common.d.f67576e, 0));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.d("clearUserKeyAuth", com.xinzhu.overmind.client.hook.common.d.f67576e, 0));
        addMethodHook(new f());
        addMethodHook(new d());
        addMethodHook(new b());
        addMethodHook(new g());
        addMethodHook(new e());
        addMethodHook(new C0737a());
    }
}
