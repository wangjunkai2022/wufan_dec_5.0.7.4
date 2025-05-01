package com.beizi.ad.internal.b.a;

import com.beizi.ad.internal.utilities.HaoboLog;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LruDiskUsage.java */
/* loaded from: classes2.dex */
public abstract class e implements com.beizi.ad.internal.b.a.a {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f5772a = Executors.newSingleThreadExecutor();

    /* compiled from: LruDiskUsage.java */
    /* loaded from: classes2.dex */
    private class a implements Callable<Void> {

        /* renamed from: b  reason: collision with root package name */
        private final File f5774b;

        public a(File file) {
            this.f5774b = file;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            e.this.b(this.f5774b);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(File file) throws IOException {
        d.c(file);
        a(d.b(file.getParentFile()));
    }

    protected abstract boolean a(File file, long j4, int i4);

    @Override // com.beizi.ad.internal.b.a.a
    public void a(File file) throws IOException {
        this.f5772a.submit(new a(file));
    }

    private void a(List<File> list) {
        long b5 = b(list);
        int size = list.size();
        for (File file : list) {
            if (!a(file, b5, size)) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    b5 -= length;
                    HaoboLog.i(HaoboLog.lruDiskUsageLogTag, "Cache file " + file + " is deleted because it exceeds cache limit");
                } else {
                    HaoboLog.e(HaoboLog.lruDiskUsageLogTag, "Error deleting file " + file + " for trimming cache");
                }
            }
        }
    }

    private long b(List<File> list) {
        long j4 = 0;
        for (File file : list) {
            j4 += file.length();
        }
        return j4;
    }
}
