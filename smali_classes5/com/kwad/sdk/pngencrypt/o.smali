.class public final Lcom/kwad/sdk/pngencrypt/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field protected aLq:Lcom/kwad/sdk/pngencrypt/ErrorBehaviour;

.field public final aMM:Z

.field protected final aMN:Lcom/kwad/sdk/pngencrypt/c;

.field protected final aMO:Lcom/kwad/sdk/pngencrypt/a;

.field protected final aMP:Lcom/kwad/sdk/pngencrypt/chunk/w;

.field protected aMQ:I

.field private aMR:Lcom/kwad/sdk/pngencrypt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kwad/sdk/pngencrypt/i<",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final aMq:Lcom/kwad/sdk/pngencrypt/k;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Z)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, -0x1

    .line 2
    iput p2, p0, Lcom/kwad/sdk/pngencrypt/o;->aMQ:I

    .line 3
    sget-object v0, Lcom/kwad/sdk/pngencrypt/ErrorBehaviour;->STRICT:Lcom/kwad/sdk/pngencrypt/ErrorBehaviour;

    iput-object v0, p0, Lcom/kwad/sdk/pngencrypt/o;->aLq:Lcom/kwad/sdk/pngencrypt/ErrorBehaviour;

    .line 4
    new-instance v0, Lcom/kwad/sdk/pngencrypt/a;

    invoke-direct {v0, p1}, Lcom/kwad/sdk/pngencrypt/a;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lcom/kwad/sdk/pngencrypt/o;->aMO:Lcom/kwad/sdk/pngencrypt/a;

    const/4 p1, 0x1

    .line 5
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/pngencrypt/a;->bF(Z)V

    .line 6
    invoke-static {}, Lcom/kwad/sdk/pngencrypt/o;->KR()Lcom/kwad/sdk/pngencrypt/c;

    move-result-object v1

    iput-object v1, p0, Lcom/kwad/sdk/pngencrypt/o;->aMN:Lcom/kwad/sdk/pngencrypt/c;

    const/16 v2, 0x24

    .line 7
    :try_start_0
    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/pngencrypt/a;->b(Lcom/kwad/sdk/pngencrypt/f;I)I

    move-result v0

    if-eq v0, v2, :cond_0

    .line 8
    new-instance v0, Lcom/kwad/sdk/pngencrypt/PngjException;

    const-string v2, "Could not read first 36 bytes (PNG signature+IHDR chunk)"

    invoke-direct {v0, v2}, Lcom/kwad/sdk/pngencrypt/PngjException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    .line 9
    :cond_0
    invoke-virtual {v1}, Lcom/kwad/sdk/pngencrypt/c;->Kr()Lcom/kwad/sdk/pngencrypt/k;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/pngencrypt/o;->aMq:Lcom/kwad/sdk/pngencrypt/k;

    .line 10
    invoke-virtual {v1}, Lcom/kwad/sdk/pngencrypt/c;->Ks()Lcom/kwad/sdk/pngencrypt/e;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/kwad/sdk/pngencrypt/o;->aMM:Z

    const-wide/32 v2, 0x4ca918

    .line 11
    invoke-direct {p0, v2, v3}, Lcom/kwad/sdk/pngencrypt/o;->aJ(J)V

    const-wide/32 v2, 0x35b42f29

    .line 12
    invoke-direct {p0, v2, v3}, Lcom/kwad/sdk/pngencrypt/o;->aH(J)V

    const-wide/32 v2, 0x1ee258    # 1.0000007E-317

    .line 13
    invoke-direct {p0, v2, v3}, Lcom/kwad/sdk/pngencrypt/o;->aI(J)V

    .line 14
    new-instance p1, Lcom/kwad/sdk/pngencrypt/chunk/w;

    iget-object v0, v1, Lcom/kwad/sdk/pngencrypt/c;->aLw:Lcom/kwad/sdk/pngencrypt/chunk/e;

    invoke-direct {p1, v0}, Lcom/kwad/sdk/pngencrypt/chunk/w;-><init>(Lcom/kwad/sdk/pngencrypt/chunk/e;)V

    iput-object p1, p0, Lcom/kwad/sdk/pngencrypt/o;->aMP:Lcom/kwad/sdk/pngencrypt/chunk/w;

    .line 15
    invoke-static {}, Lcom/kwad/sdk/pngencrypt/m;->KK()Lcom/kwad/sdk/pngencrypt/i;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/kwad/sdk/pngencrypt/o;->a(Lcom/kwad/sdk/pngencrypt/i;)V

    .line 16
    iput p2, p0, Lcom/kwad/sdk/pngencrypt/o;->aMQ:I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 17
    iget-object p2, p0, Lcom/kwad/sdk/pngencrypt/o;->aMO:Lcom/kwad/sdk/pngencrypt/a;

    invoke-virtual {p2}, Lcom/kwad/sdk/pngencrypt/a;->close()V

    .line 18
    iget-object p2, p0, Lcom/kwad/sdk/pngencrypt/o;->aMN:Lcom/kwad/sdk/pngencrypt/c;

    invoke-virtual {p2}, Lcom/kwad/sdk/pngencrypt/c;->close()V

    .line 19
    throw p1
.end method

.method private KN()V
    .locals 3

    .line 1
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/o;->aMN:Lcom/kwad/sdk/pngencrypt/c;

    iget v1, v0, Lcom/kwad/sdk/pngencrypt/c;->aLv:I

    const/4 v2, 0x4

    if-ge v1, v2, :cond_1

    .line 2
    iget-object v1, p0, Lcom/kwad/sdk/pngencrypt/o;->aMO:Lcom/kwad/sdk/pngencrypt/a;

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/pngencrypt/a;->a(Lcom/kwad/sdk/pngencrypt/f;)I

    move-result v0

    if-gtz v0, :cond_0

    .line 3
    new-instance v0, Lcom/kwad/sdk/pngencrypt/PngjException;

    const-string v1, "Premature ending reading first chunks"

    invoke-direct {v0, v1}, Lcom/kwad/sdk/pngencrypt/PngjException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private KQ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/o;->aMN:Lcom/kwad/sdk/pngencrypt/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/pngencrypt/c;->bH(Z)V

    return-void
.end method

.method private static KR()Lcom/kwad/sdk/pngencrypt/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/pngencrypt/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/kwad/sdk/pngencrypt/c;-><init>(Z)V

    return-object v0
.end method

.method private a(Lcom/kwad/sdk/pngencrypt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kwad/sdk/pngencrypt/i<",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/pngencrypt/o;->aMR:Lcom/kwad/sdk/pngencrypt/i;

    return-void
.end method

.method private aH(J)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/kwad/sdk/pngencrypt/o;->aMN:Lcom/kwad/sdk/pngencrypt/c;

    const-wide/32 v0, 0x35b42f29

    invoke-virtual {p1, v0, v1}, Lcom/kwad/sdk/pngencrypt/c;->aH(J)V

    return-void
.end method

.method private aI(J)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/kwad/sdk/pngencrypt/o;->aMN:Lcom/kwad/sdk/pngencrypt/c;

    const-wide/32 v0, 0x1ee258    # 1.0000007E-317

    invoke-virtual {p1, v0, v1}, Lcom/kwad/sdk/pngencrypt/c;->aI(J)V

    return-void
.end method

.method private aJ(J)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/kwad/sdk/pngencrypt/o;->aMN:Lcom/kwad/sdk/pngencrypt/c;

    const-wide/32 v0, 0x4ca918

    invoke-virtual {p1, v0, v1}, Lcom/kwad/sdk/pngencrypt/c;->aJ(J)V

    return-void
.end method


# virtual methods
.method public final KO()Lcom/kwad/sdk/pngencrypt/chunk/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/o;->aMN:Lcom/kwad/sdk/pngencrypt/c;

    invoke-virtual {v0}, Lcom/kwad/sdk/pngencrypt/c;->Kp()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/o;->KN()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/o;->aMP:Lcom/kwad/sdk/pngencrypt/chunk/w;

    return-object v0
.end method

.method public final KP()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/o;->KQ()V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/o;->aMN:Lcom/kwad/sdk/pngencrypt/c;

    invoke-virtual {v0}, Lcom/kwad/sdk/pngencrypt/c;->Kp()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/o;->KN()V

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/sdk/pngencrypt/o;->end()V

    return-void
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/o;->aMN:Lcom/kwad/sdk/pngencrypt/c;

    invoke-static {v0}, Lcom/kwad/sdk/crash/utils/b;->closeQuietly(Ljava/io/Closeable;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/o;->aMO:Lcom/kwad/sdk/pngencrypt/a;

    invoke-static {v0}, Lcom/kwad/sdk/crash/utils/b;->closeQuietly(Ljava/io/Closeable;)V

    return-void
.end method

.method public final end()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/o;->aMN:Lcom/kwad/sdk/pngencrypt/c;

    invoke-virtual {v0}, Lcom/kwad/sdk/pngencrypt/c;->Kp()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/o;->KN()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/o;->aMN:Lcom/kwad/sdk/pngencrypt/c;

    invoke-virtual {v0}, Lcom/kwad/sdk/pngencrypt/c;->Kq()Lcom/kwad/sdk/pngencrypt/j;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/o;->aMN:Lcom/kwad/sdk/pngencrypt/c;

    invoke-virtual {v0}, Lcom/kwad/sdk/pngencrypt/c;->Kq()Lcom/kwad/sdk/pngencrypt/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/pngencrypt/DeflatedChunksSet;->isDone()Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/o;->aMN:Lcom/kwad/sdk/pngencrypt/c;

    invoke-virtual {v0}, Lcom/kwad/sdk/pngencrypt/c;->Kq()Lcom/kwad/sdk/pngencrypt/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/pngencrypt/DeflatedChunksSet;->Kx()V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/o;->aMN:Lcom/kwad/sdk/pngencrypt/c;

    invoke-virtual {v0}, Lcom/kwad/sdk/pngencrypt/b;->isDone()Z

    move-result v0

    if-nez v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/o;->aMO:Lcom/kwad/sdk/pngencrypt/a;

    iget-object v1, p0, Lcom/kwad/sdk/pngencrypt/o;->aMN:Lcom/kwad/sdk/pngencrypt/c;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/pngencrypt/a;->a(Lcom/kwad/sdk/pngencrypt/f;)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gtz v0, :cond_1

    .line 7
    :cond_2
    invoke-virtual {p0}, Lcom/kwad/sdk/pngencrypt/o;->close()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/kwad/sdk/pngencrypt/o;->close()V

    .line 8
    goto :goto_1

    :goto_0
    throw v0

    :goto_1
    goto :goto_0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/kwad/sdk/pngencrypt/o;->aMq:Lcom/kwad/sdk/pngencrypt/k;

    invoke-virtual {v1}, Lcom/kwad/sdk/pngencrypt/k;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " interlaced="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/kwad/sdk/pngencrypt/o;->aMM:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
