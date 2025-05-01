package com.xinzhu.overmind.client.stub.record;

import android.content.Intent;
import com.xinzhu.overmind.b;
/* loaded from: classes.dex */
public class StubTrampolineRecord {
    public static final String TAG = "StubTrampolineRecord";
    public Intent mTarget;
    public int mUserId;

    public StubTrampolineRecord(int i4, Intent intent) {
        this.mUserId = i4;
        this.mTarget = intent;
    }

    public static StubTrampolineRecord create(Intent intent) {
        Intent selector = intent.getSelector();
        return new StubTrampolineRecord(selector.getIntExtra("_VM_|_sender_user_id_", -1), (Intent) selector.getParcelableExtra("_VM_|_sender_target_"));
    }

    public static void saveStub(Intent intent, Intent intent2, int i4) {
        String str = TAG;
        b.c(str, "saveStub check " + i4 + " " + intent2);
        Intent intent3 = new Intent();
        intent3.putExtra("_VM_|_sender_target_", intent2);
        intent3.putExtra("_VM_|_sender_user_id_", i4);
        intent.setPackage(null);
        intent.setSelector(intent3);
    }

    public boolean sanityCheck() {
        return this.mUserId >= 0 && this.mTarget != null;
    }
}
