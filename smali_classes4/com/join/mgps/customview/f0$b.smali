.class Lcom/join/mgps/customview/f0$b;
.super Ljava/lang/Object;
.source "SpecialFilterBottomPopupWindow.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/f0;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/f0;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/f0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/f0$b;->b:Lcom/join/mgps/customview/f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/join/mgps/customview/f0$b;->b:Lcom/join/mgps/customview/f0;

    iget-object v0, p1, Lcom/join/mgps/customview/f0;->h:Lcom/join/mgps/customview/f0$f;

    iget-object p1, p1, Lcom/join/mgps/customview/f0;->b:Lcom/zhy/view/flowlayout/TagFlowSpecialLayout;

    invoke-virtual {p1}, Lcom/zhy/view/flowlayout/TagFlowSpecialLayout;->getSelectedItem()Lcom/join/mgps/activity/vipzone/bean/SpecialTag;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/customview/f0$b;->b:Lcom/join/mgps/customview/f0;

    iget-object v1, v1, Lcom/join/mgps/customview/f0;->c:Lcom/zhy/view/flowlayout/TagFlowSpecialLayout;

    invoke-virtual {v1}, Lcom/zhy/view/flowlayout/TagFlowSpecialLayout;->getSelectedItem()Lcom/join/mgps/activity/vipzone/bean/SpecialTag;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/customview/f0$b;->b:Lcom/join/mgps/customview/f0;

    iget-object v2, v2, Lcom/join/mgps/customview/f0;->d:Lcom/zhy/view/flowlayout/TagFlowSpecialLayout;

    invoke-virtual {v2}, Lcom/zhy/view/flowlayout/TagFlowSpecialLayout;->getSelectedItem()Lcom/join/mgps/activity/vipzone/bean/SpecialTag;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lcom/join/mgps/customview/f0$f;->onfinifilter(Lcom/join/mgps/activity/vipzone/bean/SpecialTag;Lcom/join/mgps/activity/vipzone/bean/SpecialTag;Lcom/join/mgps/activity/vipzone/bean/SpecialTag;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/customview/f0$b;->b:Lcom/join/mgps/customview/f0;

    invoke-virtual {p1}, Lcom/join/mgps/customview/p;->dismiss()V

    return-void
.end method
