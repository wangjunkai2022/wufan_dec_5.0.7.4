.class public final Lcom/kwad/sdk/pngencrypt/chunk/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final aNW:Lcom/kwad/sdk/pngencrypt/chunk/e;

.field private final aNX:Z


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/pngencrypt/chunk/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/pngencrypt/chunk/w;->aNW:Lcom/kwad/sdk/pngencrypt/chunk/e;

    .line 3
    instance-of p1, p1, Lcom/kwad/sdk/pngencrypt/chunk/f;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/kwad/sdk/pngencrypt/chunk/w;->aNX:Z

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/kwad/sdk/pngencrypt/chunk/w;->aNX:Z

    return-void
.end method

.method private gv(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "+",
            "Lcom/kwad/sdk/pngencrypt/chunk/t;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/kwad/sdk/pngencrypt/chunk/w;->aNW:Lcom/kwad/sdk/pngencrypt/chunk/e;

    const-string v2, "tEXt"

    invoke-virtual {v1, v2, p1}, Lcom/kwad/sdk/pngencrypt/chunk/e;->al(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 3
    iget-object v1, p0, Lcom/kwad/sdk/pngencrypt/chunk/w;->aNW:Lcom/kwad/sdk/pngencrypt/chunk/e;

    const-string v2, "zTXt"

    invoke-virtual {v1, v2, p1}, Lcom/kwad/sdk/pngencrypt/chunk/e;->al(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 4
    iget-object v1, p0, Lcom/kwad/sdk/pngencrypt/chunk/w;->aNW:Lcom/kwad/sdk/pngencrypt/chunk/e;

    const-string v2, "iTXt"

    invoke-virtual {v1, v2, p1}, Lcom/kwad/sdk/pngencrypt/chunk/e;->al(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method


# virtual methods
.method public final gw(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/pngencrypt/chunk/w;->gv(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    .line 2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, ""

    return-object p1

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/pngencrypt/chunk/t;

    .line 5
    invoke-virtual {v1}, Lcom/kwad/sdk/pngencrypt/chunk/t;->Lf()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
