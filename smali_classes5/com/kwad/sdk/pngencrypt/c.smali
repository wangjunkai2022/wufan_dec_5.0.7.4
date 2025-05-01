.class public final Lcom/kwad/sdk/pngencrypt/c;
.super Lcom/kwad/sdk/pngencrypt/b;
.source "SourceFile"


# instance fields
.field private aLA:Z

.field private aLB:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private aLC:J

.field private aLD:J

.field private aLE:J

.field private aLF:Lcom/kwad/sdk/pngencrypt/g;

.field private aLG:Lcom/kwad/sdk/pngencrypt/chunk/ChunkLoadBehaviour;

.field protected aLs:Lcom/kwad/sdk/pngencrypt/k;

.field protected aLt:Lcom/kwad/sdk/pngencrypt/k;

.field protected aLu:Lcom/kwad/sdk/pngencrypt/e;

.field protected aLv:I

.field protected aLw:Lcom/kwad/sdk/pngencrypt/chunk/e;

.field protected final aLx:Z

.field private aLy:J

.field private aLz:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/b;-><init>()V

    const/4 p1, -0x1

    .line 2
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLv:I

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLw:Lcom/kwad/sdk/pngencrypt/chunk/e;

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLy:J

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLz:Z

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLA:Z

    .line 7
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lcom/kwad/sdk/pngencrypt/c;->aLB:Ljava/util/Set;

    .line 8
    iput-wide v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLC:J

    .line 9
    iput-wide v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLD:J

    .line 10
    iput-wide v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLE:J

    .line 11
    sget-object v0, Lcom/kwad/sdk/pngencrypt/chunk/ChunkLoadBehaviour;->LOAD_CHUNK_ALWAYS:Lcom/kwad/sdk/pngencrypt/chunk/ChunkLoadBehaviour;

    iput-object v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLG:Lcom/kwad/sdk/pngencrypt/chunk/ChunkLoadBehaviour;

    .line 12
    iput-boolean p1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLx:Z

    .line 13
    new-instance p1, Lcom/kwad/sdk/pngencrypt/chunk/a;

    invoke-direct {p1}, Lcom/kwad/sdk/pngencrypt/chunk/a;-><init>()V

    iput-object p1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLF:Lcom/kwad/sdk/pngencrypt/g;

    return-void
.end method

.method private Ko()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLv:I

    return v0
.end method

.method private Kt()Lcom/kwad/sdk/pngencrypt/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLt:Lcom/kwad/sdk/pngencrypt/k;

    return-object v0
.end method

.method private go(Ljava/lang/String;)V
    .locals 4

    const-string v0, "IHDR"

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "unexpected chunk "

    if-eqz v0, :cond_1

    .line 2
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLv:I

    if-gez v0, :cond_0

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLv:I

    return-void

    .line 4
    :cond_0
    new-instance v0, Lcom/kwad/sdk/pngencrypt/PngjException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/kwad/sdk/pngencrypt/PngjException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    const-string v0, "PLTE"

    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    .line 6
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLv:I

    if-eqz v0, :cond_3

    if-ne v0, v2, :cond_2

    goto :goto_0

    .line 7
    :cond_2
    new-instance v0, Lcom/kwad/sdk/pngencrypt/PngjException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unexpected chunk here "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/kwad/sdk/pngencrypt/PngjException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    return-void

    :cond_3
    :goto_0
    const/4 p1, 0x2

    .line 8
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLv:I

    return-void

    :cond_4
    const-string v0, "IDAT"

    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x4

    if-eqz v0, :cond_6

    .line 10
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLv:I

    if-ltz v0, :cond_5

    if-gt v0, v3, :cond_5

    .line 11
    iput v3, p0, Lcom/kwad/sdk/pngencrypt/c;->aLv:I

    return-void

    .line 12
    :cond_5
    new-instance v0, Lcom/kwad/sdk/pngencrypt/PngjException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/kwad/sdk/pngencrypt/PngjException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    return-void

    :cond_6
    const-string v0, "IEND"

    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 14
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLv:I

    if-lt v0, v3, :cond_7

    const/4 p1, 0x6

    .line 15
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLv:I

    return-void

    .line 16
    :cond_7
    new-instance v0, Lcom/kwad/sdk/pngencrypt/PngjException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/kwad/sdk/pngencrypt/PngjException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    return-void

    .line 17
    :cond_8
    iget p1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLv:I

    if-gt p1, v2, :cond_9

    .line 18
    iput v2, p0, Lcom/kwad/sdk/pngencrypt/c;->aLv:I

    return-void

    :cond_9
    const/4 v0, 0x3

    if-gt p1, v0, :cond_a

    .line 19
    iput v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLv:I

    return-void

    :cond_a
    const/4 p1, 0x5

    .line 20
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLv:I

    return-void
.end method

.method private static gp(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/pngencrypt/chunk/b;->gs(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method protected final Kj()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLz:Z

    return v0
.end method

.method public final Kp()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/c;->Ko()I

    move-result v0

    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Kq()Lcom/kwad/sdk/pngencrypt/j;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/pngencrypt/b;->Kl()Lcom/kwad/sdk/pngencrypt/DeflatedChunksSet;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lcom/kwad/sdk/pngencrypt/j;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/kwad/sdk/pngencrypt/j;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final Kr()Lcom/kwad/sdk/pngencrypt/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLs:Lcom/kwad/sdk/pngencrypt/k;

    return-object v0
.end method

.method public final Ks()Lcom/kwad/sdk/pngencrypt/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLu:Lcom/kwad/sdk/pngencrypt/e;

    return-object v0
.end method

.method protected final a(Lcom/kwad/sdk/pngencrypt/ChunkReader;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/pngencrypt/b;->a(Lcom/kwad/sdk/pngencrypt/ChunkReader;)V

    .line 2
    invoke-virtual {p1}, Lcom/kwad/sdk/pngencrypt/ChunkReader;->Kh()Lcom/kwad/sdk/pngencrypt/chunk/d;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/sdk/pngencrypt/chunk/d;->ahY:Ljava/lang/String;

    const-string v1, "IHDR"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    new-instance v0, Lcom/kwad/sdk/pngencrypt/chunk/i;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/kwad/sdk/pngencrypt/chunk/i;-><init>(Lcom/kwad/sdk/pngencrypt/k;)V

    .line 4
    invoke-virtual {p1}, Lcom/kwad/sdk/pngencrypt/ChunkReader;->Kh()Lcom/kwad/sdk/pngencrypt/chunk/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/pngencrypt/chunk/i;->a(Lcom/kwad/sdk/pngencrypt/chunk/d;)V

    .line 5
    invoke-virtual {v0}, Lcom/kwad/sdk/pngencrypt/chunk/i;->Lc()Lcom/kwad/sdk/pngencrypt/k;

    move-result-object v1

    iput-object v1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLs:Lcom/kwad/sdk/pngencrypt/k;

    .line 6
    iput-object v1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLt:Lcom/kwad/sdk/pngencrypt/k;

    .line 7
    invoke-virtual {v0}, Lcom/kwad/sdk/pngencrypt/chunk/i;->La()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    new-instance v0, Lcom/kwad/sdk/pngencrypt/e;

    iget-object v1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLt:Lcom/kwad/sdk/pngencrypt/k;

    invoke-direct {v0, v1}, Lcom/kwad/sdk/pngencrypt/e;-><init>(Lcom/kwad/sdk/pngencrypt/k;)V

    iput-object v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLu:Lcom/kwad/sdk/pngencrypt/e;

    .line 9
    :cond_0
    new-instance v0, Lcom/kwad/sdk/pngencrypt/chunk/e;

    iget-object v1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLs:Lcom/kwad/sdk/pngencrypt/k;

    invoke-direct {v0, v1}, Lcom/kwad/sdk/pngencrypt/chunk/e;-><init>(Lcom/kwad/sdk/pngencrypt/k;)V

    iput-object v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLw:Lcom/kwad/sdk/pngencrypt/chunk/e;

    .line 10
    :cond_1
    iget-object v0, p1, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aKZ:Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;

    sget-object v1, Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;->BUFFER:Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Lcom/kwad/sdk/pngencrypt/ChunkReader;->Kh()Lcom/kwad/sdk/pngencrypt/chunk/d;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/sdk/pngencrypt/chunk/d;->ahY:Ljava/lang/String;

    invoke-static {v0}, Lcom/kwad/sdk/pngencrypt/c;->gp(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    iget-wide v2, p0, Lcom/kwad/sdk/pngencrypt/c;->aLy:J

    invoke-virtual {p1}, Lcom/kwad/sdk/pngencrypt/ChunkReader;->Kh()Lcom/kwad/sdk/pngencrypt/chunk/d;

    move-result-object v0

    iget v0, v0, Lcom/kwad/sdk/pngencrypt/chunk/d;->len:I

    int-to-long v4, v0

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/kwad/sdk/pngencrypt/c;->aLy:J

    .line 12
    :cond_2
    iget-object v0, p1, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aKZ:Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;

    if-eq v0, v1, :cond_4

    iget-boolean v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLA:Z

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    return-void

    .line 13
    :cond_4
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLF:Lcom/kwad/sdk/pngencrypt/g;

    invoke-virtual {p1}, Lcom/kwad/sdk/pngencrypt/ChunkReader;->Kh()Lcom/kwad/sdk/pngencrypt/chunk/d;

    move-result-object p1

    invoke-virtual {p0}, Lcom/kwad/sdk/pngencrypt/c;->Kr()Lcom/kwad/sdk/pngencrypt/k;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/kwad/sdk/pngencrypt/g;->a(Lcom/kwad/sdk/pngencrypt/chunk/d;Lcom/kwad/sdk/pngencrypt/k;)Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;

    move-result-object p1

    .line 14
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLw:Lcom/kwad/sdk/pngencrypt/chunk/e;

    iget v1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLv:I

    invoke-virtual {v0, p1, v1}, Lcom/kwad/sdk/pngencrypt/chunk/e;->a(Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;I)V
    :try_end_0
    .catch Lcom/kwad/sdk/pngencrypt/PngjException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 15
    throw p1
.end method

.method public final aH(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLC:J

    return-void
.end method

.method public final aI(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLD:J

    return-void
.end method

.method public final aJ(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLE:J

    return-void
.end method

.method public final b([BII)I
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/kwad/sdk/pngencrypt/b;->b([BII)I

    move-result p1

    return p1
.end method

.method public final bH(Z)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLz:Z

    return-void
.end method

.method protected final c(ILjava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lcom/kwad/sdk/pngencrypt/c;->go(Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1, p2, p3, p4}, Lcom/kwad/sdk/pngencrypt/b;->c(ILjava/lang/String;J)V

    return-void
.end method

.method public final close()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLv:I

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    .line 2
    iput v1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLv:I

    .line 3
    :cond_0
    invoke-super {p0}, Lcom/kwad/sdk/pngencrypt/b;->close()V

    return-void
.end method

.method protected final gm(Ljava/lang/String;)Lcom/kwad/sdk/pngencrypt/DeflatedChunksSet;
    .locals 4

    .line 1
    new-instance v0, Lcom/kwad/sdk/pngencrypt/j;

    iget-boolean v1, p0, Lcom/kwad/sdk/pngencrypt/c;->aLx:Z

    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/c;->Kt()Lcom/kwad/sdk/pngencrypt/k;

    move-result-object v2

    iget-object v3, p0, Lcom/kwad/sdk/pngencrypt/c;->aLu:Lcom/kwad/sdk/pngencrypt/e;

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/kwad/sdk/pngencrypt/j;-><init>(Ljava/lang/String;ZLcom/kwad/sdk/pngencrypt/k;Lcom/kwad/sdk/pngencrypt/e;)V

    return-object v0
.end method

.method protected final gn(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "IDAT"

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final v(ILjava/lang/String;)Z
    .locals 10

    .line 1
    invoke-super {p0, p1, p2}, Lcom/kwad/sdk/pngencrypt/b;->v(ILjava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-wide v2, p0, Lcom/kwad/sdk/pngencrypt/c;->aLC:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    int-to-long v2, p1

    invoke-virtual {p0}, Lcom/kwad/sdk/pngencrypt/b;->Kk()J

    move-result-wide v6

    add-long/2addr v2, v6

    iget-wide v6, p0, Lcom/kwad/sdk/pngencrypt/c;->aLC:J

    cmp-long v0, v2, v6

    if-lez v0, :cond_1

    .line 3
    new-instance v0, Lcom/kwad/sdk/pngencrypt/PngjException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Maximum total bytes to read exceeeded: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v6, p0, Lcom/kwad/sdk/pngencrypt/c;->aLC:J

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " offset:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {p0}, Lcom/kwad/sdk/pngencrypt/b;->Kk()J

    move-result-wide v6

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " len="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/kwad/sdk/pngencrypt/PngjException;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLB:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    .line 7
    :cond_2
    invoke-static {p2}, Lcom/kwad/sdk/pngencrypt/chunk/b;->gs(Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    return v2

    .line 8
    :cond_3
    iget-wide v6, p0, Lcom/kwad/sdk/pngencrypt/c;->aLD:J

    cmp-long v0, v6, v4

    if-lez v0, :cond_4

    int-to-long v8, p1

    cmp-long v0, v8, v6

    if-lez v0, :cond_4

    return v1

    .line 9
    :cond_4
    iget-wide v6, p0, Lcom/kwad/sdk/pngencrypt/c;->aLE:J

    cmp-long v0, v6, v4

    if-lez v0, :cond_5

    int-to-long v3, p1

    iget-wide v8, p0, Lcom/kwad/sdk/pngencrypt/c;->aLy:J

    sub-long/2addr v6, v8

    cmp-long p1, v3, v6

    if-lez p1, :cond_5

    return v1

    .line 10
    :cond_5
    sget-object p1, Lcom/kwad/sdk/pngencrypt/c$1;->aLH:[I

    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/c;->aLG:Lcom/kwad/sdk/pngencrypt/chunk/ChunkLoadBehaviour;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p1, p1, v0

    if-eq p1, v1, :cond_7

    const/4 p2, 0x2

    if-eq p1, p2, :cond_6

    goto :goto_0

    :cond_6
    return v1

    .line 11
    :cond_7
    invoke-static {p2}, Lcom/kwad/sdk/pngencrypt/chunk/b;->gu(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_8

    return v1

    :cond_8
    :goto_0
    return v2
.end method
