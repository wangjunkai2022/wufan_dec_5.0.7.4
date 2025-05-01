package com.github.snowdream.android.app.downloader;

import android.os.Process;
import com.MApplication;
import com.coremedia.iso.boxes.u;
import com.join.android.app.common.utils.o;
import com.join.mgps.Util.v;
import com.join.mgps.dto.GameMD5ResultInfo;
import com.join.mgps.dto.GameMd5Data;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.event.l;
import com.join.mgps.rpc.impl.i;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
/* compiled from: AsycDownloadTaskRunner.java */
/* loaded from: classes3.dex */
public class a extends Thread {
    private static final int A = 1;
    private static final int B = 2;

    /* renamed from: c  reason: collision with root package name */
    private String f13036c;

    /* renamed from: d  reason: collision with root package name */
    private String f13037d;

    /* renamed from: e  reason: collision with root package name */
    private DownloadTask f13038e;

    /* renamed from: q  reason: collision with root package name */
    File f13050q;

    /* renamed from: r  reason: collision with root package name */
    File f13051r;

    /* renamed from: s  reason: collision with root package name */
    long f13052s;

    /* renamed from: t  reason: collision with root package name */
    long f13053t;

    /* renamed from: u  reason: collision with root package name */
    long f13054u;

    /* renamed from: v  reason: collision with root package name */
    long f13055v;

    /* renamed from: z  reason: collision with root package name */
    private static final String f13034z = a.class.getSimpleName();
    private static String C = v.f28107g;

    /* renamed from: b  reason: collision with root package name */
    private long f13035b = -1;

    /* renamed from: f  reason: collision with root package name */
    boolean f13039f = false;

    /* renamed from: g  reason: collision with root package name */
    boolean f13040g = false;

    /* renamed from: h  reason: collision with root package name */
    boolean f13041h = false;

    /* renamed from: i  reason: collision with root package name */
    InputStream f13042i = null;

    /* renamed from: j  reason: collision with root package name */
    RandomAccessFile f13043j = null;

    /* renamed from: k  reason: collision with root package name */
    InputStream f13044k = null;

    /* renamed from: l  reason: collision with root package name */
    RandomAccessFile f13045l = null;

    /* renamed from: m  reason: collision with root package name */
    HttpURLConnection f13046m = null;

    /* renamed from: n  reason: collision with root package name */
    HttpURLConnection f13047n = null;

    /* renamed from: o  reason: collision with root package name */
    HttpURLConnection f13048o = null;

    /* renamed from: p  reason: collision with root package name */
    HttpURLConnection f13049p = null;

    /* renamed from: w  reason: collision with root package name */
    String f13056w = "";

    /* renamed from: x  reason: collision with root package name */
    boolean f13057x = false;

    /* renamed from: y  reason: collision with root package name */
    boolean f13058y = false;

    public a(String str, String str2, DownloadTask downloadTask) {
        this.f13036c = str;
        this.f13037d = str2;
        this.f13038e = downloadTask;
    }

    private void a() {
        this.f13038e.setSpeed("0");
        if (this.f13035b == -1) {
            org.greenrobot.eventbus.c.f().o(new l(this.f13037d, 32));
            return;
        }
        if (this.f13040g) {
            p(this.f13038e, System.currentTimeMillis() - this.f13035b, 2);
        } else {
            o(this.f13038e, System.currentTimeMillis() - this.f13035b);
        }
        org.greenrobot.eventbus.c.f().o(new l(this.f13037d, 32));
    }

    private void b(DownloadTask downloadTask, long j4, int i4) {
        downloadTask.setDuration(downloadTask.getDuration() + j4);
        downloadTask.setInterrupt(i4);
        if (downloadTask.getStatus() == 5) {
            downloadTask.setProgress(100L);
        }
        try {
            p1.f.K().update(downloadTask);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void c() {
        try {
            InputStream inputStream = this.f13044k;
            if (inputStream != null) {
                inputStream.close();
                this.f13044k = null;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        RandomAccessFile randomAccessFile = this.f13045l;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.f13045l = null;
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
        HttpURLConnection httpURLConnection = this.f13048o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
                this.f13048o = null;
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    private void d() {
        try {
            InputStream inputStream = this.f13042i;
            if (inputStream != null) {
                inputStream.close();
                this.f13042i = null;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        RandomAccessFile randomAccessFile = this.f13043j;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.f13043j = null;
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
        HttpURLConnection httpURLConnection = this.f13049p;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
                this.f13049p = null;
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    private long g(HttpURLConnection httpURLConnection) {
        int i4 = 0;
        while (true) {
            String headerFieldKey = httpURLConnection.getHeaderFieldKey(i4);
            if (headerFieldKey == null) {
                return 0L;
            }
            if (headerFieldKey.equals("Content-Length")) {
                return Long.parseLong(httpURLConnection.getHeaderField(i4));
            }
            i4++;
        }
    }

    private String k(GameMd5Data gameMd5Data) {
        try {
            RequestModel<GameMd5Data> requestModel = new RequestModel<>();
            requestModel.setDefault(MApplication.f1497x);
            requestModel.setArgs(gameMd5Data);
            ResponseModel<GameMD5ResultInfo> body = i.D0().B0().C1(requestModel).execute().body();
            return (body == null || body.getData() == null || body.getData().getInfo() == null) ? u.f9954p : body.getData().getInfo().getState();
        } catch (IOException e5) {
            e5.printStackTrace();
            return u.f9954p;
        }
    }

    private boolean l(DownloadTask downloadTask) {
        if (downloadTask.getStatus() != 7) {
            return downloadTask.getStatus() == 40;
        }
        org.greenrobot.eventbus.c.f().o(new l(this.f13037d, 34));
        return true;
    }

    private boolean m(DownloadTask downloadTask) {
        if (downloadTask.getStatus() == 27) {
            org.greenrobot.eventbus.c.f().o(new l(this.f13037d, 35));
            return true;
        } else if (downloadTask.getMobleNetNeedStop() == 1) {
            a();
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:5|6|(22:8|(3:258|259|(1:261)(20:262|11|12|(1:14)|15|16|(3:247|248|(13:253|254|42|43|(7:48|49|50|(1:107)(1:54)|55|56|(16:58|(1:103)(2:62|63)|102|65|(2:86|87)|67|68|69|(1:71)|72|(1:74)|75|(4:77|78|79|80)|81|82|80))|108|(9:110|(1:112)(1:212)|113|(3:115|(2:117|(2:120|121)(1:119))|210)|211|122|(5:124|(1:126)|127|(3:135|136|(10:138|139|140|141|142|(1:144)|145|(1:147)|148|(2:150|152)(1:154)))|162)(2:169|(2:175|(5:177|(1:179)|180|(9:191|192|193|194|(1:196)|197|(1:199)|200|(2:202|204)(1:205))|209)))|163|164)(2:213|214)|50|(1:52)|107|55|56|(0)))|18|(6:20|(1:22)(1:244)|23|(5:25|(1:27)|28|(1:221)(2:32|(1:220)(2:36|(1:38)))|39)(2:222|(2:228|(4:230|(1:232)|233|(1:243))))|40|41)(2:245|246)|42|43|(9:45|48|49|50|(0)|107|55|56|(0))|108|(0)(0)|50|(0)|107|55|56|(0)))|10|11|12|(0)|15|16|(0)|18|(0)(0)|42|43|(0)|108|(0)(0)|50|(0)|107|55|56|(0))(1:266)|104|68|69|(0)|72|(0)|75|(0)|81|82|80) */
    /* JADX WARN: Can't wrap try/catch for region: R(22:8|(3:258|259|(1:261)(20:262|11|12|(1:14)|15|16|(3:247|248|(13:253|254|42|43|(7:48|49|50|(1:107)(1:54)|55|56|(16:58|(1:103)(2:62|63)|102|65|(2:86|87)|67|68|69|(1:71)|72|(1:74)|75|(4:77|78|79|80)|81|82|80))|108|(9:110|(1:112)(1:212)|113|(3:115|(2:117|(2:120|121)(1:119))|210)|211|122|(5:124|(1:126)|127|(3:135|136|(10:138|139|140|141|142|(1:144)|145|(1:147)|148|(2:150|152)(1:154)))|162)(2:169|(2:175|(5:177|(1:179)|180|(9:191|192|193|194|(1:196)|197|(1:199)|200|(2:202|204)(1:205))|209)))|163|164)(2:213|214)|50|(1:52)|107|55|56|(0)))|18|(6:20|(1:22)(1:244)|23|(5:25|(1:27)|28|(1:221)(2:32|(1:220)(2:36|(1:38)))|39)(2:222|(2:228|(4:230|(1:232)|233|(1:243))))|40|41)(2:245|246)|42|43|(9:45|48|49|50|(0)|107|55|56|(0))|108|(0)(0)|50|(0)|107|55|56|(0)))|10|11|12|(0)|15|16|(0)|18|(0)(0)|42|43|(0)|108|(0)(0)|50|(0)|107|55|56|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x05ec, code lost:
        if (r19.f13038e.getTask_down_type() == 3) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0602, code lost:
        if (r19.f13038e.getTask_down_type() == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x060a, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0641, code lost:
        r3.disconnect();
        r19.f13047n = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x064b, code lost:
        r3.disconnect();
        r19.f13046m = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0655, code lost:
        java.lang.Thread.sleep(1200);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02c1 A[Catch: Exception -> 0x00fa, all -> 0x062f, TRY_ENTER, TryCatch #6 {all -> 0x062f, blocks: (B:6:0x000b, B:8:0x0023, B:10:0x004d, B:13:0x0056, B:19:0x009d, B:23:0x00a6, B:26:0x00dd, B:28:0x00e5, B:31:0x00ef, B:90:0x029c, B:93:0x02a5, B:96:0x02ae, B:195:0x051e, B:197:0x0542, B:201:0x0549, B:203:0x054d, B:205:0x05dc, B:207:0x05e5, B:213:0x05f3, B:215:0x05fb, B:217:0x0604, B:212:0x05f0, B:241:0x0637, B:98:0x02b5, B:100:0x02c1, B:102:0x02c9, B:104:0x02d6, B:106:0x0312, B:108:0x031c, B:110:0x032a, B:113:0x033d, B:115:0x034c, B:118:0x0359, B:120:0x0363, B:122:0x0369, B:124:0x036f, B:126:0x0375, B:130:0x0387, B:135:0x0392, B:134:0x038f, B:149:0x03b9, B:187:0x050d, B:191:0x0515, B:156:0x0414, B:158:0x045e, B:161:0x046b, B:163:0x0475, B:165:0x047b, B:167:0x0481, B:169:0x0487, B:172:0x0499, B:186:0x04c0, B:111:0x0335, B:103:0x02d2, B:194:0x051c, B:35:0x00fe, B:37:0x010a, B:39:0x0112, B:41:0x0121, B:43:0x0182, B:46:0x018f, B:48:0x0199, B:50:0x019f, B:52:0x01a7, B:54:0x01ad, B:59:0x01ce, B:82:0x0287, B:86:0x028f, B:66:0x01f2, B:68:0x023c, B:71:0x024a, B:73:0x0254, B:75:0x025a, B:77:0x0260, B:79:0x0266, B:81:0x0277, B:89:0x029a, B:18:0x0064), top: B:284:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0542 A[Catch: Exception -> 0x00fa, all -> 0x062f, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x062f, blocks: (B:6:0x000b, B:8:0x0023, B:10:0x004d, B:13:0x0056, B:19:0x009d, B:23:0x00a6, B:26:0x00dd, B:28:0x00e5, B:31:0x00ef, B:90:0x029c, B:93:0x02a5, B:96:0x02ae, B:195:0x051e, B:197:0x0542, B:201:0x0549, B:203:0x054d, B:205:0x05dc, B:207:0x05e5, B:213:0x05f3, B:215:0x05fb, B:217:0x0604, B:212:0x05f0, B:241:0x0637, B:98:0x02b5, B:100:0x02c1, B:102:0x02c9, B:104:0x02d6, B:106:0x0312, B:108:0x031c, B:110:0x032a, B:113:0x033d, B:115:0x034c, B:118:0x0359, B:120:0x0363, B:122:0x0369, B:124:0x036f, B:126:0x0375, B:130:0x0387, B:135:0x0392, B:134:0x038f, B:149:0x03b9, B:187:0x050d, B:191:0x0515, B:156:0x0414, B:158:0x045e, B:161:0x046b, B:163:0x0475, B:165:0x047b, B:167:0x0481, B:169:0x0487, B:172:0x0499, B:186:0x04c0, B:111:0x0335, B:103:0x02d2, B:194:0x051c, B:35:0x00fe, B:37:0x010a, B:39:0x0112, B:41:0x0121, B:43:0x0182, B:46:0x018f, B:48:0x0199, B:50:0x019f, B:52:0x01a7, B:54:0x01ad, B:59:0x01ce, B:82:0x0287, B:86:0x028f, B:66:0x01f2, B:68:0x023c, B:71:0x024a, B:73:0x0254, B:75:0x025a, B:77:0x0260, B:79:0x0266, B:81:0x0277, B:89:0x029a, B:18:0x0064), top: B:284:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x054d A[Catch: Exception -> 0x060a, all -> 0x062f, TryCatch #2 {Exception -> 0x060a, blocks: (B:90:0x029c, B:195:0x051e, B:201:0x0549, B:203:0x054d, B:205:0x05dc, B:207:0x05e5, B:98:0x02b5, B:194:0x051c, B:35:0x00fe, B:89:0x029a), top: B:278:0x0549 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0613 A[Catch: Exception -> 0x065b, TryCatch #8 {Exception -> 0x065b, blocks: (B:225:0x060f, B:227:0x0613, B:228:0x0619, B:230:0x061d, B:231:0x0623, B:233:0x0627, B:242:0x063d, B:244:0x0641, B:245:0x0647, B:247:0x064b, B:248:0x0651, B:250:0x0655), top: B:288:0x060f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x061d A[Catch: Exception -> 0x065b, TryCatch #8 {Exception -> 0x065b, blocks: (B:225:0x060f, B:227:0x0613, B:228:0x0619, B:230:0x061d, B:231:0x0623, B:233:0x0627, B:242:0x063d, B:244:0x0641, B:245:0x0647, B:247:0x064b, B:248:0x0651, B:250:0x0655), top: B:288:0x060f }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0627 A[Catch: Exception -> 0x065b, TRY_LEAVE, TryCatch #8 {Exception -> 0x065b, blocks: (B:225:0x060f, B:227:0x0613, B:228:0x0619, B:230:0x061d, B:231:0x0623, B:233:0x0627, B:242:0x063d, B:244:0x0641, B:245:0x0647, B:247:0x064b, B:248:0x0651, B:250:0x0655), top: B:288:0x060f }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0641 A[Catch: Exception -> 0x065b, TryCatch #8 {Exception -> 0x065b, blocks: (B:225:0x060f, B:227:0x0613, B:228:0x0619, B:230:0x061d, B:231:0x0623, B:233:0x0627, B:242:0x063d, B:244:0x0641, B:245:0x0647, B:247:0x064b, B:248:0x0651, B:250:0x0655), top: B:288:0x060f }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x064b A[Catch: Exception -> 0x065b, TryCatch #8 {Exception -> 0x065b, blocks: (B:225:0x060f, B:227:0x0613, B:228:0x0619, B:230:0x061d, B:231:0x0623, B:233:0x0627, B:242:0x063d, B:244:0x0641, B:245:0x0647, B:247:0x064b, B:248:0x0651, B:250:0x0655), top: B:288:0x060f }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0655 A[Catch: Exception -> 0x065b, TRY_LEAVE, TryCatch #8 {Exception -> 0x065b, blocks: (B:225:0x060f, B:227:0x0613, B:228:0x0619, B:230:0x061d, B:231:0x0623, B:233:0x0627, B:242:0x063d, B:244:0x0641, B:245:0x0647, B:247:0x064b, B:248:0x0651, B:250:0x0655), top: B:288:0x060f }] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010a A[Catch: Exception -> 0x00fa, all -> 0x062f, TRY_ENTER, TryCatch #6 {all -> 0x062f, blocks: (B:6:0x000b, B:8:0x0023, B:10:0x004d, B:13:0x0056, B:19:0x009d, B:23:0x00a6, B:26:0x00dd, B:28:0x00e5, B:31:0x00ef, B:90:0x029c, B:93:0x02a5, B:96:0x02ae, B:195:0x051e, B:197:0x0542, B:201:0x0549, B:203:0x054d, B:205:0x05dc, B:207:0x05e5, B:213:0x05f3, B:215:0x05fb, B:217:0x0604, B:212:0x05f0, B:241:0x0637, B:98:0x02b5, B:100:0x02c1, B:102:0x02c9, B:104:0x02d6, B:106:0x0312, B:108:0x031c, B:110:0x032a, B:113:0x033d, B:115:0x034c, B:118:0x0359, B:120:0x0363, B:122:0x0369, B:124:0x036f, B:126:0x0375, B:130:0x0387, B:135:0x0392, B:134:0x038f, B:149:0x03b9, B:187:0x050d, B:191:0x0515, B:156:0x0414, B:158:0x045e, B:161:0x046b, B:163:0x0475, B:165:0x047b, B:167:0x0481, B:169:0x0487, B:172:0x0499, B:186:0x04c0, B:111:0x0335, B:103:0x02d2, B:194:0x051c, B:35:0x00fe, B:37:0x010a, B:39:0x0112, B:41:0x0121, B:43:0x0182, B:46:0x018f, B:48:0x0199, B:50:0x019f, B:52:0x01a7, B:54:0x01ad, B:59:0x01ce, B:82:0x0287, B:86:0x028f, B:66:0x01f2, B:68:0x023c, B:71:0x024a, B:73:0x0254, B:75:0x025a, B:77:0x0260, B:79:0x0266, B:81:0x0277, B:89:0x029a, B:18:0x0064), top: B:284:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a5 A[Catch: Exception -> 0x00fa, all -> 0x062f, TRY_ENTER, TryCatch #6 {all -> 0x062f, blocks: (B:6:0x000b, B:8:0x0023, B:10:0x004d, B:13:0x0056, B:19:0x009d, B:23:0x00a6, B:26:0x00dd, B:28:0x00e5, B:31:0x00ef, B:90:0x029c, B:93:0x02a5, B:96:0x02ae, B:195:0x051e, B:197:0x0542, B:201:0x0549, B:203:0x054d, B:205:0x05dc, B:207:0x05e5, B:213:0x05f3, B:215:0x05fb, B:217:0x0604, B:212:0x05f0, B:241:0x0637, B:98:0x02b5, B:100:0x02c1, B:102:0x02c9, B:104:0x02d6, B:106:0x0312, B:108:0x031c, B:110:0x032a, B:113:0x033d, B:115:0x034c, B:118:0x0359, B:120:0x0363, B:122:0x0369, B:124:0x036f, B:126:0x0375, B:130:0x0387, B:135:0x0392, B:134:0x038f, B:149:0x03b9, B:187:0x050d, B:191:0x0515, B:156:0x0414, B:158:0x045e, B:161:0x046b, B:163:0x0475, B:165:0x047b, B:167:0x0481, B:169:0x0487, B:172:0x0499, B:186:0x04c0, B:111:0x0335, B:103:0x02d2, B:194:0x051c, B:35:0x00fe, B:37:0x010a, B:39:0x0112, B:41:0x0121, B:43:0x0182, B:46:0x018f, B:48:0x0199, B:50:0x019f, B:52:0x01a7, B:54:0x01ad, B:59:0x01ce, B:82:0x0287, B:86:0x028f, B:66:0x01f2, B:68:0x023c, B:71:0x024a, B:73:0x0254, B:75:0x025a, B:77:0x0260, B:79:0x0266, B:81:0x0277, B:89:0x029a, B:18:0x0064), top: B:284:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void n() {
        /*
            Method dump skipped, instructions count: 1685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.snowdream.android.app.downloader.a.n():void");
    }

    private void o(DownloadTask downloadTask, long j4) {
        downloadTask.setDuration(downloadTask.getDuration() + j4);
        if (downloadTask.getStatus() == 5) {
            downloadTask.setProgress(100L);
        }
        try {
            p1.f.K().update(downloadTask);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void p(DownloadTask downloadTask, long j4, int i4) {
        downloadTask.setDuration(downloadTask.getDuration() + j4);
        downloadTask.setInterrupt(i4);
        if (downloadTask.getStatus() == 5) {
            downloadTask.setProgress(100L);
        }
        try {
            p1.f.K().update(downloadTask);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:40|41|(5:371|372|373|374|375)(1:43)|44|45|46|(5:356|(1:358)|359|(3:363|(1:365)|366)|367)(1:50)|318|(0)|59|60|(0)|63|(0)|83|(0)|147|(0)|155|156|157|158|(0)(0)|280|281|282) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:194|(2:196|197)(4:244|245|246|(5:248|(4:250|251|29|30)|199|200|(2:225|(2:237|238)(2:227|(3:235|29|30)(1:232)))(4:204|205|(4:207|(1:209)(1:217)|210|(1:212))(4:218|(1:220)(1:224)|221|(1:223))|213)))|198|199|200|(1:202)|225|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0575, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0577, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0584, code lost:
        if (r0.getMessage().contains("EISDIR") != false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x058c, code lost:
        if (r25.f13050q.exists() != false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0596, code lost:
        com.join.mgps.Util.UtilsMy.delete(r25.f13050q);
        r25.f13052s = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x059f, code lost:
        r2 = new java.io.RandomAccessFile(r25.f13050q, net.lingala.zip4j.util.e.f71861e0);
        r25.f13045l = r2;
        r2.seek(r25.f13052s);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0713, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0a15, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0a1e, code lost:
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x031d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0354 A[Catch: Exception -> 0x0a1e, all -> 0x0a3d, TryCatch #9 {Exception -> 0x0a1e, blocks: (B:123:0x031f, B:126:0x0326, B:129:0x0348, B:131:0x0354, B:133:0x035c, B:135:0x0364, B:137:0x036c, B:146:0x0391, B:145:0x038e, B:149:0x0398, B:151:0x03a2, B:153:0x03aa, B:154:0x03b5, B:156:0x03bb, B:158:0x03c5, B:162:0x03da, B:164:0x03e6, B:166:0x03fd, B:168:0x0403, B:171:0x041b, B:173:0x0423, B:175:0x042b, B:176:0x0437, B:177:0x043c, B:170:0x040b, B:161:0x03d6, B:165:0x03ed, B:178:0x0442, B:180:0x0448, B:182:0x045a, B:185:0x0463, B:186:0x0483, B:201:0x04e1, B:203:0x04f6, B:205:0x051e, B:208:0x052f, B:210:0x053b, B:212:0x0541, B:215:0x0558, B:216:0x0564, B:228:0x05af, B:230:0x05fe, B:234:0x060a, B:236:0x0613, B:238:0x061b, B:239:0x061e, B:241:0x0635, B:244:0x063f, B:246:0x0666, B:248:0x0686, B:252:0x069c, B:254:0x06ba, B:256:0x06d6, B:259:0x06df, B:261:0x06e7, B:264:0x0714, B:266:0x0719, B:268:0x0722, B:270:0x0734, B:272:0x0763, B:285:0x07a6, B:278:0x0785, B:284:0x07a3, B:297:0x083a, B:296:0x0837, B:253:0x06b0, B:340:0x0a17, B:220:0x0577, B:222:0x0586, B:224:0x058e, B:226:0x0596, B:227:0x059f, B:99:0x02b6, B:108:0x02d0, B:110:0x02e5, B:113:0x02ef, B:115:0x02f7, B:117:0x0301, B:118:0x0306), top: B:386:0x0326 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a2 A[Catch: Exception -> 0x0a1e, all -> 0x0a3d, TryCatch #9 {Exception -> 0x0a1e, blocks: (B:123:0x031f, B:126:0x0326, B:129:0x0348, B:131:0x0354, B:133:0x035c, B:135:0x0364, B:137:0x036c, B:146:0x0391, B:145:0x038e, B:149:0x0398, B:151:0x03a2, B:153:0x03aa, B:154:0x03b5, B:156:0x03bb, B:158:0x03c5, B:162:0x03da, B:164:0x03e6, B:166:0x03fd, B:168:0x0403, B:171:0x041b, B:173:0x0423, B:175:0x042b, B:176:0x0437, B:177:0x043c, B:170:0x040b, B:161:0x03d6, B:165:0x03ed, B:178:0x0442, B:180:0x0448, B:182:0x045a, B:185:0x0463, B:186:0x0483, B:201:0x04e1, B:203:0x04f6, B:205:0x051e, B:208:0x052f, B:210:0x053b, B:212:0x0541, B:215:0x0558, B:216:0x0564, B:228:0x05af, B:230:0x05fe, B:234:0x060a, B:236:0x0613, B:238:0x061b, B:239:0x061e, B:241:0x0635, B:244:0x063f, B:246:0x0666, B:248:0x0686, B:252:0x069c, B:254:0x06ba, B:256:0x06d6, B:259:0x06df, B:261:0x06e7, B:264:0x0714, B:266:0x0719, B:268:0x0722, B:270:0x0734, B:272:0x0763, B:285:0x07a6, B:278:0x0785, B:284:0x07a3, B:297:0x083a, B:296:0x0837, B:253:0x06b0, B:340:0x0a17, B:220:0x0577, B:222:0x0586, B:224:0x058e, B:226:0x0596, B:227:0x059f, B:99:0x02b6, B:108:0x02d0, B:110:0x02e5, B:113:0x02ef, B:115:0x02f7, B:117:0x0301, B:118:0x0306), top: B:386:0x0326 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04cf A[Catch: Exception -> 0x04dc, all -> 0x0a3d, TryCatch #11 {Exception -> 0x04dc, blocks: (B:187:0x0499, B:189:0x04aa, B:191:0x04b0, B:194:0x04c7, B:196:0x04cf, B:197:0x04d4), top: B:389:0x0499 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x053b A[Catch: Exception -> 0x0a1e, all -> 0x0a3d, TryCatch #9 {Exception -> 0x0a1e, blocks: (B:123:0x031f, B:126:0x0326, B:129:0x0348, B:131:0x0354, B:133:0x035c, B:135:0x0364, B:137:0x036c, B:146:0x0391, B:145:0x038e, B:149:0x0398, B:151:0x03a2, B:153:0x03aa, B:154:0x03b5, B:156:0x03bb, B:158:0x03c5, B:162:0x03da, B:164:0x03e6, B:166:0x03fd, B:168:0x0403, B:171:0x041b, B:173:0x0423, B:175:0x042b, B:176:0x0437, B:177:0x043c, B:170:0x040b, B:161:0x03d6, B:165:0x03ed, B:178:0x0442, B:180:0x0448, B:182:0x045a, B:185:0x0463, B:186:0x0483, B:201:0x04e1, B:203:0x04f6, B:205:0x051e, B:208:0x052f, B:210:0x053b, B:212:0x0541, B:215:0x0558, B:216:0x0564, B:228:0x05af, B:230:0x05fe, B:234:0x060a, B:236:0x0613, B:238:0x061b, B:239:0x061e, B:241:0x0635, B:244:0x063f, B:246:0x0666, B:248:0x0686, B:252:0x069c, B:254:0x06ba, B:256:0x06d6, B:259:0x06df, B:261:0x06e7, B:264:0x0714, B:266:0x0719, B:268:0x0722, B:270:0x0734, B:272:0x0763, B:285:0x07a6, B:278:0x0785, B:284:0x07a3, B:297:0x083a, B:296:0x0837, B:253:0x06b0, B:340:0x0a17, B:220:0x0577, B:222:0x0586, B:224:0x058e, B:226:0x0596, B:227:0x059f, B:99:0x02b6, B:108:0x02d0, B:110:0x02e5, B:113:0x02ef, B:115:0x02f7, B:117:0x0301, B:118:0x0306), top: B:386:0x0326 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05fe A[Catch: Exception -> 0x0a1e, all -> 0x0a3d, TryCatch #9 {Exception -> 0x0a1e, blocks: (B:123:0x031f, B:126:0x0326, B:129:0x0348, B:131:0x0354, B:133:0x035c, B:135:0x0364, B:137:0x036c, B:146:0x0391, B:145:0x038e, B:149:0x0398, B:151:0x03a2, B:153:0x03aa, B:154:0x03b5, B:156:0x03bb, B:158:0x03c5, B:162:0x03da, B:164:0x03e6, B:166:0x03fd, B:168:0x0403, B:171:0x041b, B:173:0x0423, B:175:0x042b, B:176:0x0437, B:177:0x043c, B:170:0x040b, B:161:0x03d6, B:165:0x03ed, B:178:0x0442, B:180:0x0448, B:182:0x045a, B:185:0x0463, B:186:0x0483, B:201:0x04e1, B:203:0x04f6, B:205:0x051e, B:208:0x052f, B:210:0x053b, B:212:0x0541, B:215:0x0558, B:216:0x0564, B:228:0x05af, B:230:0x05fe, B:234:0x060a, B:236:0x0613, B:238:0x061b, B:239:0x061e, B:241:0x0635, B:244:0x063f, B:246:0x0666, B:248:0x0686, B:252:0x069c, B:254:0x06ba, B:256:0x06d6, B:259:0x06df, B:261:0x06e7, B:264:0x0714, B:266:0x0719, B:268:0x0722, B:270:0x0734, B:272:0x0763, B:285:0x07a6, B:278:0x0785, B:284:0x07a3, B:297:0x083a, B:296:0x0837, B:253:0x06b0, B:340:0x0a17, B:220:0x0577, B:222:0x0586, B:224:0x058e, B:226:0x0596, B:227:0x059f, B:99:0x02b6, B:108:0x02d0, B:110:0x02e5, B:113:0x02ef, B:115:0x02f7, B:117:0x0301, B:118:0x0306), top: B:386:0x0326 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0613 A[Catch: Exception -> 0x0a1e, all -> 0x0a3d, TryCatch #9 {Exception -> 0x0a1e, blocks: (B:123:0x031f, B:126:0x0326, B:129:0x0348, B:131:0x0354, B:133:0x035c, B:135:0x0364, B:137:0x036c, B:146:0x0391, B:145:0x038e, B:149:0x0398, B:151:0x03a2, B:153:0x03aa, B:154:0x03b5, B:156:0x03bb, B:158:0x03c5, B:162:0x03da, B:164:0x03e6, B:166:0x03fd, B:168:0x0403, B:171:0x041b, B:173:0x0423, B:175:0x042b, B:176:0x0437, B:177:0x043c, B:170:0x040b, B:161:0x03d6, B:165:0x03ed, B:178:0x0442, B:180:0x0448, B:182:0x045a, B:185:0x0463, B:186:0x0483, B:201:0x04e1, B:203:0x04f6, B:205:0x051e, B:208:0x052f, B:210:0x053b, B:212:0x0541, B:215:0x0558, B:216:0x0564, B:228:0x05af, B:230:0x05fe, B:234:0x060a, B:236:0x0613, B:238:0x061b, B:239:0x061e, B:241:0x0635, B:244:0x063f, B:246:0x0666, B:248:0x0686, B:252:0x069c, B:254:0x06ba, B:256:0x06d6, B:259:0x06df, B:261:0x06e7, B:264:0x0714, B:266:0x0719, B:268:0x0722, B:270:0x0734, B:272:0x0763, B:285:0x07a6, B:278:0x0785, B:284:0x07a3, B:297:0x083a, B:296:0x0837, B:253:0x06b0, B:340:0x0a17, B:220:0x0577, B:222:0x0586, B:224:0x058e, B:226:0x0596, B:227:0x059f, B:99:0x02b6, B:108:0x02d0, B:110:0x02e5, B:113:0x02ef, B:115:0x02f7, B:117:0x0301, B:118:0x0306), top: B:386:0x0326 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0734 A[Catch: Exception -> 0x0a1e, all -> 0x0a3d, TRY_ENTER, TryCatch #9 {Exception -> 0x0a1e, blocks: (B:123:0x031f, B:126:0x0326, B:129:0x0348, B:131:0x0354, B:133:0x035c, B:135:0x0364, B:137:0x036c, B:146:0x0391, B:145:0x038e, B:149:0x0398, B:151:0x03a2, B:153:0x03aa, B:154:0x03b5, B:156:0x03bb, B:158:0x03c5, B:162:0x03da, B:164:0x03e6, B:166:0x03fd, B:168:0x0403, B:171:0x041b, B:173:0x0423, B:175:0x042b, B:176:0x0437, B:177:0x043c, B:170:0x040b, B:161:0x03d6, B:165:0x03ed, B:178:0x0442, B:180:0x0448, B:182:0x045a, B:185:0x0463, B:186:0x0483, B:201:0x04e1, B:203:0x04f6, B:205:0x051e, B:208:0x052f, B:210:0x053b, B:212:0x0541, B:215:0x0558, B:216:0x0564, B:228:0x05af, B:230:0x05fe, B:234:0x060a, B:236:0x0613, B:238:0x061b, B:239:0x061e, B:241:0x0635, B:244:0x063f, B:246:0x0666, B:248:0x0686, B:252:0x069c, B:254:0x06ba, B:256:0x06d6, B:259:0x06df, B:261:0x06e7, B:264:0x0714, B:266:0x0719, B:268:0x0722, B:270:0x0734, B:272:0x0763, B:285:0x07a6, B:278:0x0785, B:284:0x07a3, B:297:0x083a, B:296:0x0837, B:253:0x06b0, B:340:0x0a17, B:220:0x0577, B:222:0x0586, B:224:0x058e, B:226:0x0596, B:227:0x059f, B:99:0x02b6, B:108:0x02d0, B:110:0x02e5, B:113:0x02ef, B:115:0x02f7, B:117:0x0301, B:118:0x0306), top: B:386:0x0326 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x08bb A[Catch: Exception -> 0x0a15, all -> 0x0a3d, TryCatch #6 {Exception -> 0x0a15, blocks: (B:304:0x08b3, B:306:0x08bb, B:308:0x08c1, B:310:0x08f3, B:312:0x0912, B:314:0x0933, B:316:0x093f, B:324:0x09a6, B:313:0x0923, B:317:0x094d, B:319:0x096c, B:321:0x098d, B:323:0x0999, B:320:0x097d, B:325:0x09ab, B:327:0x09b4, B:328:0x09b9, B:330:0x09c1, B:336:0x0a0d, B:332:0x09cd, B:334:0x09d1, B:290:0x07d3, B:302:0x0867), top: B:381:0x08b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x09b9 A[Catch: Exception -> 0x0a15, all -> 0x0a3d, TryCatch #6 {Exception -> 0x0a15, blocks: (B:304:0x08b3, B:306:0x08bb, B:308:0x08c1, B:310:0x08f3, B:312:0x0912, B:314:0x0933, B:316:0x093f, B:324:0x09a6, B:313:0x0923, B:317:0x094d, B:319:0x096c, B:321:0x098d, B:323:0x0999, B:320:0x097d, B:325:0x09ab, B:327:0x09b4, B:328:0x09b9, B:330:0x09c1, B:336:0x0a0d, B:332:0x09cd, B:334:0x09d1, B:290:0x07d3, B:302:0x0867), top: B:381:0x08b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0719 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x09b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0a17 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0713 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void e() {
        /*
            Method dump skipped, instructions count: 2672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.snowdream.android.app.downloader.a.e():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:44|45|(1:47)(1:342)|48|49|(5:328|(1:330)|331|(3:335|(1:339)|340)|341)(2:53|(4:62|(1:64)|65|(7:85|(8:87|(5:89|(1:91)(1:287)|92|(1:94)|95)(1:288)|96|(5:98|(1:100)|101|102|(2:104|(1:106)(1:107)))|286|101|102|(0))(1:289)|108|109|(6:111|(1:113)|114|(8:116|(3:121|122|(3:130|(1:132)|133)(4:126|127|128|129))|134|122|(1:124)|130|(0)|133)|135|(5:137|138|(2:144|(1:146))|142|143))|147|(4:155|156|157|(5:161|(2:162|(1:267)(8:164|(1:166)|167|(1:169)|170|(3:172|(5:174|(4:176|(2:181|182)|183|182)|184|(1:186)|187)(1:189)|188)|190|(2:264|265)(2:192|(3:195|196|197)(1:194))))|266|198|(4:257|258|(1:260)|261)(2:200|(4:224|225|226|(4:252|253|254|255)(2:228|(5:239|240|241|242|243)))(2:204|(4:206|208|209|(1:211))(2:222|223)))))(4:151|152|153|154))(5:76|77|78|79|80))(4:58|59|60|61))|55|(0)|62|(0)|65|(1:67)|85|(0)(0)|108|109|(0)|147|(1:149)|155|156|157|(1:274)(6:159|161|(3:162|(0)(0)|194)|266|198|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0593, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0595, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x05a2, code lost:
        if (r0.getMessage().contains("EISDIR") != false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x05aa, code lost:
        if (r26.f13051r.exists() != false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x05b4, code lost:
        com.join.mgps.Util.UtilsMy.delete(r26.f13051r);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x05b9, code lost:
        r7 = new java.io.RandomAccessFile(r26.f13051r, net.lingala.zip4j.util.e.f71861e0);
        r26.f13043j = r7;
        r7.seek(r26.f13053t);
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x08b5, code lost:
        a();
        d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x08bb, code lost:
        d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x08be, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x08c0, code lost:
        d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x08c3, code lost:
        d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x08c6, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x08cc, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x08cf, code lost:
        d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x08d2, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x08eb, code lost:
        d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x08ee, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03aa A[Catch: Exception -> 0x00e2, all -> 0x08d3, TRY_ENTER, TryCatch #2 {all -> 0x08d3, blocks: (B:9:0x001d, B:12:0x0035, B:15:0x003e, B:21:0x0087, B:23:0x008d, B:24:0x0094, B:26:0x00a1, B:30:0x00ad, B:33:0x00bf, B:35:0x00c3, B:37:0x00c9, B:38:0x00ce, B:42:0x00e6, B:45:0x00ef, B:47:0x00f5, B:49:0x0109, B:51:0x0112, B:53:0x012e, B:56:0x013f, B:58:0x0147, B:61:0x0151, B:64:0x0190, B:67:0x01bf, B:128:0x032b, B:131:0x0332, B:134:0x0354, B:136:0x0360, B:138:0x0368, B:140:0x0370, B:142:0x0378, B:146:0x0385, B:151:0x039d, B:150:0x039a, B:154:0x03a4, B:156:0x03aa, B:158:0x03b4, B:162:0x03c9, B:164:0x03d5, B:167:0x03ef, B:169:0x03f5, B:174:0x040f, B:176:0x0417, B:178:0x041f, B:179:0x042b, B:182:0x0435, B:185:0x043d, B:187:0x0447, B:188:0x044c, B:190:0x0452, B:192:0x0464, B:195:0x046d, B:197:0x04b4, B:199:0x04c5, B:201:0x04cb, B:204:0x04e2, B:206:0x04ea, B:207:0x04ef, B:196:0x0492, B:208:0x04f4, B:210:0x0505, B:212:0x0519, B:214:0x0522, B:216:0x0542, B:219:0x055b, B:221:0x0567, B:223:0x056d, B:226:0x0584, B:230:0x0595, B:232:0x05a4, B:234:0x05ac, B:236:0x05b4, B:237:0x05b9, B:238:0x05c7, B:240:0x0616, B:244:0x0622, B:246:0x062b, B:248:0x0633, B:249:0x0636, B:251:0x064f, B:254:0x0659, B:256:0x0669, B:258:0x0687, B:260:0x069c, B:263:0x06a6, B:265:0x06ae, B:264:0x06a9, B:269:0x06cf, B:271:0x06f1, B:270:0x06ea, B:272:0x0701, B:275:0x070a, B:277:0x0712, B:281:0x073b, B:283:0x0740, B:285:0x0749, B:287:0x075b, B:289:0x0784, B:291:0x078a, B:293:0x07ae, B:297:0x07b8, B:302:0x0808, B:304:0x080c, B:306:0x0845, B:305:0x0829, B:349:0x08db, B:299:0x07d3, B:301:0x07fb, B:310:0x084d, B:312:0x0856, B:315:0x085d, B:317:0x0865, B:328:0x08b5, B:322:0x0875, B:332:0x08c0, B:173:0x0400, B:161:0x03c5, B:166:0x03df, B:75:0x01e5, B:76:0x01f5, B:81:0x0200, B:84:0x0222, B:85:0x0229, B:87:0x0236, B:88:0x025c, B:90:0x0266, B:92:0x026e, B:94:0x0274, B:96:0x027a, B:97:0x027f, B:98:0x0292, B:101:0x02ab, B:103:0x02b3, B:105:0x02b9, B:107:0x02bf, B:108:0x02c4, B:80:0x01fd, B:112:0x02de, B:114:0x02ec, B:117:0x02f6, B:119:0x02fe, B:121:0x0304, B:123:0x030a, B:124:0x030f, B:20:0x0052), top: B:360:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0417 A[Catch: Exception -> 0x00e2, all -> 0x08d3, TryCatch #2 {all -> 0x08d3, blocks: (B:9:0x001d, B:12:0x0035, B:15:0x003e, B:21:0x0087, B:23:0x008d, B:24:0x0094, B:26:0x00a1, B:30:0x00ad, B:33:0x00bf, B:35:0x00c3, B:37:0x00c9, B:38:0x00ce, B:42:0x00e6, B:45:0x00ef, B:47:0x00f5, B:49:0x0109, B:51:0x0112, B:53:0x012e, B:56:0x013f, B:58:0x0147, B:61:0x0151, B:64:0x0190, B:67:0x01bf, B:128:0x032b, B:131:0x0332, B:134:0x0354, B:136:0x0360, B:138:0x0368, B:140:0x0370, B:142:0x0378, B:146:0x0385, B:151:0x039d, B:150:0x039a, B:154:0x03a4, B:156:0x03aa, B:158:0x03b4, B:162:0x03c9, B:164:0x03d5, B:167:0x03ef, B:169:0x03f5, B:174:0x040f, B:176:0x0417, B:178:0x041f, B:179:0x042b, B:182:0x0435, B:185:0x043d, B:187:0x0447, B:188:0x044c, B:190:0x0452, B:192:0x0464, B:195:0x046d, B:197:0x04b4, B:199:0x04c5, B:201:0x04cb, B:204:0x04e2, B:206:0x04ea, B:207:0x04ef, B:196:0x0492, B:208:0x04f4, B:210:0x0505, B:212:0x0519, B:214:0x0522, B:216:0x0542, B:219:0x055b, B:221:0x0567, B:223:0x056d, B:226:0x0584, B:230:0x0595, B:232:0x05a4, B:234:0x05ac, B:236:0x05b4, B:237:0x05b9, B:238:0x05c7, B:240:0x0616, B:244:0x0622, B:246:0x062b, B:248:0x0633, B:249:0x0636, B:251:0x064f, B:254:0x0659, B:256:0x0669, B:258:0x0687, B:260:0x069c, B:263:0x06a6, B:265:0x06ae, B:264:0x06a9, B:269:0x06cf, B:271:0x06f1, B:270:0x06ea, B:272:0x0701, B:275:0x070a, B:277:0x0712, B:281:0x073b, B:283:0x0740, B:285:0x0749, B:287:0x075b, B:289:0x0784, B:291:0x078a, B:293:0x07ae, B:297:0x07b8, B:302:0x0808, B:304:0x080c, B:306:0x0845, B:305:0x0829, B:349:0x08db, B:299:0x07d3, B:301:0x07fb, B:310:0x084d, B:312:0x0856, B:315:0x085d, B:317:0x0865, B:328:0x08b5, B:322:0x0875, B:332:0x08c0, B:173:0x0400, B:161:0x03c5, B:166:0x03df, B:75:0x01e5, B:76:0x01f5, B:81:0x0200, B:84:0x0222, B:85:0x0229, B:87:0x0236, B:88:0x025c, B:90:0x0266, B:92:0x026e, B:94:0x0274, B:96:0x027a, B:97:0x027f, B:98:0x0292, B:101:0x02ab, B:103:0x02b3, B:105:0x02b9, B:107:0x02bf, B:108:0x02c4, B:80:0x01fd, B:112:0x02de, B:114:0x02ec, B:117:0x02f6, B:119:0x02fe, B:121:0x0304, B:123:0x030a, B:124:0x030f, B:20:0x0052), top: B:360:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x043d A[Catch: Exception -> 0x00e2, all -> 0x08d3, TRY_ENTER, TryCatch #2 {all -> 0x08d3, blocks: (B:9:0x001d, B:12:0x0035, B:15:0x003e, B:21:0x0087, B:23:0x008d, B:24:0x0094, B:26:0x00a1, B:30:0x00ad, B:33:0x00bf, B:35:0x00c3, B:37:0x00c9, B:38:0x00ce, B:42:0x00e6, B:45:0x00ef, B:47:0x00f5, B:49:0x0109, B:51:0x0112, B:53:0x012e, B:56:0x013f, B:58:0x0147, B:61:0x0151, B:64:0x0190, B:67:0x01bf, B:128:0x032b, B:131:0x0332, B:134:0x0354, B:136:0x0360, B:138:0x0368, B:140:0x0370, B:142:0x0378, B:146:0x0385, B:151:0x039d, B:150:0x039a, B:154:0x03a4, B:156:0x03aa, B:158:0x03b4, B:162:0x03c9, B:164:0x03d5, B:167:0x03ef, B:169:0x03f5, B:174:0x040f, B:176:0x0417, B:178:0x041f, B:179:0x042b, B:182:0x0435, B:185:0x043d, B:187:0x0447, B:188:0x044c, B:190:0x0452, B:192:0x0464, B:195:0x046d, B:197:0x04b4, B:199:0x04c5, B:201:0x04cb, B:204:0x04e2, B:206:0x04ea, B:207:0x04ef, B:196:0x0492, B:208:0x04f4, B:210:0x0505, B:212:0x0519, B:214:0x0522, B:216:0x0542, B:219:0x055b, B:221:0x0567, B:223:0x056d, B:226:0x0584, B:230:0x0595, B:232:0x05a4, B:234:0x05ac, B:236:0x05b4, B:237:0x05b9, B:238:0x05c7, B:240:0x0616, B:244:0x0622, B:246:0x062b, B:248:0x0633, B:249:0x0636, B:251:0x064f, B:254:0x0659, B:256:0x0669, B:258:0x0687, B:260:0x069c, B:263:0x06a6, B:265:0x06ae, B:264:0x06a9, B:269:0x06cf, B:271:0x06f1, B:270:0x06ea, B:272:0x0701, B:275:0x070a, B:277:0x0712, B:281:0x073b, B:283:0x0740, B:285:0x0749, B:287:0x075b, B:289:0x0784, B:291:0x078a, B:293:0x07ae, B:297:0x07b8, B:302:0x0808, B:304:0x080c, B:306:0x0845, B:305:0x0829, B:349:0x08db, B:299:0x07d3, B:301:0x07fb, B:310:0x084d, B:312:0x0856, B:315:0x085d, B:317:0x0865, B:328:0x08b5, B:322:0x0875, B:332:0x08c0, B:173:0x0400, B:161:0x03c5, B:166:0x03df, B:75:0x01e5, B:76:0x01f5, B:81:0x0200, B:84:0x0222, B:85:0x0229, B:87:0x0236, B:88:0x025c, B:90:0x0266, B:92:0x026e, B:94:0x0274, B:96:0x027a, B:97:0x027f, B:98:0x0292, B:101:0x02ab, B:103:0x02b3, B:105:0x02b9, B:107:0x02bf, B:108:0x02c4, B:80:0x01fd, B:112:0x02de, B:114:0x02ec, B:117:0x02f6, B:119:0x02fe, B:121:0x0304, B:123:0x030a, B:124:0x030f, B:20:0x0052), top: B:360:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04ea A[Catch: Exception -> 0x00e2, all -> 0x08d3, TryCatch #2 {all -> 0x08d3, blocks: (B:9:0x001d, B:12:0x0035, B:15:0x003e, B:21:0x0087, B:23:0x008d, B:24:0x0094, B:26:0x00a1, B:30:0x00ad, B:33:0x00bf, B:35:0x00c3, B:37:0x00c9, B:38:0x00ce, B:42:0x00e6, B:45:0x00ef, B:47:0x00f5, B:49:0x0109, B:51:0x0112, B:53:0x012e, B:56:0x013f, B:58:0x0147, B:61:0x0151, B:64:0x0190, B:67:0x01bf, B:128:0x032b, B:131:0x0332, B:134:0x0354, B:136:0x0360, B:138:0x0368, B:140:0x0370, B:142:0x0378, B:146:0x0385, B:151:0x039d, B:150:0x039a, B:154:0x03a4, B:156:0x03aa, B:158:0x03b4, B:162:0x03c9, B:164:0x03d5, B:167:0x03ef, B:169:0x03f5, B:174:0x040f, B:176:0x0417, B:178:0x041f, B:179:0x042b, B:182:0x0435, B:185:0x043d, B:187:0x0447, B:188:0x044c, B:190:0x0452, B:192:0x0464, B:195:0x046d, B:197:0x04b4, B:199:0x04c5, B:201:0x04cb, B:204:0x04e2, B:206:0x04ea, B:207:0x04ef, B:196:0x0492, B:208:0x04f4, B:210:0x0505, B:212:0x0519, B:214:0x0522, B:216:0x0542, B:219:0x055b, B:221:0x0567, B:223:0x056d, B:226:0x0584, B:230:0x0595, B:232:0x05a4, B:234:0x05ac, B:236:0x05b4, B:237:0x05b9, B:238:0x05c7, B:240:0x0616, B:244:0x0622, B:246:0x062b, B:248:0x0633, B:249:0x0636, B:251:0x064f, B:254:0x0659, B:256:0x0669, B:258:0x0687, B:260:0x069c, B:263:0x06a6, B:265:0x06ae, B:264:0x06a9, B:269:0x06cf, B:271:0x06f1, B:270:0x06ea, B:272:0x0701, B:275:0x070a, B:277:0x0712, B:281:0x073b, B:283:0x0740, B:285:0x0749, B:287:0x075b, B:289:0x0784, B:291:0x078a, B:293:0x07ae, B:297:0x07b8, B:302:0x0808, B:304:0x080c, B:306:0x0845, B:305:0x0829, B:349:0x08db, B:299:0x07d3, B:301:0x07fb, B:310:0x084d, B:312:0x0856, B:315:0x085d, B:317:0x0865, B:328:0x08b5, B:322:0x0875, B:332:0x08c0, B:173:0x0400, B:161:0x03c5, B:166:0x03df, B:75:0x01e5, B:76:0x01f5, B:81:0x0200, B:84:0x0222, B:85:0x0229, B:87:0x0236, B:88:0x025c, B:90:0x0266, B:92:0x026e, B:94:0x0274, B:96:0x027a, B:97:0x027f, B:98:0x0292, B:101:0x02ab, B:103:0x02b3, B:105:0x02b9, B:107:0x02bf, B:108:0x02c4, B:80:0x01fd, B:112:0x02de, B:114:0x02ec, B:117:0x02f6, B:119:0x02fe, B:121:0x0304, B:123:0x030a, B:124:0x030f, B:20:0x0052), top: B:360:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d A[Catch: Exception -> 0x004b, all -> 0x08d3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x08d3, blocks: (B:9:0x001d, B:12:0x0035, B:15:0x003e, B:21:0x0087, B:23:0x008d, B:24:0x0094, B:26:0x00a1, B:30:0x00ad, B:33:0x00bf, B:35:0x00c3, B:37:0x00c9, B:38:0x00ce, B:42:0x00e6, B:45:0x00ef, B:47:0x00f5, B:49:0x0109, B:51:0x0112, B:53:0x012e, B:56:0x013f, B:58:0x0147, B:61:0x0151, B:64:0x0190, B:67:0x01bf, B:128:0x032b, B:131:0x0332, B:134:0x0354, B:136:0x0360, B:138:0x0368, B:140:0x0370, B:142:0x0378, B:146:0x0385, B:151:0x039d, B:150:0x039a, B:154:0x03a4, B:156:0x03aa, B:158:0x03b4, B:162:0x03c9, B:164:0x03d5, B:167:0x03ef, B:169:0x03f5, B:174:0x040f, B:176:0x0417, B:178:0x041f, B:179:0x042b, B:182:0x0435, B:185:0x043d, B:187:0x0447, B:188:0x044c, B:190:0x0452, B:192:0x0464, B:195:0x046d, B:197:0x04b4, B:199:0x04c5, B:201:0x04cb, B:204:0x04e2, B:206:0x04ea, B:207:0x04ef, B:196:0x0492, B:208:0x04f4, B:210:0x0505, B:212:0x0519, B:214:0x0522, B:216:0x0542, B:219:0x055b, B:221:0x0567, B:223:0x056d, B:226:0x0584, B:230:0x0595, B:232:0x05a4, B:234:0x05ac, B:236:0x05b4, B:237:0x05b9, B:238:0x05c7, B:240:0x0616, B:244:0x0622, B:246:0x062b, B:248:0x0633, B:249:0x0636, B:251:0x064f, B:254:0x0659, B:256:0x0669, B:258:0x0687, B:260:0x069c, B:263:0x06a6, B:265:0x06ae, B:264:0x06a9, B:269:0x06cf, B:271:0x06f1, B:270:0x06ea, B:272:0x0701, B:275:0x070a, B:277:0x0712, B:281:0x073b, B:283:0x0740, B:285:0x0749, B:287:0x075b, B:289:0x0784, B:291:0x078a, B:293:0x07ae, B:297:0x07b8, B:302:0x0808, B:304:0x080c, B:306:0x0845, B:305:0x0829, B:349:0x08db, B:299:0x07d3, B:301:0x07fb, B:310:0x084d, B:312:0x0856, B:315:0x085d, B:317:0x0865, B:328:0x08b5, B:322:0x0875, B:332:0x08c0, B:173:0x0400, B:161:0x03c5, B:166:0x03df, B:75:0x01e5, B:76:0x01f5, B:81:0x0200, B:84:0x0222, B:85:0x0229, B:87:0x0236, B:88:0x025c, B:90:0x0266, B:92:0x026e, B:94:0x0274, B:96:0x027a, B:97:0x027f, B:98:0x0292, B:101:0x02ab, B:103:0x02b3, B:105:0x02b9, B:107:0x02bf, B:108:0x02c4, B:80:0x01fd, B:112:0x02de, B:114:0x02ec, B:117:0x02f6, B:119:0x02fe, B:121:0x0304, B:123:0x030a, B:124:0x030f, B:20:0x0052), top: B:360:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x062b A[Catch: Exception -> 0x00e2, all -> 0x08d3, TRY_ENTER, TryCatch #2 {all -> 0x08d3, blocks: (B:9:0x001d, B:12:0x0035, B:15:0x003e, B:21:0x0087, B:23:0x008d, B:24:0x0094, B:26:0x00a1, B:30:0x00ad, B:33:0x00bf, B:35:0x00c3, B:37:0x00c9, B:38:0x00ce, B:42:0x00e6, B:45:0x00ef, B:47:0x00f5, B:49:0x0109, B:51:0x0112, B:53:0x012e, B:56:0x013f, B:58:0x0147, B:61:0x0151, B:64:0x0190, B:67:0x01bf, B:128:0x032b, B:131:0x0332, B:134:0x0354, B:136:0x0360, B:138:0x0368, B:140:0x0370, B:142:0x0378, B:146:0x0385, B:151:0x039d, B:150:0x039a, B:154:0x03a4, B:156:0x03aa, B:158:0x03b4, B:162:0x03c9, B:164:0x03d5, B:167:0x03ef, B:169:0x03f5, B:174:0x040f, B:176:0x0417, B:178:0x041f, B:179:0x042b, B:182:0x0435, B:185:0x043d, B:187:0x0447, B:188:0x044c, B:190:0x0452, B:192:0x0464, B:195:0x046d, B:197:0x04b4, B:199:0x04c5, B:201:0x04cb, B:204:0x04e2, B:206:0x04ea, B:207:0x04ef, B:196:0x0492, B:208:0x04f4, B:210:0x0505, B:212:0x0519, B:214:0x0522, B:216:0x0542, B:219:0x055b, B:221:0x0567, B:223:0x056d, B:226:0x0584, B:230:0x0595, B:232:0x05a4, B:234:0x05ac, B:236:0x05b4, B:237:0x05b9, B:238:0x05c7, B:240:0x0616, B:244:0x0622, B:246:0x062b, B:248:0x0633, B:249:0x0636, B:251:0x064f, B:254:0x0659, B:256:0x0669, B:258:0x0687, B:260:0x069c, B:263:0x06a6, B:265:0x06ae, B:264:0x06a9, B:269:0x06cf, B:271:0x06f1, B:270:0x06ea, B:272:0x0701, B:275:0x070a, B:277:0x0712, B:281:0x073b, B:283:0x0740, B:285:0x0749, B:287:0x075b, B:289:0x0784, B:291:0x078a, B:293:0x07ae, B:297:0x07b8, B:302:0x0808, B:304:0x080c, B:306:0x0845, B:305:0x0829, B:349:0x08db, B:299:0x07d3, B:301:0x07fb, B:310:0x084d, B:312:0x0856, B:315:0x085d, B:317:0x0865, B:328:0x08b5, B:322:0x0875, B:332:0x08c0, B:173:0x0400, B:161:0x03c5, B:166:0x03df, B:75:0x01e5, B:76:0x01f5, B:81:0x0200, B:84:0x0222, B:85:0x0229, B:87:0x0236, B:88:0x025c, B:90:0x0266, B:92:0x026e, B:94:0x0274, B:96:0x027a, B:97:0x027f, B:98:0x0292, B:101:0x02ab, B:103:0x02b3, B:105:0x02b9, B:107:0x02bf, B:108:0x02c4, B:80:0x01fd, B:112:0x02de, B:114:0x02ec, B:117:0x02f6, B:119:0x02fe, B:121:0x0304, B:123:0x030a, B:124:0x030f, B:20:0x0052), top: B:360:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x075b A[Catch: Exception -> 0x08cd, all -> 0x08d3, TRY_ENTER, TryCatch #1 {Exception -> 0x08cd, blocks: (B:30:0x00ad, B:42:0x00e6, B:56:0x013f, B:58:0x0147, B:61:0x0151, B:67:0x01bf, B:131:0x0332, B:134:0x0354, B:154:0x03a4, B:182:0x0435, B:219:0x055b, B:230:0x0595, B:238:0x05c7, B:240:0x0616, B:244:0x0622, B:281:0x073b, B:287:0x075b, B:289:0x0784, B:291:0x078a, B:293:0x07ae, B:112:0x02de), top: B:358:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0740 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x073a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void f() {
        /*
            Method dump skipped, instructions count: 2298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.snowdream.android.app.downloader.a.f():void");
    }

    public String h() {
        return this.f13037d;
    }

    public String i() {
        return this.f13036c;
    }

    public void j() {
        this.f13041h = true;
    }

    public void q(String str) {
        this.f13036c = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setPriority(1);
        Process.setThreadPriority(19);
        if (this.f13041h) {
            return;
        }
        C = v.f28105e;
        o.c(this.f13038e);
        DownloadTask downloadTask = this.f13038e;
        if (downloadTask != null && downloadTask.isValid()) {
            if (this.f13041h) {
                return;
            }
            org.greenrobot.eventbus.c.f().o(new l(this.f13037d, 20));
            if (m(this.f13038e) || l(this.f13038e)) {
                return;
            }
            n();
            return;
        }
        a();
    }
}
