.class Lcom/join/android/app/common/servcie/DownloadBaseActivity$a;
.super Ljava/lang/Object;
.source "DownloadBaseActivity.java"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/android/app/common/servcie/DownloadBaseActivity;
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
    iput-object p1, p0, Lcom/join/android/app/common/servcie/DownloadBaseActivity$a;->b:Lcom/join/android/app/common/servcie/DownloadBaseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 1
    .param p1    # Landroid/os/Message;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/android/app/common/servcie/DownloadBaseActivity$a;->b:Lcom/join/android/app/common/servcie/DownloadBaseActivity;

    invoke-static {p1}, Lcom/join/android/app/common/servcie/DownloadBaseActivity;->access$000(Lcom/join/android/app/common/servcie/DownloadBaseActivity;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 3
    iget-object p1, p0, Lcom/join/android/app/common/servcie/DownloadBaseActivity$a;->b:Lcom/join/android/app/common/servcie/DownloadBaseActivity;

    invoke-static {p1}, Lcom/join/android/app/common/servcie/DownloadBaseActivity;->access$100(Lcom/join/android/app/common/servcie/DownloadBaseActivity;)V

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
