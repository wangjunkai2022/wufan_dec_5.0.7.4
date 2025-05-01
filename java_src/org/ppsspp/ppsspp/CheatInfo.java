package org.ppsspp.ppsspp;

import java.util.ArrayList;
/* loaded from: classes7.dex */
public class CheatInfo {
    public String cheatName;
    public int i_default;
    public int nVipLevel;
    public int off;
    public ArrayList<CheatInfo> option = new ArrayList<>();
    public int optionNum = 2;

    public CheatInfo(int i4, int i5, String str) {
        this.cheatName = "";
        this.i_default = 0;
        this.nVipLevel = 0;
        this.cheatName = str;
        this.i_default = i5;
        this.nVipLevel = i4;
    }
}
