.class Lcom/join/mgps/customview/XListView2$c;
.super Ljava/lang/Object;
.source "XListView2.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/XListView2;->setPullLoadEnable(Lcom/join/mgps/customview/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/XListView2;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/XListView2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/XListView2$c;->b:Lcom/join/mgps/customview/XListView2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/customview/XListView2$c;->b:Lcom/join/mgps/customview/XListView2;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/join/mgps/customview/XListView2;->p:Z

    .line 2
    iget-object p1, p1, Lcom/join/mgps/customview/XListView2;->n:Lcom/join/mgps/customview/XListViewFooter;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/XListViewFooter;->setState(I)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/customview/XListView2$c;->b:Lcom/join/mgps/customview/XListView2;

    iget-object p1, p1, Lcom/join/mgps/customview/XListView2;->f:Lcom/join/mgps/customview/f;

    if-eqz p1, :cond_0

    .line 4
    invoke-interface {p1}, Lcom/join/mgps/customview/f;->onLoadMore()V

    :cond_0
    return-void
.end method
