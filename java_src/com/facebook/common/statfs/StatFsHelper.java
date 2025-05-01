package com.facebook.common.statfs;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.common.internal.m;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;
import org.aspectj.lang.c;
@ThreadSafe
/* loaded from: classes.dex */
public class StatFsHelper {

    /* renamed from: h  reason: collision with root package name */
    public static final int f10899h = 400;

    /* renamed from: i  reason: collision with root package name */
    public static final long f10900i = 419430400;

    /* renamed from: j  reason: collision with root package name */
    private static StatFsHelper f10901j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f10902k = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: b  reason: collision with root package name */
    private volatile File f10904b;

    /* renamed from: d  reason: collision with root package name */
    private volatile File f10906d;
    @GuardedBy(c.f72210k)

    /* renamed from: e  reason: collision with root package name */
    private long f10907e;
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private volatile StatFs f10903a = null;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private volatile StatFs f10905c = null;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f10909g = false;

    /* renamed from: f  reason: collision with root package name */
    private final Lock f10908f = new ReentrantLock();

    /* loaded from: classes2.dex */
    public enum StorageType {
        INTERNAL,
        EXTERNAL
    }

    protected StatFsHelper() {
    }

    protected static StatFs a(String str) {
        return new StatFs(str);
    }

    private void b() {
        if (this.f10909g) {
            return;
        }
        this.f10908f.lock();
        try {
            if (!this.f10909g) {
                this.f10904b = Environment.getDataDirectory();
                this.f10906d = Environment.getExternalStorageDirectory();
                j();
                this.f10909g = true;
            }
        } finally {
            this.f10908f.unlock();
        }
    }

    public static synchronized StatFsHelper e() {
        StatFsHelper statFsHelper;
        synchronized (StatFsHelper.class) {
            if (f10901j == null) {
                f10901j = new StatFsHelper();
            }
            statFsHelper = f10901j;
        }
        return statFsHelper;
    }

    private void g() {
        if (this.f10908f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f10907e > f10902k) {
                    j();
                }
            } finally {
                this.f10908f.unlock();
            }
        }
    }

    @GuardedBy(c.f72210k)
    private void j() {
        this.f10903a = k(this.f10903a, this.f10904b);
        this.f10905c = k(this.f10905c, this.f10906d);
        this.f10907e = SystemClock.uptimeMillis();
    }

    @Nullable
    private StatFs k(@Nullable StatFs statFs, @Nullable File file) {
        StatFs statFs2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                statFs = a(file.getAbsolutePath());
            } else {
                statFs.restat(file.getAbsolutePath());
            }
            statFs2 = statFs;
            return statFs2;
        } catch (IllegalArgumentException unused) {
            return statFs2;
        } catch (Throwable th) {
            throw m.d(th);
        }
    }

    @SuppressLint({"DeprecatedMethod"})
    public long c(StorageType storageType) {
        long blockSize;
        long availableBlocks;
        b();
        g();
        StatFs statFs = storageType == StorageType.INTERNAL ? this.f10903a : this.f10905c;
        if (statFs != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                blockSize = statFs.getBlockSizeLong();
                availableBlocks = statFs.getAvailableBlocksLong();
            } else {
                blockSize = statFs.getBlockSize();
                availableBlocks = statFs.getAvailableBlocks();
            }
            return blockSize * availableBlocks;
        }
        return 0L;
    }

    @SuppressLint({"DeprecatedMethod"})
    public long d(StorageType storageType) {
        long blockSize;
        long freeBlocks;
        b();
        g();
        StatFs statFs = storageType == StorageType.INTERNAL ? this.f10903a : this.f10905c;
        if (statFs != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                blockSize = statFs.getBlockSizeLong();
                freeBlocks = statFs.getFreeBlocksLong();
            } else {
                blockSize = statFs.getBlockSize();
                freeBlocks = statFs.getFreeBlocks();
            }
            return blockSize * freeBlocks;
        }
        return -1L;
    }

    @SuppressLint({"DeprecatedMethod"})
    public long f(StorageType storageType) {
        long blockSize;
        long blockCount;
        b();
        g();
        StatFs statFs = storageType == StorageType.INTERNAL ? this.f10903a : this.f10905c;
        if (statFs != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                blockSize = statFs.getBlockSizeLong();
                blockCount = statFs.getBlockCountLong();
            } else {
                blockSize = statFs.getBlockSize();
                blockCount = statFs.getBlockCount();
            }
            return blockSize * blockCount;
        }
        return -1L;
    }

    public void h() {
        if (this.f10908f.tryLock()) {
            try {
                b();
                j();
            } finally {
                this.f10908f.unlock();
            }
        }
    }

    public boolean i(StorageType storageType, long j4) {
        b();
        long c5 = c(storageType);
        return c5 <= 0 || c5 < j4;
    }
}
