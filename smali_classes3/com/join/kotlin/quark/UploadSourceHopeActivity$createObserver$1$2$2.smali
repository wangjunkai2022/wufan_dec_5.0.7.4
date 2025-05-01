.class final Lcom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$2$2;
.super Lkotlin/jvm/internal/Lambda;
.source "UploadSourceHopeActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$2;->invoke(Lcom/join/kotlin/base/state/ResultState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/kotlin/base/net/AppException;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$2$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$2$2;

    invoke-direct {v0}, Lcom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$2$2;-><init>()V

    sput-object v0, Lcom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$2$2;->INSTANCE:Lcom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$2$2;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/base/net/AppException;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$2$2;->invoke(Lcom/join/kotlin/base/net/AppException;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/kotlin/base/net/AppException;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/base/net/AppException;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/join/kotlin/base/net/AppException;->getErrorMsg()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;)V

    return-void
.end method
