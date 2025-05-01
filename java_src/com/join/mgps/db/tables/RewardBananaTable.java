package com.join.mgps.db.tables;

import com.j256.ormlite.field.DatabaseField;
/* loaded from: classes.dex */
public class RewardBananaTable {
    @DatabaseField
    private int amount;
    @DatabaseField
    private String gameId;
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private int status;
    @DatabaseField(defaultValue = "1")
    private int times;
    @DatabaseField
    private long timestamp;
    @DatabaseField
    private boolean tourist;
    @DatabaseField
    private int type;
    @DatabaseField
    private String uid;
    @DatabaseField
    private String uniqueId;

    public int getAmount() {
        return this.amount;
    }

    public String getGameId() {
        return this.gameId;
    }

    public int getId() {
        return this.id;
    }

    public int getStatus() {
        return this.status;
    }

    public int getTimes() {
        return this.times;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int getType() {
        return this.type;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public boolean isTourist() {
        return this.tourist;
    }

    public void setAmount(int i4) {
        this.amount = i4;
    }

    public void setGameId(String str) {
        this.gameId = str;
    }

    public void setId(int i4) {
        this.id = i4;
    }

    public void setStatus(int i4) {
        this.status = i4;
    }

    public void setTimes(int i4) {
        this.times = i4;
    }

    public void setTimestamp(long j4) {
        this.timestamp = j4;
    }

    public void setTourist(boolean z4) {
        this.tourist = z4;
    }

    public void setType(int i4) {
        this.type = i4;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUniqueId(String str) {
        this.uniqueId = str;
    }
}
