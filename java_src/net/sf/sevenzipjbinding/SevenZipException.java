package net.sf.sevenzipjbinding;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
/* loaded from: classes7.dex */
public class SevenZipException extends IOException {
    private static final String NEW_LINE = System.getProperty("line.separator");
    private static final long serialVersionUID = 42;
    private Throwable causeFirstPotentialThrown;
    private Throwable causeLastPotentialThrown;
    private Throwable causeLastThrown;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class PrintStreamWriter extends Writer {
        private final PrintStream printStream;

        PrintStreamWriter(PrintStream printStream) {
            this.printStream = printStream;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.printStream.close();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            this.printStream.flush();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i4, int i5) throws IOException {
            if (i4 == 0 && i5 == cArr.length) {
                this.printStream.print(cArr);
            } else {
                this.printStream.print(new String(cArr, i4, i5));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class StackTraceWriter extends Writer {
        private int indexInMessage;
        private final String message;
        private boolean newlineFound;
        private PrintWriter writer;

        StackTraceWriter(PrintWriter printWriter, String str) {
            super(printWriter);
            this.newlineFound = true;
            this.writer = printWriter;
            this.message = str;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.writer.close();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            this.writer.flush();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i4, int i5) {
            for (int i6 = 0; i6 < i5; i6++) {
                if (cArr[i6] != '\n' && cArr[i6] != '\r') {
                    if (this.newlineFound) {
                        if (this.message.charAt(this.indexInMessage) == ' ') {
                            this.writer.write("| ");
                        } else {
                            this.writer.write(this.message.charAt(this.indexInMessage));
                            this.writer.write(32);
                        }
                        int i7 = this.indexInMessage + 1;
                        this.indexInMessage = i7;
                        if (i7 >= this.message.length()) {
                            this.indexInMessage = 0;
                        }
                    }
                    this.newlineFound = false;
                } else {
                    this.newlineFound = true;
                }
                this.writer.write(cArr[i6]);
            }
        }
    }

    public SevenZipException() {
    }

    private static String getMessageForPrintStackTraceExtended(Throwable th) {
        if (th instanceof SevenZipException) {
            return ((SevenZipException) th).getMessage(true);
        }
        return th.toString();
    }

    private void printMessageToStringBuilder(String str, StringBuilder sb, Throwable th) {
        sb.append(th.getClass().getCanonicalName());
        sb.append(": ");
        if (th instanceof SevenZipException) {
            ((SevenZipException) th).printToStringBuilder(str + "  ", sb, false);
            return;
        }
        sb.append(th.getMessage());
    }

    private static void printStackTraceOfThrowable(PrintWriter printWriter, Throwable th, Throwable th2) {
        if (th instanceof SevenZipException) {
            printStackTraceToPrintWriter(printWriter, (SevenZipException) th, th2);
        } else {
            printStackTraceRecursive(printWriter, th, th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        r6 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void printStackTraceRecursive(java.io.PrintWriter r9, java.lang.Throwable r10, java.lang.Throwable r11) {
        /*
            java.lang.StackTraceElement[] r0 = r10.getStackTrace()
            r1 = 3
            r2 = 0
            if (r11 == 0) goto L28
            java.lang.StackTraceElement[] r3 = r11.getStackTrace()
            int r4 = r3.length
            int r4 = r4 + (-1)
            int r5 = r0.length
            int r5 = r5 + (-1)
            r6 = 0
        L13:
            if (r4 < r1) goto L29
            if (r5 < r1) goto L29
            r7 = r3[r4]
            r8 = r0[r5]
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L29
            int r4 = r4 + (-1)
            int r5 = r5 + (-1)
            int r6 = r6 + 1
            goto L13
        L28:
            r6 = 0
        L29:
            if (r6 > r1) goto L2c
            r6 = 0
        L2c:
            if (r11 != 0) goto L36
            java.lang.String r11 = getMessageForPrintStackTraceExtended(r10)
            r9.println(r11)
            goto L4e
        L36:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "Caused by: "
            r11.append(r1)
            java.lang.String r1 = getMessageForPrintStackTraceExtended(r10)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            r9.println(r11)
        L4e:
            int r11 = r0.length
            int r11 = r11 - r6
            if (r2 >= r11) goto L6b
            r11 = r0[r2]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "\tat "
            r1.append(r3)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r9.println(r11)
            int r2 = r2 + 1
            goto L4e
        L6b:
            if (r6 <= 0) goto L86
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "\t... "
            r11.append(r0)
            r11.append(r6)
            java.lang.String r0 = " more"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r9.println(r11)
        L86:
            java.lang.Throwable r11 = r10.getCause()
            if (r11 == 0) goto L93
            java.lang.Throwable r11 = r10.getCause()
            printStackTraceOfThrowable(r9, r11, r10)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sf.sevenzipjbinding.SevenZipException.printStackTraceRecursive(java.io.PrintWriter, java.lang.Throwable, java.lang.Throwable):void");
    }

    private static void printStackTraceToPrintWriter(PrintWriter printWriter, SevenZipException sevenZipException, Throwable th) {
        if (sevenZipException.causeLastThrown == null && sevenZipException.causeFirstPotentialThrown == null && sevenZipException.causeLastPotentialThrown == null) {
            printStackTraceRecursive(printWriter, sevenZipException, th);
        }
        printWriter.println("+------ " + SevenZipException.class.getSimpleName() + " with multiple 'cause by' exceptions. Stacktraces for all involved exceptions:");
        printWriter.println("+-- The " + SevenZipException.class.getSimpleName() + " itself with first thrown 'cause by' exception (first cause): ");
        printStackTraceRecursive(new PrintWriter(new StackTraceWriter(printWriter, "  FIRST THROWN CAUSE ")), sevenZipException, th);
        if (sevenZipException.causeLastThrown != null) {
            printWriter.println("+-- Last thrown 'cause by' exception (last cause): ");
            printStackTraceOfThrowable(new PrintWriter(new StackTraceWriter(printWriter, "  LAST THROWN CAUSE ")), sevenZipException.causeLastThrown, sevenZipException);
        }
        if (sevenZipException.causeFirstPotentialThrown != null) {
            printWriter.println("+-- First thrown potential 'cause by' exception, thrown in an other thread (first possible cause): ");
            printStackTraceOfThrowable(new PrintWriter(new StackTraceWriter(printWriter, "  FIRST THROWN POTENTIAL CAUSE ")), sevenZipException.causeFirstPotentialThrown, sevenZipException);
        }
        if (sevenZipException.causeLastPotentialThrown != null) {
            printWriter.println("+-- Last thrown potential 'cause by' exception, thrown in an other thread (last possible cause): ");
            printStackTraceOfThrowable(new PrintWriter(new StackTraceWriter(printWriter, "  LAST THROWN POTENTIAL CAUSE ")), sevenZipException.causeLastPotentialThrown, sevenZipException);
        }
        printWriter.println("+------ End of stacktrace of " + SevenZipException.class.getSimpleName() + " with multiple 'cause by' exceptions");
    }

    private void printToStringBuilder(String str, StringBuilder sb, boolean z4) {
        String message = super.getMessage();
        if (message == null) {
            sb.append("No message");
        } else {
            sb.append(message);
        }
        if (str.length() == 0 && !z4) {
            sb.append(NEW_LINE);
            sb.append("This " + SevenZipException.class.getSimpleName() + " has multiple 'cause by' exceptions. Use one of the " + SevenZipException.class.getSimpleName() + ".printStackTraceExtended(..) methods to get stack trace of last thrown and first/last potiential thrown 'cause by' exceptions.");
        }
        Throwable cause = getCause();
        if (cause != null) {
            sb.append(NEW_LINE);
            sb.append(str);
            sb.append("Caused by (first thrown): ");
            printMessageToStringBuilder(str, sb, cause);
        }
        if (this.causeLastThrown != null) {
            sb.append(NEW_LINE);
            sb.append(str);
            sb.append("Caused by (last thrown): ");
            printMessageToStringBuilder(str, sb, this.causeLastThrown);
        }
        if (this.causeFirstPotentialThrown != null) {
            sb.append(NEW_LINE);
            sb.append(str);
            sb.append("Caused by (first potential thrown): ");
            printMessageToStringBuilder(str, sb, this.causeFirstPotentialThrown);
        }
        if (this.causeLastPotentialThrown != null) {
            sb.append(NEW_LINE);
            sb.append(str);
            sb.append("Caused by (last potential thrown): ");
            printMessageToStringBuilder(str, sb, this.causeLastPotentialThrown);
        }
    }

    private void setCauseFirstPotentialThrown(Throwable th) {
        this.causeFirstPotentialThrown = th;
    }

    private void setCauseLastPotentialThrown(Throwable th) {
        this.causeLastPotentialThrown = th;
    }

    private void setCauseLastThrown(Throwable th) {
        this.causeLastThrown = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return super.getCause();
    }

    public Throwable getCauseFirstPotentialThrown() {
        return this.causeFirstPotentialThrown;
    }

    public Throwable getCauseLastPotentialThrown() {
        return this.causeLastPotentialThrown;
    }

    public Throwable getCauseLastThrown() {
        return this.causeLastThrown;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return getMessage(false);
    }

    public String getSevenZipExceptionMessage() {
        return super.getMessage();
    }

    public void printStackTraceExtended() {
        printStackTraceExtended(System.err);
    }

    public SevenZipException(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    private String getMessage(boolean z4) {
        if (this.causeLastThrown == null && this.causeFirstPotentialThrown == null && this.causeLastPotentialThrown == null) {
            return super.getMessage();
        }
        StringBuilder sb = new StringBuilder();
        printToStringBuilder("", sb, z4);
        return sb.toString();
    }

    public void printStackTraceExtended(PrintStream printStream) {
        synchronized (printStream) {
            printStackTraceToPrintWriter(new PrintWriter(new PrintStreamWriter(printStream)), this, null);
        }
    }

    public SevenZipException(String str) {
        super(str);
    }

    public SevenZipException(Throwable th) {
        initCause(th);
    }

    public void printStackTraceExtended(PrintWriter printWriter) {
        synchronized (printWriter) {
            printStackTraceToPrintWriter(printWriter, this, null);
        }
    }
}
