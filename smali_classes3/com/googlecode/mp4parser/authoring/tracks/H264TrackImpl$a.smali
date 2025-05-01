.class Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;
.super Ljava/lang/Object;
.source "H264TrackImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->t(Lcom/googlecode/mp4parser/authoring/tracks/c$a;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:I

.field b:I

.field c:Z

.field d:Z

.field e:I

.field f:I

.field g:I

.field h:I

.field i:I

.field j:I

.field k:Z

.field l:I

.field final synthetic m:Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;


# direct methods
.method public constructor <init>(Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;Ljava/nio/ByteBuffer;II)V
    .locals 4

    .line 1
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->m:Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$b;

    invoke-direct {v0, p1, p2}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$b;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;Ljava/nio/ByteBuffer;)V

    invoke-static {v0}, Lcom/googlecode/mp4parser/authoring/tracks/c;->a(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object p2

    .line 3
    new-instance v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;

    iget-object v1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->m:Ljava/util/Map;

    iget-object v2, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->o:Ljava/util/Map;

    const/4 v3, 0x5

    if-ne p4, v3, :cond_0

    const/4 p4, 0x1

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    invoke-direct {v0, p2, v1, v2, p4}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;-><init>(Ljava/io/InputStream;Ljava/util/Map;Ljava/util/Map;Z)V

    .line 4
    iget p2, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->e:I

    iput p2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->a:I

    .line 5
    iget p2, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->c:I

    iput p2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->b:I

    .line 6
    iget-boolean p4, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->f:Z

    iput-boolean p4, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->c:Z

    .line 7
    iget-boolean p4, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->g:Z

    iput-boolean p4, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->d:Z

    .line 8
    iput p3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->e:I

    .line 9
    iget-object p3, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->m:Ljava/util/Map;

    iget-object p1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->o:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/googlecode/mp4parser/h264/model/e;

    iget p1, p1, Lcom/googlecode/mp4parser/h264/model/e;->f:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/googlecode/mp4parser/h264/model/h;

    iget p1, p1, Lcom/googlecode/mp4parser/h264/model/h;->a:I

    iput p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->f:I

    .line 10
    iget p1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->j:I

    iput p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->g:I

    .line 11
    iget p1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->i:I

    iput p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->h:I

    .line 12
    iget p1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->k:I

    iput p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->i:I

    .line 13
    iget p1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->l:I

    iput p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->j:I

    .line 14
    iget p1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader;->h:I

    iput p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->l:I

    return-void
.end method


# virtual methods
.method a(Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;)Z
    .locals 4

    .line 1
    iget v0, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->a:I

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->a:I

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    return v2

    .line 2
    :cond_0
    iget v0, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->b:I

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->b:I

    if-eq v0, v1, :cond_1

    return v2

    .line 3
    :cond_1
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->c:Z

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->c:Z

    if-eq v0, v1, :cond_2

    return v2

    :cond_2
    if-eqz v0, :cond_3

    .line 4
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->d:Z

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->d:Z

    if-eq v0, v1, :cond_3

    return v2

    .line 5
    :cond_3
    iget v0, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->e:I

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->e:I

    if-eq v0, v1, :cond_4

    return v2

    .line 6
    :cond_4
    iget v0, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->f:I

    if-nez v0, :cond_6

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->f:I

    if-nez v1, :cond_6

    .line 7
    iget v1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->h:I

    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->h:I

    if-eq v1, v3, :cond_5

    return v2

    .line 8
    :cond_5
    iget v1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->g:I

    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->g:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    if-ne v0, v2, :cond_8

    .line 9
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->f:I

    if-ne v0, v2, :cond_8

    .line 10
    iget v0, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->i:I

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->i:I

    if-eq v0, v1, :cond_7

    return v2

    .line 11
    :cond_7
    iget v0, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->j:I

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->j:I

    if-eq v0, v1, :cond_8

    return v2

    .line 12
    :cond_8
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->k:Z

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->k:Z

    if-eq v0, v1, :cond_9

    return v2

    :cond_9
    if-eqz v0, :cond_a

    if-eqz v1, :cond_a

    .line 13
    iget p1, p1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->l:I

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$a;->l:I

    if-eq p1, v0, :cond_a

    return v2

    :cond_a
    const/4 p1, 0x0

    return p1
.end method
