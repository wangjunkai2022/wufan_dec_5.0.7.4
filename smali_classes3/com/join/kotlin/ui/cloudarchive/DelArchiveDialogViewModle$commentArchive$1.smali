.class public final Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle$commentArchive$1;
.super Ljava/lang/Object;
.source "DelArchiveDialogViewModle.kt"

# interfaces
.implements Lretrofit2/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;->commentArchive(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit2/Callback<",
        "Lcom/join/mgps/dto/ResponseModel<",
        "*>;>;"
    }
.end annotation


# instance fields
.field final synthetic $archiveData:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $type:Ljava/lang/String;

.field final synthetic this$0:Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle$commentArchive$1;->this$0:Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;

    iput-object p2, p0, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle$commentArchive$1;->$type:Ljava/lang/String;

    iput-object p3, p0, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle$commentArchive$1;->$archiveData:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p4, p0, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle$commentArchive$1;->$context:Landroid/content/Context;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Lretrofit2/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "*>;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "t"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle$commentArchive$1;->this$0:Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;->isCommitLoding()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 2
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle$commentArchive$1;->$context:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string/jumbo p2, "\u8bc4\u4ef7\u5f02\u5e38\uff01"

    .line 3
    invoke-virtual {p1, p2}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 3
    .param p1    # Lretrofit2/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lretrofit2/Response;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "*>;>;",
            "Lretrofit2/Response<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "*>;>;)V"
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "response"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle$commentArchive$1;->this$0:Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;->isCommitLoding()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ResponseModel;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result p1

    const/16 v2, 0xc8

    if-ne p1, v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    .line 3
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle$commentArchive$1;->this$0:Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;->getListenr()Lcom/join/kotlin/ui/cloudarchive/dialog/CommentDialogListener;

    move-result-object p1

    invoke-interface {p1, v1}, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentDialogListener;->onSendMessageFinish(I)V

    .line 4
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle$commentArchive$1;->$type:Ljava/lang/String;

    const-string p2, "LIKE"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/16 p2, 0xa

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle$commentArchive$1;->$archiveData:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p1, v1}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setIsLike(I)V

    .line 6
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle$commentArchive$1;->$archiveData:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    check-cast p1, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getLikeCount()I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {p1, v2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setLikeCount(I)V

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getLikeCount()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setLikeCount(I)V

    .line 7
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object p1

    .line 8
    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveDownEvent;

    .line 9
    iget-object v1, p0, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle$commentArchive$1;->$archiveData:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    .line 10
    invoke-direct {v0, p2, v1}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveDownEvent;-><init>(ILcom/join/kotlin/ui/cloudarchive/data/ArchiveData;)V

    .line 11
    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/d0;->c(Ljava/lang/Object;)V

    goto :goto_2

    .line 12
    :cond_1
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle$commentArchive$1;->$type:Ljava/lang/String;

    const-string v0, "NEGATIVE"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 13
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle$commentArchive$1;->$archiveData:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p1, v1}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setIsUnLike(I)V

    .line 14
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle$commentArchive$1;->$archiveData:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    check-cast p1, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getNegativeCount()I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {p1, v2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setNegativeCount(I)V

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getNegativeCount()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setNegativeCount(I)V

    .line 15
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object p1

    .line 16
    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveDownEvent;

    .line 17
    iget-object v1, p0, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle$commentArchive$1;->$archiveData:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    .line 18
    invoke-direct {v0, p2, v1}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveDownEvent;-><init>(ILcom/join/kotlin/ui/cloudarchive/data/ArchiveData;)V

    .line 19
    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/d0;->c(Ljava/lang/Object;)V

    goto :goto_2

    .line 20
    :cond_2
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle$commentArchive$1;->this$0:Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;->getListenr()Lcom/join/kotlin/ui/cloudarchive/dialog/CommentDialogListener;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentDialogListener;->onSendMessageFinish(I)V

    .line 21
    iget-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle$commentArchive$1;->$context:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    .line 22
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/ResponseModel;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getMessage()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    :goto_1
    invoke-virtual {p1, p2}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    :cond_4
    :goto_2
    return-void
.end method
