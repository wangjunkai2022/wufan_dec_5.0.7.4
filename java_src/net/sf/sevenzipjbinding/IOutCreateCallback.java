package net.sf.sevenzipjbinding;

import net.sf.sevenzipjbinding.IOutItemBase;
import net.sf.sevenzipjbinding.impl.OutItemFactory;
/* loaded from: classes7.dex */
public interface IOutCreateCallback<T extends IOutItemBase> extends IProgress {
    T getItemInformation(int i4, OutItemFactory<T> outItemFactory) throws SevenZipException;

    ISequentialInStream getStream(int i4) throws SevenZipException;

    void setOperationResult(boolean z4) throws SevenZipException;
}
