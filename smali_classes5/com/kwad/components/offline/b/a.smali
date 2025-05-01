.class public Lcom/kwad/components/offline/b/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/n/a/c/a;


# instance fields
.field private final adx:Lcom/kwad/components/offline/api/obiwan/IObiwanOfflineCompo;


# direct methods
.method public constructor <init>(Lcom/kwad/components/offline/api/obiwan/IObiwanOfflineCompo;)V
    .locals 0
    .param p1    # Lcom/kwad/components/offline/api/obiwan/IObiwanOfflineCompo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/offline/b/a;->adx:Lcom/kwad/components/offline/api/obiwan/IObiwanOfflineCompo;

    return-void
.end method


# virtual methods
.method public final getComponentsType()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Lcom/kwad/components/offline/b/a;

    return-object v0
.end method

.method public final getLog()Lcom/kwad/components/offline/api/obiwan/IObiwanLogcat;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/b/a;->adx:Lcom/kwad/components/offline/api/obiwan/IObiwanOfflineCompo;

    invoke-interface {v0}, Lcom/kwad/components/offline/api/obiwan/IObiwanOfflineCompo;->getLog()Lcom/kwad/components/offline/api/obiwan/IObiwanLogcat;

    move-result-object v0

    return-object v0
.end method

.method public final init(Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method public final priority()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/b/a;->adx:Lcom/kwad/components/offline/api/obiwan/IObiwanOfflineCompo;

    invoke-interface {v0}, Lcom/kwad/components/offline/api/IOfflineCompo;->priority()I

    move-result v0

    return v0
.end method

.method public final updateConfigs()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/offline/b/a;->adx:Lcom/kwad/components/offline/api/obiwan/IObiwanOfflineCompo;

    invoke-interface {v0}, Lcom/kwad/components/offline/api/obiwan/IObiwanOfflineCompo;->updateConfigs()V

    return-void
.end method
