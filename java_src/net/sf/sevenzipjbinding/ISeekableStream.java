package net.sf.sevenzipjbinding;
/* loaded from: classes7.dex */
public interface ISeekableStream {
    public static final int SEEK_CUR = 1;
    public static final int SEEK_END = 2;
    public static final int SEEK_SET = 0;

    long seek(long j4, int i4) throws SevenZipException;
}
