package org.jboss.netty.channel.socket.nio;

import java.io.IOException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.Selector;
import java.util.concurrent.TimeUnit;
/* compiled from: SelectorUtil.java */
/* loaded from: classes7.dex */
final class v {

    /* renamed from: a  reason: collision with root package name */
    static final int f72642a = Runtime.getRuntime().availableProcessors() * 2;

    /* renamed from: b  reason: collision with root package name */
    static final long f72643b = 500;

    /* renamed from: c  reason: collision with root package name */
    static final long f72644c;

    /* renamed from: d  reason: collision with root package name */
    static final long f72645d;

    /* renamed from: e  reason: collision with root package name */
    static final boolean f72646e;

    static {
        long f5 = org.jboss.netty.util.internal.j.f("org.jboss.netty.selectTimeout", f72643b);
        f72644c = f5;
        f72645d = TimeUnit.MILLISECONDS.toNanos(f5);
        f72646e = org.jboss.netty.util.internal.j.d("org.jboss.netty.epollBugWorkaround", false);
        try {
            if (System.getProperty("sun.nio.ch.bugLevel") == null) {
                System.setProperty("sun.nio.ch.bugLevel", "");
            }
        } catch (SecurityException e5) {
            e5.printStackTrace();
        }
    }

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(Selector selector) throws IOException {
        try {
            return selector.select(f72644c);
        } catch (CancelledKeyException e5) {
            e5.printStackTrace();
            return -1;
        }
    }
}
