package net.sf.sevenzipjbinding.impl;

import net.sf.sevenzipjbinding.IOutCreateArchiveBZip2;
import net.sf.sevenzipjbinding.IOutItemBZip2;
import net.sf.sevenzipjbinding.IOutUpdateArchiveBZip2;
/* loaded from: classes7.dex */
public class OutArchiveBZip2Impl extends OutArchiveImpl<IOutItemBZip2> implements IOutCreateArchiveBZip2, IOutUpdateArchiveBZip2 {
    @Override // net.sf.sevenzipjbinding.IOutFeatureSetLevel
    public void setLevel(int i4) {
        featureSetLevel(i4);
    }
}
