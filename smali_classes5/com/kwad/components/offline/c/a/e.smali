.class public final Lcom/kwad/components/offline/c/a/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/offline/api/tk/IOfflineApkLoaderHolder;


# instance fields
.field private ZX:Lcom/kwad/sdk/components/j;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/components/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/offline/c/a/e;->ZX:Lcom/kwad/sdk/components/j;

    return-void
.end method


# virtual methods
.method public final getApkLoader(I)Lcom/kwad/components/offline/api/tk/IOfflineApkLoader;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/e;->ZX:Lcom/kwad/sdk/components/j;

    invoke-interface {v0, p1}, Lcom/kwad/sdk/components/j;->aS(I)Lcom/kwad/sdk/components/i;

    move-result-object p1

    .line 2
    new-instance v0, Lcom/kwad/components/offline/c/a/d;

    invoke-direct {v0, p1}, Lcom/kwad/components/offline/c/a/d;-><init>(Lcom/kwad/sdk/components/i;)V

    return-object v0
.end method

.method public final getApkLoader(Ljava/lang/String;)Lcom/kwad/components/offline/api/tk/IOfflineApkLoader;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/e;->ZX:Lcom/kwad/sdk/components/j;

    invoke-interface {v0, p1}, Lcom/kwad/sdk/components/j;->aW(Ljava/lang/String;)Lcom/kwad/sdk/components/i;

    move-result-object p1

    .line 4
    new-instance v0, Lcom/kwad/components/offline/c/a/d;

    invoke-direct {v0, p1}, Lcom/kwad/components/offline/c/a/d;-><init>(Lcom/kwad/sdk/components/i;)V

    return-object v0
.end method
