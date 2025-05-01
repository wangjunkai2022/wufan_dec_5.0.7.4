package com.kwad.library.b.a;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.join.mgps.Util.h0;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes5.dex */
public final class b extends BaseDexClassLoader {
    private final List<String> aju;
    private final List<String> ajv;
    private final ClassLoader ajw;

    public b(ClassLoader classLoader, String str, @Nullable File file, String str2, List<String> list, List<String> list2) {
        super(str, file, str2, classLoader);
        this.ajw = classLoader;
        this.aju = list;
        this.ajv = list2;
        while (classLoader.getParent() != null) {
            classLoader = classLoader.getParent();
        }
        new StringBuilder("mParent is ").append(classLoader.getClass().getName());
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public final String findLibrary(String str) {
        String findLibrary = super.findLibrary(str);
        return (TextUtils.isEmpty(findLibrary) && (this.ajw instanceof BaseDexClassLoader)) ? ((BaseDexClassLoader) this.ajw).findLibrary(str) : findLibrary;
    }

    @Override // java.lang.ClassLoader
    protected final Class<?> loadClass(String str, boolean z4) {
        List<String> list = this.aju;
        if (list != null && list.contains(str)) {
            StringBuilder sb = new StringBuilder("loadClass ");
            sb.append(str);
            sb.append(" from host by interface");
            return super.loadClass(str, z4);
        }
        List<String> list2 = this.ajv;
        if (list2 != null) {
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (str.startsWith(it2.next() + h0.f27805a)) {
                    return super.loadClass(str, z4);
                }
            }
        }
        Class<?> findLoadedClass = findLoadedClass(str);
        if (findLoadedClass != null) {
            return findLoadedClass;
        }
        try {
            return findClass(str);
        } catch (ClassNotFoundException e5) {
            try {
                return getParent().loadClass(str);
            } catch (ClassNotFoundException e6) {
                if (Build.VERSION.SDK_INT >= 19) {
                    e6.addSuppressed(e5);
                }
                throw e6;
            }
        }
    }
}
