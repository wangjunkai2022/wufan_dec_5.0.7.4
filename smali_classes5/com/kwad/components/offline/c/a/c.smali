.class public final Lcom/kwad/components/offline/c/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/offline/api/tk/IOfflineHostActionHandler;


# instance fields
.field private final ZW:Lcom/kwad/sdk/components/p;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/components/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/offline/c/a/c;->ZW:Lcom/kwad/sdk/components/p;

    return-void
.end method

.method private a(Lcom/kwad/components/offline/api/tk/IOfflineTKDialog;)Lcom/kwad/sdk/components/k;
    .locals 1

    .line 2
    new-instance v0, Lcom/kwad/components/offline/c/a/c$2;

    invoke-direct {v0, p0, p1}, Lcom/kwad/components/offline/c/a/c$2;-><init>(Lcom/kwad/components/offline/c/a/c;Lcom/kwad/components/offline/api/tk/IOfflineTKDialog;)V

    return-object v0
.end method

.method private a(Lcom/kwad/components/offline/api/tk/IOfflineTKNativeIntent;)Lcom/kwad/sdk/components/l;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/offline/c/a/c$1;

    invoke-direct {v0, p0, p1}, Lcom/kwad/components/offline/c/a/c$1;-><init>(Lcom/kwad/components/offline/c/a/c;Lcom/kwad/components/offline/api/tk/IOfflineTKNativeIntent;)V

    return-object v0
.end method


# virtual methods
.method public final dismissDialog(Lcom/kwad/components/offline/api/tk/IOfflineTKDialog;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/c;->ZW:Lcom/kwad/sdk/components/p;

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/components/offline/c/a/c;->a(Lcom/kwad/components/offline/api/tk/IOfflineTKDialog;)Lcom/kwad/sdk/components/k;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/kwad/sdk/components/p;->b(Lcom/kwad/sdk/components/k;)V

    :cond_0
    return-void
.end method

.method public final showDialog(Lcom/kwad/components/offline/api/tk/IOfflineTKDialog;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/c;->ZW:Lcom/kwad/sdk/components/p;

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/components/offline/c/a/c;->a(Lcom/kwad/components/offline/api/tk/IOfflineTKDialog;)Lcom/kwad/sdk/components/k;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/kwad/sdk/components/p;->a(Lcom/kwad/sdk/components/k;)V

    :cond_0
    return-void
.end method

.method public final startActivity(Lcom/kwad/components/offline/api/tk/IOfflineTKNativeIntent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/c/a/c;->ZW:Lcom/kwad/sdk/components/p;

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/components/offline/c/a/c;->a(Lcom/kwad/components/offline/api/tk/IOfflineTKNativeIntent;)Lcom/kwad/sdk/components/l;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/kwad/sdk/components/p;->a(Lcom/kwad/sdk/components/l;)V

    :cond_0
    return-void
.end method
