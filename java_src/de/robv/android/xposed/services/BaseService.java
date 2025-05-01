package de.robv.android.xposed.services;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import net.lingala.zip4j.util.e;
/* loaded from: classes6.dex */
public abstract class BaseService {
    public static final int F_OK = 0;
    public static final int R_OK = 4;
    public static final int W_OK = 2;
    public static final int X_OK = 1;

    static void ensureAbsolutePath(String str) {
        if (str.startsWith(e.F0)) {
            return;
        }
        throw new IllegalArgumentException("Only absolute filenames are allowed: " + str);
    }

    static void throwCommonIOException(int i4, String str, String str2, String str3) throws IOException {
        if (i4 != 1) {
            if (i4 == 2) {
                if (str == null) {
                    str = "No such file or directory: " + str2;
                }
                throw new FileNotFoundException(str);
            } else if (i4 == 12) {
                throw new OutOfMemoryError(str);
            } else {
                if (i4 != 13) {
                    if (i4 != 21) {
                        if (str == null) {
                            str = "Error " + i4 + str3 + str2;
                        }
                        throw new IOException(str);
                    }
                    if (str == null) {
                        str = "Is a directory: " + str2;
                    }
                    throw new FileNotFoundException(str);
                }
            }
        }
        if (str == null) {
            str = "Permission denied: " + str2;
        }
        throw new FileNotFoundException(str);
    }

    public abstract boolean checkFileAccess(String str, int i4);

    public boolean checkFileExists(String str) {
        return checkFileAccess(str, 0);
    }

    public InputStream getFileInputStream(String str) throws IOException {
        return new ByteArrayInputStream(readFile(str));
    }

    public long getFileModificationTime(String str) throws IOException {
        return statFile(str).mtime;
    }

    public long getFileSize(String str) throws IOException {
        return statFile(str).size;
    }

    public boolean hasDirectFileAccess() {
        return false;
    }

    public abstract FileResult readFile(String str, int i4, int i5, long j4, long j5) throws IOException;

    public abstract FileResult readFile(String str, long j4, long j5) throws IOException;

    public abstract byte[] readFile(String str) throws IOException;

    public abstract FileResult statFile(String str) throws IOException;

    public FileResult getFileInputStream(String str, long j4, long j5) throws IOException {
        FileResult readFile = readFile(str, j4, j5);
        return readFile.content == null ? readFile : new FileResult(new ByteArrayInputStream(readFile.content), readFile.size, readFile.mtime);
    }
}
