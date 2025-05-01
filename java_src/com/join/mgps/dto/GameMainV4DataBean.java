package com.join.mgps.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class GameMainV4DataBean {
    private GameMainachieve achieve;
    private String bbs_strategy_contribute_url;
    private boolean bbs_switch;
    private EndGameConfigBean endgame_config;
    private GameMaingameinfo gameInfo;
    private GameMasteryLevel gameMasteryLevel;
    private CommonGameInfoBean jp_info;
    private List<MemberFunBean> memberFun;
    private MemberInfoBean memberInfo;
    private GameMainNetBattle netBattle;
    private DomainInfoBean pd_info;
    private DomainInfoBean pd_info_popup;
    private PlayGameInfoBean playGameInfo;
    private List<RecommendAd> recommendAdList;
    private List<RecommendAd> recommendAdList2;
    private SimulatorCoreBean simulator_core;
    private Surface_bottom_ad surfaceBottomAd;

    /* loaded from: classes4.dex */
    public static class BoundaryBean implements Serializable {
        private int lower;
        private int upper;

        public int getLower() {
            return this.lower;
        }

        public int getUpper() {
            return this.upper;
        }

        public void setLower(int i4) {
            this.lower = i4;
        }

        public void setUpper(int i4) {
            this.upper = i4;
        }
    }

    /* loaded from: classes4.dex */
    public static class CreateEndgameHintBean implements Serializable {
        private String subTitle;
        private String title;

        public String getSubTitle() {
            return this.subTitle;
        }

        public String getTitle() {
            return this.title;
        }

        public void setSubTitle(String str) {
            this.subTitle = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }
    }

    /* loaded from: classes4.dex */
    public static class EndGameConfigBean implements Serializable {
        private ArrayList<CreateEndgameHintBean> create_endgame_hint;
        private ArrayList<String> endgame_archive_hint;
        private boolean endgame_asset_switch;
        private int endgame_cards;
        private ArrayList<EndgameChallengeLevelBean> endgame_challenge_level;
        private boolean endgame_creation_switch;
        private String endgame_pic;
        private boolean endgame_switch;

        public ArrayList<CreateEndgameHintBean> getCreate_endgame_hint() {
            return this.create_endgame_hint;
        }

        public ArrayList<String> getEndgame_archive_hint() {
            return this.endgame_archive_hint;
        }

        public int getEndgame_cards() {
            return this.endgame_cards;
        }

        public ArrayList<EndgameChallengeLevelBean> getEndgame_challenge_level() {
            return this.endgame_challenge_level;
        }

        public String getEndgame_pic() {
            return this.endgame_pic;
        }

        public boolean isEndgame_asset_switch() {
            return this.endgame_asset_switch;
        }

        public boolean isEndgame_creation_switch() {
            return this.endgame_creation_switch;
        }

        public boolean isEndgame_switch() {
            return this.endgame_switch;
        }

        public void setCreate_endgame_hint(ArrayList<CreateEndgameHintBean> arrayList) {
            this.create_endgame_hint = arrayList;
        }

        public void setEndgame_archive_hint(ArrayList<String> arrayList) {
            this.endgame_archive_hint = arrayList;
        }

        public void setEndgame_asset_switch(boolean z4) {
            this.endgame_asset_switch = z4;
        }

        public void setEndgame_cards(int i4) {
            this.endgame_cards = i4;
        }

        public void setEndgame_challenge_level(ArrayList<EndgameChallengeLevelBean> arrayList) {
            this.endgame_challenge_level = arrayList;
        }

        public void setEndgame_creation_switch(boolean z4) {
            this.endgame_creation_switch = z4;
        }

        public void setEndgame_pic(String str) {
            this.endgame_pic = str;
        }

        public void setEndgame_switch(boolean z4) {
            this.endgame_switch = z4;
        }
    }

    /* loaded from: classes4.dex */
    public static class EndgameChallengeLevelBean implements Serializable {
        private BoundaryBean boundary;
        private String level;

        public BoundaryBean getBoundary() {
            return this.boundary;
        }

        public String getLevel() {
            return this.level;
        }

        public void setBoundary(BoundaryBean boundaryBean) {
            this.boundary = boundaryBean;
        }

        public void setLevel(String str) {
            this.level = str;
        }
    }

    /* loaded from: classes4.dex */
    public static class GameRecommendInfoBean {
        private String game_id;
        private String game_pic;
        private String game_title;

        public String getGame_id() {
            return this.game_id;
        }

        public String getGame_pic() {
            return this.game_pic;
        }

        public String getGame_title() {
            return this.game_title;
        }

        public void setGame_id(String str) {
            this.game_id = str;
        }

        public void setGame_pic(String str) {
            this.game_pic = str;
        }

        public void setGame_title(String str) {
            this.game_title = str;
        }
    }

    /* loaded from: classes4.dex */
    public static class MemberFunBean {
        private List<String> contents;
        private String pic;
        private String title;
        private int type;
        private String url;
        private List<UserInfoBean> users;

        public List<String> getContents() {
            return this.contents;
        }

        public String getPic() {
            return this.pic;
        }

        public String getTitle() {
            return this.title;
        }

        public int getType() {
            return this.type;
        }

        public String getUrl() {
            return this.url;
        }

        public List<UserInfoBean> getUsers() {
            return this.users;
        }

        public void setContents(List<String> list) {
            this.contents = list;
        }

        public void setPic(String str) {
            this.pic = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setType(int i4) {
            this.type = i4;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUsers(List<UserInfoBean> list) {
            this.users = list;
        }
    }

    /* loaded from: classes4.dex */
    public static class MemberInfoBean {
        private int ad_switch;
        private String crc_link_type_val;
        private int game_info_tpl_type;
        private String jump_type;
        private String link_type;
        private String link_type_val;
        private String pic_remote;
        private int plugin_num;
        private String sub_title;
        private int sync_memory;
        private String title;
        private String tpl_type;
        private String type;

        public int getAd_switch() {
            return this.ad_switch;
        }

        public String getCrc_link_type_val() {
            return this.crc_link_type_val;
        }

        public int getGame_info_tpl_type() {
            return this.game_info_tpl_type;
        }

        public String getJump_type() {
            return this.jump_type;
        }

        public String getLink_type() {
            return this.link_type;
        }

        public String getLink_type_val() {
            return this.link_type_val;
        }

        public String getPic_remote() {
            return this.pic_remote;
        }

        public int getPlugin_num() {
            return this.plugin_num;
        }

        public String getSub_title() {
            return this.sub_title;
        }

        public int getSync_memory() {
            return this.sync_memory;
        }

        public String getTitle() {
            return this.title;
        }

        public String getTpl_type() {
            return this.tpl_type;
        }

        public String getType() {
            return this.type;
        }

        public void setAd_switch(int i4) {
            this.ad_switch = i4;
        }

        public void setCrc_link_type_val(String str) {
            this.crc_link_type_val = str;
        }

        public void setGame_info_tpl_type(int i4) {
            this.game_info_tpl_type = i4;
        }

        public void setJump_type(String str) {
            this.jump_type = str;
        }

        public void setLink_type(String str) {
            this.link_type = str;
        }

        public void setLink_type_val(String str) {
            this.link_type_val = str;
        }

        public void setPic_remote(String str) {
            this.pic_remote = str;
        }

        public void setPlugin_num(int i4) {
            this.plugin_num = i4;
        }

        public void setSub_title(String str) {
            this.sub_title = str;
        }

        public void setSync_memory(int i4) {
            this.sync_memory = i4;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setTpl_type(String str) {
            this.tpl_type = str;
        }

        public void setType(String str) {
            this.type = str;
        }
    }

    /* loaded from: classes4.dex */
    public static class PlayGameInfoBean {
        private int battle_room_count;
        private long current_play_time;
        private int file_save_count;
        private int file_save_switch;
        private long last_play_time;

        public int getBattle_room_count() {
            return this.battle_room_count;
        }

        public long getCurrent_play_time() {
            return this.current_play_time;
        }

        public int getFile_save_count() {
            return this.file_save_count;
        }

        public int getFile_save_switch() {
            return this.file_save_switch;
        }

        public long getLast_play_time() {
            return this.last_play_time;
        }

        public void setBattle_room_count(int i4) {
            this.battle_room_count = i4;
        }

        public void setCurrent_play_time(long j4) {
            this.current_play_time = j4;
        }

        public void setFile_save_count(int i4) {
            this.file_save_count = i4;
        }

        public void setFile_save_switch(int i4) {
            this.file_save_switch = i4;
        }

        public void setLast_play_time(long j4) {
            this.last_play_time = j4;
        }
    }

    /* loaded from: classes4.dex */
    public static class SimulatorCoreBean {
        private String core;
        private String plugin_num;

        public String getCore() {
            return this.core;
        }

        public String getPlugin_num() {
            return this.plugin_num;
        }

        public void setCore(String str) {
            this.core = str;
        }

        public void setPlugin_num(String str) {
            this.plugin_num = str;
        }
    }

    /* loaded from: classes4.dex */
    public static class Surface_bottom_ad {
        private int ad_switch;
        private String crc_link_type_val;
        private int game_info_tpl_type;
        private String jump_type;
        private String label;
        private String link_type;
        private String link_type_val;
        private String pic_remote;
        private int plugin_num;
        private String sub_title;
        private int sync_memory;
        private String title;
        private String tpl_type;
        private String type;

        public int getAd_switch() {
            return this.ad_switch;
        }

        public String getCrc_link_type_val() {
            return this.crc_link_type_val;
        }

        public int getGame_info_tpl_type() {
            return this.game_info_tpl_type;
        }

        public String getJump_type() {
            return this.jump_type;
        }

        public String getLabel() {
            return this.label;
        }

        public String getLink_type() {
            return this.link_type;
        }

        public String getLink_type_val() {
            return this.link_type_val;
        }

        public String getPic_remote() {
            return this.pic_remote;
        }

        public int getPlugin_num() {
            return this.plugin_num;
        }

        public String getSub_title() {
            return this.sub_title;
        }

        public int getSync_memory() {
            return this.sync_memory;
        }

        public String getTitle() {
            return this.title;
        }

        public String getTpl_type() {
            return this.tpl_type;
        }

        public String getType() {
            return this.type;
        }

        public void setAd_switch(int i4) {
            this.ad_switch = i4;
        }

        public void setCrc_link_type_val(String str) {
            this.crc_link_type_val = str;
        }

        public void setGame_info_tpl_type(int i4) {
            this.game_info_tpl_type = i4;
        }

        public void setJump_type(String str) {
            this.jump_type = str;
        }

        public void setLabel(String str) {
            this.label = str;
        }

        public void setLink_type(String str) {
            this.link_type = str;
        }

        public void setLink_type_val(String str) {
            this.link_type_val = str;
        }

        public void setPic_remote(String str) {
            this.pic_remote = str;
        }

        public void setPlugin_num(int i4) {
            this.plugin_num = i4;
        }

        public void setSub_title(String str) {
            this.sub_title = str;
        }

        public void setSync_memory(int i4) {
            this.sync_memory = i4;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setTpl_type(String str) {
            this.tpl_type = str;
        }

        public void setType(String str) {
            this.type = str;
        }
    }

    /* loaded from: classes4.dex */
    public static class UserInfoBean {
        private String avatar;
        private String nickname;
        private String uid;

        public String getAvatar() {
            return this.avatar;
        }

        public String getNickname() {
            return this.nickname;
        }

        public String getUid() {
            return this.uid;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setUid(String str) {
            this.uid = str;
        }
    }

    public GameMainachieve getAchieve() {
        return this.achieve;
    }

    public String getBbs_strategy_contribute_url() {
        return this.bbs_strategy_contribute_url;
    }

    public EndGameConfigBean getEndgame_config() {
        return this.endgame_config;
    }

    public GameMaingameinfo getGameInfo() {
        return this.gameInfo;
    }

    public GameMasteryLevel getGameMasteryLevel() {
        return this.gameMasteryLevel;
    }

    public CommonGameInfoBean getJp_info() {
        return this.jp_info;
    }

    public List<MemberFunBean> getMemberFun() {
        return this.memberFun;
    }

    public MemberInfoBean getMemberInfo() {
        return this.memberInfo;
    }

    public GameMainNetBattle getNetBattle() {
        return this.netBattle;
    }

    public DomainInfoBean getPd_info() {
        return this.pd_info;
    }

    public DomainInfoBean getPd_info_popup() {
        return this.pd_info_popup;
    }

    public PlayGameInfoBean getPlayGameInfo() {
        return this.playGameInfo;
    }

    public List<RecommendAd> getRecommendAdList() {
        return this.recommendAdList;
    }

    public List<RecommendAd> getRecommendAdList2() {
        return this.recommendAdList2;
    }

    public SimulatorCoreBean getSimulator_core() {
        return this.simulator_core;
    }

    public Surface_bottom_ad getSurfaceBottomAd() {
        return this.surfaceBottomAd;
    }

    public boolean isBbs_switch() {
        return this.bbs_switch;
    }

    public void setAchieve(GameMainachieve gameMainachieve) {
        this.achieve = gameMainachieve;
    }

    public void setBbs_strategy_contribute_url(String str) {
        this.bbs_strategy_contribute_url = str;
    }

    public void setBbs_switch(boolean z4) {
        this.bbs_switch = z4;
    }

    public void setEndgame_config(EndGameConfigBean endGameConfigBean) {
        this.endgame_config = endGameConfigBean;
    }

    public void setGameInfo(GameMaingameinfo gameMaingameinfo) {
        this.gameInfo = gameMaingameinfo;
    }

    public void setGameMasteryLevel(GameMasteryLevel gameMasteryLevel) {
        this.gameMasteryLevel = gameMasteryLevel;
    }

    public void setJp_info(CommonGameInfoBean commonGameInfoBean) {
        this.jp_info = commonGameInfoBean;
    }

    public void setMemberFun(List<MemberFunBean> list) {
        this.memberFun = list;
    }

    public void setMemberInfo(MemberInfoBean memberInfoBean) {
        this.memberInfo = memberInfoBean;
    }

    public void setNetBattle(GameMainNetBattle gameMainNetBattle) {
        this.netBattle = gameMainNetBattle;
    }

    public void setPd_info(DomainInfoBean domainInfoBean) {
        this.pd_info = domainInfoBean;
    }

    public void setPd_info_popup(DomainInfoBean domainInfoBean) {
        this.pd_info_popup = domainInfoBean;
    }

    public void setPlayGameInfo(PlayGameInfoBean playGameInfoBean) {
        this.playGameInfo = playGameInfoBean;
    }

    public void setRecommendAdList(List<RecommendAd> list) {
        this.recommendAdList = list;
    }

    public void setRecommendAdList2(List<RecommendAd> list) {
        this.recommendAdList2 = list;
    }

    public void setSimulator_core(SimulatorCoreBean simulatorCoreBean) {
        this.simulator_core = simulatorCoreBean;
    }

    public void setSurfaceBottomAd(Surface_bottom_ad surface_bottom_ad) {
        this.surfaceBottomAd = surface_bottom_ad;
    }
}
