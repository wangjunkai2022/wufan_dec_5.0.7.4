.class public Lcom/googlecode/mp4parser/authoring/tracks/Amf0Track;
.super Lcom/googlecode/mp4parser/authoring/a;
.source "Amf0Track.java"


# instance fields
.field e:Ljava/util/SortedMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/SortedMap<",
            "Ljava/lang/Long;",
            "[B>;"
        }
    .end annotation
.end field

.field private f:Lcom/googlecode/mp4parser/authoring/i;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "[B>;)V"
        }
    .end annotation

    const-string v0, "amf0"

    .line 1
    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/authoring/a;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/googlecode/mp4parser/authoring/tracks/Amf0Track$1;

    invoke-direct {v0, p0}, Lcom/googlecode/mp4parser/authoring/tracks/Amf0Track$1;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/Amf0Track;)V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/Amf0Track;->e:Ljava/util/SortedMap;

    .line 3
    new-instance v0, Lcom/googlecode/mp4parser/authoring/i;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/authoring/i;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/Amf0Track;->f:Lcom/googlecode/mp4parser/authoring/i;

    .line 4
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0, p1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/Amf0Track;->e:Ljava/util/SortedMap;

    .line 5
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/Amf0Track;->f:Lcom/googlecode/mp4parser/authoring/i;

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1, v0}, Lcom/googlecode/mp4parser/authoring/i;->l(Ljava/util/Date;)V

    .line 6
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/Amf0Track;->f:Lcom/googlecode/mp4parser/authoring/i;

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1, v0}, Lcom/googlecode/mp4parser/authoring/i;->r(Ljava/util/Date;)V

    .line 7
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/Amf0Track;->f:Lcom/googlecode/mp4parser/authoring/i;

    const-wide/16 v0, 0x3e8

    invoke-virtual {p1, v0, v1}, Lcom/googlecode/mp4parser/authoring/i;->s(J)V

    .line 8
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/Amf0Track;->f:Lcom/googlecode/mp4parser/authoring/i;

    const-string v0, "eng"

    invoke-virtual {p1, v0}, Lcom/googlecode/mp4parser/authoring/i;->o(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public M()Lcom/googlecode/mp4parser/authoring/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/Amf0Track;->f:Lcom/googlecode/mp4parser/authoring/i;

    return-object v0
.end method

.method public O()[J
    .locals 7

    .line 1
    new-instance v0, Ljava/util/LinkedList;

    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/Amf0Track;->e:Ljava/util/SortedMap;

    invoke-interface {v1}, Ljava/util/SortedMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 2
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v1

    new-array v1, v1, [J

    const/4 v2, 0x0

    .line 4
    :goto_0
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v3

    if-lt v2, v3, :cond_0

    return-object v1

    .line 5
    :cond_0
    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    sub-long/2addr v3, v5

    .line 6
    aput-wide v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0
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
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method public getHandler()Ljava/lang/String;
    .locals 1

    const-string v0, "data"

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
    .locals 3

    .line 1
    new-instance v0, Lcom/coremedia/iso/boxes/s0;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/s0;-><init>()V

    .line 2
    new-instance v1, Lf1/a;

    invoke-direct {v1}, Lf1/a;-><init>()V

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v1, v2}, Lcom/coremedia/iso/boxes/sampleentry/a;->d(I)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-object v0
.end method

.method public q()[J
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public s()Lcom/coremedia/iso/boxes/a1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public x()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/googlecode/mp4parser/authoring/f;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/Amf0Track;->e:Ljava/util/SortedMap;

    invoke-interface {v1}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    return-object v0

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    .line 3
    new-instance v3, Lcom/googlecode/mp4parser/authoring/g;

    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-direct {v3, v2}, Lcom/googlecode/mp4parser/authoring/g;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method
