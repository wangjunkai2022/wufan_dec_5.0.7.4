.class public Lcom/mp4parser/iso14496/part15/d;
.super Ljava/lang/Object;
.source "HevcDecoderConfigurationRecord.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mp4parser/iso14496/part15/d$a;
    }
.end annotation


# instance fields
.field A:Z

.field a:I

.field b:I

.field c:Z

.field d:I

.field e:J

.field f:J

.field g:I

.field h:I

.field i:I

.field j:I

.field k:I

.field l:I

.field m:I

.field n:I

.field o:I

.field p:I

.field q:I

.field r:I

.field s:I

.field t:I

.field u:Z

.field v:I

.field w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/mp4parser/iso14496/part15/d$a;",
            ">;"
        }
    .end annotation
.end field

.field x:Z

.field y:Z

.field z:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xf

    .line 2
    iput v0, p0, Lcom/mp4parser/iso14496/part15/d;->h:I

    const/16 v0, 0x3f

    .line 3
    iput v0, p0, Lcom/mp4parser/iso14496/part15/d;->j:I

    .line 4
    iput v0, p0, Lcom/mp4parser/iso14496/part15/d;->l:I

    const/16 v0, 0x1f

    .line 5
    iput v0, p0, Lcom/mp4parser/iso14496/part15/d;->n:I

    .line 6
    iput v0, p0, Lcom/mp4parser/iso14496/part15/d;->p:I

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mp4parser/iso14496/part15/d;->w:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public A(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mp4parser/iso14496/part15/d;->q:I

    return-void
.end method

.method public B(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mp4parser/iso14496/part15/d;->o:I

    return-void
.end method

.method public C(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mp4parser/iso14496/part15/d;->m:I

    return-void
.end method

.method public D(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mp4parser/iso14496/part15/d;->a:I

    return-void
.end method

.method public E(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mp4parser/iso14496/part15/d;->s:I

    return-void
.end method

.method public F(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/mp4parser/iso14496/part15/d;->x:Z

    return-void
.end method

.method public G(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/mp4parser/iso14496/part15/d;->f:J

    return-void
.end method

.method public H(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mp4parser/iso14496/part15/d;->g:I

    return-void
.end method

.method public I(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/mp4parser/iso14496/part15/d;->e:J

    return-void
.end method

.method public J(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mp4parser/iso14496/part15/d;->d:I

    return-void
.end method

.method public K(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mp4parser/iso14496/part15/d;->b:I

    return-void
.end method

.method public L(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/mp4parser/iso14496/part15/d;->c:Z

    return-void
.end method

.method public M(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/mp4parser/iso14496/part15/d;->z:Z

    return-void
.end method

.method public N(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mp4parser/iso14496/part15/d;->v:I

    return-void
.end method

.method public O(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mp4parser/iso14496/part15/d;->i:I

    return-void
.end method

.method public P(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/mp4parser/iso14496/part15/d;->y:Z

    return-void
.end method

.method public Q(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mp4parser/iso14496/part15/d;->t:I

    return-void
.end method

.method public R(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mp4parser/iso14496/part15/d;->k:I

    return-void
.end method

.method public S(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/mp4parser/iso14496/part15/d;->A:Z

    return-void
.end method

.method public T(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/mp4parser/iso14496/part15/d;->u:Z

    return-void
.end method

.method public U(Ljava/nio/ByteBuffer;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->a:I

    invoke-static {p1, v0}, Lcom/coremedia/iso/i;->m(Ljava/nio/ByteBuffer;I)V

    .line 2
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->b:I

    shl-int/lit8 v0, v0, 0x6

    iget-boolean v1, p0, Lcom/mp4parser/iso14496/part15/d;->c:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->d:I

    add-int/2addr v0, v1

    invoke-static {p1, v0}, Lcom/coremedia/iso/i;->m(Ljava/nio/ByteBuffer;I)V

    .line 3
    iget-wide v0, p0, Lcom/mp4parser/iso14496/part15/d;->e:J

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/i;->i(Ljava/nio/ByteBuffer;J)V

    .line 4
    iget-wide v0, p0, Lcom/mp4parser/iso14496/part15/d;->f:J

    .line 5
    iget-boolean v3, p0, Lcom/mp4parser/iso14496/part15/d;->x:Z

    if-eqz v3, :cond_1

    const-wide v3, 0x800000000000L

    or-long/2addr v0, v3

    .line 6
    :cond_1
    iget-boolean v3, p0, Lcom/mp4parser/iso14496/part15/d;->y:Z

    if-eqz v3, :cond_2

    const-wide v3, 0x400000000000L

    or-long/2addr v0, v3

    .line 7
    :cond_2
    iget-boolean v3, p0, Lcom/mp4parser/iso14496/part15/d;->z:Z

    if-eqz v3, :cond_3

    const-wide v3, 0x200000000000L

    or-long/2addr v0, v3

    .line 8
    :cond_3
    iget-boolean v3, p0, Lcom/mp4parser/iso14496/part15/d;->A:Z

    if-eqz v3, :cond_4

    const-wide v3, 0x100000000000L

    or-long/2addr v0, v3

    .line 9
    :cond_4
    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/i;->k(Ljava/nio/ByteBuffer;J)V

    .line 10
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->g:I

    invoke-static {p1, v0}, Lcom/coremedia/iso/i;->m(Ljava/nio/ByteBuffer;I)V

    .line 11
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->h:I

    shl-int/lit8 v0, v0, 0xc

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->i:I

    add-int/2addr v0, v1

    invoke-static {p1, v0}, Lcom/coremedia/iso/i;->f(Ljava/nio/ByteBuffer;I)V

    .line 12
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->j:I

    shl-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->k:I

    add-int/2addr v0, v1

    invoke-static {p1, v0}, Lcom/coremedia/iso/i;->m(Ljava/nio/ByteBuffer;I)V

    .line 13
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->l:I

    shl-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->m:I

    add-int/2addr v0, v1

    invoke-static {p1, v0}, Lcom/coremedia/iso/i;->m(Ljava/nio/ByteBuffer;I)V

    .line 14
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->n:I

    shl-int/lit8 v0, v0, 0x3

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->o:I

    add-int/2addr v0, v1

    invoke-static {p1, v0}, Lcom/coremedia/iso/i;->m(Ljava/nio/ByteBuffer;I)V

    .line 15
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->p:I

    shl-int/lit8 v0, v0, 0x3

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->q:I

    add-int/2addr v0, v1

    invoke-static {p1, v0}, Lcom/coremedia/iso/i;->m(Ljava/nio/ByteBuffer;I)V

    .line 16
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->r:I

    invoke-static {p1, v0}, Lcom/coremedia/iso/i;->f(Ljava/nio/ByteBuffer;I)V

    .line 17
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->s:I

    shl-int/lit8 v0, v0, 0x6

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->t:I

    shl-int/lit8 v1, v1, 0x3

    add-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/mp4parser/iso14496/part15/d;->u:Z

    if-eqz v1, :cond_5

    const/4 v1, 0x4

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    :goto_1
    add-int/2addr v0, v1

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->v:I

    add-int/2addr v0, v1

    invoke-static {p1, v0}, Lcom/coremedia/iso/i;->m(Ljava/nio/ByteBuffer;I)V

    .line 18
    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/d;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p1, v0}, Lcom/coremedia/iso/i;->m(Ljava/nio/ByteBuffer;I)V

    .line 19
    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/d;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_6

    return-void

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mp4parser/iso14496/part15/d$a;

    .line 20
    iget-boolean v3, v1, Lcom/mp4parser/iso14496/part15/d$a;->a:Z

    if-eqz v3, :cond_7

    const/16 v3, 0x80

    goto :goto_3

    :cond_7
    const/4 v3, 0x0

    :goto_3
    iget-boolean v4, v1, Lcom/mp4parser/iso14496/part15/d$a;->b:Z

    if-eqz v4, :cond_8

    const/16 v4, 0x40

    goto :goto_4

    :cond_8
    const/4 v4, 0x0

    :goto_4
    add-int/2addr v3, v4

    iget v4, v1, Lcom/mp4parser/iso14496/part15/d$a;->c:I

    add-int/2addr v3, v4

    invoke-static {p1, v3}, Lcom/coremedia/iso/i;->m(Ljava/nio/ByteBuffer;I)V

    .line 21
    iget-object v3, v1, Lcom/mp4parser/iso14496/part15/d$a;->d:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {p1, v3}, Lcom/coremedia/iso/i;->f(Ljava/nio/ByteBuffer;I)V

    .line 22
    iget-object v1, v1, Lcom/mp4parser/iso14496/part15/d$a;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_2

    :cond_9
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    .line 23
    array-length v4, v3

    invoke-static {p1, v4}, Lcom/coremedia/iso/i;->f(Ljava/nio/ByteBuffer;I)V

    .line 24
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    goto :goto_5
.end method

.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mp4parser/iso14496/part15/d$a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/d;->w:Ljava/util/List;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->r:I

    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->q:I

    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->o:I

    return v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->m:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_1a

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_1

    .line 2
    :cond_1
    check-cast p1, Lcom/mp4parser/iso14496/part15/d;

    .line 3
    iget v2, p0, Lcom/mp4parser/iso14496/part15/d;->r:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/d;->r:I

    if-eq v2, v3, :cond_2

    return v1

    .line 4
    :cond_2
    iget v2, p0, Lcom/mp4parser/iso14496/part15/d;->q:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/d;->q:I

    if-eq v2, v3, :cond_3

    return v1

    .line 5
    :cond_3
    iget v2, p0, Lcom/mp4parser/iso14496/part15/d;->o:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/d;->o:I

    if-eq v2, v3, :cond_4

    return v1

    .line 6
    :cond_4
    iget v2, p0, Lcom/mp4parser/iso14496/part15/d;->m:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/d;->m:I

    if-eq v2, v3, :cond_5

    return v1

    .line 7
    :cond_5
    iget v2, p0, Lcom/mp4parser/iso14496/part15/d;->a:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/d;->a:I

    if-eq v2, v3, :cond_6

    return v1

    .line 8
    :cond_6
    iget v2, p0, Lcom/mp4parser/iso14496/part15/d;->s:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/d;->s:I

    if-eq v2, v3, :cond_7

    return v1

    .line 9
    :cond_7
    iget-wide v2, p0, Lcom/mp4parser/iso14496/part15/d;->f:J

    iget-wide v4, p1, Lcom/mp4parser/iso14496/part15/d;->f:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_8

    return v1

    .line 10
    :cond_8
    iget v2, p0, Lcom/mp4parser/iso14496/part15/d;->g:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/d;->g:I

    if-eq v2, v3, :cond_9

    return v1

    .line 11
    :cond_9
    iget-wide v2, p0, Lcom/mp4parser/iso14496/part15/d;->e:J

    iget-wide v4, p1, Lcom/mp4parser/iso14496/part15/d;->e:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_a

    return v1

    .line 12
    :cond_a
    iget v2, p0, Lcom/mp4parser/iso14496/part15/d;->d:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/d;->d:I

    if-eq v2, v3, :cond_b

    return v1

    .line 13
    :cond_b
    iget v2, p0, Lcom/mp4parser/iso14496/part15/d;->b:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/d;->b:I

    if-eq v2, v3, :cond_c

    return v1

    .line 14
    :cond_c
    iget-boolean v2, p0, Lcom/mp4parser/iso14496/part15/d;->c:Z

    iget-boolean v3, p1, Lcom/mp4parser/iso14496/part15/d;->c:Z

    if-eq v2, v3, :cond_d

    return v1

    .line 15
    :cond_d
    iget v2, p0, Lcom/mp4parser/iso14496/part15/d;->v:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/d;->v:I

    if-eq v2, v3, :cond_e

    return v1

    .line 16
    :cond_e
    iget v2, p0, Lcom/mp4parser/iso14496/part15/d;->i:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/d;->i:I

    if-eq v2, v3, :cond_f

    return v1

    .line 17
    :cond_f
    iget v2, p0, Lcom/mp4parser/iso14496/part15/d;->t:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/d;->t:I

    if-eq v2, v3, :cond_10

    return v1

    .line 18
    :cond_10
    iget v2, p0, Lcom/mp4parser/iso14496/part15/d;->k:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/d;->k:I

    if-eq v2, v3, :cond_11

    return v1

    .line 19
    :cond_11
    iget v2, p0, Lcom/mp4parser/iso14496/part15/d;->h:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/d;->h:I

    if-eq v2, v3, :cond_12

    return v1

    .line 20
    :cond_12
    iget v2, p0, Lcom/mp4parser/iso14496/part15/d;->j:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/d;->j:I

    if-eq v2, v3, :cond_13

    return v1

    .line 21
    :cond_13
    iget v2, p0, Lcom/mp4parser/iso14496/part15/d;->l:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/d;->l:I

    if-eq v2, v3, :cond_14

    return v1

    .line 22
    :cond_14
    iget v2, p0, Lcom/mp4parser/iso14496/part15/d;->n:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/d;->n:I

    if-eq v2, v3, :cond_15

    return v1

    .line 23
    :cond_15
    iget v2, p0, Lcom/mp4parser/iso14496/part15/d;->p:I

    iget v3, p1, Lcom/mp4parser/iso14496/part15/d;->p:I

    if-eq v2, v3, :cond_16

    return v1

    .line 24
    :cond_16
    iget-boolean v2, p0, Lcom/mp4parser/iso14496/part15/d;->u:Z

    iget-boolean v3, p1, Lcom/mp4parser/iso14496/part15/d;->u:Z

    if-eq v2, v3, :cond_17

    return v1

    .line 25
    :cond_17
    iget-object v2, p0, Lcom/mp4parser/iso14496/part15/d;->w:Ljava/util/List;

    iget-object p1, p1, Lcom/mp4parser/iso14496/part15/d;->w:Ljava/util/List;

    if-eqz v2, :cond_18

    invoke-interface {v2, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_19

    goto :goto_0

    :cond_18
    if-eqz p1, :cond_19

    :goto_0
    return v1

    :cond_19
    return v0

    :cond_1a
    :goto_1
    return v1
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->a:I

    return v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->s:I

    return v0
.end method

.method public h()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/mp4parser/iso14496/part15/d;->f:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 6

    .line 1
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->a:I

    mul-int/lit8 v0, v0, 0x1f

    .line 2
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->b:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 3
    iget-boolean v1, p0, Lcom/mp4parser/iso14496/part15/d;->c:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 4
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->d:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 5
    iget-wide v1, p0, Lcom/mp4parser/iso14496/part15/d;->e:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 6
    iget-wide v1, p0, Lcom/mp4parser/iso14496/part15/d;->f:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 7
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->g:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 8
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->h:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 9
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->i:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 10
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->j:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 11
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->k:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 12
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->l:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 13
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->m:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 14
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->n:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 15
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->o:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 16
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->p:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 17
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->q:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 18
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->r:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 19
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->s:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 20
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->t:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 21
    iget-boolean v1, p0, Lcom/mp4parser/iso14496/part15/d;->u:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 22
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->v:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 23
    iget-object v1, p0, Lcom/mp4parser/iso14496/part15/d;->w:Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public i()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->g:I

    return v0
.end method

.method public j()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/mp4parser/iso14496/part15/d;->e:J

    return-wide v0
.end method

.method public k()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->d:I

    return v0
.end method

.method public l()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->b:I

    return v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->v:I

    return v0
.end method

.method public n()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->i:I

    return v0
.end method

.method public o()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->t:I

    return v0
.end method

.method public p()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/mp4parser/iso14496/part15/d;->k:I

    return v0
.end method

.method public q()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/d;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/16 v1, 0x17

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    return v1

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mp4parser/iso14496/part15/d$a;

    add-int/lit8 v1, v1, 0x3

    .line 2
    iget-object v2, v2, Lcom/mp4parser/iso14496/part15/d$a;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    add-int/lit8 v1, v1, 0x2

    .line 3
    array-length v3, v3

    add-int/2addr v1, v3

    goto :goto_1
.end method

.method public r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/d;->x:Z

    return v0
.end method

.method public s()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/d;->c:Z

    return v0
.end method

.method public t()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/d;->z:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HEVCDecoderConfigurationRecord{configurationVersion="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", general_profile_space="

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", general_tier_flag="

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/mp4parser/iso14496/part15/d;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", general_profile_idc="

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", general_profile_compatibility_flags="

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/mp4parser/iso14496/part15/d;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", general_constraint_indicator_flags="

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/mp4parser/iso14496/part15/d;->f:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", general_level_idc="

    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 9
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->h:I

    const-string v2, ""

    const/16 v3, 0xf

    if-eq v1, v3, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, ", reserved1="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lcom/mp4parser/iso14496/part15/d;->h:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", min_spatial_segmentation_idc="

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->j:I

    const/16 v3, 0x3f

    if-eq v1, v3, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, ", reserved2="

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lcom/mp4parser/iso14496/part15/d;->j:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", parallelismType="

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->l:I

    if-eq v1, v3, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, ", reserved3="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lcom/mp4parser/iso14496/part15/d;->l:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v2

    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", chromaFormat="

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->m:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->n:I

    const/16 v3, 0x1f

    if-eq v1, v3, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, ", reserved4="

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lcom/mp4parser/iso14496/part15/d;->n:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_3
    move-object v1, v2

    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bitDepthLumaMinus8="

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->p:I

    if-eq v1, v3, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ", reserved5="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/mp4parser/iso14496/part15/d;->p:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_4
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bitDepthChromaMinus8="

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->q:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", avgFrameRate="

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->r:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", constantFrameRate="

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->s:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", numTemporalLayers="

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->t:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", temporalIdNested="

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/mp4parser/iso14496/part15/d;->u:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", lengthSizeMinusOne="

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/mp4parser/iso14496/part15/d;->v:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", arrays="

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mp4parser/iso14496/part15/d;->w:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/d;->y:Z

    return v0
.end method

.method public v()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/d;->A:Z

    return v0
.end method

.method public w()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/d;->u:Z

    return v0
.end method

.method public x(Ljava/nio/ByteBuffer;)V
    .locals 11

    .line 1
    invoke-static {p1}, Lcom/coremedia/iso/g;->p(Ljava/nio/ByteBuffer;)I

    move-result v0

    iput v0, p0, Lcom/mp4parser/iso14496/part15/d;->a:I

    .line 2
    invoke-static {p1}, Lcom/coremedia/iso/g;->p(Ljava/nio/ByteBuffer;)I

    move-result v0

    and-int/lit16 v1, v0, 0xc0

    shr-int/lit8 v1, v1, 0x6

    .line 3
    iput v1, p0, Lcom/mp4parser/iso14496/part15/d;->b:I

    and-int/lit8 v1, v0, 0x20

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 4
    :goto_0
    iput-boolean v1, p0, Lcom/mp4parser/iso14496/part15/d;->c:Z

    and-int/lit8 v0, v0, 0x1f

    .line 5
    iput v0, p0, Lcom/mp4parser/iso14496/part15/d;->d:I

    .line 6
    invoke-static {p1}, Lcom/coremedia/iso/g;->l(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/mp4parser/iso14496/part15/d;->e:J

    .line 7
    invoke-static {p1}, Lcom/coremedia/iso/g;->n(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/mp4parser/iso14496/part15/d;->f:J

    const/16 v4, 0x2c

    shr-long v5, v0, v4

    const-wide/16 v7, 0x8

    and-long/2addr v5, v7

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-lez v9, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 8
    :goto_1
    iput-boolean v5, p0, Lcom/mp4parser/iso14496/part15/d;->x:Z

    shr-long v5, v0, v4

    const-wide/16 v9, 0x4

    and-long/2addr v5, v9

    cmp-long v9, v5, v7

    if-lez v9, :cond_2

    const/4 v5, 0x1

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    .line 9
    :goto_2
    iput-boolean v5, p0, Lcom/mp4parser/iso14496/part15/d;->y:Z

    shr-long v5, v0, v4

    const-wide/16 v9, 0x2

    and-long/2addr v5, v9

    cmp-long v9, v5, v7

    if-lez v9, :cond_3

    const/4 v5, 0x1

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    .line 10
    :goto_3
    iput-boolean v5, p0, Lcom/mp4parser/iso14496/part15/d;->z:Z

    shr-long v4, v0, v4

    const-wide/16 v9, 0x1

    and-long/2addr v4, v9

    cmp-long v6, v4, v7

    if-lez v6, :cond_4

    const/4 v4, 0x1

    goto :goto_4

    :cond_4
    const/4 v4, 0x0

    .line 11
    :goto_4
    iput-boolean v4, p0, Lcom/mp4parser/iso14496/part15/d;->A:Z

    const-wide v4, 0x7fffffffffffL

    and-long/2addr v0, v4

    .line 12
    iput-wide v0, p0, Lcom/mp4parser/iso14496/part15/d;->f:J

    .line 13
    invoke-static {p1}, Lcom/coremedia/iso/g;->p(Ljava/nio/ByteBuffer;)I

    move-result v0

    iput v0, p0, Lcom/mp4parser/iso14496/part15/d;->g:I

    .line 14
    invoke-static {p1}, Lcom/coremedia/iso/g;->i(Ljava/nio/ByteBuffer;)I

    move-result v0

    const v1, 0xf000

    and-int/2addr v1, v0

    shr-int/lit8 v1, v1, 0xc

    .line 15
    iput v1, p0, Lcom/mp4parser/iso14496/part15/d;->h:I

    and-int/lit16 v0, v0, 0xfff

    .line 16
    iput v0, p0, Lcom/mp4parser/iso14496/part15/d;->i:I

    .line 17
    invoke-static {p1}, Lcom/coremedia/iso/g;->p(Ljava/nio/ByteBuffer;)I

    move-result v0

    and-int/lit16 v1, v0, 0xfc

    shr-int/lit8 v1, v1, 0x2

    .line 18
    iput v1, p0, Lcom/mp4parser/iso14496/part15/d;->j:I

    and-int/lit8 v0, v0, 0x3

    .line 19
    iput v0, p0, Lcom/mp4parser/iso14496/part15/d;->k:I

    .line 20
    invoke-static {p1}, Lcom/coremedia/iso/g;->p(Ljava/nio/ByteBuffer;)I

    move-result v0

    and-int/lit16 v1, v0, 0xfc

    shr-int/lit8 v1, v1, 0x2

    .line 21
    iput v1, p0, Lcom/mp4parser/iso14496/part15/d;->l:I

    and-int/lit8 v0, v0, 0x3

    .line 22
    iput v0, p0, Lcom/mp4parser/iso14496/part15/d;->m:I

    .line 23
    invoke-static {p1}, Lcom/coremedia/iso/g;->p(Ljava/nio/ByteBuffer;)I

    move-result v0

    and-int/lit16 v1, v0, 0xf8

    shr-int/lit8 v1, v1, 0x3

    .line 24
    iput v1, p0, Lcom/mp4parser/iso14496/part15/d;->n:I

    and-int/lit8 v0, v0, 0x7

    .line 25
    iput v0, p0, Lcom/mp4parser/iso14496/part15/d;->o:I

    .line 26
    invoke-static {p1}, Lcom/coremedia/iso/g;->p(Ljava/nio/ByteBuffer;)I

    move-result v0

    and-int/lit16 v1, v0, 0xf8

    shr-int/lit8 v1, v1, 0x3

    .line 27
    iput v1, p0, Lcom/mp4parser/iso14496/part15/d;->p:I

    and-int/lit8 v0, v0, 0x7

    .line 28
    iput v0, p0, Lcom/mp4parser/iso14496/part15/d;->q:I

    .line 29
    invoke-static {p1}, Lcom/coremedia/iso/g;->i(Ljava/nio/ByteBuffer;)I

    move-result v0

    iput v0, p0, Lcom/mp4parser/iso14496/part15/d;->r:I

    .line 30
    invoke-static {p1}, Lcom/coremedia/iso/g;->p(Ljava/nio/ByteBuffer;)I

    move-result v0

    and-int/lit16 v1, v0, 0xc0

    shr-int/lit8 v1, v1, 0x6

    .line 31
    iput v1, p0, Lcom/mp4parser/iso14496/part15/d;->s:I

    and-int/lit8 v1, v0, 0x38

    shr-int/lit8 v1, v1, 0x3

    .line 32
    iput v1, p0, Lcom/mp4parser/iso14496/part15/d;->t:I

    and-int/lit8 v1, v0, 0x4

    if-lez v1, :cond_5

    const/4 v1, 0x1

    goto :goto_5

    :cond_5
    const/4 v1, 0x0

    .line 33
    :goto_5
    iput-boolean v1, p0, Lcom/mp4parser/iso14496/part15/d;->u:Z

    and-int/lit8 v0, v0, 0x3

    .line 34
    iput v0, p0, Lcom/mp4parser/iso14496/part15/d;->v:I

    .line 35
    invoke-static {p1}, Lcom/coremedia/iso/g;->p(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 36
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/mp4parser/iso14496/part15/d;->w:Ljava/util/List;

    const/4 v1, 0x0

    :goto_6
    if-lt v1, v0, :cond_6

    return-void

    .line 37
    :cond_6
    new-instance v4, Lcom/mp4parser/iso14496/part15/d$a;

    invoke-direct {v4}, Lcom/mp4parser/iso14496/part15/d$a;-><init>()V

    .line 38
    invoke-static {p1}, Lcom/coremedia/iso/g;->p(Ljava/nio/ByteBuffer;)I

    move-result v5

    and-int/lit16 v6, v5, 0x80

    if-lez v6, :cond_7

    const/4 v6, 0x1

    goto :goto_7

    :cond_7
    const/4 v6, 0x0

    .line 39
    :goto_7
    iput-boolean v6, v4, Lcom/mp4parser/iso14496/part15/d$a;->a:Z

    and-int/lit8 v6, v5, 0x40

    if-lez v6, :cond_8

    const/4 v6, 0x1

    goto :goto_8

    :cond_8
    const/4 v6, 0x0

    .line 40
    :goto_8
    iput-boolean v6, v4, Lcom/mp4parser/iso14496/part15/d$a;->b:Z

    and-int/lit8 v5, v5, 0x3f

    .line 41
    iput v5, v4, Lcom/mp4parser/iso14496/part15/d$a;->c:I

    .line 42
    invoke-static {p1}, Lcom/coremedia/iso/g;->i(Ljava/nio/ByteBuffer;)I

    move-result v5

    .line 43
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v4, Lcom/mp4parser/iso14496/part15/d$a;->d:Ljava/util/List;

    const/4 v6, 0x0

    :goto_9
    if-lt v6, v5, :cond_9

    .line 44
    iget-object v5, p0, Lcom/mp4parser/iso14496/part15/d;->w:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    .line 45
    :cond_9
    invoke-static {p1}, Lcom/coremedia/iso/g;->i(Ljava/nio/ByteBuffer;)I

    move-result v7

    .line 46
    new-array v7, v7, [B

    .line 47
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 48
    iget-object v8, v4, Lcom/mp4parser/iso14496/part15/d$a;->d:Ljava/util/List;

    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_9
.end method

.method public y(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/mp4parser/iso14496/part15/d$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mp4parser/iso14496/part15/d;->w:Ljava/util/List;

    return-void
.end method

.method public z(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/mp4parser/iso14496/part15/d;->r:I

    return-void
.end method
