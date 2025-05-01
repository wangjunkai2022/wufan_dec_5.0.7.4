.class public Lcom/join/mgps/activity/GameMainActivity3;
.super Lcom/join/mgps/activity/FriendActivity;
.source "GameMainActivity3.java"

# interfaces
.implements Lcom/join/mgps/adapter/j1$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/GameMainActivity3$EmuOutResultReceiver;,
        Lcom/join/mgps/activity/GameMainActivity3$r;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0055
.end annotation

.annotation build Lorg/androidannotations/annotations/Fullscreen;
.end annotation

.annotation build Lorg/androidannotations/annotations/WindowFeature;
    value = {
        0x1
    }
.end annotation


# instance fields
.field A1:Lcom/join/mgps/activity/GameMainActivity3$r;

.field B1:Lcom/join/mgps/rpc/l;

.field C1:Lcom/join/mgps/dto/GameMainV4DataBean;

.field private D1:Ljava/lang/String;

.field E1:Lcom/wufan/user/service/protobuf/n0;

.field F1:Lcom/join/mgps/rpc/k;

.field private G1:Ljava/lang/String;

.field private H1:I

.field private I1:Ljava/lang/String;

.field private J1:Lcom/join/mgps/socket/fight/arena/b;

.field private K1:Lcom/join/mgps/socket/fight/arena/a;

.field private L1:Lcom/join/mgps/adapter/j1;

.field private M1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/DynamicEntranceBean;",
            ">;"
        }
    .end annotation
.end field

.field N:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field N1:Lcom/join/mgps/rpc/f;

.field O:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field O1:Lcom/join/mgps/rpc/d;

.field P:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private P1:Lcom/join/mgps/adapter/GameRecommendAdapter1;

.field Q:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private Q1:Lcom/join/mgps/activity/GameMainActivity3$EmuOutResultReceiver;

.field R:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field R1:Lcom/github/snowdream/android/app/downloader/b;

.field S:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private S1:Lcom/github/snowdream/android/app/downloader/b$b;

.field T:Landroid/view/View;

.field T1:Lcom/join/mgps/dialog/x;

.field U:Landroid/widget/GridView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field U1:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/join/mgps/dto/CloudListDataBean;",
            ">;"
        }
    .end annotation
.end field

.field V:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field V1:I

.field W:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field W1:I

.field X:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field X1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonMultiItemBean;",
            ">;"
        }
    .end annotation
.end field

.field private Y:Landroid/content/Context;

.field private Y1:Z

.field Z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/db/tables/PlayGameTimeTable;",
            ">;"
        }
    .end annotation
.end field

.field private Z1:Lcom/join/mgps/dialog/l1;

.field private a2:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommentAllListBean$GeneralCommentBean;",
            ">;"
        }
    .end annotation
.end field

.field b2:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field c2:Lcom/join/mgps/rpc/i;

.field d2:I

.field e2:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;",
            ">;"
        }
    .end annotation
.end field

.field private f2:Landroid/os/CountDownTimer;

.field private final g2:Lcom/join/mgps/socket/fight/arena/b$b;

.field private final h2:Lapp/mgsim/arena/SocketListener$NotifyObserver;

.field public i2:Z

.field j2:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RomArchived;",
            ">;"
        }
    .end annotation
.end field

.field public k2:Z

.field public l2:Z

.field m2:Lcom/join/mgps/dto/ArchiveNumDataBean;

.field n2:Lcom/join/mgps/dto/PlayCfgBean;

.field o2:Z

.field private p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field private p1:Ljava/lang/String;

.field p2:Z

.field q2:Lcom/join/mgps/ad/x;

.field r2:Lcom/join/mgps/ad/f;

.field s2:Lcom/join/mgps/dto/PlayCfgBean;

.field protected t2:I

.field u2:Lcom/join/mgps/ad/v;

.field v1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/PspBattleServer;",
            ">;"
        }
    .end annotation
.end field

.field v2:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;",
            ">;"
        }
    .end annotation
.end field

.field w2:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qq/e/ads/nativ/NativeExpressADView;",
            ">;"
        }
    .end annotation
.end field

.field x2:Lcom/join/mgps/ad/e;

.field y2:Lcom/join/mgps/ad/j;


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/FriendActivity;-><init>()V

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->p1:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->G1:Ljava/lang/String;

    const/4 v1, 0x0

    .line 4
    iput v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->H1:I

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->I1:Ljava/lang/String;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->M1:Ljava/util/List;

    .line 7
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->U1:Ljava/util/Map;

    const/4 v0, 0x1

    .line 8
    iput v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->V1:I

    .line 9
    iput v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->W1:I

    .line 10
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->X1:Ljava/util/List;

    .line 11
    iput-boolean v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y1:Z

    .line 12
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->a2:Ljava/util/List;

    .line 13
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->e2:Ljava/util/List;

    .line 14
    new-instance v2, Lcom/join/mgps/activity/GameMainActivity3$n;

    const-wide/16 v5, 0x2710

    const-wide/16 v7, 0x3e8

    move-object v3, v2

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lcom/join/mgps/activity/GameMainActivity3$n;-><init>(Lcom/join/mgps/activity/GameMainActivity3;JJ)V

    iput-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->f2:Landroid/os/CountDownTimer;

    .line 15
    new-instance v2, Lcom/join/mgps/activity/GameMainActivity3$o;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/GameMainActivity3$o;-><init>(Lcom/join/mgps/activity/GameMainActivity3;)V

    iput-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->g2:Lcom/join/mgps/socket/fight/arena/b$b;

    .line 16
    new-instance v2, Lcom/join/mgps/activity/GameMainActivity3$p;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/GameMainActivity3$p;-><init>(Lcom/join/mgps/activity/GameMainActivity3;)V

    iput-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->h2:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    .line 17
    iput-boolean v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->i2:Z

    .line 18
    iput-boolean v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->k2:Z

    .line 19
    iput-boolean v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->l2:Z

    .line 20
    iput-boolean v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->o2:Z

    .line 21
    iput-boolean v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->p2:Z

    const/16 v0, 0x13b

    .line 22
    iput v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->t2:I

    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->v2:Ljava/util/List;

    .line 24
    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->w2:Ljava/util/List;

    return-void
.end method

.method private A1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v1, v0, p0, v2}, Lcom/join/mgps/Util/UtilsMy;->i(Lcom/join/mgps/db/tables/EMUApkTable;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;I)V

    .line 2
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->E1:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->T0(Ljava/lang/String;I)V

    .line 3
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->E1:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->A0(Ljava/lang/String;I)V

    return-void
.end method

.method private C1()Lcom/join/mgps/dto/ArchiveColudArgs;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->E1:Lcom/wufan/user/service/protobuf/n0;

    const-string v1, ""

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v0, v1, v1, v2}, Lcom/join/mgps/Util/RequestBeanUtil;->getArchiveNum(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/ArchiveColudArgs;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity3;->E1:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->E1:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/join/mgps/Util/RequestBeanUtil;->getArchiveNum(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/ArchiveColudArgs;

    move-result-object v0

    return-object v0
.end method

.method private C2(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->a2:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v0, p1, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/activity/CommentDetailActivity_;->M1(Landroid/content/Context;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->d(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->a2:Ljava/util/List;

    add-int/lit8 p1, p1, -0x1

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/CommentAllListBean$GeneralCommentBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentBaseBean;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->b(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_plugin_num()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->f(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_bespeak_switch()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->a(I)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_is_started()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->e(I)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->h(I)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_package()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->g(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_comment_score_switch()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->c(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :cond_1
    return-void
.end method

.method private E2(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->e2:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v0, p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->e2:Ljava/util/List;

    add-int/lit8 p1, p1, -0x1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;->getPid()I

    move-result p1

    .line 3
    new-instance v0, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;-><init>()V

    .line 4
    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->setPid(I)V

    .line 5
    new-instance v1, Lcom/join/mgps/dto/ExtBean;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "0"

    const-string v3, "-1"

    invoke-direct {v1, v2, p1, v3}, Lcom/join/mgps/dto/ExtBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {p1, v0, v1}, Lcom/join/mgps/Util/j0;->w0(Landroid/content/Context;Lcom/join/mgps/dto/ForumBean$ForumPostsBean;Lcom/join/mgps/dto/ExtBean;)V

    :cond_0
    return-void
.end method

.method private H2(Z)V
    .locals 16

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFight_fun()Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x3

    const/4 v4, 0x2

    const-string v5, ""

    const/4 v6, 0x4

    const/16 v7, 0x8

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v2, :cond_a

    .line 3
    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->M1:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 4
    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->L1:Lcom/join/mgps/adapter/j1;

    invoke-virtual {v2}, Lcom/join/mgps/adapter/j1;->b()V

    .line 5
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v10, 0x5

    const/16 v11, 0x31

    if-lt v2, v4, :cond_5

    .line 6
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 7
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v12

    const/4 v13, 0x7

    const/16 v14, 0x30

    if-lt v12, v13, :cond_0

    const/4 v12, 0x6

    .line 8
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    .line 9
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-ne v13, v11, :cond_1

    const/16 v13, 0x31

    goto :goto_0

    :cond_0
    const/16 v12, 0x30

    :cond_1
    const/16 v13, 0x30

    :goto_0
    if-eq v11, v2, :cond_4

    if-ne v11, v12, :cond_2

    goto :goto_1

    :cond_2
    if-ne v14, v2, :cond_3

    if-ne v14, v12, :cond_3

    if-ne v13, v11, :cond_3

    .line 10
    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->S:Landroid/view/View;

    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    .line 11
    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->R:Landroid/widget/TextView;

    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 12
    :cond_3
    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->S:Landroid/view/View;

    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    .line 13
    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->R:Landroid/widget/TextView;

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 14
    :cond_4
    :goto_1
    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->S:Landroid/view/View;

    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    .line 15
    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->R:Landroid/widget/TextView;

    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 16
    :cond_5
    :goto_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const-string v12, "NEW"

    const-string v13, "\u6392\u4f4d\u8d5b"

    const/16 v14, 0xc

    if-le v2, v14, :cond_6

    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0, v0, v2}, Lcom/join/mgps/activity/GameMainActivity3;->X1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 17
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v11, :cond_6

    .line 18
    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->M1:Ljava/util/List;

    new-instance v14, Lcom/join/mgps/dto/DynamicEntranceBean;

    invoke-direct {v14, v13, v12, v8}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v2, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v14, 0xe

    if-le v2, v14, :cond_7

    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0, v0, v2}, Lcom/join/mgps/activity/GameMainActivity3;->X1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 20
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v11, :cond_7

    .line 21
    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->M1:Ljava/util/List;

    new-instance v15, Lcom/join/mgps/dto/DynamicEntranceBean;

    invoke-direct {v15, v13, v12, v14}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v2, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v6, :cond_8

    .line 23
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v11, :cond_8

    .line 24
    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->M1:Ljava/util/List;

    new-instance v12, Lcom/join/mgps/dto/DynamicEntranceBean;

    const-string v13, "\u7ec3\u4e60\u6a21\u5f0f"

    invoke-direct {v12, v13, v5, v10}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v2, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lt v2, v6, :cond_9

    .line 26
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v11, :cond_9

    .line 27
    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->M1:Ljava/util/List;

    new-instance v10, Lcom/join/mgps/dto/DynamicEntranceBean;

    const-string v12, "\u7ea6\u6218"

    invoke-direct {v10, v12, v5, v4}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v2, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    :cond_9
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lt v2, v8, :cond_a

    .line 29
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v11, v1, :cond_a

    .line 30
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->M1:Ljava/util/List;

    new-instance v2, Lcom/join/mgps/dto/DynamicEntranceBean;

    const-string v10, "\u672c\u5730\u5bf9\u6218"

    invoke-direct {v2, v10, v5, v3}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    :cond_a
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    if-eqz v1, :cond_19

    .line 32
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->T:Landroid/view/View;

    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 33
    invoke-virtual {v0, v8}, Lcom/join/mgps/activity/GameMainActivity3;->n2(Z)V

    .line 34
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    if-eqz v1, :cond_e

    .line 35
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_back_ground_img()Ljava/lang/String;

    move-result-object v2

    .line 36
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_b

    .line 37
    iget-object v10, v0, Lcom/join/mgps/activity/GameMainActivity3;->V:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v10, v2}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageURI(Ljava/lang/String;)V

    .line 38
    :cond_b
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMaingameinfo;->getCommunity_area_id()I

    move-result v1

    iput v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->d2:I

    if-eqz p1, :cond_e

    .line 39
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->D1:Ljava/lang/String;

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 40
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->D1:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/GameMainActivity3;->I1(Ljava/lang/String;)V

    goto :goto_3

    .line 41
    :cond_c
    iget v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->d2:I

    if-eqz v1, :cond_d

    .line 42
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/activity/GameMainActivity3;->F1()V

    goto :goto_3

    .line 43
    :cond_d
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/activity/GameMainActivity3;->D1()V

    .line 44
    :cond_e
    :goto_3
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->X1:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 45
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->P1:Lcom/join/mgps/adapter/GameRecommendAdapter1;

    if-eqz v1, :cond_f

    .line 46
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getMemberInfo()Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;

    move-result-object v1

    .line 47
    new-instance v2, Lcom/join/mgps/dto/CommonMultiItemBean;

    iget-object v10, v0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v10}, Lcom/join/mgps/dto/GameMainV4DataBean;->getMemberFun()Ljava/util/List;

    move-result-object v10

    invoke-direct {v2, v9, v10}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 48
    invoke-virtual {v2, v1}, Lcom/join/mgps/dto/CommonMultiItemBean;->setExtData(Ljava/lang/Object;)V

    .line 49
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->X1:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    :cond_f
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getPd_info()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v1

    if-eqz v1, :cond_10

    .line 51
    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->X1:Ljava/util/List;

    new-instance v10, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-direct {v10, v3, v1}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    invoke-static/range {p0 .. p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v2

    sget-object v3, Lcom/papa/sim/statistic/Event;->pdSimulatorStartDetails:Lcom/papa/sim/statistic/Event;

    new-instance v10, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v10}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v11, v0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v10, v11}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v10

    invoke-virtual {v1}, Lcom/join/mgps/dto/DomainInfoBean;->getIs_join()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/papa/sim/statistic/Ext;->setIsJoin(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v10

    invoke-virtual {v1}, Lcom/join/mgps/dto/DomainInfoBean;->getAb_test_number()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v1}, Lcom/papa/sim/statistic/Ext;->setTestAbNumber(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 53
    :cond_10
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getNetBattle()Lcom/join/mgps/dto/GameMainNetBattle;

    move-result-object v1

    if-eqz v1, :cond_14

    .line 54
    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->R:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainNetBattle;->getNumber()I

    move-result v10

    if-gez v10, :cond_11

    const/4 v1, 0x0

    goto :goto_4

    :cond_11
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainNetBattle;->getNumber()I

    move-result v1

    :goto_4
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\u623f"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_13

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isFightFun()Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_5

    .line 56
    :cond_12
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->R:Landroid/widget/TextView;

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_6

    .line 57
    :cond_13
    :goto_5
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->R:Landroid/widget/TextView;

    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_6

    .line 58
    :cond_14
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->R:Landroid/widget/TextView;

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 59
    :goto_6
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getPlayGameInfo()Lcom/join/mgps/dto/GameMainV4DataBean$PlayGameInfoBean;

    move-result-object v1

    if-eqz v1, :cond_15

    .line 60
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean$PlayGameInfoBean;->getFile_save_count()I

    move-result v2

    .line 61
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean$PlayGameInfoBean;->getFile_save_switch()I

    move-result v1

    if-ne v1, v8, :cond_15

    .line 62
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->M1:Ljava/util/List;

    new-instance v3, Lcom/join/mgps/dto/DynamicEntranceBean;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "\u4e91\u5b58\u6863"

    invoke-direct {v3, v5, v2, v6}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    :cond_15
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getRecommendAdList()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_16

    .line 64
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_16

    .line 65
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/RecommendAd;

    .line 66
    new-instance v3, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-direct {v3, v8, v2}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 67
    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->X1:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 68
    :cond_16
    invoke-static {}, Lcom/join/mgps/Util/q1;->v()Z

    move-result v1

    if-eqz v1, :cond_17

    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getJp_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v1

    if-eqz v1, :cond_17

    .line 69
    new-instance v1, Lcom/join/mgps/dto/CommonMultiItemBean;

    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameMainV4DataBean;->getJp_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v2

    invoke-direct {v1, v4, v2}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 70
    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->X1:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    :cond_17
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getPd_info_popup()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v1

    if-eqz v1, :cond_18

    .line 72
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getPd_info_popup()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/GameMainActivity3;->s2(Lcom/join/mgps/dto/DomainInfoBean;)V

    .line 73
    :cond_18
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->P1:Lcom/join/mgps/adapter/GameRecommendAdapter1;

    iget-object v2, v0, Lcom/join/mgps/activity/GameMainActivity3;->X1:Ljava/util/List;

    invoke-virtual {v1, v2}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    goto :goto_8

    .line 74
    :cond_19
    iget-object v1, v0, Lcom/join/mgps/activity/GameMainActivity3;->T:Landroid/view/View;

    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 75
    invoke-virtual {v0, v9}, Lcom/join/mgps/activity/GameMainActivity3;->n2(Z)V

    :goto_8
    return-void
.end method

.method private T1()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/FriendActivity;->m:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/github/snowdream/android/app/downloader/b;->e()Lcom/github/snowdream/android/app/downloader/b;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->R1:Lcom/github/snowdream/android/app/downloader/b;

    .line 3
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity3$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainActivity3$q;-><init>(Lcom/join/mgps/activity/GameMainActivity3;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->S1:Lcom/github/snowdream/android/app/downloader/b$b;

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->R1:Lcom/github/snowdream/android/app/downloader/b;

    invoke-virtual {v1, v0}, Lcom/github/snowdream/android/app/downloader/b;->m(Lcom/github/snowdream/android/app/downloader/b$b;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->R1:Lcom/github/snowdream/android/app/downloader/b;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/b;->i()V

    return-void
.end method

.method private V1()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private W1()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic Z0(Lcom/join/mgps/activity/GameMainActivity3;)Lcom/join/mgps/dialog/l1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Z1:Lcom/join/mgps/dialog/l1;

    return-object p0
.end method

.method private Z1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->s2:Lcom/join/mgps/dto/PlayCfgBean;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->s2:Lcom/join/mgps/dto/PlayCfgBean;

    invoke-virtual {p0, p0, v0}, Lcom/join/mgps/activity/GameMainActivity3;->e2(Landroid/content/Context;Lcom/join/mgps/dto/PlayCfgBean;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->s2:Lcom/join/mgps/dto/PlayCfgBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->s2:Lcom/join/mgps/dto/PlayCfgBean;

    invoke-virtual {p0, p0, v0}, Lcom/join/mgps/activity/GameMainActivity3;->b2(Landroid/content/Context;Lcom/join/mgps/dto/PlayCfgBean;)V

    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic a1(Lcom/join/mgps/activity/GameMainActivity3;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic b1(Lcom/join/mgps/activity/GameMainActivity3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->Z1()V

    return-void
.end method

.method static synthetic c1(Lcom/join/mgps/activity/GameMainActivity3;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameMainActivity3;->p1:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic d1(Lcom/join/mgps/activity/GameMainActivity3;)Lcom/github/snowdream/android/app/downloader/DownloadTask;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-object p0
.end method

.method static synthetic e1(Lcom/join/mgps/activity/GameMainActivity3;)Lcom/join/mgps/socket/fight/arena/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameMainActivity3;->J1:Lcom/join/mgps/socket/fight/arena/b;

    return-object p0
.end method

.method static synthetic f1(Lcom/join/mgps/activity/GameMainActivity3;)Lapp/mgsim/arena/SocketListener$NotifyObserver;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameMainActivity3;->h2:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    return-object p0
.end method

.method static synthetic g1(Lcom/join/mgps/activity/GameMainActivity3;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->V1()Z

    move-result p0

    return p0
.end method

.method private g2()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {v0}, Lcom/join/mgps/Util/b;->piv(Lcom/wufan/user/service/protobuf/n0;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method static synthetic h1(Lcom/join/mgps/activity/GameMainActivity3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->m1()V

    return-void
.end method

.method static synthetic i1(Lcom/join/mgps/activity/GameMainActivity3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->z2()V

    return-void
.end method

.method private m1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->f2:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    :cond_0
    return-void
.end method

.method private p2()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->b2:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->pd_ad_config()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2
    invoke-static {v0}, Lcom/join/mgps/dto/PdAdCfgBean;->convertStr2Bean(Ljava/lang/String;)Lcom/join/mgps/dto/PdAdCfgBean;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/PdAdCfgBean;->canShowSimulatorPopup()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_2

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/PdAdCfgBean;->updateSimulatorPopupShowTimes()V

    :cond_1
    return v1

    :cond_2
    return v2
.end method

.method private q1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->v2:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->w2:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_1
    return-void
.end method

.method public static r1(Ljava/lang/String;Ljava/lang/String;)J
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-direct {v0, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p0

    :catch_0
    move-exception p0

    .line 3
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const-wide/16 p0, 0x0

    return-wide p0
.end method

.method private v1()V
    .locals 5

    .line 1
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->startArchiveManagement:Lcom/papa/sim/statistic/Event;

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    const-string v4, "1"

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/papa/sim/statistic/p;->X0(Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/activity/DocumentManageActivity_;->S0(Landroid/content/Context;)Lcom/join/mgps/activity/DocumentManageActivity_$u;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/DocumentManageActivity_$u;->a(I)Lcom/join/mgps/activity/DocumentManageActivity_$u;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/DocumentManageActivity_$u;->b(Ljava/lang/String;)Lcom/join/mgps/activity/DocumentManageActivity_$u;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method private w1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/activity/ApFightActivity_;->n0(Landroid/content/Context;)Lcom/join/mgps/activity/ApFightActivity_$r;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/ApFightActivity_$r;->a(Ljava/lang/String;)Lcom/join/mgps/activity/ApFightActivity_$r;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 2
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->E1:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->y0(Ljava/lang/String;I)V

    return-void
.end method

.method private x1(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    const-string v1, "onEnterQualifying"

    invoke-static {v0, v1}, Lcom/umeng/analytics/MobclickAgent;->onEvent(Landroid/content/Context;Ljava/lang/String;)V

    .line 2
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->W(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x1

    const-string v0, "\u6b63\u5728\u4e0b\u8f7d\u63d2\u4ef6..."

    .line 4
    invoke-static {p0, v0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->N1()V

    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    if-nez v0, :cond_1

    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/activity/GamePaiWeiActivty_;->o0(Landroid/content/Context;)Lcom/join/mgps/activity/GamePaiWeiActivty_$v;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/GamePaiWeiActivty_$v;->a(Ljava/lang/String;)Lcom/join/mgps/activity/GamePaiWeiActivty_$v;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMaingameinfo;->getMax_battle_count()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/GamePaiWeiActivty_$v;->b(I)Lcom/join/mgps/activity/GamePaiWeiActivty_$v;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/GamePaiWeiActivty_$v;->c(I)Lcom/join/mgps/activity/GamePaiWeiActivty_$v;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_0

    :cond_2
    const-string p1, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    .line 8
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameMainActivity3;->showToast(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private z2()V
    .locals 2

    :try_start_0
    const-string v0, "\u7f51\u7edc\u4e0d\u7a33\u5b9a\uff0c\u8bf7\u91cd\u8bd5"

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method A2()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const-string v1, "\u6e38\u620f\u542f\u52a8\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5"

    if-eqz v0, :cond_4

    .line 4
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->Z1(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/db/tables/EMUApkTable;->getDown_type()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->B2()V

    goto :goto_0

    .line 8
    :cond_1
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->launch_game_switch()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    new-instance v3, Lcom/join/mgps/activity/GameMainActivity3$m;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/GameMainActivity3$m;-><init>(Lcom/join/mgps/activity/GameMainActivity3;)V

    const-string v4, "RAW_SIMULATOR"

    invoke-static {v0, v1, v2, v4, v3}, Lcom/join/mgps/Util/UtilsMy;->z0(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lcom/join/mgps/activity/arena/GameRoomActivity$x;)V

    goto :goto_0

    .line 10
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->B2()V

    goto :goto_0

    .line 11
    :cond_3
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/GameMainActivity3;->showToast(Ljava/lang/String;)V

    goto :goto_0

    .line 12
    :cond_4
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/GameMainActivity3;->showToast(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method B1()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    new-instance v0, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 3
    invoke-virtual {v0, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 4
    new-instance v1, Lcom/join/mgps/dto/RequestSimulatorAchievementListArgs;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestSimulatorAchievementListArgs;-><init>()V

    .line 5
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestSimulatorAchievementListArgs;->setGameId(Ljava/lang/String;)V

    .line 6
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestSimulatorAchievementListArgs;->setUid(Ljava/lang/String;)V

    .line 7
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestSimulatorAchievementListArgs;->setToken(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->F1:Lcom/join/mgps/rpc/k;

    invoke-virtual {v0}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/k;->c0(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getAllAchievementsData: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v2

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/SimulatorAllAchievementBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/SimulatorAllAchievementBean;->getAchievement_list()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v1}, Lcom/papa91/arc/http/utils/PrefUtil;->getInstance(Landroid/content/Context;)Lcom/papa91/arc/http/utils/PrefUtil;

    move-result-object v1

    const-string v2, "all_achievements"

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v3

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/SimulatorAllAchievementBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorAllAchievementBean;->getAchievement_list()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/papa91/arc/http/utils/PrefUtil;->save(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method B2()V
    .locals 16

    move-object/from16 v1, p0

    .line 1
    const-class v0, Ljava/lang/String;

    const-string v2, ""

    .line 2
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 3
    :try_start_0
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v7

    const-class v8, Ljava/util/HashMap;

    new-array v9, v4, [Ljava/lang/Class;

    aput-object v0, v9, v6

    aput-object v0, v9, v5

    invoke-virtual {v7, v8, v9}, Lcom/join/android/app/common/utils/JsonMapper;->createCollectionType(Ljava/lang/Class;[Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    .line 4
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v7

    iget-object v8, v1, Lcom/join/mgps/activity/GameMainActivity3;->b2:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v8}, Lcom/join/mgps/pref/PrefDef_;->lastStartSimulatorCore()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v8

    invoke-virtual {v8}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v7, v8, v0}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/HashMap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v7, :cond_0

    .line 5
    :try_start_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v3, v0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v3, v7

    goto :goto_1

    :cond_0
    move-object v3, v7

    .line 6
    :goto_0
    :try_start_2
    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-object v2, v0

    goto :goto_2

    :catch_1
    move-exception v0

    .line 7
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 8
    :cond_1
    :goto_2
    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    const/4 v7, 0x0

    if-eqz v0, :cond_c

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getNetBattle()Lcom/join/mgps/dto/GameMainNetBattle;

    move-result-object v0

    .line 10
    iget-object v8, v1, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/GameMainV4DataBean;->getSimulator_core()Lcom/join/mgps/dto/GameMainV4DataBean$SimulatorCoreBean;

    move-result-object v8

    if-eqz v8, :cond_2

    iget-object v8, v1, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/GameMainV4DataBean;->getSimulator_core()Lcom/join/mgps/dto/GameMainV4DataBean$SimulatorCoreBean;

    move-result-object v8

    invoke-virtual {v8}, Lcom/join/mgps/dto/GameMainV4DataBean$SimulatorCoreBean;->getCore()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_2

    .line 11
    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameMainV4DataBean;->getSimulator_core()Lcom/join/mgps/dto/GameMainV4DataBean$SimulatorCoreBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameMainV4DataBean$SimulatorCoreBean;->getCore()Ljava/lang/String;

    move-result-object v2

    :cond_2
    move-object v15, v2

    .line 12
    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v3, v2, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity3;->b2:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->lastStartSimulatorCore()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-static {v3}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 14
    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v2, :cond_3

    .line 15
    sget-object v2, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v2}, Lcom/MApplication;->l()Lcom/join/mgps/pref/PrefDef_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->lastLaunchModGameId()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    iget-object v3, v1, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 16
    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    const/16 v3, 0x8

    iget-object v8, v1, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-static {v2, v3, v8}, Lcom/join/mgps/Util/UtilsMy;->T1(Landroid/content/Context;ILjava/lang/String;)V

    :cond_3
    if-eqz v0, :cond_4

    .line 17
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainNetBattle;->getSilence_room_switch()I

    move-result v0

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    if-nez v0, :cond_5

    .line 18
    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v7, v0, v2, v6, v15}, Lcom/join/mgps/Util/UtilsMy;->j(Lcom/join/mgps/db/tables/EMUApkTable;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;ILjava/lang/String;)V

    goto/16 :goto_6

    .line 19
    :cond_5
    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFight_fun()Ljava/lang/String;

    move-result-object v2

    .line 20
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v8, 0x7

    if-lt v3, v8, :cond_6

    const/4 v3, 0x6

    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x31

    if-ne v3, v2, :cond_6

    const/4 v2, 0x1

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    .line 22
    :goto_4
    iget-object v3, v1, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 23
    iget-object v3, v1, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/GameMaingameinfo;->getMax_battle_count()I

    move-result v3

    move v14, v3

    goto :goto_5

    :cond_7
    const/4 v14, 0x0

    :goto_5
    if-ne v0, v5, :cond_9

    .line 24
    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity3;->G1:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget v12, v1, Lcom/join/mgps/activity/GameMainActivity3;->H1:I

    if-eqz v12, :cond_8

    .line 25
    iget-object v8, v1, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v9, v1, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    const/4 v10, 0x1

    iget-object v11, v1, Lcom/join/mgps/activity/GameMainActivity3;->G1:Ljava/lang/String;

    iget-object v13, v1, Lcom/join/mgps/activity/GameMainActivity3;->I1:Ljava/lang/String;

    invoke-static/range {v8 .. v15}, Lcom/join/mgps/Util/UtilsMy;->l(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)V

    goto :goto_6

    .line 26
    :cond_8
    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v7, v0, v2, v6, v15}, Lcom/join/mgps/Util/UtilsMy;->j(Lcom/join/mgps/db/tables/EMUApkTable;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;ILjava/lang/String;)V

    goto :goto_6

    :cond_9
    if-ne v0, v4, :cond_b

    if-eqz v2, :cond_b

    .line 27
    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity3;->G1:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    iget v12, v1, Lcom/join/mgps/activity/GameMainActivity3;->H1:I

    if-eqz v12, :cond_a

    .line 28
    iget-object v8, v1, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v9, v1, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    const/4 v10, 0x1

    iget-object v11, v1, Lcom/join/mgps/activity/GameMainActivity3;->G1:Ljava/lang/String;

    iget-object v13, v1, Lcom/join/mgps/activity/GameMainActivity3;->I1:Ljava/lang/String;

    invoke-static/range {v8 .. v15}, Lcom/join/mgps/Util/UtilsMy;->l(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)V

    goto :goto_6

    .line 29
    :cond_a
    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v7, v0, v2, v6, v15}, Lcom/join/mgps/Util/UtilsMy;->j(Lcom/join/mgps/db/tables/EMUApkTable;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;ILjava/lang/String;)V

    goto :goto_6

    .line 30
    :cond_b
    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v7, v0, v2, v6, v15}, Lcom/join/mgps/Util/UtilsMy;->j(Lcom/join/mgps/db/tables/EMUApkTable;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;ILjava/lang/String;)V

    goto :goto_6

    .line 31
    :cond_c
    iget-object v0, v1, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v3, v1, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v7, v0, v3, v6, v2}, Lcom/join/mgps/Util/UtilsMy;->j(Lcom/join/mgps/db/tables/EMUApkTable;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;ILjava/lang/String;)V

    .line 32
    :goto_6
    invoke-static/range {p0 .. p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Lcom/join/mgps/activity/GameMainActivity3;->E1:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/papa/sim/statistic/p;->I0(Ljava/lang/String;I)V

    return-void
.end method

.method D1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->G1()Lcom/join/mgps/dto/RequestCommentAllListArgs;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->N1:Lcom/join/mgps/rpc/f;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/f;->b(Lcom/join/mgps/dto/RequestCommentAllListArgs;)Lcom/join/mgps/dto/CommentResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getData_info()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommentAllListBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentAllListBean;->getGeneral_comment()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->a2:Ljava/util/List;

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->l2()V

    :cond_0
    return-void
.end method

.method D2()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_comment_score_switch()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_comment_score_switch()Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/activity/CommentAllListActivity_;->H0(Landroid/content/Context;)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->f(Ljava/lang/String;)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_package()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->i(Ljava/lang/String;)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_plugin_num()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->h(Ljava/lang/String;)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_bespeak_switch()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_bespeak_switch()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    :goto_0
    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->a(I)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_is_started()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->g(I)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    .line 9
    invoke-virtual {v1, v3}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->j(I)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_comment_score_switch()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->d(Ljava/lang/String;)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void

    .line 11
    :cond_3
    :goto_1
    invoke-static {p0}, Lcom/join/mgps/activity/ForumIndexActivity_;->i0(Landroid/content/Context;)Lcom/join/mgps/activity/ForumIndexActivity_$d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :cond_4
    :goto_2
    return-void
.end method

.method protected E0()Z
    .locals 2

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    sget-object v1, Lcom/join/mgps/enums/ConstantIntEnum;->GBA:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v1}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method E1()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {}, Lb2/u;->n()Lb2/u;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lb2/u;->o(Ljava/lang/String;)Lcom/join/mgps/db/tables/GameMainTable;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/db/tables/GameMainTable;->getGame_main_data()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v1, v0, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameMainV4DataBean;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMaingameinfo;->getCommunity_multi_posts_id()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->D1:Ljava/lang/String;

    :cond_0
    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/GameMainActivity3;->J2(Lcom/join/mgps/dto/GameMainV4DataBean;Z)V

    :cond_1
    return-void
.end method

.method F1()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->c2:Lcom/join/mgps/rpc/i;

    iget v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->d2:I

    invoke-interface {v0, v1}, Lcom/join/mgps/rpc/i;->n(I)Lcom/join/mgps/dto/ResultResMainBean;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultResMainBean;->getError()I

    move-result v1

    if-nez v1, :cond_4

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultResMainBean;->getData()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    .line 5
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultResMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameMainCommunityBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainCommunityBean;->getPosts()Ljava/util/List;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->e2:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    if-eqz v0, :cond_3

    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_3

    const/4 v1, 0x0

    .line 8
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;->getSubject()Ljava/lang/String;

    move-result-object v2

    .line 9
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 10
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;->getMessage()Ljava/lang/String;

    move-result-object v2

    .line 11
    :cond_1
    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity3;->e2:Ljava/util/List;

    new-instance v4, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;->getPid()I

    move-result v1

    invoke-direct {v4, v2, v1}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;-><init>(Ljava/lang/String;I)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_3

    .line 13
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;->getSubject()Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-static {v1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 15
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;->getMessage()Ljava/lang/String;

    move-result-object v1

    .line 16
    :cond_2
    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity3;->e2:Ljava/util/List;

    new-instance v4, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;->getPid()I

    move-result v0

    invoke-direct {v4, v1, v0}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;-><init>(Ljava/lang/String;I)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->m2()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_0
    return-void
.end method

.method F2()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    const-string v2, "8873670"

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/Util/IntentUtil;->goFormDetial(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public G1()Lcom/join/mgps/dto/RequestCommentAllListArgs;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->E1:Lcom/wufan/user/service/protobuf/n0;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->b2:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->commentToken()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->E1:Lcom/wufan/user/service/protobuf/n0;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v5, 0x0

    .line 5
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v1

    const/4 v2, 0x1

    const/16 v3, 0xa

    iget-object v4, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual/range {v1 .. v6}, Lcom/join/mgps/Util/RequestBeanUtil;->getRequestCommentAllList(IILjava/lang/String;ILjava/lang/String;)Lcom/join/mgps/dto/RequestCommentAllListArgs;

    move-result-object v0

    return-object v0
.end method

.method G2(I)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    return-void
.end method

.method H1()V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->c2:Lcom/join/mgps/rpc/i;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-interface {v2, v4, v3, v0, v1}, Lcom/join/mgps/rpc/i;->O(IILjava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v1

    if-nez v1, :cond_2

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getPost_list()Ljava/util/List;

    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->e2:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    if-eqz v0, :cond_1

    .line 10
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->e2:Ljava/util/List;

    new-instance v2, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v4

    invoke-direct {v2, v5, v4}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;-><init>(Ljava/lang/String;I)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->e2:Ljava/util/List;

    new-instance v2, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v0

    invoke-direct {v2, v4, v0}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;-><init>(Ljava/lang/String;I)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->m2()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_0
    return-void
.end method

.method I1(Ljava/lang/String;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->c2:Lcom/join/mgps/rpc/i;

    invoke-interface {v0, p1}, Lcom/join/mgps/rpc/i;->L(Ljava/lang/String;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v0

    if-nez v0, :cond_2

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/MulPostData;

    invoke-virtual {p1}, Lcom/join/mgps/dto/MulPostData;->getPosts_list()Ljava/util/List;

    move-result-object p1

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->e2:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_1

    .line 7
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->e2:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result v2

    invoke-direct {v1, v3, v2}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;-><init>(Ljava/lang/String;I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->e2:Ljava/util/List;

    new-instance v2, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getSubject()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->getPid()I

    move-result p1

    invoke-direct {v2, v3, p1}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;-><init>(Ljava/lang/String;I)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->m2()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_0
    return-void
.end method

.method I2(Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/event/f;

    invoke-direct {v0}, Lcom/join/mgps/event/f;-><init>()V

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/CloudListDataBean;->setStatus(I)V

    .line 3
    invoke-virtual {v0, p1}, Lcom/join/mgps/event/f;->f(Lcom/join/mgps/dto/CloudListDataBean;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/join/mgps/event/f;->j(I)V

    .line 5
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object p1

    invoke-virtual {p1, v0}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    return-void
.end method

.method public J(Lcom/join/mgps/dto/DynamicEntranceBean;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/DynamicEntranceBean;->getTypeId()I

    move-result p1

    const/16 v0, 0xe

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 2
    :pswitch_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->F2()V

    goto :goto_0

    .line 3
    :pswitch_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->s1()V

    goto :goto_0

    .line 4
    :pswitch_2
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->A1()V

    goto :goto_0

    .line 5
    :pswitch_3
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->v1()V

    goto :goto_0

    .line 6
    :pswitch_4
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->w1()V

    goto :goto_0

    .line 7
    :pswitch_5
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->y1()V

    goto :goto_0

    :pswitch_6
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GameMainActivity3;->x1(I)V

    goto :goto_0

    .line 9
    :cond_0
    invoke-direct {p0, v0}, Lcom/join/mgps/activity/GameMainActivity3;->x1(I)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method J1()V
    .locals 12
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->C1()Lcom/join/mgps/dto/ArchiveColudArgs;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->O1:Lcom/join/mgps/rpc/d;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ArchiveColudArgs;->getArgs()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/d;->f(Ljava/util/Map;)Lcom/join/mgps/dto/ArchiveNumDataBean;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->m2:Lcom/join/mgps/dto/ArchiveNumDataBean;

    if-eqz v0, :cond_e

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/ArchiveNumDataBean;->getCode()I

    move-result v0

    const/16 v1, 0x258

    if-ne v0, v1, :cond_e

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->b2:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->getArchiveCoinPref()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->m2:Lcom/join/mgps/dto/ArchiveNumDataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ArchiveNumDataBean;->getData_info()Lcom/join/mgps/dto/ArchiveNumDataBean$DataInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ArchiveNumDataBean$DataInfoBean;->getArchiveCoin()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->b2:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->cloudVipLink()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->m2:Lcom/join/mgps/dto/ArchiveNumDataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ArchiveNumDataBean;->getData_info()Lcom/join/mgps/dto/ArchiveNumDataBean$DataInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ArchiveNumDataBean$DataInfoBean;->getVipLink()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 6
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_d

    .line 7
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/join/mgps/Util/g0;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->j2:Ljava/util/List;

    .line 8
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    const-string v3, "31"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_7

    .line 9
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->j2:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v7, "_v2"

    if-eqz v6, :cond_1

    :try_start_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/RomArchived;

    .line 10
    invoke-virtual {v6}, Lcom/join/mgps/dto/RomArchived;->getFileName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x1

    goto :goto_0

    .line 11
    :cond_1
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->j2:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 12
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    .line 13
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/RomArchived;

    if-eqz v5, :cond_4

    if-nez v4, :cond_4

    .line 14
    iput-boolean v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->k2:Z

    .line 15
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/join/mgps/Util/l1;->a(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_1

    .line 16
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :cond_4
    if-eqz v5, :cond_2

    if-eqz v4, :cond_2

    .line 17
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/join/mgps/Util/l1;->a(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 18
    iput-boolean v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->l2:Z

    .line 19
    invoke-virtual {v6}, Lcom/join/mgps/dto/RomArchived;->getFileName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 20
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 21
    :cond_5
    invoke-virtual {v6}, Lcom/join/mgps/dto/RomArchived;->getFileName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_1

    .line 22
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 23
    :cond_7
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    const-string v2, "33"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    const/4 v0, 0x0

    .line 24
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->j2:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-wide/16 v4, 0x0

    move-wide v6, v4

    :cond_8
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/join/mgps/dto/RomArchived;

    .line 25
    invoke-virtual {v8}, Lcom/join/mgps/dto/RomArchived;->getArchivedTime()Ljava/lang/String;

    move-result-object v9

    const-string v10, "MM\u6708dd\u65e5 HH:mm"

    invoke-static {v9, v10}, Lcom/join/mgps/activity/GameMainActivity3;->r1(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v9

    cmp-long v11, v6, v4

    if-nez v11, :cond_9

    move-object v0, v8

    move-wide v6, v9

    :cond_9
    cmp-long v11, v6, v9

    if-lez v11, :cond_8

    move-object v0, v8

    move-wide v6, v9

    goto :goto_2

    :cond_a
    if-eqz v0, :cond_b

    .line 26
    invoke-virtual {v0}, Lcom/join/mgps/dto/RomArchived;->getFileName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "vba"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 27
    invoke-virtual {p0, v3}, Lcom/join/mgps/activity/GameMainActivity3;->o2(Z)V

    .line 28
    :cond_b
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->j2:Ljava/util/List;

    if-eqz v0, :cond_c

    .line 29
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameMainActivity3;->G2(I)V

    goto :goto_3

    .line 30
    :cond_c
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/GameMainActivity3;->G2(I)V

    goto :goto_3

    .line 31
    :cond_d
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/GameMainActivity3;->G2(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_e
    :goto_3
    return-void
.end method

.method J2(Lcom/join/mgps/dto/GameMainV4DataBean;Z)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Q:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    :cond_0
    invoke-direct {p0, p2}, Lcom/join/mgps/activity/GameMainActivity3;->H2(Z)V

    return-void
.end method

.method K1()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->B1:Lcom/join/mgps/rpc/l;

    invoke-interface {v0}, Lcom/join/mgps/rpc/l;->v()Lcom/join/mgps/dto/GameWorldResponse;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameWorldResponse;->getError()I

    move-result v1

    const/16 v2, 0x2bd

    if-ne v1, v2, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->p1()V

    return-void

    .line 4
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameWorldResponse;->getError()I

    move-result v1

    if-nez v1, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameWorldResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->v1:Ljava/util/List;

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->x2()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method public L1(Landroid/content/Context;)I
    .locals 1

    const-string v0, "window"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    .line 2
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 3
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 4
    iget p1, v0, Landroid/util/DisplayMetrics;->density:F

    .line 5
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v0, v0

    div-float/2addr v0, p1

    float-to-int p1, v0

    return p1
.end method

.method M1(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    .line 2
    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/IntentDateBean;->setTpl_type(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0, p2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 4
    invoke-virtual {v0, p3}, Lcom/join/mgps/Util/IntentDateBean;->setJump_type(I)V

    .line 5
    invoke-virtual {v0, p4}, Lcom/join/mgps/Util/IntentDateBean;->setCrc_link_type_val(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, p5}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 7
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-virtual {p1, p2, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method

.method N1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->P:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public O1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->x2:Lcom/join/mgps/ad/e;

    if-nez v0, :cond_0

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity3$f;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/join/mgps/activity/GameMainActivity3$f;-><init>(Lcom/join/mgps/activity/GameMainActivity3;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->x2:Lcom/join/mgps/ad/e;

    .line 3
    new-instance p1, Lcom/join/mgps/activity/GameMainActivity3$g;

    invoke-direct {p1, p0}, Lcom/join/mgps/activity/GameMainActivity3$g;-><init>(Lcom/join/mgps/activity/GameMainActivity3;)V

    invoke-virtual {v0, p1}, Lcom/join/mgps/ad/c;->e(Lcom/join/mgps/ad/c$a;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3;->x2:Lcom/join/mgps/ad/e;

    invoke-virtual {p1}, Lcom/join/mgps/ad/e;->a()V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3;->x2:Lcom/join/mgps/ad/e;

    const/4 p2, 0x3

    iget p3, p0, Lcom/join/mgps/activity/GameMainActivity3;->t2:I

    int-to-double v0, p3

    const-wide v2, 0x3fe999999999999aL    # 0.8

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    double-to-int p3, v0

    const/4 v0, -0x2

    invoke-virtual {p1, p2, p3, v0}, Lcom/join/mgps/ad/e;->b(III)V

    :goto_0
    return-void
.end method

.method public P1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->r2:Lcom/join/mgps/ad/f;

    if-nez v0, :cond_0

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity3$c;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/join/mgps/activity/GameMainActivity3$c;-><init>(Lcom/join/mgps/activity/GameMainActivity3;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->r2:Lcom/join/mgps/ad/f;

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/ad/f;->e()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3;->r2:Lcom/join/mgps/ad/f;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/join/mgps/ad/f;->h(Z)V

    :goto_0
    return-void
.end method

.method public Q1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->y2:Lcom/join/mgps/ad/j;

    if-nez v0, :cond_0

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity3$h;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/join/mgps/activity/GameMainActivity3$h;-><init>(Lcom/join/mgps/activity/GameMainActivity3;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->y2:Lcom/join/mgps/ad/j;

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/ad/j;->e()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3;->y2:Lcom/join/mgps/ad/j;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/join/mgps/ad/j;->h(Z)V

    :goto_0
    return-void
.end method

.method public R1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->u2:Lcom/join/mgps/ad/v;

    if-nez v0, :cond_0

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity3$d;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/join/mgps/activity/GameMainActivity3$d;-><init>(Lcom/join/mgps/activity/GameMainActivity3;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->u2:Lcom/join/mgps/ad/v;

    .line 3
    new-instance p1, Lcom/join/mgps/activity/GameMainActivity3$e;

    invoke-direct {p1, p0}, Lcom/join/mgps/activity/GameMainActivity3$e;-><init>(Lcom/join/mgps/activity/GameMainActivity3;)V

    invoke-virtual {v0, p1}, Lcom/join/mgps/ad/c;->e(Lcom/join/mgps/ad/c$a;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3;->u2:Lcom/join/mgps/ad/v;

    invoke-virtual {p1}, Lcom/join/mgps/ad/v;->a()V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3;->u2:Lcom/join/mgps/ad/v;

    const/4 p2, 0x3

    iget p3, p0, Lcom/join/mgps/activity/GameMainActivity3;->t2:I

    int-to-double v0, p3

    const-wide/high16 v2, 0x3fec000000000000L    # 0.875

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    double-to-int p3, v0

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0}, Lcom/join/mgps/ad/v;->b(III)V

    :goto_0
    return-void
.end method

.method public S1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->q2:Lcom/join/mgps/ad/x;

    if-nez v0, :cond_0

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity3$b;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/join/mgps/activity/GameMainActivity3$b;-><init>(Lcom/join/mgps/activity/GameMainActivity3;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->q2:Lcom/join/mgps/ad/x;

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/ad/x;->e()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3;->q2:Lcom/join/mgps/ad/x;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/join/mgps/ad/x;->h(Z)V

    :goto_0
    return-void
.end method

.method U1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/activity/login/LoginSplashActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/login/LoginSplashActivity_$IntentBuilder_;

    move-result-object v0

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/login/LoginSplashActivity_$IntentBuilder_;

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method X1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    .line 2
    :goto_0
    :try_start_1
    sget-object v2, Lcom/join/mgps/enums/ConstantIntEnum;->FBA:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v2}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v2

    if-eq v1, v2, :cond_1

    sget-object v2, Lcom/join/mgps/enums/ConstantIntEnum;->FC:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v2}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v2

    if-ne v1, v2, :cond_5

    .line 3
    :cond_1
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v1

    invoke-virtual {v1, p2}, Lb2/o;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object p2

    .line 5
    new-instance v1, Lcom/join/android/app/common/utils/APKUtils;

    invoke-direct {v1}, Lcom/join/android/app/common/utils/APKUtils;-><init>()V

    .line 6
    invoke-virtual {p2}, Lcom/join/mgps/db/tables/EMUApkTable;->getPackage_name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    if-eqz v1, :cond_3

    .line 7
    :try_start_2
    invoke-virtual {p2}, Lcom/join/mgps/db/tables/EMUApkTable;->getPackage_name()Ljava/lang/String;

    move-result-object p2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 8
    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    if-nez p1, :cond_2

    return v0

    .line 9
    :cond_2
    :try_start_4
    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    const/16 p2, 0x14a

    if-gt p1, p2, :cond_5

    return v0

    :catch_1
    move-exception p1

    .line 10
    :try_start_5
    invoke-virtual {p1}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    return v0

    :catch_2
    move-exception p1

    .line 11
    :try_start_6
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return v0

    .line 12
    :cond_3
    invoke-virtual {p2}, Lcom/join/mgps/db/tables/EMUApkTable;->getDown_type()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_4

    .line 13
    invoke-virtual {p2}, Lcom/join/mgps/db/tables/EMUApkTable;->getDown_type()I

    move-result v1

    if-ne v1, v2, :cond_4

    new-array v1, v0, [Ljava/lang/String;

    .line 14
    invoke-static {p1, p2, v0, v1}, Lcom/join/android/app/common/utils/l;->t(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;Z[Ljava/lang/String;)Z

    move-result p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    return p1

    :cond_4
    return v0

    :catch_3
    move-exception p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :catch_4
    :cond_5
    const/4 p1, 0x1

    return p1
.end method

.method public Y1()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->g2()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->s2:Lcom/join/mgps/dto/PlayCfgBean;

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->b2:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->simulator_exit_information_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v1

    invoke-virtual {v1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 4
    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    const-class v2, Lcom/join/mgps/dto/SimulatorAdCfgBean;

    invoke-virtual {v0, v1, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/SimulatorAdCfgBean;

    :cond_0
    if-eqz v0, :cond_3

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorAdCfgBean;->getSwitch_state()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorAdCfgBean;->getPlay_cfg()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 8
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_2

    .line 9
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/PlayCfgBean;

    .line 11
    invoke-virtual {v3}, Lcom/join/mgps/dto/PlayCfgBean;->getProbability()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 12
    :cond_1
    invoke-static {v1}, Lcom/join/mgps/ad/p;->b(Ljava/util/List;)I

    move-result v1

    .line 13
    :cond_2
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/PlayCfgBean;

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->s2:Lcom/join/mgps/dto/PlayCfgBean;

    .line 14
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->Z1()V

    :cond_3
    return-void
.end method

.method public a2()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->g2()Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->n2:Lcom/join/mgps/dto/PlayCfgBean;

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->b2:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->simulator_exit_open_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v1

    invoke-virtual {v1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 4
    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    const-class v2, Lcom/join/mgps/dto/SimulatorAdCfgBean;

    invoke-virtual {v0, v1, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/SimulatorAdCfgBean;

    :cond_0
    if-eqz v0, :cond_5

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorAdCfgBean;->getSwitch_state()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_5

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorAdCfgBean;->getPlay_cfg()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 8
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_2

    .line 9
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/PlayCfgBean;

    .line 11
    invoke-virtual {v4}, Lcom/join/mgps/dto/PlayCfgBean;->getProbability()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 12
    :cond_1
    invoke-static {v1}, Lcom/join/mgps/ad/p;->b(Ljava/util/List;)I

    move-result v1

    .line 13
    :cond_2
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/PlayCfgBean;

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->n2:Lcom/join/mgps/dto/PlayCfgBean;

    if-eqz v0, :cond_5

    .line 14
    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v0

    if-ne v0, v2, :cond_3

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->n2:Lcom/join/mgps/dto/PlayCfgBean;

    invoke-virtual {p0, p0, v0}, Lcom/join/mgps/activity/GameMainActivity3;->f2(Landroid/content/Context;Lcom/join/mgps/dto/PlayCfgBean;)V

    goto :goto_1

    .line 16
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->n2:Lcom/join/mgps/dto/PlayCfgBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->n2:Lcom/join/mgps/dto/PlayCfgBean;

    invoke-virtual {p0, p0, v0}, Lcom/join/mgps/activity/GameMainActivity3;->c2(Landroid/content/Context;Lcom/join/mgps/dto/PlayCfgBean;)V

    goto :goto_1

    .line 18
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->n2:Lcom/join/mgps/dto/PlayCfgBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_5

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->n2:Lcom/join/mgps/dto/PlayCfgBean;

    invoke-virtual {p0, p0, v0}, Lcom/join/mgps/activity/GameMainActivity3;->d2(Landroid/content/Context;Lcom/join/mgps/dto/PlayCfgBean;)V

    .line 20
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "AD_LOG_TAG \u52a0\u8f7d\u878d\u5408\u5e7f\u544a \u9000\u51fa\u5e7f\u544a"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_5
    :goto_1
    return-void
.end method

.method afterViews()V
    .locals 8
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    iput-object p0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/BaseActivity;->setSystemUiHide(Z)V

    .line 3
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->F1:Lcom/join/mgps/rpc/k;

    .line 4
    invoke-static {}, Lcom/join/mgps/rpc/impl/l;->n0()Lcom/join/mgps/rpc/impl/l;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->B1:Lcom/join/mgps/rpc/l;

    .line 5
    invoke-static {}, Lcom/join/mgps/rpc/impl/g;->A0()Lcom/join/mgps/rpc/impl/g;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->c2:Lcom/join/mgps/rpc/i;

    .line 6
    invoke-static {}, Lcom/join/mgps/rpc/impl/e;->m()Lcom/join/mgps/rpc/impl/e;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->N1:Lcom/join/mgps/rpc/f;

    .line 7
    invoke-static {}, Lcom/join/mgps/rpc/impl/c;->k()Lcom/join/mgps/rpc/impl/c;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->O1:Lcom/join/mgps/rpc/d;

    .line 8
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->E1:Lcom/wufan/user/service/protobuf/n0;

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_0

    .line 11
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->Q:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    :cond_0
    new-instance v1, Landroid/view/View;

    invoke-direct {v1, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->T:Landroid/view/View;

    .line 13
    new-instance v1, Lcom/join/mgps/adapter/j1;

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->M1:Ljava/util/List;

    invoke-direct {v1, p0, v2, p0}, Lcom/join/mgps/adapter/j1;-><init>(Landroid/content/Context;Ljava/util/List;Lcom/join/mgps/adapter/j1$a;)V

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->L1:Lcom/join/mgps/adapter/j1;

    .line 14
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->U:Landroid/widget/GridView;

    invoke-virtual {v2, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 15
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->U:Landroid/widget/GridView;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/widget/GridView;->setOverScrollMode(I)V

    .line 16
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07150f

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 17
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0713fa

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    .line 18
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f071241

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    float-to-int v3, v3

    .line 19
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f071293

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    .line 20
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    .line 21
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    mul-int/lit8 v5, v3, 0x2

    sub-int/2addr v4, v5

    mul-int v1, v1, v4

    .line 22
    div-int/2addr v1, v2

    .line 23
    new-instance v2, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    const/4 v4, -0x1

    invoke-direct {v2, v1, v4}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    .line 24
    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 25
    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 26
    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 27
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->V:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 28
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->E1()V

    .line 29
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->getData()V

    .line 30
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->B1()V

    .line 31
    new-instance v1, Lcom/join/mgps/socket/fight/arena/a;

    new-instance v2, Lcom/join/mgps/activity/GameMainActivity3$i;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/GameMainActivity3$i;-><init>(Lcom/join/mgps/activity/GameMainActivity3;)V

    invoke-direct {v1, p0, v2}, Lcom/join/mgps/socket/fight/arena/a;-><init>(Landroid/app/Activity;Lcom/join/mgps/socket/fight/arena/a$y;)V

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->K1:Lcom/join/mgps/socket/fight/arena/a;

    .line 32
    invoke-static {}, Lnotchtools/geek/com/notchtools/b;->o()Lnotchtools/geek/com/notchtools/b;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnotchtools/geek/com/notchtools/b;->c(Landroid/view/Window;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 33
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->W:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 34
    invoke-static {}, Lnotchtools/geek/com/notchtools/b;->o()Lnotchtools/geek/com/notchtools/b;

    move-result-object v2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v2, v3}, Lnotchtools/geek/com/notchtools/b;->e(Landroid/view/Window;)I

    move-result v2

    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f07106c

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 35
    :cond_1
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 36
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    .line 37
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->X:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 38
    new-instance v0, Lcom/join/mgps/adapter/GameRecommendAdapter1;

    invoke-direct {v0, p0}, Lcom/join/mgps/adapter/GameRecommendAdapter1;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->P1:Lcom/join/mgps/adapter/GameRecommendAdapter1;

    .line 39
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/GameRecommendAdapter1;->setGameId(Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->X:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->P1:Lcom/join/mgps/adapter/GameRecommendAdapter1;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 41
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v2

    sget-object v3, Lcom/papa/sim/statistic/Event;->indexGameStart:Lcom/papa/sim/statistic/Event;

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    iget-object v6, p0, Lcom/join/mgps/activity/GameMainActivity3;->O:Ljava/lang/String;

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Lcom/papa/sim/statistic/p;->Z0(Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 42
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Q1:Lcom/join/mgps/activity/GameMainActivity3$EmuOutResultReceiver;

    if-nez v0, :cond_2

    .line 43
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity3$EmuOutResultReceiver;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainActivity3$EmuOutResultReceiver;-><init>(Lcom/join/mgps/activity/GameMainActivity3;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Q1:Lcom/join/mgps/activity/GameMainActivity3$EmuOutResultReceiver;

    .line 44
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.gameout"

    .line 45
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.gameout.ad"

    .line 46
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 47
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->Q1:Lcom/join/mgps/activity/GameMainActivity3$EmuOutResultReceiver;

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 48
    :cond_2
    iget-boolean v0, p0, Lcom/join/mgps/activity/FriendActivity;->m:Z

    if-nez v0, :cond_3

    .line 49
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->T1()V

    .line 50
    new-instance v0, Lcom/join/mgps/dialog/x;

    const v1, 0x7f110165

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/dialog/x;-><init>(Landroid/content/Context;I)V

    const-string v1, "\u5b58\u6863\u4e0b\u8f7d\u4e2d"

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/x;->f(Ljava/lang/String;)Lcom/join/mgps/dialog/x;

    move-result-object v0

    const-string v1, "\u53d6\u6d88\u4e0b\u8f7d"

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/x;->e(Ljava/lang/String;)Lcom/join/mgps/dialog/x;

    move-result-object v0

    const-string v1, "\u540e\u53f0\u8fd0\u884c"

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/x;->b(Ljava/lang/String;)Lcom/join/mgps/dialog/x;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/GameMainActivity3$k;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameMainActivity3$k;-><init>(Lcom/join/mgps/activity/GameMainActivity3;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/x;->d(Lcom/join/mgps/dialog/x$c;)Lcom/join/mgps/dialog/x;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/GameMainActivity3$j;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameMainActivity3$j;-><init>(Lcom/join/mgps/activity/GameMainActivity3;)V

    .line 51
    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/x;->a(Lcom/join/mgps/dialog/x$c;)Lcom/join/mgps/dialog/x;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->T1:Lcom/join/mgps/dialog/x;

    .line 52
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->E0()Z

    move-result v0

    if-nez v0, :cond_4

    .line 53
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->J1()V

    .line 54
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->o1()V

    return-void
.end method

.method public b2(Landroid/content/Context;Lcom/join/mgps/dto/PlayCfgBean;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2}, Lcom/join/mgps/activity/GameMainActivity3;->O1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method back()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public c2(Landroid/content/Context;Lcom/join/mgps/dto/PlayCfgBean;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2}, Lcom/join/mgps/activity/GameMainActivity3;->P1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public d2(Landroid/content/Context;Lcom/join/mgps/dto/PlayCfgBean;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2}, Lcom/join/mgps/activity/GameMainActivity3;->Q1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public e2(Landroid/content/Context;Lcom/join/mgps/dto/PlayCfgBean;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2}, Lcom/join/mgps/activity/GameMainActivity3;->R1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public f2(Landroid/content/Context;Lcom/join/mgps/dto/PlayCfgBean;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2}, Lcom/join/mgps/activity/GameMainActivity3;->S1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method getData()V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 3
    new-instance v1, Lcom/join/mgps/dto/RequestGameIdArgs;

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity3;->E1:Lcom/wufan/user/service/protobuf/n0;

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    :goto_0
    invoke-direct {v1, v2, v4, v4, v3}, Lcom/join/mgps/dto/RequestGameIdArgs;-><init>(Ljava/lang/String;III)V

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestGameIdArgs;->setGameId(Ljava/lang/String;)V

    .line 5
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestGameIdArgs;->setToken(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->F1:Lcom/join/mgps/rpc/k;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/k;->r0(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0

    .line 8
    iput-boolean v4, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y1:Z

    if-eqz v0, :cond_4

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getFlag()I

    move-result v1

    if-ne v1, v4, :cond_4

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameMainV4DataBean;

    .line 11
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameMainActivity3;->v2(Lcom/join/mgps/dto/GameMainV4DataBean;)V

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMaingameinfo;->getCommunity_multi_posts_id()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->D1:Ljava/lang/String;

    .line 14
    :cond_1
    invoke-static {}, Lb2/u;->n()Lb2/u;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lb2/u;->o(Ljava/lang/String;)Lcom/join/mgps/db/tables/GameMainTable;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 15
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getAchieve()Lcom/join/mgps/dto/GameMainachieve;

    move-result-object v2

    .line 16
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v3

    invoke-virtual {v1}, Lcom/join/mgps/db/tables/GameMainTable;->getGame_main_data()Ljava/lang/String;

    move-result-object v5

    const-class v6, Lcom/join/mgps/dto/GameMainDataBean;

    invoke-virtual {v3, v5, v6}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/GameMainDataBean;

    if-eqz v3, :cond_2

    .line 17
    invoke-virtual {v3}, Lcom/join/mgps/dto/GameMainDataBean;->getAchieve()Lcom/join/mgps/dto/GameMainachieve;

    move-result-object v3

    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    .line 18
    invoke-virtual {v3}, Lcom/join/mgps/dto/GameMainachieve;->getLastShowVerTime()J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Lcom/join/mgps/dto/GameMainachieve;->setLastShowVerTime(J)V

    .line 19
    :cond_2
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 20
    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/join/mgps/db/tables/GameMainTable;->setGameid(Ljava/lang/String;)V

    .line 21
    invoke-virtual {v1, v2}, Lcom/join/mgps/db/tables/GameMainTable;->setGame_main_data(Ljava/lang/String;)V

    .line 22
    invoke-static {}, Lb2/u;->n()Lb2/u;

    move-result-object v2

    invoke-virtual {v2, v1}, Lp1/b;->update(Ljava/lang/Object;)I

    goto :goto_1

    .line 23
    :cond_3
    new-instance v1, Lcom/join/mgps/db/tables/GameMainTable;

    invoke-direct {v1}, Lcom/join/mgps/db/tables/GameMainTable;-><init>()V

    .line 24
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 25
    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/join/mgps/db/tables/GameMainTable;->setGameid(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v1, v2}, Lcom/join/mgps/db/tables/GameMainTable;->setGame_main_data(Ljava/lang/String;)V

    .line 27
    invoke-static {}, Lb2/u;->n()Lb2/u;

    move-result-object v2

    invoke-virtual {v2, v1}, Lp1/b;->k(Ljava/lang/Object;)I

    .line 28
    :goto_1
    invoke-virtual {p0, v0, v4}, Lcom/join/mgps/activity/GameMainActivity3;->J2(Lcom/join/mgps/dto/GameMainV4DataBean;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_2
    return-void
.end method

.method h2()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->D2()V

    return-void
.end method

.method handleFailure(Lapp/mgsim/arena/ArenaResponse;)V
    .locals 10
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->N1()V

    .line 2
    iget v0, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    const/16 v1, 0x101

    .line 3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "\u786e\u5b9a"

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x4

    const-string v8, "dialog_error_hint"

    const/16 v9, 0x10

    if-ne v0, v9, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->K1:Lcom/join/mgps/socket/fight/arena/a;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v1, v7, v6

    iget p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v7, v5

    const-string p1, "\u65e0\u6cd5\u52a0\u5165\uff0c\u4f60\u88ab\u7981\u6b62\u52a0\u5165\u8be5\u623f\u95f4"

    aput-object p1, v7, v4

    aput-object v2, v7, v3

    invoke-virtual {v0, v8, v7}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const/16 v9, 0x11

    if-ne v0, v9, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->K1:Lcom/join/mgps/socket/fight/arena/a;

    new-array v2, v7, [Ljava/lang/Object;

    aput-object v1, v2, v6

    iget p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v5

    const-string p1, "\u8be5\u623f\u95f4\u4e3a\u6bd4\u8d5b\u4e13\u7528\u623f\u95f4,\u975e\u53c2\u8d5b\u9009\u624b\u65e0\u6cd5\u52a0\u5165"

    aput-object p1, v2, v4

    const-string p1, "\u6211\u77e5\u9053\u4e86"

    aput-object p1, v2, v3

    invoke-virtual {v0, v8, v2}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    const/16 v9, 0x9

    if-ne v0, v9, :cond_2

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->K1:Lcom/join/mgps/socket/fight/arena/a;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v1, v7, v6

    iget p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v7, v5

    const-string p1, "\u623f\u95f4\u4eba\u6570\u5df2\u6ee1\u4f60\u65e0\u6cd5\u52a0\u5165\u623f\u95f4!"

    aput-object p1, v7, v4

    aput-object v2, v7, v3

    invoke-virtual {v0, v8, v7}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    const/4 v9, 0x7

    if-ne v0, v9, :cond_3

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->K1:Lcom/join/mgps/socket/fight/arena/a;

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v9, 0x100

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v1, v6

    iget v6, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v5

    const-string v5, "\u5bc6\u7801\u8f93\u5165\u9519\u8bef\uff0c\u8bf7\u91cd\u8bd5!"

    aput-object v5, v1, v4

    const-string v4, "\u53d6\u6d88"

    aput-object v4, v1, v3

    aput-object v2, v1, v7

    const/4 v2, 0x5

    aput-object p1, v1, v2

    invoke-virtual {v0, v8, v1}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_3
    const/16 v9, 0x8

    if-ne v0, v9, :cond_4

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->K1:Lcom/join/mgps/socket/fight/arena/a;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v1, v7, v6

    iget p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v7, v5

    const-string p1, "\u623f\u95f4\u5df2\u7ecf\u88ab\u89e3\u6563!"

    aput-object p1, v7, v4

    aput-object v2, v7, v3

    invoke-virtual {v0, v8, v7}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_4
    const/16 v9, 0xb

    if-ne v0, v9, :cond_5

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->K1:Lcom/join/mgps/socket/fight/arena/a;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v1, v7, v6

    iget p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v7, v5

    const-string p1, "\u94dc\u677f\u4e0d\u8db3\uff0c\u65e0\u6cd5\u521b\u5efa\u623f\u95f4!"

    aput-object p1, v7, v4

    aput-object v2, v7, v3

    invoke-virtual {v0, v8, v7}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_5
    const/16 v9, 0xd

    if-ne v0, v9, :cond_6

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->K1:Lcom/join/mgps/socket/fight/arena/a;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v1, v7, v6

    iget p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v7, v5

    const-string p1, "\u94dc\u677f\u4e0d\u8db3\uff0c\u65e0\u6cd5\u52a0\u5165\u623f\u95f4"

    aput-object p1, v7, v4

    aput-object v2, v7, v3

    invoke-virtual {v0, v8, v7}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_6
    const/16 v1, 0x3e9

    if-ne v0, v1, :cond_7

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->K1:Lcom/join/mgps/socket/fight/arena/a;

    new-array v1, v7, [Ljava/lang/Object;

    const/16 v7, 0x102

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v1, v6

    iget v6, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v5

    iget-object p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorInfo:Ljava/lang/String;

    aput-object p1, v1, v4

    aput-object v2, v1, v3

    invoke-virtual {v0, v8, v1}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_7
    return-void
.end method

.method i2(Landroid/content/Intent;)V
    .locals 9
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.cloud.game.main.downCloud"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/FriendActivity;->m:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->W1()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->V1:I

    .line 4
    iput v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->W1:I

    const-string v1, "downCloud"

    .line 5
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/CloudListDataBean;

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->U1:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CloudListDataBean;->getArchiveFile()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/CloudListDataBean;->getArchiveFileName()Ljava/lang/String;

    move-result-object v5

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v2, Ljava/io/File;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CloudListDataBean;->getArchiveFilePath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v1, 0x3

    .line 9
    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/CloudListDataBean;->setStatus(I)V

    .line 10
    new-instance v1, Lcom/github/snowdream/android/app/downloader/c;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CloudListDataBean;->getArchiveFile()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/join/mgps/dto/CloudListDataBean;->getFileSize()J

    move-result-wide v7

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, Lcom/github/snowdream/android/app/downloader/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 11
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->R1:Lcom/github/snowdream/android/app/downloader/b;

    invoke-virtual {v2, v1}, Lcom/github/snowdream/android/app/downloader/b;->b(Lcom/github/snowdream/android/app/downloader/c;)Ljava/lang/String;

    .line 12
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v1

    invoke-virtual {v1, p1}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->T1:Lcom/join/mgps/dialog/x;

    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 14
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->T1:Lcom/join/mgps/dialog/x;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "1/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CloudListDataBean;->getFileSize()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/join/mgps/Util/UtilsMy;->d(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "K"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "0"

    invoke-virtual {v1, p1, v2, v0}, Lcom/join/mgps/dialog/x;->c(Ljava/lang/String;Ljava/lang/String;I)Lcom/join/mgps/dialog/x;

    return-void
.end method

.method j1()V
    .locals 8
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/p;->R(Ljava/lang/String;)V

    .line 2
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    const-string v3, "game_main"

    invoke-virtual {v0, v1, v2, v3}, Lcom/papa/sim/statistic/p;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    :try_start_0
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->L0(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 4
    :goto_0
    new-instance v0, Lcom/join/mgps/dto/GameInfoBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/GameInfoBean;-><init>()V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/GameInfoBean;->setGame_id(Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/GameInfoBean;->setGame_name(Ljava/lang/String;)V

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFight_fun()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFight_fun()Ljava/lang/String;

    move-result-object v1

    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x7

    const/16 v6, 0x31

    const/16 v7, 0x30

    if-lt v4, v5, :cond_2

    const/4 v4, 0x6

    .line 12
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/4 v5, 0x5

    .line 13
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v6, :cond_1

    const/16 v1, 0x31

    goto :goto_1

    :cond_1
    const/16 v1, 0x30

    goto :goto_1

    :cond_2
    const/16 v1, 0x30

    const/16 v4, 0x30

    :goto_1
    if-ne v7, v3, :cond_3

    if-ne v7, v4, :cond_3

    if-ne v1, v6, :cond_3

    .line 14
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->K1()V

    return-void

    .line 15
    :cond_3
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isFightFun()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 16
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->n1()V

    .line 17
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/activity/arena/GameRoomListActivity_;->W3(Landroid/content/Context;)Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;->b(Z)Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;->c(Lcom/join/mgps/dto/GameInfoBean;)Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_2

    .line 18
    :cond_4
    invoke-static {p0}, Lcom/join/mgps/activity/NewArenaMainActivty_;->g1(Landroid/content/Context;)Lcom/join/mgps/activity/NewArenaMainActivty_$h;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :goto_2
    return-void
.end method

.method j2(Landroid/content/Intent;)V
    .locals 9
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.cloud.downCloud.all"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/FriendActivity;->m:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->W1()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    const-string v0, "downClouds"

    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 4
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->V1:I

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->T1:Lcom/join/mgps/dialog/x;

    const-string v1, "0K"

    const-string v2, "1/"

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->T1:Lcom/join/mgps/dialog/x;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4, v1, v3}, Lcom/join/mgps/dialog/x;->c(Ljava/lang/String;Ljava/lang/String;I)Lcom/join/mgps/dialog/x;

    .line 8
    :cond_2
    iput v3, p0, Lcom/join/mgps/activity/GameMainActivity3;->W1:I

    .line 9
    iget v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->V1:I

    if-eqz v0, :cond_3

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->T1:Lcom/join/mgps/dialog/x;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x64

    iget v4, p0, Lcom/join/mgps/activity/GameMainActivity3;->V1:I

    div-int/2addr v3, v4

    invoke-virtual {v0, v2, v1, v3}, Lcom/join/mgps/dialog/x;->c(Ljava/lang/String;Ljava/lang/String;I)Lcom/join/mgps/dialog/x;

    .line 11
    :cond_3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CloudListDataBean;

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->U1:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CloudListDataBean;->getArchiveFile()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/CloudListDataBean;->getArchiveFileName()Ljava/lang/String;

    move-result-object v5

    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/Util/v;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CloudListDataBean;->getArchiveFileName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/CloudListDataBean;->setArchiveFilePath(Ljava/lang/String;)V

    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v3, Ljava/io/File;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CloudListDataBean;->getArchiveFilePath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v1, 0x3

    .line 16
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/CloudListDataBean;->setStatus(I)V

    .line 17
    new-instance v1, Lcom/github/snowdream/android/app/downloader/c;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CloudListDataBean;->getArchiveFile()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/join/mgps/dto/CloudListDataBean;->getFileSize()J

    move-result-wide v7

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, Lcom/github/snowdream/android/app/downloader/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 18
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->R1:Lcom/github/snowdream/android/app/downloader/b;

    invoke-virtual {v2, v1}, Lcom/github/snowdream/android/app/downloader/b;->b(Lcom/github/snowdream/android/app/downloader/c;)Ljava/lang/String;

    .line 19
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v1

    invoke-virtual {v1, v0}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    return-void
.end method

.method k1()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getMemberInfo()Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getMemberInfo()Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;->getLink_type()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v1

    const-string v2, "http"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v1

    const-string v2, "?"

    .line 6
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&game_id="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 8
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "?game_id="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 9
    :goto_0
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;->setLink_type_val(Ljava/lang/String;)V

    .line 10
    :cond_1
    new-instance v1, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v1}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;->getLink_type()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;->getJump_type()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/IntentDateBean;->setJump_type(I)V

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 14
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    invoke-virtual {v0, v2, v1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    :cond_2
    return-void
.end method

.method public k2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.commonpoint"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "eventName"

    .line 2
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "gameId"

    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    invoke-virtual {p0, v0}, Landroid/app/Activity;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method l1()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameMasteryLevel()Lcom/join/mgps/dto/GameMasteryLevel;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_5

    .line 2
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->C1:Lcom/join/mgps/dto/GameMainV4DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean;->getGameMasteryLevel()Lcom/join/mgps/dto/GameMasteryLevel;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [I

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMasteryLevel;->getCurrent_lv_times()I

    move-result v3

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMasteryLevel;->getNext_lv_times()I

    move-result v4

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMasteryLevel;->getLevel()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMasteryLevel;->getLevel()Ljava/lang/String;

    move-result-object v5

    const-string v6, "\u4f20\u8bf4"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMasteryLevel;->getLevel()Ljava/lang/String;

    move-result-object v5

    const-string v6, "\u5b97\u5e08"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMasteryLevel;->getLevel()Ljava/lang/String;

    move-result-object v5

    const-string v6, "\u7cbe\u82f1"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    .line 9
    :cond_3
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMasteryLevel;->getLevel()Ljava/lang/String;

    move-result-object v0

    const-string v5, "\u8d44\u6df1"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->b2:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->gameTimeLvCfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v5, 0x1

    .line 11
    :try_start_1
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v6

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v7

    const-class v8, Ljava/util/ArrayList;

    new-array v9, v5, [Ljava/lang/Class;

    const-class v10, Lcom/join/mgps/dto/GameTimeLevel;

    aput-object v10, v9, v1

    invoke-virtual {v7, v8, v9}, Lcom/join/android/app/common/utils/JsonMapper;->createCollectionType(Ljava/lang/Class;[Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v7

    invoke-virtual {v6, v0, v7}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    new-array v2, v6, [I

    const/4 v6, 0x0

    .line 13
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v6, v7, :cond_5

    .line 14
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/join/mgps/dto/GameTimeLevel;

    invoke-virtual {v7}, Lcom/join/mgps/dto/GameTimeLevel;->getVal()I

    move-result v7

    aput v7, v2, v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    .line 15
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_5
    add-int/2addr v3, v1

    const/4 v0, 0x0

    .line 16
    :goto_2
    array-length v6, v2

    if-ge v1, v6, :cond_8

    add-int/lit8 v4, v1, 0x1

    .line 17
    aget v6, v2, v1

    sub-int v0, v6, v0

    if-gt v3, v0, :cond_6

    goto :goto_3

    .line 18
    :cond_6
    array-length v6, v2

    sub-int/2addr v6, v5

    if-ne v1, v6, :cond_7

    :goto_3
    move v4, v0

    goto :goto_4

    :cond_7
    sub-int/2addr v3, v0

    .line 19
    aget v1, v2, v1

    move v11, v4

    move v4, v0

    move v0, v1

    move v1, v11

    goto :goto_2

    .line 20
    :cond_8
    :goto_4
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_5

    :catch_1
    move-exception v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_9
    :goto_5
    return-void
.end method

.method l2()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->a2:Ljava/util/List;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->T:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/GameMainActivity3;->n2(Z)V

    :cond_0
    return-void
.end method

.method m2()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->e2:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->T:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameMainActivity3;->n2(Z)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->T:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 5
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/GameMainActivity3;->n2(Z)V

    :goto_0
    return-void
.end method

.method n1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->J1:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->J1:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->h2:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    invoke-virtual {v0, v1}, Lcom/join/mgps/socket/fight/arena/ArenaService;->A(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method n2(Z)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->M1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 2
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x7

    const/4 v3, 0x6

    if-eqz v1, :cond_2

    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/DynamicEntranceBean;

    .line 4
    invoke-virtual {v1}, Lcom/join/mgps/dto/DynamicEntranceBean;->getTypeId()I

    move-result v4

    if-eq v4, v3, :cond_1

    invoke-virtual {v1}, Lcom/join/mgps/dto/DynamicEntranceBean;->getTypeId()I

    move-result v1

    if-ne v1, v2, :cond_0

    .line 5
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    const-string v0, ""

    if-eqz p1, :cond_3

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3;->M1:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/dto/DynamicEntranceBean;

    const-string v4, "\u793e\u533a"

    invoke-direct {v1, v4, v0, v3}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    :cond_3
    sget-object p1, Lcom/join/mgps/enums/ConstantIntEnum;->PS2:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {p1}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3;->M1:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/dto/DynamicEntranceBean;

    const-string v3, "\u624b\u67c4\u8bbe\u7f6e"

    invoke-direct {v1, v3, v0, v2}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3;->L1:Lcom/join/mgps/adapter/j1;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method o1()V
    .locals 9
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lcom/join/mgps/Util/UtilsMy;->X1(I)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-void

    .line 5
    :cond_1
    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "backup"

    invoke-virtual {p0, v4}, Landroid/app/Activity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    array-length v3, v3

    if-gtz v3, :cond_2

    goto :goto_1

    .line 7
    :cond_2
    new-instance v3, Ljava/io/File;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "papa91"

    invoke-virtual {p0, v6}, Landroid/app/Activity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    array-length v1, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_3

    aget-object v5, v0, v4

    .line 9
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v8, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Lcom/join/mgps/Util/h0;->c(Ljava/lang/String;Ljava/lang/String;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 10
    :cond_3
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/h0;->h(Ljava/lang/String;Z)V

    :cond_4
    :goto_1
    return-void
.end method

.method public o2(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/GameMainActivity3;->i2:Z

    return-void
.end method

.method public onADEvent(Lcom/join/mgps/event/a;)V
    .locals 4
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/event/a;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 2
    invoke-virtual {p0, p0}, Lcom/join/mgps/activity/GameMainActivity3;->L1(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->t2:I

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->q1()V

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/event/a;->b()I

    move-result p1

    if-nez p1, :cond_1

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->Y1()V

    .line 6
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->a2()V

    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/join/mgps/activity/GameMainActivity3;->o2:Z

    goto :goto_1

    .line 8
    :cond_2
    invoke-virtual {p1}, Lcom/join/mgps/event/a;->a()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_3

    .line 9
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->q1()V

    .line 10
    iput-boolean v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->o2:Z

    goto :goto_1

    .line 11
    :cond_3
    invoke-virtual {p1}, Lcom/join/mgps/event/a;->a()I

    move-result v0

    const/4 v3, 0x3

    if-ne v0, v3, :cond_4

    .line 12
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->q1()V

    .line 13
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->Y1()V

    goto :goto_1

    .line 14
    :cond_4
    invoke-virtual {p1}, Lcom/join/mgps/event/a;->a()I

    move-result p1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_7

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3;->s2:Lcom/join/mgps/dto/PlayCfgBean;

    if-eqz p1, :cond_7

    .line 16
    new-instance p1, Lcom/join/mgps/event/u;

    const/4 v0, 0x5

    invoke-direct {p1, v0}, Lcom/join/mgps/event/u;-><init>(I)V

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->s2:Lcom/join/mgps/dto/PlayCfgBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v0

    if-ne v0, v1, :cond_5

    .line 18
    invoke-virtual {p1, v1}, Lcom/join/mgps/event/u;->d(I)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->v2:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/join/mgps/event/u;->e(Ljava/lang/Object;)V

    .line 20
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "111112 size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->v2:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0

    .line 21
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->s2:Lcom/join/mgps/dto/PlayCfgBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v0

    if-ne v0, v2, :cond_6

    .line 22
    invoke-virtual {p1, v2}, Lcom/join/mgps/event/u;->d(I)V

    .line 23
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->w2:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/join/mgps/event/u;->e(Ljava/lang/Object;)V

    .line 24
    :cond_6
    :goto_0
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    :cond_7
    :goto_1
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "GAME_HOME_PAGE"

    .line 1
    iput-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->j:Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    iput-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->i:Ljava/lang/String;

    .line 3
    invoke-super {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->K1:Lcom/join/mgps/socket/fight/arena/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/a;->w()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_1

    .line 4
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->E1:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->z0(Ljava/lang/String;I)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->J1:Lcom/join/mgps/socket/fight/arena/b;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->J1:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->h2:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    invoke-virtual {v0, v1}, Lcom/join/mgps/socket/fight/arena/ArenaService;->A(Ljava/lang/Object;)V

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->J1:Lcom/join/mgps/socket/fight/arena/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->g()V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->J1:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->stopService()V

    .line 10
    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->J1:Lcom/join/mgps/socket/fight/arena/b;

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Q1:Lcom/join/mgps/activity/GameMainActivity3$EmuOutResultReceiver;

    if-eqz v0, :cond_4

    .line 12
    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 13
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->q2:Lcom/join/mgps/ad/x;

    if-eqz v0, :cond_5

    .line 14
    invoke-virtual {v0}, Lcom/join/mgps/ad/x;->x()V

    .line 15
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->r2:Lcom/join/mgps/ad/f;

    if-eqz v0, :cond_6

    .line 16
    invoke-virtual {v0}, Lcom/join/mgps/ad/f;->w()V

    .line 17
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->u2:Lcom/join/mgps/ad/v;

    if-eqz v0, :cond_7

    .line 18
    invoke-virtual {v0}, Lcom/join/mgps/ad/v;->c()V

    .line 19
    :cond_7
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->x2:Lcom/join/mgps/ad/e;

    if-eqz v0, :cond_8

    .line 20
    invoke-virtual {v0}, Lcom/join/mgps/ad/e;->c()V

    .line 21
    :cond_8
    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->v2:Ljava/util/List;

    .line 22
    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->w2:Ljava/util/List;

    .line 23
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->h:Landroid/os/Handler;

    if-eqz v0, :cond_9

    .line 24
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 25
    :cond_9
    invoke-super {p0}, Lcom/join/mgps/activity/FriendActivity;->onDestroy()V

    .line 26
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->R1:Lcom/github/snowdream/android/app/downloader/b;

    if-eqz v0, :cond_a

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->S1:Lcom/github/snowdream/android/app/downloader/b$b;

    if-eqz v1, :cond_a

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/b;->j(Lcom/github/snowdream/android/app/downloader/b$b;)V

    :cond_a
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 3

    const-string v0, "gameId"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    const-string v0, "from"

    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->O:Ljava/lang/String;

    const-string v0, "GAME_HOME_PAGE"

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->j:Ljava/lang/String;

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    iput-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->i:Ljava/lang/String;

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->afterViews()V

    .line 7
    invoke-super {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->onNewIntent(Landroid/content/Intent;)V

    :cond_1
    :goto_0
    return-void
.end method

.method protected onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/FriendActivity;->onResume()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->N1()V

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->E1:Lcom/wufan/user/service/protobuf/n0;

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->J1:Lcom/join/mgps/socket/fight/arena/b;

    if-nez v0, :cond_0

    .line 5
    new-instance v0, Lcom/join/mgps/socket/fight/arena/b;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->g2:Lcom/join/mgps/socket/fight/arena/b$b;

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/socket/fight/arena/b;-><init>(Landroid/content/Context;Lcom/join/mgps/socket/fight/arena/b$b;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->J1:Lcom/join/mgps/socket/fight/arena/b;

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->bindService()V

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_1

    .line 8
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v1, v2, p0}, Lp1/f;->L(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->d(Ljava/lang/String;I)V

    .line 9
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v1, v2, p0}, Lp1/f;->L(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->d(Ljava/lang/String;I)V

    .line 10
    :cond_1
    iget-boolean v0, p0, Lcom/join/mgps/activity/FriendActivity;->m:Z

    if-nez v0, :cond_2

    .line 11
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->T1()V

    .line 12
    :cond_2
    invoke-static {p0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/a0;->e(Landroid/content/Context;)Z

    return-void
.end method

.method protected onStart()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onStart()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/FriendActivity;->h:Landroid/os/Handler;

    new-instance v1, Lcom/join/mgps/activity/GameMainActivity3$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameMainActivity3$a;-><init>(Lcom/join/mgps/activity/GameMainActivity3;)V

    const-wide/16 v2, 0x3c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method protected onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/BaseActivity;->onStop()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->J1:Lcom/join/mgps/socket/fight/arena/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->J1:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->h2:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    invoke-virtual {v0, v1}, Lcom/join/mgps/socket/fight/arena/ArenaService;->A(Ljava/lang/Object;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->J1:Lcom/join/mgps/socket/fight/arena/b;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->g()V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->J1:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->stopService()V

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->J1:Lcom/join/mgps/socket/fight/arena/b;

    :cond_1
    return-void
.end method

.method p1()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, "\u767b\u5f55\u5df2\u5931\u6548\u8bf7\u60a8\u91cd\u65b0\u767b\u5f55"

    .line 1
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameMainActivity3;->showToast(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->U1()V

    return-void
.end method

.method public q2()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->g2()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->o2:Z

    if-eqz v0, :cond_4

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->n2:Lcom/join/mgps/dto/PlayCfgBean;

    if-eqz v0, :cond_3

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v0

    const-string v1, ""

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->q2:Lcom/join/mgps/ad/x;

    if-eqz v0, :cond_3

    .line 6
    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v0, p0, v3}, Lcom/join/mgps/ad/d;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 7
    iput-boolean v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->p2:Z

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->b2:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->lastLaunchModGameId()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->n2:Lcom/join/mgps/dto/PlayCfgBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->r2:Lcom/join/mgps/ad/f;

    if-eqz v0, :cond_3

    .line 11
    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v0, p0, v3}, Lcom/join/mgps/ad/d;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 12
    iput-boolean v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->p2:Z

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->b2:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->lastLaunchModGameId()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_0

    .line 14
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->n2:Lcom/join/mgps/dto/PlayCfgBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v0

    const/4 v3, 0x7

    if-ne v0, v3, :cond_3

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->y2:Lcom/join/mgps/ad/j;

    if-eqz v0, :cond_2

    .line 16
    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v0, p0, v3}, Lcom/join/mgps/ad/d;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 17
    iput-boolean v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->p2:Z

    .line 18
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->b2:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->lastLaunchModGameId()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 19
    :cond_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "AD_LOG_TAG \u663e\u793a\u878d\u5408\u5e7f\u544a \u9000\u51fa\u5e7f\u544a"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_3
    :goto_0
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->o2:Z

    :cond_4
    return-void
.end method

.method r2()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.wufun.cloud.game.main.showDownDialog"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/FriendActivity;->m:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->R1:Lcom/github/snowdream/android/app/downloader/b;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/b;->g()I

    move-result v0

    if-lez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->T1:Lcom/join/mgps/dialog/x;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_1
    return-void
.end method

.method s1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->T:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->d2:I

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->d2:I

    invoke-virtual {v0, p0, v1}, Lcom/join/mgps/Util/IntentUtil;->goForumGroupActivity(Landroid/content/Context;I)V

    goto :goto_1

    .line 3
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->D2()V

    :goto_1
    return-void
.end method

.method s2(Lcom/join/mgps/dto/DomainInfoBean;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Z1:Lcom/join/mgps/dialog/l1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->p2()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    if-eqz p1, :cond_2

    .line 3
    new-instance v0, Lcom/join/mgps/dialog/l1;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/dialog/l1;-><init>(Landroid/content/Context;Lcom/join/mgps/dto/DomainInfoBean;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Z1:Lcom/join/mgps/dialog/l1;

    .line 4
    new-instance v1, Lcom/join/mgps/activity/GameMainActivity3$l;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/activity/GameMainActivity3$l;-><init>(Lcom/join/mgps/activity/GameMainActivity3;Lcom/join/mgps/dto/DomainInfoBean;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/l1;->t(Lcom/join/mgps/dialog/l1$a;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Z1:Lcom/join/mgps/dialog/l1;

    invoke-virtual {v0}, Lcom/join/mgps/dialog/l1;->show()V

    .line 6
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->pdSimulatorStartWin:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    invoke-virtual {p1}, Lcom/join/mgps/dto/DomainInfoBean;->getIs_join()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setIsJoin(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    invoke-virtual {p1}, Lcom/join/mgps/dto/DomainInfoBean;->getAb_test_number()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/papa/sim/statistic/Ext;->setTestAbNumber(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    :cond_2
    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method t1(Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/UtilsMy;->p4(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->X1(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v2, Ljava/io/File;

    sget-object v3, Lcom/join/mgps/Util/v;->d:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "papa91"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x2f

    .line 6
    invoke-virtual {v1, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    .line 7
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    .line 8
    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 9
    new-instance v3, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_0

    .line 11
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 12
    :cond_0
    new-instance v4, Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CloudListDataBean;->getArchiveFileName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 13
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CloudListDataBean;->getArchiveFilePath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 14
    :cond_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/CloudListDataBean;->getArchiveFilePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lcom/join/mgps/Util/h0;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    .line 15
    invoke-virtual {p1}, Lcom/join/mgps/dto/CloudListDataBean;->getArchiveCover()Ljava/lang/String;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/CloudListDataBean;->getArchiveFileName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ".png"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v1, v2, v3}, Lcom/join/mgps/activity/GameMainActivity3;->u1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_2

    .line 16
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CloudListDataBean;->getArchiveFilePath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 17
    invoke-virtual {p1, v4}, Lcom/join/mgps/dto/CloudListDataBean;->setArchiveFilePath(Ljava/lang/String;)V

    .line 18
    :cond_2
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameMainActivity3;->I2(Lcom/join/mgps/dto/CloudListDataBean;)V

    return-void
.end method

.method public t2()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->p2:Z

    if-nez v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/a0;->e(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->p2:Z

    :cond_0
    return-void
.end method

.method u1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const/4 v0, 0x0

    .line 1
    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    .line 3
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 4
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 5
    new-instance p3, Ljava/io/File;

    invoke-direct {p3, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 6
    :try_start_1
    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 7
    invoke-static {p3}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 8
    :cond_1
    invoke-virtual {p3}, Ljava/io/File;->createNewFile()Z

    .line 9
    new-instance p2, Ljava/net/URL;

    invoke-direct {p2, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 10
    invoke-virtual {p2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    check-cast p1, Ljava/net/HttpURLConnection;

    const/16 p2, 0x1388

    .line 11
    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const-string p2, "GET"

    .line 12
    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/4 p2, 0x1

    .line 13
    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 14
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p2

    const/16 v0, 0xc8

    if-ne p2, v0, :cond_3

    .line 15
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    .line 16
    new-instance p2, Ljava/io/FileOutputStream;

    invoke-direct {p2, p3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/16 v0, 0x400

    new-array v0, v0, [B

    .line 17
    :goto_0
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x0

    .line 18
    invoke-virtual {p2, v0, v2, v1}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_0

    .line 19
    :cond_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 20
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V

    goto :goto_2

    .line 21
    :cond_3
    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 22
    invoke-static {p3}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    move-object v0, p3

    goto :goto_1

    :catch_1
    move-exception p1

    .line 23
    :goto_1
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    if-eqz v0, :cond_4

    .line 24
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 25
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_2
    return-void
.end method

.method public u2(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->y2:Lcom/join/mgps/ad/j;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1, p2}, Lcom/join/mgps/ad/d;->r(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method v2(Lcom/join/mgps/dto/GameMainV4DataBean;)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    return-void
.end method

.method w2(Lcom/join/mgps/dto/OnlineCouponConfigBean;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, p0, p1, v1}, Lcom/join/mgps/Util/a0;->V(Landroid/content/Context;Lcom/join/mgps/dto/OnlineCouponConfigBean;I)V

    .line 2
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->quitSingleSuccessUpRedBag:Lcom/papa/sim/statistic/Event;

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->Q1(Lcom/papa/sim/statistic/Event;I)V

    return-void
.end method

.method x2()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->A1:Lcom/join/mgps/activity/GameMainActivity3$r;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->A1:Lcom/join/mgps/activity/GameMainActivity3$r;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 3
    :cond_0
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity3$r;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    const v2, 0x7f110165

    invoke-direct {v0, p0, v1, v2}, Lcom/join/mgps/activity/GameMainActivity3$r;-><init>(Lcom/join/mgps/activity/GameMainActivity3;Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->A1:Lcom/join/mgps/activity/GameMainActivity3$r;

    .line 4
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method y1()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->N1()V

    return-void

    .line 3
    :cond_0
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    .line 5
    invoke-static {}, Lcom/join/mgps/rpc/impl/l;->n0()Lcom/join/mgps/rpc/impl/l;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/join/mgps/rpc/impl/l;->P(ILjava/lang/String;)Lcom/join/mgps/dto/ResultArenaBean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultArenaBean;->getError()I

    move-result v1

    if-nez v1, :cond_2

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultArenaBean;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultArenaBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lapp/mgsim/arena/ArenaLobbyServer;

    invoke-virtual {v0}, Lapp/mgsim/arena/ArenaLobbyServer;->getDisabled()I

    move-result v0

    if-eqz v0, :cond_1

    .line 9
    new-instance v0, Lapp/mgsim/arena/ArenaResponse;

    invoke-direct {v0}, Lapp/mgsim/arena/ArenaResponse;-><init>()V

    const/16 v1, 0x3e9

    .line 10
    iput v1, v0, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    const-string v1, "\u9080\u8bf7\u5931\u8d25\uff1a\u8be5\u73a9\u5bb6\u5df2\u88ab\u5c01\u7981\uff01"

    .line 11
    iput-object v1, v0, Lapp/mgsim/arena/ArenaResponse;->errorInfo:Ljava/lang/String;

    .line 12
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameMainActivity3;->handleFailure(Lapp/mgsim/arena/ArenaResponse;)V

    return-void

    .line 13
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->z1()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_0
    return-void
.end method

.method public y2(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->q2:Lcom/join/mgps/ad/x;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->q2:Lcom/join/mgps/ad/x;

    invoke-virtual {v0, p1, p2}, Lcom/join/mgps/ad/d;->r(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method z1()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/IntentUtil;->goLoginBattle(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity3;->m1()V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->P:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->f2:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->Y:Landroid/content/Context;

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v2}, Lcom/join/mgps/Util/UtilsMy;->W(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    const-string v0, "\u6b63\u5728\u4e0b\u8f7d\u63d2\u4ef6..."

    .line 7
    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity3;->N1()V

    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->J1:Lcom/join/mgps/socket/fight/arena/b;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->J1:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/ArenaService;->s()Z

    move-result v0

    const-string v3, "register_type_GameMainActivity"

    if-eqz v0, :cond_1

    .line 11
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Lcom/wufan/friend/chat/c;->V(Lcom/join/mgps/dto/FriendBean;)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3;->N:Ljava/lang/String;

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v4

    invoke-static {v3, v0, v1, v4, v2}, Lapp/mgsim/arena/ArenaRequestFactory;->createRoom(Ljava/lang/String;Ljava/lang/String;IIZ)Lapp/mgsim/arena/ArenaRequest;

    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->J1:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v1, v0}, Lcom/join/mgps/socket/fight/arena/b;->f(Lapp/mgsim/arena/ArenaRequest;)V

    goto :goto_0

    .line 14
    :cond_1
    invoke-static {v3}, Lapp/mgsim/arena/ArenaRequestFactory;->login(Ljava/lang/String;)Lapp/mgsim/arena/ArenaRequest;

    move-result-object v0

    .line 15
    iput-boolean v2, v0, Lapp/mgsim/arena/ArenaRequest;->isRefreshing:Z

    .line 16
    iput-boolean v1, v0, Lapp/mgsim/arena/ArenaRequest;->isElite:Z

    .line 17
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->J1:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v1, v0}, Lcom/join/mgps/socket/fight/arena/b;->f(Lapp/mgsim/arena/ArenaRequest;)V

    .line 18
    :cond_2
    :goto_0
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity3;->p0:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainActivity3;->E1:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->N0(Ljava/lang/String;I)V

    goto :goto_1

    :cond_3
    const-string v0, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    .line 19
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameMainActivity3;->showToast(Ljava/lang/String;)V

    :goto_1
    return-void
.end method
