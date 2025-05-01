.class public final Lcom/kwad/framework/filedownloader/services/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/framework/filedownloader/services/c$a;,
        Lcom/kwad/framework/filedownloader/services/c$b;
    }
.end annotation


# instance fields
.field private final aiF:Lcom/kwad/framework/filedownloader/services/c$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/kwad/framework/filedownloader/services/c;->aiF:Lcom/kwad/framework/filedownloader/services/c$b;

    return-void
.end method

.method public constructor <init>(Lcom/kwad/framework/filedownloader/services/c$b;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/services/c;->aiF:Lcom/kwad/framework/filedownloader/services/c$b;

    return-void
.end method

.method private static xa()Lcom/kwad/framework/filedownloader/f/c$d;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/framework/filedownloader/services/b;

    invoke-direct {v0}, Lcom/kwad/framework/filedownloader/services/b;-><init>()V

    return-object v0
.end method

.method private static xb()I
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/framework/filedownloader/f/e;->xr()Lcom/kwad/framework/filedownloader/f/e;

    move-result-object v0

    iget v0, v0, Lcom/kwad/framework/filedownloader/f/e;->ajg:I

    return v0
.end method

.method private static xc()Lcom/kwad/framework/filedownloader/f/c$e;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/framework/filedownloader/e/b$a;

    invoke-direct {v0}, Lcom/kwad/framework/filedownloader/e/b$a;-><init>()V

    return-object v0
.end method

.method private static xd()Lcom/kwad/framework/filedownloader/f/c$b;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/framework/filedownloader/a/c$b;

    invoke-direct {v0}, Lcom/kwad/framework/filedownloader/a/c$b;-><init>()V

    return-object v0
.end method

.method private static xe()Lcom/kwad/framework/filedownloader/f/c$a;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/framework/filedownloader/a/a;

    invoke-direct {v0}, Lcom/kwad/framework/filedownloader/a/a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final vV()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/services/c;->aiF:Lcom/kwad/framework/filedownloader/services/c$b;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/kwad/framework/filedownloader/services/c;->xb()I

    move-result v0

    return v0

    .line 3
    :cond_0
    iget-object v0, v0, Lcom/kwad/framework/filedownloader/services/c$b;->aiH:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 4
    sget-boolean v1, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v2, "initial FileDownloader manager with the customize maxNetworkThreadCount: %d"

    .line 5
    invoke-static {p0, v2, v1}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/kwad/framework/filedownloader/f/e;->bL(I)I

    move-result v0

    return v0

    .line 7
    :cond_2
    invoke-static {}, Lcom/kwad/framework/filedownloader/services/c;->xb()I

    move-result v0

    return v0
.end method

.method public final wV()Lcom/kwad/framework/filedownloader/b/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/services/c;->aiF:Lcom/kwad/framework/filedownloader/services/c$b;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lcom/kwad/framework/filedownloader/services/c$b;->aiG:Lcom/kwad/framework/filedownloader/f/c$c;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/f/c$c;->xq()Lcom/kwad/framework/filedownloader/b/a;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    .line 3
    :cond_1
    new-instance v0, Lcom/kwad/framework/filedownloader/b/c;

    invoke-direct {v0}, Lcom/kwad/framework/filedownloader/b/c;-><init>()V

    return-object v0

    .line 4
    :cond_2
    :goto_0
    new-instance v0, Lcom/kwad/framework/filedownloader/b/c;

    invoke-direct {v0}, Lcom/kwad/framework/filedownloader/b/c;-><init>()V

    return-object v0
.end method

.method public final wW()Lcom/kwad/framework/filedownloader/f/c$e;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/services/c;->aiF:Lcom/kwad/framework/filedownloader/services/c$b;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/kwad/framework/filedownloader/services/c;->xc()Lcom/kwad/framework/filedownloader/f/c$e;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, v0, Lcom/kwad/framework/filedownloader/services/c$b;->aiI:Lcom/kwad/framework/filedownloader/f/c$e;

    if-eqz v0, :cond_2

    .line 4
    sget-boolean v1, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v2, "initial FileDownloader manager with the customize output stream: %s"

    .line 5
    invoke-static {p0, v2, v1}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-object v0

    .line 6
    :cond_2
    invoke-static {}, Lcom/kwad/framework/filedownloader/services/c;->xc()Lcom/kwad/framework/filedownloader/f/c$e;

    move-result-object v0

    return-object v0
.end method

.method public final wX()Lcom/kwad/framework/filedownloader/f/c$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/services/c;->aiF:Lcom/kwad/framework/filedownloader/services/c$b;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/kwad/framework/filedownloader/services/c;->xd()Lcom/kwad/framework/filedownloader/f/c$b;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, v0, Lcom/kwad/framework/filedownloader/services/c$b;->aiK:Lcom/kwad/framework/filedownloader/services/c$a;

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/services/c$a;->vY()Lcom/kwad/framework/filedownloader/f/c$b;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    .line 5
    :cond_1
    invoke-static {}, Lcom/kwad/framework/filedownloader/services/c;->xd()Lcom/kwad/framework/filedownloader/f/c$b;

    move-result-object v0

    return-object v0
.end method

.method public final wY()Lcom/kwad/framework/filedownloader/f/c$a;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/services/c;->aiF:Lcom/kwad/framework/filedownloader/services/c$b;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/kwad/framework/filedownloader/services/c;->xe()Lcom/kwad/framework/filedownloader/f/c$a;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, v0, Lcom/kwad/framework/filedownloader/services/c$b;->aiL:Lcom/kwad/framework/filedownloader/f/c$a;

    if-eqz v0, :cond_2

    .line 4
    sget-boolean v1, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v2, "initial FileDownloader manager with the customize connection count adapter: %s"

    .line 5
    invoke-static {p0, v2, v1}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-object v0

    .line 6
    :cond_2
    invoke-static {}, Lcom/kwad/framework/filedownloader/services/c;->xe()Lcom/kwad/framework/filedownloader/f/c$a;

    move-result-object v0

    return-object v0
.end method

.method public final wZ()Lcom/kwad/framework/filedownloader/f/c$d;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/services/c;->aiF:Lcom/kwad/framework/filedownloader/services/c$b;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/kwad/framework/filedownloader/services/c;->xa()Lcom/kwad/framework/filedownloader/f/c$d;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, v0, Lcom/kwad/framework/filedownloader/services/c$b;->aiM:Lcom/kwad/framework/filedownloader/f/c$d;

    if-eqz v0, :cond_2

    .line 4
    sget-boolean v1, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v2, "initial FileDownloader manager with the customize id generator: %s"

    .line 5
    invoke-static {p0, v2, v1}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-object v0

    .line 6
    :cond_2
    invoke-static {}, Lcom/kwad/framework/filedownloader/services/c;->xa()Lcom/kwad/framework/filedownloader/f/c$d;

    move-result-object v0

    return-object v0
.end method
