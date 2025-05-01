.class public final Lcom/kwad/library/solder/lib/ext/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/library/solder/lib/ext/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static final akT:Ljava/lang/String;


# instance fields
.field private akE:Ljava/lang/String;

.field private akF:Ljava/lang/String;

.field private akG:Ljava/lang/String;

.field private akH:Ljava/lang/String;

.field private akI:Ljava/lang/String;

.field private akJ:Ljava/lang/String;

.field private akK:Ljava/lang/String;

.field private akL:Z

.field private akM:Z

.field private akN:Z

.field private akO:Ljava/util/concurrent/ExecutorService;

.field private akP:Ljava/lang/String;

.field private akQ:[B

.field private akR:Z

.field private akU:I

.field private akq:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/library/solder/lib/ext/c$a;->yn()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "base-1_apk"

    goto :goto_0

    :cond_0
    const-string v0, "base-1.apk"

    :goto_0
    sput-object v0, Lcom/kwad/library/solder/lib/ext/c$a;->akT:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lcom/kwad/library/solder/lib/ext/c$a;->akq:I

    const-string v0, "sodler"

    .line 3
    iput-object v0, p0, Lcom/kwad/library/solder/lib/ext/c$a;->akE:Ljava/lang/String;

    const-string v0, "code-cache"

    .line 4
    iput-object v0, p0, Lcom/kwad/library/solder/lib/ext/c$a;->akF:Ljava/lang/String;

    const-string v0, "lib"

    .line 5
    iput-object v0, p0, Lcom/kwad/library/solder/lib/ext/c$a;->akG:Ljava/lang/String;

    const-string v0, "temp"

    .line 6
    iput-object v0, p0, Lcom/kwad/library/solder/lib/ext/c$a;->akH:Ljava/lang/String;

    .line 7
    sget-object v0, Lcom/kwad/library/solder/lib/ext/c$a;->akT:Ljava/lang/String;

    iput-object v0, p0, Lcom/kwad/library/solder/lib/ext/c$a;->akJ:Ljava/lang/String;

    const-string v0, ".tmp"

    .line 8
    iput-object v0, p0, Lcom/kwad/library/solder/lib/ext/c$a;->akI:Ljava/lang/String;

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/kwad/library/solder/lib/ext/c$a;->akM:Z

    .line 10
    iput-boolean v0, p0, Lcom/kwad/library/solder/lib/ext/c$a;->akL:Z

    return-void
.end method

.method private static yn()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-eq v0, v1, :cond_1

    const/16 v1, 0x1f

    if-eq v0, v1, :cond_1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/ExecutorService;)Lcom/kwad/library/solder/lib/ext/c$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/library/solder/lib/ext/c$a;->akO:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method public final bQ(I)Lcom/kwad/library/solder/lib/ext/c$a;
    .locals 0

    if-lez p1, :cond_0

    .line 1
    iput p1, p0, Lcom/kwad/library/solder/lib/ext/c$a;->akq:I

    :cond_0
    return-object p0
.end method

.method public final bR(I)Lcom/kwad/library/solder/lib/ext/c$a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/library/solder/lib/ext/c$a;->akU:I

    return-object p0
.end method

.method public final bT(Ljava/lang/String;)Lcom/kwad/library/solder/lib/ext/c$a;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/kwad/library/solder/lib/ext/c$a;->akE:Ljava/lang/String;

    return-object p0
.end method

.method public final bh(Z)Lcom/kwad/library/solder/lib/ext/c$a;
    .locals 0

    const/4 p1, 0x0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/library/solder/lib/ext/c$a;->akR:Z

    return-object p0
.end method

.method public final bi(Z)Lcom/kwad/library/solder/lib/ext/c$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/library/solder/lib/ext/c$a;->akN:Z

    return-object p0
.end method

.method public final yo()Lcom/kwad/library/solder/lib/ext/c;
    .locals 21

    move-object/from16 v0, p0

    .line 1
    new-instance v19, Lcom/kwad/library/solder/lib/ext/c;

    move-object/from16 v1, v19

    iget-boolean v2, v0, Lcom/kwad/library/solder/lib/ext/c$a;->akL:Z

    iget-boolean v3, v0, Lcom/kwad/library/solder/lib/ext/c$a;->akM:Z

    iget-object v4, v0, Lcom/kwad/library/solder/lib/ext/c$a;->akK:Ljava/lang/String;

    iget-object v5, v0, Lcom/kwad/library/solder/lib/ext/c$a;->akE:Ljava/lang/String;

    iget-object v6, v0, Lcom/kwad/library/solder/lib/ext/c$a;->akF:Ljava/lang/String;

    iget-object v7, v0, Lcom/kwad/library/solder/lib/ext/c$a;->akG:Ljava/lang/String;

    iget-object v8, v0, Lcom/kwad/library/solder/lib/ext/c$a;->akH:Ljava/lang/String;

    iget-object v9, v0, Lcom/kwad/library/solder/lib/ext/c$a;->akI:Ljava/lang/String;

    iget-object v10, v0, Lcom/kwad/library/solder/lib/ext/c$a;->akJ:Ljava/lang/String;

    iget v11, v0, Lcom/kwad/library/solder/lib/ext/c$a;->akq:I

    iget-object v12, v0, Lcom/kwad/library/solder/lib/ext/c$a;->akP:Ljava/lang/String;

    iget-object v13, v0, Lcom/kwad/library/solder/lib/ext/c$a;->akQ:[B

    iget-boolean v14, v0, Lcom/kwad/library/solder/lib/ext/c$a;->akR:Z

    iget-boolean v15, v0, Lcom/kwad/library/solder/lib/ext/c$a;->akN:Z

    move-object/from16 v20, v1

    iget-object v1, v0, Lcom/kwad/library/solder/lib/ext/c$a;->akO:Ljava/util/concurrent/ExecutorService;

    move-object/from16 v16, v1

    iget v1, v0, Lcom/kwad/library/solder/lib/ext/c$a;->akU:I

    move/from16 v17, v1

    const/16 v18, 0x0

    move-object/from16 v1, v20

    invoke-direct/range {v1 .. v18}, Lcom/kwad/library/solder/lib/ext/c;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[BZZLjava/util/concurrent/ExecutorService;IB)V

    return-object v19
.end method
