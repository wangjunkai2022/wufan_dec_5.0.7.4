package net.sf.sevenzipjbinding;

import net.sf.sevenzipjbinding.IOutItemBase;
/* loaded from: classes7.dex */
public interface IOutUpdateArchive<T extends IOutItemBase> extends IOutArchiveBase {
    ArchiveFormat getArchiveFormat();

    IInArchive getConnectedInArchive();

    void updateItems(ISequentialOutStream iSequentialOutStream, int i4, IOutCreateCallback<T> iOutCreateCallback) throws SevenZipException;
}
