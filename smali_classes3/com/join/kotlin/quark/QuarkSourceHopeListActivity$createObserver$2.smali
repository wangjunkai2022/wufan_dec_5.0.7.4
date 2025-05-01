.class public final Lcom/join/kotlin/quark/QuarkSourceHopeListActivity$createObserver$2;
.super Ljava/lang/Object;
.source "QuarkSourceHopeListActivity.kt"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->createObserver()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity$createObserver$2;->this$0:Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;

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

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity$createObserver$2;->this$0:Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;

    invoke-static {v0, p1}, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->access$setStatus(Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;Lcom/google/android/material/tabs/TabLayout$Tab;)V

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
    iget-object v0, p0, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity$createObserver$2;->this$0:Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;

    invoke-static {v0, p1}, Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;->access$setStatus(Lcom/join/kotlin/quark/QuarkSourceHopeListActivity;Lcom/google/android/material/tabs/TabLayout$Tab;)V

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

    return-void
.end method
