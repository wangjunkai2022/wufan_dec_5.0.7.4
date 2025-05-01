.class final Lcom/umeng/umcrash/UMCrash$4;
.super Ljava/lang/Object;
.source "UMCrash.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/umeng/umcrash/UMCrash;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$context:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/umcrash/UMCrash$4;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lcom/efs/sdk/pa/PAFactory$Builder;

    iget-object v1, p0, Lcom/umeng/umcrash/UMCrash$4;->val$context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/umeng/umcrash/UMCrash$4$1;

    invoke-direct {v2, p0}, Lcom/umeng/umcrash/UMCrash$4$1;-><init>(Lcom/umeng/umcrash/UMCrash$4;)V

    invoke-direct {v0, v1, v2}, Lcom/efs/sdk/pa/PAFactory$Builder;-><init>(Landroid/content/Context;Lcom/efs/sdk/pa/config/IEfsReporter;)V

    .line 2
    sget-object v1, Lcom/efs/sdk/pa/config/PackageLevel;->RELEASE:Lcom/efs/sdk/pa/config/PackageLevel;

    invoke-virtual {v0, v1}, Lcom/efs/sdk/pa/PAFactory$Builder;->packageLevel(Lcom/efs/sdk/pa/config/PackageLevel;)Lcom/efs/sdk/pa/PAFactory$Builder;

    .line 3
    invoke-static {}, Lcom/umeng/umcrash/UMCrash;->access$1100()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/efs/sdk/pa/PAFactory$Builder;->timeoutTime(J)Lcom/efs/sdk/pa/PAFactory$Builder;

    .line 4
    new-instance v1, Lcom/umeng/umcrash/UMCrash$PaClientImpl;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/umeng/umcrash/UMCrash$PaClientImpl;-><init>(Lcom/umeng/umcrash/UMCrash$1;)V

    invoke-virtual {v0, v1}, Lcom/efs/sdk/pa/PAFactory$Builder;->setPaClient(Lcom/efs/sdk/pa/IPaClient;)Lcom/efs/sdk/pa/PAFactory$Builder;

    .line 5
    invoke-virtual {v0}, Lcom/efs/sdk/pa/PAFactory$Builder;->build()Lcom/efs/sdk/pa/PAFactory;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Lcom/efs/sdk/pa/PAFactory;->getPaInstance()Lcom/efs/sdk/pa/PA;

    move-result-object v1

    invoke-interface {v1}, Lcom/efs/sdk/pa/PA;->start()V

    .line 7
    invoke-virtual {v0}, Lcom/efs/sdk/pa/PAFactory;->getConfigManager()Lcom/efs/sdk/pa/config/ConfigManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/efs/sdk/pa/config/ConfigManager;->enableTracer()Z

    move-result v0

    invoke-static {v0}, Lcom/umeng/umcrash/UMCrash;->access$1302(Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method
