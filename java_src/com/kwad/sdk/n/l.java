package com.kwad.sdk.n;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.s;
import com.vuaukou.vco.hykiiuy.plugin.InstrumentationProxy;
/* loaded from: classes5.dex */
public final class l {
    private static Application aUB;

    public static Application ON() {
        checkInit();
        Application OO = OO();
        if (i.OK()) {
            aUB = (Application) i.wrapContextIfNeed(OO);
        }
        return aUB;
    }

    private static Application OO() {
        Context applicationContext;
        Application application = aUB;
        if (application != null) {
            return application;
        }
        Context Lw = ServiceProvider.Lw();
        if (Lw instanceof Application) {
            Application application2 = (Application) Lw;
            aUB = application2;
            return application2;
        }
        Context applicationContext2 = Lw.getApplicationContext();
        if (applicationContext2 instanceof Application) {
            Application application3 = (Application) applicationContext2;
            aUB = application3;
            return application3;
        }
        if (aC(applicationContext2)) {
            applicationContext = i.dz(applicationContext2);
        } else if (j.aC(applicationContext2)) {
            applicationContext = j.dz(applicationContext2);
        } else {
            applicationContext = Lw.getApplicationContext();
        }
        if (applicationContext instanceof Application) {
            aUB = (Application) applicationContext;
        } else {
            Application application4 = com.kwad.sdk.core.c.b.En().getApplication();
            if (application4 != null) {
                aUB = application4;
            } else if (applicationContext instanceof ContextWrapper) {
                Context baseContext = ((ContextWrapper) applicationContext).getBaseContext();
                if (baseContext != null) {
                    baseContext = baseContext.getApplicationContext();
                }
                if (baseContext instanceof Application) {
                    aUB = (Application) baseContext;
                }
            }
        }
        if (aUB == null) {
            aUB = OP();
        }
        Application dF = dF(aUB);
        aUB = dF;
        return dF;
    }

    private static Application OP() {
        Application application = (Application) s.a(InstrumentationProxy.f64868d, "currentApplication", new Object[0]);
        return application != null ? application : (Application) s.a("android.app.AppGlobals", "getInitialApplication", new Object[0]);
    }

    public static View a(Context context, @LayoutRes int i4, @Nullable ViewGroup viewGroup, boolean z4) {
        return dI(context).inflate(i4, viewGroup, false);
    }

    private static boolean aC(Context context) {
        return context instanceof a;
    }

    public static LayoutInflater b(Context context, Context context2) {
        LayoutInflater cloneInContext = LayoutInflater.from(dJ(context)).cloneInContext(context2);
        a(cloneInContext);
        return cloneInContext;
    }

    private static void checkInit() {
        if (e.OH().Nm()) {
            return;
        }
        ServiceProvider.reportSdkCaughtException(new RuntimeException("please init KSPlugin"));
    }

    @Nullable
    public static Activity dB(@Nullable Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        Context dD = dD(context);
        if (dD instanceof Activity) {
            return (Activity) dD;
        }
        com.kwad.sdk.core.c.b.En();
        return com.kwad.sdk.core.c.b.getCurrentActivity();
    }

    @NonNull
    private static Context dC(Context context) {
        if (i.OK() && !aC(context)) {
            boolean yY = ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).yY();
            ServiceProvider.reportSdkCaughtException(new RuntimeException("expect KSContext in external --context:" + context.getClass().getName() + "--initFinish:" + yY));
        } else if (!i.OK() && !j.aC(context)) {
            boolean yY2 = ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).yY();
            ServiceProvider.reportSdkCaughtException(new RuntimeException("expect ResContext in external --context:" + context.getClass().getName() + "--initFinish:" + yY2));
        }
        return context;
    }

    @NonNull
    public static Context dD(Context context) {
        Context unwrapContextIfNeed;
        checkInit();
        if (((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).yV() && !dG(context)) {
            if (aC(context)) {
                unwrapContextIfNeed = i.dy(context);
            } else {
                unwrapContextIfNeed = j.unwrapContextIfNeed(context);
            }
            return dE(unwrapContextIfNeed);
        }
        return context;
    }

    private static Context dE(Context context) {
        if (j.aC(context) || (context instanceof a)) {
            boolean yY = ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).yY();
            ServiceProvider.reportSdkCaughtException(new RuntimeException("expect normalContext --context:" + context.getClass().getName() + "--initFinish:" + yY));
        }
        return context;
    }

    private static Application dF(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        boolean yY = ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).yY();
        ServiceProvider.reportSdkCaughtException(new RuntimeException("expect normalContext --context:" + context.getClass().getName() + "--initFinish:" + yY + "--isExternal:" + ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).yV()));
        return null;
    }

    public static boolean dG(Context context) {
        return (aC(context) || j.aC(context)) ? false : true;
    }

    public static Context dH(Context context) {
        try {
            if (j.aC(context)) {
                context = j.aB(context);
            }
            if (context instanceof a) {
                context = ((a) context).getDelegatedContext();
            }
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
        if (dG(context)) {
            return context;
        }
        for (int i4 = 0; i4 < 5; i4++) {
            if (j.aC(context)) {
                context = j.aB(context);
            }
            if (context instanceof a) {
                context = ((a) context).getDelegatedContext();
            }
            if (dG(context)) {
                return context;
            }
        }
        return context;
    }

    public static LayoutInflater dI(Context context) {
        Context wrapContextIfNeed = wrapContextIfNeed(context);
        if (j.aC(wrapContextIfNeed)) {
            LayoutInflater from = LayoutInflater.from(wrapContextIfNeed);
            a(from);
            return from;
        }
        return LayoutInflater.from(wrapContextIfNeed);
    }

    private static Context dJ(Context context) {
        return context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : context;
    }

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

    public static void h(Activity activity) {
        j.onDestroy(activity);
    }

    public static View inflate(Context context, @LayoutRes int i4, @Nullable ViewGroup viewGroup) {
        return dI(context).inflate(i4, viewGroup);
    }

    @NonNull
    public static Context wrapContextIfNeed(Context context) {
        Context wrapContextIfNeed;
        checkInit();
        if (((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).yV()) {
            if (i.OK()) {
                wrapContextIfNeed = i.wrapContextIfNeed(context);
            } else {
                wrapContextIfNeed = j.wrapContextIfNeed(context);
            }
            return dC(wrapContextIfNeed);
        }
        return context;
    }

    public static void x(Context context, boolean z4) {
        try {
            context.getSharedPreferences("kssdk_api_pref", 0).edit().putBoolean("useContextClassLoader", z4).apply();
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTrace(th);
        }
    }

    public static void a(Application application) {
        if (aUB == null) {
            aUB = application;
        }
    }

    private static void a(LayoutInflater layoutInflater) {
        s.a(layoutInflater, "mFactory", (Object) null);
        s.a(layoutInflater, "mFactory2", (Object) null);
    }
}
