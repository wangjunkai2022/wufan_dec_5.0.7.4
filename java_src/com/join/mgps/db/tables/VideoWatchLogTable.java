package com.join.mgps.db.tables;

import com.j256.ormlite.field.DatabaseField;
import java.io.Serializable;
/* loaded from: classes.dex */
public class VideoWatchLogTable implements Serializable {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private int sceneType;
    @DatabaseField
    private int sdkType;
    @DatabaseField
    private int userId;

    public int getId() {
        return this.id;
    }

    public int getSceneType() {
        return this.sceneType;
    }

    public int getSdkType() {
        return this.sdkType;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setSceneType(int i4) {
        this.sceneType = i4;
    }

    public void setSdkType(int i4) {
        this.sdkType = i4;
    }

    public void setUserId(int i4) {
        this.userId = i4;
    }
}
