package com.xinzhu.overmind.client.hook.proxies.app;

import android.app.job.JobInfo;
import com.xinzhu.haunted.android.app.job.a;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import java.lang.reflect.Method;
/* compiled from: JobServiceStub.java */
/* loaded from: classes.dex */
public class c extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    public static final String f67652b = "JobServiceStub";

    /* compiled from: JobServiceStub.java */
    /* loaded from: classes.dex */
    class a extends com.xinzhu.overmind.client.hook.e {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "schedule";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            objArr[0] = Overmind.getMindJobManager().f((JobInfo) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: JobServiceStub.java */
    /* loaded from: classes.dex */
    class b extends com.xinzhu.overmind.client.hook.e {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "enqueue";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            objArr[0] = Overmind.getMindJobManager().f((JobInfo) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: JobServiceStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.app.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0729c extends com.xinzhu.overmind.client.hook.e {
        C0729c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "cancel";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            objArr[0] = Integer.valueOf(Overmind.getMindJobManager().a(com.xinzhu.overmind.client.e.getClientConfig().f67763c, ((Integer) objArr[0]).intValue()));
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: JobServiceStub.java */
    /* loaded from: classes.dex */
    class d extends com.xinzhu.overmind.client.hook.e {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "cancelAll";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            Overmind.getMindJobManager().b(com.xinzhu.overmind.client.e.getClientConfig().f67763c);
            return method.invoke(obj, objArr);
        }
    }

    public c() {
        super(s.i("jobscheduler"));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return a.C0691a.a(s.i("jobscheduler"));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService("jobscheduler");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new a());
        addMethodHook(new b());
        addMethodHook(new C0729c());
        addMethodHook(new d());
    }
}
