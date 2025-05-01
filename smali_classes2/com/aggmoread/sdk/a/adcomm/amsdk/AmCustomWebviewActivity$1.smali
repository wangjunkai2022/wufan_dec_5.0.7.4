.class Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/t/j$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity$1;->this$0:Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public canSkip()Z
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity$1;->this$0:Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->access$102(Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;Z)Z

    return v1
.end method

.method public onClose()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity$1;->this$0:Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onShow()V
    .locals 1

    invoke-static {}, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->access$000()Lcom/aggmoread/sdk/z/a/t/b$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/t/b$a;->onShow()V

    return-void
.end method
