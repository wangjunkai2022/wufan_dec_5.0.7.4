.class public final Lcom/kwad/sdk/core/a/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static awl:Lcom/kwad/sdk/core/a/g;


# direct methods
.method public static a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/a/d;->oW()Lcom/kwad/sdk/core/a/g;

    move-result-object v0

    invoke-interface {v0, p0, p1, p2}, Lcom/kwad/sdk/core/a/g;->a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    return-void
.end method

.method public static am(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/a/d;->oW()Lcom/kwad/sdk/core/a/g;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kwad/sdk/core/a/g;->am(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/util/Map;)V
    .locals 1
    .param p0    # Ljava/util/Map;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/a/d;->oW()Lcom/kwad/sdk/core/a/g;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kwad/sdk/core/a/g;->g(Ljava/util/Map;)V

    return-void
.end method

.method public static getResponseData(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-class v0, Lcom/kwad/sdk/components/DevelopMangerComponents;

    invoke-static {v0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    .line 2
    invoke-static {}, Lcom/kwad/sdk/core/a/d;->oW()Lcom/kwad/sdk/core/a/g;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kwad/sdk/core/a/g;->getResponseData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static oW()Lcom/kwad/sdk/core/a/g;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/a/d;->awl:Lcom/kwad/sdk/core/a/g;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    const-class v0, Lcom/kwad/sdk/components/g;

    invoke-static {v0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/components/g;

    if-eqz v0, :cond_1

    .line 3
    invoke-interface {v0}, Lcom/kwad/sdk/components/g;->oW()Lcom/kwad/sdk/core/a/g;

    .line 4
    invoke-interface {v0}, Lcom/kwad/sdk/components/g;->oW()Lcom/kwad/sdk/core/a/g;

    move-result-object v0

    sput-object v0, Lcom/kwad/sdk/core/a/d;->awl:Lcom/kwad/sdk/core/a/g;

    goto :goto_0

    .line 5
    :cond_1
    new-instance v0, Lcom/kwad/sdk/core/a/a;

    invoke-direct {v0}, Lcom/kwad/sdk/core/a/a;-><init>()V

    sput-object v0, Lcom/kwad/sdk/core/a/d;->awl:Lcom/kwad/sdk/core/a/g;

    .line 6
    :goto_0
    sget-object v0, Lcom/kwad/sdk/core/a/d;->awl:Lcom/kwad/sdk/core/a/g;

    return-object v0
.end method
