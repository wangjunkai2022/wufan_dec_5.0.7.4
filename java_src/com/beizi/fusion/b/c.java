package com.beizi.fusion.b;

import android.content.Context;
import android.text.TextUtils;
import com.beizi.fusion.g.ab;
import com.beizi.fusion.g.ad;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.ao;
import com.beizi.fusion.g.au;
import com.beizi.fusion.g.h;
import com.beizi.fusion.g.j;
import com.beizi.fusion.g.z;
import com.beizi.fusion.model.Messenger;
import com.beizi.fusion.model.RequestInfo;
import com.beizi.fusion.model.ResponseInfo;
import com.join.mgps.Util.h0;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import net.lingala.zip4j.util.e;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: EventCar.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f6568a;

    /* renamed from: b  reason: collision with root package name */
    private Context f6569b;

    /* renamed from: c  reason: collision with root package name */
    private List<Messenger.EventsBean> f6570c;

    /* renamed from: d  reason: collision with root package name */
    private long f6571d = 128;

    /* renamed from: e  reason: collision with root package name */
    private long f6572e = 172800000;

    private c(Context context) {
        this.f6569b = context;
        RequestInfo init = RequestInfo.getInstance(context).init();
        if (init.isInit()) {
            return;
        }
        init.init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(b bVar) {
        try {
            ResponseInfo responseInfo = ResponseInfo.getInstance(this.f6569b);
            String a5 = a(bVar.d());
            if (responseInfo.getMessenger() != null) {
                this.f6570c = responseInfo.getMessenger().getEvents();
                this.f6571d = Long.valueOf(responseInfo.getMessenger().getFileMaxSize()).longValue();
                this.f6572e = responseInfo.getMessenger().getExpireTime();
                List<Messenger.EventsBean> list = this.f6570c;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (int i4 = 0; i4 < this.f6570c.size(); i4++) {
                    Messenger.EventsBean eventsBean = this.f6570c.get(i4);
                    List<String> codes = eventsBean.getCodes();
                    if (codes != null && codes.size() > 0) {
                        for (int i5 = 0; i5 < codes.size(); i5++) {
                            if (!TextUtils.isEmpty(bVar.d()) && !TextUtils.isEmpty(codes.get(i5)) && (bVar.d().equals(codes.get(i5)) || a5.equals(codes.get(i5)))) {
                                if (eventsBean.getIsOnline().equals("1")) {
                                    bVar.a(eventsBean.getUploadUrl());
                                    a(eventsBean, bVar);
                                } else {
                                    a(eventsBean, bVar, true);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void b(b bVar) {
        c(bVar);
    }

    public static c a(Context context) {
        if (f6568a == null) {
            synchronized (c.class) {
                if (f6568a == null) {
                    f6568a = new c(context);
                }
            }
        }
        return f6568a;
    }

    public void a(final b bVar) {
        h.b().e().execute(new Runnable() { // from class: com.beizi.fusion.b.c.1
            @Override // java.lang.Runnable
            public void run() {
                c.this.c(bVar);
            }
        });
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String substring = str.substring(0, str.indexOf(h0.f27805a) + 1);
        return substring + WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD;
    }

    private void a(Messenger.EventsBean eventsBean, b bVar) {
        String a5;
        if (bVar != null) {
            try {
                if (TextUtils.isEmpty(bVar.a())) {
                    return;
                }
                String a6 = bVar.a();
                if ("590.200".equalsIgnoreCase(bVar.d())) {
                    a6 = bVar.U();
                }
                int indexOf = a6.indexOf("?");
                String substring = a6.substring(0, indexOf);
                String substring2 = a6.substring(indexOf + 1);
                if ("590.200".equalsIgnoreCase(bVar.d())) {
                    a5 = au.a(this.f6569b, substring2, bVar, bVar.T());
                } else {
                    a5 = au.a(this.f6569b, substring2, bVar);
                }
                String a7 = com.beizi.fusion.g.d.a(ad.a(), z.a(a5));
                if (a7 != null) {
                    String a8 = ab.a(substring, a7.getBytes());
                    if (!TextUtils.isEmpty(a8)) {
                        try {
                            if (new JSONObject(a8).optInt("code") != 200) {
                                a(eventsBean, bVar, true);
                                return;
                            }
                            return;
                        } catch (JSONException e5) {
                            e5.printStackTrace();
                            return;
                        }
                    }
                    a(eventsBean, bVar, true);
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    public void a() {
        int i4;
        int i5;
        try {
            af.a("BeiZis", "===================doUpLoadLogs===================:" + Thread.currentThread().getName());
            long currentTimeMillis = System.currentTimeMillis();
            File a5 = j.a(this.f6569b);
            af.a("BeiZis", "doUpLoadLogs storagePath == " + a5);
            if (a5 != null) {
                String str = a5.getPath() + "/BeiZi/offline/";
                File[] listFiles = new File(str).listFiles();
                if (listFiles == null || listFiles.length <= 0) {
                    return;
                }
                int length = listFiles.length;
                int i6 = 0;
                int i7 = 0;
                while (i7 < length) {
                    File file = listFiles[i7];
                    if (file.isDirectory()) {
                        String str2 = "";
                        File file2 = new File(str, file.getName() + "/10000.txt");
                        if (file2.exists()) {
                            str2 = a(file2);
                        } else {
                            ao.a(file);
                        }
                        String str3 = str2;
                        if (!TextUtils.isEmpty(str3)) {
                            File[] listFiles2 = file.listFiles();
                            int length2 = listFiles2.length;
                            int i8 = 0;
                            while (i8 < length2) {
                                File file3 = listFiles2[i8];
                                if (file3.getName().equals("10000.txt")) {
                                    i5 = i7;
                                } else {
                                    i5 = i7;
                                    if (currentTimeMillis - Long.valueOf(file3.getName().substring(i6, file3.getName().indexOf(h0.f27805a))).longValue() < this.f6572e) {
                                        String a6 = ab.a(str3, file3);
                                        if (!TextUtils.isEmpty(a6)) {
                                            try {
                                                if (new JSONObject(a6).optInt("code") == 200) {
                                                    file3.delete();
                                                }
                                            } catch (JSONException e5) {
                                                e5.printStackTrace();
                                            }
                                        }
                                    } else {
                                        file3.delete();
                                    }
                                }
                                i8++;
                                i7 = i5;
                                i6 = 0;
                            }
                            i4 = i7;
                            if (file.listFiles().length <= 1) {
                                ao.a(file);
                            }
                            i7 = i4 + 1;
                            i6 = 0;
                        }
                    }
                    i4 = i7;
                    i7 = i4 + 1;
                    i6 = 0;
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private static String a(File file) {
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            fileInputStream.close();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return sb.toString();
    }

    private void a(Messenger.EventsBean eventsBean, b bVar, boolean z4) {
        File[] listFiles;
        StringBuilder sb = new StringBuilder();
        sb.append("===================doOffline===================:");
        sb.append(bVar.d());
        try {
            File a5 = j.a(this.f6569b);
            af.a("BeiZis", "doOffline storagePath == " + a5);
            if (a5 != null) {
                String offlineUrl = z4 ? eventsBean.getOfflineUrl() : eventsBean.getUploadUrl();
                String substring = offlineUrl.substring(0, offlineUrl.indexOf("?"));
                String a6 = com.beizi.fusion.g.d.a(ad.a(), au.a(this.f6569b, offlineUrl.substring(offlineUrl.indexOf("?") + 1), bVar));
                String str = a5.getPath() + "/BeiZi/offline/" + au.a(eventsBean.toString()) + e.F0;
                File file = new File(str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, "10000.txt");
                synchronized (c.class) {
                    if (!file2.exists()) {
                        file2.createNewFile();
                        FileWriter fileWriter = new FileWriter(file2, true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        bufferedWriter.write(substring);
                        bufferedWriter.newLine();
                        bufferedWriter.close();
                        fileWriter.close();
                    }
                }
                long j4 = 0;
                for (File file3 : file.listFiles()) {
                    String substring2 = file3.getName().substring(0, file3.getName().indexOf(h0.f27805a));
                    if (Long.valueOf(substring2).longValue() > j4) {
                        j4 = Long.valueOf(substring2).longValue();
                    }
                }
                if (j4 != 0 && j4 != com.join.mgps.data.c.f49010a) {
                    File file4 = new File(str + j4 + ".txt");
                    if (file4.exists() && file4.length() < this.f6571d * 1000) {
                        FileWriter fileWriter2 = new FileWriter(file4, true);
                        BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter2);
                        bufferedWriter2.write(a6);
                        bufferedWriter2.newLine();
                        bufferedWriter2.close();
                        fileWriter2.close();
                        file4.renameTo(new File(file, System.currentTimeMillis() + ".txt"));
                        return;
                    }
                }
                File file5 = new File(file, System.currentTimeMillis() + ".txt");
                file5.createNewFile();
                FileWriter fileWriter3 = new FileWriter(file5, true);
                BufferedWriter bufferedWriter3 = new BufferedWriter(fileWriter3);
                bufferedWriter3.write(a6);
                bufferedWriter3.newLine();
                bufferedWriter3.close();
                fileWriter3.close();
            }
        } catch (IOException unused) {
        } catch (Exception e5) {
            e5.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
