.class public Lcom/googlecode/mp4parser/authoring/tracks/c$a;
.super Ljava/lang/Object;
.source "AbstractH26XTrack.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/mp4parser/authoring/tracks/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:J

.field b:I

.field c:Lcom/googlecode/mp4parser/e;

.field d:Ljava/nio/ByteBuffer;

.field e:J


# direct methods
.method public constructor <init>(Lcom/googlecode/mp4parser/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->a:J

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->b:I

    .line 4
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->c:Lcom/googlecode/mp4parser/e;

    .line 5
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->c()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->b:I

    return-void
.end method

.method public b()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->b:I

    add-int/lit8 v0, v0, 0x3

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->b:I

    .line 2
    iget-wide v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->a:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->e:J

    return-void
.end method

.method public c()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->c:Lcom/googlecode/mp4parser/e;

    iget-wide v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->a:J

    invoke-interface {v0}, Lcom/googlecode/mp4parser/e;->size()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->a:J

    sub-long/2addr v3, v5

    sget v5, Lcom/googlecode/mp4parser/authoring/tracks/c;->k:I

    int-to-long v5, v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/googlecode/mp4parser/e;->Q(JJ)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->d:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public d()Ljava/nio/ByteBuffer;
    .locals 7

    .line 1
    iget-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->e:J

    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->a:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    .line 2
    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->d:Ljava/nio/ByteBuffer;

    sub-long/2addr v0, v2

    long-to-int v1, v0

    invoke-virtual {v4, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 3
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 4
    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->b:I

    int-to-long v1, v1

    iget-wide v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->e:J

    iget-wide v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->a:J

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

.method public e()Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->b:I

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x3

    if-lt v0, v4, :cond_2

    .line 2
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->d:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->b:I

    add-int/2addr v1, v3

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->d:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->b:I

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->d:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->b:I

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    if-ne v0, v3, :cond_1

    :cond_0
    return v3

    :cond_1
    return v2

    .line 5
    :cond_2
    iget-wide v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->a:J

    int-to-long v0, v1

    add-long/2addr v4, v0

    const-wide/16 v0, 0x3

    add-long/2addr v4, v0

    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->c:Lcom/googlecode/mp4parser/e;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/e;->size()J

    move-result-wide v0

    cmp-long v6, v4, v0

    if-lez v6, :cond_4

    .line 6
    iget-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->a:J

    iget v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->b:I

    int-to-long v4, v4

    add-long/2addr v0, v4

    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->c:Lcom/googlecode/mp4parser/e;

    invoke-interface {v4}, Lcom/googlecode/mp4parser/e;->size()J

    move-result-wide v4

    cmp-long v6, v0, v4

    if-nez v6, :cond_3

    return v3

    :cond_3
    return v2

    .line 7
    :cond_4
    iget-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->e:J

    iput-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->a:J

    .line 8
    iput v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->b:I

    .line 9
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->c()V

    .line 10
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->e()Z

    move-result v0

    return v0
.end method

.method public f()Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->b:I

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x3

    if-lt v0, v3, :cond_1

    .line 2
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->d:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->b:I

    const/4 v3, 0x1

    add-int/2addr v1, v3

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->d:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->b:I

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    if-ne v0, v3, :cond_0

    return v3

    :cond_0
    return v2

    .line 5
    :cond_1
    iget-wide v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->a:J

    int-to-long v0, v1

    add-long/2addr v3, v0

    const-wide/16 v0, 0x3

    add-long/2addr v3, v0

    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/c$a;->c:Lcom/googlecode/mp4parser/e;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/e;->size()J

    move-result-wide v0

    cmp-long v5, v3, v0

    if-gez v5, :cond_2

    return v2

    .line 6
    :cond_2
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method
