package com.android.dx.rop.type;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes.dex */
public final class Prototype implements Comparable<Prototype> {
    private static final ConcurrentMap<String, Prototype> internTable = new ConcurrentHashMap(10000, 0.75f);
    private final String descriptor;
    private StdTypeList parameterFrameTypes;
    private final StdTypeList parameterTypes;
    private final Type returnType;

    private Prototype(String str, Type type, StdTypeList stdTypeList) {
        Objects.requireNonNull(str, "descriptor == null");
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(stdTypeList, "parameterTypes == null");
        this.descriptor = str;
        this.returnType = type;
        this.parameterTypes = stdTypeList;
        this.parameterFrameTypes = null;
    }

    public static void clearInternTable() {
        internTable.clear();
    }

    public static Prototype fromDescriptor(String str) {
        int i4;
        Prototype prototype = internTable.get(str);
        if (prototype != null) {
            return prototype;
        }
        Type[] makeParameterArray = makeParameterArray(str);
        int i5 = 1;
        int i6 = 0;
        while (true) {
            char charAt = str.charAt(i5);
            if (charAt == ')') {
                Type internReturnType = Type.internReturnType(str.substring(i5 + 1));
                StdTypeList stdTypeList = new StdTypeList(i6);
                for (int i7 = 0; i7 < i6; i7++) {
                    stdTypeList.set(i7, makeParameterArray[i7]);
                }
                return new Prototype(str, internReturnType, stdTypeList);
            }
            int i8 = i5;
            while (charAt == '[') {
                i8++;
                charAt = str.charAt(i8);
            }
            if (charAt == 'L') {
                int indexOf = str.indexOf(59, i8);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("bad descriptor");
                }
                i4 = indexOf + 1;
            } else {
                i4 = i8 + 1;
            }
            makeParameterArray[i6] = Type.intern(str.substring(i5, i4));
            i6++;
            i5 = i4;
        }
    }

    public static Prototype intern(String str) {
        Objects.requireNonNull(str, "descriptor == null");
        Prototype prototype = internTable.get(str);
        return prototype != null ? prototype : putIntern(fromDescriptor(str));
    }

    public static Prototype internInts(Type type, int i4) {
        StringBuilder sb = new StringBuilder(100);
        sb.append('(');
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append('I');
        }
        sb.append(')');
        sb.append(type.getDescriptor());
        return intern(sb.toString());
    }

    private static Type[] makeParameterArray(String str) {
        int length = str.length();
        int i4 = 0;
        if (str.charAt(0) == '(') {
            int i5 = 1;
            int i6 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                char charAt = str.charAt(i5);
                if (charAt == ')') {
                    i4 = i5;
                    break;
                }
                if (charAt >= 'A' && charAt <= 'Z') {
                    i6++;
                }
                i5++;
            }
            if (i4 != 0 && i4 != length - 1) {
                if (str.indexOf(41, i4 + 1) == -1) {
                    return new Type[i6];
                }
                throw new IllegalArgumentException("bad descriptor");
            }
            throw new IllegalArgumentException("bad descriptor");
        }
        throw new IllegalArgumentException("bad descriptor");
    }

    private static Prototype putIntern(Prototype prototype) {
        Prototype putIfAbsent = internTable.putIfAbsent(prototype.getDescriptor(), prototype);
        return putIfAbsent != null ? putIfAbsent : prototype;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Prototype) {
            return this.descriptor.equals(((Prototype) obj).descriptor);
        }
        return false;
    }

    public String getDescriptor() {
        return this.descriptor;
    }

    public StdTypeList getParameterFrameTypes() {
        if (this.parameterFrameTypes == null) {
            int size = this.parameterTypes.size();
            StdTypeList stdTypeList = new StdTypeList(size);
            boolean z4 = false;
            for (int i4 = 0; i4 < size; i4++) {
                Type type = this.parameterTypes.get(i4);
                if (type.isIntlike()) {
                    type = Type.INT;
                    z4 = true;
                }
                stdTypeList.set(i4, type);
            }
            if (!z4) {
                stdTypeList = this.parameterTypes;
            }
            this.parameterFrameTypes = stdTypeList;
        }
        return this.parameterFrameTypes;
    }

    public StdTypeList getParameterTypes() {
        return this.parameterTypes;
    }

    public Type getReturnType() {
        return this.returnType;
    }

    public int hashCode() {
        return this.descriptor.hashCode();
    }

    public String toString() {
        return this.descriptor;
    }

    public Prototype withFirstParameter(Type type) {
        String str = "(" + type.getDescriptor() + this.descriptor.substring(1);
        StdTypeList withFirst = this.parameterTypes.withFirst(type);
        withFirst.setImmutable();
        return putIntern(new Prototype(str, this.returnType, withFirst));
    }

    @Override // java.lang.Comparable
    public int compareTo(Prototype prototype) {
        if (this == prototype) {
            return 0;
        }
        int compareTo = this.returnType.compareTo(prototype.returnType);
        if (compareTo != 0) {
            return compareTo;
        }
        int size = this.parameterTypes.size();
        int size2 = prototype.parameterTypes.size();
        int min = Math.min(size, size2);
        for (int i4 = 0; i4 < min; i4++) {
            int compareTo2 = this.parameterTypes.get(i4).compareTo(prototype.parameterTypes.get(i4));
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }

    public static Prototype intern(String str, Type type, boolean z4, boolean z5) {
        Prototype intern = intern(str);
        if (z4) {
            return intern;
        }
        if (z5) {
            type = type.asUninitialized(Integer.MAX_VALUE);
        }
        return intern.withFirstParameter(type);
    }
}
