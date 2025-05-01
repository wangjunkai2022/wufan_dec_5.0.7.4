package com.mob.tools.utils;

import com.mob.commons.v;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
/* loaded from: classes5.dex */
public class FileLocker implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private FileOutputStream f56913a;

    /* renamed from: b  reason: collision with root package name */
    private FileLock f56914b;

    /* renamed from: c  reason: collision with root package name */
    private FileChannel f56915c;

    private boolean a(boolean z4) throws Throwable {
        if (z4) {
            this.f56914b = this.f56915c.lock();
        } else {
            this.f56914b = this.f56915c.tryLock();
        }
        return this.f56914b != null;
    }

    public synchronized boolean lock(boolean z4) {
        return lock(z4, z4 ? 1000L : 500L, 16L);
    }

    public synchronized void release() {
        if (this.f56913a == null) {
            return;
        }
        unlock();
        v.a(this.f56915c, this.f56913a);
        this.f56915c = null;
        this.f56913a = null;
    }

    public synchronized void setLockFile(String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            this.f56913a = fileOutputStream;
            this.f56915c = fileOutputStream.getChannel();
        } catch (Throwable unused) {
            v.a(this.f56915c, this.f56913a);
        }
    }

    public synchronized void unlock() {
        FileLock fileLock = this.f56914b;
        if (fileLock == null) {
            return;
        }
        try {
            fileLock.release();
        } catch (Throwable unused) {
        }
        this.f56914b = null;
    }

    public synchronized boolean lock(boolean z4, long j4, long j5) {
        if (this.f56913a == null) {
            return false;
        }
        return a(z4);
    }

    public synchronized void lock(Runnable runnable, boolean z4) {
        if (lock(z4) && runnable != null) {
            runnable.run();
        }
    }
}
