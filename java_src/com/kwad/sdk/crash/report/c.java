package com.kwad.sdk.crash.report;

import android.util.Log;
import androidx.annotation.Nullable;
import com.kwad.sdk.crash.model.message.ExceptionMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes5.dex */
public abstract class c implements e {
    private ArrayList<a> aIt = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a {
        private ExceptionMessage aIu;
        private int aIv;

        a(ExceptionMessage exceptionMessage, int i4) {
            this.aIu = exceptionMessage;
            this.aIv = i4;
        }
    }

    private void IJ() {
        if (this.aIt.isEmpty()) {
            return;
        }
        try {
            Iterator<a> it2 = this.aIt.iterator();
            while (it2.hasNext()) {
                a next = it2.next();
                b(next.aIu, next.aIv, null);
                it2.remove();
            }
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
    }

    private void b(ExceptionMessage exceptionMessage, int i4, @Nullable CountDownLatch countDownLatch) {
        if (exceptionMessage == null || !c(exceptionMessage)) {
            return;
        }
        if (i4 == 3) {
            com.kwad.sdk.crash.report.a.b(exceptionMessage);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(com.kwad.sdk.crash.report.request.c.d(exceptionMessage));
        com.kwad.sdk.crash.report.request.b.a(arrayList, countDownLatch);
    }

    private boolean c(ExceptionMessage exceptionMessage) {
        try {
            com.kwad.sdk.crash.e If = com.kwad.sdk.crash.e.If();
            if (If.Ik() != null && If.Ij() != 2) {
                List<com.kwad.sdk.crash.a> list = If.Ik().aGM;
                double d5 = If.Ik().aGp;
                String appId = If.getAppId();
                String sdkVersion = If.getSdkVersion();
                for (com.kwad.sdk.crash.a aVar : list) {
                    if (aVar != null && (com.kwad.sdk.crash.utils.c.b(aVar.aGm) || aVar.aGm.contains(appId))) {
                        if (com.kwad.sdk.crash.utils.c.b(aVar.aGn) || aVar.aGn.contains(sdkVersion)) {
                            if (com.kwad.sdk.crash.utils.c.b(aVar.aGo) || a(exceptionMessage.mCrashDetail, aVar.aGo)) {
                                d5 = aVar.aGp;
                            }
                        }
                    }
                }
                return Math.random() < d5;
            }
            return true;
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.w("BaseExceptionUploader", Log.getStackTraceString(e5));
            return true;
        }
    }

    public final void a(ExceptionMessage exceptionMessage, int i4, @Nullable CountDownLatch countDownLatch) {
        try {
            IJ();
            b(exceptionMessage, i4, countDownLatch);
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
            this.aIt.add(new a(exceptionMessage, i4));
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    private static boolean a(String str, List<String> list) {
        for (String str2 : list) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }
}
