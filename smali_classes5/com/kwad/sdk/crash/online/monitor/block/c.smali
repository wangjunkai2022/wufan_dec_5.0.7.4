.class public final Lcom/kwad/sdk/crash/online/monitor/block/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile aHU:Z


# direct methods
.method private static a(Lcom/kwad/sdk/crash/online/monitor/a/b;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/crash/online/monitor/a/b;->aIn:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object p0, p0, Lcom/kwad/sdk/crash/online/monitor/a/b;->aIn:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string p0, "b25SZXBvcnRJc3N1ZQ=="

    .line 3
    :goto_0
    new-instance v0, Ljava/lang/String;

    invoke-static {}, Lcom/kwad/sdk/core/a/c;->Ee()Lcom/kwad/sdk/core/a/c$a;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/kwad/sdk/core/a/c$a;->decode(Ljava/lang/String;)[B

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([B)V

    .line 4
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v1, "report methodName:"

    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "perfMonitor.Injector"

    invoke-static {v1, p0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private static b(Lcom/kwad/sdk/crash/online/monitor/a/b;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    .line 9
    iget-object v0, p0, Lcom/kwad/sdk/crash/online/monitor/a/b;->aIm:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 10
    iget-object p0, p0, Lcom/kwad/sdk/crash/online/monitor/a/b;->aIm:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string p0, "Y29tLnRlbmNlbnQubWF0cml4LnBsdWdpbi5QbHVnaW5MaXN0ZW5lcg=="

    .line 11
    :goto_0
    new-instance v0, Ljava/lang/String;

    invoke-static {}, Lcom/kwad/sdk/core/a/c;->Ee()Lcom/kwad/sdk/core/a/c$a;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/kwad/sdk/core/a/c$a;->decode(Ljava/lang/String;)[B

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([B)V

    .line 12
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v1, "ListenerName:"

    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "perfMonitor.Injector"

    invoke-static {v1, p0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static b(Lcom/kwad/sdk/crash/online/monitor/a/a;)V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/kwad/sdk/crash/online/monitor/block/c;->aHU:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/kwad/sdk/crash/online/monitor/block/c;->c(Lcom/kwad/sdk/crash/online/monitor/a/a;)Lcom/kwad/sdk/crash/online/monitor/a/b;

    move-result-object p0

    .line 3
    invoke-static {p0}, Lcom/kwad/sdk/crash/online/monitor/block/c;->b(Lcom/kwad/sdk/crash/online/monitor/a/b;)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/crash/online/monitor/block/c;->a(Lcom/kwad/sdk/crash/online/monitor/a/b;)Ljava/lang/String;

    move-result-object p0

    .line 5
    new-instance v1, Lcom/kwad/sdk/crash/online/monitor/block/c$1;

    invoke-direct {v1}, Lcom/kwad/sdk/crash/online/monitor/block/c$1;-><init>()V

    invoke-static {v0, p0, v1}, Lcom/kwad/sdk/m/d;->a(Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/m/d$a;)V

    const/4 p0, 0x1

    .line 6
    sput-boolean p0, Lcom/kwad/sdk/crash/online/monitor/block/c;->aHU:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 7
    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    .line 8
    invoke-static {p0}, Lcom/kwad/sdk/crash/online/monitor/block/c;->onError(Ljava/lang/String;)V

    return-void
.end method

.method private static c(Lcom/kwad/sdk/crash/online/monitor/a/a;)Lcom/kwad/sdk/crash/online/monitor/a/b;
    .locals 3

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/service/a/h;->getAppId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    const/4 v1, 0x0

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 4
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/crash/online/monitor/a/a;->fM(Ljava/lang/String;)Lcom/kwad/sdk/crash/online/monitor/a/b;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method static synthetic fI(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/crash/online/monitor/block/c;->onError(Ljava/lang/String;)V

    return-void
.end method

.method private static onError(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/crash/online/monitor/block/f;->fL(Ljava/lang/String;)V

    const-string v0, "perfMonitor.Injector"

    .line 2
    invoke-static {v0, p0}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
