package com.join.mgps.rpc.impl;

import com.join.mgps.dto.CommentAllListBean;
import com.join.mgps.dto.CommentCreateArgs;
import com.join.mgps.dto.CommentCreateBean;
import com.join.mgps.dto.CommentDetailBean;
import com.join.mgps.dto.CommentListForSelfBean;
import com.join.mgps.dto.CommentModifyArgs;
import com.join.mgps.dto.CommentPraiseBean;
import com.join.mgps.dto.CommentPraiseRequestBean;
import com.join.mgps.dto.CommentRequest;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.dto.CommentSelfRequestBean;
import com.join.mgps.dto.CommentTokenBean;
import com.join.mgps.dto.DeleteCommentArgs;
import com.join.mgps.dto.GamedetialCommentRequest;
import com.join.mgps.dto.RequestCommentAllListArgs;
import com.join.mgps.dto.RequestCommentDetailArgs;
import com.join.mgps.dto.RequestCommentpraiseArgs;
import com.join.mgps.rpc.retrofit2.RetrofitApi;
import java.io.IOException;
/* compiled from: RpcCommentClientImpl.java */
/* loaded from: classes4.dex */
public class e implements com.join.mgps.rpc.f {

    /* renamed from: b  reason: collision with root package name */
    private static e f54115b;

    /* renamed from: a  reason: collision with root package name */
    private final e2.e f54116a;

    public e(e2.e eVar) {
        this.f54116a = eVar;
    }

    public static e m() {
        if (f54115b == null) {
            f54115b = new e((e2.e) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.f54089u).create(e2.e.class));
        }
        return f54115b;
    }

    @Override // com.join.mgps.rpc.f
    public CommentResponse<CommentCreateBean> a(CommentModifyArgs commentModifyArgs) {
        try {
            e2.e eVar = this.f54116a;
            if (eVar != null) {
                return eVar.a(commentModifyArgs).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.f
    public CommentResponse<CommentAllListBean> b(RequestCommentAllListArgs requestCommentAllListArgs) {
        try {
            e2.e eVar = this.f54116a;
            if (eVar != null) {
                return eVar.b(requestCommentAllListArgs).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.f
    public CommentResponse<CommentTokenBean> c(CommentRequest commentRequest) {
        try {
            e2.e eVar = this.f54116a;
            if (eVar != null) {
                return eVar.c(commentRequest).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.f
    public CommentResponse<CommentCreateBean> d(CommentCreateArgs commentCreateArgs) {
        try {
            e2.e eVar = this.f54116a;
            if (eVar != null) {
                return eVar.d(commentCreateArgs).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.f
    public CommentResponse<CommentDetailBean> e(RequestCommentDetailArgs requestCommentDetailArgs) {
        try {
            e2.e eVar = this.f54116a;
            if (eVar != null) {
                return eVar.e(requestCommentDetailArgs).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.f
    public CommentResponse<CommentPraiseBean> f(CommentPraiseRequestBean commentPraiseRequestBean) {
        try {
            e2.e eVar = this.f54116a;
            if (eVar != null) {
                return eVar.f(commentPraiseRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.f
    public CommentResponse<CommentAllListBean> g(GamedetialCommentRequest gamedetialCommentRequest) {
        try {
            e2.e eVar = this.f54116a;
            if (eVar != null) {
                return eVar.g(gamedetialCommentRequest).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.f
    public CommentResponse<CommentPraiseBean> h(RequestCommentpraiseArgs requestCommentpraiseArgs) {
        try {
            e2.e eVar = this.f54116a;
            if (eVar != null) {
                return eVar.h(requestCommentpraiseArgs).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.f
    public CommentResponse<CommentPraiseBean> i(CommentPraiseRequestBean commentPraiseRequestBean) {
        try {
            e2.e eVar = this.f54116a;
            if (eVar != null) {
                return eVar.i(commentPraiseRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.f
    public CommentResponse<CommentListForSelfBean> j(CommentSelfRequestBean commentSelfRequestBean) {
        try {
            e2.e eVar = this.f54116a;
            if (eVar != null) {
                return eVar.j(commentSelfRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.f
    public CommentResponse<CommentPraiseBean> k(DeleteCommentArgs deleteCommentArgs) {
        try {
            e2.e eVar = this.f54116a;
            if (eVar != null) {
                return eVar.k(deleteCommentArgs).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.f
    public CommentResponse<CommentPraiseBean> l(RequestCommentpraiseArgs requestCommentpraiseArgs) {
        try {
            e2.e eVar = this.f54116a;
            if (eVar != null) {
                return eVar.l(requestCommentpraiseArgs).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
