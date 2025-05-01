package com.tencent.stat.a;

import android.content.Context;
import com.tencent.stat.StatConfig;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class a extends e {

    /* renamed from: a  reason: collision with root package name */
    Map<String, ?> f62881a;

    public a(Context context, int i4, Map<String, ?> map) {
        super(context, i4);
        this.f62881a = null;
        this.f62881a = map;
    }

    @Override // com.tencent.stat.a.e
    public f a() {
        return f.ADDITION;
    }

    @Override // com.tencent.stat.a.e
    public boolean a(JSONObject jSONObject) {
        com.tencent.stat.common.k.a(jSONObject, "qq", StatConfig.getQQ());
        Map<String, ?> map = this.f62881a;
        if (map == null || map.size() <= 0) {
            return true;
        }
        for (Map.Entry<String, ?> entry : this.f62881a.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return true;
    }
}
