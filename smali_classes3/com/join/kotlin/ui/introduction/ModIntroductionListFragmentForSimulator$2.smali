.class Lcom/join/kotlin/ui/introduction/ModIntroductionListFragmentForSimulator$2;
.super Ljava/lang/Object;
.source "ModIntroductionListFragmentForSimulator.java"

# interfaces
.implements Lcom/join/mgps/base/BaseQuickAdapter$l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/introduction/ModIntroductionListFragmentForSimulator;->aftervidew()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/introduction/ModIntroductionListFragmentForSimulator;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/introduction/ModIntroductionListFragmentForSimulator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/introduction/ModIntroductionListFragmentForSimulator$2;->this$0:Lcom/join/kotlin/ui/introduction/ModIntroductionListFragmentForSimulator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMoreRequested()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/introduction/ModIntroductionListFragmentForSimulator$2;->this$0:Lcom/join/kotlin/ui/introduction/ModIntroductionListFragmentForSimulator;

    invoke-static {v0}, Lcom/join/kotlin/ui/introduction/ModIntroductionListFragmentForSimulator;->access$008(Lcom/join/kotlin/ui/introduction/ModIntroductionListFragmentForSimulator;)I

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/ui/introduction/ModIntroductionListFragmentForSimulator$2;->this$0:Lcom/join/kotlin/ui/introduction/ModIntroductionListFragmentForSimulator;

    invoke-static {v0}, Lcom/join/kotlin/ui/introduction/ModIntroductionListFragmentForSimulator;->access$000(Lcom/join/kotlin/ui/introduction/ModIntroductionListFragmentForSimulator;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/introduction/ModIntroductionListFragmentForSimulator;->loadData(I)V

    return-void
.end method
