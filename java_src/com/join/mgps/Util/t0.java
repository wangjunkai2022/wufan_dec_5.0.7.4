package com.join.mgps.Util;

import android.content.Context;
import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
/* compiled from: JpegOptimizer.java */
/* loaded from: classes3.dex */
public class t0 {

    /* renamed from: j  reason: collision with root package name */
    public static final String f28061j = "jpegoptim";

    /* renamed from: a  reason: collision with root package name */
    private String f28062a;

    /* renamed from: b  reason: collision with root package name */
    private String f28063b;

    /* renamed from: c  reason: collision with root package name */
    private String f28064c;

    /* renamed from: d  reason: collision with root package name */
    private int f28065d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f28066e;

    /* renamed from: f  reason: collision with root package name */
    private int f28067f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f28068g;

    /* renamed from: h  reason: collision with root package name */
    private String[] f28069h;

    /* renamed from: i  reason: collision with root package name */
    private AsyncTask f28070i;

    /* compiled from: JpegOptimizer.java */
    /* loaded from: classes3.dex */
    class a extends AsyncTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f28071a;

        a(b bVar) {
            this.f28071a = bVar;
        }

        @Override // android.os.AsyncTask
        protected Object doInBackground(Object[] objArr) {
            boolean z4;
            String[] strArr = objArr != null ? (String[]) objArr : t0.this.f28069h != null ? t0.this.f28069h : null;
            if (strArr == null) {
                return null;
            }
            String c5 = t0.c(strArr);
            if (g2.h(c5)) {
                z4 = false;
            } else {
                String[] split = c5.split(",");
                z4 = split[split.length - 1].equals("optimized");
            }
            b bVar = this.f28071a;
            if (bVar != null) {
                bVar.a(z4, c5);
            }
            return c5;
        }

        @Override // android.os.AsyncTask
        protected void onCancelled(Object obj) {
            super.onCancelled(obj);
        }

        @Override // android.os.AsyncTask
        protected void onPostExecute(Object obj) {
            super.onPostExecute(obj);
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* compiled from: JpegOptimizer.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(boolean z4, String str);
    }

    public t0(String str, String str2, String str3, int i4, int i5, boolean z4) {
        this.f28062a = str;
        this.f28063b = str2;
        this.f28064c = str3;
        this.f28065d = i4;
        this.f28067f = i5;
        this.f28068g = z4;
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String[] strArr) {
        IOException e5;
        String str;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(strArr).getInputStream()));
            str = "";
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str = str + readLine + "";
                } catch (IOException e6) {
                    e5 = e6;
                    e5.printStackTrace();
                    return str;
                }
            }
        } catch (IOException e7) {
            e5 = e7;
            str = "";
        }
        return str;
    }

    public static void e(Context context, String str) {
        f(context, "jpegoptim", str);
    }

    private static void f(Context context, String str, String str2) {
        FileOutputStream fileOutputStream;
        Throwable th;
        InputStream inputStream;
        File file = new File(str2);
        if (file.exists()) {
            return;
        }
        file.getParentFile().mkdirs();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                inputStream = context.getAssets().open(str);
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read > 0) {
                                fileOutputStream.write(bArr, 0, read);
                            } else {
                                fileOutputStream.close();
                                inputStream.close();
                                Runtime.getRuntime().exec(new String[]{"chmod", "755", file.getAbsolutePath()});
                                return;
                            }
                        }
                    } catch (Exception unused) {
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        Runtime.getRuntime().exec(new String[]{"chmod", "755", file.getAbsolutePath()});
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                                throw th;
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        Runtime.getRuntime().exec(new String[]{"chmod", "755", file.getAbsolutePath()});
                        throw th;
                    }
                } catch (Exception unused3) {
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (IOException unused4) {
            }
        } catch (Exception unused5) {
            inputStream = null;
        } catch (Throwable th4) {
            fileOutputStream = null;
            th = th4;
            inputStream = null;
        }
    }

    private void g() {
        if (this.f28067f >= 0) {
            this.f28066e = true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f28062a);
        arrayList.add(this.f28063b);
        arrayList.add("-b");
        arrayList.add("-T" + this.f28065d);
        if (this.f28066e) {
            arrayList.add("-m" + this.f28067f);
        }
        if (this.f28068g) {
            arrayList.add("-p");
        }
        if (this.f28064c != null) {
            arrayList.add("-od" + this.f28064c);
        }
        String[] strArr = new String[arrayList.size()];
        this.f28069h = strArr;
        arrayList.toArray(strArr);
    }

    void d(b bVar) {
        AsyncTask asyncTask = this.f28070i;
        if (asyncTask == null || asyncTask.getStatus() == AsyncTask.Status.FINISHED) {
            this.f28070i = new a(bVar);
        }
        if (this.f28070i.getStatus() != AsyncTask.Status.RUNNING) {
            this.f28070i.execute(this.f28069h);
        }
    }
}
