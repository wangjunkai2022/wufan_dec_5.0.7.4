.class final Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle$receiveStart$1;
.super Lkotlin/jvm/internal/Lambda;
.source "BaseHasDownloadActivityViewModle.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;->receiveStart(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/mgps/business/CollectionBeanSubBusiness;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $downloadTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field final synthetic this$0:Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle$receiveStart$1;->this$0:Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;

    iput-object p2, p0, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle$receiveStart$1;->$downloadTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle$receiveStart$1;->invoke(Lcom/join/mgps/business/CollectionBeanSubBusiness;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/mgps/business/CollectionBeanSubBusiness;)V
    .locals 2
    .param p1    # Lcom/join/mgps/business/CollectionBeanSubBusiness;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle$receiveStart$1;->this$0:Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;

    iget-object v1, p0, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle$receiveStart$1;->$downloadTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, p1, v1}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;->access$updateDowStateListFinal(Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;Lcom/join/mgps/business/CollectionBeanSubBusiness;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method
