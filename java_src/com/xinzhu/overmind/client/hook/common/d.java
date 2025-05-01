package com.xinzhu.overmind.client.hook.common;

import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.server.user.MindUserHandle;
import java.lang.reflect.Method;
/* compiled from: ReplacePkgUserIdMethodHookStub.java */
/* loaded from: classes.dex */
public class d extends com.xinzhu.overmind.client.hook.e {

    /* renamed from: e  reason: collision with root package name */
    public static int f67576e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static int f67577f = -2;

    /* renamed from: g  reason: collision with root package name */
    public static int f67578g = -3;

    /* renamed from: a  reason: collision with root package name */
    String f67579a = getClass().getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    String f67580b;

    /* renamed from: c  reason: collision with root package name */
    int f67581c;

    /* renamed from: d  reason: collision with root package name */
    int f67582d;

    public d(String str, int i4, int i5) {
        this.f67580b = str;
        this.f67581c = i4;
        this.f67582d = i5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.e
    public String c() {
        return this.f67580b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.e
    public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
        int i4;
        if (objArr == null) {
            return method.invoke(obj, objArr);
        }
        int length = objArr.length;
        if (this.f67582d < length && (i4 = this.f67581c) < length) {
            if (i4 != f67576e) {
                if (i4 < 0) {
                    if (i4 == f67578g) {
                        i4 = length - 1;
                    } else if (i4 != f67577f) {
                        throw new RuntimeException(this.f67580b + " mReplacePkgIndex unexpected " + this.f67581c);
                    } else {
                        i4 = 0;
                        while (true) {
                            if (i4 >= objArr.length) {
                                i4 = -1;
                                break;
                            }
                            if (objArr[i4] instanceof String) {
                                if (Overmind.getMindPackageManager().t((String) objArr[i4], com.xinzhu.overmind.client.e.getUserId())) {
                                    break;
                                }
                            }
                            i4++;
                        }
                    }
                }
                if (i4 >= 0) {
                    if (objArr[i4] instanceof String) {
                        objArr[i4] = Overmind.getHostPkg();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f67580b);
                        sb.append(" mReplacePkgIndex unexpected type ");
                        sb.append(objArr[i4].getClass());
                    }
                }
            }
            int i5 = this.f67582d;
            if (i5 != f67576e) {
                if (i5 < 0) {
                    if (i5 != f67578g) {
                        throw new RuntimeException(this.f67580b + " mReplaceUserIdIndex unexpected " + this.f67582d);
                    }
                    i5 = length - 1;
                }
                if (i5 >= 0) {
                    if (objArr[i5] instanceof Integer) {
                        objArr[i5] = Integer.valueOf(MindUserHandle.k(Overmind.getHostUid()));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f67580b);
                        sb2.append(" mReplaceUserIdIndex unexpected type ");
                        sb2.append(objArr[i5].getClass());
                    }
                }
            }
            return method.invoke(obj, objArr);
        }
        throw new RuntimeException(this.f67580b + " mReplaceUserIdIndex or mReplacePkgIndex out of range");
    }
}
