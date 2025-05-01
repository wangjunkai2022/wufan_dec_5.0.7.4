.class public Lcom/googlecode/mp4parser/authoring/tracks/k;
.super Lcom/googlecode/mp4parser/authoring/a;
.source "DTSTrackImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/mp4parser/authoring/tracks/k$b;
    }
.end annotation


# static fields
.field private static final Q:I = 0x4000000


# instance fields
.field A:I

.field B:I

.field C:I

.field D:I

.field E:I

.field F:I

.field G:I

.field H:I

.field I:I

.field J:I

.field K:I

.field L:I

.field M:I

.field N:I

.field O:Ljava/lang/String;

.field private P:Ljava/lang/String;

.field e:Lcom/googlecode/mp4parser/authoring/i;

.field f:Lcom/coremedia/iso/boxes/s0;

.field g:I

.field h:I

.field i:I

.field j:I

.field k:I

.field l:I

.field private m:[J

.field private n:I

.field o:Lcom/googlecode/mp4parser/boxes/d;

.field private p:Lcom/googlecode/mp4parser/e;

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/googlecode/mp4parser/authoring/f;",
            ">;"
        }
    .end annotation
.end field

.field r:Z

.field s:Z

.field t:Z

.field u:I

.field v:I

.field w:I

.field x:I

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lcom/googlecode/mp4parser/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/authoring/a;-><init>(Ljava/lang/String;)V

    .line 35
    new-instance v0, Lcom/googlecode/mp4parser/authoring/i;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/authoring/i;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->e:Lcom/googlecode/mp4parser/authoring/i;

    const/4 v0, 0x0

    .line 36
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->i:I

    .line 37
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->n:I

    .line 38
    new-instance v1, Lcom/googlecode/mp4parser/boxes/d;

    invoke-direct {v1}, Lcom/googlecode/mp4parser/boxes/d;-><init>()V

    iput-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    .line 39
    iput-boolean v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->r:Z

    .line 40
    iput-boolean v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->s:Z

    .line 41
    iput-boolean v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->t:Z

    .line 42
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->u:I

    .line 43
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->v:I

    .line 44
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->w:I

    .line 45
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->x:I

    .line 46
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->y:I

    .line 47
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->z:I

    .line 48
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->A:I

    .line 49
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->B:I

    .line 50
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->C:I

    .line 51
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->D:I

    .line 52
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->E:I

    .line 53
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->F:I

    .line 54
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->G:I

    .line 55
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->H:I

    .line 56
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->I:I

    .line 57
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->J:I

    .line 58
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->K:I

    .line 59
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->L:I

    .line 60
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->M:I

    .line 61
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->N:I

    const-string v0, "none"

    .line 62
    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->O:Ljava/lang/String;

    const-string v0, "eng"

    .line 63
    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->P:Ljava/lang/String;

    .line 64
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->p:Lcom/googlecode/mp4parser/e;

    .line 65
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/k;->g()V

    return-void
.end method

.method public constructor <init>(Lcom/googlecode/mp4parser/e;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/authoring/a;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/googlecode/mp4parser/authoring/i;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/authoring/i;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->e:Lcom/googlecode/mp4parser/authoring/i;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->i:I

    .line 4
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->n:I

    .line 5
    new-instance v1, Lcom/googlecode/mp4parser/boxes/d;

    invoke-direct {v1}, Lcom/googlecode/mp4parser/boxes/d;-><init>()V

    iput-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    .line 6
    iput-boolean v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->r:Z

    .line 7
    iput-boolean v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->s:Z

    .line 8
    iput-boolean v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->t:Z

    .line 9
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->u:I

    .line 10
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->v:I

    .line 11
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->w:I

    .line 12
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->x:I

    .line 13
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->y:I

    .line 14
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->z:I

    .line 15
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->A:I

    .line 16
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->B:I

    .line 17
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->C:I

    .line 18
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->D:I

    .line 19
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->E:I

    .line 20
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->F:I

    .line 21
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->G:I

    .line 22
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->H:I

    .line 23
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->I:I

    .line 24
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->J:I

    .line 25
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->K:I

    .line 26
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->L:I

    .line 27
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->M:I

    .line 28
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->N:I

    const-string v0, "none"

    .line 29
    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->O:Ljava/lang/String;

    const-string v0, "eng"

    .line 30
    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->P:Ljava/lang/String;

    .line 31
    iput-object p2, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->P:Ljava/lang/String;

    .line 32
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->p:Lcom/googlecode/mp4parser/e;

    .line 33
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/k;->g()V

    return-void
.end method

.method private a(Lcom/googlecode/mp4parser/e;IJI)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/googlecode/mp4parser/e;",
            "IJI)",
            "Ljava/util/List<",
            "Lcom/googlecode/mp4parser/authoring/f;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v8, Lcom/googlecode/mp4parser/authoring/tracks/k$b;

    int-to-long v3, p2

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-wide v5, p3

    move v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/googlecode/mp4parser/authoring/tracks/k$b;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/k;Lcom/googlecode/mp4parser/e;JJI)V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 3
    :goto_0
    invoke-virtual {v8}, Lcom/googlecode/mp4parser/authoring/tracks/k$b;->e()Ljava/nio/ByteBuffer;

    move-result-object p2

    if-nez p2, :cond_0

    .line 4
    sget-object p2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string p3, "all samples found"

    invoke-virtual {p2, p3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-object p1

    .line 5
    :cond_0
    new-instance p3, Lcom/googlecode/mp4parser/authoring/tracks/k$a;

    invoke-direct {p3, p0, p2}, Lcom/googlecode/mp4parser/authoring/tracks/k$a;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/k;Ljava/nio/ByteBuffer;)V

    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method private b(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    packed-switch p1, :pswitch_data_0

    .line 1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Unknown bitrate value"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    const/4 p1, -0x1

    goto :goto_0

    :pswitch_1
    const/16 p1, 0x600

    goto :goto_0

    :pswitch_2
    const/16 p1, 0x5c0

    goto :goto_0

    :pswitch_3
    const/16 p1, 0x583

    goto :goto_0

    :pswitch_4
    const/16 p1, 0x580

    goto :goto_0

    :pswitch_5
    const/16 p1, 0x540

    goto :goto_0

    :pswitch_6
    const/16 p1, 0x500

    goto :goto_0

    :pswitch_7
    const/16 p1, 0x480

    goto :goto_0

    :pswitch_8
    const/16 p1, 0x400

    goto :goto_0

    :pswitch_9
    const/16 p1, 0x3c0

    goto :goto_0

    :pswitch_a
    const/16 p1, 0x300

    goto :goto_0

    :pswitch_b
    const/16 p1, 0x280

    goto :goto_0

    :pswitch_c
    const/16 p1, 0x240

    goto :goto_0

    :pswitch_d
    const/16 p1, 0x200

    goto :goto_0

    :pswitch_e
    const/16 p1, 0x1c0

    goto :goto_0

    :pswitch_f
    const/16 p1, 0x180

    goto :goto_0

    :pswitch_10
    const/16 p1, 0x140

    goto :goto_0

    :pswitch_11
    const/16 p1, 0x100

    goto :goto_0

    :pswitch_12
    const/16 p1, 0xe0

    goto :goto_0

    :pswitch_13
    const/16 p1, 0xc0

    goto :goto_0

    :pswitch_14
    const/16 p1, 0x80

    goto :goto_0

    :pswitch_15
    const/16 p1, 0x70

    goto :goto_0

    :pswitch_16
    const/16 p1, 0x60

    goto :goto_0

    :pswitch_17
    const/16 p1, 0x40

    goto :goto_0

    :pswitch_18
    const/16 p1, 0x38

    goto :goto_0

    :pswitch_19
    const/16 p1, 0x20

    :goto_0
    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private d(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    packed-switch p1, :pswitch_data_0

    .line 1
    :pswitch_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Unknown Sample Rate"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    const p1, 0xbb80

    goto :goto_0

    :pswitch_2
    const/16 p1, 0x5dc0

    goto :goto_0

    :pswitch_3
    const/16 p1, 0x2ee0

    goto :goto_0

    :pswitch_4
    const p1, 0xac44

    goto :goto_0

    :pswitch_5
    const/16 p1, 0x5622

    goto :goto_0

    :pswitch_6
    const/16 p1, 0x2b11

    goto :goto_0

    :pswitch_7
    const/16 p1, 0x7d00

    goto :goto_0

    :pswitch_8
    const/16 p1, 0x3e80

    goto :goto_0

    :pswitch_9
    const/16 p1, 0x1f40

    :goto_0
    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private g()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/k;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/coremedia/iso/boxes/s0;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/s0;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->f:Lcom/coremedia/iso/boxes/s0;

    .line 3
    new-instance v0, Lcom/coremedia/iso/boxes/sampleentry/c;

    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->O:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/c;-><init>(Ljava/lang/String;)V

    .line 4
    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->l:I

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/c;->c0(I)V

    .line 5
    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->g:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/coremedia/iso/boxes/sampleentry/c;->h0(J)V

    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/a;->d(I)V

    const/16 v1, 0x10

    .line 7
    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/c;->i0(I)V

    .line 8
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 9
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->f:Lcom/coremedia/iso/boxes/s0;

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 10
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->e:Lcom/googlecode/mp4parser/authoring/i;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/authoring/i;->l(Ljava/util/Date;)V

    .line 11
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->e:Lcom/googlecode/mp4parser/authoring/i;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/authoring/i;->r(Ljava/util/Date;)V

    .line 12
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->e:Lcom/googlecode/mp4parser/authoring/i;

    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->P:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/authoring/i;->o(Ljava/lang/String;)V

    .line 13
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->e:Lcom/googlecode/mp4parser/authoring/i;

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->g:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/googlecode/mp4parser/authoring/i;->s(J)V

    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0
.end method

.method private h(ILjava/nio/ByteBuffer;)Z
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    .line 2
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    .line 3
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    .line 4
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v2

    shl-int/lit8 v1, v1, 0x10

    const v3, 0xffff

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    .line 5
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->D:I

    .line 6
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->F:I

    .line 7
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->G:I

    .line 8
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    .line 9
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    shl-int/lit8 v1, v1, 0x20

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    .line 10
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->H:I

    .line 11
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->I:I

    .line 12
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->J:I

    and-int/lit8 v1, v0, 0x3

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    .line 13
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    .line 14
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v2

    shl-int/lit8 v1, v1, 0x10

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    .line 15
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->K:I

    .line 16
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->L:I

    .line 17
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->M:I

    const/16 v1, 0x1c

    goto :goto_0

    :cond_0
    const/16 v1, 0x15

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-lez v2, :cond_1

    .line 18
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    iput v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->N:I

    add-int/lit8 v1, v1, 0x1

    :cond_1
    and-int/lit8 v0, v0, 0x8

    const/4 v2, 0x1

    if-lez v0, :cond_2

    .line 19
    iput v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->E:I

    :cond_2
    :goto_1
    if-lt v1, p1, :cond_3

    return v2

    .line 20
    :cond_3
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method private j(ILjava/nio/ByteBuffer;)Z
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    .line 2
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    shl-int/lit8 v0, v0, 0x10

    const v2, 0xffff

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    .line 3
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->v:I

    .line 4
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->w:I

    .line 5
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->x:I

    .line 6
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->y:I

    const/16 v0, 0xb

    :goto_0
    if-lt v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 7
    :cond_0
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private k(ILjava/nio/ByteBuffer;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 2
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    .line 3
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 4
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    .line 5
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    .line 6
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    .line 7
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->u:I

    and-int/lit8 v2, v0, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    .line 8
    iput-boolean v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->r:Z

    :cond_0
    and-int/lit8 v2, v0, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_1

    .line 9
    iput-boolean v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->s:Z

    :cond_1
    const/16 v2, 0x10

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_2

    .line 10
    iput-boolean v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->t:Z

    add-int/2addr v1, v3

    .line 11
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->u:I

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->u:I

    :goto_0
    const/16 v0, 0xe

    :goto_1
    if-lt v0, p1, :cond_3

    return-void

    .line 13
    :cond_3
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method private l(ILjava/nio/ByteBuffer;)Z
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    .line 2
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    shl-int/lit8 v0, v0, 0x10

    const v2, 0xffff

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    .line 3
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->z:I

    .line 4
    iget-boolean v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->r:Z

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    .line 6
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    shl-int/lit8 v0, v0, 0x10

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    .line 7
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->A:I

    .line 8
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->B:I

    const/16 v0, 0x8

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->C:I

    const/4 v0, 0x7

    :goto_0
    if-lt v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    .line 10
    :cond_1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private p()Z
    .locals 26
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v6, p0

    .line 1
    iget-object v0, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->p:Lcom/googlecode/mp4parser/e;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x61a8

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/googlecode/mp4parser/e;->Q(JJ)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    .line 3
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    const v3, 0x44545348

    if-ne v1, v3, :cond_4e

    const v4, 0x44484452

    if-ne v2, v4, :cond_4e

    :goto_0
    const v5, 0x5354524d

    const/4 v7, 0x0

    if-ne v1, v5, :cond_0

    const v5, 0x44415441

    if-eq v2, v5, :cond_1

    .line 4
    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v5

    const/16 v8, 0x64

    if-gt v5, v8, :cond_47

    .line 5
    :cond_1
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v3

    .line 6
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    iput v1, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->n:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v5, -0x1

    const/4 v9, -0x1

    const/4 v10, -0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    :goto_1
    const/4 v8, 0x2

    if-eqz v2, :cond_29

    .line 7
    iget v0, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->k:I

    const/16 v2, 0x200

    const/16 v12, 0x1000

    if-eq v0, v2, :cond_5

    const/16 v2, 0x400

    if-eq v0, v2, :cond_4

    const/16 v2, 0x800

    if-eq v0, v2, :cond_3

    if-eq v0, v12, :cond_2

    const/4 v0, -0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x3

    goto :goto_2

    :cond_3
    const/4 v0, 0x2

    goto :goto_2

    :cond_4
    const/4 v0, 0x1

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    if-ne v0, v1, :cond_6

    return v7

    :cond_6
    if-eqz v9, :cond_7

    if-eq v9, v8, :cond_7

    packed-switch v9, :pswitch_data_0

    const/16 v9, 0x1f

    :cond_7
    :pswitch_0
    const-string v1, "dtsh"

    if-nez v5, :cond_e

    const/16 v2, 0x15

    const/4 v10, 0x1

    if-ne v11, v10, :cond_9

    if-nez v15, :cond_8

    const/16 v1, 0x11

    const-string v2, "dtsl"

    .line 8
    iput-object v2, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->O:Ljava/lang/String;

    const/16 v20, 0x11

    goto :goto_4

    .line 9
    :cond_8
    iput-object v1, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->O:Ljava/lang/String;

    :goto_3
    const/16 v20, 0x15

    goto :goto_4

    :cond_9
    if-ne v14, v10, :cond_a

    const/16 v1, 0x12

    const-string v2, "dtse"

    .line 10
    iput-object v2, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->O:Ljava/lang/String;

    const/16 v20, 0x12

    goto :goto_4

    :cond_a
    if-ne v15, v10, :cond_d

    .line 11
    iput-object v1, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->O:Ljava/lang/String;

    move/from16 v1, v16

    if-nez v1, :cond_b

    if-nez v11, :cond_b

    const/16 v1, 0x13

    const/16 v20, 0x13

    goto :goto_4

    :cond_b
    if-ne v1, v10, :cond_c

    if-nez v11, :cond_c

    const/16 v20, 0x14

    goto :goto_4

    :cond_c
    if-nez v1, :cond_d

    if-ne v11, v10, :cond_d

    goto :goto_3

    :cond_d
    const/16 v20, 0x0

    .line 12
    :goto_4
    iget v1, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->D:I

    iput v1, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->g:I

    const/16 v1, 0x18

    .line 13
    iput v1, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->j:I

    move/from16 v1, v20

    goto/16 :goto_5

    :cond_e
    move/from16 v2, v16

    const/4 v7, 0x1

    if-ge v10, v7, :cond_14

    const-string v2, "dtsc"

    if-lez v13, :cond_13

    move/from16 v7, v17

    if-eqz v7, :cond_12

    if-eq v7, v8, :cond_11

    const/4 v10, 0x6

    if-eq v7, v10, :cond_10

    .line 14
    iput-object v1, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->O:Ljava/lang/String;

    :cond_f
    const/4 v1, 0x0

    goto/16 :goto_5

    .line 15
    :cond_10
    iput-object v1, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->O:Ljava/lang/String;

    const/4 v1, 0x3

    goto/16 :goto_5

    .line 16
    :cond_11
    iput-object v2, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->O:Ljava/lang/String;

    const/4 v1, 0x4

    goto/16 :goto_5

    .line 17
    :cond_12
    iput-object v2, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->O:Ljava/lang/String;

    const/4 v1, 0x2

    goto/16 :goto_5

    .line 18
    :cond_13
    iput-object v2, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->O:Ljava/lang/String;

    const/4 v1, 0x1

    goto/16 :goto_5

    :cond_14
    move/from16 v7, v17

    .line 19
    iput-object v1, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->O:Ljava/lang/String;

    if-nez v13, :cond_1c

    if-nez v15, :cond_15

    const/4 v1, 0x1

    if-ne v2, v1, :cond_15

    move/from16 v1, v18

    move/from16 v10, v19

    if-nez v1, :cond_16

    if-nez v10, :cond_16

    if-nez v11, :cond_16

    if-nez v14, :cond_16

    const/4 v1, 0x5

    goto/16 :goto_5

    :cond_15
    move/from16 v1, v18

    move/from16 v10, v19

    :cond_16
    if-nez v15, :cond_17

    if-nez v2, :cond_17

    if-nez v1, :cond_17

    const/4 v7, 0x1

    if-ne v10, v7, :cond_18

    if-nez v11, :cond_18

    if-nez v14, :cond_18

    const/4 v1, 0x6

    goto/16 :goto_5

    :cond_17
    const/4 v7, 0x1

    :cond_18
    if-nez v15, :cond_19

    if-ne v2, v7, :cond_19

    if-nez v1, :cond_19

    if-ne v10, v7, :cond_19

    if-nez v11, :cond_19

    if-nez v14, :cond_19

    const/16 v1, 0x9

    goto/16 :goto_5

    :cond_19
    if-nez v15, :cond_1a

    if-nez v2, :cond_1a

    const/4 v7, 0x1

    if-ne v1, v7, :cond_1a

    if-nez v10, :cond_1a

    if-nez v11, :cond_1a

    if-nez v14, :cond_1a

    const/16 v1, 0xa

    goto/16 :goto_5

    :cond_1a
    if-nez v15, :cond_1b

    const/4 v7, 0x1

    if-ne v2, v7, :cond_1b

    if-ne v1, v7, :cond_1b

    if-nez v10, :cond_1b

    if-nez v11, :cond_1b

    if-nez v14, :cond_1b

    const/16 v1, 0xd

    goto/16 :goto_5

    :cond_1b
    if-nez v15, :cond_f

    if-nez v2, :cond_f

    if-nez v1, :cond_f

    if-nez v10, :cond_f

    const/4 v1, 0x1

    if-ne v11, v1, :cond_f

    if-nez v14, :cond_f

    const/16 v1, 0xe

    goto/16 :goto_5

    :cond_1c
    move/from16 v1, v18

    move/from16 v10, v19

    if-nez v7, :cond_1d

    if-nez v15, :cond_1d

    if-nez v2, :cond_1d

    if-nez v1, :cond_1d

    const/4 v13, 0x1

    if-ne v10, v13, :cond_1d

    if-nez v11, :cond_1d

    if-nez v14, :cond_1d

    const/4 v1, 0x7

    goto/16 :goto_5

    :cond_1d
    const/4 v13, 0x6

    if-ne v7, v13, :cond_1e

    if-nez v15, :cond_1e

    if-nez v2, :cond_1e

    if-nez v1, :cond_1e

    const/4 v13, 0x1

    if-ne v10, v13, :cond_1e

    if-nez v11, :cond_1e

    if-nez v14, :cond_1e

    const/16 v1, 0x8

    goto :goto_5

    :cond_1e
    if-nez v7, :cond_1f

    if-nez v15, :cond_1f

    if-nez v2, :cond_1f

    const/4 v13, 0x1

    if-ne v1, v13, :cond_1f

    if-nez v10, :cond_1f

    if-nez v11, :cond_1f

    if-nez v14, :cond_1f

    const/16 v1, 0xb

    goto :goto_5

    :cond_1f
    const/4 v13, 0x6

    if-ne v7, v13, :cond_20

    if-nez v15, :cond_20

    if-nez v2, :cond_20

    const/4 v13, 0x1

    if-ne v1, v13, :cond_20

    if-nez v10, :cond_20

    if-nez v11, :cond_20

    if-nez v14, :cond_20

    const/16 v1, 0xc

    goto :goto_5

    :cond_20
    if-nez v7, :cond_21

    if-nez v15, :cond_21

    if-nez v2, :cond_21

    if-nez v1, :cond_21

    if-nez v10, :cond_21

    const/4 v13, 0x1

    if-ne v11, v13, :cond_21

    if-nez v14, :cond_21

    const/16 v1, 0xf

    goto :goto_5

    :cond_21
    if-ne v7, v8, :cond_f

    if-nez v15, :cond_f

    if-nez v2, :cond_f

    if-nez v1, :cond_f

    if-nez v10, :cond_f

    const/4 v1, 0x1

    if-ne v11, v1, :cond_f

    if-nez v14, :cond_f

    const/16 v1, 0x10

    .line 20
    :goto_5
    iget-object v2, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    iget v7, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->D:I

    int-to-long v10, v7

    invoke-virtual {v2, v10, v11}, Lcom/googlecode/mp4parser/boxes/d;->P(J)V

    .line 21
    iget-boolean v2, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->r:Z

    if-eqz v2, :cond_22

    .line 22
    iget-object v2, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    iget v7, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->w:I

    iget v10, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->A:I

    add-int/2addr v7, v10

    mul-int/lit16 v7, v7, 0x3e8

    int-to-long v10, v7

    invoke-virtual {v2, v10, v11}, Lcom/googlecode/mp4parser/boxes/d;->S(J)V

    goto :goto_6

    .line 23
    :cond_22
    iget-object v2, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    iget v7, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->w:I

    iget v10, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->z:I

    add-int/2addr v7, v10

    mul-int/lit16 v7, v7, 0x3e8

    int-to-long v10, v7

    invoke-virtual {v2, v10, v11}, Lcom/googlecode/mp4parser/boxes/d;->S(J)V

    .line 24
    :goto_6
    iget-object v2, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    iget v7, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->w:I

    iget v10, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->z:I

    add-int/2addr v7, v10

    mul-int/lit16 v7, v7, 0x3e8

    int-to-long v10, v7

    invoke-virtual {v2, v10, v11}, Lcom/googlecode/mp4parser/boxes/d;->K(J)V

    .line 25
    iget-object v2, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    iget v7, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->j:I

    invoke-virtual {v2, v7}, Lcom/googlecode/mp4parser/boxes/d;->U(I)V

    .line 26
    iget-object v2, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    invoke-virtual {v2, v0}, Lcom/googlecode/mp4parser/boxes/d;->Q(I)V

    .line 27
    iget-object v0, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/boxes/d;->Z(I)V

    .line 28
    iget v0, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->x:I

    and-int/lit8 v1, v0, 0x8

    if-gtz v1, :cond_24

    and-int/2addr v0, v12

    if-lez v0, :cond_23

    goto :goto_7

    .line 29
    :cond_23
    iget-object v0, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/boxes/d;->M(I)V

    goto :goto_8

    .line 30
    :cond_24
    :goto_7
    iget-object v0, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/boxes/d;->M(I)V

    .line 31
    :goto_8
    iget-object v0, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    invoke-virtual {v0, v9}, Lcom/googlecode/mp4parser/boxes/d;->N(I)V

    .line 32
    iget-object v0, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    iget v1, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->y:I

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/boxes/d;->O(I)V

    .line 33
    iget-object v0, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/boxes/d;->Y(I)V

    .line 34
    iget-object v0, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/boxes/d;->V(I)V

    .line 35
    iget-object v0, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    iget v1, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->I:I

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/boxes/d;->L(I)V

    .line 36
    iget v0, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->v:I

    if-lez v0, :cond_25

    iget v0, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->z:I

    if-lez v0, :cond_25

    .line 37
    iget-object v0, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/boxes/d;->T(I)V

    const/4 v1, 0x0

    goto :goto_9

    .line 38
    :cond_25
    iget-object v0, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/boxes/d;->T(I)V

    .line 39
    :goto_9
    iget-object v0, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    iget v2, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->E:I

    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/boxes/d;->R(I)V

    .line 40
    iget-object v0, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->o:Lcom/googlecode/mp4parser/boxes/d;

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/boxes/d;->X(I)V

    .line 41
    iput v1, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->l:I

    const/16 v0, 0x10

    const/4 v7, 0x0

    :goto_a
    if-lt v7, v0, :cond_26

    .line 42
    iget-object v1, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->p:Lcom/googlecode/mp4parser/e;

    iget v2, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->n:I

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/googlecode/mp4parser/authoring/tracks/k;->a(Lcom/googlecode/mp4parser/e;IJI)Ljava/util/List;

    move-result-object v0

    iput-object v0, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->q:Ljava/util/List;

    .line 43
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [J

    iput-object v0, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->m:[J

    .line 44
    iget v1, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->k:I

    int-to-long v1, v1

    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->fill([JJ)V

    const/4 v0, 0x1

    return v0

    :cond_26
    const/4 v0, 0x1

    .line 45
    iget v1, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->I:I

    shr-int/2addr v1, v7

    and-int/2addr v1, v0

    if-ne v1, v0, :cond_28

    const/16 v0, 0xc

    if-eqz v7, :cond_27

    if-eq v7, v0, :cond_27

    const/16 v1, 0xe

    if-eq v7, v1, :cond_27

    const/4 v1, 0x3

    if-eq v7, v1, :cond_27

    const/4 v1, 0x4

    if-eq v7, v1, :cond_27

    const/4 v1, 0x7

    if-eq v7, v1, :cond_27

    const/16 v1, 0x8

    if-eq v7, v1, :cond_27

    .line 46
    iget v1, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->l:I

    add-int/2addr v1, v8

    iput v1, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->l:I

    goto :goto_b

    .line 47
    :cond_27
    iget v1, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->l:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->l:I

    goto :goto_c

    :cond_28
    const/16 v0, 0xc

    :goto_b
    const/4 v2, 0x1

    :goto_c
    add-int/lit8 v7, v7, 0x1

    const/16 v0, 0x10

    goto :goto_a

    :cond_29
    move/from16 v22, v16

    move/from16 v7, v17

    move/from16 v23, v18

    move/from16 v24, v19

    const/4 v1, 0x1

    const/16 v17, 0xc

    .line 48
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v19

    .line 49
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v8

    move/from16 v25, v2

    const v2, 0x7ffe8001

    if-ne v8, v2, :cond_34

    if-ne v5, v1, :cond_2a

    move/from16 v17, v7

    move/from16 v16, v22

    move/from16 v18, v23

    move/from16 v19, v24

    const/4 v1, -0x1

    const/4 v2, 0x1

    :goto_d
    const/4 v7, 0x0

    goto/16 :goto_1

    .line 50
    :cond_2a
    new-instance v2, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;

    invoke-direct {v2, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;-><init>(Ljava/nio/ByteBuffer;)V

    .line 51
    invoke-virtual {v2, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v5

    const/4 v7, 0x5

    .line 52
    invoke-virtual {v2, v7}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v8

    .line 53
    invoke-virtual {v2, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v7

    if-ne v5, v1, :cond_33

    const/16 v5, 0x1f

    if-ne v8, v5, :cond_33

    if-eqz v7, :cond_2b

    goto/16 :goto_10

    :cond_2b
    const/4 v5, 0x7

    .line 54
    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v8

    add-int/2addr v8, v1

    mul-int/lit8 v8, v8, 0x20

    .line 55
    iput v8, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->k:I

    const/16 v1, 0xe

    .line 56
    invoke-virtual {v2, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v1

    .line 57
    iget v5, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->i:I

    add-int/lit8 v8, v1, 0x1

    add-int/2addr v5, v8

    iput v5, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->i:I

    const/4 v5, 0x6

    .line 58
    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v9

    const/4 v5, 0x4

    .line 59
    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v8

    .line 60
    invoke-direct {v6, v8}, Lcom/googlecode/mp4parser/authoring/tracks/k;->d(I)I

    move-result v5

    iput v5, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->g:I

    const/4 v5, 0x5

    .line 61
    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v8

    .line 62
    invoke-direct {v6, v8}, Lcom/googlecode/mp4parser/authoring/tracks/k;->b(I)I

    move-result v5

    iput v5, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->h:I

    const/4 v5, 0x1

    .line 63
    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v8

    if-eqz v8, :cond_2c

    const/4 v8, 0x0

    return v8

    .line 64
    :cond_2c
    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    .line 65
    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    .line 66
    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    .line 67
    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    const/4 v8, 0x3

    .line 68
    invoke-virtual {v2, v8}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v17

    .line 69
    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v13

    .line 70
    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    const/4 v8, 0x2

    .line 71
    invoke-virtual {v2, v8}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    .line 72
    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    if-ne v7, v5, :cond_2d

    const/16 v7, 0x10

    .line 73
    invoke-virtual {v2, v7}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    .line 74
    :cond_2d
    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    const/4 v7, 0x4

    .line 75
    invoke-virtual {v2, v7}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v5

    .line 76
    invoke-virtual {v2, v8}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    const/4 v7, 0x3

    .line 77
    invoke-virtual {v2, v7}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v8

    if-eqz v8, :cond_30

    const/4 v7, 0x1

    if-eq v8, v7, :cond_30

    const/4 v7, 0x2

    if-eq v8, v7, :cond_2f

    const/4 v7, 0x3

    if-eq v8, v7, :cond_2f

    const/4 v7, 0x5

    if-eq v8, v7, :cond_2e

    const/4 v7, 0x6

    if-eq v8, v7, :cond_2e

    const/4 v7, 0x0

    return v7

    :cond_2e
    const/16 v7, 0x18

    .line 78
    iput v7, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->j:I

    goto :goto_e

    :cond_2f
    const/16 v7, 0x14

    .line 79
    iput v7, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->j:I

    goto :goto_e

    :cond_30
    const/16 v7, 0x10

    .line 80
    iput v7, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->j:I

    :goto_e
    const/4 v7, 0x1

    .line 81
    invoke-virtual {v2, v7}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    .line 82
    invoke-virtual {v2, v7}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    const/4 v8, 0x6

    if-eq v5, v8, :cond_32

    const/4 v8, 0x7

    if-eq v5, v8, :cond_31

    const/4 v5, 0x4

    .line 83
    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    goto :goto_f

    :cond_31
    const/4 v5, 0x4

    .line 84
    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    goto :goto_f

    :cond_32
    const/4 v5, 0x4

    .line 85
    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    :goto_f
    add-int v19, v19, v1

    add-int/lit8 v1, v19, 0x1

    .line 86
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move/from16 v16, v22

    move/from16 v18, v23

    move/from16 v19, v24

    move/from16 v2, v25

    const/4 v1, -0x1

    const/4 v5, 0x1

    goto/16 :goto_d

    :cond_33
    :goto_10
    const/4 v0, 0x0

    return v0

    :cond_34
    const/16 v1, 0x14

    const/16 v2, 0x10

    const v10, 0x64582025

    if-ne v8, v10, :cond_46

    const/4 v8, -0x1

    if-ne v5, v8, :cond_35

    .line 87
    iget v5, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->G:I

    iput v5, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->k:I

    const/4 v5, 0x0

    .line 88
    :cond_35
    new-instance v10, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;

    invoke-direct {v10, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;-><init>(Ljava/nio/ByteBuffer;)V

    const/16 v1, 0x8

    .line 89
    invoke-virtual {v10, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    const/4 v1, 0x2

    .line 90
    invoke-virtual {v10, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    const/4 v1, 0x1

    .line 91
    invoke-virtual {v10, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v18

    if-nez v18, :cond_36

    const/16 v2, 0x8

    const/16 v8, 0x10

    goto :goto_11

    :cond_36
    const/16 v2, 0xc

    const/16 v8, 0x14

    .line 92
    :goto_11
    invoke-virtual {v10, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v2

    add-int/2addr v2, v1

    .line 93
    invoke-virtual {v10, v8}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v8

    add-int/2addr v8, v1

    add-int v2, v19, v2

    .line 94
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 95
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    const v10, 0x5a5a5a5a

    if-ne v2, v10, :cond_38

    if-ne v12, v1, :cond_37

    const/4 v2, 0x1

    goto :goto_12

    :cond_37
    move/from16 v2, v25

    :goto_12
    move-wide/from16 v20, v3

    move/from16 v10, v22

    move/from16 v4, v24

    const/4 v12, 0x1

    goto/16 :goto_19

    :cond_38
    const v10, 0x47004a03

    if-ne v2, v10, :cond_3a

    move/from16 v10, v22

    if-ne v10, v1, :cond_39

    const/4 v2, 0x1

    goto :goto_13

    :cond_39
    move/from16 v2, v25

    :goto_13
    move-wide/from16 v20, v3

    move/from16 v4, v24

    const/4 v10, 0x1

    goto/16 :goto_19

    :cond_3a
    move-wide/from16 v20, v3

    move/from16 v10, v22

    const v3, 0x1d95f262

    if-ne v2, v3, :cond_3c

    move/from16 v3, v23

    if-ne v3, v1, :cond_3b

    const/4 v2, 0x1

    goto :goto_14

    :cond_3b
    move/from16 v2, v25

    :goto_14
    move/from16 v4, v24

    const/16 v23, 0x1

    goto :goto_19

    :cond_3c
    move/from16 v3, v23

    const v4, 0x655e315e

    if-ne v2, v4, :cond_3e

    move/from16 v4, v24

    if-ne v4, v1, :cond_3d

    const/4 v2, 0x1

    goto :goto_15

    :cond_3d
    move/from16 v2, v25

    :goto_15
    move/from16 v23, v3

    const/4 v4, 0x1

    goto :goto_19

    :cond_3e
    move/from16 v23, v3

    move/from16 v4, v24

    const v3, 0xa801921

    if-ne v2, v3, :cond_40

    if-ne v14, v1, :cond_3f

    const/4 v2, 0x1

    goto :goto_16

    :cond_3f
    move/from16 v2, v25

    :goto_16
    const/4 v14, 0x1

    goto :goto_19

    :cond_40
    const v3, 0x41a29547

    if-ne v2, v3, :cond_42

    if-ne v11, v1, :cond_41

    const/4 v2, 0x1

    goto :goto_17

    :cond_41
    move/from16 v2, v25

    :goto_17
    const/4 v11, 0x1

    goto :goto_19

    :cond_42
    const v3, 0x2b09261

    if-ne v2, v3, :cond_44

    if-ne v15, v1, :cond_43

    const/4 v2, 0x1

    goto :goto_18

    :cond_43
    move/from16 v2, v25

    :goto_18
    const/4 v15, 0x1

    goto :goto_19

    :cond_44
    move/from16 v2, v25

    :goto_19
    if-nez v2, :cond_45

    .line 96
    iget v3, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->i:I

    add-int/2addr v3, v8

    iput v3, v6, Lcom/googlecode/mp4parser/authoring/tracks/k;->i:I

    :cond_45
    add-int v3, v19, v8

    .line 97
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move/from16 v19, v4

    move/from16 v17, v7

    move/from16 v16, v10

    move-wide/from16 v3, v20

    move/from16 v18, v23

    const/4 v1, -0x1

    const/4 v7, 0x0

    const/4 v10, 0x1

    goto/16 :goto_1

    .line 98
    :cond_46
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "No DTS_SYNCWORD_* found at "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 99
    :cond_47
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v7

    long-to-int v5, v7

    if-ne v1, v3, :cond_48

    if-ne v2, v4, :cond_48

    .line 100
    invoke-direct {v6, v5, v0}, Lcom/googlecode/mp4parser/authoring/tracks/k;->k(ILjava/nio/ByteBuffer;)V

    goto :goto_1b

    :cond_48
    const v7, 0x434f5245

    if-ne v1, v7, :cond_49

    const v7, 0x53534d44

    if-ne v2, v7, :cond_49

    .line 101
    invoke-direct {v6, v5, v0}, Lcom/googlecode/mp4parser/authoring/tracks/k;->j(ILjava/nio/ByteBuffer;)Z

    move-result v1

    if-nez v1, :cond_4c

    const/4 v7, 0x0

    return v7

    :cond_49
    const/4 v7, 0x0

    const v8, 0x41555052

    if-ne v1, v8, :cond_4a

    const v8, 0x2d484452

    if-ne v2, v8, :cond_4a

    .line 102
    invoke-direct {v6, v5, v0}, Lcom/googlecode/mp4parser/authoring/tracks/k;->h(ILjava/nio/ByteBuffer;)Z

    move-result v1

    if-nez v1, :cond_4c

    return v7

    :cond_4a
    const v8, 0x45585453

    if-ne v1, v8, :cond_4b

    const v1, 0x535f4d44

    if-ne v2, v1, :cond_4b

    .line 103
    invoke-direct {v6, v5, v0}, Lcom/googlecode/mp4parser/authoring/tracks/k;->l(ILjava/nio/ByteBuffer;)Z

    move-result v1

    if-nez v1, :cond_4c

    return v7

    :cond_4b
    :goto_1a
    if-lt v7, v5, :cond_4d

    .line 104
    :cond_4c
    :goto_1b
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    .line 105
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    goto/16 :goto_0

    .line 106
    :cond_4d
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    add-int/lit8 v7, v7, 0x1

    goto :goto_1a

    .line 107
    :cond_4e
    new-instance v0, Ljava/io/IOException;

    const-string v1, "data does not start with \'DTSHDHDR\' as required for a DTS-HD file"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_1d

    :goto_1c
    throw v0

    :goto_1d
    goto :goto_1c

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public M()Lcom/googlecode/mp4parser/authoring/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->e:Lcom/googlecode/mp4parser/authoring/i;

    return-object v0
.end method

.method public O()[J
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->m:[J

    return-object v0
.end method

.method public U()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/coremedia/iso/boxes/r0$a;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->p:Lcom/googlecode/mp4parser/e;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/e;->close()V

    return-void
.end method

.method public getHandler()Ljava/lang/String;
    .locals 1

    const-string v0, "soun"

    return-object v0
.end method

.method public n()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/coremedia/iso/boxes/i$a;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public o()Lcom/coremedia/iso/boxes/s0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->f:Lcom/coremedia/iso/boxes/s0;

    return-object v0
.end method

.method public q()[J
    .locals 1

    const/4 v0, 0x0

    return-object v0
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
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/k;->q:Ljava/util/List;

    return-object v0
.end method
