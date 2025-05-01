.class public final Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$onAttachedToWindow$1;
.super Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener;
.source "XQuickRecyclerView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->onAttachedToWindow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;


# direct methods
.method constructor <init>(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$onAttachedToWindow$1;->this$0:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    .line 1
    invoke-direct {p0}, Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onStateChanged(Lcom/google/android/material/appbar/AppBarLayout;Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;)V
    .locals 1
    .param p1    # Lcom/google/android/material/appbar/AppBarLayout;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "appBarLayout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "state"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$onAttachedToWindow$1;->this$0:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-static {p1, p2}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->access$setAppbarState$p(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;)V

    return-void
.end method
