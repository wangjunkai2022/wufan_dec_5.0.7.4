package org.jboss.netty.util.internal;

import java.util.ArrayList;
import java.util.regex.Pattern;
/* compiled from: StackTraceSimplifier.java */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f72832a = Pattern.compile("^org\\.jboss\\.netty\\.(util\\.(ThreadRenamingRunnable|internal\\.DeadLockProofWorker)|channel\\.(SimpleChannel(Upstream|Downstream)?Handler|(Default|Static)ChannelPipeline.*))(\\$.*)?$");

    private h() {
    }

    public static void a(Throwable th) {
        if (th.getCause() != null) {
            a(th.getCause());
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace == null || stackTrace.length == 0 || f72832a.matcher(stackTrace[0].getClassName()).matches()) {
            return;
        }
        ArrayList arrayList = new ArrayList(stackTrace.length);
        arrayList.add(stackTrace[0]);
        for (int i4 = 1; i4 < stackTrace.length; i4++) {
            if (!f72832a.matcher(stackTrace[i4].getClassName()).matches()) {
                arrayList.add(stackTrace[i4]);
            }
        }
        th.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]));
    }
}
