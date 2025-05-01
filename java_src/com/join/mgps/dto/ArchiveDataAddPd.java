package com.join.mgps.dto;

import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import java.util.List;
/* loaded from: classes4.dex */
public class ArchiveDataAddPd {
    private List<ArchiveData> cloud_archives;
    private DomainInfoBean pd_info;

    public List<ArchiveData> getCloud_archives() {
        return this.cloud_archives;
    }

    public DomainInfoBean getPd_info() {
        return this.pd_info;
    }

    public void setCloud_archives(List<ArchiveData> list) {
        this.cloud_archives = list;
    }

    public void setPd_info(DomainInfoBean domainInfoBean) {
        this.pd_info = domainInfoBean;
    }
}
