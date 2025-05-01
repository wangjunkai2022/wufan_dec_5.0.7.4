.class public final Lcom/join/kotlin/base/widget/loadCallBack/LoadingCallback;
.super Lcom/kingja/loadsir/callback/Callback;
.source "LoadingCallback.kt"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kingja/loadsir/callback/Callback;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreateView()I
    .locals 1

    const v0, 0x7f0c0500

    return v0
.end method

.method protected onReloadEvent(Landroid/content/Context;Landroid/view/View;)Z
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 p1, 0x1

    return p1
.end method
