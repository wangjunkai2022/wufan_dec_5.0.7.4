package com.join.mgps.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class InformationCommentBeanV2 implements Serializable {
    private String avatar;
    private String commentId;
    private String createTime;
    private String id;
    private int like;
    private String msg;
    private String nickname;
    private String pid;
    private String postCid;
    private Boolean praise;
    private String ravatar;
    private int replies;
    private int reply;
    private List<InformationCommentBeanV2> replyList;
    private String rnickname;
    private String ruid;
    private int status;
    private String uid;

    public InformationCommentBeanV2() {
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getCommentId() {
        return this.commentId;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getId() {
        return this.id;
    }

    public int getLike() {
        return this.like;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getPid() {
        return this.pid;
    }

    public String getPostCid() {
        return this.postCid;
    }

    public Boolean getPraise() {
        return this.praise;
    }

    public String getRavatar() {
        return this.ravatar;
    }

    public int getReplies() {
        return this.replies;
    }

    public int getReply() {
        return this.reply;
    }

    public List<InformationCommentBeanV2> getReplyList() {
        return this.replyList;
    }

    public String getRnickname() {
        return this.rnickname;
    }

    public String getRuid() {
        return this.ruid;
    }

    public int getStatus() {
        return this.status;
    }

    public String getUid() {
        return this.uid;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setCommentId(String str) {
        this.commentId = str;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLike(int i4) {
        this.like = i4;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setPid(String str) {
        this.pid = str;
    }

    public void setPostCid(String str) {
        this.postCid = str;
    }

    public void setPraise(Boolean bool) {
        this.praise = bool;
    }

    public void setRavatar(String str) {
        this.ravatar = str;
    }

    public void setReplies(int i4) {
        this.replies = i4;
    }

    public void setReply(int i4) {
        this.reply = i4;
    }

    public void setReplyList(List<InformationCommentBeanV2> list) {
        this.replyList = list;
    }

    public void setRnickname(String str) {
        this.rnickname = str;
    }

    public void setRuid(String str) {
        this.ruid = str;
    }

    public void setStatus(int i4) {
        this.status = i4;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public InformationCommentBeanV2(InformationCommentBeanV2 informationCommentBeanV2) {
        this.avatar = informationCommentBeanV2.getAvatar();
        this.commentId = informationCommentBeanV2.getCommentId();
        this.createTime = informationCommentBeanV2.getCreateTime();
        this.id = informationCommentBeanV2.getId();
        this.like = informationCommentBeanV2.getLike();
        this.msg = informationCommentBeanV2.getMsg();
        this.nickname = informationCommentBeanV2.getNickname();
        this.pid = informationCommentBeanV2.getPid();
        this.postCid = informationCommentBeanV2.getPostCid();
        this.praise = informationCommentBeanV2.getPraise();
        this.ravatar = informationCommentBeanV2.getRavatar();
        this.replies = informationCommentBeanV2.getReplies();
        this.reply = informationCommentBeanV2.getReply();
        this.rnickname = informationCommentBeanV2.getRnickname();
        this.ruid = informationCommentBeanV2.getRuid();
        this.status = informationCommentBeanV2.getStatus();
        this.uid = informationCommentBeanV2.getUid();
        if (this.replyList == null) {
            this.replyList = new ArrayList();
        }
        this.replyList.addAll(informationCommentBeanV2.getReplyList());
    }
}
