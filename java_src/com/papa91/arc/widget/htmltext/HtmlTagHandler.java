package com.papa91.arc.widget.htmltext;

import android.text.Editable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.AlignmentSpan;
import android.text.style.BulletSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.papa91.arc.widget.htmltext.HtmlFormatter;
import java.util.Stack;
import net.lingala.zip4j.util.e;
import org.xml.sax.Attributes;
/* loaded from: classes5.dex */
public class HtmlTagHandler implements WrapperTagHandler {
    public static final String A_ITEM = "HTML_TEXTVIEW_ESCAPED_A_TAG";
    public static final String LIST_ITEM = "HTML_TEXTVIEW_ESCAPED_LI_TAG";
    public static final String ORDERED_LIST = "HTML_TEXTVIEW_ESCAPED_OL_TAG";
    public static final String PLACEHOLDER_ITEM = "HTML_TEXTVIEW_ESCAPED_PLACEHOLDER";
    public static final String UNORDERED_LIST = "HTML_TEXTVIEW_ESCAPED_UL_TAG";
    private static final BulletSpan defaultBullet = new BulletSpan(10);
    private static final int defaultIndent = 10;
    private static final int defaultListItemIndent = 20;
    private static int userGivenIndent = -1;
    private ClickableTableSpan clickableTableSpan;
    private DrawTableLinkSpan drawTableLinkSpan;
    private HtmlFormatter.TagClickListenerProvider onClickATagListenerProvider;
    Stack<String> lists = new Stack<>();
    Stack<Integer> olNextIndex = new Stack<>();
    StringBuilder tableHtmlBuilder = new StringBuilder();
    int tableTagLevel = 0;

    /* loaded from: classes5.dex */
    private static class A {
        private String href;
        private String text;

        private A(String str, String str2) {
            this.text = str;
            this.href = str2;
        }
    }

    /* loaded from: classes5.dex */
    private static class Center {
        private Center() {
        }
    }

    /* loaded from: classes5.dex */
    private static class Code {
        private Code() {
        }
    }

    /* loaded from: classes5.dex */
    private static class Ol {
        private Ol() {
        }
    }

    /* loaded from: classes5.dex */
    private static class Strike {
        private Strike() {
        }
    }

    /* loaded from: classes5.dex */
    private static class Table {
        private Table() {
        }
    }

    /* loaded from: classes5.dex */
    private static class Td {
        private Td() {
        }
    }

    /* loaded from: classes5.dex */
    private static class Th {
        private Th() {
        }
    }

    /* loaded from: classes5.dex */
    private static class Tr {
        private Tr() {
        }
    }

    /* loaded from: classes5.dex */
    private static class Ul {
        private Ul() {
        }
    }

    private void end(Editable editable, Class cls, boolean z4, Object... objArr) {
        Object last = getLast(editable, cls);
        int spanStart = editable.getSpanStart(last);
        int length = editable.length();
        if (this.tableTagLevel > 0) {
            this.tableHtmlBuilder.append(extractSpanText(editable, cls));
        }
        editable.removeSpan(last);
        if (spanStart != length) {
            if (z4) {
                editable.append("\n");
                length++;
            }
            for (Object obj : objArr) {
                editable.setSpan(obj, spanStart, length, 33);
            }
        }
    }

    private CharSequence extractSpanText(Editable editable, Class cls) {
        int spanStart = editable.getSpanStart(getLast(editable, cls));
        int length = editable.length();
        CharSequence subSequence = editable.subSequence(spanStart, length);
        editable.delete(spanStart, length);
        return subSequence;
    }

    private static Object getLast(Editable editable, Class cls) {
        Object[] spans = editable.getSpans(0, editable.length(), cls);
        if (spans.length == 0) {
            return null;
        }
        for (int length = spans.length; length > 0; length--) {
            int i4 = length - 1;
            if (editable.getSpanFlags(spans[i4]) == 17) {
                return spans[i4];
            }
        }
        return null;
    }

    private void start(Editable editable, Object obj) {
        int length = editable.length();
        editable.setSpan(obj, length, length, 17);
    }

    private void storeTableTags(boolean z4, String str) {
        if (this.tableTagLevel > 0 || str.equalsIgnoreCase("table")) {
            this.tableHtmlBuilder.append(SimpleComparison.LESS_THAN_OPERATION);
            if (!z4) {
                this.tableHtmlBuilder.append(e.F0);
            }
            StringBuilder sb = this.tableHtmlBuilder;
            sb.append(str.toLowerCase());
            sb.append(SimpleComparison.GREATER_THAN_OPERATION);
        }
    }

    @Override // com.papa91.arc.widget.htmltext.WrapperTagHandler
    public boolean handleTag(boolean z4, String str, Editable editable, Attributes attributes) {
        boolean z5;
        ClickableTableSpan clickableTableSpan;
        if (z4) {
            if (str.equalsIgnoreCase(UNORDERED_LIST)) {
                this.lists.push(str);
            } else if (str.equalsIgnoreCase(ORDERED_LIST)) {
                this.lists.push(str);
                this.olNextIndex.push(1);
            } else if (str.equalsIgnoreCase(LIST_ITEM)) {
                if (editable.length() > 0 && editable.charAt(editable.length() - 1) != '\n') {
                    editable.append("\n");
                }
                if (!this.lists.isEmpty()) {
                    String peek = this.lists.peek();
                    if (peek.equalsIgnoreCase(ORDERED_LIST)) {
                        start(editable, new Ol());
                        Stack<Integer> stack = this.olNextIndex;
                        stack.push(Integer.valueOf(stack.pop().intValue() + 1));
                    } else if (peek.equalsIgnoreCase(UNORDERED_LIST)) {
                        start(editable, new Ul());
                    }
                }
            } else if (str.equalsIgnoreCase(A_ITEM)) {
                start(editable, new A(editable.toString(), attributes != null ? attributes.getValue("href") : null));
            } else if (str.equalsIgnoreCase("code")) {
                start(editable, new Code());
            } else if (str.equalsIgnoreCase("center")) {
                start(editable, new Center());
            } else if (!str.equalsIgnoreCase("s") && !str.equalsIgnoreCase("strike")) {
                if (str.equalsIgnoreCase("table")) {
                    start(editable, new Table());
                    if (this.tableTagLevel == 0) {
                        this.tableHtmlBuilder = new StringBuilder();
                        editable.append("table placeholder");
                    }
                    this.tableTagLevel++;
                } else if (str.equalsIgnoreCase("tr")) {
                    start(editable, new Tr());
                } else if (str.equalsIgnoreCase("th")) {
                    start(editable, new Th());
                } else if (!str.equalsIgnoreCase("td")) {
                    return false;
                } else {
                    start(editable, new Td());
                }
            } else {
                start(editable, new Strike());
            }
        } else {
            if (str.equalsIgnoreCase(UNORDERED_LIST)) {
                this.lists.pop();
            } else if (str.equalsIgnoreCase(ORDERED_LIST)) {
                this.lists.pop();
                this.olNextIndex.pop();
            } else if (str.equalsIgnoreCase(LIST_ITEM)) {
                if (!this.lists.isEmpty()) {
                    int i4 = userGivenIndent;
                    int i5 = i4 > -1 ? i4 * 2 : 20;
                    if (this.lists.peek().equalsIgnoreCase(UNORDERED_LIST)) {
                        if (editable.length() > 0 && editable.charAt(editable.length() - 1) != '\n') {
                            editable.append("\n");
                        }
                        int i6 = userGivenIndent;
                        int i7 = i6 > -1 ? i6 : 10;
                        BulletSpan bulletSpan = i6 > -1 ? new BulletSpan(userGivenIndent) : defaultBullet;
                        if (this.lists.size() > 1) {
                            i7 -= bulletSpan.getLeadingMargin(true);
                            if (this.lists.size() > 2) {
                                i7 -= (this.lists.size() - 2) * i5;
                            }
                        }
                        end(editable, Ul.class, false, new LeadingMarginSpan.Standard(i5 * (this.lists.size() - 1)), new BulletSpan(i7));
                    } else if (this.lists.peek().equalsIgnoreCase(ORDERED_LIST)) {
                        if (editable.length() > 0 && editable.charAt(editable.length() - 1) != '\n') {
                            editable.append("\n");
                        }
                        int i8 = userGivenIndent;
                        if (i8 <= -1) {
                            i8 = 10;
                        }
                        NumberSpan numberSpan = new NumberSpan(i8, this.olNextIndex.lastElement().intValue() - 1);
                        if (this.lists.size() > 1) {
                            i8 -= numberSpan.getLeadingMargin(true);
                            if (this.lists.size() > 2) {
                                i8 -= (this.lists.size() - 2) * i5;
                            }
                        }
                        end(editable, Ol.class, false, new LeadingMarginSpan.Standard(i5 * (this.lists.size() - 1)), new NumberSpan(i8, this.olNextIndex.lastElement().intValue() - 1));
                    }
                }
            } else if (str.equalsIgnoreCase(A_ITEM)) {
                Object last = getLast(editable, A.class);
                int spanStart = editable.getSpanStart(last);
                int length = editable.length();
                String str2 = last instanceof A ? ((A) last).href : null;
                final String charSequence = editable.subSequence(spanStart, length).toString();
                if (this.clickableTableSpan != null) {
                    end(editable, A.class, false, new URLSpan(str2) { // from class: com.papa91.arc.widget.htmltext.HtmlTagHandler.1
                        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                        public void onClick(View view) {
                            if (HtmlTagHandler.this.onClickATagListenerProvider == null || HtmlTagHandler.this.onClickATagListenerProvider.provideTagClickListener().onClick(view, charSequence, getURL())) {
                                return;
                            }
                            super.onClick(view);
                        }

                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public void updateDrawState(@NonNull TextPaint textPaint) {
                            super.updateDrawState(textPaint);
                            HtmlTagHandler.this.clickableTableSpan.updateDrawState(textPaint);
                        }
                    });
                } else {
                    end(editable, A.class, false, new URLSpan(str2) { // from class: com.papa91.arc.widget.htmltext.HtmlTagHandler.2
                        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                        public void onClick(View view) {
                            if (HtmlTagHandler.this.onClickATagListenerProvider == null || HtmlTagHandler.this.onClickATagListenerProvider.provideTagClickListener().onClick(view, charSequence, getURL())) {
                                return;
                            }
                            super.onClick(view);
                        }
                    });
                }
            } else if (str.equalsIgnoreCase("code")) {
                end(editable, Code.class, false, new TypefaceSpan("monospace"));
            } else if (str.equalsIgnoreCase("center")) {
                end(editable, Center.class, true, new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER));
            } else if (!str.equalsIgnoreCase("s") && !str.equalsIgnoreCase("strike")) {
                if (str.equalsIgnoreCase("table")) {
                    int i9 = this.tableTagLevel - 1;
                    this.tableTagLevel = i9;
                    if (i9 == 0) {
                        String sb = this.tableHtmlBuilder.toString();
                        ClickableTableSpan clickableTableSpan2 = this.clickableTableSpan;
                        if (clickableTableSpan2 != null) {
                            clickableTableSpan = clickableTableSpan2.newInstance();
                            clickableTableSpan.setTableHtml(sb);
                        } else {
                            clickableTableSpan = null;
                        }
                        DrawTableLinkSpan drawTableLinkSpan = this.drawTableLinkSpan;
                        end(editable, Table.class, false, drawTableLinkSpan != null ? drawTableLinkSpan.newInstance() : null, clickableTableSpan);
                    } else {
                        end(editable, Table.class, false, new Object[0]);
                    }
                } else if (str.equalsIgnoreCase("tr")) {
                    end(editable, Tr.class, false, new Object[0]);
                } else if (str.equalsIgnoreCase("th")) {
                    end(editable, Th.class, false, new Object[0]);
                } else if (!str.equalsIgnoreCase("td")) {
                    return false;
                } else {
                    end(editable, Td.class, false, new Object[0]);
                }
            } else {
                z5 = true;
                end(editable, Strike.class, false, new StrikethroughSpan());
                storeTableTags(z4, str);
                return z5;
            }
        }
        z5 = true;
        storeTableTags(z4, str);
        return z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String overrideTags(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return ("<HTML_TEXTVIEW_ESCAPED_PLACEHOLDER></HTML_TEXTVIEW_ESCAPED_PLACEHOLDER>" + str).replace("<ul", "<HTML_TEXTVIEW_ESCAPED_UL_TAG").replace("</ul>", "</HTML_TEXTVIEW_ESCAPED_UL_TAG>").replace("<ol", "<HTML_TEXTVIEW_ESCAPED_OL_TAG").replace("</ol>", "</HTML_TEXTVIEW_ESCAPED_OL_TAG>").replace("<li", "<HTML_TEXTVIEW_ESCAPED_LI_TAG").replace("</li>", "</HTML_TEXTVIEW_ESCAPED_LI_TAG>").replace("<a", "<HTML_TEXTVIEW_ESCAPED_A_TAG").replace("</a>", "</HTML_TEXTVIEW_ESCAPED_A_TAG>");
    }

    public void setClickableTableSpan(ClickableTableSpan clickableTableSpan) {
        this.clickableTableSpan = clickableTableSpan;
    }

    public void setDrawTableLinkSpan(DrawTableLinkSpan drawTableLinkSpan) {
        this.drawTableLinkSpan = drawTableLinkSpan;
    }

    public void setListIndentPx(float f5) {
        userGivenIndent = Math.round(f5);
    }

    public void setOnClickATagListenerProvider(HtmlFormatter.TagClickListenerProvider tagClickListenerProvider) {
        this.onClickATagListenerProvider = tagClickListenerProvider;
    }
}
