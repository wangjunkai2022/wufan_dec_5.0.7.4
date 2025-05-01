package org.jboss.netty.channel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: DefaultChannelPipeline.java */
/* loaded from: classes7.dex */
public class x implements n {

    /* renamed from: f  reason: collision with root package name */
    static final p f72686f = new b();

    /* renamed from: a  reason: collision with root package name */
    private volatile e f72687a;

    /* renamed from: b  reason: collision with root package name */
    private volatile p f72688b;

    /* renamed from: c  reason: collision with root package name */
    private volatile a f72689c;

    /* renamed from: d  reason: collision with root package name */
    private volatile a f72690d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, a> f72691e = new HashMap(4);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultChannelPipeline.java */
    /* loaded from: classes7.dex */
    public final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        volatile a f72692a;

        /* renamed from: b  reason: collision with root package name */
        volatile a f72693b;

        /* renamed from: c  reason: collision with root package name */
        private final String f72694c;

        /* renamed from: d  reason: collision with root package name */
        private final ChannelHandler f72695d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f72696e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f72697f;

        /* renamed from: g  reason: collision with root package name */
        private volatile Object f72698g;

        a(a aVar, a aVar2, String str, ChannelHandler channelHandler) {
            Objects.requireNonNull(str, "name");
            Objects.requireNonNull(channelHandler, "handler");
            boolean z4 = channelHandler instanceof r;
            this.f72696e = z4;
            boolean z5 = channelHandler instanceof g;
            this.f72697f = z5;
            if (!z4 && !z5) {
                throw new IllegalArgumentException("handler must be either " + r.class.getName() + " or " + g.class.getName() + external.org.apache.commons.lang3.d.f68897a);
            }
            this.f72693b = aVar;
            this.f72692a = aVar2;
            this.f72694c = str;
            this.f72695d = channelHandler;
        }

        @Override // org.jboss.netty.channel.m
        public void a(h hVar) {
            a v2 = x.this.v(this.f72692a);
            if (v2 != null) {
                x.this.E(v2, hVar);
            }
        }

        @Override // org.jboss.netty.channel.m
        public void b(Object obj) {
            this.f72698g = obj;
        }

        @Override // org.jboss.netty.channel.m
        public void c(h hVar) {
            a u4 = x.this.u(this.f72693b);
            if (u4 == null) {
                try {
                    x.this.m().a(x.this, hVar);
                    return;
                } catch (Throwable th) {
                    x.this.A(hVar, th);
                    return;
                }
            }
            x.this.D(u4, hVar);
        }

        @Override // org.jboss.netty.channel.m
        public boolean d() {
            return this.f72696e;
        }

        @Override // org.jboss.netty.channel.m
        public boolean e() {
            return this.f72697f;
        }

        @Override // org.jboss.netty.channel.m
        public e getChannel() {
            return getPipeline().getChannel();
        }

        @Override // org.jboss.netty.channel.m
        public ChannelHandler getHandler() {
            return this.f72695d;
        }

        @Override // org.jboss.netty.channel.m
        public String getName() {
            return this.f72694c;
        }

        @Override // org.jboss.netty.channel.m
        public n getPipeline() {
            return x.this;
        }

        @Override // org.jboss.netty.channel.m
        public Object i() {
            return this.f72698g;
        }
    }

    /* compiled from: DefaultChannelPipeline.java */
    /* loaded from: classes7.dex */
    private static final class b implements p {
        b() {
        }

        @Override // org.jboss.netty.channel.p
        public void a(n nVar, h hVar) {
        }

        @Override // org.jboss.netty.channel.p
        public j b(n nVar, Runnable runnable) {
            return s.i(nVar.getChannel(), new RejectedExecutionException("Not attached yet"));
        }

        @Override // org.jboss.netty.channel.p
        public void c(n nVar, h hVar, ChannelPipelineException channelPipelineException) throws Exception {
            throw channelPipelineException;
        }
    }

    private a B(a aVar) {
        if (this.f72689c == this.f72690d) {
            this.f72690d = null;
            this.f72689c = null;
            this.f72691e.clear();
        } else if (aVar == this.f72689c) {
            removeFirst();
        } else if (aVar == this.f72690d) {
            removeLast();
        } else {
            s(aVar);
            a aVar2 = aVar.f72693b;
            a aVar3 = aVar.f72692a;
            aVar2.f72692a = aVar3;
            aVar3.f72693b = aVar2;
            this.f72691e.remove(aVar.getName());
            q(aVar);
        }
        return aVar;
    }

    private ChannelHandler C(a aVar, String str, ChannelHandler channelHandler) {
        boolean z4;
        if (aVar == this.f72689c) {
            removeFirst();
            j(str, channelHandler);
        } else if (aVar == this.f72690d) {
            removeLast();
            g(str, channelHandler);
        } else {
            boolean equals = aVar.getName().equals(str);
            if (!equals) {
                t(str);
            }
            a aVar2 = aVar.f72693b;
            a aVar3 = aVar.f72692a;
            a aVar4 = new a(aVar2, aVar3, str, channelHandler);
            s(aVar);
            r(aVar4);
            aVar2.f72692a = aVar4;
            aVar3.f72693b = aVar4;
            if (!equals) {
                this.f72691e.remove(aVar.getName());
            }
            this.f72691e.put(str, aVar4);
            boolean z5 = true;
            ChannelHandlerLifeCycleException e5 = null;
            try {
                q(aVar);
                e = null;
                z4 = true;
            } catch (ChannelHandlerLifeCycleException e6) {
                e = e6;
                z4 = false;
            }
            try {
                p(aVar4);
            } catch (ChannelHandlerLifeCycleException e7) {
                e5 = e7;
                z5 = false;
            }
            if (!z4 && !z5) {
                throw new ChannelHandlerLifeCycleException("Both " + aVar.getHandler().getClass().getName() + ".afterRemove() and " + aVar4.getHandler().getClass().getName() + ".afterAdd() failed; see logs.");
            } else if (!z4) {
                throw e;
            } else {
                if (!z5) {
                    throw e5;
                }
            }
        }
        return aVar.getHandler();
    }

    private void p(m mVar) {
        if (mVar.getHandler() instanceof h0) {
            h0 h0Var = (h0) mVar.getHandler();
            try {
                h0Var.afterAdd(mVar);
            } catch (Throwable th) {
                boolean z4 = false;
                try {
                    B((a) mVar);
                    z4 = true;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                if (z4) {
                    throw new ChannelHandlerLifeCycleException(h0Var.getClass().getName() + ".afterAdd() has thrown an exception; removed.", th);
                }
                throw new ChannelHandlerLifeCycleException(h0Var.getClass().getName() + ".afterAdd() has thrown an exception; also failed to remove.", th);
            }
        }
    }

    private static void q(m mVar) {
        if (mVar.getHandler() instanceof h0) {
            h0 h0Var = (h0) mVar.getHandler();
            try {
                h0Var.afterRemove(mVar);
            } catch (Throwable th) {
                throw new ChannelHandlerLifeCycleException(h0Var.getClass().getName() + ".afterRemove() has thrown an exception.", th);
            }
        }
    }

    private static void r(m mVar) {
        if (mVar.getHandler() instanceof h0) {
            h0 h0Var = (h0) mVar.getHandler();
            try {
                h0Var.beforeAdd(mVar);
            } catch (Throwable th) {
                throw new ChannelHandlerLifeCycleException(h0Var.getClass().getName() + ".beforeAdd() has thrown an exception; not adding.", th);
            }
        }
    }

    private static void s(m mVar) {
        if (mVar.getHandler() instanceof h0) {
            h0 h0Var = (h0) mVar.getHandler();
            try {
                h0Var.beforeRemove(mVar);
            } catch (Throwable th) {
                throw new ChannelHandlerLifeCycleException(h0Var.getClass().getName() + ".beforeRemove() has thrown an exception; not removing.", th);
            }
        }
    }

    private void t(String str) {
        if (this.f72691e.containsKey(str)) {
            throw new IllegalArgumentException("Duplicate handler name: " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a u(a aVar) {
        if (aVar == null) {
            return null;
        }
        while (!aVar.e()) {
            aVar = aVar.f72693b;
            if (aVar == null) {
                return null;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a v(a aVar) {
        if (aVar == null) {
            return null;
        }
        while (!aVar.d()) {
            aVar = aVar.f72692a;
            if (aVar == null) {
                return null;
            }
        }
        return aVar;
    }

    private a w(Class<? extends ChannelHandler> cls) {
        a aVar = (a) getContext(cls);
        if (aVar != null) {
            return aVar;
        }
        throw new NoSuchElementException(cls.getName());
    }

    private a x(String str) {
        a aVar = (a) getContext(str);
        if (aVar != null) {
            return aVar;
        }
        throw new NoSuchElementException(str);
    }

    private a y(ChannelHandler channelHandler) {
        a aVar = (a) getContext(channelHandler);
        if (aVar != null) {
            return aVar;
        }
        throw new NoSuchElementException(channelHandler.getClass().getName());
    }

    private void z(String str, ChannelHandler channelHandler) {
        a aVar = new a(null, null, str, channelHandler);
        r(aVar);
        this.f72690d = aVar;
        this.f72689c = aVar;
        this.f72691e.clear();
        this.f72691e.put(str, aVar);
        p(aVar);
    }

    protected void A(h hVar, Throwable th) {
        ChannelPipelineException channelPipelineException;
        if (hVar instanceof e0) {
            th.printStackTrace();
            return;
        }
        if (th instanceof ChannelPipelineException) {
            channelPipelineException = (ChannelPipelineException) th;
        } else {
            channelPipelineException = new ChannelPipelineException(th);
        }
        try {
            this.f72688b.c(this, hVar, channelPipelineException);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void D(a aVar, h hVar) {
        if (!(hVar instanceof p0)) {
            try {
                ((g) aVar.getHandler()).handleDownstream(aVar, hVar);
                return;
            } catch (Throwable th) {
                hVar.d().setFailure(th);
                A(hVar, th);
                return;
            }
        }
        throw new IllegalArgumentException("cannot send an upstream event to downstream");
    }

    void E(a aVar, h hVar) {
        try {
            ((r) aVar.getHandler()).handleUpstream(aVar, hVar);
        } catch (Throwable th) {
            A(hVar, th);
        }
    }

    @Override // org.jboss.netty.channel.n
    public void a(h hVar) {
        a v2 = v(this.f72689c);
        if (v2 == null) {
            return;
        }
        E(v2, hVar);
    }

    @Override // org.jboss.netty.channel.n
    public synchronized ChannelHandler b(String str, String str2, ChannelHandler channelHandler) {
        return C(x(str), str2, channelHandler);
    }

    @Override // org.jboss.netty.channel.n
    public void c(h hVar) {
        a u4 = u(this.f72690d);
        if (u4 == null) {
            try {
                m().a(this, hVar);
                return;
            } catch (Throwable th) {
                A(hVar, th);
                return;
            }
        }
        D(u4, hVar);
    }

    @Override // org.jboss.netty.channel.n
    public synchronized void d(ChannelHandler channelHandler) {
        B(y(channelHandler));
    }

    @Override // org.jboss.netty.channel.n
    public boolean e() {
        return this.f72688b != null;
    }

    @Override // org.jboss.netty.channel.n
    public j execute(Runnable runnable) {
        return m().b(this, runnable);
    }

    @Override // org.jboss.netty.channel.n
    public synchronized void f(String str, String str2, ChannelHandler channelHandler) {
        a x4 = x(str);
        if (x4 == this.f72690d) {
            g(str2, channelHandler);
        } else {
            t(str2);
            a aVar = new a(x4, x4.f72692a, str2, channelHandler);
            r(aVar);
            x4.f72692a.f72693b = aVar;
            x4.f72692a = aVar;
            this.f72691e.put(str2, aVar);
            p(aVar);
        }
    }

    @Override // org.jboss.netty.channel.n
    public synchronized void g(String str, ChannelHandler channelHandler) {
        if (this.f72691e.isEmpty()) {
            z(str, channelHandler);
        } else {
            t(str);
            a aVar = this.f72690d;
            a aVar2 = new a(aVar, null, str, channelHandler);
            r(aVar2);
            aVar.f72692a = aVar2;
            this.f72690d = aVar2;
            this.f72691e.put(str, aVar2);
            p(aVar2);
        }
    }

    @Override // org.jboss.netty.channel.n
    public synchronized ChannelHandler get(String str) {
        a aVar = this.f72691e.get(str);
        if (aVar == null) {
            return null;
        }
        return aVar.getHandler();
    }

    @Override // org.jboss.netty.channel.n
    public e getChannel() {
        return this.f72687a;
    }

    @Override // org.jboss.netty.channel.n
    public synchronized m getContext(String str) {
        if (str != null) {
        } else {
            throw new NullPointerException("name");
        }
        return this.f72691e.get(str);
    }

    @Override // org.jboss.netty.channel.n
    public synchronized ChannelHandler getFirst() {
        a aVar = this.f72689c;
        if (aVar == null) {
            return null;
        }
        return aVar.getHandler();
    }

    @Override // org.jboss.netty.channel.n
    public synchronized ChannelHandler getLast() {
        a aVar = this.f72690d;
        if (aVar == null) {
            return null;
        }
        return aVar.getHandler();
    }

    @Override // org.jboss.netty.channel.n
    public List<String> getNames() {
        ArrayList arrayList = new ArrayList();
        if (this.f72691e.isEmpty()) {
            return arrayList;
        }
        a aVar = this.f72689c;
        do {
            arrayList.add(aVar.getName());
            aVar = aVar.f72692a;
        } while (aVar != null);
        return arrayList;
    }

    @Override // org.jboss.netty.channel.n
    public synchronized void h(String str, String str2, ChannelHandler channelHandler) {
        a x4 = x(str);
        if (x4 == this.f72689c) {
            j(str2, channelHandler);
        } else {
            t(str2);
            a aVar = new a(x4.f72693b, x4, str2, channelHandler);
            r(aVar);
            x4.f72693b.f72692a = aVar;
            x4.f72693b = aVar;
            this.f72691e.put(str2, aVar);
            p(aVar);
        }
    }

    @Override // org.jboss.netty.channel.n
    public void i(e eVar, p pVar) {
        Objects.requireNonNull(eVar, "channel");
        Objects.requireNonNull(pVar, "sink");
        if (this.f72687a == null && this.f72688b == null) {
            this.f72687a = eVar;
            this.f72688b = pVar;
            return;
        }
        throw new IllegalStateException("attached already");
    }

    @Override // org.jboss.netty.channel.n
    public synchronized void j(String str, ChannelHandler channelHandler) {
        if (this.f72691e.isEmpty()) {
            z(str, channelHandler);
        } else {
            t(str);
            a aVar = this.f72689c;
            a aVar2 = new a(null, aVar, str, channelHandler);
            r(aVar2);
            aVar.f72693b = aVar2;
            this.f72689c = aVar2;
            this.f72691e.put(str, aVar2);
            p(aVar2);
        }
    }

    @Override // org.jboss.netty.channel.n
    public synchronized <T extends ChannelHandler> T k(Class<T> cls, String str, ChannelHandler channelHandler) {
        return (T) C(w(cls), str, channelHandler);
    }

    @Override // org.jboss.netty.channel.n
    public synchronized void l(ChannelHandler channelHandler, String str, ChannelHandler channelHandler2) {
        C(y(channelHandler), str, channelHandler2);
    }

    @Override // org.jboss.netty.channel.n
    public p m() {
        p pVar = this.f72688b;
        return pVar == null ? f72686f : pVar;
    }

    @Override // org.jboss.netty.channel.n
    public synchronized ChannelHandler remove(String str) {
        return B(x(str)).getHandler();
    }

    @Override // org.jboss.netty.channel.n
    public synchronized ChannelHandler removeFirst() {
        a aVar;
        if (!this.f72691e.isEmpty()) {
            aVar = this.f72689c;
            if (aVar != null) {
                s(aVar);
                if (aVar.f72692a == null) {
                    this.f72690d = null;
                    this.f72689c = null;
                    this.f72691e.clear();
                } else {
                    aVar.f72692a.f72693b = null;
                    this.f72689c = aVar.f72692a;
                    this.f72691e.remove(aVar.getName());
                }
                q(aVar);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            throw new NoSuchElementException();
        }
        return aVar.getHandler();
    }

    @Override // org.jboss.netty.channel.n
    public synchronized ChannelHandler removeLast() {
        a aVar;
        if (!this.f72691e.isEmpty()) {
            aVar = this.f72690d;
            if (aVar != null) {
                s(aVar);
                if (aVar.f72693b == null) {
                    this.f72690d = null;
                    this.f72689c = null;
                    this.f72691e.clear();
                } else {
                    aVar.f72693b.f72692a = null;
                    this.f72690d = aVar.f72693b;
                    this.f72691e.remove(aVar.getName());
                }
                s(aVar);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            throw new NoSuchElementException();
        }
        return aVar.getHandler();
    }

    @Override // org.jboss.netty.channel.n
    public Map<String, ChannelHandler> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.f72691e.isEmpty()) {
            return linkedHashMap;
        }
        a aVar = this.f72689c;
        do {
            linkedHashMap.put(aVar.getName(), aVar.getHandler());
            aVar = aVar.f72692a;
        } while (aVar != null);
        return linkedHashMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('{');
        a aVar = this.f72689c;
        if (aVar != null) {
            while (true) {
                sb.append('(');
                sb.append(aVar.getName());
                sb.append(" = ");
                sb.append(aVar.getHandler().getClass().getName());
                sb.append(')');
                aVar = aVar.f72692a;
                if (aVar == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // org.jboss.netty.channel.n
    public synchronized <T extends ChannelHandler> T remove(Class<T> cls) {
        return (T) B(w(cls)).getHandler();
    }

    @Override // org.jboss.netty.channel.n
    public synchronized m getContext(ChannelHandler channelHandler) {
        if (channelHandler != null) {
            if (this.f72691e.isEmpty()) {
                return null;
            }
            a aVar = this.f72689c;
            while (aVar.getHandler() != channelHandler) {
                aVar = aVar.f72692a;
                if (aVar == null) {
                    return null;
                }
            }
            return aVar;
        }
        throw new NullPointerException("handler");
    }

    @Override // org.jboss.netty.channel.n
    public synchronized <T extends ChannelHandler> T get(Class<T> cls) {
        m context = getContext(cls);
        if (context == null) {
            return null;
        }
        return (T) context.getHandler();
    }

    @Override // org.jboss.netty.channel.n
    public synchronized m getContext(Class<? extends ChannelHandler> cls) {
        if (cls != null) {
            if (this.f72691e.isEmpty()) {
                return null;
            }
            a aVar = this.f72689c;
            while (!cls.isAssignableFrom(aVar.getHandler().getClass())) {
                aVar = aVar.f72692a;
                if (aVar == null) {
                    return null;
                }
            }
            return aVar;
        }
        throw new NullPointerException("handlerType");
    }
}
