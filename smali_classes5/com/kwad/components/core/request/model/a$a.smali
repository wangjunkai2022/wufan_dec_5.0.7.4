.class public final Lcom/kwad/components/core/request/model/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/core/request/model/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public MX:Lcom/kwad/components/core/request/model/ImpInfo;

.field public Sb:Lcom/kwad/components/core/request/c;

.field public Se:Z

.field public Sf:Z

.field public Si:Lcom/kwad/components/core/request/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/request/c;)Lcom/kwad/components/core/request/model/a$a;
    .locals 0
    .param p1    # Lcom/kwad/components/core/request/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/request/model/a$a;->Sb:Lcom/kwad/components/core/request/c;

    return-object p0
.end method

.method public final a(Lcom/kwad/components/core/request/i;)Lcom/kwad/components/core/request/model/a$a;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/request/model/a$a;->Si:Lcom/kwad/components/core/request/i;

    return-object p0
.end method

.method public final aI(Z)Lcom/kwad/components/core/request/model/a$a;
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/request/model/a$a;->Se:Z

    return-object p0
.end method

.method public final aJ(Z)Lcom/kwad/components/core/request/model/a$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/request/model/a$a;->Sf:Z

    return-object p0
.end method

.method public final e(Lcom/kwad/components/core/request/model/ImpInfo;)Lcom/kwad/components/core/request/model/a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/request/model/a$a;->MX:Lcom/kwad/components/core/request/model/ImpInfo;

    return-object p0
.end method

.method public final ra()Lcom/kwad/components/core/request/model/a;
    .locals 2

    .line 1
    sget-object v0, Lcom/kwad/components/ad/e/a;->md:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kwad/components/core/request/model/a$a;->MX:Lcom/kwad/components/core/request/model/ImpInfo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/core/request/model/a$a;->Sb:Lcom/kwad/components/core/request/c;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "AdRequestParams build Illegal"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3
    :cond_1
    :goto_0
    new-instance v0, Lcom/kwad/components/core/request/model/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/kwad/components/core/request/model/a;-><init>(Lcom/kwad/components/core/request/model/a$a;B)V

    return-object v0
.end method
