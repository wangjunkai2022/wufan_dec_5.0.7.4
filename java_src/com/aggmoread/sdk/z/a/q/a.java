package com.aggmoread.sdk.z.a.q;

import android.text.TextUtils;
import com.aggmoread.sdk.z.a.d;
import com.aggmoread.sdk.z.a.g.c;
import com.aggmoread.sdk.z.a.g.e;
import com.aggmoread.sdk.z.a.p.a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    static int f2396a = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.aggmoread.sdk.z.a.q.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0071a implements a.g {
        C0071a() {
        }

        @Override // com.aggmoread.sdk.z.a.p.a.g
        public void a(int i4, byte[] bArr, e eVar) {
            d.a("APIRTAG", "statusCode %s, e %s", Integer.valueOf(i4), eVar);
        }
    }

    public static String a(String str, c cVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a5 = a(a(a(str, "__WIDTH__", String.valueOf(cVar.f2088e)), "__HEIGHT__", String.valueOf(cVar.f2089f)), "__UP_X__", String.valueOf(cVar.f2086c));
        int i4 = cVar.f2086c;
        int i5 = cVar.f2088e;
        if (i4 > i5) {
            cVar.f2086c = i5 - 1;
        } else if (i4 < 0) {
            cVar.f2086c = 1;
        }
        String a6 = a(a5, "__UP_Y__", String.valueOf(cVar.f2087d));
        int i6 = cVar.f2087d;
        int i7 = cVar.f2089f;
        if (i6 > i7) {
            cVar.f2087d = i7 - 1;
        } else if (i6 < 0) {
            cVar.f2087d = 1;
        }
        String a7 = a(a(a6, "__CLICK_ID__", String.valueOf(cVar.f2092i)), "__EVENT_TIME_END__", String.valueOf(cVar.f2091h));
        if (Math.abs(cVar.f2084a - cVar.f2086c) > f2396a) {
            cVar.f2084a = cVar.f2086c;
        }
        if (Math.abs(cVar.f2085b - cVar.f2087d) > f2396a) {
            cVar.f2085b = cVar.f2087d;
        }
        return a(a(a(a7, "__DOWN_X__", String.valueOf(cVar.f2084a)), "__DOWN_Y__", String.valueOf(cVar.f2085b)), "__EVENT_TIME_START__", String.valueOf(cVar.f2090g));
    }

    public static final String a(String str, String str2, String str3) {
        return str.contains(str2) ? str.replace(str2, str3) : str;
    }

    public static List<String> a(String str, List<String> list, c cVar) {
        d.c("APIRTAG", "startReport Dsp Api  (" + str + ")");
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                String a5 = a(list.get(i4), cVar);
                if (!TextUtils.isEmpty(a5)) {
                    arrayList.add(a5);
                }
            }
            a(str, arrayList);
        }
        return arrayList;
    }

    public static void a(String str, List<String> list) {
        d.c("APIRTAG", "startReport2 Dsp Api  (" + str + ")");
        if (list == null || list.size() == 0) {
            return;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            String str2 = list.get(i4);
            if (!TextUtils.isEmpty(str2)) {
                com.aggmoread.sdk.z.a.p.a.a(str2, null, new C0071a());
            }
        }
    }
}
