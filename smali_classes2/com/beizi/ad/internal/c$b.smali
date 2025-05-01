.class Lcom/beizi/ad/internal/c$b;
.super Landroid/os/Handler;
.source "AdFetcher.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/beizi/ad/internal/c;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/internal/c$b;->a:Lcom/beizi/ad/internal/c;

    return-void
.end method


# virtual methods
.method public declared-synchronized handleMessage(Landroid/os/Message;)V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/beizi/ad/internal/c$b;->a:Lcom/beizi/ad/internal/c;

    if-eqz p1, :cond_7

    .line 2
    invoke-static {p1}, Lcom/beizi/ad/internal/c;->b(Lcom/beizi/ad/internal/c;)Lcom/beizi/ad/internal/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/ad/internal/a;->isReadyToStart()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 3
    :cond_0
    invoke-static {p1}, Lcom/beizi/ad/internal/c;->c(Lcom/beizi/ad/internal/c;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 4
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->new_ad_since:I

    const/4 v2, 0x0

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {p1}, Lcom/beizi/ad/internal/c;->c(Lcom/beizi/ad/internal/c;)J

    move-result-wide v5

    sub-long/2addr v3, v5

    long-to-int v4, v3

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-long v2, v2

    .line 6
    invoke-static {v1, v2, v3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IJ)Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/beizi/ad/internal/c;->a(Lcom/beizi/ad/internal/c;J)J

    .line 9
    sget-object v0, Lcom/beizi/ad/internal/c$1;->b:[I

    invoke-static {p1}, Lcom/beizi/ad/internal/c;->b(Lcom/beizi/ad/internal/c;)Lcom/beizi/ad/internal/a;

    move-result-object v1

    invoke-interface {v1}, Lcom/beizi/ad/internal/a;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_5

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    goto :goto_0

    .line 10
    :cond_2
    new-instance v0, Lcom/beizi/ad/internal/k;

    invoke-direct {v0}, Lcom/beizi/ad/internal/k;-><init>()V

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/c;->a(Lcom/beizi/ad/internal/c;Lcom/beizi/ad/internal/l;)Lcom/beizi/ad/internal/l;

    goto :goto_0

    .line 11
    :cond_3
    new-instance v0, Lcom/beizi/ad/internal/nativead/c;

    invoke-static {p1}, Lcom/beizi/ad/internal/c;->b(Lcom/beizi/ad/internal/c;)Lcom/beizi/ad/internal/a;

    move-result-object v1

    check-cast v1, Lcom/beizi/ad/internal/nativead/b;

    invoke-direct {v0, v1}, Lcom/beizi/ad/internal/nativead/c;-><init>(Lcom/beizi/ad/internal/nativead/b;)V

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/c;->a(Lcom/beizi/ad/internal/c;Lcom/beizi/ad/internal/l;)Lcom/beizi/ad/internal/l;

    goto :goto_0

    .line 12
    :cond_4
    new-instance v0, Lcom/beizi/ad/internal/f;

    invoke-static {p1}, Lcom/beizi/ad/internal/c;->b(Lcom/beizi/ad/internal/c;)Lcom/beizi/ad/internal/a;

    move-result-object v1

    check-cast v1, Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-direct {v0, v1}, Lcom/beizi/ad/internal/f;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;)V

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/c;->a(Lcom/beizi/ad/internal/c;Lcom/beizi/ad/internal/l;)Lcom/beizi/ad/internal/l;

    goto :goto_0

    .line 13
    :cond_5
    new-instance v0, Lcom/beizi/ad/internal/f;

    invoke-static {p1}, Lcom/beizi/ad/internal/c;->b(Lcom/beizi/ad/internal/c;)Lcom/beizi/ad/internal/a;

    move-result-object v1

    check-cast v1, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-direct {v0, v1}, Lcom/beizi/ad/internal/f;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;)V

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/c;->a(Lcom/beizi/ad/internal/c;Lcom/beizi/ad/internal/l;)Lcom/beizi/ad/internal/l;

    goto :goto_0

    .line 14
    :cond_6
    new-instance v0, Lcom/beizi/ad/internal/f;

    invoke-static {p1}, Lcom/beizi/ad/internal/c;->b(Lcom/beizi/ad/internal/c;)Lcom/beizi/ad/internal/a;

    move-result-object v1

    check-cast v1, Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-direct {v0, v1}, Lcom/beizi/ad/internal/f;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;)V

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/c;->a(Lcom/beizi/ad/internal/c;Lcom/beizi/ad/internal/l;)Lcom/beizi/ad/internal/l;

    .line 15
    :goto_0
    invoke-static {p1}, Lcom/beizi/ad/internal/c;->d(Lcom/beizi/ad/internal/c;)Lcom/beizi/ad/internal/l;

    move-result-object p1

    invoke-interface {p1}, Lcom/beizi/ad/internal/e;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    monitor-exit p0

    return-void

    .line 17
    :cond_7
    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
