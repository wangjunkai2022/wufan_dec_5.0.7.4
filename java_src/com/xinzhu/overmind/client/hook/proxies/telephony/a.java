package com.xinzhu.overmind.client.hook.proxies.telephony;

import com.xinzhu.overmind.server.os.MindDeviceInfo;
import java.lang.reflect.Method;
/* compiled from: CommonStub.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f67722a = "CommonStub";

    /* compiled from: CommonStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.telephony.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0741a extends com.xinzhu.overmind.client.hook.e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getDeviceId";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            MindDeviceInfo b5 = com.xinzhu.overmind.client.frameworks.c.a().b(com.xinzhu.overmind.client.e.getUserId());
            if (b5 != null && b5.f68007b) {
                return b5.f68009d;
            }
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    public static class b extends C0741a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.proxies.telephony.a.C0741a, com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getDeviceIdWithFeature";
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    public static class c extends C0741a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.proxies.telephony.a.C0741a, com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getImeiForSlot";
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    public static class d extends C0741a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.proxies.telephony.a.C0741a, com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getMeidForSlot";
        }
    }
}
