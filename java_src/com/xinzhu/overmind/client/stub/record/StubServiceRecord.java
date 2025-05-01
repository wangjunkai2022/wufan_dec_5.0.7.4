package com.xinzhu.overmind.client.stub.record;

import android.content.Intent;
import android.content.pm.ServiceInfo;
/* loaded from: classes6.dex */
public class StubServiceRecord {
    public int mFlags;
    public ServiceInfo mServiceInfo;
    public Intent mServiceIntent;
    public int mStartId;
    public int mUserId;

    public StubServiceRecord(Intent intent, ServiceInfo serviceInfo, int i4, int i5, int i6) {
        this.mServiceIntent = intent;
        this.mServiceInfo = serviceInfo;
        this.mUserId = i4;
        this.mStartId = i5;
        this.mFlags = i6;
    }

    public static StubServiceRecord create(Intent intent) {
        return new StubServiceRecord((Intent) intent.getParcelableExtra("_VM_|_target_"), (ServiceInfo) intent.getParcelableExtra("_VM_|_service_info_"), intent.getIntExtra("_VM_|_user_id_", 0), intent.getIntExtra("_VM_|_start_id_", 0), intent.getIntExtra("_VM_|_flags_", 0));
    }

    public static void saveStub(Intent intent, Intent intent2, ServiceInfo serviceInfo, int i4, int i5, int i6) {
        intent.putExtra("_VM_|_target_", intent2);
        intent.putExtra("_VM_|_service_info_", serviceInfo);
        intent.putExtra("_VM_|_user_id_", i4);
        intent.putExtra("_VM_|_start_id_", i5);
        intent.putExtra("_VM_|_flags_", i6);
    }
}
