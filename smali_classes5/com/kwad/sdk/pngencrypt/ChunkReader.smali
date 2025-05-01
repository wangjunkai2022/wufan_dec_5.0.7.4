.class public abstract Lcom/kwad/sdk/pngencrypt/ChunkReader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/pngencrypt/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;
    }
.end annotation


# instance fields
.field public final aKZ:Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;

.field private final aLa:Lcom/kwad/sdk/pngencrypt/chunk/d;

.field protected aLb:I

.field private aLc:I

.field private aLd:Z

.field protected aLe:Lcom/kwad/sdk/pngencrypt/ErrorBehaviour;


# direct methods
.method public constructor <init>(ILjava/lang/String;JLcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLb:I

    .line 3
    iput v0, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLc:I

    .line 4
    sget-object v1, Lcom/kwad/sdk/pngencrypt/ErrorBehaviour;->STRICT:Lcom/kwad/sdk/pngencrypt/ErrorBehaviour;

    iput-object v1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLe:Lcom/kwad/sdk/pngencrypt/ErrorBehaviour;

    if-eqz p5, :cond_0

    .line 5
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    if-gez p1, :cond_1

    .line 6
    :cond_0
    new-instance v1, Lcom/kwad/sdk/pngencrypt/PngjException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Bad chunk paramenters: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/kwad/sdk/pngencrypt/PngjException;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    .line 7
    :cond_1
    iput-object p5, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aKZ:Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;

    .line 8
    new-instance v1, Lcom/kwad/sdk/pngencrypt/chunk/d;

    sget-object v2, Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;->BUFFER:Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;

    const/4 v3, 0x1

    if-ne p5, v2, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    invoke-direct {v1, p1, p2, v2}, Lcom/kwad/sdk/pngencrypt/chunk/d;-><init>(ILjava/lang/String;Z)V

    iput-object v1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLa:Lcom/kwad/sdk/pngencrypt/chunk/d;

    .line 9
    invoke-virtual {v1, p3, p4}, Lcom/kwad/sdk/pngencrypt/chunk/d;->aK(J)V

    .line 10
    sget-object p1, Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;->SKIP:Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;

    if-ne p5, p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLd:Z

    return-void
.end method


# virtual methods
.method public final Kh()Lcom/kwad/sdk/pngencrypt/chunk/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLa:Lcom/kwad/sdk/pngencrypt/chunk/d;

    return-object v0
.end method

.method protected abstract Ki()V
.end method

.method protected abstract a(I[BII)V
.end method

.method public final b([BII)I
    .locals 6

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    :cond_0
    if-gez p3, :cond_1

    .line 1
    new-instance v1, Lcom/kwad/sdk/pngencrypt/PngjException;

    const-string v2, "negative length??"

    invoke-direct {v1, v2}, Lcom/kwad/sdk/pngencrypt/PngjException;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    .line 2
    :cond_1
    iget v1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLb:I

    const/4 v2, 0x4

    if-nez v1, :cond_2

    iget v1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLc:I

    if-nez v1, :cond_2

    iget-boolean v1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLd:Z

    if-eqz v1, :cond_2

    .line 3
    iget-object v1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLa:Lcom/kwad/sdk/pngencrypt/chunk/d;

    iget-object v3, v1, Lcom/kwad/sdk/pngencrypt/chunk/d;->aNh:[B

    invoke-virtual {v1, v3, v0, v2}, Lcom/kwad/sdk/pngencrypt/chunk/d;->f([BII)V

    .line 4
    :cond_2
    iget-object v1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLa:Lcom/kwad/sdk/pngencrypt/chunk/d;

    iget v3, v1, Lcom/kwad/sdk/pngencrypt/chunk/d;->len:I

    iget v4, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLb:I

    sub-int/2addr v3, v4

    if-le v3, p3, :cond_3

    move v3, p3

    :cond_3
    if-gtz v3, :cond_4

    .line 5
    iget v4, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLc:I

    if-nez v4, :cond_8

    .line 6
    :cond_4
    iget-boolean v4, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLd:Z

    if-eqz v4, :cond_5

    iget-object v4, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aKZ:Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;

    sget-object v5, Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;->BUFFER:Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;

    if-eq v4, v5, :cond_5

    if-lez v3, :cond_5

    .line 7
    invoke-virtual {v1, p1, p2, v3}, Lcom/kwad/sdk/pngencrypt/chunk/d;->f([BII)V

    .line 8
    :cond_5
    iget-object v1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aKZ:Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;

    sget-object v4, Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;->BUFFER:Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;

    if-ne v1, v4, :cond_6

    .line 9
    iget-object v1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLa:Lcom/kwad/sdk/pngencrypt/chunk/d;

    iget-object v1, v1, Lcom/kwad/sdk/pngencrypt/chunk/d;->data:[B

    if-eq v1, p1, :cond_7

    if-lez v3, :cond_7

    .line 10
    iget v4, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLb:I

    invoke-static {p1, p2, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 11
    :cond_6
    sget-object v4, Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;->PROCESS:Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;

    if-ne v1, v4, :cond_7

    .line 12
    iget v1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLb:I

    invoke-virtual {p0, v1, p1, p2, v3}, Lcom/kwad/sdk/pngencrypt/ChunkReader;->a(I[BII)V

    .line 13
    :cond_7
    :goto_0
    iget v1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLb:I

    add-int/2addr v1, v3

    iput v1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLb:I

    add-int/2addr p2, v3

    sub-int/2addr p3, v3

    .line 14
    :cond_8
    iget v1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLb:I

    iget-object v4, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLa:Lcom/kwad/sdk/pngencrypt/chunk/d;

    iget v5, v4, Lcom/kwad/sdk/pngencrypt/chunk/d;->len:I

    if-ne v1, v5, :cond_f

    .line 15
    iget v1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLc:I

    rsub-int/lit8 v5, v1, 0x4

    if-le v5, p3, :cond_9

    goto :goto_1

    :cond_9
    move p3, v5

    :goto_1
    if-lez p3, :cond_e

    .line 16
    iget-object v4, v4, Lcom/kwad/sdk/pngencrypt/chunk/d;->aNj:[B

    if-eq p1, v4, :cond_a

    .line 17
    invoke-static {p1, p2, v4, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 18
    :cond_a
    iget p1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLc:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLc:I

    if-ne p1, v2, :cond_e

    .line 19
    iget-boolean p1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLd:Z

    if-eqz p1, :cond_d

    .line 20
    iget-object p1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aKZ:Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;

    sget-object p2, Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;->BUFFER:Lcom/kwad/sdk/pngencrypt/ChunkReader$ChunkReaderMode;

    if-ne p1, p2, :cond_b

    .line 21
    iget-object p1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLa:Lcom/kwad/sdk/pngencrypt/chunk/d;

    iget-object p2, p1, Lcom/kwad/sdk/pngencrypt/chunk/d;->data:[B

    iget v1, p1, Lcom/kwad/sdk/pngencrypt/chunk/d;->len:I

    invoke-virtual {p1, p2, v0, v1}, Lcom/kwad/sdk/pngencrypt/chunk/d;->f([BII)V

    .line 22
    :cond_b
    iget-object p1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLa:Lcom/kwad/sdk/pngencrypt/chunk/d;

    iget-object p2, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLe:Lcom/kwad/sdk/pngencrypt/ErrorBehaviour;

    sget-object v1, Lcom/kwad/sdk/pngencrypt/ErrorBehaviour;->STRICT:Lcom/kwad/sdk/pngencrypt/ErrorBehaviour;

    if-ne p2, v1, :cond_c

    const/4 v0, 0x1

    :cond_c
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/pngencrypt/chunk/d;->bI(Z)V

    .line 23
    :cond_d
    invoke-virtual {p0}, Lcom/kwad/sdk/pngencrypt/ChunkReader;->Ki()V

    :cond_e
    move v0, p3

    :cond_f
    if-gtz v3, :cond_11

    if-lez v0, :cond_10

    goto :goto_2

    :cond_10
    const/4 p1, -0x1

    return p1

    :cond_11
    :goto_2
    add-int/2addr v3, v0

    return v3
.end method

.method public final bG(Z)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLd:Z

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 1
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    .line 2
    :cond_2
    check-cast p1, Lcom/kwad/sdk/pngencrypt/ChunkReader;

    .line 3
    iget-object v2, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLa:Lcom/kwad/sdk/pngencrypt/chunk/d;

    if-nez v2, :cond_3

    .line 4
    iget-object p1, p1, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLa:Lcom/kwad/sdk/pngencrypt/chunk/d;

    if-eqz p1, :cond_4

    return v1

    .line 5
    :cond_3
    iget-object p1, p1, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLa:Lcom/kwad/sdk/pngencrypt/chunk/d;

    invoke-virtual {v2, p1}, Lcom/kwad/sdk/pngencrypt/chunk/d;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLa:Lcom/kwad/sdk/pngencrypt/chunk/d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/kwad/sdk/pngencrypt/chunk/d;->hashCode()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public final isDone()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLc:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/pngencrypt/ChunkReader;->aLa:Lcom/kwad/sdk/pngencrypt/chunk/d;

    invoke-virtual {v0}, Lcom/kwad/sdk/pngencrypt/chunk/d;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
