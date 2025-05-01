package com.umeng.analytics.pro;

import android.text.TextUtils;
import com.umeng.ccg.ActionInfo;
import com.umeng.ccg.CcgAgent;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.ArrayList;
import org.json.JSONObject;
/* compiled from: Action.java */
/* loaded from: classes6.dex */
public class ab implements ai {

    /* renamed from: a  reason: collision with root package name */
    private String f63292a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<ac> f63293b;

    /* renamed from: c  reason: collision with root package name */
    private String f63294c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f63295d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f63296e = "";

    /* renamed from: f  reason: collision with root package name */
    private String f63297f = "";

    public ab(String str, ArrayList<ac> arrayList) {
        this.f63292a = null;
        this.f63293b = new ArrayList<>();
        this.f63292a = str;
        this.f63293b = arrayList;
    }

    public String a() {
        return this.f63292a;
    }

    public String b() {
        return this.f63294c;
    }

    public String c() {
        return this.f63295d;
    }

    private String c(String str) {
        String[] split = str.split(",");
        String str2 = "";
        if (split.length > 0) {
            ArrayList<String> forbidSdkArray = CcgAgent.getForbidSdkArray(this.f63292a);
            if (forbidSdkArray != null && forbidSdkArray.size() > 0) {
                this.f63297f = forbidSdkArray.toString();
                for (String str3 : split) {
                    if (CcgAgent.getActionInfo(str3) != null && !forbidSdkArray.contains(str3)) {
                        return str3;
                    }
                }
                return "";
            }
            for (String str4 : split) {
                ActionInfo actionInfo = CcgAgent.getActionInfo(str4);
                if (actionInfo != null) {
                    String[] supportAction = actionInfo.getSupportAction(UMGlobalContext.getAppContext());
                    if (supportAction.length > 0) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= supportAction.length) {
                                break;
                            } else if (this.f63292a.equals(supportAction[i4])) {
                                str2 = str4;
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            return str2;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return str2;
        }
        return "";
    }

    public void a(String str) {
        this.f63294c = str;
    }

    public void b(String str) {
        this.f63295d = str;
    }

    @Override // com.umeng.analytics.pro.ai
    public JSONObject a(String str, JSONObject jSONObject) {
        try {
            int size = this.f63293b.size();
            if (size == 0) {
                return null;
            }
            for (int i4 = 0; i4 < size; i4++) {
                if (this.f63293b.get(i4).b()) {
                    return null;
                }
            }
            if (CcgAgent.hasRegistedActionInfo() && !TextUtils.isEmpty(this.f63295d)) {
                String c5 = c(this.f63295d);
                this.f63296e = c5;
                if (TextUtils.isEmpty(c5)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "采集项：" + this.f63292a + "; 未选中可用Module ; sdk: " + this.f63295d);
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "采集项：" + this.f63292a + "; 选中Module: " + this.f63296e + "; sdk: " + this.f63295d);
                }
            }
            ac acVar = this.f63293b.get(size - 1);
            if (acVar == null || !(acVar instanceof ae)) {
                return null;
            }
            long c6 = acVar.c();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("actionName", this.f63292a);
                jSONObject2.put(com.umeng.ccg.a.f64025r, this.f63295d);
                jSONObject2.put(com.umeng.ccg.a.f64022o, this.f63294c);
                jSONObject2.put("delay", c6);
                jSONObject2.put(com.umeng.ccg.a.f64023p, this.f63296e);
                jSONObject2.put(com.umeng.ccg.a.f64024q, this.f63297f);
            } catch (Throwable unused) {
            }
            return jSONObject2;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
