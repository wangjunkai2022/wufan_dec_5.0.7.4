package com.xinzhu.overmind.client.hook.proxies.view;

import com.xinzhu.haunted.android.os.s;
import com.xinzhu.haunted.android.view.b;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.e;
import com.xinzhu.overmind.utils.helpers.c;
import java.lang.reflect.Method;
/* compiled from: GraphicsStatsStub.java */
/* loaded from: classes.dex */
public class b extends BinderInvocationStub {

    /* compiled from: GraphicsStatsStub.java */
    /* loaded from: classes.dex */
    static class a extends e {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "requestBufferForProcess";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            c.d(objArr);
            return method.invoke(obj, objArr);
        }
    }

    public b() {
        super(s.i("graphicsstats"));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return b.a.a(s.i("graphicsstats"));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService("graphicsstats");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new a());
    }
}
