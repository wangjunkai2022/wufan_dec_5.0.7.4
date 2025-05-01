package net.bither.util;

import android.content.Context;
import android.os.AsyncTask;
import com.join.mgps.Util.g2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
/* compiled from: JpegOptimizer.java */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: j  reason: collision with root package name */
    public static final String f71714j = "jpegoptim";

    /* renamed from: a  reason: collision with root package name */
    private String f71715a;

    /* renamed from: b  reason: collision with root package name */
    private String f71716b;

    /* renamed from: c  reason: collision with root package name */
    private String f71717c;

    /* renamed from: d  reason: collision with root package name */
    private int f71718d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f71719e;

    /* renamed from: f  reason: collision with root package name */
    private int f71720f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f71721g;

    /* renamed from: h  reason: collision with root package name */
    private String[] f71722h;

    /* renamed from: i  reason: collision with root package name */
    private AsyncTask f71723i;

    /* compiled from: JpegOptimizer.java */
    /* loaded from: classes7.dex */
    class a extends AsyncTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f71724a;

        a(b bVar) {
            this.f71724a = bVar;
        }

        @Override // android.os.AsyncTask
        protected Object doInBackground(Object[] objArr) {
            boolean z4;
            String[] strArr = objArr != null ? (String[]) objArr : c.this.f71722h != null ? c.this.f71722h : null;
            if (strArr == null) {
                return null;
            }
            String c5 = c.c(strArr);
            if (g2.h(c5)) {
                z4 = false;
            } else {
                String[] split = c5.split(",");
                z4 = split[split.length - 1].equals("optimized");
            }
            b bVar = this.f71724a;
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
    /* loaded from: classes7.dex */
    public interface b {
        void a(boolean z4, String str);
    }

    public c(String str, String str2, String str3, int i4, int i5, boolean z4) {
        this.f71715a = str;
        this.f71716b = str2;
        this.f71717c = str3;
        this.f71718d = i4;
        this.f71720f = i5;
        this.f71721g = z4;
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
        if (this.f71720f >= 0) {
            this.f71719e = true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f71715a);
        arrayList.add(this.f71716b);
        arrayList.add("-b");
        arrayList.add("-T" + this.f71718d);
        if (this.f71719e) {
            arrayList.add("-m" + this.f71720f);
        }
        if (this.f71721g) {
            arrayList.add("-p");
        }
        if (this.f71717c != null) {
            arrayList.add("-od" + this.f71717c);
        }
        String[] strArr = new String[arrayList.size()];
        this.f71722h = strArr;
        arrayList.toArray(strArr);
    }

    public void d(b bVar) {
        AsyncTask asyncTask = this.f71723i;
        if (asyncTask == null || asyncTask.getStatus() == AsyncTask.Status.FINISHED) {
            this.f71723i = new a(bVar);
        }
        if (this.f71723i.getStatus() != AsyncTask.Status.RUNNING) {
            this.f71723i.execute(this.f71722h);
        }
    }
}
