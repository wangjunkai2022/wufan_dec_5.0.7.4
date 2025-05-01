.class final Lcom/kwad/components/core/i/a$2;
.super Lcom/kwad/components/core/m/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/i/a;->a(Lcom/kwad/components/core/request/model/ImpInfo;Ljava/util/List;ZZLcom/kwad/components/core/request/j;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic BS:Lcom/kwad/components/core/request/model/ImpInfo;

.field final synthetic MB:Ljava/util/List;

.field final synthetic MC:Z

.field final synthetic MD:Z


# direct methods
.method constructor <init>(Lcom/kwad/components/core/request/model/ImpInfo;Lcom/kwad/components/core/request/model/ImpInfo;Ljava/util/List;ZZ)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/kwad/components/core/i/a$2;->BS:Lcom/kwad/components/core/request/model/ImpInfo;

    iput-object p3, p0, Lcom/kwad/components/core/i/a$2;->MB:Ljava/util/List;

    iput-boolean p4, p0, Lcom/kwad/components/core/i/a$2;->MC:Z

    iput-boolean p5, p0, Lcom/kwad/components/core/i/a$2;->MD:Z

    invoke-direct {p0, p1}, Lcom/kwad/components/core/m/a;-><init>(Lcom/kwad/components/core/request/model/ImpInfo;)V

    return-void
.end method


# virtual methods
.method public final synthetic createRequest()Lcom/kwad/sdk/core/network/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/i/a$2;->no()Lcom/kwad/components/core/request/a;

    move-result-object v0

    return-object v0
.end method

.method public final no()Lcom/kwad/components/core/request/a;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/components/core/request/a;

    iget-object v1, p0, Lcom/kwad/components/core/i/a$2;->BS:Lcom/kwad/components/core/request/model/ImpInfo;

    iget-object v2, p0, Lcom/kwad/components/core/i/a$2;->MB:Ljava/util/List;

    iget-boolean v3, p0, Lcom/kwad/components/core/i/a$2;->MC:Z

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/kwad/components/core/request/a;-><init>(Lcom/kwad/components/core/request/model/ImpInfo;Ljava/util/List;ZLcom/kwad/components/core/request/model/c;)V

    .line 2
    iget-boolean v1, p0, Lcom/kwad/components/core/i/a$2;->MD:Z

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/request/a;->aF(I)V

    return-object v0
.end method
