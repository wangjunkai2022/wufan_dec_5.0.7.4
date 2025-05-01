package net.sf.sevenzipjbinding;

import java.util.Date;
/* loaded from: classes7.dex */
public interface IOutItemZip extends IOutItemBase {
    Integer getPropertyAttributes();

    Date getPropertyCreationTime();

    Boolean getPropertyIsDir();

    Date getPropertyLastAccessTime();

    Date getPropertyLastModificationTime();

    String getPropertyPath();

    void setPropertyAttributes(Integer num);

    void setPropertyCreationTime(Date date);

    void setPropertyIsDir(Boolean bool);

    void setPropertyLastAccessTime(Date date);

    void setPropertyLastModificationTime(Date date);

    void setPropertyPath(String str);
}
