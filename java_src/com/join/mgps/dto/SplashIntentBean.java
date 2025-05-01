package com.join.mgps.dto;

import com.join.mgps.Util.IntentDateBean;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class SplashIntentBean {
    private int ad_switch;
    private String crc_link_type_val;
    private SimbGameinfo game_info;
    private int jump_id;
    private int jump_type;
    private int link_type;
    private String link_type_val;
    private String pic_remote;
    private String pic_remote_local;
    private int showPosition = 0;
    private long show_time;
    private int tag_show;
    private String title;
    private String tpl_type;
    private String vedio_url;
    private String vedio_url_local;

    /* loaded from: classes4.dex */
    public static class SimbGameinfo {
        private String game_info_tpl_type;
        private String ico_remote;
        private String id;
        private String sp_tpl_two_position;
        private String title;

        public static SimbGameinfo from(JSONObject jSONObject) {
            SimbGameinfo simbGameinfo = new SimbGameinfo();
            try {
                simbGameinfo.setId(jSONObject.optString("id"));
                simbGameinfo.setTitle(jSONObject.optString("title"));
                simbGameinfo.setIco_remote(jSONObject.optString("ico_remote"));
                simbGameinfo.setGame_info_tpl_type(jSONObject.optString("game_info_tpl_type"));
                simbGameinfo.setSp_tpl_two_position(jSONObject.optString("sp_tpl_two_position"));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return simbGameinfo;
        }

        public String getGame_info_tpl_type() {
            return this.game_info_tpl_type;
        }

        public String getIco_remote() {
            return this.ico_remote;
        }

        public String getId() {
            return this.id;
        }

        public String getSp_tpl_two_position() {
            return this.sp_tpl_two_position;
        }

        public String getTitle() {
            return this.title;
        }

        public void setGame_info_tpl_type(String str) {
            this.game_info_tpl_type = str;
        }

        public void setIco_remote(String str) {
            this.ico_remote = str;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setSp_tpl_two_position(String str) {
            this.sp_tpl_two_position = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }
    }

    public static SplashIntentBean from(JSONObject jSONObject) {
        SplashIntentBean splashIntentBean = new SplashIntentBean();
        try {
            splashIntentBean.setLink_type(jSONObject.optInt("link_type"));
            splashIntentBean.setLink_type_val(jSONObject.optString("link_type_val"));
            splashIntentBean.setCrc_link_type_val(jSONObject.optString("crc_link_type_val"));
            splashIntentBean.setJump_type(jSONObject.optInt("jump_type"));
            splashIntentBean.setJump_id(jSONObject.optInt("jump_id"));
            splashIntentBean.setTpl_type(jSONObject.optString("tpl_type"));
            splashIntentBean.setTitle(jSONObject.optString("title"));
            splashIntentBean.setPic_remote(jSONObject.optString("pic_remote"));
            splashIntentBean.setPic_remote_local(jSONObject.optString("pic_remote_local"));
            splashIntentBean.setAd_switch(jSONObject.optInt("ad_switch"));
            splashIntentBean.setShow_time(jSONObject.optLong("show_time"));
            splashIntentBean.setTag_show(jSONObject.optInt("tag_show"));
            splashIntentBean.setShowPosition(jSONObject.optInt("showPosition"));
            splashIntentBean.setVedio_url(jSONObject.optString("vedio_url"));
            splashIntentBean.setVedio_url_local(jSONObject.optString("vedio_url_local"));
            JSONObject optJSONObject = jSONObject.optJSONObject("game_info");
            if (optJSONObject != null) {
                splashIntentBean.setGame_info(SimbGameinfo.from(optJSONObject));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return splashIntentBean;
    }

    public int getAd_switch() {
        return this.ad_switch;
    }

    public String getCrc_link_type_val() {
        return this.crc_link_type_val;
    }

    public SimbGameinfo getGame_info() {
        return this.game_info;
    }

    public IntentDateBean getIntentDataBean() {
        SimbGameinfo simbGameinfo;
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setJump_type(this.jump_type);
        intentDateBean.setLink_type(this.link_type);
        intentDateBean.setLink_type_val(this.link_type_val);
        intentDateBean.setCrc_link_type_val(this.crc_link_type_val);
        if (this.link_type == 1 && (simbGameinfo = this.game_info) != null) {
            intentDateBean.setTpl_type(simbGameinfo.getGame_info_tpl_type());
        } else {
            intentDateBean.setTpl_type(this.tpl_type);
        }
        return intentDateBean;
    }

    public int getJump_id() {
        return this.jump_id;
    }

    public int getJump_type() {
        return this.jump_type;
    }

    public int getLink_type() {
        return this.link_type;
    }

    public String getLink_type_val() {
        return this.link_type_val;
    }

    public String getPic_remote() {
        return this.pic_remote;
    }

    public String getPic_remote_local() {
        return this.pic_remote_local;
    }

    public int getShowPosition() {
        return this.showPosition;
    }

    public long getShow_time() {
        return this.show_time;
    }

    public int getTag_show() {
        return this.tag_show;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTpl_type() {
        return this.tpl_type;
    }

    public String getVedio_url() {
        return this.vedio_url;
    }

    public String getVedio_url_local() {
        return this.vedio_url_local;
    }

    public void setAd_switch(int i4) {
        this.ad_switch = i4;
    }

    public void setCrc_link_type_val(String str) {
        this.crc_link_type_val = str;
    }

    public void setGame_info(SimbGameinfo simbGameinfo) {
        this.game_info = simbGameinfo;
    }

    public void setJump_id(int i4) {
        this.jump_id = i4;
    }

    public void setJump_type(int i4) {
        this.jump_type = i4;
    }

    public void setLink_type(int i4) {
        this.link_type = i4;
    }

    public void setLink_type_val(String str) {
        this.link_type_val = str;
    }

    public void setPic_remote(String str) {
        this.pic_remote = str;
    }

    public void setPic_remote_local(String str) {
        this.pic_remote_local = str;
    }

    public void setShowPosition(int i4) {
        this.showPosition = i4;
    }

    public void setShow_time(long j4) {
        this.show_time = j4;
    }

    public void setTag_show(int i4) {
        this.tag_show = i4;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTpl_type(String str) {
        this.tpl_type = str;
    }

    public void setVedio_url(String str) {
        this.vedio_url = str;
    }

    public void setVedio_url_local(String str) {
        this.vedio_url_local = str;
    }
}
