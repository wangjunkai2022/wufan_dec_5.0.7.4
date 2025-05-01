package com.mob;

import com.mob.tools.proguard.PublicMemberKeeper;
@Deprecated
/* loaded from: classes5.dex */
public abstract class OperationCallback<T> implements PublicMemberKeeper {
    public abstract void onComplete(T t4);

    public abstract void onFailure(Throwable th);
}
