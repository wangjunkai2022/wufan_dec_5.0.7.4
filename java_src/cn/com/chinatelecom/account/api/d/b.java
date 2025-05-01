package cn.com.chinatelecom.account.api.d;

import android.content.Context;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.CtAuth;
import cn.com.chinatelecom.account.api.e.j;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class b extends f {

    /* renamed from: b  reason: collision with root package name */
    private static final String f628b = "b";

    public b(Context context) {
        super(context);
    }

    @Override // cn.com.chinatelecom.account.api.d.e
    public h a(String str, String str2, int i4, g gVar) {
        return a(str) ? b(str, str2, i4, gVar) : c(str, str2, i4, gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x030e A[Catch: IOException -> 0x0178, TRY_ENTER, TryCatch #1 {IOException -> 0x0178, blocks: (B:59:0x0174, B:63:0x017c, B:82:0x020a, B:84:0x020f, B:94:0x028c, B:96:0x0291, B:106:0x030e, B:108:0x0313, B:118:0x0392, B:120:0x0397), top: B:134:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0313 A[Catch: IOException -> 0x0178, TRY_LEAVE, TryCatch #1 {IOException -> 0x0178, blocks: (B:59:0x0174, B:63:0x017c, B:82:0x020a, B:84:0x020f, B:94:0x028c, B:96:0x0291, B:106:0x030e, B:108:0x0313, B:118:0x0392, B:120:0x0397), top: B:134:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0392 A[Catch: IOException -> 0x0178, TRY_ENTER, TryCatch #1 {IOException -> 0x0178, blocks: (B:59:0x0174, B:63:0x017c, B:82:0x020a, B:84:0x020f, B:94:0x028c, B:96:0x0291, B:106:0x030e, B:108:0x0313, B:118:0x0392, B:120:0x0397), top: B:134:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0397 A[Catch: IOException -> 0x0178, TRY_LEAVE, TryCatch #1 {IOException -> 0x0178, blocks: (B:59:0x0174, B:63:0x017c, B:82:0x020a, B:84:0x020f, B:94:0x028c, B:96:0x0291, B:106:0x030e, B:108:0x0313, B:118:0x0392, B:120:0x0397), top: B:134:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020a A[Catch: IOException -> 0x0178, TRY_ENTER, TryCatch #1 {IOException -> 0x0178, blocks: (B:59:0x0174, B:63:0x017c, B:82:0x020a, B:84:0x020f, B:94:0x028c, B:96:0x0291, B:106:0x030e, B:108:0x0313, B:118:0x0392, B:120:0x0397), top: B:134:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020f A[Catch: IOException -> 0x0178, TRY_LEAVE, TryCatch #1 {IOException -> 0x0178, blocks: (B:59:0x0174, B:63:0x017c, B:82:0x020a, B:84:0x020f, B:94:0x028c, B:96:0x0291, B:106:0x030e, B:108:0x0313, B:118:0x0392, B:120:0x0397), top: B:134:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028c A[Catch: IOException -> 0x0178, TRY_ENTER, TryCatch #1 {IOException -> 0x0178, blocks: (B:59:0x0174, B:63:0x017c, B:82:0x020a, B:84:0x020f, B:94:0x028c, B:96:0x0291, B:106:0x030e, B:108:0x0313, B:118:0x0392, B:120:0x0397), top: B:134:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0291 A[Catch: IOException -> 0x0178, TRY_LEAVE, TryCatch #1 {IOException -> 0x0178, blocks: (B:59:0x0174, B:63:0x017c, B:82:0x020a, B:84:0x020f, B:94:0x028c, B:96:0x0291, B:106:0x030e, B:108:0x0313, B:118:0x0392, B:120:0x0397), top: B:134:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cn.com.chinatelecom.account.api.d.h b(java.lang.String r10, java.lang.String r11, int r12, cn.com.chinatelecom.account.api.d.g r13) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.d.b.b(java.lang.String, java.lang.String, int, cn.com.chinatelecom.account.api.d.g):cn.com.chinatelecom.account.api.d.h");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.io.InputStream] */
    public h c(String str, String str2, int i4, g gVar) {
        InputStream inputStream;
        h hVar = new h();
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    HttpURLConnection d5 = d(str, str2, i4, gVar);
                    int responseCode = d5.getResponseCode();
                    int i5 = 0;
                    if (responseCode == 200) {
                        str2 = d5.getInputStream();
                        try {
                            StringBuilder sb = new StringBuilder();
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(str2));
                            while (true) {
                                try {
                                    String readLine = bufferedReader2.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    sb.append(readLine);
                                    sb.append("\n");
                                } catch (SocketTimeoutException e5) {
                                    e = e5;
                                    bufferedReader = bufferedReader2;
                                    hVar.f663b = j.a(MediationConstant.ErrorCode.ADN_AD_SHOW_ERROR, cn.com.chinatelecom.account.api.a.d.a(j.f721f) + "-" + gVar.f642c + "-" + e.getMessage());
                                    CtAuth.warn(f628b, "SocketTimeoutException-" + gVar.f642c + "-" + e.getMessage(), e);
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("SocketTimeoutException ：");
                                    sb2.append(e.getMessage());
                                    cn.com.chinatelecom.account.api.e.f.a(gVar.f643d, hVar.f663b, sb2.toString());
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (str2 != 0) {
                                        str2.close();
                                    }
                                    return hVar;
                                } catch (UnknownHostException e6) {
                                    e = e6;
                                    bufferedReader = bufferedReader2;
                                    hVar.f663b = j.a(MediationConstant.ErrorCode.ADN_AD_CONTEXT, cn.com.chinatelecom.account.api.a.d.a(j.f722g) + "-" + gVar.f642c + "-" + e.getMessage());
                                    CtAuth.warn(f628b, "UnknownHostException-" + gVar.f642c + "-" + e.getMessage(), e);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("UnknownHostException ：");
                                    sb3.append(e.getMessage());
                                    cn.com.chinatelecom.account.api.e.f.a(gVar.f643d, hVar.f663b, sb3.toString());
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (str2 != 0) {
                                        str2.close();
                                    }
                                    return hVar;
                                } catch (IOException e7) {
                                    e = e7;
                                    bufferedReader = bufferedReader2;
                                    hVar.f663b = j.a(80007, cn.com.chinatelecom.account.api.a.d.a(j.f723h) + "-" + gVar.f642c + "-" + e.getMessage());
                                    CtAuth.warn(f628b, "IOException-" + gVar.f642c + "-" + e.getMessage(), e);
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("IOException ：");
                                    sb4.append(e.getMessage());
                                    cn.com.chinatelecom.account.api.e.f.a(gVar.f643d, hVar.f663b, sb4.toString());
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (str2 != 0) {
                                        str2.close();
                                    }
                                    return hVar;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader = bufferedReader2;
                                    hVar.f663b = j.a(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, cn.com.chinatelecom.account.api.a.d.a(j.f717b) + "-" + gVar.f642c + "-" + th.getMessage());
                                    CtAuth.warn(f628b, "Throwable-" + gVar.f642c + "-" + th.getMessage(), th);
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("Throwable ：");
                                    sb5.append(th.getMessage());
                                    cn.com.chinatelecom.account.api.e.f.a(gVar.f643d, hVar.f663b, sb5.toString());
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (str2 != 0) {
                                        str2.close();
                                    }
                                    return hVar;
                                }
                            }
                            hVar.f662a = 0;
                            String sb6 = sb.toString();
                            if (!TextUtils.isEmpty(sb6)) {
                                JSONObject jSONObject = new JSONObject(sb6);
                                hVar.f663b = jSONObject;
                                cn.com.chinatelecom.account.api.e.f.a(gVar.f643d, jSONObject, null);
                            }
                            cn.com.chinatelecom.account.api.e.f.a(gVar.f643d, hVar.f663b, null);
                            d a5 = cn.com.chinatelecom.account.api.e.a.a(this.f639a, d5, true);
                            if (a5 != null) {
                                hVar.f664c = a5.f634a;
                                cn.com.chinatelecom.account.api.e.f.a(gVar.f643d).f(a5.f636c);
                            }
                            bufferedReader = bufferedReader2;
                            inputStream = str2;
                        } catch (SocketTimeoutException e8) {
                            e = e8;
                        } catch (UnknownHostException e9) {
                            e = e9;
                        } catch (IOException e10) {
                            e = e10;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        if (responseCode == 302) {
                            int i6 = gVar.f641b;
                            if (i6 < 10) {
                                gVar.f641b = i6 + 1;
                                gVar.f645f = false;
                                String headerField = d5.getHeaderField("Location");
                                d a6 = cn.com.chinatelecom.account.api.e.a.a(d5);
                                cn.com.chinatelecom.account.api.e.f.a(gVar.f643d).f(a6.f636c);
                                if (!TextUtils.isEmpty(a6.f637d) && !a6.f637d.equals("0")) {
                                    i5 = 1;
                                }
                                CtAuth.info(f628b, " method : " + i5);
                                return a(headerField, null, i5, gVar);
                            }
                            JSONObject a7 = j.a(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, cn.com.chinatelecom.account.api.a.d.a(j.f717b) + "-Redirect more than 10 times");
                            hVar.f663b = a7;
                            cn.com.chinatelecom.account.api.e.f.a(gVar.f643d, a7, "Redirect more than 10 times");
                        } else {
                            hVar.f663b = j.a(MediationConstant.ErrorCode.ADN_AD_NO_CACHE, cn.com.chinatelecom.account.api.a.d.a(j.f718c) + "-" + gVar.f642c + "-code : " + responseCode);
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(" Http response code :");
                            sb7.append(responseCode);
                            String sb8 = sb7.toString();
                            cn.com.chinatelecom.account.api.e.f.a(gVar.f643d, hVar.f663b, sb8);
                            CtAuth.info(f628b, sb8);
                        }
                        inputStream = null;
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            } catch (SocketTimeoutException e12) {
                e = e12;
                str2 = 0;
            } catch (UnknownHostException e13) {
                e = e13;
                str2 = 0;
            } catch (IOException e14) {
                e = e14;
                str2 = 0;
            } catch (Throwable th3) {
                th = th3;
                str2 = 0;
            }
            return hVar;
        } catch (Throwable th4) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e15) {
                    e15.printStackTrace();
                    throw th4;
                }
            }
            if (str2 != 0) {
                str2.close();
            }
            throw th4;
        }
    }
}
