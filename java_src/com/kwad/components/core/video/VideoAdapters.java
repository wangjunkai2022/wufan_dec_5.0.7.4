package com.kwad.components.core.video;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
/* loaded from: classes5.dex */
public final class VideoAdapters {

    /* renamed from: com.kwad.components.core.video.VideoAdapters$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Vz;

        static {
            int[] iArr = new int[AdaptType.values().length];
            Vz = iArr;
            try {
                iArr[AdaptType.PORTRAIT_VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Vz[AdaptType.LANDSCAPE_HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Vz[AdaptType.PORTRAIT_HORIZONTAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Vz[AdaptType.LANDSCAPE_VERTICAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes5.dex */
    enum AdaptType {
        PORTRAIT_VERTICAL,
        PORTRAIT_HORIZONTAL,
        LANDSCAPE_VERTICAL,
        LANDSCAPE_HORIZONTAL
    }

    /* loaded from: classes5.dex */
    public static abstract class a implements com.kwad.components.core.video.c {
        private static boolean b(View view, View view2, int i4, int i5) {
            if (view == null || i4 == 0 || i5 == 0 || view2 == null) {
                return false;
            }
            return (view2.getWidth() == 0 || view2.getHeight() == 0) ? false : true;
        }

        @Override // com.kwad.components.core.video.c
        public final void a(View view, View view2, int i4, int i5) {
            AdaptType adaptType;
            if (!b(view, view2, i4, i5)) {
                com.kwad.sdk.core.e.c.d("AbstractVideoViewAdapter", "adaptVideo checkArguments invalid");
                return;
            }
            d dVar = new d(view2.getWidth(), view2.getHeight());
            d dVar2 = new d(i4, i5);
            boolean z4 = dVar2.getRatio() >= 1.0f;
            boolean z5 = dVar.getRatio() >= 1.0f;
            if (z5 && z4) {
                adaptType = AdaptType.PORTRAIT_VERTICAL;
            } else if (z5) {
                adaptType = AdaptType.PORTRAIT_HORIZONTAL;
            } else if (z4) {
                adaptType = AdaptType.LANDSCAPE_VERTICAL;
            } else {
                adaptType = AdaptType.LANDSCAPE_HORIZONTAL;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            a(adaptType, layoutParams, dVar, dVar2);
            view.setLayoutParams(layoutParams);
        }

        protected abstract void a(@NonNull AdaptType adaptType, @NonNull ViewGroup.LayoutParams layoutParams, @NonNull d dVar, @NonNull d dVar2);
    }

    /* loaded from: classes5.dex */
    public static class b extends a {
        private float VA = 0.8f;
        private float VB = 0.9375f;
        private float VC = 1.1046f;

        @Override // com.kwad.components.core.video.VideoAdapters.a
        protected final void a(@NonNull AdaptType adaptType, @NonNull ViewGroup.LayoutParams layoutParams, @NonNull d dVar, @NonNull d dVar2) {
            float st;
            float f5;
            float su = dVar.su();
            float su2 = dVar2.su();
            float st2 = dVar.st();
            float ss = dVar.ss();
            com.kwad.sdk.core.e.c.d("FullHeightAdapter", "onAdaptVideo containerSize: " + ss + ", " + st2);
            int i4 = AnonymousClass1.Vz[adaptType.ordinal()];
            if (i4 == 1 || i4 == 2) {
                if (su > su2) {
                    float ss2 = dVar.ss();
                    float f6 = ss2 / su2;
                    float f7 = this.VA;
                    if (st2 / f6 >= f7) {
                        f5 = ss2;
                        st = f6;
                    } else {
                        st = st2 / f7;
                        f5 = st * su2;
                    }
                } else {
                    st = dVar.st();
                    f5 = su2 * st;
                    float f8 = this.VB;
                    if (ss / f5 < f8) {
                        f5 = ss / f8;
                        st = f5 / su2;
                    }
                }
            } else if (i4 == 3 || i4 == 4) {
                f5 = st2 * this.VC;
                st = f5 / su2;
            } else {
                st = -2.14748365E9f;
                f5 = -2.14748365E9f;
            }
            com.kwad.sdk.core.e.c.d("FullHeightAdapter", "onAdaptVideo result: " + f5 + ", " + st);
            if (f5 == -2.14748365E9f || st == -2.14748365E9f) {
                return;
            }
            if (dVar2.getHeight() >= dVar2.getWidth()) {
                layoutParams.width = (int) st;
                layoutParams.height = (int) f5;
                return;
            }
            layoutParams.height = (int) st;
            layoutParams.width = (int) f5;
        }
    }

    /* loaded from: classes5.dex */
    public static class c extends a {
        @Override // com.kwad.components.core.video.VideoAdapters.a
        protected final void a(@NonNull AdaptType adaptType, @NonNull ViewGroup.LayoutParams layoutParams, @NonNull d dVar, @NonNull d dVar2) {
            float ss;
            float st;
            float su = dVar.su();
            float su2 = dVar2.su();
            int i4 = AnonymousClass1.Vz[adaptType.ordinal()];
            if (i4 == 1 || i4 == 2) {
                if (su >= su2) {
                    st = dVar.st();
                    ss = st * su2;
                } else {
                    ss = dVar.ss();
                    st = ss / su2;
                }
            } else if (i4 == 3 || i4 == 4) {
                ss = dVar.st();
                st = ss / su2;
            } else {
                ss = 0.0f;
                st = -2.14748365E9f;
            }
            if (st == -2.14748365E9f || ss == -2.14748365E9f) {
                return;
            }
            if (dVar2.getHeight() > dVar2.getWidth()) {
                layoutParams.width = (int) st;
                layoutParams.height = (int) ss;
                return;
            }
            layoutParams.height = (int) st;
            layoutParams.width = (int) ss;
        }
    }

    /* loaded from: classes5.dex */
    static class d {
        float VD;
        float height;
        float width;

        public d(float f5, float f6) {
            this.VD = -1.0f;
            this.width = f5;
            this.height = f6;
            if (f5 <= 0.0f || f6 <= 0.0f) {
                return;
            }
            this.VD = f6 / f5;
        }

        private boolean isValid() {
            return this.width > 0.0f && this.height > 0.0f;
        }

        public final float getHeight() {
            return this.height;
        }

        public final float getRatio() {
            return this.VD;
        }

        public final float getWidth() {
            return this.width;
        }

        public final float ss() {
            if (isValid()) {
                return Math.max(this.width, this.height);
            }
            return -1.0f;
        }

        public final float st() {
            if (isValid()) {
                return Math.min(this.width, this.height);
            }
            return -1.0f;
        }

        public final float su() {
            if (isValid()) {
                float f5 = this.height;
                float f6 = this.width;
                return f5 > f6 ? f5 / f6 : f6 / f5;
            }
            return -1.0f;
        }

        public final String toString() {
            return "ViewSize{width=" + this.width + ", height=" + this.height + ", ratio=" + this.VD + '}';
        }
    }
}
