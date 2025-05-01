.class Lcom/join/mgps/activity/PrivateDomainDefaultActivity$b;
.super Ljava/lang/Object;
.source "PrivateDomainDefaultActivity.java"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/PrivateDomainDefaultActivity;->i0()V
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
.field final synthetic b:Lcom/join/mgps/activity/PrivateDomainDefaultActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/PrivateDomainDefaultActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PrivateDomainDefaultActivity$b;->b:Lcom/join/mgps/activity/PrivateDomainDefaultActivity;

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
    iget-object v0, p1, Lcom/tbruyelle/rxpermissions2/b;->a:Ljava/lang/String;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean p1, p1, Lcom/tbruyelle/rxpermissions2/b;->b:Z

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/PrivateDomainDefaultActivity$b;->b:Lcom/join/mgps/activity/PrivateDomainDefaultActivity;

    iget-object v0, p1, Lcom/join/mgps/activity/PrivateDomainDefaultActivity;->i:Lcom/join/mgps/dto/WxProgram;

    invoke-virtual {v0}, Lcom/join/mgps/dto/WxProgram;->getCode_url()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/activity/PrivateDomainDefaultActivity;->g0(Lcom/join/mgps/activity/PrivateDomainDefaultActivity;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/p0;->a(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    const-string p1, "\u4fdd\u5b58\u6210\u529f"

    .line 3
    invoke-static {p1}, Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/PrivateDomainDefaultActivity$b;->b:Lcom/join/mgps/activity/PrivateDomainDefaultActivity;

    invoke-virtual {p1}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

    goto :goto_0

    :cond_0
    const-string p1, "\u4fdd\u5b58\u5931\u8d25"

    .line 5
    invoke-static {p1}, Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;)V

    :goto_0
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

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/PrivateDomainDefaultActivity$b;->a(Lcom/tbruyelle/rxpermissions2/b;)V

    return-void
.end method
