.class public final Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity$initView$24;
.super Ljava/lang/Object;
.source "CategoryDetailListActivity.kt"

# interfaces
.implements Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$OnSelectedTabListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity$initView$24;->this$0:Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSelected(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity$initView$24;->this$0:Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getTabType()Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->setId(I)V

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity$initView$24;->this$0:Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;

    invoke-static {v0, p1}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->access$showTypeList(Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;I)V

    return-void
.end method
