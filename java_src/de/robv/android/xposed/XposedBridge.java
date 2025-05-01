package de.robv.android.xposed;

import android.annotation.SuppressLint;
import android.util.Log;
import com.swift.sandhook.SandHook;
import com.swift.sandhook.xposedcompat.methodgen.DynamicBridge;
import com.swift.sandhook.xposedcompat.utils.DexLog;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_InitPackageResources;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class XposedBridge {
    static long BOOT_START_TIME = 0;
    private static final int RUNTIME_ART = 2;
    private static final int RUNTIME_DALVIK = 1;
    public static final String TAG = "SandXposed";
    @Deprecated
    public static int XPOSED_BRIDGE_VERSION;
    public static final ClassLoader BOOTCLASSLOADER = XposedBridge.class.getClassLoader();
    static boolean isZygote = true;
    private static int runtime = 2;
    public static boolean disableHooks = false;
    private static final Object[] EMPTY_ARRAY = new Object[0];
    public static final Map<Member, CopyOnWriteSortedSet<XC_MethodHook>> sHookedMethodCallbacks = new HashMap();
    public static final CopyOnWriteSortedSet<XC_LoadPackage> sLoadedPackageCallbacks = new CopyOnWriteSortedSet<>();
    static final CopyOnWriteSortedSet<XC_InitPackageResources> sInitPackageResourcesCallbacks = new CopyOnWriteSortedSet<>();

    /* loaded from: classes.dex */
    public static class AdditionalHookInfo {
        public final CopyOnWriteSortedSet<XC_MethodHook> callbacks;
        public final Class<?>[] parameterTypes;
        public final Class<?> returnType;

        private AdditionalHookInfo(CopyOnWriteSortedSet<XC_MethodHook> copyOnWriteSortedSet, Class<?>[] clsArr, Class<?> cls) {
            this.callbacks = copyOnWriteSortedSet;
            this.parameterTypes = clsArr;
            this.returnType = cls;
        }
    }

    /* loaded from: classes.dex */
    public static final class CopyOnWriteSortedSet<E> {
        private volatile transient Object[] elements = XposedBridge.EMPTY_ARRAY;

        private int indexOf(Object obj) {
            for (int i4 = 0; i4 < this.elements.length; i4++) {
                if (obj.equals(this.elements[i4])) {
                    return i4;
                }
            }
            return -1;
        }

        public synchronized boolean add(E e5) {
            if (indexOf(e5) >= 0) {
                return false;
            }
            Object[] objArr = new Object[this.elements.length + 1];
            System.arraycopy(this.elements, 0, objArr, 0, this.elements.length);
            objArr[this.elements.length] = e5;
            Arrays.sort(objArr);
            this.elements = objArr;
            return true;
        }

        public Object[] getSnapshot() {
            return this.elements;
        }

        public synchronized boolean remove(E e5) {
            int indexOf = indexOf(e5);
            if (indexOf == -1) {
                return false;
            }
            Object[] objArr = new Object[this.elements.length - 1];
            System.arraycopy(this.elements, 0, objArr, 0, indexOf);
            System.arraycopy(this.elements, indexOf + 1, objArr, indexOf, (this.elements.length - indexOf) - 1);
            this.elements = objArr;
            return true;
        }
    }

    private XposedBridge() {
    }

    @SuppressLint({"SetWorldReadable"})
    private static File ensureSuperDexFile(String str, Class<?> cls, Class<?> cls2) throws IOException {
        return null;
    }

    public static int getXposedVersion() {
        return 90;
    }

    public static Set<XC_MethodHook.Unhook> hookAllConstructors(Class<?> cls, XC_MethodHook xC_MethodHook) {
        HashSet hashSet = new HashSet();
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            hashSet.add(hookMethod(constructor, xC_MethodHook));
        }
        return hashSet;
    }

    public static Set<XC_MethodHook.Unhook> hookAllMethods(Class<?> cls, String str, XC_MethodHook xC_MethodHook) {
        Method[] declaredMethods;
        HashSet hashSet = new HashSet();
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                hashSet.add(hookMethod(method, xC_MethodHook));
            }
        }
        return hashSet;
    }

    public static void hookInitPackageResources(XC_InitPackageResources xC_InitPackageResources) {
    }

    public static void hookLoadPackage(XC_LoadPackage xC_LoadPackage) {
        CopyOnWriteSortedSet<XC_LoadPackage> copyOnWriteSortedSet = sLoadedPackageCallbacks;
        synchronized (copyOnWriteSortedSet) {
            copyOnWriteSortedSet.add(xC_LoadPackage);
        }
    }

    public static XC_MethodHook.Unhook hookMethod(Member member, XC_MethodHook xC_MethodHook) {
        CopyOnWriteSortedSet<XC_MethodHook> copyOnWriteSortedSet;
        int i4;
        boolean z4;
        Class<?>[] parameterTypes;
        Class<?> cls;
        if (!(member instanceof Method) && !(member instanceof Constructor)) {
            throw new IllegalArgumentException("Only methods and constructors can be hooked: " + member.toString());
        } else if (!member.getDeclaringClass().isInterface()) {
            if (Modifier.isAbstract(member.getModifiers())) {
                throw new IllegalArgumentException("Cannot hook abstract methods: " + member.toString());
            } else if (xC_MethodHook != null) {
                Map<Member, CopyOnWriteSortedSet<XC_MethodHook>> map = sHookedMethodCallbacks;
                synchronized (map) {
                    copyOnWriteSortedSet = map.get(member);
                    i4 = 0;
                    if (copyOnWriteSortedSet == null) {
                        copyOnWriteSortedSet = new CopyOnWriteSortedSet<>();
                        map.put(member, copyOnWriteSortedSet);
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                copyOnWriteSortedSet.add(xC_MethodHook);
                if (z4) {
                    Class<?> declaringClass = member.getDeclaringClass();
                    if (runtime == 2) {
                        cls = null;
                        parameterTypes = null;
                    } else if (member instanceof Method) {
                        i4 = XposedHelpers.getIntField(member, "slot");
                        Method method = (Method) member;
                        parameterTypes = method.getParameterTypes();
                        cls = method.getReturnType();
                    } else {
                        i4 = XposedHelpers.getIntField(member, "slot");
                        parameterTypes = ((Constructor) member).getParameterTypes();
                        cls = null;
                    }
                    hookMethodNative(member, declaringClass, i4, new AdditionalHookInfo(copyOnWriteSortedSet, parameterTypes, cls));
                }
                return new XC_MethodHook.Unhook(member);
            } else {
                throw new IllegalArgumentException("callback should not be null!");
            }
        } else {
            throw new IllegalArgumentException("Cannot hook interfaces: " + member.toString());
        }
    }

    private static synchronized void hookMethodNative(Member member, Class<?> cls, int i4, Object obj) {
        synchronized (XposedBridge.class) {
            DynamicBridge.hookMethod(member, (AdditionalHookInfo) obj);
        }
    }

    private static void initXResources() throws IOException {
    }

    public static Object invokeOriginalMethod(Member member, Object obj, Object[] objArr) throws NullPointerException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            return SandHook.callOriginMethod(member, obj, objArr);
        } catch (IllegalAccessException e5) {
            throw e5;
        } catch (IllegalArgumentException e6) {
            throw e6;
        } catch (NullPointerException e7) {
            throw e7;
        } catch (InvocationTargetException e8) {
            throw e8;
        } catch (Throwable th) {
            throw new InvocationTargetException(th);
        }
    }

    public static synchronized void log(String str) {
        synchronized (XposedBridge.class) {
            boolean z4 = DexLog.DEBUG;
        }
    }

    public static void main(String[] strArr) {
    }

    @Deprecated
    public static void unhookMethod(Member member, XC_MethodHook xC_MethodHook) {
        Map<Member, CopyOnWriteSortedSet<XC_MethodHook>> map = sHookedMethodCallbacks;
        synchronized (map) {
            CopyOnWriteSortedSet<XC_MethodHook> copyOnWriteSortedSet = map.get(member);
            if (copyOnWriteSortedSet == null) {
                return;
            }
            copyOnWriteSortedSet.remove(xC_MethodHook);
        }
    }

    public static synchronized void log(Throwable th) {
        synchronized (XposedBridge.class) {
            if (DexLog.DEBUG) {
                Log.getStackTraceString(th);
            }
        }
    }
}
