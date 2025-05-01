package com.xinzhu.overmind.server;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.res.Configuration;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.entity.JobRecord;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ClientJobServiceManager.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f67835b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, JobRecord> f67836a = new HashMap();

    public static a a() {
        return f67835b;
    }

    Service b(int i4) {
        Service service;
        synchronized (this.f67836a) {
            JobRecord jobRecord = this.f67836a.get(Integer.valueOf(i4));
            if (jobRecord == null || (service = jobRecord.f67773d) == null) {
                JobRecord e5 = Overmind.getMindJobManager().e(com.xinzhu.overmind.client.e.getClientConfig().f67763c, i4);
                if (e5 != null) {
                    e5.f67773d = com.xinzhu.overmind.client.e.getClient().createJobService(e5.f67772c);
                    this.f67836a.put(Integer.valueOf(i4), e5);
                    return e5.f67773d;
                }
                return null;
            }
            return service;
        }
    }

    public void c(Configuration configuration) {
        for (JobRecord jobRecord : this.f67836a.values()) {
            Service service = jobRecord.f67773d;
            if (service != null) {
                service.onConfigurationChanged(configuration);
            }
        }
    }

    public void d() {
    }

    public void e() {
        for (JobRecord jobRecord : this.f67836a.values()) {
            Service service = jobRecord.f67773d;
            if (service != null) {
                service.onLowMemory();
            }
        }
    }

    public boolean f(JobParameters jobParameters) {
        try {
            Service b5 = b(jobParameters.getJobId());
            if (b5 instanceof JobService) {
                return ((JobService) b5).onStartJob(jobParameters);
            }
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public boolean g(JobParameters jobParameters) {
        Service b5 = b(jobParameters.getJobId());
        boolean onStopJob = b5 instanceof JobService ? ((JobService) b5).onStopJob(jobParameters) : false;
        b5.onDestroy();
        synchronized (this.f67836a) {
            this.f67836a.remove(Integer.valueOf(jobParameters.getJobId()));
        }
        return onStopJob;
    }

    public void h(int i4) {
        for (JobRecord jobRecord : this.f67836a.values()) {
            Service service = jobRecord.f67773d;
            if (service != null) {
                service.onTrimMemory(i4);
            }
        }
    }
}
