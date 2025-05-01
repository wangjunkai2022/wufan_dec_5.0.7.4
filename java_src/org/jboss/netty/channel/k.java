package org.jboss.netty.channel;

import java.util.EventListener;
/* compiled from: ChannelFutureListener.java */
/* loaded from: classes7.dex */
public interface k extends EventListener {

    /* renamed from: y1  reason: collision with root package name */
    public static final k f72546y1 = new a();

    /* renamed from: z1  reason: collision with root package name */
    public static final k f72547z1 = new b();

    /* compiled from: ChannelFutureListener.java */
    /* loaded from: classes7.dex */
    static class a implements k {
        a() {
        }

        @Override // org.jboss.netty.channel.k
        public void a(j jVar) {
            jVar.getChannel().close();
        }
    }

    /* compiled from: ChannelFutureListener.java */
    /* loaded from: classes7.dex */
    static class b implements k {
        b() {
        }

        @Override // org.jboss.netty.channel.k
        public void a(j jVar) {
            if (jVar.isSuccess()) {
                return;
            }
            jVar.getChannel().close();
        }
    }

    void a(j jVar) throws Exception;
}
