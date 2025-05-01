package com.google.android.material.color;
/* loaded from: classes3.dex */
final class Hct {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DE_MAX_ERROR = 1.0E-9f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private float chroma;
    private float hue;
    private float tone;

    private Hct(float f5, float f6, float f7) {
        setInternalState(gamutMap(f5, f6, f7));
    }

    private static Cam16 findCamByJ(float f5, float f6, float f7) {
        float f8 = 1000.0f;
        Cam16 cam16 = null;
        float f9 = 1000.0f;
        float f10 = 100.0f;
        float f11 = 0.0f;
        while (Math.abs(f11 - f10) > LIGHTNESS_SEARCH_ENDPOINT) {
            float f12 = ((f10 - f11) / 2.0f) + f11;
            int i4 = Cam16.fromJch(f12, f6, f5).getInt();
            float lstarFromInt = ColorUtils.lstarFromInt(i4);
            float abs = Math.abs(f7 - lstarFromInt);
            if (abs < 0.2f) {
                Cam16 fromInt = Cam16.fromInt(i4);
                float distance = fromInt.distance(Cam16.fromJch(fromInt.getJ(), fromInt.getChroma(), f5));
                if (distance <= 1.0f && distance <= f8) {
                    cam16 = fromInt;
                    f9 = abs;
                    f8 = distance;
                }
            }
            if (f9 == 0.0f && f8 < DE_MAX_ERROR) {
                break;
            } else if (lstarFromInt < f7) {
                f11 = f12;
            } else {
                f10 = f12;
            }
        }
        return cam16;
    }

    public static Hct from(float f5, float f6, float f7) {
        return new Hct(f5, f6, f7);
    }

    public static Hct fromInt(int i4) {
        Cam16 fromInt = Cam16.fromInt(i4);
        return new Hct(fromInt.getHue(), fromInt.getChroma(), ColorUtils.lstarFromInt(i4));
    }

    private static int gamutMap(float f5, float f6, float f7) {
        return gamutMapInViewingConditions(f5, f6, f7, ViewingConditions.DEFAULT);
    }

    static int gamutMapInViewingConditions(float f5, float f6, float f7, ViewingConditions viewingConditions) {
        if (f6 >= 1.0d && Math.round(f7) > 0.0d && Math.round(f7) < 100.0d) {
            float sanitizeDegrees = MathUtils.sanitizeDegrees(f5);
            float f8 = f6;
            Cam16 cam16 = null;
            float f9 = 0.0f;
            boolean z4 = true;
            while (Math.abs(f9 - f6) >= CHROMA_SEARCH_ENDPOINT) {
                Cam16 findCamByJ = findCamByJ(sanitizeDegrees, f8, f7);
                if (z4) {
                    if (findCamByJ != null) {
                        return findCamByJ.viewed(viewingConditions);
                    }
                    z4 = false;
                } else if (findCamByJ == null) {
                    f6 = f8;
                } else {
                    f9 = f8;
                    cam16 = findCamByJ;
                }
                f8 = ((f6 - f9) / 2.0f) + f9;
            }
            if (cam16 == null) {
                return ColorUtils.intFromLstar(f7);
            }
            return cam16.viewed(viewingConditions);
        }
        return ColorUtils.intFromLstar(f7);
    }

    private void setInternalState(int i4) {
        Cam16 fromInt = Cam16.fromInt(i4);
        float lstarFromInt = ColorUtils.lstarFromInt(i4);
        this.hue = fromInt.getHue();
        this.chroma = fromInt.getChroma();
        this.tone = lstarFromInt;
    }

    public float getChroma() {
        return this.chroma;
    }

    public float getHue() {
        return this.hue;
    }

    public float getTone() {
        return this.tone;
    }

    public void setChroma(float f5) {
        setInternalState(gamutMap(this.hue, f5, this.tone));
    }

    public void setHue(float f5) {
        setInternalState(gamutMap(MathUtils.sanitizeDegrees(f5), this.chroma, this.tone));
    }

    public void setTone(float f5) {
        setInternalState(gamutMap(this.hue, this.chroma, f5));
    }

    public int toInt() {
        return gamutMap(this.hue, this.chroma, this.tone);
    }
}
