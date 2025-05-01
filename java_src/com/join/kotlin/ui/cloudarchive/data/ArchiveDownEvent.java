package com.join.kotlin.ui.cloudarchive.data;
/* loaded from: classes3.dex */
public class ArchiveDownEvent {
    ArchiveData archiveData;
    int status;

    public ArchiveDownEvent(int i4, ArchiveData archiveData) {
        this.status = i4;
        this.archiveData = archiveData;
    }

    public ArchiveData getArchiveData() {
        return this.archiveData;
    }

    public int getStatus() {
        return this.status;
    }

    public void setArchiveData(ArchiveData archiveData) {
        this.archiveData = archiveData;
    }

    public void setStatus(int i4) {
        this.status = i4;
    }
}
