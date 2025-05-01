package com.join.mgps.dto;
/* loaded from: classes4.dex */
public class ArchiveNumDataBean {
    private int code;
    private DataInfoBean data_info;
    private String msg;
    private int succ;

    /* loaded from: classes4.dex */
    public static class DataInfoBean {
        private int archiveCoin;
        private int archiveNum;
        private String bgImg;
        private int hasNoComment;
        private int marketNum;
        private int pid;
        private String title;
        private String vipLink;

        public int getArchiveCoin() {
            return this.archiveCoin;
        }

        public int getArchiveNum() {
            return this.archiveNum;
        }

        public String getBgImg() {
            return this.bgImg;
        }

        public int getHasNoComment() {
            return this.hasNoComment;
        }

        public int getMarketNum() {
            return this.marketNum;
        }

        public int getPid() {
            return this.pid;
        }

        public String getTitle() {
            return this.title;
        }

        public String getVipLink() {
            return this.vipLink;
        }

        public void setArchiveCoin(int i4) {
            this.archiveCoin = i4;
        }

        public void setArchiveNum(int i4) {
            this.archiveNum = i4;
        }

        public void setBgImg(String str) {
            this.bgImg = str;
        }

        public void setHasNoComment(int i4) {
            this.hasNoComment = i4;
        }

        public void setMarketNum(int i4) {
            this.marketNum = i4;
        }

        public void setPid(int i4) {
            this.pid = i4;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setVipLink(String str) {
            this.vipLink = str;
        }
    }

    public int getCode() {
        return this.code;
    }

    public DataInfoBean getData_info() {
        return this.data_info;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getSucc() {
        return this.succ;
    }

    public void setCode(int i4) {
        this.code = i4;
    }

    public void setData_info(DataInfoBean dataInfoBean) {
        this.data_info = dataInfoBean;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setSucc(int i4) {
        this.succ = i4;
    }
}
