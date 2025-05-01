.class public final Lcom/join/mgps/va/overmind/d;
.super Ljava/lang/Object;
.source "VAUtils.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/va/overmind/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nVAUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VAUtils.kt\ncom/join/mgps/va/overmind/VAUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1355:1\n1855#2,2:1356\n1855#2,2:1358\n1855#2,2:1360\n1855#2,2:1362\n1855#2,2:1364\n*S KotlinDebug\n*F\n+ 1 VAUtils.kt\ncom/join/mgps/va/overmind/VAUtils\n*L\n192#1:1356,2\n226#1:1358,2\n260#1:1360,2\n432#1:1362,2\n444#1:1364,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nVAUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VAUtils.kt\ncom/join/mgps/va/overmind/VAUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1355:1\n1855#2,2:1356\n1855#2,2:1358\n1855#2,2:1360\n1855#2,2:1362\n1855#2,2:1364\n*S KotlinDebug\n*F\n+ 1 VAUtils.kt\ncom/join/mgps/va/overmind/VAUtils\n*L\n192#1:1356,2\n226#1:1358,2\n260#1:1360,2\n432#1:1362,2\n444#1:1364,2\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Lcom/join/mgps/va/overmind/d$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static h:I = 0x0

.field private static i:Z = false

.field private static j:Lcom/join/mgps/va/overmind/d; = null
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final k:Ljava/lang/String; = "com.join.android.app.mgsim.wufun"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final l:Ljava/lang/String; = "com.join.android.app.mgsim.wufun.addon"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final m:Ljava/lang/String; = "com.join.android.app.mgsim.wufun"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final n:Ljava/lang/String; = "com.join.android.app.mgsim.wufun.addon"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/util/concurrent/ThreadPoolExecutor;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private c:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private d:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private e:I

.field private f:Lcom/join/mgps/mod/utils/b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/join/mgps/va/overmind/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/join/mgps/va/overmind/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/join/mgps/va/overmind/d;->g:Lcom/join/mgps/va/overmind/d$a;

    .line 1
    new-instance v0, Lcom/join/mgps/va/overmind/d;

    invoke-direct {v0}, Lcom/join/mgps/va/overmind/d;-><init>()V

    sput-object v0, Lcom/join/mgps/va/overmind/d;->j:Lcom/join/mgps/va/overmind/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-class v0, Lcom/join/mgps/va/overmind/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/va/overmind/d;->a:Ljava/lang/String;

    .line 3
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v0, p0, Lcom/join/mgps/va/overmind/d;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    const-string v0, ""

    .line 4
    iput-object v0, p0, Lcom/join/mgps/va/overmind/d;->c:Ljava/lang/String;

    const-string v0, "0"

    .line 5
    iput-object v0, p0, Lcom/join/mgps/va/overmind/d;->d:Ljava/lang/String;

    return-void
.end method

.method public static final D()Z
    .locals 1

    sget-object v0, Lcom/join/mgps/va/overmind/d;->g:Lcom/join/mgps/va/overmind/d$a;

    invoke-virtual {v0}, Lcom/join/mgps/va/overmind/d$a;->g()Z

    move-result v0

    return v0
.end method

.method private final E(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/xinzhu/overmind/a;->d(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    return p1
.end method

.method public static synthetic H(Lcom/join/mgps/va/overmind/d;Ljava/lang/String;IILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 1
    sget p2, Lcom/join/mgps/va/overmind/d;->h:I

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/va/overmind/d;->G(Ljava/lang/String;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic J(Lcom/join/mgps/va/overmind/d;Ljava/lang/String;IILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/va/overmind/d;->I(Ljava/lang/String;I)Z

    move-result p0

    return p0
.end method

.method private static final T(Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p0, :cond_1

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_2

    return-void

    .line 2
    :cond_2
    sget-object v2, Lcom/join/mgps/va/overmind/d;->g:Lcom/join/mgps/va/overmind/d$a;

    invoke-virtual {v2}, Lcom/join/mgps/va/overmind/d$a;->d()Lcom/join/mgps/va/overmind/d;

    move-result-object v2

    invoke-virtual {v2, p0}, Lcom/join/mgps/va/overmind/d;->Q(Ljava/lang/String;)V

    new-array v1, v1, [Ljava/lang/String;

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "killModApp:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v3, Lcom/join/mgps/va/overmind/d;->h:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    aput-object p0, v1, v0

    invoke-static {v1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic Y(Lcom/join/mgps/va/overmind/d;Landroid/content/Context;Lcom/join/mgps/mod/bean/ModMeta;ILjava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 1
    sget p3, Lcom/join/mgps/va/overmind/d;->h:I

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    .line 2
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/join/mgps/va/overmind/d;->V(Landroid/content/Context;Lcom/join/mgps/mod/bean/ModMeta;ILjava/lang/String;)V

    return-void
.end method

.method private final Z(Landroid/content/Context;Landroid/content/pm/ApplicationInfo;)Ljava/lang/String;
    .locals 5

    const-string v0, ""

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    :try_start_0
    iget-object v1, p2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const-string v2, "ai.packageName"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {p0, v1, v2, v3, v4}, Lcom/join/mgps/va/overmind/d;->u(Lcom/join/mgps/va/overmind/d;Ljava/lang/String;IILjava/lang/Object;)Lf2/a;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 2
    iget-object p1, v1, Lf2/a;->e:Ljava/lang/CharSequence;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static synthetic a(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/join/mgps/va/overmind/d;->T(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic b()Lcom/join/mgps/va/overmind/d;
    .locals 1

    .line 1
    sget-object v0, Lcom/join/mgps/va/overmind/d;->j:Lcom/join/mgps/va/overmind/d;

    return-object v0
.end method

.method public static final b0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/join/mgps/va/overmind/d;->g:Lcom/join/mgps/va/overmind/d$a;

    invoke-virtual {v0, p0, p1}, Lcom/join/mgps/va/overmind/d$a;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic c()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/join/mgps/va/overmind/d;->i:Z

    return v0
.end method

.method public static final synthetic d(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Lcom/join/mgps/va/overmind/d;->i:Z

    return-void
.end method

.method private final f0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/xinzhu/overmind/Overmind;->getUsers()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 4
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v3, 0x1

    :goto_1
    if-eqz v3, :cond_3

    return-void

    :cond_3
    const-string v3, "userList"

    .line 5
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xinzhu/overmind/server/user/MindUserInfo;

    iget v1, v1, Lcom/xinzhu/overmind/server/user/MindUserInfo;->b:I

    .line 6
    invoke-virtual {v0, v2, v1}, Lcom/xinzhu/overmind/Overmind;->getInstalledApplications(II)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 7
    invoke-virtual {v0, v1}, Lcom/xinzhu/overmind/Overmind;->deleteUser(I)V

    .line 8
    invoke-direct {p0}, Lcom/join/mgps/va/overmind/d;->f0()V

    :cond_4
    return-void
.end method

.method public static final g0(Landroid/content/Intent;)V
    .locals 1
    .param p0    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/join/mgps/va/overmind/d;->g:Lcom/join/mgps/va/overmind/d$a;

    invoke-virtual {v0, p0}, Lcom/join/mgps/va/overmind/d$a;->l(Landroid/content/Intent;)V

    return-void
.end method

.method public static final h0(Landroid/content/Intent;I)V
    .locals 1
    .param p0    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/join/mgps/va/overmind/d;->g:Lcom/join/mgps/va/overmind/d$a;

    invoke-virtual {v0, p0, p1}, Lcom/join/mgps/va/overmind/d$a;->m(Landroid/content/Intent;I)V

    return-void
.end method

.method private final k(Ljava/lang/String;I)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/xinzhu/overmind/client/frameworks/g;->k(Ljava/lang/String;)Lcom/xinzhu/overmind/server/pm/MindPackageSettings;

    move-result-object v0

    .line 3
    sget-object v1, Lcom/join/mgps/va/overmind/f;->a:Lcom/join/mgps/va/overmind/f;

    invoke-virtual {v1, p1, p2}, Lcom/join/mgps/va/overmind/f;->w(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    if-nez p2, :cond_1

    .line 4
    invoke-virtual {v1, p1}, Lcom/join/mgps/va/overmind/f;->M(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-virtual {v1, p1}, Lcom/join/mgps/va/overmind/f;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-virtual {v1, p1}, Lcom/join/mgps/va/overmind/f;->Y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {v1, p1, p2}, Lcom/join/mgps/va/overmind/f;->N(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    .line 8
    invoke-virtual {v1, p1, p2}, Lcom/join/mgps/va/overmind/f;->d(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    .line 9
    invoke-virtual {v1, p1, p2}, Lcom/join/mgps/va/overmind/f;->D(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    const/4 v5, 0x4

    new-array v6, v5, [Ljava/lang/String;

    const/4 v7, 0x0

    aput-object v2, v6, v7

    const/4 v2, 0x1

    aput-object v3, v6, v2

    const/4 v3, 0x2

    aput-object v4, v6, v3

    const/4 v4, 0x3

    aput-object v1, v6, v4

    .line 10
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 11
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 12
    invoke-static {v6}, Lcom/papa91/arc/util/FileUtils;->deleteDirs(Ljava/lang/String;)Z

    goto :goto_1

    .line 13
    :cond_2
    invoke-virtual {v0}, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 14
    sget-object v0, Lcom/join/mgps/va/overmind/f;->a:Lcom/join/mgps/va/overmind/f;

    invoke-virtual {v0, p1, p2}, Lcom/join/mgps/va/overmind/f;->z(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    if-nez p2, :cond_3

    .line 15
    invoke-virtual {v0, p1}, Lcom/join/mgps/va/overmind/f;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 16
    invoke-virtual {v0, p1}, Lcom/join/mgps/va/overmind/f;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 17
    invoke-virtual {v0, p1}, Lcom/join/mgps/va/overmind/f;->Z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    .line 18
    :cond_3
    invoke-virtual {v0, p1, p2}, Lcom/join/mgps/va/overmind/f;->P(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v6

    .line 19
    invoke-virtual {v0, p1, p2}, Lcom/join/mgps/va/overmind/f;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v8

    .line 20
    invoke-virtual {v0, p1, p2}, Lcom/join/mgps/va/overmind/f;->B(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    move-object p2, v6

    move-object v6, v8

    :goto_2
    new-array v0, v5, [Ljava/lang/String;

    aput-object v1, v0, v7

    aput-object p2, v0, v2

    aput-object v6, v0, v3

    aput-object p1, v0, v4

    .line 21
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 22
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 23
    invoke-static {p2}, Lcom/xinzhu/overmind/plugin/b;->h(Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    return-void
.end method

.method public static synthetic k0(Lcom/join/mgps/va/overmind/d;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 1
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/join/mgps/va/overmind/d;->j0(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic l(Lcom/join/mgps/va/overmind/d;Ljava/lang/String;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/va/overmind/d;->k(Ljava/lang/String;I)V

    return-void
.end method

.method public static n(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 6
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroid/net/Uri;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    sget-object v0, Lcom/join/mgps/va/overmind/d;->g:Lcom/join/mgps/va/overmind/d$a;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/join/mgps/va/overmind/d$a;->b(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static final o()Lcom/join/mgps/va/overmind/d;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/join/mgps/va/overmind/d;->g:Lcom/join/mgps/va/overmind/d$a;

    invoke-virtual {v0}, Lcom/join/mgps/va/overmind/d$a;->d()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic u(Lcom/join/mgps/va/overmind/d;Ljava/lang/String;IILjava/lang/Object;)Lf2/a;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/va/overmind/d;->t(Ljava/lang/String;I)Lf2/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lcom/join/mgps/va/overmind/d;Ljava/lang/String;IILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 1
    sget p2, Lcom/join/mgps/va/overmind/d;->h:I

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/va/overmind/d;->w(Ljava/lang/String;I)I

    move-result p0

    return p0
.end method

.method private final y(Landroid/content/Context;Ljava/lang/String;)I
    .locals 3

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const/16 v1, 0x80

    invoke-virtual {p1, p2, v1}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/String;

    .line 2
    iget-object v1, p0, Lcom/join/mgps/va/overmind/d;->a:Ljava/lang/String;

    aput-object v1, p2, v0

    const/4 v1, 0x1

    const-string v2, "loadApk packageInfo"

    aput-object v2, p2, v1

    invoke-static {p2}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 3
    iget v0, p1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return v0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return v0
.end method

.method private final z(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "0"

    .line 1
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const/16 v1, 0x80

    invoke-virtual {p1, p2, v1}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    if-nez p1, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    const-string p2, "packageInfo.versionName"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-object v0
.end method


# virtual methods
.method public final A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "packageName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "archivePath"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "archiveId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/join/mgps/va/overmind/f;->a:Lcom/join/mgps/va/overmind/f;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, p1, v1, v2, v3}, Lcom/join/mgps/va/overmind/f;->r(Lcom/join/mgps/va/overmind/f;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " \n "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "  "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-static {v0, p2, p3, p4}, Lcom/join/mgps/mod/utils/PluginConfig;->setArchivePath(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final B(Ljava/lang/String;)Lcom/xinzhu/overmind/entity/pm/InstallResult;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x2

    const-string v2, "/"

    const/4 v3, 0x0

    .line 2
    invoke-static {p1, v2, v3, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "file://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 3
    :cond_1
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    .line 4
    invoke-static {p1}, Landroid/webkit/URLUtil;->isValidUrl(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 5
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 6
    sget v1, Lcom/join/mgps/va/overmind/d;->h:I

    invoke-virtual {v0, p1, v1}, Lcom/xinzhu/overmind/Overmind;->installPackageAsUser_Storage(Landroid/net/Uri;I)Lcom/xinzhu/overmind/entity/pm/InstallResult;

    move-result-object p1

    goto :goto_0

    .line 7
    :cond_2
    sget v1, Lcom/join/mgps/va/overmind/d;->h:I

    invoke-virtual {v0, p1, v1}, Lcom/xinzhu/overmind/Overmind;->installPackageAsUser_System(Ljava/lang/String;I)Lcom/xinzhu/overmind/entity/pm/InstallResult;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_4

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    .line 8
    iget-boolean v1, p1, Lcom/xinzhu/overmind/entity/pm/InstallResult;->b:Z

    if-eqz v1, :cond_3

    const-string v1, "\u5b89\u88c5\u6210\u529f"

    goto :goto_1

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u5b89\u88c5\u5931\u8d25\uff1a "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p1, Lcom/xinzhu/overmind/entity/pm/InstallResult;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_1
    aput-object v1, v0, v3

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 9
    :cond_4
    invoke-direct {p0}, Lcom/join/mgps/va/overmind/d;->f0()V

    return-object p1
.end method

.method public final C(Ljava/lang/String;I)Z
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-nez v2, :cond_6

    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_4

    .line 2
    :cond_2
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v2

    .line 3
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/xinzhu/overmind/client/frameworks/g;->k(Ljava/lang/String;)Lcom/xinzhu/overmind/server/pm/MindPackageSettings;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 4
    invoke-virtual {v2, p1, p2}, Lcom/xinzhu/overmind/Overmind;->installPackageAsUser_Exist(Ljava/lang/String;I)Lcom/xinzhu/overmind/entity/pm/InstallResult;

    move-result-object p1

    goto :goto_2

    .line 5
    :cond_3
    invoke-virtual {v2, p1, p2}, Lcom/xinzhu/overmind/Overmind;->installPackageAsUser_System(Ljava/lang/String;I)Lcom/xinzhu/overmind/entity/pm/InstallResult;

    move-result-object p1

    :goto_2
    const-string p2, "\u5b89\u88c5\u5931\u8d25\uff1a "

    if-nez p1, :cond_4

    new-array v0, v0, [Ljava/lang/String;

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is Null"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v1

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    return v1

    :cond_4
    new-array v0, v0, [Ljava/lang/String;

    .line 7
    iget-boolean v2, p1, Lcom/xinzhu/overmind/entity/pm/InstallResult;->b:Z

    if-eqz v2, :cond_5

    const-string p2, "\u5b89\u88c5\u6210\u529f"

    goto :goto_3

    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p1, Lcom/xinzhu/overmind/entity/pm/InstallResult;->d:Ljava/lang/String;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_3
    aput-object p2, v0, v1

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Lcom/join/mgps/va/overmind/d;->f0()V

    .line 9
    iget-boolean p1, p1, Lcom/xinzhu/overmind/entity/pm/InstallResult;->b:Z

    return p1

    :cond_6
    :goto_4
    return v1
.end method

.method public final F(Ljava/lang/String;)Z
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, p1, v0, v1, v2}, Lcom/join/mgps/va/overmind/d;->H(Lcom/join/mgps/va/overmind/d;Ljava/lang/String;IILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final G(Ljava/lang/String;I)Z
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-nez v2, :cond_6

    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_4

    .line 2
    :cond_2
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object v2

    if-nez v2, :cond_3

    invoke-direct {p0, p1}, Lcom/join/mgps/va/overmind/d;->E(Ljava/lang/String;)Z

    move-result p1

    return p1

    .line 3
    :cond_3
    :try_start_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object v2

    .line 4
    invoke-virtual {v2, p1, p2}, Lcom/xinzhu/overmind/client/frameworks/g;->t(Ljava/lang/String;I)Z

    move-result p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    .line 5
    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p2, 0x0

    .line 6
    :goto_2
    invoke-direct {p0, p1}, Lcom/join/mgps/va/overmind/d;->E(Ljava/lang/String;)Z

    move-result p1

    if-nez p2, :cond_5

    if-eqz p1, :cond_4

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :cond_5
    :goto_3
    return v0

    :cond_6
    :goto_4
    return v1
.end method

.method public final I(Ljava/lang/String;I)Z
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-eqz p1, :cond_2

    .line 2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_3

    return v1

    .line 3
    :cond_3
    :try_start_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v2

    invoke-virtual {v2}, Lcom/xinzhu/overmind/Overmind;->getRunningAppProcessesContainPlugin()Ljava/util/List;

    move-result-object v2

    const-string v3, "runningAppProcesses"

    .line 4
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 6
    iget-object v4, v3, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget v3, v3, Landroid/app/ActivityManager$RunningAppProcessInfo;->uid:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-ne p2, v3, :cond_4

    return v0

    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_5
    return v1
.end method

.method public final K(Landroid/content/pm/ApplicationInfo;)Z
    .locals 4
    .param p1    # Landroid/content/pm/ApplicationInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_3

    if-nez p1, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 4
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_3

    if-ge v0, v3, :cond_2

    goto :goto_0

    .line 5
    :cond_2
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    if-ge p1, v3, :cond_3

    const/4 v1, 0x1

    :cond_3
    :goto_0
    return v1
.end method

.method public final L()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->isPluginPkgInstalled()Z

    move-result v0

    return v0
.end method

.method public final M()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getPluginPkg()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x80

    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    const-string v2, "pm.getApplicationInfo(Ov\u2026ageManager.GET_META_DATA)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    const-string v2, "vmengine"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "overmind"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :catch_0
    :cond_1
    return v1
.end method

.method public final N(Ljava/lang/String;)Z
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-eqz p1, :cond_2

    .line 2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_3

    return v1

    .line 3
    :cond_3
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/xinzhu/overmind/client/frameworks/g;->k(Ljava/lang/String;)Lcom/xinzhu/overmind/server/pm/MindPackageSettings;

    move-result-object v2

    if-nez v2, :cond_5

    .line 4
    invoke-static {p1}, Lcom/xinzhu/overmind/a;->d(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 5
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_4

    return v0

    :cond_4
    return v1

    .line 6
    :cond_5
    invoke-virtual {v2}, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->k()Z

    move-result p1

    return p1
.end method

.method public final O()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final P(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    if-eqz p1, :cond_1

    const/16 v0, 0x80

    invoke-virtual {p1, p2, v0}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string p2, "useNativeLib"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final Q(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_2

    .line 2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    return-void

    .line 3
    :cond_3
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    sget v1, Lcom/join/mgps/va/overmind/d;->h:I

    invoke-virtual {v0, p1, v1}, Lcom/xinzhu/overmind/Overmind;->stopApk(Ljava/lang/String;I)V

    return-void
.end method

.method public final R()V
    .locals 0

    return-void
.end method

.method public final S(Landroid/content/Intent;)V
    .locals 2
    .param p1    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_3

    :try_start_0
    const-string v0, "exitGamePackage"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    return-void

    .line 3
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/va/overmind/d;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lcom/join/mgps/va/overmind/c;

    invoke-direct {v1, p1}, Lcom/join/mgps/va/overmind/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_2
    return-void
.end method

.method public final U(Landroid/content/Context;ILjava/lang/String;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p3, :cond_2

    .line 2
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    return-void

    .line 3
    :cond_3
    :try_start_0
    invoke-static {p1, p3}, Lcom/join/mgps/mod/utils/PluginConfig;->setLastLaunchPkg(Landroid/content/Context;Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object p1

    invoke-virtual {p1, p3, p2}, Lcom/xinzhu/overmind/Overmind;->launchApk(Ljava/lang/String;I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    return-void
.end method

.method public final V(Landroid/content/Context;Lcom/join/mgps/mod/bean/ModMeta;ILjava/lang/String;)V
    .locals 19
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/mgps/mod/bean/ModMeta;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    move-object/from16 v12, p0

    move-object/from16 v0, p1

    move-object/from16 v13, p2

    move/from16 v14, p3

    move-object/from16 v15, p4

    const-string v1, "wufun"

    const-string v2, "context"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x2

    :try_start_0
    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "WF"

    const/4 v11, 0x0

    aput-object v3, v2, v11

    .line 2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "launch mod game \n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " \n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v10, 0x1

    aput-object v3, v2, v10

    invoke-static {v2}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    if-eqz v13, :cond_c

    .line 3
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_c

    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v2

    if-nez v2, :cond_1

    goto/16 :goto_5

    .line 4
    :cond_1
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getModPath()Ljava/lang/String;

    move-result-object v2

    const-string v3, "meta.modPath"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v12, Lcom/join/mgps/va/overmind/d;->c:Ljava/lang/String;

    .line 5
    invoke-static/range {p1 .. p1}, Lcom/papa/sim/statistic/k;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Lcom/join/mgps/mod/bean/ModMeta;->setChannelNum(Ljava/lang/String;)V

    .line 6
    sget-object v2, Lcom/join/android/app/mgsim/wufun/b;->n:Ljava/lang/Integer;

    const-string v3, "SdkTargetVersionNumber"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v13, v2}, Lcom/join/mgps/mod/bean/ModMeta;->setTarget_version(I)V

    .line 7
    invoke-static/range {p1 .. p1}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/join/android/app/common/utils/n;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Lcom/join/mgps/mod/bean/ModMeta;->setAndroidId(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v13, v1}, Lcom/join/mgps/mod/bean/ModMeta;->setPlatform(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v13, v1}, Lcom/join/mgps/mod/bean/ModMeta;->setPackage_type(Ljava/lang/String;)V

    .line 10
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v1}, Lcom/join/mgps/va/overmind/d;->N(Ljava/lang/String;)Z

    move-result v9

    .line 11
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 12
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getGoldFingerSwitch()Ljava/lang/String;

    move-result-object v3

    .line 13
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getArchiveCloudSwitch()Ljava/lang/String;

    move-result-object v4

    .line 14
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getIntroductionSwitch()Ljava/lang/String;

    move-result-object v5

    .line 15
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getChannelNum()Ljava/lang/String;

    move-result-object v6

    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getTarget_version()I

    move-result v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ""

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 17
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getAndroidId()Ljava/lang/String;

    move-result-object v8

    .line 18
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPlatform()Ljava/lang/String;

    move-result-object v16

    .line 19
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackage_type()Ljava/lang/String;

    move-result-object v17

    .line 20
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getTypeId()Ljava/lang/String;

    move-result-object v18

    move-object/from16 v1, p0

    move v13, v9

    move-object/from16 v9, v16

    const/4 v15, 0x1

    move-object/from16 v10, v17

    const/4 v15, 0x0

    move-object/from16 v11, v18

    .line 21
    invoke-virtual/range {v1 .. v11}, Lcom/join/mgps/va/overmind/d;->o0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v1, v14}, Lcom/join/mgps/va/overmind/d;->I(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 23
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v0, v14, v1}, Lcom/join/mgps/va/overmind/d;->U(Landroid/content/Context;ILjava/lang/String;)V

    return-void

    .line 24
    :cond_2
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getGameId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v12, v1, v2}, Lcom/join/mgps/va/overmind/d;->n0(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_6

    .line 26
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v1}, Lcom/join/mgps/va/overmind/d;->N(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 27
    invoke-virtual/range {p0 .. p1}, Lcom/join/mgps/va/overmind/d;->g(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    .line 28
    :cond_3
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v15, v14}, Lcom/xinzhu/overmind/client/frameworks/g;->f(Ljava/lang/String;II)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 29
    invoke-virtual {v12, v1}, Lcom/join/mgps/va/overmind/d;->K(Landroid/content/pm/ApplicationInfo;)Z

    move-result v2

    if-eqz v2, :cond_6

    const-string v2, "android.permission.READ_PHONE_STATE"

    const-string v3, "android.permission.WRITE_EXTERNAL_STORAGE"

    const-string v4, "android.permission.READ_EXTERNAL_STORAGE"

    .line 30
    filled-new-array {v2, v3, v4}, [Ljava/lang/String;

    move-result-object v2

    .line 31
    invoke-virtual {v12, v2, v13}, Lcom/join/mgps/va/overmind/d;->i([Ljava/lang/String;Z)Z

    move-result v3

    if-nez v3, :cond_6

    const/16 v5, 0x3e8

    .line 32
    invoke-direct {v12, v0, v1}, Lcom/join/mgps/va/overmind/d;->Z(Landroid/content/Context;Landroid/content/pm/ApplicationInfo;)Ljava/lang/String;

    move-result-object v3

    const/4 v1, 0x0

    .line 33
    instance-of v4, v0, Landroid/app/Activity;

    if-eqz v4, :cond_4

    .line 34
    move-object v1, v0

    check-cast v1, Landroid/app/Activity;

    :cond_4
    if-nez v1, :cond_5

    .line 35
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v0}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0

    :cond_5
    move-object v0, v1

    .line 36
    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 37
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v4

    move-object v1, v2

    move-object v2, v3

    move/from16 v3, p3

    .line 38
    invoke-static/range {v0 .. v5}, Lcom/join/mgps/va/activity/PermissionRequestActivity;->b(Landroid/app/Activity;[Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    return-void

    .line 39
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 40
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 41
    invoke-virtual {v12, v1, v14}, Lcom/join/mgps/va/overmind/d;->w(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x7

    if-eq v2, v1, :cond_8

    const/4 v2, 0x1

    if-ne v2, v1, :cond_7

    goto :goto_1

    .line 42
    :cond_7
    new-instance v1, Landroid/content/Intent;

    const-class v3, Lcom/join/mgps/mod/activity/ModLoadingLandActivity;

    invoke-direct {v1, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_2

    :cond_8
    const/4 v2, 0x1

    .line 43
    :goto_1
    new-instance v1, Landroid/content/Intent;

    const-class v3, Lcom/join/mgps/mod/activity/ModLoadingActivity;

    invoke-direct {v1, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    :goto_2
    const-string v3, "gameId"

    .line 44
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getGameId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "packageName"

    .line 45
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "modPath"

    .line 46
    iget-object v4, v12, Lcom/join/mgps/va/overmind/d;->c:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "modVersion"

    .line 47
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getModVersion()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "modCode"

    .line 48
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getModCode()I

    move-result v4

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v3, "modType"

    .line 49
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getModType()I

    move-result v4

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v3, "userId"

    .line 50
    invoke-virtual {v1, v3, v14}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-object/from16 v2, p4

    const/4 v3, 0x1

    if-eqz v2, :cond_a

    .line 51
    invoke-interface/range {p4 .. p4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_9

    goto :goto_3

    :cond_9
    const/4 v11, 0x0

    goto :goto_4

    :cond_a
    :goto_3
    const/4 v11, 0x1

    :goto_4
    if-nez v11, :cond_b

    const-string v3, "_mod_info"

    .line 52
    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 53
    :cond_b
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :cond_c
    :goto_5
    return-void

    :catch_0
    move-exception v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_6
    return-void
.end method

.method public final W(Landroid/content/Context;Lcom/join/mgps/mod/bean/ModMeta;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 19
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/mgps/mod/bean/ModMeta;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/github/snowdream/android/app/downloader/DownloadTask;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v12, p0

    move-object/from16 v0, p1

    move-object/from16 v13, p2

    move-object/from16 v14, p3

    const-string v1, "wufun"

    const-string v2, "context"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "task"

    invoke-static {v14, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    if-eqz v13, :cond_1

    .line 2
    :try_start_0
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getGameId()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_9

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v2}, Lcom/join/mgps/Util/UtilsMy;->t4(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "WF"

    const/4 v11, 0x0

    aput-object v3, v2, v11

    .line 3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "launch mod game\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v10, 0x1

    aput-object v3, v2, v10

    invoke-static {v2}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    if-eqz v13, :cond_10

    .line 4
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v2, 0x1

    :goto_2
    if-nez v2, :cond_10

    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v2

    if-nez v2, :cond_4

    goto/16 :goto_8

    .line 5
    :cond_4
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getModPath()Ljava/lang/String;

    move-result-object v2

    const-string v3, "meta.modPath"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v12, Lcom/join/mgps/va/overmind/d;->c:Ljava/lang/String;

    .line 6
    invoke-static/range {p1 .. p1}, Lcom/papa/sim/statistic/k;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Lcom/join/mgps/mod/bean/ModMeta;->setChannelNum(Ljava/lang/String;)V

    .line 7
    sget-object v2, Lcom/join/android/app/mgsim/wufun/b;->n:Ljava/lang/Integer;

    const-string v3, "SdkTargetVersionNumber"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v13, v2}, Lcom/join/mgps/mod/bean/ModMeta;->setTarget_version(I)V

    .line 8
    invoke-static/range {p1 .. p1}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/join/android/app/common/utils/n;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Lcom/join/mgps/mod/bean/ModMeta;->setAndroidId(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v13, v1}, Lcom/join/mgps/mod/bean/ModMeta;->setPlatform(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v13, v1}, Lcom/join/mgps/mod/bean/ModMeta;->setPackage_type(Ljava/lang/String;)V

    .line 11
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v1}, Lcom/join/mgps/va/overmind/d;->N(Ljava/lang/String;)Z

    move-result v9

    .line 12
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 13
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getGoldFingerSwitch()Ljava/lang/String;

    move-result-object v3

    .line 14
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getArchiveCloudSwitch()Ljava/lang/String;

    move-result-object v4

    .line 15
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getIntroductionSwitch()Ljava/lang/String;

    move-result-object v5

    .line 16
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getChannelNum()Ljava/lang/String;

    move-result-object v6

    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getTarget_version()I

    move-result v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ""

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 18
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getAndroidId()Ljava/lang/String;

    move-result-object v8

    .line 19
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPlatform()Ljava/lang/String;

    move-result-object v16

    .line 20
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackage_type()Ljava/lang/String;

    move-result-object v17

    .line 21
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getTypeId()Ljava/lang/String;

    move-result-object v18

    move-object/from16 v1, p0

    move v15, v9

    move-object/from16 v9, v16

    const/4 v13, 0x1

    move-object/from16 v10, v17

    const/4 v13, 0x0

    move-object/from16 v11, v18

    .line 22
    invoke-virtual/range {v1 .. v11}, Lcom/join/mgps/va/overmind/d;->o0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/join/mgps/va/overmind/d;->h:I

    invoke-virtual {v12, v1, v2}, Lcom/join/mgps/va/overmind/d;->I(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 24
    sget v1, Lcom/join/mgps/va/overmind/d;->h:I

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v12, v0, v1, v2}, Lcom/join/mgps/va/overmind/d;->U(Landroid/content/Context;ILjava/lang/String;)V

    return-void

    .line 25
    :cond_5
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getGameId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v12, v1, v2}, Lcom/join/mgps/va/overmind/d;->n0(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_9

    .line 27
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v1}, Lcom/join/mgps/va/overmind/d;->N(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 28
    invoke-virtual/range {p0 .. p1}, Lcom/join/mgps/va/overmind/d;->g(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_6

    return-void

    .line 29
    :cond_6
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/join/mgps/va/overmind/d;->h:I

    invoke-virtual {v1, v2, v13, v3}, Lcom/xinzhu/overmind/client/frameworks/g;->f(Ljava/lang/String;II)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    if-eqz v1, :cond_9

    .line 30
    invoke-virtual {v12, v1}, Lcom/join/mgps/va/overmind/d;->K(Landroid/content/pm/ApplicationInfo;)Z

    move-result v2

    if-eqz v2, :cond_9

    const-string v2, "android.permission.READ_PHONE_STATE"

    const-string v3, "android.permission.WRITE_EXTERNAL_STORAGE"

    const-string v4, "android.permission.READ_EXTERNAL_STORAGE"

    .line 31
    filled-new-array {v2, v3, v4}, [Ljava/lang/String;

    move-result-object v6

    .line 32
    invoke-virtual {v12, v6, v15}, Lcom/join/mgps/va/overmind/d;->i([Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_9

    const/16 v10, 0x3e8

    .line 33
    invoke-direct {v12, v0, v1}, Lcom/join/mgps/va/overmind/d;->Z(Landroid/content/Context;Landroid/content/pm/ApplicationInfo;)Ljava/lang/String;

    move-result-object v7

    .line 34
    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_7

    .line 35
    move-object v15, v0

    check-cast v15, Landroid/app/Activity;

    goto :goto_3

    :cond_7
    const/4 v15, 0x0

    :goto_3
    if-nez v15, :cond_8

    .line 36
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v0}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v0

    move-object v5, v0

    goto :goto_4

    :cond_8
    move-object v5, v15

    .line 37
    :goto_4
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 38
    sget v8, Lcom/join/mgps/va/overmind/d;->h:I

    .line 39
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v9

    .line 40
    invoke-static/range {v5 .. v10}, Lcom/join/mgps/va/activity/PermissionRequestActivity;->b(Landroid/app/Activity;[Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    return-void

    .line 41
    :cond_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 42
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 43
    sget v2, Lcom/join/mgps/va/overmind/d;->h:I

    .line 44
    invoke-virtual {v12, v1, v2}, Lcom/join/mgps/va/overmind/d;->w(Ljava/lang/String;I)I

    move-result v1

    .line 45
    invoke-virtual/range {p3 .. p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isMiniGame()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 46
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/join/mgps/activity/MiniGameLoadingActivity_;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_6

    :cond_a
    const/4 v2, 0x7

    if-eq v2, v1, :cond_c

    const/4 v2, 0x1

    if-ne v2, v1, :cond_b

    goto :goto_5

    .line 47
    :cond_b
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/join/mgps/mod/activity/ModLoadingLandActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_6

    .line 48
    :cond_c
    :goto_5
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/join/mgps/mod/activity/ModLoadingActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    :goto_6
    const-string v2, "gameId"

    .line 49
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getGameId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "packageName"

    .line 50
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "modPath"

    .line 51
    iget-object v3, v12, Lcom/join/mgps/va/overmind/d;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "modVersion"

    .line 52
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getModVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "modCode"

    .line 53
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getModCode()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v2, "modType"

    .line 54
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getModType()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v2, "typeId"

    .line 55
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/mod/bean/ModMeta;->getTypeId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 56
    invoke-virtual/range {p3 .. p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isMiniGame()Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, "_mod_info"

    if-eqz v2, :cond_d

    .line 57
    :try_start_1
    invoke-virtual/range {p3 .. p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "isLaunchApp"

    const/4 v3, 0x1

    .line 58
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    goto :goto_7

    .line 59
    :cond_d
    sget-object v2, Lcom/join/android/app/common/utils/APKUtils;->a:Lcom/join/android/app/common/utils/APKUtils$Companion;

    invoke-virtual {v2, v14}, Lcom/join/android/app/common/utils/APKUtils$Companion;->y(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v4

    if-eqz v4, :cond_e

    .line 60
    invoke-virtual/range {p3 .. p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSingle_game_mod_info()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_7

    .line 61
    :cond_e
    invoke-virtual {v2, v14}, Lcom/join/android/app/common/utils/APKUtils$Companion;->v(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 62
    invoke-virtual/range {p3 .. p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 63
    :cond_f
    :goto_7
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const/16 v1, 0xc

    .line 64
    invoke-virtual/range {p3 .. p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/join/mgps/Util/UtilsMy;->T1(Landroid/content/Context;ILjava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_a

    :cond_10
    :goto_8
    return-void

    .line 65
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_a
    return-void
.end method

.method public final X(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "launchApp "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v3, Lcom/join/mgps/va/overmind/d;->h:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 3
    sget v0, Lcom/join/mgps/va/overmind/d;->h:I

    invoke-virtual {p0, p1, v0, p2}, Lcom/join/mgps/va/overmind/d;->U(Landroid/content/Context;ILjava/lang/String;)V

    return-void
.end method

.method public final a0(Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)Ljava/lang/Object;
    .locals 29
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p3

    const-string v0, "targetVersion"

    const-string v10, "load mod"

    const-string v2, "packageName"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v2

    const/4 v11, 0x0

    if-nez v2, :cond_0

    return-object v11

    .line 2
    :cond_0
    :try_start_0
    sget-object v2, Lcom/join/mgps/va/overmind/VApp;->Companion:Lcom/join/mgps/va/overmind/VApp$a;

    invoke-virtual {v2}, Lcom/join/mgps/va/overmind/VApp$a;->a()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/mod/utils/PluginConfig;->getLastLaunchPkg(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    return-object v11

    .line 4
    :cond_1
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v3

    new-instance v4, Landroid/content/Intent;

    const-string v5, "com.join.android.app.mgsim.wufun.loadMod"

    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 5
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/va/overmind/d;->L()Z

    move-result v3

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v3, :cond_2

    invoke-virtual/range {p0 .. p1}, Lcom/join/mgps/va/overmind/d;->N(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v14, 0x1

    goto :goto_0

    :cond_2
    const/4 v14, 0x0

    :goto_0
    const/4 v15, 0x2

    new-array v3, v15, [Ljava/lang/String;

    aput-object v10, v3, v13

    .line 6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "packageName="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", lastLaunchPackage="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v3, v12

    .line 7
    invoke-static {v3}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 8
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->is64Bit()Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/va/overmind/f;->a:Lcom/join/mgps/va/overmind/f;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/16 v16, 0x0

    move-object/from16 v3, p1

    move-object v12, v7

    move-object/from16 v7, v16

    invoke-static/range {v2 .. v7}, Lcom/join/mgps/va/overmind/f;->l(Lcom/join/mgps/va/overmind/f;Ljava/lang/String;IZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/arm64"

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_3
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    sget-object v2, Lcom/join/mgps/va/overmind/f;->a:Lcom/join/mgps/va/overmind/f;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object/from16 v3, p1

    invoke-static/range {v2 .. v7}, Lcom/join/mgps/va/overmind/f;->l(Lcom/join/mgps/va/overmind/f;Ljava/lang/String;IZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 10
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/arm"

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :goto_2
    if-eqz v14, :cond_4

    .line 11
    sget-object v3, Lcom/join/mgps/va/overmind/f;->a:Lcom/join/mgps/va/overmind/f;

    invoke-static {v3, v8, v13, v15, v11}, Lcom/join/mgps/va/overmind/f;->K(Lcom/join/mgps/va/overmind/f;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 12
    invoke-static {v3, v8, v13, v15, v11}, Lcom/join/mgps/va/overmind/f;->V(Lcom/join/mgps/va/overmind/f;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    .line 13
    :cond_4
    sget-object v3, Lcom/join/mgps/va/overmind/f;->a:Lcom/join/mgps/va/overmind/f;

    invoke-static {v3, v8, v13, v15, v11}, Lcom/join/mgps/va/overmind/f;->H(Lcom/join/mgps/va/overmind/f;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 14
    invoke-static {v3, v8, v13, v15, v11}, Lcom/join/mgps/va/overmind/f;->S(Lcom/join/mgps/va/overmind/f;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :goto_3
    if-eqz v4, :cond_6

    .line 15
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    if-nez v5, :cond_5

    goto :goto_4

    :cond_5
    const/4 v5, 0x0

    goto :goto_5

    :cond_6
    :goto_4
    const/4 v5, 0x1

    :goto_5
    const-string v6, "wufun"

    const-string v7, ""

    const-string v12, "0"

    if-nez v5, :cond_a

    :try_start_1
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_a

    .line 16
    invoke-static {v4}, Lcom/join/mgps/mod/utils/PluginConfig;->getModPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    :try_start_2
    const-string v11, "getModPath(cfgPath)"

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v1, Lcom/join/mgps/va/overmind/d;->c:Ljava/lang/String;

    .line 17
    invoke-static {v4}, Lcom/join/mgps/mod/utils/PluginConfig;->getSoVersion(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v1, Lcom/join/mgps/va/overmind/d;->d:Ljava/lang/String;

    .line 18
    invoke-static {v4}, Lcom/join/mgps/mod/utils/PluginConfig;->getSoCode(Ljava/lang/String;)I

    move-result v5

    iput v5, v1, Lcom/join/mgps/va/overmind/d;->e:I

    .line 19
    invoke-static {v4}, Lcom/join/mgps/mod/utils/PluginConfig;->getModGameId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v11, "getModGameId(cfgPath)"

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-static {v4}, Lcom/join/mgps/mod/utils/PluginConfig;->getModMenuSwitch(Ljava/lang/String;)Lcom/join/mgps/Util/u$c;

    move-result-object v11

    if-eqz v11, :cond_7

    const-string v13, "goldFingerSwitch"

    .line 21
    invoke-virtual {v11, v13}, Lcom/join/mgps/Util/u$c;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v15, "archiveCloudSwitch"

    .line 22
    invoke-virtual {v11, v15}, Lcom/join/mgps/Util/u$c;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v17, v5

    const-string v5, "introductionSwitch"

    .line 23
    invoke-virtual {v11, v5}, Lcom/join/mgps/Util/u$c;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_6

    :cond_7
    move-object/from16 v17, v5

    move-object v5, v12

    move-object v13, v5

    move-object v15, v13

    .line 24
    :goto_6
    invoke-static {v4}, Lcom/join/mgps/mod/utils/PluginConfig;->getModConfig(Ljava/lang/String;)Lcom/join/mgps/Util/u$c;

    move-result-object v4

    if-eqz v4, :cond_9

    const-string v6, "channelNum"

    .line 25
    invoke-virtual {v4, v6}, Lcom/join/mgps/Util/u$c;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v6, "configSection[\"channelNum\"]"

    invoke-static {v12, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-virtual {v4, v0}, Lcom/join/mgps/Util/u$c;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v6
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    if-eqz v6, :cond_8

    .line 27
    :try_start_3
    invoke-virtual {v4, v0}, Lcom/join/mgps/Util/u$c;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v6, "configSection[\"targetVersion\"]"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_7

    :catch_0
    move-exception v0

    .line 28
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_8
    const/4 v0, 0x0

    :goto_7
    const-string v6, "androidId"

    .line 29
    invoke-virtual {v4, v6}, Lcom/join/mgps/Util/u$c;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v6, "platform"

    .line 30
    invoke-virtual {v4, v6}, Lcom/join/mgps/Util/u$c;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v11, "package_type"

    .line 31
    invoke-virtual {v4, v11}, Lcom/join/mgps/Util/u$c;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    move/from16 v18, v0

    const-string v0, "configSection[\"package_type\"]"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeId"

    .line 32
    invoke-virtual {v4, v0}, Lcom/join/mgps/Util/u$c;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "configSection[\"typeId\"]"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v19, v0

    move-object v4, v6

    move-object v6, v11

    move/from16 v0, v18

    move-object v11, v5

    move-object v5, v7

    move-object/from16 v7, v17

    move-object/from16 v28, v13

    move-object v13, v12

    move-object/from16 v12, v28

    goto :goto_8

    :cond_9
    move-object v11, v5

    move-object v4, v6

    move-object v5, v7

    move-object/from16 v19, v12

    move-object/from16 v7, v17

    const/4 v0, 0x0

    move-object v12, v13

    move-object/from16 v13, v19

    goto :goto_8

    :cond_a
    move-object v4, v6

    move-object v5, v7

    move-object v11, v12

    move-object v13, v11

    move-object v15, v13

    move-object/from16 v19, v15

    const/4 v0, 0x0

    :goto_8
    if-eqz v14, :cond_b

    .line 33
    iget-object v14, v1, Lcom/join/mgps/va/overmind/d;->c:Ljava/lang/String;

    move/from16 v17, v0

    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getPluginPkg()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v18, v4

    const-string v4, "getPluginPkg()"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    move-object/from16 v21, v5

    move-object/from16 v20, v6

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    :try_start_5
    invoke-static {v14, v0, v6, v4, v5}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    if-nez v0, :cond_c

    .line 34
    :try_start_6
    sget-object v0, Lcom/join/mgps/va/overmind/d;->g:Lcom/join/mgps/va/overmind/d$a;

    iget-object v4, v1, Lcom/join/mgps/va/overmind/d;->c:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/join/mgps/va/overmind/d$a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/join/mgps/va/overmind/d;->c:Ljava/lang/String;

    goto :goto_9

    :catch_1
    move-exception v0

    move-object v4, v5

    goto/16 :goto_b

    :cond_b
    move/from16 v17, v0

    move-object/from16 v18, v4

    move-object/from16 v21, v5

    move-object/from16 v20, v6

    :cond_c
    :goto_9
    const/4 v4, 0x2

    new-array v0, v4, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v10, v0, v4

    .line 35
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "modPath="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Lcom/join/mgps/va/overmind/d;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v0, v5

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 36
    iget-object v0, v1, Lcom/join/mgps/va/overmind/d;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/4 v4, 0x0

    return-object v4

    .line 37
    :cond_d
    iget-object v0, v1, Lcom/join/mgps/va/overmind/d;->c:Ljava/lang/String;

    invoke-virtual {v1, v9, v0}, Lcom/join/mgps/va/overmind/d;->P(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lcom/join/mgps/va/overmind/d;->i:Z

    .line 38
    new-instance v4, Lcom/join/mgps/mod/utils/b;

    if-eqz v0, :cond_e

    move-object v0, v2

    goto :goto_a

    :cond_e
    move-object v0, v3

    :goto_a
    invoke-direct {v4, v9, v0}, Lcom/join/mgps/mod/utils/b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v4, v1, Lcom/join/mgps/va/overmind/d;->f:Lcom/join/mgps/mod/utils/b;

    .line 39
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/join/mgps/mod/utils/b;->j()Z

    move-result v0

    if-nez v0, :cond_10

    .line 40
    iget-object v0, v1, Lcom/join/mgps/va/overmind/d;->f:Lcom/join/mgps/mod/utils/b;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v4, v1, Lcom/join/mgps/va/overmind/d;->c:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/join/mgps/mod/utils/b;->k(Ljava/lang/String;)V

    .line 41
    iget-object v0, v1, Lcom/join/mgps/va/overmind/d;->f:Lcom/join/mgps/mod/utils/b;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/join/mgps/mod/utils/b;->j()Z

    move-result v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    if-nez v0, :cond_f

    const/4 v4, 0x0

    return-object v4

    :cond_f
    const/4 v4, 0x0

    .line 42
    :try_start_7
    new-instance v0, Lcom/join/mgps/mod/bean/ModMeta;

    invoke-direct {v0}, Lcom/join/mgps/mod/bean/ModMeta;-><init>()V

    .line 43
    sget-object v5, Lcom/join/mgps/va/overmind/VApp;->Companion:Lcom/join/mgps/va/overmind/VApp$a;

    invoke-virtual {v5}, Lcom/join/mgps/va/overmind/VApp$a;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/app/Application;

    move-object/from16 v6, p2

    .line 44
    invoke-virtual {v0, v5, v8, v6, v9}, Lcom/join/mgps/mod/bean/ModMeta;->bind(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V

    .line 45
    iget-object v5, v1, Lcom/join/mgps/va/overmind/d;->c:Ljava/lang/String;

    .line 46
    iget-object v6, v1, Lcom/join/mgps/va/overmind/d;->f:Lcom/join/mgps/mod/utils/b;

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lcom/join/mgps/mod/utils/b;->h()Landroid/content/pm/PackageInfo;

    move-result-object v24

    .line 47
    iget-object v6, v1, Lcom/join/mgps/va/overmind/d;->f:Lcom/join/mgps/mod/utils/b;

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lcom/join/mgps/mod/utils/b;->e()Ldalvik/system/DexClassLoader;

    move-result-object v25

    .line 48
    iget-object v6, v1, Lcom/join/mgps/va/overmind/d;->f:Lcom/join/mgps/mod/utils/b;

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lcom/join/mgps/mod/utils/b;->getResources()Landroid/content/res/Resources;

    move-result-object v26

    .line 49
    iget-object v6, v1, Lcom/join/mgps/va/overmind/d;->f:Lcom/join/mgps/mod/utils/b;

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lcom/join/mgps/mod/utils/b;->f()Ljava/lang/String;

    move-result-object v27

    move-object/from16 v22, v0

    move-object/from16 v23, v5

    .line 50
    invoke-virtual/range {v22 .. v27}, Lcom/join/mgps/mod/bean/ModMeta;->setModInfo(Ljava/lang/String;Landroid/content/pm/PackageInfo;Ldalvik/system/DexClassLoader;Landroid/content/res/Resources;Ljava/lang/String;)V

    .line 51
    iget-object v5, v1, Lcom/join/mgps/va/overmind/d;->f:Lcom/join/mgps/mod/utils/b;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lcom/join/mgps/mod/utils/b;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/join/mgps/mod/bean/ModMeta;->setEntryDataClass(Ljava/lang/String;)V

    .line 52
    invoke-virtual {v0, v7}, Lcom/join/mgps/mod/bean/ModMeta;->setGameId(Ljava/lang/String;)V

    .line 53
    sget-boolean v5, Lcom/join/mgps/va/overmind/d;->i:Z

    invoke-virtual {v0, v5}, Lcom/join/mgps/mod/bean/ModMeta;->setUseNativeLibDir(Z)V

    .line 54
    invoke-virtual {v0, v2}, Lcom/join/mgps/mod/bean/ModMeta;->setNativeLibDir(Ljava/lang/String;)V

    .line 55
    invoke-virtual {v0, v3}, Lcom/join/mgps/mod/bean/ModMeta;->setPluginLibDir(Ljava/lang/String;)V

    .line 56
    iget-object v2, v1, Lcom/join/mgps/va/overmind/d;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/join/mgps/mod/bean/ModMeta;->setModVersion(Ljava/lang/String;)V

    .line 57
    iget v2, v1, Lcom/join/mgps/va/overmind/d;->e:I

    invoke-virtual {v0, v2}, Lcom/join/mgps/mod/bean/ModMeta;->setModCode(I)V

    .line 58
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMainPkg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/mod/bean/ModMeta;->setHostPackage(Ljava/lang/String;)V

    .line 59
    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getUserId()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/mod/bean/ModMeta;->setUserId(I)V

    .line 60
    invoke-virtual {v0, v12}, Lcom/join/mgps/mod/bean/ModMeta;->setGoldFingerSwitch(Ljava/lang/String;)V

    .line 61
    invoke-virtual {v0, v15}, Lcom/join/mgps/mod/bean/ModMeta;->setArchiveCloudSwitch(Ljava/lang/String;)V

    .line 62
    invoke-virtual {v0, v11}, Lcom/join/mgps/mod/bean/ModMeta;->setIntroductionSwitch(Ljava/lang/String;)V

    .line 63
    invoke-virtual {v0, v13}, Lcom/join/mgps/mod/bean/ModMeta;->setChannelNum(Ljava/lang/String;)V

    move-object/from16 v7, v21

    .line 64
    invoke-virtual {v0, v7}, Lcom/join/mgps/mod/bean/ModMeta;->setAndroidId(Ljava/lang/String;)V

    move-object/from16 v6, v20

    .line 65
    invoke-virtual {v0, v6}, Lcom/join/mgps/mod/bean/ModMeta;->setPackage_type(Ljava/lang/String;)V

    move-object/from16 v6, v18

    .line 66
    invoke-virtual {v0, v6}, Lcom/join/mgps/mod/bean/ModMeta;->setPlatform(Ljava/lang/String;)V

    move/from16 v2, v17

    .line 67
    invoke-virtual {v0, v2}, Lcom/join/mgps/mod/bean/ModMeta;->setTarget_version(I)V

    move-object/from16 v12, v19

    .line 68
    invoke-virtual {v0, v12}, Lcom/join/mgps/mod/bean/ModMeta;->setTypeId(Ljava/lang/String;)V

    .line 69
    iget-object v2, v1, Lcom/join/mgps/va/overmind/d;->f:Lcom/join/mgps/mod/utils/b;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, Lcom/join/mgps/mod/utils/b;->n(Lcom/join/mgps/mod/bean/ModMeta;)Ljava/lang/Object;

    move-result-object v11
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    goto :goto_d

    :catch_2
    move-exception v0

    goto :goto_b

    :cond_10
    const/4 v4, 0x0

    goto :goto_c

    :catch_3
    move-exception v0

    const/4 v4, 0x0

    goto :goto_b

    :catch_4
    move-exception v0

    move-object v4, v11

    .line 70
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_c
    move-object v11, v4

    :goto_d
    return-object v11
.end method

.method public final c0(I)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0}, Lcom/xinzhu/overmind/Overmind;->getUsers()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/xinzhu/overmind/server/user/MindUserInfo;

    .line 4
    iget v4, v3, Lcom/xinzhu/overmind/server/user/MindUserInfo;->b:I

    if-ne v4, p1, :cond_1

    move-object v1, v3

    goto :goto_0

    :cond_2
    if-nez v1, :cond_4

    .line 5
    invoke-virtual {v0, p1}, Lcom/xinzhu/overmind/Overmind;->createUser(I)Lcom/xinzhu/overmind/server/user/MindUserInfo;

    move-result-object p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_4
    :goto_1
    return-void
.end method

.method public final d0()V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/xinzhu/datatransfer/b;->a()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getPluginPkg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/xinzhu/overmind/Overmind;->isPkgInstalledOutside(Ljava/lang/String;)Z

    move-result v0

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->L()Z

    move-result v1

    if-nez v1, :cond_1

    if-nez v0, :cond_1

    .line 5
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xinzhu/overmind/Overmind;->doTransferInstalls()V

    return-void

    .line 6
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->M()Z

    move-result v0

    if-nez v0, :cond_2

    .line 7
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xinzhu/overmind/Overmind;->doTransferInstallsOnlyForMainPackage()V

    return-void

    .line 8
    :cond_2
    invoke-static {}, Lcom/xinzhu/overmind/a;->h()Ljava/io/File;

    move-result-object v0

    .line 9
    invoke-static {}, Lcom/xinzhu/overmind/a;->i()Ljava/io/File;

    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/xinzhu/overmind/plugin/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xinzhu/overmind/Overmind;->doTransferInstalls()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_0
    return-void
.end method

.method public final e()V
    .locals 0

    return-void
.end method

.method public final e0(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "targetPkg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/xinzhu/datatransfer/b;->a()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->L()Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object p1

    invoke-virtual {p1}, Lcom/xinzhu/overmind/Overmind;->doTransferInstalls()V

    return-void

    .line 5
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->M()Z

    move-result v0

    if-nez v0, :cond_2

    .line 6
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object p1

    invoke-virtual {p1}, Lcom/xinzhu/overmind/Overmind;->doTransferInstallsOnlyForMainPackage()V

    return-void

    .line 7
    :cond_2
    invoke-static {p1}, Lcom/xinzhu/overmind/a;->d(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    .line 8
    invoke-static {}, Lcom/xinzhu/overmind/a;->i()Ljava/io/File;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/xinzhu/overmind/plugin/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object p1

    invoke-virtual {p1}, Lcom/xinzhu/overmind/Overmind;->doTransferInstalls()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_0
    return-void
.end method

.method public final f(Ljava/lang/String;I)Z
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-nez v2, :cond_c

    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_6

    .line 2
    :cond_2
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v2

    .line 3
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/xinzhu/overmind/client/frameworks/g;->k(Ljava/lang/String;)Lcom/xinzhu/overmind/server/pm/MindPackageSettings;

    move-result-object v3

    if-nez v3, :cond_3

    return v1

    .line 4
    :cond_3
    invoke-virtual {v3}, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->f()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-nez v4, :cond_5

    goto :goto_2

    .line 5
    :cond_5
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, p2, :cond_4

    const/4 v1, 0x1

    goto :goto_2

    :cond_6
    if-nez v1, :cond_b

    const/4 v3, 0x0

    .line 6
    invoke-virtual {v2}, Lcom/xinzhu/overmind/Overmind;->getUsers()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/xinzhu/overmind/server/user/MindUserInfo;

    .line 7
    iget v6, v5, Lcom/xinzhu/overmind/server/user/MindUserInfo;->b:I

    if-ne v6, p2, :cond_7

    move-object v3, v5

    goto :goto_3

    :cond_8
    if-nez v3, :cond_a

    .line 8
    invoke-virtual {v2, p2}, Lcom/xinzhu/overmind/Overmind;->createUser(I)Lcom/xinzhu/overmind/server/user/MindUserInfo;

    move-result-object v3

    if-eqz v3, :cond_9

    goto :goto_4

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 9
    :cond_a
    :goto_4
    invoke-virtual {v2, p1, p2}, Lcom/xinzhu/overmind/Overmind;->installPackageAsUser_Exist(Ljava/lang/String;I)Lcom/xinzhu/overmind/entity/pm/InstallResult;

    move-result-object p1

    .line 10
    iget-boolean p1, p1, Lcom/xinzhu/overmind/entity/pm/InstallResult;->b:Z

    if-eqz p1, :cond_b

    goto :goto_5

    :cond_b
    move v0, v1

    :goto_5
    return v0

    :cond_c
    :goto_6
    return v1
.end method

.method public final g(Landroid/content/Context;)Z
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x17
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->isPluginPkgInstalled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    invoke-static {}, Lcom/xinzhu/overmind/plugin/b;->i()Z

    move-result v0

    if-nez v0, :cond_2

    .line 4
    invoke-static {p1}, Lcom/overmind/virtual/oem/a;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public final h(Ljava/lang/String;)J
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_1

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    const-wide/16 v1, 0x0

    if-eqz v0, :cond_2

    return-wide v1

    .line 2
    :cond_2
    invoke-static {p1}, Lcom/xinzhu/overmind/plugin/b;->b(Ljava/lang/String;)Lcom/xinzhu/overmind/server/os/MindShareFileInfo;

    move-result-object v0

    if-nez v0, :cond_3

    return-wide v1

    .line 3
    :cond_3
    iget-object v3, v0, Lcom/xinzhu/overmind/server/os/MindShareFileInfo;->d:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_4

    .line 4
    iget-wide v0, v0, Lcom/xinzhu/overmind/server/os/MindShareFileInfo;->e:J

    return-wide v0

    .line 5
    :cond_4
    :try_start_0
    invoke-static {p1}, Lcom/xinzhu/overmind/plugin/b;->m(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    .line 6
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/xinzhu/overmind/server/os/MindShareFileInfo;

    .line 7
    iget-object v3, v0, Lcom/xinzhu/overmind/server/os/MindShareFileInfo;->c:Ljava/lang/Boolean;

    const-string v4, "file.exists"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, v0, Lcom/xinzhu/overmind/server/os/MindShareFileInfo;->d:Ljava/lang/Boolean;

    const-string v4, "file.isDirectory"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 8
    iget-object v0, v0, Lcom/xinzhu/overmind/server/os/MindShareFileInfo;->b:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/join/mgps/va/overmind/d;->h(Ljava/lang/String;)J

    move-result-wide v3

    goto :goto_3

    .line 9
    :cond_6
    iget-object v0, v0, Lcom/xinzhu/overmind/server/os/MindShareFileInfo;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/xinzhu/overmind/plugin/b;->b(Ljava/lang/String;)Lcom/xinzhu/overmind/server/os/MindShareFileInfo;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 10
    iget-wide v3, v0, Lcom/xinzhu/overmind/server/os/MindShareFileInfo;->e:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_3
    add-long/2addr v1, v3

    goto :goto_2

    :catch_0
    :cond_7
    return-wide v1
.end method

.method public final i([Ljava/lang/String;Z)Z
    .locals 2
    .param p1    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    .line 1
    :cond_0
    invoke-static {p1}, Lkotlin/jvm/internal/ArrayIteratorKt;->iterator([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 2
    invoke-virtual {p0, v1, p2}, Lcom/join/mgps/va/overmind/d;->j(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_2
    return v0
.end method

.method public final i0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "packageName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "abi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/join/mgps/va/overmind/d;->k0(Lcom/join/mgps/va/overmind/d;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)V

    return-void
.end method

.method public final j(Ljava/lang/String;Z)Z
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_3

    goto :goto_3

    .line 3
    :cond_3
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    if-eqz p2, :cond_4

    const-string p2, "com.join.android.app.mgsim.wufun.addon"

    .line 4
    invoke-virtual {v2, p1, p2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_5

    goto :goto_2

    :cond_4
    const-string p2, "com.join.android.app.mgsim.wufun"

    .line 5
    invoke-virtual {v2, p1, p2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_5

    :goto_2
    const/4 v1, 0x1

    :cond_5
    :goto_3
    return v1
.end method

.method public final j0(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string p3, "packageName"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "abi"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result p3

    if-nez p3, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/xinzhu/overmind/client/frameworks/g;->k(Ljava/lang/String;)Lcom/xinzhu/overmind/server/pm/MindPackageSettings;

    move-result-object p3

    if-nez p3, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-virtual {p3}, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->k()Z

    .line 4
    sget-object v0, Lcom/join/mgps/va/overmind/b;->a:Lcom/join/mgps/va/overmind/b$a;

    invoke-virtual {v0, p2}, Lcom/join/mgps/va/overmind/b$a;->f(Ljava/lang/String;)Z

    move-result p2

    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->is64Bit()Z

    move-result v0

    if-ne p2, v0, :cond_2

    const/4 p2, 0x0

    goto :goto_0

    :cond_2
    const/4 p2, 0x1

    .line 5
    :goto_0
    invoke-virtual {p3}, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->k()Z

    move-result p3

    if-eq p2, p3, :cond_3

    .line 6
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lcom/xinzhu/overmind/client/frameworks/g;->D(Ljava/lang/String;Z)V

    :cond_3
    return-void
.end method

.method public final l0(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_2

    .line 2
    :try_start_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    return-void

    .line 3
    :cond_3
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/xinzhu/overmind/client/frameworks/g;->k(Ljava/lang/String;)Lcom/xinzhu/overmind/server/pm/MindPackageSettings;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 4
    invoke-virtual {v0}, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    const-string v2, "userId"

    .line 5
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {p0, p1, v1}, Lcom/join/mgps/va/overmind/d;->k(Ljava/lang/String;I)V

    goto :goto_2

    .line 6
    :cond_4
    invoke-static {}, Lb2/g;->t()Lb2/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lb2/g;->n(Ljava/lang/String;)V

    .line 7
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/xinzhu/overmind/Overmind;->uninstallPackage(Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Lcom/join/mgps/va/overmind/d;->f0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    .line 9
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_4
    return-void
.end method

.method public final m(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V
    .locals 18
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    move-object/from16 v0, p1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move/from16 v9, p5

    const-string v10, ""

    const-string v11, "com.join.android.app.mgsim.wufun.soCopyFinish"

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "packageName"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "modPath"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    :try_start_0
    new-instance v12, Ljava/io/File;

    sget-object v13, Lcom/join/mgps/va/overmind/f;->a:Lcom/join/mgps/va/overmind/f;

    const/4 v14, 0x0

    const/4 v15, 0x2

    const/4 v6, 0x0

    invoke-static {v13, v7, v6, v15, v14}, Lcom/join/mgps/va/overmind/f;->H(Lcom/join/mgps/va/overmind/f;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v12, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v12}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v12}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 3
    :cond_0
    new-instance v5, Ljava/io/File;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v16, 0x6

    const/16 v17, 0x0

    move-object v1, v13

    move-object/from16 v2, p2

    move-object v14, v5

    move/from16 v5, v16

    const/4 v15, 0x0

    move-object/from16 v6, v17

    invoke-static/range {v1 .. v6}, Lcom/join/mgps/va/overmind/f;->l(Lcom/join/mgps/va/overmind/f;Ljava/lang/String;IZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v14, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v14}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v14}, Ljava/io/File;->mkdirs()Z

    .line 5
    :cond_1
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->is64Bit()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/arm64"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/arm"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v3, v1

    .line 6
    new-instance v1, Ljava/io/File;

    const/4 v2, 0x0

    const/4 v4, 0x2

    invoke-static {v13, v7, v15, v4, v2}, Lcom/join/mgps/va/overmind/f;->S(Lcom/join/mgps/va/overmind/f;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    move-object/from16 v6, p0

    .line 8
    :try_start_1
    invoke-virtual {v6, v0, v8}, Lcom/join/mgps/va/overmind/d;->P(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lcom/join/mgps/va/overmind/d;->i:Z

    .line 9
    new-instance v0, Ljava/io/File;

    const-string v2, "soloaded.txt"

    invoke-direct {v0, v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 11
    :cond_4
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 13
    invoke-static {}, Lcom/join/mgps/mod/utils/e;->d()Lcom/join/mgps/mod/utils/e;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/join/mgps/mod/utils/e;->g(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 14
    new-instance v0, Ljava/io/File;

    sget-boolean v2, Lcom/join/mgps/va/overmind/d;->i:Z

    if-eqz v2, :cond_5

    move-object v2, v3

    goto :goto_1

    :cond_5
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    if-eqz v5, :cond_7

    .line 15
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_2

    :cond_6
    const/4 v4, 0x0

    goto :goto_3

    :cond_7
    :goto_2
    const/4 v4, 0x1

    :goto_3
    if-eqz v4, :cond_8

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_8

    .line 16
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 17
    :cond_8
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v4, 0x0

    :goto_4
    if-ge v4, v0, :cond_c

    .line 18
    new-instance v7, Ljava/io/File;

    .line 19
    sget-boolean v13, Lcom/join/mgps/va/overmind/d;->i:Z

    if-eqz v13, :cond_9

    move-object v13, v3

    goto :goto_5

    :cond_9
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v13

    .line 20
    :goto_5
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .line 21
    invoke-direct {v7, v13, v14}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v13

    if-eqz v13, :cond_b

    invoke-virtual {v7}, Ljava/io/File;->isFile()Z

    move-result v7

    if-nez v7, :cond_a

    goto :goto_6

    :cond_a
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_b
    :goto_6
    const/4 v0, 0x1

    goto :goto_7

    :cond_c
    const/4 v0, 0x0

    .line 23
    :goto_7
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/mod/utils/PluginConfig;->getSoCode(Ljava/lang/String;)I

    move-result v4

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/String;

    .line 24
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "mod info: localCode="

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    aput-object v13, v7, v15

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "srvCode="

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    aput-object v13, v7, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "lackSo="

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v13, 0x2

    aput-object v2, v7, v13

    invoke-static {v7}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    if-eqz v4, :cond_d

    if-ne v4, v9, :cond_d

    if-nez v0, :cond_d

    .line 25
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v11}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 26
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v11}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void

    .line 27
    :cond_d
    :try_start_2
    sget-boolean v0, Lcom/join/mgps/va/overmind/d;->i:Z

    if-eqz v0, :cond_e

    invoke-static {}, Lcom/join/mgps/mod/utils/e;->d()Lcom/join/mgps/mod/utils/e;

    move-result-object v0

    const/4 v2, 0x0

    .line 28
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    move-object v1, v2

    move-object/from16 v2, p3

    .line 29
    invoke-virtual/range {v0 .. v5}, Lcom/join/mgps/mod/utils/e;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_8

    .line 30
    :cond_e
    invoke-static {}, Lcom/join/mgps/mod/utils/e;->d()Lcom/join/mgps/mod/utils/e;

    move-result-object v0

    .line 31
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v8, v1}, Lcom/join/mgps/mod/utils/e;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    :goto_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move/from16 v3, p5

    .line 34
    invoke-static/range {v0 .. v5}, Lcom/join/mgps/mod/utils/PluginConfig;->setModConfig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJ)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 35
    :cond_f
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v11}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_a

    :catch_0
    move-exception v0

    goto :goto_9

    :catchall_0
    move-exception v0

    move-object/from16 v6, p0

    goto :goto_b

    :catch_1
    move-exception v0

    move-object/from16 v6, p0

    .line 36
    :goto_9
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 37
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.join.android.app.mgsim.wufun.soCopyFail"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :goto_a
    return-void

    :catchall_1
    move-exception v0

    .line 38
    :goto_b
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, v11}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_d

    :goto_c
    throw v0

    :goto_d
    goto :goto_c
.end method

.method public final m0(Ljava/lang/String;I)Z
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-eqz p1, :cond_2

    .line 2
    :try_start_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_3

    return v1

    .line 3
    :cond_3
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Lcom/xinzhu/overmind/Overmind;->uninstallPackageAsUser(Ljava/lang/String;I)V

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/va/overmind/d;->f0()V

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/va/overmind/d;->k(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    .line 6
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return v1
.end method

.method public final n0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 2
    :try_start_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-nez v2, :cond_6

    if-eqz p2, :cond_4

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :cond_4
    :goto_2
    if-eqz v0, :cond_5

    goto :goto_4

    .line 3
    :cond_5
    sget-object v0, Lcom/join/mgps/va/overmind/d;->g:Lcom/join/mgps/va/overmind/d$a;

    invoke-virtual {v0}, Lcom/join/mgps/va/overmind/d$a;->d()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/va/overmind/d;->N(Ljava/lang/String;)Z

    move-result v0

    .line 4
    sget-object v2, Lcom/join/mgps/va/overmind/f;->a:Lcom/join/mgps/va/overmind/f;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v2, p1, v1, v3, v4}, Lcom/join/mgps/va/overmind/f;->H(Lcom/join/mgps/va/overmind/f;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-static {v1, p2}, Lcom/join/mgps/mod/utils/PluginConfig;->setModGameId(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_6

    .line 6
    sget-object v2, Lcom/join/mgps/va/overmind/h;->a:Lcom/join/mgps/va/overmind/h$a;

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v2 .. v7}, Lcom/join/mgps/va/overmind/h$a;->e(Lcom/join/mgps/va/overmind/h$a;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    .line 7
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_6
    :goto_4
    return-void
.end method

.method public final o0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 12
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    move-object v0, p1

    const-string v1, "syncWriteModSwitch"

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    .line 2
    :cond_0
    :try_start_0
    sget-object v2, Lcom/join/mgps/va/overmind/d;->g:Lcom/join/mgps/va/overmind/d$a;

    invoke-virtual {v2}, Lcom/join/mgps/va/overmind/d$a;->d()Lcom/join/mgps/va/overmind/d;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/join/mgps/va/overmind/d;->N(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 3
    new-instance v1, Ljava/io/File;

    sget-object v2, Lcom/join/mgps/va/overmind/f;->a:Lcom/join/mgps/va/overmind/f;

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, p1, v3, v4, v5}, Lcom/join/mgps/va/overmind/f;->H(Lcom/join/mgps/va/overmind/f;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    .line 5
    invoke-static/range {v2 .. v11}, Lcom/join/mgps/mod/utils/PluginConfig;->setModConfig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v3, "start"

    .line 6
    filled-new-array {v1, v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 7
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "action"

    const-string v5, "writeModSwitch"

    .line 8
    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "userId"

    .line 9
    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getUserId()I

    move-result v5

    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v4, "packageName"

    .line 10
    invoke-virtual {v3, v4, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "goldSwitch"

    move-object v4, p2

    .line 11
    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "archiveSwitch"

    move-object v4, p3

    .line 12
    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "channelNum"

    move-object/from16 v4, p5

    .line 13
    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "targetVersion"

    move-object/from16 v4, p6

    .line 14
    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "androidId"

    move-object/from16 v4, p7

    .line 15
    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "platform"

    move-object/from16 v4, p8

    .line 16
    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "package_type"

    move-object/from16 v4, p9

    .line 17
    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "typeId"

    move-object/from16 v4, p10

    .line 18
    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_2

    .line 19
    sget-object v0, Lcom/join/mgps/va/overmind/h;->a:Lcom/join/mgps/va/overmind/h$a;

    invoke-virtual {v0, v3}, Lcom/join/mgps/va/overmind/h$a;->c(Landroid/os/Bundle;)V

    :cond_2
    const-string v0, "end"

    .line 20
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public final p(Z)Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Lcom/join/mgps/va/overmind/f;->a:Lcom/join/mgps/va/overmind/f;

    invoke-virtual {v0}, Lcom/join/mgps/va/overmind/f;->a0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/data"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 2
    :cond_0
    sget-object p1, Lcom/join/mgps/Util/v;->q:Ljava/lang/String;

    const-string v0, "PATH_ANDROID_DATA"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final q(Z)Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    sget-object p1, Lcom/join/mgps/va/overmind/f;->a:Lcom/join/mgps/va/overmind/f;

    invoke-virtual {p1}, Lcom/join/mgps/va/overmind/f;->a0()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 2
    :cond_0
    sget-object p1, Lcom/join/mgps/Util/v;->r:Ljava/lang/String;

    const-string v0, "PATH_ANDROID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final r(Z)Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Lcom/join/mgps/va/overmind/f;->a:Lcom/join/mgps/va/overmind/f;

    invoke-virtual {v0}, Lcom/join/mgps/va/overmind/f;->a0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/obb"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 2
    :cond_0
    sget-object p1, Lcom/join/mgps/Util/v;->p:Ljava/lang/String;

    const-string v0, "PATH_ANDROID_OBB"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final s(Ljava/lang/String;)Lf2/a;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "packageName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, p1, v0, v1, v2}, Lcom/join/mgps/va/overmind/d;->u(Lcom/join/mgps/va/overmind/d;Ljava/lang/String;IILjava/lang/Object;)Lf2/a;

    move-result-object p1

    return-object p1
.end method

.method public final t(Ljava/lang/String;I)Lf2/a;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "packageName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lf2/a;

    invoke-direct {v0}, Lf2/a;-><init>()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v1

    const-string v2, "tasks"

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v1, :cond_3

    .line 3
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    invoke-virtual {v1, p1}, Lp1/f;->H(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 4
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v5, 0x1

    :goto_1
    if-nez v5, :cond_3

    .line 5
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 7
    sget-object v6, Lcom/join/android/app/common/utils/APKUtils;->a:Lcom/join/android/app/common/utils/APKUtils$Companion;

    invoke-virtual {v6, v5}, Lcom/join/android/app/common/utils/APKUtils$Companion;->z(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 8
    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lf2/a;->e:Ljava/lang/CharSequence;

    .line 9
    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVerCode()I

    move-result p1

    iput p1, v0, Lf2/a;->k:I

    .line 10
    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer_name()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lf2/a;->l:Ljava/lang/String;

    .line 11
    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lf2/a;->a:Ljava/lang/String;

    return-object v0

    .line 12
    :cond_3
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v1

    invoke-virtual {v1, v4, p2}, Lcom/xinzhu/overmind/Overmind;->getInstalledPackages(II)Ljava/util/List;

    move-result-object p2

    .line 13
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/PackageInfo;

    .line 14
    iget-object v5, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    if-eqz v5, :cond_6

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    const/4 v5, 0x0

    goto :goto_3

    :cond_6
    :goto_2
    const/4 v5, 0x1

    :goto_3
    iget-object v6, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    xor-int/2addr v6, v3

    or-int/2addr v5, v6

    if-nez v5, :cond_4

    .line 15
    iget-object p1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object p1, v0, Lf2/a;->l:Ljava/lang/String;

    .line 16
    iget p1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    iput p1, v0, Lf2/a;->k:I

    .line 17
    iget-object p1, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iput-object p1, v0, Lf2/a;->a:Ljava/lang/String;

    .line 18
    :try_start_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object p1

    iget-object p2, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/xinzhu/overmind/client/frameworks/g;->k(Ljava/lang/String;)Lcom/xinzhu/overmind/server/pm/MindPackageSettings;

    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->k()Z

    move-result p1

    if-nez p1, :cond_7

    .line 20
    iget-object p1, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 21
    iput-object p1, v0, Lf2/a;->e:Ljava/lang/CharSequence;

    .line 22
    iget-object p1, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/pm/ApplicationInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, v0, Lf2/a;->d:Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_7
    :goto_4
    return-object v0

    .line 24
    :cond_8
    invoke-virtual {p0, p1}, Lcom/join/mgps/va/overmind/d;->N(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->L()Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->M()Z

    move-result p2

    if-nez p2, :cond_c

    .line 25
    new-instance p2, Lf2/a;

    invoke-direct {p2}, Lf2/a;-><init>()V

    .line 26
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/f;->H(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_a

    .line 27
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_5

    :cond_9
    const/4 v3, 0x0

    :cond_a
    :goto_5
    if-nez v3, :cond_c

    .line 28
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 30
    sget-object v1, Lcom/join/android/app/common/utils/APKUtils;->a:Lcom/join/android/app/common/utils/APKUtils$Companion;

    invoke-virtual {v1, v0}, Lcom/join/android/app/common/utils/APKUtils$Companion;->z(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 31
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p2, Lf2/a;->e:Ljava/lang/CharSequence;

    .line 32
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVerCode()I

    move-result p1

    iput p1, p2, Lf2/a;->k:I

    .line 33
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer_name()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p2, Lf2/a;->l:Ljava/lang/String;

    .line 34
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p2, Lf2/a;->a:Ljava/lang/String;

    return-object p2

    :cond_c
    const/4 p1, 0x0

    return-object p1
.end method

.method public final v()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lf2/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 2
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    sget v1, Lcom/join/mgps/va/overmind/d;->h:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/xinzhu/overmind/Overmind;->getInstalledApplications(II)Ljava/util/List;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v1

    sget v3, Lcom/join/mgps/va/overmind/d;->h:I

    invoke-virtual {v1, v2, v3}, Lcom/xinzhu/overmind/Overmind;->getInstalledPackages(II)Ljava/util/List;

    move-result-object v1

    .line 4
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 5
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1f

    if-lt v3, v4, :cond_1

    const-string v1, "applicationList"

    .line 6
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ApplicationInfo;

    .line 8
    new-instance v3, Lf2/a;

    invoke-direct {v3}, Lf2/a;-><init>()V

    .line 9
    iget-object v4, v1, Landroid/content/pm/ApplicationInfo;->compileSdkVersionCodename:Ljava/lang/String;

    iput-object v4, v3, Lf2/a;->l:Ljava/lang/String;

    .line 10
    iget v4, v1, Landroid/content/pm/ApplicationInfo;->compileSdkVersion:I

    iput v4, v3, Lf2/a;->k:I

    .line 11
    iget-object v4, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iput-object v4, v3, Lf2/a;->a:Ljava/lang/String;

    .line 12
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lf2/a;->e:Ljava/lang/CharSequence;

    .line 13
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/content/pm/ApplicationInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v3, Lf2/a;->d:Landroid/graphics/drawable/Drawable;

    .line 14
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const-string v0, "packageList"

    .line 15
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/PackageInfo;

    .line 17
    new-instance v3, Lf2/a;

    invoke-direct {v3}, Lf2/a;-><init>()V

    .line 18
    iget-object v4, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v4, v3, Lf2/a;->l:Ljava/lang/String;

    .line 19
    iget v4, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    iput v4, v3, Lf2/a;->k:I

    .line 20
    iget-object v4, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iput-object v4, v3, Lf2/a;->a:Ljava/lang/String;

    .line 21
    iget-object v4, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lf2/a;->e:Ljava/lang/CharSequence;

    .line 22
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/content/pm/ApplicationInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v3, Lf2/a;->d:Landroid/graphics/drawable/Drawable;

    .line 23
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v2
.end method

.method public final w(Ljava/lang/String;I)I
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_1

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    const/4 v1, 0x6

    if-eqz v0, :cond_2

    return v1

    .line 2
    :cond_2
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/xinzhu/overmind/client/frameworks/g;->j(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 3
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 4
    invoke-virtual {p1}, Landroid/content/Intent;->getFlags()I

    move-result p1

    .line 5
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object v2

    invoke-virtual {v2, v0, p1, p2}, Lcom/xinzhu/overmind/client/frameworks/g;->e(Landroid/content/ComponentName;II)Landroid/content/pm/ActivityInfo;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 6
    iget p1, p1, Landroid/content/pm/ActivityInfo;->screenOrientation:I

    return p1

    :cond_3
    return v1
.end method
