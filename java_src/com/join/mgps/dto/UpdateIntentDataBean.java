package com.join.mgps.dto;

import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.mgps.db.tables.EMUApkTable;
import java.io.Serializable;
/* loaded from: classes4.dex */
public class UpdateIntentDataBean implements Serializable {
    private DownloadTask downloadTask;
    private EMUApkTable emuApkTable;
    private boolean isFight;
    private boolean peizhiMustUpdate;
    private boolean peizhiNewUpdate;
    private boolean romeMustUpdate;
    private boolean romeNewUpdate;
    private boolean sourceMustUpdate;
    private boolean sourceNewUpdate;

    public UpdateIntentDataBean() {
    }

    public DownloadTask getDownloadTask() {
        return this.downloadTask;
    }

    public EMUApkTable getEmuApkTable() {
        return this.emuApkTable;
    }

    public boolean isFight() {
        return this.isFight;
    }

    public boolean isPeizhiMustUpdate() {
        return this.peizhiMustUpdate;
    }

    public boolean isPeizhiNewUpdate() {
        return this.peizhiNewUpdate;
    }

    public boolean isRomeMustUpdate() {
        return this.romeMustUpdate;
    }

    public boolean isRomeNewUpdate() {
        return this.romeNewUpdate;
    }

    public boolean isSourceMustUpdate() {
        return this.sourceMustUpdate;
    }

    public boolean isSourceNewUpdate() {
        return this.sourceNewUpdate;
    }

    public void setDownloadTask(DownloadTask downloadTask) {
        this.downloadTask = downloadTask;
    }

    public void setEmuApkTable(EMUApkTable eMUApkTable) {
        this.emuApkTable = eMUApkTable;
    }

    public void setFight(boolean z4) {
        this.isFight = z4;
    }

    public void setPeizhiMustUpdate(boolean z4) {
        this.peizhiMustUpdate = z4;
    }

    public void setPeizhiNewUpdate(boolean z4) {
        this.peizhiNewUpdate = z4;
    }

    public void setRomeMustUpdate(boolean z4) {
        this.romeMustUpdate = z4;
    }

    public void setRomeNewUpdate(boolean z4) {
        this.romeNewUpdate = z4;
    }

    public void setSourceMustUpdate(boolean z4) {
        this.sourceMustUpdate = z4;
    }

    public void setSourceNewUpdate(boolean z4) {
        this.sourceNewUpdate = z4;
    }

    public UpdateIntentDataBean(boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, DownloadTask downloadTask, EMUApkTable eMUApkTable, boolean z10) {
        this.romeMustUpdate = z4;
        this.romeNewUpdate = z5;
        this.peizhiMustUpdate = z6;
        this.peizhiNewUpdate = z7;
        this.sourceMustUpdate = z8;
        this.sourceNewUpdate = z9;
        this.downloadTask = downloadTask;
        this.emuApkTable = eMUApkTable;
        this.isFight = z10;
    }
}
