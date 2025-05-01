package net.sf.sevenzipjbinding;

import java.io.Closeable;
import net.sf.sevenzipjbinding.simple.ISimpleInArchive;
/* loaded from: classes7.dex */
public interface IInArchive extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws SevenZipException;

    void extract(int[] iArr, boolean z4, IArchiveExtractCallback iArchiveExtractCallback) throws SevenZipException;

    ExtractOperationResult extractSlow(int i4, ISequentialOutStream iSequentialOutStream) throws SevenZipException;

    ExtractOperationResult extractSlow(int i4, ISequentialOutStream iSequentialOutStream, String str) throws SevenZipException;

    ArchiveFormat getArchiveFormat();

    Object getArchiveProperty(PropID propID) throws SevenZipException;

    PropertyInfo getArchivePropertyInfo(int i4) throws SevenZipException;

    IOutUpdateArchive<IOutItemAllFormats> getConnectedOutArchive() throws SevenZipException;

    IOutUpdateArchive7z getConnectedOutArchive7z() throws SevenZipException;

    IOutUpdateArchiveBZip2 getConnectedOutArchiveBZip2() throws SevenZipException;

    IOutUpdateArchiveGZip getConnectedOutArchiveGZip() throws SevenZipException;

    IOutUpdateArchiveTar getConnectedOutArchiveTar() throws SevenZipException;

    IOutUpdateArchiveZip getConnectedOutArchiveZip() throws SevenZipException;

    int getNumberOfArchiveProperties() throws SevenZipException;

    int getNumberOfItems() throws SevenZipException;

    int getNumberOfProperties() throws SevenZipException;

    Object getProperty(int i4, PropID propID) throws SevenZipException;

    PropertyInfo getPropertyInfo(int i4) throws SevenZipException;

    ISimpleInArchive getSimpleInterface();

    String getStringArchiveProperty(PropID propID) throws SevenZipException;

    String getStringProperty(int i4, PropID propID) throws SevenZipException;
}
