package com.kwad.components.ad.reward.l.b;

import android.content.Context;
import androidx.annotation.Nullable;
import com.kwad.sdk.core.response.b.e;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.al;
import com.kwad.sdk.utils.t;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class a extends com.kwad.components.ad.reward.l.a {
    private c xI = new c();
    private C0429a xJ = new C0429a();
    private final b xK = new b(com.kwad.components.ad.reward.a.b.gs());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.ad.reward.l.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0429a extends com.kwad.components.ad.reward.l.b {
        public C0429a() {
            this.xE = "安装应用";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class b extends com.kwad.components.ad.reward.l.b {
        public b(int i4) {
            StringBuilder sb = new StringBuilder();
            sb.append(i4);
            this.xE = String.format("进阶奖励：安装并激活APP %ss", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i4);
            this.xF = String.format("进阶奖励：安装并激活APP %ss", sb2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class c extends com.kwad.components.ad.reward.l.b {
        public c() {
            this.xE = "基础奖励：观看视频";
            this.xF = "基础奖励：需再观看%ss视频";
        }
    }

    public static void a(a aVar, Context context, AdTemplate adTemplate) {
        if (al.an(context, com.kwad.sdk.core.response.b.a.ax(e.dS(adTemplate)))) {
            aVar.jE();
        } else {
            aVar.jF();
        }
    }

    private void jD() {
        if (this.xI.isCompleted() && this.xJ.isCompleted() && this.xK.isCompleted()) {
            jt();
        } else {
            ju();
        }
    }

    private void jF() {
        com.kwad.sdk.core.e.c.d("LaunchAppTask", "markInstallUncompleted");
        this.xJ.ju();
        jD();
    }

    @Override // com.kwad.components.ad.reward.l.b, com.kwad.components.ad.reward.l.c
    public final boolean isCompleted() {
        return this.xJ.isCompleted() && this.xK.isCompleted();
    }

    public final void jB() {
        com.kwad.sdk.core.e.c.d("LaunchAppTask", "markWatchVideoCompleted");
        this.xI.jt();
        jD();
    }

    public final boolean jC() {
        return this.xI.isCompleted();
    }

    public final void jE() {
        com.kwad.sdk.core.e.c.d("LaunchAppTask", "markInstallCompleted");
        this.xJ.jt();
        jD();
    }

    public final void jG() {
        com.kwad.sdk.core.e.c.d("LaunchAppTask", "markUseAppCompleted");
        this.xK.jt();
        jD();
    }

    public final boolean jH() {
        com.kwad.sdk.core.e.c.d("LaunchAppTask", "isInstallCompleted");
        return this.xJ.isCompleted();
    }

    @Override // com.kwad.components.ad.reward.l.a
    public final List<com.kwad.components.ad.reward.l.c> jr() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.xI);
        arrayList.add(this.xK);
        return arrayList;
    }

    @Override // com.kwad.components.ad.reward.l.a
    public final int js() {
        int i4 = 0;
        for (com.kwad.components.ad.reward.l.c cVar : jr()) {
            if (!cVar.isCompleted()) {
                i4++;
            }
        }
        return i4;
    }

    @Override // com.kwad.components.ad.reward.l.b, com.kwad.sdk.core.b
    public final void parseJson(@Nullable JSONObject jSONObject) {
        try {
            this.xI.parseJson(jSONObject.optJSONObject("mWatchVideoTask"));
            this.xK.parseJson(jSONObject.optJSONObject("mUseAppTask"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.kwad.components.ad.reward.l.b, com.kwad.sdk.core.b
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        t.a(jSONObject, "mWatchVideoTask", this.xI);
        t.a(jSONObject, "mInstallAppTask", this.xJ);
        t.a(jSONObject, "mUseAppTask", this.xK);
        return jSONObject;
    }
}
