.class public final Lcom/kwad/components/ad/reward/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/reward/e$b;,
        Lcom/kwad/components/ad/reward/e$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/e;-><init>()V

    return-void
.end method

.method private static D(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/e$b;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/e$b;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/e$b;->fs()V

    return-void
.end method

.method public static fq()Lcom/kwad/components/ad/reward/e;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/ad/reward/e$a;->fr()Lcom/kwad/components/ad/reward/e;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final C(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    const-string v0, "RewardCallbackVerifyHelper"

    const-string v1, "handleRewardVerify"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bQ(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 5
    invoke-static {p1}, Lcom/kwad/components/ad/reward/e;->D(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 6
    :cond_0
    invoke-static {p1, v0}, Lcom/kwad/components/ad/reward/o;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/response/model/AdInfo;)V

    return-void
.end method
