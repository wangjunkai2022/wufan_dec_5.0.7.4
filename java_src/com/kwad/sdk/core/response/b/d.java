package com.kwad.sdk.core.response.b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.sdk.core.response.model.AdStyleInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public final class d {
    public static long dE(@Nullable AdTemplate adTemplate) {
        if (adTemplate == null) {
            return 0L;
        }
        return dI(adTemplate).playDetailInfo.detailTopToolBarInfo.callButtonShowTime;
    }

    public static String dF(@Nullable AdTemplate adTemplate) {
        return adTemplate == null ? "" : dI(adTemplate).playDetailInfo.detailTopToolBarInfo.callButtonDescription;
    }

    public static String dG(@Nullable AdTemplate adTemplate) {
        return adTemplate == null ? "" : dI(adTemplate).playEndInfo.endTopToolBarInfo.callButtonDescription;
    }

    public static boolean dH(@Nullable AdTemplate adTemplate) {
        if (adTemplate != null && e.dK(adTemplate)) {
            return dI(adTemplate).slideClick;
        }
        return false;
    }

    @NonNull
    private static AdStyleInfo dI(@NonNull AdTemplate adTemplate) {
        return e.dS(adTemplate).adStyleInfo;
    }

    public static List<String> dJ(@NonNull AdTemplate adTemplate) {
        AdStyleInfo dI = dI(adTemplate);
        ArrayList arrayList = new ArrayList();
        try {
            for (AdStyleInfo.ExposeTagInfo exposeTagInfo : dI.extraDisplayInfo.exposeTagInfoList) {
                arrayList.add(exposeTagInfo.text);
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
