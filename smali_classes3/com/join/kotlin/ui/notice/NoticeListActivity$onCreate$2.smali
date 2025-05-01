.class public final Lcom/join/kotlin/ui/notice/NoticeListActivity$onCreate$2;
.super Ljava/lang/Object;
.source "NoticeListActivity.kt"

# interfaces
.implements Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/notice/NoticeListActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/notice/NoticeListActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/notice/NoticeListActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity$onCreate$2;->this$0:Lcom/join/kotlin/ui/notice/NoticeListActivity;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/notice/NoticeListActivity$onCreate$2;->this$0:Lcom/join/kotlin/ui/notice/NoticeListActivity;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/notice/NoticeListActivity;->getPage()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/notice/NoticeListActivity;->loadData(I)V

    return-void
.end method

.method public onRefresh()V
    .locals 0

    return-void
.end method
