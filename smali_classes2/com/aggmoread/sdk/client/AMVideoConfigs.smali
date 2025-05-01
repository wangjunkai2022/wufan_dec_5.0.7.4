.class public Lcom/aggmoread/sdk/client/AMVideoConfigs;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;,
        Lcom/aggmoread/sdk/client/AMVideoConfigs$AutoPlayPolicy;
    }
.end annotation


# instance fields
.field private autoPlayMuted:Z

.field private autoPlayPolicy:I

.field private detailPageMuted:Z

.field private enableDetailPage:Z

.field private enableUserControl:Z

.field private needCoverImage:Z

.field private needProgressBar:Z


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/aggmoread/sdk/client/AMVideoConfigs$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/client/AMVideoConfigs;-><init>()V

    return-void
.end method

.method static synthetic access$102(Lcom/aggmoread/sdk/client/AMVideoConfigs;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs;->autoPlayPolicy:I

    return p1
.end method

.method static synthetic access$202(Lcom/aggmoread/sdk/client/AMVideoConfigs;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs;->autoPlayMuted:Z

    return p1
.end method

.method static synthetic access$302(Lcom/aggmoread/sdk/client/AMVideoConfigs;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs;->needCoverImage:Z

    return p1
.end method

.method static synthetic access$402(Lcom/aggmoread/sdk/client/AMVideoConfigs;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs;->needProgressBar:Z

    return p1
.end method

.method static synthetic access$502(Lcom/aggmoread/sdk/client/AMVideoConfigs;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs;->enableDetailPage:Z

    return p1
.end method

.method static synthetic access$602(Lcom/aggmoread/sdk/client/AMVideoConfigs;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs;->enableUserControl:Z

    return p1
.end method

.method static synthetic access$702(Lcom/aggmoread/sdk/client/AMVideoConfigs;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs;->detailPageMuted:Z

    return p1
.end method


# virtual methods
.method public getAutoPlayPolicy()I
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs;->autoPlayPolicy:I

    return v0
.end method

.method public isAutoPlayMuted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs;->autoPlayMuted:Z

    return v0
.end method

.method public isDetailPageMuted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs;->detailPageMuted:Z

    return v0
.end method

.method public isEnableDetailPage()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs;->enableDetailPage:Z

    return v0
.end method

.method public isEnableUserControl()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs;->enableUserControl:Z

    return v0
.end method

.method public isNeedCoverImage()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs;->needCoverImage:Z

    return v0
.end method

.method public isNeedProgressBar()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs;->needProgressBar:Z

    return v0
.end method
