package net.sf.sevenzipjbinding.simple;

import net.sf.sevenzipjbinding.SevenZipException;
/* loaded from: classes7.dex */
public interface ISimpleInArchive {
    void close() throws SevenZipException;

    ISimpleInArchiveItem getArchiveItem(int i4) throws SevenZipException;

    ISimpleInArchiveItem[] getArchiveItems() throws SevenZipException;

    int getNumberOfItems() throws SevenZipException;
}
