package net.sf.sevenzipjbinding;

import java.io.PrintStream;
/* loaded from: classes7.dex */
public interface IOutArchiveBase {
    PrintStream getTracePrintStream();

    boolean isTrace();

    void setTrace(boolean z4);

    void setTracePrintStream(PrintStream printStream);
}
