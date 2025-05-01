package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
/* loaded from: classes3.dex */
public final class MemberKey {
    static final Class<?>[] NO_CLASSES = new Class[0];
    final Class<?>[] _argTypes;
    final String _name;

    public MemberKey(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public int argCount() {
        return this._argTypes.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == MemberKey.class) {
            MemberKey memberKey = (MemberKey) obj;
            if (this._name.equals(memberKey._name)) {
                Class<?>[] clsArr = memberKey._argTypes;
                int length = this._argTypes.length;
                if (clsArr.length != length) {
                    return false;
                }
                for (int i4 = 0; i4 < length; i4++) {
                    if (clsArr[i4] != this._argTypes[i4]) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public String getName() {
        return this._name;
    }

    public int hashCode() {
        return this._name.hashCode() + this._argTypes.length;
    }

    public String toString() {
        return this._name + "(" + this._argTypes.length + "-args)";
    }

    public MemberKey(Constructor<?> constructor) {
        this("", constructor.getParameterTypes());
    }

    public MemberKey(String str, Class<?>[] clsArr) {
        this._name = str;
        this._argTypes = clsArr == null ? NO_CLASSES : clsArr;
    }
}
