package com.join.mgps.dto;

import java.util.List;
/* loaded from: classes4.dex */
public class ConfigData {
    boolean anti_addiction_switch;
    boolean b_side;
    String client_ip;
    boolean download_game_switch;
    FirstScreenAdInteractionBean first_screen_ad_interaction;
    private FoundGameTabBean found_game_tab;
    boolean home_page_video_switch;
    boolean launch_game_switch;
    private int net_game_count_down;
    boolean non_online_user_switch;
    private PdAdCfgBean pd_ad_cfg;
    List<String> real_name_black_list;
    boolean unknown_source_state;
    private boolean w_channel_info_switch = true;
    private WebDiskCfg web_disk_cfg;
    private WebDiskPositionBean web_disk_position;
    String wx_open_appid;

    public String getClient_ip() {
        return this.client_ip;
    }

    public FirstScreenAdInteractionBean getFirst_screen_ad_interaction() {
        return this.first_screen_ad_interaction;
    }

    public FoundGameTabBean getFound_game_tab() {
        return this.found_game_tab;
    }

    public int getNet_game_count_down() {
        return this.net_game_count_down;
    }

    public PdAdCfgBean getPd_ad_cfg() {
        return this.pd_ad_cfg;
    }

    public List<String> getReal_name_black_list() {
        return this.real_name_black_list;
    }

    public WebDiskCfg getWeb_disk_cfg() {
        return this.web_disk_cfg;
    }

    public WebDiskPositionBean getWeb_disk_position() {
        return this.web_disk_position;
    }

    public String getWx_open_appid() {
        return this.wx_open_appid;
    }

    public boolean isAnti_addiction_switch() {
        return this.anti_addiction_switch;
    }

    public boolean isB_side() {
        return this.b_side;
    }

    public boolean isDownload_game_switch() {
        return this.download_game_switch;
    }

    public boolean isHome_page_video_switch() {
        return this.home_page_video_switch;
    }

    public boolean isLaunch_game_switch() {
        return this.launch_game_switch;
    }

    public boolean isNon_online_user_switch() {
        return this.non_online_user_switch;
    }

    public boolean isUnknown_source_state() {
        return this.unknown_source_state;
    }

    public boolean isW_channel_info_switch() {
        return this.w_channel_info_switch;
    }

    public void setAnti_addiction_switch(boolean z4) {
        this.anti_addiction_switch = z4;
    }

    public void setB_side(boolean z4) {
        this.b_side = z4;
    }

    public void setClient_ip(String str) {
        this.client_ip = str;
    }

    public void setDownload_game_switch(boolean z4) {
        this.download_game_switch = z4;
    }

    public void setFirst_screen_ad_interaction(FirstScreenAdInteractionBean firstScreenAdInteractionBean) {
        this.first_screen_ad_interaction = firstScreenAdInteractionBean;
    }

    public void setFound_game_tab(FoundGameTabBean foundGameTabBean) {
        this.found_game_tab = foundGameTabBean;
    }

    public void setHome_page_video_switch(boolean z4) {
        this.home_page_video_switch = z4;
    }

    public void setLaunch_game_switch(boolean z4) {
        this.launch_game_switch = z4;
    }

    public void setNet_game_count_down(int i4) {
        this.net_game_count_down = i4;
    }

    public void setNon_online_user_switch(boolean z4) {
        this.non_online_user_switch = z4;
    }

    public void setPd_ad_cfg(PdAdCfgBean pdAdCfgBean) {
        this.pd_ad_cfg = pdAdCfgBean;
    }

    public void setReal_name_black_list(List<String> list) {
        this.real_name_black_list = list;
    }

    public void setUnknown_source_state(boolean z4) {
        this.unknown_source_state = z4;
    }

    public void setW_channel_info_switch(boolean z4) {
        this.w_channel_info_switch = z4;
    }

    public void setWeb_disk_cfg(WebDiskCfg webDiskCfg) {
        this.web_disk_cfg = webDiskCfg;
    }

    public void setWeb_disk_position(WebDiskPositionBean webDiskPositionBean) {
        this.web_disk_position = webDiskPositionBean;
    }

    public void setWx_open_appid(String str) {
        this.wx_open_appid = str;
    }
}
