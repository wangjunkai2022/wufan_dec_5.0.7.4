package com.xinzhu.overmind.client.stub.record;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class StubBroadcastRecord {
    public ArrayList<ActivityInfo> mActivityInfo;
    public Intent mIntent;
    public int mUserId;

    public StubBroadcastRecord(Intent intent, ArrayList<ActivityInfo> arrayList, int i4) {
        this.mIntent = intent;
        this.mActivityInfo = arrayList;
        this.mUserId = i4;
    }

    public static StubBroadcastRecord create(Intent intent) {
        return new StubBroadcastRecord((Intent) intent.getParcelableExtra("_VM_|_target_"), intent.getParcelableArrayListExtra("_VM_|_activity_info_"), intent.getIntExtra("_VM_|_user_id_", 0));
    }

    public static void saveStub(Intent intent, Intent intent2, ArrayList<ActivityInfo> arrayList, int i4) {
        intent.putExtra("_VM_|_target_", intent2);
        intent.putParcelableArrayListExtra("_VM_|_activity_info_", arrayList);
        intent.putExtra("_VM_|_user_id_", i4);
    }
}
