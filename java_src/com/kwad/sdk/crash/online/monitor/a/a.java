package com.kwad.sdk.crash.online.monitor.a;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ksad.json.annotation.KsJson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
@KsJson
/* loaded from: classes5.dex */
public class a extends com.kwad.sdk.core.response.a.a {
    public List<String> aId = new ArrayList();
    public List<String> aIe = new ArrayList();
    public List<String> aIf = new ArrayList();
    public List<String> aIg = new ArrayList();
    public List<b> aIh = new ArrayList();
    public Map<String, b> aIi = new HashMap();
    public int aIj;
    public int aIk;
    public int aIl;
    public double apu;

    public final boolean IF() {
        return (this.aIl & 4) != 0;
    }

    public final boolean IG() {
        return (this.aIl & 1) != 0;
    }

    public final boolean IH() {
        return (this.aIl & 2) != 0;
    }

    public final boolean II() {
        return this.aIl == 0;
    }

    @Override // com.kwad.sdk.core.response.a.a
    public void afterParseJson(JSONObject jSONObject) {
        super.afterParseJson(jSONObject);
        List<b> list = this.aIh;
        if (list != null) {
            for (b bVar : list) {
                this.aIi.put(bVar.appId, bVar);
            }
            this.aIh.clear();
        }
    }

    @Nullable
    public final b fM(String str) {
        if (this.aIi != null) {
            b bVar = TextUtils.isEmpty(str) ? null : this.aIi.get(str);
            return bVar == null ? this.aIi.get("000000000") : bVar;
        }
        return null;
    }
}
