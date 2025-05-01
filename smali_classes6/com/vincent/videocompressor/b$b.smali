.class Lcom/vincent/videocompressor/b$b;
.super Ljava/lang/Object;
.source "MP4Builder.java"

# interfaces
.implements Lcom/coremedia/iso/boxes/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/vincent/videocompressor/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private b:Lcom/coremedia/iso/boxes/j;

.field private c:J

.field private d:J

.field final synthetic e:Lcom/vincent/videocompressor/b;


# direct methods
.method private constructor <init>(Lcom/vincent/videocompressor/b;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/vincent/videocompressor/b$b;->e:Lcom/vincent/videocompressor/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0x40000000

    .line 2
    iput-wide v0, p0, Lcom/vincent/videocompressor/b$b;->c:J

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lcom/vincent/videocompressor/b$b;->d:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/vincent/videocompressor/b;Lcom/vincent/videocompressor/b$a;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/vincent/videocompressor/b$b;-><init>(Lcom/vincent/videocompressor/b;)V

    return-void
.end method

.method private c(J)Z
    .locals 3

    const-wide/16 v0, 0x8

    add-long/2addr p1, v0

    const-wide v0, 0x100000000L

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public a(Ljava/nio/channels/WritableByteChannel;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x10

    .line 1
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lcom/vincent/videocompressor/b$b;->getSize()J

    move-result-wide v1

    .line 3
    invoke-direct {p0, v1, v2}, Lcom/vincent/videocompressor/b$b;->c(J)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    invoke-static {v0, v1, v2}, Lcom/coremedia/iso/i;->i(Ljava/nio/ByteBuffer;J)V

    goto :goto_0

    :cond_0
    const-wide/16 v3, 0x1

    .line 5
    invoke-static {v0, v3, v4}, Lcom/coremedia/iso/i;->i(Ljava/nio/ByteBuffer;J)V

    :goto_0
    const-string v3, "mdat"

    .line 6
    invoke-static {v3}, Lcom/coremedia/iso/f;->C(Ljava/lang/String;)[B

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 7
    invoke-direct {p0, v1, v2}, Lcom/vincent/videocompressor/b$b;->c(J)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v1, 0x8

    new-array v1, v1, [B

    .line 8
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    goto :goto_1

    .line 9
    :cond_1
    invoke-static {v0, v1, v2}, Lcom/coremedia/iso/i;->l(Ljava/nio/ByteBuffer;J)V

    .line 10
    :goto_1
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 11
    invoke-interface {p1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    return-void
.end method

.method public b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/vincent/videocompressor/b$b;->c:J

    return-wide v0
.end method

.method public e(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/vincent/videocompressor/b$b;->c:J

    return-void
.end method

.method public f(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/vincent/videocompressor/b$b;->d:J

    return-void
.end method

.method public getParent()Lcom/coremedia/iso/boxes/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/vincent/videocompressor/b$b;->b:Lcom/coremedia/iso/boxes/j;

    return-object v0
.end method

.method public getSize()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/vincent/videocompressor/b$b;->c:J

    const-wide/16 v2, 0x10

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    const-string v0, "mdat"

    return-object v0
.end method

.method public j()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/vincent/videocompressor/b$b;->d:J

    return-wide v0
.end method

.method public k(Lcom/googlecode/mp4parser/e;Ljava/nio/ByteBuffer;JLcom/coremedia/iso/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method public p(Lcom/coremedia/iso/boxes/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/vincent/videocompressor/b$b;->b:Lcom/coremedia/iso/boxes/j;

    return-void
.end method
