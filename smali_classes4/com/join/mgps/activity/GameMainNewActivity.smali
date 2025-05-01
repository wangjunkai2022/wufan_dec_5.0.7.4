.class public Lcom/join/mgps/activity/GameMainNewActivity;
.super Landroid/app/Activity;
.source "GameMainNewActivity.java"

# interfaces
.implements Lcom/join/mgps/adapter/j1$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/GameMainNewActivity$g;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0056
.end annotation

.annotation build Lorg/androidannotations/annotations/Fullscreen;
.end annotation

.annotation build Lorg/androidannotations/annotations/WindowFeature;
    value = {
        0x1
    }
.end annotation


# instance fields
.field A:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private A1:Z

.field B:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private B1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommentAllListBean$GeneralCommentBean;",
            ">;"
        }
    .end annotation
.end field

.field C:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field C1:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field D:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field D1:Lcom/join/mgps/rpc/i;

.field E:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field E1:I

.field private F:Landroid/content/Context;

.field F1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;",
            ">;"
        }
    .end annotation
.end field

.field G:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/db/tables/PlayGameTimeTable;",
            ">;"
        }
    .end annotation
.end field

.field private G1:Landroid/os/CountDownTimer;

.field private H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field private final H1:Lcom/join/mgps/socket/fight/arena/b$b;

.field private I:Ljava/lang/String;

.field private final I1:Lapp/mgsim/arena/SocketListener$NotifyObserver;

.field J:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/PspBattleServer;",
            ">;"
        }
    .end annotation
.end field

.field K:Lcom/join/mgps/activity/GameMainNewActivity$g;

.field L:Lcom/join/mgps/rpc/l;

.field M:Lcom/join/mgps/dto/GameMainV3DataBean;

.field private N:Ljava/lang/String;

.field O:Lcom/wufan/user/service/protobuf/n0;

.field P:Lcom/join/mgps/rpc/e;

.field private Q:Ljava/lang/String;

.field private R:I

.field private S:Ljava/lang/String;

.field private T:Lcom/join/mgps/socket/fight/arena/b;

.field private U:Lcom/join/mgps/socket/fight/arena/a;

.field private V:Lcom/join/mgps/adapter/j1;

.field private W:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/DynamicEntranceBean;",
            ">;"
        }
    .end annotation
.end field

.field private X:Lcom/join/mgps/adapter/MemberFunAdapter;

.field private Y:Lcom/join/mgps/adapter/GameRecommendAdapter;

.field Z:Lcom/join/mgps/rpc/f;

.field b:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field n:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field o:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field p:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private p0:Ljava/lang/String;

.field private p1:Landroid/graphics/Bitmap;

.field q:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field r:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field s:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field t:Landroid/widget/GridView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field u:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field v:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private v1:Ljava/lang/String;

.field w:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field x:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field y:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field z:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->I:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->Q:Ljava/lang/String;

    const/4 v1, 0x0

    .line 4
    iput v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->R:I

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->S:Ljava/lang/String;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->W:Ljava/util/List;

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->p1:Landroid/graphics/Bitmap;

    .line 8
    iput-boolean v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->A1:Z

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->B1:Ljava/util/List;

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F1:Ljava/util/List;

    .line 11
    new-instance v0, Lcom/join/mgps/activity/GameMainNewActivity$d;

    const-wide/16 v3, 0x2710

    const-wide/16 v5, 0x3e8

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/join/mgps/activity/GameMainNewActivity$d;-><init>(Lcom/join/mgps/activity/GameMainNewActivity;JJ)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->G1:Landroid/os/CountDownTimer;

    .line 12
    new-instance v0, Lcom/join/mgps/activity/GameMainNewActivity$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainNewActivity$e;-><init>(Lcom/join/mgps/activity/GameMainNewActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H1:Lcom/join/mgps/socket/fight/arena/b$b;

    .line 13
    new-instance v0, Lcom/join/mgps/activity/GameMainNewActivity$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainNewActivity$f;-><init>(Lcom/join/mgps/activity/GameMainNewActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->I1:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    return-void
.end method

.method private G()Lcom/facebook/drawee/view/SimpleDraweeView;
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-direct {v0, p0}, Lcom/facebook/drawee/view/SimpleDraweeView;-><init>(Landroid/content/Context;)V

    .line 2
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-object v0
.end method

.method private N()Z
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

.method private S()V
    .locals 10

    .line 1
    invoke-static {}, Lb2/d0;->n()Lb2/d0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->O:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lb2/d0;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->G:Ljava/util/List;

    const-string v1, "0\u5206\u949f"

    if-eqz v0, :cond_4

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->g:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->G:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/db/tables/PlayGameTimeTable;

    invoke-virtual {v0}, Lcom/join/mgps/db/tables/PlayGameTimeTable;->getGamePlayTotalTime()J

    move-result-wide v4

    const-wide/16 v6, 0xe10

    .line 8
    div-long v8, v4, v6

    long-to-int v0, v8

    .line 9
    rem-long/2addr v4, v6

    const-wide/16 v6, 0x3c

    div-long v8, v4, v6

    long-to-int v9, v8

    .line 10
    rem-long/2addr v4, v6

    if-eqz v0, :cond_0

    .line 11
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\u5c0f\u65f6"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_0
    if-eqz v9, :cond_1

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\u5206\u949f"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 13
    :cond_1
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    move-object v1, v2

    .line 14
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->G:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/db/tables/PlayGameTimeTable;

    invoke-virtual {v0}, Lcom/join/mgps/db/tables/PlayGameTimeTable;->getGamePlayRecentlyTime()J

    move-result-wide v0

    const-wide/16 v4, 0x0

    cmp-long v2, v0, v4

    if-lez v2, :cond_3

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->G:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/db/tables/PlayGameTimeTable;

    invoke-virtual {v0}, Lcom/join/mgps/db/tables/PlayGameTimeTable;->getGamePlayRecentlyTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v0, v0, v2

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/g;->a(J)Ljava/lang/String;

    move-result-object v0

    .line 17
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 18
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->h:Landroid/widget/TextView;

    const-string v1, "\u65e0"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 19
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->g:Landroid/widget/TextView;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 21
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 22
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 23
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->h:Landroid/widget/TextView;

    const-string v1, "\u672a\u73a9\u8fc7"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method

.method private U()V
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

.method private W(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->B1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v0, p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->M:Lcom/join/mgps/dto/GameMainV3DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV3DataBean;->getGame_info()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/activity/CommentDetailActivity_;->M1(Landroid/content/Context;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->d(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->B1:Ljava/util/List;

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

    :cond_0
    return-void
.end method

.method private Y(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v0, p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F1:Ljava/util/List;

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
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {p1, v0, v1}, Lcom/join/mgps/Util/j0;->w0(Landroid/content/Context;Lcom/join/mgps/dto/ForumBean$ForumPostsBean;Lcom/join/mgps/dto/ExtBean;)V

    :cond_0
    return-void
.end method

.method private Z(Z)V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFight_fun()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x1

    const-string v4, ""

    const/4 v5, 0x0

    const/4 v6, 0x4

    if-eqz v1, :cond_9

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->W:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->V:Lcom/join/mgps/adapter/j1;

    invoke-virtual {v1}, Lcom/join/mgps/adapter/j1;->b()V

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v7, 0x5

    const/4 v8, 0x2

    const/16 v9, 0x31

    if-lt v1, v8, :cond_5

    .line 6
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v10

    const/4 v11, 0x7

    const/16 v12, 0x30

    if-lt v10, v11, :cond_0

    const/4 v10, 0x6

    .line 8
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    .line 9
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-ne v11, v9, :cond_1

    const/16 v11, 0x31

    goto :goto_0

    :cond_0
    const/16 v10, 0x30

    :cond_1
    const/16 v11, 0x30

    :goto_0
    if-eq v9, v1, :cond_4

    if-ne v9, v10, :cond_2

    goto :goto_1

    :cond_2
    if-ne v12, v1, :cond_3

    if-ne v12, v10, :cond_3

    if-ne v11, v9, :cond_3

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->j:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_2

    .line 11
    :cond_3
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->j:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_2

    .line 12
    :cond_4
    :goto_1
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->j:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 13
    :cond_5
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v10, 0xc

    if-le v1, v10, :cond_6

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p0, p0, v1}, Lcom/join/mgps/activity/GameMainNewActivity;->O(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 14
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v9, :cond_6

    .line 15
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->W:Ljava/util/List;

    new-instance v10, Lcom/join/mgps/dto/DynamicEntranceBean;

    const-string v11, "\u6392\u4f4d\u8d5b"

    const-string v12, "NEW"

    invoke-direct {v10, v11, v12, v3}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v6, :cond_7

    .line 17
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v9, :cond_7

    .line 18
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->W:Ljava/util/List;

    new-instance v10, Lcom/join/mgps/dto/DynamicEntranceBean;

    const-string v11, "\u7ec3\u4e60\u6a21\u5f0f"

    invoke-direct {v10, v11, v4, v7}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    :cond_7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v7, 0x3

    if-lt v1, v6, :cond_8

    .line 20
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v9, :cond_8

    .line 21
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->W:Ljava/util/List;

    new-instance v10, Lcom/join/mgps/dto/DynamicEntranceBean;

    const-string v11, "\u7ea6\u6218"

    invoke-direct {v10, v11, v4, v8}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    :cond_8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v1, v3, :cond_9

    .line 23
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v9, v0, :cond_9

    .line 24
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->W:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/dto/DynamicEntranceBean;

    const-string v8, "\u672c\u5730\u5bf9\u6218"

    invoke-direct {v1, v8, v4, v7}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    :cond_9
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->M:Lcom/join/mgps/dto/GameMainV3DataBean;

    if-eqz v0, :cond_19

    .line 26
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->y:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 27
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->z:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 28
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->M:Lcom/join/mgps/dto/GameMainV3DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV3DataBean;->getGame_info()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 29
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_back_ground_img()Ljava/lang/String;

    move-result-object v1

    .line 30
    invoke-static {v1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_a

    .line 31
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->u:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v2, v1}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageURI(Ljava/lang/String;)V

    .line 32
    :cond_a
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getCommunity_area_id()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->E1:I

    if-eqz p1, :cond_d

    .line 33
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->N:Ljava/lang/String;

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_b

    .line 34
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->N:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameMainNewActivity;->E(Ljava/lang/String;)V

    goto :goto_3

    .line 35
    :cond_b
    iget p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->E1:I

    if-eqz p1, :cond_c

    .line 36
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->B()V

    goto :goto_3

    .line 37
    :cond_c
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->y()V

    .line 38
    :cond_d
    :goto_3
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->M:Lcom/join/mgps/dto/GameMainV3DataBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV3DataBean;->getMember_info()Lcom/join/mgps/dto/GameMainV3DataBean$MemberInfoBean;

    move-result-object p1

    if-eqz p1, :cond_f

    .line 39
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV3DataBean$MemberInfoBean;->getPic_remote()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 40
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->v:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV3DataBean$MemberInfoBean;->getPic_remote()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageURI(Ljava/lang/String;)V

    .line 41
    :cond_e
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->l:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV3DataBean$MemberInfoBean;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->m:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV3DataBean$MemberInfoBean;->getSub_title()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    :cond_f
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->M:Lcom/join/mgps/dto/GameMainV3DataBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV3DataBean;->getMember_fun()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_10

    .line 44
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_10

    .line 45
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->X:Lcom/join/mgps/adapter/MemberFunAdapter;

    invoke-virtual {v0, p1}, Lcom/join/mgps/adapter/MemberFunAdapter;->c(Ljava/util/List;)V

    .line 46
    :cond_10
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->M:Lcom/join/mgps/dto/GameMainV3DataBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV3DataBean;->getGame_recommend_info()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_11

    .line 47
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_11

    .line 48
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->Y:Lcom/join/mgps/adapter/GameRecommendAdapter;

    invoke-virtual {v0, p1}, Lcom/join/mgps/adapter/GameRecommendAdapter;->b(Ljava/util/List;)V

    .line 49
    :cond_11
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->M:Lcom/join/mgps/dto/GameMainV3DataBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV3DataBean;->getNet_battle()Lcom/join/mgps/dto/GameMainNetBattle;

    move-result-object p1

    if-eqz p1, :cond_12

    .line 50
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->d:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainNetBattle;->getNumber()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\u623f"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    :cond_12
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->M:Lcom/join/mgps/dto/GameMainV3DataBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV3DataBean;->getPlay_game_info()Lcom/join/mgps/dto/GameMainV3DataBean$PlayGameInfoBean;

    move-result-object p1

    .line 52
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 53
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 54
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 55
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz p1, :cond_18

    .line 56
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV3DataBean$PlayGameInfoBean;->getFile_save_count()I

    move-result v0

    .line 57
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV3DataBean$PlayGameInfoBean;->getFile_save_switch()I

    move-result v1

    if-ne v1, v3, :cond_13

    .line 58
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->W:Ljava/util/List;

    new-instance v2, Lcom/join/mgps/dto/DynamicEntranceBean;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "\u4e91\u5b58\u6863"

    invoke-direct {v2, v3, v0, v6}, Lcom/join/mgps/dto/DynamicEntranceBean;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    :cond_13
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->V:Lcom/join/mgps/adapter/j1;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 60
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV3DataBean$PlayGameInfoBean;->getCurrent_play_time()J

    move-result-wide v10

    const-wide/16 v0, 0xe10

    .line 61
    div-long v2, v10, v0

    long-to-int v3, v2

    .line 62
    rem-long v0, v10, v0

    const-wide/16 v7, 0x3c

    div-long v12, v0, v7

    long-to-int v2, v12

    .line 63
    rem-long/2addr v0, v7

    if-eqz v3, :cond_14

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\u5c0f\u65f6"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_14
    move-object v0, v4

    :goto_4
    if-eqz v2, :cond_15

    .line 65
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\u5206\u949f"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 66
    :cond_15
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_16

    const-string v0, "0\u5206\u949f"

    .line 67
    :cond_16
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV3DataBean$PlayGameInfoBean;->getCurrent_play_time()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v7, v0, v2

    if-lez v7, :cond_17

    .line 69
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV3DataBean$PlayGameInfoBean;->getLast_play_time()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v0, v0, v2

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/g;->a(J)Ljava/lang/String;

    move-result-object v0

    .line 70
    new-instance v1, Lcom/join/mgps/db/tables/PlayGameTimeTable;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainNewActivity;->O:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV3DataBean$PlayGameInfoBean;->getLast_play_time()J

    move-result-wide v12

    move-object v7, v1

    invoke-direct/range {v7 .. v13}, Lcom/join/mgps/db/tables/PlayGameTimeTable;-><init>(Ljava/lang/String;Ljava/lang/String;JJ)V

    .line 71
    invoke-static {}, Lb2/d0;->n()Lb2/d0;

    move-result-object p1

    invoke-virtual {p1, v1}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->g:Landroid/widget/TextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 74
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 75
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->e:Landroid/widget/TextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 76
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->f:Landroid/widget/TextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_5

    .line 77
    :cond_17
    new-instance p1, Lcom/join/mgps/db/tables/PlayGameTimeTable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->O:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    const-wide/16 v12, 0x0

    move-object v7, p1

    invoke-direct/range {v7 .. v13}, Lcom/join/mgps/db/tables/PlayGameTimeTable;-><init>(Ljava/lang/String;Ljava/lang/String;JJ)V

    .line 78
    invoke-static {}, Lb2/d0;->n()Lb2/d0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->g:Landroid/widget/TextView;

    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 80
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 81
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->e:Landroid/widget/TextView;

    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 82
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->f:Landroid/widget/TextView;

    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_5

    .line 83
    :cond_18
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->g:Landroid/widget/TextView;

    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 84
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 85
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->e:Landroid/widget/TextView;

    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 86
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->f:Landroid/widget/TextView;

    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 87
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->V:Lcom/join/mgps/adapter/j1;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    goto :goto_5

    .line 88
    :cond_19
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->y:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 89
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->z:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :goto_5
    return-void
.end method

.method static synthetic a(Lcom/join/mgps/activity/GameMainNewActivity;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/activity/GameMainNewActivity;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->I:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lcom/join/mgps/activity/GameMainNewActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-object p0
.end method

.method static synthetic d(Lcom/join/mgps/activity/GameMainNewActivity;)Lcom/join/mgps/socket/fight/arena/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->T:Lcom/join/mgps/socket/fight/arena/b;

    return-object p0
.end method

.method static synthetic e(Lcom/join/mgps/activity/GameMainNewActivity;)Lapp/mgsim/arena/SocketListener$NotifyObserver;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->I1:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    return-object p0
.end method

.method static synthetic f(Lcom/join/mgps/activity/GameMainNewActivity;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->N()Z

    move-result p0

    return p0
.end method

.method static synthetic g(Lcom/join/mgps/activity/GameMainNewActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->w()V

    return-void
.end method

.method static synthetic h(Lcom/join/mgps/activity/GameMainNewActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->k()V

    return-void
.end method

.method static synthetic i(Lcom/join/mgps/activity/GameMainNewActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->U()V

    return-void
.end method

.method private k()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->G1:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    :cond_0
    return-void
.end method

.method private q()V
    .locals 5

    .line 1
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->startArchiveManagement:Lcom/papa/sim/statistic/Event;

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    const-string v4, "1"

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/papa/sim/statistic/p;->X0(Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/activity/DocumentManageActivity_;->S0(Landroid/content/Context;)Lcom/join/mgps/activity/DocumentManageActivity_$u;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/DocumentManageActivity_$u;->a(I)Lcom/join/mgps/activity/DocumentManageActivity_$u;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/DocumentManageActivity_$u;->b(Ljava/lang/String;)Lcom/join/mgps/activity/DocumentManageActivity_$u;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method private s()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/activity/ApFightActivity_;->n0(Landroid/content/Context;)Lcom/join/mgps/activity/ApFightActivity_$r;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/ApFightActivity_$r;->a(Ljava/lang/String;)Lcom/join/mgps/activity/ApFightActivity_$r;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 2
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->O:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->y0(Ljava/lang/String;I)V

    return-void
.end method

.method private u()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    const-string v1, "onEnterQualifying"

    invoke-static {v0, v1}, Lcom/umeng/analytics/MobclickAgent;->onEvent(Landroid/content/Context;Ljava/lang/String;)V

    .line 2
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->W(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    const-string v1, "\u6b63\u5728\u4e0b\u8f7d\u63d2\u4ef6..."

    .line 4
    invoke-static {p0, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->L()V

    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->M:Lcom/join/mgps/dto/GameMainV3DataBean;

    if-nez v0, :cond_1

    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/activity/GamePaiWeiActivty_;->o0(Landroid/content/Context;)Lcom/join/mgps/activity/GamePaiWeiActivty_$v;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/GamePaiWeiActivty_$v;->a(Ljava/lang/String;)Lcom/join/mgps/activity/GamePaiWeiActivty_$v;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->M:Lcom/join/mgps/dto/GameMainV3DataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV3DataBean;->getGame_info()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMaingameinfo;->getMax_battle_count()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/GamePaiWeiActivty_$v;->b(I)Lcom/join/mgps/activity/GamePaiWeiActivty_$v;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_0

    .line 8
    :cond_2
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private w()V
    .locals 5

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
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->k()V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->b:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->G1:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

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
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->L()V

    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->T:Lcom/join/mgps/socket/fight/arena/b;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->T:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/ArenaService;->s()Z

    move-result v0

    const-string v3, "register_type_GameMainActivity"

    if-eqz v0, :cond_1

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v4

    invoke-static {v3, v0, v1, v4, v2}, Lapp/mgsim/arena/ArenaRequestFactory;->createRoom(Ljava/lang/String;Ljava/lang/String;IIZ)Lapp/mgsim/arena/ArenaRequest;

    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->T:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v1, v0}, Lcom/join/mgps/socket/fight/arena/b;->f(Lapp/mgsim/arena/ArenaRequest;)V

    goto :goto_0

    .line 13
    :cond_1
    invoke-static {v3}, Lapp/mgsim/arena/ArenaRequestFactory;->login(Ljava/lang/String;)Lapp/mgsim/arena/ArenaRequest;

    move-result-object v0

    .line 14
    iput-boolean v2, v0, Lapp/mgsim/arena/ArenaRequest;->isRefreshing:Z

    .line 15
    iput-boolean v1, v0, Lapp/mgsim/arena/ArenaRequest;->isElite:Z

    .line 16
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->T:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v1, v0}, Lcom/join/mgps/socket/fight/arena/b;->f(Lapp/mgsim/arena/ArenaRequest;)V

    .line 17
    :cond_2
    :goto_0
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->O:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->N0(Ljava/lang/String;I)V

    goto :goto_1

    .line 18
    :cond_3
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method private x()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v1, v0, p0, v2}, Lcom/join/mgps/Util/UtilsMy;->i(Lcom/join/mgps/db/tables/EMUApkTable;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;I)V

    .line 2
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->O:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->T0(Ljava/lang/String;I)V

    .line 3
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->O:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->A0(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method A()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    invoke-static {}, Lb2/u;->n()Lb2/u;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lb2/u;->o(Ljava/lang/String;)Lcom/join/mgps/db/tables/GameMainTable;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/db/tables/GameMainTable;->getGame_main_data()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Lcom/join/mgps/dto/GameMainV3DataBean;

    invoke-virtual {v1, v0, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameMainV3DataBean;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV3DataBean;->getGame_info()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV3DataBean;->getGame_info()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMaingameinfo;->getCommunity_multi_posts_id()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->N:Ljava/lang/String;

    :cond_0
    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/GameMainNewActivity;->a0(Lcom/join/mgps/dto/GameMainV3DataBean;Z)V
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

.method B()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D1:Lcom/join/mgps/rpc/i;

    iget v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->E1:I

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
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F1:Ljava/util/List;

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
    iget-object v3, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F1:Ljava/util/List;

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
    iget-object v3, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F1:Ljava/util/List;

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
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->Q()V
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

.method public C()Lcom/join/mgps/dto/RequestCommentAllListArgs;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->O:Lcom/wufan/user/service/protobuf/n0;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->C1:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->commentToken()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->O:Lcom/wufan/user/service/protobuf/n0;

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
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v1

    const/4 v2, 0x1

    const/16 v3, 0xa

    iget-object v4, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    invoke-virtual/range {v1 .. v6}, Lcom/join/mgps/Util/RequestBeanUtil;->getRequestCommentAllList(IILjava/lang/String;ILjava/lang/String;)Lcom/join/mgps/dto/RequestCommentAllListArgs;

    move-result-object v0

    return-object v0
.end method

.method D()V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D1:Lcom/join/mgps/rpc/i;

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
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F1:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    if-eqz v0, :cond_1

    .line 10
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F1:Ljava/util/List;

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
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F1:Ljava/util/List;

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
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->Q()V
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

.method E(Ljava/lang/String;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D1:Lcom/join/mgps/rpc/i;

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
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_1

    .line 7
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F1:Ljava/util/List;

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
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F1:Ljava/util/List;

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
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->Q()V
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

.method F()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->L:Lcom/join/mgps/rpc/l;

    invoke-interface {v0}, Lcom/join/mgps/rpc/l;->v()Lcom/join/mgps/dto/GameWorldResponse;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameWorldResponse;->getError()I

    move-result v1

    const/16 v2, 0x2bd

    if-ne v1, v2, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->l()V

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

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->J:Ljava/util/List;

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->T()V
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

.method H()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Background;
        delay = 0x5dcL
    .end annotation

    return-void
.end method

.method I(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V
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

    iget-object p2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-virtual {p1, p2, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method

.method public J(Lcom/join/mgps/dto/DynamicEntranceBean;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/DynamicEntranceBean;->getTypeId()I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->x()V

    goto :goto_0

    .line 3
    :cond_1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->q()V

    goto :goto_0

    .line 4
    :cond_2
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->s()V

    goto :goto_0

    .line 5
    :cond_3
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->w()V

    goto :goto_0

    .line 6
    :cond_4
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->u()V

    :goto_0
    return-void
.end method

.method K(Lapp/mgsim/arena/ArenaResponse;)V
    .locals 10
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->L()V

    .line 2
    iget v0, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    const-string v1, "\u786e\u5b9a"

    const/16 v2, 0x101

    .line 3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x4

    const-string v8, "dialog_error_hint"

    const/16 v9, 0x10

    if-ne v0, v9, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->U:Lcom/join/mgps/socket/fight/arena/a;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v2, v7, v6

    iget p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v7, v5

    const-string p1, "\u65e0\u6cd5\u52a0\u5165\uff0c\u4f60\u88ab\u7981\u6b62\u52a0\u5165\u8be5\u623f\u95f4"

    aput-object p1, v7, v4

    aput-object v1, v7, v3

    invoke-virtual {v0, v8, v7}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const/16 v9, 0x11

    if-ne v0, v9, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->U:Lcom/join/mgps/socket/fight/arena/a;

    new-array v1, v7, [Ljava/lang/Object;

    aput-object v2, v1, v6

    iget p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v5

    const-string p1, "\u8be5\u623f\u95f4\u4e3a\u6bd4\u8d5b\u4e13\u7528\u623f\u95f4,\u975e\u53c2\u8d5b\u9009\u624b\u65e0\u6cd5\u52a0\u5165"

    aput-object p1, v1, v4

    const-string p1, "\u6211\u77e5\u9053\u4e86"

    aput-object p1, v1, v3

    invoke-virtual {v0, v8, v1}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    const/16 v9, 0x9

    if-ne v0, v9, :cond_2

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->U:Lcom/join/mgps/socket/fight/arena/a;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v2, v7, v6

    iget p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v7, v5

    const-string p1, "\u623f\u95f4\u4eba\u6570\u5df2\u6ee1\u4f60\u65e0\u6cd5\u52a0\u5165\u623f\u95f4!"

    aput-object p1, v7, v4

    aput-object v1, v7, v3

    invoke-virtual {v0, v8, v7}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    const/4 v9, 0x7

    if-ne v0, v9, :cond_3

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->U:Lcom/join/mgps/socket/fight/arena/a;

    const/4 v2, 0x6

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v9, 0x100

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v2, v6

    iget v6, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v2, v5

    const-string v5, "\u5bc6\u7801\u8f93\u5165\u9519\u8bef\uff0c\u8bf7\u91cd\u8bd5!"

    aput-object v5, v2, v4

    const-string v4, "\u53d6\u6d88"

    aput-object v4, v2, v3

    aput-object v1, v2, v7

    const/4 v1, 0x5

    aput-object p1, v2, v1

    invoke-virtual {v0, v8, v2}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_3
    const/16 v9, 0x8

    if-ne v0, v9, :cond_4

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->U:Lcom/join/mgps/socket/fight/arena/a;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v2, v7, v6

    iget p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v7, v5

    const-string p1, "\u623f\u95f4\u5df2\u7ecf\u88ab\u89e3\u6563!"

    aput-object p1, v7, v4

    aput-object v1, v7, v3

    invoke-virtual {v0, v8, v7}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_4
    const/16 v9, 0xb

    if-ne v0, v9, :cond_5

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->U:Lcom/join/mgps/socket/fight/arena/a;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v2, v7, v6

    iget p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v7, v5

    const-string p1, "\u94dc\u677f\u4e0d\u8db3\uff0c\u65e0\u6cd5\u521b\u5efa\u623f\u95f4!"

    aput-object p1, v7, v4

    aput-object v1, v7, v3

    invoke-virtual {v0, v8, v7}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_5
    const/16 v9, 0xd

    if-ne v0, v9, :cond_6

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->U:Lcom/join/mgps/socket/fight/arena/a;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v2, v7, v6

    iget p1, p1, Lapp/mgsim/arena/ArenaResponse;->errorType:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v7, v5

    const-string p1, "\u94dc\u677f\u4e0d\u8db3\uff0c\u65e0\u6cd5\u52a0\u5165\u623f\u95f4"

    aput-object p1, v7, v4

    aput-object v1, v7, v3

    invoke-virtual {v0, v8, v7}, Lcom/join/mgps/socket/fight/arena/a;->D(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_6
    return-void
.end method

.method L()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->b:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method M()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/activity/login/LoginSplashActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/login/LoginSplashActivity_$IntentBuilder_;

    move-result-object v0

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/login/LoginSplashActivity_$IntentBuilder_;

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method O(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z
    .locals 3

    const/4 v0, 0x0

    .line 1
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

    if-eq v1, v2, :cond_0

    sget-object v2, Lcom/join/mgps/enums/ConstantIntEnum;->FC:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v2}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v2

    if-ne v1, v2, :cond_4

    .line 3
    :cond_0
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

    if-eqz v1, :cond_2

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

    if-nez p1, :cond_1

    return v0

    .line 9
    :cond_1
    :try_start_4
    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    const/16 p2, 0x14a

    if-gt p1, p2, :cond_4

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
    :cond_2
    invoke-virtual {p2}, Lcom/join/mgps/db/tables/EMUApkTable;->getDown_type()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    .line 13
    invoke-virtual {p2}, Lcom/join/mgps/db/tables/EMUApkTable;->getDown_type()I

    move-result v1

    if-ne v1, v2, :cond_3

    new-array v1, v0, [Ljava/lang/String;

    .line 14
    invoke-static {p1, p2, v0, v1}, Lcom/join/android/app/common/utils/l;->t(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;Z[Ljava/lang/String;)Z

    move-result p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    return p1

    :cond_3
    return v0

    :catch_3
    move-exception p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :catch_4
    :cond_4
    const/4 p1, 0x1

    return p1
.end method

.method P()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->B1:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->y:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->z:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    return-void

    .line 4
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x4

    if-lez v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->o:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainNewActivity;->B1:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/CommentAllListBean$GeneralCommentBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/CommentBaseBean;->getContent()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->p:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->p:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 10
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->B1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v3, 0x1

    if-le v0, v3, :cond_2

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->q:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->B1:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CommentAllListBean$GeneralCommentBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommentBaseBean;->getContent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->r:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 14
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->r:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method Q()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F1:Ljava/util/List;

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->y:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->z:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x4

    if-lez v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->o:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F1:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;->getSubject()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->p:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->p:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v3, 0x1

    if-le v0, v3, :cond_1

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F1:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainCommunityBean$PostsBean;->getSubject()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->r:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 14
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->r:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 16
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->y:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->z:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method R(Lcom/join/mgps/dto/GameMainV3DataBean;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV3DataBean;->getSurface_bottom_ad()Lcom/join/mgps/dto/GameMainV3DataBean$Surface_bottom_ad;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV3DataBean;->getSurface_bottom_ad()Lcom/join/mgps/dto/GameMainV3DataBean$Surface_bottom_ad;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV3DataBean$Surface_bottom_ad;->getAd_switch()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->B:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->A:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->A:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV3DataBean;->getSurface_bottom_ad()Lcom/join/mgps/dto/GameMainV3DataBean$Surface_bottom_ad;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV3DataBean$Surface_bottom_ad;->getPic_remote()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageURI(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->A:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0}, Lcom/facebook/drawee/view/DraweeView;->getHierarchy()Lo0/b;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/generic/a;

    .line 6
    sget-object v1, Lcom/facebook/drawee/drawable/r$c;->b:Lcom/facebook/drawee/drawable/r$c;

    invoke-virtual {v0, v1}, Lcom/facebook/drawee/generic/a;->x(Lcom/facebook/drawee/drawable/r$c;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->A:Lcom/facebook/drawee/view/SimpleDraweeView;

    new-instance v1, Lcom/join/mgps/activity/GameMainNewActivity$c;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/activity/GameMainNewActivity$c;-><init>(Lcom/join/mgps/activity/GameMainNewActivity;Lcom/join/mgps/dto/GameMainV3DataBean;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method T()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->K:Lcom/join/mgps/activity/GameMainNewActivity$g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->K:Lcom/join/mgps/activity/GameMainNewActivity$g;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 3
    :cond_0
    new-instance v0, Lcom/join/mgps/activity/GameMainNewActivity$g;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    const v2, 0x7f110165

    invoke-direct {v0, p0, v1, v2}, Lcom/join/mgps/activity/GameMainNewActivity$g;-><init>(Lcom/join/mgps/activity/GameMainNewActivity;Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->K:Lcom/join/mgps/activity/GameMainNewActivity$g;

    .line 4
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method V()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->M:Lcom/join/mgps/dto/GameMainV3DataBean;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV3DataBean;->getMember_info()Lcom/join/mgps/dto/GameMainV3DataBean$MemberInfoBean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->M:Lcom/join/mgps/dto/GameMainV3DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV3DataBean;->getMember_info()Lcom/join/mgps/dto/GameMainV3DataBean$MemberInfoBean;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV3DataBean$MemberInfoBean;->getLink_type()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV3DataBean$MemberInfoBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV3DataBean$MemberInfoBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v1

    const-string v2, "http"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV3DataBean$MemberInfoBean;->getLink_type_val()Ljava/lang/String;

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

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 9
    :goto_0
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/GameMainV3DataBean$MemberInfoBean;->setLink_type_val(Ljava/lang/String;)V

    .line 10
    :cond_1
    new-instance v1, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v1}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV3DataBean$MemberInfoBean;->getLink_type()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV3DataBean$MemberInfoBean;->getJump_type()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/IntentDateBean;->setJump_type(I)V

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV3DataBean$MemberInfoBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 14
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-virtual {v0, v2, v1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    :cond_2
    return-void
.end method

.method X()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->M:Lcom/join/mgps/dto/GameMainV3DataBean;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV3DataBean;->getGame_info()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_comment_score_switch()Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    invoke-static {p0}, Lcom/join/mgps/activity/ForumIndexActivity_;->i0(Landroid/content/Context;)Lcom/join/mgps/activity/ForumIndexActivity_$d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void

    .line 5
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/activity/CommentAllListActivity_;->H0(Landroid/content/Context;)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->f(Ljava/lang/String;)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_package()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->i(Ljava/lang/String;)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_plugin_num()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->h(Ljava/lang/String;)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_bespeak_switch()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->a(I)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_is_started()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->g(I)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->j(I)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v1

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_comment_score_switch()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/activity/CommentAllListActivity_$p;->d(Ljava/lang/String;)Lcom/join/mgps/activity/CommentAllListActivity_$p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method a0(Lcom/join/mgps/dto/GameMainV3DataBean;Z)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->M:Lcom/join/mgps/dto/GameMainV3DataBean;

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV3DataBean;->getGame_info()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    :cond_0
    invoke-direct {p0, p2}, Lcom/join/mgps/activity/GameMainNewActivity;->Z(Z)V

    return-void
.end method

.method j()V
    .locals 9
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    iput-object p0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    .line 2
    invoke-static {}, Lcom/join/mgps/rpc/impl/d;->P1()Lcom/join/mgps/rpc/impl/d;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->P:Lcom/join/mgps/rpc/e;

    .line 3
    invoke-static {}, Lcom/join/mgps/rpc/impl/l;->n0()Lcom/join/mgps/rpc/impl/l;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->L:Lcom/join/mgps/rpc/l;

    .line 4
    invoke-static {}, Lcom/join/mgps/rpc/impl/g;->A0()Lcom/join/mgps/rpc/impl/g;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D1:Lcom/join/mgps/rpc/i;

    .line 5
    invoke-static {}, Lcom/join/mgps/rpc/impl/e;->m()Lcom/join/mgps/rpc/impl/e;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->Z:Lcom/join/mgps/rpc/f;

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->A:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 7
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->O:Lcom/wufan/user/service/protobuf/n0;

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_0

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    :cond_0
    new-instance v0, Lcom/join/mgps/adapter/j1;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->W:Ljava/util/List;

    invoke-direct {v0, p0, v1, p0}, Lcom/join/mgps/adapter/j1;-><init>(Landroid/content/Context;Ljava/util/List;Lcom/join/mgps/adapter/j1$a;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->V:Lcom/join/mgps/adapter/j1;

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->t:Landroid/widget/GridView;

    invoke-virtual {v1, v0}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->t:Landroid/widget/GridView;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOverScrollMode(I)V

    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07150f

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 15
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0713fa

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 16
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f071241

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    .line 17
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f071293

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    float-to-int v3, v3

    .line 18
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    .line 19
    iget v5, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 20
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v4, v4

    .line 21
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    int-to-float v6, v5

    div-float/2addr v4, v6

    const v6, 0x3fe38e39

    const/4 v7, 0x1

    const/4 v8, -0x1

    cmpl-float v4, v4, v6

    if-lez v4, :cond_1

    .line 22
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v3, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 23
    iput v7, v4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 24
    iget-object v3, p0, Lcom/join/mgps/activity/GameMainNewActivity;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    mul-int/lit8 v3, v2, 0x2

    sub-int/2addr v5, v3

    mul-int v0, v0, v5

    .line 25
    div-int/2addr v0, v1

    .line 26
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v0, v8}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 27
    iput v2, v1, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 28
    iput v2, v1, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 29
    iput v2, v1, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 30
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->u:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 31
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 32
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    .line 33
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->s:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 34
    new-instance v0, Lcom/join/mgps/adapter/GameRecommendAdapter;

    invoke-direct {v0, p0}, Lcom/join/mgps/adapter/GameRecommendAdapter;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->Y:Lcom/join/mgps/adapter/GameRecommendAdapter;

    .line 35
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->s:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 36
    new-instance v0, Lcom/join/mgps/adapter/MemberFunAdapter;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/adapter/MemberFunAdapter;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->X:Lcom/join/mgps/adapter/MemberFunAdapter;

    .line 37
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 38
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->i:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 39
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->i:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->X:Lcom/join/mgps/adapter/MemberFunAdapter;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 40
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->A()V

    .line 41
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->z()V

    .line 42
    new-instance v0, Lcom/join/mgps/socket/fight/arena/a;

    new-instance v1, Lcom/join/mgps/activity/GameMainNewActivity$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameMainNewActivity$a;-><init>(Lcom/join/mgps/activity/GameMainNewActivity;)V

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/socket/fight/arena/a;-><init>(Landroid/app/Activity;Lcom/join/mgps/socket/fight/arena/a$y;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->U:Lcom/join/mgps/socket/fight/arena/a;

    .line 43
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v2

    sget-object v3, Lcom/papa/sim/statistic/Event;->indexGameStart:Lcom/papa/sim/statistic/Event;

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    iget-object v6, p0, Lcom/join/mgps/activity/GameMainNewActivity;->E:Ljava/lang/String;

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Lcom/papa/sim/statistic/p;->Z0(Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method l()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u767b\u5f55\u5df2\u5931\u6548\u8bf7\u60a8\u91cd\u65b0\u767b\u5f55"

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->M()V

    return-void
.end method

.method m()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->X()V

    return-void
.end method

.method n()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method o()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->B1:Ljava/util/List;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    invoke-direct {p0, v1}, Lcom/join/mgps/activity/GameMainNewActivity;->W(I)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0, v1}, Lcom/join/mgps/activity/GameMainNewActivity;->Y(I)V

    :goto_0
    return-void
.end method

.method protected onDestroy()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->U:Lcom/join/mgps/socket/fight/arena/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/a;->w()V

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->O:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->z0(Ljava/lang/String;I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->T:Lcom/join/mgps/socket/fight/arena/b;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->T:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->I1:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    invoke-virtual {v0, v1}, Lcom/join/mgps/socket/fight/arena/ArenaService;->A(Ljava/lang/Object;)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->T:Lcom/join/mgps/socket/fight/arena/b;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->g()V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->T:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->stopService()V

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->T:Lcom/join/mgps/socket/fight/arena/b;

    .line 10
    :cond_2
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    return-void
.end method

.method protected onResume()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->L()V

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->O:Lcom/wufan/user/service/protobuf/n0;

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->T:Lcom/join/mgps/socket/fight/arena/b;

    if-nez v0, :cond_0

    .line 5
    new-instance v0, Lcom/join/mgps/socket/fight/arena/b;

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H1:Lcom/join/mgps/socket/fight/arena/b$b;

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/socket/fight/arena/b;-><init>(Landroid/content/Context;Lcom/join/mgps/socket/fight/arena/b$b;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->T:Lcom/join/mgps/socket/fight/arena/b;

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->bindService()V

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->H()V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_1

    .line 9
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    invoke-virtual {v1, v2, p0}, Lp1/f;->L(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->d(Ljava/lang/String;I)V

    .line 10
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    invoke-virtual {v1, v2, p0}, Lp1/f;->L(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->d(Ljava/lang/String;I)V

    .line 11
    :cond_1
    iget-boolean v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->A1:Z

    if-eqz v0, :cond_2

    .line 12
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/join/mgps/activity/GameMainNewActivity$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameMainNewActivity$b;-><init>(Lcom/join/mgps/activity/GameMainNewActivity;)V

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 13
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->Y:Lcom/join/mgps/adapter/GameRecommendAdapter;

    if-eqz v0, :cond_3

    .line 14
    invoke-virtual {v0}, Lcom/join/mgps/adapter/GameRecommendAdapter;->c()V

    :cond_3
    return-void
.end method

.method protected onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->T:Lcom/join/mgps/socket/fight/arena/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->T:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->I1:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    invoke-virtual {v0, v1}, Lcom/join/mgps/socket/fight/arena/ArenaService;->A(Ljava/lang/Object;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->T:Lcom/join/mgps/socket/fight/arena/b;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->g()V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->T:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->stopService()V

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->T:Lcom/join/mgps/socket/fight/arena/b;

    :cond_1
    return-void
.end method

.method p()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->B1:Ljava/util/List;

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    invoke-direct {p0, v1}, Lcom/join/mgps/activity/GameMainNewActivity;->W(I)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0, v1}, Lcom/join/mgps/activity/GameMainNewActivity;->Y(I)V

    :goto_0
    return-void
.end method

.method r()V
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

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    const-string v3, "game_main"

    invoke-virtual {v0, v1, v2, v3}, Lcom/papa/sim/statistic/p;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    :try_start_0
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/GameInfoBean;->setGame_id(Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->M:Lcom/join/mgps/dto/GameMainV3DataBean;

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV3DataBean;->getGame_info()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMaingameinfo;->getGame_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/GameInfoBean;->setGame_name(Ljava/lang/String;)V

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFight_fun()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

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
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->F()V

    return-void

    .line 15
    :cond_3
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/activity/arena/GameRoomListActivity_;->W3(Landroid/content/Context;)Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;->b(Z)Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;->c(Lcom/join/mgps/dto/GameInfoBean;)Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method t()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->y:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->E1:I

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->E1:I

    invoke-virtual {v0, p0, v1}, Lcom/join/mgps/Util/IntentUtil;->goForumGroupActivity(Landroid/content/Context;I)V

    goto :goto_1

    .line 3
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->X()V

    :goto_1
    return-void
.end method

.method v()V
    .locals 13
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->M:Lcom/join/mgps/dto/GameMainV3DataBean;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV3DataBean;->getNet_battle()Lcom/join/mgps/dto/GameMainNetBattle;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainNetBattle;->getSilence_room_switch()I

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {v1, v0, v3, v2}, Lcom/join/mgps/Util/UtilsMy;->i(Lcom/join/mgps/db/tables/EMUApkTable;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;I)V

    goto/16 :goto_2

    .line 5
    :cond_0
    iget-object v3, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFight_fun()Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-static {v3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v6, 0x7

    if-lt v4, v6, :cond_1

    const/4 v4, 0x6

    .line 7
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x31

    if-ne v4, v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 8
    :goto_0
    iget-object v4, p0, Lcom/join/mgps/activity/GameMainNewActivity;->M:Lcom/join/mgps/dto/GameMainV3DataBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameMainV3DataBean;->getGame_info()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 9
    iget-object v4, p0, Lcom/join/mgps/activity/GameMainNewActivity;->M:Lcom/join/mgps/dto/GameMainV3DataBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameMainV3DataBean;->getGame_info()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameMaingameinfo;->getMax_battle_count()I

    move-result v4

    move v12, v4

    goto :goto_1

    :cond_2
    const/4 v12, 0x0

    :goto_1
    if-ne v0, v5, :cond_4

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->Q:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget v10, p0, Lcom/join/mgps/activity/GameMainNewActivity;->R:I

    if-eqz v10, :cond_3

    .line 11
    iget-object v6, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v7, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    const/4 v8, 0x1

    iget-object v9, p0, Lcom/join/mgps/activity/GameMainNewActivity;->Q:Ljava/lang/String;

    iget-object v11, p0, Lcom/join/mgps/activity/GameMainNewActivity;->S:Ljava/lang/String;

    invoke-static/range {v6 .. v12}, Lcom/join/mgps/Util/UtilsMy;->k(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;ILjava/lang/String;ILjava/lang/String;I)V

    goto :goto_2

    .line 12
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {v1, v0, v3, v2}, Lcom/join/mgps/Util/UtilsMy;->i(Lcom/join/mgps/db/tables/EMUApkTable;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;I)V

    goto :goto_2

    :cond_4
    const/4 v4, 0x2

    if-ne v0, v4, :cond_6

    if-eqz v3, :cond_6

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->Q:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget v10, p0, Lcom/join/mgps/activity/GameMainNewActivity;->R:I

    if-eqz v10, :cond_5

    .line 14
    iget-object v6, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v7, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    const/4 v8, 0x1

    iget-object v9, p0, Lcom/join/mgps/activity/GameMainNewActivity;->Q:Ljava/lang/String;

    iget-object v11, p0, Lcom/join/mgps/activity/GameMainNewActivity;->S:Ljava/lang/String;

    invoke-static/range {v6 .. v12}, Lcom/join/mgps/Util/UtilsMy;->k(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;ILjava/lang/String;ILjava/lang/String;I)V

    goto :goto_2

    .line 15
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {v1, v0, v3, v2}, Lcom/join/mgps/Util/UtilsMy;->i(Lcom/join/mgps/db/tables/EMUApkTable;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;I)V

    goto :goto_2

    .line 16
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {v1, v0, v3, v2}, Lcom/join/mgps/Util/UtilsMy;->i(Lcom/join/mgps/db/tables/EMUApkTable;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;I)V

    goto :goto_2

    .line 17
    :cond_7
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v3, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {v1, v0, v3, v2}, Lcom/join/mgps/Util/UtilsMy;->i(Lcom/join/mgps/db/tables/EMUApkTable;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;I)V

    .line 18
    :goto_2
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->H:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->O:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->I0(Ljava/lang/String;I)V

    return-void
.end method

.method y()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->F:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->C()Lcom/join/mgps/dto/RequestCommentAllListArgs;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->Z:Lcom/join/mgps/rpc/f;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/f;->b(Lcom/join/mgps/dto/RequestCommentAllListArgs;)Lcom/join/mgps/dto/CommentResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getData_info()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommentAllListBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentAllListBean;->getGeneral_comment()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainNewActivity;->B1:Ljava/util/List;

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainNewActivity;->P()V

    :cond_0
    return-void
.end method

.method z()V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->O:Lcom/wufan/user/service/protobuf/n0;

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    :goto_0
    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/Util/RequestBeanUtil;->getGameMainData(Ljava/lang/String;I)Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->P:Lcom/join/mgps/rpc/e;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/e;->G(Lcom/join/mgps/dto/CommonRequestBean;)Lcom/join/mgps/dto/ResultMainBean;

    move-result-object v0

    .line 3
    iput-boolean v3, p0, Lcom/join/mgps/activity/GameMainNewActivity;->A1:Z

    if-eqz v0, :cond_4

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMainBean;->getFlag()I

    move-result v1

    if-ne v1, v3, :cond_4

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMainBean;->getMessages()Lcom/join/mgps/dto/ResultMessageBean;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMessageBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameMainV3DataBean;

    .line 7
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameMainNewActivity;->R(Lcom/join/mgps/dto/GameMainV3DataBean;)V

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV3DataBean;->getGame_info()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV3DataBean;->getGame_info()Lcom/join/mgps/dto/GameMaingameinfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMaingameinfo;->getCommunity_multi_posts_id()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainNewActivity;->N:Ljava/lang/String;

    .line 10
    :cond_1
    invoke-static {}, Lb2/u;->n()Lb2/u;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lb2/u;->o(Ljava/lang/String;)Lcom/join/mgps/db/tables/GameMainTable;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV3DataBean;->getAchieve()Lcom/join/mgps/dto/GameMainachieve;

    move-result-object v2

    .line 12
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v4

    invoke-virtual {v1}, Lcom/join/mgps/db/tables/GameMainTable;->getGame_main_data()Ljava/lang/String;

    move-result-object v5

    const-class v6, Lcom/join/mgps/dto/GameMainDataBean;

    invoke-virtual {v4, v5, v6}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/GameMainDataBean;

    if-eqz v4, :cond_2

    .line 13
    invoke-virtual {v4}, Lcom/join/mgps/dto/GameMainDataBean;->getAchieve()Lcom/join/mgps/dto/GameMainachieve;

    move-result-object v4

    if-eqz v2, :cond_2

    if-eqz v4, :cond_2

    .line 14
    invoke-virtual {v4}, Lcom/join/mgps/dto/GameMainachieve;->getLastShowVerTime()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/join/mgps/dto/GameMainachieve;->setLastShowVerTime(J)V

    .line 15
    :cond_2
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 16
    iget-object v4, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lcom/join/mgps/db/tables/GameMainTable;->setGameid(Ljava/lang/String;)V

    .line 17
    invoke-virtual {v1, v2}, Lcom/join/mgps/db/tables/GameMainTable;->setGame_main_data(Ljava/lang/String;)V

    .line 18
    invoke-static {}, Lb2/u;->n()Lb2/u;

    move-result-object v2

    invoke-virtual {v2, v1}, Lp1/b;->update(Ljava/lang/Object;)I

    goto :goto_1

    .line 19
    :cond_3
    new-instance v1, Lcom/join/mgps/db/tables/GameMainTable;

    invoke-direct {v1}, Lcom/join/mgps/db/tables/GameMainTable;-><init>()V

    .line 20
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 21
    iget-object v4, p0, Lcom/join/mgps/activity/GameMainNewActivity;->D:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lcom/join/mgps/db/tables/GameMainTable;->setGameid(Ljava/lang/String;)V

    .line 22
    invoke-virtual {v1, v2}, Lcom/join/mgps/db/tables/GameMainTable;->setGame_main_data(Ljava/lang/String;)V

    .line 23
    invoke-static {}, Lb2/u;->n()Lb2/u;

    move-result-object v2

    invoke-virtual {v2, v1}, Lp1/b;->k(Ljava/lang/Object;)I

    .line 24
    :goto_1
    invoke-virtual {p0, v0, v3}, Lcom/join/mgps/activity/GameMainNewActivity;->a0(Lcom/join/mgps/dto/GameMainV3DataBean;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_2
    return-void
.end method
