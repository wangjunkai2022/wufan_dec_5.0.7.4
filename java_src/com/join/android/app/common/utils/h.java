package com.join.android.app.common.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.common.statfs.StatFsHelper;
import com.join.mgps.Util.h0;
import com.kuaishou.weapon.p0.t;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DimenDPThread.java */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: b  reason: collision with root package name */
    private static int f14873b = 720;

    /* renamed from: c  reason: collision with root package name */
    private static List<a> f14874c;

    /* renamed from: a  reason: collision with root package name */
    private String f14875a;

    /* compiled from: DimenDPThread.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f14876a;

        /* renamed from: b  reason: collision with root package name */
        private int f14877b;

        public a(int i4, int i5) {
            this.f14876a = i4;
            this.f14877b = i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.f14876a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int d() {
            return this.f14877b;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f14874c = arrayList;
        arrayList.add(new a(240, f14873b));
        f14874c.add(new a(320, f14873b));
        f14874c.add(new a(360, f14873b));
        f14874c.add(new a(384, f14873b));
        f14874c.add(new a(392, f14873b));
        f14874c.add(new a(StatFsHelper.f10899h, f14873b));
        f14874c.add(new a(TTAdConstant.IMAGE_LIST_SIZE_CODE, f14873b));
        f14874c.add(new a(TTAdConstant.IMAGE_CODE, f14873b));
        f14874c.add(new a(TypedValues.CycleType.TYPE_EASING, f14873b));
        f14874c.add(new a(430, f14873b));
        f14874c.add(new a(432, f14873b));
        f14874c.add(new a(440, f14873b));
        f14874c.add(new a(480, f14873b));
        f14874c.add(new a(533, f14873b));
        f14874c.add(new a(592, f14873b));
        f14874c.add(new a(600, f14873b));
        f14874c.add(new a(640, f14873b));
        f14874c.add(new a(662, f14873b));
        f14874c.add(new a(720, f14873b));
        f14874c.add(new a(768, f14873b));
        f14874c.add(new a(800, f14873b));
        f14874c.add(new a(811, f14873b));
    }

    public h() {
        StringBuilder sb = new StringBuilder();
        String str = File.separator;
        sb.append(str);
        sb.append("test");
        sb.append(str);
        this.f14875a = sb.toString();
    }

    public static void a(String[] strArr) {
        File file = new File(new File(h0.f27805a), "src/test/res/");
        h hVar = new h();
        hVar.c(file.getPath());
        hVar.b();
    }

    private void e(File file, StringBuffer stringBuffer, a aVar) {
        Throwable th;
        BufferedWriter bufferedWriter;
        int i4;
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8"));
                } catch (IOException e5) {
                    e = e5;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                bufferedWriter.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
                bufferedWriter.write("<resources>\n");
                StringBuffer stringBuffer2 = new StringBuffer();
                for (i4 = 1; i4 < 1281; i4++) {
                    stringBuffer.setLength(0);
                    stringBuffer.append("    <dimen name=\"wdp" + i4 + "\">");
                    double c5 = (double) aVar.c();
                    double d5 = aVar.d();
                    Double.isNaN(c5);
                    Double.isNaN(d5);
                    double d6 = c5 / d5;
                    double d7 = i4;
                    Double.isNaN(d7);
                    stringBuffer.append(new BigDecimal(d6 * d7).setScale(2, 4).doubleValue() + "dp</dimen>\n");
                    bufferedWriter.write(stringBuffer.toString());
                    if (i4 >= 5 && i4 <= 50) {
                        stringBuffer2.append("    <dimen name=\"spx_" + i4 + "\">");
                        double c6 = (double) aVar.c();
                        double d8 = aVar.d();
                        Double.isNaN(c6);
                        Double.isNaN(d8);
                        Double.isNaN(d7);
                        stringBuffer2.append(new BigDecimal((c6 / d8) * d7).setScale(2, 4).doubleValue() + "sp</dimen>\n");
                    }
                }
                bufferedWriter.write("\n");
                bufferedWriter.write("    /**********字体适配***************/\n");
                bufferedWriter.write("\n");
                bufferedWriter.write(stringBuffer2.toString());
                bufferedWriter.write("</resources>");
                bufferedWriter.close();
            } catch (IOException e6) {
                e = e6;
                bufferedWriter2 = bufferedWriter;
                e.printStackTrace();
                bufferedWriter2.close();
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter2 = bufferedWriter;
                try {
                    bufferedWriter2.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
                throw th;
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    public void b() {
        if ("".equals(this.f14875a)) {
            System.out.print("path为空");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i4 = 0; i4 < f14874c.size(); i4++) {
            a aVar = f14874c.get(i4);
            String str = this.f14875a + File.separator + "values-sw" + aVar.c() + t.f55698q;
            System.out.print("写入文件：" + str + "\n");
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "dimen.xml");
            file2.delete();
            e(file2, stringBuffer, aVar);
        }
    }

    public void c(String str) {
        this.f14875a = str;
    }

    public void d(int i4) {
        f14873b = i4;
    }
}
