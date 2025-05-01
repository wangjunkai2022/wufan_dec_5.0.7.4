.class public Lcom/umeng/analytics/pro/by;
.super Ljava/lang/Object;
.source "TDeserializer.java"


# instance fields
.field private final a:Lcom/umeng/analytics/pro/cu;

.field private final b:Lcom/umeng/analytics/pro/dh;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/umeng/analytics/pro/co$a;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/co$a;-><init>()V

    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/by;-><init>(Lcom/umeng/analytics/pro/cw;)V

    return-void
.end method

.method public constructor <init>(Lcom/umeng/analytics/pro/cw;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/umeng/analytics/pro/dh;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/dh;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/pro/by;->b:Lcom/umeng/analytics/pro/dh;

    .line 4
    invoke-interface {p1, v0}, Lcom/umeng/analytics/pro/cw;->a(Lcom/umeng/analytics/pro/di;)Lcom/umeng/analytics/pro/cu;

    move-result-object p1

    iput-object p1, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    return-void
.end method

.method private varargs a(B[BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    .line 22
    :try_start_0
    invoke-direct {p0, p2, p3, p4}, Lcom/umeng/analytics/pro/by;->j([BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Lcom/umeng/analytics/pro/cp;

    move-result-object p2

    if-eqz p2, :cond_8

    const/4 p3, 0x2

    if-eq p1, p3, :cond_7

    const/4 p3, 0x3

    if-eq p1, p3, :cond_6

    const/4 p3, 0x4

    if-eq p1, p3, :cond_5

    const/4 p3, 0x6

    if-eq p1, p3, :cond_4

    const/16 p3, 0x8

    if-eq p1, p3, :cond_3

    const/16 p3, 0x64

    const/16 p4, 0xb

    if-eq p1, p3, :cond_2

    const/16 p3, 0xa

    if-eq p1, p3, :cond_1

    if-eq p1, p4, :cond_0

    goto/16 :goto_1

    .line 23
    :cond_0
    iget-byte p1, p2, Lcom/umeng/analytics/pro/cp;->b:B

    if-ne p1, p4, :cond_8

    .line 24
    iget-object p1, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->z()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    :goto_0
    iget-object p2, p0, Lcom/umeng/analytics/pro/by;->b:Lcom/umeng/analytics/pro/dh;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/dh;->e()V

    .line 26
    iget-object p2, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cu;->B()V

    return-object p1

    .line 27
    :cond_1
    :try_start_1
    iget-byte p1, p2, Lcom/umeng/analytics/pro/cp;->b:B

    if-ne p1, p3, :cond_8

    .line 28
    iget-object p1, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->x()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_0

    .line 29
    :cond_2
    iget-byte p1, p2, Lcom/umeng/analytics/pro/cp;->b:B

    if-ne p1, p4, :cond_8

    .line 30
    iget-object p1, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->A()Ljava/nio/ByteBuffer;

    move-result-object p1

    goto :goto_0

    .line 31
    :cond_3
    iget-byte p1, p2, Lcom/umeng/analytics/pro/cp;->b:B

    if-ne p1, p3, :cond_8

    .line 32
    iget-object p1, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->w()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    .line 33
    :cond_4
    iget-byte p1, p2, Lcom/umeng/analytics/pro/cp;->b:B

    if-ne p1, p3, :cond_8

    .line 34
    iget-object p1, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->v()S

    move-result p1

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    goto :goto_0

    .line 35
    :cond_5
    iget-byte p1, p2, Lcom/umeng/analytics/pro/cp;->b:B

    if-ne p1, p3, :cond_8

    .line 36
    iget-object p1, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->y()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    goto :goto_0

    .line 37
    :cond_6
    iget-byte p1, p2, Lcom/umeng/analytics/pro/cp;->b:B

    if-ne p1, p3, :cond_8

    .line 38
    iget-object p1, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->u()B

    move-result p1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    goto :goto_0

    .line 39
    :cond_7
    iget-byte p1, p2, Lcom/umeng/analytics/pro/cp;->b:B

    if-ne p1, p3, :cond_8

    .line 40
    iget-object p1, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->t()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_8
    :goto_1
    const/4 p1, 0x0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 41
    :try_start_2
    new-instance p2, Lcom/umeng/analytics/pro/cb;

    invoke-direct {p2, p1}, Lcom/umeng/analytics/pro/cb;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    :goto_2
    iget-object p2, p0, Lcom/umeng/analytics/pro/by;->b:Lcom/umeng/analytics/pro/dh;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/dh;->e()V

    .line 43
    iget-object p2, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cu;->B()V

    .line 44
    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method private varargs j([BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Lcom/umeng/analytics/pro/cp;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/by;->b:Lcom/umeng/analytics/pro/dh;

    invoke-virtual {v0, p1}, Lcom/umeng/analytics/pro/dh;->a([B)V

    .line 2
    array-length p1, p3

    add-int/lit8 p1, p1, 0x1

    new-array v0, p1, [Lcom/umeng/analytics/pro/cc;

    const/4 v1, 0x0

    .line 3
    aput-object p2, v0, v1

    const/4 p2, 0x0

    .line 4
    :goto_0
    array-length v2, p3

    if-ge p2, v2, :cond_0

    add-int/lit8 v2, p2, 0x1

    .line 5
    aget-object p2, p3, p2

    aput-object p2, v0, v2

    move p2, v2

    goto :goto_0

    .line 6
    :cond_0
    iget-object p2, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cu;->j()Lcom/umeng/analytics/pro/cz;

    const/4 p2, 0x0

    move-object p3, p2

    :cond_1
    :goto_1
    if-ge v1, p1, :cond_5

    .line 7
    iget-object p3, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p3}, Lcom/umeng/analytics/pro/cu;->l()Lcom/umeng/analytics/pro/cp;

    move-result-object p3

    .line 8
    iget-byte v2, p3, Lcom/umeng/analytics/pro/cp;->b:B

    if-eqz v2, :cond_4

    iget-short v2, p3, Lcom/umeng/analytics/pro/cp;->c:S

    aget-object v3, v0, v1

    invoke-interface {v3}, Lcom/umeng/analytics/pro/cc;->a()S

    move-result v3

    if-le v2, v3, :cond_2

    goto :goto_2

    .line 9
    :cond_2
    iget-short v2, p3, Lcom/umeng/analytics/pro/cp;->c:S

    aget-object v3, v0, v1

    invoke-interface {v3}, Lcom/umeng/analytics/pro/cc;->a()S

    move-result v3

    if-eq v2, v3, :cond_3

    .line 10
    iget-object v2, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    iget-byte v3, p3, Lcom/umeng/analytics/pro/cp;->b:B

    invoke-static {v2, v3}, Lcom/umeng/analytics/pro/cx;->a(Lcom/umeng/analytics/pro/cu;B)V

    .line 11
    iget-object v2, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {v2}, Lcom/umeng/analytics/pro/cu;->m()V

    goto :goto_1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    if-ge v1, p1, :cond_1

    .line 12
    iget-object v2, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {v2}, Lcom/umeng/analytics/pro/cu;->j()Lcom/umeng/analytics/pro/cz;

    goto :goto_1

    :cond_4
    :goto_2
    return-object p2

    :cond_5
    return-object p3
.end method


# virtual methods
.method public varargs a([BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Ljava/lang/Boolean;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    const/4 v0, 0x2

    .line 21
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/umeng/analytics/pro/by;->a(B[BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    return-object p1
.end method

.method public a(Lcom/umeng/analytics/pro/bv;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    .line 45
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/by;->a(Lcom/umeng/analytics/pro/bv;[B)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/bv;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    .line 8
    :try_start_0
    invoke-virtual {p2, p3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/by;->a(Lcom/umeng/analytics/pro/bv;[B)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-object p1, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->B()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 10
    :catch_0
    :try_start_1
    new-instance p1, Lcom/umeng/analytics/pro/cb;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "JVM DOES NOT SUPPORT ENCODING: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/umeng/analytics/pro/cb;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    :goto_0
    iget-object p2, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cu;->B()V

    .line 12
    throw p1
.end method

.method public a(Lcom/umeng/analytics/pro/bv;[B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/by;->b:Lcom/umeng/analytics/pro/dh;

    invoke-virtual {v0, p2}, Lcom/umeng/analytics/pro/dh;->a([B)V

    .line 2
    iget-object p2, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-interface {p1, p2}, Lcom/umeng/analytics/pro/bv;->read(Lcom/umeng/analytics/pro/cu;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    iget-object p1, p0, Lcom/umeng/analytics/pro/by;->b:Lcom/umeng/analytics/pro/dh;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/dh;->e()V

    .line 4
    iget-object p1, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->B()V

    return-void

    :catchall_0
    move-exception p1

    .line 5
    iget-object p2, p0, Lcom/umeng/analytics/pro/by;->b:Lcom/umeng/analytics/pro/dh;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/dh;->e()V

    .line 6
    iget-object p2, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cu;->B()V

    .line 7
    throw p1
.end method

.method public varargs a(Lcom/umeng/analytics/pro/bv;[BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    .line 13
    :try_start_0
    invoke-direct {p0, p2, p3, p4}, Lcom/umeng/analytics/pro/by;->j([BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Lcom/umeng/analytics/pro/cp;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 14
    iget-object p2, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-interface {p1, p2}, Lcom/umeng/analytics/pro/bv;->read(Lcom/umeng/analytics/pro/cu;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/umeng/analytics/pro/by;->b:Lcom/umeng/analytics/pro/dh;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/dh;->e()V

    .line 16
    iget-object p1, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->B()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 17
    :try_start_1
    new-instance p2, Lcom/umeng/analytics/pro/cb;

    invoke-direct {p2, p1}, Lcom/umeng/analytics/pro/cb;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    :goto_0
    iget-object p2, p0, Lcom/umeng/analytics/pro/by;->b:Lcom/umeng/analytics/pro/dh;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/dh;->e()V

    .line 19
    iget-object p2, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cu;->B()V

    .line 20
    throw p1
.end method

.method public varargs b([BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Ljava/lang/Byte;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    const/4 v0, 0x3

    .line 1
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/umeng/analytics/pro/by;->a(B[BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Byte;

    return-object p1
.end method

.method public varargs c([BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Ljava/lang/Double;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    const/4 v0, 0x4

    .line 1
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/umeng/analytics/pro/by;->a(B[BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    return-object p1
.end method

.method public varargs d([BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Ljava/lang/Short;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    const/4 v0, 0x6

    .line 1
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/umeng/analytics/pro/by;->a(B[BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Short;

    return-object p1
.end method

.method public varargs e([BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Ljava/lang/Integer;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    const/16 v0, 0x8

    .line 1
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/umeng/analytics/pro/by;->a(B[BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    return-object p1
.end method

.method public varargs f([BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Ljava/lang/Long;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    const/16 v0, 0xa

    .line 1
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/umeng/analytics/pro/by;->a(B[BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    return-object p1
.end method

.method public varargs g([BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    const/16 v0, 0xb

    .line 1
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/umeng/analytics/pro/by;->a(B[BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public varargs h([BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Ljava/nio/ByteBuffer;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    const/16 v0, 0x64

    .line 1
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/umeng/analytics/pro/by;->a(B[BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/nio/ByteBuffer;

    return-object p1
.end method

.method public varargs i([BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Ljava/lang/Short;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lcom/umeng/analytics/pro/by;->j([BLcom/umeng/analytics/pro/cc;[Lcom/umeng/analytics/pro/cc;)Lcom/umeng/analytics/pro/cp;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->j()Lcom/umeng/analytics/pro/cz;

    .line 3
    iget-object p1, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->l()Lcom/umeng/analytics/pro/cp;

    move-result-object p1

    iget-short p1, p1, Lcom/umeng/analytics/pro/cp;->c:S

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :goto_0
    iget-object p2, p0, Lcom/umeng/analytics/pro/by;->b:Lcom/umeng/analytics/pro/dh;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/dh;->e()V

    .line 5
    iget-object p2, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cu;->B()V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 6
    :try_start_1
    new-instance p2, Lcom/umeng/analytics/pro/cb;

    invoke-direct {p2, p1}, Lcom/umeng/analytics/pro/cb;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7
    :goto_1
    iget-object p2, p0, Lcom/umeng/analytics/pro/by;->b:Lcom/umeng/analytics/pro/dh;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/dh;->e()V

    .line 8
    iget-object p2, p0, Lcom/umeng/analytics/pro/by;->a:Lcom/umeng/analytics/pro/cu;

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/cu;->B()V

    .line 9
    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method
