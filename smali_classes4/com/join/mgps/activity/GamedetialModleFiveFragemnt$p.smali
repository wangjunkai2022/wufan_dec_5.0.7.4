.class Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$p;
.super Ljava/lang/Object;
.source "GamedetialModleFiveFragemnt.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->U()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$p;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$p;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->O:Lcom/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {p1}, Lcom/flipboard/bottomsheet/BottomSheetLayout;->r()V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$p;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string p3, "\u91d1\u624b\u6307"

    invoke-virtual {p1, p2, p3}, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->u0(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
