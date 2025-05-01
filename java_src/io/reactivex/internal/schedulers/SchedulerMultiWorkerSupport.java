package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
/* loaded from: classes6.dex */
public interface SchedulerMultiWorkerSupport {

    /* loaded from: classes6.dex */
    public interface WorkerCallback {
        void onWorker(int i4, @NonNull Scheduler.Worker worker);
    }

    void createWorkers(int i4, @NonNull WorkerCallback workerCallback);
}
