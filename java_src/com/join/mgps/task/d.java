package com.join.mgps.task;

import android.content.Context;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ScanApClientThread.java */
/* loaded from: classes5.dex */
public class d implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private static final String f54871g = d.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private Context f54872b;

    /* renamed from: c  reason: collision with root package name */
    boolean f54873c;

    /* renamed from: d  reason: collision with root package name */
    List<com.join.mgps.event.e> f54874d;

    /* renamed from: e  reason: collision with root package name */
    long f54875e;

    /* renamed from: f  reason: collision with root package name */
    boolean f54876f = true;

    public d(Context context, boolean z4, long j4) {
        this.f54873c = false;
        this.f54874d = null;
        this.f54872b = context;
        this.f54873c = z4;
        this.f54874d = new ArrayList();
        this.f54875e = j4;
        StringBuilder sb = new StringBuilder();
        sb.append("ScanApClientThread: mTime::");
        sb.append(this.f54875e);
    }

    public ArrayList<com.join.mgps.event.e> a(boolean z4) {
        ArrayList<com.join.mgps.event.e> arrayList;
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    arrayList = new ArrayList<>();
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/net/arp"));
                        while (true) {
                            try {
                                String readLine = bufferedReader2.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                String[] split = readLine.split(" +");
                                if (split != null && split.length >= 4) {
                                    String str = split[3];
                                    String str2 = split[0];
                                    if (str.matches("..:..:..:..:..:..")) {
                                        boolean c5 = c(split[0]);
                                        if (!c5) {
                                            c5 = InetAddress.getByName(split[0]).isReachable(3000);
                                        }
                                        if (!z4 || c5) {
                                            arrayList.add(new com.join.mgps.event.e(c5, str, str2));
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                                bufferedReader = bufferedReader2;
                                bufferedReader.close();
                                return arrayList;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused2) {
                                }
                                throw th;
                            }
                        }
                        bufferedReader2.close();
                    } catch (Exception unused3) {
                    }
                } catch (IOException unused4) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused5) {
            arrayList = null;
        }
        return arrayList;
    }

    void b() {
        com.join.mgps.event.e eVar = new com.join.mgps.event.e();
        eVar.f(false);
        org.greenrobot.eventbus.c.f().o(eVar);
    }

    public boolean c(String str) {
        try {
            Process exec = Runtime.getRuntime().exec("ping  -c 1 -W 1 " + str);
            try {
                exec.waitFor();
            } catch (InterruptedException e5) {
                e5.printStackTrace();
            }
            return exec.exitValue() == 0;
        } catch (IOException unused) {
            return false;
        }
    }

    public void d(boolean z4) {
        this.f54876f = z4;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.f54876f) {
            try {
                this.f54874d = a(this.f54873c);
                StringBuilder sb = new StringBuilder();
                sb.append("run: 数量");
                sb.append(this.f54874d.size());
                org.greenrobot.eventbus.c.f().o(this.f54874d);
                Thread.sleep(this.f54875e);
            } catch (InterruptedException e5) {
                Thread.interrupted();
                e5.printStackTrace();
            }
        }
    }
}
