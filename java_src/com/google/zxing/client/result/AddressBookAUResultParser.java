package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public final class AddressBookAUResultParser extends ResultParser {
    private static String[] matchMultipleValuePrefix(String str, int i4, String str2, boolean z4) {
        ArrayList arrayList = null;
        for (int i5 = 1; i5 <= i4; i5++) {
            String matchSinglePrefixedField = ResultParser.matchSinglePrefixedField(str + i5 + ':', str2, '\r', z4);
            if (matchSinglePrefixedField == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(i4);
            }
            arrayList.add(matchSinglePrefixedField);
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String text = result.getText();
        if (text.contains("MEMORY") && text.contains("\r\n")) {
            String matchSinglePrefixedField = ResultParser.matchSinglePrefixedField("NAME1:", text, '\r', true);
            String matchSinglePrefixedField2 = ResultParser.matchSinglePrefixedField("NAME2:", text, '\r', true);
            String[] matchMultipleValuePrefix = matchMultipleValuePrefix("TEL", 3, text, true);
            String[] matchMultipleValuePrefix2 = matchMultipleValuePrefix("MAIL", 3, text, true);
            String matchSinglePrefixedField3 = ResultParser.matchSinglePrefixedField("MEMORY:", text, '\r', false);
            String matchSinglePrefixedField4 = ResultParser.matchSinglePrefixedField("ADD:", text, '\r', true);
            return new AddressBookParsedResult(ResultParser.maybeWrap(matchSinglePrefixedField), matchSinglePrefixedField2, matchMultipleValuePrefix, null, matchMultipleValuePrefix2, null, null, matchSinglePrefixedField3, matchSinglePrefixedField4 != null ? new String[]{matchSinglePrefixedField4} : null, null, null, null, null, null);
        }
        return null;
    }
}
