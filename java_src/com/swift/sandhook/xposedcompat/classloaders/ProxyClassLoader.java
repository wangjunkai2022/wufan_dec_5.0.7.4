package com.swift.sandhook.xposedcompat.classloaders;
/* loaded from: classes.dex */
public class ProxyClassLoader extends ClassLoader {
    private final ClassLoader mClassLoader;

    public ProxyClassLoader(ClassLoader classLoader, ClassLoader classLoader2) {
        super(classLoader);
        this.mClassLoader = classLoader2;
    }

    @Override // java.lang.ClassLoader
    protected Class<?> loadClass(String str, boolean z4) throws ClassNotFoundException {
        Class<?> cls;
        try {
            cls = this.mClassLoader.loadClass(str);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null && (cls = super.loadClass(str, z4)) == null) {
            throw new ClassNotFoundException();
        }
        return cls;
    }
}
