package org.jboss.netty.channel;

import com.join.mgps.activity.NoticeTopAnimActivityDialog_;
import java.util.Objects;
/* compiled from: DownstreamChannelStateEvent.java */
/* loaded from: classes7.dex */
public class c0 implements q {

    /* renamed from: a  reason: collision with root package name */
    private final e f72529a;

    /* renamed from: b  reason: collision with root package name */
    private final j f72530b;

    /* renamed from: c  reason: collision with root package name */
    private final ChannelState f72531c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f72532d;

    /* compiled from: DownstreamChannelStateEvent.java */
    /* loaded from: classes7.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f72533a;

        static {
            int[] iArr = new int[ChannelState.values().length];
            f72533a = iArr;
            try {
                iArr[ChannelState.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72533a[ChannelState.BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72533a[ChannelState.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72533a[ChannelState.INTEREST_OPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public c0(e eVar, j jVar, ChannelState channelState, Object obj) {
        Objects.requireNonNull(eVar, "channel");
        Objects.requireNonNull(jVar, "future");
        Objects.requireNonNull(channelState, NoticeTopAnimActivityDialog_.f36148o);
        this.f72529a = eVar;
        this.f72530b = jVar;
        this.f72531c = channelState;
        this.f72532d = obj;
    }

    @Override // org.jboss.netty.channel.h
    public j d() {
        return this.f72530b;
    }

    @Override // org.jboss.netty.channel.h
    public e getChannel() {
        return this.f72529a;
    }

    @Override // org.jboss.netty.channel.q
    public ChannelState getState() {
        return this.f72531c;
    }

    @Override // org.jboss.netty.channel.q
    public Object getValue() {
        return this.f72532d;
    }

    public String toString() {
        String obj = getChannel().toString();
        StringBuilder sb = new StringBuilder(obj.length() + 64);
        sb.append(obj);
        int i4 = a.f72533a[getState().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        sb.append(' ');
                        sb.append(getState().name());
                        sb.append(": ");
                        sb.append(getValue());
                    } else {
                        sb.append(" CHANGE_INTEREST: ");
                        sb.append(getValue());
                    }
                } else if (getValue() != null) {
                    sb.append(" CONNECT: ");
                    sb.append(getValue());
                } else {
                    sb.append(" DISCONNECT");
                }
            } else if (getValue() != null) {
                sb.append(" BIND: ");
                sb.append(getValue());
            } else {
                sb.append(" UNBIND");
            }
        } else if (Boolean.TRUE.equals(getValue())) {
            sb.append(" OPEN");
        } else {
            sb.append(" CLOSE");
        }
        return sb.toString();
    }
}
