package external.org.apache.commons.lang3;

import external.org.apache.commons.lang3.exception.CloneFailedException;
import external.org.apache.commons.lang3.mutable.MutableInt;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
/* loaded from: classes.dex */
public class ObjectUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final Null f68832a = new Null();

    /* loaded from: classes6.dex */
    public static class Null implements Serializable {
        private static final long serialVersionUID = 7092611880189329093L;

        Null() {
        }

        private Object readResolve() {
            return ObjectUtils.f68832a;
        }
    }

    public static <T> T a(T t4) {
        if (!(t4 instanceof Cloneable)) {
            return null;
        }
        if (t4.getClass().isArray()) {
            Class<?> componentType = t4.getClass().getComponentType();
            if (!componentType.isPrimitive()) {
                return (T) ((Object[]) t4).clone();
            }
            int length = Array.getLength(t4);
            T t5 = (T) Array.newInstance(componentType, length);
            while (true) {
                int i4 = length - 1;
                if (length <= 0) {
                    return t5;
                }
                Array.set(t5, i4, Array.get(t4, i4));
                length = i4;
            }
        } else {
            try {
                return (T) t4.getClass().getMethod("clone", new Class[0]).invoke(t4, new Object[0]);
            } catch (IllegalAccessException e5) {
                throw new CloneFailedException("Cannot clone Cloneable type " + t4.getClass().getName(), e5);
            } catch (NoSuchMethodException e6) {
                throw new CloneFailedException("Cloneable type " + t4.getClass().getName() + " has no clone method", e6);
            } catch (InvocationTargetException e7) {
                throw new CloneFailedException("Exception cloning Cloneable type " + t4.getClass().getName(), e7.getCause());
            }
        }
    }

    public static <T> T b(T t4) {
        T t5 = (T) a(t4);
        return t5 == null ? t4 : t5;
    }

    public static <T extends Comparable<? super T>> int c(T t4, T t5) {
        return d(t4, t5, false);
    }

    public static <T extends Comparable<? super T>> int d(T t4, T t5, boolean z4) {
        if (t4 == t5) {
            return 0;
        }
        if (t4 == null) {
            return z4 ? 1 : -1;
        } else if (t5 == null) {
            return z4 ? -1 : 1;
        } else {
            return t4.compareTo(t5);
        }
    }

    public static <T> T e(T t4, T t5) {
        return t4 != null ? t4 : t5;
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static <T> T g(T... tArr) {
        if (tArr != null) {
            for (T t4 : tArr) {
                if (t4 != null) {
                    return t4;
                }
            }
            return null;
        }
        return null;
    }

    public static int h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static int i(Object... objArr) {
        int i4 = 1;
        if (objArr != null) {
            for (Object obj : objArr) {
                i4 = (i4 * 31) + h(obj);
            }
        }
        return i4;
    }

    public static String j(Object obj) {
        if (obj == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        k(stringBuffer, obj);
        return stringBuffer.toString();
    }

    public static void k(StringBuffer stringBuffer, Object obj) {
        Objects.requireNonNull(obj, "Cannot get the toString of a null identity");
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append('@');
        stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static <T extends Comparable<? super T>> T l(T... tArr) {
        T t4 = null;
        if (tArr != null) {
            for (T t5 : tArr) {
                if (d(t5, t4, false) > 0) {
                    t4 = t5;
                }
            }
        }
        return t4;
    }

    public static <T extends Comparable<? super T>> T m(T... tArr) {
        g.A(tArr);
        g.q(tArr);
        TreeSet treeSet = new TreeSet();
        Collections.addAll(treeSet, tArr);
        return (T) treeSet.toArray()[(treeSet.size() - 1) / 2];
    }

    public static <T> T n(Comparator<T> comparator, T... tArr) {
        g.B(tArr, "null/empty items", new Object[0]);
        g.q(tArr);
        g.D(comparator, "null comparator", new Object[0]);
        TreeSet treeSet = new TreeSet(comparator);
        Collections.addAll(treeSet, tArr);
        return (T) treeSet.toArray()[(treeSet.size() - 1) / 2];
    }

    public static <T extends Comparable<? super T>> T o(T... tArr) {
        T t4 = null;
        if (tArr != null) {
            for (T t5 : tArr) {
                if (d(t5, t4, true) < 0) {
                    t4 = t5;
                }
            }
        }
        return t4;
    }

    public static <T> T p(T... tArr) {
        if (a.J0(tArr)) {
            HashMap hashMap = new HashMap(tArr.length);
            int i4 = 0;
            for (T t4 : tArr) {
                MutableInt mutableInt = (MutableInt) hashMap.get(t4);
                if (mutableInt == null) {
                    hashMap.put(t4, new MutableInt(1));
                } else {
                    mutableInt.E();
                }
            }
            while (true) {
                T t5 = null;
                for (Map.Entry entry : hashMap.entrySet()) {
                    int intValue = ((MutableInt) entry.getValue()).intValue();
                    if (intValue == i4) {
                        break;
                    } else if (intValue > i4) {
                        t5 = (T) entry.getKey();
                        i4 = intValue;
                    }
                }
                return t5;
            }
        }
        return null;
    }

    public static boolean q(Object obj, Object obj2) {
        return !f(obj, obj2);
    }

    public static String r(Object obj) {
        return obj == null ? "" : obj.toString();
    }

    public static String s(Object obj, String str) {
        return obj == null ? str : obj.toString();
    }
}
