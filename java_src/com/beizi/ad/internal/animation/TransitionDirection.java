package com.beizi.ad.internal.animation;
/* loaded from: classes2.dex */
public enum TransitionDirection {
    UP,
    DOWN,
    RIGHT,
    LEFT;

    public static TransitionDirection getDirectionForInt(int i4) {
        TransitionDirection[] values;
        for (TransitionDirection transitionDirection : values()) {
            if (transitionDirection.ordinal() == i4) {
                return transitionDirection;
            }
        }
        return UP;
    }
}
