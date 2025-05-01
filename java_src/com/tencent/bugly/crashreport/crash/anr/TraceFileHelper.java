package com.tencent.bugly.crashreport.crash.anr;

import com.j256.ormlite.stmt.query.SimpleComparison;
import com.tencent.bugly.proguard.x;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public class TraceFileHelper {

    /* compiled from: BUGLY */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f62354a;

        /* renamed from: b  reason: collision with root package name */
        public String f62355b;

        /* renamed from: c  reason: collision with root package name */
        public long f62356c;

        /* renamed from: d  reason: collision with root package name */
        public Map<String, String[]> f62357d;
    }

    /* compiled from: BUGLY */
    /* loaded from: classes5.dex */
    public interface b {
        boolean a(long j4);

        boolean a(long j4, long j5, String str);

        boolean a(String str, int i4, String str2, String str3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
        r5 = r8[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r5.matcher(r1).matches() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        return new java.lang.Object[]{r5, r1};
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
        if (r8 != null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0006, code lost:
        r1 = r7.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000a, code lost:
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000c, code lost:
        r2 = r8.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
        if (r4 >= r2) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object[] a(java.io.BufferedReader r7, java.util.regex.Pattern... r8) throws java.io.IOException {
        /*
            r0 = 0
            if (r7 == 0) goto L29
            if (r8 != 0) goto L6
            goto L29
        L6:
            java.lang.String r1 = r7.readLine()
            if (r1 == 0) goto L29
            int r2 = r8.length
            r3 = 0
            r4 = 0
        Lf:
            if (r4 >= r2) goto L6
            r5 = r8[r4]
            java.util.regex.Matcher r6 = r5.matcher(r1)
            boolean r6 = r6.matches()
            if (r6 == 0) goto L26
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r3] = r5
            r8 = 1
            r7[r8] = r1
            return r7
        L26:
            int r4 = r4 + 1
            goto Lf
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.a(java.io.BufferedReader, java.util.regex.Pattern[]):java.lang.Object[]");
    }

    private static String b(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null || readLine.trim().length() <= 0) {
                break;
            }
            stringBuffer.append(readLine + "\n");
        }
        return stringBuffer.toString();
    }

    public static a readFirstDumpInfo(String str, final boolean z4) {
        if (str == null) {
            x.e("path:%s", str);
            return null;
        }
        final a aVar = new a();
        readTraceFile(str, new b() { // from class: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.2
            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
            public final boolean a(String str2, int i4, String str3, String str4) {
                x.c("new thread %s", str2);
                a aVar2 = a.this;
                if (aVar2.f62357d == null) {
                    aVar2.f62357d = new HashMap();
                }
                Map<String, String[]> map = a.this.f62357d;
                StringBuilder sb = new StringBuilder();
                sb.append(i4);
                map.put(str2, new String[]{str3, str4, sb.toString()});
                return true;
            }

            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
            public final boolean a(long j4, long j5, String str2) {
                x.c("new process %s", str2);
                a aVar2 = a.this;
                aVar2.f62354a = j4;
                aVar2.f62355b = str2;
                aVar2.f62356c = j5;
                return z4;
            }

            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
            public final boolean a(long j4) {
                x.c("process end %d", Long.valueOf(j4));
                return false;
            }
        });
        if (aVar.f62354a <= 0 || aVar.f62356c <= 0 || aVar.f62355b == null) {
            x.e("first dump error %s", aVar.f62354a + " " + aVar.f62356c + " " + aVar.f62355b);
            return null;
        }
        return aVar;
    }

    public static a readTargetDumpInfo(final String str, String str2, final boolean z4) {
        if (str != null && str2 != null) {
            final a aVar = new a();
            readTraceFile(str2, new b() { // from class: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.1
                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
                public final boolean a(String str3, int i4, String str4, String str5) {
                    x.c("new thread %s", str3);
                    a aVar2 = a.this;
                    if (aVar2.f62354a > 0 && aVar2.f62356c > 0 && aVar2.f62355b != null) {
                        if (aVar2.f62357d == null) {
                            aVar2.f62357d = new HashMap();
                        }
                        Map<String, String[]> map = a.this.f62357d;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i4);
                        map.put(str3, new String[]{str4, str5, sb.toString()});
                    }
                    return true;
                }

                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
                public final boolean a(long j4, long j5, String str3) {
                    x.c("new process %s", str3);
                    if (str3.equals(str)) {
                        a aVar2 = a.this;
                        aVar2.f62354a = j4;
                        aVar2.f62355b = str3;
                        aVar2.f62356c = j5;
                        return z4;
                    }
                    return true;
                }

                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
                public final boolean a(long j4) {
                    x.c("process end %d", Long.valueOf(j4));
                    a aVar2 = a.this;
                    return aVar2.f62354a <= 0 || aVar2.f62356c <= 0 || aVar2.f62355b == null;
                }
            });
            if (aVar.f62354a > 0 && aVar.f62356c > 0 && aVar.f62355b != null) {
                return aVar;
            }
        }
        return null;
    }

    public static void readTraceFile(String str, b bVar) {
        Throwable th;
        BufferedReader bufferedReader;
        if (str == null || bVar == null) {
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            return;
        }
        file.lastModified();
        file.length();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
        }
        try {
            Pattern compile = Pattern.compile("-{5}\\spid\\s\\d+\\sat\\s\\d+-\\d+-\\d+\\s\\d{2}:\\d{2}:\\d{2}\\s-{5}");
            Pattern compile2 = Pattern.compile("-{5}\\send\\s\\d+\\s-{5}");
            Pattern compile3 = Pattern.compile("Cmd\\sline:\\s(\\S+)");
            Pattern compile4 = Pattern.compile("\".+\"\\s(daemon\\s){0,1}prio=\\d+\\stid=\\d+\\s.*");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            while (true) {
                Object[] a5 = a(bufferedReader, compile);
                if (a5 != null) {
                    String[] split = a5[1].toString().split("\\s");
                    long parseLong = Long.parseLong(split[2]);
                    long time = simpleDateFormat.parse(split[4] + " " + split[5]).getTime();
                    Object[] a6 = a(bufferedReader, compile3);
                    if (a6 == null) {
                        try {
                            bufferedReader.close();
                            return;
                        } catch (IOException e6) {
                            if (x.a(e6)) {
                                return;
                            }
                            e6.printStackTrace();
                            return;
                        }
                    }
                    Matcher matcher = compile3.matcher(a6[1].toString());
                    matcher.find();
                    matcher.group(1);
                    SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
                    if (!bVar.a(parseLong, time, matcher.group(1))) {
                        try {
                            bufferedReader.close();
                            return;
                        } catch (IOException e7) {
                            if (x.a(e7)) {
                                return;
                            }
                            e7.printStackTrace();
                            return;
                        }
                    }
                    while (true) {
                        Object[] a7 = a(bufferedReader, compile4, compile2);
                        if (a7 == null) {
                            break;
                        } else if (a7[0] == compile4) {
                            String obj = a7[1].toString();
                            Matcher matcher2 = Pattern.compile("\".+\"").matcher(obj);
                            matcher2.find();
                            String group = matcher2.group();
                            String substring = group.substring(1, group.length() - 1);
                            obj.contains("NATIVE");
                            Matcher matcher3 = Pattern.compile("tid=\\d+").matcher(obj);
                            matcher3.find();
                            String group2 = matcher3.group();
                            bVar.a(substring, Integer.parseInt(group2.substring(group2.indexOf(SimpleComparison.EQUAL_TO_OPERATION) + 1)), a(bufferedReader), b(bufferedReader));
                        } else if (!bVar.a(Long.parseLong(a7[1].toString().split("\\s")[2]))) {
                            try {
                                bufferedReader.close();
                                return;
                            } catch (IOException e8) {
                                if (x.a(e8)) {
                                    return;
                                }
                                e8.printStackTrace();
                                return;
                            }
                        }
                    }
                    simpleDateFormat = simpleDateFormat2;
                } else {
                    try {
                        bufferedReader.close();
                        return;
                    } catch (IOException e9) {
                        if (x.a(e9)) {
                            return;
                        }
                        e9.printStackTrace();
                        return;
                    }
                }
            }
        } catch (Exception e10) {
            e = e10;
            bufferedReader2 = bufferedReader;
            if (!x.a(e)) {
                e.printStackTrace();
            }
            x.d("trace open fail:%s : %s", e.getClass().getName(), e.getMessage());
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e11) {
                    if (x.a(e11)) {
                        return;
                    }
                    e11.printStackTrace();
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e12) {
                    if (!x.a(e12)) {
                        e12.printStackTrace();
                    }
                }
            }
            throw th;
        }
    }

    private static String a(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i4 = 0; i4 < 3; i4++) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return null;
            }
            stringBuffer.append(readLine + "\n");
        }
        return stringBuffer.toString();
    }
}
