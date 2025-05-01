package org.aspectj.internal.lang.reflect;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.StringTokenizer;
/* compiled from: StringToType.java */
/* loaded from: classes7.dex */
public class q {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StringToType.java */
    /* loaded from: classes7.dex */
    public static class a implements ParameterizedType {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Type[] f72179b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Class f72180c;

        a(Type[] typeArr, Class cls) {
            this.f72179b = typeArr;
            this.f72180c = cls;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return this.f72179b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f72180c.getEnclosingClass();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f72180c;
        }
    }

    public static Type[] a(String str, Class cls) throws ClassNotFoundException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        Type[] typeArr = new Type[stringTokenizer.countTokens()];
        int i4 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            typeArr[i4] = c(stringTokenizer.nextToken().trim(), cls);
            i4++;
        }
        return typeArr;
    }

    private static Type b(String str, Class cls) throws ClassNotFoundException {
        int indexOf = str.indexOf(60);
        return new a(a(str.substring(indexOf + 1, str.lastIndexOf(62)), cls), Class.forName(str.substring(0, indexOf), false, cls.getClassLoader()));
    }

    public static Type c(String str, Class cls) throws ClassNotFoundException {
        try {
            if (str.indexOf(SimpleComparison.LESS_THAN_OPERATION) == -1) {
                return org.aspectj.lang.reflect.d.a(Class.forName(str, false, cls.getClassLoader()));
            }
            return b(str, cls);
        } catch (ClassNotFoundException unused) {
            TypeVariable[] typeParameters = cls.getTypeParameters();
            for (int i4 = 0; i4 < typeParameters.length; i4++) {
                if (typeParameters[i4].getName().equals(str)) {
                    return typeParameters[i4];
                }
            }
            throw new ClassNotFoundException(str);
        }
    }
}
