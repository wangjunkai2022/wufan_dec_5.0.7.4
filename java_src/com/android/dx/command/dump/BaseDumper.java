package com.android.dx.command.dump;

import com.android.dx.cf.code.ConcreteMethod;
import com.android.dx.cf.iface.Member;
import com.android.dx.cf.iface.ParseObserver;
import com.android.dx.dex.DexOptions;
import com.android.dx.util.ByteArray;
import com.android.dx.util.Hex;
import com.android.dx.util.IndentingWriter;
import com.android.dx.util.TwoColumnOutput;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;
/* loaded from: classes2.dex */
public abstract class BaseDumper implements ParseObserver {
    protected Args args;
    private final byte[] bytes;
    protected final DexOptions dexOptions;
    private final String filePath;
    private final int hexCols;
    private int indent;
    private final PrintStream out;
    private final boolean rawBytes;
    private int readBytes;
    private String separator;
    private final boolean strictParse;
    private final int width;

    public BaseDumper(byte[] bArr, PrintStream printStream, String str, Args args) {
        this.bytes = bArr;
        boolean z4 = args.rawBytes;
        this.rawBytes = z4;
        this.out = printStream;
        int i4 = args.width;
        i4 = i4 <= 0 ? 79 : i4;
        this.width = i4;
        this.filePath = str;
        this.strictParse = args.strictParse;
        this.indent = 0;
        this.separator = z4 ? "|" : "";
        this.readBytes = 0;
        this.args = args;
        this.dexOptions = new DexOptions();
        int i5 = (((i4 - 5) / 15) + 1) & (-2);
        if (i5 < 6) {
            i5 = 6;
        } else if (i5 > 10) {
            i5 = 10;
        }
        this.hexCols = i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeParamWidth(ConcreteMethod concreteMethod, boolean z4) {
        return concreteMethod.getEffectiveDescriptor().getParameterTypes().getWordCount();
    }

    @Override // com.android.dx.cf.iface.ParseObserver
    public void changeIndent(int i4) {
        this.indent += i4;
        this.separator = this.rawBytes ? "|" : "";
        for (int i5 = 0; i5 < this.indent; i5++) {
            this.separator += "  ";
        }
    }

    @Override // com.android.dx.cf.iface.ParseObserver
    public void endParsingMember(ByteArray byteArray, int i4, String str, String str2, Member member) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final byte[] getBytes() {
        return this.bytes;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String getFilePath() {
        return this.filePath;
    }

    protected final boolean getRawBytes() {
        return this.rawBytes;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getReadBytes() {
        return this.readBytes;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean getStrictParse() {
        return this.strictParse;
    }

    protected final int getWidth1() {
        if (this.rawBytes) {
            int i4 = this.hexCols;
            return (i4 * 2) + 5 + (i4 / 2);
        }
        return 0;
    }

    protected final int getWidth2() {
        return (this.width - (this.rawBytes ? getWidth1() + 1 : 0)) - (this.indent * 2);
    }

    protected final String hexDump(int i4, int i5) {
        return Hex.dump(this.bytes, i4, i5, i4, this.hexCols, 4);
    }

    @Override // com.android.dx.cf.iface.ParseObserver
    public void parsed(ByteArray byteArray, int i4, int i5, String str) {
        print(twoColumns(getRawBytes() ? hexDump(byteArray.underlyingOffset(i4), i5) : "", str));
        this.readBytes += i5;
    }

    protected final void print(String str) {
        this.out.print(str);
    }

    protected final void println(String str) {
        this.out.println(str);
    }

    @Override // com.android.dx.cf.iface.ParseObserver
    public void startParsingMember(ByteArray byteArray, int i4, String str, String str2) {
    }

    protected final String twoColumns(String str, String str2) {
        int width1 = getWidth1();
        int width2 = getWidth2();
        try {
            if (width1 == 0) {
                int length = str2.length();
                StringWriter stringWriter = new StringWriter(length * 2);
                IndentingWriter indentingWriter = new IndentingWriter(stringWriter, width2, this.separator);
                indentingWriter.write(str2);
                if (length == 0 || str2.charAt(length - 1) != '\n') {
                    indentingWriter.write(10);
                }
                indentingWriter.flush();
                return stringWriter.toString();
            }
            return TwoColumnOutput.toString(str, width1, this.separator, str2, width2);
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }
}
