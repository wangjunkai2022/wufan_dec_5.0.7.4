.class public final Lcom/psk/eventmodule/net/StatCore$Companion;
.super Ljava/lang/Object;
.source "StatCore.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/psk/eventmodule/net/StatCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/psk/eventmodule/net/StatCore$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getInstance(Landroid/content/Context;)Lcom/psk/eventmodule/net/StatCore;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lcom/psk/eventmodule/net/StatCore;->access$getInstance$cp()Lcom/psk/eventmodule/net/StatCore;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/psk/frame/roomlibrary/volcano/a;->a:Lcom/psk/frame/roomlibrary/volcano/a;

    invoke-virtual {v0, p1}, Lcom/psk/frame/roomlibrary/volcano/a;->a(Landroid/content/Context;)V

    .line 3
    new-instance v0, Lcom/psk/eventmodule/net/StatCore;

    invoke-direct {v0}, Lcom/psk/eventmodule/net/StatCore;-><init>()V

    invoke-static {v0}, Lcom/psk/eventmodule/net/StatCore;->access$setInstance$cp(Lcom/psk/eventmodule/net/StatCore;)V

    .line 4
    :cond_0
    invoke-static {}, Lcom/psk/eventmodule/net/StatCore;->access$getContext$cp()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_1

    .line 5
    invoke-static {p1}, Lcom/psk/eventmodule/net/StatCore;->access$setContext$cp(Landroid/content/Context;)V

    .line 6
    :cond_1
    invoke-static {}, Lcom/psk/eventmodule/net/StatCore;->access$getInstance$cp()Lcom/psk/eventmodule/net/StatCore;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1
.end method
