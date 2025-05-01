package com.join.mgps.Util;

import com.MApplication;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.join.mgps.dto.BaiduAdDataMain;
import java.util.List;
/* loaded from: classes3.dex */
public class StartGameMeta {
    private int RoomMode;
    private String activityName;
    private List<BaiduAdDataMain> adDatas;
    private int archiveSaveCount;
    private int archiveSaveTime;
    private String area;
    private String assetspath;
    private String bios;
    private String channelId;
    private int cheat;
    private String classname;
    private String clientIp;
    private String core;
    public String device_id;
    private String dnsJson;
    private String emuType;
    private int endGameId;
    private String endGameLevelRules;
    private int endGameTime;
    private String endId;
    private String fromCls;
    private String gameID;
    private int gamePlayers;
    private int groupId;
    private boolean isBside;
    private int netMode;
    private int netPlayers;
    private String netState;
    private int oldGame;
    private String p1Name;
    private String p2Name;
    private String packageName;
    private long plugin_area_val;
    private int porder;
    private int pspAdShowTime;
    private int pspAdShowTimeSwitch;
    private String ramCheck;
    private int rankAutoUpload;
    private String rankingID;
    private String rolesJson;
    private String romPath;
    private String roomID;
    private int sVipLevel;
    private int scoreBoard;
    private String serverIP;
    private String serverPort;
    private String sopath;
    private int sp;
    private int startMode;
    private String subTitle;
    private int tagId;
    private int tcptype;
    private String token;
    private boolean tourist;
    private int type;
    private String udpIP;
    private int udpport;
    private String userID;
    private String userIcon;
    private String userName;
    private String verCode;
    private int vipLevel;
    private boolean allowPeripheralJoin = true;
    private boolean allowPcJoin = true;
    private int intentFrom = 0;
    private int version = 15;
    private long vip_expire_time = 0;
    private String result_show_type = "";
    private String pa_package_name = "";
    private int roomSilent = 0;
    private String fastIP = "";
    private int gametype = 0;
    private int cheatEnable = 1;
    private int rankMiniTime = 0;
    @JsonIgnore
    private int apkOrSo = 1;

    public String getActivityName() {
        return this.activityName;
    }

    public List<BaiduAdDataMain> getAdDatas() {
        return this.adDatas;
    }

    public int getApkOrSo() {
        return this.apkOrSo;
    }

    public int getArchiveSaveCount() {
        return this.archiveSaveCount;
    }

    public int getArchiveSaveTime() {
        return this.archiveSaveTime;
    }

    public String getArea() {
        return this.area;
    }

    public String getAssetspath() {
        return this.assetspath;
    }

    public String getBios() {
        return this.bios;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public int getCheat() {
        return this.cheat;
    }

    public int getCheatEnable() {
        return this.cheatEnable;
    }

    public String getClassname() {
        return this.classname;
    }

    public String getClientIp() {
        return this.clientIp;
    }

    public String getCore() {
        return this.core;
    }

    public String getDevice_id() {
        return com.papa.sim.statistic.s.f(MApplication.j()).b();
    }

    public String getDnsJson() {
        return this.dnsJson;
    }

    public String getEmuType() {
        return this.emuType;
    }

    public int getEndGameId() {
        return this.endGameId;
    }

    public String getEndGameLevelRules() {
        return this.endGameLevelRules;
    }

    public int getEndGameTime() {
        return this.endGameTime;
    }

    public String getEndId() {
        return this.endId;
    }

    public String getFastIP() {
        return this.fastIP;
    }

    public String getFromCls() {
        return this.fromCls;
    }

    public String getGameID() {
        return this.gameID;
    }

    public int getGamePlayers() {
        return this.gamePlayers;
    }

    public int getGametype() {
        return this.gametype;
    }

    public int getGroupId() {
        return this.groupId;
    }

    public int getIntentFrom() {
        return this.intentFrom;
    }

    public int getNetMode() {
        return this.netMode;
    }

    public int getNetPlayers() {
        return this.netPlayers;
    }

    public String getNetState() {
        return this.netState;
    }

    public int getOldGame() {
        return this.oldGame;
    }

    public String getP1Name() {
        return this.p1Name;
    }

    public String getP2Name() {
        return this.p2Name;
    }

    public String getPa_package_name() {
        return this.pa_package_name;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public long getPlugin_area_val() {
        return this.plugin_area_val;
    }

    public int getPorder() {
        return this.porder;
    }

    public int getPspAdShowTime() {
        return this.pspAdShowTime;
    }

    public int getPspAdShowTimeSwitch() {
        return this.pspAdShowTimeSwitch;
    }

    public String getRamCheck() {
        return this.ramCheck;
    }

    public int getRankAutoUpload() {
        return this.rankAutoUpload;
    }

    public int getRankMiniTime() {
        return this.rankMiniTime;
    }

    public String getRankingID() {
        return this.rankingID;
    }

    public String getResult_show_type() {
        return this.result_show_type;
    }

    public String getRolesJson() {
        return this.rolesJson;
    }

    public String getRomPath() {
        return this.romPath;
    }

    public String getRoomID() {
        return this.roomID;
    }

    public int getRoomMode() {
        return this.RoomMode;
    }

    public int getRoomSilent() {
        return this.roomSilent;
    }

    public int getScoreBoard() {
        return this.scoreBoard;
    }

    public String getServerIP() {
        return this.serverIP;
    }

    public String getServerPort() {
        return this.serverPort;
    }

    public String getSopath() {
        return this.sopath;
    }

    public int getSp() {
        return this.sp;
    }

    public int getStartMode() {
        return this.startMode;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public int getTagId() {
        return this.tagId;
    }

    public int getTcptype() {
        return this.tcptype;
    }

    public String getToken() {
        return this.token;
    }

    public int getType() {
        return this.type;
    }

    public String getUdpIP() {
        return this.udpIP;
    }

    public int getUdpport() {
        return this.udpport;
    }

    public String getUserID() {
        return this.userID;
    }

    public String getUserIcon() {
        return this.userIcon;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getVerCode() {
        return this.verCode;
    }

    public int getVersion() {
        return this.version;
    }

    public int getVipLevel() {
        return this.vipLevel;
    }

    public long getVip_expire_time() {
        return this.vip_expire_time;
    }

    public int getsVipLevel() {
        return this.sVipLevel;
    }

    public boolean isAllowPcJoin() {
        return this.allowPcJoin;
    }

    public boolean isAllowPeripheralJoin() {
        return this.allowPeripheralJoin;
    }

    public boolean isBside() {
        return this.isBside;
    }

    public boolean isTourist() {
        return this.tourist;
    }

    public void setActivityName(String str) {
        this.activityName = str;
    }

    public void setAdDatas(List<BaiduAdDataMain> list) {
        this.adDatas = list;
    }

    public void setAllowPcJoin(boolean z4) {
        this.allowPcJoin = z4;
    }

    public void setAllowPeripheralJoin(boolean z4) {
        this.allowPeripheralJoin = z4;
    }

    public void setApkOrSo(int i4) {
        this.apkOrSo = i4;
    }

    public void setArchiveSaveCount(int i4) {
        this.archiveSaveCount = i4;
    }

    public void setArchiveSaveTime(int i4) {
        this.archiveSaveTime = i4;
    }

    public void setArea(String str) {
        this.area = str;
    }

    public void setAssetspath(String str) {
        this.assetspath = str;
    }

    public void setBios(String str) {
        this.bios = str;
    }

    public void setBside(boolean z4) {
        this.isBside = z4;
    }

    public void setChannelId(String str) {
        this.channelId = str;
    }

    public void setCheat(int i4) {
        this.cheat = i4;
    }

    public void setCheatEnable(int i4) {
        this.cheatEnable = i4;
    }

    public void setClassname(String str) {
        this.classname = str;
    }

    public void setClientIp(String str) {
        this.clientIp = str;
    }

    public void setCore(String str) {
        this.core = str;
    }

    public void setDevice_id(String str) {
        this.device_id = str;
    }

    public void setDnsJson(String str) {
        this.dnsJson = str;
    }

    public void setEmuType(String str) {
        this.emuType = str;
    }

    public void setEndGameId(int i4) {
        this.endGameId = i4;
    }

    public void setEndGameLevelRules(String str) {
        this.endGameLevelRules = str;
    }

    public void setEndGameTime(int i4) {
        this.endGameTime = i4;
    }

    public void setEndId(String str) {
        this.endId = str;
    }

    public void setFastIP(String str) {
        this.fastIP = str;
    }

    public void setFromCls(String str) {
        this.fromCls = str;
    }

    public void setGameID(String str) {
        this.gameID = str;
    }

    public void setGamePlayers(int i4) {
        this.gamePlayers = i4;
    }

    public void setGametype(int i4) {
        this.gametype = i4;
    }

    public void setGroupId(int i4) {
        this.groupId = i4;
    }

    public void setIntentFrom(int i4) {
        this.intentFrom = i4;
    }

    public void setNetMode(int i4) {
        this.netMode = i4;
    }

    public void setNetPlayers(int i4) {
        this.netPlayers = i4;
    }

    public void setNetState(String str) {
        this.netState = str;
    }

    public void setOldGame(int i4) {
        this.oldGame = i4;
    }

    public void setP1Name(String str) {
        this.p1Name = str;
    }

    public void setP2Name(String str) {
        this.p2Name = str;
    }

    public void setPa_package_name(String str) {
        this.pa_package_name = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPlugin_area_val(long j4) {
        this.plugin_area_val = j4;
    }

    public void setPorder(int i4) {
        this.porder = i4;
    }

    public void setPspAdShowTime(int i4) {
        this.pspAdShowTime = i4;
    }

    public void setPspAdShowTimeSwitch(int i4) {
        this.pspAdShowTimeSwitch = i4;
    }

    public void setRamCheck(String str) {
        this.ramCheck = str;
    }

    public void setRankAutoUpload(int i4) {
        this.rankAutoUpload = i4;
    }

    public void setRankMiniTime(int i4) {
        this.rankMiniTime = i4;
    }

    public void setRankingID(String str) {
        this.rankingID = str;
    }

    public void setResult_show_type(String str) {
        this.result_show_type = str;
    }

    public void setRolesJson(String str) {
        this.rolesJson = str;
    }

    public void setRomPath(String str) {
        this.romPath = str;
    }

    public void setRoomID(String str) {
        this.roomID = str;
    }

    public void setRoomMode(int i4) {
        this.RoomMode = i4;
    }

    public void setRoomSilent(int i4) {
        this.roomSilent = i4;
    }

    public void setScoreBoard(int i4) {
        this.scoreBoard = i4;
    }

    public void setServerIP(String str) {
        this.serverIP = str;
    }

    public void setServerPort(String str) {
        this.serverPort = str;
    }

    public void setSopath(String str) {
        this.sopath = str;
    }

    public void setSp(int i4) {
        this.sp = i4;
    }

    public void setStartMode(int i4) {
        this.startMode = i4;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public void setTagId(int i4) {
        this.tagId = i4;
    }

    public void setTcptype(int i4) {
        this.tcptype = i4;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setTourist(boolean z4) {
        this.tourist = z4;
    }

    public void setType(int i4) {
        this.type = i4;
    }

    public void setUdpIP(String str) {
        this.udpIP = str;
    }

    public void setUdpport(int i4) {
        this.udpport = i4;
    }

    public void setUserID(String str) {
        this.userID = str;
    }

    public void setUserIcon(String str) {
        this.userIcon = str;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public void setVerCode(String str) {
        this.verCode = str;
    }

    public void setVersion(int i4) {
        this.version = i4;
    }

    public void setVipLevel(int i4) {
        this.vipLevel = i4;
    }

    public void setVip_expire_time(long j4) {
        this.vip_expire_time = j4;
    }

    public void setsVipLevel(int i4) {
        this.sVipLevel = i4;
    }

    public String toString() {
        return "StartGameMeta{allowPeripheralJoin=" + this.allowPeripheralJoin + ", allowPcJoin=" + this.allowPcJoin + ", udpIP='" + this.udpIP + "', RoomMode=" + this.RoomMode + ", packageName='" + this.packageName + "', activityName='" + this.activityName + "', romPath='" + this.romPath + "', startMode=" + this.startMode + ", userID='" + this.userID + "', gameID='" + this.gameID + "', version=" + this.version + ", roomID='" + this.roomID + "', serverIP='" + this.serverIP + "', serverPort='" + this.serverPort + "', porder=" + this.porder + ", type=" + this.type + ", plugin_area_val=" + this.plugin_area_val + ", tourist=" + this.tourist + ", p1Name='" + this.p1Name + "', p2Name='" + this.p2Name + "', emuType='" + this.emuType + "', oldGame=" + this.oldGame + ", clientIp='" + this.clientIp + "', udpport=" + this.udpport + ", tcptype=" + this.tcptype + ", ramCheck='" + this.ramCheck + "', netState='" + this.netState + "', token='" + this.token + "', cheat=" + this.cheat + ", userName='" + this.userName + "', userIcon='" + this.userIcon + "', netMode=" + this.netMode + ", netPlayers=" + this.netPlayers + ", gamePlayers=" + this.gamePlayers + ", groupId=" + this.groupId + ", area='" + this.area + "', adDatas=" + this.adDatas + ", vipLevel=" + this.vipLevel + ", sVipLevel=" + this.sVipLevel + ", vip_expire_time=" + this.vip_expire_time + ", result_show_type='" + this.result_show_type + "', pa_package_name='" + this.pa_package_name + "', roomSilent=" + this.roomSilent + ", fastIP='" + this.fastIP + "', gametype=" + this.gametype + ", cheatEnable=" + this.cheatEnable + ", rankingID='" + this.rankingID + "', assetspath='" + this.assetspath + "', sopath='" + this.sopath + "', classname='" + this.classname + "', apkOrSo=" + this.apkOrSo + ", sp=" + this.sp + '}';
    }
}
