.class Lcom/join/mgps/customview/MainLabelHeaderView$a;
.super Ljava/lang/Object;
.source "MainLabelHeaderView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/MainLabelHeaderView;->onFinishInflate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/MainLabelHeaderView;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/MainLabelHeaderView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/MainLabelHeaderView$a;->b:Lcom/join/mgps/customview/MainLabelHeaderView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/customview/MainLabelHeaderView$a;->b:Lcom/join/mgps/customview/MainLabelHeaderView;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/label/MainLabelActivity;

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/activity/label/MainLabelActivity;->v0()V

    return-void
.end method
