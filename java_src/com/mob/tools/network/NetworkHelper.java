package com.mob.tools.network;

import android.content.Context;
import android.os.Build;
import com.alipay.sdk.packet.d;
import com.mob.commons.l;
import com.mob.commons.u;
import com.mob.commons.v;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.proguard.EverythingKeeper;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ReflectHelper;
import com.tencent.bugly.Bugly;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.multipart.HttpPostBodyUtil;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import kotlin.text.Typography;
import org.apache.http.client.methods.HttpPutHC4;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
/* loaded from: classes5.dex */
public class NetworkHelper implements EverythingKeeper {
    public static int connectionTimeout = 0;
    private static boolean followRedirects = true;
    public static int readTimout;
    protected boolean instanceFollowRedirects = followRedirects;

    /* loaded from: classes5.dex */
    public static class NetworkTimeOut implements PublicMemberKeeper {
        public int connectionTimeout;
        public int readTimout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private Object f56838a;

        /* renamed from: b  reason: collision with root package name */
        private String f56839b;

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            if (name.equals(l.a("018ejheSgjgf)i<fkGhgk1heflfihkJkh]fe"))) {
                return null;
            }
            if (name.equals(l.a("018ejheCgjgnGhSflff'h$flheflfihkBkhRfe"))) {
                Object[] objArr2 = (Object[]) objArr[0];
                String str = (String) objArr[1];
                if (objArr2 != null) {
                    if (objArr2.length == 1) {
                        try {
                            Method declaredMethod = objArr2[0].getClass().getDeclaredMethod(l.a("013ejheEgjimHfi)fkfefk=k+ge"), new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(objArr2[0], new Object[0]);
                            return null;
                        } catch (Throwable th) {
                            MobLog.getInstance().e(th);
                            return null;
                        }
                    } else if (this.f56838a != null) {
                        if (Build.VERSION.SDK_INT >= 17) {
                            try {
                                Object newInstance = Class.forName("android.net.http.X509TrustManagerExtensions").getConstructor(Class.forName(l.a("030:jiFf ffZfLgkfnQghk:fnhkhk>i9fniijkhjjlheflfihkZkYje-fgfLglWhYfl"))).newInstance(this.f56838a);
                                Method declaredMethod2 = newInstance.getClass().getDeclaredMethod(l.a("018ejheEgjgn-hFflff$h@flheflfihkGkh@fe"), Array.newInstance(Class.forName(l.a("0345ji0fMff)fHfnhk+heLfiflfk.kDgefnKehXfl8kWfniijkhjjlgf.h.fl[k'fkghfk.efkh")), 0).getClass(), String.class, String.class);
                                declaredMethod2.setAccessible(true);
                                declaredMethod2.invoke(newInstance, objArr2, str, this.f56839b);
                                return null;
                            } catch (Throwable th2) {
                                MobLog.getInstance().e(th2);
                                return null;
                            }
                        }
                        try {
                            Method declaredMethod3 = this.f56838a.getClass().getDeclaredMethod(l.a("018ejheCgjgn4h_flffPh[flheflfihk[khMfe"), Array.newInstance(Class.forName(l.a("034[ji)fOff.f;fnhkThe)fiflfk7k3gefnQeh>fl7kEfniijkhjjlgf!hNfl+k0fkghfk.efkh")), 0).getClass(), String.class);
                            declaredMethod3.setAccessible(true);
                            declaredMethod3.invoke(this.f56838a, objArr2, str);
                            return null;
                        } catch (Throwable th3) {
                            MobLog.getInstance().e(th3);
                            return null;
                        }
                    } else {
                        throw new CertificateException("there were one more certificates but no trust manager found.");
                    }
                }
                throw new IllegalArgumentException("there were no certificates.");
            } else if (name.equals(l.a("018%glThk?hf>eehlkhTfegghkhkfi(h7flhk"))) {
                try {
                    return Array.newInstance(Class.forName(l.a("0344jiCfYffJf,fnhkShe4fiflfkJkYgefnIeh flFk=fniijkhjjlgf;h.fl(k4fkghfk9efkh")), 0);
                } catch (Throwable th4) {
                    MobLog.getInstance().e(th4);
                    return null;
                }
            } else if (name.equals(l.a("008jfBhkHjJgffmfe;h"))) {
                return Integer.valueOf(hashCode());
            } else {
                if (name.equals("toString")) {
                    return toString();
                }
                return null;
            }
        }

        private a(String str) {
            try {
                this.f56839b = str;
                Method declaredMethod = Class.forName(l.a("033-jiGf1ff;fTgkfn_ghk3fnhkhk'i[fnheflfihk3k3je4fgf=gl,hZflieXfek;fmflge")).getDeclaredMethod(l.a("011Ggl$hkPgg5gDhk^kfgeh"), String.class);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, l.a("0047iijkhjjl"));
                Method method = invoke.getClass().getMethod(l.a("004;fkTg5fkSk"), Class.forName(l.a("022ZjiJfIff+f9fnhkOheLfiflfk9k5gefnkeHh(gegn(kHfmfl'h")));
                method.setAccessible(true);
                method.invoke(invoke, null);
                Method method2 = invoke.getClass().getMethod(l.a("016OglNhk)heflfihkJk9je?fgf]glEhYflhk"), new Class[0]);
                method2.setAccessible(true);
                Object[] objArr = (Object[]) method2.invoke(invoke, new Object[0]);
                if (objArr != null && objArr.length != 0) {
                    this.f56838a = objArr[0];
                    return;
                }
                throw new NoSuchAlgorithmException("no trust manager found.");
            } catch (Exception e5) {
                NLog mobLog = MobLog.getInstance();
                mobLog.d("failed to initialize the standard trust manager: " + e5.getMessage(), new Object[0]);
                this.f56838a = null;
            }
        }
    }

    @Deprecated
    public static String checkHttpRequestUrl(String str) {
        return NetCommunicator.checkHttpRequestUrl(str);
    }

    private HttpURLConnection getConnection(String str, NetworkTimeOut networkTimeOut) throws Throwable {
        Object obj;
        boolean z4;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        String a5 = l.a("012Jfh'hkjNfmfehefmgjThgNhk");
        try {
            obj = ReflectHelper.getInstanceField(httpURLConnection, a5);
        } catch (Throwable unused) {
            obj = null;
        }
        if (obj == null) {
            a5 = "PERMITTED_USER_METHODS";
            try {
                obj = ReflectHelper.getStaticField("HttpURLConnection", "PERMITTED_USER_METHODS");
            } catch (Throwable unused2) {
            }
            z4 = true;
        } else {
            z4 = false;
        }
        if (obj != null) {
            String[] strArr = (String[]) obj;
            String[] strArr2 = new String[strArr.length + 1];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[strArr.length] = l.a("005(inhfhegfhm");
            if (z4) {
                ReflectHelper.setStaticField("HttpURLConnection", a5, strArr2);
            } else {
                ReflectHelper.setInstanceField(httpURLConnection, a5, strArr2);
            }
        }
        System.setProperty("http.keepAlive", Bugly.SDK_IS_DEV);
        if (httpURLConnection instanceof HttpsURLConnection) {
            X509HostnameVerifier x509HostnameVerifier = SSLSocketFactory.STRICT_HOSTNAME_VERIFIER;
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            SSLContext sSLContext = SSLContext.getInstance(l.a("0036hehggn"));
            TrustManager[] trustManagerArr = new TrustManager[0];
            try {
                trustManagerArr = new TrustManager[]{(TrustManager) getTrustManager(httpsURLConnection.getURL().getHost())};
            } catch (Throwable th) {
                MobLog.getInstance().e(th);
            }
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            httpsURLConnection.setHostnameVerifier(x509HostnameVerifier);
        }
        int i4 = networkTimeOut == null ? connectionTimeout : networkTimeOut.connectionTimeout;
        if (i4 > 0) {
            httpURLConnection.setConnectTimeout(i4);
        }
        int i5 = networkTimeOut == null ? readTimout : networkTimeOut.readTimout;
        if (i5 > 0) {
            httpURLConnection.setReadTimeout(i5);
        }
        return httpURLConnection;
    }

    @Deprecated
    private HTTPPart getDataPostHttpPart(HttpURLConnection httpURLConnection, String str, byte[] bArr) throws Throwable {
        ByteArrayPart byteArrayPart = new ByteArrayPart();
        byteArrayPart.append(bArr);
        return byteArrayPart;
    }

    @Deprecated
    private HTTPPart getFilePostHTTPPart(HttpURLConnection httpURLConnection, String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2) throws Throwable {
        String uuid = UUID.randomUUID().toString();
        httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + uuid);
        MultiPart multiPart = new MultiPart();
        StringPart stringPart = new StringPart();
        if (arrayList != null) {
            Iterator<KVPair<String>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                KVPair<String> next = it2.next();
                stringPart.append("--").append(uuid).append("\r\n");
                stringPart.append("Content-Disposition: form-data; name=\"").append(next.name).append("\"\r\n\r\n");
                stringPart.append(next.value).append("\r\n");
            }
        }
        multiPart.append(stringPart);
        Iterator<KVPair<String>> it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            KVPair<String> next2 = it3.next();
            StringPart stringPart2 = new StringPart();
            File file = new File(next2.value);
            stringPart2.append("--").append(uuid).append("\r\n");
            stringPart2.append("Content-Disposition: form-data; name=\"").append(next2.name).append("\"; filename=\"").append(file.getName()).append("\"\r\n");
            String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(next2.value);
            if (contentTypeFor == null || contentTypeFor.length() <= 0) {
                if (next2.value.toLowerCase().endsWith("jpg") || next2.value.toLowerCase().endsWith("jpeg")) {
                    contentTypeFor = "image/jpeg";
                } else if (next2.value.toLowerCase().endsWith("png")) {
                    contentTypeFor = "image/png";
                } else if (next2.value.toLowerCase().endsWith("gif")) {
                    contentTypeFor = "image/gif";
                } else {
                    FileInputStream fileInputStream = null;
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(next2.value);
                        try {
                            contentTypeFor = URLConnection.guessContentTypeFromStream(fileInputStream2);
                            v.a(fileInputStream2);
                            if (contentTypeFor == null || contentTypeFor.length() <= 0) {
                                contentTypeFor = HttpPostBodyUtil.DEFAULT_BINARY_CONTENT_TYPE;
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            v.a(fileInputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
            stringPart2.append("Content-Type: ").append(contentTypeFor).append("\r\n\r\n");
            multiPart.append(stringPart2);
            FilePart filePart = new FilePart();
            filePart.setFile(next2.value);
            multiPart.append(filePart);
            StringPart stringPart3 = new StringPart();
            stringPart3.append("\r\n");
            multiPart.append(stringPart3);
        }
        StringPart stringPart4 = new StringPart();
        stringPart4.append("--").append(uuid).append("--\r\n");
        multiPart.append(stringPart4);
        return multiPart;
    }

    @Deprecated
    private HTTPPart getTextPostHTTPPart(HttpURLConnection httpURLConnection, String str, ArrayList<KVPair<String>> arrayList) throws Throwable {
        httpURLConnection.setRequestProperty("Content-Type", l.a("033flliVfkAefkUfkfmAgn=gkjmhihihijmghfmflfhjmfiflHihge8fmfe6h,fe"));
        StringPart stringPart = new StringPart();
        if (arrayList != null) {
            stringPart.append(requestParamsToUrl(kvPairsToObjHashMap(arrayList)));
        }
        return stringPart;
    }

    public static Object getTrustManager(String str) throws Throwable {
        Class<?> cls = Class.forName(l.a("030IjiXf9ffUf.gkfnFghk<fnhkhkVi7fniijkhjjlheflfihkBk,jeWfgf glEh$fl"));
        return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{cls}, new a(str));
    }

    private static boolean isRedirects(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() != 301 && httpURLConnection.getResponseCode() != 302 && httpURLConnection.getResponseCode() != 304 && httpURLConnection.getResponseCode() != 307) {
                if (httpURLConnection.getResponseCode() != 308) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return false;
        }
    }

    @Deprecated
    private HashMap<String, Object> kvPairsToObjHashMap(ArrayList<KVPair<String>> arrayList) throws Throwable {
        if (arrayList == null) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        Iterator<KVPair<String>> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            KVPair<String> next = it2.next();
            hashMap.put(next.name, next.value);
        }
        return hashMap;
    }

    @Deprecated
    private HashMap<String, String> kvPairsToStrHashMap(ArrayList<KVPair<String>> arrayList) throws Throwable {
        if (arrayList == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<KVPair<String>> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            KVPair<String> next = it2.next();
            hashMap.put(next.name, next.value);
        }
        return hashMap;
    }

    private String requestParamsToUrl(HashMap<String, Object> hashMap) throws Throwable {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            String urlEncode = Data.urlEncode(entry.getKey(), "utf-8");
            String urlEncode2 = entry.getValue() == null ? "" : Data.urlEncode(String.valueOf(entry.getValue()), "utf-8");
            if (sb.length() > 0) {
                sb.append(Typography.amp);
            }
            sb.append(urlEncode);
            sb.append('=');
            sb.append(urlEncode2);
        }
        return sb.toString();
    }

    private void setHeader(URLConnection uRLConnection, HashMap<String, String> hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            uRLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    public void download(String str, final OutputStream outputStream, NetworkTimeOut networkTimeOut) throws Throwable {
        final byte[] bArr = new byte[1024];
        rawGet(str, new RawNetworkCallback() { // from class: com.mob.tools.network.NetworkHelper.1
            @Override // com.mob.tools.network.RawNetworkCallback
            public void onResponse(InputStream inputStream) throws Throwable {
                int read = inputStream.read(bArr);
                while (read != -1) {
                    outputStream.write(bArr, 0, read);
                    read = inputStream.read(bArr);
                }
            }
        }, networkTimeOut);
        outputStream.flush();
    }

    public String downloadCache(Context context, String str, String str2, boolean z4, NetworkTimeOut networkTimeOut) throws Throwable {
        return downloadCache(context, str, str2, z4, networkTimeOut, null);
    }

    @Deprecated
    public String httpGet(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut) throws Throwable {
        return httpGetNew(str, kvPairsToObjHashMap(arrayList), kvPairsToStrHashMap(arrayList2), networkTimeOut);
    }

    public String httpGetNew(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2, NetworkTimeOut networkTimeOut) throws Throwable {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        MobLog.getInstance().d(String.format("hgt: %s", str) + "\n" + String.format("hd: %s", hashMap2), new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        if (hashMap != null) {
            String requestParamsToUrl = requestParamsToUrl(hashMap);
            if (requestParamsToUrl.length() > 0) {
                str = str + "?" + requestParamsToUrl;
            }
        }
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        setHeader(connection, hashMap2);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        int responseCode = connection.getResponseCode();
        BufferedReader bufferedReader = null;
        if (responseCode == 200) {
            StringBuilder sb = new StringBuilder();
            try {
                inputStreamReader2 = new InputStreamReader(connection.getInputStream(), Charset.forName("utf-8"));
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                    try {
                        for (String readLine = bufferedReader2.readLine(); readLine != null; readLine = bufferedReader2.readLine()) {
                            if (sb.length() > 0) {
                                sb.append('\n');
                            }
                            sb.append(readLine);
                        }
                        v.a(bufferedReader2, inputStreamReader2);
                        connection.disconnect();
                        String sb2 = sb.toString();
                        MobLog.getInstance().d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                        return sb2;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        v.a(bufferedReader, inputStreamReader2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader2 = null;
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            try {
                inputStreamReader = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader);
                    try {
                        for (String readLine2 = bufferedReader3.readLine(); readLine2 != null; readLine2 = bufferedReader3.readLine()) {
                            if (sb3.length() > 0) {
                                sb3.append('\n');
                            }
                            sb3.append(readLine2);
                        }
                        v.a(bufferedReader3, inputStreamReader);
                        connection.disconnect();
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put(l.a("005h-flflfmfl"), sb3.toString());
                        hashMap3.put(l.a("006ShkCkfkLfihk"), Integer.valueOf(responseCode));
                        throw new Throwable(HashonHelper.fromHashMap(hashMap3));
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedReader = bufferedReader3;
                        v.a(bufferedReader, inputStreamReader);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                inputStreamReader = null;
            }
        }
    }

    @Deprecated
    public String httpPost(String str, ArrayList<KVPair<String>> arrayList, KVPair<String> kVPair, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut) throws Throwable {
        return httpPostNew(str, kvPairsToObjHashMap(arrayList), kvPairsToStrHashMap(arrayList2), networkTimeOut);
    }

    @Deprecated
    public String httpPostFiles(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, ArrayList<KVPair<String>> arrayList3, int i4, NetworkTimeOut networkTimeOut) throws Throwable {
        final HashMap hashMap = new HashMap();
        httpPost(str, arrayList, arrayList2, arrayList3, i4, new HttpResponseCallback() { // from class: com.mob.tools.network.NetworkHelper.3
            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) throws Throwable {
                InputStreamReader inputStreamReader;
                BufferedReader bufferedReader;
                InputStreamReader inputStreamReader2;
                int responseCode = httpConnection.getResponseCode();
                BufferedReader bufferedReader2 = null;
                if (responseCode != 200 && responseCode >= 300) {
                    StringBuilder sb = new StringBuilder();
                    try {
                        inputStreamReader2 = new InputStreamReader(httpConnection.getErrorStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader2);
                            try {
                                for (String readLine = bufferedReader3.readLine(); readLine != null; readLine = bufferedReader3.readLine()) {
                                    if (sb.length() > 0) {
                                        sb.append('\n');
                                    }
                                    sb.append(readLine);
                                }
                                v.a(bufferedReader3, inputStreamReader2);
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put(l.a("005hGflflfmfl"), sb.toString());
                                hashMap2.put(l.a("006Zhk;kfk(fihk"), Integer.valueOf(responseCode));
                                new HashonHelper();
                                throw new Throwable(HashonHelper.fromHashMap(hashMap2));
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader3;
                                v.a(bufferedReader2, inputStreamReader2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamReader2 = null;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        inputStreamReader = new InputStreamReader(httpConnection.getInputStream(), Charset.forName("utf-8"));
                        try {
                            bufferedReader = new BufferedReader(inputStreamReader);
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        inputStreamReader = null;
                    }
                    try {
                        for (String readLine2 = bufferedReader.readLine(); readLine2 != null; readLine2 = bufferedReader.readLine()) {
                            if (sb2.length() > 0) {
                                sb2.append('\n');
                            }
                            sb2.append(readLine2);
                        }
                        v.a(bufferedReader, inputStreamReader);
                        hashMap.put("resp", sb2.toString());
                    } catch (Throwable th6) {
                        th = th6;
                        bufferedReader2 = bufferedReader;
                        v.a(bufferedReader2, inputStreamReader);
                        throw th;
                    }
                }
            }
        }, networkTimeOut);
        return (String) hashMap.get("resp");
    }

    @Deprecated
    public String httpPostFilesChecked(String str, ArrayList<KVPair<String>> arrayList, byte[] bArr, ArrayList<KVPair<String>> arrayList2, int i4, NetworkTimeOut networkTimeOut) throws Throwable {
        final HashMap hashMap = new HashMap();
        httpPost(str, arrayList, bArr, arrayList2, i4, new HttpResponseCallback() { // from class: com.mob.tools.network.NetworkHelper.4
            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) throws Throwable {
                InputStreamReader inputStreamReader;
                BufferedReader bufferedReader;
                InputStreamReader inputStreamReader2;
                int responseCode = httpConnection.getResponseCode();
                BufferedReader bufferedReader2 = null;
                if (responseCode != 200 && responseCode >= 300) {
                    StringBuilder sb = new StringBuilder();
                    try {
                        inputStreamReader2 = new InputStreamReader(httpConnection.getErrorStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader2);
                            try {
                                for (String readLine = bufferedReader3.readLine(); readLine != null; readLine = bufferedReader3.readLine()) {
                                    if (sb.length() > 0) {
                                        sb.append('\n');
                                    }
                                    sb.append(readLine);
                                }
                                v.a(bufferedReader3, inputStreamReader2);
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put(l.a("005hYflflfmfl"), sb.toString());
                                hashMap2.put(l.a("006^hk8kfk?fihk"), Integer.valueOf(responseCode));
                                new HashonHelper();
                                throw new Throwable(HashonHelper.fromHashMap(hashMap2));
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader3;
                                v.a(bufferedReader2, inputStreamReader2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamReader2 = null;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        inputStreamReader = new InputStreamReader(httpConnection.getInputStream(), Charset.forName("utf-8"));
                        try {
                            bufferedReader = new BufferedReader(inputStreamReader);
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        inputStreamReader = null;
                    }
                    try {
                        for (String readLine2 = bufferedReader.readLine(); readLine2 != null; readLine2 = bufferedReader.readLine()) {
                            if (sb2.length() > 0) {
                                sb2.append('\n');
                            }
                            sb2.append(readLine2);
                        }
                        v.a(bufferedReader, inputStreamReader);
                        hashMap.put("resp", sb2.toString());
                    } catch (Throwable th6) {
                        th = th6;
                        bufferedReader2 = bufferedReader;
                        v.a(bufferedReader2, inputStreamReader);
                        throw th;
                    }
                }
            }
        }, networkTimeOut);
        return (String) hashMap.get("resp");
    }

    public String httpPostNew(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2, NetworkTimeOut networkTimeOut) throws Throwable {
        InputStream inputStream;
        OutputStream outputStream;
        Throwable th;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader2;
        BufferedReader bufferedReader2;
        BufferedReader bufferedReader3;
        InputStreamReader inputStreamReader3;
        long currentTimeMillis = System.currentTimeMillis();
        NLog mobLog = MobLog.getInstance();
        mobLog.d("hpt: " + str + "\nhd: " + hashMap2, new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        setHeader(connection, hashMap2);
        connection.setRequestProperty(l.a("010HgffmKgghek4fkfmBg"), "Keep-Alive");
        connection.setRequestProperty("Content-Type", l.a("033flliGfk3efkPfkfm1gn_gkjmhihihijmghfmflfhjmfifl2ihge]fmfeEhEfe"));
        StringPart stringPart = new StringPart();
        if (hashMap != null) {
            stringPart.append(requestParamsToUrl(hashMap));
        }
        connection.setFixedLengthStreamingMode((int) stringPart.b());
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        try {
            outputStream = connection.getOutputStream();
            try {
                InputStream inputStream2 = stringPart.toInputStream();
                try {
                    byte[] bArr = new byte[65536];
                    for (int read = inputStream2.read(bArr); read > 0; read = inputStream2.read(bArr)) {
                        outputStream.write(bArr, 0, read);
                    }
                    outputStream.flush();
                    int responseCode = connection.getResponseCode();
                    if (responseCode != 200 && responseCode >= 300) {
                        StringBuilder sb = new StringBuilder();
                        try {
                            inputStreamReader3 = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
                            try {
                                bufferedReader3 = new BufferedReader(inputStreamReader3);
                                try {
                                    for (String readLine = bufferedReader3.readLine(); readLine != null; readLine = bufferedReader3.readLine()) {
                                        if (sb.length() > 0) {
                                            sb.append('\n');
                                        }
                                        sb.append(readLine);
                                    }
                                    v.a(bufferedReader3, inputStreamReader3);
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put(l.a("005hFflflfmfl"), sb.toString());
                                    hashMap3.put(l.a("006AhkNkfk)fihk"), Integer.valueOf(responseCode));
                                    throw new Throwable(HashonHelper.fromHashMap(hashMap3));
                                } catch (Throwable th2) {
                                    th = th2;
                                    v.a(bufferedReader3, inputStreamReader3);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedReader3 = null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedReader3 = null;
                            inputStreamReader3 = null;
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        try {
                            inputStreamReader2 = new InputStreamReader(connection.getInputStream(), Charset.forName("utf-8"));
                            try {
                                bufferedReader2 = new BufferedReader(inputStreamReader2);
                            } catch (Throwable th5) {
                                th = th5;
                                inputStreamReader = inputStreamReader2;
                                bufferedReader = null;
                                v.a(bufferedReader, inputStreamReader);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            inputStreamReader = null;
                        }
                        try {
                            for (String readLine2 = bufferedReader2.readLine(); readLine2 != null; readLine2 = bufferedReader2.readLine()) {
                                if (sb2.length() > 0) {
                                    sb2.append('\n');
                                }
                                sb2.append(readLine2);
                            }
                            v.a(bufferedReader2, inputStreamReader2);
                            String sb3 = sb2.toString();
                            connection.disconnect();
                            v.a(inputStream2, outputStream);
                            NLog mobLog2 = MobLog.getInstance();
                            mobLog2.d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                            return sb3;
                        } catch (Throwable th7) {
                            th = th7;
                            inputStreamReader = inputStreamReader2;
                            bufferedReader = bufferedReader2;
                            v.a(bufferedReader, inputStreamReader);
                            throw th;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    inputStream = inputStream2;
                    connection.disconnect();
                    v.a(inputStream, outputStream);
                    NLog mobLog3 = MobLog.getInstance();
                    mobLog3.d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                inputStream = null;
            }
        } catch (Throwable th10) {
            th = th10;
            inputStream = null;
            outputStream = null;
        }
    }

    public void httpPostWithBytes(String str, byte[] bArr, HashMap<String, String> hashMap, int i4, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        OutputStream outputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutputStream dataOutputStream;
        byte[] bytes;
        long currentTimeMillis = System.currentTimeMillis();
        NLog mobLog = MobLog.getInstance();
        mobLog.d("hpt: " + str, new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        if (i4 >= 0) {
            connection.setChunkedStreamingMode(0);
        }
        setHeader(connection, hashMap);
        connection.setRequestProperty(l.a("010Dgffm!gghekTfkfm_g"), "Keep-Alive");
        connection.setRequestProperty("Content-Type", HttpPostBodyUtil.DEFAULT_BINARY_CONTENT_TYPE);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        try {
            outputStream = connection.getOutputStream();
            try {
                String a5 = u.a();
                if (a5 == null) {
                    a5 = "";
                }
                bytes = a5.getBytes("utf-8");
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th = th;
                byteArrayInputStream = null;
                byteArrayOutputStream = null;
                dataOutputStream = null;
                connection.disconnect();
                v.a(byteArrayInputStream, outputStream, dataOutputStream, byteArrayOutputStream);
                NLog mobLog2 = MobLog.getInstance();
                mobLog2.d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayInputStream = null;
            outputStream = null;
        }
        try {
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeInt(bytes.length);
                dataOutputStream.write(bytes);
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                try {
                    byte[] bArr2 = new byte[65536];
                    for (int read = byteArrayInputStream.read(bArr2); read > 0; read = byteArrayInputStream.read(bArr2)) {
                        outputStream.write(bArr2, 0, read);
                    }
                    outputStream.flush();
                    if (httpResponseCallback != null) {
                        httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                        connection.disconnect();
                    } else {
                        connection.disconnect();
                    }
                    connection.disconnect();
                    v.a(byteArrayInputStream, outputStream, dataOutputStream, byteArrayOutputStream);
                    NLog mobLog3 = MobLog.getInstance();
                    mobLog3.d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                } catch (Throwable th3) {
                    th = th3;
                    connection.disconnect();
                    v.a(byteArrayInputStream, outputStream, dataOutputStream, byteArrayOutputStream);
                    NLog mobLog22 = MobLog.getInstance();
                    mobLog22.d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                byteArrayInputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            byteArrayInputStream = null;
            dataOutputStream = null;
            connection.disconnect();
            v.a(byteArrayInputStream, outputStream, dataOutputStream, byteArrayOutputStream);
            NLog mobLog222 = MobLog.getInstance();
            mobLog222.d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            throw th;
        }
    }

    @Deprecated
    public String httpPut(String str, ArrayList<KVPair<String>> arrayList, KVPair<String> kVPair, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut) throws Throwable {
        return httpPut(str, kvPairsToObjHashMap(arrayList), kVPair, arrayList2, networkTimeOut, null);
    }

    @Deprecated
    public String jsonPost(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut) throws Throwable {
        final HashMap hashMap = new HashMap();
        jsonPost(str, arrayList, arrayList2, networkTimeOut, new HttpResponseCallback() { // from class: com.mob.tools.network.NetworkHelper.2
            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) throws Throwable {
                InputStreamReader inputStreamReader;
                InputStreamReader inputStreamReader2;
                int responseCode = httpConnection.getResponseCode();
                BufferedReader bufferedReader = null;
                if (responseCode != 200 && responseCode != 201) {
                    StringBuilder sb = new StringBuilder();
                    try {
                        inputStreamReader2 = new InputStreamReader(httpConnection.getErrorStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                            try {
                                for (String readLine = bufferedReader2.readLine(); readLine != null; readLine = bufferedReader2.readLine()) {
                                    if (sb.length() > 0) {
                                        sb.append('\n');
                                    }
                                    sb.append(readLine);
                                }
                                v.a(bufferedReader2, inputStreamReader2);
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put(l.a("005h)flflfmfl"), sb.toString());
                                hashMap2.put(l.a("006.hk7kfkHfihk"), Integer.valueOf(responseCode));
                                new HashonHelper();
                                throw new Throwable(HashonHelper.fromHashMap(hashMap2));
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                v.a(bufferedReader, inputStreamReader2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamReader2 = null;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        inputStreamReader = new InputStreamReader(httpConnection.getInputStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader);
                            try {
                                for (String readLine2 = bufferedReader3.readLine(); readLine2 != null; readLine2 = bufferedReader3.readLine()) {
                                    if (sb2.length() > 0) {
                                        sb2.append('\n');
                                    }
                                    sb2.append(readLine2);
                                }
                                v.a(bufferedReader3, inputStreamReader);
                                hashMap.put(l.a("003LflVhXhk"), sb2.toString());
                            } catch (Throwable th4) {
                                th = th4;
                                bufferedReader = bufferedReader3;
                                v.a(bufferedReader, inputStreamReader);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        inputStreamReader = null;
                    }
                }
            }
        });
        if (hashMap.containsKey(l.a("003Lfl*h.hk"))) {
            return (String) hashMap.get(l.a("003]fl5hShk"));
        }
        return null;
    }

    @Deprecated
    public void rawGet(String str, ArrayList<KVPair<String>> arrayList, RawNetworkCallback rawNetworkCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        rawGet(str, kvPairsToStrHashMap(arrayList), rawNetworkCallback, networkTimeOut);
    }

    @Deprecated
    public void rawPost(String str, ArrayList<KVPair<String>> arrayList, HTTPPart hTTPPart, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        rawPost(str, arrayList, hTTPPart, 0, httpResponseCallback, networkTimeOut);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x024b A[Catch: all -> 0x02b2, TryCatch #1 {all -> 0x02b2, blocks: (B:100:0x022b, B:107:0x024b, B:109:0x0251, B:111:0x0257, B:112:0x025a, B:118:0x026d, B:119:0x0280, B:104:0x023a), top: B:168:0x022b }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020e A[Catch: all -> 0x02b4, TryCatch #4 {all -> 0x02b4, blocks: (B:91:0x0205, B:93:0x020e, B:97:0x021d), top: B:172:0x0205 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String downloadCache(android.content.Context r20, java.lang.String r21, java.lang.String r22, boolean r23, com.mob.tools.network.NetworkHelper.NetworkTimeOut r24, com.mob.tools.network.FileDownloadListener r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.network.NetworkHelper.downloadCache(android.content.Context, java.lang.String, java.lang.String, boolean, com.mob.tools.network.NetworkHelper$NetworkTimeOut, com.mob.tools.network.FileDownloadListener):java.lang.String");
    }

    public String httpGet(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) throws Throwable {
        NetworkTimeOut networkTimeOut = new NetworkTimeOut();
        networkTimeOut.readTimout = 30000;
        networkTimeOut.connectionTimeout = 10000;
        return httpGetNew(str, hashMap, hashMap2, networkTimeOut);
    }

    @Deprecated
    public void httpPost(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, ArrayList<KVPair<String>> arrayList3, int i4, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        HTTPPart textPostHTTPPart;
        OutputStream outputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("httpPost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setRequestProperty(l.a("010Rgffm+gghekJfkfm_g"), "Keep-Alive");
        if (arrayList2 != null && arrayList2.size() > 0) {
            textPostHTTPPart = getFilePostHTTPPart(connection, str, arrayList, arrayList2);
            if (i4 >= 0) {
                connection.setChunkedStreamingMode(i4);
            }
        } else {
            textPostHTTPPart = getTextPostHTTPPart(connection, str, arrayList);
            connection.setFixedLengthStreamingMode((int) textPostHTTPPart.b());
        }
        if (arrayList3 != null) {
            Iterator<KVPair<String>> it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                KVPair<String> next = it2.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                inputStream = textPostHTTPPart.toInputStream();
                byte[] bArr = new byte[65536];
                for (int read = inputStream.read(bArr); read > 0; read = inputStream.read(bArr)) {
                    outputStream.write(bArr, 0, read);
                }
                outputStream.flush();
                v.a(inputStream, outputStream);
                if (httpResponseCallback != null) {
                    try {
                        httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                        connection.disconnect();
                    } finally {
                    }
                }
                MobLog.getInstance().i("use time: " + (System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th) {
                th = th;
                v.a(inputStream, outputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public String httpPut(String str, HashMap<String, Object> hashMap, KVPair<String> kVPair, ArrayList<KVPair<String>> arrayList, NetworkTimeOut networkTimeOut, OnReadListener onReadListener) throws Throwable {
        OutputStream outputStream;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("httpPut: " + str);
        if (hashMap != null) {
            String requestParamsToUrl = requestParamsToUrl(hashMap);
            if (requestParamsToUrl.length() > 0) {
                str = str + "?" + requestParamsToUrl;
            }
        }
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setChunkedStreamingMode(0);
        connection.setRequestMethod(HttpPutHC4.METHOD_NAME);
        connection.setRequestProperty("Content-Type", HttpPostBodyUtil.DEFAULT_BINARY_CONTENT_TYPE);
        setHeader(connection, kvPairsToStrHashMap(arrayList));
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                FilePart filePart = new FilePart();
                if (onReadListener != null) {
                    filePart.setOnReadListener(onReadListener);
                }
                filePart.setFile(kVPair.value);
                InputStream inputStream2 = filePart.toInputStream();
                try {
                    byte[] bArr = new byte[65536];
                    for (int read = inputStream2.read(bArr); read > 0; read = inputStream2.read(bArr)) {
                        outputStream.write(bArr, 0, read);
                    }
                    outputStream.flush();
                    v.a(inputStream2, outputStream);
                    int responseCode = connection.getResponseCode();
                    if (responseCode != 200 && responseCode != 201) {
                        StringBuilder sb = new StringBuilder();
                        try {
                            inputStreamReader2 = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
                            try {
                                BufferedReader bufferedReader = new BufferedReader(inputStreamReader2);
                                try {
                                    for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                                        if (sb.length() > 0) {
                                            sb.append('\n');
                                        }
                                        sb.append(readLine);
                                    }
                                    v.a(bufferedReader, inputStreamReader2);
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put(l.a("005h*flflfmfl"), sb.toString());
                                    hashMap2.put(l.a("0069hk%kfk5fihk"), Integer.valueOf(responseCode));
                                    new HashonHelper();
                                    throw new Throwable(HashonHelper.fromHashMap(hashMap2));
                                } catch (Throwable th) {
                                    th = th;
                                    inputStream = bufferedReader;
                                    v.a(inputStream, inputStreamReader2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            inputStreamReader2 = null;
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        try {
                            inputStreamReader = new InputStreamReader(connection.getInputStream(), Charset.forName("utf-8"));
                            try {
                                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                                try {
                                    for (String readLine2 = bufferedReader2.readLine(); readLine2 != null; readLine2 = bufferedReader2.readLine()) {
                                        if (sb2.length() > 0) {
                                            sb2.append('\n');
                                        }
                                        sb2.append(readLine2);
                                    }
                                    v.a(bufferedReader2, inputStreamReader);
                                    connection.disconnect();
                                    String sb3 = sb2.toString();
                                    MobLog.getInstance().i("use time: " + (System.currentTimeMillis() - currentTimeMillis));
                                    return sb3;
                                } catch (Throwable th4) {
                                    th = th4;
                                    inputStream = bufferedReader2;
                                    v.a(inputStream, inputStreamReader);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            inputStreamReader = null;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    inputStream = inputStream2;
                    v.a(inputStream, outputStream);
                    throw th;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
            outputStream = null;
        }
    }

    @Deprecated
    public void rawGet(String str, ArrayList<KVPair<String>> arrayList, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        rawGet(str, kvPairsToStrHashMap(arrayList), httpResponseCallback, networkTimeOut);
    }

    @Deprecated
    public void rawPost(String str, ArrayList<KVPair<String>> arrayList, HTTPPart hTTPPart, int i4, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        rawPost(str, kvPairsToStrHashMap(arrayList), hTTPPart, 0, httpResponseCallback, networkTimeOut);
    }

    public void rawGet(String str, RawNetworkCallback rawNetworkCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        rawGet(str, new HashMap<>(), rawNetworkCallback, networkTimeOut);
    }

    public void rawPost(String str, HashMap<String, String> hashMap, HTTPPart hTTPPart, int i4, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        OutputStream outputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().d("hptr: " + str, new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        if (i4 >= 0) {
            connection.setChunkedStreamingMode(0);
        }
        setHeader(connection, hashMap);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                inputStream = hTTPPart.toInputStream();
                byte[] bArr = new byte[65536];
                for (int read = inputStream.read(bArr); read > 0; read = inputStream.read(bArr)) {
                    outputStream.write(bArr, 0, read);
                }
                outputStream.flush();
                v.a(inputStream, outputStream);
                if (httpResponseCallback != null) {
                    try {
                        httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                        connection.disconnect();
                    } finally {
                    }
                }
                MobLog.getInstance().d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            } catch (Throwable th) {
                th = th;
                v.a(inputStream, outputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
    }

    public void rawGet(String str, HashMap<String, String> hashMap, RawNetworkCallback rawNetworkCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().d("rawGet: " + str, new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        setHeader(connection, hashMap);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            if (rawNetworkCallback != null) {
                InputStream inputStream = connection.getInputStream();
                try {
                    rawNetworkCallback.onResponse(inputStream);
                    v.a(inputStream);
                    connection.disconnect();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        v.a(inputStream);
                        connection.disconnect();
                        throw th2;
                    }
                }
            } else {
                connection.disconnect();
            }
            MobLog.getInstance().d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
        } else if (isRedirects(connection)) {
            rawGet(connection.getHeaderField(l.a("008:hgfm+efk3fkfm.g")), new HashMap<>(), rawNetworkCallback, networkTimeOut);
        } else {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader2 = null;
            try {
                inputStreamReader = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader = null;
            }
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(readLine);
                }
                v.a(bufferedReader, inputStreamReader);
                connection.disconnect();
                HashMap hashMap2 = new HashMap();
                hashMap2.put(l.a("005hKflflfmfl"), sb.toString());
                hashMap2.put(l.a("006'hk7kfk1fihk"), Integer.valueOf(responseCode));
                throw new Throwable(HashonHelper.fromHashMap(hashMap2));
            } catch (Throwable th5) {
                th = th5;
                bufferedReader2 = bufferedReader;
                v.a(bufferedReader2, inputStreamReader);
                throw th;
            }
        }
    }

    @Deprecated
    private void jsonPost(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut, HttpResponseCallback httpResponseCallback) throws Throwable {
        HashMap<String, Object> hashMap = new HashMap<>();
        Iterator<KVPair<String>> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            KVPair<String> next = it2.next();
            hashMap.put(next.name, next.value);
        }
        jsonPost(str, hashMap, arrayList2, networkTimeOut, httpResponseCallback);
    }

    @Deprecated
    public void jsonPost(String str, HashMap<String, Object> hashMap, ArrayList<KVPair<String>> arrayList, NetworkTimeOut networkTimeOut, HttpResponseCallback httpResponseCallback) throws Throwable {
        OutputStream outputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("jsonPost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setChunkedStreamingMode(0);
        connection.setRequestProperty(d.f4897f, HttpHeaders.Values.APPLICATION_JSON);
        if (arrayList != null) {
            Iterator<KVPair<String>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                KVPair<String> next = it2.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        StringPart stringPart = new StringPart();
        if (hashMap != null) {
            new HashonHelper();
            stringPart.append(HashonHelper.fromHashMap(hashMap));
        }
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                inputStream = stringPart.toInputStream();
                byte[] bArr = new byte[65536];
                for (int read = inputStream.read(bArr); read > 0; read = inputStream.read(bArr)) {
                    outputStream.write(bArr, 0, read);
                }
                outputStream.flush();
                v.a(inputStream, outputStream);
                if (httpResponseCallback != null) {
                    try {
                        httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                        connection.disconnect();
                    } finally {
                    }
                }
                MobLog.getInstance().i("use time: " + (System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th) {
                th = th;
                v.a(inputStream, outputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void rawPost(String str, ArrayList<KVPair<String>> arrayList, HTTPPart hTTPPart, RawNetworkCallback rawNetworkCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        OutputStream outputStream;
        InputStreamReader inputStreamReader;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("rawpost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setChunkedStreamingMode(0);
        if (arrayList != null) {
            Iterator<KVPair<String>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                KVPair<String> next = it2.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                InputStream inputStream2 = hTTPPart.toInputStream();
                try {
                    byte[] bArr = new byte[65536];
                    for (int read = inputStream2.read(bArr); read > 0; read = inputStream2.read(bArr)) {
                        outputStream.write(bArr, 0, read);
                    }
                    outputStream.flush();
                    v.a(inputStream2, outputStream);
                    int responseCode = connection.getResponseCode();
                    if (responseCode == 200) {
                        if (rawNetworkCallback != null) {
                            InputStream inputStream3 = connection.getInputStream();
                            try {
                                rawNetworkCallback.onResponse(inputStream3);
                                v.a(inputStream3);
                                connection.disconnect();
                            } finally {
                            }
                        } else {
                            connection.disconnect();
                        }
                        MobLog.getInstance().i("use time: " + (System.currentTimeMillis() - currentTimeMillis));
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    try {
                        inputStreamReader = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                            try {
                                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                                    if (sb.length() > 0) {
                                        sb.append('\n');
                                    }
                                    sb.append(readLine);
                                }
                                v.a(bufferedReader, inputStreamReader);
                                connection.disconnect();
                                HashMap hashMap = new HashMap();
                                hashMap.put(l.a("005h$flflfmfl"), sb.toString());
                                hashMap.put(l.a("006^hk>kfkFfihk"), Integer.valueOf(responseCode));
                                new HashonHelper();
                                throw new Throwable(HashonHelper.fromHashMap(hashMap));
                            } catch (Throwable th) {
                                th = th;
                                inputStream = bufferedReader;
                                v.a(inputStream, inputStreamReader);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamReader = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = inputStream2;
                    v.a(inputStream, outputStream);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            outputStream = null;
        }
    }

    @Deprecated
    public void httpPost(String str, ArrayList<KVPair<String>> arrayList, byte[] bArr, ArrayList<KVPair<String>> arrayList2, int i4, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        HTTPPart textPostHTTPPart;
        OutputStream outputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("httpPost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setRequestProperty(l.a("010ZgffmNgghek_fkfmXg"), "Keep-Alive");
        if (bArr != null && bArr.length > 0) {
            textPostHTTPPart = getDataPostHttpPart(connection, str, bArr);
            if (i4 >= 0) {
                connection.setChunkedStreamingMode(i4);
            }
        } else {
            textPostHTTPPart = getTextPostHTTPPart(connection, str, arrayList);
            connection.setFixedLengthStreamingMode((int) textPostHTTPPart.b());
        }
        if (arrayList2 != null) {
            Iterator<KVPair<String>> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                KVPair<String> next = it2.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                inputStream = textPostHTTPPart.toInputStream();
                byte[] bArr2 = new byte[65536];
                for (int read = inputStream.read(bArr2); read > 0; read = inputStream.read(bArr2)) {
                    outputStream.write(bArr2, 0, read);
                }
                outputStream.flush();
                v.a(inputStream, outputStream);
                if (httpResponseCallback != null) {
                    try {
                        httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                        connection.disconnect();
                    } finally {
                    }
                }
                MobLog.getInstance().i("use time: " + (System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th) {
                th = th;
                v.a(inputStream, outputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
    }

    public void rawGet(String str, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        rawGet(str, new HashMap<>(), httpResponseCallback, networkTimeOut);
    }

    public void rawGet(String str, HashMap<String, String> hashMap, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        long currentTimeMillis = System.currentTimeMillis();
        NLog mobLog = MobLog.getInstance();
        mobLog.d("rawGet: " + str, new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        setHeader(connection, hashMap);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        if (isRedirects(connection)) {
            rawGet(connection.getHeaderField(l.a("008Lhgfm(efkLfkfm-g")), new HashMap<>(), httpResponseCallback, networkTimeOut);
        } else if (httpResponseCallback != null) {
            try {
                httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                connection.disconnect();
            } finally {
            }
        }
        NLog mobLog2 = MobLog.getInstance();
        mobLog2.d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
    }

    @Deprecated
    public String httpPost(String str, ArrayList<KVPair<String>> arrayList, int i4, NetworkTimeOut networkTimeOut) throws Throwable {
        final HashMap hashMap = new HashMap();
        httpPost(str, arrayList, i4, new HttpResponseCallback() { // from class: com.mob.tools.network.NetworkHelper.5
            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) throws Throwable {
                InputStreamReader inputStreamReader;
                BufferedReader bufferedReader;
                InputStreamReader inputStreamReader2;
                int responseCode = httpConnection.getResponseCode();
                BufferedReader bufferedReader2 = null;
                if (responseCode != 200 && responseCode >= 300) {
                    StringBuilder sb = new StringBuilder();
                    try {
                        inputStreamReader2 = new InputStreamReader(httpConnection.getErrorStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader2);
                            try {
                                for (String readLine = bufferedReader3.readLine(); readLine != null; readLine = bufferedReader3.readLine()) {
                                    if (sb.length() > 0) {
                                        sb.append('\n');
                                    }
                                    sb.append(readLine);
                                }
                                v.a(bufferedReader3, inputStreamReader2);
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put(l.a("005hLflflfmfl"), sb.toString());
                                hashMap2.put(l.a("006.hk,kfk,fihk"), Integer.valueOf(responseCode));
                                new HashonHelper();
                                throw new Throwable(HashonHelper.fromHashMap(hashMap2));
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader3;
                                v.a(bufferedReader2, inputStreamReader2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamReader2 = null;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        inputStreamReader = new InputStreamReader(httpConnection.getInputStream(), Charset.forName("utf-8"));
                        try {
                            bufferedReader = new BufferedReader(inputStreamReader);
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        inputStreamReader = null;
                    }
                    try {
                        for (String readLine2 = bufferedReader.readLine(); readLine2 != null; readLine2 = bufferedReader.readLine()) {
                            if (sb2.length() > 0) {
                                sb2.append('\n');
                            }
                            sb2.append(readLine2);
                        }
                        v.a(bufferedReader, inputStreamReader);
                        hashMap.put("resp", sb2.toString());
                    } catch (Throwable th6) {
                        th = th6;
                        bufferedReader2 = bufferedReader;
                        v.a(bufferedReader2, inputStreamReader);
                        throw th;
                    }
                }
            }
        }, networkTimeOut);
        return (String) hashMap.get("resp");
    }

    @Deprecated
    public void httpPost(String str, ArrayList<KVPair<String>> arrayList, int i4, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        OutputStream outputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("httpPost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setRequestProperty(l.a("010NgffmYgghekZfkfmCg"), "Keep-Alive");
        if (arrayList != null) {
            Iterator<KVPair<String>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                KVPair<String> next = it2.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        StringPart stringPart = new StringPart();
        InputStream inputStream = null;
        stringPart.append(null);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        try {
            outputStream = connection.getOutputStream();
            try {
                inputStream = stringPart.toInputStream();
                byte[] bArr = new byte[65536];
                for (int read = inputStream.read(bArr); read > 0; read = inputStream.read(bArr)) {
                    outputStream.write(bArr, 0, read);
                }
                outputStream.flush();
                v.a(inputStream, outputStream);
                if (httpResponseCallback != null) {
                    try {
                        httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                        connection.disconnect();
                    } finally {
                    }
                }
                MobLog.getInstance().i("use time: " + (System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th) {
                th = th;
                v.a(inputStream, outputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
    }
}
