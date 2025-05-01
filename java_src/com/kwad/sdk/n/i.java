package com.kwad.sdk.n;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import com.kwad.sdk.service.ServiceProvider;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes5.dex */
public class i {
    private static final String CLAZZ_NAME = "com.kwad.sdk.n.i";
    private static final ThreadLocal<a> sAutoUnWrapModelTL = new ThreadLocal<>();
    private static final List<String> sAutoUnWrapStackList = new CopyOnWriteArrayList();
    private static final Map<Context, Context> sResContextCache = new WeakHashMap();
    private static final AtomicBoolean aUu = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a {
        private int ajA;
        private StackTraceElement[] ajB;
        private int ajC;
        private long ajD;
        private WeakReference<Context> ajz;

        private a() {
            this.ajz = new WeakReference<>(null);
            this.ajA = 0;
            this.ajB = null;
            this.ajC = 0;
        }

        static /* synthetic */ int c(a aVar) {
            int i4 = aVar.ajA;
            aVar.ajA = i4 + 1;
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

        static /* synthetic */ int g(a aVar) {
            int i4 = aVar.ajC;
            aVar.ajC = i4 + 1;
            return i4;
        }

        /* synthetic */ a(byte b5) {
            this();
        }
    }

    public static boolean OK() {
        return aUu.get();
    }

    private static void a(final Context context, Context context2) {
        sResContextCache.put(context, context2);
        if (context instanceof Activity) {
            com.kwad.sdk.core.c.b.En();
            com.kwad.sdk.core.c.b.a(new com.kwad.sdk.core.c.d() { // from class: com.kwad.sdk.n.i.1
                @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
                /* renamed from: onActivityDestroyed */
                public final void b(@NonNull Activity activity) {
                    if (activity == context) {
                        com.kwad.sdk.core.c.b.En();
                        com.kwad.sdk.core.c.b.b((com.kwad.sdk.core.c.c) this);
                        i.onDestroy(context);
                    }
                }
            });
        }
    }

    public static void cj(boolean z4) {
        aUu.set(z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context dy(Context context) {
        if (context instanceof com.kwad.sdk.n.a) {
            context = ((com.kwad.sdk.n.a) context).getDelegatedContext();
        }
        if (l.dG(context)) {
            return context;
        }
        RuntimeException runtimeException = null;
        for (int i4 = 0; i4 < 10; i4++) {
            if (runtimeException == null) {
                boolean yY = ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).yY();
                RuntimeException runtimeException2 = new RuntimeException("expect normalContext --context:" + context.getClass().getName() + "--initFinish:" + yY);
                ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).gatherException(runtimeException2);
                runtimeException = runtimeException2;
            }
            if (j.aC(context)) {
                context = j.aB(context);
            }
            if (context instanceof com.kwad.sdk.n.a) {
                context = ((com.kwad.sdk.n.a) context).getDelegatedContext();
            }
            if (l.dG(context)) {
                return context;
            }
        }
        return context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context dz(Context context) {
        if (context instanceof Application) {
            return context;
        }
        Context applicationContext = dy(context).getApplicationContext();
        if (applicationContext instanceof Application) {
            return applicationContext;
        }
        for (int i4 = 0; i4 < 10; i4++) {
            applicationContext = applicationContext.getApplicationContext();
            if (applicationContext instanceof Application) {
                return applicationContext;
            }
            if (applicationContext instanceof com.kwad.sdk.n.a) {
                applicationContext = ((com.kwad.sdk.n.a) applicationContext).getDelegatedContext();
            }
        }
        return applicationContext;
    }

    private static List<String> getAutoUnWrapStackList() {
        List<String> list = sAutoUnWrapStackList;
        if (list.isEmpty()) {
            list.add("com.sensorsdata.analytics.android.sdk");
        }
        return list;
    }

    public static void onDestroy(Context context) {
        sResContextCache.remove(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ClassLoader replaceExternalClassLoader(ClassLoader classLoader) {
        ClassLoader classLoader2 = e.OH().getClassLoader();
        return classLoader2 != null ? classLoader2 : classLoader;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Resources.Theme replaceTheme(Resources.Theme theme, Resources.Theme theme2, int i4) {
        Resources resources = e.OH().getResources();
        if (resources != null) {
            if (theme2 == null) {
                Resources.Theme newTheme = resources.newTheme();
                newTheme.applyStyle(i4, true);
                return newTheme;
            }
            return theme2;
        }
        return theme;
    }

    private static boolean returnUnWrappedContext(Context context) {
        ThreadLocal<a> threadLocal = sAutoUnWrapModelTL;
        a aVar = threadLocal.get();
        if (aVar != null) {
            if (aVar.ajz.get() != context || Math.abs(System.currentTimeMillis() - aVar.ajD) >= 150) {
                aVar.clear();
                aVar.ajz = new WeakReference(context);
                aVar.ajD = System.currentTimeMillis();
            } else {
                a.c(aVar);
                if (aVar.ajA >= (context instanceof Application ? 15 : 5) && a(context, aVar)) {
                    aVar.clear();
                    return true;
                }
            }
        } else {
            threadLocal.set(new a((byte) 0));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context wrapContextIfNeed(Context context) {
        Context context2;
        if (context == null) {
            ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).gatherException(new RuntimeException("KSWrapper wrapContextIfNeed context is null"));
            return null;
        } else if (((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).yV() && !(context instanceof com.kwad.sdk.n.a)) {
            if (j.aC(context)) {
                context = j.unwrapContextIfNeed(context);
                if (j.aC(context)) {
                    ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).gatherException(new RuntimeException("KSWrapper unwrapContextIfNeed fail"));
                    return context;
                }
            }
            Context context3 = sResContextCache.get(context);
            if (context3 instanceof com.kwad.sdk.n.a) {
                return context3;
            }
            if (k.dA(context)) {
                return context;
            }
            if (returnUnWrappedContext(context)) {
                ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).gatherException(new RuntimeException("KSWrapper returnUnWrappedContext context: " + context.getClass().getName()));
                return context;
            }
            if (context instanceof Application) {
                try {
                    f fVar = new f((Application) context, new g(context, e.OH()));
                    l.a(fVar);
                    context2 = fVar;
                } catch (Throwable unused) {
                    boolean yY = ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).yY();
                    ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).gatherException(new RuntimeException("wrapper Application fail --context:" + context.getClass().getName() + "--initFinish:" + yY));
                    return context;
                }
            } else if (context instanceof ContextThemeWrapper) {
                context2 = new b((ContextThemeWrapper) context);
            } else if (context instanceof androidx.appcompat.view.ContextThemeWrapper) {
                context2 = new c((androidx.appcompat.view.ContextThemeWrapper) context);
            } else if (context instanceof ContextWrapper) {
                context2 = new d(context);
            } else {
                context2 = new d(context);
            }
            a(context, context2);
            return context2;
        } else {
            return context;
        }
    }

    private static boolean a(Context context, a aVar) {
        Context context2 = sResContextCache.get(context);
        String name = context2 != null ? context2.getClass().getName() : "";
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (!Arrays.equals(stackTrace, aVar.ajB)) {
            if (aVar.ajB != null) {
                aVar.clear();
                return false;
            }
            aVar.ajB = stackTrace;
            int i4 = 0;
            int i5 = 0;
            while (i4 < stackTrace.length) {
                StackTraceElement stackTraceElement = stackTrace[i4];
                String className = stackTraceElement.getClassName();
                for (String str : getAutoUnWrapStackList()) {
                    if (!TextUtils.isEmpty(str) && className.contains(str)) {
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
        a.g(aVar);
        aVar.ajB = stackTrace;
        return aVar.ajC >= 5;
    }
}
