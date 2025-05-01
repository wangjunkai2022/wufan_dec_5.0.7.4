package com.kwai.adclient.kscommerciallogger.snapshot;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class c {
    private final String aVv;
    private final LinkedList<d> aVw;
    private int aVx;
    private final int aVy;
    private long aVz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str) {
        this(str, 10);
    }

    public final synchronized long Pd() {
        return this.aVz;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.aVv.equals(((c) obj).aVv);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String getName() {
        return this.aVv;
    }

    public int hashCode() {
        return Objects.hash(this.aVv);
    }

    public synchronized d hw(String str) {
        d dVar;
        if (this.aVw.size() >= this.aVy) {
            this.aVw.removeFirst();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        int i4 = this.aVx;
        this.aVx = i4 + 1;
        sb.append(i4);
        dVar = new d(sb.toString());
        this.aVw.addLast(dVar);
        this.aVz = System.currentTimeMillis();
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized JSONObject hx(String str) {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<d> it2 = this.aVw.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next().Pc());
            }
            jSONObject.put("session_id", str);
            jSONObject.put("segment_name", this.aVv);
            jSONObject.put("spans", jSONArray);
            this.aVz = System.currentTimeMillis();
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str, int i4) {
        this.aVv = str == null ? "" : str;
        this.aVw = new LinkedList<>();
        this.aVy = Math.min(i4, 30);
        this.aVz = System.currentTimeMillis();
    }
}
