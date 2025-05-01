package com.join.mgps.dto;

import android.text.TextUtils;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentToDetialBean;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import java.util.List;
import java.util.Objects;
import u1.b;
/* loaded from: classes4.dex */
public class CommonGameInfoBean extends DownloadPointBase implements b {
    private int ad_switch;
    private String bg_color;
    private String big_pic;
    private String description;
    private DownloadTask downloadTask;
    private String exp_position;
    private GInfoBean g_info;
    private String h_ad_pic;
    private String h_ad_video_url;
    private boolean hasExposure;
    private boolean isRecommend;
    private JpInfoBean jp_info;
    private String keyword;
    private String label;
    private String main_title;
    private DomainInfoBean pd_info;
    private int position;
    private int quit_switch;
    private StatisticsBean statistics;
    private String sub_title;
    private String title;
    private int tpl_type;
    private String v_ad_pic;
    private String v_ad_video_url;
    private String v_url;
    protected int viewType;
    private int requestStatus = 0;
    private boolean isAdInfo = false;
    private boolean is_head = false;
    private boolean isPrivateDomain = false;

    public Integer getAd_switch() {
        return Integer.valueOf(this.ad_switch);
    }

    public String getBg_color() {
        return this.bg_color;
    }

    public String getBig_pic() {
        return this.big_pic;
    }

    public String getCoverPicUrl() {
        GInfoBean g_info;
        if (isGame() && (g_info = getG_info()) != null && g2.h(getV_url())) {
            if (g2.i(getBig_pic())) {
                return getBig_pic();
            }
            List<String> pic_info = g_info.getPic_info();
            if (g2.h("") && pic_info != null && pic_info.size() > 0) {
                return pic_info.get(0);
            }
        }
        return getBig_pic();
    }

    public String getDescription() {
        return this.description;
    }

    public DownloadTask getDownloadTask() {
        return this.downloadTask;
    }

    public String getExp_position() {
        return this.exp_position;
    }

    public GInfoBean getG_info() {
        return this.g_info;
    }

    public String getH_ad_pic() {
        return this.h_ad_pic;
    }

    public String getH_ad_video_url() {
        return this.h_ad_video_url;
    }

    public IntentDateBean getIntentDataBean() {
        ExtBean extBean;
        IntentDateBean intentDateBean = new IntentDateBean();
        if (this.g_info != null) {
            IntentToDetialBean intentToDetialBean = new IntentToDetialBean();
            intentToDetialBean.f(this.g_info.getId());
            intentToDetialBean.g(this.g_info.getName());
            intentToDetialBean.i(this.g_info.getIco());
            intentToDetialBean.h(0);
            intentDateBean.setObject(intentToDetialBean);
        }
        intentDateBean.setExt1(getExt1());
        intentDateBean.setExt2(getExt2());
        intentDateBean.setExt3(getExt3());
        intentDateBean.setExt4(getExt4());
        JpInfoBean jpInfoBean = this.jp_info;
        if (jpInfoBean != null) {
            intentDateBean.setJump_type(jpInfoBean.getJump_type().intValue());
            intentDateBean.setLink_type(this.jp_info.getLink_type().intValue());
            intentDateBean.setLink_type_val(this.jp_info.getLink_type_val());
            intentDateBean.setTpl_type(String.valueOf(this.jp_info.getTpl_type()));
            intentDateBean.setCrc_link_type_val(this.jp_info.getCrc_link_type_val());
        }
        String str = null;
        str = null;
        String str2 = "";
        if (intentDateBean.getExtBean() == null) {
            ExtBean reMarks = new ExtBean(get_from_type()).setRecPosition(getRecPosition()).setReMarks(getReMarks());
            GInfoBean gInfoBean = this.g_info;
            ExtBean volcanoOther = reMarks.setVolcanoOther((gInfoBean == null || gInfoBean.getPosition_path() == null) ? "" : JsonMapper.toJsonString(this.g_info.getPosition_path()));
            GInfoBean gInfoBean2 = this.g_info;
            ExtBean onlineGame = volcanoOther.setOnlineGame(UtilsMy.k2(gInfoBean2 != null ? gInfoBean2.getTag_info() : null));
            if (this.statistics != null) {
                str2 = this.statistics.getMin_game_search_source() + "";
            }
            intentDateBean.setExtBean(onlineGame.setDataFlag(str2));
        } else {
            intentDateBean.getExtBean().setFrom(String.valueOf(get_from()));
            intentDateBean.getExtBean().set_from_type(get_from_type());
            ExtBean extBean2 = intentDateBean.getExtBean();
            if (this.statistics != null) {
                str2 = this.statistics.getMin_game_search_source() + "";
            }
            extBean2.setDataFlag(str2);
            ExtBean extBean3 = intentDateBean.getExtBean();
            GInfoBean gInfoBean3 = this.g_info;
            if (gInfoBean3 != null && gInfoBean3.getPosition_path() != null) {
                str = JsonMapper.getInstance().toJson(this.g_info.getPosition_path());
            }
            extBean3.setVolcanoOther(str);
        }
        if (TextUtils.isEmpty(intentDateBean.getExtBean().getDataFlag()) && getExt() != null && (extBean = (ExtBean) JsonMapper.getInstance().fromJson(getExt(), ExtBean.class)) != null && extBean.getDataFlag() != null) {
            intentDateBean.getExtBean().setDataFlag(extBean.getDataFlag());
        }
        return intentDateBean;
    }

    public IntentDateBean getIntentDataBeanWithFromType(int i4) {
        set_from_type(i4);
        set_from(i4);
        return getIntentDataBean();
    }

    @Override // u1.b
    public int getItemType() {
        return this.viewType;
    }

    public JpInfoBean getJp_info() {
        return this.jp_info;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public String getLabel() {
        return this.label;
    }

    public String getMain_title() {
        return this.main_title;
    }

    public String getOnlineGAmeAdPic() {
        if (TextUtils.isEmpty(this.v_ad_pic)) {
            if (TextUtils.isEmpty(this.h_ad_pic)) {
                if (TextUtils.isEmpty(this.big_pic)) {
                    return null;
                }
                return this.big_pic;
            }
            return this.h_ad_pic;
        }
        return this.v_ad_pic;
    }

    public String getOnlineGameAdVideoUrl() {
        if (TextUtils.isEmpty(this.v_ad_video_url)) {
            if (TextUtils.isEmpty(this.h_ad_video_url)) {
                if (TextUtils.isEmpty(this.v_url)) {
                    return null;
                }
                return this.v_url;
            }
            return this.h_ad_video_url;
        }
        return this.v_ad_video_url;
    }

    public DomainInfoBean getPd_info() {
        return this.pd_info;
    }

    public int getPosition() {
        return this.position;
    }

    public Integer getQuit_switch() {
        return Integer.valueOf(this.quit_switch);
    }

    public int getRequestStatus() {
        return this.requestStatus;
    }

    public String getShowName() {
        GInfoBean g_info;
        if (isGame() && (g_info = getG_info()) != null && g2.i(g_info.getName())) {
            return g_info.getName();
        }
        return getTitle();
    }

    public String getShowScore() {
        GInfoBean g_info;
        return (!isGame() || (g_info = getG_info()) == null) ? "5.0" : g_info.getScore().doubleValue() == 0.0d ? "0" : String.valueOf(g_info.getScore());
    }

    public StatisticsBean getStatistics() {
        return this.statistics;
    }

    public String getSub_title() {
        return this.sub_title;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTpl_type() {
        return this.tpl_type;
    }

    public String getV_ad_pic() {
        return this.v_ad_pic;
    }

    public String getV_ad_video_url() {
        return this.v_ad_video_url;
    }

    public String getV_url() {
        return this.v_url;
    }

    public int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.title;
        objArr[1] = this.sub_title;
        objArr[2] = this.big_pic;
        objArr[3] = this.v_url;
        GInfoBean gInfoBean = this.g_info;
        objArr[4] = gInfoBean == null ? "" : gInfoBean.getId();
        return Objects.hash(objArr);
    }

    public boolean is64Bit() {
        GInfoBean gInfoBean = this.g_info;
        return gInfoBean != null && gInfoBean.getArm64() == 1;
    }

    public boolean isAdInfo() {
        return this.isAdInfo;
    }

    public boolean isBtGame() {
        GInfoBean gInfoBean = this.g_info;
        return gInfoBean != null && gInfoBean.isBtGame();
    }

    public boolean isGame() {
        JpInfoBean jpInfoBean = this.jp_info;
        return jpInfoBean != null && jpInfoBean.isGame();
    }

    public boolean isGameVm() {
        return isModGameVm() || isSingleGameVm() || isNetGameVm();
    }

    public boolean isHasExposure() {
        return this.hasExposure;
    }

    public boolean isIs_head() {
        return this.is_head;
    }

    public boolean isMiniGame() {
        GInfoBean gInfoBean = this.g_info;
        return gInfoBean != null && gInfoBean.isMiniGame();
    }

    public boolean isModGameVm() {
        GInfoBean gInfoBean = this.g_info;
        return gInfoBean != null && gInfoBean.isModGameVm();
    }

    public boolean isNetGameVm() {
        GInfoBean gInfoBean = this.g_info;
        return gInfoBean != null && gInfoBean.isNetGameVm();
    }

    public boolean isPrivateDomain() {
        return this.isPrivateDomain;
    }

    public boolean isRecommend() {
        return this.isRecommend;
    }

    public boolean isSingleGameVm() {
        GInfoBean gInfoBean = this.g_info;
        return gInfoBean != null && gInfoBean.isSingleGameVm();
    }

    public void setAdInfo(boolean z4) {
        this.isAdInfo = z4;
    }

    public void setAd_switch(Integer num) {
        this.ad_switch = num.intValue();
    }

    public void setBg_color(String str) {
        this.bg_color = str;
    }

    public void setBig_pic(String str) {
        this.big_pic = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDownloadTask(DownloadTask downloadTask) {
        this.downloadTask = downloadTask;
    }

    public void setExp_position(String str) {
        this.exp_position = str;
    }

    public void setG_info(GInfoBean gInfoBean) {
        this.g_info = gInfoBean;
    }

    public void setH_ad_pic(String str) {
        this.h_ad_pic = str;
    }

    public void setH_ad_video_url(String str) {
        this.h_ad_video_url = str;
    }

    public void setHasExposure(boolean z4) {
        this.hasExposure = z4;
    }

    public void setIsPrivateDomain(boolean z4) {
        this.isPrivateDomain = z4;
    }

    public void setIs_head(boolean z4) {
        this.is_head = z4;
    }

    public void setJp_info(JpInfoBean jpInfoBean) {
        this.jp_info = jpInfoBean;
    }

    public void setKeyword(String str) {
        this.keyword = str;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setMain_title(String str) {
        this.main_title = str;
    }

    public void setPd_info(DomainInfoBean domainInfoBean) {
        this.pd_info = domainInfoBean;
    }

    public void setPosition(int i4) {
        this.position = i4;
    }

    public void setQuit_switch(Integer num) {
        this.quit_switch = num.intValue();
    }

    public void setRecommend(boolean z4) {
        this.isRecommend = z4;
    }

    public void setRequestStatus(int i4) {
        this.requestStatus = i4;
    }

    public void setStatistics(StatisticsBean statisticsBean) {
        this.statistics = statisticsBean;
    }

    public void setSub_title(String str) {
        this.sub_title = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTpl_type(int i4) {
        this.tpl_type = i4;
    }

    public void setV_ad_pic(String str) {
        this.v_ad_pic = str;
    }

    public void setV_ad_video_url(String str) {
        this.v_ad_video_url = str;
    }

    public void setV_url(String str) {
        this.v_url = str;
    }

    public void setViewType(int i4) {
        this.viewType = i4;
    }

    public void setAd_switch(int i4) {
        this.ad_switch = i4;
    }

    public void setQuit_switch(int i4) {
        this.quit_switch = i4;
    }
}
