.class public abstract Lcom/kwad/sdk/core/video/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/video/a/c;


# instance fields
.field private UN:Lcom/kwad/sdk/core/video/a/c$e;

.field private UO:Lcom/kwad/sdk/core/video/a/c$i;

.field private UP:Lcom/kwad/sdk/core/video/a/c$b;

.field private UQ:Lcom/kwad/sdk/core/video/a/c$c;

.field private UR:Lcom/kwad/sdk/core/video/a/c$d;

.field private US:Lcom/kwad/sdk/core/video/a/c$a;

.field private aCl:Lcom/kwad/sdk/core/video/a/c$f;

.field private aCm:Lcom/kwad/sdk/core/video/a/c$g;

.field private aCn:Lcom/kwad/sdk/core/video/a/c$h;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static h(F)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float p0, p0, v0

    if-nez p0, :cond_0

    const-string p0, "autoMute"

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/video/a/a/a;->eF(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p0, "autoVoice"

    .line 2
    invoke-static {p0}, Lcom/kwad/sdk/core/video/a/a/a;->eF(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final GH()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/a/a;->aCl:Lcom/kwad/sdk/core/video/a/c$f;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c$f;->sc()V

    :cond_0
    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/video/a/c$a;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/kwad/sdk/core/video/a/a;->US:Lcom/kwad/sdk/core/video/a/c$a;

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/video/a/c$b;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/core/video/a/a;->UP:Lcom/kwad/sdk/core/video/a/c$b;

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/video/a/c$c;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/kwad/sdk/core/video/a/a;->UQ:Lcom/kwad/sdk/core/video/a/c$c;

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/video/a/c$f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/video/a/a;->aCl:Lcom/kwad/sdk/core/video/a/c$f;

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/video/a/c$g;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/kwad/sdk/core/video/a/a;->aCm:Lcom/kwad/sdk/core/video/a/c$g;

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/video/a/c$h;)V
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/kwad/sdk/core/video/a/a;->aCn:Lcom/kwad/sdk/core/video/a/c$h;

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/video/a/c$i;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/kwad/sdk/core/video/a/a;->UO:Lcom/kwad/sdk/core/video/a/c$i;

    return-void
.end method

.method protected final b(Landroid/media/TimedText;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/video/a/a;->aCn:Lcom/kwad/sdk/core/video/a/c$h;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p1}, Lcom/kwad/sdk/core/video/a/c$h;->a(Landroid/media/TimedText;)V

    :cond_0
    return-void
.end method

.method public final b(Lcom/kwad/sdk/core/video/a/c$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/video/a/a;->UN:Lcom/kwad/sdk/core/video/a/c$e;

    return-void
.end method

.method public final c(Lcom/kwad/sdk/core/video/a/c$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/video/a/a;->UR:Lcom/kwad/sdk/core/video/a/c$d;

    return-void
.end method

.method protected final notifyOnBufferingUpdate(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/a/a;->US:Lcom/kwad/sdk/core/video/a/c$a;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/kwad/sdk/core/video/a/c$a;->av(I)V

    :cond_0
    return-void
.end method

.method protected final notifyOnCompletion()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/a/a;->UP:Lcom/kwad/sdk/core/video/a/c$b;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c$b;->py()V

    :cond_0
    return-void
.end method

.method protected final notifyOnError(II)Z
    .locals 1

    const-string v0, "videoPlayError"

    .line 1
    invoke-static {v0}, Lcom/kwad/sdk/core/video/a/a/a;->eF(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/video/a/a;->UQ:Lcom/kwad/sdk/core/video/a/c$c;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/kwad/sdk/core/video/a/c$c;->l(II)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected final notifyOnInfo(II)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/a/a;->UR:Lcom/kwad/sdk/core/video/a/c$d;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/kwad/sdk/core/video/a/c$d;->m(II)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected final notifyOnPrepared()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/a/a;->UN:Lcom/kwad/sdk/core/video/a/c$e;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p0}, Lcom/kwad/sdk/core/video/a/c$e;->a(Lcom/kwad/sdk/core/video/a/c;)V

    :cond_0
    return-void
.end method

.method protected final notifyOnSeekComplete()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/a/a;->aCm:Lcom/kwad/sdk/core/video/a/c$g;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/core/video/a/c$g;->pz()V

    :cond_0
    return-void
.end method

.method public final resetListeners()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/kwad/sdk/core/video/a/a;->aCl:Lcom/kwad/sdk/core/video/a/c$f;

    .line 2
    iput-object v0, p0, Lcom/kwad/sdk/core/video/a/a;->UN:Lcom/kwad/sdk/core/video/a/c$e;

    .line 3
    iput-object v0, p0, Lcom/kwad/sdk/core/video/a/a;->US:Lcom/kwad/sdk/core/video/a/c$a;

    .line 4
    iput-object v0, p0, Lcom/kwad/sdk/core/video/a/a;->UP:Lcom/kwad/sdk/core/video/a/c$b;

    .line 5
    iput-object v0, p0, Lcom/kwad/sdk/core/video/a/a;->aCm:Lcom/kwad/sdk/core/video/a/c$g;

    .line 6
    iput-object v0, p0, Lcom/kwad/sdk/core/video/a/a;->UO:Lcom/kwad/sdk/core/video/a/c$i;

    .line 7
    iput-object v0, p0, Lcom/kwad/sdk/core/video/a/a;->UQ:Lcom/kwad/sdk/core/video/a/c$c;

    .line 8
    iput-object v0, p0, Lcom/kwad/sdk/core/video/a/a;->UR:Lcom/kwad/sdk/core/video/a/c$d;

    .line 9
    iput-object v0, p0, Lcom/kwad/sdk/core/video/a/a;->aCn:Lcom/kwad/sdk/core/video/a/c$h;

    return-void
.end method

.method protected final w(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/a/a;->UO:Lcom/kwad/sdk/core/video/a/c$i;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2}, Lcom/kwad/sdk/core/video/a/c$i;->k(II)V

    :cond_0
    return-void
.end method
