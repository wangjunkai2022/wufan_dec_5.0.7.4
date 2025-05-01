package com.bytedance.sdk.openadsdk.api.plugin.m;

import com.join.mgps.Util.h0;
import external.org.apache.commons.lang3.d;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
/* loaded from: classes2.dex */
public final class vv implements HostnameVerifier {
    public static final vv vv = new vv();

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f8713m = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private vv() {
    }

    private boolean m(String str, X509Certificate x509Certificate) {
        List<String> vv2 = vv(x509Certificate, 7);
        int size = vv2.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (str.equalsIgnoreCase(vv2.get(i4))) {
                return true;
            }
        }
        return false;
    }

    private boolean p(String str, X509Certificate x509Certificate) {
        String vv2;
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> vv3 = vv(x509Certificate, 2);
        int size = vv3.size();
        int i4 = 0;
        boolean z4 = false;
        while (i4 < size) {
            if (vv(lowerCase, vv3.get(i4))) {
                return true;
            }
            i4++;
            z4 = true;
        }
        if (z4 || (vv2 = new m(x509Certificate.getSubjectX500Principal()).vv("cn")) == null) {
            return false;
        }
        return vv(lowerCase, vv2);
    }

    private boolean vv(String str, X509Certificate x509Certificate) {
        if (vv(str)) {
            return m(str, x509Certificate);
        }
        return p(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return vv(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    private static boolean vv(String str) {
        return f8713m.matcher(str).matches();
    }

    private static List<String> vv(X509Certificate x509Certificate, int i4) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i4 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    private boolean vv(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(h0.f27805a) && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(h0.f27805a) && !str2.endsWith("..")) {
            if (!str.endsWith(h0.f27805a)) {
                str = str + d.f68897a;
            }
            if (!str2.endsWith(h0.f27805a)) {
                str2 = str2 + d.f68897a;
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains(WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD)) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (str.endsWith(substring)) {
                int length = str.length() - substring.length();
                return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
            }
            return false;
        }
        return false;
    }
}
