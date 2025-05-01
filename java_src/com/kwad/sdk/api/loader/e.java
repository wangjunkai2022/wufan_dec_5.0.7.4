package com.kwad.sdk.api.loader;

import android.content.Context;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes5.dex */
public class e implements Thread.UncaughtExceptionHandler {
    private static e anv;
    private Thread.UncaughtExceptionHandler anw;
    private int anx;
    private long anz;
    private Context mContext;
    private boolean DEBUG = false;
    private final AtomicBoolean any = new AtomicBoolean();

    private e(Context context) {
        this.mContext = context;
    }

    public static e aL(Context context) {
        if (anv == null) {
            synchronized (e.class) {
                if (anv == null) {
                    anv = new e(context);
                }
            }
        }
        return anv;
    }

    public final void bW(int i4) {
        this.anz = System.currentTimeMillis();
        this.anx = i4;
    }

    public final void cancel() {
        this.any.set(true);
    }

    public final void setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler != this) {
            this.anw = uncaughtExceptionHandler;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            if (this.DEBUG) {
                StringBuilder sb = new StringBuilder("AutoRevertHandler uncaughtException, mStartCheckTime:");
                sb.append(this.anz);
                sb.append(",mMaxDuration:");
                sb.append(this.anx);
                sb.append(",mIsCancel:");
                sb.append(this.any.get());
            }
            if (!this.any.get() && this.anz > 0 && System.currentTimeMillis() - this.anz <= this.anx) {
                Boolean bool = (Boolean) com.kwad.sdk.api.c.f("filterStack", th);
                boolean booleanValue = bool != null ? bool.booleanValue() : true;
                Context context = this.mContext;
                if (context != null && booleanValue) {
                    b.a(context, h.anF, true);
                }
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.anw;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            try {
                th2.printStackTrace();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.anw;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                }
            } catch (Throwable th3) {
                if (this.anw != null) {
                    this.anw.uncaughtException(thread, th);
                }
                throw th3;
            }
        }
    }
}
