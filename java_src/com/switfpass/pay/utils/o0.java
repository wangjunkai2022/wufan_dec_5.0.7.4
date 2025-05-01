package com.switfpass.pay.utils;

import android.graphics.Bitmap;
import android.os.Environment;
import com.join.mgps.dto.Constant;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.RandomAccessFile;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;
/* loaded from: classes5.dex */
public class o0 {
    public static byte[] a(Bitmap bitmap, boolean z4) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        if (z4) {
            bitmap.recycle();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return byteArray;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
        if (r9 < r13) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap b(java.lang.String r17, int r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.switfpass.pay.utils.o0.b(java.lang.String, int, int, boolean):android.graphics.Bitmap");
    }

    public static String c(double d5) {
        return new DecimalFormat("0.00").format(d5 / 100.0d);
    }

    public static String d(double d5) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumFractionDigits(2);
        return numberInstance.format(d5 / 100.0d);
    }

    public static String e(long j4) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j4));
    }

    public static String f(String str) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new SimpleDateFormat("yyyyMMddHHmmss").parse(str));
    }

    public static String g() {
        return w.a(String.valueOf(new Random().nextInt(10000)).getBytes());
    }

    public static long h() {
        return System.currentTimeMillis() / 1000;
    }

    public static String i() {
        return String.valueOf(k()) + "download/cache/";
    }

    public static String j(double d5) {
        return new DecimalFormat("0").format(d5 * 100.0d);
    }

    public static String k() {
        return String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath()) + "/swiftpass_pay/";
    }

    public static String l() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ver=2.0");
        stringBuffer.append("&sale_plat=211");
        stringBuffer.append("&charset=1");
        stringBuffer.append("&bank_type=0");
        stringBuffer.append("&bargainor_id=1900000109");
        stringBuffer.append("&sp_billno=031120730110929000281000010" + Integer.toString((int) (Math.random() * 10000.0d)));
        stringBuffer.append("&total_fee=1");
        stringBuffer.append("&notify_url=http://211.154.151.196:8081/tenpay/payment/notifyCallBackUrl");
        stringBuffer.append("&attach=100001000002");
        return "";
    }

    public static byte[] m(String str) {
        if (str != null && str.length() != 0) {
            try {
                HttpResponse execute = s().execute(new HttpGet(str));
                if (execute.getStatusLine().getStatusCode() != 200) {
                    new StringBuilder("httpGet fail, status code = ").append(execute.getStatusLine().getStatusCode());
                    return null;
                }
                return EntityUtils.toByteArray(execute.getEntity());
            } catch (Exception e5) {
                new StringBuilder("httpGet exception, e = ").append(e5.getMessage());
                e5.printStackTrace();
            }
        }
        return null;
    }

    public static byte[] n(String str, String str2) {
        if (str != null && str.length() != 0) {
            HttpClient s4 = s();
            HttpPost httpPost = new HttpPost(str);
            try {
                httpPost.setEntity(new StringEntity(str2, "utf-8"));
                httpPost.setHeader("Content-Type", "text/xml;charset=UTF-8");
                HttpResponse execute = s4.execute(httpPost);
                if (execute.getStatusLine().getStatusCode() != 200) {
                    new StringBuilder("httpGet fail, status code = ").append(execute.getStatusLine().getStatusCode());
                    return null;
                }
                return EntityUtils.toByteArray(execute.getEntity());
            } catch (Exception e5) {
                new StringBuilder("httpPost exception, e = ").append(e5.getMessage());
                e5.printStackTrace();
            }
        }
        return null;
    }

    public static Map o(Map map) {
        HashMap hashMap = new HashMap(map.size());
        if (map.size() <= 0) {
            return hashMap;
        }
        for (String str : map.keySet()) {
            String str2 = (String) map.get(str);
            if (str2 != null && !str2.equals("") && !str.equalsIgnoreCase(Constant.MD5)) {
                hashMap.put(str, str2);
            }
        }
        return hashMap;
    }

    public static byte[] p(String str, int i4, int i5) {
        byte[] bArr = null;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (file.exists()) {
            if (i5 == -1) {
                i5 = (int) file.length();
            }
            StringBuilder sb = new StringBuilder("readFromFile : offset = ");
            sb.append(i4);
            sb.append(" len = ");
            sb.append(i5);
            sb.append(" offset + len = ");
            int i6 = i4 + i5;
            sb.append(i6);
            if (i4 < 0) {
                new StringBuilder("readFromFile invalid offset:").append(i4);
                return null;
            } else if (i5 <= 0) {
                new StringBuilder("readFromFile invalid len:").append(i5);
                return null;
            } else if (i6 > ((int) file.length())) {
                new StringBuilder("readFromFile invalid file len:").append(file.length());
                return null;
            } else {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
                    bArr = new byte[i5];
                    randomAccessFile.seek(i4);
                    randomAccessFile.readFully(bArr);
                    randomAccessFile.close();
                    return bArr;
                } catch (Exception e5) {
                    new StringBuilder("readFromFile : errMsg = ").append(e5.getMessage());
                    e5.printStackTrace();
                    return bArr;
                }
            }
        }
        return null;
    }

    public static String q(String str) {
        if (str != null && str.length() != 0) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                messageDigest.update(str.getBytes());
                byte[] digest = messageDigest.digest();
                char[] cArr2 = new char[digest.length << 1];
                int i4 = 0;
                for (byte b5 : digest) {
                    int i5 = i4 + 1;
                    cArr2[i4] = cArr[(b5 >>> 4) & 15];
                    i4 = i5 + 1;
                    cArr2[i5] = cArr[b5 & 15];
                }
                return new String(cArr2);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static List r(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(str);
        }
        return arrayList;
    }

    private static HttpClient s() {
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            a1 a1Var = new a1(keyStore);
            a1Var.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
            HttpProtocolParams.setContentCharset(basicHttpParams, "UTF-8");
            SchemeRegistry schemeRegistry = new SchemeRegistry();
            schemeRegistry.register(new Scheme(com.facebook.common.util.f.f10923a, PlainSocketFactory.getSocketFactory(), 80));
            schemeRegistry.register(new Scheme("https", a1Var, 443));
            return new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
        } catch (Exception unused) {
            return new DefaultHttpClient();
        }
    }
}
