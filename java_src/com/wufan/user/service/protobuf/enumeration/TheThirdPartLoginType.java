package com.wufan.user.service.protobuf.enumeration;

import com.google.protobuf.Internal;
/* loaded from: classes6.dex */
public enum TheThirdPartLoginType implements Internal.EnumLite {
    T_PAPA(0),
    T_QQ(1),
    T_WEI_XIN(2),
    T_WEI_BO(3),
    T_MG(4),
    UNRECOGNIZED(-1);
    
    public static final int T_MG_VALUE = 4;
    public static final int T_PAPA_VALUE = 0;
    public static final int T_QQ_VALUE = 1;
    public static final int T_WEI_BO_VALUE = 3;
    public static final int T_WEI_XIN_VALUE = 2;
    private static final Internal.EnumLiteMap<TheThirdPartLoginType> internalValueMap = new Internal.EnumLiteMap<TheThirdPartLoginType>() { // from class: com.wufan.user.service.protobuf.enumeration.TheThirdPartLoginType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: a */
        public TheThirdPartLoginType findValueByNumber(int i4) {
            return TheThirdPartLoginType.forNumber(i4);
        }
    };
    private final int value;

    TheThirdPartLoginType(int i4) {
        this.value = i4;
    }

    public static TheThirdPartLoginType forNumber(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            return null;
                        }
                        return T_MG;
                    }
                    return T_WEI_BO;
                }
                return T_WEI_XIN;
            }
            return T_QQ;
        }
        return T_PAPA;
    }

    public static Internal.EnumLiteMap<TheThirdPartLoginType> internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static TheThirdPartLoginType valueOf(int i4) {
        return forNumber(i4);
    }
}
