package com.xinzhu.overmind.client.hook.common;

import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.frameworks.g;
import java.lang.reflect.Method;
/* compiled from: ReplaceUIDMethodHookStub.java */
/* loaded from: classes.dex */
public class e extends com.xinzhu.overmind.client.hook.e {

    /* renamed from: d  reason: collision with root package name */
    public static int f67583d = -1;

    /* renamed from: e  reason: collision with root package name */
    public static int f67584e = -3;

    /* renamed from: a  reason: collision with root package name */
    String f67585a = getClass().getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    String f67586b;

    /* renamed from: c  reason: collision with root package name */
    int f67587c;

    public e(String str, int i4) {
        this.f67586b = str;
        this.f67587c = i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.e
    public String c() {
        return this.f67586b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.e
    public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
        int intValue;
        if (objArr == null) {
            return method.invoke(obj, objArr);
        }
        int length = objArr.length;
        int i4 = this.f67587c;
        if (i4 < length) {
            if (i4 != f67583d) {
                if (i4 < 0) {
                    if (i4 != f67584e) {
                        throw new RuntimeException(this.f67586b + " mReplaceUIDIndex unexpected " + this.f67587c);
                    }
                    i4 = length - 1;
                }
                if (i4 >= 0 && (objArr[i4] instanceof Integer) && ((intValue = ((Integer) objArr[i4]).intValue()) == com.xinzhu.overmind.client.e.getBaseVUid() || intValue == com.xinzhu.overmind.client.e.getVUid() || g.d().m(intValue) != null)) {
                    objArr[i4] = Integer.valueOf(Overmind.getHostUid());
                }
            }
            return method.invoke(obj, objArr);
        }
        throw new RuntimeException(this.f67586b + " mReplaceUIDIndex out of range");
    }
}
