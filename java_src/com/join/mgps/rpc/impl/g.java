package com.join.mgps.rpc.impl;

import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.DiscoverListData;
import com.join.mgps.dto.DiscoverListItemBean;
import com.join.mgps.dto.DiscoverListWeiboItemBean;
import com.join.mgps.dto.EmptyMessage;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumProfileMessageData;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.GameCommitListBean;
import com.join.mgps.dto.GameMainCommunityBean;
import com.join.mgps.dto.GivePriaceBean;
import com.join.mgps.dto.GroupListBean;
import com.join.mgps.dto.HavenForumDatabean;
import com.join.mgps.dto.HavenWishResultBean;
import com.join.mgps.dto.LabelBean;
import com.join.mgps.dto.MainLabelBean;
import com.join.mgps.dto.MessageCommentReplyResponse;
import com.join.mgps.dto.MulPostData;
import com.join.mgps.dto.NoticeFragmentBean;
import com.join.mgps.dto.RecommendLabelTag;
import com.join.mgps.dto.Response;
import com.join.mgps.dto.ResultResMainBean;
import com.join.mgps.rpc.retrofit2.RetrofitApi;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: RpcForumClientImpl.java */
/* loaded from: classes4.dex */
public class g implements com.join.mgps.rpc.i {

    /* renamed from: b  reason: collision with root package name */
    private static g f54119b;

    /* renamed from: a  reason: collision with root package name */
    private final e2.g f54120a;

    public g(e2.g gVar) {
        this.f54120a = gVar;
    }

    public static g A0() {
        if (f54119b == null) {
            f54119b = new g((e2.g) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.f54059k).create(e2.g.class));
        }
        return f54119b;
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumCommentReplyDeleteData> A(Map<String, String> map) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.A(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumProfileFavoritesPostsData> B(int i4, String str, int i5, int i6, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.B(i4, str, i5, i6, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<DiscoverListData<DiscoverListItemBean>> C(int i4, int i5, int i6) {
        e2.g gVar = this.f54120a;
        if (gVar != null) {
            try {
                return gVar.C(i4, i5, i6).execute().body();
            } catch (IOException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.join.mgps.rpc.i
    public ResultResMainBean<List<LabelBean>> D(String str, String str2, int i4) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.D(str, str2, i4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.MyForumMain> E(String str, String str2, int i4, int i5) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.E(str, str2, i4, i5).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumProfileMessageData> F(int i4, String str, int i5, int i6) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.F(i4, str, i5, i6).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumForumAllData> G(String str) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.G(str).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ResultResMainBean<Response> H(String str, String str2, int i4) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.H(str, str2, i4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ResultResMainBean<GameCommitListBean> I(String str, String str2, String str3, String str4) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.I(str, str2, str3, str4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumCommentReplyReplyData> J(Map<String, String> map) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.J(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumProfileUnreadMessageCountData> K(int i4, String str, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.K(i4, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<MulPostData> L(String str) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.L(str).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.HomepageRecommendLabel> M(int i4, int i5, int i6, int i7, int i8, String str, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.M(i4, i5, i6, i7, i8, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumSearchQueryData> N(int i4, int i5, String str, String str2, int i6) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.N(i4, i5, str, str2, i6).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.HomepageRecommendLabel> O(int i4, int i5, String str, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.O(i4, i5, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.HomepageRecommendGroup> P(String str, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.P(str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public NoticeFragmentBean Q(int i4, String str, int i5, int i6, String str2, String str3) {
        e2.g gVar = this.f54120a;
        if (gVar != null) {
            try {
                return gVar.Q(i4, str, i5, i6, str2, str3).execute().body();
            } catch (IOException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<HavenForumDatabean> R(String str, String str2) {
        e2.g gVar = this.f54120a;
        if (gVar != null) {
            try {
                return gVar.R(str, str2).execute().body();
            } catch (IOException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumForumPlateData> S(int i4, int i5, int i6, String str, int i7, String str2, String str3, String str4, String str5) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.S(i4, i5, i6, str, i7, str2, str3, str4, str5).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumForumWelcomeData> T(int i4, String str, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.T(i4, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumForumAllData> U(int i4, String str, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.U(i4, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumForumWelcomePostsData> V(int i4, int i5, int i6, String str, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.V(i4, i5, i6, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<List<ForumBean.ForumPostsBean>> W(String str, String str2, int i4) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.W(str, str2, i4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ResultResMainBean<List<ForumBean.ForumPostsBean>> X(String str, int i4, int i5, int i6, int i7, String str2, String str3, String str4) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.X(str, i4, i5, i6, i7, str2, str3, str4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumPostsData> Y(int i4, int i5, int i6, String str, int i7, String str2, String str3, String str4, String str5) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.Y(i4, i5, i6, str, i7, str2, str3, str4, str5).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.GroupFans> Z(int i4, int i5, String str, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.Z(i4, i5, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<List<ForumData.ForumProfileCommentData>> a(int i4, String str, int i5, int i6, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.a(i4, str, i5, i6, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.HomepageRecommendLabel> a0(int i4, int i5, String str, String str2, String str3) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.a0(i4, i5, str, str2, str3).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<DiscoverListData<DiscoverListWeiboItemBean>> b(int i4, int i5, int i6) {
        e2.g gVar = this.f54120a;
        if (gVar != null) {
            try {
                return gVar.b(i4, i5, i6).execute().body();
            } catch (IOException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<MessageCommentReplyResponse> b0(String str, Map<String, Object> map) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.b0(str, map).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumPostsReportData> c(Map<String, String> map) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.c(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumProfileMessageReplyData> c0(int i4, String str, int i5, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.c0(i4, str, i5, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ResultResMainBean<List<LabelBean>> d(String str) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.d(str).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumCommentDeleteData> d0(Map<String, String> map) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.d0(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumSearchIndexData> e(String str) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.e(str).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.HomepageRecommendLabel> e0(int i4, String str, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.e0(i4, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumResult> f(Map<String, String> map) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.f(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumPostsData> f0(int i4, int i5, int i6, int i7, String str, int i8, String str2, String str3, String str4, String str5) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.f0(i4, i5, i6, i7, str, i8, str2, str3, str4, str5).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.HomepageRecommendLabel> g(int i4, int i5, String str, String str2, String str3) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.g(i4, i5, str, str2, str3).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<HavenWishResultBean> g0(Map<String, Object> map) {
        e2.g gVar = this.f54120a;
        if (gVar != null) {
            try {
                return gVar.g0(map).execute().body();
            } catch (IOException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumForumTopicData> h(int i4, int i5, String str, int i6, int i7, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.h(i4, i5, str, i6, i7, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumResult> h0(int i4, String str, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.h0(i4, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.HomepageRecommendLabel> i(int i4, String str, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.i(i4, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumForumWelcomeData> i0(String str) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.i0(str).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumPostsHelpSolveData> j(Map<String, String> map) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.j(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ResultResMainBean<String> j0(int i4) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.j0(i4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumProfilePostsData> k(int i4, String str, int i5, int i6, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.k(i4, str, i5, i6, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumPostsFavoritesData> k0(Map<String, String> map) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.k0(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumSearchQueryData> l(int i4, int i5, String str, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.l(i4, i5, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumCommentReplyData> l0(Map<String, String> map) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.l0(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public GivePriaceBean m(String str, CommonRequestBean commonRequestBean) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.m(str, commonRequestBean).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumProfileMessageData> m0(int i4, String str, int i5, int i6) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.m0(i4, str, i5, i6).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ResultResMainBean<GameMainCommunityBean> n(int i4) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.n(i4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ResultResMainBean<EmptyMessage> n0(String str, String str2, int i4, String str3) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.n0(str, str2, i4, str3).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumPostsPraiseData> o(Map<String, String> map) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.o(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ResultResMainBean<List<CollectionBeanSub>> o0(String str, int i4) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.o0(str, i4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ResultResMainBean<MainLabelBean> p(String str, int i4, int i5, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.p(str, i4, i5, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumForumGroupsData> p0(int i4, String str, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.p0(i4, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumForumPlateData> q(int i4, int i5, int i6, String str, int i7, String str2, String str3) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.q(i4, i5, i6, str, i7, str2, str3).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumPostsDeleteData> q0(Map<String, String> map) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.q0(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumPostsFavoritesData> r(Map<String, String> map) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.r(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumPostsBestData> r0(Map<String, String> map) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.r0(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ResultResMainBean<GroupListBean> s(String str, String str2, String str3, String str4) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.s(str, str2, str3, str4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumPostsData> s0(int i4, int i5, int i6, int i7, String str, String str2, String str3, String str4) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.s0(i4, i5, i6, i7, str, str2, str3, str4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumProfileMessageData> t(int i4, String str, int i5, int i6, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.t(i4, str, i5, i6, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumForumWelcomePostsData> t0(int i4, int i5, String str) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.t0(i4, i5, str).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<List<RecommendLabelTag>> u(String str, String str2, int i4) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.u(str, str2, i4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumGroupIndex> u0(int i4, String str, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.u0(i4, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumPostsData> v(int i4, int i5, int i6, String str, String str2, String str3, String str4) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.v(i4, i5, i6, str, str2, str3, str4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumResult> v0(Map<String, String> map) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.v0(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<List<RecommendLabelTag>> w(int i4, String str, String str2, int i5) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.w(i4, str, str2, i5).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumForumFollowData> w0(Map<String, String> map) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.w0(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumForumFollowListData> x(int i4, String str, String str2) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.x(i4, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ResultResMainBean<Response> x0(Map<String, Object> map) {
        try {
            if (this.f54120a != null) {
                return this.f54120a.y0(RetrofitApi.getInstance().convert2PartMap(map), RetrofitApi.getInstance().convert2Parts(map)).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumUserFavoritesDatas> y(int i4, String str, int i5, int i6, String str2, String str3, int i7) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.y(i4, str, i5, i6, str2, str3, i7).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumPostsSubmitData> y0(Map<String, Object> map) {
        try {
            if (this.f54120a != null) {
                return this.f54120a.x0(RetrofitApi.getInstance().convert2PartMap(map), RetrofitApi.getInstance().convert2Parts(map)).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.HomepageRecommendLabel> z(Map<String, String> map) {
        try {
            e2.g gVar = this.f54120a;
            if (gVar != null) {
                return gVar.z(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.i
    public ForumResponse<ForumData.ForumPostsCommentData> z0(Map<String, Object> map) {
        try {
            if (this.f54120a != null) {
                return this.f54120a.z0(RetrofitApi.getInstance().convert2PartMap(map), RetrofitApi.getInstance().convert2Parts(map)).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
