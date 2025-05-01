package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
/* loaded from: classes2.dex */
public class MergePaths implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f3951a;

    /* renamed from: b  reason: collision with root package name */
    private final MergePathsMode f3952b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3953c;

    /* loaded from: classes2.dex */
    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode forId(int i4) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                return MERGE;
                            }
                            return EXCLUDE_INTERSECTIONS;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z4) {
        this.f3951a = str;
        this.f3952b = mergePathsMode;
        this.f3953c = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    @Nullable
    public com.airbnb.lottie.animation.content.c a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        if (!lottieDrawable.H()) {
            com.airbnb.lottie.utils.d.e("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new com.airbnb.lottie.animation.content.l(this);
    }

    public MergePathsMode b() {
        return this.f3952b;
    }

    public String c() {
        return this.f3951a;
    }

    public boolean d() {
        return this.f3953c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f3952b + '}';
    }
}
