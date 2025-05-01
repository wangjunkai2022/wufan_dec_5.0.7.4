package net.sf.sevenzipjbinding.impl;

import net.sf.sevenzipjbinding.IOutCreateArchiveZip;
import net.sf.sevenzipjbinding.IOutCreateCallback;
import net.sf.sevenzipjbinding.IOutItemZip;
import net.sf.sevenzipjbinding.IOutStream;
import net.sf.sevenzipjbinding.IOutUpdateArchiveZip;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;
/* loaded from: classes7.dex */
public class OutArchiveZipImpl extends OutArchiveImpl<IOutItemZip> implements IOutCreateArchiveZip, IOutUpdateArchiveZip {
    @Override // net.sf.sevenzipjbinding.IOutCreateArchiveZip
    public void createArchive(IOutStream iOutStream, int i4, IOutCreateCallback<? extends IOutItemZip> iOutCreateCallback) throws SevenZipException {
        createArchive((ISequentialOutStream) iOutStream, i4, (IOutCreateCallback) iOutCreateCallback);
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetLevel
    public void setLevel(int i4) {
        featureSetLevel(i4);
    }
}
