package com.papa91.battle.protocol;

import com.google.protobuf.Internal;
/* loaded from: classes5.dex */
public enum RoomCategory implements Internal.EnumLite {
    NORMAL(0),
    TOURNAMENT(1),
    LIVE(2),
    UNRECOGNIZED(-1);
    
    public static final int LIVE_VALUE = 2;
    public static final int NORMAL_VALUE = 0;
    public static final int TOURNAMENT_VALUE = 1;
    private static final Internal.EnumLiteMap<RoomCategory> internalValueMap = new Internal.EnumLiteMap<RoomCategory>() { // from class: com.papa91.battle.protocol.RoomCategory.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public RoomCategory findValueByNumber(int i4) {
            return RoomCategory.forNumber(i4);
        }
    };
    private final int value;

    RoomCategory(int i4) {
        this.value = i4;
    }

    public static RoomCategory forNumber(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    return null;
                }
                return LIVE;
            }
            return TOURNAMENT;
        }
        return NORMAL;
    }

    public static Internal.EnumLiteMap<RoomCategory> internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static RoomCategory valueOf(int i4) {
        return forNumber(i4);
    }
}
