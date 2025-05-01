.class Lcom/BaseFragmentActivity$k$a;
.super Ljava/lang/Object;
.source "BaseFragmentActivity.java"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/BaseFragmentActivity$k;->onClickCancle()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/Consumer<",
        "Lcom/tbruyelle/rxpermissions2/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/BaseFragmentActivity$k;


# direct methods
.method constructor <init>(Lcom/BaseFragmentActivity$k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/BaseFragmentActivity$k$a;->b:Lcom/BaseFragmentActivity$k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/tbruyelle/rxpermissions2/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object p1, p1, Lcom/tbruyelle/rxpermissions2/b;->a:Ljava/lang/String;

    const-string v0, "android.permission.REQUEST_INSTALL_PACKAGES"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/BaseFragmentActivity$k$a;->b:Lcom/BaseFragmentActivity$k;

    iget-object v0, p1, Lcom/BaseFragmentActivity$k;->a:Lcom/BaseFragmentActivity$o;

    iget-object v0, v0, Lcom/BaseFragmentActivity$o;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p1, Lcom/BaseFragmentActivity$k;->b:Lcom/BaseFragmentActivity;

    iput-object v0, v1, Lcom/BaseFragmentActivity;->fialePath:Ljava/lang/String;

    .line 4
    :cond_0
    iget-object p1, p1, Lcom/BaseFragmentActivity$k;->b:Lcom/BaseFragmentActivity;

    invoke-static {p1}, Lcom/BaseFragmentActivity;->access$100(Lcom/BaseFragmentActivity;)Landroid/os/Handler;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_1
    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/tbruyelle/rxpermissions2/b;

    invoke-virtual {p0, p1}, Lcom/BaseFragmentActivity$k$a;->a(Lcom/tbruyelle/rxpermissions2/b;)V

    return-void
.end method
