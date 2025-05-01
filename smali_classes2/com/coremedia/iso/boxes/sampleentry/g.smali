.class public Lcom/coremedia/iso/boxes/sampleentry/g;
.super Lcom/coremedia/iso/boxes/sampleentry/a;
.source "TextSampleEntry.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/coremedia/iso/boxes/sampleentry/g$a;,
        Lcom/coremedia/iso/boxes/sampleentry/g$b;
    }
.end annotation


# static fields
.field public static final v:Ljava/lang/String; = "tx3g"

.field public static final w:Ljava/lang/String; = "enct"


# instance fields
.field private p:J

.field private q:I

.field private r:I

.field private s:[I

.field private t:Lcom/coremedia/iso/boxes/sampleentry/g$a;

.field private u:Lcom/coremedia/iso/boxes/sampleentry/g$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "tx3g"

    .line 1
    invoke-direct {p0, v0}, Lcom/coremedia/iso/boxes/sampleentry/a;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x4

    new-array v0, v0, [I

    .line 2
    iput-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->s:[I

    .line 3
    new-instance v0, Lcom/coremedia/iso/boxes/sampleentry/g$a;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/sampleentry/g$a;-><init>()V

    iput-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->t:Lcom/coremedia/iso/boxes/sampleentry/g$a;

    .line 4
    new-instance v0, Lcom/coremedia/iso/boxes/sampleentry/g$b;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/sampleentry/g$b;-><init>()V

    iput-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->u:Lcom/coremedia/iso/boxes/sampleentry/g$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/coremedia/iso/boxes/sampleentry/a;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x4

    new-array p1, p1, [I

    .line 6
    iput-object p1, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->s:[I

    .line 7
    new-instance p1, Lcom/coremedia/iso/boxes/sampleentry/g$a;

    invoke-direct {p1}, Lcom/coremedia/iso/boxes/sampleentry/g$a;-><init>()V

    iput-object p1, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->t:Lcom/coremedia/iso/boxes/sampleentry/g$a;

    .line 8
    new-instance p1, Lcom/coremedia/iso/boxes/sampleentry/g$b;

    invoke-direct {p1}, Lcom/coremedia/iso/boxes/sampleentry/g$b;-><init>()V

    iput-object p1, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->u:Lcom/coremedia/iso/boxes/sampleentry/g$b;

    return-void
.end method


# virtual methods
.method public C()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->s:[I

    return-object v0
.end method

.method public D()Lcom/coremedia/iso/boxes/sampleentry/g$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->t:Lcom/coremedia/iso/boxes/sampleentry/g$a;

    return-object v0
.end method

.method public E()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->q:I

    return v0
.end method

.method public J()Lcom/coremedia/iso/boxes/sampleentry/g$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->u:Lcom/coremedia/iso/boxes/sampleentry/g$b;

    return-object v0
.end method

.method public K()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->r:I

    return v0
.end method

.method public N()Z
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    const-wide/16 v2, 0x800

    and-long/2addr v0, v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public P()Z
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    const-wide/32 v2, 0x40000

    and-long/2addr v0, v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public S()Z
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    const-wide/16 v2, 0x180

    and-long/2addr v0, v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public T()Z
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    const-wide/16 v2, 0x20

    and-long/2addr v0, v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public V()Z
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    const-wide/16 v2, 0x40

    and-long/2addr v0, v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public W()Z
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    const-wide/32 v2, 0x20000

    and-long/2addr v0, v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public X([I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->s:[I

    return-void
.end method

.method public Y(Lcom/coremedia/iso/boxes/sampleentry/g$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->t:Lcom/coremedia/iso/boxes/sampleentry/g$a;

    return-void
.end method

.method public Z(Z)V
    .locals 4

    if-eqz p1, :cond_0

    .line 1
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    const-wide/16 v2, 0x800

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    goto :goto_0

    .line 2
    :cond_0
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    const-wide/16 v2, -0x801

    and-long/2addr v0, v2

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    :goto_0
    return-void
.end method

.method public a(Ljava/nio/channels/WritableByteChannel;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/b;->B()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    const/16 v0, 0x26

    .line 2
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x6

    .line 3
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 4
    iget v1, p0, Lcom/coremedia/iso/boxes/sampleentry/a;->o:I

    invoke-static {v0, v1}, Lcom/coremedia/iso/i;->f(Ljava/nio/ByteBuffer;I)V

    .line 5
    iget-wide v1, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    invoke-static {v0, v1, v2}, Lcom/coremedia/iso/i;->i(Ljava/nio/ByteBuffer;J)V

    .line 6
    iget v1, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->q:I

    invoke-static {v0, v1}, Lcom/coremedia/iso/i;->m(Ljava/nio/ByteBuffer;I)V

    .line 7
    iget v1, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->r:I

    invoke-static {v0, v1}, Lcom/coremedia/iso/i;->m(Ljava/nio/ByteBuffer;I)V

    .line 8
    iget-object v1, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->s:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-static {v0, v1}, Lcom/coremedia/iso/i;->m(Ljava/nio/ByteBuffer;I)V

    .line 9
    iget-object v1, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->s:[I

    const/4 v2, 0x1

    aget v1, v1, v2

    invoke-static {v0, v1}, Lcom/coremedia/iso/i;->m(Ljava/nio/ByteBuffer;I)V

    .line 10
    iget-object v1, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->s:[I

    const/4 v2, 0x2

    aget v1, v1, v2

    invoke-static {v0, v1}, Lcom/coremedia/iso/i;->m(Ljava/nio/ByteBuffer;I)V

    .line 11
    iget-object v1, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->s:[I

    const/4 v2, 0x3

    aget v1, v1, v2

    invoke-static {v0, v1}, Lcom/coremedia/iso/i;->m(Ljava/nio/ByteBuffer;I)V

    .line 12
    iget-object v1, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->t:Lcom/coremedia/iso/boxes/sampleentry/g$a;

    invoke-virtual {v1, v0}, Lcom/coremedia/iso/boxes/sampleentry/g$a;->a(Ljava/nio/ByteBuffer;)V

    .line 13
    iget-object v1, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->u:Lcom/coremedia/iso/boxes/sampleentry/g$b;

    invoke-virtual {v1, v0}, Lcom/coremedia/iso/boxes/sampleentry/g$b;->a(Ljava/nio/ByteBuffer;)V

    .line 14
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-interface {p1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 15
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/d;->u(Ljava/nio/channels/WritableByteChannel;)V

    return-void
.end method

.method public a0(Z)V
    .locals 4

    if-eqz p1, :cond_0

    .line 1
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    const-wide/32 v2, 0x40000

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    goto :goto_0

    .line 2
    :cond_0
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    const-wide/32 v2, -0x40001

    and-long/2addr v0, v2

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    :goto_0
    return-void
.end method

.method public b0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->q:I

    return-void
.end method

.method public c0(Z)V
    .locals 4

    if-eqz p1, :cond_0

    .line 1
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    const-wide/16 v2, 0x180

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    goto :goto_0

    .line 2
    :cond_0
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    const-wide/16 v2, -0x181

    and-long/2addr v0, v2

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    :goto_0
    return-void
.end method

.method public d0(Z)V
    .locals 4

    if-eqz p1, :cond_0

    .line 1
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    const-wide/16 v2, 0x20

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    goto :goto_0

    .line 2
    :cond_0
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    const-wide/16 v2, -0x21

    and-long/2addr v0, v2

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    :goto_0
    return-void
.end method

.method public e0(Z)V
    .locals 4

    if-eqz p1, :cond_0

    .line 1
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    const-wide/16 v2, 0x40

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    goto :goto_0

    .line 2
    :cond_0
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    const-wide/16 v2, -0x41

    and-long/2addr v0, v2

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    :goto_0
    return-void
.end method

.method public f0(Lcom/coremedia/iso/boxes/sampleentry/g$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->u:Lcom/coremedia/iso/boxes/sampleentry/g$b;

    return-void
.end method

.method public g0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/googlecode/mp4parser/b;->l:Ljava/lang/String;

    return-void
.end method

.method public getSize()J
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/d;->y()J

    move-result-wide v0

    const-wide/16 v2, 0x26

    add-long/2addr v0, v2

    .line 2
    iget-boolean v2, p0, Lcom/googlecode/mp4parser/b;->m:Z

    if-nez v2, :cond_1

    const-wide v2, 0x100000000L

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    goto :goto_1

    :cond_1
    :goto_0
    const/16 v2, 0x10

    :goto_1
    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public h0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->r:I

    return-void
.end method

.method public i0(Z)V
    .locals 4

    if-eqz p1, :cond_0

    .line 1
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    const-wide/32 v2, 0x20000

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    goto :goto_0

    .line 2
    :cond_0
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    const-wide/32 v2, -0x20001

    and-long/2addr v0, v2

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    :goto_0
    return-void
.end method

.method public k(Lcom/googlecode/mp4parser/e;Ljava/nio/ByteBuffer;JLcom/coremedia/iso/c;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 p2, 0x26

    .line 1
    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    .line 2
    invoke-interface {p1, p2}, Lcom/googlecode/mp4parser/e;->read(Ljava/nio/ByteBuffer;)I

    const/4 v0, 0x6

    .line 3
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 4
    invoke-static {p2}, Lcom/coremedia/iso/g;->i(Ljava/nio/ByteBuffer;)I

    move-result v0

    iput v0, p0, Lcom/coremedia/iso/boxes/sampleentry/a;->o:I

    .line 5
    invoke-static {p2}, Lcom/coremedia/iso/g;->l(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->p:J

    .line 6
    invoke-static {p2}, Lcom/coremedia/iso/g;->p(Ljava/nio/ByteBuffer;)I

    move-result v0

    iput v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->q:I

    .line 7
    invoke-static {p2}, Lcom/coremedia/iso/g;->p(Ljava/nio/ByteBuffer;)I

    move-result v0

    iput v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->r:I

    const/4 v0, 0x4

    new-array v0, v0, [I

    .line 8
    iput-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->s:[I

    .line 9
    invoke-static {p2}, Lcom/coremedia/iso/g;->p(Ljava/nio/ByteBuffer;)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 10
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->s:[I

    invoke-static {p2}, Lcom/coremedia/iso/g;->p(Ljava/nio/ByteBuffer;)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 11
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->s:[I

    invoke-static {p2}, Lcom/coremedia/iso/g;->p(Ljava/nio/ByteBuffer;)I

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    .line 12
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->s:[I

    invoke-static {p2}, Lcom/coremedia/iso/g;->p(Ljava/nio/ByteBuffer;)I

    move-result v1

    const/4 v2, 0x3

    aput v1, v0, v2

    .line 13
    new-instance v0, Lcom/coremedia/iso/boxes/sampleentry/g$a;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/sampleentry/g$a;-><init>()V

    iput-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->t:Lcom/coremedia/iso/boxes/sampleentry/g$a;

    .line 14
    invoke-virtual {v0, p2}, Lcom/coremedia/iso/boxes/sampleentry/g$a;->c(Ljava/nio/ByteBuffer;)V

    .line 15
    new-instance v0, Lcom/coremedia/iso/boxes/sampleentry/g$b;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/sampleentry/g$b;-><init>()V

    iput-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/g;->u:Lcom/coremedia/iso/boxes/sampleentry/g$b;

    .line 16
    invoke-virtual {v0, p2}, Lcom/coremedia/iso/boxes/sampleentry/g$b;->c(Ljava/nio/ByteBuffer;)V

    const-wide/16 v0, 0x26

    sub-long/2addr p3, v0

    .line 17
    invoke-virtual {p0, p1, p3, p4, p5}, Lcom/googlecode/mp4parser/b;->z(Lcom/googlecode/mp4parser/e;JLcom/coremedia/iso/c;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "TextSampleEntry"

    return-object v0
.end method
