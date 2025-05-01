package com.kwad.sdk.n;

import android.app.Application;
import android.content.Context;
import com.kwad.sdk.api.core.ResContext;
import com.kwad.sdk.api.loader.Wrapper;
import com.kwad.sdk.service.ServiceProvider;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context aB(Context context) {
        return ((ResContext) context).getDelegatedContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean aC(Context context) {
        return context instanceof ResContext;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context dz(Context context) {
        Context applicationContext = unwrapContextIfNeed(context).getApplicationContext();
        if (applicationContext instanceof Application) {
            return applicationContext;
        }
        for (int i4 = 0; i4 < 10; i4++) {
            applicationContext = applicationContext.getApplicationContext();
            if (applicationContext instanceof Application) {
                return applicationContext;
            }
            if (aC(applicationContext)) {
                applicationContext = aB(applicationContext);
            }
        }
        return applicationContext;
    }

    public static void onDestroy(Context context) {
        Wrapper.onDestroy(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context unwrapContextIfNeed(Context context) {
        if (aC(context)) {
            context = aB(context);
        }
        if (aC(context)) {
            RuntimeException runtimeException = null;
            for (int i4 = 0; i4 < 10; i4++) {
                if (runtimeException == null) {
                    boolean yY = ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).yY();
                    RuntimeException runtimeException2 = new RuntimeException("expect normalContext --context:" + context.getClass().getName() + "--initFinish:" + yY);
                    ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).gatherException(runtimeException2);
                    runtimeException = runtimeException2;
                }
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
    public static Context wrapContextIfNeed(Context context) {
        return Wrapper.wrapContextIfNeed(context);
    }
}
