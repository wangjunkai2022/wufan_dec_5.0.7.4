package com.airbnb.lottie;
/* loaded from: classes2.dex */
public enum RenderMode {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3601a;

        static {
            int[] iArr = new int[RenderMode.values().length];
            f3601a = iArr;
            try {
                iArr[RenderMode.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3601a[RenderMode.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3601a[RenderMode.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean useSoftwareRendering(int i4, boolean z4, int i5) {
        int i6 = a.f3601a[ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                return (z4 && i4 < 28) || i5 > 4 || i4 <= 25;
            }
            return true;
        }
        return false;
    }
}
