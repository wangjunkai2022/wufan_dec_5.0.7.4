package com.papa91.battle.protocol;

import com.google.protobuf.Internal;
/* loaded from: classes5.dex */
public enum BattleArea implements Internal.EnumLite {
    ALL(0),
    BJ(1),
    SH(2),
    GZ(3),
    UNRECOGNIZED(-1);
    
    public static final int ALL_VALUE = 0;
    public static final int BJ_VALUE = 1;
    public static final int GZ_VALUE = 3;
    public static final int SH_VALUE = 2;
    private static final Internal.EnumLiteMap<BattleArea> internalValueMap = new Internal.EnumLiteMap<BattleArea>() { // from class: com.papa91.battle.protocol.BattleArea.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public BattleArea findValueByNumber(int i4) {
            return BattleArea.forNumber(i4);
        }
    };
    private final int value;

    BattleArea(int i4) {
        this.value = i4;
    }

    public static BattleArea forNumber(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return null;
                    }
                    return GZ;
                }
                return SH;
            }
            return BJ;
        }
        return ALL;
    }

    public static Internal.EnumLiteMap<BattleArea> internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static BattleArea valueOf(int i4) {
        return forNumber(i4);
    }
}
