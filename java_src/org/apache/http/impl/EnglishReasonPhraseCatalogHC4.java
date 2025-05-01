package org.apache.http.impl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.common.statfs.StatFsHelper;
import java.util.Locale;
import org.apache.http.ReasonPhraseCatalog;
import org.apache.http.annotation.Immutable;
import org.apache.http.util.Args;
@Immutable
/* loaded from: classes7.dex */
public class EnglishReasonPhraseCatalogHC4 implements ReasonPhraseCatalog {
    public static final EnglishReasonPhraseCatalogHC4 INSTANCE = new EnglishReasonPhraseCatalogHC4();
    private static final String[][] REASON_PHRASES = {null, new String[3], new String[8], new String[8], new String[25], new String[8]};

    static {
        setReason(200, "OK");
        setReason(201, "Created");
        setReason(202, "Accepted");
        setReason(204, "No Content");
        setReason(301, "Moved Permanently");
        setReason(302, "Moved Temporarily");
        setReason(304, "Not Modified");
        setReason(StatFsHelper.f10899h, "Bad Request");
        setReason(401, "Unauthorized");
        setReason(403, "Forbidden");
        setReason(404, "Not Found");
        setReason(500, "Internal Server Error");
        setReason(TypedValues.PositionType.TYPE_TRANSITION_EASING, "Not Implemented");
        setReason(TypedValues.PositionType.TYPE_DRAWPATH, "Bad Gateway");
        setReason(TypedValues.PositionType.TYPE_PERCENT_WIDTH, "Service Unavailable");
        setReason(100, "Continue");
        setReason(307, "Temporary Redirect");
        setReason(405, "Method Not Allowed");
        setReason(TTAdConstant.IMAGE_LIST_CODE, "Conflict");
        setReason(TTAdConstant.IMAGE_URL_CODE, "Precondition Failed");
        setReason(TTAdConstant.VIDEO_INFO_CODE, "Request Too Long");
        setReason(TTAdConstant.VIDEO_URL_CODE, "Request-URI Too Long");
        setReason(TTAdConstant.VIDEO_COVER_URL_CODE, "Unsupported Media Type");
        setReason(300, "Multiple Choices");
        setReason(303, "See Other");
        setReason(305, "Use Proxy");
        setReason(402, "Payment Required");
        setReason(406, "Not Acceptable");
        setReason(407, "Proxy Authentication Required");
        setReason(TTAdConstant.INTERACTION_TYPE_CODE, "Request Timeout");
        setReason(101, "Switching Protocols");
        setReason(203, "Non Authoritative Information");
        setReason(205, "Reset Content");
        setReason(206, "Partial Content");
        setReason(TypedValues.PositionType.TYPE_PERCENT_HEIGHT, "Gateway Timeout");
        setReason(TypedValues.PositionType.TYPE_SIZE_PERCENT, "Http Version Not Supported");
        setReason(TTAdConstant.IMAGE_LIST_SIZE_CODE, "Gone");
        setReason(TTAdConstant.IMAGE_CODE, "Length Required");
        setReason(416, "Requested Range Not Satisfiable");
        setReason(417, "Expectation Failed");
        setReason(102, "Processing");
        setReason(207, "Multi-Status");
        setReason(TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, "Unprocessable Entity");
        setReason(419, "Insufficient Space On Resource");
        setReason(TypedValues.CycleType.TYPE_EASING, "Method Failure");
        setReason(TypedValues.CycleType.TYPE_WAVE_PERIOD, "Locked");
        setReason(TypedValues.PositionType.TYPE_PERCENT_Y, "Insufficient Storage");
        setReason(TypedValues.CycleType.TYPE_WAVE_OFFSET, "Failed Dependency");
    }

    protected EnglishReasonPhraseCatalogHC4() {
    }

    private static void setReason(int i4, String str) {
        int i5 = i4 / 100;
        REASON_PHRASES[i5][i4 - (i5 * 100)] = str;
    }

    public String getReason(int i4, Locale locale) {
        boolean z4 = i4 >= 100 && i4 < 600;
        Args.check(z4, "Unknown category for status code " + i4);
        int i5 = i4 / 100;
        int i6 = i4 - (i5 * 100);
        String[][] strArr = REASON_PHRASES;
        if (strArr[i5].length > i6) {
            return strArr[i5][i6];
        }
        return null;
    }
}
