.class public final Lcom/join/kotlin/presenter/FindModlePrensenter$loadFindChoiceData$1;
.super Ljava/lang/Object;
.source "FindModlePrensenter.kt"

# interfaces
.implements Lretrofit2/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/presenter/FindModlePrensenter;->loadFindChoiceData(Landroid/content/Context;Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;)V
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
        "Lcom/join/kotlin/ui/findgame/data/FindChoiceResultData;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic $arg:Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

.field final synthetic this$0:Lcom/join/kotlin/presenter/FindModlePrensenter;


# direct methods
.method constructor <init>(Lcom/join/kotlin/presenter/FindModlePrensenter;Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/presenter/FindModlePrensenter$loadFindChoiceData$1;->this$0:Lcom/join/kotlin/presenter/FindModlePrensenter;

    iput-object p2, p0, Lcom/join/kotlin/presenter/FindModlePrensenter$loadFindChoiceData$1;->$arg:Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

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
            "Lcom/join/kotlin/ui/findgame/data/FindChoiceResultData;",
            ">;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "t"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lcom/join/kotlin/presenter/FindModlePrensenter$loadFindChoiceData$1;->this$0:Lcom/join/kotlin/presenter/FindModlePrensenter;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/join/kotlin/presenter/FindModlePrensenter;->setLoading(Z)V

    .line 2
    iget-object p1, p0, Lcom/join/kotlin/presenter/FindModlePrensenter$loadFindChoiceData$1;->this$0:Lcom/join/kotlin/presenter/FindModlePrensenter;

    invoke-virtual {p1}, Lcom/join/kotlin/presenter/BasePresenter;->getMView()Lcom/psk/kotlin/base/presenter/view/BaseView;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/presenter/view/FindHomeView;

    const-string/jumbo v0, "\u83b7\u53d6\u6570\u636e\u5931\u8d25"

    invoke-interface {p1, v0}, Lcom/psk/kotlin/base/presenter/view/BaseView;->onError(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 2
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
            "Lcom/join/kotlin/ui/findgame/data/FindChoiceResultData;",
            ">;>;",
            "Lretrofit2/Response<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/kotlin/ui/findgame/data/FindChoiceResultData;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "response"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lcom/join/kotlin/presenter/FindModlePrensenter$loadFindChoiceData$1;->this$0:Lcom/join/kotlin/presenter/FindModlePrensenter;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/join/kotlin/presenter/FindModlePrensenter;->setLoading(Z)V

    .line 2
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result p1

    const/16 v0, 0xc8

    if-ne p1, v0, :cond_0

    .line 4
    iget-object p1, p0, Lcom/join/kotlin/presenter/FindModlePrensenter$loadFindChoiceData$1;->this$0:Lcom/join/kotlin/presenter/FindModlePrensenter;

    invoke-virtual {p1}, Lcom/join/kotlin/presenter/BasePresenter;->getMView()Lcom/psk/kotlin/base/presenter/view/BaseView;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/presenter/view/FindHomeView;

    invoke-interface {p1}, Lcom/psk/kotlin/base/presenter/view/BaseView;->hidLoading()V

    .line 5
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/join/kotlin/presenter/FindModlePrensenter$loadFindChoiceData$1;->this$0:Lcom/join/kotlin/presenter/FindModlePrensenter;

    invoke-virtual {p1}, Lcom/join/kotlin/presenter/BasePresenter;->getMView()Lcom/psk/kotlin/base/presenter/view/BaseView;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/presenter/view/FindHomeView;

    iget-object v0, p0, Lcom/join/kotlin/presenter/FindModlePrensenter$loadFindChoiceData$1;->$arg:Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    invoke-virtual {v0}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->getPage()I

    move-result v0

    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p2, Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p2

    const-string v1, "response.body()!!.data"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/join/kotlin/ui/findgame/data/FindChoiceResultData;

    invoke-interface {p1, v0, p2}, Lcom/join/kotlin/presenter/view/FindHomeView;->onLoadDataSuccess(ILcom/join/kotlin/ui/findgame/data/FindChoiceResultData;)V

    return-void

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/join/kotlin/presenter/FindModlePrensenter$loadFindChoiceData$1;->this$0:Lcom/join/kotlin/presenter/FindModlePrensenter;

    invoke-virtual {p1}, Lcom/join/kotlin/presenter/BasePresenter;->getMView()Lcom/psk/kotlin/base/presenter/view/BaseView;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/presenter/view/FindHomeView;

    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p2, Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string v0, "response.body()!!.message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lcom/psk/kotlin/base/presenter/view/BaseView;->onError(Ljava/lang/String;)V

    return-void

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/join/kotlin/presenter/FindModlePrensenter$loadFindChoiceData$1;->this$0:Lcom/join/kotlin/presenter/FindModlePrensenter;

    invoke-virtual {p1}, Lcom/join/kotlin/presenter/BasePresenter;->getMView()Lcom/psk/kotlin/base/presenter/view/BaseView;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/presenter/view/FindHomeView;

    const-string/jumbo p2, "\u83b7\u53d6\u6570\u636e\u5931\u8d25"

    invoke-interface {p1, p2}, Lcom/psk/kotlin/base/presenter/view/BaseView;->onError(Ljava/lang/String;)V

    return-void
.end method
