package org.jsoup.parser;

import java.util.Locale;
import org.jsoup.helper.Validate;
/* loaded from: classes7.dex */
class CharacterReader {
    static final char EOF = 65535;
    private final char[] input;
    private final int length;
    private int pos = 0;
    private int mark = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharacterReader(String str) {
        Validate.notNull(str);
        char[] charArray = str.toCharArray();
        this.input = charArray;
        this.length = charArray.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void advance() {
        this.pos++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public char consume() {
        char c5 = isEmpty() ? (char) 65535 : this.input[this.pos];
        this.pos++;
        return c5;
    }

    String consumeAsString() {
        char[] cArr = this.input;
        int i4 = this.pos;
        this.pos = i4 + 1;
        return new String(cArr, i4, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String consumeDigitSequence() {
        int i4;
        char c5;
        int i5 = this.pos;
        while (true) {
            i4 = this.pos;
            if (i4 >= this.length || (c5 = this.input[i4]) < '0' || c5 > '9') {
                break;
            }
            this.pos = i4 + 1;
        }
        return new String(this.input, i5, i4 - i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String consumeHexSequence() {
        int i4;
        char c5;
        int i5 = this.pos;
        while (true) {
            i4 = this.pos;
            if (i4 >= this.length || (((c5 = this.input[i4]) < '0' || c5 > '9') && ((c5 < 'A' || c5 > 'F') && (c5 < 'a' || c5 > 'f')))) {
                break;
            }
            this.pos = i4 + 1;
        }
        return new String(this.input, i5, i4 - i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String consumeLetterSequence() {
        int i4;
        char c5;
        int i5 = this.pos;
        while (true) {
            i4 = this.pos;
            if (i4 >= this.length || (((c5 = this.input[i4]) < 'A' || c5 > 'Z') && (c5 < 'a' || c5 > 'z'))) {
                break;
            }
            this.pos = i4 + 1;
        }
        return new String(this.input, i5, i4 - i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String consumeLetterThenDigitSequence() {
        char c5;
        int i4 = this.pos;
        while (true) {
            int i5 = this.pos;
            if (i5 >= this.length || (((c5 = this.input[i5]) < 'A' || c5 > 'Z') && (c5 < 'a' || c5 > 'z'))) {
                break;
            }
            this.pos = i5 + 1;
        }
        while (!isEmpty()) {
            char[] cArr = this.input;
            int i6 = this.pos;
            char c6 = cArr[i6];
            if (c6 < '0' || c6 > '9') {
                break;
            }
            this.pos = i6 + 1;
        }
        return new String(this.input, i4, this.pos - i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String consumeTo(char c5) {
        int nextIndexOf = nextIndexOf(c5);
        if (nextIndexOf != -1) {
            String str = new String(this.input, this.pos, nextIndexOf);
            this.pos += nextIndexOf;
            return str;
        }
        return consumeToEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String consumeToAny(char... cArr) {
        int i4 = this.pos;
        loop0: while (this.pos < this.length) {
            for (char c5 : cArr) {
                if (this.input[this.pos] == c5) {
                    break loop0;
                }
            }
            this.pos++;
        }
        int i5 = this.pos;
        return i5 > i4 ? new String(this.input, i4, i5 - i4) : "";
    }

    String consumeToEnd() {
        char[] cArr = this.input;
        int i4 = this.pos;
        String str = new String(cArr, i4, this.length - i4);
        this.pos = this.length;
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean containsIgnoreCase(String str) {
        Locale locale = Locale.ENGLISH;
        return nextIndexOf(str.toLowerCase(locale)) > -1 || nextIndexOf(str.toUpperCase(locale)) > -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public char current() {
        if (isEmpty()) {
            return (char) 65535;
        }
        return this.input[this.pos];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isEmpty() {
        return this.pos >= this.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void mark() {
        this.mark = this.pos;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean matchConsume(String str) {
        if (matches(str)) {
            this.pos += str.length();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean matchConsumeIgnoreCase(String str) {
        if (matchesIgnoreCase(str)) {
            this.pos += str.length();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean matches(char c5) {
        return !isEmpty() && this.input[this.pos] == c5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean matchesAny(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        char c5 = this.input[this.pos];
        for (char c6 : cArr) {
            if (c6 == c5) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean matchesDigit() {
        char c5;
        return !isEmpty() && (c5 = this.input[this.pos]) >= '0' && c5 <= '9';
    }

    boolean matchesIgnoreCase(String str) {
        int length = str.length();
        if (length > this.length - this.pos) {
            return false;
        }
        for (int i4 = 0; i4 < length; i4++) {
            if (Character.toUpperCase(str.charAt(i4)) != Character.toUpperCase(this.input[this.pos + i4])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean matchesLetter() {
        if (isEmpty()) {
            return false;
        }
        char c5 = this.input[this.pos];
        return (c5 >= 'A' && c5 <= 'Z') || (c5 >= 'a' && c5 <= 'z');
    }

    int nextIndexOf(char c5) {
        for (int i4 = this.pos; i4 < this.length; i4++) {
            if (c5 == this.input[i4]) {
                return i4 - this.pos;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int pos() {
        return this.pos;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void rewindToMark() {
        this.pos = this.mark;
    }

    public String toString() {
        char[] cArr = this.input;
        int i4 = this.pos;
        return new String(cArr, i4, this.length - i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void unconsume() {
        this.pos--;
    }

    boolean matches(String str) {
        int length = str.length();
        if (length > this.length - this.pos) {
            return false;
        }
        for (int i4 = 0; i4 < length; i4++) {
            if (str.charAt(i4) != this.input[this.pos + i4]) {
                return false;
            }
        }
        return true;
    }

    int nextIndexOf(CharSequence charSequence) {
        char charAt = charSequence.charAt(0);
        int i4 = this.pos;
        while (i4 < this.length) {
            if (charAt != this.input[i4]) {
                do {
                    i4++;
                    if (i4 >= this.length) {
                        break;
                    }
                } while (charAt != this.input[i4]);
            }
            if (i4 < this.length) {
                int i5 = i4 + 1;
                int length = (charSequence.length() + i5) - 1;
                for (int i6 = 1; i5 < length && charSequence.charAt(i6) == this.input[i5]; i6++) {
                    i5++;
                }
                if (i5 == length) {
                    return i4 - this.pos;
                }
            }
            i4++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String consumeTo(String str) {
        int nextIndexOf = nextIndexOf(str);
        if (nextIndexOf != -1) {
            String str2 = new String(this.input, this.pos, nextIndexOf);
            this.pos += nextIndexOf;
            return str2;
        }
        return consumeToEnd();
    }
}
