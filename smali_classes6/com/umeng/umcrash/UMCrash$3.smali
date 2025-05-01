.class final Lcom/umeng/umcrash/UMCrash$3;
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

.field final synthetic val$mCrashApi:Lcom/uc/crashsdk/export/CrashApi;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/uc/crashsdk/export/CrashApi;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/umcrash/UMCrash$3;->val$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/umeng/umcrash/UMCrash$3;->val$mCrashApi:Lcom/uc/crashsdk/export/CrashApi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    const-string v0, "2G/3G"

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/umeng/umcrash/UMCrash$3;->val$context:Landroid/content/Context;

    invoke-static {v1}, Lcom/efs/sdk/base/core/util/NetworkUtil;->getNetworkAccessMode(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v1

    const-string v2, "Wi-Fi"

    const/4 v3, 0x0

    .line 2
    aget-object v4, v1, v3

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "um_access"

    if-eqz v2, :cond_0

    .line 3
    :try_start_1
    iget-object v0, p0, Lcom/umeng/umcrash/UMCrash$3;->val$mCrashApi:Lcom/uc/crashsdk/export/CrashApi;

    const-string v2, "wifi"

    invoke-virtual {v0, v4, v2}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    aget-object v2, v1, v3

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    iget-object v2, p0, Lcom/umeng/umcrash/UMCrash$3;->val$mCrashApi:Lcom/uc/crashsdk/export/CrashApi;

    invoke-virtual {v2, v4, v0}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/umeng/umcrash/UMCrash$3;->val$mCrashApi:Lcom/uc/crashsdk/export/CrashApi;

    const-string v2, "unknow"

    invoke-virtual {v0, v4, v2}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const-string v0, ""

    const/4 v2, 0x1

    .line 7
    aget-object v3, v1, v2

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 8
    iget-object v0, p0, Lcom/umeng/umcrash/UMCrash$3;->val$mCrashApi:Lcom/uc/crashsdk/export/CrashApi;

    const-string v3, "um_access_subtype"

    aget-object v1, v1, v2

    invoke-virtual {v0, v3, v1}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_1
    return-void
.end method
