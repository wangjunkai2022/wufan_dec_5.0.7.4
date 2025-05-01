package com.join.mgps.dto;

import com.MApplication;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.Util.g2;
/* loaded from: classes4.dex */
public class PdAdCfgBean {
    private int download_limit;
    private int download_show_times;
    private long lastUpdateConfigTime;
    private int simulator_startup_popup_limit;
    private int simulator_startup_show_times;
    private int single_show_times;
    private int single_startup_limit;
    private int startup_limit;

    public static PdAdCfgBean convertStr2Bean(String str) {
        if (g2.h(str)) {
            return null;
        }
        try {
            return (PdAdCfgBean) JsonMapper.getInstance().fromJson(str, PdAdCfgBean.class);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public boolean canShowDownload() {
        return this.download_show_times < this.download_limit;
    }

    public boolean canShowSimulatorPopup() {
        return this.simulator_startup_show_times < this.simulator_startup_popup_limit;
    }

    public boolean canShowSingleStartUp() {
        return this.single_show_times < this.single_startup_limit;
    }

    public boolean canShowStartUp(int i4) {
        return i4 < this.startup_limit;
    }

    public int getDownload_limit() {
        return this.download_limit;
    }

    public int getDownload_show_times() {
        return this.download_show_times;
    }

    public long getLastUpdateConfigTime() {
        return this.lastUpdateConfigTime;
    }

    public int getSimulator_startup_popup_limit() {
        return this.simulator_startup_popup_limit;
    }

    public int getSimulator_startup_show_times() {
        return this.simulator_startup_show_times;
    }

    public int getSingle_show_times() {
        return this.single_show_times;
    }

    public int getSingle_startup_limit() {
        return this.single_startup_limit;
    }

    public int getStartup_limit() {
        return this.startup_limit;
    }

    public void setDownload_limit(int i4) {
        this.download_limit = i4;
    }

    public void setDownload_show_times(int i4) {
        this.download_show_times = i4;
    }

    public void setLastUpdateConfigTime(long j4) {
        this.lastUpdateConfigTime = j4;
    }

    public void setSimulator_startup_popup_limit(int i4) {
        this.simulator_startup_popup_limit = i4;
    }

    public void setSimulator_startup_show_times(int i4) {
        this.simulator_startup_show_times = i4;
    }

    public void setSingle_show_times(int i4) {
        this.single_show_times = i4;
    }

    public void setSingle_startup_limit(int i4) {
        this.single_startup_limit = i4;
    }

    public void setStartup_limit(int i4) {
        this.startup_limit = i4;
    }

    public void updateDownloadShowTimes() {
        this.download_show_times++;
        MApplication.f1497x.l().pd_ad_config().g(JsonMapper.toJsonString(this));
    }

    public void updateSimulatorPopupShowTimes() {
        this.simulator_startup_show_times++;
        MApplication.f1497x.l().pd_ad_config().g(JsonMapper.toJsonString(this));
    }

    public void updateSingleShowTimes() {
        this.single_show_times++;
        MApplication.f1497x.l().pd_ad_config().g(JsonMapper.toJsonString(this));
    }
}
