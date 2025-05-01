package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
/* loaded from: classes7.dex */
public class TokenQueue {
    private static final char ESC = '\\';
    private int pos = 0;
    private String queue;

    public TokenQueue(String str) {
        Validate.notNull(str);
        this.queue = str;
    }

    private int remainingLength() {
        return this.queue.length() - this.pos;
    }

    public static String unescape(String str) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i4 = 0;
        char c5 = 0;
        while (i4 < length) {
            char c6 = charArray[i4];
            if (c6 != '\\') {
                sb.append(c6);
            } else if (c5 != 0 && c5 == '\\') {
                sb.append(c6);
            }
            i4++;
            c5 = c6;
        }
        return sb.toString();
    }

    public void addFirst(Character ch) {
        addFirst(ch.toString());
    }

    public void advance() {
        if (isEmpty()) {
            return;
        }
        this.pos++;
    }

    public String chompBalanced(char c5, char c6) {
        StringBuilder sb = new StringBuilder();
        char c7 = 0;
        int i4 = 0;
        while (!isEmpty()) {
            Character valueOf = Character.valueOf(consume());
            if (c7 == 0 || c7 != '\\') {
                if (valueOf.equals(Character.valueOf(c5))) {
                    i4++;
                } else if (valueOf.equals(Character.valueOf(c6))) {
                    i4--;
                }
            }
            if (i4 > 0 && c7 != 0) {
                sb.append(valueOf);
            }
            c7 = valueOf.charValue();
            if (i4 <= 0) {
                break;
            }
        }
        return sb.toString();
    }

    public String chompTo(String str) {
        String consumeTo = consumeTo(str);
        matchChomp(str);
        return consumeTo;
    }

    public String chompToIgnoreCase(String str) {
        String consumeToIgnoreCase = consumeToIgnoreCase(str);
        matchChomp(str);
        return consumeToIgnoreCase;
    }

    public char consume() {
        String str = this.queue;
        int i4 = this.pos;
        this.pos = i4 + 1;
        return str.charAt(i4);
    }

    public String consumeAttributeKey() {
        int i4 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny('-', '_', ':'))) {
            this.pos++;
        }
        return this.queue.substring(i4, this.pos);
    }

    public String consumeCssIdentifier() {
        int i4 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny('-', '_'))) {
            this.pos++;
        }
        return this.queue.substring(i4, this.pos);
    }

    public String consumeElementSelector() {
        int i4 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny('|', '_', '-'))) {
            this.pos++;
        }
        return this.queue.substring(i4, this.pos);
    }

    public String consumeTagName() {
        int i4 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny(':', '_', '-'))) {
            this.pos++;
        }
        return this.queue.substring(i4, this.pos);
    }

    public String consumeTo(String str) {
        int indexOf = this.queue.indexOf(str, this.pos);
        if (indexOf != -1) {
            String substring = this.queue.substring(this.pos, indexOf);
            this.pos += substring.length();
            return substring;
        }
        return remainder();
    }

    public String consumeToAny(String... strArr) {
        int i4 = this.pos;
        while (!isEmpty() && !matchesAny(strArr)) {
            this.pos++;
        }
        return this.queue.substring(i4, this.pos);
    }

    public String consumeToIgnoreCase(String str) {
        int i4 = this.pos;
        String substring = str.substring(0, 1);
        boolean equals = substring.toLowerCase().equals(substring.toUpperCase());
        while (!isEmpty() && !matches(str)) {
            if (equals) {
                int indexOf = this.queue.indexOf(substring, this.pos);
                int i5 = this.pos;
                int i6 = indexOf - i5;
                if (i6 == 0) {
                    this.pos = i5 + 1;
                } else if (i6 < 0) {
                    this.pos = this.queue.length();
                } else {
                    this.pos = i5 + i6;
                }
            } else {
                this.pos++;
            }
        }
        return this.queue.substring(i4, this.pos);
    }

    public boolean consumeWhitespace() {
        boolean z4 = false;
        while (matchesWhitespace()) {
            this.pos++;
            z4 = true;
        }
        return z4;
    }

    public String consumeWord() {
        int i4 = this.pos;
        while (matchesWord()) {
            this.pos++;
        }
        return this.queue.substring(i4, this.pos);
    }

    public boolean isEmpty() {
        return remainingLength() == 0;
    }

    public boolean matchChomp(String str) {
        if (matches(str)) {
            this.pos += str.length();
            return true;
        }
        return false;
    }

    public boolean matches(String str) {
        return this.queue.regionMatches(true, this.pos, str, 0, str.length());
    }

    public boolean matchesAny(String... strArr) {
        for (String str : strArr) {
            if (matches(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesCS(String str) {
        return this.queue.startsWith(str, this.pos);
    }

    public boolean matchesStartTag() {
        return remainingLength() >= 2 && this.queue.charAt(this.pos) == '<' && Character.isLetter(this.queue.charAt(this.pos + 1));
    }

    public boolean matchesWhitespace() {
        return !isEmpty() && StringUtil.isWhitespace(this.queue.charAt(this.pos));
    }

    public boolean matchesWord() {
        return !isEmpty() && Character.isLetterOrDigit(this.queue.charAt(this.pos));
    }

    public char peek() {
        if (isEmpty()) {
            return (char) 0;
        }
        return this.queue.charAt(this.pos);
    }

    public String remainder() {
        StringBuilder sb = new StringBuilder();
        while (!isEmpty()) {
            sb.append(consume());
        }
        return sb.toString();
    }

    public String toString() {
        return this.queue.substring(this.pos);
    }

    public void addFirst(String str) {
        this.queue = str + this.queue.substring(this.pos);
        this.pos = 0;
    }

    public void consume(String str) {
        if (matches(str)) {
            int length = str.length();
            if (length <= remainingLength()) {
                this.pos += length;
                return;
            }
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        throw new IllegalStateException("Queue did not match expected sequence");
    }

    public boolean matchesAny(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        for (char c5 : cArr) {
            if (this.queue.charAt(this.pos) == c5) {
                return true;
            }
        }
        return false;
    }
}
