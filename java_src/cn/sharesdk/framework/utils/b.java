package cn.sharesdk.framework.utils;

import android.util.Base64;
import com.mob.tools.network.KVPair;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.Typography;
import org.apache.http.client.methods.HttpPutHC4;
/* compiled from: Oauth1Signer.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private C0017b f1044a = new C0017b();

    /* renamed from: b  reason: collision with root package name */
    private d f1045b = new d("-._~", false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Oauth1Signer.java */
    /* renamed from: cn.sharesdk.framework.utils.b$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1046a;

        static {
            int[] iArr = new int[a.values().length];
            f1046a = iArr;
            try {
                iArr[a.HMAC_SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1046a[a.PLAINTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Oauth1Signer.java */
    /* loaded from: classes2.dex */
    public enum a {
        HMAC_SHA1,
        PLAINTEXT
    }

    /* compiled from: Oauth1Signer.java */
    /* renamed from: cn.sharesdk.framework.utils.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0017b {

        /* renamed from: a  reason: collision with root package name */
        public String f1050a;

        /* renamed from: b  reason: collision with root package name */
        public String f1051b;

        /* renamed from: c  reason: collision with root package name */
        public String f1052c;

        /* renamed from: d  reason: collision with root package name */
        public String f1053d;

        /* renamed from: e  reason: collision with root package name */
        public String f1054e;
    }

    public void a(String str, String str2, String str3) {
        C0017b c0017b = this.f1044a;
        c0017b.f1050a = str;
        c0017b.f1051b = str2;
        c0017b.f1054e = str3;
    }

    public ArrayList<KVPair<String>> b(String str, ArrayList<KVPair<String>> arrayList) throws Throwable {
        return b(str, arrayList, a.HMAC_SHA1);
    }

    public ArrayList<KVPair<String>> c(String str, ArrayList<KVPair<String>> arrayList, a aVar) throws Throwable {
        return a(str, HttpPutHC4.METHOD_NAME, arrayList, aVar);
    }

    public ArrayList<KVPair<String>> b(String str, ArrayList<KVPair<String>> arrayList, a aVar) throws Throwable {
        return a(str, "GET", arrayList, aVar);
    }

    private String b(ArrayList<KVPair<String>> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        Iterator<KVPair<String>> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            KVPair<String> next = it2.next();
            if (i4 > 0) {
                sb.append(Typography.amp);
            }
            sb.append(next.name);
            sb.append('=');
            sb.append(next.value);
            i4++;
        }
        return sb.toString();
    }

    public C0017b a() {
        return this.f1044a;
    }

    public ArrayList<KVPair<String>> a(String str, ArrayList<KVPair<String>> arrayList) throws Throwable {
        return a(str, arrayList, a.HMAC_SHA1);
    }

    public ArrayList<KVPair<String>> a(String str, ArrayList<KVPair<String>> arrayList, a aVar) throws Throwable {
        return a(str, "POST", arrayList, aVar);
    }

    public void a(String str, String str2) {
        C0017b c0017b = this.f1044a;
        c0017b.f1052c = str;
        c0017b.f1053d = str2;
    }

    private ArrayList<KVPair<String>> a(String str, String str2, ArrayList<KVPair<String>> arrayList, a aVar) throws Throwable {
        String trim;
        long currentTimeMillis = System.currentTimeMillis();
        int i4 = AnonymousClass1.f1046a[aVar.ordinal()];
        String str3 = null;
        if (i4 == 1) {
            SecretKeySpec secretKeySpec = new SecretKeySpec((a(this.f1044a.f1051b) + Typography.amp + a(this.f1044a.f1053d)).getBytes("utf-8"), "HMAC-SHA1");
            Mac mac = Mac.getInstance("HMAC-SHA1");
            mac.init(secretKeySpec);
            String b5 = b(a(currentTimeMillis, arrayList, "HMAC-SHA1"));
            trim = new String(Base64.encode(mac.doFinal((str2 + Typography.amp + a(str) + Typography.amp + a(b5)).getBytes("utf-8")), 0)).trim();
            str3 = "HMAC-SHA1";
        } else if (i4 != 2) {
            trim = null;
        } else {
            str3 = "PLAINTEXT";
            trim = a(this.f1044a.f1051b) + Typography.amp + a(this.f1044a.f1053d);
        }
        ArrayList<KVPair<String>> a5 = a(currentTimeMillis, str3);
        a5.add(new KVPair<>("oauth_signature", trim));
        return a5;
    }

    public String a(String str) {
        return str == null ? "" : this.f1045b.escape(str);
    }

    private ArrayList<KVPair<String>> a(long j4, ArrayList<KVPair<String>> arrayList, String str) {
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            Iterator<KVPair<String>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                KVPair<String> next = it2.next();
                hashMap.put(a(next.name), a(next.value));
            }
        }
        ArrayList<KVPair<String>> a5 = a(j4, str);
        if (a5 != null) {
            Iterator<KVPair<String>> it3 = a5.iterator();
            while (it3.hasNext()) {
                KVPair<String> next2 = it3.next();
                hashMap.put(a(next2.name), a(next2.value));
            }
        }
        int size = hashMap.size();
        String[] strArr = new String[size];
        int i4 = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            strArr[i4] = (String) entry.getKey();
            i4++;
        }
        Arrays.sort(strArr);
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        for (int i5 = 0; i5 < size; i5++) {
            String str2 = strArr[i5];
            arrayList2.add(new KVPair<>(str2, hashMap.get(str2)));
        }
        return arrayList2;
    }

    private ArrayList<KVPair<String>> a(long j4, String str) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("oauth_consumer_key", this.f1044a.f1050a));
        arrayList.add(new KVPair<>("oauth_signature_method", str));
        arrayList.add(new KVPair<>("oauth_timestamp", String.valueOf(j4 / 1000)));
        arrayList.add(new KVPair<>("oauth_nonce", String.valueOf(j4)));
        arrayList.add(new KVPair<>("oauth_version", "1.0"));
        String str2 = this.f1044a.f1052c;
        if (str2 != null && str2.length() > 0) {
            arrayList.add(new KVPair<>("oauth_token", str2));
        }
        return arrayList;
    }

    public ArrayList<KVPair<String>> a(ArrayList<KVPair<String>> arrayList) {
        StringBuilder sb = new StringBuilder("OAuth ");
        Iterator<KVPair<String>> it2 = arrayList.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            KVPair<String> next = it2.next();
            if (i4 > 0) {
                sb.append(StringUtil.COMMA);
            }
            String a5 = a(next.value);
            sb.append(next.name);
            sb.append("=\"");
            sb.append(a5);
            sb.append(m.a.f71493g);
            i4++;
        }
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        arrayList2.add(new KVPair<>("Authorization", sb.toString()));
        arrayList2.add(new KVPair<>("Content-Type", "application/x-www-form-urlencoded"));
        return arrayList2;
    }
}
