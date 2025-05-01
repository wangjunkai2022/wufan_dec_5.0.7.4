package com.beizi.ad.internal.utilities;

import android.text.TextUtils;
import com.beizi.ad.internal.h;
import com.beizi.ad.lance.a.c;
import com.beizi.ad.lance.a.l;
import java.util.List;
/* loaded from: classes2.dex */
public class ReportEventUtil {
    private static final String TAG = "ReportEventUtil";

    public static void report(List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            String str = list.get(i4);
            l.a(TAG, "ReportEventUtil:" + str);
            if (!TextUtils.isEmpty(str)) {
                new h(UrlUtil.replaceToTouchEventUrl(str, "", "", "", "", "", "", "")).executeOnExecutor(c.b().d(), new Void[0]);
            }
        }
    }
}
