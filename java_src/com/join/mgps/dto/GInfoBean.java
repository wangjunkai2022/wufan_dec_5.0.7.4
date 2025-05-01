package com.join.mgps.dto;

import android.text.TextUtils;
import com.psk.eventmodule.StatFactory;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes4.dex */
public class GInfoBean implements Serializable {
    private String app_size;
    private int arm64;
    private int bespeak_switch = 0;
    private int comment_score_switch;
    private int down_count;
    private Integer down_state;
    private int download_close;
    private int game_book;
    private String game_info_tpl_type;
    private String gif_ico;
    private int gift_package_switch;
    private String ico;
    private String id;
    private String info;
    private String mod_id;
    private String mod_package_name;
    private String name;
    private String package_name;
    private PayTagInfo pay_tag_info;
    private List<String> pic_info;
    private Integer pic_position;
    private String plugin_num;
    private StatFactory.VolcanoOther position_path;
    private Double score;
    private TipNew sp_tag_info;
    private int sp_tpl_two_position;
    private String sync_memory;
    private List<Integer> tag_id;
    private List<TipBean> tag_info;
    private String tag_name;
    private String ver;
    private String ver_name;

    public String getApp_size() {
        return this.app_size;
    }

    public int getArm64() {
        return this.arm64;
    }

    public int getBespeak_switch() {
        return this.bespeak_switch;
    }

    public int getComment_score_switch() {
        return this.comment_score_switch;
    }

    public int getDown_count() {
        return this.down_count;
    }

    public Integer getDown_state() {
        if (this.down_state.intValue() == 2 && this.bespeak_switch == 1) {
            this.down_state = 6;
            return 6;
        }
        return this.down_state;
    }

    public int getDownload_close() {
        return this.download_close;
    }

    public int getGame_book() {
        return this.game_book;
    }

    public String getGame_info_tpl_type() {
        return this.game_info_tpl_type;
    }

    public String getGif_ico() {
        return this.gif_ico;
    }

    public int getGift_package_switch() {
        return this.gift_package_switch;
    }

    public String getIco() {
        return this.ico;
    }

    public String getIcon() {
        if (TextUtils.isEmpty(this.gif_ico)) {
            return this.gif_ico;
        }
        return this.ico;
    }

    public String getId() {
        return this.id;
    }

    public String getInfo() {
        return this.info;
    }

    public String getMod_id() {
        return this.mod_id;
    }

    public String getMod_package_name() {
        return this.mod_package_name;
    }

    public String getName() {
        return this.name;
    }

    public String getPackage_name() {
        return this.package_name;
    }

    public PayTagInfo getPay_tag_info() {
        return this.pay_tag_info;
    }

    public List<String> getPic_info() {
        return this.pic_info;
    }

    public Integer getPic_position() {
        return this.pic_position;
    }

    public String getPlugin_num() {
        return this.plugin_num;
    }

    public StatFactory.VolcanoOther getPosition_path() {
        return this.position_path;
    }

    public Double getScore() {
        return this.score;
    }

    public TipNew getSp_tag_info() {
        return this.sp_tag_info;
    }

    public int getSp_tpl_two_position() {
        return this.sp_tpl_two_position;
    }

    public String getSync_memory() {
        return this.sync_memory;
    }

    public List<Integer> getTag_id() {
        return this.tag_id;
    }

    public List<TipBean> getTag_info() {
        return this.tag_info;
    }

    public String getTag_name() {
        return this.tag_name;
    }

    public String getVer() {
        return this.ver;
    }

    public String getVer_name() {
        return this.ver_name;
    }

    public boolean isBtGame() {
        TipNew tipNew = this.sp_tag_info;
        return (tipNew == null || tipNew.getBt_game() == null) ? false : true;
    }

    public boolean isCpsGame() {
        return this.download_close == 0;
    }

    public boolean isMiniGame() {
        TipNew tipNew = this.sp_tag_info;
        return (tipNew == null || tipNew.getMini_game() == null) ? false : true;
    }

    public boolean isModGameVm() {
        TipNew tipNew = this.sp_tag_info;
        return (tipNew == null || tipNew.getMod_game_vm() == null) ? false : true;
    }

    public boolean isNetGameVm() {
        TipNew tipNew = this.sp_tag_info;
        return (tipNew == null || tipNew.getNet_game_vm() == null) ? false : true;
    }

    public boolean isSingleGameVm() {
        TipNew tipNew = this.sp_tag_info;
        return (tipNew == null || tipNew.getSingle_game_vm() == null) ? false : true;
    }

    public void setApp_size(String str) {
        this.app_size = str;
    }

    public void setArm64(int i4) {
        this.arm64 = i4;
    }

    public void setBespeak_switch(int i4) {
        this.bespeak_switch = i4;
    }

    public void setComment_score_switch(int i4) {
        this.comment_score_switch = i4;
    }

    public void setDown_count(int i4) {
        this.down_count = i4;
    }

    public void setDown_state(Integer num) {
        this.down_state = num;
    }

    public void setDownload_close(int i4) {
        this.download_close = i4;
    }

    public void setGame_book(int i4) {
        this.game_book = i4;
    }

    public void setGame_info_tpl_type(String str) {
        this.game_info_tpl_type = str;
    }

    public void setGif_ico(String str) {
        this.gif_ico = str;
    }

    public void setGift_package_switch(int i4) {
        this.gift_package_switch = i4;
    }

    public void setIco(String str) {
        this.ico = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setInfo(String str) {
        this.info = str;
    }

    public void setMod_id(String str) {
        this.mod_id = str;
    }

    public void setMod_package_name(String str) {
        this.mod_package_name = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPackage_name(String str) {
        this.package_name = str;
    }

    public void setPay_tag_info(PayTagInfo payTagInfo) {
        this.pay_tag_info = payTagInfo;
    }

    public void setPic_info(List<String> list) {
        this.pic_info = list;
    }

    public void setPic_position(Integer num) {
        this.pic_position = num;
    }

    public void setPlugin_num(String str) {
        this.plugin_num = str;
    }

    public void setPosition_path(StatFactory.VolcanoOther volcanoOther) {
        this.position_path = volcanoOther;
    }

    public void setScore(Double d5) {
        this.score = d5;
    }

    public void setSp_tag_info(TipNew tipNew) {
        this.sp_tag_info = tipNew;
    }

    public void setSp_tpl_two_position(int i4) {
        this.sp_tpl_two_position = i4;
    }

    public void setSync_memory(String str) {
        this.sync_memory = str;
    }

    public void setTag_id(List<Integer> list) {
        this.tag_id = list;
    }

    public void setTag_info(List<TipBean> list) {
        this.tag_info = list;
    }

    public void setTag_name(String str) {
        this.tag_name = str;
    }

    public void setVer(String str) {
        this.ver = str;
    }

    public void setVer_name(String str) {
        this.ver_name = str;
    }

    public boolean showScore() {
        return this.comment_score_switch == 1;
    }
}
