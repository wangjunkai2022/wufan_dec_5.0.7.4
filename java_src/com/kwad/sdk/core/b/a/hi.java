package com.kwad.sdk.core.b.a;

import com.kwad.sdk.m.a.a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class hi implements com.kwad.sdk.core.d<a.C0539a> {
    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(a.C0539a c0539a, JSONObject jSONObject) {
        a2(c0539a, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(a.C0539a c0539a, JSONObject jSONObject) {
        return b2(c0539a, jSONObject);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(a.C0539a c0539a, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        c0539a.aOG = jSONObject.optString("typeStr");
        if (JSONObject.NULL.toString().equals(c0539a.aOG)) {
            c0539a.aOG = "";
        }
        c0539a.aOH = jSONObject.optString("valueStr");
        if (JSONObject.NULL.toString().equals(c0539a.aOH)) {
            c0539a.aOH = "";
        }
        c0539a.aOI = jSONObject.optString("listValueType");
        if (JSONObject.NULL.toString().equals(c0539a.aOI)) {
            c0539a.aOI = "";
        }
        c0539a.aOJ = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("valueStrList");
        if (optJSONArray != null) {
            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                c0539a.aOJ.add((String) optJSONArray.opt(i4));
            }
        }
        c0539a.fieldName = jSONObject.optString("fieldName");
        if (JSONObject.NULL.toString().equals(c0539a.fieldName)) {
            c0539a.fieldName = "";
        }
        c0539a.className = jSONObject.optString("className");
        if (JSONObject.NULL.toString().equals(c0539a.className)) {
            c0539a.className = "";
        }
        c0539a.aOK = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("childParamList");
        if (optJSONArray2 != null) {
            for (int i5 = 0; i5 < optJSONArray2.length(); i5++) {
                a.C0539a c0539a2 = new a.C0539a();
                c0539a2.parseJson(optJSONArray2.optJSONObject(i5));
                c0539a.aOK.add(c0539a2);
            }
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(a.C0539a c0539a, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String str = c0539a.aOG;
        if (str != null && !str.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "typeStr", c0539a.aOG);
        }
        String str2 = c0539a.aOH;
        if (str2 != null && !str2.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "valueStr", c0539a.aOH);
        }
        String str3 = c0539a.aOI;
        if (str3 != null && !str3.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "listValueType", c0539a.aOI);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "valueStrList", c0539a.aOJ);
        String str4 = c0539a.fieldName;
        if (str4 != null && !str4.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "fieldName", c0539a.fieldName);
        }
        String str5 = c0539a.className;
        if (str5 != null && !str5.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "className", c0539a.className);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "childParamList", c0539a.aOK);
        return jSONObject;
    }
}
