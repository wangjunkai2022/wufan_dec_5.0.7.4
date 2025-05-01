.class Lcom/googlecode/mp4parser/authoring/builder/d$b;
.super Ljava/lang/Object;
.source "FragmentedMp4Builder.java"

# interfaces
.implements Lcom/coremedia/iso/boxes/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/googlecode/mp4parser/authoring/builder/d;->f(JJLcom/googlecode/mp4parser/authoring/h;I)Lcom/coremedia/iso/boxes/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field b:Lcom/coremedia/iso/boxes/j;

.field c:J

.field final synthetic d:Lcom/googlecode/mp4parser/authoring/builder/d;

.field private final synthetic e:J

.field private final synthetic f:J

.field private final synthetic g:Lcom/googlecode/mp4parser/authoring/h;

.field private final synthetic h:I


# direct methods
.method constructor <init>(Lcom/googlecode/mp4parser/authoring/builder/d;JJLcom/googlecode/mp4parser/authoring/h;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->d:Lcom/googlecode/mp4parser/authoring/builder/d;

    iput-wide p2, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->e:J

    iput-wide p4, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->f:J

    iput-object p6, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->g:Lcom/googlecode/mp4parser/authoring/h;

    iput p7, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 p1, -0x1

    .line 2
    iput-wide p1, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->c:J

    return-void
.end method


# virtual methods
.method public a(Ljava/nio/channels/WritableByteChannel;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x8

    .line 1
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/builder/d$b;->getSize()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/googlecode/mp4parser/util/c;->a(J)I

    move-result v1

    int-to-long v1, v1

    invoke-static {v0, v1, v2}, Lcom/coremedia/iso/i;->i(Ljava/nio/ByteBuffer;J)V

    .line 3
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/builder/d$b;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/coremedia/iso/f;->C(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 4
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 5
    invoke-interface {p1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 6
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->d:Lcom/googlecode/mp4parser/authoring/builder/d;

    iget-wide v3, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->e:J

    iget-wide v5, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->f:J

    iget-object v7, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->g:Lcom/googlecode/mp4parser/authoring/h;

    iget v8, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->h:I

    invoke-virtual/range {v2 .. v8}, Lcom/googlecode/mp4parser/authoring/builder/d;->H(JJLcom/googlecode/mp4parser/authoring/h;I)Ljava/util/List;

    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/googlecode/mp4parser/authoring/f;

    .line 8
    invoke-interface {v1, p1}, Lcom/googlecode/mp4parser/authoring/f;->b(Ljava/nio/channels/WritableByteChannel;)V

    goto :goto_0
.end method

.method public getParent()Lcom/coremedia/iso/boxes/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->b:Lcom/coremedia/iso/boxes/j;

    return-object v0
.end method

.method public getSize()J
    .locals 9

    .line 1
    iget-wide v0, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->c:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x8

    .line 2
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->d:Lcom/googlecode/mp4parser/authoring/builder/d;

    iget-wide v3, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->e:J

    iget-wide v5, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->f:J

    iget-object v7, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->g:Lcom/googlecode/mp4parser/authoring/h;

    iget v8, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->h:I

    invoke-virtual/range {v2 .. v8}, Lcom/googlecode/mp4parser/authoring/builder/d;->H(JJLcom/googlecode/mp4parser/authoring/h;I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 3
    iput-wide v0, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->c:J

    return-wide v0

    .line 4
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/googlecode/mp4parser/authoring/f;

    .line 5
    invoke-interface {v3}, Lcom/googlecode/mp4parser/authoring/f;->getSize()J

    move-result-wide v3

    add-long/2addr v0, v3

    goto :goto_0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    const-string v0, "mdat"

    return-object v0
.end method

.method public j()J
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Doesn\'t have any meaning for programmatically created boxes"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
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
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/builder/d$b;->b:Lcom/coremedia/iso/boxes/j;

    return-void
.end method
