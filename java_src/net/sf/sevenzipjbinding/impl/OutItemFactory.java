package net.sf.sevenzipjbinding.impl;

import java.util.Date;
import net.sf.sevenzipjbinding.ArchiveFormat;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.IOutArchive;
import net.sf.sevenzipjbinding.IOutItem7z;
import net.sf.sevenzipjbinding.IOutItemBZip2;
import net.sf.sevenzipjbinding.IOutItemBase;
import net.sf.sevenzipjbinding.IOutItemGZip;
import net.sf.sevenzipjbinding.IOutItemTar;
import net.sf.sevenzipjbinding.IOutItemZip;
import net.sf.sevenzipjbinding.PropID;
import net.sf.sevenzipjbinding.SevenZipException;
/* loaded from: classes7.dex */
public class OutItemFactory<T extends IOutItemBase> {
    private static final Long ZERO = 0L;
    private int index;
    private IOutArchive<?> outArchive;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.sf.sevenzipjbinding.impl.OutItemFactory$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$sf$sevenzipjbinding$ArchiveFormat;

        static {
            int[] iArr = new int[ArchiveFormat.values().length];
            $SwitchMap$net$sf$sevenzipjbinding$ArchiveFormat = iArr;
            try {
                iArr[ArchiveFormat.SEVEN_ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$sf$sevenzipjbinding$ArchiveFormat[ArchiveFormat.ZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$sf$sevenzipjbinding$ArchiveFormat[ArchiveFormat.BZIP2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$sf$sevenzipjbinding$ArchiveFormat[ArchiveFormat.GZIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$net$sf$sevenzipjbinding$ArchiveFormat[ArchiveFormat.TAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    OutItemFactory(IOutArchive<?> iOutArchive, int i4) {
        this.outArchive = iOutArchive;
        this.index = i4;
    }

    private OutItem createOutItemIntern() {
        OutItem outItem = new OutItem(this.outArchive, this.index);
        fillDefaultValues(outItem);
        return outItem;
    }

    private void fillDefaultValues(OutItem outItem) {
        if (this.outArchive.getConnectedInArchive() != null) {
            outItem.setUpdateOldArchiveItemIndex(-1);
            Boolean bool = Boolean.TRUE;
            outItem.setUpdateIsNewData(bool);
            outItem.setUpdateIsNewProperties(bool);
        }
        outItem.setDataSize(ZERO);
        outItem.setPropertyLastModificationTime(new Date());
        int i4 = AnonymousClass1.$SwitchMap$net$sf$sevenzipjbinding$ArchiveFormat[outItem.getArchiveFormat().ordinal()];
        if (i4 == 1) {
            fillDefaultValues7z(outItem);
        } else if (i4 == 2) {
            fillDefaultValuesZip(outItem);
        } else if (i4 == 3) {
            fillDefaultValuesBZip2(outItem);
        } else if (i4 == 4) {
            fillDefaultValuesGZip(outItem);
        } else if (i4 == 5) {
            fillDefaultValuesTar(outItem);
        } else {
            throw new RuntimeException("No default values strategy for the archive format '" + outItem.getArchiveFormat() + "'");
        }
    }

    private void fillDefaultValues7z(IOutItem7z iOutItem7z) {
        Boolean bool = Boolean.FALSE;
        iOutItem7z.setPropertyIsAnti(bool);
        iOutItem7z.setPropertyIsDir(bool);
        iOutItem7z.setPropertyAttributes(0);
    }

    private void fillDefaultValuesBZip2(IOutItemBZip2 iOutItemBZip2) {
    }

    private void fillDefaultValuesGZip(IOutItemGZip iOutItemGZip) {
    }

    private void fillDefaultValuesTar(IOutItemTar iOutItemTar) {
        iOutItemTar.setPropertyIsDir(Boolean.FALSE);
    }

    private void fillDefaultValuesZip(IOutItemZip iOutItemZip) {
        iOutItemZip.setPropertyIsDir(Boolean.FALSE);
        iOutItemZip.setPropertyAttributes(0);
    }

    public T createOutItem() {
        return createOutItemIntern();
    }

    public T createOutItemAndCloneProperties(int i4) throws SevenZipException {
        IInArchive connectedInArchive = this.outArchive.getConnectedInArchive();
        if (connectedInArchive != null) {
            OutItem createOutItemIntern = createOutItemIntern();
            createOutItemIntern.setUpdateOldArchiveItemIndex(Integer.valueOf(i4));
            createOutItemIntern.setUpdateIsNewData(Boolean.FALSE);
            createOutItemIntern.setUpdateIsNewProperties(Boolean.TRUE);
            createOutItemIntern.setPropertyPath((String) connectedInArchive.getProperty(i4, PropID.PATH));
            createOutItemIntern.setPropertyAttributes((Integer) connectedInArchive.getProperty(i4, PropID.ATTRIBUTES));
            createOutItemIntern.setPropertyPosixAttributes((Integer) connectedInArchive.getProperty(i4, PropID.POSIX_ATTRIB));
            createOutItemIntern.setPropertyUser((String) connectedInArchive.getProperty(i4, PropID.USER));
            createOutItemIntern.setPropertyGroup((String) connectedInArchive.getProperty(i4, PropID.GROUP));
            createOutItemIntern.setPropertyCreationTime((Date) connectedInArchive.getProperty(i4, PropID.CREATION_TIME));
            createOutItemIntern.setPropertyLastModificationTime((Date) connectedInArchive.getProperty(i4, PropID.LAST_MODIFICATION_TIME));
            createOutItemIntern.setPropertyLastAccessTime((Date) connectedInArchive.getProperty(i4, PropID.LAST_ACCESS_TIME));
            createOutItemIntern.setPropertyIsAnti((Boolean) connectedInArchive.getProperty(i4, PropID.IS_ANTI));
            createOutItemIntern.setPropertyIsDir((Boolean) connectedInArchive.getProperty(i4, PropID.IS_FOLDER));
            return createOutItemIntern;
        }
        throw new RuntimeException("Not an update operation");
    }

    public T createOutItem(int i4) throws SevenZipException {
        if (this.outArchive.getConnectedInArchive() != null) {
            OutItem createOutItemIntern = createOutItemIntern();
            createOutItemIntern.setUpdateOldArchiveItemIndex(Integer.valueOf(i4));
            Boolean bool = Boolean.FALSE;
            createOutItemIntern.setUpdateIsNewData(bool);
            createOutItemIntern.setUpdateIsNewProperties(bool);
            return createOutItemIntern;
        }
        throw new RuntimeException("Not an update operation");
    }
}
