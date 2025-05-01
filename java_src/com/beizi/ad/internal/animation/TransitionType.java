package com.beizi.ad.internal.animation;
/* loaded from: classes2.dex */
public enum TransitionType {
    NONE,
    RANDOM,
    FADE,
    PUSH,
    MOVEIN,
    REVEAL;

    public static TransitionType getTypeForInt(int i4) {
        TransitionType[] values;
        for (TransitionType transitionType : values()) {
            if (transitionType.ordinal() == i4) {
                return transitionType;
            }
        }
        return NONE;
    }
}
