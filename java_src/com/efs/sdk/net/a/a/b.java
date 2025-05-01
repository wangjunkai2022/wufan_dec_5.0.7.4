package com.efs.sdk.net.a.a;

import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.net.a.a.f;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    Map<String, Long> f10571a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(f.b bVar) {
        try {
            byte[] d5 = bVar.d();
            if (d5 != null) {
                return d5.length;
            }
            return 0L;
        } catch (IOException | OutOfMemoryError e5) {
            e5.printStackTrace();
            return 0L;
        }
    }

    public static InputStream a(String str, String str2, String str3, InputStream inputStream) {
        Log.i("NetTrace-Interceptor", "save interpret response stream");
        com.efs.sdk.net.a.c a5 = com.efs.sdk.net.a.a.a().a(str);
        a5.f10599i = str2;
        if (str2 != null) {
            if (str2.contains("text") || str2.contains("json")) {
                ByteArrayOutputStream a6 = a(inputStream, a5, str3);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a6.toByteArray());
                try {
                    a6.close();
                } catch (IOException e5) {
                    Log.e("NetTrace-Interceptor", "save interpret response stream, e is ".concat(String.valueOf(e5)));
                }
                return byteArrayInputStream;
            }
        }
        a5.f10600j = 0L;
        return inputStream;
    }

    private static ByteArrayOutputStream a(InputStream inputStream, com.efs.sdk.net.a.c cVar, String str) {
        BufferedReader bufferedReader;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e5) {
                Log.e("NetTrace-Interceptor", "parse and save body, e is ".concat(String.valueOf(e5)));
            }
        }
        byteArrayOutputStream.flush();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        if ("gzip".equals(str)) {
            bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(byteArrayInputStream)));
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream));
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            sb.append(readLine + '\n');
        }
        cVar.f10600j = sb.toString().getBytes().length;
        return byteArrayOutputStream;
    }
}
