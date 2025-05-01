package com.papa91.arc.view;

import com.papa91.arc.bean.GateBean;
import com.papa91.arc.bean.SkillConfigBean;
import com.papa91.arc.bean.SkillTableDataBean;
import com.papa91.arc.bean.SpBindsDataBean;
import com.papa91.arc.bean.TypeBean;
import com.papa91.arc.bean.VipBean;
import java.util.List;
import org.ppsspp.ppsspp.CheatInfo;
import org.ppsspp.ppsspp.EditCheatInfo;
/* loaded from: classes5.dex */
public interface IEmulator {
    void addEditCheatInfo(EditCheatInfo editCheatInfo);

    void cheatInfoEnable(int i4, int i5);

    boolean checkCheatCodeInfo(String str, boolean z4);

    void deleteEditCheatInfo(int i4);

    void enableEidtCheat(int i4, int i5);

    boolean getAutoSlotStatus();

    int getAutoStateMax();

    int getAutoStateTimeCount();

    int getAutoStateTimeGap();

    List<CheatInfo> getCheatListData();

    int getCheatLoaded();

    int getCurrentChar();

    String getCustomCheatTip(boolean z4);

    List<EditCheatInfo> getEditCheatListData();

    String getGameId();

    List<GateBean> getGateData();

    List<TypeBean> getMenuTypes(int i4);

    String getModSubfix();

    String getPlugVerCode();

    SkillConfigBean getSkillConfigData();

    SkillTableDataBean getSkillTableData();

    int[] getSpBindImages(int i4);

    SpBindsDataBean getSpBindsData();

    String getToken();

    String getUserId();

    int getVip();

    List<VipBean> getVipData();

    void goLogin();

    void goSlotShop();

    void goVipShop(int i4, boolean z4);

    boolean isNetAvailable();

    boolean isSPVisible();

    void loadAdVideo();

    void loadGateStage(int i4);

    void loadSlotState(String str);

    void modifyEditCheatInfo(int i4, EditCheatInfo editCheatInfo);

    void pauseGame();

    void resumeGame();

    void retryGetGoldFingerConfig();

    String romPath();

    void saveBindsFileData();

    void saveSlotState(String str);

    void screenMode(int i4);

    void setAutoSlotStatus(int i4);

    void setSPBindData(int i4, int i5, int i6);

    void setSPMenuVisible(boolean z4);

    void showAdVideo();

    boolean showGGCodeButton();

    void showVip(String... strArr);

    String ugcPath();
}
