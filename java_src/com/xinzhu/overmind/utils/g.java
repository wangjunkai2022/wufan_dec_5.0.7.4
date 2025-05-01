package com.xinzhu.overmind.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: Dex2oatUtils.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String f68315a = "g";

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Dex2oatUtils.java */
    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final Executor f68316a = Executors.newSingleThreadExecutor();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Dex2oatUtils.java */
        /* renamed from: com.xinzhu.overmind.utils.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public class RunnableC0761a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ InputStream f68317b;

            RunnableC0761a(InputStream inputStream) {
                this.f68317b = inputStream;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f68317b == null) {
                    return;
                }
                do {
                    try {
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        try {
                            this.f68317b.close();
                        } catch (Exception unused2) {
                        }
                        throw th;
                    }
                } while (this.f68317b.read(new byte[256]) > 0);
                try {
                    this.f68317b.close();
                } catch (Exception unused3) {
                }
            }
        }

        private a() {
        }

        static void a(InputStream inputStream) {
            f68316a.execute(new RunnableC0761a(inputStream));
        }
    }

    public static void a(String str) throws IOException {
        String str2 = com.xinzhu.overmind.client.frameworks.g.d().k(str).d().equals(com.xinzhu.overmind.a.f67443k) ? "arm64" : "arm";
        File N = com.xinzhu.overmind.a.N(str, str2);
        File j4 = com.xinzhu.overmind.a.j(str);
        if (!N.exists()) {
            N.getParentFile().mkdirs();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("dex2oat");
        if (e.d()) {
            arrayList.add("--runtime-arg");
            arrayList.add("-classpath");
            arrayList.add("--runtime-arg");
            arrayList.add(m.a.f71490d);
        }
        arrayList.add("--dex-file=" + j4.getAbsolutePath());
        arrayList.add("--oat-file=" + N.getAbsolutePath());
        arrayList.add("--instruction-set=" + str2);
        arrayList.add("--compiler-filter=speed-profile");
        arrayList.add("--compact-dex-level=none");
        String str3 = f68315a;
        com.xinzhu.overmind.b.a(str3, "overmind dex2oat begin");
        ProcessBuilder processBuilder = new ProcessBuilder(arrayList);
        processBuilder.redirectErrorStream(true);
        Process start = processBuilder.start();
        a.a(start.getInputStream());
        a.a(start.getErrorStream());
        try {
            int waitFor = start.waitFor();
            if (waitFor == 0) {
                com.xinzhu.overmind.b.a(str3, "overmind dex2oat end");
                return;
            }
            throw new IOException("dex2oat works unsuccessfully, exit code: " + waitFor);
        } catch (InterruptedException e5) {
            throw new IOException("dex2oat is interrupted, msg: " + e5.getMessage(), e5);
        }
    }
}
