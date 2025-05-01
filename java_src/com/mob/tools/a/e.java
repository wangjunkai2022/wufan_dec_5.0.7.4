package com.mob.tools.a;

import com.mob.commons.m;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes5.dex */
class e implements a {
    @Override // com.mob.tools.a.a
    public <T> T a(Class cls, Object obj, String str, Class[] clsArr, Object[] objArr) throws Throwable {
        Method method = (Method) Class.class.getDeclaredMethod(m.a("017EchJdgRdjKdaeb'bhJdDbafa8dgf:biba"), String.class, Class[].class).invoke(cls, str, clsArr);
        method.setAccessible(true);
        return (T) method.invoke(obj, objArr);
    }

    @Override // com.mob.tools.a.a
    public <T> T a(String str, Object obj, String str2, Class[] clsArr, Object[] objArr) throws Throwable {
        return (T) a((Class) Class.class.getDeclaredMethod(m.a("007(cdbibhceZbTbdJd"), String.class).invoke(null, str), obj, str2, clsArr, objArr);
    }

    @Override // com.mob.tools.a.a
    public <T> T a(String str) throws Throwable {
        return (T) Class.class.getDeclaredMethod(m.a("011cdKdeccAc;dgGgbcad"), new Class[0]).invoke((Class) Class.class.getDeclaredMethod(m.a("007LcdbibhceXb+bd8d"), String.class).invoke(null, str), new Object[0]);
    }

    @Override // com.mob.tools.a.a
    public <T> T a(String str, String str2, Object obj) throws Throwable {
        Field field = (Field) Class.class.getDeclaredMethod(m.a("016Zch3dg8dj=daeb_bh8dEbaeabg+de*ba"), String.class).invoke((Class) Class.class.getDeclaredMethod(m.a("007Ecdbibhce'b?bdHd"), String.class).invoke(null, str), str2);
        field.setAccessible(true);
        return (T) field.get(obj);
    }

    @Override // com.mob.tools.a.a
    public <T> T a(String str, Class[] clsArr, Object[] objArr) throws Throwable {
        if (clsArr != null && clsArr.length != 0 && objArr != null && objArr.length != 0) {
            Constructor constructor = (Constructor) Class.class.getDeclaredMethod(m.a("022>chIdg$djHdaebDbhXd(bacbbi.c]dgRgEbhbe+ag@bibh"), Class[].class).invoke((Class) Class.class.getDeclaredMethod(m.a("007;cdbibhceYbJbd>d"), String.class).invoke(null, str), clsArr);
            constructor.setAccessible(true);
            return (T) constructor.newInstance(objArr);
        }
        return (T) a(str);
    }
}
