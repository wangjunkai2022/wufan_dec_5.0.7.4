package com.join.mgps.dto;

import android.content.Context;
import com.join.android.app.common.utils.n;
import com.join.android.app.mgsim.wufun.b;
import com.join.mgps.Util.x1;
import com.papa.sim.statistic.k;
/* loaded from: classes4.dex */
public class RequestModel<E> {
    private String androidId;
    private E args;
    private String channelNum;
    private String deviceId;
    private String sign;
    private String version;
    private String platform = "wufun";
    private String package_type = "wufun";
    private String package_name = "com.join.android.app.mgsim.wufun";
    private int target_version = b.f15663n.intValue();

    public RequestModel() {
    }

    public String getAndroidId() {
        return this.androidId;
    }

    public E getArgs() {
        return this.args;
    }

    public String getChannelNum() {
        return this.channelNum;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getPackage_name() {
        return this.package_name;
    }

    public String getPackage_type() {
        return this.package_type;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getSign() {
        return this.sign;
    }

    public int getTarget_version() {
        return this.target_version;
    }

    public String getVersion() {
        return this.version;
    }

    public RequestModel<E> makeSign() {
        this.sign = x1.h(this);
        return this;
    }

    public void setAndroidId(String str) {
        this.androidId = str;
    }

    public void setArgs(E e5) {
        this.args = e5;
    }

    public void setChannelNum(String str) {
        this.channelNum = str;
    }

    public RequestModel setDefault(Context context) {
        try {
            this.platform = "wufun";
            this.channelNum = k.a(context);
            int y2 = n.n(context).y();
            String z4 = n.n(context).z();
            this.version = y2 + "_" + z4;
            this.deviceId = "";
            this.androidId = "";
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return this;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setPackage_name(String str) {
        this.package_name = str;
    }

    public void setPackage_type(String str) {
        this.package_type = str;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setSign(String str) {
        this.sign = str;
    }

    public void setTarget_version(int i4) {
        this.target_version = i4;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public RequestModel(Context context) {
        setDefault(context);
    }
}
