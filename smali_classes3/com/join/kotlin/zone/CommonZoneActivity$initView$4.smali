.class public final Lcom/join/kotlin/zone/CommonZoneActivity$initView$4;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "CommonZoneActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/zone/CommonZoneActivity;->initView(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/zone/CommonZoneActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/zone/CommonZoneActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/zone/CommonZoneActivity$initView$4;->this$0:Lcom/join/kotlin/zone/CommonZoneActivity;

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    if-nez p2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/kotlin/zone/CommonZoneActivity$initView$4;->this$0:Lcom/join/kotlin/zone/CommonZoneActivity;

    invoke-virtual {p1}, Lcom/join/kotlin/zone/CommonZoneActivity;->getVideoHelper()Lcom/join/android/app/component/video/g;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/join/android/app/component/video/g;->g(I)V

    :cond_0
    return-void
.end method
