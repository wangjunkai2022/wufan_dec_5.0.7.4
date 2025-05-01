.class Lcom/join/mgps/customview/ClouldItemView$e;
.super Ljava/lang/Object;
.source "ClouldItemView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/ClouldItemView;->setPoPoWindow2(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/PopupWindow;

.field final synthetic c:Lcom/join/mgps/customview/ClouldItemView;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/ClouldItemView;Landroid/widget/PopupWindow;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/ClouldItemView$e;->c:Lcom/join/mgps/customview/ClouldItemView;

    iput-object p2, p0, Lcom/join/mgps/customview/ClouldItemView$e;->b:Landroid/widget/PopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/join/mgps/customview/ClouldItemView$e;->c:Lcom/join/mgps/customview/ClouldItemView;

    iget-object v0, p1, Lcom/join/mgps/customview/ClouldItemView;->s:Lcom/join/mgps/listener/c;

    iget-object p1, p1, Lcom/join/mgps/customview/ClouldItemView;->o:Lcom/join/mgps/dto/CloudListDataBean;

    const/4 v1, 0x2

    invoke-interface {v0, p1, v1}, Lcom/join/mgps/listener/c;->N(Lcom/join/mgps/dto/CloudListDataBean;I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/customview/ClouldItemView$e;->b:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method
