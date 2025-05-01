package com.bytedance.pangle.f.a;

import android.content.pm.PackageInfo;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.pangle.util.g;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.io.File;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* loaded from: classes2.dex */
public final class d {
    public static e a(File file) {
        ZipFile zipFile;
        a aVar;
        int b5;
        int i4;
        try {
            if (!file.exists()) {
                ZeusLogger.w(ZeusLogger.TAG_INSTALL, file.getAbsolutePath() + " not exists!");
                g.a((ZipFile) null);
                return null;
            }
            ZipFile zipFile2 = new ZipFile(file);
            try {
                ZipEntry entry = zipFile2.getEntry("AndroidManifest.xml");
                if (entry == null) {
                    ZeusLogger.errReport(ZeusLogger.TAG_INSTALL, "没有找到AndroidManifest.xml entry");
                    g.a(zipFile2);
                    return null;
                }
                aVar = new a();
                try {
                    InputStream inputStream = zipFile2.getInputStream(entry);
                    aVar.a();
                    if (inputStream != null) {
                        aVar.f8366b = new b(inputStream);
                    }
                    do {
                        b5 = aVar.b();
                        if (b5 == 1) {
                            ZeusLogger.errReport(ZeusLogger.TAG_INSTALL, "已达到END_DOCUMENT");
                            try {
                                aVar.a();
                            } catch (Throwable unused) {
                            }
                            g.a(zipFile2);
                            return null;
                        }
                    } while (b5 != 2);
                    int length = aVar.f8365a != 2 ? -1 : aVar.f8367c.length / 5;
                    String str = null;
                    String str2 = null;
                    for (int i5 = 0; i5 != length; i5++) {
                        if (TTDownloadField.TT_VERSION_CODE.equals(aVar.a(i5))) {
                            str = a(aVar, i5);
                        } else if ("package".equals(aVar.a(i5))) {
                            str2 = a(aVar, i5);
                        }
                    }
                    try {
                        i4 = Integer.parseInt(str);
                    } catch (Throwable unused2) {
                        i4 = -1;
                    }
                    if (i4 == -1) {
                        ZeusLogger.errReport(ZeusLogger.TAG_INSTALL, "versionCode获取失败:".concat(String.valueOf(str)));
                        try {
                            aVar.a();
                        } catch (Throwable unused3) {
                        }
                        g.a(zipFile2);
                        return null;
                    }
                    e eVar = new e(str2, i4);
                    try {
                        aVar.a();
                    } catch (Throwable unused4) {
                    }
                    g.a(zipFile2);
                    return eVar;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    zipFile = zipFile2;
                    th = th2;
                    try {
                        PackageInfo packageArchiveInfo = Zeus.getAppApplication().getPackageManager().getPackageArchiveInfo(file.getPath(), 0);
                        if (packageArchiveInfo == null) {
                            ZeusLogger.errReport(ZeusLogger.TAG_INSTALL, "packageArchiveInfo == null", th);
                            return null;
                        }
                        e eVar2 = new e(packageArchiveInfo.packageName, packageArchiveInfo.versionCode);
                        if (aVar != null) {
                            try {
                                aVar.a();
                            } catch (Throwable unused5) {
                            }
                        }
                        g.a(zipFile);
                        return eVar2;
                    } finally {
                        if (aVar != null) {
                            try {
                                aVar.a();
                            } catch (Throwable unused6) {
                            }
                        }
                        g.a(zipFile);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                aVar = null;
            }
        } catch (Throwable th4) {
            th = th4;
            zipFile = null;
            aVar = null;
        }
    }

    private static String a(int i4) {
        return (i4 >>> 24) == 1 ? "android:" : "";
    }

    private static String a(a aVar, int i4) {
        int b5 = aVar.b(i4);
        int c5 = aVar.c(i4);
        if (b5 == 3) {
            return aVar.d(i4);
        }
        return b5 == 2 ? String.format("?%s%08X", a(c5), Integer.valueOf(c5)) : (b5 < 16 || b5 > 31) ? String.format("<0x%X, type 0x%02X>", Integer.valueOf(c5), Integer.valueOf(b5)) : String.valueOf(c5);
    }
}
