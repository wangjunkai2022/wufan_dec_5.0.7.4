package com.xinzhu.overmind.server.am;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Binder;
import android.os.IBinder;
import com.xinzhu.overmind.server.ProcessRecord;
/* compiled from: ActivityRecord.java */
/* loaded from: classes.dex */
public class b extends Binder {
    public ComponentName component;
    public boolean finished;
    public ActivityInfo info;
    public Intent intent;
    public String launchedFromPackage;
    public int launchedFromUid;
    public ProcessRecord processRecord;
    public IBinder resultTo;
    public h task;
    public IBinder token;
    public int userId;

    public static b create(Intent intent, ActivityInfo activityInfo, IBinder iBinder, int i4, String str, int i5) {
        b bVar = new b();
        bVar.intent = intent;
        bVar.info = activityInfo;
        bVar.component = new ComponentName(activityInfo.packageName, activityInfo.name);
        bVar.resultTo = iBinder;
        bVar.userId = i4;
        bVar.launchedFromPackage = str;
        bVar.launchedFromUid = i5;
        return bVar;
    }
}
