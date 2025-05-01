.class public Lcom/kwad/sdk/n/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/n/i$a;
    }
.end annotation


# static fields
.field private static final CLAZZ_NAME:Ljava/lang/String; = "com.kwad.sdk.n.i"

.field private static final aUu:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final sAutoUnWrapModelTL:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lcom/kwad/sdk/n/i$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final sAutoUnWrapStackList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final sResContextCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/content/Context;",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lcom/kwad/sdk/n/i;->sAutoUnWrapModelTL:Ljava/lang/ThreadLocal;

    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lcom/kwad/sdk/n/i;->sAutoUnWrapStackList:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lcom/kwad/sdk/n/i;->sResContextCache:Ljava/util/Map;

    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/kwad/sdk/n/i;->aUu:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static OK()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/n/i;->aUu:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method private static a(Landroid/content/Context;Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/n/i;->sResContextCache:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    instance-of p1, p0, Landroid/app/Activity;

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    new-instance p1, Lcom/kwad/sdk/n/i$1;

    invoke-direct {p1, p0}, Lcom/kwad/sdk/n/i$1;-><init>(Landroid/content/Context;)V

    invoke-static {p1}, Lcom/kwad/sdk/core/c/b;->a(Lcom/kwad/sdk/core/c/c;)V

    return-void
.end method

.method private static a(Landroid/content/Context;Lcom/kwad/sdk/n/i$a;)Z
    .locals 10

    .line 4
    sget-object v0, Lcom/kwad/sdk/n/i;->sResContextCache:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    if-eqz p0, :cond_0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string p0, ""

    .line 6
    :goto_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    .line 7
    invoke-static {p1}, Lcom/kwad/sdk/n/i$a;->f(Lcom/kwad/sdk/n/i$a;)[Ljava/lang/StackTraceElement;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x5

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    .line 8
    invoke-static {p1}, Lcom/kwad/sdk/n/i$a;->g(Lcom/kwad/sdk/n/i$a;)I

    .line 9
    invoke-static {p1, v0}, Lcom/kwad/sdk/n/i$a;->a(Lcom/kwad/sdk/n/i$a;[Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;

    .line 10
    invoke-static {p1}, Lcom/kwad/sdk/n/i$a;->h(Lcom/kwad/sdk/n/i$a;)I

    move-result p0

    if-lt p0, v2, :cond_1

    return v3

    :cond_1
    return v4

    .line 11
    :cond_2
    invoke-static {p1}, Lcom/kwad/sdk/n/i$a;->f(Lcom/kwad/sdk/n/i$a;)[Ljava/lang/StackTraceElement;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 12
    invoke-static {p1}, Lcom/kwad/sdk/n/i$a;->e(Lcom/kwad/sdk/n/i$a;)V

    return v4

    .line 13
    :cond_3
    invoke-static {p1, v0}, Lcom/kwad/sdk/n/i$a;->a(Lcom/kwad/sdk/n/i$a;[Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;

    const/4 p1, 0x0

    const/4 v1, 0x0

    .line 14
    :cond_4
    array-length v5, v0

    if-ge p1, v5, :cond_7

    .line 15
    aget-object v5, v0, p1

    .line 16
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v6

    .line 17
    invoke-static {}, Lcom/kwad/sdk/n/i;->getAutoUnWrapStackList()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 18
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_5

    invoke-virtual {v6, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_5

    return v3

    .line 19
    :cond_6
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v5

    add-int/lit8 p1, p1, 0x1

    .line 20
    array-length v7, v0

    if-ge p1, v7, :cond_4

    sget-object v7, Lcom/kwad/sdk/n/i;->CLAZZ_NAME:Ljava/lang/String;

    .line 21
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const-string v6, "wrapContextIfNeed"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 22
    aget-object v5, v0, p1

    .line 23
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v6

    invoke-static {p0, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 24
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "getBaseContext"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    add-int/lit8 v1, v1, 0x1

    if-lt v1, v2, :cond_4

    return v3

    :cond_7
    return v4
.end method

.method public static cj(Z)V
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/n/i;->aUu:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method static dy(Landroid/content/Context;)Landroid/content/Context;
    .locals 5

    .line 1
    instance-of v0, p0, Lcom/kwad/sdk/n/a;

    if-eqz v0, :cond_0

    .line 2
    check-cast p0, Lcom/kwad/sdk/n/a;

    invoke-interface {p0}, Lcom/kwad/sdk/n/a;->getDelegatedContext()Landroid/content/Context;

    move-result-object p0

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/kwad/sdk/n/l;->dG(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0xa

    if-ge v1, v2, :cond_6

    if-nez v0, :cond_2

    .line 4
    const-class v0, Lcom/kwad/sdk/service/a/f;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/f;->yY()Z

    move-result v0

    .line 5
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "expect normalContext --context:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "--initFinish:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 7
    const-class v0, Lcom/kwad/sdk/service/a/e;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/e;

    invoke-interface {v0, v2}, Lcom/kwad/sdk/service/a/e;->gatherException(Ljava/lang/Throwable;)V

    move-object v0, v2

    .line 8
    :cond_2
    invoke-static {p0}, Lcom/kwad/sdk/n/j;->aC(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 9
    invoke-static {p0}, Lcom/kwad/sdk/n/j;->aB(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    .line 10
    :cond_3
    instance-of v2, p0, Lcom/kwad/sdk/n/a;

    if-eqz v2, :cond_4

    .line 11
    check-cast p0, Lcom/kwad/sdk/n/a;

    invoke-interface {p0}, Lcom/kwad/sdk/n/a;->getDelegatedContext()Landroid/content/Context;

    move-result-object p0

    .line 12
    :cond_4
    invoke-static {p0}, Lcom/kwad/sdk/n/l;->dG(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_5

    return-object p0

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    return-object p0
.end method

.method static dz(Landroid/content/Context;)Landroid/content/Context;
    .locals 2

    .line 1
    instance-of v0, p0, Landroid/app/Application;

    if-eqz v0, :cond_0

    return-object p0

    .line 2
    :cond_0
    invoke-static {p0}, Lcom/kwad/sdk/n/i;->dy(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 3
    instance-of v0, p0, Landroid/app/Application;

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0xa

    if-ge v0, v1, :cond_4

    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 5
    instance-of v1, p0, Landroid/app/Application;

    if-eqz v1, :cond_2

    return-object p0

    .line 6
    :cond_2
    instance-of v1, p0, Lcom/kwad/sdk/n/a;

    if-eqz v1, :cond_3

    .line 7
    check-cast p0, Lcom/kwad/sdk/n/a;

    invoke-interface {p0}, Lcom/kwad/sdk/n/a;->getDelegatedContext()Landroid/content/Context;

    move-result-object p0

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-object p0
.end method

.method private static getAutoUnWrapStackList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/kwad/sdk/n/i;->sAutoUnWrapStackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "com.sensorsdata.analytics.android.sdk"

    .line 2
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method

.method public static onDestroy(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/n/i;->sResContextCache:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static replaceExternalClassLoader(Ljava/lang/ClassLoader;)Ljava/lang/ClassLoader;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/n/e;->OH()Lcom/kwad/sdk/n/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/n/e;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    return-object p0
.end method

.method static replaceTheme(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources$Theme;I)Landroid/content/res/Resources$Theme;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/n/e;->OH()Lcom/kwad/sdk/n/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/n/e;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    const/4 p0, 0x1

    .line 3
    invoke-virtual {p1, p2, p0}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_0
    return-object p1

    :cond_1
    return-object p0
.end method

.method private static returnUnWrappedContext(Landroid/content/Context;)Z
    .locals 7

    .line 1
    sget-object v0, Lcom/kwad/sdk/n/i;->sAutoUnWrapModelTL:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/n/i$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 2
    invoke-static {v1}, Lcom/kwad/sdk/n/i$a;->a(Lcom/kwad/sdk/n/i$a;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p0, :cond_1

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v1}, Lcom/kwad/sdk/n/i$a;->b(Lcom/kwad/sdk/n/i$a;)J

    move-result-wide v5

    sub-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    move-result-wide v3

    const-wide/16 v5, 0x96

    cmp-long v0, v3, v5

    if-gez v0, :cond_1

    .line 4
    invoke-static {v1}, Lcom/kwad/sdk/n/i$a;->c(Lcom/kwad/sdk/n/i$a;)I

    .line 5
    instance-of v0, p0, Landroid/app/Application;

    if-eqz v0, :cond_0

    const/16 v0, 0xf

    goto :goto_0

    :cond_0
    const/4 v0, 0x5

    .line 6
    :goto_0
    invoke-static {v1}, Lcom/kwad/sdk/n/i$a;->d(Lcom/kwad/sdk/n/i$a;)I

    move-result v3

    if-lt v3, v0, :cond_3

    .line 7
    invoke-static {p0, v1}, Lcom/kwad/sdk/n/i;->a(Landroid/content/Context;Lcom/kwad/sdk/n/i$a;)Z

    move-result p0

    if-eqz p0, :cond_3

    .line 8
    invoke-static {v1}, Lcom/kwad/sdk/n/i$a;->e(Lcom/kwad/sdk/n/i$a;)V

    const/4 p0, 0x1

    return p0

    .line 9
    :cond_1
    invoke-static {v1}, Lcom/kwad/sdk/n/i$a;->e(Lcom/kwad/sdk/n/i$a;)V

    .line 10
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v0}, Lcom/kwad/sdk/n/i$a;->a(Lcom/kwad/sdk/n/i$a;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v1, v3, v4}, Lcom/kwad/sdk/n/i$a;->a(Lcom/kwad/sdk/n/i$a;J)J

    goto :goto_1

    .line 12
    :cond_2
    new-instance p0, Lcom/kwad/sdk/n/i$a;

    invoke-direct {p0, v2}, Lcom/kwad/sdk/n/i$a;-><init>(B)V

    invoke-virtual {v0, p0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    return v2
.end method

.method static wrapContextIfNeed(Landroid/content/Context;)Landroid/content/Context;
    .locals 6

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/f;

    const-class v1, Lcom/kwad/sdk/service/a/e;

    if-nez p0, :cond_0

    .line 2
    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/kwad/sdk/service/a/e;

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "KSWrapper wrapContextIfNeed context is null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-interface {p0, v0}, Lcom/kwad/sdk/service/a/e;->gatherException(Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0

    .line 4
    :cond_0
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v2}, Lcom/kwad/sdk/service/a/f;->yV()Z

    move-result v2

    if-nez v2, :cond_1

    return-object p0

    .line 5
    :cond_1
    instance-of v2, p0, Lcom/kwad/sdk/n/a;

    if-eqz v2, :cond_2

    return-object p0

    .line 6
    :cond_2
    invoke-static {p0}, Lcom/kwad/sdk/n/j;->aC(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 7
    invoke-static {p0}, Lcom/kwad/sdk/n/j;->unwrapContextIfNeed(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    .line 8
    invoke-static {p0}, Lcom/kwad/sdk/n/j;->aC(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 9
    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/e;

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "KSWrapper unwrapContextIfNeed fail"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 10
    invoke-interface {v0, v1}, Lcom/kwad/sdk/service/a/e;->gatherException(Ljava/lang/Throwable;)V

    return-object p0

    .line 11
    :cond_3
    sget-object v2, Lcom/kwad/sdk/n/i;->sResContextCache:Ljava/util/Map;

    invoke-interface {v2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    .line 12
    instance-of v3, v2, Lcom/kwad/sdk/n/a;

    if-eqz v3, :cond_4

    return-object v2

    .line 13
    :cond_4
    invoke-static {p0}, Lcom/kwad/sdk/n/k;->dA(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_5

    return-object p0

    .line 14
    :cond_5
    invoke-static {p0}, Lcom/kwad/sdk/n/i;->returnUnWrappedContext(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 15
    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/e;

    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "KSWrapper returnUnWrappedContext context: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 17
    invoke-interface {v0, v1}, Lcom/kwad/sdk/service/a/e;->gatherException(Ljava/lang/Throwable;)V

    return-object p0

    .line 18
    :cond_6
    instance-of v2, p0, Landroid/app/Application;

    if-eqz v2, :cond_7

    .line 19
    :try_start_0
    new-instance v2, Lcom/kwad/sdk/n/f;

    move-object v3, p0

    check-cast v3, Landroid/app/Application;

    new-instance v4, Lcom/kwad/sdk/n/g;

    .line 20
    invoke-static {}, Lcom/kwad/sdk/n/e;->OH()Lcom/kwad/sdk/n/e;

    move-result-object v5

    invoke-direct {v4, p0, v5}, Lcom/kwad/sdk/n/g;-><init>(Landroid/content/Context;Lcom/kwad/sdk/n/e;)V

    invoke-direct {v2, v3, v4}, Lcom/kwad/sdk/n/f;-><init>(Landroid/app/Application;Lcom/kwad/sdk/n/g;)V

    .line 21
    invoke-static {v2}, Lcom/kwad/sdk/n/l;->a(Landroid/app/Application;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 22
    :catchall_0
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/f;->yY()Z

    move-result v0

    .line 23
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "wrapper Application fail --context:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "--initFinish:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 25
    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/e;

    invoke-interface {v0, v2}, Lcom/kwad/sdk/service/a/e;->gatherException(Ljava/lang/Throwable;)V

    return-object p0

    .line 26
    :cond_7
    instance-of v0, p0, Landroid/view/ContextThemeWrapper;

    if-eqz v0, :cond_8

    .line 27
    new-instance v2, Lcom/kwad/sdk/n/b;

    move-object v0, p0

    check-cast v0, Landroid/view/ContextThemeWrapper;

    invoke-direct {v2, v0}, Lcom/kwad/sdk/n/b;-><init>(Landroid/view/ContextThemeWrapper;)V

    goto :goto_0

    .line 28
    :cond_8
    instance-of v0, p0, Landroidx/appcompat/view/ContextThemeWrapper;

    if-eqz v0, :cond_9

    .line 29
    new-instance v2, Lcom/kwad/sdk/n/c;

    move-object v0, p0

    check-cast v0, Landroidx/appcompat/view/ContextThemeWrapper;

    invoke-direct {v2, v0}, Lcom/kwad/sdk/n/c;-><init>(Landroidx/appcompat/view/ContextThemeWrapper;)V

    goto :goto_0

    .line 30
    :cond_9
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_a

    .line 31
    new-instance v2, Lcom/kwad/sdk/n/d;

    invoke-direct {v2, p0}, Lcom/kwad/sdk/n/d;-><init>(Landroid/content/Context;)V

    goto :goto_0

    .line 32
    :cond_a
    new-instance v2, Lcom/kwad/sdk/n/d;

    invoke-direct {v2, p0}, Lcom/kwad/sdk/n/d;-><init>(Landroid/content/Context;)V

    .line 33
    :goto_0
    invoke-static {p0, v2}, Lcom/kwad/sdk/n/i;->a(Landroid/content/Context;Landroid/content/Context;)V

    return-object v2
.end method
