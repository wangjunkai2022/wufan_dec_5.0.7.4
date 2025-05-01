package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.a1;
import com.coremedia.iso.boxes.s0;
import com.join.mgps.Util.h0;
import io.netty.handler.codec.http.multipart.HttpPostBodyUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
/* compiled from: SMPTETTTrackImpl.java */
/* loaded from: classes3.dex */
public class q extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: l  reason: collision with root package name */
    public static final String f13580l = "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt";

    /* renamed from: e  reason: collision with root package name */
    com.googlecode.mp4parser.authoring.i f13581e;

    /* renamed from: f  reason: collision with root package name */
    s0 f13582f;

    /* renamed from: g  reason: collision with root package name */
    com.mp4parser.iso14496.part30.e f13583g;

    /* renamed from: h  reason: collision with root package name */
    List<com.googlecode.mp4parser.authoring.f> f13584h;

    /* renamed from: i  reason: collision with root package name */
    a1 f13585i;

    /* renamed from: j  reason: collision with root package name */
    boolean f13586j;

    /* renamed from: k  reason: collision with root package name */
    private long[] f13587k;

    /* compiled from: SMPTETTTrackImpl.java */
    /* loaded from: classes3.dex */
    class a implements com.googlecode.mp4parser.authoring.f {

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ String f13589b;

        /* renamed from: c  reason: collision with root package name */
        private final /* synthetic */ List f13590c;

        a(String str, List list) {
            this.f13589b = str;
            this.f13590c = list;
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public ByteBuffer a() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                b(Channels.newChannel(byteArrayOutputStream));
                return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public void b(WritableByteChannel writableByteChannel) throws IOException {
            writableByteChannel.write(ByteBuffer.wrap(com.coremedia.iso.l.b(this.f13589b)));
            for (File file : this.f13590c) {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[HttpPostBodyUtil.chunkSize];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (-1 == read) {
                        break;
                    }
                    writableByteChannel.write(ByteBuffer.wrap(bArr, 0, read));
                }
            }
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public long getSize() {
            long length = com.coremedia.iso.l.b(this.f13589b).length;
            for (File file : this.f13590c) {
                length += file.length();
            }
            return length;
        }
    }

    /* compiled from: SMPTETTTrackImpl.java */
    /* loaded from: classes3.dex */
    class b implements com.googlecode.mp4parser.authoring.f {

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ File f13592b;

        b(File file) {
            this.f13592b = file;
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public ByteBuffer a() {
            try {
                return ByteBuffer.wrap(q.this.h(new FileInputStream(this.f13592b)));
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public void b(WritableByteChannel writableByteChannel) throws IOException {
            Channels.newOutputStream(writableByteChannel).write(q.this.h(new FileInputStream(this.f13592b)));
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public long getSize() {
            return this.f13592b.length();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SMPTETTTrackImpl.java */
    /* loaded from: classes3.dex */
    public static class c implements NamespaceContext {
        private c() {
        }

        @Override // javax.xml.namespace.NamespaceContext
        public String getNamespaceURI(String str) {
            if (str.equals("ttml")) {
                return "http://www.w3.org/ns/ttml";
            }
            if (str.equals("smpte")) {
                return q.f13580l;
            }
            return null;
        }

        @Override // javax.xml.namespace.NamespaceContext
        public String getPrefix(String str) {
            if (str.equals("http://www.w3.org/ns/ttml")) {
                return "ttml";
            }
            if (str.equals(q.f13580l)) {
                return "smpte";
            }
            return null;
        }

        @Override // javax.xml.namespace.NamespaceContext
        public Iterator getPrefixes(String str) {
            return Arrays.asList("ttml", "smpte").iterator();
        }

        /* synthetic */ c(c cVar) {
            this();
        }
    }

    public q(File... fileArr) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {
        super(fileArr[0].getName());
        this.f13581e = new com.googlecode.mp4parser.authoring.i();
        this.f13582f = new s0();
        this.f13583g = new com.mp4parser.iso14496.part30.e();
        this.f13584h = new ArrayList();
        this.f13585i = new a1();
        this.f13587k = new long[fileArr.length];
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
        c cVar = null;
        long j4 = 0;
        String str = null;
        int i4 = 0;
        while (i4 < fileArr.length) {
            File file = fileArr[i4];
            a1.a aVar = new a1.a();
            this.f13585i.v().add(aVar);
            aVar.d(1L);
            Document parse = newDocumentBuilder.parse(file);
            String d5 = d(parse);
            if (str == null) {
                str = d5;
            } else if (!str.equals(d5)) {
                throw new RuntimeException("Within one Track all sample documents need to have the same language");
            }
            XPathFactory newInstance2 = XPathFactory.newInstance();
            c cVar2 = new c(cVar);
            XPath newXPath = newInstance2.newXPath();
            newXPath.setNamespaceContext(cVar2);
            long g4 = g(parse);
            this.f13587k[i4] = g4 - j4;
            NodeList nodeList = (NodeList) newXPath.compile("/ttml:tt/ttml:body/ttml:div/@smpte:backgroundImage").evaluate(parse, XPathConstants.NODESET);
            HashMap hashMap = new HashMap();
            HashSet hashSet = new HashSet();
            for (int i5 = 0; i5 < nodeList.getLength(); i5++) {
                hashSet.add(nodeList.item(i5).getNodeValue());
            }
            ArrayList<String> arrayList = new ArrayList(hashSet);
            Collections.sort(arrayList);
            int i6 = 1;
            for (String str2 : arrayList) {
                hashMap.put(str2, "urn:dece:container:subtitleimageindex:" + i6 + str2.substring(str2.lastIndexOf(h0.f27805a)));
                i6++;
            }
            if (!arrayList.isEmpty()) {
                String str3 = new String(h(new FileInputStream(file)));
                for (Map.Entry entry : hashMap.entrySet()) {
                    str3 = str3.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
                }
                ArrayList arrayList2 = new ArrayList();
                this.f13584h.add(new a(str3, arrayList2));
                a1.a.C0241a c0241a = new a1.a.C0241a();
                c0241a.h(com.coremedia.iso.l.c(str3));
                aVar.c().add(c0241a);
                for (String str4 : arrayList) {
                    File file2 = new File(file.getParentFile(), str4);
                    arrayList2.add(file2);
                    a1.a.C0241a c0241a2 = new a1.a.C0241a();
                    c0241a2.h(file2.length());
                    aVar.c().add(c0241a2);
                }
            } else {
                this.f13584h.add(new b(file));
            }
            i4++;
            j4 = g4;
            cVar = null;
        }
        this.f13581e.o(com.googlecode.mp4parser.util.g.a(str));
        this.f13583g.K(f13580l);
        this.f13583g.N(f13580l);
        if (this.f13586j) {
            this.f13583g.J("image/png");
        } else {
            this.f13583g.J("");
        }
        this.f13582f.v(this.f13583g);
        this.f13581e.s(30000L);
        this.f13581e.p(65535);
    }

    public static long b(Document document) {
        XPathFactory newInstance = XPathFactory.newInstance();
        c cVar = new c(null);
        XPath newXPath = newInstance.newXPath();
        newXPath.setNamespaceContext(cVar);
        try {
            NodeList nodeList = (NodeList) newXPath.compile("//*[@begin]").evaluate(document, XPathConstants.NODESET);
            long j4 = 0;
            for (int i4 = 0; i4 < nodeList.getLength(); i4++) {
                j4 = Math.min(j(nodeList.item(i4).getAttributes().getNamedItem("begin").getNodeValue()), j4);
            }
            return j4;
        } catch (XPathExpressionException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static String d(Document document) {
        return document.getDocumentElement().getAttribute("xml:lang");
    }

    public static long g(Document document) {
        long j4;
        XPathFactory newInstance = XPathFactory.newInstance();
        c cVar = new c(null);
        XPath newXPath = newInstance.newXPath();
        newXPath.setNamespaceContext(cVar);
        try {
            NodeList nodeList = (NodeList) newXPath.compile("//*[@begin]").evaluate(document, XPathConstants.NODESET);
            long j5 = 0;
            for (int i4 = 0; i4 < nodeList.getLength(); i4++) {
                Node item = nodeList.item(i4);
                String nodeValue = item.getAttributes().getNamedItem("begin").getNodeValue();
                if (item.getAttributes().getNamedItem("dur") != null) {
                    j4 = j(nodeValue) + j(item.getAttributes().getNamedItem("dur").getNodeValue());
                } else if (item.getAttributes().getNamedItem("end") != null) {
                    j4 = j(item.getAttributes().getNamedItem("end").getNodeValue());
                } else {
                    throw new RuntimeException("neither end nor dur attribute is present");
                }
                j5 = Math.max(j4, j5);
            }
            return j5;
        } catch (XPathExpressionException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] h(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[HttpPostBodyUtil.chunkSize];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    static long j(String str) {
        Matcher matcher = Pattern.compile("([0-9][0-9]):([0-9][0-9]):([0-9][0-9])([\\.:][0-9][0-9]?[0-9]?)?").matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            String group3 = matcher.group(3);
            String group4 = matcher.group(4);
            if (group4 == null) {
                group4 = ".000";
            }
            String replace = group4.replace(":", h0.f27805a);
            double parseLong = (Long.parseLong(group) * 60 * 60 * 1000) + (Long.parseLong(group2) * 60 * 1000) + (Long.parseLong(group3) * 1000);
            Double.isNaN(parseLong);
            return (long) (parseLong + (Double.parseDouble("0" + replace) * 1000.0d));
        }
        throw new RuntimeException("Cannot match " + str + " to time expression");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i M() {
        return this.f13581e;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] O() {
        int length = this.f13587k.length;
        long[] jArr = new long[length];
        for (int i4 = 0; i4 < length; i4++) {
            jArr[i4] = (this.f13587k[i4] * this.f13581e.h()) / 1000;
        }
        return jArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return "subt";
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public s0 o() {
        return this.f13582f;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public a1 s() {
        return this.f13585i;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> x() {
        return this.f13584h;
    }
}
