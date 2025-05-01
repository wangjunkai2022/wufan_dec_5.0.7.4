package net.bither.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.join.mgps.Util.g0;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.p1;
import com.join.mgps.Util.w0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.bither.util.NativeUtil;
import net.bither.util.c;
/* compiled from: ImageCompressor.java */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: e  reason: collision with root package name */
    private static int f71688e = 2;

    /* renamed from: f  reason: collision with root package name */
    private static ThreadPoolExecutor f71689f;

    /* renamed from: g  reason: collision with root package name */
    public static long f71690g;

    /* renamed from: h  reason: collision with root package name */
    public static long f71691h;

    /* renamed from: i  reason: collision with root package name */
    public static Bitmap.CompressFormat f71692i;

    /* renamed from: j  reason: collision with root package name */
    private static b f71693j;

    /* renamed from: a  reason: collision with root package name */
    public Context f71694a;

    /* renamed from: b  reason: collision with root package name */
    public Hashtable<String, Integer> f71695b = new Hashtable<>();

    /* renamed from: c  reason: collision with root package name */
    public Hashtable<String, String> f71696c = new Hashtable<>();

    /* renamed from: d  reason: collision with root package name */
    List<e> f71697d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageCompressor.java */
    /* loaded from: classes7.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f71698b;

        a(String str) {
            this.f71698b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.v(this.f71698b, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageCompressor.java */
    /* renamed from: net.bither.util.b$b  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public class C0787b implements NativeUtil.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f71700a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Integer f71701b;

        C0787b(String str, Integer num) {
            this.f71700a = str;
            this.f71701b = num;
        }

        @Override // net.bither.util.NativeUtil.a
        public void onFailed(String str) {
            w0.e("doCompress1-->onFailed==>finish compress.. fail");
            b.this.v(str, 2);
        }

        @Override // net.bither.util.NativeUtil.a
        public void onSuccess(String str) {
            w0.e("doCompress1-->onSuccess==>finish compress.. success ", str);
            try {
                long o4 = b.o(new File(this.f71700a));
                if (o4 < b.f71690g) {
                    w0.e("doCompress1-->finish compress.. success. size=" + o4);
                    b.this.v(str, 1);
                } else if (this.f71701b.intValue() - 10 > 20) {
                    int intValue = Integer.valueOf(this.f71701b.intValue()).intValue();
                    int i4 = intValue - 10;
                    w0.e("doCompress1-->re-compress.. size=" + o4, " newQuality=" + i4, " newInt=" + intValue);
                    b.this.m(str, this.f71700a, Integer.valueOf(i4));
                } else {
                    w0.e("doCompress1-->finish compress.. fail. size=" + o4);
                    b.this.v(str, 2);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageCompressor.java */
    /* loaded from: classes7.dex */
    public class c implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f71703a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f71704b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f71705c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f71706d;

        c(String str, int i4, Context context, String str2) {
            this.f71703a = str;
            this.f71704b = i4;
            this.f71705c = context;
            this.f71706d = str2;
        }

        private void c(String str) {
            w0.e("OptimResultHandler-->optimSuccess");
            b.this.v(str, 1);
            if (b.this.f71696c.containsKey(str)) {
                b bVar = b.this;
                bVar.i(str, bVar.f71696c.get(str));
            }
        }

        @Override // net.bither.util.c.b
        public void a(boolean z4, String str) {
            int i4;
            w0.e("OptimResultHandler-->msg:" + str);
            if (z4) {
                String[] split = str.split(",");
                String str2 = split[0];
                new File(str2).getName();
                if (split.length == 8 && Integer.parseInt(split[5]) < b.f71690g) {
                    c(str2);
                    return;
                } else if (this.f71704b > 10) {
                    if (Integer.parseInt(split[5]) - b.f71690g < 1048576.0d) {
                        i4 = this.f71704b - 5;
                    } else {
                        i4 = this.f71704b - 10;
                    }
                    b.this.l(this.f71705c, str2, this.f71703a, i4);
                    return;
                } else {
                    c(str2);
                    return;
                }
            }
            b(this.f71706d);
        }

        void b(String str) {
            w0.e("OptimResultHandler-->optimFailure");
            b.this.v(str, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageCompressor.java */
    /* loaded from: classes7.dex */
    public class d implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f71708a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f71709b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f71710c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f71711d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HashMap f71712e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f71713f;

        d(String str, int i4, Context context, List list, HashMap hashMap, f fVar) {
            this.f71708a = str;
            this.f71709b = i4;
            this.f71710c = context;
            this.f71711d = list;
            this.f71712e = hashMap;
            this.f71713f = fVar;
        }

        private void c(String str, String str2) {
            f fVar;
            w0.e("OptimResultHandler-->optimSuccess");
            this.f71712e.put(g2.f(str), str2);
            if (!b.t(this.f71712e) || (fVar = this.f71713f) == null) {
                return;
            }
            b.w(this.f71711d, this.f71712e, fVar);
        }

        @Override // net.bither.util.c.b
        public void a(boolean z4, String str) {
            int i4;
            w0.e("OptimResultHandler-->msg:" + str);
            if (z4) {
                String[] split = str.split(",");
                String str2 = split[0];
                if (split.length == 8 && Integer.parseInt(split[5]) < b.f71690g) {
                    c(str2, this.f71708a + net.lingala.zip4j.util.e.F0 + new File(str2).getName());
                    return;
                } else if (this.f71709b > 10) {
                    if (Integer.parseInt(split[5]) - b.f71690g < 1048576.0d) {
                        i4 = this.f71709b - 5;
                    } else {
                        i4 = this.f71709b - 10;
                    }
                    b.B(this.f71710c, str2, this.f71708a, i4, this.f71711d, this.f71712e, this.f71713f);
                    return;
                } else {
                    b();
                    return;
                }
            }
            b();
        }

        void b() {
            w0.e("OptimResultHandler-->optimFailure");
        }
    }

    /* compiled from: ImageCompressor.java */
    /* loaded from: classes7.dex */
    public interface e {
        void a(Boolean bool, Map<String, String> map, Map<String, Integer> map2);
    }

    /* compiled from: ImageCompressor.java */
    /* loaded from: classes7.dex */
    public interface f {
        void a(List<String> list);
    }

    static {
        int i4 = f71688e;
        f71689f = new net.bither.util.a(i4, i4, 500L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f71690g = 314572L;
        f71691h = 104857L;
        f71692i = Bitmap.CompressFormat.JPEG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void B(Context context, String str, String str2, int i4, List<String> list, HashMap<String, String> hashMap, f fVar) {
        String str3 = context.getFilesDir() + net.lingala.zip4j.util.e.F0 + "jpegoptim";
        if (!new File(str3).exists()) {
            net.bither.util.c.e(context, str3);
        }
        new net.bither.util.c(str3, str, str2, 1, i4, true).d(new d(str2, i4, context, list, hashMap, fVar));
    }

    public static void C(String str, String str2, int i4) {
        Bitmap l4;
        if (str == null) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    l4 = p1.l(str, i4);
                } catch (IOException e5) {
                    e5.printStackTrace();
                    return;
                }
            } catch (Exception e6) {
                e = e6;
            }
            if (l4 == null) {
                C(str, str2, i4 - 1);
                return;
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(str2);
            try {
                l4.compress(f71692i, 100, fileOutputStream2);
                fileOutputStream2.close();
            } catch (Exception e7) {
                fileOutputStream = fileOutputStream2;
                e = e7;
                e.printStackTrace();
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (Throwable th) {
                fileOutputStream = fileOutputStream2;
                th = th;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static int g(long j4) {
        int i4 = ((float) j4) - ((float) f71690g) < 1048576.0f ? 80 : 20;
        if (i4 < 1) {
            return 5;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str, String str2) {
        try {
            if (this.f71696c.containsKey(str)) {
                if (o(new File(str2)) < f71690g) {
                    v(str, 1);
                } else {
                    p1.n(p1.k(str), str2);
                    if (o(new File(str2)) < f71690g) {
                        v(str, 1);
                    } else {
                        v(str, 2);
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static boolean k(File file) {
        w0.e("deleteDir-->start delete dir " + file + " ...");
        if (file.isDirectory()) {
            if (s(file + "")) {
                String[] list = file.list();
                for (int i4 = 0; i4 < list.length; i4++) {
                    w0.e("deleteDir-->delete dir sub file " + list[i4] + " ...");
                    if (!k(new File(file, list[i4]))) {
                        return false;
                    }
                }
            }
        }
        w0.e("deleteDir-->finished delete dir " + file + " ...");
        return file.delete();
    }

    public static long o(File file) throws Exception {
        FileInputStream fileInputStream;
        if (file.exists()) {
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                long available = fileInputStream.available();
                fileInputStream.close();
                return available;
            } catch (Exception e6) {
                e = e6;
                fileInputStream2 = fileInputStream;
                e.printStackTrace();
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                    return 0L;
                }
                return 0L;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                throw th;
            }
        }
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        file.createNewFile();
        return 0L;
    }

    public static String p() {
        return "forum_image";
    }

    public static b q() {
        if (f71693j == null) {
            f71693j = new b();
        }
        return f71693j;
    }

    public static File r() {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        File file = new File(externalStorageDirectory, "MG/.cache/" + p());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static boolean s(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith(r() + "")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(HashMap<String, String> hashMap) {
        for (String str : hashMap.values()) {
            if (g2.h(str)) {
                return false;
            }
        }
        return true;
    }

    private void u(Boolean bool, Map<String, String> map, Map<String, Integer> map2) {
        List<e> list = this.f71697d;
        if (list != null) {
            for (e eVar : list) {
                eVar.a(bool, map, map2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void w(List<String> list, HashMap<String, String> hashMap, f fVar) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            arrayList.add(hashMap.get(g2.f(list.get(i4))));
        }
        fVar.a(arrayList);
    }

    public void A(String str) {
        v(str, 3);
    }

    public void e(e eVar) {
        if (this.f71697d == null) {
            this.f71697d = new ArrayList();
        }
        if (this.f71697d.contains(eVar)) {
            return;
        }
        this.f71697d.add(eVar);
    }

    public void f(String str) {
        v(str, -1);
    }

    public Boolean h() {
        Iterator<Map.Entry<String, Integer>> it2 = this.f71695b.entrySet().iterator();
        if (it2.hasNext()) {
            while (it2.hasNext()) {
                int intValue = it2.next().getValue().intValue();
                if (intValue != 1 && intValue != 2) {
                    return Boolean.FALSE;
                }
            }
        }
        return true;
    }

    public void j(Context context, String str, boolean z4) {
        w0.e("compressImage-->start notify task.." + str + " addTask=" + z4);
        this.f71694a = context;
        try {
            x(str, z4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        w0.e("compressImage-->finish notify task.." + str + " addTask=" + z4);
    }

    public void l(Context context, String str, String str2, int i4) {
        String str3 = context.getFilesDir() + net.lingala.zip4j.util.e.F0 + "jpegoptim";
        if (!new File(str3).exists()) {
            net.bither.util.c.e(context, str3);
        }
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        new net.bither.util.c(str3, str, str2, 1, i4, true).d(new c(str2, i4, context, str));
    }

    public void m(String str, String str2, Integer num) {
        w0.e("doCompress1-->start compress.." + str);
        try {
            NativeUtil.c(this.f71694a, str, str2, num.intValue(), true, new C0787b(str2, num));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void n(String str, String str2, Integer num) {
        try {
            long o4 = o(new File(str));
            Integer num2 = 100;
            while (o4 > f71690g) {
                w0.e("notifyCompressSate-->system compress tool start..", "quality=" + num2 + " size=" + o4);
                if (num2.intValue() > 10) {
                    num2 = Integer.valueOf(num2.intValue() - 10);
                    p1.o(p1.k(str), str2, num2.intValue());
                    o4 = o(new File(str2));
                } else {
                    w0.e("notifyCompressSate-->system compress tool =>", "result=fail");
                    v(str, 2);
                }
            }
            if (num2.intValue() == 100) {
                p1.o(p1.k(str), str2, num2.intValue());
            }
            long o5 = o(new File(str2));
            while (o5 > f71690g) {
                w0.e("notifyCompressSate-->system compress tool start..", "quality=" + num2 + " size=" + o5);
                if (num2.intValue() > 10) {
                    num2 = Integer.valueOf(num2.intValue() - 10);
                    p1.o(p1.k(str), str2, num2.intValue());
                    o5 = o(new File(str2));
                } else {
                    w0.e("notifyCompressSate-->system compress tool =>", "result=fail");
                    v(str, 2);
                }
            }
            w0.e("notifyCompressSate-->system compress tool =>", "quality=" + num2, "result=success");
            v(str, 1);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void v(String str, int i4) {
        long o4;
        try {
            w0.e("notifyCompressSate-->start notifyCompressSate.." + str + " state=" + i4);
            if (this.f71696c.containsKey(str)) {
                this.f71695b.put(str, Integer.valueOf(i4));
            }
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != 1 && i4 != 2) {
                        if (i4 == 3 && this.f71696c.containsKey(str)) {
                            File parentFile = new File(this.f71696c.get(str)).getParentFile();
                            if (parentFile.exists()) {
                                k(parentFile);
                            }
                            this.f71696c.remove(str);
                            this.f71695b.remove(str);
                        }
                    } else if (this.f71696c.containsKey(str)) {
                        y();
                    }
                } else if (!this.f71696c.containsKey(str)) {
                    String str2 = r() + net.lingala.zip4j.util.e.F0 + System.currentTimeMillis() + net.lingala.zip4j.util.e.F0 + g2.f(str) + ".jpg";
                    w0.e("notifyCompressSate-->put target to map.. destPath=" + str2 + "");
                    try {
                        if (str.contains("content://")) {
                            File o5 = g0.o(Uri.parse(str), this.f71694a);
                            str = o5.getAbsolutePath();
                            o4 = o(o5);
                        } else {
                            o4 = o(new File(str));
                        }
                        this.f71696c.put(str, str2);
                        this.f71695b.put(str, 0);
                        w0.e("notifyCompressSate-->src file size=" + o4);
                        double d5 = f71690g;
                        Double.isNaN(d5);
                        if (o4 < ((long) (d5 + 734003.2d))) {
                            w0.e("notifyCompressSate-->use system compress tool..");
                            n(str, str2, 40);
                        } else {
                            w0.e("notifyCompressSate-->use jpegbither compress tool..");
                            m(str, str2, 40);
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                } else {
                    v(str, 3);
                    v(str, 0);
                }
            } else if (!this.f71696c.containsKey(str)) {
                String str3 = r() + net.lingala.zip4j.util.e.F0 + System.currentTimeMillis() + net.lingala.zip4j.util.e.F0 + g2.f(str) + ".jpg";
                w0.e("notifyCompressSate-->put target to map.. destPath=" + str3 + "");
                this.f71696c.put(str, str3);
                this.f71695b.put(str, 0);
            }
            w0.e("notifyCompressSate-->finished notifyCompressSate.." + str + " state=" + i4);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public synchronized void x(String str, boolean z4) {
        if (z4) {
            f(str);
            f71689f.execute(new a(str));
        } else {
            A(str);
        }
    }

    public void y() {
        boolean booleanValue = h().booleanValue();
        if (booleanValue) {
            u(Boolean.valueOf(booleanValue), this.f71696c, this.f71695b);
        }
    }

    public void z(e eVar) {
        List<e> list = this.f71697d;
        if (list == null || !list.contains(eVar)) {
            return;
        }
        this.f71697d.remove(eVar);
    }
}
