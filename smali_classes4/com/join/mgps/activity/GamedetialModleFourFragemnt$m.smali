.class Lcom/join/mgps/activity/GamedetialModleFourFragemnt$m;
.super Ljava/lang/Object;
.source "GamedetialModleFourFragemnt.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->v0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GamedetialModleFourFragemnt;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt$m;->b:Lcom/join/mgps/activity/GamedetialModleFourFragemnt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt$m;->b:Lcom/join/mgps/activity/GamedetialModleFourFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->v1:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method
