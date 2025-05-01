package com.xinzhu.overmind.client.stub.record;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.IBinder;
import com.xinzhu.overmind.utils.helpers.d;
/* loaded from: classes.dex */
public class StubActivityRecord {
    public ActivityInfo mActivityInfo;
    public IBinder mActivityRecord;
    public Intent mTarget;
    public int mUserId;

    public StubActivityRecord(int i4, ActivityInfo activityInfo, Intent intent, IBinder iBinder) {
        this.mUserId = i4;
        this.mActivityInfo = activityInfo;
        this.mTarget = intent;
        this.mActivityRecord = iBinder;
    }

    public static StubActivityRecord create(Intent intent) {
        return new StubActivityRecord(intent.getIntExtra("_VM_|_user_id_", -1), (ActivityInfo) intent.getParcelableExtra("_VM_|_activity_info_"), (Intent) intent.getParcelableExtra("_VM_|_target_"), d.a(intent, "_VM_|_activity_record_v_"));
    }

    public static void saveStub(Intent intent, Intent intent2, ActivityInfo activityInfo, IBinder iBinder, int i4) {
        intent.putExtra("_VM_|_user_id_", i4);
        intent.putExtra("_VM_|_activity_info_", activityInfo);
        intent.putExtra("_VM_|_target_", intent2);
        d.c(intent, "_VM_|_activity_record_v_", iBinder);
    }
}
