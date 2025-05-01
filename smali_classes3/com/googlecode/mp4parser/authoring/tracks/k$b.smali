.class Lcom/googlecode/mp4parser/authoring/tracks/k$b;
.super Ljava/lang/Object;
.source "DTSTrackImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/mp4parser/authoring/tracks/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field b:J

.field c:I

.field d:Lcom/googlecode/mp4parser/e;

.field e:J

.field f:Ljava/nio/ByteBuffer;

.field g:J

.field final synthetic h:Lcom/googlecode/mp4parser/authoring/tracks/k;


# direct methods
.method constructor <init>(Lcom/googlecode/mp4parser/authoring/tracks/k;Lcom/googlecode/mp4parser/e;JJI)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->h:Lcom/googlecode/mp4parser/authoring/tracks/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c:I

    .line 3
    iput-object p2, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->d:Lcom/googlecode/mp4parser/e;

    .line 4
    iput-wide p3, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->b:J

    add-long/2addr p5, p3

    .line 5
    iput-wide p5, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->e:J

    .line 6
    iput p7, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->a:I

    .line 7
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->d()V

    return-void
.end method

.method private a()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c:I

    return-void
.end method

.method private b()V
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->b:J

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c:I

    int-to-long v3, v2

    add-long/2addr v0, v3

    iput-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->g:J

    add-int/lit8 v2, v2, 0x4

    .line 2
    iput v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c:I

    return-void
.end method

.method private c()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c:I

    add-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c:I

    return-void
.end method

.method private d()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, "Fill Buffer"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->d:Lcom/googlecode/mp4parser/e;

    iget-wide v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->b:J

    iget-wide v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->e:J

    sub-long/2addr v3, v1

    const-wide/32 v5, 0x4000000

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/googlecode/mp4parser/e;->Q(JJ)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->f:Ljava/nio/ByteBuffer;

    return-void
.end method

.method private f()Ljava/nio/ByteBuffer;
    .locals 7

    .line 1
    iget-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->g:J

    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->b:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    .line 2
    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->f:Ljava/nio/ByteBuffer;

    sub-long/2addr v0, v2

    long-to-int v1, v0

    invoke-virtual {v4, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 3
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 4
    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c:I

    int-to-long v1, v1

    iget-wide v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->g:J

    iget-wide v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->b:J

    sub-long/2addr v3, v5

    sub-long/2addr v1, v3

    long-to-int v2, v1

    invoke-virtual {v0, v2}, Ljava/nio/Buffer;->limit(I)Ljava/nio/Buffer;

    return-object v0

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "damn! NAL exceeds buffer"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private g(BBBB)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c:I

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x4

    if-lt v0, v3, :cond_1

    .line 2
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    if-ne v0, p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->f:Ljava/nio/ByteBuffer;

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    if-ne p1, p2, :cond_0

    .line 4
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->f:Ljava/nio/ByteBuffer;

    iget p2, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c:I

    add-int/lit8 p2, p2, 0x2

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    if-ne p1, p3, :cond_0

    .line 5
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->f:Ljava/nio/ByteBuffer;

    iget p2, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c:I

    add-int/lit8 p2, p2, 0x3

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    if-ne p1, p4, :cond_0

    return v1

    :cond_0
    return v2

    .line 6
    :cond_1
    iget-wide p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->b:J

    int-to-long p3, v1

    add-long/2addr p1, p3

    const-wide/16 p3, 0x4

    add-long/2addr p1, p3

    iget-object p3, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->d:Lcom/googlecode/mp4parser/e;

    invoke-interface {p3}, Lcom/googlecode/mp4parser/e;->size()J

    move-result-wide p3

    cmp-long v0, p1, p3

    if-gez v0, :cond_2

    return v2

    .line 7
    :cond_2
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1
.end method

.method private h()Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x64

    const/16 v1, 0x58

    const/16 v2, 0x20

    const/16 v3, 0x25

    .line 1
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->g(BBBB)Z

    move-result v0

    return v0
.end method

.method private i()Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x64

    const/16 v1, 0x58

    const/16 v2, 0x20

    const/16 v3, 0x25

    .line 1
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->l(BBBB)Z

    move-result v0

    return v0
.end method

.method private j()Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x7f

    const/4 v1, -0x2

    const/16 v2, -0x80

    const/4 v3, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->g(BBBB)Z

    move-result v0

    return v0
.end method

.method private k()Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x7f

    const/4 v1, -0x2

    const/16 v2, -0x80

    const/4 v3, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->l(BBBB)Z

    move-result v0

    return v0
.end method

.method private l(BBBB)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c:I

    sub-int/2addr v0, v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x4

    if-lt v0, v4, :cond_2

    .line 2
    iget-wide v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->b:J

    int-to-long v0, v1

    add-long/2addr v4, v0

    const-wide/32 v0, 0x100000

    rem-long/2addr v4, v0

    const-wide/16 v0, 0x0

    cmp-long v6, v4, v0

    if-nez v6, :cond_0

    .line 3
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->b:J

    iget v6, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c:I

    int-to-long v6, v6

    add-long/2addr v4, v6

    const-wide/16 v6, 0x400

    div-long/2addr v4, v6

    div-long/2addr v4, v6

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->f:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    if-ne v0, p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->f:Ljava/nio/ByteBuffer;

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c:I

    add-int/2addr v0, v2

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    if-ne p1, p2, :cond_1

    .line 6
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->f:Ljava/nio/ByteBuffer;

    iget p2, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c:I

    add-int/lit8 p2, p2, 0x2

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    if-ne p1, p3, :cond_1

    .line 7
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->f:Ljava/nio/ByteBuffer;

    iget p2, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c:I

    add-int/lit8 p2, p2, 0x3

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    if-ne p1, p4, :cond_1

    return v2

    :cond_1
    return v3

    .line 8
    :cond_2
    iget-wide p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->b:J

    int-to-long p3, v1

    add-long/2addr p3, p1

    const-wide/16 v4, 0x4

    add-long/2addr p3, v4

    iget-wide v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->e:J

    cmp-long v0, p3, v4

    if-lez v0, :cond_4

    int-to-long p3, v1

    add-long/2addr p1, p3

    cmp-long p3, p1, v4

    if-nez p3, :cond_3

    return v2

    :cond_3
    return v3

    .line 9
    :cond_4
    iget-wide p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->g:J

    iput-wide p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->b:J

    .line 10
    iput v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c:I

    .line 11
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->d()V

    .line 12
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->j()Z

    move-result p1

    return p1
.end method


# virtual methods
.method public e()Ljava/nio/ByteBuffer;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :goto_0
    :try_start_0
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->j()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2
    :goto_1
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->b()V

    .line 3
    :goto_2
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->a:I

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_3

    :cond_1
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4
    :goto_3
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->f()Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0

    .line 5
    :cond_2
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->c()V

    goto :goto_2

    .line 6
    :cond_3
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->a()V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
