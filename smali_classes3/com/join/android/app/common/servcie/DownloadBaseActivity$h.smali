.class Lcom/join/android/app/common/servcie/DownloadBaseActivity$h;
.super Ljava/lang/Object;
.source "DownloadBaseActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/android/app/common/servcie/DownloadBaseActivity;->onConnectivityChanged(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/android/app/common/servcie/DownloadBaseActivity;


# direct methods
.method constructor <init>(Lcom/join/android/app/common/servcie/DownloadBaseActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/android/app/common/servcie/DownloadBaseActivity$h;->b:Lcom/join/android/app/common/servcie/DownloadBaseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/join/android/app/common/utils/j;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/android/app/common/servcie/DownloadBaseActivity$h;->b:Lcom/join/android/app/common/servcie/DownloadBaseActivity;

    invoke-static {v0}, Lcom/join/android/app/common/servcie/DownloadBaseActivity;->access$500(Lcom/join/android/app/common/servcie/DownloadBaseActivity;)V

    :cond_0
    return-void
.end method
