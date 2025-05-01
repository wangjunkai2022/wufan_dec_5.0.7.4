package com.wufan.friend.chat.protocol;

import com.google.protobuf.Internal;
/* loaded from: classes6.dex */
public enum PlayGameState implements Internal.EnumLite {
    START(0),
    RUNNING(1),
    OVER(2),
    UNRECOGNIZED(-1);
    
    public static final int OVER_VALUE = 2;
    public static final int RUNNING_VALUE = 1;
    public static final int START_VALUE = 0;
    private static final Internal.EnumLiteMap<PlayGameState> internalValueMap = new Internal.EnumLiteMap<PlayGameState>() { // from class: com.wufan.friend.chat.protocol.PlayGameState.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: a */
        public PlayGameState findValueByNumber(int i4) {
            return PlayGameState.forNumber(i4);
        }
    };
    private final int value;

    PlayGameState(int i4) {
        this.value = i4;
    }

    public static PlayGameState forNumber(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    return null;
                }
                return OVER;
            }
            return RUNNING;
        }
        return START;
    }

    public static Internal.EnumLiteMap<PlayGameState> internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static PlayGameState valueOf(int i4) {
        return forNumber(i4);
    }
}
