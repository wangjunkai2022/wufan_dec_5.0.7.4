package com.qq.e.comm.adevent;

import com.qq.e.comm.util.GDTLogger;
/* loaded from: classes5.dex */
public class ADEvent {

    /* renamed from: a  reason: collision with root package name */
    private final int f59812a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f59813b;

    public ADEvent(int i4, Object... objArr) {
        this.f59812a = i4;
        this.f59813b = objArr;
        if (i4 < 100) {
            a("EventId 错误" + i4);
        }
    }

    private void a(String str) {
        GDTLogger.e(str);
    }

    public <T> T getParam(int i4, Class<T> cls) {
        Object[] objArr;
        if (cls == null || (objArr = this.f59813b) == null || objArr.length <= i4) {
            return null;
        }
        T t4 = (T) objArr[i4];
        if (t4 == null) {
            GDTLogger.e("ADEvent 参数为空,type:" + this.f59812a);
            return null;
        } else if (cls.isInstance(objArr[i4])) {
            return t4;
        } else {
            GDTLogger.e("ADEvent" + this.f59812a + " 参数类型错误,期望类型" + cls.getName() + "实际类型 " + t4.getClass().getName());
            return null;
        }
    }

    public <T> T getParam(Class<T> cls) {
        return (T) getParam(0, cls);
    }

    public int getType() {
        return this.f59812a;
    }
}
