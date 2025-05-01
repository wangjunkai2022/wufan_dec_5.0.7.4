package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
import org.aspectj.lang.c;
/* compiled from: AppleDataBox.java */
/* loaded from: classes3.dex */
public abstract class j extends com.googlecode.mp4parser.a {

    /* renamed from: r  reason: collision with root package name */
    private static HashMap<String, String> f13623r;

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ c.b f13624s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ c.b f13625t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f13626u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f13627v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f13628w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f13629x = null;

    /* renamed from: o  reason: collision with root package name */
    int f13630o;

    /* renamed from: p  reason: collision with root package name */
    int f13631p;

    /* renamed from: q  reason: collision with root package name */
    int f13632q;

    static {
        s();
        HashMap<String, String> hashMap = new HashMap<>();
        f13623r = hashMap;
        hashMap.put("0", "English");
        f13623r.put("1", "French");
        f13623r.put("2", "German");
        f13623r.put("3", "Italian");
        f13623r.put("4", "Dutch");
        f13623r.put("5", "Swedish");
        f13623r.put("6", "Spanish");
        f13623r.put("7", "Danish");
        f13623r.put("8", "Portuguese");
        f13623r.put("9", "Norwegian");
        f13623r.put(com.join.mgps.Util.v.f28122v, "Hebrew");
        f13623r.put("11", "Japanese");
        f13623r.put("12", "Arabic");
        f13623r.put("13", "Finnish");
        f13623r.put("14", "Greek");
        f13623r.put("15", "Icelandic");
        f13623r.put("16", "Maltese");
        f13623r.put("17", "Turkish");
        f13623r.put("18", "Croatian");
        f13623r.put("19", "Traditional_Chinese");
        f13623r.put("20", "Urdu");
        f13623r.put("21", "Hindi");
        f13623r.put("22", "Thai");
        f13623r.put("23", "Korean");
        f13623r.put("24", "Lithuanian");
        f13623r.put("25", "Polish");
        f13623r.put("26", "Hungarian");
        f13623r.put("27", "Estonian");
        f13623r.put("28", "Lettish");
        f13623r.put("29", "Sami");
        f13623r.put("30", "Faroese");
        f13623r.put("31", "Farsi");
        f13623r.put("32", "Russian");
        f13623r.put("33", "Simplified_Chinese");
        f13623r.put("34", "Flemish");
        f13623r.put("35", "Irish");
        f13623r.put("36", "Albanian");
        f13623r.put("37", "Romanian");
        f13623r.put("38", "Czech");
        f13623r.put("39", "Slovak");
        f13623r.put("40", "Slovenian");
        f13623r.put("41", "Yiddish");
        f13623r.put("42", "Serbian");
        f13623r.put("43", "Macedonian");
        f13623r.put("44", "Bulgarian");
        f13623r.put("45", "Ukrainian");
        f13623r.put("46", "Belarusian");
        f13623r.put("47", "Uzbek");
        f13623r.put("48", "Kazakh");
        f13623r.put("49", "Azerbaijani");
        f13623r.put("50", "AzerbaijanAr");
        f13623r.put("51", "Armenian");
        f13623r.put("52", "Georgian");
        f13623r.put("53", "Moldavian");
        f13623r.put("54", "Kirghiz");
        f13623r.put("55", "Tajiki");
        f13623r.put("56", "Turkmen");
        f13623r.put("57", "Mongolian");
        f13623r.put("58", "MongolianCyr");
        f13623r.put("59", "Pashto");
        f13623r.put("60", "Kurdish");
        f13623r.put("61", "Kashmiri");
        f13623r.put("62", "Sindhi");
        f13623r.put("63", "Tibetan");
        f13623r.put("64", "Nepali");
        f13623r.put("65", "Sanskrit");
        f13623r.put("66", "Marathi");
        f13623r.put("67", "Bengali");
        f13623r.put("68", "Assamese");
        f13623r.put("69", "Gujarati");
        f13623r.put("70", "Punjabi");
        f13623r.put("71", "Oriya");
        f13623r.put("72", "Malayalam");
        f13623r.put("73", "Kannada");
        f13623r.put("74", "Tamil");
        f13623r.put("75", "Telugu");
        f13623r.put("76", "Sinhala");
        f13623r.put("77", "Burmese");
        f13623r.put("78", "Khmer");
        f13623r.put("79", "Lao");
        f13623r.put("80", "Vietnamese");
        f13623r.put("81", "Indonesian");
        f13623r.put("82", "Tagalog");
        f13623r.put("83", "MalayRoman");
        f13623r.put("84", "MalayArabic");
        f13623r.put("85", "Amharic");
        f13623r.put("87", "Galla");
        f13623r.put("87", "Oromo");
        f13623r.put("88", "Somali");
        f13623r.put("89", "Swahili");
        f13623r.put("90", "Kinyarwanda");
        f13623r.put("91", "Rundi");
        f13623r.put("92", "Nyanja");
        f13623r.put("93", "Malagasy");
        f13623r.put("94", "Esperanto");
        f13623r.put("128", "Welsh");
        f13623r.put("129", "Basque");
        f13623r.put("130", "Catalan");
        f13623r.put("131", "Latin");
        f13623r.put("132", "Quechua");
        f13623r.put("133", "Guarani");
        f13623r.put("134", "Aymara");
        f13623r.put("135", "Tatar");
        f13623r.put("136", "Uighur");
        f13623r.put("137", "Dzongkha");
        f13623r.put("138", "JavaneseRom");
        f13623r.put("32767", "Unspecified");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j(String str, int i4) {
        super(str);
        this.f13630o = i4;
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("AppleDataBox.java", j.class);
        f13624s = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLanguageString", "com.googlecode.mp4parser.boxes.apple.AppleDataBox", "", "", "", "java.lang.String"), 25);
        f13625t = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDataType", "com.googlecode.mp4parser.boxes.apple.AppleDataBox", "", "", "", MethodReflectParams.INT), 43);
        f13626u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDataCountry", "com.googlecode.mp4parser.boxes.apple.AppleDataBox", "", "", "", MethodReflectParams.INT), 47);
        f13627v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDataCountry", "com.googlecode.mp4parser.boxes.apple.AppleDataBox", MethodReflectParams.INT, "dataCountry", "", "void"), 51);
        f13628w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDataLanguage", "com.googlecode.mp4parser.boxes.apple.AppleDataBox", "", "", "", MethodReflectParams.INT), 55);
        f13629x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDataLanguage", "com.googlecode.mp4parser.boxes.apple.AppleDataBox", MethodReflectParams.INT, "dataLanguage", "", "void"), 59);
    }

    public void A(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f13627v, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13631p = i4;
    }

    public void B(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f13629x, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13632q = i4;
    }

    protected abstract byte[] C();

    @DoNotParseDetail
    protected void D(ByteBuffer byteBuffer) {
        byteBuffer.putInt(v() + 16);
        byteBuffer.put("data".getBytes());
        byteBuffer.putInt(this.f13630o);
        com.coremedia.iso.i.f(byteBuffer, this.f13631p);
        com.coremedia.iso.i.f(byteBuffer, this.f13632q);
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        y(z(byteBuffer));
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        D(byteBuffer);
        byteBuffer.put(C());
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return v() + 16;
    }

    public int t() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13626u, this, this));
        return this.f13631p;
    }

    public int u() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13628w, this, this));
        return this.f13632q;
    }

    protected abstract int v();

    public int w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13625t, this, this));
        return this.f13630o;
    }

    public String x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13624s, this, this));
        HashMap<String, String> hashMap = f13623r;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13632q);
        String str = hashMap.get(sb.toString());
        if (str == null) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[2]);
            com.coremedia.iso.i.f(wrap, this.f13632q);
            wrap.reset();
            return new Locale(com.coremedia.iso.g.f(wrap)).getDisplayLanguage();
        }
        return str;
    }

    protected abstract void y(ByteBuffer byteBuffer);

    @DoNotParseDetail
    protected ByteBuffer z(ByteBuffer byteBuffer) {
        int i4 = byteBuffer.getInt();
        byteBuffer.getInt();
        this.f13630o = byteBuffer.getInt();
        short s4 = byteBuffer.getShort();
        this.f13631p = s4;
        if (s4 < 0) {
            this.f13631p = s4 + 65536;
        }
        short s5 = byteBuffer.getShort();
        this.f13632q = s5;
        if (s5 < 0) {
            this.f13632q = s5 + 65536;
        }
        int i5 = i4 - 16;
        ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.duplicate().slice().limit(i5);
        byteBuffer.position(i5 + byteBuffer.position());
        return byteBuffer2;
    }
}
