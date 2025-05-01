package com.join.mgps.dto;

import com.join.android.app.common.utils.JsonMapper;
import com.psk.eventmodule.StatFactory;
import java.io.Serializable;
/* loaded from: classes4.dex */
public class DownloadPointBase implements Serializable {
    private String ext;
    private String ext1;
    private String ext2;
    private String ext3;
    private String ext4;
    private boolean isFromRecomDown;
    private String nodeId;
    private StatFactory.VolcanoOther position_path;
    private String where;
    private int _from = 0;
    private int _from_type = 0;
    private String recPosition = "";
    private String reMarks = "";

    public String getExt() {
        return this.ext;
    }

    public String getExt1() {
        return this.ext1;
    }

    public String getExt2() {
        return this.ext2;
    }

    public String getExt3() {
        return this.ext3;
    }

    public String getExt4() {
        return this.ext4;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public StatFactory.VolcanoOther getPosition_path() {
        return this.position_path;
    }

    public String getReMarks() {
        return this.reMarks;
    }

    public String getRecPosition() {
        return this.recPosition;
    }

    public String getVolcanoOtherJsonStr() {
        return this.position_path != null ? JsonMapper.getInstance().toJson(this.position_path) : "";
    }

    public String getWhere() {
        return this.where;
    }

    public int get_from() {
        return this._from;
    }

    public int get_from_type() {
        return this._from_type;
    }

    public boolean isFromRecomDown() {
        return this.isFromRecomDown;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public void setExt1(String str) {
        this.ext1 = str;
    }

    public void setExt2(String str) {
        this.ext2 = str;
    }

    public void setExt3(String str) {
        this.ext3 = str;
    }

    public void setExt4(String str) {
        this.ext4 = str;
    }

    public void setFromRecomDown(boolean z4) {
        this.isFromRecomDown = z4;
    }

    public void setNodeId(String str) {
        this.nodeId = str;
    }

    public void setPosition_path(StatFactory.VolcanoOther volcanoOther) {
        this.position_path = volcanoOther;
    }

    public void setReMarks(String str) {
        this.reMarks = str;
    }

    public void setRecPosition(String str) {
        this.recPosition = str;
    }

    public void setWhere(String str) {
        this.where = str;
    }

    public void set_from(int i4) {
        this._from = i4;
    }

    public void set_from_type(int i4) {
        this._from_type = i4;
    }
}
