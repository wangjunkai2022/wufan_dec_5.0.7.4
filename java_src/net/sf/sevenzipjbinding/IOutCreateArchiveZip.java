package net.sf.sevenzipjbinding;
/* loaded from: classes7.dex */
public interface IOutCreateArchiveZip extends IOutCreateArchive<IOutItemZip>, IOutFeatureSetLevel {
    void createArchive(IOutStream iOutStream, int i4, IOutCreateCallback<? extends IOutItemZip> iOutCreateCallback) throws SevenZipException;
}
