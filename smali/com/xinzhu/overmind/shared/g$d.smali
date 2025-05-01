.class public final Lcom/xinzhu/overmind/shared/g$d;
.super Lcom/xinzhu/overmind/client/a;
.source "OvermindLoadCallback.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xinzhu/overmind/shared/g;->g(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/xinzhu/overmind/shared/g;

.field final synthetic c:Z

.field final synthetic d:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/xinzhu/overmind/shared/g;ZZ)V
    .locals 0

    iput-object p1, p0, Lcom/xinzhu/overmind/shared/g$d;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/xinzhu/overmind/shared/g$d;->b:Lcom/xinzhu/overmind/shared/g;

    iput-boolean p3, p0, Lcom/xinzhu/overmind/shared/g$d;->c:Z

    iput-boolean p4, p0, Lcom/xinzhu/overmind/shared/g$d;->d:Z

    .line 1
    invoke-direct {p0}, Lcom/xinzhu/overmind/client/a;-><init>()V

    return-void
.end method


# virtual methods
.method public getHostPackageName()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/shared/g$d;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "context.packageName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getMainAuthorityPrefix()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "com.join.android.app.mgsim.wufun"

    return-object v0
.end method

.method public getMainPackageName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "com.join.android.app.mgsim.wufun"

    return-object v0
.end method

.method public getPluginAuthorityPrefix()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "com.join.android.app.mgsim.wufun.addon"

    return-object v0
.end method

.method public getPluginPackageName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "com.join.android.app.mgsim.wufun.addon"

    return-object v0
.end method

.method public ifDisableDaemonService()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ifDisablePluginPackageAutoManage()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ifDisableVirtualDeviceForPackage(Ljava/lang/String;I)Z
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "packageName"

    .line 2
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "userId"

    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const/4 p1, 0x0

    :try_start_0
    const-string p2, "com.join.android.app.mgsim.wufun.virtual.service.dbprovider"

    const-string v1, "miniGameInfo"

    .line 4
    invoke-static {p2, v1, p1, v0}, Lcom/xinzhu/overmind/shared/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 5
    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    const/4 p2, 0x1

    if-eqz p1, :cond_0

    const-string v0, "isMiniGame"

    .line 6
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return p2

    .line 7
    :cond_0
    sget-object v0, Lcom/join/mgps/va/overmind/VApp;->Companion:Lcom/join/mgps/va/overmind/VApp$a;

    invoke-virtual {v0}, Lcom/join/mgps/va/overmind/VApp$a;->b()Z

    move-result v0

    if-nez v0, :cond_1

    return p2

    :cond_1
    if-eqz p1, :cond_2

    const-string v0, "vm_device_switch"

    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_2

    return p2

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public isHideRoot()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xinzhu/overmind/shared/g$d;->c:Z

    return v0
.end method

.method public isHideXposed()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xinzhu/overmind/shared/g$d;->d:Z

    return v0
.end method

.method public isPluginValid()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/shared/g$d;->b:Lcom/xinzhu/overmind/shared/g;

    iget-object v1, p0, Lcom/xinzhu/overmind/shared/g$d;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/xinzhu/overmind/shared/g;->i(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public use32BitMainPackage()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public useRandomGeneratedVirtualDevice()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
