package com.xinzhu.overmind.client.hook.proxies.context;

import android.content.pm.ProviderInfo;
import android.database.IContentObserver;
import android.net.Uri;
import android.os.Build;
import com.xinzhu.haunted.android.content.j;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.frameworks.g;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.e;
import com.xinzhu.overmind.server.user.MindUserHandle;
import java.lang.reflect.Method;
/* compiled from: ContentServiceStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {

    /* compiled from: ContentServiceStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.context.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0732a extends e {
        C0732a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "notifyChange";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int i4;
            int i5;
            if (Build.VERSION.SDK_INT >= 24 && objArr.length >= 6) {
                objArr[5] = 22;
            }
            boolean z4 = true;
            IContentObserver iContentObserver = (IContentObserver) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (objArr[3] instanceof Integer) {
                if ((((Integer) objArr[3]).intValue() & 1) == 0) {
                    z4 = false;
                }
            } else {
                z4 = ((Boolean) objArr[3]).booleanValue();
            }
            if (com.xinzhu.overmind.utils.e.g()) {
                Uri[] uriArr = (Uri[]) objArr[0];
                int length = uriArr.length;
                int i6 = 0;
                while (i6 < length) {
                    Uri uri = uriArr[i6];
                    if (a.d(uri)) {
                        i4 = i6;
                        i5 = length;
                        com.xinzhu.overmind.client.frameworks.b.a().c(uri, iContentObserver, booleanValue, z4, MindUserHandle.r(), com.xinzhu.overmind.client.e.getVUid());
                    } else {
                        i4 = i6;
                        i5 = length;
                        objArr[4] = Integer.valueOf(Overmind.getHostUserId());
                        com.xinzhu.overmind.utils.helpers.c.e(objArr);
                        method.invoke(obj, objArr);
                    }
                    i6 = i4 + 1;
                    length = i5;
                }
                return 0;
            }
            Uri uri2 = (Uri) objArr[0];
            if (a.d(uri2)) {
                com.xinzhu.overmind.client.frameworks.b.a().c(uri2, iContentObserver, booleanValue, z4, MindUserHandle.r(), com.xinzhu.overmind.client.e.getVUid());
                return 0;
            }
            objArr[4] = Integer.valueOf(Overmind.getHostUserId());
            com.xinzhu.overmind.utils.helpers.c.e(objArr);
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: ContentServiceStub.java */
    /* loaded from: classes.dex */
    public static class b extends e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "registerContentObserver";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 24 && objArr.length >= 5) {
                objArr[4] = 22;
            }
            Uri uri = (Uri) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            IContentObserver iContentObserver = (IContentObserver) objArr[2];
            if (a.d(uri)) {
                com.xinzhu.overmind.client.frameworks.b.a().d(uri, booleanValue, iContentObserver, MindUserHandle.r(), com.xinzhu.overmind.client.e.getVUid());
                return 0;
            }
            objArr[3] = Integer.valueOf(Overmind.getHostUserId());
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: ContentServiceStub.java */
    /* loaded from: classes.dex */
    public static class c extends e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "unregisterContentObserver";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.client.frameworks.b.a().e((IContentObserver) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    public a() {
        super(s.i("content"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(Uri uri) {
        ProviderInfo A = g.d().A(uri.getAuthority(), 0, MindUserHandle.r());
        return A != null && A.enabled;
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return j.a.a(s.i("content"));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService("content");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new b());
        addMethodHook(new c());
        addMethodHook(new C0732a());
    }
}
