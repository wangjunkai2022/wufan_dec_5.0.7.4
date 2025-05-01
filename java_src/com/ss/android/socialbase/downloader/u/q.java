package com.ss.android.socialbase.downloader.u;

import androidx.annotation.NonNull;
import java.util.List;
/* loaded from: classes5.dex */
public class q {
    public static long m(@NonNull List<wv> list) {
        long j4;
        long j5;
        long j6 = 0;
        loop0: while (true) {
            j4 = -1;
            j5 = -1;
            for (wv wvVar : list) {
                if (j4 == -1) {
                    if (wvVar.vv() > 0) {
                        j4 = wvVar.p();
                        j5 = wvVar.i();
                    }
                } else if (wvVar.p() <= j5) {
                    if (wvVar.i() > j5) {
                        j5 = wvVar.i();
                    }
                } else {
                    j6 += j5 - j4;
                    if (wvVar.vv() > 0) {
                        j4 = wvVar.p();
                        j5 = wvVar.i();
                    }
                }
            }
        }
        return (j4 < 0 || j5 <= j4) ? j6 : j6 + (j5 - j4);
    }

    public static long vv(@NonNull List<wv> list) {
        int size = list.size();
        long j4 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            wv wvVar = list.get(i4);
            if (wvVar.p() > j4) {
                break;
            }
            if (wvVar.o() > j4) {
                j4 = wvVar.o();
            }
        }
        return j4;
    }
}
