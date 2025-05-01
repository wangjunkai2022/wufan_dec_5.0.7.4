.class public Lcom/googlecode/mp4parser/authoring/tracks/e;
.super Lcom/googlecode/mp4parser/authoring/j;
.source "Avc1ToAvc3TrackImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/mp4parser/authoring/tracks/e$a;
    }
.end annotation


# instance fields
.field c:Lcom/coremedia/iso/boxes/s0;

.field d:Lcom/mp4parser/iso14496/part15/a;

.field e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/googlecode/mp4parser/authoring/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/googlecode/mp4parser/authoring/h;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/googlecode/mp4parser/authoring/j;-><init>(Lcom/googlecode/mp4parser/authoring/h;)V

    .line 2
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->o()Lcom/coremedia/iso/boxes/s0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/s0;->C()Lcom/coremedia/iso/boxes/sampleentry/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/b;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "avc1"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->o()Lcom/coremedia/iso/boxes/s0;

    move-result-object v1

    invoke-static {v0}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/coremedia/iso/boxes/s0;->a(Ljava/nio/channels/WritableByteChannel;)V

    .line 5
    new-instance v1, Lcom/coremedia/iso/f;

    new-instance v2, Lcom/googlecode/mp4parser/i;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/googlecode/mp4parser/i;-><init>([B)V

    invoke-direct {v1, v2}, Lcom/coremedia/iso/f;-><init>(Lcom/googlecode/mp4parser/e;)V

    const-string/jumbo v0, "stsd"

    .line 6
    invoke-static {v1, v0}, Lcom/googlecode/mp4parser/util/m;->d(Lcom/coremedia/iso/boxes/j;Ljava/lang/String;)Lcom/coremedia/iso/boxes/d;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/s0;

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/e;->c:Lcom/coremedia/iso/boxes/s0;

    .line 7
    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/s0;->C()Lcom/coremedia/iso/boxes/sampleentry/a;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/sampleentry/h;

    const-string v1, "avc3"

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/h;->Y(Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/e;->c:Lcom/coremedia/iso/boxes/s0;

    const-string v1, "avc./avcC"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/m;->e(Lcom/googlecode/mp4parser/b;Ljava/lang/String;)Lcom/coremedia/iso/boxes/d;

    move-result-object v0

    check-cast v0, Lcom/mp4parser/iso14496/part15/a;

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/e;->d:Lcom/mp4parser/iso14496/part15/a;

    .line 9
    new-instance v0, Lcom/googlecode/mp4parser/authoring/tracks/e$a;

    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->x()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/googlecode/mp4parser/authoring/tracks/e$a;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/e;Ljava/util/List;)V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/e;->e:Ljava/util/List;

    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Only avc1 tracks can be converted to avc3 tracks"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public o()Lcom/coremedia/iso/boxes/s0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/e;->c:Lcom/coremedia/iso/boxes/s0;

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
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/e;->e:Ljava/util/List;

    return-object v0
.end method
