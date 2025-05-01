.class Lcom/join/mgps/fragment/GameOlGiftPackageFragment$e;
.super Ljava/lang/Object;
.source "GameOlGiftPackageFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->o0(Lcom/join/mgps/dto/GiftPackageDataOperationBean;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/GiftPackageDataOperationBean;

.field final synthetic c:Lcom/join/mgps/fragment/GameOlGiftPackageFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/GameOlGiftPackageFragment;Lcom/join/mgps/dto/GiftPackageDataOperationBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment$e;->c:Lcom/join/mgps/fragment/GameOlGiftPackageFragment;

    iput-object p2, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment$e;->b:Lcom/join/mgps/dto/GiftPackageDataOperationBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment$e;->c:Lcom/join/mgps/fragment/GameOlGiftPackageFragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->V(Lcom/join/mgps/fragment/GameOlGiftPackageFragment;)Landroid/app/Activity;

    move-result-object p1

    const-string v0, "clipboard"

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/ClipboardManager;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment$e;->b:Lcom/join/mgps/dto/GiftPackageDataOperationBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GiftPackageDataOperationBean;->getGift_info()Lcom/join/mgps/dto/GiftPackageDataInfoBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GiftPackageDataInfoBean;->getGift_package_code()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment$e;->c:Lcom/join/mgps/fragment/GameOlGiftPackageFragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->V(Lcom/join/mgps/fragment/GameOlGiftPackageFragment;)Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment$e;->b:Lcom/join/mgps/dto/GiftPackageDataOperationBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GiftPackageDataOperationBean;->getGift_info()Lcom/join/mgps/dto/GiftPackageDataInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GiftPackageDataInfoBean;->getGift_package_code()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v1, "\u5df2\u590d\u5236\u5230\u526a\u8d34\u677f"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method
