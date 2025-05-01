package com.alipay.security.mobile.module.commonutils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/* loaded from: classes2.dex */
public final class c {
    public static String a(String str, String str2) {
        FileReader fileReader = null;
        try {
            try {
                File file = new File(str, str2);
                if (file.exists()) {
                    char[] cArr = new char[(int) file.length()];
                    FileReader fileReader2 = new FileReader(file);
                    try {
                        fileReader2.read(cArr);
                        String valueOf = String.valueOf(cArr);
                        try {
                            fileReader2.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                        return valueOf;
                    } catch (Exception e6) {
                        e = e6;
                        fileReader = fileReader2;
                        e.getMessage();
                        try {
                            fileReader.close();
                            return "";
                        } catch (IOException e7) {
                            e7.printStackTrace();
                            return "";
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileReader = fileReader2;
                        try {
                            fileReader.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                        throw th;
                    }
                }
                throw null;
            } catch (Exception e9) {
                e = e9;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean b(String str) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            for (int i4 = 0; i4 < length; i4++) {
                if (!Character.isWhitespace(str.charAt(i4))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void c(String str, String str2) {
        FileWriter fileWriter;
        Throwable th;
        File file = new File(str);
        FileWriter fileWriter2 = null;
        try {
            fileWriter = new FileWriter(file, false);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            fileWriter = null;
            th = th2;
        }
        try {
            fileWriter.write(str2);
            try {
                fileWriter.close();
            } catch (IOException unused2) {
            }
        } catch (Exception unused3) {
            fileWriter2 = fileWriter;
            if (fileWriter2 != null) {
                try {
                    fileWriter2.close();
                } catch (IOException unused4) {
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    private static boolean d(String str) {
        File file = new File(str);
        if (!file.exists()) {
            try {
                return file.createNewFile();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static long e(String str, String str2) {
        File file = new File(str, str2);
        if (file.exists()) {
            return file.length();
        }
        return 0L;
    }

    private static boolean f(String str) {
        File file = new File(str);
        if (file.exists()) {
            return false;
        }
        return file.mkdirs();
    }
}
