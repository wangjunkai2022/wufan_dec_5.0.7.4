package com.ss.android.socialbase.appdownloader.vv;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class p extends vv {

    /* renamed from: i  reason: collision with root package name */
    private final JSONObject f60929i;

    public p(Context context, com.ss.android.socialbase.downloader.n.vv vvVar, String str, JSONObject jSONObject) {
        super(context, vvVar, str);
        this.f60929i = jSONObject;
    }

    private static void vv(@NonNull Intent intent, JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys;
        if (jSONObject == null || jSONObject2 == null || jSONObject.length() != jSONObject2.length() || intent == null || (keys = jSONObject.keys()) == null) {
            return;
        }
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject2.optString(next);
            if (optString != null) {
                vv(jSONObject, next, optString, intent);
            }
        }
    }

    @Override // com.ss.android.socialbase.appdownloader.vv.o
    public Intent m() {
        String optString = this.f60929i.optString("action");
        String optString2 = this.f60929i.optString("category");
        int optInt = this.f60929i.optInt("flags", 1342210048);
        String optString3 = this.f60929i.optString("path_extra_key");
        String optString4 = this.f60929i.optString("path_data_key");
        JSONObject optJSONObject = this.f60929i.optJSONObject("extra");
        JSONObject optJSONObject2 = this.f60929i.optJSONObject("extra_type");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        Intent intent = new Intent(optString);
        if (!TextUtils.isEmpty(optString2)) {
            intent.addCategory(optString2);
        }
        if (!TextUtils.isEmpty(optString4)) {
            try {
                intent.setData(Uri.parse(String.format(optString4, this.f60931p)));
            } catch (Throwable unused) {
            }
        }
        intent.setFlags(optInt);
        if (!TextUtils.isEmpty(optString3)) {
            intent.putExtra(optString3, this.f60931p);
        }
        vv(intent, optJSONObject, optJSONObject2);
        return intent;
    }

    private static void vv(JSONObject jSONObject, String str, String str2, Intent intent) {
        str2.hashCode();
        char c5 = 65535;
        switch (str2.hashCode()) {
            case -1325958191:
                if (str2.equals(MethodReflectParams.DOUBLE)) {
                    c5 = 0;
                    break;
                }
                break;
            case -891985903:
                if (str2.equals(TypedValues.Custom.S_STRING)) {
                    c5 = 1;
                    break;
                }
                break;
            case 104431:
                if (str2.equals(MethodReflectParams.INT)) {
                    c5 = 2;
                    break;
                }
                break;
            case 3327612:
                if (str2.equals(MethodReflectParams.LONG)) {
                    c5 = 3;
                    break;
                }
                break;
            case 64711720:
                if (str2.equals("boolean")) {
                    c5 = 4;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                intent.putExtra(str, jSONObject.optDouble(str));
                return;
            case 1:
                intent.putExtra(str, jSONObject.optString(str));
                return;
            case 2:
                intent.putExtra(str, jSONObject.optInt(str));
                return;
            case 3:
                intent.putExtra(str, jSONObject.optLong(str));
                return;
            case 4:
                intent.putExtra(str, jSONObject.optBoolean(str));
                return;
            default:
                return;
        }
    }
}
