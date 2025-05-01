.class public final Lcom/bytedance/pangle/b;
.super Ljava/lang/Object;


# direct methods
.method public static a()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/bytedance/pangle/GlobalParam;->getInstance()Lcom/bytedance/pangle/GlobalParam;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/pangle/GlobalParam;->getReporter()Lcom/bytedance/pangle/log/IZeusReporter;

    move-result-object v0

    const-string v1, "zeus_stage_flipped"

    const-string v2, "start"

    invoke-interface {v0, v1, v2}, Lcom/bytedance/pangle/log/IZeusReporter;->saveRecord(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/16 v4, 0x1e

    if-ge v0, v4, :cond_1

    const/16 v4, 0x1d

    if-ne v0, v4, :cond_0

    sget v4, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I

    if-lez v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v4, 0x1

    :goto_1
    if-eqz v4, :cond_2

    .line 3
    new-instance v0, Lcom/bytedance/pangle/flipped/FlippedV2Impl;

    invoke-direct {v0}, Lcom/bytedance/pangle/flipped/FlippedV2Impl;-><init>()V

    goto :goto_2

    :cond_2
    const/16 v4, 0x1c

    if-ge v0, v4, :cond_3

    const/16 v4, 0x1b

    if-ne v0, v4, :cond_4

    .line 4
    sget v0, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I

    if-lez v0, :cond_4

    :cond_3
    const/4 v2, 0x1

    :cond_4
    if-eqz v2, :cond_5

    .line 5
    new-instance v0, Lcom/bytedance/pangle/flipped/b;

    invoke-direct {v0}, Lcom/bytedance/pangle/flipped/b;-><init>()V

    goto :goto_2

    .line 6
    :cond_5
    new-instance v0, Lcom/bytedance/pangle/flipped/a;

    invoke-direct {v0}, Lcom/bytedance/pangle/flipped/a;-><init>()V

    .line 7
    :goto_2
    invoke-interface {v0}, Lcom/bytedance/pangle/flipped/c;->invokeHiddenApiRestrictions()V

    .line 8
    invoke-static {}, Lcom/bytedance/pangle/GlobalParam;->getInstance()Lcom/bytedance/pangle/GlobalParam;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/pangle/GlobalParam;->getReporter()Lcom/bytedance/pangle/log/IZeusReporter;

    move-result-object v0

    const-string v2, "finish"

    invoke-interface {v0, v1, v2}, Lcom/bytedance/pangle/log/IZeusReporter;->saveRecord(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
