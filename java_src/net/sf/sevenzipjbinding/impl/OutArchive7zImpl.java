package net.sf.sevenzipjbinding.impl;

import net.sf.sevenzipjbinding.IOutCreateArchive7z;
import net.sf.sevenzipjbinding.IOutItem7z;
import net.sf.sevenzipjbinding.IOutUpdateArchive7z;
import net.sf.sevenzipjbinding.SevenZipException;
/* loaded from: classes7.dex */
public class OutArchive7zImpl extends OutArchiveImpl<IOutItem7z> implements IOutCreateArchive7z, IOutUpdateArchive7z {
    private boolean solidExtension;
    private boolean solid = true;
    private int countOfFilesPerBlock = -1;
    private long countOfBytesPerBlock = -1;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.sf.sevenzipjbinding.impl.OutArchiveImpl
    public void applyFeatures() throws SevenZipException {
        super.applyFeatures();
        StringBuilder sb = new StringBuilder();
        if (this.solidExtension) {
            sb.append("E");
        }
        int i4 = this.countOfFilesPerBlock;
        if (i4 != -1) {
            sb.append(i4);
            sb.append("F");
        }
        long j4 = this.countOfBytesPerBlock;
        if (j4 != -1) {
            sb.append(j4);
            sb.append("B");
        }
        if (sb.length() > 0) {
            nativeSetSolidSpec(sb.toString());
        }
        if (this.solid) {
            return;
        }
        nativeSetSolidSpec(null);
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetEncryptHeader
    public void setHeaderEncryption(boolean z4) throws SevenZipException {
        featureSetHeaderEncryption(z4);
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetLevel
    public void setLevel(int i4) {
        featureSetLevel(i4);
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetSolid
    public void setSolid(boolean z4) {
        this.solid = z4;
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetSolid
    public void setSolidExtension(boolean z4) {
        this.solidExtension = z4;
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetSolid
    public void setSolidFiles(int i4) {
        this.countOfFilesPerBlock = i4;
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetSolid
    public void setSolidSize(long j4) {
        this.countOfBytesPerBlock = j4;
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetMultithreading
    public void setThreadCount(int i4) {
        featureSetThreadCount(i4);
    }
}
