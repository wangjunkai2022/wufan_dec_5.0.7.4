package com.kwad.sdk.core.response.b;

import android.text.TextUtils;
import com.kwad.sdk.core.response.model.AdResultData;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes5.dex */
public final class c {
    public static <R extends AdResultData, T extends AdTemplate> T a(R r4, String str) {
        if (r4 == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            Iterator<AdTemplate> it2 = r4.getAdTemplateList().iterator();
            while (it2.hasNext()) {
                T t4 = (T) it2.next();
                if (String.valueOf(e.dS(t4).adBaseInfo.creativeId).equals(str)) {
                    return t4;
                }
            }
        }
        return (T) r4.getFirstAdTemplate();
    }

    public static AdResultData dD(AdTemplate adTemplate) {
        if (adTemplate == null) {
            return null;
        }
        return adTemplate.createAdResultData();
    }

    public static <R extends AdResultData, T extends AdTemplate> T n(R r4) {
        if (r4 == null) {
            return null;
        }
        return (T) r4.getFirstAdTemplate();
    }

    public static <T extends AdResultData> AdResultData a(AdResultData adResultData, AdTemplate adTemplate) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(adTemplate);
        AdResultData m21clone = adResultData.m21clone();
        m21clone.setAdTemplateList(arrayList);
        return m21clone;
    }
}
