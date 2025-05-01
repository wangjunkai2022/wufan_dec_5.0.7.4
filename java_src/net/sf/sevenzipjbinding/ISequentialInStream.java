package net.sf.sevenzipjbinding;

import java.io.Closeable;
/* loaded from: classes7.dex */
public interface ISequentialInStream extends Closeable {
    int read(byte[] bArr) throws SevenZipException;
}
