package cn.sharesdk.framework.utils;

import android.text.TextUtils;
import android.util.Xml;
import java.util.HashMap;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/* compiled from: XmlParser.java */
/* loaded from: classes2.dex */
public class o {

    /* compiled from: XmlParser.java */
    /* loaded from: classes2.dex */
    private static class a extends DefaultHandler {

        /* renamed from: a  reason: collision with root package name */
        private HashMap<String, Object> f1076a = new HashMap<>();

        /* renamed from: b  reason: collision with root package name */
        private HashMap<String, Object> f1077b;

        public HashMap<String, Object> a() {
            return this.f1076a;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i4, int i5) {
            HashMap<String, Object> hashMap;
            String trim = String.valueOf(cArr, i4, i5).trim();
            if (TextUtils.isEmpty(trim) || (hashMap = this.f1077b) == null) {
                return;
            }
            hashMap.put("value", trim);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            this.f1077b = null;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            if (this.f1077b != null) {
                HashMap<String, Object> hashMap = new HashMap<>();
                this.f1077b.put(str2, hashMap);
                this.f1077b = hashMap;
            } else {
                HashMap<String, Object> hashMap2 = new HashMap<>();
                this.f1077b = hashMap2;
                this.f1076a.put(str2, hashMap2);
            }
            int length = attributes.getLength();
            for (int i4 = 0; i4 < length; i4++) {
                this.f1077b.put(attributes.getLocalName(i4), attributes.getValue(i4));
            }
        }
    }

    public HashMap<String, Object> a(String str) throws Throwable {
        a aVar = new a();
        Xml.parse(str, aVar);
        return aVar.a();
    }
}
