package androidx.constraintlayout.core.parser;

import java.io.PrintStream;
/* loaded from: classes.dex */
public class CLElement {
    protected static int BASE_INDENT = 2;
    protected static int MAX_LINE = 80;
    private int line;
    protected CLContainer mContainer;
    private final char[] mContent;
    protected long start = -1;
    protected long end = Long.MAX_VALUE;

    public CLElement(char[] cArr) {
        this.mContent = cArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addIndent(StringBuilder sb, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append(' ');
        }
    }

    public String content() {
        String str = new String(this.mContent);
        long j4 = this.end;
        if (j4 != Long.MAX_VALUE) {
            long j5 = this.start;
            if (j4 >= j5) {
                return str.substring((int) j5, ((int) j4) + 1);
            }
        }
        long j6 = this.start;
        return str.substring((int) j6, ((int) j6) + 1);
    }

    public CLElement getContainer() {
        return this.mContainer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getDebugName() {
        if (CLParser.DEBUG) {
            return getStrClass() + " -> ";
        }
        return "";
    }

    public long getEnd() {
        return this.end;
    }

    public float getFloat() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getFloat();
        }
        return Float.NaN;
    }

    public int getInt() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getInt();
        }
        return 0;
    }

    public int getLine() {
        return this.line;
    }

    public long getStart() {
        return this.start;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getStrClass() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public boolean isDone() {
        return this.end != Long.MAX_VALUE;
    }

    public boolean isStarted() {
        return this.start > -1;
    }

    public boolean notStarted() {
        return this.start == -1;
    }

    public void setContainer(CLContainer cLContainer) {
        this.mContainer = cLContainer;
    }

    public void setEnd(long j4) {
        if (this.end != Long.MAX_VALUE) {
            return;
        }
        this.end = j4;
        if (CLParser.DEBUG) {
            PrintStream printStream = System.out;
            printStream.println("closing " + hashCode() + " -> " + this);
        }
        CLContainer cLContainer = this.mContainer;
        if (cLContainer != null) {
            cLContainer.add(this);
        }
    }

    public void setLine(int i4) {
        this.line = i4;
    }

    public void setStart(long j4) {
        this.start = j4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String toFormattedJSON(int i4, int i5) {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String toJSON() {
        return "";
    }

    public String toString() {
        long j4 = this.start;
        long j5 = this.end;
        if (j4 <= j5 && j5 != Long.MAX_VALUE) {
            String substring = new String(this.mContent).substring((int) this.start, ((int) this.end) + 1);
            return getStrClass() + " (" + this.start + " : " + this.end + ") <<" + substring + ">>";
        }
        return getClass() + " (INVALID, " + this.start + "-" + this.end + ")";
    }
}
