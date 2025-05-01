package com.join.mgps.Util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.MApplication;
import com.join.mgps.dto.APKVersionRequestargs;
import com.join.mgps.dto.AllAppId;
import com.join.mgps.dto.AppDataBackupBean;
import com.join.mgps.dto.ArchiveBuyArgs;
import com.join.mgps.dto.ArchiveColudArgs;
import com.join.mgps.dto.ArchiveevaluateArgs;
import com.join.mgps.dto.ArchiveshopArgs;
import com.join.mgps.dto.BootPageRequestArgs;
import com.join.mgps.dto.ClassifyGameBean;
import com.join.mgps.dto.CollectionCommentRequest;
import com.join.mgps.dto.CommentCreateArgs;
import com.join.mgps.dto.CommentModifyArgs;
import com.join.mgps.dto.CommentPraiseRequestBean;
import com.join.mgps.dto.CommentRequest;
import com.join.mgps.dto.CommentRequestPageBean;
import com.join.mgps.dto.CommentSelfRequestBean;
import com.join.mgps.dto.CommentSendMessageRequestBean;
import com.join.mgps.dto.CommitRequestBean;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.CommonRequestMessage;
import com.join.mgps.dto.DeleteCommentArgs;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GameInformationCommentRequest;
import com.join.mgps.dto.GamePariseRequest;
import com.join.mgps.dto.GameSortRequestBean;
import com.join.mgps.dto.GameTopicRequestBean;
import com.join.mgps.dto.GameVerByBgRequestargs;
import com.join.mgps.dto.GamedetialCommentRequest;
import com.join.mgps.dto.GiftPackageArgs;
import com.join.mgps.dto.GiftPackageInfoArgs;
import com.join.mgps.dto.GiftPackageOperationArgs;
import com.join.mgps.dto.HaveGameListArgs;
import com.join.mgps.dto.HomeGameCarefullyRequestArgs;
import com.join.mgps.dto.HomeGameCarefullyRequestArgs2;
import com.join.mgps.dto.IgnoreNoticeRequestArgs;
import com.join.mgps.dto.InformationRequestBean;
import com.join.mgps.dto.InformationSendRequestBean;
import com.join.mgps.dto.PariseRequest;
import com.join.mgps.dto.RecomRequestAdIdArgs;
import com.join.mgps.dto.RecomRequestArgs;
import com.join.mgps.dto.RecomRequestBannerAndTableBean;
import com.join.mgps.dto.RecomRequestBannerAndTableMessage;
import com.join.mgps.dto.RecomRequestBean;
import com.join.mgps.dto.RecomRequestMessage;
import com.join.mgps.dto.RegisterRequestBean;
import com.join.mgps.dto.RequestAppDetialArgs;
import com.join.mgps.dto.RequestArenaRoomListArgs;
import com.join.mgps.dto.RequestBattlehallArgs;
import com.join.mgps.dto.RequestClassifyArgs;
import com.join.mgps.dto.RequestCollectionArgs;
import com.join.mgps.dto.RequestCommentAllListArgs;
import com.join.mgps.dto.RequestCommentDetailArgs;
import com.join.mgps.dto.RequestCommentpraiseArgs;
import com.join.mgps.dto.RequestCommitArgs;
import com.join.mgps.dto.RequestCommitReplyArgs;
import com.join.mgps.dto.RequestCompanyIdPnArgs;
import com.join.mgps.dto.RequestCompanyNameArgs;
import com.join.mgps.dto.RequestDownloadCenterArgs;
import com.join.mgps.dto.RequestGameArgs;
import com.join.mgps.dto.RequestGameCommentArgs;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestGoogleRankArgs;
import com.join.mgps.dto.RequestHandShankAdListArgs;
import com.join.mgps.dto.RequestInfoIdArgs;
import com.join.mgps.dto.RequestKeywordArgs;
import com.join.mgps.dto.RequestModuleArgs;
import com.join.mgps.dto.RequestMsgStateArge;
import com.join.mgps.dto.RequestPnAndPcAndUidArgs;
import com.join.mgps.dto.RequestPnAndPcArgs;
import com.join.mgps.dto.RequestPnArgs;
import com.join.mgps.dto.RequestPraiseArgs;
import com.join.mgps.dto.RequestSNKGameArgs;
import com.join.mgps.dto.RequestScreenshortListArgs;
import com.join.mgps.dto.RequestSearchPageArgs;
import com.join.mgps.dto.RequestSiliencebean;
import com.join.mgps.dto.RequestSimulatorArgs;
import com.join.mgps.dto.RequestStatsArgs;
import com.join.mgps.dto.RequestTypePn;
import com.join.mgps.dto.RequestUserCenterArgs;
import com.join.mgps.dto.RequestWarArgs;
import com.join.mgps.dto.RequestWarIndexArgs;
import com.join.mgps.dto.RequestdetialFolowAndBeSpeak;
import com.join.mgps.dto.SendAppinfoMainbean;
import com.join.mgps.dto.SimulatorAreaRequest;
import com.join.mgps.pref.PrefDef_;
import com.ss.android.download.api.constant.BaseConstants;
import com.switfpass.pay.MainApplication;
import com.tencent.stat.DeviceInfo;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class RequestBeanUtil {
    private static String androidId = null;
    private static String androidIdx = null;
    private static String channel_num = null;
    private static String end = null;
    private static String imei = null;
    private static String ip_address = null;
    private static String mac = null;
    private static String mobile_phone_model = null;
    private static RequestBeanUtil ourInstance = null;
    private static int targetvVersion = 0;
    private static String versionAndVersionName = "1_1.0";
    private String ad;

    private RequestBeanUtil(Context context) {
        if (ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.f55583c) != 0) {
            PrefDef_ prefDef_ = new PrefDef_(context);
            if (!y.u(prefDef_.lastApplyReadPhonePermission().d().longValue())) {
                UtilsMy.O2(context, com.kuaishou.weapon.p0.g.f55583c);
                prefDef_.lastApplyReadPhonePermission().g(Long.valueOf(System.currentTimeMillis()));
            }
        } else {
            com.papa.sim.statistic.pref.b.k(context).F(true);
        }
        this.ad = com.papa.sim.statistic.k.a(context);
        targetvVersion = d1.b(context);
        androidIdx = !TextUtils.isEmpty(MApplication.H) ? MApplication.H : Settings.System.getString(context.getContentResolver(), "android_id");
        String str = androidIdx + "gzRN53VWRF9BYUXomg2014";
        end = x0.d(str);
        StringBuilder sb = new StringBuilder();
        sb.append("imei   shi ");
        sb.append(imei);
        sb.append("  md5String=  ");
        sb.append(str);
        sb.append("   end=");
        sb.append(end);
        channel_num = com.papa.sim.statistic.k.a(context);
        mobile_phone_model = "";
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            versionAndVersionName = packageInfo.versionCode + "_" + packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
        }
    }

    public static String getAndroidId() {
        return androidIdx;
    }

    public static String getChannel_num() {
        return channel_num;
    }

    public static String getEnd() {
        return end;
    }

    public static String getImei() {
        return imei;
    }

    public static RequestBeanUtil getInstance(Context context) {
        if (ourInstance == null) {
            ourInstance = new RequestBeanUtil(context);
        }
        try {
            if (g2.i(androidIdx)) {
                end = x0.d(androidIdx + "gzRN53VWRF9BYUXomg2014");
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return ourInstance;
    }

    public static String getIp_address() {
        return ip_address;
    }

    public static String getMac() {
        return mac;
    }

    public static String getMobile_phone_model() {
        return mobile_phone_model;
    }

    public static int getTargetvVersion() {
        return targetvVersion;
    }

    public static String getVersionAndVersionName() {
        return versionAndVersionName;
    }

    private void setCommentCommonFields(CommentRequest commentRequest, @Nullable String str, @Nullable String str2) {
        commentRequest.setVersion(versionAndVersionName);
        commentRequest.setDevice_id("");
        commentRequest.setMac("");
        commentRequest.setIp_address("");
        commentRequest.setChannel_num(channel_num);
        commentRequest.setSort("");
        commentRequest.setMobile_phone_model("");
        commentRequest.setUid(str);
        commentRequest.setToken(str2);
    }

    public static void setImei(String str) {
        imei = str;
    }

    public static void setMobile_phone_model(String str) {
        mobile_phone_model = str;
    }

    public String getAd() {
        return this.ad;
    }

    public CommonRequestBean getAllMygameVersion(String[] strArr, int i4, String str) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadGameVer", new AllAppId(strArr, i4, str)));
    }

    public CommonRequestBean getApkVersion(int i4, int i5, int i6) {
        try {
            if (targetvVersion == 0) {
                targetvVersion = d1.b(MainApplication.getContext());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return new CommonRequestBean(versionAndVersionName, imei, androidId, DeviceInfo.TAG_VERSION, channel_num, end, new CommonRequestMessage("chkAppVerV2", new APKVersionRequestargs(i4, i5, i6, targetvVersion)), targetvVersion);
    }

    public CommonRequestBean getAppDataBackRequest(String[] strArr) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new AppDataBackupBean(strArr, 1)));
    }

    public RecomRequestBean<RequestAppDetialArgs> getAppDetialBean(String str, int i4, ExtBean extBean) {
        if (extBean == null) {
            extBean = new ExtBean();
        }
        return new RecomRequestBean<>(versionAndVersionName, imei, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new RecomRequestMessage("getGameInfo", new RequestAppDetialArgs(str, i4), extBean));
    }

    public ArchiveBuyArgs getArchiveBuy(String str, String str2, String str3, int i4) {
        return new ArchiveBuyArgs(str, str2, str3, i4);
    }

    public ArchiveColudArgs getArchiveColud(String str, String str2, String str3) {
        return new ArchiveColudArgs(str, str2, str3);
    }

    public ArchiveevaluateArgs getArchiveEvaluate(String str, String str2, String str3, int i4) {
        return new ArchiveevaluateArgs(str, str2, str3, i4);
    }

    public ArchiveColudArgs getArchiveNum(String str, String str2, String str3) {
        return new ArchiveColudArgs(str, str2, str3);
    }

    public ArchiveshopArgs getArchiveshop(String str, String str2, String str3, int i4, int i5) {
        return new ArchiveshopArgs(str, str2, str3, i4, i5);
    }

    public CommonRequestBean getBaiduAd() {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestPnArgs()));
    }

    public CommonRequestBean getBattlehall(int i4, int i5, int i6) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestBattlehallArgs(i4, i5, i6)));
    }

    public CommonRequestBean getBootPageData(BootPageRequestArgs bootPageRequestArgs) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(bootPageRequestArgs));
    }

    public CommonRequestBean getCategoryRequestBean() {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("getGameTypeList", new ArrayList()));
    }

    public CommonRequestBean getClassifyAndroidRequestBean(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadAndroidModuleTitle", new RequestPnArgs(i4)));
    }

    public CommonRequestBean getClassifyFCRequestBean(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadFcModuleTitle", new RequestPnArgs(i4)));
    }

    public CommonRequestBean getClassifyGBARequestBean(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadGbaModuleTitle", new RequestPnArgs(i4)));
    }

    public CommonRequestBean getClassifyGameBean(int i4, int i5) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("", new ClassifyGameBean(i4, i5)));
    }

    public CommonRequestBean getClassifyJGRequestBean(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadArcadeModuleTitle", new RequestPnArgs(i4)));
    }

    public CommonRequestBean getClassifyMdRequestBean(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadMdModuleTitle", new RequestPnArgs(i4)));
    }

    public CommonRequestBean getClassifyPSPRequestBean(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadPspModuleTitle", new RequestPnArgs(i4)));
    }

    public CommonRequestBean getClassifySFCRequestBean(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadSfcModuleTitle", new RequestPnArgs(i4)));
    }

    public CommonRequestBean getCollectionRequestBean(String str, int i4, int i5, String str2, String str3, ExtBean extBean) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("getCollectionGameList", new RequestCollectionArgs(str, i4, i5, str2, str3), extBean));
    }

    public RequestCommentDetailArgs getCommentDetailList(String str, String str2, String str3, int i4, int i5, int i6, String str4, String str5) {
        return new RequestCommentDetailArgs(str, str2, str3, i4, i5, i6, str4, mac, ip_address, str5, versionAndVersionName, imei, channel_num);
    }

    public CommonRequestBean<CommentRequestPageBean> getCommentListBean(String str, int i4, int i5) {
        return new CommonRequestBean<>(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("getCommentList", new CommentRequestPageBean(str, i4, i5)));
    }

    public CommentPraiseRequestBean getCommentPraiseRequestBean(String str, String str2, String str3, int i4, String str4, int i5) {
        CommentPraiseRequestBean commentPraiseRequestBean = new CommentPraiseRequestBean();
        setCommentCommonFields(commentPraiseRequestBean, str, str2);
        commentPraiseRequestBean.setComment_id(i4 + "");
        commentPraiseRequestBean.setGame_id(str4 + "");
        commentPraiseRequestBean.setType(i5);
        commentPraiseRequestBean.setUser_token(str3);
        return commentPraiseRequestBean;
    }

    public CommonRequestBean getCommentRequestData(CommonRequestMessage commonRequestMessage) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, commonRequestMessage);
    }

    public CommonRequestBean getCommuityRequestBean(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("getCommunityBanner", new RequestPnArgs(i4)));
    }

    public CommonRequestBean getCommuityZoneRequestBean(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("area_id", new RequestPnArgs(i4)));
    }

    public CommonRequestBean getCompanyGameListData(int i4, String str) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestCompanyNameArgs(i4, str)));
    }

    public CommonRequestBean getCrackRequestBean() {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("getCrackModuleTitle", new ArrayList()));
    }

    public CommentCreateArgs getCreateCommentBean(String str, float f5, String str2, String str3, String str4, int i4, String str5, String str6, String str7, String str8, int i5, int i6, int i7) {
        return new CommentCreateArgs(str, f5, str2, str3, str4, i4, str5, str6, str7, str8, i5, ip_address, mac, 0, "0", "", "0", versionAndVersionName, imei, channel_num, i6, i7);
    }

    public CommonRequestBean getDefalutRequestBean(Object obj) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadSimulatorAloneTopIndex", obj));
    }

    public DeleteCommentArgs getDeleteComment(String str, String str2, String str3, String str4, String str5, int i4, int i5) {
        return new DeleteCommentArgs(str2, versionAndVersionName, imei, mac, ip_address, channel_num, str3, str4, str, i4, str5, i5);
    }

    public CommonRequestBean getDetialFollowAnd(RequestdetialFolowAndBeSpeak requestdetialFolowAndBeSpeak) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(requestdetialFolowAndBeSpeak));
    }

    public CommonRequestBean getDetialImfMore(String str, int i4, int i5, int i6) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestGameIdArgs(str, i4, i5, i6)));
    }

    public CommonRequestBean getDetialmoreServer(String str) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestGameIdArgs(str, 1, 0, 0)));
    }

    public RecomRequestBean<RequestAppDetialArgs> getDownDeductCoin(String str, String str2, int i4, ExtBean extBean) {
        if (extBean == null) {
            extBean = new ExtBean();
        }
        return new RecomRequestBean<>(versionAndVersionName, imei, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new RecomRequestMessage("getGameInfo", new RequestAppDetialArgs(str, str2, i4), extBean));
    }

    public CommonRequestBean getDownloadCenterRequestBean() {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, end, new CommonRequestMessage(new RequestDownloadCenterArgs()));
    }

    public CommonRequestBean getEverdayNew(int i4, ExtBean extBean) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadEveryDayNewGame", new RequestSimulatorArgs(i4), extBean));
    }

    public CommonRequestBean<RequestSimulatorArgs> getEverdayNewGame(int i4, int i5, ExtBean extBean) {
        return new CommonRequestBean<>(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadEveryDayNewGame", new RequestSimulatorArgs(i4, i5), extBean));
    }

    public CommonRequestBean getExclusiveTagBean() {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("getExclusiveTag", new ArrayList()));
    }

    public CommonRequestBean getExitRequest() {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadAppOut", new RequestSimulatorArgs()));
    }

    public CommonRequestBean getFloatadRequestBean() {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage(new ArrayList()));
    }

    public CommonRequestBean getGRedPointNum(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, end, new CommonRequestMessage(new HomeGameCarefullyRequestArgs2(i4)));
    }

    public CommonRequestBean getGameCommentListRequestBean(int i4, int i5, int i6, String str, int[] iArr) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("getGameCommentList", new RequestCommitArgs(iArr, i4, i5, str, i6)));
    }

    public CommonRequestBean getGameDetailParis(GamePariseRequest gamePariseRequest) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(gamePariseRequest));
    }

    public CommonRequestBean getGameDiscoverRequestBean(int i4, int i5, ExtBean extBean) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("getGameDiscover", new RequestPnAndPcArgs(i4, i5), extBean));
    }

    public CommonRequestBean getGameInformationComment(GameInformationCommentRequest gameInformationCommentRequest) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(gameInformationCommentRequest));
    }

    public CommonRequestBean getGameInformationParis(PariseRequest pariseRequest) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(pariseRequest));
    }

    public CommonRequestBean getGameListRequestBean(int i4, String str, int i5, String str2, String str3) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("getGameList", new RequestGameArgs(i4, str, i5, str2, str3, new int[]{1, 2, 3, 4, 5, 6, 7})));
    }

    public CommonRequestBean getGameMainData(String str, int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestGameIdArgs(str, 1, 1, i4)));
    }

    public CommonRequestBean getGameOLGiftRequest(int i4, int i5, int i6) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage(new RequestPnAndPcAndUidArgs(i4, i5, i6)));
    }

    public CommonRequestBean getGameOLRequest(int i4, int i5) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage(new RequestPnAndPcArgs(i4, i5)));
    }

    public CommonRequestBean getGameReplyMessageRequestBean(int i4, int i5, String str) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, end, new CommonRequestMessage(new HomeGameCarefullyRequestArgs2(i4, i5, str)));
    }

    public CommonRequestBean getGameSortRequestBean(String str, String str2) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("", new GameSortRequestBean(str, str2)));
    }

    public CommonRequestBean getGameTopicRequestBean(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("", new GameTopicRequestBean(i4)));
    }

    public RecomRequestBean<GameVerByBgRequestargs> getGameVerByBgArgs(String str, int i4, String str2) {
        return new RecomRequestBean<>(versionAndVersionName, imei, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new RecomRequestMessage("getGameInfo", new GameVerByBgRequestargs(str, i4, str2), new ExtBean()));
    }

    public CommonRequestBean getGame_tag_game_list(int i4, int i5, String str, String str2) {
        String str3 = versionAndVersionName;
        String str4 = imei;
        String str5 = androidId;
        String str6 = channel_num;
        String str7 = end;
        return new CommonRequestBean(str3, str4, str5, str6, str7, new CommonRequestMessage(new RequestGameIdArgs(i4, i5 + "", str2, str)));
    }

    public GamedetialCommentRequest getGamedetialCommentRequest(String str, String str2, String str3) {
        GamedetialCommentRequest gamedetialCommentRequest = new GamedetialCommentRequest();
        gamedetialCommentRequest.setChannel_num(channel_num);
        gamedetialCommentRequest.setDevice_id(imei);
        gamedetialCommentRequest.setGame_id(str);
        gamedetialCommentRequest.setIp_address(ip_address);
        gamedetialCommentRequest.setMac(mac);
        gamedetialCommentRequest.setMobile_phone_model(mobile_phone_model);
        gamedetialCommentRequest.setPc("1");
        gamedetialCommentRequest.setPn("1");
        gamedetialCommentRequest.setSort("desc");
        gamedetialCommentRequest.setToken(str2);
        gamedetialCommentRequest.setUid(str3);
        gamedetialCommentRequest.setVersion(versionAndVersionName);
        return gamedetialCommentRequest;
    }

    public CommonRequestBean getGamedetialModleFourData(String str, int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestGameIdArgs(str, 1, 1, i4)));
    }

    public CommonRequestBean getGiftPackageInfoRequestBean(int i4, int i5) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("", new GiftPackageInfoArgs(i4, i5)));
    }

    public CommonRequestBean getGiftPackageOperationRequestBean(int i4, int i5, String str) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("", new GiftPackageOperationArgs(i4, i5, str)));
    }

    public CommonRequestBean getGiftPackageRequestBean(int i4, int i5, int i6, String str) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("", new GiftPackageArgs(i4, i5, i6, str)));
    }

    public CommonRequestBean getHandShankAdList() {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestHandShankAdListArgs(1, 1, "test")));
    }

    public RecomRequestBean<HaveGameListArgs> getHaveGameListArgs(String str, String str2, String str3) {
        return new RecomRequestBean<>(versionAndVersionName, imei, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new RecomRequestMessage("getHaveGameListArgs", new HaveGameListArgs(str, str2, str3), new ExtBean()));
    }

    public CommonRequestBean getHomeGameCarefullyRequestBean(int i4, int i5, String str) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("game_carefully", new HomeGameCarefullyRequestArgs(i4, i5, str), new ExtBean()));
    }

    public CommonRequestBean getHomePopupAd(boolean z4, int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestPnAndPcAndUidArgs(z4, i4)));
    }

    public CommonRequestBean getHotGame(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("popularList", new RequestSimulatorArgs(i4)));
    }

    public CommonRequestBean getIgnoreMessageRequest(int i4, int i5, String str) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new IgnoreNoticeRequestArgs(i4, i5, str)));
    }

    public CommonRequestBean getInformationComment(String str, int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("getInformationCommentList", new InformationRequestBean(str, i4, new Integer[]{1, 2})));
    }

    public CommonRequestBean getInformationIndexRequestBean(int i4, ExtBean extBean) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("getInformationIndex", new RequestPnArgs(i4), extBean));
    }

    public CommonRequestBean getLargeModuleRequestBean() {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("getLargeModuleTitle", new ArrayList()));
    }

    public CommonRequestBean getLodingImage() {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadAppStart", new RequestSimulatorArgs()));
    }

    public CommonRequestBean getLookOther(int i4, ExtBean extBean) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadRecentlyGameOther", new RequestSimulatorArgs(i4), extBean));
    }

    public CommentModifyArgs getModifyCommentBean(String str, String str2, String str3, int i4, String str4, String str5, String str6, float f5, int i5) {
        return new CommentModifyArgs(str, versionAndVersionName, imei, mac, ip_address, channel_num, str2, str3, i4, str4, str5, str6, f5, 1, 0, i5);
    }

    public CommonRequestBean getModuleListRequestBean(int i4, int i5, int i6) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("getModuleList", new RequestModuleArgs(i4, i5, i6)));
    }

    public CommonRequestBean getMustplay(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage(com.googlecode.mp4parser.boxes.apple.x0.f13710s, new RecomRequestArgs(i4)));
    }

    public CommonRequestBean getMyGameTopAd(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestPnAndPcAndUidArgs(1, 1, i4)));
    }

    public CommonRequestBean getNowWufun(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("getGameDiscover", new RequestPnAndPcArgs(i4, 10)));
    }

    public CommonRequestBean getOnLineNumber(String[] strArr) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("getGameUv", new AllAppId(strArr)));
    }

    public CommonRequestBean getPAPAHomeMain(int i4, int i5, int i6, String str, String str2) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage(new RecomRequestAdIdArgs(i4, i5, i6, str, str2)));
    }

    public CommonRequestBean getPabiIntentBean() {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, null);
    }

    public CommonRequestBean getPraiceMessPra(int i4, int i5, String str) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, end, new CommonRequestMessage(new HomeGameCarefullyRequestArgs2(i4, i5, str)));
    }

    public RequestCommentpraiseArgs getPraiseComment(String str, String str2, String str3, String str4, String str5, int i4, int i5, int i6) {
        return new RequestCommentpraiseArgs(str2, mac, ip_address, str3, str, i4, str4, str5, versionAndVersionName, imei, channel_num, i5, i6);
    }

    public CommonRequestBean getPreloadingADRequestBean() {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, end, null);
    }

    public CommonRequestBean getRankingV3(RequestTypePn requestTypePn) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(requestTypePn));
    }

    public RecomRequestBannerAndTableBean getRecomRequestBannerAndTableBean() {
        return new RecomRequestBannerAndTableBean(versionAndVersionName, imei, com.googlecode.mp4parser.boxes.apple.x0.f13710s, end, new RecomRequestBannerAndTableMessage("loadTopIndex", new ArrayList()));
    }

    public RecomRequestBean<RecomRequestArgs> getRecomRequestBean(int i4) {
        return new RecomRequestBean<>("1.0", imei, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new RecomRequestMessage("loadSimulatorAloneRecList", new RecomRequestArgs(i4)));
    }

    public CommonRequestBean getRecomRequestFirstData() {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadSimulatorAloneTopIndex", new RecomRequestArgs(1)));
    }

    public CommonRequestBean getRecomeAppwifi(int i4, int i5) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestPnAndPcArgs(i4, i5)));
    }

    public CommentCreateArgs getReplyCreateCommentBean(String str, float f5, String str2, String str3, String str4, int i4, String str5, String str6, String str7, String str8, int i5, String str9, String str10, String str11, int i6) {
        return new CommentCreateArgs(str, f5, str2, str3, str4, i4, str5, str6, str7, str8, i5, ip_address, mac, 0, str9, str10, str11, versionAndVersionName, imei, channel_num, i6, 3);
    }

    public CommonRequestBean getRequestArenaRoomListArgs(String str, int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestArenaRoomListArgs(str, i4)));
    }

    public RequestCommentAllListArgs getRequestCommentAllList(int i4, int i5, String str, int i6, String str2) {
        return new RequestCommentAllListArgs(i4, i5, str, i6, mobile_phone_model, str2, mac, ip_address, versionAndVersionName, imei, channel_num);
    }

    public CommonRequestBean getRequestGameFactoryList(int i4, int i5) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestCompanyIdPnArgs(i4, i5)));
    }

    public CommonRequestBean getRequestMsgState(int i4, String str, int i5) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestMsgStateArge(i4, str, i5)));
    }

    public CommonRequestBean getRequestPnAndPc(int i4, int i5) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestPnAndPcArgs(i4, i5)));
    }

    public CommonRequestBean getRequestPnAndPcByAreaAndRank(int i4, int i5, int i6, int i7) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestGoogleRankArgs(i6, i7, i4, i5)));
    }

    public CommonRequestBean getSNKGameCheckRequestBean(String str) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, end, new CommonRequestMessage(new RequestSNKGameArgs(str)));
    }

    public CommonRequestBean getScreenShortListRequest(String str, int i4, int i5) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestScreenshortListArgs(i5, str, i4)));
    }

    public CommonRequestBean getSearchAutoRequestBean(String str, String str2, int i4, int i5, int i6, int i7) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, BaseConstants.MARKET_URI_AUTHORITY_SEARCH, channel_num, end, new CommonRequestMessage(str, new RequestKeywordArgs(str2, i4, i5, i6, i7)));
    }

    public CommonRequestBean getSearchIntegratedRequestBean(String str, int i4, int i5) {
        return getSearchIntegratedRequestBean(str, i4, i5, 0, 0, "0");
    }

    public CommonRequestBean getSearchPageRequestBean(int i4, String str) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, BaseConstants.MARKET_URI_AUTHORITY_SEARCH, channel_num, end, new CommonRequestMessage(BaseConstants.MARKET_URI_AUTHORITY_SEARCH, new RequestSearchPageArgs(i4, str)));
    }

    public CommonRequestBean getSearchRecommendBean(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadRandomGame", null));
    }

    public CommonRequestBean getSearchRecommendRequestBean() {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("recommendgame", new ArrayList()));
    }

    public CommonRequestBean getShowViewDatas() {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("getStrategyInfo", null));
    }

    public CommonRequestBean getSilenceSwitch(String str, int i4, int i5) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestSiliencebean(i4, i5, str)));
    }

    public RecomRequestBean getSimulatorIndexRequestBean(String str, int i4) {
        return new RecomRequestBean(versionAndVersionName, imei, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new RecomRequestMessage("", new SimulatorAreaRequest(str, i4), null));
    }

    public CommonRequestBean getSimulatorListRequestBean(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadSimulatorList", new RequestSimulatorArgs(i4)));
    }

    public CommonRequestBean<RequestGameIdArgs> getSimulatorRequest(String str, String str2, int i4) {
        return new CommonRequestBean<>(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestGameIdArgs(str2, str, i4)));
    }

    public CommonRequestBean getSimulatorRequestBean() {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadSimulatorTopIndex", new ArrayList()));
    }

    public CommonRequestBean getStandAloneOne() {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, end, null);
    }

    public CommonRequestBean getStandAloneTwo(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, end, new CommonRequestMessage("StandAlone", new RequestPnArgs(i4)));
    }

    public CommonRequestBean getStats(RequestStatsArgs requestStatsArgs) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, "add", channel_num, end, new CommonRequestMessage("commitStatistics", requestStatsArgs));
    }

    public CommonRequestBean getTagGameListData(int i4, int i5) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestGameIdArgs("123456", i4, i5, 0)));
    }

    public CommentRequest getTokenRequestBean(String str, String str2) {
        CommentRequest commentRequest = new CommentRequest();
        setCommentCommonFields(commentRequest, str, str2);
        return commentRequest;
    }

    public CommonRequestBean getUserCenterViewConfigs(int i4, String str, int i5) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestUserCenterArgs(i4, str, i5)));
    }

    public CommonRequestBean getWarListRequestBean(int i4, int i5) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadWarModuleList", new RequestWarArgs(i4, i5)));
    }

    public CommonRequestBean getgameInformation(String str, ExtBean extBean) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("getInformation", new RequestInfoIdArgs(str), extBean));
    }

    public CommonRequestBean loadWarIndexRequestBean(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("loadWarIndex", new RequestWarIndexArgs(i4)));
    }

    public CommonRequestBean personalCenter() {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestPnArgs()));
    }

    public CommonRequestBean postGameComment(CommitRequestBean commitRequestBean) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, "add", channel_num, end, new CommonRequestMessage("postGameComment", commitRequestBean));
    }

    public CommonRequestBean postGameCommentRelpyRequestBean(int i4, String str, String str2, String str3, String str4, String str5, int i5, String str6, String str7, String str8, int i6) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("postGameComment", new RequestCommitReplyArgs(i4, str, str2, str3, str4, str5, i5, str6, str7, str8, i6)));
    }

    public CommonRequestBean postGameCommentRequestBean(String str, int i4, String str2, String str3, String str4, String str5, int i5, String str6) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("postpraise", new RequestGameCommentArgs(str, i4, str2, str3, str4, str5, i5, str6)));
    }

    public CommonRequestBean postPraisedRequestBean(String str, int i4, String str2) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("postpraise", new RequestPraiseArgs(str, i4, str2)));
    }

    public CommentSelfRequestBean selfComment(int i4, String str, int i5, int i6, int i7) {
        CommentSelfRequestBean commentSelfRequestBean = new CommentSelfRequestBean();
        setCommentCommonFields(commentSelfRequestBean, i4 + "", str);
        commentSelfRequestBean.setUid(i4 + "");
        commentSelfRequestBean.setGame_id("");
        commentSelfRequestBean.setPn(i5);
        commentSelfRequestBean.setPc(i6);
        commentSelfRequestBean.setVuid(i7);
        return commentSelfRequestBean;
    }

    public CommonRequestBean sendAllAppinPhone(SendAppinfoMainbean sendAppinfoMainbean) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, "add", channel_num, end, new CommonRequestMessage("collectAppInfo", sendAppinfoMainbean));
    }

    public CommonRequestBean sendInformationComment(InformationSendRequestBean informationSendRequestBean) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, "add", channel_num, end, new CommonRequestMessage("postInformationComment", informationSendRequestBean));
    }

    public CommonRequestBean sendMessageComment(CommentSendMessageRequestBean commentSendMessageRequestBean) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, "add", channel_num, end, new CommonRequestMessage("commitComment", commentSendMessageRequestBean));
    }

    public CommonRequestBean sendRegisterId(RegisterRequestBean registerRequestBean) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, "add", channel_num, end, new CommonRequestMessage("regPushDevice", registerRequestBean));
    }

    public CommonRequestBean vipMessage(int i4) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(new RequestPnAndPcAndUidArgs(1, 1, i4)));
    }

    public CommonRequestBean getGameInformationComment(CollectionCommentRequest collectionCommentRequest) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, channel_num, end, new CommonRequestMessage(collectionCommentRequest));
    }

    public CommonRequestBean getGameListRequestBean(int i4, int i5, String str, String str2, int i6, String str3) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, com.googlecode.mp4parser.boxes.apple.x0.f13710s, channel_num, end, new CommonRequestMessage("getGameList", new RequestClassifyArgs(i4, i5, new int[]{1, 2, 3, 4, 5, 6, 7}, str, str2, i6, str3)));
    }

    public CommonRequestBean getSearchIntegratedRequestBean(String str, int i4, int i5, int i6, int i7, String str2) {
        RequestKeywordArgs requestKeywordArgs = new RequestKeywordArgs(str, i4, i5, i6, i7);
        requestKeywordArgs.setGame_id(str2);
        return new CommonRequestBean(versionAndVersionName, imei, androidId, BaseConstants.MARKET_URI_AUTHORITY_SEARCH, channel_num, end, new CommonRequestMessage("", requestKeywordArgs));
    }

    public CommonRequestBean getSearchPageRequestBean(int i4, String str, String str2) {
        return new CommonRequestBean(versionAndVersionName, imei, androidId, BaseConstants.MARKET_URI_AUTHORITY_SEARCH, channel_num, end, new CommonRequestMessage(BaseConstants.MARKET_URI_AUTHORITY_SEARCH, new RequestSearchPageArgs(i4, str, str2)));
    }

    public CommonRequestBean getApkVersion(int i4, int i5, int i6, int i7) {
        try {
            if (targetvVersion == 0) {
                targetvVersion = d1.b(MainApplication.getContext());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return new CommonRequestBean(versionAndVersionName, imei, androidId, DeviceInfo.TAG_VERSION, channel_num, end, new CommonRequestMessage("chkAppVerV2", new APKVersionRequestargs(i4, i5, i6, targetvVersion, i7)), targetvVersion);
    }
}
