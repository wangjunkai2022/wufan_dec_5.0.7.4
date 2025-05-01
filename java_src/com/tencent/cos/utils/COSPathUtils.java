package com.tencent.cos.utils;

import android.text.TextUtils;
import com.tencent.cos.exception.COSClientException;
import java.net.URLEncoder;
/* loaded from: classes6.dex */
public class COSPathUtils {
    private static final String PATH_DELIMITER = "/";
    private static String TAG = "com.tencent.cos.utils.COSPathUtils";

    public static String encodeRemotePath(String str) throws COSClientException {
        String[] split;
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split("/")) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    sb.append("/");
                    sb.append(URLEncoder.encode(str2, "utf-8").replace("+", "%20"));
                } catch (Exception e5) {
                    QLog.e(TAG, e5.getMessage(), e5.getCause());
                    throw new COSClientException(e5.getMessage());
                }
            }
        }
        if (str.endsWith("/")) {
            sb.append("/");
        }
        return sb.toString();
    }
}
