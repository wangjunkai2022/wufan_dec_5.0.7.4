package com.join.mgps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
/* loaded from: classes4.dex */
public class OnlineCouponConfigBean implements Serializable, Parcelable {
    public static final Parcelable.Creator<OnlineCouponConfigBean> CREATOR = new Parcelable.Creator<OnlineCouponConfigBean>() { // from class: com.join.mgps.dto.OnlineCouponConfigBean.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OnlineCouponConfigBean createFromParcel(Parcel parcel) {
            return new OnlineCouponConfigBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OnlineCouponConfigBean[] newArray(int i4) {
            return new OnlineCouponConfigBean[i4];
        }
    };
    private boolean gameExitSwitch;
    private boolean gameStartUpSwitch;
    private boolean homePageSwitch;
    private boolean inTimePeriod;
    private int locType;
    private boolean popup;
    private boolean received;
    private String redPacketHint;
    private String redPacketJumpUrl;
    private String redPacketSubHint;
    private String tabHint;
    private String tabJumpUrl;
    private boolean tabSwitch;
    private String timePeriodMark;
    private int uid;

    public OnlineCouponConfigBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getLocType() {
        return this.locType;
    }

    public String getRedPacketHint() {
        return this.redPacketHint;
    }

    public String getRedPacketJumpUrl() {
        return this.redPacketJumpUrl;
    }

    public String getRedPacketSubHint() {
        return this.redPacketSubHint;
    }

    public String getTabHint() {
        return this.tabHint;
    }

    public String getTabJumpUrl() {
        return this.tabJumpUrl;
    }

    public String getTimePeriodMark() {
        return this.timePeriodMark;
    }

    public int getUid() {
        return this.uid;
    }

    public boolean isGameExitSwitch() {
        return this.gameExitSwitch;
    }

    public boolean isGameStartUpSwitch() {
        return this.gameStartUpSwitch;
    }

    public boolean isHomePageSwitch() {
        return this.homePageSwitch;
    }

    public boolean isInTimePeriod() {
        return this.inTimePeriod;
    }

    public boolean isPopup() {
        return this.popup;
    }

    public boolean isReceived() {
        return this.received;
    }

    public boolean isTabSwitch() {
        return this.tabSwitch;
    }

    public void setGameExitSwitch(boolean z4) {
        this.gameExitSwitch = z4;
    }

    public void setGameStartUpSwitch(boolean z4) {
        this.gameStartUpSwitch = z4;
    }

    public void setHomePageSwitch(boolean z4) {
        this.homePageSwitch = z4;
    }

    public void setInTimePeriod(boolean z4) {
        this.inTimePeriod = z4;
    }

    public void setLocType(int i4) {
        this.locType = i4;
    }

    public void setPopup(boolean z4) {
        this.popup = z4;
    }

    public void setReceived(boolean z4) {
        this.received = z4;
    }

    public void setRedPacketHint(String str) {
        this.redPacketHint = str;
    }

    public void setRedPacketJumpUrl(String str) {
        this.redPacketJumpUrl = str;
    }

    public void setRedPacketSubHint(String str) {
        this.redPacketSubHint = str;
    }

    public void setTabHint(String str) {
        this.tabHint = str;
    }

    public void setTabJumpUrl(String str) {
        this.tabJumpUrl = str;
    }

    public void setTabSwitch(boolean z4) {
        this.tabSwitch = z4;
    }

    public void setTimePeriodMark(String str) {
        this.timePeriodMark = str;
    }

    public void setUid(int i4) {
        this.uid = i4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.locType);
        parcel.writeByte(this.popup ? (byte) 1 : (byte) 0);
        parcel.writeString(this.redPacketHint);
        parcel.writeString(this.redPacketSubHint);
        parcel.writeString(this.redPacketJumpUrl);
        parcel.writeString(this.tabJumpUrl);
        parcel.writeString(this.tabHint);
        parcel.writeInt(this.uid);
        parcel.writeByte(this.gameExitSwitch ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.gameStartUpSwitch ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.homePageSwitch ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.tabSwitch ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.inTimePeriod ? (byte) 1 : (byte) 0);
        parcel.writeString(this.timePeriodMark);
        parcel.writeByte(this.received ? (byte) 1 : (byte) 0);
    }

    protected OnlineCouponConfigBean(Parcel parcel) {
        this.locType = parcel.readInt();
        this.popup = parcel.readByte() != 0;
        this.redPacketHint = parcel.readString();
        this.redPacketSubHint = parcel.readString();
        this.redPacketJumpUrl = parcel.readString();
        this.tabJumpUrl = parcel.readString();
        this.tabHint = parcel.readString();
        this.uid = parcel.readInt();
        this.gameExitSwitch = parcel.readByte() != 0;
        this.gameStartUpSwitch = parcel.readByte() != 0;
        this.homePageSwitch = parcel.readByte() != 0;
        this.tabSwitch = parcel.readByte() != 0;
        this.inTimePeriod = parcel.readByte() != 0;
        this.timePeriodMark = parcel.readString();
        this.received = parcel.readByte() != 0;
    }
}
