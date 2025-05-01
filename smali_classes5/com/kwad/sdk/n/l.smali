.class public final Lcom/kwad/sdk/n/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static aUB:Landroid/app/Application;


# direct methods
.method public static ON()Landroid/app/Application;
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/n/l;->checkInit()V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/n/l;->OO()Landroid/app/Application;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/kwad/sdk/n/i;->OK()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/n/i;->wrapContextIfNeed(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    sput-object v0, Lcom/kwad/sdk/n/l;->aUB:Landroid/app/Application;

    .line 5
    :cond_0
    sget-object v0, Lcom/kwad/sdk/n/l;->aUB:Landroid/app/Application;

    return-object v0
.end method

.method private static OO()Landroid/app/Application;
    .locals 3

    .line 1
    sget-object v0, Lcom/kwad/sdk/n/l;->aUB:Landroid/app/Application;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lw()Landroid/content/Context;

    move-result-object v0

    .line 3
    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_1

    .line 4
    check-cast v0, Landroid/app/Application;

    .line 5
    sput-object v0, Lcom/kwad/sdk/n/l;->aUB:Landroid/app/Application;

    return-object v0

    .line 6
    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 7
    instance-of v2, v1, Landroid/app/Application;

    if-eqz v2, :cond_2

    .line 8
    check-cast v1, Landroid/app/Application;

    .line 9
    sput-object v1, Lcom/kwad/sdk/n/l;->aUB:Landroid/app/Application;

    return-object v1

    .line 10
    :cond_2
    invoke-static {v1}, Lcom/kwad/sdk/n/l;->aC(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 11
    invoke-static {v1}, Lcom/kwad/sdk/n/i;->dz(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    .line 12
    :cond_3
    invoke-static {v1}, Lcom/kwad/sdk/n/j;->aC(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 13
    invoke-static {v1}, Lcom/kwad/sdk/n/j;->dz(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    .line 14
    :cond_4
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 15
    :goto_0
    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_5

    .line 16
    check-cast v0, Landroid/app/Application;

    sput-object v0, Lcom/kwad/sdk/n/l;->aUB:Landroid/app/Application;

    goto :goto_1

    .line 17
    :cond_5
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/sdk/core/c/b;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 18
    sput-object v1, Lcom/kwad/sdk/n/l;->aUB:Landroid/app/Application;

    goto :goto_1

    .line 19
    :cond_6
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_8

    .line 20
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 21
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 22
    :cond_7
    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_8

    .line 23
    check-cast v0, Landroid/app/Application;

    sput-object v0, Lcom/kwad/sdk/n/l;->aUB:Landroid/app/Application;

    .line 24
    :cond_8
    :goto_1
    sget-object v0, Lcom/kwad/sdk/n/l;->aUB:Landroid/app/Application;

    if-nez v0, :cond_9

    .line 25
    invoke-static {}, Lcom/kwad/sdk/n/l;->OP()Landroid/app/Application;

    move-result-object v0

    sput-object v0, Lcom/kwad/sdk/n/l;->aUB:Landroid/app/Application;

    .line 26
    :cond_9
    sget-object v0, Lcom/kwad/sdk/n/l;->aUB:Landroid/app/Application;

    invoke-static {v0}, Lcom/kwad/sdk/n/l;->dF(Landroid/content/Context;)Landroid/app/Application;

    move-result-object v0

    .line 27
    sput-object v0, Lcom/kwad/sdk/n/l;->aUB:Landroid/app/Application;

    return-object v0
.end method

.method private static OP()Landroid/app/Application;
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "android.app.ActivityThread"

    const-string v3, "currentApplication"

    .line 1
    invoke-static {v2, v3, v1}, Lcom/kwad/sdk/utils/s;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "android.app.AppGlobals"

    const-string v2, "getInitialApplication"

    .line 2
    invoke-static {v1, v2, v0}, Lcom/kwad/sdk/utils/s;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    return-object v0
.end method

.method public static a(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/LayoutRes;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/n/l;->dI(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p0

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/app/Application;)V
    .locals 1

    .line 2
    sget-object v0, Lcom/kwad/sdk/n/l;->aUB:Landroid/app/Application;

    if-nez v0, :cond_0

    .line 3
    sput-object p0, Lcom/kwad/sdk/n/l;->aUB:Landroid/app/Application;

    :cond_0
    return-void
.end method

.method private static a(Landroid/view/LayoutInflater;)V
    .locals 2

    const-string v0, "mFactory"

    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Lcom/kwad/sdk/utils/s;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "mFactory2"

    .line 5
    invoke-static {p0, v0, v1}, Lcom/kwad/sdk/utils/s;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static aC(Landroid/content/Context;)Z
    .locals 0

    .line 1
    instance-of p0, p0, Lcom/kwad/sdk/n/a;

    return p0
.end method

.method public static b(Landroid/content/Context;Landroid/content/Context;)Landroid/view/LayoutInflater;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/n/l;->dJ(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p0

    .line 2
    invoke-static {p0}, Lcom/kwad/sdk/n/l;->a(Landroid/view/LayoutInflater;)V

    return-object p0
.end method

.method private static checkInit()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/n/e;->OH()Lcom/kwad/sdk/n/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/n/e;->Nm()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "please init KSPlugin"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static dB(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 2
    check-cast p0, Landroid/app/Activity;

    return-object p0

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/kwad/sdk/n/l;->dD(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    .line 4
    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_1

    .line 5
    check-cast p0, Landroid/app/Activity;

    return-object p0

    .line 6
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    invoke-static {}, Lcom/kwad/sdk/core/c/b;->getCurrentActivity()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method private static dC(Landroid/content/Context;)Landroid/content/Context;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/f;

    invoke-static {}, Lcom/kwad/sdk/n/i;->OK()Z

    move-result v1

    const-string v2, "--initFinish:"

    if-eqz v1, :cond_0

    invoke-static {p0}, Lcom/kwad/sdk/n/l;->aC(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/f;->yY()Z

    move-result v0

    .line 3
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "expect KSContext in external --context:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/n/i;->OK()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p0}, Lcom/kwad/sdk/n/j;->aC(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/f;->yY()Z

    move-result v0

    .line 8
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "expect ResContext in external --context:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 10
    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static dD(Landroid/content/Context;)Landroid/content/Context;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-static {}, Lcom/kwad/sdk/n/l;->checkInit()V

    .line 2
    const-class v0, Lcom/kwad/sdk/service/a/f;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/f;->yV()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/kwad/sdk/n/l;->dG(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    .line 4
    :cond_1
    invoke-static {p0}, Lcom/kwad/sdk/n/l;->aC(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5
    invoke-static {p0}, Lcom/kwad/sdk/n/i;->dy(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    goto :goto_0

    .line 6
    :cond_2
    invoke-static {p0}, Lcom/kwad/sdk/n/j;->unwrapContextIfNeed(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    .line 7
    :goto_0
    invoke-static {p0}, Lcom/kwad/sdk/n/l;->dE(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method private static dE(Landroid/content/Context;)Landroid/content/Context;
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/n/j;->aC(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, p0, Lcom/kwad/sdk/n/a;

    if-eqz v0, :cond_1

    .line 2
    :cond_0
    const-class v0, Lcom/kwad/sdk/service/a/f;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/f;->yY()Z

    move-result v0

    .line 3
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "expect normalContext --context:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "--initFinish:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    :cond_1
    return-object p0
.end method

.method private static dF(Landroid/content/Context;)Landroid/app/Application;
    .locals 5

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/f;

    instance-of v1, p0, Landroid/app/Application;

    if-eqz v1, :cond_0

    .line 2
    check-cast p0, Landroid/app/Application;

    return-object p0

    .line 3
    :cond_0
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v1}, Lcom/kwad/sdk/service/a/f;->yY()Z

    move-result v1

    .line 4
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "expect normalContext --context:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "--initFinish:"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, "--isExternal:"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/kwad/sdk/service/a/f;

    invoke-interface {p0}, Lcom/kwad/sdk/service/a/f;->yV()Z

    move-result p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 7
    invoke-static {v2}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static dG(Landroid/content/Context;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/n/l;->aC(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/kwad/sdk/n/j;->aC(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static dH(Landroid/content/Context;)Landroid/content/Context;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/kwad/sdk/n/j;->aC(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/kwad/sdk/n/j;->aB(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    .line 3
    :cond_0
    instance-of v0, p0, Lcom/kwad/sdk/n/a;

    if-eqz v0, :cond_1

    .line 4
    move-object v0, p0

    check-cast v0, Lcom/kwad/sdk/n/a;

    invoke-interface {v0}, Lcom/kwad/sdk/n/a;->getDelegatedContext()Landroid/content/Context;

    move-result-object p0

    .line 5
    :cond_1
    invoke-static {p0}, Lcom/kwad/sdk/n/l;->dG(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-object p0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x5

    if-ge v0, v1, :cond_6

    .line 6
    invoke-static {p0}, Lcom/kwad/sdk/n/j;->aC(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 7
    invoke-static {p0}, Lcom/kwad/sdk/n/j;->aB(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    .line 8
    :cond_3
    instance-of v1, p0, Lcom/kwad/sdk/n/a;

    if-eqz v1, :cond_4

    .line 9
    move-object v1, p0

    check-cast v1, Lcom/kwad/sdk/n/a;

    invoke-interface {v1}, Lcom/kwad/sdk/n/a;->getDelegatedContext()Landroid/content/Context;

    move-result-object p0

    .line 10
    :cond_4
    invoke-static {p0}, Lcom/kwad/sdk/n/l;->dG(Landroid/content/Context;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_5

    return-object p0

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 11
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    :cond_6
    return-object p0
.end method

.method public static dI(Landroid/content/Context;)Landroid/view/LayoutInflater;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/n/l;->wrapContextIfNeed(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    .line 2
    invoke-static {p0}, Lcom/kwad/sdk/n/j;->aC(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/n/l;->a(Landroid/view/LayoutInflater;)V

    return-object p0

    .line 5
    :cond_0
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p0

    return-object p0
.end method

.method private static dJ(Landroid/content/Context;)Landroid/content/Context;
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_0

    .line 2
    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static getThemeResId(Landroid/content/Context;)I
    .locals 3

    .line 1
    instance-of v0, p0, Landroid/view/ContextThemeWrapper;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    new-array v0, v1, [Ljava/lang/Object;

    const-string v2, "getThemeResId"

    .line 2
    invoke-static {p0, v2, v0}, Lcom/kwad/sdk/utils/s;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 3
    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_0
    return v1

    .line 4
    :cond_1
    instance-of v0, p0, Landroidx/appcompat/view/ContextThemeWrapper;

    if-eqz v0, :cond_2

    .line 5
    check-cast p0, Landroidx/appcompat/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroidx/appcompat/view/ContextThemeWrapper;->getThemeResId()I

    move-result p0

    return p0

    :cond_2
    return v1
.end method

.method public static h(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/n/j;->onDestroy(Landroid/content/Context;)V

    return-void
.end method

.method public static inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/LayoutRes;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/n/l;->dI(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static wrapContextIfNeed(Landroid/content/Context;)Landroid/content/Context;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-static {}, Lcom/kwad/sdk/n/l;->checkInit()V

    .line 2
    const-class v0, Lcom/kwad/sdk/service/a/f;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/f;->yV()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/n/i;->OK()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/n/i;->wrapContextIfNeed(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    goto :goto_0

    .line 5
    :cond_1
    invoke-static {p0}, Lcom/kwad/sdk/n/j;->wrapContextIfNeed(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    .line 6
    :goto_0
    invoke-static {p0}, Lcom/kwad/sdk/n/l;->dC(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method public static x(Landroid/content/Context;Z)V
    .locals 2

    :try_start_0
    const-string v0, "kssdk_api_pref"

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    .line 2
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string v0, "useContextClassLoader"

    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 3
    invoke-static {p0}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    return-void
.end method
