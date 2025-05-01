package com.kwad.sdk.core.response.b;

import android.graphics.Matrix;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.sdk.core.response.model.PhotoInfo;
/* loaded from: classes5.dex */
public final class h {
    public static String a(@NonNull PhotoInfo photoInfo) {
        return photoInfo.videoInfo.videoUrl;
    }

    public static String b(@NonNull PhotoInfo photoInfo) {
        return photoInfo.videoInfo.manifest;
    }

    public static String c(PhotoInfo photoInfo) {
        return photoInfo.baseInfo.sdkExtraData;
    }

    public static boolean a(@Nullable Matrix matrix, int i4, int i5, PhotoInfo.VideoInfo videoInfo) {
        if (matrix != null) {
            matrix.reset();
        }
        if (videoInfo == null) {
            return false;
        }
        float f5 = videoInfo.width;
        float f6 = videoInfo.height;
        if (f5 >= f6) {
            return false;
        }
        float f7 = (float) videoInfo.leftRatio;
        float f8 = (float) videoInfo.topRatio;
        float f9 = (float) videoInfo.widthRatio;
        float f10 = (float) videoInfo.heightRatio;
        float f11 = i4;
        float f12 = f11 / f5;
        float f13 = i5;
        float f14 = f13 / f6;
        float f15 = f12 / f14;
        if (Math.abs(f15 - 1.0f) < 0.01d) {
            return false;
        }
        if (f12 > f14) {
            float f16 = f14 / f12;
            float f17 = (f16 + 1.0f) / 2.0f;
            if (f8 < (1.0f - f16) / 2.0f || f8 + f10 > f17) {
                return false;
            }
        } else {
            float f18 = (f15 + 1.0f) / 2.0f;
            if (f7 < (1.0f - f15) / 2.0f || f7 + f9 > f18) {
                return false;
            }
            f12 = f14;
        }
        if (matrix == null) {
            return true;
        }
        matrix.preTranslate((f11 - f5) / 2.0f, (f13 - f6) / 2.0f);
        matrix.preScale(f5 / f11, f6 / f13);
        matrix.postScale(f12, f12, f11 / 2.0f, f13 / 2.0f);
        return true;
    }
}
