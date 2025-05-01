package com.google.zxing.client.result;

import io.netty.util.internal.StringUtil;
import kotlin.text.Typography;
/* loaded from: classes3.dex */
public final class SMSParsedResult extends ParsedResult {
    private final String body;
    private final String[] numbers;
    private final String subject;
    private final String[] vias;

    public SMSParsedResult(String str, String str2, String str3, String str4) {
        super(ParsedResultType.SMS);
        this.numbers = new String[]{str};
        this.vias = new String[]{str2};
        this.subject = str3;
        this.body = str4;
    }

    public String getBody() {
        return this.body;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(100);
        ParsedResult.maybeAppend(this.numbers, sb);
        ParsedResult.maybeAppend(this.subject, sb);
        ParsedResult.maybeAppend(this.body, sb);
        return sb.toString();
    }

    public String[] getNumbers() {
        return this.numbers;
    }

    public String getSMSURI() {
        StringBuilder sb = new StringBuilder();
        sb.append("sms:");
        boolean z4 = true;
        for (int i4 = 0; i4 < this.numbers.length; i4++) {
            if (z4) {
                z4 = false;
            } else {
                sb.append(StringUtil.COMMA);
            }
            sb.append(this.numbers[i4]);
            String[] strArr = this.vias;
            if (strArr != null && strArr[i4] != null) {
                sb.append(";via=");
                sb.append(this.vias[i4]);
            }
        }
        boolean z5 = this.body != null;
        boolean z6 = this.subject != null;
        if (z5 || z6) {
            sb.append('?');
            if (z5) {
                sb.append("body=");
                sb.append(this.body);
            }
            if (z6) {
                if (z5) {
                    sb.append(Typography.amp);
                }
                sb.append("subject=");
                sb.append(this.subject);
            }
        }
        return sb.toString();
    }

    public String getSubject() {
        return this.subject;
    }

    public String[] getVias() {
        return this.vias;
    }

    public SMSParsedResult(String[] strArr, String[] strArr2, String str, String str2) {
        super(ParsedResultType.SMS);
        this.numbers = strArr;
        this.vias = strArr2;
        this.subject = str;
        this.body = str2;
    }
}
