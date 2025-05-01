package com.kwad.components.core.k;

import com.ksad.json.annotation.KsJson;
import com.kwad.sdk.core.e.c;
import java.text.SimpleDateFormat;
import java.util.Date;
@KsJson
/* loaded from: classes5.dex */
public class a extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
    private static SimpleDateFormat MR = new SimpleDateFormat("yyyy-MM-dd");
    public int MS;
    public long MT;

    public final boolean j(int i4, int i5) {
        c.d("AdForceActiveInfo", "checkAndAddCount forceActiveIntervalHour: " + i4 + ", forceActiveThreshold: " + i5);
        if (this.MT > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            String format = MR.format(new Date(this.MT));
            String format2 = MR.format(new Date(currentTimeMillis));
            c.d("AdForceActiveInfo", "checkAndAddCount lastDate: " + format + ", currentDate: " + format2);
            if (!format.equals(format2)) {
                this.MS = 0;
                ph();
                return true;
            }
            long j4 = this.MT + (i4 * 60 * 60 * 1000);
            c.d("AdForceActiveInfo", "checkAndAddCount minTimestamp: " + j4 + ", currentActiveCount: " + this.MS);
            if (j4 >= currentTimeMillis || this.MS > i5) {
                return false;
            }
            ph();
            return true;
        }
        ph();
        return true;
    }

    public final void ph() {
        this.MT = System.currentTimeMillis();
        this.MS++;
        c.d("AdForceActiveInfo", "doAddCount, lastForceActiveTimestamp: " + this.MT + ", currentActiveCount " + this.MS);
    }
}
