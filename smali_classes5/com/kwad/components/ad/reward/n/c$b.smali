.class final Lcom/kwad/components/ad/reward/n/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/reward/n/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private appName:Ljava/lang/String;

.field private qb:Ljava/lang/String;

.field private qc:Ljava/lang/String;

.field private yp:F

.field private yq:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private yr:I

.field private ys:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xf

    .line 2
    iput v0, p0, Lcom/kwad/components/ad/reward/n/c$b;->yr:I

    return-void
.end method

.method public static P(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/ad/reward/n/c$b;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/kwad/components/ad/reward/n/c$b;

    invoke-direct {v1}, Lcom/kwad/components/ad/reward/n/c$b;-><init>()V

    .line 3
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->F(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aw(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/kwad/components/ad/reward/n/c$b;->appName:Ljava/lang/String;

    goto :goto_0

    .line 5
    :cond_1
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->au(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/kwad/components/ad/reward/n/c$b;->appName:Ljava/lang/String;

    .line 6
    :goto_0
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aB(Lcom/kwad/sdk/core/response/model/AdInfo;)F

    move-result v2

    iput v2, v1, Lcom/kwad/components/ad/reward/n/c$b;->yp:F

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->at(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/kwad/components/ad/reward/n/c$b;->qc:Ljava/lang/String;

    .line 8
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->F(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 9
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cJ(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/kwad/components/ad/reward/n/c$b;->qb:Ljava/lang/String;

    goto :goto_1

    .line 10
    :cond_2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cg(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/kwad/components/ad/reward/n/c$b;->qb:Ljava/lang/String;

    .line 11
    :goto_1
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/components/ad/reward/a/b;->k(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    .line 12
    invoke-static {p0, v0}, Lcom/kwad/sdk/core/response/b/e;->k(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 13
    invoke-static {}, Lcom/kwad/components/ad/reward/a/b;->gs()I

    move-result v0

    iput v0, v1, Lcom/kwad/components/ad/reward/n/c$b;->yr:I

    const-string v0, "\u5b89\u88c5\u5e76\u4f53\u9a8c%s\u79d2  \u53ef\u9886\u53d6\u5956\u52b1"

    .line 14
    iput-object v0, v1, Lcom/kwad/components/ad/reward/n/c$b;->ys:Ljava/lang/String;

    goto :goto_2

    .line 15
    :cond_3
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->CQ()I

    move-result v0

    iput v0, v1, Lcom/kwad/components/ad/reward/n/c$b;->yr:I

    const-string v0, "\u6d4f\u89c8\u8be6\u60c5\u9875%s\u79d2\uff0c\u9886\u53d6\u5956\u52b1"

    .line 16
    iput-object v0, v1, Lcom/kwad/components/ad/reward/n/c$b;->ys:Ljava/lang/String;

    .line 17
    :goto_2
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/d;->dJ(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/util/List;

    move-result-object p0

    iput-object p0, v1, Lcom/kwad/components/ad/reward/n/c$b;->yq:Ljava/util/List;

    return-object v1
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/n/c$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/n/c$b;->qb:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/reward/n/c$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/n/c$b;->appName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/reward/n/c$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/n/c$b;->qc:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/reward/n/c$b;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/ad/reward/n/c$b;->yp:F

    return p0
.end method

.method static synthetic e(Lcom/kwad/components/ad/reward/n/c$b;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/n/c$b;->yq:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final jS()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/c$b;->ys:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lcom/kwad/components/ad/reward/n/c$b;->yr:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
