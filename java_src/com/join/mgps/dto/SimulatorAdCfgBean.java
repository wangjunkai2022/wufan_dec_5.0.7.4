package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class SimulatorAdCfgBean extends BaseBean {
    private int ad_num = 0;
    private int daily_times;
    private int id;
    private int interval_times;
    private SimulatorGoldAdCfgBean open_cfg;
    private List<PlayCfgBean> play_cfg;
    private int show_times;
    private int switch_state;
    private SimulatorGoldAdCfgBean un_open_cfg;
    private List<PlayCfgBean> un_play_cfg;

    public SimulatorAdPlayRecord findCanPlayRecord(List<SimulatorAdPlayRecord> list, int i4) {
        if (list != null) {
            for (SimulatorAdPlayRecord simulatorAdPlayRecord : list) {
                if (simulatorAdPlayRecord.typeOf(i4)) {
                    return simulatorAdPlayRecord;
                }
            }
        }
        return null;
    }

    public int getAd_num() {
        return this.ad_num;
    }

    public int getDaily_times() {
        return this.daily_times;
    }

    public int getId() {
        return this.id;
    }

    public int getInterval_times() {
        return this.interval_times;
    }

    public SimulatorGoldAdCfgBean getOpen_cfg() {
        return this.open_cfg;
    }

    public PlayCfgBean getPlayCfgBean(List<PlayCfgBean> list, int i4) {
        if (list != null) {
            for (PlayCfgBean playCfgBean : list) {
                if (playCfgBean.getSdk_type() == i4) {
                    return playCfgBean;
                }
            }
        }
        return null;
    }

    public List<PlayCfgBean> getPlay_cfg() {
        return this.play_cfg;
    }

    public int getShow_times() {
        return this.show_times;
    }

    public int getSwitch_state() {
        return this.switch_state;
    }

    public SimulatorGoldAdCfgBean getUn_open_cfg() {
        return this.un_open_cfg;
    }

    public List<PlayCfgBean> getUn_play_cfg() {
        return this.un_play_cfg;
    }

    public void setAd_num(int i4) {
        this.ad_num = i4;
    }

    public void setDaily_times(Integer num) {
        this.daily_times = num.intValue();
    }

    public void setId(int i4) {
        this.id = i4;
    }

    public void setInterval_times(int i4) {
        this.interval_times = i4;
    }

    public void setOpen_cfg(SimulatorGoldAdCfgBean simulatorGoldAdCfgBean) {
        this.open_cfg = simulatorGoldAdCfgBean;
    }

    public void setPlay_cfg(List<PlayCfgBean> list) {
        this.play_cfg = list;
    }

    public void setShow_times(int i4) {
        this.show_times = i4;
    }

    public void setSwitch_state(int i4) {
        this.switch_state = i4;
    }

    public void setUn_open_cfg(SimulatorGoldAdCfgBean simulatorGoldAdCfgBean) {
        this.un_open_cfg = simulatorGoldAdCfgBean;
    }

    public void setUn_play_cfg(List<PlayCfgBean> list) {
        this.un_play_cfg = list;
    }

    public SimulatorAdPlayRecord findCanPlayRecord(List<SimulatorAdPlayRecord> list) {
        if (list != null) {
            for (SimulatorAdPlayRecord simulatorAdPlayRecord : list) {
                if (simulatorAdPlayRecord.canPlay()) {
                    return simulatorAdPlayRecord;
                }
            }
        }
        return null;
    }

    public PlayCfgBean getPlayCfgBean(List<PlayCfgBean> list, List<SimulatorAdPlayRecord> list2) {
        if (list != null) {
            SimulatorAdPlayRecord findCanPlayRecord = findCanPlayRecord(list2);
            if (findCanPlayRecord != null) {
                for (PlayCfgBean playCfgBean : list) {
                    if (findCanPlayRecord.typeOf(playCfgBean.getSdk_type())) {
                        return playCfgBean;
                    }
                }
                return null;
            }
            for (PlayCfgBean playCfgBean2 : list) {
                if (findCanPlayRecord(list2, playCfgBean2.getSdk_type()) == null) {
                    return playCfgBean2;
                }
            }
            return null;
        }
        return null;
    }

    public PlayCfgBean getPlayCfgBean(List<PlayCfgBean> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }
}
