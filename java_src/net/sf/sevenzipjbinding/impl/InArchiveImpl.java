package net.sf.sevenzipjbinding.impl;

import net.sf.sevenzipjbinding.ArchiveFormat;
import net.sf.sevenzipjbinding.ExtractAskMode;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import net.sf.sevenzipjbinding.IArchiveExtractCallback;
import net.sf.sevenzipjbinding.ICryptoGetTextPassword;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.IOutItemAllFormats;
import net.sf.sevenzipjbinding.IOutItemBase;
import net.sf.sevenzipjbinding.IOutUpdateArchive;
import net.sf.sevenzipjbinding.IOutUpdateArchive7z;
import net.sf.sevenzipjbinding.IOutUpdateArchiveBZip2;
import net.sf.sevenzipjbinding.IOutUpdateArchiveGZip;
import net.sf.sevenzipjbinding.IOutUpdateArchiveTar;
import net.sf.sevenzipjbinding.IOutUpdateArchiveZip;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.NFileTimeType;
import net.sf.sevenzipjbinding.PropID;
import net.sf.sevenzipjbinding.PropertyInfo;
import net.sf.sevenzipjbinding.SevenZipException;
import net.sf.sevenzipjbinding.simple.ISimpleInArchive;
import net.sf.sevenzipjbinding.simple.impl.SimpleInArchiveImpl;
/* loaded from: classes7.dex */
public final class InArchiveImpl implements IInArchive {
    private ArchiveFormat archiveFormat;
    private boolean closed;
    private long jbindingSession;
    private int numberOfItems = -1;
    private OutArchiveImpl<?> outArchiveImpl;
    private long sevenZipArchiveInstance;
    private long sevenZipInStreamInstance;

    /* renamed from: net.sf.sevenzipjbinding.impl.InArchiveImpl$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$sf$sevenzipjbinding$PropID;

        static {
            int[] iArr = new int[PropID.values().length];
            $SwitchMap$net$sf$sevenzipjbinding$PropID = iArr;
            try {
                iArr[PropID.SIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$sf$sevenzipjbinding$PropID[PropID.PACKED_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$sf$sevenzipjbinding$PropID[PropID.IS_FOLDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$sf$sevenzipjbinding$PropID[PropID.ENCRYPTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$net$sf$sevenzipjbinding$PropID[PropID.TIME_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes7.dex */
    private static class ExtractSlowCallback implements IArchiveExtractCallback {
        private ExtractOperationResult extractOperationResult;
        ISequentialOutStream sequentialOutStreamParam;

        ExtractSlowCallback(ISequentialOutStream iSequentialOutStream) {
            this.sequentialOutStreamParam = iSequentialOutStream;
        }

        ExtractOperationResult getExtractOperationResult() {
            return this.extractOperationResult;
        }

        @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
        public ISequentialOutStream getStream(int i4, ExtractAskMode extractAskMode) {
            if (extractAskMode.equals(ExtractAskMode.EXTRACT)) {
                return this.sequentialOutStreamParam;
            }
            return null;
        }

        @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
        public void prepareOperation(ExtractAskMode extractAskMode) {
        }

        @Override // net.sf.sevenzipjbinding.IProgress
        public void setCompleted(long j4) {
        }

        @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
        public void setOperationResult(ExtractOperationResult extractOperationResult) {
            this.extractOperationResult = extractOperationResult;
        }

        @Override // net.sf.sevenzipjbinding.IProgress
        public void setTotal(long j4) {
        }
    }

    /* loaded from: classes7.dex */
    private static final class ExtractSlowCryptoCallback extends ExtractSlowCallback implements ICryptoGetTextPassword {
        private String password;

        public ExtractSlowCryptoCallback(ISequentialOutStream iSequentialOutStream, String str) {
            super(iSequentialOutStream);
            this.password = str;
        }

        @Override // net.sf.sevenzipjbinding.ICryptoGetTextPassword
        public String cryptoGetTextPassword() throws SevenZipException {
            return this.password;
        }
    }

    private void createConnectedOutArchive() throws SevenZipException {
        if (this.archiveFormat.isOutArchiveSupported()) {
            try {
                OutArchiveImpl<?> newInstance = this.archiveFormat.getOutArchiveImplementation().newInstance();
                this.outArchiveImpl = newInstance;
                newInstance.setInArchive(this);
                this.outArchiveImpl.setArchiveFormat(this.archiveFormat);
                nativeConnectOutArchive(this.outArchiveImpl, this.archiveFormat);
                return;
            } catch (Exception unused) {
                throw new IllegalStateException("Internal error: Can't create new instance of the class " + this.archiveFormat.getOutArchiveImplementation() + " using default constructor.");
            }
        }
        throw new IllegalStateException("Archive format '" + this.archiveFormat + "' doesn't support archive manipulations.");
    }

    private void ensureArchiveFormatForArchiveFormatSpecificUpdateAPI(ArchiveFormat archiveFormat) throws SevenZipException {
        if (getArchiveFormat() == archiveFormat) {
            return;
        }
        throw new SevenZipException("Archive format specific update API for " + archiveFormat.getMethodName() + "-archives can't work with the currently opened " + getArchiveFormat().getMethodName() + "-archive");
    }

    private <T extends IOutItemBase> IOutUpdateArchive<T> getConnectedOutArchiveIntern() throws SevenZipException {
        if (this.outArchiveImpl == null) {
            createConnectedOutArchive();
        }
        return this.outArchiveImpl;
    }

    private native void nativeClose() throws SevenZipException;

    private native void nativeConnectOutArchive(OutArchiveImpl<?> outArchiveImpl, ArchiveFormat archiveFormat) throws SevenZipException;

    private native void nativeExtract(int[] iArr, boolean z4, IArchiveExtractCallback iArchiveExtractCallback) throws SevenZipException;

    private native Object nativeGetArchiveProperty(int i4) throws SevenZipException;

    private native PropertyInfo nativeGetArchivePropertyInfo(int i4) throws SevenZipException;

    private native int nativeGetNumberOfArchiveProperties() throws SevenZipException;

    private native int nativeGetNumberOfItems() throws SevenZipException;

    private native int nativeGetNumberOfProperties() throws SevenZipException;

    private native Object nativeGetProperty(int i4, int i5) throws SevenZipException;

    private native PropertyInfo nativeGetPropertyInfo(int i4) throws SevenZipException;

    private native String nativeGetStringArchiveProperty(int i4) throws SevenZipException;

    private native String nativeGetStringProperty(int i4, int i5) throws SevenZipException;

    private void setArchiveFormat(String str) {
        ArchiveFormat[] values;
        for (ArchiveFormat archiveFormat : ArchiveFormat.values()) {
            if (archiveFormat.getMethodName().equalsIgnoreCase(str)) {
                this.archiveFormat = archiveFormat;
                return;
            }
        }
    }

    @Override // net.sf.sevenzipjbinding.IInArchive, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws SevenZipException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        nativeClose();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ensureOpened() throws SevenZipException {
        if (this.closed) {
            throw new SevenZipException("InArchive closed");
        }
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public void extract(int[] iArr, boolean z4, IArchiveExtractCallback iArchiveExtractCallback) throws SevenZipException {
        ensureOpened();
        nativeExtract(iArr, z4, iArchiveExtractCallback);
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public ExtractOperationResult extractSlow(int i4, ISequentialOutStream iSequentialOutStream) throws SevenZipException {
        ensureOpened();
        ExtractSlowCallback extractSlowCallback = new ExtractSlowCallback(iSequentialOutStream);
        nativeExtract(new int[]{i4}, false, extractSlowCallback);
        return extractSlowCallback.getExtractOperationResult();
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public ArchiveFormat getArchiveFormat() {
        return this.archiveFormat;
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public Object getArchiveProperty(PropID propID) throws SevenZipException {
        ensureOpened();
        return nativeGetArchiveProperty(propID.getPropIDIndex());
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public PropertyInfo getArchivePropertyInfo(int i4) throws SevenZipException {
        ensureOpened();
        return nativeGetArchivePropertyInfo(i4);
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public IOutUpdateArchive<IOutItemAllFormats> getConnectedOutArchive() throws SevenZipException {
        ensureOpened();
        return getConnectedOutArchiveIntern();
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public IOutUpdateArchive7z getConnectedOutArchive7z() throws SevenZipException {
        ensureOpened();
        ensureArchiveFormatForArchiveFormatSpecificUpdateAPI(ArchiveFormat.SEVEN_ZIP);
        return (IOutUpdateArchive7z) getConnectedOutArchiveIntern();
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public IOutUpdateArchiveBZip2 getConnectedOutArchiveBZip2() throws SevenZipException {
        ensureOpened();
        ensureArchiveFormatForArchiveFormatSpecificUpdateAPI(ArchiveFormat.BZIP2);
        return (IOutUpdateArchiveBZip2) getConnectedOutArchiveIntern();
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public IOutUpdateArchiveGZip getConnectedOutArchiveGZip() throws SevenZipException {
        ensureOpened();
        ensureArchiveFormatForArchiveFormatSpecificUpdateAPI(ArchiveFormat.GZIP);
        return (IOutUpdateArchiveGZip) getConnectedOutArchiveIntern();
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public IOutUpdateArchiveTar getConnectedOutArchiveTar() throws SevenZipException {
        ensureOpened();
        ensureArchiveFormatForArchiveFormatSpecificUpdateAPI(ArchiveFormat.TAR);
        return (IOutUpdateArchiveTar) getConnectedOutArchiveIntern();
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public IOutUpdateArchiveZip getConnectedOutArchiveZip() throws SevenZipException {
        ensureOpened();
        ensureArchiveFormatForArchiveFormatSpecificUpdateAPI(ArchiveFormat.ZIP);
        return (IOutUpdateArchiveZip) getConnectedOutArchiveIntern();
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public int getNumberOfArchiveProperties() throws SevenZipException {
        ensureOpened();
        return nativeGetNumberOfArchiveProperties();
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public int getNumberOfItems() throws SevenZipException {
        ensureOpened();
        if (this.numberOfItems == -1) {
            this.numberOfItems = nativeGetNumberOfItems();
        }
        return this.numberOfItems;
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public int getNumberOfProperties() throws SevenZipException {
        ensureOpened();
        return nativeGetNumberOfProperties();
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public Object getProperty(int i4, PropID propID) throws SevenZipException {
        ArchiveFormat archiveFormat;
        ensureOpened();
        if (i4 >= 0 && i4 < getNumberOfItems()) {
            Object nativeGetProperty = nativeGetProperty(i4, propID.getPropIDIndex());
            int i5 = AnonymousClass1.$SwitchMap$net$sf$sevenzipjbinding$PropID[propID.ordinal()];
            if (i5 != 1 && i5 != 2) {
                return i5 != 3 ? i5 != 4 ? (i5 == 5 && nativeGetProperty != null) ? NFileTimeType.values()[((Integer) nativeGetProperty).intValue()] : nativeGetProperty : nativeGetProperty == null ? Boolean.FALSE : nativeGetProperty : nativeGetProperty == null ? Boolean.FALSE : nativeGetProperty;
            } else if (nativeGetProperty instanceof Integer) {
                return Long.valueOf(((Integer) nativeGetProperty).longValue());
            } else {
                if (nativeGetProperty == null && (archiveFormat = this.archiveFormat) != null && archiveFormat == ArchiveFormat.NSIS) {
                    return 0L;
                }
                return nativeGetProperty;
            }
        }
        throw new SevenZipException("Index out of range. Index: " + i4 + ", NumberOfItems: " + getNumberOfItems());
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public PropertyInfo getPropertyInfo(int i4) throws SevenZipException {
        ensureOpened();
        return nativeGetPropertyInfo(i4);
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public ISimpleInArchive getSimpleInterface() {
        return new SimpleInArchiveImpl(this);
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public String getStringArchiveProperty(PropID propID) throws SevenZipException {
        ensureOpened();
        return nativeGetStringArchiveProperty(propID.getPropIDIndex());
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public String getStringProperty(int i4, PropID propID) throws SevenZipException {
        ensureOpened();
        if (i4 >= 0 && i4 < getNumberOfItems()) {
            return nativeGetStringProperty(i4, propID.getPropIDIndex());
        }
        throw new SevenZipException("Index out of range. Index: " + i4 + ", NumberOfItems: " + getNumberOfItems());
    }

    @Override // net.sf.sevenzipjbinding.IInArchive
    public ExtractOperationResult extractSlow(int i4, ISequentialOutStream iSequentialOutStream, String str) throws SevenZipException {
        ensureOpened();
        ExtractSlowCryptoCallback extractSlowCryptoCallback = new ExtractSlowCryptoCallback(iSequentialOutStream, str);
        nativeExtract(new int[]{i4}, false, extractSlowCryptoCallback);
        return extractSlowCryptoCallback.getExtractOperationResult();
    }
}
