package com.heepay.plugin.d.a;

import android.text.TextUtils;
import android.webkit.WebView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.Gson;
import com.join.mgps.activity.QuarkPromptActivity_;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, Method> f14398a;

    /* renamed from: b  reason: collision with root package name */
    private String f14399b;

    /* renamed from: c  reason: collision with root package name */
    private String f14400c;

    /* renamed from: d  reason: collision with root package name */
    private Gson f14401d;

    public c(String str, Class cls) {
        Method[] declaredMethods;
        String a5;
        try {
            if (TextUtils.isEmpty(str)) {
                throw new d("injected name can not be null");
            }
            this.f14399b = str;
            this.f14398a = new HashMap<>();
            StringBuilder sb = new StringBuilder("javascript:(function(b){console.log(\"");
            sb.append(this.f14399b);
            sb.append(" initialization begin\");var a={queue:[],callback:function(){var d=Array.prototype.slice.call(arguments,0);var c=d.shift();var e=d.shift();this.queue[c].apply(this,d);if(!e){delete this.queue[c]}}};");
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getModifiers() == 9 && (a5 = a(method)) != null) {
                    com.heepay.plugin.c.c.b("---->methodName", method.getName());
                    this.f14398a.put(a5, method);
                    sb.append(String.format("a.%s=", method.getName()));
                    com.heepay.plugin.c.c.b("---->builder", sb.toString());
                }
            }
            sb.append("function(){var f=Array.prototype.slice.call(arguments,0);if(f.length<1){throw\"");
            sb.append(this.f14399b);
            sb.append(" call error, message:miss method name\"}var e=[];for(var h=1;h<f.length;h++){var c=f[h];var j=typeof c;e[e.length]=j;if(j==\"function\"){var d=a.queue.length;a.queue[d]=c;f[h]=d}}var g=JSON.parse(prompt(JSON.stringify({method:f.shift(),types:e,args:f})));if(g.code!=200){throw\"");
            sb.append(this.f14399b);
            sb.append(" call error, code:\"+g.code+\", message:\"+g.result}return g.result};Object.getOwnPropertyNames(a).forEach(function(d){var c=a[d];if(typeof c===\"function\"&&d!==\"callback\"){a[d]=function(){return c.apply(a,[d].concat(Array.prototype.slice.call(arguments,0)))}}});b.");
            sb.append(this.f14399b);
            sb.append("=a;console.log(\"");
            sb.append(this.f14399b);
            sb.append(" initialization end\")})(window);");
            String sb2 = sb.toString();
            this.f14400c = sb2;
            com.heepay.plugin.c.c.b("---->3", sb2);
        } catch (d e5) {
            com.heepay.plugin.c.c.e("---->", "js initialization error:" + e5.getMessage());
        }
    }

    private String a(String str, int i4, Object obj) {
        String valueOf;
        String str2;
        if (obj == null) {
            valueOf = "null";
        } else {
            if (obj instanceof String) {
                String replace = ((String) obj).replace(m.a.f71493g, "\\\"");
                valueOf = m.a.f71493g + ((Object) replace) + m.a.f71493g;
                str2 = "---->是否有进入String";
            } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Boolean) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof JSONObject)) {
                valueOf = String.valueOf(obj);
            } else {
                if (this.f14401d == null) {
                    this.f14401d = new Gson();
                }
                valueOf = this.f14401d.toJson(obj);
                str2 = "---->是否有进入mGson";
            }
            com.heepay.plugin.c.c.b(str2, "------");
        }
        String format = String.format("{\"code\": %d, \"result\": %s}", Integer.valueOf(i4), valueOf);
        com.heepay.plugin.c.c.b("---->", this.f14399b + " call json: " + str + " result:" + format);
        return format;
    }

    private String a(Method method) {
        StringBuilder sb;
        String str;
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length;
        if (length < 1 || parameterTypes[0] != WebView.class) {
            com.heepay.plugin.c.c.d("---->", "method(" + name + ") must use webview to be first parameter, will be pass");
            return null;
        }
        for (int i4 = 1; i4 < length; i4++) {
            Class<?> cls = parameterTypes[i4];
            if (cls == String.class) {
                sb = new StringBuilder();
                sb.append(name);
                str = "_S";
            } else if (cls == Integer.TYPE || cls == Long.TYPE || cls == Float.TYPE || cls == Double.TYPE) {
                sb = new StringBuilder();
                sb.append(name);
                str = "_N";
            } else if (cls == Boolean.TYPE) {
                sb = new StringBuilder();
                sb.append(name);
                str = "_B";
            } else if (cls == JSONObject.class) {
                sb = new StringBuilder();
                sb.append(name);
                str = "_O";
            } else if (cls == e.class) {
                sb = new StringBuilder();
                sb.append(name);
                str = "_F";
            } else {
                sb = new StringBuilder();
                sb.append(name);
                str = "_P";
            }
            sb.append(str);
            name = sb.toString();
        }
        return name;
    }

    public String a() {
        return this.f14400c;
    }

    public String a(WebView webView, String str) {
        StringBuilder sb;
        String message;
        String sb2;
        if (TextUtils.isEmpty(str)) {
            sb2 = "call data empty";
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString(com.alipay.sdk.packet.d.f4910s);
                JSONArray jSONArray = jSONObject.getJSONArray("types");
                JSONArray jSONArray2 = jSONObject.getJSONArray(QuarkPromptActivity_.E);
                int length = jSONArray.length();
                Object[] objArr = new Object[length + 1];
                int i4 = 0;
                objArr[0] = webView;
                int i5 = 0;
                while (true) {
                    Object obj = null;
                    if (i4 >= length) {
                        break;
                    }
                    String optString = jSONArray.optString(i4);
                    if (TypedValues.Custom.S_STRING.equals(optString)) {
                        string = string + "_S";
                        int i6 = i4 + 1;
                        if (!jSONArray2.isNull(i4)) {
                            obj = jSONArray2.getString(i4);
                        }
                        objArr[i6] = obj;
                    } else if ("number".equals(optString)) {
                        string = string + "_N";
                        i5 = (i5 * 10) + i4 + 1;
                    } else if ("boolean".equals(optString)) {
                        string = string + "_B";
                        objArr[i4 + 1] = Boolean.valueOf(jSONArray2.getBoolean(i4));
                    } else if ("object".equals(optString)) {
                        string = string + "_O";
                        int i7 = i4 + 1;
                        if (!jSONArray2.isNull(i4)) {
                            obj = jSONArray2.getJSONObject(i4);
                        }
                        objArr[i7] = obj;
                    } else if ("function".equals(optString)) {
                        string = string + "_F";
                        objArr[i4 + 1] = new e(webView, this.f14399b, jSONArray2.getInt(i4));
                    } else {
                        string = string + "_P";
                    }
                    i4++;
                }
                Method method = this.f14398a.get(string);
                if (method == null) {
                    return a(str, 500, "not found method(" + string + ") with valid parameters");
                }
                if (i5 > 0) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    while (i5 > 0) {
                        int i8 = i5 - ((i5 / 10) * 10);
                        Class<?> cls = parameterTypes[i8];
                        if (cls == Integer.TYPE) {
                            objArr[i8] = Integer.valueOf(jSONArray2.getInt(i8 - 1));
                        } else if (cls == Long.TYPE) {
                            objArr[i8] = Long.valueOf(Long.parseLong(jSONArray2.getString(i8 - 1)));
                        } else {
                            objArr[i8] = Double.valueOf(jSONArray2.getDouble(i8 - 1));
                        }
                        i5 /= 10;
                    }
                }
                return a(str, 200, method.invoke(null, objArr));
            } catch (IllegalAccessException | InvocationTargetException | JSONException e5) {
                e5.printStackTrace();
                if (e5.getCause() != null) {
                    sb = new StringBuilder();
                    sb.append("method execute error:");
                    message = e5.getCause().getMessage();
                } else {
                    sb = new StringBuilder();
                    sb.append("method execute error:");
                    message = e5.getMessage();
                }
                sb.append(message);
                sb2 = sb.toString();
            }
        }
        return a(str, 500, sb2);
    }
}
