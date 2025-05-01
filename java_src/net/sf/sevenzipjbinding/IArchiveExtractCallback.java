package net.sf.sevenzipjbinding;
/* loaded from: classes7.dex */
public interface IArchiveExtractCallback extends IProgress {
    ISequentialOutStream getStream(int i4, ExtractAskMode extractAskMode) throws SevenZipException;

    void prepareOperation(ExtractAskMode extractAskMode) throws SevenZipException;

    void setOperationResult(ExtractOperationResult extractOperationResult) throws SevenZipException;
}
