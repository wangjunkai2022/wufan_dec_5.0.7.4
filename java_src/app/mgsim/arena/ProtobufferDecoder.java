package app.mgsim.arena;

import com.google.protobuf.MessageLite;
import com.papa91.battle.protocol.Response;
import org.jboss.netty.channel.e;
import org.jboss.netty.channel.m;
import org.jboss.netty.handler.codec.frame.a;
/* loaded from: classes2.dex */
public class ProtobufferDecoder extends a {
    private static final boolean HAS_PARSER;
    private static final String TAG = "ArenaService";

    static {
        boolean z4 = false;
        try {
            MessageLite.class.getDeclaredMethod("getParserForType", new Class[0]);
            z4 = true;
        } catch (Throwable unused) {
        }
        HAS_PARSER = z4;
    }

    @Override // org.jboss.netty.handler.codec.frame.a
    protected Object decode(m mVar, e eVar, org.jboss.netty.buffer.e eVar2) throws Exception {
        try {
            if (eVar2.readableBytes() < 4) {
                return null;
            }
            eVar2.i0();
            int readInt = eVar2.readInt();
            if (eVar2.readableBytes() < readInt) {
                eVar2.n0();
                return null;
            }
            org.jboss.netty.buffer.e r4 = eVar2.r(readInt);
            try {
                if (HAS_PARSER) {
                    return Response.getDefaultInstance().getParserForType().parseFrom(r4.array());
                }
                return ((Response.Builder) Response.getDefaultInstance().newBuilderForType().mergeFrom(r4.array())).build();
            } catch (Exception e5) {
                eVar.close();
                throw e5;
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
