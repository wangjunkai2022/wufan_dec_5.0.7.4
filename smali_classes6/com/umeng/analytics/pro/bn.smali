.class public Lcom/umeng/analytics/pro/bn;
.super Ljava/lang/Object;
.source "UMEnvelope.java"

# interfaces
.implements Lcom/umeng/analytics/pro/bv;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/pro/bn$c;,
        Lcom/umeng/analytics/pro/bn$d;,
        Lcom/umeng/analytics/pro/bn$a;,
        Lcom/umeng/analytics/pro/bn$b;,
        Lcom/umeng/analytics/pro/bn$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/umeng/analytics/pro/bv<",
        "Lcom/umeng/analytics/pro/bn;",
        "Lcom/umeng/analytics/pro/bn$e;",
        ">;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# static fields
.field private static final A:I = 0x2

.field private static final B:I = 0x3

.field public static final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/umeng/analytics/pro/bn$e;",
            "Lcom/umeng/analytics/pro/ch;",
            ">;"
        }
    .end annotation
.end field

.field private static final l:J = 0x5d55b037b877db0L

.field private static final m:Lcom/umeng/analytics/pro/cz;

.field private static final n:Lcom/umeng/analytics/pro/cp;

.field private static final o:Lcom/umeng/analytics/pro/cp;

.field private static final p:Lcom/umeng/analytics/pro/cp;

.field private static final q:Lcom/umeng/analytics/pro/cp;

.field private static final r:Lcom/umeng/analytics/pro/cp;

.field private static final s:Lcom/umeng/analytics/pro/cp;

.field private static final t:Lcom/umeng/analytics/pro/cp;

.field private static final u:Lcom/umeng/analytics/pro/cp;

.field private static final v:Lcom/umeng/analytics/pro/cp;

.field private static final w:Lcom/umeng/analytics/pro/cp;

.field private static final x:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/umeng/analytics/pro/dc;",
            ">;",
            "Lcom/umeng/analytics/pro/dd;",
            ">;"
        }
    .end annotation
.end field

.field private static final y:I = 0x0

.field private static final z:I = 0x1


# instance fields
.field private C:B

.field private D:[Lcom/umeng/analytics/pro/bn$e;

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:I

.field public e:I

.field public f:I

.field public g:Ljava/nio/ByteBuffer;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lcom/umeng/analytics/pro/cz;

    const-string v1, "UMEnvelope"

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/cz;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/umeng/analytics/pro/bn;->m:Lcom/umeng/analytics/pro/cz;

    .line 2
    new-instance v0, Lcom/umeng/analytics/pro/cp;

    const-string v1, "version"

    const/16 v2, 0xb

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/umeng/analytics/pro/cp;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/umeng/analytics/pro/bn;->n:Lcom/umeng/analytics/pro/cp;

    .line 3
    new-instance v0, Lcom/umeng/analytics/pro/cp;

    const-string v4, "address"

    const/4 v5, 0x2

    invoke-direct {v0, v4, v2, v5}, Lcom/umeng/analytics/pro/cp;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/umeng/analytics/pro/bn;->o:Lcom/umeng/analytics/pro/cp;

    .line 4
    new-instance v0, Lcom/umeng/analytics/pro/cp;

    const-string v6, "signature"

    const/4 v7, 0x3

    invoke-direct {v0, v6, v2, v7}, Lcom/umeng/analytics/pro/cp;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/umeng/analytics/pro/bn;->p:Lcom/umeng/analytics/pro/cp;

    .line 5
    new-instance v0, Lcom/umeng/analytics/pro/cp;

    const-string v7, "serial_num"

    const/16 v8, 0x8

    const/4 v9, 0x4

    invoke-direct {v0, v7, v8, v9}, Lcom/umeng/analytics/pro/cp;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/umeng/analytics/pro/bn;->q:Lcom/umeng/analytics/pro/cp;

    .line 6
    new-instance v0, Lcom/umeng/analytics/pro/cp;

    const-string v9, "ts_secs"

    const/4 v10, 0x5

    invoke-direct {v0, v9, v8, v10}, Lcom/umeng/analytics/pro/cp;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/umeng/analytics/pro/bn;->r:Lcom/umeng/analytics/pro/cp;

    .line 7
    new-instance v0, Lcom/umeng/analytics/pro/cp;

    const-string v10, "length"

    const/4 v11, 0x6

    invoke-direct {v0, v10, v8, v11}, Lcom/umeng/analytics/pro/cp;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/umeng/analytics/pro/bn;->s:Lcom/umeng/analytics/pro/cp;

    .line 8
    new-instance v0, Lcom/umeng/analytics/pro/cp;

    const-string v11, "entity"

    const/4 v12, 0x7

    invoke-direct {v0, v11, v2, v12}, Lcom/umeng/analytics/pro/cp;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/umeng/analytics/pro/bn;->t:Lcom/umeng/analytics/pro/cp;

    .line 9
    new-instance v0, Lcom/umeng/analytics/pro/cp;

    const-string v12, "guid"

    invoke-direct {v0, v12, v2, v8}, Lcom/umeng/analytics/pro/cp;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/umeng/analytics/pro/bn;->u:Lcom/umeng/analytics/pro/cp;

    .line 10
    new-instance v0, Lcom/umeng/analytics/pro/cp;

    const-string v13, "checksum"

    const/16 v14, 0x9

    invoke-direct {v0, v13, v2, v14}, Lcom/umeng/analytics/pro/cp;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/umeng/analytics/pro/bn;->v:Lcom/umeng/analytics/pro/cp;

    .line 11
    new-instance v0, Lcom/umeng/analytics/pro/cp;

    const-string v14, "codex"

    const/16 v15, 0xa

    invoke-direct {v0, v14, v8, v15}, Lcom/umeng/analytics/pro/cp;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/umeng/analytics/pro/bn;->w:Lcom/umeng/analytics/pro/cp;

    .line 12
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/umeng/analytics/pro/bn;->x:Ljava/util/Map;

    .line 13
    const-class v15, Lcom/umeng/analytics/pro/de;

    new-instance v5, Lcom/umeng/analytics/pro/bn$b;

    const/4 v8, 0x0

    invoke-direct {v5, v8}, Lcom/umeng/analytics/pro/bn$b;-><init>(Lcom/umeng/analytics/pro/bn$1;)V

    invoke-interface {v0, v15, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    const-class v5, Lcom/umeng/analytics/pro/df;

    new-instance v15, Lcom/umeng/analytics/pro/bn$d;

    invoke-direct {v15, v8}, Lcom/umeng/analytics/pro/bn$d;-><init>(Lcom/umeng/analytics/pro/bn$1;)V

    invoke-interface {v0, v5, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    new-instance v0, Ljava/util/EnumMap;

    const-class v5, Lcom/umeng/analytics/pro/bn$e;

    invoke-direct {v0, v5}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 16
    sget-object v5, Lcom/umeng/analytics/pro/bn$e;->a:Lcom/umeng/analytics/pro/bn$e;

    new-instance v8, Lcom/umeng/analytics/pro/ch;

    new-instance v15, Lcom/umeng/analytics/pro/ci;

    invoke-direct {v15, v2}, Lcom/umeng/analytics/pro/ci;-><init>(B)V

    invoke-direct {v8, v1, v3, v15}, Lcom/umeng/analytics/pro/ch;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/ci;)V

    invoke-interface {v0, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    sget-object v1, Lcom/umeng/analytics/pro/bn$e;->b:Lcom/umeng/analytics/pro/bn$e;

    new-instance v5, Lcom/umeng/analytics/pro/ch;

    new-instance v8, Lcom/umeng/analytics/pro/ci;

    invoke-direct {v8, v2}, Lcom/umeng/analytics/pro/ci;-><init>(B)V

    invoke-direct {v5, v4, v3, v8}, Lcom/umeng/analytics/pro/ch;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/ci;)V

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    sget-object v1, Lcom/umeng/analytics/pro/bn$e;->c:Lcom/umeng/analytics/pro/bn$e;

    new-instance v4, Lcom/umeng/analytics/pro/ch;

    new-instance v5, Lcom/umeng/analytics/pro/ci;

    invoke-direct {v5, v2}, Lcom/umeng/analytics/pro/ci;-><init>(B)V

    invoke-direct {v4, v6, v3, v5}, Lcom/umeng/analytics/pro/ch;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/ci;)V

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    sget-object v1, Lcom/umeng/analytics/pro/bn$e;->d:Lcom/umeng/analytics/pro/bn$e;

    new-instance v4, Lcom/umeng/analytics/pro/ch;

    new-instance v5, Lcom/umeng/analytics/pro/ci;

    const/16 v6, 0x8

    invoke-direct {v5, v6}, Lcom/umeng/analytics/pro/ci;-><init>(B)V

    invoke-direct {v4, v7, v3, v5}, Lcom/umeng/analytics/pro/ch;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/ci;)V

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    sget-object v1, Lcom/umeng/analytics/pro/bn$e;->e:Lcom/umeng/analytics/pro/bn$e;

    new-instance v4, Lcom/umeng/analytics/pro/ch;

    new-instance v5, Lcom/umeng/analytics/pro/ci;

    invoke-direct {v5, v6}, Lcom/umeng/analytics/pro/ci;-><init>(B)V

    invoke-direct {v4, v9, v3, v5}, Lcom/umeng/analytics/pro/ch;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/ci;)V

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    sget-object v1, Lcom/umeng/analytics/pro/bn$e;->f:Lcom/umeng/analytics/pro/bn$e;

    new-instance v4, Lcom/umeng/analytics/pro/ch;

    new-instance v5, Lcom/umeng/analytics/pro/ci;

    invoke-direct {v5, v6}, Lcom/umeng/analytics/pro/ci;-><init>(B)V

    invoke-direct {v4, v10, v3, v5}, Lcom/umeng/analytics/pro/ch;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/ci;)V

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    sget-object v1, Lcom/umeng/analytics/pro/bn$e;->g:Lcom/umeng/analytics/pro/bn$e;

    new-instance v4, Lcom/umeng/analytics/pro/ch;

    new-instance v5, Lcom/umeng/analytics/pro/ci;

    invoke-direct {v5, v2, v3}, Lcom/umeng/analytics/pro/ci;-><init>(BZ)V

    invoke-direct {v4, v11, v3, v5}, Lcom/umeng/analytics/pro/ch;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/ci;)V

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    sget-object v1, Lcom/umeng/analytics/pro/bn$e;->h:Lcom/umeng/analytics/pro/bn$e;

    new-instance v4, Lcom/umeng/analytics/pro/ch;

    new-instance v5, Lcom/umeng/analytics/pro/ci;

    invoke-direct {v5, v2}, Lcom/umeng/analytics/pro/ci;-><init>(B)V

    invoke-direct {v4, v12, v3, v5}, Lcom/umeng/analytics/pro/ch;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/ci;)V

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    sget-object v1, Lcom/umeng/analytics/pro/bn$e;->i:Lcom/umeng/analytics/pro/bn$e;

    new-instance v4, Lcom/umeng/analytics/pro/ch;

    new-instance v5, Lcom/umeng/analytics/pro/ci;

    invoke-direct {v5, v2}, Lcom/umeng/analytics/pro/ci;-><init>(B)V

    invoke-direct {v4, v13, v3, v5}, Lcom/umeng/analytics/pro/ch;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/ci;)V

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    sget-object v1, Lcom/umeng/analytics/pro/bn$e;->j:Lcom/umeng/analytics/pro/bn$e;

    new-instance v2, Lcom/umeng/analytics/pro/ch;

    new-instance v3, Lcom/umeng/analytics/pro/ci;

    const/16 v4, 0x8

    invoke-direct {v3, v4}, Lcom/umeng/analytics/pro/ci;-><init>(B)V

    const/4 v4, 0x2

    invoke-direct {v2, v14, v4, v3}, Lcom/umeng/analytics/pro/ch;-><init>(Ljava/lang/String;BLcom/umeng/analytics/pro/ci;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/umeng/analytics/pro/bn;->k:Ljava/util/Map;

    .line 27
    const-class v1, Lcom/umeng/analytics/pro/bn;

    invoke-static {v1, v0}, Lcom/umeng/analytics/pro/ch;->a(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/umeng/analytics/pro/bn$e;

    .line 3
    sget-object v2, Lcom/umeng/analytics/pro/bn$e;->j:Lcom/umeng/analytics/pro/bn$e;

    aput-object v2, v1, v0

    iput-object v1, p0, Lcom/umeng/analytics/pro/bn;->D:[Lcom/umeng/analytics/pro/bn$e;

    return-void
.end method

.method public constructor <init>(Lcom/umeng/analytics/pro/bn;)V
    .locals 3

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 18
    iput-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/umeng/analytics/pro/bn$e;

    .line 19
    sget-object v2, Lcom/umeng/analytics/pro/bn$e;->j:Lcom/umeng/analytics/pro/bn$e;

    aput-object v2, v1, v0

    iput-object v1, p0, Lcom/umeng/analytics/pro/bn;->D:[Lcom/umeng/analytics/pro/bn$e;

    .line 20
    iget-byte v0, p1, Lcom/umeng/analytics/pro/bn;->C:B

    iput-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    .line 21
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bn;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    iget-object v0, p1, Lcom/umeng/analytics/pro/bn;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/umeng/analytics/pro/bn;->a:Ljava/lang/String;

    .line 23
    :cond_0
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bn;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 24
    iget-object v0, p1, Lcom/umeng/analytics/pro/bn;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/umeng/analytics/pro/bn;->b:Ljava/lang/String;

    .line 25
    :cond_1
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bn;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 26
    iget-object v0, p1, Lcom/umeng/analytics/pro/bn;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/umeng/analytics/pro/bn;->c:Ljava/lang/String;

    .line 27
    :cond_2
    iget v0, p1, Lcom/umeng/analytics/pro/bn;->d:I

    iput v0, p0, Lcom/umeng/analytics/pro/bn;->d:I

    .line 28
    iget v0, p1, Lcom/umeng/analytics/pro/bn;->e:I

    iput v0, p0, Lcom/umeng/analytics/pro/bn;->e:I

    .line 29
    iget v0, p1, Lcom/umeng/analytics/pro/bn;->f:I

    iput v0, p0, Lcom/umeng/analytics/pro/bn;->f:I

    .line 30
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bn;->w()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 31
    iget-object v0, p1, Lcom/umeng/analytics/pro/bn;->g:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lcom/umeng/analytics/pro/bw;->d(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/umeng/analytics/pro/bn;->g:Ljava/nio/ByteBuffer;

    .line 32
    :cond_3
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bn;->z()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 33
    iget-object v0, p1, Lcom/umeng/analytics/pro/bn;->h:Ljava/lang/String;

    iput-object v0, p0, Lcom/umeng/analytics/pro/bn;->h:Ljava/lang/String;

    .line 34
    :cond_4
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bn;->C()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 35
    iget-object v0, p1, Lcom/umeng/analytics/pro/bn;->i:Ljava/lang/String;

    iput-object v0, p0, Lcom/umeng/analytics/pro/bn;->i:Ljava/lang/String;

    .line 36
    :cond_5
    iget p1, p1, Lcom/umeng/analytics/pro/bn;->j:I

    iput p1, p0, Lcom/umeng/analytics/pro/bn;->j:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/nio/ByteBuffer;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/umeng/analytics/pro/bn;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/umeng/analytics/pro/bn;->a:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/umeng/analytics/pro/bn;->b:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/umeng/analytics/pro/bn;->c:Ljava/lang/String;

    .line 8
    iput p4, p0, Lcom/umeng/analytics/pro/bn;->d:I

    const/4 p1, 0x1

    .line 9
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bn;->d(Z)V

    .line 10
    iput p5, p0, Lcom/umeng/analytics/pro/bn;->e:I

    .line 11
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bn;->e(Z)V

    .line 12
    iput p6, p0, Lcom/umeng/analytics/pro/bn;->f:I

    .line 13
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bn;->f(Z)V

    .line 14
    iput-object p7, p0, Lcom/umeng/analytics/pro/bn;->g:Ljava/nio/ByteBuffer;

    .line 15
    iput-object p8, p0, Lcom/umeng/analytics/pro/bn;->h:Ljava/lang/String;

    .line 16
    iput-object p9, p0, Lcom/umeng/analytics/pro/bn;->i:Ljava/lang/String;

    return-void
.end method

.method static synthetic H()Lcom/umeng/analytics/pro/cz;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/bn;->m:Lcom/umeng/analytics/pro/cz;

    return-object v0
.end method

.method static synthetic I()Lcom/umeng/analytics/pro/cp;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/bn;->n:Lcom/umeng/analytics/pro/cp;

    return-object v0
.end method

.method static synthetic J()Lcom/umeng/analytics/pro/cp;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/bn;->o:Lcom/umeng/analytics/pro/cp;

    return-object v0
.end method

.method static synthetic K()Lcom/umeng/analytics/pro/cp;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/bn;->p:Lcom/umeng/analytics/pro/cp;

    return-object v0
.end method

.method static synthetic L()Lcom/umeng/analytics/pro/cp;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/bn;->q:Lcom/umeng/analytics/pro/cp;

    return-object v0
.end method

.method static synthetic M()Lcom/umeng/analytics/pro/cp;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/bn;->r:Lcom/umeng/analytics/pro/cp;

    return-object v0
.end method

.method static synthetic N()Lcom/umeng/analytics/pro/cp;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/bn;->s:Lcom/umeng/analytics/pro/cp;

    return-object v0
.end method

.method static synthetic O()Lcom/umeng/analytics/pro/cp;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/bn;->t:Lcom/umeng/analytics/pro/cp;

    return-object v0
.end method

.method static synthetic P()Lcom/umeng/analytics/pro/cp;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/bn;->u:Lcom/umeng/analytics/pro/cp;

    return-object v0
.end method

.method static synthetic Q()Lcom/umeng/analytics/pro/cp;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/bn;->v:Lcom/umeng/analytics/pro/cp;

    return-object v0
.end method

.method static synthetic R()Lcom/umeng/analytics/pro/cp;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/bn;->w:Lcom/umeng/analytics/pro/cp;

    return-object v0
.end method

.method private a(Ljava/io/ObjectInputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 10
    :try_start_0
    iput-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    .line 11
    new-instance v0, Lcom/umeng/analytics/pro/co;

    new-instance v1, Lcom/umeng/analytics/pro/dg;

    invoke-direct {v1, p1}, Lcom/umeng/analytics/pro/dg;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/co;-><init>(Lcom/umeng/analytics/pro/di;)V

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bn;->read(Lcom/umeng/analytics/pro/cu;)V
    :try_end_0
    .catch Lcom/umeng/analytics/pro/cb; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 12
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private a(Ljava/io/ObjectOutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8
    :try_start_0
    new-instance v0, Lcom/umeng/analytics/pro/co;

    new-instance v1, Lcom/umeng/analytics/pro/dg;

    invoke-direct {v1, p1}, Lcom/umeng/analytics/pro/dg;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/co;-><init>(Lcom/umeng/analytics/pro/di;)V

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bn;->write(Lcom/umeng/analytics/pro/cu;)V
    :try_end_0
    .catch Lcom/umeng/analytics/pro/cb; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 9
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->i:Ljava/lang/String;

    return-object v0
.end method

.method public B()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/umeng/analytics/pro/bn;->i:Ljava/lang/String;

    return-void
.end method

.method public C()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->i:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public D()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/umeng/analytics/pro/bn;->j:I

    return v0
.end method

.method public E()V
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/umeng/analytics/pro/bs;->b(BI)B

    move-result v0

    iput-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    return-void
.end method

.method public F()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/umeng/analytics/pro/bs;->a(BI)Z

    move-result v0

    return v0
.end method

.method public G()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->a:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 2
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->b:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 3
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->c:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 4
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->g:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_2

    .line 5
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->h:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->i:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-void

    .line 7
    :cond_0
    new-instance v0, Lcom/umeng/analytics/pro/cv;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Required field \'checksum\' was not present! Struct: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/cv;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9
    :cond_1
    new-instance v0, Lcom/umeng/analytics/pro/cv;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Required field \'guid\' was not present! Struct: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/cv;-><init>(Ljava/lang/String;)V

    throw v0

    .line 11
    :cond_2
    new-instance v0, Lcom/umeng/analytics/pro/cv;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Required field \'entity\' was not present! Struct: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/cv;-><init>(Ljava/lang/String;)V

    throw v0

    .line 13
    :cond_3
    new-instance v0, Lcom/umeng/analytics/pro/cv;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Required field \'signature\' was not present! Struct: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/cv;-><init>(Ljava/lang/String;)V

    throw v0

    .line 15
    :cond_4
    new-instance v0, Lcom/umeng/analytics/pro/cv;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Required field \'address\' was not present! Struct: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/cv;-><init>(Ljava/lang/String;)V

    throw v0

    .line 17
    :cond_5
    new-instance v0, Lcom/umeng/analytics/pro/cv;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Required field \'version\' was not present! Struct: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/cv;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a()Lcom/umeng/analytics/pro/bn;
    .locals 1

    .line 1
    new-instance v0, Lcom/umeng/analytics/pro/bn;

    invoke-direct {v0, p0}, Lcom/umeng/analytics/pro/bn;-><init>(Lcom/umeng/analytics/pro/bn;)V

    return-object v0
.end method

.method public a(I)Lcom/umeng/analytics/pro/bn;
    .locals 0

    .line 4
    iput p1, p0, Lcom/umeng/analytics/pro/bn;->d:I

    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bn;->d(Z)V

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/umeng/analytics/pro/bn;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/umeng/analytics/pro/bn;->a:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/nio/ByteBuffer;)Lcom/umeng/analytics/pro/bn;
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/umeng/analytics/pro/bn;->g:Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method public a([B)Lcom/umeng/analytics/pro/bn;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bn;->a(Ljava/nio/ByteBuffer;)Lcom/umeng/analytics/pro/bn;

    return-object p0
.end method

.method public a(Z)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/umeng/analytics/pro/bn;->a:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public b(I)Lcom/umeng/analytics/pro/bn;
    .locals 0

    .line 4
    iput p1, p0, Lcom/umeng/analytics/pro/bn;->e:I

    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bn;->e(Z)V

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/umeng/analytics/pro/bn;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/umeng/analytics/pro/bn;->b:Ljava/lang/String;

    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(Z)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/umeng/analytics/pro/bn;->b:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public c(I)Lcom/umeng/analytics/pro/bn;
    .locals 0

    .line 4
    iput p1, p0, Lcom/umeng/analytics/pro/bn;->f:I

    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bn;->f(Z)V

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/umeng/analytics/pro/bn;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/umeng/analytics/pro/bn;->c:Ljava/lang/String;

    return-object p0
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/umeng/analytics/pro/bn;->a:Ljava/lang/String;

    return-void
.end method

.method public c(Z)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/umeng/analytics/pro/bn;->c:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public clear()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/umeng/analytics/pro/bn;->a:Ljava/lang/String;

    .line 2
    iput-object v0, p0, Lcom/umeng/analytics/pro/bn;->b:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lcom/umeng/analytics/pro/bn;->c:Ljava/lang/String;

    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v1}, Lcom/umeng/analytics/pro/bn;->d(Z)V

    .line 5
    iput v1, p0, Lcom/umeng/analytics/pro/bn;->d:I

    .line 6
    invoke-virtual {p0, v1}, Lcom/umeng/analytics/pro/bn;->e(Z)V

    .line 7
    iput v1, p0, Lcom/umeng/analytics/pro/bn;->e:I

    .line 8
    invoke-virtual {p0, v1}, Lcom/umeng/analytics/pro/bn;->f(Z)V

    .line 9
    iput v1, p0, Lcom/umeng/analytics/pro/bn;->f:I

    .line 10
    iput-object v0, p0, Lcom/umeng/analytics/pro/bn;->g:Ljava/nio/ByteBuffer;

    .line 11
    iput-object v0, p0, Lcom/umeng/analytics/pro/bn;->h:Ljava/lang/String;

    .line 12
    iput-object v0, p0, Lcom/umeng/analytics/pro/bn;->i:Ljava/lang/String;

    .line 13
    invoke-virtual {p0, v1}, Lcom/umeng/analytics/pro/bn;->j(Z)V

    .line 14
    iput v1, p0, Lcom/umeng/analytics/pro/bn;->j:I

    return-void
.end method

.method public d(I)Lcom/umeng/analytics/pro/bn;
    .locals 0

    .line 4
    iput p1, p0, Lcom/umeng/analytics/pro/bn;->j:I

    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bn;->j(Z)V

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/umeng/analytics/pro/bn;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/umeng/analytics/pro/bn;->h:Ljava/lang/String;

    return-object p0
.end method

.method public d(Z)V
    .locals 2

    .line 2
    iget-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lcom/umeng/analytics/pro/bs;->a(BIZ)B

    move-result p1

    iput-byte p1, p0, Lcom/umeng/analytics/pro/bn;->C:B

    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public synthetic deepCopy()Lcom/umeng/analytics/pro/bv;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->a()Lcom/umeng/analytics/pro/bn;

    move-result-object v0

    return-object v0
.end method

.method public e(I)Lcom/umeng/analytics/pro/bn$e;
    .locals 0

    .line 4
    invoke-static {p1}, Lcom/umeng/analytics/pro/bn$e;->a(I)Lcom/umeng/analytics/pro/bn$e;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/String;)Lcom/umeng/analytics/pro/bn;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/umeng/analytics/pro/bn;->i:Ljava/lang/String;

    return-object p0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e(Z)V
    .locals 2

    .line 2
    iget-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    const/4 v1, 0x1

    invoke-static {v0, v1, p1}, Lcom/umeng/analytics/pro/bs;->a(BIZ)B

    move-result p1

    iput-byte p1, p0, Lcom/umeng/analytics/pro/bn;->C:B

    return-void
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/umeng/analytics/pro/bn;->b:Ljava/lang/String;

    return-void
.end method

.method public f(Z)V
    .locals 2

    .line 2
    iget-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    const/4 v1, 0x2

    invoke-static {v0, v1, p1}, Lcom/umeng/analytics/pro/bs;->a(BIZ)B

    move-result p1

    iput-byte p1, p0, Lcom/umeng/analytics/pro/bn;->C:B

    return-void
.end method

.method public synthetic fieldForId(I)Lcom/umeng/analytics/pro/cc;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bn;->e(I)Lcom/umeng/analytics/pro/bn$e;

    move-result-object p1

    return-object p1
.end method

.method public g(Z)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/umeng/analytics/pro/bn;->g:Ljava/nio/ByteBuffer;

    :cond_0
    return-void
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->c:Ljava/lang/String;

    return-object v0
.end method

.method public h(Z)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/umeng/analytics/pro/bn;->h:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public i()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/umeng/analytics/pro/bn;->c:Ljava/lang/String;

    return-void
.end method

.method public i(Z)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/umeng/analytics/pro/bn;->i:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public j(Z)V
    .locals 2

    .line 2
    iget-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    const/4 v1, 0x3

    invoke-static {v0, v1, p1}, Lcom/umeng/analytics/pro/bs;->a(BIZ)B

    move-result p1

    iput-byte p1, p0, Lcom/umeng/analytics/pro/bn;->C:B

    return-void
.end method

.method public j()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/umeng/analytics/pro/bn;->d:I

    return v0
.end method

.method public l()V
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/umeng/analytics/pro/bs;->b(BI)B

    move-result v0

    iput-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    return-void
.end method

.method public m()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/umeng/analytics/pro/bs;->a(BI)Z

    move-result v0

    return v0
.end method

.method public n()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/umeng/analytics/pro/bn;->e:I

    return v0
.end method

.method public o()V
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/umeng/analytics/pro/bs;->b(BI)B

    move-result v0

    iput-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    return-void
.end method

.method public p()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/umeng/analytics/pro/bs;->a(BI)Z

    move-result v0

    return v0
.end method

.method public q()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/umeng/analytics/pro/bn;->f:I

    return v0
.end method

.method public r()V
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/umeng/analytics/pro/bs;->b(BI)B

    move-result v0

    iput-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    return-void
.end method

.method public read(Lcom/umeng/analytics/pro/cu;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/bn;->x:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->D()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/umeng/analytics/pro/dd;

    invoke-interface {v0}, Lcom/umeng/analytics/pro/dd;->b()Lcom/umeng/analytics/pro/dc;

    move-result-object v0

    invoke-interface {v0, p1, p0}, Lcom/umeng/analytics/pro/dc;->b(Lcom/umeng/analytics/pro/cu;Lcom/umeng/analytics/pro/bv;)V

    return-void
.end method

.method public s()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/umeng/analytics/pro/bn;->C:B

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/umeng/analytics/pro/bs;->a(BI)Z

    move-result v0

    return v0
.end method

.method public t()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->g:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lcom/umeng/analytics/pro/bw;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/bn;->a(Ljava/nio/ByteBuffer;)Lcom/umeng/analytics/pro/bn;

    .line 2
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->g:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UMEnvelope("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "version:"

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    iget-object v1, p0, Lcom/umeng/analytics/pro/bn;->a:Ljava/lang/String;

    const-string v2, "null"

    if-nez v1, :cond_0

    .line 4
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, ", "

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "address:"

    .line 7
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    iget-object v3, p0, Lcom/umeng/analytics/pro/bn;->b:Ljava/lang/String;

    if-nez v3, :cond_1

    .line 9
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 10
    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "signature:"

    .line 12
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    iget-object v3, p0, Lcom/umeng/analytics/pro/bn;->c:Ljava/lang/String;

    if-nez v3, :cond_2

    .line 14
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 15
    :cond_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "serial_num:"

    .line 17
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    iget v3, p0, Lcom/umeng/analytics/pro/bn;->d:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "ts_secs:"

    .line 20
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    iget v3, p0, Lcom/umeng/analytics/pro/bn;->e:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "length:"

    .line 23
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    iget v3, p0, Lcom/umeng/analytics/pro/bn;->f:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "entity:"

    .line 26
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    iget-object v3, p0, Lcom/umeng/analytics/pro/bn;->g:Ljava/nio/ByteBuffer;

    if-nez v3, :cond_3

    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 29
    :cond_3
    invoke-static {v3, v0}, Lcom/umeng/analytics/pro/bw;->a(Ljava/nio/ByteBuffer;Ljava/lang/StringBuilder;)V

    .line 30
    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "guid:"

    .line 31
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    iget-object v3, p0, Lcom/umeng/analytics/pro/bn;->h:Ljava/lang/String;

    if-nez v3, :cond_4

    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    .line 34
    :cond_4
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    :goto_4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "checksum:"

    .line 36
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    iget-object v3, p0, Lcom/umeng/analytics/pro/bn;->i:Ljava/lang/String;

    if-nez v3, :cond_5

    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    .line 39
    :cond_5
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    :goto_5
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bn;->F()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "codex:"

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    iget v1, p0, Lcom/umeng/analytics/pro/bn;->j:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_6
    const-string v1, ")"

    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->g:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public v()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/umeng/analytics/pro/bn;->g:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public w()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->g:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public write(Lcom/umeng/analytics/pro/cu;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/bn;->x:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->D()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/umeng/analytics/pro/dd;

    invoke-interface {v0}, Lcom/umeng/analytics/pro/dd;->b()Lcom/umeng/analytics/pro/dc;

    move-result-object v0

    invoke-interface {v0, p1, p0}, Lcom/umeng/analytics/pro/dc;->a(Lcom/umeng/analytics/pro/cu;Lcom/umeng/analytics/pro/bv;)V

    return-void
.end method

.method public x()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->h:Ljava/lang/String;

    return-object v0
.end method

.method public y()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/umeng/analytics/pro/bn;->h:Ljava/lang/String;

    return-void
.end method

.method public z()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/bn;->h:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
