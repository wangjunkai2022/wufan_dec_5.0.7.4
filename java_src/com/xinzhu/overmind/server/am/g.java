package com.xinzhu.overmind.server.am;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.entity.JobRecord;
import com.xinzhu.overmind.server.ProcessRecord;
import com.xinzhu.overmind.server.am.e;
import java.util.HashMap;
import java.util.Map;
/* compiled from: MindJobManagerService.java */
/* loaded from: classes.dex */
public class g extends e.b implements com.xinzhu.overmind.server.d {
    private static g sService = new g();
    private Map<String, JobRecord> mJobRecords = new HashMap();

    private String formatKey(String str, int i4) {
        return str + "_" + i4;
    }

    public static g get() {
        return sService;
    }

    @Override // com.xinzhu.overmind.server.am.e
    public int cancel(String str, int i4, int i5) throws RemoteException {
        return i4;
    }

    @Override // com.xinzhu.overmind.server.am.e
    public void cancelAll(String str, int i4) throws RemoteException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : this.mJobRecords.keySet()) {
            if (str2.startsWith(str + "_")) {
                this.mJobRecords.get(str2);
            }
        }
    }

    @Override // com.xinzhu.overmind.server.am.e
    public JobRecord queryJobRecord(String str, int i4, int i5) throws RemoteException {
        return this.mJobRecords.get(formatKey(str, i4));
    }

    @Override // com.xinzhu.overmind.server.am.e
    public JobInfo schedule(JobInfo jobInfo, int i4) throws RemoteException {
        if (jobInfo == null) {
            return null;
        }
        ComponentName service = jobInfo.getService();
        Intent intent = new Intent();
        intent.setComponent(service);
        ResolveInfo resolveService = com.xinzhu.overmind.server.pm.i.get().resolveService(intent, 128, null, i4);
        if (resolveService == null) {
            return jobInfo;
        }
        ServiceInfo serviceInfo = resolveService.serviceInfo;
        ProcessRecord c5 = com.xinzhu.overmind.server.e.d().c(serviceInfo.packageName, serviceInfo.processName, i4);
        if (c5 == null && (c5 = com.xinzhu.overmind.server.e.d().q(serviceInfo.packageName, serviceInfo.processName, i4, -1, Binder.getCallingUid(), Binder.getCallingPid())) == null) {
            throw new RuntimeException("Unable to create Process " + serviceInfo.processName);
        }
        return scheduleJob(c5, jobInfo, serviceInfo);
    }

    public JobInfo scheduleJob(ProcessRecord processRecord, JobInfo jobInfo, ServiceInfo serviceInfo) {
        JobRecord jobRecord = new JobRecord();
        jobRecord.f67771b = jobInfo;
        jobRecord.f67772c = serviceInfo;
        this.mJobRecords.put(formatKey(processRecord.processName, jobInfo.getId()), jobRecord);
        new com.xinzhu.haunted.android.app.job.b(jobInfo).f(new ComponentName(processRecord.runWithPlugin ? Overmind.getPluginPkg() : Overmind.getMainPkg(), com.xinzhu.overmind.client.f.k(processRecord.vpid)));
        return jobInfo;
    }

    @Override // com.xinzhu.overmind.server.d
    public void systemReady() {
    }
}
