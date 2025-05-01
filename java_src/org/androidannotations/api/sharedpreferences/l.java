package org.androidannotations.api.sharedpreferences;

import android.util.Xml;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
/* compiled from: SetXmlSerializer.java */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static final String f72094a = "";

    /* renamed from: b  reason: collision with root package name */
    private static final String f72095b = "AA_string";

    /* renamed from: c  reason: collision with root package name */
    private static final String f72096c = "AA_set";

    private l() {
    }

    public static Set<String> a(String str) {
        TreeSet treeSet = new TreeSet();
        XmlPullParser newPullParser = Xml.newPullParser();
        try {
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            newPullParser.require(2, "", f72096c);
            while (newPullParser.next() != 3) {
                newPullParser.require(2, "", f72095b);
                newPullParser.next();
                newPullParser.require(4, null, null);
                treeSet.add(newPullParser.getText());
                newPullParser.next();
                newPullParser.require(3, null, f72095b);
            }
            return treeSet;
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    public static String b(Set<String> set) {
        if (set == null) {
            set = Collections.emptySet();
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = Xml.newSerializer();
        try {
            newSerializer.setOutput(stringWriter);
            newSerializer.startTag("", f72096c);
            for (String str : set) {
                newSerializer.startTag("", f72095b).text(str).endTag("", f72095b);
            }
            newSerializer.endTag("", f72096c).endDocument();
        } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
        }
        return stringWriter.toString();
    }
}
