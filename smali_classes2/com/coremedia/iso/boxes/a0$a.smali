.class public Lcom/coremedia/iso/boxes/a0$a;
.super Ljava/lang/Object;
.source "ItemLocationBox.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/coremedia/iso/boxes/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field final synthetic d:Lcom/coremedia/iso/boxes/a0;


# direct methods
.method public constructor <init>(Lcom/coremedia/iso/boxes/a0;JJJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/coremedia/iso/boxes/a0$a;->d:Lcom/coremedia/iso/boxes/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p2, p0, Lcom/coremedia/iso/boxes/a0$a;->a:J

    .line 3
    iput-wide p4, p0, Lcom/coremedia/iso/boxes/a0$a;->b:J

    .line 4
    iput-wide p6, p0, Lcom/coremedia/iso/boxes/a0$a;->c:J

    return-void
.end method

.method public constructor <init>(Lcom/coremedia/iso/boxes/a0;Ljava/nio/ByteBuffer;)V
    .locals 2

    .line 5
    iput-object p1, p0, Lcom/coremedia/iso/boxes/a0$a;->d:Lcom/coremedia/iso/boxes/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/c;->getVersion()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget v0, p1, Lcom/coremedia/iso/boxes/a0;->v:I

    if-lez v0, :cond_0

    .line 7
    invoke-static {p2, v0}, Lcom/coremedia/iso/h;->a(Ljava/nio/ByteBuffer;I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/a0$a;->c:J

    .line 8
    :cond_0
    iget v0, p1, Lcom/coremedia/iso/boxes/a0;->s:I

    invoke-static {p2, v0}, Lcom/coremedia/iso/h;->a(Ljava/nio/ByteBuffer;I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/a0$a;->a:J

    .line 9
    iget p1, p1, Lcom/coremedia/iso/boxes/a0;->t:I

    invoke-static {p2, p1}, Lcom/coremedia/iso/h;->a(Ljava/nio/ByteBuffer;I)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/coremedia/iso/boxes/a0$a;->b:J

    return-void
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/coremedia/iso/boxes/a0$a;->d:Lcom/coremedia/iso/boxes/a0;

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/c;->getVersion()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/coremedia/iso/boxes/a0$a;->d:Lcom/coremedia/iso/boxes/a0;

    iget v0, v0, Lcom/coremedia/iso/boxes/a0;->v:I

    if-lez v0, :cond_0

    .line 2
    iget-wide v1, p0, Lcom/coremedia/iso/boxes/a0$a;->c:J

    invoke-static {v1, v2, p1, v0}, Lcom/coremedia/iso/j;->a(JLjava/nio/ByteBuffer;I)V

    .line 3
    :cond_0
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/a0$a;->a:J

    iget-object v2, p0, Lcom/coremedia/iso/boxes/a0$a;->d:Lcom/coremedia/iso/boxes/a0;

    iget v2, v2, Lcom/coremedia/iso/boxes/a0;->s:I

    invoke-static {v0, v1, p1, v2}, Lcom/coremedia/iso/j;->a(JLjava/nio/ByteBuffer;I)V

    .line 4
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/a0$a;->b:J

    iget-object v2, p0, Lcom/coremedia/iso/boxes/a0$a;->d:Lcom/coremedia/iso/boxes/a0;

    iget v2, v2, Lcom/coremedia/iso/boxes/a0;->t:I

    invoke-static {v0, v1, p1, v2}, Lcom/coremedia/iso/j;->a(JLjava/nio/ByteBuffer;I)V

    return-void
.end method

.method public b()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/coremedia/iso/boxes/a0$a;->d:Lcom/coremedia/iso/boxes/a0;

    iget v1, v0, Lcom/coremedia/iso/boxes/a0;->v:I

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget v2, v0, Lcom/coremedia/iso/boxes/a0;->s:I

    add-int/2addr v1, v2

    iget v0, v0, Lcom/coremedia/iso/boxes/a0;->t:I

    add-int/2addr v1, v0

    return v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 2
    :cond_1
    check-cast p1, Lcom/coremedia/iso/boxes/a0$a;

    .line 3
    iget-wide v2, p0, Lcom/coremedia/iso/boxes/a0$a;->c:J

    iget-wide v4, p1, Lcom/coremedia/iso/boxes/a0$a;->c:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    return v1

    .line 4
    :cond_2
    iget-wide v2, p0, Lcom/coremedia/iso/boxes/a0$a;->b:J

    iget-wide v4, p1, Lcom/coremedia/iso/boxes/a0$a;->b:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_3

    return v1

    .line 5
    :cond_3
    iget-wide v2, p0, Lcom/coremedia/iso/boxes/a0$a;->a:J

    iget-wide v4, p1, Lcom/coremedia/iso/boxes/a0$a;->a:J

    cmp-long p1, v2, v4

    if-eqz p1, :cond_4

    return v1

    :cond_4
    return v0

    :cond_5
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 7

    .line 1
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/a0$a;->a:J

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    xor-long/2addr v0, v3

    long-to-int v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 2
    iget-wide v3, p0, Lcom/coremedia/iso/boxes/a0$a;->b:J

    ushr-long v5, v3, v2

    xor-long/2addr v3, v5

    long-to-int v0, v3

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 3
    iget-wide v3, p0, Lcom/coremedia/iso/boxes/a0$a;->c:J

    ushr-long v5, v3, v2

    xor-long/2addr v3, v5

    long-to-int v0, v3

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Extent"

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{extentOffset="

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/coremedia/iso/boxes/a0$a;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", extentLength="

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/coremedia/iso/boxes/a0$a;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", extentIndex="

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/coremedia/iso/boxes/a0$a;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 7
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
