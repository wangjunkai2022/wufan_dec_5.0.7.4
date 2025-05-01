.class public final Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1$1$7;
.super Ljava/lang/Object;
.source "SourceShareActivity.kt"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1;->invoke(Lcom/join/kotlin/quark/model/bean/SourceTabListBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/quark/SourceShareActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/quark/SourceShareActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1$1$7;->this$0:Lcom/join/kotlin/quark/SourceShareActivity;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTabReselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 1
    .param p1    # Lcom/google/android/material/tabs/TabLayout$Tab;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTabSelected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 1
    .param p1    # Lcom/google/android/material/tabs/TabLayout$Tab;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1$1$7;->this$0:Lcom/join/kotlin/quark/SourceShareActivity;

    invoke-static {v0, p1}, Lcom/join/kotlin/quark/SourceShareActivity;->access$setStatus(Lcom/join/kotlin/quark/SourceShareActivity;Lcom/google/android/material/tabs/TabLayout$Tab;)V

    return-void
.end method

.method public onTabUnselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 1
    .param p1    # Lcom/google/android/material/tabs/TabLayout$Tab;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/SourceShareActivity$createObserver$1$1$1$1$7;->this$0:Lcom/join/kotlin/quark/SourceShareActivity;

    invoke-static {v0, p1}, Lcom/join/kotlin/quark/SourceShareActivity;->access$setStatus(Lcom/join/kotlin/quark/SourceShareActivity;Lcom/google/android/material/tabs/TabLayout$Tab;)V

    return-void
.end method
