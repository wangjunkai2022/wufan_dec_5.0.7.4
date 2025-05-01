package net.sf.sevenzipjbinding;
/* loaded from: classes7.dex */
public interface IOutItemBase {
    ArchiveFormat getArchiveFormat();

    Long getDataSize();

    int getIndex();

    IOutArchive<?> getOutArchive();

    Boolean getUpdateIsNewData();

    Boolean getUpdateIsNewProperties();

    Integer getUpdateOldArchiveItemIndex();

    void setDataSize(Long l4);

    void setUpdateIsNewData(Boolean bool);

    void setUpdateIsNewProperties(Boolean bool);

    void setUpdateOldArchiveItemIndex(Integer num);
}
