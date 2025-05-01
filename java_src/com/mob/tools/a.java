package com.mob.tools;

import android.text.TextUtils;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.commons.v;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ResHelper;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.util.HashSet;
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f56561a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f56562b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private volatile HashSet<String> f56563c = new HashSet<>();

    /* renamed from: d  reason: collision with root package name */
    private File f56564d;

    /* renamed from: e  reason: collision with root package name */
    private int f56565e;

    /* renamed from: f  reason: collision with root package name */
    private String f56566f;

    /* renamed from: com.mob.tools.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0555a {
        void a(String str);

        boolean a(DH.DHResponse dHResponse);
    }

    public a(String str, String str2, int i4) {
        this.f56565e = i4;
        if (str2 == null) {
            str2 = "null";
        } else if (TextUtils.isDigitsOnly(str2)) {
            str2 = str + str2;
        }
        this.f56566f = str2;
        File dataCacheFile = ResHelper.getDataCacheFile(MobSDK.getContextSafely(), str);
        this.f56564d = dataCacheFile;
        if (dataCacheFile.isDirectory()) {
            return;
        }
        this.f56564d.mkdirs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        synchronized (this.f56563c) {
            this.f56563c.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        synchronized (this.f56563c) {
            if (this.f56563c.contains(str)) {
                return true;
            }
            this.f56563c.add(str);
            return false;
        }
    }

    public void a(String str) throws Throwable {
        a(str, false);
    }

    public void a(String str, boolean z4) throws Throwable {
        FileWriter fileWriter;
        String name;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String encodeToString = Base64.encodeToString(str.getBytes("utf-8"), 2);
        if (TextUtils.isEmpty(encodeToString)) {
            return;
        }
        synchronized (f56561a) {
            File a5 = a(z4);
            BufferedWriter bufferedWriter = null;
            try {
                fileWriter = new FileWriter(a5, true);
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter);
                    try {
                        bufferedWriter2.newLine();
                        bufferedWriter2.write(encodeToString);
                        v.a(bufferedWriter2, fileWriter);
                        name = a5.getName();
                    } catch (Throwable th) {
                        th = th;
                        bufferedWriter = bufferedWriter2;
                        MobLog.getInstance().d(th);
                        v.a(bufferedWriter, fileWriter);
                        name = a5.getName();
                        c(name);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                fileWriter = null;
            }
            c(name);
        }
    }

    private File a(boolean z4) {
        File file;
        File[] listFiles = this.f56564d.listFiles();
        int i4 = 5;
        int i5 = 3;
        char c5 = 2;
        if (listFiles != null && listFiles.length > 0) {
            int length = listFiles.length;
            int i6 = 0;
            int i7 = 1;
            while (i6 < length) {
                File file2 = listFiles[i6];
                String name = file2.getName();
                if (name.startsWith(this.f56566f)) {
                    String[] split = name.split("_");
                    if (!z4 && split.length == i5) {
                        try {
                            int parseInt = Integer.parseInt(split[c5]);
                            if (parseInt < this.f56565e && !b(name)) {
                                File file3 = this.f56564d;
                                Object[] objArr = new Object[i4];
                                objArr[0] = this.f56566f;
                                objArr[1] = "_";
                                objArr[2] = Integer.valueOf(i7);
                                objArr[3] = "_";
                                objArr[4] = Integer.valueOf(parseInt + 1);
                                File file4 = new File(file3, a(objArr));
                                return file2.renameTo(file4) ? file4 : file2;
                            }
                        } catch (Throwable th) {
                            MobLog.getInstance().d(th);
                        }
                    }
                    if (split.length > 1) {
                        try {
                            if (Integer.parseInt(split[1]) == i7) {
                                i7++;
                            }
                        } catch (Throwable th2) {
                            MobLog.getInstance().d(th2);
                        }
                    }
                }
                i6++;
                i4 = 5;
                i5 = 3;
                c5 = 2;
            }
            file = new File(this.f56564d, a(this.f56566f, "_", Integer.valueOf(i7), "_", 0));
        } else {
            file = new File(this.f56564d, a(this.f56566f, "_", 1, "_", 0));
        }
        try {
            file.createNewFile();
        } catch (Throwable unused) {
        }
        return file;
    }

    public void a(final InterfaceC0555a interfaceC0555a) {
        if (interfaceC0555a == null) {
            return;
        }
        synchronized (f56562b) {
            final File[] listFiles = this.f56564d.listFiles(new FilenameFilter() { // from class: com.mob.tools.a.1
                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str) {
                    return !TextUtils.isEmpty(str) && str.startsWith(a.this.f56566f);
                }
            });
            if (listFiles != null && listFiles.length > 0) {
                DH.requester(MobSDK.getContext()).getDetailNetworkTypeForStatic().getAppName().getDeviceKey().getODH().request(new DH.DHResponder() { // from class: com.mob.tools.a.2
                    @Override // com.mob.tools.utils.DH.DHResponder
                    public void onResponse(DH.DHResponse dHResponse) {
                        File[] fileArr;
                        BufferedReader bufferedReader;
                        for (File file : listFiles) {
                            String name = file.getName();
                            if (!a.this.b(name)) {
                                FileReader fileReader = null;
                                try {
                                    FileReader fileReader2 = new FileReader(file);
                                    try {
                                        bufferedReader = new BufferedReader(fileReader2);
                                        while (true) {
                                            try {
                                                String readLine = bufferedReader.readLine();
                                                if (readLine == null) {
                                                    break;
                                                }
                                                interfaceC0555a.a(new String(Base64.decode(readLine, 2), "utf-8"));
                                            } catch (Throwable th) {
                                                th = th;
                                                fileReader = fileReader2;
                                                try {
                                                    MobLog.getInstance().d(th);
                                                    v.a(bufferedReader, fileReader);
                                                    a.this.c(name);
                                                } catch (Throwable th2) {
                                                    v.a(bufferedReader, fileReader);
                                                    a.this.c(name);
                                                    throw th2;
                                                }
                                            }
                                        }
                                        if (interfaceC0555a.a(dHResponse)) {
                                            MobLog.getInstance().d("[LGSM] D l", new Object[0]);
                                            file.delete();
                                        }
                                        v.a(bufferedReader, fileReader2);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bufferedReader = null;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    bufferedReader = null;
                                }
                                a.this.c(name);
                            }
                        }
                    }
                });
            }
        }
    }

    public void a(long j4) {
        synchronized (f56562b) {
            File[] listFiles = this.f56564d.listFiles(new FilenameFilter() { // from class: com.mob.tools.a.3
                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str) {
                    return !TextUtils.isEmpty(str) && str.startsWith(a.this.f56566f);
                }
            });
            if (listFiles != null && listFiles.length > 0) {
                long j5 = 0;
                for (File file : listFiles) {
                    j5 += file.length();
                }
                if (j5 >= j4) {
                    for (File file2 : listFiles) {
                        file2.delete();
                    }
                }
            }
        }
    }

    private static String a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            sb.append(obj);
        }
        return sb.toString();
    }
}
