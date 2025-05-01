.class public final Lcom/kwad/framework/filedownloader/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/framework/filedownloader/a;
.implements Lcom/kwad/framework/filedownloader/a$a;
.implements Lcom/kwad/framework/filedownloader/d$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/framework/filedownloader/c$a;
    }
.end annotation


# instance fields
.field private final aeE:Lcom/kwad/framework/filedownloader/x;

.field private final aeF:Lcom/kwad/framework/filedownloader/x$a;

.field private aeG:I

.field private aeH:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private aeI:Ljava/lang/String;

.field private aeJ:Ljava/lang/String;

.field private aeK:Z

.field private aeL:Lcom/kwad/framework/filedownloader/d/b;

.field private aeM:Lcom/kwad/framework/filedownloader/i;

.field private aeN:Ljava/lang/Object;

.field private aeO:I

.field private aeP:Z

.field private aeQ:Z

.field private aeR:I

.field private aeS:I

.field private aeT:Z

.field volatile aeU:I

.field private aeV:Z

.field private final aeW:Ljava/lang/Object;

.field private final aeX:Ljava/lang/Object;

.field private volatile aeY:Z

.field private final mUrl:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/kwad/framework/filedownloader/c;->aeO:I

    .line 3
    iput-boolean v0, p0, Lcom/kwad/framework/filedownloader/c;->aeP:Z

    .line 4
    iput-boolean v0, p0, Lcom/kwad/framework/filedownloader/c;->aeQ:Z

    const/16 v1, 0x64

    .line 5
    iput v1, p0, Lcom/kwad/framework/filedownloader/c;->aeR:I

    const/16 v1, 0xa

    .line 6
    iput v1, p0, Lcom/kwad/framework/filedownloader/c;->aeS:I

    .line 7
    iput-boolean v0, p0, Lcom/kwad/framework/filedownloader/c;->aeT:Z

    .line 8
    iput v0, p0, Lcom/kwad/framework/filedownloader/c;->aeU:I

    .line 9
    iput-boolean v0, p0, Lcom/kwad/framework/filedownloader/c;->aeV:Z

    .line 10
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/kwad/framework/filedownloader/c;->aeX:Ljava/lang/Object;

    .line 11
    iput-boolean v0, p0, Lcom/kwad/framework/filedownloader/c;->aeY:Z

    .line 12
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/c;->mUrl:Ljava/lang/String;

    .line 13
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/kwad/framework/filedownloader/c;->aeW:Ljava/lang/Object;

    .line 14
    new-instance v0, Lcom/kwad/framework/filedownloader/d;

    invoke-direct {v0, p0, p1}, Lcom/kwad/framework/filedownloader/d;-><init>(Lcom/kwad/framework/filedownloader/d$a;Ljava/lang/Object;)V

    .line 15
    iput-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeE:Lcom/kwad/framework/filedownloader/x;

    .line 16
    iput-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeF:Lcom/kwad/framework/filedownloader/x$a;

    return-void
.end method

.method static synthetic a(Lcom/kwad/framework/filedownloader/c;Z)Z
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/framework/filedownloader/c;->aeV:Z

    return p1
.end method

.method private uR()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeE:Lcom/kwad/framework/filedownloader/x;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/x;->uz()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private uS()I
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/c;->uR()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/c;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Ljava/lang/IllegalStateException;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 4
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/c;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v2, "This task is running %d, if you want to start the same task, please create a new one by FileDownloader.create"

    .line 5
    invoke-static {v2, v1}, Lcom/kwad/framework/filedownloader/f/f;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "This task is dirty to restart, If you want to reuse this task, please invoke #reuse method manually and retry to restart again."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/kwad/framework/filedownloader/c;->aeE:Lcom/kwad/framework/filedownloader/x;

    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8
    :cond_1
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/c;->us()Z

    move-result v0

    if-nez v0, :cond_2

    .line 9
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/c;->uK()V

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeE:Lcom/kwad/framework/filedownloader/x;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/x;->uY()V

    .line 11
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/c;->getId()I

    move-result v0

    return v0
.end method

.method private uT()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeL:Lcom/kwad/framework/filedownloader/d/b;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeX:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/c;->aeL:Lcom/kwad/framework/filedownloader/d/b;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/kwad/framework/filedownloader/d/b;

    invoke-direct {v1}, Lcom/kwad/framework/filedownloader/d/b;-><init>()V

    iput-object v1, p0, Lcom/kwad/framework/filedownloader/c;->aeL:Lcom/kwad/framework/filedownloader/d/b;

    .line 5
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/framework/filedownloader/i;)Lcom/kwad/framework/filedownloader/a;
    .locals 2

    .line 2
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/c;->aeM:Lcom/kwad/framework/filedownloader/i;

    .line 3
    sget-boolean v0, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "setListener %s"

    .line 4
    invoke-static {p0, p1, v0}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-object p0
.end method

.method public final aX(I)Lcom/kwad/framework/filedownloader/a;
    .locals 0

    const/4 p1, 0x3

    .line 1
    iput p1, p0, Lcom/kwad/framework/filedownloader/c;->aeO:I

    return-object p0
.end method

.method public final aY(I)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/c;->getId()I

    move-result v0

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ba(Z)Lcom/kwad/framework/filedownloader/a;
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/framework/filedownloader/c;->aeT:Z

    return-object p0
.end method

.method public final bb(Z)Lcom/kwad/framework/filedownloader/a;
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/framework/filedownloader/c;->aeP:Z

    return-object p0
.end method

.method public final bc(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/a;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/kwad/framework/filedownloader/c;->c(Ljava/lang/String;Z)Lcom/kwad/framework/filedownloader/a;

    move-result-object p1

    return-object p1
.end method

.method public final bc(Z)Lcom/kwad/framework/filedownloader/a;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/kwad/framework/filedownloader/c;->aeQ:Z

    return-object p0
.end method

.method public final bd(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeL:Lcom/kwad/framework/filedownloader/d/b;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeX:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/c;->aeL:Lcom/kwad/framework/filedownloader/d/b;

    if-nez v1, :cond_0

    .line 4
    monitor-exit v0

    return-object p0

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 6
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeL:Lcom/kwad/framework/filedownloader/d/b;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/d/b;->bp(Ljava/lang/String;)V

    return-object p0
.end method

.method public final be(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/c;->aeJ:Ljava/lang/String;

    return-void
.end method

.method public final c(Ljava/lang/String;Z)Lcom/kwad/framework/filedownloader/a;
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/c;->aeI:Ljava/lang/String;

    .line 2
    sget-boolean v0, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string v1, "setPath %s"

    .line 3
    invoke-static {p0, v1, v0}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4
    :cond_0
    iput-boolean p2, p0, Lcom/kwad/framework/filedownloader/c;->aeK:Z

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/c;->aeJ:Ljava/lang/String;

    goto :goto_0

    .line 6
    :cond_1
    new-instance p2, Ljava/io/File;

    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/framework/filedownloader/c;->aeJ:Ljava/lang/String;

    :goto_0
    return-object p0
.end method

.method public final cancel()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/c;->pause()Z

    move-result v0

    return v0
.end method

.method public final e(Ljava/lang/Object;)Lcom/kwad/framework/filedownloader/a;
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/c;->aeN:Ljava/lang/Object;

    .line 2
    sget-boolean v0, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "setTag %s"

    .line 3
    invoke-static {p0, p1, v0}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-object p0
.end method

.method public final free()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeE:Lcom/kwad/framework/filedownloader/x;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/x;->free()V

    .line 2
    invoke-static {}, Lcom/kwad/framework/filedownloader/h;->vf()Lcom/kwad/framework/filedownloader/h;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/framework/filedownloader/h;->a(Lcom/kwad/framework/filedownloader/a$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/kwad/framework/filedownloader/c;->aeY:Z

    :cond_0
    return-void
.end method

.method public final getFilename()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeJ:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/kwad/framework/filedownloader/c;->aeG:I

    if-eqz v0, :cond_0

    return v0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeI:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->mUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->mUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/kwad/framework/filedownloader/c;->aeI:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/kwad/framework/filedownloader/c;->aeK:Z

    invoke-static {v0, v1, v2}, Lcom/kwad/framework/filedownloader/f/f;->g(Ljava/lang/String;Ljava/lang/String;Z)I

    move-result v0

    iput v0, p0, Lcom/kwad/framework/filedownloader/c;->aeG:I

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeI:Ljava/lang/String;

    return-object v0
.end method

.method public final getSmallFileSoFarBytes()I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeE:Lcom/kwad/framework/filedownloader/x;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/x;->uZ()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const v0, 0x7fffffff

    return v0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeE:Lcom/kwad/framework/filedownloader/x;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/x;->uZ()J

    move-result-wide v0

    long-to-int v1, v0

    return v1
.end method

.method public final getSmallFileTotalBytes()I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeE:Lcom/kwad/framework/filedownloader/x;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/x;->getTotalBytes()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const v0, 0x7fffffff

    return v0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeE:Lcom/kwad/framework/filedownloader/x;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/x;->getTotalBytes()J

    move-result-wide v0

    long-to-int v1, v0

    return v1
.end method

.method public final getSpeed()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeE:Lcom/kwad/framework/filedownloader/x;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/s$a;->getSpeed()I

    move-result v0

    return v0
.end method

.method public final getStatusUpdateTime()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeE:Lcom/kwad/framework/filedownloader/x;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/x;->getStatusUpdateTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public final getTag()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeN:Ljava/lang/Object;

    return-object v0
.end method

.method public final getTargetFilePath()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/c;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/c;->uv()Z

    move-result v1

    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/c;->getFilename()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/kwad/framework/filedownloader/f/f;->a(Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->mUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final isOver()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/c;->uz()B

    move-result v0

    invoke-static {v0}, Lcom/kwad/framework/filedownloader/d/d;->bF(I)Z

    move-result v0

    return v0
.end method

.method public final isRunning()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/framework/filedownloader/r;->vy()Lcom/kwad/framework/filedownloader/r;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/r;->vC()Lcom/kwad/framework/filedownloader/v;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kwad/framework/filedownloader/v;->d(Lcom/kwad/framework/filedownloader/a$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/c;->uz()B

    move-result v0

    invoke-static {v0}, Lcom/kwad/framework/filedownloader/d/d;->bG(I)Z

    move-result v0

    return v0
.end method

.method public final pause()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeW:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/c;->aeE:Lcom/kwad/framework/filedownloader/x;

    invoke-interface {v1}, Lcom/kwad/framework/filedownloader/x;->pause()Z

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final start()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/c;->aeV:Z

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/c;->uS()I

    move-result v0

    return v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "If you start the task manually, it means this task doesn\'t belong to a queue, so you must not invoke BaseDownloadTask#ready() or InQueueTask#enqueue() before you start() this method. For detail: If this task doesn\'t belong to a queue, what is just an isolated task, you just need to invoke BaseDownloadTask#start() to start this task, that\'s all. In other words, If this task doesn\'t belong to a queue, you must not invoke BaseDownloadTask#ready() method or InQueueTask#enqueue() method before invoke BaseDownloadTask#start(), If you do that and if there is the same listener object to start a queue in another thread, this task may be assembled by the queue, in that case, when you invoke BaseDownloadTask#start() manually to start this task or this task is started by the queue, there is an exception buried in there, because this task object is started two times without declare BaseDownloadTask#reuse() : 1. you invoke BaseDownloadTask#start() manually;  2. the queue start this task automatically."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final t(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/framework/filedownloader/a;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/c;->uT()V

    .line 2
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeL:Lcom/kwad/framework/filedownloader/d/b;

    invoke-virtual {v0, p1, p2}, Lcom/kwad/framework/filedownloader/d/b;->x(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/c;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "%d@%s"

    invoke-static {v1, v0}, Lcom/kwad/framework/filedownloader/f/f;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final uA()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/c;->aeT:Z

    return v0
.end method

.method public final uB()Ljava/lang/Throwable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeE:Lcom/kwad/framework/filedownloader/x;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/x;->uB()Ljava/lang/Throwable;

    move-result-object v0

    return-object v0
.end method

.method public final uC()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/framework/filedownloader/c;->aeO:I

    return v0
.end method

.method public final uD()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeE:Lcom/kwad/framework/filedownloader/x;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/x;->uD()I

    move-result v0

    return v0
.end method

.method public final uE()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/c;->aeP:Z

    return v0
.end method

.method public final uF()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeE:Lcom/kwad/framework/filedownloader/x;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/x;->uF()Z

    move-result v0

    return v0
.end method

.method public final uG()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/c;->aeQ:Z

    return v0
.end method

.method public final uH()Lcom/kwad/framework/filedownloader/a;
    .locals 0

    return-object p0
.end method

.method public final uI()Lcom/kwad/framework/filedownloader/x$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeF:Lcom/kwad/framework/filedownloader/x$a;

    return-object v0
.end method

.method public final uJ()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/framework/filedownloader/c;->aeU:I

    return v0
.end method

.method public final uK()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/c;->uw()Lcom/kwad/framework/filedownloader/i;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/c;->uw()Lcom/kwad/framework/filedownloader/i;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    .line 4
    :goto_0
    iput v0, p0, Lcom/kwad/framework/filedownloader/c;->aeU:I

    return-void
.end method

.method public final uL()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/c;->aeY:Z

    return v0
.end method

.method public final uM()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/framework/filedownloader/c;->aeY:Z

    return-void
.end method

.method public final uN()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/c;->uS()I

    return-void
.end method

.method public final uO()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeH:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final uU()Lcom/kwad/framework/filedownloader/d/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeL:Lcom/kwad/framework/filedownloader/d/b;

    return-object v0
.end method

.method public final uV()Lcom/kwad/framework/filedownloader/a$a;
    .locals 0

    return-object p0
.end method

.method public final uW()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeH:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final uq()Lcom/kwad/framework/filedownloader/a$b;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/framework/filedownloader/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/kwad/framework/filedownloader/c$a;-><init>(Lcom/kwad/framework/filedownloader/c;B)V

    return-object v0
.end method

.method public final ur()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/c;->isRunning()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-array v0, v1, [Ljava/lang/Object;

    .line 2
    invoke-virtual {p0}, Lcom/kwad/framework/filedownloader/c;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "This task[%d] is running, if you want start the same task, please create a new one by FileDownloader#create"

    .line 3
    invoke-static {p0, v1, v0}, Lcom/kwad/framework/filedownloader/f/d;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    .line 4
    :cond_0
    iput v2, p0, Lcom/kwad/framework/filedownloader/c;->aeU:I

    .line 5
    iput-boolean v2, p0, Lcom/kwad/framework/filedownloader/c;->aeV:Z

    .line 6
    iput-boolean v2, p0, Lcom/kwad/framework/filedownloader/c;->aeY:Z

    .line 7
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeE:Lcom/kwad/framework/filedownloader/x;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/x;->reset()V

    return v1
.end method

.method public final us()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/framework/filedownloader/c;->aeU:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ut()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/framework/filedownloader/c;->aeR:I

    return v0
.end method

.method public final uu()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/framework/filedownloader/c;->aeS:I

    return v0
.end method

.method public final uv()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/c;->aeK:Z

    return v0
.end method

.method public final uw()Lcom/kwad/framework/filedownloader/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeM:Lcom/kwad/framework/filedownloader/i;

    return-object v0
.end method

.method public final ux()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeE:Lcom/kwad/framework/filedownloader/x;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/x;->uZ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final uy()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeE:Lcom/kwad/framework/filedownloader/x;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/x;->getTotalBytes()J

    move-result-wide v0

    return-wide v0
.end method

.method public final uz()B
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/c;->aeE:Lcom/kwad/framework/filedownloader/x;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/x;->uz()B

    move-result v0

    return v0
.end method
