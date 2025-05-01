.class public final Lcom/xinzhu/overmind/shared/OMProxyActivity$onCreate$1;
.super Landroid/content/BroadcastReceiver;
.source "OMProxyActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xinzhu/overmind/shared/OMProxyActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/xinzhu/overmind/shared/OMProxyActivity;


# direct methods
.method constructor <init>(Lcom/xinzhu/overmind/shared/OMProxyActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/xinzhu/overmind/shared/OMProxyActivity$onCreate$1;->a:Lcom/xinzhu/overmind/shared/OMProxyActivity;

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p2, :cond_0

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    sget-object p2, Lcom/xinzhu/overmind/shared/OMProxyActivity;->e:Lcom/xinzhu/overmind/shared/OMProxyActivity$a;

    invoke-virtual {p2}, Lcom/xinzhu/overmind/shared/OMProxyActivity$a;->b()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/xinzhu/overmind/shared/OMProxyActivity$onCreate$1;->a:Lcom/xinzhu/overmind/shared/OMProxyActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_1
    return-void
.end method
