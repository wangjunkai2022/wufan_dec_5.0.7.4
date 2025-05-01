package com.wufan.user.service.protobuf.enumeration;

import com.google.protobuf.Internal;
/* loaded from: classes6.dex */
public enum SourceType implements Internal.EnumLite {
    WORLD(0),
    PLATFORM(1),
    BATTLE(2),
    PC(3),
    REBATE(4),
    SDK_REBATE(5),
    SWITCH(6),
    UNRECOGNIZED(-1);
    
    public static final int BATTLE_VALUE = 2;
    public static final int PC_VALUE = 3;
    public static final int PLATFORM_VALUE = 1;
    public static final int REBATE_VALUE = 4;
    public static final int SDK_REBATE_VALUE = 5;
    public static final int SWITCH_VALUE = 6;
    public static final int WORLD_VALUE = 0;
    private static final Internal.EnumLiteMap<SourceType> internalValueMap = new Internal.EnumLiteMap<SourceType>() { // from class: com.wufan.user.service.protobuf.enumeration.SourceType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: a */
        public SourceType findValueByNumber(int i4) {
            return SourceType.forNumber(i4);
        }
    };
    private final int value;

    SourceType(int i4) {
        this.value = i4;
    }

    public static SourceType forNumber(int i4) {
        switch (i4) {
            case 0:
                return WORLD;
            case 1:
                return PLATFORM;
            case 2:
                return BATTLE;
            case 3:
                return PC;
            case 4:
                return REBATE;
            case 5:
                return SDK_REBATE;
            case 6:
                return SWITCH;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<SourceType> internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static SourceType valueOf(int i4) {
        return forNumber(i4);
    }
}
