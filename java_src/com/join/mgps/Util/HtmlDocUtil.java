package com.join.mgps.Util;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
/* loaded from: classes3.dex */
public class HtmlDocUtil {

    /* loaded from: classes3.dex */
    public static class PostDetail {

        /* renamed from: a  reason: collision with root package name */
        public Type f27403a;

        /* renamed from: b  reason: collision with root package name */
        public Object f27404b;

        /* loaded from: classes3.dex */
        public enum Type {
            Text,
            RickText,
            Image,
            Video
        }

        public Object a() {
            return this.f27404b;
        }

        public void b(Object obj) {
            this.f27404b = obj;
        }

        public void c(Type type) {
            this.f27403a = type;
        }

        public Type getType() {
            return this.f27403a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a extends ClickableSpan {

        /* renamed from: b  reason: collision with root package name */
        private String f27405b;

        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IntentUtil.getInstance().goShareWebActivity(view.getContext(), this.f27405b);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.bgColor = Color.parseColor("#00000000");
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }

        public a(String str) {
            this.f27405b = str;
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends PostDetail {

        /* renamed from: c  reason: collision with root package name */
        public String f27406c;

        /* renamed from: d  reason: collision with root package name */
        public String f27407d;

        public b() {
        }

        public String d() {
            return this.f27406c;
        }

        public String e() {
            return this.f27407d;
        }

        public void f(String str) {
            this.f27406c = str;
        }

        public void g(String str) {
            this.f27407d = str;
        }

        public b(String str, String str2) {
            this.f27406c = str;
            this.f27407d = str2;
        }
    }

    /* loaded from: classes3.dex */
    public static class d extends PostDetail {

        /* renamed from: c  reason: collision with root package name */
        public String f27409c;

        /* renamed from: d  reason: collision with root package name */
        public String f27410d;

        public d() {
        }

        public String d() {
            return this.f27409c;
        }

        public String e() {
            return this.f27410d;
        }

        public void f(String str) {
            this.f27409c = str;
        }

        public void g(String str) {
            this.f27410d = str;
        }

        public d(String str, String str2) {
            this.f27409c = str;
            this.f27410d = str2;
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends PostDetail {

        /* renamed from: c  reason: collision with root package name */
        public SpannableStringBuilder f27411c;

        public e(SpannableStringBuilder spannableStringBuilder) {
            this.f27411c = spannableStringBuilder;
        }

        public SpannableStringBuilder d() {
            return this.f27411c;
        }
    }

    public static String a(String str) {
        char[] charArray = str.toCharArray();
        for (int i4 = 0; i4 < charArray.length; i4++) {
            if (charArray[i4] == 12288) {
                charArray[i4] = ' ';
            } else if (charArray[i4] > 65280 && charArray[i4] < 65375) {
                charArray[i4] = (char) (charArray[i4] - 65248);
            }
        }
        return new String(charArray);
    }

    public static String b(String str) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.CHINA).format(new Date(Long.parseLong(str)));
    }

    public static List<PostDetail> c(String str) {
        Iterator<Element> it2;
        Iterator<Element> it3;
        List<Node> list;
        ArrayList arrayList = new ArrayList();
        Iterator<Element> it4 = Jsoup.parse(str).getElementsByClass("detail").get(0).children().iterator();
        while (it4.hasNext()) {
            Element next = it4.next();
            PostDetail postDetail = new PostDetail();
            String nodeName = next.nodeName();
            if (nodeName.equals("p")) {
                List<Node> childNodes = next.childNodes();
                int i4 = 1;
                int i5 = 0;
                boolean z4 = true;
                while (i5 < childNodes.size()) {
                    postDetail = new PostDetail();
                    Node node = childNodes.get(i5);
                    if (node instanceof TextNode) {
                        String text = ((TextNode) node).text();
                        if (arrayList.size() > 0) {
                            PostDetail postDetail2 = (PostDetail) arrayList.get(arrayList.size() - i4);
                            it3 = it4;
                            if (postDetail2.getType() == PostDetail.Type.Text && i5 != 0) {
                                SpannableStringBuilder d5 = ((c) postDetail2.a()).d();
                                d5.append((CharSequence) ("<br/>" + text));
                            }
                        } else {
                            it3 = it4;
                        }
                        postDetail.c(PostDetail.Type.Text);
                        postDetail.b(new c(new SpannableStringBuilder().append((CharSequence) text)));
                        arrayList.add(postDetail);
                    } else {
                        it3 = it4;
                        if (node instanceof Element) {
                            if (node.nodeName().equals("img")) {
                                if (!g2.h(node.attr("uurl"))) {
                                    postDetail.c(PostDetail.Type.Video);
                                    postDetail.b(new d(node.attr("src"), node.attr("uurl")));
                                } else {
                                    postDetail.c(PostDetail.Type.Image);
                                    postDetail.b(new b(node.attr("src"), node.attr("bsrc")));
                                }
                                arrayList.add(postDetail);
                            } else if (node.nodeName().equals("br")) {
                                if (arrayList.size() > 0) {
                                    PostDetail postDetail3 = (PostDetail) arrayList.get(arrayList.size() - 1);
                                    if (postDetail3.getType() == PostDetail.Type.Text && i5 != 0) {
                                        SpannableStringBuilder d6 = ((c) postDetail3.a()).d();
                                        d6.append((CharSequence) "\n");
                                        postDetail3.b(new c(d6));
                                    }
                                }
                                postDetail.c(PostDetail.Type.Text);
                                postDetail.b(new c(new SpannableStringBuilder().append((CharSequence) " ")));
                                arrayList.add(postDetail);
                            } else if (node.nodeName().equals("a")) {
                                String attr = node.attr("href");
                                if (g2.h(attr)) {
                                    attr = "#";
                                }
                                SpannableString spannableString = new SpannableString(((Element) node).text());
                                list = childNodes;
                                spannableString.setSpan(new a(attr), 0, spannableString.length(), 17);
                                if (arrayList.size() > 0) {
                                    PostDetail postDetail4 = (PostDetail) arrayList.get(arrayList.size() - 1);
                                    if (postDetail4.getType() == PostDetail.Type.Text && i5 != 0) {
                                        ((c) postDetail4.a()).d().append((CharSequence) spannableString);
                                        z4 = false;
                                        i5++;
                                        it4 = it3;
                                        childNodes = list;
                                        i4 = 1;
                                    }
                                }
                                postDetail.c(PostDetail.Type.Text);
                                postDetail.b(new c(new SpannableStringBuilder().append((CharSequence) spannableString)));
                                arrayList.add(postDetail);
                                z4 = false;
                                i5++;
                                it4 = it3;
                                childNodes = list;
                                i4 = 1;
                            }
                        }
                        list = childNodes;
                        i5++;
                        it4 = it3;
                        childNodes = list;
                        i4 = 1;
                    }
                    list = childNodes;
                    z4 = false;
                    i5++;
                    it4 = it3;
                    childNodes = list;
                    i4 = 1;
                }
                it2 = it4;
                if (z4) {
                    postDetail.c(PostDetail.Type.RickText);
                    postDetail.b(new e(new SpannableStringBuilder(next.html())));
                    arrayList.add(postDetail);
                }
            } else {
                it2 = it4;
                if (nodeName.equals("img")) {
                    if (!g2.h(next.attr("uurl"))) {
                        postDetail.c(PostDetail.Type.Video);
                        postDetail.b(new d(next.attr("src"), next.attr("uurl")));
                    } else {
                        postDetail.c(PostDetail.Type.Image);
                        postDetail.b(new b(next.attr("src"), next.attr("bsrc")));
                    }
                    arrayList.add(postDetail);
                } else if (next.nodeName().equals("a")) {
                    String attr2 = next.attr("href");
                    String str2 = g2.h(attr2) ? "#" : attr2;
                    SpannableString spannableString2 = new SpannableString(next.text());
                    spannableString2.setSpan(new a(str2), 0, spannableString2.length(), 17);
                    postDetail.c(PostDetail.Type.Text);
                    postDetail.b(new c(new SpannableStringBuilder().append((CharSequence) spannableString2)));
                    arrayList.add(postDetail);
                    it4 = it2;
                }
            }
            it4 = it2;
        }
        return arrayList;
    }

    public static boolean d(String str) {
        if (g2.h(str)) {
            return false;
        }
        try {
            Document parse = Jsoup.parse(str);
            if (parse == null || parse.getElementsByClass("detail") == null) {
                return false;
            }
            return parse.getElementsByClass("detail").size() != 0;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends PostDetail {

        /* renamed from: c  reason: collision with root package name */
        public SpannableStringBuilder f27408c;

        public c(SpannableStringBuilder spannableStringBuilder) {
            this.f27408c = spannableStringBuilder;
        }

        public SpannableStringBuilder d() {
            return this.f27408c;
        }

        public void e(SpannableStringBuilder spannableStringBuilder) {
            this.f27408c = spannableStringBuilder;
        }

        public c() {
        }
    }
}
