package com.join.mgps.Util;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.MApplication;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.base.dialog.DialogActivityManager;
import com.join.kotlin.base.dialog.callback.IDialogActivityCallback;
import com.join.mgps.activity.AccountCenterNewActivity_;
import com.join.mgps.activity.BuildQRCodeActivity_;
import com.join.mgps.activity.CollectionCommentActivity_;
import com.join.mgps.activity.CommentDetailActivity_;
import com.join.mgps.activity.CommentSelfListActivityv2_;
import com.join.mgps.activity.DownloadSettingActivity_;
import com.join.mgps.activity.FaceTransferHomePageActivity_;
import com.join.mgps.activity.ForumActivity_;
import com.join.mgps.activity.ForumGroupMemberActivity_;
import com.join.mgps.activity.ForumMyActivity_;
import com.join.mgps.activity.ForumMyPostsActivity_;
import com.join.mgps.activity.ForumPostsTagSelectActivity_;
import com.join.mgps.activity.ForumProfileCommentActivity_;
import com.join.mgps.activity.ForumProfileFavoritesActivity_;
import com.join.mgps.activity.GameAndProfileActivity_;
import com.join.mgps.activity.GameMainActivity3_;
import com.join.mgps.activity.GameMainActivity4_;
import com.join.mgps.activity.HandShankNoActivity_;
import com.join.mgps.activity.HandShankOverActivity_;
import com.join.mgps.activity.HandShankYesActivity_;
import com.join.mgps.activity.MGMainActivity;
import com.join.mgps.activity.MGMainActivity_;
import com.join.mgps.activity.MGPapaAboutActivity_;
import com.join.mgps.activity.MYAccountDetialActivity_;
import com.join.mgps.activity.MyGameManagerActivity_;
import com.join.mgps.activity.OnlineGameInstallCheckActivity_;
import com.join.mgps.activity.PAPayCenterActivity_;
import com.join.mgps.activity.QuarkLoadingActivity_;
import com.join.mgps.activity.SearchHintActivity_;
import com.join.mgps.activity.SearchListActivity1_;
import com.join.mgps.activity.ShareWebActivity_;
import com.join.mgps.activity.TagGameListActivity_;
import com.join.mgps.activity.VoucherCodesBoxActivity_;
import com.join.mgps.activity.label.MainLabelActivity_;
import com.join.mgps.activity.login.ChangeAccountNickNameActivity_;
import com.join.mgps.activity.login.LoginCfgsBean;
import com.join.mgps.activity.login.LoginSplashActivity_;
import com.join.mgps.activity.message.FeedBackMessageDetailActivity_;
import com.join.mgps.activity.message.MessageMainActivity_;
import com.join.mgps.adapter.FullScreenActivity;
import com.join.mgps.adapter.FullScreenActivity_;
import com.join.mgps.db.tables.HandShankTable;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.SScrollingTxtBeanV2;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.service.CommonService_;
import com.papa91.arc.ext.ToastManager;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class IntentUtil {
    private static IntentUtil ourInstance;
    private DownloadTask downloadTask;
    private String gameid;
    private Intent intent2;
    private Activity splashActivity;

    private IntentUtil() {
    }

    private com.wufan.user.service.protobuf.n0 accountBean(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private void checkAndDownloadApk(Context context, DownloadTask downloadTask) {
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (status != 0) {
            if (status != 13) {
                if (status != 2) {
                    if (status != 3) {
                        if (status == 5) {
                            UtilsMy.T3(context, downloadTask);
                            return;
                        } else if (status != 6) {
                            if (status != 7) {
                                if (status == 42) {
                                    if (!com.join.android.app.common.utils.j.j(context)) {
                                        l2.a(context).b("无网络连接");
                                        return;
                                    } else {
                                        UtilsMy.r4(context, downloadTask);
                                        return;
                                    }
                                } else if (status != 43) {
                                    switch (status) {
                                        case 9:
                                            if (!com.join.android.app.common.utils.j.j(context)) {
                                                l2.a(context).b("无网络连接");
                                                return;
                                            } else {
                                                UtilsMy.I2(context, downloadTask);
                                                return;
                                            }
                                        case 10:
                                            break;
                                        case 11:
                                            UtilsMy.a4(downloadTask, context);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                            }
                        }
                    }
                    com.php25.PDownload.d.c(downloadTask, context);
                    return;
                }
                if (com.join.android.app.common.utils.j.j(context)) {
                    return;
                }
                l2.a(context).b("应用正在下载~");
                return;
            }
            com.php25.PDownload.d.l(context, downloadTask);
            return;
        }
        UtilsMy.l1(context, downloadTask);
    }

    public static IntentUtil getInstance() {
        if (ourInstance == null) {
            ourInstance = new IntentUtil();
        }
        return ourInstance;
    }

    private void showUserNotLogin(Context context) {
        l2.a(context).b(context.getResources().getString(R.string.forum_user_not_login));
    }

    public void checkAndStartMain(Context context, IntentDateBean intentDateBean, int i4) {
        if (!MGMainActivity.isCreated) {
            Intent intent = new Intent();
            intent.setClass(context, MGMainActivity_.class);
            intent.putExtra("intentActivityBean", intentDateBean);
            intent.setFlags(i4);
            context.startActivity(intent);
            return;
        }
        intentActivity(context, intentDateBean);
    }

    public void checkRealNameAndIntent(Context context, com.wufan.user.service.protobuf.n0 n0Var, String str, String str2) {
        if (!g2.i(str2) || startGameCheckRealnameHasIntent(context, n0Var, str, str2)) {
            return;
        }
        UtilsMy.W3(context, p1.f.K().F(str2), "login");
    }

    public Activity getSplashActivity() {
        return this.splashActivity;
    }

    public void goAccountCenterActivity(Context context) {
        AccountCenterNewActivity_.f0(context).start();
    }

    public void goAccountUpgradeActivity(Context context) {
        goMyAccountLoginActivity(context);
    }

    public void goBrowser(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        context.startActivity(intent);
    }

    public void goBuildQRCodeActivity(Context context) {
        BuildQRCodeActivity_.y0(context).start();
    }

    public void goChangeNickname(Context context) {
        ChangeAccountNickNameActivity_.intent(context).start();
    }

    public void goCheckIn(Context context) {
        if (goLoginInteractive(context)) {
            return;
        }
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setObject("签到");
        intentDateBean.setLink_type_val(com.join.mgps.rpc.h.N0);
        getInstance().intentActivity(context, intentDateBean);
    }

    public void goCodesBoxActivity(Context context) {
        com.wufan.user.service.protobuf.n0 accountBean = accountBean(context);
        if (goLoginNetGame(context)) {
            return;
        }
        VoucherCodesBoxActivity_.i0(context).b(0).a(accountBean.getUid()).start();
    }

    public void goCollectionCommentActivity(Context context, String str) {
        CollectionCommentActivity_.O0(context).b(str).start();
    }

    public void goColloctionList(Context context, String str, String str2) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(2);
        intentDateBean.setTpl_type(str);
        intentDateBean.setCrc_link_type_val(str2);
        getInstance().intentActivity(context, intentDateBean);
    }

    public void goCommentDetailActivity(Context context, String str, String str2, String str3) {
        CommentDetailActivity_.M1(context).b(str).f("green").e(1).d(str2).c(str3).start();
    }

    public void goCommentSelfListActivity(Context context) {
        if (goLogin(context)) {
            return;
        }
        CommentSelfListActivityv2_.H0(context).start();
    }

    public void goDownloadCenterActivity(Context context) {
        getInstance().goMyGameManagerActivity(context);
    }

    public void goDownloadSettingActivity(Context context) {
        DownloadSettingActivity_.B0(context).start();
    }

    public void goFaceTransferHomePageActivity(Context context) {
        FaceTransferHomePageActivity_.t0(context).start();
    }

    public void goFeedback(Context context) {
        if (goLogin(context)) {
            return;
        }
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setObject(context.getString(R.string.papa_feedback));
        intentDateBean.setLink_type_val(com.join.mgps.rpc.h.f54095w + "/papa_help");
        getInstance().intentActivity(context, intentDateBean);
    }

    public void goFormDetial(Context context, String str) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(8);
        intentDateBean.setLink_type_val(str);
        intentActivity(context, intentDateBean);
    }

    public void goForumAndPrfileActivity(int i4, Context context) {
        if (goLogin(context)) {
            return;
        }
        Intent intent = new Intent(context, GameAndProfileActivity_.class);
        intent.putExtra("type", i4);
        context.startActivity(intent);
    }

    public void goForumFid(Context context, int i4) {
        try {
            ForumBean forumBean = new ForumBean();
            forumBean.setFid(i4);
            j0.r0(context, forumBean);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void goForumGroupActivity(Context context, int i4) {
        ((ForumActivity_.q) ForumActivity_.U0(context).a(i4).flags(TTAdConstant.KEY_CLICK_AREA)).start();
    }

    public void goForumGroupMemberActivity(Context context, int i4) {
        ((ForumGroupMemberActivity_.j) ForumGroupMemberActivity_.B0(context).a(i4).flags(TTAdConstant.KEY_CLICK_AREA)).start();
    }

    public void goForumMyDynamicActivity(Context context) {
        if (goLogin(context)) {
            return;
        }
        ForumMyActivity_.u0(context).start();
    }

    public void goForumMyPostsActivity(Context context) {
        if (goLoginInteractive(context)) {
            return;
        }
        ForumMyPostsActivity_.V0(context).start();
    }

    public void goForumPostsTagSelectActivity(Context context, int i4, int i5, String str, int i6) {
        ((ForumPostsTagSelectActivity_.i) ForumPostsTagSelectActivity_.w0(context).a(i4).b(i5).extra("selectedTags", str)).c(i6).startForResult(10001);
    }

    public void goForumProfileCommentActivity(Context context) {
        if (goLoginInteractive(context)) {
            return;
        }
        ForumProfileCommentActivity_.F0(context).start();
    }

    public void goForumProfileFavoritesActivity(Context context) {
        if (goLogin(context)) {
            return;
        }
        ForumProfileFavoritesActivity_.V1(context).start();
    }

    public void goForumProfileMessageActivity(Context context) {
        if (goLogin(context)) {
            return;
        }
        MessageMainActivity_.k0(context).start();
    }

    public void goFullScrVideoPlayer(Context context, String str, String str2) {
        FullScreenActivity.VideoInfo videoInfo = new FullScreenActivity.VideoInfo();
        videoInfo.m(str2);
        FullScreenActivity_.i0(context).a(videoInfo).start();
    }

    public void goGameDetialActivity(Context context, String str, String str2, int i4, int i5) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(1);
        intentDateBean.setCrc_link_type_val(str);
        intentDateBean.setTpl_type(str2);
        intentDateBean.setJump_type(i4);
        ExtBean extBean = new ExtBean();
        extBean.set_from_type(i5);
        intentDateBean.setExtBean(extBean);
        intentActivity(context, intentDateBean);
    }

    public void goGameDetialActivityBYDownloadTAsk(Context context, DownloadTask downloadTask) {
        ExtBean extBean;
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(1);
        intentDateBean.setCrc_link_type_val(downloadTask.getCrc_link_type_val());
        intentDateBean.setTpl_type(downloadTask.getGame_info_tpl_type());
        intentDateBean.setJump_type(downloadTask.getSp_tpl_two_position());
        ExtBean extBean2 = new ExtBean(downloadTask.get_from_type());
        if (downloadTask.getExt() != null && (extBean = (ExtBean) JsonMapper.getInstance().fromJson(downloadTask.getExt(), ExtBean.class)) != null) {
            extBean2 = extBean;
        }
        intentDateBean.setExtBean(extBean2);
        intentActivity(context, intentDateBean);
    }

    public void goGameDetialActivityBYDownloadTaskForFav(Context context, DownloadTask downloadTask) {
        ExtBean extBean;
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(1);
        intentDateBean.setCrc_link_type_val(downloadTask.getCrc_link_type_val());
        if (downloadTask.getModInfoBean() != null && downloadTask.getModInfoBean().getMain_game_id() != null) {
            intentDateBean.setCrc_link_type_val(downloadTask.getModInfoBean().getMain_game_id());
        }
        intentDateBean.setTpl_type(downloadTask.getGame_info_tpl_type());
        intentDateBean.setJump_type(downloadTask.getSp_tpl_two_position());
        ExtBean extBean2 = new ExtBean(downloadTask.get_from_type());
        if (downloadTask.getExt() != null && (extBean = (ExtBean) JsonMapper.getInstance().fromJson(downloadTask.getExt(), ExtBean.class)) != null) {
            extBean2 = extBean;
        }
        intentDateBean.setExtBean(extBean2);
        intentActivity(context, intentDateBean);
    }

    public void goGameMainActivity(Context context, String str, String str2) {
        if (new PrefDef_(context).pageVersion().d().intValue() == 2) {
            ((GameMainActivity4_.i0) GameMainActivity4_.S2(context).b(str).a(str2).flags(TTAdConstant.KEY_CLICK_AREA)).start();
        } else {
            ((GameMainActivity3_.j0) GameMainActivity3_.m3(context).b(str).a(str2).flags(TTAdConstant.KEY_CLICK_AREA)).start();
        }
    }

    public void goJoystickManager(Context context) {
        if (Build.VERSION.SDK_INT < 15) {
            l2.a(context).b("你的手机暂不支持");
        } else if (BluetoothAdapter.getDefaultAdapter() == null) {
            ((HandShankOverActivity_.b) HandShankOverActivity_.h0(context).flags(TTAdConstant.KEY_CLICK_AREA)).start();
        } else {
            List<HandShankTable> o4 = b2.x.p().o();
            if (o4 != null && o4.size() != 0) {
                ((HandShankYesActivity_.g) HandShankYesActivity_.O0(context).flags(TTAdConstant.KEY_CLICK_AREA)).start();
            } else {
                ((HandShankNoActivity_.f) HandShankNoActivity_.I0(context).flags(TTAdConstant.KEY_CLICK_AREA)).start();
            }
        }
    }

    public void goLabelGroupActivity(Context context, String str) {
        IntentUtil intentUtil = getInstance();
        intentUtil.goShareWebActivity(context, com.join.mgps.rpc.h.f54059k + "/group/posts/forum_tags/tagSquare?fid=" + str);
    }

    public boolean goLogin(Context context) {
        return goLogin(context, 1);
    }

    public boolean goLoginBattle(Context context) {
        return goLogin(context, 2);
    }

    public boolean goLoginInteractive(Context context) {
        return goLogin(context, 3);
    }

    public boolean goLoginNetGame(Context context) {
        return goLogin(context, 4);
    }

    public void goMGMainActivity2Front(Context context, @NonNull Integer num, Integer num2, Integer num3) {
        Intent intent = new Intent();
        intent.setClass(context, MGMainActivity_.class);
        intent.setFlags(131072);
        Bundle bundle = new Bundle();
        bundle.putInt("MainPos", num.intValue());
        if (num2 != null) {
            bundle.putInt("classiFy", num2.intValue());
        }
        if (num3 != null) {
            bundle.putInt("classifyPrimaryIndex", num3.intValue());
        }
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    public void goMGSettingActivity(Context context) {
        MGPapaAboutActivity_.t0(context).start();
    }

    public void goMYAccountDetialActivity(Context context) {
        MYAccountDetialActivity_.T0(context).start();
    }

    public void goMainLabelActivity(Context context, int i4) {
        goMainLabelActivity(context, i4, "", 2);
    }

    public void goMyAccountLoginActivity(Context context) {
        goMyAccountLoginActivity(context, 0, 2);
    }

    public void goMyAccountLoginActivityNewTask(Context context) {
        LoginSplashActivity_.intent(context).start();
    }

    public void goMyGameManagerActivity(Context context) {
        if (context instanceof MGMainActivity) {
            ((MGMainActivity) context).setTabSelect(2);
        } else {
            MyGameManagerActivity_.g0(context).start();
        }
    }

    public void goMyVoucherActivity(Context context) {
        com.wufan.user.service.protobuf.n0 accountBean = accountBean(context);
        if (goLoginNetGame(context)) {
            return;
        }
        VoucherCodesBoxActivity_.i0(context).a(accountBean.getUid()).b(1).start();
    }

    public void goOnlineGameCheckPage(Context context, String str) {
        OnlineGameInstallCheckActivity_.t0(context).a(str).start();
    }

    public void goPAPayCenterActivity(Context context) {
        if (goLogin(context)) {
            return;
        }
        PAPayCenterActivity_.u0(context).start();
    }

    public void goQQChart(Context context, String str) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqwpa://im/chat?chat_type=wpa&uin=" + str + "&version=1")));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void goQQGroup(Context context, String str) {
        try {
            joinQQGroup(context, str);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void goReportFeedbackDetail(Context context, String str) {
        FeedBackMessageDetailActivity_.u0(context).a(str).start();
    }

    public void goSearchHintActivity(Context context) {
        SearchHintActivity_.G1(context).start();
    }

    public void goSearchListActivity(Context context, String str, boolean z4) {
        SearchListActivity1_.d1(context).e(str).d(z4).start();
    }

    public void goShareWebActivity(Context context, String str) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setLink_type_val(str);
        intentActivity(context, intentDateBean);
    }

    public void goShareWebActivityNewTask(Context context, IntentDateBean intentDateBean) {
        if (context == null) {
            return;
        }
        try {
            if (!context.getPackageName().equals("com.join.android.app.mgsim.wufun")) {
                Intent intent = new Intent();
                intent.putExtra("intentdate", intentDateBean);
                intent.setFlags(268435456);
                intent.setComponent(new ComponentName("com.join.android.app.mgsim.wufun", "com.join.mgps.activity.ShareWebActivity_"));
                context.startActivity(intent);
            } else {
                ((ShareWebActivity_.h0) ShareWebActivity_.t2(context).flags(268435456)).b(intentDateBean).start();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void goSmashGoldenEgg(Context context) {
        if (goLoginInteractive(context)) {
            return;
        }
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setObject("砸金蛋");
        intentDateBean.setLink_type_val(com.join.mgps.rpc.h.O0);
        getInstance().intentActivity(context, intentDateBean);
    }

    public void goSvip(Context context) {
        IntentUtil intentUtil = getInstance();
        intentUtil.goShareWebActivity(context, com.join.mgps.rpc.h.f54056j + "/member/vip_view/welcome?go=svip");
    }

    public void goTagGameListActivity(Context context, int i4, String str) {
        TagGameListActivity_.F0(context).b(0).e(i4).d(str).start();
    }

    public void goVip(Context context) {
        IntentUtil intentUtil = getInstance();
        intentUtil.goShareWebActivity(context, com.join.mgps.rpc.h.f54056j + "/member/vip_view/welcome?go=vip");
    }

    public void goVipCdk(Context context) {
        IntentUtil intentUtil = getInstance();
        intentUtil.goShareWebActivity(context, com.join.mgps.rpc.h.C + "/member/vip_view/welfare/cdk");
    }

    public void goVipForum(Context context) {
        IntentUtil intentUtil = getInstance();
        intentUtil.goShareWebActivity(context, com.join.mgps.rpc.h.C + "/member/vip_view/welfare/forum");
    }

    public void goVipMessage(Context context) {
        IntentUtil intentUtil = getInstance();
        intentUtil.goShareWebActivity(context, com.join.mgps.rpc.h.f54056j + "/member/vip_view/welfare/ad");
    }

    public void goWirelessSettings(Context context) {
        context.startActivity(new Intent("android.settings.SETTINGS"));
    }

    /* JADX WARN: Removed duplicated region for block: B:262:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x08b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void intentActivity(android.content.Context r17, com.join.mgps.Util.IntentDateBean r18) {
        /*
            Method dump skipped, instructions count: 2792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.Util.IntentUtil.intentActivity(android.content.Context, com.join.mgps.Util.IntentDateBean):void");
    }

    public boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 accountBean = accountBean(context);
        return accountBean != null && g2.i(accountBean.getToken());
    }

    public boolean isNotLogin(Context context) {
        return !isLogined(context) || isTourist(context);
    }

    public boolean isTourist(Context context) {
        return AccountUtil_.getInstance_(context).isTourist();
    }

    public boolean joinQQGroup(Context context, String str) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26k%3D" + str));
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void setSplashActivity(Activity activity) {
        this.splashActivity = activity;
    }

    public void startActivity(Context context, Class cls, Intent intent) {
        startActivityWithCallback(context, cls, intent, null);
    }

    public void startActivityWithCallback(Context context, Class cls, Intent intent, IDialogActivityCallback iDialogActivityCallback) {
        Intent intent2 = new Intent(context, cls);
        intent2.addFlags(268435456);
        if (iDialogActivityCallback != null) {
            intent2.putExtras(DialogActivityManager.get().registerCallback(cls, iDialogActivityCallback));
        }
        if (intent != null) {
            intent2.putExtras(intent);
        }
        context.startActivity(intent2);
    }

    public boolean startGameCheckRealnameHasIntent(Context context, com.wufan.user.service.protobuf.n0 n0Var, String str, String str2) {
        LoginCfgsBean loginCfgsBean;
        boolean z4 = false;
        if (MApplication.S.getIs_open_certify() == 1) {
            PrefDef_ prefDef_ = new PrefDef_(context);
            if (!y.u(prefDef_.lastShowRealNameTime().d().longValue()) && MApplication.S != null) {
                prefDef_.todayShowRealNameCount().g(Integer.valueOf(MApplication.S.getDaily_show_count()));
                prefDef_.startgametimes_open_certify().g(Integer.valueOf(MApplication.S.getTimes_open_certify()));
            }
            if (n0Var.n2() != 2 && n0Var.getUid() != 0) {
                if (n0Var.E0() == 0 && (loginCfgsBean = MApplication.S) != null && loginCfgsBean.getIs_open_certify() == 1) {
                    int intValue = prefDef_.startgametimes_open_certify().d().intValue();
                    if (intValue > 0) {
                        prefDef_.startgametimes_open_certify().g(Integer.valueOf(intValue - 1));
                    } else {
                        if (MApplication.S.getCertify_is_allow_skip() == 0) {
                            IntentUtil intentUtil = getInstance();
                            intentUtil.goShareWebActivity(context, com.join.mgps.rpc.h.G + "/user/activity/real_name/index?from=" + str + "&gameId=" + str2);
                        } else {
                            int intValue2 = prefDef_.todayShowRealNameCount().d().intValue();
                            if (intValue2 > 0) {
                                IntentUtil intentUtil2 = getInstance();
                                intentUtil2.goShareWebActivity(context, com.join.mgps.rpc.h.G + "/user/activity/real_name/index?from=" + str + "&gameId=" + str2);
                                prefDef_.todayShowRealNameCount().g(Integer.valueOf(intValue2 - 1));
                            }
                        }
                        z4 = true;
                    }
                    prefDef_.lastShowRealNameTime().g(Long.valueOf(System.currentTimeMillis()));
                    return z4;
                }
            } else {
                prefDef_.lastShowRealNameTime().g(Long.valueOf(System.currentTimeMillis()));
                int intValue3 = prefDef_.startgametimes_open_certify().d().intValue();
                if (intValue3 > 0) {
                    prefDef_.startgametimes_open_certify().g(Integer.valueOf(intValue3 - 1));
                    return false;
                }
                LoginSplashActivity_.intent(context).gameId(str2).start();
                return true;
            }
        }
        return false;
    }

    public void startQuarkBrowser(Context context, boolean z4, String str, String str2, String str3) {
        if (context == null || g2.h(str)) {
            return;
        }
        try {
            if (com.join.android.app.common.utils.e.l0(context).d(context, q1.f27991b)) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.setPackage(q1.f27991b);
                intent.setFlags(268435456);
                context.startActivity(intent);
            } else if (z4) {
                ((QuarkLoadingActivity_.d) QuarkLoadingActivity_.t0(context).flags(268435456)).c(com.join.android.app.common.utils.e.l0(context).J(context)).a(str3).b(str2).d(str).e(q1.f27992c).start();
            } else {
                DownloadTask F = p1.f.K().F(q1.f27993d);
                if (F != null && F.getStatus() != 11) {
                    ToastManager.show(context.getString(R.string.quark_downloading_tip));
                }
                MApplication.f1497x.l().isQuarkSilentDownload().g(Boolean.FALSE);
                ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(context).extra("action", "downloadQuark")).extra("isOm", false)).a();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private boolean goLogin(Context context, int i4) {
        if (!isLogined(context) || isTourist(context)) {
            ((LoginSplashActivity_.IntentBuilder_) LoginSplashActivity_.intent(context).flags(268435456)).start();
            return true;
        }
        return false;
    }

    public void goForumGroupActivity(Context context, int i4, String str) {
        ((ForumActivity_.q) ForumActivity_.U0(context).a(i4).b(str).flags(TTAdConstant.KEY_CLICK_AREA)).start();
    }

    public void goMainLabelActivity(Context context, int i4, String str) {
        goMainLabelActivity(context, i4, str, 2);
    }

    public void goMyAccountLoginActivity(Context context, int i4, int i5) {
        LoginSplashActivity_.intent(context).start();
    }

    public void goMyAccountLoginActivityNewTask(Context context, String str) {
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setComponent(new ComponentName(str, "com.join.mgps.activity.login.LoginSplashActivity_"));
        context.startActivity(intent);
    }

    public void goSearchHintActivity(Context context, @Nullable String str) {
        SearchHintActivity_.G1(context).c(str).start();
    }

    public void goForumGroupActivity(Context context) {
        IntentUtil intentUtil = getInstance();
        intentUtil.goShareWebActivity(context, com.join.mgps.rpc.h.f54059k + "/static/group/group_square.html");
    }

    public void goMainLabelActivity(Context context, int i4, String str, int i5) {
        MainLabelActivity_.O0(context).d(i4).e(str).b(i5).start();
    }

    public void goSearchHintActivity(Context context, @Nullable ArrayList<SScrollingTxtBeanV2> arrayList, int i4) {
        SearchHintActivity_.G1(context).d(arrayList).b(i4).start();
    }

    public void goMainLabelActivity(Context context, int i4, int i5, String str) {
        MainLabelActivity_.O0(context).d(i4).b(2).a(i5).c(str).start();
    }

    public void goGameDetialActivity(Context context, String str, String str2, int i4, int i5, String str3, String str4, String str5, String str6) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(1);
        intentDateBean.setCrc_link_type_val(str);
        intentDateBean.setTpl_type(str2);
        intentDateBean.setJump_type(i4);
        ExtBean extBean = new ExtBean();
        extBean.setReMarks(str3);
        extBean.set_from_type(i5 != 147 ? 112 : 147);
        extBean.setWhere(str4);
        extBean.setKeyword(str5);
        extBean.setDataFlag(str6);
        intentDateBean.setExtBean(extBean);
        intentActivity(context, intentDateBean);
    }

    public void goMGMainActivity2Front(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, MGMainActivity_.class);
        intent.setFlags(131072);
        intent.putExtras(new Bundle());
        context.startActivity(intent);
    }

    public void goShareWebActivityNewTask(Context context, String str, IntentDateBean intentDateBean) {
        if (context == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.putExtra("intentdate", intentDateBean);
            intent.setFlags(268435456);
            intent.setComponent(new ComponentName(str, "com.join.mgps.activity.ShareWebActivity_"));
            context.startActivity(intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void goGameDetialActivity(Context context, String str, int i4) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(1);
        intentDateBean.setCrc_link_type_val(str);
        ExtBean extBean = new ExtBean();
        extBean.set_from_type(i4);
        intentDateBean.setExtBean(extBean);
        intentActivity(context, intentDateBean);
    }
}
