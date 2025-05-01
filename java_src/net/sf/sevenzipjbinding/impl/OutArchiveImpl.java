package net.sf.sevenzipjbinding.impl;

import java.io.IOException;
import java.io.PrintStream;
import net.sf.sevenzipjbinding.ArchiveFormat;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.IOutArchive;
import net.sf.sevenzipjbinding.IOutCreateCallback;
import net.sf.sevenzipjbinding.IOutItemBase;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;
/* loaded from: classes7.dex */
public class OutArchiveImpl<T extends IOutItemBase> implements IOutArchive<T> {
    private ArchiveFormat archiveFormat;
    private boolean closed;
    private Boolean headerEncryption;
    private IInArchive inArchive;
    private long jbindingSession;
    private long sevenZipArchiveInstance;
    private boolean trace;
    private PrintStream tracePrintStream;
    private int compressionLevel = -1;
    private int threadCount = -1;

    private void doUpdateItems(ISequentialOutStream iSequentialOutStream, int i4, IOutCreateCallback<?> iOutCreateCallback) throws SevenZipException {
        applyFeatures();
        nativeUpdateItems(iSequentialOutStream, i4, iOutCreateCallback);
    }

    private void ensureOpened() throws SevenZipException {
        if (!this.closed) {
            IInArchive iInArchive = this.inArchive;
            if (iInArchive != null) {
                ((InArchiveImpl) iInArchive).ensureOpened();
                return;
            }
            return;
        }
        throw new SevenZipException("OutArchive closed");
    }

    private native void nativeClose() throws SevenZipException;

    private native void nativeUpdateItems(ISequentialOutStream iSequentialOutStream, int i4, Object obj) throws SevenZipException;

    private final void traceMessage(String str) {
        if (this.trace) {
            PrintStream printStream = this.tracePrintStream;
            if (printStream == null) {
                System.out.println(str);
            } else {
                printStream.println(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void applyFeatures() throws SevenZipException {
        ensureOpened();
        int i4 = this.compressionLevel;
        if (i4 != -1) {
            nativeSetLevel(i4);
        }
        Boolean bool = this.headerEncryption;
        if (bool != null) {
            nativeSetHeaderEncryption(bool.booleanValue());
        }
        int i5 = this.threadCount;
        if (i5 >= 0) {
            nativeSetMultithreading(i5);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        if (this.inArchive != null) {
            return;
        }
        nativeClose();
    }

    @Override // net.sf.sevenzipjbinding.IOutCreateArchive
    public void createArchive(ISequentialOutStream iSequentialOutStream, int i4, IOutCreateCallback<? extends T> iOutCreateCallback) throws SevenZipException {
        ensureOpened();
        doUpdateItems(iSequentialOutStream, i4, iOutCreateCallback);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void featureSetHeaderEncryption(boolean z4) {
        this.headerEncryption = Boolean.valueOf(z4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void featureSetLevel(int i4) {
        this.compressionLevel = i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void featureSetThreadCount(int i4) {
        this.threadCount = i4;
    }

    @Override // net.sf.sevenzipjbinding.IOutCreateArchive, net.sf.sevenzipjbinding.IOutUpdateArchive
    public ArchiveFormat getArchiveFormat() {
        return this.archiveFormat;
    }

    @Override // net.sf.sevenzipjbinding.IOutUpdateArchive
    public IInArchive getConnectedInArchive() {
        return this.inArchive;
    }

    @Override // net.sf.sevenzipjbinding.IOutArchiveBase
    public PrintStream getTracePrintStream() {
        return this.tracePrintStream;
    }

    @Override // net.sf.sevenzipjbinding.IOutArchiveBase
    public boolean isTrace() {
        return this.trace;
    }

    protected native void nativeSetHeaderEncryption(boolean z4) throws SevenZipException;

    protected native void nativeSetLevel(int i4) throws SevenZipException;

    protected native void nativeSetMultithreading(int i4) throws SevenZipException;

    /* JADX INFO: Access modifiers changed from: protected */
    public native void nativeSetSolidSpec(String str) throws SevenZipException;

    /* JADX INFO: Access modifiers changed from: protected */
    public void setArchiveFormat(ArchiveFormat archiveFormat) {
        this.archiveFormat = archiveFormat;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setInArchive(IInArchive iInArchive) {
        this.inArchive = iInArchive;
    }

    @Override // net.sf.sevenzipjbinding.IOutArchiveBase
    public void setTrace(boolean z4) {
        this.trace = z4;
    }

    @Override // net.sf.sevenzipjbinding.IOutArchiveBase
    public void setTracePrintStream(PrintStream printStream) {
        this.tracePrintStream = printStream;
    }

    @Override // net.sf.sevenzipjbinding.IOutUpdateArchive
    public void updateItems(ISequentialOutStream iSequentialOutStream, int i4, IOutCreateCallback<T> iOutCreateCallback) throws SevenZipException {
        ensureOpened();
        doUpdateItems(iSequentialOutStream, i4, iOutCreateCallback);
    }
}
