package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.kuaishou.weapon.p0.jni.Engine;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class ba {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f55297a;

    public ba(Context context, int i4) {
        if (Engine.loadSuccess) {
            try {
                String pqr = Engine.getInstance(context).pqr(Integer.valueOf(ck.f55410c).intValue(), 2, i4 < 10 ? 10 : i4, "");
                if (TextUtils.isEmpty(pqr)) {
                    return;
                }
                this.f55297a = new JSONObject(pqr);
            } catch (Throwable unused) {
            }
        }
    }

    public String a(String str) {
        JSONObject jSONObject = this.f55297a;
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public JSONObject b(String str) {
        if (this.f55297a != null) {
            try {
                String a5 = a(str);
                if (TextUtils.isEmpty(a5) || a5.length() <= 3) {
                    return null;
                }
                return new JSONObject(a5);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public JSONArray c(String str) {
        JSONObject jSONObject = this.f55297a;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString(str);
                if (TextUtils.isEmpty(string) || string.length() <= 2) {
                    return null;
                }
                JSONArray jSONArray = new JSONArray(string);
                HashSet hashSet = new HashSet();
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    hashSet.add((String) jSONArray.get(i4));
                }
                Set a5 = a(hashSet);
                if (a5 == null || a5.size() <= 0) {
                    return null;
                }
                return new JSONArray((Collection) a5);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public JSONObject d(String str) {
        if (this.f55297a != null) {
            try {
                String a5 = a(str);
                if (TextUtils.isEmpty(a5) || a5.length() <= 3) {
                    return null;
                }
                return a(new JSONObject(a5));
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public JSONObject a(String str, boolean z4) {
        if (this.f55297a != null) {
            try {
                String a5 = a(str);
                if (!TextUtils.isEmpty(a5) && a5.length() > 3) {
                    JSONObject jSONObject = new JSONObject(a5);
                    if (z4) {
                        Iterator<String> keys = jSONObject.keys();
                        boolean z5 = false;
                        while (keys.hasNext()) {
                            if (jSONObject.getInt(keys.next()) == 1) {
                                z5 = true;
                            }
                        }
                        if (z5) {
                            return jSONObject;
                        }
                        return null;
                    }
                    return jSONObject;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public boolean a(Set set, String str) {
        try {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (!str2.equals(str) && str2.contains(str)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public Set a(Set set) {
        if (set != null) {
            try {
                if (set.size() > 0) {
                    HashSet hashSet = new HashSet();
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        if (!a(set, str)) {
                            hashSet.add(str);
                        }
                    }
                    return hashSet;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public JSONObject a(JSONObject jSONObject) {
        try {
            String a5 = i.a("da4c6c97b9", "0702");
            String a6 = i.a("da4c709eb15f", "0702");
            JSONArray optJSONArray = jSONObject.optJSONArray(a5);
            JSONArray optJSONArray2 = jSONObject.optJSONArray(a6);
            JSONObject jSONObject2 = new JSONObject();
            if (optJSONArray != null && optJSONArray.length() == 3) {
                jSONObject2.put("0", optJSONArray.get(2));
            }
            if (optJSONArray2 != null && optJSONArray2.length() == 3) {
                jSONObject2.put("1", optJSONArray2.get(2));
            }
            if (jSONObject2.length() > 0) {
                return jSONObject2;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
