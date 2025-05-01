.class public final Lcom/kwad/library/solder/lib/ext/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/library/solder/lib/ext/c$a;
    }
.end annotation


# instance fields
.field private final akE:Ljava/lang/String;

.field private final akF:Ljava/lang/String;

.field private final akG:Ljava/lang/String;

.field private final akH:Ljava/lang/String;

.field private final akI:Ljava/lang/String;

.field private final akJ:Ljava/lang/String;

.field private final akK:Ljava/lang/String;

.field private final akL:Z

.field private final akM:Z

.field private final akN:Z

.field private akO:Ljava/util/concurrent/ExecutorService;

.field private akP:Ljava/lang/String;

.field private akQ:[B

.field private akR:Z

.field private akS:I

.field private final akq:I


# direct methods
.method private constructor <init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[BZZLjava/util/concurrent/ExecutorService;I)V
    .locals 2

    move-object v0, p0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v1, p10

    .line 3
    iput v1, v0, Lcom/kwad/library/solder/lib/ext/c;->akq:I

    move-object v1, p4

    .line 4
    iput-object v1, v0, Lcom/kwad/library/solder/lib/ext/c;->akE:Ljava/lang/String;

    move-object v1, p5

    .line 5
    iput-object v1, v0, Lcom/kwad/library/solder/lib/ext/c;->akF:Ljava/lang/String;

    move-object v1, p6

    .line 6
    iput-object v1, v0, Lcom/kwad/library/solder/lib/ext/c;->akG:Ljava/lang/String;

    move-object v1, p7

    .line 7
    iput-object v1, v0, Lcom/kwad/library/solder/lib/ext/c;->akH:Ljava/lang/String;

    move-object v1, p8

    .line 8
    iput-object v1, v0, Lcom/kwad/library/solder/lib/ext/c;->akI:Ljava/lang/String;

    move-object v1, p9

    .line 9
    iput-object v1, v0, Lcom/kwad/library/solder/lib/ext/c;->akJ:Ljava/lang/String;

    move-object v1, p3

    .line 10
    iput-object v1, v0, Lcom/kwad/library/solder/lib/ext/c;->akK:Ljava/lang/String;

    move v1, p1

    .line 11
    iput-boolean v1, v0, Lcom/kwad/library/solder/lib/ext/c;->akL:Z

    move v1, p2

    .line 12
    iput-boolean v1, v0, Lcom/kwad/library/solder/lib/ext/c;->akM:Z

    move-object v1, p11

    .line 13
    iput-object v1, v0, Lcom/kwad/library/solder/lib/ext/c;->akP:Ljava/lang/String;

    move-object v1, p12

    .line 14
    iput-object v1, v0, Lcom/kwad/library/solder/lib/ext/c;->akQ:[B

    move v1, p13

    .line 15
    iput-boolean v1, v0, Lcom/kwad/library/solder/lib/ext/c;->akR:Z

    move/from16 v1, p14

    .line 16
    iput-boolean v1, v0, Lcom/kwad/library/solder/lib/ext/c;->akN:Z

    move-object/from16 v1, p15

    .line 17
    iput-object v1, v0, Lcom/kwad/library/solder/lib/ext/c;->akO:Ljava/util/concurrent/ExecutorService;

    move/from16 v1, p16

    .line 18
    iput v1, v0, Lcom/kwad/library/solder/lib/ext/c;->akS:I

    return-void
.end method

.method synthetic constructor <init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[BZZLjava/util/concurrent/ExecutorService;IB)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p16}, Lcom/kwad/library/solder/lib/ext/c;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[BZZLjava/util/concurrent/ExecutorService;I)V

    return-void
.end method


# virtual methods
.method public final getRetryCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/library/solder/lib/ext/c;->akq:I

    return v0
.end method

.method public final yd()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/library/solder/lib/ext/c;->akS:I

    return v0
.end method

.method public final ye()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/ext/c;->akE:Ljava/lang/String;

    return-object v0
.end method

.method public final yf()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/ext/c;->akF:Ljava/lang/String;

    return-object v0
.end method

.method public final yg()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/ext/c;->akG:Ljava/lang/String;

    return-object v0
.end method

.method public final yh()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/ext/c;->akH:Ljava/lang/String;

    return-object v0
.end method

.method public final yi()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/ext/c;->akI:Ljava/lang/String;

    return-object v0
.end method

.method public final yj()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/ext/c;->akJ:Ljava/lang/String;

    return-object v0
.end method

.method public final yk()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/library/solder/lib/ext/c;->akM:Z

    return v0
.end method

.method public final yl()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/library/solder/lib/ext/c;->akN:Z

    return v0
.end method

.method public final ym()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/library/solder/lib/ext/c;->akO:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method
