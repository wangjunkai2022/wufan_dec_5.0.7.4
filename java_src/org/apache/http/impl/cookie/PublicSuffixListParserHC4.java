package org.apache.http.impl.cookie;

import com.join.mgps.Util.h0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import org.apache.http.annotation.Immutable;
@Immutable
/* loaded from: classes7.dex */
public class PublicSuffixListParserHC4 {
    private static final int MAX_LINE_LEN = 256;
    private final PublicSuffixFilterHC4 filter;

    PublicSuffixListParserHC4(PublicSuffixFilterHC4 publicSuffixFilterHC4) {
        this.filter = publicSuffixFilterHC4;
    }

    private boolean readLine(Reader reader, StringBuilder sb) throws IOException {
        char c5;
        sb.setLength(0);
        boolean z4 = false;
        do {
            int read = reader.read();
            if (read == -1 || (c5 = (char) read) == '\n') {
                return read != -1;
            }
            if (Character.isWhitespace(c5)) {
                z4 = true;
            }
            if (!z4) {
                sb.append(c5);
            }
        } while (sb.length() <= 256);
        throw new IOException("Line too long");
    }

    public void parse(Reader reader) throws IOException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder(256);
        boolean z4 = true;
        while (z4) {
            z4 = readLine(bufferedReader, sb);
            String sb2 = sb.toString();
            if (sb2.length() != 0 && !sb2.startsWith("//")) {
                if (sb2.startsWith(h0.f27805a)) {
                    sb2 = sb2.substring(1);
                }
                boolean startsWith = sb2.startsWith("!");
                if (startsWith) {
                    sb2 = sb2.substring(1);
                }
                if (startsWith) {
                    arrayList2.add(sb2);
                } else {
                    arrayList.add(sb2);
                }
            }
        }
        this.filter.setPublicSuffixes(arrayList);
        this.filter.setExceptions(arrayList2);
    }
}
