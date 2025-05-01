package com.join.mgps.dto;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class GameCommitListBean {
    private List<GameCommitList> comment_list;
    private ArrayList<GameTagBean> tagInfo;

    /* loaded from: classes4.dex */
    public static class GameCommitList {
        private String add_time;
        private String avatar_src;
        private int best;
        private boolean bolHaveCommit = true;
        private int commit;
        private int first;
        private boolean is_praise;
        private String member_honor;
        private String message;
        private String nickname;
        private int pid;
        private int praise;
        private int svip_level;
        private int uid;
        private int vip_level;

        public String getAdd_time() {
            return this.add_time;
        }

        public String getAvatar_src() {
            return this.avatar_src;
        }

        public int getBest() {
            return this.best;
        }

        public int getCommit() {
            return this.commit;
        }

        public int getFirst() {
            return this.first;
        }

        public String getMember_honor() {
            return this.member_honor;
        }

        public String getMessage() {
            return this.message;
        }

        public String getNickname() {
            return this.nickname;
        }

        public int getPid() {
            return this.pid;
        }

        public int getPraise() {
            return this.praise;
        }

        public int getSvip_level() {
            return this.svip_level;
        }

        public int getUid() {
            return this.uid;
        }

        public int getVip_level() {
            return this.vip_level;
        }

        public boolean isBolHaveCommit() {
            return this.bolHaveCommit;
        }

        public boolean is_praise() {
            return this.is_praise;
        }

        public void setAdd_time(String str) {
            this.add_time = str;
        }

        public void setAvatar_src(String str) {
            this.avatar_src = str;
        }

        public void setBest(int i4) {
            this.best = i4;
        }

        public void setBolHaveCommit(boolean z4) {
            this.bolHaveCommit = z4;
        }

        public void setCommit(int i4) {
            this.commit = i4;
        }

        public void setFirst(int i4) {
            this.first = i4;
        }

        public void setIs_praise(boolean z4) {
            this.is_praise = z4;
        }

        public void setMember_honor(String str) {
            this.member_honor = str;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setPid(int i4) {
            this.pid = i4;
        }

        public void setPraise(int i4) {
            this.praise = i4;
        }

        public void setSvip_level(int i4) {
            this.svip_level = i4;
        }

        public void setUid(int i4) {
            this.uid = i4;
        }

        public void setVip_level(int i4) {
            this.vip_level = i4;
        }
    }

    public List<GameCommitList> getComment_list() {
        return this.comment_list;
    }

    public ArrayList<GameTagBean> getTagInfo() {
        return this.tagInfo;
    }

    public void setComment_list(List<GameCommitList> list) {
        this.comment_list = list;
    }

    public void setTagInfo(ArrayList<GameTagBean> arrayList) {
        this.tagInfo = arrayList;
    }
}
