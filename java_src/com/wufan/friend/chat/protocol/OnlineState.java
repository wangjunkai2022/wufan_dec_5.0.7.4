package com.wufan.friend.chat.protocol;

import com.google.protobuf.Internal;
/* loaded from: classes6.dex */
public enum OnlineState implements Internal.EnumLite {
    ONLINE(0),
    INVISIBLE(1),
    OFFLINE(2),
    UNRECOGNIZED(-1);
    
    public static final int INVISIBLE_VALUE = 1;
    public static final int OFFLINE_VALUE = 2;
    public static final int ONLINE_VALUE = 0;
    private static final Internal.EnumLiteMap<OnlineState> internalValueMap = new Internal.EnumLiteMap<OnlineState>() { // from class: com.wufan.friend.chat.protocol.OnlineState.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: a */
        public OnlineState findValueByNumber(int i4) {
            return OnlineState.forNumber(i4);
        }
    };
    private final int value;

    OnlineState(int i4) {
        this.value = i4;
    }

    public static OnlineState forNumber(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    return null;
                }
                return OFFLINE;
            }
            return INVISIBLE;
        }
        return ONLINE;
    }

    public static Internal.EnumLiteMap<OnlineState> internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static OnlineState valueOf(int i4) {
        return forNumber(i4);
    }
}
