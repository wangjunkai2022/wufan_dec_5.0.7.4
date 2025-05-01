.class final Lcom/efs/sdk/launch/LaunchManager$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/efs/sdk/launch/LaunchManager;->init(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/efs/sdk/base/EfsReporter;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/launch/LaunchManager$1;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/efs/sdk/launch/LaunchManager$1;->b:Lcom/efs/sdk/base/EfsReporter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :try_start_0
    new-instance v0, Lcom/efs/sdk/launch/LaunchConfigManager;

    iget-object v1, p0, Lcom/efs/sdk/launch/LaunchManager$1;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/efs/sdk/launch/LaunchManager$1;->b:Lcom/efs/sdk/base/EfsReporter;

    invoke-direct {v0, v1, v2}, Lcom/efs/sdk/launch/LaunchConfigManager;-><init>(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V

    invoke-static {v0}, Lcom/efs/sdk/launch/LaunchManager;->a(Lcom/efs/sdk/launch/LaunchConfigManager;)Lcom/efs/sdk/launch/LaunchConfigManager;

    invoke-static {}, Lcom/efs/sdk/launch/LaunchManager;->a()Z

    iget-object v0, p0, Lcom/efs/sdk/launch/LaunchManager$1;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/efs/sdk/launch/b;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method
