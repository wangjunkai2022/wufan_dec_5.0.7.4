package net.sf.sevenzipjbinding;

import com.join.mgps.Util.h0;
import net.sf.sevenzipjbinding.impl.OutArchive7zImpl;
import net.sf.sevenzipjbinding.impl.OutArchiveBZip2Impl;
import net.sf.sevenzipjbinding.impl.OutArchiveGZipImpl;
import net.sf.sevenzipjbinding.impl.OutArchiveImpl;
import net.sf.sevenzipjbinding.impl.OutArchiveTarImpl;
import net.sf.sevenzipjbinding.impl.OutArchiveZipImpl;
/* loaded from: classes7.dex */
public enum ArchiveFormat {
    ZIP("Zip", OutArchiveZipImpl.class, true),
    TAR("Tar", OutArchiveTarImpl.class, true),
    SPLIT("Split", true),
    RAR("Rar", true),
    RAR5("Rar5", true),
    LZMA("Lzma", false),
    ISO("Iso", true),
    HFS("HFS", true),
    GZIP("GZip", OutArchiveGZipImpl.class, false),
    CPIO("Cpio", true),
    BZIP2("BZip2", OutArchiveBZip2Impl.class, false),
    SEVEN_ZIP("7z", OutArchive7zImpl.class, true),
    Z("Z", false),
    ARJ("Arj", true),
    CAB("Cab", true),
    LZH("Lzh", true),
    CHM("Chm", true),
    NSIS("Nsis", true),
    AR("Ar", true),
    RPM("Rpm", true),
    UDF("Udf", true),
    WIM("Wim", true),
    XAR("Xar", true),
    FAT("fat", true),
    NTFS("ntfs", true);
    
    private int codecIndex;
    private String methodName;
    Class<? extends OutArchiveImpl<?>> outArchiveImplementation;
    private boolean supportMultipleFiles;

    ArchiveFormat(String str, boolean z4) {
        this(str, null, z4);
    }

    static ArchiveFormat findOutArchiveImplementationToInterface(Class<? extends IOutCreateArchive<?>> cls) throws SevenZipException {
        ArchiveFormat[] values;
        for (ArchiveFormat archiveFormat : values()) {
            Class<? extends OutArchiveImpl<?>> outArchiveImplementation = archiveFormat.getOutArchiveImplementation();
            if (outArchiveImplementation != null && cls.isAssignableFrom(outArchiveImplementation)) {
                return archiveFormat;
            }
        }
        throw new SevenZipException("Can't determine corresponding archive format to the interface " + IOutArchive.class.getSimpleName() + h0.f27805a);
    }

    public String getMethodName() {
        return this.methodName;
    }

    public Class<? extends OutArchiveImpl<?>> getOutArchiveImplementation() {
        return this.outArchiveImplementation;
    }

    public boolean isOutArchiveSupported() {
        return this.outArchiveImplementation != null;
    }

    public boolean supportMultipleFiles() {
        return this.supportMultipleFiles;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.methodName;
    }

    ArchiveFormat(String str, Class cls, boolean z4) {
        this.codecIndex = -2;
        this.methodName = str;
        this.outArchiveImplementation = cls;
        this.supportMultipleFiles = z4;
    }
}
