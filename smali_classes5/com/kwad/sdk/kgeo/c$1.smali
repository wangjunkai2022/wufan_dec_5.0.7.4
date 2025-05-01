.class final Lcom/kwad/sdk/kgeo/c$1;
.super Lcom/kwad/library/solder/lib/ext/b$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/kgeo/c;->a(Landroid/content/Context;Lcom/kwad/sdk/kgeo/c$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aKg:Lcom/kwad/sdk/kgeo/c$a;

.field final synthetic gq:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/kwad/sdk/kgeo/c$a;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/kgeo/c$1;->aKg:Lcom/kwad/sdk/kgeo/c$a;

    iput-object p2, p0, Lcom/kwad/sdk/kgeo/c$1;->gq:Landroid/content/Context;

    invoke-direct {p0}, Lcom/kwad/library/solder/lib/ext/b$c;-><init>()V

    return-void
.end method

.method private a(Lcom/kwad/library/solder/lib/ext/PluginError;)V
    .locals 2

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onFail error:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "KGeoSoHelper"

    invoke-static {v0, p1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/kwad/sdk/kgeo/c$1;->aKg:Lcom/kwad/sdk/kgeo/c$a;

    invoke-interface {p1}, Lcom/kwad/sdk/kgeo/c$a;->HZ()V

    return-void
.end method

.method private uk()V
    .locals 3

    const-string v0, "KGeoSoHelper"

    const-string v1, "onPostLoad"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    const-string v1, "ipneigh-android"

    .line 2
    invoke-static {v1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 3
    iget-object v1, p0, Lcom/kwad/sdk/kgeo/c$1;->aKg:Lcom/kwad/sdk/kgeo/c$a;

    iget-object v2, p0, Lcom/kwad/sdk/kgeo/c$1;->gq:Landroid/content/Context;

    invoke-static {v2}, Lcom/kwai/library/ipneigh/c;->dK(Landroid/content/Context;)Lcom/kwai/library/ipneigh/d;

    move-result-object v2

    iget-object v2, v2, Lcom/kwai/library/ipneigh/d;->aVF:Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/kwad/sdk/kgeo/c$a;->onSuccess(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    const-string v1, "loadLibrary fail"

    .line 4
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/sdk/kgeo/c$1;->aKg:Lcom/kwad/sdk/kgeo/c$a;

    invoke-interface {v0}, Lcom/kwad/sdk/kgeo/c$a;->HZ()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/kwad/library/solder/lib/a/e;Lcom/kwad/library/solder/lib/a/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/kgeo/c$1;->uk()V

    return-void
.end method

.method public final bridge synthetic a(Lcom/kwad/library/solder/lib/a/e;Lcom/kwad/library/solder/lib/ext/PluginError;)V
    .locals 0

    .line 2
    invoke-direct {p0, p2}, Lcom/kwad/sdk/kgeo/c$1;->a(Lcom/kwad/library/solder/lib/ext/PluginError;)V

    return-void
.end method
