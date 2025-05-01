.class public Lcom/googlecode/mp4parser/authoring/tracks/d;
.super Lcom/googlecode/mp4parser/authoring/a;
.source "AppendTrack.java"


# static fields
.field private static g:Lcom/googlecode/mp4parser/util/j;


# instance fields
.field e:[Lcom/googlecode/mp4parser/authoring/h;

.field f:Lcom/coremedia/iso/boxes/s0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lcom/googlecode/mp4parser/authoring/tracks/d;

    invoke-static {v0}, Lcom/googlecode/mp4parser/util/j;->a(Ljava/lang/Class;)Lcom/googlecode/mp4parser/util/j;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/authoring/tracks/d;->g:Lcom/googlecode/mp4parser/util/j;

    return-void
.end method

.method public varargs constructor <init>([Lcom/googlecode/mp4parser/authoring/h;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/googlecode/mp4parser/authoring/tracks/d;->a([Lcom/googlecode/mp4parser/authoring/h;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/authoring/a;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->e:[Lcom/googlecode/mp4parser/authoring/h;

    .line 3
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-lt v2, v0, :cond_0

    return-void

    :cond_0
    aget-object v3, p1, v2

    .line 4
    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->f:Lcom/coremedia/iso/boxes/s0;

    if-nez v4, :cond_1

    .line 5
    new-instance v4, Lcom/coremedia/iso/boxes/s0;

    invoke-direct {v4}, Lcom/coremedia/iso/boxes/s0;-><init>()V

    iput-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->f:Lcom/coremedia/iso/boxes/s0;

    .line 6
    invoke-interface {v3}, Lcom/googlecode/mp4parser/authoring/h;->o()Lcom/coremedia/iso/boxes/s0;

    move-result-object v3

    const-class v5, Lcom/coremedia/iso/boxes/sampleentry/f;

    invoke-virtual {v3, v5}, Lcom/googlecode/mp4parser/d;->g(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/coremedia/iso/boxes/d;

    invoke-virtual {v4, v3}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_1

    .line 7
    :cond_1
    invoke-interface {v3}, Lcom/googlecode/mp4parser/authoring/h;->o()Lcom/coremedia/iso/boxes/s0;

    move-result-object v3

    invoke-direct {p0, v4, v3}, Lcom/googlecode/mp4parser/authoring/tracks/d;->h(Lcom/coremedia/iso/boxes/s0;Lcom/coremedia/iso/boxes/s0;)Lcom/coremedia/iso/boxes/s0;

    move-result-object v3

    iput-object v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->f:Lcom/coremedia/iso/boxes/s0;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method public static varargs a([Lcom/googlecode/mp4parser/authoring/h;)Ljava/lang/String;
    .locals 6

    .line 1
    array-length v0, p0

    const/4 v1, 0x0

    const-string v2, ""

    const/4 v3, 0x0

    :goto_0
    if-lt v3, v0, :cond_0

    .line 2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, -0x3

    invoke-virtual {v2, v1, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 3
    :cond_0
    aget-object v4, p0, v3

    .line 4
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v4}, Lcom/googlecode/mp4parser/authoring/h;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " + "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method

.method private b(Lcom/coremedia/iso/boxes/sampleentry/c;Lcom/coremedia/iso/boxes/sampleentry/c;)Lcom/coremedia/iso/boxes/sampleentry/c;
    .locals 7

    .line 1
    new-instance v0, Lcom/coremedia/iso/boxes/sampleentry/c;

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/b;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/c;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->C()J

    move-result-wide v1

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/c;->C()J

    move-result-wide v3

    const/4 v5, 0x0

    cmp-long v6, v1, v3

    if-nez v6, :cond_9

    .line 3
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->C()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/coremedia/iso/boxes/sampleentry/c;->Z(J)V

    .line 4
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->D()J

    move-result-wide v1

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/c;->D()J

    move-result-wide v3

    cmp-long v6, v1, v3

    if-nez v6, :cond_8

    .line 5
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->D()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/coremedia/iso/boxes/sampleentry/c;->a0(J)V

    .line 6
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->E()J

    move-result-wide v1

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/c;->E()J

    move-result-wide v3

    cmp-long v6, v1, v3

    if-nez v6, :cond_7

    .line 7
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->E()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/coremedia/iso/boxes/sampleentry/c;->b0(J)V

    .line 8
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->J()I

    move-result v1

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/c;->J()I

    move-result v2

    if-ne v1, v2, :cond_6

    .line 9
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->J()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/c;->c0(I)V

    .line 10
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->N()I

    move-result v1

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/c;->N()I

    move-result v2

    if-ne v1, v2, :cond_5

    .line 11
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->N()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/c;->e0(I)V

    .line 12
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->K()I

    move-result v1

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/c;->K()I

    move-result v2

    if-ne v1, v2, :cond_4

    .line 13
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->K()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/c;->d0(I)V

    .line 14
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->T()J

    move-result-wide v1

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/c;->T()J

    move-result-wide v3

    cmp-long v6, v1, v3

    if-nez v6, :cond_4

    .line 15
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->T()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/coremedia/iso/boxes/sampleentry/c;->h0(J)V

    .line 16
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->V()I

    move-result v1

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/c;->V()I

    move-result v2

    if-ne v1, v2, :cond_4

    .line 17
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->V()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/c;->i0(I)V

    .line 18
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->W()J

    move-result-wide v1

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/c;->W()J

    move-result-wide v3

    cmp-long v6, v1, v3

    if-nez v6, :cond_4

    .line 19
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->W()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/coremedia/iso/boxes/sampleentry/c;->j0(J)V

    .line 20
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->X()I

    move-result v1

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/c;->X()I

    move-result v2

    if-ne v1, v2, :cond_4

    .line 21
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->X()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/c;->k0(I)V

    .line 22
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->Y()[B

    move-result-object v1

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/c;->Y()[B

    move-result-object v2

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 23
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->Y()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/c;->l0([B)V

    .line 24
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/d;->t()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/d;->t()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ne v1, v2, :cond_3

    .line 25
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/d;->t()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 26
    invoke-virtual {p2}, Lcom/googlecode/mp4parser/d;->t()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 27
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 28
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/coremedia/iso/boxes/d;

    .line 29
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/coremedia/iso/boxes/d;

    .line 30
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 31
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 32
    :try_start_0
    invoke-static {v3}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;

    move-result-object v6

    invoke-interface {v1, v6}, Lcom/coremedia/iso/boxes/d;->a(Ljava/nio/channels/WritableByteChannel;)V

    .line 33
    invoke-static {v4}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;

    move-result-object v6

    invoke-interface {v2, v6}, Lcom/coremedia/iso/boxes/d;->a(Ljava/nio/channels/WritableByteChannel;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4

    invoke-static {v3, v4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 35
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_0

    .line 36
    :cond_2
    invoke-interface {v1}, Lcom/coremedia/iso/boxes/d;->getType()Ljava/lang/String;

    move-result-object v3

    const-string v4, "esds"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Lcom/coremedia/iso/boxes/d;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 37
    move-object v3, v1

    check-cast v3, Lcom/googlecode/mp4parser/boxes/mp4/b;

    .line 38
    check-cast v2, Lcom/googlecode/mp4parser/boxes/mp4/b;

    .line 39
    invoke-virtual {v3}, Lcom/googlecode/mp4parser/boxes/mp4/b;->A()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;

    move-result-object v4

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/b;->A()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;

    move-result-object v2

    invoke-direct {p0, v4, v2}, Lcom/googlecode/mp4parser/authoring/tracks/d;->d(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/b;Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/b;)Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;

    move-result-object v2

    .line 40
    invoke-virtual {v3, v2}, Lcom/googlecode/mp4parser/boxes/mp4/a;->z(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/b;)V

    .line 41
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_0

    :catch_0
    move-exception p1

    .line 42
    sget-object p2, Lcom/googlecode/mp4parser/authoring/tracks/d;->g:Lcom/googlecode/mp4parser/util/j;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/googlecode/mp4parser/util/j;->d(Ljava/lang/String;)V

    return-object v5

    :cond_3
    :goto_1
    return-object v0

    :cond_4
    return-object v5

    .line 43
    :cond_5
    sget-object p1, Lcom/googlecode/mp4parser/authoring/tracks/d;->g:Lcom/googlecode/mp4parser/util/j;

    const-string p2, "ChannelCount differ"

    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/util/j;->c(Ljava/lang/String;)V

    :cond_6
    return-object v5

    .line 44
    :cond_7
    sget-object p1, Lcom/googlecode/mp4parser/authoring/tracks/d;->g:Lcom/googlecode/mp4parser/util/j;

    const-string p2, "BytesPerSample differ"

    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/util/j;->c(Ljava/lang/String;)V

    :cond_8
    return-object v5

    .line 45
    :cond_9
    sget-object p1, Lcom/googlecode/mp4parser/authoring/tracks/d;->g:Lcom/googlecode/mp4parser/util/j;

    const-string p2, "BytesPerFrame differ"

    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/util/j;->c(Ljava/lang/String;)V

    return-object v5
.end method

.method private d(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/b;Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/b;)Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;
    .locals 8

    .line 1
    instance-of v0, p1, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_16

    instance-of v0, p2, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;

    if-eqz v0, :cond_16

    .line 2
    check-cast p1, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;

    .line 3
    check-cast p2, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;

    .line 4
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->o()I

    move-result v0

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->o()I

    move-result v2

    if-eq v0, v2, :cond_0

    return-object v1

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->p()I

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->p()I

    .line 6
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->h()I

    move-result v0

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->h()I

    move-result v2

    if-eq v0, v2, :cond_1

    return-object v1

    .line 7
    :cond_1
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->i()I

    move-result v0

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->i()I

    move-result v2

    if-eq v0, v2, :cond_2

    return-object v1

    .line 8
    :cond_2
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->r()I

    move-result v0

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->r()I

    move-result v2

    if-eq v0, v2, :cond_3

    return-object v1

    .line 9
    :cond_3
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->s()I

    move-result v0

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->s()I

    move-result v2

    if-eq v0, v2, :cond_4

    return-object v1

    .line 10
    :cond_4
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->k()I

    move-result v0

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->k()I

    move-result v2

    if-eq v0, v2, :cond_5

    return-object v1

    .line 11
    :cond_5
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->m()I

    move-result v0

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->m()I

    move-result v2

    if-eq v0, v2, :cond_6

    return-object v1

    .line 12
    :cond_6
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->n()I

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->n()I

    .line 13
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->q()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_7
    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->q()Ljava/lang/String;

    .line 14
    :goto_0
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->g()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->g()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;

    move-result-object v0

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->g()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_1

    :cond_8
    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->g()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;

    move-result-object v0

    if-eqz v0, :cond_11

    .line 15
    :goto_1
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->g()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;

    move-result-object v0

    .line 16
    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->g()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;

    move-result-object v2

    .line 17
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->g()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/a;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->g()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/a;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->g()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/a;

    move-result-object v3

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->g()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/a;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    return-object v1

    .line 18
    :cond_9
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->h()J

    move-result-wide v3

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->h()J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-eqz v7, :cond_a

    .line 19
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->h()J

    move-result-wide v3

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->h()J

    move-result-wide v5

    add-long/2addr v3, v5

    const-wide/16 v5, 0x2

    div-long/2addr v3, v5

    invoke-virtual {v0, v3, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->s(J)V

    .line 20
    :cond_a
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->i()I

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->i()I

    .line 21
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->j()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/f;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->j()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/f;

    move-result-object v3

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->j()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/f;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/f;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_2

    :cond_b
    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->j()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/f;

    move-result-object v3

    if-eqz v3, :cond_c

    :goto_2
    return-object v1

    .line 22
    :cond_c
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->k()J

    move-result-wide v3

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->k()J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-eqz v7, :cond_d

    .line 23
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->k()J

    move-result-wide v3

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->k()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->u(J)V

    .line 24
    :cond_d
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->m()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->m()Ljava/util/List;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    return-object v1

    .line 25
    :cond_e
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->l()I

    move-result v3

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->l()I

    move-result v4

    if-eq v3, v4, :cond_f

    return-object v1

    .line 26
    :cond_f
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->n()I

    move-result v3

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->n()I

    move-result v4

    if-eq v3, v4, :cond_10

    return-object v1

    .line 27
    :cond_10
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->o()I

    move-result v0

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->o()I

    move-result v2

    if-eq v0, v2, :cond_11

    return-object v1

    .line 28
    :cond_11
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->j()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->j()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->j()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto :goto_3

    :cond_12
    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->j()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_13

    :goto_3
    return-object v1

    .line 29
    :cond_13
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->l()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/n;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->l()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/n;

    move-result-object v0

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->l()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/n;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/n;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_15

    goto :goto_4

    :cond_14
    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->l()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/n;

    move-result-object p2

    if-eqz p2, :cond_15

    :goto_4
    return-object v1

    :cond_15
    return-object p1

    .line 30
    :cond_16
    sget-object p1, Lcom/googlecode/mp4parser/authoring/tracks/d;->g:Lcom/googlecode/mp4parser/util/j;

    const-string p2, "I can only merge ESDescriptors"

    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/util/j;->c(Ljava/lang/String;)V

    return-object v1
.end method

.method private g(Lcom/coremedia/iso/boxes/sampleentry/f;Lcom/coremedia/iso/boxes/sampleentry/f;)Lcom/coremedia/iso/boxes/sampleentry/f;
    .locals 2

    .line 1
    invoke-interface {p1}, Lcom/coremedia/iso/boxes/d;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2}, Lcom/coremedia/iso/boxes/d;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    instance-of v0, p1, Lcom/coremedia/iso/boxes/sampleentry/h;

    if-eqz v0, :cond_1

    instance-of v0, p2, Lcom/coremedia/iso/boxes/sampleentry/h;

    if-eqz v0, :cond_1

    .line 3
    check-cast p1, Lcom/coremedia/iso/boxes/sampleentry/h;

    check-cast p2, Lcom/coremedia/iso/boxes/sampleentry/h;

    invoke-direct {p0, p1, p2}, Lcom/googlecode/mp4parser/authoring/tracks/d;->j(Lcom/coremedia/iso/boxes/sampleentry/h;Lcom/coremedia/iso/boxes/sampleentry/h;)Lcom/coremedia/iso/boxes/sampleentry/h;

    move-result-object p1

    return-object p1

    .line 4
    :cond_1
    instance-of v0, p1, Lcom/coremedia/iso/boxes/sampleentry/c;

    if-eqz v0, :cond_2

    instance-of v0, p2, Lcom/coremedia/iso/boxes/sampleentry/c;

    if-eqz v0, :cond_2

    .line 5
    check-cast p1, Lcom/coremedia/iso/boxes/sampleentry/c;

    check-cast p2, Lcom/coremedia/iso/boxes/sampleentry/c;

    invoke-direct {p0, p1, p2}, Lcom/googlecode/mp4parser/authoring/tracks/d;->b(Lcom/coremedia/iso/boxes/sampleentry/c;Lcom/coremedia/iso/boxes/sampleentry/c;)Lcom/coremedia/iso/boxes/sampleentry/c;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v1
.end method

.method private h(Lcom/coremedia/iso/boxes/s0;Lcom/coremedia/iso/boxes/s0;)Lcom/coremedia/iso/boxes/s0;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-class v0, Lcom/coremedia/iso/boxes/sampleentry/f;

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 2
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 3
    :try_start_0
    invoke-static {v1}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/coremedia/iso/boxes/s0;->a(Ljava/nio/channels/WritableByteChannel;)V

    .line 4
    invoke-static {v2}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;

    move-result-object v3

    invoke-virtual {p2, v3}, Lcom/coremedia/iso/boxes/s0;->a(Ljava/nio/channels/WritableByteChannel;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 6
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    .line 7
    invoke-static {v2, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_1

    .line 8
    invoke-virtual {p1, v0}, Lcom/googlecode/mp4parser/d;->g(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/coremedia/iso/boxes/sampleentry/f;

    invoke-virtual {p2, v0}, Lcom/googlecode/mp4parser/d;->g(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/coremedia/iso/boxes/sampleentry/f;

    invoke-direct {p0, v1, v3}, Lcom/googlecode/mp4parser/authoring/tracks/d;->g(Lcom/coremedia/iso/boxes/sampleentry/f;Lcom/coremedia/iso/boxes/sampleentry/f;)Lcom/coremedia/iso/boxes/sampleentry/f;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 9
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/d;->b(Ljava/util/List;)V

    goto :goto_0

    .line 10
    :cond_0
    new-instance v1, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Cannot merge "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/googlecode/mp4parser/d;->g(Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " and "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Lcom/googlecode/mp4parser/d;->g(Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    return-object p1

    :catch_0
    move-exception p1

    .line 11
    sget-object p2, Lcom/googlecode/mp4parser/authoring/tracks/d;->g:Lcom/googlecode/mp4parser/util/j;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/googlecode/mp4parser/util/j;->c(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private j(Lcom/coremedia/iso/boxes/sampleentry/h;Lcom/coremedia/iso/boxes/sampleentry/h;)Lcom/coremedia/iso/boxes/sampleentry/h;
    .locals 7

    .line 1
    new-instance v0, Lcom/coremedia/iso/boxes/sampleentry/h;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/sampleentry/h;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/h;->K()D

    move-result-wide v1

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/h;->K()D

    move-result-wide v3

    const/4 v5, 0x0

    cmpl-double v6, v1, v3

    if-nez v6, :cond_a

    .line 3
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/h;->K()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/coremedia/iso/boxes/sampleentry/h;->X(D)V

    .line 4
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/h;->C()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/h;->S(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/h;->D()I

    move-result v1

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/h;->D()I

    move-result v2

    if-ne v1, v2, :cond_9

    .line 6
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/h;->D()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/h;->T(I)V

    .line 7
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/h;->E()I

    move-result v1

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/h;->E()I

    move-result v2

    if-ne v1, v2, :cond_8

    .line 8
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/h;->E()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/h;->V(I)V

    .line 9
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/h;->J()I

    move-result v1

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/h;->J()I

    move-result v2

    if-ne v1, v2, :cond_7

    .line 10
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/h;->J()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/h;->W(I)V

    .line 11
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/h;->P()I

    move-result v1

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/h;->P()I

    move-result v2

    if-ne v1, v2, :cond_6

    .line 12
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/h;->P()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/h;->a0(I)V

    .line 13
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/h;->N()D

    move-result-wide v1

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/h;->N()D

    move-result-wide v3

    cmpl-double v6, v1, v3

    if-nez v6, :cond_5

    .line 14
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/h;->N()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/coremedia/iso/boxes/sampleentry/h;->Z(D)V

    .line 15
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/h;->K()D

    move-result-wide v1

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/h;->K()D

    move-result-wide v3

    cmpl-double v6, v1, v3

    if-nez v6, :cond_4

    .line 16
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/h;->K()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/coremedia/iso/boxes/sampleentry/h;->X(D)V

    .line 17
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/d;->t()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/d;->t()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ne v1, v2, :cond_3

    .line 18
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/d;->t()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 19
    invoke-virtual {p2}, Lcom/googlecode/mp4parser/d;->t()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 20
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 21
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/coremedia/iso/boxes/d;

    .line 22
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/coremedia/iso/boxes/d;

    .line 23
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 24
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 25
    :try_start_0
    invoke-static {v3}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;

    move-result-object v6

    invoke-interface {v1, v6}, Lcom/coremedia/iso/boxes/d;->a(Ljava/nio/channels/WritableByteChannel;)V

    .line 26
    invoke-static {v4}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;

    move-result-object v6

    invoke-interface {v2, v6}, Lcom/coremedia/iso/boxes/d;->a(Ljava/nio/channels/WritableByteChannel;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4

    invoke-static {v3, v4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 28
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_0

    .line 29
    :cond_2
    instance-of v3, v1, Lcom/googlecode/mp4parser/boxes/mp4/a;

    if-eqz v3, :cond_0

    instance-of v3, v2, Lcom/googlecode/mp4parser/boxes/mp4/a;

    if-eqz v3, :cond_0

    .line 30
    move-object v3, v1

    check-cast v3, Lcom/googlecode/mp4parser/boxes/mp4/a;

    invoke-virtual {v3}, Lcom/googlecode/mp4parser/boxes/mp4/a;->w()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/b;

    move-result-object v4

    check-cast v2, Lcom/googlecode/mp4parser/boxes/mp4/a;

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/a;->w()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/b;

    move-result-object v2

    invoke-direct {p0, v4, v2}, Lcom/googlecode/mp4parser/authoring/tracks/d;->d(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/b;Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/b;)Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;

    move-result-object v2

    .line 31
    invoke-virtual {v3, v2}, Lcom/googlecode/mp4parser/boxes/mp4/a;->z(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/b;)V

    .line 32
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_0

    :catch_0
    move-exception p1

    .line 33
    sget-object p2, Lcom/googlecode/mp4parser/authoring/tracks/d;->g:Lcom/googlecode/mp4parser/util/j;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/googlecode/mp4parser/util/j;->d(Ljava/lang/String;)V

    return-object v5

    :cond_3
    :goto_1
    return-object v0

    .line 34
    :cond_4
    sget-object p1, Lcom/googlecode/mp4parser/authoring/tracks/d;->g:Lcom/googlecode/mp4parser/util/j;

    const-string p2, "horizontal resolution differs"

    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/util/j;->c(Ljava/lang/String;)V

    return-object v5

    .line 35
    :cond_5
    sget-object p1, Lcom/googlecode/mp4parser/authoring/tracks/d;->g:Lcom/googlecode/mp4parser/util/j;

    const-string/jumbo p2, "vert resolution differs"

    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/util/j;->c(Ljava/lang/String;)V

    return-object v5

    .line 36
    :cond_6
    sget-object p1, Lcom/googlecode/mp4parser/authoring/tracks/d;->g:Lcom/googlecode/mp4parser/util/j;

    const-string/jumbo p2, "width differs"

    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/util/j;->c(Ljava/lang/String;)V

    return-object v5

    .line 37
    :cond_7
    sget-object p1, Lcom/googlecode/mp4parser/authoring/tracks/d;->g:Lcom/googlecode/mp4parser/util/j;

    const-string p2, "height differs"

    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/util/j;->c(Ljava/lang/String;)V

    return-object v5

    .line 38
    :cond_8
    sget-object p1, Lcom/googlecode/mp4parser/authoring/tracks/d;->g:Lcom/googlecode/mp4parser/util/j;

    const-string p2, "frame count differs"

    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/util/j;->c(Ljava/lang/String;)V

    return-object v5

    .line 39
    :cond_9
    sget-object p1, Lcom/googlecode/mp4parser/authoring/tracks/d;->g:Lcom/googlecode/mp4parser/util/j;

    const-string p2, "Depth differs"

    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/util/j;->c(Ljava/lang/String;)V

    return-object v5

    .line 40
    :cond_a
    sget-object p1, Lcom/googlecode/mp4parser/authoring/tracks/d;->g:Lcom/googlecode/mp4parser/util/j;

    const-string p2, "Horizontal Resolution differs"

    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/util/j;->c(Ljava/lang/String;)V

    return-object v5
.end method


# virtual methods
.method public M()Lcom/googlecode/mp4parser/authoring/i;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->e:[Lcom/googlecode/mp4parser/authoring/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized O()[J
    .locals 12

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->e:[Lcom/googlecode/mp4parser/authoring/h;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-lt v3, v1, :cond_2

    .line 2
    new-array v0, v4, [J

    .line 3
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->e:[Lcom/googlecode/mp4parser/authoring/h;

    array-length v3, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1
    if-lt v4, v3, :cond_0

    .line 4
    monitor-exit p0

    return-object v0

    .line 5
    :cond_0
    :try_start_1
    aget-object v6, v1, v4

    .line 6
    invoke-interface {v6}, Lcom/googlecode/mp4parser/authoring/h;->O()[J

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x0

    :goto_2
    if-lt v8, v7, :cond_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    aget-wide v9, v6, v8

    add-int/lit8 v11, v5, 0x1

    .line 7
    aput-wide v9, v0, v5

    add-int/lit8 v8, v8, 0x1

    move v5, v11

    goto :goto_2

    .line 8
    :cond_2
    aget-object v5, v0, v3

    .line 9
    invoke-interface {v5}, Lcom/googlecode/mp4parser/authoring/h;->O()[J

    move-result-object v5

    array-length v5, v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_4

    :goto_3
    throw v0

    :goto_4
    goto :goto_3
.end method

.method public U()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/coremedia/iso/boxes/r0$a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->e:[Lcom/googlecode/mp4parser/authoring/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/h;->U()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->e:[Lcom/googlecode/mp4parser/authoring/h;

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/h;->U()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 3
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->e:[Lcom/googlecode/mp4parser/authoring/h;

    array-length v3, v2

    :goto_0
    if-lt v1, v3, :cond_0

    return-object v0

    :cond_0
    aget-object v4, v2, v1

    .line 4
    invoke-interface {v4}, Lcom/googlecode/mp4parser/authoring/h;->U()Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public close()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->e:[Lcom/googlecode/mp4parser/authoring/h;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-lt v2, v1, :cond_0

    return-void

    :cond_0
    aget-object v3, v0, v2

    .line 2
    invoke-interface {v3}, Ljava/io/Closeable;->close()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method public getHandler()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->e:[Lcom/googlecode/mp4parser/authoring/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/h;->getHandler()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public n()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/coremedia/iso/boxes/i$a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->e:[Lcom/googlecode/mp4parser/authoring/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/h;->n()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->e:[Lcom/googlecode/mp4parser/authoring/h;

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/h;->n()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 2
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 3
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->e:[Lcom/googlecode/mp4parser/authoring/h;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-lt v4, v3, :cond_4

    .line 4
    new-instance v5, Ljava/util/LinkedList;

    invoke-direct {v5}, Ljava/util/LinkedList;-><init>()V

    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    return-object v5

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, [I

    .line 6
    array-length v8, v7

    const/4 v0, 0x0

    :goto_2
    if-lt v0, v8, :cond_1

    goto :goto_1

    :cond_1
    aget v2, v7, v0

    .line 7
    invoke-virtual {v5}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_3

    invoke-virtual {v5}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/coremedia/iso/boxes/i$a;

    invoke-virtual {v3}, Lcom/coremedia/iso/boxes/i$a;->b()I

    move-result v3

    if-eq v3, v2, :cond_2

    goto :goto_3

    .line 8
    :cond_2
    invoke-virtual {v5}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/coremedia/iso/boxes/i$a;

    .line 9
    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/i$a;->a()I

    move-result v3

    add-int/2addr v3, v4

    invoke-virtual {v2, v3}, Lcom/coremedia/iso/boxes/i$a;->c(I)V

    goto :goto_4

    .line 10
    :cond_3
    :goto_3
    new-instance v3, Lcom/coremedia/iso/boxes/i$a;

    invoke-direct {v3, v4, v2}, Lcom/coremedia/iso/boxes/i$a;-><init>(II)V

    .line 11
    invoke-virtual {v5, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :goto_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 12
    :cond_4
    aget-object v5, v2, v4

    .line 13
    invoke-interface {v5}, Lcom/googlecode/mp4parser/authoring/h;->n()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lcom/coremedia/iso/boxes/i;->v(Ljava/util/List;)[I

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    return-object v0
.end method

.method public o()Lcom/coremedia/iso/boxes/s0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->f:Lcom/coremedia/iso/boxes/s0;

    return-object v0
.end method

.method public q()[J
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->e:[Lcom/googlecode/mp4parser/authoring/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/h;->q()[J

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->e:[Lcom/googlecode/mp4parser/authoring/h;

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/h;->q()[J

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_3

    .line 2
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->e:[Lcom/googlecode/mp4parser/authoring/h;

    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-lt v3, v2, :cond_2

    .line 3
    new-array v5, v4, [J

    const-wide/16 v2, 0x0

    .line 4
    iget-object v6, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->e:[Lcom/googlecode/mp4parser/authoring/h;

    array-length v7, v6

    move-wide v8, v2

    const/4 v0, 0x0

    const/4 v10, 0x0

    :goto_1
    if-lt v10, v7, :cond_0

    return-object v5

    :cond_0
    aget-object v11, v6, v10

    .line 5
    invoke-interface {v11}, Lcom/googlecode/mp4parser/authoring/h;->q()[J

    move-result-object v12

    array-length v13, v12

    const/4 v2, 0x0

    :goto_2
    if-lt v2, v13, :cond_1

    .line 6
    invoke-interface {v11}, Lcom/googlecode/mp4parser/authoring/h;->x()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v8, v2

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 7
    :cond_1
    aget-wide v3, v12, v2

    add-int/lit8 v14, v0, 0x1

    add-long/2addr v3, v8

    .line 8
    aput-wide v3, v5, v0

    add-int/lit8 v2, v2, 0x1

    move v0, v14

    goto :goto_2

    .line 9
    :cond_2
    aget-object v5, v0, v3

    .line 10
    invoke-interface {v5}, Lcom/googlecode/mp4parser/authoring/h;->q()[J

    move-result-object v5

    array-length v5, v5

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public s()Lcom/coremedia/iso/boxes/a1;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->e:[Lcom/googlecode/mp4parser/authoring/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/h;->s()Lcom/coremedia/iso/boxes/a1;

    move-result-object v0

    return-object v0
.end method

.method public x()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/googlecode/mp4parser/authoring/f;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/d;->e:[Lcom/googlecode/mp4parser/authoring/h;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-lt v3, v2, :cond_0

    return-object v0

    :cond_0
    aget-object v4, v1, v3

    .line 3
    invoke-interface {v4}, Lcom/googlecode/mp4parser/authoring/h;->x()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method
