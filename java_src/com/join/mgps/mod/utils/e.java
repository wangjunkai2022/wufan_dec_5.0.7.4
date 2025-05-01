package com.join.mgps.mod.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.join.mgps.Util.g2;
import com.xinzhu.overmind.Overmind;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: SoLibManager.java */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: b  reason: collision with root package name */
    private static final String f53642b = "e";

    /* renamed from: c  reason: collision with root package name */
    private static e f53643c = new e();

    /* renamed from: d  reason: collision with root package name */
    private static String f53644d = "";

    /* renamed from: a  reason: collision with root package name */
    private ExecutorService f53645a = Executors.newCachedThreadPool();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SoLibManager.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private String f53646b;

        /* renamed from: c  reason: collision with root package name */
        private ZipFile f53647c;

        /* renamed from: d  reason: collision with root package name */
        private ZipEntry f53648d;

        /* renamed from: e  reason: collision with root package name */
        private Context f53649e;

        /* renamed from: f  reason: collision with root package name */
        private long f53650f;

        /* renamed from: g  reason: collision with root package name */
        private String f53651g;

        a(Context context, String str, ZipFile zipFile, ZipEntry zipEntry, long j4) {
            this.f53651g = str;
            File file = new File(str);
            try {
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            this.f53647c = zipFile;
            this.f53649e = context;
            this.f53648d = zipEntry;
            this.f53646b = c(zipEntry.getName());
            this.f53650f = j4;
            try {
                this.f53647c = new ZipFile(zipFile.getName());
            } catch (IOException e6) {
                e6.printStackTrace();
            }
        }

        private int b(InputStream inputStream) throws IOException {
            if (inputStream == null) {
                return 0;
            }
            int available = inputStream.available();
            if (available <= 0) {
                return 1024;
            }
            return available;
        }

        private final String c(String str) {
            return str.substring(str.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1);
        }

        private void d() throws IOException {
            a(this.f53647c.getInputStream(this.f53648d), new FileOutputStream(new File(this.f53651g, this.f53646b)));
            this.f53647c.close();
        }

        public void a(InputStream inputStream, OutputStream outputStream) throws IOException {
            if (inputStream == null || outputStream == null) {
                return;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            int b5 = b(bufferedInputStream);
            byte[] bArr = new byte[b5];
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, b5);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                    return;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Intent intent;
            try {
                try {
                    Intent intent2 = new Intent(d.f53636s);
                    intent2.putExtra("soName", this.f53646b);
                    Overmind.getContext().sendBroadcast(intent2);
                    d();
                    Context context = this.f53649e;
                    if (context != null) {
                        PluginConfig.setSoLastModifiedTime(context, this.f53648d.getName(), this.f53650f);
                    }
                    String unused = e.f53642b;
                    StringBuilder sb = new StringBuilder();
                    sb.append("copy so lib success: ");
                    sb.append(this.f53648d.getName());
                    intent = new Intent(d.f53637t);
                } catch (IOException e5) {
                    String unused2 = e.f53642b;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("copy so lib failed: ");
                    sb2.append(e5.toString());
                    e5.printStackTrace();
                    intent = new Intent(d.f53637t);
                }
                intent.putExtra("soName", this.f53646b);
                Overmind.getContext().sendBroadcast(intent);
            } catch (Throwable th) {
                Intent intent3 = new Intent(d.f53637t);
                intent3.putExtra("soName", this.f53646b);
                Overmind.getContext().sendBroadcast(intent3);
                throw th;
            }
        }
    }

    private e() {
    }

    public static e d() {
        return f53643c;
    }

    @SuppressLint({"DefaultLocale"})
    private String e(String str) {
        if (!str.toLowerCase().contains("arm")) {
            if (str.toLowerCase().contains(d.f53622e)) {
                return d.f53622e;
            }
            if (str.toLowerCase().contains(d.f53623f)) {
                return d.f53623f;
            }
        }
        return d.f53621d;
    }

    private String f() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            String[] split = readLine.split(":\\s+", 2);
            if (split.length >= 2) {
                return split[1];
            }
            return null;
        } catch (FileNotFoundException e5) {
            e5.printStackTrace();
            return null;
        } catch (IOException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public void b(Context context, String str, String str2) {
        Context context2;
        Intent intent;
        long time;
        String str3;
        Enumeration<? extends ZipEntry> enumeration;
        String e5 = e(f());
        f53644d = str2;
        StringBuilder sb = new StringBuilder();
        sb.append("cpuArchitect: ");
        sb.append(e5);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                Overmind.getContext().sendBroadcast(new Intent(d.f53636s));
                if (g2.i(str)) {
                    ZipFile zipFile = new ZipFile(str);
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry nextElement = entries.nextElement();
                        if (!nextElement.isDirectory()) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                time = nextElement.getLastModifiedTime().toMillis();
                            } else {
                                time = nextElement.getTime();
                            }
                            long j4 = time;
                            String name = nextElement.getName();
                            if (name.endsWith(".so") && name.contains(e5)) {
                                if (context != null && j4 == PluginConfig.getSoLastModifiedTime(context, name)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("skip copying, the so lib is exist and not change: ");
                                    sb2.append(name);
                                } else {
                                    str3 = e5;
                                    enumeration = entries;
                                    this.f53645a.execute(new a(context, str2, zipFile, nextElement, j4));
                                }
                            } else {
                                str3 = e5;
                                enumeration = entries;
                                if (name.endsWith("EXTDEX")) {
                                    if (context != null && j4 == PluginConfig.getSoLastModifiedTime(context, name)) {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("skip copying, the so lib is exist and not change: ");
                                        sb3.append(name);
                                    } else {
                                        this.f53645a.execute(new a(context, str2, zipFile, nextElement, j4));
                                    }
                                }
                            }
                            entries = enumeration;
                            e5 = str3;
                        }
                    }
                }
                context2 = Overmind.getContext();
                intent = new Intent(d.f53637t);
            } catch (IOException e6) {
                e6.printStackTrace();
                context2 = Overmind.getContext();
                intent = new Intent(d.f53637t);
            }
            context2.sendBroadcast(intent);
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("### copy so time : ");
            sb4.append(currentTimeMillis2 - currentTimeMillis);
            sb4.append(" ms");
        } catch (Throwable th) {
            Overmind.getContext().sendBroadcast(new Intent(d.f53637t));
            throw th;
        }
    }

    public void c(Context context, String str, String str2, String str3, List<String> list) {
        Context context2;
        Intent intent;
        long time;
        String str4;
        Enumeration<? extends ZipEntry> enumeration;
        String str5;
        String e5 = e(f());
        f53644d = str2;
        StringBuilder sb = new StringBuilder();
        sb.append("cpuArchitect: ");
        sb.append(e5);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                Overmind.getContext().sendBroadcast(new Intent(d.f53636s));
                ZipFile zipFile = new ZipFile(str);
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    if (!nextElement.isDirectory()) {
                        String name = nextElement.getName();
                        if (Build.VERSION.SDK_INT >= 26) {
                            time = nextElement.getLastModifiedTime().toMillis();
                        } else {
                            time = nextElement.getTime();
                        }
                        long j4 = time;
                        if (name.endsWith(".so") && name.contains(e5)) {
                            if (context != null && j4 == PluginConfig.getSoLastModifiedTime(context, name)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("skip copying, the so lib is exist and not change: ");
                                sb2.append(name);
                            } else {
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= list.size()) {
                                        str5 = str3;
                                        break;
                                    } else if (nextElement.getName().endsWith(list.get(i4))) {
                                        str5 = str2;
                                        break;
                                    } else {
                                        i4++;
                                    }
                                }
                                str4 = e5;
                                enumeration = entries;
                                this.f53645a.execute(new a(context, str5, zipFile, nextElement, j4));
                            }
                        } else {
                            str4 = e5;
                            enumeration = entries;
                            if (name.endsWith("EXTDEX")) {
                                if (context != null && j4 == PluginConfig.getSoLastModifiedTime(context, name)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("skip copying, the so lib is exist and not change: ");
                                    sb3.append(name);
                                } else {
                                    this.f53645a.execute(new a(context, str2, zipFile, nextElement, j4));
                                }
                            }
                        }
                        entries = enumeration;
                        e5 = str4;
                    }
                }
                context2 = Overmind.getContext();
                intent = new Intent(d.f53637t);
            } catch (IOException e6) {
                e6.printStackTrace();
                context2 = Overmind.getContext();
                intent = new Intent(d.f53637t);
            }
            context2.sendBroadcast(intent);
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("### copy so time : ");
            sb4.append(currentTimeMillis2 - currentTimeMillis);
            sb4.append(" ms");
        } catch (Throwable th) {
            Overmind.getContext().sendBroadcast(new Intent(d.f53637t));
            throw th;
        }
    }

    public List<String> g(String str) {
        ArrayList arrayList = new ArrayList();
        String e5 = e(f());
        try {
            Enumeration<? extends ZipEntry> entries = new ZipFile(str).entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                if (!nextElement.isDirectory()) {
                    String name = nextElement.getName();
                    if (name.endsWith(".so") && name.contains(e5)) {
                        arrayList.add(name.substring(name.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1));
                    }
                }
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        }
        return arrayList;
    }
}
