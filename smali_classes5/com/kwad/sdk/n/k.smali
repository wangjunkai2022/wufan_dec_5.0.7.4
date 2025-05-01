.class public final Lcom/kwad/sdk/n/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/n/k$a;
    }
.end annotation


# static fields
.field private static final Kc:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static aUv:Lcom/kwad/sdk/n/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/kwad/sdk/n/k;->Kc:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static OL()V
    .locals 2

    .line 1
    sget-object v0, Lcom/kwad/sdk/n/k;->Kc:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lcom/kwad/sdk/n/k$1;

    invoke-direct {v0}, Lcom/kwad/sdk/n/k$1;-><init>()V

    invoke-static {v0}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic OM()Lcom/kwad/sdk/n/k$a;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/n/k;->aUv:Lcom/kwad/sdk/n/k$a;

    return-object v0
.end method

.method static synthetic a(Lcom/kwad/sdk/n/k$a;)Lcom/kwad/sdk/n/k$a;
    .locals 0

    .line 1
    sput-object p0, Lcom/kwad/sdk/n/k;->aUv:Lcom/kwad/sdk/n/k$a;

    return-object p0
.end method

.method private static a(Landroid/content/Context;Lcom/kwad/sdk/n/k$a;)Z
    .locals 1

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    .line 3
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object p1, p1, Lcom/kwad/sdk/n/k$a;->aUx:Ljava/util/List;

    invoke-direct {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 5
    invoke-static {v0, p0}, Lcom/kwad/sdk/utils/ai;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "WrapperBlackHelper"

    const-string p1, "isBlackClass"

    .line 6
    invoke-static {p0, p1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private static a(Ljava/lang/StackTraceElement;Lcom/kwad/sdk/n/k$a;)Z
    .locals 3

    .line 7
    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object p0

    .line 9
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object p1, p1, Lcom/kwad/sdk/n/k$a;->aUy:Ljava/util/List;

    invoke-direct {v1, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 10
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/n/k$a$a;

    .line 11
    iget-object v2, v1, Lcom/kwad/sdk/n/k$a$a;->aUz:Ljava/lang/String;

    .line 12
    iget-object v1, v1, Lcom/kwad/sdk/n/k$a$a;->aUA:Ljava/lang/String;

    .line 13
    invoke-static {v2, v0}, Lcom/kwad/sdk/utils/ai;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 14
    invoke-static {v1, p0}, Lcom/kwad/sdk/utils/ai;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p0, "WrapperBlackHelper"

    const-string p1, "isBlackMethod"

    .line 15
    invoke-static {p0, p1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static dA(Landroid/content/Context;)Z
    .locals 5

    .line 1
    sget-object v0, Lcom/kwad/sdk/n/k;->aUv:Lcom/kwad/sdk/n/k$a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, v0, Lcom/kwad/sdk/n/k$a;->aUx:Ljava/util/List;

    invoke-static {v0}, Lcom/kwad/sdk/utils/ai;->I(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lcom/kwad/sdk/n/k;->aUv:Lcom/kwad/sdk/n/k$a;

    iget-object v0, v0, Lcom/kwad/sdk/n/k$a;->aUy:Ljava/util/List;

    invoke-static {v0}, Lcom/kwad/sdk/utils/ai;->I(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 3
    :cond_1
    sget-object v0, Lcom/kwad/sdk/n/k;->aUv:Lcom/kwad/sdk/n/k$a;

    invoke-static {p0, v0}, Lcom/kwad/sdk/n/k;->a(Landroid/content/Context;Lcom/kwad/sdk/n/k$a;)Z

    move-result p0

    if-nez p0, :cond_2

    return v1

    .line 4
    :cond_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    .line 5
    array-length v0, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    aget-object v3, p0, v2

    .line 6
    sget-object v4, Lcom/kwad/sdk/n/k;->aUv:Lcom/kwad/sdk/n/k$a;

    invoke-static {v3, v4}, Lcom/kwad/sdk/n/k;->a(Ljava/lang/StackTraceElement;Lcom/kwad/sdk/n/k$a;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 p0, 0x1

    return p0

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    return v1
.end method
