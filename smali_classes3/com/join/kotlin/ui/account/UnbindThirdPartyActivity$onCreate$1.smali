.class final Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity$onCreate$1;
.super Lkotlin/jvm/internal/Lambda;
.source "UnbindThirdPartyActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity$onCreate$1;->this$0:Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity$onCreate$1;->invoke(Ljava/lang/Integer;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Integer;)V
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity$onCreate$1;->this$0:Lcom/join/kotlin/ui/account/UnbindThirdPartyActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_1
    :goto_0
    return-void
.end method
