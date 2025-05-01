.class public final Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/client/AMVideoConfigs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private autoPlayMuted:Z

.field private autoPlayPolicy:I

.field private detailPageMuted:Z

.field private enableDetailPage:Z

.field private enableUserControl:Z

.field private maxVideoDuration:I

.field private minVideoDuration:I

.field private needCoverImage:Z

.field private needProgressBar:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->autoPlayPolicy:I

    iput-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->autoPlayMuted:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->needProgressBar:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->needCoverImage:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->enableDetailPage:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->enableUserControl:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->detailPageMuted:Z

    return-void
.end method

.method public constructor <init>(Lcom/aggmoread/sdk/client/AMVideoConfigs;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->autoPlayPolicy:I

    iput-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->autoPlayMuted:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->needProgressBar:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->needCoverImage:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->enableDetailPage:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->enableUserControl:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->detailPageMuted:Z

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->getAutoPlayPolicy()I

    move-result v0

    iput v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->autoPlayPolicy:I

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->isAutoPlayMuted()Z

    move-result v0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->autoPlayMuted:Z

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->isNeedProgressBar()Z

    move-result v0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->needProgressBar:Z

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->isNeedCoverImage()Z

    move-result v0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->needCoverImage:Z

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->isEnableDetailPage()Z

    move-result v0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->enableDetailPage:Z

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->isEnableUserControl()Z

    move-result v0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->enableUserControl:Z

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->isDetailPageMuted()Z

    move-result p1

    iput-boolean p1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->detailPageMuted:Z

    return-void
.end method


# virtual methods
.method public build()Lcom/aggmoread/sdk/client/AMVideoConfigs;
    .locals 2

    new-instance v0, Lcom/aggmoread/sdk/client/AMVideoConfigs;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;-><init>(Lcom/aggmoread/sdk/client/AMVideoConfigs$1;)V

    iget v1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->autoPlayPolicy:I

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->access$102(Lcom/aggmoread/sdk/client/AMVideoConfigs;I)I

    iget-boolean v1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->autoPlayMuted:Z

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->access$202(Lcom/aggmoread/sdk/client/AMVideoConfigs;Z)Z

    iget-boolean v1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->needCoverImage:Z

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->access$302(Lcom/aggmoread/sdk/client/AMVideoConfigs;Z)Z

    iget-boolean v1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->needProgressBar:Z

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->access$402(Lcom/aggmoread/sdk/client/AMVideoConfigs;Z)Z

    iget-boolean v1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->enableDetailPage:Z

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->access$502(Lcom/aggmoread/sdk/client/AMVideoConfigs;Z)Z

    iget-boolean v1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->enableUserControl:Z

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->access$602(Lcom/aggmoread/sdk/client/AMVideoConfigs;Z)Z

    iget-boolean v1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->detailPageMuted:Z

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->access$702(Lcom/aggmoread/sdk/client/AMVideoConfigs;Z)Z

    return-object v0
.end method

.method public setAutoPlayMuted(Z)Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->autoPlayMuted:Z

    return-object p0
.end method

.method public setAutoPlayPolicy(I)Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->autoPlayPolicy:I

    return-object p0
.end method

.method public setDetailPageMuted(Z)Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->detailPageMuted:Z

    return-object p0
.end method

.method public setEnableDetailPage(Z)Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->enableDetailPage:Z

    return-object p0
.end method

.method public setEnableUserControl(Z)Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->enableUserControl:Z

    return-object p0
.end method

.method public setNeedCoverImage(Z)Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->needCoverImage:Z

    return-object p0
.end method

.method public setNeedProgressBar(Z)Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->needProgressBar:Z

    return-object p0
.end method
