package com.kwad.sdk.collector;

import android.text.TextUtils;
import com.join.mgps.Util.h0;
import com.join.mgps.activity.NoticeTopAnimActivityDialog_;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class g {
    public static int PERMISSION_DENIED = 2;
    public static int PERMISSION_GRANTED = 1;
    public static int aoF;
    private String aoE;
    private int state;

    public g(String str, int i4) {
        this.state = aoF;
        this.aoE = str;
        this.state = i4;
    }

    private String Bh() {
        int lastIndexOf;
        String str = this.aoE;
        return !TextUtils.isEmpty(str) ? ((str.startsWith("com.android.") || str.startsWith("android.permission")) && (lastIndexOf = str.lastIndexOf(h0.f27805a)) < str.length() + (-1)) ? str.substring(lastIndexOf + 1) : str : str;
    }

    public static JSONArray t(List<g> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null) {
            return jSONArray;
        }
        for (g gVar : list) {
            jSONArray.put(gVar.toJson());
        }
        return jSONArray;
    }

    private JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", Bh());
            jSONObject.put(NoticeTopAnimActivityDialog_.f36148o, this.state);
        } catch (JSONException e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
        }
        return jSONObject;
    }
}
