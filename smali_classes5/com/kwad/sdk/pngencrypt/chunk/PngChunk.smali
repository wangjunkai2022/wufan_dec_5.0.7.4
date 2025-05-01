.class public abstract Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/pngencrypt/chunk/PngChunk$ChunkOrderingConstraint;
    }
.end annotation


# instance fields
.field protected final aMq:Lcom/kwad/sdk/pngencrypt/k;

.field public final aNq:Z

.field public final aNr:Z

.field public final aNs:Z

.field protected aNt:Lcom/kwad/sdk/pngencrypt/chunk/d;

.field private aNu:Z

.field protected aNv:I

.field public final ahY:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/kwad/sdk/pngencrypt/k;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;->aNu:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;->aNv:I

    .line 4
    iput-object p1, p0, Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;->ahY:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;->aMq:Lcom/kwad/sdk/pngencrypt/k;

    .line 6
    invoke-static {p1}, Lcom/kwad/sdk/pngencrypt/chunk/b;->gs(Ljava/lang/String;)Z

    move-result p2

    iput-boolean p2, p0, Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;->aNq:Z

    .line 7
    invoke-static {p1}, Lcom/kwad/sdk/pngencrypt/chunk/b;->gt(Ljava/lang/String;)Z

    move-result p2

    iput-boolean p2, p0, Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;->aNr:Z

    .line 8
    invoke-static {p1}, Lcom/kwad/sdk/pngencrypt/chunk/b;->gu(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;->aNs:Z

    return-void
.end method

.method private KU()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;->aNt:Lcom/kwad/sdk/pngencrypt/chunk/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/kwad/sdk/pngencrypt/chunk/d;->KU()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method private KW()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;->aNt:Lcom/kwad/sdk/pngencrypt/chunk/d;

    if-eqz v0, :cond_0

    iget v0, v0, Lcom/kwad/sdk/pngencrypt/chunk/d;->len:I

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method


# virtual methods
.method protected abstract a(Lcom/kwad/sdk/pngencrypt/chunk/d;)V
.end method

.method final b(Lcom/kwad/sdk/pngencrypt/chunk/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;->aNt:Lcom/kwad/sdk/pngencrypt/chunk/d;

    return-void
.end method

.method final dO(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;->aNv:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "chunk id= "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;->ahY:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (len="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;->KW()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/kwad/sdk/pngencrypt/chunk/PngChunk;->KU()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
