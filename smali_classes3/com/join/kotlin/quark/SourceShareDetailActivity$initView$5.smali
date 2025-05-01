.class public final Lcom/join/kotlin/quark/SourceShareDetailActivity$initView$5;
.super Landroid/webkit/WebViewClient;
.source "SourceShareDetailActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/SourceShareDetailActivity;->initView(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/quark/SourceShareDetailActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/quark/SourceShareDetailActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity$initView$5;->this$0:Lcom/join/kotlin/quark/SourceShareDetailActivity;

    .line 1
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0
    .param p1    # Landroid/webkit/WebView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity$initView$5;->this$0:Lcom/join/kotlin/quark/SourceShareDetailActivity;

    invoke-static {p1}, Lcom/join/kotlin/quark/SourceShareDetailActivity;->access$getLoadSir$p(Lcom/join/kotlin/quark/SourceShareDetailActivity;)Lcom/kingja/loadsir/core/b;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "loadSir"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p1}, Lcom/kingja/loadsir/core/b;->h()V

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 0
    .param p1    # Landroid/webkit/WebView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/webkit/WebResourceRequest;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/webkit/WebResourceError;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    .line 2
    iget-object p1, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity$initView$5;->this$0:Lcom/join/kotlin/quark/SourceShareDetailActivity;

    invoke-static {p1}, Lcom/join/kotlin/quark/SourceShareDetailActivity;->access$getLoadSir$p(Lcom/join/kotlin/quark/SourceShareDetailActivity;)Lcom/kingja/loadsir/core/b;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    const-string p1, "loadSir"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, p2

    :cond_0
    const/4 p3, 0x1

    invoke-static {p1, p2, p3, p2}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->showError$default(Lcom/kingja/loadsir/core/b;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method
