.class public Lcom/googlecode/mp4parser/authoring/tracks/h265/a;
.super Lcom/googlecode/mp4parser/authoring/tracks/c;
.source "H265TrackImpl.java"

# interfaces
.implements Lcom/googlecode/mp4parser/authoring/tracks/h265/c;


# instance fields
.field l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation
.end field

.field m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation
.end field

.field n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation
.end field

.field o:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/googlecode/mp4parser/authoring/f;",
            ">;"
        }
    .end annotation
.end field

.field p:Lcom/coremedia/iso/boxes/s0;


# direct methods
.method public constructor <init>(Lcom/googlecode/mp4parser/e;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/googlecode/mp4parser/authoring/tracks/c;-><init>(Lcom/googlecode/mp4parser/e;)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->l:Ljava/util/ArrayList;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->m:Ljava/util/ArrayList;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->n:Ljava/util/ArrayList;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->o:Ljava/util/ArrayList;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    new-instance v1, Lcom/googlecode/mp4parser/authoring/tracks/c$a;

    invoke-direct {v1, p1}, Lcom/googlecode/mp4parser/authoring/tracks/c$a;-><init>(Lcom/googlecode/mp4parser/e;)V

    const/4 p1, 0x1

    new-array v2, p1, [Z

    new-array v3, p1, [Z

    const/4 v4, 0x0

    aput-boolean p1, v3, v4

    .line 8
    :goto_0
    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/authoring/tracks/c;->d(Lcom/googlecode/mp4parser/authoring/tracks/c$a;)Ljava/nio/ByteBuffer;

    move-result-object v5

    if-nez v5, :cond_0

    .line 9
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->h()Lcom/coremedia/iso/boxes/s0;

    move-result-object p1

    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->p:Lcom/coremedia/iso/boxes/s0;

    .line 10
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->o:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [J

    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c;->f:[J

    .line 11
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/tracks/c;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object p1

    const-wide/16 v0, 0x19

    invoke-virtual {p1, v0, v1}, Lcom/googlecode/mp4parser/authoring/i;->s(J)V

    .line 12
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c;->f:[J

    const-wide/16 v0, 0x1

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->fill([JJ)V

    return-void

    .line 13
    :cond_0
    invoke-virtual {p0, v5}, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->j(Ljava/nio/ByteBuffer;)Lcom/googlecode/mp4parser/authoring/tracks/h265/b;

    move-result-object v6

    .line 14
    aget-boolean v7, v2, v4

    const/4 v8, 0x2

    if-eqz v7, :cond_2

    .line 15
    invoke-virtual {p0, v6}, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->k(Lcom/googlecode/mp4parser/authoring/tracks/h265/b;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 16
    invoke-virtual {v5, v8}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    and-int/lit8 v7, v7, -0x80

    if-eqz v7, :cond_2

    .line 17
    invoke-virtual {p0, v0, v2, v3}, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->p(Ljava/util/List;[Z[Z)V

    goto :goto_1

    .line 18
    :cond_1
    iget v7, v6, Lcom/googlecode/mp4parser/authoring/tracks/h265/b;->b:I

    packed-switch v7, :pswitch_data_0

    :pswitch_0
    goto :goto_1

    .line 19
    :pswitch_1
    invoke-virtual {p0, v0, v2, v3}, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->p(Ljava/util/List;[Z[Z)V

    .line 20
    :cond_2
    :goto_1
    iget v7, v6, Lcom/googlecode/mp4parser/authoring/tracks/h265/b;->b:I

    const/16 v9, 0x27

    if-eq v7, v9, :cond_3

    packed-switch v7, :pswitch_data_1

    goto :goto_2

    .line 21
    :pswitch_2
    invoke-virtual {v5, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 22
    iget-object v7, p0, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->m:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    sget-object v7, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v8, "Stored PPS"

    invoke-virtual {v7, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_2

    .line 24
    :pswitch_3
    invoke-virtual {v5, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 25
    iget-object v7, p0, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->l:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    invoke-virtual {v5, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 27
    new-instance v7, Lcom/googlecode/mp4parser/authoring/tracks/h265/f;

    new-instance v8, Lcom/googlecode/mp4parser/util/b;

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/googlecode/mp4parser/util/b;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-static {v8}, Ljava/nio/channels/Channels;->newInputStream(Ljava/nio/channels/ReadableByteChannel;)Ljava/io/InputStream;

    move-result-object v8

    invoke-direct {v7, v8}, Lcom/googlecode/mp4parser/authoring/tracks/h265/f;-><init>(Ljava/io/InputStream;)V

    .line 28
    sget-object v7, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v8, "Stored SPS"

    invoke-virtual {v7, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_2

    .line 29
    :pswitch_4
    invoke-virtual {v5, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 30
    iget-object v7, p0, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->n:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    sget-object v7, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v8, "Stored VPS"

    invoke-virtual {v7, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_2

    .line 32
    :cond_3
    new-instance v7, Lcom/googlecode/mp4parser/authoring/tracks/h265/e;

    new-instance v8, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-direct {v7, v8}, Lcom/googlecode/mp4parser/authoring/tracks/h265/e;-><init>(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;)V

    .line 33
    :goto_2
    iget v7, v6, Lcom/googlecode/mp4parser/authoring/tracks/h265/b;->b:I

    packed-switch v7, :pswitch_data_2

    .line 34
    sget-object v7, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Adding "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v9, v6, Lcom/googlecode/mp4parser/authoring/tracks/h265/b;->b:I

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 35
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    :pswitch_5
    invoke-virtual {p0, v6}, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->k(Lcom/googlecode/mp4parser/authoring/tracks/h265/b;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 37
    iget v5, v6, Lcom/googlecode/mp4parser/authoring/tracks/h265/b;->b:I

    const/16 v7, 0x13

    if-eq v5, v7, :cond_4

    const/16 v7, 0x14

    if-eq v5, v7, :cond_4

    aput-boolean v4, v3, v4

    goto :goto_3

    .line 38
    :cond_4
    aget-boolean v5, v3, v4

    and-int/2addr v5, p1

    aput-boolean v5, v3, v4

    .line 39
    :cond_5
    :goto_3
    aget-boolean v5, v2, v4

    invoke-virtual {p0, v6}, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->k(Lcom/googlecode/mp4parser/authoring/tracks/h265/b;)Z

    move-result v6

    or-int/2addr v5, v6

    aput-boolean v5, v2, v4

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x20
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x20
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x20
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch
.end method

.method private h()Lcom/coremedia/iso/boxes/s0;
    .locals 9

    .line 1
    new-instance v0, Lcom/coremedia/iso/boxes/s0;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/s0;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->p:Lcom/coremedia/iso/boxes/s0;

    .line 2
    new-instance v0, Lcom/coremedia/iso/boxes/sampleentry/h;

    const-string v1, "hvc1"

    invoke-direct {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/h;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/a;->d(I)V

    const/16 v2, 0x18

    .line 4
    invoke-virtual {v0, v2}, Lcom/coremedia/iso/boxes/sampleentry/h;->T(I)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/h;->V(I)V

    const-wide/high16 v2, 0x4052000000000000L    # 72.0

    .line 6
    invoke-virtual {v0, v2, v3}, Lcom/coremedia/iso/boxes/sampleentry/h;->X(D)V

    .line 7
    invoke-virtual {v0, v2, v3}, Lcom/coremedia/iso/boxes/sampleentry/h;->Z(D)V

    const/16 v2, 0x280

    .line 8
    invoke-virtual {v0, v2}, Lcom/coremedia/iso/boxes/sampleentry/h;->a0(I)V

    const/16 v2, 0x1e0

    .line 9
    invoke-virtual {v0, v2}, Lcom/coremedia/iso/boxes/sampleentry/h;->W(I)V

    const-string v2, "HEVC Coding"

    .line 10
    invoke-virtual {v0, v2}, Lcom/coremedia/iso/boxes/sampleentry/h;->S(Ljava/lang/String;)V

    .line 11
    new-instance v2, Lcom/mp4parser/iso14496/part15/c;

    invoke-direct {v2}, Lcom/mp4parser/iso14496/part15/c;-><init>()V

    .line 12
    new-instance v3, Lcom/mp4parser/iso14496/part15/d$a;

    invoke-direct {v3}, Lcom/mp4parser/iso14496/part15/d$a;-><init>()V

    .line 13
    iput-boolean v1, v3, Lcom/mp4parser/iso14496/part15/d$a;->a:Z

    const/16 v4, 0x21

    .line 14
    iput v4, v3, Lcom/mp4parser/iso14496/part15/d$a;->c:I

    .line 15
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v3, Lcom/mp4parser/iso14496/part15/d$a;->d:Ljava/util/List;

    .line 16
    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->l:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_2

    .line 17
    new-instance v5, Lcom/mp4parser/iso14496/part15/d$a;

    invoke-direct {v5}, Lcom/mp4parser/iso14496/part15/d$a;-><init>()V

    .line 18
    iput-boolean v1, v5, Lcom/mp4parser/iso14496/part15/d$a;->a:Z

    const/16 v6, 0x22

    .line 19
    iput v6, v5, Lcom/mp4parser/iso14496/part15/d$a;->c:I

    .line 20
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v5, Lcom/mp4parser/iso14496/part15/d$a;->d:Ljava/util/List;

    .line 21
    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->m:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1

    .line 22
    new-instance v4, Lcom/mp4parser/iso14496/part15/d$a;

    invoke-direct {v4}, Lcom/mp4parser/iso14496/part15/d$a;-><init>()V

    .line 23
    iput-boolean v1, v4, Lcom/mp4parser/iso14496/part15/d$a;->a:Z

    .line 24
    iput v6, v4, Lcom/mp4parser/iso14496/part15/d$a;->c:I

    .line 25
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v4, Lcom/mp4parser/iso14496/part15/d$a;->d:Ljava/util/List;

    .line 26
    iget-object v6, p0, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->n:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_0

    .line 27
    invoke-virtual {v2}, Lcom/mp4parser/iso14496/part15/c;->t()Ljava/util/List;

    move-result-object v6

    const/4 v7, 0x3

    new-array v7, v7, [Lcom/mp4parser/iso14496/part15/d$a;

    const/4 v8, 0x0

    aput-object v3, v7, v8

    aput-object v4, v7, v1

    const/4 v1, 0x2

    aput-object v5, v7, v1

    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v6, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 28
    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 29
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->p:Lcom/coremedia/iso/boxes/s0;

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 30
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->p:Lcom/coremedia/iso/boxes/s0;

    return-object v0

    .line 31
    :cond_0
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/nio/ByteBuffer;

    .line 32
    iget-object v7, v4, Lcom/mp4parser/iso14496/part15/d$a;->d:Ljava/util/List;

    invoke-static {v6}, Lcom/googlecode/mp4parser/authoring/tracks/c;->g(Ljava/nio/ByteBuffer;)[B

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 33
    :cond_1
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/nio/ByteBuffer;

    .line 34
    iget-object v8, v5, Lcom/mp4parser/iso14496/part15/d$a;->d:Ljava/util/List;

    invoke-static {v4}, Lcom/googlecode/mp4parser/authoring/tracks/c;->g(Ljava/nio/ByteBuffer;)[B

    move-result-object v4

    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 35
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/nio/ByteBuffer;

    .line 36
    iget-object v6, v3, Lcom/mp4parser/iso14496/part15/d$a;->d:Ljava/util/List;

    invoke-static {v5}, Lcom/googlecode/mp4parser/authoring/tracks/c;->g(Ljava/nio/ByteBuffer;)[B

    move-result-object v5

    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0
.end method

.method public static l([Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance p0, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;

    new-instance v0, Lcom/googlecode/mp4parser/g;

    const-string v1, "c:\\content\\test-UHD-HEVC_01_FMV_Med_track1.hvc"

    invoke-direct {v0, v1}, Lcom/googlecode/mp4parser/g;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;-><init>(Lcom/googlecode/mp4parser/e;)V

    .line 2
    new-instance v0, Lcom/googlecode/mp4parser/authoring/d;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/authoring/d;-><init>()V

    .line 3
    invoke-virtual {v0, p0}, Lcom/googlecode/mp4parser/authoring/d;->a(Lcom/googlecode/mp4parser/authoring/h;)V

    .line 4
    new-instance p0, Lcom/googlecode/mp4parser/authoring/builder/b;

    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/builder/b;-><init>()V

    .line 5
    invoke-virtual {p0, v0}, Lcom/googlecode/mp4parser/authoring/builder/b;->a(Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/j;

    move-result-object p0

    .line 6
    new-instance v0, Ljava/io/FileOutputStream;

    const-string v1, "output.mp4"

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    invoke-interface {p0, v0}, Lcom/coremedia/iso/boxes/j;->u(Ljava/nio/channels/WritableByteChannel;)V

    return-void
.end method


# virtual methods
.method public getHandler()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "vide"

    return-object v0
.end method

.method public j(Ljava/nio/ByteBuffer;)Lcom/googlecode/mp4parser/authoring/tracks/h265/b;
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 2
    invoke-static {p1}, Lcom/coremedia/iso/g;->i(Ljava/nio/ByteBuffer;)I

    move-result p1

    .line 3
    new-instance v0, Lcom/googlecode/mp4parser/authoring/tracks/h265/b;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/authoring/tracks/h265/b;-><init>()V

    const v1, 0x8000

    and-int/2addr v1, p1

    shr-int/lit8 v1, v1, 0xf

    .line 4
    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/h265/b;->a:I

    and-int/lit16 v1, p1, 0x7e00

    shr-int/lit8 v1, v1, 0x9

    .line 5
    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/h265/b;->b:I

    and-int/lit16 v1, p1, 0x1f8

    shr-int/lit8 v1, v1, 0x3

    .line 6
    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/h265/b;->c:I

    and-int/lit8 p1, p1, 0x7

    .line 7
    iput p1, v0, Lcom/googlecode/mp4parser/authoring/tracks/h265/b;->d:I

    return-object v0
.end method

.method k(Lcom/googlecode/mp4parser/authoring/tracks/h265/b;)Z
    .locals 1

    .line 1
    iget p1, p1, Lcom/googlecode/mp4parser/authoring/tracks/h265/b;->b:I

    if-ltz p1, :cond_0

    const/16 v0, 0x1f

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public o()Lcom/coremedia/iso/boxes/s0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public p(Ljava/util/List;[Z[Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/nio/ByteBuffer;",
            ">;[Z[Z)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->o:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/authoring/tracks/c;->b(Ljava/util/List;)Lcom/googlecode/mp4parser/authoring/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Create AU from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " NALs"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 3
    aget-boolean v1, p3, v0

    if-eqz v1, :cond_0

    .line 4
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v2, "  IDR"

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {v1}, Ljava/io/PrintStream;->println()V

    .line 6
    :goto_0
    aput-boolean v0, p2, v0

    const/4 p2, 0x1

    .line 7
    aput-boolean p2, p3, v0

    .line 8
    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public x()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/googlecode/mp4parser/authoring/f;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/h265/a;->o:Ljava/util/ArrayList;

    return-object v0
.end method
