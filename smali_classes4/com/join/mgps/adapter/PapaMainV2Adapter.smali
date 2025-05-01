.class public Lcom/join/mgps/adapter/PapaMainV2Adapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "PapaMainV2Adapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/adapter/PapaMainV2Adapter$HomeRankingViewpagerAdapter;,
        Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;,
        Lcom/join/mgps/adapter/PapaMainV2Adapter$n;,
        Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;,
        Lcom/join/mgps/adapter/PapaMainV2Adapter$l;,
        Lcom/join/mgps/adapter/PapaMainV2Adapter$j;,
        Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;,
        Lcom/join/mgps/adapter/PapaMainV2Adapter$m;,
        Lcom/join/mgps/adapter/PapaMainV2Adapter$k;,
        Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;,
        Lcom/join/mgps/adapter/PapaMainV2Adapter$i;,
        Lcom/join/mgps/adapter/PapaMainV2Adapter$o;,
        Lcom/join/mgps/adapter/PapaMainV2Adapter$h;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">;"
    }
.end annotation


# static fields
.field public static final A:I = 0x10

.field public static final B:I = 0x12

.field public static final C:I = 0x13

.field public static final D:I = 0x14

.field public static final E:I = 0x15

.field public static final F:I = 0x16

.field public static final G:I = 0x17

.field public static final H:I = 0x18

.field public static final I:I = 0x19

.field public static final J:I = 0x1a

.field public static final K:I = 0x1b

.field public static final L:I = 0x1c

.field public static final M:I = 0x1d

.field public static final N:I = 0x1e

.field public static final O:I = 0x1f

.field public static final P:I = 0x20

.field public static final Q:I = 0x21

.field public static final R:I = 0x22

.field public static final S:I = 0x23

.field public static final T:I = 0x24

.field public static final U:I = 0x25

.field public static final V:I = 0x26

.field public static final W:I = 0x27

.field public static final X:I = 0x28

.field public static final k:I = 0x0

.field public static final l:I = 0x1

.field public static final m:I = 0x2

.field public static final n:I = 0x3

.field public static final o:I = 0x4

.field public static final p:I = 0x5

.field public static final q:I = 0x6

.field public static final r:I = 0x7

.field public static final s:I = 0x8

.field public static final t:I = 0x9

.field public static final u:I = 0xa

.field public static final v:I = 0xb

.field public static final w:I = 0xc

.field public static final x:I = 0xd

.field public static final y:I = 0xe

.field public static final z:I = 0xf


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/MgpapaMainItemBean;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/content/Context;

.field private c:Landroidx/fragment/app/Fragment;

.field private d:Lc2/f;

.field private e:Lcom/join/android/app/component/video/g;

.field f:Lcom/join/mgps/customview/NavigationAdapter;

.field private g:I

.field private h:I

.field private i:Z

.field private j:Lcom/join/mgps/adapter/PapaMainV2Adapter$h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/fragment/app/Fragment;Ljava/util/List;Lcom/join/android/app/component/video/g;Lc2/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/fragment/app/Fragment;",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/MgpapaMainItemBean;",
            ">;",
            "Lcom/join/android/app/component/video/g;",
            "Lc2/f;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->j:Lcom/join/mgps/adapter/PapaMainV2Adapter$h;

    .line 3
    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    .line 4
    iput-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->c:Landroidx/fragment/app/Fragment;

    .line 5
    iput-object p4, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->e:Lcom/join/android/app/component/video/g;

    .line 6
    iput-object p5, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->d:Lc2/f;

    if-nez p3, :cond_0

    .line 7
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    iput-object p3, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->a:Ljava/util/List;

    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f07106c

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p2

    float-to-int p2, p2

    iput p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->g:I

    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f0711f4

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->h:I

    const/4 p1, 0x1

    .line 10
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->setHasStableIds(Z)V

    return-void
.end method

.method private synthetic A(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->S(Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->O(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Z)V

    return-void
.end method

.method private synthetic B(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-virtual {p2, v0, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    const/4 p1, 0x0

    .line 3
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->S(Ljava/lang/String;)V

    const-string p1, "3-2"

    .line 4
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->N(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic C(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;ILandroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object p4

    const/4 v0, 0x1

    if-eqz p4, :cond_0

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object p4

    invoke-virtual {p4}, Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;->getLink_type()Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    if-eq p4, v0, :cond_0

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object p3, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p4

    invoke-virtual {p2, p3, p4}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->S(Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->O(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Z)V

    .line 5
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->Q(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    goto :goto_2

    .line 6
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getGameBean()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object p4

    const/4 v1, 0x0

    if-nez p4, :cond_1

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p4

    if-nez p4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setRequesting(Z)V

    .line 7
    iget-object p4, p2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->n:Landroid/widget/ProgressBar;

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->isRequesting()Z

    move-result v0

    const/4 v2, 0x4

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    const/4 v0, 0x4

    :goto_1
    invoke-virtual {p4, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 8
    iget-object p2, p2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->k:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->isRequesting()Z

    move-result p4

    if-eqz p4, :cond_3

    const/4 v1, 0x4

    :cond_3
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->j:Lcom/join/mgps/adapter/PapaMainV2Adapter$h;

    if-eqz p2, :cond_4

    invoke-interface {p2, p3, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter$h;->a(ILcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    :cond_4
    :goto_2
    return-void
.end method

.method private synthetic D(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->S(Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->O(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Z)V

    return-void
.end method

.method private synthetic E(Ljava/util/List;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;

    .line 2
    new-instance p2, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {p2}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 p3, 0x1

    .line 3
    invoke-virtual {p2, p3}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->getId()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/join/mgps/Util/IntentDateBean;->setCrc_link_type_val(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object p3

    if-nez p3, :cond_0

    .line 6
    new-instance p3, Lcom/join/mgps/dto/ExtBean;

    invoke-direct {p3}, Lcom/join/mgps/dto/ExtBean;-><init>()V

    invoke-virtual {p2, p3}, Lcom/join/mgps/Util/IntentDateBean;->setExtBean(Lcom/join/mgps/dto/ExtBean;)V

    .line 7
    :cond_0
    invoke-virtual {p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object p3

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->get_from()I

    move-result p4

    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/join/mgps/dto/ExtBean;->setFrom(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p2}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object p3

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->get_from_type()I

    move-result p4

    invoke-virtual {p3, p4}, Lcom/join/mgps/dto/ExtBean;->set_from_type(I)Lcom/join/mgps/dto/ExtBean;

    .line 9
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p3

    iget-object p4, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-virtual {p3, p4, p2}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->getPosition()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->S(Ljava/lang/String;)V

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->getPosition()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->P(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic F(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object p1

    new-instance v0, Lcom/join/kotlin/ui/findgame/data/IntentClassfyEvent;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/join/kotlin/ui/findgame/data/IntentClassfyEvent;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/d0;->c(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->S(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic G(Ljava/util/List;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object p3, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v0

    invoke-virtual {p2, p3, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 2
    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->S(Ljava/lang/String;)V

    .line 3
    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->O(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Z)V

    return-void
.end method

.method private synthetic H(Ljava/util/List;ILcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 2

    .line 1
    invoke-interface {p1, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    .line 2
    invoke-virtual {p3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;->getLink_type()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object p3, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-interface {p1, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-virtual {p4}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p4

    invoke-virtual {p2, p3, p4}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 4
    invoke-interface {p1, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->S(Ljava/lang/String;)V

    .line 5
    invoke-interface {p1, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-direct {p0, p1, v1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->O(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Z)V

    goto :goto_3

    .line 6
    :cond_0
    invoke-virtual {p3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getGameBean()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object p1

    const/4 p5, 0x0

    if-nez p1, :cond_1

    invoke-virtual {p3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p3, v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setRequesting(Z)V

    const p1, 0x7f090d5b

    .line 7
    :try_start_0
    invoke-virtual {p4, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    const v0, 0x7f0914f9

    .line 8
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/TextView;

    .line 9
    invoke-virtual {p3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->isRequesting()Z

    move-result v0

    const/4 v1, 0x4

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    const/4 v0, 0x4

    :goto_1
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 10
    invoke-virtual {p3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->isRequesting()Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p5, 0x4

    :cond_3
    invoke-virtual {p4, p5}, Landroid/widget/TextView;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 12
    :goto_2
    iget-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->j:Lcom/join/mgps/adapter/PapaMainV2Adapter$h;

    if-eqz p1, :cond_4

    .line 13
    invoke-interface {p1, p2, p3}, Lcom/join/mgps/adapter/PapaMainV2Adapter$h;->a(ILcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    :cond_4
    :goto_3
    return-void
.end method

.method private synthetic I(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->S(Ljava/lang/String;)V

    const/4 p2, 0x1

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->O(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Z)V

    .line 4
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->Q(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    return-void
.end method

.method private synthetic J(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->Q(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->S(Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->O(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Z)V

    return-void
.end method

.method private synthetic K(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;ILandroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object p4

    const/4 v0, 0x1

    if-eqz p4, :cond_0

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object p4

    invoke-virtual {p4}, Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;->getLink_type()Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    if-eq p4, v0, :cond_0

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object p3, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p4

    invoke-virtual {p2, p3, p4}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 3
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->Q(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->S(Ljava/lang/String;)V

    .line 5
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->O(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Z)V

    goto :goto_2

    .line 6
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getGameBean()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object p4

    const/4 v1, 0x0

    if-nez p4, :cond_1

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p4

    if-nez p4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setRequesting(Z)V

    .line 7
    iget-object p4, p2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->l:Landroid/widget/ProgressBar;

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->isRequesting()Z

    move-result v0

    const/4 v2, 0x4

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    const/4 v0, 0x4

    :goto_1
    invoke-virtual {p4, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 8
    iget-object p2, p2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->k:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->isRequesting()Z

    move-result p4

    if-eqz p4, :cond_3

    const/4 v1, 0x4

    :cond_3
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->j:Lcom/join/mgps/adapter/PapaMainV2Adapter$h;

    if-eqz p2, :cond_4

    invoke-interface {p2, p3, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter$h;->a(ILcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    :cond_4
    :goto_2
    return-void
.end method

.method private L(Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;",
            ">;",
            "Landroidx/recyclerview/widget/RecyclerView;",
            ")V"
        }
    .end annotation

    if-eqz p2, :cond_3

    if-nez p1, :cond_0

    goto :goto_2

    .line 1
    :cond_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-nez p2, :cond_1

    return-void

    .line 2
    :cond_1
    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result p2

    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-gt v0, v1, :cond_3

    .line 4
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->isHasExposure()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 5
    :cond_2
    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v3, "home"

    .line 6
    invoke-virtual {v1, v3}, Lcom/papa/sim/statistic/Ext;->setPage(Ljava/lang/String;)V

    const-string v3, "204"

    .line 7
    invoke-virtual {v1, v3}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;

    invoke-virtual {v3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 9
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;

    invoke-virtual {v3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->getPosition()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 10
    iget-object v3, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {v3}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v3

    sget-object v4, Lcom/papa/sim/statistic/Event;->expGameAdPage:Lcom/papa/sim/statistic/Event;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;

    invoke-virtual {v5}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v1, v5}, Lcom/papa/sim/statistic/p;->k0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Ljava/lang/String;)V

    .line 11
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->setHasExposure(Z)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method private M(Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;",
            ">;",
            "Landroidx/recyclerview/widget/RecyclerView;",
            ")V"
        }
    .end annotation

    if-eqz p2, :cond_3

    if-nez p1, :cond_0

    goto :goto_2

    .line 1
    :cond_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-nez p2, :cond_1

    return-void

    .line 2
    :cond_1
    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result p2

    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-gt v0, v1, :cond_3

    .line 4
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->isHasExposure()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 5
    :cond_2
    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v3, "home"

    .line 6
    invoke-virtual {v1, v3}, Lcom/papa/sim/statistic/Ext;->setPage(Ljava/lang/String;)V

    const-string v3, "206"

    .line 7
    invoke-virtual {v1, v3}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-direct {p0, v3}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->w(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 9
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-virtual {v3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 10
    iget-object v3, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {v3}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v3

    sget-object v4, Lcom/papa/sim/statistic/Event;->expGameAdPage:Lcom/papa/sim/statistic/Event;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-direct {p0, v5}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->w(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v1, v5}, Lcom/papa/sim/statistic/p;->k0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Ljava/lang/String;)V

    .line 11
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setHasExposure(Z)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method private N(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/ExtFrom;->home:Lcom/papa/sim/statistic/ExtFrom;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "22-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Lcom/papa/sim/statistic/p;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private O(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Z)V
    .locals 8

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->x(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    .line 2
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    sget-object v0, Lcom/papa/sim/statistic/ExtFrom;->home:Lcom/papa/sim/statistic/ExtFrom;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;->getLink_type_val()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    move-object v5, v0

    if-eqz p2, :cond_1

    const-string p2, "1"

    goto :goto_1

    :cond_1
    const-string p2, "2"

    :goto_1
    move-object v6, p2

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v1 .. v7}, Lcom/papa/sim/statistic/p;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 3
    :cond_2
    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object v0, Lcom/papa/sim/statistic/ExtFrom;->home:Lcom/papa/sim/statistic/ExtFrom;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, p1, v1}, Lcom/papa/sim/statistic/p;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method private P(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/ExtFrom;->home:Lcom/papa/sim/statistic/ExtFrom;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Lcom/papa/sim/statistic/p;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private Q(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 13

    if-eqz p1, :cond_6

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getPosition_path()Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    .line 3
    array-length v2, v0

    const/4 v3, 0x2

    if-le v2, v3, :cond_4

    const/4 v2, 0x0

    .line 4
    aget-object v2, v0, v2

    const-string v4, "22"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    return-void

    :cond_1
    const/4 v2, 0x1

    .line 5
    aget-object v4, v0, v2

    const-string v5, "4"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v1, "\u5927\u5bb6\u90fd\u5728\u73a9"

    goto :goto_0

    .line 6
    :cond_2
    aget-object v2, v0, v2

    const-string v4, "13"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v1, "\u6700\u65b0\u7f51\u6e38"

    .line 7
    :cond_3
    :goto_0
    aget-object v0, v0, v3

    goto :goto_1

    :cond_4
    const-string v0, "0"

    :goto_1
    move-object v6, v0

    move-object v5, v1

    .line 8
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    return-void

    .line 9
    :cond_5
    sget-object v0, Lcom/psk/eventmodule/StatFactory;->Companion:Lcom/psk/eventmodule/StatFactory$Companion;

    iget-object v1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/psk/eventmodule/StatFactory$Companion;->getInstance(Landroid/content/Context;)Lcom/psk/eventmodule/StatFactory;

    move-result-object v0

    new-instance v1, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;

    sget-object v8, Lcom/psk/eventmodule/Event;->click:Lcom/psk/eventmodule/Event;

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getId()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lcom/psk/eventmodule/StatFactory$SpmData;

    const/4 v7, 0x0

    const-string v3, "wufun"

    const-string v4, "home"

    move-object v2, v10

    invoke-direct/range {v2 .. v7}, Lcom/psk/eventmodule/StatFactory$SpmData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getPosition_path()Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    move-result-object v11

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getTag_id()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->l2(Ljava/util/List;)Z

    move-result v12

    move-object v7, v1

    invoke-direct/range {v7 .. v12}, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;-><init>(Lcom/psk/eventmodule/Event;Ljava/lang/String;Lcom/psk/eventmodule/StatFactory$SpmData;Lcom/psk/eventmodule/StatFactory$VolcanoOther;Z)V

    .line 12
    invoke-virtual {v0, v1}, Lcom/psk/eventmodule/StatFactory;->sendEvent(Lcom/psk/eventmodule/StatFactory$VolcanoEvent;)V

    :cond_6
    :goto_2
    return-void
.end method

.method private S(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->c:Landroidx/fragment/app/Fragment;

    instance-of v1, v0, Lcom/join/mgps/activity/PapaMainV3Fragment;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->S1(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private U(Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Ljava/lang/String;I)V
    .locals 11

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "0"

    .line 1
    invoke-static {p3, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    .line 2
    iget-object p3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    iget v1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->h:I

    iget v2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->g:I

    invoke-virtual {p3, v1, v0, v2, v0}, Landroid/view/ViewGroup;->setPadding(IIII)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object p3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    iget v1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->g:I

    iget v2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->h:I

    invoke-virtual {p3, v1, v0, v2, v0}, Landroid/view/ViewGroup;->setPadding(IIII)V

    .line 4
    :goto_0
    iget-object p3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getBig_pic()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/facebook/drawee/drawable/r$c;->g:Lcom/facebook/drawee/drawable/r$c;

    invoke-static {p3, v1, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->i(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;Lcom/facebook/drawee/drawable/r$c;)V

    .line 5
    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object p3

    .line 6
    iget-object v1, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->c:Landroid/widget/TextView;

    if-nez p3, :cond_2

    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getTitle()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    invoke-virtual {p3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getName()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object v1, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->k:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    iget-object v1, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->l:Landroid/widget/ProgressBar;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    const/4 v1, 0x1

    if-eqz p3, :cond_5

    .line 9
    invoke-virtual {p3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getTag_name()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    invoke-virtual {p3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getTag_name()Ljava/lang/String;

    move-result-object p3

    const-string v3, ","

    invoke-virtual {p3, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p3

    const/4 v3, 0x0

    .line 12
    :goto_2
    array-length v4, p3

    if-ge v3, v4, :cond_4

    .line 13
    aget-object v4, p3, v3

    .line 14
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " | "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-lt v3, v1, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 15
    :cond_4
    :goto_3
    iget-object p3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->i:Landroid/widget/TextView;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x3

    invoke-virtual {v2, v0, v3}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    :cond_5
    iget-object p3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    new-instance v2, Lcom/join/mgps/adapter/x3;

    invoke-direct {v2, p0, p2}, Lcom/join/mgps/adapter/x3;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    invoke-virtual {p3, v2}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    iget-object p3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->j:Landroid/widget/FrameLayout;

    new-instance v2, Lcom/join/mgps/adapter/d4;

    invoke-direct {v2, p0, p2, p1, p4}, Lcom/join/mgps/adapter/d4;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;I)V

    invoke-virtual {p3, v2}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    iget-object p3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->m:Lcom/join/android/app/component/video/MultiStandVideo;

    if-eqz p3, :cond_7

    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getV_url()Ljava/lang/String;

    move-result-object p3

    iget-object p4, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->m:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {p4}, Lcom/join/android/app/component/video/MultiStandVideo;->getUrl()Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object p3

    if-eqz p3, :cond_7

    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object p3

    invoke-virtual {p3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;->getLink_type()Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    if-eq p3, v1, :cond_7

    .line 19
    :cond_6
    iget-object p3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->m:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getBig_pic()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/join/android/app/component/video/MultiStandVideo;->g(Ljava/lang/String;)V

    .line 20
    iget-object p3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->m:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getTitle()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/join/android/app/component/video/MultiStandVideo;->setName(Ljava/lang/String;)V

    .line 21
    iget-object p3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->m:Lcom/join/android/app/component/video/MultiStandVideo;

    iget-object p4, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->e:Lcom/join/android/app/component/video/g;

    invoke-virtual {p4}, Lcom/join/android/app/component/video/g;->p()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setPlayTag(Ljava/lang/String;)V

    .line 22
    iget-object p3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->m:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->hashCode()I

    move-result p4

    invoke-virtual {p3, p4}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setPlayPosition(I)V

    .line 23
    iget-object v2, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->m:Lcom/join/android/app/component/video/MultiStandVideo;

    .line 24
    invoke-virtual {p2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getV_url()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, ""

    .line 25
    invoke-virtual/range {v2 .. v7}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setUpLazy(Ljava/lang/String;ZLjava/io/File;Ljava/util/Map;Ljava/lang/String;)Z

    .line 26
    iget-object p3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->m:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {p3, v0}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setRotateViewAuto(Z)V

    .line 27
    iget-object p3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->m:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {p3, v1}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setLockLand(Z)V

    .line 28
    iget-object p3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->m:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {p3, v0}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setReleaseWhenLossAudio(Z)V

    .line 29
    iget-object p3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->m:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {p3, v0}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setShowFullAnimation(Z)V

    .line 30
    iget-object p3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->m:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {p3, v0}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setIsTouchWiget(Z)V

    .line 31
    iget-object p3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->m:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {p3, v0}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setNeedLockFull(Z)V

    .line 32
    iget-object p3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->m:Lcom/join/android/app/component/video/MultiStandVideo;

    const/4 p4, 0x0

    invoke-virtual {p3, p4}, Lcom/papa/gsyvideoplayer/video/StandardGSYVideoPlayer;->setBottomProgressBarDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 33
    iget-object p3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->m:Lcom/join/android/app/component/video/MultiStandVideo;

    new-instance p4, Lcom/join/mgps/adapter/PapaMainV2Adapter$g;

    invoke-direct {p4, p0, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter$g;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    invoke-virtual {p3, p4}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setVideoAllCallBack(Ls2/h;)V

    .line 34
    :cond_7
    iget-object v2, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->c:Landroid/widget/TextView;

    iget-object v3, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->i:Landroid/widget/TextView;

    iget-object v4, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->j:Landroid/widget/FrameLayout;

    iget-object v5, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->k:Landroid/widget/TextView;

    iget-object v6, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->d:Landroid/widget/LinearLayout;

    iget-object v7, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->e:Landroid/widget/TextView;

    iget-object v8, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->f:Landroid/widget/TextView;

    iget-object v9, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->g:Landroid/widget/ProgressBar;

    iget-object v10, p1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;->h:Landroid/widget/ProgressBar;

    move-object v0, p0

    move-object v1, p2

    invoke-direct/range {v0 .. v10}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->update(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;)V

    return-void
.end method

.method private V(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p5, :cond_0

    .line 1
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2
    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    invoke-virtual {p3, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 4
    invoke-virtual {p4, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz p6, :cond_1

    .line 7
    invoke-virtual {p4, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 8
    invoke-virtual {p3, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p3, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 10
    invoke-virtual {p4, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public static synthetic a(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->I(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/join/mgps/adapter/PapaMainV2Adapter;Ljava/util/List;ILcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->H(Ljava/util/List;ILcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic c(Lcom/join/mgps/adapter/PapaMainV2Adapter;Ljava/util/List;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->E(Ljava/util/List;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic d(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->J(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->B(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->A(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;ILandroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->C(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->D(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Lcom/join/mgps/adapter/PapaMainV2Adapter;Ljava/util/List;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->G(Ljava/util/List;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic j(Lcom/join/mgps/adapter/PapaMainV2Adapter;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->F(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->y(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;ILandroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->K(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic m(Lcom/join/mgps/adapter/PapaMainV2Adapter;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->z(Landroid/view/View;)V

    return-void
.end method

.method static synthetic n(Lcom/join/mgps/adapter/PapaMainV2Adapter;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->N(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic o(Lcom/join/mgps/adapter/PapaMainV2Adapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic p(Lcom/join/mgps/adapter/PapaMainV2Adapter;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->S(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic q(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->O(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Z)V

    return-void
.end method

.method static synthetic r(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->Q(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    return-void
.end method

.method static synthetic s(Lcom/join/mgps/adapter/PapaMainV2Adapter;Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->L(Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method static synthetic t(Lcom/join/mgps/adapter/PapaMainV2Adapter;)Lcom/join/mgps/adapter/PapaMainV2Adapter$h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->j:Lcom/join/mgps/adapter/PapaMainV2Adapter$h;

    return-object p0
.end method

.method static synthetic u(Lcom/join/mgps/adapter/PapaMainV2Adapter;Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->M(Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method private update(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;)V
    .locals 20

    move-object/from16 v8, p0

    move-object/from16 v0, p2

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v11, p7

    move-object/from16 v12, p8

    move-object/from16 v13, p9

    move-object/from16 v14, p10

    .line 1
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v15

    .line 2
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getGameBean()Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v7

    const-wide/16 v16, 0x0

    if-eqz v15, :cond_0

    .line 3
    invoke-virtual {v15}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v1

    move-wide/from16 v18, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v18, v16

    .line 4
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;->getLink_type()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const-string v1, "\u6253\u5f00"

    .line 5
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getSub_title()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p3

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 8
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->V(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    goto/16 :goto_6

    :cond_1
    move-object/from16 v2, p3

    if-eqz v7, :cond_2

    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v3}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7}, Lcom/join/mgps/dto/CollectionBeanSub;->getPlugin_num()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "\u5f00\u59cb"

    .line 10
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v1, 0x8

    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_6

    :cond_2
    const-string v0, "\u66f4\u65b0"

    const-string v6, "\u542f\u52a8"

    const-string v5, "\u83b7\u53d6"

    if-nez v15, :cond_7

    const/4 v11, 0x1

    const/4 v12, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object v14, v5

    move-object/from16 v5, p9

    move-object v13, v6

    move v6, v11

    move-object v11, v7

    move v7, v12

    .line 12
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->V(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    .line 13
    invoke-virtual {v10, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-nez v11, :cond_3

    return-void

    .line 14
    :cond_3
    invoke-virtual {v11}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 15
    iget-object v1, v8, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v1

    iget-object v2, v8, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-virtual {v11}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 16
    invoke-virtual {v11}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v11}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_5

    .line 17
    iget-object v1, v8, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v1

    iget-object v2, v8, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-virtual {v11}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v1

    .line 18
    invoke-virtual {v11}, Lcom/join/mgps/dto/CollectionBeanSub;->getVer()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v1

    invoke-virtual {v11}, Lcom/join/mgps/dto/CollectionBeanSub;->getVer()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 19
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    .line 20
    :cond_4
    invoke-virtual {v10, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    .line 21
    :cond_5
    invoke-virtual {v11}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {v11}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 22
    invoke-static {v10, v9, v11}, Lcom/join/mgps/Util/UtilsMy;->f3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/CollectionBeanSub;)V

    goto/16 :goto_6

    .line 23
    :cond_6
    invoke-virtual {v11}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {v11}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 24
    invoke-static {v10, v9, v11}, Lcom/join/mgps/Util/UtilsMy;->f3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/CollectionBeanSub;)V

    goto/16 :goto_6

    :cond_7
    move-object v4, v5

    move-object v3, v6

    move-object v1, v7

    .line 25
    invoke-virtual {v15}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v5

    if-eqz v1, :cond_8

    .line 26
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v7

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v6

    invoke-static {v7, v6}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v6

    if-lez v6, :cond_8

    const/16 v5, 0x2b

    :cond_8
    if-eqz v5, :cond_10

    const/16 v6, 0x1b

    const-string v7, "\u6682\u505c"

    if-eq v5, v6, :cond_f

    const/16 v6, 0x30

    if-eq v5, v6, :cond_e

    const/4 v6, 0x2

    move-object/from16 p2, v7

    const-string v7, "/"

    if-eq v5, v6, :cond_c

    const/4 v6, 0x3

    if-eq v5, v6, :cond_9

    const/4 v6, 0x5

    if-eq v5, v6, :cond_a

    const/4 v6, 0x6

    if-eq v5, v6, :cond_9

    const/4 v6, 0x7

    if-eq v5, v6, :cond_10

    const/16 v6, 0x2a

    if-eq v5, v6, :cond_a

    const/16 v6, 0x2b

    if-eq v5, v6, :cond_10

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_6

    :pswitch_0
    const/4 v6, 0x0

    const/4 v0, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    move-object v9, v7

    move v7, v0

    .line 27
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->V(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v0, "\u70b9\u51fb\u91cd\u65b0\u89e3\u538b"

    .line 29
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    invoke-virtual {v15}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {v13, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    const-string v0, "\u89e3\u538b"

    .line 31
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    :pswitch_1
    move-object v9, v7

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 32
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->V(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v0, "\u89e3\u538b\u4e2d.."

    .line 34
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    invoke-virtual {v15}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {v13, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    const-string v0, "\u89e3\u538b\u4e2d"

    .line 36
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    :pswitch_2
    const-string v0, "\u5b89\u88c5"

    .line 37
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 38
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->V(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    goto/16 :goto_6

    :pswitch_3
    move-object v9, v7

    const-string v0, "\u7b49\u5f85"

    .line 39
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 40
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->V(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    :try_start_0
    invoke-virtual {v15}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {v14, v1}, Landroid/widget/ProgressBar;->setProgress(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    const-string v0, "\u7b49\u5f85\u4e2d"

    .line 44
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    .line 45
    :pswitch_4
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 46
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->V(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    goto/16 :goto_6

    :cond_9
    move-object v0, v7

    goto :goto_2

    .line 47
    :cond_a
    invoke-virtual {v10, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 48
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->V(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    goto/16 :goto_6

    :goto_2
    const-string v1, "\u7ee7\u7eed"

    .line 49
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 50
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->V(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    .line 51
    :try_start_1
    invoke-virtual {v15}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v1

    cmp-long v3, v1, v16

    if-nez v3, :cond_b

    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 53
    :cond_b
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    :goto_3
    invoke-virtual {v15}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {v14, v1}, Landroid/widget/ProgressBar;->setProgress(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_1
    move-exception v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_4
    const-string v0, "\u6682\u505c\u4e2d"

    .line 56
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    :cond_c
    move-object v0, v7

    .line 57
    invoke-static {v15}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    move-object/from16 v1, p2

    .line 58
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 59
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->V(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    .line 60
    invoke-virtual {v15}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v1

    cmp-long v3, v1, v16

    if-nez v3, :cond_d

    .line 61
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 62
    :cond_d
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    :goto_5
    invoke-virtual {v15}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {v14, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 64
    invoke-virtual {v15}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v0

    .line 65
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/S"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_6

    :cond_e
    const-string v0, "\u5b89\u88c5\u4e2d"

    .line 66
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 67
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->V(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    goto :goto_6

    :cond_f
    move-object v1, v7

    .line 68
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_6

    .line 69
    :cond_10
    invoke-virtual {v10, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v1, :cond_11

    .line 70
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 71
    invoke-static {v10, v9, v1}, Lcom/join/mgps/Util/UtilsMy;->f3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/CollectionBeanSub;)V

    :cond_11
    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p9

    .line 72
    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->V(Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;ZZ)V

    :goto_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private w(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    .line 2
    :cond_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getId()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 4
    :cond_2
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getMod_id()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private x(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;->getLink_type()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eq p1, v2, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method private synthetic y(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-virtual {p2, v0, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    const/4 p1, 0x0

    .line 3
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->S(Ljava/lang/String;)V

    const-string p1, "3-1"

    .line 4
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->N(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic z(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    const-class v2, Lcom/join/kotlin/EverdayNewGameActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->S(Ljava/lang/String;)V

    const-string p1, "3-3"

    .line 3
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->N(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public R(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/MgpapaMainItemBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->a:Ljava/util/List;

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public T(Lcom/join/mgps/adapter/PapaMainV2Adapter$h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->j:Lcom/join/mgps/adapter/PapaMainV2Adapter$h;

    return-void
.end method

.method public getData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/MgpapaMainItemBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->a:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 2

    const/4 v0, 0x0

    if-gez p1, :cond_0

    return v0

    .line 1
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->a:Ljava/util/List;

    if-nez v1, :cond_1

    return v0

    .line 2
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-gt v1, p1, :cond_2

    return v0

    .line 3
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getShowtype()I

    move-result p1

    return p1
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 19
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    move-object/from16 v12, p0

    move/from16 v0, p2

    if-ltz v0, :cond_16

    .line 1
    iget-object v1, v12, Lcom/join/mgps/adapter/PapaMainV2Adapter;->a:Ljava/util/List;

    if-eqz v1, :cond_16

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-gt v1, v0, :cond_0

    goto/16 :goto_8

    .line 2
    :cond_0
    invoke-virtual {v12, v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->getItemViewType(I)I

    move-result v1

    .line 3
    iget-object v2, v12, Lcom/join/mgps/adapter/PapaMainV2Adapter;->a:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/MgpapaMainItemBean;

    const/4 v3, 0x3

    const-string v4, ","

    const/16 v5, 0x8

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_8

    .line 4
    :pswitch_1
    move-object/from16 v0, p1

    check-cast v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;

    .line 5
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    .line 6
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 7
    iget-object v3, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->b:Landroid/widget/TextView;

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object v2, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->b:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    :goto_0
    iget-object v2, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->e:Lcom/join/android/app/component/video/MultiStandVideo;

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getV_url()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->e:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v3}, Lcom/join/android/app/component/video/MultiStandVideo;->getUrl()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;->getLink_type()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eq v2, v8, :cond_3

    .line 10
    :cond_2
    iget-object v2, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->e:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getBig_pic()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/android/app/component/video/MultiStandVideo;->g(Ljava/lang/String;)V

    .line 11
    iget-object v2, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->e:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/android/app/component/video/MultiStandVideo;->setName(Ljava/lang/String;)V

    .line 12
    iget-object v2, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->e:Lcom/join/android/app/component/video/MultiStandVideo;

    iget-object v3, v12, Lcom/join/mgps/adapter/PapaMainV2Adapter;->e:Lcom/join/android/app/component/video/g;

    invoke-virtual {v3}, Lcom/join/android/app/component/video/g;->p()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setPlayTag(Ljava/lang/String;)V

    .line 13
    iget-object v2, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->e:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setPlayPosition(I)V

    .line 14
    iget-object v13, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->e:Lcom/join/android/app/component/video/MultiStandVideo;

    .line 15
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getV_url()Ljava/lang/String;

    move-result-object v14

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-string v18, ""

    .line 16
    invoke-virtual/range {v13 .. v18}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setUpLazy(Ljava/lang/String;ZLjava/io/File;Ljava/util/Map;Ljava/lang/String;)Z

    .line 17
    iget-object v2, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->e:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v2, v9}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setRotateViewAuto(Z)V

    .line 18
    iget-object v2, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->e:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v2, v8}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setLockLand(Z)V

    .line 19
    iget-object v2, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->e:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v2, v9}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setReleaseWhenLossAudio(Z)V

    .line 20
    iget-object v2, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->e:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v2, v9}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setShowFullAnimation(Z)V

    .line 21
    iget-object v2, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->e:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v2, v9}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setIsTouchWiget(Z)V

    .line 22
    iget-object v2, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->e:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v2, v9}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setNeedLockFull(Z)V

    .line 23
    iget-object v2, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->e:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v2, v7}, Lcom/papa/gsyvideoplayer/video/StandardGSYVideoPlayer;->setBottomProgressBarDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 24
    iget-object v2, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->e:Lcom/join/android/app/component/video/MultiStandVideo;

    new-instance v3, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;

    invoke-direct {v3, v12, v1}, Lcom/join/mgps/adapter/PapaMainV2Adapter$f;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    invoke-virtual {v2, v3}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setVideoAllCallBack(Ls2/h;)V

    .line 25
    :cond_3
    iget-object v2, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->c:Landroid/widget/FrameLayout;

    new-instance v3, Lcom/join/mgps/adapter/w3;

    invoke-direct {v3, v12, v1}, Lcom/join/mgps/adapter/w3;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    iget-object v2, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    new-instance v3, Lcom/join/mgps/adapter/z3;

    invoke-direct {v3, v12, v1}, Lcom/join/mgps/adapter/z3;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    iget-object v0, v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_8

    .line 28
    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;

    .line 29
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_16

    .line 30
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_16

    .line 31
    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v3

    if-eqz v3, :cond_4

    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v3

    instance-of v3, v3, Lcom/join/mgps/adapter/HomeRecommendAdapter;

    if-eqz v3, :cond_4

    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 32
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/adapter/HomeRecommendAdapter;

    invoke-virtual {v3}, Lcom/join/mgps/base/BaseQuickAdapter;->getData()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 33
    iget-object v0, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/adapter/HomeRecommendAdapter;

    .line 34
    invoke-virtual {v0, v2}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    goto/16 :goto_8

    .line 35
    :cond_4
    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v4, v12, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-direct {v3, v4, v9, v9}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 36
    new-instance v4, Lcom/join/mgps/adapter/HomeRecommendAdapter;

    invoke-direct {v4, v2}, Lcom/join/mgps/adapter/HomeRecommendAdapter;-><init>(Ljava/util/List;)V

    .line 37
    iget-object v5, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    move-result-object v5

    check-cast v5, Landroidx/recyclerview/widget/SimpleItemAnimator;

    invoke-virtual {v5, v9}, Landroidx/recyclerview/widget/SimpleItemAnimator;->setSupportsChangeAnimations(Z)V

    .line 38
    iget-object v5, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5, v8}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 39
    iget-object v5, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 40
    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 41
    new-instance v3, Lcom/join/mgps/adapter/u3;

    invoke-direct {v3, v12, v2}, Lcom/join/mgps/adapter/u3;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Ljava/util/List;)V

    invoke-virtual {v4, v3}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 42
    new-instance v3, Lcom/join/mgps/adapter/s3;

    invoke-direct {v3, v12, v2, v0}, Lcom/join/mgps/adapter/s3;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Ljava/util/List;I)V

    invoke-virtual {v4, v3}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemChildClickListener(Lcom/join/mgps/base/BaseQuickAdapter$h;)V

    .line 43
    iget-object v0, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;->a:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v3, Lcom/join/mgps/adapter/PapaMainV2Adapter$e;

    invoke-direct {v3, v12, v2, v1}, Lcom/join/mgps/adapter/PapaMainV2Adapter$e;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Ljava/util/List;Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;)V

    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    goto/16 :goto_8

    .line 44
    :pswitch_3
    move-object/from16 v0, p1

    check-cast v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$m;

    .line 45
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    .line 46
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$m;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$m;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    float-to-int v4, v1

    .line 47
    iput v4, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 48
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$m;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$m;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType2()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v3

    if-gtz v1, :cond_5

    .line 50
    :try_start_0
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$m;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$m;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType2()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_8

    :catch_0
    move-exception v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_8

    .line 52
    :cond_5
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$m;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$m;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setBackgroundColor(I)V

    goto/16 :goto_8

    .line 53
    :pswitch_4
    move-object/from16 v0, p1

    check-cast v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;

    .line 54
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;

    if-eqz v1, :cond_9

    .line 55
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;->getTxt()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_9

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;->getList()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_9

    .line 56
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$l;)Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 57
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;->getList()Ljava/util/List;

    move-result-object v2

    .line 58
    iget-object v5, v12, Lcom/join/mgps/adapter/PapaMainV2Adapter;->f:Lcom/join/mgps/customview/NavigationAdapter;

    if-nez v5, :cond_8

    .line 59
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;->getTxt()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 60
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 61
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 62
    :goto_1
    array-length v6, v1

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    if-ge v9, v6, :cond_7

    .line 63
    aget-object v6, v1, v9

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_6

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_6

    .line 64
    aget-object v6, v1, v9

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    aget-object v6, v1, v9

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    add-int/lit16 v10, v9, 0x5015

    invoke-static {v8, v6, v7, v10}, Lcom/join/mgps/fragment/RankingItemV2Fragment;->j0(ZLjava/lang/String;Ljava/util/List;I)Landroidx/fragment/app/Fragment;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 66
    :cond_7
    new-instance v1, Lcom/join/mgps/customview/NavigationAdapter;

    iget-object v6, v12, Lcom/join/mgps/adapter/PapaMainV2Adapter;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v6

    invoke-direct {v1, v6, v5, v4}, Lcom/join/mgps/customview/NavigationAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;Ljava/util/List;)V

    iput-object v1, v12, Lcom/join/mgps/adapter/PapaMainV2Adapter;->f:Lcom/join/mgps/customview/NavigationAdapter;

    .line 67
    invoke-virtual {v1, v5, v4}, Lcom/join/mgps/customview/NavigationAdapter;->d(Ljava/util/List;Ljava/util/List;)V

    .line 68
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;->b(Lcom/join/mgps/adapter/PapaMainV2Adapter$l;)Lcom/join/mgps/customview/RecyclerviewViewpager;

    move-result-object v1

    iget-object v4, v12, Lcom/join/mgps/adapter/PapaMainV2Adapter;->f:Lcom/join/mgps/customview/NavigationAdapter;

    invoke-virtual {v1, v4}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 69
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;->b(Lcom/join/mgps/adapter/PapaMainV2Adapter$l;)Lcom/join/mgps/customview/RecyclerviewViewpager;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 70
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;->c(Lcom/join/mgps/adapter/PapaMainV2Adapter$l;)Lcom/join/mgps/customview/SlidingTabLayout6;

    move-result-object v1

    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;->b(Lcom/join/mgps/adapter/PapaMainV2Adapter$l;)Lcom/join/mgps/customview/RecyclerviewViewpager;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/join/mgps/customview/SlidingTabLayout1;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 71
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;->d(Lcom/join/mgps/adapter/PapaMainV2Adapter$l;)Landroid/widget/LinearLayout;

    move-result-object v1

    new-instance v3, Lcom/join/mgps/adapter/r3;

    invoke-direct {v3, v12}, Lcom/join/mgps/adapter/r3;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;)V

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;->b(Lcom/join/mgps/adapter/PapaMainV2Adapter$l;)Lcom/join/mgps/customview/RecyclerviewViewpager;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$d;

    invoke-direct {v1, v12, v2}, Lcom/join/mgps/adapter/PapaMainV2Adapter$d;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    goto/16 :goto_8

    .line 73
    :cond_8
    invoke-virtual {v5}, Lcom/join/mgps/customview/NavigationAdapter;->c()Ljava/util/ArrayList;

    move-result-object v0

    .line 74
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-ge v9, v1, :cond_16

    .line 75
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/fragment/RankingItemV2Fragment;

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v1, v3}, Lcom/join/mgps/fragment/RankingItemV2Fragment;->r0(Ljava/util/List;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 76
    :cond_9
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$l;)Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto/16 :goto_8

    .line 77
    :pswitch_5
    move-object/from16 v0, p1

    check-cast v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$k;

    .line 78
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAItemTitle2;

    if-eqz v1, :cond_16

    .line 79
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$k;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$k;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAItemTitle2;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$k;->b(Lcom/join/mgps/adapter/PapaMainV2Adapter$k;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAItemTitle2;->getSubTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$k;->b(Lcom/join/mgps/adapter/PapaMainV2Adapter$k;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAItemTitle2;->getSubTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_3

    :cond_a
    const/4 v5, 0x0

    :goto_3
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_8

    .line 82
    :pswitch_6
    move-object/from16 v0, p1

    check-cast v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$j;

    .line 83
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 84
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v3, v12, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-direct {v2, v3, v9, v9}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 85
    invoke-virtual {v2, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;->setInitialPrefetchItemCount(I)V

    .line 86
    new-instance v3, Lcom/join/mgps/adapter/HomeGameListGameNewsAdapter;

    invoke-direct {v3, v1}, Lcom/join/mgps/adapter/HomeGameListGameNewsAdapter;-><init>(Ljava/util/List;)V

    .line 87
    new-instance v4, Lcom/join/mgps/adapter/t3;

    invoke-direct {v4, v12, v1}, Lcom/join/mgps/adapter/t3;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Ljava/util/List;)V

    invoke-virtual {v3, v4}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 88
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$j;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$j;)Lcom/join/mgps/customview/HorizontalRecyclerView;

    move-result-object v4

    invoke-virtual {v4, v8}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 89
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$j;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$j;)Lcom/join/mgps/customview/HorizontalRecyclerView;

    move-result-object v4

    const/16 v5, 0xa

    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->setItemViewCacheSize(I)V

    .line 90
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$j;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$j;)Lcom/join/mgps/customview/HorizontalRecyclerView;

    move-result-object v4

    invoke-virtual {v4, v9}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 91
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$j;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$j;)Lcom/join/mgps/customview/HorizontalRecyclerView;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 92
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$j;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$j;)Lcom/join/mgps/customview/HorizontalRecyclerView;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 93
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$j;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$j;)Lcom/join/mgps/customview/HorizontalRecyclerView;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/adapter/PapaMainV2Adapter$c;

    invoke-direct {v3, v12, v1, v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$c;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Ljava/util/List;Lcom/join/mgps/adapter/PapaMainV2Adapter$j;)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    goto/16 :goto_8

    .line 94
    :pswitch_7
    move-object/from16 v1, p1

    check-cast v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;

    .line 95
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    .line 96
    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getG_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;

    move-result-object v5

    if-eqz v5, :cond_d

    .line 97
    iget-object v6, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v5}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getIco()Ljava/lang/String;

    move-result-object v10

    invoke-static {v6, v10}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 98
    iget-object v6, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->c:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    invoke-virtual {v5}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getTag_name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_d

    .line 100
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    invoke-virtual {v5}, Lcom/join/mgps/dto/PAPAHomeBeanV7$GInfoDTO;->getTag_name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    .line 102
    :goto_4
    array-length v10, v4

    if-ge v5, v10, :cond_c

    .line 103
    aget-object v10, v4, v5

    .line 104
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " | "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-lt v5, v8, :cond_b

    goto :goto_5

    :cond_b
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 105
    :cond_c
    :goto_5
    iget-object v4, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->i:Landroid/widget/TextView;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    sub-int/2addr v5, v3

    invoke-virtual {v6, v9, v5}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    :cond_d
    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->o:Lcom/join/android/app/component/video/MultiStandVideo;

    if-eqz v3, :cond_f

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getV_url()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->o:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v4}, Lcom/join/android/app/component/video/MultiStandVideo;->getUrl()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object v3

    if-eqz v3, :cond_f

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getJp_info()Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$JpInfoDTO;->getLink_type()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eq v3, v8, :cond_f

    .line 107
    :cond_e
    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->o:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getBig_pic()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/join/android/app/component/video/MultiStandVideo;->g(Ljava/lang/String;)V

    .line 108
    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->o:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/join/android/app/component/video/MultiStandVideo;->setName(Ljava/lang/String;)V

    .line 109
    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->o:Lcom/join/android/app/component/video/MultiStandVideo;

    iget-object v4, v12, Lcom/join/mgps/adapter/PapaMainV2Adapter;->e:Lcom/join/android/app/component/video/g;

    invoke-virtual {v4}, Lcom/join/android/app/component/video/g;->p()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setPlayTag(Ljava/lang/String;)V

    .line 110
    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->o:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->hashCode()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setPlayPosition(I)V

    .line 111
    iget-object v13, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->o:Lcom/join/android/app/component/video/MultiStandVideo;

    .line 112
    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getV_url()Ljava/lang/String;

    move-result-object v14

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-string v18, ""

    .line 113
    invoke-virtual/range {v13 .. v18}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setUpLazy(Ljava/lang/String;ZLjava/io/File;Ljava/util/Map;Ljava/lang/String;)Z

    .line 114
    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->o:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v3, v9}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setRotateViewAuto(Z)V

    .line 115
    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->o:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v3, v8}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setLockLand(Z)V

    .line 116
    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->o:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v3, v9}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setReleaseWhenLossAudio(Z)V

    .line 117
    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->o:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v3, v9}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setShowFullAnimation(Z)V

    .line 118
    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->o:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v3, v9}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setIsTouchWiget(Z)V

    .line 119
    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->o:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v3, v9}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setNeedLockFull(Z)V

    .line 120
    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->o:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {v3, v7}, Lcom/papa/gsyvideoplayer/video/StandardGSYVideoPlayer;->setBottomProgressBarDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 121
    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->o:Lcom/join/android/app/component/video/MultiStandVideo;

    new-instance v4, Lcom/join/mgps/adapter/PapaMainV2Adapter$b;

    invoke-direct {v4, v12, v2}, Lcom/join/mgps/adapter/PapaMainV2Adapter$b;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    invoke-virtual {v3, v4}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setVideoAllCallBack(Ls2/h;)V

    .line 122
    :cond_f
    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->j:Landroid/widget/FrameLayout;

    new-instance v4, Lcom/join/mgps/adapter/c4;

    invoke-direct {v4, v12, v2, v1, v0}, Lcom/join/mgps/adapter/c4;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;I)V

    invoke-virtual {v3, v4}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 123
    iget-object v0, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    new-instance v3, Lcom/join/mgps/adapter/a4;

    invoke-direct {v3, v12, v2}, Lcom/join/mgps/adapter/a4;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 124
    iget-object v0, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 125
    iget-object v0, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->n:Landroid/widget/ProgressBar;

    const/4 v3, 0x4

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 126
    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->c:Landroid/widget/TextView;

    iget-object v4, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->i:Landroid/widget/TextView;

    iget-object v5, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->j:Landroid/widget/FrameLayout;

    iget-object v6, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->k:Landroid/widget/TextView;

    iget-object v7, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->d:Landroid/widget/LinearLayout;

    iget-object v8, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->e:Landroid/widget/TextView;

    iget-object v9, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->f:Landroid/widget/TextView;

    iget-object v10, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->g:Landroid/widget/ProgressBar;

    iget-object v11, v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;->h:Landroid/widget/ProgressBar;

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v11}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->update(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroid/widget/ProgressBar;)V

    goto/16 :goto_8

    .line 127
    :pswitch_8
    move-object/from16 v1, p1

    check-cast v1, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;

    .line 128
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    .line 129
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getMoreType2()Ljava/lang/String;

    move-result-object v2

    if-eqz v3, :cond_16

    .line 130
    invoke-direct {v12, v1, v3, v2, v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->U(Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Ljava/lang/String;I)V

    goto/16 :goto_8

    .line 131
    :pswitch_9
    move-object/from16 v0, p1

    check-cast v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$i;

    .line 132
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_16

    .line 133
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$i;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$i;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v2

    if-eqz v2, :cond_10

    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$i;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$i;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v2

    instance-of v2, v2, Lcom/join/mgps/adapter/FastEntryAdapter;

    if-eqz v2, :cond_10

    .line 134
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$i;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$i;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/adapter/FastEntryAdapter;

    .line 135
    invoke-virtual {v0}, Lcom/join/mgps/base/BaseQuickAdapter;->getData()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    .line 136
    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    goto :goto_6

    .line 137
    :cond_10
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$i;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$i;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 138
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$i;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$i;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 139
    new-instance v2, Lcom/join/mgps/adapter/FastEntryAdapter;

    invoke-direct {v2, v1}, Lcom/join/mgps/adapter/FastEntryAdapter;-><init>(Ljava/util/List;)V

    .line 140
    new-instance v3, Landroidx/recyclerview/widget/GridLayoutManager;

    iget-object v4, v12, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-direct {v3, v4, v6}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 141
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$i;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$i;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 142
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$i;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$i;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    move-object v0, v2

    .line 143
    :cond_11
    :goto_6
    new-instance v2, Lcom/join/mgps/adapter/PapaMainV2Adapter$a;

    invoke-direct {v2, v12, v1}, Lcom/join/mgps/adapter/PapaMainV2Adapter$a;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Ljava/util/List;)V

    invoke-virtual {v0, v2}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    goto/16 :goto_8

    .line 144
    :pswitch_a
    move-object/from16 v0, p1

    check-cast v0, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;

    .line 145
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;

    if-eqz v1, :cond_16

    .line 146
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;->getDiscover()Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    move-result-object v2

    if-eqz v2, :cond_12

    .line 147
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;->getDiscover()Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    move-result-object v2

    .line 148
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->a(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getBig_pic()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 149
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->b(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->d(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Landroid/widget/RelativeLayout;

    move-result-object v3

    new-instance v4, Lcom/join/mgps/adapter/b4;

    invoke-direct {v4, v12, v2}, Lcom/join/mgps/adapter/b4;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 151
    :cond_12
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;->getTheNew()Lcom/join/mgps/dto/PAPAHomeBeanV7$TheNewDTO;

    move-result-object v2

    if-eqz v2, :cond_13

    .line 152
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;->getTheNew()Lcom/join/mgps/dto/PAPAHomeBeanV7$TheNewDTO;

    move-result-object v2

    .line 153
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->e(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Landroid/widget/TextView;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TheNewDTO;->getCount()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "\u6b3e"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->f(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Landroid/widget/RelativeLayout;

    move-result-object v3

    new-instance v4, Lcom/join/mgps/adapter/v3;

    invoke-direct {v4, v12}, Lcom/join/mgps/adapter/v3;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;)V

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TheNewDTO;->getList()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_13

    .line 156
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_13

    .line 157
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->g(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 158
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/PAPAHomeBeanV7$ListDTO;

    .line 159
    iget-object v4, v12, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    const v5, 0x7f0c062b

    invoke-virtual {v4, v5, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    const v5, 0x7f090ee6

    .line 160
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 161
    invoke-virtual {v3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$ListDTO;->getIco()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 162
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->g(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_7

    .line 163
    :cond_13
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;->getBroadcast()Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    move-result-object v2

    if-eqz v2, :cond_14

    .line 164
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;->getBroadcast()Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    move-result-object v2

    .line 165
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->h(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->i(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getSub_title()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 167
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->j(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getBig_pic()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 168
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->k(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Landroid/widget/RelativeLayout;

    move-result-object v3

    new-instance v4, Lcom/join/mgps/adapter/y3;

    invoke-direct {v4, v12, v2}, Lcom/join/mgps/adapter/y3;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 169
    :cond_14
    invoke-virtual {v1}, Lcom/join/mgps/dto/PAPAHomeBeanV7$TopChannelDTO;->getBg_color()Ljava/lang/String;

    move-result-object v1

    .line 170
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const-string v3, "#F7F8F9"

    if-eqz v2, :cond_15

    move-object v1, v3

    .line 171
    :cond_15
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 172
    invoke-virtual {v2, v9}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 173
    sget-object v4, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setOrientation(Landroid/graphics/drawable/GradientDrawable$Orientation;)V

    const/4 v4, 0x2

    new-array v4, v4, [I

    .line 174
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    aput v1, v4, v9

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    aput v1, v4, v8

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 175
    invoke-virtual {v2, v9}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 176
    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;->c(Lcom/join/mgps/adapter/PapaMainV2Adapter$o;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_16
    :goto_8
    return-void

    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_8
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_8
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x0

    packed-switch p2, :pswitch_data_0

    const/4 p2, 0x0

    goto/16 :goto_0

    .line 1
    :pswitch_0
    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0c06d7

    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;

    invoke-direct {p2, p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideoAd;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Landroid/view/View;)V

    goto/16 :goto_0

    .line 3
    :pswitch_1
    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0c062d

    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 4
    new-instance p2, Lcom/join/mgps/adapter/PapaMainV2Adapter$n;

    invoke-direct {p2, p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter$n;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Landroid/view/View;)V

    goto/16 :goto_0

    .line 5
    :pswitch_2
    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0c06cd

    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 6
    new-instance p2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;

    invoke-direct {p2, p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderRecommendStyle2;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Landroid/view/View;)V

    goto/16 :goto_0

    .line 7
    :pswitch_3
    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0c06ce

    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 8
    new-instance p2, Lcom/join/mgps/adapter/PapaMainV2Adapter$m;

    invoke-direct {p2, p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter$m;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Landroid/view/View;)V

    goto/16 :goto_0

    .line 9
    :pswitch_4
    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0c0347

    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 10
    new-instance p2, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;

    invoke-direct {p2, p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Landroid/view/View;)V

    goto :goto_0

    .line 11
    :pswitch_5
    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0c06cf

    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 12
    new-instance p2, Lcom/join/mgps/adapter/PapaMainV2Adapter$k;

    invoke-direct {p2, p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter$k;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Landroid/view/View;)V

    goto :goto_0

    .line 13
    :pswitch_6
    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0c06cc

    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 14
    new-instance p2, Lcom/join/mgps/adapter/PapaMainV2Adapter$j;

    invoke-direct {p2, p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter$j;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Landroid/view/View;)V

    goto :goto_0

    .line 15
    :pswitch_7
    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0c06d6

    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 16
    new-instance p2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;

    invoke-direct {p2, p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderBigPicVideo;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Landroid/view/View;)V

    goto :goto_0

    .line 17
    :pswitch_8
    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0c06c6

    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 18
    new-instance p2, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;

    invoke-direct {p2, p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter$ViewHolderGameListGrid;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Landroid/view/View;)V

    goto :goto_0

    .line 19
    :pswitch_9
    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0c0628

    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 20
    new-instance p2, Lcom/join/mgps/adapter/PapaMainV2Adapter$i;

    invoke-direct {p2, p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter$i;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Landroid/view/View;)V

    goto :goto_0

    .line 21
    :pswitch_a
    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->b:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0c0630

    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 22
    new-instance p2, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;

    invoke-direct {p2, p0, p1}, Lcom/join/mgps/adapter/PapaMainV2Adapter$o;-><init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Landroid/view/View;)V

    :goto_0
    return-object p2

    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_8
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public v(I)Lcom/join/mgps/dto/MgpapaMainItemBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p1, :cond_0

    if-ltz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/MgpapaMainItemBean;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
