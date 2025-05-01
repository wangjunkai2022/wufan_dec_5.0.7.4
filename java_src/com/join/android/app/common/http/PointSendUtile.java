package com.join.android.app.common.http;

import com.join.mgps.Util.o0;
/* loaded from: classes3.dex */
public class PointSendUtile {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f14624b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f14625c;

        a(String str, String str2) {
            this.f14624b = str;
            this.f14625c = str2;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            o0.c(com.join.mgps.rpc.h.I + "/client/send", this.f14624b, this.f14625c);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|(2:2|3)|(2:5|6)|7|8|9|10|11|13|14|16|17|(1:19)(1:42)|20|21|22|23|24|25|(1:27)|28|(1:30)(1:35)|31|33|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(26:1|2|3|(2:5|6)|7|8|9|10|11|13|14|16|17|(1:19)(1:42)|20|21|22|23|24|25|(1:27)|28|(1:30)(1:35)|31|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        r3.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        r4.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        r5.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
        r6.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
        r7.printStackTrace();
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
        r11.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054 A[Catch: Exception -> 0x0062, TryCatch #8 {Exception -> 0x0062, blocks: (B:27:0x004c, B:29:0x0054, B:30:0x0057), top: B:72:0x004c, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057 A[Catch: Exception -> 0x0062, TRY_LEAVE, TryCatch #8 {Exception -> 0x0062, blocks: (B:27:0x004c, B:29:0x0054, B:30:0x0057), top: B:72:0x004c, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099 A[Catch: Exception -> 0x00e9, TryCatch #2 {Exception -> 0x00e9, blocks: (B:20:0x003c, B:25:0x0048, B:38:0x0075, B:39:0x0079, B:44:0x008c, B:47:0x0093, B:49:0x0099, B:51:0x009f, B:43:0x0089, B:33:0x0063, B:15:0x002a, B:10:0x001c, B:17:0x002e, B:12:0x0020, B:40:0x007b, B:22:0x0040, B:35:0x0067, B:27:0x004c, B:29:0x0054, B:30:0x0057), top: B:60:0x001c, inners: #0, #3, #4, #6, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void sendPoint(android.content.Context r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.http.PointSendUtile.sendPoint(android.content.Context, java.lang.String):void");
    }
}
