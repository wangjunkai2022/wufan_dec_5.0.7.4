package com.join.mgps.joystick;

import android.content.Context;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.joystick.map.KeyMap;
import com.papa.controller.core.ControllerManager;
import com.papa.controller.core.d;
import com.papa.sim.statistic.JoyStickConfig;
import com.papa.sim.statistic.p;
import com.wufan.user.service.protobuf.n0;
import java.util.Date;
import java.util.List;
/* loaded from: classes3.dex */
public class KeyMapActions {
    private static void fillConnectedGamepadInfo(Context context, JoyStickConfig joyStickConfig) {
        List<ControllerManager.c> q4 = d.r(context).q();
        String str = "";
        String str2 = str;
        if (q4 != null) {
            int i4 = 0;
            while (i4 < q4.size()) {
                String str3 = str + q4.get(i4).d() + ";";
                str2 = str2 + q4.get(i4).a().replace(":", "_") + ";";
                i4++;
                str = str3;
            }
        }
        if (!str.equals("")) {
            str.substring(0, str.length() - 1);
        }
        if (!str2.equals("")) {
            str2.substring(0, str.length() - 1);
        }
        joyStickConfig.setGamepad_name(str);
        joyStickConfig.setGamepad_mac(str2);
    }

    public static void saveStat(Context context, KeyMap.EmuMap emuMap, String str) {
        if (emuMap == null && context == null) {
            return;
        }
        int i4 = -1;
        if (emuMap == KeyMap.EmuMap.FBA) {
            i4 = 31;
        } else if (emuMap == KeyMap.EmuMap.GBA) {
            i4 = 33;
        } else if (emuMap == KeyMap.EmuMap.SFC) {
            i4 = 43;
        } else if (emuMap == KeyMap.EmuMap.PSP) {
            i4 = 34;
        } else if (emuMap == KeyMap.EmuMap.FC) {
            i4 = 35;
        } else if (emuMap == KeyMap.EmuMap.MD) {
            i4 = 51;
        } else if (emuMap == KeyMap.EmuMap.PS) {
            i4 = 53;
        } else if (emuMap == KeyMap.EmuMap.WSC) {
            i4 = 54;
        } else if (emuMap == KeyMap.EmuMap.GBC) {
            i4 = 56;
        } else if (emuMap == KeyMap.EmuMap.DC) {
            i4 = 60;
        } else if (emuMap == KeyMap.EmuMap.N64) {
            i4 = 57;
        }
        p.l(context).a0(AccountUtil_.getInstance_(context).getUid(), AccountUtil_.getInstance_(context).isTourist(), "", "", 0);
        JoyStickConfig joyStickConfig = new JoyStickConfig();
        n0 accountData = AccountUtil_.getInstance_(context).getAccountData();
        if (accountData != null) {
            joyStickConfig.setUid(accountData.getUid());
        }
        joyStickConfig.setType(i4);
        joyStickConfig.setFile(str);
        fillConnectedGamepadInfo(context, joyStickConfig);
        joyStickConfig.setUpdate_time(new Date().getTime());
        p.l(context).v1(JsonMapper.nonDefaultMapper().toJson(joyStickConfig), AccountUtil_.getInstance_(context).getUid());
    }
}
