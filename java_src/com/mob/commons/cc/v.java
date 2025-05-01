package com.mob.commons.cc;

import java.io.PrintStream;
import java.io.PrintWriter;
/* loaded from: classes5.dex */
public final class v extends RuntimeException {
    public v(String str, Throwable th) {
        super(str, th);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStream.println("" + getMessage());
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printWriter.println("" + getMessage());
    }
}
