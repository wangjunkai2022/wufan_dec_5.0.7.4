.class public Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;
.super Lcom/googlecode/mp4parser/authoring/tracks/c;
.source "H264TrackImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$b;,
        Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;,
        Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;
    }
.end annotation


# static fields
.field private static final F:Ljava/util/logging/Logger;


# instance fields
.field private A:I

.field private B:Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;

.field C:I

.field private D:Z

.field private E:Ljava/lang/String;

.field l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "[B>;"
        }
    .end annotation
.end field

.field m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/googlecode/mp4parser/h264/model/h;",
            ">;"
        }
    .end annotation
.end field

.field n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "[B>;"
        }
    .end annotation
.end field

.field o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/googlecode/mp4parser/h264/model/e;",
            ">;"
        }
    .end annotation
.end field

.field p:Lcom/coremedia/iso/boxes/s0;

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/googlecode/mp4parser/authoring/f;",
            ">;"
        }
    .end annotation
.end field

.field r:Lcom/googlecode/mp4parser/h264/model/h;

.field s:Lcom/googlecode/mp4parser/h264/model/e;

.field t:Lcom/googlecode/mp4parser/h264/model/h;

.field u:Lcom/googlecode/mp4parser/h264/model/e;

.field v:Lcom/googlecode/mp4parser/util/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/googlecode/mp4parser/util/n<",
            "Ljava/lang/Integer;",
            "[B>;"
        }
    .end annotation
.end field

.field w:Lcom/googlecode/mp4parser/util/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/googlecode/mp4parser/util/n<",
            "Ljava/lang/Integer;",
            "[B>;"
        }
    .end annotation
.end field

.field private x:I

.field private y:I

.field private z:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->F:Ljava/util/logging/Logger;

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

    .line 21
    invoke-direct {p0, p1, v0}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;-><init>(Lcom/googlecode/mp4parser/e;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/googlecode/mp4parser/e;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v3, -0x1

    const/4 v5, -0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 20
    invoke-direct/range {v0 .. v5}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;-><init>(Lcom/googlecode/mp4parser/e;Ljava/lang/String;JI)V

    return-void
.end method

.method public constructor <init>(Lcom/googlecode/mp4parser/e;Ljava/lang/String;JI)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/googlecode/mp4parser/authoring/tracks/c;-><init>(Lcom/googlecode/mp4parser/e;)V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->l:Ljava/util/Map;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->m:Ljava/util/Map;

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->n:Ljava/util/Map;

    .line 5
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->o:Ljava/util/Map;

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->r:Lcom/googlecode/mp4parser/h264/model/h;

    .line 7
    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->s:Lcom/googlecode/mp4parser/h264/model/e;

    .line 8
    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->t:Lcom/googlecode/mp4parser/h264/model/h;

    .line 9
    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->u:Lcom/googlecode/mp4parser/h264/model/e;

    .line 10
    new-instance v0, Lcom/googlecode/mp4parser/util/n;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/util/n;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->v:Lcom/googlecode/mp4parser/util/n;

    .line 11
    new-instance v0, Lcom/googlecode/mp4parser/util/n;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/util/n;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->w:Lcom/googlecode/mp4parser/util/n;

    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->C:I

    const/4 v1, 0x1

    .line 13
    iput-boolean v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->D:Z

    const-string v1, "eng"

    .line 14
    iput-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->E:Ljava/lang/String;

    .line 15
    iput-object p2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->E:Ljava/lang/String;

    .line 16
    iput-wide p3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->z:J

    .line 17
    iput p5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->A:I

    const-wide/16 v1, 0x0

    cmp-long p2, p3, v1

    if-lez p2, :cond_0

    if-lez p5, :cond_0

    .line 18
    iput-boolean v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->D:Z

    .line 19
    :cond_0
    new-instance p2, Lcom/googlecode/mp4parser/authoring/tracks/c$a;

    invoke-direct {p2, p1}, Lcom/googlecode/mp4parser/authoring/tracks/c$a;-><init>(Lcom/googlecode/mp4parser/e;)V

    invoke-direct {p0, p2}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->r(Lcom/googlecode/mp4parser/authoring/tracks/c$a;)V

    return-void
.end method

.method static synthetic h()Ljava/util/logging/Logger;
    .locals 1

    .line 1
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->F:Ljava/util/logging/Logger;

    return-object v0
.end method

.method private j()V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->D:Z

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->r:Lcom/googlecode/mp4parser/h264/model/h;

    iget-object v0, v0, Lcom/googlecode/mp4parser/h264/model/h;->M:Lcom/googlecode/mp4parser/h264/model/i;

    const/16 v1, 0xe10

    const-wide/32 v2, 0x15f90

    if-eqz v0, :cond_1

    .line 3
    iget v4, v0, Lcom/googlecode/mp4parser/h264/model/i;->r:I

    shr-int/lit8 v4, v4, 0x1

    int-to-long v4, v4

    iput-wide v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->z:J

    .line 4
    iget v0, v0, Lcom/googlecode/mp4parser/h264/model/i;->q:I

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->A:I

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-eqz v8, :cond_0

    if-nez v0, :cond_2

    .line 5
    :cond_0
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Warning: vuiParams contain invalid values: time_scale: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->z:J

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, " and frame_tick: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->A:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ". Setting frame rate to 25fps"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 6
    iput-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->z:J

    .line 7
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->A:I

    goto :goto_0

    .line 8
    :cond_1
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v4, "Warning: Can\'t determine frame rate. Guessing 25 fps"

    invoke-virtual {v0, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 9
    iput-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->z:J

    .line 10
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->A:I

    :cond_2
    :goto_0
    return-void
.end method

.method private k(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/nio/ByteBuffer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_8

    if-eqz v3, :cond_1

    const/16 v0, 0x26

    goto :goto_1

    :cond_1
    const/16 v0, 0x16

    .line 2
    :goto_1
    new-instance v4, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$b;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    sub-int/2addr v5, v1

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/nio/ByteBuffer;

    invoke-direct {v4, p0, v5}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$b;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;Ljava/nio/ByteBuffer;)V

    invoke-static {v4}, Lcom/googlecode/mp4parser/authoring/tracks/c;->a(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object v4

    .line 3
    new-instance v5, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;

    iget-object v6, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->m:Ljava/util/Map;

    iget-object v7, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->o:Ljava/util/Map;

    invoke-direct {v5, v4, v6, v7, v3}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;-><init>(Ljava/io/InputStream;Ljava/util/Map;Ljava/util/Map;Z)V

    .line 4
    iget-object v4, v5, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->b:Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader$SliceType;

    sget-object v5, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader$SliceType;->B:Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader$SliceType;

    if-ne v4, v5, :cond_2

    add-int/lit8 v0, v0, 0x4

    .line 5
    :cond_2
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/authoring/tracks/c;->b(Ljava/util/List;)Lcom/googlecode/mp4parser/authoring/f;

    move-result-object v4

    .line 6
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 7
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->B:Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;

    if-eqz p1, :cond_3

    iget v5, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->n:I

    if-nez v5, :cond_4

    .line 8
    :cond_3
    iput v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->C:I

    :cond_4
    if-eqz p1, :cond_5

    .line 9
    iget-boolean v5, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->f:Z

    if-eqz v5, :cond_5

    .line 10
    iget p1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->n:I

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->C:I

    sub-int v2, p1, v2

    goto :goto_2

    :cond_5
    if-eqz p1, :cond_6

    .line 11
    iget-boolean v5, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->c:Z

    if-eqz v5, :cond_6

    .line 12
    iget p1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->e:I

    div-int/lit8 v2, p1, 0x2

    .line 13
    :cond_6
    :goto_2
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c;->g:Ljava/util/List;

    new-instance v5, Lcom/coremedia/iso/boxes/i$a;

    iget v6, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->A:I

    mul-int v2, v2, v6

    invoke-direct {v5, v1, v2}, Lcom/coremedia/iso/boxes/i$a;-><init>(II)V

    invoke-interface {p1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c;->h:Ljava/util/List;

    new-instance v2, Lcom/coremedia/iso/boxes/r0$a;

    invoke-direct {v2, v0}, Lcom/coremedia/iso/boxes/r0$a;-><init>(I)V

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    iget p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->C:I

    add-int/2addr p1, v1

    iput p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->C:I

    .line 16
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->q:Ljava/util/List;

    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v3, :cond_7

    .line 17
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c;->i:Ljava/util/List;

    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    return-void

    .line 18
    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/nio/ByteBuffer;

    .line 19
    invoke-virtual {v4, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    and-int/lit8 v4, v4, 0x1f

    const/4 v5, 0x5

    if-ne v4, v5, :cond_0

    const/4 v3, 0x1

    goto/16 :goto_0
.end method

.method private l(Ljava/nio/ByteBuffer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$b;

    invoke-direct {v0, p0, p1}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$b;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;Ljava/nio/ByteBuffer;)V

    .line 2
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 3
    invoke-static {v0}, Lcom/googlecode/mp4parser/h264/model/e;->b(Ljava/io/InputStream;)Lcom/googlecode/mp4parser/h264/model/e;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->s:Lcom/googlecode/mp4parser/h264/model/e;

    if-nez v1, :cond_0

    .line 5
    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->s:Lcom/googlecode/mp4parser/h264/model/e;

    .line 6
    :cond_0
    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->u:Lcom/googlecode/mp4parser/h264/model/e;

    .line 7
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object p1

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-static {p1}, Lcom/googlecode/mp4parser/authoring/tracks/c;->g(Ljava/nio/ByteBuffer;)[B

    move-result-object p1

    .line 8
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->n:Ljava/util/Map;

    iget v2, v0, Lcom/googlecode/mp4parser/h264/model/e;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    if-eqz v1, :cond_2

    .line 9
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 10
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "OMG - I got two SPS with same ID but different settings! (AVC3 is the solution)"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    if-nez v1, :cond_3

    .line 11
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->w:Lcom/googlecode/mp4parser/util/n;

    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->q:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Lcom/googlecode/mp4parser/util/n;->a(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    :cond_3
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->n:Ljava/util/Map;

    iget v2, v0, Lcom/googlecode/mp4parser/h264/model/e;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->o:Ljava/util/Map;

    iget v1, v0, Lcom/googlecode/mp4parser/h264/model/e;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private p(Ljava/nio/ByteBuffer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$b;

    invoke-direct {v0, p0, p1}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$b;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;Ljava/nio/ByteBuffer;)V

    invoke-static {v0}, Lcom/googlecode/mp4parser/authoring/tracks/c;->a(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 3
    invoke-static {v0}, Lcom/googlecode/mp4parser/h264/model/h;->c(Ljava/io/InputStream;)Lcom/googlecode/mp4parser/h264/model/h;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->r:Lcom/googlecode/mp4parser/h264/model/h;

    if-nez v1, :cond_0

    .line 5
    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->r:Lcom/googlecode/mp4parser/h264/model/h;

    .line 6
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->j()V

    .line 7
    :cond_0
    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->t:Lcom/googlecode/mp4parser/h264/model/h;

    .line 8
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object p1

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-static {p1}, Lcom/googlecode/mp4parser/authoring/tracks/c;->g(Ljava/nio/ByteBuffer;)[B

    move-result-object p1

    .line 9
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->l:Ljava/util/Map;

    iget v2, v0, Lcom/googlecode/mp4parser/h264/model/h;->z:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    if-eqz v1, :cond_2

    .line 10
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 11
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "OMG - I got two SPS with same ID but different settings!"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    if-eqz v1, :cond_3

    .line 12
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->v:Lcom/googlecode/mp4parser/util/n;

    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->q:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Lcom/googlecode/mp4parser/util/n;->a(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    :cond_3
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->l:Ljava/util/Map;

    iget v2, v0, Lcom/googlecode/mp4parser/h264/model/h;->z:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->m:Ljava/util/Map;

    iget v1, v0, Lcom/googlecode/mp4parser/h264/model/h;->z:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private r(Lcom/googlecode/mp4parser/authoring/tracks/c$a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->q:Ljava/util/List;

    .line 2
    invoke-direct {p0, p1}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->t(Lcom/googlecode/mp4parser/authoring/tracks/c$a;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 3
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->u()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 4
    new-instance p1, Lcom/coremedia/iso/boxes/s0;

    invoke-direct {p1}, Lcom/coremedia/iso/boxes/s0;-><init>()V

    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->p:Lcom/coremedia/iso/boxes/s0;

    .line 5
    new-instance p1, Lcom/coremedia/iso/boxes/sampleentry/h;

    const-string v0, "avc1"

    invoke-direct {p1, v0}, Lcom/coremedia/iso/boxes/sampleentry/h;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 6
    invoke-virtual {p1, v0}, Lcom/coremedia/iso/boxes/sampleentry/a;->d(I)V

    const/16 v1, 0x18

    .line 7
    invoke-virtual {p1, v1}, Lcom/coremedia/iso/boxes/sampleentry/h;->T(I)V

    .line 8
    invoke-virtual {p1, v0}, Lcom/coremedia/iso/boxes/sampleentry/h;->V(I)V

    const-wide/high16 v1, 0x4052000000000000L    # 72.0

    .line 9
    invoke-virtual {p1, v1, v2}, Lcom/coremedia/iso/boxes/sampleentry/h;->X(D)V

    .line 10
    invoke-virtual {p1, v1, v2}, Lcom/coremedia/iso/boxes/sampleentry/h;->Z(D)V

    .line 11
    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->x:I

    invoke-virtual {p1, v1}, Lcom/coremedia/iso/boxes/sampleentry/h;->a0(I)V

    .line 12
    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->y:I

    invoke-virtual {p1, v1}, Lcom/coremedia/iso/boxes/sampleentry/h;->W(I)V

    const-string v1, "AVC Coding"

    .line 13
    invoke-virtual {p1, v1}, Lcom/coremedia/iso/boxes/sampleentry/h;->S(Ljava/lang/String;)V

    .line 14
    new-instance v1, Lcom/mp4parser/iso14496/part15/a;

    invoke-direct {v1}, Lcom/mp4parser/iso14496/part15/a;-><init>()V

    .line 15
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->l:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v2}, Lcom/mp4parser/iso14496/part15/a;->T(Ljava/util/List;)V

    .line 16
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->n:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v2}, Lcom/mp4parser/iso14496/part15/a;->Q(Ljava/util/List;)V

    .line 17
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->r:Lcom/googlecode/mp4parser/h264/model/h;

    iget v2, v2, Lcom/googlecode/mp4parser/h264/model/h;->y:I

    invoke-virtual {v1, v2}, Lcom/mp4parser/iso14496/part15/a;->I(I)V

    .line 18
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->r:Lcom/googlecode/mp4parser/h264/model/h;

    iget v2, v2, Lcom/googlecode/mp4parser/h264/model/h;->q:I

    invoke-virtual {v1, v2}, Lcom/mp4parser/iso14496/part15/a;->J(I)V

    .line 19
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->r:Lcom/googlecode/mp4parser/h264/model/h;

    iget v2, v2, Lcom/googlecode/mp4parser/h264/model/h;->n:I

    invoke-virtual {v1, v2}, Lcom/mp4parser/iso14496/part15/a;->L(I)V

    .line 20
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->r:Lcom/googlecode/mp4parser/h264/model/h;

    iget v2, v2, Lcom/googlecode/mp4parser/h264/model/h;->o:I

    invoke-virtual {v1, v2}, Lcom/mp4parser/iso14496/part15/a;->K(I)V

    .line 21
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->r:Lcom/googlecode/mp4parser/h264/model/h;

    iget-object v2, v2, Lcom/googlecode/mp4parser/h264/model/h;->i:Lcom/googlecode/mp4parser/h264/model/c;

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/h264/model/c;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/mp4parser/iso14496/part15/a;->M(I)V

    .line 22
    invoke-virtual {v1, v0}, Lcom/mp4parser/iso14496/part15/a;->N(I)V

    const/4 v0, 0x3

    .line 23
    invoke-virtual {v1, v0}, Lcom/mp4parser/iso14496/part15/a;->P(I)V

    .line 24
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->r:Lcom/googlecode/mp4parser/h264/model/h;

    iget-boolean v2, v0, Lcom/googlecode/mp4parser/h264/model/h;->s:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const/16 v2, 0x80

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 25
    :goto_0
    iget-boolean v4, v0, Lcom/googlecode/mp4parser/h264/model/h;->t:Z

    if-eqz v4, :cond_1

    const/16 v4, 0x40

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    add-int/2addr v2, v4

    .line 26
    iget-boolean v4, v0, Lcom/googlecode/mp4parser/h264/model/h;->u:Z

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    add-int/2addr v2, v4

    .line 27
    iget-boolean v4, v0, Lcom/googlecode/mp4parser/h264/model/h;->v:Z

    if-eqz v4, :cond_3

    const/16 v4, 0x10

    goto :goto_3

    :cond_3
    const/4 v4, 0x0

    :goto_3
    add-int/2addr v2, v4

    .line 28
    iget-boolean v4, v0, Lcom/googlecode/mp4parser/h264/model/h;->w:Z

    if-eqz v4, :cond_4

    const/16 v3, 0x8

    :cond_4
    add-int/2addr v2, v3

    .line 29
    iget-wide v3, v0, Lcom/googlecode/mp4parser/h264/model/h;->r:J

    const-wide/16 v5, 0x3

    and-long/2addr v3, v5

    long-to-int v0, v3

    add-int/2addr v2, v0

    .line 30
    invoke-virtual {v1, v2}, Lcom/mp4parser/iso14496/part15/a;->R(I)V

    .line 31
    invoke-virtual {p1, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 32
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->p:Lcom/coremedia/iso/boxes/s0;

    invoke-virtual {v0, p1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 33
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c;->j:Lcom/googlecode/mp4parser/authoring/i;

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1, v0}, Lcom/googlecode/mp4parser/authoring/i;->l(Ljava/util/Date;)V

    .line 34
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c;->j:Lcom/googlecode/mp4parser/authoring/i;

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1, v0}, Lcom/googlecode/mp4parser/authoring/i;->r(Ljava/util/Date;)V

    .line 35
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c;->j:Lcom/googlecode/mp4parser/authoring/i;

    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->E:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/googlecode/mp4parser/authoring/i;->o(Ljava/lang/String;)V

    .line 36
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c;->j:Lcom/googlecode/mp4parser/authoring/i;

    iget-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->z:J

    invoke-virtual {p1, v0, v1}, Lcom/googlecode/mp4parser/authoring/i;->s(J)V

    .line 37
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c;->j:Lcom/googlecode/mp4parser/authoring/i;

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->x:I

    int-to-double v0, v0

    invoke-virtual {p1, v0, v1}, Lcom/googlecode/mp4parser/authoring/i;->v(D)V

    .line 38
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c;->j:Lcom/googlecode/mp4parser/authoring/i;

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->y:I

    int-to-double v0, v0

    invoke-virtual {p1, v0, v1}, Lcom/googlecode/mp4parser/authoring/i;->n(D)V

    return-void

    .line 39
    :cond_5
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    throw p1

    .line 40
    :cond_6
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    throw p1
.end method

.method private t(Lcom/googlecode/mp4parser/authoring/tracks/c$a;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move-object v2, v1

    .line 2
    :goto_0
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/authoring/tracks/c;->d(Lcom/googlecode/mp4parser/authoring/tracks/c$a;)Ljava/nio/ByteBuffer;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 3
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    shr-int/lit8 v5, v4, 0x5

    and-int/lit8 v5, v5, 0x3

    and-int/lit8 v4, v4, 0x1f

    packed-switch v4, :pswitch_data_0

    .line 4
    :pswitch_0
    sget-object v3, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Unknown NAL unit type: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :pswitch_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Sequence parameter set extension is not yet handled. Needs TLC."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 6
    :goto_1
    :pswitch_2
    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->k(Ljava/util/List;)V

    .line 7
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->q:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [J

    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/c;->f:[J

    .line 8
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->A:I

    int-to-long v0, v0

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->fill([JJ)V

    const/4 p1, 0x1

    return p1

    :pswitch_3
    if-eqz v2, :cond_1

    .line 9
    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->k(Ljava/util/List;)V

    move-object v2, v1

    .line 10
    :cond_1
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_4
    if-eqz v2, :cond_2

    .line 11
    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->k(Ljava/util/List;)V

    move-object v2, v1

    .line 12
    :cond_2
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object v3

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-direct {p0, v3}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->l(Ljava/nio/ByteBuffer;)V

    goto :goto_0

    :pswitch_5
    if-eqz v2, :cond_3

    .line 13
    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->k(Ljava/util/List;)V

    move-object v2, v1

    .line 14
    :cond_3
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object v3

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-direct {p0, v3}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->p(Ljava/nio/ByteBuffer;)V

    goto :goto_0

    :pswitch_6
    if-eqz v2, :cond_4

    .line 15
    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->k(Ljava/util/List;)V

    move-object v2, v1

    .line 16
    :cond_4
    new-instance v4, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;

    new-instance v5, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$b;

    invoke-direct {v5, p0, v3}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$b;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;Ljava/nio/ByteBuffer;)V

    invoke-static {v5}, Lcom/googlecode/mp4parser/authoring/tracks/c;->a(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object v5

    iget-object v6, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->t:Lcom/googlecode/mp4parser/h264/model/h;

    invoke-direct {v4, p0, v5, v6}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;Ljava/io/InputStream;Lcom/googlecode/mp4parser/h264/model/h;)V

    iput-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->B:Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;

    .line 17
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 18
    :pswitch_7
    new-instance v6, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;

    invoke-direct {v6, p0, v3, v5, v4}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;Ljava/nio/ByteBuffer;II)V

    if-nez v2, :cond_5

    goto :goto_2

    .line 19
    :cond_5
    invoke-virtual {v2, v6}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->a(Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 20
    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->k(Ljava/util/List;)V

    :goto_2
    move-object v2, v6

    .line 21
    :cond_6
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object v3

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private u()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->r:Lcom/googlecode/mp4parser/h264/model/h;

    iget v1, v0, Lcom/googlecode/mp4parser/h264/model/h;->m:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x10

    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->x:I

    .line 2
    iget-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/h;->F:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    .line 3
    :goto_0
    iget v3, v0, Lcom/googlecode/mp4parser/h264/model/h;->l:I

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x10

    mul-int v3, v3, v1

    iput v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->y:I

    .line 4
    iget-boolean v3, v0, Lcom/googlecode/mp4parser/h264/model/h;->G:Z

    if-eqz v3, :cond_3

    const/4 v3, 0x0

    .line 5
    iget-boolean v4, v0, Lcom/googlecode/mp4parser/h264/model/h;->A:Z

    if-nez v4, :cond_1

    .line 6
    iget-object v0, v0, Lcom/googlecode/mp4parser/h264/model/h;->i:Lcom/googlecode/mp4parser/h264/model/c;

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/h264/model/c;->b()I

    move-result v3

    :cond_1
    if-eqz v3, :cond_2

    .line 7
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->r:Lcom/googlecode/mp4parser/h264/model/h;

    iget-object v0, v0, Lcom/googlecode/mp4parser/h264/model/h;->i:Lcom/googlecode/mp4parser/h264/model/c;

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/h264/model/c;->d()I

    move-result v0

    .line 8
    iget-object v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->r:Lcom/googlecode/mp4parser/h264/model/h;

    iget-object v3, v3, Lcom/googlecode/mp4parser/h264/model/h;->i:Lcom/googlecode/mp4parser/h264/model/c;

    invoke-virtual {v3}, Lcom/googlecode/mp4parser/h264/model/c;->c()I

    move-result v3

    mul-int v1, v1, v3

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    .line 9
    :goto_1
    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->x:I

    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->r:Lcom/googlecode/mp4parser/h264/model/h;

    iget v5, v4, Lcom/googlecode/mp4parser/h264/model/h;->H:I

    iget v6, v4, Lcom/googlecode/mp4parser/h264/model/h;->I:I

    add-int/2addr v5, v6

    mul-int v0, v0, v5

    sub-int/2addr v3, v0

    iput v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->x:I

    .line 10
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->y:I

    iget v3, v4, Lcom/googlecode/mp4parser/h264/model/h;->J:I

    iget v4, v4, Lcom/googlecode/mp4parser/h264/model/h;->K:I

    add-int/2addr v3, v4

    mul-int v1, v1, v3

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->y:I

    :cond_3
    return v2
.end method


# virtual methods
.method public getHandler()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "vide"

    return-object v0
.end method

.method public o()Lcom/coremedia/iso/boxes/s0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->p:Lcom/coremedia/iso/boxes/s0;

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
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->q:Ljava/util/List;

    return-object v0
.end method
