package com.join.mgps.Util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.dto.Filepath;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/* compiled from: SDCardPathUtil.java */
/* loaded from: classes.dex */
public class s1 {
    public static List<Filepath> a(Context context) {
        boolean mkdirs;
        SharedPreferences sharedPreferences = context.getSharedPreferences("PrefDef", 4);
        if (sharedPreferences.getBoolean("isFirst35", true) && sharedPreferences.getBoolean("firstShowUserPermiss", true)) {
            return new ArrayList();
        }
        v0.d("sdCard ", "startTime " + System.currentTimeMillis());
        StorageManager storageManager = (StorageManager) context.getSystemService("storage");
        List<Filepath> arrayList = new ArrayList<>();
        String str = v.f28106f;
        PrefDef_ prefDef_ = new PrefDef_(context);
        if (!prefDef_.sdcardisFirst().d().booleanValue()) {
            String d5 = prefDef_.sdcardData().d();
            if (g2.i(d5)) {
                arrayList = (List) JsonMapper.getInstance().fromJson(d5, JsonMapper.getInstance().createCollectionType(List.class, Filepath.class));
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (arrayList.size() > 0) {
            for (Filepath filepath : arrayList) {
                filepath.setAllsize(b(filepath.getPathRoot()));
                filepath.setAvailable(c(filepath.getPathRoot()));
            }
        } else {
            try {
                String[] strArr = (String[]) storageManager.getClass().getMethod("getVolumePaths", new Class[0]).invoke(storageManager, new Object[0]);
                if (strArr == null) {
                    String str2 = v.f28106f;
                    Filepath filepath2 = new Filepath();
                    filepath2.setPathHome(str2);
                    filepath2.setIslocal(true);
                    filepath2.setAllsize(b(v.f28104d));
                    filepath2.setAvailable(c(v.f28104d));
                    filepath2.setPathRoot(v.f28104d);
                    arrayList.add(filepath2);
                    return arrayList;
                }
                try {
                    File file = new File(v.f28104d + "/mgpapa/");
                    File file2 = new File(v.f28104d + "/wufan91/");
                    if (file.exists() && !file2.exists()) {
                        file2.mkdirs();
                        UtilsMy.delete(file2);
                        if (file.renameTo(file2)) {
                            for (DownloadTask downloadTask : p1.f.K().d()) {
                                if (Dtype.apk.name().equals(downloadTask.getFileType())) {
                                    String replace = downloadTask.getGameZipPath().replace(file.getAbsolutePath(), file2.getAbsolutePath());
                                    if (new File(replace).exists()) {
                                        downloadTask.setGameZipPath(replace);
                                        downloadTask.setPath(replace);
                                        p1.f.K().m(downloadTask);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    File file3 = new File(strArr[i4]);
                    if (file3.isDirectory()) {
                        Filepath filepath3 = new Filepath();
                        String str3 = strArr[i4];
                        String absolutePath = file3.getAbsolutePath();
                        String format = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
                        File file4 = new File(absolutePath, "test_" + format);
                        if (file4.mkdirs()) {
                            UtilsMy.delete(file4);
                            if (!str3.contains("1") && !str3.contains("extSdCard") && !str3.contains("sdcard_ext") && !str3.contains("sdcard-ext") && !str3.contains("ext_sdcard") && !str3.contains("SD_CARD") && !str3.contains("sdcard2") && !str3.contains("extra_sd") && !str3.contains("extrasd_bind") && !str3.contains("ext_sd") && !str3.contains("external_SD") && !str3.contains("extSdCard ") && !str3.contains("ext") && !str3.contains("AA58-160F")) {
                                filepath3.setPathHome(str3 + "/wufan91/");
                                filepath3.setIslocal(true);
                                if (arrayList.size() > 0 && arrayList.get(0).isIslocal()) {
                                    filepath3.setIslocal(false);
                                    filepath3.setAllsize(b(strArr[i4]));
                                    filepath3.setAvailable(c(strArr[i4]));
                                    filepath3.setPathRoot(str3);
                                    arrayList.add(filepath3);
                                } else {
                                    filepath3.setAllsize(b(strArr[i4]));
                                    filepath3.setAvailable(c(strArr[i4]));
                                    filepath3.setPathRoot(str3);
                                    arrayList.add(filepath3);
                                }
                            } else {
                                filepath3.setPathHome(str3 + "/wufan91/");
                                filepath3.setIslocal(false);
                                filepath3.setAllsize(b(str3 + ""));
                                filepath3.setAvailable(c(str3 + ""));
                                filepath3.setPathRoot(str3);
                                arrayList.add(filepath3);
                            }
                        } else if ((str3.endsWith("0") && !str3.contains("AA58-160F")) || str3.endsWith("/sdcard")) {
                            filepath3.setPathHome(str3 + "/wufan91/");
                            filepath3.setIslocal(true);
                            if (arrayList.size() <= 0 || !arrayList.get(0).isIslocal()) {
                                filepath3.setAllsize(b(strArr[i4]));
                                filepath3.setAvailable(c(strArr[i4]));
                                filepath3.setPathRoot(str3);
                                arrayList.add(filepath3);
                            }
                        } else {
                            if (b(strArr[i4]) > 0 && c(strArr[i4]) == 0 && Build.VERSION.SDK_INT < 19) {
                                String str4 = str3 + "/wufan91/";
                                File file5 = new File(str4, "test_" + format);
                                if (file5.exists()) {
                                    mkdirs = true;
                                } else {
                                    mkdirs = file5.mkdirs();
                                    if (mkdirs) {
                                        UtilsMy.delete(file5);
                                    }
                                }
                                filepath3.setPathHome(str4);
                            } else if (b(strArr[i4]) > 0) {
                                String str5 = str3 + "/Android/data/" + context.getPackageName() + "/wufan91/";
                                if (Build.VERSION.SDK_INT >= 19) {
                                    context.getExternalFilesDirs(null);
                                } else {
                                    new File(str5).getParentFile().mkdirs();
                                }
                                filepath3.setPathHome(str5);
                                File file6 = new File(str5);
                                mkdirs = !file6.exists() ? file6.mkdirs() : true;
                            }
                            filepath3.setIslocal(false);
                            filepath3.setAllsize(b(strArr[i4]));
                            filepath3.setAvailable(c(strArr[i4]));
                            filepath3.setPathRoot(str3);
                            if (mkdirs) {
                                arrayList.add(filepath3);
                            }
                        }
                    }
                }
                if (arrayList.size() == 0) {
                    String str6 = v.f28106f;
                    Filepath filepath4 = new Filepath();
                    filepath4.setPathHome(str6);
                    filepath4.setIslocal(true);
                    filepath4.setAllsize(b(v.f28104d));
                    filepath4.setAvailable(c(v.f28104d));
                    filepath4.setPathRoot(v.f28104d);
                    arrayList.add(filepath4);
                }
                String json = JsonMapper.getInstance().toJson(arrayList);
                prefDef_.sdcardisFirst().g(Boolean.FALSE);
                prefDef_.sdcardData().g(json);
            } catch (Exception unused) {
                String str7 = v.f28106f;
                Filepath filepath5 = new Filepath();
                filepath5.setPathHome(str7);
                filepath5.setIslocal(true);
                filepath5.setAllsize(b(v.f28104d));
                filepath5.setAvailable(c(v.f28104d));
                filepath5.setPathRoot(v.f28104d);
                arrayList.add(filepath5);
                return arrayList;
            }
        }
        v0.d("sdCard ", "EndTime " + System.currentTimeMillis());
        return arrayList;
    }

    public static long b(String str) {
        try {
            return new StatFs(str).getTotalBytes();
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0L;
        }
    }

    public static long c(String str) {
        try {
            return new StatFs(new File(str).getPath()).getAvailableBytes();
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0L;
        }
    }

    public static File d(Context context, String str) {
        try {
            File e5 = e(context, str);
            if (e5 == null) {
                e5 = f(context, str);
            }
            if (e5 != null && !e5.exists()) {
                e5.mkdirs();
            }
            return e5;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static File e(Context context, String str) {
        File externalFilesDir;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            if (TextUtils.isEmpty(str)) {
                externalFilesDir = context.getExternalCacheDir();
            } else {
                externalFilesDir = context.getExternalFilesDir(str);
            }
            if (externalFilesDir == null) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                externalFilesDir = new File(externalStorageDirectory, "Android/data/" + context.getPackageName() + "/cache/" + str);
            }
            if (externalFilesDir.exists()) {
                return externalFilesDir;
            }
            externalFilesDir.mkdirs();
            return externalFilesDir;
        }
        return null;
    }

    public static File f(Context context, String str) {
        File file;
        if (TextUtils.isEmpty(str)) {
            file = context.getCacheDir();
        } else {
            file = new File(context.getFilesDir(), str);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String g() {
        return Environment.getExternalStorageDirectory().getPath();
    }

    public static String h(Context context) {
        String str = com.join.mgps.pref.h.n(context).g() + "papaCache";
        if (g2.h(str)) {
            return Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "papaCache";
        }
        return str;
    }
}
