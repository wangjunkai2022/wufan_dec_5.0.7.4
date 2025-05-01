package org.aspectj.runtime.internal.cflowstack;

import java.util.Stack;
/* compiled from: ThreadStackFactoryImpl.java */
/* loaded from: classes7.dex */
public class f implements d {

    /* compiled from: ThreadStackFactoryImpl.java */
    /* loaded from: classes7.dex */
    private static class a extends ThreadLocal implements org.aspectj.runtime.internal.cflowstack.a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ThreadStackFactoryImpl.java */
        /* renamed from: org.aspectj.runtime.internal.cflowstack.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static class C0795a {

            /* renamed from: a  reason: collision with root package name */
            protected int f72230a = 0;

            C0795a() {
            }
        }

        private a() {
        }

        @Override // org.aspectj.runtime.internal.cflowstack.a
        public void a() {
            C0795a e5 = e();
            e5.f72230a--;
        }

        @Override // org.aspectj.runtime.internal.cflowstack.a
        public void b() {
            remove();
        }

        @Override // org.aspectj.runtime.internal.cflowstack.a
        public void c() {
            e().f72230a++;
        }

        @Override // org.aspectj.runtime.internal.cflowstack.a
        public boolean d() {
            return e().f72230a != 0;
        }

        public C0795a e() {
            return (C0795a) get();
        }

        @Override // java.lang.ThreadLocal
        public Object initialValue() {
            return new C0795a();
        }
    }

    /* compiled from: ThreadStackFactoryImpl.java */
    /* loaded from: classes7.dex */
    private static class b extends ThreadLocal implements c {
        private b() {
        }

        @Override // org.aspectj.runtime.internal.cflowstack.c
        public Stack a() {
            return (Stack) get();
        }

        @Override // org.aspectj.runtime.internal.cflowstack.c
        public void b() {
            remove();
        }

        @Override // java.lang.ThreadLocal
        public Object initialValue() {
            return new Stack();
        }
    }

    @Override // org.aspectj.runtime.internal.cflowstack.d
    public org.aspectj.runtime.internal.cflowstack.a a() {
        return new a();
    }

    @Override // org.aspectj.runtime.internal.cflowstack.d
    public c b() {
        return new b();
    }
}
