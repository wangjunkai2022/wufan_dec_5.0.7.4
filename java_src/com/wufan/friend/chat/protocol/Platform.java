package com.wufan.friend.chat.protocol;

import com.google.protobuf.Internal;
/* loaded from: classes6.dex */
public enum Platform implements Internal.EnumLite {
    UNDEFINED_PT(0),
    ANDROID(1),
    IOS(2),
    UNRECOGNIZED(-1);
    
    public static final int ANDROID_VALUE = 1;
    public static final int IOS_VALUE = 2;
    public static final int UNDEFINED_PT_VALUE = 0;
    private static final Internal.EnumLiteMap<Platform> internalValueMap = new Internal.EnumLiteMap<Platform>() { // from class: com.wufan.friend.chat.protocol.Platform.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: a */
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
                if (i4 != 2) {
                    return null;
                }
                return IOS;
            }
            return ANDROID;
        }
        return UNDEFINED_PT;
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
