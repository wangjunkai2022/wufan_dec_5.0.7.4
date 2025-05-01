package org.jsoup.nodes;

import kotlin.text.Typography;
import m.a;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
/* loaded from: classes7.dex */
public class DocumentType extends Node {
    public DocumentType(String str, String str2, String str3, String str4) {
        super(str4);
        Validate.notEmpty(str);
        attr("name", str);
        attr("publicId", str2);
        attr("systemId", str3);
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return "#doctype";
    }

    @Override // org.jsoup.nodes.Node
    void outerHtmlHead(StringBuilder sb, int i4, Document.OutputSettings outputSettings) {
        sb.append("<!DOCTYPE ");
        sb.append(attr("name"));
        if (!StringUtil.isBlank(attr("publicId"))) {
            sb.append(" PUBLIC \"");
            sb.append(attr("publicId"));
            sb.append(a.f71493g);
        }
        if (!StringUtil.isBlank(attr("systemId"))) {
            sb.append(" \"");
            sb.append(attr("systemId"));
            sb.append(a.f71493g);
        }
        sb.append(Typography.greater);
    }

    @Override // org.jsoup.nodes.Node
    void outerHtmlTail(StringBuilder sb, int i4, Document.OutputSettings outputSettings) {
    }
}
