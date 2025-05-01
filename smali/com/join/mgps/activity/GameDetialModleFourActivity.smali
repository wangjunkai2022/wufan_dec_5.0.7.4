.class public Lcom/join/mgps/activity/GameDetialModleFourActivity;
.super Landroidx/fragment/app/Fragment;
.source "GameDetialModleFourActivity.java"

# interfaces
.implements Lw1/n;


# annotations
.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c030b
.end annotation


# static fields
.field private static final Z1:Ljava/lang/String; = "GameDetialModleFourAct"


# instance fields
.field A:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private A1:Z

.field B:Landroid/widget/Button;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private B1:Lcom/join/android/app/common/manager/b;

.field C:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field C1:I

.field D:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field D1:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field E:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field E1:Lcom/join/mgps/customview/o;

.field F:Landroidx/core/widget/NestedScrollView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field F1:Z

.field private G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field private G1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommentBaseBean;",
            ">;"
        }
    .end annotation
.end field

.field H:Lcom/join/mgps/rpc/e;

.field private H1:Ljava/lang/String;

.field I:Lcom/join/mgps/rpc/i;

.field private I1:Lcom/join/mgps/dto/GameScore;

.field J:Lcom/join/mgps/rpc/f;

.field private J1:Lcom/join/mgps/dto/CommentAllListBean$SelfCommentBean;

.field K:Ljava/lang/String;

.field K1:Ljava/lang/Runnable;

.field L:Lcom/join/mgps/dto/ExtBean;

.field private L1:Z

.field M:Z

.field M1:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
            ">;"
        }
    .end annotation
.end field

.field private N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

.field N1:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
            ">;"
        }
    .end annotation
.end field

.field private O:Lcom/join/mgps/dto/GamedetialModleFourBean;

.field private O1:I

.field private P:Landroidx/recyclerview/widget/LinearLayoutManager;

.field private P1:I

.field private Q:Lcom/join/mgps/customview/o;

.field Q1:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private R:Lcom/wufan/user/service/protobuf/n0;

.field R1:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private S:Lcom/join/mgps/customview/o;

.field S1:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private T:Z

.field T1:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field U:Lcom/join/mgps/recycler/c;

.field U1:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field V:Lw1/i;

.field V1:Lcom/join/mgps/customview/CustomerDownloadView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f091484
    .end annotation
.end field

.field W:Lcom/join/android/app/component/video/c;

.field private W1:Landroid/view/animation/Animation;

.field X:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
            ">;"
        }
    .end annotation
.end field

.field X1:Lcom/join/mgps/customview/o;

.field Y:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
            ">;"
        }
    .end annotation
.end field

.field Y1:Lcom/join/mgps/customview/o;

.field private Z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/business/CollectionBeanSubBusiness;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

.field c:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field n:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field o:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field p:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private p0:I

.field private p1:I

.field q:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field r:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field s:Landroid/widget/ProgressBar;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field t:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field u:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field v:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private v1:Z

.field w:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field x:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field y:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field z:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->X:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y:Ljava/util/Map;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Z:Ljava/util/List;

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->p0:I

    .line 6
    iput v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->p1:I

    .line 7
    iput-boolean v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->v1:Z

    .line 8
    iput-boolean v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->A1:Z

    const/4 v1, 0x2

    .line 9
    iput v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->C1:I

    .line 10
    iput-boolean v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->F1:Z

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->J1:Lcom/join/mgps/dto/CommentAllListBean$SelfCommentBean;

    .line 12
    new-instance v1, Lcom/join/mgps/activity/GameDetialModleFourActivity$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity$d;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V

    iput-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K1:Ljava/lang/Runnable;

    const/4 v1, 0x1

    .line 13
    iput-boolean v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L1:Z

    .line 14
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->M1:Ljava/util/Map;

    .line 15
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N1:Ljava/util/Map;

    .line 16
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->X1:Lcom/join/mgps/customview/o;

    .line 17
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y1:Lcom/join/mgps/customview/o;

    return-void
.end method

.method public static A0(Ljava/lang/String;ZLcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/activity/GameDetialModleFourActivity_;
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "gameId"

    .line 2
    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "autodown"

    .line 3
    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p0, "extBean"

    .line 4
    invoke-virtual {v0, p0, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 5
    new-instance p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;

    invoke-direct {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_;-><init>()V

    .line 6
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-object p0
.end method

.method private I0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->X:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 2
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 4
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    .line 8
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    .line 9
    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 10
    iget-object v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez v2, :cond_2

    if-nez v4, :cond_2

    .line 11
    invoke-virtual {v1, v3}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    .line 12
    invoke-virtual {v1, v2}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    :cond_3
    if-eqz v4, :cond_4

    .line 13
    invoke-virtual {v1, v4}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 14
    :cond_4
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 15
    invoke-virtual {v1, v3}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 16
    :cond_5
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 17
    invoke-virtual {v1, v3}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 18
    :cond_6
    invoke-direct {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N0()V

    return-void
.end method

.method private J0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y:Ljava/util/Map;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 3
    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method private K0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->X:Ljava/util/List;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->A4(Ljava/util/List;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->X:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->f1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 6
    invoke-direct {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N0()V

    return-void
.end method

.method private L0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y:Ljava/util/Map;

    if-eqz v0, :cond_3

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->X:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->f1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez v0, :cond_2

    return-void

    .line 7
    :cond_2
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 8
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCfg_ver()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_ver(Ljava/lang/String;)V

    .line 10
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSource_ver()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setSource_ver(Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N0()V

    :cond_3
    :goto_0
    return-void
.end method

.method private N0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method private R0(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getComment_switch()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCommitDataBeanList()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCommitDataBeanList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x3

    if-le v1, v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCommitDataBeanList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    :goto_1
    if-ge v0, v2, :cond_3

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCommitDataBeanList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CommentBaseBean;

    .line 4
    new-instance v2, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v4, 0x19

    invoke-direct {v2, v3, v1, v4}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-nez v0, :cond_2

    .line 5
    new-instance v1, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v3, 0x1b

    const-string v4, ""

    invoke-direct {v1, v2, v4, v3}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6
    :cond_3
    new-instance v0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x10

    const-string v3, "\u8bc4\u8bba\u5e95\u90e8"

    invoke-direct {v0, v1, v3, v2}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_2
    return-void
.end method

.method private S0(Lcom/join/mgps/dto/InformationCommentBean;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/InformationCommentBean;",
            "Ljava/util/List<",
            "Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBean;->getSub()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 3
    new-instance v0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$r1;

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBean;->getComment_id()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct {v2, v3, p1, v4, v5}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$r1;-><init>(Ljava/lang/String;Lcom/join/mgps/dto/InformationCommentBean;IZ)V

    const/16 p1, 0xf

    invoke-direct {v0, v1, v2, p1}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    .line 5
    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method static synthetic V(Lcom/join/mgps/activity/GameDetialModleFourActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->p1:I

    return p0
.end method

.method static synthetic W(Lcom/join/mgps/activity/GameDetialModleFourActivity;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->p1:I

    return p1
.end method

.method static synthetic X(Lcom/join/mgps/activity/GameDetialModleFourActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->p0:I

    return p0
.end method

.method static synthetic Z(Lcom/join/mgps/activity/GameDetialModleFourActivity;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->p0:I

    return p1
.end method

.method static synthetic a0(Lcom/join/mgps/activity/GameDetialModleFourActivity;)Lcom/join/mgps/adapter/GameDetialModleFourAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    return-object p0
.end method

.method static synthetic b0(Lcom/join/mgps/activity/GameDetialModleFourActivity;)Lcom/join/mgps/dto/GamedetialModleFourBean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    return-object p0
.end method

.method static synthetic c0(Lcom/join/mgps/activity/GameDetialModleFourActivity;)Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    return-object p0
.end method

.method static synthetic d0(Lcom/join/mgps/activity/GameDetialModleFourActivity;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->k0(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic e0(Lcom/join/mgps/activity/GameDetialModleFourActivity;)Lcom/join/mgps/customview/o;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    return-object p0
.end method

.method static synthetic f0(Lcom/join/mgps/activity/GameDetialModleFourActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-object p0
.end method

.method private f1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    .line 2
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v2

    .line 4
    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModInfoBean;->getMain_game_id()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v4, 0x1

    const/4 v5, 0x5

    const/4 v6, 0x0

    if-eqz v3, :cond_1

    .line 5
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v3

    if-ne v3, v5, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 6
    :goto_0
    iget-object v7, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v7, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v2

    if-ne v2, v5, :cond_2

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_3

    if-eqz v3, :cond_3

    .line 8
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 9
    invoke-virtual {v1, p1}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_2

    :cond_3
    if-eqz v4, :cond_4

    .line 10
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 11
    invoke-virtual {v1, p1}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    :cond_4
    if-eqz v3, :cond_5

    .line 12
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 13
    invoke-virtual {v1, p1}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 15
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    :cond_6
    if-nez v2, :cond_7

    .line 16
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    :cond_7
    if-eqz v2, :cond_0

    .line 17
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 18
    invoke-virtual {v1, p1}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 19
    :cond_8
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 20
    invoke-virtual {v1, p1}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_9
    :goto_2
    return-void
.end method

.method private g1(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/business/CollectionBeanSubBusiness;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_c

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->X:Ljava/util/List;

    if-eqz v0, :cond_c

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_3

    .line 3
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->X:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v3

    if-eqz v3, :cond_b

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v3

    .line 7
    iget-object v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModInfoBean;->getMain_game_id()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v5, 0x1

    const/4 v6, 0x5

    const/4 v7, 0x0

    if-eqz v4, :cond_4

    .line 8
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v4

    if-ne v4, v6, :cond_4

    const/4 v4, 0x1

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    .line 9
    :goto_1
    iget-object v8, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v8, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v3, :cond_5

    .line 10
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v3

    if-ne v3, v6, :cond_5

    goto :goto_2

    :cond_5
    const/4 v5, 0x0

    :goto_2
    if-eqz v5, :cond_6

    if-eqz v4, :cond_6

    .line 11
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 12
    invoke-virtual {v0, v2}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    :cond_6
    if-eqz v5, :cond_7

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 14
    invoke-virtual {v0, v2}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_0

    :cond_7
    if-eqz v4, :cond_8

    .line 15
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 16
    invoke-virtual {v0, v2}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_0

    :cond_8
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v4

    if-eqz v4, :cond_9

    .line 18
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v3

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    :cond_9
    if-nez v3, :cond_a

    .line 19
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v3

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    :cond_a
    if-eqz v3, :cond_3

    .line 20
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 21
    invoke-virtual {v0, v2}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_0

    .line 22
    :cond_b
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 23
    invoke-virtual {v0, v2}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_0

    :cond_c
    :goto_3
    return-void
.end method

.method private k0(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    const v2, 0x7f10051d

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return v1

    :cond_0
    const/4 v0, 0x1

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v2

    const-string v3, "6"

    .line 4
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 5
    invoke-static {v2}, Lcom/join/mgps/Util/b;->piv(Lcom/wufan/user/service/protobuf/n0;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Z0()V

    goto :goto_1

    :cond_2
    const-string v3, "7"

    .line 7
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 8
    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->j1()I

    move-result p1

    if-lez p1, :cond_3

    goto :goto_0

    .line 9
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y0()V

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v1, 0x1

    :goto_1
    return v1
.end method

.method private l0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->X1:Lcom/join/mgps/customview/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->X1:Lcom/join/mgps/customview/o;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method

.method private m0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y1:Lcom/join/mgps/customview/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y1:Lcom/join/mgps/customview/o;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method

.method private m1()V
    .locals 15

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->v1:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->p1:I

    :goto_0
    iget v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->p0:I

    if-gt v0, v1, :cond_8

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-virtual {v1}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->y()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    if-eqz v1, :cond_7

    .line 4
    iget-object v1, v1, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;->a:Ljava/lang/Object;

    instance-of v2, v1, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    if-nez v2, :cond_1

    goto/16 :goto_3

    .line 5
    :cond_1
    check-cast v1, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    if-nez v1, :cond_2

    goto/16 :goto_3

    .line 6
    :cond_2
    invoke-virtual {v1}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 7
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v2

    const/16 v3, 0xc

    const/4 v4, 0x2

    if-eq v2, v4, :cond_3

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v2

    if-ne v2, v3, :cond_7

    .line 8
    :cond_3
    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    iget v5, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->p1:I

    sub-int v5, v0, v5

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 9
    :try_start_0
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v5

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/join/android/app/common/servcie/i;->f(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v5

    if-nez v5, :cond_4

    return-void

    .line 10
    :cond_4
    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowSize()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    const-wide/high16 v8, 0x4090000000000000L    # 1024.0

    mul-double v6, v6, v8

    mul-double v6, v6, v8

    double-to-long v6, v6

    .line 11
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v10, 0x0

    const-string v12, "/"

    const v13, 0x7f0900f1

    cmp-long v14, v8, v10

    if-nez v14, :cond_5

    .line 12
    :try_start_1
    invoke-virtual {v2, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v10

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 13
    :cond_5
    invoke-virtual {v2, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v10

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    :goto_1
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v6

    if-ne v6, v3, :cond_6

    const v3, 0x7f091051

    .line 15
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ProgressBar;

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v6

    long-to-int v7, v6

    invoke-virtual {v3, v7}, Landroid/widget/ProgressBar;->setProgress(I)V

    goto :goto_2

    :cond_6
    const v3, 0x7f09104a

    .line 16
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ProgressBar;

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v6

    long-to-int v7, v6

    invoke-virtual {v3, v7}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 17
    :goto_2
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    if-ne v1, v4, :cond_7

    const v1, 0x7f090d81

    .line 18
    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/S"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_7
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_8
    return-void
.end method


# virtual methods
.method B0(Lcom/join/mgps/dto/CollectionBeanSub;)V
    .locals 2
    .param p1    # Lcom/join/mgps/dto/CollectionBeanSub;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
            value = "gameData"
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.paygamefinish",
            "com.join.android.app.mgsim.wufun.broadcast.refreshMyGame"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb2/e0;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/PurchasedListTable;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/db/tables/PurchasedListTable;

    invoke-direct {v0}, Lcom/join/mgps/db/tables/PurchasedListTable;-><init>()V

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/db/tables/PurchasedListTable;->setGame_id(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->updateButn()V

    return-void
.end method

.method C0()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->e1()V

    return-void
.end method

.method D0(Lcom/join/mgps/dto/CommentBaseBean;II)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, "\u64cd\u4f5c\u5931\u8d25\uff0c\u8bf7\u7a0d\u5019\u518d\u8bd5~"

    .line 1
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    .line 2
    :try_start_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentBaseBean;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentBaseBean;->getPn()I

    move-result p1

    invoke-virtual {p0, v1, p3, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->s0(Ljava/lang/String;II)Lcom/join/mgps/dto/RequestCommentpraiseArgs;

    move-result-object p1

    .line 3
    iget-object p3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->J:Lcom/join/mgps/rpc/f;

    invoke-interface {p3, p1}, Lcom/join/mgps/rpc/f;->h(Lcom/join/mgps/dto/RequestCommentpraiseArgs;)Lcom/join/mgps/dto/CommentResponse;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentResponse;->getCode()I

    move-result p3

    const/16 v1, 0x321

    if-ne p3, v1, :cond_0

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->P0(Lcom/join/mgps/dto/CommentResponse;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentResponse;->getSucc()I

    move-result p3

    if-eq p3, v2, :cond_1

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentResponse;->getMsg()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3, v2, p2, v2}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O0(Ljava/lang/String;ZII)V

    .line 8
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentResponse;->getSucc()I

    move-result p1

    if-ne p1, v2, :cond_4

    .line 9
    invoke-virtual {p0, p2, v2}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->j0(II)V

    goto :goto_1

    .line 10
    :cond_2
    invoke-virtual {p0, v0, v2, p2, v2}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O0(Ljava/lang/String;ZII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p0, v0, v2, p2, v2}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O0(Ljava/lang/String;ZII)V

    .line 12
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    :cond_3
    const-string p1, "\u7f51\u7edc\u8fde\u63a5\u5931\u8d25\uff0c\u518d\u8bd5\u8bd5\u5427~"

    .line 13
    invoke-virtual {p0, p1, v2, p2, v2}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O0(Ljava/lang/String;ZII)V

    :cond_4
    :goto_1
    return-void
.end method

.method E0(Lcom/join/mgps/dto/CommentBaseBean;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/CommentDetailActivity_;->M1(Landroid/content/Context;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentBaseBean;->getGame_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->d(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentBaseBean;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->b(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->f(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBespeak_switch()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->a(I)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getIs_started()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->e(I)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getComment_score_switch()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->c(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_score()Lcom/join/mgps/dto/GameScore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameScore;->getSgc_switch()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->h(I)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/CommentDetailActivity_$z;->g(Ljava/lang/String;)Lcom/join/mgps/activity/CommentDetailActivity_$z;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method F0(Lcom/join/mgps/dto/CommentBaseBean;II)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, "\u64cd\u4f5c\u5931\u8d25\uff0c\u8bf7\u7a0d\u5019\u518d\u8bd5~"

    .line 1
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    .line 2
    :try_start_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentBaseBean;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentBaseBean;->getPn()I

    move-result p1

    invoke-virtual {p0, v1, p3, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->s0(Ljava/lang/String;II)Lcom/join/mgps/dto/RequestCommentpraiseArgs;

    move-result-object p1

    .line 3
    iget-object p3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->J:Lcom/join/mgps/rpc/f;

    invoke-interface {p3, p1}, Lcom/join/mgps/rpc/f;->l(Lcom/join/mgps/dto/RequestCommentpraiseArgs;)Lcom/join/mgps/dto/CommentResponse;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentResponse;->getCode()I

    move-result p3

    const/16 v1, 0x321

    if-ne p3, v1, :cond_0

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->P0(Lcom/join/mgps/dto/CommentResponse;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentResponse;->getSucc()I

    move-result p3

    if-eq p3, v3, :cond_1

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentResponse;->getMsg()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3, v3, p2, v2}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O0(Ljava/lang/String;ZII)V

    .line 8
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentResponse;->getSucc()I

    move-result p1

    if-ne p1, v3, :cond_4

    .line 9
    invoke-virtual {p0, p2, v2}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->j0(II)V

    goto :goto_1

    .line 10
    :cond_2
    invoke-virtual {p0, v0, v3, p2, v2}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O0(Ljava/lang/String;ZII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p0, v0, v3, p2, v2}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O0(Ljava/lang/String;ZII)V

    .line 12
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    :cond_3
    const-string p1, "\u7f51\u7edc\u8fde\u63a5\u5931\u8d25\uff0c\u518d\u8bd5\u8bd5\u5427~"

    .line 13
    invoke-virtual {p0, p1, v3, p2, v2}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O0(Ljava/lang/String;ZII)V

    :cond_4
    :goto_1
    return-void
.end method

.method G0(Landroid/content/Intent;)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join,mgps.sim.sdkgamePayfinish"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->finish()V

    return-void
.end method

.method H0(Lcom/join/mgps/dto/InformationCommentBean;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, "\u70b9\u8d5e\u5931\u8d25"

    .line 1
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 2
    :try_start_0
    new-instance v1, Lcom/join/mgps/dto/GamePariseRequest;

    invoke-direct {v1}, Lcom/join/mgps/dto/GamePariseRequest;-><init>()V

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/GamePariseRequest;->setGame_id(Ljava/lang/String;)V

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBean;->getComment_id()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/GamePariseRequest;->setComment_id(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->R:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/GamePariseRequest;->setUid(I)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {p1}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/join/mgps/Util/RequestBeanUtil;->getGameDetailParis(Lcom/join/mgps/dto/GamePariseRequest;)Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object p1

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->H:Lcom/join/mgps/rpc/e;

    invoke-interface {v1, p1}, Lcom/join/mgps/rpc/e;->b(Lcom/join/mgps/dto/CommonRequestBean;)Lcom/join/mgps/dto/ResultMainBean;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 8
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResultMainBean;->getFlag()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    .line 9
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResultMainBean;->getMessages()Lcom/join/mgps/dto/ResultMessageBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/ResultMessageBean;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 10
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "\u4f60\u5df2\u8d5e\u8fc7"

    if-lez v1, :cond_2

    const/4 v1, 0x0

    .line 11
    :try_start_1
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/PariseBackData;

    invoke-virtual {p1}, Lcom/join/mgps/dto/PariseBackData;->isVal()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G1:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CommentBaseBean;

    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->e1()V

    goto :goto_1

    .line 14
    :cond_1
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showToast(Ljava/lang/String;)V

    goto :goto_1

    .line 15
    :cond_2
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showToast(Ljava/lang/String;)V

    goto :goto_1

    .line 16
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->C0()V

    .line 17
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showToast(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 19
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->C0()V

    .line 20
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showToast(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    const-string p1, "\u6ca1\u6709\u7f51\u7edc"

    .line 21
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showToast(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public L(Z)V
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->T:Z

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->W:Lcom/join/android/app/component/video/c;

    if-eqz p1, :cond_2

    .line 3
    invoke-virtual {p1}, Lcom/join/android/app/component/video/c;->I()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->W:Lcom/join/android/app/component/video/c;

    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p1}, Lcom/join/android/app/component/video/c;->H()V

    :cond_1
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->T:Z

    :cond_2
    :goto_0
    return-void
.end method

.method M0(Landroid/content/Intent;)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.account_status_uidchange"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->R:Lcom/wufan/user/service/protobuf/n0;

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->u0()V

    return-void
.end method

.method O0(Ljava/lang/String;ZII)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    if-eqz p2, :cond_1

    const/4 p1, 0x1

    const/4 p2, 0x0

    if-ne p4, p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-virtual {p1, p3, p2}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->H(II)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-virtual {p1, p3, p2}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->G(II)V

    :cond_1
    :goto_0
    return-void
.end method

.method P0(Lcom/join/mgps/dto/CommentResponse;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentResponse;->getCode()I

    move-result v0

    const/16 v1, 0x321

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->x0()V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "\u6570\u636e\u8bbf\u95ee\u5931\u8d25\uff0c\u8bf7\u7a0d\u5019\u518d\u8bd5\uff01"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentResponse;->getMsg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method Q0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goSearchHintActivity(Landroid/content/Context;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Where;->detial2:Lcom/papa/sim/statistic/Where;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->u2(Lcom/papa/sim/statistic/Where;Ljava/lang/String;)V

    return-void
.end method

.method T0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/dto/ShareBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ShareBean;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getShare_url()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setqZoneShareUrl(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setQqUrl(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setWechatFriendUrl(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setWechatShareUrl(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setWeiboShareUrl(Ljava/lang/String;)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setTitle(Ljava/lang/String;)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getInfo()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setText(Ljava/lang/String;)V

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getIco_remote()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setImageUrl(Ljava/lang/String;)V

    const/4 v1, 0x2

    .line 11
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setFrom(I)V

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setGameId(Ljava/lang/String;)V

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getShare_config()Lcom/join/mgps/dto/DetialShareData;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getShare_config()Lcom/join/mgps/dto/DetialShareData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetialShareData;->getShare_switch()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 14
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getShare_config()Lcom/join/mgps/dto/DetialShareData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetialShareData;->getJump_info()Lcom/join/mgps/dto/BannerBean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setIntentData(Lcom/join/mgps/dto/BannerBean;)V

    .line 15
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v1, v0}, Lcom/join/mgps/Util/s;->r(Landroid/content/Context;Lcom/join/mgps/dto/ShareBean;)V

    return-void
.end method

.method U0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/dto/ShareBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ShareBean;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getShare_url()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setqZoneShareUrl(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setQqUrl(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setWechatFriendUrl(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setWechatShareUrl(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setWeiboShareUrl(Ljava/lang/String;)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getIco_remote()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setImageUrl(Ljava/lang/String;)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setTitle(Ljava/lang/String;)V

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getInfo()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setText(Ljava/lang/String;)V

    const/4 v1, 0x2

    .line 11
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setFrom(I)V

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setGameId(Ljava/lang/String;)V

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getShare_config()Lcom/join/mgps/dto/DetialShareData;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getShare_config()Lcom/join/mgps/dto/DetialShareData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetialShareData;->getShare_switch()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 14
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getShare_config()Lcom/join/mgps/dto/DetialShareData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetialShareData;->getJump_info()Lcom/join/mgps/dto/BannerBean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setIntentData(Lcom/join/mgps/dto/BannerBean;)V

    .line 15
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v1, v0}, Lcom/join/mgps/Util/s;->r(Landroid/content/Context;Lcom/join/mgps/dto/ShareBean;)V

    return-void
.end method

.method V0()V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/dto/ShareBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ShareBean;-><init>()V

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getActivity_entry()Lcom/join/mgps/dto/GamedetialBottomEntry;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialBottomEntry;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setqZoneShareUrl(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setQqUrl(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setWechatFriendUrl(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setWechatShareUrl(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setWeiboShareUrl(Ljava/lang/String;)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setTitle(Ljava/lang/String;)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getInfo()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setText(Ljava/lang/String;)V

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getIco_remote()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setImageUrl(Ljava/lang/String;)V

    const/4 v1, 0x2

    .line 11
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setFrom(I)V

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setGameId(Ljava/lang/String;)V

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v1, v0}, Lcom/join/mgps/Util/s;->r(Landroid/content/Context;Lcom/join/mgps/dto/ShareBean;)V

    return-void
.end method

.method W0(Lcom/join/mgps/dto/GiftPackageDataInfoBean;)V
    .locals 11
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, "\u4e0b\u8f7d\u6e38\u620f"

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N0()V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/Dialog;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    .line 5
    :cond_0
    new-instance v1, Lcom/join/mgps/customview/o;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    const v3, 0x7f110191

    invoke-direct {v1, v2, v3}, Lcom/join/mgps/customview/o;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    const v2, 0x7f0c0723

    .line 6
    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setContentView(I)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    const v2, 0x7f09041f

    invoke-virtual {v1, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 8
    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    const v3, 0x7f090425

    invoke-virtual {v2, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 9
    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    const v4, 0x7f090c2a

    invoke-virtual {v3, v4}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/LinearLayout;

    const/16 v4, 0x8

    .line 10
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 11
    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    const v4, 0x7f090c1a

    invoke-virtual {v3, v4}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/LinearLayout;

    const/4 v4, 0x0

    .line 12
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 13
    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    const v5, 0x7f09145c

    invoke-virtual {v3, v5}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 14
    iget-object v5, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    const v6, 0x7f0911e4

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 15
    iget-object v6, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    const v7, 0x7f0911e3

    invoke-virtual {v6, v7}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    .line 16
    iget-object v7, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    const v8, 0x7f09042b

    invoke-virtual {v7, v8}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 17
    iget-object v8, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    const v9, 0x7f090e42

    invoke-virtual {v8, v9}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    const-string v9, "\u9886\u53f7\u6210\u529f"

    .line 18
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    invoke-virtual {p1}, Lcom/join/mgps/dto/GiftPackageDataInfoBean;->getGift_package_code()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v3, "\u5173\u95ed"

    .line 20
    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 21
    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 22
    invoke-virtual {p1}, Lcom/join/mgps/dto/GiftPackageDataInfoBean;->getGift_package_times_end()J

    move-result-wide v9

    invoke-static {v9, v10}, Lcom/join/mgps/Util/y;->v(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    new-instance v3, Lcom/join/mgps/activity/GameDetialModleFourActivity$f;

    invoke-direct {v3, p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity$f;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;Lcom/join/mgps/dto/GiftPackageDataInfoBean;)V

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    new-instance p1, Lcom/join/mgps/activity/GameDetialModleFourActivity$g;

    invoke-direct {p1, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity$g;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V

    invoke-virtual {v2, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 26
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x2b

    if-lez v2, :cond_2

    const/16 p1, 0x2b

    :cond_2
    if-eqz p1, :cond_4

    const/4 v2, 0x5

    if-eq p1, v2, :cond_3

    const/16 v2, 0x9

    if-eq p1, v2, :cond_4

    if-eq p1, v3, :cond_4

    const-string p1, "\u4e0b\u8f7d\u4e2d.."

    .line 27
    invoke-virtual {v1, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_3
    const-string p1, "\u542f\u52a8\u6e38\u620f"

    .line 28
    invoke-virtual {v1, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 29
    :cond_4
    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 30
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz p1, :cond_5

    .line 31
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 32
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result p1

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, p1, v0, v2}, Lcom/join/mgps/Util/UtilsMy;->r3(Landroid/widget/Button;ILcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)V

    const/4 p1, -0x1

    .line 33
    invoke-virtual {v1, p1}, Landroid/widget/Button;->setBackgroundColor(I)V

    .line 34
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object p1

    invoke-static {p1, v8}, Lcom/join/mgps/Util/UtilsMy;->k3(Lcom/join/mgps/dto/TipNew;Landroid/widget/TextView;)V

    .line 35
    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_6

    .line 36
    invoke-virtual {v1, v4}, Landroid/widget/Button;->setEnabled(Z)V

    const-string p1, "\u5373\u5c06\u5f00\u653e"

    .line 37
    invoke-virtual {v1, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 38
    :cond_6
    new-instance p1, Lcom/join/mgps/activity/GameDetialModleFourActivity$h;

    invoke-direct {p1, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity$h;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    if-eqz p1, :cond_8

    .line 40
    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_7

    return-void

    .line 41
    :cond_7
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_8
    :goto_2
    return-void
.end method

.method X0(Lcom/join/mgps/dto/GiftPackageDataOperationBean;)V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    .line 4
    :cond_0
    new-instance v0, Lcom/join/mgps/customview/o;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    const v2, 0x7f110191

    invoke-direct {v0, v1, v2}, Lcom/join/mgps/customview/o;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    const v1, 0x7f0c0723

    .line 5
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(I)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    const v1, 0x7f09041f

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    const v2, 0x7f090425

    invoke-virtual {v1, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 8
    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    const v3, 0x7f09145c

    invoke-virtual {v2, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 9
    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    const v4, 0x7f0911e4

    invoke-virtual {v3, v4}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 10
    iget-object v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    const v5, 0x7f0911e3

    invoke-virtual {v4, v5}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 11
    iget-object v5, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    const v6, 0x7f090e42

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    const-string v6, "\u9886\u53f7\u6210\u529f"

    .line 12
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    invoke-virtual {p1}, Lcom/join/mgps/dto/GiftPackageDataOperationBean;->getGift_info()Lcom/join/mgps/dto/GiftPackageDataInfoBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GiftPackageDataInfoBean;->getGift_package_code()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v2, "\u5173\u95ed"

    .line 14
    invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    const-string v2, "\u4e0b\u8f7d\u6e38\u620f"

    .line 15
    invoke-virtual {v0, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 16
    new-instance v4, Lcom/join/mgps/activity/GameDetialModleFourActivity$i;

    invoke-direct {v4, p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity$i;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;Lcom/join/mgps/dto/GiftPackageDataOperationBean;)V

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    new-instance v3, Lcom/join/mgps/activity/GameDetialModleFourActivity$j;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity$j;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V

    invoke-virtual {v1, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-ne v1, v3, :cond_1

    .line 19
    invoke-virtual {v0, v4}, Landroid/widget/Button;->setEnabled(Z)V

    const-string v1, "\u5373\u5c06\u5f00\u653e"

    .line 20
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 21
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v4

    .line 22
    :cond_2
    invoke-virtual {p1}, Lcom/join/mgps/dto/GiftPackageDataOperationBean;->getGame_info()Lcom/join/mgps/dto/DetailResultBean;

    move-result-object v1

    const/16 v3, 0x2b

    if-eqz v1, :cond_3

    .line 23
    invoke-virtual {p1}, Lcom/join/mgps/dto/GiftPackageDataOperationBean;->getGame_info()Lcom/join/mgps/dto/DetailResultBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetailResultBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {p1}, Lcom/join/mgps/dto/GiftPackageDataOperationBean;->getGame_info()Lcom/join/mgps/dto/DetailResultBean;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/DetailResultBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_3

    const/16 v4, 0x2b

    :cond_3
    if-eqz v4, :cond_5

    const/4 v1, 0x5

    if-eq v4, v1, :cond_4

    const/16 v1, 0x9

    if-eq v4, v1, :cond_5

    if-eq v4, v3, :cond_5

    const-string p1, "\u4e0b\u8f7d\u4e2d.."

    .line 24
    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_4
    const-string p1, "\u542f\u52a8\u6e38\u620f"

    .line 25
    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 26
    :cond_5
    invoke-virtual {v0, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 27
    invoke-virtual {p1}, Lcom/join/mgps/dto/GiftPackageDataOperationBean;->getGame_info()Lcom/join/mgps/dto/DetailResultBean;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 28
    invoke-virtual {p1}, Lcom/join/mgps/dto/GiftPackageDataOperationBean;->getGame_info()Lcom/join/mgps/dto/DetailResultBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetailResultBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {p1}, Lcom/join/mgps/dto/GiftPackageDataOperationBean;->getGame_info()Lcom/join/mgps/dto/DetailResultBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/DetailResultBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 29
    invoke-virtual {p1}, Lcom/join/mgps/dto/GiftPackageDataOperationBean;->getGame_info()Lcom/join/mgps/dto/DetailResultBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetailResultBean;->getDown_status()I

    move-result v1

    invoke-virtual {p1}, Lcom/join/mgps/dto/GiftPackageDataOperationBean;->getGame_info()Lcom/join/mgps/dto/DetailResultBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/DetailResultBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {p1}, Lcom/join/mgps/dto/GiftPackageDataOperationBean;->getGame_info()Lcom/join/mgps/dto/DetailResultBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/DetailResultBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/join/mgps/Util/UtilsMy;->r3(Landroid/widget/Button;ILcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)V

    .line 30
    invoke-virtual {p1}, Lcom/join/mgps/dto/GiftPackageDataOperationBean;->getGame_info()Lcom/join/mgps/dto/DetailResultBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object p1

    invoke-static {p1, v5}, Lcom/join/mgps/Util/UtilsMy;->k3(Lcom/join/mgps/dto/TipNew;Landroid/widget/TextView;)V

    .line 31
    :cond_6
    :goto_0
    new-instance p1, Lcom/join/mgps/activity/GameDetialModleFourActivity$l;

    invoke-direct {p1, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity$l;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    invoke-direct {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N0()V

    .line 33
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    if-eqz p1, :cond_8

    .line 34
    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_7

    return-void

    .line 35
    :cond_7
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :cond_8
    return-void
.end method

.method Y0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->X1:Lcom/join/mgps/customview/o;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/a0;->c0(Landroid/content/Context;)Lcom/join/mgps/customview/o;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->X1:Lcom/join/mgps/customview/o;

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->X1:Lcom/join/mgps/customview/o;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method Z0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y1:Lcom/join/mgps/customview/o;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/a0;->e0(Landroid/content/Context;)Lcom/join/mgps/customview/o;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y1:Lcom/join/mgps/customview/o;

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y1:Lcom/join/mgps/customview/o;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method a1()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0xfa0L
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->s()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-virtual {v0}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->s()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/c;->g(Landroid/view/View;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->a1()V

    return-void
.end method

.method addFrom(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L:Lcom/join/mgps/dto/ExtBean;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v0

    const-string v1, "112"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    new-instance v0, Lcom/join/mgps/dto/ExtBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ExtBean;-><init>()V

    const-string v2, "101"

    .line 4
    invoke-virtual {v0, v2}, Lcom/join/mgps/dto/ExtBean;->setFrom(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ExtBean;->setPosition(Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ExtBean;->getLocation()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ExtBean;->setLocation(Ljava/lang/String;)V

    .line 7
    invoke-static {v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-virtual {p1, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setExt(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method afterView()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/d;->P1()Lcom/join/mgps/rpc/impl/d;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->H:Lcom/join/mgps/rpc/e;

    .line 2
    invoke-static {}, Lcom/join/mgps/rpc/impl/g;->A0()Lcom/join/mgps/rpc/impl/g;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->I:Lcom/join/mgps/rpc/i;

    .line 3
    invoke-static {}, Lcom/join/mgps/rpc/impl/e;->m()Lcom/join/mgps/rpc/impl/e;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->J:Lcom/join/mgps/rpc/f;

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "gameId"

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K:Ljava/lang/String;

    const-string v1, "autodown"

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->M:Z

    const-string v1, "extBean"

    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ExtBean;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L:Lcom/join/mgps/dto/ExtBean;

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->x:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->y:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 11
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->d(Ljava/lang/Object;)V

    .line 12
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 13
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->getDownloadTaskInfo()V

    .line 14
    new-instance v0, Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    const-string v0, "GameDetialModleFourAct"

    .line 15
    invoke-static {v0}, Lcom/join/android/app/component/video/a;->n0(Ljava/lang/String;)V

    .line 16
    new-instance v2, Lcom/join/android/app/component/video/c;

    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-direct {v2, v3, v0}, Lcom/join/android/app/component/video/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->W:Lcom/join/android/app/component/video/c;

    .line 17
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-direct {v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 18
    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 19
    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v3, Lcom/join/mgps/activity/GameDetialModleFourActivity$k;

    invoke-direct {v3, p0, v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity$k;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;Landroidx/recyclerview/widget/LinearLayoutManager;)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 20
    new-instance v2, Lcom/join/mgps/recycler/c;

    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-direct {v2, v0, v3}, Lcom/join/mgps/recycler/c;-><init>(Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->U:Lcom/join/mgps/recycler/c;

    .line 21
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    if-nez v0, :cond_1

    .line 22
    new-instance v0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    iget-object v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->W:Lcom/join/android/app/component/video/c;

    invoke-direct {v0, v2, v3, v4}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;-><init>(Landroid/content/Context;Lcom/join/mgps/dto/GamedetialModleFourBean;Lcom/join/android/app/component/video/c;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    .line 23
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->V:Lw1/i;

    invoke-virtual {v0, v2}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->L(Lw1/i;)V

    .line 24
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L:Lcom/join/mgps/dto/ExtBean;

    if-eqz v0, :cond_2

    .line 25
    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->get_from_type()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->T(I)V

    .line 26
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-virtual {v0, v2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 27
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    new-instance v2, Lcom/join/mgps/activity/GameDetialModleFourActivity$n;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity$n;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V

    invoke-virtual {v0, v2}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->M(Lcom/join/mgps/adapter/GameDetialModleFourAdapter$p1;)V

    .line 28
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->P:Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v2, 0x1

    .line 29
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->setSmoothScrollbarEnabled(Z)V

    .line 30
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->P:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->setAutoMeasureEnabled(Z)V

    .line 31
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->P:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 32
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->A:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 33
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setPullRefreshEnabled(Z)V

    .line 34
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v2, Lcom/join/mgps/activity/GameDetialModleFourActivity$o;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity$o;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V

    invoke-virtual {v0, v2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingListener(Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;)V

    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->getModleFourBeanShow()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 36
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->o1(Lcom/join/mgps/dto/GamedetialModleFourBean;Z)V

    goto :goto_0

    .line 37
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->t0()V

    .line 38
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S1:Landroid/widget/ImageView;

    new-instance v2, Lcom/join/mgps/activity/GameDetialModleFourActivity$p;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity$p;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->T1:Landroid/widget/ImageView;

    new-instance v2, Lcom/join/mgps/activity/GameDetialModleFourActivity$q;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity$q;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 40
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L:Lcom/join/mgps/dto/ExtBean;

    if-eqz v0, :cond_4

    .line 41
    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    .line 42
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->getPosition()Ljava/lang/String;

    .line 43
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->getLocation()Ljava/lang/String;

    .line 44
    :cond_4
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->l1(Z)V

    return-void
.end method

.method b1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->R1:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const v1, 0x7f08092e

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    const v1, 0x7f010056

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->W1:Landroid/view/animation/Animation;

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->W1:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->U1:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->U1:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->W1:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->W1:Landroid/view/animation/Animation;

    new-instance v1, Lcom/join/mgps/activity/GameDetialModleFourActivity$m;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity$m;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method

.method c1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->U1:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->U1:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->R1:Landroid/widget/ImageView;

    const v1, 0x7f080936

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    return-void
.end method

.method changeDownloadTaskNumber(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-eq p2, v1, :cond_9

    const/4 v1, 0x3

    if-eq p2, v1, :cond_8

    const/4 v1, 0x5

    if-eq p2, v1, :cond_6

    const/4 v1, 0x6

    if-eq p2, v1, :cond_5

    const/4 v1, 0x7

    if-eq p2, v1, :cond_3

    const/16 v1, 0xa

    if-eq p2, v1, :cond_1

    const/16 p1, 0xb

    if-eq p2, p1, :cond_7

    goto/16 :goto_0

    .line 2
    :cond_1
    iget-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->M1:Ljava/util/Map;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 3
    iget-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->M1:Ljava/util/Map;

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    :cond_2
    iget-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N1:Ljava/util/Map;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    .line 5
    iget-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N1:Ljava/util/Map;

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 6
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->M1:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->M1:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N1:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N1:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 10
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N1:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N1:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 12
    :cond_6
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->M1:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 13
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->M1:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    :cond_7
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N1:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N1:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 16
    :cond_8
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N1:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 17
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N1:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 18
    :cond_9
    iget-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->M1:Ljava/util/Map;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_a

    .line 19
    iget-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->M1:Ljava/util/Map;

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    :cond_a
    iget-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N1:Ljava/util/Map;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    .line 21
    iget-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N1:Ljava/util/Map;

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    :cond_b
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->updateDownloadView()V

    return-void
.end method

.method changeGameFollow(I)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->R:Lcom/wufan/user/service/protobuf/n0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    :goto_0
    :try_start_0
    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v2}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    .line 5
    invoke-virtual {v3}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 6
    iget v2, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 7
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 8
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 9
    invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    const-string v1, ""

    .line 10
    :goto_1
    new-instance v2, Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;

    invoke-direct {v2}, Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;-><init>()V

    .line 11
    invoke-virtual {v2, v1}, Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;->setApp_ver(Ljava/lang/String;)V

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;->setGame_id(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v2, v0}, Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;->setUid(I)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->R:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->z()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;->setMobile(Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/join/mgps/Util/RequestBeanUtil;->getDetialFollowAnd(Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;)Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p1, v2, :cond_4

    const/4 v2, 0x2

    if-eq p1, v2, :cond_3

    const/4 v2, 0x3

    if-eq p1, v2, :cond_2

    const/4 v2, 0x4

    if-eq p1, v2, :cond_1

    goto :goto_2

    .line 16
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->H:Lcom/join/mgps/rpc/e;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/e;->d0(Lcom/join/mgps/dto/CommonRequestBean;)Lcom/join/mgps/dto/ResultMainBean;

    move-result-object v1

    goto :goto_2

    .line 17
    :cond_2
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->H:Lcom/join/mgps/rpc/e;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/e;->o(Lcom/join/mgps/dto/CommonRequestBean;)Lcom/join/mgps/dto/ResultMainBean;

    move-result-object v1

    goto :goto_2

    .line 18
    :cond_3
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->H:Lcom/join/mgps/rpc/e;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/e;->D(Lcom/join/mgps/dto/CommonRequestBean;)Lcom/join/mgps/dto/ResultMainBean;

    move-result-object v1

    goto :goto_2

    .line 19
    :cond_4
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->H:Lcom/join/mgps/rpc/e;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/e;->O0(Lcom/join/mgps/dto/CommonRequestBean;)Lcom/join/mgps/dto/ResultMainBean;

    move-result-object v1

    :goto_2
    if-eqz v1, :cond_5

    .line 20
    invoke-virtual {p0, v1, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->updateTitleButn(Lcom/join/mgps/dto/ResultMainBean;I)V

    :cond_5
    return-void
.end method

.method d1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goMyGameManagerActivity(Landroid/content/Context;)V

    return-void
.end method

.method e1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_id()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->o1(Lcom/join/mgps/dto/GamedetialModleFourBean;Z)V

    :cond_0
    return-void
.end method

.method public g0(Lw1/i;)Lcom/join/mgps/activity/GameDetialModleFourActivity;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->V:Lw1/i;

    return-object p0
.end method

.method getDownloadTaskInfo()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0}, Lp1/f;->r()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    invoke-virtual {v1}, Lp1/f;->q()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 4
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 5
    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->M1:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    .line 6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 8
    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N1:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 9
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->updateDownloadView()V

    return-void
.end method

.method h0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->finish()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->y0()V

    return-void
.end method

.method h1(I)V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const/16 v0, 0x64

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-ge p1, v0, :cond_0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Q1:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f071220

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v4

    iput v4, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v4

    iput v4, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 4
    iget-object v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Q1:Landroid/widget/TextView;

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Q1:Landroid/widget/TextView;

    invoke-virtual {v0, v3, v3, v3, v3}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Q1:Landroid/widget/TextView;

    const v3, 0x7f080a5d

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Q1:Landroid/widget/TextView;

    invoke-virtual {v0, v1, v2, v2, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Q1:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f070991

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v4

    iput v4, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f070ec1

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v4

    iput v4, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    const/high16 v4, 0x40e00000    # 7.0f

    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    invoke-static {v1, v4, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v4

    float-to-int v4, v4

    const/4 v5, 0x4

    .line 12
    invoke-virtual {v0, v5, v4, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 13
    iget-object v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Q1:Landroid/widget/TextView;

    const/16 v5, 0x11

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 14
    iget-object v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Q1:Landroid/widget/TextView;

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Q1:Landroid/widget/TextView;

    invoke-virtual {v0, v3, v3, v3, v3}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Q1:Landroid/widget/TextView;

    const v3, 0x7f08099f

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Q1:Landroid/widget/TextView;

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 18
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Q1:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Q1:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method i0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0}, Lp1/f;->S()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O1:I

    .line 2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0}, Lp1/f;->a0()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->P1:I

    .line 3
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->i1(I)V

    .line 4
    iget v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O1:I

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->h1(I)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->k1()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 8
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->updateDownloadView()V

    return-void
.end method

.method i1(I)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-nez p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->c1()V

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b1()V

    :goto_0
    return-void
.end method

.method instalButtomButn()V
    .locals 11
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_book()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBespeak_switch()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    if-eq v0, v3, :cond_2

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v0

    if-ne v0, v2, :cond_2

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goLoginNetGame(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_book()I

    move-result v0

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    .line 5
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->changeGameFollow(I)V

    :cond_1
    :goto_0
    return-void

    .line 6
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v5}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 7
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v5, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_url_remote()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0, v4}, Lcom/join/mgps/Util/UtilsMy;->T2(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    .line 9
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v4, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    .line 10
    :goto_1
    iget-object v5, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/16 v6, 0x2b

    if-eqz v5, :cond_5

    iget-object v5, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v5

    iget-object v7, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v7}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v5

    if-lez v5, :cond_5

    const/16 v0, 0x2b

    .line 11
    :cond_5
    iget-object v5, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez v5, :cond_6

    return-void

    :cond_6
    if-eqz v5, :cond_8

    if-eq v0, v2, :cond_7

    const/16 v7, 0xa

    if-ne v0, v7, :cond_8

    .line 12
    :cond_7
    invoke-static {v5}, Lcom/php25/PDownload/d;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    :cond_8
    const/16 v7, 0xc

    if-eq v0, v7, :cond_2f

    const/16 v7, 0x1b

    if-ne v0, v7, :cond_9

    goto/16 :goto_4

    :cond_9
    const/16 v7, 0xd

    if-ne v0, v7, :cond_a

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0, v5}, Lcom/php25/PDownload/d;->l(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void

    :cond_a
    const/4 v7, 0x5

    if-ne v0, v7, :cond_b

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    const-string v1, "2"

    invoke-static {v0, v5, v1}, Lcom/join/mgps/Util/UtilsMy;->W3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_b
    const/16 v8, 0x2a

    if-ne v0, v8, :cond_d

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getVer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer(Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getVer_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer_name(Ljava/lang/String;)V

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_url_remote()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setUrl(Ljava/lang/String;)V

    .line 18
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCfg_ver()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_ver(Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCfg_ver_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_ver_name(Ljava/lang/String;)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCfg_down_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_down_url(Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    if-eqz v1, :cond_c

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/PayTagInfo;->getPay_game_amount()I

    move-result v4

    :cond_c
    invoke-virtual {v0, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setPay_game_amount(I)V

    .line 22
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    sget-object v1, Lcom/papa/sim/statistic/Where;->detail:Lcom/papa/sim/statistic/Where;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setKeyword(Ljava/lang/String;)V

    .line 23
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->z4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/lang/String;)V

    .line 24
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->r4(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    :cond_d
    const/16 v8, 0x9

    const-string v9, "checkgame"

    if-ne v0, v8, :cond_1d

    .line 25
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 26
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 27
    :cond_e
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v0

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialMoreBean;->getTpl_two_qq()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 28
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    iget-object v5, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v6, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v6}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/GamedetialMoreBean;->getTpl_two_qq_key()Ljava/lang/String;

    move-result-object v6

    iget-object v8, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v8

    invoke-virtual {v8}, Lcom/join/mgps/dto/GamedetialMoreBean;->getAd_pic_qq()Ljava/lang/String;

    move-result-object v8

    iget-object v10, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v10}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v10

    invoke-virtual {v10}, Lcom/join/mgps/dto/GamedetialMoreBean;->getTpl_two_qq()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v5, v6, v8, v10}, Lcom/join/mgps/Util/a0;->b0(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    :cond_f
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDownloadType()I

    move-result v0

    if-eqz v0, :cond_11

    if-eq v0, v3, :cond_11

    if-eq v0, v2, :cond_10

    goto/16 :goto_3

    .line 30
    :cond_10
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->u4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    .line 31
    :cond_11
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1c

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    goto/16 :goto_2

    .line 32
    :cond_12
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->addFrom(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 33
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_13

    return-void

    .line 34
    :cond_13
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v0

    if-ne v0, v7, :cond_14

    .line 35
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void

    .line 36
    :cond_14
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0}, Lcom/php25/PDownload/d;->b(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 37
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getVer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer(Ljava/lang/String;)V

    .line 38
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getVer_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer_name(Ljava/lang/String;)V

    .line 39
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_url_remote()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setUrl(Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCfg_ver()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_ver(Ljava/lang/String;)V

    .line 41
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCfg_ver_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_ver_name(Ljava/lang/String;)V

    .line 42
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCfg_down_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_down_url(Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    if-eqz v1, :cond_15

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/PayTagInfo;->getPay_game_amount()I

    move-result v4

    :cond_15
    invoke-virtual {v0, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setPay_game_amount(I)V

    .line 44
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    sget-object v1, Lcom/papa/sim/statistic/Where;->detail:Lcom/papa/sim/statistic/Where;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setKeyword(Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->z4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/lang/String;)V

    .line 46
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_19

    .line 47
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L:Lcom/join/mgps/dto/ExtBean;

    if-eqz v0, :cond_16

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 48
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ExtBean;->getFrom_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/join/mgps/Util/UtilsMy;->e4(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    .line 49
    :cond_16
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_17

    goto/16 :goto_3

    .line 50
    :cond_17
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v0

    if-ne v0, v7, :cond_18

    .line 51
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    .line 52
    :cond_18
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_3

    .line 53
    :cond_19
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->C1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    .line 54
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_1a

    goto/16 :goto_3

    .line 55
    :cond_1a
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v0

    if-ne v0, v7, :cond_1b

    .line 56
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    .line 57
    :cond_1b
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getTp_down_url()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getOther_down_switch()I

    move-result v3

    iget-object v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCdn_down_switch()I

    move-result v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    goto/16 :goto_3

    :cond_1c
    :goto_2
    return-void

    :cond_1d
    const/16 v1, 0xb

    if-ne v1, v0, :cond_1e

    .line 58
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v5, v0}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_3

    :cond_1e
    if-ne v6, v0, :cond_26

    .line 59
    sget-object v0, Lcom/papa/sim/statistic/Where;->detail:Lcom/papa/sim/statistic/Where;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setKeyword(Ljava/lang/String;)V

    .line 60
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v0, :cond_2e

    .line 61
    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v0

    if-eqz v0, :cond_1f

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialMoreBean;->getTpl_two_qq()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 62
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialMoreBean;->getTpl_two_qq_key()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/GamedetialMoreBean;->getAd_pic_qq()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GamedetialMoreBean;->getTpl_two_qq()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/join/mgps/Util/a0;->b0(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    :cond_1f
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->addFrom(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 64
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_23

    .line 65
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L:Lcom/join/mgps/dto/ExtBean;

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    .line 66
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ExtBean;->getFrom_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/join/mgps/Util/UtilsMy;->e4(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    .line 67
    :cond_20
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_21

    goto/16 :goto_3

    .line 68
    :cond_21
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v0

    if-ne v0, v7, :cond_22

    .line 69
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    .line 70
    :cond_22
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_3

    .line 71
    :cond_23
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->C1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    .line 72
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_24

    goto/16 :goto_3

    .line 73
    :cond_24
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v0

    if-ne v0, v7, :cond_25

    .line 74
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    .line 75
    :cond_25
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getTp_down_url()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getOther_down_switch()I

    move-result v3

    iget-object v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCdn_down_switch()I

    move-result v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    goto/16 :goto_3

    .line 76
    :cond_26
    sget-object v0, Lcom/papa/sim/statistic/Where;->detail:Lcom/papa/sim/statistic/Where;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setKeyword(Ljava/lang/String;)V

    .line 77
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v0, :cond_2e

    .line 78
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->addFrom(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 79
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v0

    if-eqz v0, :cond_27

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialMoreBean;->getTpl_two_qq()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_27

    .line 80
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialMoreBean;->getTpl_two_qq_key()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/GamedetialMoreBean;->getAd_pic_qq()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GamedetialMoreBean;->getTpl_two_qq()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/join/mgps/Util/a0;->b0(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    :cond_27
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_2b

    .line 82
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L:Lcom/join/mgps/dto/ExtBean;

    if-eqz v0, :cond_28

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_28

    .line 83
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ExtBean;->getFrom_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/join/mgps/Util/UtilsMy;->e4(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 84
    :cond_28
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_29

    goto :goto_3

    .line 85
    :cond_29
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v0

    if-ne v0, v7, :cond_2a

    .line 86
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_3

    .line 87
    :cond_2a
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_3

    .line 88
    :cond_2b
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->C1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    .line 89
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_2c

    goto :goto_3

    .line 90
    :cond_2c
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v0

    if-ne v0, v7, :cond_2d

    .line 91
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_3

    .line 92
    :cond_2d
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getTp_down_url()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getOther_down_switch()I

    move-result v3

    iget-object v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCdn_down_switch()I

    move-result v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    .line 93
    :cond_2e
    :goto_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->updateButn()V

    :cond_2f
    :goto_4
    return-void
.end method

.method iv_back()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->finish()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->y0()V

    return-void
.end method

.method public j0(II)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 1
    iget-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-virtual {p2, p1, v0}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->G(II)V

    goto :goto_0

    .line 2
    :cond_0
    iget-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-virtual {p2, p1, v0}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->H(II)V

    :goto_0
    return-void
.end method

.method j1(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CollectionBeanSub;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-eqz p1, :cond_3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-virtual {v0}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->y()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CollectionBeanSub;

    .line 4
    new-instance v3, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-direct {v3, v2}, Lcom/join/mgps/business/CollectionBeanSubBusiness;-><init>(Lcom/join/mgps/dto/CollectionBeanSub;)V

    const/16 v2, 0x33f5

    .line 5
    invoke-virtual {v3, v2}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 6
    invoke-virtual {v3, v2}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Z:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    new-instance v2, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v5, 0x29

    invoke-direct {v2, v4, v3, v5}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Z:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->g1(Ljava/util/List;)V

    .line 10
    invoke-direct {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N0()V

    .line 11
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v0, :cond_3

    .line 13
    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setNoMore()V

    goto :goto_1

    .line 14
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v0, :cond_3

    .line 15
    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->loadMoreComplete()V

    :cond_3
    :goto_1
    if-eqz p1, :cond_4

    .line 16
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-gtz p1, :cond_5

    .line 17
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz p1, :cond_5

    .line 18
    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setNoMore()V

    :cond_5
    return-void
.end method

.method k1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->c1()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Q1:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Q1:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method l1(Z)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0x3e8L
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L:Lcom/join/mgps/dto/ExtBean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v0

    const-string v1, "checkgame"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/m1;->c()Lcom/join/mgps/Util/m1;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ExtBean;->getFrom_id()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/activity/GameDetialModleFourActivity$r;

    invoke-direct {v3, p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity$r;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;Z)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/join/mgps/Util/m1;->b(Landroid/content/Context;Ljava/lang/String;Lcom/join/mgps/Util/m1$b;)V

    :cond_0
    return-void
.end method

.method n0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goMyGameManagerActivity(Landroid/content/Context;)V

    return-void
.end method

.method n1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 0

    if-eqz p1, :cond_0

    packed-switch p2, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 1
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->J0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 2
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 3
    :pswitch_3
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->I0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 4
    :pswitch_4
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method o0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goMyGameManagerActivity(Landroid/content/Context;)V

    return-void
.end method

.method o1(Lcom/join/mgps/dto/GamedetialModleFourBean;Z)V
    .locals 18
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v3, "\u6e38\u620f\u7b80\u4ecb"

    const-string v4, "\u8bc4\u8bba"

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v7, 0x1

    .line 1
    :try_start_0
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->A:Landroid/widget/LinearLayout;

    const/16 v8, 0x8

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_0
    if-nez v2, :cond_1

    return-void

    .line 3
    :cond_1
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->z:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    .line 4
    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    :cond_2
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 6
    iput-object v2, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    .line 7
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/TipNew;->getMini_game()Lcom/join/mgps/dto/TipBean;

    move-result-object v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->v1:Z

    .line 8
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/q1;->e(Ljava/util/ArrayList;)Z

    move-result v0

    iput-boolean v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->A1:Z

    .line 9
    iget-object v9, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-nez v0, :cond_4

    const/4 v0, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v9, v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingMoreEnabled(Z)V

    .line 10
    iget-boolean v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->M:Z

    if-eqz v0, :cond_5

    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v9, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K:Ljava/lang/String;

    invoke-virtual {v0, v9}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-nez v0, :cond_5

    .line 11
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    iget-object v9, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0, v9}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    .line 12
    :cond_5
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    if-eqz v0, :cond_6

    .line 13
    iget-object v9, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v9}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->getModleFourFragment()Lcom/join/mgps/activity/gamedetail/BaseGameDetailFragment;

    move-result-object v9

    invoke-virtual {v0, v9}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->I(Lcom/join/mgps/activity/gamedetail/BaseGameDetailFragment;)V

    .line 14
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getShare_config()Lcom/join/mgps/dto/DetialShareData;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v9, ""

    if-eqz v0, :cond_7

    :try_start_1
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getShare_config()Lcom/join/mgps/dto/DetialShareData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetialShareData;->getShare_switch()I

    move-result v0

    if-ne v0, v7, :cond_7

    .line 15
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 16
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->D:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v10, 0x7f080f46

    invoke-static {v0, v10, v9}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 17
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->l:Landroid/widget/LinearLayout;

    new-instance v10, Lcom/join/mgps/activity/GameDetialModleFourActivity$u;

    invoke-direct {v10, v1}, Lcom/join/mgps/activity/GameDetialModleFourActivity$u;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V

    invoke-virtual {v0, v10}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    .line 18
    :cond_7
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 19
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getActivity_entry()Lcom/join/mgps/dto/GamedetialBottomEntry;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 20
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 21
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->D:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getActivity_entry()Lcom/join/mgps/dto/GamedetialBottomEntry;

    move-result-object v8

    invoke-virtual {v8}, Lcom/join/mgps/dto/GamedetialBottomEntry;->getPic()Ljava/lang/String;

    move-result-object v8

    invoke-static {v0, v8}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 22
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->E:Landroid/widget/TextView;

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getActivity_entry()Lcom/join/mgps/dto/GamedetialBottomEntry;

    move-result-object v8

    invoke-virtual {v8}, Lcom/join/mgps/dto/GamedetialBottomEntry;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->l:Landroid/widget/LinearLayout;

    new-instance v8, Lcom/join/mgps/activity/GameDetialModleFourActivity$a;

    invoke-direct {v8, v1}, Lcom/join/mgps/activity/GameDetialModleFourActivity$a;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V

    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    .line 24
    :cond_8
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 25
    :goto_3
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v0, :cond_a

    .line 26
    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_follow()I

    move-result v0

    if-ne v0, v7, :cond_9

    .line 27
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->i:Landroid/widget/ImageView;

    const v8, 0x7f08049e

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 28
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->j:Landroid/widget/TextView;

    const-string v8, "\u5df2\u6536\u85cf"

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 29
    :cond_9
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->i:Landroid/widget/ImageView;

    const v8, 0x7f08049d

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 30
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->j:Landroid/widget/TextView;

    const-string v8, "\u6536\u85cf"

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    :cond_a
    :goto_4
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K:Ljava/lang/String;

    invoke-virtual {v0, v8}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    iput-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez v0, :cond_e

    .line 32
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    iput-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 33
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 34
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    sget-object v8, Lcom/join/mgps/enums/Dtype;->android:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFileType(Ljava/lang/String;)V

    .line 35
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v10, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v10}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPackageName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v8, v10}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 36
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v10, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v10}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPackageName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v8, v10}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v0

    .line 37
    iget-object v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getVer()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-virtual {v0}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v0

    iget-object v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getVer()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    if-ge v0, v8, :cond_b

    .line 38
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/16 v8, 0x9

    invoke-virtual {v0, v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_5

    .line 39
    :cond_b
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_5

    .line 40
    :cond_c
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_5

    .line 41
    :cond_d
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_5

    .line 42
    :cond_e
    invoke-virtual {v0, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setDownloadType(I)V

    .line 43
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getScreenshot_pic()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setScreenshot_pic(Ljava/lang/String;)V

    .line 44
    :goto_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v9, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v9}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 45
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getStart_count()I

    move-result v8

    invoke-virtual {v0, v8}, Lcom/join/mgps/dto/GamedetialModleFourBean;->setDown_count(I)V

    .line 46
    :cond_f
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->updateButn()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_6

    :catch_0
    move-exception v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 48
    :goto_6
    :try_start_2
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G1:Ljava/util/List;

    if-eqz v0, :cond_10

    .line 49
    iget-object v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v8, v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->setCommitDataBeanList(Ljava/util/List;)V

    .line 50
    :cond_10
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    iget-object v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->J1:Lcom/join/mgps/dto/CommentAllListBean$SelfCommentBean;

    invoke-virtual {v0, v8}, Lcom/join/mgps/dto/GamedetialModleFourBean;->setSelf_comment(Lcom/join/mgps/dto/CommentAllListBean$SelfCommentBean;)V

    .line 51
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    iget-object v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->H1:Ljava/lang/String;

    invoke-virtual {v0, v8}, Lcom/join/mgps/dto/GamedetialModleFourBean;->setGame_comment_count(Ljava/lang/String;)V

    .line 52
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    iget-object v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->I1:Lcom/join/mgps/dto/GameScore;

    invoke-virtual {v0, v8}, Lcom/join/mgps/dto/GamedetialModleFourBean;->setGame_score(Lcom/join/mgps/dto/GameScore;)V

    .line 53
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-virtual {v0, v2}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->K(Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    .line 54
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-virtual {v0}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->y()Ljava/util/List;

    move-result-object v0

    .line 55
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 56
    iget-boolean v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->A1:Z

    if-eqz v8, :cond_12

    .line 57
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_describe_second()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_11

    .line 58
    new-instance v3, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v4, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_describe_second()Ljava/lang/String;

    move-result-object v2

    const/16 v5, 0x2f

    invoke-direct {v3, v4, v2, v5}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    .line 59
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    :cond_11
    iget-object v2, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getSimilar_games_recommend_pc()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2e

    .line 61
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_2e

    .line 62
    new-instance v3, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v4, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v5, 0x32

    invoke-direct {v3, v4, v2, v5}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_e

    .line 63
    :cond_12
    iget-object v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_welfare()Lcom/join/mgps/dto/BtGameWelfare;

    move-result-object v8

    if-eqz v8, :cond_14

    .line 64
    invoke-virtual {v8}, Lcom/join/mgps/dto/BtGameWelfare;->getGame_activity_summary()Ljava/util/List;

    move-result-object v9

    if-nez v9, :cond_13

    invoke-virtual {v8}, Lcom/join/mgps/dto/BtGameWelfare;->getGame_benefit_summary()Lcom/join/mgps/dto/BtGameBenefitSummary;

    move-result-object v9

    if-eqz v9, :cond_14

    .line 65
    :cond_13
    new-instance v9, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v10, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v10}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v11, 0x2a

    invoke-direct {v9, v10, v8, v11}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    .line 66
    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    :cond_14
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBt_game_switch()I

    move-result v8

    const/16 v9, 0x27

    if-ne v8, v7, :cond_15

    .line 68
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getEdit_recommend()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_15

    .line 69
    new-instance v8, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v10, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v10}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getEdit_recommend()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v8, v10, v11, v9}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    const-string v10, "\u7f16\u8f91\u63a8\u8350"

    .line 70
    iput-object v10, v8, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;->f:Ljava/lang/Object;

    .line 71
    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    :cond_15
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBt_game_switch()I

    move-result v8

    const/4 v10, 0x0

    if-ne v8, v7, :cond_17

    .line 73
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_screen_shot()Ljava/util/List;

    move-result-object v8

    if-eqz v8, :cond_16

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_screen_shot()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    if-lez v8, :cond_16

    .line 74
    new-instance v5, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v11, 0x1c

    invoke-direct {v5, v8, v10, v11}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 75
    :cond_16
    new-instance v8, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v11, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v8, v11, v10, v5}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    :cond_17
    :goto_7
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_bt_tag()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_18

    .line 77
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    if-lez v8, :cond_18

    .line 78
    new-instance v8, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v11, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v12, 0x2b

    invoke-direct {v8, v11, v5, v12}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    :cond_18
    iget-object v5, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBt_game_switch()I

    move-result v5

    if-ne v5, v7, :cond_1a

    .line 80
    iget-object v5, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_exclusive_benefits()Ljava/lang/String;

    move-result-object v5

    .line 81
    iget-object v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_buy_rebate()Ljava/lang/String;

    move-result-object v8

    .line 82
    invoke-static {v5}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_19

    invoke-static {v8}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_1a

    .line 83
    :cond_19
    new-instance v11, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v12, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v13, 0x2c

    invoke-direct {v11, v12, v5, v13}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    .line 84
    iput-object v8, v11, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;->f:Ljava/lang/Object;

    .line 85
    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    :cond_1a
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_describe_second()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1c

    .line 87
    new-instance v5, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v5, v8, v3, v7}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    iget-object v5, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v5

    if-eqz v5, :cond_1b

    iget-object v5, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lez v5, :cond_1b

    .line 89
    new-instance v5, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v11, 0x4

    invoke-direct {v5, v8, v10, v11}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    :cond_1b
    new-instance v5, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v13, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_describe_second()Ljava/lang/String;

    move-result-object v14

    const/16 v15, 0x8

    const/16 v16, 0x1

    new-instance v8, Lcom/join/mgps/activity/GameDetialModleFourActivity$b;

    invoke-direct {v8, v1}, Lcom/join/mgps/activity/GameDetialModleFourActivity$b;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V

    move-object v12, v5

    move-object/from16 v17, v8

    invoke-direct/range {v12 .. v17}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;IILw1/j;)V

    .line 91
    iput-object v3, v5, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;->f:Ljava/lang/Object;

    .line 92
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBt_game_switch()I

    move-result v3

    if-eq v3, v7, :cond_1c

    .line 94
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getEdit_recommend()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1c

    .line 95
    new-instance v3, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v5, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getEdit_recommend()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v3, v5, v8, v9}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    .line 96
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    :cond_1c
    iget-object v3, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBespeak_switch()I

    move-result v3

    if-ne v3, v7, :cond_1d

    .line 98
    new-instance v3, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v5, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v8, 0x3

    invoke-direct {v3, v5, v10, v8}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    :cond_1d
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDev_info()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1e

    .line 100
    new-instance v3, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v5, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v8, "\u5f00\u53d1\u8005\u7684\u8bdd"

    invoke-direct {v3, v5, v8, v7}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 101
    new-instance v3, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v5, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDev_info()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x7

    invoke-direct {v3, v5, v8, v9}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    :cond_1e
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v3

    if-eqz v3, :cond_1f

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_detailed()Lcom/join/mgps/dto/GamedetialMoreBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/GamedetialMoreBean;->getTpl_two_qq()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1f

    .line 103
    new-instance v3, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v5, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v8, 0x18

    invoke-direct {v3, v5, v10, v8}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    :cond_1f
    iget-object v3, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getMini_program()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v3

    if-eqz v3, :cond_21

    .line 105
    iget-object v3, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getMini_program()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/DomainInfoBean;->getPic()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_20

    .line 106
    new-instance v3, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v5, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getMini_program()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v8

    const/16 v9, 0x2e

    invoke-direct {v3, v5, v8, v9}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    .line 107
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 108
    :cond_20
    new-instance v3, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v5, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getMini_program()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v8

    const/16 v9, 0x2d

    invoke-direct {v3, v5, v8, v9}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    .line 109
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_8
    if-nez p2, :cond_21

    .line 110
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v3

    sget-object v5, Lcom/papa/sim/statistic/Event;->pdGameDetails:Lcom/papa/sim/statistic/Event;

    new-instance v8, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v8}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v9, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v9}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_id()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v8

    iget-object v9, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v9}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getMini_program()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v9

    invoke-virtual {v9}, Lcom/join/mgps/dto/DomainInfoBean;->getIs_join()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/papa/sim/statistic/Ext;->setIsJoin(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v8

    iget-object v9, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v9}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getMini_program()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v9

    invoke-virtual {v9}, Lcom/join/mgps/dto/DomainInfoBean;->getAb_test_number()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/papa/sim/statistic/Ext;->setTestAbNumber(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v8

    invoke-virtual {v3, v5, v8}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 111
    :cond_21
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getAuxiliary_tool()Lcom/join/mgps/dto/GameDetialAuxiliaryBean;

    move-result-object v3

    if-eqz v3, :cond_22

    .line 112
    new-instance v3, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v5, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v8, "\u8f85\u52a9\u5de5\u5177"

    const/16 v9, 0xa

    invoke-direct {v3, v5, v8, v9}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    :cond_22
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getRoom_cfg_info()Lcom/join/mgps/dto/GameDetailRoomCfgInfo;

    move-result-object v3

    if-eqz v3, :cond_23

    .line 114
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getRoom_cfg_info()Lcom/join/mgps/dto/GameDetailRoomCfgInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/GameDetailRoomCfgInfo;->getGolden_finger()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_23

    .line 115
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getRoom_cfg_info()Lcom/join/mgps/dto/GameDetailRoomCfgInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/GameDetailRoomCfgInfo;->getGolden_finger()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_23

    .line 116
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getRoom_cfg_info()Lcom/join/mgps/dto/GameDetailRoomCfgInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/GameDetailRoomCfgInfo;->getGolden_finger()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    goto :goto_9

    :cond_23
    const/4 v3, 0x0

    .line 117
    :goto_9
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_prompt()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_24

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_prompt()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-gtz v5, :cond_25

    :cond_24
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_handle_entrance()Lcom/join/mgps/dto/RecomDatabean;

    move-result-object v5

    if-nez v5, :cond_25

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCommunity_entrance_switch()I

    move-result v5

    if-eq v5, v7, :cond_25

    if-lez v3, :cond_28

    .line 118
    :cond_25
    new-instance v5, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v8, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v9, 0x6

    new-instance v11, Lcom/join/mgps/activity/GameDetialModleFourActivity$c;

    invoke-direct {v11, v1}, Lcom/join/mgps/activity/GameDetialModleFourActivity$c;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V

    invoke-direct {v5, v8, v10, v9, v11}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;ILw1/j;)V

    .line 119
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_handle_entrance()Lcom/join/mgps/dto/RecomDatabean;

    move-result-object v8

    if-eqz v8, :cond_26

    const/4 v8, 0x1

    goto :goto_a

    :cond_26
    const/4 v8, 0x0

    :goto_a
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    iput-object v8, v5, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;->f:Ljava/lang/Object;

    .line 120
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v5, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;->g:Ljava/lang/Object;

    .line 121
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCommunity_entrance_switch()I

    move-result v2

    if-ne v2, v7, :cond_27

    const/4 v2, 0x1

    goto :goto_b

    :cond_27
    const/4 v2, 0x0

    :goto_b
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v5, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;->h:Ljava/lang/Object;

    .line 122
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    :cond_28
    iget-object v2, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v2, :cond_29

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getComment_switch()I

    move-result v2

    if-ne v2, v7, :cond_2c

    .line 124
    :cond_29
    new-instance v2, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v3, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v5, 0xd

    invoke-direct {v2, v3, v4, v5}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    iget-object v2, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCommitDataBeanList()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2a

    iget-object v2, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCommitDataBeanList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_2a

    .line 126
    invoke-direct {v1, v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->R0(Ljava/util/List;)V

    goto :goto_c

    .line 127
    :cond_2a
    iget-boolean v2, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L1:Z

    if-eqz v2, :cond_2b

    .line 128
    iput-boolean v6, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L1:Z

    .line 129
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->u0()V

    goto :goto_c

    .line 130
    :cond_2b
    new-instance v2, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v3, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v5, 0x1a

    invoke-direct {v2, v3, v4, v5}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    new-instance v2, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v3, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v5, 0x1b

    invoke-direct {v2, v3, v4, v5}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 132
    :cond_2c
    :goto_c
    new-instance v2, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v3, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "\u540c\u7c7b\u6e38\u620f"

    invoke-direct {v2, v3, v4, v7}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    iget-object v2, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getSimilar_games_recommend()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2e

    .line 134
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_2e

    .line 135
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/CollectionBeanSub;

    .line 136
    new-instance v4, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-direct {v4, v3}, Lcom/join/mgps/business/CollectionBeanSubBusiness;-><init>(Lcom/join/mgps/dto/CollectionBeanSub;)V

    const/16 v3, 0x33f5

    .line 137
    invoke-virtual {v4, v3}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 138
    invoke-virtual {v4, v3}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 139
    iget-object v3, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Z:Ljava/util/List;

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    new-instance v3, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object v5, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v6, 0x29

    invoke-direct {v3, v5, v4, v6}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Ljava/lang/Object;I)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .line 141
    :cond_2d
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Z:Ljava/util/List;

    invoke-direct {v1, v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->g1(Ljava/util/List;)V

    .line 142
    :cond_2e
    :goto_e
    invoke-direct/range {p0 .. p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N0()V

    .line 143
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    iget-object v2, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K1:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 144
    iget-object v0, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    iget-object v2, v1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K1:Ljava/lang/Runnable;

    const-wide/16 v3, 0x3e8

    invoke-virtual {v0, v2, v3, v4}, Landroid/view/ViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_f

    :catch_1
    move-exception v0

    .line 145
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_f
    return-void
.end method

.method public onChangeComment(Lcom/join/mgps/event/j;)V
    .locals 2
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/event/j;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/join/mgps/event/j;->getType()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/join/mgps/event/j;->getType()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->u0()V

    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    invoke-virtual {p1}, Lp1/f;->d()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->X:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->X:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m0()V

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->l0()V

    .line 4
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->e(Ljava/lang/Object;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S:Lcom/join/mgps/customview/o;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->W:Lcom/join/android/app/component/video/c;

    if-eqz v0, :cond_1

    .line 8
    invoke-virtual {v0}, Lcom/join/android/app/component/video/c;->G()V

    :cond_1
    return-void
.end method

.method public onEventMainThread(Lcom/join/mgps/event/n;)V
    .locals 11
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->changeDownloadTaskNumber(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result v1

    const/16 v2, 0x30

    const/4 v3, 0x7

    const/4 v4, 0x6

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/16 v8, 0x8

    if-eq v1, v7, :cond_5

    if-eq v1, v6, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-eq v1, v8, :cond_0

    if-eq v1, v2, :cond_3

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/16 v1, 0x9

    .line 4
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 5
    :pswitch_1
    invoke-virtual {p0, v0, v8}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 6
    :pswitch_2
    invoke-virtual {p0, v0, v3}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y:Ljava/util/Map;

    if-eqz v1, :cond_6

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    .line 8
    invoke-direct {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m1()V

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p0, v0, v6}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 10
    :cond_2
    invoke-virtual {p0, v0, v4}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 11
    :cond_3
    :pswitch_3
    invoke-virtual {p0, v0, v5}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 12
    :cond_4
    invoke-virtual {p0, v0, v7}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    :cond_5
    const/4 v1, 0x1

    .line 13
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 14
    :cond_6
    :goto_0
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result v1

    const-string v9, "%"

    if-ne v1, v8, :cond_8

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 17
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->s:Landroid/widget/ProgressBar;

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {p1, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 18
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->r:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_7
    return-void

    :cond_8
    if-eqz v0, :cond_f

    .line 19
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_f

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v10, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 20
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 21
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result p1

    if-eq p1, v7, :cond_e

    if-eq p1, v6, :cond_d

    if-eq p1, v5, :cond_b

    if-eq p1, v4, :cond_d

    if-eq p1, v3, :cond_d

    if-eq p1, v8, :cond_9

    const/16 v1, 0xa

    if-eq p1, v1, :cond_d

    const/16 v1, 0xb

    if-eq p1, v1, :cond_b

    const/16 v1, 0x1b

    if-eq p1, v1, :cond_d

    if-eq p1, v2, :cond_b

    goto :goto_1

    .line 22
    :cond_9
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_a

    .line 23
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 24
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->s:Landroid/widget/ProgressBar;

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {p1, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 25
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->r:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_a
    return-void

    .line 26
    :cond_b
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz p1, :cond_c

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 27
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 28
    :cond_c
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->i0()V

    goto :goto_1

    .line 29
    :cond_d
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->i0()V

    goto :goto_1

    .line 30
    :cond_e
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b1()V

    .line 31
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->i0()V

    .line 32
    :cond_f
    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->updateButn()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->W:Lcom/join/android/app/component/video/c;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/android/app/component/video/c;->H()V

    :cond_0
    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->T:Z

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K1:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->T:Z

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->W:Lcom/join/android/app/component/video/c;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/join/android/app/component/video/c;->I()V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->R:Lcom/wufan/user/service/protobuf/n0;

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->i0()V

    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 8
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    :cond_1
    if-nez v0, :cond_2

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v1, :cond_2

    .line 10
    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    :cond_2
    if-eqz v0, :cond_6

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_6

    .line 12
    :try_start_0
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 13
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/join/mgps/enums/Dtype;->android:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    const/4 v2, 0x5

    if-ne v1, v2, :cond_5

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v0

    .line 17
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 18
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_0

    .line 19
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_0

    .line 20
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_0

    .line 21
    :cond_5
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 22
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->updateButn()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_6
    :goto_1
    return-void
.end method

.method p0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goLoginInteractive(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_follow()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    .line 4
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->changeGameFollow(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method p1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.broadcast.bespeak.sussess"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->setGame_book(I)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N0()V

    return-void
.end method

.method progress_layout()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->updateButn()V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0}, Lcom/php25/PDownload/d;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_3

    .line 6
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->updateButn()V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0, v1}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    :cond_3
    :goto_0
    return-void
.end method

.method q0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->D1:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->noFavoriteTips()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/IntentUtil;->goLoginInteractive(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_2

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->E1:Lcom/join/mgps/customview/o;

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Lcom/join/mgps/customview/o;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    const v2, 0x7f110191

    invoke-direct {v0, v1, v2}, Lcom/join/mgps/customview/o;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->E1:Lcom/join/mgps/customview/o;

    const v1, 0x7f0c0232

    .line 5
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(I)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->E1:Lcom/join/mgps/customview/o;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->E1:Lcom/join/mgps/customview/o;

    const v1, 0x7f090f4c

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->E1:Lcom/join/mgps/customview/o;

    const v2, 0x7f090f6f

    invoke-virtual {v1, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    .line 9
    new-instance v2, Lcom/join/mgps/activity/GameDetialModleFourActivity$s;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity$s;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 10
    new-instance v1, Lcom/join/mgps/activity/GameDetialModleFourActivity$t;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity$t;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->E1:Lcom/join/mgps/customview/o;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->E1:Lcom/join/mgps/customview/o;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    goto :goto_0

    .line 13
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->p0()V

    :cond_2
    :goto_0
    return-void
.end method

.method r0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goLoginInteractive(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_follow()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->q0()V

    :cond_0
    return-void
.end method

.method relodingimag()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->A:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->t0()V

    return-void
.end method

.method public s0(Ljava/lang/String;II)Lcom/join/mgps/dto/RequestCommentpraiseArgs;
    .locals 9

    .line 1
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->R:Lcom/wufan/user/service/protobuf/n0;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->R:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    move v6, v0

    move-object v5, v1

    goto :goto_0

    :cond_0
    const-string v0, ""

    const/4 v1, 0x0

    move-object v5, v0

    const/4 v6, 0x0

    .line 5
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->D1:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->commentToken()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v2}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object v4, p1

    move v7, p2

    move v8, p3

    invoke-virtual/range {v0 .. v8}, Lcom/join/mgps/Util/RequestBeanUtil;->getPraiseComment(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)Lcom/join/mgps/dto/RequestCommentpraiseArgs;

    move-result-object p1

    return-object p1
.end method

.method setNetwork()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method showInstallButn()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->o:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->p:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 6
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    if-eqz v0, :cond_3

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_3
    :goto_0
    return-void
.end method

.method showLodingFailed()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->A:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->z:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->B:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_0

    .line 8
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->B:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_0
    return-void
.end method

.method showMain(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommentBaseBean;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G1:Ljava/util/List;

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_id()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->o1(Lcom/join/mgps/dto/GamedetialModleFourBean;Z)V

    :cond_0
    return-void
.end method

.method showProgress()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->p:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->o:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method t0()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Lcom/wufan/user/service/protobuf/n0;->f5()Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object v0

    check-cast v0, Lcom/wufan/user/service/protobuf/n0;

    .line 4
    :cond_0
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 5
    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 6
    new-instance v2, Lcom/join/mgps/dto/RequestGameIdArgs;

    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K:Ljava/lang/String;

    const/4 v4, 0x1

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    invoke-direct {v2, v3, v4, v0}, Lcom/join/mgps/dto/RequestGameIdArgs;-><init>(Ljava/lang/String;II)V

    .line 7
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 8
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object v0

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    invoke-interface {v0, v1}, Le2/i;->B1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object v0

    invoke-interface {v0}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ResponseModel;

    if-eqz v0, :cond_1

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_1

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 11
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->o1(Lcom/join/mgps/dto/GamedetialModleFourBean;Z)V

    return-void

    .line 12
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showLodingFailed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 14
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showLodingFailed()V

    goto :goto_0

    .line 15
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showLodingFailed()V

    :goto_0
    return-void
.end method

.method u0()V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2
    invoke-static {}, Lcom/join/mgps/rpc/impl/e;->m()Lcom/join/mgps/rpc/impl/e;

    move-result-object v0

    .line 3
    new-instance v1, Lcom/join/mgps/dto/CommentAllListBean;

    invoke-direct {v1}, Lcom/join/mgps/dto/CommentAllListBean;-><init>()V

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v1}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K:Ljava/lang/String;

    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->D1:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->commentToken()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v3

    invoke-virtual {v3}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->R:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v5}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/join/mgps/Util/RequestBeanUtil;->getGamedetialCommentRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/GamedetialCommentRequest;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/join/mgps/rpc/f;->g(Lcom/join/mgps/dto/GamedetialCommentRequest;)Lcom/join/mgps/dto/CommentResponse;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getData_info()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommentAllListBean;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentAllListBean;->getSelf_comment()Lcom/join/mgps/dto/CommentAllListBean$SelfCommentBean;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->J1:Lcom/join/mgps/dto/CommentAllListBean$SelfCommentBean;

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentAllListBean;->getGame_comment_count()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->H1:Ljava/lang/String;

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentAllListBean;->getGame_score()Lcom/join/mgps/dto/GameScore;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->I1:Lcom/join/mgps/dto/GameScore;

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v1}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->getModleFourFragment()Lcom/join/mgps/activity/gamedetail/BaseGameDetailFragment;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->H1:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/gamedetail/BaseGameDetailFragment;->setCommentNumber(Ljava/lang/String;)V

    :cond_0
    if-eqz v0, :cond_2

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentAllListBean;->getHot_comment()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentAllListBean;->getHot_comment()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ltz v1, :cond_2

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentAllListBean;->getHot_comment()Ljava/util/List;

    move-result-object v0

    .line 12
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CommentAllListBean$HotCommentBean;

    .line 14
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showMain(Ljava/util/List;)V

    goto :goto_1

    .line 16
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showMain(Ljava/util/List;)V

    goto :goto_1

    .line 17
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showMain(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showMain(Ljava/util/List;)V

    :cond_4
    :goto_1
    return-void
.end method

.method updateButn()V
    .locals 11
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v0, :cond_19

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_19

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->p:Landroid/widget/RelativeLayout;

    if-nez v1, :cond_0

    goto/16 :goto_6

    .line 2
    :cond_0
    iget-boolean v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->v1:Z

    const-string v2, "\u5b89\u88c5"

    const/16 v3, 0xb

    if-eqz v1, :cond_2

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isSingleGame()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-ne v0, v3, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    const-string v1, "\u6253\u5f00"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void

    .line 6
    :cond_2
    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->p:Landroid/widget/RelativeLayout;

    iget-object v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1, v4}, Lcom/join/mgps/Util/UtilsMy;->j3(Lcom/join/mgps/dto/TipNew;Landroid/view/View;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0803ac

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v5}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    const-string v1, "\u5f00\u59cb"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showInstallButn()V

    return-void

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    .line 13
    :goto_1
    iget-object v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v4

    iget-object v5, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v4

    const/16 v5, 0x2b

    if-lez v4, :cond_5

    const/16 v0, 0x2b

    :cond_5
    const/16 v4, 0x9

    const v6, 0x7f0803ab

    const v7, 0x7f080388

    if-ne v0, v4, :cond_6

    .line 14
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showInstallButn()V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    const-string v1, "\u66f4\u65b0"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->q:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->q:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_6

    :cond_6
    const/16 v4, 0xc

    if-ne v0, v4, :cond_7

    .line 18
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showInstallButn()V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    const-string v1, "\u89e3\u538b\u4e2d.."

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    :cond_7
    const/16 v4, 0xd

    if-ne v0, v4, :cond_8

    .line 20
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showInstallButn()V

    .line 21
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    const-string v1, "\u89e3\u538b"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->q:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_6

    :cond_8
    if-ne v0, v3, :cond_9

    .line 23
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showInstallButn()V

    .line 24
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 26
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->q:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_6

    :cond_9
    const/4 v2, 0x5

    const/4 v3, 0x1

    if-eq v0, v2, :cond_18

    const/16 v2, 0x2a

    if-ne v0, v2, :cond_a

    goto/16 :goto_5

    :cond_a
    const-string v2, "%"

    const/4 v4, 0x2

    if-ne v0, v4, :cond_b

    .line 27
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showProgress()V

    .line 28
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->q:Landroid/widget/ImageView;

    const v1, 0x7f080389

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 29
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 30
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->s:Landroid/widget/ProgressBar;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v3

    long-to-int v1, v3

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 31
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->r:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    :cond_b
    const/4 v6, 0x3

    if-eq v0, v6, :cond_17

    const/4 v6, 0x6

    if-eq v0, v6, :cond_17

    const/16 v6, 0x1b

    if-ne v0, v6, :cond_c

    goto/16 :goto_4

    :cond_c
    const/16 v2, 0xa

    if-ne v0, v2, :cond_d

    .line 32
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showInstallButn()V

    .line 33
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u7b49\u5f85\u3000"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getSize()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "M"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->q:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_6

    :cond_d
    if-ne v0, v3, :cond_e

    goto/16 :goto_6

    :cond_e
    const-string v2, "\u5df2\u9884\u7ea6"

    const-string v6, "\u9884\u7ea6"

    const v8, 0x7f100305

    const v9, 0x7f1000f6

    if-ne v0, v5, :cond_12

    .line 35
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showInstallButn()V

    .line 36
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    iget-object v5, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_f

    .line 37
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    iget-object v5, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v5}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    new-array v9, v3, [Ljava/lang/Object;

    iget-object v10, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v10}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v10

    invoke-virtual {v10}, Lcom/join/mgps/dto/PayTagInfo;->getPayGameAmount()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v1

    invoke-virtual {v5, v8, v9}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 38
    :cond_f
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    :goto_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->q:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 40
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v0, :cond_19

    .line 41
    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBespeak_switch()I

    move-result v0

    if-ne v0, v3, :cond_11

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v0

    if-ne v0, v4, :cond_11

    .line 42
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_book()I

    move-result v0

    if-ne v0, v3, :cond_10

    .line 43
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 45
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->n3(Landroid/widget/TextView;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    goto/16 :goto_6

    .line 46
    :cond_10
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    .line 47
    :cond_11
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 48
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->n3(Landroid/widget/TextView;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    goto/16 :goto_6

    :cond_12
    const/16 v5, 0x30

    if-ne v0, v5, :cond_13

    .line 49
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showInstallButn()V

    .line 50
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f1000f9

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    .line 51
    :cond_13
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showInstallButn()V

    .line 52
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    iget-object v5, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_14

    .line 53
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    iget-object v5, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v5}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    new-array v9, v3, [Ljava/lang/Object;

    iget-object v10, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v10}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v10

    invoke-virtual {v10}, Lcom/join/mgps/dto/PayTagInfo;->getPayGameAmount()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v1

    invoke-virtual {v5, v8, v9}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 54
    :cond_14
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    :goto_3
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->q:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 56
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v0, :cond_19

    .line 57
    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBespeak_switch()I

    move-result v0

    if-ne v0, v3, :cond_16

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v0

    if-ne v0, v4, :cond_16

    .line 58
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_book()I

    move-result v0

    if-ne v0, v3, :cond_15

    .line 59
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 61
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->n3(Landroid/widget/TextView;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    goto :goto_6

    .line 62
    :cond_15
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_6

    .line 63
    :cond_16
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 64
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->n3(Landroid/widget/TextView;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    goto :goto_6

    .line 65
    :cond_17
    :goto_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showProgress()V

    .line 66
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->q:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 67
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 68
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->s:Landroid/widget/ProgressBar;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v3

    long-to-int v1, v3

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 69
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->r:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->G:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_6

    .line 70
    :cond_18
    :goto_5
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showInstallButn()V

    .line 71
    invoke-virtual {p0, v3}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->l1(Z)V

    .line 72
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    const v1, 0x7f0803ae

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 73
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f1000f7

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->q:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_19
    :goto_6
    return-void
.end method

.method updateDownloadView()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->M1:Ljava/util/Map;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N1:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->V1:Lcom/join/mgps/customview/CustomerDownloadView;

    invoke-virtual {v2, v1}, Lcom/join/mgps/customview/CustomerDownloadView;->setDownloadGameNum(I)V

    if-lez v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->V1:Lcom/join/mgps/customview/CustomerDownloadView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/CustomerDownloadView;->d()V

    goto :goto_1

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->V1:Lcom/join/mgps/customview/CustomerDownloadView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/CustomerDownloadView;->g()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method updateTitleButn(Lcom/join/mgps/dto/ResultMainBean;I)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResultMainBean;->getFlag()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_5

    const/4 p1, 0x0

    if-eq p2, v0, :cond_4

    const/4 v1, 0x2

    if-eq p2, v1, :cond_2

    const/4 v1, 0x3

    if-eq p2, v1, :cond_1

    const/4 p1, 0x4

    if-eq p2, p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->setGame_book(I)V

    .line 3
    new-instance p1, Landroid/content/Intent;

    const-string p2, "com.broadcast.bespeak.sussess"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 4
    iget-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object p2

    const-string v1, "gameid"

    invoke-virtual {p1, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5
    iget-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {p2, p1}, Landroid/app/Activity;->sendBroadcast(Landroid/content/Intent;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {p1}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    new-instance v1, Lcom/join/mgps/activity/GameDetialModleFourActivity$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity$e;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V

    invoke-virtual {p1, p2, v0, v1}, Lcom/join/mgps/Util/a0;->O(Landroid/content/Context;ILw1/c;)Lcom/join/mgps/customview/o;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    goto :goto_0

    .line 8
    :cond_1
    iget-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p2, p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->setGame_book(I)V

    goto :goto_0

    .line 9
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->setGame_follow(I)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->i:Landroid/widget/ImageView;

    if-nez p1, :cond_3

    return-void

    .line 11
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string p2, "\u6536\u85cf\u6210\u529f"

    invoke-virtual {p1, p2}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->i:Landroid/widget/ImageView;

    const p2, 0x7f08049e

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 13
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->j:Landroid/widget/TextView;

    const-string p2, "\u5df2\u6536\u85cf"

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 14
    :cond_4
    iget-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p2, p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->setGame_follow(I)V

    .line 15
    :goto_0
    invoke-direct {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->N0()V

    .line 16
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->updateButn()V

    :cond_5
    return-void
.end method

.method v0(Lcom/join/mgps/dto/GiftPackageDataInfoBean;)V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    const-string v1, "\u9886\u53d6\u5931\u8d25"

    if-eqz v0, :cond_6

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->R:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {p1}, Lcom/join/mgps/dto/GiftPackageDataInfoBean;->getGift_package_id()I

    move-result v3

    iget-object v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K:Ljava/lang/String;

    invoke-virtual {v0, v2, v3, v4}, Lcom/join/mgps/Util/RequestBeanUtil;->getGiftPackageOperationRequestBean(IILjava/lang/String;)Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object v0

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->H:Lcom/join/mgps/rpc/e;

    invoke-interface {v2, v0}, Lcom/join/mgps/rpc/e;->f0(Lcom/join/mgps/dto/CommonRequestBean;)Lcom/join/mgps/dto/GiftPackageOperationBean;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_5

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/GiftPackageOperationBean;->getFlag()Ljava/lang/String;

    move-result-object v2

    const-string v3, "0"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/GiftPackageOperationBean;->getError_info()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/GiftPackageOperationBean;->getCode()Ljava/lang/String;

    move-result-object v0

    const-string v1, "1001"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showToast(Ljava/lang/String;)V

    :cond_0
    return-void

    .line 8
    :cond_1
    invoke-virtual {v0}, Lcom/join/mgps/dto/GiftPackageOperationBean;->getMessages()Lcom/join/mgps/dto/GiftPackageOperationMessageBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GiftPackageOperationMessageBean;->getData()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_4

    const/4 v1, 0x0

    .line 10
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GiftPackageDataOperationBean;

    .line 11
    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_gift_package()Ljava/util/List;

    move-result-object v2

    .line 12
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_3

    .line 13
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/GiftPackageDataInfoBean;

    .line 14
    invoke-virtual {p1}, Lcom/join/mgps/dto/GiftPackageDataInfoBean;->getGift_package_id()I

    move-result v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/GiftPackageDataInfoBean;->getGift_package_id()I

    move-result v5

    if-ne v4, v5, :cond_2

    const/4 v4, 0x1

    .line 15
    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/GiftPackageDataInfoBean;->setGift_package_status(I)V

    .line 16
    invoke-virtual {v0}, Lcom/join/mgps/dto/GiftPackageDataOperationBean;->getGift_info()Lcom/join/mgps/dto/GiftPackageDataInfoBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GiftPackageDataInfoBean;->getGift_package_overdue()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/GiftPackageDataInfoBean;->setGift_package_overdue(I)V

    .line 17
    invoke-virtual {v0}, Lcom/join/mgps/dto/GiftPackageDataOperationBean;->getGift_info()Lcom/join/mgps/dto/GiftPackageDataInfoBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GiftPackageDataInfoBean;->getGift_package_code()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/GiftPackageDataInfoBean;->setGift_package_code(Ljava/lang/String;)V

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 18
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1, v2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->setGame_gift_package(Ljava/util/List;)V

    .line 19
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->X0(Lcom/join/mgps/dto/GiftPackageDataOperationBean;)V

    goto :goto_2

    .line 20
    :cond_4
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showToast(Ljava/lang/String;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 21
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    :cond_5
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showToast(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showToast(Ljava/lang/String;)V

    .line 23
    throw p1

    .line 24
    :cond_6
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showToast(Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method public w0()Lcom/join/mgps/dto/CommonRequestBean;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->R:Lcom/wufan/user/service/protobuf/n0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 3
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x5

    iget-object v6, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K:Ljava/lang/String;

    const/4 v0, 0x1

    new-array v7, v0, [I

    aput v0, v7, v1

    invoke-virtual/range {v2 .. v7}, Lcom/join/mgps/Util/RequestBeanUtil;->getGameCommentListRequestBean(IIILjava/lang/String;[I)Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object v0

    return-object v0
.end method

.method x0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v1}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v0, v2}, Lcom/join/mgps/Util/RequestBeanUtil;->getTokenRequestBean(Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/CommentRequest;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->J:Lcom/join/mgps/rpc/f;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/f;->c(Lcom/join/mgps/dto/CommentRequest;)Lcom/join/mgps/dto/CommentResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getCode()I

    move-result v1

    if-nez v1, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getData_info()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getData_info()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CommentTokenBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CommentTokenBean;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getData_info()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CommentTokenBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommentTokenBean;->getToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getData_info()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommentTokenBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentTokenBean;->getTimes()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AESUtils;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->D1:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->commentToken()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->D1:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->lastCheckInTime()Lorg/androidannotations/api/sharedpreferences/k;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method y0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L:Lcom/join/mgps/dto/ExtBean;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->L:Lcom/join/mgps/dto/ExtBean;

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v0

    const-string v1, "updateFromMarket"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goMGMainActivity2Front(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method z0()V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Lcom/wufan/user/service/protobuf/n0;->f5()Lcom/wufan/user/service/protobuf/n0$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object v0

    check-cast v0, Lcom/wufan/user/service/protobuf/n0;

    .line 4
    :cond_0
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 5
    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->b:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 6
    new-instance v2, Lcom/join/mgps/dto/RequestGameIdArgs;

    iget-object v3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->K:Ljava/lang/String;

    iget v4, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->C1:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->C1:I

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    invoke-direct {v2, v3, v4, v0}, Lcom/join/mgps/dto/RequestGameIdArgs;-><init>(Ljava/lang/String;II)V

    .line 7
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0}, Lp1/f;->A()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/join/mgps/dto/RequestGameIdArgs;->setDownloadedGameIdList(Ljava/util/List;)V

    .line 8
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 9
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object v0

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    invoke-interface {v0, v1}, Le2/i;->s(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object v0

    invoke-interface {v0}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ResponseModel;

    if-eqz v0, :cond_1

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_1

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 12
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->j1(Ljava/util/List;)V

    return-void

    .line 13
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showLodingFailed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 15
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showLodingFailed()V

    goto :goto_0

    .line 16
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showLodingFailed()V

    :goto_0
    return-void
.end method
