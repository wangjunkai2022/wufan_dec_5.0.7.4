package org.aspectj.lang;

import java.io.PrintStream;
import java.io.PrintWriter;
/* loaded from: classes7.dex */
public class SoftException extends RuntimeException {

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f72184c;

    /* renamed from: b  reason: collision with root package name */
    Throwable f72185b;

    static {
        boolean z4;
        try {
            Class.forName("java.nio.Buffer");
            z4 = true;
        } catch (Throwable unused) {
            z4 = false;
        }
        f72184c = z4;
    }

    public SoftException(Throwable th) {
        this.f72185b = th;
    }

    public Throwable a() {
        return this.f72185b;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f72185b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        Throwable th = this.f72185b;
        if (f72184c || th == null) {
            return;
        }
        printStream.print("Caused by: ");
        th.printStackTrace(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        Throwable th = this.f72185b;
        if (f72184c || th == null) {
            return;
        }
        printWriter.print("Caused by: ");
        th.printStackTrace(printWriter);
    }
}
