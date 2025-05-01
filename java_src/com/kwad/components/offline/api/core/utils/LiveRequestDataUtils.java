package com.kwad.components.offline.api.core.utils;

import androidx.annotation.NonNull;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Iterator;
import java.util.Map;
import m.a;
/* loaded from: classes5.dex */
public final class LiveRequestDataUtils {
    public static String appendUrl(@NonNull String str, Map<String, String> map) {
        String str2;
        if (map == null || map.size() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it2 = map.keySet().iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            str2 = a.f71490d;
            if (!hasNext) {
                break;
            }
            String next = it2.next();
            if (map.get(next) != null) {
                sb.append(next);
                sb.append(SimpleComparison.EQUAL_TO_OPERATION);
                sb.append(map.get(next));
                sb.append(a.f71490d);
            }
        }
        String sb2 = sb.toString();
        String substring = sb2.substring(0, sb2.length() - 1);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        if (!str.contains("?")) {
            str2 = "?";
        }
        sb3.append(str2);
        String sb4 = sb3.toString();
        return sb4 + substring;
    }
}
