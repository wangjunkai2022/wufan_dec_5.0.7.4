package com.join.mgps.listener;

import android.content.Context;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.mgps.Util.AccountUtil_;
import com.papa.sim.statistic.h;
import java.util.Iterator;
import java.util.List;
/* compiled from: IStatServiceImpl.java */
/* loaded from: classes3.dex */
public class d implements h {
    @Override // com.papa.sim.statistic.h
    public String a(Context context) {
        return AccountUtil_.getInstance_(context).getUid();
    }

    @Override // com.papa.sim.statistic.h
    public String b(Context context) {
        return AccountUtil_.getInstance_(context).getToken();
    }

    @Override // com.papa.sim.statistic.h
    public String c() {
        StringBuilder sb = new StringBuilder("");
        List<DownloadTask> p4 = p1.f.K().p();
        if (p4 != null && p4.size() > 0) {
            Iterator<DownloadTask> it2 = p4.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next().getCrc_link_type_val() + ",");
            }
        }
        return sb.toString();
    }
}
