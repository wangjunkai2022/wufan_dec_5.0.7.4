package com.kwad.sdk.m.a;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.ksad.json.annotation.KsJson;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.s;
import java.util.ArrayList;
import java.util.List;
@KsJson
/* loaded from: classes5.dex */
public class a extends com.kwad.sdk.core.response.a.a {
    public static final String TAG = "Ranger_" + a.class.getSimpleName();
    public String aOA;
    public String aOB;
    public boolean aOC;
    @NonNull
    public String aOD;
    public b aOE;
    public a aOF;
    public Object aOz;

    @KsJson
    /* renamed from: com.kwad.sdk.m.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0539a extends com.kwad.sdk.core.response.a.a {
        public String aOG;
        public String aOH;
        public String aOI;
        public List<String> aOJ;
        public List<C0539a> aOK = new ArrayList();
        public Object aOL;
        public List<Object> aOM;
        public String className;
        public String fieldName;

        private Object Lo() {
            Object obj = null;
            try {
            } catch (Exception e5) {
                c.d(a.TAG, Log.getStackTraceString(e5));
            }
            if (TextUtils.isEmpty(this.className)) {
                c.w(a.TAG, "SpecialParam className is null");
                return null;
            }
            obj = s.gF(this.className);
            String str = a.TAG;
            c.d(str, "Class.forName(className):" + this.className + " value:" + obj);
            List<C0539a> list = this.aOK;
            if (list != null && !list.isEmpty()) {
                for (C0539a c0539a : this.aOK) {
                    c0539a.aOL = obj;
                    String str2 = a.TAG;
                    c.d(str2, "param.ob:" + c0539a.aOL);
                    try {
                        s.a(c0539a.aOL, c0539a.fieldName, c0539a.getValue());
                    } catch (Exception e6) {
                        c.d(a.TAG, Log.getStackTraceString(e6));
                    }
                }
            }
            String str3 = a.TAG;
            c.d(str3, "return value in special:" + obj);
            return obj;
        }

        private Object Lp() {
            if (TextUtils.isEmpty(this.aOI)) {
                return an(this.aOG, this.aOH);
            }
            this.aOM = new ArrayList();
            for (String str : this.aOJ) {
                Object an = an(this.aOI, str);
                if (an != null) {
                    this.aOM.add(an);
                }
            }
            return this.aOM;
        }

        private static Object an(String str, String str2) {
            Object obj = null;
            try {
                Class<?> cls = Class.forName(str);
                if (cls == Integer.class) {
                    obj = Integer.valueOf(Integer.parseInt(str2));
                } else if (cls == Long.class) {
                    obj = Long.valueOf(Long.parseLong(str2));
                } else if (cls == Float.class) {
                    obj = Float.valueOf(Float.parseFloat(str2));
                } else if (cls == Boolean.class) {
                    obj = Boolean.valueOf(Boolean.parseBoolean(str2));
                } else if (cls == Double.class) {
                    obj = Double.valueOf(Double.parseDouble(str2));
                } else {
                    if (cls != String.class) {
                        str2 = null;
                    }
                    obj = str2;
                }
            } catch (Exception e5) {
                c.w(a.TAG, Log.getStackTraceString(e5));
            }
            return obj;
        }

        public final Object getValue() {
            if (TextUtils.isEmpty(this.aOG) && TextUtils.isEmpty(this.aOI)) {
                return Lo();
            }
            return Lp();
        }
    }

    @KsJson
    /* loaded from: classes5.dex */
    public static class b extends com.kwad.sdk.core.response.a.a {
        public boolean aON;
        public List<C0539a> aOO;
        public Object[] aOP;
        public String name;

        public final boolean Ln() {
            if (TextUtils.isEmpty(this.name)) {
                List<C0539a> list = this.aOO;
                return (list == null || list.isEmpty()) && this.aOP == null;
            }
            return false;
        }

        public final Object[] Lq() {
            List<C0539a> list = this.aOO;
            if (list == null || list.isEmpty()) {
                return null;
            }
            Object[] objArr = new Object[this.aOO.size()];
            for (int i4 = 0; i4 < this.aOO.size(); i4++) {
                objArr[i4] = this.aOO.get(i4).getValue();
            }
            return objArr;
        }
    }

    public final boolean Ln() {
        if (this.aOz == null && TextUtils.isEmpty(this.aOA) && TextUtils.isEmpty(this.aOB) && TextUtils.isEmpty(this.aOD)) {
            b bVar = this.aOE;
            if (bVar == null || bVar.Ln()) {
                a aVar = this.aOF;
                return aVar == null || aVar.Ln();
            }
            return false;
        }
        return false;
    }
}
