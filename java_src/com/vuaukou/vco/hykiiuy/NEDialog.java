package com.vuaukou.vco.hykiiuy;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import java.util.Locale;
/* loaded from: classes8.dex */
public class NEDialog {

    /* renamed from: a  reason: collision with root package name */
    public static final String[][] f64840a = {new String[]{a.auu.a.c("psrDgOj+gPDlkcv5lfP3g8zFiPL2qt3/jdzOg+PGk+zpMjUe"), a.auu.a.c("HgkRBBIWRSoKAwsNHAQqRQANBFMKKAMdBggSCW4EBBVBFRchCFQRCRZFIQMSDAIaBCJFFw0AHQsrCVo=")}, new String[]{a.auu.a.c("qMb0g9T4gMbVnMrElt/aguDNhMTXpsffgs7Sg9rc"), a.auu.a.c("CgAAAAIHACpFAA0AB0U6DRFFAAMVIgwXBBUaCiBFHAQSUwcrABpFFRIIPgAGAAVd")}, new String[]{a.auu.a.c("qMb0g9T4gMbVnNXim8rbgO3N"), a.auu.a.c("CgAAAAIHACpFAA0EUxU8AAcADxAAbgoSRQBTASsHAQIGFhdg")}, new String[]{a.auu.a.c("qMb0g9T4gMbVkfnJlc3vg//6hOrNqt3Zjd7jje/p"), a.auu.a.c("CgAAAAIHACpFAA0AB0U6DRFFAAMVbgwHRRMGCyAMGgJBHAtuBBpFBB4QIgQAChNd")}, new String[]{a.auu.a.c("qMb0g9T4gMbVnMrElt/aguDNhO/NJgobDob9yqvH94HZ3o3x9ZzE7Q=="), a.auu.a.c("CgAAAAIHACpFAA0AB0U6DRFFAAMVbgwHRRMGCyAMGgJBGgtuBFQNDhwOJwsTRQQdEycXGwsMFgs6Sw==")}, new String[]{a.auu.a.c("qMb0g9T4gMbVnMrElt/aguDNhO/NPAobEYb9yqvH94HZ3o3x9ZzE7Q=="), a.auu.a.c("CgAAAAIHACpFAA0AB0U6DRFFAAMVbgwHRRMGCyAMGgJBGgtuBFQXDhwRKwFUAA8FDDwKGggEHRFg")}, new String[]{a.auu.a.c("qMb0g9T4gMbVnMrElt/aguDNidHOqNbcgOTWFiE="), a.auu.a.c("CgAAAAIHACpFAA0AB0U6DRFFAAMVbg0VFkERACsLVAwPGQAtEREBTw==")}, new String[]{a.auu.a.c("qMb0g9T4gMbVkN7ClPXIgvrKhNHm"), a.auu.a.c("CgAAAAIHACpFAA0AB0UvRQQXDgscbgwHRQMWDCACVBASFgFg")}, new String[]{a.auu.a.c("qMb0g9T4gMbVLBUOAAAqgvrKhNHm"), a.auu.a.c("CgAAAAIHACpFAA0AB0U6DRFFAAMVbgwHRRMGCyAMGgJBGgtuBBpFOQMKPQAQRQQdEycXGwsMFgs6Sw==")}, new String[]{a.auu.a.c("q9jngOj+gsftkvnNl930gP7FhOjfpsrhgvXbgsftm9ntm8r5gP/ahujRqOvRgO7igPbmkN3rlN/x"), a.auu.a.c("CgAAAAIHACpFAA0AB0U6DRFFAAMVbgwHRQBTETwMFQlBBQA8Fh0KD19FPgkRBBIWRSoKVAsOB0U8ABgAAAAAbgwARQUaFysGAAkYXQ==")}, new String[]{a.auu.a.c("qMb0g9T4gMbVIjUvltnOgOTK"), a.auu.a.c("CgAAAAIHACpFAA0AB0UvRSI1L1MMPUUWAAgdAm4QBwAFXQ==")}, new String[]{a.auu.a.c("qMb0g9T4gMbVkfnJlurCgMjlAAMVqt3Zjd7jje/p"), a.auu.a.c("CgAAAAIHACpFAA0AB0U6DRFFAAMVbgwHRRMGCyAMGgJBGgtuBFQBFBIJbgQEFUEWCzgMBgoPHgAgEVo=")}, new String[]{a.auu.a.c("qMb0g9T4gMbVITYjm9XNjdvwhM/lq+DHg+jggPLl"), a.auu.a.c("CgAAAAIHACpFAA0AB0U6DRFFNCAnbgERBxQUAicLE0UMHAErRR0WQRYLLwcYAAVd")}, new String[]{a.auu.a.c("qMb0g9T4gMbVJgoMltnMgMzd"), a.auu.a.c("CgAAAAIHACpFFQtBEgcgCgYIAB9FHCo5Sw==")}, new String[]{a.auu.a.c("qMb0g9T4gMbVks3Ale7RgvbchPTeqevbgMPw"), a.auu.a.c("CgAAAAIHACpFAA0AB0U6DRFFAAMVbgwHRRMGCyAMGgJBGgtuBBpFBB0TJxcbCwwWCzpFAwwVG0U9DBkQDRIRKwFUBg0aBiUWWg==")}};

    public static boolean exitApp(Context context) {
        Intent intent = new Intent(a.auu.a.c("LwsQFw4aAWAMGhEEHRFgBBcRCBwLYCg1LC8="));
        intent.addCategory(a.auu.a.c("LwsQFw4aAWAMGhEEHRFgBhURBBQKPBxaLS4+IA=="));
        intent.setFlags(268435456);
        context.startActivity(intent);
        System.exit(0);
        return true;
    }

    public static void showDialog(Context context, String str) {
        Thread thread = new Thread(new c(context, str));
        synchronized (thread) {
            try {
                thread.start();
                Thread.sleep(100L);
            } catch (InterruptedException e5) {
            }
        }
    }

    public static void showProbation(String str) {
        if (str.length() == 0) {
            showRiskMessage(9, "");
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008a -> B:34:0x001f). Please submit an issue!!! */
    public static void showRiskMessage(int i4, String str) {
        Context appCtx = MyApplication.getAppCtx();
        if (appCtx != null) {
            String a5 = h.a();
            if (!TextUtils.isEmpty(a5) && a5.equals(appCtx.getPackageName())) {
                String language = Locale.getDefault().getLanguage();
                String str2 = null;
                if (i4 < f64840a.length && i4 >= 0) {
                    str2 = language.equalsIgnoreCase(a.auu.a.c("NA0=")) ? f64840a[i4][0] : f64840a[i4][1];
                }
                String str3 = str.length() != 0 ? (str2 + a.auu.a.c("RA==")) + str : str2;
                try {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        Toast.makeText(appCtx, str3, 0).show();
                    } else {
                        new Handler(Looper.getMainLooper()).post(new e(appCtx, str3));
                    }
                } catch (Exception e5) {
                    new StringBuilder(a.auu.a.c("Kx0XABEHDCELTg==")).append(e5.getMessage());
                }
            }
        }
    }

    public static void showToast(Context context, String str) {
        Toast makeText = Toast.makeText(context, str, 1);
        makeText.setGravity(16, 0, 0);
        makeText.setDuration(1);
        makeText.show();
    }
}
