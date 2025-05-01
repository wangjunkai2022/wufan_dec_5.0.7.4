package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class FileInfo implements Serializable {
    public static final int FILE_TYPE_APK = 2;
    public static final int FILE_TYPE_UNKNOWN = 0;
    public static final int FILE_TYPE_ZIP = 3;
    public static final int FILE_TYPE_ZIP_APK = 1;
    private int fileType = 0;
    public String path;
    public String pkg;
    public long size;
    public long time;
    public String title;
    public int versionCode;
    public String versionName;

    public int getFileType() {
        return this.fileType;
    }

    public String getPath() {
        return this.path;
    }

    public String getPkg() {
        return this.pkg;
    }

    public long getSize() {
        return this.size;
    }

    public long getTime() {
        return this.time;
    }

    public String getTitle() {
        return this.title;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public void setFileType(int i4) {
        this.fileType = i4;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPkg(String str) {
        this.pkg = str;
    }

    public void setSize(long j4) {
        this.size = j4;
    }

    public void setTime(long j4) {
        this.time = j4;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setVersionCode(int i4) {
        this.versionCode = i4;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }

    public String toString() {
        return "FileInfo{pkg='" + this.pkg + "', versionName='" + this.versionName + "', versionCode=" + this.versionCode + ", size=" + this.size + ", time=" + this.time + ", path='" + this.path + "', title='" + this.title + "'}";
    }
}
