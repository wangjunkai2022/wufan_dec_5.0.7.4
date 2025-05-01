package com.kwad.library.b.c;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.sdk.utils.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes5.dex */
public class a {
    private static final String CLAZZ_NAME = "com.kwad.library.b.c.a";
    private static final ThreadLocal<C0503a> sAutoUnWrapModelTL = new ThreadLocal<>();
    private static final List<String> sAutoUnWrapStackList = new ArrayList();
    private static final Map<String, WeakReference<Context>> sResContextCache = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.library.b.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0503a {
        private int ajA;
        private StackTraceElement[] ajB;
        private int ajC;
        private long ajD;
        private WeakReference<Context> ajz;

        private C0503a() {
            this.ajz = new WeakReference<>(null);
            this.ajA = 0;
            this.ajB = null;
            this.ajC = 0;
        }

        static /* synthetic */ int c(C0503a c0503a) {
            int i4 = c0503a.ajA;
            c0503a.ajA = i4 + 1;
            return i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clear() {
            this.ajz = new WeakReference<>(null);
            this.ajA = 0;
            this.ajB = null;
            this.ajC = 0;
            this.ajD = 0L;
        }

        static /* synthetic */ int g(C0503a c0503a) {
            int i4 = c0503a.ajC;
            c0503a.ajC = i4 + 1;
            return i4;
        }

        /* synthetic */ C0503a(byte b5) {
            this();
        }
    }

    @Nullable
    private static Context a(String str, Context context) {
        Map<String, WeakReference<Context>> map = sResContextCache;
        WeakReference<Context> weakReference = map.get(str + System.identityHashCode(context));
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private static Context aB(Context context) {
        return ((b) context).getDelegatedContext();
    }

    private static boolean aC(Context context) {
        return context instanceof b;
    }

    private static boolean b(String str, Context context) {
        ThreadLocal<C0503a> threadLocal = sAutoUnWrapModelTL;
        C0503a c0503a = threadLocal.get();
        if (c0503a != null) {
            if (c0503a.ajz.get() != context || Math.abs(System.currentTimeMillis() - c0503a.ajD) >= 150) {
                c0503a.clear();
                c0503a.ajz = new WeakReference(context);
                c0503a.ajD = System.currentTimeMillis();
            } else {
                C0503a.c(c0503a);
                if (c0503a.ajA >= (context instanceof Application ? 15 : 5) && a(str, context, c0503a)) {
                    c0503a.clear();
                    return true;
                }
            }
        } else {
            threadLocal.set(new C0503a((byte) 0));
        }
        return false;
    }

    private static com.kwad.library.b.a bG(String str) {
        return com.kwad.library.solder.a.a.j(null, str);
    }

    private static List<String> getAutoUnWrapStackList() {
        List<String> list = sAutoUnWrapStackList;
        if (list.isEmpty()) {
            list.add("com.sensorsdata.analytics.android.sdk");
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getThemeResId(Context context) {
        if (context instanceof ContextThemeWrapper) {
            Object callMethod = s.callMethod(context, "getThemeResId", new Object[0]);
            if (callMethod != null) {
                return ((Integer) callMethod).intValue();
            }
            return 0;
        } else if (context instanceof androidx.appcompat.view.ContextThemeWrapper) {
            return ((androidx.appcompat.view.ContextThemeWrapper) context).getThemeResId();
        } else {
            return 0;
        }
    }

    @NonNull
    public static Context i(Context context, String str) {
        Context eVar;
        if (context == null) {
            return null;
        }
        com.kwad.library.b.a bG = bG(str);
        if (bG == null || !bG.isLoaded() || (context instanceof b) || b(str, context)) {
            return context;
        }
        Context a5 = a(str, context);
        if (a5 != null) {
            return a5;
        }
        if (context instanceof ContextThemeWrapper) {
            eVar = new c((ContextThemeWrapper) context, str);
        } else if (context instanceof androidx.appcompat.view.ContextThemeWrapper) {
            eVar = new d((androidx.appcompat.view.ContextThemeWrapper) context, str);
        } else if (context instanceof ContextWrapper) {
            eVar = new e(context, str);
        } else {
            eVar = new e(context, str);
        }
        a(str, context, eVar);
        return eVar;
    }

    public static Context unwrapContextIfNeed(Context context) {
        if (aC(context)) {
            context = aB(context);
        }
        if (aC(context)) {
            for (int i4 = 0; i4 < 10; i4++) {
                context = aB(context);
                if (!aC(context)) {
                    return context;
                }
            }
            return context;
        }
        return context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object wrapSystemService(Object obj, String str, Context context) {
        if ("layout_inflater".equals(str) && (obj instanceof LayoutInflater)) {
            LayoutInflater layoutInflater = (LayoutInflater) obj;
            return layoutInflater.getContext() instanceof b ? layoutInflater : layoutInflater.cloneInContext(context);
        }
        return obj;
    }

    private static void a(String str, Context context, Context context2) {
        Map<String, WeakReference<Context>> map = sResContextCache;
        map.put(str + System.identityHashCode(context), new WeakReference<>(context2));
    }

    private static boolean a(String str, Context context, C0503a c0503a) {
        Context a5 = a(str, context);
        String name = a5 != null ? a5.getClass().getName() : "";
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (!Arrays.equals(stackTrace, c0503a.ajB)) {
            if (c0503a.ajB != null) {
                c0503a.clear();
                return false;
            }
            c0503a.ajB = stackTrace;
            int i4 = 0;
            int i5 = 0;
            while (i4 < stackTrace.length) {
                StackTraceElement stackTraceElement = stackTrace[i4];
                String className = stackTraceElement.getClassName();
                for (String str2 : getAutoUnWrapStackList()) {
                    if (className.contains(str2)) {
                        return true;
                    }
                }
                String methodName = stackTraceElement.getMethodName();
                i4++;
                if (i4 < stackTrace.length && CLAZZ_NAME.equals(className) && "wrapContextIfNeed".equals(methodName)) {
                    StackTraceElement stackTraceElement2 = stackTrace[i4];
                    if (TextUtils.equals(name, stackTraceElement2.getClassName()) && "getBaseContext".equals(stackTraceElement2.getMethodName()) && (i5 = i5 + 1) >= 5) {
                        return true;
                    }
                }
            }
            return false;
        }
        C0503a.g(c0503a);
        c0503a.ajB = stackTrace;
        return c0503a.ajC >= 5;
    }

    public static LayoutInflater a(LayoutInflater layoutInflater, String str) {
        com.kwad.library.b.a bG = bG(str);
        if (bG == null || !bG.isLoaded()) {
            return layoutInflater;
        }
        Context context = layoutInflater.getContext();
        if (context instanceof b) {
            return layoutInflater;
        }
        Context i4 = i(context, str);
        return i4 instanceof b ? layoutInflater.cloneInContext(i4) : layoutInflater;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Resources a(Resources resources, String str) {
        com.kwad.library.b.a bG = bG(str);
        if (bG != null && bG.isLoaded()) {
            Resources resources2 = bG.getResources();
            Objects.toString(resources2);
            return resources2 != null ? resources2 : resources;
        }
        Objects.toString(bG);
        return resources;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Resources.Theme a(Resources.Theme theme, Resources.Theme theme2, int i4, String str) {
        Resources resources;
        com.kwad.library.b.a bG = bG(str);
        if (bG == null || !bG.isLoaded() || (resources = bG.getResources()) == null) {
            return theme;
        }
        if (theme2 == null) {
            Resources.Theme newTheme = resources.newTheme();
            newTheme.applyStyle(i4, true);
            return newTheme;
        }
        return theme2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ClassLoader a(ClassLoader classLoader, String str) {
        com.kwad.library.b.a.b xy;
        com.kwad.library.b.a bG = bG(str);
        return (bG == null || !bG.isLoaded() || (xy = bG.xy()) == null) ? classLoader : xy;
    }
}
