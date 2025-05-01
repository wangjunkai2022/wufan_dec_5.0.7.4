package com.papa91.battle.protocol;

import com.google.protobuf.Internal;
/* loaded from: classes5.dex */
public enum Platform implements Internal.EnumLite {
    MOBILE(0),
    PC(1),
    UNRECOGNIZED(-1);
    
    public static final int MOBILE_VALUE = 0;
    public static final int PC_VALUE = 1;
    private static final Internal.EnumLiteMap<Platform> internalValueMap = new Internal.EnumLiteMap<Platform>() { // from class: com.papa91.battle.protocol.Platform.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public Platform findValueByNumber(int i4) {
            return Platform.forNumber(i4);
        }
    };
    private final int value;

    Platform(int i4) {
        this.value = i4;
    }

    public static Platform forNumber(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                return null;
            }
            return PC;
        }
        return MOBILE;
    }

    public static Internal.EnumLiteMap<Platform> internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static Platform valueOf(int i4) {
        return forNumber(i4);
    }
}
