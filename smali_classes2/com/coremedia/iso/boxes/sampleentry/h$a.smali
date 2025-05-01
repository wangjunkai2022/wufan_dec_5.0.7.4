.class Lcom/coremedia/iso/boxes/sampleentry/h$a;
.super Ljava/lang/Object;
.source "VisualSampleEntry.java"

# interfaces
.implements Lcom/googlecode/mp4parser/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/coremedia/iso/boxes/sampleentry/h;->k(Lcom/googlecode/mp4parser/e;Ljava/nio/ByteBuffer;JLcom/coremedia/iso/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/coremedia/iso/boxes/sampleentry/h;

.field private final synthetic c:J

.field private final synthetic d:Lcom/googlecode/mp4parser/e;


# direct methods
.method constructor <init>(Lcom/coremedia/iso/boxes/sampleentry/h;JLcom/googlecode/mp4parser/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/coremedia/iso/boxes/sampleentry/h$a;->b:Lcom/coremedia/iso/boxes/sampleentry/h;

    iput-wide p2, p0, Lcom/coremedia/iso/boxes/sampleentry/h$a;->c:J

    iput-object p4, p0, Lcom/coremedia/iso/boxes/sampleentry/h$a;->d:Lcom/googlecode/mp4parser/e;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public G(J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/h$a;->d:Lcom/googlecode/mp4parser/e;

    invoke-interface {v0, p1, p2}, Lcom/googlecode/mp4parser/e;->G(J)V

    return-void
.end method

.method public Q(JJ)Ljava/nio/ByteBuffer;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/h$a;->d:Lcom/googlecode/mp4parser/e;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/googlecode/mp4parser/e;->Q(JJ)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/h$a;->d:Lcom/googlecode/mp4parser/e;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/e;->close()V

    return-void
.end method

.method public m(JJLjava/nio/channels/WritableByteChannel;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/h$a;->d:Lcom/googlecode/mp4parser/e;

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/googlecode/mp4parser/e;->m(JJLjava/nio/channels/WritableByteChannel;)J

    move-result-wide p1

    return-wide p1
.end method

.method public position()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/h$a;->d:Lcom/googlecode/mp4parser/e;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/e;->position()J

    move-result-wide v0

    return-wide v0
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/h$a;->c:J

    iget-object v2, p0, Lcom/coremedia/iso/boxes/sampleentry/h$a;->d:Lcom/googlecode/mp4parser/e;

    invoke-interface {v2}, Lcom/googlecode/mp4parser/e;->position()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 p1, -0x1

    return p1

    .line 2
    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, Lcom/coremedia/iso/boxes/sampleentry/h$a;->c:J

    iget-object v4, p0, Lcom/coremedia/iso/boxes/sampleentry/h$a;->d:Lcom/googlecode/mp4parser/e;

    invoke-interface {v4}, Lcom/googlecode/mp4parser/e;->position()J

    move-result-wide v4

    sub-long/2addr v2, v4

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    .line 3
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/h$a;->c:J

    iget-object v2, p0, Lcom/coremedia/iso/boxes/sampleentry/h$a;->d:Lcom/googlecode/mp4parser/e;

    invoke-interface {v2}, Lcom/googlecode/mp4parser/e;->position()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/c;->a(J)I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/coremedia/iso/boxes/sampleentry/h$a;->d:Lcom/googlecode/mp4parser/e;

    invoke-interface {v1, v0}, Lcom/googlecode/mp4parser/e;->read(Ljava/nio/ByteBuffer;)I

    .line 5
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 6
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result p1

    return p1

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/h$a;->d:Lcom/googlecode/mp4parser/e;

    invoke-interface {v0, p1}, Lcom/googlecode/mp4parser/e;->read(Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method

.method public size()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/h$a;->c:J

    return-wide v0
.end method
