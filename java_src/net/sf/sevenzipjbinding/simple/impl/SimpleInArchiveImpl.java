package net.sf.sevenzipjbinding.simple.impl;

import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.SevenZipException;
import net.sf.sevenzipjbinding.simple.ISimpleInArchive;
import net.sf.sevenzipjbinding.simple.ISimpleInArchiveItem;
/* loaded from: classes7.dex */
public class SimpleInArchiveImpl implements ISimpleInArchive {
    private final IInArchive sevenZipInArchive;
    private boolean wasClosed = false;

    public SimpleInArchiveImpl(IInArchive iInArchive) {
        this.sevenZipInArchive = iInArchive;
    }

    @Override // net.sf.sevenzipjbinding.simple.ISimpleInArchive
    public void close() throws SevenZipException {
        this.sevenZipInArchive.close();
        this.wasClosed = true;
    }

    @Override // net.sf.sevenzipjbinding.simple.ISimpleInArchive
    public ISimpleInArchiveItem getArchiveItem(int i4) throws SevenZipException {
        if (i4 >= 0 && i4 < this.sevenZipInArchive.getNumberOfItems()) {
            return new SimpleInArchiveItemImpl(this, i4);
        }
        throw new SevenZipException("Index " + i4 + " is out of range. Number of items in archive: " + this.sevenZipInArchive.getNumberOfItems());
    }

    @Override // net.sf.sevenzipjbinding.simple.ISimpleInArchive
    public ISimpleInArchiveItem[] getArchiveItems() throws SevenZipException {
        int numberOfItems = getNumberOfItems();
        ISimpleInArchiveItem[] iSimpleInArchiveItemArr = new ISimpleInArchiveItem[numberOfItems];
        for (int i4 = 0; i4 < numberOfItems; i4++) {
            iSimpleInArchiveItemArr[i4] = new SimpleInArchiveItemImpl(this, i4);
        }
        return iSimpleInArchiveItemArr;
    }

    @Override // net.sf.sevenzipjbinding.simple.ISimpleInArchive
    public int getNumberOfItems() throws SevenZipException {
        return testAndGetSafeSevenZipInArchive().getNumberOfItems();
    }

    public IInArchive testAndGetSafeSevenZipInArchive() throws SevenZipException {
        if (!this.wasClosed) {
            return this.sevenZipInArchive;
        }
        throw new SevenZipException("Archive was closed");
    }
}
