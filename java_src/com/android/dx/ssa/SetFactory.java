package com.android.dx.ssa;

import com.android.dx.util.BitIntSet;
import com.android.dx.util.IntSet;
import com.android.dx.util.ListIntSet;
/* loaded from: classes2.dex */
public final class SetFactory {
    private static final int DOMFRONT_SET_THRESHOLD_SIZE = 3072;
    private static final int INTERFERENCE_SET_THRESHOLD_SIZE = 3072;
    private static final int LIVENESS_SET_THRESHOLD_SIZE = 3072;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IntSet makeDomFrontSet(int i4) {
        return i4 <= 3072 ? new BitIntSet(i4) : new ListIntSet();
    }

    public static IntSet makeInterferenceSet(int i4) {
        return i4 <= 3072 ? new BitIntSet(i4) : new ListIntSet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IntSet makeLivenessSet(int i4) {
        return i4 <= 3072 ? new BitIntSet(i4) : new ListIntSet();
    }
}
