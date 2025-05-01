.class public abstract Lcom/kwad/library/solder/lib/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected ajN:Lcom/kwad/library/solder/lib/ext/c;

.field protected aki:Ljava/io/File;

.field protected akj:Ljava/lang/String;

.field protected akk:Ljava/lang/String;

.field private akl:Z

.field private final akm:[B

.field private final akn:Ljava/lang/String;

.field protected ako:Lcom/kwad/library/solder/lib/c/b;

.field protected mVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [B

    .line 2
    iput-object v1, p0, Lcom/kwad/library/solder/lib/a/a;->akm:[B

    .line 3
    iput-boolean v0, p0, Lcom/kwad/library/solder/lib/a/a;->akl:Z

    .line 4
    iput-object p1, p0, Lcom/kwad/library/solder/lib/a/a;->akn:Ljava/lang/String;

    .line 5
    iput-object p1, p0, Lcom/kwad/library/solder/lib/a/a;->akj:Ljava/lang/String;

    .line 6
    invoke-static {}, Lcom/kwad/library/solder/lib/i;->xI()Lcom/kwad/library/solder/lib/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/kwad/library/solder/lib/i;->xC()Lcom/kwad/library/solder/lib/ext/c;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/library/solder/lib/a/a;->ajN:Lcom/kwad/library/solder/lib/ext/c;

    return-void
.end method

.method private xM()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/library/solder/lib/a/a;->akl:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/a;->akm:[B

    monitor-enter v0

    const/4 v1, 0x1

    .line 3
    :try_start_0
    iput-boolean v1, p0, Lcom/kwad/library/solder/lib/a/a;->akl:Z

    .line 4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final a(Lcom/kwad/library/solder/lib/c/b;)Lcom/kwad/library/solder/lib/a/a;
    .locals 0
    .param p1    # Lcom/kwad/library/solder/lib/c/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/kwad/library/solder/lib/a/a;->ako:Lcom/kwad/library/solder/lib/c/b;

    return-object p0
.end method

.method public final bM(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/library/solder/lib/a/a;->mVersion:Ljava/lang/String;

    return-void
.end method

.method public final bN(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/library/solder/lib/a/a;->akk:Ljava/lang/String;

    return-void
.end method

.method public final bO(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/library/solder/lib/a/a;->akj:Ljava/lang/String;

    return-void
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/a;->akk:Ljava/lang/String;

    return-object v0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/a;->mVersion:Ljava/lang/String;

    return-object v0
.end method

.method protected abstract h(Landroid/content/Context;Ljava/lang/String;)V
.end method

.method public final isLoaded()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/library/solder/lib/a/a;->akl:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/a;->akm:[B

    monitor-enter v0

    .line 3
    :try_start_0
    iget-boolean v1, p0, Lcom/kwad/library/solder/lib/a/a;->akl:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final m(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/kwad/library/solder/lib/a/a;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/kwad/library/solder/lib/a/a;->xM()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Plugin{, ApkPath = \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/library/solder/lib/a/a;->akn:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final xN()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/a;->akn:Ljava/lang/String;

    return-object v0
.end method

.method public final xO()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/a/a;->ako:Lcom/kwad/library/solder/lib/c/b;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/kwad/library/solder/lib/c/b;->akY:Ljava/lang/String;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
