.class Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView$d;
.super Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener;
.source "XQuickRecyclerView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->onAttachedToWindow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;


# direct methods
.method constructor <init>(Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView$d;->a:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-direct {p0}, Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onStateChanged(Lcom/google/android/material/appbar/AppBarLayout;Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView$d;->a:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-static {p1, p2}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->h(Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;)Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;

    return-void
.end method
