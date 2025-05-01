package com.xinzhu.overmind.client.hook.proxies.session;

import com.xinzhu.haunted.android.media.session.a;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.e;
import java.lang.reflect.Method;
/* compiled from: MediaSessionManagerStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {

    /* compiled from: MediaSessionManagerStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.session.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0740a extends e {
        C0740a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "createSession";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            if (objArr != null && objArr.length > 0 && (objArr[0] instanceof String)) {
                objArr[0] = Overmind.getHostPkg();
            }
            return method.invoke(obj, objArr);
        }
    }

    public a() {
        super(s.i("media_session"));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return a.C0699a.a(s.i("media_session"));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService("media_session");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new C0740a());
    }
}
