package com.join.mgps.rpc.impl;

import com.join.mgps.rpc.retrofit2.RetrofitApi;
import com.wufan.user.service.protobuf.b0;
import com.wufan.user.service.protobuf.d0;
import com.wufan.user.service.protobuf.f0;
import com.wufan.user.service.protobuf.h0;
import com.wufan.user.service.protobuf.j0;
import com.wufan.user.service.protobuf.l0;
import com.wufan.user.service.protobuf.p0;
import com.wufan.user.service.protobuf.s0;
import com.wufan.user.service.protobuf.v0;
import com.wufan.user.service.protobuf.x;
import com.wufan.user.service.protobuf.z;
import java.io.IOException;
/* compiled from: RpcAccountClientImplV2.java */
/* loaded from: classes4.dex */
public class b implements com.join.mgps.rpc.c {

    /* renamed from: b  reason: collision with root package name */
    private static b f54109b;

    /* renamed from: a  reason: collision with root package name */
    private final e2.b f54110a;

    public b(e2.b bVar) {
        this.f54110a = bVar;
    }

    public static com.join.mgps.rpc.c k() {
        if (f54109b == null) {
            f54109b = new b((e2.b) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.F).create(e2.b.class));
        }
        return f54109b;
    }

    @Override // com.join.mgps.rpc.c
    public v0 a(s0 s0Var) {
        try {
            e2.b bVar = this.f54110a;
            if (bVar != null) {
                return bVar.a(s0Var).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.c
    public d0 b(j0 j0Var) {
        try {
            e2.b bVar = this.f54110a;
            if (bVar != null) {
                return bVar.b(j0Var).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.c
    public d0 c(z zVar) {
        try {
            e2.b bVar = this.f54110a;
            if (bVar != null) {
                return bVar.c(zVar).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.c
    public com.wufan.user.service.protobuf.n d(com.wufan.user.service.protobuf.k kVar) {
        try {
            e2.b bVar = this.f54110a;
            if (bVar != null) {
                return bVar.d(kVar).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.c
    public d0 e(b0 b0Var) {
        try {
            e2.b bVar = this.f54110a;
            if (bVar != null) {
                return bVar.e(b0Var).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.c
    public d0 f(l0 l0Var) {
        try {
            e2.b bVar = this.f54110a;
            if (bVar != null) {
                return bVar.f(l0Var).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.c
    public d0 g(x xVar) {
        try {
            e2.b bVar = this.f54110a;
            if (bVar != null) {
                return bVar.g(xVar).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.c
    public d0 h(p0 p0Var) {
        try {
            e2.b bVar = this.f54110a;
            if (bVar != null) {
                return bVar.h(p0Var).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.c
    public com.wufan.user.service.protobuf.n i(com.wufan.user.service.protobuf.k kVar) {
        try {
            e2.b bVar = this.f54110a;
            if (bVar != null) {
                return bVar.i(kVar).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.c
    public f0 j(h0 h0Var) {
        try {
            e2.b bVar = this.f54110a;
            if (bVar != null) {
                return bVar.j(h0Var).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
