package com.papa91.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.text.TextUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.join.mgps.Util.h0;
import com.join.mgps.activity.GameMainActivity4;
import com.join.mgps.activity.MGMainActivity;
import com.join.mgps.activity.NoticeTopAnimActivityDialog_;
import com.join.mgps.activity.QuarkPromptActivity_;
import com.join.mgps.activity.SimulatorAreaActivity_;
import com.join.mgps.dto.Constant;
import com.join.mgps.service.CommonService_;
import com.kwad.sdk.core.response.model.SdkConfigData;
import com.papa91.arc.CContext;
import com.papa91.arc.MarketUtil;
import com.papa91.arc.MyJson;
import com.papa91.arc.SnkConfig;
import com.papa91.arc.bean.AdInfoBean;
import com.papa91.arc.bean.EndGameAllowBean;
import com.papa91.arc.bean.EndgameChallengeLevelBean;
import com.papa91.arc.bean.GateBean;
import com.papa91.arc.bean.MainBean;
import com.papa91.arc.bean.PaiWeiDataBean;
import com.papa91.arc.bean.SkillConfigBean;
import com.papa91.arc.bean.SkillTableDataBean;
import com.papa91.arc.bean.SpBindsDataBean;
import com.papa91.arc.bean.SubBean;
import com.papa91.arc.bean.TypeBean;
import com.papa91.arc.bean.VipBean;
import com.papa91.arc.common.constants.BAction;
import com.papa91.arc.common.constants.IntentKeys;
import com.papa91.arc.common.constants.StatIntents;
import com.papa91.arc.dialog.SettingAchievementDialog;
import com.papa91.arc.dialog.SettingCheatDialog;
import com.papa91.arc.dialog.SettingDialog;
import com.papa91.arc.dialog.SettingGateDialog;
import com.papa91.arc.dialog.SettingOneKeyDialog;
import com.papa91.arc.dialog.SettingPerformanceDialog;
import com.papa91.arc.dialog.SettingShareDialog;
import com.papa91.arc.dialog.SettingSlotDialog;
import com.papa91.arc.dialog.SettingVipDialog;
import com.papa91.arc.dialog.SettingVipTipDialog;
import com.papa91.arc.dialog.SimulatorContinueDialog;
import com.papa91.arc.dialog.SimulatorTipTwoDialog;
import com.papa91.arc.dialog.SimulatorUploadDialog;
import com.papa91.arc.util.GameSettings;
import com.papa91.arc.util.StringUtils;
import com.papa91.arc.view.IEmulator;
import com.papa91.arc.view.MenuView;
import com.papa91.arc.view.MenuViewListener;
import com.papa91.arc.view.ToastUtil;
import com.papa91.common.BaseAppConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.cocos2dx.lib.Cocos2dxActivity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.ppsspp.ppsspp.CheatInfo;
import org.ppsspp.ppsspp.EditCheatInfo;
import org.ppsspp.ppsspp.R;
/* loaded from: classes5.dex */
public class EmuMenuBaseActivity extends EmuBaseActivity implements MenuViewListener, IEmulator {
    public static int lastWindow;
    SettingAchievementDialog achievementDialog;
    AdInfoBean adInfoBean;
    SettingCheatDialog cheatDialog;
    String gameDir;
    SettingGateDialog gateDialog;
    Gson gson;
    private boolean isDestroyed;
    private boolean isRecreate;
    private long lastClickStartTime;
    private int lastCountTime;
    protected MenuView menuView;
    SettingOneKeyDialog oneKeyDialog;
    SettingPerformanceDialog performanceDialog;
    protected List<PaiWeiDataBean.RolesBean> rolesBeanList;
    private ArrayList<EndgameChallengeLevelBean> rules;
    SettingShareDialog shareDialog;
    int showTip;
    SettingSlotDialog slotDialog;
    SharedPreferences sp;
    Timer timer;
    TimerTask timerTask;
    String url;
    SettingVipDialog vipDialog;
    SettingVipTipDialog vipTipDialog;
    protected int autoSlotTime = 20;
    SkillTableDataBean skillTableDataBean = null;
    Runnable timeRunnable = new Runnable() { // from class: com.papa91.activity.EmuMenuBaseActivity.3
        @Override // java.lang.Runnable
        public void run() {
            try {
                int gameTime = EmuBaseActivity.getGameTime();
                int i4 = gameTime - EmuMenuBaseActivity.this.lastCountTime;
                if (i4 > 0) {
                    EmuMenuBaseActivity.this.lastCountTime = gameTime;
                    Intent intent = new Intent(BAction.ACTION_EMU_GAME_PLAY_TIMES);
                    intent.putExtra("gameId", EmuBaseActivity.GameID);
                    intent.putExtra(CommonService_.e0.f54339c, i4 / 1000);
                    EmuMenuBaseActivity.this.sendBroadcast(intent);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            EmuMenuBaseActivity emuMenuBaseActivity = EmuMenuBaseActivity.this;
            if (emuMenuBaseActivity.handler == null) {
                emuMenuBaseActivity.handler = new Handler();
            }
            EmuMenuBaseActivity.this.handler.postDelayed(this, 60000L);
        }
    };
    private PackageInfo appInfo = null;
    List<VipBean> vipBeans = new ArrayList();
    String ad_host_url = "http://anctapi.5fun.com";
    long liveTime = 0;
    LinkedHashMap<String, Long> activityQueue = new LinkedHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static void download(Context context, String str) {
        Fresco.getImagePipeline().L(ImageRequestBuilder.u(Uri.parse(str)).v(true).A(ImageRequest.RequestLevel.FULL_FETCH).C(false).a(), context);
    }

    private int getNextTip(HashMap<Integer, Boolean> hashMap, int i4) {
        if (hashMap.get(Integer.valueOf(i4)).booleanValue()) {
            return i4;
        }
        int i5 = i4 + 1;
        int i6 = 0;
        while (i6 < 2) {
            if (i5 > hashMap.size() - 1) {
                i6++;
                i5 = 0;
            }
            if (hashMap.get(Integer.valueOf(i5)).booleanValue()) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAdView$1() {
        if (this.adInfoBean == null || this.menuView == null) {
            return;
        }
        String hasShowAdInfo = CContext.mShareLitener.getHasShowAdInfo();
        String md5 = getMD5(new Gson().toJson(this.adInfoBean));
        if (TextUtils.isEmpty(hasShowAdInfo) || !md5.equals(hasShowAdInfo)) {
            this.menuView.showAdImage(true, this.adInfoBean.getMain().getPic_remote());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showUploadRecordDialog$2(DialogInterface dialogInterface) {
        gameOnPause();
        this.menuView.setRankTimeStop(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showVipTip$0(int i4, int i5) {
        SharedPreferences.Editor edit = this.sp.edit();
        edit.putBoolean(EmuBaseActivity.GameID + "_" + i4, false).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCloseUploadRecordDialog() {
        SimulatorTipTwoDialog simulatorTipTwoDialog = new SimulatorTipTwoDialog(this);
        simulatorTipTwoDialog.setTipContent("是否上传排位赛记录？\n放弃上传则此条通关记录不被记录到排位赛内");
        simulatorTipTwoDialog.setConfirmText("返回游戏");
        simulatorTipTwoDialog.setCancelText("继续上传");
        simulatorTipTwoDialog.setListener(new SimulatorTipTwoDialog.OnOptionsListener() { // from class: com.papa91.activity.EmuMenuBaseActivity.15
            @Override // com.papa91.arc.dialog.SimulatorTipTwoDialog.OnOptionsListener
            public void onCancel() {
                EmuMenuBaseActivity.this.showUploadRecordDialog();
            }

            @Override // com.papa91.arc.dialog.SimulatorTipTwoDialog.OnOptionsListener
            public void onClose() {
                EmuMenuBaseActivity.this.gameOnResume();
                EmuMenuBaseActivity.this.menuView.setRankTimeStop(false);
            }

            @Override // com.papa91.arc.dialog.SimulatorTipTwoDialog.OnOptionsListener
            public void onConfirm() {
                EmuMenuBaseActivity.this.gameOnResume();
                EmuMenuBaseActivity.this.menuView.setRankTimeStop(false);
            }
        });
        simulatorTipTwoDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showUploadRecordDialog() {
        Object obj;
        Object obj2;
        Object obj3;
        SimulatorUploadDialog simulatorUploadDialog = new SimulatorUploadDialog(this);
        simulatorUploadDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.papa91.activity.t
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                EmuMenuBaseActivity.this.lambda$showUploadRecordDialog$2(dialogInterface);
            }
        });
        simulatorUploadDialog.setListener(new SimulatorUploadDialog.OnOptionsListener() { // from class: com.papa91.activity.EmuMenuBaseActivity.14
            @Override // com.papa91.arc.dialog.SimulatorUploadDialog.OnOptionsListener
            public void onClose() {
                EmuMenuBaseActivity.this.showCloseUploadRecordDialog();
                EmuMenuBaseActivity.this.gameOnResume();
                EmuMenuBaseActivity.this.menuView.setRankTimeStop(false);
            }

            @Override // com.papa91.arc.dialog.SimulatorUploadDialog.OnOptionsListener
            public void onConfirm(int i4, int i5) {
                int gameCompleted = EmuBaseActivity.gameCompleted();
                Intent intent = new Intent(BAction.ACTION_RANK_RECORD_UPLOAD);
                intent.putExtra(IntentKeys.KEY_PARAMS_RANK_COIN, i4);
                intent.putExtra(IntentKeys.KEY_PARAMS_RANK_PLAY_TIME, (gameCompleted / 60) * 1000);
                intent.putExtra(IntentKeys.KEY_PARAMS_RANK_ROLE_ID, i5);
                EmuMenuBaseActivity.this.sendBroadcast(intent);
                EmuMenuBaseActivity.this.gameOnResume();
                EmuMenuBaseActivity.this.menuView.setRankTimeStop(false);
            }
        });
        simulatorUploadDialog.setData(this.rolesBeanList);
        int rankTime = this.menuView.getRankTime();
        this.rankPlayTime = rankTime;
        int i4 = rankTime / SdkConfigData.DEFAULT_REQUEST_INTERVAL;
        int i5 = i4 * SdkConfigData.DEFAULT_REQUEST_INTERVAL;
        int i6 = (rankTime - i5) / 60;
        int i7 = (rankTime - i5) - (i6 * 60);
        StringBuilder sb = new StringBuilder();
        sb.append("通关用时：");
        if (i4 > 9) {
            obj = Integer.valueOf(i4);
        } else {
            obj = "0" + i4;
        }
        sb.append(obj);
        sb.append(":");
        if (i6 > 9) {
            obj2 = Integer.valueOf(i6);
        } else {
            obj2 = "0" + i6;
        }
        sb.append(obj2);
        sb.append(":");
        if (i7 > 9) {
            obj3 = Integer.valueOf(i7);
        } else {
            obj3 = "0" + i7;
        }
        sb.append(obj3);
        simulatorUploadDialog.setTipContent(sb.toString());
        simulatorUploadDialog.show();
    }

    private void startTimeCount() {
        if (this.handler == null) {
            this.handler = new Handler();
        }
        this.handler.postDelayed(this.timeRunnable, 60000L);
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public boolean IsHapticFeedbackEnable() {
        return false;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public boolean IsSoundEnable() {
        return false;
    }

    public String ReadFile(String str) {
        File file = new File(str);
        String str2 = "";
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            str2 = str2 + readLine;
                        } catch (IOException e5) {
                            e = e5;
                            bufferedReader = bufferedReader2;
                            e.printStackTrace();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return str2;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused) {
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                    bufferedReader2.close();
                } catch (IOException e6) {
                    e = e6;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused2) {
        }
        return str2;
    }

    @Override // com.papa91.arc.view.IEmulator
    public void addEditCheatInfo(EditCheatInfo editCheatInfo) {
        EmuBaseActivity.addEditCheat(editCheatInfo);
    }

    protected void attachMenu() {
        try {
            if (Cocos2dxActivity.mFrameLayout != null) {
                MenuView menuView = new MenuView(this);
                this.menuView = menuView;
                Cocos2dxActivity.mFrameLayout.addView(menuView);
                setMenuViewListener();
                showMenuView(false);
                showAdView();
                if (EmuBaseActivity.startMode == 16) {
                    endGameAllow(false, 0);
                    EmuBaseActivity.setSPVisible(false);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.papa91.arc.view.IEmulator
    public void cheatInfoEnable(int i4, int i5) {
        EmuBaseActivity.cheatEnable(i4, i5);
    }

    @Override // com.papa91.arc.view.IEmulator
    public boolean checkCheatCodeInfo(String str, boolean z4) {
        return EmuBaseActivity.checkCheatCode(str, false);
    }

    public void closeDialogWithOut(SettingDialog settingDialog) {
        SettingCheatDialog settingCheatDialog = this.cheatDialog;
        if (settingCheatDialog != null && settingCheatDialog != settingDialog) {
            if (settingCheatDialog.isShowing()) {
                this.cheatDialog.dismissOnly();
            }
            this.cheatDialog = null;
        }
        SettingGateDialog settingGateDialog = this.gateDialog;
        if (settingGateDialog != null && settingGateDialog != settingDialog) {
            if (settingGateDialog.isShowing()) {
                this.gateDialog.dismissOnly();
            }
            this.gateDialog = null;
        }
        SettingSlotDialog settingSlotDialog = this.slotDialog;
        if (settingSlotDialog != null && settingSlotDialog != settingDialog) {
            if (settingSlotDialog.isShowing()) {
                this.slotDialog.dismissOnly();
            }
            this.slotDialog = null;
        }
        SettingVipDialog settingVipDialog = this.vipDialog;
        if (settingVipDialog != null && settingVipDialog != settingDialog) {
            if (settingVipDialog.isShowing()) {
                this.vipDialog.dismiss();
            }
            this.vipDialog = null;
        }
        SettingOneKeyDialog settingOneKeyDialog = this.oneKeyDialog;
        if (settingOneKeyDialog == null || settingOneKeyDialog == settingDialog) {
            return;
        }
        if (settingOneKeyDialog.isShowing()) {
            this.oneKeyDialog.dismiss();
        }
        this.oneKeyDialog = null;
    }

    @Override // com.papa91.arc.view.IEmulator
    public void deleteEditCheatInfo(int i4) {
        EmuBaseActivity.deleteEditCheat(i4);
    }

    @Override // com.papa91.arc.view.IEmulator
    public void enableEidtCheat(int i4, int i5) {
        if (getVip() > 0) {
            EmuBaseActivity.enableEidtCheat(i4);
            senCommonEvent("Custom_openGoldfinger", "");
        } else if (i5 != 1 && i5 != -1) {
            EmuBaseActivity.enableEidtCheat(i4);
            senCommonEvent("Custom_closeGoldfinger", "");
        } else {
            CContext.IVideoAdListener iVideoAdListener = CContext.mVideoAdListener;
            if (iVideoAdListener != null && i5 == 1) {
                iVideoAdListener.showGoldAdDialog(this, EmuBaseActivity.GameID, i4);
                return;
            }
            EmuBaseActivity.enableEidtCheat(i4);
            senCommonEvent("Custom_openGoldfinger", "");
        }
    }

    @Override // com.papa91.activity.EmuBaseActivity
    public void endGameStartCountDown(String str) {
        MenuView menuView = this.menuView;
        if (menuView != null) {
            menuView.showEndGameCountdown();
        }
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void exit() {
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void exitEndGame(boolean z4) {
        if (z4) {
            senCommonEvent("gameInExitVS", this.isAfterFailedEndGame ? "2" : "1");
        }
        Intent intent = new Intent();
        intent.setAction("com.emu.ad.result");
        intent.putExtra("adAction", 100);
        intent.putExtra("exit", 1);
        sendBroadcast(intent);
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void forum() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void gameDestroy(Activity activity) {
        if (activity == null) {
            return;
        }
        String name = activity.getClass().getName();
        synchronized (this) {
            if (this.activityQueue.containsKey(name)) {
                Long l4 = this.activityQueue.get(name);
                if (l4 == null) {
                    l4 = 0L;
                }
                long currentTimeMillis = System.currentTimeMillis() - l4.longValue();
                this.activityQueue.remove(name);
                this.liveTime += currentTimeMillis;
            }
        }
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void gameOnPause() {
        EmuBaseActivity.setPause(1);
        EmuBaseActivity.gameIsPause = true;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void gameOnResume() {
        EmuBaseActivity.setPause(0);
        EmuBaseActivity.gameIsPause = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void gamePause(Activity activity) {
        if (activity == null) {
            return;
        }
        String name = activity.getClass().getName();
        synchronized (this) {
            if (this.activityQueue.containsKey(name)) {
                Long l4 = this.activityQueue.get(name);
                if (l4 == null) {
                    l4 = 0L;
                }
                long currentTimeMillis = System.currentTimeMillis() - l4.longValue();
                this.activityQueue.remove(name);
                if (this.activityQueue.isEmpty()) {
                    this.liveTime += currentTimeMillis;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void gameResume(Activity activity) {
        if (activity == null) {
            return;
        }
        this.activityQueue.put(activity.getClass().getName(), Long.valueOf(System.currentTimeMillis()));
    }

    public String getAdRequestParam() {
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(EmuBaseActivity.appPackName, 16384);
            this.appInfo = packageInfo;
            if (packageInfo != null) {
                EmuBaseActivity.DEVICE_VERSION = this.appInfo.versionCode + "_" + this.appInfo.versionName.replace("'", "");
            }
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
        }
        EmuBaseActivity.httpKeySign = getMD5(EmuBaseActivity.DEVICE_ID + "gzRN53VWRF9BYUXomg2014");
        MyJson myJson = new MyJson();
        try {
            myJson.put("version", EmuBaseActivity.DEVICE_VERSION);
            myJson.put("deviceid", EmuBaseActivity.DEVICE_ID);
            myJson.put(Constant.MD5, EmuBaseActivity.httpKeySign);
            myJson.put("platform", this.sp.getString("platform", ""));
            MyJson myJson2 = new MyJson();
            myJson2.put(SimulatorAreaActivity_.E, getSimulatorType());
            myJson.put(QuarkPromptActivity_.E, myJson2);
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        return myJson.toString();
    }

    @Override // com.papa91.arc.view.IEmulator
    public boolean getAutoSlotStatus() {
        SharedPreferences sharedPreferences = this.sp;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean(EmuBaseActivity.GameID + "_AUTO_SLOT_STATUS", true);
        }
        return false;
    }

    @Override // com.papa91.arc.view.IEmulator
    public int getAutoStateMax() {
        return 5;
    }

    @Override // com.papa91.arc.view.IEmulator
    public int getAutoStateTimeCount() {
        int i4 = this.autoSlotTime;
        if (i4 <= 0) {
            this.autoSlotTime = 20;
        } else if (!EmuBaseActivity.gameIsPause) {
            this.autoSlotTime = i4 - 1;
        }
        return this.autoSlotTime;
    }

    @Override // com.papa91.arc.view.IEmulator
    public int getAutoStateTimeGap() {
        return 1000;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public boolean getChangeDiskState() {
        return false;
    }

    @Override // com.papa91.arc.view.IEmulator
    public List<CheatInfo> getCheatListData() {
        return EmuBaseActivity.cheatInfos;
    }

    @Override // com.papa91.arc.view.IEmulator
    public int getCheatLoaded() {
        return EmuBaseActivity.getVCLoaded();
    }

    @Override // com.papa91.arc.view.IEmulator
    public int getCurrentChar() {
        return getCurChar();
    }

    @Override // com.papa91.arc.view.IEmulator
    public String getCustomCheatTip(boolean z4) {
        return "";
    }

    @Override // com.papa91.arc.view.IEmulator
    public List<EditCheatInfo> getEditCheatListData() {
        return EmuBaseActivity.getEditCheatList();
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public String getEndGameDesc() {
        return EmuBaseActivity.subTitle;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public int getEndGameLimitTime() {
        return EmuBaseActivity.endGameTime;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public String getEndGameScore(int i4) {
        Gson gson = new Gson();
        ArrayList<EndgameChallengeLevelBean> arrayList = this.rules;
        if (arrayList == null || arrayList.size() <= 0) {
            this.rules = new ArrayList<>();
            if (!TextUtils.isEmpty(EmuBaseActivity.endGameLevelRules)) {
                Iterator<JsonElement> it2 = JsonParser.parseString(EmuBaseActivity.endGameLevelRules).getAsJsonArray().iterator();
                while (it2.hasNext()) {
                    this.rules.add((EndgameChallengeLevelBean) gson.fromJson(it2.next(), (Class<Object>) EndgameChallengeLevelBean.class));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getEndGameScore: ");
        sb.append(this.rules.size());
        int i5 = (i4 * 100) / (EmuBaseActivity.endGameTime * 1000);
        Iterator<EndgameChallengeLevelBean> it3 = this.rules.iterator();
        String str = "C";
        while (it3.hasNext()) {
            EndgameChallengeLevelBean next = it3.next();
            EndgameChallengeLevelBean.BoundaryBean boundary = next.getBoundary();
            if (i5 >= boundary.getLower() && i5 <= boundary.getUpper()) {
                str = next.getLevel();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getEndGameScore: ");
        sb2.append(i4);
        sb2.append("  ");
        sb2.append(EmuBaseActivity.endGameTime);
        sb2.append("  ");
        sb2.append(i5);
        sb2.append("  ");
        sb2.append(str);
        return str;
    }

    @Override // com.papa91.arc.view.IEmulator
    public String getGameId() {
        return EmuBaseActivity.GameID;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public int getGamePlayTime() {
        return EmuBaseActivity.getGameTime();
    }

    @Override // com.papa91.arc.view.IEmulator
    public List<GateBean> getGateData() {
        return null;
    }

    @Override // com.papa91.arc.view.IEmulator
    public List<TypeBean> getMenuTypes(int i4) {
        ArrayList arrayList = new ArrayList();
        if (i4 == 0) {
            int i5 = R.drawable.ic_cheat_vip;
            arrayList.add(new TypeBean(0, "悟饭定制", true, i5, i5));
            arrayList.add(new TypeBean(1, "自定义", false, -1, -1));
        } else if (i4 == 1) {
            arrayList.add(new TypeBean(0, "我的存档", true, -1, -1));
            arrayList.add(new TypeBean(1, "自动存档", false, -1, -1));
            arrayList.add(new TypeBean(2, GameMainActivity4.G2, false, R.drawable.ic_slot_store_h, R.drawable.ic_slot_store_n));
        }
        return arrayList;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public int getMiniRankTime() {
        return this.miniRankTime;
    }

    @Override // com.papa91.arc.view.IEmulator
    public String getModSubfix() {
        return "";
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void getPassRewardPoint() {
        getVideoAward(2, false);
    }

    @Override // com.papa91.arc.view.IEmulator
    public String getPlugVerCode() {
        return EmuBaseActivity.verCode;
    }

    public String getRequestParam() {
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(EmuBaseActivity.appPackName, 16384);
            this.appInfo = packageInfo;
            if (packageInfo != null) {
                EmuBaseActivity.DEVICE_VERSION = this.appInfo.versionCode + "_" + this.appInfo.versionName.replace("'", "");
            }
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
        }
        EmuBaseActivity.httpKeySign = getMD5(EmuBaseActivity.DEVICE_ID + "gzRN53VWRF9BYUXomg2014");
        MyJson myJson = new MyJson();
        try {
            myJson.put("version", EmuBaseActivity.DEVICE_VERSION);
            myJson.put("deviceid", EmuBaseActivity.DEVICE_ID);
            myJson.put(Constant.MD5, EmuBaseActivity.httpKeySign);
            MyJson myJson2 = new MyJson();
            myJson2.put(QuarkPromptActivity_.E, new JSONArray());
            myJson.put("messages", myJson2);
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        return myJson.toString();
    }

    public String getSimulatorType() {
        return "";
    }

    @Override // com.papa91.arc.view.IEmulator
    public SkillConfigBean getSkillConfigData() {
        try {
            if (!TextUtils.isEmpty(BaseAppConfig.ROM_PATH)) {
                String str = BaseAppConfig.ROM_PATH;
                str.substring(str.lastIndexOf(net.lingala.zip4j.util.e.F0));
            }
            String str2 = romPath().substring(0, romPath().lastIndexOf(net.lingala.zip4j.util.e.F0)) + "/skill_config.json";
            if (isShowOnekey() && new File(str2).exists()) {
                return (SkillConfigBean) this.gson.fromJson(ReadFile(str2), (Class<Object>) SkillConfigBean.class);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.papa91.arc.view.IEmulator
    public SkillTableDataBean getSkillTableData() {
        try {
            if (isShowOnekey() && this.skillTableDataBean == null) {
                this.skillTableDataBean = (SkillTableDataBean) this.gson.fromJson(ReadFile(romPath().substring(0, romPath().lastIndexOf(net.lingala.zip4j.util.e.F0)) + "/skill_table.json"), (Class<Object>) SkillTableDataBean.class);
            }
        } catch (Exception unused) {
        }
        return this.skillTableDataBean;
    }

    @Override // com.papa91.arc.view.IEmulator
    public int[] getSpBindImages(int i4) {
        return i4 == 0 ? new int[]{R.drawable.ic_font_1_h, R.drawable.ic_font_2_h, R.drawable.ic_font_3_h, R.drawable.ic_font_4_h, R.drawable.ic_font_5_h} : i4 == 1 ? new int[]{R.drawable.ic_font_1_n, R.drawable.ic_font_2_n, R.drawable.ic_font_3_n, R.drawable.ic_font_4_n, R.drawable.ic_font_5_n} : i4 == 2 ? new int[]{R.drawable.ic_sp_1_h, R.drawable.ic_sp_2_h, R.drawable.ic_sp_3_h, R.drawable.ic_sp_4_h, R.drawable.ic_sp_5_h} : i4 == 3 ? new int[]{R.drawable.ic_sp_1_n, R.drawable.ic_sp_2_n, R.drawable.ic_sp_3_n, R.drawable.ic_sp_4_n, R.drawable.ic_sp_5_n} : new int[5];
    }

    @Override // com.papa91.arc.view.IEmulator
    public SpBindsDataBean getSpBindsData() {
        try {
            if (isShowOnekey()) {
                SpBindsDataBean spBindsDataBean = (SpBindsDataBean) this.gson.fromJson(ReadFile(ugcPath() + "/sp_binds.json"), (Class<Object>) SpBindsDataBean.class);
                if (spBindsDataBean == null) {
                    spBindsDataBean = (SpBindsDataBean) this.gson.fromJson(ReadFile(ugcPath().substring(0, ugcPath().lastIndexOf(net.lingala.zip4j.util.e.F0)) + "/sp_binds.json"), (Class<Object>) SpBindsDataBean.class);
                }
                if (spBindsDataBean == null) {
                    return (SpBindsDataBean) this.gson.fromJson(ReadFile(ugcPath() + "/sp_binds.json"), (Class<Object>) SpBindsDataBean.class);
                }
                return spBindsDataBean;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.papa91.arc.view.IEmulator
    public String getToken() {
        return EmuBaseActivity.token;
    }

    @Override // com.papa91.arc.view.IEmulator
    public String getUserId() {
        return EmuBaseActivity.UserID;
    }

    @Override // com.papa91.arc.view.IEmulator
    public int getVip() {
        if (SnkConfig.isSnkGame(EmuBaseActivity.GameID)) {
            return 10;
        }
        return this.m_VIP;
    }

    @Override // com.papa91.arc.view.IEmulator
    public List<VipBean> getVipData() {
        return this.vipBeans;
    }

    @Override // com.papa91.arc.view.IEmulator
    public void goLogin() {
        EmuBaseActivity.sign();
    }

    @Override // com.papa91.arc.view.IEmulator
    public void goSlotShop() {
        Context context = Cocos2dxActivity.getContext();
        String str = EmuBaseActivity.GameID;
        MarketUtil.intent(context, "3", "35", str, str, "");
    }

    @Override // com.papa91.arc.view.IEmulator
    public void goVipShop(int i4, boolean z4) {
        if (!z4) {
            goVipShop(i4);
        } else if (i4 == 0) {
            if (StringUtils.isEmpty(CContext.mShareLitener.getEmulatorOneSkillUrl())) {
                goVipShop(i4);
                return;
            }
            Context context = Cocos2dxActivity.getContext();
            MarketUtil.intent(context, "4", "0", CContext.mShareLitener.getEmulatorOneSkillUrl() + "&gameId=" + EmuBaseActivity.GameID, "", "");
        } else if (i4 == 1) {
            if (StringUtils.isEmpty(CContext.mShareLitener.getEmulatorGoldenFingerUrl())) {
                goVipShop(i4);
                return;
            }
            Context context2 = Cocos2dxActivity.getContext();
            MarketUtil.intent(context2, "4", "0", CContext.mShareLitener.getEmulatorGoldenFingerUrl() + "&gameId=" + EmuBaseActivity.GameID, "", "");
        } else if (i4 != 3) {
        } else {
            if (StringUtils.isEmpty(CContext.mShareLitener.getEmulatorCheckpointUrl())) {
                goVipShop(i4);
                return;
            }
            Context context3 = Cocos2dxActivity.getContext();
            MarketUtil.intent(context3, "4", "0", CContext.mShareLitener.getEmulatorCheckpointUrl() + "&gameId=" + EmuBaseActivity.GameID, "", "");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa91.activity.EmuBaseActivity
    public void handleAdError(Context context, Intent intent) {
        int optInt;
        SettingCheatDialog settingCheatDialog;
        super.handleAdError(context, intent);
        if (intent.getIntExtra("adAction", 5) == 5) {
            String stringExtra = intent.getStringExtra(MGMainActivity.KEY_EXTRAS);
            if (StringUtils.isNotEmpty(stringExtra)) {
                try {
                    optInt = new JSONObject(stringExtra).optInt(NoticeTopAnimActivityDialog_.f36148o, -1);
                } catch (JSONException e5) {
                    e5.printStackTrace();
                }
                settingCheatDialog = this.cheatDialog;
                if (settingCheatDialog != null || optInt == -1) {
                }
                settingCheatDialog.updateSwitchState(optInt);
                return;
            }
            optInt = -1;
            settingCheatDialog = this.cheatDialog;
            if (settingCheatDialog != null) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    @Override // com.papa91.activity.EmuBaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleAdResult(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            super.handleAdResult(r5, r6)
            java.lang.String r5 = "adAction"
            r0 = 1008(0x3f0, float:1.413E-42)
            int r5 = r6.getIntExtra(r5, r0)
            java.lang.String r1 = "extras"
            java.lang.String r6 = r6.getStringExtra(r1)
            boolean r1 = com.papa91.arc.util.StringUtils.isNotEmpty(r6)
            r2 = 1
            r3 = -1
            if (r1 == 0) goto L2f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2b
            r1.<init>(r6)     // Catch: org.json.JSONException -> L2b
            java.lang.String r6 = "close"
            boolean r2 = r1.optBoolean(r6, r2)     // Catch: org.json.JSONException -> L2b
            java.lang.String r6 = "state"
            int r6 = r1.optInt(r6, r3)     // Catch: org.json.JSONException -> L2b
            goto L30
        L2b:
            r6 = move-exception
            r6.printStackTrace()
        L2f:
            r6 = -1
        L30:
            if (r5 != r0) goto L3e
            com.papa91.arc.dialog.SettingCheatDialog r5 = r4.cheatDialog
            if (r5 == 0) goto L4b
            if (r2 == 0) goto L4b
            if (r6 == r3) goto L4b
            r5.updateSwitchState(r6)
            goto L4b
        L3e:
            r0 = 1007(0x3ef, float:1.411E-42)
            if (r5 != r0) goto L4b
            com.papa91.arc.dialog.SettingCheatDialog r5 = r4.cheatDialog
            if (r5 == 0) goto L4b
            if (r6 == r3) goto L4b
            r5.updateSwitchState(r6)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.papa91.activity.EmuMenuBaseActivity.handleAdResult(android.content.Context, android.content.Intent):void");
    }

    @Override // com.papa91.activity.EmuBaseActivity
    public void hideAllView() {
        MenuView menuView = this.menuView;
        if (menuView != null) {
            menuView.hideAllEndGameView();
        }
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public boolean isEndGame() {
        return EmuBaseActivity.startMode == 16;
    }

    @Override // com.papa91.arc.view.IEmulator
    public boolean isNetAvailable() {
        return EmuBaseActivity.isNetworkConnected();
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public boolean isRankAutoUpload() {
        return this.rankAutoUpload != 14;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public boolean isRankGame() {
        return EmuBaseActivity.startMode == 14;
    }

    @Override // com.papa91.arc.view.IEmulator
    public boolean isSPVisible() {
        StringBuilder sb = new StringBuilder();
        sb.append("isSPVisible: ");
        sb.append(getVip());
        if (getVip() > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("spVisibleState: ");
            sb2.append(getVip());
            if (EmuBaseActivity.startMode != 16) {
                SharedPreferences sharedPreferences = this.sp;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(EmuBaseActivity.GameID);
                sb3.append("_isSpVisible");
                return sharedPreferences.getBoolean(sb3.toString(), true);
            }
            return false;
        }
        return false;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public boolean isShowAchievementIcon() {
        return EmuBaseActivity.context.getSharedPreferences("PrefDef", 0).getInt("pageVersion", 0) == 2 && EmuBaseActivity.context.getSharedPreferences("Papa_Stat_SharedPreferences", 4).getBoolean("isHasAchievement", true) && !isRankGame() && TextUtils.isEmpty(EmuBaseActivity.netState);
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public boolean isShowCheating() {
        return (isEndGame() || isRankGame()) ? false : true;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public boolean isShowGate() {
        return false;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public boolean isShowOnekey() {
        if (isEndGame() || isRankGame()) {
            return false;
        }
        try {
            return new File(romPath().substring(0, romPath().lastIndexOf(net.lingala.zip4j.util.e.F0)) + "/skill_table.json").exists();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public boolean isShowQuickSlot() {
        return (isEndGame() || isRankGame()) ? false : true;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void keysSetting() {
    }

    @Override // com.papa91.arc.view.IEmulator
    public void loadAdVideo() {
    }

    @Override // com.papa91.arc.view.IEmulator
    public void loadGateStage(int i4) {
    }

    @Override // com.papa91.activity.EmuBaseActivity
    public void loadRomFinish() {
        int i4 = EmuBaseActivity.startMode;
        if (i4 == 0 || i4 == 14 || i4 == 16) {
            attachMenu();
            if (EmuBaseActivity.startMode == 14) {
                this.menuView.showTimer();
                this.menuView.startTimer(0L);
            }
        }
        setAutoSave(getAutoSlotStatus() ? 1 : 0);
        this.handler.postDelayed(new Runnable() { // from class: com.papa91.activity.EmuMenuBaseActivity.9
            @Override // java.lang.Runnable
            public void run() {
                if (EmuMenuBaseActivity.this.getVip() > 0) {
                    if (EmuMenuBaseActivity.this.isShowOnekey()) {
                        EmuMenuBaseActivity emuMenuBaseActivity = EmuMenuBaseActivity.this;
                        emuMenuBaseActivity.setSPMenuVisible(emuMenuBaseActivity.isSPVisible());
                    }
                } else if (EmuBaseActivity.startMode == 0) {
                    EmuMenuBaseActivity.this.showVipTip();
                }
            }
        }, 500L);
    }

    @Override // com.papa91.arc.view.IEmulator
    public void loadSlotState(String str) {
        EmuBaseActivity.loadState(str);
    }

    @Override // com.papa91.arc.view.IEmulator
    public void modifyEditCheatInfo(int i4, EditCheatInfo editCheatInfo) {
        EmuBaseActivity.modifyEditCheat(i4, editCheatInfo);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa91.activity.EmuBaseActivity
    public boolean needResumeGame() {
        SettingVipTipDialog settingVipTipDialog = this.vipTipDialog;
        if (settingVipTipDialog == null || !settingVipTipDialog.isShowing()) {
            return super.needResumeGame();
        }
        return false;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public boolean needShowBottomBar() {
        return false;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public boolean needShowTimer() {
        return isRankGame();
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void onAdImageClick() {
        if (this.adInfoBean != null) {
            CContext.mShareLitener.saveHasShowAdInfo(getMD5(new Gson().toJson(this.adInfoBean)));
            SubBean sub = this.adInfoBean.getSub();
            if (sub != null) {
                MarketUtil.intent(Cocos2dxActivity.getContext(), sub.getLink_type(), sub.getJump_type(), sub.getLink_type_val(), sub.getCrc_link_type_val(), sub.getTpl_type());
            }
            MenuView menuView = this.menuView;
            if (menuView != null) {
                menuView.showAdImage(false, "");
            }
        }
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void onChangeDisk() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa91.activity.EmuBaseActivity, org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.gameDir = romPath().substring(romPath().lastIndexOf(net.lingala.zip4j.util.e.F0) + 1);
        this.gson = new GsonBuilder().create();
        new Thread(new Runnable() { // from class: com.papa91.activity.EmuMenuBaseActivity.2
            @Override // java.lang.Runnable
            public void run() {
                if (EmuMenuBaseActivity.this.isShowOnekey()) {
                    EmuMenuBaseActivity emuMenuBaseActivity = EmuMenuBaseActivity.this;
                    emuMenuBaseActivity.skillTableDataBean = emuMenuBaseActivity.getSkillTableData();
                }
                EmuMenuBaseActivity.this.startTimer();
            }
        }).run();
        this.sp = EmuBaseActivity.getDefaultSharedPreferences(this);
        EmuBaseActivity.DEVICE_ID = "";
        restoreVipData();
        restoreAdData();
        startTimeCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.papa91.activity.EmuBaseActivity, org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    public void onDestroy() {
        this.isDestroyed = true;
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.timeRunnable);
        }
        super.onDestroy();
        stopTimer();
        closeDialogWithOut(null);
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void onHideMenu() {
        StatIntents.getInstance(Cocos2dxActivity.getContext()).statOnclickFunction(EmuBaseActivity.GameID, EmuBaseActivity.UserID, 2);
    }

    @Override // com.papa91.activity.EmuBaseActivity
    public void onLoadStageCompleted(final int i4, final String str) {
        super.onLoadStageCompleted(i4, str);
        runOnUiThread(new Runnable() { // from class: com.papa91.activity.EmuMenuBaseActivity.5
            @Override // java.lang.Runnable
            public void run() {
                SettingGateDialog settingGateDialog = EmuMenuBaseActivity.this.gateDialog;
                if (settingGateDialog != null) {
                    settingGateDialog.hideLoading();
                    if (i4 == 1) {
                        EmuMenuBaseActivity.this.gateDialog.dismiss();
                    }
                }
                if (StringUtils.isNotEmpty(str)) {
                    ToastUtil.show(EmuMenuBaseActivity.this, str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.papa91.activity.EmuBaseActivity
    public void onMessengerConnected(Messenger messenger) {
        super.onMessengerConnected(messenger);
        StatIntents.getInstance(this).setMessenger(messenger);
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void onRankFinish(int i4) {
        if (i4 < this.miniRankTime) {
            SimulatorContinueDialog simulatorContinueDialog = new SimulatorContinueDialog(this);
            simulatorContinueDialog.setTipTitle("系统提示");
            simulatorContinueDialog.show();
            return;
        }
        SimulatorTipTwoDialog simulatorTipTwoDialog = new SimulatorTipTwoDialog(this);
        simulatorTipTwoDialog.setTipTitle("系统提示");
        simulatorTipTwoDialog.setListener(new SimulatorTipTwoDialog.OnOptionsListener() { // from class: com.papa91.activity.EmuMenuBaseActivity.13
            @Override // com.papa91.arc.dialog.SimulatorTipTwoDialog.OnOptionsListener
            public void onCancel() {
            }

            @Override // com.papa91.arc.dialog.SimulatorTipTwoDialog.OnOptionsListener
            public void onClose() {
            }

            @Override // com.papa91.arc.dialog.SimulatorTipTwoDialog.OnOptionsListener
            public void onConfirm() {
                EmuMenuBaseActivity.this.showUploadRecordDialog();
            }
        });
        simulatorTipTwoDialog.show();
    }

    @Override // com.papa91.activity.EmuBaseActivity
    protected void onRankRecordEnd(int i4) {
        if (isFinishing()) {
            return;
        }
        if (EmuBaseActivity.startMode != 16) {
            if (i4 == 0) {
                ToastUtil.show(this, "记录生成失败,请重试");
                return;
            } else {
                showUploadRecordDialog();
                return;
            }
        }
        Intent intent = new Intent(BAction.ACTION_ENDGAME_RECORD_UPLOAD);
        intent.putExtra(CommonService_.j0.f54396b, EmuBaseActivity.challengeId);
        intent.putExtra("gameId", EmuBaseActivity.GameID);
        sendBroadcast(intent);
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void onScreenShot() {
        StatIntents.getInstance(Cocos2dxActivity.getContext()).statOnclickFunction(EmuBaseActivity.GameID, EmuBaseActivity.UserID, 1);
        EmuBaseActivity.saveSnap();
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void onTimerTick(long j4) {
    }

    @Override // com.papa91.activity.EmuBaseActivity
    public void onVipChanged() {
        restoreVipData();
        runOnUiThread(new Runnable() { // from class: com.papa91.activity.EmuMenuBaseActivity.11
            @Override // java.lang.Runnable
            public void run() {
                if (EmuMenuBaseActivity.this.getVip() <= 0 || !EmuMenuBaseActivity.this.isShowOnekey()) {
                    return;
                }
                EmuMenuBaseActivity.this.setSPMenuVisible(EmuMenuBaseActivity.this.isSPVisible());
            }
        });
        SettingVipDialog settingVipDialog = this.vipDialog;
        if (settingVipDialog != null && settingVipDialog.isShowing()) {
            this.vipDialog.dismissOnly();
        }
        SettingVipTipDialog settingVipTipDialog = this.vipTipDialog;
        if (settingVipTipDialog != null && settingVipTipDialog.isShowing()) {
            this.vipTipDialog.dismiss();
        }
        SettingSlotDialog settingSlotDialog = this.slotDialog;
        if (settingSlotDialog != null) {
            settingSlotDialog.onVipChanged();
        }
        SettingCheatDialog settingCheatDialog = this.cheatDialog;
        if (settingCheatDialog != null) {
            settingCheatDialog.onVipChanged();
        }
        SettingOneKeyDialog settingOneKeyDialog = this.oneKeyDialog;
        if (settingOneKeyDialog != null) {
            settingOneKeyDialog.onVipChanged();
        }
    }

    @Override // com.papa91.arc.view.IEmulator
    public void pauseGame() {
        EmuBaseActivity.setPause(1);
        EmuBaseActivity.gameIsPause = true;
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void playVideoForReward() {
        EmuBaseActivity.scenario = 2;
        CContext.mVideoAdListener.showEndAd(this.sdkType, EmuBaseActivity.GameID);
        Context context = EmuBaseActivity.context;
        if (context instanceof EmuBaseActivity) {
            ((EmuBaseActivity) context).senCommonEvent("clickGameVSAdVideo", "");
        }
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void quickSlot() {
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void reload() {
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void restartEndGame() {
        EmuBaseActivity.resetEndGame(EmuBaseActivity.netState);
        endGameStart();
    }

    public void restoreAdData() {
        try {
            String str = EmuBaseActivity.dnsJson;
            if (str != null && !"".equals(str)) {
                JSONObject jSONObject = new JSONObject(EmuBaseActivity.dnsJson);
                if (jSONObject.has("gameUrl")) {
                    String string = jSONObject.getString("gameUrl");
                    if (!TextUtils.isEmpty(string)) {
                        this.ad_host_url = string;
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        final String adRequestParam = getAdRequestParam();
        new AsyncTask<String, Void, String>() { // from class: com.papa91.activity.EmuMenuBaseActivity.12
            void onRequestError(String str2) {
            }

            void onRequestSuccess(String str2) {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public String doInBackground(String... strArr) {
                DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
                HttpPost httpPost = new HttpPost(EmuMenuBaseActivity.this.ad_host_url + "/v5/game/simulatorGameInterfaceAd");
                httpPost.addHeader("Content-Type", "application/json;charset=utf-8");
                try {
                    httpPost.setEntity(new StringEntity(adRequestParam));
                } catch (UnsupportedEncodingException e6) {
                    e6.printStackTrace();
                }
                try {
                    HttpResponse execute = defaultHttpClient.execute(httpPost);
                    if (execute.getStatusLine().getStatusCode() == 200) {
                        String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
                        onRequestSuccess(entityUtils);
                        return entityUtils;
                    }
                    onRequestError("");
                    return "";
                } catch (Exception e7) {
                    e7.printStackTrace();
                    return "";
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public void onPostExecute(String str2) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        EmuMenuBaseActivity.this.adInfoBean = null;
                    }
                    JSONObject jSONObject2 = new MyJson(str2).getJSONObject("data");
                    if (jSONObject2 != null) {
                        EmuMenuBaseActivity.this.adInfoBean = new AdInfoBean();
                        JSONObject jSONObject3 = (JSONObject) jSONObject2.get("main");
                        EmuMenuBaseActivity.this.adInfoBean.setMain(new MainBean(jSONObject3.getString("title"), jSONObject3.getString("label"), jSONObject3.getString("pic_remote"), jSONObject3.getString("title_type"), jSONObject3.getString("sub_title"), jSONObject3.getInt("ad_switch")));
                        JSONObject jSONObject4 = (JSONObject) ((JSONArray) jSONObject2.get("sub")).get(0);
                        EmuMenuBaseActivity.this.adInfoBean.setSub(new SubBean(jSONObject4.getString("link_type"), jSONObject4.getString("link_type_val"), jSONObject4.getString("crc_link_type_val"), jSONObject4.getString("jump_type"), jSONObject4.getString("is_more"), jSONObject4.getString("tpl_type")));
                    }
                    EmuMenuBaseActivity.this.showAdView();
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
        }.execute(new String[0]);
    }

    public void restoreVipData() {
        String string;
        this.url = "http://anv9.ctapi.5fun.com/simulator/simulator_member_fun_type";
        try {
            String str = EmuBaseActivity.dnsJson;
            if (str != null && !"".equals(str) && (string = new JSONObject(EmuBaseActivity.dnsJson).getString("appContent")) != null && !"".equals(string)) {
                this.url = string + "/simulator/simulator_member_fun_type";
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        final String requestParam = getRequestParam();
        new AsyncTask<String, Void, String>() { // from class: com.papa91.activity.EmuMenuBaseActivity.4
            void onRequestError(String str2) {
            }

            void onRequestSuccess(String str2) {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public String doInBackground(String... strArr) {
                DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
                HttpPost httpPost = new HttpPost(EmuMenuBaseActivity.this.url);
                httpPost.addHeader("Content-Type", "application/json;charset=utf-8");
                try {
                    httpPost.setEntity(new StringEntity(requestParam));
                } catch (UnsupportedEncodingException e6) {
                    e6.printStackTrace();
                }
                try {
                    HttpResponse execute = defaultHttpClient.execute(httpPost);
                    if (execute.getStatusLine().getStatusCode() == 200) {
                        String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
                        onRequestSuccess(entityUtils);
                        return entityUtils;
                    }
                    onRequestError("");
                    return "";
                } catch (Exception e7) {
                    e7.printStackTrace();
                    return "";
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public void onPostExecute(String str2) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        EmuMenuBaseActivity.this.vipBeans.clear();
                    }
                    JSONArray jSONArray = new MyJson(str2).getJSONObject("messages").getJSONArray("data");
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject = (JSONObject) jSONArray.get(i4);
                        VipBean vipBean = new VipBean();
                        JSONObject jSONObject2 = (JSONObject) jSONObject.get("main");
                        vipBean.setMain(new MainBean(jSONObject2.getString("title"), jSONObject2.getString("label"), jSONObject2.getString("pic_remote"), jSONObject2.getString("title_type"), jSONObject2.getString("sub_title"), jSONObject2.getInt("ad_switch")));
                        JSONObject jSONObject3 = (JSONObject) ((JSONArray) jSONObject.get("sub")).get(0);
                        vipBean.setSub(new SubBean(jSONObject3.getString("link_type"), jSONObject3.getString("link_type_val"), jSONObject3.getString("crc_link_type_val"), jSONObject3.getString("jump_type"), jSONObject3.getString("is_more"), jSONObject3.getString("tpl_type")));
                        EmuMenuBaseActivity.this.vipBeans.add(vipBean);
                    }
                } catch (JSONException e6) {
                    e6.printStackTrace();
                }
                try {
                    if (EmuMenuBaseActivity.this.isDestroyed) {
                        return;
                    }
                    for (int i5 = 0; i5 < EmuMenuBaseActivity.this.vipBeans.size(); i5++) {
                        EmuMenuBaseActivity emuMenuBaseActivity = EmuMenuBaseActivity.this;
                        EmuMenuBaseActivity.download(emuMenuBaseActivity, emuMenuBaseActivity.vipBeans.get(i5).getMain().getPic_remote());
                    }
                    EmuMenuBaseActivity emuMenuBaseActivity2 = EmuMenuBaseActivity.this;
                    SettingVipDialog settingVipDialog = emuMenuBaseActivity2.vipDialog;
                    if (settingVipDialog != null) {
                        settingVipDialog.updateVipDatas(emuMenuBaseActivity2.vipBeans);
                    }
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
            }
        }.execute(new String[0]);
    }

    @Override // com.papa91.arc.view.IEmulator
    public void resumeGame() {
        EmuBaseActivity.setPause(0);
        EmuBaseActivity.gameIsPause = false;
    }

    @Override // com.papa91.arc.view.IEmulator
    public void retryGetGoldFingerConfig() {
        EmuBaseActivity.httpPostMemberInfo();
    }

    @Override // com.papa91.arc.view.IEmulator
    public String romPath() {
        return EmuBaseActivity.romPath;
    }

    @Override // com.papa91.arc.view.IEmulator
    public void saveBindsFileData() {
        EmuBaseActivity.saveBindsFile();
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void saveGameConfig() {
    }

    @Override // com.papa91.arc.view.IEmulator
    public void saveSlotState(String str) {
        EmuBaseActivity.jMenuSaveState(Integer.parseInt(str.substring(str.lastIndexOf(h0.f27805a) + 1)));
        this.handler.postDelayed(new Runnable() { // from class: com.papa91.activity.EmuMenuBaseActivity.7
            @Override // java.lang.Runnable
            public void run() {
                if (EmuMenuBaseActivity.this.isFinishing()) {
                    return;
                }
                try {
                    SettingSlotDialog settingSlotDialog = EmuMenuBaseActivity.this.slotDialog;
                    if (settingSlotDialog != null) {
                        settingSlotDialog.updateData();
                    }
                    ToastUtil.show(Cocos2dxActivity.getContext(), "存档保存成功");
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }, 300L);
    }

    @Override // com.papa91.arc.view.IEmulator
    public void screenMode(int i4) {
    }

    @Override // com.papa91.arc.view.IEmulator
    public void setAutoSlotStatus(int i4) {
        SharedPreferences.Editor edit = this.sp.edit();
        edit.putBoolean(EmuBaseActivity.GameID + "_AUTO_SLOT_STATUS", i4 == 1).commit();
        if (i4 == 0) {
            stopTimer();
            this.autoSlotTime = 0;
        } else {
            startTimer();
        }
        try {
            setAutoSave(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setMenuViewListener() {
        MenuView menuView = this.menuView;
        if (menuView != null) {
            menuView.setMenuViewListener(this);
        }
    }

    @Override // com.papa91.arc.view.IEmulator
    public void setSPBindData(int i4, int i5, int i6) {
        EmuBaseActivity.setSPBind(i4, i5, i6);
    }

    @Override // com.papa91.arc.view.IEmulator
    public void setSPMenuVisible(boolean z4) {
        EmuBaseActivity.setSPVisible(z4);
        SharedPreferences.Editor edit = this.sp.edit();
        edit.putBoolean(EmuBaseActivity.GameID + "_isSpVisible", z4).commit();
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void showAchievementDialog(int i4) {
        if (this.achievementDialog == null) {
            this.achievementDialog = new SettingAchievementDialog(this, i4, EmuBaseActivity.tourist);
        }
        this.achievementDialog.setOnEmulatorListener(this);
        this.achievementDialog.setTourist(EmuBaseActivity.tourist);
        if (this.achievementDialog.isShowing()) {
            return;
        }
        this.achievementDialog.show();
    }

    @Override // com.papa91.arc.view.IEmulator
    public void showAdVideo() {
    }

    public void showAdView() {
        if (isRankGame()) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: com.papa91.activity.v
            @Override // java.lang.Runnable
            public final void run() {
                EmuMenuBaseActivity.this.lambda$showAdView$1();
            }
        });
    }

    @Override // com.papa91.activity.EmuBaseActivity
    public void showEndGameFailed(int i4, boolean z4, int i5) {
        MenuView menuView = this.menuView;
        if (menuView != null) {
            menuView.endGameFailed(i4, z4, i5);
        }
    }

    @Override // com.papa91.activity.EmuBaseActivity
    public void showEndGameStartView(boolean z4, int i4, boolean z5) {
        MenuView menuView = this.menuView;
        if (menuView != null) {
            menuView.showEndGameStart(z4, i4, z5);
            if (z4) {
                return;
            }
            senCommonEvent("showVSTaskList", "");
        }
    }

    @Override // com.papa91.arc.view.IEmulator
    public boolean showGGCodeButton() {
        return false;
    }

    @Override // com.papa91.activity.EmuBaseActivity, com.papa91.arc.view.MenuViewListener
    public void showMenuCheating() {
        StatIntents.getInstance(Cocos2dxActivity.getContext()).statOnclickFunction(EmuBaseActivity.GameID, EmuBaseActivity.UserID, 0);
        if (this.cheatDialog == null) {
            this.cheatDialog = new SettingCheatDialog(this);
        }
        this.cheatDialog.setOnEmulatorListener(this);
        if (!this.cheatDialog.isShowing()) {
            this.cheatDialog.show();
        }
        if (this.vipBeans.size() == 0) {
            restoreVipData();
            return;
        }
        for (int i4 = 0; i4 < this.vipBeans.size(); i4++) {
            if (TextUtils.isEmpty(this.vipBeans.get(i4).getMain().getPic_remote())) {
                restoreVipData();
                return;
            }
        }
    }

    @Override // com.papa91.activity.EmuBaseActivity, com.papa91.arc.view.MenuViewListener
    public void showMenuGate() {
        StatIntents.getInstance(Cocos2dxActivity.getContext()).statOnclickFunction(EmuBaseActivity.GameID, EmuBaseActivity.UserID, 4);
        if (this.gateDialog == null) {
            this.gateDialog = new SettingGateDialog(this);
        }
        this.gateDialog.setOnEmulatorListener(this);
        if (this.gateDialog.isShowing()) {
            return;
        }
        this.gateDialog.show();
    }

    @Override // com.papa91.activity.EmuBaseActivity, com.papa91.arc.view.MenuViewListener
    public void showMenuOnekey() {
        StatIntents.getInstance(Cocos2dxActivity.getContext()).statOnclickFunction(EmuBaseActivity.GameID, EmuBaseActivity.UserID, 3);
        if (this.oneKeyDialog == null) {
            this.oneKeyDialog = new SettingOneKeyDialog(this);
        }
        this.oneKeyDialog.setOnEmulatorListener(this);
        if (this.oneKeyDialog.isShowing()) {
            return;
        }
        this.oneKeyDialog.show();
    }

    @Override // com.papa91.activity.EmuBaseActivity, com.papa91.arc.view.MenuViewListener
    public void showMenuPerformance() {
        if (this.performanceDialog == null) {
            GameSettings.init(this);
            this.performanceDialog = new SettingPerformanceDialog(this);
        }
        SettingPerformanceDialog settingPerformanceDialog = this.performanceDialog;
        String[] strArr = new String[2];
        strArr[0] = GameSettings.getGameSettingTotalLevel() + "";
        StringBuilder sb = new StringBuilder();
        sb.append(lastWindow == 2 ? 1 : 0);
        sb.append("");
        strArr[1] = sb.toString();
        settingPerformanceDialog.show(strArr);
        this.performanceDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.papa91.activity.EmuMenuBaseActivity.6
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                MenuView menuView;
                if (EmuMenuBaseActivity.lastWindow != 2 || (menuView = EmuMenuBaseActivity.this.menuView) == null) {
                    return;
                }
                menuView.hide();
            }
        });
    }

    @Override // com.papa91.activity.EmuBaseActivity, com.papa91.arc.view.MenuViewListener
    public void showMenuSlot() {
        StatIntents.getInstance(Cocos2dxActivity.getContext()).statOnclickFunction(EmuBaseActivity.GameID, EmuBaseActivity.UserID, 5);
        if (this.slotDialog == null) {
            this.slotDialog = new SettingSlotDialog(this);
        }
        String str = EmuBaseActivity.dnsJson;
        if (str != null && !"".equals(str)) {
            try {
                String string = new JSONObject(EmuBaseActivity.dnsJson).getString("appContent");
                if (string != null && !"".equals(string)) {
                    this.slotDialog.setappContentUrl(string);
                }
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
        this.slotDialog.setOnEmulatorListener(this);
        if (!this.slotDialog.isShowing()) {
            this.slotDialog.show();
        }
        if (this.vipBeans.size() == 0) {
            restoreVipData();
            return;
        }
        for (int i4 = 0; i4 < this.vipBeans.size(); i4++) {
            if (TextUtils.isEmpty(this.vipBeans.get(i4).getMain().getPic_remote())) {
                restoreVipData();
                return;
            }
        }
    }

    @Override // com.papa91.activity.EmuBaseActivity
    public void showMenuView(boolean z4) {
        MenuView menuView = this.menuView;
        if (menuView != null) {
            if (z4) {
                menuView.setVisibility(0);
            } else if (EmuBaseActivity.startMode == 16) {
            } else {
                menuView.setVisibility(8);
            }
        }
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void showReceivePointDialog() {
    }

    @Override // com.papa91.activity.EmuBaseActivity
    public void showShare(final String str) {
        if (EmuBaseActivity.startMode == 0) {
            if (this.shareDialog == null) {
                this.shareDialog = new SettingShareDialog(this);
            }
            this.shareDialog.setOnEmulatorListener(this);
            this.shareDialog.setIamge(str);
            this.shareDialog.setShareListener(new SettingShareDialog.IShareListener() { // from class: com.papa91.activity.EmuMenuBaseActivity.10
                @Override // com.papa91.arc.dialog.SettingShareDialog.IShareListener
                public void onShare(int i4) {
                    Intent intent = new Intent(o1.a.f72013m0);
                    intent.putExtra(CommonService_.c0.f54306b, str);
                    intent.putExtra("from", i4);
                    if (i4 == 0) {
                        StatIntents.getInstance(Cocos2dxActivity.getContext()).statShareScreenshot(EmuBaseActivity.GameID, EmuBaseActivity.UserID, 2);
                    } else if (i4 == 1) {
                        StatIntents.getInstance(Cocos2dxActivity.getContext()).statShareScreenshot(EmuBaseActivity.GameID, EmuBaseActivity.UserID, 3);
                    } else if (i4 == 2) {
                        StatIntents.getInstance(Cocos2dxActivity.getContext()).statShareScreenshot(EmuBaseActivity.GameID, EmuBaseActivity.UserID, 0);
                    } else if (i4 == 3) {
                        StatIntents.getInstance(Cocos2dxActivity.getContext()).statShareScreenshot(EmuBaseActivity.GameID, EmuBaseActivity.UserID, 1);
                    }
                    EmuBaseActivity.send(intent);
                    EmuMenuBaseActivity.this.shareDialog.dismiss();
                }
            });
            if (this.shareDialog.isShowing()) {
                return;
            }
            this.shareDialog.show();
        }
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void showTimeLimitedDialog1() {
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void showTimeLimitedDialog2() {
    }

    @Override // com.papa91.arc.view.IEmulator
    public void showVip(String... strArr) {
        if (this.vipDialog == null) {
            this.vipDialog = new SettingVipDialog(this);
        }
        this.vipDialog.setOnEmulatorListener(this);
        if (this.vipBeans.size() > 0) {
            this.vipDialog.updateVipDatas(this.vipBeans);
        } else {
            restoreVipData();
        }
        this.vipDialog.show(strArr);
    }

    @Override // com.papa91.activity.EmuBaseActivity
    public void showVipTip(int i4, int i5) {
        try {
            HashMap<Integer, Boolean> hashMap = new HashMap<>();
            SharedPreferences sharedPreferences = this.sp;
            StringBuilder sb = new StringBuilder();
            sb.append(EmuBaseActivity.GameID);
            sb.append("_");
            sb.append(0);
            hashMap.put(0, Boolean.valueOf(sharedPreferences.getBoolean(sb.toString(), true) && getCheatListData() != null && getCheatListData().size() > 0));
            SharedPreferences sharedPreferences2 = this.sp;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(EmuBaseActivity.GameID);
            sb2.append("_");
            sb2.append(1);
            hashMap.put(1, Boolean.valueOf(sharedPreferences2.getBoolean(sb2.toString(), true) && isShowOnekey()));
            SharedPreferences sharedPreferences3 = this.sp;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(EmuBaseActivity.GameID);
            sb3.append("_");
            sb3.append(2);
            hashMap.put(2, Boolean.valueOf(sharedPreferences3.getBoolean(sb3.toString(), true) && isShowGate()));
            SharedPreferences sharedPreferences4 = this.sp;
            this.showTip = sharedPreferences4.getInt(EmuBaseActivity.GameID + "_show_tip", -1);
            if (this.vipTipDialog == null) {
                this.vipTipDialog = new SettingVipTipDialog(this);
            }
            this.vipTipDialog.setOnEmulatorListener(this);
            this.vipTipDialog.setNoTipListener(new SettingVipTipDialog.INoTipListener() { // from class: com.papa91.activity.EmuMenuBaseActivity.8
                @Override // com.papa91.arc.dialog.SettingVipTipDialog.INoTipListener
                public void onNoTipClick(int i6, int i7) {
                    SharedPreferences.Editor edit = EmuMenuBaseActivity.this.sp.edit();
                    edit.putBoolean(EmuBaseActivity.GameID + "_" + EmuMenuBaseActivity.this.showTip, false).commit();
                }
            });
            int i6 = this.showTip + 1;
            this.showTip = i6;
            if (i6 >= 3) {
                this.showTip = 0;
            }
            int nextTip = getNextTip(hashMap, this.showTip);
            if (nextTip != -1) {
                this.showTip = nextTip;
                this.vipTipDialog.show(nextTip, i5);
                StatIntents.getInstance(Cocos2dxActivity.getContext()).statShowVippopup(EmuBaseActivity.GameID, EmuBaseActivity.UserID, this.showTip);
            } else {
                resumeGame();
            }
            SharedPreferences.Editor edit = this.sp.edit();
            edit.putInt(EmuBaseActivity.GameID + "_show_tip", this.showTip).commit();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void startEndGame() {
        if (System.currentTimeMillis() - this.lastClickStartTime < 1000) {
            return;
        }
        this.lastClickStartTime = System.currentTimeMillis();
        endGameStart();
        senCommonEvent("gameInStartVS", "");
    }

    public void startTimer() {
        try {
            Timer timer = this.timer;
            if (timer != null) {
                timer.cancel();
            }
            this.timer = new Timer();
            TimerTask timerTask = this.timerTask;
            if (timerTask != null) {
                timerTask.cancel();
            }
            TimerTask timerTask2 = new TimerTask() { // from class: com.papa91.activity.EmuMenuBaseActivity.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (EmuMenuBaseActivity.this.isDestroyed) {
                        return;
                    }
                    EmuMenuBaseActivity.this.getAutoStateTimeCount();
                }
            };
            this.timerTask = timerTask2;
            Timer timer2 = this.timer;
            if (timer2 != null) {
                timer2.schedule(timerTask2, 0L, 1000L);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void stopTimer() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
        TimerTask timerTask = this.timerTask;
        if (timerTask != null) {
            timerTask.cancel();
            this.timerTask = null;
        }
    }

    @Override // com.papa91.arc.view.IEmulator
    public String ugcPath() {
        return EmuBaseActivity.ugcPath;
    }

    @Override // com.papa91.activity.EmuBaseActivity
    public void updateEndGameResultSuccess(int i4, int i5, EndGameAllowBean endGameAllowBean) {
        MenuView menuView = this.menuView;
        if (menuView != null) {
            if (i4 == 0) {
                menuView.endGameSuccess(i5, endGameAllowBean);
                senCommonEvent("gameVSSuccess", "");
                return;
            }
            endGameAllow(true, i4);
            senCommonEvent("gameVSFail", "");
        }
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void vibrate(boolean z4) {
    }

    @Override // com.papa91.arc.view.MenuViewListener
    public void voice(boolean z4) {
    }

    private void goVipShop(int i4) {
        SubBean sub;
        if (this.vipBeans.size() > 0) {
            if (i4 >= this.vipBeans.size() || (sub = this.vipBeans.get(i4).getSub()) == null) {
                return;
            }
            Context context = Cocos2dxActivity.getContext();
            String link_type = sub.getLink_type();
            String jump_type = sub.getJump_type();
            MarketUtil.intent(context, link_type, jump_type, sub.getLink_type_val() + "&gameId=" + EmuBaseActivity.GameID, sub.getCrc_link_type_val(), sub.getTpl_type());
        } else if (i4 == 0) {
            Context context2 = Cocos2dxActivity.getContext();
            MarketUtil.intent(context2, "4", "0", "http://anv3frapi.5fun.com/static/vip2020/dist_d/index.html#/member?priId=2&gameName=一键技能&returnStatus=1&gameId=" + EmuBaseActivity.GameID, EmuBaseActivity.GameID, "");
        } else if (i4 == 1) {
            Context context3 = Cocos2dxActivity.getContext();
            MarketUtil.intent(context3, "4", "0", "http://anv3frapi.5fun.com/static/vip2020/dist_d/index.html#/member?priId=1&gameName=金手指&returnStatus=1&gameId=" + EmuBaseActivity.GameID, EmuBaseActivity.GameID, "");
        } else if (i4 == 2) {
            Context context4 = Cocos2dxActivity.getContext();
            MarketUtil.intent(context4, "4", "0", "http://anv3frapi.5fun.com/static/vip2020/dist_d/index.html#/member?priId=3&gameName=更多存档&returnStatus=1&gameId=" + EmuBaseActivity.GameID, EmuBaseActivity.GameID, "");
        } else if (i4 == 3) {
            Context context5 = Cocos2dxActivity.getContext();
            MarketUtil.intent(context5, "4", "0", "http://anv3frapi.5fun.com/static/vip2020/dist_d/index.html#/member?priId=5&gameName=快速选关&returnStatus=1&gameId=" + EmuBaseActivity.GameID, EmuBaseActivity.GameID, "");
        } else if (i4 != 4) {
        } else {
            Context context6 = Cocos2dxActivity.getContext();
            MarketUtil.intent(context6, "4", "0", "http://anv3frapi.5fun.com/static/vip2020/dist_d/index.html#/member?priId=4&gameName=对战畅玩&returnStatus=1&gameId=" + EmuBaseActivity.GameID, EmuBaseActivity.GameID, "");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0113, code lost:
        if (r1.getInt(com.papa91.activity.EmuBaseActivity.GameID + "_start_time", new java.util.Date().getDay()) != new java.util.Date().getDay()) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showVipTip() {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.papa91.activity.EmuMenuBaseActivity.showVipTip():void");
    }

    private void showVipTip(int i4) {
        try {
            SharedPreferences sharedPreferences = this.sp;
            if (sharedPreferences.getBoolean(EmuBaseActivity.GameID + "_" + i4, true)) {
                StatIntents.getInstance(Cocos2dxActivity.getContext()).statShowVippopup(EmuBaseActivity.GameID, EmuBaseActivity.UserID, i4);
                if (this.vipTipDialog == null) {
                    this.vipTipDialog = new SettingVipTipDialog(this);
                }
                this.vipTipDialog.setOnEmulatorListener(this);
                this.vipTipDialog.setNoTipListener(new SettingVipTipDialog.INoTipListener() { // from class: com.papa91.activity.u
                    @Override // com.papa91.arc.dialog.SettingVipTipDialog.INoTipListener
                    public final void onNoTipClick(int i5, int i6) {
                        EmuMenuBaseActivity.this.lambda$showVipTip$0(i5, i6);
                    }
                });
                this.vipTipDialog.show(i4, 0);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
