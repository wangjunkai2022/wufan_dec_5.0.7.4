package net.sf.sevenzipjbinding;
/* loaded from: classes7.dex */
public interface IArchiveOpenVolumeCallback {
    Object getProperty(PropID propID) throws SevenZipException;

    IInStream getStream(String str) throws SevenZipException;
}
