.class public Lcom/aggmoread/sdk/z/a/j/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/a/j/n$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:Lcom/aggmoread/sdk/z/a/j/i;

.field private final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private i:Z

.field private j:I

.field private k:Landroid/content/Context;

.field private l:Lcom/aggmoread/sdk/z/a/j/k;

.field private m:I

.field private final n:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final o:Lcom/aggmoread/sdk/z/a/j/p;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x3a98

    iput v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->e:I

    iput v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->f:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->h:Ljava/util/Map;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->i:Z

    const/4 v0, 0x3

    iput v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->j:I

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {}, Lcom/aggmoread/sdk/z/a/j/p;->b()Lcom/aggmoread/sdk/z/a/j/p;

    move-result-object v0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->o:Lcom/aggmoread/sdk/z/a/j/p;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/j/n;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/j/n;->m:I

    return p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/j/n;Landroid/content/Context;)Landroid/content/Context;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/n;->k:Landroid/content/Context;

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/j/n;Lcom/aggmoread/sdk/z/a/j/i;)Lcom/aggmoread/sdk/z/a/j/i;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/n;->g:Lcom/aggmoread/sdk/z/a/j/i;

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/j/n;Lcom/aggmoread/sdk/z/a/j/k;)Lcom/aggmoread/sdk/z/a/j/k;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/n;->l:Lcom/aggmoread/sdk/z/a/j/k;

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/j/n;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/n;->a:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/j/n;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/j/n;->h:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/j/n;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/a/j/n;->i:Z

    return p1
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/a/j/n;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/j/n;->f:I

    return p1
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/a/j/n;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/n;->b:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/a/j/n;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/j/n;->e:I

    return p1
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/a/j/n;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/n;->d:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/a/j/n;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/j/n;->j:I

    return p1
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/a/j/n;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/n;->c:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->f:I

    return v0
.end method

.method public b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->k:Landroid/content/Context;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lcom/aggmoread/sdk/z/a/j/i;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->g:Lcom/aggmoread/sdk/z/a/j/i;

    if-nez v0, :cond_0

    sget-object v0, Lcom/aggmoread/sdk/z/a/j/i;->a:Lcom/aggmoread/sdk/z/a/j/i;

    :cond_0
    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->d:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->h:Ljava/util/Map;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->b:Ljava/lang/String;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->j:I

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->e:I

    return v0
.end method

.method public j()Z
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->i:Z

    return v0
.end method

.method public l()V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->o:Lcom/aggmoread/sdk/z/a/j/p;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/j/p;->a()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "start enter, isStarted = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DownloadRequest"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/n;->o:Lcom/aggmoread/sdk/z/a/j/p;

    invoke-virtual {v0, p0}, Lcom/aggmoread/sdk/z/a/j/p;->a(Lcom/aggmoread/sdk/z/a/j/n;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DownloadRequest{httpUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/n;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", filePath=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/j/n;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", fileName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/j/n;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", readTimout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/aggmoread/sdk/z/a/j/n;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", connectionTimeout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/aggmoread/sdk/z/a/j/n;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", downloadListener="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/n;->g:Lcom/aggmoread/sdk/z/a/j/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", skipIfCached="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/a/j/n;->i:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", maxRedirect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/aggmoread/sdk/z/a/j/n;->j:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", context="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/n;->k:Landroid/content/Context;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isCanceled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/n;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isStarted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/n;->o:Lcom/aggmoread/sdk/z/a/j/p;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/j/p;->a()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
