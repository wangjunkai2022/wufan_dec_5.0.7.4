.class public final Lkotlinx/coroutines/g2;
.super Ljava/lang/Object;
.source "JobSupport.kt"


# static fields
.field private static final a:Lkotlinx/coroutines/internal/o0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lkotlinx/coroutines/internal/o0;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final c:Lkotlinx/coroutines/internal/o0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final d:Lkotlinx/coroutines/internal/o0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final e:I = -0x1

.field private static final f:I = 0x0

.field private static final g:I = 0x1

.field private static final h:Lkotlinx/coroutines/internal/o0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final i:Lkotlinx/coroutines/j1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final j:Lkotlinx/coroutines/j1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlinx/coroutines/internal/o0;

    const-string v1, "COMPLETING_ALREADY"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/o0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/g2;->a:Lkotlinx/coroutines/internal/o0;

    .line 2
    new-instance v0, Lkotlinx/coroutines/internal/o0;

    const-string v1, "COMPLETING_WAITING_CHILDREN"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/o0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/g2;->b:Lkotlinx/coroutines/internal/o0;

    .line 3
    new-instance v0, Lkotlinx/coroutines/internal/o0;

    const-string v1, "COMPLETING_RETRY"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/o0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/g2;->c:Lkotlinx/coroutines/internal/o0;

    .line 4
    new-instance v0, Lkotlinx/coroutines/internal/o0;

    const-string v1, "TOO_LATE_TO_CANCEL"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/o0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/g2;->d:Lkotlinx/coroutines/internal/o0;

    .line 5
    new-instance v0, Lkotlinx/coroutines/internal/o0;

    const-string v1, "SEALED"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/o0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/g2;->h:Lkotlinx/coroutines/internal/o0;

    .line 6
    new-instance v0, Lkotlinx/coroutines/j1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlinx/coroutines/j1;-><init>(Z)V

    sput-object v0, Lkotlinx/coroutines/g2;->i:Lkotlinx/coroutines/j1;

    .line 7
    new-instance v0, Lkotlinx/coroutines/j1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkotlinx/coroutines/j1;-><init>(Z)V

    sput-object v0, Lkotlinx/coroutines/g2;->j:Lkotlinx/coroutines/j1;

    return-void
.end method

.method public static final synthetic a()Lkotlinx/coroutines/internal/o0;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/coroutines/g2;->a:Lkotlinx/coroutines/internal/o0;

    return-object v0
.end method

.method public static final synthetic b()Lkotlinx/coroutines/internal/o0;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/coroutines/g2;->c:Lkotlinx/coroutines/internal/o0;

    return-object v0
.end method

.method public static final synthetic c()Lkotlinx/coroutines/j1;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/coroutines/g2;->j:Lkotlinx/coroutines/j1;

    return-object v0
.end method

.method public static final synthetic d()Lkotlinx/coroutines/j1;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/coroutines/g2;->i:Lkotlinx/coroutines/j1;

    return-object v0
.end method

.method public static final synthetic e()Lkotlinx/coroutines/internal/o0;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/coroutines/g2;->h:Lkotlinx/coroutines/internal/o0;

    return-object v0
.end method

.method public static final synthetic f()Lkotlinx/coroutines/internal/o0;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/coroutines/g2;->d:Lkotlinx/coroutines/internal/o0;

    return-object v0
.end method

.method public static final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    instance-of v0, p0, Lkotlinx/coroutines/u1;

    if-eqz v0, :cond_0

    new-instance v0, Lkotlinx/coroutines/v1;

    check-cast p0, Lkotlinx/coroutines/u1;

    invoke-direct {v0, p0}, Lkotlinx/coroutines/v1;-><init>(Lkotlinx/coroutines/u1;)V

    move-object p0, v0

    :cond_0
    return-object p0
.end method

.method private static synthetic h()V
    .locals 0

    return-void
.end method

.method private static synthetic i()V
    .locals 0

    return-void
.end method

.method public static synthetic j()V
    .locals 0

    return-void
.end method

.method private static synthetic k()V
    .locals 0

    return-void
.end method

.method private static synthetic l()V
    .locals 0

    return-void
.end method

.method private static synthetic m()V
    .locals 0

    return-void
.end method

.method private static synthetic n()V
    .locals 0

    return-void
.end method

.method public static final o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    instance-of v0, p0, Lkotlinx/coroutines/v1;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/v1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, v0, Lkotlinx/coroutines/v1;->a:Lkotlinx/coroutines/u1;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    move-object p0, v0

    :goto_1
    return-object p0
.end method
