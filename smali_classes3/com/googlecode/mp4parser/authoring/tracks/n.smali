.class public Lcom/googlecode/mp4parser/authoring/tracks/n;
.super Lcom/googlecode/mp4parser/authoring/a;
.source "MP3TrackImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/mp4parser/authoring/tracks/n$a;
    }
.end annotation


# static fields
.field private static final m:I = 0x3

.field private static final n:I = 0x1

.field private static final o:[I

.field private static final p:[I

.field private static final q:I = 0x480

.field private static final r:I = 0x6b

.field private static final s:I = 0x5


# instance fields
.field private final e:Lcom/googlecode/mp4parser/e;

.field f:Lcom/googlecode/mp4parser/authoring/i;

.field g:Lcom/coremedia/iso/boxes/s0;

.field h:Lcom/googlecode/mp4parser/authoring/tracks/n$a;

.field i:J

.field j:J

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/googlecode/mp4parser/authoring/f;",
            ">;"
        }
    .end annotation
.end field

.field private l:[J


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x4

    new-array v1, v0, [I

    const/4 v2, 0x0

    const v3, 0xac44

    aput v3, v1, v2

    const/4 v2, 0x1

    const v3, 0xbb80

    aput v3, v1, v2

    const/4 v4, 0x2

    const/16 v5, 0x7d00

    aput v5, v1, v4

    .line 1
    sput-object v1, Lcom/googlecode/mp4parser/authoring/tracks/n;->o:[I

    const/16 v1, 0x10

    new-array v1, v1, [I

    aput v5, v1, v2

    const v2, 0x9c40

    aput v2, v1, v4

    const/4 v2, 0x3

    aput v3, v1, v2

    const v2, 0xdac0

    aput v2, v1, v0

    const/4 v0, 0x5

    const v2, 0xfa00

    aput v2, v1, v0

    const/4 v0, 0x6

    const v2, 0x13880

    aput v2, v1, v0

    const/4 v0, 0x7

    const v2, 0x17700

    aput v2, v1, v0

    const/16 v0, 0x8

    const v2, 0x1b580

    aput v2, v1, v0

    const/16 v0, 0x9

    const v2, 0x1f400

    aput v2, v1, v0

    const/16 v0, 0xa

    const v2, 0x27100

    aput v2, v1, v0

    const/16 v0, 0xb

    const v2, 0x2ee00

    aput v2, v1, v0

    const/16 v0, 0xc

    const v2, 0x36b00

    aput v2, v1, v0

    const/16 v0, 0xd

    const v2, 0x3e800

    aput v2, v1, v0

    const/16 v0, 0xe

    const v2, 0x4e200

    aput v2, v1, v0

    .line 2
    sput-object v1, Lcom/googlecode/mp4parser/authoring/tracks/n;->p:[I

    return-void
.end method

.method public constructor <init>(Lcom/googlecode/mp4parser/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "eng"

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/googlecode/mp4parser/authoring/tracks/n;-><init>(Lcom/googlecode/mp4parser/e;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/googlecode/mp4parser/e;Ljava/lang/String;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/authoring/a;-><init>(Ljava/lang/String;)V

    .line 3
    new-instance v0, Lcom/googlecode/mp4parser/authoring/i;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/authoring/i;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->f:Lcom/googlecode/mp4parser/authoring/i;

    .line 4
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->e:Lcom/googlecode/mp4parser/e;

    .line 5
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->k:Ljava/util/List;

    .line 6
    invoke-direct {p0, p1}, Lcom/googlecode/mp4parser/authoring/tracks/n;->b(Lcom/googlecode/mp4parser/e;)Lcom/googlecode/mp4parser/authoring/tracks/n$a;

    move-result-object p1

    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->h:Lcom/googlecode/mp4parser/authoring/tracks/n$a;

    .line 7
    iget p1, p1, Lcom/googlecode/mp4parser/authoring/tracks/n$a;->g:I

    int-to-double v0, p1

    const-wide/high16 v2, 0x4092000000000000L    # 1152.0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, v2

    .line 8
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->k:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    int-to-double v2, p1

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v0

    .line 9
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 10
    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->k:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const-wide/16 v5, 0x0

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x0

    if-nez v7, :cond_1

    const-wide/16 v0, 0x8

    mul-long v5, v5, v0

    long-to-double v0, v5

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, v2

    double-to-int p1, v0

    int-to-long v0, p1

    iput-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->j:J

    .line 12
    new-instance p1, Lcom/coremedia/iso/boxes/s0;

    invoke-direct {p1}, Lcom/coremedia/iso/boxes/s0;-><init>()V

    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->g:Lcom/coremedia/iso/boxes/s0;

    .line 13
    new-instance p1, Lcom/coremedia/iso/boxes/sampleentry/c;

    const-string v0, "mp4a"

    invoke-direct {p1, v0}, Lcom/coremedia/iso/boxes/sampleentry/c;-><init>(Ljava/lang/String;)V

    .line 14
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->h:Lcom/googlecode/mp4parser/authoring/tracks/n$a;

    iget v0, v0, Lcom/googlecode/mp4parser/authoring/tracks/n$a;->j:I

    invoke-virtual {p1, v0}, Lcom/coremedia/iso/boxes/sampleentry/c;->c0(I)V

    .line 15
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->h:Lcom/googlecode/mp4parser/authoring/tracks/n$a;

    iget v0, v0, Lcom/googlecode/mp4parser/authoring/tracks/n$a;->g:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/c;->h0(J)V

    const/4 v0, 0x1

    .line 16
    invoke-virtual {p1, v0}, Lcom/coremedia/iso/boxes/sampleentry/a;->d(I)V

    const/16 v0, 0x10

    .line 17
    invoke-virtual {p1, v0}, Lcom/coremedia/iso/boxes/sampleentry/c;->i0(I)V

    .line 18
    new-instance v0, Lcom/googlecode/mp4parser/boxes/mp4/b;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/boxes/mp4/b;-><init>()V

    .line 19
    new-instance v1, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;

    invoke-direct {v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;-><init>()V

    .line 20
    invoke-virtual {v1, v8}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->x(I)V

    .line 21
    new-instance v2, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/n;

    invoke-direct {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/n;-><init>()V

    const/4 v3, 0x2

    .line 22
    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/n;->j(I)V

    .line 23
    invoke-virtual {v1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->z(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/n;)V

    .line 24
    new-instance v2, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;

    invoke-direct {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;-><init>()V

    const/16 v3, 0x6b

    .line 25
    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->v(I)V

    const/4 v3, 0x5

    .line 26
    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->w(I)V

    .line 27
    iget-wide v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->i:J

    invoke-virtual {v2, v3, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->u(J)V

    .line 28
    iget-wide v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->j:J

    invoke-virtual {v2, v3, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->s(J)V

    .line 29
    invoke-virtual {v1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->v(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;)V

    .line 30
    invoke-virtual {v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->t()Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/boxes/mp4/a;->y(Ljava/nio/ByteBuffer;)V

    .line 32
    invoke-virtual {p1, v0}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 33
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->g:Lcom/coremedia/iso/boxes/s0;

    invoke-virtual {v0, p1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 34
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->f:Lcom/googlecode/mp4parser/authoring/i;

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1, v0}, Lcom/googlecode/mp4parser/authoring/i;->l(Ljava/util/Date;)V

    .line 35
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->f:Lcom/googlecode/mp4parser/authoring/i;

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1, v0}, Lcom/googlecode/mp4parser/authoring/i;->r(Ljava/util/Date;)V

    .line 36
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->f:Lcom/googlecode/mp4parser/authoring/i;

    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/authoring/i;->o(Ljava/lang/String;)V

    .line 37
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->f:Lcom/googlecode/mp4parser/authoring/i;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/authoring/i;->u(F)V

    .line 38
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->f:Lcom/googlecode/mp4parser/authoring/i;

    iget-object p2, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->h:Lcom/googlecode/mp4parser/authoring/tracks/n$a;

    iget p2, p2, Lcom/googlecode/mp4parser/authoring/tracks/n$a;->g:I

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Lcom/googlecode/mp4parser/authoring/i;->s(J)V

    .line 39
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->k:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [J

    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->l:[J

    const-wide/16 v0, 0x480

    .line 40
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->fill([JJ)V

    return-void

    .line 41
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/googlecode/mp4parser/authoring/f;

    .line 42
    invoke-interface {v7}, Lcom/googlecode/mp4parser/authoring/f;->getSize()J

    move-result-wide v9

    long-to-int v7, v9

    int-to-long v9, v7

    add-long/2addr v5, v9

    .line 43
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {p1, v7}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 44
    :goto_1
    invoke-virtual {p1}, Ljava/util/LinkedList;->size()I

    move-result v7

    int-to-double v9, v7

    cmpl-double v7, v9, v0

    if-gtz v7, :cond_3

    .line 45
    invoke-virtual {p1}, Ljava/util/LinkedList;->size()I

    move-result v7

    double-to-int v9, v0

    if-ne v7, v9, :cond_0

    .line 46
    invoke-virtual {p1}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_2

    const-wide/high16 v9, 0x4020000000000000L    # 8.0

    int-to-double v7, v8

    .line 47
    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v7, v7, v9

    invoke-virtual {p1}, Ljava/util/LinkedList;->size()I

    move-result v9

    int-to-double v9, v9

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v7, v9

    mul-double v7, v7, v0

    .line 48
    iget-wide v9, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->i:J

    long-to-double v9, v9

    cmpl-double v11, v7, v9

    if-lez v11, :cond_0

    double-to-int v7, v7

    int-to-long v7, v7

    .line 49
    iput-wide v7, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->i:J

    goto/16 :goto_0

    .line 50
    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    .line 51
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    add-int/2addr v8, v9

    goto :goto_2

    .line 52
    :cond_3
    invoke-virtual {p1}, Ljava/util/LinkedList;->pop()Ljava/lang/Object;

    goto :goto_1
.end method

.method private a(Lcom/googlecode/mp4parser/e;)Lcom/googlecode/mp4parser/authoring/tracks/n$a;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/googlecode/mp4parser/authoring/tracks/n$a;

    invoke-direct {v0, p0}, Lcom/googlecode/mp4parser/authoring/tracks/n$a;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/n;)V

    const/4 v1, 0x4

    .line 2
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 3
    :cond_0
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->position()I

    move-result v3

    if-lt v3, v1, :cond_7

    .line 4
    new-instance p1, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object v2

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-direct {p1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;-><init>(Ljava/nio/ByteBuffer;)V

    const/16 v2, 0xb

    .line 5
    invoke-virtual {p1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v2

    const/16 v3, 0x7ff

    if-ne v2, v3, :cond_6

    const/4 v2, 0x2

    .line 6
    invoke-virtual {p1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v3

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/n$a;->a:I

    const/4 v4, 0x3

    if-ne v3, v4, :cond_5

    .line 7
    invoke-virtual {p1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v3

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/n$a;->b:I

    const/4 v5, 0x1

    if-ne v3, v5, :cond_4

    .line 8
    invoke-virtual {p1, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v3

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/n$a;->c:I

    .line 9
    invoke-virtual {p1, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v1

    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/n$a;->d:I

    .line 10
    sget-object v3, Lcom/googlecode/mp4parser/authoring/tracks/n;->p:[I

    aget v1, v3, v1

    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/n$a;->e:I

    if-eqz v1, :cond_3

    .line 11
    invoke-virtual {p1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v1

    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/n$a;->f:I

    .line 12
    sget-object v3, Lcom/googlecode/mp4parser/authoring/tracks/n;->o:[I

    aget v1, v3, v1

    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/n$a;->g:I

    if-eqz v1, :cond_2

    .line 13
    invoke-virtual {p1, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result v1

    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/n$a;->h:I

    .line 14
    invoke-virtual {p1, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    .line 15
    invoke-virtual {p1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/c;->c(I)I

    move-result p1

    iput p1, v0, Lcom/googlecode/mp4parser/authoring/tracks/n$a;->i:I

    if-ne p1, v4, :cond_1

    const/4 v2, 0x1

    .line 16
    :cond_1
    iput v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/n$a;->j:I

    return-object v0

    .line 17
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Unexpected (reserved) sample rate frequency"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Unexpected (free/bad) bit rate"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 19
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Expected Layer III"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 20
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Expected MPEG Version 1 (ISO/IEC 11172-3)"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 21
    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Expected Start Word 0x7ff"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 22
    :cond_7
    invoke-interface {p1, v2}, Lcom/googlecode/mp4parser/e;->read(Ljava/nio/ByteBuffer;)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    const/4 p1, 0x0

    return-object p1
.end method

.method private b(Lcom/googlecode/mp4parser/e;)Lcom/googlecode/mp4parser/authoring/tracks/n$a;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    :goto_0
    invoke-interface {p1}, Lcom/googlecode/mp4parser/e;->position()J

    move-result-wide v1

    .line 2
    invoke-direct {p0, p1}, Lcom/googlecode/mp4parser/authoring/tracks/n;->a(Lcom/googlecode/mp4parser/e;)Lcom/googlecode/mp4parser/authoring/tracks/n$a;

    move-result-object v3

    if-nez v3, :cond_0

    return-object v0

    :cond_0
    if-nez v0, :cond_1

    move-object v0, v3

    .line 3
    :cond_1
    invoke-interface {p1, v1, v2}, Lcom/googlecode/mp4parser/e;->G(J)V

    .line 4
    invoke-virtual {v3}, Lcom/googlecode/mp4parser/authoring/tracks/n$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 5
    invoke-interface {p1, v1}, Lcom/googlecode/mp4parser/e;->read(Ljava/nio/ByteBuffer;)I

    .line 6
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 7
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->k:Ljava/util/List;

    new-instance v3, Lcom/googlecode/mp4parser/authoring/g;

    invoke-direct {v3, v1}, Lcom/googlecode/mp4parser/authoring/g;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method


# virtual methods
.method public M()Lcom/googlecode/mp4parser/authoring/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->f:Lcom/googlecode/mp4parser/authoring/i;

    return-object v0
.end method

.method public O()[J
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->l:[J

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
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->e:Lcom/googlecode/mp4parser/e;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/e;->close()V

    return-void
.end method

.method public getHandler()Ljava/lang/String;
    .locals 1

    const-string v0, "soun"

    return-object v0
.end method

.method public o()Lcom/coremedia/iso/boxes/s0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->g:Lcom/coremedia/iso/boxes/s0;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "MP3TrackImpl"

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
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/n;->k:Ljava/util/List;

    return-object v0
.end method
