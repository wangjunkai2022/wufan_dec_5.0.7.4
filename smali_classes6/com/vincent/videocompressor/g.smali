.class public Lcom/vincent/videocompressor/g;
.super Ljava/lang/Object;
.source "Track.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation


# static fields
.field private static q:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:J

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/vincent/videocompressor/e;",
            ">;"
        }
    .end annotation
.end field

.field private c:J

.field private d:Ljava/lang/String;

.field private e:Lcom/coremedia/iso/boxes/a;

.field private f:Lcom/coremedia/iso/boxes/s0;

.field private g:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private h:I

.field private i:Ljava/util/Date;

.field private j:I

.field private k:I

.field private l:F

.field private m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private n:Z

.field private o:J

.field private p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/vincent/videocompressor/g;->q:Ljava/util/Map;

    const v1, 0x17700

    .line 2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    sget-object v0, Lcom/vincent/videocompressor/g;->q:Ljava/util/Map;

    const v1, 0x15888

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    sget-object v0, Lcom/vincent/videocompressor/g;->q:Ljava/util/Map;

    const v1, 0xfa00

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    sget-object v0, Lcom/vincent/videocompressor/g;->q:Ljava/util/Map;

    const v1, 0xbb80

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    sget-object v0, Lcom/vincent/videocompressor/g;->q:Ljava/util/Map;

    const v1, 0xac44

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    sget-object v0, Lcom/vincent/videocompressor/g;->q:Ljava/util/Map;

    const/16 v1, 0x7d00

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    sget-object v0, Lcom/vincent/videocompressor/g;->q:Ljava/util/Map;

    const/16 v1, 0x5dc0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    sget-object v0, Lcom/vincent/videocompressor/g;->q:Ljava/util/Map;

    const/16 v1, 0x5622

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    sget-object v0, Lcom/vincent/videocompressor/g;->q:Ljava/util/Map;

    const/16 v1, 0x3e80

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    sget-object v0, Lcom/vincent/videocompressor/g;->q:Ljava/util/Map;

    const/16 v1, 0x2ee0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    sget-object v0, Lcom/vincent/videocompressor/g;->q:Ljava/util/Map;

    const/16 v1, 0x2b11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xa

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    sget-object v0, Lcom/vincent/videocompressor/g;->q:Ljava/util/Map;

    const/16 v1, 0x1f40

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xb

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(ILandroid/media/MediaFormat;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/vincent/videocompressor/g;->a:J

    .line 3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/vincent/videocompressor/g;->b:Ljava/util/ArrayList;

    .line 4
    iput-wide v0, p0, Lcom/vincent/videocompressor/g;->c:J

    const/4 v2, 0x0

    .line 5
    iput-object v2, p0, Lcom/vincent/videocompressor/g;->e:Lcom/coremedia/iso/boxes/a;

    .line 6
    iput-object v2, p0, Lcom/vincent/videocompressor/g;->f:Lcom/coremedia/iso/boxes/s0;

    .line 7
    iput-object v2, p0, Lcom/vincent/videocompressor/g;->g:Ljava/util/LinkedList;

    .line 8
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    iput-object v2, p0, Lcom/vincent/videocompressor/g;->i:Ljava/util/Date;

    const/4 v2, 0x0

    .line 9
    iput v2, p0, Lcom/vincent/videocompressor/g;->l:F

    .line 10
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/vincent/videocompressor/g;->m:Ljava/util/ArrayList;

    const/4 v3, 0x0

    .line 11
    iput-boolean v3, p0, Lcom/vincent/videocompressor/g;->n:Z

    .line 12
    iput-wide v0, p0, Lcom/vincent/videocompressor/g;->o:J

    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lcom/vincent/videocompressor/g;->p:Z

    int-to-long v4, p1

    .line 14
    iput-wide v4, p0, Lcom/vincent/videocompressor/g;->a:J

    if-nez p3, :cond_2

    const-wide/16 v4, 0xbc7

    .line 15
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    iput-wide v4, p0, Lcom/vincent/videocompressor/g;->c:J

    const-string p1, "width"

    .line 17
    invoke-virtual {p2, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/vincent/videocompressor/g;->k:I

    const-string p1, "height"

    .line 18
    invoke-virtual {p2, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/vincent/videocompressor/g;->j:I

    const p1, 0x15f90

    .line 19
    iput p1, p0, Lcom/vincent/videocompressor/g;->h:I

    .line 20
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/vincent/videocompressor/g;->g:Ljava/util/LinkedList;

    const-string p1, "vide"

    .line 21
    iput-object p1, p0, Lcom/vincent/videocompressor/g;->d:Ljava/lang/String;

    .line 22
    new-instance p1, Lcom/coremedia/iso/boxes/m1;

    invoke-direct {p1}, Lcom/coremedia/iso/boxes/m1;-><init>()V

    iput-object p1, p0, Lcom/vincent/videocompressor/g;->e:Lcom/coremedia/iso/boxes/a;

    .line 23
    new-instance p1, Lcom/coremedia/iso/boxes/s0;

    invoke-direct {p1}, Lcom/coremedia/iso/boxes/s0;-><init>()V

    iput-object p1, p0, Lcom/vincent/videocompressor/g;->f:Lcom/coremedia/iso/boxes/s0;

    const-string p1, "mime"

    .line 24
    invoke-virtual {p2, p1}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "video/avc"

    .line 25
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    const/16 v1, 0x18

    const-wide/high16 v4, 0x4052000000000000L    # 72.0

    if-eqz p3, :cond_1

    .line 26
    new-instance p1, Lcom/coremedia/iso/boxes/sampleentry/h;

    const-string p3, "avc1"

    invoke-direct {p1, p3}, Lcom/coremedia/iso/boxes/sampleentry/h;-><init>(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p1, v0}, Lcom/coremedia/iso/boxes/sampleentry/a;->d(I)V

    .line 28
    invoke-virtual {p1, v1}, Lcom/coremedia/iso/boxes/sampleentry/h;->T(I)V

    .line 29
    invoke-virtual {p1, v0}, Lcom/coremedia/iso/boxes/sampleentry/h;->V(I)V

    .line 30
    invoke-virtual {p1, v4, v5}, Lcom/coremedia/iso/boxes/sampleentry/h;->X(D)V

    .line 31
    invoke-virtual {p1, v4, v5}, Lcom/coremedia/iso/boxes/sampleentry/h;->Z(D)V

    .line 32
    iget p3, p0, Lcom/vincent/videocompressor/g;->k:I

    invoke-virtual {p1, p3}, Lcom/coremedia/iso/boxes/sampleentry/h;->a0(I)V

    .line 33
    iget p3, p0, Lcom/vincent/videocompressor/g;->j:I

    invoke-virtual {p1, p3}, Lcom/coremedia/iso/boxes/sampleentry/h;->W(I)V

    .line 34
    new-instance p3, Lcom/mp4parser/iso14496/part15/a;

    invoke-direct {p3}, Lcom/mp4parser/iso14496/part15/a;-><init>()V

    const-string v1, "csd-0"

    .line 35
    invoke-virtual {p2, v1}, Landroid/media/MediaFormat;->getByteBuffer(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 36
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 37
    invoke-virtual {p2, v1}, Landroid/media/MediaFormat;->getByteBuffer(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    move-result-object v1

    const/4 v4, 0x4

    .line 38
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 39
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v5

    new-array v5, v5, [B

    .line 40
    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 41
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v5, "csd-1"

    .line 43
    invoke-virtual {p2, v5}, Landroid/media/MediaFormat;->getByteBuffer(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    move-result-object p2

    .line 44
    invoke-virtual {p2, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 45
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v4

    new-array v4, v4, [B

    .line 46
    invoke-virtual {p2, v4}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 47
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    invoke-virtual {p3, v2}, Lcom/mp4parser/iso14496/part15/a;->T(Ljava/util/List;)V

    .line 49
    invoke-virtual {p3, v1}, Lcom/mp4parser/iso14496/part15/a;->Q(Ljava/util/List;)V

    :cond_0
    const/16 p2, 0xd

    .line 50
    invoke-virtual {p3, p2}, Lcom/mp4parser/iso14496/part15/a;->I(I)V

    const/16 p2, 0x64

    .line 51
    invoke-virtual {p3, p2}, Lcom/mp4parser/iso14496/part15/a;->J(I)V

    const/4 p2, -0x1

    .line 52
    invoke-virtual {p3, p2}, Lcom/mp4parser/iso14496/part15/a;->L(I)V

    .line 53
    invoke-virtual {p3, p2}, Lcom/mp4parser/iso14496/part15/a;->K(I)V

    .line 54
    invoke-virtual {p3, p2}, Lcom/mp4parser/iso14496/part15/a;->M(I)V

    .line 55
    invoke-virtual {p3, v0}, Lcom/mp4parser/iso14496/part15/a;->N(I)V

    const/4 p2, 0x3

    .line 56
    invoke-virtual {p3, p2}, Lcom/mp4parser/iso14496/part15/a;->P(I)V

    .line 57
    invoke-virtual {p3, v3}, Lcom/mp4parser/iso14496/part15/a;->R(I)V

    .line 58
    invoke-virtual {p1, p3}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 59
    iget-object p2, p0, Lcom/vincent/videocompressor/g;->f:Lcom/coremedia/iso/boxes/s0;

    invoke-virtual {p2, p1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto/16 :goto_0

    :cond_1
    const-string p2, "video/mp4v"

    .line 60
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 61
    new-instance p1, Lcom/coremedia/iso/boxes/sampleentry/h;

    const-string p2, "mp4v"

    invoke-direct {p1, p2}, Lcom/coremedia/iso/boxes/sampleentry/h;-><init>(Ljava/lang/String;)V

    .line 62
    invoke-virtual {p1, v0}, Lcom/coremedia/iso/boxes/sampleentry/a;->d(I)V

    .line 63
    invoke-virtual {p1, v1}, Lcom/coremedia/iso/boxes/sampleentry/h;->T(I)V

    .line 64
    invoke-virtual {p1, v0}, Lcom/coremedia/iso/boxes/sampleentry/h;->V(I)V

    .line 65
    invoke-virtual {p1, v4, v5}, Lcom/coremedia/iso/boxes/sampleentry/h;->X(D)V

    .line 66
    invoke-virtual {p1, v4, v5}, Lcom/coremedia/iso/boxes/sampleentry/h;->Z(D)V

    .line 67
    iget p2, p0, Lcom/vincent/videocompressor/g;->k:I

    invoke-virtual {p1, p2}, Lcom/coremedia/iso/boxes/sampleentry/h;->a0(I)V

    .line 68
    iget p2, p0, Lcom/vincent/videocompressor/g;->j:I

    invoke-virtual {p1, p2}, Lcom/coremedia/iso/boxes/sampleentry/h;->W(I)V

    .line 69
    iget-object p2, p0, Lcom/vincent/videocompressor/g;->f:Lcom/coremedia/iso/boxes/s0;

    invoke-virtual {p2, p1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto/16 :goto_0

    :cond_2
    const-wide/16 v4, 0x400

    .line 70
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    iput-wide v4, p0, Lcom/vincent/videocompressor/g;->c:J

    const/high16 p1, 0x3f800000    # 1.0f

    .line 72
    iput p1, p0, Lcom/vincent/videocompressor/g;->l:F

    const-string p1, "sample-rate"

    .line 73
    invoke-virtual {p2, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p3

    iput p3, p0, Lcom/vincent/videocompressor/g;->h:I

    const-string p3, "soun"

    .line 74
    iput-object p3, p0, Lcom/vincent/videocompressor/g;->d:Ljava/lang/String;

    .line 75
    new-instance p3, Lcom/coremedia/iso/boxes/y0;

    invoke-direct {p3}, Lcom/coremedia/iso/boxes/y0;-><init>()V

    iput-object p3, p0, Lcom/vincent/videocompressor/g;->e:Lcom/coremedia/iso/boxes/a;

    .line 76
    new-instance p3, Lcom/coremedia/iso/boxes/s0;

    invoke-direct {p3}, Lcom/coremedia/iso/boxes/s0;-><init>()V

    iput-object p3, p0, Lcom/vincent/videocompressor/g;->f:Lcom/coremedia/iso/boxes/s0;

    .line 77
    new-instance p3, Lcom/coremedia/iso/boxes/sampleentry/c;

    const-string v1, "mp4a"

    invoke-direct {p3, v1}, Lcom/coremedia/iso/boxes/sampleentry/c;-><init>(Ljava/lang/String;)V

    const-string v1, "channel-count"

    .line 78
    invoke-virtual {p2, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p3, v1}, Lcom/coremedia/iso/boxes/sampleentry/c;->c0(I)V

    .line 79
    invoke-virtual {p2, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p1

    int-to-long p1, p1

    invoke-virtual {p3, p1, p2}, Lcom/coremedia/iso/boxes/sampleentry/c;->h0(J)V

    .line 80
    invoke-virtual {p3, v0}, Lcom/coremedia/iso/boxes/sampleentry/a;->d(I)V

    const/16 p1, 0x10

    .line 81
    invoke-virtual {p3, p1}, Lcom/coremedia/iso/boxes/sampleentry/c;->i0(I)V

    .line 82
    new-instance p1, Lcom/googlecode/mp4parser/boxes/mp4/b;

    invoke-direct {p1}, Lcom/googlecode/mp4parser/boxes/mp4/b;-><init>()V

    .line 83
    new-instance p2, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;

    invoke-direct {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;-><init>()V

    .line 84
    invoke-virtual {p2, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->x(I)V

    .line 85
    new-instance v0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/n;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/n;-><init>()V

    const/4 v1, 0x2

    .line 86
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/n;->j(I)V

    .line 87
    invoke-virtual {p2, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->z(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/n;)V

    .line 88
    new-instance v0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;-><init>()V

    const/16 v2, 0x40

    .line 89
    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->v(I)V

    const/4 v2, 0x5

    .line 90
    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->w(I)V

    const/16 v2, 0x600

    .line 91
    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->t(I)V

    const-wide/32 v2, 0x17700

    .line 92
    invoke-virtual {v0, v2, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->u(J)V

    .line 93
    invoke-virtual {v0, v2, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->s(J)V

    .line 94
    new-instance v2, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/a;

    invoke-direct {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/a;-><init>()V

    .line 95
    invoke-virtual {v2, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/a;->v(I)V

    .line 96
    sget-object v1, Lcom/vincent/videocompressor/g;->q:Ljava/util/Map;

    invoke-virtual {p3}, Lcom/coremedia/iso/boxes/sampleentry/c;->T()J

    move-result-wide v3

    long-to-int v4, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v2, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/a;->y(I)V

    .line 97
    invoke-virtual {p3}, Lcom/coremedia/iso/boxes/sampleentry/c;->J()I

    move-result v1

    invoke-virtual {v2, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/a;->w(I)V

    .line 98
    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;->r(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/a;)V

    .line 99
    invoke-virtual {p2, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->v(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/e;)V

    .line 100
    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;->t()Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 101
    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/boxes/mp4/b;->B(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/g;)V

    .line 102
    invoke-virtual {p1, v0}, Lcom/googlecode/mp4parser/boxes/mp4/a;->y(Ljava/nio/ByteBuffer;)V

    .line 103
    invoke-virtual {p3, p1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 104
    iget-object p1, p0, Lcom/vincent/videocompressor/g;->f:Lcom/coremedia/iso/boxes/s0;

    invoke-virtual {p1, p3}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public a(JLandroid/media/MediaCodec$BufferInfo;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/vincent/videocompressor/g;->n:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    iget v0, p3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v3, p0, Lcom/vincent/videocompressor/g;->b:Ljava/util/ArrayList;

    new-instance v4, Lcom/vincent/videocompressor/e;

    iget v5, p3, Landroid/media/MediaCodec$BufferInfo;->size:I

    int-to-long v5, v5

    invoke-direct {v4, p1, p2, v5, v6}, Lcom/vincent/videocompressor/e;-><init>(JJ)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3
    iget-object p1, p0, Lcom/vincent/videocompressor/g;->g:Ljava/util/LinkedList;

    if-eqz p1, :cond_1

    if-eqz v0, :cond_1

    .line 4
    iget-object p2, p0, Lcom/vincent/videocompressor/g;->b:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 5
    :cond_1
    iget-wide p1, p3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-wide v3, p0, Lcom/vincent/videocompressor/g;->o:J

    sub-long v3, p1, v3

    .line 6
    iput-wide p1, p0, Lcom/vincent/videocompressor/g;->o:J

    .line 7
    iget p1, p0, Lcom/vincent/videocompressor/g;->h:I

    int-to-long p1, p1

    mul-long v3, v3, p1

    const-wide/32 p1, 0x7a120

    add-long/2addr v3, p1

    const-wide/32 p1, 0xf4240

    div-long/2addr v3, p1

    .line 8
    iget-boolean p1, p0, Lcom/vincent/videocompressor/g;->p:Z

    if-nez p1, :cond_2

    .line 9
    iget-object p1, p0, Lcom/vincent/videocompressor/g;->m:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    sub-int/2addr p2, v2

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 10
    iget-wide p1, p0, Lcom/vincent/videocompressor/g;->c:J

    add-long/2addr p1, v3

    iput-wide p1, p0, Lcom/vincent/videocompressor/g;->c:J

    .line 11
    :cond_2
    iput-boolean v1, p0, Lcom/vincent/videocompressor/g;->p:Z

    return-void
.end method

.method public b()Ljava/util/Date;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/vincent/videocompressor/g;->i:Ljava/util/Date;

    return-object v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/vincent/videocompressor/g;->c:J

    return-wide v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/vincent/videocompressor/g;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/vincent/videocompressor/g;->j:I

    return v0
.end method

.method public f()Lcom/coremedia/iso/boxes/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/vincent/videocompressor/g;->e:Lcom/coremedia/iso/boxes/a;

    return-object v0
.end method

.method public g()Lcom/coremedia/iso/boxes/s0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/vincent/videocompressor/g;->f:Lcom/coremedia/iso/boxes/s0;

    return-object v0
.end method

.method public h()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/vincent/videocompressor/g;->m:Ljava/util/ArrayList;

    return-object v0
.end method

.method public i()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/vincent/videocompressor/e;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/vincent/videocompressor/g;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method public j()[J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/vincent/videocompressor/g;->g:Ljava/util/LinkedList;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/vincent/videocompressor/g;->g:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    new-array v0, v0, [J

    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/vincent/videocompressor/g;->g:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 4
    iget-object v2, p0, Lcom/vincent/videocompressor/g;->g:Ljava/util/LinkedList;

    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    aput-wide v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public k()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/vincent/videocompressor/g;->h:I

    return v0
.end method

.method public l()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/vincent/videocompressor/g;->a:J

    return-wide v0
.end method

.method public m()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/vincent/videocompressor/g;->l:F

    return v0
.end method

.method public n()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/vincent/videocompressor/g;->k:I

    return v0
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/vincent/videocompressor/g;->n:Z

    return v0
.end method
